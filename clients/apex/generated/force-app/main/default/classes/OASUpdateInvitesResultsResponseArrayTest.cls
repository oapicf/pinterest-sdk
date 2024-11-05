@isTest
private class OASUpdateInvitesResultsResponseArrayTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner1 = OASUpdateInvitesResultsResponseArray.getExample();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner2 = updateInvitesResultsResponseArrayItemsInner1;
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner3 = new OASUpdateInvitesResultsResponseArray();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner4 = updateInvitesResultsResponseArrayItemsInner3;

        System.assert(updateInvitesResultsResponseArrayItemsInner1.equals(updateInvitesResultsResponseArrayItemsInner2));
        System.assert(updateInvitesResultsResponseArrayItemsInner2.equals(updateInvitesResultsResponseArrayItemsInner1));
        System.assert(updateInvitesResultsResponseArrayItemsInner1.equals(updateInvitesResultsResponseArrayItemsInner1));
        System.assert(updateInvitesResultsResponseArrayItemsInner3.equals(updateInvitesResultsResponseArrayItemsInner4));
        System.assert(updateInvitesResultsResponseArrayItemsInner4.equals(updateInvitesResultsResponseArrayItemsInner3));
        System.assert(updateInvitesResultsResponseArrayItemsInner3.equals(updateInvitesResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner1 = OASUpdateInvitesResultsResponseArray.getExample();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner2 = OASUpdateInvitesResultsResponseArray.getExample();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner3 = new OASUpdateInvitesResultsResponseArray();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner4 = new OASUpdateInvitesResultsResponseArray();

        System.assert(updateInvitesResultsResponseArrayItemsInner1.equals(updateInvitesResultsResponseArrayItemsInner2));
        System.assert(updateInvitesResultsResponseArrayItemsInner2.equals(updateInvitesResultsResponseArrayItemsInner1));
        System.assert(updateInvitesResultsResponseArrayItemsInner3.equals(updateInvitesResultsResponseArrayItemsInner4));
        System.assert(updateInvitesResultsResponseArrayItemsInner4.equals(updateInvitesResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner1 = OASUpdateInvitesResultsResponseArray.getExample();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner2 = new OASUpdateInvitesResultsResponseArray();

        System.assertEquals(false, updateInvitesResultsResponseArrayItemsInner1.equals('foo'));
        System.assertEquals(false, updateInvitesResultsResponseArrayItemsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner1 = OASUpdateInvitesResultsResponseArray.getExample();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner2 = new OASUpdateInvitesResultsResponseArray();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner3;

        System.assertEquals(false, updateInvitesResultsResponseArrayItemsInner1.equals(updateInvitesResultsResponseArrayItemsInner3));
        System.assertEquals(false, updateInvitesResultsResponseArrayItemsInner2.equals(updateInvitesResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner1 = OASUpdateInvitesResultsResponseArray.getExample();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner2 = new OASUpdateInvitesResultsResponseArray();

        System.assertEquals(updateInvitesResultsResponseArrayItemsInner1.hashCode(), updateInvitesResultsResponseArrayItemsInner1.hashCode());
        System.assertEquals(updateInvitesResultsResponseArrayItemsInner2.hashCode(), updateInvitesResultsResponseArrayItemsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner1 = OASUpdateInvitesResultsResponseArray.getExample();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner2 = OASUpdateInvitesResultsResponseArray.getExample();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner3 = new OASUpdateInvitesResultsResponseArray();
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner4 = new OASUpdateInvitesResultsResponseArray();

        System.assert(updateInvitesResultsResponseArrayItemsInner1.equals(updateInvitesResultsResponseArrayItemsInner2));
        System.assert(updateInvitesResultsResponseArrayItemsInner3.equals(updateInvitesResultsResponseArrayItemsInner4));
        System.assertEquals(updateInvitesResultsResponseArrayItemsInner1.hashCode(), updateInvitesResultsResponseArrayItemsInner2.hashCode());
        System.assertEquals(updateInvitesResultsResponseArrayItemsInner3.hashCode(), updateInvitesResultsResponseArrayItemsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdateInvitesResultsResponseArray updateInvitesResultsResponseArrayItemsInner = new OASUpdateInvitesResultsResponseArray();
        Map<String, String> x-property-mappings = updateInvitesResultsResponseArrayItemsInner.getx-property-mappings();
        System.assertEquals('r_exception', x-property-mappings.get('exception'));
    }
}
