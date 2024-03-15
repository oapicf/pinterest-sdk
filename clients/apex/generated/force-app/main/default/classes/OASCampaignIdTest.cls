@isTest
private class OASCampaignIdTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignId campaignId1 = OASCampaignId.getExample();
        OASCampaignId campaignId2 = campaignId1;
        OASCampaignId campaignId3 = new OASCampaignId();
        OASCampaignId campaignId4 = campaignId3;

        System.assert(campaignId1.equals(campaignId2));
        System.assert(campaignId2.equals(campaignId1));
        System.assert(campaignId1.equals(campaignId1));
        System.assert(campaignId3.equals(campaignId4));
        System.assert(campaignId4.equals(campaignId3));
        System.assert(campaignId3.equals(campaignId3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignId campaignId1 = OASCampaignId.getExample();
        OASCampaignId campaignId2 = OASCampaignId.getExample();
        OASCampaignId campaignId3 = new OASCampaignId();
        OASCampaignId campaignId4 = new OASCampaignId();

        System.assert(campaignId1.equals(campaignId2));
        System.assert(campaignId2.equals(campaignId1));
        System.assert(campaignId3.equals(campaignId4));
        System.assert(campaignId4.equals(campaignId3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignId campaignId1 = OASCampaignId.getExample();
        OASCampaignId campaignId2 = new OASCampaignId();

        System.assertEquals(false, campaignId1.equals('foo'));
        System.assertEquals(false, campaignId2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignId campaignId1 = OASCampaignId.getExample();
        OASCampaignId campaignId2 = new OASCampaignId();
        OASCampaignId campaignId3;

        System.assertEquals(false, campaignId1.equals(campaignId3));
        System.assertEquals(false, campaignId2.equals(campaignId3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignId campaignId1 = OASCampaignId.getExample();
        OASCampaignId campaignId2 = new OASCampaignId();

        System.assertEquals(campaignId1.hashCode(), campaignId1.hashCode());
        System.assertEquals(campaignId2.hashCode(), campaignId2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignId campaignId1 = OASCampaignId.getExample();
        OASCampaignId campaignId2 = OASCampaignId.getExample();
        OASCampaignId campaignId3 = new OASCampaignId();
        OASCampaignId campaignId4 = new OASCampaignId();

        System.assert(campaignId1.equals(campaignId2));
        System.assert(campaignId3.equals(campaignId4));
        System.assertEquals(campaignId1.hashCode(), campaignId2.hashCode());
        System.assertEquals(campaignId3.hashCode(), campaignId4.hashCode());
    }
}
