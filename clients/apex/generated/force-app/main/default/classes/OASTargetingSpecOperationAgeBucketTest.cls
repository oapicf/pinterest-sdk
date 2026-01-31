@isTest
private class OASTargetingSpecOperationAgeBucketTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket1 = OASTargetingSpecOperationAgeBucket.getExample();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket2 = targetingSpecOperationAgeBucket1;
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket3 = new OASTargetingSpecOperationAgeBucket();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket4 = targetingSpecOperationAgeBucket3;

        System.assert(targetingSpecOperationAgeBucket1.equals(targetingSpecOperationAgeBucket2));
        System.assert(targetingSpecOperationAgeBucket2.equals(targetingSpecOperationAgeBucket1));
        System.assert(targetingSpecOperationAgeBucket1.equals(targetingSpecOperationAgeBucket1));
        System.assert(targetingSpecOperationAgeBucket3.equals(targetingSpecOperationAgeBucket4));
        System.assert(targetingSpecOperationAgeBucket4.equals(targetingSpecOperationAgeBucket3));
        System.assert(targetingSpecOperationAgeBucket3.equals(targetingSpecOperationAgeBucket3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket1 = OASTargetingSpecOperationAgeBucket.getExample();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket2 = OASTargetingSpecOperationAgeBucket.getExample();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket3 = new OASTargetingSpecOperationAgeBucket();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket4 = new OASTargetingSpecOperationAgeBucket();

        System.assert(targetingSpecOperationAgeBucket1.equals(targetingSpecOperationAgeBucket2));
        System.assert(targetingSpecOperationAgeBucket2.equals(targetingSpecOperationAgeBucket1));
        System.assert(targetingSpecOperationAgeBucket3.equals(targetingSpecOperationAgeBucket4));
        System.assert(targetingSpecOperationAgeBucket4.equals(targetingSpecOperationAgeBucket3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket1 = OASTargetingSpecOperationAgeBucket.getExample();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket2 = new OASTargetingSpecOperationAgeBucket();

        System.assertEquals(false, targetingSpecOperationAgeBucket1.equals('foo'));
        System.assertEquals(false, targetingSpecOperationAgeBucket2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket1 = OASTargetingSpecOperationAgeBucket.getExample();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket2 = new OASTargetingSpecOperationAgeBucket();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket3;

        System.assertEquals(false, targetingSpecOperationAgeBucket1.equals(targetingSpecOperationAgeBucket3));
        System.assertEquals(false, targetingSpecOperationAgeBucket2.equals(targetingSpecOperationAgeBucket3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket1 = OASTargetingSpecOperationAgeBucket.getExample();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket2 = new OASTargetingSpecOperationAgeBucket();

        System.assertEquals(targetingSpecOperationAgeBucket1.hashCode(), targetingSpecOperationAgeBucket1.hashCode());
        System.assertEquals(targetingSpecOperationAgeBucket2.hashCode(), targetingSpecOperationAgeBucket2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket1 = OASTargetingSpecOperationAgeBucket.getExample();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket2 = OASTargetingSpecOperationAgeBucket.getExample();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket3 = new OASTargetingSpecOperationAgeBucket();
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket4 = new OASTargetingSpecOperationAgeBucket();

        System.assert(targetingSpecOperationAgeBucket1.equals(targetingSpecOperationAgeBucket2));
        System.assert(targetingSpecOperationAgeBucket3.equals(targetingSpecOperationAgeBucket4));
        System.assertEquals(targetingSpecOperationAgeBucket1.hashCode(), targetingSpecOperationAgeBucket2.hashCode());
        System.assertEquals(targetingSpecOperationAgeBucket3.hashCode(), targetingSpecOperationAgeBucket4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingSpecOperationAgeBucket targetingSpecOperationAgeBucket = new OASTargetingSpecOperationAgeBucket();
        System.assertEquals(new List<OASTargetingSpecAgeBucket>(), targetingSpecOperationAgeBucket.values);
        System.assertEquals(null, targetingSpecOperationAgeBucket.field);
        System.assertEquals(null, targetingSpecOperationAgeBucket.operation);
    }
}
