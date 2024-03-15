@isTest
private class OASUserFollowingGet200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserFollowingGet200Response userFollowingGet200Response1 = OASUserFollowingGet200Response.getExample();
        OASUserFollowingGet200Response userFollowingGet200Response2 = userFollowingGet200Response1;
        OASUserFollowingGet200Response userFollowingGet200Response3 = new OASUserFollowingGet200Response();
        OASUserFollowingGet200Response userFollowingGet200Response4 = userFollowingGet200Response3;

        System.assert(userFollowingGet200Response1.equals(userFollowingGet200Response2));
        System.assert(userFollowingGet200Response2.equals(userFollowingGet200Response1));
        System.assert(userFollowingGet200Response1.equals(userFollowingGet200Response1));
        System.assert(userFollowingGet200Response3.equals(userFollowingGet200Response4));
        System.assert(userFollowingGet200Response4.equals(userFollowingGet200Response3));
        System.assert(userFollowingGet200Response3.equals(userFollowingGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserFollowingGet200Response userFollowingGet200Response1 = OASUserFollowingGet200Response.getExample();
        OASUserFollowingGet200Response userFollowingGet200Response2 = OASUserFollowingGet200Response.getExample();
        OASUserFollowingGet200Response userFollowingGet200Response3 = new OASUserFollowingGet200Response();
        OASUserFollowingGet200Response userFollowingGet200Response4 = new OASUserFollowingGet200Response();

        System.assert(userFollowingGet200Response1.equals(userFollowingGet200Response2));
        System.assert(userFollowingGet200Response2.equals(userFollowingGet200Response1));
        System.assert(userFollowingGet200Response3.equals(userFollowingGet200Response4));
        System.assert(userFollowingGet200Response4.equals(userFollowingGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserFollowingGet200Response userFollowingGet200Response1 = OASUserFollowingGet200Response.getExample();
        OASUserFollowingGet200Response userFollowingGet200Response2 = new OASUserFollowingGet200Response();

        System.assertEquals(false, userFollowingGet200Response1.equals('foo'));
        System.assertEquals(false, userFollowingGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserFollowingGet200Response userFollowingGet200Response1 = OASUserFollowingGet200Response.getExample();
        OASUserFollowingGet200Response userFollowingGet200Response2 = new OASUserFollowingGet200Response();
        OASUserFollowingGet200Response userFollowingGet200Response3;

        System.assertEquals(false, userFollowingGet200Response1.equals(userFollowingGet200Response3));
        System.assertEquals(false, userFollowingGet200Response2.equals(userFollowingGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserFollowingGet200Response userFollowingGet200Response1 = OASUserFollowingGet200Response.getExample();
        OASUserFollowingGet200Response userFollowingGet200Response2 = new OASUserFollowingGet200Response();

        System.assertEquals(userFollowingGet200Response1.hashCode(), userFollowingGet200Response1.hashCode());
        System.assertEquals(userFollowingGet200Response2.hashCode(), userFollowingGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserFollowingGet200Response userFollowingGet200Response1 = OASUserFollowingGet200Response.getExample();
        OASUserFollowingGet200Response userFollowingGet200Response2 = OASUserFollowingGet200Response.getExample();
        OASUserFollowingGet200Response userFollowingGet200Response3 = new OASUserFollowingGet200Response();
        OASUserFollowingGet200Response userFollowingGet200Response4 = new OASUserFollowingGet200Response();

        System.assert(userFollowingGet200Response1.equals(userFollowingGet200Response2));
        System.assert(userFollowingGet200Response3.equals(userFollowingGet200Response4));
        System.assertEquals(userFollowingGet200Response1.hashCode(), userFollowingGet200Response2.hashCode());
        System.assertEquals(userFollowingGet200Response3.hashCode(), userFollowingGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUserFollowingGet200Response userFollowingGet200Response = new OASUserFollowingGet200Response();
        System.assertEquals(new List<OASUserSummary>(), userFollowingGet200Response.items);
        System.assertEquals(null, userFollowingGet200Response.bookmark);
    }
}
