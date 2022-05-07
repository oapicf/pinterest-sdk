@isTest
private class OASAdsAnalyticsCreateAsyncRequestAllTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf11 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf12 = adsAnalyticsCreateAsyncRequestAllOf11;
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf13 = new OASAdsAnalyticsCreateAsyncRequestAll();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf14 = adsAnalyticsCreateAsyncRequestAllOf13;

        System.assert(adsAnalyticsCreateAsyncRequestAllOf11.equals(adsAnalyticsCreateAsyncRequestAllOf12));
        System.assert(adsAnalyticsCreateAsyncRequestAllOf12.equals(adsAnalyticsCreateAsyncRequestAllOf11));
        System.assert(adsAnalyticsCreateAsyncRequestAllOf11.equals(adsAnalyticsCreateAsyncRequestAllOf11));
        System.assert(adsAnalyticsCreateAsyncRequestAllOf13.equals(adsAnalyticsCreateAsyncRequestAllOf14));
        System.assert(adsAnalyticsCreateAsyncRequestAllOf14.equals(adsAnalyticsCreateAsyncRequestAllOf13));
        System.assert(adsAnalyticsCreateAsyncRequestAllOf13.equals(adsAnalyticsCreateAsyncRequestAllOf13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf11 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf12 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf13 = new OASAdsAnalyticsCreateAsyncRequestAll();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf14 = new OASAdsAnalyticsCreateAsyncRequestAll();

        System.assert(adsAnalyticsCreateAsyncRequestAllOf11.equals(adsAnalyticsCreateAsyncRequestAllOf12));
        System.assert(adsAnalyticsCreateAsyncRequestAllOf12.equals(adsAnalyticsCreateAsyncRequestAllOf11));
        System.assert(adsAnalyticsCreateAsyncRequestAllOf13.equals(adsAnalyticsCreateAsyncRequestAllOf14));
        System.assert(adsAnalyticsCreateAsyncRequestAllOf14.equals(adsAnalyticsCreateAsyncRequestAllOf13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf11 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf12 = new OASAdsAnalyticsCreateAsyncRequestAll();

        System.assertEquals(false, adsAnalyticsCreateAsyncRequestAllOf11.equals('foo'));
        System.assertEquals(false, adsAnalyticsCreateAsyncRequestAllOf12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf11 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf12 = new OASAdsAnalyticsCreateAsyncRequestAll();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf13;

        System.assertEquals(false, adsAnalyticsCreateAsyncRequestAllOf11.equals(adsAnalyticsCreateAsyncRequestAllOf13));
        System.assertEquals(false, adsAnalyticsCreateAsyncRequestAllOf12.equals(adsAnalyticsCreateAsyncRequestAllOf13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf11 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf12 = new OASAdsAnalyticsCreateAsyncRequestAll();

        System.assertEquals(adsAnalyticsCreateAsyncRequestAllOf11.hashCode(), adsAnalyticsCreateAsyncRequestAllOf11.hashCode());
        System.assertEquals(adsAnalyticsCreateAsyncRequestAllOf12.hashCode(), adsAnalyticsCreateAsyncRequestAllOf12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf11 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf12 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf13 = new OASAdsAnalyticsCreateAsyncRequestAll();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf14 = new OASAdsAnalyticsCreateAsyncRequestAll();

        System.assert(adsAnalyticsCreateAsyncRequestAllOf11.equals(adsAnalyticsCreateAsyncRequestAllOf12));
        System.assert(adsAnalyticsCreateAsyncRequestAllOf13.equals(adsAnalyticsCreateAsyncRequestAllOf14));
        System.assertEquals(adsAnalyticsCreateAsyncRequestAllOf11.hashCode(), adsAnalyticsCreateAsyncRequestAllOf12.hashCode());
        System.assertEquals(adsAnalyticsCreateAsyncRequestAllOf13.hashCode(), adsAnalyticsCreateAsyncRequestAllOf14.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf1 = new OASAdsAnalyticsCreateAsyncRequestAll();
        Map<String, String> x-property-mappings = adsAnalyticsCreateAsyncRequestAllOf1.getx-property-mappings();
        System.assertEquals('reportFormat', x-property-mappings.get('report_format'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOf1 = new OASAdsAnalyticsCreateAsyncRequestAll();
        System.assertEquals(new List<OASReportingColumnAsync>(), adsAnalyticsCreateAsyncRequestAllOf1.columns);
        System.assertEquals('JSON', adsAnalyticsCreateAsyncRequestAllOf1.reportFormat);
        System.assertEquals(null, adsAnalyticsCreateAsyncRequestAllOf1.level);
    }
}
