package org.example;

public class Static {

    protected static int totalCount = 0;
    protected int instanceCount = 0;

    public Static() {

    }

   public Static(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Static.totalCount = totalCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }
    public static int incrementTotalCount() {
        totalCount++;
        return totalCount;
    }

   public int incrementInstanceCount() {
        instanceCount++;
        return instanceCount;
    }
}
