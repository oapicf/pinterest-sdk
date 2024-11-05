@isTest
private class OASCatalogsHotelReportParametersRepoTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport1 = OASCatalogsHotelReportParametersRepo.getExample();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport2 = catalogsHotelReportParametersReport1;
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport3 = new OASCatalogsHotelReportParametersRepo();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport4 = catalogsHotelReportParametersReport3;

        System.assert(catalogsHotelReportParametersReport1.equals(catalogsHotelReportParametersReport2));
        System.assert(catalogsHotelReportParametersReport2.equals(catalogsHotelReportParametersReport1));
        System.assert(catalogsHotelReportParametersReport1.equals(catalogsHotelReportParametersReport1));
        System.assert(catalogsHotelReportParametersReport3.equals(catalogsHotelReportParametersReport4));
        System.assert(catalogsHotelReportParametersReport4.equals(catalogsHotelReportParametersReport3));
        System.assert(catalogsHotelReportParametersReport3.equals(catalogsHotelReportParametersReport3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport1 = OASCatalogsHotelReportParametersRepo.getExample();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport2 = OASCatalogsHotelReportParametersRepo.getExample();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport3 = new OASCatalogsHotelReportParametersRepo();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport4 = new OASCatalogsHotelReportParametersRepo();

        System.assert(catalogsHotelReportParametersReport1.equals(catalogsHotelReportParametersReport2));
        System.assert(catalogsHotelReportParametersReport2.equals(catalogsHotelReportParametersReport1));
        System.assert(catalogsHotelReportParametersReport3.equals(catalogsHotelReportParametersReport4));
        System.assert(catalogsHotelReportParametersReport4.equals(catalogsHotelReportParametersReport3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport1 = OASCatalogsHotelReportParametersRepo.getExample();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport2 = new OASCatalogsHotelReportParametersRepo();

        System.assertEquals(false, catalogsHotelReportParametersReport1.equals('foo'));
        System.assertEquals(false, catalogsHotelReportParametersReport2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport1 = OASCatalogsHotelReportParametersRepo.getExample();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport2 = new OASCatalogsHotelReportParametersRepo();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport3;

        System.assertEquals(false, catalogsHotelReportParametersReport1.equals(catalogsHotelReportParametersReport3));
        System.assertEquals(false, catalogsHotelReportParametersReport2.equals(catalogsHotelReportParametersReport3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport1 = OASCatalogsHotelReportParametersRepo.getExample();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport2 = new OASCatalogsHotelReportParametersRepo();

        System.assertEquals(catalogsHotelReportParametersReport1.hashCode(), catalogsHotelReportParametersReport1.hashCode());
        System.assertEquals(catalogsHotelReportParametersReport2.hashCode(), catalogsHotelReportParametersReport2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport1 = OASCatalogsHotelReportParametersRepo.getExample();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport2 = OASCatalogsHotelReportParametersRepo.getExample();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport3 = new OASCatalogsHotelReportParametersRepo();
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport4 = new OASCatalogsHotelReportParametersRepo();

        System.assert(catalogsHotelReportParametersReport1.equals(catalogsHotelReportParametersReport2));
        System.assert(catalogsHotelReportParametersReport3.equals(catalogsHotelReportParametersReport4));
        System.assertEquals(catalogsHotelReportParametersReport1.hashCode(), catalogsHotelReportParametersReport2.hashCode());
        System.assertEquals(catalogsHotelReportParametersReport3.hashCode(), catalogsHotelReportParametersReport4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelReportParametersRepo catalogsHotelReportParametersReport = new OASCatalogsHotelReportParametersRepo();
        Map<String, String> x-property-mappings = catalogsHotelReportParametersReport.getx-property-mappings();
        System.assertEquals('reportType', x-property-mappings.get('report_type'));
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
        System.assertEquals('processingResultId', x-property-mappings.get('processing_result_id'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
