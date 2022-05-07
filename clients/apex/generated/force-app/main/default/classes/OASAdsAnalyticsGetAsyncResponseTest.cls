@isTest
private class OASAdsAnalyticsGetAsyncResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse1 = OASAdsAnalyticsGetAsyncResponse.getExample();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse2 = adsAnalyticsGetAsyncResponse1;
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse3 = new OASAdsAnalyticsGetAsyncResponse();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse4 = adsAnalyticsGetAsyncResponse3;

        System.assert(adsAnalyticsGetAsyncResponse1.equals(adsAnalyticsGetAsyncResponse2));
        System.assert(adsAnalyticsGetAsyncResponse2.equals(adsAnalyticsGetAsyncResponse1));
        System.assert(adsAnalyticsGetAsyncResponse1.equals(adsAnalyticsGetAsyncResponse1));
        System.assert(adsAnalyticsGetAsyncResponse3.equals(adsAnalyticsGetAsyncResponse4));
        System.assert(adsAnalyticsGetAsyncResponse4.equals(adsAnalyticsGetAsyncResponse3));
        System.assert(adsAnalyticsGetAsyncResponse3.equals(adsAnalyticsGetAsyncResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse1 = OASAdsAnalyticsGetAsyncResponse.getExample();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse2 = OASAdsAnalyticsGetAsyncResponse.getExample();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse3 = new OASAdsAnalyticsGetAsyncResponse();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse4 = new OASAdsAnalyticsGetAsyncResponse();

        System.assert(adsAnalyticsGetAsyncResponse1.equals(adsAnalyticsGetAsyncResponse2));
        System.assert(adsAnalyticsGetAsyncResponse2.equals(adsAnalyticsGetAsyncResponse1));
        System.assert(adsAnalyticsGetAsyncResponse3.equals(adsAnalyticsGetAsyncResponse4));
        System.assert(adsAnalyticsGetAsyncResponse4.equals(adsAnalyticsGetAsyncResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse1 = OASAdsAnalyticsGetAsyncResponse.getExample();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse2 = new OASAdsAnalyticsGetAsyncResponse();

        System.assertEquals(false, adsAnalyticsGetAsyncResponse1.equals('foo'));
        System.assertEquals(false, adsAnalyticsGetAsyncResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse1 = OASAdsAnalyticsGetAsyncResponse.getExample();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse2 = new OASAdsAnalyticsGetAsyncResponse();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse3;

        System.assertEquals(false, adsAnalyticsGetAsyncResponse1.equals(adsAnalyticsGetAsyncResponse3));
        System.assertEquals(false, adsAnalyticsGetAsyncResponse2.equals(adsAnalyticsGetAsyncResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse1 = OASAdsAnalyticsGetAsyncResponse.getExample();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse2 = new OASAdsAnalyticsGetAsyncResponse();

        System.assertEquals(adsAnalyticsGetAsyncResponse1.hashCode(), adsAnalyticsGetAsyncResponse1.hashCode());
        System.assertEquals(adsAnalyticsGetAsyncResponse2.hashCode(), adsAnalyticsGetAsyncResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse1 = OASAdsAnalyticsGetAsyncResponse.getExample();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse2 = OASAdsAnalyticsGetAsyncResponse.getExample();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse3 = new OASAdsAnalyticsGetAsyncResponse();
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse4 = new OASAdsAnalyticsGetAsyncResponse();

        System.assert(adsAnalyticsGetAsyncResponse1.equals(adsAnalyticsGetAsyncResponse2));
        System.assert(adsAnalyticsGetAsyncResponse3.equals(adsAnalyticsGetAsyncResponse4));
        System.assertEquals(adsAnalyticsGetAsyncResponse1.hashCode(), adsAnalyticsGetAsyncResponse2.hashCode());
        System.assertEquals(adsAnalyticsGetAsyncResponse3.hashCode(), adsAnalyticsGetAsyncResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse = new OASAdsAnalyticsGetAsyncResponse();
        Map<String, String> x-property-mappings = adsAnalyticsGetAsyncResponse.getx-property-mappings();
        System.assertEquals('reportStatus', x-property-mappings.get('report_status'));
    }
}
