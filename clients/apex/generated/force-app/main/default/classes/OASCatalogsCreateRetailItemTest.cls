@isTest
private class OASCatalogsCreateRetailItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreateRetailItem catalogsCreateRetailItem1 = OASCatalogsCreateRetailItem.getExample();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem2 = catalogsCreateRetailItem1;
        OASCatalogsCreateRetailItem catalogsCreateRetailItem3 = new OASCatalogsCreateRetailItem();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem4 = catalogsCreateRetailItem3;

        System.assert(catalogsCreateRetailItem1.equals(catalogsCreateRetailItem2));
        System.assert(catalogsCreateRetailItem2.equals(catalogsCreateRetailItem1));
        System.assert(catalogsCreateRetailItem1.equals(catalogsCreateRetailItem1));
        System.assert(catalogsCreateRetailItem3.equals(catalogsCreateRetailItem4));
        System.assert(catalogsCreateRetailItem4.equals(catalogsCreateRetailItem3));
        System.assert(catalogsCreateRetailItem3.equals(catalogsCreateRetailItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreateRetailItem catalogsCreateRetailItem1 = OASCatalogsCreateRetailItem.getExample();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem2 = OASCatalogsCreateRetailItem.getExample();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem3 = new OASCatalogsCreateRetailItem();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem4 = new OASCatalogsCreateRetailItem();

        System.assert(catalogsCreateRetailItem1.equals(catalogsCreateRetailItem2));
        System.assert(catalogsCreateRetailItem2.equals(catalogsCreateRetailItem1));
        System.assert(catalogsCreateRetailItem3.equals(catalogsCreateRetailItem4));
        System.assert(catalogsCreateRetailItem4.equals(catalogsCreateRetailItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreateRetailItem catalogsCreateRetailItem1 = OASCatalogsCreateRetailItem.getExample();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem2 = new OASCatalogsCreateRetailItem();

        System.assertEquals(false, catalogsCreateRetailItem1.equals('foo'));
        System.assertEquals(false, catalogsCreateRetailItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreateRetailItem catalogsCreateRetailItem1 = OASCatalogsCreateRetailItem.getExample();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem2 = new OASCatalogsCreateRetailItem();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem3;

        System.assertEquals(false, catalogsCreateRetailItem1.equals(catalogsCreateRetailItem3));
        System.assertEquals(false, catalogsCreateRetailItem2.equals(catalogsCreateRetailItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreateRetailItem catalogsCreateRetailItem1 = OASCatalogsCreateRetailItem.getExample();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem2 = new OASCatalogsCreateRetailItem();

        System.assertEquals(catalogsCreateRetailItem1.hashCode(), catalogsCreateRetailItem1.hashCode());
        System.assertEquals(catalogsCreateRetailItem2.hashCode(), catalogsCreateRetailItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreateRetailItem catalogsCreateRetailItem1 = OASCatalogsCreateRetailItem.getExample();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem2 = OASCatalogsCreateRetailItem.getExample();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem3 = new OASCatalogsCreateRetailItem();
        OASCatalogsCreateRetailItem catalogsCreateRetailItem4 = new OASCatalogsCreateRetailItem();

        System.assert(catalogsCreateRetailItem1.equals(catalogsCreateRetailItem2));
        System.assert(catalogsCreateRetailItem3.equals(catalogsCreateRetailItem4));
        System.assertEquals(catalogsCreateRetailItem1.hashCode(), catalogsCreateRetailItem2.hashCode());
        System.assertEquals(catalogsCreateRetailItem3.hashCode(), catalogsCreateRetailItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreateRetailItem catalogsCreateRetailItem = new OASCatalogsCreateRetailItem();
        Map<String, String> x-property-mappings = catalogsCreateRetailItem.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
