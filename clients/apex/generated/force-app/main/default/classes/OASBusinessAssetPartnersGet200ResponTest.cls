@isTest
private class OASBusinessAssetPartnersGet200ResponTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response1 = OASBusinessAssetPartnersGet200Respon.getExample();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response2 = businessAssetPartnersGet200Response1;
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response3 = new OASBusinessAssetPartnersGet200Respon();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response4 = businessAssetPartnersGet200Response3;

        System.assert(businessAssetPartnersGet200Response1.equals(businessAssetPartnersGet200Response2));
        System.assert(businessAssetPartnersGet200Response2.equals(businessAssetPartnersGet200Response1));
        System.assert(businessAssetPartnersGet200Response1.equals(businessAssetPartnersGet200Response1));
        System.assert(businessAssetPartnersGet200Response3.equals(businessAssetPartnersGet200Response4));
        System.assert(businessAssetPartnersGet200Response4.equals(businessAssetPartnersGet200Response3));
        System.assert(businessAssetPartnersGet200Response3.equals(businessAssetPartnersGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response1 = OASBusinessAssetPartnersGet200Respon.getExample();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response2 = OASBusinessAssetPartnersGet200Respon.getExample();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response3 = new OASBusinessAssetPartnersGet200Respon();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response4 = new OASBusinessAssetPartnersGet200Respon();

        System.assert(businessAssetPartnersGet200Response1.equals(businessAssetPartnersGet200Response2));
        System.assert(businessAssetPartnersGet200Response2.equals(businessAssetPartnersGet200Response1));
        System.assert(businessAssetPartnersGet200Response3.equals(businessAssetPartnersGet200Response4));
        System.assert(businessAssetPartnersGet200Response4.equals(businessAssetPartnersGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response1 = OASBusinessAssetPartnersGet200Respon.getExample();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response2 = new OASBusinessAssetPartnersGet200Respon();

        System.assertEquals(false, businessAssetPartnersGet200Response1.equals('foo'));
        System.assertEquals(false, businessAssetPartnersGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response1 = OASBusinessAssetPartnersGet200Respon.getExample();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response2 = new OASBusinessAssetPartnersGet200Respon();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response3;

        System.assertEquals(false, businessAssetPartnersGet200Response1.equals(businessAssetPartnersGet200Response3));
        System.assertEquals(false, businessAssetPartnersGet200Response2.equals(businessAssetPartnersGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response1 = OASBusinessAssetPartnersGet200Respon.getExample();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response2 = new OASBusinessAssetPartnersGet200Respon();

        System.assertEquals(businessAssetPartnersGet200Response1.hashCode(), businessAssetPartnersGet200Response1.hashCode());
        System.assertEquals(businessAssetPartnersGet200Response2.hashCode(), businessAssetPartnersGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response1 = OASBusinessAssetPartnersGet200Respon.getExample();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response2 = OASBusinessAssetPartnersGet200Respon.getExample();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response3 = new OASBusinessAssetPartnersGet200Respon();
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response4 = new OASBusinessAssetPartnersGet200Respon();

        System.assert(businessAssetPartnersGet200Response1.equals(businessAssetPartnersGet200Response2));
        System.assert(businessAssetPartnersGet200Response3.equals(businessAssetPartnersGet200Response4));
        System.assertEquals(businessAssetPartnersGet200Response1.hashCode(), businessAssetPartnersGet200Response2.hashCode());
        System.assertEquals(businessAssetPartnersGet200Response3.hashCode(), businessAssetPartnersGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response = new OASBusinessAssetPartnersGet200Respon();
        System.assertEquals(new List<OASUserSingleAssetBinding>(), businessAssetPartnersGet200Response.items);
        System.assertEquals(null, businessAssetPartnersGet200Response.bookmark);
    }
}
