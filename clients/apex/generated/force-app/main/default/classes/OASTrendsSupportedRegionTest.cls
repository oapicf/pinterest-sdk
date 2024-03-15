@isTest
private class OASTrendsSupportedRegionTest {
    @isTest
    private static void allowableValues() {
        Set<OASTrendsSupportedRegion> expected = new Set<OASTrendsSupportedRegion>{
            OASTrendsSupportedRegion.US,
            OASTrendsSupportedRegion.CA,
            OASTrendsSupportedRegion.DE,
            OASTrendsSupportedRegion.FR,
            OASTrendsSupportedRegion.ES,
            OASTrendsSupportedRegion.IT,
            OASTrendsSupportedRegion.DE_AT_CH,
            OASTrendsSupportedRegion.GB_IE,
            OASTrendsSupportedRegion.IT_ES_PT_GR_MT,
            OASTrendsSupportedRegion.PL_RO_HU_SK_CZ,
            OASTrendsSupportedRegion.SE_DK_FI_NO,
            OASTrendsSupportedRegion.NL_BE_LU,
            OASTrendsSupportedRegion.AR,
            OASTrendsSupportedRegion.BR,
            OASTrendsSupportedRegion.CO,
            OASTrendsSupportedRegion.MX,
            OASTrendsSupportedRegion.MX_AR_CO_CL,
            OASTrendsSupportedRegion.AU_NZ
        };
        Set<OASTrendsSupportedRegion> actual  = new Set<OASTrendsSupportedRegion>(OASTrendsSupportedRegion.values());
        System.assertEquals(expected, actual);
    }
}
