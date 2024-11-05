@isTest
private class OASCampaignCreateCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignCreateCommon campaignCreateCommon1 = OASCampaignCreateCommon.getExample();
        OASCampaignCreateCommon campaignCreateCommon2 = campaignCreateCommon1;
        OASCampaignCreateCommon campaignCreateCommon3 = new OASCampaignCreateCommon();
        OASCampaignCreateCommon campaignCreateCommon4 = campaignCreateCommon3;

        System.assert(campaignCreateCommon1.equals(campaignCreateCommon2));
        System.assert(campaignCreateCommon2.equals(campaignCreateCommon1));
        System.assert(campaignCreateCommon1.equals(campaignCreateCommon1));
        System.assert(campaignCreateCommon3.equals(campaignCreateCommon4));
        System.assert(campaignCreateCommon4.equals(campaignCreateCommon3));
        System.assert(campaignCreateCommon3.equals(campaignCreateCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignCreateCommon campaignCreateCommon1 = OASCampaignCreateCommon.getExample();
        OASCampaignCreateCommon campaignCreateCommon2 = OASCampaignCreateCommon.getExample();
        OASCampaignCreateCommon campaignCreateCommon3 = new OASCampaignCreateCommon();
        OASCampaignCreateCommon campaignCreateCommon4 = new OASCampaignCreateCommon();

        System.assert(campaignCreateCommon1.equals(campaignCreateCommon2));
        System.assert(campaignCreateCommon2.equals(campaignCreateCommon1));
        System.assert(campaignCreateCommon3.equals(campaignCreateCommon4));
        System.assert(campaignCreateCommon4.equals(campaignCreateCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignCreateCommon campaignCreateCommon1 = OASCampaignCreateCommon.getExample();
        OASCampaignCreateCommon campaignCreateCommon2 = new OASCampaignCreateCommon();

        System.assertEquals(false, campaignCreateCommon1.equals('foo'));
        System.assertEquals(false, campaignCreateCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignCreateCommon campaignCreateCommon1 = OASCampaignCreateCommon.getExample();
        OASCampaignCreateCommon campaignCreateCommon2 = new OASCampaignCreateCommon();
        OASCampaignCreateCommon campaignCreateCommon3;

        System.assertEquals(false, campaignCreateCommon1.equals(campaignCreateCommon3));
        System.assertEquals(false, campaignCreateCommon2.equals(campaignCreateCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignCreateCommon campaignCreateCommon1 = OASCampaignCreateCommon.getExample();
        OASCampaignCreateCommon campaignCreateCommon2 = new OASCampaignCreateCommon();

        System.assertEquals(campaignCreateCommon1.hashCode(), campaignCreateCommon1.hashCode());
        System.assertEquals(campaignCreateCommon2.hashCode(), campaignCreateCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignCreateCommon campaignCreateCommon1 = OASCampaignCreateCommon.getExample();
        OASCampaignCreateCommon campaignCreateCommon2 = OASCampaignCreateCommon.getExample();
        OASCampaignCreateCommon campaignCreateCommon3 = new OASCampaignCreateCommon();
        OASCampaignCreateCommon campaignCreateCommon4 = new OASCampaignCreateCommon();

        System.assert(campaignCreateCommon1.equals(campaignCreateCommon2));
        System.assert(campaignCreateCommon3.equals(campaignCreateCommon4));
        System.assertEquals(campaignCreateCommon1.hashCode(), campaignCreateCommon2.hashCode());
        System.assertEquals(campaignCreateCommon3.hashCode(), campaignCreateCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignCreateCommon campaignCreateCommon = new OASCampaignCreateCommon();
        Map<String, String> x-property-mappings = campaignCreateCommon.getx-property-mappings();
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
    }
}
