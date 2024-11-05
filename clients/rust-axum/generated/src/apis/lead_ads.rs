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
pub enum AdAccountsSubscriptionsSlashDelByIdResponse {
    /// Subscription deleted successfully
    Status204_SubscriptionDeletedSuccessfully
    ,
    /// Invalid input parameters.
    Status400_InvalidInputParameters
    (models::Error)
    ,
    /// You are not authorized to delete this subscription.
    Status403_YouAreNotAuthorizedToDeleteThisSubscription
    (models::Error)
    ,
    /// Subscription not found.
    Status404_SubscriptionNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSubscriptionsSlashGetByIdResponse {
    /// Success
    Status200_Success
    (models::AdAccountGetSubscriptionResponse)
    ,
    /// Invalid input parameters.
    Status400_InvalidInputParameters
    (models::Error)
    ,
    /// Can't access this subscription.
    Status403_Can
    (models::Error)
    ,
    /// Subscription not found.
    Status404_SubscriptionNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSubscriptionsSlashGetListResponse {
    /// Success
    Status200_Success
    (models::AdAccountsSubscriptionsGetList200Response)
    ,
    /// Can't access this subscription.
    Status403_Can
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSubscriptionsSlashPostResponse {
    /// Success
    Status200_Success
    (models::AdAccountCreateSubscriptionResponse)
    ,
    /// Invalid input parameters.
    Status400_InvalidInputParameters
    (models::Error)
    ,
    /// Can't access this subscription.
    Status403_Can
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}


/// LeadAds
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait LeadAds {
    /// Delete lead ads subscription.
    ///
    /// AdAccountsSubscriptionsSlashDelById - DELETE /v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}
    async fn ad_accounts_subscriptions_slash_del_by_id(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdAccountsSubscriptionsSlashDelByIdPathParams,
    ) -> Result<AdAccountsSubscriptionsSlashDelByIdResponse, String>;

    /// Get lead ads subscription.
    ///
    /// AdAccountsSubscriptionsSlashGetById - GET /v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}
    async fn ad_accounts_subscriptions_slash_get_by_id(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdAccountsSubscriptionsSlashGetByIdPathParams,
    ) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, String>;

    /// Get lead ads subscriptions.
    ///
    /// AdAccountsSubscriptionsSlashGetList - GET /v5/ad_accounts/{ad_account_id}/leads/subscriptions
    async fn ad_accounts_subscriptions_slash_get_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdAccountsSubscriptionsSlashGetListPathParams,
      query_params: models::AdAccountsSubscriptionsSlashGetListQueryParams,
    ) -> Result<AdAccountsSubscriptionsSlashGetListResponse, String>;

    /// Create lead ads subscription.
    ///
    /// AdAccountsSubscriptionsSlashPost - POST /v5/ad_accounts/{ad_account_id}/leads/subscriptions
    async fn ad_accounts_subscriptions_slash_post(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdAccountsSubscriptionsSlashPostPathParams,
            body: models::AdAccountCreateSubscriptionRequest,
    ) -> Result<AdAccountsSubscriptionsSlashPostResponse, String>;
}
