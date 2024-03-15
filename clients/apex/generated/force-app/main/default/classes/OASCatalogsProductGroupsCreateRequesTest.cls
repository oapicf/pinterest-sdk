@isTest
private class OASCatalogsProductGroupsCreateRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest1 = OASCatalogsProductGroupsCreateReques.getExample();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest2 = catalogsProductGroupsCreateRequest1;
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest3 = new OASCatalogsProductGroupsCreateReques();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest4 = catalogsProductGroupsCreateRequest3;

        System.assert(catalogsProductGroupsCreateRequest1.equals(catalogsProductGroupsCreateRequest2));
        System.assert(catalogsProductGroupsCreateRequest2.equals(catalogsProductGroupsCreateRequest1));
        System.assert(catalogsProductGroupsCreateRequest1.equals(catalogsProductGroupsCreateRequest1));
        System.assert(catalogsProductGroupsCreateRequest3.equals(catalogsProductGroupsCreateRequest4));
        System.assert(catalogsProductGroupsCreateRequest4.equals(catalogsProductGroupsCreateRequest3));
        System.assert(catalogsProductGroupsCreateRequest3.equals(catalogsProductGroupsCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest1 = OASCatalogsProductGroupsCreateReques.getExample();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest2 = OASCatalogsProductGroupsCreateReques.getExample();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest3 = new OASCatalogsProductGroupsCreateReques();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest4 = new OASCatalogsProductGroupsCreateReques();

        System.assert(catalogsProductGroupsCreateRequest1.equals(catalogsProductGroupsCreateRequest2));
        System.assert(catalogsProductGroupsCreateRequest2.equals(catalogsProductGroupsCreateRequest1));
        System.assert(catalogsProductGroupsCreateRequest3.equals(catalogsProductGroupsCreateRequest4));
        System.assert(catalogsProductGroupsCreateRequest4.equals(catalogsProductGroupsCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest1 = OASCatalogsProductGroupsCreateReques.getExample();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest2 = new OASCatalogsProductGroupsCreateReques();

        System.assertEquals(false, catalogsProductGroupsCreateRequest1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupsCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest1 = OASCatalogsProductGroupsCreateReques.getExample();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest2 = new OASCatalogsProductGroupsCreateReques();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest3;

        System.assertEquals(false, catalogsProductGroupsCreateRequest1.equals(catalogsProductGroupsCreateRequest3));
        System.assertEquals(false, catalogsProductGroupsCreateRequest2.equals(catalogsProductGroupsCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest1 = OASCatalogsProductGroupsCreateReques.getExample();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest2 = new OASCatalogsProductGroupsCreateReques();

        System.assertEquals(catalogsProductGroupsCreateRequest1.hashCode(), catalogsProductGroupsCreateRequest1.hashCode());
        System.assertEquals(catalogsProductGroupsCreateRequest2.hashCode(), catalogsProductGroupsCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest1 = OASCatalogsProductGroupsCreateReques.getExample();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest2 = OASCatalogsProductGroupsCreateReques.getExample();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest3 = new OASCatalogsProductGroupsCreateReques();
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest4 = new OASCatalogsProductGroupsCreateReques();

        System.assert(catalogsProductGroupsCreateRequest1.equals(catalogsProductGroupsCreateRequest2));
        System.assert(catalogsProductGroupsCreateRequest3.equals(catalogsProductGroupsCreateRequest4));
        System.assertEquals(catalogsProductGroupsCreateRequest1.hashCode(), catalogsProductGroupsCreateRequest2.hashCode());
        System.assertEquals(catalogsProductGroupsCreateRequest3.hashCode(), catalogsProductGroupsCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest = new OASCatalogsProductGroupsCreateReques();
        Map<String, String> x-property-mappings = catalogsProductGroupsCreateRequest.getx-property-mappings();
        System.assertEquals('isFeatured', x-property-mappings.get('is_featured'));
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupsCreateReques catalogsProductGroupsCreateRequest = new OASCatalogsProductGroupsCreateReques();
        System.assertEquals(false, catalogsProductGroupsCreateRequest.isFeatured);
        System.assertEquals(null, catalogsProductGroupsCreateRequest.name);
        System.assertEquals(null, catalogsProductGroupsCreateRequest.description);
        System.assertEquals(null, catalogsProductGroupsCreateRequest.filters);
        System.assertEquals(null, catalogsProductGroupsCreateRequest.feedId);
        System.assertEquals(null, catalogsProductGroupsCreateRequest.catalogType);
        System.assertEquals(null, catalogsProductGroupsCreateRequest.catalogId);
    }
}
