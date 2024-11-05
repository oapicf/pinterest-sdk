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
pub enum AdAccountsAudiencesSharedAccountsSlashListResponse {
    /// Success
    Status200_Success
    (models::AdAccountsAudiencesSharedAccountsList200Response)
    ,
    /// Invalid ad account audiences shared accounts parameters.
    Status400_InvalidAdAccountAudiencesSharedAccountsParameters
    (models::Error)
    ,
    /// Shared accounts not found.
    Status404_SharedAccountsNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessAccountAudiencesSharedAccountsSlashListResponse {
    /// Success
    Status200_Success
    (models::AdAccountsAudiencesSharedAccountsList200Response)
    ,
    /// Invalid business audiences shared accounts parameters.
    Status400_InvalidBusinessAudiencesSharedAccountsParameters
    (models::Error)
    ,
    /// Shared accounts not found.
    Status404_SharedAccountsNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SharedAudiencesForBusinessSlashListResponse {
    /// Success
    Status200_Success
    (models::AudiencesList200Response)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdateAdAccountToAdAccountSharedAudienceResponse {
    /// Success
    Status200_Success
    (models::SharedAudienceResponse)
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
pub enum UpdateAdAccountToBusinessSharedAudienceResponse {
    /// Success
    Status200_Success
    (models::BusinessSharedAudienceResponse)
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
pub enum UpdateBusinessToAdAccountSharedAudienceResponse {
    /// Success
    Status200_Success
    (models::SharedAudienceResponse)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdateBusinessToBusinessSharedAudienceResponse {
    /// Success
    Status200_Success
    (models::BusinessSharedAudienceResponse)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// AudienceSharing
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait AudienceSharing {
    /// List accounts with access to an audience owned by an ad account.
    ///
    /// AdAccountsAudiencesSharedAccountsSlashList - GET /v5/ad_accounts/{ad_account_id}/audiences/shared/accounts
    async fn ad_accounts_audiences_shared_accounts_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdAccountsAudiencesSharedAccountsSlashListPathParams,
      query_params: models::AdAccountsAudiencesSharedAccountsSlashListQueryParams,
    ) -> Result<AdAccountsAudiencesSharedAccountsSlashListResponse, String>;

    /// List accounts with access to an audience owned by a business.
    ///
    /// BusinessAccountAudiencesSharedAccountsSlashList - GET /v5/businesses/{business_id}/audiences/shared/accounts
    async fn business_account_audiences_shared_accounts_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::BusinessAccountAudiencesSharedAccountsSlashListPathParams,
      query_params: models::BusinessAccountAudiencesSharedAccountsSlashListQueryParams,
    ) -> Result<BusinessAccountAudiencesSharedAccountsSlashListResponse, String>;

    /// List received audiences for a business.
    ///
    /// SharedAudiencesForBusinessSlashList - GET /v5/businesses/{business_id}/audiences
    async fn shared_audiences_for_business_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::SharedAudiencesForBusinessSlashListPathParams,
      query_params: models::SharedAudiencesForBusinessSlashListQueryParams,
    ) -> Result<SharedAudiencesForBusinessSlashListResponse, String>;

    /// Update audience sharing between ad accounts.
    ///
    /// UpdateAdAccountToAdAccountSharedAudience - PATCH /v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared
    async fn update_ad_account_to_ad_account_shared_audience(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateAdAccountToAdAccountSharedAudiencePathParams,
            body: models::SharedAudience,
    ) -> Result<UpdateAdAccountToAdAccountSharedAudienceResponse, String>;

    /// Update audience sharing from an ad account to businesses.
    ///
    /// UpdateAdAccountToBusinessSharedAudience - PATCH /v5/ad_accounts/{ad_account_id}/audiences/businesses/shared
    async fn update_ad_account_to_business_shared_audience(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateAdAccountToBusinessSharedAudiencePathParams,
            body: models::BusinessSharedAudience,
    ) -> Result<UpdateAdAccountToBusinessSharedAudienceResponse, String>;

    /// Update audience sharing from a business to ad accounts.
    ///
    /// UpdateBusinessToAdAccountSharedAudience - PATCH /v5/businesses/{business_id}/audiences/ad_accounts/shared
    async fn update_business_to_ad_account_shared_audience(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateBusinessToAdAccountSharedAudiencePathParams,
            body: models::SharedAudience,
    ) -> Result<UpdateBusinessToAdAccountSharedAudienceResponse, String>;

    /// Update audience sharing between businesses.
    ///
    /// UpdateBusinessToBusinessSharedAudience - PATCH /v5/businesses/{business_id}/audiences/businesses/shared
    async fn update_business_to_business_shared_audience(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateBusinessToBusinessSharedAudiencePathParams,
            body: models::BusinessSharedAudience,
    ) -> Result<UpdateBusinessToBusinessSharedAudienceResponse, String>;
}
