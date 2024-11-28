import requests

def chat_with_gpt(message):
    url = "https://chatgpt-42.p.rapidapi.com/conversationgpt4-2"
    
    # Set up the payload
    payload = {
        "messages": [
            {
                "role": "user",
                "content": message
            }
        ],
        "system_prompt": "",
        "temperature": 0.9,
        "top_k": 5,
        "top_p": 0.9,
        "max_tokens": 256,
        "web_access": False
    }
    
    # Set up the headers
    headers = {
        "x-rapidapi-key": "write rapid gpt api here",
        "x-rapidapi-host": "chatgpt-42.p.rapidapi.com",
        "Content-Type": "application/json"
    }

    try:
        # Send POST request
        response = requests.post(url, json=payload, headers=headers)

        # Check if the response was successful
        response.raise_for_status()  # Raises an error for 4xx/5xx status codes

        # Parse the response JSON
        response_data = response.json()

        # Extract the relevant content from the response
        if response_data.get("status"):
            answer = response_data.get("result", "No answer found.") 
        else:
            answer = "Error: API did not return a successful status."

        return answer

    except requests.exceptions.HTTPError as http_err:
        return f"HTTP error occurred: {http_err}"
    except Exception as err:
        return f"An error occurred: {err}"

def main():
    # Read questions from input file
    input_file_path = 'test.txt'  # File containing questions
    output_file_path = 'reply.txt'  # File to save responses

    # Open the input file and output file with UTF-8 encoding
    with open(input_file_path, 'r', encoding='utf-8') as input_file, open(output_file_path, 'w', encoding='utf-8') as output_file:
        for line in input_file:
            question = line.strip()  # Remove any leading/trailing whitespace
            if question:  # Check if the line is not empty
                print(f"You: {question}")  # Print the question for reference
                response = chat_with_gpt(question)
                
                # Write only the response text to the output file without "Response: "
                output_file.write(f"{response}\n")  # Only write the response text

if __name__ == '__main__':
    main()
