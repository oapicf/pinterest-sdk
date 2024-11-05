@isTest
private class OASDeleteMemberAccessResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteMemberAccessResult deleteMemberAccessResult1 = OASDeleteMemberAccessResult.getExample();
        OASDeleteMemberAccessResult deleteMemberAccessResult2 = deleteMemberAccessResult1;
        OASDeleteMemberAccessResult deleteMemberAccessResult3 = new OASDeleteMemberAccessResult();
        OASDeleteMemberAccessResult deleteMemberAccessResult4 = deleteMemberAccessResult3;

        System.assert(deleteMemberAccessResult1.equals(deleteMemberAccessResult2));
        System.assert(deleteMemberAccessResult2.equals(deleteMemberAccessResult1));
        System.assert(deleteMemberAccessResult1.equals(deleteMemberAccessResult1));
        System.assert(deleteMemberAccessResult3.equals(deleteMemberAccessResult4));
        System.assert(deleteMemberAccessResult4.equals(deleteMemberAccessResult3));
        System.assert(deleteMemberAccessResult3.equals(deleteMemberAccessResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteMemberAccessResult deleteMemberAccessResult1 = OASDeleteMemberAccessResult.getExample();
        OASDeleteMemberAccessResult deleteMemberAccessResult2 = OASDeleteMemberAccessResult.getExample();
        OASDeleteMemberAccessResult deleteMemberAccessResult3 = new OASDeleteMemberAccessResult();
        OASDeleteMemberAccessResult deleteMemberAccessResult4 = new OASDeleteMemberAccessResult();

        System.assert(deleteMemberAccessResult1.equals(deleteMemberAccessResult2));
        System.assert(deleteMemberAccessResult2.equals(deleteMemberAccessResult1));
        System.assert(deleteMemberAccessResult3.equals(deleteMemberAccessResult4));
        System.assert(deleteMemberAccessResult4.equals(deleteMemberAccessResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteMemberAccessResult deleteMemberAccessResult1 = OASDeleteMemberAccessResult.getExample();
        OASDeleteMemberAccessResult deleteMemberAccessResult2 = new OASDeleteMemberAccessResult();

        System.assertEquals(false, deleteMemberAccessResult1.equals('foo'));
        System.assertEquals(false, deleteMemberAccessResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteMemberAccessResult deleteMemberAccessResult1 = OASDeleteMemberAccessResult.getExample();
        OASDeleteMemberAccessResult deleteMemberAccessResult2 = new OASDeleteMemberAccessResult();
        OASDeleteMemberAccessResult deleteMemberAccessResult3;

        System.assertEquals(false, deleteMemberAccessResult1.equals(deleteMemberAccessResult3));
        System.assertEquals(false, deleteMemberAccessResult2.equals(deleteMemberAccessResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteMemberAccessResult deleteMemberAccessResult1 = OASDeleteMemberAccessResult.getExample();
        OASDeleteMemberAccessResult deleteMemberAccessResult2 = new OASDeleteMemberAccessResult();

        System.assertEquals(deleteMemberAccessResult1.hashCode(), deleteMemberAccessResult1.hashCode());
        System.assertEquals(deleteMemberAccessResult2.hashCode(), deleteMemberAccessResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteMemberAccessResult deleteMemberAccessResult1 = OASDeleteMemberAccessResult.getExample();
        OASDeleteMemberAccessResult deleteMemberAccessResult2 = OASDeleteMemberAccessResult.getExample();
        OASDeleteMemberAccessResult deleteMemberAccessResult3 = new OASDeleteMemberAccessResult();
        OASDeleteMemberAccessResult deleteMemberAccessResult4 = new OASDeleteMemberAccessResult();

        System.assert(deleteMemberAccessResult1.equals(deleteMemberAccessResult2));
        System.assert(deleteMemberAccessResult3.equals(deleteMemberAccessResult4));
        System.assertEquals(deleteMemberAccessResult1.hashCode(), deleteMemberAccessResult2.hashCode());
        System.assertEquals(deleteMemberAccessResult3.hashCode(), deleteMemberAccessResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteMemberAccessResult deleteMemberAccessResult = new OASDeleteMemberAccessResult();
        Map<String, String> x-property-mappings = deleteMemberAccessResult.getx-property-mappings();
        System.assertEquals('assetId', x-property-mappings.get('asset_id'));
        System.assertEquals('memberId', x-property-mappings.get('member_id'));
    }
}
