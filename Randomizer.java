import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Randomizer {
    public static void main(String[] args) {
        ArrayList<double[]> result = new ArrayList<>();
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 1500; i++) {
            int number=(int)(Math.random()*1000);
            FindBest fb = new FindBest(result, number);
            threads.add(fb);
            fb.start();
        }

        for (Thread thread : threads) {
            if (thread.isAlive()) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        // if we want to document numbers
        try {
            File file = new File("./result2");
            FileWriter fw = new FileWriter(file);

            fw.append("a=[");

            System.out.print("a=[");
            for (double[] d : result) {
                fw.append(d[0] + ",");
            }
            fw.append("]");

            fw.append("\n");
            fw.append("b=[");
            for (double[] d : result) {
                fw.append(d[1] + ",");
            }
            fw.append("]");
            fw.close();
        } catch (Exception e) {
        }

        // if you want to see the results

        // for (double[] d : result) {
        // System.out.println(d[0]+" "+d[1]);
        // }
    }

}
