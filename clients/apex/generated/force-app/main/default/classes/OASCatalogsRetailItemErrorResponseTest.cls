@isTest
private class OASCatalogsRetailItemErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse1 = OASCatalogsRetailItemErrorResponse.getExample();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse2 = catalogsRetailItemErrorResponse1;
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse3 = new OASCatalogsRetailItemErrorResponse();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse4 = catalogsRetailItemErrorResponse3;

        System.assert(catalogsRetailItemErrorResponse1.equals(catalogsRetailItemErrorResponse2));
        System.assert(catalogsRetailItemErrorResponse2.equals(catalogsRetailItemErrorResponse1));
        System.assert(catalogsRetailItemErrorResponse1.equals(catalogsRetailItemErrorResponse1));
        System.assert(catalogsRetailItemErrorResponse3.equals(catalogsRetailItemErrorResponse4));
        System.assert(catalogsRetailItemErrorResponse4.equals(catalogsRetailItemErrorResponse3));
        System.assert(catalogsRetailItemErrorResponse3.equals(catalogsRetailItemErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse1 = OASCatalogsRetailItemErrorResponse.getExample();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse2 = OASCatalogsRetailItemErrorResponse.getExample();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse3 = new OASCatalogsRetailItemErrorResponse();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse4 = new OASCatalogsRetailItemErrorResponse();

        System.assert(catalogsRetailItemErrorResponse1.equals(catalogsRetailItemErrorResponse2));
        System.assert(catalogsRetailItemErrorResponse2.equals(catalogsRetailItemErrorResponse1));
        System.assert(catalogsRetailItemErrorResponse3.equals(catalogsRetailItemErrorResponse4));
        System.assert(catalogsRetailItemErrorResponse4.equals(catalogsRetailItemErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse1 = OASCatalogsRetailItemErrorResponse.getExample();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse2 = new OASCatalogsRetailItemErrorResponse();

        System.assertEquals(false, catalogsRetailItemErrorResponse1.equals('foo'));
        System.assertEquals(false, catalogsRetailItemErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse1 = OASCatalogsRetailItemErrorResponse.getExample();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse2 = new OASCatalogsRetailItemErrorResponse();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse3;

        System.assertEquals(false, catalogsRetailItemErrorResponse1.equals(catalogsRetailItemErrorResponse3));
        System.assertEquals(false, catalogsRetailItemErrorResponse2.equals(catalogsRetailItemErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse1 = OASCatalogsRetailItemErrorResponse.getExample();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse2 = new OASCatalogsRetailItemErrorResponse();

        System.assertEquals(catalogsRetailItemErrorResponse1.hashCode(), catalogsRetailItemErrorResponse1.hashCode());
        System.assertEquals(catalogsRetailItemErrorResponse2.hashCode(), catalogsRetailItemErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse1 = OASCatalogsRetailItemErrorResponse.getExample();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse2 = OASCatalogsRetailItemErrorResponse.getExample();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse3 = new OASCatalogsRetailItemErrorResponse();
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse4 = new OASCatalogsRetailItemErrorResponse();

        System.assert(catalogsRetailItemErrorResponse1.equals(catalogsRetailItemErrorResponse2));
        System.assert(catalogsRetailItemErrorResponse3.equals(catalogsRetailItemErrorResponse4));
        System.assertEquals(catalogsRetailItemErrorResponse1.hashCode(), catalogsRetailItemErrorResponse2.hashCode());
        System.assertEquals(catalogsRetailItemErrorResponse3.hashCode(), catalogsRetailItemErrorResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse = new OASCatalogsRetailItemErrorResponse();
        Map<String, String> x-property-mappings = catalogsRetailItemErrorResponse.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse = new OASCatalogsRetailItemErrorResponse();
        System.assertEquals(new List<OASItemValidationEvent>(), catalogsRetailItemErrorResponse.errors);
        System.assertEquals(null, catalogsRetailItemErrorResponse.catalogType);
        System.assertEquals(null, catalogsRetailItemErrorResponse.itemId);
    }
}
