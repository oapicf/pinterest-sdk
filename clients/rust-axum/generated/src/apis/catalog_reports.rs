use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Host};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ReportsSlashCreateResponse {
    /// Response containing the report token
    Status200_ResponseContainingTheReportToken
    (models::CatalogsCreateReportResponse)
    ,
    /// Entity (e.g., catalog, feed or processing_result) not found
    Status404_Entity
    (models::Error)
    ,
    /// Can't access this feature without an existing catalog.
    Status409_Can
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ReportsSlashGetResponse {
    /// Response that contains a link to download the report
    Status200_ResponseThatContainsALinkToDownloadTheReport
    (models::CatalogsReport)
    ,
    /// The token you provided is not valid or has expired.
    Status400_TheTokenYouProvidedIsNotValidOrHasExpired
    (models::Error)
    ,
    /// Can't access this feature without an existing catalog.
    Status409_Can
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ReportsSlashStatsResponse {
    /// Response containing the diagnostics aggregated counters
    Status200_ResponseContainingTheDiagnosticsAggregatedCounters
    (models::ReportsStats200Response)
    ,
    /// Not authorized to access catalogs
    Status401_NotAuthorizedToAccessCatalogs
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}




/// CatalogReports
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait CatalogReports<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Build catalogs report.
    ///
    /// ReportsSlashCreate - POST /v5/catalogs/reports
    async fn reports_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::ReportsSlashCreateQueryParams,
            body: &models::CatalogsReportParameters,
    ) -> Result<ReportsSlashCreateResponse, E>;

    /// Get catalogs report.
    ///
    /// ReportsSlashGet - GET /v5/catalogs/reports
    async fn reports_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::ReportsSlashGetQueryParams,
    ) -> Result<ReportsSlashGetResponse, E>;

    /// List report stats.
    ///
    /// ReportsSlashStats - GET /v5/catalogs/reports/stats
    async fn reports_slash_stats(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::ReportsSlashStatsQueryParams,
    ) -> Result<ReportsSlashStatsResponse, E>;
}
