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
pub enum AssetGroupSlashCreateResponse {
    /// Success
    Status200_Success
    (models::CreateAssetGroupResponse)
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
pub enum AssetGroupSlashDeleteResponse {
    /// Success
    Status200_Success
    (models::DeleteAssetGroupResponse)
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
pub enum AssetGroupSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::UpdateAssetGroupResponse)
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
pub enum BusinessAssetMembersSlashGetResponse {
    /// Sucess
    Status200_Sucess
    (models::BusinessAssetMembersGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessAssetPartnersSlashGetResponse {
    /// Sucess
    Status200_Sucess
    (models::BusinessAssetPartnersGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessAssetsSlashGetResponse {
    /// Success
    Status200_Success
    (models::BusinessAssetsGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessMemberAssetsSlashGetResponse {
    /// Success
    Status200_Success
    (models::BusinessMemberAssetsGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessMembersAssetAccessSlashDeleteResponse {
    /// response
    Status200_Response
    (models::DeleteMemberAccessResultsResponseArray)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessMembersAssetAccessSlashUpdateResponse {
    /// response
    Status200_Response
    (models::UpdateMemberAssetsResultsResponseArray)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BusinessPartnerAssetAccessSlashGetResponse {
    /// Success
    Status200_Success
    (models::BusinessPartnerAssetAccessGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeletePartnerAssetAccessHandlerImplResponse {
    /// Success
    Status200_Success
    (models::DeletePartnerAssetsResultsResponseArray)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdatePartnerAssetAccessHandlerImplResponse {
    /// Success
    Status200_Success
    (models::UpdatePartnerAssetsResultsResponseArray)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
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
            body: &models::CreateAssetGroupBody,
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
            body: &models::DeleteAssetGroupBody,
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
            body: &models::UpdateAssetGroupBody,
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
            body: &models::BusinessMembersAssetAccessDeleteRequest,
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
