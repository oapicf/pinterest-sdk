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

#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "operation")]
pub enum CatalogsRetailBatchRequestItemsInner {
    #[serde(rename="CREATE")]
    CatalogsCreateRetailItem {
        /// The catalog item id in the merchant namespace
        #[serde(rename = "item_id")]
        item_id: String,
        #[serde(rename = "attributes")]
        attributes: Box<models::ItemAttributesRequest>,
        /// The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
        #[serde(rename = "update_mask", skip_serializing_if = "Option::is_none")]
        update_mask: Option<Vec<models::UpdateMaskFieldType>>,
    },
    #[serde(rename="DELETE")]
    CatalogsDeleteRetailItem {
        /// The catalog item id in the merchant namespace
        #[serde(rename = "item_id")]
        item_id: String,
        #[serde(rename = "attributes")]
        attributes: Box<models::ItemAttributesRequest>,
        /// The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
        #[serde(rename = "update_mask", skip_serializing_if = "Option::is_none")]
        update_mask: Option<Vec<models::UpdateMaskFieldType>>,
    },
    #[serde(rename="UPDATE")]
    CatalogsUpdateRetailItem {
        /// The catalog item id in the merchant namespace
        #[serde(rename = "item_id")]
        item_id: String,
        #[serde(rename = "attributes")]
        attributes: Box<models::ItemAttributesRequest>,
        /// The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
        #[serde(rename = "update_mask", skip_serializing_if = "Option::is_none")]
        update_mask: Option<Vec<models::UpdateMaskFieldType>>,
    },
    #[serde(rename="UPSERT")]
    CatalogsUpsertRetailItem {
        /// The catalog item id in the merchant namespace
        #[serde(rename = "item_id")]
        item_id: String,
        #[serde(rename = "attributes")]
        attributes: Box<models::ItemAttributesRequest>,
        /// The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
        #[serde(rename = "update_mask", skip_serializing_if = "Option::is_none")]
        update_mask: Option<Vec<models::UpdateMaskFieldType>>,
    },
}

impl Default for CatalogsRetailBatchRequestItemsInner {
    fn default() -> Self {
        Self::CatalogsCreateRetailItem {
            item_id: Default::default(),
            attributes: Default::default(),
            update_mask: Default::default(),
        }
        
    }
}


