@isTest
private class OASAdsCreditDiscountsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse1 = OASAdsCreditDiscountsResponse.getExample();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse2 = adsCreditDiscountsResponse1;
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse3 = new OASAdsCreditDiscountsResponse();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse4 = adsCreditDiscountsResponse3;

        System.assert(adsCreditDiscountsResponse1.equals(adsCreditDiscountsResponse2));
        System.assert(adsCreditDiscountsResponse2.equals(adsCreditDiscountsResponse1));
        System.assert(adsCreditDiscountsResponse1.equals(adsCreditDiscountsResponse1));
        System.assert(adsCreditDiscountsResponse3.equals(adsCreditDiscountsResponse4));
        System.assert(adsCreditDiscountsResponse4.equals(adsCreditDiscountsResponse3));
        System.assert(adsCreditDiscountsResponse3.equals(adsCreditDiscountsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse1 = OASAdsCreditDiscountsResponse.getExample();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse2 = OASAdsCreditDiscountsResponse.getExample();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse3 = new OASAdsCreditDiscountsResponse();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse4 = new OASAdsCreditDiscountsResponse();

        System.assert(adsCreditDiscountsResponse1.equals(adsCreditDiscountsResponse2));
        System.assert(adsCreditDiscountsResponse2.equals(adsCreditDiscountsResponse1));
        System.assert(adsCreditDiscountsResponse3.equals(adsCreditDiscountsResponse4));
        System.assert(adsCreditDiscountsResponse4.equals(adsCreditDiscountsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse1 = OASAdsCreditDiscountsResponse.getExample();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse2 = new OASAdsCreditDiscountsResponse();

        System.assertEquals(false, adsCreditDiscountsResponse1.equals('foo'));
        System.assertEquals(false, adsCreditDiscountsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse1 = OASAdsCreditDiscountsResponse.getExample();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse2 = new OASAdsCreditDiscountsResponse();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse3;

        System.assertEquals(false, adsCreditDiscountsResponse1.equals(adsCreditDiscountsResponse3));
        System.assertEquals(false, adsCreditDiscountsResponse2.equals(adsCreditDiscountsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse1 = OASAdsCreditDiscountsResponse.getExample();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse2 = new OASAdsCreditDiscountsResponse();

        System.assertEquals(adsCreditDiscountsResponse1.hashCode(), adsCreditDiscountsResponse1.hashCode());
        System.assertEquals(adsCreditDiscountsResponse2.hashCode(), adsCreditDiscountsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse1 = OASAdsCreditDiscountsResponse.getExample();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse2 = OASAdsCreditDiscountsResponse.getExample();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse3 = new OASAdsCreditDiscountsResponse();
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse4 = new OASAdsCreditDiscountsResponse();

        System.assert(adsCreditDiscountsResponse1.equals(adsCreditDiscountsResponse2));
        System.assert(adsCreditDiscountsResponse3.equals(adsCreditDiscountsResponse4));
        System.assertEquals(adsCreditDiscountsResponse1.hashCode(), adsCreditDiscountsResponse2.hashCode());
        System.assertEquals(adsCreditDiscountsResponse3.hashCode(), adsCreditDiscountsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdsCreditDiscountsResponse adsCreditDiscountsResponse = new OASAdsCreditDiscountsResponse();
        Map<String, String> x-property-mappings = adsCreditDiscountsResponse.getx-property-mappings();
        System.assertEquals('advertiserId', x-property-mappings.get('advertiser_id'));
    }
}
