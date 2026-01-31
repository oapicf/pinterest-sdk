@isTest
private class OASCustomerListUploadCreateResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse1 = OASCustomerListUploadCreateResponse.getExample();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse2 = customerListUploadCreateResponse1;
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse3 = new OASCustomerListUploadCreateResponse();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse4 = customerListUploadCreateResponse3;

        System.assert(customerListUploadCreateResponse1.equals(customerListUploadCreateResponse2));
        System.assert(customerListUploadCreateResponse2.equals(customerListUploadCreateResponse1));
        System.assert(customerListUploadCreateResponse1.equals(customerListUploadCreateResponse1));
        System.assert(customerListUploadCreateResponse3.equals(customerListUploadCreateResponse4));
        System.assert(customerListUploadCreateResponse4.equals(customerListUploadCreateResponse3));
        System.assert(customerListUploadCreateResponse3.equals(customerListUploadCreateResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse1 = OASCustomerListUploadCreateResponse.getExample();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse2 = OASCustomerListUploadCreateResponse.getExample();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse3 = new OASCustomerListUploadCreateResponse();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse4 = new OASCustomerListUploadCreateResponse();

        System.assert(customerListUploadCreateResponse1.equals(customerListUploadCreateResponse2));
        System.assert(customerListUploadCreateResponse2.equals(customerListUploadCreateResponse1));
        System.assert(customerListUploadCreateResponse3.equals(customerListUploadCreateResponse4));
        System.assert(customerListUploadCreateResponse4.equals(customerListUploadCreateResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse1 = OASCustomerListUploadCreateResponse.getExample();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse2 = new OASCustomerListUploadCreateResponse();

        System.assertEquals(false, customerListUploadCreateResponse1.equals('foo'));
        System.assertEquals(false, customerListUploadCreateResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse1 = OASCustomerListUploadCreateResponse.getExample();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse2 = new OASCustomerListUploadCreateResponse();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse3;

        System.assertEquals(false, customerListUploadCreateResponse1.equals(customerListUploadCreateResponse3));
        System.assertEquals(false, customerListUploadCreateResponse2.equals(customerListUploadCreateResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse1 = OASCustomerListUploadCreateResponse.getExample();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse2 = new OASCustomerListUploadCreateResponse();

        System.assertEquals(customerListUploadCreateResponse1.hashCode(), customerListUploadCreateResponse1.hashCode());
        System.assertEquals(customerListUploadCreateResponse2.hashCode(), customerListUploadCreateResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse1 = OASCustomerListUploadCreateResponse.getExample();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse2 = OASCustomerListUploadCreateResponse.getExample();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse3 = new OASCustomerListUploadCreateResponse();
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse4 = new OASCustomerListUploadCreateResponse();

        System.assert(customerListUploadCreateResponse1.equals(customerListUploadCreateResponse2));
        System.assert(customerListUploadCreateResponse3.equals(customerListUploadCreateResponse4));
        System.assertEquals(customerListUploadCreateResponse1.hashCode(), customerListUploadCreateResponse2.hashCode());
        System.assertEquals(customerListUploadCreateResponse3.hashCode(), customerListUploadCreateResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomerListUploadCreateResponse customerListUploadCreateResponse = new OASCustomerListUploadCreateResponse();
        Map<String, String> x-property-mappings = customerListUploadCreateResponse.getx-property-mappings();
        System.assertEquals('customerListUpload', x-property-mappings.get('customer_list_upload'));
        System.assertEquals('s3MultipartUploadData', x-property-mappings.get('s3_multipart_upload_data'));
    }
}
