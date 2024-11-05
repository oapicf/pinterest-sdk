@isTest
private class OASProductGroupPromotionCreateRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement2 = productGroupPromotionCreateRequestElement1;
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement3 = new OASProductGroupPromotionCreateReques();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement4 = productGroupPromotionCreateRequestElement3;

        System.assert(productGroupPromotionCreateRequestElement1.equals(productGroupPromotionCreateRequestElement2));
        System.assert(productGroupPromotionCreateRequestElement2.equals(productGroupPromotionCreateRequestElement1));
        System.assert(productGroupPromotionCreateRequestElement1.equals(productGroupPromotionCreateRequestElement1));
        System.assert(productGroupPromotionCreateRequestElement3.equals(productGroupPromotionCreateRequestElement4));
        System.assert(productGroupPromotionCreateRequestElement4.equals(productGroupPromotionCreateRequestElement3));
        System.assert(productGroupPromotionCreateRequestElement3.equals(productGroupPromotionCreateRequestElement3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement2 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement3 = new OASProductGroupPromotionCreateReques();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement4 = new OASProductGroupPromotionCreateReques();

        System.assert(productGroupPromotionCreateRequestElement1.equals(productGroupPromotionCreateRequestElement2));
        System.assert(productGroupPromotionCreateRequestElement2.equals(productGroupPromotionCreateRequestElement1));
        System.assert(productGroupPromotionCreateRequestElement3.equals(productGroupPromotionCreateRequestElement4));
        System.assert(productGroupPromotionCreateRequestElement4.equals(productGroupPromotionCreateRequestElement3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement2 = new OASProductGroupPromotionCreateReques();

        System.assertEquals(false, productGroupPromotionCreateRequestElement1.equals('foo'));
        System.assertEquals(false, productGroupPromotionCreateRequestElement2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement2 = new OASProductGroupPromotionCreateReques();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement3;

        System.assertEquals(false, productGroupPromotionCreateRequestElement1.equals(productGroupPromotionCreateRequestElement3));
        System.assertEquals(false, productGroupPromotionCreateRequestElement2.equals(productGroupPromotionCreateRequestElement3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement2 = new OASProductGroupPromotionCreateReques();

        System.assertEquals(productGroupPromotionCreateRequestElement1.hashCode(), productGroupPromotionCreateRequestElement1.hashCode());
        System.assertEquals(productGroupPromotionCreateRequestElement2.hashCode(), productGroupPromotionCreateRequestElement2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement2 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement3 = new OASProductGroupPromotionCreateReques();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement4 = new OASProductGroupPromotionCreateReques();

        System.assert(productGroupPromotionCreateRequestElement1.equals(productGroupPromotionCreateRequestElement2));
        System.assert(productGroupPromotionCreateRequestElement3.equals(productGroupPromotionCreateRequestElement4));
        System.assertEquals(productGroupPromotionCreateRequestElement1.hashCode(), productGroupPromotionCreateRequestElement2.hashCode());
        System.assertEquals(productGroupPromotionCreateRequestElement3.hashCode(), productGroupPromotionCreateRequestElement4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement = new OASProductGroupPromotionCreateReques();
        Map<String, String> x-property-mappings = productGroupPromotionCreateRequestElement.getx-property-mappings();
        System.assertEquals('adGroupId', x-property-mappings.get('ad_group_id'));
        System.assertEquals('bidInMicroCurrency', x-property-mappings.get('bid_in_micro_currency'));
        System.assertEquals('relativeDefinition', x-property-mappings.get('relative_definition'));
        System.assertEquals('parentId', x-property-mappings.get('parent_id'));
        System.assertEquals('slideshowCollectionsTitle', x-property-mappings.get('slideshow_collections_title'));
        System.assertEquals('slideshowCollectionsDescription', x-property-mappings.get('slideshow_collections_description'));
        System.assertEquals('isMdl', x-property-mappings.get('is_mdl'));
        System.assertEquals('trackingUrl', x-property-mappings.get('tracking_url'));
        System.assertEquals('catalogProductGroupId', x-property-mappings.get('catalog_product_group_id'));
        System.assertEquals('catalogProductGroupName', x-property-mappings.get('catalog_product_group_name'));
        System.assertEquals('collectionsHeroPinId', x-property-mappings.get('collections_hero_pin_id'));
        System.assertEquals('collectionsHeroDestinationUrl', x-property-mappings.get('collections_hero_destination_url'));
        System.assertEquals('gridClickType', x-property-mappings.get('grid_click_type'));
        System.assertEquals('creativeType', x-property-mappings.get('creative_type'));
    }
}
