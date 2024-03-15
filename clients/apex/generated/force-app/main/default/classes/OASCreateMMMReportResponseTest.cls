@isTest
private class OASCreateMMMReportResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateMMMReportResponse createMMMReportResponse1 = OASCreateMMMReportResponse.getExample();
        OASCreateMMMReportResponse createMMMReportResponse2 = createMMMReportResponse1;
        OASCreateMMMReportResponse createMMMReportResponse3 = new OASCreateMMMReportResponse();
        OASCreateMMMReportResponse createMMMReportResponse4 = createMMMReportResponse3;

        System.assert(createMMMReportResponse1.equals(createMMMReportResponse2));
        System.assert(createMMMReportResponse2.equals(createMMMReportResponse1));
        System.assert(createMMMReportResponse1.equals(createMMMReportResponse1));
        System.assert(createMMMReportResponse3.equals(createMMMReportResponse4));
        System.assert(createMMMReportResponse4.equals(createMMMReportResponse3));
        System.assert(createMMMReportResponse3.equals(createMMMReportResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateMMMReportResponse createMMMReportResponse1 = OASCreateMMMReportResponse.getExample();
        OASCreateMMMReportResponse createMMMReportResponse2 = OASCreateMMMReportResponse.getExample();
        OASCreateMMMReportResponse createMMMReportResponse3 = new OASCreateMMMReportResponse();
        OASCreateMMMReportResponse createMMMReportResponse4 = new OASCreateMMMReportResponse();

        System.assert(createMMMReportResponse1.equals(createMMMReportResponse2));
        System.assert(createMMMReportResponse2.equals(createMMMReportResponse1));
        System.assert(createMMMReportResponse3.equals(createMMMReportResponse4));
        System.assert(createMMMReportResponse4.equals(createMMMReportResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateMMMReportResponse createMMMReportResponse1 = OASCreateMMMReportResponse.getExample();
        OASCreateMMMReportResponse createMMMReportResponse2 = new OASCreateMMMReportResponse();

        System.assertEquals(false, createMMMReportResponse1.equals('foo'));
        System.assertEquals(false, createMMMReportResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateMMMReportResponse createMMMReportResponse1 = OASCreateMMMReportResponse.getExample();
        OASCreateMMMReportResponse createMMMReportResponse2 = new OASCreateMMMReportResponse();
        OASCreateMMMReportResponse createMMMReportResponse3;

        System.assertEquals(false, createMMMReportResponse1.equals(createMMMReportResponse3));
        System.assertEquals(false, createMMMReportResponse2.equals(createMMMReportResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateMMMReportResponse createMMMReportResponse1 = OASCreateMMMReportResponse.getExample();
        OASCreateMMMReportResponse createMMMReportResponse2 = new OASCreateMMMReportResponse();

        System.assertEquals(createMMMReportResponse1.hashCode(), createMMMReportResponse1.hashCode());
        System.assertEquals(createMMMReportResponse2.hashCode(), createMMMReportResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateMMMReportResponse createMMMReportResponse1 = OASCreateMMMReportResponse.getExample();
        OASCreateMMMReportResponse createMMMReportResponse2 = OASCreateMMMReportResponse.getExample();
        OASCreateMMMReportResponse createMMMReportResponse3 = new OASCreateMMMReportResponse();
        OASCreateMMMReportResponse createMMMReportResponse4 = new OASCreateMMMReportResponse();

        System.assert(createMMMReportResponse1.equals(createMMMReportResponse2));
        System.assert(createMMMReportResponse3.equals(createMMMReportResponse4));
        System.assertEquals(createMMMReportResponse1.hashCode(), createMMMReportResponse2.hashCode());
        System.assertEquals(createMMMReportResponse3.hashCode(), createMMMReportResponse4.hashCode());
    }
}
