@isTest
private class OASCatalogsUpsertRetailItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem1 = OASCatalogsUpsertRetailItem.getExample();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem2 = catalogsUpsertRetailItem1;
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem3 = new OASCatalogsUpsertRetailItem();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem4 = catalogsUpsertRetailItem3;

        System.assert(catalogsUpsertRetailItem1.equals(catalogsUpsertRetailItem2));
        System.assert(catalogsUpsertRetailItem2.equals(catalogsUpsertRetailItem1));
        System.assert(catalogsUpsertRetailItem1.equals(catalogsUpsertRetailItem1));
        System.assert(catalogsUpsertRetailItem3.equals(catalogsUpsertRetailItem4));
        System.assert(catalogsUpsertRetailItem4.equals(catalogsUpsertRetailItem3));
        System.assert(catalogsUpsertRetailItem3.equals(catalogsUpsertRetailItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem1 = OASCatalogsUpsertRetailItem.getExample();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem2 = OASCatalogsUpsertRetailItem.getExample();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem3 = new OASCatalogsUpsertRetailItem();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem4 = new OASCatalogsUpsertRetailItem();

        System.assert(catalogsUpsertRetailItem1.equals(catalogsUpsertRetailItem2));
        System.assert(catalogsUpsertRetailItem2.equals(catalogsUpsertRetailItem1));
        System.assert(catalogsUpsertRetailItem3.equals(catalogsUpsertRetailItem4));
        System.assert(catalogsUpsertRetailItem4.equals(catalogsUpsertRetailItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem1 = OASCatalogsUpsertRetailItem.getExample();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem2 = new OASCatalogsUpsertRetailItem();

        System.assertEquals(false, catalogsUpsertRetailItem1.equals('foo'));
        System.assertEquals(false, catalogsUpsertRetailItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem1 = OASCatalogsUpsertRetailItem.getExample();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem2 = new OASCatalogsUpsertRetailItem();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem3;

        System.assertEquals(false, catalogsUpsertRetailItem1.equals(catalogsUpsertRetailItem3));
        System.assertEquals(false, catalogsUpsertRetailItem2.equals(catalogsUpsertRetailItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem1 = OASCatalogsUpsertRetailItem.getExample();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem2 = new OASCatalogsUpsertRetailItem();

        System.assertEquals(catalogsUpsertRetailItem1.hashCode(), catalogsUpsertRetailItem1.hashCode());
        System.assertEquals(catalogsUpsertRetailItem2.hashCode(), catalogsUpsertRetailItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem1 = OASCatalogsUpsertRetailItem.getExample();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem2 = OASCatalogsUpsertRetailItem.getExample();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem3 = new OASCatalogsUpsertRetailItem();
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem4 = new OASCatalogsUpsertRetailItem();

        System.assert(catalogsUpsertRetailItem1.equals(catalogsUpsertRetailItem2));
        System.assert(catalogsUpsertRetailItem3.equals(catalogsUpsertRetailItem4));
        System.assertEquals(catalogsUpsertRetailItem1.hashCode(), catalogsUpsertRetailItem2.hashCode());
        System.assertEquals(catalogsUpsertRetailItem3.hashCode(), catalogsUpsertRetailItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsUpsertRetailItem catalogsUpsertRetailItem = new OASCatalogsUpsertRetailItem();
        Map<String, String> x-property-mappings = catalogsUpsertRetailItem.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
