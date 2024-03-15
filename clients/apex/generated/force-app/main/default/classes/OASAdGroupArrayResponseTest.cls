@isTest
private class OASAdGroupArrayResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupArrayResponse adGroupArrayResponse1 = OASAdGroupArrayResponse.getExample();
        OASAdGroupArrayResponse adGroupArrayResponse2 = adGroupArrayResponse1;
        OASAdGroupArrayResponse adGroupArrayResponse3 = new OASAdGroupArrayResponse();
        OASAdGroupArrayResponse adGroupArrayResponse4 = adGroupArrayResponse3;

        System.assert(adGroupArrayResponse1.equals(adGroupArrayResponse2));
        System.assert(adGroupArrayResponse2.equals(adGroupArrayResponse1));
        System.assert(adGroupArrayResponse1.equals(adGroupArrayResponse1));
        System.assert(adGroupArrayResponse3.equals(adGroupArrayResponse4));
        System.assert(adGroupArrayResponse4.equals(adGroupArrayResponse3));
        System.assert(adGroupArrayResponse3.equals(adGroupArrayResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupArrayResponse adGroupArrayResponse1 = OASAdGroupArrayResponse.getExample();
        OASAdGroupArrayResponse adGroupArrayResponse2 = OASAdGroupArrayResponse.getExample();
        OASAdGroupArrayResponse adGroupArrayResponse3 = new OASAdGroupArrayResponse();
        OASAdGroupArrayResponse adGroupArrayResponse4 = new OASAdGroupArrayResponse();

        System.assert(adGroupArrayResponse1.equals(adGroupArrayResponse2));
        System.assert(adGroupArrayResponse2.equals(adGroupArrayResponse1));
        System.assert(adGroupArrayResponse3.equals(adGroupArrayResponse4));
        System.assert(adGroupArrayResponse4.equals(adGroupArrayResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupArrayResponse adGroupArrayResponse1 = OASAdGroupArrayResponse.getExample();
        OASAdGroupArrayResponse adGroupArrayResponse2 = new OASAdGroupArrayResponse();

        System.assertEquals(false, adGroupArrayResponse1.equals('foo'));
        System.assertEquals(false, adGroupArrayResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupArrayResponse adGroupArrayResponse1 = OASAdGroupArrayResponse.getExample();
        OASAdGroupArrayResponse adGroupArrayResponse2 = new OASAdGroupArrayResponse();
        OASAdGroupArrayResponse adGroupArrayResponse3;

        System.assertEquals(false, adGroupArrayResponse1.equals(adGroupArrayResponse3));
        System.assertEquals(false, adGroupArrayResponse2.equals(adGroupArrayResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupArrayResponse adGroupArrayResponse1 = OASAdGroupArrayResponse.getExample();
        OASAdGroupArrayResponse adGroupArrayResponse2 = new OASAdGroupArrayResponse();

        System.assertEquals(adGroupArrayResponse1.hashCode(), adGroupArrayResponse1.hashCode());
        System.assertEquals(adGroupArrayResponse2.hashCode(), adGroupArrayResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupArrayResponse adGroupArrayResponse1 = OASAdGroupArrayResponse.getExample();
        OASAdGroupArrayResponse adGroupArrayResponse2 = OASAdGroupArrayResponse.getExample();
        OASAdGroupArrayResponse adGroupArrayResponse3 = new OASAdGroupArrayResponse();
        OASAdGroupArrayResponse adGroupArrayResponse4 = new OASAdGroupArrayResponse();

        System.assert(adGroupArrayResponse1.equals(adGroupArrayResponse2));
        System.assert(adGroupArrayResponse3.equals(adGroupArrayResponse4));
        System.assertEquals(adGroupArrayResponse1.hashCode(), adGroupArrayResponse2.hashCode());
        System.assertEquals(adGroupArrayResponse3.hashCode(), adGroupArrayResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdGroupArrayResponse adGroupArrayResponse = new OASAdGroupArrayResponse();
        System.assertEquals(new List<OASAdGroupArrayResponseElement>(), adGroupArrayResponse.items);
    }
}
