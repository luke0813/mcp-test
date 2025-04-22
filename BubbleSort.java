/**
 * 冒泡排序算法实现
 * 时间复杂度：O(n²)
 * 空间复杂度：O(1)
 */
public class BubbleSort {
    
    /**
     * 冒泡排序方法
     * @param arr 待排序的整型数组
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // 数组为空或只有一个元素，无需排序
        }
        
        int n = arr.length;
        boolean swapped;
        
        // 外层循环控制排序轮数
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // 内层循环进行相邻元素比较和交换
            for (int j = 0; j < n - i - 1; j++) {
                // 如果当前元素大于下一个元素，则交换它们
                if (arr[j] > arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // 如果在本轮排序中没有发生交换，说明数组已经有序
            if (!swapped) {
                break;
            }
        }
    }
    
    /**
     * 打印数组内容的辅助方法
     * @param arr 要打印的数组
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * 主方法，用于测试冒泡排序算法
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("排序前的数组:");
        printArray(testArray);
        
        bubbleSort(testArray);
        
        System.out.println("排序后的数组:");
        printArray(testArray);
    }
}