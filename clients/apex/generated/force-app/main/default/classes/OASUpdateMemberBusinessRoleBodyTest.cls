@isTest
private class OASUpdateMemberBusinessRoleBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody1 = OASUpdateMemberBusinessRoleBody.getExample();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody2 = updateMemberBusinessRoleBody1;
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody3 = new OASUpdateMemberBusinessRoleBody();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody4 = updateMemberBusinessRoleBody3;

        System.assert(updateMemberBusinessRoleBody1.equals(updateMemberBusinessRoleBody2));
        System.assert(updateMemberBusinessRoleBody2.equals(updateMemberBusinessRoleBody1));
        System.assert(updateMemberBusinessRoleBody1.equals(updateMemberBusinessRoleBody1));
        System.assert(updateMemberBusinessRoleBody3.equals(updateMemberBusinessRoleBody4));
        System.assert(updateMemberBusinessRoleBody4.equals(updateMemberBusinessRoleBody3));
        System.assert(updateMemberBusinessRoleBody3.equals(updateMemberBusinessRoleBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody1 = OASUpdateMemberBusinessRoleBody.getExample();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody2 = OASUpdateMemberBusinessRoleBody.getExample();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody3 = new OASUpdateMemberBusinessRoleBody();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody4 = new OASUpdateMemberBusinessRoleBody();

        System.assert(updateMemberBusinessRoleBody1.equals(updateMemberBusinessRoleBody2));
        System.assert(updateMemberBusinessRoleBody2.equals(updateMemberBusinessRoleBody1));
        System.assert(updateMemberBusinessRoleBody3.equals(updateMemberBusinessRoleBody4));
        System.assert(updateMemberBusinessRoleBody4.equals(updateMemberBusinessRoleBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody1 = OASUpdateMemberBusinessRoleBody.getExample();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody2 = new OASUpdateMemberBusinessRoleBody();

        System.assertEquals(false, updateMemberBusinessRoleBody1.equals('foo'));
        System.assertEquals(false, updateMemberBusinessRoleBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody1 = OASUpdateMemberBusinessRoleBody.getExample();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody2 = new OASUpdateMemberBusinessRoleBody();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody3;

        System.assertEquals(false, updateMemberBusinessRoleBody1.equals(updateMemberBusinessRoleBody3));
        System.assertEquals(false, updateMemberBusinessRoleBody2.equals(updateMemberBusinessRoleBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody1 = OASUpdateMemberBusinessRoleBody.getExample();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody2 = new OASUpdateMemberBusinessRoleBody();

        System.assertEquals(updateMemberBusinessRoleBody1.hashCode(), updateMemberBusinessRoleBody1.hashCode());
        System.assertEquals(updateMemberBusinessRoleBody2.hashCode(), updateMemberBusinessRoleBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody1 = OASUpdateMemberBusinessRoleBody.getExample();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody2 = OASUpdateMemberBusinessRoleBody.getExample();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody3 = new OASUpdateMemberBusinessRoleBody();
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody4 = new OASUpdateMemberBusinessRoleBody();

        System.assert(updateMemberBusinessRoleBody1.equals(updateMemberBusinessRoleBody2));
        System.assert(updateMemberBusinessRoleBody3.equals(updateMemberBusinessRoleBody4));
        System.assertEquals(updateMemberBusinessRoleBody1.hashCode(), updateMemberBusinessRoleBody2.hashCode());
        System.assertEquals(updateMemberBusinessRoleBody3.hashCode(), updateMemberBusinessRoleBody4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdateMemberBusinessRoleBody updateMemberBusinessRoleBody = new OASUpdateMemberBusinessRoleBody();
        Map<String, String> x-property-mappings = updateMemberBusinessRoleBody.getx-property-mappings();
        System.assertEquals('businessRole', x-property-mappings.get('business_role'));
        System.assertEquals('memberId', x-property-mappings.get('member_id'));
    }
}
