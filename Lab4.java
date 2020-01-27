public class Lab4
{
  public static void turnRight()
  {
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.turnLeft();
  }
  
  public static void turnAround()
  {
    Robot.turnLeft();
    Robot.turnLeft();
  }

  public static void backUp()
  {
    turnAround();
    Robot.move();
    turnAround();
  }
  
  public static void completeBars()
  {
    //insert instructions below
    start();
  }
  public static void start()
  {
      Robot.turnLeft(); if (Robot.onDark()) {turnRight();Robot.move();
      Robot.turnLeft();}
      else {if (onLight()) {keepgoing();}}
      while (onLight()) {keepgoing();}
  }
  public static void keepgoing()
  {
       while (onLight()) {Robot.makeDark();Robot.move();}
       if (Robot.onDark()) {turnAround();backdown();}
  }
  public static void backdown()
  {
       while(Robot.frontIsClear()) {Robot.move();}
       if (frontnotclear()) {Robot.turnLeft(); if (Robot.frontIsClear())
       {Robot.move();Robot.turnLeft();}
       if (Robot.frontIsClear()) {keepgoing();}}
  }
  public static boolean onLight()
  {
      if (Robot.onDark()) {return false;}
      else {return true;}
  }
  public static boolean frontnotclear()
  {
      if (Robot.frontIsClear()) {return false;} else {return true;}
  }
  public static void testCompleteBars1()
  {
    Robot.load("bars1.txt");
    Robot.setDelay(0.025);
    completeBars();
  }
  
  public static void testCompleteBars2()
  {
    Robot.load("bars2.txt");
    Robot.setDelay(0.025);
    completeBars();
  }
  
  public static void combinePiles()
  {
    //insert instructions below
    starting(); 
  }
  public static void starting()
  {
      while (Robot.onDark()) {if (Robot.frontIsClear()) {Robot.move();} 
      else {if (Robot.onDark()){Robot.makeLight();}
      if (Robot.frontIsClear()) {turnAround();Robot.move();Robot.makeLight();
      while (Robot.frontIsClear()) {Robot.move();}
      Robot.turnLeft();Robot.move();Robot.turnLeft();ending();}}
    }
      if (Robot.onDark()){Robot.makeLight();}
      turnAround();Robot.move();Robot.makeLight();
      while (Robot.frontIsClear()) {Robot.move();}
      Robot.turnLeft();Robot.move();Robot.turnLeft();ending();
  }
  public static void ending()
  {
      while (Robot.onDark()) {Robot.move();} 
      Robot.makeDark();turnAround();
      while (Robot.frontIsClear()) {Robot.move();}
      turnRight();Robot.move();turnRight();
      if (Robot.onDark()) {starting();} else {}
  }

  public static void testCombinePiles1()
  {
    Robot.load("piles1.txt");
    Robot.setDelay(0.025);
    combinePiles();
  }
  
  public static void testCombinePiles2()
  {
    Robot.load("piles2.txt");
    Robot.setDelay(0.025);
    combinePiles();
  }
  
  public static void connectDots()
  {
    //insert instructions below
    Robot.move();Robot.makeDark();Robot.move();
    while (beyond()==true) {search();}
  }
  public static void search()
  {
      Robot.move();Robot.move(); if (Robot.onDark()) 
      {turnAround();Robot.move();Robot.makeDark();turnAround();Robot.move();}
      else {turnAround();Robot.move();Robot.move();Robot.turnLeft();
            Robot.move();Robot.move();
        if (Robot.onDark()) 
      {turnAround();Robot.move();Robot.makeDark();turnAround();Robot.move();} 
      else {turnAround();Robot.move();Robot.move();Robot.move();Robot.move();
            if (Robot.onDark()) {turnAround();Robot.move();Robot.makeDark();
                                 turnAround();Robot.move();} 
            else {turnAround();Robot.move();Robot.move();Robot.turnLeft();} } }
      
  }
  public static boolean beyond(){if(Robot.onDark()) {return true;} else {return true;}} 
  
  public static void testConnectDots1()
  {
    Robot.load("connect1.txt");
    Robot.setDelay(0.025);
    connectDots();
  }
  
  public static void testConnectDots2()
  {
    Robot.load("connect2.txt");
    Robot.setDelay(0.025);
    connectDots();
  }
}