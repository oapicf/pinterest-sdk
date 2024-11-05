@isTest
private class OASCatalogsReportTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsReport catalogsReport1 = OASCatalogsReport.getExample();
        OASCatalogsReport catalogsReport2 = catalogsReport1;
        OASCatalogsReport catalogsReport3 = new OASCatalogsReport();
        OASCatalogsReport catalogsReport4 = catalogsReport3;

        System.assert(catalogsReport1.equals(catalogsReport2));
        System.assert(catalogsReport2.equals(catalogsReport1));
        System.assert(catalogsReport1.equals(catalogsReport1));
        System.assert(catalogsReport3.equals(catalogsReport4));
        System.assert(catalogsReport4.equals(catalogsReport3));
        System.assert(catalogsReport3.equals(catalogsReport3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsReport catalogsReport1 = OASCatalogsReport.getExample();
        OASCatalogsReport catalogsReport2 = OASCatalogsReport.getExample();
        OASCatalogsReport catalogsReport3 = new OASCatalogsReport();
        OASCatalogsReport catalogsReport4 = new OASCatalogsReport();

        System.assert(catalogsReport1.equals(catalogsReport2));
        System.assert(catalogsReport2.equals(catalogsReport1));
        System.assert(catalogsReport3.equals(catalogsReport4));
        System.assert(catalogsReport4.equals(catalogsReport3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsReport catalogsReport1 = OASCatalogsReport.getExample();
        OASCatalogsReport catalogsReport2 = new OASCatalogsReport();

        System.assertEquals(false, catalogsReport1.equals('foo'));
        System.assertEquals(false, catalogsReport2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsReport catalogsReport1 = OASCatalogsReport.getExample();
        OASCatalogsReport catalogsReport2 = new OASCatalogsReport();
        OASCatalogsReport catalogsReport3;

        System.assertEquals(false, catalogsReport1.equals(catalogsReport3));
        System.assertEquals(false, catalogsReport2.equals(catalogsReport3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsReport catalogsReport1 = OASCatalogsReport.getExample();
        OASCatalogsReport catalogsReport2 = new OASCatalogsReport();

        System.assertEquals(catalogsReport1.hashCode(), catalogsReport1.hashCode());
        System.assertEquals(catalogsReport2.hashCode(), catalogsReport2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsReport catalogsReport1 = OASCatalogsReport.getExample();
        OASCatalogsReport catalogsReport2 = OASCatalogsReport.getExample();
        OASCatalogsReport catalogsReport3 = new OASCatalogsReport();
        OASCatalogsReport catalogsReport4 = new OASCatalogsReport();

        System.assert(catalogsReport1.equals(catalogsReport2));
        System.assert(catalogsReport3.equals(catalogsReport4));
        System.assertEquals(catalogsReport1.hashCode(), catalogsReport2.hashCode());
        System.assertEquals(catalogsReport3.hashCode(), catalogsReport4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsReport catalogsReport = new OASCatalogsReport();
        Map<String, String> x-property-mappings = catalogsReport.getx-property-mappings();
        System.assertEquals('reportStatus', x-property-mappings.get('report_status'));
    }
}
