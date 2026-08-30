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
pub enum AdAccountsAudiencesSharedAccountsSlashListResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AdAccountsAudiencesSharedAccountsList200Response)
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
pub enum BusinessAccountAudiencesSharedAccountsSlashListResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AdAccountsAudiencesSharedAccountsList200Response)
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
pub enum SharedAudiencesForBusinessSlashListResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::SharedAudiencesForBusinessList200Response)
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
pub enum UpdateAdAccountToAdAccountSharedAudienceResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AdAccountToAdAccountSharedAudience)
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
pub enum UpdateAdAccountToBusinessSharedAudienceResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AdAccountToBusinessSharedAudience)
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
pub enum UpdateBusinessToAdAccountSharedAudienceResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::BusinessToAdAccountSharedAudience)
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
pub enum UpdateBusinessToBusinessSharedAudienceResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::BusinessToBusinessSharedAudience)
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




/// AudienceSharing
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait AudienceSharing<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// List accounts with access to an audience owned by an ad account.
    ///
    /// AdAccountsAudiencesSharedAccountsSlashList - GET /v5/ad_accounts/{ad_account_id}/audiences/shared/accounts
    async fn ad_accounts_audiences_shared_accounts_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AdAccountsAudiencesSharedAccountsSlashListPathParams,
      query_params: &models::AdAccountsAudiencesSharedAccountsSlashListQueryParams,
    ) -> Result<AdAccountsAudiencesSharedAccountsSlashListResponse, E>;

    /// List accounts with access to an audience owned by a business.
    ///
    /// BusinessAccountAudiencesSharedAccountsSlashList - GET /v5/businesses/{business_id}/audiences/shared/accounts
    async fn business_account_audiences_shared_accounts_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BusinessAccountAudiencesSharedAccountsSlashListPathParams,
      query_params: &models::BusinessAccountAudiencesSharedAccountsSlashListQueryParams,
    ) -> Result<BusinessAccountAudiencesSharedAccountsSlashListResponse, E>;

    /// List received audiences for a business.
    ///
    /// SharedAudiencesForBusinessSlashList - GET /v5/businesses/{business_id}/audiences
    async fn shared_audiences_for_business_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::SharedAudiencesForBusinessSlashListPathParams,
      query_params: &models::SharedAudiencesForBusinessSlashListQueryParams,
    ) -> Result<SharedAudiencesForBusinessSlashListResponse, E>;

    /// Update audience sharing between ad accounts.
    ///
    /// UpdateAdAccountToAdAccountSharedAudience - PATCH /v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared
    async fn update_ad_account_to_ad_account_shared_audience(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::UpdateAdAccountToAdAccountSharedAudiencePathParams,
            body: &models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody,
    ) -> Result<UpdateAdAccountToAdAccountSharedAudienceResponse, E>;

    /// Update audience sharing from an ad account to businesses.
    ///
    /// UpdateAdAccountToBusinessSharedAudience - PATCH /v5/ad_accounts/{ad_account_id}/audiences/businesses/shared
    async fn update_ad_account_to_business_shared_audience(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::UpdateAdAccountToBusinessSharedAudiencePathParams,
            body: &models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody,
    ) -> Result<UpdateAdAccountToBusinessSharedAudienceResponse, E>;

    /// Update audience sharing from a business to ad accounts.
    ///
    /// UpdateBusinessToAdAccountSharedAudience - PATCH /v5/businesses/{business_id}/audiences/ad_accounts/shared
    async fn update_business_to_ad_account_shared_audience(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::UpdateBusinessToAdAccountSharedAudiencePathParams,
            body: &models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody,
    ) -> Result<UpdateBusinessToAdAccountSharedAudienceResponse, E>;

    /// Update audience sharing between businesses.
    ///
    /// UpdateBusinessToBusinessSharedAudience - PATCH /v5/businesses/{business_id}/audiences/businesses/shared
    async fn update_business_to_business_shared_audience(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::UpdateBusinessToBusinessSharedAudiencePathParams,
            body: &models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody,
    ) -> Result<UpdateBusinessToBusinessSharedAudienceResponse, E>;
}
