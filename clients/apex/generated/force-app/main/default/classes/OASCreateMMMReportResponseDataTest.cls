@isTest
private class OASCreateMMMReportResponseDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateMMMReportResponseData createMMMReportResponseData1 = OASCreateMMMReportResponseData.getExample();
        OASCreateMMMReportResponseData createMMMReportResponseData2 = createMMMReportResponseData1;
        OASCreateMMMReportResponseData createMMMReportResponseData3 = new OASCreateMMMReportResponseData();
        OASCreateMMMReportResponseData createMMMReportResponseData4 = createMMMReportResponseData3;

        System.assert(createMMMReportResponseData1.equals(createMMMReportResponseData2));
        System.assert(createMMMReportResponseData2.equals(createMMMReportResponseData1));
        System.assert(createMMMReportResponseData1.equals(createMMMReportResponseData1));
        System.assert(createMMMReportResponseData3.equals(createMMMReportResponseData4));
        System.assert(createMMMReportResponseData4.equals(createMMMReportResponseData3));
        System.assert(createMMMReportResponseData3.equals(createMMMReportResponseData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateMMMReportResponseData createMMMReportResponseData1 = OASCreateMMMReportResponseData.getExample();
        OASCreateMMMReportResponseData createMMMReportResponseData2 = OASCreateMMMReportResponseData.getExample();
        OASCreateMMMReportResponseData createMMMReportResponseData3 = new OASCreateMMMReportResponseData();
        OASCreateMMMReportResponseData createMMMReportResponseData4 = new OASCreateMMMReportResponseData();

        System.assert(createMMMReportResponseData1.equals(createMMMReportResponseData2));
        System.assert(createMMMReportResponseData2.equals(createMMMReportResponseData1));
        System.assert(createMMMReportResponseData3.equals(createMMMReportResponseData4));
        System.assert(createMMMReportResponseData4.equals(createMMMReportResponseData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateMMMReportResponseData createMMMReportResponseData1 = OASCreateMMMReportResponseData.getExample();
        OASCreateMMMReportResponseData createMMMReportResponseData2 = new OASCreateMMMReportResponseData();

        System.assertEquals(false, createMMMReportResponseData1.equals('foo'));
        System.assertEquals(false, createMMMReportResponseData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateMMMReportResponseData createMMMReportResponseData1 = OASCreateMMMReportResponseData.getExample();
        OASCreateMMMReportResponseData createMMMReportResponseData2 = new OASCreateMMMReportResponseData();
        OASCreateMMMReportResponseData createMMMReportResponseData3;

        System.assertEquals(false, createMMMReportResponseData1.equals(createMMMReportResponseData3));
        System.assertEquals(false, createMMMReportResponseData2.equals(createMMMReportResponseData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateMMMReportResponseData createMMMReportResponseData1 = OASCreateMMMReportResponseData.getExample();
        OASCreateMMMReportResponseData createMMMReportResponseData2 = new OASCreateMMMReportResponseData();

        System.assertEquals(createMMMReportResponseData1.hashCode(), createMMMReportResponseData1.hashCode());
        System.assertEquals(createMMMReportResponseData2.hashCode(), createMMMReportResponseData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateMMMReportResponseData createMMMReportResponseData1 = OASCreateMMMReportResponseData.getExample();
        OASCreateMMMReportResponseData createMMMReportResponseData2 = OASCreateMMMReportResponseData.getExample();
        OASCreateMMMReportResponseData createMMMReportResponseData3 = new OASCreateMMMReportResponseData();
        OASCreateMMMReportResponseData createMMMReportResponseData4 = new OASCreateMMMReportResponseData();

        System.assert(createMMMReportResponseData1.equals(createMMMReportResponseData2));
        System.assert(createMMMReportResponseData3.equals(createMMMReportResponseData4));
        System.assertEquals(createMMMReportResponseData1.hashCode(), createMMMReportResponseData2.hashCode());
        System.assertEquals(createMMMReportResponseData3.hashCode(), createMMMReportResponseData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateMMMReportResponseData createMMMReportResponseData = new OASCreateMMMReportResponseData();
        Map<String, String> x-property-mappings = createMMMReportResponseData.getx-property-mappings();
        System.assertEquals('reportStatus', x-property-mappings.get('report_status'));
    }
}
