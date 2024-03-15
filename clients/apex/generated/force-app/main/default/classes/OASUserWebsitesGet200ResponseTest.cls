@isTest
private class OASUserWebsitesGet200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserWebsitesGet200Response userWebsitesGet200Response1 = OASUserWebsitesGet200Response.getExample();
        OASUserWebsitesGet200Response userWebsitesGet200Response2 = userWebsitesGet200Response1;
        OASUserWebsitesGet200Response userWebsitesGet200Response3 = new OASUserWebsitesGet200Response();
        OASUserWebsitesGet200Response userWebsitesGet200Response4 = userWebsitesGet200Response3;

        System.assert(userWebsitesGet200Response1.equals(userWebsitesGet200Response2));
        System.assert(userWebsitesGet200Response2.equals(userWebsitesGet200Response1));
        System.assert(userWebsitesGet200Response1.equals(userWebsitesGet200Response1));
        System.assert(userWebsitesGet200Response3.equals(userWebsitesGet200Response4));
        System.assert(userWebsitesGet200Response4.equals(userWebsitesGet200Response3));
        System.assert(userWebsitesGet200Response3.equals(userWebsitesGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserWebsitesGet200Response userWebsitesGet200Response1 = OASUserWebsitesGet200Response.getExample();
        OASUserWebsitesGet200Response userWebsitesGet200Response2 = OASUserWebsitesGet200Response.getExample();
        OASUserWebsitesGet200Response userWebsitesGet200Response3 = new OASUserWebsitesGet200Response();
        OASUserWebsitesGet200Response userWebsitesGet200Response4 = new OASUserWebsitesGet200Response();

        System.assert(userWebsitesGet200Response1.equals(userWebsitesGet200Response2));
        System.assert(userWebsitesGet200Response2.equals(userWebsitesGet200Response1));
        System.assert(userWebsitesGet200Response3.equals(userWebsitesGet200Response4));
        System.assert(userWebsitesGet200Response4.equals(userWebsitesGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserWebsitesGet200Response userWebsitesGet200Response1 = OASUserWebsitesGet200Response.getExample();
        OASUserWebsitesGet200Response userWebsitesGet200Response2 = new OASUserWebsitesGet200Response();

        System.assertEquals(false, userWebsitesGet200Response1.equals('foo'));
        System.assertEquals(false, userWebsitesGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserWebsitesGet200Response userWebsitesGet200Response1 = OASUserWebsitesGet200Response.getExample();
        OASUserWebsitesGet200Response userWebsitesGet200Response2 = new OASUserWebsitesGet200Response();
        OASUserWebsitesGet200Response userWebsitesGet200Response3;

        System.assertEquals(false, userWebsitesGet200Response1.equals(userWebsitesGet200Response3));
        System.assertEquals(false, userWebsitesGet200Response2.equals(userWebsitesGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserWebsitesGet200Response userWebsitesGet200Response1 = OASUserWebsitesGet200Response.getExample();
        OASUserWebsitesGet200Response userWebsitesGet200Response2 = new OASUserWebsitesGet200Response();

        System.assertEquals(userWebsitesGet200Response1.hashCode(), userWebsitesGet200Response1.hashCode());
        System.assertEquals(userWebsitesGet200Response2.hashCode(), userWebsitesGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserWebsitesGet200Response userWebsitesGet200Response1 = OASUserWebsitesGet200Response.getExample();
        OASUserWebsitesGet200Response userWebsitesGet200Response2 = OASUserWebsitesGet200Response.getExample();
        OASUserWebsitesGet200Response userWebsitesGet200Response3 = new OASUserWebsitesGet200Response();
        OASUserWebsitesGet200Response userWebsitesGet200Response4 = new OASUserWebsitesGet200Response();

        System.assert(userWebsitesGet200Response1.equals(userWebsitesGet200Response2));
        System.assert(userWebsitesGet200Response3.equals(userWebsitesGet200Response4));
        System.assertEquals(userWebsitesGet200Response1.hashCode(), userWebsitesGet200Response2.hashCode());
        System.assertEquals(userWebsitesGet200Response3.hashCode(), userWebsitesGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUserWebsitesGet200Response userWebsitesGet200Response = new OASUserWebsitesGet200Response();
        System.assertEquals(new List<OASUserWebsiteSummary>(), userWebsitesGet200Response.items);
        System.assertEquals(null, userWebsitesGet200Response.bookmark);
    }
}
