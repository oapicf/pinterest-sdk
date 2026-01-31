@isTest
private class OASCampaignObjectivesFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignObjectivesFilter campaignObjectivesFilter1 = OASCampaignObjectivesFilter.getExample();
        OASCampaignObjectivesFilter campaignObjectivesFilter2 = campaignObjectivesFilter1;
        OASCampaignObjectivesFilter campaignObjectivesFilter3 = new OASCampaignObjectivesFilter();
        OASCampaignObjectivesFilter campaignObjectivesFilter4 = campaignObjectivesFilter3;

        System.assert(campaignObjectivesFilter1.equals(campaignObjectivesFilter2));
        System.assert(campaignObjectivesFilter2.equals(campaignObjectivesFilter1));
        System.assert(campaignObjectivesFilter1.equals(campaignObjectivesFilter1));
        System.assert(campaignObjectivesFilter3.equals(campaignObjectivesFilter4));
        System.assert(campaignObjectivesFilter4.equals(campaignObjectivesFilter3));
        System.assert(campaignObjectivesFilter3.equals(campaignObjectivesFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignObjectivesFilter campaignObjectivesFilter1 = OASCampaignObjectivesFilter.getExample();
        OASCampaignObjectivesFilter campaignObjectivesFilter2 = OASCampaignObjectivesFilter.getExample();
        OASCampaignObjectivesFilter campaignObjectivesFilter3 = new OASCampaignObjectivesFilter();
        OASCampaignObjectivesFilter campaignObjectivesFilter4 = new OASCampaignObjectivesFilter();

        System.assert(campaignObjectivesFilter1.equals(campaignObjectivesFilter2));
        System.assert(campaignObjectivesFilter2.equals(campaignObjectivesFilter1));
        System.assert(campaignObjectivesFilter3.equals(campaignObjectivesFilter4));
        System.assert(campaignObjectivesFilter4.equals(campaignObjectivesFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignObjectivesFilter campaignObjectivesFilter1 = OASCampaignObjectivesFilter.getExample();
        OASCampaignObjectivesFilter campaignObjectivesFilter2 = new OASCampaignObjectivesFilter();

        System.assertEquals(false, campaignObjectivesFilter1.equals('foo'));
        System.assertEquals(false, campaignObjectivesFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignObjectivesFilter campaignObjectivesFilter1 = OASCampaignObjectivesFilter.getExample();
        OASCampaignObjectivesFilter campaignObjectivesFilter2 = new OASCampaignObjectivesFilter();
        OASCampaignObjectivesFilter campaignObjectivesFilter3;

        System.assertEquals(false, campaignObjectivesFilter1.equals(campaignObjectivesFilter3));
        System.assertEquals(false, campaignObjectivesFilter2.equals(campaignObjectivesFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignObjectivesFilter campaignObjectivesFilter1 = OASCampaignObjectivesFilter.getExample();
        OASCampaignObjectivesFilter campaignObjectivesFilter2 = new OASCampaignObjectivesFilter();

        System.assertEquals(campaignObjectivesFilter1.hashCode(), campaignObjectivesFilter1.hashCode());
        System.assertEquals(campaignObjectivesFilter2.hashCode(), campaignObjectivesFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignObjectivesFilter campaignObjectivesFilter1 = OASCampaignObjectivesFilter.getExample();
        OASCampaignObjectivesFilter campaignObjectivesFilter2 = OASCampaignObjectivesFilter.getExample();
        OASCampaignObjectivesFilter campaignObjectivesFilter3 = new OASCampaignObjectivesFilter();
        OASCampaignObjectivesFilter campaignObjectivesFilter4 = new OASCampaignObjectivesFilter();

        System.assert(campaignObjectivesFilter1.equals(campaignObjectivesFilter2));
        System.assert(campaignObjectivesFilter3.equals(campaignObjectivesFilter4));
        System.assertEquals(campaignObjectivesFilter1.hashCode(), campaignObjectivesFilter2.hashCode());
        System.assertEquals(campaignObjectivesFilter3.hashCode(), campaignObjectivesFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignObjectivesFilter campaignObjectivesFilter = new OASCampaignObjectivesFilter();
        Map<String, String> x-property-mappings = campaignObjectivesFilter.getx-property-mappings();
        System.assertEquals('campaignObjectiveTypes', x-property-mappings.get('campaign_objective_types'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignObjectivesFilter campaignObjectivesFilter = new OASCampaignObjectivesFilter();
        System.assertEquals(new List<OASObjectiveType>(), campaignObjectivesFilter.campaignObjectiveTypes);
    }
}
