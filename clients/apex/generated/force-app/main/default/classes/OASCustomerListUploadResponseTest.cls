@isTest
private class OASCustomerListUploadResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomerListUploadResponse customerListUploadResponse1 = OASCustomerListUploadResponse.getExample();
        OASCustomerListUploadResponse customerListUploadResponse2 = customerListUploadResponse1;
        OASCustomerListUploadResponse customerListUploadResponse3 = new OASCustomerListUploadResponse();
        OASCustomerListUploadResponse customerListUploadResponse4 = customerListUploadResponse3;

        System.assert(customerListUploadResponse1.equals(customerListUploadResponse2));
        System.assert(customerListUploadResponse2.equals(customerListUploadResponse1));
        System.assert(customerListUploadResponse1.equals(customerListUploadResponse1));
        System.assert(customerListUploadResponse3.equals(customerListUploadResponse4));
        System.assert(customerListUploadResponse4.equals(customerListUploadResponse3));
        System.assert(customerListUploadResponse3.equals(customerListUploadResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomerListUploadResponse customerListUploadResponse1 = OASCustomerListUploadResponse.getExample();
        OASCustomerListUploadResponse customerListUploadResponse2 = OASCustomerListUploadResponse.getExample();
        OASCustomerListUploadResponse customerListUploadResponse3 = new OASCustomerListUploadResponse();
        OASCustomerListUploadResponse customerListUploadResponse4 = new OASCustomerListUploadResponse();

        System.assert(customerListUploadResponse1.equals(customerListUploadResponse2));
        System.assert(customerListUploadResponse2.equals(customerListUploadResponse1));
        System.assert(customerListUploadResponse3.equals(customerListUploadResponse4));
        System.assert(customerListUploadResponse4.equals(customerListUploadResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomerListUploadResponse customerListUploadResponse1 = OASCustomerListUploadResponse.getExample();
        OASCustomerListUploadResponse customerListUploadResponse2 = new OASCustomerListUploadResponse();

        System.assertEquals(false, customerListUploadResponse1.equals('foo'));
        System.assertEquals(false, customerListUploadResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomerListUploadResponse customerListUploadResponse1 = OASCustomerListUploadResponse.getExample();
        OASCustomerListUploadResponse customerListUploadResponse2 = new OASCustomerListUploadResponse();
        OASCustomerListUploadResponse customerListUploadResponse3;

        System.assertEquals(false, customerListUploadResponse1.equals(customerListUploadResponse3));
        System.assertEquals(false, customerListUploadResponse2.equals(customerListUploadResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomerListUploadResponse customerListUploadResponse1 = OASCustomerListUploadResponse.getExample();
        OASCustomerListUploadResponse customerListUploadResponse2 = new OASCustomerListUploadResponse();

        System.assertEquals(customerListUploadResponse1.hashCode(), customerListUploadResponse1.hashCode());
        System.assertEquals(customerListUploadResponse2.hashCode(), customerListUploadResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomerListUploadResponse customerListUploadResponse1 = OASCustomerListUploadResponse.getExample();
        OASCustomerListUploadResponse customerListUploadResponse2 = OASCustomerListUploadResponse.getExample();
        OASCustomerListUploadResponse customerListUploadResponse3 = new OASCustomerListUploadResponse();
        OASCustomerListUploadResponse customerListUploadResponse4 = new OASCustomerListUploadResponse();

        System.assert(customerListUploadResponse1.equals(customerListUploadResponse2));
        System.assert(customerListUploadResponse3.equals(customerListUploadResponse4));
        System.assertEquals(customerListUploadResponse1.hashCode(), customerListUploadResponse2.hashCode());
        System.assertEquals(customerListUploadResponse3.hashCode(), customerListUploadResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomerListUploadResponse customerListUploadResponse = new OASCustomerListUploadResponse();
        Map<String, String> x-property-mappings = customerListUploadResponse.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('creationTime', x-property-mappings.get('creation_time'));
        System.assertEquals('customerListId', x-property-mappings.get('customer_list_id'));
        System.assertEquals('errorCounts', x-property-mappings.get('error_counts'));
        System.assertEquals('recordCounts', x-property-mappings.get('record_counts'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCustomerListUploadResponse customerListUploadResponse = new OASCustomerListUploadResponse();
        System.assertEquals(new List<OASErrorDetail>(), customerListUploadResponse.errorCounts);
        System.assertEquals(null, customerListUploadResponse.adAccountId);
        System.assertEquals(null, customerListUploadResponse.creationTime);
        System.assertEquals(null, customerListUploadResponse.customerListId);
        System.assertEquals(null, customerListUploadResponse.id);
        System.assertEquals(null, customerListUploadResponse.operation);
        System.assertEquals(null, customerListUploadResponse.recordCounts);
        System.assertEquals(null, customerListUploadResponse.state);
        System.assertEquals(null, customerListUploadResponse.updatedTime);
    }
}
