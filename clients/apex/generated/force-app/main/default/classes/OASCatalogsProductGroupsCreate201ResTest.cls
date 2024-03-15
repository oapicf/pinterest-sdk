@isTest
private class OASCatalogsProductGroupsCreate201ResTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response1 = OASCatalogsProductGroupsCreate201Res.getExample();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response2 = catalogsProductGroupsCreate201Response1;
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response3 = new OASCatalogsProductGroupsCreate201Res();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response4 = catalogsProductGroupsCreate201Response3;

        System.assert(catalogsProductGroupsCreate201Response1.equals(catalogsProductGroupsCreate201Response2));
        System.assert(catalogsProductGroupsCreate201Response2.equals(catalogsProductGroupsCreate201Response1));
        System.assert(catalogsProductGroupsCreate201Response1.equals(catalogsProductGroupsCreate201Response1));
        System.assert(catalogsProductGroupsCreate201Response3.equals(catalogsProductGroupsCreate201Response4));
        System.assert(catalogsProductGroupsCreate201Response4.equals(catalogsProductGroupsCreate201Response3));
        System.assert(catalogsProductGroupsCreate201Response3.equals(catalogsProductGroupsCreate201Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response1 = OASCatalogsProductGroupsCreate201Res.getExample();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response2 = OASCatalogsProductGroupsCreate201Res.getExample();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response3 = new OASCatalogsProductGroupsCreate201Res();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response4 = new OASCatalogsProductGroupsCreate201Res();

        System.assert(catalogsProductGroupsCreate201Response1.equals(catalogsProductGroupsCreate201Response2));
        System.assert(catalogsProductGroupsCreate201Response2.equals(catalogsProductGroupsCreate201Response1));
        System.assert(catalogsProductGroupsCreate201Response3.equals(catalogsProductGroupsCreate201Response4));
        System.assert(catalogsProductGroupsCreate201Response4.equals(catalogsProductGroupsCreate201Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response1 = OASCatalogsProductGroupsCreate201Res.getExample();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response2 = new OASCatalogsProductGroupsCreate201Res();

        System.assertEquals(false, catalogsProductGroupsCreate201Response1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupsCreate201Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response1 = OASCatalogsProductGroupsCreate201Res.getExample();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response2 = new OASCatalogsProductGroupsCreate201Res();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response3;

        System.assertEquals(false, catalogsProductGroupsCreate201Response1.equals(catalogsProductGroupsCreate201Response3));
        System.assertEquals(false, catalogsProductGroupsCreate201Response2.equals(catalogsProductGroupsCreate201Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response1 = OASCatalogsProductGroupsCreate201Res.getExample();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response2 = new OASCatalogsProductGroupsCreate201Res();

        System.assertEquals(catalogsProductGroupsCreate201Response1.hashCode(), catalogsProductGroupsCreate201Response1.hashCode());
        System.assertEquals(catalogsProductGroupsCreate201Response2.hashCode(), catalogsProductGroupsCreate201Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response1 = OASCatalogsProductGroupsCreate201Res.getExample();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response2 = OASCatalogsProductGroupsCreate201Res.getExample();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response3 = new OASCatalogsProductGroupsCreate201Res();
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response4 = new OASCatalogsProductGroupsCreate201Res();

        System.assert(catalogsProductGroupsCreate201Response1.equals(catalogsProductGroupsCreate201Response2));
        System.assert(catalogsProductGroupsCreate201Response3.equals(catalogsProductGroupsCreate201Response4));
        System.assertEquals(catalogsProductGroupsCreate201Response1.hashCode(), catalogsProductGroupsCreate201Response2.hashCode());
        System.assertEquals(catalogsProductGroupsCreate201Response3.hashCode(), catalogsProductGroupsCreate201Response4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response = new OASCatalogsProductGroupsCreate201Res();
        Map<String, String> x-property-mappings = catalogsProductGroupsCreate201Response.getx-property-mappings();
        System.assertEquals('isFeatured', x-property-mappings.get('is_featured'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
