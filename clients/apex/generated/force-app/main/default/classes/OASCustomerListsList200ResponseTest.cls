@isTest
private class OASCustomerListsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomerListsList200Response customerListsList200Response1 = OASCustomerListsList200Response.getExample();
        OASCustomerListsList200Response customerListsList200Response2 = customerListsList200Response1;
        OASCustomerListsList200Response customerListsList200Response3 = new OASCustomerListsList200Response();
        OASCustomerListsList200Response customerListsList200Response4 = customerListsList200Response3;

        System.assert(customerListsList200Response1.equals(customerListsList200Response2));
        System.assert(customerListsList200Response2.equals(customerListsList200Response1));
        System.assert(customerListsList200Response1.equals(customerListsList200Response1));
        System.assert(customerListsList200Response3.equals(customerListsList200Response4));
        System.assert(customerListsList200Response4.equals(customerListsList200Response3));
        System.assert(customerListsList200Response3.equals(customerListsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomerListsList200Response customerListsList200Response1 = OASCustomerListsList200Response.getExample();
        OASCustomerListsList200Response customerListsList200Response2 = OASCustomerListsList200Response.getExample();
        OASCustomerListsList200Response customerListsList200Response3 = new OASCustomerListsList200Response();
        OASCustomerListsList200Response customerListsList200Response4 = new OASCustomerListsList200Response();

        System.assert(customerListsList200Response1.equals(customerListsList200Response2));
        System.assert(customerListsList200Response2.equals(customerListsList200Response1));
        System.assert(customerListsList200Response3.equals(customerListsList200Response4));
        System.assert(customerListsList200Response4.equals(customerListsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomerListsList200Response customerListsList200Response1 = OASCustomerListsList200Response.getExample();
        OASCustomerListsList200Response customerListsList200Response2 = new OASCustomerListsList200Response();

        System.assertEquals(false, customerListsList200Response1.equals('foo'));
        System.assertEquals(false, customerListsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomerListsList200Response customerListsList200Response1 = OASCustomerListsList200Response.getExample();
        OASCustomerListsList200Response customerListsList200Response2 = new OASCustomerListsList200Response();
        OASCustomerListsList200Response customerListsList200Response3;

        System.assertEquals(false, customerListsList200Response1.equals(customerListsList200Response3));
        System.assertEquals(false, customerListsList200Response2.equals(customerListsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomerListsList200Response customerListsList200Response1 = OASCustomerListsList200Response.getExample();
        OASCustomerListsList200Response customerListsList200Response2 = new OASCustomerListsList200Response();

        System.assertEquals(customerListsList200Response1.hashCode(), customerListsList200Response1.hashCode());
        System.assertEquals(customerListsList200Response2.hashCode(), customerListsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomerListsList200Response customerListsList200Response1 = OASCustomerListsList200Response.getExample();
        OASCustomerListsList200Response customerListsList200Response2 = OASCustomerListsList200Response.getExample();
        OASCustomerListsList200Response customerListsList200Response3 = new OASCustomerListsList200Response();
        OASCustomerListsList200Response customerListsList200Response4 = new OASCustomerListsList200Response();

        System.assert(customerListsList200Response1.equals(customerListsList200Response2));
        System.assert(customerListsList200Response3.equals(customerListsList200Response4));
        System.assertEquals(customerListsList200Response1.hashCode(), customerListsList200Response2.hashCode());
        System.assertEquals(customerListsList200Response3.hashCode(), customerListsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCustomerListsList200Response customerListsList200Response = new OASCustomerListsList200Response();
        System.assertEquals(new List<OASCustomerList>(), customerListsList200Response.items);
        System.assertEquals(null, customerListsList200Response.bookmark);
    }
}
