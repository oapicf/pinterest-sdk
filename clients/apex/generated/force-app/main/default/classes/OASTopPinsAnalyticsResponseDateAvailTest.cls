@isTest
private class OASTopPinsAnalyticsResponseDateAvailTest {
    @isTest
    private static void equalsSameInstance() {
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability1 = OASTopPinsAnalyticsResponseDateAvail.getExample();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability2 = topPinsAnalyticsResponseDateAvailability1;
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability3 = new OASTopPinsAnalyticsResponseDateAvail();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability4 = topPinsAnalyticsResponseDateAvailability3;

        System.assert(topPinsAnalyticsResponseDateAvailability1.equals(topPinsAnalyticsResponseDateAvailability2));
        System.assert(topPinsAnalyticsResponseDateAvailability2.equals(topPinsAnalyticsResponseDateAvailability1));
        System.assert(topPinsAnalyticsResponseDateAvailability1.equals(topPinsAnalyticsResponseDateAvailability1));
        System.assert(topPinsAnalyticsResponseDateAvailability3.equals(topPinsAnalyticsResponseDateAvailability4));
        System.assert(topPinsAnalyticsResponseDateAvailability4.equals(topPinsAnalyticsResponseDateAvailability3));
        System.assert(topPinsAnalyticsResponseDateAvailability3.equals(topPinsAnalyticsResponseDateAvailability3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability1 = OASTopPinsAnalyticsResponseDateAvail.getExample();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability2 = OASTopPinsAnalyticsResponseDateAvail.getExample();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability3 = new OASTopPinsAnalyticsResponseDateAvail();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability4 = new OASTopPinsAnalyticsResponseDateAvail();

        System.assert(topPinsAnalyticsResponseDateAvailability1.equals(topPinsAnalyticsResponseDateAvailability2));
        System.assert(topPinsAnalyticsResponseDateAvailability2.equals(topPinsAnalyticsResponseDateAvailability1));
        System.assert(topPinsAnalyticsResponseDateAvailability3.equals(topPinsAnalyticsResponseDateAvailability4));
        System.assert(topPinsAnalyticsResponseDateAvailability4.equals(topPinsAnalyticsResponseDateAvailability3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability1 = OASTopPinsAnalyticsResponseDateAvail.getExample();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability2 = new OASTopPinsAnalyticsResponseDateAvail();

        System.assertEquals(false, topPinsAnalyticsResponseDateAvailability1.equals('foo'));
        System.assertEquals(false, topPinsAnalyticsResponseDateAvailability2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability1 = OASTopPinsAnalyticsResponseDateAvail.getExample();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability2 = new OASTopPinsAnalyticsResponseDateAvail();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability3;

        System.assertEquals(false, topPinsAnalyticsResponseDateAvailability1.equals(topPinsAnalyticsResponseDateAvailability3));
        System.assertEquals(false, topPinsAnalyticsResponseDateAvailability2.equals(topPinsAnalyticsResponseDateAvailability3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability1 = OASTopPinsAnalyticsResponseDateAvail.getExample();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability2 = new OASTopPinsAnalyticsResponseDateAvail();

        System.assertEquals(topPinsAnalyticsResponseDateAvailability1.hashCode(), topPinsAnalyticsResponseDateAvailability1.hashCode());
        System.assertEquals(topPinsAnalyticsResponseDateAvailability2.hashCode(), topPinsAnalyticsResponseDateAvailability2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability1 = OASTopPinsAnalyticsResponseDateAvail.getExample();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability2 = OASTopPinsAnalyticsResponseDateAvail.getExample();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability3 = new OASTopPinsAnalyticsResponseDateAvail();
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability4 = new OASTopPinsAnalyticsResponseDateAvail();

        System.assert(topPinsAnalyticsResponseDateAvailability1.equals(topPinsAnalyticsResponseDateAvailability2));
        System.assert(topPinsAnalyticsResponseDateAvailability3.equals(topPinsAnalyticsResponseDateAvailability4));
        System.assertEquals(topPinsAnalyticsResponseDateAvailability1.hashCode(), topPinsAnalyticsResponseDateAvailability2.hashCode());
        System.assertEquals(topPinsAnalyticsResponseDateAvailability3.hashCode(), topPinsAnalyticsResponseDateAvailability4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTopPinsAnalyticsResponseDateAvail topPinsAnalyticsResponseDateAvailability = new OASTopPinsAnalyticsResponseDateAvail();
        Map<String, String> x-property-mappings = topPinsAnalyticsResponseDateAvailability.getx-property-mappings();
        System.assertEquals('latestAvailableTimestamp', x-property-mappings.get('latest_available_timestamp'));
        System.assertEquals('isRealtime', x-property-mappings.get('is_realtime'));
    }
}
