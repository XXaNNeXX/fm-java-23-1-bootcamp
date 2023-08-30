package org.example;

public class Static {

    static int totalCount = 0;
   int instanceCount = 0;

    static int incrementTotalCount() {
        totalCount += 1;
        return totalCount;
    }

   int incrementInstanceCount() {
        instanceCount += 1;
        return instanceCount;
    }
}
