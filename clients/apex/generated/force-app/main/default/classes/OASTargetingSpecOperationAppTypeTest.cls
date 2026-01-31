@isTest
private class OASTargetingSpecOperationAppTypeTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingSpecOperationAppType targetingSpecOperationAppType1 = OASTargetingSpecOperationAppType.getExample();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType2 = targetingSpecOperationAppType1;
        OASTargetingSpecOperationAppType targetingSpecOperationAppType3 = new OASTargetingSpecOperationAppType();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType4 = targetingSpecOperationAppType3;

        System.assert(targetingSpecOperationAppType1.equals(targetingSpecOperationAppType2));
        System.assert(targetingSpecOperationAppType2.equals(targetingSpecOperationAppType1));
        System.assert(targetingSpecOperationAppType1.equals(targetingSpecOperationAppType1));
        System.assert(targetingSpecOperationAppType3.equals(targetingSpecOperationAppType4));
        System.assert(targetingSpecOperationAppType4.equals(targetingSpecOperationAppType3));
        System.assert(targetingSpecOperationAppType3.equals(targetingSpecOperationAppType3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingSpecOperationAppType targetingSpecOperationAppType1 = OASTargetingSpecOperationAppType.getExample();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType2 = OASTargetingSpecOperationAppType.getExample();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType3 = new OASTargetingSpecOperationAppType();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType4 = new OASTargetingSpecOperationAppType();

        System.assert(targetingSpecOperationAppType1.equals(targetingSpecOperationAppType2));
        System.assert(targetingSpecOperationAppType2.equals(targetingSpecOperationAppType1));
        System.assert(targetingSpecOperationAppType3.equals(targetingSpecOperationAppType4));
        System.assert(targetingSpecOperationAppType4.equals(targetingSpecOperationAppType3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingSpecOperationAppType targetingSpecOperationAppType1 = OASTargetingSpecOperationAppType.getExample();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType2 = new OASTargetingSpecOperationAppType();

        System.assertEquals(false, targetingSpecOperationAppType1.equals('foo'));
        System.assertEquals(false, targetingSpecOperationAppType2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingSpecOperationAppType targetingSpecOperationAppType1 = OASTargetingSpecOperationAppType.getExample();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType2 = new OASTargetingSpecOperationAppType();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType3;

        System.assertEquals(false, targetingSpecOperationAppType1.equals(targetingSpecOperationAppType3));
        System.assertEquals(false, targetingSpecOperationAppType2.equals(targetingSpecOperationAppType3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingSpecOperationAppType targetingSpecOperationAppType1 = OASTargetingSpecOperationAppType.getExample();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType2 = new OASTargetingSpecOperationAppType();

        System.assertEquals(targetingSpecOperationAppType1.hashCode(), targetingSpecOperationAppType1.hashCode());
        System.assertEquals(targetingSpecOperationAppType2.hashCode(), targetingSpecOperationAppType2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingSpecOperationAppType targetingSpecOperationAppType1 = OASTargetingSpecOperationAppType.getExample();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType2 = OASTargetingSpecOperationAppType.getExample();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType3 = new OASTargetingSpecOperationAppType();
        OASTargetingSpecOperationAppType targetingSpecOperationAppType4 = new OASTargetingSpecOperationAppType();

        System.assert(targetingSpecOperationAppType1.equals(targetingSpecOperationAppType2));
        System.assert(targetingSpecOperationAppType3.equals(targetingSpecOperationAppType4));
        System.assertEquals(targetingSpecOperationAppType1.hashCode(), targetingSpecOperationAppType2.hashCode());
        System.assertEquals(targetingSpecOperationAppType3.hashCode(), targetingSpecOperationAppType4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingSpecOperationAppType targetingSpecOperationAppType = new OASTargetingSpecOperationAppType();
        System.assertEquals(new List<OASTargetingSpecAppType>(), targetingSpecOperationAppType.values);
        System.assertEquals(null, targetingSpecOperationAppType.field);
        System.assertEquals(null, targetingSpecOperationAppType.operation);
    }
}
