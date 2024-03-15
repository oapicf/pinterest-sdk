@isTest
private class OASCatalogsItemsUpdateBatchRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest1 = OASCatalogsItemsUpdateBatchRequest.getExample();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest2 = catalogsItemsUpdateBatchRequest1;
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest3 = new OASCatalogsItemsUpdateBatchRequest();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest4 = catalogsItemsUpdateBatchRequest3;

        System.assert(catalogsItemsUpdateBatchRequest1.equals(catalogsItemsUpdateBatchRequest2));
        System.assert(catalogsItemsUpdateBatchRequest2.equals(catalogsItemsUpdateBatchRequest1));
        System.assert(catalogsItemsUpdateBatchRequest1.equals(catalogsItemsUpdateBatchRequest1));
        System.assert(catalogsItemsUpdateBatchRequest3.equals(catalogsItemsUpdateBatchRequest4));
        System.assert(catalogsItemsUpdateBatchRequest4.equals(catalogsItemsUpdateBatchRequest3));
        System.assert(catalogsItemsUpdateBatchRequest3.equals(catalogsItemsUpdateBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest1 = OASCatalogsItemsUpdateBatchRequest.getExample();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest2 = OASCatalogsItemsUpdateBatchRequest.getExample();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest3 = new OASCatalogsItemsUpdateBatchRequest();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest4 = new OASCatalogsItemsUpdateBatchRequest();

        System.assert(catalogsItemsUpdateBatchRequest1.equals(catalogsItemsUpdateBatchRequest2));
        System.assert(catalogsItemsUpdateBatchRequest2.equals(catalogsItemsUpdateBatchRequest1));
        System.assert(catalogsItemsUpdateBatchRequest3.equals(catalogsItemsUpdateBatchRequest4));
        System.assert(catalogsItemsUpdateBatchRequest4.equals(catalogsItemsUpdateBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest1 = OASCatalogsItemsUpdateBatchRequest.getExample();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest2 = new OASCatalogsItemsUpdateBatchRequest();

        System.assertEquals(false, catalogsItemsUpdateBatchRequest1.equals('foo'));
        System.assertEquals(false, catalogsItemsUpdateBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest1 = OASCatalogsItemsUpdateBatchRequest.getExample();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest2 = new OASCatalogsItemsUpdateBatchRequest();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest3;

        System.assertEquals(false, catalogsItemsUpdateBatchRequest1.equals(catalogsItemsUpdateBatchRequest3));
        System.assertEquals(false, catalogsItemsUpdateBatchRequest2.equals(catalogsItemsUpdateBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest1 = OASCatalogsItemsUpdateBatchRequest.getExample();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest2 = new OASCatalogsItemsUpdateBatchRequest();

        System.assertEquals(catalogsItemsUpdateBatchRequest1.hashCode(), catalogsItemsUpdateBatchRequest1.hashCode());
        System.assertEquals(catalogsItemsUpdateBatchRequest2.hashCode(), catalogsItemsUpdateBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest1 = OASCatalogsItemsUpdateBatchRequest.getExample();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest2 = OASCatalogsItemsUpdateBatchRequest.getExample();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest3 = new OASCatalogsItemsUpdateBatchRequest();
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest4 = new OASCatalogsItemsUpdateBatchRequest();

        System.assert(catalogsItemsUpdateBatchRequest1.equals(catalogsItemsUpdateBatchRequest2));
        System.assert(catalogsItemsUpdateBatchRequest3.equals(catalogsItemsUpdateBatchRequest4));
        System.assertEquals(catalogsItemsUpdateBatchRequest1.hashCode(), catalogsItemsUpdateBatchRequest2.hashCode());
        System.assertEquals(catalogsItemsUpdateBatchRequest3.hashCode(), catalogsItemsUpdateBatchRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest = new OASCatalogsItemsUpdateBatchRequest();
        System.assertEquals(new List<OASItemUpdateBatchRecord>(), catalogsItemsUpdateBatchRequest.items);
        System.assertEquals(null, catalogsItemsUpdateBatchRequest.country);
        System.assertEquals(null, catalogsItemsUpdateBatchRequest.language);
        System.assertEquals(null, catalogsItemsUpdateBatchRequest.operation);
    }
}
