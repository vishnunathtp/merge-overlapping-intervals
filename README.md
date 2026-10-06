# Merge Overlapping Intervals

Java implementation to merge contiguous or overlapping intervals.

## Problem Description
Given an array of `intervals` where `intervals[i] = [start_i, end_i]`, merge all overlapping intervals and return an array of the non-overlapping intervals.

### Example
- Input: `[[1, 3], [2, 6], [8, 10], [15, 18]]`
- Output: `[[1, 6], [8, 10], [15, 18]]`

## Approach & Complexity
1. Sort intervals by start time.
2. Traverse intervals and compare current start with the previous interval's end boundary.

- **Time Complexity:** $O(N \log N)$ due to sorting.
- **Space Complexity:** $O(N)$ for merged output representation.

## How to Run & Test
```bash
javac -d bin src/IntervalMerger.java tests/IntervalMergerTest.java
java -cp bin -ea IntervalMergerTest
```
