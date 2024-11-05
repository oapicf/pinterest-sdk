@isTest
private class OASCatalogsItemsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemsRequest catalogsItemsRequest1 = OASCatalogsItemsRequest.getExample();
        OASCatalogsItemsRequest catalogsItemsRequest2 = catalogsItemsRequest1;
        OASCatalogsItemsRequest catalogsItemsRequest3 = new OASCatalogsItemsRequest();
        OASCatalogsItemsRequest catalogsItemsRequest4 = catalogsItemsRequest3;

        System.assert(catalogsItemsRequest1.equals(catalogsItemsRequest2));
        System.assert(catalogsItemsRequest2.equals(catalogsItemsRequest1));
        System.assert(catalogsItemsRequest1.equals(catalogsItemsRequest1));
        System.assert(catalogsItemsRequest3.equals(catalogsItemsRequest4));
        System.assert(catalogsItemsRequest4.equals(catalogsItemsRequest3));
        System.assert(catalogsItemsRequest3.equals(catalogsItemsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemsRequest catalogsItemsRequest1 = OASCatalogsItemsRequest.getExample();
        OASCatalogsItemsRequest catalogsItemsRequest2 = OASCatalogsItemsRequest.getExample();
        OASCatalogsItemsRequest catalogsItemsRequest3 = new OASCatalogsItemsRequest();
        OASCatalogsItemsRequest catalogsItemsRequest4 = new OASCatalogsItemsRequest();

        System.assert(catalogsItemsRequest1.equals(catalogsItemsRequest2));
        System.assert(catalogsItemsRequest2.equals(catalogsItemsRequest1));
        System.assert(catalogsItemsRequest3.equals(catalogsItemsRequest4));
        System.assert(catalogsItemsRequest4.equals(catalogsItemsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemsRequest catalogsItemsRequest1 = OASCatalogsItemsRequest.getExample();
        OASCatalogsItemsRequest catalogsItemsRequest2 = new OASCatalogsItemsRequest();

        System.assertEquals(false, catalogsItemsRequest1.equals('foo'));
        System.assertEquals(false, catalogsItemsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemsRequest catalogsItemsRequest1 = OASCatalogsItemsRequest.getExample();
        OASCatalogsItemsRequest catalogsItemsRequest2 = new OASCatalogsItemsRequest();
        OASCatalogsItemsRequest catalogsItemsRequest3;

        System.assertEquals(false, catalogsItemsRequest1.equals(catalogsItemsRequest3));
        System.assertEquals(false, catalogsItemsRequest2.equals(catalogsItemsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemsRequest catalogsItemsRequest1 = OASCatalogsItemsRequest.getExample();
        OASCatalogsItemsRequest catalogsItemsRequest2 = new OASCatalogsItemsRequest();

        System.assertEquals(catalogsItemsRequest1.hashCode(), catalogsItemsRequest1.hashCode());
        System.assertEquals(catalogsItemsRequest2.hashCode(), catalogsItemsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemsRequest catalogsItemsRequest1 = OASCatalogsItemsRequest.getExample();
        OASCatalogsItemsRequest catalogsItemsRequest2 = OASCatalogsItemsRequest.getExample();
        OASCatalogsItemsRequest catalogsItemsRequest3 = new OASCatalogsItemsRequest();
        OASCatalogsItemsRequest catalogsItemsRequest4 = new OASCatalogsItemsRequest();

        System.assert(catalogsItemsRequest1.equals(catalogsItemsRequest2));
        System.assert(catalogsItemsRequest3.equals(catalogsItemsRequest4));
        System.assertEquals(catalogsItemsRequest1.hashCode(), catalogsItemsRequest2.hashCode());
        System.assertEquals(catalogsItemsRequest3.hashCode(), catalogsItemsRequest4.hashCode());
    }
}
