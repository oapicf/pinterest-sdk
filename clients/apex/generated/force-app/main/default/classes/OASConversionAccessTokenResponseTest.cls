@isTest
private class OASConversionAccessTokenResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionAccessTokenResponse conversionAccessTokenResponse1 = OASConversionAccessTokenResponse.getExample();
        OASConversionAccessTokenResponse conversionAccessTokenResponse2 = conversionAccessTokenResponse1;
        OASConversionAccessTokenResponse conversionAccessTokenResponse3 = new OASConversionAccessTokenResponse();
        OASConversionAccessTokenResponse conversionAccessTokenResponse4 = conversionAccessTokenResponse3;

        System.assert(conversionAccessTokenResponse1.equals(conversionAccessTokenResponse2));
        System.assert(conversionAccessTokenResponse2.equals(conversionAccessTokenResponse1));
        System.assert(conversionAccessTokenResponse1.equals(conversionAccessTokenResponse1));
        System.assert(conversionAccessTokenResponse3.equals(conversionAccessTokenResponse4));
        System.assert(conversionAccessTokenResponse4.equals(conversionAccessTokenResponse3));
        System.assert(conversionAccessTokenResponse3.equals(conversionAccessTokenResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionAccessTokenResponse conversionAccessTokenResponse1 = OASConversionAccessTokenResponse.getExample();
        OASConversionAccessTokenResponse conversionAccessTokenResponse2 = OASConversionAccessTokenResponse.getExample();
        OASConversionAccessTokenResponse conversionAccessTokenResponse3 = new OASConversionAccessTokenResponse();
        OASConversionAccessTokenResponse conversionAccessTokenResponse4 = new OASConversionAccessTokenResponse();

        System.assert(conversionAccessTokenResponse1.equals(conversionAccessTokenResponse2));
        System.assert(conversionAccessTokenResponse2.equals(conversionAccessTokenResponse1));
        System.assert(conversionAccessTokenResponse3.equals(conversionAccessTokenResponse4));
        System.assert(conversionAccessTokenResponse4.equals(conversionAccessTokenResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionAccessTokenResponse conversionAccessTokenResponse1 = OASConversionAccessTokenResponse.getExample();
        OASConversionAccessTokenResponse conversionAccessTokenResponse2 = new OASConversionAccessTokenResponse();

        System.assertEquals(false, conversionAccessTokenResponse1.equals('foo'));
        System.assertEquals(false, conversionAccessTokenResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionAccessTokenResponse conversionAccessTokenResponse1 = OASConversionAccessTokenResponse.getExample();
        OASConversionAccessTokenResponse conversionAccessTokenResponse2 = new OASConversionAccessTokenResponse();
        OASConversionAccessTokenResponse conversionAccessTokenResponse3;

        System.assertEquals(false, conversionAccessTokenResponse1.equals(conversionAccessTokenResponse3));
        System.assertEquals(false, conversionAccessTokenResponse2.equals(conversionAccessTokenResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionAccessTokenResponse conversionAccessTokenResponse1 = OASConversionAccessTokenResponse.getExample();
        OASConversionAccessTokenResponse conversionAccessTokenResponse2 = new OASConversionAccessTokenResponse();

        System.assertEquals(conversionAccessTokenResponse1.hashCode(), conversionAccessTokenResponse1.hashCode());
        System.assertEquals(conversionAccessTokenResponse2.hashCode(), conversionAccessTokenResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionAccessTokenResponse conversionAccessTokenResponse1 = OASConversionAccessTokenResponse.getExample();
        OASConversionAccessTokenResponse conversionAccessTokenResponse2 = OASConversionAccessTokenResponse.getExample();
        OASConversionAccessTokenResponse conversionAccessTokenResponse3 = new OASConversionAccessTokenResponse();
        OASConversionAccessTokenResponse conversionAccessTokenResponse4 = new OASConversionAccessTokenResponse();

        System.assert(conversionAccessTokenResponse1.equals(conversionAccessTokenResponse2));
        System.assert(conversionAccessTokenResponse3.equals(conversionAccessTokenResponse4));
        System.assertEquals(conversionAccessTokenResponse1.hashCode(), conversionAccessTokenResponse2.hashCode());
        System.assertEquals(conversionAccessTokenResponse3.hashCode(), conversionAccessTokenResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionAccessTokenResponse conversionAccessTokenResponse = new OASConversionAccessTokenResponse();
        Map<String, String> x-property-mappings = conversionAccessTokenResponse.getx-property-mappings();
        System.assertEquals('accessToken', x-property-mappings.get('access_token'));
        System.assertEquals('tokenType', x-property-mappings.get('token_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionAccessTokenResponse conversionAccessTokenResponse = new OASConversionAccessTokenResponse();
        System.assertEquals('conversion', conversionAccessTokenResponse.tokenType);
        System.assertEquals(null, conversionAccessTokenResponse.accessToken);
    }
}
