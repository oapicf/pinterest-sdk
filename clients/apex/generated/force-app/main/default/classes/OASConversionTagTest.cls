@isTest
private class OASConversionTagTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionTag conversionTag1 = OASConversionTag.getExample();
        OASConversionTag conversionTag2 = conversionTag1;
        OASConversionTag conversionTag3 = new OASConversionTag();
        OASConversionTag conversionTag4 = conversionTag3;

        System.assert(conversionTag1.equals(conversionTag2));
        System.assert(conversionTag2.equals(conversionTag1));
        System.assert(conversionTag1.equals(conversionTag1));
        System.assert(conversionTag3.equals(conversionTag4));
        System.assert(conversionTag4.equals(conversionTag3));
        System.assert(conversionTag3.equals(conversionTag3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionTag conversionTag1 = OASConversionTag.getExample();
        OASConversionTag conversionTag2 = OASConversionTag.getExample();
        OASConversionTag conversionTag3 = new OASConversionTag();
        OASConversionTag conversionTag4 = new OASConversionTag();

        System.assert(conversionTag1.equals(conversionTag2));
        System.assert(conversionTag2.equals(conversionTag1));
        System.assert(conversionTag3.equals(conversionTag4));
        System.assert(conversionTag4.equals(conversionTag3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionTag conversionTag1 = OASConversionTag.getExample();
        OASConversionTag conversionTag2 = new OASConversionTag();

        System.assertEquals(false, conversionTag1.equals('foo'));
        System.assertEquals(false, conversionTag2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionTag conversionTag1 = OASConversionTag.getExample();
        OASConversionTag conversionTag2 = new OASConversionTag();
        OASConversionTag conversionTag3;

        System.assertEquals(false, conversionTag1.equals(conversionTag3));
        System.assertEquals(false, conversionTag2.equals(conversionTag3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionTag conversionTag1 = OASConversionTag.getExample();
        OASConversionTag conversionTag2 = new OASConversionTag();

        System.assertEquals(conversionTag1.hashCode(), conversionTag1.hashCode());
        System.assertEquals(conversionTag2.hashCode(), conversionTag2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionTag conversionTag1 = OASConversionTag.getExample();
        OASConversionTag conversionTag2 = OASConversionTag.getExample();
        OASConversionTag conversionTag3 = new OASConversionTag();
        OASConversionTag conversionTag4 = new OASConversionTag();

        System.assert(conversionTag1.equals(conversionTag2));
        System.assert(conversionTag3.equals(conversionTag4));
        System.assertEquals(conversionTag1.hashCode(), conversionTag2.hashCode());
        System.assertEquals(conversionTag3.hashCode(), conversionTag4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionTag conversionTag = new OASConversionTag();
        Map<String, String> x-property-mappings = conversionTag.getx-property-mappings();
        System.assertEquals('codeSnippet', x-property-mappings.get('code_snippet'));
        System.assertEquals('enhancedMatchStatus', x-property-mappings.get('enhanced_match_status'));
        System.assertEquals('lastFiredTimeMs', x-property-mappings.get('last_fired_time_ms'));
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
    }
}
