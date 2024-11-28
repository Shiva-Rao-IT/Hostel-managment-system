import requests
import time


API_KEY = 'Write assembly api here'

# AssemblyAI API URLs
UPLOAD_URL = 'https://api.assemblyai.com/v2/upload'
TRANSCRIPT_URL = 'https://api.assemblyai.com/v2/transcript'

def upload_audio(file_path):
    headers = {
        'authorization': API_KEY
    }

    with open(file_path, 'rb') as audio_file:
        response = requests.post(UPLOAD_URL, headers=headers, data=audio_file)

    if response.status_code == 200:
        upload_url = response.json()['upload_url']
        print(f'File uploaded successfully. URL: {upload_url}')
        return upload_url
    else:
        print(f'Error uploading file: {response.text}')
        return None

def request_transcription(audio_url):
    headers = {
        'authorization': API_KEY,
        'content-type': 'application/json'
    }
    
    json_data = {
        'audio_url': audio_url
    }

    response = requests.post(TRANSCRIPT_URL, headers=headers, json=json_data)

    if response.status_code == 200:
        transcript_id = response.json()['id']
        print(f'Transcription requested. ID: {transcript_id}')
        return transcript_id
    else:
        print(f'Error requesting transcription: {response.text}')
        return None

def poll_transcription(transcript_id):
    headers = {
        'authorization': API_KEY
    }
    
    while True:
        response = requests.get(f'{TRANSCRIPT_URL}/{transcript_id}', headers=headers)

        if response.status_code == 200:
            status = response.json()['status']
            if status == 'completed':
                print('Transcription completed!')
                return response.json()['text']
            elif status == 'failed':
                print('Transcription failed.')
                print(f'Error message: {response.json().get("error")}')
                return None
            else:
                print(f'Transcription status: {status}')
                time.sleep(5)  # Wait for 5 seconds before polling again
        else:
            print(f'Error checking transcription status: {response.text}')
            return None

def main():
    # Path to your .wav file
    file_path = r'test.wav'
    
    # Step 1: Upload audio file
    audio_url = upload_audio(file_path)
    if audio_url:
        # Step 2: Request transcription
        transcript_id = request_transcription(audio_url)
        if transcript_id:
            # Step 3: Poll for the transcription
            transcription_text = poll_transcription(transcript_id)
            if transcription_text:
                # Step 4: Save the transcription to a text file
                with open(r'test.txt', 'w') as text_file:
                    text_file.write(transcription_text)
                print('Transcription saved to transcription.txt')

if __name__ == '__main__':
    main()
