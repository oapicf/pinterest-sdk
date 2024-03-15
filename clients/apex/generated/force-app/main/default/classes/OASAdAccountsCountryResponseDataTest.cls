@isTest
private class OASAdAccountsCountryResponseDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountsCountryResponseData adAccountsCountryResponseData1 = OASAdAccountsCountryResponseData.getExample();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData2 = adAccountsCountryResponseData1;
        OASAdAccountsCountryResponseData adAccountsCountryResponseData3 = new OASAdAccountsCountryResponseData();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData4 = adAccountsCountryResponseData3;

        System.assert(adAccountsCountryResponseData1.equals(adAccountsCountryResponseData2));
        System.assert(adAccountsCountryResponseData2.equals(adAccountsCountryResponseData1));
        System.assert(adAccountsCountryResponseData1.equals(adAccountsCountryResponseData1));
        System.assert(adAccountsCountryResponseData3.equals(adAccountsCountryResponseData4));
        System.assert(adAccountsCountryResponseData4.equals(adAccountsCountryResponseData3));
        System.assert(adAccountsCountryResponseData3.equals(adAccountsCountryResponseData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountsCountryResponseData adAccountsCountryResponseData1 = OASAdAccountsCountryResponseData.getExample();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData2 = OASAdAccountsCountryResponseData.getExample();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData3 = new OASAdAccountsCountryResponseData();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData4 = new OASAdAccountsCountryResponseData();

        System.assert(adAccountsCountryResponseData1.equals(adAccountsCountryResponseData2));
        System.assert(adAccountsCountryResponseData2.equals(adAccountsCountryResponseData1));
        System.assert(adAccountsCountryResponseData3.equals(adAccountsCountryResponseData4));
        System.assert(adAccountsCountryResponseData4.equals(adAccountsCountryResponseData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountsCountryResponseData adAccountsCountryResponseData1 = OASAdAccountsCountryResponseData.getExample();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData2 = new OASAdAccountsCountryResponseData();

        System.assertEquals(false, adAccountsCountryResponseData1.equals('foo'));
        System.assertEquals(false, adAccountsCountryResponseData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountsCountryResponseData adAccountsCountryResponseData1 = OASAdAccountsCountryResponseData.getExample();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData2 = new OASAdAccountsCountryResponseData();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData3;

        System.assertEquals(false, adAccountsCountryResponseData1.equals(adAccountsCountryResponseData3));
        System.assertEquals(false, adAccountsCountryResponseData2.equals(adAccountsCountryResponseData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountsCountryResponseData adAccountsCountryResponseData1 = OASAdAccountsCountryResponseData.getExample();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData2 = new OASAdAccountsCountryResponseData();

        System.assertEquals(adAccountsCountryResponseData1.hashCode(), adAccountsCountryResponseData1.hashCode());
        System.assertEquals(adAccountsCountryResponseData2.hashCode(), adAccountsCountryResponseData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountsCountryResponseData adAccountsCountryResponseData1 = OASAdAccountsCountryResponseData.getExample();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData2 = OASAdAccountsCountryResponseData.getExample();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData3 = new OASAdAccountsCountryResponseData();
        OASAdAccountsCountryResponseData adAccountsCountryResponseData4 = new OASAdAccountsCountryResponseData();

        System.assert(adAccountsCountryResponseData1.equals(adAccountsCountryResponseData2));
        System.assert(adAccountsCountryResponseData3.equals(adAccountsCountryResponseData4));
        System.assertEquals(adAccountsCountryResponseData1.hashCode(), adAccountsCountryResponseData2.hashCode());
        System.assertEquals(adAccountsCountryResponseData3.hashCode(), adAccountsCountryResponseData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdAccountsCountryResponseData adAccountsCountryResponseData = new OASAdAccountsCountryResponseData();
        Map<String, String> x-property-mappings = adAccountsCountryResponseData.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }
}
