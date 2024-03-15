@isTest
private class OASCatalogsHotelProductGroupCreateReTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest1 = OASCatalogsHotelProductGroupCreateRe.getExample();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest2 = catalogsHotelProductGroupCreateRequest1;
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest3 = new OASCatalogsHotelProductGroupCreateRe();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest4 = catalogsHotelProductGroupCreateRequest3;

        System.assert(catalogsHotelProductGroupCreateRequest1.equals(catalogsHotelProductGroupCreateRequest2));
        System.assert(catalogsHotelProductGroupCreateRequest2.equals(catalogsHotelProductGroupCreateRequest1));
        System.assert(catalogsHotelProductGroupCreateRequest1.equals(catalogsHotelProductGroupCreateRequest1));
        System.assert(catalogsHotelProductGroupCreateRequest3.equals(catalogsHotelProductGroupCreateRequest4));
        System.assert(catalogsHotelProductGroupCreateRequest4.equals(catalogsHotelProductGroupCreateRequest3));
        System.assert(catalogsHotelProductGroupCreateRequest3.equals(catalogsHotelProductGroupCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest1 = OASCatalogsHotelProductGroupCreateRe.getExample();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest2 = OASCatalogsHotelProductGroupCreateRe.getExample();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest3 = new OASCatalogsHotelProductGroupCreateRe();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest4 = new OASCatalogsHotelProductGroupCreateRe();

        System.assert(catalogsHotelProductGroupCreateRequest1.equals(catalogsHotelProductGroupCreateRequest2));
        System.assert(catalogsHotelProductGroupCreateRequest2.equals(catalogsHotelProductGroupCreateRequest1));
        System.assert(catalogsHotelProductGroupCreateRequest3.equals(catalogsHotelProductGroupCreateRequest4));
        System.assert(catalogsHotelProductGroupCreateRequest4.equals(catalogsHotelProductGroupCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest1 = OASCatalogsHotelProductGroupCreateRe.getExample();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest2 = new OASCatalogsHotelProductGroupCreateRe();

        System.assertEquals(false, catalogsHotelProductGroupCreateRequest1.equals('foo'));
        System.assertEquals(false, catalogsHotelProductGroupCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest1 = OASCatalogsHotelProductGroupCreateRe.getExample();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest2 = new OASCatalogsHotelProductGroupCreateRe();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest3;

        System.assertEquals(false, catalogsHotelProductGroupCreateRequest1.equals(catalogsHotelProductGroupCreateRequest3));
        System.assertEquals(false, catalogsHotelProductGroupCreateRequest2.equals(catalogsHotelProductGroupCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest1 = OASCatalogsHotelProductGroupCreateRe.getExample();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest2 = new OASCatalogsHotelProductGroupCreateRe();

        System.assertEquals(catalogsHotelProductGroupCreateRequest1.hashCode(), catalogsHotelProductGroupCreateRequest1.hashCode());
        System.assertEquals(catalogsHotelProductGroupCreateRequest2.hashCode(), catalogsHotelProductGroupCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest1 = OASCatalogsHotelProductGroupCreateRe.getExample();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest2 = OASCatalogsHotelProductGroupCreateRe.getExample();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest3 = new OASCatalogsHotelProductGroupCreateRe();
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest4 = new OASCatalogsHotelProductGroupCreateRe();

        System.assert(catalogsHotelProductGroupCreateRequest1.equals(catalogsHotelProductGroupCreateRequest2));
        System.assert(catalogsHotelProductGroupCreateRequest3.equals(catalogsHotelProductGroupCreateRequest4));
        System.assertEquals(catalogsHotelProductGroupCreateRequest1.hashCode(), catalogsHotelProductGroupCreateRequest2.hashCode());
        System.assertEquals(catalogsHotelProductGroupCreateRequest3.hashCode(), catalogsHotelProductGroupCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelProductGroupCreateRe catalogsHotelProductGroupCreateRequest = new OASCatalogsHotelProductGroupCreateRe();
        Map<String, String> x-property-mappings = catalogsHotelProductGroupCreateRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
