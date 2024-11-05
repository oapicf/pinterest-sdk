@isTest
private class OASCreateAssetInvitesRequestItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem1 = OASCreateAssetInvitesRequestItem.getExample();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem2 = createAssetInvitesRequestItem1;
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem3 = new OASCreateAssetInvitesRequestItem();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem4 = createAssetInvitesRequestItem3;

        System.assert(createAssetInvitesRequestItem1.equals(createAssetInvitesRequestItem2));
        System.assert(createAssetInvitesRequestItem2.equals(createAssetInvitesRequestItem1));
        System.assert(createAssetInvitesRequestItem1.equals(createAssetInvitesRequestItem1));
        System.assert(createAssetInvitesRequestItem3.equals(createAssetInvitesRequestItem4));
        System.assert(createAssetInvitesRequestItem4.equals(createAssetInvitesRequestItem3));
        System.assert(createAssetInvitesRequestItem3.equals(createAssetInvitesRequestItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem1 = OASCreateAssetInvitesRequestItem.getExample();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem2 = OASCreateAssetInvitesRequestItem.getExample();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem3 = new OASCreateAssetInvitesRequestItem();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem4 = new OASCreateAssetInvitesRequestItem();

        System.assert(createAssetInvitesRequestItem1.equals(createAssetInvitesRequestItem2));
        System.assert(createAssetInvitesRequestItem2.equals(createAssetInvitesRequestItem1));
        System.assert(createAssetInvitesRequestItem3.equals(createAssetInvitesRequestItem4));
        System.assert(createAssetInvitesRequestItem4.equals(createAssetInvitesRequestItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem1 = OASCreateAssetInvitesRequestItem.getExample();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem2 = new OASCreateAssetInvitesRequestItem();

        System.assertEquals(false, createAssetInvitesRequestItem1.equals('foo'));
        System.assertEquals(false, createAssetInvitesRequestItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem1 = OASCreateAssetInvitesRequestItem.getExample();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem2 = new OASCreateAssetInvitesRequestItem();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem3;

        System.assertEquals(false, createAssetInvitesRequestItem1.equals(createAssetInvitesRequestItem3));
        System.assertEquals(false, createAssetInvitesRequestItem2.equals(createAssetInvitesRequestItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem1 = OASCreateAssetInvitesRequestItem.getExample();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem2 = new OASCreateAssetInvitesRequestItem();

        System.assertEquals(createAssetInvitesRequestItem1.hashCode(), createAssetInvitesRequestItem1.hashCode());
        System.assertEquals(createAssetInvitesRequestItem2.hashCode(), createAssetInvitesRequestItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem1 = OASCreateAssetInvitesRequestItem.getExample();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem2 = OASCreateAssetInvitesRequestItem.getExample();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem3 = new OASCreateAssetInvitesRequestItem();
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem4 = new OASCreateAssetInvitesRequestItem();

        System.assert(createAssetInvitesRequestItem1.equals(createAssetInvitesRequestItem2));
        System.assert(createAssetInvitesRequestItem3.equals(createAssetInvitesRequestItem4));
        System.assertEquals(createAssetInvitesRequestItem1.hashCode(), createAssetInvitesRequestItem2.hashCode());
        System.assertEquals(createAssetInvitesRequestItem3.hashCode(), createAssetInvitesRequestItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem = new OASCreateAssetInvitesRequestItem();
        Map<String, String> x-property-mappings = createAssetInvitesRequestItem.getx-property-mappings();
        System.assertEquals('inviteId', x-property-mappings.get('invite_id'));
        System.assertEquals('inviteType', x-property-mappings.get('invite_type'));
        System.assertEquals('assetIdToPermissions', x-property-mappings.get('asset_id_to_permissions'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateAssetInvitesRequestItem createAssetInvitesRequestItem = new OASCreateAssetInvitesRequestItem();
        System.assertEquals(new Map<String, List<OASPermissions>>(), createAssetInvitesRequestItem.assetIdToPermissions);
        System.assertEquals(null, createAssetInvitesRequestItem.inviteId);
        System.assertEquals(null, createAssetInvitesRequestItem.inviteType);
    }
}
