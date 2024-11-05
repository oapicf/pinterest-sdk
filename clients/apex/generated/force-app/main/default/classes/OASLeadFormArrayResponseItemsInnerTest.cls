@isTest
private class OASLeadFormArrayResponseItemsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner1 = OASLeadFormArrayResponseItemsInner.getExample();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner2 = leadFormArrayResponseItemsInner1;
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner3 = new OASLeadFormArrayResponseItemsInner();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner4 = leadFormArrayResponseItemsInner3;

        System.assert(leadFormArrayResponseItemsInner1.equals(leadFormArrayResponseItemsInner2));
        System.assert(leadFormArrayResponseItemsInner2.equals(leadFormArrayResponseItemsInner1));
        System.assert(leadFormArrayResponseItemsInner1.equals(leadFormArrayResponseItemsInner1));
        System.assert(leadFormArrayResponseItemsInner3.equals(leadFormArrayResponseItemsInner4));
        System.assert(leadFormArrayResponseItemsInner4.equals(leadFormArrayResponseItemsInner3));
        System.assert(leadFormArrayResponseItemsInner3.equals(leadFormArrayResponseItemsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner1 = OASLeadFormArrayResponseItemsInner.getExample();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner2 = OASLeadFormArrayResponseItemsInner.getExample();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner3 = new OASLeadFormArrayResponseItemsInner();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner4 = new OASLeadFormArrayResponseItemsInner();

        System.assert(leadFormArrayResponseItemsInner1.equals(leadFormArrayResponseItemsInner2));
        System.assert(leadFormArrayResponseItemsInner2.equals(leadFormArrayResponseItemsInner1));
        System.assert(leadFormArrayResponseItemsInner3.equals(leadFormArrayResponseItemsInner4));
        System.assert(leadFormArrayResponseItemsInner4.equals(leadFormArrayResponseItemsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner1 = OASLeadFormArrayResponseItemsInner.getExample();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner2 = new OASLeadFormArrayResponseItemsInner();

        System.assertEquals(false, leadFormArrayResponseItemsInner1.equals('foo'));
        System.assertEquals(false, leadFormArrayResponseItemsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner1 = OASLeadFormArrayResponseItemsInner.getExample();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner2 = new OASLeadFormArrayResponseItemsInner();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner3;

        System.assertEquals(false, leadFormArrayResponseItemsInner1.equals(leadFormArrayResponseItemsInner3));
        System.assertEquals(false, leadFormArrayResponseItemsInner2.equals(leadFormArrayResponseItemsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner1 = OASLeadFormArrayResponseItemsInner.getExample();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner2 = new OASLeadFormArrayResponseItemsInner();

        System.assertEquals(leadFormArrayResponseItemsInner1.hashCode(), leadFormArrayResponseItemsInner1.hashCode());
        System.assertEquals(leadFormArrayResponseItemsInner2.hashCode(), leadFormArrayResponseItemsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner1 = OASLeadFormArrayResponseItemsInner.getExample();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner2 = OASLeadFormArrayResponseItemsInner.getExample();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner3 = new OASLeadFormArrayResponseItemsInner();
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner4 = new OASLeadFormArrayResponseItemsInner();

        System.assert(leadFormArrayResponseItemsInner1.equals(leadFormArrayResponseItemsInner2));
        System.assert(leadFormArrayResponseItemsInner3.equals(leadFormArrayResponseItemsInner4));
        System.assertEquals(leadFormArrayResponseItemsInner1.hashCode(), leadFormArrayResponseItemsInner2.hashCode());
        System.assertEquals(leadFormArrayResponseItemsInner3.hashCode(), leadFormArrayResponseItemsInner4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner = new OASLeadFormArrayResponseItemsInner();
        System.assertEquals(new List<OASException>(), leadFormArrayResponseItemsInner.exceptions);
        System.assertEquals(null, leadFormArrayResponseItemsInner.data);
    }
}
