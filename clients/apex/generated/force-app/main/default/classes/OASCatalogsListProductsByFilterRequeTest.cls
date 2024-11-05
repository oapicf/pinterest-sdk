@isTest
private class OASCatalogsListProductsByFilterRequeTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest2 = catalogsListProductsByFilterRequest1;
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest3 = new OASCatalogsListProductsByFilterReque();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest4 = catalogsListProductsByFilterRequest3;

        System.assert(catalogsListProductsByFilterRequest1.equals(catalogsListProductsByFilterRequest2));
        System.assert(catalogsListProductsByFilterRequest2.equals(catalogsListProductsByFilterRequest1));
        System.assert(catalogsListProductsByFilterRequest1.equals(catalogsListProductsByFilterRequest1));
        System.assert(catalogsListProductsByFilterRequest3.equals(catalogsListProductsByFilterRequest4));
        System.assert(catalogsListProductsByFilterRequest4.equals(catalogsListProductsByFilterRequest3));
        System.assert(catalogsListProductsByFilterRequest3.equals(catalogsListProductsByFilterRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest2 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest3 = new OASCatalogsListProductsByFilterReque();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest4 = new OASCatalogsListProductsByFilterReque();

        System.assert(catalogsListProductsByFilterRequest1.equals(catalogsListProductsByFilterRequest2));
        System.assert(catalogsListProductsByFilterRequest2.equals(catalogsListProductsByFilterRequest1));
        System.assert(catalogsListProductsByFilterRequest3.equals(catalogsListProductsByFilterRequest4));
        System.assert(catalogsListProductsByFilterRequest4.equals(catalogsListProductsByFilterRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest2 = new OASCatalogsListProductsByFilterReque();

        System.assertEquals(false, catalogsListProductsByFilterRequest1.equals('foo'));
        System.assertEquals(false, catalogsListProductsByFilterRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest2 = new OASCatalogsListProductsByFilterReque();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest3;

        System.assertEquals(false, catalogsListProductsByFilterRequest1.equals(catalogsListProductsByFilterRequest3));
        System.assertEquals(false, catalogsListProductsByFilterRequest2.equals(catalogsListProductsByFilterRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest2 = new OASCatalogsListProductsByFilterReque();

        System.assertEquals(catalogsListProductsByFilterRequest1.hashCode(), catalogsListProductsByFilterRequest1.hashCode());
        System.assertEquals(catalogsListProductsByFilterRequest2.hashCode(), catalogsListProductsByFilterRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest2 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest3 = new OASCatalogsListProductsByFilterReque();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest4 = new OASCatalogsListProductsByFilterReque();

        System.assert(catalogsListProductsByFilterRequest1.equals(catalogsListProductsByFilterRequest2));
        System.assert(catalogsListProductsByFilterRequest3.equals(catalogsListProductsByFilterRequest4));
        System.assertEquals(catalogsListProductsByFilterRequest1.hashCode(), catalogsListProductsByFilterRequest2.hashCode());
        System.assertEquals(catalogsListProductsByFilterRequest3.hashCode(), catalogsListProductsByFilterRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequest = new OASCatalogsListProductsByFilterReque();
        Map<String, String> x-property-mappings = catalogsListProductsByFilterRequest.getx-property-mappings();
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
