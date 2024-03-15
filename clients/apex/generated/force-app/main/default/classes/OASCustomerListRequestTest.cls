@isTest
private class OASCustomerListRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomerListRequest customerListRequest1 = OASCustomerListRequest.getExample();
        OASCustomerListRequest customerListRequest2 = customerListRequest1;
        OASCustomerListRequest customerListRequest3 = new OASCustomerListRequest();
        OASCustomerListRequest customerListRequest4 = customerListRequest3;

        System.assert(customerListRequest1.equals(customerListRequest2));
        System.assert(customerListRequest2.equals(customerListRequest1));
        System.assert(customerListRequest1.equals(customerListRequest1));
        System.assert(customerListRequest3.equals(customerListRequest4));
        System.assert(customerListRequest4.equals(customerListRequest3));
        System.assert(customerListRequest3.equals(customerListRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomerListRequest customerListRequest1 = OASCustomerListRequest.getExample();
        OASCustomerListRequest customerListRequest2 = OASCustomerListRequest.getExample();
        OASCustomerListRequest customerListRequest3 = new OASCustomerListRequest();
        OASCustomerListRequest customerListRequest4 = new OASCustomerListRequest();

        System.assert(customerListRequest1.equals(customerListRequest2));
        System.assert(customerListRequest2.equals(customerListRequest1));
        System.assert(customerListRequest3.equals(customerListRequest4));
        System.assert(customerListRequest4.equals(customerListRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomerListRequest customerListRequest1 = OASCustomerListRequest.getExample();
        OASCustomerListRequest customerListRequest2 = new OASCustomerListRequest();

        System.assertEquals(false, customerListRequest1.equals('foo'));
        System.assertEquals(false, customerListRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomerListRequest customerListRequest1 = OASCustomerListRequest.getExample();
        OASCustomerListRequest customerListRequest2 = new OASCustomerListRequest();
        OASCustomerListRequest customerListRequest3;

        System.assertEquals(false, customerListRequest1.equals(customerListRequest3));
        System.assertEquals(false, customerListRequest2.equals(customerListRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomerListRequest customerListRequest1 = OASCustomerListRequest.getExample();
        OASCustomerListRequest customerListRequest2 = new OASCustomerListRequest();

        System.assertEquals(customerListRequest1.hashCode(), customerListRequest1.hashCode());
        System.assertEquals(customerListRequest2.hashCode(), customerListRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomerListRequest customerListRequest1 = OASCustomerListRequest.getExample();
        OASCustomerListRequest customerListRequest2 = OASCustomerListRequest.getExample();
        OASCustomerListRequest customerListRequest3 = new OASCustomerListRequest();
        OASCustomerListRequest customerListRequest4 = new OASCustomerListRequest();

        System.assert(customerListRequest1.equals(customerListRequest2));
        System.assert(customerListRequest3.equals(customerListRequest4));
        System.assertEquals(customerListRequest1.hashCode(), customerListRequest2.hashCode());
        System.assertEquals(customerListRequest3.hashCode(), customerListRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomerListRequest customerListRequest = new OASCustomerListRequest();
        Map<String, String> x-property-mappings = customerListRequest.getx-property-mappings();
        System.assertEquals('listType', x-property-mappings.get('list_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCustomerListRequest customerListRequest = new OASCustomerListRequest();
        System.assertEquals('EMAIL', customerListRequest.listType);
        System.assertEquals(null, customerListRequest.name);
        System.assertEquals(null, customerListRequest.records);
        System.assertEquals(null, customerListRequest.exceptions);
    }
}
