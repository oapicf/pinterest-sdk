@isTest
private class OASCatalogsFeedIngestionTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedIngestion catalogsFeedIngestion1 = OASCatalogsFeedIngestion.getExample();
        OASCatalogsFeedIngestion catalogsFeedIngestion2 = catalogsFeedIngestion1;
        OASCatalogsFeedIngestion catalogsFeedIngestion3 = new OASCatalogsFeedIngestion();
        OASCatalogsFeedIngestion catalogsFeedIngestion4 = catalogsFeedIngestion3;

        System.assert(catalogsFeedIngestion1.equals(catalogsFeedIngestion2));
        System.assert(catalogsFeedIngestion2.equals(catalogsFeedIngestion1));
        System.assert(catalogsFeedIngestion1.equals(catalogsFeedIngestion1));
        System.assert(catalogsFeedIngestion3.equals(catalogsFeedIngestion4));
        System.assert(catalogsFeedIngestion4.equals(catalogsFeedIngestion3));
        System.assert(catalogsFeedIngestion3.equals(catalogsFeedIngestion3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedIngestion catalogsFeedIngestion1 = OASCatalogsFeedIngestion.getExample();
        OASCatalogsFeedIngestion catalogsFeedIngestion2 = OASCatalogsFeedIngestion.getExample();
        OASCatalogsFeedIngestion catalogsFeedIngestion3 = new OASCatalogsFeedIngestion();
        OASCatalogsFeedIngestion catalogsFeedIngestion4 = new OASCatalogsFeedIngestion();

        System.assert(catalogsFeedIngestion1.equals(catalogsFeedIngestion2));
        System.assert(catalogsFeedIngestion2.equals(catalogsFeedIngestion1));
        System.assert(catalogsFeedIngestion3.equals(catalogsFeedIngestion4));
        System.assert(catalogsFeedIngestion4.equals(catalogsFeedIngestion3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedIngestion catalogsFeedIngestion1 = OASCatalogsFeedIngestion.getExample();
        OASCatalogsFeedIngestion catalogsFeedIngestion2 = new OASCatalogsFeedIngestion();

        System.assertEquals(false, catalogsFeedIngestion1.equals('foo'));
        System.assertEquals(false, catalogsFeedIngestion2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedIngestion catalogsFeedIngestion1 = OASCatalogsFeedIngestion.getExample();
        OASCatalogsFeedIngestion catalogsFeedIngestion2 = new OASCatalogsFeedIngestion();
        OASCatalogsFeedIngestion catalogsFeedIngestion3;

        System.assertEquals(false, catalogsFeedIngestion1.equals(catalogsFeedIngestion3));
        System.assertEquals(false, catalogsFeedIngestion2.equals(catalogsFeedIngestion3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedIngestion catalogsFeedIngestion1 = OASCatalogsFeedIngestion.getExample();
        OASCatalogsFeedIngestion catalogsFeedIngestion2 = new OASCatalogsFeedIngestion();

        System.assertEquals(catalogsFeedIngestion1.hashCode(), catalogsFeedIngestion1.hashCode());
        System.assertEquals(catalogsFeedIngestion2.hashCode(), catalogsFeedIngestion2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedIngestion catalogsFeedIngestion1 = OASCatalogsFeedIngestion.getExample();
        OASCatalogsFeedIngestion catalogsFeedIngestion2 = OASCatalogsFeedIngestion.getExample();
        OASCatalogsFeedIngestion catalogsFeedIngestion3 = new OASCatalogsFeedIngestion();
        OASCatalogsFeedIngestion catalogsFeedIngestion4 = new OASCatalogsFeedIngestion();

        System.assert(catalogsFeedIngestion1.equals(catalogsFeedIngestion2));
        System.assert(catalogsFeedIngestion3.equals(catalogsFeedIngestion4));
        System.assertEquals(catalogsFeedIngestion1.hashCode(), catalogsFeedIngestion2.hashCode());
        System.assertEquals(catalogsFeedIngestion3.hashCode(), catalogsFeedIngestion4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedIngestion catalogsFeedIngestion = new OASCatalogsFeedIngestion();
        Map<String, String> x-property-mappings = catalogsFeedIngestion.getx-property-mappings();
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
    }
}
