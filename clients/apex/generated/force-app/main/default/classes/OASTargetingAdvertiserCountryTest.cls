@isTest
private class OASTargetingAdvertiserCountryTest {
    @isTest
    private static void allowableValues() {
        Set<OASTargetingAdvertiserCountry> expected = new Set<OASTargetingAdvertiserCountry>{
            OASTargetingAdvertiserCountry.US,
            OASTargetingAdvertiserCountry.GB,
            OASTargetingAdvertiserCountry.CA,
            OASTargetingAdvertiserCountry.IE,
            OASTargetingAdvertiserCountry.AU,
            OASTargetingAdvertiserCountry.NZ,
            OASTargetingAdvertiserCountry.FR,
            OASTargetingAdvertiserCountry.SE,
            OASTargetingAdvertiserCountry.IL,
            OASTargetingAdvertiserCountry.DE,
            OASTargetingAdvertiserCountry.AT,
            OASTargetingAdvertiserCountry.IT,
            OASTargetingAdvertiserCountry.ES,
            OASTargetingAdvertiserCountry.NL,
            OASTargetingAdvertiserCountry.BE,
            OASTargetingAdvertiserCountry.PT,
            OASTargetingAdvertiserCountry.CH,
            OASTargetingAdvertiserCountry.HK,
            OASTargetingAdvertiserCountry.JP,
            OASTargetingAdvertiserCountry.KR,
            OASTargetingAdvertiserCountry.SG,
            OASTargetingAdvertiserCountry.NO,
            OASTargetingAdvertiserCountry.DK,
            OASTargetingAdvertiserCountry.FI,
            OASTargetingAdvertiserCountry.CY,
            OASTargetingAdvertiserCountry.LU,
            OASTargetingAdvertiserCountry.MT,
            OASTargetingAdvertiserCountry.PL,
            OASTargetingAdvertiserCountry.RO,
            OASTargetingAdvertiserCountry.HU,
            OASTargetingAdvertiserCountry.CZ,
            OASTargetingAdvertiserCountry.GR,
            OASTargetingAdvertiserCountry.SK,
            OASTargetingAdvertiserCountry.BR,
            OASTargetingAdvertiserCountry.MX,
            OASTargetingAdvertiserCountry.AR,
            OASTargetingAdvertiserCountry.CL,
            OASTargetingAdvertiserCountry.CO
        };
        Set<OASTargetingAdvertiserCountry> actual  = new Set<OASTargetingAdvertiserCountry>(OASTargetingAdvertiserCountry.values());
        System.assertEquals(expected, actual);
    }
}
