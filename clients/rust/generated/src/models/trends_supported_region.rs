/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum TrendsSupportedRegion {
    #[serde(rename = "US")]
    Us,
    #[serde(rename = "CA")]
    Ca,
    #[serde(rename = "DE")]
    De,
    #[serde(rename = "FR")]
    Fr,
    #[serde(rename = "ES")]
    Es,
    #[serde(rename = "IT")]
    It,
    #[serde(rename = "DE+AT+CH")]
    DePlusAtPlusCh,
    #[serde(rename = "GB+IE")]
    GbPlusIe,
    #[serde(rename = "IT+ES+PT+GR+MT")]
    ItPlusEsPlusPtPlusGrPlusMt,
    #[serde(rename = "PL+RO+HU+SK+CZ")]
    PlPlusRoPlusHuPlusSkPlusCz,
    #[serde(rename = "SE+DK+FI+NO")]
    SePlusDkPlusFiPlusNo,
    #[serde(rename = "NL+BE+LU")]
    NlPlusBePlusLu,
    #[serde(rename = "AR")]
    Ar,
    #[serde(rename = "BR")]
    Br,
    #[serde(rename = "CO")]
    Co,
    #[serde(rename = "MX")]
    Mx,
    #[serde(rename = "MX+AR+CO+CL")]
    MxPlusArPlusCoPlusCl,
    #[serde(rename = "AU+NZ")]
    AuPlusNz,

}

impl ToString for TrendsSupportedRegion {
    fn to_string(&self) -> String {
        match self {
            Self::Us => String::from("US"),
            Self::Ca => String::from("CA"),
            Self::De => String::from("DE"),
            Self::Fr => String::from("FR"),
            Self::Es => String::from("ES"),
            Self::It => String::from("IT"),
            Self::DePlusAtPlusCh => String::from("DE+AT+CH"),
            Self::GbPlusIe => String::from("GB+IE"),
            Self::ItPlusEsPlusPtPlusGrPlusMt => String::from("IT+ES+PT+GR+MT"),
            Self::PlPlusRoPlusHuPlusSkPlusCz => String::from("PL+RO+HU+SK+CZ"),
            Self::SePlusDkPlusFiPlusNo => String::from("SE+DK+FI+NO"),
            Self::NlPlusBePlusLu => String::from("NL+BE+LU"),
            Self::Ar => String::from("AR"),
            Self::Br => String::from("BR"),
            Self::Co => String::from("CO"),
            Self::Mx => String::from("MX"),
            Self::MxPlusArPlusCoPlusCl => String::from("MX+AR+CO+CL"),
            Self::AuPlusNz => String::from("AU+NZ"),
        }
    }
}

impl Default for TrendsSupportedRegion {
    fn default() -> TrendsSupportedRegion {
        Self::Us
    }
}
