@isTest
private class OASCatalogsListProductsByFeedBasedFiTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter1 = OASCatalogsListProductsByFeedBasedFi.getExample();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter2 = catalogsListProductsByFeedBasedFilter1;
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter3 = new OASCatalogsListProductsByFeedBasedFi();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter4 = catalogsListProductsByFeedBasedFilter3;

        System.assert(catalogsListProductsByFeedBasedFilter1.equals(catalogsListProductsByFeedBasedFilter2));
        System.assert(catalogsListProductsByFeedBasedFilter2.equals(catalogsListProductsByFeedBasedFilter1));
        System.assert(catalogsListProductsByFeedBasedFilter1.equals(catalogsListProductsByFeedBasedFilter1));
        System.assert(catalogsListProductsByFeedBasedFilter3.equals(catalogsListProductsByFeedBasedFilter4));
        System.assert(catalogsListProductsByFeedBasedFilter4.equals(catalogsListProductsByFeedBasedFilter3));
        System.assert(catalogsListProductsByFeedBasedFilter3.equals(catalogsListProductsByFeedBasedFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter1 = OASCatalogsListProductsByFeedBasedFi.getExample();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter2 = OASCatalogsListProductsByFeedBasedFi.getExample();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter3 = new OASCatalogsListProductsByFeedBasedFi();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter4 = new OASCatalogsListProductsByFeedBasedFi();

        System.assert(catalogsListProductsByFeedBasedFilter1.equals(catalogsListProductsByFeedBasedFilter2));
        System.assert(catalogsListProductsByFeedBasedFilter2.equals(catalogsListProductsByFeedBasedFilter1));
        System.assert(catalogsListProductsByFeedBasedFilter3.equals(catalogsListProductsByFeedBasedFilter4));
        System.assert(catalogsListProductsByFeedBasedFilter4.equals(catalogsListProductsByFeedBasedFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter1 = OASCatalogsListProductsByFeedBasedFi.getExample();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter2 = new OASCatalogsListProductsByFeedBasedFi();

        System.assertEquals(false, catalogsListProductsByFeedBasedFilter1.equals('foo'));
        System.assertEquals(false, catalogsListProductsByFeedBasedFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter1 = OASCatalogsListProductsByFeedBasedFi.getExample();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter2 = new OASCatalogsListProductsByFeedBasedFi();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter3;

        System.assertEquals(false, catalogsListProductsByFeedBasedFilter1.equals(catalogsListProductsByFeedBasedFilter3));
        System.assertEquals(false, catalogsListProductsByFeedBasedFilter2.equals(catalogsListProductsByFeedBasedFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter1 = OASCatalogsListProductsByFeedBasedFi.getExample();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter2 = new OASCatalogsListProductsByFeedBasedFi();

        System.assertEquals(catalogsListProductsByFeedBasedFilter1.hashCode(), catalogsListProductsByFeedBasedFilter1.hashCode());
        System.assertEquals(catalogsListProductsByFeedBasedFilter2.hashCode(), catalogsListProductsByFeedBasedFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter1 = OASCatalogsListProductsByFeedBasedFi.getExample();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter2 = OASCatalogsListProductsByFeedBasedFi.getExample();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter3 = new OASCatalogsListProductsByFeedBasedFi();
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter4 = new OASCatalogsListProductsByFeedBasedFi();

        System.assert(catalogsListProductsByFeedBasedFilter1.equals(catalogsListProductsByFeedBasedFilter2));
        System.assert(catalogsListProductsByFeedBasedFilter3.equals(catalogsListProductsByFeedBasedFilter4));
        System.assertEquals(catalogsListProductsByFeedBasedFilter1.hashCode(), catalogsListProductsByFeedBasedFilter2.hashCode());
        System.assertEquals(catalogsListProductsByFeedBasedFilter3.hashCode(), catalogsListProductsByFeedBasedFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsListProductsByFeedBasedFi catalogsListProductsByFeedBasedFilter = new OASCatalogsListProductsByFeedBasedFi();
        Map<String, String> x-property-mappings = catalogsListProductsByFeedBasedFilter.getx-property-mappings();
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
    }
}
