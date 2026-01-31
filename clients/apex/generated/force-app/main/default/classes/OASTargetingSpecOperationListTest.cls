@isTest
private class OASTargetingSpecOperationListTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingSpecOperationList targetingSpecOperationList1 = OASTargetingSpecOperationList.getExample();
        OASTargetingSpecOperationList targetingSpecOperationList2 = targetingSpecOperationList1;
        OASTargetingSpecOperationList targetingSpecOperationList3 = new OASTargetingSpecOperationList();
        OASTargetingSpecOperationList targetingSpecOperationList4 = targetingSpecOperationList3;

        System.assert(targetingSpecOperationList1.equals(targetingSpecOperationList2));
        System.assert(targetingSpecOperationList2.equals(targetingSpecOperationList1));
        System.assert(targetingSpecOperationList1.equals(targetingSpecOperationList1));
        System.assert(targetingSpecOperationList3.equals(targetingSpecOperationList4));
        System.assert(targetingSpecOperationList4.equals(targetingSpecOperationList3));
        System.assert(targetingSpecOperationList3.equals(targetingSpecOperationList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingSpecOperationList targetingSpecOperationList1 = OASTargetingSpecOperationList.getExample();
        OASTargetingSpecOperationList targetingSpecOperationList2 = OASTargetingSpecOperationList.getExample();
        OASTargetingSpecOperationList targetingSpecOperationList3 = new OASTargetingSpecOperationList();
        OASTargetingSpecOperationList targetingSpecOperationList4 = new OASTargetingSpecOperationList();

        System.assert(targetingSpecOperationList1.equals(targetingSpecOperationList2));
        System.assert(targetingSpecOperationList2.equals(targetingSpecOperationList1));
        System.assert(targetingSpecOperationList3.equals(targetingSpecOperationList4));
        System.assert(targetingSpecOperationList4.equals(targetingSpecOperationList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingSpecOperationList targetingSpecOperationList1 = OASTargetingSpecOperationList.getExample();
        OASTargetingSpecOperationList targetingSpecOperationList2 = new OASTargetingSpecOperationList();

        System.assertEquals(false, targetingSpecOperationList1.equals('foo'));
        System.assertEquals(false, targetingSpecOperationList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingSpecOperationList targetingSpecOperationList1 = OASTargetingSpecOperationList.getExample();
        OASTargetingSpecOperationList targetingSpecOperationList2 = new OASTargetingSpecOperationList();
        OASTargetingSpecOperationList targetingSpecOperationList3;

        System.assertEquals(false, targetingSpecOperationList1.equals(targetingSpecOperationList3));
        System.assertEquals(false, targetingSpecOperationList2.equals(targetingSpecOperationList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingSpecOperationList targetingSpecOperationList1 = OASTargetingSpecOperationList.getExample();
        OASTargetingSpecOperationList targetingSpecOperationList2 = new OASTargetingSpecOperationList();

        System.assertEquals(targetingSpecOperationList1.hashCode(), targetingSpecOperationList1.hashCode());
        System.assertEquals(targetingSpecOperationList2.hashCode(), targetingSpecOperationList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingSpecOperationList targetingSpecOperationList1 = OASTargetingSpecOperationList.getExample();
        OASTargetingSpecOperationList targetingSpecOperationList2 = OASTargetingSpecOperationList.getExample();
        OASTargetingSpecOperationList targetingSpecOperationList3 = new OASTargetingSpecOperationList();
        OASTargetingSpecOperationList targetingSpecOperationList4 = new OASTargetingSpecOperationList();

        System.assert(targetingSpecOperationList1.equals(targetingSpecOperationList2));
        System.assert(targetingSpecOperationList3.equals(targetingSpecOperationList4));
        System.assertEquals(targetingSpecOperationList1.hashCode(), targetingSpecOperationList2.hashCode());
        System.assertEquals(targetingSpecOperationList3.hashCode(), targetingSpecOperationList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingSpecOperationList targetingSpecOperationList = new OASTargetingSpecOperationList();
        System.assertEquals(new List<String>(), targetingSpecOperationList.values);
        System.assertEquals(null, targetingSpecOperationList.field);
        System.assertEquals(null, targetingSpecOperationList.operation);
    }
}
