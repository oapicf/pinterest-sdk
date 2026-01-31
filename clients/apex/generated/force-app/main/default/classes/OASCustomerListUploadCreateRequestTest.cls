@isTest
private class OASCustomerListUploadCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest1 = OASCustomerListUploadCreateRequest.getExample();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest2 = customerListUploadCreateRequest1;
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest3 = new OASCustomerListUploadCreateRequest();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest4 = customerListUploadCreateRequest3;

        System.assert(customerListUploadCreateRequest1.equals(customerListUploadCreateRequest2));
        System.assert(customerListUploadCreateRequest2.equals(customerListUploadCreateRequest1));
        System.assert(customerListUploadCreateRequest1.equals(customerListUploadCreateRequest1));
        System.assert(customerListUploadCreateRequest3.equals(customerListUploadCreateRequest4));
        System.assert(customerListUploadCreateRequest4.equals(customerListUploadCreateRequest3));
        System.assert(customerListUploadCreateRequest3.equals(customerListUploadCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest1 = OASCustomerListUploadCreateRequest.getExample();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest2 = OASCustomerListUploadCreateRequest.getExample();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest3 = new OASCustomerListUploadCreateRequest();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest4 = new OASCustomerListUploadCreateRequest();

        System.assert(customerListUploadCreateRequest1.equals(customerListUploadCreateRequest2));
        System.assert(customerListUploadCreateRequest2.equals(customerListUploadCreateRequest1));
        System.assert(customerListUploadCreateRequest3.equals(customerListUploadCreateRequest4));
        System.assert(customerListUploadCreateRequest4.equals(customerListUploadCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest1 = OASCustomerListUploadCreateRequest.getExample();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest2 = new OASCustomerListUploadCreateRequest();

        System.assertEquals(false, customerListUploadCreateRequest1.equals('foo'));
        System.assertEquals(false, customerListUploadCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest1 = OASCustomerListUploadCreateRequest.getExample();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest2 = new OASCustomerListUploadCreateRequest();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest3;

        System.assertEquals(false, customerListUploadCreateRequest1.equals(customerListUploadCreateRequest3));
        System.assertEquals(false, customerListUploadCreateRequest2.equals(customerListUploadCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest1 = OASCustomerListUploadCreateRequest.getExample();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest2 = new OASCustomerListUploadCreateRequest();

        System.assertEquals(customerListUploadCreateRequest1.hashCode(), customerListUploadCreateRequest1.hashCode());
        System.assertEquals(customerListUploadCreateRequest2.hashCode(), customerListUploadCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest1 = OASCustomerListUploadCreateRequest.getExample();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest2 = OASCustomerListUploadCreateRequest.getExample();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest3 = new OASCustomerListUploadCreateRequest();
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest4 = new OASCustomerListUploadCreateRequest();

        System.assert(customerListUploadCreateRequest1.equals(customerListUploadCreateRequest2));
        System.assert(customerListUploadCreateRequest3.equals(customerListUploadCreateRequest4));
        System.assertEquals(customerListUploadCreateRequest1.hashCode(), customerListUploadCreateRequest2.hashCode());
        System.assertEquals(customerListUploadCreateRequest3.hashCode(), customerListUploadCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomerListUploadCreateRequest customerListUploadCreateRequest = new OASCustomerListUploadCreateRequest();
        Map<String, String> x-property-mappings = customerListUploadCreateRequest.getx-property-mappings();
        System.assertEquals('totalParts', x-property-mappings.get('total_parts'));
    }
}
