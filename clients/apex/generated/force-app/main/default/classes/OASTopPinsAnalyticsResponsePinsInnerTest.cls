@isTest
private class OASTopPinsAnalyticsResponsePinsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner1 = OASTopPinsAnalyticsResponsePinsInner.getExample();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner2 = topPinsAnalyticsResponsePinsInner1;
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner3 = new OASTopPinsAnalyticsResponsePinsInner();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner4 = topPinsAnalyticsResponsePinsInner3;

        System.assert(topPinsAnalyticsResponsePinsInner1.equals(topPinsAnalyticsResponsePinsInner2));
        System.assert(topPinsAnalyticsResponsePinsInner2.equals(topPinsAnalyticsResponsePinsInner1));
        System.assert(topPinsAnalyticsResponsePinsInner1.equals(topPinsAnalyticsResponsePinsInner1));
        System.assert(topPinsAnalyticsResponsePinsInner3.equals(topPinsAnalyticsResponsePinsInner4));
        System.assert(topPinsAnalyticsResponsePinsInner4.equals(topPinsAnalyticsResponsePinsInner3));
        System.assert(topPinsAnalyticsResponsePinsInner3.equals(topPinsAnalyticsResponsePinsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner1 = OASTopPinsAnalyticsResponsePinsInner.getExample();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner2 = OASTopPinsAnalyticsResponsePinsInner.getExample();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner3 = new OASTopPinsAnalyticsResponsePinsInner();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner4 = new OASTopPinsAnalyticsResponsePinsInner();

        System.assert(topPinsAnalyticsResponsePinsInner1.equals(topPinsAnalyticsResponsePinsInner2));
        System.assert(topPinsAnalyticsResponsePinsInner2.equals(topPinsAnalyticsResponsePinsInner1));
        System.assert(topPinsAnalyticsResponsePinsInner3.equals(topPinsAnalyticsResponsePinsInner4));
        System.assert(topPinsAnalyticsResponsePinsInner4.equals(topPinsAnalyticsResponsePinsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner1 = OASTopPinsAnalyticsResponsePinsInner.getExample();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner2 = new OASTopPinsAnalyticsResponsePinsInner();

        System.assertEquals(false, topPinsAnalyticsResponsePinsInner1.equals('foo'));
        System.assertEquals(false, topPinsAnalyticsResponsePinsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner1 = OASTopPinsAnalyticsResponsePinsInner.getExample();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner2 = new OASTopPinsAnalyticsResponsePinsInner();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner3;

        System.assertEquals(false, topPinsAnalyticsResponsePinsInner1.equals(topPinsAnalyticsResponsePinsInner3));
        System.assertEquals(false, topPinsAnalyticsResponsePinsInner2.equals(topPinsAnalyticsResponsePinsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner1 = OASTopPinsAnalyticsResponsePinsInner.getExample();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner2 = new OASTopPinsAnalyticsResponsePinsInner();

        System.assertEquals(topPinsAnalyticsResponsePinsInner1.hashCode(), topPinsAnalyticsResponsePinsInner1.hashCode());
        System.assertEquals(topPinsAnalyticsResponsePinsInner2.hashCode(), topPinsAnalyticsResponsePinsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner1 = OASTopPinsAnalyticsResponsePinsInner.getExample();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner2 = OASTopPinsAnalyticsResponsePinsInner.getExample();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner3 = new OASTopPinsAnalyticsResponsePinsInner();
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner4 = new OASTopPinsAnalyticsResponsePinsInner();

        System.assert(topPinsAnalyticsResponsePinsInner1.equals(topPinsAnalyticsResponsePinsInner2));
        System.assert(topPinsAnalyticsResponsePinsInner3.equals(topPinsAnalyticsResponsePinsInner4));
        System.assertEquals(topPinsAnalyticsResponsePinsInner1.hashCode(), topPinsAnalyticsResponsePinsInner2.hashCode());
        System.assertEquals(topPinsAnalyticsResponsePinsInner3.hashCode(), topPinsAnalyticsResponsePinsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner = new OASTopPinsAnalyticsResponsePinsInner();
        Map<String, String> x-property-mappings = topPinsAnalyticsResponsePinsInner.getx-property-mappings();
        System.assertEquals('dataStatus', x-property-mappings.get('data_status'));
        System.assertEquals('pinId', x-property-mappings.get('pin_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner = new OASTopPinsAnalyticsResponsePinsInner();
        System.assertEquals(new Map<String, Double>(), topPinsAnalyticsResponsePinsInner.metrics);
        System.assertEquals(new Map<String, OASDataStatus>(), topPinsAnalyticsResponsePinsInner.dataStatus);
        System.assertEquals(null, topPinsAnalyticsResponsePinsInner.pinId);
    }
}
