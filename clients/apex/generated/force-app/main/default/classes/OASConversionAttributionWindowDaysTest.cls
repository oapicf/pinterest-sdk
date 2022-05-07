@isTest
private class OASConversionAttributionWindowDaysTest {
    @isTest
    private static void allowableValues() {
        Set<OASConversionAttributionWindowDays> expected = new Set<OASConversionAttributionWindowDays>{
            OASConversionAttributionWindowDays.NUMBER_1,
            OASConversionAttributionWindowDays.NUMBER_7,
            OASConversionAttributionWindowDays.NUMBER_30,
            OASConversionAttributionWindowDays.NUMBER_60
        };
        Set<OASConversionAttributionWindowDays> actual  = new Set<OASConversionAttributionWindowDays>(OASConversionAttributionWindowDays.values());
        System.assertEquals(expected, actual);
    }
}
