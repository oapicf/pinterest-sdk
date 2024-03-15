@isTest
private class OASOauthAccessTokenResponseIntegratiTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh1 = OASOauthAccessTokenResponseIntegrati.getExample();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh2 = oauthAccessTokenResponseIntegrationRefresh1;
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh3 = new OASOauthAccessTokenResponseIntegrati();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh4 = oauthAccessTokenResponseIntegrationRefresh3;

        System.assert(oauthAccessTokenResponseIntegrationRefresh1.equals(oauthAccessTokenResponseIntegrationRefresh2));
        System.assert(oauthAccessTokenResponseIntegrationRefresh2.equals(oauthAccessTokenResponseIntegrationRefresh1));
        System.assert(oauthAccessTokenResponseIntegrationRefresh1.equals(oauthAccessTokenResponseIntegrationRefresh1));
        System.assert(oauthAccessTokenResponseIntegrationRefresh3.equals(oauthAccessTokenResponseIntegrationRefresh4));
        System.assert(oauthAccessTokenResponseIntegrationRefresh4.equals(oauthAccessTokenResponseIntegrationRefresh3));
        System.assert(oauthAccessTokenResponseIntegrationRefresh3.equals(oauthAccessTokenResponseIntegrationRefresh3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh1 = OASOauthAccessTokenResponseIntegrati.getExample();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh2 = OASOauthAccessTokenResponseIntegrati.getExample();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh3 = new OASOauthAccessTokenResponseIntegrati();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh4 = new OASOauthAccessTokenResponseIntegrati();

        System.assert(oauthAccessTokenResponseIntegrationRefresh1.equals(oauthAccessTokenResponseIntegrationRefresh2));
        System.assert(oauthAccessTokenResponseIntegrationRefresh2.equals(oauthAccessTokenResponseIntegrationRefresh1));
        System.assert(oauthAccessTokenResponseIntegrationRefresh3.equals(oauthAccessTokenResponseIntegrationRefresh4));
        System.assert(oauthAccessTokenResponseIntegrationRefresh4.equals(oauthAccessTokenResponseIntegrationRefresh3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh1 = OASOauthAccessTokenResponseIntegrati.getExample();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh2 = new OASOauthAccessTokenResponseIntegrati();

        System.assertEquals(false, oauthAccessTokenResponseIntegrationRefresh1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenResponseIntegrationRefresh2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh1 = OASOauthAccessTokenResponseIntegrati.getExample();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh2 = new OASOauthAccessTokenResponseIntegrati();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh3;

        System.assertEquals(false, oauthAccessTokenResponseIntegrationRefresh1.equals(oauthAccessTokenResponseIntegrationRefresh3));
        System.assertEquals(false, oauthAccessTokenResponseIntegrationRefresh2.equals(oauthAccessTokenResponseIntegrationRefresh3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh1 = OASOauthAccessTokenResponseIntegrati.getExample();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh2 = new OASOauthAccessTokenResponseIntegrati();

        System.assertEquals(oauthAccessTokenResponseIntegrationRefresh1.hashCode(), oauthAccessTokenResponseIntegrationRefresh1.hashCode());
        System.assertEquals(oauthAccessTokenResponseIntegrationRefresh2.hashCode(), oauthAccessTokenResponseIntegrationRefresh2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh1 = OASOauthAccessTokenResponseIntegrati.getExample();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh2 = OASOauthAccessTokenResponseIntegrati.getExample();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh3 = new OASOauthAccessTokenResponseIntegrati();
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh4 = new OASOauthAccessTokenResponseIntegrati();

        System.assert(oauthAccessTokenResponseIntegrationRefresh1.equals(oauthAccessTokenResponseIntegrationRefresh2));
        System.assert(oauthAccessTokenResponseIntegrationRefresh3.equals(oauthAccessTokenResponseIntegrationRefresh4));
        System.assertEquals(oauthAccessTokenResponseIntegrationRefresh1.hashCode(), oauthAccessTokenResponseIntegrationRefresh2.hashCode());
        System.assertEquals(oauthAccessTokenResponseIntegrationRefresh3.hashCode(), oauthAccessTokenResponseIntegrationRefresh4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh = new OASOauthAccessTokenResponseIntegrati();
        Map<String, String> x-property-mappings = oauthAccessTokenResponseIntegrationRefresh.getx-property-mappings();
        System.assertEquals('responseType', x-property-mappings.get('response_type'));
        System.assertEquals('accessToken', x-property-mappings.get('access_token'));
        System.assertEquals('tokenType', x-property-mappings.get('token_type'));
        System.assertEquals('expiresIn', x-property-mappings.get('expires_in'));
        System.assertEquals('refreshToken', x-property-mappings.get('refresh_token'));
        System.assertEquals('refreshTokenExpiresIn', x-property-mappings.get('refresh_token_expires_in'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOauthAccessTokenResponseIntegrati oauthAccessTokenResponseIntegrationRefresh = new OASOauthAccessTokenResponseIntegrati();
        System.assertEquals('bearer', oauthAccessTokenResponseIntegrationRefresh.tokenType);
        System.assertEquals(null, oauthAccessTokenResponseIntegrationRefresh.responseType);
        System.assertEquals(null, oauthAccessTokenResponseIntegrationRefresh.accessToken);
        System.assertEquals(null, oauthAccessTokenResponseIntegrationRefresh.expiresIn);
        System.assertEquals(null, oauthAccessTokenResponseIntegrationRefresh.scope);
        System.assertEquals(null, oauthAccessTokenResponseIntegrationRefresh.refreshToken);
        System.assertEquals(null, oauthAccessTokenResponseIntegrationRefresh.refreshTokenExpiresIn);
    }
}
