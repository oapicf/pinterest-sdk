@isTest
private class OASCatalogsItemsDeleteDiscontinuedBaTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest1 = OASCatalogsItemsDeleteDiscontinuedBa.getExample();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest2 = catalogsItemsDeleteDiscontinuedBatchRequest1;
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest3 = new OASCatalogsItemsDeleteDiscontinuedBa();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest4 = catalogsItemsDeleteDiscontinuedBatchRequest3;

        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest1.equals(catalogsItemsDeleteDiscontinuedBatchRequest2));
        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest2.equals(catalogsItemsDeleteDiscontinuedBatchRequest1));
        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest1.equals(catalogsItemsDeleteDiscontinuedBatchRequest1));
        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest3.equals(catalogsItemsDeleteDiscontinuedBatchRequest4));
        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest4.equals(catalogsItemsDeleteDiscontinuedBatchRequest3));
        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest3.equals(catalogsItemsDeleteDiscontinuedBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest1 = OASCatalogsItemsDeleteDiscontinuedBa.getExample();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest2 = OASCatalogsItemsDeleteDiscontinuedBa.getExample();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest3 = new OASCatalogsItemsDeleteDiscontinuedBa();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest4 = new OASCatalogsItemsDeleteDiscontinuedBa();

        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest1.equals(catalogsItemsDeleteDiscontinuedBatchRequest2));
        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest2.equals(catalogsItemsDeleteDiscontinuedBatchRequest1));
        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest3.equals(catalogsItemsDeleteDiscontinuedBatchRequest4));
        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest4.equals(catalogsItemsDeleteDiscontinuedBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest1 = OASCatalogsItemsDeleteDiscontinuedBa.getExample();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest2 = new OASCatalogsItemsDeleteDiscontinuedBa();

        System.assertEquals(false, catalogsItemsDeleteDiscontinuedBatchRequest1.equals('foo'));
        System.assertEquals(false, catalogsItemsDeleteDiscontinuedBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest1 = OASCatalogsItemsDeleteDiscontinuedBa.getExample();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest2 = new OASCatalogsItemsDeleteDiscontinuedBa();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest3;

        System.assertEquals(false, catalogsItemsDeleteDiscontinuedBatchRequest1.equals(catalogsItemsDeleteDiscontinuedBatchRequest3));
        System.assertEquals(false, catalogsItemsDeleteDiscontinuedBatchRequest2.equals(catalogsItemsDeleteDiscontinuedBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest1 = OASCatalogsItemsDeleteDiscontinuedBa.getExample();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest2 = new OASCatalogsItemsDeleteDiscontinuedBa();

        System.assertEquals(catalogsItemsDeleteDiscontinuedBatchRequest1.hashCode(), catalogsItemsDeleteDiscontinuedBatchRequest1.hashCode());
        System.assertEquals(catalogsItemsDeleteDiscontinuedBatchRequest2.hashCode(), catalogsItemsDeleteDiscontinuedBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest1 = OASCatalogsItemsDeleteDiscontinuedBa.getExample();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest2 = OASCatalogsItemsDeleteDiscontinuedBa.getExample();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest3 = new OASCatalogsItemsDeleteDiscontinuedBa();
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest4 = new OASCatalogsItemsDeleteDiscontinuedBa();

        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest1.equals(catalogsItemsDeleteDiscontinuedBatchRequest2));
        System.assert(catalogsItemsDeleteDiscontinuedBatchRequest3.equals(catalogsItemsDeleteDiscontinuedBatchRequest4));
        System.assertEquals(catalogsItemsDeleteDiscontinuedBatchRequest1.hashCode(), catalogsItemsDeleteDiscontinuedBatchRequest2.hashCode());
        System.assertEquals(catalogsItemsDeleteDiscontinuedBatchRequest3.hashCode(), catalogsItemsDeleteDiscontinuedBatchRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsItemsDeleteDiscontinuedBa catalogsItemsDeleteDiscontinuedBatchRequest = new OASCatalogsItemsDeleteDiscontinuedBa();
        System.assertEquals(new List<OASItemDeleteDiscontinuedBatchRecord>(), catalogsItemsDeleteDiscontinuedBatchRequest.items);
        System.assertEquals(null, catalogsItemsDeleteDiscontinuedBatchRequest.country);
        System.assertEquals(null, catalogsItemsDeleteDiscontinuedBatchRequest.language);
        System.assertEquals(null, catalogsItemsDeleteDiscontinuedBatchRequest.operation);
    }
}
