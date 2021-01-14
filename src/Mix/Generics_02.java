package First;

public class Generics_02 {

    public static void main(String[] args) {

        TwoD[] twoD = { new TwoD(10, 20), new TwoD(1, 20), new TwoD(1, 2), new TwoD(10, 2), new TwoD(10, 200) };

        ThreeD[] threeD = { new ThreeD(10, 20, 30), new ThreeD(1, 20, 3), new ThreeD(10, 2, 3), new ThreeD(10, 2, 30),
                new ThreeD(10, 20, 3) };
        FourD[] fourD = { new FourD(10, 2, 3, 40), new FourD(10, 20, 30, 4), new FourD(10, 2, 30, 40),
                new FourD(1, 20, 3, 40), new FourD(10, 2, 30, 4) };

        GeneralD<TwoD> two = new GeneralD<>(twoD);
        GeneralD<ThreeD> three = new GeneralD<>(threeD);
        GeneralD<FourD> four = new GeneralD<>(fourD);

        Display.display_2D_Coordinates(two);
        Display.display_3D_Coordinates(three);
        Display.display_4D_Coordinates(four);

    }

    public static class Display {

        public static void display_2D_Coordinates(GeneralD<? extends TwoD> coorDinates) {
            for (TwoD ele : coorDinates.coordinates)
                System.out.println("X : " + ele.x + " and  Y : " + ele.y);
        }

        public static void display_3D_Coordinates(GeneralD<? extends ThreeD> coorDinates) {
            for (ThreeD ele : coorDinates.coordinates)
                System.out.println("X : " + ele.x + " and  Y : " + ele.y + " and  Z : " + ele.z);
        }

        public static void display_4D_Coordinates(GeneralD<? extends FourD> coorDinates) {
            for (FourD ele : coorDinates.coordinates)
                System.out.println("X : " + ele.x + " and  Y : " + ele.y + " and  Z : " + ele.z + " and  W : " + ele.w);
        }

    }

    public static class GeneralD<T extends TwoD> {
        protected T[] coordinates;

        public GeneralD(T[] coordinates) {
            this.coordinates = coordinates;
        }
    }

    public static class TwoD {
        protected int x;
        protected int y;

        public TwoD(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class ThreeD extends TwoD {
        protected int z;

        public ThreeD(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }
    }

    public static class FourD extends ThreeD {
        protected int w;

        public FourD(int x, int y, int z, int w) {
            super(x, y, z);
            this.w = w;
        }
    }

}
