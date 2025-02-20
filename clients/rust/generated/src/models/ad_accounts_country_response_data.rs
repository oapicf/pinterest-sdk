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
pub struct AdAccountsCountryResponseData {
    #[serde(rename = "code", skip_serializing_if = "Option::is_none")]
    pub code: Option<models::AdCountry>,
    /// Country currency.
    #[serde(rename = "currency", skip_serializing_if = "Option::is_none")]
    pub currency: Option<String>,
    /// Country index
    #[serde(rename = "index", skip_serializing_if = "Option::is_none")]
    pub index: Option<f64>,
    /// Country name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
}

impl AdAccountsCountryResponseData {
    pub fn new() -> AdAccountsCountryResponseData {
        AdAccountsCountryResponseData {
            code: None,
            currency: None,
            index: None,
            name: None,
        }
    }
}

