@isTest
private class OASGetMMMReportResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetMMMReportResponse getMMMReportResponse1 = OASGetMMMReportResponse.getExample();
        OASGetMMMReportResponse getMMMReportResponse2 = getMMMReportResponse1;
        OASGetMMMReportResponse getMMMReportResponse3 = new OASGetMMMReportResponse();
        OASGetMMMReportResponse getMMMReportResponse4 = getMMMReportResponse3;

        System.assert(getMMMReportResponse1.equals(getMMMReportResponse2));
        System.assert(getMMMReportResponse2.equals(getMMMReportResponse1));
        System.assert(getMMMReportResponse1.equals(getMMMReportResponse1));
        System.assert(getMMMReportResponse3.equals(getMMMReportResponse4));
        System.assert(getMMMReportResponse4.equals(getMMMReportResponse3));
        System.assert(getMMMReportResponse3.equals(getMMMReportResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetMMMReportResponse getMMMReportResponse1 = OASGetMMMReportResponse.getExample();
        OASGetMMMReportResponse getMMMReportResponse2 = OASGetMMMReportResponse.getExample();
        OASGetMMMReportResponse getMMMReportResponse3 = new OASGetMMMReportResponse();
        OASGetMMMReportResponse getMMMReportResponse4 = new OASGetMMMReportResponse();

        System.assert(getMMMReportResponse1.equals(getMMMReportResponse2));
        System.assert(getMMMReportResponse2.equals(getMMMReportResponse1));
        System.assert(getMMMReportResponse3.equals(getMMMReportResponse4));
        System.assert(getMMMReportResponse4.equals(getMMMReportResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetMMMReportResponse getMMMReportResponse1 = OASGetMMMReportResponse.getExample();
        OASGetMMMReportResponse getMMMReportResponse2 = new OASGetMMMReportResponse();

        System.assertEquals(false, getMMMReportResponse1.equals('foo'));
        System.assertEquals(false, getMMMReportResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetMMMReportResponse getMMMReportResponse1 = OASGetMMMReportResponse.getExample();
        OASGetMMMReportResponse getMMMReportResponse2 = new OASGetMMMReportResponse();
        OASGetMMMReportResponse getMMMReportResponse3;

        System.assertEquals(false, getMMMReportResponse1.equals(getMMMReportResponse3));
        System.assertEquals(false, getMMMReportResponse2.equals(getMMMReportResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetMMMReportResponse getMMMReportResponse1 = OASGetMMMReportResponse.getExample();
        OASGetMMMReportResponse getMMMReportResponse2 = new OASGetMMMReportResponse();

        System.assertEquals(getMMMReportResponse1.hashCode(), getMMMReportResponse1.hashCode());
        System.assertEquals(getMMMReportResponse2.hashCode(), getMMMReportResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetMMMReportResponse getMMMReportResponse1 = OASGetMMMReportResponse.getExample();
        OASGetMMMReportResponse getMMMReportResponse2 = OASGetMMMReportResponse.getExample();
        OASGetMMMReportResponse getMMMReportResponse3 = new OASGetMMMReportResponse();
        OASGetMMMReportResponse getMMMReportResponse4 = new OASGetMMMReportResponse();

        System.assert(getMMMReportResponse1.equals(getMMMReportResponse2));
        System.assert(getMMMReportResponse3.equals(getMMMReportResponse4));
        System.assertEquals(getMMMReportResponse1.hashCode(), getMMMReportResponse2.hashCode());
        System.assertEquals(getMMMReportResponse3.hashCode(), getMMMReportResponse4.hashCode());
    }
}
