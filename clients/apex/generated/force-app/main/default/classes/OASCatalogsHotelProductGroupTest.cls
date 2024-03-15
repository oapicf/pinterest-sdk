@isTest
private class OASCatalogsHotelProductGroupTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelProductGroup catalogsHotelProductGroup1 = OASCatalogsHotelProductGroup.getExample();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup2 = catalogsHotelProductGroup1;
        OASCatalogsHotelProductGroup catalogsHotelProductGroup3 = new OASCatalogsHotelProductGroup();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup4 = catalogsHotelProductGroup3;

        System.assert(catalogsHotelProductGroup1.equals(catalogsHotelProductGroup2));
        System.assert(catalogsHotelProductGroup2.equals(catalogsHotelProductGroup1));
        System.assert(catalogsHotelProductGroup1.equals(catalogsHotelProductGroup1));
        System.assert(catalogsHotelProductGroup3.equals(catalogsHotelProductGroup4));
        System.assert(catalogsHotelProductGroup4.equals(catalogsHotelProductGroup3));
        System.assert(catalogsHotelProductGroup3.equals(catalogsHotelProductGroup3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelProductGroup catalogsHotelProductGroup1 = OASCatalogsHotelProductGroup.getExample();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup2 = OASCatalogsHotelProductGroup.getExample();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup3 = new OASCatalogsHotelProductGroup();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup4 = new OASCatalogsHotelProductGroup();

        System.assert(catalogsHotelProductGroup1.equals(catalogsHotelProductGroup2));
        System.assert(catalogsHotelProductGroup2.equals(catalogsHotelProductGroup1));
        System.assert(catalogsHotelProductGroup3.equals(catalogsHotelProductGroup4));
        System.assert(catalogsHotelProductGroup4.equals(catalogsHotelProductGroup3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelProductGroup catalogsHotelProductGroup1 = OASCatalogsHotelProductGroup.getExample();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup2 = new OASCatalogsHotelProductGroup();

        System.assertEquals(false, catalogsHotelProductGroup1.equals('foo'));
        System.assertEquals(false, catalogsHotelProductGroup2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelProductGroup catalogsHotelProductGroup1 = OASCatalogsHotelProductGroup.getExample();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup2 = new OASCatalogsHotelProductGroup();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup3;

        System.assertEquals(false, catalogsHotelProductGroup1.equals(catalogsHotelProductGroup3));
        System.assertEquals(false, catalogsHotelProductGroup2.equals(catalogsHotelProductGroup3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelProductGroup catalogsHotelProductGroup1 = OASCatalogsHotelProductGroup.getExample();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup2 = new OASCatalogsHotelProductGroup();

        System.assertEquals(catalogsHotelProductGroup1.hashCode(), catalogsHotelProductGroup1.hashCode());
        System.assertEquals(catalogsHotelProductGroup2.hashCode(), catalogsHotelProductGroup2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelProductGroup catalogsHotelProductGroup1 = OASCatalogsHotelProductGroup.getExample();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup2 = OASCatalogsHotelProductGroup.getExample();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup3 = new OASCatalogsHotelProductGroup();
        OASCatalogsHotelProductGroup catalogsHotelProductGroup4 = new OASCatalogsHotelProductGroup();

        System.assert(catalogsHotelProductGroup1.equals(catalogsHotelProductGroup2));
        System.assert(catalogsHotelProductGroup3.equals(catalogsHotelProductGroup4));
        System.assertEquals(catalogsHotelProductGroup1.hashCode(), catalogsHotelProductGroup2.hashCode());
        System.assertEquals(catalogsHotelProductGroup3.hashCode(), catalogsHotelProductGroup4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelProductGroup catalogsHotelProductGroup = new OASCatalogsHotelProductGroup();
        Map<String, String> x-property-mappings = catalogsHotelProductGroup.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
