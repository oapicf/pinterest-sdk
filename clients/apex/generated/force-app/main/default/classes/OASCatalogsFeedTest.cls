@isTest
private class OASCatalogsFeedTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeed catalogsFeed1 = OASCatalogsFeed.getExample();
        OASCatalogsFeed catalogsFeed2 = catalogsFeed1;
        OASCatalogsFeed catalogsFeed3 = new OASCatalogsFeed();
        OASCatalogsFeed catalogsFeed4 = catalogsFeed3;

        System.assert(catalogsFeed1.equals(catalogsFeed2));
        System.assert(catalogsFeed2.equals(catalogsFeed1));
        System.assert(catalogsFeed1.equals(catalogsFeed1));
        System.assert(catalogsFeed3.equals(catalogsFeed4));
        System.assert(catalogsFeed4.equals(catalogsFeed3));
        System.assert(catalogsFeed3.equals(catalogsFeed3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeed catalogsFeed1 = OASCatalogsFeed.getExample();
        OASCatalogsFeed catalogsFeed2 = OASCatalogsFeed.getExample();
        OASCatalogsFeed catalogsFeed3 = new OASCatalogsFeed();
        OASCatalogsFeed catalogsFeed4 = new OASCatalogsFeed();

        System.assert(catalogsFeed1.equals(catalogsFeed2));
        System.assert(catalogsFeed2.equals(catalogsFeed1));
        System.assert(catalogsFeed3.equals(catalogsFeed4));
        System.assert(catalogsFeed4.equals(catalogsFeed3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeed catalogsFeed1 = OASCatalogsFeed.getExample();
        OASCatalogsFeed catalogsFeed2 = new OASCatalogsFeed();

        System.assertEquals(false, catalogsFeed1.equals('foo'));
        System.assertEquals(false, catalogsFeed2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeed catalogsFeed1 = OASCatalogsFeed.getExample();
        OASCatalogsFeed catalogsFeed2 = new OASCatalogsFeed();
        OASCatalogsFeed catalogsFeed3;

        System.assertEquals(false, catalogsFeed1.equals(catalogsFeed3));
        System.assertEquals(false, catalogsFeed2.equals(catalogsFeed3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeed catalogsFeed1 = OASCatalogsFeed.getExample();
        OASCatalogsFeed catalogsFeed2 = new OASCatalogsFeed();

        System.assertEquals(catalogsFeed1.hashCode(), catalogsFeed1.hashCode());
        System.assertEquals(catalogsFeed2.hashCode(), catalogsFeed2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeed catalogsFeed1 = OASCatalogsFeed.getExample();
        OASCatalogsFeed catalogsFeed2 = OASCatalogsFeed.getExample();
        OASCatalogsFeed catalogsFeed3 = new OASCatalogsFeed();
        OASCatalogsFeed catalogsFeed4 = new OASCatalogsFeed();

        System.assert(catalogsFeed1.equals(catalogsFeed2));
        System.assert(catalogsFeed3.equals(catalogsFeed4));
        System.assertEquals(catalogsFeed1.hashCode(), catalogsFeed2.hashCode());
        System.assertEquals(catalogsFeed3.hashCode(), catalogsFeed4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeed catalogsFeed = new OASCatalogsFeed();
        Map<String, String> x-property-mappings = catalogsFeed.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
        System.assertEquals('defaultCountry', x-property-mappings.get('default_country'));
        System.assertEquals('defaultAvailability', x-property-mappings.get('default_availability'));
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('defaultLocale', x-property-mappings.get('default_locale'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
    }
}
