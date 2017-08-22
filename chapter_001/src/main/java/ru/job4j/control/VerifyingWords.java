package ru.job4j.control;
/**
 * class VerifyingWords Проверка, что одно слово находится в другом слове.
 *
 * @author Pavel Ivanov (pavel.ivanov.060988@gmail.com)
 * @version 1.0
 * @since 22.08.2017
 */
public class VerifyingWords {
    /**
     * @method проверяет находится ли одно слово в другом слове.
     * @param origin - слово в котором будем проверять наличие проверочного слова
     * @param sub - проверочное слово
     * @return возвращает true когда слово находится в другом слове
     * и возвращает false когда слово НЕ находится в другом слове.
     */
    public  boolean contains(String origin, String sub) {
        boolean result = false;
        char[] originArray = origin.toCharArray();
        char[] subArray = sub.toCharArray();
        for (int i = 0; i < originArray.length; i++) {
            if (originArray[i] == subArray[0]) {
                for (int j = 1; j < subArray.length; j++) {
                    if (originArray[i + j] == subArray[j]) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }
}