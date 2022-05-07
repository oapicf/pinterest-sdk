@isTest
private class OASOauthAccessTokenResponseCodeTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode1 = OASOauthAccessTokenResponseCode.getExample();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode2 = oauthAccessTokenResponseCode1;
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode3 = new OASOauthAccessTokenResponseCode();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode4 = oauthAccessTokenResponseCode3;

        System.assert(oauthAccessTokenResponseCode1.equals(oauthAccessTokenResponseCode2));
        System.assert(oauthAccessTokenResponseCode2.equals(oauthAccessTokenResponseCode1));
        System.assert(oauthAccessTokenResponseCode1.equals(oauthAccessTokenResponseCode1));
        System.assert(oauthAccessTokenResponseCode3.equals(oauthAccessTokenResponseCode4));
        System.assert(oauthAccessTokenResponseCode4.equals(oauthAccessTokenResponseCode3));
        System.assert(oauthAccessTokenResponseCode3.equals(oauthAccessTokenResponseCode3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode1 = OASOauthAccessTokenResponseCode.getExample();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode2 = OASOauthAccessTokenResponseCode.getExample();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode3 = new OASOauthAccessTokenResponseCode();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode4 = new OASOauthAccessTokenResponseCode();

        System.assert(oauthAccessTokenResponseCode1.equals(oauthAccessTokenResponseCode2));
        System.assert(oauthAccessTokenResponseCode2.equals(oauthAccessTokenResponseCode1));
        System.assert(oauthAccessTokenResponseCode3.equals(oauthAccessTokenResponseCode4));
        System.assert(oauthAccessTokenResponseCode4.equals(oauthAccessTokenResponseCode3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode1 = OASOauthAccessTokenResponseCode.getExample();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode2 = new OASOauthAccessTokenResponseCode();

        System.assertEquals(false, oauthAccessTokenResponseCode1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenResponseCode2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode1 = OASOauthAccessTokenResponseCode.getExample();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode2 = new OASOauthAccessTokenResponseCode();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode3;

        System.assertEquals(false, oauthAccessTokenResponseCode1.equals(oauthAccessTokenResponseCode3));
        System.assertEquals(false, oauthAccessTokenResponseCode2.equals(oauthAccessTokenResponseCode3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode1 = OASOauthAccessTokenResponseCode.getExample();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode2 = new OASOauthAccessTokenResponseCode();

        System.assertEquals(oauthAccessTokenResponseCode1.hashCode(), oauthAccessTokenResponseCode1.hashCode());
        System.assertEquals(oauthAccessTokenResponseCode2.hashCode(), oauthAccessTokenResponseCode2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode1 = OASOauthAccessTokenResponseCode.getExample();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode2 = OASOauthAccessTokenResponseCode.getExample();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode3 = new OASOauthAccessTokenResponseCode();
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode4 = new OASOauthAccessTokenResponseCode();

        System.assert(oauthAccessTokenResponseCode1.equals(oauthAccessTokenResponseCode2));
        System.assert(oauthAccessTokenResponseCode3.equals(oauthAccessTokenResponseCode4));
        System.assertEquals(oauthAccessTokenResponseCode1.hashCode(), oauthAccessTokenResponseCode2.hashCode());
        System.assertEquals(oauthAccessTokenResponseCode3.hashCode(), oauthAccessTokenResponseCode4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode = new OASOauthAccessTokenResponseCode();
        Map<String, String> x-property-mappings = oauthAccessTokenResponseCode.getx-property-mappings();
        System.assertEquals('responseType', x-property-mappings.get('response_type'));
        System.assertEquals('accessToken', x-property-mappings.get('access_token'));
        System.assertEquals('tokenType', x-property-mappings.get('token_type'));
        System.assertEquals('expiresIn', x-property-mappings.get('expires_in'));
        System.assertEquals('refreshToken', x-property-mappings.get('refresh_token'));
        System.assertEquals('refreshTokenExpiresIn', x-property-mappings.get('refresh_token_expires_in'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOauthAccessTokenResponseCode oauthAccessTokenResponseCode = new OASOauthAccessTokenResponseCode();
        System.assertEquals('bearer', oauthAccessTokenResponseCode.tokenType);
        System.assertEquals(null, oauthAccessTokenResponseCode.responseType);
        System.assertEquals(null, oauthAccessTokenResponseCode.accessToken);
        System.assertEquals(null, oauthAccessTokenResponseCode.expiresIn);
        System.assertEquals(null, oauthAccessTokenResponseCode.scope);
        System.assertEquals(null, oauthAccessTokenResponseCode.refreshToken);
        System.assertEquals(null, oauthAccessTokenResponseCode.refreshTokenExpiresIn);
    }
}
