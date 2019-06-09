package com.balki;

import com.balki.sort.BubbleSort;
import com.balki.compare.CompareSorts;
import com.balki.sort.QuickSort;

/**
 * @author Balkı
 * @since 23/03/2019
 */
public class CompareQuickAndBubbleSorts {

    public static void main(String[] args) throws Exception {
        CompareSorts compareSorts = new CompareSorts();
        compareSorts.compare(new QuickSort(), new BubbleSort());
    }
}
