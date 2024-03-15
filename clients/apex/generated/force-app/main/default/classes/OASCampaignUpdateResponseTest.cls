@isTest
private class OASCampaignUpdateResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignUpdateResponse campaignUpdateResponse1 = OASCampaignUpdateResponse.getExample();
        OASCampaignUpdateResponse campaignUpdateResponse2 = campaignUpdateResponse1;
        OASCampaignUpdateResponse campaignUpdateResponse3 = new OASCampaignUpdateResponse();
        OASCampaignUpdateResponse campaignUpdateResponse4 = campaignUpdateResponse3;

        System.assert(campaignUpdateResponse1.equals(campaignUpdateResponse2));
        System.assert(campaignUpdateResponse2.equals(campaignUpdateResponse1));
        System.assert(campaignUpdateResponse1.equals(campaignUpdateResponse1));
        System.assert(campaignUpdateResponse3.equals(campaignUpdateResponse4));
        System.assert(campaignUpdateResponse4.equals(campaignUpdateResponse3));
        System.assert(campaignUpdateResponse3.equals(campaignUpdateResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignUpdateResponse campaignUpdateResponse1 = OASCampaignUpdateResponse.getExample();
        OASCampaignUpdateResponse campaignUpdateResponse2 = OASCampaignUpdateResponse.getExample();
        OASCampaignUpdateResponse campaignUpdateResponse3 = new OASCampaignUpdateResponse();
        OASCampaignUpdateResponse campaignUpdateResponse4 = new OASCampaignUpdateResponse();

        System.assert(campaignUpdateResponse1.equals(campaignUpdateResponse2));
        System.assert(campaignUpdateResponse2.equals(campaignUpdateResponse1));
        System.assert(campaignUpdateResponse3.equals(campaignUpdateResponse4));
        System.assert(campaignUpdateResponse4.equals(campaignUpdateResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignUpdateResponse campaignUpdateResponse1 = OASCampaignUpdateResponse.getExample();
        OASCampaignUpdateResponse campaignUpdateResponse2 = new OASCampaignUpdateResponse();

        System.assertEquals(false, campaignUpdateResponse1.equals('foo'));
        System.assertEquals(false, campaignUpdateResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignUpdateResponse campaignUpdateResponse1 = OASCampaignUpdateResponse.getExample();
        OASCampaignUpdateResponse campaignUpdateResponse2 = new OASCampaignUpdateResponse();
        OASCampaignUpdateResponse campaignUpdateResponse3;

        System.assertEquals(false, campaignUpdateResponse1.equals(campaignUpdateResponse3));
        System.assertEquals(false, campaignUpdateResponse2.equals(campaignUpdateResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignUpdateResponse campaignUpdateResponse1 = OASCampaignUpdateResponse.getExample();
        OASCampaignUpdateResponse campaignUpdateResponse2 = new OASCampaignUpdateResponse();

        System.assertEquals(campaignUpdateResponse1.hashCode(), campaignUpdateResponse1.hashCode());
        System.assertEquals(campaignUpdateResponse2.hashCode(), campaignUpdateResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignUpdateResponse campaignUpdateResponse1 = OASCampaignUpdateResponse.getExample();
        OASCampaignUpdateResponse campaignUpdateResponse2 = OASCampaignUpdateResponse.getExample();
        OASCampaignUpdateResponse campaignUpdateResponse3 = new OASCampaignUpdateResponse();
        OASCampaignUpdateResponse campaignUpdateResponse4 = new OASCampaignUpdateResponse();

        System.assert(campaignUpdateResponse1.equals(campaignUpdateResponse2));
        System.assert(campaignUpdateResponse3.equals(campaignUpdateResponse4));
        System.assertEquals(campaignUpdateResponse1.hashCode(), campaignUpdateResponse2.hashCode());
        System.assertEquals(campaignUpdateResponse3.hashCode(), campaignUpdateResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignUpdateResponse campaignUpdateResponse = new OASCampaignUpdateResponse();
        System.assertEquals(new List<OASCampaignCreateResponseItem>(), campaignUpdateResponse.items);
    }
}
