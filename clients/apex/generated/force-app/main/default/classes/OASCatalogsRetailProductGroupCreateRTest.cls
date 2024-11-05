@isTest
private class OASCatalogsRetailProductGroupCreateRTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest1 = OASCatalogsRetailProductGroupCreateR.getExample();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest2 = catalogsRetailProductGroupCreateRequest1;
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest3 = new OASCatalogsRetailProductGroupCreateR();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest4 = catalogsRetailProductGroupCreateRequest3;

        System.assert(catalogsRetailProductGroupCreateRequest1.equals(catalogsRetailProductGroupCreateRequest2));
        System.assert(catalogsRetailProductGroupCreateRequest2.equals(catalogsRetailProductGroupCreateRequest1));
        System.assert(catalogsRetailProductGroupCreateRequest1.equals(catalogsRetailProductGroupCreateRequest1));
        System.assert(catalogsRetailProductGroupCreateRequest3.equals(catalogsRetailProductGroupCreateRequest4));
        System.assert(catalogsRetailProductGroupCreateRequest4.equals(catalogsRetailProductGroupCreateRequest3));
        System.assert(catalogsRetailProductGroupCreateRequest3.equals(catalogsRetailProductGroupCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest1 = OASCatalogsRetailProductGroupCreateR.getExample();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest2 = OASCatalogsRetailProductGroupCreateR.getExample();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest3 = new OASCatalogsRetailProductGroupCreateR();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest4 = new OASCatalogsRetailProductGroupCreateR();

        System.assert(catalogsRetailProductGroupCreateRequest1.equals(catalogsRetailProductGroupCreateRequest2));
        System.assert(catalogsRetailProductGroupCreateRequest2.equals(catalogsRetailProductGroupCreateRequest1));
        System.assert(catalogsRetailProductGroupCreateRequest3.equals(catalogsRetailProductGroupCreateRequest4));
        System.assert(catalogsRetailProductGroupCreateRequest4.equals(catalogsRetailProductGroupCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest1 = OASCatalogsRetailProductGroupCreateR.getExample();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest2 = new OASCatalogsRetailProductGroupCreateR();

        System.assertEquals(false, catalogsRetailProductGroupCreateRequest1.equals('foo'));
        System.assertEquals(false, catalogsRetailProductGroupCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest1 = OASCatalogsRetailProductGroupCreateR.getExample();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest2 = new OASCatalogsRetailProductGroupCreateR();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest3;

        System.assertEquals(false, catalogsRetailProductGroupCreateRequest1.equals(catalogsRetailProductGroupCreateRequest3));
        System.assertEquals(false, catalogsRetailProductGroupCreateRequest2.equals(catalogsRetailProductGroupCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest1 = OASCatalogsRetailProductGroupCreateR.getExample();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest2 = new OASCatalogsRetailProductGroupCreateR();

        System.assertEquals(catalogsRetailProductGroupCreateRequest1.hashCode(), catalogsRetailProductGroupCreateRequest1.hashCode());
        System.assertEquals(catalogsRetailProductGroupCreateRequest2.hashCode(), catalogsRetailProductGroupCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest1 = OASCatalogsRetailProductGroupCreateR.getExample();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest2 = OASCatalogsRetailProductGroupCreateR.getExample();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest3 = new OASCatalogsRetailProductGroupCreateR();
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest4 = new OASCatalogsRetailProductGroupCreateR();

        System.assert(catalogsRetailProductGroupCreateRequest1.equals(catalogsRetailProductGroupCreateRequest2));
        System.assert(catalogsRetailProductGroupCreateRequest3.equals(catalogsRetailProductGroupCreateRequest4));
        System.assertEquals(catalogsRetailProductGroupCreateRequest1.hashCode(), catalogsRetailProductGroupCreateRequest2.hashCode());
        System.assertEquals(catalogsRetailProductGroupCreateRequest3.hashCode(), catalogsRetailProductGroupCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest = new OASCatalogsRetailProductGroupCreateR();
        Map<String, String> x-property-mappings = catalogsRetailProductGroupCreateRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
