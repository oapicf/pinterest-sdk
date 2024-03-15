#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]
#![allow(unused_imports, unused_attributes)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use types::*;

pub const BASE_PATH: &str = "/v5";
pub const API_VERSION: &str = "5.12.0";

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (Vec<models::AdAccountAnalyticsResponseInner>)
    ,
    /// Invalid ad account analytics parameters.
    Status400_InvalidAdAccountAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountTargetingAnalyticsSlashGetResponse {
    /// Success
    Status200_Success
    (models::MetricsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::AdAccount)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSlashGetResponse {
    /// Success
    Status200_Success
    (models::AdAccount)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSlashListResponse {
    /// response
    Status200_Response
    (models::AdAccountsList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AnalyticsSlashCreateMmmReportResponse {
    /// Success
    Status200_Success
    (models::CreateMmmReportResponse)
    ,
    /// Invalid ad account ads analytics mmm parameters
    Status400_InvalidAdAccountAdsAnalyticsMmmParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AnalyticsSlashCreateReportResponse {
    /// Success
    Status200_Success
    (models::AdsAnalyticsCreateAsyncResponse)
    ,
    /// Invalid ad account ads analytics parameters.
    Status400_InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AnalyticsSlashCreateTemplateReportResponse {
    /// Success
    Status200_Success
    (models::AdsAnalyticsCreateAsyncResponse)
    ,
    /// Invalid ad account ads analytics template parameters.
    Status400_InvalidAdAccountAdsAnalyticsTemplateParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AnalyticsSlashGetMmmReportResponse {
    /// Success
    Status200_Success
    (models::GetMmmReportResponse)
    ,
    /// Invalid ad account ads analytics parameters.
    Status400_InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AnalyticsSlashGetReportResponse {
    /// Success
    Status200_Success
    (models::AdsAnalyticsGetAsyncResponse)
    ,
    /// Invalid ad account ads analytics parameters.
    Status400_InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SandboxSlashDeleteResponse {
    /// OK
    Status200_OK
    (String)
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
pub enum TemplatesSlashListResponse {
    /// Success
    Status200_Success
    (models::TemplatesList200Response)
    ,
    /// Invalid ad account template parameters.
    Status400_InvalidAdAccountTemplateParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsBidFloorSlashGetResponse {
    /// Success
    Status200_Success
    (models::BidFloor)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (Vec<models::AdGroupsAnalyticsResponseInner>)
    ,
    /// Invalid ad account group analytics parameters.
    Status400_InvalidAdAccountGroupAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashAudienceSizingResponse {
    /// Success
    Status200_Success
    (models::AdGroupAudienceSizingResponse)
    ,
    /// Invalid ad group audience sizing parameters.
    Status400_InvalidAdGroupAudienceSizingParameters
    (models::Error)
    ,
    /// No access to requested audience list or product group.
    Status403_NoAccessToRequestedAudienceListOrProductGroup
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::AdGroupArrayResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashGetResponse {
    /// Success
    Status200_Success
    (models::AdGroupResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashListResponse {
    /// Success
    Status200_Success
    (models::AdGroupsList200Response)
    ,
    /// Invalid ad account group parameters.
    Status400_InvalidAdAccountGroupParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::AdGroupArrayResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdGroupsTargetingAnalyticsSlashGetResponse {
    /// Success
    Status200_Success
    (models::MetricsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdPreviewsSlashCreateResponse {
    /// Successful ad preview creation.
    Status200_SuccessfulAdPreviewCreation
    (models::AdPreviewUrlResponse)
    ,
    /// Invalid Pin parameters response
    Status400_InvalidPinParametersResponse
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdTargetingAnalyticsSlashGetResponse {
    /// Success
    Status200_Success
    (models::MetricsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (Vec<models::AdsAnalyticsResponseInner>)
    ,
    /// Invalid ad account ads analytics parameters.
    Status400_InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::AdArrayResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsSlashGetResponse {
    /// Success
    Status200_Success
    (models::AdResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsSlashListResponse {
    /// Success
    Status200_Success
    (models::AdsList200Response)
    ,
    /// Invalid ad account ads parameters.
    Status400_InvalidAdAccountAdsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::AdArrayResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudienceInsightsScopeAndTypeSlashGetResponse {
    /// Success
    Status200_Success
    (models::AudienceDefinitionResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudienceInsightsSlashGetResponse {
    /// Success
    Status200_Success
    (models::AudienceInsightsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudiencesSlashCreateResponse {
    /// Success
    Status200_Success
    (models::Audience)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudiencesSlashCreateCustomResponse {
    /// Success
    Status200_Success
    (models::Audience)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudiencesSlashGetResponse {
    /// Success
    Status200_Success
    (models::Audience)
    ,
    /// Audience not found.
    Status404_AudienceNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudiencesSlashListResponse {
    /// Success
    Status200_Success
    (models::AudiencesList200Response)
    ,
    /// Invalid ad account audience parameters.
    Status400_InvalidAdAccountAudienceParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudiencesSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::Audience)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsCreditSlashRedeemResponse {
    /// Successfully redeemed ad credits.
    Status200_SuccessfullyRedeemedAdCredits
    (models::AdsCreditRedeemResponse)
    ,
    /// Error thrown when unable to redeem offer code.
    Status400_ErrorThrownWhenUnableToRedeemOfferCode
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsCreditsDiscountsSlashGetResponse {
    /// Success
    Status200_Success
    (models::AdsCreditsDiscountsGet200Response)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BillingProfilesSlashGetResponse {
    /// Success
    Status200_Success
    (models::BillingProfilesGet200Response)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioAccountsSlashGetResponse {
    /// Success
    Status200_Success
    (models::SsioAccountResponse)
    ,
    /// Invalid request parameter.
    Status400_InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioInsertionOrderSlashCreateResponse {
    /// Success
    Status200_Success
    (models::SsioCreateInsertionOrderResponse)
    ,
    /// Invalid request.
    Status400_InvalidRequest
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioInsertionOrderSlashEditResponse {
    /// Success
    Status200_Success
    (models::SsioEditInsertionOrderResponse)
    ,
    /// Invalid request.
    Status400_InvalidRequest
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioInsertionOrdersStatusSlashGetByAdAccountResponse {
    /// Success
    Status200_Success
    (models::SsioInsertionOrdersStatusGetByAdAccount200Response)
    ,
    /// Invalid request parameter.
    Status400_InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse {
    /// Success
    Status200_Success
    (models::SsioInsertionOrderStatusResponse)
    ,
    /// Invalid request parameter.
    Status400_InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SsioOrderLinesSlashGetByAdAccountResponse {
    /// Success
    Status200_Success
    (models::SsioOrderLinesGetByAdAccount200Response)
    ,
    /// Invalid request parameter.
    Status400_InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardSectionsSlashCreateResponse {
    /// response
    Status201_Response
    (models::BoardSection)
    ,
    /// Invalid board section parameters.
    Status400_InvalidBoardSectionParameters
    (models::Error)
    ,
    /// Not authorized to create board sections.
    Status403_NotAuthorizedToCreateBoardSections
    (models::Error)
    ,
    /// Could not get exclusive access to the board to create a new section.
    Status409_CouldNotGetExclusiveAccessToTheBoardToCreateANewSection
    (models::Error)
    ,
    /// Could not create a new board section.
    Status500_CouldNotCreateANewBoardSection
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardSectionsSlashDeleteResponse {
    /// Board section deleted successfully
    Status204_BoardSectionDeletedSuccessfully
    ,
    /// Not authorized to delete board section.
    Status403_NotAuthorizedToDeleteBoardSection
    (models::Error)
    ,
    /// Board section not found.
    Status404_BoardSectionNotFound
    (models::Error)
    ,
    /// Board section conflict.
    Status409_BoardSectionConflict
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardSectionsSlashListResponse {
    /// response
    Status200_Response
    (models::BoardSectionsList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardSectionsSlashListPinsResponse {
    /// response
    Status200_Response
    (models::BoardsListPins200Response)
    ,
    /// Not authorized to access Pins on board section.
    Status403_NotAuthorizedToAccessPinsOnBoardSection
    (models::Error)
    ,
    /// Board or section not found.
    Status404_BoardOrSectionNotFound
    (models::Error)
    ,
    /// Board section conflict.
    Status409_BoardSectionConflict
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardSectionsSlashUpdateResponse {
    /// response
    Status200_Response
    (models::BoardSection)
    ,
    /// Invalid board section parameters.
    Status400_InvalidBoardSectionParameters
    (models::Error)
    ,
    /// Not authorized to update board section.
    Status403_NotAuthorizedToUpdateBoardSection
    (models::Error)
    ,
    /// Board section conflict.
    Status409_BoardSectionConflict
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashCreateResponse {
    /// response
    Status201_Response
    (models::Board)
    ,
    /// The board name is invalid or duplicated.
    Status400_TheBoardNameIsInvalidOrDuplicated
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashDeleteResponse {
    /// Board deleted successfully
    Status204_BoardDeletedSuccessfully
    ,
    /// Not authorized to delete the board.
    Status403_NotAuthorizedToDeleteTheBoard
    (models::Error)
    ,
    /// Board not found.
    Status404_BoardNotFound
    (models::Error)
    ,
    /// Could not get exclusive access to delete the board.
    Status409_CouldNotGetExclusiveAccessToDeleteTheBoard
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashGetResponse {
    /// response
    Status200_Response
    (models::Board)
    ,
    /// Board not found.
    Status404_BoardNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashListResponse {
    /// response
    Status200_Response
    (models::BoardsList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashListPinsResponse {
    /// response
    Status200_Response
    (models::BoardsListPins200Response)
    ,
    /// Board not found.
    Status404_BoardNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashUpdateResponse {
    /// response
    Status200_Response
    (models::Board)
    ,
    /// Invalid board parameters.
    Status400_InvalidBoardParameters
    (models::Error)
    ,
    /// Not authorized to update the board.
    Status403_NotAuthorizedToUpdateTheBoard
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BulkDownloadSlashCreateResponse {
    /// Success
    Status200_Success
    (models::BulkDownloadResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BulkRequestSlashGetResponse {
    /// Success
    Status200_Success
    (models::BulkUpsertStatusResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BulkUpsertSlashCreateResponse {
    /// Success
    Status200_Success
    (models::BulkUpsertResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CampaignTargetingAnalyticsSlashGetResponse {
    /// Success
    Status200_Success
    (models::MetricsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CampaignsSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (Vec<models::CampaignsAnalyticsResponseInner>)
    ,
    /// Invalid ad account campaign analytics parameters.
    Status400_InvalidAdAccountCampaignAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CampaignsSlashCreateResponse {
    /// response
    Status200_Response
    (models::CampaignCreateResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CampaignsSlashGetResponse {
    /// Success
    Status200_Success
    (models::CampaignResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CampaignsSlashListResponse {
    /// Success
    Status200_Success
    (models::CampaignsList200Response)
    ,
    /// Invalid ad account campaign parameters.
    Status400_InvalidAdAccountCampaignParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CampaignsSlashUpdateResponse {
    /// response
    Status200_Response
    (models::CampaignUpdateResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupPinsSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupPinsList200Response)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashCreateResponse {
    /// Success
    Status201_Success
    (models::CatalogsProductGroupsCreate201Response)
    ,
    /// Invalid body.
    Status400_InvalidBody
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Conflict. Can't create this catalogs product group with this value.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashDeleteResponse {
    /// Catalogs Product Group deleted successfully.
    Status204_CatalogsProductGroupDeletedSuccessfully
    ,
    /// Invalid catalogs product group id parameters.
    Status400_InvalidCatalogsProductGroupIdParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't delete this catalogs product group.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashGetResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupsCreate201Response)
    ,
    /// Invalid catalogs product group id parameters.
    Status400_InvalidCatalogsProductGroupIdParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't get a catalogs product group without an existing catalog.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupsList200Response)
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    Status404_DataFeedNotFound
    (models::Error)
    ,
    /// Conflict. Can't create this catalogs product group with this value.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashProductCountsGetResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupProductCounts)
    ,
    /// Product Group Not Found.
    Status404_ProductGroupNotFound
    (models::Error)
    ,
    /// Can't access this feature without an existing catalog.
    Status409_Can
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupsCreate201Response)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't update this catalogs product group to this value.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsList200Response)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedProcessingResultsSlashListResponse {
    /// Success
    Status200_Success
    (models::FeedProcessingResultsList200Response)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Feed not found.
    Status404_FeedNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedsSlashCreateResponse {
    /// Success
    Status201_Success
    (models::CatalogsFeed)
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Business account required.
    Status403_BusinessAccountRequired
    (models::Error)
    ,
    /// User website required.
    Status409_UserWebsiteRequired
    (models::Error)
    ,
    /// Unique feed name is required.
    Status422_UniqueFeedNameIsRequired
    (models::Error)
    ,
    /// Not implemented (absent \"default_country\" or \"default_locale\").
    Status501_NotImplemented
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedsSlashDeleteResponse {
    /// Feed deleted successfully.
    Status204_FeedDeletedSuccessfully
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Forbidden. Account not approved for feed mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    Status404_DataFeedNotFound
    (models::Error)
    ,
    /// Conflict. Can't delete a feed with active promotions.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedsSlashGetResponse {
    /// Success
    Status200_Success
    (models::CatalogsFeed)
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Data feed not found.
    Status404_DataFeedNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedsSlashListResponse {
    /// Success
    Status200_Success
    (models::FeedsList200Response)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::CatalogsFeed)
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Forbidden. Account not approved for feed mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    Status404_DataFeedNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemsBatchSlashGetResponse {
    /// Response containing the requested catalogs items batch
    Status200_ResponseContainingTheRequestedCatalogsItemsBatch
    (models::CatalogsItemsBatch)
    ,
    /// Not authenticated to access catalogs items batch
    Status401_NotAuthenticatedToAccessCatalogsItemsBatch
    (models::Error)
    ,
    /// Not authorized to access catalogs items batch
    Status403_NotAuthorizedToAccessCatalogsItemsBatch
    (models::Error)
    ,
    /// Catalogs items batch not found
    Status404_CatalogsItemsBatchNotFound
    (models::Error)
    ,
    /// Method Not Allowed.
    Status405_MethodNotAllowed
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemsBatchSlashPostResponse {
    /// Response containing the requested catalogs items batch
    Status200_ResponseContainingTheRequestedCatalogsItemsBatch
    (models::CatalogsItemsBatch)
    ,
    /// Invalid request parameters.
    Status400_InvalidRequestParameters
    (models::Error)
    ,
    /// Not authenticated to post catalogs items
    Status401_NotAuthenticatedToPostCatalogsItems
    (models::Error)
    ,
    /// Not authorized to post catalogs items
    Status403_NotAuthorizedToPostCatalogsItems
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemsIssuesSlashListResponse {
    /// Success
    Status200_Success
    (models::ItemsIssuesList200Response)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Processing Result not found.
    Status404_ProcessingResultNotFound
    (models::Error)
    ,
    /// Not implemented.
    Status501_NotImplemented
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemsSlashGetResponse {
    /// Response containing the requested catalogs items
    Status200_ResponseContainingTheRequestedCatalogsItems
    (models::CatalogsItems)
    ,
    /// Invalid request parameters.
    Status400_InvalidRequestParameters
    (models::Error)
    ,
    /// Not authorized to access catalogs items
    Status401_NotAuthorizedToAccessCatalogsItems
    (models::Error)
    ,
    /// Not authorized to access catalogs items
    Status403_NotAuthorizedToAccessCatalogsItems
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductsByProductGroupFilterSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupPinsList200Response)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Conflict. Can't get products.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EventsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::ConversionApiResponse)
    ,
    /// The request was invalid.
    Status400_TheRequestWasInvalid
    (models::Error)
    ,
    /// Not authorized to send conversion events
    Status401_NotAuthorizedToSendConversionEvents
    (models::Error)
    ,
    /// Unauthorized access.
    Status403_UnauthorizedAccess
    (models::Error)
    ,
    /// Not all events were successfully processed.
    Status422_NotAllEventsWereSuccessfullyProcessed
    (models::DetailedError)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// The endpoint has been ramped down and is currently not accepting any traffic.
    Status503_TheEndpointHasBeenRampedDownAndIsCurrentlyNotAcceptingAnyTraffic
    (models::Error)
    ,
    /// Unexpected errors
    Status0_UnexpectedErrors
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ConversionTagsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::ConversionTagResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ConversionTagsSlashGetResponse {
    /// Success
    Status200_Success
    (models::ConversionTagResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ConversionTagsSlashListResponse {
    /// Success
    Status200_Success
    (models::ConversionTagListResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OcpmEligibleConversionTagsSlashGetResponse {
    /// Success
    Status200_Success
    (std::collections::HashMap<String, Vec<models::ConversionEventResponse>>)
    ,
    /// Unexpected errors
    Status0_UnexpectedErrors
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PageVisitConversionTagsSlashGetResponse {
    /// Success
    Status200_Success
    (models::PageVisitConversionTagsGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CustomerListsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::CustomerList)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CustomerListsSlashGetResponse {
    /// Success
    Status200_Success
    (models::CustomerList)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CustomerListsSlashListResponse {
    /// Success
    Status200_Success
    (models::CustomerListsList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CustomerListsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::CustomerList)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum IntegrationsCommerceSlashDelResponse {
    /// Commerce Integration deleted successfully
    Status204_CommerceIntegrationDeletedSuccessfully
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum IntegrationsCommerceSlashGetResponse {
    /// Success
    Status200_Success
    (models::IntegrationMetadata)
    ,
    /// Integration not found.
    Status404_IntegrationNotFound
    (models::Error)
    ,
    /// Can't access this integration metadata.
    Status409_Can
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum IntegrationsCommerceSlashPatchResponse {
    /// Success
    Status200_Success
    (models::IntegrationMetadata)
    ,
    /// Integration not found.
    Status404_IntegrationNotFound
    (models::Error)
    ,
    /// Can't access this integration metadata.
    Status409_Can
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum IntegrationsCommerceSlashPostResponse {
    /// Success
    Status200_Success
    (models::IntegrationMetadata)
    ,
    /// Integration not found.
    Status404_IntegrationNotFound
    (models::Error)
    ,
    /// Can't access this integration metadata.
    Status409_Can
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum IntegrationsLogsSlashPostResponse {
    /// Success.
    Status200_Success
    (models::IntegrationLogsSuccessResponse)
    ,
    /// Bad request.
    Status400_BadRequest
    (models::DetailedError)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum IntegrationsSlashGetByIdResponse {
    /// Success
    Status200_Success
    (models::IntegrationRecord)
    ,
    /// Integration not found.
    Status404_IntegrationNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum IntegrationsSlashGetListResponse {
    /// Success
    Status200_Success
    (models::IntegrationsGetList200Response)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CountryKeywordsMetricsSlashGetResponse {
    /// Success
    Status200_Success
    (models::KeywordsMetricsArrayResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum KeywordsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::KeywordsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum KeywordsSlashGetResponse {
    /// Success
    Status200_Success
    (models::KeywordsGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum KeywordsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::KeywordsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TrendingKeywordsSlashListResponse {
    /// Success
    Status200_Success
    (models::TrendingKeywordsResponse)
    ,
    /// Invalid trending keywords request parameters
    Status400_InvalidTrendingKeywordsRequestParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSubscriptionsSlashDelByIdResponse {
    /// Subscription deleted successfully
    Status204_SubscriptionDeletedSuccessfully
    ,
    /// Invalid input parameters.
    Status400_InvalidInputParameters
    (models::Error)
    ,
    /// You are not authorized to delete this subscription.
    Status403_YouAreNotAuthorizedToDeleteThisSubscription
    (models::Error)
    ,
    /// Subscription not found.
    Status404_SubscriptionNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSubscriptionsSlashGetByIdResponse {
    /// Success
    Status200_Success
    (models::AdAccountGetSubscriptionResponse)
    ,
    /// Invalid input parameters.
    Status400_InvalidInputParameters
    (models::Error)
    ,
    /// Can't access this subscription.
    Status403_Can
    (models::Error)
    ,
    /// Subscription not found.
    Status404_SubscriptionNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSubscriptionsSlashGetListResponse {
    /// Success
    Status200_Success
    (models::AdAccountsSubscriptionsGetList200Response)
    ,
    /// Can't access this subscription.
    Status403_Can
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsSubscriptionsSlashPostResponse {
    /// Success
    Status200_Success
    (models::AdAccountCreateSubscriptionResponse)
    ,
    /// Invalid input parameters.
    Status400_InvalidInputParameters
    (models::Error)
    ,
    /// Can't access this subscription.
    Status403_Can
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

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
pub enum MediaSlashCreateResponse {
    /// response
    Status201_Response
    (models::MediaUpload)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MediaSlashGetResponse {
    /// response
    Status200_Response
    (models::MediaUploadDetails)
    ,
    /// Media upload not found
    Status404_MediaUploadNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MediaSlashListResponse {
    /// response
    Status200_Response
    (models::MediaList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OauthSlashTokenResponse {
    /// response
    Status200_Response
    (models::OauthAccessTokenResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrderLinesSlashGetResponse {
    /// Success
    Status200_Success
    (models::OrderLine)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrderLinesSlashListResponse {
    /// Success
    Status200_Success
    (models::OrderLinesList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashAnalyticsResponse {
    /// response
    Status200_Response
    (std::collections::HashMap<String, models::PinAnalyticsMetricsResponse>)
    ,
    /// Invalid pins analytics parameters.
    Status400_InvalidPinsAnalyticsParameters
    (models::Error)
    ,
    /// Not authorized to access board or Pin.
    Status403_NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Pin not found.
    Status404_PinNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashCreateResponse {
    /// Successful pin creation.
    Status201_SuccessfulPinCreation
    (models::Pin)
    ,
    /// Invalid Pin parameters response
    Status400_InvalidPinParametersResponse
    (models::Error)
    ,
    /// The Pin's image is too small, too large or is broken
    Status403_ThePin
    (models::Error)
    ,
    /// Board or section not found
    Status404_BoardOrSectionNotFound
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashDeleteResponse {
    /// Successfully deleted Pin
    Status204_SuccessfullyDeletedPin
    ,
    /// Not authorized to access board or Pin.
    Status403_NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Pin not found.
    Status404_PinNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashGetResponse {
    /// response
    Status200_Response
    (models::Pin)
    ,
    /// Not authorized to access board or Pin.
    Status403_NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Pin not found.
    Status404_PinNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashListResponse {
    /// Success
    Status200_Success
    (models::PinsList200Response)
    ,
    /// Invalid pin filter value
    Status400_InvalidPinFilterValue
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashSaveResponse {
    /// Successfully saved pin.
    Status201_SuccessfullySavedPin
    (models::Pin)
    ,
    /// Not authorized to access Board or Pin.
    Status403_NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Board or Pin not found.
    Status404_BoardOrPinNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashUpdateResponse {
    /// response
    Status200_Response
    (models::Pin)
    ,
    /// Not authorized to update Pin.
    Status403_NotAuthorizedToUpdatePin
    (models::Error)
    ,
    /// Pin not found.
    Status404_PinNotFound
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductGroupPromotionsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::ProductGroupPromotionResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductGroupPromotionsSlashGetResponse {
    /// Success
    Status200_Success
    (models::ProductGroupPromotionResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductGroupPromotionsSlashListResponse {
    /// Success
    Status200_Success
    (models::ProductGroupPromotionsList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductGroupPromotionsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::ProductGroupPromotionResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductGroupsSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (Vec<models::ProductGroupAnalyticsResponseInner>)
    ,
    /// Invalid ad account ads analytics parameters.
    Status400_InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountsCatalogsProductGroupsSlashListResponse {
    /// Success
    Status200_Success
    (models::AdAccountsCatalogsProductGroupsList200Response)
    ,
    /// Invalid ad account ads parameters.
    Status400_InvalidAdAccountAdsParameters
    (models::Error)
    ,
    /// Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest.
    Status401_AccessDenied
    (models::Error)
    ,
    /// Merchant data not found.
    Status404_MerchantDataNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdAccountCountriesSlashGetResponse {
    /// Success
    Status200_Success
    (models::AdAccountsCountryResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeliveryMetricsSlashGetResponse {
    /// Success
    Status200_Success
    (models::DeliveryMetricsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum InterestTargetingOptionsSlashGetResponse {
    /// Success
    Status200_Success
    (models::SingleInterestTargetingOptionResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LeadFormQuestionsSlashGetResponse {
    /// Success
    Status200_Success
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MetricsReadyStateSlashGetResponse {
    /// Success
    Status200_Success
    (models::BookClosedResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TargetingOptionsSlashGetResponse {
    /// Success
    Status200_Success
    (Vec<crate::types::Object>)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SearchPartnerPinsResponse {
    /// Success
    Status200_Success
    (models::SearchPartnerPins200Response)
    ,
    /// Invalid pins
    Status400_InvalidPins
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SearchUserBoardsSlashGetResponse {
    /// response
    Status200_Response
    (models::SearchUserBoardsGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SearchUserPinsSlashListResponse {
    /// Success
    Status200_Success
    (models::PinsList200Response)
    ,
    /// User not found
    Status404_UserNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TermsRelatedSlashListResponse {
    /// Success
    Status200_Success
    (models::RelatedTerms)
    ,
    /// Invalid terms related parameters.
    Status400_InvalidTermsRelatedParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TermsSuggestedSlashListResponse {
    /// Success
    Status200_Success
    (Vec<String>)
    ,
    /// Invalid terms suggested parameters.
    Status400_InvalidTermsSuggestedParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TermsOfServiceSlashGetResponse {
    /// Success
    Status200_Success
    (models::TermsOfService)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsUserFollowsSlashListResponse {
    /// Success
    Status200_Success
    (models::BoardsUserFollowsList200Response)
    ,
    /// Invalid user id
    Status400_InvalidUserId
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FollowUserSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::UserSummary)
    ,
    /// User not found
    Status404_UserNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FollowersSlashListResponse {
    /// Success
    Status200_Success
    (models::FollowersList200Response)
    ,
    /// Invalid user id
    Status400_InvalidUserId
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LinkedBusinessAccountsSlashGetResponse {
    /// Success
    Status200_Success
    (Vec<models::LinkedBusiness>)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UnverifyWebsiteSlashDeleteResponse {
    /// Successfully unverified website
    Status204_SuccessfullyUnverifiedWebsite
    ,
    /// Website not in user list.
    Status404_WebsiteNotInUserList
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserAccountSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (std::collections::HashMap<String, models::AnalyticsMetricsResponse>)
    ,
    /// Invalid user accounts analytics parameters.
    Status400_InvalidUserAccountsAnalyticsParameters
    (models::Error)
    ,
    /// Not authorized to access the user account analytics.
    Status403_NotAuthorizedToAccessTheUserAccountAnalytics
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserAccountSlashAnalyticsSlashTopPinsResponse {
    /// Success
    Status200_Success
    (models::TopPinsAnalyticsResponse)
    ,
    /// Not authorized to access the user account analytics.
    Status403_NotAuthorizedToAccessTheUserAccountAnalytics
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserAccountSlashAnalyticsSlashTopVideoPinsResponse {
    /// Success
    Status200_Success
    (models::TopVideoPinsAnalyticsResponse)
    ,
    /// Not authorized to access the user account analytics.
    Status403_NotAuthorizedToAccessTheUserAccountAnalytics
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserAccountSlashFollowedInterestsResponse {
    /// Success
    Status200_Success
    (models::UserAccountFollowedInterests200Response)
    ,
    /// Invalid parameters
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Authorization failed
    Status401_AuthorizationFailed
    (models::Error)
    ,
    /// User not found
    Status404_UserNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserAccountSlashGetResponse {
    /// response
    Status200_Response
    (models::Account)
    ,
    /// Not authorized to access the user account.
    Status403_NotAuthorizedToAccessTheUserAccount
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserFollowingSlashGetResponse {
    /// response
    Status200_Response
    (models::UserFollowingGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserWebsitesSlashGetResponse {
    /// Success
    Status200_Success
    (models::UserWebsitesGet200Response)
    ,
    /// Not authorized to access the user website list.
    Status403_NotAuthorizedToAccessTheUserWebsiteList
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VerifyWebsiteSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::UserWebsiteSummary)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum WebsiteVerificationSlashGetResponse {
    /// Success
    Status200_Success
    (models::UserWebsiteVerificationCode)
    ,
    /// Not authorized to access the user verification code for website claiming.
    Status403_NotAuthorizedToAccessTheUserVerificationCodeForWebsiteClaiming
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// API
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Api {

                /// Get ad account analytics.
                ///
                /// AdAccountSlashAnalytics - GET /v5/ad_accounts/{ad_account_id}/analytics
                async fn ad_account_slash_analytics(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdAccountSlashAnalyticsPathParams,
                  query_params: models::AdAccountSlashAnalyticsQueryParams,
                ) -> Result<AdAccountSlashAnalyticsResponse, String>;


                /// Get targeting analytics for an ad account.
                ///
                /// AdAccountTargetingAnalyticsSlashGet - GET /v5/ad_accounts/{ad_account_id}/targeting_analytics
                async fn ad_account_targeting_analytics_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdAccountTargetingAnalyticsSlashGetPathParams,
                  query_params: models::AdAccountTargetingAnalyticsSlashGetQueryParams,
                ) -> Result<AdAccountTargetingAnalyticsSlashGetResponse, String>;


                /// Create ad account.
                ///
                /// AdAccountsSlashCreate - POST /v5/ad_accounts
                async fn ad_accounts_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::AdAccountCreateRequest,
                ) -> Result<AdAccountsSlashCreateResponse, String>;


                /// Get ad account.
                ///
                /// AdAccountsSlashGet - GET /v5/ad_accounts/{ad_account_id}
                async fn ad_accounts_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdAccountsSlashGetPathParams,
                ) -> Result<AdAccountsSlashGetResponse, String>;


                /// List ad accounts.
                ///
                /// AdAccountsSlashList - GET /v5/ad_accounts
                async fn ad_accounts_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::AdAccountsSlashListQueryParams,
                ) -> Result<AdAccountsSlashListResponse, String>;


                /// Create a request for a Marketing Mix Modeling (MMM) report.
                ///
                /// AnalyticsSlashCreateMmmReport - POST /v5/ad_accounts/{ad_account_id}/mmm_reports
                async fn analytics_slash_create_mmm_report(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AnalyticsSlashCreateMmmReportPathParams,
                        body: models::CreateMmmReportRequest,
                ) -> Result<AnalyticsSlashCreateMmmReportResponse, String>;


                /// Create async request for an account analytics report.
                ///
                /// AnalyticsSlashCreateReport - POST /v5/ad_accounts/{ad_account_id}/reports
                async fn analytics_slash_create_report(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AnalyticsSlashCreateReportPathParams,
                        body: models::AdsAnalyticsCreateAsyncRequest,
                ) -> Result<AnalyticsSlashCreateReportResponse, String>;


                /// Create async request for an analytics report using a template.
                ///
                /// AnalyticsSlashCreateTemplateReport - POST /v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports
                async fn analytics_slash_create_template_report(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AnalyticsSlashCreateTemplateReportPathParams,
                  query_params: models::AnalyticsSlashCreateTemplateReportQueryParams,
                ) -> Result<AnalyticsSlashCreateTemplateReportResponse, String>;


                /// Get advertiser Marketing Mix Modeling (MMM) report..
                ///
                /// AnalyticsSlashGetMmmReport - GET /v5/ad_accounts/{ad_account_id}/mmm_reports
                async fn analytics_slash_get_mmm_report(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AnalyticsSlashGetMmmReportPathParams,
                  query_params: models::AnalyticsSlashGetMmmReportQueryParams,
                ) -> Result<AnalyticsSlashGetMmmReportResponse, String>;


                /// Get the account analytics report created by the async call.
                ///
                /// AnalyticsSlashGetReport - GET /v5/ad_accounts/{ad_account_id}/reports
                async fn analytics_slash_get_report(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AnalyticsSlashGetReportPathParams,
                  query_params: models::AnalyticsSlashGetReportQueryParams,
                ) -> Result<AnalyticsSlashGetReportResponse, String>;


                /// Delete ads data for ad account in API Sandbox.
                ///
                /// SandboxSlashDelete - DELETE /v5/ad_accounts/{ad_account_id}/sandbox
                async fn sandbox_slash_delete(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::SandboxSlashDeletePathParams,
                ) -> Result<SandboxSlashDeleteResponse, String>;


                /// List templates.
                ///
                /// TemplatesSlashList - GET /v5/ad_accounts/{ad_account_id}/templates
                async fn templates_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::TemplatesSlashListPathParams,
                  query_params: models::TemplatesSlashListQueryParams,
                ) -> Result<TemplatesSlashListResponse, String>;


                /// Get bid floors.
                ///
                /// AdGroupsBidFloorSlashGet - POST /v5/ad_accounts/{ad_account_id}/bid_floor
                async fn ad_groups_bid_floor_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdGroupsBidFloorSlashGetPathParams,
                        body: models::BidFloorRequest,
                ) -> Result<AdGroupsBidFloorSlashGetResponse, String>;


                /// Get ad group analytics.
                ///
                /// AdGroupsSlashAnalytics - GET /v5/ad_accounts/{ad_account_id}/ad_groups/analytics
                async fn ad_groups_slash_analytics(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdGroupsSlashAnalyticsPathParams,
                  query_params: models::AdGroupsSlashAnalyticsQueryParams,
                ) -> Result<AdGroupsSlashAnalyticsResponse, String>;


                /// Get audience sizing.
                ///
                /// AdGroupsSlashAudienceSizing - GET /v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing
                async fn ad_groups_slash_audience_sizing(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdGroupsSlashAudienceSizingPathParams,
                        body: Option<models::AdGroupAudienceSizingRequest>,
                ) -> Result<AdGroupsSlashAudienceSizingResponse, String>;


                /// Create ad groups.
                ///
                /// AdGroupsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/ad_groups
                async fn ad_groups_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdGroupsSlashCreatePathParams,
                        body: Vec<models::AdGroupCreateRequest>,
                ) -> Result<AdGroupsSlashCreateResponse, String>;


                /// Get ad group.
                ///
                /// AdGroupsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}
                async fn ad_groups_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdGroupsSlashGetPathParams,
                ) -> Result<AdGroupsSlashGetResponse, String>;


                /// List ad groups.
                ///
                /// AdGroupsSlashList - GET /v5/ad_accounts/{ad_account_id}/ad_groups
                async fn ad_groups_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdGroupsSlashListPathParams,
                  query_params: models::AdGroupsSlashListQueryParams,
                ) -> Result<AdGroupsSlashListResponse, String>;


                /// Update ad groups.
                ///
                /// AdGroupsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/ad_groups
                async fn ad_groups_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdGroupsSlashUpdatePathParams,
                        body: Vec<models::AdGroupUpdateRequest>,
                ) -> Result<AdGroupsSlashUpdateResponse, String>;


                /// Get targeting analytics for ad groups.
                ///
                /// AdGroupsTargetingAnalyticsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics
                async fn ad_groups_targeting_analytics_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdGroupsTargetingAnalyticsSlashGetPathParams,
                  query_params: models::AdGroupsTargetingAnalyticsSlashGetQueryParams,
                ) -> Result<AdGroupsTargetingAnalyticsSlashGetResponse, String>;


                /// Create ad preview with pin or image.
                ///
                /// AdPreviewsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/ad_previews
                async fn ad_previews_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdPreviewsSlashCreatePathParams,
                        body: models::AdPreviewRequest,
                ) -> Result<AdPreviewsSlashCreateResponse, String>;


                /// Get targeting analytics for ads.
                ///
                /// AdTargetingAnalyticsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ads/targeting_analytics
                async fn ad_targeting_analytics_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdTargetingAnalyticsSlashGetPathParams,
                  query_params: models::AdTargetingAnalyticsSlashGetQueryParams,
                ) -> Result<AdTargetingAnalyticsSlashGetResponse, String>;


                /// Get ad analytics.
                ///
                /// AdsSlashAnalytics - GET /v5/ad_accounts/{ad_account_id}/ads/analytics
                async fn ads_slash_analytics(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdsSlashAnalyticsPathParams,
                  query_params: models::AdsSlashAnalyticsQueryParams,
                ) -> Result<AdsSlashAnalyticsResponse, String>;


                /// Create ads.
                ///
                /// AdsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/ads
                async fn ads_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdsSlashCreatePathParams,
                        body: Vec<models::AdCreateRequest>,
                ) -> Result<AdsSlashCreateResponse, String>;


                /// Get ad.
                ///
                /// AdsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ads/{ad_id}
                async fn ads_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdsSlashGetPathParams,
                ) -> Result<AdsSlashGetResponse, String>;


                /// List ads.
                ///
                /// AdsSlashList - GET /v5/ad_accounts/{ad_account_id}/ads
                async fn ads_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdsSlashListPathParams,
                  query_params: models::AdsSlashListQueryParams,
                ) -> Result<AdsSlashListResponse, String>;


                /// Update ads.
                ///
                /// AdsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/ads
                async fn ads_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdsSlashUpdatePathParams,
                        body: Vec<models::AdUpdateRequest>,
                ) -> Result<AdsSlashUpdateResponse, String>;


                /// Get audience insights scope and type.
                ///
                /// AudienceInsightsScopeAndTypeSlashGet - GET /v5/ad_accounts/{ad_account_id}/insights/audiences
                async fn audience_insights_scope_and_type_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AudienceInsightsScopeAndTypeSlashGetPathParams,
                ) -> Result<AudienceInsightsScopeAndTypeSlashGetResponse, String>;


                /// Get audience insights.
                ///
                /// AudienceInsightsSlashGet - GET /v5/ad_accounts/{ad_account_id}/audience_insights
                async fn audience_insights_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AudienceInsightsSlashGetPathParams,
                  query_params: models::AudienceInsightsSlashGetQueryParams,
                ) -> Result<AudienceInsightsSlashGetResponse, String>;


                /// Create audience.
                ///
                /// AudiencesSlashCreate - POST /v5/ad_accounts/{ad_account_id}/audiences
                async fn audiences_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AudiencesSlashCreatePathParams,
                        body: models::AudienceCreateRequest,
                ) -> Result<AudiencesSlashCreateResponse, String>;


                /// Create custom audience.
                ///
                /// AudiencesSlashCreateCustom - POST /v5/ad_accounts/{ad_account_id}/audiences/custom
                async fn audiences_slash_create_custom(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AudiencesSlashCreateCustomPathParams,
                        body: models::AudienceCreateCustomRequest,
                ) -> Result<AudiencesSlashCreateCustomResponse, String>;


                /// Get audience.
                ///
                /// AudiencesSlashGet - GET /v5/ad_accounts/{ad_account_id}/audiences/{audience_id}
                async fn audiences_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AudiencesSlashGetPathParams,
                ) -> Result<AudiencesSlashGetResponse, String>;


                /// List audiences.
                ///
                /// AudiencesSlashList - GET /v5/ad_accounts/{ad_account_id}/audiences
                async fn audiences_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AudiencesSlashListPathParams,
                  query_params: models::AudiencesSlashListQueryParams,
                ) -> Result<AudiencesSlashListResponse, String>;


                /// Update audience.
                ///
                /// AudiencesSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/audiences/{audience_id}
                async fn audiences_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AudiencesSlashUpdatePathParams,
                        body: Option<models::AudienceUpdateRequest>,
                ) -> Result<AudiencesSlashUpdateResponse, String>;


                /// Redeem ad credits.
                ///
                /// AdsCreditSlashRedeem - POST /v5/ad_accounts/{ad_account_id}/ads_credit/redeem
                async fn ads_credit_slash_redeem(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdsCreditSlashRedeemPathParams,
                        body: models::AdsCreditRedeemRequest,
                ) -> Result<AdsCreditSlashRedeemResponse, String>;


                /// Get ads credit discounts.
                ///
                /// AdsCreditsDiscountsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ads_credit/discounts
                async fn ads_credits_discounts_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdsCreditsDiscountsSlashGetPathParams,
                  query_params: models::AdsCreditsDiscountsSlashGetQueryParams,
                ) -> Result<AdsCreditsDiscountsSlashGetResponse, String>;


                /// Get billing profiles.
                ///
                /// BillingProfilesSlashGet - GET /v5/ad_accounts/{ad_account_id}/billing_profiles
                async fn billing_profiles_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BillingProfilesSlashGetPathParams,
                  query_params: models::BillingProfilesSlashGetQueryParams,
                ) -> Result<BillingProfilesSlashGetResponse, String>;


                /// Get Salesforce account details including bill-to information..
                ///
                /// SsioAccountsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ssio/accounts
                async fn ssio_accounts_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::SsioAccountsSlashGetPathParams,
                ) -> Result<SsioAccountsSlashGetResponse, String>;


                /// Create insertion order through SSIO..
                ///
                /// SsioInsertionOrderSlashCreate - POST /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders
                async fn ssio_insertion_order_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::SsioInsertionOrderSlashCreatePathParams,
                        body: models::SsioCreateInsertionOrderRequest,
                ) -> Result<SsioInsertionOrderSlashCreateResponse, String>;


                /// Edit insertion order through SSIO..
                ///
                /// SsioInsertionOrderSlashEdit - PATCH /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders
                async fn ssio_insertion_order_slash_edit(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::SsioInsertionOrderSlashEditPathParams,
                        body: models::SsioEditInsertionOrderRequest,
                ) -> Result<SsioInsertionOrderSlashEditResponse, String>;


                /// Get insertion order status by ad account id..
                ///
                /// SsioInsertionOrdersStatusSlashGetByAdAccount - GET /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status
                async fn ssio_insertion_orders_status_slash_get_by_ad_account(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::SsioInsertionOrdersStatusSlashGetByAdAccountPathParams,
                  query_params: models::SsioInsertionOrdersStatusSlashGetByAdAccountQueryParams,
                ) -> Result<SsioInsertionOrdersStatusSlashGetByAdAccountResponse, String>;


                /// Get insertion order status by pin order id..
                ///
                /// SsioInsertionOrdersStatusSlashGetByPinOrderId - GET /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status
                async fn ssio_insertion_orders_status_slash_get_by_pin_order_id(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::SsioInsertionOrdersStatusSlashGetByPinOrderIdPathParams,
                ) -> Result<SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse, String>;


                /// Get Salesforce order lines by ad account id..
                ///
                /// SsioOrderLinesSlashGetByAdAccount - GET /v5/ad_accounts/{ad_account_id}/ssio/order_lines
                async fn ssio_order_lines_slash_get_by_ad_account(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::SsioOrderLinesSlashGetByAdAccountPathParams,
                  query_params: models::SsioOrderLinesSlashGetByAdAccountQueryParams,
                ) -> Result<SsioOrderLinesSlashGetByAdAccountResponse, String>;


                /// Create board section.
                ///
                /// BoardSectionsSlashCreate - POST /v5/boards/{board_id}/sections
                async fn board_sections_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BoardSectionsSlashCreatePathParams,
                  query_params: models::BoardSectionsSlashCreateQueryParams,
                        body: models::BoardSection,
                ) -> Result<BoardSectionsSlashCreateResponse, String>;


                /// Delete board section.
                ///
                /// BoardSectionsSlashDelete - DELETE /v5/boards/{board_id}/sections/{section_id}
                async fn board_sections_slash_delete(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BoardSectionsSlashDeletePathParams,
                  query_params: models::BoardSectionsSlashDeleteQueryParams,
                ) -> Result<BoardSectionsSlashDeleteResponse, String>;


                /// List board sections.
                ///
                /// BoardSectionsSlashList - GET /v5/boards/{board_id}/sections
                async fn board_sections_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BoardSectionsSlashListPathParams,
                  query_params: models::BoardSectionsSlashListQueryParams,
                ) -> Result<BoardSectionsSlashListResponse, String>;


                /// List Pins on board section.
                ///
                /// BoardSectionsSlashListPins - GET /v5/boards/{board_id}/sections/{section_id}/pins
                async fn board_sections_slash_list_pins(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BoardSectionsSlashListPinsPathParams,
                  query_params: models::BoardSectionsSlashListPinsQueryParams,
                ) -> Result<BoardSectionsSlashListPinsResponse, String>;


                /// Update board section.
                ///
                /// BoardSectionsSlashUpdate - PATCH /v5/boards/{board_id}/sections/{section_id}
                async fn board_sections_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BoardSectionsSlashUpdatePathParams,
                  query_params: models::BoardSectionsSlashUpdateQueryParams,
                        body: models::BoardSection,
                ) -> Result<BoardSectionsSlashUpdateResponse, String>;


                /// Create board.
                ///
                /// BoardsSlashCreate - POST /v5/boards
                async fn boards_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::BoardsSlashCreateQueryParams,
                        body: models::Board,
                ) -> Result<BoardsSlashCreateResponse, String>;


                /// Delete board.
                ///
                /// BoardsSlashDelete - DELETE /v5/boards/{board_id}
                async fn boards_slash_delete(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BoardsSlashDeletePathParams,
                  query_params: models::BoardsSlashDeleteQueryParams,
                ) -> Result<BoardsSlashDeleteResponse, String>;


                /// Get board.
                ///
                /// BoardsSlashGet - GET /v5/boards/{board_id}
                async fn boards_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BoardsSlashGetPathParams,
                  query_params: models::BoardsSlashGetQueryParams,
                ) -> Result<BoardsSlashGetResponse, String>;


                /// List boards.
                ///
                /// BoardsSlashList - GET /v5/boards
                async fn boards_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::BoardsSlashListQueryParams,
                ) -> Result<BoardsSlashListResponse, String>;


                /// List Pins on board.
                ///
                /// BoardsSlashListPins - GET /v5/boards/{board_id}/pins
                async fn boards_slash_list_pins(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BoardsSlashListPinsPathParams,
                  query_params: models::BoardsSlashListPinsQueryParams,
                ) -> Result<BoardsSlashListPinsResponse, String>;


                /// Update board.
                ///
                /// BoardsSlashUpdate - PATCH /v5/boards/{board_id}
                async fn boards_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BoardsSlashUpdatePathParams,
                  query_params: models::BoardsSlashUpdateQueryParams,
                        body: models::BoardUpdate,
                ) -> Result<BoardsSlashUpdateResponse, String>;


                /// Get advertiser entities in bulk.
                ///
                /// BulkDownloadSlashCreate - POST /v5/ad_accounts/{ad_account_id}/bulk/download
                async fn bulk_download_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BulkDownloadSlashCreatePathParams,
                        body: models::BulkDownloadRequest,
                ) -> Result<BulkDownloadSlashCreateResponse, String>;


                /// Download advertiser entities in bulk.
                ///
                /// BulkRequestSlashGet - GET /v5/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}
                async fn bulk_request_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BulkRequestSlashGetPathParams,
                  query_params: models::BulkRequestSlashGetQueryParams,
                ) -> Result<BulkRequestSlashGetResponse, String>;


                /// Create/update ad entities in bulk.
                ///
                /// BulkUpsertSlashCreate - POST /v5/ad_accounts/{ad_account_id}/bulk/upsert
                async fn bulk_upsert_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BulkUpsertSlashCreatePathParams,
                        body: models::BulkUpsertRequest,
                ) -> Result<BulkUpsertSlashCreateResponse, String>;


                /// Get targeting analytics for campaigns.
                ///
                /// CampaignTargetingAnalyticsSlashGet - GET /v5/ad_accounts/{ad_account_id}/campaigns/targeting_analytics
                async fn campaign_targeting_analytics_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CampaignTargetingAnalyticsSlashGetPathParams,
                  query_params: models::CampaignTargetingAnalyticsSlashGetQueryParams,
                ) -> Result<CampaignTargetingAnalyticsSlashGetResponse, String>;


                /// Get campaign analytics.
                ///
                /// CampaignsSlashAnalytics - GET /v5/ad_accounts/{ad_account_id}/campaigns/analytics
                async fn campaigns_slash_analytics(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CampaignsSlashAnalyticsPathParams,
                  query_params: models::CampaignsSlashAnalyticsQueryParams,
                ) -> Result<CampaignsSlashAnalyticsResponse, String>;


                /// Create campaigns.
                ///
                /// CampaignsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/campaigns
                async fn campaigns_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CampaignsSlashCreatePathParams,
                        body: Vec<models::CampaignCreateRequest>,
                ) -> Result<CampaignsSlashCreateResponse, String>;


                /// Get campaign.
                ///
                /// CampaignsSlashGet - GET /v5/ad_accounts/{ad_account_id}/campaigns/{campaign_id}
                async fn campaigns_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CampaignsSlashGetPathParams,
                ) -> Result<CampaignsSlashGetResponse, String>;


                /// List campaigns.
                ///
                /// CampaignsSlashList - GET /v5/ad_accounts/{ad_account_id}/campaigns
                async fn campaigns_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CampaignsSlashListPathParams,
                  query_params: models::CampaignsSlashListQueryParams,
                ) -> Result<CampaignsSlashListResponse, String>;


                /// Update campaigns.
                ///
                /// CampaignsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/campaigns
                async fn campaigns_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CampaignsSlashUpdatePathParams,
                        body: Vec<models::CampaignUpdateRequest>,
                ) -> Result<CampaignsSlashUpdateResponse, String>;


                /// List products for a Product Group.
                ///
                /// CatalogsProductGroupPinsSlashList - GET /v5/catalogs/product_groups/{product_group_id}/products
                async fn catalogs_product_group_pins_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CatalogsProductGroupPinsSlashListPathParams,
                  query_params: models::CatalogsProductGroupPinsSlashListQueryParams,
                ) -> Result<CatalogsProductGroupPinsSlashListResponse, String>;


                /// Create product group.
                ///
                /// CatalogsProductGroupsSlashCreate - POST /v5/catalogs/product_groups
                async fn catalogs_product_groups_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::CatalogsProductGroupsSlashCreateQueryParams,
                        body: models::CatalogsProductGroupsCreateRequest,
                ) -> Result<CatalogsProductGroupsSlashCreateResponse, String>;


                /// Delete product group.
                ///
                /// CatalogsProductGroupsSlashDelete - DELETE /v5/catalogs/product_groups/{product_group_id}
                async fn catalogs_product_groups_slash_delete(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CatalogsProductGroupsSlashDeletePathParams,
                  query_params: models::CatalogsProductGroupsSlashDeleteQueryParams,
                ) -> Result<CatalogsProductGroupsSlashDeleteResponse, String>;


                /// Get product group.
                ///
                /// CatalogsProductGroupsSlashGet - GET /v5/catalogs/product_groups/{product_group_id}
                async fn catalogs_product_groups_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CatalogsProductGroupsSlashGetPathParams,
                  query_params: models::CatalogsProductGroupsSlashGetQueryParams,
                ) -> Result<CatalogsProductGroupsSlashGetResponse, String>;


                /// List product groups.
                ///
                /// CatalogsProductGroupsSlashList - GET /v5/catalogs/product_groups
                async fn catalogs_product_groups_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::CatalogsProductGroupsSlashListQueryParams,
                ) -> Result<CatalogsProductGroupsSlashListResponse, String>;


                /// Get product counts for a Product Group.
                ///
                /// CatalogsProductGroupsSlashProductCountsGet - GET /v5/catalogs/product_groups/{product_group_id}/product_counts
                async fn catalogs_product_groups_slash_product_counts_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CatalogsProductGroupsSlashProductCountsGetPathParams,
                  query_params: models::CatalogsProductGroupsSlashProductCountsGetQueryParams,
                ) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, String>;


                /// Update product group.
                ///
                /// CatalogsProductGroupsSlashUpdate - PATCH /v5/catalogs/product_groups/{product_group_id}
                async fn catalogs_product_groups_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CatalogsProductGroupsSlashUpdatePathParams,
                  query_params: models::CatalogsProductGroupsSlashUpdateQueryParams,
                        body: models::CatalogsProductGroupsUpdateRequest,
                ) -> Result<CatalogsProductGroupsSlashUpdateResponse, String>;


                /// List catalogs.
                ///
                /// CatalogsSlashList - GET /v5/catalogs
                async fn catalogs_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::CatalogsSlashListQueryParams,
                ) -> Result<CatalogsSlashListResponse, String>;


                /// List processing results for a given feed.
                ///
                /// FeedProcessingResultsSlashList - GET /v5/catalogs/feeds/{feed_id}/processing_results
                async fn feed_processing_results_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::FeedProcessingResultsSlashListPathParams,
                  query_params: models::FeedProcessingResultsSlashListQueryParams,
                ) -> Result<FeedProcessingResultsSlashListResponse, String>;


                /// Create feed.
                ///
                /// FeedsSlashCreate - POST /v5/catalogs/feeds
                async fn feeds_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::FeedsSlashCreateQueryParams,
                        body: models::FeedsCreateRequest,
                ) -> Result<FeedsSlashCreateResponse, String>;


                /// Delete feed.
                ///
                /// FeedsSlashDelete - DELETE /v5/catalogs/feeds/{feed_id}
                async fn feeds_slash_delete(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::FeedsSlashDeletePathParams,
                  query_params: models::FeedsSlashDeleteQueryParams,
                ) -> Result<FeedsSlashDeleteResponse, String>;


                /// Get feed.
                ///
                /// FeedsSlashGet - GET /v5/catalogs/feeds/{feed_id}
                async fn feeds_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::FeedsSlashGetPathParams,
                  query_params: models::FeedsSlashGetQueryParams,
                ) -> Result<FeedsSlashGetResponse, String>;


                /// List feeds.
                ///
                /// FeedsSlashList - GET /v5/catalogs/feeds
                async fn feeds_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::FeedsSlashListQueryParams,
                ) -> Result<FeedsSlashListResponse, String>;


                /// Update feed.
                ///
                /// FeedsSlashUpdate - PATCH /v5/catalogs/feeds/{feed_id}
                async fn feeds_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::FeedsSlashUpdatePathParams,
                  query_params: models::FeedsSlashUpdateQueryParams,
                        body: models::FeedsUpdateRequest,
                ) -> Result<FeedsSlashUpdateResponse, String>;


                /// Get catalogs item batch status.
                ///
                /// ItemsBatchSlashGet - GET /v5/catalogs/items/batch/{batch_id}
                async fn items_batch_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ItemsBatchSlashGetPathParams,
                  query_params: models::ItemsBatchSlashGetQueryParams,
                ) -> Result<ItemsBatchSlashGetResponse, String>;


                /// Operate on item batch.
                ///
                /// ItemsBatchSlashPost - POST /v5/catalogs/items/batch
                async fn items_batch_slash_post(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ItemsBatchSlashPostQueryParams,
                        body: models::ItemsBatchPostRequest,
                ) -> Result<ItemsBatchSlashPostResponse, String>;


                /// List item issues for a given processing result.
                ///
                /// ItemsIssuesSlashList - GET /v5/catalogs/processing_results/{processing_result_id}/item_issues
                async fn items_issues_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ItemsIssuesSlashListPathParams,
                  query_params: models::ItemsIssuesSlashListQueryParams,
                ) -> Result<ItemsIssuesSlashListResponse, String>;


                /// Get catalogs items.
                ///
                /// ItemsSlashGet - GET /v5/catalogs/items
                async fn items_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ItemsSlashGetQueryParams,
                ) -> Result<ItemsSlashGetResponse, String>;


                /// List filtered products.
                ///
                /// ProductsByProductGroupFilterSlashList - POST /v5/catalogs/products/get_by_product_group_filters
                async fn products_by_product_group_filter_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ProductsByProductGroupFilterSlashListQueryParams,
                        body: models::CatalogsListProductsByFilterRequest,
                ) -> Result<ProductsByProductGroupFilterSlashListResponse, String>;


                /// Send conversions.
                ///
                /// EventsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/events
                async fn events_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::EventsSlashCreatePathParams,
                  query_params: models::EventsSlashCreateQueryParams,
                        body: models::ConversionEvents,
                ) -> Result<EventsSlashCreateResponse, String>;


                /// Create conversion tag.
                ///
                /// ConversionTagsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/conversion_tags
                async fn conversion_tags_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ConversionTagsSlashCreatePathParams,
                        body: models::ConversionTagCreate,
                ) -> Result<ConversionTagsSlashCreateResponse, String>;


                /// Get conversion tag.
                ///
                /// ConversionTagsSlashGet - GET /v5/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}
                async fn conversion_tags_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ConversionTagsSlashGetPathParams,
                ) -> Result<ConversionTagsSlashGetResponse, String>;


                /// Get conversion tags.
                ///
                /// ConversionTagsSlashList - GET /v5/ad_accounts/{ad_account_id}/conversion_tags
                async fn conversion_tags_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ConversionTagsSlashListPathParams,
                  query_params: models::ConversionTagsSlashListQueryParams,
                ) -> Result<ConversionTagsSlashListResponse, String>;


                /// Get Ocpm eligible conversion tags.
                ///
                /// OcpmEligibleConversionTagsSlashGet - GET /v5/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible
                async fn ocpm_eligible_conversion_tags_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::OcpmEligibleConversionTagsSlashGetPathParams,
                ) -> Result<OcpmEligibleConversionTagsSlashGetResponse, String>;


                /// Get page visit conversion tags.
                ///
                /// PageVisitConversionTagsSlashGet - GET /v5/ad_accounts/{ad_account_id}/conversion_tags/page_visit
                async fn page_visit_conversion_tags_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PageVisitConversionTagsSlashGetPathParams,
                  query_params: models::PageVisitConversionTagsSlashGetQueryParams,
                ) -> Result<PageVisitConversionTagsSlashGetResponse, String>;


                /// Create customer lists.
                ///
                /// CustomerListsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/customer_lists
                async fn customer_lists_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CustomerListsSlashCreatePathParams,
                        body: models::CustomerListRequest,
                ) -> Result<CustomerListsSlashCreateResponse, String>;


                /// Get customer list.
                ///
                /// CustomerListsSlashGet - GET /v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}
                async fn customer_lists_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CustomerListsSlashGetPathParams,
                ) -> Result<CustomerListsSlashGetResponse, String>;


                /// Get customer lists.
                ///
                /// CustomerListsSlashList - GET /v5/ad_accounts/{ad_account_id}/customer_lists
                async fn customer_lists_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CustomerListsSlashListPathParams,
                  query_params: models::CustomerListsSlashListQueryParams,
                ) -> Result<CustomerListsSlashListResponse, String>;


                /// Update customer list.
                ///
                /// CustomerListsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}
                async fn customer_lists_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CustomerListsSlashUpdatePathParams,
                        body: models::CustomerListUpdateRequest,
                ) -> Result<CustomerListsSlashUpdateResponse, String>;


                /// Delete commerce integration.
                ///
                /// IntegrationsCommerceSlashDel - DELETE /v5/integrations/commerce/{external_business_id}
                async fn integrations_commerce_slash_del(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::IntegrationsCommerceSlashDelPathParams,
                ) -> Result<IntegrationsCommerceSlashDelResponse, String>;


                /// Get commerce integration.
                ///
                /// IntegrationsCommerceSlashGet - GET /v5/integrations/commerce/{external_business_id}
                async fn integrations_commerce_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::IntegrationsCommerceSlashGetPathParams,
                ) -> Result<IntegrationsCommerceSlashGetResponse, String>;


                /// Update commerce integration.
                ///
                /// IntegrationsCommerceSlashPatch - PATCH /v5/integrations/commerce/{external_business_id}
                async fn integrations_commerce_slash_patch(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::IntegrationsCommerceSlashPatchPathParams,
                        body: Option<models::IntegrationRequestPatch>,
                ) -> Result<IntegrationsCommerceSlashPatchResponse, String>;


                /// Create commerce integration.
                ///
                /// IntegrationsCommerceSlashPost - POST /v5/integrations/commerce
                async fn integrations_commerce_slash_post(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: Option<models::IntegrationRequest>,
                ) -> Result<IntegrationsCommerceSlashPostResponse, String>;


                /// Receives batched logs from integration applications..
                ///
                /// IntegrationsLogsSlashPost - POST /v5/integrations/logs
                async fn integrations_logs_slash_post(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::IntegrationLogsRequest,
                ) -> Result<IntegrationsLogsSlashPostResponse, String>;


                /// Get integration metadata.
                ///
                /// IntegrationsSlashGetById - GET /v5/integrations/{id}
                async fn integrations_slash_get_by_id(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::IntegrationsSlashGetByIdPathParams,
                ) -> Result<IntegrationsSlashGetByIdResponse, String>;


                /// Get integration metadata list.
                ///
                /// IntegrationsSlashGetList - GET /v5/integrations
                async fn integrations_slash_get_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::IntegrationsSlashGetListQueryParams,
                ) -> Result<IntegrationsSlashGetListResponse, String>;


                /// Get country's keyword metrics.
                ///
                /// CountryKeywordsMetricsSlashGet - GET /v5/ad_accounts/{ad_account_id}/keywords/metrics
                async fn country_keywords_metrics_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CountryKeywordsMetricsSlashGetPathParams,
                  query_params: models::CountryKeywordsMetricsSlashGetQueryParams,
                ) -> Result<CountryKeywordsMetricsSlashGetResponse, String>;


                /// Create keywords.
                ///
                /// KeywordsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/keywords
                async fn keywords_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::KeywordsSlashCreatePathParams,
                        body: models::KeywordsRequest,
                ) -> Result<KeywordsSlashCreateResponse, String>;


                /// Get keywords.
                ///
                /// KeywordsSlashGet - GET /v5/ad_accounts/{ad_account_id}/keywords
                async fn keywords_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::KeywordsSlashGetPathParams,
                  query_params: models::KeywordsSlashGetQueryParams,
                ) -> Result<KeywordsSlashGetResponse, String>;


                /// Update keywords.
                ///
                /// KeywordsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/keywords
                async fn keywords_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::KeywordsSlashUpdatePathParams,
                        body: models::KeywordUpdateBody,
                ) -> Result<KeywordsSlashUpdateResponse, String>;


                /// List trending keywords.
                ///
                /// TrendingKeywordsSlashList - GET /v5/trends/keywords/{region}/top/{trend_type}
                async fn trending_keywords_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::TrendingKeywordsSlashListPathParams,
                  query_params: models::TrendingKeywordsSlashListQueryParams,
                ) -> Result<TrendingKeywordsSlashListResponse, String>;


                /// Delete lead ads subscription.
                ///
                /// AdAccountsSubscriptionsSlashDelById - DELETE /v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}
                async fn ad_accounts_subscriptions_slash_del_by_id(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdAccountsSubscriptionsSlashDelByIdPathParams,
                ) -> Result<AdAccountsSubscriptionsSlashDelByIdResponse, String>;


                /// Get lead ads subscription.
                ///
                /// AdAccountsSubscriptionsSlashGetById - GET /v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}
                async fn ad_accounts_subscriptions_slash_get_by_id(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdAccountsSubscriptionsSlashGetByIdPathParams,
                ) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, String>;


                /// Get lead ads subscriptions.
                ///
                /// AdAccountsSubscriptionsSlashGetList - GET /v5/ad_accounts/{ad_account_id}/leads/subscriptions
                async fn ad_accounts_subscriptions_slash_get_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdAccountsSubscriptionsSlashGetListPathParams,
                  query_params: models::AdAccountsSubscriptionsSlashGetListQueryParams,
                ) -> Result<AdAccountsSubscriptionsSlashGetListResponse, String>;


                /// Create lead ads subscription.
                ///
                /// AdAccountsSubscriptionsSlashPost - POST /v5/ad_accounts/{ad_account_id}/leads/subscriptions
                async fn ad_accounts_subscriptions_slash_post(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdAccountsSubscriptionsSlashPostPathParams,
                        body: models::AdAccountCreateSubscriptionRequest,
                ) -> Result<AdAccountsSubscriptionsSlashPostResponse, String>;


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


                /// Get lead forms.
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


                /// Register media upload.
                ///
                /// MediaSlashCreate - POST /v5/media
                async fn media_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::MediaUploadRequest,
                ) -> Result<MediaSlashCreateResponse, String>;


                /// Get media upload details.
                ///
                /// MediaSlashGet - GET /v5/media/{media_id}
                async fn media_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::MediaSlashGetPathParams,
                ) -> Result<MediaSlashGetResponse, String>;


                /// List media uploads.
                ///
                /// MediaSlashList - GET /v5/media
                async fn media_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::MediaSlashListQueryParams,
                ) -> Result<MediaSlashListResponse, String>;


                /// Generate OAuth access token.
                ///
                /// OauthSlashToken - POST /v5/oauth/token
                async fn oauth_slash_token(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                ) -> Result<OauthSlashTokenResponse, String>;


                /// Get order line.
                ///
                /// OrderLinesSlashGet - GET /v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}
                async fn order_lines_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::OrderLinesSlashGetPathParams,
                ) -> Result<OrderLinesSlashGetResponse, String>;


                /// Get order lines.
                ///
                /// OrderLinesSlashList - GET /v5/ad_accounts/{ad_account_id}/order_lines
                async fn order_lines_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::OrderLinesSlashListPathParams,
                  query_params: models::OrderLinesSlashListQueryParams,
                ) -> Result<OrderLinesSlashListResponse, String>;


                /// Get Pin analytics.
                ///
                /// PinsSlashAnalytics - GET /v5/pins/{pin_id}/analytics
                async fn pins_slash_analytics(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PinsSlashAnalyticsPathParams,
                  query_params: models::PinsSlashAnalyticsQueryParams,
                ) -> Result<PinsSlashAnalyticsResponse, String>;


                /// Create Pin.
                ///
                /// PinsSlashCreate - POST /v5/pins
                async fn pins_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::PinsSlashCreateQueryParams,
                        body: models::PinCreate,
                ) -> Result<PinsSlashCreateResponse, String>;


                /// Delete Pin.
                ///
                /// PinsSlashDelete - DELETE /v5/pins/{pin_id}
                async fn pins_slash_delete(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PinsSlashDeletePathParams,
                  query_params: models::PinsSlashDeleteQueryParams,
                ) -> Result<PinsSlashDeleteResponse, String>;


                /// Get Pin.
                ///
                /// PinsSlashGet - GET /v5/pins/{pin_id}
                async fn pins_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PinsSlashGetPathParams,
                  query_params: models::PinsSlashGetQueryParams,
                ) -> Result<PinsSlashGetResponse, String>;


                /// List Pins.
                ///
                /// PinsSlashList - GET /v5/pins
                async fn pins_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::PinsSlashListQueryParams,
                ) -> Result<PinsSlashListResponse, String>;


                /// Save Pin.
                ///
                /// PinsSlashSave - POST /v5/pins/{pin_id}/save
                async fn pins_slash_save(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PinsSlashSavePathParams,
                  query_params: models::PinsSlashSaveQueryParams,
                        body: models::PinsSaveRequest,
                ) -> Result<PinsSlashSaveResponse, String>;


                /// Update Pin.
                ///
                /// PinsSlashUpdate - PATCH /v5/pins/{pin_id}
                async fn pins_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PinsSlashUpdatePathParams,
                  query_params: models::PinsSlashUpdateQueryParams,
                        body: models::PinUpdate,
                ) -> Result<PinsSlashUpdateResponse, String>;


                /// Create product group promotions.
                ///
                /// ProductGroupPromotionsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/product_group_promotions
                async fn product_group_promotions_slash_create(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ProductGroupPromotionsSlashCreatePathParams,
                        body: models::ProductGroupPromotionCreateRequest,
                ) -> Result<ProductGroupPromotionsSlashCreateResponse, String>;


                /// Get a product group promotion by id.
                ///
                /// ProductGroupPromotionsSlashGet - GET /v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}
                async fn product_group_promotions_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ProductGroupPromotionsSlashGetPathParams,
                ) -> Result<ProductGroupPromotionsSlashGetResponse, String>;


                /// Get product group promotions.
                ///
                /// ProductGroupPromotionsSlashList - GET /v5/ad_accounts/{ad_account_id}/product_group_promotions
                async fn product_group_promotions_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ProductGroupPromotionsSlashListPathParams,
                  query_params: models::ProductGroupPromotionsSlashListQueryParams,
                ) -> Result<ProductGroupPromotionsSlashListResponse, String>;


                /// Update product group promotions.
                ///
                /// ProductGroupPromotionsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/product_group_promotions
                async fn product_group_promotions_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ProductGroupPromotionsSlashUpdatePathParams,
                        body: models::ProductGroupPromotionUpdateRequest,
                ) -> Result<ProductGroupPromotionsSlashUpdateResponse, String>;


                /// Get product group analytics.
                ///
                /// ProductGroupsSlashAnalytics - GET /v5/ad_accounts/{ad_account_id}/product_groups/analytics
                async fn product_groups_slash_analytics(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ProductGroupsSlashAnalyticsPathParams,
                  query_params: models::ProductGroupsSlashAnalyticsQueryParams,
                ) -> Result<ProductGroupsSlashAnalyticsResponse, String>;


                /// Get catalog product groups.
                ///
                /// AdAccountsCatalogsProductGroupsSlashList - GET /v5/ad_accounts/{ad_account_id}/product_groups/catalogs
                async fn ad_accounts_catalogs_product_groups_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AdAccountsCatalogsProductGroupsSlashListPathParams,
                  query_params: models::AdAccountsCatalogsProductGroupsSlashListQueryParams,
                ) -> Result<AdAccountsCatalogsProductGroupsSlashListResponse, String>;


                /// Get ad accounts countries.
                ///
                /// AdAccountCountriesSlashGet - GET /v5/resources/ad_account_countries
                async fn ad_account_countries_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                ) -> Result<AdAccountCountriesSlashGetResponse, String>;


                /// Get available metrics' definitions.
                ///
                /// DeliveryMetricsSlashGet - GET /v5/resources/delivery_metrics
                async fn delivery_metrics_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::DeliveryMetricsSlashGetQueryParams,
                ) -> Result<DeliveryMetricsSlashGetResponse, String>;


                /// Get interest details.
                ///
                /// InterestTargetingOptionsSlashGet - GET /v5/resources/targeting/interests/{interest_id}
                async fn interest_targeting_options_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::InterestTargetingOptionsSlashGetPathParams,
                ) -> Result<InterestTargetingOptionsSlashGetResponse, String>;


                /// Get lead form questions.
                ///
                /// LeadFormQuestionsSlashGet - GET /v5/resources/lead_form_questions
                async fn lead_form_questions_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                ) -> Result<LeadFormQuestionsSlashGetResponse, String>;


                /// Get metrics ready state.
                ///
                /// MetricsReadyStateSlashGet - GET /v5/resources/metrics_ready_state
                async fn metrics_ready_state_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::MetricsReadyStateSlashGetQueryParams,
                ) -> Result<MetricsReadyStateSlashGetResponse, String>;


                /// Get targeting options.
                ///
                /// TargetingOptionsSlashGet - GET /v5/resources/targeting/{targeting_type}
                async fn targeting_options_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::TargetingOptionsSlashGetPathParams,
                  query_params: models::TargetingOptionsSlashGetQueryParams,
                ) -> Result<TargetingOptionsSlashGetResponse, String>;


                /// Search pins by a given search term.
                ///
                /// SearchPartnerPins - GET /v5/search/partner/pins
                async fn search_partner_pins(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::SearchPartnerPinsQueryParams,
                ) -> Result<SearchPartnerPinsResponse, String>;


                /// Search user's boards.
                ///
                /// SearchUserBoardsSlashGet - GET /v5/search/boards
                async fn search_user_boards_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::SearchUserBoardsSlashGetQueryParams,
                ) -> Result<SearchUserBoardsSlashGetResponse, String>;


                /// Search user's Pins.
                ///
                /// SearchUserPinsSlashList - GET /v5/search/pins
                async fn search_user_pins_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::SearchUserPinsSlashListQueryParams,
                ) -> Result<SearchUserPinsSlashListResponse, String>;


                /// List related terms.
                ///
                /// TermsRelatedSlashList - GET /v5/terms/related
                async fn terms_related_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::TermsRelatedSlashListQueryParams,
                ) -> Result<TermsRelatedSlashListResponse, String>;


                /// List suggested terms.
                ///
                /// TermsSuggestedSlashList - GET /v5/terms/suggested
                async fn terms_suggested_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::TermsSuggestedSlashListQueryParams,
                ) -> Result<TermsSuggestedSlashListResponse, String>;


                /// Get terms of service.
                ///
                /// TermsOfServiceSlashGet - GET /v5/ad_accounts/{ad_account_id}/terms_of_service
                async fn terms_of_service_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::TermsOfServiceSlashGetPathParams,
                  query_params: models::TermsOfServiceSlashGetQueryParams,
                ) -> Result<TermsOfServiceSlashGetResponse, String>;


                /// List following boards.
                ///
                /// BoardsUserFollowsSlashList - GET /v5/user_account/following/boards
                async fn boards_user_follows_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::BoardsUserFollowsSlashListQueryParams,
                ) -> Result<BoardsUserFollowsSlashListResponse, String>;


                /// Follow user.
                ///
                /// FollowUserSlashUpdate - POST /v5/user_account/following/{username}
                async fn follow_user_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::FollowUserSlashUpdatePathParams,
                        body: models::FollowUserRequest,
                ) -> Result<FollowUserSlashUpdateResponse, String>;


                /// List followers.
                ///
                /// FollowersSlashList - GET /v5/user_account/followers
                async fn followers_slash_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::FollowersSlashListQueryParams,
                ) -> Result<FollowersSlashListResponse, String>;


                /// List linked businesses.
                ///
                /// LinkedBusinessAccountsSlashGet - GET /v5/user_account/businesses
                async fn linked_business_accounts_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                ) -> Result<LinkedBusinessAccountsSlashGetResponse, String>;


                /// Unverify website.
                ///
                /// UnverifyWebsiteSlashDelete - DELETE /v5/user_account/websites
                async fn unverify_website_slash_delete(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::UnverifyWebsiteSlashDeleteQueryParams,
                ) -> Result<UnverifyWebsiteSlashDeleteResponse, String>;


                /// Get user account analytics.
                ///
                /// UserAccountSlashAnalytics - GET /v5/user_account/analytics
                async fn user_account_slash_analytics(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::UserAccountSlashAnalyticsQueryParams,
                ) -> Result<UserAccountSlashAnalyticsResponse, String>;


                /// Get user account top pins analytics.
                ///
                /// UserAccountSlashAnalyticsSlashTopPins - GET /v5/user_account/analytics/top_pins
                async fn user_account_slash_analytics_slash_top_pins(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::UserAccountSlashAnalyticsSlashTopPinsQueryParams,
                ) -> Result<UserAccountSlashAnalyticsSlashTopPinsResponse, String>;


                /// Get user account top video pins analytics.
                ///
                /// UserAccountSlashAnalyticsSlashTopVideoPins - GET /v5/user_account/analytics/top_video_pins
                async fn user_account_slash_analytics_slash_top_video_pins(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::UserAccountSlashAnalyticsSlashTopVideoPinsQueryParams,
                ) -> Result<UserAccountSlashAnalyticsSlashTopVideoPinsResponse, String>;


                /// List following interests.
                ///
                /// UserAccountSlashFollowedInterests - GET /v5/users/{username}/interests/follow
                async fn user_account_slash_followed_interests(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::UserAccountSlashFollowedInterestsPathParams,
                  query_params: models::UserAccountSlashFollowedInterestsQueryParams,
                ) -> Result<UserAccountSlashFollowedInterestsResponse, String>;


                /// Get user account.
                ///
                /// UserAccountSlashGet - GET /v5/user_account
                async fn user_account_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::UserAccountSlashGetQueryParams,
                ) -> Result<UserAccountSlashGetResponse, String>;


                /// List following.
                ///
                /// UserFollowingSlashGet - GET /v5/user_account/following
                async fn user_following_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::UserFollowingSlashGetQueryParams,
                ) -> Result<UserFollowingSlashGetResponse, String>;


                /// Get user websites.
                ///
                /// UserWebsitesSlashGet - GET /v5/user_account/websites
                async fn user_websites_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::UserWebsitesSlashGetQueryParams,
                ) -> Result<UserWebsitesSlashGetResponse, String>;


                /// Verify website.
                ///
                /// VerifyWebsiteSlashUpdate - POST /v5/user_account/websites
                async fn verify_website_slash_update(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::UserWebsiteVerifyRequest,
                ) -> Result<VerifyWebsiteSlashUpdateResponse, String>;


                /// Get user verification code for website claiming.
                ///
                /// WebsiteVerificationSlashGet - GET /v5/user_account/websites/verification
                async fn website_verification_slash_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                ) -> Result<WebsiteVerificationSlashGetResponse, String>;

}

#[cfg(feature = "server")]
pub mod server;

pub mod models;
pub mod types;

#[cfg(feature = "server")]
pub(crate) mod header;
