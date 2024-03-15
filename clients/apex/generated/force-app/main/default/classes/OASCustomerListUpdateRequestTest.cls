@isTest
private class OASCustomerListUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomerListUpdateRequest customerListUpdateRequest1 = OASCustomerListUpdateRequest.getExample();
        OASCustomerListUpdateRequest customerListUpdateRequest2 = customerListUpdateRequest1;
        OASCustomerListUpdateRequest customerListUpdateRequest3 = new OASCustomerListUpdateRequest();
        OASCustomerListUpdateRequest customerListUpdateRequest4 = customerListUpdateRequest3;

        System.assert(customerListUpdateRequest1.equals(customerListUpdateRequest2));
        System.assert(customerListUpdateRequest2.equals(customerListUpdateRequest1));
        System.assert(customerListUpdateRequest1.equals(customerListUpdateRequest1));
        System.assert(customerListUpdateRequest3.equals(customerListUpdateRequest4));
        System.assert(customerListUpdateRequest4.equals(customerListUpdateRequest3));
        System.assert(customerListUpdateRequest3.equals(customerListUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomerListUpdateRequest customerListUpdateRequest1 = OASCustomerListUpdateRequest.getExample();
        OASCustomerListUpdateRequest customerListUpdateRequest2 = OASCustomerListUpdateRequest.getExample();
        OASCustomerListUpdateRequest customerListUpdateRequest3 = new OASCustomerListUpdateRequest();
        OASCustomerListUpdateRequest customerListUpdateRequest4 = new OASCustomerListUpdateRequest();

        System.assert(customerListUpdateRequest1.equals(customerListUpdateRequest2));
        System.assert(customerListUpdateRequest2.equals(customerListUpdateRequest1));
        System.assert(customerListUpdateRequest3.equals(customerListUpdateRequest4));
        System.assert(customerListUpdateRequest4.equals(customerListUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomerListUpdateRequest customerListUpdateRequest1 = OASCustomerListUpdateRequest.getExample();
        OASCustomerListUpdateRequest customerListUpdateRequest2 = new OASCustomerListUpdateRequest();

        System.assertEquals(false, customerListUpdateRequest1.equals('foo'));
        System.assertEquals(false, customerListUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomerListUpdateRequest customerListUpdateRequest1 = OASCustomerListUpdateRequest.getExample();
        OASCustomerListUpdateRequest customerListUpdateRequest2 = new OASCustomerListUpdateRequest();
        OASCustomerListUpdateRequest customerListUpdateRequest3;

        System.assertEquals(false, customerListUpdateRequest1.equals(customerListUpdateRequest3));
        System.assertEquals(false, customerListUpdateRequest2.equals(customerListUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomerListUpdateRequest customerListUpdateRequest1 = OASCustomerListUpdateRequest.getExample();
        OASCustomerListUpdateRequest customerListUpdateRequest2 = new OASCustomerListUpdateRequest();

        System.assertEquals(customerListUpdateRequest1.hashCode(), customerListUpdateRequest1.hashCode());
        System.assertEquals(customerListUpdateRequest2.hashCode(), customerListUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomerListUpdateRequest customerListUpdateRequest1 = OASCustomerListUpdateRequest.getExample();
        OASCustomerListUpdateRequest customerListUpdateRequest2 = OASCustomerListUpdateRequest.getExample();
        OASCustomerListUpdateRequest customerListUpdateRequest3 = new OASCustomerListUpdateRequest();
        OASCustomerListUpdateRequest customerListUpdateRequest4 = new OASCustomerListUpdateRequest();

        System.assert(customerListUpdateRequest1.equals(customerListUpdateRequest2));
        System.assert(customerListUpdateRequest3.equals(customerListUpdateRequest4));
        System.assertEquals(customerListUpdateRequest1.hashCode(), customerListUpdateRequest2.hashCode());
        System.assertEquals(customerListUpdateRequest3.hashCode(), customerListUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomerListUpdateRequest customerListUpdateRequest = new OASCustomerListUpdateRequest();
        Map<String, String> x-property-mappings = customerListUpdateRequest.getx-property-mappings();
        System.assertEquals('operationType', x-property-mappings.get('operation_type'));
    }
}
