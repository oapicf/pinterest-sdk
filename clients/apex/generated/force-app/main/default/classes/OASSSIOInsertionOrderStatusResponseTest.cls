@isTest
private class OASSSIOInsertionOrderStatusResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse1 = OASSSIOInsertionOrderStatusResponse.getExample();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse2 = ssIOInsertionOrderStatusResponse1;
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse3 = new OASSSIOInsertionOrderStatusResponse();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse4 = ssIOInsertionOrderStatusResponse3;

        System.assert(ssIOInsertionOrderStatusResponse1.equals(ssIOInsertionOrderStatusResponse2));
        System.assert(ssIOInsertionOrderStatusResponse2.equals(ssIOInsertionOrderStatusResponse1));
        System.assert(ssIOInsertionOrderStatusResponse1.equals(ssIOInsertionOrderStatusResponse1));
        System.assert(ssIOInsertionOrderStatusResponse3.equals(ssIOInsertionOrderStatusResponse4));
        System.assert(ssIOInsertionOrderStatusResponse4.equals(ssIOInsertionOrderStatusResponse3));
        System.assert(ssIOInsertionOrderStatusResponse3.equals(ssIOInsertionOrderStatusResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse1 = OASSSIOInsertionOrderStatusResponse.getExample();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse2 = OASSSIOInsertionOrderStatusResponse.getExample();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse3 = new OASSSIOInsertionOrderStatusResponse();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse4 = new OASSSIOInsertionOrderStatusResponse();

        System.assert(ssIOInsertionOrderStatusResponse1.equals(ssIOInsertionOrderStatusResponse2));
        System.assert(ssIOInsertionOrderStatusResponse2.equals(ssIOInsertionOrderStatusResponse1));
        System.assert(ssIOInsertionOrderStatusResponse3.equals(ssIOInsertionOrderStatusResponse4));
        System.assert(ssIOInsertionOrderStatusResponse4.equals(ssIOInsertionOrderStatusResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse1 = OASSSIOInsertionOrderStatusResponse.getExample();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse2 = new OASSSIOInsertionOrderStatusResponse();

        System.assertEquals(false, ssIOInsertionOrderStatusResponse1.equals('foo'));
        System.assertEquals(false, ssIOInsertionOrderStatusResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse1 = OASSSIOInsertionOrderStatusResponse.getExample();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse2 = new OASSSIOInsertionOrderStatusResponse();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse3;

        System.assertEquals(false, ssIOInsertionOrderStatusResponse1.equals(ssIOInsertionOrderStatusResponse3));
        System.assertEquals(false, ssIOInsertionOrderStatusResponse2.equals(ssIOInsertionOrderStatusResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse1 = OASSSIOInsertionOrderStatusResponse.getExample();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse2 = new OASSSIOInsertionOrderStatusResponse();

        System.assertEquals(ssIOInsertionOrderStatusResponse1.hashCode(), ssIOInsertionOrderStatusResponse1.hashCode());
        System.assertEquals(ssIOInsertionOrderStatusResponse2.hashCode(), ssIOInsertionOrderStatusResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse1 = OASSSIOInsertionOrderStatusResponse.getExample();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse2 = OASSSIOInsertionOrderStatusResponse.getExample();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse3 = new OASSSIOInsertionOrderStatusResponse();
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse4 = new OASSSIOInsertionOrderStatusResponse();

        System.assert(ssIOInsertionOrderStatusResponse1.equals(ssIOInsertionOrderStatusResponse2));
        System.assert(ssIOInsertionOrderStatusResponse3.equals(ssIOInsertionOrderStatusResponse4));
        System.assertEquals(ssIOInsertionOrderStatusResponse1.hashCode(), ssIOInsertionOrderStatusResponse2.hashCode());
        System.assertEquals(ssIOInsertionOrderStatusResponse3.hashCode(), ssIOInsertionOrderStatusResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse = new OASSSIOInsertionOrderStatusResponse();
        Map<String, String> x-property-mappings = ssIOInsertionOrderStatusResponse.getx-property-mappings();
        System.assertEquals('pinOrderId', x-property-mappings.get('pin_order_id'));
        System.assertEquals('creationTime', x-property-mappings.get('creation_time'));
    }
}
