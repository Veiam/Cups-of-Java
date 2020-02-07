import java.util.List;

// Square Sum
class SquareSum {

    // Method to square the sum of three numbers
    double squareSum(double num1, double num2, double num3) {
        return Math.pow(num1, 2) + Math.pow(num2, 2) + Math.pow(num3, 2);
    }

}

// Car class
class Car {

    // Private Fields
    private String carName;
    private String carModel;
    private String carCapacity;

    // Default Constructor
    public Car() {

        this.carName = "";
        this.carModel = "";
        this.carCapacity = "";
    }

    // Parameterized Constructor 1
    public Car(String name, String model) {

        this.carName = name;
        this.carModel = model;
    }

    // Parameterized Constructor 2
    public Car(String name, String model, String capacity) {
        this(name, model);
        this.carCapacity = capacity;
    }

    // Method to return car details
    public String getDetails() {

        return this.carName + ", " + this.carModel + ", " + this.carCapacity;
    }

}

// Student class
class Student {

    // Private fields
    private String name;
    private double mark1;
    private double mark2;

    // Default Constructor
    public Student() {
        name = "";
        mark1 = 0;
        mark2 = 0;
    }

    // Parameterized Constructor
    public Student(String name, double mark1, double mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    // Getter Function
    public double getMarks(int markNumber) {

        if (markNumber == 1)
            return mark1;
        else if (markNumber == 2)
            return mark2;
        return 0;
    }

    public double calcTotal() {
        double totalMarks = mark1 + mark2;
        return totalMarks;
    }
}

// Calculator class
class Calculator {

    // Class fields
    private double num1;
    private double num2;

    // Default Constructor
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Addition Method
    double add() {
        return this.num1 + this.num2;
    }

    // Subtraction Method
    double subtract() {
        return this.num2 - this.num1;
    }

    // Multiplication Method
    double multiply() {
        return this.num1 * this.num2;
    }

    // Divison Method
    double divide() {
        return this.num2 / this.num1;
    }

}

// Rectangle class
class Rectangle {

    // Private Fields
    private int length;
    private int width;

    // Default Constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Parameterized Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    // Method to calculate Area of a rectangle
    public int getArea() {
        return this.length * this.width;
    }

}

// Student Class
class Student2 {
    private String name;
    private String rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

}

// --
// Base Class
class Vehicle {

    // Private Data Members
    private String speed;
    private String model;

    public Vehicle() { // Default Constructor
        speed = "100";
        model = "Tesla";
    }

    // Getter Function
    public String getSpeed() {
        return speed;
    }

    // Getter Function
    public String getModel() {
        return model;
    }

}

// Derived Class
class Car2 extends Vehicle {

    public String name; // Name of a Car

    public Car2() { // Default Constructor
        name = "";
    }

    // This function sets the name of the car
    public void setDetails(String name) { // Setter Function
        this.name = name;
    }

    // This function calls the Base class functions and append the result with input
    public String getDetails(String carName) {
        String details = carName + ", " + getModel() + ", " + getSpeed(); // calling Base Class Function
        return details;
    }
}

// --
// Base Class
class Laptop {

    // Private Data Members
    private String name;

    public Laptop() { // Default Constructor
        name = "";
    }

    public Laptop(String name) { // Default Constructor
        this.name = name;
    }

    // Getter Function
    public String getName() {
        return name;
    }

}

// Derived Class
class Dell extends Laptop {

    public Dell() { // Default Constructor

    }

    public Dell(String name) { // Parametrized Constructor
        super(name);
    }

    public String getDetails() {
        return getName();
    }

    public static void main(String args[]) {
        Dell dell = new Dell("Dell Inspiron");
        System.out.println(dell.getDetails());

    }

}

// --
// Base Class
class Shape {

    // Private Data Members
    private String name;

    public Shape() { // Default Constructor
        name = "Shape";
    }

    // Getter Function
    public String getName() {
        return name;
    }

}

// Derived Class
class XShape extends Shape {

    private String name;

    public XShape(String name) { // Default Constructor
        this.name = name;
    }

    // Overridden Method
    public String getName() {
        return super.getName() + ", " + this.name;
    }

}

// --
// Base Class
class Shape2 {

    // Private Data Members
    private double area;

    public Shape2() { // Default Constructor
        area = 0;
    }

    // Getter Function
    public double getArea() {
        return area;
    }

}

// Derived Class
class Circle extends Shape2 {

    private double radius;

    public Circle(double radius) { // Constructor
        this.radius = radius;
    }

    // Overridden Method the getArea() which returns the area of Rectangle

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}

// --
// Account Class
class Account {

    protected double balance; // protected variable

    public Account(double balance) { // parametrized constructor
        this.balance = balance;
    }

    // member functions
    public void Deposit(double amount) {
    }

    public void Withdraw(double amount) {
    }

    public void printBalance() {
    }

}

// Savings class extended from Account class
class Savings extends Account {

    double interestRate = 0.8; // member variable

    public Savings(int balance) { // parametrized contructor
        super(balance); // calling base class constructor
    }

    // Implementation of member functions
    public void Deposit(double amount) {
        balance += amount + (amount * interestRate);
    }

    public void Withdraw(double amount) {
        balance -= amount + (amount * interestRate);
    }

