use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdvancedAuctionItemsGetSlashPostResponse {
    /// Response containing the bid option values for the requested retail catalog items. Items that don't exist or do not have bid options set won't be present in the response.
    Status200_ResponseContainingTheBidOptionValuesForTheRequestedRetailCatalogItems
    (models::AdvancedAuctionItems)
    ,
    /// Invalid request parameters.
    Status400_InvalidRequestParameters
    (models::Error)
    ,
    /// Not authenticated to get item bid options
    Status401_NotAuthenticatedToGetItemBidOptions
    (models::Error)
    ,
    /// Not authorized to get item bid options
    Status403_NotAuthorizedToGetItemBidOptions
    (models::Error)
    ,
    /// Internal error
    Status500_InternalError
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdvancedAuctionItemsSubmitSlashPostResponse {
    /// Response containing the results of the item bid options operations
    Status200_ResponseContainingTheResultsOfTheItemBidOptionsOperations
    (models::AdvancedAuctionProcessedItems)
    ,
    /// Invalid request parameters.
    Status400_InvalidRequestParameters
    (models::Error)
    ,
    /// Not authenticated to post item bid options
    Status401_NotAuthenticatedToPostItemBidOptions
    (models::Error)
    ,
    /// Not authorized to post item bid options
    Status403_NotAuthorizedToPostItemBidOptions
    (models::Error)
    ,
    /// Internal error
    Status500_InternalError
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// AdvancedAuction
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait AdvancedAuction {
    /// Get item bid options (POST).
    ///
    /// AdvancedAuctionItemsGetSlashPost - POST /v5/advanced_auction/items/get
    async fn advanced_auction_items_get_slash_post(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::AdvancedAuctionItemsGetSlashPostQueryParams,
            body: models::AdvancedAuctionItemsGetRequest,
    ) -> Result<AdvancedAuctionItemsGetSlashPostResponse, String>;

    /// Operate on item level bid options.
    ///
    /// AdvancedAuctionItemsSubmitSlashPost - POST /v5/advanced_auction/items/submit
    async fn advanced_auction_items_submit_slash_post(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::AdvancedAuctionItemsSubmitSlashPostQueryParams,
            body: models::AdvancedAuctionItemsSubmitRequest,
    ) -> Result<AdvancedAuctionItemsSubmitSlashPostResponse, String>;
}
