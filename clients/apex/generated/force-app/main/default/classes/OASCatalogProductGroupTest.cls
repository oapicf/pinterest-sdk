@isTest
private class OASCatalogProductGroupTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogProductGroup catalogProductGroup1 = OASCatalogProductGroup.getExample();
        OASCatalogProductGroup catalogProductGroup2 = catalogProductGroup1;
        OASCatalogProductGroup catalogProductGroup3 = new OASCatalogProductGroup();
        OASCatalogProductGroup catalogProductGroup4 = catalogProductGroup3;

        System.assert(catalogProductGroup1.equals(catalogProductGroup2));
        System.assert(catalogProductGroup2.equals(catalogProductGroup1));
        System.assert(catalogProductGroup1.equals(catalogProductGroup1));
        System.assert(catalogProductGroup3.equals(catalogProductGroup4));
        System.assert(catalogProductGroup4.equals(catalogProductGroup3));
        System.assert(catalogProductGroup3.equals(catalogProductGroup3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogProductGroup catalogProductGroup1 = OASCatalogProductGroup.getExample();
        OASCatalogProductGroup catalogProductGroup2 = OASCatalogProductGroup.getExample();
        OASCatalogProductGroup catalogProductGroup3 = new OASCatalogProductGroup();
        OASCatalogProductGroup catalogProductGroup4 = new OASCatalogProductGroup();

        System.assert(catalogProductGroup1.equals(catalogProductGroup2));
        System.assert(catalogProductGroup2.equals(catalogProductGroup1));
        System.assert(catalogProductGroup3.equals(catalogProductGroup4));
        System.assert(catalogProductGroup4.equals(catalogProductGroup3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogProductGroup catalogProductGroup1 = OASCatalogProductGroup.getExample();
        OASCatalogProductGroup catalogProductGroup2 = new OASCatalogProductGroup();

        System.assertEquals(false, catalogProductGroup1.equals('foo'));
        System.assertEquals(false, catalogProductGroup2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogProductGroup catalogProductGroup1 = OASCatalogProductGroup.getExample();
        OASCatalogProductGroup catalogProductGroup2 = new OASCatalogProductGroup();
        OASCatalogProductGroup catalogProductGroup3;

        System.assertEquals(false, catalogProductGroup1.equals(catalogProductGroup3));
        System.assertEquals(false, catalogProductGroup2.equals(catalogProductGroup3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogProductGroup catalogProductGroup1 = OASCatalogProductGroup.getExample();
        OASCatalogProductGroup catalogProductGroup2 = new OASCatalogProductGroup();

        System.assertEquals(catalogProductGroup1.hashCode(), catalogProductGroup1.hashCode());
        System.assertEquals(catalogProductGroup2.hashCode(), catalogProductGroup2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogProductGroup catalogProductGroup1 = OASCatalogProductGroup.getExample();
        OASCatalogProductGroup catalogProductGroup2 = OASCatalogProductGroup.getExample();
        OASCatalogProductGroup catalogProductGroup3 = new OASCatalogProductGroup();
        OASCatalogProductGroup catalogProductGroup4 = new OASCatalogProductGroup();

        System.assert(catalogProductGroup1.equals(catalogProductGroup2));
        System.assert(catalogProductGroup3.equals(catalogProductGroup4));
        System.assertEquals(catalogProductGroup1.hashCode(), catalogProductGroup2.hashCode());
        System.assertEquals(catalogProductGroup3.hashCode(), catalogProductGroup4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogProductGroup catalogProductGroup = new OASCatalogProductGroup();
        Map<String, String> x-property-mappings = catalogProductGroup.getx-property-mappings();
        System.assertEquals('merchantId', x-property-mappings.get('merchant_id'));
        System.assertEquals('filterV2', x-property-mappings.get('filter_v2'));
        System.assertEquals('feedProfileId', x-property-mappings.get('feed_profile_id'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('lastUpdate', x-property-mappings.get('last_update'));
        System.assertEquals('productCount', x-property-mappings.get('product_count'));
        System.assertEquals('featuredPosition', x-property-mappings.get('featured_position'));
    }
}
