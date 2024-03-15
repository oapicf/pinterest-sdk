@isTest
private class OASBidFloorTest {
    @isTest
    private static void equalsSameInstance() {
        OASBidFloor bidFloor1 = OASBidFloor.getExample();
        OASBidFloor bidFloor2 = bidFloor1;
        OASBidFloor bidFloor3 = new OASBidFloor();
        OASBidFloor bidFloor4 = bidFloor3;

        System.assert(bidFloor1.equals(bidFloor2));
        System.assert(bidFloor2.equals(bidFloor1));
        System.assert(bidFloor1.equals(bidFloor1));
        System.assert(bidFloor3.equals(bidFloor4));
        System.assert(bidFloor4.equals(bidFloor3));
        System.assert(bidFloor3.equals(bidFloor3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBidFloor bidFloor1 = OASBidFloor.getExample();
        OASBidFloor bidFloor2 = OASBidFloor.getExample();
        OASBidFloor bidFloor3 = new OASBidFloor();
        OASBidFloor bidFloor4 = new OASBidFloor();

        System.assert(bidFloor1.equals(bidFloor2));
        System.assert(bidFloor2.equals(bidFloor1));
        System.assert(bidFloor3.equals(bidFloor4));
        System.assert(bidFloor4.equals(bidFloor3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBidFloor bidFloor1 = OASBidFloor.getExample();
        OASBidFloor bidFloor2 = new OASBidFloor();

        System.assertEquals(false, bidFloor1.equals('foo'));
        System.assertEquals(false, bidFloor2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBidFloor bidFloor1 = OASBidFloor.getExample();
        OASBidFloor bidFloor2 = new OASBidFloor();
        OASBidFloor bidFloor3;

        System.assertEquals(false, bidFloor1.equals(bidFloor3));
        System.assertEquals(false, bidFloor2.equals(bidFloor3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBidFloor bidFloor1 = OASBidFloor.getExample();
        OASBidFloor bidFloor2 = new OASBidFloor();

        System.assertEquals(bidFloor1.hashCode(), bidFloor1.hashCode());
        System.assertEquals(bidFloor2.hashCode(), bidFloor2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBidFloor bidFloor1 = OASBidFloor.getExample();
        OASBidFloor bidFloor2 = OASBidFloor.getExample();
        OASBidFloor bidFloor3 = new OASBidFloor();
        OASBidFloor bidFloor4 = new OASBidFloor();

        System.assert(bidFloor1.equals(bidFloor2));
        System.assert(bidFloor3.equals(bidFloor4));
        System.assertEquals(bidFloor1.hashCode(), bidFloor2.hashCode());
        System.assertEquals(bidFloor3.hashCode(), bidFloor4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBidFloor bidFloor = new OASBidFloor();
        Map<String, String> x-property-mappings = bidFloor.getx-property-mappings();
        System.assertEquals('bidFloors', x-property-mappings.get('bid_floors'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBidFloor bidFloor = new OASBidFloor();
        System.assertEquals(new List<Integer>(), bidFloor.bidFloors);
        System.assertEquals('bidfloor', bidFloor.type);
    }
}
