@isTest
private class OASCampaignsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignsList200Response campaignsList200Response1 = OASCampaignsList200Response.getExample();
        OASCampaignsList200Response campaignsList200Response2 = campaignsList200Response1;
        OASCampaignsList200Response campaignsList200Response3 = new OASCampaignsList200Response();
        OASCampaignsList200Response campaignsList200Response4 = campaignsList200Response3;

        System.assert(campaignsList200Response1.equals(campaignsList200Response2));
        System.assert(campaignsList200Response2.equals(campaignsList200Response1));
        System.assert(campaignsList200Response1.equals(campaignsList200Response1));
        System.assert(campaignsList200Response3.equals(campaignsList200Response4));
        System.assert(campaignsList200Response4.equals(campaignsList200Response3));
        System.assert(campaignsList200Response3.equals(campaignsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignsList200Response campaignsList200Response1 = OASCampaignsList200Response.getExample();
        OASCampaignsList200Response campaignsList200Response2 = OASCampaignsList200Response.getExample();
        OASCampaignsList200Response campaignsList200Response3 = new OASCampaignsList200Response();
        OASCampaignsList200Response campaignsList200Response4 = new OASCampaignsList200Response();

        System.assert(campaignsList200Response1.equals(campaignsList200Response2));
        System.assert(campaignsList200Response2.equals(campaignsList200Response1));
        System.assert(campaignsList200Response3.equals(campaignsList200Response4));
        System.assert(campaignsList200Response4.equals(campaignsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignsList200Response campaignsList200Response1 = OASCampaignsList200Response.getExample();
        OASCampaignsList200Response campaignsList200Response2 = new OASCampaignsList200Response();

        System.assertEquals(false, campaignsList200Response1.equals('foo'));
        System.assertEquals(false, campaignsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignsList200Response campaignsList200Response1 = OASCampaignsList200Response.getExample();
        OASCampaignsList200Response campaignsList200Response2 = new OASCampaignsList200Response();
        OASCampaignsList200Response campaignsList200Response3;

        System.assertEquals(false, campaignsList200Response1.equals(campaignsList200Response3));
        System.assertEquals(false, campaignsList200Response2.equals(campaignsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignsList200Response campaignsList200Response1 = OASCampaignsList200Response.getExample();
        OASCampaignsList200Response campaignsList200Response2 = new OASCampaignsList200Response();

        System.assertEquals(campaignsList200Response1.hashCode(), campaignsList200Response1.hashCode());
        System.assertEquals(campaignsList200Response2.hashCode(), campaignsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignsList200Response campaignsList200Response1 = OASCampaignsList200Response.getExample();
        OASCampaignsList200Response campaignsList200Response2 = OASCampaignsList200Response.getExample();
        OASCampaignsList200Response campaignsList200Response3 = new OASCampaignsList200Response();
        OASCampaignsList200Response campaignsList200Response4 = new OASCampaignsList200Response();

        System.assert(campaignsList200Response1.equals(campaignsList200Response2));
        System.assert(campaignsList200Response3.equals(campaignsList200Response4));
        System.assertEquals(campaignsList200Response1.hashCode(), campaignsList200Response2.hashCode());
        System.assertEquals(campaignsList200Response3.hashCode(), campaignsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignsList200Response campaignsList200Response = new OASCampaignsList200Response();
        System.assertEquals(new List<OASCampaignResponse>(), campaignsList200Response.items);
        System.assertEquals(null, campaignsList200Response.bookmark);
    }
}
