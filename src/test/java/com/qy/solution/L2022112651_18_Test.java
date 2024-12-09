package com.qy.solution;

import org.junit.Test;
import static org.junit.Assert.*;

public class L2022112651_18_Test {

    /**
     * 测试用例设计的总体原则：
     * 1. 等价类划分原则：测试正数、负数、零等情况，测试乘积结果为大数时等情况。
     * 2. 边界值分析：测试数组长度为 1 时等情况。
     * 3. 特殊值：测试包含重复元素等情况
     * 3. 覆盖每个取值：最少一次即可
     */

    Solution solution = new Solution();

    /**
     * 测试目的：测试基本情况，数组包含正整数。
     * 输入：nums = [1, 2, 3, 4]
     * 预期输出：[24, 12, 8, 6]
     */
    @Test
    public void testBasicCase() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试包含零的情况。
     * 输入：nums = [1, 2, 0, 4]
     * 预期输出：[0, 0, 8, 0]
     */
    @Test
    public void testWithZero() {
        int[] nums = {1, 2, 0, 4};
        int[] expected = {0, 0, 8, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试包含负数的情况。
     * 输入：nums = [-1, 1, 0, -3, 3]
     * 预期输出：[0, 0, 9, 0, 0]
     */
    @Test
    public void testWithNegativeNumbers() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试只有一个元素的情况。
     * 输入：nums = [5]
     * 预期输出：[1]，因为只有一个元素，所以它的乘积是1
     */
    @Test
    public void testSingleElement() {
        int[] nums = {5};
        int[] expected = {1};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试较大的数组。
     * 输入：nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     * 预期输出：[3628800, 1814400, 1209600, 907200, 725760, 604800, 518400, 453600, 403200, 362880]
     */
    @Test
    public void testLargeArray() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {3628800, 1814400, 1209600, 907200, 725760, 604800, 518400, 453600, 403200, 362880};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试包含重复元素的情况。
     * 输入：nums = [2, 2, 2, 2]
     * 预期输出：[8, 8, 8, 8]
     */
    @Test
    public void testWithDuplicates() {
        int[] nums = {2, 2, 2, 2};
        int[] expected = {8, 8, 8, 8};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }
}