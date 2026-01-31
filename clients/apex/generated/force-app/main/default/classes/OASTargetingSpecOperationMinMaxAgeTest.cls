@isTest
private class OASTargetingSpecOperationMinMaxAgeTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge1 = OASTargetingSpecOperationMinMaxAge.getExample();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge2 = targetingSpecOperationMinMaxAge1;
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge3 = new OASTargetingSpecOperationMinMaxAge();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge4 = targetingSpecOperationMinMaxAge3;

        System.assert(targetingSpecOperationMinMaxAge1.equals(targetingSpecOperationMinMaxAge2));
        System.assert(targetingSpecOperationMinMaxAge2.equals(targetingSpecOperationMinMaxAge1));
        System.assert(targetingSpecOperationMinMaxAge1.equals(targetingSpecOperationMinMaxAge1));
        System.assert(targetingSpecOperationMinMaxAge3.equals(targetingSpecOperationMinMaxAge4));
        System.assert(targetingSpecOperationMinMaxAge4.equals(targetingSpecOperationMinMaxAge3));
        System.assert(targetingSpecOperationMinMaxAge3.equals(targetingSpecOperationMinMaxAge3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge1 = OASTargetingSpecOperationMinMaxAge.getExample();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge2 = OASTargetingSpecOperationMinMaxAge.getExample();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge3 = new OASTargetingSpecOperationMinMaxAge();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge4 = new OASTargetingSpecOperationMinMaxAge();

        System.assert(targetingSpecOperationMinMaxAge1.equals(targetingSpecOperationMinMaxAge2));
        System.assert(targetingSpecOperationMinMaxAge2.equals(targetingSpecOperationMinMaxAge1));
        System.assert(targetingSpecOperationMinMaxAge3.equals(targetingSpecOperationMinMaxAge4));
        System.assert(targetingSpecOperationMinMaxAge4.equals(targetingSpecOperationMinMaxAge3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge1 = OASTargetingSpecOperationMinMaxAge.getExample();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge2 = new OASTargetingSpecOperationMinMaxAge();

        System.assertEquals(false, targetingSpecOperationMinMaxAge1.equals('foo'));
        System.assertEquals(false, targetingSpecOperationMinMaxAge2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge1 = OASTargetingSpecOperationMinMaxAge.getExample();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge2 = new OASTargetingSpecOperationMinMaxAge();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge3;

        System.assertEquals(false, targetingSpecOperationMinMaxAge1.equals(targetingSpecOperationMinMaxAge3));
        System.assertEquals(false, targetingSpecOperationMinMaxAge2.equals(targetingSpecOperationMinMaxAge3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge1 = OASTargetingSpecOperationMinMaxAge.getExample();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge2 = new OASTargetingSpecOperationMinMaxAge();

        System.assertEquals(targetingSpecOperationMinMaxAge1.hashCode(), targetingSpecOperationMinMaxAge1.hashCode());
        System.assertEquals(targetingSpecOperationMinMaxAge2.hashCode(), targetingSpecOperationMinMaxAge2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge1 = OASTargetingSpecOperationMinMaxAge.getExample();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge2 = OASTargetingSpecOperationMinMaxAge.getExample();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge3 = new OASTargetingSpecOperationMinMaxAge();
        OASTargetingSpecOperationMinMaxAge targetingSpecOperationMinMaxAge4 = new OASTargetingSpecOperationMinMaxAge();

        System.assert(targetingSpecOperationMinMaxAge1.equals(targetingSpecOperationMinMaxAge2));
        System.assert(targetingSpecOperationMinMaxAge3.equals(targetingSpecOperationMinMaxAge4));
        System.assertEquals(targetingSpecOperationMinMaxAge1.hashCode(), targetingSpecOperationMinMaxAge2.hashCode());
        System.assertEquals(targetingSpecOperationMinMaxAge3.hashCode(), targetingSpecOperationMinMaxAge4.hashCode());
    }
}
