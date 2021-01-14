package IO_Work;

public class FilteredIOStream {

    interface anonymous {
        void returnString();
    }

    public static void main(String[] args) {

        anonymous a = new anonymous() {

            @Override
            public void returnString() {
                System.out.print("Hello :) Hello there !!");
            }
        };
        a.returnString();

    }

}
