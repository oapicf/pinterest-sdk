@isTest
private class OASUsersForIndividualAssetResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse1 = OASUsersForIndividualAssetResponse.getExample();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse2 = usersForIndividualAssetResponse1;
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse3 = new OASUsersForIndividualAssetResponse();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse4 = usersForIndividualAssetResponse3;

        System.assert(usersForIndividualAssetResponse1.equals(usersForIndividualAssetResponse2));
        System.assert(usersForIndividualAssetResponse2.equals(usersForIndividualAssetResponse1));
        System.assert(usersForIndividualAssetResponse1.equals(usersForIndividualAssetResponse1));
        System.assert(usersForIndividualAssetResponse3.equals(usersForIndividualAssetResponse4));
        System.assert(usersForIndividualAssetResponse4.equals(usersForIndividualAssetResponse3));
        System.assert(usersForIndividualAssetResponse3.equals(usersForIndividualAssetResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse1 = OASUsersForIndividualAssetResponse.getExample();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse2 = OASUsersForIndividualAssetResponse.getExample();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse3 = new OASUsersForIndividualAssetResponse();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse4 = new OASUsersForIndividualAssetResponse();

        System.assert(usersForIndividualAssetResponse1.equals(usersForIndividualAssetResponse2));
        System.assert(usersForIndividualAssetResponse2.equals(usersForIndividualAssetResponse1));
        System.assert(usersForIndividualAssetResponse3.equals(usersForIndividualAssetResponse4));
        System.assert(usersForIndividualAssetResponse4.equals(usersForIndividualAssetResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse1 = OASUsersForIndividualAssetResponse.getExample();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse2 = new OASUsersForIndividualAssetResponse();

        System.assertEquals(false, usersForIndividualAssetResponse1.equals('foo'));
        System.assertEquals(false, usersForIndividualAssetResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse1 = OASUsersForIndividualAssetResponse.getExample();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse2 = new OASUsersForIndividualAssetResponse();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse3;

        System.assertEquals(false, usersForIndividualAssetResponse1.equals(usersForIndividualAssetResponse3));
        System.assertEquals(false, usersForIndividualAssetResponse2.equals(usersForIndividualAssetResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse1 = OASUsersForIndividualAssetResponse.getExample();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse2 = new OASUsersForIndividualAssetResponse();

        System.assertEquals(usersForIndividualAssetResponse1.hashCode(), usersForIndividualAssetResponse1.hashCode());
        System.assertEquals(usersForIndividualAssetResponse2.hashCode(), usersForIndividualAssetResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse1 = OASUsersForIndividualAssetResponse.getExample();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse2 = OASUsersForIndividualAssetResponse.getExample();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse3 = new OASUsersForIndividualAssetResponse();
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse4 = new OASUsersForIndividualAssetResponse();

        System.assert(usersForIndividualAssetResponse1.equals(usersForIndividualAssetResponse2));
        System.assert(usersForIndividualAssetResponse3.equals(usersForIndividualAssetResponse4));
        System.assertEquals(usersForIndividualAssetResponse1.hashCode(), usersForIndividualAssetResponse2.hashCode());
        System.assertEquals(usersForIndividualAssetResponse3.hashCode(), usersForIndividualAssetResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse = new OASUsersForIndividualAssetResponse();
        Map<String, String> x-property-mappings = usersForIndividualAssetResponse.getx-property-mappings();
        System.assertEquals('assetId', x-property-mappings.get('asset_id'));
        System.assertEquals('memberId', x-property-mappings.get('member_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse = new OASUsersForIndividualAssetResponse();
        System.assertEquals(new List<String>(), usersForIndividualAssetResponse.permissions);
        System.assertEquals(null, usersForIndividualAssetResponse.assetId);
        System.assertEquals(null, usersForIndividualAssetResponse.memberId);
    }
}
