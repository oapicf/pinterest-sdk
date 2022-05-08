@isTest
private class OASOauthAccessTokenRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenRequest oauthAccessTokenRequest1 = OASOauthAccessTokenRequest.getExample();
        OASOauthAccessTokenRequest oauthAccessTokenRequest2 = oauthAccessTokenRequest1;
        OASOauthAccessTokenRequest oauthAccessTokenRequest3 = new OASOauthAccessTokenRequest();
        OASOauthAccessTokenRequest oauthAccessTokenRequest4 = oauthAccessTokenRequest3;

        System.assert(oauthAccessTokenRequest1.equals(oauthAccessTokenRequest2));
        System.assert(oauthAccessTokenRequest2.equals(oauthAccessTokenRequest1));
        System.assert(oauthAccessTokenRequest1.equals(oauthAccessTokenRequest1));
        System.assert(oauthAccessTokenRequest3.equals(oauthAccessTokenRequest4));
        System.assert(oauthAccessTokenRequest4.equals(oauthAccessTokenRequest3));
        System.assert(oauthAccessTokenRequest3.equals(oauthAccessTokenRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenRequest oauthAccessTokenRequest1 = OASOauthAccessTokenRequest.getExample();
        OASOauthAccessTokenRequest oauthAccessTokenRequest2 = OASOauthAccessTokenRequest.getExample();
        OASOauthAccessTokenRequest oauthAccessTokenRequest3 = new OASOauthAccessTokenRequest();
        OASOauthAccessTokenRequest oauthAccessTokenRequest4 = new OASOauthAccessTokenRequest();

        System.assert(oauthAccessTokenRequest1.equals(oauthAccessTokenRequest2));
        System.assert(oauthAccessTokenRequest2.equals(oauthAccessTokenRequest1));
        System.assert(oauthAccessTokenRequest3.equals(oauthAccessTokenRequest4));
        System.assert(oauthAccessTokenRequest4.equals(oauthAccessTokenRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenRequest oauthAccessTokenRequest1 = OASOauthAccessTokenRequest.getExample();
        OASOauthAccessTokenRequest oauthAccessTokenRequest2 = new OASOauthAccessTokenRequest();

        System.assertEquals(false, oauthAccessTokenRequest1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenRequest oauthAccessTokenRequest1 = OASOauthAccessTokenRequest.getExample();
        OASOauthAccessTokenRequest oauthAccessTokenRequest2 = new OASOauthAccessTokenRequest();
        OASOauthAccessTokenRequest oauthAccessTokenRequest3;

        System.assertEquals(false, oauthAccessTokenRequest1.equals(oauthAccessTokenRequest3));
        System.assertEquals(false, oauthAccessTokenRequest2.equals(oauthAccessTokenRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenRequest oauthAccessTokenRequest1 = OASOauthAccessTokenRequest.getExample();
        OASOauthAccessTokenRequest oauthAccessTokenRequest2 = new OASOauthAccessTokenRequest();

        System.assertEquals(oauthAccessTokenRequest1.hashCode(), oauthAccessTokenRequest1.hashCode());
        System.assertEquals(oauthAccessTokenRequest2.hashCode(), oauthAccessTokenRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenRequest oauthAccessTokenRequest1 = OASOauthAccessTokenRequest.getExample();
        OASOauthAccessTokenRequest oauthAccessTokenRequest2 = OASOauthAccessTokenRequest.getExample();
        OASOauthAccessTokenRequest oauthAccessTokenRequest3 = new OASOauthAccessTokenRequest();
        OASOauthAccessTokenRequest oauthAccessTokenRequest4 = new OASOauthAccessTokenRequest();

        System.assert(oauthAccessTokenRequest1.equals(oauthAccessTokenRequest2));
        System.assert(oauthAccessTokenRequest3.equals(oauthAccessTokenRequest4));
        System.assertEquals(oauthAccessTokenRequest1.hashCode(), oauthAccessTokenRequest2.hashCode());
        System.assertEquals(oauthAccessTokenRequest3.hashCode(), oauthAccessTokenRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenRequest oauthAccessTokenRequest = new OASOauthAccessTokenRequest();
        Map<String, String> x-property-mappings = oauthAccessTokenRequest.getx-property-mappings();
        System.assertEquals('grantType', x-property-mappings.get('grant_type'));
    }
}
