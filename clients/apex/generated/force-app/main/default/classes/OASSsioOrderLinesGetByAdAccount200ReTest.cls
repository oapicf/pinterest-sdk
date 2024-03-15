@isTest
private class OASSsioOrderLinesGetByAdAccount200ReTest {
    @isTest
    private static void equalsSameInstance() {
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response1 = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response2 = ssioOrderLinesGetByAdAccount200Response1;
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response3 = new OASSsioOrderLinesGetByAdAccount200Re();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response4 = ssioOrderLinesGetByAdAccount200Response3;

        System.assert(ssioOrderLinesGetByAdAccount200Response1.equals(ssioOrderLinesGetByAdAccount200Response2));
        System.assert(ssioOrderLinesGetByAdAccount200Response2.equals(ssioOrderLinesGetByAdAccount200Response1));
        System.assert(ssioOrderLinesGetByAdAccount200Response1.equals(ssioOrderLinesGetByAdAccount200Response1));
        System.assert(ssioOrderLinesGetByAdAccount200Response3.equals(ssioOrderLinesGetByAdAccount200Response4));
        System.assert(ssioOrderLinesGetByAdAccount200Response4.equals(ssioOrderLinesGetByAdAccount200Response3));
        System.assert(ssioOrderLinesGetByAdAccount200Response3.equals(ssioOrderLinesGetByAdAccount200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response1 = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response2 = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response3 = new OASSsioOrderLinesGetByAdAccount200Re();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response4 = new OASSsioOrderLinesGetByAdAccount200Re();

        System.assert(ssioOrderLinesGetByAdAccount200Response1.equals(ssioOrderLinesGetByAdAccount200Response2));
        System.assert(ssioOrderLinesGetByAdAccount200Response2.equals(ssioOrderLinesGetByAdAccount200Response1));
        System.assert(ssioOrderLinesGetByAdAccount200Response3.equals(ssioOrderLinesGetByAdAccount200Response4));
        System.assert(ssioOrderLinesGetByAdAccount200Response4.equals(ssioOrderLinesGetByAdAccount200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response1 = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response2 = new OASSsioOrderLinesGetByAdAccount200Re();

        System.assertEquals(false, ssioOrderLinesGetByAdAccount200Response1.equals('foo'));
        System.assertEquals(false, ssioOrderLinesGetByAdAccount200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response1 = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response2 = new OASSsioOrderLinesGetByAdAccount200Re();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response3;

        System.assertEquals(false, ssioOrderLinesGetByAdAccount200Response1.equals(ssioOrderLinesGetByAdAccount200Response3));
        System.assertEquals(false, ssioOrderLinesGetByAdAccount200Response2.equals(ssioOrderLinesGetByAdAccount200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response1 = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response2 = new OASSsioOrderLinesGetByAdAccount200Re();

        System.assertEquals(ssioOrderLinesGetByAdAccount200Response1.hashCode(), ssioOrderLinesGetByAdAccount200Response1.hashCode());
        System.assertEquals(ssioOrderLinesGetByAdAccount200Response2.hashCode(), ssioOrderLinesGetByAdAccount200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response1 = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response2 = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response3 = new OASSsioOrderLinesGetByAdAccount200Re();
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response4 = new OASSsioOrderLinesGetByAdAccount200Re();

        System.assert(ssioOrderLinesGetByAdAccount200Response1.equals(ssioOrderLinesGetByAdAccount200Response2));
        System.assert(ssioOrderLinesGetByAdAccount200Response3.equals(ssioOrderLinesGetByAdAccount200Response4));
        System.assertEquals(ssioOrderLinesGetByAdAccount200Response1.hashCode(), ssioOrderLinesGetByAdAccount200Response2.hashCode());
        System.assertEquals(ssioOrderLinesGetByAdAccount200Response3.hashCode(), ssioOrderLinesGetByAdAccount200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount200Response = new OASSsioOrderLinesGetByAdAccount200Re();
        System.assertEquals(new List<OASSSIOOrderLine>(), ssioOrderLinesGetByAdAccount200Response.items);
        System.assertEquals(null, ssioOrderLinesGetByAdAccount200Response.bookmark);
    }
}
