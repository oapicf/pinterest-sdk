@isTest
private class OASSSIOEditInsertionOrderResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse1 = OASSSIOEditInsertionOrderResponse.getExample();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse2 = ssIOEditInsertionOrderResponse1;
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse3 = new OASSSIOEditInsertionOrderResponse();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse4 = ssIOEditInsertionOrderResponse3;

        System.assert(ssIOEditInsertionOrderResponse1.equals(ssIOEditInsertionOrderResponse2));
        System.assert(ssIOEditInsertionOrderResponse2.equals(ssIOEditInsertionOrderResponse1));
        System.assert(ssIOEditInsertionOrderResponse1.equals(ssIOEditInsertionOrderResponse1));
        System.assert(ssIOEditInsertionOrderResponse3.equals(ssIOEditInsertionOrderResponse4));
        System.assert(ssIOEditInsertionOrderResponse4.equals(ssIOEditInsertionOrderResponse3));
        System.assert(ssIOEditInsertionOrderResponse3.equals(ssIOEditInsertionOrderResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse1 = OASSSIOEditInsertionOrderResponse.getExample();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse2 = OASSSIOEditInsertionOrderResponse.getExample();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse3 = new OASSSIOEditInsertionOrderResponse();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse4 = new OASSSIOEditInsertionOrderResponse();

        System.assert(ssIOEditInsertionOrderResponse1.equals(ssIOEditInsertionOrderResponse2));
        System.assert(ssIOEditInsertionOrderResponse2.equals(ssIOEditInsertionOrderResponse1));
        System.assert(ssIOEditInsertionOrderResponse3.equals(ssIOEditInsertionOrderResponse4));
        System.assert(ssIOEditInsertionOrderResponse4.equals(ssIOEditInsertionOrderResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse1 = OASSSIOEditInsertionOrderResponse.getExample();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse2 = new OASSSIOEditInsertionOrderResponse();

        System.assertEquals(false, ssIOEditInsertionOrderResponse1.equals('foo'));
        System.assertEquals(false, ssIOEditInsertionOrderResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse1 = OASSSIOEditInsertionOrderResponse.getExample();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse2 = new OASSSIOEditInsertionOrderResponse();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse3;

        System.assertEquals(false, ssIOEditInsertionOrderResponse1.equals(ssIOEditInsertionOrderResponse3));
        System.assertEquals(false, ssIOEditInsertionOrderResponse2.equals(ssIOEditInsertionOrderResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse1 = OASSSIOEditInsertionOrderResponse.getExample();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse2 = new OASSSIOEditInsertionOrderResponse();

        System.assertEquals(ssIOEditInsertionOrderResponse1.hashCode(), ssIOEditInsertionOrderResponse1.hashCode());
        System.assertEquals(ssIOEditInsertionOrderResponse2.hashCode(), ssIOEditInsertionOrderResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse1 = OASSSIOEditInsertionOrderResponse.getExample();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse2 = OASSSIOEditInsertionOrderResponse.getExample();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse3 = new OASSSIOEditInsertionOrderResponse();
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse4 = new OASSSIOEditInsertionOrderResponse();

        System.assert(ssIOEditInsertionOrderResponse1.equals(ssIOEditInsertionOrderResponse2));
        System.assert(ssIOEditInsertionOrderResponse3.equals(ssIOEditInsertionOrderResponse4));
        System.assertEquals(ssIOEditInsertionOrderResponse1.hashCode(), ssIOEditInsertionOrderResponse2.hashCode());
        System.assertEquals(ssIOEditInsertionOrderResponse3.hashCode(), ssIOEditInsertionOrderResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSSIOEditInsertionOrderResponse ssIOEditInsertionOrderResponse = new OASSSIOEditInsertionOrderResponse();
        Map<String, String> x-property-mappings = ssIOEditInsertionOrderResponse.getx-property-mappings();
        System.assertEquals('pinOrderId', x-property-mappings.get('pin_order_id'));
    }
}
