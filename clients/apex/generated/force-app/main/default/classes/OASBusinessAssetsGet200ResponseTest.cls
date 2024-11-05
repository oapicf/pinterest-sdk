@isTest
private class OASBusinessAssetsGet200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessAssetsGet200Response businessAssetsGet200Response1 = OASBusinessAssetsGet200Response.getExample();
        OASBusinessAssetsGet200Response businessAssetsGet200Response2 = businessAssetsGet200Response1;
        OASBusinessAssetsGet200Response businessAssetsGet200Response3 = new OASBusinessAssetsGet200Response();
        OASBusinessAssetsGet200Response businessAssetsGet200Response4 = businessAssetsGet200Response3;

        System.assert(businessAssetsGet200Response1.equals(businessAssetsGet200Response2));
        System.assert(businessAssetsGet200Response2.equals(businessAssetsGet200Response1));
        System.assert(businessAssetsGet200Response1.equals(businessAssetsGet200Response1));
        System.assert(businessAssetsGet200Response3.equals(businessAssetsGet200Response4));
        System.assert(businessAssetsGet200Response4.equals(businessAssetsGet200Response3));
        System.assert(businessAssetsGet200Response3.equals(businessAssetsGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessAssetsGet200Response businessAssetsGet200Response1 = OASBusinessAssetsGet200Response.getExample();
        OASBusinessAssetsGet200Response businessAssetsGet200Response2 = OASBusinessAssetsGet200Response.getExample();
        OASBusinessAssetsGet200Response businessAssetsGet200Response3 = new OASBusinessAssetsGet200Response();
        OASBusinessAssetsGet200Response businessAssetsGet200Response4 = new OASBusinessAssetsGet200Response();

        System.assert(businessAssetsGet200Response1.equals(businessAssetsGet200Response2));
        System.assert(businessAssetsGet200Response2.equals(businessAssetsGet200Response1));
        System.assert(businessAssetsGet200Response3.equals(businessAssetsGet200Response4));
        System.assert(businessAssetsGet200Response4.equals(businessAssetsGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessAssetsGet200Response businessAssetsGet200Response1 = OASBusinessAssetsGet200Response.getExample();
        OASBusinessAssetsGet200Response businessAssetsGet200Response2 = new OASBusinessAssetsGet200Response();

        System.assertEquals(false, businessAssetsGet200Response1.equals('foo'));
        System.assertEquals(false, businessAssetsGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessAssetsGet200Response businessAssetsGet200Response1 = OASBusinessAssetsGet200Response.getExample();
        OASBusinessAssetsGet200Response businessAssetsGet200Response2 = new OASBusinessAssetsGet200Response();
        OASBusinessAssetsGet200Response businessAssetsGet200Response3;

        System.assertEquals(false, businessAssetsGet200Response1.equals(businessAssetsGet200Response3));
        System.assertEquals(false, businessAssetsGet200Response2.equals(businessAssetsGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessAssetsGet200Response businessAssetsGet200Response1 = OASBusinessAssetsGet200Response.getExample();
        OASBusinessAssetsGet200Response businessAssetsGet200Response2 = new OASBusinessAssetsGet200Response();

        System.assertEquals(businessAssetsGet200Response1.hashCode(), businessAssetsGet200Response1.hashCode());
        System.assertEquals(businessAssetsGet200Response2.hashCode(), businessAssetsGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessAssetsGet200Response businessAssetsGet200Response1 = OASBusinessAssetsGet200Response.getExample();
        OASBusinessAssetsGet200Response businessAssetsGet200Response2 = OASBusinessAssetsGet200Response.getExample();
        OASBusinessAssetsGet200Response businessAssetsGet200Response3 = new OASBusinessAssetsGet200Response();
        OASBusinessAssetsGet200Response businessAssetsGet200Response4 = new OASBusinessAssetsGet200Response();

        System.assert(businessAssetsGet200Response1.equals(businessAssetsGet200Response2));
        System.assert(businessAssetsGet200Response3.equals(businessAssetsGet200Response4));
        System.assertEquals(businessAssetsGet200Response1.hashCode(), businessAssetsGet200Response2.hashCode());
        System.assertEquals(businessAssetsGet200Response3.hashCode(), businessAssetsGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBusinessAssetsGet200Response businessAssetsGet200Response = new OASBusinessAssetsGet200Response();
        System.assertEquals(new List<OASGetBusinessAssetsResponse>(), businessAssetsGet200Response.items);
        System.assertEquals(null, businessAssetsGet200Response.bookmark);
    }
}
