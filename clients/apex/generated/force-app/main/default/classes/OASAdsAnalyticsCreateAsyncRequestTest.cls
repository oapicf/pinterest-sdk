@isTest
private class OASAdsAnalyticsCreateAsyncRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest1 = OASAdsAnalyticsCreateAsyncRequest.getExample();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest2 = adsAnalyticsCreateAsyncRequest1;
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest3 = new OASAdsAnalyticsCreateAsyncRequest();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest4 = adsAnalyticsCreateAsyncRequest3;

        System.assert(adsAnalyticsCreateAsyncRequest1.equals(adsAnalyticsCreateAsyncRequest2));
        System.assert(adsAnalyticsCreateAsyncRequest2.equals(adsAnalyticsCreateAsyncRequest1));
        System.assert(adsAnalyticsCreateAsyncRequest1.equals(adsAnalyticsCreateAsyncRequest1));
        System.assert(adsAnalyticsCreateAsyncRequest3.equals(adsAnalyticsCreateAsyncRequest4));
        System.assert(adsAnalyticsCreateAsyncRequest4.equals(adsAnalyticsCreateAsyncRequest3));
        System.assert(adsAnalyticsCreateAsyncRequest3.equals(adsAnalyticsCreateAsyncRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest1 = OASAdsAnalyticsCreateAsyncRequest.getExample();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest2 = OASAdsAnalyticsCreateAsyncRequest.getExample();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest3 = new OASAdsAnalyticsCreateAsyncRequest();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest4 = new OASAdsAnalyticsCreateAsyncRequest();

        System.assert(adsAnalyticsCreateAsyncRequest1.equals(adsAnalyticsCreateAsyncRequest2));
        System.assert(adsAnalyticsCreateAsyncRequest2.equals(adsAnalyticsCreateAsyncRequest1));
        System.assert(adsAnalyticsCreateAsyncRequest3.equals(adsAnalyticsCreateAsyncRequest4));
        System.assert(adsAnalyticsCreateAsyncRequest4.equals(adsAnalyticsCreateAsyncRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest1 = OASAdsAnalyticsCreateAsyncRequest.getExample();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest2 = new OASAdsAnalyticsCreateAsyncRequest();

        System.assertEquals(false, adsAnalyticsCreateAsyncRequest1.equals('foo'));
        System.assertEquals(false, adsAnalyticsCreateAsyncRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest1 = OASAdsAnalyticsCreateAsyncRequest.getExample();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest2 = new OASAdsAnalyticsCreateAsyncRequest();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest3;

        System.assertEquals(false, adsAnalyticsCreateAsyncRequest1.equals(adsAnalyticsCreateAsyncRequest3));
        System.assertEquals(false, adsAnalyticsCreateAsyncRequest2.equals(adsAnalyticsCreateAsyncRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest1 = OASAdsAnalyticsCreateAsyncRequest.getExample();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest2 = new OASAdsAnalyticsCreateAsyncRequest();

        System.assertEquals(adsAnalyticsCreateAsyncRequest1.hashCode(), adsAnalyticsCreateAsyncRequest1.hashCode());
        System.assertEquals(adsAnalyticsCreateAsyncRequest2.hashCode(), adsAnalyticsCreateAsyncRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest1 = OASAdsAnalyticsCreateAsyncRequest.getExample();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest2 = OASAdsAnalyticsCreateAsyncRequest.getExample();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest3 = new OASAdsAnalyticsCreateAsyncRequest();
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest4 = new OASAdsAnalyticsCreateAsyncRequest();

        System.assert(adsAnalyticsCreateAsyncRequest1.equals(adsAnalyticsCreateAsyncRequest2));
        System.assert(adsAnalyticsCreateAsyncRequest3.equals(adsAnalyticsCreateAsyncRequest4));
        System.assertEquals(adsAnalyticsCreateAsyncRequest1.hashCode(), adsAnalyticsCreateAsyncRequest2.hashCode());
        System.assertEquals(adsAnalyticsCreateAsyncRequest3.hashCode(), adsAnalyticsCreateAsyncRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = new OASAdsAnalyticsCreateAsyncRequest();
        Map<String, String> x-property-mappings = adsAnalyticsCreateAsyncRequest.getx-property-mappings();
        System.assertEquals('startDate', x-property-mappings.get('start_date'));
        System.assertEquals('endDate', x-property-mappings.get('end_date'));
        System.assertEquals('clickWindowDays', x-property-mappings.get('click_window_days'));
        System.assertEquals('engagementWindowDays', x-property-mappings.get('engagement_window_days'));
        System.assertEquals('viewWindowDays', x-property-mappings.get('view_window_days'));
        System.assertEquals('conversionReportTime', x-property-mappings.get('conversion_report_time'));
        System.assertEquals('attributionTypes', x-property-mappings.get('attribution_types'));
        System.assertEquals('campaignIds', x-property-mappings.get('campaign_ids'));
        System.assertEquals('campaignStatuses', x-property-mappings.get('campaign_statuses'));
        System.assertEquals('campaignObjectiveTypes', x-property-mappings.get('campaign_objective_types'));
        System.assertEquals('adGroupIds', x-property-mappings.get('ad_group_ids'));
        System.assertEquals('adGroupStatuses', x-property-mappings.get('ad_group_statuses'));
        System.assertEquals('adIds', x-property-mappings.get('ad_ids'));
        System.assertEquals('adStatuses', x-property-mappings.get('ad_statuses'));
        System.assertEquals('productGroupIds', x-property-mappings.get('product_group_ids'));
        System.assertEquals('productGroupStatuses', x-property-mappings.get('product_group_statuses'));
        System.assertEquals('productItemIds', x-property-mappings.get('product_item_ids'));
        System.assertEquals('targetingTypes', x-property-mappings.get('targeting_types'));
        System.assertEquals('metricsFilters', x-property-mappings.get('metrics_filters'));
        System.assertEquals('reportFormat', x-property-mappings.get('report_format'));
        System.assertEquals('primarySort', x-property-mappings.get('primary_sort'));
        System.assertEquals('startHour', x-property-mappings.get('start_hour'));
        System.assertEquals('endHour', x-property-mappings.get('end_hour'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = new OASAdsAnalyticsCreateAsyncRequest();
        System.assertEquals(OASConversionAttributionWindowDays.NUMBER_30, adsAnalyticsCreateAsyncRequest.clickWindowDays);
        System.assertEquals(OASConversionAttributionWindowDays.NUMBER_30, adsAnalyticsCreateAsyncRequest.engagementWindowDays);
        System.assertEquals(OASConversionAttributionWindowDays.NUMBER_1, adsAnalyticsCreateAsyncRequest.viewWindowDays);
        System.assertEquals('TIME_OF_AD_ACTION', adsAnalyticsCreateAsyncRequest.conversionReportTime);
        System.assertEquals(new List<OASConversionReportAttributionType>(), adsAnalyticsCreateAsyncRequest.attributionTypes);
        System.assertEquals(new List<String>(), adsAnalyticsCreateAsyncRequest.campaignIds);
        System.assertEquals(new List<OASCampaignSummaryStatus>(), adsAnalyticsCreateAsyncRequest.campaignStatuses);
        System.assertEquals(new List<OASObjectiveType>(), adsAnalyticsCreateAsyncRequest.campaignObjectiveTypes);
        System.assertEquals(new List<String>(), adsAnalyticsCreateAsyncRequest.adGroupIds);
        System.assertEquals(new List<OASAdGroupSummaryStatus>(), adsAnalyticsCreateAsyncRequest.adGroupStatuses);
        System.assertEquals(new List<String>(), adsAnalyticsCreateAsyncRequest.adIds);
        System.assertEquals(new List<OASPinPromotionSummaryStatus>(), adsAnalyticsCreateAsyncRequest.adStatuses);
        System.assertEquals(new List<String>(), adsAnalyticsCreateAsyncRequest.productGroupIds);
        System.assertEquals(new List<OASProductGroupSummaryStatus>(), adsAnalyticsCreateAsyncRequest.productGroupStatuses);
        System.assertEquals(new List<String>(), adsAnalyticsCreateAsyncRequest.productItemIds);
        System.assertEquals(new List<OASAdsAnalyticsTargetingType>(), adsAnalyticsCreateAsyncRequest.targetingTypes);
        System.assertEquals(new List<OASAdsAnalyticsMetricsFilter>(), adsAnalyticsCreateAsyncRequest.metricsFilters);
        System.assertEquals(new List<OASReportingColumnAsync>(), adsAnalyticsCreateAsyncRequest.columns);
        System.assertEquals('JSON', adsAnalyticsCreateAsyncRequest.reportFormat);
        System.assertEquals(null, adsAnalyticsCreateAsyncRequest.startDate);
        System.assertEquals(null, adsAnalyticsCreateAsyncRequest.endDate);
        System.assertEquals(null, adsAnalyticsCreateAsyncRequest.granularity);
        System.assertEquals(null, adsAnalyticsCreateAsyncRequest.level);
        System.assertEquals(null, adsAnalyticsCreateAsyncRequest.primarySort);
        System.assertEquals(null, adsAnalyticsCreateAsyncRequest.startHour);
        System.assertEquals(null, adsAnalyticsCreateAsyncRequest.endHour);
    }
}
