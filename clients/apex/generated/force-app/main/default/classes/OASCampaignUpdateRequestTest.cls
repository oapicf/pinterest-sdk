@isTest
private class OASCampaignUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignUpdateRequest campaignUpdateRequest1 = OASCampaignUpdateRequest.getExample();
        OASCampaignUpdateRequest campaignUpdateRequest2 = campaignUpdateRequest1;
        OASCampaignUpdateRequest campaignUpdateRequest3 = new OASCampaignUpdateRequest();
        OASCampaignUpdateRequest campaignUpdateRequest4 = campaignUpdateRequest3;

        System.assert(campaignUpdateRequest1.equals(campaignUpdateRequest2));
        System.assert(campaignUpdateRequest2.equals(campaignUpdateRequest1));
        System.assert(campaignUpdateRequest1.equals(campaignUpdateRequest1));
        System.assert(campaignUpdateRequest3.equals(campaignUpdateRequest4));
        System.assert(campaignUpdateRequest4.equals(campaignUpdateRequest3));
        System.assert(campaignUpdateRequest3.equals(campaignUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignUpdateRequest campaignUpdateRequest1 = OASCampaignUpdateRequest.getExample();
        OASCampaignUpdateRequest campaignUpdateRequest2 = OASCampaignUpdateRequest.getExample();
        OASCampaignUpdateRequest campaignUpdateRequest3 = new OASCampaignUpdateRequest();
        OASCampaignUpdateRequest campaignUpdateRequest4 = new OASCampaignUpdateRequest();

        System.assert(campaignUpdateRequest1.equals(campaignUpdateRequest2));
        System.assert(campaignUpdateRequest2.equals(campaignUpdateRequest1));
        System.assert(campaignUpdateRequest3.equals(campaignUpdateRequest4));
        System.assert(campaignUpdateRequest4.equals(campaignUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignUpdateRequest campaignUpdateRequest1 = OASCampaignUpdateRequest.getExample();
        OASCampaignUpdateRequest campaignUpdateRequest2 = new OASCampaignUpdateRequest();

        System.assertEquals(false, campaignUpdateRequest1.equals('foo'));
        System.assertEquals(false, campaignUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignUpdateRequest campaignUpdateRequest1 = OASCampaignUpdateRequest.getExample();
        OASCampaignUpdateRequest campaignUpdateRequest2 = new OASCampaignUpdateRequest();
        OASCampaignUpdateRequest campaignUpdateRequest3;

        System.assertEquals(false, campaignUpdateRequest1.equals(campaignUpdateRequest3));
        System.assertEquals(false, campaignUpdateRequest2.equals(campaignUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignUpdateRequest campaignUpdateRequest1 = OASCampaignUpdateRequest.getExample();
        OASCampaignUpdateRequest campaignUpdateRequest2 = new OASCampaignUpdateRequest();

        System.assertEquals(campaignUpdateRequest1.hashCode(), campaignUpdateRequest1.hashCode());
        System.assertEquals(campaignUpdateRequest2.hashCode(), campaignUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignUpdateRequest campaignUpdateRequest1 = OASCampaignUpdateRequest.getExample();
        OASCampaignUpdateRequest campaignUpdateRequest2 = OASCampaignUpdateRequest.getExample();
        OASCampaignUpdateRequest campaignUpdateRequest3 = new OASCampaignUpdateRequest();
        OASCampaignUpdateRequest campaignUpdateRequest4 = new OASCampaignUpdateRequest();

        System.assert(campaignUpdateRequest1.equals(campaignUpdateRequest2));
        System.assert(campaignUpdateRequest3.equals(campaignUpdateRequest4));
        System.assertEquals(campaignUpdateRequest1.hashCode(), campaignUpdateRequest2.hashCode());
        System.assertEquals(campaignUpdateRequest3.hashCode(), campaignUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignUpdateRequest campaignUpdateRequest = new OASCampaignUpdateRequest();
        Map<String, String> x-property-mappings = campaignUpdateRequest.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('lifetimeSpendCap', x-property-mappings.get('lifetime_spend_cap'));
        System.assertEquals('dailySpendCap', x-property-mappings.get('daily_spend_cap'));
        System.assertEquals('orderLineId', x-property-mappings.get('order_line_id'));
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
        System.assertEquals('startTime', x-property-mappings.get('start_time'));
        System.assertEquals('endTime', x-property-mappings.get('end_time'));
        System.assertEquals('summaryStatus', x-property-mappings.get('summary_status'));
        System.assertEquals('isFlexibleDailyBudgets', x-property-mappings.get('is_flexible_daily_budgets'));
        System.assertEquals('defaultAdGroupBudgetInMicroCurrency', x-property-mappings.get('default_ad_group_budget_in_micro_currency'));
        System.assertEquals('isAutomatedCampaign', x-property-mappings.get('is_automated_campaign'));
        System.assertEquals('isCampaignBudgetOptimization', x-property-mappings.get('is_campaign_budget_optimization'));
        System.assertEquals('objectiveType', x-property-mappings.get('objective_type'));
    }
}
