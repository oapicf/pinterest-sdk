@isTest
private class OASSsioInsertionOrdersStatusGetByAdATest {
    @isTest
    private static void equalsSameInstance() {
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response1 = OASSsioInsertionOrdersStatusGetByAdA.getExample();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response2 = ssioInsertionOrdersStatusGetByAdAccount200Response1;
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response3 = new OASSsioInsertionOrdersStatusGetByAdA();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response4 = ssioInsertionOrdersStatusGetByAdAccount200Response3;

        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response1.equals(ssioInsertionOrdersStatusGetByAdAccount200Response2));
        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response2.equals(ssioInsertionOrdersStatusGetByAdAccount200Response1));
        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response1.equals(ssioInsertionOrdersStatusGetByAdAccount200Response1));
        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response3.equals(ssioInsertionOrdersStatusGetByAdAccount200Response4));
        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response4.equals(ssioInsertionOrdersStatusGetByAdAccount200Response3));
        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response3.equals(ssioInsertionOrdersStatusGetByAdAccount200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response1 = OASSsioInsertionOrdersStatusGetByAdA.getExample();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response2 = OASSsioInsertionOrdersStatusGetByAdA.getExample();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response3 = new OASSsioInsertionOrdersStatusGetByAdA();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response4 = new OASSsioInsertionOrdersStatusGetByAdA();

        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response1.equals(ssioInsertionOrdersStatusGetByAdAccount200Response2));
        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response2.equals(ssioInsertionOrdersStatusGetByAdAccount200Response1));
        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response3.equals(ssioInsertionOrdersStatusGetByAdAccount200Response4));
        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response4.equals(ssioInsertionOrdersStatusGetByAdAccount200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response1 = OASSsioInsertionOrdersStatusGetByAdA.getExample();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response2 = new OASSsioInsertionOrdersStatusGetByAdA();

        System.assertEquals(false, ssioInsertionOrdersStatusGetByAdAccount200Response1.equals('foo'));
        System.assertEquals(false, ssioInsertionOrdersStatusGetByAdAccount200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response1 = OASSsioInsertionOrdersStatusGetByAdA.getExample();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response2 = new OASSsioInsertionOrdersStatusGetByAdA();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response3;

        System.assertEquals(false, ssioInsertionOrdersStatusGetByAdAccount200Response1.equals(ssioInsertionOrdersStatusGetByAdAccount200Response3));
        System.assertEquals(false, ssioInsertionOrdersStatusGetByAdAccount200Response2.equals(ssioInsertionOrdersStatusGetByAdAccount200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response1 = OASSsioInsertionOrdersStatusGetByAdA.getExample();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response2 = new OASSsioInsertionOrdersStatusGetByAdA();

        System.assertEquals(ssioInsertionOrdersStatusGetByAdAccount200Response1.hashCode(), ssioInsertionOrdersStatusGetByAdAccount200Response1.hashCode());
        System.assertEquals(ssioInsertionOrdersStatusGetByAdAccount200Response2.hashCode(), ssioInsertionOrdersStatusGetByAdAccount200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response1 = OASSsioInsertionOrdersStatusGetByAdA.getExample();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response2 = OASSsioInsertionOrdersStatusGetByAdA.getExample();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response3 = new OASSsioInsertionOrdersStatusGetByAdA();
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response4 = new OASSsioInsertionOrdersStatusGetByAdA();

        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response1.equals(ssioInsertionOrdersStatusGetByAdAccount200Response2));
        System.assert(ssioInsertionOrdersStatusGetByAdAccount200Response3.equals(ssioInsertionOrdersStatusGetByAdAccount200Response4));
        System.assertEquals(ssioInsertionOrdersStatusGetByAdAccount200Response1.hashCode(), ssioInsertionOrdersStatusGetByAdAccount200Response2.hashCode());
        System.assertEquals(ssioInsertionOrdersStatusGetByAdAccount200Response3.hashCode(), ssioInsertionOrdersStatusGetByAdAccount200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount200Response = new OASSsioInsertionOrdersStatusGetByAdA();
        System.assertEquals(new List<OASSSIOInsertionOrderStatus>(), ssioInsertionOrdersStatusGetByAdAccount200Response.items);
        System.assertEquals(null, ssioInsertionOrdersStatusGetByAdAccount200Response.bookmark);
    }
}
