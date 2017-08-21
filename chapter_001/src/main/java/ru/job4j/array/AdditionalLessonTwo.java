package ru.job4j.array;

/**
 * class AdditionalLessonTwo объединение двух целочисленных массивов.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1.0
 * @since 21.08.2017
 */


public class AdditionalLessonTwo {
    /**
     * @param oneArray первый массив целых чисел
     */
    private int[] oneArray;
    /**
     * @param twoArray второй массив целых чисел
     */
    private int[] twoArray;

    /**
     * @method Метод записи входящих массивов в поля класса AdditionalLessonTwo.
     * @param first первый воходящий массив
     * @param second второй входящий массив
     */
    public AdditionalLessonTwo(int[] first, int[] second) {
        this.oneArray = first;
        this.twoArray = second;
    }
    /**
     * @method объдиняет два отсортированных массива в третий также отсортированный.
     * @return возвращает объединенный массив
     */
    public int[] combineArrays() {
        /**
         * @param result массив для хронения объедененного массива.
         */
        int[] result = new int[oneArray.length + twoArray.length];
        /**
         * @param i,j хранят индексы для пока не обработанных входящих массивов.
         */
       int i = 0, j = 0;
        /**
         * @param index хранит индекс объединенного массивов.
         */
        int index = 0;
        // сравниваем массивы пока в КАЖДОМ из них есть хотябы
        // один не обработанный элемент.
        // Цикл завершится когда в одном из массивов закончатся элементы.
        while (i < oneArray.length && j < twoArray.length) {
            //определяем какой из элементов массива меньше тот и записываем в ячейку
            // объединенног массива и выполняем инкремент соответствующего индекса (i или j)
            if (oneArray[i] < twoArray[j]) {
                result[index] = oneArray[i];
                i++;
            } else {
                result[index] = twoArray[j];
                j++;
            }
            index++;
        }
        // Если один из массивов будет имееть большую длину, то все остальные его
        // элементы можно просто записть в объедененный массив.
         while (i < oneArray.length) {
            result[index] = oneArray[i];
            index++;
            i++;
        } while (j < twoArray.length) {
            result[index] = twoArray[j];
            index++;
            j++;
        }
        return result;
    }
}