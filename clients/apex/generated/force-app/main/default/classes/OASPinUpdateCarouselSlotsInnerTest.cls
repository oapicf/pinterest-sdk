@isTest
private class OASPinUpdateCarouselSlotsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner1 = OASPinUpdateCarouselSlotsInner.getExample();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner2 = pinUpdateCarouselSlotsInner1;
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner3 = new OASPinUpdateCarouselSlotsInner();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner4 = pinUpdateCarouselSlotsInner3;

        System.assert(pinUpdateCarouselSlotsInner1.equals(pinUpdateCarouselSlotsInner2));
        System.assert(pinUpdateCarouselSlotsInner2.equals(pinUpdateCarouselSlotsInner1));
        System.assert(pinUpdateCarouselSlotsInner1.equals(pinUpdateCarouselSlotsInner1));
        System.assert(pinUpdateCarouselSlotsInner3.equals(pinUpdateCarouselSlotsInner4));
        System.assert(pinUpdateCarouselSlotsInner4.equals(pinUpdateCarouselSlotsInner3));
        System.assert(pinUpdateCarouselSlotsInner3.equals(pinUpdateCarouselSlotsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner1 = OASPinUpdateCarouselSlotsInner.getExample();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner2 = OASPinUpdateCarouselSlotsInner.getExample();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner3 = new OASPinUpdateCarouselSlotsInner();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner4 = new OASPinUpdateCarouselSlotsInner();

        System.assert(pinUpdateCarouselSlotsInner1.equals(pinUpdateCarouselSlotsInner2));
        System.assert(pinUpdateCarouselSlotsInner2.equals(pinUpdateCarouselSlotsInner1));
        System.assert(pinUpdateCarouselSlotsInner3.equals(pinUpdateCarouselSlotsInner4));
        System.assert(pinUpdateCarouselSlotsInner4.equals(pinUpdateCarouselSlotsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner1 = OASPinUpdateCarouselSlotsInner.getExample();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner2 = new OASPinUpdateCarouselSlotsInner();

        System.assertEquals(false, pinUpdateCarouselSlotsInner1.equals('foo'));
        System.assertEquals(false, pinUpdateCarouselSlotsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner1 = OASPinUpdateCarouselSlotsInner.getExample();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner2 = new OASPinUpdateCarouselSlotsInner();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner3;

        System.assertEquals(false, pinUpdateCarouselSlotsInner1.equals(pinUpdateCarouselSlotsInner3));
        System.assertEquals(false, pinUpdateCarouselSlotsInner2.equals(pinUpdateCarouselSlotsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner1 = OASPinUpdateCarouselSlotsInner.getExample();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner2 = new OASPinUpdateCarouselSlotsInner();

        System.assertEquals(pinUpdateCarouselSlotsInner1.hashCode(), pinUpdateCarouselSlotsInner1.hashCode());
        System.assertEquals(pinUpdateCarouselSlotsInner2.hashCode(), pinUpdateCarouselSlotsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner1 = OASPinUpdateCarouselSlotsInner.getExample();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner2 = OASPinUpdateCarouselSlotsInner.getExample();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner3 = new OASPinUpdateCarouselSlotsInner();
        OASPinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner4 = new OASPinUpdateCarouselSlotsInner();

        System.assert(pinUpdateCarouselSlotsInner1.equals(pinUpdateCarouselSlotsInner2));
        System.assert(pinUpdateCarouselSlotsInner3.equals(pinUpdateCarouselSlotsInner4));
        System.assertEquals(pinUpdateCarouselSlotsInner1.hashCode(), pinUpdateCarouselSlotsInner2.hashCode());
        System.assertEquals(pinUpdateCarouselSlotsInner3.hashCode(), pinUpdateCarouselSlotsInner4.hashCode());
    }
}
