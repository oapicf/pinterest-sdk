@isTest
private class OASCatalogsFeedProcessingResultFieldTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields1 = OASCatalogsFeedProcessingResultField.getExample();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields2 = catalogsFeedProcessingResultFields1;
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields3 = new OASCatalogsFeedProcessingResultField();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields4 = catalogsFeedProcessingResultFields3;

        System.assert(catalogsFeedProcessingResultFields1.equals(catalogsFeedProcessingResultFields2));
        System.assert(catalogsFeedProcessingResultFields2.equals(catalogsFeedProcessingResultFields1));
        System.assert(catalogsFeedProcessingResultFields1.equals(catalogsFeedProcessingResultFields1));
        System.assert(catalogsFeedProcessingResultFields3.equals(catalogsFeedProcessingResultFields4));
        System.assert(catalogsFeedProcessingResultFields4.equals(catalogsFeedProcessingResultFields3));
        System.assert(catalogsFeedProcessingResultFields3.equals(catalogsFeedProcessingResultFields3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields1 = OASCatalogsFeedProcessingResultField.getExample();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields2 = OASCatalogsFeedProcessingResultField.getExample();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields3 = new OASCatalogsFeedProcessingResultField();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields4 = new OASCatalogsFeedProcessingResultField();

        System.assert(catalogsFeedProcessingResultFields1.equals(catalogsFeedProcessingResultFields2));
        System.assert(catalogsFeedProcessingResultFields2.equals(catalogsFeedProcessingResultFields1));
        System.assert(catalogsFeedProcessingResultFields3.equals(catalogsFeedProcessingResultFields4));
        System.assert(catalogsFeedProcessingResultFields4.equals(catalogsFeedProcessingResultFields3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields1 = OASCatalogsFeedProcessingResultField.getExample();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields2 = new OASCatalogsFeedProcessingResultField();

        System.assertEquals(false, catalogsFeedProcessingResultFields1.equals('foo'));
        System.assertEquals(false, catalogsFeedProcessingResultFields2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields1 = OASCatalogsFeedProcessingResultField.getExample();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields2 = new OASCatalogsFeedProcessingResultField();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields3;

        System.assertEquals(false, catalogsFeedProcessingResultFields1.equals(catalogsFeedProcessingResultFields3));
        System.assertEquals(false, catalogsFeedProcessingResultFields2.equals(catalogsFeedProcessingResultFields3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields1 = OASCatalogsFeedProcessingResultField.getExample();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields2 = new OASCatalogsFeedProcessingResultField();

        System.assertEquals(catalogsFeedProcessingResultFields1.hashCode(), catalogsFeedProcessingResultFields1.hashCode());
        System.assertEquals(catalogsFeedProcessingResultFields2.hashCode(), catalogsFeedProcessingResultFields2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields1 = OASCatalogsFeedProcessingResultField.getExample();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields2 = OASCatalogsFeedProcessingResultField.getExample();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields3 = new OASCatalogsFeedProcessingResultField();
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields4 = new OASCatalogsFeedProcessingResultField();

        System.assert(catalogsFeedProcessingResultFields1.equals(catalogsFeedProcessingResultFields2));
        System.assert(catalogsFeedProcessingResultFields3.equals(catalogsFeedProcessingResultFields4));
        System.assertEquals(catalogsFeedProcessingResultFields1.hashCode(), catalogsFeedProcessingResultFields2.hashCode());
        System.assertEquals(catalogsFeedProcessingResultFields3.hashCode(), catalogsFeedProcessingResultFields4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedProcessingResultField catalogsFeedProcessingResultFields = new OASCatalogsFeedProcessingResultField();
        Map<String, String> x-property-mappings = catalogsFeedProcessingResultFields.getx-property-mappings();
        System.assertEquals('ingestionDetails', x-property-mappings.get('ingestion_details'));
        System.assertEquals('productCounts', x-property-mappings.get('product_counts'));
        System.assertEquals('validationDetails', x-property-mappings.get('validation_details'));
    }
}
