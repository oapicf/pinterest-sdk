@isTest
private class OASOauthAccessTokenResponseRefreshTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh1 = OASOauthAccessTokenResponseRefresh.getExample();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh2 = oauthAccessTokenResponseRefresh1;
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh3 = new OASOauthAccessTokenResponseRefresh();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh4 = oauthAccessTokenResponseRefresh3;

        System.assert(oauthAccessTokenResponseRefresh1.equals(oauthAccessTokenResponseRefresh2));
        System.assert(oauthAccessTokenResponseRefresh2.equals(oauthAccessTokenResponseRefresh1));
        System.assert(oauthAccessTokenResponseRefresh1.equals(oauthAccessTokenResponseRefresh1));
        System.assert(oauthAccessTokenResponseRefresh3.equals(oauthAccessTokenResponseRefresh4));
        System.assert(oauthAccessTokenResponseRefresh4.equals(oauthAccessTokenResponseRefresh3));
        System.assert(oauthAccessTokenResponseRefresh3.equals(oauthAccessTokenResponseRefresh3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh1 = OASOauthAccessTokenResponseRefresh.getExample();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh2 = OASOauthAccessTokenResponseRefresh.getExample();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh3 = new OASOauthAccessTokenResponseRefresh();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh4 = new OASOauthAccessTokenResponseRefresh();

        System.assert(oauthAccessTokenResponseRefresh1.equals(oauthAccessTokenResponseRefresh2));
        System.assert(oauthAccessTokenResponseRefresh2.equals(oauthAccessTokenResponseRefresh1));
        System.assert(oauthAccessTokenResponseRefresh3.equals(oauthAccessTokenResponseRefresh4));
        System.assert(oauthAccessTokenResponseRefresh4.equals(oauthAccessTokenResponseRefresh3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh1 = OASOauthAccessTokenResponseRefresh.getExample();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh2 = new OASOauthAccessTokenResponseRefresh();

        System.assertEquals(false, oauthAccessTokenResponseRefresh1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenResponseRefresh2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh1 = OASOauthAccessTokenResponseRefresh.getExample();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh2 = new OASOauthAccessTokenResponseRefresh();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh3;

        System.assertEquals(false, oauthAccessTokenResponseRefresh1.equals(oauthAccessTokenResponseRefresh3));
        System.assertEquals(false, oauthAccessTokenResponseRefresh2.equals(oauthAccessTokenResponseRefresh3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh1 = OASOauthAccessTokenResponseRefresh.getExample();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh2 = new OASOauthAccessTokenResponseRefresh();

        System.assertEquals(oauthAccessTokenResponseRefresh1.hashCode(), oauthAccessTokenResponseRefresh1.hashCode());
        System.assertEquals(oauthAccessTokenResponseRefresh2.hashCode(), oauthAccessTokenResponseRefresh2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh1 = OASOauthAccessTokenResponseRefresh.getExample();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh2 = OASOauthAccessTokenResponseRefresh.getExample();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh3 = new OASOauthAccessTokenResponseRefresh();
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh4 = new OASOauthAccessTokenResponseRefresh();

        System.assert(oauthAccessTokenResponseRefresh1.equals(oauthAccessTokenResponseRefresh2));
        System.assert(oauthAccessTokenResponseRefresh3.equals(oauthAccessTokenResponseRefresh4));
        System.assertEquals(oauthAccessTokenResponseRefresh1.hashCode(), oauthAccessTokenResponseRefresh2.hashCode());
        System.assertEquals(oauthAccessTokenResponseRefresh3.hashCode(), oauthAccessTokenResponseRefresh4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh = new OASOauthAccessTokenResponseRefresh();
        Map<String, String> x-property-mappings = oauthAccessTokenResponseRefresh.getx-property-mappings();
        System.assertEquals('responseType', x-property-mappings.get('response_type'));
        System.assertEquals('accessToken', x-property-mappings.get('access_token'));
        System.assertEquals('tokenType', x-property-mappings.get('token_type'));
        System.assertEquals('expiresIn', x-property-mappings.get('expires_in'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOauthAccessTokenResponseRefresh oauthAccessTokenResponseRefresh = new OASOauthAccessTokenResponseRefresh();
        System.assertEquals('bearer', oauthAccessTokenResponseRefresh.tokenType);
        System.assertEquals(null, oauthAccessTokenResponseRefresh.responseType);
        System.assertEquals(null, oauthAccessTokenResponseRefresh.accessToken);
        System.assertEquals(null, oauthAccessTokenResponseRefresh.expiresIn);
        System.assertEquals(null, oauthAccessTokenResponseRefresh.scope);
    }
}
