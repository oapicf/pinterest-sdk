@isTest
private class OASAudienceInsightCategoryArrayRespoTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse1 = OASAudienceInsightCategoryArrayRespo.getExample();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse2 = audienceInsightCategoryArrayResponse1;
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse3 = new OASAudienceInsightCategoryArrayRespo();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse4 = audienceInsightCategoryArrayResponse3;

        System.assert(audienceInsightCategoryArrayResponse1.equals(audienceInsightCategoryArrayResponse2));
        System.assert(audienceInsightCategoryArrayResponse2.equals(audienceInsightCategoryArrayResponse1));
        System.assert(audienceInsightCategoryArrayResponse1.equals(audienceInsightCategoryArrayResponse1));
        System.assert(audienceInsightCategoryArrayResponse3.equals(audienceInsightCategoryArrayResponse4));
        System.assert(audienceInsightCategoryArrayResponse4.equals(audienceInsightCategoryArrayResponse3));
        System.assert(audienceInsightCategoryArrayResponse3.equals(audienceInsightCategoryArrayResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse1 = OASAudienceInsightCategoryArrayRespo.getExample();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse2 = OASAudienceInsightCategoryArrayRespo.getExample();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse3 = new OASAudienceInsightCategoryArrayRespo();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse4 = new OASAudienceInsightCategoryArrayRespo();

        System.assert(audienceInsightCategoryArrayResponse1.equals(audienceInsightCategoryArrayResponse2));
        System.assert(audienceInsightCategoryArrayResponse2.equals(audienceInsightCategoryArrayResponse1));
        System.assert(audienceInsightCategoryArrayResponse3.equals(audienceInsightCategoryArrayResponse4));
        System.assert(audienceInsightCategoryArrayResponse4.equals(audienceInsightCategoryArrayResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse1 = OASAudienceInsightCategoryArrayRespo.getExample();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse2 = new OASAudienceInsightCategoryArrayRespo();

        System.assertEquals(false, audienceInsightCategoryArrayResponse1.equals('foo'));
        System.assertEquals(false, audienceInsightCategoryArrayResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse1 = OASAudienceInsightCategoryArrayRespo.getExample();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse2 = new OASAudienceInsightCategoryArrayRespo();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse3;

        System.assertEquals(false, audienceInsightCategoryArrayResponse1.equals(audienceInsightCategoryArrayResponse3));
        System.assertEquals(false, audienceInsightCategoryArrayResponse2.equals(audienceInsightCategoryArrayResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse1 = OASAudienceInsightCategoryArrayRespo.getExample();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse2 = new OASAudienceInsightCategoryArrayRespo();

        System.assertEquals(audienceInsightCategoryArrayResponse1.hashCode(), audienceInsightCategoryArrayResponse1.hashCode());
        System.assertEquals(audienceInsightCategoryArrayResponse2.hashCode(), audienceInsightCategoryArrayResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse1 = OASAudienceInsightCategoryArrayRespo.getExample();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse2 = OASAudienceInsightCategoryArrayRespo.getExample();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse3 = new OASAudienceInsightCategoryArrayRespo();
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse4 = new OASAudienceInsightCategoryArrayRespo();

        System.assert(audienceInsightCategoryArrayResponse1.equals(audienceInsightCategoryArrayResponse2));
        System.assert(audienceInsightCategoryArrayResponse3.equals(audienceInsightCategoryArrayResponse4));
        System.assertEquals(audienceInsightCategoryArrayResponse1.hashCode(), audienceInsightCategoryArrayResponse2.hashCode());
        System.assertEquals(audienceInsightCategoryArrayResponse3.hashCode(), audienceInsightCategoryArrayResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAudienceInsightCategoryArrayRespo audienceInsightCategoryArrayResponse = new OASAudienceInsightCategoryArrayRespo();
        System.assertEquals(new List<OASAudienceInsightCategoryCommon>(), audienceInsightCategoryArrayResponse.items);
    }
}
