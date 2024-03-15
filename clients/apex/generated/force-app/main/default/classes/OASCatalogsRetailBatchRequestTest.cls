@isTest
private class OASCatalogsRetailBatchRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest1 = OASCatalogsRetailBatchRequest.getExample();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest2 = catalogsRetailBatchRequest1;
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest3 = new OASCatalogsRetailBatchRequest();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest4 = catalogsRetailBatchRequest3;

        System.assert(catalogsRetailBatchRequest1.equals(catalogsRetailBatchRequest2));
        System.assert(catalogsRetailBatchRequest2.equals(catalogsRetailBatchRequest1));
        System.assert(catalogsRetailBatchRequest1.equals(catalogsRetailBatchRequest1));
        System.assert(catalogsRetailBatchRequest3.equals(catalogsRetailBatchRequest4));
        System.assert(catalogsRetailBatchRequest4.equals(catalogsRetailBatchRequest3));
        System.assert(catalogsRetailBatchRequest3.equals(catalogsRetailBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest1 = OASCatalogsRetailBatchRequest.getExample();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest2 = OASCatalogsRetailBatchRequest.getExample();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest3 = new OASCatalogsRetailBatchRequest();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest4 = new OASCatalogsRetailBatchRequest();

        System.assert(catalogsRetailBatchRequest1.equals(catalogsRetailBatchRequest2));
        System.assert(catalogsRetailBatchRequest2.equals(catalogsRetailBatchRequest1));
        System.assert(catalogsRetailBatchRequest3.equals(catalogsRetailBatchRequest4));
        System.assert(catalogsRetailBatchRequest4.equals(catalogsRetailBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest1 = OASCatalogsRetailBatchRequest.getExample();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest2 = new OASCatalogsRetailBatchRequest();

        System.assertEquals(false, catalogsRetailBatchRequest1.equals('foo'));
        System.assertEquals(false, catalogsRetailBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest1 = OASCatalogsRetailBatchRequest.getExample();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest2 = new OASCatalogsRetailBatchRequest();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest3;

        System.assertEquals(false, catalogsRetailBatchRequest1.equals(catalogsRetailBatchRequest3));
        System.assertEquals(false, catalogsRetailBatchRequest2.equals(catalogsRetailBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest1 = OASCatalogsRetailBatchRequest.getExample();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest2 = new OASCatalogsRetailBatchRequest();

        System.assertEquals(catalogsRetailBatchRequest1.hashCode(), catalogsRetailBatchRequest1.hashCode());
        System.assertEquals(catalogsRetailBatchRequest2.hashCode(), catalogsRetailBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest1 = OASCatalogsRetailBatchRequest.getExample();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest2 = OASCatalogsRetailBatchRequest.getExample();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest3 = new OASCatalogsRetailBatchRequest();
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest4 = new OASCatalogsRetailBatchRequest();

        System.assert(catalogsRetailBatchRequest1.equals(catalogsRetailBatchRequest2));
        System.assert(catalogsRetailBatchRequest3.equals(catalogsRetailBatchRequest4));
        System.assertEquals(catalogsRetailBatchRequest1.hashCode(), catalogsRetailBatchRequest2.hashCode());
        System.assertEquals(catalogsRetailBatchRequest3.hashCode(), catalogsRetailBatchRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest = new OASCatalogsRetailBatchRequest();
        Map<String, String> x-property-mappings = catalogsRetailBatchRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsRetailBatchRequest catalogsRetailBatchRequest = new OASCatalogsRetailBatchRequest();
        System.assertEquals(new List<OASCatalogsRetailBatchRequestItemsIn>(), catalogsRetailBatchRequest.items);
        System.assertEquals(null, catalogsRetailBatchRequest.catalogType);
        System.assertEquals(null, catalogsRetailBatchRequest.country);
        System.assertEquals(null, catalogsRetailBatchRequest.language);
    }
}
