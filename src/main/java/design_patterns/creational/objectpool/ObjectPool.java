package design_patterns.creational.objectpool;

import java.util.HashMap;
import java.util.Map;

class ObjectPool {
    private static long expTime = 6000;
    public static HashMap<InterestingObject, Long> available = new HashMap<>();
    public static HashMap<InterestingObject, Long> inUse = new HashMap<>();

    public synchronized static InterestingObject getObject() {
        long now = System.currentTimeMillis();
        if (!available.isEmpty()) {
            for (Map.Entry<InterestingObject, Long> entry : available.entrySet()) {
                if (now - entry.getValue() > expTime) { //object has expired
                    popElement(available, entry.getKey());
                } else {
                    InterestingObject po = popElement(available, entry.getKey());
                    return po;
                }
            }
        }
        // either no InterestingObject is available or each has expired, so return a new one
        return createInterestingObject(now);
    }

    public static void releaseObject(InterestingObject po) {
        cleanUp(po);
        available.put(po, System.currentTimeMillis());
        inUse.remove(po);
    }

    private synchronized static InterestingObject createInterestingObject(long now) {
        InterestingObject po = new InterestingObject();
        push(inUse, po, now);
        return po;
    }

    private synchronized static void push(HashMap<InterestingObject, Long>map, InterestingObject po, long now) {
        map.put(po, now);
    }

    private static InterestingObject popElement(HashMap<InterestingObject, Long> map, InterestingObject key) {
        map.remove(key);
        return key;
    }

    public static void cleanUp(InterestingObject po) {
        po.setTemp1(null);
        po.setTemp2(null);
    }
}
