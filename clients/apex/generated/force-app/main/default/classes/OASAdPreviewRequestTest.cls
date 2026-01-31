@isTest
private class OASAdPreviewRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = adPreviewRequest1;
        OASAdPreviewRequest adPreviewRequest3 = new OASAdPreviewRequest();
        OASAdPreviewRequest adPreviewRequest4 = adPreviewRequest3;

        System.assert(adPreviewRequest1.equals(adPreviewRequest2));
        System.assert(adPreviewRequest2.equals(adPreviewRequest1));
        System.assert(adPreviewRequest1.equals(adPreviewRequest1));
        System.assert(adPreviewRequest3.equals(adPreviewRequest4));
        System.assert(adPreviewRequest4.equals(adPreviewRequest3));
        System.assert(adPreviewRequest3.equals(adPreviewRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest3 = new OASAdPreviewRequest();
        OASAdPreviewRequest adPreviewRequest4 = new OASAdPreviewRequest();

        System.assert(adPreviewRequest1.equals(adPreviewRequest2));
        System.assert(adPreviewRequest2.equals(adPreviewRequest1));
        System.assert(adPreviewRequest3.equals(adPreviewRequest4));
        System.assert(adPreviewRequest4.equals(adPreviewRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = new OASAdPreviewRequest();

        System.assertEquals(false, adPreviewRequest1.equals('foo'));
        System.assertEquals(false, adPreviewRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = new OASAdPreviewRequest();
        OASAdPreviewRequest adPreviewRequest3;

        System.assertEquals(false, adPreviewRequest1.equals(adPreviewRequest3));
        System.assertEquals(false, adPreviewRequest2.equals(adPreviewRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = new OASAdPreviewRequest();

        System.assertEquals(adPreviewRequest1.hashCode(), adPreviewRequest1.hashCode());
        System.assertEquals(adPreviewRequest2.hashCode(), adPreviewRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest3 = new OASAdPreviewRequest();
        OASAdPreviewRequest adPreviewRequest4 = new OASAdPreviewRequest();

        System.assert(adPreviewRequest1.equals(adPreviewRequest2));
        System.assert(adPreviewRequest3.equals(adPreviewRequest4));
        System.assertEquals(adPreviewRequest1.hashCode(), adPreviewRequest2.hashCode());
        System.assertEquals(adPreviewRequest3.hashCode(), adPreviewRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdPreviewRequest adPreviewRequest = new OASAdPreviewRequest();
        Map<String, String> x-property-mappings = adPreviewRequest.getx-property-mappings();
        System.assertEquals('imageUrl', x-property-mappings.get('image_url'));
        System.assertEquals('pinId', x-property-mappings.get('pin_id'));
        System.assertEquals('catalogProductGroupId', x-property-mappings.get('catalog_product_group_id'));
        System.assertEquals('creativeType', x-property-mappings.get('creative_type'));
        System.assertEquals('customizableCtaType', x-property-mappings.get('customizable_cta_type'));
        System.assertEquals('heroImageTitle', x-property-mappings.get('hero_image_title'));
        System.assertEquals('heroImageUrl', x-property-mappings.get('hero_image_url'));
        System.assertEquals('heroPinId', x-property-mappings.get('hero_pin_id'));
        System.assertEquals('imageTag', x-property-mappings.get('image_tag'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('preferredMediaType', x-property-mappings.get('preferred_media_type'));
        System.assertEquals('videoTag', x-property-mappings.get('video_tag'));
    }
}
