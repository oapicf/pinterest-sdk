@isTest
private class OASCatalogsDeleteRetailItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem1 = OASCatalogsDeleteRetailItem.getExample();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem2 = catalogsDeleteRetailItem1;
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem3 = new OASCatalogsDeleteRetailItem();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem4 = catalogsDeleteRetailItem3;

        System.assert(catalogsDeleteRetailItem1.equals(catalogsDeleteRetailItem2));
        System.assert(catalogsDeleteRetailItem2.equals(catalogsDeleteRetailItem1));
        System.assert(catalogsDeleteRetailItem1.equals(catalogsDeleteRetailItem1));
        System.assert(catalogsDeleteRetailItem3.equals(catalogsDeleteRetailItem4));
        System.assert(catalogsDeleteRetailItem4.equals(catalogsDeleteRetailItem3));
        System.assert(catalogsDeleteRetailItem3.equals(catalogsDeleteRetailItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem1 = OASCatalogsDeleteRetailItem.getExample();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem2 = OASCatalogsDeleteRetailItem.getExample();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem3 = new OASCatalogsDeleteRetailItem();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem4 = new OASCatalogsDeleteRetailItem();

        System.assert(catalogsDeleteRetailItem1.equals(catalogsDeleteRetailItem2));
        System.assert(catalogsDeleteRetailItem2.equals(catalogsDeleteRetailItem1));
        System.assert(catalogsDeleteRetailItem3.equals(catalogsDeleteRetailItem4));
        System.assert(catalogsDeleteRetailItem4.equals(catalogsDeleteRetailItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem1 = OASCatalogsDeleteRetailItem.getExample();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem2 = new OASCatalogsDeleteRetailItem();

        System.assertEquals(false, catalogsDeleteRetailItem1.equals('foo'));
        System.assertEquals(false, catalogsDeleteRetailItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem1 = OASCatalogsDeleteRetailItem.getExample();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem2 = new OASCatalogsDeleteRetailItem();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem3;

        System.assertEquals(false, catalogsDeleteRetailItem1.equals(catalogsDeleteRetailItem3));
        System.assertEquals(false, catalogsDeleteRetailItem2.equals(catalogsDeleteRetailItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem1 = OASCatalogsDeleteRetailItem.getExample();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem2 = new OASCatalogsDeleteRetailItem();

        System.assertEquals(catalogsDeleteRetailItem1.hashCode(), catalogsDeleteRetailItem1.hashCode());
        System.assertEquals(catalogsDeleteRetailItem2.hashCode(), catalogsDeleteRetailItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem1 = OASCatalogsDeleteRetailItem.getExample();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem2 = OASCatalogsDeleteRetailItem.getExample();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem3 = new OASCatalogsDeleteRetailItem();
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem4 = new OASCatalogsDeleteRetailItem();

        System.assert(catalogsDeleteRetailItem1.equals(catalogsDeleteRetailItem2));
        System.assert(catalogsDeleteRetailItem3.equals(catalogsDeleteRetailItem4));
        System.assertEquals(catalogsDeleteRetailItem1.hashCode(), catalogsDeleteRetailItem2.hashCode());
        System.assertEquals(catalogsDeleteRetailItem3.hashCode(), catalogsDeleteRetailItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsDeleteRetailItem catalogsDeleteRetailItem = new OASCatalogsDeleteRetailItem();
        Map<String, String> x-property-mappings = catalogsDeleteRetailItem.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
