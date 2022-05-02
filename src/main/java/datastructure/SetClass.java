package datastructure;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/***************************************************************
 Filename: 
 Created by: melat
 Created on: 02/05/2022
 Comment: 
 ***************************************************************/
public class SetClass {
    public static void main(String[] args) {

        //duplicate is not allowed in Sets
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("white"));
        balls.add(new Ball("green"));
        balls.add(new Ball("blue"));
        balls.remove(new Ball("white"));
        balls.iterator();
        balls.forEach(System.out::println);
    }
    static class Ball{
        String color;
        public Ball(String color) {
            this.color = color;
        }
        //record Ball(String color){


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
