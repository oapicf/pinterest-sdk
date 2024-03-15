@isTest
private class OASSSIOInsertionOrderStatusTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus1 = OASSSIOInsertionOrderStatus.getExample();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus2 = ssIOInsertionOrderStatus1;
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus3 = new OASSSIOInsertionOrderStatus();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus4 = ssIOInsertionOrderStatus3;

        System.assert(ssIOInsertionOrderStatus1.equals(ssIOInsertionOrderStatus2));
        System.assert(ssIOInsertionOrderStatus2.equals(ssIOInsertionOrderStatus1));
        System.assert(ssIOInsertionOrderStatus1.equals(ssIOInsertionOrderStatus1));
        System.assert(ssIOInsertionOrderStatus3.equals(ssIOInsertionOrderStatus4));
        System.assert(ssIOInsertionOrderStatus4.equals(ssIOInsertionOrderStatus3));
        System.assert(ssIOInsertionOrderStatus3.equals(ssIOInsertionOrderStatus3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus1 = OASSSIOInsertionOrderStatus.getExample();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus2 = OASSSIOInsertionOrderStatus.getExample();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus3 = new OASSSIOInsertionOrderStatus();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus4 = new OASSSIOInsertionOrderStatus();

        System.assert(ssIOInsertionOrderStatus1.equals(ssIOInsertionOrderStatus2));
        System.assert(ssIOInsertionOrderStatus2.equals(ssIOInsertionOrderStatus1));
        System.assert(ssIOInsertionOrderStatus3.equals(ssIOInsertionOrderStatus4));
        System.assert(ssIOInsertionOrderStatus4.equals(ssIOInsertionOrderStatus3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus1 = OASSSIOInsertionOrderStatus.getExample();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus2 = new OASSSIOInsertionOrderStatus();

        System.assertEquals(false, ssIOInsertionOrderStatus1.equals('foo'));
        System.assertEquals(false, ssIOInsertionOrderStatus2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus1 = OASSSIOInsertionOrderStatus.getExample();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus2 = new OASSSIOInsertionOrderStatus();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus3;

        System.assertEquals(false, ssIOInsertionOrderStatus1.equals(ssIOInsertionOrderStatus3));
        System.assertEquals(false, ssIOInsertionOrderStatus2.equals(ssIOInsertionOrderStatus3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus1 = OASSSIOInsertionOrderStatus.getExample();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus2 = new OASSSIOInsertionOrderStatus();

        System.assertEquals(ssIOInsertionOrderStatus1.hashCode(), ssIOInsertionOrderStatus1.hashCode());
        System.assertEquals(ssIOInsertionOrderStatus2.hashCode(), ssIOInsertionOrderStatus2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus1 = OASSSIOInsertionOrderStatus.getExample();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus2 = OASSSIOInsertionOrderStatus.getExample();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus3 = new OASSSIOInsertionOrderStatus();
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus4 = new OASSSIOInsertionOrderStatus();

        System.assert(ssIOInsertionOrderStatus1.equals(ssIOInsertionOrderStatus2));
        System.assert(ssIOInsertionOrderStatus3.equals(ssIOInsertionOrderStatus4));
        System.assertEquals(ssIOInsertionOrderStatus1.hashCode(), ssIOInsertionOrderStatus2.hashCode());
        System.assertEquals(ssIOInsertionOrderStatus3.hashCode(), ssIOInsertionOrderStatus4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSSIOInsertionOrderStatus ssIOInsertionOrderStatus = new OASSSIOInsertionOrderStatus();
        Map<String, String> x-property-mappings = ssIOInsertionOrderStatus.getx-property-mappings();
        System.assertEquals('pinOrderId', x-property-mappings.get('pin_order_id'));
        System.assertEquals('creationTime', x-property-mappings.get('creation_time'));
    }
}
