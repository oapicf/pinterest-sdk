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

/// ConversionEventsUserData : Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ConversionEventsUserData {
    /// Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #[serde(rename = "ph", skip_serializing_if = "Option::is_none")]
    pub ph: Option<Vec<String>>,
    /// Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
    #[serde(rename = "ge", skip_serializing_if = "Option::is_none")]
    pub ge: Option<Vec<String>>,
    /// Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
    #[serde(rename = "db", skip_serializing_if = "Option::is_none")]
    pub db: Option<Vec<String>>,
    /// Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #[serde(rename = "ln", skip_serializing_if = "Option::is_none")]
    pub ln: Option<Vec<String>>,
    /// Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #[serde(rename = "fn", skip_serializing_if = "Option::is_none")]
    pub r#fn: Option<Vec<String>>,
    /// Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
    #[serde(rename = "ct", skip_serializing_if = "Option::is_none")]
    pub ct: Option<Vec<String>>,
    /// Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
    #[serde(rename = "st", skip_serializing_if = "Option::is_none")]
    pub st: Option<Vec<String>>,
    /// Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
    #[serde(rename = "zp", skip_serializing_if = "Option::is_none")]
    pub zp: Option<Vec<String>>,
    /// Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
    #[serde(rename = "country", skip_serializing_if = "Option::is_none")]
    pub country: Option<Vec<String>>,
    /// Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #[serde(rename = "external_id", skip_serializing_if = "Option::is_none")]
    pub external_id: Option<Vec<String>>,
    /// The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    #[serde(rename = "click_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub click_id: Option<Option<String>>,
    /// A unique identifier of visitors' information defined by third party partners. e.g RampID
    #[serde(rename = "partner_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub partner_id: Option<Option<String>>,
    /// Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #[serde(rename = "em")]
    pub em: Vec<String>,
    /// Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #[serde(rename = "hashed_maids")]
    pub hashed_maids: Vec<String>,
    /// The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    #[serde(rename = "client_ip_address")]
    pub client_ip_address: String,
    /// The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    #[serde(rename = "client_user_agent")]
    pub client_user_agent: String,
}

impl ConversionEventsUserData {
    /// Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
    pub fn new(em: Vec<String>, hashed_maids: Vec<String>, client_ip_address: String, client_user_agent: String) -> ConversionEventsUserData {
        ConversionEventsUserData {
            ph: None,
            ge: None,
            db: None,
            ln: None,
            r#fn: None,
            ct: None,
            st: None,
            zp: None,
            country: None,
            external_id: None,
            click_id: None,
            partner_id: None,
            em,
            hashed_maids,
            client_ip_address,
            client_user_agent,
        }
    }
}

