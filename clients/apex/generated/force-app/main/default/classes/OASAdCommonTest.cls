@isTest
private class OASAdCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdCommon adCommon1 = OASAdCommon.getExample();
        OASAdCommon adCommon2 = adCommon1;
        OASAdCommon adCommon3 = new OASAdCommon();
        OASAdCommon adCommon4 = adCommon3;

        System.assert(adCommon1.equals(adCommon2));
        System.assert(adCommon2.equals(adCommon1));
        System.assert(adCommon1.equals(adCommon1));
        System.assert(adCommon3.equals(adCommon4));
        System.assert(adCommon4.equals(adCommon3));
        System.assert(adCommon3.equals(adCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdCommon adCommon1 = OASAdCommon.getExample();
        OASAdCommon adCommon2 = OASAdCommon.getExample();
        OASAdCommon adCommon3 = new OASAdCommon();
        OASAdCommon adCommon4 = new OASAdCommon();

        System.assert(adCommon1.equals(adCommon2));
        System.assert(adCommon2.equals(adCommon1));
        System.assert(adCommon3.equals(adCommon4));
        System.assert(adCommon4.equals(adCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdCommon adCommon1 = OASAdCommon.getExample();
        OASAdCommon adCommon2 = new OASAdCommon();

        System.assertEquals(false, adCommon1.equals('foo'));
        System.assertEquals(false, adCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdCommon adCommon1 = OASAdCommon.getExample();
        OASAdCommon adCommon2 = new OASAdCommon();
        OASAdCommon adCommon3;

        System.assertEquals(false, adCommon1.equals(adCommon3));
        System.assertEquals(false, adCommon2.equals(adCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdCommon adCommon1 = OASAdCommon.getExample();
        OASAdCommon adCommon2 = new OASAdCommon();

        System.assertEquals(adCommon1.hashCode(), adCommon1.hashCode());
        System.assertEquals(adCommon2.hashCode(), adCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdCommon adCommon1 = OASAdCommon.getExample();
        OASAdCommon adCommon2 = OASAdCommon.getExample();
        OASAdCommon adCommon3 = new OASAdCommon();
        OASAdCommon adCommon4 = new OASAdCommon();

        System.assert(adCommon1.equals(adCommon2));
        System.assert(adCommon3.equals(adCommon4));
        System.assertEquals(adCommon1.hashCode(), adCommon2.hashCode());
        System.assertEquals(adCommon3.hashCode(), adCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdCommon adCommon = new OASAdCommon();
        Map<String, String> x-property-mappings = adCommon.getx-property-mappings();
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
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
        System.assertEquals('viewTrackingUrl', x-property-mappings.get('view_tracking_url'));
        System.assertEquals('leadFormId', x-property-mappings.get('lead_form_id'));
        System.assertEquals('gridClickType', x-property-mappings.get('grid_click_type'));
        System.assertEquals('customizableCtaType', x-property-mappings.get('customizable_cta_type'));
        System.assertEquals('quizPinData', x-property-mappings.get('quiz_pin_data'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdCommon adCommon = new OASAdCommon();
        System.assertEquals(new List<String>(), adCommon.carouselAndroidDeepLinks);
        System.assertEquals(new List<String>(), adCommon.carouselDestinationUrls);
        System.assertEquals(new List<String>(), adCommon.carouselIosDeepLinks);
        System.assertEquals(null, adCommon.adGroupId);
        System.assertEquals(null, adCommon.androidDeepLink);
        System.assertEquals(null, adCommon.clickTrackingUrl);
        System.assertEquals(null, adCommon.creativeType);
        System.assertEquals(null, adCommon.destinationUrl);
        System.assertEquals(null, adCommon.iosDeepLink);
        System.assertEquals(null, adCommon.isPinDeleted);
        System.assertEquals(null, adCommon.isRemovable);
        System.assertEquals(null, adCommon.name);
        System.assertEquals(null, adCommon.status);
        System.assertEquals(null, adCommon.trackingUrls);
        System.assertEquals(null, adCommon.viewTrackingUrl);
        System.assertEquals(null, adCommon.leadFormId);
        System.assertEquals(null, adCommon.gridClickType);
        System.assertEquals(null, adCommon.customizableCtaType);
        System.assertEquals(null, adCommon.quizPinData);
    }
}
