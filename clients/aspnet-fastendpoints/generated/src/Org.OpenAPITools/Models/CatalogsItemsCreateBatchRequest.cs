namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object to create catalogs items
/// </summary>
public class CatalogsItemsCreateBatchRequest 
{
    
    public Country Country { get; set; }
    public List<ItemCreateBatchRecord> Items { get; set; }
    
    /// <summary>
    /// We recommend using the CatalogsLocale values.
    /// </summary>
    /// <value>We recommend using the CatalogsLocale values.</value>
    public enum LanguageEnum
    {
        
        /// <summary>
        /// Enum AfZAEnum for af-ZA
        /// </summary>
        AfZAEnum = 1,
        
        /// <summary>
        /// Enum ArSAEnum for ar-SA
        /// </summary>
        ArSAEnum = 2,
        
        /// <summary>
        /// Enum BgBGEnum for bg-BG
        /// </summary>
        BgBGEnum = 3,
        
        /// <summary>
        /// Enum BnINEnum for bn-IN
        /// </summary>
        BnINEnum = 4,
        
        /// <summary>
        /// Enum CsCZEnum for cs-CZ
        /// </summary>
        CsCZEnum = 5,
        
        /// <summary>
        /// Enum DaDKEnum for da-DK
        /// </summary>
        DaDKEnum = 6,
        
        /// <summary>
        /// Enum DeEnum for de
        /// </summary>
        DeEnum = 7,
        
        /// <summary>
        /// Enum ElGREnum for el-GR
        /// </summary>
        ElGREnum = 8,
        
        /// <summary>
        /// Enum EnAUEnum for en-AU
        /// </summary>
        EnAUEnum = 9,
        
        /// <summary>
        /// Enum EnCAEnum for en-CA
        /// </summary>
        EnCAEnum = 10,
        
        /// <summary>
        /// Enum EnGBEnum for en-GB
        /// </summary>
        EnGBEnum = 11,
        
        /// <summary>
        /// Enum EnINEnum for en-IN
        /// </summary>
        EnINEnum = 12,
        
        /// <summary>
        /// Enum EnUSEnum for en-US
        /// </summary>
        EnUSEnum = 13,
        
        /// <summary>
        /// Enum Es419Enum for es-419
        /// </summary>
        Es419Enum = 14,
        
        /// <summary>
        /// Enum EsAREnum for es-AR
        /// </summary>
        EsAREnum = 15,
        
        /// <summary>
        /// Enum EsESEnum for es-ES
        /// </summary>
        EsESEnum = 16,
        
        /// <summary>
        /// Enum EsMXEnum for es-MX
        /// </summary>
        EsMXEnum = 17,
        
        /// <summary>
        /// Enum FiFIEnum for fi-FI
        /// </summary>
        FiFIEnum = 18,
        
        /// <summary>
        /// Enum FrEnum for fr
        /// </summary>
        FrEnum = 19,
        
        /// <summary>
        /// Enum FrCAEnum for fr-CA
        /// </summary>
        FrCAEnum = 20,
        
        /// <summary>
        /// Enum HeILEnum for he-IL
        /// </summary>
        HeILEnum = 21,
        
        /// <summary>
        /// Enum HiINEnum for hi-IN
        /// </summary>
        HiINEnum = 22,
        
        /// <summary>
        /// Enum HrHREnum for hr-HR
        /// </summary>
        HrHREnum = 23,
        
        /// <summary>
        /// Enum HuHUEnum for hu-HU
        /// </summary>
        HuHUEnum = 24,
        
        /// <summary>
        /// Enum IdIDEnum for id-ID
        /// </summary>
        IdIDEnum = 25,
        
        /// <summary>
        /// Enum ItEnum for it
        /// </summary>
        ItEnum = 26,
        
        /// <summary>
        /// Enum JaEnum for ja
        /// </summary>
        JaEnum = 27,
        
        /// <summary>
        /// Enum KoKREnum for ko-KR
        /// </summary>
        KoKREnum = 28,
        
        /// <summary>
        /// Enum MsMYEnum for ms-MY
        /// </summary>
        MsMYEnum = 29,
        
        /// <summary>
        /// Enum NbNOEnum for nb-NO
        /// </summary>
        NbNOEnum = 30,
        
        /// <summary>
        /// Enum NlEnum for nl
        /// </summary>
        NlEnum = 31,
        
