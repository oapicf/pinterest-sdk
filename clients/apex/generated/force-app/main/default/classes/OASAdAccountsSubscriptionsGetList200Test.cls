@isTest
private class OASAdAccountsSubscriptionsGetList200Test {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response1 = OASAdAccountsSubscriptionsGetList200.getExample();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response2 = adAccountsSubscriptionsGetList200Response1;
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response3 = new OASAdAccountsSubscriptionsGetList200();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response4 = adAccountsSubscriptionsGetList200Response3;

        System.assert(adAccountsSubscriptionsGetList200Response1.equals(adAccountsSubscriptionsGetList200Response2));
        System.assert(adAccountsSubscriptionsGetList200Response2.equals(adAccountsSubscriptionsGetList200Response1));
        System.assert(adAccountsSubscriptionsGetList200Response1.equals(adAccountsSubscriptionsGetList200Response1));
        System.assert(adAccountsSubscriptionsGetList200Response3.equals(adAccountsSubscriptionsGetList200Response4));
        System.assert(adAccountsSubscriptionsGetList200Response4.equals(adAccountsSubscriptionsGetList200Response3));
        System.assert(adAccountsSubscriptionsGetList200Response3.equals(adAccountsSubscriptionsGetList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response1 = OASAdAccountsSubscriptionsGetList200.getExample();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response2 = OASAdAccountsSubscriptionsGetList200.getExample();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response3 = new OASAdAccountsSubscriptionsGetList200();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response4 = new OASAdAccountsSubscriptionsGetList200();

        System.assert(adAccountsSubscriptionsGetList200Response1.equals(adAccountsSubscriptionsGetList200Response2));
        System.assert(adAccountsSubscriptionsGetList200Response2.equals(adAccountsSubscriptionsGetList200Response1));
        System.assert(adAccountsSubscriptionsGetList200Response3.equals(adAccountsSubscriptionsGetList200Response4));
        System.assert(adAccountsSubscriptionsGetList200Response4.equals(adAccountsSubscriptionsGetList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response1 = OASAdAccountsSubscriptionsGetList200.getExample();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response2 = new OASAdAccountsSubscriptionsGetList200();

        System.assertEquals(false, adAccountsSubscriptionsGetList200Response1.equals('foo'));
        System.assertEquals(false, adAccountsSubscriptionsGetList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response1 = OASAdAccountsSubscriptionsGetList200.getExample();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response2 = new OASAdAccountsSubscriptionsGetList200();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response3;

        System.assertEquals(false, adAccountsSubscriptionsGetList200Response1.equals(adAccountsSubscriptionsGetList200Response3));
        System.assertEquals(false, adAccountsSubscriptionsGetList200Response2.equals(adAccountsSubscriptionsGetList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response1 = OASAdAccountsSubscriptionsGetList200.getExample();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response2 = new OASAdAccountsSubscriptionsGetList200();

        System.assertEquals(adAccountsSubscriptionsGetList200Response1.hashCode(), adAccountsSubscriptionsGetList200Response1.hashCode());
        System.assertEquals(adAccountsSubscriptionsGetList200Response2.hashCode(), adAccountsSubscriptionsGetList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response1 = OASAdAccountsSubscriptionsGetList200.getExample();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response2 = OASAdAccountsSubscriptionsGetList200.getExample();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response3 = new OASAdAccountsSubscriptionsGetList200();
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response4 = new OASAdAccountsSubscriptionsGetList200();

        System.assert(adAccountsSubscriptionsGetList200Response1.equals(adAccountsSubscriptionsGetList200Response2));
        System.assert(adAccountsSubscriptionsGetList200Response3.equals(adAccountsSubscriptionsGetList200Response4));
        System.assertEquals(adAccountsSubscriptionsGetList200Response1.hashCode(), adAccountsSubscriptionsGetList200Response2.hashCode());
        System.assertEquals(adAccountsSubscriptionsGetList200Response3.hashCode(), adAccountsSubscriptionsGetList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdAccountsSubscriptionsGetList200 adAccountsSubscriptionsGetList200Response = new OASAdAccountsSubscriptionsGetList200();
        System.assertEquals(new List<OASAdAccountGetSubscriptionResponse>(), adAccountsSubscriptionsGetList200Response.items);
        System.assertEquals(null, adAccountsSubscriptionsGetList200Response.bookmark);
    }
}
