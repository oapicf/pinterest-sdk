@isTest
private class OASCatalogsRetailProductGroupTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailProductGroup catalogsRetailProductGroup1 = OASCatalogsRetailProductGroup.getExample();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup2 = catalogsRetailProductGroup1;
        OASCatalogsRetailProductGroup catalogsRetailProductGroup3 = new OASCatalogsRetailProductGroup();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup4 = catalogsRetailProductGroup3;

        System.assert(catalogsRetailProductGroup1.equals(catalogsRetailProductGroup2));
        System.assert(catalogsRetailProductGroup2.equals(catalogsRetailProductGroup1));
        System.assert(catalogsRetailProductGroup1.equals(catalogsRetailProductGroup1));
        System.assert(catalogsRetailProductGroup3.equals(catalogsRetailProductGroup4));
        System.assert(catalogsRetailProductGroup4.equals(catalogsRetailProductGroup3));
        System.assert(catalogsRetailProductGroup3.equals(catalogsRetailProductGroup3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailProductGroup catalogsRetailProductGroup1 = OASCatalogsRetailProductGroup.getExample();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup2 = OASCatalogsRetailProductGroup.getExample();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup3 = new OASCatalogsRetailProductGroup();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup4 = new OASCatalogsRetailProductGroup();

        System.assert(catalogsRetailProductGroup1.equals(catalogsRetailProductGroup2));
        System.assert(catalogsRetailProductGroup2.equals(catalogsRetailProductGroup1));
        System.assert(catalogsRetailProductGroup3.equals(catalogsRetailProductGroup4));
        System.assert(catalogsRetailProductGroup4.equals(catalogsRetailProductGroup3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailProductGroup catalogsRetailProductGroup1 = OASCatalogsRetailProductGroup.getExample();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup2 = new OASCatalogsRetailProductGroup();

        System.assertEquals(false, catalogsRetailProductGroup1.equals('foo'));
        System.assertEquals(false, catalogsRetailProductGroup2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailProductGroup catalogsRetailProductGroup1 = OASCatalogsRetailProductGroup.getExample();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup2 = new OASCatalogsRetailProductGroup();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup3;

        System.assertEquals(false, catalogsRetailProductGroup1.equals(catalogsRetailProductGroup3));
        System.assertEquals(false, catalogsRetailProductGroup2.equals(catalogsRetailProductGroup3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailProductGroup catalogsRetailProductGroup1 = OASCatalogsRetailProductGroup.getExample();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup2 = new OASCatalogsRetailProductGroup();

        System.assertEquals(catalogsRetailProductGroup1.hashCode(), catalogsRetailProductGroup1.hashCode());
        System.assertEquals(catalogsRetailProductGroup2.hashCode(), catalogsRetailProductGroup2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailProductGroup catalogsRetailProductGroup1 = OASCatalogsRetailProductGroup.getExample();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup2 = OASCatalogsRetailProductGroup.getExample();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup3 = new OASCatalogsRetailProductGroup();
        OASCatalogsRetailProductGroup catalogsRetailProductGroup4 = new OASCatalogsRetailProductGroup();

        System.assert(catalogsRetailProductGroup1.equals(catalogsRetailProductGroup2));
        System.assert(catalogsRetailProductGroup3.equals(catalogsRetailProductGroup4));
        System.assertEquals(catalogsRetailProductGroup1.hashCode(), catalogsRetailProductGroup2.hashCode());
        System.assertEquals(catalogsRetailProductGroup3.hashCode(), catalogsRetailProductGroup4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailProductGroup catalogsRetailProductGroup = new OASCatalogsRetailProductGroup();
        Map<String, String> x-property-mappings = catalogsRetailProductGroup.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('isFeatured', x-property-mappings.get('is_featured'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
    }
}
