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

/// CatalogsListProductsByFilterRequest : Request object to list products for a given product group filter.
/// Request object to list products for a given product group filter.
#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CatalogsListProductsByFilterRequest {
    CatalogsListProductsByFilterRequestOneOf(Box<models::CatalogsListProductsByFilterRequestOneOf>),
}

impl Default for CatalogsListProductsByFilterRequest {
    fn default() -> Self {
        Self::CatalogsListProductsByFilterRequestOneOf(Default::default())
    }
}
