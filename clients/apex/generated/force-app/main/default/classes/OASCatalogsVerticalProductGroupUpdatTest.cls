@isTest
private class OASCatalogsVerticalProductGroupUpdatTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest1 = OASCatalogsVerticalProductGroupUpdat.getExample();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest2 = catalogsVerticalProductGroupUpdateRequest1;
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest3 = new OASCatalogsVerticalProductGroupUpdat();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest4 = catalogsVerticalProductGroupUpdateRequest3;

        System.assert(catalogsVerticalProductGroupUpdateRequest1.equals(catalogsVerticalProductGroupUpdateRequest2));
        System.assert(catalogsVerticalProductGroupUpdateRequest2.equals(catalogsVerticalProductGroupUpdateRequest1));
        System.assert(catalogsVerticalProductGroupUpdateRequest1.equals(catalogsVerticalProductGroupUpdateRequest1));
        System.assert(catalogsVerticalProductGroupUpdateRequest3.equals(catalogsVerticalProductGroupUpdateRequest4));
        System.assert(catalogsVerticalProductGroupUpdateRequest4.equals(catalogsVerticalProductGroupUpdateRequest3));
        System.assert(catalogsVerticalProductGroupUpdateRequest3.equals(catalogsVerticalProductGroupUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest1 = OASCatalogsVerticalProductGroupUpdat.getExample();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest2 = OASCatalogsVerticalProductGroupUpdat.getExample();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest3 = new OASCatalogsVerticalProductGroupUpdat();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest4 = new OASCatalogsVerticalProductGroupUpdat();

        System.assert(catalogsVerticalProductGroupUpdateRequest1.equals(catalogsVerticalProductGroupUpdateRequest2));
        System.assert(catalogsVerticalProductGroupUpdateRequest2.equals(catalogsVerticalProductGroupUpdateRequest1));
        System.assert(catalogsVerticalProductGroupUpdateRequest3.equals(catalogsVerticalProductGroupUpdateRequest4));
        System.assert(catalogsVerticalProductGroupUpdateRequest4.equals(catalogsVerticalProductGroupUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest1 = OASCatalogsVerticalProductGroupUpdat.getExample();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest2 = new OASCatalogsVerticalProductGroupUpdat();

        System.assertEquals(false, catalogsVerticalProductGroupUpdateRequest1.equals('foo'));
        System.assertEquals(false, catalogsVerticalProductGroupUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest1 = OASCatalogsVerticalProductGroupUpdat.getExample();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest2 = new OASCatalogsVerticalProductGroupUpdat();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest3;

        System.assertEquals(false, catalogsVerticalProductGroupUpdateRequest1.equals(catalogsVerticalProductGroupUpdateRequest3));
        System.assertEquals(false, catalogsVerticalProductGroupUpdateRequest2.equals(catalogsVerticalProductGroupUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest1 = OASCatalogsVerticalProductGroupUpdat.getExample();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest2 = new OASCatalogsVerticalProductGroupUpdat();

        System.assertEquals(catalogsVerticalProductGroupUpdateRequest1.hashCode(), catalogsVerticalProductGroupUpdateRequest1.hashCode());
        System.assertEquals(catalogsVerticalProductGroupUpdateRequest2.hashCode(), catalogsVerticalProductGroupUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest1 = OASCatalogsVerticalProductGroupUpdat.getExample();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest2 = OASCatalogsVerticalProductGroupUpdat.getExample();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest3 = new OASCatalogsVerticalProductGroupUpdat();
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest4 = new OASCatalogsVerticalProductGroupUpdat();

        System.assert(catalogsVerticalProductGroupUpdateRequest1.equals(catalogsVerticalProductGroupUpdateRequest2));
        System.assert(catalogsVerticalProductGroupUpdateRequest3.equals(catalogsVerticalProductGroupUpdateRequest4));
        System.assertEquals(catalogsVerticalProductGroupUpdateRequest1.hashCode(), catalogsVerticalProductGroupUpdateRequest2.hashCode());
        System.assertEquals(catalogsVerticalProductGroupUpdateRequest3.hashCode(), catalogsVerticalProductGroupUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsVerticalProductGroupUpdat catalogsVerticalProductGroupUpdateRequest = new OASCatalogsVerticalProductGroupUpdat();
        Map<String, String> x-property-mappings = catalogsVerticalProductGroupUpdateRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
