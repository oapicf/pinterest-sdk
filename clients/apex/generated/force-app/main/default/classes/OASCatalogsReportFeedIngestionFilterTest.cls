@isTest
private class OASCatalogsReportFeedIngestionFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter1 = OASCatalogsReportFeedIngestionFilter.getExample();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter2 = catalogsReportFeedIngestionFilter1;
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter3 = new OASCatalogsReportFeedIngestionFilter();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter4 = catalogsReportFeedIngestionFilter3;

        System.assert(catalogsReportFeedIngestionFilter1.equals(catalogsReportFeedIngestionFilter2));
        System.assert(catalogsReportFeedIngestionFilter2.equals(catalogsReportFeedIngestionFilter1));
        System.assert(catalogsReportFeedIngestionFilter1.equals(catalogsReportFeedIngestionFilter1));
        System.assert(catalogsReportFeedIngestionFilter3.equals(catalogsReportFeedIngestionFilter4));
        System.assert(catalogsReportFeedIngestionFilter4.equals(catalogsReportFeedIngestionFilter3));
        System.assert(catalogsReportFeedIngestionFilter3.equals(catalogsReportFeedIngestionFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter1 = OASCatalogsReportFeedIngestionFilter.getExample();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter2 = OASCatalogsReportFeedIngestionFilter.getExample();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter3 = new OASCatalogsReportFeedIngestionFilter();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter4 = new OASCatalogsReportFeedIngestionFilter();

        System.assert(catalogsReportFeedIngestionFilter1.equals(catalogsReportFeedIngestionFilter2));
        System.assert(catalogsReportFeedIngestionFilter2.equals(catalogsReportFeedIngestionFilter1));
        System.assert(catalogsReportFeedIngestionFilter3.equals(catalogsReportFeedIngestionFilter4));
        System.assert(catalogsReportFeedIngestionFilter4.equals(catalogsReportFeedIngestionFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter1 = OASCatalogsReportFeedIngestionFilter.getExample();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter2 = new OASCatalogsReportFeedIngestionFilter();

        System.assertEquals(false, catalogsReportFeedIngestionFilter1.equals('foo'));
        System.assertEquals(false, catalogsReportFeedIngestionFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter1 = OASCatalogsReportFeedIngestionFilter.getExample();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter2 = new OASCatalogsReportFeedIngestionFilter();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter3;

        System.assertEquals(false, catalogsReportFeedIngestionFilter1.equals(catalogsReportFeedIngestionFilter3));
        System.assertEquals(false, catalogsReportFeedIngestionFilter2.equals(catalogsReportFeedIngestionFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter1 = OASCatalogsReportFeedIngestionFilter.getExample();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter2 = new OASCatalogsReportFeedIngestionFilter();

        System.assertEquals(catalogsReportFeedIngestionFilter1.hashCode(), catalogsReportFeedIngestionFilter1.hashCode());
        System.assertEquals(catalogsReportFeedIngestionFilter2.hashCode(), catalogsReportFeedIngestionFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter1 = OASCatalogsReportFeedIngestionFilter.getExample();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter2 = OASCatalogsReportFeedIngestionFilter.getExample();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter3 = new OASCatalogsReportFeedIngestionFilter();
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter4 = new OASCatalogsReportFeedIngestionFilter();

        System.assert(catalogsReportFeedIngestionFilter1.equals(catalogsReportFeedIngestionFilter2));
        System.assert(catalogsReportFeedIngestionFilter3.equals(catalogsReportFeedIngestionFilter4));
        System.assertEquals(catalogsReportFeedIngestionFilter1.hashCode(), catalogsReportFeedIngestionFilter2.hashCode());
        System.assertEquals(catalogsReportFeedIngestionFilter3.hashCode(), catalogsReportFeedIngestionFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsReportFeedIngestionFilter catalogsReportFeedIngestionFilter = new OASCatalogsReportFeedIngestionFilter();
        Map<String, String> x-property-mappings = catalogsReportFeedIngestionFilter.getx-property-mappings();
        System.assertEquals('reportType', x-property-mappings.get('report_type'));
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
        System.assertEquals('processingResultId', x-property-mappings.get('processing_result_id'));
    }
}
