@isTest
private class OASCatalogsItemsUpsertBatchRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest1 = OASCatalogsItemsUpsertBatchRequest.getExample();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest2 = catalogsItemsUpsertBatchRequest1;
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest3 = new OASCatalogsItemsUpsertBatchRequest();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest4 = catalogsItemsUpsertBatchRequest3;

        System.assert(catalogsItemsUpsertBatchRequest1.equals(catalogsItemsUpsertBatchRequest2));
        System.assert(catalogsItemsUpsertBatchRequest2.equals(catalogsItemsUpsertBatchRequest1));
        System.assert(catalogsItemsUpsertBatchRequest1.equals(catalogsItemsUpsertBatchRequest1));
        System.assert(catalogsItemsUpsertBatchRequest3.equals(catalogsItemsUpsertBatchRequest4));
        System.assert(catalogsItemsUpsertBatchRequest4.equals(catalogsItemsUpsertBatchRequest3));
        System.assert(catalogsItemsUpsertBatchRequest3.equals(catalogsItemsUpsertBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest1 = OASCatalogsItemsUpsertBatchRequest.getExample();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest2 = OASCatalogsItemsUpsertBatchRequest.getExample();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest3 = new OASCatalogsItemsUpsertBatchRequest();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest4 = new OASCatalogsItemsUpsertBatchRequest();

        System.assert(catalogsItemsUpsertBatchRequest1.equals(catalogsItemsUpsertBatchRequest2));
        System.assert(catalogsItemsUpsertBatchRequest2.equals(catalogsItemsUpsertBatchRequest1));
        System.assert(catalogsItemsUpsertBatchRequest3.equals(catalogsItemsUpsertBatchRequest4));
        System.assert(catalogsItemsUpsertBatchRequest4.equals(catalogsItemsUpsertBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest1 = OASCatalogsItemsUpsertBatchRequest.getExample();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest2 = new OASCatalogsItemsUpsertBatchRequest();

        System.assertEquals(false, catalogsItemsUpsertBatchRequest1.equals('foo'));
        System.assertEquals(false, catalogsItemsUpsertBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest1 = OASCatalogsItemsUpsertBatchRequest.getExample();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest2 = new OASCatalogsItemsUpsertBatchRequest();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest3;

        System.assertEquals(false, catalogsItemsUpsertBatchRequest1.equals(catalogsItemsUpsertBatchRequest3));
        System.assertEquals(false, catalogsItemsUpsertBatchRequest2.equals(catalogsItemsUpsertBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest1 = OASCatalogsItemsUpsertBatchRequest.getExample();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest2 = new OASCatalogsItemsUpsertBatchRequest();

        System.assertEquals(catalogsItemsUpsertBatchRequest1.hashCode(), catalogsItemsUpsertBatchRequest1.hashCode());
        System.assertEquals(catalogsItemsUpsertBatchRequest2.hashCode(), catalogsItemsUpsertBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest1 = OASCatalogsItemsUpsertBatchRequest.getExample();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest2 = OASCatalogsItemsUpsertBatchRequest.getExample();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest3 = new OASCatalogsItemsUpsertBatchRequest();
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest4 = new OASCatalogsItemsUpsertBatchRequest();

        System.assert(catalogsItemsUpsertBatchRequest1.equals(catalogsItemsUpsertBatchRequest2));
        System.assert(catalogsItemsUpsertBatchRequest3.equals(catalogsItemsUpsertBatchRequest4));
        System.assertEquals(catalogsItemsUpsertBatchRequest1.hashCode(), catalogsItemsUpsertBatchRequest2.hashCode());
        System.assertEquals(catalogsItemsUpsertBatchRequest3.hashCode(), catalogsItemsUpsertBatchRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest = new OASCatalogsItemsUpsertBatchRequest();
        System.assertEquals(new List<OASItemUpsertBatchRecord>(), catalogsItemsUpsertBatchRequest.items);
        System.assertEquals(null, catalogsItemsUpsertBatchRequest.country);
        System.assertEquals(null, catalogsItemsUpsertBatchRequest.language);
        System.assertEquals(null, catalogsItemsUpsertBatchRequest.operation);
    }
}
