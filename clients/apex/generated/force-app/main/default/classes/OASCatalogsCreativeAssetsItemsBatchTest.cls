@isTest
private class OASCatalogsCreativeAssetsItemsBatchTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch1 = OASCatalogsCreativeAssetsItemsBatch.getExample();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch2 = catalogsCreativeAssetsItemsBatch1;
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch3 = new OASCatalogsCreativeAssetsItemsBatch();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch4 = catalogsCreativeAssetsItemsBatch3;

        System.assert(catalogsCreativeAssetsItemsBatch1.equals(catalogsCreativeAssetsItemsBatch2));
        System.assert(catalogsCreativeAssetsItemsBatch2.equals(catalogsCreativeAssetsItemsBatch1));
        System.assert(catalogsCreativeAssetsItemsBatch1.equals(catalogsCreativeAssetsItemsBatch1));
        System.assert(catalogsCreativeAssetsItemsBatch3.equals(catalogsCreativeAssetsItemsBatch4));
        System.assert(catalogsCreativeAssetsItemsBatch4.equals(catalogsCreativeAssetsItemsBatch3));
        System.assert(catalogsCreativeAssetsItemsBatch3.equals(catalogsCreativeAssetsItemsBatch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch1 = OASCatalogsCreativeAssetsItemsBatch.getExample();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch2 = OASCatalogsCreativeAssetsItemsBatch.getExample();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch3 = new OASCatalogsCreativeAssetsItemsBatch();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch4 = new OASCatalogsCreativeAssetsItemsBatch();

        System.assert(catalogsCreativeAssetsItemsBatch1.equals(catalogsCreativeAssetsItemsBatch2));
        System.assert(catalogsCreativeAssetsItemsBatch2.equals(catalogsCreativeAssetsItemsBatch1));
        System.assert(catalogsCreativeAssetsItemsBatch3.equals(catalogsCreativeAssetsItemsBatch4));
        System.assert(catalogsCreativeAssetsItemsBatch4.equals(catalogsCreativeAssetsItemsBatch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch1 = OASCatalogsCreativeAssetsItemsBatch.getExample();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch2 = new OASCatalogsCreativeAssetsItemsBatch();

        System.assertEquals(false, catalogsCreativeAssetsItemsBatch1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsItemsBatch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch1 = OASCatalogsCreativeAssetsItemsBatch.getExample();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch2 = new OASCatalogsCreativeAssetsItemsBatch();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch3;

        System.assertEquals(false, catalogsCreativeAssetsItemsBatch1.equals(catalogsCreativeAssetsItemsBatch3));
        System.assertEquals(false, catalogsCreativeAssetsItemsBatch2.equals(catalogsCreativeAssetsItemsBatch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch1 = OASCatalogsCreativeAssetsItemsBatch.getExample();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch2 = new OASCatalogsCreativeAssetsItemsBatch();

        System.assertEquals(catalogsCreativeAssetsItemsBatch1.hashCode(), catalogsCreativeAssetsItemsBatch1.hashCode());
        System.assertEquals(catalogsCreativeAssetsItemsBatch2.hashCode(), catalogsCreativeAssetsItemsBatch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch1 = OASCatalogsCreativeAssetsItemsBatch.getExample();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch2 = OASCatalogsCreativeAssetsItemsBatch.getExample();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch3 = new OASCatalogsCreativeAssetsItemsBatch();
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch4 = new OASCatalogsCreativeAssetsItemsBatch();

        System.assert(catalogsCreativeAssetsItemsBatch1.equals(catalogsCreativeAssetsItemsBatch2));
        System.assert(catalogsCreativeAssetsItemsBatch3.equals(catalogsCreativeAssetsItemsBatch4));
        System.assertEquals(catalogsCreativeAssetsItemsBatch1.hashCode(), catalogsCreativeAssetsItemsBatch2.hashCode());
        System.assertEquals(catalogsCreativeAssetsItemsBatch3.hashCode(), catalogsCreativeAssetsItemsBatch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch = new OASCatalogsCreativeAssetsItemsBatch();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsItemsBatch.getx-property-mappings();
        System.assertEquals('batchId', x-property-mappings.get('batch_id'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('completedTime', x-property-mappings.get('completed_time'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch = new OASCatalogsCreativeAssetsItemsBatch();
        System.assertEquals(new List<OASCreativeAssetsProcessingRecord>(), catalogsCreativeAssetsItemsBatch.items);
        System.assertEquals(null, catalogsCreativeAssetsItemsBatch.batchId);
        System.assertEquals(null, catalogsCreativeAssetsItemsBatch.createdTime);
        System.assertEquals(null, catalogsCreativeAssetsItemsBatch.completedTime);
        System.assertEquals(null, catalogsCreativeAssetsItemsBatch.status);
        System.assertEquals(null, catalogsCreativeAssetsItemsBatch.catalogType);
    }
}
