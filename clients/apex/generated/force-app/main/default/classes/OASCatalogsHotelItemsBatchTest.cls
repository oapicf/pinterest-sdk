@isTest
private class OASCatalogsHotelItemsBatchTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch1 = OASCatalogsHotelItemsBatch.getExample();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch2 = catalogsHotelItemsBatch1;
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch3 = new OASCatalogsHotelItemsBatch();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch4 = catalogsHotelItemsBatch3;

        System.assert(catalogsHotelItemsBatch1.equals(catalogsHotelItemsBatch2));
        System.assert(catalogsHotelItemsBatch2.equals(catalogsHotelItemsBatch1));
        System.assert(catalogsHotelItemsBatch1.equals(catalogsHotelItemsBatch1));
        System.assert(catalogsHotelItemsBatch3.equals(catalogsHotelItemsBatch4));
        System.assert(catalogsHotelItemsBatch4.equals(catalogsHotelItemsBatch3));
        System.assert(catalogsHotelItemsBatch3.equals(catalogsHotelItemsBatch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch1 = OASCatalogsHotelItemsBatch.getExample();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch2 = OASCatalogsHotelItemsBatch.getExample();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch3 = new OASCatalogsHotelItemsBatch();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch4 = new OASCatalogsHotelItemsBatch();

        System.assert(catalogsHotelItemsBatch1.equals(catalogsHotelItemsBatch2));
        System.assert(catalogsHotelItemsBatch2.equals(catalogsHotelItemsBatch1));
        System.assert(catalogsHotelItemsBatch3.equals(catalogsHotelItemsBatch4));
        System.assert(catalogsHotelItemsBatch4.equals(catalogsHotelItemsBatch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch1 = OASCatalogsHotelItemsBatch.getExample();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch2 = new OASCatalogsHotelItemsBatch();

        System.assertEquals(false, catalogsHotelItemsBatch1.equals('foo'));
        System.assertEquals(false, catalogsHotelItemsBatch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch1 = OASCatalogsHotelItemsBatch.getExample();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch2 = new OASCatalogsHotelItemsBatch();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch3;

        System.assertEquals(false, catalogsHotelItemsBatch1.equals(catalogsHotelItemsBatch3));
        System.assertEquals(false, catalogsHotelItemsBatch2.equals(catalogsHotelItemsBatch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch1 = OASCatalogsHotelItemsBatch.getExample();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch2 = new OASCatalogsHotelItemsBatch();

        System.assertEquals(catalogsHotelItemsBatch1.hashCode(), catalogsHotelItemsBatch1.hashCode());
        System.assertEquals(catalogsHotelItemsBatch2.hashCode(), catalogsHotelItemsBatch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch1 = OASCatalogsHotelItemsBatch.getExample();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch2 = OASCatalogsHotelItemsBatch.getExample();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch3 = new OASCatalogsHotelItemsBatch();
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch4 = new OASCatalogsHotelItemsBatch();

        System.assert(catalogsHotelItemsBatch1.equals(catalogsHotelItemsBatch2));
        System.assert(catalogsHotelItemsBatch3.equals(catalogsHotelItemsBatch4));
        System.assertEquals(catalogsHotelItemsBatch1.hashCode(), catalogsHotelItemsBatch2.hashCode());
        System.assertEquals(catalogsHotelItemsBatch3.hashCode(), catalogsHotelItemsBatch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch = new OASCatalogsHotelItemsBatch();
        Map<String, String> x-property-mappings = catalogsHotelItemsBatch.getx-property-mappings();
        System.assertEquals('batchId', x-property-mappings.get('batch_id'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('completedTime', x-property-mappings.get('completed_time'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsHotelItemsBatch catalogsHotelItemsBatch = new OASCatalogsHotelItemsBatch();
        System.assertEquals(new List<OASHotelProcessingRecord>(), catalogsHotelItemsBatch.items);
        System.assertEquals(null, catalogsHotelItemsBatch.batchId);
        System.assertEquals(null, catalogsHotelItemsBatch.createdTime);
        System.assertEquals(null, catalogsHotelItemsBatch.completedTime);
        System.assertEquals(null, catalogsHotelItemsBatch.status);
        System.assertEquals(null, catalogsHotelItemsBatch.catalogType);
    }
}
