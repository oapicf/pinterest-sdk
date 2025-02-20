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
pub struct CustomLabel2Filter {
    #[serde(rename = "CUSTOM_LABEL_2")]
    pub custom_label_2: models::CatalogsProductGroupMultipleStringCriteria,
}

impl CustomLabel2Filter {
    pub fn new(custom_label_2: models::CatalogsProductGroupMultipleStringCriteria) -> CustomLabel2Filter {
        CustomLabel2Filter {
            custom_label_2,
        }
    }
}

