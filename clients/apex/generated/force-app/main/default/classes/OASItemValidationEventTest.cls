@isTest
private class OASItemValidationEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemValidationEvent itemValidationEvent1 = OASItemValidationEvent.getExample();
        OASItemValidationEvent itemValidationEvent2 = itemValidationEvent1;
        OASItemValidationEvent itemValidationEvent3 = new OASItemValidationEvent();
        OASItemValidationEvent itemValidationEvent4 = itemValidationEvent3;

        System.assert(itemValidationEvent1.equals(itemValidationEvent2));
        System.assert(itemValidationEvent2.equals(itemValidationEvent1));
        System.assert(itemValidationEvent1.equals(itemValidationEvent1));
        System.assert(itemValidationEvent3.equals(itemValidationEvent4));
        System.assert(itemValidationEvent4.equals(itemValidationEvent3));
        System.assert(itemValidationEvent3.equals(itemValidationEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemValidationEvent itemValidationEvent1 = OASItemValidationEvent.getExample();
        OASItemValidationEvent itemValidationEvent2 = OASItemValidationEvent.getExample();
        OASItemValidationEvent itemValidationEvent3 = new OASItemValidationEvent();
        OASItemValidationEvent itemValidationEvent4 = new OASItemValidationEvent();

        System.assert(itemValidationEvent1.equals(itemValidationEvent2));
        System.assert(itemValidationEvent2.equals(itemValidationEvent1));
        System.assert(itemValidationEvent3.equals(itemValidationEvent4));
        System.assert(itemValidationEvent4.equals(itemValidationEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemValidationEvent itemValidationEvent1 = OASItemValidationEvent.getExample();
        OASItemValidationEvent itemValidationEvent2 = new OASItemValidationEvent();

        System.assertEquals(false, itemValidationEvent1.equals('foo'));
        System.assertEquals(false, itemValidationEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemValidationEvent itemValidationEvent1 = OASItemValidationEvent.getExample();
        OASItemValidationEvent itemValidationEvent2 = new OASItemValidationEvent();
        OASItemValidationEvent itemValidationEvent3;

        System.assertEquals(false, itemValidationEvent1.equals(itemValidationEvent3));
        System.assertEquals(false, itemValidationEvent2.equals(itemValidationEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemValidationEvent itemValidationEvent1 = OASItemValidationEvent.getExample();
        OASItemValidationEvent itemValidationEvent2 = new OASItemValidationEvent();

        System.assertEquals(itemValidationEvent1.hashCode(), itemValidationEvent1.hashCode());
        System.assertEquals(itemValidationEvent2.hashCode(), itemValidationEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemValidationEvent itemValidationEvent1 = OASItemValidationEvent.getExample();
        OASItemValidationEvent itemValidationEvent2 = OASItemValidationEvent.getExample();
        OASItemValidationEvent itemValidationEvent3 = new OASItemValidationEvent();
        OASItemValidationEvent itemValidationEvent4 = new OASItemValidationEvent();

        System.assert(itemValidationEvent1.equals(itemValidationEvent2));
        System.assert(itemValidationEvent3.equals(itemValidationEvent4));
        System.assertEquals(itemValidationEvent1.hashCode(), itemValidationEvent2.hashCode());
        System.assertEquals(itemValidationEvent3.hashCode(), itemValidationEvent4.hashCode());
    }
}
