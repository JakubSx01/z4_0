/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scan = new Scanner(System.in);
      while(true) {
        System.out.println("Co chcesz zrobić? Wpisz (dodaj) lub (wypisz):");
        String input = scan.nextLine();
        if(input.equals("dodaj")){
          System.out.println("Podaj imie studenta:");
          String name = scan.nextLine();
          System.out.println("Podaj wiek studenta:");
          int age = scan.nextInt();scan.nextLine();
          System.out.println("Podaj date urodzenia w formie (DD.MM.RRRR):");
          String date = scan.nextLine();
          s.addStudent(new Student(name, age, date));          
        }
        else if(input.equals("wypisz")){
          var students = s.getStudents();
          for(Student current : students){
            System.out.println(current.ToString());
          }
        }
      }
    }
    catch (IOException e) {

    }
  }
}