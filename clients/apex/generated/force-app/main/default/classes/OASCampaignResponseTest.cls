@isTest
private class OASCampaignResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignResponse campaignResponse1 = OASCampaignResponse.getExample();
        OASCampaignResponse campaignResponse2 = campaignResponse1;
        OASCampaignResponse campaignResponse3 = new OASCampaignResponse();
        OASCampaignResponse campaignResponse4 = campaignResponse3;

        System.assert(campaignResponse1.equals(campaignResponse2));
        System.assert(campaignResponse2.equals(campaignResponse1));
        System.assert(campaignResponse1.equals(campaignResponse1));
        System.assert(campaignResponse3.equals(campaignResponse4));
        System.assert(campaignResponse4.equals(campaignResponse3));
        System.assert(campaignResponse3.equals(campaignResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignResponse campaignResponse1 = OASCampaignResponse.getExample();
        OASCampaignResponse campaignResponse2 = OASCampaignResponse.getExample();
        OASCampaignResponse campaignResponse3 = new OASCampaignResponse();
        OASCampaignResponse campaignResponse4 = new OASCampaignResponse();

        System.assert(campaignResponse1.equals(campaignResponse2));
        System.assert(campaignResponse2.equals(campaignResponse1));
        System.assert(campaignResponse3.equals(campaignResponse4));
        System.assert(campaignResponse4.equals(campaignResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignResponse campaignResponse1 = OASCampaignResponse.getExample();
        OASCampaignResponse campaignResponse2 = new OASCampaignResponse();

        System.assertEquals(false, campaignResponse1.equals('foo'));
        System.assertEquals(false, campaignResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignResponse campaignResponse1 = OASCampaignResponse.getExample();
        OASCampaignResponse campaignResponse2 = new OASCampaignResponse();
        OASCampaignResponse campaignResponse3;

        System.assertEquals(false, campaignResponse1.equals(campaignResponse3));
        System.assertEquals(false, campaignResponse2.equals(campaignResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignResponse campaignResponse1 = OASCampaignResponse.getExample();
        OASCampaignResponse campaignResponse2 = new OASCampaignResponse();

        System.assertEquals(campaignResponse1.hashCode(), campaignResponse1.hashCode());
        System.assertEquals(campaignResponse2.hashCode(), campaignResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignResponse campaignResponse1 = OASCampaignResponse.getExample();
        OASCampaignResponse campaignResponse2 = OASCampaignResponse.getExample();
        OASCampaignResponse campaignResponse3 = new OASCampaignResponse();
        OASCampaignResponse campaignResponse4 = new OASCampaignResponse();

        System.assert(campaignResponse1.equals(campaignResponse2));
        System.assert(campaignResponse3.equals(campaignResponse4));
        System.assertEquals(campaignResponse1.hashCode(), campaignResponse2.hashCode());
        System.assertEquals(campaignResponse3.hashCode(), campaignResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignResponse campaignResponse = new OASCampaignResponse();
        Map<String, String> x-property-mappings = campaignResponse.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('lifetimeSpendCap', x-property-mappings.get('lifetime_spend_cap'));
        System.assertEquals('dailySpendCap', x-property-mappings.get('daily_spend_cap'));
        System.assertEquals('orderLineId', x-property-mappings.get('order_line_id'));
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
        System.assertEquals('startTime', x-property-mappings.get('start_time'));
        System.assertEquals('endTime', x-property-mappings.get('end_time'));
        System.assertEquals('objectiveType', x-property-mappings.get('objective_type'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignResponse campaignResponse = new OASCampaignResponse();
        System.assertEquals('ACTIVE', campaignResponse.status);
        System.assertEquals(null, campaignResponse.id);
        System.assertEquals(null, campaignResponse.adAccountId);
        System.assertEquals(null, campaignResponse.name);
        System.assertEquals(null, campaignResponse.lifetimeSpendCap);
        System.assertEquals(null, campaignResponse.dailySpendCap);
        System.assertEquals(null, campaignResponse.orderLineId);
        System.assertEquals(null, campaignResponse.trackingUrls);
        System.assertEquals(null, campaignResponse.startTime);
        System.assertEquals(null, campaignResponse.endTime);
        System.assertEquals(null, campaignResponse.objectiveType);
        System.assertEquals(null, campaignResponse.createdTime);
        System.assertEquals(null, campaignResponse.updatedTime);
        System.assertEquals(null, campaignResponse.type);
    }
}
