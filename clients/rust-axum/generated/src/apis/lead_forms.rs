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
pub enum LeadFormSlashGetResponse {
    /// Success
    Status200_Success
    (models::LeadFormResponse)
    ,
    /// Invalid ad account lead forms parameters.
    Status400_InvalidAdAccountLeadFormsParameters
    (models::Error)
    ,
    /// The lead form ID for the given ad account ID does not exist.
    Status404_TheLeadFormIDForTheGivenAdAccountIDDoesNotExist
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LeadFormTestSlashCreateResponse {
    /// Success
    Status200_Success
    (models::LeadFormTestResponse)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Lead not found.
    Status404_LeadNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LeadFormsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::LeadFormArrayResponse)
    ,
    /// Invalid ad account lead forms parameters.
    Status400_InvalidAdAccountLeadFormsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LeadFormsSlashListResponse {
    /// Success
    Status200_Success
    (models::LeadFormsList200Response)
    ,
    /// Invalid ad account lead forms parameters.
    Status400_InvalidAdAccountLeadFormsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LeadFormsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::LeadFormArrayResponse)
    ,
    /// Invalid ad account lead forms parameters.
    Status400_InvalidAdAccountLeadFormsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// LeadForms
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait LeadForms {
    /// Get lead form by id.
    ///
    /// LeadFormSlashGet - GET /v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}
    async fn lead_form_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::LeadFormSlashGetPathParams,
    ) -> Result<LeadFormSlashGetResponse, String>;

    /// Create lead form test data.
    ///
    /// LeadFormTestSlashCreate - POST /v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test
    async fn lead_form_test_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::LeadFormTestSlashCreatePathParams,
            body: models::LeadFormTestRequest,
    ) -> Result<LeadFormTestSlashCreateResponse, String>;

    /// Create lead forms.
    ///
    /// LeadFormsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/lead_forms
    async fn lead_forms_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::LeadFormsSlashCreatePathParams,
            body: Vec<models::LeadFormCreateRequest>,
    ) -> Result<LeadFormsSlashCreateResponse, String>;

    /// List lead forms.
    ///
    /// LeadFormsSlashList - GET /v5/ad_accounts/{ad_account_id}/lead_forms
    async fn lead_forms_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::LeadFormsSlashListPathParams,
      query_params: models::LeadFormsSlashListQueryParams,
    ) -> Result<LeadFormsSlashListResponse, String>;

    /// Update lead forms.
    ///
    /// LeadFormsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/lead_forms
    async fn lead_forms_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::LeadFormsSlashUpdatePathParams,
            body: Vec<models::LeadFormUpdateRequest>,
    ) -> Result<LeadFormsSlashUpdateResponse, String>;
}
