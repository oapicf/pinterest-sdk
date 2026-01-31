@isTest
private class OASCatalogsReportAllItemsFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter1 = OASCatalogsReportAllItemsFilter.getExample();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter2 = catalogsReportAllItemsFilter1;
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter3 = new OASCatalogsReportAllItemsFilter();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter4 = catalogsReportAllItemsFilter3;

        System.assert(catalogsReportAllItemsFilter1.equals(catalogsReportAllItemsFilter2));
        System.assert(catalogsReportAllItemsFilter2.equals(catalogsReportAllItemsFilter1));
        System.assert(catalogsReportAllItemsFilter1.equals(catalogsReportAllItemsFilter1));
        System.assert(catalogsReportAllItemsFilter3.equals(catalogsReportAllItemsFilter4));
        System.assert(catalogsReportAllItemsFilter4.equals(catalogsReportAllItemsFilter3));
        System.assert(catalogsReportAllItemsFilter3.equals(catalogsReportAllItemsFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter1 = OASCatalogsReportAllItemsFilter.getExample();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter2 = OASCatalogsReportAllItemsFilter.getExample();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter3 = new OASCatalogsReportAllItemsFilter();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter4 = new OASCatalogsReportAllItemsFilter();

        System.assert(catalogsReportAllItemsFilter1.equals(catalogsReportAllItemsFilter2));
        System.assert(catalogsReportAllItemsFilter2.equals(catalogsReportAllItemsFilter1));
        System.assert(catalogsReportAllItemsFilter3.equals(catalogsReportAllItemsFilter4));
        System.assert(catalogsReportAllItemsFilter4.equals(catalogsReportAllItemsFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter1 = OASCatalogsReportAllItemsFilter.getExample();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter2 = new OASCatalogsReportAllItemsFilter();

        System.assertEquals(false, catalogsReportAllItemsFilter1.equals('foo'));
        System.assertEquals(false, catalogsReportAllItemsFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter1 = OASCatalogsReportAllItemsFilter.getExample();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter2 = new OASCatalogsReportAllItemsFilter();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter3;

        System.assertEquals(false, catalogsReportAllItemsFilter1.equals(catalogsReportAllItemsFilter3));
        System.assertEquals(false, catalogsReportAllItemsFilter2.equals(catalogsReportAllItemsFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter1 = OASCatalogsReportAllItemsFilter.getExample();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter2 = new OASCatalogsReportAllItemsFilter();

        System.assertEquals(catalogsReportAllItemsFilter1.hashCode(), catalogsReportAllItemsFilter1.hashCode());
        System.assertEquals(catalogsReportAllItemsFilter2.hashCode(), catalogsReportAllItemsFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter1 = OASCatalogsReportAllItemsFilter.getExample();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter2 = OASCatalogsReportAllItemsFilter.getExample();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter3 = new OASCatalogsReportAllItemsFilter();
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter4 = new OASCatalogsReportAllItemsFilter();

        System.assert(catalogsReportAllItemsFilter1.equals(catalogsReportAllItemsFilter2));
        System.assert(catalogsReportAllItemsFilter3.equals(catalogsReportAllItemsFilter4));
        System.assertEquals(catalogsReportAllItemsFilter1.hashCode(), catalogsReportAllItemsFilter2.hashCode());
        System.assertEquals(catalogsReportAllItemsFilter3.hashCode(), catalogsReportAllItemsFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsReportAllItemsFilter catalogsReportAllItemsFilter = new OASCatalogsReportAllItemsFilter();
        Map<String, String> x-property-mappings = catalogsReportAllItemsFilter.getx-property-mappings();
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
        System.assertEquals('reportType', x-property-mappings.get('report_type'));
    }
}
