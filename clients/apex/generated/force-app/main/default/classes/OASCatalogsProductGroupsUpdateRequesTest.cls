@isTest
private class OASCatalogsProductGroupsUpdateRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest1 = OASCatalogsProductGroupsUpdateReques.getExample();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest2 = catalogsProductGroupsUpdateRequest1;
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest3 = new OASCatalogsProductGroupsUpdateReques();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest4 = catalogsProductGroupsUpdateRequest3;

        System.assert(catalogsProductGroupsUpdateRequest1.equals(catalogsProductGroupsUpdateRequest2));
        System.assert(catalogsProductGroupsUpdateRequest2.equals(catalogsProductGroupsUpdateRequest1));
        System.assert(catalogsProductGroupsUpdateRequest1.equals(catalogsProductGroupsUpdateRequest1));
        System.assert(catalogsProductGroupsUpdateRequest3.equals(catalogsProductGroupsUpdateRequest4));
        System.assert(catalogsProductGroupsUpdateRequest4.equals(catalogsProductGroupsUpdateRequest3));
        System.assert(catalogsProductGroupsUpdateRequest3.equals(catalogsProductGroupsUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest1 = OASCatalogsProductGroupsUpdateReques.getExample();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest2 = OASCatalogsProductGroupsUpdateReques.getExample();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest3 = new OASCatalogsProductGroupsUpdateReques();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest4 = new OASCatalogsProductGroupsUpdateReques();

        System.assert(catalogsProductGroupsUpdateRequest1.equals(catalogsProductGroupsUpdateRequest2));
        System.assert(catalogsProductGroupsUpdateRequest2.equals(catalogsProductGroupsUpdateRequest1));
        System.assert(catalogsProductGroupsUpdateRequest3.equals(catalogsProductGroupsUpdateRequest4));
        System.assert(catalogsProductGroupsUpdateRequest4.equals(catalogsProductGroupsUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest1 = OASCatalogsProductGroupsUpdateReques.getExample();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest2 = new OASCatalogsProductGroupsUpdateReques();

        System.assertEquals(false, catalogsProductGroupsUpdateRequest1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupsUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest1 = OASCatalogsProductGroupsUpdateReques.getExample();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest2 = new OASCatalogsProductGroupsUpdateReques();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest3;

        System.assertEquals(false, catalogsProductGroupsUpdateRequest1.equals(catalogsProductGroupsUpdateRequest3));
        System.assertEquals(false, catalogsProductGroupsUpdateRequest2.equals(catalogsProductGroupsUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest1 = OASCatalogsProductGroupsUpdateReques.getExample();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest2 = new OASCatalogsProductGroupsUpdateReques();

        System.assertEquals(catalogsProductGroupsUpdateRequest1.hashCode(), catalogsProductGroupsUpdateRequest1.hashCode());
        System.assertEquals(catalogsProductGroupsUpdateRequest2.hashCode(), catalogsProductGroupsUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest1 = OASCatalogsProductGroupsUpdateReques.getExample();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest2 = OASCatalogsProductGroupsUpdateReques.getExample();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest3 = new OASCatalogsProductGroupsUpdateReques();
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest4 = new OASCatalogsProductGroupsUpdateReques();

        System.assert(catalogsProductGroupsUpdateRequest1.equals(catalogsProductGroupsUpdateRequest2));
        System.assert(catalogsProductGroupsUpdateRequest3.equals(catalogsProductGroupsUpdateRequest4));
        System.assertEquals(catalogsProductGroupsUpdateRequest1.hashCode(), catalogsProductGroupsUpdateRequest2.hashCode());
        System.assertEquals(catalogsProductGroupsUpdateRequest3.hashCode(), catalogsProductGroupsUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupsUpdateReques catalogsProductGroupsUpdateRequest = new OASCatalogsProductGroupsUpdateReques();
        Map<String, String> x-property-mappings = catalogsProductGroupsUpdateRequest.getx-property-mappings();
        System.assertEquals('isFeatured', x-property-mappings.get('is_featured'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
