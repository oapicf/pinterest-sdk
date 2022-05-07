#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]

use async_trait::async_trait;
use futures::Stream;
use std::error::Error;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper};
use serde::{Serialize, Deserialize};

type ServiceError = Box<dyn Error + Send + Sync + 'static>;

pub const BASE_PATH: &'static str = "/v5";
pub const API_VERSION: &'static str = "5.3.0";

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountAnalyticsResponse {
    /// Success
    Success
    (Vec<std::collections::HashMap<String, serde_json::Value>>)
    ,
    /// Invalid ad account analytics parameters.
    InvalidAdAccountAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsListResponse {
    /// response
    Response
    (Paginated)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsAnalyticsResponse {
    /// Success
    Success
    (Vec<std::collections::HashMap<String, serde_json::Value>>)
    ,
    /// Invalid ad account group analytics parameters.
    InvalidAdAccountGroupAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsListResponse {
    /// Success
    Success
    (Paginated)
    ,
    /// Invalid ad account group parameters.
    InvalidAdAccountGroupParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsAnalyticsResponse {
    /// Success
    Success
    (Vec<std::collections::HashMap<String, serde_json::Value>>)
    ,
    /// Invalid ad account ads analytics parameters.
    InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsListResponse {
    /// Success
    Success
    (Paginated)
    ,
    /// Invalid ad account ads parameters.
    InvalidAdAccountAdsParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsCreateReportResponse {
    /// Success
    Success
    (models::AdsAnalyticsCreateAsyncResponse)
    ,
    /// Invalid ad account ads analytics parameters.
    InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsGetReportResponse {
    /// Success
    Success
    (models::AdsAnalyticsGetAsyncResponse)
    ,
    /// Invalid ad account ads analytics parameters.
    InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignsAnalyticsResponse {
    /// Success
    Success
    (Vec<std::collections::HashMap<String, serde_json::Value>>)
    ,
    /// Invalid ad account campaign analytics parameters.
    InvalidAdAccountCampaignAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignsListResponse {
    /// Success
    Success
    (Paginated)
    ,
    /// Invalid ad account campaign parameters.
    InvalidAdAccountCampaignParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductGroupsAnalyticsResponse {
    /// Success
    Success
    (Vec<std::collections::HashMap<String, serde_json::Value>>)
    ,
    /// Invalid ad account ads analytics parameters.
    InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsCreateResponse {
    /// response
    Response
    (models::BoardSection)
    ,
    /// Invalid board section parameters.
    InvalidBoardSectionParameters
    (models::Error)
    ,
    /// Not authorized to create board sections.
    NotAuthorizedToCreateBoardSections
    (models::Error)
    ,
    /// Could not get exclusive access to the board to create a new section.
    CouldNotGetExclusiveAccessToTheBoardToCreateANewSection
    (models::Error)
    ,
    /// Could not create a new board section.
    CouldNotCreateANewBoardSection
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsDeleteResponse {
    /// Board section deleted successfully
    BoardSectionDeletedSuccessfully
    ,
    /// Not authorized to delete board section.
    NotAuthorizedToDeleteBoardSection
    (models::Error)
    ,
    /// Board section not found.
    BoardSectionNotFound
    (models::Error)
    ,
    /// Board section conflict.
    BoardSectionConflict
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsListResponse {
    /// response
    Response
    (Paginated)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsListPinsResponse {
    /// response
    Response
    (Paginated)
    ,
    /// Not authorized to access Pins on board section.
    NotAuthorizedToAccessPinsOnBoardSection
    (models::Error)
    ,
    /// Board or section not found.
    BoardOrSectionNotFound
    (models::Error)
    ,
    /// Board section conflict.
    BoardSectionConflict
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsUpdateResponse {
    /// response
    Response
    (models::BoardSection)
    ,
    /// Invalid board section parameters.
    InvalidBoardSectionParameters
    (models::Error)
    ,
    /// Not authorized to update board section.
    NotAuthorizedToUpdateBoardSection
    (models::Error)
    ,
    /// Board section conflict.
    BoardSectionConflict
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsCreateResponse {
    /// response
    Response
    (models::Board)
    ,
    /// The board name is invalid or duplicated.
    TheBoardNameIsInvalidOrDuplicated
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsDeleteResponse {
    /// Board deleted successfully
    BoardDeletedSuccessfully
    ,
    /// Not authorized to delete the board.
    NotAuthorizedToDeleteTheBoard
    (models::Error)
    ,
    /// Board not found.
    BoardNotFound
    (models::Error)
    ,
    /// Could not get exclusive access to delete the board.
    CouldNotGetExclusiveAccessToDeleteTheBoard
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsGetResponse {
    /// response
    Response
    (models::Board)
    ,
    /// Board not found.
    BoardNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsListResponse {
    /// response
    Response
    (Paginated)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsListPinsResponse {
    /// response
    Response
    (Paginated)
    ,
    /// Board not found.
    BoardNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsUpdateResponse {
    /// response
    Response
    (models::Board)
    ,
    /// Invalid board parameters.
    InvalidBoardParameters
    (models::Error)
    ,
    /// Not authorized to update the board.
    NotAuthorizedToUpdateTheBoard
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsCreateResponse {
    /// Success
    Success
    (serde_json::Value)
    ,
    /// Invalid body.
    InvalidBody
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for feed mutations yet.
    Forbidden
    (models::Error)
    ,
    /// Conflict. Can't create this catalogs product group with this value.
    Conflict
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsDeleteResponse {
    /// Catalogs Product Group deleted successfully.
    CatalogsProductGroupDeletedSuccessfully
    ,
    /// Invalid catalogs product group id parameters.
    InvalidCatalogsProductGroupIdParameters
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for feed mutations yet.
    Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't delete this catalogs product group.
    Conflict
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsListResponse {
    /// Success
    Success
    (Paginated)
    ,
    /// Invalid feed parameters.
    InvalidFeedParameters
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for feed mutations yet.
    Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    DataFeedNotFound
    (models::Error)
    ,
    /// Conflict. Can't create this catalogs product group with this value.
    Conflict
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsUpdateResponse {
    /// Success
    Success
    (models::CatalogsProductGroup)
    ,
    /// Invalid parameters.
    InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Catalogs product group not found.
    CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't update this catalogs product group to this value.
    Conflict
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedProcessingResultsListResponse {
    /// Success
    Success
    (Paginated)
    ,
    /// Invalid parameters.
    InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Feed not found.
    FeedNotFound
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsCreateResponse {
    /// Success
    Success
    (models::CatalogsFeed)
    ,
    /// Invalid feed parameters.
    InvalidFeedParameters
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Business account required.
    BusinessAccountRequired
    (models::Error)
    ,
    /// User website required.
    UserWebsiteRequired
    (models::Error)
    ,
    /// Unique feed name is required.
    UniqueFeedNameIsRequired
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsDeleteResponse {
    /// Feed deleted successfully.
    FeedDeletedSuccessfully
    ,
    /// Invalid feed parameters.
    InvalidFeedParameters
    (models::Error)
    ,
    /// Forbidden. Account not approved for feed mutations yet.
    Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    DataFeedNotFound
    (models::Error)
    ,
    /// Conflict. Can't delete a feed with active promotions.
    Conflict
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsGetResponse {
    /// Success
    Success
    (models::CatalogsFeed)
    ,
    /// Invalid feed parameters.
    InvalidFeedParameters
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Data feed not found.
    DataFeedNotFound
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsListResponse {
    /// Success
    Success
    (Paginated)
    ,
    /// Invalid parameters.
    InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsUpdateResponse {
    /// Success
    Success
    (models::CatalogsFeed)
    ,
    /// Invalid feed parameters.
    InvalidFeedParameters
    (models::Error)
    ,
    /// Forbidden. Account not approved for feed mutations yet.
    Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    DataFeedNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ItemsBatchGetResponse {
    /// Response containing the requested catalogs items batch
    ResponseContainingTheRequestedCatalogsItemsBatch
    (models::CatalogsItemsBatch)
    ,
    /// Not authorized to access catalogs items batch
    NotAuthorizedToAccessCatalogsItemsBatch
    (models::Error)
    ,
    /// Not authorized to access catalogs items batch
    NotAuthorizedToAccessCatalogsItemsBatch_2
    (models::Error)
    ,
    /// Catalogs items batch not found
    CatalogsItemsBatchNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ItemsBatchPostResponse {
    /// Response containing the requested catalogs items batch
    ResponseContainingTheRequestedCatalogsItemsBatch
    (models::CatalogsItemsBatch)
    ,
    /// Not authorized to post catalogs items
    NotAuthorizedToPostCatalogsItems
    (models::Error)
    ,
    /// Not authorized to post catalogs items
    NotAuthorizedToPostCatalogsItems_2
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ItemsGetResponse {
    /// Response containing the requested catalogs items
    ResponseContainingTheRequestedCatalogsItems
    (models::CatalogsItems)
    ,
    /// Not authorized to access catalogs items
    NotAuthorizedToAccessCatalogsItems
    (models::Error)
    ,
    /// Not authorized to access catalogs items
    NotAuthorizedToAccessCatalogsItems_2
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MediaCreateResponse {
    /// response
    Response
    (models::MediaUpload)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MediaGetResponse {
    /// response
    Response
    (models::MediaUploadDetails)
    ,
    /// Media upload not found
    MediaUploadNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MediaListResponse {
    /// response
    Response
    (Paginated)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum OauthTokenResponse {
    /// response
    Response
    (models::OauthAccessTokenResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsAnalyticsResponse {
    /// response
    Response
    (std::collections::HashMap<String, models::AnalyticsMetricsResponse>)
    ,
    /// Not authorized to access board or Pin.
    NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Pin not found.
    PinNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsCreateResponse {
    /// Successful pin creation.
    SuccessfulPinCreation
    (models::Pin)
    ,
    /// Invalid Pin parameters response
    InvalidPinParametersResponse
    (models::Error)
    ,
    /// The Pin's image is too small, too large or is broken
    ThePin
    (models::Error)
    ,
    /// Board or section not found
    BoardOrSectionNotFound
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsDeleteResponse {
    /// Successfully deleted Pin
    SuccessfullyDeletedPin
    ,
    /// Not authorized to access board or Pin.
    NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Pin not found.
    PinNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsGetResponse {
    /// response
    Response
    (models::Pin)
    ,
    /// Not authorized to access board or Pin.
    NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Pin not found.
    PinNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserAccountAnalyticsResponse {
    /// Success
    Success
    (std::collections::HashMap<String, models::AnalyticsMetricsResponse>)
    ,
    /// Not authorized to access the user account analytics.
    NotAuthorizedToAccessTheUserAccountAnalytics
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserAccountGetResponse {
    /// response
    Response
    (models::Account)
    ,
    /// Not authorized to access the user account.
    NotAuthorizedToAccessTheUserAccount
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

/// API
#[async_trait]
pub trait Api<C: Send + Sync> {
    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>> {
        Poll::Ready(Ok(()))
    }

    /// Get ad account analytics
    async fn ad_account_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdAccountAnalyticsResponse, ApiError>;

    /// List ad accounts
    async fn ad_accounts_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        include_shared_accounts: Option<bool>,
        context: &C) -> Result<AdAccountsListResponse, ApiError>;

    /// Get ad group analytics
    async fn ad_groups_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        ad_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdGroupsAnalyticsResponse, ApiError>;

    /// List ad groups
    async fn ad_groups_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        translate_interests_to_names: Option<bool>,
        context: &C) -> Result<AdGroupsListResponse, ApiError>;

    /// Get ad analytics
    async fn ads_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        ad_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdsAnalyticsResponse, ApiError>;

    /// List ads
    async fn ads_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        ad_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<AdsListResponse, ApiError>;

    /// Create async request for an account analytics report
    async fn analytics_create_report(
        &self,
        ad_account_id: String,
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        context: &C) -> Result<AnalyticsCreateReportResponse, ApiError>;

    /// Get the account analytics report created by the async call
    async fn analytics_get_report(
        &self,
        ad_account_id: String,
        token: String,
        context: &C) -> Result<AnalyticsGetReportResponse, ApiError>;

    /// Get campaign analytics
    async fn campaigns_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        campaign_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<CampaignsAnalyticsResponse, ApiError>;

    /// List campaigns
    async fn campaigns_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<CampaignsListResponse, ApiError>;

    /// Get product group analytics
    async fn product_groups_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        product_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<ProductGroupsAnalyticsResponse, ApiError>;

    /// Create board section
    async fn board_sections_create(
        &self,
        board_id: String,
        board_section: models::BoardSection,
        context: &C) -> Result<BoardSectionsCreateResponse, ApiError>;

    /// Delete board section
    async fn board_sections_delete(
        &self,
        board_id: String,
        section_id: String,
        context: &C) -> Result<BoardSectionsDeleteResponse, ApiError>;

    /// List board sections
    async fn board_sections_list(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsListResponse, ApiError>;

    /// List Pins on board section
    async fn board_sections_list_pins(
        &self,
        board_id: String,
        section_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsListPinsResponse, ApiError>;

    /// Update board section
    async fn board_sections_update(
        &self,
        board_id: String,
        section_id: String,
        board_section: models::BoardSection,
        context: &C) -> Result<BoardSectionsUpdateResponse, ApiError>;

    /// Create board
    async fn boards_create(
        &self,
        board: models::Board,
        context: &C) -> Result<BoardsCreateResponse, ApiError>;

    /// Delete board
    async fn boards_delete(
        &self,
        board_id: String,
        context: &C) -> Result<BoardsDeleteResponse, ApiError>;

    /// Get board
    async fn boards_get(
        &self,
        board_id: String,
        context: &C) -> Result<BoardsGetResponse, ApiError>;

    /// List boards
    async fn boards_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        privacy: Option<String>,
        context: &C) -> Result<BoardsListResponse, ApiError>;

    /// List Pins on board
    async fn boards_list_pins(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardsListPinsResponse, ApiError>;

    /// Update board
    async fn boards_update(
        &self,
        board_id: String,
        board_update: models::BoardUpdate,
        context: &C) -> Result<BoardsUpdateResponse, ApiError>;

    /// Create product group
    async fn catalogs_product_groups_create(
        &self,
        catalogs_product_group_create_request: models::CatalogsProductGroupCreateRequest,
        context: &C) -> Result<CatalogsProductGroupsCreateResponse, ApiError>;

    /// Delete product group
    async fn catalogs_product_groups_delete(
        &self,
        product_group_id: String,
        context: &C) -> Result<CatalogsProductGroupsDeleteResponse, ApiError>;

    /// Get product groups list
    async fn catalogs_product_groups_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<CatalogsProductGroupsListResponse, ApiError>;

    /// Update product group
    async fn catalogs_product_groups_update(
        &self,
        product_group_id: String,
        catalogs_product_group_update_request: models::CatalogsProductGroupUpdateRequest,
        context: &C) -> Result<CatalogsProductGroupsUpdateResponse, ApiError>;

    /// List processing results for a given feed
    async fn feed_processing_results_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<FeedProcessingResultsListResponse, ApiError>;

    /// Create feed
    async fn feeds_create(
        &self,
        catalogs_feeds_create_request: models::CatalogsFeedsCreateRequest,
        context: &C) -> Result<FeedsCreateResponse, ApiError>;

    /// Delete feed
    async fn feeds_delete(
        &self,
        feed_id: String,
        context: &C) -> Result<FeedsDeleteResponse, ApiError>;

    /// Get feed
    async fn feeds_get(
        &self,
        feed_id: String,
        context: &C) -> Result<FeedsGetResponse, ApiError>;

    /// List feeds
    async fn feeds_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<FeedsListResponse, ApiError>;

    /// Update feed
    async fn feeds_update(
        &self,
        feed_id: String,
        catalogs_feeds_update_request: models::CatalogsFeedsUpdateRequest,
        context: &C) -> Result<FeedsUpdateResponse, ApiError>;

    /// Get catalogs items batch
    async fn items_batch_get(
        &self,
        batch_id: String,
        context: &C) -> Result<ItemsBatchGetResponse, ApiError>;

    /// Perform an operation on an item batch
    async fn items_batch_post(
        &self,
        catalogs_items_batch_request: models::CatalogsItemsBatchRequest,
        context: &C) -> Result<ItemsBatchPostResponse, ApiError>;

    /// Get catalogs items
    async fn items_get(
        &self,
        country: String,
        item_ids: &Vec<String>,
        language: String,
        context: &C) -> Result<ItemsGetResponse, ApiError>;

    /// Register media upload
    async fn media_create(
        &self,
        media_upload_request: models::MediaUploadRequest,
        context: &C) -> Result<MediaCreateResponse, ApiError>;

    /// Get media upload details
    async fn media_get(
        &self,
        media_id: String,
        context: &C) -> Result<MediaGetResponse, ApiError>;

    /// List media uploads
    async fn media_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<MediaListResponse, ApiError>;

    /// Generate OAuth access token
    async fn oauth_token(
        &self,
        grant_type: String,
        context: &C) -> Result<OauthTokenResponse, ApiError>;

    /// Get Pin analytics
    async fn pins_analytics(
        &self,
        pin_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        metric_types: &Vec<String>,
        app_types: Option<String>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsAnalyticsResponse, ApiError>;

    /// Create Pin
    async fn pins_create(
        &self,
        pin: models::Pin,
        context: &C) -> Result<PinsCreateResponse, ApiError>;

    /// Delete Pin
    async fn pins_delete(
        &self,
        pin_id: String,
        context: &C) -> Result<PinsDeleteResponse, ApiError>;

    /// Get Pin
    async fn pins_get(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsGetResponse, ApiError>;

    /// Get user account analytics
    async fn user_account_analytics(
        &self,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        metric_types: Option<&Vec<String>>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountAnalyticsResponse, ApiError>;

    /// Get user account
    async fn user_account_get(
        &self,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountGetResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[async_trait]
pub trait ApiNoContext<C: Send + Sync> {

    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>>;

    fn context(&self) -> &C;

    /// Get ad account analytics
    async fn ad_account_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdAccountAnalyticsResponse, ApiError>;

    /// List ad accounts
    async fn ad_accounts_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        include_shared_accounts: Option<bool>,
        ) -> Result<AdAccountsListResponse, ApiError>;

    /// Get ad group analytics
    async fn ad_groups_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        ad_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdGroupsAnalyticsResponse, ApiError>;

    /// List ad groups
    async fn ad_groups_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        translate_interests_to_names: Option<bool>,
        ) -> Result<AdGroupsListResponse, ApiError>;

    /// Get ad analytics
    async fn ads_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        ad_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdsAnalyticsResponse, ApiError>;

    /// List ads
    async fn ads_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        ad_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<AdsListResponse, ApiError>;

    /// Create async request for an account analytics report
    async fn analytics_create_report(
        &self,
        ad_account_id: String,
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        ) -> Result<AnalyticsCreateReportResponse, ApiError>;

    /// Get the account analytics report created by the async call
    async fn analytics_get_report(
        &self,
        ad_account_id: String,
        token: String,
        ) -> Result<AnalyticsGetReportResponse, ApiError>;

    /// Get campaign analytics
    async fn campaigns_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        campaign_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<CampaignsAnalyticsResponse, ApiError>;

    /// List campaigns
    async fn campaigns_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<CampaignsListResponse, ApiError>;

    /// Get product group analytics
    async fn product_groups_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        product_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<ProductGroupsAnalyticsResponse, ApiError>;

    /// Create board section
    async fn board_sections_create(
        &self,
        board_id: String,
        board_section: models::BoardSection,
        ) -> Result<BoardSectionsCreateResponse, ApiError>;

    /// Delete board section
    async fn board_sections_delete(
        &self,
        board_id: String,
        section_id: String,
        ) -> Result<BoardSectionsDeleteResponse, ApiError>;

    /// List board sections
    async fn board_sections_list(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<BoardSectionsListResponse, ApiError>;

    /// List Pins on board section
    async fn board_sections_list_pins(
        &self,
        board_id: String,
        section_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<BoardSectionsListPinsResponse, ApiError>;

    /// Update board section
    async fn board_sections_update(
        &self,
        board_id: String,
        section_id: String,
        board_section: models::BoardSection,
        ) -> Result<BoardSectionsUpdateResponse, ApiError>;

    /// Create board
    async fn boards_create(
        &self,
        board: models::Board,
        ) -> Result<BoardsCreateResponse, ApiError>;

    /// Delete board
    async fn boards_delete(
        &self,
        board_id: String,
        ) -> Result<BoardsDeleteResponse, ApiError>;

    /// Get board
    async fn boards_get(
        &self,
        board_id: String,
        ) -> Result<BoardsGetResponse, ApiError>;

    /// List boards
    async fn boards_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        privacy: Option<String>,
        ) -> Result<BoardsListResponse, ApiError>;

    /// List Pins on board
    async fn boards_list_pins(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<BoardsListPinsResponse, ApiError>;

    /// Update board
    async fn boards_update(
        &self,
        board_id: String,
        board_update: models::BoardUpdate,
        ) -> Result<BoardsUpdateResponse, ApiError>;

    /// Create product group
    async fn catalogs_product_groups_create(
        &self,
        catalogs_product_group_create_request: models::CatalogsProductGroupCreateRequest,
        ) -> Result<CatalogsProductGroupsCreateResponse, ApiError>;

    /// Delete product group
    async fn catalogs_product_groups_delete(
        &self,
        product_group_id: String,
        ) -> Result<CatalogsProductGroupsDeleteResponse, ApiError>;

    /// Get product groups list
    async fn catalogs_product_groups_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<CatalogsProductGroupsListResponse, ApiError>;

    /// Update product group
    async fn catalogs_product_groups_update(
        &self,
        product_group_id: String,
        catalogs_product_group_update_request: models::CatalogsProductGroupUpdateRequest,
        ) -> Result<CatalogsProductGroupsUpdateResponse, ApiError>;

    /// List processing results for a given feed
    async fn feed_processing_results_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<FeedProcessingResultsListResponse, ApiError>;

    /// Create feed
    async fn feeds_create(
        &self,
        catalogs_feeds_create_request: models::CatalogsFeedsCreateRequest,
        ) -> Result<FeedsCreateResponse, ApiError>;

    /// Delete feed
    async fn feeds_delete(
        &self,
        feed_id: String,
        ) -> Result<FeedsDeleteResponse, ApiError>;

    /// Get feed
    async fn feeds_get(
        &self,
        feed_id: String,
        ) -> Result<FeedsGetResponse, ApiError>;

    /// List feeds
    async fn feeds_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<FeedsListResponse, ApiError>;

    /// Update feed
    async fn feeds_update(
        &self,
        feed_id: String,
        catalogs_feeds_update_request: models::CatalogsFeedsUpdateRequest,
        ) -> Result<FeedsUpdateResponse, ApiError>;

    /// Get catalogs items batch
    async fn items_batch_get(
        &self,
        batch_id: String,
        ) -> Result<ItemsBatchGetResponse, ApiError>;

    /// Perform an operation on an item batch
    async fn items_batch_post(
        &self,
        catalogs_items_batch_request: models::CatalogsItemsBatchRequest,
        ) -> Result<ItemsBatchPostResponse, ApiError>;

    /// Get catalogs items
    async fn items_get(
        &self,
        country: String,
        item_ids: &Vec<String>,
        language: String,
        ) -> Result<ItemsGetResponse, ApiError>;

    /// Register media upload
    async fn media_create(
        &self,
        media_upload_request: models::MediaUploadRequest,
        ) -> Result<MediaCreateResponse, ApiError>;

    /// Get media upload details
    async fn media_get(
        &self,
        media_id: String,
        ) -> Result<MediaGetResponse, ApiError>;

    /// List media uploads
    async fn media_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<MediaListResponse, ApiError>;

    /// Generate OAuth access token
    async fn oauth_token(
        &self,
        grant_type: String,
        ) -> Result<OauthTokenResponse, ApiError>;

    /// Get Pin analytics
    async fn pins_analytics(
        &self,
        pin_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        metric_types: &Vec<String>,
        app_types: Option<String>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        ) -> Result<PinsAnalyticsResponse, ApiError>;

    /// Create Pin
    async fn pins_create(
        &self,
        pin: models::Pin,
        ) -> Result<PinsCreateResponse, ApiError>;

    /// Delete Pin
    async fn pins_delete(
        &self,
        pin_id: String,
        ) -> Result<PinsDeleteResponse, ApiError>;

    /// Get Pin
    async fn pins_get(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        ) -> Result<PinsGetResponse, ApiError>;

    /// Get user account analytics
    async fn user_account_analytics(
        &self,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        metric_types: Option<&Vec<String>>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountAnalyticsResponse, ApiError>;

    /// Get user account
    async fn user_account_get(
        &self,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountGetResponse, ApiError>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<C: Send + Sync> where Self: Sized
{
    /// Binds this API to a context.
    fn with_context(self: Self, context: C) -> ContextWrapper<Self, C>;
}

impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ContextWrapperExt<C> for T {
    fn with_context(self: T, context: C) -> ContextWrapper<T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

#[async_trait]
impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ApiNoContext<C> for ContextWrapper<T, C> {
    fn poll_ready(&self, cx: &mut Context) -> Poll<Result<(), ServiceError>> {
        self.api().poll_ready(cx)
    }

    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    /// Get ad account analytics
    async fn ad_account_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdAccountAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_account_analytics(ad_account_id, start_date, end_date, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, &context).await
    }

    /// List ad accounts
    async fn ad_accounts_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        include_shared_accounts: Option<bool>,
        ) -> Result<AdAccountsListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_list(bookmark, page_size, include_shared_accounts, &context).await
    }

    /// Get ad group analytics
    async fn ad_groups_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        ad_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdGroupsAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_analytics(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, &context).await
    }

    /// List ad groups
    async fn ad_groups_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        translate_interests_to_names: Option<bool>,
        ) -> Result<AdGroupsListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_list(ad_account_id, campaign_ids, ad_group_ids, entity_statuses, page_size, order, bookmark, translate_interests_to_names, &context).await
    }

    /// Get ad analytics
    async fn ads_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        ad_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdsAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_analytics(ad_account_id, start_date, end_date, ad_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, &context).await
    }

    /// List ads
    async fn ads_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        ad_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<AdsListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_list(ad_account_id, campaign_ids, ad_group_ids, ad_ids, entity_statuses, page_size, order, bookmark, &context).await
    }

    /// Create async request for an account analytics report
    async fn analytics_create_report(
        &self,
        ad_account_id: String,
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        ) -> Result<AnalyticsCreateReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().analytics_create_report(ad_account_id, ads_analytics_create_async_request, &context).await
    }

    /// Get the account analytics report created by the async call
    async fn analytics_get_report(
        &self,
        ad_account_id: String,
        token: String,
        ) -> Result<AnalyticsGetReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().analytics_get_report(ad_account_id, token, &context).await
    }

    /// Get campaign analytics
    async fn campaigns_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        campaign_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<CampaignsAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_analytics(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, &context).await
    }

    /// List campaigns
    async fn campaigns_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<CampaignsListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_list(ad_account_id, campaign_ids, entity_statuses, page_size, order, bookmark, &context).await
    }

    /// Get product group analytics
    async fn product_groups_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        product_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<ProductGroupsAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_groups_analytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, &context).await
    }

    /// Create board section
    async fn board_sections_create(
        &self,
        board_id: String,
        board_section: models::BoardSection,
        ) -> Result<BoardSectionsCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_create(board_id, board_section, &context).await
    }

    /// Delete board section
    async fn board_sections_delete(
        &self,
        board_id: String,
        section_id: String,
        ) -> Result<BoardSectionsDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_delete(board_id, section_id, &context).await
    }

    /// List board sections
    async fn board_sections_list(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<BoardSectionsListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_list(board_id, bookmark, page_size, &context).await
    }

    /// List Pins on board section
    async fn board_sections_list_pins(
        &self,
        board_id: String,
        section_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<BoardSectionsListPinsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_list_pins(board_id, section_id, bookmark, page_size, &context).await
    }

    /// Update board section
    async fn board_sections_update(
        &self,
        board_id: String,
        section_id: String,
        board_section: models::BoardSection,
        ) -> Result<BoardSectionsUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_update(board_id, section_id, board_section, &context).await
    }

    /// Create board
    async fn boards_create(
        &self,
        board: models::Board,
        ) -> Result<BoardsCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_create(board, &context).await
    }

    /// Delete board
    async fn boards_delete(
        &self,
        board_id: String,
        ) -> Result<BoardsDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_delete(board_id, &context).await
    }

    /// Get board
    async fn boards_get(
        &self,
        board_id: String,
        ) -> Result<BoardsGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_get(board_id, &context).await
    }

    /// List boards
    async fn boards_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        privacy: Option<String>,
        ) -> Result<BoardsListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_list(bookmark, page_size, privacy, &context).await
    }

    /// List Pins on board
    async fn boards_list_pins(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<BoardsListPinsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_list_pins(board_id, bookmark, page_size, &context).await
    }

    /// Update board
    async fn boards_update(
        &self,
        board_id: String,
        board_update: models::BoardUpdate,
        ) -> Result<BoardsUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_update(board_id, board_update, &context).await
    }

    /// Create product group
    async fn catalogs_product_groups_create(
        &self,
        catalogs_product_group_create_request: models::CatalogsProductGroupCreateRequest,
        ) -> Result<CatalogsProductGroupsCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_create(catalogs_product_group_create_request, &context).await
    }

    /// Delete product group
    async fn catalogs_product_groups_delete(
        &self,
        product_group_id: String,
        ) -> Result<CatalogsProductGroupsDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_delete(product_group_id, &context).await
    }

    /// Get product groups list
    async fn catalogs_product_groups_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<CatalogsProductGroupsListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_list(feed_id, bookmark, page_size, &context).await
    }

    /// Update product group
    async fn catalogs_product_groups_update(
        &self,
        product_group_id: String,
        catalogs_product_group_update_request: models::CatalogsProductGroupUpdateRequest,
        ) -> Result<CatalogsProductGroupsUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_update(product_group_id, catalogs_product_group_update_request, &context).await
    }

    /// List processing results for a given feed
    async fn feed_processing_results_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<FeedProcessingResultsListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feed_processing_results_list(feed_id, bookmark, page_size, &context).await
    }

    /// Create feed
    async fn feeds_create(
        &self,
        catalogs_feeds_create_request: models::CatalogsFeedsCreateRequest,
        ) -> Result<FeedsCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_create(catalogs_feeds_create_request, &context).await
    }

    /// Delete feed
    async fn feeds_delete(
        &self,
        feed_id: String,
        ) -> Result<FeedsDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_delete(feed_id, &context).await
    }

    /// Get feed
    async fn feeds_get(
        &self,
        feed_id: String,
        ) -> Result<FeedsGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_get(feed_id, &context).await
    }

    /// List feeds
    async fn feeds_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<FeedsListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_list(bookmark, page_size, &context).await
    }

    /// Update feed
    async fn feeds_update(
        &self,
        feed_id: String,
        catalogs_feeds_update_request: models::CatalogsFeedsUpdateRequest,
        ) -> Result<FeedsUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_update(feed_id, catalogs_feeds_update_request, &context).await
    }

    /// Get catalogs items batch
    async fn items_batch_get(
        &self,
        batch_id: String,
        ) -> Result<ItemsBatchGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().items_batch_get(batch_id, &context).await
    }

    /// Perform an operation on an item batch
    async fn items_batch_post(
        &self,
        catalogs_items_batch_request: models::CatalogsItemsBatchRequest,
        ) -> Result<ItemsBatchPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().items_batch_post(catalogs_items_batch_request, &context).await
    }

    /// Get catalogs items
    async fn items_get(
        &self,
        country: String,
        item_ids: &Vec<String>,
        language: String,
        ) -> Result<ItemsGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().items_get(country, item_ids, language, &context).await
    }

    /// Register media upload
    async fn media_create(
        &self,
        media_upload_request: models::MediaUploadRequest,
        ) -> Result<MediaCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().media_create(media_upload_request, &context).await
    }

    /// Get media upload details
    async fn media_get(
        &self,
        media_id: String,
        ) -> Result<MediaGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().media_get(media_id, &context).await
    }

    /// List media uploads
    async fn media_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<MediaListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().media_list(bookmark, page_size, &context).await
    }

    /// Generate OAuth access token
    async fn oauth_token(
        &self,
        grant_type: String,
        ) -> Result<OauthTokenResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().oauth_token(grant_type, &context).await
    }

    /// Get Pin analytics
    async fn pins_analytics(
        &self,
        pin_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        metric_types: &Vec<String>,
        app_types: Option<String>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        ) -> Result<PinsAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_analytics(pin_id, start_date, end_date, metric_types, app_types, split_field, ad_account_id, &context).await
    }

    /// Create Pin
    async fn pins_create(
        &self,
        pin: models::Pin,
        ) -> Result<PinsCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_create(pin, &context).await
    }

    /// Delete Pin
    async fn pins_delete(
        &self,
        pin_id: String,
        ) -> Result<PinsDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_delete(pin_id, &context).await
    }

    /// Get Pin
    async fn pins_get(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        ) -> Result<PinsGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_get(pin_id, ad_account_id, &context).await
    }

    /// Get user account analytics
    async fn user_account_analytics(
        &self,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        metric_types: Option<&Vec<String>>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_account_analytics(start_date, end_date, from_claimed_content, pin_format, app_types, metric_types, split_field, ad_account_id, &context).await
    }

    /// Get user account
    async fn user_account_get(
        &self,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_account_get(ad_account_id, &context).await
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
