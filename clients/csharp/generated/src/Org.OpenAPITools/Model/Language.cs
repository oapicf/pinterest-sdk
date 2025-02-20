/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Language code, which is among the offical ISO 639-1 language list.
    /// </summary>
    /// <value>Language code, which is among the offical ISO 639-1 language list.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Language
    {
        /// <summary>
        /// Enum AM for value: AM
        /// </summary>
        [EnumMember(Value = "AM")]
        AM = 1,

        /// <summary>
        /// Enum AR for value: AR
        /// </summary>
        [EnumMember(Value = "AR")]
        AR = 2,

        /// <summary>
        /// Enum AZ for value: AZ
        /// </summary>
        [EnumMember(Value = "AZ")]
        AZ = 3,

        /// <summary>
        /// Enum BG for value: BG
        /// </summary>
        [EnumMember(Value = "BG")]
        BG = 4,

        /// <summary>
        /// Enum BN for value: BN
        /// </summary>
        [EnumMember(Value = "BN")]
        BN = 5,

        /// <summary>
        /// Enum BS for value: BS
        /// </summary>
        [EnumMember(Value = "BS")]
        BS = 6,

        /// <summary>
        /// Enum CA for value: CA
        /// </summary>
        [EnumMember(Value = "CA")]
        CA = 7,

        /// <summary>
        /// Enum CS for value: CS
        /// </summary>
        [EnumMember(Value = "CS")]
        CS = 8,

        /// <summary>
        /// Enum DA for value: DA
        /// </summary>
        [EnumMember(Value = "DA")]
        DA = 9,

        /// <summary>
        /// Enum DV for value: DV
        /// </summary>
        [EnumMember(Value = "DV")]
        DV = 10,

        /// <summary>
        /// Enum DZ for value: DZ
        /// </summary>
        [EnumMember(Value = "DZ")]
        DZ = 11,

        /// <summary>
        /// Enum DE for value: DE
        /// </summary>
        [EnumMember(Value = "DE")]
        DE = 12,

        /// <summary>
        /// Enum EL for value: EL
        /// </summary>
        [EnumMember(Value = "EL")]
        EL = 13,

        /// <summary>
        /// Enum EN for value: EN
        /// </summary>
        [EnumMember(Value = "EN")]
        EN = 14,

        /// <summary>
        /// Enum ES for value: ES
        /// </summary>
        [EnumMember(Value = "ES")]
        ES = 15,

        /// <summary>
        /// Enum ET for value: ET
        /// </summary>
        [EnumMember(Value = "ET")]
        ET = 16,

        /// <summary>
        /// Enum FA for value: FA
        /// </summary>
        [EnumMember(Value = "FA")]
        FA = 17,

        /// <summary>
        /// Enum FI for value: FI
        /// </summary>
        [EnumMember(Value = "FI")]
        FI = 18,

        /// <summary>
        /// Enum FR for value: FR
        /// </summary>
        [EnumMember(Value = "FR")]
        FR = 19,

        /// <summary>
        /// Enum HE for value: HE
        /// </summary>
        [EnumMember(Value = "HE")]
        HE = 20,

        /// <summary>
        /// Enum HI for value: HI
        /// </summary>
        [EnumMember(Value = "HI")]
        HI = 21,

        /// <summary>
        /// Enum HR for value: HR
        /// </summary>
        [EnumMember(Value = "HR")]
        HR = 22,

        /// <summary>
        /// Enum HU for value: HU
        /// </summary>
        [EnumMember(Value = "HU")]
        HU = 23,

        /// <summary>
        /// Enum HY for value: HY
        /// </summary>
        [EnumMember(Value = "HY")]
        HY = 24,

        /// <summary>
        /// Enum ID for value: ID
        /// </summary>
        [EnumMember(Value = "ID")]
        ID = 25,

        /// <summary>
        /// Enum IN for value: IN
        /// </summary>
        [EnumMember(Value = "IN")]
        IN = 26,

        /// <summary>
        /// Enum IS for value: IS
        /// </summary>
        [EnumMember(Value = "IS")]
        IS = 27,

        /// <summary>
        /// Enum IT for value: IT
        /// </summary>
        [EnumMember(Value = "IT")]
        IT = 28,

        /// <summary>
        /// Enum IW for value: IW
        /// </summary>
        [EnumMember(Value = "IW")]
        IW = 29,

        /// <summary>
        /// Enum JA for value: JA
        /// </summary>
        [EnumMember(Value = "JA")]
        JA = 30,

        /// <summary>
        /// Enum KA for value: KA
        /// </summary>
        [EnumMember(Value = "KA")]
        KA = 31,

        /// <summary>
        /// Enum KM for value: KM
        /// </summary>
        [EnumMember(Value = "KM")]
        KM = 32,

        /// <summary>
        /// Enum KO for value: KO
        /// </summary>
        [EnumMember(Value = "KO")]
        KO = 33,

        /// <summary>
        /// Enum LO for value: LO
        /// </summary>
        [EnumMember(Value = "LO")]
        LO = 34,

        /// <summary>
        /// Enum LT for value: LT
        /// </summary>
        [EnumMember(Value = "LT")]
        LT = 35,

        /// <summary>
        /// Enum LV for value: LV
        /// </summary>
        [EnumMember(Value = "LV")]
        LV = 36,

        /// <summary>
        /// Enum MK for value: MK
        /// </summary>
        [EnumMember(Value = "MK")]
        MK = 37,

        /// <summary>
        /// Enum MN for value: MN
        /// </summary>
        [EnumMember(Value = "MN")]
        MN = 38,

        /// <summary>
        /// Enum MS for value: MS
        /// </summary>
        [EnumMember(Value = "MS")]
        MS = 39,

        /// <summary>
        /// Enum MY for value: MY
        /// </summary>
        [EnumMember(Value = "MY")]
        MY = 40,

        /// <summary>
        /// Enum NB for value: NB
        /// </summary>
        [EnumMember(Value = "NB")]
        NB = 41,

        /// <summary>
        /// Enum NE for value: NE
        /// </summary>
        [EnumMember(Value = "NE")]
        NE = 42,

        /// <summary>
        /// Enum NL for value: NL
        /// </summary>
        [EnumMember(Value = "NL")]
        NL = 43,

        /// <summary>
        /// Enum NO for value: NO
        /// </summary>
        [EnumMember(Value = "NO")]
        NO = 44,

        /// <summary>
        /// Enum PL for value: PL
        /// </summary>
        [EnumMember(Value = "PL")]
        PL = 45,

        /// <summary>
        /// Enum PT for value: PT
        /// </summary>
        [EnumMember(Value = "PT")]
        PT = 46,

        /// <summary>
        /// Enum RO for value: RO
        /// </summary>
        [EnumMember(Value = "RO")]
        RO = 47,

        /// <summary>
        /// Enum RU for value: RU
        /// </summary>
        [EnumMember(Value = "RU")]
        RU = 48,

        /// <summary>
        /// Enum SK for value: SK
        /// </summary>
        [EnumMember(Value = "SK")]
        SK = 49,

        /// <summary>
        /// Enum SL for value: SL
        /// </summary>
        [EnumMember(Value = "SL")]
        SL = 50,

        /// <summary>
        /// Enum SQ for value: SQ
        /// </summary>
        [EnumMember(Value = "SQ")]
        SQ = 51,

        /// <summary>
        /// Enum SR for value: SR
        /// </summary>
        [EnumMember(Value = "SR")]
        SR = 52,

        /// <summary>
        /// Enum SV for value: SV
        /// </summary>
        [EnumMember(Value = "SV")]
        SV = 53,

        /// <summary>
        /// Enum TL for value: TL
        /// </summary>
        [EnumMember(Value = "TL")]
        TL = 54,

        /// <summary>
        /// Enum UK for value: UK
        /// </summary>
        [EnumMember(Value = "UK")]
        UK = 55,

        /// <summary>
        /// Enum VI for value: VI
        /// </summary>
        [EnumMember(Value = "VI")]
        VI = 56,

        /// <summary>
        /// Enum TE for value: TE
        /// </summary>
        [EnumMember(Value = "TE")]
        TE = 57,

        /// <summary>
        /// Enum TH for value: TH
        /// </summary>
        [EnumMember(Value = "TH")]
        TH = 58,

        /// <summary>
        /// Enum TR for value: TR
        /// </summary>
        [EnumMember(Value = "TR")]
        TR = 59,

        /// <summary>
        /// Enum XX for value: XX
        /// </summary>
        [EnumMember(Value = "XX")]
        XX = 60,

        /// <summary>
        /// Enum ZH for value: ZH
        /// </summary>
        [EnumMember(Value = "ZH")]
        ZH = 61
    }

}
