@isTest
private class OASCatalogsProductGroupTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroup catalogsProductGroup1 = OASCatalogsProductGroup.getExample();
        OASCatalogsProductGroup catalogsProductGroup2 = catalogsProductGroup1;
        OASCatalogsProductGroup catalogsProductGroup3 = new OASCatalogsProductGroup();
        OASCatalogsProductGroup catalogsProductGroup4 = catalogsProductGroup3;

        System.assert(catalogsProductGroup1.equals(catalogsProductGroup2));
        System.assert(catalogsProductGroup2.equals(catalogsProductGroup1));
        System.assert(catalogsProductGroup1.equals(catalogsProductGroup1));
        System.assert(catalogsProductGroup3.equals(catalogsProductGroup4));
        System.assert(catalogsProductGroup4.equals(catalogsProductGroup3));
        System.assert(catalogsProductGroup3.equals(catalogsProductGroup3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroup catalogsProductGroup1 = OASCatalogsProductGroup.getExample();
        OASCatalogsProductGroup catalogsProductGroup2 = OASCatalogsProductGroup.getExample();
        OASCatalogsProductGroup catalogsProductGroup3 = new OASCatalogsProductGroup();
        OASCatalogsProductGroup catalogsProductGroup4 = new OASCatalogsProductGroup();

        System.assert(catalogsProductGroup1.equals(catalogsProductGroup2));
        System.assert(catalogsProductGroup2.equals(catalogsProductGroup1));
        System.assert(catalogsProductGroup3.equals(catalogsProductGroup4));
        System.assert(catalogsProductGroup4.equals(catalogsProductGroup3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroup catalogsProductGroup1 = OASCatalogsProductGroup.getExample();
        OASCatalogsProductGroup catalogsProductGroup2 = new OASCatalogsProductGroup();

        System.assertEquals(false, catalogsProductGroup1.equals('foo'));
        System.assertEquals(false, catalogsProductGroup2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroup catalogsProductGroup1 = OASCatalogsProductGroup.getExample();
        OASCatalogsProductGroup catalogsProductGroup2 = new OASCatalogsProductGroup();
        OASCatalogsProductGroup catalogsProductGroup3;

        System.assertEquals(false, catalogsProductGroup1.equals(catalogsProductGroup3));
        System.assertEquals(false, catalogsProductGroup2.equals(catalogsProductGroup3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroup catalogsProductGroup1 = OASCatalogsProductGroup.getExample();
        OASCatalogsProductGroup catalogsProductGroup2 = new OASCatalogsProductGroup();

        System.assertEquals(catalogsProductGroup1.hashCode(), catalogsProductGroup1.hashCode());
        System.assertEquals(catalogsProductGroup2.hashCode(), catalogsProductGroup2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroup catalogsProductGroup1 = OASCatalogsProductGroup.getExample();
        OASCatalogsProductGroup catalogsProductGroup2 = OASCatalogsProductGroup.getExample();
        OASCatalogsProductGroup catalogsProductGroup3 = new OASCatalogsProductGroup();
        OASCatalogsProductGroup catalogsProductGroup4 = new OASCatalogsProductGroup();

        System.assert(catalogsProductGroup1.equals(catalogsProductGroup2));
        System.assert(catalogsProductGroup3.equals(catalogsProductGroup4));
        System.assertEquals(catalogsProductGroup1.hashCode(), catalogsProductGroup2.hashCode());
        System.assertEquals(catalogsProductGroup3.hashCode(), catalogsProductGroup4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroup catalogsProductGroup = new OASCatalogsProductGroup();
        Map<String, String> x-property-mappings = catalogsProductGroup.getx-property-mappings();
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
    }
}
