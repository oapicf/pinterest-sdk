@isTest
private class OASCatalogsVerticalProductGroupTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup1 = OASCatalogsVerticalProductGroup.getExample();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup2 = catalogsVerticalProductGroup1;
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup3 = new OASCatalogsVerticalProductGroup();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup4 = catalogsVerticalProductGroup3;

        System.assert(catalogsVerticalProductGroup1.equals(catalogsVerticalProductGroup2));
        System.assert(catalogsVerticalProductGroup2.equals(catalogsVerticalProductGroup1));
        System.assert(catalogsVerticalProductGroup1.equals(catalogsVerticalProductGroup1));
        System.assert(catalogsVerticalProductGroup3.equals(catalogsVerticalProductGroup4));
        System.assert(catalogsVerticalProductGroup4.equals(catalogsVerticalProductGroup3));
        System.assert(catalogsVerticalProductGroup3.equals(catalogsVerticalProductGroup3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup1 = OASCatalogsVerticalProductGroup.getExample();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup2 = OASCatalogsVerticalProductGroup.getExample();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup3 = new OASCatalogsVerticalProductGroup();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup4 = new OASCatalogsVerticalProductGroup();

        System.assert(catalogsVerticalProductGroup1.equals(catalogsVerticalProductGroup2));
        System.assert(catalogsVerticalProductGroup2.equals(catalogsVerticalProductGroup1));
        System.assert(catalogsVerticalProductGroup3.equals(catalogsVerticalProductGroup4));
        System.assert(catalogsVerticalProductGroup4.equals(catalogsVerticalProductGroup3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup1 = OASCatalogsVerticalProductGroup.getExample();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup2 = new OASCatalogsVerticalProductGroup();

        System.assertEquals(false, catalogsVerticalProductGroup1.equals('foo'));
        System.assertEquals(false, catalogsVerticalProductGroup2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup1 = OASCatalogsVerticalProductGroup.getExample();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup2 = new OASCatalogsVerticalProductGroup();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup3;

        System.assertEquals(false, catalogsVerticalProductGroup1.equals(catalogsVerticalProductGroup3));
        System.assertEquals(false, catalogsVerticalProductGroup2.equals(catalogsVerticalProductGroup3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup1 = OASCatalogsVerticalProductGroup.getExample();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup2 = new OASCatalogsVerticalProductGroup();

        System.assertEquals(catalogsVerticalProductGroup1.hashCode(), catalogsVerticalProductGroup1.hashCode());
        System.assertEquals(catalogsVerticalProductGroup2.hashCode(), catalogsVerticalProductGroup2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup1 = OASCatalogsVerticalProductGroup.getExample();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup2 = OASCatalogsVerticalProductGroup.getExample();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup3 = new OASCatalogsVerticalProductGroup();
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup4 = new OASCatalogsVerticalProductGroup();

        System.assert(catalogsVerticalProductGroup1.equals(catalogsVerticalProductGroup2));
        System.assert(catalogsVerticalProductGroup3.equals(catalogsVerticalProductGroup4));
        System.assertEquals(catalogsVerticalProductGroup1.hashCode(), catalogsVerticalProductGroup2.hashCode());
        System.assertEquals(catalogsVerticalProductGroup3.hashCode(), catalogsVerticalProductGroup4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsVerticalProductGroup catalogsVerticalProductGroup = new OASCatalogsVerticalProductGroup();
        Map<String, String> x-property-mappings = catalogsVerticalProductGroup.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
        System.assertEquals('isFeatured', x-property-mappings.get('is_featured'));
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
    }
}
