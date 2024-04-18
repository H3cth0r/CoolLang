class Person {
  + inmutable string username;
  + string name;
  + float age = 23.1;
  - string password;
  
  Person(string username, int name, float age, string password){
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
struct Point{
  int id=1;
  float x;
  float y;
  float z;
}

main{
  Point p = Point{
    x = 43.3;
    y = 3.2;
    z = 1;
  }; 
  p.id = 3;
  
}
