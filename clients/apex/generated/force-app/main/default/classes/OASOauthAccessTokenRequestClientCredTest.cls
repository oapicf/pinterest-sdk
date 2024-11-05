@isTest
private class OASOauthAccessTokenRequestClientCredTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials1 = OASOauthAccessTokenRequestClientCred.getExample();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials2 = oauthAccessTokenRequestClientCredentials1;
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials3 = new OASOauthAccessTokenRequestClientCred();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials4 = oauthAccessTokenRequestClientCredentials3;

        System.assert(oauthAccessTokenRequestClientCredentials1.equals(oauthAccessTokenRequestClientCredentials2));
        System.assert(oauthAccessTokenRequestClientCredentials2.equals(oauthAccessTokenRequestClientCredentials1));
        System.assert(oauthAccessTokenRequestClientCredentials1.equals(oauthAccessTokenRequestClientCredentials1));
        System.assert(oauthAccessTokenRequestClientCredentials3.equals(oauthAccessTokenRequestClientCredentials4));
        System.assert(oauthAccessTokenRequestClientCredentials4.equals(oauthAccessTokenRequestClientCredentials3));
        System.assert(oauthAccessTokenRequestClientCredentials3.equals(oauthAccessTokenRequestClientCredentials3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials1 = OASOauthAccessTokenRequestClientCred.getExample();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials2 = OASOauthAccessTokenRequestClientCred.getExample();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials3 = new OASOauthAccessTokenRequestClientCred();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials4 = new OASOauthAccessTokenRequestClientCred();

        System.assert(oauthAccessTokenRequestClientCredentials1.equals(oauthAccessTokenRequestClientCredentials2));
        System.assert(oauthAccessTokenRequestClientCredentials2.equals(oauthAccessTokenRequestClientCredentials1));
        System.assert(oauthAccessTokenRequestClientCredentials3.equals(oauthAccessTokenRequestClientCredentials4));
        System.assert(oauthAccessTokenRequestClientCredentials4.equals(oauthAccessTokenRequestClientCredentials3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials1 = OASOauthAccessTokenRequestClientCred.getExample();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials2 = new OASOauthAccessTokenRequestClientCred();

        System.assertEquals(false, oauthAccessTokenRequestClientCredentials1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenRequestClientCredentials2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials1 = OASOauthAccessTokenRequestClientCred.getExample();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials2 = new OASOauthAccessTokenRequestClientCred();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials3;

        System.assertEquals(false, oauthAccessTokenRequestClientCredentials1.equals(oauthAccessTokenRequestClientCredentials3));
        System.assertEquals(false, oauthAccessTokenRequestClientCredentials2.equals(oauthAccessTokenRequestClientCredentials3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials1 = OASOauthAccessTokenRequestClientCred.getExample();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials2 = new OASOauthAccessTokenRequestClientCred();

        System.assertEquals(oauthAccessTokenRequestClientCredentials1.hashCode(), oauthAccessTokenRequestClientCredentials1.hashCode());
        System.assertEquals(oauthAccessTokenRequestClientCredentials2.hashCode(), oauthAccessTokenRequestClientCredentials2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials1 = OASOauthAccessTokenRequestClientCred.getExample();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials2 = OASOauthAccessTokenRequestClientCred.getExample();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials3 = new OASOauthAccessTokenRequestClientCred();
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials4 = new OASOauthAccessTokenRequestClientCred();

        System.assert(oauthAccessTokenRequestClientCredentials1.equals(oauthAccessTokenRequestClientCredentials2));
        System.assert(oauthAccessTokenRequestClientCredentials3.equals(oauthAccessTokenRequestClientCredentials4));
        System.assertEquals(oauthAccessTokenRequestClientCredentials1.hashCode(), oauthAccessTokenRequestClientCredentials2.hashCode());
        System.assertEquals(oauthAccessTokenRequestClientCredentials3.hashCode(), oauthAccessTokenRequestClientCredentials4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenRequestClientCred oauthAccessTokenRequestClientCredentials = new OASOauthAccessTokenRequestClientCred();
        Map<String, String> x-property-mappings = oauthAccessTokenRequestClientCredentials.getx-property-mappings();
        System.assertEquals('grantType', x-property-mappings.get('grant_type'));
    }
}
