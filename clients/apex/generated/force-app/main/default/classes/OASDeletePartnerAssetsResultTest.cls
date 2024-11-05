@isTest
private class OASDeletePartnerAssetsResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeletePartnerAssetsResult deletePartnerAssetsResult1 = OASDeletePartnerAssetsResult.getExample();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult2 = deletePartnerAssetsResult1;
        OASDeletePartnerAssetsResult deletePartnerAssetsResult3 = new OASDeletePartnerAssetsResult();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult4 = deletePartnerAssetsResult3;

        System.assert(deletePartnerAssetsResult1.equals(deletePartnerAssetsResult2));
        System.assert(deletePartnerAssetsResult2.equals(deletePartnerAssetsResult1));
        System.assert(deletePartnerAssetsResult1.equals(deletePartnerAssetsResult1));
        System.assert(deletePartnerAssetsResult3.equals(deletePartnerAssetsResult4));
        System.assert(deletePartnerAssetsResult4.equals(deletePartnerAssetsResult3));
        System.assert(deletePartnerAssetsResult3.equals(deletePartnerAssetsResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeletePartnerAssetsResult deletePartnerAssetsResult1 = OASDeletePartnerAssetsResult.getExample();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult2 = OASDeletePartnerAssetsResult.getExample();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult3 = new OASDeletePartnerAssetsResult();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult4 = new OASDeletePartnerAssetsResult();

        System.assert(deletePartnerAssetsResult1.equals(deletePartnerAssetsResult2));
        System.assert(deletePartnerAssetsResult2.equals(deletePartnerAssetsResult1));
        System.assert(deletePartnerAssetsResult3.equals(deletePartnerAssetsResult4));
        System.assert(deletePartnerAssetsResult4.equals(deletePartnerAssetsResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeletePartnerAssetsResult deletePartnerAssetsResult1 = OASDeletePartnerAssetsResult.getExample();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult2 = new OASDeletePartnerAssetsResult();

        System.assertEquals(false, deletePartnerAssetsResult1.equals('foo'));
        System.assertEquals(false, deletePartnerAssetsResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeletePartnerAssetsResult deletePartnerAssetsResult1 = OASDeletePartnerAssetsResult.getExample();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult2 = new OASDeletePartnerAssetsResult();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult3;

        System.assertEquals(false, deletePartnerAssetsResult1.equals(deletePartnerAssetsResult3));
        System.assertEquals(false, deletePartnerAssetsResult2.equals(deletePartnerAssetsResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeletePartnerAssetsResult deletePartnerAssetsResult1 = OASDeletePartnerAssetsResult.getExample();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult2 = new OASDeletePartnerAssetsResult();

        System.assertEquals(deletePartnerAssetsResult1.hashCode(), deletePartnerAssetsResult1.hashCode());
        System.assertEquals(deletePartnerAssetsResult2.hashCode(), deletePartnerAssetsResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeletePartnerAssetsResult deletePartnerAssetsResult1 = OASDeletePartnerAssetsResult.getExample();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult2 = OASDeletePartnerAssetsResult.getExample();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult3 = new OASDeletePartnerAssetsResult();
        OASDeletePartnerAssetsResult deletePartnerAssetsResult4 = new OASDeletePartnerAssetsResult();

        System.assert(deletePartnerAssetsResult1.equals(deletePartnerAssetsResult2));
        System.assert(deletePartnerAssetsResult3.equals(deletePartnerAssetsResult4));
        System.assertEquals(deletePartnerAssetsResult1.hashCode(), deletePartnerAssetsResult2.hashCode());
        System.assertEquals(deletePartnerAssetsResult3.hashCode(), deletePartnerAssetsResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeletePartnerAssetsResult deletePartnerAssetsResult = new OASDeletePartnerAssetsResult();
        Map<String, String> x-property-mappings = deletePartnerAssetsResult.getx-property-mappings();
        System.assertEquals('assetId', x-property-mappings.get('asset_id'));
        System.assertEquals('assetType', x-property-mappings.get('asset_type'));
        System.assertEquals('isSharedPartner', x-property-mappings.get('is_shared_partner'));
        System.assertEquals('partnerId', x-property-mappings.get('partner_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeletePartnerAssetsResult deletePartnerAssetsResult = new OASDeletePartnerAssetsResult();
        System.assertEquals(new List<String>(), deletePartnerAssetsResult.permissions);
        System.assertEquals(null, deletePartnerAssetsResult.assetId);
        System.assertEquals(null, deletePartnerAssetsResult.assetType);
        System.assertEquals(null, deletePartnerAssetsResult.isSharedPartner);
        System.assertEquals(null, deletePartnerAssetsResult.partnerId);
    }
}
