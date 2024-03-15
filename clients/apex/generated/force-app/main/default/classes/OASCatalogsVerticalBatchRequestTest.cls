@isTest
private class OASCatalogsVerticalBatchRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest1 = OASCatalogsVerticalBatchRequest.getExample();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest2 = catalogsVerticalBatchRequest1;
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest3 = new OASCatalogsVerticalBatchRequest();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest4 = catalogsVerticalBatchRequest3;

        System.assert(catalogsVerticalBatchRequest1.equals(catalogsVerticalBatchRequest2));
        System.assert(catalogsVerticalBatchRequest2.equals(catalogsVerticalBatchRequest1));
        System.assert(catalogsVerticalBatchRequest1.equals(catalogsVerticalBatchRequest1));
        System.assert(catalogsVerticalBatchRequest3.equals(catalogsVerticalBatchRequest4));
        System.assert(catalogsVerticalBatchRequest4.equals(catalogsVerticalBatchRequest3));
        System.assert(catalogsVerticalBatchRequest3.equals(catalogsVerticalBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest1 = OASCatalogsVerticalBatchRequest.getExample();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest2 = OASCatalogsVerticalBatchRequest.getExample();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest3 = new OASCatalogsVerticalBatchRequest();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest4 = new OASCatalogsVerticalBatchRequest();

        System.assert(catalogsVerticalBatchRequest1.equals(catalogsVerticalBatchRequest2));
        System.assert(catalogsVerticalBatchRequest2.equals(catalogsVerticalBatchRequest1));
        System.assert(catalogsVerticalBatchRequest3.equals(catalogsVerticalBatchRequest4));
        System.assert(catalogsVerticalBatchRequest4.equals(catalogsVerticalBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest1 = OASCatalogsVerticalBatchRequest.getExample();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest2 = new OASCatalogsVerticalBatchRequest();

        System.assertEquals(false, catalogsVerticalBatchRequest1.equals('foo'));
        System.assertEquals(false, catalogsVerticalBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest1 = OASCatalogsVerticalBatchRequest.getExample();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest2 = new OASCatalogsVerticalBatchRequest();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest3;

        System.assertEquals(false, catalogsVerticalBatchRequest1.equals(catalogsVerticalBatchRequest3));
        System.assertEquals(false, catalogsVerticalBatchRequest2.equals(catalogsVerticalBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest1 = OASCatalogsVerticalBatchRequest.getExample();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest2 = new OASCatalogsVerticalBatchRequest();

        System.assertEquals(catalogsVerticalBatchRequest1.hashCode(), catalogsVerticalBatchRequest1.hashCode());
        System.assertEquals(catalogsVerticalBatchRequest2.hashCode(), catalogsVerticalBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest1 = OASCatalogsVerticalBatchRequest.getExample();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest2 = OASCatalogsVerticalBatchRequest.getExample();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest3 = new OASCatalogsVerticalBatchRequest();
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest4 = new OASCatalogsVerticalBatchRequest();

        System.assert(catalogsVerticalBatchRequest1.equals(catalogsVerticalBatchRequest2));
        System.assert(catalogsVerticalBatchRequest3.equals(catalogsVerticalBatchRequest4));
        System.assertEquals(catalogsVerticalBatchRequest1.hashCode(), catalogsVerticalBatchRequest2.hashCode());
        System.assertEquals(catalogsVerticalBatchRequest3.hashCode(), catalogsVerticalBatchRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest = new OASCatalogsVerticalBatchRequest();
        Map<String, String> x-property-mappings = catalogsVerticalBatchRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsVerticalBatchRequest catalogsVerticalBatchRequest = new OASCatalogsVerticalBatchRequest();
        System.assertEquals(new List<OASCatalogsHotelBatchItem>(), catalogsVerticalBatchRequest.items);
        System.assertEquals(null, catalogsVerticalBatchRequest.catalogType);
        System.assertEquals(null, catalogsVerticalBatchRequest.country);
        System.assertEquals(null, catalogsVerticalBatchRequest.language);
        System.assertEquals(null, catalogsVerticalBatchRequest.catalogId);
    }
}
