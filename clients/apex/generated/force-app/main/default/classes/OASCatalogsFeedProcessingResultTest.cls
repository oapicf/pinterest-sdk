@isTest
private class OASCatalogsFeedProcessingResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult1 = OASCatalogsFeedProcessingResult.getExample();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult2 = catalogsFeedProcessingResult1;
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult3 = new OASCatalogsFeedProcessingResult();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult4 = catalogsFeedProcessingResult3;

        System.assert(catalogsFeedProcessingResult1.equals(catalogsFeedProcessingResult2));
        System.assert(catalogsFeedProcessingResult2.equals(catalogsFeedProcessingResult1));
        System.assert(catalogsFeedProcessingResult1.equals(catalogsFeedProcessingResult1));
        System.assert(catalogsFeedProcessingResult3.equals(catalogsFeedProcessingResult4));
        System.assert(catalogsFeedProcessingResult4.equals(catalogsFeedProcessingResult3));
        System.assert(catalogsFeedProcessingResult3.equals(catalogsFeedProcessingResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult1 = OASCatalogsFeedProcessingResult.getExample();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult2 = OASCatalogsFeedProcessingResult.getExample();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult3 = new OASCatalogsFeedProcessingResult();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult4 = new OASCatalogsFeedProcessingResult();

        System.assert(catalogsFeedProcessingResult1.equals(catalogsFeedProcessingResult2));
        System.assert(catalogsFeedProcessingResult2.equals(catalogsFeedProcessingResult1));
        System.assert(catalogsFeedProcessingResult3.equals(catalogsFeedProcessingResult4));
        System.assert(catalogsFeedProcessingResult4.equals(catalogsFeedProcessingResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult1 = OASCatalogsFeedProcessingResult.getExample();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult2 = new OASCatalogsFeedProcessingResult();

        System.assertEquals(false, catalogsFeedProcessingResult1.equals('foo'));
        System.assertEquals(false, catalogsFeedProcessingResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult1 = OASCatalogsFeedProcessingResult.getExample();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult2 = new OASCatalogsFeedProcessingResult();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult3;

        System.assertEquals(false, catalogsFeedProcessingResult1.equals(catalogsFeedProcessingResult3));
        System.assertEquals(false, catalogsFeedProcessingResult2.equals(catalogsFeedProcessingResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult1 = OASCatalogsFeedProcessingResult.getExample();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult2 = new OASCatalogsFeedProcessingResult();

        System.assertEquals(catalogsFeedProcessingResult1.hashCode(), catalogsFeedProcessingResult1.hashCode());
        System.assertEquals(catalogsFeedProcessingResult2.hashCode(), catalogsFeedProcessingResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult1 = OASCatalogsFeedProcessingResult.getExample();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult2 = OASCatalogsFeedProcessingResult.getExample();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult3 = new OASCatalogsFeedProcessingResult();
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult4 = new OASCatalogsFeedProcessingResult();

        System.assert(catalogsFeedProcessingResult1.equals(catalogsFeedProcessingResult2));
        System.assert(catalogsFeedProcessingResult3.equals(catalogsFeedProcessingResult4));
        System.assertEquals(catalogsFeedProcessingResult1.hashCode(), catalogsFeedProcessingResult2.hashCode());
        System.assertEquals(catalogsFeedProcessingResult3.hashCode(), catalogsFeedProcessingResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedProcessingResult catalogsFeedProcessingResult = new OASCatalogsFeedProcessingResult();
        Map<String, String> x-property-mappings = catalogsFeedProcessingResult.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
        System.assertEquals('ingestionDetails', x-property-mappings.get('ingestion_details'));
        System.assertEquals('productCounts', x-property-mappings.get('product_counts'));
        System.assertEquals('validationDetails', x-property-mappings.get('validation_details'));
    }
}
