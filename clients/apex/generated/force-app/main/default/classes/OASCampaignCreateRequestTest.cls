@isTest
private class OASCampaignCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignCreateRequest campaignCreateRequest1 = OASCampaignCreateRequest.getExample();
        OASCampaignCreateRequest campaignCreateRequest2 = campaignCreateRequest1;
        OASCampaignCreateRequest campaignCreateRequest3 = new OASCampaignCreateRequest();
        OASCampaignCreateRequest campaignCreateRequest4 = campaignCreateRequest3;

        System.assert(campaignCreateRequest1.equals(campaignCreateRequest2));
        System.assert(campaignCreateRequest2.equals(campaignCreateRequest1));
        System.assert(campaignCreateRequest1.equals(campaignCreateRequest1));
        System.assert(campaignCreateRequest3.equals(campaignCreateRequest4));
        System.assert(campaignCreateRequest4.equals(campaignCreateRequest3));
        System.assert(campaignCreateRequest3.equals(campaignCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignCreateRequest campaignCreateRequest1 = OASCampaignCreateRequest.getExample();
        OASCampaignCreateRequest campaignCreateRequest2 = OASCampaignCreateRequest.getExample();
        OASCampaignCreateRequest campaignCreateRequest3 = new OASCampaignCreateRequest();
        OASCampaignCreateRequest campaignCreateRequest4 = new OASCampaignCreateRequest();

        System.assert(campaignCreateRequest1.equals(campaignCreateRequest2));
        System.assert(campaignCreateRequest2.equals(campaignCreateRequest1));
        System.assert(campaignCreateRequest3.equals(campaignCreateRequest4));
        System.assert(campaignCreateRequest4.equals(campaignCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignCreateRequest campaignCreateRequest1 = OASCampaignCreateRequest.getExample();
        OASCampaignCreateRequest campaignCreateRequest2 = new OASCampaignCreateRequest();

        System.assertEquals(false, campaignCreateRequest1.equals('foo'));
        System.assertEquals(false, campaignCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignCreateRequest campaignCreateRequest1 = OASCampaignCreateRequest.getExample();
        OASCampaignCreateRequest campaignCreateRequest2 = new OASCampaignCreateRequest();
        OASCampaignCreateRequest campaignCreateRequest3;

        System.assertEquals(false, campaignCreateRequest1.equals(campaignCreateRequest3));
        System.assertEquals(false, campaignCreateRequest2.equals(campaignCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignCreateRequest campaignCreateRequest1 = OASCampaignCreateRequest.getExample();
        OASCampaignCreateRequest campaignCreateRequest2 = new OASCampaignCreateRequest();

        System.assertEquals(campaignCreateRequest1.hashCode(), campaignCreateRequest1.hashCode());
        System.assertEquals(campaignCreateRequest2.hashCode(), campaignCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignCreateRequest campaignCreateRequest1 = OASCampaignCreateRequest.getExample();
        OASCampaignCreateRequest campaignCreateRequest2 = OASCampaignCreateRequest.getExample();
        OASCampaignCreateRequest campaignCreateRequest3 = new OASCampaignCreateRequest();
        OASCampaignCreateRequest campaignCreateRequest4 = new OASCampaignCreateRequest();

        System.assert(campaignCreateRequest1.equals(campaignCreateRequest2));
        System.assert(campaignCreateRequest3.equals(campaignCreateRequest4));
        System.assertEquals(campaignCreateRequest1.hashCode(), campaignCreateRequest2.hashCode());
        System.assertEquals(campaignCreateRequest3.hashCode(), campaignCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignCreateRequest campaignCreateRequest = new OASCampaignCreateRequest();
        Map<String, String> x-property-mappings = campaignCreateRequest.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('lifetimeSpendCap', x-property-mappings.get('lifetime_spend_cap'));
        System.assertEquals('dailySpendCap', x-property-mappings.get('daily_spend_cap'));
        System.assertEquals('orderLineId', x-property-mappings.get('order_line_id'));
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
        System.assertEquals('startTime', x-property-mappings.get('start_time'));
        System.assertEquals('endTime', x-property-mappings.get('end_time'));
        System.assertEquals('isFlexibleDailyBudgets', x-property-mappings.get('is_flexible_daily_budgets'));
        System.assertEquals('defaultAdGroupBudgetInMicroCurrency', x-property-mappings.get('default_ad_group_budget_in_micro_currency'));
        System.assertEquals('isAutomatedCampaign', x-property-mappings.get('is_automated_campaign'));
        System.assertEquals('objectiveType', x-property-mappings.get('objective_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignCreateRequest campaignCreateRequest = new OASCampaignCreateRequest();
        System.assertEquals('ACTIVE', campaignCreateRequest.status);
        System.assertEquals(false, campaignCreateRequest.isFlexibleDailyBudgets);
        System.assertEquals(false, campaignCreateRequest.isAutomatedCampaign);
        System.assertEquals(null, campaignCreateRequest.adAccountId);
        System.assertEquals(null, campaignCreateRequest.name);
        System.assertEquals(null, campaignCreateRequest.lifetimeSpendCap);
        System.assertEquals(null, campaignCreateRequest.dailySpendCap);
        System.assertEquals(null, campaignCreateRequest.orderLineId);
        System.assertEquals(null, campaignCreateRequest.trackingUrls);
        System.assertEquals(null, campaignCreateRequest.startTime);
        System.assertEquals(null, campaignCreateRequest.endTime);
        System.assertEquals(null, campaignCreateRequest.defaultAdGroupBudgetInMicroCurrency);
        System.assertEquals(null, campaignCreateRequest.objectiveType);
    }
}
