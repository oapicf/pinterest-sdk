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

/// AdvancedAuctionItemsSubmitUpsertRecord : Object describing an item bid option upsert operation
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct AdvancedAuctionItemsSubmitUpsertRecord {
    /// The catalog retail item id in the merchant namespace
    #[serde(rename = "item_id")]
    pub item_id: String,
    #[serde(rename = "country")]
    pub country: models::Country,
    #[serde(rename = "language")]
    pub language: models::Language,
    #[serde(rename = "bid_options")]
    pub bid_options: Box<models::AdvancedAuctionBidOptions>,
    /// The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
    #[serde(rename = "update_mask", deserialize_with = "Option::deserialize")]
    pub update_mask: Option<Vec<models::UpdateMaskBidOptionField>>,
}

impl AdvancedAuctionItemsSubmitUpsertRecord {
    /// Object describing an item bid option upsert operation
    pub fn new(item_id: String, country: models::Country, language: models::Language, bid_options: models::AdvancedAuctionBidOptions, update_mask: Option<Vec<models::UpdateMaskBidOptionField>>) -> AdvancedAuctionItemsSubmitUpsertRecord {
        AdvancedAuctionItemsSubmitUpsertRecord {
            item_id,
            country,
            language,
            bid_options: Box::new(bid_options),
            update_mask,
        }
    }
}

