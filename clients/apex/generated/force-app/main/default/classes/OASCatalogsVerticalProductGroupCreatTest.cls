@isTest
private class OASCatalogsVerticalProductGroupCreatTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest1 = OASCatalogsVerticalProductGroupCreat.getExample();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest2 = catalogsVerticalProductGroupCreateRequest1;
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest3 = new OASCatalogsVerticalProductGroupCreat();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest4 = catalogsVerticalProductGroupCreateRequest3;

        System.assert(catalogsVerticalProductGroupCreateRequest1.equals(catalogsVerticalProductGroupCreateRequest2));
        System.assert(catalogsVerticalProductGroupCreateRequest2.equals(catalogsVerticalProductGroupCreateRequest1));
        System.assert(catalogsVerticalProductGroupCreateRequest1.equals(catalogsVerticalProductGroupCreateRequest1));
        System.assert(catalogsVerticalProductGroupCreateRequest3.equals(catalogsVerticalProductGroupCreateRequest4));
        System.assert(catalogsVerticalProductGroupCreateRequest4.equals(catalogsVerticalProductGroupCreateRequest3));
        System.assert(catalogsVerticalProductGroupCreateRequest3.equals(catalogsVerticalProductGroupCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest1 = OASCatalogsVerticalProductGroupCreat.getExample();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest2 = OASCatalogsVerticalProductGroupCreat.getExample();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest3 = new OASCatalogsVerticalProductGroupCreat();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest4 = new OASCatalogsVerticalProductGroupCreat();

        System.assert(catalogsVerticalProductGroupCreateRequest1.equals(catalogsVerticalProductGroupCreateRequest2));
        System.assert(catalogsVerticalProductGroupCreateRequest2.equals(catalogsVerticalProductGroupCreateRequest1));
        System.assert(catalogsVerticalProductGroupCreateRequest3.equals(catalogsVerticalProductGroupCreateRequest4));
        System.assert(catalogsVerticalProductGroupCreateRequest4.equals(catalogsVerticalProductGroupCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest1 = OASCatalogsVerticalProductGroupCreat.getExample();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest2 = new OASCatalogsVerticalProductGroupCreat();

        System.assertEquals(false, catalogsVerticalProductGroupCreateRequest1.equals('foo'));
        System.assertEquals(false, catalogsVerticalProductGroupCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest1 = OASCatalogsVerticalProductGroupCreat.getExample();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest2 = new OASCatalogsVerticalProductGroupCreat();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest3;

        System.assertEquals(false, catalogsVerticalProductGroupCreateRequest1.equals(catalogsVerticalProductGroupCreateRequest3));
        System.assertEquals(false, catalogsVerticalProductGroupCreateRequest2.equals(catalogsVerticalProductGroupCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest1 = OASCatalogsVerticalProductGroupCreat.getExample();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest2 = new OASCatalogsVerticalProductGroupCreat();

        System.assertEquals(catalogsVerticalProductGroupCreateRequest1.hashCode(), catalogsVerticalProductGroupCreateRequest1.hashCode());
        System.assertEquals(catalogsVerticalProductGroupCreateRequest2.hashCode(), catalogsVerticalProductGroupCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest1 = OASCatalogsVerticalProductGroupCreat.getExample();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest2 = OASCatalogsVerticalProductGroupCreat.getExample();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest3 = new OASCatalogsVerticalProductGroupCreat();
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest4 = new OASCatalogsVerticalProductGroupCreat();

        System.assert(catalogsVerticalProductGroupCreateRequest1.equals(catalogsVerticalProductGroupCreateRequest2));
        System.assert(catalogsVerticalProductGroupCreateRequest3.equals(catalogsVerticalProductGroupCreateRequest4));
        System.assertEquals(catalogsVerticalProductGroupCreateRequest1.hashCode(), catalogsVerticalProductGroupCreateRequest2.hashCode());
        System.assertEquals(catalogsVerticalProductGroupCreateRequest3.hashCode(), catalogsVerticalProductGroupCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsVerticalProductGroupCreat catalogsVerticalProductGroupCreateRequest = new OASCatalogsVerticalProductGroupCreat();
        Map<String, String> x-property-mappings = catalogsVerticalProductGroupCreateRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
