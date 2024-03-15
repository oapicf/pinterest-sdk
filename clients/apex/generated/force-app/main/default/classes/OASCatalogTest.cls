@isTest
private class OASCatalogTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalog catalog1 = OASCatalog.getExample();
        OASCatalog catalog2 = catalog1;
        OASCatalog catalog3 = new OASCatalog();
        OASCatalog catalog4 = catalog3;

        System.assert(catalog1.equals(catalog2));
        System.assert(catalog2.equals(catalog1));
        System.assert(catalog1.equals(catalog1));
        System.assert(catalog3.equals(catalog4));
        System.assert(catalog4.equals(catalog3));
        System.assert(catalog3.equals(catalog3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalog catalog1 = OASCatalog.getExample();
        OASCatalog catalog2 = OASCatalog.getExample();
        OASCatalog catalog3 = new OASCatalog();
        OASCatalog catalog4 = new OASCatalog();

        System.assert(catalog1.equals(catalog2));
        System.assert(catalog2.equals(catalog1));
        System.assert(catalog3.equals(catalog4));
        System.assert(catalog4.equals(catalog3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalog catalog1 = OASCatalog.getExample();
        OASCatalog catalog2 = new OASCatalog();

        System.assertEquals(false, catalog1.equals('foo'));
        System.assertEquals(false, catalog2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalog catalog1 = OASCatalog.getExample();
        OASCatalog catalog2 = new OASCatalog();
        OASCatalog catalog3;

        System.assertEquals(false, catalog1.equals(catalog3));
        System.assertEquals(false, catalog2.equals(catalog3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalog catalog1 = OASCatalog.getExample();
        OASCatalog catalog2 = new OASCatalog();

        System.assertEquals(catalog1.hashCode(), catalog1.hashCode());
        System.assertEquals(catalog2.hashCode(), catalog2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalog catalog1 = OASCatalog.getExample();
        OASCatalog catalog2 = OASCatalog.getExample();
        OASCatalog catalog3 = new OASCatalog();
        OASCatalog catalog4 = new OASCatalog();

        System.assert(catalog1.equals(catalog2));
        System.assert(catalog3.equals(catalog4));
        System.assertEquals(catalog1.hashCode(), catalog2.hashCode());
        System.assertEquals(catalog3.hashCode(), catalog4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalog catalog = new OASCatalog();
        Map<String, String> x-property-mappings = catalog.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
