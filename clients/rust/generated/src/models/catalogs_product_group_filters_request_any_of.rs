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
pub struct CatalogsProductGroupFiltersRequestAnyOf {
    #[serde(rename = "any_of")]
    pub any_of: Vec<models::CatalogsProductGroupFilterKeys>,
}

impl CatalogsProductGroupFiltersRequestAnyOf {
    pub fn new(any_of: Vec<models::CatalogsProductGroupFilterKeys>) -> CatalogsProductGroupFiltersRequestAnyOf {
        CatalogsProductGroupFiltersRequestAnyOf {
            any_of,
        }
    }
}

