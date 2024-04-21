class Person {
  string username;
  string name;
  integer id = 2;
  float age = 23.1;
  string password;
  
  Person(string username, string name, float age, string password){
    ->username = username;
    ->name = name;

    for(integer i = 0; i>5; i = i + 1){
      ->name = ->name + "1"; 
    }

    ->age = age;
    ->password = password;
  }
  string getName(){
    if(->name == "jorge"){
      <- "george";
    }else{
      <- ->name;
    }
  }
  float squaredAge(){
    while(age < 10){
      ->age = ->age + 1;
    }
    <- ->age * ->age;
  }
  float ageByTwo(integer number_one, float number_two){
    print(->age);
    <- number_one * ->age;
  }
}

integer sumNumber(integer one, integer two) {
  integer sum = one + two;
  <- sum;
}

main{
  string nameOne = "hector";
  instance person#personn = person("h3cth0r", nameOne, 34, "micontra");  
  string nameTwo = personn->name;
  float agetbtwo = personn->ageByTwo();
  integer digit = 1;
  for(integer i = 0; i>5; i = i + 1){
    digit = digit + 1; 
    print(digit);
  }
  string result_sum = "";
  while(i < 10){
    string some_char = m;
    result_sum = result_sum + some_char;
    if(i==11){
      i = i + 1;
      for(integer j = 0; j>5; j = j + 1){
        digit = digit + 1; 
      }
    }
  }
  integer result = sumNumber(1, 2);
}
