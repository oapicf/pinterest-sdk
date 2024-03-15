@isTest
private class OASAdAccountsCountryResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountsCountryResponse adAccountsCountryResponse1 = OASAdAccountsCountryResponse.getExample();
        OASAdAccountsCountryResponse adAccountsCountryResponse2 = adAccountsCountryResponse1;
        OASAdAccountsCountryResponse adAccountsCountryResponse3 = new OASAdAccountsCountryResponse();
        OASAdAccountsCountryResponse adAccountsCountryResponse4 = adAccountsCountryResponse3;

        System.assert(adAccountsCountryResponse1.equals(adAccountsCountryResponse2));
        System.assert(adAccountsCountryResponse2.equals(adAccountsCountryResponse1));
        System.assert(adAccountsCountryResponse1.equals(adAccountsCountryResponse1));
        System.assert(adAccountsCountryResponse3.equals(adAccountsCountryResponse4));
        System.assert(adAccountsCountryResponse4.equals(adAccountsCountryResponse3));
        System.assert(adAccountsCountryResponse3.equals(adAccountsCountryResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountsCountryResponse adAccountsCountryResponse1 = OASAdAccountsCountryResponse.getExample();
        OASAdAccountsCountryResponse adAccountsCountryResponse2 = OASAdAccountsCountryResponse.getExample();
        OASAdAccountsCountryResponse adAccountsCountryResponse3 = new OASAdAccountsCountryResponse();
        OASAdAccountsCountryResponse adAccountsCountryResponse4 = new OASAdAccountsCountryResponse();

        System.assert(adAccountsCountryResponse1.equals(adAccountsCountryResponse2));
        System.assert(adAccountsCountryResponse2.equals(adAccountsCountryResponse1));
        System.assert(adAccountsCountryResponse3.equals(adAccountsCountryResponse4));
        System.assert(adAccountsCountryResponse4.equals(adAccountsCountryResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountsCountryResponse adAccountsCountryResponse1 = OASAdAccountsCountryResponse.getExample();
        OASAdAccountsCountryResponse adAccountsCountryResponse2 = new OASAdAccountsCountryResponse();

        System.assertEquals(false, adAccountsCountryResponse1.equals('foo'));
        System.assertEquals(false, adAccountsCountryResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountsCountryResponse adAccountsCountryResponse1 = OASAdAccountsCountryResponse.getExample();
        OASAdAccountsCountryResponse adAccountsCountryResponse2 = new OASAdAccountsCountryResponse();
        OASAdAccountsCountryResponse adAccountsCountryResponse3;

        System.assertEquals(false, adAccountsCountryResponse1.equals(adAccountsCountryResponse3));
        System.assertEquals(false, adAccountsCountryResponse2.equals(adAccountsCountryResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountsCountryResponse adAccountsCountryResponse1 = OASAdAccountsCountryResponse.getExample();
        OASAdAccountsCountryResponse adAccountsCountryResponse2 = new OASAdAccountsCountryResponse();

        System.assertEquals(adAccountsCountryResponse1.hashCode(), adAccountsCountryResponse1.hashCode());
        System.assertEquals(adAccountsCountryResponse2.hashCode(), adAccountsCountryResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountsCountryResponse adAccountsCountryResponse1 = OASAdAccountsCountryResponse.getExample();
        OASAdAccountsCountryResponse adAccountsCountryResponse2 = OASAdAccountsCountryResponse.getExample();
        OASAdAccountsCountryResponse adAccountsCountryResponse3 = new OASAdAccountsCountryResponse();
        OASAdAccountsCountryResponse adAccountsCountryResponse4 = new OASAdAccountsCountryResponse();

        System.assert(adAccountsCountryResponse1.equals(adAccountsCountryResponse2));
        System.assert(adAccountsCountryResponse3.equals(adAccountsCountryResponse4));
        System.assertEquals(adAccountsCountryResponse1.hashCode(), adAccountsCountryResponse2.hashCode());
        System.assertEquals(adAccountsCountryResponse3.hashCode(), adAccountsCountryResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdAccountsCountryResponse adAccountsCountryResponse = new OASAdAccountsCountryResponse();
        System.assertEquals(new List<OASAdAccountsCountryResponseData>(), adAccountsCountryResponse.items);
    }
}
