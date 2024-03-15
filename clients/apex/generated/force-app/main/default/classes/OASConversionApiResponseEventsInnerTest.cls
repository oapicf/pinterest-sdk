@isTest
private class OASConversionApiResponseEventsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner1 = OASConversionApiResponseEventsInner.getExample();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner2 = conversionApiResponseEventsInner1;
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner3 = new OASConversionApiResponseEventsInner();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner4 = conversionApiResponseEventsInner3;

        System.assert(conversionApiResponseEventsInner1.equals(conversionApiResponseEventsInner2));
        System.assert(conversionApiResponseEventsInner2.equals(conversionApiResponseEventsInner1));
        System.assert(conversionApiResponseEventsInner1.equals(conversionApiResponseEventsInner1));
        System.assert(conversionApiResponseEventsInner3.equals(conversionApiResponseEventsInner4));
        System.assert(conversionApiResponseEventsInner4.equals(conversionApiResponseEventsInner3));
        System.assert(conversionApiResponseEventsInner3.equals(conversionApiResponseEventsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner1 = OASConversionApiResponseEventsInner.getExample();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner2 = OASConversionApiResponseEventsInner.getExample();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner3 = new OASConversionApiResponseEventsInner();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner4 = new OASConversionApiResponseEventsInner();

        System.assert(conversionApiResponseEventsInner1.equals(conversionApiResponseEventsInner2));
        System.assert(conversionApiResponseEventsInner2.equals(conversionApiResponseEventsInner1));
        System.assert(conversionApiResponseEventsInner3.equals(conversionApiResponseEventsInner4));
        System.assert(conversionApiResponseEventsInner4.equals(conversionApiResponseEventsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner1 = OASConversionApiResponseEventsInner.getExample();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner2 = new OASConversionApiResponseEventsInner();

        System.assertEquals(false, conversionApiResponseEventsInner1.equals('foo'));
        System.assertEquals(false, conversionApiResponseEventsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner1 = OASConversionApiResponseEventsInner.getExample();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner2 = new OASConversionApiResponseEventsInner();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner3;

        System.assertEquals(false, conversionApiResponseEventsInner1.equals(conversionApiResponseEventsInner3));
        System.assertEquals(false, conversionApiResponseEventsInner2.equals(conversionApiResponseEventsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner1 = OASConversionApiResponseEventsInner.getExample();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner2 = new OASConversionApiResponseEventsInner();

        System.assertEquals(conversionApiResponseEventsInner1.hashCode(), conversionApiResponseEventsInner1.hashCode());
        System.assertEquals(conversionApiResponseEventsInner2.hashCode(), conversionApiResponseEventsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner1 = OASConversionApiResponseEventsInner.getExample();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner2 = OASConversionApiResponseEventsInner.getExample();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner3 = new OASConversionApiResponseEventsInner();
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner4 = new OASConversionApiResponseEventsInner();

        System.assert(conversionApiResponseEventsInner1.equals(conversionApiResponseEventsInner2));
        System.assert(conversionApiResponseEventsInner3.equals(conversionApiResponseEventsInner4));
        System.assertEquals(conversionApiResponseEventsInner1.hashCode(), conversionApiResponseEventsInner2.hashCode());
        System.assertEquals(conversionApiResponseEventsInner3.hashCode(), conversionApiResponseEventsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionApiResponseEventsInner conversionApiResponseEventsInner = new OASConversionApiResponseEventsInner();
        Map<String, String> x-property-mappings = conversionApiResponseEventsInner.getx-property-mappings();
        System.assertEquals('errorMessage', x-property-mappings.get('error_message'));
        System.assertEquals('warningMessage', x-property-mappings.get('warning_message'));
    }
}
