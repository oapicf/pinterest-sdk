@isTest
private class OASAdsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsList200Response adsList200Response1 = OASAdsList200Response.getExample();
        OASAdsList200Response adsList200Response2 = adsList200Response1;
        OASAdsList200Response adsList200Response3 = new OASAdsList200Response();
        OASAdsList200Response adsList200Response4 = adsList200Response3;

        System.assert(adsList200Response1.equals(adsList200Response2));
        System.assert(adsList200Response2.equals(adsList200Response1));
        System.assert(adsList200Response1.equals(adsList200Response1));
        System.assert(adsList200Response3.equals(adsList200Response4));
        System.assert(adsList200Response4.equals(adsList200Response3));
        System.assert(adsList200Response3.equals(adsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsList200Response adsList200Response1 = OASAdsList200Response.getExample();
        OASAdsList200Response adsList200Response2 = OASAdsList200Response.getExample();
        OASAdsList200Response adsList200Response3 = new OASAdsList200Response();
        OASAdsList200Response adsList200Response4 = new OASAdsList200Response();

        System.assert(adsList200Response1.equals(adsList200Response2));
        System.assert(adsList200Response2.equals(adsList200Response1));
        System.assert(adsList200Response3.equals(adsList200Response4));
        System.assert(adsList200Response4.equals(adsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsList200Response adsList200Response1 = OASAdsList200Response.getExample();
        OASAdsList200Response adsList200Response2 = new OASAdsList200Response();

        System.assertEquals(false, adsList200Response1.equals('foo'));
        System.assertEquals(false, adsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsList200Response adsList200Response1 = OASAdsList200Response.getExample();
        OASAdsList200Response adsList200Response2 = new OASAdsList200Response();
        OASAdsList200Response adsList200Response3;

        System.assertEquals(false, adsList200Response1.equals(adsList200Response3));
        System.assertEquals(false, adsList200Response2.equals(adsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsList200Response adsList200Response1 = OASAdsList200Response.getExample();
        OASAdsList200Response adsList200Response2 = new OASAdsList200Response();

        System.assertEquals(adsList200Response1.hashCode(), adsList200Response1.hashCode());
        System.assertEquals(adsList200Response2.hashCode(), adsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsList200Response adsList200Response1 = OASAdsList200Response.getExample();
        OASAdsList200Response adsList200Response2 = OASAdsList200Response.getExample();
        OASAdsList200Response adsList200Response3 = new OASAdsList200Response();
        OASAdsList200Response adsList200Response4 = new OASAdsList200Response();

        System.assert(adsList200Response1.equals(adsList200Response2));
        System.assert(adsList200Response3.equals(adsList200Response4));
        System.assertEquals(adsList200Response1.hashCode(), adsList200Response2.hashCode());
        System.assertEquals(adsList200Response3.hashCode(), adsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdsList200Response adsList200Response = new OASAdsList200Response();
        System.assertEquals(new List<OASAdResponse>(), adsList200Response.items);
        System.assertEquals(null, adsList200Response.bookmark);
    }
}