        /// <summary>
        /// Enum PlPLEnum for pl-PL
        /// </summary>
        PlPLEnum = 32,
        
        /// <summary>
        /// Enum PtBREnum for pt-BR
        /// </summary>
        PtBREnum = 33,
        
        /// <summary>
        /// Enum PtPTEnum for pt-PT
        /// </summary>
        PtPTEnum = 34,
        
        /// <summary>
        /// Enum RoROEnum for ro-RO
        /// </summary>
        RoROEnum = 35,
        
        /// <summary>
        /// Enum RuRUEnum for ru-RU
        /// </summary>
        RuRUEnum = 36,
        
        /// <summary>
        /// Enum SkSKEnum for sk-SK
        /// </summary>
        SkSKEnum = 37,
        
        /// <summary>
        /// Enum SvSEEnum for sv-SE
        /// </summary>
        SvSEEnum = 38,
        
        /// <summary>
        /// Enum TeINEnum for te-IN
        /// </summary>
        TeINEnum = 39,
        
        /// <summary>
        /// Enum ThTHEnum for th-TH
        /// </summary>
        ThTHEnum = 40,
        
        /// <summary>
        /// Enum TlPHEnum for tl-PH
        /// </summary>
        TlPHEnum = 41,
        
        /// <summary>
        /// Enum TrEnum for tr
        /// </summary>
        TrEnum = 42,
        
        /// <summary>
        /// Enum UkUAEnum for uk-UA
        /// </summary>
        UkUAEnum = 43,
        
        /// <summary>
        /// Enum ViVNEnum for vi-VN
        /// </summary>
        ViVNEnum = 44,
        
        /// <summary>
        /// Enum ZhCNEnum for zh-CN
        /// </summary>
        ZhCNEnum = 45,
        
        /// <summary>
        /// Enum ZhTWEnum for zh-TW
        /// </summary>
        ZhTWEnum = 46,
        
        /// <summary>
        /// Enum AMEnum for AM
        /// </summary>
        AMEnum = 47,
        
        /// <summary>
        /// Enum AREnum for AR
        /// </summary>
        AREnum = 48,
        
        /// <summary>
        /// Enum AZEnum for AZ
        /// </summary>
        AZEnum = 49,
        
        /// <summary>
        /// Enum BGEnum for BG
        /// </summary>
        BGEnum = 50,
        
        /// <summary>
        /// Enum BNEnum for BN
        /// </summary>
        BNEnum = 51,
        
        /// <summary>
        /// Enum BSEnum for BS
        /// </summary>
        BSEnum = 52,
        
        /// <summary>
        /// Enum CAEnum for CA
        /// </summary>
        CAEnum = 53,
        
        /// <summary>
        /// Enum CSEnum for CS
        /// </summary>
        CSEnum = 54,
        
        /// <summary>
        /// Enum DAEnum for DA
        /// </summary>
        DAEnum = 55,
        
        /// <summary>
        /// Enum DVEnum for DV
        /// </summary>
        DVEnum = 56,
        
        /// <summary>
        /// Enum DZEnum for DZ
        /// </summary>
        DZEnum = 57,
        
        /// <summary>
        /// Enum DEEnum for DE
        /// </summary>
        DEEnum = 58,
        
        /// <summary>
        /// Enum ELEnum for EL
        /// </summary>
        ELEnum = 59,
        
        /// <summary>
        /// Enum ENEnum for EN
        /// </summary>
        ENEnum = 60,
        
        /// <summary>
        /// Enum ESEnum for ES
        /// </summary>
        ESEnum = 61,
        
        /// <summary>
        /// Enum ETEnum for ET
        /// </summary>
        ETEnum = 62,
        
        /// <summary>
        /// Enum FAEnum for FA
        /// </summary>
        FAEnum = 63,
        
        /// <summary>
        /// Enum FIEnum for FI
        /// </summary>
        FIEnum = 64,
        
        /// <summary>
        /// Enum FREnum for FR
        /// </summary>
        FREnum = 65,
        
        /// <summary>
        /// Enum HEEnum for HE
        /// </summary>
        HEEnum = 66,
        
        /// <summary>
        /// Enum HIEnum for HI
        /// </summary>
        HIEnum = 67,
        
        /// <summary>
        /// Enum HREnum for HR
        /// </summary>
        HREnum = 68,
        
        /// <summary>
        /// Enum HUEnum for HU
        /// </summary>
        HUEnum = 69,
        
