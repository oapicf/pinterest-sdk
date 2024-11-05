@isTest
private class OASBusinessMemberAssetsGet200ResponsTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response1 = OASBusinessMemberAssetsGet200Respons.getExample();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response2 = businessMemberAssetsGet200Response1;
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response3 = new OASBusinessMemberAssetsGet200Respons();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response4 = businessMemberAssetsGet200Response3;

        System.assert(businessMemberAssetsGet200Response1.equals(businessMemberAssetsGet200Response2));
        System.assert(businessMemberAssetsGet200Response2.equals(businessMemberAssetsGet200Response1));
        System.assert(businessMemberAssetsGet200Response1.equals(businessMemberAssetsGet200Response1));
        System.assert(businessMemberAssetsGet200Response3.equals(businessMemberAssetsGet200Response4));
        System.assert(businessMemberAssetsGet200Response4.equals(businessMemberAssetsGet200Response3));
        System.assert(businessMemberAssetsGet200Response3.equals(businessMemberAssetsGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response1 = OASBusinessMemberAssetsGet200Respons.getExample();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response2 = OASBusinessMemberAssetsGet200Respons.getExample();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response3 = new OASBusinessMemberAssetsGet200Respons();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response4 = new OASBusinessMemberAssetsGet200Respons();

        System.assert(businessMemberAssetsGet200Response1.equals(businessMemberAssetsGet200Response2));
        System.assert(businessMemberAssetsGet200Response2.equals(businessMemberAssetsGet200Response1));
        System.assert(businessMemberAssetsGet200Response3.equals(businessMemberAssetsGet200Response4));
        System.assert(businessMemberAssetsGet200Response4.equals(businessMemberAssetsGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response1 = OASBusinessMemberAssetsGet200Respons.getExample();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response2 = new OASBusinessMemberAssetsGet200Respons();

        System.assertEquals(false, businessMemberAssetsGet200Response1.equals('foo'));
        System.assertEquals(false, businessMemberAssetsGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response1 = OASBusinessMemberAssetsGet200Respons.getExample();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response2 = new OASBusinessMemberAssetsGet200Respons();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response3;

        System.assertEquals(false, businessMemberAssetsGet200Response1.equals(businessMemberAssetsGet200Response3));
        System.assertEquals(false, businessMemberAssetsGet200Response2.equals(businessMemberAssetsGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response1 = OASBusinessMemberAssetsGet200Respons.getExample();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response2 = new OASBusinessMemberAssetsGet200Respons();

        System.assertEquals(businessMemberAssetsGet200Response1.hashCode(), businessMemberAssetsGet200Response1.hashCode());
        System.assertEquals(businessMemberAssetsGet200Response2.hashCode(), businessMemberAssetsGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response1 = OASBusinessMemberAssetsGet200Respons.getExample();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response2 = OASBusinessMemberAssetsGet200Respons.getExample();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response3 = new OASBusinessMemberAssetsGet200Respons();
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response4 = new OASBusinessMemberAssetsGet200Respons();

        System.assert(businessMemberAssetsGet200Response1.equals(businessMemberAssetsGet200Response2));
        System.assert(businessMemberAssetsGet200Response3.equals(businessMemberAssetsGet200Response4));
        System.assertEquals(businessMemberAssetsGet200Response1.hashCode(), businessMemberAssetsGet200Response2.hashCode());
        System.assertEquals(businessMemberAssetsGet200Response3.hashCode(), businessMemberAssetsGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBusinessMemberAssetsGet200Respons businessMemberAssetsGet200Response = new OASBusinessMemberAssetsGet200Respons();
        System.assertEquals(new List<OASAssetIdPermissions>(), businessMemberAssetsGet200Response.items);
        System.assertEquals(null, businessMemberAssetsGet200Response.bookmark);
    }
}
