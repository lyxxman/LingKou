package baseCalu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 题目
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例 1:
 * <p>
 * 给定数组 nums = [1,1,2],
 * <p>
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * <p>
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * 说明:
 * <p>
 * 为什么返回数值是整数，但输出的答案是数组呢?
 * <p>
 * 请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 */
public class ti1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 3};
//        System.out.println(length);
        System.out.println("length=" + delShuZu1(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.print("" + nums[i] + ",");
        }
    }

    private static int dealShuZu(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { //
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    /**
     * 借用数组 中虚拟结果数组，完成位移和比较
     *
     * @param nums
     * @return
     */
    private static int delShuZu1(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                if (nums[k] != nums[i]) {
                    k++;
                    nums[k] = nums[i];
                }
            }
        }
        return k + 1;
    }
}

