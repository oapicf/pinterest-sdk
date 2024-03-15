@isTest
private class OASCampaignCreateResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignCreateResponse campaignCreateResponse1 = OASCampaignCreateResponse.getExample();
        OASCampaignCreateResponse campaignCreateResponse2 = campaignCreateResponse1;
        OASCampaignCreateResponse campaignCreateResponse3 = new OASCampaignCreateResponse();
        OASCampaignCreateResponse campaignCreateResponse4 = campaignCreateResponse3;

        System.assert(campaignCreateResponse1.equals(campaignCreateResponse2));
        System.assert(campaignCreateResponse2.equals(campaignCreateResponse1));
        System.assert(campaignCreateResponse1.equals(campaignCreateResponse1));
        System.assert(campaignCreateResponse3.equals(campaignCreateResponse4));
        System.assert(campaignCreateResponse4.equals(campaignCreateResponse3));
        System.assert(campaignCreateResponse3.equals(campaignCreateResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignCreateResponse campaignCreateResponse1 = OASCampaignCreateResponse.getExample();
        OASCampaignCreateResponse campaignCreateResponse2 = OASCampaignCreateResponse.getExample();
        OASCampaignCreateResponse campaignCreateResponse3 = new OASCampaignCreateResponse();
        OASCampaignCreateResponse campaignCreateResponse4 = new OASCampaignCreateResponse();

        System.assert(campaignCreateResponse1.equals(campaignCreateResponse2));
        System.assert(campaignCreateResponse2.equals(campaignCreateResponse1));
        System.assert(campaignCreateResponse3.equals(campaignCreateResponse4));
        System.assert(campaignCreateResponse4.equals(campaignCreateResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignCreateResponse campaignCreateResponse1 = OASCampaignCreateResponse.getExample();
        OASCampaignCreateResponse campaignCreateResponse2 = new OASCampaignCreateResponse();

        System.assertEquals(false, campaignCreateResponse1.equals('foo'));
        System.assertEquals(false, campaignCreateResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignCreateResponse campaignCreateResponse1 = OASCampaignCreateResponse.getExample();
        OASCampaignCreateResponse campaignCreateResponse2 = new OASCampaignCreateResponse();
        OASCampaignCreateResponse campaignCreateResponse3;

        System.assertEquals(false, campaignCreateResponse1.equals(campaignCreateResponse3));
        System.assertEquals(false, campaignCreateResponse2.equals(campaignCreateResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignCreateResponse campaignCreateResponse1 = OASCampaignCreateResponse.getExample();
        OASCampaignCreateResponse campaignCreateResponse2 = new OASCampaignCreateResponse();

        System.assertEquals(campaignCreateResponse1.hashCode(), campaignCreateResponse1.hashCode());
        System.assertEquals(campaignCreateResponse2.hashCode(), campaignCreateResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignCreateResponse campaignCreateResponse1 = OASCampaignCreateResponse.getExample();
        OASCampaignCreateResponse campaignCreateResponse2 = OASCampaignCreateResponse.getExample();
        OASCampaignCreateResponse campaignCreateResponse3 = new OASCampaignCreateResponse();
        OASCampaignCreateResponse campaignCreateResponse4 = new OASCampaignCreateResponse();

        System.assert(campaignCreateResponse1.equals(campaignCreateResponse2));
        System.assert(campaignCreateResponse3.equals(campaignCreateResponse4));
        System.assertEquals(campaignCreateResponse1.hashCode(), campaignCreateResponse2.hashCode());
        System.assertEquals(campaignCreateResponse3.hashCode(), campaignCreateResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignCreateResponse campaignCreateResponse = new OASCampaignCreateResponse();
        System.assertEquals(new List<OASCampaignCreateResponseItem>(), campaignCreateResponse.items);
    }
}
