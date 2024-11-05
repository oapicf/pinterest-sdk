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
pub enum AdGroupsBidFloorSlashGetResponse {
    /// Success
    Status200_Success
    (models::BidFloor)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (Vec<models::AdGroupsAnalyticsResponseInner>)
    ,
    /// Invalid ad account group analytics parameters.
    Status400_InvalidAdAccountGroupAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashAudienceSizingResponse {
    /// Success
    Status200_Success
    (models::AdGroupAudienceSizingResponse)
    ,
    /// Invalid ad group audience sizing parameters.
    Status400_InvalidAdGroupAudienceSizingParameters
    (models::Error)
    ,
    /// No access to requested audience list or product group.
    Status403_NoAccessToRequestedAudienceListOrProductGroup
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::AdGroupArrayResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashGetResponse {
    /// Success
    Status200_Success
    (models::AdGroupResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashListResponse {
    /// Success
    Status200_Success
    (models::AdGroupsList200Response)
    ,
    /// Invalid ad account group parameters.
    Status400_InvalidAdAccountGroupParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::AdGroupArrayResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsTargetingAnalyticsSlashGetResponse {
    /// Success
    Status200_Success
    (models::MetricsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// AdGroups
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait AdGroups {
    /// Get bid floors.
    ///
    /// AdGroupsBidFloorSlashGet - POST /v5/ad_accounts/{ad_account_id}/bid_floor
    async fn ad_groups_bid_floor_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdGroupsBidFloorSlashGetPathParams,
            body: models::BidFloorRequest,
    ) -> Result<AdGroupsBidFloorSlashGetResponse, String>;

    /// Get ad group analytics.
    ///
    /// AdGroupsSlashAnalytics - GET /v5/ad_accounts/{ad_account_id}/ad_groups/analytics
    async fn ad_groups_slash_analytics(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdGroupsSlashAnalyticsPathParams,
      query_params: models::AdGroupsSlashAnalyticsQueryParams,
    ) -> Result<AdGroupsSlashAnalyticsResponse, String>;

    /// Get audience sizing.
    ///
    /// AdGroupsSlashAudienceSizing - POST /v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing
    async fn ad_groups_slash_audience_sizing(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdGroupsSlashAudienceSizingPathParams,
            body: Option<models::AdGroupAudienceSizingRequest>,
    ) -> Result<AdGroupsSlashAudienceSizingResponse, String>;

    /// Create ad groups.
    ///
    /// AdGroupsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/ad_groups
    async fn ad_groups_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdGroupsSlashCreatePathParams,
            body: Vec<models::AdGroupCreateRequest>,
    ) -> Result<AdGroupsSlashCreateResponse, String>;

    /// Get ad group.
    ///
    /// AdGroupsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}
    async fn ad_groups_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdGroupsSlashGetPathParams,
    ) -> Result<AdGroupsSlashGetResponse, String>;

    /// List ad groups.
    ///
    /// AdGroupsSlashList - GET /v5/ad_accounts/{ad_account_id}/ad_groups
    async fn ad_groups_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdGroupsSlashListPathParams,
      query_params: models::AdGroupsSlashListQueryParams,
    ) -> Result<AdGroupsSlashListResponse, String>;

    /// Update ad groups.
    ///
    /// AdGroupsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/ad_groups
    async fn ad_groups_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdGroupsSlashUpdatePathParams,
            body: Vec<models::AdGroupUpdateRequest>,
    ) -> Result<AdGroupsSlashUpdateResponse, String>;

    /// Get targeting analytics for ad groups.
    ///
    /// AdGroupsTargetingAnalyticsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics
    async fn ad_groups_targeting_analytics_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdGroupsTargetingAnalyticsSlashGetPathParams,
      query_params: models::AdGroupsTargetingAnalyticsSlashGetQueryParams,
    ) -> Result<AdGroupsTargetingAnalyticsSlashGetResponse, String>;
}
