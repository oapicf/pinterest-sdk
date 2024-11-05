@isTest
private class OASAdvancedAuctionOperationErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionOperationError advancedAuctionOperationError1 = OASAdvancedAuctionOperationError.getExample();
        OASAdvancedAuctionOperationError advancedAuctionOperationError2 = advancedAuctionOperationError1;
        OASAdvancedAuctionOperationError advancedAuctionOperationError3 = new OASAdvancedAuctionOperationError();
        OASAdvancedAuctionOperationError advancedAuctionOperationError4 = advancedAuctionOperationError3;

        System.assert(advancedAuctionOperationError1.equals(advancedAuctionOperationError2));
        System.assert(advancedAuctionOperationError2.equals(advancedAuctionOperationError1));
        System.assert(advancedAuctionOperationError1.equals(advancedAuctionOperationError1));
        System.assert(advancedAuctionOperationError3.equals(advancedAuctionOperationError4));
        System.assert(advancedAuctionOperationError4.equals(advancedAuctionOperationError3));
        System.assert(advancedAuctionOperationError3.equals(advancedAuctionOperationError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionOperationError advancedAuctionOperationError1 = OASAdvancedAuctionOperationError.getExample();
        OASAdvancedAuctionOperationError advancedAuctionOperationError2 = OASAdvancedAuctionOperationError.getExample();
        OASAdvancedAuctionOperationError advancedAuctionOperationError3 = new OASAdvancedAuctionOperationError();
        OASAdvancedAuctionOperationError advancedAuctionOperationError4 = new OASAdvancedAuctionOperationError();

        System.assert(advancedAuctionOperationError1.equals(advancedAuctionOperationError2));
        System.assert(advancedAuctionOperationError2.equals(advancedAuctionOperationError1));
        System.assert(advancedAuctionOperationError3.equals(advancedAuctionOperationError4));
        System.assert(advancedAuctionOperationError4.equals(advancedAuctionOperationError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionOperationError advancedAuctionOperationError1 = OASAdvancedAuctionOperationError.getExample();
        OASAdvancedAuctionOperationError advancedAuctionOperationError2 = new OASAdvancedAuctionOperationError();

        System.assertEquals(false, advancedAuctionOperationError1.equals('foo'));
        System.assertEquals(false, advancedAuctionOperationError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionOperationError advancedAuctionOperationError1 = OASAdvancedAuctionOperationError.getExample();
        OASAdvancedAuctionOperationError advancedAuctionOperationError2 = new OASAdvancedAuctionOperationError();
        OASAdvancedAuctionOperationError advancedAuctionOperationError3;

        System.assertEquals(false, advancedAuctionOperationError1.equals(advancedAuctionOperationError3));
        System.assertEquals(false, advancedAuctionOperationError2.equals(advancedAuctionOperationError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionOperationError advancedAuctionOperationError1 = OASAdvancedAuctionOperationError.getExample();
        OASAdvancedAuctionOperationError advancedAuctionOperationError2 = new OASAdvancedAuctionOperationError();

        System.assertEquals(advancedAuctionOperationError1.hashCode(), advancedAuctionOperationError1.hashCode());
        System.assertEquals(advancedAuctionOperationError2.hashCode(), advancedAuctionOperationError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionOperationError advancedAuctionOperationError1 = OASAdvancedAuctionOperationError.getExample();
        OASAdvancedAuctionOperationError advancedAuctionOperationError2 = OASAdvancedAuctionOperationError.getExample();
        OASAdvancedAuctionOperationError advancedAuctionOperationError3 = new OASAdvancedAuctionOperationError();
        OASAdvancedAuctionOperationError advancedAuctionOperationError4 = new OASAdvancedAuctionOperationError();

        System.assert(advancedAuctionOperationError1.equals(advancedAuctionOperationError2));
        System.assert(advancedAuctionOperationError3.equals(advancedAuctionOperationError4));
        System.assertEquals(advancedAuctionOperationError1.hashCode(), advancedAuctionOperationError2.hashCode());
        System.assertEquals(advancedAuctionOperationError3.hashCode(), advancedAuctionOperationError4.hashCode());
    }
}
