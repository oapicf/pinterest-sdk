@isTest
private class OASOauthAccessTokenResponseClientCreTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials1 = OASOauthAccessTokenResponseClientCre.getExample();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials2 = oauthAccessTokenResponseClientCredentials1;
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials3 = new OASOauthAccessTokenResponseClientCre();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials4 = oauthAccessTokenResponseClientCredentials3;

        System.assert(oauthAccessTokenResponseClientCredentials1.equals(oauthAccessTokenResponseClientCredentials2));
        System.assert(oauthAccessTokenResponseClientCredentials2.equals(oauthAccessTokenResponseClientCredentials1));
        System.assert(oauthAccessTokenResponseClientCredentials1.equals(oauthAccessTokenResponseClientCredentials1));
        System.assert(oauthAccessTokenResponseClientCredentials3.equals(oauthAccessTokenResponseClientCredentials4));
        System.assert(oauthAccessTokenResponseClientCredentials4.equals(oauthAccessTokenResponseClientCredentials3));
        System.assert(oauthAccessTokenResponseClientCredentials3.equals(oauthAccessTokenResponseClientCredentials3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials1 = OASOauthAccessTokenResponseClientCre.getExample();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials2 = OASOauthAccessTokenResponseClientCre.getExample();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials3 = new OASOauthAccessTokenResponseClientCre();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials4 = new OASOauthAccessTokenResponseClientCre();

        System.assert(oauthAccessTokenResponseClientCredentials1.equals(oauthAccessTokenResponseClientCredentials2));
        System.assert(oauthAccessTokenResponseClientCredentials2.equals(oauthAccessTokenResponseClientCredentials1));
        System.assert(oauthAccessTokenResponseClientCredentials3.equals(oauthAccessTokenResponseClientCredentials4));
        System.assert(oauthAccessTokenResponseClientCredentials4.equals(oauthAccessTokenResponseClientCredentials3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials1 = OASOauthAccessTokenResponseClientCre.getExample();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials2 = new OASOauthAccessTokenResponseClientCre();

        System.assertEquals(false, oauthAccessTokenResponseClientCredentials1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenResponseClientCredentials2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials1 = OASOauthAccessTokenResponseClientCre.getExample();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials2 = new OASOauthAccessTokenResponseClientCre();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials3;

        System.assertEquals(false, oauthAccessTokenResponseClientCredentials1.equals(oauthAccessTokenResponseClientCredentials3));
        System.assertEquals(false, oauthAccessTokenResponseClientCredentials2.equals(oauthAccessTokenResponseClientCredentials3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials1 = OASOauthAccessTokenResponseClientCre.getExample();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials2 = new OASOauthAccessTokenResponseClientCre();

        System.assertEquals(oauthAccessTokenResponseClientCredentials1.hashCode(), oauthAccessTokenResponseClientCredentials1.hashCode());
        System.assertEquals(oauthAccessTokenResponseClientCredentials2.hashCode(), oauthAccessTokenResponseClientCredentials2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials1 = OASOauthAccessTokenResponseClientCre.getExample();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials2 = OASOauthAccessTokenResponseClientCre.getExample();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials3 = new OASOauthAccessTokenResponseClientCre();
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials4 = new OASOauthAccessTokenResponseClientCre();

        System.assert(oauthAccessTokenResponseClientCredentials1.equals(oauthAccessTokenResponseClientCredentials2));
        System.assert(oauthAccessTokenResponseClientCredentials3.equals(oauthAccessTokenResponseClientCredentials4));
        System.assertEquals(oauthAccessTokenResponseClientCredentials1.hashCode(), oauthAccessTokenResponseClientCredentials2.hashCode());
        System.assertEquals(oauthAccessTokenResponseClientCredentials3.hashCode(), oauthAccessTokenResponseClientCredentials4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials = new OASOauthAccessTokenResponseClientCre();
        Map<String, String> x-property-mappings = oauthAccessTokenResponseClientCredentials.getx-property-mappings();
        System.assertEquals('responseType', x-property-mappings.get('response_type'));
        System.assertEquals('accessToken', x-property-mappings.get('access_token'));
        System.assertEquals('tokenType', x-property-mappings.get('token_type'));
        System.assertEquals('expiresIn', x-property-mappings.get('expires_in'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOauthAccessTokenResponseClientCre oauthAccessTokenResponseClientCredentials = new OASOauthAccessTokenResponseClientCre();
        System.assertEquals('bearer', oauthAccessTokenResponseClientCredentials.tokenType);
        System.assertEquals(null, oauthAccessTokenResponseClientCredentials.responseType);
        System.assertEquals(null, oauthAccessTokenResponseClientCredentials.accessToken);
        System.assertEquals(null, oauthAccessTokenResponseClientCredentials.expiresIn);
        System.assertEquals(null, oauthAccessTokenResponseClientCredentials.scope);
    }
}
