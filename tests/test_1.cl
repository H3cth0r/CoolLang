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
}
