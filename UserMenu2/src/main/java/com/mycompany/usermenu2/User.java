/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usermenu2;

/**
 *
 * @author gelde
 */
public class User {
    public String name;
    public String email;
    public Book borrowedBooks;
   
    public User (String name, String email){
        this.name = name;
        this.email = email;
    }
    
    public void returnBook(Book book){
            System.out.println(name + "returned: " + book);
        }
        
    }
    

