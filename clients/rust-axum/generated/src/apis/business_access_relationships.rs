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
pub enum DeleteBusinessMembershipResponse {
    /// Success
    Status200_Success
    (models::DeletedMembersResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteBusinessPartnersResponse {
    /// Success
    Status200_Success
    (models::DeletePartnersResponse)
    ,
    /// A supplied partner id doesn't exist
    Status404_ASuppliedPartnerIdDoesn
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetSlashBusinessEmployersResponse {
    /// Success
    Status200_Success
    (models::GetBusinessEmployers200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetSlashBusinessMembersResponse {
    /// Success
    Status200_Success
    (models::GetBusinessMembers200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetSlashBusinessPartnersResponse {
    /// Success
    Status200_Success
    (models::GetBusinessPartners200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdateSlashBusinessMembershipsResponse {
    /// response
    Status200_Response
    (models::UpdateMemberResultsResponseArray)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// BusinessAccessRelationships
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait BusinessAccessRelationships {
    /// Terminate business memberships.
    ///
    /// DeleteBusinessMembership - DELETE /v5/businesses/{business_id}/members
    async fn delete_business_membership(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeleteBusinessMembershipPathParams,
            body: models::MembersToDeleteBody,
    ) -> Result<DeleteBusinessMembershipResponse, String>;

    /// Terminate business partnerships.
    ///
    /// DeleteBusinessPartners - DELETE /v5/businesses/{business_id}/partners
    async fn delete_business_partners(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeleteBusinessPartnersPathParams,
            body: models::DeletePartnersRequest,
    ) -> Result<DeleteBusinessPartnersResponse, String>;

    /// List business employers for user.
    ///
    /// GetSlashBusinessEmployers - GET /v5/businesses/employers
    async fn get_slash_business_employers(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::GetSlashBusinessEmployersQueryParams,
    ) -> Result<GetSlashBusinessEmployersResponse, String>;

    /// Get business members.
    ///
    /// GetSlashBusinessMembers - GET /v5/businesses/{business_id}/members
    async fn get_slash_business_members(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetSlashBusinessMembersPathParams,
      query_params: models::GetSlashBusinessMembersQueryParams,
    ) -> Result<GetSlashBusinessMembersResponse, String>;

    /// Get business partners.
    ///
    /// GetSlashBusinessPartners - GET /v5/businesses/{business_id}/partners
    async fn get_slash_business_partners(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetSlashBusinessPartnersPathParams,
      query_params: models::GetSlashBusinessPartnersQueryParams,
    ) -> Result<GetSlashBusinessPartnersResponse, String>;

    /// Update member's business role.
    ///
    /// UpdateSlashBusinessMemberships - PATCH /v5/businesses/{business_id}/members
    async fn update_slash_business_memberships(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UpdateSlashBusinessMembershipsPathParams,
            body: Vec<models::UpdateMemberBusinessRoleBody>,
    ) -> Result<UpdateSlashBusinessMembershipsResponse, String>;
}
