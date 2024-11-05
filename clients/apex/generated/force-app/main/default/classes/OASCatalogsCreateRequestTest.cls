@isTest
private class OASCatalogsCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreateRequest catalogsCreateRequest1 = OASCatalogsCreateRequest.getExample();
        OASCatalogsCreateRequest catalogsCreateRequest2 = catalogsCreateRequest1;
        OASCatalogsCreateRequest catalogsCreateRequest3 = new OASCatalogsCreateRequest();
        OASCatalogsCreateRequest catalogsCreateRequest4 = catalogsCreateRequest3;

        System.assert(catalogsCreateRequest1.equals(catalogsCreateRequest2));
        System.assert(catalogsCreateRequest2.equals(catalogsCreateRequest1));
        System.assert(catalogsCreateRequest1.equals(catalogsCreateRequest1));
        System.assert(catalogsCreateRequest3.equals(catalogsCreateRequest4));
        System.assert(catalogsCreateRequest4.equals(catalogsCreateRequest3));
        System.assert(catalogsCreateRequest3.equals(catalogsCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreateRequest catalogsCreateRequest1 = OASCatalogsCreateRequest.getExample();
        OASCatalogsCreateRequest catalogsCreateRequest2 = OASCatalogsCreateRequest.getExample();
        OASCatalogsCreateRequest catalogsCreateRequest3 = new OASCatalogsCreateRequest();
        OASCatalogsCreateRequest catalogsCreateRequest4 = new OASCatalogsCreateRequest();

        System.assert(catalogsCreateRequest1.equals(catalogsCreateRequest2));
        System.assert(catalogsCreateRequest2.equals(catalogsCreateRequest1));
        System.assert(catalogsCreateRequest3.equals(catalogsCreateRequest4));
        System.assert(catalogsCreateRequest4.equals(catalogsCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreateRequest catalogsCreateRequest1 = OASCatalogsCreateRequest.getExample();
        OASCatalogsCreateRequest catalogsCreateRequest2 = new OASCatalogsCreateRequest();

        System.assertEquals(false, catalogsCreateRequest1.equals('foo'));
        System.assertEquals(false, catalogsCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreateRequest catalogsCreateRequest1 = OASCatalogsCreateRequest.getExample();
        OASCatalogsCreateRequest catalogsCreateRequest2 = new OASCatalogsCreateRequest();
        OASCatalogsCreateRequest catalogsCreateRequest3;

        System.assertEquals(false, catalogsCreateRequest1.equals(catalogsCreateRequest3));
        System.assertEquals(false, catalogsCreateRequest2.equals(catalogsCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreateRequest catalogsCreateRequest1 = OASCatalogsCreateRequest.getExample();
        OASCatalogsCreateRequest catalogsCreateRequest2 = new OASCatalogsCreateRequest();

        System.assertEquals(catalogsCreateRequest1.hashCode(), catalogsCreateRequest1.hashCode());
        System.assertEquals(catalogsCreateRequest2.hashCode(), catalogsCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreateRequest catalogsCreateRequest1 = OASCatalogsCreateRequest.getExample();
        OASCatalogsCreateRequest catalogsCreateRequest2 = OASCatalogsCreateRequest.getExample();
        OASCatalogsCreateRequest catalogsCreateRequest3 = new OASCatalogsCreateRequest();
        OASCatalogsCreateRequest catalogsCreateRequest4 = new OASCatalogsCreateRequest();

        System.assert(catalogsCreateRequest1.equals(catalogsCreateRequest2));
        System.assert(catalogsCreateRequest3.equals(catalogsCreateRequest4));
        System.assertEquals(catalogsCreateRequest1.hashCode(), catalogsCreateRequest2.hashCode());
        System.assertEquals(catalogsCreateRequest3.hashCode(), catalogsCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreateRequest catalogsCreateRequest = new OASCatalogsCreateRequest();
        Map<String, String> x-property-mappings = catalogsCreateRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
