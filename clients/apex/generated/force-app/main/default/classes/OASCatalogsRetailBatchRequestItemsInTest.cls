@isTest
private class OASCatalogsRetailBatchRequestItemsInTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner1 = OASCatalogsRetailBatchRequestItemsIn.getExample();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner2 = catalogsRetailBatchRequestItemsInner1;
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner3 = new OASCatalogsRetailBatchRequestItemsIn();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner4 = catalogsRetailBatchRequestItemsInner3;

        System.assert(catalogsRetailBatchRequestItemsInner1.equals(catalogsRetailBatchRequestItemsInner2));
        System.assert(catalogsRetailBatchRequestItemsInner2.equals(catalogsRetailBatchRequestItemsInner1));
        System.assert(catalogsRetailBatchRequestItemsInner1.equals(catalogsRetailBatchRequestItemsInner1));
        System.assert(catalogsRetailBatchRequestItemsInner3.equals(catalogsRetailBatchRequestItemsInner4));
        System.assert(catalogsRetailBatchRequestItemsInner4.equals(catalogsRetailBatchRequestItemsInner3));
        System.assert(catalogsRetailBatchRequestItemsInner3.equals(catalogsRetailBatchRequestItemsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner1 = OASCatalogsRetailBatchRequestItemsIn.getExample();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner2 = OASCatalogsRetailBatchRequestItemsIn.getExample();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner3 = new OASCatalogsRetailBatchRequestItemsIn();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner4 = new OASCatalogsRetailBatchRequestItemsIn();

        System.assert(catalogsRetailBatchRequestItemsInner1.equals(catalogsRetailBatchRequestItemsInner2));
        System.assert(catalogsRetailBatchRequestItemsInner2.equals(catalogsRetailBatchRequestItemsInner1));
        System.assert(catalogsRetailBatchRequestItemsInner3.equals(catalogsRetailBatchRequestItemsInner4));
        System.assert(catalogsRetailBatchRequestItemsInner4.equals(catalogsRetailBatchRequestItemsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner1 = OASCatalogsRetailBatchRequestItemsIn.getExample();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner2 = new OASCatalogsRetailBatchRequestItemsIn();

        System.assertEquals(false, catalogsRetailBatchRequestItemsInner1.equals('foo'));
        System.assertEquals(false, catalogsRetailBatchRequestItemsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner1 = OASCatalogsRetailBatchRequestItemsIn.getExample();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner2 = new OASCatalogsRetailBatchRequestItemsIn();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner3;

        System.assertEquals(false, catalogsRetailBatchRequestItemsInner1.equals(catalogsRetailBatchRequestItemsInner3));
        System.assertEquals(false, catalogsRetailBatchRequestItemsInner2.equals(catalogsRetailBatchRequestItemsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner1 = OASCatalogsRetailBatchRequestItemsIn.getExample();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner2 = new OASCatalogsRetailBatchRequestItemsIn();

        System.assertEquals(catalogsRetailBatchRequestItemsInner1.hashCode(), catalogsRetailBatchRequestItemsInner1.hashCode());
        System.assertEquals(catalogsRetailBatchRequestItemsInner2.hashCode(), catalogsRetailBatchRequestItemsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner1 = OASCatalogsRetailBatchRequestItemsIn.getExample();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner2 = OASCatalogsRetailBatchRequestItemsIn.getExample();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner3 = new OASCatalogsRetailBatchRequestItemsIn();
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner4 = new OASCatalogsRetailBatchRequestItemsIn();

        System.assert(catalogsRetailBatchRequestItemsInner1.equals(catalogsRetailBatchRequestItemsInner2));
        System.assert(catalogsRetailBatchRequestItemsInner3.equals(catalogsRetailBatchRequestItemsInner4));
        System.assertEquals(catalogsRetailBatchRequestItemsInner1.hashCode(), catalogsRetailBatchRequestItemsInner2.hashCode());
        System.assertEquals(catalogsRetailBatchRequestItemsInner3.hashCode(), catalogsRetailBatchRequestItemsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner = new OASCatalogsRetailBatchRequestItemsIn();
        Map<String, String> x-property-mappings = catalogsRetailBatchRequestItemsInner.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('updateMask', x-property-mappings.get('update_mask'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner = new OASCatalogsRetailBatchRequestItemsIn();
        System.assertEquals(new List<OASUpdateMaskFieldType>(), catalogsRetailBatchRequestItemsInner.updateMask);
        System.assertEquals(null, catalogsRetailBatchRequestItemsInner.itemId);
        System.assertEquals(null, catalogsRetailBatchRequestItemsInner.operation);
        System.assertEquals(null, catalogsRetailBatchRequestItemsInner.attributes);
    }
}
