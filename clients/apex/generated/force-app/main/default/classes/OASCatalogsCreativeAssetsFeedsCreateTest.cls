@isTest
private class OASCatalogsCreativeAssetsFeedsCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest1 = OASCatalogsCreativeAssetsFeedsCreate.getExample();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest2 = catalogsCreativeAssetsFeedsCreateRequest1;
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest3 = new OASCatalogsCreativeAssetsFeedsCreate();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest4 = catalogsCreativeAssetsFeedsCreateRequest3;

        System.assert(catalogsCreativeAssetsFeedsCreateRequest1.equals(catalogsCreativeAssetsFeedsCreateRequest2));
        System.assert(catalogsCreativeAssetsFeedsCreateRequest2.equals(catalogsCreativeAssetsFeedsCreateRequest1));
        System.assert(catalogsCreativeAssetsFeedsCreateRequest1.equals(catalogsCreativeAssetsFeedsCreateRequest1));
        System.assert(catalogsCreativeAssetsFeedsCreateRequest3.equals(catalogsCreativeAssetsFeedsCreateRequest4));
        System.assert(catalogsCreativeAssetsFeedsCreateRequest4.equals(catalogsCreativeAssetsFeedsCreateRequest3));
        System.assert(catalogsCreativeAssetsFeedsCreateRequest3.equals(catalogsCreativeAssetsFeedsCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest1 = OASCatalogsCreativeAssetsFeedsCreate.getExample();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest2 = OASCatalogsCreativeAssetsFeedsCreate.getExample();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest3 = new OASCatalogsCreativeAssetsFeedsCreate();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest4 = new OASCatalogsCreativeAssetsFeedsCreate();

        System.assert(catalogsCreativeAssetsFeedsCreateRequest1.equals(catalogsCreativeAssetsFeedsCreateRequest2));
        System.assert(catalogsCreativeAssetsFeedsCreateRequest2.equals(catalogsCreativeAssetsFeedsCreateRequest1));
        System.assert(catalogsCreativeAssetsFeedsCreateRequest3.equals(catalogsCreativeAssetsFeedsCreateRequest4));
        System.assert(catalogsCreativeAssetsFeedsCreateRequest4.equals(catalogsCreativeAssetsFeedsCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest1 = OASCatalogsCreativeAssetsFeedsCreate.getExample();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest2 = new OASCatalogsCreativeAssetsFeedsCreate();

        System.assertEquals(false, catalogsCreativeAssetsFeedsCreateRequest1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsFeedsCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest1 = OASCatalogsCreativeAssetsFeedsCreate.getExample();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest2 = new OASCatalogsCreativeAssetsFeedsCreate();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest3;

        System.assertEquals(false, catalogsCreativeAssetsFeedsCreateRequest1.equals(catalogsCreativeAssetsFeedsCreateRequest3));
        System.assertEquals(false, catalogsCreativeAssetsFeedsCreateRequest2.equals(catalogsCreativeAssetsFeedsCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest1 = OASCatalogsCreativeAssetsFeedsCreate.getExample();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest2 = new OASCatalogsCreativeAssetsFeedsCreate();

        System.assertEquals(catalogsCreativeAssetsFeedsCreateRequest1.hashCode(), catalogsCreativeAssetsFeedsCreateRequest1.hashCode());
        System.assertEquals(catalogsCreativeAssetsFeedsCreateRequest2.hashCode(), catalogsCreativeAssetsFeedsCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest1 = OASCatalogsCreativeAssetsFeedsCreate.getExample();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest2 = OASCatalogsCreativeAssetsFeedsCreate.getExample();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest3 = new OASCatalogsCreativeAssetsFeedsCreate();
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest4 = new OASCatalogsCreativeAssetsFeedsCreate();

        System.assert(catalogsCreativeAssetsFeedsCreateRequest1.equals(catalogsCreativeAssetsFeedsCreateRequest2));
        System.assert(catalogsCreativeAssetsFeedsCreateRequest3.equals(catalogsCreativeAssetsFeedsCreateRequest4));
        System.assertEquals(catalogsCreativeAssetsFeedsCreateRequest1.hashCode(), catalogsCreativeAssetsFeedsCreateRequest2.hashCode());
        System.assertEquals(catalogsCreativeAssetsFeedsCreateRequest3.hashCode(), catalogsCreativeAssetsFeedsCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsFeedsCreate catalogsCreativeAssetsFeedsCreateRequest = new OASCatalogsCreativeAssetsFeedsCreate();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsFeedsCreateRequest.getx-property-mappings();
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('defaultLocale', x-property-mappings.get('default_locale'));
        System.assertEquals('defaultCountry', x-property-mappings.get('default_country'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
