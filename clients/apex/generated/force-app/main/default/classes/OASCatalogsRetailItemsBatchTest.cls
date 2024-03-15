@isTest
private class OASCatalogsRetailItemsBatchTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch1 = OASCatalogsRetailItemsBatch.getExample();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch2 = catalogsRetailItemsBatch1;
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch3 = new OASCatalogsRetailItemsBatch();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch4 = catalogsRetailItemsBatch3;

        System.assert(catalogsRetailItemsBatch1.equals(catalogsRetailItemsBatch2));
        System.assert(catalogsRetailItemsBatch2.equals(catalogsRetailItemsBatch1));
        System.assert(catalogsRetailItemsBatch1.equals(catalogsRetailItemsBatch1));
        System.assert(catalogsRetailItemsBatch3.equals(catalogsRetailItemsBatch4));
        System.assert(catalogsRetailItemsBatch4.equals(catalogsRetailItemsBatch3));
        System.assert(catalogsRetailItemsBatch3.equals(catalogsRetailItemsBatch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch1 = OASCatalogsRetailItemsBatch.getExample();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch2 = OASCatalogsRetailItemsBatch.getExample();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch3 = new OASCatalogsRetailItemsBatch();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch4 = new OASCatalogsRetailItemsBatch();

        System.assert(catalogsRetailItemsBatch1.equals(catalogsRetailItemsBatch2));
        System.assert(catalogsRetailItemsBatch2.equals(catalogsRetailItemsBatch1));
        System.assert(catalogsRetailItemsBatch3.equals(catalogsRetailItemsBatch4));
        System.assert(catalogsRetailItemsBatch4.equals(catalogsRetailItemsBatch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch1 = OASCatalogsRetailItemsBatch.getExample();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch2 = new OASCatalogsRetailItemsBatch();

        System.assertEquals(false, catalogsRetailItemsBatch1.equals('foo'));
        System.assertEquals(false, catalogsRetailItemsBatch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch1 = OASCatalogsRetailItemsBatch.getExample();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch2 = new OASCatalogsRetailItemsBatch();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch3;

        System.assertEquals(false, catalogsRetailItemsBatch1.equals(catalogsRetailItemsBatch3));
        System.assertEquals(false, catalogsRetailItemsBatch2.equals(catalogsRetailItemsBatch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch1 = OASCatalogsRetailItemsBatch.getExample();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch2 = new OASCatalogsRetailItemsBatch();

        System.assertEquals(catalogsRetailItemsBatch1.hashCode(), catalogsRetailItemsBatch1.hashCode());
        System.assertEquals(catalogsRetailItemsBatch2.hashCode(), catalogsRetailItemsBatch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch1 = OASCatalogsRetailItemsBatch.getExample();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch2 = OASCatalogsRetailItemsBatch.getExample();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch3 = new OASCatalogsRetailItemsBatch();
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch4 = new OASCatalogsRetailItemsBatch();

        System.assert(catalogsRetailItemsBatch1.equals(catalogsRetailItemsBatch2));
        System.assert(catalogsRetailItemsBatch3.equals(catalogsRetailItemsBatch4));
        System.assertEquals(catalogsRetailItemsBatch1.hashCode(), catalogsRetailItemsBatch2.hashCode());
        System.assertEquals(catalogsRetailItemsBatch3.hashCode(), catalogsRetailItemsBatch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch = new OASCatalogsRetailItemsBatch();
        Map<String, String> x-property-mappings = catalogsRetailItemsBatch.getx-property-mappings();
        System.assertEquals('batchId', x-property-mappings.get('batch_id'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('completedTime', x-property-mappings.get('completed_time'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsRetailItemsBatch catalogsRetailItemsBatch = new OASCatalogsRetailItemsBatch();
        System.assertEquals(new List<OASItemProcessingRecord>(), catalogsRetailItemsBatch.items);
        System.assertEquals(null, catalogsRetailItemsBatch.batchId);
        System.assertEquals(null, catalogsRetailItemsBatch.createdTime);
        System.assertEquals(null, catalogsRetailItemsBatch.completedTime);
        System.assertEquals(null, catalogsRetailItemsBatch.status);
        System.assertEquals(null, catalogsRetailItemsBatch.catalogType);
    }
}
