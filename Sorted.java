public class Sorted {
    public static void main(String[] args) {
        int[] array ={10,20,90,40,50};
        Sorted sorted = new Sorted();
        boolean flag = sorted.sortCheack(array);
        System.out.println(flag);
        char[] name = {'v','A','i','B','h','A','v'};
        sorted.stringConvert(name);

    }
    public boolean sortCheack(int[] array){
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]){
                    return false;
                }

            }

        }
        return flag;
    }
    public void stringConvert(char[] name){
        for (int i = 0; i < name.length ; i++) {
            if( i % 2 == 0){
                System.out.println((char)(name[i]+36));
            }
        }

    }
}
