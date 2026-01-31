@isTest
private class OASCarouselSlotTest {
    @isTest
    private static void equalsSameInstance() {
        OASCarouselSlot carouselSlot1 = OASCarouselSlot.getExample();
        OASCarouselSlot carouselSlot2 = carouselSlot1;
        OASCarouselSlot carouselSlot3 = new OASCarouselSlot();
        OASCarouselSlot carouselSlot4 = carouselSlot3;

        System.assert(carouselSlot1.equals(carouselSlot2));
        System.assert(carouselSlot2.equals(carouselSlot1));
        System.assert(carouselSlot1.equals(carouselSlot1));
        System.assert(carouselSlot3.equals(carouselSlot4));
        System.assert(carouselSlot4.equals(carouselSlot3));
        System.assert(carouselSlot3.equals(carouselSlot3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCarouselSlot carouselSlot1 = OASCarouselSlot.getExample();
        OASCarouselSlot carouselSlot2 = OASCarouselSlot.getExample();
        OASCarouselSlot carouselSlot3 = new OASCarouselSlot();
        OASCarouselSlot carouselSlot4 = new OASCarouselSlot();

        System.assert(carouselSlot1.equals(carouselSlot2));
        System.assert(carouselSlot2.equals(carouselSlot1));
        System.assert(carouselSlot3.equals(carouselSlot4));
        System.assert(carouselSlot4.equals(carouselSlot3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCarouselSlot carouselSlot1 = OASCarouselSlot.getExample();
        OASCarouselSlot carouselSlot2 = new OASCarouselSlot();

        System.assertEquals(false, carouselSlot1.equals('foo'));
        System.assertEquals(false, carouselSlot2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCarouselSlot carouselSlot1 = OASCarouselSlot.getExample();
        OASCarouselSlot carouselSlot2 = new OASCarouselSlot();
        OASCarouselSlot carouselSlot3;

        System.assertEquals(false, carouselSlot1.equals(carouselSlot3));
        System.assertEquals(false, carouselSlot2.equals(carouselSlot3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCarouselSlot carouselSlot1 = OASCarouselSlot.getExample();
        OASCarouselSlot carouselSlot2 = new OASCarouselSlot();

        System.assertEquals(carouselSlot1.hashCode(), carouselSlot1.hashCode());
        System.assertEquals(carouselSlot2.hashCode(), carouselSlot2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCarouselSlot carouselSlot1 = OASCarouselSlot.getExample();
        OASCarouselSlot carouselSlot2 = OASCarouselSlot.getExample();
        OASCarouselSlot carouselSlot3 = new OASCarouselSlot();
        OASCarouselSlot carouselSlot4 = new OASCarouselSlot();

        System.assert(carouselSlot1.equals(carouselSlot2));
        System.assert(carouselSlot3.equals(carouselSlot4));
        System.assertEquals(carouselSlot1.hashCode(), carouselSlot2.hashCode());
        System.assertEquals(carouselSlot3.hashCode(), carouselSlot4.hashCode());
    }
}
