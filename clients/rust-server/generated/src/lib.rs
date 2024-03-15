#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]
#![allow(unused_imports, unused_attributes)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use futures::Stream;
use std::error::Error;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper};
use serde::{Serialize, Deserialize};

type ServiceError = Box<dyn Error + Send + Sync + 'static>;

pub const BASE_PATH: &str = "/v5";
pub const API_VERSION: &str = "5.12.0";

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountSlashAnalyticsResponse {
    /// Success
    Success
    (Vec<models::AdAccountAnalyticsResponseInner>)
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
pub enum AdAccountTargetingAnalyticsSlashGetResponse {
    /// Success
    Success
    (models::MetricsResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSlashCreateResponse {
    /// Success
    Success
    (models::AdAccount)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSlashGetResponse {
    /// Success
    Success
    (models::AdAccount)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSlashListResponse {
    /// response
    Response
    (models::AdAccountsList200Response)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsSlashCreateMmmReportResponse {
    /// Success
    Success
    (models::CreateMmmReportResponse)
    ,
    /// Invalid ad account ads analytics mmm parameters
    InvalidAdAccountAdsAnalyticsMmmParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsSlashCreateReportResponse {
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
pub enum AnalyticsSlashCreateTemplateReportResponse {
    /// Success
    Success
    (models::AdsAnalyticsCreateAsyncResponse)
    ,
    /// Invalid ad account ads analytics template parameters.
    InvalidAdAccountAdsAnalyticsTemplateParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AnalyticsSlashGetMmmReportResponse {
    /// Success
    Success
    (models::GetMmmReportResponse)
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
pub enum AnalyticsSlashGetReportResponse {
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
pub enum SandboxSlashDeleteResponse {
    /// OK
    OK
    (String)
    ,
    /// Invalid ad account id.
    InvalidAdAccountId
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TemplatesSlashListResponse {
    /// Success
    Success
    (models::TemplatesList200Response)
    ,
    /// Invalid ad account template parameters.
    InvalidAdAccountTemplateParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsBidFloorSlashGetResponse {
    /// Success
    Success
    (models::BidFloor)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsSlashAnalyticsResponse {
    /// Success
    Success
    (Vec<models::AdGroupsAnalyticsResponseInner>)
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
pub enum AdGroupsSlashAudienceSizingResponse {
    /// Success
    Success
    (models::AdGroupAudienceSizingResponse)
    ,
    /// Invalid ad group audience sizing parameters.
    InvalidAdGroupAudienceSizingParameters
    (models::Error)
    ,
    /// No access to requested audience list or product group.
    NoAccessToRequestedAudienceListOrProductGroup
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsSlashCreateResponse {
    /// Success
    Success
    (models::AdGroupArrayResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsSlashGetResponse {
    /// Success
    Success
    (models::AdGroupResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsSlashListResponse {
    /// Success
    Success
    (models::AdGroupsList200Response)
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
pub enum AdGroupsSlashUpdateResponse {
    /// Success
    Success
    (models::AdGroupArrayResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdGroupsTargetingAnalyticsSlashGetResponse {
    /// Success
    Success
    (models::MetricsResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdPreviewsSlashCreateResponse {
    /// Successful ad preview creation.
    SuccessfulAdPreviewCreation
    (models::AdPreviewUrlResponse)
    ,
    /// Invalid Pin parameters response
    InvalidPinParametersResponse
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdTargetingAnalyticsSlashGetResponse {
    /// Success
    Success
    (models::MetricsResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsSlashAnalyticsResponse {
    /// Success
    Success
    (Vec<models::AdsAnalyticsResponseInner>)
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
pub enum AdsSlashCreateResponse {
    /// Success
    Success
    (models::AdArrayResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsSlashGetResponse {
    /// Success
    Success
    (models::AdResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsSlashListResponse {
    /// Success
    Success
    (models::AdsList200Response)
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
pub enum AdsSlashUpdateResponse {
    /// Success
    Success
    (models::AdArrayResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudienceInsightsScopeAndTypeSlashGetResponse {
    /// Success
    Success
    (models::AudienceDefinitionResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudienceInsightsSlashGetResponse {
    /// Success
    Success
    (models::AudienceInsightsResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudiencesSlashCreateResponse {
    /// Success
    Success
    (models::Audience)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudiencesSlashCreateCustomResponse {
    /// Success
    Success
    (models::Audience)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudiencesSlashGetResponse {
    /// Success
    Success
    (models::Audience)
    ,
    /// Audience not found.
    AudienceNotFound
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudiencesSlashListResponse {
    /// Success
    Success
    (models::AudiencesList200Response)
    ,
    /// Invalid ad account audience parameters.
    InvalidAdAccountAudienceParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AudiencesSlashUpdateResponse {
    /// Success
    Success
    (models::Audience)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsCreditSlashRedeemResponse {
    /// Successfully redeemed ad credits.
    SuccessfullyRedeemedAdCredits
    (models::AdsCreditRedeemResponse)
    ,
    /// Error thrown when unable to redeem offer code.
    ErrorThrownWhenUnableToRedeemOfferCode
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdsCreditsDiscountsSlashGetResponse {
    /// Success
    Success
    (models::AdsCreditsDiscountsGet200Response)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BillingProfilesSlashGetResponse {
    /// Success
    Success
    (models::BillingProfilesGet200Response)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioAccountsSlashGetResponse {
    /// Success
    Success
    (models::SsioAccountResponse)
    ,
    /// Invalid request parameter.
    InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioInsertionOrderSlashCreateResponse {
    /// Success
    Success
    (models::SsioCreateInsertionOrderResponse)
    ,
    /// Invalid request.
    InvalidRequest
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioInsertionOrderSlashEditResponse {
    /// Success
    Success
    (models::SsioEditInsertionOrderResponse)
    ,
    /// Invalid request.
    InvalidRequest
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioInsertionOrdersStatusSlashGetByAdAccountResponse {
    /// Success
    Success
    (models::SsioInsertionOrdersStatusGetByAdAccount200Response)
    ,
    /// Invalid request parameter.
    InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse {
    /// Success
    Success
    (models::SsioInsertionOrderStatusResponse)
    ,
    /// Invalid request parameter.
    InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SsioOrderLinesSlashGetByAdAccountResponse {
    /// Success
    Success
    (models::SsioOrderLinesGetByAdAccount200Response)
    ,
    /// Invalid request parameter.
    InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsSlashCreateResponse {
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
pub enum BoardSectionsSlashDeleteResponse {
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
pub enum BoardSectionsSlashListResponse {
    /// response
    Response
    (models::BoardSectionsList200Response)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardSectionsSlashListPinsResponse {
    /// response
    Response
    (models::BoardsListPins200Response)
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
pub enum BoardSectionsSlashUpdateResponse {
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
pub enum BoardsSlashCreateResponse {
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
pub enum BoardsSlashDeleteResponse {
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
pub enum BoardsSlashGetResponse {
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
pub enum BoardsSlashListResponse {
    /// response
    Response
    (models::BoardsList200Response)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsSlashListPinsResponse {
    /// response
    Response
    (models::BoardsListPins200Response)
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
pub enum BoardsSlashUpdateResponse {
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
pub enum BulkDownloadSlashCreateResponse {
    /// Success
    Success
    (models::BulkDownloadResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BulkRequestSlashGetResponse {
    /// Success
    Success
    (models::BulkUpsertStatusResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BulkUpsertSlashCreateResponse {
    /// Success
    Success
    (models::BulkUpsertResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignTargetingAnalyticsSlashGetResponse {
    /// Success
    Success
    (models::MetricsResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignsSlashAnalyticsResponse {
    /// Success
    Success
    (Vec<models::CampaignsAnalyticsResponseInner>)
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
pub enum CampaignsSlashCreateResponse {
    /// response
    Response
    (models::CampaignCreateResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignsSlashGetResponse {
    /// Success
    Success
    (models::CampaignResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CampaignsSlashListResponse {
    /// Success
    Success
    (models::CampaignsList200Response)
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
pub enum CampaignsSlashUpdateResponse {
    /// response
    Response
    (models::CampaignUpdateResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupPinsSlashListResponse {
    /// Success
    Success
    (models::CatalogsProductGroupPinsList200Response)
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
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsSlashCreateResponse {
    /// Success
    Success
    (models::CatalogsProductGroupsCreate201Response)
    ,
    /// Invalid body.
    InvalidBody
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
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
pub enum CatalogsProductGroupsSlashDeleteResponse {
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
    /// Forbidden. Account not approved for catalog product group mutations yet.
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
pub enum CatalogsProductGroupsSlashGetResponse {
    /// Success
    Success
    (models::CatalogsProductGroupsCreate201Response)
    ,
    /// Invalid catalogs product group id parameters.
    InvalidCatalogsProductGroupIdParameters
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't get a catalogs product group without an existing catalog.
    Conflict
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsSlashListResponse {
    /// Success
    Success
    (models::CatalogsProductGroupsList200Response)
    ,
    /// Invalid feed parameters.
    InvalidFeedParameters
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
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
pub enum CatalogsProductGroupsSlashProductCountsGetResponse {
    /// Success
    Success
    (models::CatalogsProductGroupProductCounts)
    ,
    /// Product Group Not Found.
    ProductGroupNotFound
    (models::Error)
    ,
    /// Can't access this feature without an existing catalog.
    Can
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CatalogsProductGroupsSlashUpdateResponse {
    /// Success
    Success
    (models::CatalogsProductGroupsCreate201Response)
    ,
    /// Invalid parameters.
    InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Forbidden
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
pub enum CatalogsSlashListResponse {
    /// Success
    Success
    (models::CatalogsList200Response)
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
pub enum FeedProcessingResultsSlashListResponse {
    /// Success
    Success
    (models::FeedProcessingResultsList200Response)
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
pub enum FeedsSlashCreateResponse {
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
    /// Not implemented (absent \"default_country\" or \"default_locale\").
    NotImplemented
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FeedsSlashDeleteResponse {
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
pub enum FeedsSlashGetResponse {
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
pub enum FeedsSlashListResponse {
    /// Success
    Success
    (models::FeedsList200Response)
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
pub enum FeedsSlashUpdateResponse {
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
pub enum ItemsBatchSlashGetResponse {
    /// Response containing the requested catalogs items batch
    ResponseContainingTheRequestedCatalogsItemsBatch
    (models::CatalogsItemsBatch)
    ,
    /// Not authenticated to access catalogs items batch
    NotAuthenticatedToAccessCatalogsItemsBatch
    (models::Error)
    ,
    /// Not authorized to access catalogs items batch
    NotAuthorizedToAccessCatalogsItemsBatch
    (models::Error)
    ,
    /// Catalogs items batch not found
    CatalogsItemsBatchNotFound
    (models::Error)
    ,
    /// Method Not Allowed.
    MethodNotAllowed
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ItemsBatchSlashPostResponse {
    /// Response containing the requested catalogs items batch
    ResponseContainingTheRequestedCatalogsItemsBatch
    (models::CatalogsItemsBatch)
    ,
    /// Invalid request parameters.
    InvalidRequestParameters
    (models::Error)
    ,
    /// Not authenticated to post catalogs items
    NotAuthenticatedToPostCatalogsItems
    (models::Error)
    ,
    /// Not authorized to post catalogs items
    NotAuthorizedToPostCatalogsItems
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ItemsIssuesSlashListResponse {
    /// Success
    Success
    (models::ItemsIssuesList200Response)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Processing Result not found.
    ProcessingResultNotFound
    (models::Error)
    ,
    /// Not implemented.
    NotImplemented
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ItemsSlashGetResponse {
    /// Response containing the requested catalogs items
    ResponseContainingTheRequestedCatalogsItems
    (models::CatalogsItems)
    ,
    /// Invalid request parameters.
    InvalidRequestParameters
    (models::Error)
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
pub enum ProductsByProductGroupFilterSlashListResponse {
    /// Success
    Success
    (models::CatalogsProductGroupPinsList200Response)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Conflict. Can't get products.
    Conflict
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum EventsSlashCreateResponse {
    /// Success
    Success
    (models::ConversionApiResponse)
    ,
    /// The request was invalid.
    TheRequestWasInvalid
    (models::Error)
    ,
    /// Not authorized to send conversion events
    NotAuthorizedToSendConversionEvents
    (models::Error)
    ,
    /// Unauthorized access.
    UnauthorizedAccess
    (models::Error)
    ,
    /// Not all events were successfully processed.
    NotAllEventsWereSuccessfullyProcessed
    (models::DetailedError)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.
    ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// The endpoint has been ramped down and is currently not accepting any traffic.
    TheEndpointHasBeenRampedDownAndIsCurrentlyNotAcceptingAnyTraffic
    (models::Error)
    ,
    /// Unexpected errors
    UnexpectedErrors
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConversionTagsSlashCreateResponse {
    /// Success
    Success
    (models::ConversionTagResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConversionTagsSlashGetResponse {
    /// Success
    Success
    (models::ConversionTagResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ConversionTagsSlashListResponse {
    /// Success
    Success
    (models::ConversionTagListResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum OcpmEligibleConversionTagsSlashGetResponse {
    /// Success
    Success
    (std::collections::HashMap<String, Vec<models::ConversionEventResponse>>)
    ,
    /// Unexpected errors
    UnexpectedErrors
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PageVisitConversionTagsSlashGetResponse {
    /// Success
    Success
    (models::PageVisitConversionTagsGet200Response)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerListsSlashCreateResponse {
    /// Success
    Success
    (models::CustomerList)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerListsSlashGetResponse {
    /// Success
    Success
    (models::CustomerList)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerListsSlashListResponse {
    /// Success
    Success
    (models::CustomerListsList200Response)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CustomerListsSlashUpdateResponse {
    /// Success
    Success
    (models::CustomerList)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsCommerceSlashDelResponse {
    /// Commerce Integration deleted successfully
    CommerceIntegrationDeletedSuccessfully
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsCommerceSlashGetResponse {
    /// Success
    Success
    (models::IntegrationMetadata)
    ,
    /// Integration not found.
    IntegrationNotFound
    (models::Error)
    ,
    /// Can't access this integration metadata.
    Can
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsCommerceSlashPatchResponse {
    /// Success
    Success
    (models::IntegrationMetadata)
    ,
    /// Integration not found.
    IntegrationNotFound
    (models::Error)
    ,
    /// Can't access this integration metadata.
    Can
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsCommerceSlashPostResponse {
    /// Success
    Success
    (models::IntegrationMetadata)
    ,
    /// Integration not found.
    IntegrationNotFound
    (models::Error)
    ,
    /// Can't access this integration metadata.
    Can
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsLogsSlashPostResponse {
    /// Success.
    Success
    (models::IntegrationLogsSuccessResponse)
    ,
    /// Bad request.
    BadRequest
    (models::DetailedError)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsSlashGetByIdResponse {
    /// Success
    Success
    (models::IntegrationRecord)
    ,
    /// Integration not found.
    IntegrationNotFound
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum IntegrationsSlashGetListResponse {
    /// Success
    Success
    (models::IntegrationsGetList200Response)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CountryKeywordsMetricsSlashGetResponse {
    /// Success
    Success
    (models::KeywordsMetricsArrayResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum KeywordsSlashCreateResponse {
    /// Success
    Success
    (models::KeywordsResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum KeywordsSlashGetResponse {
    /// Success
    Success
    (models::KeywordsGet200Response)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum KeywordsSlashUpdateResponse {
    /// Success
    Success
    (models::KeywordsResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TrendingKeywordsSlashListResponse {
    /// Success
    Success
    (models::TrendingKeywordsResponse)
    ,
    /// Invalid trending keywords request parameters
    InvalidTrendingKeywordsRequestParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSubscriptionsSlashDelByIdResponse {
    /// Subscription deleted successfully
    SubscriptionDeletedSuccessfully
    ,
    /// Invalid input parameters.
    InvalidInputParameters
    (models::Error)
    ,
    /// You are not authorized to delete this subscription.
    YouAreNotAuthorizedToDeleteThisSubscription
    (models::Error)
    ,
    /// Subscription not found.
    SubscriptionNotFound
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSubscriptionsSlashGetByIdResponse {
    /// Success
    Success
    (models::AdAccountGetSubscriptionResponse)
    ,
    /// Invalid input parameters.
    InvalidInputParameters
    (models::Error)
    ,
    /// Can't access this subscription.
    Can
    (models::Error)
    ,
    /// Subscription not found.
    SubscriptionNotFound
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSubscriptionsSlashGetListResponse {
    /// Success
    Success
    (models::AdAccountsSubscriptionsGetList200Response)
    ,
    /// Can't access this subscription.
    Can
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountsSubscriptionsSlashPostResponse {
    /// Success
    Success
    (models::AdAccountCreateSubscriptionResponse)
    ,
    /// Invalid input parameters.
    InvalidInputParameters
    (models::Error)
    ,
    /// Can't access this subscription.
    Can
    (models::Error)
    ,
    /// Unexpected error.
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadFormSlashGetResponse {
    /// Success
    Success
    (models::LeadFormResponse)
    ,
    /// Invalid ad account lead forms parameters.
    InvalidAdAccountLeadFormsParameters
    (models::Error)
    ,
    /// The lead form ID for the given ad account ID does not exist.
    TheLeadFormIDForTheGivenAdAccountIDDoesNotExist
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadFormTestSlashCreateResponse {
    /// Success
    Success
    (models::LeadFormTestResponse)
    ,
    /// Invalid parameters.
    InvalidParameters
    (models::Error)
    ,
    /// Lead not found.
    LeadNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadFormsSlashListResponse {
    /// Success
    Success
    (models::LeadFormsList200Response)
    ,
    /// Invalid ad account lead forms parameters.
    InvalidAdAccountLeadFormsParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MediaSlashCreateResponse {
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
pub enum MediaSlashGetResponse {
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
pub enum MediaSlashListResponse {
    /// response
    Response
    (models::MediaList200Response)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum OauthSlashTokenResponse {
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
pub enum OrderLinesSlashGetResponse {
    /// Success
    Success
    (models::OrderLine)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum OrderLinesSlashListResponse {
    /// Success
    Success
    (models::OrderLinesList200Response)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsSlashAnalyticsResponse {
    /// response
    Response
    (std::collections::HashMap<String, models::PinAnalyticsMetricsResponse>)
    ,
    /// Invalid pins analytics parameters.
    InvalidPinsAnalyticsParameters
    (models::Error)
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
pub enum PinsSlashCreateResponse {
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
pub enum PinsSlashDeleteResponse {
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
pub enum PinsSlashGetResponse {
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
pub enum PinsSlashListResponse {
    /// Success
    Success
    (models::PinsList200Response)
    ,
    /// Invalid pin filter value
    InvalidPinFilterValue
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsSlashSaveResponse {
    /// Successfully saved pin.
    SuccessfullySavedPin
    (models::Pin)
    ,
    /// Not authorized to access Board or Pin.
    NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Board or Pin not found.
    BoardOrPinNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum PinsSlashUpdateResponse {
    /// response
    Response
    (models::Pin)
    ,
    /// Not authorized to update Pin.
    NotAuthorizedToUpdatePin
    (models::Error)
    ,
    /// Pin not found.
    PinNotFound
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
pub enum ProductGroupPromotionsSlashCreateResponse {
    /// Success
    Success
    (models::ProductGroupPromotionResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductGroupPromotionsSlashGetResponse {
    /// Success
    Success
    (models::ProductGroupPromotionResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductGroupPromotionsSlashListResponse {
    /// Success
    Success
    (models::ProductGroupPromotionsList200Response)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductGroupPromotionsSlashUpdateResponse {
    /// Success
    Success
    (models::ProductGroupPromotionResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ProductGroupsSlashAnalyticsResponse {
    /// Success
    Success
    (Vec<models::ProductGroupAnalyticsResponseInner>)
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
pub enum AdAccountsCatalogsProductGroupsSlashListResponse {
    /// Success
    Success
    (models::AdAccountsCatalogsProductGroupsList200Response)
    ,
    /// Invalid ad account ads parameters.
    InvalidAdAccountAdsParameters
    (models::Error)
    ,
    /// Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest.
    AccessDenied
    (models::Error)
    ,
    /// Merchant data not found.
    MerchantDataNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum AdAccountCountriesSlashGetResponse {
    /// Success
    Success
    (models::AdAccountsCountryResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeliveryMetricsSlashGetResponse {
    /// Success
    Success
    (models::DeliveryMetricsResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum InterestTargetingOptionsSlashGetResponse {
    /// Success
    Success
    (models::SingleInterestTargetingOptionResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LeadFormQuestionsSlashGetResponse {
    /// Success
    Success
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum MetricsReadyStateSlashGetResponse {
    /// Success
    Success
    (models::BookClosedResponse)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TargetingOptionsSlashGetResponse {
    /// Success
    Success
    (Vec<serde_json::Value>)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SearchPartnerPinsResponse {
    /// Success
    Success
    (models::SearchPartnerPins200Response)
    ,
    /// Invalid pins
    InvalidPins
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SearchUserBoardsSlashGetResponse {
    /// response
    Response
    (models::SearchUserBoardsGet200Response)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum SearchUserPinsSlashListResponse {
    /// Success
    Success
    (models::PinsList200Response)
    ,
    /// User not found
    UserNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TermsRelatedSlashListResponse {
    /// Success
    Success
    (models::RelatedTerms)
    ,
    /// Invalid terms related parameters.
    InvalidTermsRelatedParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TermsSuggestedSlashListResponse {
    /// Success
    Success
    (Vec<String>)
    ,
    /// Invalid terms suggested parameters.
    InvalidTermsSuggestedParameters
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum TermsOfServiceSlashGetResponse {
    /// Success
    Success
    (models::TermsOfService)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum BoardsUserFollowsSlashListResponse {
    /// Success
    Success
    (models::BoardsUserFollowsList200Response)
    ,
    /// Invalid user id
    InvalidUserId
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FollowUserSlashUpdateResponse {
    /// Success
    Success
    (models::UserSummary)
    ,
    /// User not found
    UserNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum FollowersSlashListResponse {
    /// Success
    Success
    (models::FollowersList200Response)
    ,
    /// Invalid user id
    InvalidUserId
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum LinkedBusinessAccountsSlashGetResponse {
    /// Success
    Success
    (Vec<models::LinkedBusiness>)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UnverifyWebsiteSlashDeleteResponse {
    /// Successfully unverified website
    SuccessfullyUnverifiedWebsite
    ,
    /// Website not in user list.
    WebsiteNotInUserList
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserAccountSlashAnalyticsResponse {
    /// Success
    Success
    (std::collections::HashMap<String, models::AnalyticsMetricsResponse>)
    ,
    /// Invalid user accounts analytics parameters.
    InvalidUserAccountsAnalyticsParameters
    (models::Error)
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
pub enum UserAccountSlashAnalyticsSlashTopPinsResponse {
    /// Success
    Success
    (models::TopPinsAnalyticsResponse)
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
pub enum UserAccountSlashAnalyticsSlashTopVideoPinsResponse {
    /// Success
    Success
    (models::TopVideoPinsAnalyticsResponse)
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
pub enum UserAccountSlashFollowedInterestsResponse {
    /// Success
    Success
    (models::UserAccountFollowedInterests200Response)
    ,
    /// Invalid parameters
    InvalidParameters
    (models::Error)
    ,
    /// Authorization failed
    AuthorizationFailed
    (models::Error)
    ,
    /// User not found
    UserNotFound
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserAccountSlashGetResponse {
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserFollowingSlashGetResponse {
    /// response
    Response
    (models::UserFollowingGet200Response)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UserWebsitesSlashGetResponse {
    /// Success
    Success
    (models::UserWebsitesGet200Response)
    ,
    /// Not authorized to access the user website list.
    NotAuthorizedToAccessTheUserWebsiteList
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum VerifyWebsiteSlashUpdateResponse {
    /// Success
    Success
    (models::UserWebsiteSummary)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum WebsiteVerificationSlashGetResponse {
    /// Success
    Success
    (models::UserWebsiteVerificationCode)
    ,
    /// Not authorized to access the user verification code for website claiming.
    NotAuthorizedToAccessTheUserVerificationCodeForWebsiteClaiming
    (models::Error)
    ,
    /// Unexpected error
    UnexpectedError
    (models::Error)
}

/// API
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait Api<C: Send + Sync> {
    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>> {
        Poll::Ready(Ok(()))
    }

    /// Get ad account analytics
    async fn ad_account_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdAccountSlashAnalyticsResponse, ApiError>;

    /// Get targeting analytics for an ad account
    async fn ad_account_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<AdAccountTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Create ad account
    async fn ad_accounts_slash_create(
        &self,
        ad_account_create_request: models::AdAccountCreateRequest,
        context: &C) -> Result<AdAccountsSlashCreateResponse, ApiError>;

    /// Get ad account
    async fn ad_accounts_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<AdAccountsSlashGetResponse, ApiError>;

    /// List ad accounts
    async fn ad_accounts_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        include_shared_accounts: Option<bool>,
        context: &C) -> Result<AdAccountsSlashListResponse, ApiError>;

    /// Create a request for a Marketing Mix Modeling (MMM) report
    async fn analytics_slash_create_mmm_report(
        &self,
        ad_account_id: String,
        create_mmm_report_request: models::CreateMmmReportRequest,
        context: &C) -> Result<AnalyticsSlashCreateMmmReportResponse, ApiError>;

    /// Create async request for an account analytics report
    async fn analytics_slash_create_report(
        &self,
        ad_account_id: String,
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        context: &C) -> Result<AnalyticsSlashCreateReportResponse, ApiError>;

    /// Create async request for an analytics report using a template
    async fn analytics_slash_create_template_report(
        &self,
        ad_account_id: String,
        template_id: String,
        start_date: Option<chrono::naive::NaiveDate>,
        end_date: Option<chrono::naive::NaiveDate>,
        granularity: Option<models::Granularity>,
        context: &C) -> Result<AnalyticsSlashCreateTemplateReportResponse, ApiError>;

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
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<TemplatesSlashListResponse, ApiError>;

    /// Get bid floors
    async fn ad_groups_bid_floor_slash_get(
        &self,
        ad_account_id: String,
        bid_floor_request: models::BidFloorRequest,
        context: &C) -> Result<AdGroupsBidFloorSlashGetResponse, ApiError>;

    /// Get ad group analytics
    async fn ad_groups_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdGroupsSlashAnalyticsResponse, ApiError>;

    /// Get audience sizing
    async fn ad_groups_slash_audience_sizing(
        &self,
        ad_account_id: String,
        ad_group_audience_sizing_request: Option<models::AdGroupAudienceSizingRequest>,
        context: &C) -> Result<AdGroupsSlashAudienceSizingResponse, ApiError>;

    /// Create ad groups
    async fn ad_groups_slash_create(
        &self,
        ad_account_id: String,
        ad_group_create_request: &Vec<models::AdGroupCreateRequest>,
        context: &C) -> Result<AdGroupsSlashCreateResponse, ApiError>;

    /// Get ad group
    async fn ad_groups_slash_get(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        context: &C) -> Result<AdGroupsSlashGetResponse, ApiError>;

    /// List ad groups
    async fn ad_groups_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        translate_interests_to_names: Option<bool>,
        context: &C) -> Result<AdGroupsSlashListResponse, ApiError>;

    /// Update ad groups
    async fn ad_groups_slash_update(
        &self,
        ad_account_id: String,
        ad_group_update_request: &Vec<models::AdGroupUpdateRequest>,
        context: &C) -> Result<AdGroupsSlashUpdateResponse, ApiError>;

    /// Get targeting analytics for ad groups
    async fn ad_groups_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        ad_group_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<AdGroupsTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Create ad preview with pin or image
    async fn ad_previews_slash_create(
        &self,
        ad_account_id: String,
        ad_preview_request: models::AdPreviewRequest,
        context: &C) -> Result<AdPreviewsSlashCreateResponse, ApiError>;

    /// Get targeting analytics for ads
    async fn ad_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        ad_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<AdTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Get ad analytics
    async fn ads_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdsSlashAnalyticsResponse, ApiError>;

    /// Create ads
    async fn ads_slash_create(
        &self,
        ad_account_id: String,
        ad_create_request: &Vec<models::AdCreateRequest>,
        context: &C) -> Result<AdsSlashCreateResponse, ApiError>;

    /// Get ad
    async fn ads_slash_get(
        &self,
        ad_account_id: String,
        ad_id: String,
        context: &C) -> Result<AdsSlashGetResponse, ApiError>;

    /// List ads
    async fn ads_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        ad_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<AdsSlashListResponse, ApiError>;

    /// Update ads
    async fn ads_slash_update(
        &self,
        ad_account_id: String,
        ad_update_request: &Vec<models::AdUpdateRequest>,
        context: &C) -> Result<AdsSlashUpdateResponse, ApiError>;

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

    /// Create audience
    async fn audiences_slash_create(
        &self,
        ad_account_id: String,
        audience_create_request: models::AudienceCreateRequest,
        context: &C) -> Result<AudiencesSlashCreateResponse, ApiError>;

    /// Create custom audience
    async fn audiences_slash_create_custom(
        &self,
        ad_account_id: String,
        audience_create_custom_request: models::AudienceCreateCustomRequest,
        context: &C) -> Result<AudiencesSlashCreateCustomResponse, ApiError>;

    /// Get audience
    async fn audiences_slash_get(
        &self,
        ad_account_id: String,
        audience_id: String,
        context: &C) -> Result<AudiencesSlashGetResponse, ApiError>;

    /// List audiences
    async fn audiences_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        order: Option<String>,
        page_size: Option<i32>,
        ownership_type: Option<String>,
        context: &C) -> Result<AudiencesSlashListResponse, ApiError>;

    /// Update audience
    async fn audiences_slash_update(
        &self,
        ad_account_id: String,
        audience_id: String,
        audience_update_request: Option<models::AudienceUpdateRequest>,
        context: &C) -> Result<AudiencesSlashUpdateResponse, ApiError>;

    /// Redeem ad credits
    async fn ads_credit_slash_redeem(
        &self,
        ad_account_id: String,
        ads_credit_redeem_request: models::AdsCreditRedeemRequest,
        context: &C) -> Result<AdsCreditSlashRedeemResponse, ApiError>;

    /// Get ads credit discounts
    async fn ads_credits_discounts_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<AdsCreditsDiscountsSlashGetResponse, ApiError>;

    /// Get billing profiles
    async fn billing_profiles_slash_get(
        &self,
        ad_account_id: String,
        is_active: bool,
        bookmark: Option<String>,
        page_size: Option<i32>,
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
        ssio_create_insertion_order_request: models::SsioCreateInsertionOrderRequest,
        context: &C) -> Result<SsioInsertionOrderSlashCreateResponse, ApiError>;

    /// Edit insertion order through SSIO.
    async fn ssio_insertion_order_slash_edit(
        &self,
        ad_account_id: String,
        ssio_edit_insertion_order_request: models::SsioEditInsertionOrderRequest,
        context: &C) -> Result<SsioInsertionOrderSlashEditResponse, ApiError>;

    /// Get insertion order status by ad account id.
    async fn ssio_insertion_orders_status_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<SsioInsertionOrdersStatusSlashGetByAdAccountResponse, ApiError>;

    /// Get insertion order status by pin order id.
    async fn ssio_insertion_orders_status_slash_get_by_pin_order_id(
        &self,
        ad_account_id: String,
        pin_order_id: String,
        context: &C) -> Result<SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse, ApiError>;

    /// Get Salesforce order lines by ad account id.
    async fn ssio_order_lines_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        pin_order_id: Option<String>,
        context: &C) -> Result<SsioOrderLinesSlashGetByAdAccountResponse, ApiError>;

    /// Create board section
    async fn board_sections_slash_create(
        &self,
        board_id: String,
        board_section: models::BoardSection,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashCreateResponse, ApiError>;

    /// Delete board section
    async fn board_sections_slash_delete(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashDeleteResponse, ApiError>;

    /// List board sections
    async fn board_sections_slash_list(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsSlashListResponse, ApiError>;

    /// List Pins on board section
    async fn board_sections_slash_list_pins(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsSlashListPinsResponse, ApiError>;

    /// Update board section
    async fn board_sections_slash_update(
        &self,
        board_id: String,
        section_id: String,
        board_section: models::BoardSection,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashUpdateResponse, ApiError>;

    /// Create board
    async fn boards_slash_create(
        &self,
        board: models::Board,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashCreateResponse, ApiError>;

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

    /// List boards
    async fn boards_slash_list(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        privacy: Option<String>,
        context: &C) -> Result<BoardsSlashListResponse, ApiError>;

    /// List Pins on board
    async fn boards_slash_list_pins(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        creative_types: Option<&Vec<String>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        context: &C) -> Result<BoardsSlashListPinsResponse, ApiError>;

    /// Update board
    async fn boards_slash_update(
        &self,
        board_id: String,
        board_update: models::BoardUpdate,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashUpdateResponse, ApiError>;

    /// Get advertiser entities in bulk
    async fn bulk_download_slash_create(
        &self,
        ad_account_id: String,
        bulk_download_request: models::BulkDownloadRequest,
        context: &C) -> Result<BulkDownloadSlashCreateResponse, ApiError>;

    /// Download advertiser entities in bulk
    async fn bulk_request_slash_get(
        &self,
        ad_account_id: String,
        bulk_request_id: String,
        include_details: Option<bool>,
        context: &C) -> Result<BulkRequestSlashGetResponse, ApiError>;

    /// Create/update ad entities in bulk
    async fn bulk_upsert_slash_create(
        &self,
        ad_account_id: String,
        bulk_upsert_request: models::BulkUpsertRequest,
        context: &C) -> Result<BulkUpsertSlashCreateResponse, ApiError>;

    /// Get targeting analytics for campaigns
    async fn campaign_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        campaign_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<CampaignTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Get campaign analytics
    async fn campaigns_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        campaign_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<CampaignsSlashAnalyticsResponse, ApiError>;

    /// Create campaigns
    async fn campaigns_slash_create(
        &self,
        ad_account_id: String,
        campaign_create_request: &Vec<models::CampaignCreateRequest>,
        context: &C) -> Result<CampaignsSlashCreateResponse, ApiError>;

    /// Get campaign
    async fn campaigns_slash_get(
        &self,
        ad_account_id: String,
        campaign_id: String,
        context: &C) -> Result<CampaignsSlashGetResponse, ApiError>;

    /// List campaigns
    async fn campaigns_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<CampaignsSlashListResponse, ApiError>;

    /// Update campaigns
    async fn campaigns_slash_update(
        &self,
        ad_account_id: String,
        campaign_update_request: &Vec<models::CampaignUpdateRequest>,
        context: &C) -> Result<CampaignsSlashUpdateResponse, ApiError>;

    /// List products for a Product Group
    async fn catalogs_product_group_pins_slash_list(
        &self,
        product_group_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupPinsSlashListResponse, ApiError>;

    /// Create product group
    async fn catalogs_product_groups_slash_create(
        &self,
        catalogs_product_groups_create_request: models::CatalogsProductGroupsCreateRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashCreateResponse, ApiError>;

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

    /// List product groups
    async fn catalogs_product_groups_slash_list(
        &self,
        feed_id: Option<String>,
        catalog_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashListResponse, ApiError>;

    /// Get product counts for a Product Group
    async fn catalogs_product_groups_slash_product_counts_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, ApiError>;

    /// Update product group
    async fn catalogs_product_groups_slash_update(
        &self,
        product_group_id: String,
        catalogs_product_groups_update_request: models::CatalogsProductGroupsUpdateRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashUpdateResponse, ApiError>;

    /// List catalogs
    async fn catalogs_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsSlashListResponse, ApiError>;

    /// List processing results for a given feed
    async fn feed_processing_results_slash_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedProcessingResultsSlashListResponse, ApiError>;

    /// Create feed
    async fn feeds_slash_create(
        &self,
        feeds_create_request: models::FeedsCreateRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashCreateResponse, ApiError>;

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

    /// List feeds
    async fn feeds_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashListResponse, ApiError>;

    /// Update feed
    async fn feeds_slash_update(
        &self,
        feed_id: String,
        feeds_update_request: models::FeedsUpdateRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashUpdateResponse, ApiError>;

    /// Get catalogs item batch status
    async fn items_batch_slash_get(
        &self,
        batch_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsBatchSlashGetResponse, ApiError>;

    /// Operate on item batch
    async fn items_batch_slash_post(
        &self,
        items_batch_post_request: models::ItemsBatchPostRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsBatchSlashPostResponse, ApiError>;

    /// List item issues for a given processing result
    async fn items_issues_slash_list(
        &self,
        processing_result_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        item_numbers: Option<&Vec<i32>>,
        item_validation_issue: Option<models::CatalogsItemValidationIssue>,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsIssuesSlashListResponse, ApiError>;

    /// Get catalogs items
    async fn items_slash_get(
        &self,
        country: String,
        language: String,
        ad_account_id: Option<String>,
        item_ids: Option<&Vec<String>>,
        filters: Option<models::CatalogsItemsFilters>,
        context: &C) -> Result<ItemsSlashGetResponse, ApiError>;

    /// List filtered products
    async fn products_by_product_group_filter_slash_list(
        &self,
        catalogs_list_products_by_filter_request: models::CatalogsListProductsByFilterRequest,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<ProductsByProductGroupFilterSlashListResponse, ApiError>;

    /// Send conversions
    async fn events_slash_create(
        &self,
        ad_account_id: String,
        conversion_events: models::ConversionEvents,
        test: Option<bool>,
        context: &C) -> Result<EventsSlashCreateResponse, ApiError>;

    /// Create conversion tag
    async fn conversion_tags_slash_create(
        &self,
        ad_account_id: String,
        conversion_tag_create: models::ConversionTagCreate,
        context: &C) -> Result<ConversionTagsSlashCreateResponse, ApiError>;

    /// Get conversion tag
    async fn conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        conversion_tag_id: String,
        context: &C) -> Result<ConversionTagsSlashGetResponse, ApiError>;

    /// Get conversion tags
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
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<PageVisitConversionTagsSlashGetResponse, ApiError>;

    /// Create customer lists
    async fn customer_lists_slash_create(
        &self,
        ad_account_id: String,
        customer_list_request: models::CustomerListRequest,
        context: &C) -> Result<CustomerListsSlashCreateResponse, ApiError>;

    /// Get customer list
    async fn customer_lists_slash_get(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        context: &C) -> Result<CustomerListsSlashGetResponse, ApiError>;

    /// Get customer lists
    async fn customer_lists_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<CustomerListsSlashListResponse, ApiError>;

    /// Update customer list
    async fn customer_lists_slash_update(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_update_request: models::CustomerListUpdateRequest,
        context: &C) -> Result<CustomerListsSlashUpdateResponse, ApiError>;

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
        integration_request_patch: Option<models::IntegrationRequestPatch>,
        context: &C) -> Result<IntegrationsCommerceSlashPatchResponse, ApiError>;

    /// Create commerce integration
    async fn integrations_commerce_slash_post(
        &self,
        integration_request: Option<models::IntegrationRequest>,
        context: &C) -> Result<IntegrationsCommerceSlashPostResponse, ApiError>;

    /// Receives batched logs from integration applications.
    async fn integrations_logs_slash_post(
        &self,
        integration_logs_request: models::IntegrationLogsRequest,
        context: &C) -> Result<IntegrationsLogsSlashPostResponse, ApiError>;

    /// Get integration metadata
    async fn integrations_slash_get_by_id(
        &self,
        id: String,
        context: &C) -> Result<IntegrationsSlashGetByIdResponse, ApiError>;

    /// Get integration metadata list
    async fn integrations_slash_get_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<IntegrationsSlashGetListResponse, ApiError>;

    /// Get country's keyword metrics
    async fn country_keywords_metrics_slash_get(
        &self,
        ad_account_id: String,
        country_code: String,
        keywords: &Vec<String>,
        context: &C) -> Result<CountryKeywordsMetricsSlashGetResponse, ApiError>;

    /// Create keywords
    async fn keywords_slash_create(
        &self,
        ad_account_id: String,
        keywords_request: models::KeywordsRequest,
        context: &C) -> Result<KeywordsSlashCreateResponse, ApiError>;

    /// Get keywords
    async fn keywords_slash_get(
        &self,
        ad_account_id: String,
        campaign_id: Option<String>,
        ad_group_id: Option<String>,
        match_types: Option<&Vec<models::MatchType>>,
        page_size: Option<i32>,
        bookmark: Option<String>,
        context: &C) -> Result<KeywordsSlashGetResponse, ApiError>;

    /// Update keywords
    async fn keywords_slash_update(
        &self,
        ad_account_id: String,
        keyword_update_body: models::KeywordUpdateBody,
        context: &C) -> Result<KeywordsSlashUpdateResponse, ApiError>;

    /// List trending keywords
    async fn trending_keywords_slash_list(
        &self,
        region: models::TrendsSupportedRegion,
        trend_type: models::TrendType,
        interests: Option<&Vec<String>>,
        genders: Option<&Vec<String>>,
        ages: Option<&Vec<String>>,
        normalize_against_group: Option<bool>,
        limit: Option<i32>,
        context: &C) -> Result<TrendingKeywordsSlashListResponse, ApiError>;

    /// Delete lead ads subscription
    async fn ad_accounts_subscriptions_slash_del_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        context: &C) -> Result<AdAccountsSubscriptionsSlashDelByIdResponse, ApiError>;

    /// Get lead ads subscription
    async fn ad_accounts_subscriptions_slash_get_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        context: &C) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, ApiError>;

    /// Get lead ads subscriptions
    async fn ad_accounts_subscriptions_slash_get_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        bookmark: Option<String>,
        context: &C) -> Result<AdAccountsSubscriptionsSlashGetListResponse, ApiError>;

    /// Create lead ads subscription
    async fn ad_accounts_subscriptions_slash_post(
        &self,
        ad_account_id: String,
        ad_account_create_subscription_request: models::AdAccountCreateSubscriptionRequest,
        context: &C) -> Result<AdAccountsSubscriptionsSlashPostResponse, ApiError>;

    /// Get lead form by id
    async fn lead_form_slash_get(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        context: &C) -> Result<LeadFormSlashGetResponse, ApiError>;

    /// Create lead form test data
    async fn lead_form_test_slash_create(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        lead_form_test_request: models::LeadFormTestRequest,
        context: &C) -> Result<LeadFormTestSlashCreateResponse, ApiError>;

    /// Get lead forms
    async fn lead_forms_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<LeadFormsSlashListResponse, ApiError>;

    /// Register media upload
    async fn media_slash_create(
        &self,
        media_upload_request: models::MediaUploadRequest,
        context: &C) -> Result<MediaSlashCreateResponse, ApiError>;

    /// Get media upload details
    async fn media_slash_get(
        &self,
        media_id: String,
        context: &C) -> Result<MediaSlashGetResponse, ApiError>;

    /// List media uploads
    async fn media_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<MediaSlashListResponse, ApiError>;

    /// Generate OAuth access token
    async fn oauth_slash_token(
        &self,
        grant_type: String,
        context: &C) -> Result<OauthSlashTokenResponse, ApiError>;

    /// Get order line
    async fn order_lines_slash_get(
        &self,
        ad_account_id: String,
        order_line_id: String,
        context: &C) -> Result<OrderLinesSlashGetResponse, ApiError>;

    /// Get order lines
    async fn order_lines_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<OrderLinesSlashListResponse, ApiError>;

    /// Get Pin analytics
    async fn pins_slash_analytics(
        &self,
        pin_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &Vec<models::PinsAnalyticsMetricTypesParameterInner>,
        app_types: Option<String>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashAnalyticsResponse, ApiError>;

    /// Create Pin
    async fn pins_slash_create(
        &self,
        pin_create: models::PinCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashCreateResponse, ApiError>;

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
        pin_metrics: Option<bool>,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashGetResponse, ApiError>;

    /// List Pins
    async fn pins_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        pin_filter: Option<String>,
        include_protected_pins: Option<bool>,
        pin_type: Option<String>,
        creative_types: Option<&Vec<String>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        context: &C) -> Result<PinsSlashListResponse, ApiError>;

    /// Save Pin
    async fn pins_slash_save(
        &self,
        pin_id: String,
        pins_save_request: models::PinsSaveRequest,
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
        product_group_promotion_create_request: models::ProductGroupPromotionCreateRequest,
        context: &C) -> Result<ProductGroupPromotionsSlashCreateResponse, ApiError>;

    /// Get a product group promotion by id
    async fn product_group_promotions_slash_get(
        &self,
        ad_account_id: String,
        product_group_promotion_id: String,
        context: &C) -> Result<ProductGroupPromotionsSlashGetResponse, ApiError>;

    /// Get product group promotions
    async fn product_group_promotions_slash_list(
        &self,
        ad_account_id: String,
        product_group_promotion_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        ad_group_id: Option<String>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<ProductGroupPromotionsSlashListResponse, ApiError>;

    /// Update product group promotions
    async fn product_group_promotions_slash_update(
        &self,
        ad_account_id: String,
        product_group_promotion_update_request: models::ProductGroupPromotionUpdateRequest,
        context: &C) -> Result<ProductGroupPromotionsSlashUpdateResponse, ApiError>;

    /// Get product group analytics
    async fn product_groups_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        product_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<ProductGroupsSlashAnalyticsResponse, ApiError>;

    /// Get catalog product groups
    async fn ad_accounts_catalogs_product_groups_slash_list(
        &self,
        ad_account_id: String,
        feed_profile_id: Option<String>,
        context: &C) -> Result<AdAccountsCatalogsProductGroupsSlashListResponse, ApiError>;

    /// Get ad accounts countries
    async fn ad_account_countries_slash_get(
        &self,
        context: &C) -> Result<AdAccountCountriesSlashGetResponse, ApiError>;

    /// Get available metrics' definitions
    async fn delivery_metrics_slash_get(
        &self,
        report_type: Option<String>,
        context: &C) -> Result<DeliveryMetricsSlashGetResponse, ApiError>;

    /// Get interest details
    async fn interest_targeting_options_slash_get(
        &self,
        interest_id: String,
        context: &C) -> Result<InterestTargetingOptionsSlashGetResponse, ApiError>;

    /// Get lead form questions
    async fn lead_form_questions_slash_get(
        &self,
        context: &C) -> Result<LeadFormQuestionsSlashGetResponse, ApiError>;

    /// Get metrics ready state
    async fn metrics_ready_state_slash_get(
        &self,
        date: String,
        context: &C) -> Result<MetricsReadyStateSlashGetResponse, ApiError>;

    /// Get targeting options
    async fn targeting_options_slash_get(
        &self,
        targeting_type: String,
        client_id: Option<String>,
        oauth_signature: Option<String>,
        timestamp: Option<String>,
        context: &C) -> Result<TargetingOptionsSlashGetResponse, ApiError>;

    /// Search pins by a given search term
    async fn search_partner_pins(
        &self,
        term: String,
        country_code: String,
        bookmark: Option<String>,
        locale: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<SearchPartnerPinsResponse, ApiError>;

    /// Search user's boards
    async fn search_user_boards_slash_get(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        query: Option<String>,
        context: &C) -> Result<SearchUserBoardsSlashGetResponse, ApiError>;

    /// Search user's Pins
    async fn search_user_pins_slash_list(
        &self,
        query: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<SearchUserPinsSlashListResponse, ApiError>;

    /// List related terms
    async fn terms_related_slash_list(
        &self,
        terms: &Vec<String>,
        context: &C) -> Result<TermsRelatedSlashListResponse, ApiError>;

    /// List suggested terms
    async fn terms_suggested_slash_list(
        &self,
        term: String,
        limit: Option<i32>,
        context: &C) -> Result<TermsSuggestedSlashListResponse, ApiError>;

    /// Get terms of service
    async fn terms_of_service_slash_get(
        &self,
        ad_account_id: String,
        include_html: Option<bool>,
        tos_type: Option<String>,
        context: &C) -> Result<TermsOfServiceSlashGetResponse, ApiError>;

    /// List following boards
    async fn boards_user_follows_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        explicit_following: Option<bool>,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsUserFollowsSlashListResponse, ApiError>;

    /// Follow user
    async fn follow_user_slash_update(
        &self,
        username: String,
        follow_user_request: models::FollowUserRequest,
        context: &C) -> Result<FollowUserSlashUpdateResponse, ApiError>;

    /// List followers
    async fn followers_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
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
    async fn user_account_slash_analytics(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsResponse, ApiError>;

    /// Get user account top pins analytics
    async fn user_account_slash_analytics_slash_top_pins(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: String,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        num_of_pins: Option<i32>,
        created_in_last_n_days: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsSlashTopPinsResponse, ApiError>;

    /// Get user account top video pins analytics
    async fn user_account_slash_analytics_slash_top_video_pins(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: String,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        num_of_pins: Option<i32>,
        created_in_last_n_days: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsSlashTopVideoPinsResponse, ApiError>;

    /// List following interests
    async fn user_account_slash_followed_interests(
        &self,
        username: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<UserAccountSlashFollowedInterestsResponse, ApiError>;

    /// Get user account
    async fn user_account_slash_get(
        &self,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashGetResponse, ApiError>;

    /// List following
    async fn user_following_slash_get(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        feed_type: Option<models::UserFollowingFeedType>,
        explicit_following: Option<bool>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserFollowingSlashGetResponse, ApiError>;

    /// Get user websites
    async fn user_websites_slash_get(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<UserWebsitesSlashGetResponse, ApiError>;

    /// Verify website
    async fn verify_website_slash_update(
        &self,
        user_website_verify_request: models::UserWebsiteVerifyRequest,
        context: &C) -> Result<VerifyWebsiteSlashUpdateResponse, ApiError>;

    /// Get user verification code for website claiming
    async fn website_verification_slash_get(
        &self,
        context: &C) -> Result<WebsiteVerificationSlashGetResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait ApiNoContext<C: Send + Sync> {

    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>>;

    fn context(&self) -> &C;

    /// Get ad account analytics
    async fn ad_account_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdAccountSlashAnalyticsResponse, ApiError>;

    /// Get targeting analytics for an ad account
    async fn ad_account_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        ) -> Result<AdAccountTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Create ad account
    async fn ad_accounts_slash_create(
        &self,
        ad_account_create_request: models::AdAccountCreateRequest,
        ) -> Result<AdAccountsSlashCreateResponse, ApiError>;

    /// Get ad account
    async fn ad_accounts_slash_get(
        &self,
        ad_account_id: String,
        ) -> Result<AdAccountsSlashGetResponse, ApiError>;

    /// List ad accounts
    async fn ad_accounts_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        include_shared_accounts: Option<bool>,
        ) -> Result<AdAccountsSlashListResponse, ApiError>;

    /// Create a request for a Marketing Mix Modeling (MMM) report
    async fn analytics_slash_create_mmm_report(
        &self,
        ad_account_id: String,
        create_mmm_report_request: models::CreateMmmReportRequest,
        ) -> Result<AnalyticsSlashCreateMmmReportResponse, ApiError>;

    /// Create async request for an account analytics report
    async fn analytics_slash_create_report(
        &self,
        ad_account_id: String,
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        ) -> Result<AnalyticsSlashCreateReportResponse, ApiError>;

    /// Create async request for an analytics report using a template
    async fn analytics_slash_create_template_report(
        &self,
        ad_account_id: String,
        template_id: String,
        start_date: Option<chrono::naive::NaiveDate>,
        end_date: Option<chrono::naive::NaiveDate>,
        granularity: Option<models::Granularity>,
        ) -> Result<AnalyticsSlashCreateTemplateReportResponse, ApiError>;

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
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<TemplatesSlashListResponse, ApiError>;

    /// Get bid floors
    async fn ad_groups_bid_floor_slash_get(
        &self,
        ad_account_id: String,
        bid_floor_request: models::BidFloorRequest,
        ) -> Result<AdGroupsBidFloorSlashGetResponse, ApiError>;

    /// Get ad group analytics
    async fn ad_groups_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdGroupsSlashAnalyticsResponse, ApiError>;

    /// Get audience sizing
    async fn ad_groups_slash_audience_sizing(
        &self,
        ad_account_id: String,
        ad_group_audience_sizing_request: Option<models::AdGroupAudienceSizingRequest>,
        ) -> Result<AdGroupsSlashAudienceSizingResponse, ApiError>;

    /// Create ad groups
    async fn ad_groups_slash_create(
        &self,
        ad_account_id: String,
        ad_group_create_request: &Vec<models::AdGroupCreateRequest>,
        ) -> Result<AdGroupsSlashCreateResponse, ApiError>;

    /// Get ad group
    async fn ad_groups_slash_get(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        ) -> Result<AdGroupsSlashGetResponse, ApiError>;

    /// List ad groups
    async fn ad_groups_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        translate_interests_to_names: Option<bool>,
        ) -> Result<AdGroupsSlashListResponse, ApiError>;

    /// Update ad groups
    async fn ad_groups_slash_update(
        &self,
        ad_account_id: String,
        ad_group_update_request: &Vec<models::AdGroupUpdateRequest>,
        ) -> Result<AdGroupsSlashUpdateResponse, ApiError>;

    /// Get targeting analytics for ad groups
    async fn ad_groups_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        ad_group_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        ) -> Result<AdGroupsTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Create ad preview with pin or image
    async fn ad_previews_slash_create(
        &self,
        ad_account_id: String,
        ad_preview_request: models::AdPreviewRequest,
        ) -> Result<AdPreviewsSlashCreateResponse, ApiError>;

    /// Get targeting analytics for ads
    async fn ad_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        ad_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        ) -> Result<AdTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Get ad analytics
    async fn ads_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdsSlashAnalyticsResponse, ApiError>;

    /// Create ads
    async fn ads_slash_create(
        &self,
        ad_account_id: String,
        ad_create_request: &Vec<models::AdCreateRequest>,
        ) -> Result<AdsSlashCreateResponse, ApiError>;

    /// Get ad
    async fn ads_slash_get(
        &self,
        ad_account_id: String,
        ad_id: String,
        ) -> Result<AdsSlashGetResponse, ApiError>;

    /// List ads
    async fn ads_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        ad_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<AdsSlashListResponse, ApiError>;

    /// Update ads
    async fn ads_slash_update(
        &self,
        ad_account_id: String,
        ad_update_request: &Vec<models::AdUpdateRequest>,
        ) -> Result<AdsSlashUpdateResponse, ApiError>;

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

    /// Create audience
    async fn audiences_slash_create(
        &self,
        ad_account_id: String,
        audience_create_request: models::AudienceCreateRequest,
        ) -> Result<AudiencesSlashCreateResponse, ApiError>;

    /// Create custom audience
    async fn audiences_slash_create_custom(
        &self,
        ad_account_id: String,
        audience_create_custom_request: models::AudienceCreateCustomRequest,
        ) -> Result<AudiencesSlashCreateCustomResponse, ApiError>;

    /// Get audience
    async fn audiences_slash_get(
        &self,
        ad_account_id: String,
        audience_id: String,
        ) -> Result<AudiencesSlashGetResponse, ApiError>;

    /// List audiences
    async fn audiences_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        order: Option<String>,
        page_size: Option<i32>,
        ownership_type: Option<String>,
        ) -> Result<AudiencesSlashListResponse, ApiError>;

    /// Update audience
    async fn audiences_slash_update(
        &self,
        ad_account_id: String,
        audience_id: String,
        audience_update_request: Option<models::AudienceUpdateRequest>,
        ) -> Result<AudiencesSlashUpdateResponse, ApiError>;

    /// Redeem ad credits
    async fn ads_credit_slash_redeem(
        &self,
        ad_account_id: String,
        ads_credit_redeem_request: models::AdsCreditRedeemRequest,
        ) -> Result<AdsCreditSlashRedeemResponse, ApiError>;

    /// Get ads credit discounts
    async fn ads_credits_discounts_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<AdsCreditsDiscountsSlashGetResponse, ApiError>;

    /// Get billing profiles
    async fn billing_profiles_slash_get(
        &self,
        ad_account_id: String,
        is_active: bool,
        bookmark: Option<String>,
        page_size: Option<i32>,
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
        ssio_create_insertion_order_request: models::SsioCreateInsertionOrderRequest,
        ) -> Result<SsioInsertionOrderSlashCreateResponse, ApiError>;

    /// Edit insertion order through SSIO.
    async fn ssio_insertion_order_slash_edit(
        &self,
        ad_account_id: String,
        ssio_edit_insertion_order_request: models::SsioEditInsertionOrderRequest,
        ) -> Result<SsioInsertionOrderSlashEditResponse, ApiError>;

    /// Get insertion order status by ad account id.
    async fn ssio_insertion_orders_status_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<SsioInsertionOrdersStatusSlashGetByAdAccountResponse, ApiError>;

    /// Get insertion order status by pin order id.
    async fn ssio_insertion_orders_status_slash_get_by_pin_order_id(
        &self,
        ad_account_id: String,
        pin_order_id: String,
        ) -> Result<SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse, ApiError>;

    /// Get Salesforce order lines by ad account id.
    async fn ssio_order_lines_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        pin_order_id: Option<String>,
        ) -> Result<SsioOrderLinesSlashGetByAdAccountResponse, ApiError>;

    /// Create board section
    async fn board_sections_slash_create(
        &self,
        board_id: String,
        board_section: models::BoardSection,
        ad_account_id: Option<String>,
        ) -> Result<BoardSectionsSlashCreateResponse, ApiError>;

    /// Delete board section
    async fn board_sections_slash_delete(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        ) -> Result<BoardSectionsSlashDeleteResponse, ApiError>;

    /// List board sections
    async fn board_sections_slash_list(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<BoardSectionsSlashListResponse, ApiError>;

    /// List Pins on board section
    async fn board_sections_slash_list_pins(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<BoardSectionsSlashListPinsResponse, ApiError>;

    /// Update board section
    async fn board_sections_slash_update(
        &self,
        board_id: String,
        section_id: String,
        board_section: models::BoardSection,
        ad_account_id: Option<String>,
        ) -> Result<BoardSectionsSlashUpdateResponse, ApiError>;

    /// Create board
    async fn boards_slash_create(
        &self,
        board: models::Board,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashCreateResponse, ApiError>;

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

    /// List boards
    async fn boards_slash_list(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        privacy: Option<String>,
        ) -> Result<BoardsSlashListResponse, ApiError>;

    /// List Pins on board
    async fn boards_slash_list_pins(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        creative_types: Option<&Vec<String>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        ) -> Result<BoardsSlashListPinsResponse, ApiError>;

    /// Update board
    async fn boards_slash_update(
        &self,
        board_id: String,
        board_update: models::BoardUpdate,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashUpdateResponse, ApiError>;

    /// Get advertiser entities in bulk
    async fn bulk_download_slash_create(
        &self,
        ad_account_id: String,
        bulk_download_request: models::BulkDownloadRequest,
        ) -> Result<BulkDownloadSlashCreateResponse, ApiError>;

    /// Download advertiser entities in bulk
    async fn bulk_request_slash_get(
        &self,
        ad_account_id: String,
        bulk_request_id: String,
        include_details: Option<bool>,
        ) -> Result<BulkRequestSlashGetResponse, ApiError>;

    /// Create/update ad entities in bulk
    async fn bulk_upsert_slash_create(
        &self,
        ad_account_id: String,
        bulk_upsert_request: models::BulkUpsertRequest,
        ) -> Result<BulkUpsertSlashCreateResponse, ApiError>;

    /// Get targeting analytics for campaigns
    async fn campaign_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        campaign_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        ) -> Result<CampaignTargetingAnalyticsSlashGetResponse, ApiError>;

    /// Get campaign analytics
    async fn campaigns_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        campaign_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<CampaignsSlashAnalyticsResponse, ApiError>;

    /// Create campaigns
    async fn campaigns_slash_create(
        &self,
        ad_account_id: String,
        campaign_create_request: &Vec<models::CampaignCreateRequest>,
        ) -> Result<CampaignsSlashCreateResponse, ApiError>;

    /// Get campaign
    async fn campaigns_slash_get(
        &self,
        ad_account_id: String,
        campaign_id: String,
        ) -> Result<CampaignsSlashGetResponse, ApiError>;

    /// List campaigns
    async fn campaigns_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<CampaignsSlashListResponse, ApiError>;

    /// Update campaigns
    async fn campaigns_slash_update(
        &self,
        ad_account_id: String,
        campaign_update_request: &Vec<models::CampaignUpdateRequest>,
        ) -> Result<CampaignsSlashUpdateResponse, ApiError>;

    /// List products for a Product Group
    async fn catalogs_product_group_pins_slash_list(
        &self,
        product_group_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupPinsSlashListResponse, ApiError>;

    /// Create product group
    async fn catalogs_product_groups_slash_create(
        &self,
        catalogs_product_groups_create_request: models::CatalogsProductGroupsCreateRequest,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashCreateResponse, ApiError>;

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

    /// List product groups
    async fn catalogs_product_groups_slash_list(
        &self,
        feed_id: Option<String>,
        catalog_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashListResponse, ApiError>;

    /// Get product counts for a Product Group
    async fn catalogs_product_groups_slash_product_counts_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, ApiError>;

    /// Update product group
    async fn catalogs_product_groups_slash_update(
        &self,
        product_group_id: String,
        catalogs_product_groups_update_request: models::CatalogsProductGroupsUpdateRequest,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashUpdateResponse, ApiError>;

    /// List catalogs
    async fn catalogs_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsSlashListResponse, ApiError>;

    /// List processing results for a given feed
    async fn feed_processing_results_slash_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<FeedProcessingResultsSlashListResponse, ApiError>;

    /// Create feed
    async fn feeds_slash_create(
        &self,
        feeds_create_request: models::FeedsCreateRequest,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashCreateResponse, ApiError>;

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

    /// List feeds
    async fn feeds_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashListResponse, ApiError>;

    /// Update feed
    async fn feeds_slash_update(
        &self,
        feed_id: String,
        feeds_update_request: models::FeedsUpdateRequest,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashUpdateResponse, ApiError>;

    /// Get catalogs item batch status
    async fn items_batch_slash_get(
        &self,
        batch_id: String,
        ad_account_id: Option<String>,
        ) -> Result<ItemsBatchSlashGetResponse, ApiError>;

    /// Operate on item batch
    async fn items_batch_slash_post(
        &self,
        items_batch_post_request: models::ItemsBatchPostRequest,
        ad_account_id: Option<String>,
        ) -> Result<ItemsBatchSlashPostResponse, ApiError>;

    /// List item issues for a given processing result
    async fn items_issues_slash_list(
        &self,
        processing_result_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        item_numbers: Option<&Vec<i32>>,
        item_validation_issue: Option<models::CatalogsItemValidationIssue>,
        ad_account_id: Option<String>,
        ) -> Result<ItemsIssuesSlashListResponse, ApiError>;

    /// Get catalogs items
    async fn items_slash_get(
        &self,
        country: String,
        language: String,
        ad_account_id: Option<String>,
        item_ids: Option<&Vec<String>>,
        filters: Option<models::CatalogsItemsFilters>,
        ) -> Result<ItemsSlashGetResponse, ApiError>;

    /// List filtered products
    async fn products_by_product_group_filter_slash_list(
        &self,
        catalogs_list_products_by_filter_request: models::CatalogsListProductsByFilterRequest,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<ProductsByProductGroupFilterSlashListResponse, ApiError>;

    /// Send conversions
    async fn events_slash_create(
        &self,
        ad_account_id: String,
        conversion_events: models::ConversionEvents,
        test: Option<bool>,
        ) -> Result<EventsSlashCreateResponse, ApiError>;

    /// Create conversion tag
    async fn conversion_tags_slash_create(
        &self,
        ad_account_id: String,
        conversion_tag_create: models::ConversionTagCreate,
        ) -> Result<ConversionTagsSlashCreateResponse, ApiError>;

    /// Get conversion tag
    async fn conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        conversion_tag_id: String,
        ) -> Result<ConversionTagsSlashGetResponse, ApiError>;

    /// Get conversion tags
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
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<PageVisitConversionTagsSlashGetResponse, ApiError>;

    /// Create customer lists
    async fn customer_lists_slash_create(
        &self,
        ad_account_id: String,
        customer_list_request: models::CustomerListRequest,
        ) -> Result<CustomerListsSlashCreateResponse, ApiError>;

    /// Get customer list
    async fn customer_lists_slash_get(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        ) -> Result<CustomerListsSlashGetResponse, ApiError>;

    /// Get customer lists
    async fn customer_lists_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<CustomerListsSlashListResponse, ApiError>;

    /// Update customer list
    async fn customer_lists_slash_update(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_update_request: models::CustomerListUpdateRequest,
        ) -> Result<CustomerListsSlashUpdateResponse, ApiError>;

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
        integration_request_patch: Option<models::IntegrationRequestPatch>,
        ) -> Result<IntegrationsCommerceSlashPatchResponse, ApiError>;

    /// Create commerce integration
    async fn integrations_commerce_slash_post(
        &self,
        integration_request: Option<models::IntegrationRequest>,
        ) -> Result<IntegrationsCommerceSlashPostResponse, ApiError>;

    /// Receives batched logs from integration applications.
    async fn integrations_logs_slash_post(
        &self,
        integration_logs_request: models::IntegrationLogsRequest,
        ) -> Result<IntegrationsLogsSlashPostResponse, ApiError>;

    /// Get integration metadata
    async fn integrations_slash_get_by_id(
        &self,
        id: String,
        ) -> Result<IntegrationsSlashGetByIdResponse, ApiError>;

    /// Get integration metadata list
    async fn integrations_slash_get_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<IntegrationsSlashGetListResponse, ApiError>;

    /// Get country's keyword metrics
    async fn country_keywords_metrics_slash_get(
        &self,
        ad_account_id: String,
        country_code: String,
        keywords: &Vec<String>,
        ) -> Result<CountryKeywordsMetricsSlashGetResponse, ApiError>;

    /// Create keywords
    async fn keywords_slash_create(
        &self,
        ad_account_id: String,
        keywords_request: models::KeywordsRequest,
        ) -> Result<KeywordsSlashCreateResponse, ApiError>;

    /// Get keywords
    async fn keywords_slash_get(
        &self,
        ad_account_id: String,
        campaign_id: Option<String>,
        ad_group_id: Option<String>,
        match_types: Option<&Vec<models::MatchType>>,
        page_size: Option<i32>,
        bookmark: Option<String>,
        ) -> Result<KeywordsSlashGetResponse, ApiError>;

    /// Update keywords
    async fn keywords_slash_update(
        &self,
        ad_account_id: String,
        keyword_update_body: models::KeywordUpdateBody,
        ) -> Result<KeywordsSlashUpdateResponse, ApiError>;

    /// List trending keywords
    async fn trending_keywords_slash_list(
        &self,
        region: models::TrendsSupportedRegion,
        trend_type: models::TrendType,
        interests: Option<&Vec<String>>,
        genders: Option<&Vec<String>>,
        ages: Option<&Vec<String>>,
        normalize_against_group: Option<bool>,
        limit: Option<i32>,
        ) -> Result<TrendingKeywordsSlashListResponse, ApiError>;

    /// Delete lead ads subscription
    async fn ad_accounts_subscriptions_slash_del_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        ) -> Result<AdAccountsSubscriptionsSlashDelByIdResponse, ApiError>;

    /// Get lead ads subscription
    async fn ad_accounts_subscriptions_slash_get_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        ) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, ApiError>;

    /// Get lead ads subscriptions
    async fn ad_accounts_subscriptions_slash_get_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        bookmark: Option<String>,
        ) -> Result<AdAccountsSubscriptionsSlashGetListResponse, ApiError>;

    /// Create lead ads subscription
    async fn ad_accounts_subscriptions_slash_post(
        &self,
        ad_account_id: String,
        ad_account_create_subscription_request: models::AdAccountCreateSubscriptionRequest,
        ) -> Result<AdAccountsSubscriptionsSlashPostResponse, ApiError>;

    /// Get lead form by id
    async fn lead_form_slash_get(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        ) -> Result<LeadFormSlashGetResponse, ApiError>;

    /// Create lead form test data
    async fn lead_form_test_slash_create(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        lead_form_test_request: models::LeadFormTestRequest,
        ) -> Result<LeadFormTestSlashCreateResponse, ApiError>;

    /// Get lead forms
    async fn lead_forms_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<LeadFormsSlashListResponse, ApiError>;

    /// Register media upload
    async fn media_slash_create(
        &self,
        media_upload_request: models::MediaUploadRequest,
        ) -> Result<MediaSlashCreateResponse, ApiError>;

    /// Get media upload details
    async fn media_slash_get(
        &self,
        media_id: String,
        ) -> Result<MediaSlashGetResponse, ApiError>;

    /// List media uploads
    async fn media_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<MediaSlashListResponse, ApiError>;

    /// Generate OAuth access token
    async fn oauth_slash_token(
        &self,
        grant_type: String,
        ) -> Result<OauthSlashTokenResponse, ApiError>;

    /// Get order line
    async fn order_lines_slash_get(
        &self,
        ad_account_id: String,
        order_line_id: String,
        ) -> Result<OrderLinesSlashGetResponse, ApiError>;

    /// Get order lines
    async fn order_lines_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<OrderLinesSlashListResponse, ApiError>;

    /// Get Pin analytics
    async fn pins_slash_analytics(
        &self,
        pin_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &Vec<models::PinsAnalyticsMetricTypesParameterInner>,
        app_types: Option<String>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashAnalyticsResponse, ApiError>;

    /// Create Pin
    async fn pins_slash_create(
        &self,
        pin_create: models::PinCreate,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashCreateResponse, ApiError>;

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
        pin_metrics: Option<bool>,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashGetResponse, ApiError>;

    /// List Pins
    async fn pins_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        pin_filter: Option<String>,
        include_protected_pins: Option<bool>,
        pin_type: Option<String>,
        creative_types: Option<&Vec<String>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        ) -> Result<PinsSlashListResponse, ApiError>;

    /// Save Pin
    async fn pins_slash_save(
        &self,
        pin_id: String,
        pins_save_request: models::PinsSaveRequest,
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
        product_group_promotion_create_request: models::ProductGroupPromotionCreateRequest,
        ) -> Result<ProductGroupPromotionsSlashCreateResponse, ApiError>;

    /// Get a product group promotion by id
    async fn product_group_promotions_slash_get(
        &self,
        ad_account_id: String,
        product_group_promotion_id: String,
        ) -> Result<ProductGroupPromotionsSlashGetResponse, ApiError>;

    /// Get product group promotions
    async fn product_group_promotions_slash_list(
        &self,
        ad_account_id: String,
        product_group_promotion_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        ad_group_id: Option<String>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<ProductGroupPromotionsSlashListResponse, ApiError>;

    /// Update product group promotions
    async fn product_group_promotions_slash_update(
        &self,
        ad_account_id: String,
        product_group_promotion_update_request: models::ProductGroupPromotionUpdateRequest,
        ) -> Result<ProductGroupPromotionsSlashUpdateResponse, ApiError>;

    /// Get product group analytics
    async fn product_groups_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        product_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<ProductGroupsSlashAnalyticsResponse, ApiError>;

    /// Get catalog product groups
    async fn ad_accounts_catalogs_product_groups_slash_list(
        &self,
        ad_account_id: String,
        feed_profile_id: Option<String>,
        ) -> Result<AdAccountsCatalogsProductGroupsSlashListResponse, ApiError>;

    /// Get ad accounts countries
    async fn ad_account_countries_slash_get(
        &self,
        ) -> Result<AdAccountCountriesSlashGetResponse, ApiError>;

    /// Get available metrics' definitions
    async fn delivery_metrics_slash_get(
        &self,
        report_type: Option<String>,
        ) -> Result<DeliveryMetricsSlashGetResponse, ApiError>;

    /// Get interest details
    async fn interest_targeting_options_slash_get(
        &self,
        interest_id: String,
        ) -> Result<InterestTargetingOptionsSlashGetResponse, ApiError>;

    /// Get lead form questions
    async fn lead_form_questions_slash_get(
        &self,
        ) -> Result<LeadFormQuestionsSlashGetResponse, ApiError>;

    /// Get metrics ready state
    async fn metrics_ready_state_slash_get(
        &self,
        date: String,
        ) -> Result<MetricsReadyStateSlashGetResponse, ApiError>;

    /// Get targeting options
    async fn targeting_options_slash_get(
        &self,
        targeting_type: String,
        client_id: Option<String>,
        oauth_signature: Option<String>,
        timestamp: Option<String>,
        ) -> Result<TargetingOptionsSlashGetResponse, ApiError>;

    /// Search pins by a given search term
    async fn search_partner_pins(
        &self,
        term: String,
        country_code: String,
        bookmark: Option<String>,
        locale: Option<String>,
        limit: Option<i32>,
        ) -> Result<SearchPartnerPinsResponse, ApiError>;

    /// Search user's boards
    async fn search_user_boards_slash_get(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        query: Option<String>,
        ) -> Result<SearchUserBoardsSlashGetResponse, ApiError>;

    /// Search user's Pins
    async fn search_user_pins_slash_list(
        &self,
        query: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        ) -> Result<SearchUserPinsSlashListResponse, ApiError>;

    /// List related terms
    async fn terms_related_slash_list(
        &self,
        terms: &Vec<String>,
        ) -> Result<TermsRelatedSlashListResponse, ApiError>;

    /// List suggested terms
    async fn terms_suggested_slash_list(
        &self,
        term: String,
        limit: Option<i32>,
        ) -> Result<TermsSuggestedSlashListResponse, ApiError>;

    /// Get terms of service
    async fn terms_of_service_slash_get(
        &self,
        ad_account_id: String,
        include_html: Option<bool>,
        tos_type: Option<String>,
        ) -> Result<TermsOfServiceSlashGetResponse, ApiError>;

    /// List following boards
    async fn boards_user_follows_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        explicit_following: Option<bool>,
        ad_account_id: Option<String>,
        ) -> Result<BoardsUserFollowsSlashListResponse, ApiError>;

    /// Follow user
    async fn follow_user_slash_update(
        &self,
        username: String,
        follow_user_request: models::FollowUserRequest,
        ) -> Result<FollowUserSlashUpdateResponse, ApiError>;

    /// List followers
    async fn followers_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
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
    async fn user_account_slash_analytics(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsResponse, ApiError>;

    /// Get user account top pins analytics
    async fn user_account_slash_analytics_slash_top_pins(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: String,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        num_of_pins: Option<i32>,
        created_in_last_n_days: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsSlashTopPinsResponse, ApiError>;

    /// Get user account top video pins analytics
    async fn user_account_slash_analytics_slash_top_video_pins(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: String,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        num_of_pins: Option<i32>,
        created_in_last_n_days: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsSlashTopVideoPinsResponse, ApiError>;

    /// List following interests
    async fn user_account_slash_followed_interests(
        &self,
        username: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<UserAccountSlashFollowedInterestsResponse, ApiError>;

    /// Get user account
    async fn user_account_slash_get(
        &self,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashGetResponse, ApiError>;

    /// List following
    async fn user_following_slash_get(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        feed_type: Option<models::UserFollowingFeedType>,
        explicit_following: Option<bool>,
        ad_account_id: Option<String>,
        ) -> Result<UserFollowingSlashGetResponse, ApiError>;

    /// Get user websites
    async fn user_websites_slash_get(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<UserWebsitesSlashGetResponse, ApiError>;

    /// Verify website
    async fn verify_website_slash_update(
        &self,
        user_website_verify_request: models::UserWebsiteVerifyRequest,
        ) -> Result<VerifyWebsiteSlashUpdateResponse, ApiError>;

    /// Get user verification code for website claiming
    async fn website_verification_slash_get(
        &self,
        ) -> Result<WebsiteVerificationSlashGetResponse, ApiError>;

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
    fn poll_ready(&self, cx: &mut Context) -> Poll<Result<(), ServiceError>> {
        self.api().poll_ready(cx)
    }

    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    /// Get ad account analytics
    async fn ad_account_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdAccountSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_account_slash_analytics(ad_account_id, start_date, end_date, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, &context).await
    }

    /// Get targeting analytics for an ad account
    async fn ad_account_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        ) -> Result<AdAccountTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_account_targeting_analytics_slash_get(ad_account_id, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, &context).await
    }

    /// Create ad account
    async fn ad_accounts_slash_create(
        &self,
        ad_account_create_request: models::AdAccountCreateRequest,
        ) -> Result<AdAccountsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_slash_create(ad_account_create_request, &context).await
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

    /// List ad accounts
    async fn ad_accounts_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        include_shared_accounts: Option<bool>,
        ) -> Result<AdAccountsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_slash_list(bookmark, page_size, include_shared_accounts, &context).await
    }

    /// Create a request for a Marketing Mix Modeling (MMM) report
    async fn analytics_slash_create_mmm_report(
        &self,
        ad_account_id: String,
        create_mmm_report_request: models::CreateMmmReportRequest,
        ) -> Result<AnalyticsSlashCreateMmmReportResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().analytics_slash_create_mmm_report(ad_account_id, create_mmm_report_request, &context).await
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
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<TemplatesSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().templates_slash_list(ad_account_id, page_size, order, bookmark, &context).await
    }

    /// Get bid floors
    async fn ad_groups_bid_floor_slash_get(
        &self,
        ad_account_id: String,
        bid_floor_request: models::BidFloorRequest,
        ) -> Result<AdGroupsBidFloorSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_bid_floor_slash_get(ad_account_id, bid_floor_request, &context).await
    }

    /// Get ad group analytics
    async fn ad_groups_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdGroupsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_analytics(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, &context).await
    }

    /// Get audience sizing
    async fn ad_groups_slash_audience_sizing(
        &self,
        ad_account_id: String,
        ad_group_audience_sizing_request: Option<models::AdGroupAudienceSizingRequest>,
        ) -> Result<AdGroupsSlashAudienceSizingResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_audience_sizing(ad_account_id, ad_group_audience_sizing_request, &context).await
    }

    /// Create ad groups
    async fn ad_groups_slash_create(
        &self,
        ad_account_id: String,
        ad_group_create_request: &Vec<models::AdGroupCreateRequest>,
        ) -> Result<AdGroupsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_create(ad_account_id, ad_group_create_request, &context).await
    }

    /// Get ad group
    async fn ad_groups_slash_get(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        ) -> Result<AdGroupsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_get(ad_account_id, ad_group_id, &context).await
    }

    /// List ad groups
    async fn ad_groups_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        translate_interests_to_names: Option<bool>,
        ) -> Result<AdGroupsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_list(ad_account_id, campaign_ids, ad_group_ids, entity_statuses, page_size, order, bookmark, translate_interests_to_names, &context).await
    }

    /// Update ad groups
    async fn ad_groups_slash_update(
        &self,
        ad_account_id: String,
        ad_group_update_request: &Vec<models::AdGroupUpdateRequest>,
        ) -> Result<AdGroupsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_slash_update(ad_account_id, ad_group_update_request, &context).await
    }

    /// Get targeting analytics for ad groups
    async fn ad_groups_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        ad_group_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        ) -> Result<AdGroupsTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_groups_targeting_analytics_slash_get(ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, &context).await
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
    async fn ad_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        ad_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        ) -> Result<AdTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_targeting_analytics_slash_get(ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, &context).await
    }

    /// Get ad analytics
    async fn ads_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<AdsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_slash_analytics(ad_account_id, start_date, end_date, ad_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, &context).await
    }

    /// Create ads
    async fn ads_slash_create(
        &self,
        ad_account_id: String,
        ad_create_request: &Vec<models::AdCreateRequest>,
        ) -> Result<AdsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_slash_create(ad_account_id, ad_create_request, &context).await
    }

    /// Get ad
    async fn ads_slash_get(
        &self,
        ad_account_id: String,
        ad_id: String,
        ) -> Result<AdsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_slash_get(ad_account_id, ad_id, &context).await
    }

    /// List ads
    async fn ads_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        ad_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<AdsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_slash_list(ad_account_id, campaign_ids, ad_group_ids, ad_ids, entity_statuses, page_size, order, bookmark, &context).await
    }

    /// Update ads
    async fn ads_slash_update(
        &self,
        ad_account_id: String,
        ad_update_request: &Vec<models::AdUpdateRequest>,
        ) -> Result<AdsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_slash_update(ad_account_id, ad_update_request, &context).await
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

    /// Create audience
    async fn audiences_slash_create(
        &self,
        ad_account_id: String,
        audience_create_request: models::AudienceCreateRequest,
        ) -> Result<AudiencesSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().audiences_slash_create(ad_account_id, audience_create_request, &context).await
    }

    /// Create custom audience
    async fn audiences_slash_create_custom(
        &self,
        ad_account_id: String,
        audience_create_custom_request: models::AudienceCreateCustomRequest,
        ) -> Result<AudiencesSlashCreateCustomResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().audiences_slash_create_custom(ad_account_id, audience_create_custom_request, &context).await
    }

    /// Get audience
    async fn audiences_slash_get(
        &self,
        ad_account_id: String,
        audience_id: String,
        ) -> Result<AudiencesSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().audiences_slash_get(ad_account_id, audience_id, &context).await
    }

    /// List audiences
    async fn audiences_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        order: Option<String>,
        page_size: Option<i32>,
        ownership_type: Option<String>,
        ) -> Result<AudiencesSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().audiences_slash_list(ad_account_id, bookmark, order, page_size, ownership_type, &context).await
    }

    /// Update audience
    async fn audiences_slash_update(
        &self,
        ad_account_id: String,
        audience_id: String,
        audience_update_request: Option<models::AudienceUpdateRequest>,
        ) -> Result<AudiencesSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().audiences_slash_update(ad_account_id, audience_id, audience_update_request, &context).await
    }

    /// Redeem ad credits
    async fn ads_credit_slash_redeem(
        &self,
        ad_account_id: String,
        ads_credit_redeem_request: models::AdsCreditRedeemRequest,
        ) -> Result<AdsCreditSlashRedeemResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_credit_slash_redeem(ad_account_id, ads_credit_redeem_request, &context).await
    }

    /// Get ads credit discounts
    async fn ads_credits_discounts_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<AdsCreditsDiscountsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ads_credits_discounts_slash_get(ad_account_id, bookmark, page_size, &context).await
    }

    /// Get billing profiles
    async fn billing_profiles_slash_get(
        &self,
        ad_account_id: String,
        is_active: bool,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<BillingProfilesSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().billing_profiles_slash_get(ad_account_id, is_active, bookmark, page_size, &context).await
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
        ssio_create_insertion_order_request: models::SsioCreateInsertionOrderRequest,
        ) -> Result<SsioInsertionOrderSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ssio_insertion_order_slash_create(ad_account_id, ssio_create_insertion_order_request, &context).await
    }

    /// Edit insertion order through SSIO.
    async fn ssio_insertion_order_slash_edit(
        &self,
        ad_account_id: String,
        ssio_edit_insertion_order_request: models::SsioEditInsertionOrderRequest,
        ) -> Result<SsioInsertionOrderSlashEditResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ssio_insertion_order_slash_edit(ad_account_id, ssio_edit_insertion_order_request, &context).await
    }

    /// Get insertion order status by ad account id.
    async fn ssio_insertion_orders_status_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<SsioInsertionOrdersStatusSlashGetByAdAccountResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ssio_insertion_orders_status_slash_get_by_ad_account(ad_account_id, bookmark, page_size, &context).await
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

    /// Get Salesforce order lines by ad account id.
    async fn ssio_order_lines_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        pin_order_id: Option<String>,
        ) -> Result<SsioOrderLinesSlashGetByAdAccountResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ssio_order_lines_slash_get_by_ad_account(ad_account_id, bookmark, page_size, pin_order_id, &context).await
    }

    /// Create board section
    async fn board_sections_slash_create(
        &self,
        board_id: String,
        board_section: models::BoardSection,
        ad_account_id: Option<String>,
        ) -> Result<BoardSectionsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_slash_create(board_id, board_section, ad_account_id, &context).await
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

    /// List board sections
    async fn board_sections_slash_list(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<BoardSectionsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_slash_list(board_id, ad_account_id, bookmark, page_size, &context).await
    }

    /// List Pins on board section
    async fn board_sections_slash_list_pins(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
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
        board_section: models::BoardSection,
        ad_account_id: Option<String>,
        ) -> Result<BoardSectionsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().board_sections_slash_update(board_id, section_id, board_section, ad_account_id, &context).await
    }

    /// Create board
    async fn boards_slash_create(
        &self,
        board: models::Board,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_slash_create(board, ad_account_id, &context).await
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

    /// List boards
    async fn boards_slash_list(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        privacy: Option<String>,
        ) -> Result<BoardsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_slash_list(ad_account_id, bookmark, page_size, privacy, &context).await
    }

    /// List Pins on board
    async fn boards_slash_list_pins(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        creative_types: Option<&Vec<String>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        ) -> Result<BoardsSlashListPinsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_slash_list_pins(board_id, bookmark, page_size, creative_types, ad_account_id, pin_metrics, &context).await
    }

    /// Update board
    async fn boards_slash_update(
        &self,
        board_id: String,
        board_update: models::BoardUpdate,
        ad_account_id: Option<String>,
        ) -> Result<BoardsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_slash_update(board_id, board_update, ad_account_id, &context).await
    }

    /// Get advertiser entities in bulk
    async fn bulk_download_slash_create(
        &self,
        ad_account_id: String,
        bulk_download_request: models::BulkDownloadRequest,
        ) -> Result<BulkDownloadSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().bulk_download_slash_create(ad_account_id, bulk_download_request, &context).await
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

    /// Get targeting analytics for campaigns
    async fn campaign_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        campaign_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        ) -> Result<CampaignTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaign_targeting_analytics_slash_get(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, &context).await
    }

    /// Get campaign analytics
    async fn campaigns_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        campaign_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<CampaignsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_slash_analytics(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, &context).await
    }

    /// Create campaigns
    async fn campaigns_slash_create(
        &self,
        ad_account_id: String,
        campaign_create_request: &Vec<models::CampaignCreateRequest>,
        ) -> Result<CampaignsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_slash_create(ad_account_id, campaign_create_request, &context).await
    }

    /// Get campaign
    async fn campaigns_slash_get(
        &self,
        ad_account_id: String,
        campaign_id: String,
        ) -> Result<CampaignsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_slash_get(ad_account_id, campaign_id, &context).await
    }

    /// List campaigns
    async fn campaigns_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<CampaignsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_slash_list(ad_account_id, campaign_ids, entity_statuses, page_size, order, bookmark, &context).await
    }

    /// Update campaigns
    async fn campaigns_slash_update(
        &self,
        ad_account_id: String,
        campaign_update_request: &Vec<models::CampaignUpdateRequest>,
        ) -> Result<CampaignsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().campaigns_slash_update(ad_account_id, campaign_update_request, &context).await
    }

    /// List products for a Product Group
    async fn catalogs_product_group_pins_slash_list(
        &self,
        product_group_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupPinsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_group_pins_slash_list(product_group_id, bookmark, page_size, ad_account_id, &context).await
    }

    /// Create product group
    async fn catalogs_product_groups_slash_create(
        &self,
        catalogs_product_groups_create_request: models::CatalogsProductGroupsCreateRequest,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_create(catalogs_product_groups_create_request, ad_account_id, &context).await
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

    /// List product groups
    async fn catalogs_product_groups_slash_list(
        &self,
        feed_id: Option<String>,
        catalog_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_list(feed_id, catalog_id, bookmark, page_size, ad_account_id, &context).await
    }

    /// Get product counts for a Product Group
    async fn catalogs_product_groups_slash_product_counts_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_product_counts_get(product_group_id, ad_account_id, &context).await
    }

    /// Update product group
    async fn catalogs_product_groups_slash_update(
        &self,
        product_group_id: String,
        catalogs_product_groups_update_request: models::CatalogsProductGroupsUpdateRequest,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsProductGroupsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_product_groups_slash_update(product_group_id, catalogs_product_groups_update_request, ad_account_id, &context).await
    }

    /// List catalogs
    async fn catalogs_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<CatalogsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().catalogs_slash_list(bookmark, page_size, ad_account_id, &context).await
    }

    /// List processing results for a given feed
    async fn feed_processing_results_slash_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<FeedProcessingResultsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feed_processing_results_slash_list(feed_id, bookmark, page_size, ad_account_id, &context).await
    }

    /// Create feed
    async fn feeds_slash_create(
        &self,
        feeds_create_request: models::FeedsCreateRequest,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_slash_create(feeds_create_request, ad_account_id, &context).await
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

    /// List feeds
    async fn feeds_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_slash_list(bookmark, page_size, catalog_id, ad_account_id, &context).await
    }

    /// Update feed
    async fn feeds_slash_update(
        &self,
        feed_id: String,
        feeds_update_request: models::FeedsUpdateRequest,
        ad_account_id: Option<String>,
        ) -> Result<FeedsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().feeds_slash_update(feed_id, feeds_update_request, ad_account_id, &context).await
    }

    /// Get catalogs item batch status
    async fn items_batch_slash_get(
        &self,
        batch_id: String,
        ad_account_id: Option<String>,
        ) -> Result<ItemsBatchSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().items_batch_slash_get(batch_id, ad_account_id, &context).await
    }

    /// Operate on item batch
    async fn items_batch_slash_post(
        &self,
        items_batch_post_request: models::ItemsBatchPostRequest,
        ad_account_id: Option<String>,
        ) -> Result<ItemsBatchSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().items_batch_slash_post(items_batch_post_request, ad_account_id, &context).await
    }

    /// List item issues for a given processing result
    async fn items_issues_slash_list(
        &self,
        processing_result_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        item_numbers: Option<&Vec<i32>>,
        item_validation_issue: Option<models::CatalogsItemValidationIssue>,
        ad_account_id: Option<String>,
        ) -> Result<ItemsIssuesSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().items_issues_slash_list(processing_result_id, bookmark, page_size, item_numbers, item_validation_issue, ad_account_id, &context).await
    }

    /// Get catalogs items
    async fn items_slash_get(
        &self,
        country: String,
        language: String,
        ad_account_id: Option<String>,
        item_ids: Option<&Vec<String>>,
        filters: Option<models::CatalogsItemsFilters>,
        ) -> Result<ItemsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().items_slash_get(country, language, ad_account_id, item_ids, filters, &context).await
    }

    /// List filtered products
    async fn products_by_product_group_filter_slash_list(
        &self,
        catalogs_list_products_by_filter_request: models::CatalogsListProductsByFilterRequest,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<ProductsByProductGroupFilterSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().products_by_product_group_filter_slash_list(catalogs_list_products_by_filter_request, bookmark, page_size, ad_account_id, &context).await
    }

    /// Send conversions
    async fn events_slash_create(
        &self,
        ad_account_id: String,
        conversion_events: models::ConversionEvents,
        test: Option<bool>,
        ) -> Result<EventsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().events_slash_create(ad_account_id, conversion_events, test, &context).await
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

    /// Get conversion tags
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
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<PageVisitConversionTagsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().page_visit_conversion_tags_slash_get(ad_account_id, page_size, order, bookmark, &context).await
    }

    /// Create customer lists
    async fn customer_lists_slash_create(
        &self,
        ad_account_id: String,
        customer_list_request: models::CustomerListRequest,
        ) -> Result<CustomerListsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_lists_slash_create(ad_account_id, customer_list_request, &context).await
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

    /// Get customer lists
    async fn customer_lists_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<CustomerListsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_lists_slash_list(ad_account_id, page_size, order, bookmark, &context).await
    }

    /// Update customer list
    async fn customer_lists_slash_update(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_update_request: models::CustomerListUpdateRequest,
        ) -> Result<CustomerListsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().customer_lists_slash_update(ad_account_id, customer_list_id, customer_list_update_request, &context).await
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
        integration_request_patch: Option<models::IntegrationRequestPatch>,
        ) -> Result<IntegrationsCommerceSlashPatchResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().integrations_commerce_slash_patch(external_business_id, integration_request_patch, &context).await
    }

    /// Create commerce integration
    async fn integrations_commerce_slash_post(
        &self,
        integration_request: Option<models::IntegrationRequest>,
        ) -> Result<IntegrationsCommerceSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().integrations_commerce_slash_post(integration_request, &context).await
    }

    /// Receives batched logs from integration applications.
    async fn integrations_logs_slash_post(
        &self,
        integration_logs_request: models::IntegrationLogsRequest,
        ) -> Result<IntegrationsLogsSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().integrations_logs_slash_post(integration_logs_request, &context).await
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

    /// Get integration metadata list
    async fn integrations_slash_get_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<IntegrationsSlashGetListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().integrations_slash_get_list(bookmark, page_size, &context).await
    }

    /// Get country's keyword metrics
    async fn country_keywords_metrics_slash_get(
        &self,
        ad_account_id: String,
        country_code: String,
        keywords: &Vec<String>,
        ) -> Result<CountryKeywordsMetricsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().country_keywords_metrics_slash_get(ad_account_id, country_code, keywords, &context).await
    }

    /// Create keywords
    async fn keywords_slash_create(
        &self,
        ad_account_id: String,
        keywords_request: models::KeywordsRequest,
        ) -> Result<KeywordsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().keywords_slash_create(ad_account_id, keywords_request, &context).await
    }

    /// Get keywords
    async fn keywords_slash_get(
        &self,
        ad_account_id: String,
        campaign_id: Option<String>,
        ad_group_id: Option<String>,
        match_types: Option<&Vec<models::MatchType>>,
        page_size: Option<i32>,
        bookmark: Option<String>,
        ) -> Result<KeywordsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().keywords_slash_get(ad_account_id, campaign_id, ad_group_id, match_types, page_size, bookmark, &context).await
    }

    /// Update keywords
    async fn keywords_slash_update(
        &self,
        ad_account_id: String,
        keyword_update_body: models::KeywordUpdateBody,
        ) -> Result<KeywordsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().keywords_slash_update(ad_account_id, keyword_update_body, &context).await
    }

    /// List trending keywords
    async fn trending_keywords_slash_list(
        &self,
        region: models::TrendsSupportedRegion,
        trend_type: models::TrendType,
        interests: Option<&Vec<String>>,
        genders: Option<&Vec<String>>,
        ages: Option<&Vec<String>>,
        normalize_against_group: Option<bool>,
        limit: Option<i32>,
        ) -> Result<TrendingKeywordsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().trending_keywords_slash_list(region, trend_type, interests, genders, ages, normalize_against_group, limit, &context).await
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

    /// Get lead ads subscription
    async fn ad_accounts_subscriptions_slash_get_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        ) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_subscriptions_slash_get_by_id(ad_account_id, subscription_id, &context).await
    }

    /// Get lead ads subscriptions
    async fn ad_accounts_subscriptions_slash_get_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        bookmark: Option<String>,
        ) -> Result<AdAccountsSubscriptionsSlashGetListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_subscriptions_slash_get_list(ad_account_id, page_size, bookmark, &context).await
    }

    /// Create lead ads subscription
    async fn ad_accounts_subscriptions_slash_post(
        &self,
        ad_account_id: String,
        ad_account_create_subscription_request: models::AdAccountCreateSubscriptionRequest,
        ) -> Result<AdAccountsSubscriptionsSlashPostResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_subscriptions_slash_post(ad_account_id, ad_account_create_subscription_request, &context).await
    }

    /// Get lead form by id
    async fn lead_form_slash_get(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        ) -> Result<LeadFormSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().lead_form_slash_get(ad_account_id, lead_form_id, &context).await
    }

    /// Create lead form test data
    async fn lead_form_test_slash_create(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        lead_form_test_request: models::LeadFormTestRequest,
        ) -> Result<LeadFormTestSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().lead_form_test_slash_create(ad_account_id, lead_form_id, lead_form_test_request, &context).await
    }

    /// Get lead forms
    async fn lead_forms_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<LeadFormsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().lead_forms_slash_list(ad_account_id, page_size, order, bookmark, &context).await
    }

    /// Register media upload
    async fn media_slash_create(
        &self,
        media_upload_request: models::MediaUploadRequest,
        ) -> Result<MediaSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().media_slash_create(media_upload_request, &context).await
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

    /// List media uploads
    async fn media_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<MediaSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().media_slash_list(bookmark, page_size, &context).await
    }

    /// Generate OAuth access token
    async fn oauth_slash_token(
        &self,
        grant_type: String,
        ) -> Result<OauthSlashTokenResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().oauth_slash_token(grant_type, &context).await
    }

    /// Get order line
    async fn order_lines_slash_get(
        &self,
        ad_account_id: String,
        order_line_id: String,
        ) -> Result<OrderLinesSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().order_lines_slash_get(ad_account_id, order_line_id, &context).await
    }

    /// Get order lines
    async fn order_lines_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<OrderLinesSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().order_lines_slash_list(ad_account_id, page_size, order, bookmark, &context).await
    }

    /// Get Pin analytics
    async fn pins_slash_analytics(
        &self,
        pin_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &Vec<models::PinsAnalyticsMetricTypesParameterInner>,
        app_types: Option<String>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_slash_analytics(pin_id, start_date, end_date, metric_types, app_types, split_field, ad_account_id, &context).await
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
        pin_metrics: Option<bool>,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_slash_get(pin_id, pin_metrics, ad_account_id, &context).await
    }

    /// List Pins
    async fn pins_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        pin_filter: Option<String>,
        include_protected_pins: Option<bool>,
        pin_type: Option<String>,
        creative_types: Option<&Vec<String>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        ) -> Result<PinsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_slash_list(bookmark, page_size, pin_filter, include_protected_pins, pin_type, creative_types, ad_account_id, pin_metrics, &context).await
    }

    /// Save Pin
    async fn pins_slash_save(
        &self,
        pin_id: String,
        pins_save_request: models::PinsSaveRequest,
        ad_account_id: Option<String>,
        ) -> Result<PinsSlashSaveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pins_slash_save(pin_id, pins_save_request, ad_account_id, &context).await
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
        product_group_promotion_create_request: models::ProductGroupPromotionCreateRequest,
        ) -> Result<ProductGroupPromotionsSlashCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_group_promotions_slash_create(ad_account_id, product_group_promotion_create_request, &context).await
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

    /// Get product group promotions
    async fn product_group_promotions_slash_list(
        &self,
        ad_account_id: String,
        product_group_promotion_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        ad_group_id: Option<String>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        ) -> Result<ProductGroupPromotionsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_group_promotions_slash_list(ad_account_id, product_group_promotion_ids, entity_statuses, ad_group_id, page_size, order, bookmark, &context).await
    }

    /// Update product group promotions
    async fn product_group_promotions_slash_update(
        &self,
        ad_account_id: String,
        product_group_promotion_update_request: models::ProductGroupPromotionUpdateRequest,
        ) -> Result<ProductGroupPromotionsSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_group_promotions_slash_update(ad_account_id, product_group_promotion_update_request, &context).await
    }

    /// Get product group analytics
    async fn product_groups_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        product_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        ) -> Result<ProductGroupsSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().product_groups_slash_analytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, &context).await
    }

    /// Get catalog product groups
    async fn ad_accounts_catalogs_product_groups_slash_list(
        &self,
        ad_account_id: String,
        feed_profile_id: Option<String>,
        ) -> Result<AdAccountsCatalogsProductGroupsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ad_accounts_catalogs_product_groups_slash_list(ad_account_id, feed_profile_id, &context).await
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
        report_type: Option<String>,
        ) -> Result<DeliveryMetricsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delivery_metrics_slash_get(report_type, &context).await
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

    /// Get targeting options
    async fn targeting_options_slash_get(
        &self,
        targeting_type: String,
        client_id: Option<String>,
        oauth_signature: Option<String>,
        timestamp: Option<String>,
        ) -> Result<TargetingOptionsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().targeting_options_slash_get(targeting_type, client_id, oauth_signature, timestamp, &context).await
    }

    /// Search pins by a given search term
    async fn search_partner_pins(
        &self,
        term: String,
        country_code: String,
        bookmark: Option<String>,
        locale: Option<String>,
        limit: Option<i32>,
        ) -> Result<SearchPartnerPinsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().search_partner_pins(term, country_code, bookmark, locale, limit, &context).await
    }

    /// Search user's boards
    async fn search_user_boards_slash_get(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        query: Option<String>,
        ) -> Result<SearchUserBoardsSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().search_user_boards_slash_get(ad_account_id, bookmark, page_size, query, &context).await
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

    /// List related terms
    async fn terms_related_slash_list(
        &self,
        terms: &Vec<String>,
        ) -> Result<TermsRelatedSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().terms_related_slash_list(terms, &context).await
    }

    /// List suggested terms
    async fn terms_suggested_slash_list(
        &self,
        term: String,
        limit: Option<i32>,
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

    /// List following boards
    async fn boards_user_follows_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        explicit_following: Option<bool>,
        ad_account_id: Option<String>,
        ) -> Result<BoardsUserFollowsSlashListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().boards_user_follows_slash_list(bookmark, page_size, explicit_following, ad_account_id, &context).await
    }

    /// Follow user
    async fn follow_user_slash_update(
        &self,
        username: String,
        follow_user_request: models::FollowUserRequest,
        ) -> Result<FollowUserSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().follow_user_slash_update(username, follow_user_request, &context).await
    }

    /// List followers
    async fn followers_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
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
    async fn user_account_slash_analytics(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_account_slash_analytics(start_date, end_date, from_claimed_content, pin_format, app_types, content_type, source, metric_types, split_field, ad_account_id, &context).await
    }

    /// Get user account top pins analytics
    async fn user_account_slash_analytics_slash_top_pins(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: String,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        num_of_pins: Option<i32>,
        created_in_last_n_days: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsSlashTopPinsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_account_slash_analytics_slash_top_pins(start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, &context).await
    }

    /// Get user account top video pins analytics
    async fn user_account_slash_analytics_slash_top_video_pins(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: String,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        num_of_pins: Option<i32>,
        created_in_last_n_days: Option<i32>,
        ad_account_id: Option<String>,
        ) -> Result<UserAccountSlashAnalyticsSlashTopVideoPinsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_account_slash_analytics_slash_top_video_pins(start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, &context).await
    }

    /// List following interests
    async fn user_account_slash_followed_interests(
        &self,
        username: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<UserAccountSlashFollowedInterestsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_account_slash_followed_interests(username, bookmark, page_size, &context).await
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
        bookmark: Option<String>,
        page_size: Option<i32>,
        feed_type: Option<models::UserFollowingFeedType>,
        explicit_following: Option<bool>,
        ad_account_id: Option<String>,
        ) -> Result<UserFollowingSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_following_slash_get(bookmark, page_size, feed_type, explicit_following, ad_account_id, &context).await
    }

    /// Get user websites
    async fn user_websites_slash_get(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ) -> Result<UserWebsitesSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().user_websites_slash_get(bookmark, page_size, &context).await
    }

    /// Verify website
    async fn verify_website_slash_update(
        &self,
        user_website_verify_request: models::UserWebsiteVerifyRequest,
        ) -> Result<VerifyWebsiteSlashUpdateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().verify_website_slash_update(user_website_verify_request, &context).await
    }

    /// Get user verification code for website claiming
    async fn website_verification_slash_get(
        &self,
        ) -> Result<WebsiteVerificationSlashGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().website_verification_slash_get(&context).await
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
