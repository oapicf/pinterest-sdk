@isTest
private class OASAdCountryTest {
    @isTest
    private static void allowableValues() {
        Set<OASAdCountry> expected = new Set<OASAdCountry>{
            OASAdCountry.AD,
            OASAdCountry.AE,
            OASAdCountry.AF,
            OASAdCountry.AG,
            OASAdCountry.AI,
            OASAdCountry.AL,
            OASAdCountry.AM,
            OASAdCountry.AO,
            OASAdCountry.AQ,
            OASAdCountry.AR,
            OASAdCountry.AS,
            OASAdCountry.AT,
            OASAdCountry.AU,
            OASAdCountry.AW,
            OASAdCountry.AX,
            OASAdCountry.AZ,
            OASAdCountry.BA,
            OASAdCountry.BB,
            OASAdCountry.BD,
            OASAdCountry.BE,
            OASAdCountry.BF,
            OASAdCountry.BG,
            OASAdCountry.BH,
            OASAdCountry.BI,
            OASAdCountry.BJ,
            OASAdCountry.BL,
            OASAdCountry.BM,
            OASAdCountry.BN,
            OASAdCountry.BO,
            OASAdCountry.BQ,
            OASAdCountry.BR,
            OASAdCountry.BS,
            OASAdCountry.BT,
            OASAdCountry.BV,
            OASAdCountry.BW,
            OASAdCountry.BY,
            OASAdCountry.BZ,
            OASAdCountry.CA,
            OASAdCountry.CC,
            OASAdCountry.CD,
            OASAdCountry.CF,
            OASAdCountry.CG,
            OASAdCountry.CH,
            OASAdCountry.CI,
            OASAdCountry.CK,
            OASAdCountry.CL,
            OASAdCountry.CM,
            OASAdCountry.CN,
            OASAdCountry.CO,
            OASAdCountry.CR,
            OASAdCountry.CU,
            OASAdCountry.CV,
            OASAdCountry.CW,
            OASAdCountry.CX,
            OASAdCountry.CY,
            OASAdCountry.CZ,
            OASAdCountry.DE,
            OASAdCountry.DJ,
            OASAdCountry.DK,
            OASAdCountry.DM,
            OASAdCountry.DO,
            OASAdCountry.DZ,
            OASAdCountry.EC,
            OASAdCountry.EE,
            OASAdCountry.EG,
            OASAdCountry.EH,
            OASAdCountry.ER,
            OASAdCountry.ES,
            OASAdCountry.ET,
            OASAdCountry.FI,
            OASAdCountry.FJ,
            OASAdCountry.FK,
            OASAdCountry.FM,
            OASAdCountry.FO,
            OASAdCountry.FR,
            OASAdCountry.GA,
            OASAdCountry.GB,
            OASAdCountry.GD,
            OASAdCountry.GE,
            OASAdCountry.GF,
            OASAdCountry.GG,
            OASAdCountry.GH,
            OASAdCountry.GI,
            OASAdCountry.GL,
            OASAdCountry.GM,
            OASAdCountry.GN,
            OASAdCountry.GP,
            OASAdCountry.GQ,
            OASAdCountry.GR,
            OASAdCountry.GS,
            OASAdCountry.GT,
            OASAdCountry.GU,
            OASAdCountry.GW,
            OASAdCountry.GY,
            OASAdCountry.HK,
            OASAdCountry.HM,
            OASAdCountry.HN,
            OASAdCountry.HR,
            OASAdCountry.HT,
            OASAdCountry.HU,
            OASAdCountry.ID,
            OASAdCountry.IE,
            OASAdCountry.IL,
            OASAdCountry.IM,
            OASAdCountry.IN,
            OASAdCountry.IO,
            OASAdCountry.IQ,
            OASAdCountry.IR,
            OASAdCountry.IS,
            OASAdCountry.IT,
            OASAdCountry.JE,
            OASAdCountry.JM,
            OASAdCountry.JO,
            OASAdCountry.JP,
            OASAdCountry.KE,
            OASAdCountry.KG,
            OASAdCountry.KH,
            OASAdCountry.KI,
            OASAdCountry.KM,
            OASAdCountry.KN,
            OASAdCountry.KR,
            OASAdCountry.KW,
            OASAdCountry.KY,
            OASAdCountry.KZ,
            OASAdCountry.LA,
            OASAdCountry.LB,
            OASAdCountry.LC,
            OASAdCountry.LI,
            OASAdCountry.LK,
            OASAdCountry.LR,
            OASAdCountry.LS,
            OASAdCountry.LT,
            OASAdCountry.LU,
            OASAdCountry.LV,
            OASAdCountry.LY,
            OASAdCountry.MA,
            OASAdCountry.MC,
            OASAdCountry.MD,
            OASAdCountry.ME,
            OASAdCountry.MF,
            OASAdCountry.MG,
            OASAdCountry.MH,
            OASAdCountry.MK,
            OASAdCountry.ML,
            OASAdCountry.MM,
            OASAdCountry.MN,
            OASAdCountry.MO,
            OASAdCountry.MP,
            OASAdCountry.MQ,
            OASAdCountry.MR,
            OASAdCountry.MS,
            OASAdCountry.MT,
            OASAdCountry.MU,
            OASAdCountry.MV,
            OASAdCountry.MW,
            OASAdCountry.MX,
            OASAdCountry.MY,
            OASAdCountry.MZ,
            OASAdCountry.NA,
            OASAdCountry.NC,
            OASAdCountry.NE,
            OASAdCountry.NF,
            OASAdCountry.NG,
            OASAdCountry.NI,
            OASAdCountry.NL,
            OASAdCountry.NO,
            OASAdCountry.NP,
            OASAdCountry.NR,
            OASAdCountry.NU,
            OASAdCountry.NZ,
            OASAdCountry.OM,
            OASAdCountry.PA,
            OASAdCountry.PE,
            OASAdCountry.PF,
            OASAdCountry.PG,
            OASAdCountry.PH,
            OASAdCountry.PK,
            OASAdCountry.PL,
            OASAdCountry.PM,
            OASAdCountry.PN,
            OASAdCountry.PR,
            OASAdCountry.PS,
            OASAdCountry.PT,
            OASAdCountry.PW,
            OASAdCountry.PY,
            OASAdCountry.QA,
            OASAdCountry.RE,
            OASAdCountry.RO,
            OASAdCountry.RS,
            OASAdCountry.RU,
            OASAdCountry.RW,
            OASAdCountry.SA,
            OASAdCountry.SB,
            OASAdCountry.SC,
            OASAdCountry.SD,
            OASAdCountry.SE,
            OASAdCountry.SG,
            OASAdCountry.SH,
            OASAdCountry.SI,
            OASAdCountry.SJ,
            OASAdCountry.SK,
            OASAdCountry.SL,
            OASAdCountry.SM,
            OASAdCountry.SN,
            OASAdCountry.SO,
            OASAdCountry.SR,
            OASAdCountry.SS,
            OASAdCountry.ST,
            OASAdCountry.SV,
            OASAdCountry.SX,
            OASAdCountry.SY,
            OASAdCountry.SZ,
            OASAdCountry.TC,
            OASAdCountry.TD,
            OASAdCountry.TF,
            OASAdCountry.TG,
            OASAdCountry.TH,
            OASAdCountry.TJ,
            OASAdCountry.TK,
            OASAdCountry.TL,
            OASAdCountry.TM,
            OASAdCountry.TN,
            OASAdCountry.TO,
            OASAdCountry.TR,
            OASAdCountry.TT,
            OASAdCountry.TV,
            OASAdCountry.TW,
            OASAdCountry.TZ,
            OASAdCountry.UA,
            OASAdCountry.UG,
            OASAdCountry.UM,
            OASAdCountry.US,
            OASAdCountry.UY,
            OASAdCountry.UZ,
            OASAdCountry.VA,
            OASAdCountry.VC,
            OASAdCountry.VE,
            OASAdCountry.VG,
            OASAdCountry.VI,
            OASAdCountry.VN,
            OASAdCountry.VU,
            OASAdCountry.WF,
            OASAdCountry.WS,
            OASAdCountry.YE,
            OASAdCountry.YT,
            OASAdCountry.ZA,
            OASAdCountry.ZM,
            OASAdCountry.ZW
        };
        Set<OASAdCountry> actual  = new Set<OASAdCountry>(OASAdCountry.values());
        System.assertEquals(expected, actual);
    }
}
