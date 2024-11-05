@isTest
private class OASCatalogsCreativeAssetsFeedsUpdateTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest1 = OASCatalogsCreativeAssetsFeedsUpdate.getExample();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest2 = catalogsCreativeAssetsFeedsUpdateRequest1;
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest3 = new OASCatalogsCreativeAssetsFeedsUpdate();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest4 = catalogsCreativeAssetsFeedsUpdateRequest3;

        System.assert(catalogsCreativeAssetsFeedsUpdateRequest1.equals(catalogsCreativeAssetsFeedsUpdateRequest2));
        System.assert(catalogsCreativeAssetsFeedsUpdateRequest2.equals(catalogsCreativeAssetsFeedsUpdateRequest1));
        System.assert(catalogsCreativeAssetsFeedsUpdateRequest1.equals(catalogsCreativeAssetsFeedsUpdateRequest1));
        System.assert(catalogsCreativeAssetsFeedsUpdateRequest3.equals(catalogsCreativeAssetsFeedsUpdateRequest4));
        System.assert(catalogsCreativeAssetsFeedsUpdateRequest4.equals(catalogsCreativeAssetsFeedsUpdateRequest3));
        System.assert(catalogsCreativeAssetsFeedsUpdateRequest3.equals(catalogsCreativeAssetsFeedsUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest1 = OASCatalogsCreativeAssetsFeedsUpdate.getExample();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest2 = OASCatalogsCreativeAssetsFeedsUpdate.getExample();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest3 = new OASCatalogsCreativeAssetsFeedsUpdate();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest4 = new OASCatalogsCreativeAssetsFeedsUpdate();

        System.assert(catalogsCreativeAssetsFeedsUpdateRequest1.equals(catalogsCreativeAssetsFeedsUpdateRequest2));
        System.assert(catalogsCreativeAssetsFeedsUpdateRequest2.equals(catalogsCreativeAssetsFeedsUpdateRequest1));
        System.assert(catalogsCreativeAssetsFeedsUpdateRequest3.equals(catalogsCreativeAssetsFeedsUpdateRequest4));
        System.assert(catalogsCreativeAssetsFeedsUpdateRequest4.equals(catalogsCreativeAssetsFeedsUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest1 = OASCatalogsCreativeAssetsFeedsUpdate.getExample();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest2 = new OASCatalogsCreativeAssetsFeedsUpdate();

        System.assertEquals(false, catalogsCreativeAssetsFeedsUpdateRequest1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsFeedsUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest1 = OASCatalogsCreativeAssetsFeedsUpdate.getExample();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest2 = new OASCatalogsCreativeAssetsFeedsUpdate();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest3;

        System.assertEquals(false, catalogsCreativeAssetsFeedsUpdateRequest1.equals(catalogsCreativeAssetsFeedsUpdateRequest3));
        System.assertEquals(false, catalogsCreativeAssetsFeedsUpdateRequest2.equals(catalogsCreativeAssetsFeedsUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest1 = OASCatalogsCreativeAssetsFeedsUpdate.getExample();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest2 = new OASCatalogsCreativeAssetsFeedsUpdate();

        System.assertEquals(catalogsCreativeAssetsFeedsUpdateRequest1.hashCode(), catalogsCreativeAssetsFeedsUpdateRequest1.hashCode());
        System.assertEquals(catalogsCreativeAssetsFeedsUpdateRequest2.hashCode(), catalogsCreativeAssetsFeedsUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest1 = OASCatalogsCreativeAssetsFeedsUpdate.getExample();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest2 = OASCatalogsCreativeAssetsFeedsUpdate.getExample();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest3 = new OASCatalogsCreativeAssetsFeedsUpdate();
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest4 = new OASCatalogsCreativeAssetsFeedsUpdate();

        System.assert(catalogsCreativeAssetsFeedsUpdateRequest1.equals(catalogsCreativeAssetsFeedsUpdateRequest2));
        System.assert(catalogsCreativeAssetsFeedsUpdateRequest3.equals(catalogsCreativeAssetsFeedsUpdateRequest4));
        System.assertEquals(catalogsCreativeAssetsFeedsUpdateRequest1.hashCode(), catalogsCreativeAssetsFeedsUpdateRequest2.hashCode());
        System.assertEquals(catalogsCreativeAssetsFeedsUpdateRequest3.hashCode(), catalogsCreativeAssetsFeedsUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsFeedsUpdate catalogsCreativeAssetsFeedsUpdateRequest = new OASCatalogsCreativeAssetsFeedsUpdate();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsFeedsUpdateRequest.getx-property-mappings();
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
