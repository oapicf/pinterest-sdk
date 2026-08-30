#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, unused_attributes, non_camel_case_types)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use futures::Stream;
#[cfg(feature = "mock")]
use mockall::automock;
use std::error::Error;
use std::collections::BTreeSet;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper, auth::Authorization};
use serde::{Serialize, Deserialize};

#[cfg(any(feature = "client", feature = "server"))]
type ServiceError = Box<dyn Error + Send + Sync + 'static>;

pub const BASE_PATH: &str = "/v5";
pub const API_VERSION: &str = "5.28.0";

mod auth;
pub use auth::{AuthenticationApi, Claims};


#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccount)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::AdAccount)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccountsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountSlashAnalyticsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::AdAccountAnalyticsItems>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountTargetingAnalyticsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::MetricsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccount)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsSlashCreateConversionProductReportResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ConversionProductReport)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::ConversionProductReport)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsSlashCreateMmmReportResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::MmmReport)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::MmmReport)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsSlashCreateReportResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdsAnalyticsCreateAsyncResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsSlashGetConversionProductReportResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ConversionProductReport)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsSlashGetMmmReportResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::MmmReport)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsSlashGetReportResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdsAnalyticsGetAsyncResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SandboxSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (String)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TemplatesSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::TemplatesList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsSlashCreateTemplateReportResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::TemplateBasedReport)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::TemplateBasedReport)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsBidFloorSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BidFloor)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::BidFloor)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsSlashAnalyticsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::AdGroupsAnalyticsMetrics>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsSlashAudienceSizingResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdGroupAudienceSizing)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::AdGroupAudienceSizing)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdGroupsCreate200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdGroupsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdGroupsCreate200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsTargetingAnalyticsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::MetricsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetAdGroupsByPromotionIdsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdGroupsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsDynamicTitlesSlashDownloadCsvResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::DynamicTitlesDownloadCsv)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsDynamicTitlesSlashGetStatusResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::DynamicTitlesGetStatus)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsDynamicTitlesSlashGetUploadUrlResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::DynamicTitlesUploadUrl)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsDynamicTitlesSlashProcessCsvResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::DynamicTitlesProcessCsv)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::DynamicTitlesProcessCsv)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdGroup)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdPreviewsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdPreviewUrlResponse)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::AdPreviewUrlResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdTargetingAnalyticsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::MetricsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsSlashAnalyticsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::AdsAnalytics>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdBatchWriteResponseModel)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdBatchWriteResponseModel)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignAdPreviewSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::CampaignAdPreviewCreate200ResponseInner>)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (Vec<models::CampaignAdPreview>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignAdPreviewSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::CampaignAdPreviewDelete200ResponseInner>)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignAdPreviewSlashReadResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::CampaignAdPreview>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Ad)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdvancedAuctionItemsGetSlashPostResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdvancedAuctionItems)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// The server encountered an unexpected condition that prevented it from fulfilling the request.
    TheServerEncounteredAnUnexpectedConditionThatPreventedItFromFulfillingTheRequest
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdvancedAuctionItemsSubmitSlashPostResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdvancedAuctionProcessedItems)
    ,
    /// Successful
    Successful
    (models::AdvancedAuctionProcessedItems)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// The server encountered an unexpected condition that prevented it from fulfilling the request.
    TheServerEncounteredAnUnexpectedConditionThatPreventedItFromFulfillingTheRequest
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudienceInsightsScopeAndTypeSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AudienceInsightsScopeAndTypeGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudienceInsightsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AudienceInsights)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsAudiencesSharedAccountsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccountsAudiencesSharedAccountsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BusinessAccountAudiencesSharedAccountsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccountsAudiencesSharedAccountsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SharedAudiencesForBusinessSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SharedAudiencesForBusinessList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdateAdAccountToAdAccountSharedAudienceResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccountToAdAccountSharedAudience)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdateAdAccountToBusinessSharedAudienceResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccountToBusinessSharedAudience)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdateBusinessToAdAccountSharedAudienceResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BusinessToAdAccountSharedAudience)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdateBusinessToBusinessSharedAudienceResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BusinessToBusinessSharedAudience)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudiencesSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccountsAudience)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::AdAccountsAudience)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudiencesSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AudiencesList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudiencesSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccountsAudience)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudiencesSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccountsAudience)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsCreditSlashRedeemResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdsCreditRedeem)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::AdsCreditRedeem)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsCreditsDiscountsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdsCreditsDiscountsGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BillingInvoicesSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BillingInvoicesGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BillingProfilesSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BillingProfilesGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioAccountsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SsioAccount)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioInsertionOrderSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SsioInsertionOrder)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::SsioInsertionOrder)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioInsertionOrderSlashEditResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SsioInsertionOrder)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioInsertionOrdersStatusSlashGetByAdAccountResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SsioInsertionOrdersStatusGetByAdAccount200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioOrderLinesSlashGetByAdAccountResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SsioOrderLinesGetByAdAccount200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BillingInvoiceDownloadSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BillingInvoiceDownloadResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SsioInsertionOrderStatusResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Board)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::Board)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BoardsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BoardSection)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::BoardSection)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BoardSectionsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Board)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Board)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsSlashListPinsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BoardsListPins200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BoardWithUpdatePrivacy)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BoardSection)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsSlashListPinsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BoardsListPins200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BoardSection)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BulkDownloadSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BulkDownload)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::BulkDownload)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BulkUpsertSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BulkUpsertResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BulkRequestSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BulkJobData)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AssetGroupSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AssetGroupInput)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::AssetGroupInput)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AssetGroupSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AssetGroupDeletion)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AssetGroupSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AssetGroupModification)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BusinessAssetsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BusinessAssetsGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BusinessMembersAssetAccessSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::DeleteMemberAccessResultsResponseArray)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BusinessMembersAssetAccessSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::UpdateMemberAssetsResultsResponseArray)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeletePartnerAssetAccessHandlerImplResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::DeletePartnerAssetAccessResultsResponseArray)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdatePartnerAssetAccessHandlerImplResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::UpdatePartnerAssetsResultsResponseArray)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BusinessAssetMembersSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BusinessAssetMembersGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BusinessAssetPartnersSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BusinessAssetMembersGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BusinessMemberAssetsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BusinessMemberAssetsGetResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BusinessPartnerAssetAccessSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BusinessPartnerAssetAccessGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum RespondBusinessAccessInvitesResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::RespondToInvitesResponseArray)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AssetAccessRequestsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CreateAssetAccessRequestResponse)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::CreateAssetAccessRequestResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CancelInvitesOrRequestsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CancelInvitesResponse)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CreateAssetInvitesResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::UpdateInvitesResultsResponseArray)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::UpdateInvitesResultsResponseArray)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CreateMembershipOrPartnershipInvitesResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CreateInvitesResultsResponseArray)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::CreateInvitesResultsResponseArray)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetSlashInvitesResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::GetInvites200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetSlashBusinessEmployersResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::GetBusinessEmployers200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BrandAccountsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BrandAccount)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::BrandAccount)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeleteBusinessMembershipResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::DeleteBusinessMembership200Response)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeleteBusinessPartnersResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::DeleteBusinessPartners)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetSlashBusinessMembersResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::GetBusinessEmployers200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetSlashBusinessPartnersResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::GetBusinessEmployers200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdateSlashBusinessMembershipsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::UpdateBusinessMembershipsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BrandAccountsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BrandAccount)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The request could not be processed because of a conflict in the current state of the resource.
    TheRequestCouldNotBeProcessedBecauseOfAConflictInTheCurrentStateOfTheResource
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SystemUserSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdPinsSlashAnalyticsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::AdPinAnalytics>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignTargetingAnalyticsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::MetricsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignsSlashAnalyticsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::CampaignsAnalyticsMetrics>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CampaignBatchWriteResponseModel)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CampaignsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CampaignBatchWriteResponseModel)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum GetCampaignDeliveryEstimatesResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CampaignDeliveryEstimatesResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// The service is temporarily unavailable.
    TheServiceIsTemporarilyUnavailable
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Campaign)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsFeed)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::CatalogsFeed)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::FeedsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedProcessingResultsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::FeedProcessingResultsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsFeed)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsFeed)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsSlashIngestResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsFeedIngestion)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsFeed)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ItemsIssuesSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ItemsIssuesList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ItemsBatchSlashPostResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsItemsBatch)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ItemsSlashPostResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ItemsPost200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ItemsBatchSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsItemsBatch)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsVerticalProductGroup)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::CatalogsVerticalProductGroup)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsSlashCreateManyResponse {
    /// The request has succeeded and a new resource has been created as a result.
    TheRequestHasSucceededAndANewResourceHasBeenCreatedAsAResult
    (Vec<models::CatalogsProductGroupsCreateManyResponse201Items>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsSlashDeleteManyResponse {
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsProductGroupsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductsByProductGroupFilterSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsProductGroupPinsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupPinsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsProductGroupPinsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsVerticalProductGroup)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsVerticalProductGroup)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsSlashProductCountsGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsProductGroupProductCountsVertical)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsVerticalProductGroup)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ReportsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsCreateReportResponse)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::CatalogsCreateReportResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ReportsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsReport)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ReportsSlashStatsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ReportsStats200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsLocalInventoryItemsBatchSlashOperateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SupplementalItemsBatchResponse)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::LocalInventoryItemsBatch)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsLocalInventoryItemsSlashPostResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LocalInventoryItemsGet)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::LocalInventoryItemsGet)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsLocalStoresSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::CatalogsLocalStoresCreate200ResponseInner>)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (Vec<models::LocalStore>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsLocalStoresSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::CatalogsLocalStoresDelete200ResponseInner>)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsLocalStoresSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsLocalStoresList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsLocalStoresSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::CatalogsLocalStoresCreate200ResponseInner>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsSupplementalItemsBatchSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SupplementalItemsBatchResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsSlashAvailableFilterValuesResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsAvailableFilterValues)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Catalog)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::Catalog)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CatalogsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConversionDeletionRequestSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ConversionDeletionRequest)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::ConversionDeletionRequest)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConversionDeletionRequestSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ConversionDeletionRequestList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConversionDeletionRequestSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ConversionDeletionRequest)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConversionDeletionRequestSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ConversionDeletionRequest)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConversionEqsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::EventQualityScore>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum EventsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ConversionEvents)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The request was well-formed but was unable to be followed due to semantic errors.
    TheRequestWasWell
    (models::DetailedError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// The server is currently unable to handle the request due to a temporary overload or scheduled maintenance.
    TheServerIsCurrentlyUnableToHandleTheRequestDueToATemporaryOverloadOrScheduledMaintenance
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConversionTagsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ConversionTag)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::ConversionTag)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConversionTagsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ConversionTagsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum OcpmEligibleConversionTagsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (std::collections::HashMap<String, Vec<models::ConversionEventResponse>>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PageVisitConversionTagsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::PageVisitConversionTagsGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConversionTagsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ConversionTag)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdvertiserDefinedEventsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdvertiserDefinedEventsCreate200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdvertiserDefinedEventsSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdvertiserDefinedEventsCreate200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdvertiserDefinedEventsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdvertiserDefinedEventsGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdvertiserDefinedEventsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdvertiserDefinedEventsCreate200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerListUploadsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CustomerListUploadCreateResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerListUploadsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CustomerListUpload)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerListUploadsSlashRunResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CustomerListUpload)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerListsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CustomerList)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::CustomerList)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerListsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CustomerListsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerListsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CustomerList)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerListsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CustomerList)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerSegmentSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CustomerSegment)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::CustomerSegment)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerSegmentSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::CustomerSegmentList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerSegmentSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsCommerceSlashPostResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::IntegrationMetadata)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::IntegrationMetadata)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsLogsSlashPostResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::IntegrationLogsSuccessResponse)
    ,
    /// The server could not understand the request due to invalid syntax.
    TheServerCouldNotUnderstandTheRequestDueToInvalidSyntax
    (models::IntegrationLogsInvalidLogResponse)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsSlashGetListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::IntegrationsGetList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsCommerceSlashDelResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::IntegrationMetadata)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsCommerceSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::IntegrationMetadata)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsCommerceSlashPatchResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::IntegrationMetadata)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsSlashGetByIdResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::IntegrationRecord)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CountryKeywordsMetricsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::KeywordsMetricsArrayResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum KeywordsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Keywords)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::Keywords)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum KeywordsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::KeywordsGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum KeywordsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Keywords)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TrendingKeywordsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::TrendingKeywordsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LabelsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LabelsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LabelsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LabelsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LabelsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LabelsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LabelsSlashApplyResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LabeledEntities)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::LabeledEntities)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LabelsSlashRemoveResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LabeledEntities)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::LabeledEntities)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSubscriptionsSlashGetListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccountsSubscriptionsGetList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSubscriptionsSlashPostResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LeadSubscription)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSubscriptionsSlashDelByIdResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LeadSubscription)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSubscriptionsSlashGetByIdResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LeadSubscription)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadFormsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LeadFormsCreate200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadFormsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LeadFormsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadFormsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LeadFormsCreate200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadFormSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LeadForm)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadFormTestSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LeadFormTest)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadsExportSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LeadsExports)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::LeadsExports)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadsExportSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::LeadsExportResponseData)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MediaSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::MediaUpload)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::MediaUpload)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MediaSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::MediaList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MediaSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Media)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MsotEventsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (serde_json::Value)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum NotificationSlashPostResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::NotificationResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum OauthSlashConversionTokenResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ConversionAccessToken)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum OauthSlashTokenResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::OauthAccessToken)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::OauthAccessToken)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TokenSlashRevokeResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum OrderLinesSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::OrderLinesList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum OrderLinesSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::OrderLine)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MultiPinsSlashAnalyticsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (std::collections::HashMap<String, models::PinAnalyticsResponse>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Pin)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::Pin)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::PinsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsSlashAnalyticsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (std::collections::HashMap<String, models::PinAnalyticsMetricsResponse>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Pin)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Pin)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsSlashSaveResponse {
    /// The request has succeeded and a new resource has been created as a result.
    TheRequestHasSucceededAndANewResourceHasBeenCreatedAsAResult
    (models::Pin)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Pin)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductGroupPromotionsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ProductGroupPromotions)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::ProductGroupPromotions)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductGroupPromotionsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ProductGroupPromotionsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductGroupPromotionsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ProductGroupPromotions)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductGroupsSlashAnalyticsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::ProductGroupAnalyticsItems>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductGroupPromotionsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ProductGroupPromotion)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductTagsSlashBulkAddResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ProductTagsResponse)
    ,
    /// The request contains ineligible product tags.
    TheRequestContainsIneligibleProductTags
    (models::ProductTagsError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductTagsSlashBulkDeleteResponse {
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductTagsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::ProductTagsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PromotionsSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::PromotionsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PromotionsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::PromotionsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PromotionsSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::PromotionsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PromotionsSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Promotion)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PromotionsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Promotion)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountCountriesSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::AdAccountCountriesGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeliveryMetricsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::DeliveryMetricsGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadFormQuestionsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MetricsReadyStateSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BookClosed)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum InterestTargetingOptionsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SingleInterestTargetingOption)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TargetingOptionsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::TargetingOption>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SchedulesSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::SchedulesCreate200ResponseInner>)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (Vec<models::Schedule>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SchedulesSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SchedulesList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SchedulesSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::SchedulesCreate200ResponseInner>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SearchPartnerPinsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::SearchPartnerPins200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SearchUserBoardsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BoardsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SearchUserPinsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::PinsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TargetingTemplateSlashCreateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::TargetingTemplate)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::TargetingTemplate)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TargetingTemplateSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::TargetingTemplateList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TargetingTemplateSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TermsRelatedSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::RelatedTerms)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TermsSuggestedSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<String>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TermsOfServiceSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::TermsOfService)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TrendsEditorialArticlesSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::TrendsEditorial>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TrendsFeaturedTopicsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::FeaturedTrend>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TrendsProductCategoriesDetailsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::ProductCategoryDetails>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TrendsProductCategoriesTrendingSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::TrendingProductCategory>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsUserFollowsSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::BoardsList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FollowersSlashListResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::FollowersList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LinkedBusinessAccountsSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (Vec<models::LinkedBusiness>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UnverifyWebsiteSlashDeleteResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::UserWebsite)
    ,
    /// Resource deleted successfully.
    ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserAccountSlashAnalyticsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (std::collections::HashMap<String, models::AnalyticsMetricsResponse>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserAccountSlashAnalyticsSlashTopPinsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::TopPinsAnalyticsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserAccountSlashAnalyticsSlashTopVideoPinsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::TopVideoPinsAnalyticsResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserAccountSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::Account)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserFollowingSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::FollowersList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserWebsitesSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::UserWebsitesGet200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum VerifyWebsiteSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::UserWebsite)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::UserWebsite)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum WebsiteVerificationSlashGetResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::UserWebsiteVerification)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FollowUserSlashUpdateResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::FollowUser)
    ,
    /// Resource create operation completed successfully.
    ResourceCreateOperationCompletedSuccessfully
    (models::FollowUser)
    ,
    /// The request could not be understood by the server due to unexpected data.
    TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserAccountSlashFollowedInterestsResponse {
    /// The request has succeeded.
    TheRequestHasSucceeded
    (models::UserAccountFollowedInterests200Response)
    ,
    /// The server could not understand the request due to invalid syntax.
    TheServerCouldNotUnderstandTheRequestDueToInvalidSyntax
    (models::PinterestLibError)
    ,
    /// Access is unauthorized.
    AccessIsUnauthorized
    (models::PinterestLibError)
    ,
    /// The server cannot find the requested resource.
    TheServerCannotFindTheRequestedResource
    (models::PinterestLibError)
    ,
    /// Unexpected error
    UnexpectedError
    (models::PinterestLibError)
}

