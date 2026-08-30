use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::CookieJar;
use bytes::Bytes;
use headers::Host;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AssetGroupSlashCreateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AssetGroupInput)
    ,
    /// Resource create operation completed successfully.
    Status201_ResourceCreateOperationCompletedSuccessfully
    (models::AssetGroupInput)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AssetGroupSlashDeleteResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AssetGroupDeletion)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AssetGroupSlashUpdateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AssetGroupModification)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessAssetMembersSlashGetResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::BusinessAssetMembersGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessAssetPartnersSlashGetResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::BusinessAssetMembersGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessAssetsSlashGetResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::BusinessAssetsGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessMemberAssetsSlashGetResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::BusinessMemberAssetsGetResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessMembersAssetAccessSlashDeleteResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::DeleteMemberAccessResultsResponseArray)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessMembersAssetAccessSlashUpdateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::UpdateMemberAssetsResultsResponseArray)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessPartnerAssetAccessSlashGetResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::BusinessPartnerAssetAccessGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeletePartnerAssetAccessHandlerImplResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::DeletePartnerAssetAccessResultsResponseArray)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdatePartnerAssetAccessHandlerImplResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::UpdatePartnerAssetsResultsResponseArray)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}




/// BusinessAccessAssets
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait BusinessAccessAssets<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Create a new asset group..
    ///
    /// AssetGroupSlashCreate - POST /v5/businesses/{business_id}/asset_groups
    async fn asset_group_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AssetGroupSlashCreatePathParams,
            body: &models::AssetGroupInputCreate,
    ) -> Result<AssetGroupSlashCreateResponse, E>;

    /// Delete asset groups..
    ///
    /// AssetGroupSlashDelete - DELETE /v5/businesses/{business_id}/asset_groups
    async fn asset_group_slash_delete(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AssetGroupSlashDeletePathParams,
            body: &models::AssetGroupDeletionDelete,
    ) -> Result<AssetGroupSlashDeleteResponse, E>;

    /// Update asset groups..
    ///
    /// AssetGroupSlashUpdate - PATCH /v5/businesses/{business_id}/asset_groups
    async fn asset_group_slash_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AssetGroupSlashUpdatePathParams,
            body: &models::AssetGroupModificationReadOrUpdate,
    ) -> Result<AssetGroupSlashUpdateResponse, E>;

    /// Get members with access to asset.
    ///
    /// BusinessAssetMembersSlashGet - GET /v5/businesses/{business_id}/assets/{asset_id}/members
    async fn business_asset_members_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BusinessAssetMembersSlashGetPathParams,
      query_params: &models::BusinessAssetMembersSlashGetQueryParams,
    ) -> Result<BusinessAssetMembersSlashGetResponse, E>;

    /// Get partners with access to asset.
    ///
    /// BusinessAssetPartnersSlashGet - GET /v5/businesses/{business_id}/assets/{asset_id}/partners
    async fn business_asset_partners_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BusinessAssetPartnersSlashGetPathParams,
      query_params: &models::BusinessAssetPartnersSlashGetQueryParams,
    ) -> Result<BusinessAssetPartnersSlashGetResponse, E>;

    /// List business assets.
    ///
    /// BusinessAssetsSlashGet - GET /v5/businesses/{business_id}/assets
    async fn business_assets_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BusinessAssetsSlashGetPathParams,
      query_params: &models::BusinessAssetsSlashGetQueryParams,
    ) -> Result<BusinessAssetsSlashGetResponse, E>;

    /// Get assets assigned to a member.
    ///
    /// BusinessMemberAssetsSlashGet - GET /v5/businesses/{business_id}/members/{member_id}/assets
    async fn business_member_assets_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BusinessMemberAssetsSlashGetPathParams,
      query_params: &models::BusinessMemberAssetsSlashGetQueryParams,
    ) -> Result<BusinessMemberAssetsSlashGetResponse, E>;

    /// Delete member access to asset.
    ///
    /// BusinessMembersAssetAccessSlashDelete - DELETE /v5/businesses/{business_id}/members/assets/access
    async fn business_members_asset_access_slash_delete(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BusinessMembersAssetAccessSlashDeletePathParams,
            body: &models::BusinessMembersAssetAccessDeleteBody,
    ) -> Result<BusinessMembersAssetAccessSlashDeleteResponse, E>;

    /// Assign/Update member asset permissions.
    ///
    /// BusinessMembersAssetAccessSlashUpdate - PATCH /v5/businesses/{business_id}/members/assets/access
    async fn business_members_asset_access_slash_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BusinessMembersAssetAccessSlashUpdatePathParams,
            body: &models::UpdateMemberAssetAccessBody,
    ) -> Result<BusinessMembersAssetAccessSlashUpdateResponse, E>;

    /// Get assets assigned to a partner or assets assigned by a partner.
    ///
    /// BusinessPartnerAssetAccessSlashGet - GET /v5/businesses/{business_id}/partners/{partner_id}/assets
    async fn business_partner_asset_access_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BusinessPartnerAssetAccessSlashGetPathParams,
      query_params: &models::BusinessPartnerAssetAccessSlashGetQueryParams,
    ) -> Result<BusinessPartnerAssetAccessSlashGetResponse, E>;

    /// Delete partner access to asset.
    ///
    /// DeletePartnerAssetAccessHandlerImpl - DELETE /v5/businesses/{business_id}/partners/assets
    async fn delete_partner_asset_access_handler_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::DeletePartnerAssetAccessHandlerImplPathParams,
            body: &models::DeletePartnerAssetAccessBody,
    ) -> Result<DeletePartnerAssetAccessHandlerImplResponse, E>;

    /// Assign/Update partner asset permissions.
    ///
    /// UpdatePartnerAssetAccessHandlerImpl - PATCH /v5/businesses/{business_id}/partners/assets
    async fn update_partner_asset_access_handler_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::UpdatePartnerAssetAccessHandlerImplPathParams,
            body: &models::UpdatePartnerAssetAccessBody,
    ) -> Result<UpdatePartnerAssetAccessHandlerImplResponse, E>;
}
