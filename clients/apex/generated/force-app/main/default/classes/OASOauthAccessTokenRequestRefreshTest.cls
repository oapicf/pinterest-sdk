@isTest
private class OASOauthAccessTokenRequestRefreshTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh1 = OASOauthAccessTokenRequestRefresh.getExample();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh2 = oauthAccessTokenRequestRefresh1;
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh3 = new OASOauthAccessTokenRequestRefresh();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh4 = oauthAccessTokenRequestRefresh3;

        System.assert(oauthAccessTokenRequestRefresh1.equals(oauthAccessTokenRequestRefresh2));
        System.assert(oauthAccessTokenRequestRefresh2.equals(oauthAccessTokenRequestRefresh1));
        System.assert(oauthAccessTokenRequestRefresh1.equals(oauthAccessTokenRequestRefresh1));
        System.assert(oauthAccessTokenRequestRefresh3.equals(oauthAccessTokenRequestRefresh4));
        System.assert(oauthAccessTokenRequestRefresh4.equals(oauthAccessTokenRequestRefresh3));
        System.assert(oauthAccessTokenRequestRefresh3.equals(oauthAccessTokenRequestRefresh3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh1 = OASOauthAccessTokenRequestRefresh.getExample();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh2 = OASOauthAccessTokenRequestRefresh.getExample();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh3 = new OASOauthAccessTokenRequestRefresh();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh4 = new OASOauthAccessTokenRequestRefresh();

        System.assert(oauthAccessTokenRequestRefresh1.equals(oauthAccessTokenRequestRefresh2));
        System.assert(oauthAccessTokenRequestRefresh2.equals(oauthAccessTokenRequestRefresh1));
        System.assert(oauthAccessTokenRequestRefresh3.equals(oauthAccessTokenRequestRefresh4));
        System.assert(oauthAccessTokenRequestRefresh4.equals(oauthAccessTokenRequestRefresh3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh1 = OASOauthAccessTokenRequestRefresh.getExample();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh2 = new OASOauthAccessTokenRequestRefresh();

        System.assertEquals(false, oauthAccessTokenRequestRefresh1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenRequestRefresh2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh1 = OASOauthAccessTokenRequestRefresh.getExample();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh2 = new OASOauthAccessTokenRequestRefresh();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh3;

        System.assertEquals(false, oauthAccessTokenRequestRefresh1.equals(oauthAccessTokenRequestRefresh3));
        System.assertEquals(false, oauthAccessTokenRequestRefresh2.equals(oauthAccessTokenRequestRefresh3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh1 = OASOauthAccessTokenRequestRefresh.getExample();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh2 = new OASOauthAccessTokenRequestRefresh();

        System.assertEquals(oauthAccessTokenRequestRefresh1.hashCode(), oauthAccessTokenRequestRefresh1.hashCode());
        System.assertEquals(oauthAccessTokenRequestRefresh2.hashCode(), oauthAccessTokenRequestRefresh2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh1 = OASOauthAccessTokenRequestRefresh.getExample();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh2 = OASOauthAccessTokenRequestRefresh.getExample();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh3 = new OASOauthAccessTokenRequestRefresh();
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh4 = new OASOauthAccessTokenRequestRefresh();

        System.assert(oauthAccessTokenRequestRefresh1.equals(oauthAccessTokenRequestRefresh2));
        System.assert(oauthAccessTokenRequestRefresh3.equals(oauthAccessTokenRequestRefresh4));
        System.assertEquals(oauthAccessTokenRequestRefresh1.hashCode(), oauthAccessTokenRequestRefresh2.hashCode());
        System.assertEquals(oauthAccessTokenRequestRefresh3.hashCode(), oauthAccessTokenRequestRefresh4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh = new OASOauthAccessTokenRequestRefresh();
        Map<String, String> x-property-mappings = oauthAccessTokenRequestRefresh.getx-property-mappings();
        System.assertEquals('grantType', x-property-mappings.get('grant_type'));
        System.assertEquals('refreshToken', x-property-mappings.get('refresh_token'));
        System.assertEquals('refreshOn', x-property-mappings.get('refresh_on'));
    }
}
