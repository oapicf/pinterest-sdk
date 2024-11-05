@isTest
private class OASCatalogsRetailProductGroupProductTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts1 = OASCatalogsRetailProductGroupProduct.getExample();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts2 = catalogsRetailProductGroupProductCounts1;
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts3 = new OASCatalogsRetailProductGroupProduct();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts4 = catalogsRetailProductGroupProductCounts3;

        System.assert(catalogsRetailProductGroupProductCounts1.equals(catalogsRetailProductGroupProductCounts2));
        System.assert(catalogsRetailProductGroupProductCounts2.equals(catalogsRetailProductGroupProductCounts1));
        System.assert(catalogsRetailProductGroupProductCounts1.equals(catalogsRetailProductGroupProductCounts1));
        System.assert(catalogsRetailProductGroupProductCounts3.equals(catalogsRetailProductGroupProductCounts4));
        System.assert(catalogsRetailProductGroupProductCounts4.equals(catalogsRetailProductGroupProductCounts3));
        System.assert(catalogsRetailProductGroupProductCounts3.equals(catalogsRetailProductGroupProductCounts3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts1 = OASCatalogsRetailProductGroupProduct.getExample();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts2 = OASCatalogsRetailProductGroupProduct.getExample();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts3 = new OASCatalogsRetailProductGroupProduct();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts4 = new OASCatalogsRetailProductGroupProduct();

        System.assert(catalogsRetailProductGroupProductCounts1.equals(catalogsRetailProductGroupProductCounts2));
        System.assert(catalogsRetailProductGroupProductCounts2.equals(catalogsRetailProductGroupProductCounts1));
        System.assert(catalogsRetailProductGroupProductCounts3.equals(catalogsRetailProductGroupProductCounts4));
        System.assert(catalogsRetailProductGroupProductCounts4.equals(catalogsRetailProductGroupProductCounts3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts1 = OASCatalogsRetailProductGroupProduct.getExample();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts2 = new OASCatalogsRetailProductGroupProduct();

        System.assertEquals(false, catalogsRetailProductGroupProductCounts1.equals('foo'));
        System.assertEquals(false, catalogsRetailProductGroupProductCounts2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts1 = OASCatalogsRetailProductGroupProduct.getExample();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts2 = new OASCatalogsRetailProductGroupProduct();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts3;

        System.assertEquals(false, catalogsRetailProductGroupProductCounts1.equals(catalogsRetailProductGroupProductCounts3));
        System.assertEquals(false, catalogsRetailProductGroupProductCounts2.equals(catalogsRetailProductGroupProductCounts3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts1 = OASCatalogsRetailProductGroupProduct.getExample();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts2 = new OASCatalogsRetailProductGroupProduct();

        System.assertEquals(catalogsRetailProductGroupProductCounts1.hashCode(), catalogsRetailProductGroupProductCounts1.hashCode());
        System.assertEquals(catalogsRetailProductGroupProductCounts2.hashCode(), catalogsRetailProductGroupProductCounts2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts1 = OASCatalogsRetailProductGroupProduct.getExample();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts2 = OASCatalogsRetailProductGroupProduct.getExample();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts3 = new OASCatalogsRetailProductGroupProduct();
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts4 = new OASCatalogsRetailProductGroupProduct();

        System.assert(catalogsRetailProductGroupProductCounts1.equals(catalogsRetailProductGroupProductCounts2));
        System.assert(catalogsRetailProductGroupProductCounts3.equals(catalogsRetailProductGroupProductCounts4));
        System.assertEquals(catalogsRetailProductGroupProductCounts1.hashCode(), catalogsRetailProductGroupProductCounts2.hashCode());
        System.assertEquals(catalogsRetailProductGroupProductCounts3.hashCode(), catalogsRetailProductGroupProductCounts4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailProductGroupProduct catalogsRetailProductGroupProductCounts = new OASCatalogsRetailProductGroupProduct();
        Map<String, String> x-property-mappings = catalogsRetailProductGroupProductCounts.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('inStock', x-property-mappings.get('in_stock'));
        System.assertEquals('outOfStock', x-property-mappings.get('out_of_stock'));
    }
}
