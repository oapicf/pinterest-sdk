@isTest
private class OASOauthAccessTokenResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenResponse oauthAccessTokenResponse1 = OASOauthAccessTokenResponse.getExample();
        OASOauthAccessTokenResponse oauthAccessTokenResponse2 = oauthAccessTokenResponse1;
        OASOauthAccessTokenResponse oauthAccessTokenResponse3 = new OASOauthAccessTokenResponse();
        OASOauthAccessTokenResponse oauthAccessTokenResponse4 = oauthAccessTokenResponse3;

        System.assert(oauthAccessTokenResponse1.equals(oauthAccessTokenResponse2));
        System.assert(oauthAccessTokenResponse2.equals(oauthAccessTokenResponse1));
        System.assert(oauthAccessTokenResponse1.equals(oauthAccessTokenResponse1));
        System.assert(oauthAccessTokenResponse3.equals(oauthAccessTokenResponse4));
        System.assert(oauthAccessTokenResponse4.equals(oauthAccessTokenResponse3));
        System.assert(oauthAccessTokenResponse3.equals(oauthAccessTokenResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenResponse oauthAccessTokenResponse1 = OASOauthAccessTokenResponse.getExample();
        OASOauthAccessTokenResponse oauthAccessTokenResponse2 = OASOauthAccessTokenResponse.getExample();
        OASOauthAccessTokenResponse oauthAccessTokenResponse3 = new OASOauthAccessTokenResponse();
        OASOauthAccessTokenResponse oauthAccessTokenResponse4 = new OASOauthAccessTokenResponse();

        System.assert(oauthAccessTokenResponse1.equals(oauthAccessTokenResponse2));
        System.assert(oauthAccessTokenResponse2.equals(oauthAccessTokenResponse1));
        System.assert(oauthAccessTokenResponse3.equals(oauthAccessTokenResponse4));
        System.assert(oauthAccessTokenResponse4.equals(oauthAccessTokenResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenResponse oauthAccessTokenResponse1 = OASOauthAccessTokenResponse.getExample();
        OASOauthAccessTokenResponse oauthAccessTokenResponse2 = new OASOauthAccessTokenResponse();

        System.assertEquals(false, oauthAccessTokenResponse1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenResponse oauthAccessTokenResponse1 = OASOauthAccessTokenResponse.getExample();
        OASOauthAccessTokenResponse oauthAccessTokenResponse2 = new OASOauthAccessTokenResponse();
        OASOauthAccessTokenResponse oauthAccessTokenResponse3;

        System.assertEquals(false, oauthAccessTokenResponse1.equals(oauthAccessTokenResponse3));
        System.assertEquals(false, oauthAccessTokenResponse2.equals(oauthAccessTokenResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenResponse oauthAccessTokenResponse1 = OASOauthAccessTokenResponse.getExample();
        OASOauthAccessTokenResponse oauthAccessTokenResponse2 = new OASOauthAccessTokenResponse();

        System.assertEquals(oauthAccessTokenResponse1.hashCode(), oauthAccessTokenResponse1.hashCode());
        System.assertEquals(oauthAccessTokenResponse2.hashCode(), oauthAccessTokenResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenResponse oauthAccessTokenResponse1 = OASOauthAccessTokenResponse.getExample();
        OASOauthAccessTokenResponse oauthAccessTokenResponse2 = OASOauthAccessTokenResponse.getExample();
        OASOauthAccessTokenResponse oauthAccessTokenResponse3 = new OASOauthAccessTokenResponse();
        OASOauthAccessTokenResponse oauthAccessTokenResponse4 = new OASOauthAccessTokenResponse();

        System.assert(oauthAccessTokenResponse1.equals(oauthAccessTokenResponse2));
        System.assert(oauthAccessTokenResponse3.equals(oauthAccessTokenResponse4));
        System.assertEquals(oauthAccessTokenResponse1.hashCode(), oauthAccessTokenResponse2.hashCode());
        System.assertEquals(oauthAccessTokenResponse3.hashCode(), oauthAccessTokenResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenResponse oauthAccessTokenResponse = new OASOauthAccessTokenResponse();
        Map<String, String> x-property-mappings = oauthAccessTokenResponse.getx-property-mappings();
        System.assertEquals('responseType', x-property-mappings.get('response_type'));
        System.assertEquals('accessToken', x-property-mappings.get('access_token'));
        System.assertEquals('tokenType', x-property-mappings.get('token_type'));
        System.assertEquals('expiresIn', x-property-mappings.get('expires_in'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOauthAccessTokenResponse oauthAccessTokenResponse = new OASOauthAccessTokenResponse();
        System.assertEquals('bearer', oauthAccessTokenResponse.tokenType);
        System.assertEquals(null, oauthAccessTokenResponse.responseType);
        System.assertEquals(null, oauthAccessTokenResponse.accessToken);
        System.assertEquals(null, oauthAccessTokenResponse.expiresIn);
        System.assertEquals(null, oauthAccessTokenResponse.scope);
    }
}
