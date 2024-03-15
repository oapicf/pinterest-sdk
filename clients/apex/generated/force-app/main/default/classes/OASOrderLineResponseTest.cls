@isTest
private class OASOrderLineResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderLineResponse orderLineResponse1 = OASOrderLineResponse.getExample();
        OASOrderLineResponse orderLineResponse2 = orderLineResponse1;
        OASOrderLineResponse orderLineResponse3 = new OASOrderLineResponse();
        OASOrderLineResponse orderLineResponse4 = orderLineResponse3;

        System.assert(orderLineResponse1.equals(orderLineResponse2));
        System.assert(orderLineResponse2.equals(orderLineResponse1));
        System.assert(orderLineResponse1.equals(orderLineResponse1));
        System.assert(orderLineResponse3.equals(orderLineResponse4));
        System.assert(orderLineResponse4.equals(orderLineResponse3));
        System.assert(orderLineResponse3.equals(orderLineResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderLineResponse orderLineResponse1 = OASOrderLineResponse.getExample();
        OASOrderLineResponse orderLineResponse2 = OASOrderLineResponse.getExample();
        OASOrderLineResponse orderLineResponse3 = new OASOrderLineResponse();
        OASOrderLineResponse orderLineResponse4 = new OASOrderLineResponse();

        System.assert(orderLineResponse1.equals(orderLineResponse2));
        System.assert(orderLineResponse2.equals(orderLineResponse1));
        System.assert(orderLineResponse3.equals(orderLineResponse4));
        System.assert(orderLineResponse4.equals(orderLineResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderLineResponse orderLineResponse1 = OASOrderLineResponse.getExample();
        OASOrderLineResponse orderLineResponse2 = new OASOrderLineResponse();

        System.assertEquals(false, orderLineResponse1.equals('foo'));
        System.assertEquals(false, orderLineResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderLineResponse orderLineResponse1 = OASOrderLineResponse.getExample();
        OASOrderLineResponse orderLineResponse2 = new OASOrderLineResponse();
        OASOrderLineResponse orderLineResponse3;

        System.assertEquals(false, orderLineResponse1.equals(orderLineResponse3));
        System.assertEquals(false, orderLineResponse2.equals(orderLineResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderLineResponse orderLineResponse1 = OASOrderLineResponse.getExample();
        OASOrderLineResponse orderLineResponse2 = new OASOrderLineResponse();

        System.assertEquals(orderLineResponse1.hashCode(), orderLineResponse1.hashCode());
        System.assertEquals(orderLineResponse2.hashCode(), orderLineResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderLineResponse orderLineResponse1 = OASOrderLineResponse.getExample();
        OASOrderLineResponse orderLineResponse2 = OASOrderLineResponse.getExample();
        OASOrderLineResponse orderLineResponse3 = new OASOrderLineResponse();
        OASOrderLineResponse orderLineResponse4 = new OASOrderLineResponse();

        System.assert(orderLineResponse1.equals(orderLineResponse2));
        System.assert(orderLineResponse3.equals(orderLineResponse4));
        System.assertEquals(orderLineResponse1.hashCode(), orderLineResponse2.hashCode());
        System.assertEquals(orderLineResponse3.hashCode(), orderLineResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrderLineResponse orderLineResponse = new OASOrderLineResponse();
        Map<String, String> x-property-mappings = orderLineResponse.getx-property-mappings();
        System.assertEquals('orderLine', x-property-mappings.get('order_line'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderLineResponse orderLineResponse = new OASOrderLineResponse();
        System.assertEquals(new List<OASOrderLineError>(), orderLineResponse.errors);
        System.assertEquals(new List<OASOrderLine>(), orderLineResponse.orderLine);
    }
}
