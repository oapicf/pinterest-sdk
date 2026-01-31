@isTest
private class OASPinMediaSourceImagesURLItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem1 = OASPinMediaSourceImagesURLItem.getExample();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem2 = pinMediaSourceImagesURLItem1;
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem3 = new OASPinMediaSourceImagesURLItem();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem4 = pinMediaSourceImagesURLItem3;

        System.assert(pinMediaSourceImagesURLItem1.equals(pinMediaSourceImagesURLItem2));
        System.assert(pinMediaSourceImagesURLItem2.equals(pinMediaSourceImagesURLItem1));
        System.assert(pinMediaSourceImagesURLItem1.equals(pinMediaSourceImagesURLItem1));
        System.assert(pinMediaSourceImagesURLItem3.equals(pinMediaSourceImagesURLItem4));
        System.assert(pinMediaSourceImagesURLItem4.equals(pinMediaSourceImagesURLItem3));
        System.assert(pinMediaSourceImagesURLItem3.equals(pinMediaSourceImagesURLItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem1 = OASPinMediaSourceImagesURLItem.getExample();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem2 = OASPinMediaSourceImagesURLItem.getExample();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem3 = new OASPinMediaSourceImagesURLItem();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem4 = new OASPinMediaSourceImagesURLItem();

        System.assert(pinMediaSourceImagesURLItem1.equals(pinMediaSourceImagesURLItem2));
        System.assert(pinMediaSourceImagesURLItem2.equals(pinMediaSourceImagesURLItem1));
        System.assert(pinMediaSourceImagesURLItem3.equals(pinMediaSourceImagesURLItem4));
        System.assert(pinMediaSourceImagesURLItem4.equals(pinMediaSourceImagesURLItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem1 = OASPinMediaSourceImagesURLItem.getExample();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem2 = new OASPinMediaSourceImagesURLItem();

        System.assertEquals(false, pinMediaSourceImagesURLItem1.equals('foo'));
        System.assertEquals(false, pinMediaSourceImagesURLItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem1 = OASPinMediaSourceImagesURLItem.getExample();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem2 = new OASPinMediaSourceImagesURLItem();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem3;

        System.assertEquals(false, pinMediaSourceImagesURLItem1.equals(pinMediaSourceImagesURLItem3));
        System.assertEquals(false, pinMediaSourceImagesURLItem2.equals(pinMediaSourceImagesURLItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem1 = OASPinMediaSourceImagesURLItem.getExample();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem2 = new OASPinMediaSourceImagesURLItem();

        System.assertEquals(pinMediaSourceImagesURLItem1.hashCode(), pinMediaSourceImagesURLItem1.hashCode());
        System.assertEquals(pinMediaSourceImagesURLItem2.hashCode(), pinMediaSourceImagesURLItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem1 = OASPinMediaSourceImagesURLItem.getExample();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem2 = OASPinMediaSourceImagesURLItem.getExample();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem3 = new OASPinMediaSourceImagesURLItem();
        OASPinMediaSourceImagesURLItem pinMediaSourceImagesURLItem4 = new OASPinMediaSourceImagesURLItem();

        System.assert(pinMediaSourceImagesURLItem1.equals(pinMediaSourceImagesURLItem2));
        System.assert(pinMediaSourceImagesURLItem3.equals(pinMediaSourceImagesURLItem4));
        System.assertEquals(pinMediaSourceImagesURLItem1.hashCode(), pinMediaSourceImagesURLItem2.hashCode());
        System.assertEquals(pinMediaSourceImagesURLItem3.hashCode(), pinMediaSourceImagesURLItem4.hashCode());
    }
}
