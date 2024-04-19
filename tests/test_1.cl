class Person {
  + inmutable string username;
  + string name;
  + float age = 23.1;
  - string password;
  
  Person(string username, string name, float age, string password){
    ->username = username;
    ->name = name;
    ->age = age;
    ->password = password;
  }
  string getName(){
    <- ->name;
  }
  float squaredAge(){
    <- ->age * ->age;
  }
  float ageByTwo(){
    <- 2 * ->age;
  }
}

main{
  string nameOne = "hector";
  instance person#personn = person("h3cth0r", nameOne, 34, "micontra");  
  integer digit = 1;
  for(i = 0; i>5; i = i + 1){
    digit = digit + 1; 
  }
  string result_sum = "";
  while(i < 10){
    string some_char = m;
    result_sum = result_sum + some_char;
  }
}
