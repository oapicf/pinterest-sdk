@isTest
private class OASAudienceCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceCommon audienceCommon1 = OASAudienceCommon.getExample();
        OASAudienceCommon audienceCommon2 = audienceCommon1;
        OASAudienceCommon audienceCommon3 = new OASAudienceCommon();
        OASAudienceCommon audienceCommon4 = audienceCommon3;

        System.assert(audienceCommon1.equals(audienceCommon2));
        System.assert(audienceCommon2.equals(audienceCommon1));
        System.assert(audienceCommon1.equals(audienceCommon1));
        System.assert(audienceCommon3.equals(audienceCommon4));
        System.assert(audienceCommon4.equals(audienceCommon3));
        System.assert(audienceCommon3.equals(audienceCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceCommon audienceCommon1 = OASAudienceCommon.getExample();
        OASAudienceCommon audienceCommon2 = OASAudienceCommon.getExample();
        OASAudienceCommon audienceCommon3 = new OASAudienceCommon();
        OASAudienceCommon audienceCommon4 = new OASAudienceCommon();

        System.assert(audienceCommon1.equals(audienceCommon2));
        System.assert(audienceCommon2.equals(audienceCommon1));
        System.assert(audienceCommon3.equals(audienceCommon4));
        System.assert(audienceCommon4.equals(audienceCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceCommon audienceCommon1 = OASAudienceCommon.getExample();
        OASAudienceCommon audienceCommon2 = new OASAudienceCommon();

        System.assertEquals(false, audienceCommon1.equals('foo'));
        System.assertEquals(false, audienceCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceCommon audienceCommon1 = OASAudienceCommon.getExample();
        OASAudienceCommon audienceCommon2 = new OASAudienceCommon();
        OASAudienceCommon audienceCommon3;

        System.assertEquals(false, audienceCommon1.equals(audienceCommon3));
        System.assertEquals(false, audienceCommon2.equals(audienceCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceCommon audienceCommon1 = OASAudienceCommon.getExample();
        OASAudienceCommon audienceCommon2 = new OASAudienceCommon();

        System.assertEquals(audienceCommon1.hashCode(), audienceCommon1.hashCode());
        System.assertEquals(audienceCommon2.hashCode(), audienceCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceCommon audienceCommon1 = OASAudienceCommon.getExample();
        OASAudienceCommon audienceCommon2 = OASAudienceCommon.getExample();
        OASAudienceCommon audienceCommon3 = new OASAudienceCommon();
        OASAudienceCommon audienceCommon4 = new OASAudienceCommon();

        System.assert(audienceCommon1.equals(audienceCommon2));
        System.assert(audienceCommon3.equals(audienceCommon4));
        System.assertEquals(audienceCommon1.hashCode(), audienceCommon2.hashCode());
        System.assertEquals(audienceCommon3.hashCode(), audienceCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAudienceCommon audienceCommon = new OASAudienceCommon();
        Map<String, String> x-property-mappings = audienceCommon.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
    }
}
