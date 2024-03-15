@isTest
private class OASAdUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdUpdateRequest adUpdateRequest1 = OASAdUpdateRequest.getExample();
        OASAdUpdateRequest adUpdateRequest2 = adUpdateRequest1;
        OASAdUpdateRequest adUpdateRequest3 = new OASAdUpdateRequest();
        OASAdUpdateRequest adUpdateRequest4 = adUpdateRequest3;

        System.assert(adUpdateRequest1.equals(adUpdateRequest2));
        System.assert(adUpdateRequest2.equals(adUpdateRequest1));
        System.assert(adUpdateRequest1.equals(adUpdateRequest1));
        System.assert(adUpdateRequest3.equals(adUpdateRequest4));
        System.assert(adUpdateRequest4.equals(adUpdateRequest3));
        System.assert(adUpdateRequest3.equals(adUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdUpdateRequest adUpdateRequest1 = OASAdUpdateRequest.getExample();
        OASAdUpdateRequest adUpdateRequest2 = OASAdUpdateRequest.getExample();
        OASAdUpdateRequest adUpdateRequest3 = new OASAdUpdateRequest();
        OASAdUpdateRequest adUpdateRequest4 = new OASAdUpdateRequest();

        System.assert(adUpdateRequest1.equals(adUpdateRequest2));
        System.assert(adUpdateRequest2.equals(adUpdateRequest1));
        System.assert(adUpdateRequest3.equals(adUpdateRequest4));
        System.assert(adUpdateRequest4.equals(adUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdUpdateRequest adUpdateRequest1 = OASAdUpdateRequest.getExample();
        OASAdUpdateRequest adUpdateRequest2 = new OASAdUpdateRequest();

        System.assertEquals(false, adUpdateRequest1.equals('foo'));
        System.assertEquals(false, adUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdUpdateRequest adUpdateRequest1 = OASAdUpdateRequest.getExample();
        OASAdUpdateRequest adUpdateRequest2 = new OASAdUpdateRequest();
        OASAdUpdateRequest adUpdateRequest3;

        System.assertEquals(false, adUpdateRequest1.equals(adUpdateRequest3));
        System.assertEquals(false, adUpdateRequest2.equals(adUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdUpdateRequest adUpdateRequest1 = OASAdUpdateRequest.getExample();
        OASAdUpdateRequest adUpdateRequest2 = new OASAdUpdateRequest();

        System.assertEquals(adUpdateRequest1.hashCode(), adUpdateRequest1.hashCode());
        System.assertEquals(adUpdateRequest2.hashCode(), adUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdUpdateRequest adUpdateRequest1 = OASAdUpdateRequest.getExample();
        OASAdUpdateRequest adUpdateRequest2 = OASAdUpdateRequest.getExample();
        OASAdUpdateRequest adUpdateRequest3 = new OASAdUpdateRequest();
        OASAdUpdateRequest adUpdateRequest4 = new OASAdUpdateRequest();

        System.assert(adUpdateRequest1.equals(adUpdateRequest2));
        System.assert(adUpdateRequest3.equals(adUpdateRequest4));
        System.assertEquals(adUpdateRequest1.hashCode(), adUpdateRequest2.hashCode());
        System.assertEquals(adUpdateRequest3.hashCode(), adUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdUpdateRequest adUpdateRequest = new OASAdUpdateRequest();
        Map<String, String> x-property-mappings = adUpdateRequest.getx-property-mappings();
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
        System.assertEquals('pinId', x-property-mappings.get('pin_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdUpdateRequest adUpdateRequest = new OASAdUpdateRequest();
        System.assertEquals(new List<String>(), adUpdateRequest.carouselAndroidDeepLinks);
        System.assertEquals(new List<String>(), adUpdateRequest.carouselDestinationUrls);
        System.assertEquals(new List<String>(), adUpdateRequest.carouselIosDeepLinks);
        System.assertEquals(null, adUpdateRequest.adGroupId);
        System.assertEquals(null, adUpdateRequest.androidDeepLink);
        System.assertEquals(null, adUpdateRequest.clickTrackingUrl);
        System.assertEquals(null, adUpdateRequest.creativeType);
        System.assertEquals(null, adUpdateRequest.destinationUrl);
        System.assertEquals(null, adUpdateRequest.iosDeepLink);
        System.assertEquals(null, adUpdateRequest.isPinDeleted);
        System.assertEquals(null, adUpdateRequest.isRemovable);
        System.assertEquals(null, adUpdateRequest.name);
        System.assertEquals(null, adUpdateRequest.status);
        System.assertEquals(null, adUpdateRequest.trackingUrls);
        System.assertEquals(null, adUpdateRequest.viewTrackingUrl);
        System.assertEquals(null, adUpdateRequest.leadFormId);
        System.assertEquals(null, adUpdateRequest.gridClickType);
        System.assertEquals(null, adUpdateRequest.customizableCtaType);
        System.assertEquals(null, adUpdateRequest.quizPinData);
        System.assertEquals(null, adUpdateRequest.id);
        System.assertEquals(null, adUpdateRequest.pinId);
    }
}
