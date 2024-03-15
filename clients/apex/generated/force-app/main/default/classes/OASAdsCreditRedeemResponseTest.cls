@isTest
private class OASAdsCreditRedeemResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsCreditRedeemResponse adsCreditRedeemResponse1 = OASAdsCreditRedeemResponse.getExample();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse2 = adsCreditRedeemResponse1;
        OASAdsCreditRedeemResponse adsCreditRedeemResponse3 = new OASAdsCreditRedeemResponse();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse4 = adsCreditRedeemResponse3;

        System.assert(adsCreditRedeemResponse1.equals(adsCreditRedeemResponse2));
        System.assert(adsCreditRedeemResponse2.equals(adsCreditRedeemResponse1));
        System.assert(adsCreditRedeemResponse1.equals(adsCreditRedeemResponse1));
        System.assert(adsCreditRedeemResponse3.equals(adsCreditRedeemResponse4));
        System.assert(adsCreditRedeemResponse4.equals(adsCreditRedeemResponse3));
        System.assert(adsCreditRedeemResponse3.equals(adsCreditRedeemResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsCreditRedeemResponse adsCreditRedeemResponse1 = OASAdsCreditRedeemResponse.getExample();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse2 = OASAdsCreditRedeemResponse.getExample();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse3 = new OASAdsCreditRedeemResponse();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse4 = new OASAdsCreditRedeemResponse();

        System.assert(adsCreditRedeemResponse1.equals(adsCreditRedeemResponse2));
        System.assert(adsCreditRedeemResponse2.equals(adsCreditRedeemResponse1));
        System.assert(adsCreditRedeemResponse3.equals(adsCreditRedeemResponse4));
        System.assert(adsCreditRedeemResponse4.equals(adsCreditRedeemResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsCreditRedeemResponse adsCreditRedeemResponse1 = OASAdsCreditRedeemResponse.getExample();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse2 = new OASAdsCreditRedeemResponse();

        System.assertEquals(false, adsCreditRedeemResponse1.equals('foo'));
        System.assertEquals(false, adsCreditRedeemResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsCreditRedeemResponse adsCreditRedeemResponse1 = OASAdsCreditRedeemResponse.getExample();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse2 = new OASAdsCreditRedeemResponse();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse3;

        System.assertEquals(false, adsCreditRedeemResponse1.equals(adsCreditRedeemResponse3));
        System.assertEquals(false, adsCreditRedeemResponse2.equals(adsCreditRedeemResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsCreditRedeemResponse adsCreditRedeemResponse1 = OASAdsCreditRedeemResponse.getExample();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse2 = new OASAdsCreditRedeemResponse();

        System.assertEquals(adsCreditRedeemResponse1.hashCode(), adsCreditRedeemResponse1.hashCode());
        System.assertEquals(adsCreditRedeemResponse2.hashCode(), adsCreditRedeemResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsCreditRedeemResponse adsCreditRedeemResponse1 = OASAdsCreditRedeemResponse.getExample();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse2 = OASAdsCreditRedeemResponse.getExample();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse3 = new OASAdsCreditRedeemResponse();
        OASAdsCreditRedeemResponse adsCreditRedeemResponse4 = new OASAdsCreditRedeemResponse();

        System.assert(adsCreditRedeemResponse1.equals(adsCreditRedeemResponse2));
        System.assert(adsCreditRedeemResponse3.equals(adsCreditRedeemResponse4));
        System.assertEquals(adsCreditRedeemResponse1.hashCode(), adsCreditRedeemResponse2.hashCode());
        System.assertEquals(adsCreditRedeemResponse3.hashCode(), adsCreditRedeemResponse4.hashCode());
    }
}
