package week2.day1;

public abstract class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$";
        char[] chr = test.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int splchar =0;
        for (int i = 0; i < test.length(); i++) {
            if (Character.isLetter(chr[i])) {
                letter++;
            } else if (Character.isDigit(chr[i])) {
                num++;
            } else if (Character.isSpaceChar(chr[i])) {
                space++;
            } else {
            	splchar++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + splchar);

	}

}
