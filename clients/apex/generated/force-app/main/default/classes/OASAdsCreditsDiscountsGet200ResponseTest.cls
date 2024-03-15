@isTest
private class OASAdsCreditsDiscountsGet200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response1 = OASAdsCreditsDiscountsGet200Response.getExample();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response2 = adsCreditsDiscountsGet200Response1;
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response3 = new OASAdsCreditsDiscountsGet200Response();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response4 = adsCreditsDiscountsGet200Response3;

        System.assert(adsCreditsDiscountsGet200Response1.equals(adsCreditsDiscountsGet200Response2));
        System.assert(adsCreditsDiscountsGet200Response2.equals(adsCreditsDiscountsGet200Response1));
        System.assert(adsCreditsDiscountsGet200Response1.equals(adsCreditsDiscountsGet200Response1));
        System.assert(adsCreditsDiscountsGet200Response3.equals(adsCreditsDiscountsGet200Response4));
        System.assert(adsCreditsDiscountsGet200Response4.equals(adsCreditsDiscountsGet200Response3));
        System.assert(adsCreditsDiscountsGet200Response3.equals(adsCreditsDiscountsGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response1 = OASAdsCreditsDiscountsGet200Response.getExample();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response2 = OASAdsCreditsDiscountsGet200Response.getExample();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response3 = new OASAdsCreditsDiscountsGet200Response();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response4 = new OASAdsCreditsDiscountsGet200Response();

        System.assert(adsCreditsDiscountsGet200Response1.equals(adsCreditsDiscountsGet200Response2));
        System.assert(adsCreditsDiscountsGet200Response2.equals(adsCreditsDiscountsGet200Response1));
        System.assert(adsCreditsDiscountsGet200Response3.equals(adsCreditsDiscountsGet200Response4));
        System.assert(adsCreditsDiscountsGet200Response4.equals(adsCreditsDiscountsGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response1 = OASAdsCreditsDiscountsGet200Response.getExample();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response2 = new OASAdsCreditsDiscountsGet200Response();

        System.assertEquals(false, adsCreditsDiscountsGet200Response1.equals('foo'));
        System.assertEquals(false, adsCreditsDiscountsGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response1 = OASAdsCreditsDiscountsGet200Response.getExample();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response2 = new OASAdsCreditsDiscountsGet200Response();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response3;

        System.assertEquals(false, adsCreditsDiscountsGet200Response1.equals(adsCreditsDiscountsGet200Response3));
        System.assertEquals(false, adsCreditsDiscountsGet200Response2.equals(adsCreditsDiscountsGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response1 = OASAdsCreditsDiscountsGet200Response.getExample();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response2 = new OASAdsCreditsDiscountsGet200Response();

        System.assertEquals(adsCreditsDiscountsGet200Response1.hashCode(), adsCreditsDiscountsGet200Response1.hashCode());
        System.assertEquals(adsCreditsDiscountsGet200Response2.hashCode(), adsCreditsDiscountsGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response1 = OASAdsCreditsDiscountsGet200Response.getExample();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response2 = OASAdsCreditsDiscountsGet200Response.getExample();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response3 = new OASAdsCreditsDiscountsGet200Response();
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response4 = new OASAdsCreditsDiscountsGet200Response();

        System.assert(adsCreditsDiscountsGet200Response1.equals(adsCreditsDiscountsGet200Response2));
        System.assert(adsCreditsDiscountsGet200Response3.equals(adsCreditsDiscountsGet200Response4));
        System.assertEquals(adsCreditsDiscountsGet200Response1.hashCode(), adsCreditsDiscountsGet200Response2.hashCode());
        System.assertEquals(adsCreditsDiscountsGet200Response3.hashCode(), adsCreditsDiscountsGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response = new OASAdsCreditsDiscountsGet200Response();
        System.assertEquals(new List<OASAdsCreditDiscountsResponse>(), adsCreditsDiscountsGet200Response.items);
        System.assertEquals(null, adsCreditsDiscountsGet200Response.bookmark);
    }
}
