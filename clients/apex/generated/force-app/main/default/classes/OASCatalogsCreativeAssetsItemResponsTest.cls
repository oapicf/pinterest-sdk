@isTest
private class OASCatalogsCreativeAssetsItemResponsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse1 = OASCatalogsCreativeAssetsItemRespons.getExample();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse2 = catalogsCreativeAssetsItemResponse1;
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse3 = new OASCatalogsCreativeAssetsItemRespons();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse4 = catalogsCreativeAssetsItemResponse3;

        System.assert(catalogsCreativeAssetsItemResponse1.equals(catalogsCreativeAssetsItemResponse2));
        System.assert(catalogsCreativeAssetsItemResponse2.equals(catalogsCreativeAssetsItemResponse1));
        System.assert(catalogsCreativeAssetsItemResponse1.equals(catalogsCreativeAssetsItemResponse1));
        System.assert(catalogsCreativeAssetsItemResponse3.equals(catalogsCreativeAssetsItemResponse4));
        System.assert(catalogsCreativeAssetsItemResponse4.equals(catalogsCreativeAssetsItemResponse3));
        System.assert(catalogsCreativeAssetsItemResponse3.equals(catalogsCreativeAssetsItemResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse1 = OASCatalogsCreativeAssetsItemRespons.getExample();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse2 = OASCatalogsCreativeAssetsItemRespons.getExample();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse3 = new OASCatalogsCreativeAssetsItemRespons();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse4 = new OASCatalogsCreativeAssetsItemRespons();

        System.assert(catalogsCreativeAssetsItemResponse1.equals(catalogsCreativeAssetsItemResponse2));
        System.assert(catalogsCreativeAssetsItemResponse2.equals(catalogsCreativeAssetsItemResponse1));
        System.assert(catalogsCreativeAssetsItemResponse3.equals(catalogsCreativeAssetsItemResponse4));
        System.assert(catalogsCreativeAssetsItemResponse4.equals(catalogsCreativeAssetsItemResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse1 = OASCatalogsCreativeAssetsItemRespons.getExample();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse2 = new OASCatalogsCreativeAssetsItemRespons();

        System.assertEquals(false, catalogsCreativeAssetsItemResponse1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsItemResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse1 = OASCatalogsCreativeAssetsItemRespons.getExample();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse2 = new OASCatalogsCreativeAssetsItemRespons();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse3;

        System.assertEquals(false, catalogsCreativeAssetsItemResponse1.equals(catalogsCreativeAssetsItemResponse3));
        System.assertEquals(false, catalogsCreativeAssetsItemResponse2.equals(catalogsCreativeAssetsItemResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse1 = OASCatalogsCreativeAssetsItemRespons.getExample();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse2 = new OASCatalogsCreativeAssetsItemRespons();

        System.assertEquals(catalogsCreativeAssetsItemResponse1.hashCode(), catalogsCreativeAssetsItemResponse1.hashCode());
        System.assertEquals(catalogsCreativeAssetsItemResponse2.hashCode(), catalogsCreativeAssetsItemResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse1 = OASCatalogsCreativeAssetsItemRespons.getExample();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse2 = OASCatalogsCreativeAssetsItemRespons.getExample();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse3 = new OASCatalogsCreativeAssetsItemRespons();
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse4 = new OASCatalogsCreativeAssetsItemRespons();

        System.assert(catalogsCreativeAssetsItemResponse1.equals(catalogsCreativeAssetsItemResponse2));
        System.assert(catalogsCreativeAssetsItemResponse3.equals(catalogsCreativeAssetsItemResponse4));
        System.assertEquals(catalogsCreativeAssetsItemResponse1.hashCode(), catalogsCreativeAssetsItemResponse2.hashCode());
        System.assertEquals(catalogsCreativeAssetsItemResponse3.hashCode(), catalogsCreativeAssetsItemResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse = new OASCatalogsCreativeAssetsItemRespons();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsItemResponse.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse = new OASCatalogsCreativeAssetsItemRespons();
        System.assertEquals(new List<OASPin>(), catalogsCreativeAssetsItemResponse.pins);
        System.assertEquals(null, catalogsCreativeAssetsItemResponse.catalogType);
        System.assertEquals(null, catalogsCreativeAssetsItemResponse.creativeAssetsId);
        System.assertEquals(null, catalogsCreativeAssetsItemResponse.attributes);
    }
}
