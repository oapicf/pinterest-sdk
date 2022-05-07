@isTest
private class OASOauthAccessTokenRequestRefreshAllTest {
    @isTest
    private static void equalsSameInstance() {
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf1 = OASOauthAccessTokenRequestRefreshAll.getExample();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf2 = oauthAccessTokenRequestRefreshAllOf1;
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf3 = new OASOauthAccessTokenRequestRefreshAll();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf4 = oauthAccessTokenRequestRefreshAllOf3;

        System.assert(oauthAccessTokenRequestRefreshAllOf1.equals(oauthAccessTokenRequestRefreshAllOf2));
        System.assert(oauthAccessTokenRequestRefreshAllOf2.equals(oauthAccessTokenRequestRefreshAllOf1));
        System.assert(oauthAccessTokenRequestRefreshAllOf1.equals(oauthAccessTokenRequestRefreshAllOf1));
        System.assert(oauthAccessTokenRequestRefreshAllOf3.equals(oauthAccessTokenRequestRefreshAllOf4));
        System.assert(oauthAccessTokenRequestRefreshAllOf4.equals(oauthAccessTokenRequestRefreshAllOf3));
        System.assert(oauthAccessTokenRequestRefreshAllOf3.equals(oauthAccessTokenRequestRefreshAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf1 = OASOauthAccessTokenRequestRefreshAll.getExample();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf2 = OASOauthAccessTokenRequestRefreshAll.getExample();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf3 = new OASOauthAccessTokenRequestRefreshAll();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf4 = new OASOauthAccessTokenRequestRefreshAll();

        System.assert(oauthAccessTokenRequestRefreshAllOf1.equals(oauthAccessTokenRequestRefreshAllOf2));
        System.assert(oauthAccessTokenRequestRefreshAllOf2.equals(oauthAccessTokenRequestRefreshAllOf1));
        System.assert(oauthAccessTokenRequestRefreshAllOf3.equals(oauthAccessTokenRequestRefreshAllOf4));
        System.assert(oauthAccessTokenRequestRefreshAllOf4.equals(oauthAccessTokenRequestRefreshAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf1 = OASOauthAccessTokenRequestRefreshAll.getExample();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf2 = new OASOauthAccessTokenRequestRefreshAll();

        System.assertEquals(false, oauthAccessTokenRequestRefreshAllOf1.equals('foo'));
        System.assertEquals(false, oauthAccessTokenRequestRefreshAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf1 = OASOauthAccessTokenRequestRefreshAll.getExample();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf2 = new OASOauthAccessTokenRequestRefreshAll();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf3;

        System.assertEquals(false, oauthAccessTokenRequestRefreshAllOf1.equals(oauthAccessTokenRequestRefreshAllOf3));
        System.assertEquals(false, oauthAccessTokenRequestRefreshAllOf2.equals(oauthAccessTokenRequestRefreshAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf1 = OASOauthAccessTokenRequestRefreshAll.getExample();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf2 = new OASOauthAccessTokenRequestRefreshAll();

        System.assertEquals(oauthAccessTokenRequestRefreshAllOf1.hashCode(), oauthAccessTokenRequestRefreshAllOf1.hashCode());
        System.assertEquals(oauthAccessTokenRequestRefreshAllOf2.hashCode(), oauthAccessTokenRequestRefreshAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf1 = OASOauthAccessTokenRequestRefreshAll.getExample();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf2 = OASOauthAccessTokenRequestRefreshAll.getExample();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf3 = new OASOauthAccessTokenRequestRefreshAll();
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf4 = new OASOauthAccessTokenRequestRefreshAll();

        System.assert(oauthAccessTokenRequestRefreshAllOf1.equals(oauthAccessTokenRequestRefreshAllOf2));
        System.assert(oauthAccessTokenRequestRefreshAllOf3.equals(oauthAccessTokenRequestRefreshAllOf4));
        System.assertEquals(oauthAccessTokenRequestRefreshAllOf1.hashCode(), oauthAccessTokenRequestRefreshAllOf2.hashCode());
        System.assertEquals(oauthAccessTokenRequestRefreshAllOf3.hashCode(), oauthAccessTokenRequestRefreshAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOauthAccessTokenRequestRefreshAll oauthAccessTokenRequestRefreshAllOf = new OASOauthAccessTokenRequestRefreshAll();
        Map<String, String> x-property-mappings = oauthAccessTokenRequestRefreshAllOf.getx-property-mappings();
        System.assertEquals('refreshToken', x-property-mappings.get('refresh_token'));
    }
}
