@isTest
private class OASCampaignCreateResponseItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignCreateResponseItem campaignCreateResponseItem1 = OASCampaignCreateResponseItem.getExample();
        OASCampaignCreateResponseItem campaignCreateResponseItem2 = campaignCreateResponseItem1;
        OASCampaignCreateResponseItem campaignCreateResponseItem3 = new OASCampaignCreateResponseItem();
        OASCampaignCreateResponseItem campaignCreateResponseItem4 = campaignCreateResponseItem3;

        System.assert(campaignCreateResponseItem1.equals(campaignCreateResponseItem2));
        System.assert(campaignCreateResponseItem2.equals(campaignCreateResponseItem1));
        System.assert(campaignCreateResponseItem1.equals(campaignCreateResponseItem1));
        System.assert(campaignCreateResponseItem3.equals(campaignCreateResponseItem4));
        System.assert(campaignCreateResponseItem4.equals(campaignCreateResponseItem3));
        System.assert(campaignCreateResponseItem3.equals(campaignCreateResponseItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignCreateResponseItem campaignCreateResponseItem1 = OASCampaignCreateResponseItem.getExample();
        OASCampaignCreateResponseItem campaignCreateResponseItem2 = OASCampaignCreateResponseItem.getExample();
        OASCampaignCreateResponseItem campaignCreateResponseItem3 = new OASCampaignCreateResponseItem();
        OASCampaignCreateResponseItem campaignCreateResponseItem4 = new OASCampaignCreateResponseItem();

        System.assert(campaignCreateResponseItem1.equals(campaignCreateResponseItem2));
        System.assert(campaignCreateResponseItem2.equals(campaignCreateResponseItem1));
        System.assert(campaignCreateResponseItem3.equals(campaignCreateResponseItem4));
        System.assert(campaignCreateResponseItem4.equals(campaignCreateResponseItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignCreateResponseItem campaignCreateResponseItem1 = OASCampaignCreateResponseItem.getExample();
        OASCampaignCreateResponseItem campaignCreateResponseItem2 = new OASCampaignCreateResponseItem();

        System.assertEquals(false, campaignCreateResponseItem1.equals('foo'));
        System.assertEquals(false, campaignCreateResponseItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignCreateResponseItem campaignCreateResponseItem1 = OASCampaignCreateResponseItem.getExample();
        OASCampaignCreateResponseItem campaignCreateResponseItem2 = new OASCampaignCreateResponseItem();
        OASCampaignCreateResponseItem campaignCreateResponseItem3;

        System.assertEquals(false, campaignCreateResponseItem1.equals(campaignCreateResponseItem3));
        System.assertEquals(false, campaignCreateResponseItem2.equals(campaignCreateResponseItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignCreateResponseItem campaignCreateResponseItem1 = OASCampaignCreateResponseItem.getExample();
        OASCampaignCreateResponseItem campaignCreateResponseItem2 = new OASCampaignCreateResponseItem();

        System.assertEquals(campaignCreateResponseItem1.hashCode(), campaignCreateResponseItem1.hashCode());
        System.assertEquals(campaignCreateResponseItem2.hashCode(), campaignCreateResponseItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignCreateResponseItem campaignCreateResponseItem1 = OASCampaignCreateResponseItem.getExample();
        OASCampaignCreateResponseItem campaignCreateResponseItem2 = OASCampaignCreateResponseItem.getExample();
        OASCampaignCreateResponseItem campaignCreateResponseItem3 = new OASCampaignCreateResponseItem();
        OASCampaignCreateResponseItem campaignCreateResponseItem4 = new OASCampaignCreateResponseItem();

        System.assert(campaignCreateResponseItem1.equals(campaignCreateResponseItem2));
        System.assert(campaignCreateResponseItem3.equals(campaignCreateResponseItem4));
        System.assertEquals(campaignCreateResponseItem1.hashCode(), campaignCreateResponseItem2.hashCode());
        System.assertEquals(campaignCreateResponseItem3.hashCode(), campaignCreateResponseItem4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignCreateResponseItem campaignCreateResponseItem = new OASCampaignCreateResponseItem();
        System.assertEquals(new List<OASException>(), campaignCreateResponseItem.exceptions);
        System.assertEquals(null, campaignCreateResponseItem.data);
    }
}
