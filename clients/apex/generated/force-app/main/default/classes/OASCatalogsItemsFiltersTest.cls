@isTest
private class OASCatalogsItemsFiltersTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemsFilters catalogsItemsFilters1 = OASCatalogsItemsFilters.getExample();
        OASCatalogsItemsFilters catalogsItemsFilters2 = catalogsItemsFilters1;
        OASCatalogsItemsFilters catalogsItemsFilters3 = new OASCatalogsItemsFilters();
        OASCatalogsItemsFilters catalogsItemsFilters4 = catalogsItemsFilters3;

        System.assert(catalogsItemsFilters1.equals(catalogsItemsFilters2));
        System.assert(catalogsItemsFilters2.equals(catalogsItemsFilters1));
        System.assert(catalogsItemsFilters1.equals(catalogsItemsFilters1));
        System.assert(catalogsItemsFilters3.equals(catalogsItemsFilters4));
        System.assert(catalogsItemsFilters4.equals(catalogsItemsFilters3));
        System.assert(catalogsItemsFilters3.equals(catalogsItemsFilters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemsFilters catalogsItemsFilters1 = OASCatalogsItemsFilters.getExample();
        OASCatalogsItemsFilters catalogsItemsFilters2 = OASCatalogsItemsFilters.getExample();
        OASCatalogsItemsFilters catalogsItemsFilters3 = new OASCatalogsItemsFilters();
        OASCatalogsItemsFilters catalogsItemsFilters4 = new OASCatalogsItemsFilters();

        System.assert(catalogsItemsFilters1.equals(catalogsItemsFilters2));
        System.assert(catalogsItemsFilters2.equals(catalogsItemsFilters1));
        System.assert(catalogsItemsFilters3.equals(catalogsItemsFilters4));
        System.assert(catalogsItemsFilters4.equals(catalogsItemsFilters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemsFilters catalogsItemsFilters1 = OASCatalogsItemsFilters.getExample();
        OASCatalogsItemsFilters catalogsItemsFilters2 = new OASCatalogsItemsFilters();

        System.assertEquals(false, catalogsItemsFilters1.equals('foo'));
        System.assertEquals(false, catalogsItemsFilters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemsFilters catalogsItemsFilters1 = OASCatalogsItemsFilters.getExample();
        OASCatalogsItemsFilters catalogsItemsFilters2 = new OASCatalogsItemsFilters();
        OASCatalogsItemsFilters catalogsItemsFilters3;

        System.assertEquals(false, catalogsItemsFilters1.equals(catalogsItemsFilters3));
        System.assertEquals(false, catalogsItemsFilters2.equals(catalogsItemsFilters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemsFilters catalogsItemsFilters1 = OASCatalogsItemsFilters.getExample();
        OASCatalogsItemsFilters catalogsItemsFilters2 = new OASCatalogsItemsFilters();

        System.assertEquals(catalogsItemsFilters1.hashCode(), catalogsItemsFilters1.hashCode());
        System.assertEquals(catalogsItemsFilters2.hashCode(), catalogsItemsFilters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemsFilters catalogsItemsFilters1 = OASCatalogsItemsFilters.getExample();
        OASCatalogsItemsFilters catalogsItemsFilters2 = OASCatalogsItemsFilters.getExample();
        OASCatalogsItemsFilters catalogsItemsFilters3 = new OASCatalogsItemsFilters();
        OASCatalogsItemsFilters catalogsItemsFilters4 = new OASCatalogsItemsFilters();

        System.assert(catalogsItemsFilters1.equals(catalogsItemsFilters2));
        System.assert(catalogsItemsFilters3.equals(catalogsItemsFilters4));
        System.assertEquals(catalogsItemsFilters1.hashCode(), catalogsItemsFilters2.hashCode());
        System.assertEquals(catalogsItemsFilters3.hashCode(), catalogsItemsFilters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsItemsFilters catalogsItemsFilters = new OASCatalogsItemsFilters();
        Map<String, String> x-property-mappings = catalogsItemsFilters.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('itemIds', x-property-mappings.get('item_ids'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
        System.assertEquals('hotelIds', x-property-mappings.get('hotel_ids'));
        System.assertEquals('creativeAssetsIds', x-property-mappings.get('creative_assets_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsItemsFilters catalogsItemsFilters = new OASCatalogsItemsFilters();
        System.assertEquals(new List<String>(), catalogsItemsFilters.itemIds);
        System.assertEquals(new List<String>(), catalogsItemsFilters.hotelIds);
        System.assertEquals(new List<String>(), catalogsItemsFilters.creativeAssetsIds);
        System.assertEquals(null, catalogsItemsFilters.catalogType);
        System.assertEquals(null, catalogsItemsFilters.catalogId);
    }
}
