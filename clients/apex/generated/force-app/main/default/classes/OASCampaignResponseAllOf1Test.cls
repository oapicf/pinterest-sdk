@isTest
private class OASCampaignResponseAllOf1Test {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignResponseAllOf1 campaignResponseAllOf11 = OASCampaignResponseAllOf1.getExample();
        OASCampaignResponseAllOf1 campaignResponseAllOf12 = campaignResponseAllOf11;
        OASCampaignResponseAllOf1 campaignResponseAllOf13 = new OASCampaignResponseAllOf1();
        OASCampaignResponseAllOf1 campaignResponseAllOf14 = campaignResponseAllOf13;

        System.assert(campaignResponseAllOf11.equals(campaignResponseAllOf12));
        System.assert(campaignResponseAllOf12.equals(campaignResponseAllOf11));
        System.assert(campaignResponseAllOf11.equals(campaignResponseAllOf11));
        System.assert(campaignResponseAllOf13.equals(campaignResponseAllOf14));
        System.assert(campaignResponseAllOf14.equals(campaignResponseAllOf13));
        System.assert(campaignResponseAllOf13.equals(campaignResponseAllOf13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignResponseAllOf1 campaignResponseAllOf11 = OASCampaignResponseAllOf1.getExample();
        OASCampaignResponseAllOf1 campaignResponseAllOf12 = OASCampaignResponseAllOf1.getExample();
        OASCampaignResponseAllOf1 campaignResponseAllOf13 = new OASCampaignResponseAllOf1();
        OASCampaignResponseAllOf1 campaignResponseAllOf14 = new OASCampaignResponseAllOf1();

        System.assert(campaignResponseAllOf11.equals(campaignResponseAllOf12));
        System.assert(campaignResponseAllOf12.equals(campaignResponseAllOf11));
        System.assert(campaignResponseAllOf13.equals(campaignResponseAllOf14));
        System.assert(campaignResponseAllOf14.equals(campaignResponseAllOf13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignResponseAllOf1 campaignResponseAllOf11 = OASCampaignResponseAllOf1.getExample();
        OASCampaignResponseAllOf1 campaignResponseAllOf12 = new OASCampaignResponseAllOf1();

        System.assertEquals(false, campaignResponseAllOf11.equals('foo'));
        System.assertEquals(false, campaignResponseAllOf12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignResponseAllOf1 campaignResponseAllOf11 = OASCampaignResponseAllOf1.getExample();
        OASCampaignResponseAllOf1 campaignResponseAllOf12 = new OASCampaignResponseAllOf1();
        OASCampaignResponseAllOf1 campaignResponseAllOf13;

        System.assertEquals(false, campaignResponseAllOf11.equals(campaignResponseAllOf13));
        System.assertEquals(false, campaignResponseAllOf12.equals(campaignResponseAllOf13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignResponseAllOf1 campaignResponseAllOf11 = OASCampaignResponseAllOf1.getExample();
        OASCampaignResponseAllOf1 campaignResponseAllOf12 = new OASCampaignResponseAllOf1();

        System.assertEquals(campaignResponseAllOf11.hashCode(), campaignResponseAllOf11.hashCode());
        System.assertEquals(campaignResponseAllOf12.hashCode(), campaignResponseAllOf12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignResponseAllOf1 campaignResponseAllOf11 = OASCampaignResponseAllOf1.getExample();
        OASCampaignResponseAllOf1 campaignResponseAllOf12 = OASCampaignResponseAllOf1.getExample();
        OASCampaignResponseAllOf1 campaignResponseAllOf13 = new OASCampaignResponseAllOf1();
        OASCampaignResponseAllOf1 campaignResponseAllOf14 = new OASCampaignResponseAllOf1();

        System.assert(campaignResponseAllOf11.equals(campaignResponseAllOf12));
        System.assert(campaignResponseAllOf13.equals(campaignResponseAllOf14));
        System.assertEquals(campaignResponseAllOf11.hashCode(), campaignResponseAllOf12.hashCode());
        System.assertEquals(campaignResponseAllOf13.hashCode(), campaignResponseAllOf14.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignResponseAllOf1 campaignResponseAllOf1 = new OASCampaignResponseAllOf1();
        Map<String, String> x-property-mappings = campaignResponseAllOf1.getx-property-mappings();
        System.assertEquals('objectiveType', x-property-mappings.get('objective_type'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
    }
}
