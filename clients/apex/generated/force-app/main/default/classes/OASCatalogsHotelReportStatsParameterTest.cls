@isTest
private class OASCatalogsHotelReportStatsParameterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport1 = OASCatalogsHotelReportStatsParameter.getExample();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport2 = catalogsHotelReportStatsParametersReport1;
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport3 = new OASCatalogsHotelReportStatsParameter();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport4 = catalogsHotelReportStatsParametersReport3;

        System.assert(catalogsHotelReportStatsParametersReport1.equals(catalogsHotelReportStatsParametersReport2));
        System.assert(catalogsHotelReportStatsParametersReport2.equals(catalogsHotelReportStatsParametersReport1));
        System.assert(catalogsHotelReportStatsParametersReport1.equals(catalogsHotelReportStatsParametersReport1));
        System.assert(catalogsHotelReportStatsParametersReport3.equals(catalogsHotelReportStatsParametersReport4));
        System.assert(catalogsHotelReportStatsParametersReport4.equals(catalogsHotelReportStatsParametersReport3));
        System.assert(catalogsHotelReportStatsParametersReport3.equals(catalogsHotelReportStatsParametersReport3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport1 = OASCatalogsHotelReportStatsParameter.getExample();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport2 = OASCatalogsHotelReportStatsParameter.getExample();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport3 = new OASCatalogsHotelReportStatsParameter();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport4 = new OASCatalogsHotelReportStatsParameter();

        System.assert(catalogsHotelReportStatsParametersReport1.equals(catalogsHotelReportStatsParametersReport2));
        System.assert(catalogsHotelReportStatsParametersReport2.equals(catalogsHotelReportStatsParametersReport1));
        System.assert(catalogsHotelReportStatsParametersReport3.equals(catalogsHotelReportStatsParametersReport4));
        System.assert(catalogsHotelReportStatsParametersReport4.equals(catalogsHotelReportStatsParametersReport3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport1 = OASCatalogsHotelReportStatsParameter.getExample();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport2 = new OASCatalogsHotelReportStatsParameter();

        System.assertEquals(false, catalogsHotelReportStatsParametersReport1.equals('foo'));
        System.assertEquals(false, catalogsHotelReportStatsParametersReport2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport1 = OASCatalogsHotelReportStatsParameter.getExample();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport2 = new OASCatalogsHotelReportStatsParameter();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport3;

        System.assertEquals(false, catalogsHotelReportStatsParametersReport1.equals(catalogsHotelReportStatsParametersReport3));
        System.assertEquals(false, catalogsHotelReportStatsParametersReport2.equals(catalogsHotelReportStatsParametersReport3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport1 = OASCatalogsHotelReportStatsParameter.getExample();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport2 = new OASCatalogsHotelReportStatsParameter();

        System.assertEquals(catalogsHotelReportStatsParametersReport1.hashCode(), catalogsHotelReportStatsParametersReport1.hashCode());
        System.assertEquals(catalogsHotelReportStatsParametersReport2.hashCode(), catalogsHotelReportStatsParametersReport2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport1 = OASCatalogsHotelReportStatsParameter.getExample();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport2 = OASCatalogsHotelReportStatsParameter.getExample();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport3 = new OASCatalogsHotelReportStatsParameter();
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport4 = new OASCatalogsHotelReportStatsParameter();

        System.assert(catalogsHotelReportStatsParametersReport1.equals(catalogsHotelReportStatsParametersReport2));
        System.assert(catalogsHotelReportStatsParametersReport3.equals(catalogsHotelReportStatsParametersReport4));
        System.assertEquals(catalogsHotelReportStatsParametersReport1.hashCode(), catalogsHotelReportStatsParametersReport2.hashCode());
        System.assertEquals(catalogsHotelReportStatsParametersReport3.hashCode(), catalogsHotelReportStatsParametersReport4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelReportStatsParameter catalogsHotelReportStatsParametersReport = new OASCatalogsHotelReportStatsParameter();
        Map<String, String> x-property-mappings = catalogsHotelReportStatsParametersReport.getx-property-mappings();
        System.assertEquals('reportType', x-property-mappings.get('report_type'));
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
        System.assertEquals('processingResultId', x-property-mappings.get('processing_result_id'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
