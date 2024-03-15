@isTest
private class OASCustomerListTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomerList customerList1 = OASCustomerList.getExample();
        OASCustomerList customerList2 = customerList1;
        OASCustomerList customerList3 = new OASCustomerList();
        OASCustomerList customerList4 = customerList3;

        System.assert(customerList1.equals(customerList2));
        System.assert(customerList2.equals(customerList1));
        System.assert(customerList1.equals(customerList1));
        System.assert(customerList3.equals(customerList4));
        System.assert(customerList4.equals(customerList3));
        System.assert(customerList3.equals(customerList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomerList customerList1 = OASCustomerList.getExample();
        OASCustomerList customerList2 = OASCustomerList.getExample();
        OASCustomerList customerList3 = new OASCustomerList();
        OASCustomerList customerList4 = new OASCustomerList();

        System.assert(customerList1.equals(customerList2));
        System.assert(customerList2.equals(customerList1));
        System.assert(customerList3.equals(customerList4));
        System.assert(customerList4.equals(customerList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomerList customerList1 = OASCustomerList.getExample();
        OASCustomerList customerList2 = new OASCustomerList();

        System.assertEquals(false, customerList1.equals('foo'));
        System.assertEquals(false, customerList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomerList customerList1 = OASCustomerList.getExample();
        OASCustomerList customerList2 = new OASCustomerList();
        OASCustomerList customerList3;

        System.assertEquals(false, customerList1.equals(customerList3));
        System.assertEquals(false, customerList2.equals(customerList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomerList customerList1 = OASCustomerList.getExample();
        OASCustomerList customerList2 = new OASCustomerList();

        System.assertEquals(customerList1.hashCode(), customerList1.hashCode());
        System.assertEquals(customerList2.hashCode(), customerList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomerList customerList1 = OASCustomerList.getExample();
        OASCustomerList customerList2 = OASCustomerList.getExample();
        OASCustomerList customerList3 = new OASCustomerList();
        OASCustomerList customerList4 = new OASCustomerList();

        System.assert(customerList1.equals(customerList2));
        System.assert(customerList3.equals(customerList4));
        System.assertEquals(customerList1.hashCode(), customerList2.hashCode());
        System.assertEquals(customerList3.hashCode(), customerList4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomerList customerList = new OASCustomerList();
        Map<String, String> x-property-mappings = customerList.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('numBatches', x-property-mappings.get('num_batches'));
        System.assertEquals('numRemovedUserRecords', x-property-mappings.get('num_removed_user_records'));
        System.assertEquals('numUploadedUserRecords', x-property-mappings.get('num_uploaded_user_records'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
    }
}
