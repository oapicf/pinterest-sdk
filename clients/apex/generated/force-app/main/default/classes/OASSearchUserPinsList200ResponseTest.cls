@isTest
private class OASSearchUserPinsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSearchUserPinsList200Response searchUserPinsList200Response1 = OASSearchUserPinsList200Response.getExample();
        OASSearchUserPinsList200Response searchUserPinsList200Response2 = searchUserPinsList200Response1;
        OASSearchUserPinsList200Response searchUserPinsList200Response3 = new OASSearchUserPinsList200Response();
        OASSearchUserPinsList200Response searchUserPinsList200Response4 = searchUserPinsList200Response3;

        System.assert(searchUserPinsList200Response1.equals(searchUserPinsList200Response2));
        System.assert(searchUserPinsList200Response2.equals(searchUserPinsList200Response1));
        System.assert(searchUserPinsList200Response1.equals(searchUserPinsList200Response1));
        System.assert(searchUserPinsList200Response3.equals(searchUserPinsList200Response4));
        System.assert(searchUserPinsList200Response4.equals(searchUserPinsList200Response3));
        System.assert(searchUserPinsList200Response3.equals(searchUserPinsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSearchUserPinsList200Response searchUserPinsList200Response1 = OASSearchUserPinsList200Response.getExample();
        OASSearchUserPinsList200Response searchUserPinsList200Response2 = OASSearchUserPinsList200Response.getExample();
        OASSearchUserPinsList200Response searchUserPinsList200Response3 = new OASSearchUserPinsList200Response();
        OASSearchUserPinsList200Response searchUserPinsList200Response4 = new OASSearchUserPinsList200Response();

        System.assert(searchUserPinsList200Response1.equals(searchUserPinsList200Response2));
        System.assert(searchUserPinsList200Response2.equals(searchUserPinsList200Response1));
        System.assert(searchUserPinsList200Response3.equals(searchUserPinsList200Response4));
        System.assert(searchUserPinsList200Response4.equals(searchUserPinsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSearchUserPinsList200Response searchUserPinsList200Response1 = OASSearchUserPinsList200Response.getExample();
        OASSearchUserPinsList200Response searchUserPinsList200Response2 = new OASSearchUserPinsList200Response();

        System.assertEquals(false, searchUserPinsList200Response1.equals('foo'));
        System.assertEquals(false, searchUserPinsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSearchUserPinsList200Response searchUserPinsList200Response1 = OASSearchUserPinsList200Response.getExample();
        OASSearchUserPinsList200Response searchUserPinsList200Response2 = new OASSearchUserPinsList200Response();
        OASSearchUserPinsList200Response searchUserPinsList200Response3;

        System.assertEquals(false, searchUserPinsList200Response1.equals(searchUserPinsList200Response3));
        System.assertEquals(false, searchUserPinsList200Response2.equals(searchUserPinsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSearchUserPinsList200Response searchUserPinsList200Response1 = OASSearchUserPinsList200Response.getExample();
        OASSearchUserPinsList200Response searchUserPinsList200Response2 = new OASSearchUserPinsList200Response();

        System.assertEquals(searchUserPinsList200Response1.hashCode(), searchUserPinsList200Response1.hashCode());
        System.assertEquals(searchUserPinsList200Response2.hashCode(), searchUserPinsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSearchUserPinsList200Response searchUserPinsList200Response1 = OASSearchUserPinsList200Response.getExample();
        OASSearchUserPinsList200Response searchUserPinsList200Response2 = OASSearchUserPinsList200Response.getExample();
        OASSearchUserPinsList200Response searchUserPinsList200Response3 = new OASSearchUserPinsList200Response();
        OASSearchUserPinsList200Response searchUserPinsList200Response4 = new OASSearchUserPinsList200Response();

        System.assert(searchUserPinsList200Response1.equals(searchUserPinsList200Response2));
        System.assert(searchUserPinsList200Response3.equals(searchUserPinsList200Response4));
        System.assertEquals(searchUserPinsList200Response1.hashCode(), searchUserPinsList200Response2.hashCode());
        System.assertEquals(searchUserPinsList200Response3.hashCode(), searchUserPinsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSearchUserPinsList200Response searchUserPinsList200Response = new OASSearchUserPinsList200Response();
        System.assertEquals(new List<OASPin>(), searchUserPinsList200Response.items);
        System.assertEquals(null, searchUserPinsList200Response.bookmark);
    }
}
