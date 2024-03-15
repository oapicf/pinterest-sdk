@isTest
private class OASAdCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdCreateRequest adCreateRequest1 = OASAdCreateRequest.getExample();
        OASAdCreateRequest adCreateRequest2 = adCreateRequest1;
        OASAdCreateRequest adCreateRequest3 = new OASAdCreateRequest();
        OASAdCreateRequest adCreateRequest4 = adCreateRequest3;

        System.assert(adCreateRequest1.equals(adCreateRequest2));
        System.assert(adCreateRequest2.equals(adCreateRequest1));
        System.assert(adCreateRequest1.equals(adCreateRequest1));
        System.assert(adCreateRequest3.equals(adCreateRequest4));
        System.assert(adCreateRequest4.equals(adCreateRequest3));
        System.assert(adCreateRequest3.equals(adCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdCreateRequest adCreateRequest1 = OASAdCreateRequest.getExample();
        OASAdCreateRequest adCreateRequest2 = OASAdCreateRequest.getExample();
        OASAdCreateRequest adCreateRequest3 = new OASAdCreateRequest();
        OASAdCreateRequest adCreateRequest4 = new OASAdCreateRequest();

        System.assert(adCreateRequest1.equals(adCreateRequest2));
        System.assert(adCreateRequest2.equals(adCreateRequest1));
        System.assert(adCreateRequest3.equals(adCreateRequest4));
        System.assert(adCreateRequest4.equals(adCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdCreateRequest adCreateRequest1 = OASAdCreateRequest.getExample();
        OASAdCreateRequest adCreateRequest2 = new OASAdCreateRequest();

        System.assertEquals(false, adCreateRequest1.equals('foo'));
        System.assertEquals(false, adCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdCreateRequest adCreateRequest1 = OASAdCreateRequest.getExample();
        OASAdCreateRequest adCreateRequest2 = new OASAdCreateRequest();
        OASAdCreateRequest adCreateRequest3;

        System.assertEquals(false, adCreateRequest1.equals(adCreateRequest3));
        System.assertEquals(false, adCreateRequest2.equals(adCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdCreateRequest adCreateRequest1 = OASAdCreateRequest.getExample();
        OASAdCreateRequest adCreateRequest2 = new OASAdCreateRequest();

        System.assertEquals(adCreateRequest1.hashCode(), adCreateRequest1.hashCode());
        System.assertEquals(adCreateRequest2.hashCode(), adCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdCreateRequest adCreateRequest1 = OASAdCreateRequest.getExample();
        OASAdCreateRequest adCreateRequest2 = OASAdCreateRequest.getExample();
        OASAdCreateRequest adCreateRequest3 = new OASAdCreateRequest();
        OASAdCreateRequest adCreateRequest4 = new OASAdCreateRequest();

        System.assert(adCreateRequest1.equals(adCreateRequest2));
        System.assert(adCreateRequest3.equals(adCreateRequest4));
        System.assertEquals(adCreateRequest1.hashCode(), adCreateRequest2.hashCode());
        System.assertEquals(adCreateRequest3.hashCode(), adCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdCreateRequest adCreateRequest = new OASAdCreateRequest();
        Map<String, String> x-property-mappings = adCreateRequest.getx-property-mappings();
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
        OASAdCreateRequest adCreateRequest = new OASAdCreateRequest();
        System.assertEquals(new List<String>(), adCreateRequest.carouselAndroidDeepLinks);
        System.assertEquals(new List<String>(), adCreateRequest.carouselDestinationUrls);
        System.assertEquals(new List<String>(), adCreateRequest.carouselIosDeepLinks);
        System.assertEquals(null, adCreateRequest.adGroupId);
        System.assertEquals(null, adCreateRequest.androidDeepLink);
        System.assertEquals(null, adCreateRequest.clickTrackingUrl);
        System.assertEquals(null, adCreateRequest.creativeType);
        System.assertEquals(null, adCreateRequest.destinationUrl);
        System.assertEquals(null, adCreateRequest.iosDeepLink);
        System.assertEquals(null, adCreateRequest.isPinDeleted);
        System.assertEquals(null, adCreateRequest.isRemovable);
        System.assertEquals(null, adCreateRequest.name);
        System.assertEquals(null, adCreateRequest.status);
        System.assertEquals(null, adCreateRequest.trackingUrls);
        System.assertEquals(null, adCreateRequest.viewTrackingUrl);
        System.assertEquals(null, adCreateRequest.leadFormId);
        System.assertEquals(null, adCreateRequest.gridClickType);
        System.assertEquals(null, adCreateRequest.customizableCtaType);
        System.assertEquals(null, adCreateRequest.quizPinData);
        System.assertEquals(null, adCreateRequest.pinId);
    }
}
