@isTest
private class OASConversionApiResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionApiResponse conversionApiResponse1 = OASConversionApiResponse.getExample();
        OASConversionApiResponse conversionApiResponse2 = conversionApiResponse1;
        OASConversionApiResponse conversionApiResponse3 = new OASConversionApiResponse();
        OASConversionApiResponse conversionApiResponse4 = conversionApiResponse3;

        System.assert(conversionApiResponse1.equals(conversionApiResponse2));
        System.assert(conversionApiResponse2.equals(conversionApiResponse1));
        System.assert(conversionApiResponse1.equals(conversionApiResponse1));
        System.assert(conversionApiResponse3.equals(conversionApiResponse4));
        System.assert(conversionApiResponse4.equals(conversionApiResponse3));
        System.assert(conversionApiResponse3.equals(conversionApiResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionApiResponse conversionApiResponse1 = OASConversionApiResponse.getExample();
        OASConversionApiResponse conversionApiResponse2 = OASConversionApiResponse.getExample();
        OASConversionApiResponse conversionApiResponse3 = new OASConversionApiResponse();
        OASConversionApiResponse conversionApiResponse4 = new OASConversionApiResponse();

        System.assert(conversionApiResponse1.equals(conversionApiResponse2));
        System.assert(conversionApiResponse2.equals(conversionApiResponse1));
        System.assert(conversionApiResponse3.equals(conversionApiResponse4));
        System.assert(conversionApiResponse4.equals(conversionApiResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionApiResponse conversionApiResponse1 = OASConversionApiResponse.getExample();
        OASConversionApiResponse conversionApiResponse2 = new OASConversionApiResponse();

        System.assertEquals(false, conversionApiResponse1.equals('foo'));
        System.assertEquals(false, conversionApiResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionApiResponse conversionApiResponse1 = OASConversionApiResponse.getExample();
        OASConversionApiResponse conversionApiResponse2 = new OASConversionApiResponse();
        OASConversionApiResponse conversionApiResponse3;

        System.assertEquals(false, conversionApiResponse1.equals(conversionApiResponse3));
        System.assertEquals(false, conversionApiResponse2.equals(conversionApiResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionApiResponse conversionApiResponse1 = OASConversionApiResponse.getExample();
        OASConversionApiResponse conversionApiResponse2 = new OASConversionApiResponse();

        System.assertEquals(conversionApiResponse1.hashCode(), conversionApiResponse1.hashCode());
        System.assertEquals(conversionApiResponse2.hashCode(), conversionApiResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionApiResponse conversionApiResponse1 = OASConversionApiResponse.getExample();
        OASConversionApiResponse conversionApiResponse2 = OASConversionApiResponse.getExample();
        OASConversionApiResponse conversionApiResponse3 = new OASConversionApiResponse();
        OASConversionApiResponse conversionApiResponse4 = new OASConversionApiResponse();

        System.assert(conversionApiResponse1.equals(conversionApiResponse2));
        System.assert(conversionApiResponse3.equals(conversionApiResponse4));
        System.assertEquals(conversionApiResponse1.hashCode(), conversionApiResponse2.hashCode());
        System.assertEquals(conversionApiResponse3.hashCode(), conversionApiResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionApiResponse conversionApiResponse = new OASConversionApiResponse();
        Map<String, String> x-property-mappings = conversionApiResponse.getx-property-mappings();
        System.assertEquals('numEventsReceived', x-property-mappings.get('num_events_received'));
        System.assertEquals('numEventsProcessed', x-property-mappings.get('num_events_processed'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionApiResponse conversionApiResponse = new OASConversionApiResponse();
        System.assertEquals(new List<OASConversionApiResponseEventsInner>(), conversionApiResponse.events);
        System.assertEquals(null, conversionApiResponse.numEventsReceived);
        System.assertEquals(null, conversionApiResponse.numEventsProcessed);
    }
}
