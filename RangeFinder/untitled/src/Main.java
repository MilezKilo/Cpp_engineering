import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

//ФОРМУЛА РАССЧЕТОВ: Zn = Zn-1 + 3.5 * t1 + 3,73 * t2 + 3 * dt
//ПРИМЕР:Z1 = /35/ + /3.5 * 2/ + /3.73 * 5/ + /3 * 20/ =
// 35 + 7 + 18.65 + 60 = 120,65

public class Main {
    //Метод просчета по формуле
    static float calculating(float t1, float t2, float dt, String iteration) {
        ArrayList<Float> nums = new ArrayList<>();
        for(int i = 2; i <= 5; i+= (int) t1) {
            for(int j = 5; j <= 15; j+= (int) t2) {
                for(int q = 20; q <= 50; q+= (int) dt) {
                    float value = 35f + 3.5f * i + 3.73f * j + 3.0f * q;
                    nums.add(value);
                    System.out.printf("t1 = %s, t2 = %s, dt = %s, Z[%s] = %s%n", i, j, q, iteration, value);
                }
            }
        }
        return Collections.min(nums);
    }



    public static void main(String[] args) {
        JPanel gui = new JPanel(new FlowLayout(5));
        gui.setBorder(new EmptyBorder(2, 3, 2, 3));

        //Создание вертикального контейнера (VStack)
        VStack mainStack = new VStack();

        //Создание горизонтального контейнера (HStack)
        HStack firstHStack = new HStack();
        HStack secondHStack = new HStack();
        HStack thirdHStack = new HStack();
        HStack fourthHStack = new HStack();

        //tf1 текстфилд и лейбл
        JLabel t1Label = new JLabel("Введите tf1 - ");
        JTextField t1Textfield = new JTextField("", 25);
        firstHStack.box.add(t1Label);
        firstHStack.box.add(t1Textfield);

        //tf2 текстфилд и лейбл
        JLabel t2Label = new JLabel("Введите tf2 - ");
        JTextField t2Textfield = new JTextField("", 25);
        secondHStack.box.add(t2Label);
        secondHStack.box.add(t2Textfield);

        //dt текстфилд и лейбл
        JLabel dtLabel = new JLabel("Введите dt  - ");
        JTextField dtTextfield = new JTextField("", 25);
        thirdHStack.box.add(dtLabel);
        thirdHStack.box.add(dtTextfield);

        //Z текстфилд и лейбл
        JLabel zLabel = new JLabel("Номер итерации (Z)  - ");
        JTextField zTextfield = new JTextField("", 25);
        fourthHStack.box.add(zLabel);
        fourthHStack.box.add(zTextfield);

        //Добавление в VStack HStack'ов
        mainStack.box.add(firstHStack.box);
        mainStack.box.add(secondHStack.box);
        mainStack.box.add(thirdHStack.box);
        mainStack.box.add(fourthHStack.box);

        //Добавление к окну VStack
        gui.add(mainStack.box);

        JOptionPane.showConfirmDialog(null, gui, "Введите данные для расчетов", JOptionPane.PLAIN_MESSAGE, -1);

        String t1String = t1Textfield.getText();
        int t1 = Integer.parseInt(t1String);

        String t2String = t2Textfield.getText();
        int t2 = Integer.parseInt(t2String);

        String dtString = dtTextfield.getText();
        int dt = Integer.parseInt(dtString);

        String z = zTextfield.getText();

        System.out.print(calculating(t1, t2, dt, z));
    }
}

class VStack {
    Box box = Box.createVerticalBox();
}

class HStack {
    Box box = Box.createHorizontalBox();
}

/*
//        JFrame frame = new JFrame("Big Text Fields");
//        frame.add(gui);
//        frame.setSize(500, 400);
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame.setLocationByPlatform(true);
//
//        frame.pack();
//        frame.setVisible(true);


        //Текстфилды для ввода данных
//        JTextField t1 = new JTextField(1);
//        JTextField t2 = new JTextField(1);
//        JTextField dt = new JTextField(1);

        //Фрейм окно
//        JFrame frame = new JFrame();
//        Box box = Box.createVerticalBox();
//        box.add(new JLabel("t1:"));
//        box.add(t1);
//        box.add(new JLabel("t2:"));
//        box.add(t2);
//        box.add(new JLabel("dt:"));
//        box.add(dt);
//        box.add(new Button("Hello world"));
//        frame.add(box);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationByPlatform(true);
//        frame.setSize(300, 200);
//        frame.setVisible(true);
        //Окно ввода данных в текстфилды
        //JOptionPane.showConfirmDialog(null, myPanel, "Введите температуру и угол", JOptionPane.DEFAULT_OPTION);

        //Преобразование str в int
        //int corner = Integer.parseInt(defuzzify.getText());

        static float calculating(float t1, float t2, float dt) {
        return 35f + 3.5f * t1 + 3.73f * t2 + 3.0f * dt;
    }
 */