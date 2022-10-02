package com.smartHub.androidbasics.javabasics;

public class SimpleJava {

    public static void main(String[] args){

        TestAbstract testAbstract = new TestAbstract() {
            @Override
            void abs1() {

            }

            @Override
            void abs1(int i) {

            }

            @Override
            void abs1(int i, int i1) {

            }

            @Override
            void abs2(){

            }
        };
        System.out.println("Hello World");
    }
}
