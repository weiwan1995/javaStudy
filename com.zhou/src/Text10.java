public class Text10 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 7};
        boolean equalsA = equals(arr1, arr2);
        System.out.println(equalsA);
    }

    /**
     * @param ints1 数组1
     * @param ints2 数组2
     * @return 长度一致，内容一致
     */
    public static boolean equals(int[] ints1, int[] ints2) {
        // 1.长度不一样 说明两个数组不一样
        if (ints1.length != ints2.length) return false;
        // 判断两个数组里的数字是否相等 如果有一个不等,说明两个数组不等
        for (int i = 0; i < ints1.length; i++) {
            if (ints1[i] != ints2[i]) {
                return false;
            }
        }
        return true;
    }
    // 就假设两个数组是相等的

}


