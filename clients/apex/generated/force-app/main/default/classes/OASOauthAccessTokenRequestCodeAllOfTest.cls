@isTest
private class OASOauthAccessTokenRequestCodeAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf1 = OASOauthAccessTokenRequestCodeAllOf.getExample();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf2 = oauthAccessTokenRequestCodeAllOf1;
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf3 = new OASOauthAccessTokenRequestCodeAllOf();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf4 = oauthAccessTokenRequestCodeAllOf3;

        System.assert(oauthAccessTokenRequestCodeAllOf1.equals(oauthAccessTokenRequestCodeAllOf2));
        System.assert(oauthAccessTokenRequestCodeAllOf2.equals(oauthAccessTokenRequestCodeAllOf1));
        System.assert(oauthAccessTokenRequestCodeAllOf1.equals(oauthAccessTokenRequestCodeAllOf1));
        System.assert(oauthAccessTokenRequestCodeAllOf3.equals(oauthAccessTokenRequestCodeAllOf4));
        System.assert(oauthAccessTokenRequestCodeAllOf4.equals(oauthAccessTokenRequestCodeAllOf3));
        System.assert(oauthAccessTokenRequestCodeAllOf3.equals(oauthAccessTokenRequestCodeAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf1 = OASOauthAccessTokenRequestCodeAllOf.getExample();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf2 = OASOauthAccessTokenRequestCodeAllOf.getExample();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf3 = new OASOauthAccessTokenRequestCodeAllOf();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf4 = new OASOauthAccessTokenRequestCodeAllOf();

        System.assert(oauthAccessTokenRequestCodeAllOf1.equals(oauthAccessTokenRequestCodeAllOf2));
        System.assert(oauthAccessTokenRequestCodeAllOf2.equals(oauthAccessTokenRequestCodeAllOf1));
        System.assert(oauthAccessTokenRequestCodeAllOf3.equals(oauthAccessTokenRequestCodeAllOf4));
        System.assert(oauthAccessTokenRequestCodeAllOf4.equals(oauthAccessTokenRequestCodeAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf1 = OASOauthAccessTokenRequestCodeAllOf.getExample();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf2 = new OASOauthAccessTokenRequestCodeAllOf();

        System.assertEquals(false, oauthAccessTokenRequestCodeAllOf1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenRequestCodeAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf1 = OASOauthAccessTokenRequestCodeAllOf.getExample();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf2 = new OASOauthAccessTokenRequestCodeAllOf();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf3;

        System.assertEquals(false, oauthAccessTokenRequestCodeAllOf1.equals(oauthAccessTokenRequestCodeAllOf3));
        System.assertEquals(false, oauthAccessTokenRequestCodeAllOf2.equals(oauthAccessTokenRequestCodeAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf1 = OASOauthAccessTokenRequestCodeAllOf.getExample();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf2 = new OASOauthAccessTokenRequestCodeAllOf();

        System.assertEquals(oauthAccessTokenRequestCodeAllOf1.hashCode(), oauthAccessTokenRequestCodeAllOf1.hashCode());
        System.assertEquals(oauthAccessTokenRequestCodeAllOf2.hashCode(), oauthAccessTokenRequestCodeAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf1 = OASOauthAccessTokenRequestCodeAllOf.getExample();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf2 = OASOauthAccessTokenRequestCodeAllOf.getExample();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf3 = new OASOauthAccessTokenRequestCodeAllOf();
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf4 = new OASOauthAccessTokenRequestCodeAllOf();

        System.assert(oauthAccessTokenRequestCodeAllOf1.equals(oauthAccessTokenRequestCodeAllOf2));
        System.assert(oauthAccessTokenRequestCodeAllOf3.equals(oauthAccessTokenRequestCodeAllOf4));
        System.assertEquals(oauthAccessTokenRequestCodeAllOf1.hashCode(), oauthAccessTokenRequestCodeAllOf2.hashCode());
        System.assertEquals(oauthAccessTokenRequestCodeAllOf3.hashCode(), oauthAccessTokenRequestCodeAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenRequestCodeAllOf oauthAccessTokenRequestCodeAllOf = new OASOauthAccessTokenRequestCodeAllOf();
        Map<String, String> x-property-mappings = oauthAccessTokenRequestCodeAllOf.getx-property-mappings();
        System.assertEquals('redirectUri', x-property-mappings.get('redirect_uri'));
    }
}
