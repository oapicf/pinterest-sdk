@isTest
private class OASCatalogsHotelProductGroupUpdateReTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest1 = OASCatalogsHotelProductGroupUpdateRe.getExample();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest2 = catalogsHotelProductGroupUpdateRequest1;
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest3 = new OASCatalogsHotelProductGroupUpdateRe();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest4 = catalogsHotelProductGroupUpdateRequest3;

        System.assert(catalogsHotelProductGroupUpdateRequest1.equals(catalogsHotelProductGroupUpdateRequest2));
        System.assert(catalogsHotelProductGroupUpdateRequest2.equals(catalogsHotelProductGroupUpdateRequest1));
        System.assert(catalogsHotelProductGroupUpdateRequest1.equals(catalogsHotelProductGroupUpdateRequest1));
        System.assert(catalogsHotelProductGroupUpdateRequest3.equals(catalogsHotelProductGroupUpdateRequest4));
        System.assert(catalogsHotelProductGroupUpdateRequest4.equals(catalogsHotelProductGroupUpdateRequest3));
        System.assert(catalogsHotelProductGroupUpdateRequest3.equals(catalogsHotelProductGroupUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest1 = OASCatalogsHotelProductGroupUpdateRe.getExample();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest2 = OASCatalogsHotelProductGroupUpdateRe.getExample();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest3 = new OASCatalogsHotelProductGroupUpdateRe();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest4 = new OASCatalogsHotelProductGroupUpdateRe();

        System.assert(catalogsHotelProductGroupUpdateRequest1.equals(catalogsHotelProductGroupUpdateRequest2));
        System.assert(catalogsHotelProductGroupUpdateRequest2.equals(catalogsHotelProductGroupUpdateRequest1));
        System.assert(catalogsHotelProductGroupUpdateRequest3.equals(catalogsHotelProductGroupUpdateRequest4));
        System.assert(catalogsHotelProductGroupUpdateRequest4.equals(catalogsHotelProductGroupUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest1 = OASCatalogsHotelProductGroupUpdateRe.getExample();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest2 = new OASCatalogsHotelProductGroupUpdateRe();

        System.assertEquals(false, catalogsHotelProductGroupUpdateRequest1.equals('foo'));
        System.assertEquals(false, catalogsHotelProductGroupUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest1 = OASCatalogsHotelProductGroupUpdateRe.getExample();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest2 = new OASCatalogsHotelProductGroupUpdateRe();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest3;

        System.assertEquals(false, catalogsHotelProductGroupUpdateRequest1.equals(catalogsHotelProductGroupUpdateRequest3));
        System.assertEquals(false, catalogsHotelProductGroupUpdateRequest2.equals(catalogsHotelProductGroupUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest1 = OASCatalogsHotelProductGroupUpdateRe.getExample();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest2 = new OASCatalogsHotelProductGroupUpdateRe();

        System.assertEquals(catalogsHotelProductGroupUpdateRequest1.hashCode(), catalogsHotelProductGroupUpdateRequest1.hashCode());
        System.assertEquals(catalogsHotelProductGroupUpdateRequest2.hashCode(), catalogsHotelProductGroupUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest1 = OASCatalogsHotelProductGroupUpdateRe.getExample();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest2 = OASCatalogsHotelProductGroupUpdateRe.getExample();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest3 = new OASCatalogsHotelProductGroupUpdateRe();
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest4 = new OASCatalogsHotelProductGroupUpdateRe();

        System.assert(catalogsHotelProductGroupUpdateRequest1.equals(catalogsHotelProductGroupUpdateRequest2));
        System.assert(catalogsHotelProductGroupUpdateRequest3.equals(catalogsHotelProductGroupUpdateRequest4));
        System.assertEquals(catalogsHotelProductGroupUpdateRequest1.hashCode(), catalogsHotelProductGroupUpdateRequest2.hashCode());
        System.assertEquals(catalogsHotelProductGroupUpdateRequest3.hashCode(), catalogsHotelProductGroupUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelProductGroupUpdateRe catalogsHotelProductGroupUpdateRequest = new OASCatalogsHotelProductGroupUpdateRe();
        Map<String, String> x-property-mappings = catalogsHotelProductGroupUpdateRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
