@isTest
private class OASOauthAccessTokenRequestCodeTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode1 = OASOauthAccessTokenRequestCode.getExample();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode2 = oauthAccessTokenRequestCode1;
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode3 = new OASOauthAccessTokenRequestCode();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode4 = oauthAccessTokenRequestCode3;

        System.assert(oauthAccessTokenRequestCode1.equals(oauthAccessTokenRequestCode2));
        System.assert(oauthAccessTokenRequestCode2.equals(oauthAccessTokenRequestCode1));
        System.assert(oauthAccessTokenRequestCode1.equals(oauthAccessTokenRequestCode1));
        System.assert(oauthAccessTokenRequestCode3.equals(oauthAccessTokenRequestCode4));
        System.assert(oauthAccessTokenRequestCode4.equals(oauthAccessTokenRequestCode3));
        System.assert(oauthAccessTokenRequestCode3.equals(oauthAccessTokenRequestCode3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode1 = OASOauthAccessTokenRequestCode.getExample();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode2 = OASOauthAccessTokenRequestCode.getExample();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode3 = new OASOauthAccessTokenRequestCode();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode4 = new OASOauthAccessTokenRequestCode();

        System.assert(oauthAccessTokenRequestCode1.equals(oauthAccessTokenRequestCode2));
        System.assert(oauthAccessTokenRequestCode2.equals(oauthAccessTokenRequestCode1));
        System.assert(oauthAccessTokenRequestCode3.equals(oauthAccessTokenRequestCode4));
        System.assert(oauthAccessTokenRequestCode4.equals(oauthAccessTokenRequestCode3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode1 = OASOauthAccessTokenRequestCode.getExample();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode2 = new OASOauthAccessTokenRequestCode();

        System.assertEquals(false, oauthAccessTokenRequestCode1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenRequestCode2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode1 = OASOauthAccessTokenRequestCode.getExample();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode2 = new OASOauthAccessTokenRequestCode();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode3;

        System.assertEquals(false, oauthAccessTokenRequestCode1.equals(oauthAccessTokenRequestCode3));
        System.assertEquals(false, oauthAccessTokenRequestCode2.equals(oauthAccessTokenRequestCode3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode1 = OASOauthAccessTokenRequestCode.getExample();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode2 = new OASOauthAccessTokenRequestCode();

        System.assertEquals(oauthAccessTokenRequestCode1.hashCode(), oauthAccessTokenRequestCode1.hashCode());
        System.assertEquals(oauthAccessTokenRequestCode2.hashCode(), oauthAccessTokenRequestCode2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode1 = OASOauthAccessTokenRequestCode.getExample();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode2 = OASOauthAccessTokenRequestCode.getExample();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode3 = new OASOauthAccessTokenRequestCode();
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode4 = new OASOauthAccessTokenRequestCode();

        System.assert(oauthAccessTokenRequestCode1.equals(oauthAccessTokenRequestCode2));
        System.assert(oauthAccessTokenRequestCode3.equals(oauthAccessTokenRequestCode4));
        System.assertEquals(oauthAccessTokenRequestCode1.hashCode(), oauthAccessTokenRequestCode2.hashCode());
        System.assertEquals(oauthAccessTokenRequestCode3.hashCode(), oauthAccessTokenRequestCode4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenRequestCode oauthAccessTokenRequestCode = new OASOauthAccessTokenRequestCode();
        Map<String, String> x-property-mappings = oauthAccessTokenRequestCode.getx-property-mappings();
        System.assertEquals('grantType', x-property-mappings.get('grant_type'));
        System.assertEquals('redirectUri', x-property-mappings.get('redirect_uri'));
    }
}
