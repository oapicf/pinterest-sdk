@isTest
private class OASRespondToInvitesResponseArrayItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner1 = OASRespondToInvitesResponseArrayItem.getExample();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner2 = respondToInvitesResponseArrayItemsInner1;
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner3 = new OASRespondToInvitesResponseArrayItem();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner4 = respondToInvitesResponseArrayItemsInner3;

        System.assert(respondToInvitesResponseArrayItemsInner1.equals(respondToInvitesResponseArrayItemsInner2));
        System.assert(respondToInvitesResponseArrayItemsInner2.equals(respondToInvitesResponseArrayItemsInner1));
        System.assert(respondToInvitesResponseArrayItemsInner1.equals(respondToInvitesResponseArrayItemsInner1));
        System.assert(respondToInvitesResponseArrayItemsInner3.equals(respondToInvitesResponseArrayItemsInner4));
        System.assert(respondToInvitesResponseArrayItemsInner4.equals(respondToInvitesResponseArrayItemsInner3));
        System.assert(respondToInvitesResponseArrayItemsInner3.equals(respondToInvitesResponseArrayItemsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner1 = OASRespondToInvitesResponseArrayItem.getExample();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner2 = OASRespondToInvitesResponseArrayItem.getExample();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner3 = new OASRespondToInvitesResponseArrayItem();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner4 = new OASRespondToInvitesResponseArrayItem();

        System.assert(respondToInvitesResponseArrayItemsInner1.equals(respondToInvitesResponseArrayItemsInner2));
        System.assert(respondToInvitesResponseArrayItemsInner2.equals(respondToInvitesResponseArrayItemsInner1));
        System.assert(respondToInvitesResponseArrayItemsInner3.equals(respondToInvitesResponseArrayItemsInner4));
        System.assert(respondToInvitesResponseArrayItemsInner4.equals(respondToInvitesResponseArrayItemsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner1 = OASRespondToInvitesResponseArrayItem.getExample();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner2 = new OASRespondToInvitesResponseArrayItem();

        System.assertEquals(false, respondToInvitesResponseArrayItemsInner1.equals('foo'));
        System.assertEquals(false, respondToInvitesResponseArrayItemsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner1 = OASRespondToInvitesResponseArrayItem.getExample();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner2 = new OASRespondToInvitesResponseArrayItem();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner3;

        System.assertEquals(false, respondToInvitesResponseArrayItemsInner1.equals(respondToInvitesResponseArrayItemsInner3));
        System.assertEquals(false, respondToInvitesResponseArrayItemsInner2.equals(respondToInvitesResponseArrayItemsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner1 = OASRespondToInvitesResponseArrayItem.getExample();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner2 = new OASRespondToInvitesResponseArrayItem();

        System.assertEquals(respondToInvitesResponseArrayItemsInner1.hashCode(), respondToInvitesResponseArrayItemsInner1.hashCode());
        System.assertEquals(respondToInvitesResponseArrayItemsInner2.hashCode(), respondToInvitesResponseArrayItemsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner1 = OASRespondToInvitesResponseArrayItem.getExample();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner2 = OASRespondToInvitesResponseArrayItem.getExample();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner3 = new OASRespondToInvitesResponseArrayItem();
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner4 = new OASRespondToInvitesResponseArrayItem();

        System.assert(respondToInvitesResponseArrayItemsInner1.equals(respondToInvitesResponseArrayItemsInner2));
        System.assert(respondToInvitesResponseArrayItemsInner3.equals(respondToInvitesResponseArrayItemsInner4));
        System.assertEquals(respondToInvitesResponseArrayItemsInner1.hashCode(), respondToInvitesResponseArrayItemsInner2.hashCode());
        System.assertEquals(respondToInvitesResponseArrayItemsInner3.hashCode(), respondToInvitesResponseArrayItemsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRespondToInvitesResponseArrayItem respondToInvitesResponseArrayItemsInner = new OASRespondToInvitesResponseArrayItem();
        Map<String, String> x-property-mappings = respondToInvitesResponseArrayItemsInner.getx-property-mappings();
        System.assertEquals('r_exception', x-property-mappings.get('exception'));
    }
}
