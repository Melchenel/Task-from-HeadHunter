import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        TaskOne taskOne = new TaskOne();
        taskOne.Task();

    }



    public static class TaskOne {
        private SortedSet<Integer> arr = new TreeSet<Integer>(); // Объявление и создание списка

        //конструктор
        public TaskOne() {
            int tmp;
            Scanner scan = new Scanner(System.in);
            while (scan.hasNextInt()) {
                tmp = scan.nextInt();
                if (tmp > 0) {
                    arr.add(tmp);
                }
            }
        }

            // Нахождение пропущенного числа
            public void Task () {
                int count=0;
                if (arr.size()>0) {
                    for (int i = 1; i < arr.last(); i++) {
                        if (!arr.contains(i)) {
                            count = i;
                            break;
                        }
                    }
                }
                else
                {
                    count=1;
                }

                if(count == 0 && arr.size()!=0){
                    count = arr.size()+1;
                }
                System.out.println(count);
            }


        }
    }









