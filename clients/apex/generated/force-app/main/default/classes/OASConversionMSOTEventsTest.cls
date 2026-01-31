@isTest
private class OASConversionMSOTEventsTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionMSOTEvents conversionMSOTEvents1 = OASConversionMSOTEvents.getExample();
        OASConversionMSOTEvents conversionMSOTEvents2 = conversionMSOTEvents1;
        OASConversionMSOTEvents conversionMSOTEvents3 = new OASConversionMSOTEvents();
        OASConversionMSOTEvents conversionMSOTEvents4 = conversionMSOTEvents3;

        System.assert(conversionMSOTEvents1.equals(conversionMSOTEvents2));
        System.assert(conversionMSOTEvents2.equals(conversionMSOTEvents1));
        System.assert(conversionMSOTEvents1.equals(conversionMSOTEvents1));
        System.assert(conversionMSOTEvents3.equals(conversionMSOTEvents4));
        System.assert(conversionMSOTEvents4.equals(conversionMSOTEvents3));
        System.assert(conversionMSOTEvents3.equals(conversionMSOTEvents3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionMSOTEvents conversionMSOTEvents1 = OASConversionMSOTEvents.getExample();
        OASConversionMSOTEvents conversionMSOTEvents2 = OASConversionMSOTEvents.getExample();
        OASConversionMSOTEvents conversionMSOTEvents3 = new OASConversionMSOTEvents();
        OASConversionMSOTEvents conversionMSOTEvents4 = new OASConversionMSOTEvents();

        System.assert(conversionMSOTEvents1.equals(conversionMSOTEvents2));
        System.assert(conversionMSOTEvents2.equals(conversionMSOTEvents1));
        System.assert(conversionMSOTEvents3.equals(conversionMSOTEvents4));
        System.assert(conversionMSOTEvents4.equals(conversionMSOTEvents3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionMSOTEvents conversionMSOTEvents1 = OASConversionMSOTEvents.getExample();
        OASConversionMSOTEvents conversionMSOTEvents2 = new OASConversionMSOTEvents();

        System.assertEquals(false, conversionMSOTEvents1.equals('foo'));
        System.assertEquals(false, conversionMSOTEvents2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionMSOTEvents conversionMSOTEvents1 = OASConversionMSOTEvents.getExample();
        OASConversionMSOTEvents conversionMSOTEvents2 = new OASConversionMSOTEvents();
        OASConversionMSOTEvents conversionMSOTEvents3;

        System.assertEquals(false, conversionMSOTEvents1.equals(conversionMSOTEvents3));
        System.assertEquals(false, conversionMSOTEvents2.equals(conversionMSOTEvents3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionMSOTEvents conversionMSOTEvents1 = OASConversionMSOTEvents.getExample();
        OASConversionMSOTEvents conversionMSOTEvents2 = new OASConversionMSOTEvents();

        System.assertEquals(conversionMSOTEvents1.hashCode(), conversionMSOTEvents1.hashCode());
        System.assertEquals(conversionMSOTEvents2.hashCode(), conversionMSOTEvents2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionMSOTEvents conversionMSOTEvents1 = OASConversionMSOTEvents.getExample();
        OASConversionMSOTEvents conversionMSOTEvents2 = OASConversionMSOTEvents.getExample();
        OASConversionMSOTEvents conversionMSOTEvents3 = new OASConversionMSOTEvents();
        OASConversionMSOTEvents conversionMSOTEvents4 = new OASConversionMSOTEvents();

        System.assert(conversionMSOTEvents1.equals(conversionMSOTEvents2));
        System.assert(conversionMSOTEvents3.equals(conversionMSOTEvents4));
        System.assertEquals(conversionMSOTEvents1.hashCode(), conversionMSOTEvents2.hashCode());
        System.assertEquals(conversionMSOTEvents3.hashCode(), conversionMSOTEvents4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionMSOTEvents conversionMSOTEvents = new OASConversionMSOTEvents();
        Map<String, String> x-property-mappings = conversionMSOTEvents.getx-property-mappings();
        System.assertEquals('actionTimestamps', x-property-mappings.get('action_timestamps'));
        System.assertEquals('adGroupId', x-property-mappings.get('ad_group_id'));
        System.assertEquals('attributionModel', x-property-mappings.get('attribution_model'));
        System.assertEquals('attributionScope', x-property-mappings.get('attribution_scope'));
        System.assertEquals('attributionScore', x-property-mappings.get('attribution_score'));
        System.assertEquals('campaignId', x-property-mappings.get('campaign_id'));
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
        System.assertEquals('eventName', x-property-mappings.get('event_name'));
        System.assertEquals('eventTimestamp', x-property-mappings.get('event_timestamp'));
        System.assertEquals('totalEventTouchpoints', x-property-mappings.get('total_event_touchpoints'));
        System.assertEquals('totalEvents', x-property-mappings.get('total_events'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionMSOTEvents conversionMSOTEvents = new OASConversionMSOTEvents();
        System.assertEquals(new List<Long>(), conversionMSOTEvents.actionTimestamps);
        System.assertEquals(null, conversionMSOTEvents.adGroupId);
        System.assertEquals(null, conversionMSOTEvents.attributionModel);
        System.assertEquals(null, conversionMSOTEvents.attributionScope);
        System.assertEquals(null, conversionMSOTEvents.attributionScore);
        System.assertEquals(null, conversionMSOTEvents.campaignId);
        System.assertEquals(null, conversionMSOTEvents.r_currency);
        System.assertEquals(null, conversionMSOTEvents.eventId);
        System.assertEquals(null, conversionMSOTEvents.eventName);
        System.assertEquals(null, conversionMSOTEvents.eventTimestamp);
        System.assertEquals(null, conversionMSOTEvents.totalEventTouchpoints);
        System.assertEquals(null, conversionMSOTEvents.totalEvents);
        System.assertEquals(null, conversionMSOTEvents.value);
    }
}
