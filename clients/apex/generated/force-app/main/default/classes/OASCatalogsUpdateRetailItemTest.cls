@isTest
private class OASCatalogsUpdateRetailItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem1 = OASCatalogsUpdateRetailItem.getExample();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem2 = catalogsUpdateRetailItem1;
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem3 = new OASCatalogsUpdateRetailItem();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem4 = catalogsUpdateRetailItem3;

        System.assert(catalogsUpdateRetailItem1.equals(catalogsUpdateRetailItem2));
        System.assert(catalogsUpdateRetailItem2.equals(catalogsUpdateRetailItem1));
        System.assert(catalogsUpdateRetailItem1.equals(catalogsUpdateRetailItem1));
        System.assert(catalogsUpdateRetailItem3.equals(catalogsUpdateRetailItem4));
        System.assert(catalogsUpdateRetailItem4.equals(catalogsUpdateRetailItem3));
        System.assert(catalogsUpdateRetailItem3.equals(catalogsUpdateRetailItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem1 = OASCatalogsUpdateRetailItem.getExample();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem2 = OASCatalogsUpdateRetailItem.getExample();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem3 = new OASCatalogsUpdateRetailItem();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem4 = new OASCatalogsUpdateRetailItem();

        System.assert(catalogsUpdateRetailItem1.equals(catalogsUpdateRetailItem2));
        System.assert(catalogsUpdateRetailItem2.equals(catalogsUpdateRetailItem1));
        System.assert(catalogsUpdateRetailItem3.equals(catalogsUpdateRetailItem4));
        System.assert(catalogsUpdateRetailItem4.equals(catalogsUpdateRetailItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem1 = OASCatalogsUpdateRetailItem.getExample();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem2 = new OASCatalogsUpdateRetailItem();

        System.assertEquals(false, catalogsUpdateRetailItem1.equals('foo'));
        System.assertEquals(false, catalogsUpdateRetailItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem1 = OASCatalogsUpdateRetailItem.getExample();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem2 = new OASCatalogsUpdateRetailItem();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem3;

        System.assertEquals(false, catalogsUpdateRetailItem1.equals(catalogsUpdateRetailItem3));
        System.assertEquals(false, catalogsUpdateRetailItem2.equals(catalogsUpdateRetailItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem1 = OASCatalogsUpdateRetailItem.getExample();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem2 = new OASCatalogsUpdateRetailItem();

        System.assertEquals(catalogsUpdateRetailItem1.hashCode(), catalogsUpdateRetailItem1.hashCode());
        System.assertEquals(catalogsUpdateRetailItem2.hashCode(), catalogsUpdateRetailItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem1 = OASCatalogsUpdateRetailItem.getExample();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem2 = OASCatalogsUpdateRetailItem.getExample();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem3 = new OASCatalogsUpdateRetailItem();
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem4 = new OASCatalogsUpdateRetailItem();

        System.assert(catalogsUpdateRetailItem1.equals(catalogsUpdateRetailItem2));
        System.assert(catalogsUpdateRetailItem3.equals(catalogsUpdateRetailItem4));
        System.assertEquals(catalogsUpdateRetailItem1.hashCode(), catalogsUpdateRetailItem2.hashCode());
        System.assertEquals(catalogsUpdateRetailItem3.hashCode(), catalogsUpdateRetailItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem = new OASCatalogsUpdateRetailItem();
        Map<String, String> x-property-mappings = catalogsUpdateRetailItem.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('updateMask', x-property-mappings.get('update_mask'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem = new OASCatalogsUpdateRetailItem();
        System.assertEquals(new List<OASUpdateMaskFieldType>(), catalogsUpdateRetailItem.updateMask);
        System.assertEquals(null, catalogsUpdateRetailItem.itemId);
        System.assertEquals(null, catalogsUpdateRetailItem.operation);
        System.assertEquals(null, catalogsUpdateRetailItem.attributes);
    }
}
