@isTest
private class OASAdsAnalyticsCreateAsyncResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse1 = OASAdsAnalyticsCreateAsyncResponse.getExample();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse2 = adsAnalyticsCreateAsyncResponse1;
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse3 = new OASAdsAnalyticsCreateAsyncResponse();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse4 = adsAnalyticsCreateAsyncResponse3;

        System.assert(adsAnalyticsCreateAsyncResponse1.equals(adsAnalyticsCreateAsyncResponse2));
        System.assert(adsAnalyticsCreateAsyncResponse2.equals(adsAnalyticsCreateAsyncResponse1));
        System.assert(adsAnalyticsCreateAsyncResponse1.equals(adsAnalyticsCreateAsyncResponse1));
        System.assert(adsAnalyticsCreateAsyncResponse3.equals(adsAnalyticsCreateAsyncResponse4));
        System.assert(adsAnalyticsCreateAsyncResponse4.equals(adsAnalyticsCreateAsyncResponse3));
        System.assert(adsAnalyticsCreateAsyncResponse3.equals(adsAnalyticsCreateAsyncResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse1 = OASAdsAnalyticsCreateAsyncResponse.getExample();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse2 = OASAdsAnalyticsCreateAsyncResponse.getExample();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse3 = new OASAdsAnalyticsCreateAsyncResponse();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse4 = new OASAdsAnalyticsCreateAsyncResponse();

        System.assert(adsAnalyticsCreateAsyncResponse1.equals(adsAnalyticsCreateAsyncResponse2));
        System.assert(adsAnalyticsCreateAsyncResponse2.equals(adsAnalyticsCreateAsyncResponse1));
        System.assert(adsAnalyticsCreateAsyncResponse3.equals(adsAnalyticsCreateAsyncResponse4));
        System.assert(adsAnalyticsCreateAsyncResponse4.equals(adsAnalyticsCreateAsyncResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse1 = OASAdsAnalyticsCreateAsyncResponse.getExample();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse2 = new OASAdsAnalyticsCreateAsyncResponse();

        System.assertEquals(false, adsAnalyticsCreateAsyncResponse1.equals('foo'));
        System.assertEquals(false, adsAnalyticsCreateAsyncResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse1 = OASAdsAnalyticsCreateAsyncResponse.getExample();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse2 = new OASAdsAnalyticsCreateAsyncResponse();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse3;

        System.assertEquals(false, adsAnalyticsCreateAsyncResponse1.equals(adsAnalyticsCreateAsyncResponse3));
        System.assertEquals(false, adsAnalyticsCreateAsyncResponse2.equals(adsAnalyticsCreateAsyncResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse1 = OASAdsAnalyticsCreateAsyncResponse.getExample();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse2 = new OASAdsAnalyticsCreateAsyncResponse();

        System.assertEquals(adsAnalyticsCreateAsyncResponse1.hashCode(), adsAnalyticsCreateAsyncResponse1.hashCode());
        System.assertEquals(adsAnalyticsCreateAsyncResponse2.hashCode(), adsAnalyticsCreateAsyncResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse1 = OASAdsAnalyticsCreateAsyncResponse.getExample();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse2 = OASAdsAnalyticsCreateAsyncResponse.getExample();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse3 = new OASAdsAnalyticsCreateAsyncResponse();
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse4 = new OASAdsAnalyticsCreateAsyncResponse();

        System.assert(adsAnalyticsCreateAsyncResponse1.equals(adsAnalyticsCreateAsyncResponse2));
        System.assert(adsAnalyticsCreateAsyncResponse3.equals(adsAnalyticsCreateAsyncResponse4));
        System.assertEquals(adsAnalyticsCreateAsyncResponse1.hashCode(), adsAnalyticsCreateAsyncResponse2.hashCode());
        System.assertEquals(adsAnalyticsCreateAsyncResponse3.hashCode(), adsAnalyticsCreateAsyncResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse = new OASAdsAnalyticsCreateAsyncResponse();
        Map<String, String> x-property-mappings = adsAnalyticsCreateAsyncResponse.getx-property-mappings();
        System.assertEquals('reportStatus', x-property-mappings.get('report_status'));
    }
}
