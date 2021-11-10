# Database
username: abull
passowrd: $2a$10$4k4meW48Wuf.Qd4GPN/WNuyzG4FLctcEmuEmJL7tmitE1d3yUBEI.

curl --location --request POST 'https://localhost:8444/login' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "abull",
    "password": "abull"
}'


curl --location --request GET 'https://localhost:8444/api/usuarios' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYnVsbCIsImV4cCI6MTYzNzQyNDA0MH0.NUwpCbZVoW4xAFlNjoujDOQmQ4eZCWa6JHs5BkD4PoLP99SuMLNAY0CyOQD4APCBfj8rEqCuO1mfAbCvxY3j0w'

