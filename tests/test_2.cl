string makeGreeting(string name){
  string greeting = 'Howdy ' + name;
  return greeting;
}

main {
  string my_name = 'Thor';
  string greeting = makeGreeting(my_name);
  print(greeting);
}
