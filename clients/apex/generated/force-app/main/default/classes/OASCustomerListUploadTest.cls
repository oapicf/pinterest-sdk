@isTest
private class OASCustomerListUploadTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomerListUpload customerListUpload1 = OASCustomerListUpload.getExample();
        OASCustomerListUpload customerListUpload2 = customerListUpload1;
        OASCustomerListUpload customerListUpload3 = new OASCustomerListUpload();
        OASCustomerListUpload customerListUpload4 = customerListUpload3;

        System.assert(customerListUpload1.equals(customerListUpload2));
        System.assert(customerListUpload2.equals(customerListUpload1));
        System.assert(customerListUpload1.equals(customerListUpload1));
        System.assert(customerListUpload3.equals(customerListUpload4));
        System.assert(customerListUpload4.equals(customerListUpload3));
        System.assert(customerListUpload3.equals(customerListUpload3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomerListUpload customerListUpload1 = OASCustomerListUpload.getExample();
        OASCustomerListUpload customerListUpload2 = OASCustomerListUpload.getExample();
        OASCustomerListUpload customerListUpload3 = new OASCustomerListUpload();
        OASCustomerListUpload customerListUpload4 = new OASCustomerListUpload();

        System.assert(customerListUpload1.equals(customerListUpload2));
        System.assert(customerListUpload2.equals(customerListUpload1));
        System.assert(customerListUpload3.equals(customerListUpload4));
        System.assert(customerListUpload4.equals(customerListUpload3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomerListUpload customerListUpload1 = OASCustomerListUpload.getExample();
        OASCustomerListUpload customerListUpload2 = new OASCustomerListUpload();

        System.assertEquals(false, customerListUpload1.equals('foo'));
        System.assertEquals(false, customerListUpload2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomerListUpload customerListUpload1 = OASCustomerListUpload.getExample();
        OASCustomerListUpload customerListUpload2 = new OASCustomerListUpload();
        OASCustomerListUpload customerListUpload3;

        System.assertEquals(false, customerListUpload1.equals(customerListUpload3));
        System.assertEquals(false, customerListUpload2.equals(customerListUpload3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomerListUpload customerListUpload1 = OASCustomerListUpload.getExample();
        OASCustomerListUpload customerListUpload2 = new OASCustomerListUpload();

        System.assertEquals(customerListUpload1.hashCode(), customerListUpload1.hashCode());
        System.assertEquals(customerListUpload2.hashCode(), customerListUpload2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomerListUpload customerListUpload1 = OASCustomerListUpload.getExample();
        OASCustomerListUpload customerListUpload2 = OASCustomerListUpload.getExample();
        OASCustomerListUpload customerListUpload3 = new OASCustomerListUpload();
        OASCustomerListUpload customerListUpload4 = new OASCustomerListUpload();

        System.assert(customerListUpload1.equals(customerListUpload2));
        System.assert(customerListUpload3.equals(customerListUpload4));
        System.assertEquals(customerListUpload1.hashCode(), customerListUpload2.hashCode());
        System.assertEquals(customerListUpload3.hashCode(), customerListUpload4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomerListUpload customerListUpload = new OASCustomerListUpload();
        Map<String, String> x-property-mappings = customerListUpload.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('creationTime', x-property-mappings.get('creation_time'));
        System.assertEquals('customerListId', x-property-mappings.get('customer_list_id'));
        System.assertEquals('errorCounts', x-property-mappings.get('error_counts'));
        System.assertEquals('recordCounts', x-property-mappings.get('record_counts'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCustomerListUpload customerListUpload = new OASCustomerListUpload();
        System.assertEquals(new List<OASErrorDetail>(), customerListUpload.errorCounts);
        System.assertEquals(null, customerListUpload.adAccountId);
        System.assertEquals(null, customerListUpload.creationTime);
        System.assertEquals(null, customerListUpload.customerListId);
        System.assertEquals(null, customerListUpload.id);
        System.assertEquals(null, customerListUpload.operation);
        System.assertEquals(null, customerListUpload.recordCounts);
        System.assertEquals(null, customerListUpload.state);
        System.assertEquals(null, customerListUpload.updatedTime);
    }
}
