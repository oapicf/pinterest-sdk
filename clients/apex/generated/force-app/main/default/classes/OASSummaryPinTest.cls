@isTest
private class OASSummaryPinTest {
    @isTest
    private static void equalsSameInstance() {
        OASSummaryPin summaryPin1 = OASSummaryPin.getExample();
        OASSummaryPin summaryPin2 = summaryPin1;
        OASSummaryPin summaryPin3 = new OASSummaryPin();
        OASSummaryPin summaryPin4 = summaryPin3;

        System.assert(summaryPin1.equals(summaryPin2));
        System.assert(summaryPin2.equals(summaryPin1));
        System.assert(summaryPin1.equals(summaryPin1));
        System.assert(summaryPin3.equals(summaryPin4));
        System.assert(summaryPin4.equals(summaryPin3));
        System.assert(summaryPin3.equals(summaryPin3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSummaryPin summaryPin1 = OASSummaryPin.getExample();
        OASSummaryPin summaryPin2 = OASSummaryPin.getExample();
        OASSummaryPin summaryPin3 = new OASSummaryPin();
        OASSummaryPin summaryPin4 = new OASSummaryPin();

        System.assert(summaryPin1.equals(summaryPin2));
        System.assert(summaryPin2.equals(summaryPin1));
        System.assert(summaryPin3.equals(summaryPin4));
        System.assert(summaryPin4.equals(summaryPin3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSummaryPin summaryPin1 = OASSummaryPin.getExample();
        OASSummaryPin summaryPin2 = new OASSummaryPin();

        System.assertEquals(false, summaryPin1.equals('foo'));
        System.assertEquals(false, summaryPin2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSummaryPin summaryPin1 = OASSummaryPin.getExample();
        OASSummaryPin summaryPin2 = new OASSummaryPin();
        OASSummaryPin summaryPin3;

        System.assertEquals(false, summaryPin1.equals(summaryPin3));
        System.assertEquals(false, summaryPin2.equals(summaryPin3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSummaryPin summaryPin1 = OASSummaryPin.getExample();
        OASSummaryPin summaryPin2 = new OASSummaryPin();

        System.assertEquals(summaryPin1.hashCode(), summaryPin1.hashCode());
        System.assertEquals(summaryPin2.hashCode(), summaryPin2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSummaryPin summaryPin1 = OASSummaryPin.getExample();
        OASSummaryPin summaryPin2 = OASSummaryPin.getExample();
        OASSummaryPin summaryPin3 = new OASSummaryPin();
        OASSummaryPin summaryPin4 = new OASSummaryPin();

        System.assert(summaryPin1.equals(summaryPin2));
        System.assert(summaryPin3.equals(summaryPin4));
        System.assertEquals(summaryPin1.hashCode(), summaryPin2.hashCode());
        System.assertEquals(summaryPin3.hashCode(), summaryPin4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSummaryPin summaryPin = new OASSummaryPin();
        Map<String, String> x-property-mappings = summaryPin.getx-property-mappings();
        System.assertEquals('altText', x-property-mappings.get('alt_text'));
    }
}
