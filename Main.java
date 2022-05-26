import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<dato> datito = new ArrayList();

    public static void main(String[] args) {
        dato aux = new dato();

        String path = "C:/Users/usuario/Desktop/Medellin.csv";
        String line = "";
        {

            try {
                BufferedReader br = new BufferedReader(new FileReader(path));

                while ((line = br.readLine()) != null) {

                    String[] values = line.split(",");

                    if (values[0].equals("\"STATION\"")) {
                        System.out.println(values.length);
                        System.out.println("ae");
                        continue;
                    } else {
                        aux.setStation(values[0]);
                        System.out.println(values[6]);

                        System.out.println(values[0]);
                        aux.setName(values[1] + "," + values[2]);
                        System.out.println(values[1] + "," + values[2]);
                        aux.setDate(values[3]);
                        System.out.println(values[3]);

                        if (values[4].isEmpty()) {

                            aux.setTavg(0);
                        } else {

                            values[4] = values[4].substring(1, values[4].length() - 1);
                            aux.setTavg(Double.parseDouble(values[4]));
                            System.out.println(values[4]);

                        }

                        if (values[5].isEmpty()) {
                            aux.setTavg(0);
                        } else {
                            values[5] = values[5].substring(1, values[5].length() - 1);
                            aux.setTavg(Double.parseDouble(values[5]));
                            System.out.println(values[5]);

                        }
                        System.out.println(values[5]);

                        if (values[6].isEmpty()) {
                            aux.setTavg(0);
                        } else {
                            values[6] = values[6].substring(1, values[6].length() - 1);

                            aux.setTavg(Double.parseDouble(values[6]));
                            System.out.println(values[6]);

                        }

                        System.out.println(values[7]);
                        if (values[7].isEmpty()) {
                            aux.setTavg(0);
                        } else {
                            values[7] = values[7].substring(1, values[7].length() - 1);

                            aux.setTavg(Double.parseDouble(values[7]));
                            System.out.println(values[7]);

                        }

                        System.out.println("Si");

                    }

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
