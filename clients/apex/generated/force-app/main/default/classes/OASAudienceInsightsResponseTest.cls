@isTest
private class OASAudienceInsightsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceInsightsResponse audienceInsightsResponse1 = OASAudienceInsightsResponse.getExample();
        OASAudienceInsightsResponse audienceInsightsResponse2 = audienceInsightsResponse1;
        OASAudienceInsightsResponse audienceInsightsResponse3 = new OASAudienceInsightsResponse();
        OASAudienceInsightsResponse audienceInsightsResponse4 = audienceInsightsResponse3;

        System.assert(audienceInsightsResponse1.equals(audienceInsightsResponse2));
        System.assert(audienceInsightsResponse2.equals(audienceInsightsResponse1));
        System.assert(audienceInsightsResponse1.equals(audienceInsightsResponse1));
        System.assert(audienceInsightsResponse3.equals(audienceInsightsResponse4));
        System.assert(audienceInsightsResponse4.equals(audienceInsightsResponse3));
        System.assert(audienceInsightsResponse3.equals(audienceInsightsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceInsightsResponse audienceInsightsResponse1 = OASAudienceInsightsResponse.getExample();
        OASAudienceInsightsResponse audienceInsightsResponse2 = OASAudienceInsightsResponse.getExample();
        OASAudienceInsightsResponse audienceInsightsResponse3 = new OASAudienceInsightsResponse();
        OASAudienceInsightsResponse audienceInsightsResponse4 = new OASAudienceInsightsResponse();

        System.assert(audienceInsightsResponse1.equals(audienceInsightsResponse2));
        System.assert(audienceInsightsResponse2.equals(audienceInsightsResponse1));
        System.assert(audienceInsightsResponse3.equals(audienceInsightsResponse4));
        System.assert(audienceInsightsResponse4.equals(audienceInsightsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceInsightsResponse audienceInsightsResponse1 = OASAudienceInsightsResponse.getExample();
        OASAudienceInsightsResponse audienceInsightsResponse2 = new OASAudienceInsightsResponse();

        System.assertEquals(false, audienceInsightsResponse1.equals('foo'));
        System.assertEquals(false, audienceInsightsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceInsightsResponse audienceInsightsResponse1 = OASAudienceInsightsResponse.getExample();
        OASAudienceInsightsResponse audienceInsightsResponse2 = new OASAudienceInsightsResponse();
        OASAudienceInsightsResponse audienceInsightsResponse3;

        System.assertEquals(false, audienceInsightsResponse1.equals(audienceInsightsResponse3));
        System.assertEquals(false, audienceInsightsResponse2.equals(audienceInsightsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceInsightsResponse audienceInsightsResponse1 = OASAudienceInsightsResponse.getExample();
        OASAudienceInsightsResponse audienceInsightsResponse2 = new OASAudienceInsightsResponse();

        System.assertEquals(audienceInsightsResponse1.hashCode(), audienceInsightsResponse1.hashCode());
        System.assertEquals(audienceInsightsResponse2.hashCode(), audienceInsightsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceInsightsResponse audienceInsightsResponse1 = OASAudienceInsightsResponse.getExample();
        OASAudienceInsightsResponse audienceInsightsResponse2 = OASAudienceInsightsResponse.getExample();
        OASAudienceInsightsResponse audienceInsightsResponse3 = new OASAudienceInsightsResponse();
        OASAudienceInsightsResponse audienceInsightsResponse4 = new OASAudienceInsightsResponse();

        System.assert(audienceInsightsResponse1.equals(audienceInsightsResponse2));
        System.assert(audienceInsightsResponse3.equals(audienceInsightsResponse4));
        System.assertEquals(audienceInsightsResponse1.hashCode(), audienceInsightsResponse2.hashCode());
        System.assertEquals(audienceInsightsResponse3.hashCode(), audienceInsightsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAudienceInsightsResponse audienceInsightsResponse = new OASAudienceInsightsResponse();
        Map<String, String> x-property-mappings = audienceInsightsResponse.getx-property-mappings();
        System.assertEquals('r_date', x-property-mappings.get('date'));
        System.assertEquals('sizeIsUpperBound', x-property-mappings.get('size_is_upper_bound'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAudienceInsightsResponse audienceInsightsResponse = new OASAudienceInsightsResponse();
        System.assertEquals(new List<OASAudienceCategory>(), audienceInsightsResponse.categories);
        System.assertEquals(null, audienceInsightsResponse.demographics);
        System.assertEquals(null, audienceInsightsResponse.type);
        System.assertEquals(null, audienceInsightsResponse.r_date);
        System.assertEquals(null, audienceInsightsResponse.size);
        System.assertEquals(null, audienceInsightsResponse.sizeIsUpperBound);
    }
}
