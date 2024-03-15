@isTest
private class OASAdsCreditRedeemRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsCreditRedeemRequest adsCreditRedeemRequest1 = OASAdsCreditRedeemRequest.getExample();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest2 = adsCreditRedeemRequest1;
        OASAdsCreditRedeemRequest adsCreditRedeemRequest3 = new OASAdsCreditRedeemRequest();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest4 = adsCreditRedeemRequest3;

        System.assert(adsCreditRedeemRequest1.equals(adsCreditRedeemRequest2));
        System.assert(adsCreditRedeemRequest2.equals(adsCreditRedeemRequest1));
        System.assert(adsCreditRedeemRequest1.equals(adsCreditRedeemRequest1));
        System.assert(adsCreditRedeemRequest3.equals(adsCreditRedeemRequest4));
        System.assert(adsCreditRedeemRequest4.equals(adsCreditRedeemRequest3));
        System.assert(adsCreditRedeemRequest3.equals(adsCreditRedeemRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsCreditRedeemRequest adsCreditRedeemRequest1 = OASAdsCreditRedeemRequest.getExample();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest2 = OASAdsCreditRedeemRequest.getExample();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest3 = new OASAdsCreditRedeemRequest();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest4 = new OASAdsCreditRedeemRequest();

        System.assert(adsCreditRedeemRequest1.equals(adsCreditRedeemRequest2));
        System.assert(adsCreditRedeemRequest2.equals(adsCreditRedeemRequest1));
        System.assert(adsCreditRedeemRequest3.equals(adsCreditRedeemRequest4));
        System.assert(adsCreditRedeemRequest4.equals(adsCreditRedeemRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsCreditRedeemRequest adsCreditRedeemRequest1 = OASAdsCreditRedeemRequest.getExample();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest2 = new OASAdsCreditRedeemRequest();

        System.assertEquals(false, adsCreditRedeemRequest1.equals('foo'));
        System.assertEquals(false, adsCreditRedeemRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsCreditRedeemRequest adsCreditRedeemRequest1 = OASAdsCreditRedeemRequest.getExample();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest2 = new OASAdsCreditRedeemRequest();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest3;

        System.assertEquals(false, adsCreditRedeemRequest1.equals(adsCreditRedeemRequest3));
        System.assertEquals(false, adsCreditRedeemRequest2.equals(adsCreditRedeemRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsCreditRedeemRequest adsCreditRedeemRequest1 = OASAdsCreditRedeemRequest.getExample();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest2 = new OASAdsCreditRedeemRequest();

        System.assertEquals(adsCreditRedeemRequest1.hashCode(), adsCreditRedeemRequest1.hashCode());
        System.assertEquals(adsCreditRedeemRequest2.hashCode(), adsCreditRedeemRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsCreditRedeemRequest adsCreditRedeemRequest1 = OASAdsCreditRedeemRequest.getExample();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest2 = OASAdsCreditRedeemRequest.getExample();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest3 = new OASAdsCreditRedeemRequest();
        OASAdsCreditRedeemRequest adsCreditRedeemRequest4 = new OASAdsCreditRedeemRequest();

        System.assert(adsCreditRedeemRequest1.equals(adsCreditRedeemRequest2));
        System.assert(adsCreditRedeemRequest3.equals(adsCreditRedeemRequest4));
        System.assertEquals(adsCreditRedeemRequest1.hashCode(), adsCreditRedeemRequest2.hashCode());
        System.assertEquals(adsCreditRedeemRequest3.hashCode(), adsCreditRedeemRequest4.hashCode());
    }
}
