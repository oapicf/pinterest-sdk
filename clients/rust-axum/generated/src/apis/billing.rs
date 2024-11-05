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
pub enum AdsCreditSlashRedeemResponse {
    /// Successfully redeemed ad credits.
    Status200_SuccessfullyRedeemedAdCredits
    (models::AdsCreditRedeemResponse)
    ,
    /// Error thrown when unable to redeem offer code.
    Status400_ErrorThrownWhenUnableToRedeemOfferCode
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsCreditsDiscountsSlashGetResponse {
    /// Success
    Status200_Success
    (models::AdsCreditsDiscountsGet200Response)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BillingProfilesSlashGetResponse {
    /// Success
    Status200_Success
    (models::BillingProfilesGet200Response)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioAccountsSlashGetResponse {
    /// Success
    Status200_Success
    (models::SsioAccountResponse)
    ,
    /// Invalid request parameter.
    Status400_InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioInsertionOrderSlashCreateResponse {
    /// Success
    Status200_Success
    (models::SsioCreateInsertionOrderResponse)
    ,
    /// Invalid request.
    Status400_InvalidRequest
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioInsertionOrderSlashEditResponse {
    /// Success
    Status200_Success
    (models::SsioEditInsertionOrderResponse)
    ,
    /// Invalid request.
    Status400_InvalidRequest
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioInsertionOrdersStatusSlashGetByAdAccountResponse {
    /// Success
    Status200_Success
    (models::SsioInsertionOrdersStatusGetByAdAccount200Response)
    ,
    /// Invalid request parameter.
    Status400_InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse {
    /// Success
    Status200_Success
    (models::SsioInsertionOrderStatusResponse)
    ,
    /// Invalid request parameter.
    Status400_InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioOrderLinesSlashGetByAdAccountResponse {
    /// Success
    Status200_Success
    (models::SsioOrderLinesGetByAdAccount200Response)
    ,
    /// Invalid request parameter.
    Status400_InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Billing
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Billing {
    /// Redeem ad credits.
    ///
    /// AdsCreditSlashRedeem - POST /v5/ad_accounts/{ad_account_id}/ads_credit/redeem
    async fn ads_credit_slash_redeem(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdsCreditSlashRedeemPathParams,
            body: models::AdsCreditRedeemRequest,
    ) -> Result<AdsCreditSlashRedeemResponse, String>;

    /// Get ads credit discounts.
    ///
    /// AdsCreditsDiscountsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ads_credit/discounts
    async fn ads_credits_discounts_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdsCreditsDiscountsSlashGetPathParams,
      query_params: models::AdsCreditsDiscountsSlashGetQueryParams,
    ) -> Result<AdsCreditsDiscountsSlashGetResponse, String>;

    /// Get billing profiles.
    ///
    /// BillingProfilesSlashGet - GET /v5/ad_accounts/{ad_account_id}/billing_profiles
    async fn billing_profiles_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::BillingProfilesSlashGetPathParams,
      query_params: models::BillingProfilesSlashGetQueryParams,
    ) -> Result<BillingProfilesSlashGetResponse, String>;

    /// Get Salesforce account details including bill-to information..
    ///
    /// SsioAccountsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ssio/accounts
    async fn ssio_accounts_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SsioAccountsSlashGetPathParams,
    ) -> Result<SsioAccountsSlashGetResponse, String>;

    /// Create insertion order through SSIO..
    ///
    /// SsioInsertionOrderSlashCreate - POST /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders
    async fn ssio_insertion_order_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SsioInsertionOrderSlashCreatePathParams,
            body: models::SsioCreateInsertionOrderRequest,
    ) -> Result<SsioInsertionOrderSlashCreateResponse, String>;

    /// Edit insertion order through SSIO..
    ///
    /// SsioInsertionOrderSlashEdit - PATCH /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders
    async fn ssio_insertion_order_slash_edit(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SsioInsertionOrderSlashEditPathParams,
            body: models::SsioEditInsertionOrderRequest,
    ) -> Result<SsioInsertionOrderSlashEditResponse, String>;

    /// Get insertion order status by ad account id..
    ///
    /// SsioInsertionOrdersStatusSlashGetByAdAccount - GET /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status
    async fn ssio_insertion_orders_status_slash_get_by_ad_account(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SsioInsertionOrdersStatusSlashGetByAdAccountPathParams,
      query_params: models::SsioInsertionOrdersStatusSlashGetByAdAccountQueryParams,
    ) -> Result<SsioInsertionOrdersStatusSlashGetByAdAccountResponse, String>;

    /// Get insertion order status by pin order id..
    ///
    /// SsioInsertionOrdersStatusSlashGetByPinOrderId - GET /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status
    async fn ssio_insertion_orders_status_slash_get_by_pin_order_id(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SsioInsertionOrdersStatusSlashGetByPinOrderIdPathParams,
    ) -> Result<SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse, String>;

    /// Get Salesforce order lines by ad account id..
    ///
    /// SsioOrderLinesSlashGetByAdAccount - GET /v5/ad_accounts/{ad_account_id}/ssio/order_lines
    async fn ssio_order_lines_slash_get_by_ad_account(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SsioOrderLinesSlashGetByAdAccountPathParams,
      query_params: models::SsioOrderLinesSlashGetByAdAccountQueryParams,
    ) -> Result<SsioOrderLinesSlashGetByAdAccountResponse, String>;
}
