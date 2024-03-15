@isTest
private class OASBillingProfilesGet200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBillingProfilesGet200Response billingProfilesGet200Response1 = OASBillingProfilesGet200Response.getExample();
        OASBillingProfilesGet200Response billingProfilesGet200Response2 = billingProfilesGet200Response1;
        OASBillingProfilesGet200Response billingProfilesGet200Response3 = new OASBillingProfilesGet200Response();
        OASBillingProfilesGet200Response billingProfilesGet200Response4 = billingProfilesGet200Response3;

        System.assert(billingProfilesGet200Response1.equals(billingProfilesGet200Response2));
        System.assert(billingProfilesGet200Response2.equals(billingProfilesGet200Response1));
        System.assert(billingProfilesGet200Response1.equals(billingProfilesGet200Response1));
        System.assert(billingProfilesGet200Response3.equals(billingProfilesGet200Response4));
        System.assert(billingProfilesGet200Response4.equals(billingProfilesGet200Response3));
        System.assert(billingProfilesGet200Response3.equals(billingProfilesGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBillingProfilesGet200Response billingProfilesGet200Response1 = OASBillingProfilesGet200Response.getExample();
        OASBillingProfilesGet200Response billingProfilesGet200Response2 = OASBillingProfilesGet200Response.getExample();
        OASBillingProfilesGet200Response billingProfilesGet200Response3 = new OASBillingProfilesGet200Response();
        OASBillingProfilesGet200Response billingProfilesGet200Response4 = new OASBillingProfilesGet200Response();

        System.assert(billingProfilesGet200Response1.equals(billingProfilesGet200Response2));
        System.assert(billingProfilesGet200Response2.equals(billingProfilesGet200Response1));
        System.assert(billingProfilesGet200Response3.equals(billingProfilesGet200Response4));
        System.assert(billingProfilesGet200Response4.equals(billingProfilesGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBillingProfilesGet200Response billingProfilesGet200Response1 = OASBillingProfilesGet200Response.getExample();
        OASBillingProfilesGet200Response billingProfilesGet200Response2 = new OASBillingProfilesGet200Response();

        System.assertEquals(false, billingProfilesGet200Response1.equals('foo'));
        System.assertEquals(false, billingProfilesGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBillingProfilesGet200Response billingProfilesGet200Response1 = OASBillingProfilesGet200Response.getExample();
        OASBillingProfilesGet200Response billingProfilesGet200Response2 = new OASBillingProfilesGet200Response();
        OASBillingProfilesGet200Response billingProfilesGet200Response3;

        System.assertEquals(false, billingProfilesGet200Response1.equals(billingProfilesGet200Response3));
        System.assertEquals(false, billingProfilesGet200Response2.equals(billingProfilesGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBillingProfilesGet200Response billingProfilesGet200Response1 = OASBillingProfilesGet200Response.getExample();
        OASBillingProfilesGet200Response billingProfilesGet200Response2 = new OASBillingProfilesGet200Response();

        System.assertEquals(billingProfilesGet200Response1.hashCode(), billingProfilesGet200Response1.hashCode());
        System.assertEquals(billingProfilesGet200Response2.hashCode(), billingProfilesGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBillingProfilesGet200Response billingProfilesGet200Response1 = OASBillingProfilesGet200Response.getExample();
        OASBillingProfilesGet200Response billingProfilesGet200Response2 = OASBillingProfilesGet200Response.getExample();
        OASBillingProfilesGet200Response billingProfilesGet200Response3 = new OASBillingProfilesGet200Response();
        OASBillingProfilesGet200Response billingProfilesGet200Response4 = new OASBillingProfilesGet200Response();

        System.assert(billingProfilesGet200Response1.equals(billingProfilesGet200Response2));
        System.assert(billingProfilesGet200Response3.equals(billingProfilesGet200Response4));
        System.assertEquals(billingProfilesGet200Response1.hashCode(), billingProfilesGet200Response2.hashCode());
        System.assertEquals(billingProfilesGet200Response3.hashCode(), billingProfilesGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBillingProfilesGet200Response billingProfilesGet200Response = new OASBillingProfilesGet200Response();
        System.assertEquals(new List<OASBillingProfilesResponse>(), billingProfilesGet200Response.items);
        System.assertEquals(null, billingProfilesGet200Response.bookmark);
    }
}
