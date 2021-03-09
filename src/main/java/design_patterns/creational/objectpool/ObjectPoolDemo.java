package design_patterns.creational.objectpool;

public class ObjectPoolDemo {

    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();

        InterestingObject interestingObject = objectPool.getObject();
        objectPool.releaseObject(interestingObject);
    }
}
