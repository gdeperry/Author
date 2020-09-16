package ru.mirea;

public class ball1 {
    public static class ball{
        private String color;
        private int radius;
        ball(String color, int radius)
        {
            this.color=color;
            this.radius=radius;
        }
        public void ToString()
        {
            System.out.println(color);
            System.out.println(radius);
        }
    }
    public static void main(String[]args)
    {
        ball ball;
        ball = new ball("blue", 10);
        ball.ToString();
    }
}