        /// <summary>
        /// Enum HYEnum for HY
        /// </summary>
        HYEnum = 70,
        
        /// <summary>
        /// Enum IDEnum for ID
        /// </summary>
        IDEnum = 71,
        
        /// <summary>
        /// Enum INEnum for IN
        /// </summary>
        INEnum = 72,
        
        /// <summary>
        /// Enum ISEnum for IS
        /// </summary>
        ISEnum = 73,
        
        /// <summary>
        /// Enum ITEnum for IT
        /// </summary>
        ITEnum = 74,
        
        /// <summary>
        /// Enum IWEnum for IW
        /// </summary>
        IWEnum = 75,
        
        /// <summary>
        /// Enum JAEnum for JA
        /// </summary>
        JAEnum = 76,
        
        /// <summary>
        /// Enum KAEnum for KA
        /// </summary>
        KAEnum = 77,
        
        /// <summary>
        /// Enum KMEnum for KM
        /// </summary>
        KMEnum = 78,
        
        /// <summary>
        /// Enum KOEnum for KO
        /// </summary>
        KOEnum = 79,
        
        /// <summary>
        /// Enum LOEnum for LO
        /// </summary>
        LOEnum = 80,
        
        /// <summary>
        /// Enum LTEnum for LT
        /// </summary>
        LTEnum = 81,
        
        /// <summary>
        /// Enum LVEnum for LV
        /// </summary>
        LVEnum = 82,
        
        /// <summary>
        /// Enum MKEnum for MK
        /// </summary>
        MKEnum = 83,
        
        /// <summary>
        /// Enum MNEnum for MN
        /// </summary>
        MNEnum = 84,
        
        /// <summary>
        /// Enum MSEnum for MS
        /// </summary>
        MSEnum = 85,
        
        /// <summary>
        /// Enum MYEnum for MY
        /// </summary>
        MYEnum = 86,
        
        /// <summary>
        /// Enum NBEnum for NB
        /// </summary>
        NBEnum = 87,
        
        /// <summary>
        /// Enum NEEnum for NE
        /// </summary>
        NEEnum = 88,
        
        /// <summary>
        /// Enum NLEnum for NL
        /// </summary>
        NLEnum = 89,
        
        /// <summary>
        /// Enum FalseEnum for false
        /// </summary>
        FalseEnum = 90,
        
        /// <summary>
        /// Enum PLEnum for PL
        /// </summary>
        PLEnum = 91,
        
        /// <summary>
        /// Enum PTEnum for PT
        /// </summary>
        PTEnum = 92,
        
        /// <summary>
        /// Enum ROEnum for RO
        /// </summary>
        ROEnum = 93,
        
        /// <summary>
        /// Enum RUEnum for RU
        /// </summary>
        RUEnum = 94,
        
        /// <summary>
        /// Enum SKEnum for SK
        /// </summary>
        SKEnum = 95,
        
        /// <summary>
        /// Enum SLEnum for SL
        /// </summary>
        SLEnum = 96,
        
        /// <summary>
        /// Enum SQEnum for SQ
        /// </summary>
        SQEnum = 97,
        
        /// <summary>
        /// Enum SREnum for SR
        /// </summary>
        SREnum = 98,
        
        /// <summary>
        /// Enum SVEnum for SV
        /// </summary>
        SVEnum = 99,
        
        /// <summary>
        /// Enum TLEnum for TL
        /// </summary>
        TLEnum = 100,
        
        /// <summary>
        /// Enum UKEnum for UK
        /// </summary>
        UKEnum = 101,
        
        /// <summary>
        /// Enum VIEnum for VI
        /// </summary>
        VIEnum = 102,
        
        /// <summary>
        /// Enum TEEnum for TE
        /// </summary>
        TEEnum = 103,
        
        /// <summary>
        /// Enum THEnum for TH
        /// </summary>
        THEnum = 104,
        
        /// <summary>
        /// Enum TREnum for TR
        /// </summary>
        TREnum = 105,
        
        /// <summary>
        /// Enum XXEnum for XX
        /// </summary>
        XXEnum = 106,
        
        /// <summary>
        /// Enum ZHEnum for ZH
        /// </summary>
        ZHEnum = 107
    }

    public LanguageEnum Language { get; set; }
    
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    public enum OperationEnum
    {
        
        /// <summary>
        /// Enum CREATEEnum for CREATE
        /// </summary>
        CREATEEnum = 1
    }

    public OperationEnum Operation { get; set; }
}


