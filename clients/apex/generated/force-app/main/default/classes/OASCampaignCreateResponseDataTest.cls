@isTest
private class OASCampaignCreateResponseDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignCreateResponseData campaignCreateResponseData1 = OASCampaignCreateResponseData.getExample();
        OASCampaignCreateResponseData campaignCreateResponseData2 = campaignCreateResponseData1;
        OASCampaignCreateResponseData campaignCreateResponseData3 = new OASCampaignCreateResponseData();
        OASCampaignCreateResponseData campaignCreateResponseData4 = campaignCreateResponseData3;

        System.assert(campaignCreateResponseData1.equals(campaignCreateResponseData2));
        System.assert(campaignCreateResponseData2.equals(campaignCreateResponseData1));
        System.assert(campaignCreateResponseData1.equals(campaignCreateResponseData1));
        System.assert(campaignCreateResponseData3.equals(campaignCreateResponseData4));
        System.assert(campaignCreateResponseData4.equals(campaignCreateResponseData3));
        System.assert(campaignCreateResponseData3.equals(campaignCreateResponseData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignCreateResponseData campaignCreateResponseData1 = OASCampaignCreateResponseData.getExample();
        OASCampaignCreateResponseData campaignCreateResponseData2 = OASCampaignCreateResponseData.getExample();
        OASCampaignCreateResponseData campaignCreateResponseData3 = new OASCampaignCreateResponseData();
        OASCampaignCreateResponseData campaignCreateResponseData4 = new OASCampaignCreateResponseData();

        System.assert(campaignCreateResponseData1.equals(campaignCreateResponseData2));
        System.assert(campaignCreateResponseData2.equals(campaignCreateResponseData1));
        System.assert(campaignCreateResponseData3.equals(campaignCreateResponseData4));
        System.assert(campaignCreateResponseData4.equals(campaignCreateResponseData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignCreateResponseData campaignCreateResponseData1 = OASCampaignCreateResponseData.getExample();
        OASCampaignCreateResponseData campaignCreateResponseData2 = new OASCampaignCreateResponseData();

        System.assertEquals(false, campaignCreateResponseData1.equals('foo'));
        System.assertEquals(false, campaignCreateResponseData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignCreateResponseData campaignCreateResponseData1 = OASCampaignCreateResponseData.getExample();
        OASCampaignCreateResponseData campaignCreateResponseData2 = new OASCampaignCreateResponseData();
        OASCampaignCreateResponseData campaignCreateResponseData3;

        System.assertEquals(false, campaignCreateResponseData1.equals(campaignCreateResponseData3));
        System.assertEquals(false, campaignCreateResponseData2.equals(campaignCreateResponseData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignCreateResponseData campaignCreateResponseData1 = OASCampaignCreateResponseData.getExample();
        OASCampaignCreateResponseData campaignCreateResponseData2 = new OASCampaignCreateResponseData();

        System.assertEquals(campaignCreateResponseData1.hashCode(), campaignCreateResponseData1.hashCode());
        System.assertEquals(campaignCreateResponseData2.hashCode(), campaignCreateResponseData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignCreateResponseData campaignCreateResponseData1 = OASCampaignCreateResponseData.getExample();
        OASCampaignCreateResponseData campaignCreateResponseData2 = OASCampaignCreateResponseData.getExample();
        OASCampaignCreateResponseData campaignCreateResponseData3 = new OASCampaignCreateResponseData();
        OASCampaignCreateResponseData campaignCreateResponseData4 = new OASCampaignCreateResponseData();

        System.assert(campaignCreateResponseData1.equals(campaignCreateResponseData2));
        System.assert(campaignCreateResponseData3.equals(campaignCreateResponseData4));
        System.assertEquals(campaignCreateResponseData1.hashCode(), campaignCreateResponseData2.hashCode());
        System.assertEquals(campaignCreateResponseData3.hashCode(), campaignCreateResponseData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignCreateResponseData campaignCreateResponseData = new OASCampaignCreateResponseData();
        Map<String, String> x-property-mappings = campaignCreateResponseData.getx-property-mappings();
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
        System.assertEquals('objectiveType', x-property-mappings.get('objective_type'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
        System.assertEquals('isCampaignBudgetOptimization', x-property-mappings.get('is_campaign_budget_optimization'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignCreateResponseData campaignCreateResponseData = new OASCampaignCreateResponseData();
        System.assertEquals(false, campaignCreateResponseData.isAutomatedCampaign);
        System.assertEquals(null, campaignCreateResponseData.adAccountId);
        System.assertEquals(null, campaignCreateResponseData.name);
        System.assertEquals(null, campaignCreateResponseData.status);
        System.assertEquals(null, campaignCreateResponseData.lifetimeSpendCap);
        System.assertEquals(null, campaignCreateResponseData.dailySpendCap);
        System.assertEquals(null, campaignCreateResponseData.orderLineId);
        System.assertEquals(null, campaignCreateResponseData.trackingUrls);
        System.assertEquals(null, campaignCreateResponseData.startTime);
        System.assertEquals(null, campaignCreateResponseData.endTime);
        System.assertEquals(null, campaignCreateResponseData.summaryStatus);
        System.assertEquals(null, campaignCreateResponseData.isFlexibleDailyBudgets);
        System.assertEquals(null, campaignCreateResponseData.defaultAdGroupBudgetInMicroCurrency);
        System.assertEquals(null, campaignCreateResponseData.id);
        System.assertEquals(null, campaignCreateResponseData.objectiveType);
        System.assertEquals(null, campaignCreateResponseData.createdTime);
        System.assertEquals(null, campaignCreateResponseData.updatedTime);
        System.assertEquals(null, campaignCreateResponseData.type);
        System.assertEquals(null, campaignCreateResponseData.isCampaignBudgetOptimization);
    }
}
