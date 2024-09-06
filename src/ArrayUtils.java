public class ArrayUtils {

    public static boolean areEqual(int[] a1, int[] a2) {
        if (a1 == a2) return true;
        if (a1 == null || a2 == null) return false;
        if (a1.length != a2.length) return false;

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static boolean areEqual(int[][] a1, int[][] a2) {
        if (a1 == a2) return true;
        if (a1 == null || a2 == null) return false;
        if (a1.length != a2.length) return false;

        for (int i = 0; i < a1.length; i++) {
            if (!areEqual(a1[i], a2[i])) return false;
        }
        return true;
    }
}