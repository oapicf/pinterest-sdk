@isTest
private class OASReportsStats200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASReportsStats200Response reportsStats200Response1 = OASReportsStats200Response.getExample();
        OASReportsStats200Response reportsStats200Response2 = reportsStats200Response1;
        OASReportsStats200Response reportsStats200Response3 = new OASReportsStats200Response();
        OASReportsStats200Response reportsStats200Response4 = reportsStats200Response3;

        System.assert(reportsStats200Response1.equals(reportsStats200Response2));
        System.assert(reportsStats200Response2.equals(reportsStats200Response1));
        System.assert(reportsStats200Response1.equals(reportsStats200Response1));
        System.assert(reportsStats200Response3.equals(reportsStats200Response4));
        System.assert(reportsStats200Response4.equals(reportsStats200Response3));
        System.assert(reportsStats200Response3.equals(reportsStats200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASReportsStats200Response reportsStats200Response1 = OASReportsStats200Response.getExample();
        OASReportsStats200Response reportsStats200Response2 = OASReportsStats200Response.getExample();
        OASReportsStats200Response reportsStats200Response3 = new OASReportsStats200Response();
        OASReportsStats200Response reportsStats200Response4 = new OASReportsStats200Response();

        System.assert(reportsStats200Response1.equals(reportsStats200Response2));
        System.assert(reportsStats200Response2.equals(reportsStats200Response1));
        System.assert(reportsStats200Response3.equals(reportsStats200Response4));
        System.assert(reportsStats200Response4.equals(reportsStats200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASReportsStats200Response reportsStats200Response1 = OASReportsStats200Response.getExample();
        OASReportsStats200Response reportsStats200Response2 = new OASReportsStats200Response();

        System.assertEquals(false, reportsStats200Response1.equals('foo'));
        System.assertEquals(false, reportsStats200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASReportsStats200Response reportsStats200Response1 = OASReportsStats200Response.getExample();
        OASReportsStats200Response reportsStats200Response2 = new OASReportsStats200Response();
        OASReportsStats200Response reportsStats200Response3;

        System.assertEquals(false, reportsStats200Response1.equals(reportsStats200Response3));
        System.assertEquals(false, reportsStats200Response2.equals(reportsStats200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASReportsStats200Response reportsStats200Response1 = OASReportsStats200Response.getExample();
        OASReportsStats200Response reportsStats200Response2 = new OASReportsStats200Response();

        System.assertEquals(reportsStats200Response1.hashCode(), reportsStats200Response1.hashCode());
        System.assertEquals(reportsStats200Response2.hashCode(), reportsStats200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASReportsStats200Response reportsStats200Response1 = OASReportsStats200Response.getExample();
        OASReportsStats200Response reportsStats200Response2 = OASReportsStats200Response.getExample();
        OASReportsStats200Response reportsStats200Response3 = new OASReportsStats200Response();
        OASReportsStats200Response reportsStats200Response4 = new OASReportsStats200Response();

        System.assert(reportsStats200Response1.equals(reportsStats200Response2));
        System.assert(reportsStats200Response3.equals(reportsStats200Response4));
        System.assertEquals(reportsStats200Response1.hashCode(), reportsStats200Response2.hashCode());
        System.assertEquals(reportsStats200Response3.hashCode(), reportsStats200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASReportsStats200Response reportsStats200Response = new OASReportsStats200Response();
        System.assertEquals(new List<OASCatalogsReportStats>(), reportsStats200Response.items);
        System.assertEquals(null, reportsStats200Response.bookmark);
    }
}
