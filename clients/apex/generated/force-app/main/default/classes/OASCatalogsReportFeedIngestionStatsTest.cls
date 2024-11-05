@isTest
private class OASCatalogsReportFeedIngestionStatsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats1 = OASCatalogsReportFeedIngestionStats.getExample();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats2 = catalogsReportFeedIngestionStats1;
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats3 = new OASCatalogsReportFeedIngestionStats();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats4 = catalogsReportFeedIngestionStats3;

        System.assert(catalogsReportFeedIngestionStats1.equals(catalogsReportFeedIngestionStats2));
        System.assert(catalogsReportFeedIngestionStats2.equals(catalogsReportFeedIngestionStats1));
        System.assert(catalogsReportFeedIngestionStats1.equals(catalogsReportFeedIngestionStats1));
        System.assert(catalogsReportFeedIngestionStats3.equals(catalogsReportFeedIngestionStats4));
        System.assert(catalogsReportFeedIngestionStats4.equals(catalogsReportFeedIngestionStats3));
        System.assert(catalogsReportFeedIngestionStats3.equals(catalogsReportFeedIngestionStats3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats1 = OASCatalogsReportFeedIngestionStats.getExample();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats2 = OASCatalogsReportFeedIngestionStats.getExample();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats3 = new OASCatalogsReportFeedIngestionStats();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats4 = new OASCatalogsReportFeedIngestionStats();

        System.assert(catalogsReportFeedIngestionStats1.equals(catalogsReportFeedIngestionStats2));
        System.assert(catalogsReportFeedIngestionStats2.equals(catalogsReportFeedIngestionStats1));
        System.assert(catalogsReportFeedIngestionStats3.equals(catalogsReportFeedIngestionStats4));
        System.assert(catalogsReportFeedIngestionStats4.equals(catalogsReportFeedIngestionStats3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats1 = OASCatalogsReportFeedIngestionStats.getExample();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats2 = new OASCatalogsReportFeedIngestionStats();

        System.assertEquals(false, catalogsReportFeedIngestionStats1.equals('foo'));
        System.assertEquals(false, catalogsReportFeedIngestionStats2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats1 = OASCatalogsReportFeedIngestionStats.getExample();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats2 = new OASCatalogsReportFeedIngestionStats();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats3;

        System.assertEquals(false, catalogsReportFeedIngestionStats1.equals(catalogsReportFeedIngestionStats3));
        System.assertEquals(false, catalogsReportFeedIngestionStats2.equals(catalogsReportFeedIngestionStats3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats1 = OASCatalogsReportFeedIngestionStats.getExample();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats2 = new OASCatalogsReportFeedIngestionStats();

        System.assertEquals(catalogsReportFeedIngestionStats1.hashCode(), catalogsReportFeedIngestionStats1.hashCode());
        System.assertEquals(catalogsReportFeedIngestionStats2.hashCode(), catalogsReportFeedIngestionStats2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats1 = OASCatalogsReportFeedIngestionStats.getExample();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats2 = OASCatalogsReportFeedIngestionStats.getExample();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats3 = new OASCatalogsReportFeedIngestionStats();
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats4 = new OASCatalogsReportFeedIngestionStats();

        System.assert(catalogsReportFeedIngestionStats1.equals(catalogsReportFeedIngestionStats2));
        System.assert(catalogsReportFeedIngestionStats3.equals(catalogsReportFeedIngestionStats4));
        System.assertEquals(catalogsReportFeedIngestionStats1.hashCode(), catalogsReportFeedIngestionStats2.hashCode());
        System.assertEquals(catalogsReportFeedIngestionStats3.hashCode(), catalogsReportFeedIngestionStats4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats = new OASCatalogsReportFeedIngestionStats();
        Map<String, String> x-property-mappings = catalogsReportFeedIngestionStats.getx-property-mappings();
        System.assertEquals('reportType', x-property-mappings.get('report_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
        System.assertEquals('codeLabel', x-property-mappings.get('code_label'));
    }
}
