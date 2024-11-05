@isTest
private class OASCatalogsCreateReportResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreateReportResponse catalogsCreateReportResponse1 = OASCatalogsCreateReportResponse.getExample();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse2 = catalogsCreateReportResponse1;
        OASCatalogsCreateReportResponse catalogsCreateReportResponse3 = new OASCatalogsCreateReportResponse();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse4 = catalogsCreateReportResponse3;

        System.assert(catalogsCreateReportResponse1.equals(catalogsCreateReportResponse2));
        System.assert(catalogsCreateReportResponse2.equals(catalogsCreateReportResponse1));
        System.assert(catalogsCreateReportResponse1.equals(catalogsCreateReportResponse1));
        System.assert(catalogsCreateReportResponse3.equals(catalogsCreateReportResponse4));
        System.assert(catalogsCreateReportResponse4.equals(catalogsCreateReportResponse3));
        System.assert(catalogsCreateReportResponse3.equals(catalogsCreateReportResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreateReportResponse catalogsCreateReportResponse1 = OASCatalogsCreateReportResponse.getExample();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse2 = OASCatalogsCreateReportResponse.getExample();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse3 = new OASCatalogsCreateReportResponse();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse4 = new OASCatalogsCreateReportResponse();

        System.assert(catalogsCreateReportResponse1.equals(catalogsCreateReportResponse2));
        System.assert(catalogsCreateReportResponse2.equals(catalogsCreateReportResponse1));
        System.assert(catalogsCreateReportResponse3.equals(catalogsCreateReportResponse4));
        System.assert(catalogsCreateReportResponse4.equals(catalogsCreateReportResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreateReportResponse catalogsCreateReportResponse1 = OASCatalogsCreateReportResponse.getExample();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse2 = new OASCatalogsCreateReportResponse();

        System.assertEquals(false, catalogsCreateReportResponse1.equals('foo'));
        System.assertEquals(false, catalogsCreateReportResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreateReportResponse catalogsCreateReportResponse1 = OASCatalogsCreateReportResponse.getExample();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse2 = new OASCatalogsCreateReportResponse();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse3;

        System.assertEquals(false, catalogsCreateReportResponse1.equals(catalogsCreateReportResponse3));
        System.assertEquals(false, catalogsCreateReportResponse2.equals(catalogsCreateReportResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreateReportResponse catalogsCreateReportResponse1 = OASCatalogsCreateReportResponse.getExample();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse2 = new OASCatalogsCreateReportResponse();

        System.assertEquals(catalogsCreateReportResponse1.hashCode(), catalogsCreateReportResponse1.hashCode());
        System.assertEquals(catalogsCreateReportResponse2.hashCode(), catalogsCreateReportResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreateReportResponse catalogsCreateReportResponse1 = OASCatalogsCreateReportResponse.getExample();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse2 = OASCatalogsCreateReportResponse.getExample();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse3 = new OASCatalogsCreateReportResponse();
        OASCatalogsCreateReportResponse catalogsCreateReportResponse4 = new OASCatalogsCreateReportResponse();

        System.assert(catalogsCreateReportResponse1.equals(catalogsCreateReportResponse2));
        System.assert(catalogsCreateReportResponse3.equals(catalogsCreateReportResponse4));
        System.assertEquals(catalogsCreateReportResponse1.hashCode(), catalogsCreateReportResponse2.hashCode());
        System.assertEquals(catalogsCreateReportResponse3.hashCode(), catalogsCreateReportResponse4.hashCode());
    }
}
