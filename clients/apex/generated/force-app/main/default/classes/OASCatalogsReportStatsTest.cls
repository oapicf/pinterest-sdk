@isTest
private class OASCatalogsReportStatsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsReportStats catalogsReportStats1 = OASCatalogsReportStats.getExample();
        OASCatalogsReportStats catalogsReportStats2 = catalogsReportStats1;
        OASCatalogsReportStats catalogsReportStats3 = new OASCatalogsReportStats();
        OASCatalogsReportStats catalogsReportStats4 = catalogsReportStats3;

        System.assert(catalogsReportStats1.equals(catalogsReportStats2));
        System.assert(catalogsReportStats2.equals(catalogsReportStats1));
        System.assert(catalogsReportStats1.equals(catalogsReportStats1));
        System.assert(catalogsReportStats3.equals(catalogsReportStats4));
        System.assert(catalogsReportStats4.equals(catalogsReportStats3));
        System.assert(catalogsReportStats3.equals(catalogsReportStats3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsReportStats catalogsReportStats1 = OASCatalogsReportStats.getExample();
        OASCatalogsReportStats catalogsReportStats2 = OASCatalogsReportStats.getExample();
        OASCatalogsReportStats catalogsReportStats3 = new OASCatalogsReportStats();
        OASCatalogsReportStats catalogsReportStats4 = new OASCatalogsReportStats();

        System.assert(catalogsReportStats1.equals(catalogsReportStats2));
        System.assert(catalogsReportStats2.equals(catalogsReportStats1));
        System.assert(catalogsReportStats3.equals(catalogsReportStats4));
        System.assert(catalogsReportStats4.equals(catalogsReportStats3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsReportStats catalogsReportStats1 = OASCatalogsReportStats.getExample();
        OASCatalogsReportStats catalogsReportStats2 = new OASCatalogsReportStats();

        System.assertEquals(false, catalogsReportStats1.equals('foo'));
        System.assertEquals(false, catalogsReportStats2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsReportStats catalogsReportStats1 = OASCatalogsReportStats.getExample();
        OASCatalogsReportStats catalogsReportStats2 = new OASCatalogsReportStats();
        OASCatalogsReportStats catalogsReportStats3;

        System.assertEquals(false, catalogsReportStats1.equals(catalogsReportStats3));
        System.assertEquals(false, catalogsReportStats2.equals(catalogsReportStats3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsReportStats catalogsReportStats1 = OASCatalogsReportStats.getExample();
        OASCatalogsReportStats catalogsReportStats2 = new OASCatalogsReportStats();

        System.assertEquals(catalogsReportStats1.hashCode(), catalogsReportStats1.hashCode());
        System.assertEquals(catalogsReportStats2.hashCode(), catalogsReportStats2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsReportStats catalogsReportStats1 = OASCatalogsReportStats.getExample();
        OASCatalogsReportStats catalogsReportStats2 = OASCatalogsReportStats.getExample();
        OASCatalogsReportStats catalogsReportStats3 = new OASCatalogsReportStats();
        OASCatalogsReportStats catalogsReportStats4 = new OASCatalogsReportStats();

        System.assert(catalogsReportStats1.equals(catalogsReportStats2));
        System.assert(catalogsReportStats3.equals(catalogsReportStats4));
        System.assertEquals(catalogsReportStats1.hashCode(), catalogsReportStats2.hashCode());
        System.assertEquals(catalogsReportStats3.hashCode(), catalogsReportStats4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsReportStats catalogsReportStats = new OASCatalogsReportStats();
        Map<String, String> x-property-mappings = catalogsReportStats.getx-property-mappings();
        System.assertEquals('reportType', x-property-mappings.get('report_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
        System.assertEquals('codeLabel', x-property-mappings.get('code_label'));
        System.assertEquals('ineligibleForAds', x-property-mappings.get('ineligible_for_ads'));
        System.assertEquals('ineligibleForOrganic', x-property-mappings.get('ineligible_for_organic'));
    }
}
