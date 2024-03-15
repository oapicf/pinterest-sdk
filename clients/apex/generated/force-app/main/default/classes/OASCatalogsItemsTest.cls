@isTest
private class OASCatalogsItemsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItems catalogsItems1 = OASCatalogsItems.getExample();
        OASCatalogsItems catalogsItems2 = catalogsItems1;
        OASCatalogsItems catalogsItems3 = new OASCatalogsItems();
        OASCatalogsItems catalogsItems4 = catalogsItems3;

        System.assert(catalogsItems1.equals(catalogsItems2));
        System.assert(catalogsItems2.equals(catalogsItems1));
        System.assert(catalogsItems1.equals(catalogsItems1));
        System.assert(catalogsItems3.equals(catalogsItems4));
        System.assert(catalogsItems4.equals(catalogsItems3));
        System.assert(catalogsItems3.equals(catalogsItems3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItems catalogsItems1 = OASCatalogsItems.getExample();
        OASCatalogsItems catalogsItems2 = OASCatalogsItems.getExample();
        OASCatalogsItems catalogsItems3 = new OASCatalogsItems();
        OASCatalogsItems catalogsItems4 = new OASCatalogsItems();

        System.assert(catalogsItems1.equals(catalogsItems2));
        System.assert(catalogsItems2.equals(catalogsItems1));
        System.assert(catalogsItems3.equals(catalogsItems4));
        System.assert(catalogsItems4.equals(catalogsItems3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItems catalogsItems1 = OASCatalogsItems.getExample();
        OASCatalogsItems catalogsItems2 = new OASCatalogsItems();

        System.assertEquals(false, catalogsItems1.equals('foo'));
        System.assertEquals(false, catalogsItems2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItems catalogsItems1 = OASCatalogsItems.getExample();
        OASCatalogsItems catalogsItems2 = new OASCatalogsItems();
        OASCatalogsItems catalogsItems3;

        System.assertEquals(false, catalogsItems1.equals(catalogsItems3));
        System.assertEquals(false, catalogsItems2.equals(catalogsItems3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItems catalogsItems1 = OASCatalogsItems.getExample();
        OASCatalogsItems catalogsItems2 = new OASCatalogsItems();

        System.assertEquals(catalogsItems1.hashCode(), catalogsItems1.hashCode());
        System.assertEquals(catalogsItems2.hashCode(), catalogsItems2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItems catalogsItems1 = OASCatalogsItems.getExample();
        OASCatalogsItems catalogsItems2 = OASCatalogsItems.getExample();
        OASCatalogsItems catalogsItems3 = new OASCatalogsItems();
        OASCatalogsItems catalogsItems4 = new OASCatalogsItems();

        System.assert(catalogsItems1.equals(catalogsItems2));
        System.assert(catalogsItems3.equals(catalogsItems4));
        System.assertEquals(catalogsItems1.hashCode(), catalogsItems2.hashCode());
        System.assertEquals(catalogsItems3.hashCode(), catalogsItems4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsItems catalogsItems = new OASCatalogsItems();
        System.assertEquals(new List<OASItemResponse>(), catalogsItems.items);
    }
}
