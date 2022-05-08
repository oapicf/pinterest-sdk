/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: https://openapi-generator.tech
 */

/// PinPromotionSummaryStatus : Summary status for pin promotions

/// Summary status for pin promotions
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum PinPromotionSummaryStatus {
    #[serde(rename = "APPROVED")]
    APPROVED,
    #[serde(rename = "PAUSED")]
    PAUSED,
    #[serde(rename = "PENDING")]
    PENDING,
    #[serde(rename = "REJECTED")]
    REJECTED,
    #[serde(rename = "ADVERTISER_DISABLED")]
    ADVERTISERDISABLED,
    #[serde(rename = "ARCHIVED")]
    ARCHIVED,

}

impl ToString for PinPromotionSummaryStatus {
    fn to_string(&self) -> String {
        match self {
            Self::APPROVED => String::from("APPROVED"),
            Self::PAUSED => String::from("PAUSED"),
            Self::PENDING => String::from("PENDING"),
            Self::REJECTED => String::from("REJECTED"),
            Self::ADVERTISERDISABLED => String::from("ADVERTISER_DISABLED"),
            Self::ARCHIVED => String::from("ARCHIVED"),
        }
    }
}

impl Default for PinPromotionSummaryStatus {
    fn default() -> PinPromotionSummaryStatus {
        Self::APPROVED
    }
}



