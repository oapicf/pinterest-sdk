@isTest
private class OASUserAccountFollowedInterests200ReTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response1 = OASUserAccountFollowedInterests200Re.getExample();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response2 = userAccountFollowedInterests200Response1;
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response3 = new OASUserAccountFollowedInterests200Re();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response4 = userAccountFollowedInterests200Response3;

        System.assert(userAccountFollowedInterests200Response1.equals(userAccountFollowedInterests200Response2));
        System.assert(userAccountFollowedInterests200Response2.equals(userAccountFollowedInterests200Response1));
        System.assert(userAccountFollowedInterests200Response1.equals(userAccountFollowedInterests200Response1));
        System.assert(userAccountFollowedInterests200Response3.equals(userAccountFollowedInterests200Response4));
        System.assert(userAccountFollowedInterests200Response4.equals(userAccountFollowedInterests200Response3));
        System.assert(userAccountFollowedInterests200Response3.equals(userAccountFollowedInterests200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response1 = OASUserAccountFollowedInterests200Re.getExample();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response2 = OASUserAccountFollowedInterests200Re.getExample();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response3 = new OASUserAccountFollowedInterests200Re();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response4 = new OASUserAccountFollowedInterests200Re();

        System.assert(userAccountFollowedInterests200Response1.equals(userAccountFollowedInterests200Response2));
        System.assert(userAccountFollowedInterests200Response2.equals(userAccountFollowedInterests200Response1));
        System.assert(userAccountFollowedInterests200Response3.equals(userAccountFollowedInterests200Response4));
        System.assert(userAccountFollowedInterests200Response4.equals(userAccountFollowedInterests200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response1 = OASUserAccountFollowedInterests200Re.getExample();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response2 = new OASUserAccountFollowedInterests200Re();

        System.assertEquals(false, userAccountFollowedInterests200Response1.equals('foo'));
        System.assertEquals(false, userAccountFollowedInterests200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response1 = OASUserAccountFollowedInterests200Re.getExample();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response2 = new OASUserAccountFollowedInterests200Re();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response3;

        System.assertEquals(false, userAccountFollowedInterests200Response1.equals(userAccountFollowedInterests200Response3));
        System.assertEquals(false, userAccountFollowedInterests200Response2.equals(userAccountFollowedInterests200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response1 = OASUserAccountFollowedInterests200Re.getExample();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response2 = new OASUserAccountFollowedInterests200Re();

        System.assertEquals(userAccountFollowedInterests200Response1.hashCode(), userAccountFollowedInterests200Response1.hashCode());
        System.assertEquals(userAccountFollowedInterests200Response2.hashCode(), userAccountFollowedInterests200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response1 = OASUserAccountFollowedInterests200Re.getExample();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response2 = OASUserAccountFollowedInterests200Re.getExample();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response3 = new OASUserAccountFollowedInterests200Re();
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response4 = new OASUserAccountFollowedInterests200Re();

        System.assert(userAccountFollowedInterests200Response1.equals(userAccountFollowedInterests200Response2));
        System.assert(userAccountFollowedInterests200Response3.equals(userAccountFollowedInterests200Response4));
        System.assertEquals(userAccountFollowedInterests200Response1.hashCode(), userAccountFollowedInterests200Response2.hashCode());
        System.assertEquals(userAccountFollowedInterests200Response3.hashCode(), userAccountFollowedInterests200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUserAccountFollowedInterests200Re userAccountFollowedInterests200Response = new OASUserAccountFollowedInterests200Re();
        System.assertEquals(new List<OASInterest>(), userAccountFollowedInterests200Response.items);
        System.assertEquals(null, userAccountFollowedInterests200Response.bookmark);
    }
}
