@isTest
private class OASAdResponseAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdResponseAllOf adResponseAllOf1 = OASAdResponseAllOf.getExample();
        OASAdResponseAllOf adResponseAllOf2 = adResponseAllOf1;
        OASAdResponseAllOf adResponseAllOf3 = new OASAdResponseAllOf();
        OASAdResponseAllOf adResponseAllOf4 = adResponseAllOf3;

        System.assert(adResponseAllOf1.equals(adResponseAllOf2));
        System.assert(adResponseAllOf2.equals(adResponseAllOf1));
        System.assert(adResponseAllOf1.equals(adResponseAllOf1));
        System.assert(adResponseAllOf3.equals(adResponseAllOf4));
        System.assert(adResponseAllOf4.equals(adResponseAllOf3));
        System.assert(adResponseAllOf3.equals(adResponseAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdResponseAllOf adResponseAllOf1 = OASAdResponseAllOf.getExample();
        OASAdResponseAllOf adResponseAllOf2 = OASAdResponseAllOf.getExample();
        OASAdResponseAllOf adResponseAllOf3 = new OASAdResponseAllOf();
        OASAdResponseAllOf adResponseAllOf4 = new OASAdResponseAllOf();

        System.assert(adResponseAllOf1.equals(adResponseAllOf2));
        System.assert(adResponseAllOf2.equals(adResponseAllOf1));
        System.assert(adResponseAllOf3.equals(adResponseAllOf4));
        System.assert(adResponseAllOf4.equals(adResponseAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdResponseAllOf adResponseAllOf1 = OASAdResponseAllOf.getExample();
        OASAdResponseAllOf adResponseAllOf2 = new OASAdResponseAllOf();

        System.assertEquals(false, adResponseAllOf1.equals('foo'));
        System.assertEquals(false, adResponseAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdResponseAllOf adResponseAllOf1 = OASAdResponseAllOf.getExample();
        OASAdResponseAllOf adResponseAllOf2 = new OASAdResponseAllOf();
        OASAdResponseAllOf adResponseAllOf3;

        System.assertEquals(false, adResponseAllOf1.equals(adResponseAllOf3));
        System.assertEquals(false, adResponseAllOf2.equals(adResponseAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdResponseAllOf adResponseAllOf1 = OASAdResponseAllOf.getExample();
        OASAdResponseAllOf adResponseAllOf2 = new OASAdResponseAllOf();

        System.assertEquals(adResponseAllOf1.hashCode(), adResponseAllOf1.hashCode());
        System.assertEquals(adResponseAllOf2.hashCode(), adResponseAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdResponseAllOf adResponseAllOf1 = OASAdResponseAllOf.getExample();
        OASAdResponseAllOf adResponseAllOf2 = OASAdResponseAllOf.getExample();
        OASAdResponseAllOf adResponseAllOf3 = new OASAdResponseAllOf();
        OASAdResponseAllOf adResponseAllOf4 = new OASAdResponseAllOf();

        System.assert(adResponseAllOf1.equals(adResponseAllOf2));
        System.assert(adResponseAllOf3.equals(adResponseAllOf4));
        System.assertEquals(adResponseAllOf1.hashCode(), adResponseAllOf2.hashCode());
        System.assertEquals(adResponseAllOf3.hashCode(), adResponseAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdResponseAllOf adResponseAllOf = new OASAdResponseAllOf();
        Map<String, String> x-property-mappings = adResponseAllOf.getx-property-mappings();
        System.assertEquals('adGroupId', x-property-mappings.get('ad_group_id'));
        System.assertEquals('androidDeepLink', x-property-mappings.get('android_deep_link'));
        System.assertEquals('carouselAndroidDeepLinks', x-property-mappings.get('carousel_android_deep_links'));
        System.assertEquals('carouselDestinationUrls', x-property-mappings.get('carousel_destination_urls'));
        System.assertEquals('carouselIosDeepLinks', x-property-mappings.get('carousel_ios_deep_links'));
        System.assertEquals('clickTrackingUrl', x-property-mappings.get('click_tracking_url'));
        System.assertEquals('creativeType', x-property-mappings.get('creative_type'));
        System.assertEquals('destinationUrl', x-property-mappings.get('destination_url'));
        System.assertEquals('iosDeepLink', x-property-mappings.get('ios_deep_link'));
        System.assertEquals('isPinDeleted', x-property-mappings.get('is_pin_deleted'));
        System.assertEquals('isRemovable', x-property-mappings.get('is_removable'));
        System.assertEquals('pinId', x-property-mappings.get('pin_id'));
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
        System.assertEquals('viewTrackingUrl', x-property-mappings.get('view_tracking_url'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdResponseAllOf adResponseAllOf = new OASAdResponseAllOf();
        System.assertEquals(new List<String>(), adResponseAllOf.carouselAndroidDeepLinks);
        System.assertEquals(new List<String>(), adResponseAllOf.carouselDestinationUrls);
        System.assertEquals(new List<String>(), adResponseAllOf.carouselIosDeepLinks);
        System.assertEquals(null, adResponseAllOf.adGroupId);
        System.assertEquals(null, adResponseAllOf.androidDeepLink);
        System.assertEquals(null, adResponseAllOf.clickTrackingUrl);
        System.assertEquals(null, adResponseAllOf.creativeType);
        System.assertEquals(null, adResponseAllOf.destinationUrl);
        System.assertEquals(null, adResponseAllOf.iosDeepLink);
        System.assertEquals(null, adResponseAllOf.isPinDeleted);
        System.assertEquals(null, adResponseAllOf.isRemovable);
        System.assertEquals(null, adResponseAllOf.name);
        System.assertEquals(null, adResponseAllOf.pinId);
        System.assertEquals(null, adResponseAllOf.status);
        System.assertEquals(null, adResponseAllOf.trackingUrls);
        System.assertEquals(null, adResponseAllOf.viewTrackingUrl);
    }
}
