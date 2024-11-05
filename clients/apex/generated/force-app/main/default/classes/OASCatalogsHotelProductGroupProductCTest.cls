@isTest
private class OASCatalogsHotelProductGroupProductCTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts1 = OASCatalogsHotelProductGroupProductC.getExample();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts2 = catalogsHotelProductGroupProductCounts1;
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts3 = new OASCatalogsHotelProductGroupProductC();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts4 = catalogsHotelProductGroupProductCounts3;

        System.assert(catalogsHotelProductGroupProductCounts1.equals(catalogsHotelProductGroupProductCounts2));
        System.assert(catalogsHotelProductGroupProductCounts2.equals(catalogsHotelProductGroupProductCounts1));
        System.assert(catalogsHotelProductGroupProductCounts1.equals(catalogsHotelProductGroupProductCounts1));
        System.assert(catalogsHotelProductGroupProductCounts3.equals(catalogsHotelProductGroupProductCounts4));
        System.assert(catalogsHotelProductGroupProductCounts4.equals(catalogsHotelProductGroupProductCounts3));
        System.assert(catalogsHotelProductGroupProductCounts3.equals(catalogsHotelProductGroupProductCounts3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts1 = OASCatalogsHotelProductGroupProductC.getExample();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts2 = OASCatalogsHotelProductGroupProductC.getExample();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts3 = new OASCatalogsHotelProductGroupProductC();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts4 = new OASCatalogsHotelProductGroupProductC();

        System.assert(catalogsHotelProductGroupProductCounts1.equals(catalogsHotelProductGroupProductCounts2));
        System.assert(catalogsHotelProductGroupProductCounts2.equals(catalogsHotelProductGroupProductCounts1));
        System.assert(catalogsHotelProductGroupProductCounts3.equals(catalogsHotelProductGroupProductCounts4));
        System.assert(catalogsHotelProductGroupProductCounts4.equals(catalogsHotelProductGroupProductCounts3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts1 = OASCatalogsHotelProductGroupProductC.getExample();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts2 = new OASCatalogsHotelProductGroupProductC();

        System.assertEquals(false, catalogsHotelProductGroupProductCounts1.equals('foo'));
        System.assertEquals(false, catalogsHotelProductGroupProductCounts2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts1 = OASCatalogsHotelProductGroupProductC.getExample();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts2 = new OASCatalogsHotelProductGroupProductC();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts3;

        System.assertEquals(false, catalogsHotelProductGroupProductCounts1.equals(catalogsHotelProductGroupProductCounts3));
        System.assertEquals(false, catalogsHotelProductGroupProductCounts2.equals(catalogsHotelProductGroupProductCounts3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts1 = OASCatalogsHotelProductGroupProductC.getExample();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts2 = new OASCatalogsHotelProductGroupProductC();

        System.assertEquals(catalogsHotelProductGroupProductCounts1.hashCode(), catalogsHotelProductGroupProductCounts1.hashCode());
        System.assertEquals(catalogsHotelProductGroupProductCounts2.hashCode(), catalogsHotelProductGroupProductCounts2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts1 = OASCatalogsHotelProductGroupProductC.getExample();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts2 = OASCatalogsHotelProductGroupProductC.getExample();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts3 = new OASCatalogsHotelProductGroupProductC();
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts4 = new OASCatalogsHotelProductGroupProductC();

        System.assert(catalogsHotelProductGroupProductCounts1.equals(catalogsHotelProductGroupProductCounts2));
        System.assert(catalogsHotelProductGroupProductCounts3.equals(catalogsHotelProductGroupProductCounts4));
        System.assertEquals(catalogsHotelProductGroupProductCounts1.hashCode(), catalogsHotelProductGroupProductCounts2.hashCode());
        System.assertEquals(catalogsHotelProductGroupProductCounts3.hashCode(), catalogsHotelProductGroupProductCounts4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelProductGroupProductC catalogsHotelProductGroupProductCounts = new OASCatalogsHotelProductGroupProductC();
        Map<String, String> x-property-mappings = catalogsHotelProductGroupProductCounts.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
