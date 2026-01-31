@isTest
private class OASAdPreviewShoppingTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdPreviewShopping adPreviewShopping1 = OASAdPreviewShopping.getExample();
        OASAdPreviewShopping adPreviewShopping2 = adPreviewShopping1;
        OASAdPreviewShopping adPreviewShopping3 = new OASAdPreviewShopping();
        OASAdPreviewShopping adPreviewShopping4 = adPreviewShopping3;

        System.assert(adPreviewShopping1.equals(adPreviewShopping2));
        System.assert(adPreviewShopping2.equals(adPreviewShopping1));
        System.assert(adPreviewShopping1.equals(adPreviewShopping1));
        System.assert(adPreviewShopping3.equals(adPreviewShopping4));
        System.assert(adPreviewShopping4.equals(adPreviewShopping3));
        System.assert(adPreviewShopping3.equals(adPreviewShopping3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdPreviewShopping adPreviewShopping1 = OASAdPreviewShopping.getExample();
        OASAdPreviewShopping adPreviewShopping2 = OASAdPreviewShopping.getExample();
        OASAdPreviewShopping adPreviewShopping3 = new OASAdPreviewShopping();
        OASAdPreviewShopping adPreviewShopping4 = new OASAdPreviewShopping();

        System.assert(adPreviewShopping1.equals(adPreviewShopping2));
        System.assert(adPreviewShopping2.equals(adPreviewShopping1));
        System.assert(adPreviewShopping3.equals(adPreviewShopping4));
        System.assert(adPreviewShopping4.equals(adPreviewShopping3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdPreviewShopping adPreviewShopping1 = OASAdPreviewShopping.getExample();
        OASAdPreviewShopping adPreviewShopping2 = new OASAdPreviewShopping();

        System.assertEquals(false, adPreviewShopping1.equals('foo'));
        System.assertEquals(false, adPreviewShopping2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdPreviewShopping adPreviewShopping1 = OASAdPreviewShopping.getExample();
        OASAdPreviewShopping adPreviewShopping2 = new OASAdPreviewShopping();
        OASAdPreviewShopping adPreviewShopping3;

        System.assertEquals(false, adPreviewShopping1.equals(adPreviewShopping3));
        System.assertEquals(false, adPreviewShopping2.equals(adPreviewShopping3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdPreviewShopping adPreviewShopping1 = OASAdPreviewShopping.getExample();
        OASAdPreviewShopping adPreviewShopping2 = new OASAdPreviewShopping();

        System.assertEquals(adPreviewShopping1.hashCode(), adPreviewShopping1.hashCode());
        System.assertEquals(adPreviewShopping2.hashCode(), adPreviewShopping2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdPreviewShopping adPreviewShopping1 = OASAdPreviewShopping.getExample();
        OASAdPreviewShopping adPreviewShopping2 = OASAdPreviewShopping.getExample();
        OASAdPreviewShopping adPreviewShopping3 = new OASAdPreviewShopping();
        OASAdPreviewShopping adPreviewShopping4 = new OASAdPreviewShopping();

        System.assert(adPreviewShopping1.equals(adPreviewShopping2));
        System.assert(adPreviewShopping3.equals(adPreviewShopping4));
        System.assertEquals(adPreviewShopping1.hashCode(), adPreviewShopping2.hashCode());
        System.assertEquals(adPreviewShopping3.hashCode(), adPreviewShopping4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdPreviewShopping adPreviewShopping = new OASAdPreviewShopping();
        Map<String, String> x-property-mappings = adPreviewShopping.getx-property-mappings();
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
