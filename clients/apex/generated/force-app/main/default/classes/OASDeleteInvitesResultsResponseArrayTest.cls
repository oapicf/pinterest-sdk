@isTest
private class OASDeleteInvitesResultsResponseArrayTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner1 = OASDeleteInvitesResultsResponseArray.getExample();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner2 = deleteInvitesResultsResponseArrayItemsInner1;
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner3 = new OASDeleteInvitesResultsResponseArray();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner4 = deleteInvitesResultsResponseArrayItemsInner3;

        System.assert(deleteInvitesResultsResponseArrayItemsInner1.equals(deleteInvitesResultsResponseArrayItemsInner2));
        System.assert(deleteInvitesResultsResponseArrayItemsInner2.equals(deleteInvitesResultsResponseArrayItemsInner1));
        System.assert(deleteInvitesResultsResponseArrayItemsInner1.equals(deleteInvitesResultsResponseArrayItemsInner1));
        System.assert(deleteInvitesResultsResponseArrayItemsInner3.equals(deleteInvitesResultsResponseArrayItemsInner4));
        System.assert(deleteInvitesResultsResponseArrayItemsInner4.equals(deleteInvitesResultsResponseArrayItemsInner3));
        System.assert(deleteInvitesResultsResponseArrayItemsInner3.equals(deleteInvitesResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner1 = OASDeleteInvitesResultsResponseArray.getExample();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner2 = OASDeleteInvitesResultsResponseArray.getExample();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner3 = new OASDeleteInvitesResultsResponseArray();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner4 = new OASDeleteInvitesResultsResponseArray();

        System.assert(deleteInvitesResultsResponseArrayItemsInner1.equals(deleteInvitesResultsResponseArrayItemsInner2));
        System.assert(deleteInvitesResultsResponseArrayItemsInner2.equals(deleteInvitesResultsResponseArrayItemsInner1));
        System.assert(deleteInvitesResultsResponseArrayItemsInner3.equals(deleteInvitesResultsResponseArrayItemsInner4));
        System.assert(deleteInvitesResultsResponseArrayItemsInner4.equals(deleteInvitesResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner1 = OASDeleteInvitesResultsResponseArray.getExample();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner2 = new OASDeleteInvitesResultsResponseArray();

        System.assertEquals(false, deleteInvitesResultsResponseArrayItemsInner1.equals('foo'));
        System.assertEquals(false, deleteInvitesResultsResponseArrayItemsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner1 = OASDeleteInvitesResultsResponseArray.getExample();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner2 = new OASDeleteInvitesResultsResponseArray();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner3;

        System.assertEquals(false, deleteInvitesResultsResponseArrayItemsInner1.equals(deleteInvitesResultsResponseArrayItemsInner3));
        System.assertEquals(false, deleteInvitesResultsResponseArrayItemsInner2.equals(deleteInvitesResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner1 = OASDeleteInvitesResultsResponseArray.getExample();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner2 = new OASDeleteInvitesResultsResponseArray();

        System.assertEquals(deleteInvitesResultsResponseArrayItemsInner1.hashCode(), deleteInvitesResultsResponseArrayItemsInner1.hashCode());
        System.assertEquals(deleteInvitesResultsResponseArrayItemsInner2.hashCode(), deleteInvitesResultsResponseArrayItemsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner1 = OASDeleteInvitesResultsResponseArray.getExample();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner2 = OASDeleteInvitesResultsResponseArray.getExample();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner3 = new OASDeleteInvitesResultsResponseArray();
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner4 = new OASDeleteInvitesResultsResponseArray();

        System.assert(deleteInvitesResultsResponseArrayItemsInner1.equals(deleteInvitesResultsResponseArrayItemsInner2));
        System.assert(deleteInvitesResultsResponseArrayItemsInner3.equals(deleteInvitesResultsResponseArrayItemsInner4));
        System.assertEquals(deleteInvitesResultsResponseArrayItemsInner1.hashCode(), deleteInvitesResultsResponseArrayItemsInner2.hashCode());
        System.assertEquals(deleteInvitesResultsResponseArrayItemsInner3.hashCode(), deleteInvitesResultsResponseArrayItemsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteInvitesResultsResponseArray deleteInvitesResultsResponseArrayItemsInner = new OASDeleteInvitesResultsResponseArray();
        Map<String, String> x-property-mappings = deleteInvitesResultsResponseArrayItemsInner.getx-property-mappings();
        System.assertEquals('r_exception', x-property-mappings.get('exception'));
    }
}
