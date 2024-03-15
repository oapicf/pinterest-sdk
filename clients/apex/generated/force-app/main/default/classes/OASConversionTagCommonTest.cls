@isTest
private class OASConversionTagCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionTagCommon conversionTagCommon1 = OASConversionTagCommon.getExample();
        OASConversionTagCommon conversionTagCommon2 = conversionTagCommon1;
        OASConversionTagCommon conversionTagCommon3 = new OASConversionTagCommon();
        OASConversionTagCommon conversionTagCommon4 = conversionTagCommon3;

        System.assert(conversionTagCommon1.equals(conversionTagCommon2));
        System.assert(conversionTagCommon2.equals(conversionTagCommon1));
        System.assert(conversionTagCommon1.equals(conversionTagCommon1));
        System.assert(conversionTagCommon3.equals(conversionTagCommon4));
        System.assert(conversionTagCommon4.equals(conversionTagCommon3));
        System.assert(conversionTagCommon3.equals(conversionTagCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionTagCommon conversionTagCommon1 = OASConversionTagCommon.getExample();
        OASConversionTagCommon conversionTagCommon2 = OASConversionTagCommon.getExample();
        OASConversionTagCommon conversionTagCommon3 = new OASConversionTagCommon();
        OASConversionTagCommon conversionTagCommon4 = new OASConversionTagCommon();

        System.assert(conversionTagCommon1.equals(conversionTagCommon2));
        System.assert(conversionTagCommon2.equals(conversionTagCommon1));
        System.assert(conversionTagCommon3.equals(conversionTagCommon4));
        System.assert(conversionTagCommon4.equals(conversionTagCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionTagCommon conversionTagCommon1 = OASConversionTagCommon.getExample();
        OASConversionTagCommon conversionTagCommon2 = new OASConversionTagCommon();

        System.assertEquals(false, conversionTagCommon1.equals('foo'));
        System.assertEquals(false, conversionTagCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionTagCommon conversionTagCommon1 = OASConversionTagCommon.getExample();
        OASConversionTagCommon conversionTagCommon2 = new OASConversionTagCommon();
        OASConversionTagCommon conversionTagCommon3;

        System.assertEquals(false, conversionTagCommon1.equals(conversionTagCommon3));
        System.assertEquals(false, conversionTagCommon2.equals(conversionTagCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionTagCommon conversionTagCommon1 = OASConversionTagCommon.getExample();
        OASConversionTagCommon conversionTagCommon2 = new OASConversionTagCommon();

        System.assertEquals(conversionTagCommon1.hashCode(), conversionTagCommon1.hashCode());
        System.assertEquals(conversionTagCommon2.hashCode(), conversionTagCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionTagCommon conversionTagCommon1 = OASConversionTagCommon.getExample();
        OASConversionTagCommon conversionTagCommon2 = OASConversionTagCommon.getExample();
        OASConversionTagCommon conversionTagCommon3 = new OASConversionTagCommon();
        OASConversionTagCommon conversionTagCommon4 = new OASConversionTagCommon();

        System.assert(conversionTagCommon1.equals(conversionTagCommon2));
        System.assert(conversionTagCommon3.equals(conversionTagCommon4));
        System.assertEquals(conversionTagCommon1.hashCode(), conversionTagCommon2.hashCode());
        System.assertEquals(conversionTagCommon3.hashCode(), conversionTagCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionTagCommon conversionTagCommon = new OASConversionTagCommon();
        Map<String, String> x-property-mappings = conversionTagCommon.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('codeSnippet', x-property-mappings.get('code_snippet'));
        System.assertEquals('enhancedMatchStatus', x-property-mappings.get('enhanced_match_status'));
        System.assertEquals('lastFiredTimeMs', x-property-mappings.get('last_fired_time_ms'));
    }
}
