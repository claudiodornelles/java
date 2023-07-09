# QuickSort algorithm
<p> This is an implementation of the quicksort algorithm as part of my studies of algorithms and data structures. </p>
<p> The quicksort algorithm is an example of a recursive algorithm that selects a pivot element to partition the array into two parts. It then traverses the array from left to right looking for elements that are greater than the pivot element moving them to the right partition, and from right to left looking for elements that are less than the pivot element moving them to the left partition.
At the end of the traversal, the pivot element will be placed in its correct sorted position.</p>
<p> The process is repeated for the left and right array, where eventually every element has been the pivot and has been sorted. </p>
<p> The process is done in-place, with no need to create new arrays, and it is an unstable algorithm. Which means that the order of the elements are not preserved. </p>