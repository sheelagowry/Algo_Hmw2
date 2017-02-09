import java.util.ArrayList;
//import java.util.Collections;

public class Answer {
    enum Color{red, green, blue}
    
    public static void main(String[] args) {
        reorder(new Color[]{ Color.red, Color.red, Color.blue, Color.green, Color.green, Color.green, Color.red});
    }
    
    public static void reorder (Color[] balls) {
        
        ArrayList<Color> redBalls = new ArrayList<Color>();
        ArrayList<Color> greenBalls = new ArrayList<Color>();
        ArrayList<Color> blueBalls = new ArrayList<Color>();

        for (Color ball : balls) {
            if(ball == Color.red){
                redBalls.add(ball);
            } else if(ball == Color.green) {
                greenBalls.add(ball);
            } else if(ball == Color.blue) {
                blueBalls.add(ball);
            }
        }
        
        ArrayList<Color> answer = new ArrayList<Color>();
        answer.addAll(redBalls);
        answer.addAll(blueBalls);
        answer.addAll(greenBalls);
        
        balls = answer.toArray(balls);
        
        for(Color ball : balls){
            System.out.println(ball.toString());
        }
        
    }
}