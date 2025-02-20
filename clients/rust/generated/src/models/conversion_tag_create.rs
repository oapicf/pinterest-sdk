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

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ConversionTagCreate {
    /// Conversion tag name.
    #[serde(rename = "name")]
    pub name: String,
    /// Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
    #[serde(rename = "aem_enabled", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub aem_enabled: Option<Option<bool>>,
    /// Metadata ingestion frequency.
    #[serde(rename = "md_frequency", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub md_frequency: Option<Option<f64>>,
    /// Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
    #[serde(rename = "aem_fnln_enabled", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub aem_fnln_enabled: Option<Option<bool>>,
    /// Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
    #[serde(rename = "aem_ph_enabled", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub aem_ph_enabled: Option<Option<bool>>,
    /// Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
    #[serde(rename = "aem_ge_enabled", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub aem_ge_enabled: Option<Option<bool>>,
    /// Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
    #[serde(rename = "aem_db_enabled", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub aem_db_enabled: Option<Option<bool>>,
    /// Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
    #[serde(rename = "aem_loc_enabled", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub aem_loc_enabled: Option<Option<bool>>,
}

impl ConversionTagCreate {
    pub fn new(name: String) -> ConversionTagCreate {
        ConversionTagCreate {
            name,
            aem_enabled: None,
            md_frequency: None,
            aem_fnln_enabled: None,
            aem_ph_enabled: None,
            aem_ge_enabled: None,
            aem_db_enabled: None,
            aem_loc_enabled: None,
        }
    }
}

