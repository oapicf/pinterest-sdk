@isTest
private class OASConversionEventsTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionEvents conversionEvents1 = OASConversionEvents.getExample();
        OASConversionEvents conversionEvents2 = conversionEvents1;
        OASConversionEvents conversionEvents3 = new OASConversionEvents();
        OASConversionEvents conversionEvents4 = conversionEvents3;

        System.assert(conversionEvents1.equals(conversionEvents2));
        System.assert(conversionEvents2.equals(conversionEvents1));
        System.assert(conversionEvents1.equals(conversionEvents1));
        System.assert(conversionEvents3.equals(conversionEvents4));
        System.assert(conversionEvents4.equals(conversionEvents3));
        System.assert(conversionEvents3.equals(conversionEvents3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionEvents conversionEvents1 = OASConversionEvents.getExample();
        OASConversionEvents conversionEvents2 = OASConversionEvents.getExample();
        OASConversionEvents conversionEvents3 = new OASConversionEvents();
        OASConversionEvents conversionEvents4 = new OASConversionEvents();

        System.assert(conversionEvents1.equals(conversionEvents2));
        System.assert(conversionEvents2.equals(conversionEvents1));
        System.assert(conversionEvents3.equals(conversionEvents4));
        System.assert(conversionEvents4.equals(conversionEvents3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionEvents conversionEvents1 = OASConversionEvents.getExample();
        OASConversionEvents conversionEvents2 = new OASConversionEvents();

        System.assertEquals(false, conversionEvents1.equals('foo'));
        System.assertEquals(false, conversionEvents2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionEvents conversionEvents1 = OASConversionEvents.getExample();
        OASConversionEvents conversionEvents2 = new OASConversionEvents();
        OASConversionEvents conversionEvents3;

        System.assertEquals(false, conversionEvents1.equals(conversionEvents3));
        System.assertEquals(false, conversionEvents2.equals(conversionEvents3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionEvents conversionEvents1 = OASConversionEvents.getExample();
        OASConversionEvents conversionEvents2 = new OASConversionEvents();

        System.assertEquals(conversionEvents1.hashCode(), conversionEvents1.hashCode());
        System.assertEquals(conversionEvents2.hashCode(), conversionEvents2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionEvents conversionEvents1 = OASConversionEvents.getExample();
        OASConversionEvents conversionEvents2 = OASConversionEvents.getExample();
        OASConversionEvents conversionEvents3 = new OASConversionEvents();
        OASConversionEvents conversionEvents4 = new OASConversionEvents();

        System.assert(conversionEvents1.equals(conversionEvents2));
        System.assert(conversionEvents3.equals(conversionEvents4));
        System.assertEquals(conversionEvents1.hashCode(), conversionEvents2.hashCode());
        System.assertEquals(conversionEvents3.hashCode(), conversionEvents4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionEvents conversionEvents = new OASConversionEvents();
        System.assertEquals(new List<OASConversionEventsDataInner>(), conversionEvents.data);
    }
}
