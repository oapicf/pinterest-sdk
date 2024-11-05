@isTest
private class OASCatalogsRetailProductMetadataTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata1 = OASCatalogsRetailProductMetadata.getExample();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata2 = catalogsRetailProductMetadata1;
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata3 = new OASCatalogsRetailProductMetadata();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata4 = catalogsRetailProductMetadata3;

        System.assert(catalogsRetailProductMetadata1.equals(catalogsRetailProductMetadata2));
        System.assert(catalogsRetailProductMetadata2.equals(catalogsRetailProductMetadata1));
        System.assert(catalogsRetailProductMetadata1.equals(catalogsRetailProductMetadata1));
        System.assert(catalogsRetailProductMetadata3.equals(catalogsRetailProductMetadata4));
        System.assert(catalogsRetailProductMetadata4.equals(catalogsRetailProductMetadata3));
        System.assert(catalogsRetailProductMetadata3.equals(catalogsRetailProductMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata1 = OASCatalogsRetailProductMetadata.getExample();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata2 = OASCatalogsRetailProductMetadata.getExample();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata3 = new OASCatalogsRetailProductMetadata();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata4 = new OASCatalogsRetailProductMetadata();

        System.assert(catalogsRetailProductMetadata1.equals(catalogsRetailProductMetadata2));
        System.assert(catalogsRetailProductMetadata2.equals(catalogsRetailProductMetadata1));
        System.assert(catalogsRetailProductMetadata3.equals(catalogsRetailProductMetadata4));
        System.assert(catalogsRetailProductMetadata4.equals(catalogsRetailProductMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata1 = OASCatalogsRetailProductMetadata.getExample();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata2 = new OASCatalogsRetailProductMetadata();

        System.assertEquals(false, catalogsRetailProductMetadata1.equals('foo'));
        System.assertEquals(false, catalogsRetailProductMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata1 = OASCatalogsRetailProductMetadata.getExample();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata2 = new OASCatalogsRetailProductMetadata();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata3;

        System.assertEquals(false, catalogsRetailProductMetadata1.equals(catalogsRetailProductMetadata3));
        System.assertEquals(false, catalogsRetailProductMetadata2.equals(catalogsRetailProductMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata1 = OASCatalogsRetailProductMetadata.getExample();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata2 = new OASCatalogsRetailProductMetadata();

        System.assertEquals(catalogsRetailProductMetadata1.hashCode(), catalogsRetailProductMetadata1.hashCode());
        System.assertEquals(catalogsRetailProductMetadata2.hashCode(), catalogsRetailProductMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata1 = OASCatalogsRetailProductMetadata.getExample();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata2 = OASCatalogsRetailProductMetadata.getExample();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata3 = new OASCatalogsRetailProductMetadata();
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata4 = new OASCatalogsRetailProductMetadata();

        System.assert(catalogsRetailProductMetadata1.equals(catalogsRetailProductMetadata2));
        System.assert(catalogsRetailProductMetadata3.equals(catalogsRetailProductMetadata4));
        System.assertEquals(catalogsRetailProductMetadata1.hashCode(), catalogsRetailProductMetadata2.hashCode());
        System.assertEquals(catalogsRetailProductMetadata3.hashCode(), catalogsRetailProductMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailProductMetadata catalogsRetailProductMetadata = new OASCatalogsRetailProductMetadata();
        Map<String, String> x-property-mappings = catalogsRetailProductMetadata.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('itemGroupId', x-property-mappings.get('item_group_id'));
        System.assertEquals('salePrice', x-property-mappings.get('sale_price'));
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }
}
