@isTest
private class OASDeletePartnerAssetAccessBodyAccesTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner1 = OASDeletePartnerAssetAccessBodyAcces.getExample();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner2 = deletePartnerAssetAccessBodyAccessesInner1;
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner3 = new OASDeletePartnerAssetAccessBodyAcces();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner4 = deletePartnerAssetAccessBodyAccessesInner3;

        System.assert(deletePartnerAssetAccessBodyAccessesInner1.equals(deletePartnerAssetAccessBodyAccessesInner2));
        System.assert(deletePartnerAssetAccessBodyAccessesInner2.equals(deletePartnerAssetAccessBodyAccessesInner1));
        System.assert(deletePartnerAssetAccessBodyAccessesInner1.equals(deletePartnerAssetAccessBodyAccessesInner1));
        System.assert(deletePartnerAssetAccessBodyAccessesInner3.equals(deletePartnerAssetAccessBodyAccessesInner4));
        System.assert(deletePartnerAssetAccessBodyAccessesInner4.equals(deletePartnerAssetAccessBodyAccessesInner3));
        System.assert(deletePartnerAssetAccessBodyAccessesInner3.equals(deletePartnerAssetAccessBodyAccessesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner1 = OASDeletePartnerAssetAccessBodyAcces.getExample();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner2 = OASDeletePartnerAssetAccessBodyAcces.getExample();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner3 = new OASDeletePartnerAssetAccessBodyAcces();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner4 = new OASDeletePartnerAssetAccessBodyAcces();

        System.assert(deletePartnerAssetAccessBodyAccessesInner1.equals(deletePartnerAssetAccessBodyAccessesInner2));
        System.assert(deletePartnerAssetAccessBodyAccessesInner2.equals(deletePartnerAssetAccessBodyAccessesInner1));
        System.assert(deletePartnerAssetAccessBodyAccessesInner3.equals(deletePartnerAssetAccessBodyAccessesInner4));
        System.assert(deletePartnerAssetAccessBodyAccessesInner4.equals(deletePartnerAssetAccessBodyAccessesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner1 = OASDeletePartnerAssetAccessBodyAcces.getExample();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner2 = new OASDeletePartnerAssetAccessBodyAcces();

        System.assertEquals(false, deletePartnerAssetAccessBodyAccessesInner1.equals('foo'));
        System.assertEquals(false, deletePartnerAssetAccessBodyAccessesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner1 = OASDeletePartnerAssetAccessBodyAcces.getExample();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner2 = new OASDeletePartnerAssetAccessBodyAcces();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner3;

        System.assertEquals(false, deletePartnerAssetAccessBodyAccessesInner1.equals(deletePartnerAssetAccessBodyAccessesInner3));
        System.assertEquals(false, deletePartnerAssetAccessBodyAccessesInner2.equals(deletePartnerAssetAccessBodyAccessesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner1 = OASDeletePartnerAssetAccessBodyAcces.getExample();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner2 = new OASDeletePartnerAssetAccessBodyAcces();

        System.assertEquals(deletePartnerAssetAccessBodyAccessesInner1.hashCode(), deletePartnerAssetAccessBodyAccessesInner1.hashCode());
        System.assertEquals(deletePartnerAssetAccessBodyAccessesInner2.hashCode(), deletePartnerAssetAccessBodyAccessesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner1 = OASDeletePartnerAssetAccessBodyAcces.getExample();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner2 = OASDeletePartnerAssetAccessBodyAcces.getExample();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner3 = new OASDeletePartnerAssetAccessBodyAcces();
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner4 = new OASDeletePartnerAssetAccessBodyAcces();

        System.assert(deletePartnerAssetAccessBodyAccessesInner1.equals(deletePartnerAssetAccessBodyAccessesInner2));
        System.assert(deletePartnerAssetAccessBodyAccessesInner3.equals(deletePartnerAssetAccessBodyAccessesInner4));
        System.assertEquals(deletePartnerAssetAccessBodyAccessesInner1.hashCode(), deletePartnerAssetAccessBodyAccessesInner2.hashCode());
        System.assertEquals(deletePartnerAssetAccessBodyAccessesInner3.hashCode(), deletePartnerAssetAccessBodyAccessesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner = new OASDeletePartnerAssetAccessBodyAcces();
        Map<String, String> x-property-mappings = deletePartnerAssetAccessBodyAccessesInner.getx-property-mappings();
        System.assertEquals('partnerId', x-property-mappings.get('partner_id'));
        System.assertEquals('assetId', x-property-mappings.get('asset_id'));
        System.assertEquals('partnerType', x-property-mappings.get('partner_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner = new OASDeletePartnerAssetAccessBodyAcces();
        System.assertEquals(PartnerTypeEnum.INTERNAL, deletePartnerAssetAccessBodyAccessesInner.partnerType);
        System.assertEquals(null, deletePartnerAssetAccessBodyAccessesInner.partnerId);
        System.assertEquals(null, deletePartnerAssetAccessBodyAccessesInner.assetId);
    }
}
