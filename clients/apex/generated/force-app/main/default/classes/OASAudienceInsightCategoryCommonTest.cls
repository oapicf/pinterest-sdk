@isTest
private class OASAudienceInsightCategoryCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon1 = OASAudienceInsightCategoryCommon.getExample();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon2 = audienceInsightCategoryCommon1;
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon3 = new OASAudienceInsightCategoryCommon();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon4 = audienceInsightCategoryCommon3;

        System.assert(audienceInsightCategoryCommon1.equals(audienceInsightCategoryCommon2));
        System.assert(audienceInsightCategoryCommon2.equals(audienceInsightCategoryCommon1));
        System.assert(audienceInsightCategoryCommon1.equals(audienceInsightCategoryCommon1));
        System.assert(audienceInsightCategoryCommon3.equals(audienceInsightCategoryCommon4));
        System.assert(audienceInsightCategoryCommon4.equals(audienceInsightCategoryCommon3));
        System.assert(audienceInsightCategoryCommon3.equals(audienceInsightCategoryCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon1 = OASAudienceInsightCategoryCommon.getExample();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon2 = OASAudienceInsightCategoryCommon.getExample();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon3 = new OASAudienceInsightCategoryCommon();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon4 = new OASAudienceInsightCategoryCommon();

        System.assert(audienceInsightCategoryCommon1.equals(audienceInsightCategoryCommon2));
        System.assert(audienceInsightCategoryCommon2.equals(audienceInsightCategoryCommon1));
        System.assert(audienceInsightCategoryCommon3.equals(audienceInsightCategoryCommon4));
        System.assert(audienceInsightCategoryCommon4.equals(audienceInsightCategoryCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon1 = OASAudienceInsightCategoryCommon.getExample();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon2 = new OASAudienceInsightCategoryCommon();

        System.assertEquals(false, audienceInsightCategoryCommon1.equals('foo'));
        System.assertEquals(false, audienceInsightCategoryCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon1 = OASAudienceInsightCategoryCommon.getExample();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon2 = new OASAudienceInsightCategoryCommon();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon3;

        System.assertEquals(false, audienceInsightCategoryCommon1.equals(audienceInsightCategoryCommon3));
        System.assertEquals(false, audienceInsightCategoryCommon2.equals(audienceInsightCategoryCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon1 = OASAudienceInsightCategoryCommon.getExample();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon2 = new OASAudienceInsightCategoryCommon();

        System.assertEquals(audienceInsightCategoryCommon1.hashCode(), audienceInsightCategoryCommon1.hashCode());
        System.assertEquals(audienceInsightCategoryCommon2.hashCode(), audienceInsightCategoryCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon1 = OASAudienceInsightCategoryCommon.getExample();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon2 = OASAudienceInsightCategoryCommon.getExample();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon3 = new OASAudienceInsightCategoryCommon();
        OASAudienceInsightCategoryCommon audienceInsightCategoryCommon4 = new OASAudienceInsightCategoryCommon();

        System.assert(audienceInsightCategoryCommon1.equals(audienceInsightCategoryCommon2));
        System.assert(audienceInsightCategoryCommon3.equals(audienceInsightCategoryCommon4));
        System.assertEquals(audienceInsightCategoryCommon1.hashCode(), audienceInsightCategoryCommon2.hashCode());
        System.assertEquals(audienceInsightCategoryCommon3.hashCode(), audienceInsightCategoryCommon4.hashCode());
    }
}
