@isTest
private class OASCampaignsAnalyticsResponseInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner1 = OASCampaignsAnalyticsResponseInner.getExample();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner2 = campaignsAnalyticsResponseInner1;
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner3 = new OASCampaignsAnalyticsResponseInner();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner4 = campaignsAnalyticsResponseInner3;

        System.assert(campaignsAnalyticsResponseInner1.equals(campaignsAnalyticsResponseInner2));
        System.assert(campaignsAnalyticsResponseInner2.equals(campaignsAnalyticsResponseInner1));
        System.assert(campaignsAnalyticsResponseInner1.equals(campaignsAnalyticsResponseInner1));
        System.assert(campaignsAnalyticsResponseInner3.equals(campaignsAnalyticsResponseInner4));
        System.assert(campaignsAnalyticsResponseInner4.equals(campaignsAnalyticsResponseInner3));
        System.assert(campaignsAnalyticsResponseInner3.equals(campaignsAnalyticsResponseInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner1 = OASCampaignsAnalyticsResponseInner.getExample();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner2 = OASCampaignsAnalyticsResponseInner.getExample();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner3 = new OASCampaignsAnalyticsResponseInner();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner4 = new OASCampaignsAnalyticsResponseInner();

        System.assert(campaignsAnalyticsResponseInner1.equals(campaignsAnalyticsResponseInner2));
        System.assert(campaignsAnalyticsResponseInner2.equals(campaignsAnalyticsResponseInner1));
        System.assert(campaignsAnalyticsResponseInner3.equals(campaignsAnalyticsResponseInner4));
        System.assert(campaignsAnalyticsResponseInner4.equals(campaignsAnalyticsResponseInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner1 = OASCampaignsAnalyticsResponseInner.getExample();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner2 = new OASCampaignsAnalyticsResponseInner();

        System.assertEquals(false, campaignsAnalyticsResponseInner1.equals('foo'));
        System.assertEquals(false, campaignsAnalyticsResponseInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner1 = OASCampaignsAnalyticsResponseInner.getExample();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner2 = new OASCampaignsAnalyticsResponseInner();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner3;

        System.assertEquals(false, campaignsAnalyticsResponseInner1.equals(campaignsAnalyticsResponseInner3));
        System.assertEquals(false, campaignsAnalyticsResponseInner2.equals(campaignsAnalyticsResponseInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner1 = OASCampaignsAnalyticsResponseInner.getExample();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner2 = new OASCampaignsAnalyticsResponseInner();

        System.assertEquals(campaignsAnalyticsResponseInner1.hashCode(), campaignsAnalyticsResponseInner1.hashCode());
        System.assertEquals(campaignsAnalyticsResponseInner2.hashCode(), campaignsAnalyticsResponseInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner1 = OASCampaignsAnalyticsResponseInner.getExample();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner2 = OASCampaignsAnalyticsResponseInner.getExample();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner3 = new OASCampaignsAnalyticsResponseInner();
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner4 = new OASCampaignsAnalyticsResponseInner();

        System.assert(campaignsAnalyticsResponseInner1.equals(campaignsAnalyticsResponseInner2));
        System.assert(campaignsAnalyticsResponseInner3.equals(campaignsAnalyticsResponseInner4));
        System.assertEquals(campaignsAnalyticsResponseInner1.hashCode(), campaignsAnalyticsResponseInner2.hashCode());
        System.assertEquals(campaignsAnalyticsResponseInner3.hashCode(), campaignsAnalyticsResponseInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner = new OASCampaignsAnalyticsResponseInner();
        Map<String, String> x-property-mappings = campaignsAnalyticsResponseInner.getx-property-mappings();
        System.assertEquals('r_DATE', x-property-mappings.get('DATE'));
    }
}
