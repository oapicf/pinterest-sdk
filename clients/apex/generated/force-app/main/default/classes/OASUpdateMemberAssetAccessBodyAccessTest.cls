@isTest
private class OASUpdateMemberAssetAccessBodyAccessTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner1 = OASUpdateMemberAssetAccessBodyAccess.getExample();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner2 = updateMemberAssetAccessBodyAccessesInner1;
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner3 = new OASUpdateMemberAssetAccessBodyAccess();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner4 = updateMemberAssetAccessBodyAccessesInner3;

        System.assert(updateMemberAssetAccessBodyAccessesInner1.equals(updateMemberAssetAccessBodyAccessesInner2));
        System.assert(updateMemberAssetAccessBodyAccessesInner2.equals(updateMemberAssetAccessBodyAccessesInner1));
        System.assert(updateMemberAssetAccessBodyAccessesInner1.equals(updateMemberAssetAccessBodyAccessesInner1));
        System.assert(updateMemberAssetAccessBodyAccessesInner3.equals(updateMemberAssetAccessBodyAccessesInner4));
        System.assert(updateMemberAssetAccessBodyAccessesInner4.equals(updateMemberAssetAccessBodyAccessesInner3));
        System.assert(updateMemberAssetAccessBodyAccessesInner3.equals(updateMemberAssetAccessBodyAccessesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner1 = OASUpdateMemberAssetAccessBodyAccess.getExample();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner2 = OASUpdateMemberAssetAccessBodyAccess.getExample();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner3 = new OASUpdateMemberAssetAccessBodyAccess();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner4 = new OASUpdateMemberAssetAccessBodyAccess();

        System.assert(updateMemberAssetAccessBodyAccessesInner1.equals(updateMemberAssetAccessBodyAccessesInner2));
        System.assert(updateMemberAssetAccessBodyAccessesInner2.equals(updateMemberAssetAccessBodyAccessesInner1));
        System.assert(updateMemberAssetAccessBodyAccessesInner3.equals(updateMemberAssetAccessBodyAccessesInner4));
        System.assert(updateMemberAssetAccessBodyAccessesInner4.equals(updateMemberAssetAccessBodyAccessesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner1 = OASUpdateMemberAssetAccessBodyAccess.getExample();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner2 = new OASUpdateMemberAssetAccessBodyAccess();

        System.assertEquals(false, updateMemberAssetAccessBodyAccessesInner1.equals('foo'));
        System.assertEquals(false, updateMemberAssetAccessBodyAccessesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner1 = OASUpdateMemberAssetAccessBodyAccess.getExample();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner2 = new OASUpdateMemberAssetAccessBodyAccess();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner3;

        System.assertEquals(false, updateMemberAssetAccessBodyAccessesInner1.equals(updateMemberAssetAccessBodyAccessesInner3));
        System.assertEquals(false, updateMemberAssetAccessBodyAccessesInner2.equals(updateMemberAssetAccessBodyAccessesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner1 = OASUpdateMemberAssetAccessBodyAccess.getExample();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner2 = new OASUpdateMemberAssetAccessBodyAccess();

        System.assertEquals(updateMemberAssetAccessBodyAccessesInner1.hashCode(), updateMemberAssetAccessBodyAccessesInner1.hashCode());
        System.assertEquals(updateMemberAssetAccessBodyAccessesInner2.hashCode(), updateMemberAssetAccessBodyAccessesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner1 = OASUpdateMemberAssetAccessBodyAccess.getExample();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner2 = OASUpdateMemberAssetAccessBodyAccess.getExample();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner3 = new OASUpdateMemberAssetAccessBodyAccess();
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner4 = new OASUpdateMemberAssetAccessBodyAccess();

        System.assert(updateMemberAssetAccessBodyAccessesInner1.equals(updateMemberAssetAccessBodyAccessesInner2));
        System.assert(updateMemberAssetAccessBodyAccessesInner3.equals(updateMemberAssetAccessBodyAccessesInner4));
        System.assertEquals(updateMemberAssetAccessBodyAccessesInner1.hashCode(), updateMemberAssetAccessBodyAccessesInner2.hashCode());
        System.assertEquals(updateMemberAssetAccessBodyAccessesInner3.hashCode(), updateMemberAssetAccessBodyAccessesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner = new OASUpdateMemberAssetAccessBodyAccess();
        Map<String, String> x-property-mappings = updateMemberAssetAccessBodyAccessesInner.getx-property-mappings();
        System.assertEquals('assetId', x-property-mappings.get('asset_id'));
        System.assertEquals('memberId', x-property-mappings.get('member_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateMemberAssetAccessBodyAccess updateMemberAssetAccessBodyAccessesInner = new OASUpdateMemberAssetAccessBodyAccess();
        System.assertEquals(new List<OASPermissions>(), updateMemberAssetAccessBodyAccessesInner.permissions);
        System.assertEquals(null, updateMemberAssetAccessBodyAccessesInner.assetId);
        System.assertEquals(null, updateMemberAssetAccessBodyAccessesInner.memberId);
    }
}
