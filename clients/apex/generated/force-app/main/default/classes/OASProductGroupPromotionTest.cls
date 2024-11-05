@isTest
private class OASProductGroupPromotionTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductGroupPromotion productGroupPromotion1 = OASProductGroupPromotion.getExample();
        OASProductGroupPromotion productGroupPromotion2 = productGroupPromotion1;
        OASProductGroupPromotion productGroupPromotion3 = new OASProductGroupPromotion();
        OASProductGroupPromotion productGroupPromotion4 = productGroupPromotion3;

        System.assert(productGroupPromotion1.equals(productGroupPromotion2));
        System.assert(productGroupPromotion2.equals(productGroupPromotion1));
        System.assert(productGroupPromotion1.equals(productGroupPromotion1));
        System.assert(productGroupPromotion3.equals(productGroupPromotion4));
        System.assert(productGroupPromotion4.equals(productGroupPromotion3));
        System.assert(productGroupPromotion3.equals(productGroupPromotion3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductGroupPromotion productGroupPromotion1 = OASProductGroupPromotion.getExample();
        OASProductGroupPromotion productGroupPromotion2 = OASProductGroupPromotion.getExample();
        OASProductGroupPromotion productGroupPromotion3 = new OASProductGroupPromotion();
        OASProductGroupPromotion productGroupPromotion4 = new OASProductGroupPromotion();

        System.assert(productGroupPromotion1.equals(productGroupPromotion2));
        System.assert(productGroupPromotion2.equals(productGroupPromotion1));
        System.assert(productGroupPromotion3.equals(productGroupPromotion4));
        System.assert(productGroupPromotion4.equals(productGroupPromotion3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductGroupPromotion productGroupPromotion1 = OASProductGroupPromotion.getExample();
        OASProductGroupPromotion productGroupPromotion2 = new OASProductGroupPromotion();

        System.assertEquals(false, productGroupPromotion1.equals('foo'));
        System.assertEquals(false, productGroupPromotion2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductGroupPromotion productGroupPromotion1 = OASProductGroupPromotion.getExample();
        OASProductGroupPromotion productGroupPromotion2 = new OASProductGroupPromotion();
        OASProductGroupPromotion productGroupPromotion3;

        System.assertEquals(false, productGroupPromotion1.equals(productGroupPromotion3));
        System.assertEquals(false, productGroupPromotion2.equals(productGroupPromotion3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductGroupPromotion productGroupPromotion1 = OASProductGroupPromotion.getExample();
        OASProductGroupPromotion productGroupPromotion2 = new OASProductGroupPromotion();

        System.assertEquals(productGroupPromotion1.hashCode(), productGroupPromotion1.hashCode());
        System.assertEquals(productGroupPromotion2.hashCode(), productGroupPromotion2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductGroupPromotion productGroupPromotion1 = OASProductGroupPromotion.getExample();
        OASProductGroupPromotion productGroupPromotion2 = OASProductGroupPromotion.getExample();
        OASProductGroupPromotion productGroupPromotion3 = new OASProductGroupPromotion();
        OASProductGroupPromotion productGroupPromotion4 = new OASProductGroupPromotion();

        System.assert(productGroupPromotion1.equals(productGroupPromotion2));
        System.assert(productGroupPromotion3.equals(productGroupPromotion4));
        System.assertEquals(productGroupPromotion1.hashCode(), productGroupPromotion2.hashCode());
        System.assertEquals(productGroupPromotion3.hashCode(), productGroupPromotion4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductGroupPromotion productGroupPromotion = new OASProductGroupPromotion();
        Map<String, String> x-property-mappings = productGroupPromotion.getx-property-mappings();
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
    }
}
