@isTest
private class OASMembersToDeleteBodyMembersInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner1 = OASMembersToDeleteBodyMembersInner.getExample();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner2 = membersToDeleteBodyMembersInner1;
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner3 = new OASMembersToDeleteBodyMembersInner();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner4 = membersToDeleteBodyMembersInner3;

        System.assert(membersToDeleteBodyMembersInner1.equals(membersToDeleteBodyMembersInner2));
        System.assert(membersToDeleteBodyMembersInner2.equals(membersToDeleteBodyMembersInner1));
        System.assert(membersToDeleteBodyMembersInner1.equals(membersToDeleteBodyMembersInner1));
        System.assert(membersToDeleteBodyMembersInner3.equals(membersToDeleteBodyMembersInner4));
        System.assert(membersToDeleteBodyMembersInner4.equals(membersToDeleteBodyMembersInner3));
        System.assert(membersToDeleteBodyMembersInner3.equals(membersToDeleteBodyMembersInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner1 = OASMembersToDeleteBodyMembersInner.getExample();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner2 = OASMembersToDeleteBodyMembersInner.getExample();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner3 = new OASMembersToDeleteBodyMembersInner();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner4 = new OASMembersToDeleteBodyMembersInner();

        System.assert(membersToDeleteBodyMembersInner1.equals(membersToDeleteBodyMembersInner2));
        System.assert(membersToDeleteBodyMembersInner2.equals(membersToDeleteBodyMembersInner1));
        System.assert(membersToDeleteBodyMembersInner3.equals(membersToDeleteBodyMembersInner4));
        System.assert(membersToDeleteBodyMembersInner4.equals(membersToDeleteBodyMembersInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner1 = OASMembersToDeleteBodyMembersInner.getExample();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner2 = new OASMembersToDeleteBodyMembersInner();

        System.assertEquals(false, membersToDeleteBodyMembersInner1.equals('foo'));
        System.assertEquals(false, membersToDeleteBodyMembersInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner1 = OASMembersToDeleteBodyMembersInner.getExample();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner2 = new OASMembersToDeleteBodyMembersInner();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner3;

        System.assertEquals(false, membersToDeleteBodyMembersInner1.equals(membersToDeleteBodyMembersInner3));
        System.assertEquals(false, membersToDeleteBodyMembersInner2.equals(membersToDeleteBodyMembersInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner1 = OASMembersToDeleteBodyMembersInner.getExample();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner2 = new OASMembersToDeleteBodyMembersInner();

        System.assertEquals(membersToDeleteBodyMembersInner1.hashCode(), membersToDeleteBodyMembersInner1.hashCode());
        System.assertEquals(membersToDeleteBodyMembersInner2.hashCode(), membersToDeleteBodyMembersInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner1 = OASMembersToDeleteBodyMembersInner.getExample();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner2 = OASMembersToDeleteBodyMembersInner.getExample();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner3 = new OASMembersToDeleteBodyMembersInner();
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner4 = new OASMembersToDeleteBodyMembersInner();

        System.assert(membersToDeleteBodyMembersInner1.equals(membersToDeleteBodyMembersInner2));
        System.assert(membersToDeleteBodyMembersInner3.equals(membersToDeleteBodyMembersInner4));
        System.assertEquals(membersToDeleteBodyMembersInner1.hashCode(), membersToDeleteBodyMembersInner2.hashCode());
        System.assertEquals(membersToDeleteBodyMembersInner3.hashCode(), membersToDeleteBodyMembersInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner = new OASMembersToDeleteBodyMembersInner();
        Map<String, String> x-property-mappings = membersToDeleteBodyMembersInner.getx-property-mappings();
        System.assertEquals('memberId', x-property-mappings.get('member_id'));
        System.assertEquals('businessRole', x-property-mappings.get('business_role'));
    }
}