/// API
#[cfg_attr(feature = "mock", automock)]
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait Api<C: Send + Sync> {
    /// Create ad account
    async fn ad_accounts_slash_create(
        &self,
        ad_account_create: models::AdAccountCreate,
        context: &C) -> Result<AdAccountsSlashCreateResponse, ApiError>;

    /// List ad accounts
    async fn ad_accounts_slash_list(
        &self,
        include_shared_accounts: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<AdAccountsSlashListResponse, ApiError>;

    /// Get ad account analytics
    async fn ad_account_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<AdAccountSlashAnalyticsResponse, ApiError>;

    /// Get targeting analytics for an ad account
    async fn ad_account_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsAccountTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<AdAccountTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Get ad account
    async fn ad_accounts_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<AdAccountsSlashGetResponse, ApiError>;

    /// Create a request for a brand, category, SKU report
    async fn analytics_slash_create_conversion_product_report(
        &self,
        ad_account_id: String,
        conversion_product_report_create: models::ConversionProductReportCreate,
        context: &C) -> Result<AnalyticsSlashCreateConversionProductReportResponse, ApiError>;

    /// Create a request for a Marketing Mix Modeling (MMM) report
    async fn analytics_slash_create_mmm_report(
        &self,
        ad_account_id: String,
        mmm_report_create: models::MmmReportCreate,
        context: &C) -> Result<AnalyticsSlashCreateMmmReportResponse, ApiError>;

    /// Create async request for an account analytics report
    async fn analytics_slash_create_report(
        &self,
        ad_account_id: String,
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        context: &C) -> Result<AnalyticsSlashCreateReportResponse, ApiError>;

    /// Get advertiser brand, category, SKU report
    async fn analytics_slash_get_conversion_product_report(
        &self,
        ad_account_id: String,
        token: String,
        context: &C) -> Result<AnalyticsSlashGetConversionProductReportResponse, ApiError>;

    /// Get advertiser Marketing Mix Modeling (MMM) report.
    async fn analytics_slash_get_mmm_report(
        &self,
        ad_account_id: String,
        token: String,
        context: &C) -> Result<AnalyticsSlashGetMmmReportResponse, ApiError>;

    /// Get the account analytics report created by the async call
    async fn analytics_slash_get_report(
        &self,
        ad_account_id: String,
        token: String,
        context: &C) -> Result<AnalyticsSlashGetReportResponse, ApiError>;

    /// Delete ads data for ad account in API Sandbox
    async fn sandbox_slash_delete(
        &self,
        ad_account_id: String,
        context: &C) -> Result<SandboxSlashDeleteResponse, ApiError>;

    /// List templates
    async fn templates_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<TemplatesSlashListResponse, ApiError>;

    /// Create async request for an analytics report using a template
    async fn analytics_slash_create_template_report(
        &self,
        ad_account_id: String,
        template_id: String,
        start_date: Option<chrono::naive::NaiveDate>,
        end_date: Option<chrono::naive::NaiveDate>,
        granularity: Option<models::Granularity>,
        context: &C) -> Result<AnalyticsSlashCreateTemplateReportResponse, ApiError>;

    /// Get bid floors
    async fn ad_groups_bid_floor_slash_get(
        &self,
        ad_account_id: String,
        bid_floor_create: models::BidFloorCreate,
        context: &C) -> Result<AdGroupsBidFloorSlashGetResponse, ApiError>;

    /// Get ad group analytics
    async fn ad_groups_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        aggregate_report_rows: Option<bool>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<AdGroupsSlashAnalyticsResponse, ApiError>;

    /// Get audience sizing
    async fn ad_groups_slash_audience_sizing(
        &self,
        ad_account_id: String,
        ad_group_audience_sizing_create: models::AdGroupAudienceSizingCreate,
        context: &C) -> Result<AdGroupsSlashAudienceSizingResponse, ApiError>;

    /// Create ad groups
    async fn ad_groups_slash_create(
        &self,
        ad_account_id: String,
        ad_group_create_create: models::AdGroupBatchCreateRequest,
        context: &C) -> Result<AdGroupsSlashCreateResponse, ApiError>;

    /// List ad groups
    async fn ad_groups_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        ad_group_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        translate_interests_to_names: Option<bool>,
        context: &C) -> Result<AdGroupsSlashListResponse, ApiError>;

    /// Update ad groups
    async fn ad_groups_slash_update(
        &self,
        ad_account_id: String,
        ad_group_update_batch_update: models::AdGroupBatchUpdateRequest,
        context: &C) -> Result<AdGroupsSlashUpdateResponse, ApiError>;

    /// Get targeting analytics for ad groups
    async fn ad_groups_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsAdGroupTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        sort_columns: Option<&'a Vec<String>>,
        sort_ascending: Option<bool>,
        context: &C) -> Result<AdGroupsTargetingAnalyticsSlashGetResponse, ApiError>;

    /// List of ad groups using promotions IDs.
    async fn get_ad_groups_by_promotion_ids_slash_list<'a>(
        &self,
        ad_account_id: String,
        promotion_ids: &'a Vec<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<GetAdGroupsByPromotionIdsSlashListResponse, ApiError>;

    /// Get dynamic titles CSV download URL
    async fn ad_groups_dynamic_titles_slash_download_csv(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        context: &C) -> Result<AdGroupsDynamicTitlesSlashDownloadCsvResponse, ApiError>;

    /// Get dynamic titles status
    async fn ad_groups_dynamic_titles_slash_get_status(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        context: &C) -> Result<AdGroupsDynamicTitlesSlashGetStatusResponse, ApiError>;

    /// Get dynamic titles upload URL
    async fn ad_groups_dynamic_titles_slash_get_upload_url(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        context: &C) -> Result<AdGroupsDynamicTitlesSlashGetUploadUrlResponse, ApiError>;

    /// Process dynamic titles CSV
    async fn ad_groups_dynamic_titles_slash_process_csv(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        dynamic_titles_process_csv_create: models::DynamicTitlesProcessCsvCreate,
        context: &C) -> Result<AdGroupsDynamicTitlesSlashProcessCsvResponse, ApiError>;

    /// Get ad group
    async fn ad_groups_slash_get(
        &self,
        ad_group_id: String,
        ad_account_id: String,
        context: &C) -> Result<AdGroupsSlashGetResponse, ApiError>;

    /// Create ad preview with pin or image
    async fn ad_previews_slash_create(
        &self,
        ad_account_id: String,
        ad_preview_request: models::AdPreviewRequest,
        context: &C) -> Result<AdPreviewsSlashCreateResponse, ApiError>;

    /// Get targeting analytics for ads
    async fn ad_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        ad_ids: &'a Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsAdTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::ConversionAttributionWindowDays>,
        engagement_window_days: Option<models::ConversionAttributionWindowDays>,
        view_window_days: Option<models::ConversionAttributionWindowDays>,
        conversion_report_time: Option<models::ConversionReportTimeType>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        sort_columns: Option<&'a Vec<String>>,
        sort_ascending: Option<bool>,
        context: &C) -> Result<AdTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Get ad analytics
    async fn ads_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        pin_ids: Option<&'a Vec<String>>,
        ad_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<AdsSlashAnalyticsResponse, ApiError>;

    /// Create ads
    async fn ads_slash_create(
        &self,
        ad_account_id: String,
        ad_create: models::AdBatchCreateRequest,
        context: &C) -> Result<AdsSlashCreateResponse, ApiError>;

    /// List ads
    async fn ads_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        ad_group_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        ad_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        context: &C) -> Result<AdsSlashListResponse, ApiError>;

    /// Update ads
    async fn ads_slash_update(
        &self,
        ad_account_id: String,
        ad_batch_update: models::AdBatchUpdateRequest,
        context: &C) -> Result<AdsSlashUpdateResponse, ApiError>;

    /// Create ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_create<'a>(
        &self,
        ad_account_id: String,
        campaign_ad_preview_create: &'a Vec<models::CampaignAdPreviewCreate>,
        context: &C) -> Result<CampaignAdPreviewSlashCreateResponse, ApiError>;

    /// Delete ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_delete<'a>(
        &self,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        ad_account_id: String,
        context: &C) -> Result<CampaignAdPreviewSlashDeleteResponse, ApiError>;

    /// Fetch ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_read<'a>(
        &self,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        ad_account_id: String,
        context: &C) -> Result<CampaignAdPreviewSlashReadResponse, ApiError>;

    /// Get ad
    async fn ads_slash_get(
        &self,
        ad_id: String,
        ad_account_id: String,
        context: &C) -> Result<AdsSlashGetResponse, ApiError>;

    /// Get item bid options (POST)
    async fn advanced_auction_items_get_slash_post(
        &self,
        advanced_auction_items_get_request: models::AdvancedAuctionItemsGetRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<AdvancedAuctionItemsGetSlashPostResponse, ApiError>;

    /// Operate on item level bid options
    async fn advanced_auction_items_submit_slash_post(
        &self,
        advanced_auction_items_submit_request: models::AdvancedAuctionItemsSubmitRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<AdvancedAuctionItemsSubmitSlashPostResponse, ApiError>;

    /// Get audience insights scope and type
    async fn audience_insights_scope_and_type_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<AudienceInsightsScopeAndTypeSlashGetResponse, ApiError>;

    /// Get audience insights
    async fn audience_insights_slash_get(
        &self,
        ad_account_id: String,
        audience_insight_type: models::AudienceInsightType,
        context: &C) -> Result<AudienceInsightsSlashGetResponse, ApiError>;

    /// List accounts with access to an audience owned by an ad account
    async fn ad_accounts_audiences_shared_accounts_slash_list(
        &self,
        audience_id: String,
        account_type: models::AudienceAccountType,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<AdAccountsAudiencesSharedAccountsSlashListResponse, ApiError>;

    /// List accounts with access to an audience owned by a business
    async fn business_account_audiences_shared_accounts_slash_list(
        &self,
        business_id: String,
        audience_id: String,
        account_type: models::AudienceAccountType,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BusinessAccountAudiencesSharedAccountsSlashListResponse, ApiError>;

    /// List received audiences for a business
    async fn shared_audiences_for_business_slash_list(
        &self,
        business_id: String,
        order: Option<models::Order>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<SharedAudiencesForBusinessSlashListResponse, ApiError>;

    /// Update audience sharing between ad accounts
    async fn update_ad_account_to_ad_account_shared_audience(
        &self,
        ad_account_id: String,
        ad_account_to_ad_account_shared_audience_update_with_required_body: models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody,
        context: &C) -> Result<UpdateAdAccountToAdAccountSharedAudienceResponse, ApiError>;

    /// Update audience sharing from an ad account to businesses
    async fn update_ad_account_to_business_shared_audience(
        &self,
        ad_account_id: String,
        ad_account_to_business_shared_audience_update_with_required_body: models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody,
        context: &C) -> Result<UpdateAdAccountToBusinessSharedAudienceResponse, ApiError>;

    /// Update audience sharing from a business to ad accounts
    async fn update_business_to_ad_account_shared_audience(
        &self,
        business_id: String,
        business_to_ad_account_shared_audience_update_with_required_body: models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody,
        context: &C) -> Result<UpdateBusinessToAdAccountSharedAudienceResponse, ApiError>;

    /// Update audience sharing between businesses
    async fn update_business_to_business_shared_audience(
        &self,
        business_id: String,
        business_to_business_shared_audience_update_with_required_body: models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody,
        context: &C) -> Result<UpdateBusinessToBusinessSharedAudienceResponse, ApiError>;

    /// Create audience
    async fn audiences_slash_create(
        &self,
        ad_account_id: String,
        ad_accounts_audience_create: models::AdAccountsAudienceCreate,
        context: &C) -> Result<AudiencesSlashCreateResponse, ApiError>;

    /// List audiences
    async fn audiences_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ownership_type: Option<models::AudienceOwnershipType>,
        exclude_nca: Option<bool>,
        context: &C) -> Result<AudiencesSlashListResponse, ApiError>;

    /// Get audience
    async fn audiences_slash_get(
        &self,
        audience_id: String,
        ad_account_id: String,
        context: &C) -> Result<AudiencesSlashGetResponse, ApiError>;

    /// Update audience
    async fn audiences_slash_update(
        &self,
        audience_id: String,
        ad_account_id: String,
        ad_accounts_audience_update: models::AdAccountsAudienceUpdate,
        context: &C) -> Result<AudiencesSlashUpdateResponse, ApiError>;

    /// Redeem ad credits
    async fn ads_credit_slash_redeem(
        &self,
        ad_account_id: String,
        ads_credit_redeem_create: models::AdsCreditRedeemCreate,
        context: &C) -> Result<AdsCreditSlashRedeemResponse, ApiError>;

    /// Get ads credit discounts
    async fn ads_credits_discounts_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<AdsCreditsDiscountsSlashGetResponse, ApiError>;

    /// Get billing invoices
    async fn billing_invoices_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        sort: Option<models::BillingInvoiceSortField>,
        status: Option<models::BillingInvoiceStatus>,
        document_type: Option<models::BillingInvoiceDocumentType>,
        start_due_date: Option<chrono::naive::NaiveDate>,
        end_due_date: Option<chrono::naive::NaiveDate>,
        context: &C) -> Result<BillingInvoicesSlashGetResponse, ApiError>;

    /// Get billing profiles
    async fn billing_profiles_slash_get(
        &self,
        is_active: bool,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BillingProfilesSlashGetResponse, ApiError>;

    /// Get Salesforce account details including bill-to information.
    async fn ssio_accounts_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<SsioAccountsSlashGetResponse, ApiError>;

    /// Create insertion order through SSIO.
    async fn ssio_insertion_order_slash_create(
        &self,
        ad_account_id: String,
        ssio_insertion_order_create: models::SsioInsertionOrderCreate,
        context: &C) -> Result<SsioInsertionOrderSlashCreateResponse, ApiError>;

    /// Edit insertion order through SSIO.
    async fn ssio_insertion_order_slash_edit(
        &self,
        ad_account_id: String,
        ssio_insertion_order_update: models::SsioInsertionOrderUpdate,
        context: &C) -> Result<SsioInsertionOrderSlashEditResponse, ApiError>;

    /// Get insertion order status by ad account id.
    async fn ssio_insertion_orders_status_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<SsioInsertionOrdersStatusSlashGetByAdAccountResponse, ApiError>;

    /// Get Salesforce order lines by ad account id.
    async fn ssio_order_lines_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        pin_order_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<SsioOrderLinesSlashGetByAdAccountResponse, ApiError>;

    /// Get download url for a billing invoice
    async fn billing_invoice_download_slash_get(
        &self,
        ad_account_id: String,
        billing_invoice_id: String,
        context: &C) -> Result<BillingInvoiceDownloadSlashGetResponse, ApiError>;

    /// Get insertion order status by pin order id.
    async fn ssio_insertion_orders_status_slash_get_by_pin_order_id(
        &self,
        ad_account_id: String,
        pin_order_id: String,
        context: &C) -> Result<SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse, ApiError>;

    /// Create board
    async fn boards_slash_create(
        &self,
        board_create: models::BoardCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashCreateResponse, ApiError>;

    /// List boards
    async fn boards_slash_list(
        &self,
        ad_account_id: Option<String>,
        privacy: Option<models::BoardPrivacyFilter>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BoardsSlashListResponse, ApiError>;

    /// Create board section
    async fn board_sections_slash_create(
        &self,
        board_id: String,
        board_section_create: models::BoardSectionCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashCreateResponse, ApiError>;

    /// List board sections
    async fn board_sections_slash_list(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BoardSectionsSlashListResponse, ApiError>;

    /// Delete board
    async fn boards_slash_delete(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashDeleteResponse, ApiError>;

    /// Get board
    async fn boards_slash_get(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashGetResponse, ApiError>;

    /// List Pins on board
    async fn boards_slash_list_pins<'a>(
        &self,
        board_id: String,
        creative_types: Option<&'a Vec<models::CreativeType>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BoardsSlashListPinsResponse, ApiError>;

    /// Update board
    async fn boards_slash_update(
        &self,
        board_id: String,
        board_with_update_privacy_update: models::BoardWithUpdatePrivacyUpdate,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashUpdateResponse, ApiError>;

    /// Delete board section
    async fn board_sections_slash_delete(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashDeleteResponse, ApiError>;

    /// List Pins on board section
    async fn board_sections_slash_list_pins(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BoardSectionsSlashListPinsResponse, ApiError>;

    /// Update board section
    async fn board_sections_slash_update(
        &self,
        board_id: String,
        section_id: String,
        board_section_update_with_required_body: models::BoardSectionUpdateWithRequiredBody,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashUpdateResponse, ApiError>;

    /// Get advertiser entities in bulk
    async fn bulk_download_slash_create(
        &self,
        ad_account_id: String,
        bulk_download_create: models::BulkDownloadCreate,
        context: &C) -> Result<BulkDownloadSlashCreateResponse, ApiError>;

    /// Create/update ad entities in bulk
    async fn bulk_upsert_slash_create(
        &self,
        ad_account_id: String,
        bulk_upsert_request: models::BulkUpsertRequest,
        context: &C) -> Result<BulkUpsertSlashCreateResponse, ApiError>;

    /// Download advertiser entities in bulk
    async fn bulk_request_slash_get(
        &self,
        ad_account_id: String,
        bulk_request_id: String,
        include_details: Option<bool>,
        context: &C) -> Result<BulkRequestSlashGetResponse, ApiError>;

    /// Create a new asset group.
    async fn asset_group_slash_create(
        &self,
        business_id: String,
        asset_group_input_create: models::AssetGroupInputCreate,
        context: &C) -> Result<AssetGroupSlashCreateResponse, ApiError>;

    /// Delete asset groups.
    async fn asset_group_slash_delete(
        &self,
        business_id: String,
        asset_group_deletion_delete: models::AssetGroupDeletionDelete,
        context: &C) -> Result<AssetGroupSlashDeleteResponse, ApiError>;

    /// Update asset groups.
    async fn asset_group_slash_update(
        &self,
        business_id: String,
        asset_group_modification_read_or_update: models::AssetGroupModificationReadOrUpdate,
        context: &C) -> Result<AssetGroupSlashUpdateResponse, ApiError>;

    /// List business assets
    async fn business_assets_slash_get<'a>(
        &self,
        business_id: String,
        permissions: Option<&'a Vec<models::PermissionsWithOwner>>,
        child_asset_id: Option<String>,
        asset_group_id: Option<String>,
        asset_type: Option<models::BusinessAssetsGetAssetTypeParameter>,
        start_index: Option<u32>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BusinessAssetsSlashGetResponse, ApiError>;

    /// Delete member access to asset
    async fn business_members_asset_access_slash_delete(
        &self,
        business_id: String,
        business_members_asset_access_delete_body: models::BusinessMembersAssetAccessDeleteBody,
        context: &C) -> Result<BusinessMembersAssetAccessSlashDeleteResponse, ApiError>;

    /// Assign/Update member asset permissions
    async fn business_members_asset_access_slash_update(
        &self,
        business_id: String,
        update_member_asset_access_body: models::UpdateMemberAssetAccessBody,
        context: &C) -> Result<BusinessMembersAssetAccessSlashUpdateResponse, ApiError>;

    /// Delete partner access to asset
    async fn delete_partner_asset_access_handler_impl(
        &self,
        business_id: String,
        delete_partner_asset_access_body: models::DeletePartnerAssetAccessBody,
        context: &C) -> Result<DeletePartnerAssetAccessHandlerImplResponse, ApiError>;

    /// Assign/Update partner asset permissions
    async fn update_partner_asset_access_handler_impl(
        &self,
        business_id: String,
        update_partner_asset_access_body: models::UpdatePartnerAssetAccessBody,
        context: &C) -> Result<UpdatePartnerAssetAccessHandlerImplResponse, ApiError>;

    /// Get members with access to asset
    async fn business_asset_members_slash_get(
        &self,
        business_id: String,
        asset_id: String,
        start_index: Option<u32>,
        fetch_system_users: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BusinessAssetMembersSlashGetResponse, ApiError>;

    /// Get partners with access to asset
    async fn business_asset_partners_slash_get(
        &self,
        business_id: String,
        asset_id: String,
        start_index: Option<u32>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BusinessAssetPartnersSlashGetResponse, ApiError>;

    /// Get assets assigned to a member
    async fn business_member_assets_slash_get<'a>(
        &self,
        business_id: String,
        member_id: String,
        asset_type: Option<models::BusinessMemberAssetsGetAssetTypeParameter>,
        start_index: Option<u32>,
        sort_by: Option<models::AssetSortBy>,
        sort_ascending: Option<bool>,
        search_by: Option<models::AssetSearchBy>,
        search_value: Option<String>,
        asset_permission_type: Option<models::AssetPermissionType>,
        ad_account_statuses: Option<&'a Vec<models::NonDraftEntityStatus>>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BusinessMemberAssetsSlashGetResponse, ApiError>;

    /// Get assets assigned to a partner or assets assigned by a partner
    async fn business_partner_asset_access_slash_get(
        &self,
        business_id: String,
        partner_id: String,
        partner_type: Option<models::BusinessPartnerAssetAccessGetPartnerTypeParameter>,
        asset_type: Option<models::BusinessPartnerAssetAccessGetAssetTypeParameter>,
        start_index: Option<u32>,
        sort_by: Option<models::AssetSortBy>,
        sort_ascending: Option<bool>,
        search_by: Option<models::AssetSearchBy>,
        search_value: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BusinessPartnerAssetAccessSlashGetResponse, ApiError>;

    /// Accept or decline an invite/request
    async fn respond_business_access_invites(
        &self,
        auth_respond_invites_body: models::AuthRespondInvitesBody,
        context: &C) -> Result<RespondBusinessAccessInvitesResponse, ApiError>;

    /// Create a request to access an existing partner's assets.
    async fn asset_access_requests_slash_create(
        &self,
        business_id: String,
        create_asset_access_request_body: models::CreateAssetAccessRequestBody,
        context: &C) -> Result<AssetAccessRequestsSlashCreateResponse, ApiError>;

    /// Cancel invites/requests
    async fn cancel_invites_or_requests(
        &self,
        business_id: String,
        cancel_invites_request: models::CancelInvitesRequest,
        context: &C) -> Result<CancelInvitesOrRequestsResponse, ApiError>;

    /// Update invite/request with an asset permission
    async fn create_asset_invites(
        &self,
        business_id: String,
        create_asset_invites_request: models::CreateAssetInvitesRequest,
        context: &C) -> Result<CreateAssetInvitesResponse, ApiError>;

    /// Create invites or requests
    async fn create_membership_or_partnership_invites(
        &self,
        business_id: String,
        create_membership_or_partnership_invites_body: models::CreateMembershipOrPartnershipInvitesBody,
        context: &C) -> Result<CreateMembershipOrPartnershipInvitesResponse, ApiError>;

    /// Get invites/requests
    async fn get_slash_invites<'a>(
        &self,
        business_id: String,
        is_member: Option<bool>,
        invite_status: Option<&'a Vec<models::InviteFilterStatus>>,
        invite_type: Option<models::InviteType>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<GetSlashInvitesResponse, ApiError>;

    /// List business employers for user
    async fn get_slash_business_employers(
        &self,
        assets_summary: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<GetSlashBusinessEmployersResponse, ApiError>;

    /// Create a Brand Account
    async fn brand_accounts_slash_create(
        &self,
        business_hierarchy_id: String,
        brand_account_create: models::BrandAccountCreate,
        context: &C) -> Result<BrandAccountsSlashCreateResponse, ApiError>;

    /// Terminate business memberships
    async fn delete_business_membership(
        &self,
        business_id: String,
        delete_business_membership_body: models::DeleteBusinessMembershipBody,
        context: &C) -> Result<DeleteBusinessMembershipResponse, ApiError>;

    /// Terminate business partnerships
    async fn delete_business_partners(
        &self,
        business_id: String,
        delete_business_partners_delete: models::DeleteBusinessPartnersDelete,
        context: &C) -> Result<DeleteBusinessPartnersResponse, ApiError>;

    /// Get business members
    async fn get_slash_business_members<'a>(
        &self,
        business_id: String,
        fetch_system_users: Option<bool>,
        assets_summary: Option<bool>,
        business_roles: Option<&'a Vec<models::MemberBusinessRole>>,
        member_ids: Option<String>,
        start_index: Option<u32>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<GetSlashBusinessMembersResponse, ApiError>;

    /// Get business partners
    async fn get_slash_business_partners(
        &self,
        business_id: String,
        assets_summary: Option<bool>,
        partner_type: Option<models::PartnerType>,
        partner_ids: Option<String>,
        start_index: Option<u32>,
        sort_ascending: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<GetSlashBusinessPartnersResponse, ApiError>;

    /// Update member's business role
    async fn update_slash_business_memberships(
        &self,
        business_id: String,
        business_membership_member: models::UpdateBusinessMembershipsBody,
        context: &C) -> Result<UpdateSlashBusinessMembershipsResponse, ApiError>;

    /// Update a Brand Account
    async fn brand_accounts_slash_update(
        &self,
        brand_account_id: String,
        business_hierarchy_id: String,
        brand_account_update: models::BrandAccountUpdate,
        context: &C) -> Result<BrandAccountsSlashUpdateResponse, ApiError>;

    /// Update a system user information.
    async fn system_user_slash_update(
        &self,
        business_id: String,
        system_user_id: String,
        system_user_update_with_required_body: models::SystemUserUpdateWithRequiredBody,
        context: &C) -> Result<SystemUserSlashUpdateResponse, ApiError>;

    /// Get pins analytics
    async fn ad_pins_slash_analytics<'a>(
        &self,
        campaign_id: String,
        pin_ids: &'a Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        context: &C) -> Result<AdPinsSlashAnalyticsResponse, ApiError>;

    /// Get targeting analytics for campaigns
    async fn campaign_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        campaign_ids: &'a Vec<models::CampaignIdRequiredType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsCampaignTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<CampaignTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Get campaign analytics
    async fn campaigns_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        campaign_ids: &'a Vec<models::CampaignIdRequiredType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        aggregate_report_rows: Option<bool>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<CampaignsSlashAnalyticsResponse, ApiError>;

    /// Create campaigns
    async fn campaigns_slash_create(
        &self,
        ad_account_id: String,
        campaign_create_item: models::CampaignBatchCreateRequest,
        context: &C) -> Result<CampaignsSlashCreateResponse, ApiError>;

    /// List campaigns
    async fn campaigns_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        context: &C) -> Result<CampaignsSlashListResponse, ApiError>;

    /// Update campaigns
    async fn campaigns_slash_update(
        &self,
        ad_account_id: String,
        campaign_batch_update_item: models::CampaignBatchUpdateRequest,
        context: &C) -> Result<CampaignsSlashUpdateResponse, ApiError>;

    /// Get campaign delivery estimates
    async fn get_campaign_delivery_estimates(
        &self,
        ad_account_id: String,
        campaign_delivery_estimates_campaign: models::CampaignDeliveryEstimatesCampaignRequest,
        context: &C) -> Result<GetCampaignDeliveryEstimatesResponse, ApiError>;

    /// Get campaign
    async fn campaigns_slash_get(
        &self,
        campaign_id: String,
        ad_account_id: String,
        context: &C) -> Result<CampaignsSlashGetResponse, ApiError>;

    /// Create feed
    async fn feeds_slash_create(
        &self,
        catalogs_feed_create_request_schema: models::CatalogsFeedCreateRequestSchema,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashCreateResponse, ApiError>;

    /// List feeds
    async fn feeds_slash_list(
        &self,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<FeedsSlashListResponse, ApiError>;

    /// List feed processing results
    async fn feed_processing_results_slash_list(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<FeedProcessingResultsSlashListResponse, ApiError>;

    /// Delete feed
    async fn feeds_slash_delete(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashDeleteResponse, ApiError>;

    /// Get feed
    async fn feeds_slash_get(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashGetResponse, ApiError>;

    /// Ingest feed items
    async fn feeds_slash_ingest(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashIngestResponse, ApiError>;

    /// Update feed
    async fn feeds_slash_update(
        &self,
        feed_id: String,
        catalogs_feed_update_request_schema: models::CatalogsFeedUpdateRequestSchema,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashUpdateResponse, ApiError>;

    /// List item issues
    async fn items_issues_slash_list<'a>(
        &self,
        processing_result_id: String,
        item_numbers: Option<&'a Vec<i32>>,
        item_validation_issue: Option<models::CatalogsItemValidationIssue>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<ItemsIssuesSlashListResponse, ApiError>;

    /// Operate on item batch
    async fn items_batch_slash_post(
        &self,
        catalogs_items_batch_post_request: models::CatalogsItemsBatchPostRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsBatchSlashPostResponse, ApiError>;

    /// Get catalogs items (POST)
    async fn items_slash_post(
        &self,
        catalogs_items_request: models::CatalogsItemsRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsSlashPostResponse, ApiError>;

    /// Get item batch status
    async fn items_batch_slash_get(
        &self,
        batch_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsBatchSlashGetResponse, ApiError>;

    /// Create product group
    async fn catalogs_product_groups_slash_create(
        &self,
        catalogs_product_groups_create_request_schema: models::CatalogsProductGroupsCreateRequestSchema,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashCreateResponse, ApiError>;

    /// Create product groups
    async fn catalogs_product_groups_slash_create_many(
        &self,
        catalogs_product_groups_create_many_request_items: models::CatalogsProductGroupsCreateManyRequestSchema,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashCreateManyResponse, ApiError>;

    /// Delete product groups
    async fn catalogs_product_groups_slash_delete_many<'a>(
        &self,
        id: &'a Vec<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashDeleteManyResponse, ApiError>;

    /// List product groups
    async fn catalogs_product_groups_slash_list<'a>(
        &self,
        id: Option<&'a Vec<i32>>,
        feed_id: Option<String>,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<CatalogsProductGroupsSlashListResponse, ApiError>;

    /// List products by filter
    async fn products_by_product_group_filter_slash_list(
        &self,
        catalogs_list_products_by_filter_request: models::CatalogsListProductsByFilterRequest,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        context: &C) -> Result<ProductsByProductGroupFilterSlashListResponse, ApiError>;

    /// List products by product group
    async fn catalogs_product_group_pins_slash_list(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<CatalogsProductGroupPinsSlashListResponse, ApiError>;

    /// Delete product group
    async fn catalogs_product_groups_slash_delete(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashDeleteResponse, ApiError>;

    /// Get product group
    async fn catalogs_product_groups_slash_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashGetResponse, ApiError>;

    /// Get product counts
    async fn catalogs_product_groups_slash_product_counts_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, ApiError>;

    /// Update single product group
    async fn catalogs_product_groups_slash_update(
        &self,
        product_group_id: String,
        catalogs_product_groups_update_request_schema: models::CatalogsProductGroupsUpdateRequestSchema,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashUpdateResponse, ApiError>;

    /// Build catalogs report
    async fn reports_slash_create(
        &self,
        catalogs_report_parameters: models::CatalogsReportParameters,
        ad_account_id: Option<String>,
        context: &C) -> Result<ReportsSlashCreateResponse, ApiError>;

    /// Get catalogs report
    async fn reports_slash_get(
        &self,
        token: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<ReportsSlashGetResponse, ApiError>;

    /// List report stats
    async fn reports_slash_stats(
        &self,
        parameters: models::CatalogsReportStatsParameters,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<ReportsSlashStatsResponse, ApiError>;

    /// Operate on local inventory item batch
    async fn catalogs_local_inventory_items_batch_slash_operate(
        &self,
        catalog_id: String,
        local_inventory_items_batch_create: models::LocalInventoryItemsBatchCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsLocalInventoryItemsBatchSlashOperateResponse, ApiError>;

    /// Get local inventory items (POST)
    async fn catalogs_local_inventory_items_slash_post(
        &self,
        catalog_id: String,
        local_inventory_items_get_create: models::LocalInventoryItemsGetCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsLocalInventoryItemsSlashPostResponse, ApiError>;

    /// Create local stores
    async fn catalogs_local_stores_slash_create<'a>(
        &self,
        catalog_id: String,
        local_store_create: &'a Vec<models::LocalStoreCreate>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsLocalStoresSlashCreateResponse, ApiError>;

    /// Delete local stores
    async fn catalogs_local_stores_slash_delete<'a>(
        &self,
        catalog_id: String,
        ids: &'a Vec<models::LocalStoreId>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsLocalStoresSlashDeleteResponse, ApiError>;

    /// List local stores
    async fn catalogs_local_stores_slash_list<'a>(
        &self,
        catalog_id: String,
        ids: Option<&'a Vec<models::LocalStoreId>>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<CatalogsLocalStoresSlashListResponse, ApiError>;

    /// Update local stores
    async fn catalogs_local_stores_slash_update<'a>(
        &self,
        catalog_id: String,
        local_store_batch_update: &'a Vec<models::LocalStoreBatchUpdate>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsLocalStoresSlashUpdateResponse, ApiError>;

    /// Get supplemental items batch status
    async fn catalogs_supplemental_items_batch_slash_get(
        &self,
        catalog_id: String,
        batch_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsSupplementalItemsBatchSlashGetResponse, ApiError>;

    /// List available filter values
    async fn catalogs_slash_available_filter_values(
        &self,
        catalog_id: String,
        feed_id: Option<String>,
        country: Option<models::Country>,
        language: Option<models::CatalogsLocale>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsSlashAvailableFilterValuesResponse, ApiError>;

    /// Create catalog
    async fn catalogs_slash_create(
        &self,
        catalog_create: models::CatalogCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsSlashCreateResponse, ApiError>;

    /// List catalogs
    async fn catalogs_slash_list(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<CatalogsSlashListResponse, ApiError>;

    /// Create a conversion deletion request
    async fn conversion_deletion_request_slash_create(
        &self,
        ad_account_id: String,
        conversion_deletion_request_create: models::ConversionDeletionRequestCreate,
        context: &C) -> Result<ConversionDeletionRequestSlashCreateResponse, ApiError>;

    /// List conversion deletion requests
    async fn conversion_deletion_request_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<ConversionDeletionRequestSlashListResponse, ApiError>;

    /// Delete a conversion deletion request
    async fn conversion_deletion_request_slash_delete(
        &self,
        request_id: String,
        ad_account_id: String,
        context: &C) -> Result<ConversionDeletionRequestSlashDeleteResponse, ApiError>;

    /// Get a single conversion deletion request
    async fn conversion_deletion_request_slash_get(
        &self,
        request_id: String,
        ad_account_id: String,
        context: &C) -> Result<ConversionDeletionRequestSlashGetResponse, ApiError>;

    /// Get event quality score (EQS)
    async fn conversion_eqs_slash_list(
        &self,
        lookback_period: models::LookbackPeriodOptions,
        ad_account_id: String,
        source_platform: Option<models::SourcePlatformOptions>,
        ingestion_source: Option<models::IngestionSourceOptions>,
        context: &C) -> Result<ConversionEqsSlashListResponse, ApiError>;

    /// Send conversions
    async fn events_slash_create(
        &self,
        ad_account_id: String,
        conversion_events_create: models::ConversionEventsCreate,
        test: Option<bool>,
        context: &C) -> Result<EventsSlashCreateResponse, ApiError>;

    /// Create conversion tag
    async fn conversion_tags_slash_create(
        &self,
        ad_account_id: String,
        conversion_tag_create: models::ConversionTagCreate,
        context: &C) -> Result<ConversionTagsSlashCreateResponse, ApiError>;

    /// List conversion tags
    async fn conversion_tags_slash_list(
        &self,
        ad_account_id: String,
        filter_deleted: Option<bool>,
        context: &C) -> Result<ConversionTagsSlashListResponse, ApiError>;

    /// Get Ocpm eligible conversion tags
    async fn ocpm_eligible_conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<OcpmEligibleConversionTagsSlashGetResponse, ApiError>;

    /// Get page visit conversion tags
    async fn page_visit_conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<PageVisitConversionTagsSlashGetResponse, ApiError>;

    /// Get conversion tag
    async fn conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        conversion_tag_id: String,
        context: &C) -> Result<ConversionTagsSlashGetResponse, ApiError>;

    /// Create advertiser defined events
    async fn advertiser_defined_events_slash_create(
        &self,
        ad_account_id: String,
        advertiser_defined_events_create_request: models::AdvertiserDefinedEventsCreateRequest,
        context: &C) -> Result<AdvertiserDefinedEventsSlashCreateResponse, ApiError>;

    /// Delete advertiser defined events
    async fn advertiser_defined_events_slash_delete<'a>(
        &self,
        ad_account_id: String,
        event_names: &'a Vec<String>,
        context: &C) -> Result<AdvertiserDefinedEventsSlashDeleteResponse, ApiError>;

    /// Get advertiser defined events
    async fn advertiser_defined_events_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<AdvertiserDefinedEventsSlashGetResponse, ApiError>;

    /// Update advertiser defined events
    async fn advertiser_defined_events_slash_update(
        &self,
        ad_account_id: String,
        advertiser_defined_events_create_request: models::AdvertiserDefinedEventsCreateRequest,
        context: &C) -> Result<AdvertiserDefinedEventsSlashUpdateResponse, ApiError>;

    /// Create customer list upload
    async fn customer_list_uploads_slash_create(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_create_request: models::CustomerListUploadCreateRequest,
        context: &C) -> Result<CustomerListUploadsSlashCreateResponse, ApiError>;

    /// Get customer list upload
    async fn customer_list_uploads_slash_get(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_id: String,
        context: &C) -> Result<CustomerListUploadsSlashGetResponse, ApiError>;

    /// Run customer list upload
    async fn customer_list_uploads_slash_run(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_id: String,
        context: &C) -> Result<CustomerListUploadsSlashRunResponse, ApiError>;

    /// Create customer lists
    async fn customer_lists_slash_create(
        &self,
        ad_account_id: String,
        customer_list_create: models::CustomerListCreate,
        context: &C) -> Result<CustomerListsSlashCreateResponse, ApiError>;

    /// Get customer lists
    async fn customer_lists_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        exclude_nca: Option<bool>,
        context: &C) -> Result<CustomerListsSlashListResponse, ApiError>;

    /// Get customer list
    async fn customer_lists_slash_get(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        context: &C) -> Result<CustomerListsSlashGetResponse, ApiError>;

    /// Update customer list
    async fn customer_lists_slash_update(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_update_with_required_body: models::CustomerListUpdateWithRequiredBody,
        context: &C) -> Result<CustomerListsSlashUpdateResponse, ApiError>;

    /// Create customer segments
    async fn customer_segment_slash_create(
        &self,
        ad_account_id: String,
        customer_segment_create: models::CustomerSegmentCreate,
        context: &C) -> Result<CustomerSegmentSlashCreateResponse, ApiError>;

    /// List customer segments
    async fn customer_segment_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        include_sizing: Option<bool>,
        search_query: Option<String>,
        context: &C) -> Result<CustomerSegmentSlashListResponse, ApiError>;

    /// Update customer segments
    async fn customer_segment_slash_update(
        &self,
        ad_account_id: String,
        customer_segment_update_request_update_with_required_body: models::CustomerSegmentUpdateRequestUpdateWithRequiredBody,
        context: &C) -> Result<CustomerSegmentSlashUpdateResponse, ApiError>;

    /// Create commerce integration
    async fn integrations_commerce_slash_post(
        &self,
        integration_metadata_create: models::IntegrationMetadataCreate,
        context: &C) -> Result<IntegrationsCommerceSlashPostResponse, ApiError>;

    /// Receives batched logs from integration applications.
    async fn integrations_logs_slash_post(
        &self,
        integration_logs_request_create: models::IntegrationLogsRequestCreate,
        context: &C) -> Result<IntegrationsLogsSlashPostResponse, ApiError>;

    /// Get integration metadata list
    async fn integrations_slash_get_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<IntegrationsSlashGetListResponse, ApiError>;

    /// Delete commerce integration
    async fn integrations_commerce_slash_del(
        &self,
        external_business_id: String,
        context: &C) -> Result<IntegrationsCommerceSlashDelResponse, ApiError>;

    /// Get commerce integration
    async fn integrations_commerce_slash_get(
        &self,
        external_business_id: String,
        context: &C) -> Result<IntegrationsCommerceSlashGetResponse, ApiError>;

    /// Update commerce integration
    async fn integrations_commerce_slash_patch(
        &self,
        external_business_id: String,
        integration_metadata_update: models::IntegrationMetadataUpdate,
        context: &C) -> Result<IntegrationsCommerceSlashPatchResponse, ApiError>;

    /// Get integration metadata
    async fn integrations_slash_get_by_id(
        &self,
        id: String,
        context: &C) -> Result<IntegrationsSlashGetByIdResponse, ApiError>;

    /// Get country's keyword metrics
    async fn country_keywords_metrics_slash_get<'a>(
        &self,
        ad_account_id: String,
        country_code: String,
        keywords: &'a Vec<String>,
        context: &C) -> Result<CountryKeywordsMetricsSlashGetResponse, ApiError>;

    /// Create keywords
    async fn keywords_slash_create(
        &self,
        ad_account_id: String,
        keywords_create: models::KeywordsCreate,
        context: &C) -> Result<KeywordsSlashCreateResponse, ApiError>;

    /// Get keywords
    async fn keywords_slash_get<'a>(
        &self,
        ad_account_id: String,
        campaign_id: Option<String>,
        ad_group_id: Option<String>,
        ad_group_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        match_types: Option<&'a Vec<models::MatchType>>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<KeywordsSlashGetResponse, ApiError>;

    /// Update keywords
    async fn keywords_slash_update(
        &self,
        ad_account_id: String,
        keywords_update: models::KeywordsUpdate,
        context: &C) -> Result<KeywordsSlashUpdateResponse, ApiError>;

    /// List trending keywords
    async fn trending_keywords_slash_list<'a>(
        &self,
        region: models::TrendsSupportedRegion,
        trend_type: models::TrendType,
        interests: Option<&'a Vec<models::TrendsL1Interest>>,
        genders: Option<&'a Vec<models::TrendsGenderFilter>>,
        ages: Option<&'a Vec<models::TrendsAgeBucket>>,
        include_keywords: Option<&'a Vec<models::KeywordListItems>>,
        normalize_against_group: Option<bool>,
        limit: Option<u8>,
        include_demographics: Option<bool>,
        context: &C) -> Result<TrendingKeywordsSlashListResponse, ApiError>;

    /// Create labels
    async fn labels_slash_create(
        &self,
        ad_account_id: String,
        label_create_request: models::LabelCreateRequest,
        context: &C) -> Result<LabelsSlashCreateResponse, ApiError>;

    /// List labels
    async fn labels_slash_list<'a>(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        label_ids: Option<&'a Vec<models::QueryLabelIdsItems>>,
        entity_statuses: Option<&'a Vec<models::QueryLabelEntityStatusesItems>>,
        label_types: Option<&'a Vec<models::QueryLabelTypesItems>>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<LabelsSlashListResponse, ApiError>;

    /// Update labels
    async fn labels_slash_update(
        &self,
        ad_account_id: String,
        label_update_request: models::LabelUpdateRequest,
        context: &C) -> Result<LabelsSlashUpdateResponse, ApiError>;

    /// Apply label to entity
    async fn labels_slash_apply(
        &self,
        ad_account_id: String,
        label_id: String,
        labeled_entities_create: models::LabeledEntitiesCreate,
        context: &C) -> Result<LabelsSlashApplyResponse, ApiError>;

    /// Remove label from entities
    async fn labels_slash_remove(
        &self,
        ad_account_id: String,
        label_id: String,
        labeled_entities_create: models::LabeledEntitiesCreate,
        context: &C) -> Result<LabelsSlashRemoveResponse, ApiError>;

    /// Get lead ads subscriptions
    async fn ad_accounts_subscriptions_slash_get_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<AdAccountsSubscriptionsSlashGetListResponse, ApiError>;

    /// Create lead ads subscription
    async fn ad_accounts_subscriptions_slash_post(
        &self,
        ad_account_id: String,
        lead_subscription_post_params_create: models::LeadSubscriptionPostParamsCreate,
        context: &C) -> Result<AdAccountsSubscriptionsSlashPostResponse, ApiError>;

    /// Delete lead ads subscription
    async fn ad_accounts_subscriptions_slash_del_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        context: &C) -> Result<AdAccountsSubscriptionsSlashDelByIdResponse, ApiError>;

    /// Get lead ads subscription by ID
    async fn ad_accounts_subscriptions_slash_get_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        context: &C) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, ApiError>;

    /// Create lead forms
    async fn lead_forms_slash_create(
        &self,
        ad_account_id: String,
        lead_form_create: models::LeadFormsCreateBody,
        context: &C) -> Result<LeadFormsSlashCreateResponse, ApiError>;

    /// List lead forms
    async fn lead_forms_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<LeadFormsSlashListResponse, ApiError>;

    /// Update lead forms
    async fn lead_forms_slash_update(
        &self,
        ad_account_id: String,
        lead_form_batch_update: models::LeadFormsUpdateBody,
        context: &C) -> Result<LeadFormsSlashUpdateResponse, ApiError>;

    /// Get lead form by id
    async fn lead_form_slash_get(
        &self,
        lead_form_id: String,
        ad_account_id: String,
        context: &C) -> Result<LeadFormSlashGetResponse, ApiError>;

    /// Create lead form test data
    async fn lead_form_test_slash_create(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        lead_form_test_create: models::LeadFormTestCreate,
        context: &C) -> Result<LeadFormTestSlashCreateResponse, ApiError>;

    /// Create a request to export leads collected from a lead ad
    async fn leads_export_slash_create(
        &self,
        ad_account_id: String,
        leads_exports_create: models::LeadsExportsCreate,
        context: &C) -> Result<LeadsExportSlashCreateResponse, ApiError>;

    /// Get the lead export from the lead export create call
    async fn leads_export_slash_get(
        &self,
        ad_account_id: String,
        leads_export_id: String,
        context: &C) -> Result<LeadsExportSlashGetResponse, ApiError>;

    /// Register media upload
    async fn media_slash_create(
        &self,
        media_upload_create: models::MediaUploadCreate,
        context: &C) -> Result<MediaSlashCreateResponse, ApiError>;

    /// List media uploads
    async fn media_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<MediaSlashListResponse, ApiError>;

    /// Get media upload details
    async fn media_slash_get(
        &self,
        media_id: String,
        context: &C) -> Result<MediaSlashGetResponse, ApiError>;

    /// Send Measurement Source Of Truth (MSOT) attributed conversion events
    async fn msot_events_slash_create(
        &self,
        ad_account_id: String,
        conversion_msot_events_create: models::ConversionMsotEventsCreate,
        context: &C) -> Result<MsotEventsSlashCreateResponse, ApiError>;

    /// Receive notifications from external partners.
    async fn notification_slash_post(
        &self,
        notification_post_request: models::NotificationPostRequest,
        context: &C) -> Result<NotificationSlashPostResponse, ApiError>;

    /// Generate OAuth access token for conversion API
    async fn oauth_slash_conversion_token(
        &self,
        context: &C) -> Result<OauthSlashConversionTokenResponse, ApiError>;

    /// Generate OAuth access token
    async fn oauth_slash_token(
        &self,
        grant_type: models::TokenGrantType,
        code: Option<String>,
        continuous_refresh: Option<String>,
        redirect_uri: Option<String>,
        refresh_token: Option<String>,
        scope: Option<String>,
        context: &C) -> Result<OauthSlashTokenResponse, ApiError>;

    /// Revoke a token
    async fn token_slash_revoke(
        &self,
        token: String,
        token_type_hint: Option<models::TokenTypeHint>,
        context: &C) -> Result<TokenSlashRevokeResponse, ApiError>;

    /// Get order lines.
    async fn order_lines_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<OrderLinesSlashListResponse, ApiError>;

    /// Get order line
    async fn order_lines_slash_get(
        &self,
        order_line_id: String,
        ad_account_id: String,
        context: &C) -> Result<OrderLinesSlashGetResponse, ApiError>;

    /// Get multiple Pin analytics
    async fn multi_pins_slash_analytics<'a>(
        &self,
        pin_ids: &'a Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &'a Vec<models::MultiPinsAnalyticsMetricTypesItem>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        ad_account_id: Option<String>,
        context: &C) -> Result<MultiPinsSlashAnalyticsResponse, ApiError>;

    /// Create Pin
    async fn pins_slash_create(
        &self,
        pin_create: models::PinCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashCreateResponse, ApiError>;

    /// List Pins
    async fn pins_slash_list<'a>(
        &self,
        pin_filter: Option<models::PinFilter>,
        pin_metrics: Option<bool>,
        include_protected_pins: Option<bool>,
        pin_type: Option<models::PinType>,
        creative_types: Option<&'a Vec<models::CreativeType>>,
        ad_account_id: Option<String>,
        domain: Option<String>,
        domains: Option<&'a Vec<String>>,
        include_product_tag_obj: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<PinsSlashListResponse, ApiError>;

    /// Get Pin analytics
    async fn pins_slash_analytics<'a>(
        &self,
        pin_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &'a Vec<models::QuerypinanalyticsmetrictypesItems>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        split_field: Option<models::PinsAnalyticsSplitFieldParameter>,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashAnalyticsResponse, ApiError>;

    /// Delete Pin
    async fn pins_slash_delete(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashDeleteResponse, ApiError>;

    /// Get Pin
    async fn pins_slash_get(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        context: &C) -> Result<PinsSlashGetResponse, ApiError>;

    /// Save Pin
    async fn pins_slash_save(
        &self,
        pin_id: String,
        pins_save_request_create: models::PinsSaveRequestCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashSaveResponse, ApiError>;

    /// Update Pin
    async fn pins_slash_update(
        &self,
        pin_id: String,
        pin_update: models::PinUpdate,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashUpdateResponse, ApiError>;

    /// Create product group promotions
    async fn product_group_promotions_slash_create(
        &self,
        ad_account_id: String,
        product_group_promotions_create: models::ProductGroupPromotionsCreate,
        context: &C) -> Result<ProductGroupPromotionsSlashCreateResponse, ApiError>;

    /// Get product group promotions
    async fn product_group_promotions_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        product_group_promotion_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        ad_group_id: Option<String>,
        context: &C) -> Result<ProductGroupPromotionsSlashListResponse, ApiError>;

    /// Update product group promotions
    async fn product_group_promotions_slash_update(
        &self,
        ad_account_id: String,
        product_group_promotions_update_with_required_body: models::ProductGroupPromotionsUpdateWithRequiredBody,
        context: &C) -> Result<ProductGroupPromotionsSlashUpdateResponse, ApiError>;

    /// Get product group analytics
    async fn product_groups_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        product_group_ids: &'a Vec<models::ProductGroupIdType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<ProductGroupsSlashAnalyticsResponse, ApiError>;

    /// Get a product group promotion by id
    async fn product_group_promotions_slash_get(
        &self,
        ad_account_id: String,
        product_group_promotion_id: String,
        context: &C) -> Result<ProductGroupPromotionsSlashGetResponse, ApiError>;

    /// Add product tags to pin
    async fn product_tags_slash_bulk_add(
        &self,
        pin_id: String,
        product_tags_bulk_add_request: models::ProductTagsBulkAddRequest,
        context: &C) -> Result<ProductTagsSlashBulkAddResponse, ApiError>;

    /// Delete product tags from pin
    async fn product_tags_slash_bulk_delete(
        &self,
        pin_id: String,
        product_tags_bulk_delete_request: models::ProductTagsBulkDeleteRequest,
        context: &C) -> Result<ProductTagsSlashBulkDeleteResponse, ApiError>;

    /// Get product tags for pin
    async fn product_tags_slash_list(
        &self,
        pin_id: String,
        context: &C) -> Result<ProductTagsSlashListResponse, ApiError>;

    /// Create promotions
    async fn promotions_slash_create(
        &self,
        ad_account_id: String,
        promotion_create: models::PromotionCreateBatch,
        context: &C) -> Result<PromotionsSlashCreateResponse, ApiError>;

    /// Get promotions
    async fn promotions_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<PromotionsSlashListResponse, ApiError>;

    /// Update promotions
    async fn promotions_slash_update(
        &self,
        ad_account_id: String,
        promotion_batch_update: models::PromotionUpdateBatch,
        context: &C) -> Result<PromotionsSlashUpdateResponse, ApiError>;

    /// Delete promotion by id
    async fn promotions_slash_delete(
        &self,
        promotion_id: String,
        ad_account_id: String,
        context: &C) -> Result<PromotionsSlashDeleteResponse, ApiError>;

    /// Get promotion by id
    async fn promotions_slash_get(
        &self,
        promotion_id: String,
        ad_account_id: String,
        context: &C) -> Result<PromotionsSlashGetResponse, ApiError>;

    /// Get ad accounts countries
    async fn ad_account_countries_slash_get(
        &self,
        context: &C) -> Result<AdAccountCountriesSlashGetResponse, ApiError>;

    /// Get available metrics' definitions
    async fn delivery_metrics_slash_get(
        &self,
        report_type: Option<models::ReportType>,
        context: &C) -> Result<DeliveryMetricsSlashGetResponse, ApiError>;

    /// Get lead form questions
    async fn lead_form_questions_slash_get(
        &self,
        context: &C) -> Result<LeadFormQuestionsSlashGetResponse, ApiError>;

    /// Get metrics ready state
    async fn metrics_ready_state_slash_get(
        &self,
        date: String,
        context: &C) -> Result<MetricsReadyStateSlashGetResponse, ApiError>;

    /// Get interest details
    async fn interest_targeting_options_slash_get(
        &self,
        interest_id: String,
        context: &C) -> Result<InterestTargetingOptionsSlashGetResponse, ApiError>;

    /// Get targeting options
    async fn targeting_options_slash_get(
        &self,
        targeting_type: models::PublicTargetingType,
        ad_account_id: Option<String>,
        client_id: Option<String>,
        oauth_signature: Option<String>,
        timestamp: Option<String>,
        context: &C) -> Result<TargetingOptionsSlashGetResponse, ApiError>;

    /// Create schedules
    async fn schedules_slash_create<'a>(
        &self,
        ad_account_id: String,
        schedule_create: &'a Vec<models::ScheduleCreate>,
        context: &C) -> Result<SchedulesSlashCreateResponse, ApiError>;

    /// Get Schedules
    async fn schedules_slash_list<'a>(
        &self,
        ad_account_id: String,
        entity_ids: &'a Vec<models::EntityId>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        schedule_statuses: Option<&'a Vec<models::ScheduleStatus>>,
        schedule_type: Option<models::ScheduleType>,
        context: &C) -> Result<SchedulesSlashListResponse, ApiError>;

    /// Update schedules
    async fn schedules_slash_update<'a>(
        &self,
        ad_account_id: String,
        schedule_batch_update: &'a Vec<models::ScheduleBatchUpdate>,
        context: &C) -> Result<SchedulesSlashUpdateResponse, ApiError>;

    /// Search pins by a given search term
    async fn search_partner_pins(
        &self,
        term: String,
        country_code: String,
        bookmark: Option<String>,
        locale: Option<String>,
        limit: Option<u8>,
        context: &C) -> Result<SearchPartnerPinsResponse, ApiError>;

    /// Search user's boards
    async fn search_user_boards_slash_get(
        &self,
        ad_account_id: Option<String>,
        query: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<SearchUserBoardsSlashGetResponse, ApiError>;

    /// Search user's Pins
    async fn search_user_pins_slash_list(
        &self,
        query: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<SearchUserPinsSlashListResponse, ApiError>;

    /// Create targeting templates
    async fn targeting_template_slash_create(
        &self,
        ad_account_id: String,
        targeting_template_create: models::TargetingTemplateCreate,
        context: &C) -> Result<TargetingTemplateSlashCreateResponse, ApiError>;

    /// List targeting templates
    async fn targeting_template_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        include_sizing: Option<bool>,
        search_query: Option<String>,
        context: &C) -> Result<TargetingTemplateSlashListResponse, ApiError>;

    /// Update targeting templates
    async fn targeting_template_slash_update(
        &self,
        ad_account_id: String,
        targeting_template_update_request_read_or_update: models::TargetingTemplateUpdateRequestReadOrUpdate,
        context: &C) -> Result<TargetingTemplateSlashUpdateResponse, ApiError>;

    /// List related terms
    async fn terms_related_slash_list<'a>(
        &self,
        terms: &'a Vec<String>,
        context: &C) -> Result<TermsRelatedSlashListResponse, ApiError>;

    /// List suggested terms
    async fn terms_suggested_slash_list(
        &self,
        term: String,
        limit: Option<u8>,
        context: &C) -> Result<TermsSuggestedSlashListResponse, ApiError>;

    /// Get terms of service
    async fn terms_of_service_slash_get(
        &self,
        ad_account_id: String,
        include_html: Option<bool>,
        tos_type: Option<String>,
        context: &C) -> Result<TermsOfServiceSlashGetResponse, ApiError>;

    /// Returns editorial articles for a given region
    async fn trends_editorial_articles_slash_list(
        &self,
        region: models::ProductCategoryRegion,
        context: &C) -> Result<TrendsEditorialArticlesSlashListResponse, ApiError>;

    /// Get featured topics
    async fn trends_featured_topics_slash_list(
        &self,
        region: models::ProductCategoryRegion,
        interest: Option<models::InterestsEnum>,
        context: &C) -> Result<TrendsFeaturedTopicsSlashListResponse, ApiError>;

    /// Get product category details
    async fn trends_product_categories_details_slash_list<'a>(
        &self,
        product_categories: &'a Vec<models::ProductCategoryEnum>,
        region: models::ProductCategoryRegion,
        lookback_window: Option<models::ProductCategoryDetailLookbackWindow>,
        engagement_type: Option<models::ProductCategoriesEngagementType>,
        context: &C) -> Result<TrendsProductCategoriesDetailsSlashListResponse, ApiError>;

    /// Get a list of growing Shopping Product Categories
    async fn trends_product_categories_trending_slash_list<'a>(
        &self,
        region: models::ProductCategoryRegion,
        verticals: Option<&'a Vec<models::VerticalProductCategory>>,
        ages: Option<&'a Vec<models::AgeTrendsBucket>>,
        genders: Option<&'a Vec<models::GenderBucket>>,
        engagement_type: Option<models::ProductCategoriesEngagementType>,
        context: &C) -> Result<TrendsProductCategoriesTrendingSlashListResponse, ApiError>;

    /// List following boards
    async fn boards_user_follows_slash_list(
        &self,
        ad_account_id: Option<String>,
        explicit_following: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<BoardsUserFollowsSlashListResponse, ApiError>;

    /// List followers
    async fn followers_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<FollowersSlashListResponse, ApiError>;

    /// List linked businesses
    async fn linked_business_accounts_slash_get(
        &self,
        context: &C) -> Result<LinkedBusinessAccountsSlashGetResponse, ApiError>;

    /// Unverify website
    async fn unverify_website_slash_delete(
        &self,
        website: String,
        context: &C) -> Result<UnverifyWebsiteSlashDeleteResponse, ApiError>;

    /// Get user account analytics
    async fn user_account_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&'a Vec<models::QuerymetrictypesItems>>,
        split_field: Option<models::UserAccountAnalyticsSplitFieldParameter>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsResponse, ApiError>;

    /// Get user account top pins analytics
    async fn user_account_slash_analytics_slash_top_pins<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: models::TopPinsSortBy,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&'a Vec<models::QuerymetrictypesItems>>,
        num_of_pins: Option<u8>,
        created_in_last_n_days: Option<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsSlashTopPinsResponse, ApiError>;

    /// Get user account top video pins analytics
    async fn user_account_slash_analytics_slash_top_video_pins<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: models::TopVideoPinsSortBy,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&'a Vec<models::QueryvideopinmetrictypesItems>>,
        num_of_pins: Option<u8>,
        created_in_last_n_days: Option<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsSlashTopVideoPinsResponse, ApiError>;

    /// Get user account
    async fn user_account_slash_get(
        &self,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashGetResponse, ApiError>;

    /// List following
    async fn user_following_slash_get(
        &self,
        ad_account_id: Option<String>,
        explicit_following: Option<bool>,
        feed_type: Option<models::UserFollowingFeedType>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<UserFollowingSlashGetResponse, ApiError>;

    /// Get user websites
    async fn user_websites_slash_get(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<UserWebsitesSlashGetResponse, ApiError>;

    /// Verify website
    async fn verify_website_slash_update(
        &self,
        user_website_create: models::UserWebsiteCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<VerifyWebsiteSlashUpdateResponse, ApiError>;

    /// Get user verification code for website claiming
    async fn website_verification_slash_get(
        &self,
        ad_account_id: Option<String>,
        context: &C) -> Result<WebsiteVerificationSlashGetResponse, ApiError>;

    /// Follow user
    async fn follow_user_slash_update(
        &self,
        username: String,
        follow_user_create: models::FollowUserCreate,
        context: &C) -> Result<FollowUserSlashUpdateResponse, ApiError>;

    /// List following interests
    async fn user_account_slash_followed_interests(
        &self,
        username: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        context: &C) -> Result<UserAccountSlashFollowedInterestsResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[cfg_attr(feature = "mock", automock)]
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait ApiNoContext<C: Send + Sync> {
    // The std::task::Context struct houses a reference to std::task::Waker with the lifetime <'a>.
    // Adding an anonymous lifetime `'a` to allow mockall to create a mock object with the right lifetimes.
    // This is needed because the compiler is unable to determine the lifetimes on F's trait bound
    // where F is the closure created by mockall. We use higher-rank trait bounds here to get around this.

    fn context(&self) -> &C;

    /// Create ad account
    async fn ad_accounts_slash_create(
        &self,
        ad_account_create: models::AdAccountCreate,
        ) -> Result<AdAccountsSlashCreateResponse, ApiError>;

    /// List ad accounts
    async fn ad_accounts_slash_list(
        &self,
        include_shared_accounts: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<AdAccountsSlashListResponse, ApiError>;

    /// Get ad account analytics
    async fn ad_account_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<AdAccountSlashAnalyticsResponse, ApiError>;

    /// Get targeting analytics for an ad account
    async fn ad_account_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsAccountTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<AdAccountTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Get ad account
    async fn ad_accounts_slash_get(
        &self,
        ad_account_id: String,
        ) -> Result<AdAccountsSlashGetResponse, ApiError>;

    /// Create a request for a brand, category, SKU report
    async fn analytics_slash_create_conversion_product_report(
        &self,
        ad_account_id: String,
        conversion_product_report_create: models::ConversionProductReportCreate,
        ) -> Result<AnalyticsSlashCreateConversionProductReportResponse, ApiError>;

    /// Create a request for a Marketing Mix Modeling (MMM) report
    async fn analytics_slash_create_mmm_report(
        &self,
        ad_account_id: String,
        mmm_report_create: models::MmmReportCreate,
        ) -> Result<AnalyticsSlashCreateMmmReportResponse, ApiError>;

    /// Create async request for an account analytics report
    async fn analytics_slash_create_report(
        &self,
        ad_account_id: String,
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        ) -> Result<AnalyticsSlashCreateReportResponse, ApiError>;

    /// Get advertiser brand, category, SKU report
    async fn analytics_slash_get_conversion_product_report(
        &self,
        ad_account_id: String,
        token: String,
        ) -> Result<AnalyticsSlashGetConversionProductReportResponse, ApiError>;

    /// Get advertiser Marketing Mix Modeling (MMM) report.
    async fn analytics_slash_get_mmm_report(
        &self,
        ad_account_id: String,
        token: String,
        ) -> Result<AnalyticsSlashGetMmmReportResponse, ApiError>;

    /// Get the account analytics report created by the async call
    async fn analytics_slash_get_report(
        &self,
        ad_account_id: String,
        token: String,
        ) -> Result<AnalyticsSlashGetReportResponse, ApiError>;

    /// Delete ads data for ad account in API Sandbox
    async fn sandbox_slash_delete(
        &self,
        ad_account_id: String,
        ) -> Result<SandboxSlashDeleteResponse, ApiError>;

    /// List templates
    async fn templates_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<TemplatesSlashListResponse, ApiError>;

    /// Create async request for an analytics report using a template
    async fn analytics_slash_create_template_report(
        &self,
        ad_account_id: String,
        template_id: String,
        start_date: Option<chrono::naive::NaiveDate>,
        end_date: Option<chrono::naive::NaiveDate>,
        granularity: Option<models::Granularity>,
        ) -> Result<AnalyticsSlashCreateTemplateReportResponse, ApiError>;

    /// Get bid floors
    async fn ad_groups_bid_floor_slash_get(
        &self,
        ad_account_id: String,
        bid_floor_create: models::BidFloorCreate,
        ) -> Result<AdGroupsBidFloorSlashGetResponse, ApiError>;

    /// Get ad group analytics
    async fn ad_groups_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        aggregate_report_rows: Option<bool>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<AdGroupsSlashAnalyticsResponse, ApiError>;

    /// Get audience sizing
    async fn ad_groups_slash_audience_sizing(
        &self,
        ad_account_id: String,
        ad_group_audience_sizing_create: models::AdGroupAudienceSizingCreate,
        ) -> Result<AdGroupsSlashAudienceSizingResponse, ApiError>;

    /// Create ad groups
    async fn ad_groups_slash_create(
        &self,
        ad_account_id: String,
        ad_group_create_create: models::AdGroupBatchCreateRequest,
        ) -> Result<AdGroupsSlashCreateResponse, ApiError>;

    /// List ad groups
    async fn ad_groups_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        ad_group_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        translate_interests_to_names: Option<bool>,
        ) -> Result<AdGroupsSlashListResponse, ApiError>;

    /// Update ad groups
    async fn ad_groups_slash_update(
        &self,
        ad_account_id: String,
        ad_group_update_batch_update: models::AdGroupBatchUpdateRequest,
        ) -> Result<AdGroupsSlashUpdateResponse, ApiError>;

    /// Get targeting analytics for ad groups
    async fn ad_groups_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsAdGroupTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        sort_columns: Option<&'a Vec<String>>,
        sort_ascending: Option<bool>,
        ) -> Result<AdGroupsTargetingAnalyticsSlashGetResponse, ApiError>;

    /// List of ad groups using promotions IDs.
    async fn get_ad_groups_by_promotion_ids_slash_list<'a>(
        &self,
        ad_account_id: String,
        promotion_ids: &'a Vec<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<GetAdGroupsByPromotionIdsSlashListResponse, ApiError>;

    /// Get dynamic titles CSV download URL
    async fn ad_groups_dynamic_titles_slash_download_csv(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        ) -> Result<AdGroupsDynamicTitlesSlashDownloadCsvResponse, ApiError>;

    /// Get dynamic titles status
    async fn ad_groups_dynamic_titles_slash_get_status(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        ) -> Result<AdGroupsDynamicTitlesSlashGetStatusResponse, ApiError>;

    /// Get dynamic titles upload URL
    async fn ad_groups_dynamic_titles_slash_get_upload_url(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        ) -> Result<AdGroupsDynamicTitlesSlashGetUploadUrlResponse, ApiError>;

    /// Process dynamic titles CSV
    async fn ad_groups_dynamic_titles_slash_process_csv(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        dynamic_titles_process_csv_create: models::DynamicTitlesProcessCsvCreate,
        ) -> Result<AdGroupsDynamicTitlesSlashProcessCsvResponse, ApiError>;

    /// Get ad group
    async fn ad_groups_slash_get(
        &self,
        ad_group_id: String,
        ad_account_id: String,
        ) -> Result<AdGroupsSlashGetResponse, ApiError>;

    /// Create ad preview with pin or image
    async fn ad_previews_slash_create(
        &self,
        ad_account_id: String,
        ad_preview_request: models::AdPreviewRequest,
        ) -> Result<AdPreviewsSlashCreateResponse, ApiError>;

    /// Get targeting analytics for ads
    async fn ad_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        ad_ids: &'a Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsAdTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::ConversionAttributionWindowDays>,
        engagement_window_days: Option<models::ConversionAttributionWindowDays>,
        view_window_days: Option<models::ConversionAttributionWindowDays>,
        conversion_report_time: Option<models::ConversionReportTimeType>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        sort_columns: Option<&'a Vec<String>>,
        sort_ascending: Option<bool>,
        ) -> Result<AdTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Get ad analytics
    async fn ads_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        pin_ids: Option<&'a Vec<String>>,
        ad_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<AdsSlashAnalyticsResponse, ApiError>;

    /// Create ads
    async fn ads_slash_create(
        &self,
        ad_account_id: String,
        ad_create: models::AdBatchCreateRequest,
        ) -> Result<AdsSlashCreateResponse, ApiError>;

    /// List ads
    async fn ads_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        ad_group_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        ad_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        ) -> Result<AdsSlashListResponse, ApiError>;

    /// Update ads
    async fn ads_slash_update(
        &self,
        ad_account_id: String,
        ad_batch_update: models::AdBatchUpdateRequest,
        ) -> Result<AdsSlashUpdateResponse, ApiError>;

    /// Create ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_create<'a>(
        &self,
        ad_account_id: String,
        campaign_ad_preview_create: &'a Vec<models::CampaignAdPreviewCreate>,
        ) -> Result<CampaignAdPreviewSlashCreateResponse, ApiError>;

    /// Delete ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_delete<'a>(
        &self,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        ad_account_id: String,
        ) -> Result<CampaignAdPreviewSlashDeleteResponse, ApiError>;

    /// Fetch ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_read<'a>(
        &self,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        ad_account_id: String,
        ) -> Result<CampaignAdPreviewSlashReadResponse, ApiError>;

    /// Get ad
    async fn ads_slash_get(
        &self,
        ad_id: String,
        ad_account_id: String,
        ) -> Result<AdsSlashGetResponse, ApiError>;

    /// Get item bid options (POST)
    async fn advanced_auction_items_get_slash_post(
        &self,
        advanced_auction_items_get_request: models::AdvancedAuctionItemsGetRequest,
        ad_account_id: Option<String>,
        ) -> Result<AdvancedAuctionItemsGetSlashPostResponse, ApiError>;

    /// Operate on item level bid options
    async fn advanced_auction_items_submit_slash_post(
        &self,
        advanced_auction_items_submit_request: models::AdvancedAuctionItemsSubmitRequest,
        ad_account_id: Option<String>,
        ) -> Result<AdvancedAuctionItemsSubmitSlashPostResponse, ApiError>;

    /// Get audience insights scope and type
    async fn audience_insights_scope_and_type_slash_get(
        &self,
        ad_account_id: String,
        ) -> Result<AudienceInsightsScopeAndTypeSlashGetResponse, ApiError>;

    /// Get audience insights
    async fn audience_insights_slash_get(
        &self,
        ad_account_id: String,
        audience_insight_type: models::AudienceInsightType,
        ) -> Result<AudienceInsightsSlashGetResponse, ApiError>;

    /// List accounts with access to an audience owned by an ad account
    async fn ad_accounts_audiences_shared_accounts_slash_list(
        &self,
        audience_id: String,
        account_type: models::AudienceAccountType,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<AdAccountsAudiencesSharedAccountsSlashListResponse, ApiError>;

    /// List accounts with access to an audience owned by a business
    async fn business_account_audiences_shared_accounts_slash_list(
        &self,
        business_id: String,
        audience_id: String,
        account_type: models::AudienceAccountType,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessAccountAudiencesSharedAccountsSlashListResponse, ApiError>;

    /// List received audiences for a business
    async fn shared_audiences_for_business_slash_list(
        &self,
        business_id: String,
        order: Option<models::Order>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<SharedAudiencesForBusinessSlashListResponse, ApiError>;

    /// Update audience sharing between ad accounts
    async fn update_ad_account_to_ad_account_shared_audience(
        &self,
        ad_account_id: String,
        ad_account_to_ad_account_shared_audience_update_with_required_body: models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody,
        ) -> Result<UpdateAdAccountToAdAccountSharedAudienceResponse, ApiError>;

    /// Update audience sharing from an ad account to businesses
    async fn update_ad_account_to_business_shared_audience(
        &self,
        ad_account_id: String,
        ad_account_to_business_shared_audience_update_with_required_body: models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody,
        ) -> Result<UpdateAdAccountToBusinessSharedAudienceResponse, ApiError>;

    /// Update audience sharing from a business to ad accounts
    async fn update_business_to_ad_account_shared_audience(
        &self,
        business_id: String,
        business_to_ad_account_shared_audience_update_with_required_body: models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody,
        ) -> Result<UpdateBusinessToAdAccountSharedAudienceResponse, ApiError>;

    /// Update audience sharing between businesses
    async fn update_business_to_business_shared_audience(
        &self,
        business_id: String,
        business_to_business_shared_audience_update_with_required_body: models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody,
        ) -> Result<UpdateBusinessToBusinessSharedAudienceResponse, ApiError>;

    /// Create audience
    async fn audiences_slash_create(
        &self,
        ad_account_id: String,
        ad_accounts_audience_create: models::AdAccountsAudienceCreate,
        ) -> Result<AudiencesSlashCreateResponse, ApiError>;

    /// List audiences
    async fn audiences_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ownership_type: Option<models::AudienceOwnershipType>,
        exclude_nca: Option<bool>,
        ) -> Result<AudiencesSlashListResponse, ApiError>;

    /// Get audience
    async fn audiences_slash_get(
        &self,
        audience_id: String,
        ad_account_id: String,
        ) -> Result<AudiencesSlashGetResponse, ApiError>;

    /// Update audience
    async fn audiences_slash_update(
        &self,
        audience_id: String,
        ad_account_id: String,
        ad_accounts_audience_update: models::AdAccountsAudienceUpdate,
        ) -> Result<AudiencesSlashUpdateResponse, ApiError>;

    /// Redeem ad credits
    async fn ads_credit_slash_redeem(
        &self,
        ad_account_id: String,
        ads_credit_redeem_create: models::AdsCreditRedeemCreate,
        ) -> Result<AdsCreditSlashRedeemResponse, ApiError>;

    /// Get ads credit discounts
    async fn ads_credits_discounts_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<AdsCreditsDiscountsSlashGetResponse, ApiError>;

    /// Get billing invoices
    async fn billing_invoices_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        sort: Option<models::BillingInvoiceSortField>,
        status: Option<models::BillingInvoiceStatus>,
        document_type: Option<models::BillingInvoiceDocumentType>,
        start_due_date: Option<chrono::naive::NaiveDate>,
        end_due_date: Option<chrono::naive::NaiveDate>,
        ) -> Result<BillingInvoicesSlashGetResponse, ApiError>;

    /// Get billing profiles
    async fn billing_profiles_slash_get(
        &self,
        is_active: bool,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BillingProfilesSlashGetResponse, ApiError>;

    /// Get Salesforce account details including bill-to information.
    async fn ssio_accounts_slash_get(
        &self,
        ad_account_id: String,
        ) -> Result<SsioAccountsSlashGetResponse, ApiError>;

    /// Create insertion order through SSIO.
    async fn ssio_insertion_order_slash_create(
        &self,
        ad_account_id: String,
        ssio_insertion_order_create: models::SsioInsertionOrderCreate,
        ) -> Result<SsioInsertionOrderSlashCreateResponse, ApiError>;

    /// Edit insertion order through SSIO.
    async fn ssio_insertion_order_slash_edit(
        &self,
        ad_account_id: String,
        ssio_insertion_order_update: models::SsioInsertionOrderUpdate,
        ) -> Result<SsioInsertionOrderSlashEditResponse, ApiError>;

    /// Get insertion order status by ad account id.
    async fn ssio_insertion_orders_status_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<SsioInsertionOrdersStatusSlashGetByAdAccountResponse, ApiError>;

    /// Get Salesforce order lines by ad account id.
    async fn ssio_order_lines_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        pin_order_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<SsioOrderLinesSlashGetByAdAccountResponse, ApiError>;

    /// Get download url for a billing invoice
    async fn billing_invoice_download_slash_get(
        &self,
        ad_account_id: String,
        billing_invoice_id: String,
        ) -> Result<BillingInvoiceDownloadSlashGetResponse, ApiError>;

    /// Get insertion order status by pin order id.
    async fn ssio_insertion_orders_status_slash_get_by_pin_order_id(
        &self,
        ad_account_id: String,
        pin_order_id: String,
        ) -> Result<SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse, ApiError>;

    /// Create board
    async fn boards_slash_create(
        &self,
        board_create: models::BoardCreate,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashCreateResponse, ApiError>;

    /// List boards
    async fn boards_slash_list(
        &self,
        ad_account_id: Option<String>,
        privacy: Option<models::BoardPrivacyFilter>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BoardsSlashListResponse, ApiError>;

    /// Create board section
    async fn board_sections_slash_create(
        &self,
        board_id: String,
        board_section_create: models::BoardSectionCreate,
        ad_account_id: Option<String>,
        ) -> Result<BoardSectionsSlashCreateResponse, ApiError>;

    /// List board sections
    async fn board_sections_slash_list(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BoardSectionsSlashListResponse, ApiError>;

    /// Delete board
    async fn boards_slash_delete(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashDeleteResponse, ApiError>;

    /// Get board
    async fn boards_slash_get(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashGetResponse, ApiError>;

    /// List Pins on board
    async fn boards_slash_list_pins<'a>(
        &self,
        board_id: String,
        creative_types: Option<&'a Vec<models::CreativeType>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BoardsSlashListPinsResponse, ApiError>;

    /// Update board
    async fn boards_slash_update(
        &self,
        board_id: String,
        board_with_update_privacy_update: models::BoardWithUpdatePrivacyUpdate,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashUpdateResponse, ApiError>;

    /// Delete board section
    async fn board_sections_slash_delete(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        ) -> Result<BoardSectionsSlashDeleteResponse, ApiError>;

    /// List Pins on board section
    async fn board_sections_slash_list_pins(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BoardSectionsSlashListPinsResponse, ApiError>;

    /// Update board section
    async fn board_sections_slash_update(
        &self,
        board_id: String,
        section_id: String,
        board_section_update_with_required_body: models::BoardSectionUpdateWithRequiredBody,
        ad_account_id: Option<String>,
        ) -> Result<BoardSectionsSlashUpdateResponse, ApiError>;

    /// Get advertiser entities in bulk
    async fn bulk_download_slash_create(
        &self,
        ad_account_id: String,
        bulk_download_create: models::BulkDownloadCreate,
        ) -> Result<BulkDownloadSlashCreateResponse, ApiError>;

    /// Create/update ad entities in bulk
    async fn bulk_upsert_slash_create(
        &self,
        ad_account_id: String,
        bulk_upsert_request: models::BulkUpsertRequest,
        ) -> Result<BulkUpsertSlashCreateResponse, ApiError>;

    /// Download advertiser entities in bulk
    async fn bulk_request_slash_get(
        &self,
        ad_account_id: String,
        bulk_request_id: String,
        include_details: Option<bool>,
        ) -> Result<BulkRequestSlashGetResponse, ApiError>;

    /// Create a new asset group.
    async fn asset_group_slash_create(
        &self,
        business_id: String,
        asset_group_input_create: models::AssetGroupInputCreate,
        ) -> Result<AssetGroupSlashCreateResponse, ApiError>;

    /// Delete asset groups.
    async fn asset_group_slash_delete(
        &self,
        business_id: String,
        asset_group_deletion_delete: models::AssetGroupDeletionDelete,
        ) -> Result<AssetGroupSlashDeleteResponse, ApiError>;

    /// Update asset groups.
    async fn asset_group_slash_update(
        &self,
        business_id: String,
        asset_group_modification_read_or_update: models::AssetGroupModificationReadOrUpdate,
        ) -> Result<AssetGroupSlashUpdateResponse, ApiError>;

    /// List business assets
    async fn business_assets_slash_get<'a>(
        &self,
        business_id: String,
        permissions: Option<&'a Vec<models::PermissionsWithOwner>>,
        child_asset_id: Option<String>,
        asset_group_id: Option<String>,
        asset_type: Option<models::BusinessAssetsGetAssetTypeParameter>,
        start_index: Option<u32>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessAssetsSlashGetResponse, ApiError>;

    /// Delete member access to asset
    async fn business_members_asset_access_slash_delete(
        &self,
        business_id: String,
        business_members_asset_access_delete_body: models::BusinessMembersAssetAccessDeleteBody,
        ) -> Result<BusinessMembersAssetAccessSlashDeleteResponse, ApiError>;

    /// Assign/Update member asset permissions
    async fn business_members_asset_access_slash_update(
        &self,
        business_id: String,
        update_member_asset_access_body: models::UpdateMemberAssetAccessBody,
        ) -> Result<BusinessMembersAssetAccessSlashUpdateResponse, ApiError>;

    /// Delete partner access to asset
    async fn delete_partner_asset_access_handler_impl(
        &self,
        business_id: String,
        delete_partner_asset_access_body: models::DeletePartnerAssetAccessBody,
        ) -> Result<DeletePartnerAssetAccessHandlerImplResponse, ApiError>;

    /// Assign/Update partner asset permissions
    async fn update_partner_asset_access_handler_impl(
        &self,
        business_id: String,
        update_partner_asset_access_body: models::UpdatePartnerAssetAccessBody,
        ) -> Result<UpdatePartnerAssetAccessHandlerImplResponse, ApiError>;

    /// Get members with access to asset
    async fn business_asset_members_slash_get(
        &self,
        business_id: String,
        asset_id: String,
        start_index: Option<u32>,
        fetch_system_users: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessAssetMembersSlashGetResponse, ApiError>;

    /// Get partners with access to asset
    async fn business_asset_partners_slash_get(
        &self,
        business_id: String,
        asset_id: String,
        start_index: Option<u32>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessAssetPartnersSlashGetResponse, ApiError>;

    /// Get assets assigned to a member
    async fn business_member_assets_slash_get<'a>(
        &self,
        business_id: String,
        member_id: String,
        asset_type: Option<models::BusinessMemberAssetsGetAssetTypeParameter>,
        start_index: Option<u32>,
        sort_by: Option<models::AssetSortBy>,
        sort_ascending: Option<bool>,
        search_by: Option<models::AssetSearchBy>,
        search_value: Option<String>,
        asset_permission_type: Option<models::AssetPermissionType>,
        ad_account_statuses: Option<&'a Vec<models::NonDraftEntityStatus>>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessMemberAssetsSlashGetResponse, ApiError>;

    /// Get assets assigned to a partner or assets assigned by a partner
    async fn business_partner_asset_access_slash_get(
        &self,
        business_id: String,
        partner_id: String,
        partner_type: Option<models::BusinessPartnerAssetAccessGetPartnerTypeParameter>,
        asset_type: Option<models::BusinessPartnerAssetAccessGetAssetTypeParameter>,
        start_index: Option<u32>,
        sort_by: Option<models::AssetSortBy>,
        sort_ascending: Option<bool>,
        search_by: Option<models::AssetSearchBy>,
        search_value: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessPartnerAssetAccessSlashGetResponse, ApiError>;

    /// Accept or decline an invite/request
    async fn respond_business_access_invites(
        &self,
        auth_respond_invites_body: models::AuthRespondInvitesBody,
        ) -> Result<RespondBusinessAccessInvitesResponse, ApiError>;

    /// Create a request to access an existing partner's assets.
    async fn asset_access_requests_slash_create(
        &self,
        business_id: String,
        create_asset_access_request_body: models::CreateAssetAccessRequestBody,
        ) -> Result<AssetAccessRequestsSlashCreateResponse, ApiError>;

    /// Cancel invites/requests
    async fn cancel_invites_or_requests(
        &self,
        business_id: String,
        cancel_invites_request: models::CancelInvitesRequest,
        ) -> Result<CancelInvitesOrRequestsResponse, ApiError>;

    /// Update invite/request with an asset permission
    async fn create_asset_invites(
        &self,
        business_id: String,
        create_asset_invites_request: models::CreateAssetInvitesRequest,
        ) -> Result<CreateAssetInvitesResponse, ApiError>;

    /// Create invites or requests
    async fn create_membership_or_partnership_invites(
        &self,
        business_id: String,
        create_membership_or_partnership_invites_body: models::CreateMembershipOrPartnershipInvitesBody,
        ) -> Result<CreateMembershipOrPartnershipInvitesResponse, ApiError>;

    /// Get invites/requests
    async fn get_slash_invites<'a>(
        &self,
        business_id: String,
        is_member: Option<bool>,
        invite_status: Option<&'a Vec<models::InviteFilterStatus>>,
        invite_type: Option<models::InviteType>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<GetSlashInvitesResponse, ApiError>;

    /// List business employers for user
    async fn get_slash_business_employers(
        &self,
        assets_summary: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<GetSlashBusinessEmployersResponse, ApiError>;

    /// Create a Brand Account
    async fn brand_accounts_slash_create(
        &self,
        business_hierarchy_id: String,
        brand_account_create: models::BrandAccountCreate,
        ) -> Result<BrandAccountsSlashCreateResponse, ApiError>;

    /// Terminate business memberships
    async fn delete_business_membership(
        &self,
        business_id: String,
        delete_business_membership_body: models::DeleteBusinessMembershipBody,
        ) -> Result<DeleteBusinessMembershipResponse, ApiError>;

    /// Terminate business partnerships
    async fn delete_business_partners(
        &self,
        business_id: String,
        delete_business_partners_delete: models::DeleteBusinessPartnersDelete,
        ) -> Result<DeleteBusinessPartnersResponse, ApiError>;

    /// Get business members
    async fn get_slash_business_members<'a>(
        &self,
        business_id: String,
        fetch_system_users: Option<bool>,
        assets_summary: Option<bool>,
        business_roles: Option<&'a Vec<models::MemberBusinessRole>>,
        member_ids: Option<String>,
        start_index: Option<u32>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<GetSlashBusinessMembersResponse, ApiError>;

    /// Get business partners
    async fn get_slash_business_partners(
        &self,
        business_id: String,
        assets_summary: Option<bool>,
        partner_type: Option<models::PartnerType>,
        partner_ids: Option<String>,
        start_index: Option<u32>,
        sort_ascending: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<GetSlashBusinessPartnersResponse, ApiError>;

    /// Update member's business role
    async fn update_slash_business_memberships(
        &self,
        business_id: String,
        business_membership_member: models::UpdateBusinessMembershipsBody,
        ) -> Result<UpdateSlashBusinessMembershipsResponse, ApiError>;

    /// Update a Brand Account
    async fn brand_accounts_slash_update(
        &self,
        brand_account_id: String,
        business_hierarchy_id: String,
        brand_account_update: models::BrandAccountUpdate,
        ) -> Result<BrandAccountsSlashUpdateResponse, ApiError>;

    /// Update a system user information.
    async fn system_user_slash_update(
        &self,
        business_id: String,
        system_user_id: String,
        system_user_update_with_required_body: models::SystemUserUpdateWithRequiredBody,
        ) -> Result<SystemUserSlashUpdateResponse, ApiError>;

    /// Get pins analytics
    async fn ad_pins_slash_analytics<'a>(
        &self,
        campaign_id: String,
        pin_ids: &'a Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        ) -> Result<AdPinsSlashAnalyticsResponse, ApiError>;

    /// Get targeting analytics for campaigns
    async fn campaign_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        campaign_ids: &'a Vec<models::CampaignIdRequiredType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsCampaignTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<CampaignTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Get campaign analytics
    async fn campaigns_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        campaign_ids: &'a Vec<models::CampaignIdRequiredType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        aggregate_report_rows: Option<bool>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<CampaignsSlashAnalyticsResponse, ApiError>;

    /// Create campaigns
    async fn campaigns_slash_create(
        &self,
        ad_account_id: String,
        campaign_create_item: models::CampaignBatchCreateRequest,
        ) -> Result<CampaignsSlashCreateResponse, ApiError>;

    /// List campaigns
    async fn campaigns_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        ) -> Result<CampaignsSlashListResponse, ApiError>;

    /// Update campaigns
    async fn campaigns_slash_update(
        &self,
        ad_account_id: String,
        campaign_batch_update_item: models::CampaignBatchUpdateRequest,
        ) -> Result<CampaignsSlashUpdateResponse, ApiError>;

    /// Get campaign delivery estimates
    async fn get_campaign_delivery_estimates(
        &self,
        ad_account_id: String,
        campaign_delivery_estimates_campaign: models::CampaignDeliveryEstimatesCampaignRequest,
        ) -> Result<GetCampaignDeliveryEstimatesResponse, ApiError>;

    /// Get campaign
    async fn campaigns_slash_get(
        &self,
        campaign_id: String,
        ad_account_id: String,
        ) -> Result<CampaignsSlashGetResponse, ApiError>;

    /// Create feed
    async fn feeds_slash_create(
        &self,
        catalogs_feed_create_request_schema: models::CatalogsFeedCreateRequestSchema,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashCreateResponse, ApiError>;

    /// List feeds
    async fn feeds_slash_list(
        &self,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<FeedsSlashListResponse, ApiError>;

    /// List feed processing results
    async fn feed_processing_results_slash_list(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<FeedProcessingResultsSlashListResponse, ApiError>;

    /// Delete feed
    async fn feeds_slash_delete(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashDeleteResponse, ApiError>;

    /// Get feed
    async fn feeds_slash_get(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashGetResponse, ApiError>;

    /// Ingest feed items
    async fn feeds_slash_ingest(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashIngestResponse, ApiError>;

    /// Update feed
    async fn feeds_slash_update(
        &self,
        feed_id: String,
        catalogs_feed_update_request_schema: models::CatalogsFeedUpdateRequestSchema,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashUpdateResponse, ApiError>;

    /// List item issues
    async fn items_issues_slash_list<'a>(
        &self,
        processing_result_id: String,
        item_numbers: Option<&'a Vec<i32>>,
        item_validation_issue: Option<models::CatalogsItemValidationIssue>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<ItemsIssuesSlashListResponse, ApiError>;

    /// Operate on item batch
    async fn items_batch_slash_post(
        &self,
        catalogs_items_batch_post_request: models::CatalogsItemsBatchPostRequest,
        ad_account_id: Option<String>,
        ) -> Result<ItemsBatchSlashPostResponse, ApiError>;

    /// Get catalogs items (POST)
    async fn items_slash_post(
        &self,
        catalogs_items_request: models::CatalogsItemsRequest,
        ad_account_id: Option<String>,
        ) -> Result<ItemsSlashPostResponse, ApiError>;

    /// Get item batch status
    async fn items_batch_slash_get(
        &self,
        batch_id: String,
        ad_account_id: Option<String>,
        ) -> Result<ItemsBatchSlashGetResponse, ApiError>;

    /// Create product group
    async fn catalogs_product_groups_slash_create(
        &self,
        catalogs_product_groups_create_request_schema: models::CatalogsProductGroupsCreateRequestSchema,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashCreateResponse, ApiError>;

    /// Create product groups
    async fn catalogs_product_groups_slash_create_many(
        &self,
        catalogs_product_groups_create_many_request_items: models::CatalogsProductGroupsCreateManyRequestSchema,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashCreateManyResponse, ApiError>;

    /// Delete product groups
    async fn catalogs_product_groups_slash_delete_many<'a>(
        &self,
        id: &'a Vec<i32>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashDeleteManyResponse, ApiError>;

    /// List product groups
    async fn catalogs_product_groups_slash_list<'a>(
        &self,
        id: Option<&'a Vec<i32>>,
        feed_id: Option<String>,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<CatalogsProductGroupsSlashListResponse, ApiError>;

    /// List products by filter
    async fn products_by_product_group_filter_slash_list(
        &self,
        catalogs_list_products_by_filter_request: models::CatalogsListProductsByFilterRequest,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        ) -> Result<ProductsByProductGroupFilterSlashListResponse, ApiError>;

    /// List products by product group
    async fn catalogs_product_group_pins_slash_list(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<CatalogsProductGroupPinsSlashListResponse, ApiError>;

    /// Delete product group
    async fn catalogs_product_groups_slash_delete(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashDeleteResponse, ApiError>;

    /// Get product group
    async fn catalogs_product_groups_slash_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashGetResponse, ApiError>;

    /// Get product counts
    async fn catalogs_product_groups_slash_product_counts_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, ApiError>;

    /// Update single product group
    async fn catalogs_product_groups_slash_update(
        &self,
        product_group_id: String,
        catalogs_product_groups_update_request_schema: models::CatalogsProductGroupsUpdateRequestSchema,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashUpdateResponse, ApiError>;

    /// Build catalogs report
    async fn reports_slash_create(
        &self,
        catalogs_report_parameters: models::CatalogsReportParameters,
        ad_account_id: Option<String>,
        ) -> Result<ReportsSlashCreateResponse, ApiError>;

    /// Get catalogs report
    async fn reports_slash_get(
        &self,
        token: String,
        ad_account_id: Option<String>,
        ) -> Result<ReportsSlashGetResponse, ApiError>;

    /// List report stats
    async fn reports_slash_stats(
        &self,
        parameters: models::CatalogsReportStatsParameters,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<ReportsSlashStatsResponse, ApiError>;

    /// Operate on local inventory item batch
    async fn catalogs_local_inventory_items_batch_slash_operate(
        &self,
        catalog_id: String,
        local_inventory_items_batch_create: models::LocalInventoryItemsBatchCreate,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsLocalInventoryItemsBatchSlashOperateResponse, ApiError>;

    /// Get local inventory items (POST)
    async fn catalogs_local_inventory_items_slash_post(
        &self,
        catalog_id: String,
        local_inventory_items_get_create: models::LocalInventoryItemsGetCreate,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsLocalInventoryItemsSlashPostResponse, ApiError>;

    /// Create local stores
    async fn catalogs_local_stores_slash_create<'a>(
        &self,
        catalog_id: String,
        local_store_create: &'a Vec<models::LocalStoreCreate>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsLocalStoresSlashCreateResponse, ApiError>;

    /// Delete local stores
    async fn catalogs_local_stores_slash_delete<'a>(
        &self,
        catalog_id: String,
        ids: &'a Vec<models::LocalStoreId>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsLocalStoresSlashDeleteResponse, ApiError>;

    /// List local stores
    async fn catalogs_local_stores_slash_list<'a>(
        &self,
        catalog_id: String,
        ids: Option<&'a Vec<models::LocalStoreId>>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<CatalogsLocalStoresSlashListResponse, ApiError>;

    /// Update local stores
    async fn catalogs_local_stores_slash_update<'a>(
        &self,
        catalog_id: String,
        local_store_batch_update: &'a Vec<models::LocalStoreBatchUpdate>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsLocalStoresSlashUpdateResponse, ApiError>;

    /// Get supplemental items batch status
    async fn catalogs_supplemental_items_batch_slash_get(
        &self,
        catalog_id: String,
        batch_id: String,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsSupplementalItemsBatchSlashGetResponse, ApiError>;

    /// List available filter values
    async fn catalogs_slash_available_filter_values(
        &self,
        catalog_id: String,
        feed_id: Option<String>,
        country: Option<models::Country>,
        language: Option<models::CatalogsLocale>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsSlashAvailableFilterValuesResponse, ApiError>;

    /// Create catalog
    async fn catalogs_slash_create(
        &self,
        catalog_create: models::CatalogCreate,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsSlashCreateResponse, ApiError>;

    /// List catalogs
    async fn catalogs_slash_list(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<CatalogsSlashListResponse, ApiError>;

    /// Create a conversion deletion request
    async fn conversion_deletion_request_slash_create(
        &self,
        ad_account_id: String,
        conversion_deletion_request_create: models::ConversionDeletionRequestCreate,
        ) -> Result<ConversionDeletionRequestSlashCreateResponse, ApiError>;

    /// List conversion deletion requests
    async fn conversion_deletion_request_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<ConversionDeletionRequestSlashListResponse, ApiError>;

    /// Delete a conversion deletion request
    async fn conversion_deletion_request_slash_delete(
        &self,
        request_id: String,
        ad_account_id: String,
        ) -> Result<ConversionDeletionRequestSlashDeleteResponse, ApiError>;

    /// Get a single conversion deletion request
    async fn conversion_deletion_request_slash_get(
        &self,
        request_id: String,
        ad_account_id: String,
        ) -> Result<ConversionDeletionRequestSlashGetResponse, ApiError>;

    /// Get event quality score (EQS)
    async fn conversion_eqs_slash_list(
        &self,
        lookback_period: models::LookbackPeriodOptions,
        ad_account_id: String,
        source_platform: Option<models::SourcePlatformOptions>,
        ingestion_source: Option<models::IngestionSourceOptions>,
        ) -> Result<ConversionEqsSlashListResponse, ApiError>;

    /// Send conversions
    async fn events_slash_create(
        &self,
        ad_account_id: String,
        conversion_events_create: models::ConversionEventsCreate,
        test: Option<bool>,
        ) -> Result<EventsSlashCreateResponse, ApiError>;

    /// Create conversion tag
    async fn conversion_tags_slash_create(
        &self,
        ad_account_id: String,
        conversion_tag_create: models::ConversionTagCreate,
        ) -> Result<ConversionTagsSlashCreateResponse, ApiError>;

    /// List conversion tags
    async fn conversion_tags_slash_list(
        &self,
        ad_account_id: String,
        filter_deleted: Option<bool>,
        ) -> Result<ConversionTagsSlashListResponse, ApiError>;

    /// Get Ocpm eligible conversion tags
    async fn ocpm_eligible_conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        ) -> Result<OcpmEligibleConversionTagsSlashGetResponse, ApiError>;

    /// Get page visit conversion tags
    async fn page_visit_conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<PageVisitConversionTagsSlashGetResponse, ApiError>;

    /// Get conversion tag
    async fn conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        conversion_tag_id: String,
        ) -> Result<ConversionTagsSlashGetResponse, ApiError>;

    /// Create advertiser defined events
    async fn advertiser_defined_events_slash_create(
        &self,
        ad_account_id: String,
        advertiser_defined_events_create_request: models::AdvertiserDefinedEventsCreateRequest,
        ) -> Result<AdvertiserDefinedEventsSlashCreateResponse, ApiError>;

    /// Delete advertiser defined events
    async fn advertiser_defined_events_slash_delete<'a>(
        &self,
        ad_account_id: String,
        event_names: &'a Vec<String>,
        ) -> Result<AdvertiserDefinedEventsSlashDeleteResponse, ApiError>;

    /// Get advertiser defined events
    async fn advertiser_defined_events_slash_get(
        &self,
        ad_account_id: String,
        ) -> Result<AdvertiserDefinedEventsSlashGetResponse, ApiError>;

    /// Update advertiser defined events
    async fn advertiser_defined_events_slash_update(
        &self,
        ad_account_id: String,
        advertiser_defined_events_create_request: models::AdvertiserDefinedEventsCreateRequest,
        ) -> Result<AdvertiserDefinedEventsSlashUpdateResponse, ApiError>;

    /// Create customer list upload
    async fn customer_list_uploads_slash_create(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_create_request: models::CustomerListUploadCreateRequest,
        ) -> Result<CustomerListUploadsSlashCreateResponse, ApiError>;

    /// Get customer list upload
    async fn customer_list_uploads_slash_get(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_id: String,
        ) -> Result<CustomerListUploadsSlashGetResponse, ApiError>;

    /// Run customer list upload
    async fn customer_list_uploads_slash_run(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_id: String,
        ) -> Result<CustomerListUploadsSlashRunResponse, ApiError>;

    /// Create customer lists
    async fn customer_lists_slash_create(
        &self,
        ad_account_id: String,
        customer_list_create: models::CustomerListCreate,
        ) -> Result<CustomerListsSlashCreateResponse, ApiError>;

    /// Get customer lists
    async fn customer_lists_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        exclude_nca: Option<bool>,
        ) -> Result<CustomerListsSlashListResponse, ApiError>;

    /// Get customer list
    async fn customer_lists_slash_get(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        ) -> Result<CustomerListsSlashGetResponse, ApiError>;

    /// Update customer list
    async fn customer_lists_slash_update(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_update_with_required_body: models::CustomerListUpdateWithRequiredBody,
        ) -> Result<CustomerListsSlashUpdateResponse, ApiError>;

    /// Create customer segments
    async fn customer_segment_slash_create(
        &self,
        ad_account_id: String,
        customer_segment_create: models::CustomerSegmentCreate,
        ) -> Result<CustomerSegmentSlashCreateResponse, ApiError>;

    /// List customer segments
    async fn customer_segment_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        include_sizing: Option<bool>,
        search_query: Option<String>,
        ) -> Result<CustomerSegmentSlashListResponse, ApiError>;

    /// Update customer segments
    async fn customer_segment_slash_update(
        &self,
        ad_account_id: String,
        customer_segment_update_request_update_with_required_body: models::CustomerSegmentUpdateRequestUpdateWithRequiredBody,
        ) -> Result<CustomerSegmentSlashUpdateResponse, ApiError>;

    /// Create commerce integration
    async fn integrations_commerce_slash_post(
        &self,
        integration_metadata_create: models::IntegrationMetadataCreate,
        ) -> Result<IntegrationsCommerceSlashPostResponse, ApiError>;

    /// Receives batched logs from integration applications.
    async fn integrations_logs_slash_post(
        &self,
        integration_logs_request_create: models::IntegrationLogsRequestCreate,
        ) -> Result<IntegrationsLogsSlashPostResponse, ApiError>;

    /// Get integration metadata list
    async fn integrations_slash_get_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<IntegrationsSlashGetListResponse, ApiError>;

    /// Delete commerce integration
    async fn integrations_commerce_slash_del(
        &self,
        external_business_id: String,
        ) -> Result<IntegrationsCommerceSlashDelResponse, ApiError>;

    /// Get commerce integration
    async fn integrations_commerce_slash_get(
        &self,
        external_business_id: String,
        ) -> Result<IntegrationsCommerceSlashGetResponse, ApiError>;

    /// Update commerce integration
    async fn integrations_commerce_slash_patch(
        &self,
        external_business_id: String,
        integration_metadata_update: models::IntegrationMetadataUpdate,
        ) -> Result<IntegrationsCommerceSlashPatchResponse, ApiError>;

    /// Get integration metadata
    async fn integrations_slash_get_by_id(
        &self,
        id: String,
        ) -> Result<IntegrationsSlashGetByIdResponse, ApiError>;

    /// Get country's keyword metrics
    async fn country_keywords_metrics_slash_get<'a>(
        &self,
        ad_account_id: String,
        country_code: String,
        keywords: &'a Vec<String>,
        ) -> Result<CountryKeywordsMetricsSlashGetResponse, ApiError>;

    /// Create keywords
    async fn keywords_slash_create(
        &self,
        ad_account_id: String,
        keywords_create: models::KeywordsCreate,
        ) -> Result<KeywordsSlashCreateResponse, ApiError>;

    /// Get keywords
    async fn keywords_slash_get<'a>(
        &self,
        ad_account_id: String,
        campaign_id: Option<String>,
        ad_group_id: Option<String>,
        ad_group_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        match_types: Option<&'a Vec<models::MatchType>>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<KeywordsSlashGetResponse, ApiError>;

    /// Update keywords
    async fn keywords_slash_update(
        &self,
        ad_account_id: String,
        keywords_update: models::KeywordsUpdate,
        ) -> Result<KeywordsSlashUpdateResponse, ApiError>;

    /// List trending keywords
    async fn trending_keywords_slash_list<'a>(
        &self,
        region: models::TrendsSupportedRegion,
        trend_type: models::TrendType,
        interests: Option<&'a Vec<models::TrendsL1Interest>>,
        genders: Option<&'a Vec<models::TrendsGenderFilter>>,
        ages: Option<&'a Vec<models::TrendsAgeBucket>>,
        include_keywords: Option<&'a Vec<models::KeywordListItems>>,
        normalize_against_group: Option<bool>,
        limit: Option<u8>,
        include_demographics: Option<bool>,
        ) -> Result<TrendingKeywordsSlashListResponse, ApiError>;

    /// Create labels
    async fn labels_slash_create(
        &self,
        ad_account_id: String,
        label_create_request: models::LabelCreateRequest,
        ) -> Result<LabelsSlashCreateResponse, ApiError>;

    /// List labels
    async fn labels_slash_list<'a>(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        label_ids: Option<&'a Vec<models::QueryLabelIdsItems>>,
        entity_statuses: Option<&'a Vec<models::QueryLabelEntityStatusesItems>>,
        label_types: Option<&'a Vec<models::QueryLabelTypesItems>>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<LabelsSlashListResponse, ApiError>;

    /// Update labels
    async fn labels_slash_update(
        &self,
        ad_account_id: String,
        label_update_request: models::LabelUpdateRequest,
        ) -> Result<LabelsSlashUpdateResponse, ApiError>;

    /// Apply label to entity
    async fn labels_slash_apply(
        &self,
        ad_account_id: String,
        label_id: String,
        labeled_entities_create: models::LabeledEntitiesCreate,
        ) -> Result<LabelsSlashApplyResponse, ApiError>;

    /// Remove label from entities
    async fn labels_slash_remove(
        &self,
        ad_account_id: String,
        label_id: String,
        labeled_entities_create: models::LabeledEntitiesCreate,
        ) -> Result<LabelsSlashRemoveResponse, ApiError>;

    /// Get lead ads subscriptions
    async fn ad_accounts_subscriptions_slash_get_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<AdAccountsSubscriptionsSlashGetListResponse, ApiError>;

    /// Create lead ads subscription
    async fn ad_accounts_subscriptions_slash_post(
        &self,
        ad_account_id: String,
        lead_subscription_post_params_create: models::LeadSubscriptionPostParamsCreate,
        ) -> Result<AdAccountsSubscriptionsSlashPostResponse, ApiError>;

    /// Delete lead ads subscription
    async fn ad_accounts_subscriptions_slash_del_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        ) -> Result<AdAccountsSubscriptionsSlashDelByIdResponse, ApiError>;

    /// Get lead ads subscription by ID
    async fn ad_accounts_subscriptions_slash_get_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        ) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, ApiError>;

    /// Create lead forms
    async fn lead_forms_slash_create(
        &self,
        ad_account_id: String,
        lead_form_create: models::LeadFormsCreateBody,
        ) -> Result<LeadFormsSlashCreateResponse, ApiError>;

    /// List lead forms
    async fn lead_forms_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<LeadFormsSlashListResponse, ApiError>;

    /// Update lead forms
    async fn lead_forms_slash_update(
        &self,
        ad_account_id: String,
        lead_form_batch_update: models::LeadFormsUpdateBody,
        ) -> Result<LeadFormsSlashUpdateResponse, ApiError>;

    /// Get lead form by id
    async fn lead_form_slash_get(
        &self,
        lead_form_id: String,
        ad_account_id: String,
        ) -> Result<LeadFormSlashGetResponse, ApiError>;

    /// Create lead form test data
    async fn lead_form_test_slash_create(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        lead_form_test_create: models::LeadFormTestCreate,
        ) -> Result<LeadFormTestSlashCreateResponse, ApiError>;

    /// Create a request to export leads collected from a lead ad
    async fn leads_export_slash_create(
        &self,
        ad_account_id: String,
        leads_exports_create: models::LeadsExportsCreate,
        ) -> Result<LeadsExportSlashCreateResponse, ApiError>;

    /// Get the lead export from the lead export create call
    async fn leads_export_slash_get(
        &self,
        ad_account_id: String,
        leads_export_id: String,
        ) -> Result<LeadsExportSlashGetResponse, ApiError>;

    /// Register media upload
    async fn media_slash_create(
        &self,
        media_upload_create: models::MediaUploadCreate,
        ) -> Result<MediaSlashCreateResponse, ApiError>;

    /// List media uploads
    async fn media_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<MediaSlashListResponse, ApiError>;

    /// Get media upload details
    async fn media_slash_get(
        &self,
        media_id: String,
        ) -> Result<MediaSlashGetResponse, ApiError>;

    /// Send Measurement Source Of Truth (MSOT) attributed conversion events
    async fn msot_events_slash_create(
        &self,
        ad_account_id: String,
        conversion_msot_events_create: models::ConversionMsotEventsCreate,
        ) -> Result<MsotEventsSlashCreateResponse, ApiError>;

    /// Receive notifications from external partners.
    async fn notification_slash_post(
        &self,
        notification_post_request: models::NotificationPostRequest,
        ) -> Result<NotificationSlashPostResponse, ApiError>;

    /// Generate OAuth access token for conversion API
    async fn oauth_slash_conversion_token(
        &self,
        ) -> Result<OauthSlashConversionTokenResponse, ApiError>;

    /// Generate OAuth access token
    async fn oauth_slash_token(
        &self,
        grant_type: models::TokenGrantType,
        code: Option<String>,
        continuous_refresh: Option<String>,
        redirect_uri: Option<String>,
        refresh_token: Option<String>,
        scope: Option<String>,
        ) -> Result<OauthSlashTokenResponse, ApiError>;

    /// Revoke a token
    async fn token_slash_revoke(
        &self,
        token: String,
        token_type_hint: Option<models::TokenTypeHint>,
        ) -> Result<TokenSlashRevokeResponse, ApiError>;

    /// Get order lines.
    async fn order_lines_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<OrderLinesSlashListResponse, ApiError>;

    /// Get order line
    async fn order_lines_slash_get(
        &self,
        order_line_id: String,
        ad_account_id: String,
        ) -> Result<OrderLinesSlashGetResponse, ApiError>;

    /// Get multiple Pin analytics
    async fn multi_pins_slash_analytics<'a>(
        &self,
        pin_ids: &'a Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &'a Vec<models::MultiPinsAnalyticsMetricTypesItem>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        ad_account_id: Option<String>,
        ) -> Result<MultiPinsSlashAnalyticsResponse, ApiError>;

    /// Create Pin
    async fn pins_slash_create(
        &self,
        pin_create: models::PinCreate,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashCreateResponse, ApiError>;

    /// List Pins
    async fn pins_slash_list<'a>(
        &self,
        pin_filter: Option<models::PinFilter>,
        pin_metrics: Option<bool>,
        include_protected_pins: Option<bool>,
        pin_type: Option<models::PinType>,
        creative_types: Option<&'a Vec<models::CreativeType>>,
        ad_account_id: Option<String>,
        domain: Option<String>,
        domains: Option<&'a Vec<String>>,
        include_product_tag_obj: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<PinsSlashListResponse, ApiError>;

    /// Get Pin analytics
    async fn pins_slash_analytics<'a>(
        &self,
        pin_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &'a Vec<models::QuerypinanalyticsmetrictypesItems>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        split_field: Option<models::PinsAnalyticsSplitFieldParameter>,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashAnalyticsResponse, ApiError>;

    /// Delete Pin
    async fn pins_slash_delete(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashDeleteResponse, ApiError>;

    /// Get Pin
    async fn pins_slash_get(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        ) -> Result<PinsSlashGetResponse, ApiError>;

    /// Save Pin
    async fn pins_slash_save(
        &self,
        pin_id: String,
        pins_save_request_create: models::PinsSaveRequestCreate,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashSaveResponse, ApiError>;

    /// Update Pin
    async fn pins_slash_update(
        &self,
        pin_id: String,
        pin_update: models::PinUpdate,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashUpdateResponse, ApiError>;

    /// Create product group promotions
    async fn product_group_promotions_slash_create(
        &self,
        ad_account_id: String,
        product_group_promotions_create: models::ProductGroupPromotionsCreate,
        ) -> Result<ProductGroupPromotionsSlashCreateResponse, ApiError>;

    /// Get product group promotions
    async fn product_group_promotions_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        product_group_promotion_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        ad_group_id: Option<String>,
        ) -> Result<ProductGroupPromotionsSlashListResponse, ApiError>;

    /// Update product group promotions
    async fn product_group_promotions_slash_update(
        &self,
        ad_account_id: String,
        product_group_promotions_update_with_required_body: models::ProductGroupPromotionsUpdateWithRequiredBody,
        ) -> Result<ProductGroupPromotionsSlashUpdateResponse, ApiError>;

    /// Get product group analytics
    async fn product_groups_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        product_group_ids: &'a Vec<models::ProductGroupIdType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<ProductGroupsSlashAnalyticsResponse, ApiError>;

    /// Get a product group promotion by id
    async fn product_group_promotions_slash_get(
        &self,
        ad_account_id: String,
        product_group_promotion_id: String,
        ) -> Result<ProductGroupPromotionsSlashGetResponse, ApiError>;

    /// Add product tags to pin
    async fn product_tags_slash_bulk_add(
        &self,
        pin_id: String,
        product_tags_bulk_add_request: models::ProductTagsBulkAddRequest,
        ) -> Result<ProductTagsSlashBulkAddResponse, ApiError>;

    /// Delete product tags from pin
    async fn product_tags_slash_bulk_delete(
        &self,
        pin_id: String,
        product_tags_bulk_delete_request: models::ProductTagsBulkDeleteRequest,
        ) -> Result<ProductTagsSlashBulkDeleteResponse, ApiError>;

    /// Get product tags for pin
    async fn product_tags_slash_list(
        &self,
        pin_id: String,
        ) -> Result<ProductTagsSlashListResponse, ApiError>;

    /// Create promotions
    async fn promotions_slash_create(
        &self,
        ad_account_id: String,
        promotion_create: models::PromotionCreateBatch,
        ) -> Result<PromotionsSlashCreateResponse, ApiError>;

    /// Get promotions
    async fn promotions_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<PromotionsSlashListResponse, ApiError>;

    /// Update promotions
    async fn promotions_slash_update(
        &self,
        ad_account_id: String,
        promotion_batch_update: models::PromotionUpdateBatch,
        ) -> Result<PromotionsSlashUpdateResponse, ApiError>;

    /// Delete promotion by id
    async fn promotions_slash_delete(
        &self,
        promotion_id: String,
        ad_account_id: String,
        ) -> Result<PromotionsSlashDeleteResponse, ApiError>;

    /// Get promotion by id
    async fn promotions_slash_get(
        &self,
        promotion_id: String,
        ad_account_id: String,
        ) -> Result<PromotionsSlashGetResponse, ApiError>;

    /// Get ad accounts countries
    async fn ad_account_countries_slash_get(
        &self,
        ) -> Result<AdAccountCountriesSlashGetResponse, ApiError>;

    /// Get available metrics' definitions
    async fn delivery_metrics_slash_get(
        &self,
        report_type: Option<models::ReportType>,
        ) -> Result<DeliveryMetricsSlashGetResponse, ApiError>;

    /// Get lead form questions
    async fn lead_form_questions_slash_get(
        &self,
        ) -> Result<LeadFormQuestionsSlashGetResponse, ApiError>;

    /// Get metrics ready state
    async fn metrics_ready_state_slash_get(
        &self,
        date: String,
        ) -> Result<MetricsReadyStateSlashGetResponse, ApiError>;

    /// Get interest details
    async fn interest_targeting_options_slash_get(
        &self,
        interest_id: String,
        ) -> Result<InterestTargetingOptionsSlashGetResponse, ApiError>;

    /// Get targeting options
    async fn targeting_options_slash_get(
        &self,
        targeting_type: models::PublicTargetingType,
        ad_account_id: Option<String>,
        client_id: Option<String>,
        oauth_signature: Option<String>,
        timestamp: Option<String>,
        ) -> Result<TargetingOptionsSlashGetResponse, ApiError>;

    /// Create schedules
    async fn schedules_slash_create<'a>(
        &self,
        ad_account_id: String,
        schedule_create: &'a Vec<models::ScheduleCreate>,
        ) -> Result<SchedulesSlashCreateResponse, ApiError>;

    /// Get Schedules
    async fn schedules_slash_list<'a>(
        &self,
        ad_account_id: String,
        entity_ids: &'a Vec<models::EntityId>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        schedule_statuses: Option<&'a Vec<models::ScheduleStatus>>,
        schedule_type: Option<models::ScheduleType>,
        ) -> Result<SchedulesSlashListResponse, ApiError>;

    /// Update schedules
    async fn schedules_slash_update<'a>(
        &self,
        ad_account_id: String,
        schedule_batch_update: &'a Vec<models::ScheduleBatchUpdate>,
        ) -> Result<SchedulesSlashUpdateResponse, ApiError>;

    /// Search pins by a given search term
    async fn search_partner_pins(
        &self,
        term: String,
        country_code: String,
        bookmark: Option<String>,
        locale: Option<String>,
        limit: Option<u8>,
        ) -> Result<SearchPartnerPinsResponse, ApiError>;

    /// Search user's boards
    async fn search_user_boards_slash_get(
        &self,
        ad_account_id: Option<String>,
        query: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<SearchUserBoardsSlashGetResponse, ApiError>;

    /// Search user's Pins
    async fn search_user_pins_slash_list(
        &self,
        query: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        ) -> Result<SearchUserPinsSlashListResponse, ApiError>;

    /// Create targeting templates
    async fn targeting_template_slash_create(
        &self,
        ad_account_id: String,
        targeting_template_create: models::TargetingTemplateCreate,
        ) -> Result<TargetingTemplateSlashCreateResponse, ApiError>;

    /// List targeting templates
    async fn targeting_template_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        include_sizing: Option<bool>,
        search_query: Option<String>,
        ) -> Result<TargetingTemplateSlashListResponse, ApiError>;

    /// Update targeting templates
    async fn targeting_template_slash_update(
        &self,
        ad_account_id: String,
        targeting_template_update_request_read_or_update: models::TargetingTemplateUpdateRequestReadOrUpdate,
        ) -> Result<TargetingTemplateSlashUpdateResponse, ApiError>;

    /// List related terms
    async fn terms_related_slash_list<'a>(
        &self,
        terms: &'a Vec<String>,
        ) -> Result<TermsRelatedSlashListResponse, ApiError>;

    /// List suggested terms
    async fn terms_suggested_slash_list(
        &self,
        term: String,
        limit: Option<u8>,
        ) -> Result<TermsSuggestedSlashListResponse, ApiError>;

    /// Get terms of service
    async fn terms_of_service_slash_get(
        &self,
        ad_account_id: String,
        include_html: Option<bool>,
        tos_type: Option<String>,
        ) -> Result<TermsOfServiceSlashGetResponse, ApiError>;

    /// Returns editorial articles for a given region
    async fn trends_editorial_articles_slash_list(
        &self,
        region: models::ProductCategoryRegion,
        ) -> Result<TrendsEditorialArticlesSlashListResponse, ApiError>;

    /// Get featured topics
    async fn trends_featured_topics_slash_list(
        &self,
        region: models::ProductCategoryRegion,
        interest: Option<models::InterestsEnum>,
        ) -> Result<TrendsFeaturedTopicsSlashListResponse, ApiError>;

    /// Get product category details
    async fn trends_product_categories_details_slash_list<'a>(
        &self,
        product_categories: &'a Vec<models::ProductCategoryEnum>,
        region: models::ProductCategoryRegion,
        lookback_window: Option<models::ProductCategoryDetailLookbackWindow>,
        engagement_type: Option<models::ProductCategoriesEngagementType>,
        ) -> Result<TrendsProductCategoriesDetailsSlashListResponse, ApiError>;

    /// Get a list of growing Shopping Product Categories
    async fn trends_product_categories_trending_slash_list<'a>(
        &self,
        region: models::ProductCategoryRegion,
        verticals: Option<&'a Vec<models::VerticalProductCategory>>,
        ages: Option<&'a Vec<models::AgeTrendsBucket>>,
        genders: Option<&'a Vec<models::GenderBucket>>,
        engagement_type: Option<models::ProductCategoriesEngagementType>,
        ) -> Result<TrendsProductCategoriesTrendingSlashListResponse, ApiError>;

    /// List following boards
    async fn boards_user_follows_slash_list(
        &self,
        ad_account_id: Option<String>,
        explicit_following: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BoardsUserFollowsSlashListResponse, ApiError>;

    /// List followers
    async fn followers_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<FollowersSlashListResponse, ApiError>;

    /// List linked businesses
    async fn linked_business_accounts_slash_get(
        &self,
        ) -> Result<LinkedBusinessAccountsSlashGetResponse, ApiError>;

    /// Unverify website
    async fn unverify_website_slash_delete(
        &self,
        website: String,
        ) -> Result<UnverifyWebsiteSlashDeleteResponse, ApiError>;

    /// Get user account analytics
    async fn user_account_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&'a Vec<models::QuerymetrictypesItems>>,
        split_field: Option<models::UserAccountAnalyticsSplitFieldParameter>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsResponse, ApiError>;

    /// Get user account top pins analytics
    async fn user_account_slash_analytics_slash_top_pins<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: models::TopPinsSortBy,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&'a Vec<models::QuerymetrictypesItems>>,
        num_of_pins: Option<u8>,
        created_in_last_n_days: Option<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsSlashTopPinsResponse, ApiError>;

    /// Get user account top video pins analytics
    async fn user_account_slash_analytics_slash_top_video_pins<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: models::TopVideoPinsSortBy,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&'a Vec<models::QueryvideopinmetrictypesItems>>,
        num_of_pins: Option<u8>,
        created_in_last_n_days: Option<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsSlashTopVideoPinsResponse, ApiError>;

    /// Get user account
    async fn user_account_slash_get(
        &self,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashGetResponse, ApiError>;

    /// List following
    async fn user_following_slash_get(
        &self,
        ad_account_id: Option<String>,
        explicit_following: Option<bool>,
        feed_type: Option<models::UserFollowingFeedType>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<UserFollowingSlashGetResponse, ApiError>;

    /// Get user websites
    async fn user_websites_slash_get(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<UserWebsitesSlashGetResponse, ApiError>;

    /// Verify website
    async fn verify_website_slash_update(
        &self,
        user_website_create: models::UserWebsiteCreate,
        ad_account_id: Option<String>,
        ) -> Result<VerifyWebsiteSlashUpdateResponse, ApiError>;

    /// Get user verification code for website claiming
    async fn website_verification_slash_get(
        &self,
        ad_account_id: Option<String>,
        ) -> Result<WebsiteVerificationSlashGetResponse, ApiError>;

    /// Follow user
    async fn follow_user_slash_update(
        &self,
        username: String,
        follow_user_create: models::FollowUserCreate,
        ) -> Result<FollowUserSlashUpdateResponse, ApiError>;

    /// List following interests
    async fn user_account_slash_followed_interests(
        &self,
        username: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<UserAccountSlashFollowedInterestsResponse, ApiError>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<C: Send + Sync> where Self: Sized
{
    /// Binds this API to a context.
    fn with_context(self, context: C) -> ContextWrapper<Self, C>;
}

impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ContextWrapperExt<C> for T {
    fn with_context(self: T, context: C) -> ContextWrapper<T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

#[async_trait]
impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ApiNoContext<C> for ContextWrapper<T, C> {
    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    /// Create ad account
    async fn ad_accounts_slash_create(
        &self,
        ad_account_create: models::AdAccountCreate,
        ) -> Result<AdAccountsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_slash_create(ad_account_create, &context).await
    }

    /// List ad accounts
    async fn ad_accounts_slash_list(
        &self,
        include_shared_accounts: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<AdAccountsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_slash_list(include_shared_accounts, bookmark, page_size, &context).await
    }

    /// Get ad account analytics
    async fn ad_account_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<AdAccountSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_account_slash_analytics(start_date, end_date, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, reporting_timezone, &context).await
    }

    /// Get targeting analytics for an ad account
    async fn ad_account_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsAccountTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<AdAccountTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_account_targeting_analytics_slash_get(ad_account_id, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, &context).await
    }

    /// Get ad account
    async fn ad_accounts_slash_get(
        &self,
        ad_account_id: String,
        ) -> Result<AdAccountsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_slash_get(ad_account_id, &context).await
    }

    /// Create a request for a brand, category, SKU report
    async fn analytics_slash_create_conversion_product_report(
        &self,
        ad_account_id: String,
        conversion_product_report_create: models::ConversionProductReportCreate,
        ) -> Result<AnalyticsSlashCreateConversionProductReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().analytics_slash_create_conversion_product_report(ad_account_id, conversion_product_report_create, &context).await
    }

    /// Create a request for a Marketing Mix Modeling (MMM) report
    async fn analytics_slash_create_mmm_report(
        &self,
        ad_account_id: String,
        mmm_report_create: models::MmmReportCreate,
        ) -> Result<AnalyticsSlashCreateMmmReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().analytics_slash_create_mmm_report(ad_account_id, mmm_report_create, &context).await
    }

    /// Create async request for an account analytics report
    async fn analytics_slash_create_report(
        &self,
        ad_account_id: String,
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        ) -> Result<AnalyticsSlashCreateReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().analytics_slash_create_report(ad_account_id, ads_analytics_create_async_request, &context).await
    }

    /// Get advertiser brand, category, SKU report
    async fn analytics_slash_get_conversion_product_report(
        &self,
        ad_account_id: String,
        token: String,
        ) -> Result<AnalyticsSlashGetConversionProductReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().analytics_slash_get_conversion_product_report(ad_account_id, token, &context).await
    }

    /// Get advertiser Marketing Mix Modeling (MMM) report.
    async fn analytics_slash_get_mmm_report(
        &self,
        ad_account_id: String,
        token: String,
        ) -> Result<AnalyticsSlashGetMmmReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().analytics_slash_get_mmm_report(ad_account_id, token, &context).await
    }

    /// Get the account analytics report created by the async call
    async fn analytics_slash_get_report(
        &self,
        ad_account_id: String,
        token: String,
        ) -> Result<AnalyticsSlashGetReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().analytics_slash_get_report(ad_account_id, token, &context).await
    }

    /// Delete ads data for ad account in API Sandbox
    async fn sandbox_slash_delete(
        &self,
        ad_account_id: String,
        ) -> Result<SandboxSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().sandbox_slash_delete(ad_account_id, &context).await
    }

    /// List templates
    async fn templates_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<TemplatesSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().templates_slash_list(ad_account_id, bookmark, page_size, order, &context).await
    }

    /// Create async request for an analytics report using a template
    async fn analytics_slash_create_template_report(
        &self,
        ad_account_id: String,
        template_id: String,
        start_date: Option<chrono::naive::NaiveDate>,
        end_date: Option<chrono::naive::NaiveDate>,
        granularity: Option<models::Granularity>,
        ) -> Result<AnalyticsSlashCreateTemplateReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().analytics_slash_create_template_report(ad_account_id, template_id, start_date, end_date, granularity, &context).await
    }

    /// Get bid floors
    async fn ad_groups_bid_floor_slash_get(
        &self,
        ad_account_id: String,
        bid_floor_create: models::BidFloorCreate,
        ) -> Result<AdGroupsBidFloorSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_bid_floor_slash_get(ad_account_id, bid_floor_create, &context).await
    }

    /// Get ad group analytics
    async fn ad_groups_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        aggregate_report_rows: Option<bool>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<AdGroupsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_analytics(start_date, end_date, ad_group_ids, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, aggregate_report_rows, reporting_timezone, &context).await
    }

    /// Get audience sizing
    async fn ad_groups_slash_audience_sizing(
        &self,
        ad_account_id: String,
        ad_group_audience_sizing_create: models::AdGroupAudienceSizingCreate,
        ) -> Result<AdGroupsSlashAudienceSizingResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_audience_sizing(ad_account_id, ad_group_audience_sizing_create, &context).await
    }

    /// Create ad groups
    async fn ad_groups_slash_create(
        &self,
        ad_account_id: String,
        ad_group_create_create: models::AdGroupBatchCreateRequest,
        ) -> Result<AdGroupsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_create(ad_account_id, ad_group_create_create, &context).await
    }

    /// List ad groups
    async fn ad_groups_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        ad_group_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        translate_interests_to_names: Option<bool>,
        ) -> Result<AdGroupsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_list(ad_account_id, bookmark, page_size, order, campaign_ids, ad_group_ids, entity_statuses, translate_interests_to_names, &context).await
    }

    /// Update ad groups
    async fn ad_groups_slash_update(
        &self,
        ad_account_id: String,
        ad_group_update_batch_update: models::AdGroupBatchUpdateRequest,
        ) -> Result<AdGroupsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_update(ad_account_id, ad_group_update_batch_update, &context).await
    }

    /// Get targeting analytics for ad groups
    async fn ad_groups_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsAdGroupTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        sort_columns: Option<&'a Vec<String>>,
        sort_ascending: Option<bool>,
        ) -> Result<AdGroupsTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_targeting_analytics_slash_get(ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, sort_columns, sort_ascending, &context).await
    }

    /// List of ad groups using promotions IDs.
    async fn get_ad_groups_by_promotion_ids_slash_list<'a>(
        &self,
        ad_account_id: String,
        promotion_ids: &'a Vec<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<GetAdGroupsByPromotionIdsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_ad_groups_by_promotion_ids_slash_list(ad_account_id, promotion_ids, bookmark, page_size, order, &context).await
    }

    /// Get dynamic titles CSV download URL
    async fn ad_groups_dynamic_titles_slash_download_csv(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        ) -> Result<AdGroupsDynamicTitlesSlashDownloadCsvResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_dynamic_titles_slash_download_csv(ad_account_id, ad_group_id, &context).await
    }

    /// Get dynamic titles status
    async fn ad_groups_dynamic_titles_slash_get_status(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        ) -> Result<AdGroupsDynamicTitlesSlashGetStatusResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_dynamic_titles_slash_get_status(ad_account_id, ad_group_id, &context).await
    }

    /// Get dynamic titles upload URL
    async fn ad_groups_dynamic_titles_slash_get_upload_url(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        ) -> Result<AdGroupsDynamicTitlesSlashGetUploadUrlResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_dynamic_titles_slash_get_upload_url(ad_account_id, ad_group_id, &context).await
    }

    /// Process dynamic titles CSV
    async fn ad_groups_dynamic_titles_slash_process_csv(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        dynamic_titles_process_csv_create: models::DynamicTitlesProcessCsvCreate,
        ) -> Result<AdGroupsDynamicTitlesSlashProcessCsvResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_dynamic_titles_slash_process_csv(ad_account_id, ad_group_id, dynamic_titles_process_csv_create, &context).await
    }

    /// Get ad group
    async fn ad_groups_slash_get(
        &self,
        ad_group_id: String,
        ad_account_id: String,
        ) -> Result<AdGroupsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_get(ad_group_id, ad_account_id, &context).await
    }

    /// Create ad preview with pin or image
    async fn ad_previews_slash_create(
        &self,
        ad_account_id: String,
        ad_preview_request: models::AdPreviewRequest,
        ) -> Result<AdPreviewsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_previews_slash_create(ad_account_id, ad_preview_request, &context).await
    }

    /// Get targeting analytics for ads
    async fn ad_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        ad_ids: &'a Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsAdTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::ConversionAttributionWindowDays>,
        engagement_window_days: Option<models::ConversionAttributionWindowDays>,
        view_window_days: Option<models::ConversionAttributionWindowDays>,
        conversion_report_time: Option<models::ConversionReportTimeType>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        sort_columns: Option<&'a Vec<String>>,
        sort_ascending: Option<bool>,
        ) -> Result<AdTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_targeting_analytics_slash_get(ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, sort_columns, sort_ascending, &context).await
    }

    /// Get ad analytics
    async fn ads_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        pin_ids: Option<&'a Vec<String>>,
        ad_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<AdsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_slash_analytics(start_date, end_date, columns, granularity, ad_account_id, pin_ids, ad_ids, click_window_days, engagement_window_days, view_window_days, conversion_report_time, campaign_ids, reporting_timezone, &context).await
    }

    /// Create ads
    async fn ads_slash_create(
        &self,
        ad_account_id: String,
        ad_create: models::AdBatchCreateRequest,
        ) -> Result<AdsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_slash_create(ad_account_id, ad_create, &context).await
    }

    /// List ads
    async fn ads_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        ad_group_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        ad_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        ) -> Result<AdsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_slash_list(ad_account_id, bookmark, page_size, order, campaign_ids, ad_group_ids, ad_ids, entity_statuses, &context).await
    }

    /// Update ads
    async fn ads_slash_update(
        &self,
        ad_account_id: String,
        ad_batch_update: models::AdBatchUpdateRequest,
        ) -> Result<AdsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_slash_update(ad_account_id, ad_batch_update, &context).await
    }

    /// Create ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_create<'a>(
        &self,
        ad_account_id: String,
        campaign_ad_preview_create: &'a Vec<models::CampaignAdPreviewCreate>,
        ) -> Result<CampaignAdPreviewSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaign_ad_preview_slash_create(ad_account_id, campaign_ad_preview_create, &context).await
    }

    /// Delete ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_delete<'a>(
        &self,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        ad_account_id: String,
        ) -> Result<CampaignAdPreviewSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaign_ad_preview_slash_delete(ad_group_ids, ad_account_id, &context).await
    }

    /// Fetch ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_read<'a>(
        &self,
        ad_group_ids: &'a Vec<models::AdGroupIdType>,
        ad_account_id: String,
        ) -> Result<CampaignAdPreviewSlashReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaign_ad_preview_slash_read(ad_group_ids, ad_account_id, &context).await
    }

    /// Get ad
    async fn ads_slash_get(
        &self,
        ad_id: String,
        ad_account_id: String,
        ) -> Result<AdsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_slash_get(ad_id, ad_account_id, &context).await
    }

    /// Get item bid options (POST)
    async fn advanced_auction_items_get_slash_post(
        &self,
        advanced_auction_items_get_request: models::AdvancedAuctionItemsGetRequest,
        ad_account_id: Option<String>,
        ) -> Result<AdvancedAuctionItemsGetSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().advanced_auction_items_get_slash_post(advanced_auction_items_get_request, ad_account_id, &context).await
    }

    /// Operate on item level bid options
    async fn advanced_auction_items_submit_slash_post(
        &self,
        advanced_auction_items_submit_request: models::AdvancedAuctionItemsSubmitRequest,
        ad_account_id: Option<String>,
        ) -> Result<AdvancedAuctionItemsSubmitSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().advanced_auction_items_submit_slash_post(advanced_auction_items_submit_request, ad_account_id, &context).await
    }

    /// Get audience insights scope and type
    async fn audience_insights_scope_and_type_slash_get(
        &self,
        ad_account_id: String,
        ) -> Result<AudienceInsightsScopeAndTypeSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().audience_insights_scope_and_type_slash_get(ad_account_id, &context).await
    }

    /// Get audience insights
    async fn audience_insights_slash_get(
        &self,
        ad_account_id: String,
        audience_insight_type: models::AudienceInsightType,
        ) -> Result<AudienceInsightsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().audience_insights_slash_get(ad_account_id, audience_insight_type, &context).await
    }

    /// List accounts with access to an audience owned by an ad account
    async fn ad_accounts_audiences_shared_accounts_slash_list(
        &self,
        audience_id: String,
        account_type: models::AudienceAccountType,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<AdAccountsAudiencesSharedAccountsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_audiences_shared_accounts_slash_list(audience_id, account_type, ad_account_id, bookmark, page_size, &context).await
    }

    /// List accounts with access to an audience owned by a business
    async fn business_account_audiences_shared_accounts_slash_list(
        &self,
        business_id: String,
        audience_id: String,
        account_type: models::AudienceAccountType,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessAccountAudiencesSharedAccountsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().business_account_audiences_shared_accounts_slash_list(business_id, audience_id, account_type, bookmark, page_size, &context).await
    }

    /// List received audiences for a business
    async fn shared_audiences_for_business_slash_list(
        &self,
        business_id: String,
        order: Option<models::Order>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<SharedAudiencesForBusinessSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().shared_audiences_for_business_slash_list(business_id, order, bookmark, page_size, &context).await
    }

    /// Update audience sharing between ad accounts
    async fn update_ad_account_to_ad_account_shared_audience(
        &self,
        ad_account_id: String,
        ad_account_to_ad_account_shared_audience_update_with_required_body: models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody,
        ) -> Result<UpdateAdAccountToAdAccountSharedAudienceResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_ad_account_to_ad_account_shared_audience(ad_account_id, ad_account_to_ad_account_shared_audience_update_with_required_body, &context).await
    }

    /// Update audience sharing from an ad account to businesses
    async fn update_ad_account_to_business_shared_audience(
        &self,
        ad_account_id: String,
        ad_account_to_business_shared_audience_update_with_required_body: models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody,
        ) -> Result<UpdateAdAccountToBusinessSharedAudienceResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_ad_account_to_business_shared_audience(ad_account_id, ad_account_to_business_shared_audience_update_with_required_body, &context).await
    }

    /// Update audience sharing from a business to ad accounts
    async fn update_business_to_ad_account_shared_audience(
        &self,
        business_id: String,
        business_to_ad_account_shared_audience_update_with_required_body: models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody,
        ) -> Result<UpdateBusinessToAdAccountSharedAudienceResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_business_to_ad_account_shared_audience(business_id, business_to_ad_account_shared_audience_update_with_required_body, &context).await
    }

    /// Update audience sharing between businesses
    async fn update_business_to_business_shared_audience(
        &self,
        business_id: String,
        business_to_business_shared_audience_update_with_required_body: models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody,
        ) -> Result<UpdateBusinessToBusinessSharedAudienceResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_business_to_business_shared_audience(business_id, business_to_business_shared_audience_update_with_required_body, &context).await
    }

    /// Create audience
    async fn audiences_slash_create(
        &self,
        ad_account_id: String,
        ad_accounts_audience_create: models::AdAccountsAudienceCreate,
        ) -> Result<AudiencesSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().audiences_slash_create(ad_account_id, ad_accounts_audience_create, &context).await
    }

    /// List audiences
    async fn audiences_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ownership_type: Option<models::AudienceOwnershipType>,
        exclude_nca: Option<bool>,
        ) -> Result<AudiencesSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().audiences_slash_list(ad_account_id, bookmark, page_size, order, ownership_type, exclude_nca, &context).await
    }

    /// Get audience
    async fn audiences_slash_get(
        &self,
        audience_id: String,
        ad_account_id: String,
        ) -> Result<AudiencesSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().audiences_slash_get(audience_id, ad_account_id, &context).await
    }

    /// Update audience
    async fn audiences_slash_update(
        &self,
        audience_id: String,
        ad_account_id: String,
        ad_accounts_audience_update: models::AdAccountsAudienceUpdate,
        ) -> Result<AudiencesSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().audiences_slash_update(audience_id, ad_account_id, ad_accounts_audience_update, &context).await
    }

    /// Redeem ad credits
    async fn ads_credit_slash_redeem(
        &self,
        ad_account_id: String,
        ads_credit_redeem_create: models::AdsCreditRedeemCreate,
        ) -> Result<AdsCreditSlashRedeemResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_credit_slash_redeem(ad_account_id, ads_credit_redeem_create, &context).await
    }

    /// Get ads credit discounts
    async fn ads_credits_discounts_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<AdsCreditsDiscountsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_credits_discounts_slash_get(ad_account_id, bookmark, page_size, &context).await
    }

    /// Get billing invoices
    async fn billing_invoices_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        sort: Option<models::BillingInvoiceSortField>,
        status: Option<models::BillingInvoiceStatus>,
        document_type: Option<models::BillingInvoiceDocumentType>,
        start_due_date: Option<chrono::naive::NaiveDate>,
        end_due_date: Option<chrono::naive::NaiveDate>,
        ) -> Result<BillingInvoicesSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().billing_invoices_slash_get(ad_account_id, bookmark, page_size, order, sort, status, document_type, start_due_date, end_due_date, &context).await
    }

    /// Get billing profiles
    async fn billing_profiles_slash_get(
        &self,
        is_active: bool,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BillingProfilesSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().billing_profiles_slash_get(is_active, ad_account_id, bookmark, page_size, &context).await
    }

    /// Get Salesforce account details including bill-to information.
    async fn ssio_accounts_slash_get(
        &self,
        ad_account_id: String,
        ) -> Result<SsioAccountsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ssio_accounts_slash_get(ad_account_id, &context).await
    }

    /// Create insertion order through SSIO.
    async fn ssio_insertion_order_slash_create(
        &self,
        ad_account_id: String,
        ssio_insertion_order_create: models::SsioInsertionOrderCreate,
        ) -> Result<SsioInsertionOrderSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ssio_insertion_order_slash_create(ad_account_id, ssio_insertion_order_create, &context).await
    }

    /// Edit insertion order through SSIO.
    async fn ssio_insertion_order_slash_edit(
        &self,
        ad_account_id: String,
        ssio_insertion_order_update: models::SsioInsertionOrderUpdate,
        ) -> Result<SsioInsertionOrderSlashEditResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ssio_insertion_order_slash_edit(ad_account_id, ssio_insertion_order_update, &context).await
    }

    /// Get insertion order status by ad account id.
    async fn ssio_insertion_orders_status_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<SsioInsertionOrdersStatusSlashGetByAdAccountResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ssio_insertion_orders_status_slash_get_by_ad_account(ad_account_id, bookmark, page_size, &context).await
    }

    /// Get Salesforce order lines by ad account id.
    async fn ssio_order_lines_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        pin_order_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<SsioOrderLinesSlashGetByAdAccountResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ssio_order_lines_slash_get_by_ad_account(ad_account_id, pin_order_id, bookmark, page_size, &context).await
    }

    /// Get download url for a billing invoice
    async fn billing_invoice_download_slash_get(
        &self,
        ad_account_id: String,
        billing_invoice_id: String,
        ) -> Result<BillingInvoiceDownloadSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().billing_invoice_download_slash_get(ad_account_id, billing_invoice_id, &context).await
    }

    /// Get insertion order status by pin order id.
    async fn ssio_insertion_orders_status_slash_get_by_pin_order_id(
        &self,
        ad_account_id: String,
        pin_order_id: String,
        ) -> Result<SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ssio_insertion_orders_status_slash_get_by_pin_order_id(ad_account_id, pin_order_id, &context).await
    }

    /// Create board
    async fn boards_slash_create(
        &self,
        board_create: models::BoardCreate,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_slash_create(board_create, ad_account_id, &context).await
    }

    /// List boards
    async fn boards_slash_list(
        &self,
        ad_account_id: Option<String>,
        privacy: Option<models::BoardPrivacyFilter>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BoardsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_slash_list(ad_account_id, privacy, bookmark, page_size, &context).await
    }

    /// Create board section
    async fn board_sections_slash_create(
        &self,
        board_id: String,
        board_section_create: models::BoardSectionCreate,
        ad_account_id: Option<String>,
        ) -> Result<BoardSectionsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_slash_create(board_id, board_section_create, ad_account_id, &context).await
    }

    /// List board sections
    async fn board_sections_slash_list(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BoardSectionsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_slash_list(board_id, ad_account_id, bookmark, page_size, &context).await
    }

    /// Delete board
    async fn boards_slash_delete(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_slash_delete(board_id, ad_account_id, &context).await
    }

    /// Get board
    async fn boards_slash_get(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_slash_get(board_id, ad_account_id, &context).await
    }

    /// List Pins on board
    async fn boards_slash_list_pins<'a>(
        &self,
        board_id: String,
        creative_types: Option<&'a Vec<models::CreativeType>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BoardsSlashListPinsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_slash_list_pins(board_id, creative_types, ad_account_id, pin_metrics, bookmark, page_size, &context).await
    }

    /// Update board
    async fn boards_slash_update(
        &self,
        board_id: String,
        board_with_update_privacy_update: models::BoardWithUpdatePrivacyUpdate,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_slash_update(board_id, board_with_update_privacy_update, ad_account_id, &context).await
    }

    /// Delete board section
    async fn board_sections_slash_delete(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        ) -> Result<BoardSectionsSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_slash_delete(board_id, section_id, ad_account_id, &context).await
    }

    /// List Pins on board section
    async fn board_sections_slash_list_pins(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BoardSectionsSlashListPinsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_slash_list_pins(board_id, section_id, ad_account_id, bookmark, page_size, &context).await
    }

    /// Update board section
    async fn board_sections_slash_update(
        &self,
        board_id: String,
        section_id: String,
        board_section_update_with_required_body: models::BoardSectionUpdateWithRequiredBody,
        ad_account_id: Option<String>,
        ) -> Result<BoardSectionsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_slash_update(board_id, section_id, board_section_update_with_required_body, ad_account_id, &context).await
    }

    /// Get advertiser entities in bulk
    async fn bulk_download_slash_create(
        &self,
        ad_account_id: String,
        bulk_download_create: models::BulkDownloadCreate,
        ) -> Result<BulkDownloadSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().bulk_download_slash_create(ad_account_id, bulk_download_create, &context).await
    }

    /// Create/update ad entities in bulk
    async fn bulk_upsert_slash_create(
        &self,
        ad_account_id: String,
        bulk_upsert_request: models::BulkUpsertRequest,
        ) -> Result<BulkUpsertSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().bulk_upsert_slash_create(ad_account_id, bulk_upsert_request, &context).await
    }

    /// Download advertiser entities in bulk
    async fn bulk_request_slash_get(
        &self,
        ad_account_id: String,
        bulk_request_id: String,
        include_details: Option<bool>,
        ) -> Result<BulkRequestSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().bulk_request_slash_get(ad_account_id, bulk_request_id, include_details, &context).await
    }

    /// Create a new asset group.
    async fn asset_group_slash_create(
        &self,
        business_id: String,
        asset_group_input_create: models::AssetGroupInputCreate,
        ) -> Result<AssetGroupSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().asset_group_slash_create(business_id, asset_group_input_create, &context).await
    }

    /// Delete asset groups.
    async fn asset_group_slash_delete(
        &self,
        business_id: String,
        asset_group_deletion_delete: models::AssetGroupDeletionDelete,
        ) -> Result<AssetGroupSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().asset_group_slash_delete(business_id, asset_group_deletion_delete, &context).await
    }

    /// Update asset groups.
    async fn asset_group_slash_update(
        &self,
        business_id: String,
        asset_group_modification_read_or_update: models::AssetGroupModificationReadOrUpdate,
        ) -> Result<AssetGroupSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().asset_group_slash_update(business_id, asset_group_modification_read_or_update, &context).await
    }

    /// List business assets
    async fn business_assets_slash_get<'a>(
        &self,
        business_id: String,
        permissions: Option<&'a Vec<models::PermissionsWithOwner>>,
        child_asset_id: Option<String>,
        asset_group_id: Option<String>,
        asset_type: Option<models::BusinessAssetsGetAssetTypeParameter>,
        start_index: Option<u32>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessAssetsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().business_assets_slash_get(business_id, permissions, child_asset_id, asset_group_id, asset_type, start_index, bookmark, page_size, &context).await
    }

    /// Delete member access to asset
    async fn business_members_asset_access_slash_delete(
        &self,
        business_id: String,
        business_members_asset_access_delete_body: models::BusinessMembersAssetAccessDeleteBody,
        ) -> Result<BusinessMembersAssetAccessSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().business_members_asset_access_slash_delete(business_id, business_members_asset_access_delete_body, &context).await
    }

    /// Assign/Update member asset permissions
    async fn business_members_asset_access_slash_update(
        &self,
        business_id: String,
        update_member_asset_access_body: models::UpdateMemberAssetAccessBody,
        ) -> Result<BusinessMembersAssetAccessSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().business_members_asset_access_slash_update(business_id, update_member_asset_access_body, &context).await
    }

    /// Delete partner access to asset
    async fn delete_partner_asset_access_handler_impl(
        &self,
        business_id: String,
        delete_partner_asset_access_body: models::DeletePartnerAssetAccessBody,
        ) -> Result<DeletePartnerAssetAccessHandlerImplResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_partner_asset_access_handler_impl(business_id, delete_partner_asset_access_body, &context).await
    }

    /// Assign/Update partner asset permissions
    async fn update_partner_asset_access_handler_impl(
        &self,
        business_id: String,
        update_partner_asset_access_body: models::UpdatePartnerAssetAccessBody,
        ) -> Result<UpdatePartnerAssetAccessHandlerImplResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_partner_asset_access_handler_impl(business_id, update_partner_asset_access_body, &context).await
    }

    /// Get members with access to asset
    async fn business_asset_members_slash_get(
        &self,
        business_id: String,
        asset_id: String,
        start_index: Option<u32>,
        fetch_system_users: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessAssetMembersSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().business_asset_members_slash_get(business_id, asset_id, start_index, fetch_system_users, bookmark, page_size, &context).await
    }

    /// Get partners with access to asset
    async fn business_asset_partners_slash_get(
        &self,
        business_id: String,
        asset_id: String,
        start_index: Option<u32>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessAssetPartnersSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().business_asset_partners_slash_get(business_id, asset_id, start_index, bookmark, page_size, &context).await
    }

    /// Get assets assigned to a member
    async fn business_member_assets_slash_get<'a>(
        &self,
        business_id: String,
        member_id: String,
        asset_type: Option<models::BusinessMemberAssetsGetAssetTypeParameter>,
        start_index: Option<u32>,
        sort_by: Option<models::AssetSortBy>,
        sort_ascending: Option<bool>,
        search_by: Option<models::AssetSearchBy>,
        search_value: Option<String>,
        asset_permission_type: Option<models::AssetPermissionType>,
        ad_account_statuses: Option<&'a Vec<models::NonDraftEntityStatus>>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessMemberAssetsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().business_member_assets_slash_get(business_id, member_id, asset_type, start_index, sort_by, sort_ascending, search_by, search_value, asset_permission_type, ad_account_statuses, bookmark, page_size, &context).await
    }

    /// Get assets assigned to a partner or assets assigned by a partner
    async fn business_partner_asset_access_slash_get(
        &self,
        business_id: String,
        partner_id: String,
        partner_type: Option<models::BusinessPartnerAssetAccessGetPartnerTypeParameter>,
        asset_type: Option<models::BusinessPartnerAssetAccessGetAssetTypeParameter>,
        start_index: Option<u32>,
        sort_by: Option<models::AssetSortBy>,
        sort_ascending: Option<bool>,
        search_by: Option<models::AssetSearchBy>,
        search_value: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BusinessPartnerAssetAccessSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().business_partner_asset_access_slash_get(business_id, partner_id, partner_type, asset_type, start_index, sort_by, sort_ascending, search_by, search_value, bookmark, page_size, &context).await
    }

    /// Accept or decline an invite/request
    async fn respond_business_access_invites(
        &self,
        auth_respond_invites_body: models::AuthRespondInvitesBody,
        ) -> Result<RespondBusinessAccessInvitesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().respond_business_access_invites(auth_respond_invites_body, &context).await
    }

    /// Create a request to access an existing partner's assets.
    async fn asset_access_requests_slash_create(
        &self,
        business_id: String,
        create_asset_access_request_body: models::CreateAssetAccessRequestBody,
        ) -> Result<AssetAccessRequestsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().asset_access_requests_slash_create(business_id, create_asset_access_request_body, &context).await
    }

    /// Cancel invites/requests
    async fn cancel_invites_or_requests(
        &self,
        business_id: String,
        cancel_invites_request: models::CancelInvitesRequest,
        ) -> Result<CancelInvitesOrRequestsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().cancel_invites_or_requests(business_id, cancel_invites_request, &context).await
    }

    /// Update invite/request with an asset permission
    async fn create_asset_invites(
        &self,
        business_id: String,
        create_asset_invites_request: models::CreateAssetInvitesRequest,
        ) -> Result<CreateAssetInvitesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_asset_invites(business_id, create_asset_invites_request, &context).await
    }

    /// Create invites or requests
    async fn create_membership_or_partnership_invites(
        &self,
        business_id: String,
        create_membership_or_partnership_invites_body: models::CreateMembershipOrPartnershipInvitesBody,
        ) -> Result<CreateMembershipOrPartnershipInvitesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_membership_or_partnership_invites(business_id, create_membership_or_partnership_invites_body, &context).await
    }

    /// Get invites/requests
    async fn get_slash_invites<'a>(
        &self,
        business_id: String,
        is_member: Option<bool>,
        invite_status: Option<&'a Vec<models::InviteFilterStatus>>,
        invite_type: Option<models::InviteType>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<GetSlashInvitesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_slash_invites(business_id, is_member, invite_status, invite_type, bookmark, page_size, &context).await
    }

    /// List business employers for user
    async fn get_slash_business_employers(
        &self,
        assets_summary: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<GetSlashBusinessEmployersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_slash_business_employers(assets_summary, bookmark, page_size, &context).await
    }

    /// Create a Brand Account
    async fn brand_accounts_slash_create(
        &self,
        business_hierarchy_id: String,
        brand_account_create: models::BrandAccountCreate,
        ) -> Result<BrandAccountsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().brand_accounts_slash_create(business_hierarchy_id, brand_account_create, &context).await
    }

    /// Terminate business memberships
    async fn delete_business_membership(
        &self,
        business_id: String,
        delete_business_membership_body: models::DeleteBusinessMembershipBody,
        ) -> Result<DeleteBusinessMembershipResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_business_membership(business_id, delete_business_membership_body, &context).await
    }

    /// Terminate business partnerships
    async fn delete_business_partners(
        &self,
        business_id: String,
        delete_business_partners_delete: models::DeleteBusinessPartnersDelete,
        ) -> Result<DeleteBusinessPartnersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_business_partners(business_id, delete_business_partners_delete, &context).await
    }

    /// Get business members
    async fn get_slash_business_members<'a>(
        &self,
        business_id: String,
        fetch_system_users: Option<bool>,
        assets_summary: Option<bool>,
        business_roles: Option<&'a Vec<models::MemberBusinessRole>>,
        member_ids: Option<String>,
        start_index: Option<u32>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<GetSlashBusinessMembersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_slash_business_members(business_id, fetch_system_users, assets_summary, business_roles, member_ids, start_index, bookmark, page_size, &context).await
    }

    /// Get business partners
    async fn get_slash_business_partners(
        &self,
        business_id: String,
        assets_summary: Option<bool>,
        partner_type: Option<models::PartnerType>,
        partner_ids: Option<String>,
        start_index: Option<u32>,
        sort_ascending: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<GetSlashBusinessPartnersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_slash_business_partners(business_id, assets_summary, partner_type, partner_ids, start_index, sort_ascending, bookmark, page_size, &context).await
    }

    /// Update member's business role
    async fn update_slash_business_memberships(
        &self,
        business_id: String,
        business_membership_member: models::UpdateBusinessMembershipsBody,
        ) -> Result<UpdateSlashBusinessMembershipsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_slash_business_memberships(business_id, business_membership_member, &context).await
    }

    /// Update a Brand Account
    async fn brand_accounts_slash_update(
        &self,
        brand_account_id: String,
        business_hierarchy_id: String,
        brand_account_update: models::BrandAccountUpdate,
        ) -> Result<BrandAccountsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().brand_accounts_slash_update(brand_account_id, business_hierarchy_id, brand_account_update, &context).await
    }

    /// Update a system user information.
    async fn system_user_slash_update(
        &self,
        business_id: String,
        system_user_id: String,
        system_user_update_with_required_body: models::SystemUserUpdateWithRequiredBody,
        ) -> Result<SystemUserSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().system_user_slash_update(business_id, system_user_id, system_user_update_with_required_body, &context).await
    }

    /// Get pins analytics
    async fn ad_pins_slash_analytics<'a>(
        &self,
        campaign_id: String,
        pin_ids: &'a Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        ) -> Result<AdPinsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_pins_slash_analytics(campaign_id, pin_ids, start_date, end_date, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, &context).await
    }

    /// Get targeting analytics for campaigns
    async fn campaign_targeting_analytics_slash_get<'a>(
        &self,
        ad_account_id: String,
        campaign_ids: &'a Vec<models::CampaignIdRequiredType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &'a Vec<models::AdsAnalyticsCampaignTargetingType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&'a Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<CampaignTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaign_targeting_analytics_slash_get(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, &context).await
    }

    /// Get campaign analytics
    async fn campaigns_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        campaign_ids: &'a Vec<models::CampaignIdRequiredType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        aggregate_report_rows: Option<bool>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<CampaignsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_slash_analytics(start_date, end_date, campaign_ids, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, aggregate_report_rows, reporting_timezone, &context).await
    }

    /// Create campaigns
    async fn campaigns_slash_create(
        &self,
        ad_account_id: String,
        campaign_create_item: models::CampaignBatchCreateRequest,
        ) -> Result<CampaignsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_slash_create(ad_account_id, campaign_create_item, &context).await
    }

    /// List campaigns
    async fn campaigns_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        ) -> Result<CampaignsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_slash_list(ad_account_id, bookmark, page_size, order, campaign_ids, entity_statuses, &context).await
    }

    /// Update campaigns
    async fn campaigns_slash_update(
        &self,
        ad_account_id: String,
        campaign_batch_update_item: models::CampaignBatchUpdateRequest,
        ) -> Result<CampaignsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_slash_update(ad_account_id, campaign_batch_update_item, &context).await
    }

    /// Get campaign delivery estimates
    async fn get_campaign_delivery_estimates(
        &self,
        ad_account_id: String,
        campaign_delivery_estimates_campaign: models::CampaignDeliveryEstimatesCampaignRequest,
        ) -> Result<GetCampaignDeliveryEstimatesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_campaign_delivery_estimates(ad_account_id, campaign_delivery_estimates_campaign, &context).await
    }

    /// Get campaign
    async fn campaigns_slash_get(
        &self,
        campaign_id: String,
        ad_account_id: String,
        ) -> Result<CampaignsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_slash_get(campaign_id, ad_account_id, &context).await
    }

    /// Create feed
    async fn feeds_slash_create(
        &self,
        catalogs_feed_create_request_schema: models::CatalogsFeedCreateRequestSchema,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_slash_create(catalogs_feed_create_request_schema, ad_account_id, &context).await
    }

    /// List feeds
    async fn feeds_slash_list(
        &self,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<FeedsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_slash_list(catalog_id, ad_account_id, bookmark, page_size, &context).await
    }

    /// List feed processing results
    async fn feed_processing_results_slash_list(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<FeedProcessingResultsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feed_processing_results_slash_list(feed_id, ad_account_id, bookmark, page_size, &context).await
    }

    /// Delete feed
    async fn feeds_slash_delete(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_slash_delete(feed_id, ad_account_id, &context).await
    }

    /// Get feed
    async fn feeds_slash_get(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_slash_get(feed_id, ad_account_id, &context).await
    }

    /// Ingest feed items
    async fn feeds_slash_ingest(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashIngestResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_slash_ingest(feed_id, ad_account_id, &context).await
    }

    /// Update feed
    async fn feeds_slash_update(
        &self,
        feed_id: String,
        catalogs_feed_update_request_schema: models::CatalogsFeedUpdateRequestSchema,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_slash_update(feed_id, catalogs_feed_update_request_schema, ad_account_id, &context).await
    }

    /// List item issues
    async fn items_issues_slash_list<'a>(
        &self,
        processing_result_id: String,
        item_numbers: Option<&'a Vec<i32>>,
        item_validation_issue: Option<models::CatalogsItemValidationIssue>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<ItemsIssuesSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().items_issues_slash_list(processing_result_id, item_numbers, item_validation_issue, ad_account_id, bookmark, page_size, &context).await
    }

    /// Operate on item batch
    async fn items_batch_slash_post(
        &self,
        catalogs_items_batch_post_request: models::CatalogsItemsBatchPostRequest,
        ad_account_id: Option<String>,
        ) -> Result<ItemsBatchSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().items_batch_slash_post(catalogs_items_batch_post_request, ad_account_id, &context).await
    }

    /// Get catalogs items (POST)
    async fn items_slash_post(
        &self,
        catalogs_items_request: models::CatalogsItemsRequest,
        ad_account_id: Option<String>,
        ) -> Result<ItemsSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().items_slash_post(catalogs_items_request, ad_account_id, &context).await
    }

    /// Get item batch status
    async fn items_batch_slash_get(
        &self,
        batch_id: String,
        ad_account_id: Option<String>,
        ) -> Result<ItemsBatchSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().items_batch_slash_get(batch_id, ad_account_id, &context).await
    }

    /// Create product group
    async fn catalogs_product_groups_slash_create(
        &self,
        catalogs_product_groups_create_request_schema: models::CatalogsProductGroupsCreateRequestSchema,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_create(catalogs_product_groups_create_request_schema, ad_account_id, &context).await
    }

    /// Create product groups
    async fn catalogs_product_groups_slash_create_many(
        &self,
        catalogs_product_groups_create_many_request_items: models::CatalogsProductGroupsCreateManyRequestSchema,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashCreateManyResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_create_many(catalogs_product_groups_create_many_request_items, ad_account_id, &context).await
    }

    /// Delete product groups
    async fn catalogs_product_groups_slash_delete_many<'a>(
        &self,
        id: &'a Vec<i32>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashDeleteManyResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_delete_many(id, ad_account_id, &context).await
    }

    /// List product groups
    async fn catalogs_product_groups_slash_list<'a>(
        &self,
        id: Option<&'a Vec<i32>>,
        feed_id: Option<String>,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<CatalogsProductGroupsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_list(id, feed_id, catalog_id, ad_account_id, bookmark, page_size, &context).await
    }

    /// List products by filter
    async fn products_by_product_group_filter_slash_list(
        &self,
        catalogs_list_products_by_filter_request: models::CatalogsListProductsByFilterRequest,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        ) -> Result<ProductsByProductGroupFilterSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().products_by_product_group_filter_slash_list(catalogs_list_products_by_filter_request, bookmark, page_size, ad_account_id, pin_metrics, &context).await
    }

    /// List products by product group
    async fn catalogs_product_group_pins_slash_list(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<CatalogsProductGroupPinsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_group_pins_slash_list(product_group_id, ad_account_id, pin_metrics, bookmark, page_size, &context).await
    }

    /// Delete product group
    async fn catalogs_product_groups_slash_delete(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_delete(product_group_id, ad_account_id, &context).await
    }

    /// Get product group
    async fn catalogs_product_groups_slash_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_get(product_group_id, ad_account_id, &context).await
    }

    /// Get product counts
    async fn catalogs_product_groups_slash_product_counts_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_product_counts_get(product_group_id, ad_account_id, &context).await
    }

    /// Update single product group
    async fn catalogs_product_groups_slash_update(
        &self,
        product_group_id: String,
        catalogs_product_groups_update_request_schema: models::CatalogsProductGroupsUpdateRequestSchema,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_update(product_group_id, catalogs_product_groups_update_request_schema, ad_account_id, &context).await
    }

    /// Build catalogs report
    async fn reports_slash_create(
        &self,
        catalogs_report_parameters: models::CatalogsReportParameters,
        ad_account_id: Option<String>,
        ) -> Result<ReportsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().reports_slash_create(catalogs_report_parameters, ad_account_id, &context).await
    }

    /// Get catalogs report
    async fn reports_slash_get(
        &self,
        token: String,
        ad_account_id: Option<String>,
        ) -> Result<ReportsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().reports_slash_get(token, ad_account_id, &context).await
    }

    /// List report stats
    async fn reports_slash_stats(
        &self,
        parameters: models::CatalogsReportStatsParameters,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<ReportsSlashStatsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().reports_slash_stats(parameters, ad_account_id, bookmark, page_size, &context).await
    }

    /// Operate on local inventory item batch
    async fn catalogs_local_inventory_items_batch_slash_operate(
        &self,
        catalog_id: String,
        local_inventory_items_batch_create: models::LocalInventoryItemsBatchCreate,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsLocalInventoryItemsBatchSlashOperateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_local_inventory_items_batch_slash_operate(catalog_id, local_inventory_items_batch_create, ad_account_id, &context).await
    }

    /// Get local inventory items (POST)
    async fn catalogs_local_inventory_items_slash_post(
        &self,
        catalog_id: String,
        local_inventory_items_get_create: models::LocalInventoryItemsGetCreate,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsLocalInventoryItemsSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_local_inventory_items_slash_post(catalog_id, local_inventory_items_get_create, ad_account_id, &context).await
    }

    /// Create local stores
    async fn catalogs_local_stores_slash_create<'a>(
        &self,
        catalog_id: String,
        local_store_create: &'a Vec<models::LocalStoreCreate>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsLocalStoresSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_local_stores_slash_create(catalog_id, local_store_create, ad_account_id, &context).await
    }

    /// Delete local stores
    async fn catalogs_local_stores_slash_delete<'a>(
        &self,
        catalog_id: String,
        ids: &'a Vec<models::LocalStoreId>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsLocalStoresSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_local_stores_slash_delete(catalog_id, ids, ad_account_id, &context).await
    }

    /// List local stores
    async fn catalogs_local_stores_slash_list<'a>(
        &self,
        catalog_id: String,
        ids: Option<&'a Vec<models::LocalStoreId>>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<CatalogsLocalStoresSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_local_stores_slash_list(catalog_id, ids, ad_account_id, bookmark, page_size, &context).await
    }

    /// Update local stores
    async fn catalogs_local_stores_slash_update<'a>(
        &self,
        catalog_id: String,
        local_store_batch_update: &'a Vec<models::LocalStoreBatchUpdate>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsLocalStoresSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_local_stores_slash_update(catalog_id, local_store_batch_update, ad_account_id, &context).await
    }

    /// Get supplemental items batch status
    async fn catalogs_supplemental_items_batch_slash_get(
        &self,
        catalog_id: String,
        batch_id: String,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsSupplementalItemsBatchSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_supplemental_items_batch_slash_get(catalog_id, batch_id, ad_account_id, &context).await
    }

    /// List available filter values
    async fn catalogs_slash_available_filter_values(
        &self,
        catalog_id: String,
        feed_id: Option<String>,
        country: Option<models::Country>,
        language: Option<models::CatalogsLocale>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsSlashAvailableFilterValuesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_slash_available_filter_values(catalog_id, feed_id, country, language, ad_account_id, &context).await
    }

    /// Create catalog
    async fn catalogs_slash_create(
        &self,
        catalog_create: models::CatalogCreate,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_slash_create(catalog_create, ad_account_id, &context).await
    }

    /// List catalogs
    async fn catalogs_slash_list(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<CatalogsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_slash_list(ad_account_id, bookmark, page_size, &context).await
    }

    /// Create a conversion deletion request
    async fn conversion_deletion_request_slash_create(
        &self,
        ad_account_id: String,
        conversion_deletion_request_create: models::ConversionDeletionRequestCreate,
        ) -> Result<ConversionDeletionRequestSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().conversion_deletion_request_slash_create(ad_account_id, conversion_deletion_request_create, &context).await
    }

    /// List conversion deletion requests
    async fn conversion_deletion_request_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<ConversionDeletionRequestSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().conversion_deletion_request_slash_list(ad_account_id, bookmark, page_size, order, &context).await
    }

    /// Delete a conversion deletion request
    async fn conversion_deletion_request_slash_delete(
        &self,
        request_id: String,
        ad_account_id: String,
        ) -> Result<ConversionDeletionRequestSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().conversion_deletion_request_slash_delete(request_id, ad_account_id, &context).await
    }

    /// Get a single conversion deletion request
    async fn conversion_deletion_request_slash_get(
        &self,
        request_id: String,
        ad_account_id: String,
        ) -> Result<ConversionDeletionRequestSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().conversion_deletion_request_slash_get(request_id, ad_account_id, &context).await
    }

    /// Get event quality score (EQS)
    async fn conversion_eqs_slash_list(
        &self,
        lookback_period: models::LookbackPeriodOptions,
        ad_account_id: String,
        source_platform: Option<models::SourcePlatformOptions>,
        ingestion_source: Option<models::IngestionSourceOptions>,
        ) -> Result<ConversionEqsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().conversion_eqs_slash_list(lookback_period, ad_account_id, source_platform, ingestion_source, &context).await
    }

    /// Send conversions
    async fn events_slash_create(
        &self,
        ad_account_id: String,
        conversion_events_create: models::ConversionEventsCreate,
        test: Option<bool>,
        ) -> Result<EventsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().events_slash_create(ad_account_id, conversion_events_create, test, &context).await
    }

    /// Create conversion tag
    async fn conversion_tags_slash_create(
        &self,
        ad_account_id: String,
        conversion_tag_create: models::ConversionTagCreate,
        ) -> Result<ConversionTagsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().conversion_tags_slash_create(ad_account_id, conversion_tag_create, &context).await
    }

    /// List conversion tags
    async fn conversion_tags_slash_list(
        &self,
        ad_account_id: String,
        filter_deleted: Option<bool>,
        ) -> Result<ConversionTagsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().conversion_tags_slash_list(ad_account_id, filter_deleted, &context).await
    }

    /// Get Ocpm eligible conversion tags
    async fn ocpm_eligible_conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        ) -> Result<OcpmEligibleConversionTagsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ocpm_eligible_conversion_tags_slash_get(ad_account_id, &context).await
    }

    /// Get page visit conversion tags
    async fn page_visit_conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<PageVisitConversionTagsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().page_visit_conversion_tags_slash_get(ad_account_id, bookmark, page_size, order, &context).await
    }

    /// Get conversion tag
    async fn conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        conversion_tag_id: String,
        ) -> Result<ConversionTagsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().conversion_tags_slash_get(ad_account_id, conversion_tag_id, &context).await
    }

    /// Create advertiser defined events
    async fn advertiser_defined_events_slash_create(
        &self,
        ad_account_id: String,
        advertiser_defined_events_create_request: models::AdvertiserDefinedEventsCreateRequest,
        ) -> Result<AdvertiserDefinedEventsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().advertiser_defined_events_slash_create(ad_account_id, advertiser_defined_events_create_request, &context).await
    }

    /// Delete advertiser defined events
    async fn advertiser_defined_events_slash_delete<'a>(
        &self,
        ad_account_id: String,
        event_names: &'a Vec<String>,
        ) -> Result<AdvertiserDefinedEventsSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().advertiser_defined_events_slash_delete(ad_account_id, event_names, &context).await
    }

    /// Get advertiser defined events
    async fn advertiser_defined_events_slash_get(
        &self,
        ad_account_id: String,
        ) -> Result<AdvertiserDefinedEventsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().advertiser_defined_events_slash_get(ad_account_id, &context).await
    }

    /// Update advertiser defined events
    async fn advertiser_defined_events_slash_update(
        &self,
        ad_account_id: String,
        advertiser_defined_events_create_request: models::AdvertiserDefinedEventsCreateRequest,
        ) -> Result<AdvertiserDefinedEventsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().advertiser_defined_events_slash_update(ad_account_id, advertiser_defined_events_create_request, &context).await
    }

    /// Create customer list upload
    async fn customer_list_uploads_slash_create(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_create_request: models::CustomerListUploadCreateRequest,
        ) -> Result<CustomerListUploadsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_list_uploads_slash_create(ad_account_id, customer_list_id, customer_list_upload_create_request, &context).await
    }

    /// Get customer list upload
    async fn customer_list_uploads_slash_get(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_id: String,
        ) -> Result<CustomerListUploadsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_list_uploads_slash_get(ad_account_id, customer_list_id, customer_list_upload_id, &context).await
    }

    /// Run customer list upload
    async fn customer_list_uploads_slash_run(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_id: String,
        ) -> Result<CustomerListUploadsSlashRunResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_list_uploads_slash_run(ad_account_id, customer_list_id, customer_list_upload_id, &context).await
    }

    /// Create customer lists
    async fn customer_lists_slash_create(
        &self,
        ad_account_id: String,
        customer_list_create: models::CustomerListCreate,
        ) -> Result<CustomerListsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_lists_slash_create(ad_account_id, customer_list_create, &context).await
    }

    /// Get customer lists
    async fn customer_lists_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        exclude_nca: Option<bool>,
        ) -> Result<CustomerListsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_lists_slash_list(ad_account_id, bookmark, page_size, order, exclude_nca, &context).await
    }

    /// Get customer list
    async fn customer_lists_slash_get(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        ) -> Result<CustomerListsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_lists_slash_get(ad_account_id, customer_list_id, &context).await
    }

    /// Update customer list
    async fn customer_lists_slash_update(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_update_with_required_body: models::CustomerListUpdateWithRequiredBody,
        ) -> Result<CustomerListsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_lists_slash_update(ad_account_id, customer_list_id, customer_list_update_with_required_body, &context).await
    }

    /// Create customer segments
    async fn customer_segment_slash_create(
        &self,
        ad_account_id: String,
        customer_segment_create: models::CustomerSegmentCreate,
        ) -> Result<CustomerSegmentSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_segment_slash_create(ad_account_id, customer_segment_create, &context).await
    }

    /// List customer segments
    async fn customer_segment_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        include_sizing: Option<bool>,
        search_query: Option<String>,
        ) -> Result<CustomerSegmentSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_segment_slash_list(ad_account_id, bookmark, page_size, order, include_sizing, search_query, &context).await
    }

    /// Update customer segments
    async fn customer_segment_slash_update(
        &self,
        ad_account_id: String,
        customer_segment_update_request_update_with_required_body: models::CustomerSegmentUpdateRequestUpdateWithRequiredBody,
        ) -> Result<CustomerSegmentSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_segment_slash_update(ad_account_id, customer_segment_update_request_update_with_required_body, &context).await
    }

    /// Create commerce integration
    async fn integrations_commerce_slash_post(
        &self,
        integration_metadata_create: models::IntegrationMetadataCreate,
        ) -> Result<IntegrationsCommerceSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().integrations_commerce_slash_post(integration_metadata_create, &context).await
    }

    /// Receives batched logs from integration applications.
    async fn integrations_logs_slash_post(
        &self,
        integration_logs_request_create: models::IntegrationLogsRequestCreate,
        ) -> Result<IntegrationsLogsSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().integrations_logs_slash_post(integration_logs_request_create, &context).await
    }

    /// Get integration metadata list
    async fn integrations_slash_get_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<IntegrationsSlashGetListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().integrations_slash_get_list(bookmark, page_size, &context).await
    }

    /// Delete commerce integration
    async fn integrations_commerce_slash_del(
        &self,
        external_business_id: String,
        ) -> Result<IntegrationsCommerceSlashDelResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().integrations_commerce_slash_del(external_business_id, &context).await
    }

    /// Get commerce integration
    async fn integrations_commerce_slash_get(
        &self,
        external_business_id: String,
        ) -> Result<IntegrationsCommerceSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().integrations_commerce_slash_get(external_business_id, &context).await
    }

    /// Update commerce integration
    async fn integrations_commerce_slash_patch(
        &self,
        external_business_id: String,
        integration_metadata_update: models::IntegrationMetadataUpdate,
        ) -> Result<IntegrationsCommerceSlashPatchResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().integrations_commerce_slash_patch(external_business_id, integration_metadata_update, &context).await
    }

    /// Get integration metadata
    async fn integrations_slash_get_by_id(
        &self,
        id: String,
        ) -> Result<IntegrationsSlashGetByIdResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().integrations_slash_get_by_id(id, &context).await
    }

    /// Get country's keyword metrics
    async fn country_keywords_metrics_slash_get<'a>(
        &self,
        ad_account_id: String,
        country_code: String,
        keywords: &'a Vec<String>,
        ) -> Result<CountryKeywordsMetricsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().country_keywords_metrics_slash_get(ad_account_id, country_code, keywords, &context).await
    }

    /// Create keywords
    async fn keywords_slash_create(
        &self,
        ad_account_id: String,
        keywords_create: models::KeywordsCreate,
        ) -> Result<KeywordsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().keywords_slash_create(ad_account_id, keywords_create, &context).await
    }

    /// Get keywords
    async fn keywords_slash_get<'a>(
        &self,
        ad_account_id: String,
        campaign_id: Option<String>,
        ad_group_id: Option<String>,
        ad_group_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        match_types: Option<&'a Vec<models::MatchType>>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<KeywordsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().keywords_slash_get(ad_account_id, campaign_id, ad_group_id, ad_group_ids, match_types, bookmark, page_size, &context).await
    }

    /// Update keywords
    async fn keywords_slash_update(
        &self,
        ad_account_id: String,
        keywords_update: models::KeywordsUpdate,
        ) -> Result<KeywordsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().keywords_slash_update(ad_account_id, keywords_update, &context).await
    }

    /// List trending keywords
    async fn trending_keywords_slash_list<'a>(
        &self,
        region: models::TrendsSupportedRegion,
        trend_type: models::TrendType,
        interests: Option<&'a Vec<models::TrendsL1Interest>>,
        genders: Option<&'a Vec<models::TrendsGenderFilter>>,
        ages: Option<&'a Vec<models::TrendsAgeBucket>>,
        include_keywords: Option<&'a Vec<models::KeywordListItems>>,
        normalize_against_group: Option<bool>,
        limit: Option<u8>,
        include_demographics: Option<bool>,
        ) -> Result<TrendingKeywordsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().trending_keywords_slash_list(region, trend_type, interests, genders, ages, include_keywords, normalize_against_group, limit, include_demographics, &context).await
    }

    /// Create labels
    async fn labels_slash_create(
        &self,
        ad_account_id: String,
        label_create_request: models::LabelCreateRequest,
        ) -> Result<LabelsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().labels_slash_create(ad_account_id, label_create_request, &context).await
    }

    /// List labels
    async fn labels_slash_list<'a>(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&'a Vec<models::CampaignIdType>>,
        label_ids: Option<&'a Vec<models::QueryLabelIdsItems>>,
        entity_statuses: Option<&'a Vec<models::QueryLabelEntityStatusesItems>>,
        label_types: Option<&'a Vec<models::QueryLabelTypesItems>>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<LabelsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().labels_slash_list(ad_account_id, campaign_ids, label_ids, entity_statuses, label_types, bookmark, page_size, &context).await
    }

    /// Update labels
    async fn labels_slash_update(
        &self,
        ad_account_id: String,
        label_update_request: models::LabelUpdateRequest,
        ) -> Result<LabelsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().labels_slash_update(ad_account_id, label_update_request, &context).await
    }

    /// Apply label to entity
    async fn labels_slash_apply(
        &self,
        ad_account_id: String,
        label_id: String,
        labeled_entities_create: models::LabeledEntitiesCreate,
        ) -> Result<LabelsSlashApplyResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().labels_slash_apply(ad_account_id, label_id, labeled_entities_create, &context).await
    }

    /// Remove label from entities
    async fn labels_slash_remove(
        &self,
        ad_account_id: String,
        label_id: String,
        labeled_entities_create: models::LabeledEntitiesCreate,
        ) -> Result<LabelsSlashRemoveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().labels_slash_remove(ad_account_id, label_id, labeled_entities_create, &context).await
    }

    /// Get lead ads subscriptions
    async fn ad_accounts_subscriptions_slash_get_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<AdAccountsSubscriptionsSlashGetListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_subscriptions_slash_get_list(ad_account_id, bookmark, page_size, &context).await
    }

    /// Create lead ads subscription
    async fn ad_accounts_subscriptions_slash_post(
        &self,
        ad_account_id: String,
        lead_subscription_post_params_create: models::LeadSubscriptionPostParamsCreate,
        ) -> Result<AdAccountsSubscriptionsSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_subscriptions_slash_post(ad_account_id, lead_subscription_post_params_create, &context).await
    }

    /// Delete lead ads subscription
    async fn ad_accounts_subscriptions_slash_del_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        ) -> Result<AdAccountsSubscriptionsSlashDelByIdResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_subscriptions_slash_del_by_id(ad_account_id, subscription_id, &context).await
    }

    /// Get lead ads subscription by ID
    async fn ad_accounts_subscriptions_slash_get_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        ) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_subscriptions_slash_get_by_id(ad_account_id, subscription_id, &context).await
    }

    /// Create lead forms
    async fn lead_forms_slash_create(
        &self,
        ad_account_id: String,
        lead_form_create: models::LeadFormsCreateBody,
        ) -> Result<LeadFormsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().lead_forms_slash_create(ad_account_id, lead_form_create, &context).await
    }

    /// List lead forms
    async fn lead_forms_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<LeadFormsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().lead_forms_slash_list(ad_account_id, bookmark, page_size, order, &context).await
    }

    /// Update lead forms
    async fn lead_forms_slash_update(
        &self,
        ad_account_id: String,
        lead_form_batch_update: models::LeadFormsUpdateBody,
        ) -> Result<LeadFormsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().lead_forms_slash_update(ad_account_id, lead_form_batch_update, &context).await
    }

    /// Get lead form by id
    async fn lead_form_slash_get(
        &self,
        lead_form_id: String,
        ad_account_id: String,
        ) -> Result<LeadFormSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().lead_form_slash_get(lead_form_id, ad_account_id, &context).await
    }

    /// Create lead form test data
    async fn lead_form_test_slash_create(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        lead_form_test_create: models::LeadFormTestCreate,
        ) -> Result<LeadFormTestSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().lead_form_test_slash_create(ad_account_id, lead_form_id, lead_form_test_create, &context).await
    }

    /// Create a request to export leads collected from a lead ad
    async fn leads_export_slash_create(
        &self,
        ad_account_id: String,
        leads_exports_create: models::LeadsExportsCreate,
        ) -> Result<LeadsExportSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().leads_export_slash_create(ad_account_id, leads_exports_create, &context).await
    }

    /// Get the lead export from the lead export create call
    async fn leads_export_slash_get(
        &self,
        ad_account_id: String,
        leads_export_id: String,
        ) -> Result<LeadsExportSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().leads_export_slash_get(ad_account_id, leads_export_id, &context).await
    }

    /// Register media upload
    async fn media_slash_create(
        &self,
        media_upload_create: models::MediaUploadCreate,
        ) -> Result<MediaSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().media_slash_create(media_upload_create, &context).await
    }

    /// List media uploads
    async fn media_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<MediaSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().media_slash_list(bookmark, page_size, &context).await
    }

    /// Get media upload details
    async fn media_slash_get(
        &self,
        media_id: String,
        ) -> Result<MediaSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().media_slash_get(media_id, &context).await
    }

    /// Send Measurement Source Of Truth (MSOT) attributed conversion events
    async fn msot_events_slash_create(
        &self,
        ad_account_id: String,
        conversion_msot_events_create: models::ConversionMsotEventsCreate,
        ) -> Result<MsotEventsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().msot_events_slash_create(ad_account_id, conversion_msot_events_create, &context).await
    }

    /// Receive notifications from external partners.
    async fn notification_slash_post(
        &self,
        notification_post_request: models::NotificationPostRequest,
        ) -> Result<NotificationSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().notification_slash_post(notification_post_request, &context).await
    }

    /// Generate OAuth access token for conversion API
    async fn oauth_slash_conversion_token(
        &self,
        ) -> Result<OauthSlashConversionTokenResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().oauth_slash_conversion_token(&context).await
    }

    /// Generate OAuth access token
    async fn oauth_slash_token(
        &self,
        grant_type: models::TokenGrantType,
        code: Option<String>,
        continuous_refresh: Option<String>,
        redirect_uri: Option<String>,
        refresh_token: Option<String>,
        scope: Option<String>,
        ) -> Result<OauthSlashTokenResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().oauth_slash_token(grant_type, code, continuous_refresh, redirect_uri, refresh_token, scope, &context).await
    }

    /// Revoke a token
    async fn token_slash_revoke(
        &self,
        token: String,
        token_type_hint: Option<models::TokenTypeHint>,
        ) -> Result<TokenSlashRevokeResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().token_slash_revoke(token, token_type_hint, &context).await
    }

    /// Get order lines.
    async fn order_lines_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<OrderLinesSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().order_lines_slash_list(ad_account_id, bookmark, page_size, order, &context).await
    }

    /// Get order line
    async fn order_lines_slash_get(
        &self,
        order_line_id: String,
        ad_account_id: String,
        ) -> Result<OrderLinesSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().order_lines_slash_get(order_line_id, ad_account_id, &context).await
    }

    /// Get multiple Pin analytics
    async fn multi_pins_slash_analytics<'a>(
        &self,
        pin_ids: &'a Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &'a Vec<models::MultiPinsAnalyticsMetricTypesItem>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        ad_account_id: Option<String>,
        ) -> Result<MultiPinsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().multi_pins_slash_analytics(pin_ids, start_date, end_date, metric_types, app_types, ad_account_id, &context).await
    }

    /// Create Pin
    async fn pins_slash_create(
        &self,
        pin_create: models::PinCreate,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_slash_create(pin_create, ad_account_id, &context).await
    }

    /// List Pins
    async fn pins_slash_list<'a>(
        &self,
        pin_filter: Option<models::PinFilter>,
        pin_metrics: Option<bool>,
        include_protected_pins: Option<bool>,
        pin_type: Option<models::PinType>,
        creative_types: Option<&'a Vec<models::CreativeType>>,
        ad_account_id: Option<String>,
        domain: Option<String>,
        domains: Option<&'a Vec<String>>,
        include_product_tag_obj: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<PinsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_slash_list(pin_filter, pin_metrics, include_protected_pins, pin_type, creative_types, ad_account_id, domain, domains, include_product_tag_obj, bookmark, page_size, &context).await
    }

    /// Get Pin analytics
    async fn pins_slash_analytics<'a>(
        &self,
        pin_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &'a Vec<models::QuerypinanalyticsmetrictypesItems>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        split_field: Option<models::PinsAnalyticsSplitFieldParameter>,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_slash_analytics(pin_id, start_date, end_date, metric_types, app_types, split_field, ad_account_id, &context).await
    }

    /// Delete Pin
    async fn pins_slash_delete(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_slash_delete(pin_id, ad_account_id, &context).await
    }

    /// Get Pin
    async fn pins_slash_get(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        ) -> Result<PinsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_slash_get(pin_id, ad_account_id, pin_metrics, &context).await
    }

    /// Save Pin
    async fn pins_slash_save(
        &self,
        pin_id: String,
        pins_save_request_create: models::PinsSaveRequestCreate,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashSaveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_slash_save(pin_id, pins_save_request_create, ad_account_id, &context).await
    }

    /// Update Pin
    async fn pins_slash_update(
        &self,
        pin_id: String,
        pin_update: models::PinUpdate,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_slash_update(pin_id, pin_update, ad_account_id, &context).await
    }

    /// Create product group promotions
    async fn product_group_promotions_slash_create(
        &self,
        ad_account_id: String,
        product_group_promotions_create: models::ProductGroupPromotionsCreate,
        ) -> Result<ProductGroupPromotionsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_group_promotions_slash_create(ad_account_id, product_group_promotions_create, &context).await
    }

    /// Get product group promotions
    async fn product_group_promotions_slash_list<'a>(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        product_group_promotion_ids: Option<&'a Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&'a Vec<models::EntityStatus>>,
        ad_group_id: Option<String>,
        ) -> Result<ProductGroupPromotionsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_group_promotions_slash_list(ad_account_id, bookmark, page_size, order, product_group_promotion_ids, entity_statuses, ad_group_id, &context).await
    }

    /// Update product group promotions
    async fn product_group_promotions_slash_update(
        &self,
        ad_account_id: String,
        product_group_promotions_update_with_required_body: models::ProductGroupPromotionsUpdateWithRequiredBody,
        ) -> Result<ProductGroupPromotionsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_group_promotions_slash_update(ad_account_id, product_group_promotions_update_with_required_body, &context).await
    }

    /// Get product group analytics
    async fn product_groups_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        product_group_ids: &'a Vec<models::ProductGroupIdType>,
        columns: &'a Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        ) -> Result<ProductGroupsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_groups_slash_analytics(start_date, end_date, product_group_ids, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, reporting_timezone, &context).await
    }

    /// Get a product group promotion by id
    async fn product_group_promotions_slash_get(
        &self,
        ad_account_id: String,
        product_group_promotion_id: String,
        ) -> Result<ProductGroupPromotionsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_group_promotions_slash_get(ad_account_id, product_group_promotion_id, &context).await
    }

    /// Add product tags to pin
    async fn product_tags_slash_bulk_add(
        &self,
        pin_id: String,
        product_tags_bulk_add_request: models::ProductTagsBulkAddRequest,
        ) -> Result<ProductTagsSlashBulkAddResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_tags_slash_bulk_add(pin_id, product_tags_bulk_add_request, &context).await
    }

    /// Delete product tags from pin
    async fn product_tags_slash_bulk_delete(
        &self,
        pin_id: String,
        product_tags_bulk_delete_request: models::ProductTagsBulkDeleteRequest,
        ) -> Result<ProductTagsSlashBulkDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_tags_slash_bulk_delete(pin_id, product_tags_bulk_delete_request, &context).await
    }

    /// Get product tags for pin
    async fn product_tags_slash_list(
        &self,
        pin_id: String,
        ) -> Result<ProductTagsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_tags_slash_list(pin_id, &context).await
    }

    /// Create promotions
    async fn promotions_slash_create(
        &self,
        ad_account_id: String,
        promotion_create: models::PromotionCreateBatch,
        ) -> Result<PromotionsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().promotions_slash_create(ad_account_id, promotion_create, &context).await
    }

    /// Get promotions
    async fn promotions_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        ) -> Result<PromotionsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().promotions_slash_list(ad_account_id, bookmark, page_size, order, &context).await
    }

    /// Update promotions
    async fn promotions_slash_update(
        &self,
        ad_account_id: String,
        promotion_batch_update: models::PromotionUpdateBatch,
        ) -> Result<PromotionsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().promotions_slash_update(ad_account_id, promotion_batch_update, &context).await
    }

    /// Delete promotion by id
    async fn promotions_slash_delete(
        &self,
        promotion_id: String,
        ad_account_id: String,
        ) -> Result<PromotionsSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().promotions_slash_delete(promotion_id, ad_account_id, &context).await
    }

    /// Get promotion by id
    async fn promotions_slash_get(
        &self,
        promotion_id: String,
        ad_account_id: String,
        ) -> Result<PromotionsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().promotions_slash_get(promotion_id, ad_account_id, &context).await
    }

    /// Get ad accounts countries
    async fn ad_account_countries_slash_get(
        &self,
        ) -> Result<AdAccountCountriesSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_account_countries_slash_get(&context).await
    }

    /// Get available metrics' definitions
    async fn delivery_metrics_slash_get(
        &self,
        report_type: Option<models::ReportType>,
        ) -> Result<DeliveryMetricsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delivery_metrics_slash_get(report_type, &context).await
    }

    /// Get lead form questions
    async fn lead_form_questions_slash_get(
        &self,
        ) -> Result<LeadFormQuestionsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().lead_form_questions_slash_get(&context).await
    }

    /// Get metrics ready state
    async fn metrics_ready_state_slash_get(
        &self,
        date: String,
        ) -> Result<MetricsReadyStateSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().metrics_ready_state_slash_get(date, &context).await
    }

    /// Get interest details
    async fn interest_targeting_options_slash_get(
        &self,
        interest_id: String,
        ) -> Result<InterestTargetingOptionsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().interest_targeting_options_slash_get(interest_id, &context).await
    }

    /// Get targeting options
    async fn targeting_options_slash_get(
        &self,
        targeting_type: models::PublicTargetingType,
        ad_account_id: Option<String>,
        client_id: Option<String>,
        oauth_signature: Option<String>,
        timestamp: Option<String>,
        ) -> Result<TargetingOptionsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().targeting_options_slash_get(targeting_type, ad_account_id, client_id, oauth_signature, timestamp, &context).await
    }

    /// Create schedules
    async fn schedules_slash_create<'a>(
        &self,
        ad_account_id: String,
        schedule_create: &'a Vec<models::ScheduleCreate>,
        ) -> Result<SchedulesSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().schedules_slash_create(ad_account_id, schedule_create, &context).await
    }

    /// Get Schedules
    async fn schedules_slash_list<'a>(
        &self,
        ad_account_id: String,
        entity_ids: &'a Vec<models::EntityId>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        schedule_statuses: Option<&'a Vec<models::ScheduleStatus>>,
        schedule_type: Option<models::ScheduleType>,
        ) -> Result<SchedulesSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().schedules_slash_list(ad_account_id, entity_ids, bookmark, page_size, order, schedule_statuses, schedule_type, &context).await
    }

    /// Update schedules
    async fn schedules_slash_update<'a>(
        &self,
        ad_account_id: String,
        schedule_batch_update: &'a Vec<models::ScheduleBatchUpdate>,
        ) -> Result<SchedulesSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().schedules_slash_update(ad_account_id, schedule_batch_update, &context).await
    }

    /// Search pins by a given search term
    async fn search_partner_pins(
        &self,
        term: String,
        country_code: String,
        bookmark: Option<String>,
        locale: Option<String>,
        limit: Option<u8>,
        ) -> Result<SearchPartnerPinsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().search_partner_pins(term, country_code, bookmark, locale, limit, &context).await
    }

    /// Search user's boards
    async fn search_user_boards_slash_get(
        &self,
        ad_account_id: Option<String>,
        query: Option<String>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<SearchUserBoardsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().search_user_boards_slash_get(ad_account_id, query, bookmark, page_size, &context).await
    }

    /// Search user's Pins
    async fn search_user_pins_slash_list(
        &self,
        query: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        ) -> Result<SearchUserPinsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().search_user_pins_slash_list(query, ad_account_id, bookmark, &context).await
    }

    /// Create targeting templates
    async fn targeting_template_slash_create(
        &self,
        ad_account_id: String,
        targeting_template_create: models::TargetingTemplateCreate,
        ) -> Result<TargetingTemplateSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().targeting_template_slash_create(ad_account_id, targeting_template_create, &context).await
    }

    /// List targeting templates
    async fn targeting_template_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        order: Option<models::PinterestLibPaginationOrder>,
        include_sizing: Option<bool>,
        search_query: Option<String>,
        ) -> Result<TargetingTemplateSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().targeting_template_slash_list(ad_account_id, bookmark, page_size, order, include_sizing, search_query, &context).await
    }

    /// Update targeting templates
    async fn targeting_template_slash_update(
        &self,
        ad_account_id: String,
        targeting_template_update_request_read_or_update: models::TargetingTemplateUpdateRequestReadOrUpdate,
        ) -> Result<TargetingTemplateSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().targeting_template_slash_update(ad_account_id, targeting_template_update_request_read_or_update, &context).await
    }

    /// List related terms
    async fn terms_related_slash_list<'a>(
        &self,
        terms: &'a Vec<String>,
        ) -> Result<TermsRelatedSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().terms_related_slash_list(terms, &context).await
    }

    /// List suggested terms
    async fn terms_suggested_slash_list(
        &self,
        term: String,
        limit: Option<u8>,
        ) -> Result<TermsSuggestedSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().terms_suggested_slash_list(term, limit, &context).await
    }

    /// Get terms of service
    async fn terms_of_service_slash_get(
        &self,
        ad_account_id: String,
        include_html: Option<bool>,
        tos_type: Option<String>,
        ) -> Result<TermsOfServiceSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().terms_of_service_slash_get(ad_account_id, include_html, tos_type, &context).await
    }

    /// Returns editorial articles for a given region
    async fn trends_editorial_articles_slash_list(
        &self,
        region: models::ProductCategoryRegion,
        ) -> Result<TrendsEditorialArticlesSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().trends_editorial_articles_slash_list(region, &context).await
    }

    /// Get featured topics
    async fn trends_featured_topics_slash_list(
        &self,
        region: models::ProductCategoryRegion,
        interest: Option<models::InterestsEnum>,
        ) -> Result<TrendsFeaturedTopicsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().trends_featured_topics_slash_list(region, interest, &context).await
    }

    /// Get product category details
    async fn trends_product_categories_details_slash_list<'a>(
        &self,
        product_categories: &'a Vec<models::ProductCategoryEnum>,
        region: models::ProductCategoryRegion,
        lookback_window: Option<models::ProductCategoryDetailLookbackWindow>,
        engagement_type: Option<models::ProductCategoriesEngagementType>,
        ) -> Result<TrendsProductCategoriesDetailsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().trends_product_categories_details_slash_list(product_categories, region, lookback_window, engagement_type, &context).await
    }

    /// Get a list of growing Shopping Product Categories
    async fn trends_product_categories_trending_slash_list<'a>(
        &self,
        region: models::ProductCategoryRegion,
        verticals: Option<&'a Vec<models::VerticalProductCategory>>,
        ages: Option<&'a Vec<models::AgeTrendsBucket>>,
        genders: Option<&'a Vec<models::GenderBucket>>,
        engagement_type: Option<models::ProductCategoriesEngagementType>,
        ) -> Result<TrendsProductCategoriesTrendingSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().trends_product_categories_trending_slash_list(region, verticals, ages, genders, engagement_type, &context).await
    }

    /// List following boards
    async fn boards_user_follows_slash_list(
        &self,
        ad_account_id: Option<String>,
        explicit_following: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<BoardsUserFollowsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_user_follows_slash_list(ad_account_id, explicit_following, bookmark, page_size, &context).await
    }

    /// List followers
    async fn followers_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<FollowersSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().followers_slash_list(bookmark, page_size, &context).await
    }

    /// List linked businesses
    async fn linked_business_accounts_slash_get(
        &self,
        ) -> Result<LinkedBusinessAccountsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().linked_business_accounts_slash_get(&context).await
    }

    /// Unverify website
    async fn unverify_website_slash_delete(
        &self,
        website: String,
        ) -> Result<UnverifyWebsiteSlashDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().unverify_website_slash_delete(website, &context).await
    }

    /// Get user account analytics
    async fn user_account_slash_analytics<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&'a Vec<models::QuerymetrictypesItems>>,
        split_field: Option<models::UserAccountAnalyticsSplitFieldParameter>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_account_slash_analytics(start_date, end_date, from_claimed_content, pin_format, app_types, content_type, source, metric_types, split_field, ad_account_id, &context).await
    }

    /// Get user account top pins analytics
    async fn user_account_slash_analytics_slash_top_pins<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: models::TopPinsSortBy,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&'a Vec<models::QuerymetrictypesItems>>,
        num_of_pins: Option<u8>,
        created_in_last_n_days: Option<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsSlashTopPinsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_account_slash_analytics_slash_top_pins(start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, &context).await
    }

    /// Get user account top video pins analytics
    async fn user_account_slash_analytics_slash_top_video_pins<'a>(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: models::TopVideoPinsSortBy,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&'a Vec<models::QueryvideopinmetrictypesItems>>,
        num_of_pins: Option<u8>,
        created_in_last_n_days: Option<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsSlashTopVideoPinsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_account_slash_analytics_slash_top_video_pins(start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, &context).await
    }

    /// Get user account
    async fn user_account_slash_get(
        &self,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_account_slash_get(ad_account_id, &context).await
    }

    /// List following
    async fn user_following_slash_get(
        &self,
        ad_account_id: Option<String>,
        explicit_following: Option<bool>,
        feed_type: Option<models::UserFollowingFeedType>,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<UserFollowingSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_following_slash_get(ad_account_id, explicit_following, feed_type, bookmark, page_size, &context).await
    }

    /// Get user websites
    async fn user_websites_slash_get(
        &self,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<UserWebsitesSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_websites_slash_get(bookmark, page_size, &context).await
    }

    /// Verify website
    async fn verify_website_slash_update(
        &self,
        user_website_create: models::UserWebsiteCreate,
        ad_account_id: Option<String>,
        ) -> Result<VerifyWebsiteSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().verify_website_slash_update(user_website_create, ad_account_id, &context).await
    }

    /// Get user verification code for website claiming
    async fn website_verification_slash_get(
        &self,
        ad_account_id: Option<String>,
        ) -> Result<WebsiteVerificationSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().website_verification_slash_get(ad_account_id, &context).await
    }

    /// Follow user
    async fn follow_user_slash_update(
        &self,
        username: String,
        follow_user_create: models::FollowUserCreate,
        ) -> Result<FollowUserSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().follow_user_slash_update(username, follow_user_create, &context).await
    }

    /// List following interests
    async fn user_account_slash_followed_interests(
        &self,
        username: String,
        bookmark: Option<String>,
        page_size: Option<u8>,
        ) -> Result<UserAccountSlashFollowedInterestsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_account_slash_followed_interests(username, bookmark, page_size, &context).await
    }

}


#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

#[cfg(feature = "server")]
pub mod context;

pub mod models;

#[cfg(any(feature = "client", feature = "server"))]
pub(crate) mod header;
