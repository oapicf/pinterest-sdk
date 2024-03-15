@isTest
private class OASCatalogsRetailItemResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailItemResponse catalogsRetailItemResponse1 = OASCatalogsRetailItemResponse.getExample();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse2 = catalogsRetailItemResponse1;
        OASCatalogsRetailItemResponse catalogsRetailItemResponse3 = new OASCatalogsRetailItemResponse();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse4 = catalogsRetailItemResponse3;

        System.assert(catalogsRetailItemResponse1.equals(catalogsRetailItemResponse2));
        System.assert(catalogsRetailItemResponse2.equals(catalogsRetailItemResponse1));
        System.assert(catalogsRetailItemResponse1.equals(catalogsRetailItemResponse1));
        System.assert(catalogsRetailItemResponse3.equals(catalogsRetailItemResponse4));
        System.assert(catalogsRetailItemResponse4.equals(catalogsRetailItemResponse3));
        System.assert(catalogsRetailItemResponse3.equals(catalogsRetailItemResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailItemResponse catalogsRetailItemResponse1 = OASCatalogsRetailItemResponse.getExample();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse2 = OASCatalogsRetailItemResponse.getExample();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse3 = new OASCatalogsRetailItemResponse();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse4 = new OASCatalogsRetailItemResponse();

        System.assert(catalogsRetailItemResponse1.equals(catalogsRetailItemResponse2));
        System.assert(catalogsRetailItemResponse2.equals(catalogsRetailItemResponse1));
        System.assert(catalogsRetailItemResponse3.equals(catalogsRetailItemResponse4));
        System.assert(catalogsRetailItemResponse4.equals(catalogsRetailItemResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailItemResponse catalogsRetailItemResponse1 = OASCatalogsRetailItemResponse.getExample();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse2 = new OASCatalogsRetailItemResponse();

        System.assertEquals(false, catalogsRetailItemResponse1.equals('foo'));
        System.assertEquals(false, catalogsRetailItemResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailItemResponse catalogsRetailItemResponse1 = OASCatalogsRetailItemResponse.getExample();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse2 = new OASCatalogsRetailItemResponse();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse3;

        System.assertEquals(false, catalogsRetailItemResponse1.equals(catalogsRetailItemResponse3));
        System.assertEquals(false, catalogsRetailItemResponse2.equals(catalogsRetailItemResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailItemResponse catalogsRetailItemResponse1 = OASCatalogsRetailItemResponse.getExample();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse2 = new OASCatalogsRetailItemResponse();

        System.assertEquals(catalogsRetailItemResponse1.hashCode(), catalogsRetailItemResponse1.hashCode());
        System.assertEquals(catalogsRetailItemResponse2.hashCode(), catalogsRetailItemResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailItemResponse catalogsRetailItemResponse1 = OASCatalogsRetailItemResponse.getExample();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse2 = OASCatalogsRetailItemResponse.getExample();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse3 = new OASCatalogsRetailItemResponse();
        OASCatalogsRetailItemResponse catalogsRetailItemResponse4 = new OASCatalogsRetailItemResponse();

        System.assert(catalogsRetailItemResponse1.equals(catalogsRetailItemResponse2));
        System.assert(catalogsRetailItemResponse3.equals(catalogsRetailItemResponse4));
        System.assertEquals(catalogsRetailItemResponse1.hashCode(), catalogsRetailItemResponse2.hashCode());
        System.assertEquals(catalogsRetailItemResponse3.hashCode(), catalogsRetailItemResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailItemResponse catalogsRetailItemResponse = new OASCatalogsRetailItemResponse();
        Map<String, String> x-property-mappings = catalogsRetailItemResponse.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsRetailItemResponse catalogsRetailItemResponse = new OASCatalogsRetailItemResponse();
        System.assertEquals(new List<OASPin>(), catalogsRetailItemResponse.pins);
        System.assertEquals(null, catalogsRetailItemResponse.catalogType);
        System.assertEquals(null, catalogsRetailItemResponse.itemId);
        System.assertEquals(null, catalogsRetailItemResponse.attributes);
    }
}
