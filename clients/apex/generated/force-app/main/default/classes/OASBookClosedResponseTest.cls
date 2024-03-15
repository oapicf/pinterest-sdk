@isTest
private class OASBookClosedResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBookClosedResponse bookClosedResponse1 = OASBookClosedResponse.getExample();
        OASBookClosedResponse bookClosedResponse2 = bookClosedResponse1;
        OASBookClosedResponse bookClosedResponse3 = new OASBookClosedResponse();
        OASBookClosedResponse bookClosedResponse4 = bookClosedResponse3;

        System.assert(bookClosedResponse1.equals(bookClosedResponse2));
        System.assert(bookClosedResponse2.equals(bookClosedResponse1));
        System.assert(bookClosedResponse1.equals(bookClosedResponse1));
        System.assert(bookClosedResponse3.equals(bookClosedResponse4));
        System.assert(bookClosedResponse4.equals(bookClosedResponse3));
        System.assert(bookClosedResponse3.equals(bookClosedResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBookClosedResponse bookClosedResponse1 = OASBookClosedResponse.getExample();
        OASBookClosedResponse bookClosedResponse2 = OASBookClosedResponse.getExample();
        OASBookClosedResponse bookClosedResponse3 = new OASBookClosedResponse();
        OASBookClosedResponse bookClosedResponse4 = new OASBookClosedResponse();

        System.assert(bookClosedResponse1.equals(bookClosedResponse2));
        System.assert(bookClosedResponse2.equals(bookClosedResponse1));
        System.assert(bookClosedResponse3.equals(bookClosedResponse4));
        System.assert(bookClosedResponse4.equals(bookClosedResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBookClosedResponse bookClosedResponse1 = OASBookClosedResponse.getExample();
        OASBookClosedResponse bookClosedResponse2 = new OASBookClosedResponse();

        System.assertEquals(false, bookClosedResponse1.equals('foo'));
        System.assertEquals(false, bookClosedResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBookClosedResponse bookClosedResponse1 = OASBookClosedResponse.getExample();
        OASBookClosedResponse bookClosedResponse2 = new OASBookClosedResponse();
        OASBookClosedResponse bookClosedResponse3;

        System.assertEquals(false, bookClosedResponse1.equals(bookClosedResponse3));
        System.assertEquals(false, bookClosedResponse2.equals(bookClosedResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBookClosedResponse bookClosedResponse1 = OASBookClosedResponse.getExample();
        OASBookClosedResponse bookClosedResponse2 = new OASBookClosedResponse();

        System.assertEquals(bookClosedResponse1.hashCode(), bookClosedResponse1.hashCode());
        System.assertEquals(bookClosedResponse2.hashCode(), bookClosedResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBookClosedResponse bookClosedResponse1 = OASBookClosedResponse.getExample();
        OASBookClosedResponse bookClosedResponse2 = OASBookClosedResponse.getExample();
        OASBookClosedResponse bookClosedResponse3 = new OASBookClosedResponse();
        OASBookClosedResponse bookClosedResponse4 = new OASBookClosedResponse();

        System.assert(bookClosedResponse1.equals(bookClosedResponse2));
        System.assert(bookClosedResponse3.equals(bookClosedResponse4));
        System.assertEquals(bookClosedResponse1.hashCode(), bookClosedResponse2.hashCode());
        System.assertEquals(bookClosedResponse3.hashCode(), bookClosedResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBookClosedResponse bookClosedResponse = new OASBookClosedResponse();
        Map<String, String> x-property-mappings = bookClosedResponse.getx-property-mappings();
        System.assertEquals('conversionMetricsReady', x-property-mappings.get('conversion_metrics_ready'));
        System.assertEquals('nonConversionMetricsReady', x-property-mappings.get('non_conversion_metrics_ready'));
    }
}
