@isTest
private class OASMembersToDeleteBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASMembersToDeleteBody membersToDeleteBody1 = OASMembersToDeleteBody.getExample();
        OASMembersToDeleteBody membersToDeleteBody2 = membersToDeleteBody1;
        OASMembersToDeleteBody membersToDeleteBody3 = new OASMembersToDeleteBody();
        OASMembersToDeleteBody membersToDeleteBody4 = membersToDeleteBody3;

        System.assert(membersToDeleteBody1.equals(membersToDeleteBody2));
        System.assert(membersToDeleteBody2.equals(membersToDeleteBody1));
        System.assert(membersToDeleteBody1.equals(membersToDeleteBody1));
        System.assert(membersToDeleteBody3.equals(membersToDeleteBody4));
        System.assert(membersToDeleteBody4.equals(membersToDeleteBody3));
        System.assert(membersToDeleteBody3.equals(membersToDeleteBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMembersToDeleteBody membersToDeleteBody1 = OASMembersToDeleteBody.getExample();
        OASMembersToDeleteBody membersToDeleteBody2 = OASMembersToDeleteBody.getExample();
        OASMembersToDeleteBody membersToDeleteBody3 = new OASMembersToDeleteBody();
        OASMembersToDeleteBody membersToDeleteBody4 = new OASMembersToDeleteBody();

        System.assert(membersToDeleteBody1.equals(membersToDeleteBody2));
        System.assert(membersToDeleteBody2.equals(membersToDeleteBody1));
        System.assert(membersToDeleteBody3.equals(membersToDeleteBody4));
        System.assert(membersToDeleteBody4.equals(membersToDeleteBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMembersToDeleteBody membersToDeleteBody1 = OASMembersToDeleteBody.getExample();
        OASMembersToDeleteBody membersToDeleteBody2 = new OASMembersToDeleteBody();

        System.assertEquals(false, membersToDeleteBody1.equals('foo'));
        System.assertEquals(false, membersToDeleteBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMembersToDeleteBody membersToDeleteBody1 = OASMembersToDeleteBody.getExample();
        OASMembersToDeleteBody membersToDeleteBody2 = new OASMembersToDeleteBody();
        OASMembersToDeleteBody membersToDeleteBody3;

        System.assertEquals(false, membersToDeleteBody1.equals(membersToDeleteBody3));
        System.assertEquals(false, membersToDeleteBody2.equals(membersToDeleteBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMembersToDeleteBody membersToDeleteBody1 = OASMembersToDeleteBody.getExample();
        OASMembersToDeleteBody membersToDeleteBody2 = new OASMembersToDeleteBody();

        System.assertEquals(membersToDeleteBody1.hashCode(), membersToDeleteBody1.hashCode());
        System.assertEquals(membersToDeleteBody2.hashCode(), membersToDeleteBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMembersToDeleteBody membersToDeleteBody1 = OASMembersToDeleteBody.getExample();
        OASMembersToDeleteBody membersToDeleteBody2 = OASMembersToDeleteBody.getExample();
        OASMembersToDeleteBody membersToDeleteBody3 = new OASMembersToDeleteBody();
        OASMembersToDeleteBody membersToDeleteBody4 = new OASMembersToDeleteBody();

        System.assert(membersToDeleteBody1.equals(membersToDeleteBody2));
        System.assert(membersToDeleteBody3.equals(membersToDeleteBody4));
        System.assertEquals(membersToDeleteBody1.hashCode(), membersToDeleteBody2.hashCode());
        System.assertEquals(membersToDeleteBody3.hashCode(), membersToDeleteBody4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMembersToDeleteBody membersToDeleteBody = new OASMembersToDeleteBody();
        System.assertEquals(new List<OASMembersToDeleteBodyMembersInner>(), membersToDeleteBody.members);
    }
}
