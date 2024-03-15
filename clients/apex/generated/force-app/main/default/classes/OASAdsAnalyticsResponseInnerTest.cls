@isTest
private class OASAdsAnalyticsResponseInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner1 = OASAdsAnalyticsResponseInner.getExample();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner2 = adsAnalyticsResponseInner1;
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner3 = new OASAdsAnalyticsResponseInner();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner4 = adsAnalyticsResponseInner3;

        System.assert(adsAnalyticsResponseInner1.equals(adsAnalyticsResponseInner2));
        System.assert(adsAnalyticsResponseInner2.equals(adsAnalyticsResponseInner1));
        System.assert(adsAnalyticsResponseInner1.equals(adsAnalyticsResponseInner1));
        System.assert(adsAnalyticsResponseInner3.equals(adsAnalyticsResponseInner4));
        System.assert(adsAnalyticsResponseInner4.equals(adsAnalyticsResponseInner3));
        System.assert(adsAnalyticsResponseInner3.equals(adsAnalyticsResponseInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner1 = OASAdsAnalyticsResponseInner.getExample();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner2 = OASAdsAnalyticsResponseInner.getExample();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner3 = new OASAdsAnalyticsResponseInner();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner4 = new OASAdsAnalyticsResponseInner();

        System.assert(adsAnalyticsResponseInner1.equals(adsAnalyticsResponseInner2));
        System.assert(adsAnalyticsResponseInner2.equals(adsAnalyticsResponseInner1));
        System.assert(adsAnalyticsResponseInner3.equals(adsAnalyticsResponseInner4));
        System.assert(adsAnalyticsResponseInner4.equals(adsAnalyticsResponseInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner1 = OASAdsAnalyticsResponseInner.getExample();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner2 = new OASAdsAnalyticsResponseInner();

        System.assertEquals(false, adsAnalyticsResponseInner1.equals('foo'));
        System.assertEquals(false, adsAnalyticsResponseInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner1 = OASAdsAnalyticsResponseInner.getExample();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner2 = new OASAdsAnalyticsResponseInner();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner3;

        System.assertEquals(false, adsAnalyticsResponseInner1.equals(adsAnalyticsResponseInner3));
        System.assertEquals(false, adsAnalyticsResponseInner2.equals(adsAnalyticsResponseInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner1 = OASAdsAnalyticsResponseInner.getExample();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner2 = new OASAdsAnalyticsResponseInner();

        System.assertEquals(adsAnalyticsResponseInner1.hashCode(), adsAnalyticsResponseInner1.hashCode());
        System.assertEquals(adsAnalyticsResponseInner2.hashCode(), adsAnalyticsResponseInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner1 = OASAdsAnalyticsResponseInner.getExample();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner2 = OASAdsAnalyticsResponseInner.getExample();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner3 = new OASAdsAnalyticsResponseInner();
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner4 = new OASAdsAnalyticsResponseInner();

        System.assert(adsAnalyticsResponseInner1.equals(adsAnalyticsResponseInner2));
        System.assert(adsAnalyticsResponseInner3.equals(adsAnalyticsResponseInner4));
        System.assertEquals(adsAnalyticsResponseInner1.hashCode(), adsAnalyticsResponseInner2.hashCode());
        System.assertEquals(adsAnalyticsResponseInner3.hashCode(), adsAnalyticsResponseInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdsAnalyticsResponseInner adsAnalyticsResponseInner = new OASAdsAnalyticsResponseInner();
        Map<String, String> x-property-mappings = adsAnalyticsResponseInner.getx-property-mappings();
        System.assertEquals('r_DATE', x-property-mappings.get('DATE'));
    }
}
