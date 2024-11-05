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
pub enum CampaignTargetingAnalyticsSlashGetResponse {
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
pub enum CampaignsSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (Vec<models::CampaignsAnalyticsResponseInner>)
    ,
    /// Invalid ad account campaign analytics parameters.
    Status400_InvalidAdAccountCampaignAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CampaignsSlashCreateResponse {
    /// response
    Status200_Response
    (models::CampaignCreateResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CampaignsSlashGetResponse {
    /// Success
    Status200_Success
    (models::CampaignResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CampaignsSlashListResponse {
    /// Success
    Status200_Success
    (models::CampaignsList200Response)
    ,
    /// Invalid ad account campaign parameters.
    Status400_InvalidAdAccountCampaignParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CampaignsSlashUpdateResponse {
    /// response
    Status200_Response
    (models::CampaignUpdateResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Campaigns
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Campaigns {
    /// Get targeting analytics for campaigns.
    ///
    /// CampaignTargetingAnalyticsSlashGet - GET /v5/ad_accounts/{ad_account_id}/campaigns/targeting_analytics
    async fn campaign_targeting_analytics_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CampaignTargetingAnalyticsSlashGetPathParams,
      query_params: models::CampaignTargetingAnalyticsSlashGetQueryParams,
    ) -> Result<CampaignTargetingAnalyticsSlashGetResponse, String>;

    /// Get campaign analytics.
    ///
    /// CampaignsSlashAnalytics - GET /v5/ad_accounts/{ad_account_id}/campaigns/analytics
    async fn campaigns_slash_analytics(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CampaignsSlashAnalyticsPathParams,
      query_params: models::CampaignsSlashAnalyticsQueryParams,
    ) -> Result<CampaignsSlashAnalyticsResponse, String>;

    /// Create campaigns.
    ///
    /// CampaignsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/campaigns
    async fn campaigns_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CampaignsSlashCreatePathParams,
            body: Vec<models::CampaignCreateRequest>,
    ) -> Result<CampaignsSlashCreateResponse, String>;

    /// Get campaign.
    ///
    /// CampaignsSlashGet - GET /v5/ad_accounts/{ad_account_id}/campaigns/{campaign_id}
    async fn campaigns_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CampaignsSlashGetPathParams,
    ) -> Result<CampaignsSlashGetResponse, String>;

    /// List campaigns.
    ///
    /// CampaignsSlashList - GET /v5/ad_accounts/{ad_account_id}/campaigns
    async fn campaigns_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CampaignsSlashListPathParams,
      query_params: models::CampaignsSlashListQueryParams,
    ) -> Result<CampaignsSlashListResponse, String>;

    /// Update campaigns.
    ///
    /// CampaignsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/campaigns
    async fn campaigns_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CampaignsSlashUpdatePathParams,
            body: Vec<models::CampaignUpdateRequest>,
    ) -> Result<CampaignsSlashUpdateResponse, String>;
}
