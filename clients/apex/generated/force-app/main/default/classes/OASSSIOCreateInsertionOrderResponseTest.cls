@isTest
private class OASSSIOCreateInsertionOrderResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse1 = OASSSIOCreateInsertionOrderResponse.getExample();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse2 = ssIOCreateInsertionOrderResponse1;
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse3 = new OASSSIOCreateInsertionOrderResponse();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse4 = ssIOCreateInsertionOrderResponse3;

        System.assert(ssIOCreateInsertionOrderResponse1.equals(ssIOCreateInsertionOrderResponse2));
        System.assert(ssIOCreateInsertionOrderResponse2.equals(ssIOCreateInsertionOrderResponse1));
        System.assert(ssIOCreateInsertionOrderResponse1.equals(ssIOCreateInsertionOrderResponse1));
        System.assert(ssIOCreateInsertionOrderResponse3.equals(ssIOCreateInsertionOrderResponse4));
        System.assert(ssIOCreateInsertionOrderResponse4.equals(ssIOCreateInsertionOrderResponse3));
        System.assert(ssIOCreateInsertionOrderResponse3.equals(ssIOCreateInsertionOrderResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse1 = OASSSIOCreateInsertionOrderResponse.getExample();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse2 = OASSSIOCreateInsertionOrderResponse.getExample();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse3 = new OASSSIOCreateInsertionOrderResponse();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse4 = new OASSSIOCreateInsertionOrderResponse();

        System.assert(ssIOCreateInsertionOrderResponse1.equals(ssIOCreateInsertionOrderResponse2));
        System.assert(ssIOCreateInsertionOrderResponse2.equals(ssIOCreateInsertionOrderResponse1));
        System.assert(ssIOCreateInsertionOrderResponse3.equals(ssIOCreateInsertionOrderResponse4));
        System.assert(ssIOCreateInsertionOrderResponse4.equals(ssIOCreateInsertionOrderResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse1 = OASSSIOCreateInsertionOrderResponse.getExample();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse2 = new OASSSIOCreateInsertionOrderResponse();

        System.assertEquals(false, ssIOCreateInsertionOrderResponse1.equals('foo'));
        System.assertEquals(false, ssIOCreateInsertionOrderResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse1 = OASSSIOCreateInsertionOrderResponse.getExample();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse2 = new OASSSIOCreateInsertionOrderResponse();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse3;

        System.assertEquals(false, ssIOCreateInsertionOrderResponse1.equals(ssIOCreateInsertionOrderResponse3));
        System.assertEquals(false, ssIOCreateInsertionOrderResponse2.equals(ssIOCreateInsertionOrderResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse1 = OASSSIOCreateInsertionOrderResponse.getExample();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse2 = new OASSSIOCreateInsertionOrderResponse();

        System.assertEquals(ssIOCreateInsertionOrderResponse1.hashCode(), ssIOCreateInsertionOrderResponse1.hashCode());
        System.assertEquals(ssIOCreateInsertionOrderResponse2.hashCode(), ssIOCreateInsertionOrderResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse1 = OASSSIOCreateInsertionOrderResponse.getExample();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse2 = OASSSIOCreateInsertionOrderResponse.getExample();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse3 = new OASSSIOCreateInsertionOrderResponse();
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse4 = new OASSSIOCreateInsertionOrderResponse();

        System.assert(ssIOCreateInsertionOrderResponse1.equals(ssIOCreateInsertionOrderResponse2));
        System.assert(ssIOCreateInsertionOrderResponse3.equals(ssIOCreateInsertionOrderResponse4));
        System.assertEquals(ssIOCreateInsertionOrderResponse1.hashCode(), ssIOCreateInsertionOrderResponse2.hashCode());
        System.assertEquals(ssIOCreateInsertionOrderResponse3.hashCode(), ssIOCreateInsertionOrderResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse = new OASSSIOCreateInsertionOrderResponse();
        Map<String, String> x-property-mappings = ssIOCreateInsertionOrderResponse.getx-property-mappings();
        System.assertEquals('pinOrderId', x-property-mappings.get('pin_order_id'));
    }
}
