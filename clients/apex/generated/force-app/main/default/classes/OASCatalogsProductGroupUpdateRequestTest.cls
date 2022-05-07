@isTest
private class OASCatalogsProductGroupUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest1 = OASCatalogsProductGroupUpdateRequest.getExample();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest2 = catalogsProductGroupUpdateRequest1;
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest3 = new OASCatalogsProductGroupUpdateRequest();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest4 = catalogsProductGroupUpdateRequest3;

        System.assert(catalogsProductGroupUpdateRequest1.equals(catalogsProductGroupUpdateRequest2));
        System.assert(catalogsProductGroupUpdateRequest2.equals(catalogsProductGroupUpdateRequest1));
        System.assert(catalogsProductGroupUpdateRequest1.equals(catalogsProductGroupUpdateRequest1));
        System.assert(catalogsProductGroupUpdateRequest3.equals(catalogsProductGroupUpdateRequest4));
        System.assert(catalogsProductGroupUpdateRequest4.equals(catalogsProductGroupUpdateRequest3));
        System.assert(catalogsProductGroupUpdateRequest3.equals(catalogsProductGroupUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest1 = OASCatalogsProductGroupUpdateRequest.getExample();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest2 = OASCatalogsProductGroupUpdateRequest.getExample();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest3 = new OASCatalogsProductGroupUpdateRequest();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest4 = new OASCatalogsProductGroupUpdateRequest();

        System.assert(catalogsProductGroupUpdateRequest1.equals(catalogsProductGroupUpdateRequest2));
        System.assert(catalogsProductGroupUpdateRequest2.equals(catalogsProductGroupUpdateRequest1));
        System.assert(catalogsProductGroupUpdateRequest3.equals(catalogsProductGroupUpdateRequest4));
        System.assert(catalogsProductGroupUpdateRequest4.equals(catalogsProductGroupUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest1 = OASCatalogsProductGroupUpdateRequest.getExample();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest2 = new OASCatalogsProductGroupUpdateRequest();

        System.assertEquals(false, catalogsProductGroupUpdateRequest1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest1 = OASCatalogsProductGroupUpdateRequest.getExample();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest2 = new OASCatalogsProductGroupUpdateRequest();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest3;

        System.assertEquals(false, catalogsProductGroupUpdateRequest1.equals(catalogsProductGroupUpdateRequest3));
        System.assertEquals(false, catalogsProductGroupUpdateRequest2.equals(catalogsProductGroupUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest1 = OASCatalogsProductGroupUpdateRequest.getExample();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest2 = new OASCatalogsProductGroupUpdateRequest();

        System.assertEquals(catalogsProductGroupUpdateRequest1.hashCode(), catalogsProductGroupUpdateRequest1.hashCode());
        System.assertEquals(catalogsProductGroupUpdateRequest2.hashCode(), catalogsProductGroupUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest1 = OASCatalogsProductGroupUpdateRequest.getExample();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest2 = OASCatalogsProductGroupUpdateRequest.getExample();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest3 = new OASCatalogsProductGroupUpdateRequest();
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest4 = new OASCatalogsProductGroupUpdateRequest();

        System.assert(catalogsProductGroupUpdateRequest1.equals(catalogsProductGroupUpdateRequest2));
        System.assert(catalogsProductGroupUpdateRequest3.equals(catalogsProductGroupUpdateRequest4));
        System.assertEquals(catalogsProductGroupUpdateRequest1.hashCode(), catalogsProductGroupUpdateRequest2.hashCode());
        System.assertEquals(catalogsProductGroupUpdateRequest3.hashCode(), catalogsProductGroupUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest = new OASCatalogsProductGroupUpdateRequest();
        Map<String, String> x-property-mappings = catalogsProductGroupUpdateRequest.getx-property-mappings();
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
    }
}
