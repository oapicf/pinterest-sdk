@isTest
private class OASDeliveryMetricsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeliveryMetricsResponse deliveryMetricsResponse1 = OASDeliveryMetricsResponse.getExample();
        OASDeliveryMetricsResponse deliveryMetricsResponse2 = deliveryMetricsResponse1;
        OASDeliveryMetricsResponse deliveryMetricsResponse3 = new OASDeliveryMetricsResponse();
        OASDeliveryMetricsResponse deliveryMetricsResponse4 = deliveryMetricsResponse3;

        System.assert(deliveryMetricsResponse1.equals(deliveryMetricsResponse2));
        System.assert(deliveryMetricsResponse2.equals(deliveryMetricsResponse1));
        System.assert(deliveryMetricsResponse1.equals(deliveryMetricsResponse1));
        System.assert(deliveryMetricsResponse3.equals(deliveryMetricsResponse4));
        System.assert(deliveryMetricsResponse4.equals(deliveryMetricsResponse3));
        System.assert(deliveryMetricsResponse3.equals(deliveryMetricsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeliveryMetricsResponse deliveryMetricsResponse1 = OASDeliveryMetricsResponse.getExample();
        OASDeliveryMetricsResponse deliveryMetricsResponse2 = OASDeliveryMetricsResponse.getExample();
        OASDeliveryMetricsResponse deliveryMetricsResponse3 = new OASDeliveryMetricsResponse();
        OASDeliveryMetricsResponse deliveryMetricsResponse4 = new OASDeliveryMetricsResponse();

        System.assert(deliveryMetricsResponse1.equals(deliveryMetricsResponse2));
        System.assert(deliveryMetricsResponse2.equals(deliveryMetricsResponse1));
        System.assert(deliveryMetricsResponse3.equals(deliveryMetricsResponse4));
        System.assert(deliveryMetricsResponse4.equals(deliveryMetricsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeliveryMetricsResponse deliveryMetricsResponse1 = OASDeliveryMetricsResponse.getExample();
        OASDeliveryMetricsResponse deliveryMetricsResponse2 = new OASDeliveryMetricsResponse();

        System.assertEquals(false, deliveryMetricsResponse1.equals('foo'));
        System.assertEquals(false, deliveryMetricsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeliveryMetricsResponse deliveryMetricsResponse1 = OASDeliveryMetricsResponse.getExample();
        OASDeliveryMetricsResponse deliveryMetricsResponse2 = new OASDeliveryMetricsResponse();
        OASDeliveryMetricsResponse deliveryMetricsResponse3;

        System.assertEquals(false, deliveryMetricsResponse1.equals(deliveryMetricsResponse3));
        System.assertEquals(false, deliveryMetricsResponse2.equals(deliveryMetricsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeliveryMetricsResponse deliveryMetricsResponse1 = OASDeliveryMetricsResponse.getExample();
        OASDeliveryMetricsResponse deliveryMetricsResponse2 = new OASDeliveryMetricsResponse();

        System.assertEquals(deliveryMetricsResponse1.hashCode(), deliveryMetricsResponse1.hashCode());
        System.assertEquals(deliveryMetricsResponse2.hashCode(), deliveryMetricsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeliveryMetricsResponse deliveryMetricsResponse1 = OASDeliveryMetricsResponse.getExample();
        OASDeliveryMetricsResponse deliveryMetricsResponse2 = OASDeliveryMetricsResponse.getExample();
        OASDeliveryMetricsResponse deliveryMetricsResponse3 = new OASDeliveryMetricsResponse();
        OASDeliveryMetricsResponse deliveryMetricsResponse4 = new OASDeliveryMetricsResponse();

        System.assert(deliveryMetricsResponse1.equals(deliveryMetricsResponse2));
        System.assert(deliveryMetricsResponse3.equals(deliveryMetricsResponse4));
        System.assertEquals(deliveryMetricsResponse1.hashCode(), deliveryMetricsResponse2.hashCode());
        System.assertEquals(deliveryMetricsResponse3.hashCode(), deliveryMetricsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeliveryMetricsResponse deliveryMetricsResponse = new OASDeliveryMetricsResponse();
        System.assertEquals(new List<OASDeliveryMetricsResponseItemsInner>(), deliveryMetricsResponse.items);
    }
}
