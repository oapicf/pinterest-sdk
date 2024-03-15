@isTest
private class OASOrderLineErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderLineError orderLineError1 = OASOrderLineError.getExample();
        OASOrderLineError orderLineError2 = orderLineError1;
        OASOrderLineError orderLineError3 = new OASOrderLineError();
        OASOrderLineError orderLineError4 = orderLineError3;

        System.assert(orderLineError1.equals(orderLineError2));
        System.assert(orderLineError2.equals(orderLineError1));
        System.assert(orderLineError1.equals(orderLineError1));
        System.assert(orderLineError3.equals(orderLineError4));
        System.assert(orderLineError4.equals(orderLineError3));
        System.assert(orderLineError3.equals(orderLineError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderLineError orderLineError1 = OASOrderLineError.getExample();
        OASOrderLineError orderLineError2 = OASOrderLineError.getExample();
        OASOrderLineError orderLineError3 = new OASOrderLineError();
        OASOrderLineError orderLineError4 = new OASOrderLineError();

        System.assert(orderLineError1.equals(orderLineError2));
        System.assert(orderLineError2.equals(orderLineError1));
        System.assert(orderLineError3.equals(orderLineError4));
        System.assert(orderLineError4.equals(orderLineError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderLineError orderLineError1 = OASOrderLineError.getExample();
        OASOrderLineError orderLineError2 = new OASOrderLineError();

        System.assertEquals(false, orderLineError1.equals('foo'));
        System.assertEquals(false, orderLineError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderLineError orderLineError1 = OASOrderLineError.getExample();
        OASOrderLineError orderLineError2 = new OASOrderLineError();
        OASOrderLineError orderLineError3;

        System.assertEquals(false, orderLineError1.equals(orderLineError3));
        System.assertEquals(false, orderLineError2.equals(orderLineError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderLineError orderLineError1 = OASOrderLineError.getExample();
        OASOrderLineError orderLineError2 = new OASOrderLineError();

        System.assertEquals(orderLineError1.hashCode(), orderLineError1.hashCode());
        System.assertEquals(orderLineError2.hashCode(), orderLineError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderLineError orderLineError1 = OASOrderLineError.getExample();
        OASOrderLineError orderLineError2 = OASOrderLineError.getExample();
        OASOrderLineError orderLineError3 = new OASOrderLineError();
        OASOrderLineError orderLineError4 = new OASOrderLineError();

        System.assert(orderLineError1.equals(orderLineError2));
        System.assert(orderLineError3.equals(orderLineError4));
        System.assertEquals(orderLineError1.hashCode(), orderLineError2.hashCode());
        System.assertEquals(orderLineError3.hashCode(), orderLineError4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrderLineError orderLineError = new OASOrderLineError();
        Map<String, String> x-property-mappings = orderLineError.getx-property-mappings();
        System.assertEquals('errorMessages', x-property-mappings.get('error_messages'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderLineError orderLineError = new OASOrderLineError();
        System.assertEquals(new List<String>(), orderLineError.errorMessages);
        System.assertEquals(null, orderLineError.data);
    }
}
