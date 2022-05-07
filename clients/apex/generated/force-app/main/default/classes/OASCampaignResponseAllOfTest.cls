@isTest
private class OASCampaignResponseAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignResponseAllOf campaignResponseAllOf1 = OASCampaignResponseAllOf.getExample();
        OASCampaignResponseAllOf campaignResponseAllOf2 = campaignResponseAllOf1;
        OASCampaignResponseAllOf campaignResponseAllOf3 = new OASCampaignResponseAllOf();
        OASCampaignResponseAllOf campaignResponseAllOf4 = campaignResponseAllOf3;

        System.assert(campaignResponseAllOf1.equals(campaignResponseAllOf2));
        System.assert(campaignResponseAllOf2.equals(campaignResponseAllOf1));
        System.assert(campaignResponseAllOf1.equals(campaignResponseAllOf1));
        System.assert(campaignResponseAllOf3.equals(campaignResponseAllOf4));
        System.assert(campaignResponseAllOf4.equals(campaignResponseAllOf3));
        System.assert(campaignResponseAllOf3.equals(campaignResponseAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignResponseAllOf campaignResponseAllOf1 = OASCampaignResponseAllOf.getExample();
        OASCampaignResponseAllOf campaignResponseAllOf2 = OASCampaignResponseAllOf.getExample();
        OASCampaignResponseAllOf campaignResponseAllOf3 = new OASCampaignResponseAllOf();
        OASCampaignResponseAllOf campaignResponseAllOf4 = new OASCampaignResponseAllOf();

        System.assert(campaignResponseAllOf1.equals(campaignResponseAllOf2));
        System.assert(campaignResponseAllOf2.equals(campaignResponseAllOf1));
        System.assert(campaignResponseAllOf3.equals(campaignResponseAllOf4));
        System.assert(campaignResponseAllOf4.equals(campaignResponseAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignResponseAllOf campaignResponseAllOf1 = OASCampaignResponseAllOf.getExample();
        OASCampaignResponseAllOf campaignResponseAllOf2 = new OASCampaignResponseAllOf();

        System.assertEquals(false, campaignResponseAllOf1.equals('foo'));
        System.assertEquals(false, campaignResponseAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignResponseAllOf campaignResponseAllOf1 = OASCampaignResponseAllOf.getExample();
        OASCampaignResponseAllOf campaignResponseAllOf2 = new OASCampaignResponseAllOf();
        OASCampaignResponseAllOf campaignResponseAllOf3;

        System.assertEquals(false, campaignResponseAllOf1.equals(campaignResponseAllOf3));
        System.assertEquals(false, campaignResponseAllOf2.equals(campaignResponseAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignResponseAllOf campaignResponseAllOf1 = OASCampaignResponseAllOf.getExample();
        OASCampaignResponseAllOf campaignResponseAllOf2 = new OASCampaignResponseAllOf();

        System.assertEquals(campaignResponseAllOf1.hashCode(), campaignResponseAllOf1.hashCode());
        System.assertEquals(campaignResponseAllOf2.hashCode(), campaignResponseAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignResponseAllOf campaignResponseAllOf1 = OASCampaignResponseAllOf.getExample();
        OASCampaignResponseAllOf campaignResponseAllOf2 = OASCampaignResponseAllOf.getExample();
        OASCampaignResponseAllOf campaignResponseAllOf3 = new OASCampaignResponseAllOf();
        OASCampaignResponseAllOf campaignResponseAllOf4 = new OASCampaignResponseAllOf();

        System.assert(campaignResponseAllOf1.equals(campaignResponseAllOf2));
        System.assert(campaignResponseAllOf3.equals(campaignResponseAllOf4));
        System.assertEquals(campaignResponseAllOf1.hashCode(), campaignResponseAllOf2.hashCode());
        System.assertEquals(campaignResponseAllOf3.hashCode(), campaignResponseAllOf4.hashCode());
    }
}
