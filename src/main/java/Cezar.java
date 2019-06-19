import java.util.HashMap;
import java.util.Map;

public class Cezar {

    private Map<Integer, Character> dict = new HashMap<>();

    {
        dict.put(1, 'А');
        dict.put(2, 'Б');
        dict.put(3, 'В');
        dict.put(4, 'Г');
        dict.put(5, 'Д');
        dict.put(6, 'Е');
        dict.put(7, 'Ё');
        dict.put(8, 'Ж');
        dict.put(9, 'З');
        dict.put(10, 'И');
        dict.put(11, 'Й');
        dict.put(12, 'К');
        dict.put(13, 'Л');
        dict.put(14, 'М');
        dict.put(15, 'Н');
        dict.put(16, 'О');
        dict.put(17, 'П');
        dict.put(18, 'Р');
        dict.put(19, 'С');
        dict.put(20, 'Т');
        dict.put(21, 'У');
        dict.put(22, 'Ф');
        dict.put(23, 'Х');
        dict.put(24, 'Ц');
        dict.put(25, 'Ч');
        dict.put(26, 'Ш');
        dict.put(27, 'Щ');
        dict.put(28, 'Ъ');
        dict.put(29, 'Ы');
        dict.put(30, 'Ь');
        dict.put(31, 'Э');
        dict.put(32, 'Ю');
        dict.put(33, 'Я');


    }

    public String coding(String text, int key) {
        text = text.toUpperCase();
        char[] chars = text.toCharArray();

        StringBuffer newStr = new StringBuffer();

        for (char symbol: chars) {

            if (symbol == ' '){
                newStr.append(" ");
                continue;
            }

            dict.forEach((keyMap, value) -> {
                if (symbol == value) {
                    if (keyMap + key < dict.size()) {
                        newStr.append(dict.get(keyMap + key));
                    } else {
                        newStr.append(dict.get(keyMap + key - dict.size()));
                    }

                }
            });
        }

        return newStr.toString();
    }

    public String uncoding(String text, int key) {
        return null;
    }
}
