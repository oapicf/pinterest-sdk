@isTest
private class OASCampaignIdFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignIdFilter campaignIdFilter1 = OASCampaignIdFilter.getExample();
        OASCampaignIdFilter campaignIdFilter2 = campaignIdFilter1;
        OASCampaignIdFilter campaignIdFilter3 = new OASCampaignIdFilter();
        OASCampaignIdFilter campaignIdFilter4 = campaignIdFilter3;

        System.assert(campaignIdFilter1.equals(campaignIdFilter2));
        System.assert(campaignIdFilter2.equals(campaignIdFilter1));
        System.assert(campaignIdFilter1.equals(campaignIdFilter1));
        System.assert(campaignIdFilter3.equals(campaignIdFilter4));
        System.assert(campaignIdFilter4.equals(campaignIdFilter3));
        System.assert(campaignIdFilter3.equals(campaignIdFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignIdFilter campaignIdFilter1 = OASCampaignIdFilter.getExample();
        OASCampaignIdFilter campaignIdFilter2 = OASCampaignIdFilter.getExample();
        OASCampaignIdFilter campaignIdFilter3 = new OASCampaignIdFilter();
        OASCampaignIdFilter campaignIdFilter4 = new OASCampaignIdFilter();

        System.assert(campaignIdFilter1.equals(campaignIdFilter2));
        System.assert(campaignIdFilter2.equals(campaignIdFilter1));
        System.assert(campaignIdFilter3.equals(campaignIdFilter4));
        System.assert(campaignIdFilter4.equals(campaignIdFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignIdFilter campaignIdFilter1 = OASCampaignIdFilter.getExample();
        OASCampaignIdFilter campaignIdFilter2 = new OASCampaignIdFilter();

        System.assertEquals(false, campaignIdFilter1.equals('foo'));
        System.assertEquals(false, campaignIdFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignIdFilter campaignIdFilter1 = OASCampaignIdFilter.getExample();
        OASCampaignIdFilter campaignIdFilter2 = new OASCampaignIdFilter();
        OASCampaignIdFilter campaignIdFilter3;

        System.assertEquals(false, campaignIdFilter1.equals(campaignIdFilter3));
        System.assertEquals(false, campaignIdFilter2.equals(campaignIdFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignIdFilter campaignIdFilter1 = OASCampaignIdFilter.getExample();
        OASCampaignIdFilter campaignIdFilter2 = new OASCampaignIdFilter();

        System.assertEquals(campaignIdFilter1.hashCode(), campaignIdFilter1.hashCode());
        System.assertEquals(campaignIdFilter2.hashCode(), campaignIdFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignIdFilter campaignIdFilter1 = OASCampaignIdFilter.getExample();
        OASCampaignIdFilter campaignIdFilter2 = OASCampaignIdFilter.getExample();
        OASCampaignIdFilter campaignIdFilter3 = new OASCampaignIdFilter();
        OASCampaignIdFilter campaignIdFilter4 = new OASCampaignIdFilter();

        System.assert(campaignIdFilter1.equals(campaignIdFilter2));
        System.assert(campaignIdFilter3.equals(campaignIdFilter4));
        System.assertEquals(campaignIdFilter1.hashCode(), campaignIdFilter2.hashCode());
        System.assertEquals(campaignIdFilter3.hashCode(), campaignIdFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignIdFilter campaignIdFilter = new OASCampaignIdFilter();
        Map<String, String> x-property-mappings = campaignIdFilter.getx-property-mappings();
        System.assertEquals('campaignIds', x-property-mappings.get('campaign_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignIdFilter campaignIdFilter = new OASCampaignIdFilter();
        System.assertEquals(new List<String>(), campaignIdFilter.campaignIds);
    }
}
