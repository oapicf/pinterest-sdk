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

/// Catalog : Catalog entity
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct Catalog {
    #[serde(rename = "created_at")]
    pub created_at: String,
    /// ID of the catalog entity.
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "updated_at")]
    pub updated_at: String,
    /// A human-friendly name associated to a catalog entity.
    #[serde(rename = "name", deserialize_with = "Option::deserialize")]
    pub name: Option<String>,
    #[serde(rename = "catalog_type")]
    pub catalog_type: models::CatalogsType,
}

impl Catalog {
    /// Catalog entity
    pub fn new(created_at: String, id: String, updated_at: String, name: Option<String>, catalog_type: models::CatalogsType) -> Catalog {
        Catalog {
            created_at,
            id,
            updated_at,
            name,
            catalog_type,
        }
    }
}

