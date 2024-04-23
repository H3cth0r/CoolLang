void printAgeByTwo(int age){
  for(int i = 0; i < 10; i = i + 1){
    age = age + 1;
    age = age * 2;
  }
  print(age*2); 
}
int squareAge(int age){
  int squaredAge = age * age;
  return squaredAge;
}

main{
  int myAge = 19;
  if(myAge > 16){
    myAge = myAge + 2;
  }
  printAgeByTwo(myAge);
  float iterator = 24.2;
  while(iterator < 28){
    printAgeByTwo(myAge);
    iterator = iterator + 1;
  }
  int squaredAge = squareAge(myAge);
}
