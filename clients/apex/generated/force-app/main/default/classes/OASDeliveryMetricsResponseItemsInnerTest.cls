@isTest
private class OASDeliveryMetricsResponseItemsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner1 = OASDeliveryMetricsResponseItemsInner.getExample();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner2 = deliveryMetricsResponseItemsInner1;
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner3 = new OASDeliveryMetricsResponseItemsInner();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner4 = deliveryMetricsResponseItemsInner3;

        System.assert(deliveryMetricsResponseItemsInner1.equals(deliveryMetricsResponseItemsInner2));
        System.assert(deliveryMetricsResponseItemsInner2.equals(deliveryMetricsResponseItemsInner1));
        System.assert(deliveryMetricsResponseItemsInner1.equals(deliveryMetricsResponseItemsInner1));
        System.assert(deliveryMetricsResponseItemsInner3.equals(deliveryMetricsResponseItemsInner4));
        System.assert(deliveryMetricsResponseItemsInner4.equals(deliveryMetricsResponseItemsInner3));
        System.assert(deliveryMetricsResponseItemsInner3.equals(deliveryMetricsResponseItemsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner1 = OASDeliveryMetricsResponseItemsInner.getExample();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner2 = OASDeliveryMetricsResponseItemsInner.getExample();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner3 = new OASDeliveryMetricsResponseItemsInner();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner4 = new OASDeliveryMetricsResponseItemsInner();

        System.assert(deliveryMetricsResponseItemsInner1.equals(deliveryMetricsResponseItemsInner2));
        System.assert(deliveryMetricsResponseItemsInner2.equals(deliveryMetricsResponseItemsInner1));
        System.assert(deliveryMetricsResponseItemsInner3.equals(deliveryMetricsResponseItemsInner4));
        System.assert(deliveryMetricsResponseItemsInner4.equals(deliveryMetricsResponseItemsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner1 = OASDeliveryMetricsResponseItemsInner.getExample();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner2 = new OASDeliveryMetricsResponseItemsInner();

        System.assertEquals(false, deliveryMetricsResponseItemsInner1.equals('foo'));
        System.assertEquals(false, deliveryMetricsResponseItemsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner1 = OASDeliveryMetricsResponseItemsInner.getExample();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner2 = new OASDeliveryMetricsResponseItemsInner();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner3;

        System.assertEquals(false, deliveryMetricsResponseItemsInner1.equals(deliveryMetricsResponseItemsInner3));
        System.assertEquals(false, deliveryMetricsResponseItemsInner2.equals(deliveryMetricsResponseItemsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner1 = OASDeliveryMetricsResponseItemsInner.getExample();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner2 = new OASDeliveryMetricsResponseItemsInner();

        System.assertEquals(deliveryMetricsResponseItemsInner1.hashCode(), deliveryMetricsResponseItemsInner1.hashCode());
        System.assertEquals(deliveryMetricsResponseItemsInner2.hashCode(), deliveryMetricsResponseItemsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner1 = OASDeliveryMetricsResponseItemsInner.getExample();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner2 = OASDeliveryMetricsResponseItemsInner.getExample();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner3 = new OASDeliveryMetricsResponseItemsInner();
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner4 = new OASDeliveryMetricsResponseItemsInner();

        System.assert(deliveryMetricsResponseItemsInner1.equals(deliveryMetricsResponseItemsInner2));
        System.assert(deliveryMetricsResponseItemsInner3.equals(deliveryMetricsResponseItemsInner4));
        System.assertEquals(deliveryMetricsResponseItemsInner1.hashCode(), deliveryMetricsResponseItemsInner2.hashCode());
        System.assertEquals(deliveryMetricsResponseItemsInner3.hashCode(), deliveryMetricsResponseItemsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner = new OASDeliveryMetricsResponseItemsInner();
        Map<String, String> x-property-mappings = deliveryMetricsResponseItemsInner.getx-property-mappings();
        System.assertEquals('displayName', x-property-mappings.get('display_name'));
    }
}
