@isTest
private class OASCatalogsListProductsByFilterRequeTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf2 = catalogsListProductsByFilterRequestOneOf1;
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf3 = new OASCatalogsListProductsByFilterReque();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf4 = catalogsListProductsByFilterRequestOneOf3;

        System.assert(catalogsListProductsByFilterRequestOneOf1.equals(catalogsListProductsByFilterRequestOneOf2));
        System.assert(catalogsListProductsByFilterRequestOneOf2.equals(catalogsListProductsByFilterRequestOneOf1));
        System.assert(catalogsListProductsByFilterRequestOneOf1.equals(catalogsListProductsByFilterRequestOneOf1));
        System.assert(catalogsListProductsByFilterRequestOneOf3.equals(catalogsListProductsByFilterRequestOneOf4));
        System.assert(catalogsListProductsByFilterRequestOneOf4.equals(catalogsListProductsByFilterRequestOneOf3));
        System.assert(catalogsListProductsByFilterRequestOneOf3.equals(catalogsListProductsByFilterRequestOneOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf2 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf3 = new OASCatalogsListProductsByFilterReque();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf4 = new OASCatalogsListProductsByFilterReque();

        System.assert(catalogsListProductsByFilterRequestOneOf1.equals(catalogsListProductsByFilterRequestOneOf2));
        System.assert(catalogsListProductsByFilterRequestOneOf2.equals(catalogsListProductsByFilterRequestOneOf1));
        System.assert(catalogsListProductsByFilterRequestOneOf3.equals(catalogsListProductsByFilterRequestOneOf4));
        System.assert(catalogsListProductsByFilterRequestOneOf4.equals(catalogsListProductsByFilterRequestOneOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf2 = new OASCatalogsListProductsByFilterReque();

        System.assertEquals(false, catalogsListProductsByFilterRequestOneOf1.equals('foo'));
        System.assertEquals(false, catalogsListProductsByFilterRequestOneOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf2 = new OASCatalogsListProductsByFilterReque();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf3;

        System.assertEquals(false, catalogsListProductsByFilterRequestOneOf1.equals(catalogsListProductsByFilterRequestOneOf3));
        System.assertEquals(false, catalogsListProductsByFilterRequestOneOf2.equals(catalogsListProductsByFilterRequestOneOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf2 = new OASCatalogsListProductsByFilterReque();

        System.assertEquals(catalogsListProductsByFilterRequestOneOf1.hashCode(), catalogsListProductsByFilterRequestOneOf1.hashCode());
        System.assertEquals(catalogsListProductsByFilterRequestOneOf2.hashCode(), catalogsListProductsByFilterRequestOneOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf1 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf2 = OASCatalogsListProductsByFilterReque.getExample();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf3 = new OASCatalogsListProductsByFilterReque();
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf4 = new OASCatalogsListProductsByFilterReque();

        System.assert(catalogsListProductsByFilterRequestOneOf1.equals(catalogsListProductsByFilterRequestOneOf2));
        System.assert(catalogsListProductsByFilterRequestOneOf3.equals(catalogsListProductsByFilterRequestOneOf4));
        System.assertEquals(catalogsListProductsByFilterRequestOneOf1.hashCode(), catalogsListProductsByFilterRequestOneOf2.hashCode());
        System.assertEquals(catalogsListProductsByFilterRequestOneOf3.hashCode(), catalogsListProductsByFilterRequestOneOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsListProductsByFilterReque catalogsListProductsByFilterRequestOneOf = new OASCatalogsListProductsByFilterReque();
        Map<String, String> x-property-mappings = catalogsListProductsByFilterRequestOneOf.getx-property-mappings();
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
    }
}
