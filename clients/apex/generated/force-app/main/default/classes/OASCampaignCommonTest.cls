@isTest
private class OASCampaignCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignCommon campaignCommon1 = OASCampaignCommon.getExample();
        OASCampaignCommon campaignCommon2 = campaignCommon1;
        OASCampaignCommon campaignCommon3 = new OASCampaignCommon();
        OASCampaignCommon campaignCommon4 = campaignCommon3;

        System.assert(campaignCommon1.equals(campaignCommon2));
        System.assert(campaignCommon2.equals(campaignCommon1));
        System.assert(campaignCommon1.equals(campaignCommon1));
        System.assert(campaignCommon3.equals(campaignCommon4));
        System.assert(campaignCommon4.equals(campaignCommon3));
        System.assert(campaignCommon3.equals(campaignCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignCommon campaignCommon1 = OASCampaignCommon.getExample();
        OASCampaignCommon campaignCommon2 = OASCampaignCommon.getExample();
        OASCampaignCommon campaignCommon3 = new OASCampaignCommon();
        OASCampaignCommon campaignCommon4 = new OASCampaignCommon();

        System.assert(campaignCommon1.equals(campaignCommon2));
        System.assert(campaignCommon2.equals(campaignCommon1));
        System.assert(campaignCommon3.equals(campaignCommon4));
        System.assert(campaignCommon4.equals(campaignCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignCommon campaignCommon1 = OASCampaignCommon.getExample();
        OASCampaignCommon campaignCommon2 = new OASCampaignCommon();

        System.assertEquals(false, campaignCommon1.equals('foo'));
        System.assertEquals(false, campaignCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignCommon campaignCommon1 = OASCampaignCommon.getExample();
        OASCampaignCommon campaignCommon2 = new OASCampaignCommon();
        OASCampaignCommon campaignCommon3;

        System.assertEquals(false, campaignCommon1.equals(campaignCommon3));
        System.assertEquals(false, campaignCommon2.equals(campaignCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignCommon campaignCommon1 = OASCampaignCommon.getExample();
        OASCampaignCommon campaignCommon2 = new OASCampaignCommon();

        System.assertEquals(campaignCommon1.hashCode(), campaignCommon1.hashCode());
        System.assertEquals(campaignCommon2.hashCode(), campaignCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignCommon campaignCommon1 = OASCampaignCommon.getExample();
        OASCampaignCommon campaignCommon2 = OASCampaignCommon.getExample();
        OASCampaignCommon campaignCommon3 = new OASCampaignCommon();
        OASCampaignCommon campaignCommon4 = new OASCampaignCommon();

        System.assert(campaignCommon1.equals(campaignCommon2));
        System.assert(campaignCommon3.equals(campaignCommon4));
        System.assertEquals(campaignCommon1.hashCode(), campaignCommon2.hashCode());
        System.assertEquals(campaignCommon3.hashCode(), campaignCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCampaignCommon campaignCommon = new OASCampaignCommon();
        Map<String, String> x-property-mappings = campaignCommon.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('lifetimeSpendCap', x-property-mappings.get('lifetime_spend_cap'));
        System.assertEquals('dailySpendCap', x-property-mappings.get('daily_spend_cap'));
        System.assertEquals('orderLineId', x-property-mappings.get('order_line_id'));
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
        System.assertEquals('startTime', x-property-mappings.get('start_time'));
        System.assertEquals('endTime', x-property-mappings.get('end_time'));
        System.assertEquals('isFlexibleDailyBudgets', x-property-mappings.get('is_flexible_daily_budgets'));
    }
}
