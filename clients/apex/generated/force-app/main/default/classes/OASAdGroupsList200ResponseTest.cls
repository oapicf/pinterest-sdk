@isTest
private class OASAdGroupsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupsList200Response adGroupsList200Response1 = OASAdGroupsList200Response.getExample();
        OASAdGroupsList200Response adGroupsList200Response2 = adGroupsList200Response1;
        OASAdGroupsList200Response adGroupsList200Response3 = new OASAdGroupsList200Response();
        OASAdGroupsList200Response adGroupsList200Response4 = adGroupsList200Response3;

        System.assert(adGroupsList200Response1.equals(adGroupsList200Response2));
        System.assert(adGroupsList200Response2.equals(adGroupsList200Response1));
        System.assert(adGroupsList200Response1.equals(adGroupsList200Response1));
        System.assert(adGroupsList200Response3.equals(adGroupsList200Response4));
        System.assert(adGroupsList200Response4.equals(adGroupsList200Response3));
        System.assert(adGroupsList200Response3.equals(adGroupsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupsList200Response adGroupsList200Response1 = OASAdGroupsList200Response.getExample();
        OASAdGroupsList200Response adGroupsList200Response2 = OASAdGroupsList200Response.getExample();
        OASAdGroupsList200Response adGroupsList200Response3 = new OASAdGroupsList200Response();
        OASAdGroupsList200Response adGroupsList200Response4 = new OASAdGroupsList200Response();

        System.assert(adGroupsList200Response1.equals(adGroupsList200Response2));
        System.assert(adGroupsList200Response2.equals(adGroupsList200Response1));
        System.assert(adGroupsList200Response3.equals(adGroupsList200Response4));
        System.assert(adGroupsList200Response4.equals(adGroupsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupsList200Response adGroupsList200Response1 = OASAdGroupsList200Response.getExample();
        OASAdGroupsList200Response adGroupsList200Response2 = new OASAdGroupsList200Response();

        System.assertEquals(false, adGroupsList200Response1.equals('foo'));
        System.assertEquals(false, adGroupsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupsList200Response adGroupsList200Response1 = OASAdGroupsList200Response.getExample();
        OASAdGroupsList200Response adGroupsList200Response2 = new OASAdGroupsList200Response();
        OASAdGroupsList200Response adGroupsList200Response3;

        System.assertEquals(false, adGroupsList200Response1.equals(adGroupsList200Response3));
        System.assertEquals(false, adGroupsList200Response2.equals(adGroupsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupsList200Response adGroupsList200Response1 = OASAdGroupsList200Response.getExample();
        OASAdGroupsList200Response adGroupsList200Response2 = new OASAdGroupsList200Response();

        System.assertEquals(adGroupsList200Response1.hashCode(), adGroupsList200Response1.hashCode());
        System.assertEquals(adGroupsList200Response2.hashCode(), adGroupsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupsList200Response adGroupsList200Response1 = OASAdGroupsList200Response.getExample();
        OASAdGroupsList200Response adGroupsList200Response2 = OASAdGroupsList200Response.getExample();
        OASAdGroupsList200Response adGroupsList200Response3 = new OASAdGroupsList200Response();
        OASAdGroupsList200Response adGroupsList200Response4 = new OASAdGroupsList200Response();

        System.assert(adGroupsList200Response1.equals(adGroupsList200Response2));
        System.assert(adGroupsList200Response3.equals(adGroupsList200Response4));
        System.assertEquals(adGroupsList200Response1.hashCode(), adGroupsList200Response2.hashCode());
        System.assertEquals(adGroupsList200Response3.hashCode(), adGroupsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdGroupsList200Response adGroupsList200Response = new OASAdGroupsList200Response();
        System.assertEquals(new List<OASAdGroupResponse>(), adGroupsList200Response.items);
        System.assertEquals(null, adGroupsList200Response.bookmark);
    }
}
