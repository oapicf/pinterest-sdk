@isTest
private class OASCatalogsProductGroupCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest1 = OASCatalogsProductGroupCreateRequest.getExample();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest2 = catalogsProductGroupCreateRequest1;
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest3 = new OASCatalogsProductGroupCreateRequest();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest4 = catalogsProductGroupCreateRequest3;

        System.assert(catalogsProductGroupCreateRequest1.equals(catalogsProductGroupCreateRequest2));
        System.assert(catalogsProductGroupCreateRequest2.equals(catalogsProductGroupCreateRequest1));
        System.assert(catalogsProductGroupCreateRequest1.equals(catalogsProductGroupCreateRequest1));
        System.assert(catalogsProductGroupCreateRequest3.equals(catalogsProductGroupCreateRequest4));
        System.assert(catalogsProductGroupCreateRequest4.equals(catalogsProductGroupCreateRequest3));
        System.assert(catalogsProductGroupCreateRequest3.equals(catalogsProductGroupCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest1 = OASCatalogsProductGroupCreateRequest.getExample();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest2 = OASCatalogsProductGroupCreateRequest.getExample();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest3 = new OASCatalogsProductGroupCreateRequest();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest4 = new OASCatalogsProductGroupCreateRequest();

        System.assert(catalogsProductGroupCreateRequest1.equals(catalogsProductGroupCreateRequest2));
        System.assert(catalogsProductGroupCreateRequest2.equals(catalogsProductGroupCreateRequest1));
        System.assert(catalogsProductGroupCreateRequest3.equals(catalogsProductGroupCreateRequest4));
        System.assert(catalogsProductGroupCreateRequest4.equals(catalogsProductGroupCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest1 = OASCatalogsProductGroupCreateRequest.getExample();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest2 = new OASCatalogsProductGroupCreateRequest();

        System.assertEquals(false, catalogsProductGroupCreateRequest1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest1 = OASCatalogsProductGroupCreateRequest.getExample();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest2 = new OASCatalogsProductGroupCreateRequest();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest3;

        System.assertEquals(false, catalogsProductGroupCreateRequest1.equals(catalogsProductGroupCreateRequest3));
        System.assertEquals(false, catalogsProductGroupCreateRequest2.equals(catalogsProductGroupCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest1 = OASCatalogsProductGroupCreateRequest.getExample();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest2 = new OASCatalogsProductGroupCreateRequest();

        System.assertEquals(catalogsProductGroupCreateRequest1.hashCode(), catalogsProductGroupCreateRequest1.hashCode());
        System.assertEquals(catalogsProductGroupCreateRequest2.hashCode(), catalogsProductGroupCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest1 = OASCatalogsProductGroupCreateRequest.getExample();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest2 = OASCatalogsProductGroupCreateRequest.getExample();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest3 = new OASCatalogsProductGroupCreateRequest();
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest4 = new OASCatalogsProductGroupCreateRequest();

        System.assert(catalogsProductGroupCreateRequest1.equals(catalogsProductGroupCreateRequest2));
        System.assert(catalogsProductGroupCreateRequest3.equals(catalogsProductGroupCreateRequest4));
        System.assertEquals(catalogsProductGroupCreateRequest1.hashCode(), catalogsProductGroupCreateRequest2.hashCode());
        System.assertEquals(catalogsProductGroupCreateRequest3.hashCode(), catalogsProductGroupCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest = new OASCatalogsProductGroupCreateRequest();
        Map<String, String> x-property-mappings = catalogsProductGroupCreateRequest.getx-property-mappings();
        System.assertEquals('isFeatured', x-property-mappings.get('is_featured'));
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest = new OASCatalogsProductGroupCreateRequest();
        System.assertEquals(false, catalogsProductGroupCreateRequest.isFeatured);
        System.assertEquals(null, catalogsProductGroupCreateRequest.name);
        System.assertEquals(null, catalogsProductGroupCreateRequest.description);
        System.assertEquals(null, catalogsProductGroupCreateRequest.filters);
        System.assertEquals(null, catalogsProductGroupCreateRequest.feedId);
    }
}
