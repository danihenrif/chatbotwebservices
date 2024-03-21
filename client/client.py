import requests
import json

def main():
    # URL do servidor Spring Boot
    url = 'http://localhost:8080/chatbot'
    
    while True:
        user_input = input("Você:")

        if user_input.lower() == 'exit':
            break
        
        payload = {'request': user_input}
        
        response = requests.get(url, json=payload)
        
        if response.status_code == 200:
            data = response.json()
            print("Chatbot:", data['response'])
        else:
            print("Erro:", response.text)

if __name__ == "__main__":
    main()