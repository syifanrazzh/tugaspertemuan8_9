package com.syifa.tugas9;

/**
 *
 * @author Syifa Nur Azizah Suhud - 2305056
 */
public class Tugas9 {
    public static void main(String[] args) {
        Person person = new Person("Syifa", "Jl. Merdeka", "08123456", "syifa@mail.com");
        Student student = new Student("Azizah", "Jl. Sudirman", "08134567", "azizah@mail.com", Student.MABA);
        Employee employee = new Employee("Dhaffa", "Jl. Asia Afrika", "08145678", "dhaffa@mail.com", "Ruang 101", 
                            5000000, new MyDate(1, 1, 2020));
        Faculty faculty = new Faculty("Aditya", "Jl. Soekarno", "08156789", "aditya@mail.com", "Fakultas MIPA", 
                          6000000, new MyDate(31, 5, 2021), "08:00 - 14:00", "Lektor");
        Staff staff = new Staff("Harry", "Jl. Diponegoro", "08167892", "harry@mail.com", "Ruang", 4000000, 
                      new MyDate(10, 10, 2023), "S.Si");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

