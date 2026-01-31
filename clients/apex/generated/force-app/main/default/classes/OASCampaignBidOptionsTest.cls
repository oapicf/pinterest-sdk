@isTest
private class OASCampaignBidOptionsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignBidOptions campaignBidOptions1 = OASCampaignBidOptions.getExample();
        OASCampaignBidOptions campaignBidOptions2 = campaignBidOptions1;
        OASCampaignBidOptions campaignBidOptions3 = new OASCampaignBidOptions();
        OASCampaignBidOptions campaignBidOptions4 = campaignBidOptions3;

        System.assert(campaignBidOptions1.equals(campaignBidOptions2));
        System.assert(campaignBidOptions2.equals(campaignBidOptions1));
        System.assert(campaignBidOptions1.equals(campaignBidOptions1));
        System.assert(campaignBidOptions3.equals(campaignBidOptions4));
        System.assert(campaignBidOptions4.equals(campaignBidOptions3));
        System.assert(campaignBidOptions3.equals(campaignBidOptions3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignBidOptions campaignBidOptions1 = OASCampaignBidOptions.getExample();
        OASCampaignBidOptions campaignBidOptions2 = OASCampaignBidOptions.getExample();
        OASCampaignBidOptions campaignBidOptions3 = new OASCampaignBidOptions();
        OASCampaignBidOptions campaignBidOptions4 = new OASCampaignBidOptions();

        System.assert(campaignBidOptions1.equals(campaignBidOptions2));
        System.assert(campaignBidOptions2.equals(campaignBidOptions1));
        System.assert(campaignBidOptions3.equals(campaignBidOptions4));
        System.assert(campaignBidOptions4.equals(campaignBidOptions3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignBidOptions campaignBidOptions1 = OASCampaignBidOptions.getExample();
        OASCampaignBidOptions campaignBidOptions2 = new OASCampaignBidOptions();

        System.assertEquals(false, campaignBidOptions1.equals('foo'));
        System.assertEquals(false, campaignBidOptions2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignBidOptions campaignBidOptions1 = OASCampaignBidOptions.getExample();
        OASCampaignBidOptions campaignBidOptions2 = new OASCampaignBidOptions();
        OASCampaignBidOptions campaignBidOptions3;

        System.assertEquals(false, campaignBidOptions1.equals(campaignBidOptions3));
        System.assertEquals(false, campaignBidOptions2.equals(campaignBidOptions3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignBidOptions campaignBidOptions1 = OASCampaignBidOptions.getExample();
        OASCampaignBidOptions campaignBidOptions2 = new OASCampaignBidOptions();

        System.assertEquals(campaignBidOptions1.hashCode(), campaignBidOptions1.hashCode());
        System.assertEquals(campaignBidOptions2.hashCode(), campaignBidOptions2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignBidOptions campaignBidOptions1 = OASCampaignBidOptions.getExample();
        OASCampaignBidOptions campaignBidOptions2 = OASCampaignBidOptions.getExample();
        OASCampaignBidOptions campaignBidOptions3 = new OASCampaignBidOptions();
        OASCampaignBidOptions campaignBidOptions4 = new OASCampaignBidOptions();

        System.assert(campaignBidOptions1.equals(campaignBidOptions2));
        System.assert(campaignBidOptions3.equals(campaignBidOptions4));
        System.assertEquals(campaignBidOptions1.hashCode(), campaignBidOptions2.hashCode());
        System.assertEquals(campaignBidOptions3.hashCode(), campaignBidOptions4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignBidOptions campaignBidOptions = new OASCampaignBidOptions();
        Map<String, String> x-property-mappings = campaignBidOptions.getx-property-mappings();
        System.assertEquals('appTypeMultipliers', x-property-mappings.get('app_type_multipliers'));
        System.assertEquals('audienceMultipliers', x-property-mappings.get('audience_multipliers'));
        System.assertEquals('placementMultipliers', x-property-mappings.get('placement_multipliers'));
    }
}
