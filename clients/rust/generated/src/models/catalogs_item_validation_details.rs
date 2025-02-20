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
pub struct CatalogsItemValidationDetails {
    #[serde(rename = "attribute_name", deserialize_with = "Option::deserialize")]
    pub attribute_name: Option<models::NullableCatalogsItemFieldType>,
    /// Provided value that caused the validation issue.
    #[serde(rename = "provided_value", deserialize_with = "Option::deserialize")]
    pub provided_value: Option<String>,
}

impl CatalogsItemValidationDetails {
    pub fn new(attribute_name: Option<models::NullableCatalogsItemFieldType>, provided_value: Option<String>) -> CatalogsItemValidationDetails {
        CatalogsItemValidationDetails {
            attribute_name,
            provided_value,
        }
    }
}

