/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum CatalogsLocale {
    #[serde(rename = "af-ZA")]
    AfZa,
    #[serde(rename = "ar-SA")]
    ArSa,
    #[serde(rename = "bg-BG")]
    BgBg,
    #[serde(rename = "bn-IN")]
    BnIn,
    #[serde(rename = "cs-CZ")]
    CsCz,
    #[serde(rename = "da-DK")]
    DaDk,
    #[serde(rename = "de")]
    De,
    #[serde(rename = "el-GR")]
    ElGr,
    #[serde(rename = "en-AU")]
    EnAu,
    #[serde(rename = "en-CA")]
    EnCa,
    #[serde(rename = "en-GB")]
    EnGb,
    #[serde(rename = "en-IN")]
    EnIn,
    #[serde(rename = "en-US")]
    EnUs,
    #[serde(rename = "es-419")]
    Es419,
    #[serde(rename = "es-AR")]
    EsAr,
    #[serde(rename = "es-ES")]
    EsEs,
    #[serde(rename = "es-MX")]
    EsMx,
    #[serde(rename = "fi-FI")]
    FiFi,
    #[serde(rename = "fr")]
    Fr,
    #[serde(rename = "fr-CA")]
    FrCa,
    #[serde(rename = "he-IL")]
    HeIl,
    #[serde(rename = "hi-IN")]
    HiIn,
    #[serde(rename = "hr-HR")]
    HrHr,
    #[serde(rename = "hu-HU")]
    HuHu,
    #[serde(rename = "id-ID")]
    IdId,
    #[serde(rename = "it")]
    It,
    #[serde(rename = "ja")]
    Ja,
    #[serde(rename = "ko-KR")]
    KoKr,
    #[serde(rename = "ms-MY")]
    MsMy,
    #[serde(rename = "nb-NO")]
    NbNo,
    #[serde(rename = "nl")]
    Nl,
    #[serde(rename = "pl-PL")]
    PlPl,
    #[serde(rename = "pt-BR")]
    PtBr,
    #[serde(rename = "pt-PT")]
    PtPt,
    #[serde(rename = "ro-RO")]
    RoRo,
    #[serde(rename = "ru-RU")]
    RuRu,
    #[serde(rename = "sk-SK")]
    SkSk,
    #[serde(rename = "sv-SE")]
    SvSe,
    #[serde(rename = "te-IN")]
    TeIn,
    #[serde(rename = "th-TH")]
    ThTh,
    #[serde(rename = "tl-PH")]
    TlPh,
    #[serde(rename = "tr")]
    Tr,
    #[serde(rename = "uk-UA")]
    UkUa,
    #[serde(rename = "vi-VN")]
    ViVn,
    #[serde(rename = "zh-CN")]
    ZhCn,
    #[serde(rename = "zh-TW")]
    ZhTw,

}

impl std::fmt::Display for CatalogsLocale {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::AfZa => write!(f, "af-ZA"),
            Self::ArSa => write!(f, "ar-SA"),
            Self::BgBg => write!(f, "bg-BG"),
            Self::BnIn => write!(f, "bn-IN"),
            Self::CsCz => write!(f, "cs-CZ"),
            Self::DaDk => write!(f, "da-DK"),
            Self::De => write!(f, "de"),
            Self::ElGr => write!(f, "el-GR"),
            Self::EnAu => write!(f, "en-AU"),
            Self::EnCa => write!(f, "en-CA"),
            Self::EnGb => write!(f, "en-GB"),
            Self::EnIn => write!(f, "en-IN"),
            Self::EnUs => write!(f, "en-US"),
            Self::Es419 => write!(f, "es-419"),
            Self::EsAr => write!(f, "es-AR"),
            Self::EsEs => write!(f, "es-ES"),
            Self::EsMx => write!(f, "es-MX"),
            Self::FiFi => write!(f, "fi-FI"),
            Self::Fr => write!(f, "fr"),
            Self::FrCa => write!(f, "fr-CA"),
            Self::HeIl => write!(f, "he-IL"),
            Self::HiIn => write!(f, "hi-IN"),
            Self::HrHr => write!(f, "hr-HR"),
            Self::HuHu => write!(f, "hu-HU"),
            Self::IdId => write!(f, "id-ID"),
            Self::It => write!(f, "it"),
            Self::Ja => write!(f, "ja"),
            Self::KoKr => write!(f, "ko-KR"),
            Self::MsMy => write!(f, "ms-MY"),
            Self::NbNo => write!(f, "nb-NO"),
            Self::Nl => write!(f, "nl"),
            Self::PlPl => write!(f, "pl-PL"),
            Self::PtBr => write!(f, "pt-BR"),
            Self::PtPt => write!(f, "pt-PT"),
            Self::RoRo => write!(f, "ro-RO"),
            Self::RuRu => write!(f, "ru-RU"),
            Self::SkSk => write!(f, "sk-SK"),
            Self::SvSe => write!(f, "sv-SE"),
            Self::TeIn => write!(f, "te-IN"),
            Self::ThTh => write!(f, "th-TH"),
            Self::TlPh => write!(f, "tl-PH"),
            Self::Tr => write!(f, "tr"),
            Self::UkUa => write!(f, "uk-UA"),
            Self::ViVn => write!(f, "vi-VN"),
            Self::ZhCn => write!(f, "zh-CN"),
            Self::ZhTw => write!(f, "zh-TW"),
        }
    }
}

impl Default for CatalogsLocale {
    fn default() -> CatalogsLocale {
        Self::AfZa
    }
}

