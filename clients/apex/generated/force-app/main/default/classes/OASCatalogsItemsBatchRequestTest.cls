@isTest
private class OASCatalogsItemsBatchRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest1 = OASCatalogsItemsBatchRequest.getExample();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest2 = catalogsItemsBatchRequest1;
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest3 = new OASCatalogsItemsBatchRequest();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest4 = catalogsItemsBatchRequest3;

        System.assert(catalogsItemsBatchRequest1.equals(catalogsItemsBatchRequest2));
        System.assert(catalogsItemsBatchRequest2.equals(catalogsItemsBatchRequest1));
        System.assert(catalogsItemsBatchRequest1.equals(catalogsItemsBatchRequest1));
        System.assert(catalogsItemsBatchRequest3.equals(catalogsItemsBatchRequest4));
        System.assert(catalogsItemsBatchRequest4.equals(catalogsItemsBatchRequest3));
        System.assert(catalogsItemsBatchRequest3.equals(catalogsItemsBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest1 = OASCatalogsItemsBatchRequest.getExample();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest2 = OASCatalogsItemsBatchRequest.getExample();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest3 = new OASCatalogsItemsBatchRequest();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest4 = new OASCatalogsItemsBatchRequest();

        System.assert(catalogsItemsBatchRequest1.equals(catalogsItemsBatchRequest2));
        System.assert(catalogsItemsBatchRequest2.equals(catalogsItemsBatchRequest1));
        System.assert(catalogsItemsBatchRequest3.equals(catalogsItemsBatchRequest4));
        System.assert(catalogsItemsBatchRequest4.equals(catalogsItemsBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest1 = OASCatalogsItemsBatchRequest.getExample();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest2 = new OASCatalogsItemsBatchRequest();

        System.assertEquals(false, catalogsItemsBatchRequest1.equals('foo'));
        System.assertEquals(false, catalogsItemsBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest1 = OASCatalogsItemsBatchRequest.getExample();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest2 = new OASCatalogsItemsBatchRequest();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest3;

        System.assertEquals(false, catalogsItemsBatchRequest1.equals(catalogsItemsBatchRequest3));
        System.assertEquals(false, catalogsItemsBatchRequest2.equals(catalogsItemsBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest1 = OASCatalogsItemsBatchRequest.getExample();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest2 = new OASCatalogsItemsBatchRequest();

        System.assertEquals(catalogsItemsBatchRequest1.hashCode(), catalogsItemsBatchRequest1.hashCode());
        System.assertEquals(catalogsItemsBatchRequest2.hashCode(), catalogsItemsBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest1 = OASCatalogsItemsBatchRequest.getExample();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest2 = OASCatalogsItemsBatchRequest.getExample();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest3 = new OASCatalogsItemsBatchRequest();
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest4 = new OASCatalogsItemsBatchRequest();

        System.assert(catalogsItemsBatchRequest1.equals(catalogsItemsBatchRequest2));
        System.assert(catalogsItemsBatchRequest3.equals(catalogsItemsBatchRequest4));
        System.assertEquals(catalogsItemsBatchRequest1.hashCode(), catalogsItemsBatchRequest2.hashCode());
        System.assertEquals(catalogsItemsBatchRequest3.hashCode(), catalogsItemsBatchRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsItemsBatchRequest catalogsItemsBatchRequest = new OASCatalogsItemsBatchRequest();
        System.assertEquals(new List<OASItemDeleteBatchRecord>(), catalogsItemsBatchRequest.items);
        System.assertEquals(null, catalogsItemsBatchRequest.country);
        System.assertEquals(null, catalogsItemsBatchRequest.language);
        System.assertEquals(null, catalogsItemsBatchRequest.operation);
    }
}
