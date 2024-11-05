@isTest
private class OASAdAccountsAudiencesSharedAccountsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response1 = OASAdAccountsAudiencesSharedAccounts.getExample();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response2 = adAccountsAudiencesSharedAccountsList200Response1;
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response3 = new OASAdAccountsAudiencesSharedAccounts();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response4 = adAccountsAudiencesSharedAccountsList200Response3;

        System.assert(adAccountsAudiencesSharedAccountsList200Response1.equals(adAccountsAudiencesSharedAccountsList200Response2));
        System.assert(adAccountsAudiencesSharedAccountsList200Response2.equals(adAccountsAudiencesSharedAccountsList200Response1));
        System.assert(adAccountsAudiencesSharedAccountsList200Response1.equals(adAccountsAudiencesSharedAccountsList200Response1));
        System.assert(adAccountsAudiencesSharedAccountsList200Response3.equals(adAccountsAudiencesSharedAccountsList200Response4));
        System.assert(adAccountsAudiencesSharedAccountsList200Response4.equals(adAccountsAudiencesSharedAccountsList200Response3));
        System.assert(adAccountsAudiencesSharedAccountsList200Response3.equals(adAccountsAudiencesSharedAccountsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response1 = OASAdAccountsAudiencesSharedAccounts.getExample();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response2 = OASAdAccountsAudiencesSharedAccounts.getExample();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response3 = new OASAdAccountsAudiencesSharedAccounts();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response4 = new OASAdAccountsAudiencesSharedAccounts();

        System.assert(adAccountsAudiencesSharedAccountsList200Response1.equals(adAccountsAudiencesSharedAccountsList200Response2));
        System.assert(adAccountsAudiencesSharedAccountsList200Response2.equals(adAccountsAudiencesSharedAccountsList200Response1));
        System.assert(adAccountsAudiencesSharedAccountsList200Response3.equals(adAccountsAudiencesSharedAccountsList200Response4));
        System.assert(adAccountsAudiencesSharedAccountsList200Response4.equals(adAccountsAudiencesSharedAccountsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response1 = OASAdAccountsAudiencesSharedAccounts.getExample();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response2 = new OASAdAccountsAudiencesSharedAccounts();

        System.assertEquals(false, adAccountsAudiencesSharedAccountsList200Response1.equals('foo'));
        System.assertEquals(false, adAccountsAudiencesSharedAccountsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response1 = OASAdAccountsAudiencesSharedAccounts.getExample();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response2 = new OASAdAccountsAudiencesSharedAccounts();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response3;

        System.assertEquals(false, adAccountsAudiencesSharedAccountsList200Response1.equals(adAccountsAudiencesSharedAccountsList200Response3));
        System.assertEquals(false, adAccountsAudiencesSharedAccountsList200Response2.equals(adAccountsAudiencesSharedAccountsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response1 = OASAdAccountsAudiencesSharedAccounts.getExample();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response2 = new OASAdAccountsAudiencesSharedAccounts();

        System.assertEquals(adAccountsAudiencesSharedAccountsList200Response1.hashCode(), adAccountsAudiencesSharedAccountsList200Response1.hashCode());
        System.assertEquals(adAccountsAudiencesSharedAccountsList200Response2.hashCode(), adAccountsAudiencesSharedAccountsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response1 = OASAdAccountsAudiencesSharedAccounts.getExample();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response2 = OASAdAccountsAudiencesSharedAccounts.getExample();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response3 = new OASAdAccountsAudiencesSharedAccounts();
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response4 = new OASAdAccountsAudiencesSharedAccounts();

        System.assert(adAccountsAudiencesSharedAccountsList200Response1.equals(adAccountsAudiencesSharedAccountsList200Response2));
        System.assert(adAccountsAudiencesSharedAccountsList200Response3.equals(adAccountsAudiencesSharedAccountsList200Response4));
        System.assertEquals(adAccountsAudiencesSharedAccountsList200Response1.hashCode(), adAccountsAudiencesSharedAccountsList200Response2.hashCode());
        System.assertEquals(adAccountsAudiencesSharedAccountsList200Response3.hashCode(), adAccountsAudiencesSharedAccountsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdAccountsAudiencesSharedAccounts adAccountsAudiencesSharedAccountsList200Response = new OASAdAccountsAudiencesSharedAccounts();
        System.assertEquals(new List<OASSharedAudienceAccount>(), adAccountsAudiencesSharedAccountsList200Response.items);
        System.assertEquals(null, adAccountsAudiencesSharedAccountsList200Response.bookmark);
    }
}
