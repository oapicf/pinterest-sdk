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
pub enum AssetAccessRequestsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::CreateAssetAccessRequestResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CancelInvitesOrRequestsResponse {
    /// Success
    Status200_Success
    (models::DeleteInvitesResultsResponseArray)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateAssetInvitesResponse {
    /// Success
    Status200_Success
    (models::UpdateInvitesResultsResponseArray)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateMembershipOrPartnershipInvitesResponse {
    /// Success
    Status200_Success
    (models::CreateInvitesResultsResponseArray)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetSlashInvitesResponse {
    /// Success
    Status200_Success
    (models::GetInvites200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RespondBusinessAccessInvitesResponse {
    /// Success
    Status200_Success
    (models::RespondToInvitesResponseArray)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// BusinessAccessInvite
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait BusinessAccessInvite {
    /// Create a request to access an existing partner's assets..
    ///
    /// AssetAccessRequestsSlashCreate - POST /v5/businesses/{business_id}/requests/assets/access
    async fn asset_access_requests_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AssetAccessRequestsSlashCreatePathParams,
            body: models::CreateAssetAccessRequestBody,
    ) -> Result<AssetAccessRequestsSlashCreateResponse, String>;

    /// Cancel invites/requests.
    ///
    /// CancelInvitesOrRequests - DELETE /v5/businesses/{business_id}/invites
    async fn cancel_invites_or_requests(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CancelInvitesOrRequestsPathParams,
            body: models::CancelInvitesBody,
    ) -> Result<CancelInvitesOrRequestsResponse, String>;

    /// Update invite/request with an asset permission.
    ///
    /// CreateAssetInvites - POST /v5/businesses/{business_id}/invites/assets/access
    async fn create_asset_invites(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CreateAssetInvitesPathParams,
            body: models::CreateAssetInvitesRequest,
    ) -> Result<CreateAssetInvitesResponse, String>;

    /// Create invites or requests.
    ///
    /// CreateMembershipOrPartnershipInvites - POST /v5/businesses/{business_id}/invites
    async fn create_membership_or_partnership_invites(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CreateMembershipOrPartnershipInvitesPathParams,
            body: models::CreateMembershipOrPartnershipInvitesBody,
    ) -> Result<CreateMembershipOrPartnershipInvitesResponse, String>;

    /// Get invites/requests.
    ///
    /// GetSlashInvites - GET /v5/businesses/{business_id}/invites
    async fn get_slash_invites(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetSlashInvitesPathParams,
      query_params: models::GetSlashInvitesQueryParams,
    ) -> Result<GetSlashInvitesResponse, String>;

    /// Accept or decline an invite/request.
    ///
    /// RespondBusinessAccessInvites - PATCH /v5/businesses/invites
    async fn respond_business_access_invites(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: models::AuthRespondInvitesBody,
    ) -> Result<RespondBusinessAccessInvitesResponse, String>;
}
