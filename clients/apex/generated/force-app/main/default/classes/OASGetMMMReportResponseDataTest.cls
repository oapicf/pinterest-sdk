@isTest
private class OASGetMMMReportResponseDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetMMMReportResponseData getMMMReportResponseData1 = OASGetMMMReportResponseData.getExample();
        OASGetMMMReportResponseData getMMMReportResponseData2 = getMMMReportResponseData1;
        OASGetMMMReportResponseData getMMMReportResponseData3 = new OASGetMMMReportResponseData();
        OASGetMMMReportResponseData getMMMReportResponseData4 = getMMMReportResponseData3;

        System.assert(getMMMReportResponseData1.equals(getMMMReportResponseData2));
        System.assert(getMMMReportResponseData2.equals(getMMMReportResponseData1));
        System.assert(getMMMReportResponseData1.equals(getMMMReportResponseData1));
        System.assert(getMMMReportResponseData3.equals(getMMMReportResponseData4));
        System.assert(getMMMReportResponseData4.equals(getMMMReportResponseData3));
        System.assert(getMMMReportResponseData3.equals(getMMMReportResponseData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetMMMReportResponseData getMMMReportResponseData1 = OASGetMMMReportResponseData.getExample();
        OASGetMMMReportResponseData getMMMReportResponseData2 = OASGetMMMReportResponseData.getExample();
        OASGetMMMReportResponseData getMMMReportResponseData3 = new OASGetMMMReportResponseData();
        OASGetMMMReportResponseData getMMMReportResponseData4 = new OASGetMMMReportResponseData();

        System.assert(getMMMReportResponseData1.equals(getMMMReportResponseData2));
        System.assert(getMMMReportResponseData2.equals(getMMMReportResponseData1));
        System.assert(getMMMReportResponseData3.equals(getMMMReportResponseData4));
        System.assert(getMMMReportResponseData4.equals(getMMMReportResponseData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetMMMReportResponseData getMMMReportResponseData1 = OASGetMMMReportResponseData.getExample();
        OASGetMMMReportResponseData getMMMReportResponseData2 = new OASGetMMMReportResponseData();

        System.assertEquals(false, getMMMReportResponseData1.equals('foo'));
        System.assertEquals(false, getMMMReportResponseData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetMMMReportResponseData getMMMReportResponseData1 = OASGetMMMReportResponseData.getExample();
        OASGetMMMReportResponseData getMMMReportResponseData2 = new OASGetMMMReportResponseData();
        OASGetMMMReportResponseData getMMMReportResponseData3;

        System.assertEquals(false, getMMMReportResponseData1.equals(getMMMReportResponseData3));
        System.assertEquals(false, getMMMReportResponseData2.equals(getMMMReportResponseData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetMMMReportResponseData getMMMReportResponseData1 = OASGetMMMReportResponseData.getExample();
        OASGetMMMReportResponseData getMMMReportResponseData2 = new OASGetMMMReportResponseData();

        System.assertEquals(getMMMReportResponseData1.hashCode(), getMMMReportResponseData1.hashCode());
        System.assertEquals(getMMMReportResponseData2.hashCode(), getMMMReportResponseData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetMMMReportResponseData getMMMReportResponseData1 = OASGetMMMReportResponseData.getExample();
        OASGetMMMReportResponseData getMMMReportResponseData2 = OASGetMMMReportResponseData.getExample();
        OASGetMMMReportResponseData getMMMReportResponseData3 = new OASGetMMMReportResponseData();
        OASGetMMMReportResponseData getMMMReportResponseData4 = new OASGetMMMReportResponseData();

        System.assert(getMMMReportResponseData1.equals(getMMMReportResponseData2));
        System.assert(getMMMReportResponseData3.equals(getMMMReportResponseData4));
        System.assertEquals(getMMMReportResponseData1.hashCode(), getMMMReportResponseData2.hashCode());
        System.assertEquals(getMMMReportResponseData3.hashCode(), getMMMReportResponseData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGetMMMReportResponseData getMMMReportResponseData = new OASGetMMMReportResponseData();
        Map<String, String> x-property-mappings = getMMMReportResponseData.getx-property-mappings();
        System.assertEquals('reportStatus', x-property-mappings.get('report_status'));
    }
}
