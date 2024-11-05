@isTest
private class OASUpdatePartnerAssetAccessBodyAccesTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner1 = OASUpdatePartnerAssetAccessBodyAcces.getExample();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner2 = updatePartnerAssetAccessBodyAccessesInner1;
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner3 = new OASUpdatePartnerAssetAccessBodyAcces();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner4 = updatePartnerAssetAccessBodyAccessesInner3;

        System.assert(updatePartnerAssetAccessBodyAccessesInner1.equals(updatePartnerAssetAccessBodyAccessesInner2));
        System.assert(updatePartnerAssetAccessBodyAccessesInner2.equals(updatePartnerAssetAccessBodyAccessesInner1));
        System.assert(updatePartnerAssetAccessBodyAccessesInner1.equals(updatePartnerAssetAccessBodyAccessesInner1));
        System.assert(updatePartnerAssetAccessBodyAccessesInner3.equals(updatePartnerAssetAccessBodyAccessesInner4));
        System.assert(updatePartnerAssetAccessBodyAccessesInner4.equals(updatePartnerAssetAccessBodyAccessesInner3));
        System.assert(updatePartnerAssetAccessBodyAccessesInner3.equals(updatePartnerAssetAccessBodyAccessesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner1 = OASUpdatePartnerAssetAccessBodyAcces.getExample();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner2 = OASUpdatePartnerAssetAccessBodyAcces.getExample();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner3 = new OASUpdatePartnerAssetAccessBodyAcces();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner4 = new OASUpdatePartnerAssetAccessBodyAcces();

        System.assert(updatePartnerAssetAccessBodyAccessesInner1.equals(updatePartnerAssetAccessBodyAccessesInner2));
        System.assert(updatePartnerAssetAccessBodyAccessesInner2.equals(updatePartnerAssetAccessBodyAccessesInner1));
        System.assert(updatePartnerAssetAccessBodyAccessesInner3.equals(updatePartnerAssetAccessBodyAccessesInner4));
        System.assert(updatePartnerAssetAccessBodyAccessesInner4.equals(updatePartnerAssetAccessBodyAccessesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner1 = OASUpdatePartnerAssetAccessBodyAcces.getExample();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner2 = new OASUpdatePartnerAssetAccessBodyAcces();

        System.assertEquals(false, updatePartnerAssetAccessBodyAccessesInner1.equals('foo'));
        System.assertEquals(false, updatePartnerAssetAccessBodyAccessesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner1 = OASUpdatePartnerAssetAccessBodyAcces.getExample();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner2 = new OASUpdatePartnerAssetAccessBodyAcces();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner3;

        System.assertEquals(false, updatePartnerAssetAccessBodyAccessesInner1.equals(updatePartnerAssetAccessBodyAccessesInner3));
        System.assertEquals(false, updatePartnerAssetAccessBodyAccessesInner2.equals(updatePartnerAssetAccessBodyAccessesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner1 = OASUpdatePartnerAssetAccessBodyAcces.getExample();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner2 = new OASUpdatePartnerAssetAccessBodyAcces();

        System.assertEquals(updatePartnerAssetAccessBodyAccessesInner1.hashCode(), updatePartnerAssetAccessBodyAccessesInner1.hashCode());
        System.assertEquals(updatePartnerAssetAccessBodyAccessesInner2.hashCode(), updatePartnerAssetAccessBodyAccessesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner1 = OASUpdatePartnerAssetAccessBodyAcces.getExample();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner2 = OASUpdatePartnerAssetAccessBodyAcces.getExample();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner3 = new OASUpdatePartnerAssetAccessBodyAcces();
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner4 = new OASUpdatePartnerAssetAccessBodyAcces();

        System.assert(updatePartnerAssetAccessBodyAccessesInner1.equals(updatePartnerAssetAccessBodyAccessesInner2));
        System.assert(updatePartnerAssetAccessBodyAccessesInner3.equals(updatePartnerAssetAccessBodyAccessesInner4));
        System.assertEquals(updatePartnerAssetAccessBodyAccessesInner1.hashCode(), updatePartnerAssetAccessBodyAccessesInner2.hashCode());
        System.assertEquals(updatePartnerAssetAccessBodyAccessesInner3.hashCode(), updatePartnerAssetAccessBodyAccessesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner = new OASUpdatePartnerAssetAccessBodyAcces();
        Map<String, String> x-property-mappings = updatePartnerAssetAccessBodyAccessesInner.getx-property-mappings();
        System.assertEquals('partnerId', x-property-mappings.get('partner_id'));
        System.assertEquals('assetId', x-property-mappings.get('asset_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdatePartnerAssetAccessBodyAcces updatePartnerAssetAccessBodyAccessesInner = new OASUpdatePartnerAssetAccessBodyAcces();
        System.assertEquals(new List<OASPermissions>(), updatePartnerAssetAccessBodyAccessesInner.permissions);
        System.assertEquals(null, updatePartnerAssetAccessBodyAccessesInner.partnerId);
        System.assertEquals(null, updatePartnerAssetAccessBodyAccessesInner.assetId);
    }
}
