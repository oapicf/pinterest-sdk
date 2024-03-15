@isTest
private class OASCatalogsRetailFeedTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailFeed catalogsRetailFeed1 = OASCatalogsRetailFeed.getExample();
        OASCatalogsRetailFeed catalogsRetailFeed2 = catalogsRetailFeed1;
        OASCatalogsRetailFeed catalogsRetailFeed3 = new OASCatalogsRetailFeed();
        OASCatalogsRetailFeed catalogsRetailFeed4 = catalogsRetailFeed3;

        System.assert(catalogsRetailFeed1.equals(catalogsRetailFeed2));
        System.assert(catalogsRetailFeed2.equals(catalogsRetailFeed1));
        System.assert(catalogsRetailFeed1.equals(catalogsRetailFeed1));
        System.assert(catalogsRetailFeed3.equals(catalogsRetailFeed4));
        System.assert(catalogsRetailFeed4.equals(catalogsRetailFeed3));
        System.assert(catalogsRetailFeed3.equals(catalogsRetailFeed3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailFeed catalogsRetailFeed1 = OASCatalogsRetailFeed.getExample();
        OASCatalogsRetailFeed catalogsRetailFeed2 = OASCatalogsRetailFeed.getExample();
        OASCatalogsRetailFeed catalogsRetailFeed3 = new OASCatalogsRetailFeed();
        OASCatalogsRetailFeed catalogsRetailFeed4 = new OASCatalogsRetailFeed();

        System.assert(catalogsRetailFeed1.equals(catalogsRetailFeed2));
        System.assert(catalogsRetailFeed2.equals(catalogsRetailFeed1));
        System.assert(catalogsRetailFeed3.equals(catalogsRetailFeed4));
        System.assert(catalogsRetailFeed4.equals(catalogsRetailFeed3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailFeed catalogsRetailFeed1 = OASCatalogsRetailFeed.getExample();
        OASCatalogsRetailFeed catalogsRetailFeed2 = new OASCatalogsRetailFeed();

        System.assertEquals(false, catalogsRetailFeed1.equals('foo'));
        System.assertEquals(false, catalogsRetailFeed2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailFeed catalogsRetailFeed1 = OASCatalogsRetailFeed.getExample();
        OASCatalogsRetailFeed catalogsRetailFeed2 = new OASCatalogsRetailFeed();
        OASCatalogsRetailFeed catalogsRetailFeed3;

        System.assertEquals(false, catalogsRetailFeed1.equals(catalogsRetailFeed3));
        System.assertEquals(false, catalogsRetailFeed2.equals(catalogsRetailFeed3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailFeed catalogsRetailFeed1 = OASCatalogsRetailFeed.getExample();
        OASCatalogsRetailFeed catalogsRetailFeed2 = new OASCatalogsRetailFeed();

        System.assertEquals(catalogsRetailFeed1.hashCode(), catalogsRetailFeed1.hashCode());
        System.assertEquals(catalogsRetailFeed2.hashCode(), catalogsRetailFeed2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailFeed catalogsRetailFeed1 = OASCatalogsRetailFeed.getExample();
        OASCatalogsRetailFeed catalogsRetailFeed2 = OASCatalogsRetailFeed.getExample();
        OASCatalogsRetailFeed catalogsRetailFeed3 = new OASCatalogsRetailFeed();
        OASCatalogsRetailFeed catalogsRetailFeed4 = new OASCatalogsRetailFeed();

        System.assert(catalogsRetailFeed1.equals(catalogsRetailFeed2));
        System.assert(catalogsRetailFeed3.equals(catalogsRetailFeed4));
        System.assertEquals(catalogsRetailFeed1.hashCode(), catalogsRetailFeed2.hashCode());
        System.assertEquals(catalogsRetailFeed3.hashCode(), catalogsRetailFeed4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailFeed catalogsRetailFeed = new OASCatalogsRetailFeed();
        Map<String, String> x-property-mappings = catalogsRetailFeed.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('defaultLocale', x-property-mappings.get('default_locale'));
        System.assertEquals('defaultCountry', x-property-mappings.get('default_country'));
        System.assertEquals('defaultAvailability', x-property-mappings.get('default_availability'));
    }
}
