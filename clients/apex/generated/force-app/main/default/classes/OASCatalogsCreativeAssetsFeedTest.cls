@isTest
private class OASCatalogsCreativeAssetsFeedTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed1 = OASCatalogsCreativeAssetsFeed.getExample();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed2 = catalogsCreativeAssetsFeed1;
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed3 = new OASCatalogsCreativeAssetsFeed();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed4 = catalogsCreativeAssetsFeed3;

        System.assert(catalogsCreativeAssetsFeed1.equals(catalogsCreativeAssetsFeed2));
        System.assert(catalogsCreativeAssetsFeed2.equals(catalogsCreativeAssetsFeed1));
        System.assert(catalogsCreativeAssetsFeed1.equals(catalogsCreativeAssetsFeed1));
        System.assert(catalogsCreativeAssetsFeed3.equals(catalogsCreativeAssetsFeed4));
        System.assert(catalogsCreativeAssetsFeed4.equals(catalogsCreativeAssetsFeed3));
        System.assert(catalogsCreativeAssetsFeed3.equals(catalogsCreativeAssetsFeed3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed1 = OASCatalogsCreativeAssetsFeed.getExample();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed2 = OASCatalogsCreativeAssetsFeed.getExample();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed3 = new OASCatalogsCreativeAssetsFeed();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed4 = new OASCatalogsCreativeAssetsFeed();

        System.assert(catalogsCreativeAssetsFeed1.equals(catalogsCreativeAssetsFeed2));
        System.assert(catalogsCreativeAssetsFeed2.equals(catalogsCreativeAssetsFeed1));
        System.assert(catalogsCreativeAssetsFeed3.equals(catalogsCreativeAssetsFeed4));
        System.assert(catalogsCreativeAssetsFeed4.equals(catalogsCreativeAssetsFeed3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed1 = OASCatalogsCreativeAssetsFeed.getExample();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed2 = new OASCatalogsCreativeAssetsFeed();

        System.assertEquals(false, catalogsCreativeAssetsFeed1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsFeed2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed1 = OASCatalogsCreativeAssetsFeed.getExample();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed2 = new OASCatalogsCreativeAssetsFeed();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed3;

        System.assertEquals(false, catalogsCreativeAssetsFeed1.equals(catalogsCreativeAssetsFeed3));
        System.assertEquals(false, catalogsCreativeAssetsFeed2.equals(catalogsCreativeAssetsFeed3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed1 = OASCatalogsCreativeAssetsFeed.getExample();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed2 = new OASCatalogsCreativeAssetsFeed();

        System.assertEquals(catalogsCreativeAssetsFeed1.hashCode(), catalogsCreativeAssetsFeed1.hashCode());
        System.assertEquals(catalogsCreativeAssetsFeed2.hashCode(), catalogsCreativeAssetsFeed2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed1 = OASCatalogsCreativeAssetsFeed.getExample();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed2 = OASCatalogsCreativeAssetsFeed.getExample();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed3 = new OASCatalogsCreativeAssetsFeed();
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed4 = new OASCatalogsCreativeAssetsFeed();

        System.assert(catalogsCreativeAssetsFeed1.equals(catalogsCreativeAssetsFeed2));
        System.assert(catalogsCreativeAssetsFeed3.equals(catalogsCreativeAssetsFeed4));
        System.assertEquals(catalogsCreativeAssetsFeed1.hashCode(), catalogsCreativeAssetsFeed2.hashCode());
        System.assertEquals(catalogsCreativeAssetsFeed3.hashCode(), catalogsCreativeAssetsFeed4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed = new OASCatalogsCreativeAssetsFeed();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsFeed.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('defaultLocale', x-property-mappings.get('default_locale'));
        System.assertEquals('defaultCountry', x-property-mappings.get('default_country'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
