@isTest
private class OASCatalogsRetailItemsFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter1 = OASCatalogsRetailItemsFilter.getExample();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter2 = catalogsRetailItemsFilter1;
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter3 = new OASCatalogsRetailItemsFilter();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter4 = catalogsRetailItemsFilter3;

        System.assert(catalogsRetailItemsFilter1.equals(catalogsRetailItemsFilter2));
        System.assert(catalogsRetailItemsFilter2.equals(catalogsRetailItemsFilter1));
        System.assert(catalogsRetailItemsFilter1.equals(catalogsRetailItemsFilter1));
        System.assert(catalogsRetailItemsFilter3.equals(catalogsRetailItemsFilter4));
        System.assert(catalogsRetailItemsFilter4.equals(catalogsRetailItemsFilter3));
        System.assert(catalogsRetailItemsFilter3.equals(catalogsRetailItemsFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter1 = OASCatalogsRetailItemsFilter.getExample();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter2 = OASCatalogsRetailItemsFilter.getExample();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter3 = new OASCatalogsRetailItemsFilter();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter4 = new OASCatalogsRetailItemsFilter();

        System.assert(catalogsRetailItemsFilter1.equals(catalogsRetailItemsFilter2));
        System.assert(catalogsRetailItemsFilter2.equals(catalogsRetailItemsFilter1));
        System.assert(catalogsRetailItemsFilter3.equals(catalogsRetailItemsFilter4));
        System.assert(catalogsRetailItemsFilter4.equals(catalogsRetailItemsFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter1 = OASCatalogsRetailItemsFilter.getExample();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter2 = new OASCatalogsRetailItemsFilter();

        System.assertEquals(false, catalogsRetailItemsFilter1.equals('foo'));
        System.assertEquals(false, catalogsRetailItemsFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter1 = OASCatalogsRetailItemsFilter.getExample();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter2 = new OASCatalogsRetailItemsFilter();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter3;

        System.assertEquals(false, catalogsRetailItemsFilter1.equals(catalogsRetailItemsFilter3));
        System.assertEquals(false, catalogsRetailItemsFilter2.equals(catalogsRetailItemsFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter1 = OASCatalogsRetailItemsFilter.getExample();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter2 = new OASCatalogsRetailItemsFilter();

        System.assertEquals(catalogsRetailItemsFilter1.hashCode(), catalogsRetailItemsFilter1.hashCode());
        System.assertEquals(catalogsRetailItemsFilter2.hashCode(), catalogsRetailItemsFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter1 = OASCatalogsRetailItemsFilter.getExample();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter2 = OASCatalogsRetailItemsFilter.getExample();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter3 = new OASCatalogsRetailItemsFilter();
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter4 = new OASCatalogsRetailItemsFilter();

        System.assert(catalogsRetailItemsFilter1.equals(catalogsRetailItemsFilter2));
        System.assert(catalogsRetailItemsFilter3.equals(catalogsRetailItemsFilter4));
        System.assertEquals(catalogsRetailItemsFilter1.hashCode(), catalogsRetailItemsFilter2.hashCode());
        System.assertEquals(catalogsRetailItemsFilter3.hashCode(), catalogsRetailItemsFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter = new OASCatalogsRetailItemsFilter();
        Map<String, String> x-property-mappings = catalogsRetailItemsFilter.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('itemIds', x-property-mappings.get('item_ids'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsRetailItemsFilter catalogsRetailItemsFilter = new OASCatalogsRetailItemsFilter();
        System.assertEquals(new List<String>(), catalogsRetailItemsFilter.itemIds);
        System.assertEquals(null, catalogsRetailItemsFilter.catalogType);
        System.assertEquals(null, catalogsRetailItemsFilter.catalogId);
    }
}
