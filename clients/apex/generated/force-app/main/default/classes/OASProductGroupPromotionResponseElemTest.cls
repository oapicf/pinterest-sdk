@isTest
private class OASProductGroupPromotionResponseElemTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement1 = OASProductGroupPromotionResponseElem.getExample();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement2 = productGroupPromotionResponseElement1;
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement3 = new OASProductGroupPromotionResponseElem();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement4 = productGroupPromotionResponseElement3;

        System.assert(productGroupPromotionResponseElement1.equals(productGroupPromotionResponseElement2));
        System.assert(productGroupPromotionResponseElement2.equals(productGroupPromotionResponseElement1));
        System.assert(productGroupPromotionResponseElement1.equals(productGroupPromotionResponseElement1));
        System.assert(productGroupPromotionResponseElement3.equals(productGroupPromotionResponseElement4));
        System.assert(productGroupPromotionResponseElement4.equals(productGroupPromotionResponseElement3));
        System.assert(productGroupPromotionResponseElement3.equals(productGroupPromotionResponseElement3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement1 = OASProductGroupPromotionResponseElem.getExample();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement2 = OASProductGroupPromotionResponseElem.getExample();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement3 = new OASProductGroupPromotionResponseElem();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement4 = new OASProductGroupPromotionResponseElem();

        System.assert(productGroupPromotionResponseElement1.equals(productGroupPromotionResponseElement2));
        System.assert(productGroupPromotionResponseElement2.equals(productGroupPromotionResponseElement1));
        System.assert(productGroupPromotionResponseElement3.equals(productGroupPromotionResponseElement4));
        System.assert(productGroupPromotionResponseElement4.equals(productGroupPromotionResponseElement3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement1 = OASProductGroupPromotionResponseElem.getExample();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement2 = new OASProductGroupPromotionResponseElem();

        System.assertEquals(false, productGroupPromotionResponseElement1.equals('foo'));
        System.assertEquals(false, productGroupPromotionResponseElement2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement1 = OASProductGroupPromotionResponseElem.getExample();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement2 = new OASProductGroupPromotionResponseElem();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement3;

        System.assertEquals(false, productGroupPromotionResponseElement1.equals(productGroupPromotionResponseElement3));
        System.assertEquals(false, productGroupPromotionResponseElement2.equals(productGroupPromotionResponseElement3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement1 = OASProductGroupPromotionResponseElem.getExample();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement2 = new OASProductGroupPromotionResponseElem();

        System.assertEquals(productGroupPromotionResponseElement1.hashCode(), productGroupPromotionResponseElement1.hashCode());
        System.assertEquals(productGroupPromotionResponseElement2.hashCode(), productGroupPromotionResponseElement2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement1 = OASProductGroupPromotionResponseElem.getExample();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement2 = OASProductGroupPromotionResponseElem.getExample();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement3 = new OASProductGroupPromotionResponseElem();
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement4 = new OASProductGroupPromotionResponseElem();

        System.assert(productGroupPromotionResponseElement1.equals(productGroupPromotionResponseElement2));
        System.assert(productGroupPromotionResponseElement3.equals(productGroupPromotionResponseElement4));
        System.assertEquals(productGroupPromotionResponseElement1.hashCode(), productGroupPromotionResponseElement2.hashCode());
        System.assertEquals(productGroupPromotionResponseElement3.hashCode(), productGroupPromotionResponseElement4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductGroupPromotionResponseElem productGroupPromotionResponseElement = new OASProductGroupPromotionResponseElem();
        Map<String, String> x-property-mappings = productGroupPromotionResponseElement.getx-property-mappings();
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
