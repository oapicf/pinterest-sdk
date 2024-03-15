@isTest
private class OASFollowersList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASFollowersList200Response followersList200Response1 = OASFollowersList200Response.getExample();
        OASFollowersList200Response followersList200Response2 = followersList200Response1;
        OASFollowersList200Response followersList200Response3 = new OASFollowersList200Response();
        OASFollowersList200Response followersList200Response4 = followersList200Response3;

        System.assert(followersList200Response1.equals(followersList200Response2));
        System.assert(followersList200Response2.equals(followersList200Response1));
        System.assert(followersList200Response1.equals(followersList200Response1));
        System.assert(followersList200Response3.equals(followersList200Response4));
        System.assert(followersList200Response4.equals(followersList200Response3));
        System.assert(followersList200Response3.equals(followersList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFollowersList200Response followersList200Response1 = OASFollowersList200Response.getExample();
        OASFollowersList200Response followersList200Response2 = OASFollowersList200Response.getExample();
        OASFollowersList200Response followersList200Response3 = new OASFollowersList200Response();
        OASFollowersList200Response followersList200Response4 = new OASFollowersList200Response();

        System.assert(followersList200Response1.equals(followersList200Response2));
        System.assert(followersList200Response2.equals(followersList200Response1));
        System.assert(followersList200Response3.equals(followersList200Response4));
        System.assert(followersList200Response4.equals(followersList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFollowersList200Response followersList200Response1 = OASFollowersList200Response.getExample();
        OASFollowersList200Response followersList200Response2 = new OASFollowersList200Response();

        System.assertEquals(false, followersList200Response1.equals('foo'));
        System.assertEquals(false, followersList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFollowersList200Response followersList200Response1 = OASFollowersList200Response.getExample();
        OASFollowersList200Response followersList200Response2 = new OASFollowersList200Response();
        OASFollowersList200Response followersList200Response3;

        System.assertEquals(false, followersList200Response1.equals(followersList200Response3));
        System.assertEquals(false, followersList200Response2.equals(followersList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFollowersList200Response followersList200Response1 = OASFollowersList200Response.getExample();
        OASFollowersList200Response followersList200Response2 = new OASFollowersList200Response();

        System.assertEquals(followersList200Response1.hashCode(), followersList200Response1.hashCode());
        System.assertEquals(followersList200Response2.hashCode(), followersList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFollowersList200Response followersList200Response1 = OASFollowersList200Response.getExample();
        OASFollowersList200Response followersList200Response2 = OASFollowersList200Response.getExample();
        OASFollowersList200Response followersList200Response3 = new OASFollowersList200Response();
        OASFollowersList200Response followersList200Response4 = new OASFollowersList200Response();

        System.assert(followersList200Response1.equals(followersList200Response2));
        System.assert(followersList200Response3.equals(followersList200Response4));
        System.assertEquals(followersList200Response1.hashCode(), followersList200Response2.hashCode());
        System.assertEquals(followersList200Response3.hashCode(), followersList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFollowersList200Response followersList200Response = new OASFollowersList200Response();
        System.assertEquals(new List<OASUserSummary>(), followersList200Response.items);
        System.assertEquals(null, followersList200Response.bookmark);
    }
}
