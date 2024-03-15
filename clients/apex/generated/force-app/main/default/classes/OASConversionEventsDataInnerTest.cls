@isTest
private class OASConversionEventsDataInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionEventsDataInner conversionEventsDataInner1 = OASConversionEventsDataInner.getExample();
        OASConversionEventsDataInner conversionEventsDataInner2 = conversionEventsDataInner1;
        OASConversionEventsDataInner conversionEventsDataInner3 = new OASConversionEventsDataInner();
        OASConversionEventsDataInner conversionEventsDataInner4 = conversionEventsDataInner3;

        System.assert(conversionEventsDataInner1.equals(conversionEventsDataInner2));
        System.assert(conversionEventsDataInner2.equals(conversionEventsDataInner1));
        System.assert(conversionEventsDataInner1.equals(conversionEventsDataInner1));
        System.assert(conversionEventsDataInner3.equals(conversionEventsDataInner4));
        System.assert(conversionEventsDataInner4.equals(conversionEventsDataInner3));
        System.assert(conversionEventsDataInner3.equals(conversionEventsDataInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionEventsDataInner conversionEventsDataInner1 = OASConversionEventsDataInner.getExample();
        OASConversionEventsDataInner conversionEventsDataInner2 = OASConversionEventsDataInner.getExample();
        OASConversionEventsDataInner conversionEventsDataInner3 = new OASConversionEventsDataInner();
        OASConversionEventsDataInner conversionEventsDataInner4 = new OASConversionEventsDataInner();

        System.assert(conversionEventsDataInner1.equals(conversionEventsDataInner2));
        System.assert(conversionEventsDataInner2.equals(conversionEventsDataInner1));
        System.assert(conversionEventsDataInner3.equals(conversionEventsDataInner4));
        System.assert(conversionEventsDataInner4.equals(conversionEventsDataInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionEventsDataInner conversionEventsDataInner1 = OASConversionEventsDataInner.getExample();
        OASConversionEventsDataInner conversionEventsDataInner2 = new OASConversionEventsDataInner();

        System.assertEquals(false, conversionEventsDataInner1.equals('foo'));
        System.assertEquals(false, conversionEventsDataInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionEventsDataInner conversionEventsDataInner1 = OASConversionEventsDataInner.getExample();
        OASConversionEventsDataInner conversionEventsDataInner2 = new OASConversionEventsDataInner();
        OASConversionEventsDataInner conversionEventsDataInner3;

        System.assertEquals(false, conversionEventsDataInner1.equals(conversionEventsDataInner3));
        System.assertEquals(false, conversionEventsDataInner2.equals(conversionEventsDataInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionEventsDataInner conversionEventsDataInner1 = OASConversionEventsDataInner.getExample();
        OASConversionEventsDataInner conversionEventsDataInner2 = new OASConversionEventsDataInner();

        System.assertEquals(conversionEventsDataInner1.hashCode(), conversionEventsDataInner1.hashCode());
        System.assertEquals(conversionEventsDataInner2.hashCode(), conversionEventsDataInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionEventsDataInner conversionEventsDataInner1 = OASConversionEventsDataInner.getExample();
        OASConversionEventsDataInner conversionEventsDataInner2 = OASConversionEventsDataInner.getExample();
        OASConversionEventsDataInner conversionEventsDataInner3 = new OASConversionEventsDataInner();
        OASConversionEventsDataInner conversionEventsDataInner4 = new OASConversionEventsDataInner();

        System.assert(conversionEventsDataInner1.equals(conversionEventsDataInner2));
        System.assert(conversionEventsDataInner3.equals(conversionEventsDataInner4));
        System.assertEquals(conversionEventsDataInner1.hashCode(), conversionEventsDataInner2.hashCode());
        System.assertEquals(conversionEventsDataInner3.hashCode(), conversionEventsDataInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionEventsDataInner conversionEventsDataInner = new OASConversionEventsDataInner();
        Map<String, String> x-property-mappings = conversionEventsDataInner.getx-property-mappings();
        System.assertEquals('eventName', x-property-mappings.get('event_name'));
        System.assertEquals('actionSource', x-property-mappings.get('action_source'));
        System.assertEquals('eventTime', x-property-mappings.get('event_time'));
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
        System.assertEquals('eventSourceUrl', x-property-mappings.get('event_source_url'));
        System.assertEquals('optOut', x-property-mappings.get('opt_out'));
        System.assertEquals('partnerName', x-property-mappings.get('partner_name'));
        System.assertEquals('userData', x-property-mappings.get('user_data'));
        System.assertEquals('customData', x-property-mappings.get('custom_data'));
        System.assertEquals('appId', x-property-mappings.get('app_id'));
        System.assertEquals('appName', x-property-mappings.get('app_name'));
        System.assertEquals('appVersion', x-property-mappings.get('app_version'));
        System.assertEquals('deviceBrand', x-property-mappings.get('device_brand'));
        System.assertEquals('deviceCarrier', x-property-mappings.get('device_carrier'));
        System.assertEquals('deviceModel', x-property-mappings.get('device_model'));
        System.assertEquals('deviceType', x-property-mappings.get('device_type'));
        System.assertEquals('osVersion', x-property-mappings.get('os_version'));
    }
}
