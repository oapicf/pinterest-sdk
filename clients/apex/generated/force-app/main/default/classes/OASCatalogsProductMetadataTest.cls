@isTest
private class OASCatalogsProductMetadataTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductMetadata catalogsProductMetadata1 = OASCatalogsProductMetadata.getExample();
        OASCatalogsProductMetadata catalogsProductMetadata2 = catalogsProductMetadata1;
        OASCatalogsProductMetadata catalogsProductMetadata3 = new OASCatalogsProductMetadata();
        OASCatalogsProductMetadata catalogsProductMetadata4 = catalogsProductMetadata3;

        System.assert(catalogsProductMetadata1.equals(catalogsProductMetadata2));
        System.assert(catalogsProductMetadata2.equals(catalogsProductMetadata1));
        System.assert(catalogsProductMetadata1.equals(catalogsProductMetadata1));
        System.assert(catalogsProductMetadata3.equals(catalogsProductMetadata4));
        System.assert(catalogsProductMetadata4.equals(catalogsProductMetadata3));
        System.assert(catalogsProductMetadata3.equals(catalogsProductMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductMetadata catalogsProductMetadata1 = OASCatalogsProductMetadata.getExample();
        OASCatalogsProductMetadata catalogsProductMetadata2 = OASCatalogsProductMetadata.getExample();
        OASCatalogsProductMetadata catalogsProductMetadata3 = new OASCatalogsProductMetadata();
        OASCatalogsProductMetadata catalogsProductMetadata4 = new OASCatalogsProductMetadata();

        System.assert(catalogsProductMetadata1.equals(catalogsProductMetadata2));
        System.assert(catalogsProductMetadata2.equals(catalogsProductMetadata1));
        System.assert(catalogsProductMetadata3.equals(catalogsProductMetadata4));
        System.assert(catalogsProductMetadata4.equals(catalogsProductMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductMetadata catalogsProductMetadata1 = OASCatalogsProductMetadata.getExample();
        OASCatalogsProductMetadata catalogsProductMetadata2 = new OASCatalogsProductMetadata();

        System.assertEquals(false, catalogsProductMetadata1.equals('foo'));
        System.assertEquals(false, catalogsProductMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductMetadata catalogsProductMetadata1 = OASCatalogsProductMetadata.getExample();
        OASCatalogsProductMetadata catalogsProductMetadata2 = new OASCatalogsProductMetadata();
        OASCatalogsProductMetadata catalogsProductMetadata3;

        System.assertEquals(false, catalogsProductMetadata1.equals(catalogsProductMetadata3));
        System.assertEquals(false, catalogsProductMetadata2.equals(catalogsProductMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductMetadata catalogsProductMetadata1 = OASCatalogsProductMetadata.getExample();
        OASCatalogsProductMetadata catalogsProductMetadata2 = new OASCatalogsProductMetadata();

        System.assertEquals(catalogsProductMetadata1.hashCode(), catalogsProductMetadata1.hashCode());
        System.assertEquals(catalogsProductMetadata2.hashCode(), catalogsProductMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductMetadata catalogsProductMetadata1 = OASCatalogsProductMetadata.getExample();
        OASCatalogsProductMetadata catalogsProductMetadata2 = OASCatalogsProductMetadata.getExample();
        OASCatalogsProductMetadata catalogsProductMetadata3 = new OASCatalogsProductMetadata();
        OASCatalogsProductMetadata catalogsProductMetadata4 = new OASCatalogsProductMetadata();

        System.assert(catalogsProductMetadata1.equals(catalogsProductMetadata2));
        System.assert(catalogsProductMetadata3.equals(catalogsProductMetadata4));
        System.assertEquals(catalogsProductMetadata1.hashCode(), catalogsProductMetadata2.hashCode());
        System.assertEquals(catalogsProductMetadata3.hashCode(), catalogsProductMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductMetadata catalogsProductMetadata = new OASCatalogsProductMetadata();
        Map<String, String> x-property-mappings = catalogsProductMetadata.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('itemGroupId', x-property-mappings.get('item_group_id'));
        System.assertEquals('salePrice', x-property-mappings.get('sale_price'));
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }
}
