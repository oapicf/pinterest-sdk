@isTest
private class OASOauthAccessTokenResponseCodeAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf1 = OASOauthAccessTokenResponseCodeAllOf.getExample();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf2 = oauthAccessTokenResponseCodeAllOf1;
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf3 = new OASOauthAccessTokenResponseCodeAllOf();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf4 = oauthAccessTokenResponseCodeAllOf3;

        System.assert(oauthAccessTokenResponseCodeAllOf1.equals(oauthAccessTokenResponseCodeAllOf2));
        System.assert(oauthAccessTokenResponseCodeAllOf2.equals(oauthAccessTokenResponseCodeAllOf1));
        System.assert(oauthAccessTokenResponseCodeAllOf1.equals(oauthAccessTokenResponseCodeAllOf1));
        System.assert(oauthAccessTokenResponseCodeAllOf3.equals(oauthAccessTokenResponseCodeAllOf4));
        System.assert(oauthAccessTokenResponseCodeAllOf4.equals(oauthAccessTokenResponseCodeAllOf3));
        System.assert(oauthAccessTokenResponseCodeAllOf3.equals(oauthAccessTokenResponseCodeAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf1 = OASOauthAccessTokenResponseCodeAllOf.getExample();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf2 = OASOauthAccessTokenResponseCodeAllOf.getExample();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf3 = new OASOauthAccessTokenResponseCodeAllOf();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf4 = new OASOauthAccessTokenResponseCodeAllOf();

        System.assert(oauthAccessTokenResponseCodeAllOf1.equals(oauthAccessTokenResponseCodeAllOf2));
        System.assert(oauthAccessTokenResponseCodeAllOf2.equals(oauthAccessTokenResponseCodeAllOf1));
        System.assert(oauthAccessTokenResponseCodeAllOf3.equals(oauthAccessTokenResponseCodeAllOf4));
        System.assert(oauthAccessTokenResponseCodeAllOf4.equals(oauthAccessTokenResponseCodeAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf1 = OASOauthAccessTokenResponseCodeAllOf.getExample();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf2 = new OASOauthAccessTokenResponseCodeAllOf();

        System.assertEquals(false, oauthAccessTokenResponseCodeAllOf1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenResponseCodeAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf1 = OASOauthAccessTokenResponseCodeAllOf.getExample();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf2 = new OASOauthAccessTokenResponseCodeAllOf();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf3;

        System.assertEquals(false, oauthAccessTokenResponseCodeAllOf1.equals(oauthAccessTokenResponseCodeAllOf3));
        System.assertEquals(false, oauthAccessTokenResponseCodeAllOf2.equals(oauthAccessTokenResponseCodeAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf1 = OASOauthAccessTokenResponseCodeAllOf.getExample();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf2 = new OASOauthAccessTokenResponseCodeAllOf();

        System.assertEquals(oauthAccessTokenResponseCodeAllOf1.hashCode(), oauthAccessTokenResponseCodeAllOf1.hashCode());
        System.assertEquals(oauthAccessTokenResponseCodeAllOf2.hashCode(), oauthAccessTokenResponseCodeAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf1 = OASOauthAccessTokenResponseCodeAllOf.getExample();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf2 = OASOauthAccessTokenResponseCodeAllOf.getExample();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf3 = new OASOauthAccessTokenResponseCodeAllOf();
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf4 = new OASOauthAccessTokenResponseCodeAllOf();

        System.assert(oauthAccessTokenResponseCodeAllOf1.equals(oauthAccessTokenResponseCodeAllOf2));
        System.assert(oauthAccessTokenResponseCodeAllOf3.equals(oauthAccessTokenResponseCodeAllOf4));
        System.assertEquals(oauthAccessTokenResponseCodeAllOf1.hashCode(), oauthAccessTokenResponseCodeAllOf2.hashCode());
        System.assertEquals(oauthAccessTokenResponseCodeAllOf3.hashCode(), oauthAccessTokenResponseCodeAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf = new OASOauthAccessTokenResponseCodeAllOf();
        Map<String, String> x-property-mappings = oauthAccessTokenResponseCodeAllOf.getx-property-mappings();
        System.assertEquals('refreshToken', x-property-mappings.get('refresh_token'));
        System.assertEquals('refreshTokenExpiresIn', x-property-mappings.get('refresh_token_expires_in'));
    }
}
