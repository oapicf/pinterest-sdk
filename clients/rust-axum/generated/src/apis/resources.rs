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
pub enum AdAccountCountriesSlashGetResponse {
    /// Success
    Status200_Success
    (models::AdAccountsCountryResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeliveryMetricsSlashGetResponse {
    /// Success
    Status200_Success
    (models::DeliveryMetricsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum InterestTargetingOptionsSlashGetResponse {
    /// Success
    Status200_Success
    (models::SingleInterestTargetingOptionResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LeadFormQuestionsSlashGetResponse {
    /// Success
    Status200_Success
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MetricsReadyStateSlashGetResponse {
    /// Success
    Status200_Success
    (models::BookClosedResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TargetingOptionsSlashGetResponse {
    /// Success
    Status200_Success
    (Vec<crate::types::Object>)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Resources
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Resources {
    /// Get ad accounts countries.
    ///
    /// AdAccountCountriesSlashGet - GET /v5/resources/ad_account_countries
    async fn ad_account_countries_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
    ) -> Result<AdAccountCountriesSlashGetResponse, String>;

    /// Get available metrics' definitions.
    ///
    /// DeliveryMetricsSlashGet - GET /v5/resources/delivery_metrics
    async fn delivery_metrics_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::DeliveryMetricsSlashGetQueryParams,
    ) -> Result<DeliveryMetricsSlashGetResponse, String>;

    /// Get interest details.
    ///
    /// InterestTargetingOptionsSlashGet - GET /v5/resources/targeting/interests/{interest_id}
    async fn interest_targeting_options_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::InterestTargetingOptionsSlashGetPathParams,
    ) -> Result<InterestTargetingOptionsSlashGetResponse, String>;

    /// Get lead form questions.
    ///
    /// LeadFormQuestionsSlashGet - GET /v5/resources/lead_form_questions
    async fn lead_form_questions_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
    ) -> Result<LeadFormQuestionsSlashGetResponse, String>;

    /// Get metrics ready state.
    ///
    /// MetricsReadyStateSlashGet - GET /v5/resources/metrics_ready_state
    async fn metrics_ready_state_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::MetricsReadyStateSlashGetQueryParams,
    ) -> Result<MetricsReadyStateSlashGetResponse, String>;

    /// Get targeting options.
    ///
    /// TargetingOptionsSlashGet - GET /v5/resources/targeting/{targeting_type}
    async fn targeting_options_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::TargetingOptionsSlashGetPathParams,
      query_params: models::TargetingOptionsSlashGetQueryParams,
    ) -> Result<TargetingOptionsSlashGetResponse, String>;
}
