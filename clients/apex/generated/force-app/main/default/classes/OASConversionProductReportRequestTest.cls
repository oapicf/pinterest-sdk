@isTest
private class OASConversionProductReportRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionProductReportRequest conversionProductReportRequest1 = OASConversionProductReportRequest.getExample();
        OASConversionProductReportRequest conversionProductReportRequest2 = conversionProductReportRequest1;
        OASConversionProductReportRequest conversionProductReportRequest3 = new OASConversionProductReportRequest();
        OASConversionProductReportRequest conversionProductReportRequest4 = conversionProductReportRequest3;

        System.assert(conversionProductReportRequest1.equals(conversionProductReportRequest2));
        System.assert(conversionProductReportRequest2.equals(conversionProductReportRequest1));
        System.assert(conversionProductReportRequest1.equals(conversionProductReportRequest1));
        System.assert(conversionProductReportRequest3.equals(conversionProductReportRequest4));
        System.assert(conversionProductReportRequest4.equals(conversionProductReportRequest3));
        System.assert(conversionProductReportRequest3.equals(conversionProductReportRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionProductReportRequest conversionProductReportRequest1 = OASConversionProductReportRequest.getExample();
        OASConversionProductReportRequest conversionProductReportRequest2 = OASConversionProductReportRequest.getExample();
        OASConversionProductReportRequest conversionProductReportRequest3 = new OASConversionProductReportRequest();
        OASConversionProductReportRequest conversionProductReportRequest4 = new OASConversionProductReportRequest();

        System.assert(conversionProductReportRequest1.equals(conversionProductReportRequest2));
        System.assert(conversionProductReportRequest2.equals(conversionProductReportRequest1));
        System.assert(conversionProductReportRequest3.equals(conversionProductReportRequest4));
        System.assert(conversionProductReportRequest4.equals(conversionProductReportRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionProductReportRequest conversionProductReportRequest1 = OASConversionProductReportRequest.getExample();
        OASConversionProductReportRequest conversionProductReportRequest2 = new OASConversionProductReportRequest();

        System.assertEquals(false, conversionProductReportRequest1.equals('foo'));
        System.assertEquals(false, conversionProductReportRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionProductReportRequest conversionProductReportRequest1 = OASConversionProductReportRequest.getExample();
        OASConversionProductReportRequest conversionProductReportRequest2 = new OASConversionProductReportRequest();
        OASConversionProductReportRequest conversionProductReportRequest3;

        System.assertEquals(false, conversionProductReportRequest1.equals(conversionProductReportRequest3));
        System.assertEquals(false, conversionProductReportRequest2.equals(conversionProductReportRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionProductReportRequest conversionProductReportRequest1 = OASConversionProductReportRequest.getExample();
        OASConversionProductReportRequest conversionProductReportRequest2 = new OASConversionProductReportRequest();

        System.assertEquals(conversionProductReportRequest1.hashCode(), conversionProductReportRequest1.hashCode());
        System.assertEquals(conversionProductReportRequest2.hashCode(), conversionProductReportRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionProductReportRequest conversionProductReportRequest1 = OASConversionProductReportRequest.getExample();
        OASConversionProductReportRequest conversionProductReportRequest2 = OASConversionProductReportRequest.getExample();
        OASConversionProductReportRequest conversionProductReportRequest3 = new OASConversionProductReportRequest();
        OASConversionProductReportRequest conversionProductReportRequest4 = new OASConversionProductReportRequest();

        System.assert(conversionProductReportRequest1.equals(conversionProductReportRequest2));
        System.assert(conversionProductReportRequest3.equals(conversionProductReportRequest4));
        System.assertEquals(conversionProductReportRequest1.hashCode(), conversionProductReportRequest2.hashCode());
        System.assertEquals(conversionProductReportRequest3.hashCode(), conversionProductReportRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionProductReportRequest conversionProductReportRequest = new OASConversionProductReportRequest();
        Map<String, String> x-property-mappings = conversionProductReportRequest.getx-property-mappings();
        System.assertEquals('adGroupIds', x-property-mappings.get('ad_group_ids'));
        System.assertEquals('campaignIds', x-property-mappings.get('campaign_ids'));
        System.assertEquals('campaignObjectiveTypes', x-property-mappings.get('campaign_objective_types'));
        System.assertEquals('clickWindowDays', x-property-mappings.get('click_window_days'));
        System.assertEquals('conversionProductAttributionType', x-property-mappings.get('conversion_product_attribution_type'));
        System.assertEquals('conversionProductBreakdown', x-property-mappings.get('conversion_product_breakdown'));
        System.assertEquals('conversionReportTime', x-property-mappings.get('conversion_report_time'));
        System.assertEquals('endDate', x-property-mappings.get('end_date'));
        System.assertEquals('productSkuIds', x-property-mappings.get('product_sku_ids'));
        System.assertEquals('reportName', x-property-mappings.get('report_name'));
        System.assertEquals('startDate', x-property-mappings.get('start_date'));
        System.assertEquals('viewWindowDays', x-property-mappings.get('view_window_days'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionProductReportRequest conversionProductReportRequest = new OASConversionProductReportRequest();
        System.assertEquals(new List<String>(), conversionProductReportRequest.adGroupIds);
        System.assertEquals(new List<String>(), conversionProductReportRequest.campaignIds);
        System.assertEquals(new List<OASObjectiveType>(), conversionProductReportRequest.campaignObjectiveTypes);
        System.assertEquals(OASConversionAttributionWindowDays.NUMBER_30, conversionProductReportRequest.clickWindowDays);
        System.assertEquals(new List<OASConversionProductReportingColumn>(), conversionProductReportRequest.columns);
        System.assertEquals('TIME_OF_AD_ACTION', conversionProductReportRequest.conversionReportTime);
        System.assertEquals(new List<String>(), conversionProductReportRequest.productSkuIds);
        System.assertEquals(OASConversionAttributionWindowDays.NUMBER_30, conversionProductReportRequest.viewWindowDays);
        System.assertEquals(null, conversionProductReportRequest.conversionProductAttributionType);
        System.assertEquals(null, conversionProductReportRequest.conversionProductBreakdown);
        System.assertEquals(null, conversionProductReportRequest.endDate);
        System.assertEquals(null, conversionProductReportRequest.granularity);
        System.assertEquals(null, conversionProductReportRequest.level);
        System.assertEquals(null, conversionProductReportRequest.reportName);
        System.assertEquals(null, conversionProductReportRequest.startDate);
    }
}
