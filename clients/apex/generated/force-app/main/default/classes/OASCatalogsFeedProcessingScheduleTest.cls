@isTest
private class OASCatalogsFeedProcessingScheduleTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule1 = OASCatalogsFeedProcessingSchedule.getExample();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule2 = catalogsFeedProcessingSchedule1;
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule3 = new OASCatalogsFeedProcessingSchedule();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule4 = catalogsFeedProcessingSchedule3;

        System.assert(catalogsFeedProcessingSchedule1.equals(catalogsFeedProcessingSchedule2));
        System.assert(catalogsFeedProcessingSchedule2.equals(catalogsFeedProcessingSchedule1));
        System.assert(catalogsFeedProcessingSchedule1.equals(catalogsFeedProcessingSchedule1));
        System.assert(catalogsFeedProcessingSchedule3.equals(catalogsFeedProcessingSchedule4));
        System.assert(catalogsFeedProcessingSchedule4.equals(catalogsFeedProcessingSchedule3));
        System.assert(catalogsFeedProcessingSchedule3.equals(catalogsFeedProcessingSchedule3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule1 = OASCatalogsFeedProcessingSchedule.getExample();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule2 = OASCatalogsFeedProcessingSchedule.getExample();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule3 = new OASCatalogsFeedProcessingSchedule();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule4 = new OASCatalogsFeedProcessingSchedule();

        System.assert(catalogsFeedProcessingSchedule1.equals(catalogsFeedProcessingSchedule2));
        System.assert(catalogsFeedProcessingSchedule2.equals(catalogsFeedProcessingSchedule1));
        System.assert(catalogsFeedProcessingSchedule3.equals(catalogsFeedProcessingSchedule4));
        System.assert(catalogsFeedProcessingSchedule4.equals(catalogsFeedProcessingSchedule3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule1 = OASCatalogsFeedProcessingSchedule.getExample();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule2 = new OASCatalogsFeedProcessingSchedule();

        System.assertEquals(false, catalogsFeedProcessingSchedule1.equals('foo'));
        System.assertEquals(false, catalogsFeedProcessingSchedule2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule1 = OASCatalogsFeedProcessingSchedule.getExample();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule2 = new OASCatalogsFeedProcessingSchedule();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule3;

        System.assertEquals(false, catalogsFeedProcessingSchedule1.equals(catalogsFeedProcessingSchedule3));
        System.assertEquals(false, catalogsFeedProcessingSchedule2.equals(catalogsFeedProcessingSchedule3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule1 = OASCatalogsFeedProcessingSchedule.getExample();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule2 = new OASCatalogsFeedProcessingSchedule();

        System.assertEquals(catalogsFeedProcessingSchedule1.hashCode(), catalogsFeedProcessingSchedule1.hashCode());
        System.assertEquals(catalogsFeedProcessingSchedule2.hashCode(), catalogsFeedProcessingSchedule2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule1 = OASCatalogsFeedProcessingSchedule.getExample();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule2 = OASCatalogsFeedProcessingSchedule.getExample();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule3 = new OASCatalogsFeedProcessingSchedule();
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule4 = new OASCatalogsFeedProcessingSchedule();

        System.assert(catalogsFeedProcessingSchedule1.equals(catalogsFeedProcessingSchedule2));
        System.assert(catalogsFeedProcessingSchedule3.equals(catalogsFeedProcessingSchedule4));
        System.assertEquals(catalogsFeedProcessingSchedule1.hashCode(), catalogsFeedProcessingSchedule2.hashCode());
        System.assertEquals(catalogsFeedProcessingSchedule3.hashCode(), catalogsFeedProcessingSchedule4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule = new OASCatalogsFeedProcessingSchedule();
        Map<String, String> x-property-mappings = catalogsFeedProcessingSchedule.getx-property-mappings();
        System.assertEquals('r_time', x-property-mappings.get('time'));
    }
}
