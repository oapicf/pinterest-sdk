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
pub enum LeadsExportSlashCreateResponse {
    /// Success
    Status200_Success
    (models::LeadsExportCreateResponse)
    ,
    /// Invalid ad account parameter.
    Status400_InvalidAdAccountParameter
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LeadsExportSlashGetResponse {
    /// Success
    Status200_Success
    (models::LeadsExportResponseData)
    ,
    /// Invalid ad account parameter.
    Status400_InvalidAdAccountParameter
    (models::Error)
    ,
    /// Invalid leads export id parameter.
    Status404_InvalidLeadsExportIdParameter
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// LeadsExport
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait LeadsExport {
    /// Create a request to export leads collected from a lead ad.
    ///
    /// LeadsExportSlashCreate - POST /v5/ad_accounts/{ad_account_id}/leads_export
    async fn leads_export_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::LeadsExportSlashCreatePathParams,
            body: models::LeadsExportCreateRequest,
    ) -> Result<LeadsExportSlashCreateResponse, String>;

    /// Get the lead export from the lead export create call.
    ///
    /// LeadsExportSlashGet - GET /v5/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}
    async fn leads_export_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::LeadsExportSlashGetPathParams,
    ) -> Result<LeadsExportSlashGetResponse, String>;
}
