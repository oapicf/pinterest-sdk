@isTest
private class OASCampaignAudienceMultipliersTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignAudienceMultipliers campaignAudienceMultipliers1 = OASCampaignAudienceMultipliers.getExample();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers2 = campaignAudienceMultipliers1;
        OASCampaignAudienceMultipliers campaignAudienceMultipliers3 = new OASCampaignAudienceMultipliers();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers4 = campaignAudienceMultipliers3;

        System.assert(campaignAudienceMultipliers1.equals(campaignAudienceMultipliers2));
        System.assert(campaignAudienceMultipliers2.equals(campaignAudienceMultipliers1));
        System.assert(campaignAudienceMultipliers1.equals(campaignAudienceMultipliers1));
        System.assert(campaignAudienceMultipliers3.equals(campaignAudienceMultipliers4));
        System.assert(campaignAudienceMultipliers4.equals(campaignAudienceMultipliers3));
        System.assert(campaignAudienceMultipliers3.equals(campaignAudienceMultipliers3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignAudienceMultipliers campaignAudienceMultipliers1 = OASCampaignAudienceMultipliers.getExample();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers2 = OASCampaignAudienceMultipliers.getExample();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers3 = new OASCampaignAudienceMultipliers();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers4 = new OASCampaignAudienceMultipliers();

        System.assert(campaignAudienceMultipliers1.equals(campaignAudienceMultipliers2));
        System.assert(campaignAudienceMultipliers2.equals(campaignAudienceMultipliers1));
        System.assert(campaignAudienceMultipliers3.equals(campaignAudienceMultipliers4));
        System.assert(campaignAudienceMultipliers4.equals(campaignAudienceMultipliers3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignAudienceMultipliers campaignAudienceMultipliers1 = OASCampaignAudienceMultipliers.getExample();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers2 = new OASCampaignAudienceMultipliers();

        System.assertEquals(false, campaignAudienceMultipliers1.equals('foo'));
        System.assertEquals(false, campaignAudienceMultipliers2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignAudienceMultipliers campaignAudienceMultipliers1 = OASCampaignAudienceMultipliers.getExample();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers2 = new OASCampaignAudienceMultipliers();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers3;

        System.assertEquals(false, campaignAudienceMultipliers1.equals(campaignAudienceMultipliers3));
        System.assertEquals(false, campaignAudienceMultipliers2.equals(campaignAudienceMultipliers3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignAudienceMultipliers campaignAudienceMultipliers1 = OASCampaignAudienceMultipliers.getExample();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers2 = new OASCampaignAudienceMultipliers();

        System.assertEquals(campaignAudienceMultipliers1.hashCode(), campaignAudienceMultipliers1.hashCode());
        System.assertEquals(campaignAudienceMultipliers2.hashCode(), campaignAudienceMultipliers2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignAudienceMultipliers campaignAudienceMultipliers1 = OASCampaignAudienceMultipliers.getExample();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers2 = OASCampaignAudienceMultipliers.getExample();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers3 = new OASCampaignAudienceMultipliers();
        OASCampaignAudienceMultipliers campaignAudienceMultipliers4 = new OASCampaignAudienceMultipliers();

        System.assert(campaignAudienceMultipliers1.equals(campaignAudienceMultipliers2));
        System.assert(campaignAudienceMultipliers3.equals(campaignAudienceMultipliers4));
        System.assertEquals(campaignAudienceMultipliers1.hashCode(), campaignAudienceMultipliers2.hashCode());
        System.assertEquals(campaignAudienceMultipliers3.hashCode(), campaignAudienceMultipliers4.hashCode());
    }
}
