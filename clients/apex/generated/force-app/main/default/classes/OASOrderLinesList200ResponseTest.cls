@isTest
private class OASOrderLinesList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderLinesList200Response orderLinesList200Response1 = OASOrderLinesList200Response.getExample();
        OASOrderLinesList200Response orderLinesList200Response2 = orderLinesList200Response1;
        OASOrderLinesList200Response orderLinesList200Response3 = new OASOrderLinesList200Response();
        OASOrderLinesList200Response orderLinesList200Response4 = orderLinesList200Response3;

        System.assert(orderLinesList200Response1.equals(orderLinesList200Response2));
        System.assert(orderLinesList200Response2.equals(orderLinesList200Response1));
        System.assert(orderLinesList200Response1.equals(orderLinesList200Response1));
        System.assert(orderLinesList200Response3.equals(orderLinesList200Response4));
        System.assert(orderLinesList200Response4.equals(orderLinesList200Response3));
        System.assert(orderLinesList200Response3.equals(orderLinesList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderLinesList200Response orderLinesList200Response1 = OASOrderLinesList200Response.getExample();
        OASOrderLinesList200Response orderLinesList200Response2 = OASOrderLinesList200Response.getExample();
        OASOrderLinesList200Response orderLinesList200Response3 = new OASOrderLinesList200Response();
        OASOrderLinesList200Response orderLinesList200Response4 = new OASOrderLinesList200Response();

        System.assert(orderLinesList200Response1.equals(orderLinesList200Response2));
        System.assert(orderLinesList200Response2.equals(orderLinesList200Response1));
        System.assert(orderLinesList200Response3.equals(orderLinesList200Response4));
        System.assert(orderLinesList200Response4.equals(orderLinesList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderLinesList200Response orderLinesList200Response1 = OASOrderLinesList200Response.getExample();
        OASOrderLinesList200Response orderLinesList200Response2 = new OASOrderLinesList200Response();

        System.assertEquals(false, orderLinesList200Response1.equals('foo'));
        System.assertEquals(false, orderLinesList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderLinesList200Response orderLinesList200Response1 = OASOrderLinesList200Response.getExample();
        OASOrderLinesList200Response orderLinesList200Response2 = new OASOrderLinesList200Response();
        OASOrderLinesList200Response orderLinesList200Response3;

        System.assertEquals(false, orderLinesList200Response1.equals(orderLinesList200Response3));
        System.assertEquals(false, orderLinesList200Response2.equals(orderLinesList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderLinesList200Response orderLinesList200Response1 = OASOrderLinesList200Response.getExample();
        OASOrderLinesList200Response orderLinesList200Response2 = new OASOrderLinesList200Response();

        System.assertEquals(orderLinesList200Response1.hashCode(), orderLinesList200Response1.hashCode());
        System.assertEquals(orderLinesList200Response2.hashCode(), orderLinesList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderLinesList200Response orderLinesList200Response1 = OASOrderLinesList200Response.getExample();
        OASOrderLinesList200Response orderLinesList200Response2 = OASOrderLinesList200Response.getExample();
        OASOrderLinesList200Response orderLinesList200Response3 = new OASOrderLinesList200Response();
        OASOrderLinesList200Response orderLinesList200Response4 = new OASOrderLinesList200Response();

        System.assert(orderLinesList200Response1.equals(orderLinesList200Response2));
        System.assert(orderLinesList200Response3.equals(orderLinesList200Response4));
        System.assertEquals(orderLinesList200Response1.hashCode(), orderLinesList200Response2.hashCode());
        System.assertEquals(orderLinesList200Response3.hashCode(), orderLinesList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderLinesList200Response orderLinesList200Response = new OASOrderLinesList200Response();
        System.assertEquals(new List<OASOrderLine>(), orderLinesList200Response.items);
        System.assertEquals(null, orderLinesList200Response.bookmark);
    }
}
