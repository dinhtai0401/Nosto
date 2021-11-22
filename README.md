# nosto - simple programming assignment

restful API link on Heroku: https://nosto-number.herokuapp.com/api/v1/big-number/{number}

As as input it will get a number, as an output it should respond with next (bigger) number
composed of the same digits as in input (base 10). If it is not possible to generate such number
respond should be “No answer”.

Example: 
https://nosto-number.herokuapp.com/api/v1/big-number/144 
Response : {"number":"414"}

https://nosto-number.herokuapp.com/api/v1/big-number/444
Response: {"number":"No answer"}