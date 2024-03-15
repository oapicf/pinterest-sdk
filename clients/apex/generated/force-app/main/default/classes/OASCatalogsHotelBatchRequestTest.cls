@isTest
private class OASCatalogsHotelBatchRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest1 = OASCatalogsHotelBatchRequest.getExample();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest2 = catalogsHotelBatchRequest1;
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest3 = new OASCatalogsHotelBatchRequest();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest4 = catalogsHotelBatchRequest3;

        System.assert(catalogsHotelBatchRequest1.equals(catalogsHotelBatchRequest2));
        System.assert(catalogsHotelBatchRequest2.equals(catalogsHotelBatchRequest1));
        System.assert(catalogsHotelBatchRequest1.equals(catalogsHotelBatchRequest1));
        System.assert(catalogsHotelBatchRequest3.equals(catalogsHotelBatchRequest4));
        System.assert(catalogsHotelBatchRequest4.equals(catalogsHotelBatchRequest3));
        System.assert(catalogsHotelBatchRequest3.equals(catalogsHotelBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest1 = OASCatalogsHotelBatchRequest.getExample();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest2 = OASCatalogsHotelBatchRequest.getExample();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest3 = new OASCatalogsHotelBatchRequest();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest4 = new OASCatalogsHotelBatchRequest();

        System.assert(catalogsHotelBatchRequest1.equals(catalogsHotelBatchRequest2));
        System.assert(catalogsHotelBatchRequest2.equals(catalogsHotelBatchRequest1));
        System.assert(catalogsHotelBatchRequest3.equals(catalogsHotelBatchRequest4));
        System.assert(catalogsHotelBatchRequest4.equals(catalogsHotelBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest1 = OASCatalogsHotelBatchRequest.getExample();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest2 = new OASCatalogsHotelBatchRequest();

        System.assertEquals(false, catalogsHotelBatchRequest1.equals('foo'));
        System.assertEquals(false, catalogsHotelBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest1 = OASCatalogsHotelBatchRequest.getExample();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest2 = new OASCatalogsHotelBatchRequest();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest3;

        System.assertEquals(false, catalogsHotelBatchRequest1.equals(catalogsHotelBatchRequest3));
        System.assertEquals(false, catalogsHotelBatchRequest2.equals(catalogsHotelBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest1 = OASCatalogsHotelBatchRequest.getExample();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest2 = new OASCatalogsHotelBatchRequest();

        System.assertEquals(catalogsHotelBatchRequest1.hashCode(), catalogsHotelBatchRequest1.hashCode());
        System.assertEquals(catalogsHotelBatchRequest2.hashCode(), catalogsHotelBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest1 = OASCatalogsHotelBatchRequest.getExample();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest2 = OASCatalogsHotelBatchRequest.getExample();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest3 = new OASCatalogsHotelBatchRequest();
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest4 = new OASCatalogsHotelBatchRequest();

        System.assert(catalogsHotelBatchRequest1.equals(catalogsHotelBatchRequest2));
        System.assert(catalogsHotelBatchRequest3.equals(catalogsHotelBatchRequest4));
        System.assertEquals(catalogsHotelBatchRequest1.hashCode(), catalogsHotelBatchRequest2.hashCode());
        System.assertEquals(catalogsHotelBatchRequest3.hashCode(), catalogsHotelBatchRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest = new OASCatalogsHotelBatchRequest();
        Map<String, String> x-property-mappings = catalogsHotelBatchRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsHotelBatchRequest catalogsHotelBatchRequest = new OASCatalogsHotelBatchRequest();
        System.assertEquals(new List<OASCatalogsHotelBatchItem>(), catalogsHotelBatchRequest.items);
        System.assertEquals(null, catalogsHotelBatchRequest.catalogType);
        System.assertEquals(null, catalogsHotelBatchRequest.country);
        System.assertEquals(null, catalogsHotelBatchRequest.language);
        System.assertEquals(null, catalogsHotelBatchRequest.catalogId);
    }
}
