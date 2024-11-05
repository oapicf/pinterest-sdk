@isTest
private class OASCatalogsReportDistributionStatsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsReportDistributionStats catalogsReportDistributionStats1 = OASCatalogsReportDistributionStats.getExample();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats2 = catalogsReportDistributionStats1;
        OASCatalogsReportDistributionStats catalogsReportDistributionStats3 = new OASCatalogsReportDistributionStats();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats4 = catalogsReportDistributionStats3;

        System.assert(catalogsReportDistributionStats1.equals(catalogsReportDistributionStats2));
        System.assert(catalogsReportDistributionStats2.equals(catalogsReportDistributionStats1));
        System.assert(catalogsReportDistributionStats1.equals(catalogsReportDistributionStats1));
        System.assert(catalogsReportDistributionStats3.equals(catalogsReportDistributionStats4));
        System.assert(catalogsReportDistributionStats4.equals(catalogsReportDistributionStats3));
        System.assert(catalogsReportDistributionStats3.equals(catalogsReportDistributionStats3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsReportDistributionStats catalogsReportDistributionStats1 = OASCatalogsReportDistributionStats.getExample();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats2 = OASCatalogsReportDistributionStats.getExample();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats3 = new OASCatalogsReportDistributionStats();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats4 = new OASCatalogsReportDistributionStats();

        System.assert(catalogsReportDistributionStats1.equals(catalogsReportDistributionStats2));
        System.assert(catalogsReportDistributionStats2.equals(catalogsReportDistributionStats1));
        System.assert(catalogsReportDistributionStats3.equals(catalogsReportDistributionStats4));
        System.assert(catalogsReportDistributionStats4.equals(catalogsReportDistributionStats3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsReportDistributionStats catalogsReportDistributionStats1 = OASCatalogsReportDistributionStats.getExample();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats2 = new OASCatalogsReportDistributionStats();

        System.assertEquals(false, catalogsReportDistributionStats1.equals('foo'));
        System.assertEquals(false, catalogsReportDistributionStats2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsReportDistributionStats catalogsReportDistributionStats1 = OASCatalogsReportDistributionStats.getExample();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats2 = new OASCatalogsReportDistributionStats();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats3;

        System.assertEquals(false, catalogsReportDistributionStats1.equals(catalogsReportDistributionStats3));
        System.assertEquals(false, catalogsReportDistributionStats2.equals(catalogsReportDistributionStats3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsReportDistributionStats catalogsReportDistributionStats1 = OASCatalogsReportDistributionStats.getExample();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats2 = new OASCatalogsReportDistributionStats();

        System.assertEquals(catalogsReportDistributionStats1.hashCode(), catalogsReportDistributionStats1.hashCode());
        System.assertEquals(catalogsReportDistributionStats2.hashCode(), catalogsReportDistributionStats2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsReportDistributionStats catalogsReportDistributionStats1 = OASCatalogsReportDistributionStats.getExample();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats2 = OASCatalogsReportDistributionStats.getExample();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats3 = new OASCatalogsReportDistributionStats();
        OASCatalogsReportDistributionStats catalogsReportDistributionStats4 = new OASCatalogsReportDistributionStats();

        System.assert(catalogsReportDistributionStats1.equals(catalogsReportDistributionStats2));
        System.assert(catalogsReportDistributionStats3.equals(catalogsReportDistributionStats4));
        System.assertEquals(catalogsReportDistributionStats1.hashCode(), catalogsReportDistributionStats2.hashCode());
        System.assertEquals(catalogsReportDistributionStats3.hashCode(), catalogsReportDistributionStats4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsReportDistributionStats catalogsReportDistributionStats = new OASCatalogsReportDistributionStats();
        Map<String, String> x-property-mappings = catalogsReportDistributionStats.getx-property-mappings();
        System.assertEquals('reportType', x-property-mappings.get('report_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
        System.assertEquals('codeLabel', x-property-mappings.get('code_label'));
        System.assertEquals('ineligibleForAds', x-property-mappings.get('ineligible_for_ads'));
        System.assertEquals('ineligibleForOrganic', x-property-mappings.get('ineligible_for_organic'));
    }
}
