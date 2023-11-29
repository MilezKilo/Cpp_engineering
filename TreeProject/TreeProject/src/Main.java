//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Инициализация переменных
        String strNumber;
        String message;

        //Ввод данных
        strNumber = JOptionPane.showInputDialog(null, "Введите температуру", "Ввод", JOptionPane.PLAIN_MESSAGE);

        //Преобразование str в int
        int intNumber = Integer.parseInt(strNumber);

        //Условия изменения переменной message
        if (intNumber <= 10) {
            message = "Холодная: \nБольше влево";
        } else if (intNumber <= 20) {
            message = "Прохладная: \nНебольшой влево";
        } else if (intNumber <= 40) {
            message = "Теплая: \nнуль";
        } else if (intNumber <= 50) {
            message = "Не очень горячая: \nНебольшой вправо";
        } else if (intNumber <= 60) {
            message = "Горячая: \nБольше вправо";
        } else {
            message = "Ошибка, неверные данные";
        }

        //Вывод диалогового окна с сообщением
        //JOptionPane.showMessageDialog(null, message);
        JOptionPane.showInternalConfirmDialog(null, message, "Вывод", JOptionPane.DEFAULT_OPTION);
    }
}