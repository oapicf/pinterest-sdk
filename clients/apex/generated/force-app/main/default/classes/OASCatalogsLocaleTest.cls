@isTest
private class OASCatalogsLocaleTest {
    @isTest
    private static void allowableValues() {
        Set<OASCatalogsLocale> expected = new Set<OASCatalogsLocale>{
            OASCatalogsLocale.AF_ZA,
            OASCatalogsLocale.AR_SA,
            OASCatalogsLocale.BG_BG,
            OASCatalogsLocale.BN_IN,
            OASCatalogsLocale.CS_CZ,
            OASCatalogsLocale.DA_DK,
            OASCatalogsLocale.DE,
            OASCatalogsLocale.EL_GR,
            OASCatalogsLocale.EN_AU,
            OASCatalogsLocale.EN_CA,
            OASCatalogsLocale.EN_GB,
            OASCatalogsLocale.EN_IN,
            OASCatalogsLocale.EN_US,
            OASCatalogsLocale.ES_419,
            OASCatalogsLocale.ES_AR,
            OASCatalogsLocale.ES_ES,
            OASCatalogsLocale.ES_MX,
            OASCatalogsLocale.FI_FI,
            OASCatalogsLocale.FR,
            OASCatalogsLocale.FR_CA,
            OASCatalogsLocale.HE_IL,
            OASCatalogsLocale.HI_IN,
            OASCatalogsLocale.HR_HR,
            OASCatalogsLocale.HU_HU,
            OASCatalogsLocale.ID_ID,
            OASCatalogsLocale.IT,
            OASCatalogsLocale.JA,
            OASCatalogsLocale.KO_KR,
            OASCatalogsLocale.MS_MY,
            OASCatalogsLocale.NB_NO,
            OASCatalogsLocale.NL,
            OASCatalogsLocale.PL_PL,
            OASCatalogsLocale.PT_BR,
            OASCatalogsLocale.PT_PT,
            OASCatalogsLocale.RO_RO,
            OASCatalogsLocale.RU_RU,
            OASCatalogsLocale.SK_SK,
            OASCatalogsLocale.SV_SE,
            OASCatalogsLocale.TE_IN,
            OASCatalogsLocale.TH_TH,
            OASCatalogsLocale.TL_PH,
            OASCatalogsLocale.TR,
            OASCatalogsLocale.UK_UA,
            OASCatalogsLocale.VI_VN,
            OASCatalogsLocale.ZH_CN,
            OASCatalogsLocale.ZH_TW
        };
        Set<OASCatalogsLocale> actual  = new Set<OASCatalogsLocale>(OASCatalogsLocale.values());
        System.assertEquals(expected, actual);
    }
}
