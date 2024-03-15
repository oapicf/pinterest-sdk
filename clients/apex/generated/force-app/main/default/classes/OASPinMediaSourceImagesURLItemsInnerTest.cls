@isTest
private class OASPinMediaSourceImagesURLItemsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner1 = OASPinMediaSourceImagesURLItemsInner.getExample();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner2 = pinMediaSourceImagesURLItemsInner1;
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner3 = new OASPinMediaSourceImagesURLItemsInner();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner4 = pinMediaSourceImagesURLItemsInner3;

        System.assert(pinMediaSourceImagesURLItemsInner1.equals(pinMediaSourceImagesURLItemsInner2));
        System.assert(pinMediaSourceImagesURLItemsInner2.equals(pinMediaSourceImagesURLItemsInner1));
        System.assert(pinMediaSourceImagesURLItemsInner1.equals(pinMediaSourceImagesURLItemsInner1));
        System.assert(pinMediaSourceImagesURLItemsInner3.equals(pinMediaSourceImagesURLItemsInner4));
        System.assert(pinMediaSourceImagesURLItemsInner4.equals(pinMediaSourceImagesURLItemsInner3));
        System.assert(pinMediaSourceImagesURLItemsInner3.equals(pinMediaSourceImagesURLItemsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner1 = OASPinMediaSourceImagesURLItemsInner.getExample();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner2 = OASPinMediaSourceImagesURLItemsInner.getExample();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner3 = new OASPinMediaSourceImagesURLItemsInner();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner4 = new OASPinMediaSourceImagesURLItemsInner();

        System.assert(pinMediaSourceImagesURLItemsInner1.equals(pinMediaSourceImagesURLItemsInner2));
        System.assert(pinMediaSourceImagesURLItemsInner2.equals(pinMediaSourceImagesURLItemsInner1));
        System.assert(pinMediaSourceImagesURLItemsInner3.equals(pinMediaSourceImagesURLItemsInner4));
        System.assert(pinMediaSourceImagesURLItemsInner4.equals(pinMediaSourceImagesURLItemsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner1 = OASPinMediaSourceImagesURLItemsInner.getExample();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner2 = new OASPinMediaSourceImagesURLItemsInner();

        System.assertEquals(false, pinMediaSourceImagesURLItemsInner1.equals('foo'));
        System.assertEquals(false, pinMediaSourceImagesURLItemsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner1 = OASPinMediaSourceImagesURLItemsInner.getExample();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner2 = new OASPinMediaSourceImagesURLItemsInner();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner3;

        System.assertEquals(false, pinMediaSourceImagesURLItemsInner1.equals(pinMediaSourceImagesURLItemsInner3));
        System.assertEquals(false, pinMediaSourceImagesURLItemsInner2.equals(pinMediaSourceImagesURLItemsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner1 = OASPinMediaSourceImagesURLItemsInner.getExample();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner2 = new OASPinMediaSourceImagesURLItemsInner();

        System.assertEquals(pinMediaSourceImagesURLItemsInner1.hashCode(), pinMediaSourceImagesURLItemsInner1.hashCode());
        System.assertEquals(pinMediaSourceImagesURLItemsInner2.hashCode(), pinMediaSourceImagesURLItemsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner1 = OASPinMediaSourceImagesURLItemsInner.getExample();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner2 = OASPinMediaSourceImagesURLItemsInner.getExample();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner3 = new OASPinMediaSourceImagesURLItemsInner();
        OASPinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner4 = new OASPinMediaSourceImagesURLItemsInner();

        System.assert(pinMediaSourceImagesURLItemsInner1.equals(pinMediaSourceImagesURLItemsInner2));
        System.assert(pinMediaSourceImagesURLItemsInner3.equals(pinMediaSourceImagesURLItemsInner4));
        System.assertEquals(pinMediaSourceImagesURLItemsInner1.hashCode(), pinMediaSourceImagesURLItemsInner2.hashCode());
        System.assertEquals(pinMediaSourceImagesURLItemsInner3.hashCode(), pinMediaSourceImagesURLItemsInner4.hashCode());
    }
}
