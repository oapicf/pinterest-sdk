@isTest
private class OASCatalogsItemsCreateBatchRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest1 = OASCatalogsItemsCreateBatchRequest.getExample();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest2 = catalogsItemsCreateBatchRequest1;
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest3 = new OASCatalogsItemsCreateBatchRequest();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest4 = catalogsItemsCreateBatchRequest3;

        System.assert(catalogsItemsCreateBatchRequest1.equals(catalogsItemsCreateBatchRequest2));
        System.assert(catalogsItemsCreateBatchRequest2.equals(catalogsItemsCreateBatchRequest1));
        System.assert(catalogsItemsCreateBatchRequest1.equals(catalogsItemsCreateBatchRequest1));
        System.assert(catalogsItemsCreateBatchRequest3.equals(catalogsItemsCreateBatchRequest4));
        System.assert(catalogsItemsCreateBatchRequest4.equals(catalogsItemsCreateBatchRequest3));
        System.assert(catalogsItemsCreateBatchRequest3.equals(catalogsItemsCreateBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest1 = OASCatalogsItemsCreateBatchRequest.getExample();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest2 = OASCatalogsItemsCreateBatchRequest.getExample();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest3 = new OASCatalogsItemsCreateBatchRequest();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest4 = new OASCatalogsItemsCreateBatchRequest();

        System.assert(catalogsItemsCreateBatchRequest1.equals(catalogsItemsCreateBatchRequest2));
        System.assert(catalogsItemsCreateBatchRequest2.equals(catalogsItemsCreateBatchRequest1));
        System.assert(catalogsItemsCreateBatchRequest3.equals(catalogsItemsCreateBatchRequest4));
        System.assert(catalogsItemsCreateBatchRequest4.equals(catalogsItemsCreateBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest1 = OASCatalogsItemsCreateBatchRequest.getExample();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest2 = new OASCatalogsItemsCreateBatchRequest();

        System.assertEquals(false, catalogsItemsCreateBatchRequest1.equals('foo'));
        System.assertEquals(false, catalogsItemsCreateBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest1 = OASCatalogsItemsCreateBatchRequest.getExample();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest2 = new OASCatalogsItemsCreateBatchRequest();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest3;

        System.assertEquals(false, catalogsItemsCreateBatchRequest1.equals(catalogsItemsCreateBatchRequest3));
        System.assertEquals(false, catalogsItemsCreateBatchRequest2.equals(catalogsItemsCreateBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest1 = OASCatalogsItemsCreateBatchRequest.getExample();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest2 = new OASCatalogsItemsCreateBatchRequest();

        System.assertEquals(catalogsItemsCreateBatchRequest1.hashCode(), catalogsItemsCreateBatchRequest1.hashCode());
        System.assertEquals(catalogsItemsCreateBatchRequest2.hashCode(), catalogsItemsCreateBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest1 = OASCatalogsItemsCreateBatchRequest.getExample();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest2 = OASCatalogsItemsCreateBatchRequest.getExample();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest3 = new OASCatalogsItemsCreateBatchRequest();
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest4 = new OASCatalogsItemsCreateBatchRequest();

        System.assert(catalogsItemsCreateBatchRequest1.equals(catalogsItemsCreateBatchRequest2));
        System.assert(catalogsItemsCreateBatchRequest3.equals(catalogsItemsCreateBatchRequest4));
        System.assertEquals(catalogsItemsCreateBatchRequest1.hashCode(), catalogsItemsCreateBatchRequest2.hashCode());
        System.assertEquals(catalogsItemsCreateBatchRequest3.hashCode(), catalogsItemsCreateBatchRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest = new OASCatalogsItemsCreateBatchRequest();
        System.assertEquals(new List<OASItemCreateBatchRecord>(), catalogsItemsCreateBatchRequest.items);
        System.assertEquals(null, catalogsItemsCreateBatchRequest.country);
        System.assertEquals(null, catalogsItemsCreateBatchRequest.language);
        System.assertEquals(null, catalogsItemsCreateBatchRequest.operation);
    }
}
