@isTest
private class OASConversionTagResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionTagResponse conversionTagResponse1 = OASConversionTagResponse.getExample();
        OASConversionTagResponse conversionTagResponse2 = conversionTagResponse1;
        OASConversionTagResponse conversionTagResponse3 = new OASConversionTagResponse();
        OASConversionTagResponse conversionTagResponse4 = conversionTagResponse3;

        System.assert(conversionTagResponse1.equals(conversionTagResponse2));
        System.assert(conversionTagResponse2.equals(conversionTagResponse1));
        System.assert(conversionTagResponse1.equals(conversionTagResponse1));
        System.assert(conversionTagResponse3.equals(conversionTagResponse4));
        System.assert(conversionTagResponse4.equals(conversionTagResponse3));
        System.assert(conversionTagResponse3.equals(conversionTagResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionTagResponse conversionTagResponse1 = OASConversionTagResponse.getExample();
        OASConversionTagResponse conversionTagResponse2 = OASConversionTagResponse.getExample();
        OASConversionTagResponse conversionTagResponse3 = new OASConversionTagResponse();
        OASConversionTagResponse conversionTagResponse4 = new OASConversionTagResponse();

        System.assert(conversionTagResponse1.equals(conversionTagResponse2));
        System.assert(conversionTagResponse2.equals(conversionTagResponse1));
        System.assert(conversionTagResponse3.equals(conversionTagResponse4));
        System.assert(conversionTagResponse4.equals(conversionTagResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionTagResponse conversionTagResponse1 = OASConversionTagResponse.getExample();
        OASConversionTagResponse conversionTagResponse2 = new OASConversionTagResponse();

        System.assertEquals(false, conversionTagResponse1.equals('foo'));
        System.assertEquals(false, conversionTagResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionTagResponse conversionTagResponse1 = OASConversionTagResponse.getExample();
        OASConversionTagResponse conversionTagResponse2 = new OASConversionTagResponse();
        OASConversionTagResponse conversionTagResponse3;

        System.assertEquals(false, conversionTagResponse1.equals(conversionTagResponse3));
        System.assertEquals(false, conversionTagResponse2.equals(conversionTagResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionTagResponse conversionTagResponse1 = OASConversionTagResponse.getExample();
        OASConversionTagResponse conversionTagResponse2 = new OASConversionTagResponse();

        System.assertEquals(conversionTagResponse1.hashCode(), conversionTagResponse1.hashCode());
        System.assertEquals(conversionTagResponse2.hashCode(), conversionTagResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionTagResponse conversionTagResponse1 = OASConversionTagResponse.getExample();
        OASConversionTagResponse conversionTagResponse2 = OASConversionTagResponse.getExample();
        OASConversionTagResponse conversionTagResponse3 = new OASConversionTagResponse();
        OASConversionTagResponse conversionTagResponse4 = new OASConversionTagResponse();

        System.assert(conversionTagResponse1.equals(conversionTagResponse2));
        System.assert(conversionTagResponse3.equals(conversionTagResponse4));
        System.assertEquals(conversionTagResponse1.hashCode(), conversionTagResponse2.hashCode());
        System.assertEquals(conversionTagResponse3.hashCode(), conversionTagResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionTagResponse conversionTagResponse = new OASConversionTagResponse();
        Map<String, String> x-property-mappings = conversionTagResponse.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('codeSnippet', x-property-mappings.get('code_snippet'));
        System.assertEquals('enhancedMatchStatus', x-property-mappings.get('enhanced_match_status'));
        System.assertEquals('lastFiredTimeMs', x-property-mappings.get('last_fired_time_ms'));
    }
}
