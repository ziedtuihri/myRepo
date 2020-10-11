package com.example.springweb;

public class Book {

    public static class Author {
    /*
     * @Author: zied
     * @created: 04/10/2020
     */

        private String firstName;
        private String lastName;

        public Author(){

        }

        public Author(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

    }
}