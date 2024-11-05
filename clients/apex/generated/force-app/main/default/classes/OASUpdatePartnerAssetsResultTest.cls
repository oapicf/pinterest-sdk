@isTest
private class OASUpdatePartnerAssetsResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult1 = OASUpdatePartnerAssetsResult.getExample();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult2 = updatePartnerAssetsResult1;
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult3 = new OASUpdatePartnerAssetsResult();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult4 = updatePartnerAssetsResult3;

        System.assert(updatePartnerAssetsResult1.equals(updatePartnerAssetsResult2));
        System.assert(updatePartnerAssetsResult2.equals(updatePartnerAssetsResult1));
        System.assert(updatePartnerAssetsResult1.equals(updatePartnerAssetsResult1));
        System.assert(updatePartnerAssetsResult3.equals(updatePartnerAssetsResult4));
        System.assert(updatePartnerAssetsResult4.equals(updatePartnerAssetsResult3));
        System.assert(updatePartnerAssetsResult3.equals(updatePartnerAssetsResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult1 = OASUpdatePartnerAssetsResult.getExample();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult2 = OASUpdatePartnerAssetsResult.getExample();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult3 = new OASUpdatePartnerAssetsResult();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult4 = new OASUpdatePartnerAssetsResult();

        System.assert(updatePartnerAssetsResult1.equals(updatePartnerAssetsResult2));
        System.assert(updatePartnerAssetsResult2.equals(updatePartnerAssetsResult1));
        System.assert(updatePartnerAssetsResult3.equals(updatePartnerAssetsResult4));
        System.assert(updatePartnerAssetsResult4.equals(updatePartnerAssetsResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult1 = OASUpdatePartnerAssetsResult.getExample();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult2 = new OASUpdatePartnerAssetsResult();

        System.assertEquals(false, updatePartnerAssetsResult1.equals('foo'));
        System.assertEquals(false, updatePartnerAssetsResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult1 = OASUpdatePartnerAssetsResult.getExample();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult2 = new OASUpdatePartnerAssetsResult();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult3;

        System.assertEquals(false, updatePartnerAssetsResult1.equals(updatePartnerAssetsResult3));
        System.assertEquals(false, updatePartnerAssetsResult2.equals(updatePartnerAssetsResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult1 = OASUpdatePartnerAssetsResult.getExample();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult2 = new OASUpdatePartnerAssetsResult();

        System.assertEquals(updatePartnerAssetsResult1.hashCode(), updatePartnerAssetsResult1.hashCode());
        System.assertEquals(updatePartnerAssetsResult2.hashCode(), updatePartnerAssetsResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult1 = OASUpdatePartnerAssetsResult.getExample();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult2 = OASUpdatePartnerAssetsResult.getExample();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult3 = new OASUpdatePartnerAssetsResult();
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult4 = new OASUpdatePartnerAssetsResult();

        System.assert(updatePartnerAssetsResult1.equals(updatePartnerAssetsResult2));
        System.assert(updatePartnerAssetsResult3.equals(updatePartnerAssetsResult4));
        System.assertEquals(updatePartnerAssetsResult1.hashCode(), updatePartnerAssetsResult2.hashCode());
        System.assertEquals(updatePartnerAssetsResult3.hashCode(), updatePartnerAssetsResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult = new OASUpdatePartnerAssetsResult();
        Map<String, String> x-property-mappings = updatePartnerAssetsResult.getx-property-mappings();
        System.assertEquals('assetId', x-property-mappings.get('asset_id'));
        System.assertEquals('assetType', x-property-mappings.get('asset_type'));
        System.assertEquals('partnerId', x-property-mappings.get('partner_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdatePartnerAssetsResult updatePartnerAssetsResult = new OASUpdatePartnerAssetsResult();
        System.assertEquals(new List<String>(), updatePartnerAssetsResult.permissions);
        System.assertEquals(null, updatePartnerAssetsResult.assetId);
        System.assertEquals(null, updatePartnerAssetsResult.assetType);
        System.assertEquals(null, updatePartnerAssetsResult.partnerId);
    }
}
