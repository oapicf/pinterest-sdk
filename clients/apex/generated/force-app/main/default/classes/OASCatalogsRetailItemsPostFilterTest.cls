@isTest
private class OASCatalogsRetailItemsPostFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter1 = OASCatalogsRetailItemsPostFilter.getExample();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter2 = catalogsRetailItemsPostFilter1;
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter3 = new OASCatalogsRetailItemsPostFilter();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter4 = catalogsRetailItemsPostFilter3;

        System.assert(catalogsRetailItemsPostFilter1.equals(catalogsRetailItemsPostFilter2));
        System.assert(catalogsRetailItemsPostFilter2.equals(catalogsRetailItemsPostFilter1));
        System.assert(catalogsRetailItemsPostFilter1.equals(catalogsRetailItemsPostFilter1));
        System.assert(catalogsRetailItemsPostFilter3.equals(catalogsRetailItemsPostFilter4));
        System.assert(catalogsRetailItemsPostFilter4.equals(catalogsRetailItemsPostFilter3));
        System.assert(catalogsRetailItemsPostFilter3.equals(catalogsRetailItemsPostFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter1 = OASCatalogsRetailItemsPostFilter.getExample();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter2 = OASCatalogsRetailItemsPostFilter.getExample();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter3 = new OASCatalogsRetailItemsPostFilter();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter4 = new OASCatalogsRetailItemsPostFilter();

        System.assert(catalogsRetailItemsPostFilter1.equals(catalogsRetailItemsPostFilter2));
        System.assert(catalogsRetailItemsPostFilter2.equals(catalogsRetailItemsPostFilter1));
        System.assert(catalogsRetailItemsPostFilter3.equals(catalogsRetailItemsPostFilter4));
        System.assert(catalogsRetailItemsPostFilter4.equals(catalogsRetailItemsPostFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter1 = OASCatalogsRetailItemsPostFilter.getExample();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter2 = new OASCatalogsRetailItemsPostFilter();

        System.assertEquals(false, catalogsRetailItemsPostFilter1.equals('foo'));
        System.assertEquals(false, catalogsRetailItemsPostFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter1 = OASCatalogsRetailItemsPostFilter.getExample();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter2 = new OASCatalogsRetailItemsPostFilter();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter3;

        System.assertEquals(false, catalogsRetailItemsPostFilter1.equals(catalogsRetailItemsPostFilter3));
        System.assertEquals(false, catalogsRetailItemsPostFilter2.equals(catalogsRetailItemsPostFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter1 = OASCatalogsRetailItemsPostFilter.getExample();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter2 = new OASCatalogsRetailItemsPostFilter();

        System.assertEquals(catalogsRetailItemsPostFilter1.hashCode(), catalogsRetailItemsPostFilter1.hashCode());
        System.assertEquals(catalogsRetailItemsPostFilter2.hashCode(), catalogsRetailItemsPostFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter1 = OASCatalogsRetailItemsPostFilter.getExample();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter2 = OASCatalogsRetailItemsPostFilter.getExample();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter3 = new OASCatalogsRetailItemsPostFilter();
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter4 = new OASCatalogsRetailItemsPostFilter();

        System.assert(catalogsRetailItemsPostFilter1.equals(catalogsRetailItemsPostFilter2));
        System.assert(catalogsRetailItemsPostFilter3.equals(catalogsRetailItemsPostFilter4));
        System.assertEquals(catalogsRetailItemsPostFilter1.hashCode(), catalogsRetailItemsPostFilter2.hashCode());
        System.assertEquals(catalogsRetailItemsPostFilter3.hashCode(), catalogsRetailItemsPostFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter = new OASCatalogsRetailItemsPostFilter();
        Map<String, String> x-property-mappings = catalogsRetailItemsPostFilter.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('itemIds', x-property-mappings.get('item_ids'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter = new OASCatalogsRetailItemsPostFilter();
        System.assertEquals(new List<String>(), catalogsRetailItemsPostFilter.itemIds);
        System.assertEquals(null, catalogsRetailItemsPostFilter.catalogType);
        System.assertEquals(null, catalogsRetailItemsPostFilter.catalogId);
    }
}
