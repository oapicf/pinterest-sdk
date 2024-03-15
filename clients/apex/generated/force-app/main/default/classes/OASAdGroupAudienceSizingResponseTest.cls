@isTest
private class OASAdGroupAudienceSizingResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse1 = OASAdGroupAudienceSizingResponse.getExample();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse2 = adGroupAudienceSizingResponse1;
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse3 = new OASAdGroupAudienceSizingResponse();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse4 = adGroupAudienceSizingResponse3;

        System.assert(adGroupAudienceSizingResponse1.equals(adGroupAudienceSizingResponse2));
        System.assert(adGroupAudienceSizingResponse2.equals(adGroupAudienceSizingResponse1));
        System.assert(adGroupAudienceSizingResponse1.equals(adGroupAudienceSizingResponse1));
        System.assert(adGroupAudienceSizingResponse3.equals(adGroupAudienceSizingResponse4));
        System.assert(adGroupAudienceSizingResponse4.equals(adGroupAudienceSizingResponse3));
        System.assert(adGroupAudienceSizingResponse3.equals(adGroupAudienceSizingResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse1 = OASAdGroupAudienceSizingResponse.getExample();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse2 = OASAdGroupAudienceSizingResponse.getExample();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse3 = new OASAdGroupAudienceSizingResponse();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse4 = new OASAdGroupAudienceSizingResponse();

        System.assert(adGroupAudienceSizingResponse1.equals(adGroupAudienceSizingResponse2));
        System.assert(adGroupAudienceSizingResponse2.equals(adGroupAudienceSizingResponse1));
        System.assert(adGroupAudienceSizingResponse3.equals(adGroupAudienceSizingResponse4));
        System.assert(adGroupAudienceSizingResponse4.equals(adGroupAudienceSizingResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse1 = OASAdGroupAudienceSizingResponse.getExample();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse2 = new OASAdGroupAudienceSizingResponse();

        System.assertEquals(false, adGroupAudienceSizingResponse1.equals('foo'));
        System.assertEquals(false, adGroupAudienceSizingResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse1 = OASAdGroupAudienceSizingResponse.getExample();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse2 = new OASAdGroupAudienceSizingResponse();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse3;

        System.assertEquals(false, adGroupAudienceSizingResponse1.equals(adGroupAudienceSizingResponse3));
        System.assertEquals(false, adGroupAudienceSizingResponse2.equals(adGroupAudienceSizingResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse1 = OASAdGroupAudienceSizingResponse.getExample();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse2 = new OASAdGroupAudienceSizingResponse();

        System.assertEquals(adGroupAudienceSizingResponse1.hashCode(), adGroupAudienceSizingResponse1.hashCode());
        System.assertEquals(adGroupAudienceSizingResponse2.hashCode(), adGroupAudienceSizingResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse1 = OASAdGroupAudienceSizingResponse.getExample();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse2 = OASAdGroupAudienceSizingResponse.getExample();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse3 = new OASAdGroupAudienceSizingResponse();
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse4 = new OASAdGroupAudienceSizingResponse();

        System.assert(adGroupAudienceSizingResponse1.equals(adGroupAudienceSizingResponse2));
        System.assert(adGroupAudienceSizingResponse3.equals(adGroupAudienceSizingResponse4));
        System.assertEquals(adGroupAudienceSizingResponse1.hashCode(), adGroupAudienceSizingResponse2.hashCode());
        System.assertEquals(adGroupAudienceSizingResponse3.hashCode(), adGroupAudienceSizingResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupAudienceSizingResponse adGroupAudienceSizingResponse = new OASAdGroupAudienceSizingResponse();
        Map<String, String> x-property-mappings = adGroupAudienceSizingResponse.getx-property-mappings();
        System.assertEquals('audienceSizeLowerBound', x-property-mappings.get('audience_size_lower_bound'));
        System.assertEquals('audienceSizeUpperBound', x-property-mappings.get('audience_size_upper_bound'));
    }
}
