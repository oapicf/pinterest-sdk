@isTest
private class OASCatalogsReportDistributionIssueFiTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter1 = OASCatalogsReportDistributionIssueFi.getExample();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter2 = catalogsReportDistributionIssueFilter1;
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter3 = new OASCatalogsReportDistributionIssueFi();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter4 = catalogsReportDistributionIssueFilter3;

        System.assert(catalogsReportDistributionIssueFilter1.equals(catalogsReportDistributionIssueFilter2));
        System.assert(catalogsReportDistributionIssueFilter2.equals(catalogsReportDistributionIssueFilter1));
        System.assert(catalogsReportDistributionIssueFilter1.equals(catalogsReportDistributionIssueFilter1));
        System.assert(catalogsReportDistributionIssueFilter3.equals(catalogsReportDistributionIssueFilter4));
        System.assert(catalogsReportDistributionIssueFilter4.equals(catalogsReportDistributionIssueFilter3));
        System.assert(catalogsReportDistributionIssueFilter3.equals(catalogsReportDistributionIssueFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter1 = OASCatalogsReportDistributionIssueFi.getExample();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter2 = OASCatalogsReportDistributionIssueFi.getExample();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter3 = new OASCatalogsReportDistributionIssueFi();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter4 = new OASCatalogsReportDistributionIssueFi();

        System.assert(catalogsReportDistributionIssueFilter1.equals(catalogsReportDistributionIssueFilter2));
        System.assert(catalogsReportDistributionIssueFilter2.equals(catalogsReportDistributionIssueFilter1));
        System.assert(catalogsReportDistributionIssueFilter3.equals(catalogsReportDistributionIssueFilter4));
        System.assert(catalogsReportDistributionIssueFilter4.equals(catalogsReportDistributionIssueFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter1 = OASCatalogsReportDistributionIssueFi.getExample();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter2 = new OASCatalogsReportDistributionIssueFi();

        System.assertEquals(false, catalogsReportDistributionIssueFilter1.equals('foo'));
        System.assertEquals(false, catalogsReportDistributionIssueFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter1 = OASCatalogsReportDistributionIssueFi.getExample();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter2 = new OASCatalogsReportDistributionIssueFi();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter3;

        System.assertEquals(false, catalogsReportDistributionIssueFilter1.equals(catalogsReportDistributionIssueFilter3));
        System.assertEquals(false, catalogsReportDistributionIssueFilter2.equals(catalogsReportDistributionIssueFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter1 = OASCatalogsReportDistributionIssueFi.getExample();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter2 = new OASCatalogsReportDistributionIssueFi();

        System.assertEquals(catalogsReportDistributionIssueFilter1.hashCode(), catalogsReportDistributionIssueFilter1.hashCode());
        System.assertEquals(catalogsReportDistributionIssueFilter2.hashCode(), catalogsReportDistributionIssueFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter1 = OASCatalogsReportDistributionIssueFi.getExample();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter2 = OASCatalogsReportDistributionIssueFi.getExample();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter3 = new OASCatalogsReportDistributionIssueFi();
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter4 = new OASCatalogsReportDistributionIssueFi();

        System.assert(catalogsReportDistributionIssueFilter1.equals(catalogsReportDistributionIssueFilter2));
        System.assert(catalogsReportDistributionIssueFilter3.equals(catalogsReportDistributionIssueFilter4));
        System.assertEquals(catalogsReportDistributionIssueFilter1.hashCode(), catalogsReportDistributionIssueFilter2.hashCode());
        System.assertEquals(catalogsReportDistributionIssueFilter3.hashCode(), catalogsReportDistributionIssueFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsReportDistributionIssueFi catalogsReportDistributionIssueFilter = new OASCatalogsReportDistributionIssueFi();
        Map<String, String> x-property-mappings = catalogsReportDistributionIssueFilter.getx-property-mappings();
        System.assertEquals('reportType', x-property-mappings.get('report_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
