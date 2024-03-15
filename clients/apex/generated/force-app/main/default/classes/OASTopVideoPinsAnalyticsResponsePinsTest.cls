@isTest
private class OASTopVideoPinsAnalyticsResponsePinsTest {
    @isTest
    private static void equalsSameInstance() {
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner1 = OASTopVideoPinsAnalyticsResponsePins.getExample();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner2 = topVideoPinsAnalyticsResponsePinsInner1;
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner3 = new OASTopVideoPinsAnalyticsResponsePins();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner4 = topVideoPinsAnalyticsResponsePinsInner3;

        System.assert(topVideoPinsAnalyticsResponsePinsInner1.equals(topVideoPinsAnalyticsResponsePinsInner2));
        System.assert(topVideoPinsAnalyticsResponsePinsInner2.equals(topVideoPinsAnalyticsResponsePinsInner1));
        System.assert(topVideoPinsAnalyticsResponsePinsInner1.equals(topVideoPinsAnalyticsResponsePinsInner1));
        System.assert(topVideoPinsAnalyticsResponsePinsInner3.equals(topVideoPinsAnalyticsResponsePinsInner4));
        System.assert(topVideoPinsAnalyticsResponsePinsInner4.equals(topVideoPinsAnalyticsResponsePinsInner3));
        System.assert(topVideoPinsAnalyticsResponsePinsInner3.equals(topVideoPinsAnalyticsResponsePinsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner1 = OASTopVideoPinsAnalyticsResponsePins.getExample();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner2 = OASTopVideoPinsAnalyticsResponsePins.getExample();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner3 = new OASTopVideoPinsAnalyticsResponsePins();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner4 = new OASTopVideoPinsAnalyticsResponsePins();

        System.assert(topVideoPinsAnalyticsResponsePinsInner1.equals(topVideoPinsAnalyticsResponsePinsInner2));
        System.assert(topVideoPinsAnalyticsResponsePinsInner2.equals(topVideoPinsAnalyticsResponsePinsInner1));
        System.assert(topVideoPinsAnalyticsResponsePinsInner3.equals(topVideoPinsAnalyticsResponsePinsInner4));
        System.assert(topVideoPinsAnalyticsResponsePinsInner4.equals(topVideoPinsAnalyticsResponsePinsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner1 = OASTopVideoPinsAnalyticsResponsePins.getExample();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner2 = new OASTopVideoPinsAnalyticsResponsePins();

        System.assertEquals(false, topVideoPinsAnalyticsResponsePinsInner1.equals('foo'));
        System.assertEquals(false, topVideoPinsAnalyticsResponsePinsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner1 = OASTopVideoPinsAnalyticsResponsePins.getExample();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner2 = new OASTopVideoPinsAnalyticsResponsePins();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner3;

        System.assertEquals(false, topVideoPinsAnalyticsResponsePinsInner1.equals(topVideoPinsAnalyticsResponsePinsInner3));
        System.assertEquals(false, topVideoPinsAnalyticsResponsePinsInner2.equals(topVideoPinsAnalyticsResponsePinsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner1 = OASTopVideoPinsAnalyticsResponsePins.getExample();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner2 = new OASTopVideoPinsAnalyticsResponsePins();

        System.assertEquals(topVideoPinsAnalyticsResponsePinsInner1.hashCode(), topVideoPinsAnalyticsResponsePinsInner1.hashCode());
        System.assertEquals(topVideoPinsAnalyticsResponsePinsInner2.hashCode(), topVideoPinsAnalyticsResponsePinsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner1 = OASTopVideoPinsAnalyticsResponsePins.getExample();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner2 = OASTopVideoPinsAnalyticsResponsePins.getExample();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner3 = new OASTopVideoPinsAnalyticsResponsePins();
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner4 = new OASTopVideoPinsAnalyticsResponsePins();

        System.assert(topVideoPinsAnalyticsResponsePinsInner1.equals(topVideoPinsAnalyticsResponsePinsInner2));
        System.assert(topVideoPinsAnalyticsResponsePinsInner3.equals(topVideoPinsAnalyticsResponsePinsInner4));
        System.assertEquals(topVideoPinsAnalyticsResponsePinsInner1.hashCode(), topVideoPinsAnalyticsResponsePinsInner2.hashCode());
        System.assertEquals(topVideoPinsAnalyticsResponsePinsInner3.hashCode(), topVideoPinsAnalyticsResponsePinsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner = new OASTopVideoPinsAnalyticsResponsePins();
        Map<String, String> x-property-mappings = topVideoPinsAnalyticsResponsePinsInner.getx-property-mappings();
        System.assertEquals('dataStatus', x-property-mappings.get('data_status'));
        System.assertEquals('pinId', x-property-mappings.get('pin_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTopVideoPinsAnalyticsResponsePins topVideoPinsAnalyticsResponsePinsInner = new OASTopVideoPinsAnalyticsResponsePins();
        System.assertEquals(new Map<String, Double>(), topVideoPinsAnalyticsResponsePinsInner.metrics);
        System.assertEquals(new Map<String, OASDataStatus>(), topVideoPinsAnalyticsResponsePinsInner.dataStatus);
        System.assertEquals(null, topVideoPinsAnalyticsResponsePinsInner.pinId);
    }
}
