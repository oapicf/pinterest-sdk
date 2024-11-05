@isTest
private class OASCatalogsCreativeAssetsProductMetaTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata1 = OASCatalogsCreativeAssetsProductMeta.getExample();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata2 = catalogsCreativeAssetsProductMetadata1;
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata3 = new OASCatalogsCreativeAssetsProductMeta();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata4 = catalogsCreativeAssetsProductMetadata3;

        System.assert(catalogsCreativeAssetsProductMetadata1.equals(catalogsCreativeAssetsProductMetadata2));
        System.assert(catalogsCreativeAssetsProductMetadata2.equals(catalogsCreativeAssetsProductMetadata1));
        System.assert(catalogsCreativeAssetsProductMetadata1.equals(catalogsCreativeAssetsProductMetadata1));
        System.assert(catalogsCreativeAssetsProductMetadata3.equals(catalogsCreativeAssetsProductMetadata4));
        System.assert(catalogsCreativeAssetsProductMetadata4.equals(catalogsCreativeAssetsProductMetadata3));
        System.assert(catalogsCreativeAssetsProductMetadata3.equals(catalogsCreativeAssetsProductMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata1 = OASCatalogsCreativeAssetsProductMeta.getExample();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata2 = OASCatalogsCreativeAssetsProductMeta.getExample();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata3 = new OASCatalogsCreativeAssetsProductMeta();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata4 = new OASCatalogsCreativeAssetsProductMeta();

        System.assert(catalogsCreativeAssetsProductMetadata1.equals(catalogsCreativeAssetsProductMetadata2));
        System.assert(catalogsCreativeAssetsProductMetadata2.equals(catalogsCreativeAssetsProductMetadata1));
        System.assert(catalogsCreativeAssetsProductMetadata3.equals(catalogsCreativeAssetsProductMetadata4));
        System.assert(catalogsCreativeAssetsProductMetadata4.equals(catalogsCreativeAssetsProductMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata1 = OASCatalogsCreativeAssetsProductMeta.getExample();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata2 = new OASCatalogsCreativeAssetsProductMeta();

        System.assertEquals(false, catalogsCreativeAssetsProductMetadata1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsProductMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata1 = OASCatalogsCreativeAssetsProductMeta.getExample();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata2 = new OASCatalogsCreativeAssetsProductMeta();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata3;

        System.assertEquals(false, catalogsCreativeAssetsProductMetadata1.equals(catalogsCreativeAssetsProductMetadata3));
        System.assertEquals(false, catalogsCreativeAssetsProductMetadata2.equals(catalogsCreativeAssetsProductMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata1 = OASCatalogsCreativeAssetsProductMeta.getExample();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata2 = new OASCatalogsCreativeAssetsProductMeta();

        System.assertEquals(catalogsCreativeAssetsProductMetadata1.hashCode(), catalogsCreativeAssetsProductMetadata1.hashCode());
        System.assertEquals(catalogsCreativeAssetsProductMetadata2.hashCode(), catalogsCreativeAssetsProductMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata1 = OASCatalogsCreativeAssetsProductMeta.getExample();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata2 = OASCatalogsCreativeAssetsProductMeta.getExample();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata3 = new OASCatalogsCreativeAssetsProductMeta();
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata4 = new OASCatalogsCreativeAssetsProductMeta();

        System.assert(catalogsCreativeAssetsProductMetadata1.equals(catalogsCreativeAssetsProductMetadata2));
        System.assert(catalogsCreativeAssetsProductMetadata3.equals(catalogsCreativeAssetsProductMetadata4));
        System.assertEquals(catalogsCreativeAssetsProductMetadata1.hashCode(), catalogsCreativeAssetsProductMetadata2.hashCode());
        System.assertEquals(catalogsCreativeAssetsProductMetadata3.hashCode(), catalogsCreativeAssetsProductMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata = new OASCatalogsCreativeAssetsProductMeta();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsProductMetadata.getx-property-mappings();
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }
}
