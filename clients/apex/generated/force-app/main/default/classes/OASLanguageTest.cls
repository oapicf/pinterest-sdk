@isTest
private class OASLanguageTest {
    @isTest
    private static void allowableValues() {
        Set<OASLanguage> expected = new Set<OASLanguage>{
            OASLanguage.AM,
            OASLanguage.AR,
            OASLanguage.AZ,
            OASLanguage.BG,
            OASLanguage.BN,
            OASLanguage.BS,
            OASLanguage.CA,
            OASLanguage.CS,
            OASLanguage.DA,
            OASLanguage.DV,
            OASLanguage.DZ,
            OASLanguage.DE,
            OASLanguage.EL,
            OASLanguage.EN,
            OASLanguage.ES,
            OASLanguage.ET,
            OASLanguage.FA,
            OASLanguage.FI,
            OASLanguage.FR,
            OASLanguage.HE,
            OASLanguage.HI,
            OASLanguage.HR,
            OASLanguage.HU,
            OASLanguage.HY,
            OASLanguage.ID,
            OASLanguage.IN,
            OASLanguage.IS,
            OASLanguage.IT,
            OASLanguage.IW,
            OASLanguage.JA,
            OASLanguage.KA,
            OASLanguage.KM,
            OASLanguage.KO,
            OASLanguage.LO,
            OASLanguage.LT,
            OASLanguage.LV,
            OASLanguage.MK,
            OASLanguage.MN,
            OASLanguage.MS,
            OASLanguage.MY,
            OASLanguage.NB,
            OASLanguage.NE,
            OASLanguage.NL,
            OASLanguage.NO,
            OASLanguage.PL,
            OASLanguage.PT,
            OASLanguage.RO,
            OASLanguage.RU,
            OASLanguage.SK,
            OASLanguage.SL,
            OASLanguage.SQ,
            OASLanguage.SR,
            OASLanguage.SV,
            OASLanguage.TL,
            OASLanguage.UK,
            OASLanguage.VI,
            OASLanguage.TE,
            OASLanguage.TH,
            OASLanguage.TR,
            OASLanguage.XX,
            OASLanguage.ZH
        };
        Set<OASLanguage> actual  = new Set<OASLanguage>(OASLanguage.values());
        System.assertEquals(expected, actual);
    }
}
