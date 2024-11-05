@isTest
private class OASCatalogsItemsPostFiltersTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemsPostFilters catalogsItemsPostFilters1 = OASCatalogsItemsPostFilters.getExample();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters2 = catalogsItemsPostFilters1;
        OASCatalogsItemsPostFilters catalogsItemsPostFilters3 = new OASCatalogsItemsPostFilters();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters4 = catalogsItemsPostFilters3;

        System.assert(catalogsItemsPostFilters1.equals(catalogsItemsPostFilters2));
        System.assert(catalogsItemsPostFilters2.equals(catalogsItemsPostFilters1));
        System.assert(catalogsItemsPostFilters1.equals(catalogsItemsPostFilters1));
        System.assert(catalogsItemsPostFilters3.equals(catalogsItemsPostFilters4));
        System.assert(catalogsItemsPostFilters4.equals(catalogsItemsPostFilters3));
        System.assert(catalogsItemsPostFilters3.equals(catalogsItemsPostFilters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemsPostFilters catalogsItemsPostFilters1 = OASCatalogsItemsPostFilters.getExample();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters2 = OASCatalogsItemsPostFilters.getExample();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters3 = new OASCatalogsItemsPostFilters();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters4 = new OASCatalogsItemsPostFilters();

        System.assert(catalogsItemsPostFilters1.equals(catalogsItemsPostFilters2));
        System.assert(catalogsItemsPostFilters2.equals(catalogsItemsPostFilters1));
        System.assert(catalogsItemsPostFilters3.equals(catalogsItemsPostFilters4));
        System.assert(catalogsItemsPostFilters4.equals(catalogsItemsPostFilters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemsPostFilters catalogsItemsPostFilters1 = OASCatalogsItemsPostFilters.getExample();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters2 = new OASCatalogsItemsPostFilters();

        System.assertEquals(false, catalogsItemsPostFilters1.equals('foo'));
        System.assertEquals(false, catalogsItemsPostFilters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemsPostFilters catalogsItemsPostFilters1 = OASCatalogsItemsPostFilters.getExample();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters2 = new OASCatalogsItemsPostFilters();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters3;

        System.assertEquals(false, catalogsItemsPostFilters1.equals(catalogsItemsPostFilters3));
        System.assertEquals(false, catalogsItemsPostFilters2.equals(catalogsItemsPostFilters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemsPostFilters catalogsItemsPostFilters1 = OASCatalogsItemsPostFilters.getExample();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters2 = new OASCatalogsItemsPostFilters();

        System.assertEquals(catalogsItemsPostFilters1.hashCode(), catalogsItemsPostFilters1.hashCode());
        System.assertEquals(catalogsItemsPostFilters2.hashCode(), catalogsItemsPostFilters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemsPostFilters catalogsItemsPostFilters1 = OASCatalogsItemsPostFilters.getExample();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters2 = OASCatalogsItemsPostFilters.getExample();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters3 = new OASCatalogsItemsPostFilters();
        OASCatalogsItemsPostFilters catalogsItemsPostFilters4 = new OASCatalogsItemsPostFilters();

        System.assert(catalogsItemsPostFilters1.equals(catalogsItemsPostFilters2));
        System.assert(catalogsItemsPostFilters3.equals(catalogsItemsPostFilters4));
        System.assertEquals(catalogsItemsPostFilters1.hashCode(), catalogsItemsPostFilters2.hashCode());
        System.assertEquals(catalogsItemsPostFilters3.hashCode(), catalogsItemsPostFilters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsItemsPostFilters catalogsItemsPostFilters = new OASCatalogsItemsPostFilters();
        Map<String, String> x-property-mappings = catalogsItemsPostFilters.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('itemIds', x-property-mappings.get('item_ids'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
        System.assertEquals('hotelIds', x-property-mappings.get('hotel_ids'));
        System.assertEquals('creativeAssetsIds', x-property-mappings.get('creative_assets_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsItemsPostFilters catalogsItemsPostFilters = new OASCatalogsItemsPostFilters();
        System.assertEquals(new List<String>(), catalogsItemsPostFilters.itemIds);
        System.assertEquals(new List<String>(), catalogsItemsPostFilters.hotelIds);
        System.assertEquals(new List<String>(), catalogsItemsPostFilters.creativeAssetsIds);
        System.assertEquals(null, catalogsItemsPostFilters.catalogType);
        System.assertEquals(null, catalogsItemsPostFilters.catalogId);
    }
}
