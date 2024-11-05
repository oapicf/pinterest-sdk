@isTest
private class OASCreateInvitesResultsResponseArrayTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner1 = OASCreateInvitesResultsResponseArray.getExample();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner2 = createInvitesResultsResponseArrayItemsInner1;
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner3 = new OASCreateInvitesResultsResponseArray();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner4 = createInvitesResultsResponseArrayItemsInner3;

        System.assert(createInvitesResultsResponseArrayItemsInner1.equals(createInvitesResultsResponseArrayItemsInner2));
        System.assert(createInvitesResultsResponseArrayItemsInner2.equals(createInvitesResultsResponseArrayItemsInner1));
        System.assert(createInvitesResultsResponseArrayItemsInner1.equals(createInvitesResultsResponseArrayItemsInner1));
        System.assert(createInvitesResultsResponseArrayItemsInner3.equals(createInvitesResultsResponseArrayItemsInner4));
        System.assert(createInvitesResultsResponseArrayItemsInner4.equals(createInvitesResultsResponseArrayItemsInner3));
        System.assert(createInvitesResultsResponseArrayItemsInner3.equals(createInvitesResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner1 = OASCreateInvitesResultsResponseArray.getExample();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner2 = OASCreateInvitesResultsResponseArray.getExample();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner3 = new OASCreateInvitesResultsResponseArray();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner4 = new OASCreateInvitesResultsResponseArray();

        System.assert(createInvitesResultsResponseArrayItemsInner1.equals(createInvitesResultsResponseArrayItemsInner2));
        System.assert(createInvitesResultsResponseArrayItemsInner2.equals(createInvitesResultsResponseArrayItemsInner1));
        System.assert(createInvitesResultsResponseArrayItemsInner3.equals(createInvitesResultsResponseArrayItemsInner4));
        System.assert(createInvitesResultsResponseArrayItemsInner4.equals(createInvitesResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner1 = OASCreateInvitesResultsResponseArray.getExample();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner2 = new OASCreateInvitesResultsResponseArray();

        System.assertEquals(false, createInvitesResultsResponseArrayItemsInner1.equals('foo'));
        System.assertEquals(false, createInvitesResultsResponseArrayItemsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner1 = OASCreateInvitesResultsResponseArray.getExample();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner2 = new OASCreateInvitesResultsResponseArray();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner3;

        System.assertEquals(false, createInvitesResultsResponseArrayItemsInner1.equals(createInvitesResultsResponseArrayItemsInner3));
        System.assertEquals(false, createInvitesResultsResponseArrayItemsInner2.equals(createInvitesResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner1 = OASCreateInvitesResultsResponseArray.getExample();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner2 = new OASCreateInvitesResultsResponseArray();

        System.assertEquals(createInvitesResultsResponseArrayItemsInner1.hashCode(), createInvitesResultsResponseArrayItemsInner1.hashCode());
        System.assertEquals(createInvitesResultsResponseArrayItemsInner2.hashCode(), createInvitesResultsResponseArrayItemsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner1 = OASCreateInvitesResultsResponseArray.getExample();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner2 = OASCreateInvitesResultsResponseArray.getExample();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner3 = new OASCreateInvitesResultsResponseArray();
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner4 = new OASCreateInvitesResultsResponseArray();

        System.assert(createInvitesResultsResponseArrayItemsInner1.equals(createInvitesResultsResponseArrayItemsInner2));
        System.assert(createInvitesResultsResponseArrayItemsInner3.equals(createInvitesResultsResponseArrayItemsInner4));
        System.assertEquals(createInvitesResultsResponseArrayItemsInner1.hashCode(), createInvitesResultsResponseArrayItemsInner2.hashCode());
        System.assertEquals(createInvitesResultsResponseArrayItemsInner3.hashCode(), createInvitesResultsResponseArrayItemsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateInvitesResultsResponseArray createInvitesResultsResponseArrayItemsInner = new OASCreateInvitesResultsResponseArray();
        Map<String, String> x-property-mappings = createInvitesResultsResponseArrayItemsInner.getx-property-mappings();
        System.assertEquals('r_exception', x-property-mappings.get('exception'));
    }
}
