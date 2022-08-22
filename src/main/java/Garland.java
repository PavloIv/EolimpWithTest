//Новорічну ялинку прикрашено гірляндою нескінченної довжини, що складається з послідовно з'єднаних лампочок.
// Коли гірлянду вмикають, загоряється лише перша лампочка, рахуючи від вимикача, яка горить одну секунду.
// Далі гірлянда починає мигати за таким правилом. Щосекунди для кожної лампочки перевіряється умова:
// якщо рівно одна із її сусідніх лампочок горить, то ця лампочка буде горіти на наступній секунді;
// інакше – не буде горіти. Перша лампочка має лише одну сусідню.
// Напишіть програму, яка за номером секунди знаходить кількість лампочок гірлянди,
// що будуть горіти протягом цієї секунди.

import java.util.Arrays;

public class Garland {

    private int second;
     int[] startArray;
    public void setSecond(int second) {
        this.second = second;
    }
    public Garland(int second) {
        this.second = second;
    }

    public Garland() {
    }

    public int countLightBulb() {
        garlandLightBulb();
        int countLightBulb = 0;
        for (int j : startArray) countLightBulb += j;
        return countLightBulb;
    }

    public void startArray() {
        startArray = new int[second];
        startArray[0] = 1;
        for (int i = 1; i < second; i++) {
            startArray[i] = 0;
        }
    }

    public void garlandLightBulb() {
        startArray();
        int[] tempArray = Arrays.copyOf(startArray, startArray.length);
        int i = 1;
        while (i < second) {
            for (int j = 1; j < second - 1; j++) {
                if ((startArray[j - 1] + startArray[j + 1]) == 1) {
                    tempArray[j] = 1;
                } else {
                    tempArray[j] = 0;
                }
            }
            if (startArray[1] == 1 && startArray[0] != 1) {
                tempArray[0] = 1;
            } else {
                tempArray[0] = 0;
            }
            startArray = Arrays.copyOf(tempArray, tempArray.length);
            i++;
        }
        startArray[second - 1] = 1;
    }
}