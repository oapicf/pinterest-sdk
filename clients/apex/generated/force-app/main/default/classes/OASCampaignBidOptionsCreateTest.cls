@isTest
private class OASCampaignBidOptionsCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignBidOptionsCreate campaignBidOptionsCreate1 = OASCampaignBidOptionsCreate.getExample();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate2 = campaignBidOptionsCreate1;
        OASCampaignBidOptionsCreate campaignBidOptionsCreate3 = new OASCampaignBidOptionsCreate();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate4 = campaignBidOptionsCreate3;

        System.assert(campaignBidOptionsCreate1.equals(campaignBidOptionsCreate2));
        System.assert(campaignBidOptionsCreate2.equals(campaignBidOptionsCreate1));
        System.assert(campaignBidOptionsCreate1.equals(campaignBidOptionsCreate1));
        System.assert(campaignBidOptionsCreate3.equals(campaignBidOptionsCreate4));
        System.assert(campaignBidOptionsCreate4.equals(campaignBidOptionsCreate3));
        System.assert(campaignBidOptionsCreate3.equals(campaignBidOptionsCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignBidOptionsCreate campaignBidOptionsCreate1 = OASCampaignBidOptionsCreate.getExample();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate2 = OASCampaignBidOptionsCreate.getExample();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate3 = new OASCampaignBidOptionsCreate();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate4 = new OASCampaignBidOptionsCreate();

        System.assert(campaignBidOptionsCreate1.equals(campaignBidOptionsCreate2));
        System.assert(campaignBidOptionsCreate2.equals(campaignBidOptionsCreate1));
        System.assert(campaignBidOptionsCreate3.equals(campaignBidOptionsCreate4));
        System.assert(campaignBidOptionsCreate4.equals(campaignBidOptionsCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignBidOptionsCreate campaignBidOptionsCreate1 = OASCampaignBidOptionsCreate.getExample();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate2 = new OASCampaignBidOptionsCreate();

        System.assertEquals(false, campaignBidOptionsCreate1.equals('foo'));
        System.assertEquals(false, campaignBidOptionsCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignBidOptionsCreate campaignBidOptionsCreate1 = OASCampaignBidOptionsCreate.getExample();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate2 = new OASCampaignBidOptionsCreate();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate3;

        System.assertEquals(false, campaignBidOptionsCreate1.equals(campaignBidOptionsCreate3));
        System.assertEquals(false, campaignBidOptionsCreate2.equals(campaignBidOptionsCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignBidOptionsCreate campaignBidOptionsCreate1 = OASCampaignBidOptionsCreate.getExample();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate2 = new OASCampaignBidOptionsCreate();

        System.assertEquals(campaignBidOptionsCreate1.hashCode(), campaignBidOptionsCreate1.hashCode());
        System.assertEquals(campaignBidOptionsCreate2.hashCode(), campaignBidOptionsCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignBidOptionsCreate campaignBidOptionsCreate1 = OASCampaignBidOptionsCreate.getExample();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate2 = OASCampaignBidOptionsCreate.getExample();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate3 = new OASCampaignBidOptionsCreate();
        OASCampaignBidOptionsCreate campaignBidOptionsCreate4 = new OASCampaignBidOptionsCreate();

        System.assert(campaignBidOptionsCreate1.equals(campaignBidOptionsCreate2));
        System.assert(campaignBidOptionsCreate3.equals(campaignBidOptionsCreate4));
        System.assertEquals(campaignBidOptionsCreate1.hashCode(), campaignBidOptionsCreate2.hashCode());
        System.assertEquals(campaignBidOptionsCreate3.hashCode(), campaignBidOptionsCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignBidOptionsCreate campaignBidOptionsCreate = new OASCampaignBidOptionsCreate();
        Map<String, String> x-property-mappings = campaignBidOptionsCreate.getx-property-mappings();
        System.assertEquals('appTypeMultipliers', x-property-mappings.get('app_type_multipliers'));
        System.assertEquals('audienceMultipliers', x-property-mappings.get('audience_multipliers'));
        System.assertEquals('placementMultipliers', x-property-mappings.get('placement_multipliers'));
    }
}
