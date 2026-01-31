@isTest
private class OASBillingInvoicesGet200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBillingInvoicesGet200Response billingInvoicesGet200Response1 = OASBillingInvoicesGet200Response.getExample();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response2 = billingInvoicesGet200Response1;
        OASBillingInvoicesGet200Response billingInvoicesGet200Response3 = new OASBillingInvoicesGet200Response();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response4 = billingInvoicesGet200Response3;

        System.assert(billingInvoicesGet200Response1.equals(billingInvoicesGet200Response2));
        System.assert(billingInvoicesGet200Response2.equals(billingInvoicesGet200Response1));
        System.assert(billingInvoicesGet200Response1.equals(billingInvoicesGet200Response1));
        System.assert(billingInvoicesGet200Response3.equals(billingInvoicesGet200Response4));
        System.assert(billingInvoicesGet200Response4.equals(billingInvoicesGet200Response3));
        System.assert(billingInvoicesGet200Response3.equals(billingInvoicesGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBillingInvoicesGet200Response billingInvoicesGet200Response1 = OASBillingInvoicesGet200Response.getExample();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response2 = OASBillingInvoicesGet200Response.getExample();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response3 = new OASBillingInvoicesGet200Response();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response4 = new OASBillingInvoicesGet200Response();

        System.assert(billingInvoicesGet200Response1.equals(billingInvoicesGet200Response2));
        System.assert(billingInvoicesGet200Response2.equals(billingInvoicesGet200Response1));
        System.assert(billingInvoicesGet200Response3.equals(billingInvoicesGet200Response4));
        System.assert(billingInvoicesGet200Response4.equals(billingInvoicesGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBillingInvoicesGet200Response billingInvoicesGet200Response1 = OASBillingInvoicesGet200Response.getExample();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response2 = new OASBillingInvoicesGet200Response();

        System.assertEquals(false, billingInvoicesGet200Response1.equals('foo'));
        System.assertEquals(false, billingInvoicesGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBillingInvoicesGet200Response billingInvoicesGet200Response1 = OASBillingInvoicesGet200Response.getExample();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response2 = new OASBillingInvoicesGet200Response();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response3;

        System.assertEquals(false, billingInvoicesGet200Response1.equals(billingInvoicesGet200Response3));
        System.assertEquals(false, billingInvoicesGet200Response2.equals(billingInvoicesGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBillingInvoicesGet200Response billingInvoicesGet200Response1 = OASBillingInvoicesGet200Response.getExample();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response2 = new OASBillingInvoicesGet200Response();

        System.assertEquals(billingInvoicesGet200Response1.hashCode(), billingInvoicesGet200Response1.hashCode());
        System.assertEquals(billingInvoicesGet200Response2.hashCode(), billingInvoicesGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBillingInvoicesGet200Response billingInvoicesGet200Response1 = OASBillingInvoicesGet200Response.getExample();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response2 = OASBillingInvoicesGet200Response.getExample();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response3 = new OASBillingInvoicesGet200Response();
        OASBillingInvoicesGet200Response billingInvoicesGet200Response4 = new OASBillingInvoicesGet200Response();

        System.assert(billingInvoicesGet200Response1.equals(billingInvoicesGet200Response2));
        System.assert(billingInvoicesGet200Response3.equals(billingInvoicesGet200Response4));
        System.assertEquals(billingInvoicesGet200Response1.hashCode(), billingInvoicesGet200Response2.hashCode());
        System.assertEquals(billingInvoicesGet200Response3.hashCode(), billingInvoicesGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBillingInvoicesGet200Response billingInvoicesGet200Response = new OASBillingInvoicesGet200Response();
        System.assertEquals(new List<OASBillingInvoiceResponse>(), billingInvoicesGet200Response.items);
        System.assertEquals(null, billingInvoicesGet200Response.bookmark);
    }
}
