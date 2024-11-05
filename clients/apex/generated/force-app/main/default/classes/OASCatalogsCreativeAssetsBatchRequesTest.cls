@isTest
private class OASCatalogsCreativeAssetsBatchRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest1 = OASCatalogsCreativeAssetsBatchReques.getExample();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest2 = catalogsCreativeAssetsBatchRequest1;
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest3 = new OASCatalogsCreativeAssetsBatchReques();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest4 = catalogsCreativeAssetsBatchRequest3;

        System.assert(catalogsCreativeAssetsBatchRequest1.equals(catalogsCreativeAssetsBatchRequest2));
        System.assert(catalogsCreativeAssetsBatchRequest2.equals(catalogsCreativeAssetsBatchRequest1));
        System.assert(catalogsCreativeAssetsBatchRequest1.equals(catalogsCreativeAssetsBatchRequest1));
        System.assert(catalogsCreativeAssetsBatchRequest3.equals(catalogsCreativeAssetsBatchRequest4));
        System.assert(catalogsCreativeAssetsBatchRequest4.equals(catalogsCreativeAssetsBatchRequest3));
        System.assert(catalogsCreativeAssetsBatchRequest3.equals(catalogsCreativeAssetsBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest1 = OASCatalogsCreativeAssetsBatchReques.getExample();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest2 = OASCatalogsCreativeAssetsBatchReques.getExample();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest3 = new OASCatalogsCreativeAssetsBatchReques();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest4 = new OASCatalogsCreativeAssetsBatchReques();

        System.assert(catalogsCreativeAssetsBatchRequest1.equals(catalogsCreativeAssetsBatchRequest2));
        System.assert(catalogsCreativeAssetsBatchRequest2.equals(catalogsCreativeAssetsBatchRequest1));
        System.assert(catalogsCreativeAssetsBatchRequest3.equals(catalogsCreativeAssetsBatchRequest4));
        System.assert(catalogsCreativeAssetsBatchRequest4.equals(catalogsCreativeAssetsBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest1 = OASCatalogsCreativeAssetsBatchReques.getExample();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest2 = new OASCatalogsCreativeAssetsBatchReques();

        System.assertEquals(false, catalogsCreativeAssetsBatchRequest1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest1 = OASCatalogsCreativeAssetsBatchReques.getExample();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest2 = new OASCatalogsCreativeAssetsBatchReques();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest3;

        System.assertEquals(false, catalogsCreativeAssetsBatchRequest1.equals(catalogsCreativeAssetsBatchRequest3));
        System.assertEquals(false, catalogsCreativeAssetsBatchRequest2.equals(catalogsCreativeAssetsBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest1 = OASCatalogsCreativeAssetsBatchReques.getExample();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest2 = new OASCatalogsCreativeAssetsBatchReques();

        System.assertEquals(catalogsCreativeAssetsBatchRequest1.hashCode(), catalogsCreativeAssetsBatchRequest1.hashCode());
        System.assertEquals(catalogsCreativeAssetsBatchRequest2.hashCode(), catalogsCreativeAssetsBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest1 = OASCatalogsCreativeAssetsBatchReques.getExample();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest2 = OASCatalogsCreativeAssetsBatchReques.getExample();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest3 = new OASCatalogsCreativeAssetsBatchReques();
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest4 = new OASCatalogsCreativeAssetsBatchReques();

        System.assert(catalogsCreativeAssetsBatchRequest1.equals(catalogsCreativeAssetsBatchRequest2));
        System.assert(catalogsCreativeAssetsBatchRequest3.equals(catalogsCreativeAssetsBatchRequest4));
        System.assertEquals(catalogsCreativeAssetsBatchRequest1.hashCode(), catalogsCreativeAssetsBatchRequest2.hashCode());
        System.assertEquals(catalogsCreativeAssetsBatchRequest3.hashCode(), catalogsCreativeAssetsBatchRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest = new OASCatalogsCreativeAssetsBatchReques();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsBatchRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsCreativeAssetsBatchReques catalogsCreativeAssetsBatchRequest = new OASCatalogsCreativeAssetsBatchReques();
        System.assertEquals(new List<OASCatalogsCreativeAssetsBatchItem>(), catalogsCreativeAssetsBatchRequest.items);
        System.assertEquals(null, catalogsCreativeAssetsBatchRequest.catalogType);
        System.assertEquals(null, catalogsCreativeAssetsBatchRequest.country);
        System.assertEquals(null, catalogsCreativeAssetsBatchRequest.language);
        System.assertEquals(null, catalogsCreativeAssetsBatchRequest.catalogId);
    }
}
