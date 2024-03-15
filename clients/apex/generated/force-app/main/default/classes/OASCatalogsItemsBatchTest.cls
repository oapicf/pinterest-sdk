@isTest
private class OASCatalogsItemsBatchTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemsBatch catalogsItemsBatch1 = OASCatalogsItemsBatch.getExample();
        OASCatalogsItemsBatch catalogsItemsBatch2 = catalogsItemsBatch1;
        OASCatalogsItemsBatch catalogsItemsBatch3 = new OASCatalogsItemsBatch();
        OASCatalogsItemsBatch catalogsItemsBatch4 = catalogsItemsBatch3;

        System.assert(catalogsItemsBatch1.equals(catalogsItemsBatch2));
        System.assert(catalogsItemsBatch2.equals(catalogsItemsBatch1));
        System.assert(catalogsItemsBatch1.equals(catalogsItemsBatch1));
        System.assert(catalogsItemsBatch3.equals(catalogsItemsBatch4));
        System.assert(catalogsItemsBatch4.equals(catalogsItemsBatch3));
        System.assert(catalogsItemsBatch3.equals(catalogsItemsBatch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemsBatch catalogsItemsBatch1 = OASCatalogsItemsBatch.getExample();
        OASCatalogsItemsBatch catalogsItemsBatch2 = OASCatalogsItemsBatch.getExample();
        OASCatalogsItemsBatch catalogsItemsBatch3 = new OASCatalogsItemsBatch();
        OASCatalogsItemsBatch catalogsItemsBatch4 = new OASCatalogsItemsBatch();

        System.assert(catalogsItemsBatch1.equals(catalogsItemsBatch2));
        System.assert(catalogsItemsBatch2.equals(catalogsItemsBatch1));
        System.assert(catalogsItemsBatch3.equals(catalogsItemsBatch4));
        System.assert(catalogsItemsBatch4.equals(catalogsItemsBatch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemsBatch catalogsItemsBatch1 = OASCatalogsItemsBatch.getExample();
        OASCatalogsItemsBatch catalogsItemsBatch2 = new OASCatalogsItemsBatch();

        System.assertEquals(false, catalogsItemsBatch1.equals('foo'));
        System.assertEquals(false, catalogsItemsBatch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemsBatch catalogsItemsBatch1 = OASCatalogsItemsBatch.getExample();
        OASCatalogsItemsBatch catalogsItemsBatch2 = new OASCatalogsItemsBatch();
        OASCatalogsItemsBatch catalogsItemsBatch3;

        System.assertEquals(false, catalogsItemsBatch1.equals(catalogsItemsBatch3));
        System.assertEquals(false, catalogsItemsBatch2.equals(catalogsItemsBatch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemsBatch catalogsItemsBatch1 = OASCatalogsItemsBatch.getExample();
        OASCatalogsItemsBatch catalogsItemsBatch2 = new OASCatalogsItemsBatch();

        System.assertEquals(catalogsItemsBatch1.hashCode(), catalogsItemsBatch1.hashCode());
        System.assertEquals(catalogsItemsBatch2.hashCode(), catalogsItemsBatch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemsBatch catalogsItemsBatch1 = OASCatalogsItemsBatch.getExample();
        OASCatalogsItemsBatch catalogsItemsBatch2 = OASCatalogsItemsBatch.getExample();
        OASCatalogsItemsBatch catalogsItemsBatch3 = new OASCatalogsItemsBatch();
        OASCatalogsItemsBatch catalogsItemsBatch4 = new OASCatalogsItemsBatch();

        System.assert(catalogsItemsBatch1.equals(catalogsItemsBatch2));
        System.assert(catalogsItemsBatch3.equals(catalogsItemsBatch4));
        System.assertEquals(catalogsItemsBatch1.hashCode(), catalogsItemsBatch2.hashCode());
        System.assertEquals(catalogsItemsBatch3.hashCode(), catalogsItemsBatch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsItemsBatch catalogsItemsBatch = new OASCatalogsItemsBatch();
        Map<String, String> x-property-mappings = catalogsItemsBatch.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('batchId', x-property-mappings.get('batch_id'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('completedTime', x-property-mappings.get('completed_time'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsItemsBatch catalogsItemsBatch = new OASCatalogsItemsBatch();
        System.assertEquals(new List<OASHotelProcessingRecord>(), catalogsItemsBatch.items);
        System.assertEquals(null, catalogsItemsBatch.catalogType);
        System.assertEquals(null, catalogsItemsBatch.batchId);
        System.assertEquals(null, catalogsItemsBatch.createdTime);
        System.assertEquals(null, catalogsItemsBatch.completedTime);
        System.assertEquals(null, catalogsItemsBatch.status);
    }
}
