@isTest
private class OASTimeSeriesTest {
    @isTest
    private static void equalsSameInstance() {
        OASTimeSeries timeSeries1 = OASTimeSeries.getExample();
        OASTimeSeries timeSeries2 = timeSeries1;
        OASTimeSeries timeSeries3 = new OASTimeSeries();
        OASTimeSeries timeSeries4 = timeSeries3;

        System.assert(timeSeries1.equals(timeSeries2));
        System.assert(timeSeries2.equals(timeSeries1));
        System.assert(timeSeries1.equals(timeSeries1));
        System.assert(timeSeries3.equals(timeSeries4));
        System.assert(timeSeries4.equals(timeSeries3));
        System.assert(timeSeries3.equals(timeSeries3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTimeSeries timeSeries1 = OASTimeSeries.getExample();
        OASTimeSeries timeSeries2 = OASTimeSeries.getExample();
        OASTimeSeries timeSeries3 = new OASTimeSeries();
        OASTimeSeries timeSeries4 = new OASTimeSeries();

        System.assert(timeSeries1.equals(timeSeries2));
        System.assert(timeSeries2.equals(timeSeries1));
        System.assert(timeSeries3.equals(timeSeries4));
        System.assert(timeSeries4.equals(timeSeries3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTimeSeries timeSeries1 = OASTimeSeries.getExample();
        OASTimeSeries timeSeries2 = new OASTimeSeries();

        System.assertEquals(false, timeSeries1.equals('foo'));
        System.assertEquals(false, timeSeries2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTimeSeries timeSeries1 = OASTimeSeries.getExample();
        OASTimeSeries timeSeries2 = new OASTimeSeries();
        OASTimeSeries timeSeries3;

        System.assertEquals(false, timeSeries1.equals(timeSeries3));
        System.assertEquals(false, timeSeries2.equals(timeSeries3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTimeSeries timeSeries1 = OASTimeSeries.getExample();
        OASTimeSeries timeSeries2 = new OASTimeSeries();

        System.assertEquals(timeSeries1.hashCode(), timeSeries1.hashCode());
        System.assertEquals(timeSeries2.hashCode(), timeSeries2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTimeSeries timeSeries1 = OASTimeSeries.getExample();
        OASTimeSeries timeSeries2 = OASTimeSeries.getExample();
        OASTimeSeries timeSeries3 = new OASTimeSeries();
        OASTimeSeries timeSeries4 = new OASTimeSeries();

        System.assert(timeSeries1.equals(timeSeries2));
        System.assert(timeSeries3.equals(timeSeries4));
        System.assertEquals(timeSeries1.hashCode(), timeSeries2.hashCode());
        System.assertEquals(timeSeries3.hashCode(), timeSeries4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTimeSeries timeSeries = new OASTimeSeries();
        Map<String, String> x-property-mappings = timeSeries.getx-property-mappings();
        System.assertEquals('r_date', x-property-mappings.get('date'));
    }
}
