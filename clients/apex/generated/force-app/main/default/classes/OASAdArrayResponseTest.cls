@isTest
private class OASAdArrayResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdArrayResponse adArrayResponse1 = OASAdArrayResponse.getExample();
        OASAdArrayResponse adArrayResponse2 = adArrayResponse1;
        OASAdArrayResponse adArrayResponse3 = new OASAdArrayResponse();
        OASAdArrayResponse adArrayResponse4 = adArrayResponse3;

        System.assert(adArrayResponse1.equals(adArrayResponse2));
        System.assert(adArrayResponse2.equals(adArrayResponse1));
        System.assert(adArrayResponse1.equals(adArrayResponse1));
        System.assert(adArrayResponse3.equals(adArrayResponse4));
        System.assert(adArrayResponse4.equals(adArrayResponse3));
        System.assert(adArrayResponse3.equals(adArrayResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdArrayResponse adArrayResponse1 = OASAdArrayResponse.getExample();
        OASAdArrayResponse adArrayResponse2 = OASAdArrayResponse.getExample();
        OASAdArrayResponse adArrayResponse3 = new OASAdArrayResponse();
        OASAdArrayResponse adArrayResponse4 = new OASAdArrayResponse();

        System.assert(adArrayResponse1.equals(adArrayResponse2));
        System.assert(adArrayResponse2.equals(adArrayResponse1));
        System.assert(adArrayResponse3.equals(adArrayResponse4));
        System.assert(adArrayResponse4.equals(adArrayResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdArrayResponse adArrayResponse1 = OASAdArrayResponse.getExample();
        OASAdArrayResponse adArrayResponse2 = new OASAdArrayResponse();

        System.assertEquals(false, adArrayResponse1.equals('foo'));
        System.assertEquals(false, adArrayResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdArrayResponse adArrayResponse1 = OASAdArrayResponse.getExample();
        OASAdArrayResponse adArrayResponse2 = new OASAdArrayResponse();
        OASAdArrayResponse adArrayResponse3;

        System.assertEquals(false, adArrayResponse1.equals(adArrayResponse3));
        System.assertEquals(false, adArrayResponse2.equals(adArrayResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdArrayResponse adArrayResponse1 = OASAdArrayResponse.getExample();
        OASAdArrayResponse adArrayResponse2 = new OASAdArrayResponse();

        System.assertEquals(adArrayResponse1.hashCode(), adArrayResponse1.hashCode());
        System.assertEquals(adArrayResponse2.hashCode(), adArrayResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdArrayResponse adArrayResponse1 = OASAdArrayResponse.getExample();
        OASAdArrayResponse adArrayResponse2 = OASAdArrayResponse.getExample();
        OASAdArrayResponse adArrayResponse3 = new OASAdArrayResponse();
        OASAdArrayResponse adArrayResponse4 = new OASAdArrayResponse();

        System.assert(adArrayResponse1.equals(adArrayResponse2));
        System.assert(adArrayResponse3.equals(adArrayResponse4));
        System.assertEquals(adArrayResponse1.hashCode(), adArrayResponse2.hashCode());
        System.assertEquals(adArrayResponse3.hashCode(), adArrayResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdArrayResponse adArrayResponse = new OASAdArrayResponse();
        System.assertEquals(new List<OASAdArrayResponseElement>(), adArrayResponse.items);
    }
}
