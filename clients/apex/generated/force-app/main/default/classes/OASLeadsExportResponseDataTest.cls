@isTest
private class OASLeadsExportResponseDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadsExportResponseData leadsExportResponseData1 = OASLeadsExportResponseData.getExample();
        OASLeadsExportResponseData leadsExportResponseData2 = leadsExportResponseData1;
        OASLeadsExportResponseData leadsExportResponseData3 = new OASLeadsExportResponseData();
        OASLeadsExportResponseData leadsExportResponseData4 = leadsExportResponseData3;

        System.assert(leadsExportResponseData1.equals(leadsExportResponseData2));
        System.assert(leadsExportResponseData2.equals(leadsExportResponseData1));
        System.assert(leadsExportResponseData1.equals(leadsExportResponseData1));
        System.assert(leadsExportResponseData3.equals(leadsExportResponseData4));
        System.assert(leadsExportResponseData4.equals(leadsExportResponseData3));
        System.assert(leadsExportResponseData3.equals(leadsExportResponseData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadsExportResponseData leadsExportResponseData1 = OASLeadsExportResponseData.getExample();
        OASLeadsExportResponseData leadsExportResponseData2 = OASLeadsExportResponseData.getExample();
        OASLeadsExportResponseData leadsExportResponseData3 = new OASLeadsExportResponseData();
        OASLeadsExportResponseData leadsExportResponseData4 = new OASLeadsExportResponseData();

        System.assert(leadsExportResponseData1.equals(leadsExportResponseData2));
        System.assert(leadsExportResponseData2.equals(leadsExportResponseData1));
        System.assert(leadsExportResponseData3.equals(leadsExportResponseData4));
        System.assert(leadsExportResponseData4.equals(leadsExportResponseData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadsExportResponseData leadsExportResponseData1 = OASLeadsExportResponseData.getExample();
        OASLeadsExportResponseData leadsExportResponseData2 = new OASLeadsExportResponseData();

        System.assertEquals(false, leadsExportResponseData1.equals('foo'));
        System.assertEquals(false, leadsExportResponseData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadsExportResponseData leadsExportResponseData1 = OASLeadsExportResponseData.getExample();
        OASLeadsExportResponseData leadsExportResponseData2 = new OASLeadsExportResponseData();
        OASLeadsExportResponseData leadsExportResponseData3;

        System.assertEquals(false, leadsExportResponseData1.equals(leadsExportResponseData3));
        System.assertEquals(false, leadsExportResponseData2.equals(leadsExportResponseData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadsExportResponseData leadsExportResponseData1 = OASLeadsExportResponseData.getExample();
        OASLeadsExportResponseData leadsExportResponseData2 = new OASLeadsExportResponseData();

        System.assertEquals(leadsExportResponseData1.hashCode(), leadsExportResponseData1.hashCode());
        System.assertEquals(leadsExportResponseData2.hashCode(), leadsExportResponseData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadsExportResponseData leadsExportResponseData1 = OASLeadsExportResponseData.getExample();
        OASLeadsExportResponseData leadsExportResponseData2 = OASLeadsExportResponseData.getExample();
        OASLeadsExportResponseData leadsExportResponseData3 = new OASLeadsExportResponseData();
        OASLeadsExportResponseData leadsExportResponseData4 = new OASLeadsExportResponseData();

        System.assert(leadsExportResponseData1.equals(leadsExportResponseData2));
        System.assert(leadsExportResponseData3.equals(leadsExportResponseData4));
        System.assertEquals(leadsExportResponseData1.hashCode(), leadsExportResponseData2.hashCode());
        System.assertEquals(leadsExportResponseData3.hashCode(), leadsExportResponseData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadsExportResponseData leadsExportResponseData = new OASLeadsExportResponseData();
        Map<String, String> x-property-mappings = leadsExportResponseData.getx-property-mappings();
        System.assertEquals('exportStatus', x-property-mappings.get('export_status'));
        System.assertEquals('downloadUrl', x-property-mappings.get('download_url'));
    }
}
