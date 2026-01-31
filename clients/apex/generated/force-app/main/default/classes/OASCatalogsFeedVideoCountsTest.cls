@isTest
private class OASCatalogsFeedVideoCountsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts1 = OASCatalogsFeedVideoCounts.getExample();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts2 = catalogsFeedVideoCounts1;
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts3 = new OASCatalogsFeedVideoCounts();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts4 = catalogsFeedVideoCounts3;

        System.assert(catalogsFeedVideoCounts1.equals(catalogsFeedVideoCounts2));
        System.assert(catalogsFeedVideoCounts2.equals(catalogsFeedVideoCounts1));
        System.assert(catalogsFeedVideoCounts1.equals(catalogsFeedVideoCounts1));
        System.assert(catalogsFeedVideoCounts3.equals(catalogsFeedVideoCounts4));
        System.assert(catalogsFeedVideoCounts4.equals(catalogsFeedVideoCounts3));
        System.assert(catalogsFeedVideoCounts3.equals(catalogsFeedVideoCounts3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts1 = OASCatalogsFeedVideoCounts.getExample();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts2 = OASCatalogsFeedVideoCounts.getExample();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts3 = new OASCatalogsFeedVideoCounts();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts4 = new OASCatalogsFeedVideoCounts();

        System.assert(catalogsFeedVideoCounts1.equals(catalogsFeedVideoCounts2));
        System.assert(catalogsFeedVideoCounts2.equals(catalogsFeedVideoCounts1));
        System.assert(catalogsFeedVideoCounts3.equals(catalogsFeedVideoCounts4));
        System.assert(catalogsFeedVideoCounts4.equals(catalogsFeedVideoCounts3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts1 = OASCatalogsFeedVideoCounts.getExample();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts2 = new OASCatalogsFeedVideoCounts();

        System.assertEquals(false, catalogsFeedVideoCounts1.equals('foo'));
        System.assertEquals(false, catalogsFeedVideoCounts2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts1 = OASCatalogsFeedVideoCounts.getExample();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts2 = new OASCatalogsFeedVideoCounts();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts3;

        System.assertEquals(false, catalogsFeedVideoCounts1.equals(catalogsFeedVideoCounts3));
        System.assertEquals(false, catalogsFeedVideoCounts2.equals(catalogsFeedVideoCounts3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts1 = OASCatalogsFeedVideoCounts.getExample();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts2 = new OASCatalogsFeedVideoCounts();

        System.assertEquals(catalogsFeedVideoCounts1.hashCode(), catalogsFeedVideoCounts1.hashCode());
        System.assertEquals(catalogsFeedVideoCounts2.hashCode(), catalogsFeedVideoCounts2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts1 = OASCatalogsFeedVideoCounts.getExample();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts2 = OASCatalogsFeedVideoCounts.getExample();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts3 = new OASCatalogsFeedVideoCounts();
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts4 = new OASCatalogsFeedVideoCounts();

        System.assert(catalogsFeedVideoCounts1.equals(catalogsFeedVideoCounts2));
        System.assert(catalogsFeedVideoCounts3.equals(catalogsFeedVideoCounts4));
        System.assertEquals(catalogsFeedVideoCounts1.hashCode(), catalogsFeedVideoCounts2.hashCode());
        System.assertEquals(catalogsFeedVideoCounts3.hashCode(), catalogsFeedVideoCounts4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedVideoCounts catalogsFeedVideoCounts = new OASCatalogsFeedVideoCounts();
        Map<String, String> x-property-mappings = catalogsFeedVideoCounts.getx-property-mappings();
        System.assertEquals('ingestedVideos', x-property-mappings.get('ingested_videos'));
        System.assertEquals('notIngestedVideos', x-property-mappings.get('not_ingested_videos'));
        System.assertEquals('totalVideos', x-property-mappings.get('total_videos'));
    }
}
