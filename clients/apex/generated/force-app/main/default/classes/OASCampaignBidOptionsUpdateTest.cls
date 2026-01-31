@isTest
private class OASCampaignBidOptionsUpdateTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate1 = OASCampaignBidOptionsUpdate.getExample();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate2 = campaignBidOptionsUpdate1;
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate3 = new OASCampaignBidOptionsUpdate();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate4 = campaignBidOptionsUpdate3;

        System.assert(campaignBidOptionsUpdate1.equals(campaignBidOptionsUpdate2));
        System.assert(campaignBidOptionsUpdate2.equals(campaignBidOptionsUpdate1));
        System.assert(campaignBidOptionsUpdate1.equals(campaignBidOptionsUpdate1));
        System.assert(campaignBidOptionsUpdate3.equals(campaignBidOptionsUpdate4));
        System.assert(campaignBidOptionsUpdate4.equals(campaignBidOptionsUpdate3));
        System.assert(campaignBidOptionsUpdate3.equals(campaignBidOptionsUpdate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate1 = OASCampaignBidOptionsUpdate.getExample();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate2 = OASCampaignBidOptionsUpdate.getExample();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate3 = new OASCampaignBidOptionsUpdate();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate4 = new OASCampaignBidOptionsUpdate();

        System.assert(campaignBidOptionsUpdate1.equals(campaignBidOptionsUpdate2));
        System.assert(campaignBidOptionsUpdate2.equals(campaignBidOptionsUpdate1));
        System.assert(campaignBidOptionsUpdate3.equals(campaignBidOptionsUpdate4));
        System.assert(campaignBidOptionsUpdate4.equals(campaignBidOptionsUpdate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate1 = OASCampaignBidOptionsUpdate.getExample();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate2 = new OASCampaignBidOptionsUpdate();

        System.assertEquals(false, campaignBidOptionsUpdate1.equals('foo'));
        System.assertEquals(false, campaignBidOptionsUpdate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate1 = OASCampaignBidOptionsUpdate.getExample();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate2 = new OASCampaignBidOptionsUpdate();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate3;

        System.assertEquals(false, campaignBidOptionsUpdate1.equals(campaignBidOptionsUpdate3));
        System.assertEquals(false, campaignBidOptionsUpdate2.equals(campaignBidOptionsUpdate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate1 = OASCampaignBidOptionsUpdate.getExample();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate2 = new OASCampaignBidOptionsUpdate();

        System.assertEquals(campaignBidOptionsUpdate1.hashCode(), campaignBidOptionsUpdate1.hashCode());
        System.assertEquals(campaignBidOptionsUpdate2.hashCode(), campaignBidOptionsUpdate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate1 = OASCampaignBidOptionsUpdate.getExample();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate2 = OASCampaignBidOptionsUpdate.getExample();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate3 = new OASCampaignBidOptionsUpdate();
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate4 = new OASCampaignBidOptionsUpdate();

        System.assert(campaignBidOptionsUpdate1.equals(campaignBidOptionsUpdate2));
        System.assert(campaignBidOptionsUpdate3.equals(campaignBidOptionsUpdate4));
        System.assertEquals(campaignBidOptionsUpdate1.hashCode(), campaignBidOptionsUpdate2.hashCode());
        System.assertEquals(campaignBidOptionsUpdate3.hashCode(), campaignBidOptionsUpdate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate = new OASCampaignBidOptionsUpdate();
        Map<String, String> x-property-mappings = campaignBidOptionsUpdate.getx-property-mappings();
        System.assertEquals('appTypeMultipliers', x-property-mappings.get('app_type_multipliers'));
        System.assertEquals('audienceMultipliers', x-property-mappings.get('audience_multipliers'));
        System.assertEquals('placementMultipliers', x-property-mappings.get('placement_multipliers'));
        System.assertEquals('updateMask', x-property-mappings.get('update_mask'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignBidOptionsUpdate campaignBidOptionsUpdate = new OASCampaignBidOptionsUpdate();
        System.assertEquals(new List<String>(), campaignBidOptionsUpdate.updateMask);
        System.assertEquals(null, campaignBidOptionsUpdate.appTypeMultipliers);
        System.assertEquals(null, campaignBidOptionsUpdate.audienceMultipliers);
        System.assertEquals(null, campaignBidOptionsUpdate.placementMultipliers);
    }
}
