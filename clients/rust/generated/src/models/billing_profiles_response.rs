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

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct BillingProfilesResponse {
    /// Billing ID.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    /// Type of the card.
    #[serde(rename = "card_type", skip_serializing_if = "Option::is_none")]
    pub card_type: Option<CardType>,
    /// Status of the billing.
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<Status>,
    /// Advertiser ID of the billing.
    #[serde(rename = "advertiser_id", skip_serializing_if = "Option::is_none")]
    pub advertiser_id: Option<String>,
    /// Brand of the payment method.
    #[serde(rename = "payment_method_brand", skip_serializing_if = "Option::is_none")]
    pub payment_method_brand: Option<PaymentMethodBrand>,
}

impl BillingProfilesResponse {
    pub fn new() -> BillingProfilesResponse {
        BillingProfilesResponse {
            id: None,
            card_type: None,
            status: None,
            advertiser_id: None,
            payment_method_brand: None,
        }
    }
}
/// Type of the card.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum CardType {
    #[serde(rename = "UNKNOWN")]
    Unknown,
    #[serde(rename = "VISA")]
    Visa,
    #[serde(rename = "MASTERCARD")]
    Mastercard,
    #[serde(rename = "AMERICAN_EXPRESS")]
    AmericanExpress,
    #[serde(rename = "DISCOVER")]
    Discover,
    #[serde(rename = "ELO")]
    Elo,
}

impl Default for CardType {
    fn default() -> CardType {
        Self::Unknown
    }
}
/// Status of the billing.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Status {
    #[serde(rename = "UNSPECIFIED")]
    Unspecified,
    #[serde(rename = "VALID")]
    Valid,
    #[serde(rename = "INVALID")]
    Invalid,
    #[serde(rename = "PENDING")]
    Pending,
    #[serde(rename = "DELETED")]
    Deleted,
    #[serde(rename = "SECONDARY")]
    Secondary,
    #[serde(rename = "PENDING_SECONDARY")]
    PendingSecondary,
}

impl Default for Status {
    fn default() -> Status {
        Self::Unspecified
    }
}
/// Brand of the payment method.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum PaymentMethodBrand {
    #[serde(rename = "UNKNOWN")]
    Unknown,
    #[serde(rename = "VISA")]
    Visa,
    #[serde(rename = "MASTERCARD")]
    Mastercard,
    #[serde(rename = "AMERICAN_EXPRESS")]
    AmericanExpress,
    #[serde(rename = "DISCOVER")]
    Discover,
    #[serde(rename = "SOFORT")]
    Sofort,
    #[serde(rename = "DINERS_CLUB")]
    DinersClub,
    #[serde(rename = "ELO")]
    Elo,
    #[serde(rename = "CARTE_BANCAIRE")]
    CarteBancaire,
}

impl Default for PaymentMethodBrand {
    fn default() -> PaymentMethodBrand {
        Self::Unknown
    }
}
