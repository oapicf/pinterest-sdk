@isTest
private class OASCatalogsItemsDeleteBatchRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest1 = OASCatalogsItemsDeleteBatchRequest.getExample();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest2 = catalogsItemsDeleteBatchRequest1;
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest3 = new OASCatalogsItemsDeleteBatchRequest();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest4 = catalogsItemsDeleteBatchRequest3;

        System.assert(catalogsItemsDeleteBatchRequest1.equals(catalogsItemsDeleteBatchRequest2));
        System.assert(catalogsItemsDeleteBatchRequest2.equals(catalogsItemsDeleteBatchRequest1));
        System.assert(catalogsItemsDeleteBatchRequest1.equals(catalogsItemsDeleteBatchRequest1));
        System.assert(catalogsItemsDeleteBatchRequest3.equals(catalogsItemsDeleteBatchRequest4));
        System.assert(catalogsItemsDeleteBatchRequest4.equals(catalogsItemsDeleteBatchRequest3));
        System.assert(catalogsItemsDeleteBatchRequest3.equals(catalogsItemsDeleteBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest1 = OASCatalogsItemsDeleteBatchRequest.getExample();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest2 = OASCatalogsItemsDeleteBatchRequest.getExample();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest3 = new OASCatalogsItemsDeleteBatchRequest();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest4 = new OASCatalogsItemsDeleteBatchRequest();

        System.assert(catalogsItemsDeleteBatchRequest1.equals(catalogsItemsDeleteBatchRequest2));
        System.assert(catalogsItemsDeleteBatchRequest2.equals(catalogsItemsDeleteBatchRequest1));
        System.assert(catalogsItemsDeleteBatchRequest3.equals(catalogsItemsDeleteBatchRequest4));
        System.assert(catalogsItemsDeleteBatchRequest4.equals(catalogsItemsDeleteBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest1 = OASCatalogsItemsDeleteBatchRequest.getExample();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest2 = new OASCatalogsItemsDeleteBatchRequest();

        System.assertEquals(false, catalogsItemsDeleteBatchRequest1.equals('foo'));
        System.assertEquals(false, catalogsItemsDeleteBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest1 = OASCatalogsItemsDeleteBatchRequest.getExample();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest2 = new OASCatalogsItemsDeleteBatchRequest();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest3;

        System.assertEquals(false, catalogsItemsDeleteBatchRequest1.equals(catalogsItemsDeleteBatchRequest3));
        System.assertEquals(false, catalogsItemsDeleteBatchRequest2.equals(catalogsItemsDeleteBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest1 = OASCatalogsItemsDeleteBatchRequest.getExample();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest2 = new OASCatalogsItemsDeleteBatchRequest();

        System.assertEquals(catalogsItemsDeleteBatchRequest1.hashCode(), catalogsItemsDeleteBatchRequest1.hashCode());
        System.assertEquals(catalogsItemsDeleteBatchRequest2.hashCode(), catalogsItemsDeleteBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest1 = OASCatalogsItemsDeleteBatchRequest.getExample();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest2 = OASCatalogsItemsDeleteBatchRequest.getExample();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest3 = new OASCatalogsItemsDeleteBatchRequest();
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest4 = new OASCatalogsItemsDeleteBatchRequest();

        System.assert(catalogsItemsDeleteBatchRequest1.equals(catalogsItemsDeleteBatchRequest2));
        System.assert(catalogsItemsDeleteBatchRequest3.equals(catalogsItemsDeleteBatchRequest4));
        System.assertEquals(catalogsItemsDeleteBatchRequest1.hashCode(), catalogsItemsDeleteBatchRequest2.hashCode());
        System.assertEquals(catalogsItemsDeleteBatchRequest3.hashCode(), catalogsItemsDeleteBatchRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsItemsDeleteBatchRequest catalogsItemsDeleteBatchRequest = new OASCatalogsItemsDeleteBatchRequest();
        System.assertEquals(new List<OASItemDeleteBatchRecord>(), catalogsItemsDeleteBatchRequest.items);
        System.assertEquals(null, catalogsItemsDeleteBatchRequest.country);
        System.assertEquals(null, catalogsItemsDeleteBatchRequest.language);
        System.assertEquals(null, catalogsItemsDeleteBatchRequest.operation);
    }
}
