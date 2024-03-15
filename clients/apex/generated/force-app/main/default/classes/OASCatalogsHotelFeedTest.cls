@isTest
private class OASCatalogsHotelFeedTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelFeed catalogsHotelFeed1 = OASCatalogsHotelFeed.getExample();
        OASCatalogsHotelFeed catalogsHotelFeed2 = catalogsHotelFeed1;
        OASCatalogsHotelFeed catalogsHotelFeed3 = new OASCatalogsHotelFeed();
        OASCatalogsHotelFeed catalogsHotelFeed4 = catalogsHotelFeed3;

        System.assert(catalogsHotelFeed1.equals(catalogsHotelFeed2));
        System.assert(catalogsHotelFeed2.equals(catalogsHotelFeed1));
        System.assert(catalogsHotelFeed1.equals(catalogsHotelFeed1));
        System.assert(catalogsHotelFeed3.equals(catalogsHotelFeed4));
        System.assert(catalogsHotelFeed4.equals(catalogsHotelFeed3));
        System.assert(catalogsHotelFeed3.equals(catalogsHotelFeed3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelFeed catalogsHotelFeed1 = OASCatalogsHotelFeed.getExample();
        OASCatalogsHotelFeed catalogsHotelFeed2 = OASCatalogsHotelFeed.getExample();
        OASCatalogsHotelFeed catalogsHotelFeed3 = new OASCatalogsHotelFeed();
        OASCatalogsHotelFeed catalogsHotelFeed4 = new OASCatalogsHotelFeed();

        System.assert(catalogsHotelFeed1.equals(catalogsHotelFeed2));
        System.assert(catalogsHotelFeed2.equals(catalogsHotelFeed1));
        System.assert(catalogsHotelFeed3.equals(catalogsHotelFeed4));
        System.assert(catalogsHotelFeed4.equals(catalogsHotelFeed3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelFeed catalogsHotelFeed1 = OASCatalogsHotelFeed.getExample();
        OASCatalogsHotelFeed catalogsHotelFeed2 = new OASCatalogsHotelFeed();

        System.assertEquals(false, catalogsHotelFeed1.equals('foo'));
        System.assertEquals(false, catalogsHotelFeed2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelFeed catalogsHotelFeed1 = OASCatalogsHotelFeed.getExample();
        OASCatalogsHotelFeed catalogsHotelFeed2 = new OASCatalogsHotelFeed();
        OASCatalogsHotelFeed catalogsHotelFeed3;

        System.assertEquals(false, catalogsHotelFeed1.equals(catalogsHotelFeed3));
        System.assertEquals(false, catalogsHotelFeed2.equals(catalogsHotelFeed3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelFeed catalogsHotelFeed1 = OASCatalogsHotelFeed.getExample();
        OASCatalogsHotelFeed catalogsHotelFeed2 = new OASCatalogsHotelFeed();

        System.assertEquals(catalogsHotelFeed1.hashCode(), catalogsHotelFeed1.hashCode());
        System.assertEquals(catalogsHotelFeed2.hashCode(), catalogsHotelFeed2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelFeed catalogsHotelFeed1 = OASCatalogsHotelFeed.getExample();
        OASCatalogsHotelFeed catalogsHotelFeed2 = OASCatalogsHotelFeed.getExample();
        OASCatalogsHotelFeed catalogsHotelFeed3 = new OASCatalogsHotelFeed();
        OASCatalogsHotelFeed catalogsHotelFeed4 = new OASCatalogsHotelFeed();

        System.assert(catalogsHotelFeed1.equals(catalogsHotelFeed2));
        System.assert(catalogsHotelFeed3.equals(catalogsHotelFeed4));
        System.assertEquals(catalogsHotelFeed1.hashCode(), catalogsHotelFeed2.hashCode());
        System.assertEquals(catalogsHotelFeed3.hashCode(), catalogsHotelFeed4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelFeed catalogsHotelFeed = new OASCatalogsHotelFeed();
        Map<String, String> x-property-mappings = catalogsHotelFeed.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('defaultLocale', x-property-mappings.get('default_locale'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
