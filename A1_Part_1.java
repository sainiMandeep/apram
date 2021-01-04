import becker.robots.*;

public class A1_Part_1 extends Object
{
public static void moveRight(Robot r){ 
   r.turnLeft();
   r.turnLeft();
   r.turnLeft();
   
}
public static void moveForward(Robot f){
        f.move();
        f.move();
        f.move();
        f.move();
        f.move();
        f.move();
        f.move();
        f.move();
}
public static void turnAround(Robot a){
   a.turnLeft();
   a.turnLeft();
}

    public static void main(String[] args)
    { 
        City theCity= new City( 11, 5); // 11 means "show me 11 streets - streets 0, 1, ..., 9, 10"
										// 5 means "show me 5 avenues - avenues 0, 1, 2, 3, 4
        Robot karel = new Robot(theCity, 9, 1, Direction.NORTH, 0);
        new Thing(theCity, 1, 1);
        new Thing(theCity, 9, 2);
        
		// the 'backstop' for the robot:
        new Wall(theCity, 9, 1, Direction.SOUTH);

		// First build the west-most pipe
        // The west edge of the west-most pipe:
        new Wall(theCity, 1, 1, Direction.WEST);
        new Wall(theCity, 2, 1, Direction.WEST);
        new Wall(theCity, 3, 1, Direction.WEST);
        new Wall(theCity, 4, 1, Direction.WEST);
        new Wall(theCity, 5, 1, Direction.WEST);
        new Wall(theCity, 6, 1, Direction.WEST);
        new Wall(theCity, 7, 1, Direction.WEST);
        new Wall(theCity, 8, 1, Direction.WEST);
        new Wall(theCity, 9, 1, Direction.WEST);

        // The east edge of the west-most pipe:
        new Wall(theCity, 2, 1, Direction.EAST);
        new Wall(theCity, 3, 1, Direction.EAST);
        new Wall(theCity, 4, 1, Direction.EAST);
        new Wall(theCity, 5, 1, Direction.EAST);
        new Wall(theCity, 6, 1, Direction.EAST);
        new Wall(theCity, 7, 1, Direction.EAST);
        new Wall(theCity, 8, 1, Direction.EAST);
        new Wall(theCity, 9, 1, Direction.EAST);
		
		// the 'cap' at the top
        new Wall(theCity, 1, 1, Direction.NORTH);
        new Wall(theCity, 1, 2, Direction.NORTH);
        new Wall(theCity, 1, 2, Direction.EAST);
		
        // The west edge of the east-most pipe
        new Wall(theCity, 2, 2, Direction.WEST);
        new Wall(theCity, 3, 2, Direction.WEST);
        new Wall(theCity, 4, 2, Direction.WEST);
        new Wall(theCity, 5, 2, Direction.WEST);
        new Wall(theCity, 6, 2, Direction.WEST);
        new Wall(theCity, 7, 2, Direction.WEST);
        new Wall(theCity, 8, 2, Direction.WEST);
        new Wall(theCity, 9, 2, Direction.WEST);

		// The east edge of the east-most pipe
        new Wall(theCity, 1, 2, Direction.EAST);
        new Wall(theCity, 2, 2, Direction.EAST);
        new Wall(theCity, 3, 2, Direction.EAST);
        new Wall(theCity, 4, 2, Direction.EAST);
        new Wall(theCity, 5, 2, Direction.EAST);
        new Wall(theCity, 6, 2, Direction.EAST);
        new Wall(theCity, 7, 2, Direction.EAST);
        new Wall(theCity, 8, 2, Direction.EAST);
        new Wall(theCity, 9, 2, Direction.EAST);


		// that final stopping wall
       new Wall(theCity, 9, 2, Direction.SOUTH);

        /* put your code here*/
        
        
        
        moveForward(karel);
        karel.pickThing();
        moveRight(karel);
        karel.move();
        moveRight(karel);
        moveForward(karel);
        karel.pickThing();
        turnAround(karel);
        moveForward(karel);
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        moveForward(karel);
        turnAround(karel);
        karel.putThing();
        karel.move();
        karel.putThing();
        karel.move();
        

    }
}
