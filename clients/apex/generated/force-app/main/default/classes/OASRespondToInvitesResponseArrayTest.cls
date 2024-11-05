@isTest
private class OASRespondToInvitesResponseArrayTest {
    @isTest
    private static void equalsSameInstance() {
        OASRespondToInvitesResponseArray respondToInvitesResponseArray1 = OASRespondToInvitesResponseArray.getExample();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray2 = respondToInvitesResponseArray1;
        OASRespondToInvitesResponseArray respondToInvitesResponseArray3 = new OASRespondToInvitesResponseArray();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray4 = respondToInvitesResponseArray3;

        System.assert(respondToInvitesResponseArray1.equals(respondToInvitesResponseArray2));
        System.assert(respondToInvitesResponseArray2.equals(respondToInvitesResponseArray1));
        System.assert(respondToInvitesResponseArray1.equals(respondToInvitesResponseArray1));
        System.assert(respondToInvitesResponseArray3.equals(respondToInvitesResponseArray4));
        System.assert(respondToInvitesResponseArray4.equals(respondToInvitesResponseArray3));
        System.assert(respondToInvitesResponseArray3.equals(respondToInvitesResponseArray3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRespondToInvitesResponseArray respondToInvitesResponseArray1 = OASRespondToInvitesResponseArray.getExample();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray2 = OASRespondToInvitesResponseArray.getExample();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray3 = new OASRespondToInvitesResponseArray();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray4 = new OASRespondToInvitesResponseArray();

        System.assert(respondToInvitesResponseArray1.equals(respondToInvitesResponseArray2));
        System.assert(respondToInvitesResponseArray2.equals(respondToInvitesResponseArray1));
        System.assert(respondToInvitesResponseArray3.equals(respondToInvitesResponseArray4));
        System.assert(respondToInvitesResponseArray4.equals(respondToInvitesResponseArray3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRespondToInvitesResponseArray respondToInvitesResponseArray1 = OASRespondToInvitesResponseArray.getExample();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray2 = new OASRespondToInvitesResponseArray();

        System.assertEquals(false, respondToInvitesResponseArray1.equals('foo'));
        System.assertEquals(false, respondToInvitesResponseArray2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRespondToInvitesResponseArray respondToInvitesResponseArray1 = OASRespondToInvitesResponseArray.getExample();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray2 = new OASRespondToInvitesResponseArray();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray3;

        System.assertEquals(false, respondToInvitesResponseArray1.equals(respondToInvitesResponseArray3));
        System.assertEquals(false, respondToInvitesResponseArray2.equals(respondToInvitesResponseArray3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRespondToInvitesResponseArray respondToInvitesResponseArray1 = OASRespondToInvitesResponseArray.getExample();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray2 = new OASRespondToInvitesResponseArray();

        System.assertEquals(respondToInvitesResponseArray1.hashCode(), respondToInvitesResponseArray1.hashCode());
        System.assertEquals(respondToInvitesResponseArray2.hashCode(), respondToInvitesResponseArray2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRespondToInvitesResponseArray respondToInvitesResponseArray1 = OASRespondToInvitesResponseArray.getExample();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray2 = OASRespondToInvitesResponseArray.getExample();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray3 = new OASRespondToInvitesResponseArray();
        OASRespondToInvitesResponseArray respondToInvitesResponseArray4 = new OASRespondToInvitesResponseArray();

        System.assert(respondToInvitesResponseArray1.equals(respondToInvitesResponseArray2));
        System.assert(respondToInvitesResponseArray3.equals(respondToInvitesResponseArray4));
        System.assertEquals(respondToInvitesResponseArray1.hashCode(), respondToInvitesResponseArray2.hashCode());
        System.assertEquals(respondToInvitesResponseArray3.hashCode(), respondToInvitesResponseArray4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRespondToInvitesResponseArray respondToInvitesResponseArray = new OASRespondToInvitesResponseArray();
        System.assertEquals(new List<OASRespondToInvitesResponseArrayItem>(), respondToInvitesResponseArray.items);
    }
}
