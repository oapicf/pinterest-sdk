@isTest
private class OASOrderLinesArrayResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderLinesArrayResponse orderLinesArrayResponse1 = OASOrderLinesArrayResponse.getExample();
        OASOrderLinesArrayResponse orderLinesArrayResponse2 = orderLinesArrayResponse1;
        OASOrderLinesArrayResponse orderLinesArrayResponse3 = new OASOrderLinesArrayResponse();
        OASOrderLinesArrayResponse orderLinesArrayResponse4 = orderLinesArrayResponse3;

        System.assert(orderLinesArrayResponse1.equals(orderLinesArrayResponse2));
        System.assert(orderLinesArrayResponse2.equals(orderLinesArrayResponse1));
        System.assert(orderLinesArrayResponse1.equals(orderLinesArrayResponse1));
        System.assert(orderLinesArrayResponse3.equals(orderLinesArrayResponse4));
        System.assert(orderLinesArrayResponse4.equals(orderLinesArrayResponse3));
        System.assert(orderLinesArrayResponse3.equals(orderLinesArrayResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderLinesArrayResponse orderLinesArrayResponse1 = OASOrderLinesArrayResponse.getExample();
        OASOrderLinesArrayResponse orderLinesArrayResponse2 = OASOrderLinesArrayResponse.getExample();
        OASOrderLinesArrayResponse orderLinesArrayResponse3 = new OASOrderLinesArrayResponse();
        OASOrderLinesArrayResponse orderLinesArrayResponse4 = new OASOrderLinesArrayResponse();

        System.assert(orderLinesArrayResponse1.equals(orderLinesArrayResponse2));
        System.assert(orderLinesArrayResponse2.equals(orderLinesArrayResponse1));
        System.assert(orderLinesArrayResponse3.equals(orderLinesArrayResponse4));
        System.assert(orderLinesArrayResponse4.equals(orderLinesArrayResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderLinesArrayResponse orderLinesArrayResponse1 = OASOrderLinesArrayResponse.getExample();
        OASOrderLinesArrayResponse orderLinesArrayResponse2 = new OASOrderLinesArrayResponse();

        System.assertEquals(false, orderLinesArrayResponse1.equals('foo'));
        System.assertEquals(false, orderLinesArrayResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderLinesArrayResponse orderLinesArrayResponse1 = OASOrderLinesArrayResponse.getExample();
        OASOrderLinesArrayResponse orderLinesArrayResponse2 = new OASOrderLinesArrayResponse();
        OASOrderLinesArrayResponse orderLinesArrayResponse3;

        System.assertEquals(false, orderLinesArrayResponse1.equals(orderLinesArrayResponse3));
        System.assertEquals(false, orderLinesArrayResponse2.equals(orderLinesArrayResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderLinesArrayResponse orderLinesArrayResponse1 = OASOrderLinesArrayResponse.getExample();
        OASOrderLinesArrayResponse orderLinesArrayResponse2 = new OASOrderLinesArrayResponse();

        System.assertEquals(orderLinesArrayResponse1.hashCode(), orderLinesArrayResponse1.hashCode());
        System.assertEquals(orderLinesArrayResponse2.hashCode(), orderLinesArrayResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderLinesArrayResponse orderLinesArrayResponse1 = OASOrderLinesArrayResponse.getExample();
        OASOrderLinesArrayResponse orderLinesArrayResponse2 = OASOrderLinesArrayResponse.getExample();
        OASOrderLinesArrayResponse orderLinesArrayResponse3 = new OASOrderLinesArrayResponse();
        OASOrderLinesArrayResponse orderLinesArrayResponse4 = new OASOrderLinesArrayResponse();

        System.assert(orderLinesArrayResponse1.equals(orderLinesArrayResponse2));
        System.assert(orderLinesArrayResponse3.equals(orderLinesArrayResponse4));
        System.assertEquals(orderLinesArrayResponse1.hashCode(), orderLinesArrayResponse2.hashCode());
        System.assertEquals(orderLinesArrayResponse3.hashCode(), orderLinesArrayResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderLinesArrayResponse orderLinesArrayResponse = new OASOrderLinesArrayResponse();
        System.assertEquals(new List<OASOrderLines>(), orderLinesArrayResponse.items);
    }
}
