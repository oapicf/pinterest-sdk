@isTest
private class OASUpdateMemberResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateMemberResult updateMemberResult1 = OASUpdateMemberResult.getExample();
        OASUpdateMemberResult updateMemberResult2 = updateMemberResult1;
        OASUpdateMemberResult updateMemberResult3 = new OASUpdateMemberResult();
        OASUpdateMemberResult updateMemberResult4 = updateMemberResult3;

        System.assert(updateMemberResult1.equals(updateMemberResult2));
        System.assert(updateMemberResult2.equals(updateMemberResult1));
        System.assert(updateMemberResult1.equals(updateMemberResult1));
        System.assert(updateMemberResult3.equals(updateMemberResult4));
        System.assert(updateMemberResult4.equals(updateMemberResult3));
        System.assert(updateMemberResult3.equals(updateMemberResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateMemberResult updateMemberResult1 = OASUpdateMemberResult.getExample();
        OASUpdateMemberResult updateMemberResult2 = OASUpdateMemberResult.getExample();
        OASUpdateMemberResult updateMemberResult3 = new OASUpdateMemberResult();
        OASUpdateMemberResult updateMemberResult4 = new OASUpdateMemberResult();

        System.assert(updateMemberResult1.equals(updateMemberResult2));
        System.assert(updateMemberResult2.equals(updateMemberResult1));
        System.assert(updateMemberResult3.equals(updateMemberResult4));
        System.assert(updateMemberResult4.equals(updateMemberResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateMemberResult updateMemberResult1 = OASUpdateMemberResult.getExample();
        OASUpdateMemberResult updateMemberResult2 = new OASUpdateMemberResult();

        System.assertEquals(false, updateMemberResult1.equals('foo'));
        System.assertEquals(false, updateMemberResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateMemberResult updateMemberResult1 = OASUpdateMemberResult.getExample();
        OASUpdateMemberResult updateMemberResult2 = new OASUpdateMemberResult();
        OASUpdateMemberResult updateMemberResult3;

        System.assertEquals(false, updateMemberResult1.equals(updateMemberResult3));
        System.assertEquals(false, updateMemberResult2.equals(updateMemberResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateMemberResult updateMemberResult1 = OASUpdateMemberResult.getExample();
        OASUpdateMemberResult updateMemberResult2 = new OASUpdateMemberResult();

        System.assertEquals(updateMemberResult1.hashCode(), updateMemberResult1.hashCode());
        System.assertEquals(updateMemberResult2.hashCode(), updateMemberResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateMemberResult updateMemberResult1 = OASUpdateMemberResult.getExample();
        OASUpdateMemberResult updateMemberResult2 = OASUpdateMemberResult.getExample();
        OASUpdateMemberResult updateMemberResult3 = new OASUpdateMemberResult();
        OASUpdateMemberResult updateMemberResult4 = new OASUpdateMemberResult();

        System.assert(updateMemberResult1.equals(updateMemberResult2));
        System.assert(updateMemberResult3.equals(updateMemberResult4));
        System.assertEquals(updateMemberResult1.hashCode(), updateMemberResult2.hashCode());
        System.assertEquals(updateMemberResult3.hashCode(), updateMemberResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdateMemberResult updateMemberResult = new OASUpdateMemberResult();
        Map<String, String> x-property-mappings = updateMemberResult.getx-property-mappings();
        System.assertEquals('businessRole', x-property-mappings.get('business_role'));
        System.assertEquals('memberId', x-property-mappings.get('member_id'));
    }
}
