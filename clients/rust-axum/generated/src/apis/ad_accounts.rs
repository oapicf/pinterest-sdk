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
pub enum AdAccountSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (Vec<models::AdAccountAnalyticsResponseInner>)
    ,
    /// Invalid ad account analytics parameters.
    Status400_InvalidAdAccountAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountTargetingAnalyticsSlashGetResponse {
    /// Success
    Status200_Success
    (models::MetricsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::AdAccount)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSlashGetResponse {
    /// Success
    Status200_Success
    (models::AdAccount)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSlashListResponse {
    /// response
    Status200_Response
    (models::AdAccountsList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AnalyticsSlashCreateMmmReportResponse {
    /// Success
    Status200_Success
    (models::CreateMmmReportResponse)
    ,
    /// Invalid ad account ads analytics mmm parameters
    Status400_InvalidAdAccountAdsAnalyticsMmmParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AnalyticsSlashCreateReportResponse {
    /// Success
    Status200_Success
    (models::AdsAnalyticsCreateAsyncResponse)
    ,
    /// Invalid ad account ads analytics parameters.
    Status400_InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AnalyticsSlashCreateTemplateReportResponse {
    /// Success
    Status200_Success
    (models::AdsAnalyticsCreateAsyncResponse)
    ,
    /// Invalid ad account ads analytics template parameters.
    Status400_InvalidAdAccountAdsAnalyticsTemplateParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AnalyticsSlashGetMmmReportResponse {
    /// Success
    Status200_Success
    (models::GetMmmReportResponse)
    ,
    /// Invalid ad account ads analytics parameters.
    Status400_InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AnalyticsSlashGetReportResponse {
    /// Success
    Status200_Success
    (models::AdsAnalyticsGetAsyncResponse)
    ,
    /// Invalid ad account ads analytics parameters.
    Status400_InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SandboxSlashDeleteResponse {
    /// OK
    Status200_OK
    (String)
    ,
    /// Invalid ad account id.
    Status400_InvalidAdAccountId
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TemplatesSlashListResponse {
    /// Success
    Status200_Success
    (models::TemplatesList200Response)
    ,
    /// Invalid ad account template parameters.
    Status400_InvalidAdAccountTemplateParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// AdAccounts
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait AdAccounts {
    /// Get ad account analytics.
    ///
    /// AdAccountSlashAnalytics - GET /v5/ad_accounts/{ad_account_id}/analytics
    async fn ad_account_slash_analytics(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdAccountSlashAnalyticsPathParams,
      query_params: models::AdAccountSlashAnalyticsQueryParams,
    ) -> Result<AdAccountSlashAnalyticsResponse, String>;

    /// Get targeting analytics for an ad account.
    ///
    /// AdAccountTargetingAnalyticsSlashGet - GET /v5/ad_accounts/{ad_account_id}/targeting_analytics
    async fn ad_account_targeting_analytics_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdAccountTargetingAnalyticsSlashGetPathParams,
      query_params: models::AdAccountTargetingAnalyticsSlashGetQueryParams,
    ) -> Result<AdAccountTargetingAnalyticsSlashGetResponse, String>;

    /// Create ad account.
    ///
    /// AdAccountsSlashCreate - POST /v5/ad_accounts
    async fn ad_accounts_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: models::AdAccountCreateRequest,
    ) -> Result<AdAccountsSlashCreateResponse, String>;

    /// Get ad account.
    ///
    /// AdAccountsSlashGet - GET /v5/ad_accounts/{ad_account_id}
    async fn ad_accounts_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdAccountsSlashGetPathParams,
    ) -> Result<AdAccountsSlashGetResponse, String>;

    /// List ad accounts.
    ///
    /// AdAccountsSlashList - GET /v5/ad_accounts
    async fn ad_accounts_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::AdAccountsSlashListQueryParams,
    ) -> Result<AdAccountsSlashListResponse, String>;

    /// Create a request for a Marketing Mix Modeling (MMM) report.
    ///
    /// AnalyticsSlashCreateMmmReport - POST /v5/ad_accounts/{ad_account_id}/mmm_reports
    async fn analytics_slash_create_mmm_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AnalyticsSlashCreateMmmReportPathParams,
            body: models::CreateMmmReportRequest,
    ) -> Result<AnalyticsSlashCreateMmmReportResponse, String>;

    /// Create async request for an account analytics report.
    ///
    /// AnalyticsSlashCreateReport - POST /v5/ad_accounts/{ad_account_id}/reports
    async fn analytics_slash_create_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AnalyticsSlashCreateReportPathParams,
            body: models::AdsAnalyticsCreateAsyncRequest,
    ) -> Result<AnalyticsSlashCreateReportResponse, String>;

    /// Create async request for an analytics report using a template.
    ///
    /// AnalyticsSlashCreateTemplateReport - POST /v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports
    async fn analytics_slash_create_template_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AnalyticsSlashCreateTemplateReportPathParams,
      query_params: models::AnalyticsSlashCreateTemplateReportQueryParams,
    ) -> Result<AnalyticsSlashCreateTemplateReportResponse, String>;

    /// Get advertiser Marketing Mix Modeling (MMM) report..
    ///
    /// AnalyticsSlashGetMmmReport - GET /v5/ad_accounts/{ad_account_id}/mmm_reports
    async fn analytics_slash_get_mmm_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AnalyticsSlashGetMmmReportPathParams,
      query_params: models::AnalyticsSlashGetMmmReportQueryParams,
    ) -> Result<AnalyticsSlashGetMmmReportResponse, String>;

    /// Get the account analytics report created by the async call.
    ///
    /// AnalyticsSlashGetReport - GET /v5/ad_accounts/{ad_account_id}/reports
    async fn analytics_slash_get_report(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AnalyticsSlashGetReportPathParams,
      query_params: models::AnalyticsSlashGetReportQueryParams,
    ) -> Result<AnalyticsSlashGetReportResponse, String>;

    /// Delete ads data for ad account in API Sandbox.
    ///
    /// SandboxSlashDelete - DELETE /v5/ad_accounts/{ad_account_id}/sandbox
    async fn sandbox_slash_delete(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SandboxSlashDeletePathParams,
    ) -> Result<SandboxSlashDeleteResponse, String>;

    /// List templates.
    ///
    /// TemplatesSlashList - GET /v5/ad_accounts/{ad_account_id}/templates
    async fn templates_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::TemplatesSlashListPathParams,
      query_params: models::TemplatesSlashListQueryParams,
    ) -> Result<TemplatesSlashListResponse, String>;
}
