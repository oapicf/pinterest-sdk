@isTest
private class OASCatalogsCreativeAssetsItemErrorReTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse1 = OASCatalogsCreativeAssetsItemErrorRe.getExample();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse2 = catalogsCreativeAssetsItemErrorResponse1;
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse3 = new OASCatalogsCreativeAssetsItemErrorRe();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse4 = catalogsCreativeAssetsItemErrorResponse3;

        System.assert(catalogsCreativeAssetsItemErrorResponse1.equals(catalogsCreativeAssetsItemErrorResponse2));
        System.assert(catalogsCreativeAssetsItemErrorResponse2.equals(catalogsCreativeAssetsItemErrorResponse1));
        System.assert(catalogsCreativeAssetsItemErrorResponse1.equals(catalogsCreativeAssetsItemErrorResponse1));
        System.assert(catalogsCreativeAssetsItemErrorResponse3.equals(catalogsCreativeAssetsItemErrorResponse4));
        System.assert(catalogsCreativeAssetsItemErrorResponse4.equals(catalogsCreativeAssetsItemErrorResponse3));
        System.assert(catalogsCreativeAssetsItemErrorResponse3.equals(catalogsCreativeAssetsItemErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse1 = OASCatalogsCreativeAssetsItemErrorRe.getExample();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse2 = OASCatalogsCreativeAssetsItemErrorRe.getExample();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse3 = new OASCatalogsCreativeAssetsItemErrorRe();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse4 = new OASCatalogsCreativeAssetsItemErrorRe();

        System.assert(catalogsCreativeAssetsItemErrorResponse1.equals(catalogsCreativeAssetsItemErrorResponse2));
        System.assert(catalogsCreativeAssetsItemErrorResponse2.equals(catalogsCreativeAssetsItemErrorResponse1));
        System.assert(catalogsCreativeAssetsItemErrorResponse3.equals(catalogsCreativeAssetsItemErrorResponse4));
        System.assert(catalogsCreativeAssetsItemErrorResponse4.equals(catalogsCreativeAssetsItemErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse1 = OASCatalogsCreativeAssetsItemErrorRe.getExample();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse2 = new OASCatalogsCreativeAssetsItemErrorRe();

        System.assertEquals(false, catalogsCreativeAssetsItemErrorResponse1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsItemErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse1 = OASCatalogsCreativeAssetsItemErrorRe.getExample();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse2 = new OASCatalogsCreativeAssetsItemErrorRe();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse3;

        System.assertEquals(false, catalogsCreativeAssetsItemErrorResponse1.equals(catalogsCreativeAssetsItemErrorResponse3));
        System.assertEquals(false, catalogsCreativeAssetsItemErrorResponse2.equals(catalogsCreativeAssetsItemErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse1 = OASCatalogsCreativeAssetsItemErrorRe.getExample();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse2 = new OASCatalogsCreativeAssetsItemErrorRe();

        System.assertEquals(catalogsCreativeAssetsItemErrorResponse1.hashCode(), catalogsCreativeAssetsItemErrorResponse1.hashCode());
        System.assertEquals(catalogsCreativeAssetsItemErrorResponse2.hashCode(), catalogsCreativeAssetsItemErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse1 = OASCatalogsCreativeAssetsItemErrorRe.getExample();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse2 = OASCatalogsCreativeAssetsItemErrorRe.getExample();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse3 = new OASCatalogsCreativeAssetsItemErrorRe();
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse4 = new OASCatalogsCreativeAssetsItemErrorRe();

        System.assert(catalogsCreativeAssetsItemErrorResponse1.equals(catalogsCreativeAssetsItemErrorResponse2));
        System.assert(catalogsCreativeAssetsItemErrorResponse3.equals(catalogsCreativeAssetsItemErrorResponse4));
        System.assertEquals(catalogsCreativeAssetsItemErrorResponse1.hashCode(), catalogsCreativeAssetsItemErrorResponse2.hashCode());
        System.assertEquals(catalogsCreativeAssetsItemErrorResponse3.hashCode(), catalogsCreativeAssetsItemErrorResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse = new OASCatalogsCreativeAssetsItemErrorRe();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsItemErrorResponse.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsCreativeAssetsItemErrorRe catalogsCreativeAssetsItemErrorResponse = new OASCatalogsCreativeAssetsItemErrorRe();
        System.assertEquals(new List<OASItemValidationEvent>(), catalogsCreativeAssetsItemErrorResponse.errors);
        System.assertEquals(null, catalogsCreativeAssetsItemErrorResponse.catalogType);
        System.assertEquals(null, catalogsCreativeAssetsItemErrorResponse.creativeAssetsId);
    }
}
