@isTest
private class OASAdAccountsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountsList200Response adAccountsList200Response1 = OASAdAccountsList200Response.getExample();
        OASAdAccountsList200Response adAccountsList200Response2 = adAccountsList200Response1;
        OASAdAccountsList200Response adAccountsList200Response3 = new OASAdAccountsList200Response();
        OASAdAccountsList200Response adAccountsList200Response4 = adAccountsList200Response3;

        System.assert(adAccountsList200Response1.equals(adAccountsList200Response2));
        System.assert(adAccountsList200Response2.equals(adAccountsList200Response1));
        System.assert(adAccountsList200Response1.equals(adAccountsList200Response1));
        System.assert(adAccountsList200Response3.equals(adAccountsList200Response4));
        System.assert(adAccountsList200Response4.equals(adAccountsList200Response3));
        System.assert(adAccountsList200Response3.equals(adAccountsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountsList200Response adAccountsList200Response1 = OASAdAccountsList200Response.getExample();
        OASAdAccountsList200Response adAccountsList200Response2 = OASAdAccountsList200Response.getExample();
        OASAdAccountsList200Response adAccountsList200Response3 = new OASAdAccountsList200Response();
        OASAdAccountsList200Response adAccountsList200Response4 = new OASAdAccountsList200Response();

        System.assert(adAccountsList200Response1.equals(adAccountsList200Response2));
        System.assert(adAccountsList200Response2.equals(adAccountsList200Response1));
        System.assert(adAccountsList200Response3.equals(adAccountsList200Response4));
        System.assert(adAccountsList200Response4.equals(adAccountsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountsList200Response adAccountsList200Response1 = OASAdAccountsList200Response.getExample();
        OASAdAccountsList200Response adAccountsList200Response2 = new OASAdAccountsList200Response();

        System.assertEquals(false, adAccountsList200Response1.equals('foo'));
        System.assertEquals(false, adAccountsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountsList200Response adAccountsList200Response1 = OASAdAccountsList200Response.getExample();
        OASAdAccountsList200Response adAccountsList200Response2 = new OASAdAccountsList200Response();
        OASAdAccountsList200Response adAccountsList200Response3;

        System.assertEquals(false, adAccountsList200Response1.equals(adAccountsList200Response3));
        System.assertEquals(false, adAccountsList200Response2.equals(adAccountsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountsList200Response adAccountsList200Response1 = OASAdAccountsList200Response.getExample();
        OASAdAccountsList200Response adAccountsList200Response2 = new OASAdAccountsList200Response();

        System.assertEquals(adAccountsList200Response1.hashCode(), adAccountsList200Response1.hashCode());
        System.assertEquals(adAccountsList200Response2.hashCode(), adAccountsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountsList200Response adAccountsList200Response1 = OASAdAccountsList200Response.getExample();
        OASAdAccountsList200Response adAccountsList200Response2 = OASAdAccountsList200Response.getExample();
        OASAdAccountsList200Response adAccountsList200Response3 = new OASAdAccountsList200Response();
        OASAdAccountsList200Response adAccountsList200Response4 = new OASAdAccountsList200Response();

        System.assert(adAccountsList200Response1.equals(adAccountsList200Response2));
        System.assert(adAccountsList200Response3.equals(adAccountsList200Response4));
        System.assertEquals(adAccountsList200Response1.hashCode(), adAccountsList200Response2.hashCode());
        System.assertEquals(adAccountsList200Response3.hashCode(), adAccountsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdAccountsList200Response adAccountsList200Response = new OASAdAccountsList200Response();
        System.assertEquals(new List<OASAdAccount>(), adAccountsList200Response.items);
        System.assertEquals(null, adAccountsList200Response.bookmark);
    }
}
