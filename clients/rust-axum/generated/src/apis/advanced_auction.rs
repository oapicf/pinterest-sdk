use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::CookieJar;
use bytes::Bytes;
use headers::Host;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdvancedAuctionItemsGetSlashPostResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AdvancedAuctionItems)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// The server encountered an unexpected condition that prevented it from fulfilling the request.
    Status500_TheServerEncounteredAnUnexpectedConditionThatPreventedItFromFulfillingTheRequest
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdvancedAuctionItemsSubmitSlashPostResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AdvancedAuctionProcessedItems)
    ,
    /// Successful
    Status206_Successful
    (models::AdvancedAuctionProcessedItems)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// The server encountered an unexpected condition that prevented it from fulfilling the request.
    Status500_TheServerEncounteredAnUnexpectedConditionThatPreventedItFromFulfillingTheRequest
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}




/// AdvancedAuction
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait AdvancedAuction<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Get item bid options (POST).
    ///
    /// AdvancedAuctionItemsGetSlashPost - POST /v5/advanced_auction/items/get
    async fn advanced_auction_items_get_slash_post(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::AdvancedAuctionItemsGetSlashPostQueryParams,
            body: &models::AdvancedAuctionItemsGetRequest,
    ) -> Result<AdvancedAuctionItemsGetSlashPostResponse, E>;

    /// Operate on item level bid options.
    ///
    /// AdvancedAuctionItemsSubmitSlashPost - POST /v5/advanced_auction/items/submit
    async fn advanced_auction_items_submit_slash_post(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::AdvancedAuctionItemsSubmitSlashPostQueryParams,
            body: &models::AdvancedAuctionItemsSubmitRequest,
    ) -> Result<AdvancedAuctionItemsSubmitSlashPostResponse, E>;
}
