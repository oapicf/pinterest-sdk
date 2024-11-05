@isTest
private class OASBusinessPartnerAssetAccessGet200RTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response1 = OASBusinessPartnerAssetAccessGet200R.getExample();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response2 = businessPartnerAssetAccessGet200Response1;
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response3 = new OASBusinessPartnerAssetAccessGet200R();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response4 = businessPartnerAssetAccessGet200Response3;

        System.assert(businessPartnerAssetAccessGet200Response1.equals(businessPartnerAssetAccessGet200Response2));
        System.assert(businessPartnerAssetAccessGet200Response2.equals(businessPartnerAssetAccessGet200Response1));
        System.assert(businessPartnerAssetAccessGet200Response1.equals(businessPartnerAssetAccessGet200Response1));
        System.assert(businessPartnerAssetAccessGet200Response3.equals(businessPartnerAssetAccessGet200Response4));
        System.assert(businessPartnerAssetAccessGet200Response4.equals(businessPartnerAssetAccessGet200Response3));
        System.assert(businessPartnerAssetAccessGet200Response3.equals(businessPartnerAssetAccessGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response1 = OASBusinessPartnerAssetAccessGet200R.getExample();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response2 = OASBusinessPartnerAssetAccessGet200R.getExample();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response3 = new OASBusinessPartnerAssetAccessGet200R();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response4 = new OASBusinessPartnerAssetAccessGet200R();

        System.assert(businessPartnerAssetAccessGet200Response1.equals(businessPartnerAssetAccessGet200Response2));
        System.assert(businessPartnerAssetAccessGet200Response2.equals(businessPartnerAssetAccessGet200Response1));
        System.assert(businessPartnerAssetAccessGet200Response3.equals(businessPartnerAssetAccessGet200Response4));
        System.assert(businessPartnerAssetAccessGet200Response4.equals(businessPartnerAssetAccessGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response1 = OASBusinessPartnerAssetAccessGet200R.getExample();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response2 = new OASBusinessPartnerAssetAccessGet200R();

        System.assertEquals(false, businessPartnerAssetAccessGet200Response1.equals('foo'));
        System.assertEquals(false, businessPartnerAssetAccessGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response1 = OASBusinessPartnerAssetAccessGet200R.getExample();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response2 = new OASBusinessPartnerAssetAccessGet200R();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response3;

        System.assertEquals(false, businessPartnerAssetAccessGet200Response1.equals(businessPartnerAssetAccessGet200Response3));
        System.assertEquals(false, businessPartnerAssetAccessGet200Response2.equals(businessPartnerAssetAccessGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response1 = OASBusinessPartnerAssetAccessGet200R.getExample();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response2 = new OASBusinessPartnerAssetAccessGet200R();

        System.assertEquals(businessPartnerAssetAccessGet200Response1.hashCode(), businessPartnerAssetAccessGet200Response1.hashCode());
        System.assertEquals(businessPartnerAssetAccessGet200Response2.hashCode(), businessPartnerAssetAccessGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response1 = OASBusinessPartnerAssetAccessGet200R.getExample();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response2 = OASBusinessPartnerAssetAccessGet200R.getExample();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response3 = new OASBusinessPartnerAssetAccessGet200R();
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response4 = new OASBusinessPartnerAssetAccessGet200R();

        System.assert(businessPartnerAssetAccessGet200Response1.equals(businessPartnerAssetAccessGet200Response2));
        System.assert(businessPartnerAssetAccessGet200Response3.equals(businessPartnerAssetAccessGet200Response4));
        System.assertEquals(businessPartnerAssetAccessGet200Response1.hashCode(), businessPartnerAssetAccessGet200Response2.hashCode());
        System.assertEquals(businessPartnerAssetAccessGet200Response3.hashCode(), businessPartnerAssetAccessGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBusinessPartnerAssetAccessGet200R businessPartnerAssetAccessGet200Response = new OASBusinessPartnerAssetAccessGet200R();
        System.assertEquals(new List<OASGetPartnerAssetsResponse>(), businessPartnerAssetAccessGet200Response.items);
        System.assertEquals(null, businessPartnerAssetAccessGet200Response.bookmark);
    }
}
