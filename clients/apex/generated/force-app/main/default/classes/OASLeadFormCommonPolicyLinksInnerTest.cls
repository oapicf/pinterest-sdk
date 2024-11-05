@isTest
private class OASLeadFormCommonPolicyLinksInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner1 = OASLeadFormCommonPolicyLinksInner.getExample();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner2 = leadFormCommonPolicyLinksInner1;
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner3 = new OASLeadFormCommonPolicyLinksInner();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner4 = leadFormCommonPolicyLinksInner3;

        System.assert(leadFormCommonPolicyLinksInner1.equals(leadFormCommonPolicyLinksInner2));
        System.assert(leadFormCommonPolicyLinksInner2.equals(leadFormCommonPolicyLinksInner1));
        System.assert(leadFormCommonPolicyLinksInner1.equals(leadFormCommonPolicyLinksInner1));
        System.assert(leadFormCommonPolicyLinksInner3.equals(leadFormCommonPolicyLinksInner4));
        System.assert(leadFormCommonPolicyLinksInner4.equals(leadFormCommonPolicyLinksInner3));
        System.assert(leadFormCommonPolicyLinksInner3.equals(leadFormCommonPolicyLinksInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner1 = OASLeadFormCommonPolicyLinksInner.getExample();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner2 = OASLeadFormCommonPolicyLinksInner.getExample();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner3 = new OASLeadFormCommonPolicyLinksInner();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner4 = new OASLeadFormCommonPolicyLinksInner();

        System.assert(leadFormCommonPolicyLinksInner1.equals(leadFormCommonPolicyLinksInner2));
        System.assert(leadFormCommonPolicyLinksInner2.equals(leadFormCommonPolicyLinksInner1));
        System.assert(leadFormCommonPolicyLinksInner3.equals(leadFormCommonPolicyLinksInner4));
        System.assert(leadFormCommonPolicyLinksInner4.equals(leadFormCommonPolicyLinksInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner1 = OASLeadFormCommonPolicyLinksInner.getExample();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner2 = new OASLeadFormCommonPolicyLinksInner();

        System.assertEquals(false, leadFormCommonPolicyLinksInner1.equals('foo'));
        System.assertEquals(false, leadFormCommonPolicyLinksInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner1 = OASLeadFormCommonPolicyLinksInner.getExample();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner2 = new OASLeadFormCommonPolicyLinksInner();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner3;

        System.assertEquals(false, leadFormCommonPolicyLinksInner1.equals(leadFormCommonPolicyLinksInner3));
        System.assertEquals(false, leadFormCommonPolicyLinksInner2.equals(leadFormCommonPolicyLinksInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner1 = OASLeadFormCommonPolicyLinksInner.getExample();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner2 = new OASLeadFormCommonPolicyLinksInner();

        System.assertEquals(leadFormCommonPolicyLinksInner1.hashCode(), leadFormCommonPolicyLinksInner1.hashCode());
        System.assertEquals(leadFormCommonPolicyLinksInner2.hashCode(), leadFormCommonPolicyLinksInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner1 = OASLeadFormCommonPolicyLinksInner.getExample();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner2 = OASLeadFormCommonPolicyLinksInner.getExample();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner3 = new OASLeadFormCommonPolicyLinksInner();
        OASLeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner4 = new OASLeadFormCommonPolicyLinksInner();

        System.assert(leadFormCommonPolicyLinksInner1.equals(leadFormCommonPolicyLinksInner2));
        System.assert(leadFormCommonPolicyLinksInner3.equals(leadFormCommonPolicyLinksInner4));
        System.assertEquals(leadFormCommonPolicyLinksInner1.hashCode(), leadFormCommonPolicyLinksInner2.hashCode());
        System.assertEquals(leadFormCommonPolicyLinksInner3.hashCode(), leadFormCommonPolicyLinksInner4.hashCode());
    }
}
