@isTest
private class OASOauthAccessTokenResponseEverlastiTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh1 = OASOauthAccessTokenResponseEverlasti.getExample();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh2 = oauthAccessTokenResponseEverlastingRefresh1;
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh3 = new OASOauthAccessTokenResponseEverlasti();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh4 = oauthAccessTokenResponseEverlastingRefresh3;

        System.assert(oauthAccessTokenResponseEverlastingRefresh1.equals(oauthAccessTokenResponseEverlastingRefresh2));
        System.assert(oauthAccessTokenResponseEverlastingRefresh2.equals(oauthAccessTokenResponseEverlastingRefresh1));
        System.assert(oauthAccessTokenResponseEverlastingRefresh1.equals(oauthAccessTokenResponseEverlastingRefresh1));
        System.assert(oauthAccessTokenResponseEverlastingRefresh3.equals(oauthAccessTokenResponseEverlastingRefresh4));
        System.assert(oauthAccessTokenResponseEverlastingRefresh4.equals(oauthAccessTokenResponseEverlastingRefresh3));
        System.assert(oauthAccessTokenResponseEverlastingRefresh3.equals(oauthAccessTokenResponseEverlastingRefresh3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh1 = OASOauthAccessTokenResponseEverlasti.getExample();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh2 = OASOauthAccessTokenResponseEverlasti.getExample();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh3 = new OASOauthAccessTokenResponseEverlasti();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh4 = new OASOauthAccessTokenResponseEverlasti();

        System.assert(oauthAccessTokenResponseEverlastingRefresh1.equals(oauthAccessTokenResponseEverlastingRefresh2));
        System.assert(oauthAccessTokenResponseEverlastingRefresh2.equals(oauthAccessTokenResponseEverlastingRefresh1));
        System.assert(oauthAccessTokenResponseEverlastingRefresh3.equals(oauthAccessTokenResponseEverlastingRefresh4));
        System.assert(oauthAccessTokenResponseEverlastingRefresh4.equals(oauthAccessTokenResponseEverlastingRefresh3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh1 = OASOauthAccessTokenResponseEverlasti.getExample();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh2 = new OASOauthAccessTokenResponseEverlasti();

        System.assertEquals(false, oauthAccessTokenResponseEverlastingRefresh1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenResponseEverlastingRefresh2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh1 = OASOauthAccessTokenResponseEverlasti.getExample();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh2 = new OASOauthAccessTokenResponseEverlasti();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh3;

        System.assertEquals(false, oauthAccessTokenResponseEverlastingRefresh1.equals(oauthAccessTokenResponseEverlastingRefresh3));
        System.assertEquals(false, oauthAccessTokenResponseEverlastingRefresh2.equals(oauthAccessTokenResponseEverlastingRefresh3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh1 = OASOauthAccessTokenResponseEverlasti.getExample();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh2 = new OASOauthAccessTokenResponseEverlasti();

        System.assertEquals(oauthAccessTokenResponseEverlastingRefresh1.hashCode(), oauthAccessTokenResponseEverlastingRefresh1.hashCode());
        System.assertEquals(oauthAccessTokenResponseEverlastingRefresh2.hashCode(), oauthAccessTokenResponseEverlastingRefresh2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh1 = OASOauthAccessTokenResponseEverlasti.getExample();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh2 = OASOauthAccessTokenResponseEverlasti.getExample();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh3 = new OASOauthAccessTokenResponseEverlasti();
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh4 = new OASOauthAccessTokenResponseEverlasti();

        System.assert(oauthAccessTokenResponseEverlastingRefresh1.equals(oauthAccessTokenResponseEverlastingRefresh2));
        System.assert(oauthAccessTokenResponseEverlastingRefresh3.equals(oauthAccessTokenResponseEverlastingRefresh4));
        System.assertEquals(oauthAccessTokenResponseEverlastingRefresh1.hashCode(), oauthAccessTokenResponseEverlastingRefresh2.hashCode());
        System.assertEquals(oauthAccessTokenResponseEverlastingRefresh3.hashCode(), oauthAccessTokenResponseEverlastingRefresh4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh = new OASOauthAccessTokenResponseEverlasti();
        Map<String, String> x-property-mappings = oauthAccessTokenResponseEverlastingRefresh.getx-property-mappings();
        System.assertEquals('responseType', x-property-mappings.get('response_type'));
        System.assertEquals('accessToken', x-property-mappings.get('access_token'));
        System.assertEquals('tokenType', x-property-mappings.get('token_type'));
        System.assertEquals('expiresIn', x-property-mappings.get('expires_in'));
        System.assertEquals('refreshToken', x-property-mappings.get('refresh_token'));
        System.assertEquals('refreshTokenExpiresIn', x-property-mappings.get('refresh_token_expires_in'));
        System.assertEquals('refreshTokenExpiresAt', x-property-mappings.get('refresh_token_expires_at'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOauthAccessTokenResponseEverlasti oauthAccessTokenResponseEverlastingRefresh = new OASOauthAccessTokenResponseEverlasti();
        System.assertEquals('bearer', oauthAccessTokenResponseEverlastingRefresh.tokenType);
        System.assertEquals(null, oauthAccessTokenResponseEverlastingRefresh.responseType);
        System.assertEquals(null, oauthAccessTokenResponseEverlastingRefresh.accessToken);
        System.assertEquals(null, oauthAccessTokenResponseEverlastingRefresh.expiresIn);
        System.assertEquals(null, oauthAccessTokenResponseEverlastingRefresh.scope);
        System.assertEquals(null, oauthAccessTokenResponseEverlastingRefresh.refreshToken);
        System.assertEquals(null, oauthAccessTokenResponseEverlastingRefresh.refreshTokenExpiresIn);
        System.assertEquals(null, oauthAccessTokenResponseEverlastingRefresh.refreshTokenExpiresAt);
    }
}