    public void printBalance() {
        System.out.println("Balance in your saving account: " + balance);
    }

}

// Current class extended from the Account class
class Current extends Account {

    public Current(int balance) { // Parametrized constructor
        super(balance); // calling base class constructor
    }

    // Implementation of public member functions
    public void Deposit(double amount) {
        balance += amount;
    }

    public void Withdraw(double amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("Balance in your current account: " + balance);
    }

}

// --
// Abstarct Book Class
abstract class Book {

    // Protected fields
    protected String name;
    protected String author;
    protected String price;

    // Parameterized Constructor
    public Book(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Abstract method
    public abstract String getDetails();

}

// MyBook class extending Book class
class MyBook extends Book {

    // Parameterized constructor
    public MyBook(String name, String author, String price) {
        super(name, author, price); // Calling base class constructor
    }

    // Override the getDetails method of the Base Class
    public String getDetails() {
        return name + ", " + author + ", " + price;
    }

}

// --
// Addition interface
interface Addition {

    int add(int num1, int num2);

}

// Calculator Class Implementing the Addition Interface
class Calculator2 implements Addition {

    // Overriding the add method of Addition interface
    public int add(int num1, int num2) {
        return num1 + num2;
    }

}

// --
// Vehicle class
class Vehicle2 {

    String model;
    int id;

    Vehicle2(String model, int id) { // Parameterized constructor
        this.id = id;
        this.model = model;
    }

}

class Driver {

    String driverName;
    Vehicle2 vehicle2;

    Driver(String name, Vehicle2 v) { // Parameterized constructor
        vehicle2 = v;
        this.driverName = name;
    }

}

class Main {

    public static void main(String args[]) {
        // Creating a Vehicle object with model: "Volvo S60", and id: "4453"
        Vehicle2 vehicle2 = new Vehicle2("Volvo S60", 4453);
        // Creating a Driver object having name: "John" and passing the
        // vehicle in its constructor
        Driver driver = new Driver("John", vehicle2);
        System.out.println(driver.driverName + " is a driver of car Id: " + driver.vehicle2.id);
    }

}

// --
// Player class
class Player {

    String name;
    int id;
    String team;

    Player(String name, int id, String team) {
        this.name = name;
        this.id = id;
        this.team = team;
    }

}

/*
 * Team class contains a list of Player Objects.
 */
class Team {

    String name;
    private List<Player> players;

    Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public List<Player> getPlayers() { // This function returns the "players"
        return players;
    }

}

/*
 * School class contains a list of Team Objects.
 */
class School {

    String schoolName;
    private List<Team> teams;

    School(String schoolName, List<Team> teams) {
        this.schoolName = schoolName;
        this.teams = teams;
    }

    /*
     * Count total players of all teams in a given school
     */
    public int getTotalPlayersInSchool() {
        int noOfPlayers = 0;
        List<Player> players;

        for (Team team : teams) {
            players = team.getPlayers();
            for (Player p : players) {
                noOfPlayers++;
            }
        }
        return noOfPlayers;
    }

}

// Main class
class Main {

    public static void main(String[] args) {
        /* Declaring all the players */
        Player p1 = new Player("Harris", 1, "Red");
        Player p2 = new Player("Carol", 2, "Red");
        Player p3 = new Player("Johnny", 1, "Blue");
        Player p4 = new Player("Sarah", 2, "Blue");

        /*
         * Making a List of "Red" team Players.
         */
        List<Player> red_players = new ArrayList<Player>();
        red_players.add(p1);
        red_players.add(p2);

        /*
         * Making a List of "Blue" team Players.
         */
        List<Player> blue_players = new ArrayList<Player>();
        blue_players.add(p3);
        blue_players.add(p4);

        /* Declaring Team objects */
        Team red = new Team("Red", red_players);
        Team blue = new Team("Blue", blue_players);

        // Creating a list of teams and adding "red" and "blue" teams to it.
        List<Team> teams = new ArrayList<Team>();
        teams.add(red);
        teams.add(blue);

        // Creating an instance of School.
        School mySchool = new School("ABC", teams);

        System.out.println("Total players in my school: ");
        // Getting total prayers in the school.
        System.out.println(mySchool.getTotalPlayersInSchool());
    }

}

// --
// Car class
class Car {

    // Declaring data members and methods
    private int id;
    private String model;
    private String color;

    public void carFeatures() { // Function to print out car features
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

// Toyota Class, which is a child class of Car class.
class Toyota extends Car {

    // Inherits all properties of Car class
    public void setStart() {
        // Declaring an engine object and calling the start() function of the engine.
        ToyotaEngine engine = new ToyotaEngine();
        engine.start();
    }

}

// Engine class
class ToyotaEngine {

    // This function simply prints out on screen that Engine has been started!
    public void start() {
        System.out.println("Engine has been started.");
    }

    // This function simply prints out on screen that Engine has been stopped!
    public void stop() {
        System.out.println("Engine has been stopped.");
    }

}

class Main {

    public static void main(String[] args) {
        // Declaring and initializing Toyota object
        Toyota t = new Toyota();
        t.setModel("Fortuner");
        t.setColor("Silver");

        t.carFeatures();
        t.setStart();
    }

}