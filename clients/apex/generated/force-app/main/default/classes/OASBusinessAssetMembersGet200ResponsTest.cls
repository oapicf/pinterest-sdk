@isTest
private class OASBusinessAssetMembersGet200ResponsTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response1 = OASBusinessAssetMembersGet200Respons.getExample();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response2 = businessAssetMembersGet200Response1;
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response3 = new OASBusinessAssetMembersGet200Respons();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response4 = businessAssetMembersGet200Response3;

        System.assert(businessAssetMembersGet200Response1.equals(businessAssetMembersGet200Response2));
        System.assert(businessAssetMembersGet200Response2.equals(businessAssetMembersGet200Response1));
        System.assert(businessAssetMembersGet200Response1.equals(businessAssetMembersGet200Response1));
        System.assert(businessAssetMembersGet200Response3.equals(businessAssetMembersGet200Response4));
        System.assert(businessAssetMembersGet200Response4.equals(businessAssetMembersGet200Response3));
        System.assert(businessAssetMembersGet200Response3.equals(businessAssetMembersGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response1 = OASBusinessAssetMembersGet200Respons.getExample();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response2 = OASBusinessAssetMembersGet200Respons.getExample();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response3 = new OASBusinessAssetMembersGet200Respons();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response4 = new OASBusinessAssetMembersGet200Respons();

        System.assert(businessAssetMembersGet200Response1.equals(businessAssetMembersGet200Response2));
        System.assert(businessAssetMembersGet200Response2.equals(businessAssetMembersGet200Response1));
        System.assert(businessAssetMembersGet200Response3.equals(businessAssetMembersGet200Response4));
        System.assert(businessAssetMembersGet200Response4.equals(businessAssetMembersGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response1 = OASBusinessAssetMembersGet200Respons.getExample();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response2 = new OASBusinessAssetMembersGet200Respons();

        System.assertEquals(false, businessAssetMembersGet200Response1.equals('foo'));
        System.assertEquals(false, businessAssetMembersGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response1 = OASBusinessAssetMembersGet200Respons.getExample();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response2 = new OASBusinessAssetMembersGet200Respons();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response3;

        System.assertEquals(false, businessAssetMembersGet200Response1.equals(businessAssetMembersGet200Response3));
        System.assertEquals(false, businessAssetMembersGet200Response2.equals(businessAssetMembersGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response1 = OASBusinessAssetMembersGet200Respons.getExample();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response2 = new OASBusinessAssetMembersGet200Respons();

        System.assertEquals(businessAssetMembersGet200Response1.hashCode(), businessAssetMembersGet200Response1.hashCode());
        System.assertEquals(businessAssetMembersGet200Response2.hashCode(), businessAssetMembersGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response1 = OASBusinessAssetMembersGet200Respons.getExample();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response2 = OASBusinessAssetMembersGet200Respons.getExample();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response3 = new OASBusinessAssetMembersGet200Respons();
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response4 = new OASBusinessAssetMembersGet200Respons();

        System.assert(businessAssetMembersGet200Response1.equals(businessAssetMembersGet200Response2));
        System.assert(businessAssetMembersGet200Response3.equals(businessAssetMembersGet200Response4));
        System.assertEquals(businessAssetMembersGet200Response1.hashCode(), businessAssetMembersGet200Response2.hashCode());
        System.assertEquals(businessAssetMembersGet200Response3.hashCode(), businessAssetMembersGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBusinessAssetMembersGet200Respons businessAssetMembersGet200Response = new OASBusinessAssetMembersGet200Respons();
        System.assertEquals(new List<OASUserSingleAssetBinding>(), businessAssetMembersGet200Response.items);
        System.assertEquals(null, businessAssetMembersGet200Response.bookmark);
    }
}
