{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module PinterestRESTAPI.Types (
  Account (..),
  ActionType (..),
  AdAccount (..),
  AdAccountAnalyticsResponseInner (..),
  AdAccountCreateRequest (..),
  AdAccountCreateSubscriptionRequest (..),
  AdAccountCreateSubscriptionResponse (..),
  AdAccountGetSubscriptionResponse (..),
  AdAccountOwner (..),
  AdAccountsCatalogsProductGroupsList200Response (..),
  AdAccountsCountryResponse (..),
  AdAccountsCountryResponseData (..),
  AdAccountsList200Response (..),
  AdAccountsSubscriptionsGetList200Response (..),
  AdArrayResponse (..),
  AdArrayResponseElement (..),
  AdCommon (..),
  AdCommonQuizPinData (..),
  AdCommonTrackingUrls (..),
  AdCountry (..),
  AdCreateRequest (..),
  AdGroupArrayResponse (..),
  AdGroupArrayResponseElement (..),
  AdGroupAudienceSizingRequest (..),
  AdGroupAudienceSizingRequestKeywordsInner (..),
  AdGroupAudienceSizingResponse (..),
  AdGroupCommon (..),
  AdGroupCommonOptimizationGoalMetadata (..),
  AdGroupCommonTrackingUrls (..),
  AdGroupCreateRequest (..),
  AdGroupResponse (..),
  AdGroupSummaryStatus (..),
  AdGroupUpdateRequest (..),
  AdGroupsAnalyticsResponseInner (..),
  AdGroupsList200Response (..),
  AdPinId (..),
  AdPreviewCreateFromImage (..),
  AdPreviewCreateFromPin (..),
  AdPreviewRequest (..),
  AdPreviewURLResponse (..),
  AdResponse (..),
  AdUpdateRequest (..),
  AdsAnalyticsCreateAsyncRequest (..),
  AdsAnalyticsCreateAsyncResponse (..),
  AdsAnalyticsFilterColumn (..),
  AdsAnalyticsFilterOperator (..),
  AdsAnalyticsGetAsyncResponse (..),
  AdsAnalyticsMetricsFilter (..),
  AdsAnalyticsResponseInner (..),
  AdsAnalyticsTargetingType (..),
  AdsCreditDiscountsResponse (..),
  AdsCreditRedeemRequest (..),
  AdsCreditRedeemResponse (..),
  AdsCreditsDiscountsGet200Response (..),
  AdsList200Response (..),
  AnalyticsDailyMetrics (..),
  AnalyticsMetricsResponse (..),
  Audience (..),
  AudienceCategory (..),
  AudienceCommon (..),
  AudienceCreateCustomRequest (..),
  AudienceCreateRequest (..),
  AudienceCreateRequest1AudienceType (..),
  AudienceDataParty (..),
  AudienceDefinition (..),
  AudienceDefinitionResponse (..),
  AudienceDemographicValue (..),
  AudienceDemographics (..),
  AudienceInsightCategoryArrayResponse (..),
  AudienceInsightCategoryCommon (..),
  AudienceInsightType (..),
  AudienceInsightsResponse (..),
  AudienceRule (..),
  AudienceSharingType (..),
  AudienceSubcategory (..),
  AudienceType (..),
  AudienceUpdateOperationType (..),
  AudienceUpdateRequest (..),
  AudiencesList200Response (..),
  AvailabilityFilter (..),
  BatchOperation (..),
  BatchOperationStatus (..),
  BidFloor (..),
  BidFloorRequest (..),
  BidFloorSpec (..),
  BillingProfilesGet200Response (..),
  BillingProfilesResponse (..),
  Board (..),
  BoardMedia (..),
  BoardOwner (..),
  BoardSection (..),
  BoardSectionsList200Response (..),
  BoardUpdate (..),
  BoardsList200Response (..),
  BoardsListPins200Response (..),
  BoardsUserFollowsList200Response (..),
  BookClosedResponse (..),
  BrandFilter (..),
  BudgetType (..),
  BulkDownloadRequest (..),
  BulkDownloadRequestCampaignFilter (..),
  BulkDownloadResponse (..),
  BulkEntityType (..),
  BulkOutputFormat (..),
  BulkReportingJobStatus (..),
  BulkUpsertRequest (..),
  BulkUpsertRequestCreate (..),
  BulkUpsertRequestUpdate (..),
  BulkUpsertResponse (..),
  BulkUpsertStatus (..),
  BulkUpsertStatusResponse (..),
  BusinessAccessRole (..),
  CampaignCommon (..),
  CampaignCreateCommon (..),
  CampaignCreateRequest (..),
  CampaignCreateResponse (..),
  CampaignCreateResponseData (..),
  CampaignCreateResponseItem (..),
  CampaignId (..),
  CampaignResponse (..),
  CampaignSummaryStatus (..),
  CampaignUpdateRequest (..),
  CampaignUpdateResponse (..),
  CampaignsAnalyticsResponseInner (..),
  CampaignsList200Response (..),
  Catalog (..),
  CatalogProductGroup (..),
  CatalogsCreateHotelItem (..),
  CatalogsCreateRetailItem (..),
  CatalogsDbItem (..),
  CatalogsDeleteHotelItem (..),
  CatalogsDeleteRetailItem (..),
  CatalogsFeed (..),
  CatalogsFeedCredentials (..),
  CatalogsFeedIngestionDetails (..),
  CatalogsFeedIngestionErrors (..),
  CatalogsFeedIngestionInfo (..),
  CatalogsFeedIngestionWarnings (..),
  CatalogsFeedProcessingResult (..),
  CatalogsFeedProcessingSchedule (..),
  CatalogsFeedProcessingStatus (..),
  CatalogsFeedProductCounts (..),
  CatalogsFeedValidationDetails (..),
  CatalogsFeedValidationErrors (..),
  CatalogsFeedValidationWarnings (..),
  CatalogsFeedsCreateRequest (..),
  CatalogsFeedsCreateRequestDefaultLocale (..),
  CatalogsFeedsUpdateRequest (..),
  CatalogsFormat (..),
  CatalogsHotelAddress (..),
  CatalogsHotelAttributes (..),
  CatalogsHotelAttributesAllOfMainImage (..),
  CatalogsHotelBatchItem (..),
  CatalogsHotelBatchRequest (..),
  CatalogsHotelFeed (..),
  CatalogsHotelFeedsCreateRequest (..),
  CatalogsHotelFeedsUpdateRequest (..),
  CatalogsHotelGuestRatings (..),
  CatalogsHotelItemErrorResponse (..),
  CatalogsHotelItemResponse (..),
  CatalogsHotelItemsBatch (..),
  CatalogsHotelItemsFilter (..),
  CatalogsHotelProductGroup (..),
  CatalogsHotelProductGroupCreateRequest (..),
  CatalogsHotelProductGroupFilterKeys (..),
  CatalogsHotelProductGroupFilters (..),
  CatalogsHotelProductGroupFiltersAllOf (..),
  CatalogsHotelProductGroupFiltersAnyOf (..),
  CatalogsHotelProductGroupUpdateRequest (..),
  CatalogsItemValidationDetails (..),
  CatalogsItemValidationErrors (..),
  CatalogsItemValidationIssue (..),
  CatalogsItemValidationIssues (..),
  CatalogsItemValidationWarnings (..),
  CatalogsItems (..),
  CatalogsItemsBatch (..),
  CatalogsItemsBatchRequest (..),
  CatalogsItemsCreateBatchRequest (..),
  CatalogsItemsDeleteBatchRequest (..),
  CatalogsItemsDeleteDiscontinuedBatchRequest (..),
  CatalogsItemsFilters (..),
  CatalogsItemsUpdateBatchRequest (..),
  CatalogsItemsUpsertBatchRequest (..),
  CatalogsList200Response (..),
  CatalogsListProductsByFilterRequest (..),
  CatalogsListProductsByFilterRequestOneOf (..),
  CatalogsLocale (..),
  CatalogsProduct (..),
  CatalogsProductGroup (..),
  CatalogsProductGroupCreateRequest (..),
  CatalogsProductGroupCurrencyCriteria (..),
  CatalogsProductGroupFilterKeys (..),
  CatalogsProductGroupFilters (..),
  CatalogsProductGroupFiltersAllOf (..),
  CatalogsProductGroupFiltersAnyOf (..),
  CatalogsProductGroupFiltersRequest (..),
  CatalogsProductGroupFiltersRequestAnyOf (..),
  CatalogsProductGroupFiltersRequestAnyOf1 (..),
  CatalogsProductGroupMultipleCountriesCriteria (..),
  CatalogsProductGroupMultipleGenderCriteria (..),
  CatalogsProductGroupMultipleStringCriteria (..),
  CatalogsProductGroupMultipleStringListCriteria (..),
  CatalogsProductGroupPinsList200Response (..),
  CatalogsProductGroupPricingCriteria (..),
  CatalogsProductGroupPricingCurrencyCriteria (..),
  CatalogsProductGroupProductCounts (..),
  CatalogsProductGroupStatus (..),
  CatalogsProductGroupType (..),
  CatalogsProductGroupUpdateRequest (..),
  CatalogsProductGroupsCreate201Response (..),
  CatalogsProductGroupsCreateRequest (..),
  CatalogsProductGroupsList200Response (..),
  CatalogsProductGroupsList200ResponseAllOfItemsInner (..),
  CatalogsProductGroupsUpdateRequest (..),
  CatalogsProductMetadata (..),
  CatalogsRetailBatchRequest (..),
  CatalogsRetailBatchRequestItemsInner (..),
  CatalogsRetailFeed (..),
  CatalogsRetailFeedsCreateRequest (..),
  CatalogsRetailFeedsUpdateRequest (..),
  CatalogsRetailItemErrorResponse (..),
  CatalogsRetailItemResponse (..),
  CatalogsRetailItemsBatch (..),
  CatalogsRetailItemsFilter (..),
  CatalogsRetailProductGroup (..),
  CatalogsStatus (..),
  CatalogsType (..),
  CatalogsUpdatableHotelAttributes (..),
  CatalogsUpdateHotelItem (..),
  CatalogsUpdateRetailItem (..),
  CatalogsUpsertHotelItem (..),
  CatalogsUpsertRetailItem (..),
  CatalogsVerticalBatchRequest (..),
  CatalogsVerticalFeedsCreateRequest (..),
  CatalogsVerticalFeedsUpdateRequest (..),
  CatalogsVerticalProductGroup (..),
  CatalogsVerticalProductGroupCreateRequest (..),
  CatalogsVerticalProductGroupUpdateRequest (..),
  ConditionFilter (..),
  ConversionApiResponse (..),
  ConversionApiResponseEventsInner (..),
  ConversionAttributionWindowDays (..),
  ConversionEventResponse (..),
  ConversionEvents (..),
  ConversionEventsDataInner (..),
  ConversionEventsDataInnerCustomData (..),
  ConversionEventsDataInnerCustomDataContentsInner (..),
  ConversionEventsUserData (..),
  ConversionReportAttributionType (..),
  ConversionReportTimeType (..),
  ConversionTagCommon (..),
  ConversionTagConfigs (..),
  ConversionTagCreate (..),
  ConversionTagListResponse (..),
  ConversionTagResponse (..),
  ConversionTagType (..),
  Country (..),
  CountryFilter (..),
  CreateMMMReportRequest (..),
  CreateMMMReportResponse (..),
  CreateMMMReportResponseData (..),
  CreativeType (..),
  Currency (..),
  CurrencyFilter (..),
  CustomLabel0Filter (..),
  CustomLabel1Filter (..),
  CustomLabel2Filter (..),
  CustomLabel3Filter (..),
  CustomLabel4Filter (..),
  CustomerList (..),
  CustomerListRequest (..),
  CustomerListUpdateRequest (..),
  CustomerListsList200Response (..),
  DataOutputFormat (..),
  DataStatus (..),
  DeliveryMetricsResponse (..),
  DeliveryMetricsResponseItemsInner (..),
  DetailedError (..),
  EnhancedMatchStatusType (..),
  EntityStatus (..),
  Error (..),
  Exception (..),
  FeedProcessingResultsList200Response (..),
  FeedsCreateRequest (..),
  FeedsList200Response (..),
  FeedsUpdateRequest (..),
  FollowUserRequest (..),
  FollowersList200Response (..),
  Gender (..),
  GenderFilter (..),
  GetAudiencesOrderBy (..),
  GetMMMReportResponse (..),
  GetMMMReportResponseData (..),
  GoogleProductCategory0Filter (..),
  GoogleProductCategory1Filter (..),
  GoogleProductCategory2Filter (..),
  GoogleProductCategory3Filter (..),
  GoogleProductCategory4Filter (..),
  GoogleProductCategory5Filter (..),
  GoogleProductCategory6Filter (..),
  Granularity (..),
  GridClickType (..),
  HotelIdFilter (..),
  HotelProcessingRecord (..),
  ImageDetails (..),
  ImageMetadata (..),
  ImageMetadataImages (..),
  IntegrationLog (..),
  IntegrationLogClientError (..),
  IntegrationLogClientRequest (..),
  IntegrationLogsInvalidLogResponse (..),
  IntegrationLogsInvalidLogResponseRejectedLogsInner (..),
  IntegrationLogsRequest (..),
  IntegrationLogsSuccessResponse (..),
  IntegrationMetadata (..),
  IntegrationRecord (..),
  IntegrationRequest (..),
  IntegrationRequestPatch (..),
  IntegrationsGetList200Response (..),
  Interest (..),
  ItemAttributes (..),
  ItemBatchRecord (..),
  ItemCreateBatchRecord (..),
  ItemDeleteBatchRecord (..),
  ItemDeleteDiscontinuedBatchRecord (..),
  ItemGroupIdFilter (..),
  ItemIdFilter (..),
  ItemProcessingRecord (..),
  ItemProcessingStatus (..),
  ItemResponse (..),
  ItemResponseAnyOf (..),
  ItemResponseAnyOf1 (..),
  ItemUpdateBatchRecord (..),
  ItemUpsertBatchRecord (..),
  ItemValidationEvent (..),
  ItemsBatchPostRequest (..),
  ItemsIssuesList200Response (..),
  Keyword (..),
  KeywordError (..),
  KeywordMetrics (..),
  KeywordMetricsResponse (..),
  KeywordUpdate (..),
  KeywordUpdateBody (..),
  KeywordsCommon (..),
  KeywordsGet200Response (..),
  KeywordsMetricsArrayResponse (..),
  KeywordsRequest (..),
  KeywordsResponse (..),
  Language (..),
  LeadFormCommon (..),
  LeadFormQuestion (..),
  LeadFormQuestionFieldType (..),
  LeadFormQuestionType (..),
  LeadFormResponse (..),
  LeadFormStatus (..),
  LeadFormTestRequest (..),
  LeadFormTestResponse (..),
  LeadFormsList200Response (..),
  LineItem (..),
  LinkedBusiness (..),
  MMMReportingColumn (..),
  MMMReportingTargetingType (..),
  MatchType (..),
  MatchTypeResponse (..),
  MaxPriceFilter (..),
  MediaList200Response (..),
  MediaUpload (..),
  MediaUploadAllOfUploadParameters (..),
  MediaUploadDetails (..),
  MediaUploadRequest (..),
  MediaUploadStatus (..),
  MediaUploadType (..),
  MetricsReportingLevel (..),
  MetricsResponse (..),
  MinPriceFilter (..),
  NonNullableCatalogsCurrency (..),
  NonNullableProductAvailabilityType (..),
  NullableCatalogsItemFieldType (..),
  NullableCurrency (..),
  OauthAccessTokenRequestCode (..),
  OauthAccessTokenRequestRefresh (..),
  OauthAccessTokenResponse (..),
  OauthAccessTokenResponseCode (..),
  OauthAccessTokenResponseEverlastingRefresh (..),
  OauthAccessTokenResponseIntegrationRefresh (..),
  OauthAccessTokenResponseRefresh (..),
  ObjectiveType (..),
  OptimizationGoalMetadata (..),
  OptimizationGoalMetadataConversionTagV3GoalMetadata (..),
  OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows (..),
  OptimizationGoalMetadataFrequencyGoalMetadata (..),
  OptimizationGoalMetadataScrollupGoalMetadata (..),
  OrderLine (..),
  OrderLineError (..),
  OrderLinePaidType (..),
  OrderLineResponse (..),
  OrderLineSingleResponse (..),
  OrderLineStatus (..),
  OrderLines (..),
  OrderLinesArrayResponse (..),
  OrderLinesList200Response (..),
  PacingDeliveryType (..),
  PageVisitConversionTagsGet200Response (..),
  Paginated (..),
  PartnerType (..),
  Pin (..),
  PinAnalyticsMetricsResponse (..),
  PinAnalyticsMetricsResponseDailyMetricsInner (..),
  PinCreate (..),
  PinMedia (..),
  PinMediaMetadata (..),
  PinMediaSource (..),
  PinMediaSourceImageBase64 (..),
  PinMediaSourceImageURL (..),
  PinMediaSourceImagesBase64 (..),
  PinMediaSourceImagesBase64ItemsInner (..),
  PinMediaSourceImagesURL (..),
  PinMediaSourceImagesURLItemsInner (..),
  PinMediaSourcePinURL (..),
  PinMediaSourceVideoID (..),
  PinMediaWithImage (..),
  PinMediaWithImageAndVideo (..),
  PinMediaWithImages (..),
  PinMediaWithVideo (..),
  PinMediaWithVideos (..),
  PinPromotionSummaryStatus (..),
  PinUpdate (..),
  PinUpdateCarouselSlotsInner (..),
  PinsAnalyticsMetricTypesParameterInner (..),
  PinsList200Response (..),
  PinsSaveRequest (..),
  PinterestTagEventData (..),
  PlacementGroupType (..),
  PriceFilter (..),
  ProductAvailabilityType (..),
  ProductGroupAnalyticsResponseInner (..),
  ProductGroupPromotion (..),
  ProductGroupPromotionCreateRequest (..),
  ProductGroupPromotionResponse (..),
  ProductGroupPromotionResponseItem (..),
  ProductGroupPromotionUpdateRequest (..),
  ProductGroupPromotionsList200Response (..),
  ProductGroupSummaryStatus (..),
  ProductType0Filter (..),
  ProductType1Filter (..),
  ProductType2Filter (..),
  ProductType3Filter (..),
  ProductType4Filter (..),
  QuizPinData (..),
  QuizPinOption (..),
  QuizPinQuestion (..),
  QuizPinResult (..),
  RelatedTerms (..),
  RelatedTermsRelatedTermsListInner (..),
  ReportingColumnAsync (..),
  Role (..),
  SSIOAccountAddress (..),
  SSIOAccountItem (..),
  SSIOAccountPMPName (..),
  SSIOAccountResponse (..),
  SSIOCreateInsertionOrderRequest (..),
  SSIOCreateInsertionOrderResponse (..),
  SSIOEditInsertionOrderRequest (..),
  SSIOEditInsertionOrderResponse (..),
  SSIOInsertionOrderCommon (..),
  SSIOInsertionOrderStatus (..),
  SSIOInsertionOrderStatusResponse (..),
  SSIOOrderLine (..),
  SearchPartnerPins200Response (..),
  SearchUserBoardsGet200Response (..),
  SingleInterestTargetingOptionResponse (..),
  SsioInsertionOrdersStatusGetByAdAccount200Response (..),
  SsioOrderLinesGetByAdAccount200Response (..),
  SummaryPin (..),
  SummaryPinMedia (..),
  TargetingAdvertiserCountry (..),
  TargetingSpec (..),
  TargetingSpecSHOPPINGRETARGETING (..),
  TargetingTypeFilter (..),
  TemplateResponse (..),
  TemplateResponseDateRange (..),
  TemplateResponseDateRangeAbsoluteDateRange (..),
  TemplateResponseDateRangeDynamicDateRange (..),
  TemplateResponseDateRangeRelativeDateRange (..),
  TemplatesList200Response (..),
  TermsOfService (..),
  TopPinsAnalyticsResponse (..),
  TopPinsAnalyticsResponseDateAvailability (..),
  TopPinsAnalyticsResponsePinsInner (..),
  TopVideoPinsAnalyticsResponse (..),
  TopVideoPinsAnalyticsResponsePinsInner (..),
  TrackingUrls (..),
  TrendType (..),
  TrendingKeywordsResponse (..),
  TrendingKeywordsResponseTrendsInner (..),
  TrendingKeywordsResponseTrendsInnerTimeSeries (..),
  TrendsSupportedRegion (..),
  UpdatableItemAttributes (..),
  UpdateMaskFieldType (..),
  UserAccountFollowedInterests200Response (..),
  UserFollowingFeedType (..),
  UserFollowingGet200Response (..),
  UserListOperationType (..),
  UserListType (..),
  UserSummary (..),
  UserWebsiteSummary (..),
  UserWebsiteVerificationCode (..),
  UserWebsiteVerifyRequest (..),
  UserWebsitesGet200Response (..),
  VideoMetadata (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import qualified Data.List as List
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data Account = Account
  { accountAccountUnderscoretype :: Maybe Text -- ^ Type of account
  , accountId :: Maybe Text -- ^ User account ID.
  , accountProfileUnderscoreimage :: Maybe Text -- ^ 
  , accountWebsiteUnderscoreurl :: Maybe Text -- ^ 
  , accountUsername :: Maybe Text -- ^ 
  , accountAbout :: Maybe Text -- ^ Profile about description.
  , accountBusinessUnderscorename :: Maybe Text -- ^ 
  , accountBoardUnderscorecount :: Maybe Int -- ^ User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
  , accountPinUnderscorecount :: Maybe Int -- ^ User account pin count. This includes both created and saved pins.
  , accountFollowerUnderscorecount :: Maybe Int -- ^ User account follower count.
  , accountFollowingUnderscorecount :: Maybe Int -- ^ User account following count.
  , accountMonthlyUnderscoreviews :: Maybe Int -- ^ User account monthly views.
  } deriving (Show, Eq, Generic)

instance FromJSON Account where
  parseJSON = genericParseJSON optionsAccount
instance ToJSON Account where
  toJSON = genericToJSON optionsAccount

optionsAccount :: Options
optionsAccount =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("accountAccountUnderscoretype", "account_type")
      , ("accountId", "id")
      , ("accountProfileUnderscoreimage", "profile_image")
      , ("accountWebsiteUnderscoreurl", "website_url")
      , ("accountUsername", "username")
      , ("accountAbout", "about")
      , ("accountBusinessUnderscorename", "business_name")
      , ("accountBoardUnderscorecount", "board_count")
      , ("accountPinUnderscorecount", "pin_count")
      , ("accountFollowerUnderscorecount", "follower_count")
      , ("accountFollowingUnderscorecount", "following_count")
      , ("accountMonthlyUnderscoreviews", "monthly_views")
      ]


-- | Ad group billable event type. For update, only draft ad groups may update billable event.
data ActionType = ActionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ActionType where
  parseJSON = genericParseJSON optionsActionType
instance ToJSON ActionType where
  toJSON = genericToJSON optionsActionType

optionsActionType :: Options
optionsActionType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data AdAccount = AdAccount
  { adAccountId :: Maybe Text -- ^ 
  , adAccountName :: Maybe Text -- ^ 
  , adAccountOwner :: Maybe AdAccountOwner -- ^ 
  , adAccountCountry :: Maybe Country -- ^ 
  , adAccountCurrency :: Maybe Currency -- ^ 
  , adAccountPermissions :: Maybe [BusinessAccessRole] -- ^ 
  , adAccountCreatedUnderscoretime :: Maybe Int -- ^ Creation time. Unix timestamp in seconds.
  , adAccountUpdatedUnderscoretime :: Maybe Int -- ^ Last update time. Unix timestamp in seconds.
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccount where
  parseJSON = genericParseJSON optionsAdAccount
instance ToJSON AdAccount where
  toJSON = genericToJSON optionsAdAccount

optionsAdAccount :: Options
optionsAdAccount =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adAccountId", "id")
      , ("adAccountName", "name")
      , ("adAccountOwner", "owner")
      , ("adAccountCountry", "country")
      , ("adAccountCurrency", "currency")
      , ("adAccountPermissions", "permissions")
      , ("adAccountCreatedUnderscoretime", "created_time")
      , ("adAccountUpdatedUnderscoretime", "updated_time")
      ]


-- | 
newtype AdAccountAnalyticsResponseInner = AdAccountAnalyticsResponseInner { unAdAccountAnalyticsResponseInner :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data AdAccountCreateRequest = AdAccountCreateRequest
  { adAccountCreateRequestCountry :: Maybe Country -- ^ 
  , adAccountCreateRequestName :: Maybe Text -- ^ Ad Account name.
  , adAccountCreateRequestOwnerUnderscoreuserUnderscoreid :: Maybe Text -- ^ Advertiser's owning user ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccountCreateRequest where
  parseJSON = genericParseJSON optionsAdAccountCreateRequest
instance ToJSON AdAccountCreateRequest where
  toJSON = genericToJSON optionsAdAccountCreateRequest

optionsAdAccountCreateRequest :: Options
optionsAdAccountCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adAccountCreateRequestCountry", "country")
      , ("adAccountCreateRequestName", "name")
      , ("adAccountCreateRequestOwnerUnderscoreuserUnderscoreid", "owner_user_id")
      ]


-- | 
data AdAccountCreateSubscriptionRequest = AdAccountCreateSubscriptionRequest
  { adAccountCreateSubscriptionRequestWebhookUnderscoreurl :: Text -- ^ Standard HTTPS webhook URL.
  , adAccountCreateSubscriptionRequestLeadUnderscoreformUnderscoreid :: Maybe Text -- ^ Lead form ID.
  , adAccountCreateSubscriptionRequestPartnerUnderscoreaccessUnderscoretoken :: Maybe Text -- ^ Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  , adAccountCreateSubscriptionRequestPartnerUnderscorerefreshUnderscoretoken :: Maybe Text -- ^ Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccountCreateSubscriptionRequest where
  parseJSON = genericParseJSON optionsAdAccountCreateSubscriptionRequest
instance ToJSON AdAccountCreateSubscriptionRequest where
  toJSON = genericToJSON optionsAdAccountCreateSubscriptionRequest

optionsAdAccountCreateSubscriptionRequest :: Options
optionsAdAccountCreateSubscriptionRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adAccountCreateSubscriptionRequestWebhookUnderscoreurl", "webhook_url")
      , ("adAccountCreateSubscriptionRequestLeadUnderscoreformUnderscoreid", "lead_form_id")
      , ("adAccountCreateSubscriptionRequestPartnerUnderscoreaccessUnderscoretoken", "partner_access_token")
      , ("adAccountCreateSubscriptionRequestPartnerUnderscorerefreshUnderscoretoken", "partner_refresh_token")
      ]


-- | 
data AdAccountCreateSubscriptionResponse = AdAccountCreateSubscriptionResponse
  { adAccountCreateSubscriptionResponseId :: Maybe Text -- ^ Subscription ID.
  , adAccountCreateSubscriptionResponseCryptographicUnderscorekey :: Maybe Text -- ^ Base64 encoded key for client to decrypt lead data.
  , adAccountCreateSubscriptionResponseCryptographicUnderscorealgorithm :: Maybe Text -- ^ Lead data encryption algorithm.
  , adAccountCreateSubscriptionResponseCreatedUnderscoretime :: Maybe Int -- ^ Subscription creation time. Unix timestamp in milliseconds.
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccountCreateSubscriptionResponse where
  parseJSON = genericParseJSON optionsAdAccountCreateSubscriptionResponse
instance ToJSON AdAccountCreateSubscriptionResponse where
  toJSON = genericToJSON optionsAdAccountCreateSubscriptionResponse

optionsAdAccountCreateSubscriptionResponse :: Options
optionsAdAccountCreateSubscriptionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adAccountCreateSubscriptionResponseId", "id")
      , ("adAccountCreateSubscriptionResponseCryptographicUnderscorekey", "cryptographic_key")
      , ("adAccountCreateSubscriptionResponseCryptographicUnderscorealgorithm", "cryptographic_algorithm")
      , ("adAccountCreateSubscriptionResponseCreatedUnderscoretime", "created_time")
      ]


-- | 
data AdAccountGetSubscriptionResponse = AdAccountGetSubscriptionResponse
  { adAccountGetSubscriptionResponseLeadUnderscoreformUnderscoreid :: Maybe Text -- ^ Lead form ID.
  , adAccountGetSubscriptionResponseWebhookUnderscoreurl :: Maybe Text -- ^ Standard HTTPS webhook URL.
  , adAccountGetSubscriptionResponseId :: Maybe Text -- ^ Subscription ID.
  , adAccountGetSubscriptionResponseUserUnderscoreaccountUnderscoreid :: Maybe Text -- ^ User account used to subscribe lead data.
  , adAccountGetSubscriptionResponseAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ The Ad Account ID that this lead form belongs to.
  , adAccountGetSubscriptionResponseApiUnderscoreversion :: Maybe Text -- ^ API version.
  , adAccountGetSubscriptionResponseCryptographicUnderscorekey :: Maybe Text -- ^ Base64 encoded key for client to decrypt lead data.
  , adAccountGetSubscriptionResponseCryptographicUnderscorealgorithm :: Maybe Text -- ^ Lead data encryption algorithm.
  , adAccountGetSubscriptionResponseCreatedUnderscoretime :: Maybe Int -- ^ Lead form creation time. Unix timestamp in milliseconds.
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccountGetSubscriptionResponse where
  parseJSON = genericParseJSON optionsAdAccountGetSubscriptionResponse
instance ToJSON AdAccountGetSubscriptionResponse where
  toJSON = genericToJSON optionsAdAccountGetSubscriptionResponse

optionsAdAccountGetSubscriptionResponse :: Options
optionsAdAccountGetSubscriptionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adAccountGetSubscriptionResponseLeadUnderscoreformUnderscoreid", "lead_form_id")
      , ("adAccountGetSubscriptionResponseWebhookUnderscoreurl", "webhook_url")
      , ("adAccountGetSubscriptionResponseId", "id")
      , ("adAccountGetSubscriptionResponseUserUnderscoreaccountUnderscoreid", "user_account_id")
      , ("adAccountGetSubscriptionResponseAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("adAccountGetSubscriptionResponseApiUnderscoreversion", "api_version")
      , ("adAccountGetSubscriptionResponseCryptographicUnderscorekey", "cryptographic_key")
      , ("adAccountGetSubscriptionResponseCryptographicUnderscorealgorithm", "cryptographic_algorithm")
      , ("adAccountGetSubscriptionResponseCreatedUnderscoretime", "created_time")
      ]


-- | 
data AdAccountOwner = AdAccountOwner
  { adAccountOwnerUsername :: Maybe Text -- ^ Public username for the user account
  , adAccountOwnerId :: Maybe Text -- ^ The owning account's user ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccountOwner where
  parseJSON = genericParseJSON optionsAdAccountOwner
instance ToJSON AdAccountOwner where
  toJSON = genericToJSON optionsAdAccountOwner

optionsAdAccountOwner :: Options
optionsAdAccountOwner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adAccountOwnerUsername", "username")
      , ("adAccountOwnerId", "id")
      ]


-- | 
data AdAccountsCatalogsProductGroupsList200Response = AdAccountsCatalogsProductGroupsList200Response
  { adAccountsCatalogsProductGroupsList200ResponseItems :: [CatalogProductGroup] -- ^ 
  , adAccountsCatalogsProductGroupsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccountsCatalogsProductGroupsList200Response where
  parseJSON = genericParseJSON optionsAdAccountsCatalogsProductGroupsList200Response
instance ToJSON AdAccountsCatalogsProductGroupsList200Response where
  toJSON = genericToJSON optionsAdAccountsCatalogsProductGroupsList200Response

optionsAdAccountsCatalogsProductGroupsList200Response :: Options
optionsAdAccountsCatalogsProductGroupsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adAccountsCatalogsProductGroupsList200ResponseItems", "items")
      , ("adAccountsCatalogsProductGroupsList200ResponseBookmark", "bookmark")
      ]


-- | 
data AdAccountsCountryResponse = AdAccountsCountryResponse
  { adAccountsCountryResponseItems :: Maybe [AdAccountsCountryResponseData] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccountsCountryResponse where
  parseJSON = genericParseJSON optionsAdAccountsCountryResponse
instance ToJSON AdAccountsCountryResponse where
  toJSON = genericToJSON optionsAdAccountsCountryResponse

optionsAdAccountsCountryResponse :: Options
optionsAdAccountsCountryResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adAccountsCountryResponseItems", "items")
      ]


-- | 
data AdAccountsCountryResponseData = AdAccountsCountryResponseData
  { adAccountsCountryResponseDataCode :: Maybe AdCountry -- ^ 
  , adAccountsCountryResponseDataCurrency :: Maybe Text -- ^ Country currency.
  , adAccountsCountryResponseDataIndex :: Maybe Double -- ^ Country index
  , adAccountsCountryResponseDataName :: Maybe Text -- ^ Country name
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccountsCountryResponseData where
  parseJSON = genericParseJSON optionsAdAccountsCountryResponseData
instance ToJSON AdAccountsCountryResponseData where
  toJSON = genericToJSON optionsAdAccountsCountryResponseData

optionsAdAccountsCountryResponseData :: Options
optionsAdAccountsCountryResponseData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adAccountsCountryResponseDataCode", "code")
      , ("adAccountsCountryResponseDataCurrency", "currency")
      , ("adAccountsCountryResponseDataIndex", "index")
      , ("adAccountsCountryResponseDataName", "name")
      ]


-- | 
data AdAccountsList200Response = AdAccountsList200Response
  { adAccountsList200ResponseItems :: [AdAccount] -- ^ Ad accounts
  , adAccountsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccountsList200Response where
  parseJSON = genericParseJSON optionsAdAccountsList200Response
instance ToJSON AdAccountsList200Response where
  toJSON = genericToJSON optionsAdAccountsList200Response

optionsAdAccountsList200Response :: Options
optionsAdAccountsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adAccountsList200ResponseItems", "items")
      , ("adAccountsList200ResponseBookmark", "bookmark")
      ]


-- | 
data AdAccountsSubscriptionsGetList200Response = AdAccountsSubscriptionsGetList200Response
  { adAccountsSubscriptionsGetList200ResponseItems :: [AdAccountGetSubscriptionResponse] -- ^ 
  , adAccountsSubscriptionsGetList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccountsSubscriptionsGetList200Response where
  parseJSON = genericParseJSON optionsAdAccountsSubscriptionsGetList200Response
instance ToJSON AdAccountsSubscriptionsGetList200Response where
  toJSON = genericToJSON optionsAdAccountsSubscriptionsGetList200Response

optionsAdAccountsSubscriptionsGetList200Response :: Options
optionsAdAccountsSubscriptionsGetList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adAccountsSubscriptionsGetList200ResponseItems", "items")
      , ("adAccountsSubscriptionsGetList200ResponseBookmark", "bookmark")
      ]


-- | 
data AdArrayResponse = AdArrayResponse
  { adArrayResponseItems :: Maybe [AdArrayResponseElement] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdArrayResponse where
  parseJSON = genericParseJSON optionsAdArrayResponse
instance ToJSON AdArrayResponse where
  toJSON = genericToJSON optionsAdArrayResponse

optionsAdArrayResponse :: Options
optionsAdArrayResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adArrayResponseItems", "items")
      ]


-- | 
data AdArrayResponseElement = AdArrayResponseElement
  { adArrayResponseElementData :: Maybe AdResponse -- ^ 
  , adArrayResponseElementExceptions :: Maybe Exception -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdArrayResponseElement where
  parseJSON = genericParseJSON optionsAdArrayResponseElement
instance ToJSON AdArrayResponseElement where
  toJSON = genericToJSON optionsAdArrayResponseElement

optionsAdArrayResponseElement :: Options
optionsAdArrayResponseElement =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adArrayResponseElementData", "data")
      , ("adArrayResponseElementExceptions", "exceptions")
      ]


-- | Creation fields
data AdCommon = AdCommon
  { adCommonAdUnderscoregroupUnderscoreid :: Maybe Text -- ^ ID of the ad group that contains the ad.
  , adCommonAndroidUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  , adCommonCarouselUnderscoreandroidUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on Android.
  , adCommonCarouselUnderscoredestinationUnderscoreurls :: Maybe [Text] -- ^ Comma-separated destination URLs for the carousel pin to promote.
  , adCommonCarouselUnderscoreiosUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on iOS.
  , adCommonClickUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking url for the ad clicks.
  , adCommonCreativeUnderscoretype :: Maybe CreativeType -- ^ 
  , adCommonDestinationUnderscoreurl :: Maybe Text -- ^ Destination URL.
  , adCommonIosUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  , adCommonIsUnderscorepinUnderscoredeleted :: Maybe Bool -- ^ Is original pin deleted?
  , adCommonIsUnderscoreremovable :: Maybe Bool -- ^ Is pin repinnable?
  , adCommonName :: Maybe Text -- ^ Name of the ad - 255 chars max.
  , adCommonStatus :: Maybe EntityStatus -- ^ 
  , adCommonTrackingUnderscoreurls :: Maybe AdCommonTrackingUrls -- ^ 
  , adCommonViewUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking URL for ad impressions.
  , adCommonLeadUnderscoreformUnderscoreid :: Maybe Text -- ^ Lead form ID for lead ad generation.
  , adCommonGridUnderscoreclickUnderscoretype :: Maybe GridClickType -- ^ 
  , adCommonCustomizableUnderscorectaUnderscoretype :: Maybe Text -- ^ Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
  , adCommonQuizUnderscorepinUnderscoredata :: Maybe AdCommonQuizPinData -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdCommon where
  parseJSON = genericParseJSON optionsAdCommon
instance ToJSON AdCommon where
  toJSON = genericToJSON optionsAdCommon

optionsAdCommon :: Options
optionsAdCommon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adCommonAdUnderscoregroupUnderscoreid", "ad_group_id")
      , ("adCommonAndroidUnderscoredeepUnderscorelink", "android_deep_link")
      , ("adCommonCarouselUnderscoreandroidUnderscoredeepUnderscorelinks", "carousel_android_deep_links")
      , ("adCommonCarouselUnderscoredestinationUnderscoreurls", "carousel_destination_urls")
      , ("adCommonCarouselUnderscoreiosUnderscoredeepUnderscorelinks", "carousel_ios_deep_links")
      , ("adCommonClickUnderscoretrackingUnderscoreurl", "click_tracking_url")
      , ("adCommonCreativeUnderscoretype", "creative_type")
      , ("adCommonDestinationUnderscoreurl", "destination_url")
      , ("adCommonIosUnderscoredeepUnderscorelink", "ios_deep_link")
      , ("adCommonIsUnderscorepinUnderscoredeleted", "is_pin_deleted")
      , ("adCommonIsUnderscoreremovable", "is_removable")
      , ("adCommonName", "name")
      , ("adCommonStatus", "status")
      , ("adCommonTrackingUnderscoreurls", "tracking_urls")
      , ("adCommonViewUnderscoretrackingUnderscoreurl", "view_tracking_url")
      , ("adCommonLeadUnderscoreformUnderscoreid", "lead_form_id")
      , ("adCommonGridUnderscoreclickUnderscoretype", "grid_click_type")
      , ("adCommonCustomizableUnderscorectaUnderscoretype", "customizable_cta_type")
      , ("adCommonQuizUnderscorepinUnderscoredata", "quiz_pin_data")
      ]


-- | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
data AdCommonQuizPinData = AdCommonQuizPinData
  { adCommonQuizPinDataQuestions :: Maybe [QuizPinQuestion] -- ^ 
  , adCommonQuizPinDataResults :: Maybe [QuizPinResult] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdCommonQuizPinData where
  parseJSON = genericParseJSON optionsAdCommonQuizPinData
instance ToJSON AdCommonQuizPinData where
  toJSON = genericToJSON optionsAdCommonQuizPinData

optionsAdCommonQuizPinData :: Options
optionsAdCommonQuizPinData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adCommonQuizPinDataQuestions", "questions")
      , ("adCommonQuizPinDataResults", "results")
      ]


-- | 
data AdCommonTrackingUrls = AdCommonTrackingUrls
  { adCommonTrackingUrlsImpression :: Maybe [Text] -- ^ 
  , adCommonTrackingUrlsClick :: Maybe [Text] -- ^ 
  , adCommonTrackingUrlsEngagement :: Maybe [Text] -- ^ 
  , adCommonTrackingUrlsBuyableUnderscorebutton :: Maybe [Text] -- ^ 
  , adCommonTrackingUrlsAudienceUnderscoreverification :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdCommonTrackingUrls where
  parseJSON = genericParseJSON optionsAdCommonTrackingUrls
instance ToJSON AdCommonTrackingUrls where
  toJSON = genericToJSON optionsAdCommonTrackingUrls

optionsAdCommonTrackingUrls :: Options
optionsAdCommonTrackingUrls =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adCommonTrackingUrlsImpression", "impression")
      , ("adCommonTrackingUrlsClick", "click")
      , ("adCommonTrackingUrlsEngagement", "engagement")
      , ("adCommonTrackingUrlsBuyableUnderscorebutton", "buyable_button")
      , ("adCommonTrackingUrlsAudienceUnderscoreverification", "audience_verification")
      ]


-- | Country ID from ISO 3166-1 alpha-2.
data AdCountry = AdCountry
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AdCountry where
  parseJSON = genericParseJSON optionsAdCountry
instance ToJSON AdCountry where
  toJSON = genericToJSON optionsAdCountry

optionsAdCountry :: Options
optionsAdCountry =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data AdCreateRequest = AdCreateRequest
  { adCreateRequestAdUnderscoregroupUnderscoreid :: Text -- ^ ID of the ad group that contains the ad.
  , adCreateRequestAndroidUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  , adCreateRequestCarouselUnderscoreandroidUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on Android.
  , adCreateRequestCarouselUnderscoredestinationUnderscoreurls :: Maybe [Text] -- ^ Comma-separated destination URLs for the carousel pin to promote.
  , adCreateRequestCarouselUnderscoreiosUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on iOS.
  , adCreateRequestClickUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking url for the ad clicks.
  , adCreateRequestCreativeUnderscoretype :: CreativeType -- ^ 
  , adCreateRequestDestinationUnderscoreurl :: Maybe Text -- ^ Destination URL.
  , adCreateRequestIosUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  , adCreateRequestIsUnderscorepinUnderscoredeleted :: Maybe Bool -- ^ Is original pin deleted?
  , adCreateRequestIsUnderscoreremovable :: Maybe Bool -- ^ Is pin repinnable?
  , adCreateRequestName :: Maybe Text -- ^ Name of the ad - 255 chars max.
  , adCreateRequestStatus :: Maybe EntityStatus -- ^ 
  , adCreateRequestTrackingUnderscoreurls :: Maybe AdCommonTrackingUrls -- ^ 
  , adCreateRequestViewUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking URL for ad impressions.
  , adCreateRequestLeadUnderscoreformUnderscoreid :: Maybe Text -- ^ Lead form ID for lead ad generation.
  , adCreateRequestGridUnderscoreclickUnderscoretype :: Maybe GridClickType -- ^ 
  , adCreateRequestCustomizableUnderscorectaUnderscoretype :: Maybe Text -- ^ Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
  , adCreateRequestQuizUnderscorepinUnderscoredata :: Maybe AdCommonQuizPinData -- ^ 
  , adCreateRequestPinUnderscoreid :: Text -- ^ Pin ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AdCreateRequest where
  parseJSON = genericParseJSON optionsAdCreateRequest
instance ToJSON AdCreateRequest where
  toJSON = genericToJSON optionsAdCreateRequest

optionsAdCreateRequest :: Options
optionsAdCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adCreateRequestAdUnderscoregroupUnderscoreid", "ad_group_id")
      , ("adCreateRequestAndroidUnderscoredeepUnderscorelink", "android_deep_link")
      , ("adCreateRequestCarouselUnderscoreandroidUnderscoredeepUnderscorelinks", "carousel_android_deep_links")
      , ("adCreateRequestCarouselUnderscoredestinationUnderscoreurls", "carousel_destination_urls")
      , ("adCreateRequestCarouselUnderscoreiosUnderscoredeepUnderscorelinks", "carousel_ios_deep_links")
      , ("adCreateRequestClickUnderscoretrackingUnderscoreurl", "click_tracking_url")
      , ("adCreateRequestCreativeUnderscoretype", "creative_type")
      , ("adCreateRequestDestinationUnderscoreurl", "destination_url")
      , ("adCreateRequestIosUnderscoredeepUnderscorelink", "ios_deep_link")
      , ("adCreateRequestIsUnderscorepinUnderscoredeleted", "is_pin_deleted")
      , ("adCreateRequestIsUnderscoreremovable", "is_removable")
      , ("adCreateRequestName", "name")
      , ("adCreateRequestStatus", "status")
      , ("adCreateRequestTrackingUnderscoreurls", "tracking_urls")
      , ("adCreateRequestViewUnderscoretrackingUnderscoreurl", "view_tracking_url")
      , ("adCreateRequestLeadUnderscoreformUnderscoreid", "lead_form_id")
      , ("adCreateRequestGridUnderscoreclickUnderscoretype", "grid_click_type")
      , ("adCreateRequestCustomizableUnderscorectaUnderscoretype", "customizable_cta_type")
      , ("adCreateRequestQuizUnderscorepinUnderscoredata", "quiz_pin_data")
      , ("adCreateRequestPinUnderscoreid", "pin_id")
      ]


-- | 
data AdGroupArrayResponse = AdGroupArrayResponse
  { adGroupArrayResponseItems :: Maybe [AdGroupArrayResponseElement] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupArrayResponse where
  parseJSON = genericParseJSON optionsAdGroupArrayResponse
instance ToJSON AdGroupArrayResponse where
  toJSON = genericToJSON optionsAdGroupArrayResponse

optionsAdGroupArrayResponse :: Options
optionsAdGroupArrayResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupArrayResponseItems", "items")
      ]


-- | 
data AdGroupArrayResponseElement = AdGroupArrayResponseElement
  { adGroupArrayResponseElementData :: Maybe AdGroupResponse -- ^ 
  , adGroupArrayResponseElementExceptions :: Maybe [Exception] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupArrayResponseElement where
  parseJSON = genericParseJSON optionsAdGroupArrayResponseElement
instance ToJSON AdGroupArrayResponseElement where
  toJSON = genericToJSON optionsAdGroupArrayResponseElement

optionsAdGroupArrayResponseElement :: Options
optionsAdGroupArrayResponseElement =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupArrayResponseElementData", "data")
      , ("adGroupArrayResponseElementExceptions", "exceptions")
      ]


-- | 
data AdGroupAudienceSizingRequest = AdGroupAudienceSizingRequest
  { adGroupAudienceSizingRequestAutoUnderscoretargetingUnderscoreenabled :: Maybe Bool -- ^ Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  , adGroupAudienceSizingRequestPlacementUnderscoregroup :: Maybe PlacementGroupType -- ^ <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  , adGroupAudienceSizingRequestCreativeUnderscoretypes :: Maybe [Text] -- ^ Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  , adGroupAudienceSizingRequestTargetingUnderscorespec :: Maybe TargetingSpec -- ^ 
  , adGroupAudienceSizingRequestProductUnderscoregroupUnderscoreids :: Maybe [Text] -- ^ Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
  , adGroupAudienceSizingRequestKeywords :: Maybe [AdGroupAudienceSizingRequestKeywordsInner] -- ^ Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupAudienceSizingRequest where
  parseJSON = genericParseJSON optionsAdGroupAudienceSizingRequest
instance ToJSON AdGroupAudienceSizingRequest where
  toJSON = genericToJSON optionsAdGroupAudienceSizingRequest

optionsAdGroupAudienceSizingRequest :: Options
optionsAdGroupAudienceSizingRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupAudienceSizingRequestAutoUnderscoretargetingUnderscoreenabled", "auto_targeting_enabled")
      , ("adGroupAudienceSizingRequestPlacementUnderscoregroup", "placement_group")
      , ("adGroupAudienceSizingRequestCreativeUnderscoretypes", "creative_types")
      , ("adGroupAudienceSizingRequestTargetingUnderscorespec", "targeting_spec")
      , ("adGroupAudienceSizingRequestProductUnderscoregroupUnderscoreids", "product_group_ids")
      , ("adGroupAudienceSizingRequestKeywords", "keywords")
      ]


-- | 
data AdGroupAudienceSizingRequestKeywordsInner = AdGroupAudienceSizingRequestKeywordsInner
  { adGroupAudienceSizingRequestKeywordsInnerMatchUnderscoretype :: MatchTypeResponse -- ^ 
  , adGroupAudienceSizingRequestKeywordsInnerValue :: Text -- ^ Keyword value (120 chars max).
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupAudienceSizingRequestKeywordsInner where
  parseJSON = genericParseJSON optionsAdGroupAudienceSizingRequestKeywordsInner
instance ToJSON AdGroupAudienceSizingRequestKeywordsInner where
  toJSON = genericToJSON optionsAdGroupAudienceSizingRequestKeywordsInner

optionsAdGroupAudienceSizingRequestKeywordsInner :: Options
optionsAdGroupAudienceSizingRequestKeywordsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupAudienceSizingRequestKeywordsInnerMatchUnderscoretype", "match_type")
      , ("adGroupAudienceSizingRequestKeywordsInnerValue", "value")
      ]


-- | 
data AdGroupAudienceSizingResponse = AdGroupAudienceSizingResponse
  { adGroupAudienceSizingResponseAudienceUnderscoresizeUnderscorelowerUnderscorebound :: Maybe Double -- ^ The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  , adGroupAudienceSizingResponseAudienceUnderscoresizeUnderscoreupperUnderscorebound :: Maybe Double -- ^ The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupAudienceSizingResponse where
  parseJSON = genericParseJSON optionsAdGroupAudienceSizingResponse
instance ToJSON AdGroupAudienceSizingResponse where
  toJSON = genericToJSON optionsAdGroupAudienceSizingResponse

optionsAdGroupAudienceSizingResponse :: Options
optionsAdGroupAudienceSizingResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupAudienceSizingResponseAudienceUnderscoresizeUnderscorelowerUnderscorebound", "audience_size_lower_bound")
      , ("adGroupAudienceSizingResponseAudienceUnderscoresizeUnderscoreupperUnderscorebound", "audience_size_upper_bound")
      ]


-- | 
data AdGroupCommon = AdGroupCommon
  { adGroupCommonName :: Maybe Text -- ^ Ad group name.
  , adGroupCommonStatus :: Maybe EntityStatus -- ^ Ad group/entity status.
  , adGroupCommonBudgetUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  , adGroupCommonBidUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  , adGroupCommonOptimizationUnderscoregoalUnderscoremetadata :: Maybe AdGroupCommonOptimizationGoalMetadata -- ^ 
  , adGroupCommonBudgetUnderscoretype :: Maybe BudgetType -- ^ 
  , adGroupCommonStartUnderscoretime :: Maybe Int -- ^ Ad group start time. Unix timestamp in seconds. Defaults to current time.
  , adGroupCommonEndUnderscoretime :: Maybe Int -- ^ Ad group end time. Unix timestamp in seconds.
  , adGroupCommonTargetingUnderscorespec :: Maybe TargetingSpec -- ^ 
  , adGroupCommonLifetimeUnderscorefrequencyUnderscorecap :: Maybe Int -- ^ Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  , adGroupCommonTrackingUnderscoreurls :: Maybe AdGroupCommonTrackingUrls -- ^ 
  , adGroupCommonAutoUnderscoretargetingUnderscoreenabled :: Maybe Bool -- ^ Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  , adGroupCommonPlacementUnderscoregroup :: Maybe PlacementGroupType -- ^ <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
  , adGroupCommonPacingUnderscoredeliveryUnderscoretype :: Maybe PacingDeliveryType -- ^ 
  , adGroupCommonCampaignUnderscoreid :: Maybe Text -- ^ Campaign ID of the ad group.
  , adGroupCommonBillableUnderscoreevent :: Maybe ActionType -- ^ 
  , adGroupCommonBidUnderscorestrategyUnderscoretype :: Maybe Text -- ^ Bid strategy type
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupCommon where
  parseJSON = genericParseJSON optionsAdGroupCommon
instance ToJSON AdGroupCommon where
  toJSON = genericToJSON optionsAdGroupCommon

optionsAdGroupCommon :: Options
optionsAdGroupCommon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupCommonName", "name")
      , ("adGroupCommonStatus", "status")
      , ("adGroupCommonBudgetUnderscoreinUnderscoremicroUnderscorecurrency", "budget_in_micro_currency")
      , ("adGroupCommonBidUnderscoreinUnderscoremicroUnderscorecurrency", "bid_in_micro_currency")
      , ("adGroupCommonOptimizationUnderscoregoalUnderscoremetadata", "optimization_goal_metadata")
      , ("adGroupCommonBudgetUnderscoretype", "budget_type")
      , ("adGroupCommonStartUnderscoretime", "start_time")
      , ("adGroupCommonEndUnderscoretime", "end_time")
      , ("adGroupCommonTargetingUnderscorespec", "targeting_spec")
      , ("adGroupCommonLifetimeUnderscorefrequencyUnderscorecap", "lifetime_frequency_cap")
      , ("adGroupCommonTrackingUnderscoreurls", "tracking_urls")
      , ("adGroupCommonAutoUnderscoretargetingUnderscoreenabled", "auto_targeting_enabled")
      , ("adGroupCommonPlacementUnderscoregroup", "placement_group")
      , ("adGroupCommonPacingUnderscoredeliveryUnderscoretype", "pacing_delivery_type")
      , ("adGroupCommonCampaignUnderscoreid", "campaign_id")
      , ("adGroupCommonBillableUnderscoreevent", "billable_event")
      , ("adGroupCommonBidUnderscorestrategyUnderscoretype", "bid_strategy_type")
      ]


-- | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
data AdGroupCommonOptimizationGoalMetadata = AdGroupCommonOptimizationGoalMetadata
  { adGroupCommonOptimizationGoalMetadataConversionUnderscoretagUnderscorev3UnderscoregoalUnderscoremetadata :: Maybe OptimizationGoalMetadataConversionTagV3GoalMetadata -- ^ 
  , adGroupCommonOptimizationGoalMetadataFrequencyUnderscoregoalUnderscoremetadata :: Maybe OptimizationGoalMetadataFrequencyGoalMetadata -- ^ 
  , adGroupCommonOptimizationGoalMetadataScrollupUnderscoregoalUnderscoremetadata :: Maybe OptimizationGoalMetadataScrollupGoalMetadata -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupCommonOptimizationGoalMetadata where
  parseJSON = genericParseJSON optionsAdGroupCommonOptimizationGoalMetadata
instance ToJSON AdGroupCommonOptimizationGoalMetadata where
  toJSON = genericToJSON optionsAdGroupCommonOptimizationGoalMetadata

optionsAdGroupCommonOptimizationGoalMetadata :: Options
optionsAdGroupCommonOptimizationGoalMetadata =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupCommonOptimizationGoalMetadataConversionUnderscoretagUnderscorev3UnderscoregoalUnderscoremetadata", "conversion_tag_v3_goal_metadata")
      , ("adGroupCommonOptimizationGoalMetadataFrequencyUnderscoregoalUnderscoremetadata", "frequency_goal_metadata")
      , ("adGroupCommonOptimizationGoalMetadataScrollupUnderscoregoalUnderscoremetadata", "scrollup_goal_metadata")
      ]


-- | Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
data AdGroupCommonTrackingUrls = AdGroupCommonTrackingUrls
  { adGroupCommonTrackingUrlsImpression :: Maybe [Text] -- ^ 
  , adGroupCommonTrackingUrlsClick :: Maybe [Text] -- ^ 
  , adGroupCommonTrackingUrlsEngagement :: Maybe [Text] -- ^ 
  , adGroupCommonTrackingUrlsBuyableUnderscorebutton :: Maybe [Text] -- ^ 
  , adGroupCommonTrackingUrlsAudienceUnderscoreverification :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupCommonTrackingUrls where
  parseJSON = genericParseJSON optionsAdGroupCommonTrackingUrls
instance ToJSON AdGroupCommonTrackingUrls where
  toJSON = genericToJSON optionsAdGroupCommonTrackingUrls

optionsAdGroupCommonTrackingUrls :: Options
optionsAdGroupCommonTrackingUrls =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupCommonTrackingUrlsImpression", "impression")
      , ("adGroupCommonTrackingUrlsClick", "click")
      , ("adGroupCommonTrackingUrlsEngagement", "engagement")
      , ("adGroupCommonTrackingUrlsBuyableUnderscorebutton", "buyable_button")
      , ("adGroupCommonTrackingUrlsAudienceUnderscoreverification", "audience_verification")
      ]


-- | 
data AdGroupCreateRequest = AdGroupCreateRequest
  { adGroupCreateRequestName :: Text -- ^ Ad group name.
  , adGroupCreateRequestStatus :: Maybe EntityStatus -- ^ Ad group/entity status.
  , adGroupCreateRequestBudgetUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  , adGroupCreateRequestBidUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  , adGroupCreateRequestOptimizationUnderscoregoalUnderscoremetadata :: Maybe AdGroupCommonOptimizationGoalMetadata -- ^ 
  , adGroupCreateRequestBudgetUnderscoretype :: Maybe BudgetType -- ^ 
  , adGroupCreateRequestStartUnderscoretime :: Maybe Int -- ^ Ad group start time. Unix timestamp in seconds. Defaults to current time.
  , adGroupCreateRequestEndUnderscoretime :: Maybe Int -- ^ Ad group end time. Unix timestamp in seconds.
  , adGroupCreateRequestTargetingUnderscorespec :: Maybe TargetingSpec -- ^ 
  , adGroupCreateRequestLifetimeUnderscorefrequencyUnderscorecap :: Maybe Int -- ^ Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  , adGroupCreateRequestTrackingUnderscoreurls :: Maybe AdGroupCommonTrackingUrls -- ^ 
  , adGroupCreateRequestAutoUnderscoretargetingUnderscoreenabled :: Maybe Bool -- ^ Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  , adGroupCreateRequestPlacementUnderscoregroup :: Maybe PlacementGroupType -- ^ <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
  , adGroupCreateRequestPacingUnderscoredeliveryUnderscoretype :: Maybe PacingDeliveryType -- ^ 
  , adGroupCreateRequestCampaignUnderscoreid :: Text -- ^ Campaign ID of the ad group.
  , adGroupCreateRequestBillableUnderscoreevent :: ActionType -- ^ 
  , adGroupCreateRequestBidUnderscorestrategyUnderscoretype :: Maybe Text -- ^ Bid strategy type
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupCreateRequest where
  parseJSON = genericParseJSON optionsAdGroupCreateRequest
instance ToJSON AdGroupCreateRequest where
  toJSON = genericToJSON optionsAdGroupCreateRequest

optionsAdGroupCreateRequest :: Options
optionsAdGroupCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupCreateRequestName", "name")
      , ("adGroupCreateRequestStatus", "status")
      , ("adGroupCreateRequestBudgetUnderscoreinUnderscoremicroUnderscorecurrency", "budget_in_micro_currency")
      , ("adGroupCreateRequestBidUnderscoreinUnderscoremicroUnderscorecurrency", "bid_in_micro_currency")
      , ("adGroupCreateRequestOptimizationUnderscoregoalUnderscoremetadata", "optimization_goal_metadata")
      , ("adGroupCreateRequestBudgetUnderscoretype", "budget_type")
      , ("adGroupCreateRequestStartUnderscoretime", "start_time")
      , ("adGroupCreateRequestEndUnderscoretime", "end_time")
      , ("adGroupCreateRequestTargetingUnderscorespec", "targeting_spec")
      , ("adGroupCreateRequestLifetimeUnderscorefrequencyUnderscorecap", "lifetime_frequency_cap")
      , ("adGroupCreateRequestTrackingUnderscoreurls", "tracking_urls")
      , ("adGroupCreateRequestAutoUnderscoretargetingUnderscoreenabled", "auto_targeting_enabled")
      , ("adGroupCreateRequestPlacementUnderscoregroup", "placement_group")
      , ("adGroupCreateRequestPacingUnderscoredeliveryUnderscoretype", "pacing_delivery_type")
      , ("adGroupCreateRequestCampaignUnderscoreid", "campaign_id")
      , ("adGroupCreateRequestBillableUnderscoreevent", "billable_event")
      , ("adGroupCreateRequestBidUnderscorestrategyUnderscoretype", "bid_strategy_type")
      ]


-- | 
data AdGroupResponse = AdGroupResponse
  { adGroupResponseName :: Maybe Text -- ^ Ad group name.
  , adGroupResponseStatus :: Maybe EntityStatus -- ^ Ad group/entity status.
  , adGroupResponseBudgetUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  , adGroupResponseBidUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  , adGroupResponseOptimizationUnderscoregoalUnderscoremetadata :: Maybe AdGroupCommonOptimizationGoalMetadata -- ^ 
  , adGroupResponseBudgetUnderscoretype :: Maybe BudgetType -- ^ 
  , adGroupResponseStartUnderscoretime :: Maybe Int -- ^ Ad group start time. Unix timestamp in seconds. Defaults to current time.
  , adGroupResponseEndUnderscoretime :: Maybe Int -- ^ Ad group end time. Unix timestamp in seconds.
  , adGroupResponseTargetingUnderscorespec :: Maybe TargetingSpec -- ^ 
  , adGroupResponseLifetimeUnderscorefrequencyUnderscorecap :: Maybe Int -- ^ Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  , adGroupResponseTrackingUnderscoreurls :: Maybe AdGroupCommonTrackingUrls -- ^ 
  , adGroupResponseAutoUnderscoretargetingUnderscoreenabled :: Maybe Bool -- ^ Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  , adGroupResponsePlacementUnderscoregroup :: Maybe PlacementGroupType -- ^ <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
  , adGroupResponsePacingUnderscoredeliveryUnderscoretype :: Maybe PacingDeliveryType -- ^ 
  , adGroupResponseCampaignUnderscoreid :: Maybe Text -- ^ Campaign ID of the ad group.
  , adGroupResponseBillableUnderscoreevent :: Maybe ActionType -- ^ 
  , adGroupResponseBidUnderscorestrategyUnderscoretype :: Maybe Text -- ^ Bid strategy type
  , adGroupResponseId :: Maybe Text -- ^ Ad group ID.
  , adGroupResponseAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Advertiser ID.
  , adGroupResponseCreatedUnderscoretime :: Maybe Int -- ^ Ad group creation time. Unix timestamp in seconds.
  , adGroupResponseUpdatedUnderscoretime :: Maybe Int -- ^ Ad group last update time. Unix timestamp in seconds.
  , adGroupResponseType :: Maybe Text -- ^ Always \"adgroup\".
  , adGroupResponseConversionUnderscorelearningUnderscoremodeUnderscoretype :: Maybe Text -- ^ oCPM learn mode
  , adGroupResponseSummaryUnderscorestatus :: Maybe AdGroupSummaryStatus -- ^ Ad group summary status.
  , adGroupResponseFeedUnderscoreprofileUnderscoreid :: Maybe Text -- ^ Feed Profile ID associated to the adgroup.
  , adGroupResponseDcaUnderscoreassets :: Maybe Value -- ^ [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupResponse where
  parseJSON = genericParseJSON optionsAdGroupResponse
instance ToJSON AdGroupResponse where
  toJSON = genericToJSON optionsAdGroupResponse

optionsAdGroupResponse :: Options
optionsAdGroupResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupResponseName", "name")
      , ("adGroupResponseStatus", "status")
      , ("adGroupResponseBudgetUnderscoreinUnderscoremicroUnderscorecurrency", "budget_in_micro_currency")
      , ("adGroupResponseBidUnderscoreinUnderscoremicroUnderscorecurrency", "bid_in_micro_currency")
      , ("adGroupResponseOptimizationUnderscoregoalUnderscoremetadata", "optimization_goal_metadata")
      , ("adGroupResponseBudgetUnderscoretype", "budget_type")
      , ("adGroupResponseStartUnderscoretime", "start_time")
      , ("adGroupResponseEndUnderscoretime", "end_time")
      , ("adGroupResponseTargetingUnderscorespec", "targeting_spec")
      , ("adGroupResponseLifetimeUnderscorefrequencyUnderscorecap", "lifetime_frequency_cap")
      , ("adGroupResponseTrackingUnderscoreurls", "tracking_urls")
      , ("adGroupResponseAutoUnderscoretargetingUnderscoreenabled", "auto_targeting_enabled")
      , ("adGroupResponsePlacementUnderscoregroup", "placement_group")
      , ("adGroupResponsePacingUnderscoredeliveryUnderscoretype", "pacing_delivery_type")
      , ("adGroupResponseCampaignUnderscoreid", "campaign_id")
      , ("adGroupResponseBillableUnderscoreevent", "billable_event")
      , ("adGroupResponseBidUnderscorestrategyUnderscoretype", "bid_strategy_type")
      , ("adGroupResponseId", "id")
      , ("adGroupResponseAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("adGroupResponseCreatedUnderscoretime", "created_time")
      , ("adGroupResponseUpdatedUnderscoretime", "updated_time")
      , ("adGroupResponseType", "type")
      , ("adGroupResponseConversionUnderscorelearningUnderscoremodeUnderscoretype", "conversion_learning_mode_type")
      , ("adGroupResponseSummaryUnderscorestatus", "summary_status")
      , ("adGroupResponseFeedUnderscoreprofileUnderscoreid", "feed_profile_id")
      , ("adGroupResponseDcaUnderscoreassets", "dca_assets")
      ]


-- | Summary status for ad group
data AdGroupSummaryStatus = AdGroupSummaryStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupSummaryStatus where
  parseJSON = genericParseJSON optionsAdGroupSummaryStatus
instance ToJSON AdGroupSummaryStatus where
  toJSON = genericToJSON optionsAdGroupSummaryStatus

optionsAdGroupSummaryStatus :: Options
optionsAdGroupSummaryStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data AdGroupUpdateRequest = AdGroupUpdateRequest
  { adGroupUpdateRequestName :: Maybe Text -- ^ Ad group name.
  , adGroupUpdateRequestStatus :: Maybe EntityStatus -- ^ Ad group/entity status.
  , adGroupUpdateRequestBudgetUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  , adGroupUpdateRequestBidUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  , adGroupUpdateRequestOptimizationUnderscoregoalUnderscoremetadata :: Maybe AdGroupCommonOptimizationGoalMetadata -- ^ 
  , adGroupUpdateRequestBudgetUnderscoretype :: Maybe BudgetType -- ^ 
  , adGroupUpdateRequestStartUnderscoretime :: Maybe Int -- ^ Ad group start time. Unix timestamp in seconds. Defaults to current time.
  , adGroupUpdateRequestEndUnderscoretime :: Maybe Int -- ^ Ad group end time. Unix timestamp in seconds.
  , adGroupUpdateRequestTargetingUnderscorespec :: Maybe TargetingSpec -- ^ 
  , adGroupUpdateRequestLifetimeUnderscorefrequencyUnderscorecap :: Maybe Int -- ^ Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  , adGroupUpdateRequestTrackingUnderscoreurls :: Maybe AdGroupCommonTrackingUrls -- ^ 
  , adGroupUpdateRequestAutoUnderscoretargetingUnderscoreenabled :: Maybe Bool -- ^ Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  , adGroupUpdateRequestPlacementUnderscoregroup :: Maybe PlacementGroupType -- ^ <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
  , adGroupUpdateRequestPacingUnderscoredeliveryUnderscoretype :: Maybe PacingDeliveryType -- ^ 
  , adGroupUpdateRequestCampaignUnderscoreid :: Maybe Text -- ^ Campaign ID of the ad group.
  , adGroupUpdateRequestBillableUnderscoreevent :: Maybe ActionType -- ^ 
  , adGroupUpdateRequestBidUnderscorestrategyUnderscoretype :: Maybe Text -- ^ Bid strategy type
  , adGroupUpdateRequestId :: Text -- ^ Ad group ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupUpdateRequest where
  parseJSON = genericParseJSON optionsAdGroupUpdateRequest
instance ToJSON AdGroupUpdateRequest where
  toJSON = genericToJSON optionsAdGroupUpdateRequest

optionsAdGroupUpdateRequest :: Options
optionsAdGroupUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupUpdateRequestName", "name")
      , ("adGroupUpdateRequestStatus", "status")
      , ("adGroupUpdateRequestBudgetUnderscoreinUnderscoremicroUnderscorecurrency", "budget_in_micro_currency")
      , ("adGroupUpdateRequestBidUnderscoreinUnderscoremicroUnderscorecurrency", "bid_in_micro_currency")
      , ("adGroupUpdateRequestOptimizationUnderscoregoalUnderscoremetadata", "optimization_goal_metadata")
      , ("adGroupUpdateRequestBudgetUnderscoretype", "budget_type")
      , ("adGroupUpdateRequestStartUnderscoretime", "start_time")
      , ("adGroupUpdateRequestEndUnderscoretime", "end_time")
      , ("adGroupUpdateRequestTargetingUnderscorespec", "targeting_spec")
      , ("adGroupUpdateRequestLifetimeUnderscorefrequencyUnderscorecap", "lifetime_frequency_cap")
      , ("adGroupUpdateRequestTrackingUnderscoreurls", "tracking_urls")
      , ("adGroupUpdateRequestAutoUnderscoretargetingUnderscoreenabled", "auto_targeting_enabled")
      , ("adGroupUpdateRequestPlacementUnderscoregroup", "placement_group")
      , ("adGroupUpdateRequestPacingUnderscoredeliveryUnderscoretype", "pacing_delivery_type")
      , ("adGroupUpdateRequestCampaignUnderscoreid", "campaign_id")
      , ("adGroupUpdateRequestBillableUnderscoreevent", "billable_event")
      , ("adGroupUpdateRequestBidUnderscorestrategyUnderscoretype", "bid_strategy_type")
      , ("adGroupUpdateRequestId", "id")
      ]


-- | 
newtype AdGroupsAnalyticsResponseInner = AdGroupsAnalyticsResponseInner { unAdGroupsAnalyticsResponseInner :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data AdGroupsList200Response = AdGroupsList200Response
  { adGroupsList200ResponseItems :: [AdGroupResponse] -- ^ 
  , adGroupsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupsList200Response where
  parseJSON = genericParseJSON optionsAdGroupsList200Response
instance ToJSON AdGroupsList200Response where
  toJSON = genericToJSON optionsAdGroupsList200Response

optionsAdGroupsList200Response :: Options
optionsAdGroupsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adGroupsList200ResponseItems", "items")
      , ("adGroupsList200ResponseBookmark", "bookmark")
      ]


-- | 
data AdPinId = AdPinId
  { adPinIdPinUnderscoreid :: Maybe Text -- ^ Pin ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AdPinId where
  parseJSON = genericParseJSON optionsAdPinId
instance ToJSON AdPinId where
  toJSON = genericToJSON optionsAdPinId

optionsAdPinId :: Options
optionsAdPinId =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adPinIdPinUnderscoreid", "pin_id")
      ]


-- | 
data AdPreviewCreateFromImage = AdPreviewCreateFromImage
  { adPreviewCreateFromImageImageUnderscoreurl :: Text -- ^ Image URL.
  , adPreviewCreateFromImageTitle :: Text -- ^ Title displayed below ad.
  } deriving (Show, Eq, Generic)

instance FromJSON AdPreviewCreateFromImage where
  parseJSON = genericParseJSON optionsAdPreviewCreateFromImage
instance ToJSON AdPreviewCreateFromImage where
  toJSON = genericToJSON optionsAdPreviewCreateFromImage

optionsAdPreviewCreateFromImage :: Options
optionsAdPreviewCreateFromImage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adPreviewCreateFromImageImageUnderscoreurl", "image_url")
      , ("adPreviewCreateFromImageTitle", "title")
      ]


-- | 
data AdPreviewCreateFromPin = AdPreviewCreateFromPin
  { adPreviewCreateFromPinPinUnderscoreid :: Text -- ^ Pin ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AdPreviewCreateFromPin where
  parseJSON = genericParseJSON optionsAdPreviewCreateFromPin
instance ToJSON AdPreviewCreateFromPin where
  toJSON = genericToJSON optionsAdPreviewCreateFromPin

optionsAdPreviewCreateFromPin :: Options
optionsAdPreviewCreateFromPin =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adPreviewCreateFromPinPinUnderscoreid", "pin_id")
      ]


-- | 
data AdPreviewRequest = AdPreviewRequest
  { adPreviewRequestImageUnderscoreurl :: Text -- ^ Image URL.
  , adPreviewRequestTitle :: Text -- ^ Title displayed below ad.
  , adPreviewRequestPinUnderscoreid :: Text -- ^ Pin ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AdPreviewRequest where
  parseJSON = genericParseJSON optionsAdPreviewRequest
instance ToJSON AdPreviewRequest where
  toJSON = genericToJSON optionsAdPreviewRequest

optionsAdPreviewRequest :: Options
optionsAdPreviewRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adPreviewRequestImageUnderscoreurl", "image_url")
      , ("adPreviewRequestTitle", "title")
      , ("adPreviewRequestPinUnderscoreid", "pin_id")
      ]


-- | 
data AdPreviewURLResponse = AdPreviewURLResponse
  { adPreviewURLResponseUrl :: Maybe Text -- ^ 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19'
  } deriving (Show, Eq, Generic)

instance FromJSON AdPreviewURLResponse where
  parseJSON = genericParseJSON optionsAdPreviewURLResponse
instance ToJSON AdPreviewURLResponse where
  toJSON = genericToJSON optionsAdPreviewURLResponse

optionsAdPreviewURLResponse :: Options
optionsAdPreviewURLResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adPreviewURLResponseUrl", "url")
      ]


-- | 
data AdResponse = AdResponse
  { adResponseAdUnderscoregroupUnderscoreid :: Maybe Text -- ^ ID of the ad group that contains the ad.
  , adResponseAndroidUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  , adResponseCarouselUnderscoreandroidUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on Android.
  , adResponseCarouselUnderscoredestinationUnderscoreurls :: Maybe [Text] -- ^ Comma-separated destination URLs for the carousel pin to promote.
  , adResponseCarouselUnderscoreiosUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on iOS.
  , adResponseClickUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking url for the ad clicks.
  , adResponseCreativeUnderscoretype :: Maybe CreativeType -- ^ 
  , adResponseDestinationUnderscoreurl :: Maybe Text -- ^ Destination URL.
  , adResponseIosUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  , adResponseIsUnderscorepinUnderscoredeleted :: Maybe Bool -- ^ Is original pin deleted?
  , adResponseIsUnderscoreremovable :: Maybe Bool -- ^ Is pin repinnable?
  , adResponseName :: Maybe Text -- ^ Name of the ad - 255 chars max.
  , adResponseStatus :: Maybe EntityStatus -- ^ 
  , adResponseTrackingUnderscoreurls :: Maybe AdCommonTrackingUrls -- ^ 
  , adResponseViewUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking URL for ad impressions.
  , adResponseLeadUnderscoreformUnderscoreid :: Maybe Text -- ^ Lead form ID for lead ad generation.
  , adResponseGridUnderscoreclickUnderscoretype :: Maybe GridClickType -- ^ 
  , adResponseCustomizableUnderscorectaUnderscoretype :: Maybe Text -- ^ Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
  , adResponseQuizUnderscorepinUnderscoredata :: Maybe AdCommonQuizPinData -- ^ 
  , adResponsePinUnderscoreid :: Maybe Text -- ^ Pin ID.
  , adResponseAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ The ID of the advertiser that this ad belongs to.
  , adResponseCampaignUnderscoreid :: Maybe Text -- ^ ID of the ad campaign that contains this ad.
  , adResponseCollectionUnderscoreitemsUnderscoredestinationUnderscoreurlUnderscoretemplate :: Maybe Text -- ^ Destination URL template for all items within a collections drawer.
  , adResponseCreatedUnderscoretime :: Maybe Int -- ^ Pin creation time. Unix timestamp in seconds.
  , adResponseId :: Maybe Text -- ^ The ID of this ad.
  , adResponseRejectedUnderscorereasons :: Maybe [Text] -- ^ Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  , adResponseRejectionUnderscorelabels :: Maybe [Text] -- ^ Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  , adResponseReviewUnderscorestatus :: Maybe Text -- ^ Ad review status
  , adResponseType :: Maybe Text -- ^ Always \"ad\".
  , adResponseUpdatedUnderscoretime :: Maybe Int -- ^ Last update time. Unix timestamp in seconds.
  , adResponseSummaryUnderscorestatus :: Maybe PinPromotionSummaryStatus -- ^ Ad summary status
  } deriving (Show, Eq, Generic)

instance FromJSON AdResponse where
  parseJSON = genericParseJSON optionsAdResponse
instance ToJSON AdResponse where
  toJSON = genericToJSON optionsAdResponse

optionsAdResponse :: Options
optionsAdResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adResponseAdUnderscoregroupUnderscoreid", "ad_group_id")
      , ("adResponseAndroidUnderscoredeepUnderscorelink", "android_deep_link")
      , ("adResponseCarouselUnderscoreandroidUnderscoredeepUnderscorelinks", "carousel_android_deep_links")
      , ("adResponseCarouselUnderscoredestinationUnderscoreurls", "carousel_destination_urls")
      , ("adResponseCarouselUnderscoreiosUnderscoredeepUnderscorelinks", "carousel_ios_deep_links")
      , ("adResponseClickUnderscoretrackingUnderscoreurl", "click_tracking_url")
      , ("adResponseCreativeUnderscoretype", "creative_type")
      , ("adResponseDestinationUnderscoreurl", "destination_url")
      , ("adResponseIosUnderscoredeepUnderscorelink", "ios_deep_link")
      , ("adResponseIsUnderscorepinUnderscoredeleted", "is_pin_deleted")
      , ("adResponseIsUnderscoreremovable", "is_removable")
      , ("adResponseName", "name")
      , ("adResponseStatus", "status")
      , ("adResponseTrackingUnderscoreurls", "tracking_urls")
      , ("adResponseViewUnderscoretrackingUnderscoreurl", "view_tracking_url")
      , ("adResponseLeadUnderscoreformUnderscoreid", "lead_form_id")
      , ("adResponseGridUnderscoreclickUnderscoretype", "grid_click_type")
      , ("adResponseCustomizableUnderscorectaUnderscoretype", "customizable_cta_type")
      , ("adResponseQuizUnderscorepinUnderscoredata", "quiz_pin_data")
      , ("adResponsePinUnderscoreid", "pin_id")
      , ("adResponseAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("adResponseCampaignUnderscoreid", "campaign_id")
      , ("adResponseCollectionUnderscoreitemsUnderscoredestinationUnderscoreurlUnderscoretemplate", "collection_items_destination_url_template")
      , ("adResponseCreatedUnderscoretime", "created_time")
      , ("adResponseId", "id")
      , ("adResponseRejectedUnderscorereasons", "rejected_reasons")
      , ("adResponseRejectionUnderscorelabels", "rejection_labels")
      , ("adResponseReviewUnderscorestatus", "review_status")
      , ("adResponseType", "type")
      , ("adResponseUpdatedUnderscoretime", "updated_time")
      , ("adResponseSummaryUnderscorestatus", "summary_status")
      ]


-- | 
data AdUpdateRequest = AdUpdateRequest
  { adUpdateRequestAdUnderscoregroupUnderscoreid :: Maybe Text -- ^ ID of the ad group that contains the ad.
  , adUpdateRequestAndroidUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  , adUpdateRequestCarouselUnderscoreandroidUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on Android.
  , adUpdateRequestCarouselUnderscoredestinationUnderscoreurls :: Maybe [Text] -- ^ Comma-separated destination URLs for the carousel pin to promote.
  , adUpdateRequestCarouselUnderscoreiosUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on iOS.
  , adUpdateRequestClickUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking url for the ad clicks.
  , adUpdateRequestCreativeUnderscoretype :: Maybe CreativeType -- ^ 
  , adUpdateRequestDestinationUnderscoreurl :: Maybe Text -- ^ Destination URL.
  , adUpdateRequestIosUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  , adUpdateRequestIsUnderscorepinUnderscoredeleted :: Maybe Bool -- ^ Is original pin deleted?
  , adUpdateRequestIsUnderscoreremovable :: Maybe Bool -- ^ Is pin repinnable?
  , adUpdateRequestName :: Maybe Text -- ^ Name of the ad - 255 chars max.
  , adUpdateRequestStatus :: Maybe EntityStatus -- ^ 
  , adUpdateRequestTrackingUnderscoreurls :: Maybe AdCommonTrackingUrls -- ^ 
  , adUpdateRequestViewUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking URL for ad impressions.
  , adUpdateRequestLeadUnderscoreformUnderscoreid :: Maybe Text -- ^ Lead form ID for lead ad generation.
  , adUpdateRequestGridUnderscoreclickUnderscoretype :: Maybe GridClickType -- ^ 
  , adUpdateRequestCustomizableUnderscorectaUnderscoretype :: Maybe Text -- ^ Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
  , adUpdateRequestQuizUnderscorepinUnderscoredata :: Maybe AdCommonQuizPinData -- ^ 
  , adUpdateRequestId :: Text -- ^ The ID of this ad.
  , adUpdateRequestPinUnderscoreid :: Maybe Text -- ^ Pin ID. This field may only be updated for draft ads.
  } deriving (Show, Eq, Generic)

instance FromJSON AdUpdateRequest where
  parseJSON = genericParseJSON optionsAdUpdateRequest
instance ToJSON AdUpdateRequest where
  toJSON = genericToJSON optionsAdUpdateRequest

optionsAdUpdateRequest :: Options
optionsAdUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adUpdateRequestAdUnderscoregroupUnderscoreid", "ad_group_id")
      , ("adUpdateRequestAndroidUnderscoredeepUnderscorelink", "android_deep_link")
      , ("adUpdateRequestCarouselUnderscoreandroidUnderscoredeepUnderscorelinks", "carousel_android_deep_links")
      , ("adUpdateRequestCarouselUnderscoredestinationUnderscoreurls", "carousel_destination_urls")
      , ("adUpdateRequestCarouselUnderscoreiosUnderscoredeepUnderscorelinks", "carousel_ios_deep_links")
      , ("adUpdateRequestClickUnderscoretrackingUnderscoreurl", "click_tracking_url")
      , ("adUpdateRequestCreativeUnderscoretype", "creative_type")
      , ("adUpdateRequestDestinationUnderscoreurl", "destination_url")
      , ("adUpdateRequestIosUnderscoredeepUnderscorelink", "ios_deep_link")
      , ("adUpdateRequestIsUnderscorepinUnderscoredeleted", "is_pin_deleted")
      , ("adUpdateRequestIsUnderscoreremovable", "is_removable")
      , ("adUpdateRequestName", "name")
      , ("adUpdateRequestStatus", "status")
      , ("adUpdateRequestTrackingUnderscoreurls", "tracking_urls")
      , ("adUpdateRequestViewUnderscoretrackingUnderscoreurl", "view_tracking_url")
      , ("adUpdateRequestLeadUnderscoreformUnderscoreid", "lead_form_id")
      , ("adUpdateRequestGridUnderscoreclickUnderscoretype", "grid_click_type")
      , ("adUpdateRequestCustomizableUnderscorectaUnderscoretype", "customizable_cta_type")
      , ("adUpdateRequestQuizUnderscorepinUnderscoredata", "quiz_pin_data")
      , ("adUpdateRequestId", "id")
      , ("adUpdateRequestPinUnderscoreid", "pin_id")
      ]


-- | 
data AdsAnalyticsCreateAsyncRequest = AdsAnalyticsCreateAsyncRequest
  { adsAnalyticsCreateAsyncRequestStartUnderscoredate :: Text -- ^ Metric report start date (UTC). Format: YYYY-MM-DD
  , adsAnalyticsCreateAsyncRequestEndUnderscoredate :: Text -- ^ Metric report end date (UTC). Format: YYYY-MM-DD
  , adsAnalyticsCreateAsyncRequestGranularity :: Granularity -- ^ TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  , adsAnalyticsCreateAsyncRequestClickUnderscorewindowUnderscoredays :: Maybe ConversionAttributionWindowDays -- ^ Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  , adsAnalyticsCreateAsyncRequestEngagementUnderscorewindowUnderscoredays :: Maybe ConversionAttributionWindowDays -- ^ Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  , adsAnalyticsCreateAsyncRequestViewUnderscorewindowUnderscoredays :: Maybe ConversionAttributionWindowDays -- ^ Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  , adsAnalyticsCreateAsyncRequestConversionUnderscorereportUnderscoretime :: Maybe ConversionReportTimeType -- ^ The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  , adsAnalyticsCreateAsyncRequestAttributionUnderscoretypes :: Maybe [ConversionReportAttributionType] -- ^ List of types of attribution for the conversion report
  , adsAnalyticsCreateAsyncRequestCampaignUnderscoreids :: Maybe [Text] -- ^ List of campaign ids
  , adsAnalyticsCreateAsyncRequestCampaignUnderscorestatuses :: Maybe [CampaignSummaryStatus] -- ^ List of status values for filtering
  , adsAnalyticsCreateAsyncRequestCampaignUnderscoreobjectiveUnderscoretypes :: Maybe [ObjectiveType] -- ^ List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
  , adsAnalyticsCreateAsyncRequestAdUnderscoregroupUnderscoreids :: Maybe [Text] -- ^ List of ad group ids
  , adsAnalyticsCreateAsyncRequestAdUnderscoregroupUnderscorestatuses :: Maybe [AdGroupSummaryStatus] -- ^ List of values for filtering
  , adsAnalyticsCreateAsyncRequestAdUnderscoreids :: Maybe [Text] -- ^ List of ad ids [This parameter is no supported for Product Item Level Reports]
  , adsAnalyticsCreateAsyncRequestAdUnderscorestatuses :: Maybe [PinPromotionSummaryStatus] -- ^ List of values for filtering [This parameter is not supported for Product Item Level Reports]
  , adsAnalyticsCreateAsyncRequestProductUnderscoregroupUnderscoreids :: Maybe [Text] -- ^ List of product group ids
  , adsAnalyticsCreateAsyncRequestProductUnderscoregroupUnderscorestatuses :: Maybe [ProductGroupSummaryStatus] -- ^ List of values for filtering
  , adsAnalyticsCreateAsyncRequestProductUnderscoreitemUnderscoreids :: Maybe [Text] -- ^ List of product item ids
  , adsAnalyticsCreateAsyncRequestTargetingUnderscoretypes :: Maybe [AdsAnalyticsTargetingType] -- ^ List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
  , adsAnalyticsCreateAsyncRequestMetricsUnderscorefilters :: Maybe [AdsAnalyticsMetricsFilter] -- ^ List of metrics filters
  , adsAnalyticsCreateAsyncRequestColumns :: [ReportingColumnAsync] -- ^ Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
  , adsAnalyticsCreateAsyncRequestLevel :: MetricsReportingLevel -- ^ Level of the report
  , adsAnalyticsCreateAsyncRequestReportUnderscoreformat :: Maybe DataOutputFormat -- ^ Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsCreateAsyncRequest where
  parseJSON = genericParseJSON optionsAdsAnalyticsCreateAsyncRequest
instance ToJSON AdsAnalyticsCreateAsyncRequest where
  toJSON = genericToJSON optionsAdsAnalyticsCreateAsyncRequest

optionsAdsAnalyticsCreateAsyncRequest :: Options
optionsAdsAnalyticsCreateAsyncRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adsAnalyticsCreateAsyncRequestStartUnderscoredate", "start_date")
      , ("adsAnalyticsCreateAsyncRequestEndUnderscoredate", "end_date")
      , ("adsAnalyticsCreateAsyncRequestGranularity", "granularity")
      , ("adsAnalyticsCreateAsyncRequestClickUnderscorewindowUnderscoredays", "click_window_days")
      , ("adsAnalyticsCreateAsyncRequestEngagementUnderscorewindowUnderscoredays", "engagement_window_days")
      , ("adsAnalyticsCreateAsyncRequestViewUnderscorewindowUnderscoredays", "view_window_days")
      , ("adsAnalyticsCreateAsyncRequestConversionUnderscorereportUnderscoretime", "conversion_report_time")
      , ("adsAnalyticsCreateAsyncRequestAttributionUnderscoretypes", "attribution_types")
      , ("adsAnalyticsCreateAsyncRequestCampaignUnderscoreids", "campaign_ids")
      , ("adsAnalyticsCreateAsyncRequestCampaignUnderscorestatuses", "campaign_statuses")
      , ("adsAnalyticsCreateAsyncRequestCampaignUnderscoreobjectiveUnderscoretypes", "campaign_objective_types")
      , ("adsAnalyticsCreateAsyncRequestAdUnderscoregroupUnderscoreids", "ad_group_ids")
      , ("adsAnalyticsCreateAsyncRequestAdUnderscoregroupUnderscorestatuses", "ad_group_statuses")
      , ("adsAnalyticsCreateAsyncRequestAdUnderscoreids", "ad_ids")
      , ("adsAnalyticsCreateAsyncRequestAdUnderscorestatuses", "ad_statuses")
      , ("adsAnalyticsCreateAsyncRequestProductUnderscoregroupUnderscoreids", "product_group_ids")
      , ("adsAnalyticsCreateAsyncRequestProductUnderscoregroupUnderscorestatuses", "product_group_statuses")
      , ("adsAnalyticsCreateAsyncRequestProductUnderscoreitemUnderscoreids", "product_item_ids")
      , ("adsAnalyticsCreateAsyncRequestTargetingUnderscoretypes", "targeting_types")
      , ("adsAnalyticsCreateAsyncRequestMetricsUnderscorefilters", "metrics_filters")
      , ("adsAnalyticsCreateAsyncRequestColumns", "columns")
      , ("adsAnalyticsCreateAsyncRequestLevel", "level")
      , ("adsAnalyticsCreateAsyncRequestReportUnderscoreformat", "report_format")
      ]


-- | 
data AdsAnalyticsCreateAsyncResponse = AdsAnalyticsCreateAsyncResponse
  { adsAnalyticsCreateAsyncResponseReportUnderscorestatus :: Maybe BulkReportingJobStatus -- ^ 
  , adsAnalyticsCreateAsyncResponseToken :: Maybe Text -- ^ 
  , adsAnalyticsCreateAsyncResponseMessage :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsCreateAsyncResponse where
  parseJSON = genericParseJSON optionsAdsAnalyticsCreateAsyncResponse
instance ToJSON AdsAnalyticsCreateAsyncResponse where
  toJSON = genericToJSON optionsAdsAnalyticsCreateAsyncResponse

optionsAdsAnalyticsCreateAsyncResponse :: Options
optionsAdsAnalyticsCreateAsyncResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adsAnalyticsCreateAsyncResponseReportUnderscorestatus", "report_status")
      , ("adsAnalyticsCreateAsyncResponseToken", "token")
      , ("adsAnalyticsCreateAsyncResponseMessage", "message")
      ]


-- | Reporting columns for sync reporting data filter
data AdsAnalyticsFilterColumn = AdsAnalyticsFilterColumn
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsFilterColumn where
  parseJSON = genericParseJSON optionsAdsAnalyticsFilterColumn
instance ToJSON AdsAnalyticsFilterColumn where
  toJSON = genericToJSON optionsAdsAnalyticsFilterColumn

optionsAdsAnalyticsFilterColumn :: Options
optionsAdsAnalyticsFilterColumn =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Filter operator for sync reporting
data AdsAnalyticsFilterOperator = AdsAnalyticsFilterOperator
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsFilterOperator where
  parseJSON = genericParseJSON optionsAdsAnalyticsFilterOperator
instance ToJSON AdsAnalyticsFilterOperator where
  toJSON = genericToJSON optionsAdsAnalyticsFilterOperator

optionsAdsAnalyticsFilterOperator :: Options
optionsAdsAnalyticsFilterOperator =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data AdsAnalyticsGetAsyncResponse = AdsAnalyticsGetAsyncResponse
  { adsAnalyticsGetAsyncResponseReportUnderscorestatus :: Maybe BulkReportingJobStatus -- ^ 
  , adsAnalyticsGetAsyncResponseUrl :: Maybe Text -- ^ 
  , adsAnalyticsGetAsyncResponseSize :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsGetAsyncResponse where
  parseJSON = genericParseJSON optionsAdsAnalyticsGetAsyncResponse
instance ToJSON AdsAnalyticsGetAsyncResponse where
  toJSON = genericToJSON optionsAdsAnalyticsGetAsyncResponse

optionsAdsAnalyticsGetAsyncResponse :: Options
optionsAdsAnalyticsGetAsyncResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adsAnalyticsGetAsyncResponseReportUnderscorestatus", "report_status")
      , ("adsAnalyticsGetAsyncResponseUrl", "url")
      , ("adsAnalyticsGetAsyncResponseSize", "size")
      ]


-- | 
data AdsAnalyticsMetricsFilter = AdsAnalyticsMetricsFilter
  { adsAnalyticsMetricsFilterField :: AdsAnalyticsFilterColumn -- ^ 
  , adsAnalyticsMetricsFilterOperator :: AdsAnalyticsFilterOperator -- ^ 
  , adsAnalyticsMetricsFilterValues :: [Double] -- ^ List of values for filtering
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsMetricsFilter where
  parseJSON = genericParseJSON optionsAdsAnalyticsMetricsFilter
instance ToJSON AdsAnalyticsMetricsFilter where
  toJSON = genericToJSON optionsAdsAnalyticsMetricsFilter

optionsAdsAnalyticsMetricsFilter :: Options
optionsAdsAnalyticsMetricsFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adsAnalyticsMetricsFilterField", "field")
      , ("adsAnalyticsMetricsFilterOperator", "operator")
      , ("adsAnalyticsMetricsFilterValues", "values")
      ]


-- | 
newtype AdsAnalyticsResponseInner = AdsAnalyticsResponseInner { unAdsAnalyticsResponseInner :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | Reporting targeting type
data AdsAnalyticsTargetingType = AdsAnalyticsTargetingType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsTargetingType where
  parseJSON = genericParseJSON optionsAdsAnalyticsTargetingType
instance ToJSON AdsAnalyticsTargetingType where
  toJSON = genericToJSON optionsAdsAnalyticsTargetingType

optionsAdsAnalyticsTargetingType :: Options
optionsAdsAnalyticsTargetingType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data AdsCreditDiscountsResponse = AdsCreditDiscountsResponse
  { adsCreditDiscountsResponseActive :: Maybe Bool -- ^ True if the offer code is currently active.
  , adsCreditDiscountsResponseAdvertiserUnderscoreid :: Maybe Text -- ^ Advertiser ID the offer was applied to.
  , adsCreditDiscountsResponseDiscountType :: Maybe Text -- ^ The type of discount of this credit
  , adsCreditDiscountsResponseDiscountInMicroCurrency :: Maybe Double -- ^ The discount applied in the offer’s currency value.
  , adsCreditDiscountsResponseDiscountCurrency :: Maybe Text -- ^ Currency value for the discount.
  , adsCreditDiscountsResponseTitle :: Maybe Text -- ^ Human readable title of the offer code.
  , adsCreditDiscountsResponseRemainingDiscountInMicroCurrency :: Maybe Double -- ^ The credits left to spend.
  } deriving (Show, Eq, Generic)

instance FromJSON AdsCreditDiscountsResponse where
  parseJSON = genericParseJSON optionsAdsCreditDiscountsResponse
instance ToJSON AdsCreditDiscountsResponse where
  toJSON = genericToJSON optionsAdsCreditDiscountsResponse

optionsAdsCreditDiscountsResponse :: Options
optionsAdsCreditDiscountsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adsCreditDiscountsResponseActive", "active")
      , ("adsCreditDiscountsResponseAdvertiserUnderscoreid", "advertiser_id")
      , ("adsCreditDiscountsResponseDiscountType", "discountType")
      , ("adsCreditDiscountsResponseDiscountInMicroCurrency", "discountInMicroCurrency")
      , ("adsCreditDiscountsResponseDiscountCurrency", "discountCurrency")
      , ("adsCreditDiscountsResponseTitle", "title")
      , ("adsCreditDiscountsResponseRemainingDiscountInMicroCurrency", "remainingDiscountInMicroCurrency")
      ]


-- | 
data AdsCreditRedeemRequest = AdsCreditRedeemRequest
  { adsCreditRedeemRequestOfferCodeHash :: Text -- ^ Takes in a SHA256 hash of the offerCode.
  , adsCreditRedeemRequestValidateOnly :: Bool -- ^ If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
  } deriving (Show, Eq, Generic)

instance FromJSON AdsCreditRedeemRequest where
  parseJSON = genericParseJSON optionsAdsCreditRedeemRequest
instance ToJSON AdsCreditRedeemRequest where
  toJSON = genericToJSON optionsAdsCreditRedeemRequest

optionsAdsCreditRedeemRequest :: Options
optionsAdsCreditRedeemRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adsCreditRedeemRequestOfferCodeHash", "offerCodeHash")
      , ("adsCreditRedeemRequestValidateOnly", "validateOnly")
      ]


-- | 
data AdsCreditRedeemResponse = AdsCreditRedeemResponse
  { adsCreditRedeemResponseSuccess :: Maybe Bool -- ^ Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
  , adsCreditRedeemResponseErrorCode :: Maybe Int -- ^ Error code type if error occurs
  , adsCreditRedeemResponseErrorMessage :: Maybe Text -- ^ Reason for failure
  } deriving (Show, Eq, Generic)

instance FromJSON AdsCreditRedeemResponse where
  parseJSON = genericParseJSON optionsAdsCreditRedeemResponse
instance ToJSON AdsCreditRedeemResponse where
  toJSON = genericToJSON optionsAdsCreditRedeemResponse

optionsAdsCreditRedeemResponse :: Options
optionsAdsCreditRedeemResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adsCreditRedeemResponseSuccess", "success")
      , ("adsCreditRedeemResponseErrorCode", "errorCode")
      , ("adsCreditRedeemResponseErrorMessage", "errorMessage")
      ]


-- | 
data AdsCreditsDiscountsGet200Response = AdsCreditsDiscountsGet200Response
  { adsCreditsDiscountsGet200ResponseItems :: [AdsCreditDiscountsResponse] -- ^ 
  , adsCreditsDiscountsGet200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsCreditsDiscountsGet200Response where
  parseJSON = genericParseJSON optionsAdsCreditsDiscountsGet200Response
instance ToJSON AdsCreditsDiscountsGet200Response where
  toJSON = genericToJSON optionsAdsCreditsDiscountsGet200Response

optionsAdsCreditsDiscountsGet200Response :: Options
optionsAdsCreditsDiscountsGet200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adsCreditsDiscountsGet200ResponseItems", "items")
      , ("adsCreditsDiscountsGet200ResponseBookmark", "bookmark")
      ]


-- | 
data AdsList200Response = AdsList200Response
  { adsList200ResponseItems :: [AdResponse] -- ^ 
  , adsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsList200Response where
  parseJSON = genericParseJSON optionsAdsList200Response
instance ToJSON AdsList200Response where
  toJSON = genericToJSON optionsAdsList200Response

optionsAdsList200Response :: Options
optionsAdsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adsList200ResponseItems", "items")
      , ("adsList200ResponseBookmark", "bookmark")
      ]


-- | 
data AnalyticsDailyMetrics = AnalyticsDailyMetrics
  { analyticsDailyMetricsDataUnderscorestatus :: Maybe DataStatus -- ^ 
  , analyticsDailyMetricsDate :: Maybe Text -- ^ Metrics date (UTC): YYYY-MM-DD.
  , analyticsDailyMetricsMetrics :: Maybe (Map.Map String Double) -- ^ The metric name and daily value for each requested metric
  } deriving (Show, Eq, Generic)

instance FromJSON AnalyticsDailyMetrics where
  parseJSON = genericParseJSON optionsAnalyticsDailyMetrics
instance ToJSON AnalyticsDailyMetrics where
  toJSON = genericToJSON optionsAnalyticsDailyMetrics

optionsAnalyticsDailyMetrics :: Options
optionsAnalyticsDailyMetrics =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("analyticsDailyMetricsDataUnderscorestatus", "data_status")
      , ("analyticsDailyMetricsDate", "date")
      , ("analyticsDailyMetricsMetrics", "metrics")
      ]


-- | 
data AnalyticsMetricsResponse = AnalyticsMetricsResponse
  { analyticsMetricsResponseSummaryUnderscoremetrics :: Maybe (Map.Map String Double) -- ^ The metric name and value over the requested period for each requested metric
  , analyticsMetricsResponseDailyUnderscoremetrics :: Maybe [AnalyticsDailyMetrics] -- ^ Array with the requested daily metric records
  } deriving (Show, Eq, Generic)

instance FromJSON AnalyticsMetricsResponse where
  parseJSON = genericParseJSON optionsAnalyticsMetricsResponse
instance ToJSON AnalyticsMetricsResponse where
  toJSON = genericToJSON optionsAnalyticsMetricsResponse

optionsAnalyticsMetricsResponse :: Options
optionsAnalyticsMetricsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("analyticsMetricsResponseSummaryUnderscoremetrics", "summary_metrics")
      , ("analyticsMetricsResponseDailyUnderscoremetrics", "daily_metrics")
      ]


-- | 
data Audience = Audience
  { audienceAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Ad account ID.
  , audienceId :: Maybe Text -- ^ Audience ID.
  , audienceName :: Maybe Text -- ^ Audience name.
  , audienceAudienceUnderscoretype :: Maybe Text -- ^ <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  , audienceDescription :: Maybe Text -- ^ Audience description.
  , audienceRule :: Maybe AudienceRule -- ^ 
  , audienceSize :: Maybe Int -- ^ Audience size.
  , audienceStatus :: Maybe Text -- ^ Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
  , audienceType :: Maybe Text -- ^ Always \"audience\".
  , audienceCreatedUnderscoretimestamp :: Maybe Int -- ^ Creation time. Unix timestamp in seconds.
  , audienceUpdatedUnderscoretimestamp :: Maybe Int -- ^ Last update time. Unix timestamp in seconds.
  } deriving (Show, Eq, Generic)

instance FromJSON Audience where
  parseJSON = genericParseJSON optionsAudience
instance ToJSON Audience where
  toJSON = genericToJSON optionsAudience

optionsAudience :: Options
optionsAudience =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("audienceId", "id")
      , ("audienceName", "name")
      , ("audienceAudienceUnderscoretype", "audience_type")
      , ("audienceDescription", "description")
      , ("audienceRule", "rule")
      , ("audienceSize", "size")
      , ("audienceStatus", "status")
      , ("audienceType", "type")
      , ("audienceCreatedUnderscoretimestamp", "created_timestamp")
      , ("audienceUpdatedUnderscoretimestamp", "updated_timestamp")
      ]


-- | 
data AudienceCategory = AudienceCategory
  { audienceCategoryKey :: Maybe Text -- ^ Interest unique key (same as ID).
  , audienceCategoryName :: Maybe Text -- ^ Interest name.
  , audienceCategoryRatio :: Maybe Double -- ^ Interest's percent of category's total audience.
  , audienceCategoryIndex :: Maybe Double -- ^ Interest affinity index.
  , audienceCategoryId :: Maybe Text -- ^ Interest ID.
  , audienceCategorySubcategories :: Maybe [AudienceSubcategory] -- ^ Subcategory interest distribution
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceCategory where
  parseJSON = genericParseJSON optionsAudienceCategory
instance ToJSON AudienceCategory where
  toJSON = genericToJSON optionsAudienceCategory

optionsAudienceCategory :: Options
optionsAudienceCategory =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceCategoryKey", "key")
      , ("audienceCategoryName", "name")
      , ("audienceCategoryRatio", "ratio")
      , ("audienceCategoryIndex", "index")
      , ("audienceCategoryId", "id")
      , ("audienceCategorySubcategories", "subcategories")
      ]


-- | 
data AudienceCommon = AudienceCommon
  { audienceCommonAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Ad account ID.
  , audienceCommonName :: Maybe Text -- ^ Audience name.
  , audienceCommonRule :: Maybe AudienceRule -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceCommon where
  parseJSON = genericParseJSON optionsAudienceCommon
instance ToJSON AudienceCommon where
  toJSON = genericToJSON optionsAudienceCommon

optionsAudienceCommon :: Options
optionsAudienceCommon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceCommonAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("audienceCommonName", "name")
      , ("audienceCommonRule", "rule")
      ]


-- | 
data AudienceCreateCustomRequest = AudienceCreateCustomRequest
  { audienceCreateCustomRequestAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Ad account ID.
  , audienceCreateCustomRequestName :: Text -- ^ Audience name.
  , audienceCreateCustomRequestRule :: AudienceRule -- ^ 
  , audienceCreateCustomRequestSharingUnderscoretype :: AudienceSharingType -- ^ 
  , audienceCreateCustomRequestDataUnderscoreparty :: AudienceDataParty -- ^ 
  , audienceCreateCustomRequestCategory :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceCreateCustomRequest where
  parseJSON = genericParseJSON optionsAudienceCreateCustomRequest
instance ToJSON AudienceCreateCustomRequest where
  toJSON = genericToJSON optionsAudienceCreateCustomRequest

optionsAudienceCreateCustomRequest :: Options
optionsAudienceCreateCustomRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceCreateCustomRequestAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("audienceCreateCustomRequestName", "name")
      , ("audienceCreateCustomRequestRule", "rule")
      , ("audienceCreateCustomRequestSharingUnderscoretype", "sharing_type")
      , ("audienceCreateCustomRequestDataUnderscoreparty", "data_party")
      , ("audienceCreateCustomRequestCategory", "category")
      ]


-- | 
data AudienceCreateRequest = AudienceCreateRequest
  { audienceCreateRequestAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Ad account ID.
  , audienceCreateRequestName :: Text -- ^ Audience name.
  , audienceCreateRequestRule :: AudienceRule -- ^ 
  , audienceCreateRequestDescription :: Maybe Text -- ^ Audience description.
  , audienceCreateRequestAudienceUnderscoretype :: AudienceCreateRequest1AudienceType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceCreateRequest where
  parseJSON = genericParseJSON optionsAudienceCreateRequest
instance ToJSON AudienceCreateRequest where
  toJSON = genericToJSON optionsAudienceCreateRequest

optionsAudienceCreateRequest :: Options
optionsAudienceCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceCreateRequestAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("audienceCreateRequestName", "name")
      , ("audienceCreateRequestRule", "rule")
      , ("audienceCreateRequestDescription", "description")
      , ("audienceCreateRequestAudienceUnderscoretype", "audience_type")
      ]


-- | 
data AudienceCreateRequest1AudienceType = AudienceCreateRequest1AudienceType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceCreateRequest1AudienceType where
  parseJSON = genericParseJSON optionsAudienceCreateRequest1AudienceType
instance ToJSON AudienceCreateRequest1AudienceType where
  toJSON = genericToJSON optionsAudienceCreateRequest1AudienceType

optionsAudienceCreateRequest1AudienceType :: Options
optionsAudienceCreateRequest1AudienceType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Whether the data is owned by the partner (1p) or by the data provider (3p)
data AudienceDataParty = AudienceDataParty
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceDataParty where
  parseJSON = genericParseJSON optionsAudienceDataParty
instance ToJSON AudienceDataParty where
  toJSON = genericToJSON optionsAudienceDataParty

optionsAudienceDataParty :: Options
optionsAudienceDataParty =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Queryable audience representation.
data AudienceDefinition = AudienceDefinition
  { audienceDefinitionDate :: Maybe Text -- ^ Generation date
  , audienceDefinitionType :: Maybe Text -- ^ Generated audience type to request.
  , audienceDefinitionScope :: Maybe Text -- ^ Generated audience scope to request.
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceDefinition where
  parseJSON = genericParseJSON optionsAudienceDefinition
instance ToJSON AudienceDefinition where
  toJSON = genericToJSON optionsAudienceDefinition

optionsAudienceDefinition :: Options
optionsAudienceDefinition =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceDefinitionDate", "date")
      , ("audienceDefinitionType", "type")
      , ("audienceDefinitionScope", "scope")
      ]


-- | 
data AudienceDefinitionResponse = AudienceDefinitionResponse
  { audienceDefinitionResponseItems :: Maybe [AudienceDefinition] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceDefinitionResponse where
  parseJSON = genericParseJSON optionsAudienceDefinitionResponse
instance ToJSON AudienceDefinitionResponse where
  toJSON = genericToJSON optionsAudienceDefinitionResponse

optionsAudienceDefinitionResponse :: Options
optionsAudienceDefinitionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceDefinitionResponseItems", "items")
      ]


-- | Demographic detail for a single audience demographic
data AudienceDemographicValue = AudienceDemographicValue
  { audienceDemographicValueKey :: Maybe Text -- ^ Unique key for demographic item
  , audienceDemographicValueName :: Maybe Text -- ^ Display name for demographic
  , audienceDemographicValueRatio :: Maybe Double -- ^ Value of demographic item as a percent of total audience
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceDemographicValue where
  parseJSON = genericParseJSON optionsAudienceDemographicValue
instance ToJSON AudienceDemographicValue where
  toJSON = genericToJSON optionsAudienceDemographicValue

optionsAudienceDemographicValue :: Options
optionsAudienceDemographicValue =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceDemographicValueKey", "key")
      , ("audienceDemographicValueName", "name")
      , ("audienceDemographicValueRatio", "ratio")
      ]


-- | Audience demographics
data AudienceDemographics = AudienceDemographics
  { audienceDemographicsAges :: Maybe [AudienceDemographicValue] -- ^ Ages distribution.
  , audienceDemographicsGenders :: Maybe [AudienceDemographicValue] -- ^ Gender distribution.
  , audienceDemographicsDevices :: Maybe [AudienceDemographicValue] -- ^ Device usage distribution.
  , audienceDemographicsMetros :: Maybe [AudienceDemographicValue] -- ^ Geographic metro area distribution.
  , audienceDemographicsCountries :: Maybe [AudienceDemographicValue] -- ^ Country area distribution.
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceDemographics where
  parseJSON = genericParseJSON optionsAudienceDemographics
instance ToJSON AudienceDemographics where
  toJSON = genericToJSON optionsAudienceDemographics

optionsAudienceDemographics :: Options
optionsAudienceDemographics =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceDemographicsAges", "ages")
      , ("audienceDemographicsGenders", "genders")
      , ("audienceDemographicsDevices", "devices")
      , ("audienceDemographicsMetros", "metros")
      , ("audienceDemographicsCountries", "countries")
      ]


-- | 
data AudienceInsightCategoryArrayResponse = AudienceInsightCategoryArrayResponse
  { audienceInsightCategoryArrayResponseItems :: Maybe [AudienceInsightCategoryCommon] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceInsightCategoryArrayResponse where
  parseJSON = genericParseJSON optionsAudienceInsightCategoryArrayResponse
instance ToJSON AudienceInsightCategoryArrayResponse where
  toJSON = genericToJSON optionsAudienceInsightCategoryArrayResponse

optionsAudienceInsightCategoryArrayResponse :: Options
optionsAudienceInsightCategoryArrayResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceInsightCategoryArrayResponseItems", "items")
      ]


-- | 
data AudienceInsightCategoryCommon = AudienceInsightCategoryCommon
  { audienceInsightCategoryCommonKey :: Maybe Text -- ^ 
  , audienceInsightCategoryCommonName :: Maybe Text -- ^ 
  , audienceInsightCategoryCommonRatio :: Maybe Double -- ^ 
  , audienceInsightCategoryCommonIndex :: Maybe Double -- ^ 
  , audienceInsightCategoryCommonId :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceInsightCategoryCommon where
  parseJSON = genericParseJSON optionsAudienceInsightCategoryCommon
instance ToJSON AudienceInsightCategoryCommon where
  toJSON = genericToJSON optionsAudienceInsightCategoryCommon

optionsAudienceInsightCategoryCommon :: Options
optionsAudienceInsightCategoryCommon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceInsightCategoryCommonKey", "key")
      , ("audienceInsightCategoryCommonName", "name")
      , ("audienceInsightCategoryCommonRatio", "ratio")
      , ("audienceInsightCategoryCommonIndex", "index")
      , ("audienceInsightCategoryCommonId", "id")
      ]


-- | 
data AudienceInsightType = AudienceInsightType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceInsightType where
  parseJSON = genericParseJSON optionsAudienceInsightType
instance ToJSON AudienceInsightType where
  toJSON = genericToJSON optionsAudienceInsightType

optionsAudienceInsightType :: Options
optionsAudienceInsightType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Audience interests and demographics.
data AudienceInsightsResponse = AudienceInsightsResponse
  { audienceInsightsResponseCategories :: Maybe [AudienceCategory] -- ^ Category interest distribution
  , audienceInsightsResponseDemographics :: Maybe AudienceDemographics -- ^ 
  , audienceInsightsResponseType :: Maybe AudienceInsightType -- ^ 
  , audienceInsightsResponseDate :: Maybe Text -- ^ Generation date
  , audienceInsightsResponseSize :: Maybe Int -- ^ Population count.
  , audienceInsightsResponseSizeUnderscoreisUnderscoreupperUnderscorebound :: Maybe Bool -- ^ Indicates whether the audience size has been rounded up to the next highest upper boundary.
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceInsightsResponse where
  parseJSON = genericParseJSON optionsAudienceInsightsResponse
instance ToJSON AudienceInsightsResponse where
  toJSON = genericToJSON optionsAudienceInsightsResponse

optionsAudienceInsightsResponse :: Options
optionsAudienceInsightsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceInsightsResponseCategories", "categories")
      , ("audienceInsightsResponseDemographics", "demographics")
      , ("audienceInsightsResponseType", "type")
      , ("audienceInsightsResponseDate", "date")
      , ("audienceInsightsResponseSize", "size")
      , ("audienceInsightsResponseSizeUnderscoreisUnderscoreupperUnderscorebound", "size_is_upper_bound")
      ]


-- | JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
data AudienceRule = AudienceRule
  { audienceRuleCountry :: Maybe Text -- ^ Valid countries include: \"US\", \"CA\", and \"GB\".
  , audienceRuleCustomerUnderscorelistUnderscoreid :: Maybe Text -- ^ Customer list ID. For CUSTOMER_LIST `audience_type`.
  , audienceRuleEngagementUnderscoredomain :: Maybe [Text] -- ^ The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
  , audienceRuleEngagementUnderscoretype :: Maybe Text -- ^ Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
  , audienceRuleEvent :: Maybe Text -- ^ A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
  , audienceRuleEventUnderscoredata :: Maybe PinterestTagEventData -- ^ 
  , audienceRulePercentage :: Maybe Int -- ^ Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
  , audienceRulePinUnderscoreid :: Maybe [Text] -- ^ IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
  , audienceRulePrefill :: Maybe Bool -- ^ Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
  , audienceRuleRetentionUnderscoredays :: Maybe Int -- ^ Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
  , audienceRuleSeedUnderscoreid :: Maybe [Text] -- ^ Audience ID(s). For ACTALIKE `audience_type`. 
  , audienceRuleUrl :: Maybe [Text] -- ^ Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
  , audienceRuleVisitorUnderscoresourceUnderscoreid :: Maybe Text -- ^ The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
  , audienceRuleEventUnderscoresource :: Maybe Object -- ^ Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
  , audienceRuleIngestionUnderscoresource :: Maybe Object -- ^ Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
  , audienceRuleEngagerUnderscoretype :: Maybe Int -- ^ Optional for ENGAGEMENT. Engager type value should be 1-2.
  , audienceRuleCampaignUnderscoreid :: Maybe [Text] -- ^ Campaign ID for engagement audience filter.
  , audienceRuleAdUnderscoreid :: Maybe [Text] -- ^ Ad ID for engagement audience filter.
  , audienceRuleObjectiveUnderscoretype :: Maybe [ObjectiveType] -- ^ Objective for engagement audience filter.
  , audienceRuleAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Ad account ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceRule where
  parseJSON = genericParseJSON optionsAudienceRule
instance ToJSON AudienceRule where
  toJSON = genericToJSON optionsAudienceRule

optionsAudienceRule :: Options
optionsAudienceRule =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceRuleCountry", "country")
      , ("audienceRuleCustomerUnderscorelistUnderscoreid", "customer_list_id")
      , ("audienceRuleEngagementUnderscoredomain", "engagement_domain")
      , ("audienceRuleEngagementUnderscoretype", "engagement_type")
      , ("audienceRuleEvent", "event")
      , ("audienceRuleEventUnderscoredata", "event_data")
      , ("audienceRulePercentage", "percentage")
      , ("audienceRulePinUnderscoreid", "pin_id")
      , ("audienceRulePrefill", "prefill")
      , ("audienceRuleRetentionUnderscoredays", "retention_days")
      , ("audienceRuleSeedUnderscoreid", "seed_id")
      , ("audienceRuleUrl", "url")
      , ("audienceRuleVisitorUnderscoresourceUnderscoreid", "visitor_source_id")
      , ("audienceRuleEventUnderscoresource", "event_source")
      , ("audienceRuleIngestionUnderscoresource", "ingestion_source")
      , ("audienceRuleEngagerUnderscoretype", "engager_type")
      , ("audienceRuleCampaignUnderscoreid", "campaign_id")
      , ("audienceRuleAdUnderscoreid", "ad_id")
      , ("audienceRuleObjectiveUnderscoretype", "objective_type")
      , ("audienceRuleAdUnderscoreaccountUnderscoreid", "ad_account_id")
      ]


-- | Audience sharing type: [\&quot;CUSTOM\&quot;, \&quot;SYNDICATED\&quot;]
data AudienceSharingType = AudienceSharingType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceSharingType where
  parseJSON = genericParseJSON optionsAudienceSharingType
instance ToJSON AudienceSharingType where
  toJSON = genericToJSON optionsAudienceSharingType

optionsAudienceSharingType :: Options
optionsAudienceSharingType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data AudienceSubcategory = AudienceSubcategory
  { audienceSubcategoryKey :: Maybe Text -- ^ Interest unique key (same as ID).
  , audienceSubcategoryName :: Maybe Text -- ^ Subinterest name.
  , audienceSubcategoryRatio :: Maybe Double -- ^ Subinterest's percent of category's total audience.
  , audienceSubcategoryIndex :: Maybe Double -- ^ Subinterest affinity index.
  , audienceSubcategoryId :: Maybe Text -- ^ Subinterest ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceSubcategory where
  parseJSON = genericParseJSON optionsAudienceSubcategory
instance ToJSON AudienceSubcategory where
  toJSON = genericToJSON optionsAudienceSubcategory

optionsAudienceSubcategory :: Options
optionsAudienceSubcategory =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceSubcategoryKey", "key")
      , ("audienceSubcategoryName", "name")
      , ("audienceSubcategoryRatio", "ratio")
      , ("audienceSubcategoryIndex", "index")
      , ("audienceSubcategoryId", "id")
      ]


-- | Audience type
data AudienceType = AudienceType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceType where
  parseJSON = genericParseJSON optionsAudienceType
instance ToJSON AudienceType where
  toJSON = genericToJSON optionsAudienceType

optionsAudienceType :: Options
optionsAudienceType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Audience operation type (update or remove).
data AudienceUpdateOperationType = AudienceUpdateOperationType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceUpdateOperationType where
  parseJSON = genericParseJSON optionsAudienceUpdateOperationType
instance ToJSON AudienceUpdateOperationType where
  toJSON = genericToJSON optionsAudienceUpdateOperationType

optionsAudienceUpdateOperationType :: Options
optionsAudienceUpdateOperationType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data AudienceUpdateRequest = AudienceUpdateRequest
  { audienceUpdateRequestAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Ad account ID.
  , audienceUpdateRequestName :: Maybe Text -- ^ Audience name.
  , audienceUpdateRequestRule :: Maybe AudienceRule -- ^ 
  , audienceUpdateRequestDescription :: Maybe Text -- ^ Audience description.
  , audienceUpdateRequestOperationUnderscoretype :: Maybe AudienceUpdateOperationType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AudienceUpdateRequest where
  parseJSON = genericParseJSON optionsAudienceUpdateRequest
instance ToJSON AudienceUpdateRequest where
  toJSON = genericToJSON optionsAudienceUpdateRequest

optionsAudienceUpdateRequest :: Options
optionsAudienceUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audienceUpdateRequestAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("audienceUpdateRequestName", "name")
      , ("audienceUpdateRequestRule", "rule")
      , ("audienceUpdateRequestDescription", "description")
      , ("audienceUpdateRequestOperationUnderscoretype", "operation_type")
      ]


-- | 
data AudiencesList200Response = AudiencesList200Response
  { audiencesList200ResponseItems :: [Audience] -- ^ 
  , audiencesList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AudiencesList200Response where
  parseJSON = genericParseJSON optionsAudiencesList200Response
instance ToJSON AudiencesList200Response where
  toJSON = genericToJSON optionsAudiencesList200Response

optionsAudiencesList200Response :: Options
optionsAudiencesList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("audiencesList200ResponseItems", "items")
      , ("audiencesList200ResponseBookmark", "bookmark")
      ]


-- | 
data AvailabilityFilter = AvailabilityFilter
  { availabilityFilterAVAILABILITY :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AvailabilityFilter where
  parseJSON = genericParseJSON optionsAvailabilityFilter
instance ToJSON AvailabilityFilter where
  toJSON = genericToJSON optionsAvailabilityFilter

optionsAvailabilityFilter :: Options
optionsAvailabilityFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("availabilityFilterAVAILABILITY", "AVAILABILITY")
      ]


-- | The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \&quot;Out of Stock\&quot;.
data BatchOperation = BatchOperation
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON BatchOperation where
  parseJSON = genericParseJSON optionsBatchOperation
instance ToJSON BatchOperation where
  toJSON = genericToJSON optionsBatchOperation

optionsBatchOperation :: Options
optionsBatchOperation =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | The status of the operation performed by the batch
data BatchOperationStatus = BatchOperationStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON BatchOperationStatus where
  parseJSON = genericParseJSON optionsBatchOperationStatus
instance ToJSON BatchOperationStatus where
  toJSON = genericToJSON optionsBatchOperationStatus

optionsBatchOperationStatus :: Options
optionsBatchOperationStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data BidFloor = BidFloor
  { bidFloorBidUnderscorefloors :: Maybe [Int] -- ^ A list of bid floors in micro currency. For example, [100000, 200000]
  , bidFloorType :: Maybe Text -- ^ Always the string 'bidfloor'
  } deriving (Show, Eq, Generic)

instance FromJSON BidFloor where
  parseJSON = genericParseJSON optionsBidFloor
instance ToJSON BidFloor where
  toJSON = genericToJSON optionsBidFloor

optionsBidFloor :: Options
optionsBidFloor =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bidFloorBidUnderscorefloors", "bid_floors")
      , ("bidFloorType", "type")
      ]


-- | 
data BidFloorRequest = BidFloorRequest
  { bidFloorRequestBidUnderscorefloorUnderscorespecs :: [BidFloorSpec] -- ^ 
  , bidFloorRequestTargetingUnderscorespec :: Maybe TargetingSpec -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BidFloorRequest where
  parseJSON = genericParseJSON optionsBidFloorRequest
instance ToJSON BidFloorRequest where
  toJSON = genericToJSON optionsBidFloorRequest

optionsBidFloorRequest :: Options
optionsBidFloorRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bidFloorRequestBidUnderscorefloorUnderscorespecs", "bid_floor_specs")
      , ("bidFloorRequestTargetingUnderscorespec", "targeting_spec")
      ]


-- | 
data BidFloorSpec = BidFloorSpec
  { bidFloorSpecCountries :: Maybe [Country] -- ^ 
  , bidFloorSpecCurrency :: Currency -- ^ 
  , bidFloorSpecObjectiveUnderscoretype :: Maybe ObjectiveType -- ^ 
  , bidFloorSpecBillableUnderscoreevent :: ActionType -- ^ 
  , bidFloorSpecOptimizationUnderscoregoalUnderscoremetadata :: Maybe OptimizationGoalMetadata -- ^ 
  , bidFloorSpecCreativeUnderscoretype :: Maybe CreativeType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BidFloorSpec where
  parseJSON = genericParseJSON optionsBidFloorSpec
instance ToJSON BidFloorSpec where
  toJSON = genericToJSON optionsBidFloorSpec

optionsBidFloorSpec :: Options
optionsBidFloorSpec =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bidFloorSpecCountries", "countries")
      , ("bidFloorSpecCurrency", "currency")
      , ("bidFloorSpecObjectiveUnderscoretype", "objective_type")
      , ("bidFloorSpecBillableUnderscoreevent", "billable_event")
      , ("bidFloorSpecOptimizationUnderscoregoalUnderscoremetadata", "optimization_goal_metadata")
      , ("bidFloorSpecCreativeUnderscoretype", "creative_type")
      ]


-- | 
data BillingProfilesGet200Response = BillingProfilesGet200Response
  { billingProfilesGet200ResponseItems :: [BillingProfilesResponse] -- ^ 
  , billingProfilesGet200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BillingProfilesGet200Response where
  parseJSON = genericParseJSON optionsBillingProfilesGet200Response
instance ToJSON BillingProfilesGet200Response where
  toJSON = genericToJSON optionsBillingProfilesGet200Response

optionsBillingProfilesGet200Response :: Options
optionsBillingProfilesGet200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("billingProfilesGet200ResponseItems", "items")
      , ("billingProfilesGet200ResponseBookmark", "bookmark")
      ]


-- | 
data BillingProfilesResponse = BillingProfilesResponse
  { billingProfilesResponseId :: Maybe Text -- ^ Billing ID.
  , billingProfilesResponseCardUnderscoretype :: Maybe Text -- ^ Type of the card.
  , billingProfilesResponseStatus :: Maybe Text -- ^ Status of the billing.
  , billingProfilesResponseAdvertiserUnderscoreid :: Maybe Text -- ^ Advertiser ID of the billing.
  , billingProfilesResponsePaymentUnderscoremethodUnderscorebrand :: Maybe Text -- ^ Brand of the payment method.
  } deriving (Show, Eq, Generic)

instance FromJSON BillingProfilesResponse where
  parseJSON = genericParseJSON optionsBillingProfilesResponse
instance ToJSON BillingProfilesResponse where
  toJSON = genericToJSON optionsBillingProfilesResponse

optionsBillingProfilesResponse :: Options
optionsBillingProfilesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("billingProfilesResponseId", "id")
      , ("billingProfilesResponseCardUnderscoretype", "card_type")
      , ("billingProfilesResponseStatus", "status")
      , ("billingProfilesResponseAdvertiserUnderscoreid", "advertiser_id")
      , ("billingProfilesResponsePaymentUnderscoremethodUnderscorebrand", "payment_method_brand")
      ]


-- | Board
data Board = Board
  { boardId :: Maybe Text -- ^ 
  , boardCreatedUnderscoreat :: Maybe UTCTime -- ^ Date and time of board creation.
  , boardBoardUnderscorepinsUnderscoremodifiedUnderscoreat :: Maybe UTCTime -- ^ Date and time of last board pins modified.
  , boardName :: Text -- ^ 
  , boardDescription :: Maybe Text -- ^ 
  , boardCollaboratorUnderscorecount :: Maybe Int -- ^ Count of collaborators on the board.
  , boardPinUnderscorecount :: Maybe Int -- ^ Count of pins on the board.
  , boardFollowerUnderscorecount :: Maybe Int -- ^ Board follower count.
  , boardMedia :: Maybe BoardMedia -- ^ 
  , boardOwner :: Maybe BoardOwner -- ^ 
  , boardPrivacy :: Maybe Text -- ^ Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
  } deriving (Show, Eq, Generic)

instance FromJSON Board where
  parseJSON = genericParseJSON optionsBoard
instance ToJSON Board where
  toJSON = genericToJSON optionsBoard

optionsBoard :: Options
optionsBoard =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("boardId", "id")
      , ("boardCreatedUnderscoreat", "created_at")
      , ("boardBoardUnderscorepinsUnderscoremodifiedUnderscoreat", "board_pins_modified_at")
      , ("boardName", "name")
      , ("boardDescription", "description")
      , ("boardCollaboratorUnderscorecount", "collaborator_count")
      , ("boardPinUnderscorecount", "pin_count")
      , ("boardFollowerUnderscorecount", "follower_count")
      , ("boardMedia", "media")
      , ("boardOwner", "owner")
      , ("boardPrivacy", "privacy")
      ]


-- | Board media.
data BoardMedia = BoardMedia
  { boardMediaImageUnderscorecoverUnderscoreurl :: Maybe Text -- ^ Board cover image.
  , boardMediaPinUnderscorethumbnailUnderscoreurls :: Maybe [Text] -- ^ Board pin thumbnail urls.
  } deriving (Show, Eq, Generic)

instance FromJSON BoardMedia where
  parseJSON = genericParseJSON optionsBoardMedia
instance ToJSON BoardMedia where
  toJSON = genericToJSON optionsBoardMedia

optionsBoardMedia :: Options
optionsBoardMedia =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("boardMediaImageUnderscorecoverUnderscoreurl", "image_cover_url")
      , ("boardMediaPinUnderscorethumbnailUnderscoreurls", "pin_thumbnail_urls")
      ]


-- | 
data BoardOwner = BoardOwner
  { boardOwnerUsername :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BoardOwner where
  parseJSON = genericParseJSON optionsBoardOwner
instance ToJSON BoardOwner where
  toJSON = genericToJSON optionsBoardOwner

optionsBoardOwner :: Options
optionsBoardOwner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("boardOwnerUsername", "username")
      ]


-- | Sections help organize pins within a board.
data BoardSection = BoardSection
  { boardSectionId :: Maybe Text -- ^ 
  , boardSectionName :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BoardSection where
  parseJSON = genericParseJSON optionsBoardSection
instance ToJSON BoardSection where
  toJSON = genericToJSON optionsBoardSection

optionsBoardSection :: Options
optionsBoardSection =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("boardSectionId", "id")
      , ("boardSectionName", "name")
      ]


-- | 
data BoardSectionsList200Response = BoardSectionsList200Response
  { boardSectionsList200ResponseItems :: [BoardSection] -- ^ Board sections
  , boardSectionsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BoardSectionsList200Response where
  parseJSON = genericParseJSON optionsBoardSectionsList200Response
instance ToJSON BoardSectionsList200Response where
  toJSON = genericToJSON optionsBoardSectionsList200Response

optionsBoardSectionsList200Response :: Options
optionsBoardSectionsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("boardSectionsList200ResponseItems", "items")
      , ("boardSectionsList200ResponseBookmark", "bookmark")
      ]


-- | Board fields for updates
data BoardUpdate = BoardUpdate
  { boardUpdateName :: Maybe Text -- ^ 
  , boardUpdateDescription :: Maybe Text -- ^ 
  , boardUpdatePrivacy :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BoardUpdate where
  parseJSON = genericParseJSON optionsBoardUpdate
instance ToJSON BoardUpdate where
  toJSON = genericToJSON optionsBoardUpdate

optionsBoardUpdate :: Options
optionsBoardUpdate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("boardUpdateName", "name")
      , ("boardUpdateDescription", "description")
      , ("boardUpdatePrivacy", "privacy")
      ]


-- | 
data BoardsList200Response = BoardsList200Response
  { boardsList200ResponseItems :: [Board] -- ^ Boards
  , boardsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BoardsList200Response where
  parseJSON = genericParseJSON optionsBoardsList200Response
instance ToJSON BoardsList200Response where
  toJSON = genericToJSON optionsBoardsList200Response

optionsBoardsList200Response :: Options
optionsBoardsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("boardsList200ResponseItems", "items")
      , ("boardsList200ResponseBookmark", "bookmark")
      ]


-- | 
data BoardsListPins200Response = BoardsListPins200Response
  { boardsListPins200ResponseItems :: [Pin] -- ^ Pins
  , boardsListPins200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BoardsListPins200Response where
  parseJSON = genericParseJSON optionsBoardsListPins200Response
instance ToJSON BoardsListPins200Response where
  toJSON = genericToJSON optionsBoardsListPins200Response

optionsBoardsListPins200Response :: Options
optionsBoardsListPins200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("boardsListPins200ResponseItems", "items")
      , ("boardsListPins200ResponseBookmark", "bookmark")
      ]


-- | 
data BoardsUserFollowsList200Response = BoardsUserFollowsList200Response
  { boardsUserFollowsList200ResponseItems :: [Board] -- ^ 
  , boardsUserFollowsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BoardsUserFollowsList200Response where
  parseJSON = genericParseJSON optionsBoardsUserFollowsList200Response
instance ToJSON BoardsUserFollowsList200Response where
  toJSON = genericToJSON optionsBoardsUserFollowsList200Response

optionsBoardsUserFollowsList200Response :: Options
optionsBoardsUserFollowsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("boardsUserFollowsList200ResponseItems", "items")
      , ("boardsUserFollowsList200ResponseBookmark", "bookmark")
      ]


-- | Creation fields
data BookClosedResponse = BookClosedResponse
  { bookClosedResponseConversionUnderscoremetricsUnderscoreready :: Maybe Bool -- ^ Are conversion metrics ready?
  , bookClosedResponseNonUnderscoreconversionUnderscoremetricsUnderscoreready :: Maybe Bool -- ^ Are non-conversion metrics ready?
  } deriving (Show, Eq, Generic)

instance FromJSON BookClosedResponse where
  parseJSON = genericParseJSON optionsBookClosedResponse
instance ToJSON BookClosedResponse where
  toJSON = genericToJSON optionsBookClosedResponse

optionsBookClosedResponse :: Options
optionsBookClosedResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bookClosedResponseConversionUnderscoremetricsUnderscoreready", "conversion_metrics_ready")
      , ("bookClosedResponseNonUnderscoreconversionUnderscoremetricsUnderscoreready", "non_conversion_metrics_ready")
      ]


-- | 
data BrandFilter = BrandFilter
  { brandFilterBRAND :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BrandFilter where
  parseJSON = genericParseJSON optionsBrandFilter
instance ToJSON BrandFilter where
  toJSON = genericToJSON optionsBrandFilter

optionsBrandFilter :: Options
optionsBrandFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("brandFilterBRAND", "BRAND")
      ]


-- | Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \&quot;CBO_ADGROUP\&quot; is allowed. For WEB_SESSIONS campaigns, only \&quot;LIFETIME\&quot; is allowed. For update, only draft ad groups may update budget type.
data BudgetType = BudgetType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON BudgetType where
  parseJSON = genericParseJSON optionsBudgetType
instance ToJSON BudgetType where
  toJSON = genericToJSON optionsBudgetType

optionsBudgetType :: Options
optionsBudgetType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Ad entities to get in bulk request.
data BulkDownloadRequest = BulkDownloadRequest
  { bulkDownloadRequestEntityUnderscoretypes :: Maybe [BulkEntityType] -- ^ All entity types specified will be downloaded. Fewer types result in faster downloads.
  , bulkDownloadRequestEntityUnderscoreids :: Maybe [Text] -- ^ All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
  , bulkDownloadRequestUpdatedUnderscoresince :: Maybe Text -- ^ Unix UTC timestamp to retrieve all entities that have changed since this time.
  , bulkDownloadRequestCampaignUnderscorefilter :: Maybe BulkDownloadRequestCampaignFilter -- ^ 
  , bulkDownloadRequestOutputUnderscoreformat :: Maybe BulkOutputFormat -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BulkDownloadRequest where
  parseJSON = genericParseJSON optionsBulkDownloadRequest
instance ToJSON BulkDownloadRequest where
  toJSON = genericToJSON optionsBulkDownloadRequest

optionsBulkDownloadRequest :: Options
optionsBulkDownloadRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bulkDownloadRequestEntityUnderscoretypes", "entity_types")
      , ("bulkDownloadRequestEntityUnderscoreids", "entity_ids")
      , ("bulkDownloadRequestUpdatedUnderscoresince", "updated_since")
      , ("bulkDownloadRequestCampaignUnderscorefilter", "campaign_filter")
      , ("bulkDownloadRequestOutputUnderscoreformat", "output_format")
      ]


-- | 
data BulkDownloadRequestCampaignFilter = BulkDownloadRequestCampaignFilter
  { bulkDownloadRequestCampaignFilterStartUnderscoretime :: Maybe Text -- ^ Unix UTC timestamp.
  , bulkDownloadRequestCampaignFilterEndUnderscoretime :: Maybe Text -- ^ Unix UTC timestamp.
  , bulkDownloadRequestCampaignFilterName :: Maybe Text -- ^ Campaign name
  , bulkDownloadRequestCampaignFilterCampaignUnderscorestatus :: Maybe [CampaignSummaryStatus] -- ^ 
  , bulkDownloadRequestCampaignFilterObjectiveUnderscoretype :: Maybe [ObjectiveType] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BulkDownloadRequestCampaignFilter where
  parseJSON = genericParseJSON optionsBulkDownloadRequestCampaignFilter
instance ToJSON BulkDownloadRequestCampaignFilter where
  toJSON = genericToJSON optionsBulkDownloadRequestCampaignFilter

optionsBulkDownloadRequestCampaignFilter :: Options
optionsBulkDownloadRequestCampaignFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bulkDownloadRequestCampaignFilterStartUnderscoretime", "start_time")
      , ("bulkDownloadRequestCampaignFilterEndUnderscoretime", "end_time")
      , ("bulkDownloadRequestCampaignFilterName", "name")
      , ("bulkDownloadRequestCampaignFilterCampaignUnderscorestatus", "campaign_status")
      , ("bulkDownloadRequestCampaignFilterObjectiveUnderscoretype", "objective_type")
      ]


-- | 
data BulkDownloadResponse = BulkDownloadResponse
  { bulkDownloadResponseRequestUnderscoreid :: Maybe Text -- ^ ID of the bulk request.
  } deriving (Show, Eq, Generic)

instance FromJSON BulkDownloadResponse where
  parseJSON = genericParseJSON optionsBulkDownloadResponse
instance ToJSON BulkDownloadResponse where
  toJSON = genericToJSON optionsBulkDownloadResponse

optionsBulkDownloadResponse :: Options
optionsBulkDownloadResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bulkDownloadResponseRequestUnderscoreid", "request_id")
      ]


-- | Refers ads entity type
data BulkEntityType = BulkEntityType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON BulkEntityType where
  parseJSON = genericParseJSON optionsBulkEntityType
instance ToJSON BulkEntityType where
  toJSON = genericToJSON optionsBulkEntityType

optionsBulkEntityType :: Options
optionsBulkEntityType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Bulk file output format
data BulkOutputFormat = BulkOutputFormat
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON BulkOutputFormat where
  parseJSON = genericParseJSON optionsBulkOutputFormat
instance ToJSON BulkOutputFormat where
  toJSON = genericToJSON optionsBulkOutputFormat

optionsBulkOutputFormat :: Options
optionsBulkOutputFormat =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Possible status for a bulk reporting job
data BulkReportingJobStatus = BulkReportingJobStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON BulkReportingJobStatus where
  parseJSON = genericParseJSON optionsBulkReportingJobStatus
instance ToJSON BulkReportingJobStatus where
  toJSON = genericToJSON optionsBulkReportingJobStatus

optionsBulkReportingJobStatus :: Options
optionsBulkReportingJobStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
data BulkUpsertRequest = BulkUpsertRequest
  { bulkUpsertRequestCreate :: Maybe BulkUpsertRequestCreate -- ^ 
  , bulkUpsertRequestUpdate :: Maybe BulkUpsertRequestUpdate -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BulkUpsertRequest where
  parseJSON = genericParseJSON optionsBulkUpsertRequest
instance ToJSON BulkUpsertRequest where
  toJSON = genericToJSON optionsBulkUpsertRequest

optionsBulkUpsertRequest :: Options
optionsBulkUpsertRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bulkUpsertRequestCreate", "create")
      , ("bulkUpsertRequestUpdate", "update")
      ]


-- | Request for creation of entities in bulk.
data BulkUpsertRequestCreate = BulkUpsertRequestCreate
  { bulkUpsertRequestCreateCampaigns :: Maybe [CampaignCreateRequest] -- ^ 
  , bulkUpsertRequestCreateAdUnderscoregroups :: Maybe [AdGroupCreateRequest] -- ^ 
  , bulkUpsertRequestCreateAds :: Maybe [AdCreateRequest] -- ^ 
  , bulkUpsertRequestCreateProductUnderscoregroups :: Maybe [ProductGroupPromotionCreateRequest] -- ^ 
  , bulkUpsertRequestCreateKeywords :: Maybe [KeywordsRequest] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BulkUpsertRequestCreate where
  parseJSON = genericParseJSON optionsBulkUpsertRequestCreate
instance ToJSON BulkUpsertRequestCreate where
  toJSON = genericToJSON optionsBulkUpsertRequestCreate

optionsBulkUpsertRequestCreate :: Options
optionsBulkUpsertRequestCreate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bulkUpsertRequestCreateCampaigns", "campaigns")
      , ("bulkUpsertRequestCreateAdUnderscoregroups", "ad_groups")
      , ("bulkUpsertRequestCreateAds", "ads")
      , ("bulkUpsertRequestCreateProductUnderscoregroups", "product_groups")
      , ("bulkUpsertRequestCreateKeywords", "keywords")
      ]


-- | Request for creation of entities in bulk.
data BulkUpsertRequestUpdate = BulkUpsertRequestUpdate
  { bulkUpsertRequestUpdateCampaigns :: Maybe [CampaignUpdateRequest] -- ^ 
  , bulkUpsertRequestUpdateAdUnderscoregroups :: Maybe [AdGroupUpdateRequest] -- ^ 
  , bulkUpsertRequestUpdateAds :: Maybe [AdUpdateRequest] -- ^ 
  , bulkUpsertRequestUpdateProductUnderscoregroups :: Maybe [ProductGroupPromotionUpdateRequest] -- ^ 
  , bulkUpsertRequestUpdateKeywords :: Maybe [KeywordUpdate] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BulkUpsertRequestUpdate where
  parseJSON = genericParseJSON optionsBulkUpsertRequestUpdate
instance ToJSON BulkUpsertRequestUpdate where
  toJSON = genericToJSON optionsBulkUpsertRequestUpdate

optionsBulkUpsertRequestUpdate :: Options
optionsBulkUpsertRequestUpdate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bulkUpsertRequestUpdateCampaigns", "campaigns")
      , ("bulkUpsertRequestUpdateAdUnderscoregroups", "ad_groups")
      , ("bulkUpsertRequestUpdateAds", "ads")
      , ("bulkUpsertRequestUpdateProductUnderscoregroups", "product_groups")
      , ("bulkUpsertRequestUpdateKeywords", "keywords")
      ]


-- | ID of the bulk request.
data BulkUpsertResponse = BulkUpsertResponse
  { bulkUpsertResponseRequestUnderscoreid :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BulkUpsertResponse where
  parseJSON = genericParseJSON optionsBulkUpsertResponse
instance ToJSON BulkUpsertResponse where
  toJSON = genericToJSON optionsBulkUpsertResponse

optionsBulkUpsertResponse :: Options
optionsBulkUpsertResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bulkUpsertResponseRequestUnderscoreid", "request_id")
      ]


-- | 
data BulkUpsertStatus = BulkUpsertStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON BulkUpsertStatus where
  parseJSON = genericParseJSON optionsBulkUpsertStatus
instance ToJSON BulkUpsertStatus where
  toJSON = genericToJSON optionsBulkUpsertStatus

optionsBulkUpsertStatus :: Options
optionsBulkUpsertStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | ID of the bulk request.
data BulkUpsertStatusResponse = BulkUpsertStatusResponse
  { bulkUpsertStatusResponseStatus :: Maybe BulkUpsertStatus -- ^ 
  , bulkUpsertStatusResponseResultUnderscoreurl :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BulkUpsertStatusResponse where
  parseJSON = genericParseJSON optionsBulkUpsertStatusResponse
instance ToJSON BulkUpsertStatusResponse where
  toJSON = genericToJSON optionsBulkUpsertStatusResponse

optionsBulkUpsertStatusResponse :: Options
optionsBulkUpsertStatusResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bulkUpsertStatusResponseStatus", "status")
      , ("bulkUpsertStatusResponseResultUnderscoreurl", "result_url")
      ]


-- | Permission role for business access.
data BusinessAccessRole = BusinessAccessRole
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON BusinessAccessRole where
  parseJSON = genericParseJSON optionsBusinessAccessRole
instance ToJSON BusinessAccessRole where
  toJSON = genericToJSON optionsBusinessAccessRole

optionsBusinessAccessRole :: Options
optionsBusinessAccessRole =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Campaign Data
data CampaignCommon = CampaignCommon
  { campaignCommonAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  , campaignCommonName :: Maybe Text -- ^ Campaign name.
  , campaignCommonStatus :: Maybe EntityStatus -- ^ 
  , campaignCommonLifetimeUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  , campaignCommonDailyUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  , campaignCommonOrderUnderscorelineUnderscoreid :: Maybe Text -- ^ Order line ID that appears on the invoice.
  , campaignCommonTrackingUnderscoreurls :: Maybe AdCommonTrackingUrls -- ^ 
  , campaignCommonStartUnderscoretime :: Maybe Int -- ^ Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignCommonEndUnderscoretime :: Maybe Int -- ^ Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignCommonSummaryUnderscorestatus :: Maybe CampaignSummaryStatus -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignCommon where
  parseJSON = genericParseJSON optionsCampaignCommon
instance ToJSON CampaignCommon where
  toJSON = genericToJSON optionsCampaignCommon

optionsCampaignCommon :: Options
optionsCampaignCommon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignCommonAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("campaignCommonName", "name")
      , ("campaignCommonStatus", "status")
      , ("campaignCommonLifetimeUnderscorespendUnderscorecap", "lifetime_spend_cap")
      , ("campaignCommonDailyUnderscorespendUnderscorecap", "daily_spend_cap")
      , ("campaignCommonOrderUnderscorelineUnderscoreid", "order_line_id")
      , ("campaignCommonTrackingUnderscoreurls", "tracking_urls")
      , ("campaignCommonStartUnderscoretime", "start_time")
      , ("campaignCommonEndUnderscoretime", "end_time")
      , ("campaignCommonSummaryUnderscorestatus", "summary_status")
      ]


-- | 
data CampaignCreateCommon = CampaignCreateCommon
  { campaignCreateCommonAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  , campaignCreateCommonName :: Maybe Text -- ^ Campaign name.
  , campaignCreateCommonStatus :: Maybe EntityStatus -- ^ 
  , campaignCreateCommonLifetimeUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  , campaignCreateCommonDailyUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  , campaignCreateCommonOrderUnderscorelineUnderscoreid :: Maybe Text -- ^ Order line ID that appears on the invoice.
  , campaignCreateCommonTrackingUnderscoreurls :: Maybe AdCommonTrackingUrls -- ^ 
  , campaignCreateCommonStartUnderscoretime :: Maybe Int -- ^ Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignCreateCommonEndUnderscoretime :: Maybe Int -- ^ Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignCreateCommonSummaryUnderscorestatus :: Maybe CampaignSummaryStatus -- ^ 
  , campaignCreateCommonIsUnderscoreflexibleUnderscoredailyUnderscorebudgets :: Maybe Bool -- ^ Determine if a campaign has flexible daily budgets setup.
  , campaignCreateCommonDefaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  , campaignCreateCommonIsUnderscoreautomatedUnderscorecampaign :: Maybe Bool -- ^ Specifies whether the campaign was created in the automated campaign flow
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignCreateCommon where
  parseJSON = genericParseJSON optionsCampaignCreateCommon
instance ToJSON CampaignCreateCommon where
  toJSON = genericToJSON optionsCampaignCreateCommon

optionsCampaignCreateCommon :: Options
optionsCampaignCreateCommon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignCreateCommonAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("campaignCreateCommonName", "name")
      , ("campaignCreateCommonStatus", "status")
      , ("campaignCreateCommonLifetimeUnderscorespendUnderscorecap", "lifetime_spend_cap")
      , ("campaignCreateCommonDailyUnderscorespendUnderscorecap", "daily_spend_cap")
      , ("campaignCreateCommonOrderUnderscorelineUnderscoreid", "order_line_id")
      , ("campaignCreateCommonTrackingUnderscoreurls", "tracking_urls")
      , ("campaignCreateCommonStartUnderscoretime", "start_time")
      , ("campaignCreateCommonEndUnderscoretime", "end_time")
      , ("campaignCreateCommonSummaryUnderscorestatus", "summary_status")
      , ("campaignCreateCommonIsUnderscoreflexibleUnderscoredailyUnderscorebudgets", "is_flexible_daily_budgets")
      , ("campaignCreateCommonDefaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency", "default_ad_group_budget_in_micro_currency")
      , ("campaignCreateCommonIsUnderscoreautomatedUnderscorecampaign", "is_automated_campaign")
      ]


-- | 
data CampaignCreateRequest = CampaignCreateRequest
  { campaignCreateRequestAdUnderscoreaccountUnderscoreid :: Text -- ^ Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  , campaignCreateRequestName :: Text -- ^ Campaign name.
  , campaignCreateRequestStatus :: Maybe EntityStatus -- ^ 
  , campaignCreateRequestLifetimeUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  , campaignCreateRequestDailyUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  , campaignCreateRequestOrderUnderscorelineUnderscoreid :: Maybe Text -- ^ Order line ID that appears on the invoice.
  , campaignCreateRequestTrackingUnderscoreurls :: Maybe AdCommonTrackingUrls -- ^ 
  , campaignCreateRequestStartUnderscoretime :: Maybe Int -- ^ Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignCreateRequestEndUnderscoretime :: Maybe Int -- ^ Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignCreateRequestSummaryUnderscorestatus :: Maybe CampaignSummaryStatus -- ^ 
  , campaignCreateRequestIsUnderscoreflexibleUnderscoredailyUnderscorebudgets :: Maybe Bool -- ^ Determine if a campaign has flexible daily budgets setup.
  , campaignCreateRequestDefaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  , campaignCreateRequestIsUnderscoreautomatedUnderscorecampaign :: Maybe Bool -- ^ Specifies whether the campaign was created in the automated campaign flow
  , campaignCreateRequestObjectiveUnderscoretype :: ObjectiveType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignCreateRequest where
  parseJSON = genericParseJSON optionsCampaignCreateRequest
instance ToJSON CampaignCreateRequest where
  toJSON = genericToJSON optionsCampaignCreateRequest

optionsCampaignCreateRequest :: Options
optionsCampaignCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignCreateRequestAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("campaignCreateRequestName", "name")
      , ("campaignCreateRequestStatus", "status")
      , ("campaignCreateRequestLifetimeUnderscorespendUnderscorecap", "lifetime_spend_cap")
      , ("campaignCreateRequestDailyUnderscorespendUnderscorecap", "daily_spend_cap")
      , ("campaignCreateRequestOrderUnderscorelineUnderscoreid", "order_line_id")
      , ("campaignCreateRequestTrackingUnderscoreurls", "tracking_urls")
      , ("campaignCreateRequestStartUnderscoretime", "start_time")
      , ("campaignCreateRequestEndUnderscoretime", "end_time")
      , ("campaignCreateRequestSummaryUnderscorestatus", "summary_status")
      , ("campaignCreateRequestIsUnderscoreflexibleUnderscoredailyUnderscorebudgets", "is_flexible_daily_budgets")
      , ("campaignCreateRequestDefaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency", "default_ad_group_budget_in_micro_currency")
      , ("campaignCreateRequestIsUnderscoreautomatedUnderscorecampaign", "is_automated_campaign")
      , ("campaignCreateRequestObjectiveUnderscoretype", "objective_type")
      ]


-- | 
data CampaignCreateResponse = CampaignCreateResponse
  { campaignCreateResponseItems :: Maybe [CampaignCreateResponseItem] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignCreateResponse where
  parseJSON = genericParseJSON optionsCampaignCreateResponse
instance ToJSON CampaignCreateResponse where
  toJSON = genericToJSON optionsCampaignCreateResponse

optionsCampaignCreateResponse :: Options
optionsCampaignCreateResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignCreateResponseItems", "items")
      ]


-- | 
data CampaignCreateResponseData = CampaignCreateResponseData
  { campaignCreateResponseDataAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  , campaignCreateResponseDataName :: Maybe Text -- ^ Campaign name.
  , campaignCreateResponseDataStatus :: Maybe EntityStatus -- ^ 
  , campaignCreateResponseDataLifetimeUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  , campaignCreateResponseDataDailyUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  , campaignCreateResponseDataOrderUnderscorelineUnderscoreid :: Maybe Text -- ^ Order line ID that appears on the invoice.
  , campaignCreateResponseDataTrackingUnderscoreurls :: Maybe AdCommonTrackingUrls -- ^ 
  , campaignCreateResponseDataStartUnderscoretime :: Maybe Int -- ^ Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignCreateResponseDataEndUnderscoretime :: Maybe Int -- ^ Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignCreateResponseDataSummaryUnderscorestatus :: Maybe CampaignSummaryStatus -- ^ 
  , campaignCreateResponseDataIsUnderscoreflexibleUnderscoredailyUnderscorebudgets :: Maybe Bool -- ^ Determines if a campaign has flexible daily budgets setup.
  , campaignCreateResponseDataDefaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  , campaignCreateResponseDataIsUnderscoreautomatedUnderscorecampaign :: Maybe Bool -- ^ Specifies whether the campaign was created in the automated campaign flow
  , campaignCreateResponseDataId :: Maybe Text -- ^ Campaign ID.
  , campaignCreateResponseDataObjectiveUnderscoretype :: Maybe ObjectiveType -- ^ 
  , campaignCreateResponseDataCreatedUnderscoretime :: Maybe Int -- ^ Campaign creation time. Unix timestamp in seconds.
  , campaignCreateResponseDataUpdatedUnderscoretime :: Maybe Int -- ^ UTC timestamp. Last update time.
  , campaignCreateResponseDataType :: Maybe Text -- ^ Always \"campaign\".
  , campaignCreateResponseDataIsUnderscorecampaignUnderscorebudgetUnderscoreoptimization :: Maybe Bool -- ^ Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignCreateResponseData where
  parseJSON = genericParseJSON optionsCampaignCreateResponseData
instance ToJSON CampaignCreateResponseData where
  toJSON = genericToJSON optionsCampaignCreateResponseData

optionsCampaignCreateResponseData :: Options
optionsCampaignCreateResponseData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignCreateResponseDataAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("campaignCreateResponseDataName", "name")
      , ("campaignCreateResponseDataStatus", "status")
      , ("campaignCreateResponseDataLifetimeUnderscorespendUnderscorecap", "lifetime_spend_cap")
      , ("campaignCreateResponseDataDailyUnderscorespendUnderscorecap", "daily_spend_cap")
      , ("campaignCreateResponseDataOrderUnderscorelineUnderscoreid", "order_line_id")
      , ("campaignCreateResponseDataTrackingUnderscoreurls", "tracking_urls")
      , ("campaignCreateResponseDataStartUnderscoretime", "start_time")
      , ("campaignCreateResponseDataEndUnderscoretime", "end_time")
      , ("campaignCreateResponseDataSummaryUnderscorestatus", "summary_status")
      , ("campaignCreateResponseDataIsUnderscoreflexibleUnderscoredailyUnderscorebudgets", "is_flexible_daily_budgets")
      , ("campaignCreateResponseDataDefaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency", "default_ad_group_budget_in_micro_currency")
      , ("campaignCreateResponseDataIsUnderscoreautomatedUnderscorecampaign", "is_automated_campaign")
      , ("campaignCreateResponseDataId", "id")
      , ("campaignCreateResponseDataObjectiveUnderscoretype", "objective_type")
      , ("campaignCreateResponseDataCreatedUnderscoretime", "created_time")
      , ("campaignCreateResponseDataUpdatedUnderscoretime", "updated_time")
      , ("campaignCreateResponseDataType", "type")
      , ("campaignCreateResponseDataIsUnderscorecampaignUnderscorebudgetUnderscoreoptimization", "is_campaign_budget_optimization")
      ]


-- | 
data CampaignCreateResponseItem = CampaignCreateResponseItem
  { campaignCreateResponseItemData :: Maybe CampaignCreateResponseData -- ^ 
  , campaignCreateResponseItemExceptions :: Maybe [Exception] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignCreateResponseItem where
  parseJSON = genericParseJSON optionsCampaignCreateResponseItem
instance ToJSON CampaignCreateResponseItem where
  toJSON = genericToJSON optionsCampaignCreateResponseItem

optionsCampaignCreateResponseItem :: Options
optionsCampaignCreateResponseItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignCreateResponseItemData", "data")
      , ("campaignCreateResponseItemExceptions", "exceptions")
      ]


-- | 
data CampaignId = CampaignId
  { campaignIdId :: Maybe Text -- ^ Campaign ID.
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignId where
  parseJSON = genericParseJSON optionsCampaignId
instance ToJSON CampaignId where
  toJSON = genericToJSON optionsCampaignId

optionsCampaignId :: Options
optionsCampaignId =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignIdId", "id")
      ]


-- | 
data CampaignResponse = CampaignResponse
  { campaignResponseId :: Maybe Text -- ^ Campaign ID.
  , campaignResponseAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  , campaignResponseName :: Maybe Text -- ^ Campaign name.
  , campaignResponseStatus :: Maybe EntityStatus -- ^ 
  , campaignResponseLifetimeUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  , campaignResponseDailyUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  , campaignResponseOrderUnderscorelineUnderscoreid :: Maybe Text -- ^ Order line ID that appears on the invoice.
  , campaignResponseTrackingUnderscoreurls :: Maybe AdCommonTrackingUrls -- ^ 
  , campaignResponseStartUnderscoretime :: Maybe Int -- ^ Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignResponseEndUnderscoretime :: Maybe Int -- ^ Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignResponseSummaryUnderscorestatus :: Maybe CampaignSummaryStatus -- ^ 
  , campaignResponseObjectiveUnderscoretype :: Maybe ObjectiveType -- ^ 
  , campaignResponseCreatedUnderscoretime :: Maybe Int -- ^ Campaign creation time. Unix timestamp in seconds.
  , campaignResponseUpdatedUnderscoretime :: Maybe Int -- ^ UTC timestamp. Last update time.
  , campaignResponseType :: Maybe Text -- ^ Always \"campaign\".
  , campaignResponseIsUnderscoreflexibleUnderscoredailyUnderscorebudgets :: Maybe Bool -- ^ Determines if a campaign has flexible daily budgets setup.
  , campaignResponseIsUnderscorecampaignUnderscorebudgetUnderscoreoptimization :: Maybe Bool -- ^ Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignResponse where
  parseJSON = genericParseJSON optionsCampaignResponse
instance ToJSON CampaignResponse where
  toJSON = genericToJSON optionsCampaignResponse

optionsCampaignResponse :: Options
optionsCampaignResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignResponseId", "id")
      , ("campaignResponseAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("campaignResponseName", "name")
      , ("campaignResponseStatus", "status")
      , ("campaignResponseLifetimeUnderscorespendUnderscorecap", "lifetime_spend_cap")
      , ("campaignResponseDailyUnderscorespendUnderscorecap", "daily_spend_cap")
      , ("campaignResponseOrderUnderscorelineUnderscoreid", "order_line_id")
      , ("campaignResponseTrackingUnderscoreurls", "tracking_urls")
      , ("campaignResponseStartUnderscoretime", "start_time")
      , ("campaignResponseEndUnderscoretime", "end_time")
      , ("campaignResponseSummaryUnderscorestatus", "summary_status")
      , ("campaignResponseObjectiveUnderscoretype", "objective_type")
      , ("campaignResponseCreatedUnderscoretime", "created_time")
      , ("campaignResponseUpdatedUnderscoretime", "updated_time")
      , ("campaignResponseType", "type")
      , ("campaignResponseIsUnderscoreflexibleUnderscoredailyUnderscorebudgets", "is_flexible_daily_budgets")
      , ("campaignResponseIsUnderscorecampaignUnderscorebudgetUnderscoreoptimization", "is_campaign_budget_optimization")
      ]


-- | Summary status for campaign
data CampaignSummaryStatus = CampaignSummaryStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignSummaryStatus where
  parseJSON = genericParseJSON optionsCampaignSummaryStatus
instance ToJSON CampaignSummaryStatus where
  toJSON = genericToJSON optionsCampaignSummaryStatus

optionsCampaignSummaryStatus :: Options
optionsCampaignSummaryStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CampaignUpdateRequest = CampaignUpdateRequest
  { campaignUpdateRequestId :: Text -- ^ Campaign ID.
  , campaignUpdateRequestAdUnderscoreaccountUnderscoreid :: Text -- ^ Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  , campaignUpdateRequestName :: Maybe Text -- ^ Campaign name.
  , campaignUpdateRequestStatus :: Maybe EntityStatus -- ^ 
  , campaignUpdateRequestLifetimeUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  , campaignUpdateRequestDailyUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  , campaignUpdateRequestOrderUnderscorelineUnderscoreid :: Maybe Text -- ^ Order line ID that appears on the invoice.
  , campaignUpdateRequestTrackingUnderscoreurls :: Maybe AdCommonTrackingUrls -- ^ 
  , campaignUpdateRequestStartUnderscoretime :: Maybe Int -- ^ Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignUpdateRequestEndUnderscoretime :: Maybe Int -- ^ Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignUpdateRequestSummaryUnderscorestatus :: Maybe CampaignSummaryStatus -- ^ 
  , campaignUpdateRequestIsUnderscoreflexibleUnderscoredailyUnderscorebudgets :: Maybe Bool -- ^ Determine if a campaign has flexible daily budgets setup.
  , campaignUpdateRequestDefaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  , campaignUpdateRequestIsUnderscoreautomatedUnderscorecampaign :: Maybe Bool -- ^ Specifies whether the campaign was created in the automated campaign flow
  , campaignUpdateRequestIsUnderscorecampaignUnderscorebudgetUnderscoreoptimization :: Maybe Bool -- ^ Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
  , campaignUpdateRequestObjectiveUnderscoretype :: Maybe ObjectiveType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignUpdateRequest where
  parseJSON = genericParseJSON optionsCampaignUpdateRequest
instance ToJSON CampaignUpdateRequest where
  toJSON = genericToJSON optionsCampaignUpdateRequest

optionsCampaignUpdateRequest :: Options
optionsCampaignUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignUpdateRequestId", "id")
      , ("campaignUpdateRequestAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("campaignUpdateRequestName", "name")
      , ("campaignUpdateRequestStatus", "status")
      , ("campaignUpdateRequestLifetimeUnderscorespendUnderscorecap", "lifetime_spend_cap")
      , ("campaignUpdateRequestDailyUnderscorespendUnderscorecap", "daily_spend_cap")
      , ("campaignUpdateRequestOrderUnderscorelineUnderscoreid", "order_line_id")
      , ("campaignUpdateRequestTrackingUnderscoreurls", "tracking_urls")
      , ("campaignUpdateRequestStartUnderscoretime", "start_time")
      , ("campaignUpdateRequestEndUnderscoretime", "end_time")
      , ("campaignUpdateRequestSummaryUnderscorestatus", "summary_status")
      , ("campaignUpdateRequestIsUnderscoreflexibleUnderscoredailyUnderscorebudgets", "is_flexible_daily_budgets")
      , ("campaignUpdateRequestDefaultUnderscoreadUnderscoregroupUnderscorebudgetUnderscoreinUnderscoremicroUnderscorecurrency", "default_ad_group_budget_in_micro_currency")
      , ("campaignUpdateRequestIsUnderscoreautomatedUnderscorecampaign", "is_automated_campaign")
      , ("campaignUpdateRequestIsUnderscorecampaignUnderscorebudgetUnderscoreoptimization", "is_campaign_budget_optimization")
      , ("campaignUpdateRequestObjectiveUnderscoretype", "objective_type")
      ]


-- | 
data CampaignUpdateResponse = CampaignUpdateResponse
  { campaignUpdateResponseItems :: Maybe [CampaignCreateResponseItem] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignUpdateResponse where
  parseJSON = genericParseJSON optionsCampaignUpdateResponse
instance ToJSON CampaignUpdateResponse where
  toJSON = genericToJSON optionsCampaignUpdateResponse

optionsCampaignUpdateResponse :: Options
optionsCampaignUpdateResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignUpdateResponseItems", "items")
      ]


-- | 
newtype CampaignsAnalyticsResponseInner = CampaignsAnalyticsResponseInner { unCampaignsAnalyticsResponseInner :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data CampaignsList200Response = CampaignsList200Response
  { campaignsList200ResponseItems :: [CampaignResponse] -- ^ 
  , campaignsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignsList200Response where
  parseJSON = genericParseJSON optionsCampaignsList200Response
instance ToJSON CampaignsList200Response where
  toJSON = genericToJSON optionsCampaignsList200Response

optionsCampaignsList200Response :: Options
optionsCampaignsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignsList200ResponseItems", "items")
      , ("campaignsList200ResponseBookmark", "bookmark")
      ]


-- | Catalog entity
data Catalog = Catalog
  { catalogCreatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogId :: Text -- ^ ID of the catalog entity.
  , catalogUpdatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogName :: Text -- ^ A human-friendly name associated to a catalog entity.
  , catalogCatalogUnderscoretype :: CatalogsType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Catalog where
  parseJSON = genericParseJSON optionsCatalog
instance ToJSON Catalog where
  toJSON = genericToJSON optionsCatalog

optionsCatalog :: Options
optionsCatalog =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogCreatedUnderscoreat", "created_at")
      , ("catalogId", "id")
      , ("catalogUpdatedUnderscoreat", "updated_at")
      , ("catalogName", "name")
      , ("catalogCatalogUnderscoretype", "catalog_type")
      ]


-- | non-promoted catalog product group entity
data CatalogProductGroup = CatalogProductGroup
  { catalogProductGroupId :: Maybe Text -- ^ ID of the catalog product group.
  , catalogProductGroupMerchantUnderscoreid :: Maybe Text -- ^ Merchant ID pertaining to the owner of the catalog product group.
  , catalogProductGroupName :: Maybe Text -- ^ Name of catalog product group
  , catalogProductGroupFilters :: Maybe Object -- ^ Object holding a list of filters
  , catalogProductGroupFilterUnderscorev2 :: Maybe Object -- ^ Object holding a list of filters
  , catalogProductGroupType :: Maybe Board -- ^ 
  , catalogProductGroupStatus :: Maybe EntityStatus -- ^ 
  , catalogProductGroupFeedUnderscoreprofileUnderscoreid :: Maybe Text -- ^ id of the feed profile belonging to this catalog product group
  , catalogProductGroupCreatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of when catalog product group was created.
  , catalogProductGroupLastUnderscoreupdate :: Maybe Int -- ^ Unix timestamp in seconds of last time catalog product group was updated.
  , catalogProductGroupProductUnderscorecount :: Maybe Int -- ^ Amount of products in the catalog product group
  , catalogProductGroupFeaturedUnderscoreposition :: Maybe Int -- ^ index of the featured position of the catalog product group
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogProductGroup where
  parseJSON = genericParseJSON optionsCatalogProductGroup
instance ToJSON CatalogProductGroup where
  toJSON = genericToJSON optionsCatalogProductGroup

optionsCatalogProductGroup :: Options
optionsCatalogProductGroup =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogProductGroupId", "id")
      , ("catalogProductGroupMerchantUnderscoreid", "merchant_id")
      , ("catalogProductGroupName", "name")
      , ("catalogProductGroupFilters", "filters")
      , ("catalogProductGroupFilterUnderscorev2", "filter_v2")
      , ("catalogProductGroupType", "type")
      , ("catalogProductGroupStatus", "status")
      , ("catalogProductGroupFeedUnderscoreprofileUnderscoreid", "feed_profile_id")
      , ("catalogProductGroupCreatedUnderscoreat", "created_at")
      , ("catalogProductGroupLastUnderscoreupdate", "last_update")
      , ("catalogProductGroupProductUnderscorecount", "product_count")
      , ("catalogProductGroupFeaturedUnderscoreposition", "featured_position")
      ]


-- | A hotel item to be created.
data CatalogsCreateHotelItem = CatalogsCreateHotelItem
  { catalogsCreateHotelItemHotelUnderscoreid :: Text -- ^ The catalog hotel id in the merchant namespace
  , catalogsCreateHotelItemOperation :: Text -- ^ 
  , catalogsCreateHotelItemAttributes :: CatalogsHotelAttributes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsCreateHotelItem where
  parseJSON = genericParseJSON optionsCatalogsCreateHotelItem
instance ToJSON CatalogsCreateHotelItem where
  toJSON = genericToJSON optionsCatalogsCreateHotelItem

optionsCatalogsCreateHotelItem :: Options
optionsCatalogsCreateHotelItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsCreateHotelItemHotelUnderscoreid", "hotel_id")
      , ("catalogsCreateHotelItemOperation", "operation")
      , ("catalogsCreateHotelItemAttributes", "attributes")
      ]


-- | An item to be created
data CatalogsCreateRetailItem = CatalogsCreateRetailItem
  { catalogsCreateRetailItemItemUnderscoreid :: Text -- ^ The catalog item id in the merchant namespace
  , catalogsCreateRetailItemOperation :: Text -- ^ 
  , catalogsCreateRetailItemAttributes :: ItemAttributes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsCreateRetailItem where
  parseJSON = genericParseJSON optionsCatalogsCreateRetailItem
instance ToJSON CatalogsCreateRetailItem where
  toJSON = genericToJSON optionsCatalogsCreateRetailItem

optionsCatalogsCreateRetailItem :: Options
optionsCatalogsCreateRetailItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsCreateRetailItemItemUnderscoreid", "item_id")
      , ("catalogsCreateRetailItemOperation", "operation")
      , ("catalogsCreateRetailItemAttributes", "attributes")
      ]


-- | 
data CatalogsDbItem = CatalogsDbItem
  { catalogsDbItemCreatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsDbItemId :: Maybe Text -- ^ 
  , catalogsDbItemUpdatedUnderscoreat :: Maybe UTCTime -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsDbItem where
  parseJSON = genericParseJSON optionsCatalogsDbItem
instance ToJSON CatalogsDbItem where
  toJSON = genericToJSON optionsCatalogsDbItem

optionsCatalogsDbItem :: Options
optionsCatalogsDbItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsDbItemCreatedUnderscoreat", "created_at")
      , ("catalogsDbItemId", "id")
      , ("catalogsDbItemUpdatedUnderscoreat", "updated_at")
      ]


-- | A hotel item to be deleted
data CatalogsDeleteHotelItem = CatalogsDeleteHotelItem
  { catalogsDeleteHotelItemHotelUnderscoreid :: Text -- ^ The catalog hotel id in the merchant namespace
  , catalogsDeleteHotelItemOperation :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsDeleteHotelItem where
  parseJSON = genericParseJSON optionsCatalogsDeleteHotelItem
instance ToJSON CatalogsDeleteHotelItem where
  toJSON = genericToJSON optionsCatalogsDeleteHotelItem

optionsCatalogsDeleteHotelItem :: Options
optionsCatalogsDeleteHotelItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsDeleteHotelItemHotelUnderscoreid", "hotel_id")
      , ("catalogsDeleteHotelItemOperation", "operation")
      ]


-- | An item to be deleted
data CatalogsDeleteRetailItem = CatalogsDeleteRetailItem
  { catalogsDeleteRetailItemItemUnderscoreid :: Text -- ^ The catalog item id in the merchant namespace
  , catalogsDeleteRetailItemOperation :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsDeleteRetailItem where
  parseJSON = genericParseJSON optionsCatalogsDeleteRetailItem
instance ToJSON CatalogsDeleteRetailItem where
  toJSON = genericToJSON optionsCatalogsDeleteRetailItem

optionsCatalogsDeleteRetailItem :: Options
optionsCatalogsDeleteRetailItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsDeleteRetailItemItemUnderscoreid", "item_id")
      , ("catalogsDeleteRetailItemOperation", "operation")
      ]


-- | Catalogs Feed object
data CatalogsFeed = CatalogsFeed
  { catalogsFeedCreatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsFeedId :: Maybe Text -- ^ 
  , catalogsFeedUpdatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsFeedName :: Text -- ^ A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  , catalogsFeedFormat :: CatalogsFormat -- ^ 
  , catalogsFeedCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsFeedCredentials :: CatalogsFeedCredentials -- ^ 
  , catalogsFeedLocation :: Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsFeedPreferredUnderscoreprocessingUnderscoreschedule :: CatalogsFeedProcessingSchedule -- ^ 
  , catalogsFeedStatus :: CatalogsStatus -- ^ 
  , catalogsFeedDefaultUnderscorecurrency :: NullableCurrency -- ^ 
  , catalogsFeedDefaultUnderscorelocale :: Text -- ^ The locale used within a feed for product descriptions.
  , catalogsFeedDefaultUnderscorecountry :: Country -- ^ 
  , catalogsFeedDefaultUnderscoreavailability :: ProductAvailabilityType -- ^ 
  , catalogsFeedCatalogUnderscoreid :: Text -- ^ Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeed where
  parseJSON = genericParseJSON optionsCatalogsFeed
instance ToJSON CatalogsFeed where
  toJSON = genericToJSON optionsCatalogsFeed

optionsCatalogsFeed :: Options
optionsCatalogsFeed =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedCreatedUnderscoreat", "created_at")
      , ("catalogsFeedId", "id")
      , ("catalogsFeedUpdatedUnderscoreat", "updated_at")
      , ("catalogsFeedName", "name")
      , ("catalogsFeedFormat", "format")
      , ("catalogsFeedCatalogUnderscoretype", "catalog_type")
      , ("catalogsFeedCredentials", "credentials")
      , ("catalogsFeedLocation", "location")
      , ("catalogsFeedPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("catalogsFeedStatus", "status")
      , ("catalogsFeedDefaultUnderscorecurrency", "default_currency")
      , ("catalogsFeedDefaultUnderscorelocale", "default_locale")
      , ("catalogsFeedDefaultUnderscorecountry", "default_country")
      , ("catalogsFeedDefaultUnderscoreavailability", "default_availability")
      , ("catalogsFeedCatalogUnderscoreid", "catalog_id")
      ]


-- | This field is **OPTIONAL**. Use this if your feed file requires username and password.
data CatalogsFeedCredentials = CatalogsFeedCredentials
  { catalogsFeedCredentialsPassword :: Text -- ^ The required password for downloading a feed.
  , catalogsFeedCredentialsUsername :: Text -- ^ The required username for downloading a feed.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedCredentials where
  parseJSON = genericParseJSON optionsCatalogsFeedCredentials
instance ToJSON CatalogsFeedCredentials where
  toJSON = genericToJSON optionsCatalogsFeedCredentials

optionsCatalogsFeedCredentials :: Options
optionsCatalogsFeedCredentials =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedCredentialsPassword", "password")
      , ("catalogsFeedCredentialsUsername", "username")
      ]


-- | 
data CatalogsFeedIngestionDetails = CatalogsFeedIngestionDetails
  { catalogsFeedIngestionDetailsErrors :: CatalogsFeedIngestionErrors -- ^ 
  , catalogsFeedIngestionDetailsInfo :: CatalogsFeedIngestionInfo -- ^ 
  , catalogsFeedIngestionDetailsWarnings :: CatalogsFeedIngestionWarnings -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedIngestionDetails where
  parseJSON = genericParseJSON optionsCatalogsFeedIngestionDetails
instance ToJSON CatalogsFeedIngestionDetails where
  toJSON = genericToJSON optionsCatalogsFeedIngestionDetails

optionsCatalogsFeedIngestionDetails :: Options
optionsCatalogsFeedIngestionDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedIngestionDetailsErrors", "errors")
      , ("catalogsFeedIngestionDetailsInfo", "info")
      , ("catalogsFeedIngestionDetailsWarnings", "warnings")
      ]


-- | 
data CatalogsFeedIngestionErrors = CatalogsFeedIngestionErrors
  { catalogsFeedIngestionErrorsLINEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR :: Maybe Int -- ^ We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
  , catalogsFeedIngestionErrorsLARGEUnderscorePRODUCTUnderscoreCOUNTUnderscoreDECREASE :: Maybe Int -- ^ The product count has decreased by more than 99% compared to the last successful ingestion.
  , catalogsFeedIngestionErrorsACCOUNTUnderscoreFLAGGED :: Maybe Int -- ^ We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
  , catalogsFeedIngestionErrorsIMAGEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR :: Maybe Int -- ^ We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
  , catalogsFeedIngestionErrorsIMAGEUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE :: Maybe Int -- ^ Image files are unreadable. Please upload new files to continue.
  , catalogsFeedIngestionErrorsIMAGEUnderscoreMALFORMEDUnderscoreURL :: Maybe Int -- ^ Image files are unreadable. Please check your link and upload new files to continue.
  , catalogsFeedIngestionErrorsIMAGEUnderscoreFILEUnderscoreNOTUnderscoreFOUND :: Maybe Int -- ^ Image files are unreadable. Please upload new files to continue.
  , catalogsFeedIngestionErrorsIMAGEUnderscoreINVALIDUnderscoreFILE :: Maybe Int -- ^ Image files are unreadable. Please upload new files to continue.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedIngestionErrors where
  parseJSON = genericParseJSON optionsCatalogsFeedIngestionErrors
instance ToJSON CatalogsFeedIngestionErrors where
  toJSON = genericToJSON optionsCatalogsFeedIngestionErrors

optionsCatalogsFeedIngestionErrors :: Options
optionsCatalogsFeedIngestionErrors =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedIngestionErrorsLINEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR", "LINE_LEVEL_INTERNAL_ERROR")
      , ("catalogsFeedIngestionErrorsLARGEUnderscorePRODUCTUnderscoreCOUNTUnderscoreDECREASE", "LARGE_PRODUCT_COUNT_DECREASE")
      , ("catalogsFeedIngestionErrorsACCOUNTUnderscoreFLAGGED", "ACCOUNT_FLAGGED")
      , ("catalogsFeedIngestionErrorsIMAGEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR", "IMAGE_LEVEL_INTERNAL_ERROR")
      , ("catalogsFeedIngestionErrorsIMAGEUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE", "IMAGE_FILE_NOT_ACCESSIBLE")
      , ("catalogsFeedIngestionErrorsIMAGEUnderscoreMALFORMEDUnderscoreURL", "IMAGE_MALFORMED_URL")
      , ("catalogsFeedIngestionErrorsIMAGEUnderscoreFILEUnderscoreNOTUnderscoreFOUND", "IMAGE_FILE_NOT_FOUND")
      , ("catalogsFeedIngestionErrorsIMAGEUnderscoreINVALIDUnderscoreFILE", "IMAGE_INVALID_FILE")
      ]


-- | 
data CatalogsFeedIngestionInfo = CatalogsFeedIngestionInfo
  { catalogsFeedIngestionInfoINUnderscoreSTOCK :: Maybe Int -- ^ The number of ingested products that are in stock.
  , catalogsFeedIngestionInfoOUTUnderscoreOFUnderscoreSTOCK :: Maybe Int -- ^ The number of ingested products that are in out of stock.
  , catalogsFeedIngestionInfoPREORDER :: Maybe Int -- ^ The number of ingested products that are in preorder.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedIngestionInfo where
  parseJSON = genericParseJSON optionsCatalogsFeedIngestionInfo
instance ToJSON CatalogsFeedIngestionInfo where
  toJSON = genericToJSON optionsCatalogsFeedIngestionInfo

optionsCatalogsFeedIngestionInfo :: Options
optionsCatalogsFeedIngestionInfo =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedIngestionInfoINUnderscoreSTOCK", "IN_STOCK")
      , ("catalogsFeedIngestionInfoOUTUnderscoreOFUnderscoreSTOCK", "OUT_OF_STOCK")
      , ("catalogsFeedIngestionInfoPREORDER", "PREORDER")
      ]


-- | 
data CatalogsFeedIngestionWarnings = CatalogsFeedIngestionWarnings
  { catalogsFeedIngestionWarningsADDITIONALUnderscoreIMAGEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR :: Maybe Int -- ^ We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
  , catalogsFeedIngestionWarningsADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE :: Maybe Int -- ^ Additional image files are unreadable. Please upload new files to continue.
  , catalogsFeedIngestionWarningsADDITIONALUnderscoreIMAGEUnderscoreMALFORMEDUnderscoreURL :: Maybe Int -- ^ Additional image files are unreadable. Please check your link and upload new files to continue.
  , catalogsFeedIngestionWarningsADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreFOUND :: Maybe Int -- ^ Additional image files are unreadable. Please upload new files to continue.
  , catalogsFeedIngestionWarningsADDITIONALUnderscoreIMAGEUnderscoreINVALIDUnderscoreFILE :: Maybe Int -- ^ Additional image files are unreadable. Please upload new files to continue.
  , catalogsFeedIngestionWarningsHOTELUnderscorePRICEUnderscoreHEADERUnderscoreISUnderscorePRESENT :: Maybe Int -- ^ price is not a supported column. Use base_price and sale_price instead.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedIngestionWarnings where
  parseJSON = genericParseJSON optionsCatalogsFeedIngestionWarnings
instance ToJSON CatalogsFeedIngestionWarnings where
  toJSON = genericToJSON optionsCatalogsFeedIngestionWarnings

optionsCatalogsFeedIngestionWarnings :: Options
optionsCatalogsFeedIngestionWarnings =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedIngestionWarningsADDITIONALUnderscoreIMAGEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR", "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR")
      , ("catalogsFeedIngestionWarningsADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE", "ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE")
      , ("catalogsFeedIngestionWarningsADDITIONALUnderscoreIMAGEUnderscoreMALFORMEDUnderscoreURL", "ADDITIONAL_IMAGE_MALFORMED_URL")
      , ("catalogsFeedIngestionWarningsADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreFOUND", "ADDITIONAL_IMAGE_FILE_NOT_FOUND")
      , ("catalogsFeedIngestionWarningsADDITIONALUnderscoreIMAGEUnderscoreINVALIDUnderscoreFILE", "ADDITIONAL_IMAGE_INVALID_FILE")
      , ("catalogsFeedIngestionWarningsHOTELUnderscorePRICEUnderscoreHEADERUnderscoreISUnderscorePRESENT", "HOTEL_PRICE_HEADER_IS_PRESENT")
      ]


-- | 
data CatalogsFeedProcessingResult = CatalogsFeedProcessingResult
  { catalogsFeedProcessingResultCreatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsFeedProcessingResultId :: Maybe Text -- ^ 
  , catalogsFeedProcessingResultUpdatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsFeedProcessingResultIngestionUnderscoredetails :: CatalogsFeedIngestionDetails -- ^ 
  , catalogsFeedProcessingResultStatus :: CatalogsFeedProcessingStatus -- ^ 
  , catalogsFeedProcessingResultProductUnderscorecounts :: CatalogsFeedProductCounts -- ^ 
  , catalogsFeedProcessingResultValidationUnderscoredetails :: CatalogsFeedValidationDetails -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedProcessingResult where
  parseJSON = genericParseJSON optionsCatalogsFeedProcessingResult
instance ToJSON CatalogsFeedProcessingResult where
  toJSON = genericToJSON optionsCatalogsFeedProcessingResult

optionsCatalogsFeedProcessingResult :: Options
optionsCatalogsFeedProcessingResult =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedProcessingResultCreatedUnderscoreat", "created_at")
      , ("catalogsFeedProcessingResultId", "id")
      , ("catalogsFeedProcessingResultUpdatedUnderscoreat", "updated_at")
      , ("catalogsFeedProcessingResultIngestionUnderscoredetails", "ingestion_details")
      , ("catalogsFeedProcessingResultStatus", "status")
      , ("catalogsFeedProcessingResultProductUnderscorecounts", "product_counts")
      , ("catalogsFeedProcessingResultValidationUnderscoredetails", "validation_details")
      ]


-- | Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
data CatalogsFeedProcessingSchedule = CatalogsFeedProcessingSchedule
  { catalogsFeedProcessingScheduleTime :: Text -- ^ A time in format HH:MM with leading 0 (zero)
  , catalogsFeedProcessingScheduleTimezone :: Text -- ^ The timezone considered for the processing schedule time.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedProcessingSchedule where
  parseJSON = genericParseJSON optionsCatalogsFeedProcessingSchedule
instance ToJSON CatalogsFeedProcessingSchedule where
  toJSON = genericToJSON optionsCatalogsFeedProcessingSchedule

optionsCatalogsFeedProcessingSchedule :: Options
optionsCatalogsFeedProcessingSchedule =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedProcessingScheduleTime", "time")
      , ("catalogsFeedProcessingScheduleTimezone", "timezone")
      ]


-- | 
data CatalogsFeedProcessingStatus = CatalogsFeedProcessingStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedProcessingStatus where
  parseJSON = genericParseJSON optionsCatalogsFeedProcessingStatus
instance ToJSON CatalogsFeedProcessingStatus where
  toJSON = genericToJSON optionsCatalogsFeedProcessingStatus

optionsCatalogsFeedProcessingStatus :: Options
optionsCatalogsFeedProcessingStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | The counts can be null early in the process.
data CatalogsFeedProductCounts = CatalogsFeedProductCounts
  { catalogsFeedProductCountsOriginal :: Maybe Int -- ^ The number of products in the feed file.
  , catalogsFeedProductCountsIngested :: Maybe Int -- ^ The number of products successfully ingested from the feed file.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedProductCounts where
  parseJSON = genericParseJSON optionsCatalogsFeedProductCounts
instance ToJSON CatalogsFeedProductCounts where
  toJSON = genericToJSON optionsCatalogsFeedProductCounts

optionsCatalogsFeedProductCounts :: Options
optionsCatalogsFeedProductCounts =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedProductCountsOriginal", "original")
      , ("catalogsFeedProductCountsIngested", "ingested")
      ]


-- | 
data CatalogsFeedValidationDetails = CatalogsFeedValidationDetails
  { catalogsFeedValidationDetailsErrors :: CatalogsFeedValidationErrors -- ^ 
  , catalogsFeedValidationDetailsWarnings :: CatalogsFeedValidationWarnings -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedValidationDetails where
  parseJSON = genericParseJSON optionsCatalogsFeedValidationDetails
instance ToJSON CatalogsFeedValidationDetails where
  toJSON = genericToJSON optionsCatalogsFeedValidationDetails

optionsCatalogsFeedValidationDetails :: Options
optionsCatalogsFeedValidationDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedValidationDetailsErrors", "errors")
      , ("catalogsFeedValidationDetailsWarnings", "warnings")
      ]


-- | 
data CatalogsFeedValidationErrors = CatalogsFeedValidationErrors
  { catalogsFeedValidationErrorsFETCHUnderscoreERROR :: Maybe Int -- ^ Pinterest couldn't download your feed.
  , catalogsFeedValidationErrorsFETCHUnderscoreINACTIVEUnderscoreFEEDUnderscoreERROR :: Maybe Int -- ^ Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
  , catalogsFeedValidationErrorsENCODINGUnderscoreERROR :: Maybe Int -- ^ Your feed includes data with an unsupported encoding format.
  , catalogsFeedValidationErrorsDELIMITERUnderscoreERROR :: Maybe Int -- ^ Your feed includes data with formatting errors.
  , catalogsFeedValidationErrorsREQUIREDUnderscoreCOLUMNSUnderscoreMISSING :: Maybe Int -- ^ Your feed is missing some required column headers.
  , catalogsFeedValidationErrorsDUPLICATEUnderscorePRODUCTS :: Maybe Int -- ^ Some products are duplicated.
  , catalogsFeedValidationErrorsIMAGEUnderscoreLINKUnderscoreINVALID :: Maybe Int -- ^ Some image links are formatted incorrectly.
  , catalogsFeedValidationErrorsITEMIDUnderscoreMISSING :: Maybe Int -- ^ Some items are missing an item id in their product metadata, those items will not be published.
  , catalogsFeedValidationErrorsTITLEUnderscoreMISSING :: Maybe Int -- ^ Some items are missing a title in their product metadata, those items will not be published.
  , catalogsFeedValidationErrorsDESCRIPTIONUnderscoreMISSING :: Maybe Int -- ^ Some items are missing a description in their product metadata, those items will not be published.
  , catalogsFeedValidationErrorsPRODUCTUnderscoreLINKUnderscoreMISSING :: Maybe Int -- ^ Some items are missing a link URL in their product metadata, those items will not be published.
  , catalogsFeedValidationErrorsIMAGEUnderscoreLINKUnderscoreMISSING :: Maybe Int -- ^ Some items are missing an image link URL in their product metadata, those items will not be published.
  , catalogsFeedValidationErrorsAVAILABILITYUnderscoreINVALID :: Maybe Int -- ^ Some items are missing an availability value in their product metadata, those items will not be published.
  , catalogsFeedValidationErrorsPRODUCTUnderscorePRICEUnderscoreINVALID :: Maybe Int -- ^ Some items have price formatting errors in their product metadata, those items will not be published.
  , catalogsFeedValidationErrorsLINKUnderscoreFORMATUnderscoreINVALID :: Maybe Int -- ^ Some link values are formatted incorrectly.
  , catalogsFeedValidationErrorsPARSEUnderscoreLINEUnderscoreERROR :: Maybe Int -- ^ Your feed contains formatting errors for some items.
  , catalogsFeedValidationErrorsADWORDSUnderscoreFORMATUnderscoreINVALID :: Maybe Int -- ^ Some adwords links contain too many characters.
  , catalogsFeedValidationErrorsINTERNALUnderscoreSERVICEUnderscoreERROR :: Maybe Int -- ^ We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
  , catalogsFeedValidationErrorsNOUnderscoreVERIFIEDUnderscoreDOMAIN :: Maybe Int -- ^ Your merchant domain needs to be claimed.
  , catalogsFeedValidationErrorsADULTUnderscoreINVALID :: Maybe Int -- ^ Some items have invalid adult values.
  , catalogsFeedValidationErrorsIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe Int -- ^ Some items have image_link URLs that contain too many characters, so those items will not be published.
  , catalogsFeedValidationErrorsINVALIDUnderscoreDOMAIN :: Maybe Int -- ^ Some of your product link values don't match the verified domain associated with this account.
  , catalogsFeedValidationErrorsFEEDUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe Int -- ^ Your feed contains too many items, some items will not be published.
  , catalogsFeedValidationErrorsLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe Int -- ^ Some product links contain too many characters, those items will not be published.
  , catalogsFeedValidationErrorsMALFORMEDUnderscoreXML :: Maybe Int -- ^ Your feed couldn't be validated because the xml file is formatted incorrectly.
  , catalogsFeedValidationErrorsPRICEUnderscoreMISSING :: Maybe Int -- ^ Some products are missing a price, those items will not be published.
  , catalogsFeedValidationErrorsFEEDUnderscoreTOOUnderscoreSMALL :: Maybe Int -- ^ Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
  , catalogsFeedValidationErrorsMAXUnderscoreITEMSUnderscorePERUnderscoreITEMUnderscoreGROUPUnderscoreEXCEEDED :: Maybe Int -- ^ Some items exceed the maximum number of items per item group, those items will not be published.
  , catalogsFeedValidationErrorsITEMUnderscoreMAINUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE :: Maybe Int -- ^ Some items' main images can't be found.
  , catalogsFeedValidationErrorsPINJOINUnderscoreCONTENTUnderscoreUNSAFE :: Maybe Int -- ^ Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  , catalogsFeedValidationErrorsBLOCKLISTEDUnderscoreIMAGEUnderscoreSIGNATURE :: Maybe Int -- ^ Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  , catalogsFeedValidationErrorsLISTUnderscorePRICEUnderscoreINVALID :: Maybe Int -- ^ Some items have list price formatting errors in their product metadata, those items will not be published.
  , catalogsFeedValidationErrorsPRICEUnderscoreCANNOTUnderscoreBEUnderscoreDETERMINED :: Maybe Int -- ^ Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedValidationErrors where
  parseJSON = genericParseJSON optionsCatalogsFeedValidationErrors
instance ToJSON CatalogsFeedValidationErrors where
  toJSON = genericToJSON optionsCatalogsFeedValidationErrors

optionsCatalogsFeedValidationErrors :: Options
optionsCatalogsFeedValidationErrors =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedValidationErrorsFETCHUnderscoreERROR", "FETCH_ERROR")
      , ("catalogsFeedValidationErrorsFETCHUnderscoreINACTIVEUnderscoreFEEDUnderscoreERROR", "FETCH_INACTIVE_FEED_ERROR")
      , ("catalogsFeedValidationErrorsENCODINGUnderscoreERROR", "ENCODING_ERROR")
      , ("catalogsFeedValidationErrorsDELIMITERUnderscoreERROR", "DELIMITER_ERROR")
      , ("catalogsFeedValidationErrorsREQUIREDUnderscoreCOLUMNSUnderscoreMISSING", "REQUIRED_COLUMNS_MISSING")
      , ("catalogsFeedValidationErrorsDUPLICATEUnderscorePRODUCTS", "DUPLICATE_PRODUCTS")
      , ("catalogsFeedValidationErrorsIMAGEUnderscoreLINKUnderscoreINVALID", "IMAGE_LINK_INVALID")
      , ("catalogsFeedValidationErrorsITEMIDUnderscoreMISSING", "ITEMID_MISSING")
      , ("catalogsFeedValidationErrorsTITLEUnderscoreMISSING", "TITLE_MISSING")
      , ("catalogsFeedValidationErrorsDESCRIPTIONUnderscoreMISSING", "DESCRIPTION_MISSING")
      , ("catalogsFeedValidationErrorsPRODUCTUnderscoreLINKUnderscoreMISSING", "PRODUCT_LINK_MISSING")
      , ("catalogsFeedValidationErrorsIMAGEUnderscoreLINKUnderscoreMISSING", "IMAGE_LINK_MISSING")
      , ("catalogsFeedValidationErrorsAVAILABILITYUnderscoreINVALID", "AVAILABILITY_INVALID")
      , ("catalogsFeedValidationErrorsPRODUCTUnderscorePRICEUnderscoreINVALID", "PRODUCT_PRICE_INVALID")
      , ("catalogsFeedValidationErrorsLINKUnderscoreFORMATUnderscoreINVALID", "LINK_FORMAT_INVALID")
      , ("catalogsFeedValidationErrorsPARSEUnderscoreLINEUnderscoreERROR", "PARSE_LINE_ERROR")
      , ("catalogsFeedValidationErrorsADWORDSUnderscoreFORMATUnderscoreINVALID", "ADWORDS_FORMAT_INVALID")
      , ("catalogsFeedValidationErrorsINTERNALUnderscoreSERVICEUnderscoreERROR", "INTERNAL_SERVICE_ERROR")
      , ("catalogsFeedValidationErrorsNOUnderscoreVERIFIEDUnderscoreDOMAIN", "NO_VERIFIED_DOMAIN")
      , ("catalogsFeedValidationErrorsADULTUnderscoreINVALID", "ADULT_INVALID")
      , ("catalogsFeedValidationErrorsIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "IMAGE_LINK_LENGTH_TOO_LONG")
      , ("catalogsFeedValidationErrorsINVALIDUnderscoreDOMAIN", "INVALID_DOMAIN")
      , ("catalogsFeedValidationErrorsFEEDUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "FEED_LENGTH_TOO_LONG")
      , ("catalogsFeedValidationErrorsLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "LINK_LENGTH_TOO_LONG")
      , ("catalogsFeedValidationErrorsMALFORMEDUnderscoreXML", "MALFORMED_XML")
      , ("catalogsFeedValidationErrorsPRICEUnderscoreMISSING", "PRICE_MISSING")
      , ("catalogsFeedValidationErrorsFEEDUnderscoreTOOUnderscoreSMALL", "FEED_TOO_SMALL")
      , ("catalogsFeedValidationErrorsMAXUnderscoreITEMSUnderscorePERUnderscoreITEMUnderscoreGROUPUnderscoreEXCEEDED", "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
      , ("catalogsFeedValidationErrorsITEMUnderscoreMAINUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE", "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
      , ("catalogsFeedValidationErrorsPINJOINUnderscoreCONTENTUnderscoreUNSAFE", "PINJOIN_CONTENT_UNSAFE")
      , ("catalogsFeedValidationErrorsBLOCKLISTEDUnderscoreIMAGEUnderscoreSIGNATURE", "BLOCKLISTED_IMAGE_SIGNATURE")
      , ("catalogsFeedValidationErrorsLISTUnderscorePRICEUnderscoreINVALID", "LIST_PRICE_INVALID")
      , ("catalogsFeedValidationErrorsPRICEUnderscoreCANNOTUnderscoreBEUnderscoreDETERMINED", "PRICE_CANNOT_BE_DETERMINED")
      ]


-- | 
data CatalogsFeedValidationWarnings = CatalogsFeedValidationWarnings
  { catalogsFeedValidationWarningsADUnderscoreLINKUnderscoreFORMATUnderscoreWARNING :: Maybe Int -- ^ Some items have ad links that are formatted incorrectly.
  , catalogsFeedValidationWarningsADUnderscoreLINKUnderscoreSAMEUnderscoreASUnderscoreLINK :: Maybe Int -- ^ Some items have ad link URLs that are duplicates of the link URLs for those items.
  , catalogsFeedValidationWarningsTITLEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe Int -- ^ The title for some items were truncated because they contain too many characters.
  , catalogsFeedValidationWarningsDESCRIPTIONUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe Int -- ^ The description for some items were truncated because they contain too many characters.
  , catalogsFeedValidationWarningsGENDERUnderscoreINVALID :: Maybe Int -- ^ Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
  , catalogsFeedValidationWarningsAGEUnderscoreGROUPUnderscoreINVALID :: Maybe Int -- ^ Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
  , catalogsFeedValidationWarningsSIZEUnderscoreTYPEUnderscoreINVALID :: Maybe Int -- ^ Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
  , catalogsFeedValidationWarningsSIZEUnderscoreSYSTEMUnderscoreINVALID :: Maybe Int -- ^ Some items have size system values which are not one of the supported size systems.
  , catalogsFeedValidationWarningsLINKUnderscoreFORMATUnderscoreWARNING :: Maybe Int -- ^ Some items have an invalid product link which contains invalid UTM tracking paramaters.
  , catalogsFeedValidationWarningsSALESUnderscorePRICEUnderscoreINVALID :: Maybe Int -- ^ Some items have sale price values that are higher than the original price of the item.
  , catalogsFeedValidationWarningsPRODUCTUnderscoreCATEGORYUnderscoreDEPTHUnderscoreWARNING :: Maybe Int -- ^ Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
  , catalogsFeedValidationWarningsADWORDSUnderscoreFORMATUnderscoreWARNING :: Maybe Int -- ^ Some items have adwords_redirect links that are formatted incorrectly.
  , catalogsFeedValidationWarningsADWORDSUnderscoreSAMEUnderscoreASUnderscoreLINK :: Maybe Int -- ^ Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
  , catalogsFeedValidationWarningsDUPLICATEUnderscoreHEADERS :: Maybe Int -- ^ Your feed contains duplicate headers.
  , catalogsFeedValidationWarningsFETCHUnderscoreSAMEUnderscoreSIGNATURE :: Maybe Int -- ^ Ingestion completed early because there are no changes to your feed since the last successful update.
  , catalogsFeedValidationWarningsADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe Int -- ^ Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
  , catalogsFeedValidationWarningsADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreWARNING :: Maybe Int -- ^ Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
  , catalogsFeedValidationWarningsIMAGEUnderscoreLINKUnderscoreWARNING :: Maybe Int -- ^ Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
  , catalogsFeedValidationWarningsSHIPPINGUnderscoreINVALID :: Maybe Int -- ^ Some items have shipping values that are formatted incorrectly.
  , catalogsFeedValidationWarningsTAXUnderscoreINVALID :: Maybe Int -- ^ Some items have tax values that are formatted incorrectly.
  , catalogsFeedValidationWarningsSHIPPINGUnderscoreWEIGHTUnderscoreINVALID :: Maybe Int -- ^ Some items have invalid shipping_weight values.
  , catalogsFeedValidationWarningsEXPIRATIONUnderscoreDATEUnderscoreINVALID :: Maybe Int -- ^ Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
  , catalogsFeedValidationWarningsAVAILABILITYUnderscoreDATEUnderscoreINVALID :: Maybe Int -- ^ Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
  , catalogsFeedValidationWarningsSALEUnderscoreDATEUnderscoreINVALID :: Maybe Int -- ^ Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
  , catalogsFeedValidationWarningsWEIGHTUnderscoreUNITUnderscoreINVALID :: Maybe Int -- ^ Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
  , catalogsFeedValidationWarningsISUnderscoreBUNDLEUnderscoreINVALID :: Maybe Int -- ^ Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
  , catalogsFeedValidationWarningsUPDATEDUnderscoreTIMEUnderscoreINVALID :: Maybe Int -- ^ Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
  , catalogsFeedValidationWarningsCUSTOMUnderscoreLABELUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe Int -- ^ Some items have custom_label values that are too long, those items will be published without that custom label.
  , catalogsFeedValidationWarningsPRODUCTUnderscoreTYPEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe Int -- ^ Some items have product_type values that are too long, those items will be published without that product type.
  , catalogsFeedValidationWarningsTOOUnderscoreMANYUnderscoreADDITIONALUnderscoreIMAGEUnderscoreLINKS :: Maybe Int -- ^ Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
  , catalogsFeedValidationWarningsMULTIPACKUnderscoreINVALID :: Maybe Int -- ^ Some items have invalid multipack values.
  , catalogsFeedValidationWarningsINDEXEDUnderscorePRODUCTUnderscoreCOUNTUnderscoreLARGEUnderscoreDELTA :: Maybe Int -- ^ The product count has increased or decreased significantly compared to the last successful ingestion.
  , catalogsFeedValidationWarningsITEMUnderscoreADDITIONALUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE :: Maybe Int -- ^ Some items include additional_image_links that can't be found.
  , catalogsFeedValidationWarningsOPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreMISSING :: Maybe Int -- ^ Some items are missing a google_product_category.
  , catalogsFeedValidationWarningsOPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreINVALID :: Maybe Int -- ^ Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
  , catalogsFeedValidationWarningsOPTIONALUnderscoreCONDITIONUnderscoreMISSING :: Maybe Int -- ^ Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
  , catalogsFeedValidationWarningsOPTIONALUnderscoreCONDITIONUnderscoreINVALID :: Maybe Int -- ^ Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
  , catalogsFeedValidationWarningsIOSUnderscoreDEEPUnderscoreLINKUnderscoreINVALID :: Maybe Int -- ^ Some items include invalid ios_deep_link values.
  , catalogsFeedValidationWarningsANDROIDUnderscoreDEEPUnderscoreLINKUnderscoreINVALID :: Maybe Int -- ^ Some items include invalid android_deep_link.
  , catalogsFeedValidationWarningsUTMUnderscoreSOURCEUnderscoreAUTOUnderscoreCORRECTED :: Maybe Int -- ^ Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
  , catalogsFeedValidationWarningsCOUNTRYUnderscoreDOESUnderscoreNOTUnderscoreMAPUnderscoreTOUnderscoreCURRENCY :: Maybe Int -- ^ Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
  , catalogsFeedValidationWarningsMINUnderscoreADUnderscorePRICEUnderscoreINVALID :: Maybe Int -- ^ Some items include min_ad_price values that are formatted incorrectly.
  , catalogsFeedValidationWarningsGTINUnderscoreINVALID :: Maybe Int -- ^ Some items include incorrectly formatted GTINs.
  , catalogsFeedValidationWarningsINCONSISTENTUnderscoreCURRENCYUnderscoreVALUES :: Maybe Int -- ^ Some items include inconsistent currencies in price fields.
  , catalogsFeedValidationWarningsSALESUnderscorePRICEUnderscoreTOOUnderscoreLOW :: Maybe Int -- ^ Some items include sales price that is much lower than the list price.
  , catalogsFeedValidationWarningsSHIPPINGUnderscoreWIDTHUnderscoreINVALID :: Maybe Int -- ^ Some items include incorrectly formatted shipping_width.
  , catalogsFeedValidationWarningsSHIPPINGUnderscoreHEIGHTUnderscoreINVALID :: Maybe Int -- ^ Some items include incorrectly formatted shipping_height.
  , catalogsFeedValidationWarningsSALESUnderscorePRICEUnderscoreTOOUnderscoreHIGH :: Maybe Int -- ^ Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
  , catalogsFeedValidationWarningsMPNUnderscoreINVALID :: Maybe Int -- ^ Some items include incorrectly formatted MPNs.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedValidationWarnings where
  parseJSON = genericParseJSON optionsCatalogsFeedValidationWarnings
instance ToJSON CatalogsFeedValidationWarnings where
  toJSON = genericToJSON optionsCatalogsFeedValidationWarnings

optionsCatalogsFeedValidationWarnings :: Options
optionsCatalogsFeedValidationWarnings =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedValidationWarningsADUnderscoreLINKUnderscoreFORMATUnderscoreWARNING", "AD_LINK_FORMAT_WARNING")
      , ("catalogsFeedValidationWarningsADUnderscoreLINKUnderscoreSAMEUnderscoreASUnderscoreLINK", "AD_LINK_SAME_AS_LINK")
      , ("catalogsFeedValidationWarningsTITLEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "TITLE_LENGTH_TOO_LONG")
      , ("catalogsFeedValidationWarningsDESCRIPTIONUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "DESCRIPTION_LENGTH_TOO_LONG")
      , ("catalogsFeedValidationWarningsGENDERUnderscoreINVALID", "GENDER_INVALID")
      , ("catalogsFeedValidationWarningsAGEUnderscoreGROUPUnderscoreINVALID", "AGE_GROUP_INVALID")
      , ("catalogsFeedValidationWarningsSIZEUnderscoreTYPEUnderscoreINVALID", "SIZE_TYPE_INVALID")
      , ("catalogsFeedValidationWarningsSIZEUnderscoreSYSTEMUnderscoreINVALID", "SIZE_SYSTEM_INVALID")
      , ("catalogsFeedValidationWarningsLINKUnderscoreFORMATUnderscoreWARNING", "LINK_FORMAT_WARNING")
      , ("catalogsFeedValidationWarningsSALESUnderscorePRICEUnderscoreINVALID", "SALES_PRICE_INVALID")
      , ("catalogsFeedValidationWarningsPRODUCTUnderscoreCATEGORYUnderscoreDEPTHUnderscoreWARNING", "PRODUCT_CATEGORY_DEPTH_WARNING")
      , ("catalogsFeedValidationWarningsADWORDSUnderscoreFORMATUnderscoreWARNING", "ADWORDS_FORMAT_WARNING")
      , ("catalogsFeedValidationWarningsADWORDSUnderscoreSAMEUnderscoreASUnderscoreLINK", "ADWORDS_SAME_AS_LINK")
      , ("catalogsFeedValidationWarningsDUPLICATEUnderscoreHEADERS", "DUPLICATE_HEADERS")
      , ("catalogsFeedValidationWarningsFETCHUnderscoreSAMEUnderscoreSIGNATURE", "FETCH_SAME_SIGNATURE")
      , ("catalogsFeedValidationWarningsADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")
      , ("catalogsFeedValidationWarningsADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreWARNING", "ADDITIONAL_IMAGE_LINK_WARNING")
      , ("catalogsFeedValidationWarningsIMAGEUnderscoreLINKUnderscoreWARNING", "IMAGE_LINK_WARNING")
      , ("catalogsFeedValidationWarningsSHIPPINGUnderscoreINVALID", "SHIPPING_INVALID")
      , ("catalogsFeedValidationWarningsTAXUnderscoreINVALID", "TAX_INVALID")
      , ("catalogsFeedValidationWarningsSHIPPINGUnderscoreWEIGHTUnderscoreINVALID", "SHIPPING_WEIGHT_INVALID")
      , ("catalogsFeedValidationWarningsEXPIRATIONUnderscoreDATEUnderscoreINVALID", "EXPIRATION_DATE_INVALID")
      , ("catalogsFeedValidationWarningsAVAILABILITYUnderscoreDATEUnderscoreINVALID", "AVAILABILITY_DATE_INVALID")
      , ("catalogsFeedValidationWarningsSALEUnderscoreDATEUnderscoreINVALID", "SALE_DATE_INVALID")
      , ("catalogsFeedValidationWarningsWEIGHTUnderscoreUNITUnderscoreINVALID", "WEIGHT_UNIT_INVALID")
      , ("catalogsFeedValidationWarningsISUnderscoreBUNDLEUnderscoreINVALID", "IS_BUNDLE_INVALID")
      , ("catalogsFeedValidationWarningsUPDATEDUnderscoreTIMEUnderscoreINVALID", "UPDATED_TIME_INVALID")
      , ("catalogsFeedValidationWarningsCUSTOMUnderscoreLABELUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "CUSTOM_LABEL_LENGTH_TOO_LONG")
      , ("catalogsFeedValidationWarningsPRODUCTUnderscoreTYPEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "PRODUCT_TYPE_LENGTH_TOO_LONG")
      , ("catalogsFeedValidationWarningsTOOUnderscoreMANYUnderscoreADDITIONALUnderscoreIMAGEUnderscoreLINKS", "TOO_MANY_ADDITIONAL_IMAGE_LINKS")
      , ("catalogsFeedValidationWarningsMULTIPACKUnderscoreINVALID", "MULTIPACK_INVALID")
      , ("catalogsFeedValidationWarningsINDEXEDUnderscorePRODUCTUnderscoreCOUNTUnderscoreLARGEUnderscoreDELTA", "INDEXED_PRODUCT_COUNT_LARGE_DELTA")
      , ("catalogsFeedValidationWarningsITEMUnderscoreADDITIONALUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE", "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")
      , ("catalogsFeedValidationWarningsOPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreMISSING", "OPTIONAL_PRODUCT_CATEGORY_MISSING")
      , ("catalogsFeedValidationWarningsOPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreINVALID", "OPTIONAL_PRODUCT_CATEGORY_INVALID")
      , ("catalogsFeedValidationWarningsOPTIONALUnderscoreCONDITIONUnderscoreMISSING", "OPTIONAL_CONDITION_MISSING")
      , ("catalogsFeedValidationWarningsOPTIONALUnderscoreCONDITIONUnderscoreINVALID", "OPTIONAL_CONDITION_INVALID")
      , ("catalogsFeedValidationWarningsIOSUnderscoreDEEPUnderscoreLINKUnderscoreINVALID", "IOS_DEEP_LINK_INVALID")
      , ("catalogsFeedValidationWarningsANDROIDUnderscoreDEEPUnderscoreLINKUnderscoreINVALID", "ANDROID_DEEP_LINK_INVALID")
      , ("catalogsFeedValidationWarningsUTMUnderscoreSOURCEUnderscoreAUTOUnderscoreCORRECTED", "UTM_SOURCE_AUTO_CORRECTED")
      , ("catalogsFeedValidationWarningsCOUNTRYUnderscoreDOESUnderscoreNOTUnderscoreMAPUnderscoreTOUnderscoreCURRENCY", "COUNTRY_DOES_NOT_MAP_TO_CURRENCY")
      , ("catalogsFeedValidationWarningsMINUnderscoreADUnderscorePRICEUnderscoreINVALID", "MIN_AD_PRICE_INVALID")
      , ("catalogsFeedValidationWarningsGTINUnderscoreINVALID", "GTIN_INVALID")
      , ("catalogsFeedValidationWarningsINCONSISTENTUnderscoreCURRENCYUnderscoreVALUES", "INCONSISTENT_CURRENCY_VALUES")
      , ("catalogsFeedValidationWarningsSALESUnderscorePRICEUnderscoreTOOUnderscoreLOW", "SALES_PRICE_TOO_LOW")
      , ("catalogsFeedValidationWarningsSHIPPINGUnderscoreWIDTHUnderscoreINVALID", "SHIPPING_WIDTH_INVALID")
      , ("catalogsFeedValidationWarningsSHIPPINGUnderscoreHEIGHTUnderscoreINVALID", "SHIPPING_HEIGHT_INVALID")
      , ("catalogsFeedValidationWarningsSALESUnderscorePRICEUnderscoreTOOUnderscoreHIGH", "SALES_PRICE_TOO_HIGH")
      , ("catalogsFeedValidationWarningsMPNUnderscoreINVALID", "MPN_INVALID")
      ]


-- | Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
data CatalogsFeedsCreateRequest = CatalogsFeedsCreateRequest
  { catalogsFeedsCreateRequestDefaultUnderscorecurrency :: Maybe NullableCurrency -- ^ 
  , catalogsFeedsCreateRequestName :: Text -- ^ A human-friendly name associated to a given feed.
  , catalogsFeedsCreateRequestFormat :: CatalogsFormat -- ^ 
  , catalogsFeedsCreateRequestDefaultUnderscorelocale :: Maybe CatalogsFeedsCreateRequestDefaultLocale -- ^ 
  , catalogsFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials -- ^ 
  , catalogsFeedsCreateRequestLocation :: Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsFeedsCreateRequestPreferredUnderscoreprocessingUnderscoreschedule :: Maybe CatalogsFeedProcessingSchedule -- ^ 
  , catalogsFeedsCreateRequestDefaultUnderscorecountry :: Maybe Country -- ^ 
  , catalogsFeedsCreateRequestDefaultUnderscoreavailability :: Maybe ProductAvailabilityType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedsCreateRequest where
  parseJSON = genericParseJSON optionsCatalogsFeedsCreateRequest
instance ToJSON CatalogsFeedsCreateRequest where
  toJSON = genericToJSON optionsCatalogsFeedsCreateRequest

optionsCatalogsFeedsCreateRequest :: Options
optionsCatalogsFeedsCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedsCreateRequestDefaultUnderscorecurrency", "default_currency")
      , ("catalogsFeedsCreateRequestName", "name")
      , ("catalogsFeedsCreateRequestFormat", "format")
      , ("catalogsFeedsCreateRequestDefaultUnderscorelocale", "default_locale")
      , ("catalogsFeedsCreateRequestCredentials", "credentials")
      , ("catalogsFeedsCreateRequestLocation", "location")
      , ("catalogsFeedsCreateRequestPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("catalogsFeedsCreateRequestDefaultUnderscorecountry", "default_country")
      , ("catalogsFeedsCreateRequestDefaultUnderscoreavailability", "default_availability")
      ]


-- | The locale used within a feed for product descriptions.
data CatalogsFeedsCreateRequestDefaultLocale = CatalogsFeedsCreateRequestDefaultLocale
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedsCreateRequestDefaultLocale where
  parseJSON = genericParseJSON optionsCatalogsFeedsCreateRequestDefaultLocale
instance ToJSON CatalogsFeedsCreateRequestDefaultLocale where
  toJSON = genericToJSON optionsCatalogsFeedsCreateRequestDefaultLocale

optionsCatalogsFeedsCreateRequestDefaultLocale :: Options
optionsCatalogsFeedsCreateRequestDefaultLocale =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Request object for updating a feed.
data CatalogsFeedsUpdateRequest = CatalogsFeedsUpdateRequest
  { catalogsFeedsUpdateRequestDefaultUnderscoreavailability :: Maybe ProductAvailabilityType -- ^ 
  , catalogsFeedsUpdateRequestDefaultUnderscorecurrency :: Maybe NullableCurrency -- ^ 
  , catalogsFeedsUpdateRequestName :: Maybe Text -- ^ A human-friendly name associated to a given feed.
  , catalogsFeedsUpdateRequestFormat :: Maybe CatalogsFormat -- ^ 
  , catalogsFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials -- ^ 
  , catalogsFeedsUpdateRequestLocation :: Maybe Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsFeedsUpdateRequestPreferredUnderscoreprocessingUnderscoreschedule :: Maybe CatalogsFeedProcessingSchedule -- ^ 
  , catalogsFeedsUpdateRequestStatus :: Maybe CatalogsStatus -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedsUpdateRequest where
  parseJSON = genericParseJSON optionsCatalogsFeedsUpdateRequest
instance ToJSON CatalogsFeedsUpdateRequest where
  toJSON = genericToJSON optionsCatalogsFeedsUpdateRequest

optionsCatalogsFeedsUpdateRequest :: Options
optionsCatalogsFeedsUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsFeedsUpdateRequestDefaultUnderscoreavailability", "default_availability")
      , ("catalogsFeedsUpdateRequestDefaultUnderscorecurrency", "default_currency")
      , ("catalogsFeedsUpdateRequestName", "name")
      , ("catalogsFeedsUpdateRequestFormat", "format")
      , ("catalogsFeedsUpdateRequestCredentials", "credentials")
      , ("catalogsFeedsUpdateRequestLocation", "location")
      , ("catalogsFeedsUpdateRequestPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("catalogsFeedsUpdateRequestStatus", "status")
      ]


-- | The file format of a feed.
data CatalogsFormat = CatalogsFormat
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFormat where
  parseJSON = genericParseJSON optionsCatalogsFormat
instance ToJSON CatalogsFormat where
  toJSON = genericToJSON optionsCatalogsFormat

optionsCatalogsFormat :: Options
optionsCatalogsFormat =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CatalogsHotelAddress = CatalogsHotelAddress
  { catalogsHotelAddressAddr1 :: Maybe Text -- ^ Primary street address of hotel.
  , catalogsHotelAddressCity :: Maybe Text -- ^ City where the hotel is located.
  , catalogsHotelAddressRegion :: Maybe Text -- ^ State, county, province, where the hotel is located.
  , catalogsHotelAddressCountry :: Maybe Text -- ^ Country where the hotel is located.
  , catalogsHotelAddressPostalUnderscorecode :: Maybe Text -- ^ Required for countries with a postal code system. Postal or zip code of the hotel.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelAddress where
  parseJSON = genericParseJSON optionsCatalogsHotelAddress
instance ToJSON CatalogsHotelAddress where
  toJSON = genericToJSON optionsCatalogsHotelAddress

optionsCatalogsHotelAddress :: Options
optionsCatalogsHotelAddress =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelAddressAddr1", "addr1")
      , ("catalogsHotelAddressCity", "city")
      , ("catalogsHotelAddressRegion", "region")
      , ("catalogsHotelAddressCountry", "country")
      , ("catalogsHotelAddressPostalUnderscorecode", "postal_code")
      ]


-- | 
data CatalogsHotelAttributes = CatalogsHotelAttributes
  { catalogsHotelAttributesName :: Maybe Text -- ^ The hotel's name.
  , catalogsHotelAttributesLink :: Maybe Text -- ^ Link to the product page
  , catalogsHotelAttributesDescription :: Maybe Text -- ^ Brief description of the hotel.
  , catalogsHotelAttributesBrand :: Maybe Text -- ^ The brand to which this hotel belongs to.
  , catalogsHotelAttributesLatitude :: Maybe Double -- ^ Latitude of the hotel.
  , catalogsHotelAttributesLongitude :: Maybe Double -- ^ Longitude of the hotel.
  , catalogsHotelAttributesNeighborhood :: Maybe [Text] -- ^ A list of neighborhoods where the hotel is located
  , catalogsHotelAttributesAddress :: Maybe CatalogsHotelAddress -- ^ 
  , catalogsHotelAttributesCustomUnderscorelabelUnderscore0 :: Maybe Text -- ^ Custom grouping of hotels
  , catalogsHotelAttributesCustomUnderscorelabelUnderscore1 :: Maybe Text -- ^ Custom grouping of hotels
  , catalogsHotelAttributesCustomUnderscorelabelUnderscore2 :: Maybe Text -- ^ Custom grouping of hotels
  , catalogsHotelAttributesCustomUnderscorelabelUnderscore3 :: Maybe Text -- ^ Custom grouping of hotels
  , catalogsHotelAttributesCustomUnderscorelabelUnderscore4 :: Maybe Text -- ^ Custom grouping of hotels
  , catalogsHotelAttributesCategory :: Maybe Text -- ^ The type of property. The category can be any type of internal description desired.
  , catalogsHotelAttributesBaseUnderscoreprice :: Maybe Text -- ^ Base price of the hotel room per night followed by the ISO currency code
  , catalogsHotelAttributesSaleUnderscoreprice :: Maybe Text -- ^ Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
  , catalogsHotelAttributesGuestUnderscoreratings :: Maybe CatalogsHotelGuestRatings -- ^ 
  , catalogsHotelAttributesMainUnderscoreimage :: Maybe CatalogsHotelAttributesAllOfMainImage -- ^ 
  , catalogsHotelAttributesAdditionalUnderscoreimageUnderscorelink :: Maybe [Text] -- ^ <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelAttributes where
  parseJSON = genericParseJSON optionsCatalogsHotelAttributes
instance ToJSON CatalogsHotelAttributes where
  toJSON = genericToJSON optionsCatalogsHotelAttributes

optionsCatalogsHotelAttributes :: Options
optionsCatalogsHotelAttributes =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelAttributesName", "name")
      , ("catalogsHotelAttributesLink", "link")
      , ("catalogsHotelAttributesDescription", "description")
      , ("catalogsHotelAttributesBrand", "brand")
      , ("catalogsHotelAttributesLatitude", "latitude")
      , ("catalogsHotelAttributesLongitude", "longitude")
      , ("catalogsHotelAttributesNeighborhood", "neighborhood")
      , ("catalogsHotelAttributesAddress", "address")
      , ("catalogsHotelAttributesCustomUnderscorelabelUnderscore0", "custom_label_0")
      , ("catalogsHotelAttributesCustomUnderscorelabelUnderscore1", "custom_label_1")
      , ("catalogsHotelAttributesCustomUnderscorelabelUnderscore2", "custom_label_2")
      , ("catalogsHotelAttributesCustomUnderscorelabelUnderscore3", "custom_label_3")
      , ("catalogsHotelAttributesCustomUnderscorelabelUnderscore4", "custom_label_4")
      , ("catalogsHotelAttributesCategory", "category")
      , ("catalogsHotelAttributesBaseUnderscoreprice", "base_price")
      , ("catalogsHotelAttributesSaleUnderscoreprice", "sale_price")
      , ("catalogsHotelAttributesGuestUnderscoreratings", "guest_ratings")
      , ("catalogsHotelAttributesMainUnderscoreimage", "main_image")
      , ("catalogsHotelAttributesAdditionalUnderscoreimageUnderscorelink", "additional_image_link")
      ]


-- | The main hotel image
data CatalogsHotelAttributesAllOfMainImage = CatalogsHotelAttributesAllOfMainImage
  { catalogsHotelAttributesAllOfMainImageLink :: Maybe Text -- ^ <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
  , catalogsHotelAttributesAllOfMainImageTag :: Maybe [Text] -- ^ Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelAttributesAllOfMainImage where
  parseJSON = genericParseJSON optionsCatalogsHotelAttributesAllOfMainImage
instance ToJSON CatalogsHotelAttributesAllOfMainImage where
  toJSON = genericToJSON optionsCatalogsHotelAttributesAllOfMainImage

optionsCatalogsHotelAttributesAllOfMainImage :: Options
optionsCatalogsHotelAttributesAllOfMainImage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelAttributesAllOfMainImageLink", "link")
      , ("catalogsHotelAttributesAllOfMainImageTag", "tag")
      ]


-- | Hotel batch item
data CatalogsHotelBatchItem = CatalogsHotelBatchItem
  { catalogsHotelBatchItemHotelUnderscoreid :: Text -- ^ The catalog hotel id in the merchant namespace
  , catalogsHotelBatchItemOperation :: Text -- ^ 
  , catalogsHotelBatchItemAttributes :: CatalogsUpdatableHotelAttributes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelBatchItem where
  parseJSON = genericParseJSON optionsCatalogsHotelBatchItem
instance ToJSON CatalogsHotelBatchItem where
  toJSON = genericToJSON optionsCatalogsHotelBatchItem

optionsCatalogsHotelBatchItem :: Options
optionsCatalogsHotelBatchItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelBatchItemHotelUnderscoreid", "hotel_id")
      , ("catalogsHotelBatchItemOperation", "operation")
      , ("catalogsHotelBatchItemAttributes", "attributes")
      ]


-- | Request object to update catalogs hotel items
data CatalogsHotelBatchRequest = CatalogsHotelBatchRequest
  { catalogsHotelBatchRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsHotelBatchRequestCountry :: Country -- ^ 
  , catalogsHotelBatchRequestLanguage :: Language -- ^ 
  , catalogsHotelBatchRequestItems :: [CatalogsHotelBatchItem] -- ^ Array with catalogs item operations
  , catalogsHotelBatchRequestCatalogUnderscoreid :: Maybe Text -- ^ Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelBatchRequest where
  parseJSON = genericParseJSON optionsCatalogsHotelBatchRequest
instance ToJSON CatalogsHotelBatchRequest where
  toJSON = genericToJSON optionsCatalogsHotelBatchRequest

optionsCatalogsHotelBatchRequest :: Options
optionsCatalogsHotelBatchRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelBatchRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsHotelBatchRequestCountry", "country")
      , ("catalogsHotelBatchRequestLanguage", "language")
      , ("catalogsHotelBatchRequestItems", "items")
      , ("catalogsHotelBatchRequestCatalogUnderscoreid", "catalog_id")
      ]


-- | Catalogs Hotel Feed object
data CatalogsHotelFeed = CatalogsHotelFeed
  { catalogsHotelFeedCreatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsHotelFeedId :: Maybe Text -- ^ 
  , catalogsHotelFeedUpdatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsHotelFeedName :: Text -- ^ A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  , catalogsHotelFeedFormat :: CatalogsFormat -- ^ 
  , catalogsHotelFeedCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsHotelFeedCredentials :: CatalogsFeedCredentials -- ^ 
  , catalogsHotelFeedLocation :: Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsHotelFeedPreferredUnderscoreprocessingUnderscoreschedule :: CatalogsFeedProcessingSchedule -- ^ 
  , catalogsHotelFeedStatus :: CatalogsStatus -- ^ 
  , catalogsHotelFeedDefaultUnderscorecurrency :: NullableCurrency -- ^ 
  , catalogsHotelFeedDefaultUnderscorelocale :: Text -- ^ The locale used within a feed for product descriptions.
  , catalogsHotelFeedCatalogUnderscoreid :: Text -- ^ Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelFeed where
  parseJSON = genericParseJSON optionsCatalogsHotelFeed
instance ToJSON CatalogsHotelFeed where
  toJSON = genericToJSON optionsCatalogsHotelFeed

optionsCatalogsHotelFeed :: Options
optionsCatalogsHotelFeed =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelFeedCreatedUnderscoreat", "created_at")
      , ("catalogsHotelFeedId", "id")
      , ("catalogsHotelFeedUpdatedUnderscoreat", "updated_at")
      , ("catalogsHotelFeedName", "name")
      , ("catalogsHotelFeedFormat", "format")
      , ("catalogsHotelFeedCatalogUnderscoretype", "catalog_type")
      , ("catalogsHotelFeedCredentials", "credentials")
      , ("catalogsHotelFeedLocation", "location")
      , ("catalogsHotelFeedPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("catalogsHotelFeedStatus", "status")
      , ("catalogsHotelFeedDefaultUnderscorecurrency", "default_currency")
      , ("catalogsHotelFeedDefaultUnderscorelocale", "default_locale")
      , ("catalogsHotelFeedCatalogUnderscoreid", "catalog_id")
      ]


-- | Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
data CatalogsHotelFeedsCreateRequest = CatalogsHotelFeedsCreateRequest
  { catalogsHotelFeedsCreateRequestDefaultUnderscorecurrency :: Maybe NullableCurrency -- ^ 
  , catalogsHotelFeedsCreateRequestName :: Text -- ^ A human-friendly name associated to a given feed.
  , catalogsHotelFeedsCreateRequestFormat :: CatalogsFormat -- ^ 
  , catalogsHotelFeedsCreateRequestDefaultUnderscorelocale :: CatalogsFeedsCreateRequestDefaultLocale -- ^ 
  , catalogsHotelFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials -- ^ 
  , catalogsHotelFeedsCreateRequestLocation :: Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsHotelFeedsCreateRequestPreferredUnderscoreprocessingUnderscoreschedule :: Maybe CatalogsFeedProcessingSchedule -- ^ 
  , catalogsHotelFeedsCreateRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsHotelFeedsCreateRequestCatalogUnderscoreid :: Maybe Text -- ^ Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelFeedsCreateRequest where
  parseJSON = genericParseJSON optionsCatalogsHotelFeedsCreateRequest
instance ToJSON CatalogsHotelFeedsCreateRequest where
  toJSON = genericToJSON optionsCatalogsHotelFeedsCreateRequest

optionsCatalogsHotelFeedsCreateRequest :: Options
optionsCatalogsHotelFeedsCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelFeedsCreateRequestDefaultUnderscorecurrency", "default_currency")
      , ("catalogsHotelFeedsCreateRequestName", "name")
      , ("catalogsHotelFeedsCreateRequestFormat", "format")
      , ("catalogsHotelFeedsCreateRequestDefaultUnderscorelocale", "default_locale")
      , ("catalogsHotelFeedsCreateRequestCredentials", "credentials")
      , ("catalogsHotelFeedsCreateRequestLocation", "location")
      , ("catalogsHotelFeedsCreateRequestPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("catalogsHotelFeedsCreateRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsHotelFeedsCreateRequestCatalogUnderscoreid", "catalog_id")
      ]


-- | Request object for updating a feed.
data CatalogsHotelFeedsUpdateRequest = CatalogsHotelFeedsUpdateRequest
  { catalogsHotelFeedsUpdateRequestDefaultUnderscorecurrency :: Maybe NullableCurrency -- ^ 
  , catalogsHotelFeedsUpdateRequestName :: Maybe Text -- ^ A human-friendly name associated to a given feed.
  , catalogsHotelFeedsUpdateRequestFormat :: Maybe CatalogsFormat -- ^ 
  , catalogsHotelFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials -- ^ 
  , catalogsHotelFeedsUpdateRequestLocation :: Maybe Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsHotelFeedsUpdateRequestPreferredUnderscoreprocessingUnderscoreschedule :: Maybe CatalogsFeedProcessingSchedule -- ^ 
  , catalogsHotelFeedsUpdateRequestStatus :: Maybe CatalogsStatus -- ^ 
  , catalogsHotelFeedsUpdateRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelFeedsUpdateRequest where
  parseJSON = genericParseJSON optionsCatalogsHotelFeedsUpdateRequest
instance ToJSON CatalogsHotelFeedsUpdateRequest where
  toJSON = genericToJSON optionsCatalogsHotelFeedsUpdateRequest

optionsCatalogsHotelFeedsUpdateRequest :: Options
optionsCatalogsHotelFeedsUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelFeedsUpdateRequestDefaultUnderscorecurrency", "default_currency")
      , ("catalogsHotelFeedsUpdateRequestName", "name")
      , ("catalogsHotelFeedsUpdateRequestFormat", "format")
      , ("catalogsHotelFeedsUpdateRequestCredentials", "credentials")
      , ("catalogsHotelFeedsUpdateRequestLocation", "location")
      , ("catalogsHotelFeedsUpdateRequestPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("catalogsHotelFeedsUpdateRequestStatus", "status")
      , ("catalogsHotelFeedsUpdateRequestCatalogUnderscoretype", "catalog_type")
      ]


-- | If specified, you must provide all properties
data CatalogsHotelGuestRatings = CatalogsHotelGuestRatings
  { catalogsHotelGuestRatingsScore :: Maybe Double -- ^ Your hotel's rating.
  , catalogsHotelGuestRatingsNumberUnderscoreofUnderscorereviewers :: Maybe Int -- ^ Total number of people who have rated this hotel.
  , catalogsHotelGuestRatingsMaxUnderscorescore :: Maybe Double -- ^ Max value for the hotel rating score.
  , catalogsHotelGuestRatingsRatingUnderscoresystem :: Maybe Text -- ^ System you use for guest reviews.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelGuestRatings where
  parseJSON = genericParseJSON optionsCatalogsHotelGuestRatings
instance ToJSON CatalogsHotelGuestRatings where
  toJSON = genericToJSON optionsCatalogsHotelGuestRatings

optionsCatalogsHotelGuestRatings :: Options
optionsCatalogsHotelGuestRatings =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelGuestRatingsScore", "score")
      , ("catalogsHotelGuestRatingsNumberUnderscoreofUnderscorereviewers", "number_of_reviewers")
      , ("catalogsHotelGuestRatingsMaxUnderscorescore", "max_score")
      , ("catalogsHotelGuestRatingsRatingUnderscoresystem", "rating_system")
      ]


-- | Object describing a hotel item error
data CatalogsHotelItemErrorResponse = CatalogsHotelItemErrorResponse
  { catalogsHotelItemErrorResponseCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsHotelItemErrorResponseHotelUnderscoreid :: Maybe Text -- ^ The catalog hotel id in the merchant namespace
  , catalogsHotelItemErrorResponseErrors :: Maybe [ItemValidationEvent] -- ^ Array with the errors for the item id requested
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelItemErrorResponse where
  parseJSON = genericParseJSON optionsCatalogsHotelItemErrorResponse
instance ToJSON CatalogsHotelItemErrorResponse where
  toJSON = genericToJSON optionsCatalogsHotelItemErrorResponse

optionsCatalogsHotelItemErrorResponse :: Options
optionsCatalogsHotelItemErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelItemErrorResponseCatalogUnderscoretype", "catalog_type")
      , ("catalogsHotelItemErrorResponseHotelUnderscoreid", "hotel_id")
      , ("catalogsHotelItemErrorResponseErrors", "errors")
      ]


-- | Object describing a hotel record
data CatalogsHotelItemResponse = CatalogsHotelItemResponse
  { catalogsHotelItemResponseCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsHotelItemResponseHotelUnderscoreid :: Maybe Text -- ^ The catalog hotel id in the merchant namespace
  , catalogsHotelItemResponsePins :: Maybe [Pin] -- ^ The pins mapped to the item
  , catalogsHotelItemResponseAttributes :: Maybe CatalogsHotelAttributes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelItemResponse where
  parseJSON = genericParseJSON optionsCatalogsHotelItemResponse
instance ToJSON CatalogsHotelItemResponse where
  toJSON = genericToJSON optionsCatalogsHotelItemResponse

optionsCatalogsHotelItemResponse :: Options
optionsCatalogsHotelItemResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelItemResponseCatalogUnderscoretype", "catalog_type")
      , ("catalogsHotelItemResponseHotelUnderscoreid", "hotel_id")
      , ("catalogsHotelItemResponsePins", "pins")
      , ("catalogsHotelItemResponseAttributes", "attributes")
      ]


-- | Object describing the catalogs hotel items batch
data CatalogsHotelItemsBatch = CatalogsHotelItemsBatch
  { catalogsHotelItemsBatchBatchUnderscoreid :: Maybe Text -- ^ Id of the catalogs items batch
  , catalogsHotelItemsBatchCreatedUnderscoretime :: Maybe UTCTime -- ^ Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
  , catalogsHotelItemsBatchCompletedUnderscoretime :: Maybe UTCTime -- ^ Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
  , catalogsHotelItemsBatchStatus :: Maybe BatchOperationStatus -- ^ 
  , catalogsHotelItemsBatchCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsHotelItemsBatchItems :: Maybe [HotelProcessingRecord] -- ^ Array with the catalogs items processing records part of the catalogs items batch
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelItemsBatch where
  parseJSON = genericParseJSON optionsCatalogsHotelItemsBatch
instance ToJSON CatalogsHotelItemsBatch where
  toJSON = genericToJSON optionsCatalogsHotelItemsBatch

optionsCatalogsHotelItemsBatch :: Options
optionsCatalogsHotelItemsBatch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelItemsBatchBatchUnderscoreid", "batch_id")
      , ("catalogsHotelItemsBatchCreatedUnderscoretime", "created_time")
      , ("catalogsHotelItemsBatchCompletedUnderscoretime", "completed_time")
      , ("catalogsHotelItemsBatchStatus", "status")
      , ("catalogsHotelItemsBatchCatalogUnderscoretype", "catalog_type")
      , ("catalogsHotelItemsBatchItems", "items")
      ]


-- | 
data CatalogsHotelItemsFilter = CatalogsHotelItemsFilter
  { catalogsHotelItemsFilterCatalogUnderscoretype :: Text -- ^ 
  , catalogsHotelItemsFilterHotelUnderscoreids :: [Text] -- ^ 
  , catalogsHotelItemsFilterCatalogUnderscoreid :: Maybe Text -- ^ Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelItemsFilter where
  parseJSON = genericParseJSON optionsCatalogsHotelItemsFilter
instance ToJSON CatalogsHotelItemsFilter where
  toJSON = genericToJSON optionsCatalogsHotelItemsFilter

optionsCatalogsHotelItemsFilter :: Options
optionsCatalogsHotelItemsFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelItemsFilterCatalogUnderscoretype", "catalog_type")
      , ("catalogsHotelItemsFilterHotelUnderscoreids", "hotel_ids")
      , ("catalogsHotelItemsFilterCatalogUnderscoreid", "catalog_id")
      ]


-- | 
data CatalogsHotelProductGroup = CatalogsHotelProductGroup
  { catalogsHotelProductGroupCatalogUnderscoretype :: Text -- ^ 
  , catalogsHotelProductGroupId :: Text -- ^ ID of the hotel product group.
  , catalogsHotelProductGroupName :: Maybe Text -- ^ Name of hotel product group
  , catalogsHotelProductGroupDescription :: Maybe Text -- ^ 
  , catalogsHotelProductGroupFilters :: CatalogsHotelProductGroupFilters -- ^ 
  , catalogsHotelProductGroupCreatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of when catalog product group was created.
  , catalogsHotelProductGroupUpdatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of last time catalog product group was updated.
  , catalogsHotelProductGroupCatalogUnderscoreid :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelProductGroup where
  parseJSON = genericParseJSON optionsCatalogsHotelProductGroup
instance ToJSON CatalogsHotelProductGroup where
  toJSON = genericToJSON optionsCatalogsHotelProductGroup

optionsCatalogsHotelProductGroup :: Options
optionsCatalogsHotelProductGroup =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelProductGroupCatalogUnderscoretype", "catalog_type")
      , ("catalogsHotelProductGroupId", "id")
      , ("catalogsHotelProductGroupName", "name")
      , ("catalogsHotelProductGroupDescription", "description")
      , ("catalogsHotelProductGroupFilters", "filters")
      , ("catalogsHotelProductGroupCreatedUnderscoreat", "created_at")
      , ("catalogsHotelProductGroupUpdatedUnderscoreat", "updated_at")
      , ("catalogsHotelProductGroupCatalogUnderscoreid", "catalog_id")
      ]


-- | Request object for creating a hotel product group.
data CatalogsHotelProductGroupCreateRequest = CatalogsHotelProductGroupCreateRequest
  { catalogsHotelProductGroupCreateRequestCatalogUnderscoretype :: Text -- ^ 
  , catalogsHotelProductGroupCreateRequestName :: Text -- ^ 
  , catalogsHotelProductGroupCreateRequestDescription :: Maybe Text -- ^ 
  , catalogsHotelProductGroupCreateRequestFilters :: CatalogsHotelProductGroupFilters -- ^ 
  , catalogsHotelProductGroupCreateRequestCatalogUnderscoreid :: Text -- ^ Catalog id pertaining to the hotel product group.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelProductGroupCreateRequest where
  parseJSON = genericParseJSON optionsCatalogsHotelProductGroupCreateRequest
instance ToJSON CatalogsHotelProductGroupCreateRequest where
  toJSON = genericToJSON optionsCatalogsHotelProductGroupCreateRequest

optionsCatalogsHotelProductGroupCreateRequest :: Options
optionsCatalogsHotelProductGroupCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelProductGroupCreateRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsHotelProductGroupCreateRequestName", "name")
      , ("catalogsHotelProductGroupCreateRequestDescription", "description")
      , ("catalogsHotelProductGroupCreateRequestFilters", "filters")
      , ("catalogsHotelProductGroupCreateRequestCatalogUnderscoreid", "catalog_id")
      ]


-- | 
data CatalogsHotelProductGroupFilterKeys = CatalogsHotelProductGroupFilterKeys
  { catalogsHotelProductGroupFilterKeysPRICE :: CatalogsProductGroupPricingCurrencyCriteria -- ^ 
  , catalogsHotelProductGroupFilterKeysHOTELUnderscoreID :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsHotelProductGroupFilterKeysBRAND :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsHotelProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore0 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsHotelProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore1 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsHotelProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore2 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsHotelProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore3 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsHotelProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore4 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsHotelProductGroupFilterKeysCOUNTRY :: CatalogsProductGroupMultipleCountriesCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelProductGroupFilterKeys where
  parseJSON = genericParseJSON optionsCatalogsHotelProductGroupFilterKeys
instance ToJSON CatalogsHotelProductGroupFilterKeys where
  toJSON = genericToJSON optionsCatalogsHotelProductGroupFilterKeys

optionsCatalogsHotelProductGroupFilterKeys :: Options
optionsCatalogsHotelProductGroupFilterKeys =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelProductGroupFilterKeysPRICE", "PRICE")
      , ("catalogsHotelProductGroupFilterKeysHOTELUnderscoreID", "HOTEL_ID")
      , ("catalogsHotelProductGroupFilterKeysBRAND", "BRAND")
      , ("catalogsHotelProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore0", "CUSTOM_LABEL_0")
      , ("catalogsHotelProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore1", "CUSTOM_LABEL_1")
      , ("catalogsHotelProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore2", "CUSTOM_LABEL_2")
      , ("catalogsHotelProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore3", "CUSTOM_LABEL_3")
      , ("catalogsHotelProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore4", "CUSTOM_LABEL_4")
      , ("catalogsHotelProductGroupFilterKeysCOUNTRY", "COUNTRY")
      ]


-- | Object holding a group of filters for a hotel product group
data CatalogsHotelProductGroupFilters = CatalogsHotelProductGroupFilters
  { catalogsHotelProductGroupFiltersAnyUnderscoreof :: [CatalogsHotelProductGroupFilterKeys] -- ^ 
  , catalogsHotelProductGroupFiltersAllUnderscoreof :: [CatalogsHotelProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelProductGroupFilters where
  parseJSON = genericParseJSON optionsCatalogsHotelProductGroupFilters
instance ToJSON CatalogsHotelProductGroupFilters where
  toJSON = genericToJSON optionsCatalogsHotelProductGroupFilters

optionsCatalogsHotelProductGroupFilters :: Options
optionsCatalogsHotelProductGroupFilters =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelProductGroupFiltersAnyUnderscoreof", "any_of")
      , ("catalogsHotelProductGroupFiltersAllUnderscoreof", "all_of")
      ]


-- | 
data CatalogsHotelProductGroupFiltersAllOf = CatalogsHotelProductGroupFiltersAllOf
  { catalogsHotelProductGroupFiltersAllOfAllUnderscoreof :: [CatalogsHotelProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelProductGroupFiltersAllOf where
  parseJSON = genericParseJSON optionsCatalogsHotelProductGroupFiltersAllOf
instance ToJSON CatalogsHotelProductGroupFiltersAllOf where
  toJSON = genericToJSON optionsCatalogsHotelProductGroupFiltersAllOf

optionsCatalogsHotelProductGroupFiltersAllOf :: Options
optionsCatalogsHotelProductGroupFiltersAllOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelProductGroupFiltersAllOfAllUnderscoreof", "all_of")
      ]


-- | 
data CatalogsHotelProductGroupFiltersAnyOf = CatalogsHotelProductGroupFiltersAnyOf
  { catalogsHotelProductGroupFiltersAnyOfAnyUnderscoreof :: [CatalogsHotelProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelProductGroupFiltersAnyOf where
  parseJSON = genericParseJSON optionsCatalogsHotelProductGroupFiltersAnyOf
instance ToJSON CatalogsHotelProductGroupFiltersAnyOf where
  toJSON = genericToJSON optionsCatalogsHotelProductGroupFiltersAnyOf

optionsCatalogsHotelProductGroupFiltersAnyOf :: Options
optionsCatalogsHotelProductGroupFiltersAnyOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelProductGroupFiltersAnyOfAnyUnderscoreof", "any_of")
      ]


-- | Request object for updating a hotel product group.
data CatalogsHotelProductGroupUpdateRequest = CatalogsHotelProductGroupUpdateRequest
  { catalogsHotelProductGroupUpdateRequestCatalogUnderscoretype :: Maybe Text -- ^ 
  , catalogsHotelProductGroupUpdateRequestName :: Maybe Text -- ^ 
  , catalogsHotelProductGroupUpdateRequestDescription :: Maybe Text -- ^ 
  , catalogsHotelProductGroupUpdateRequestFilters :: Maybe CatalogsHotelProductGroupFilters -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsHotelProductGroupUpdateRequest where
  parseJSON = genericParseJSON optionsCatalogsHotelProductGroupUpdateRequest
instance ToJSON CatalogsHotelProductGroupUpdateRequest where
  toJSON = genericToJSON optionsCatalogsHotelProductGroupUpdateRequest

optionsCatalogsHotelProductGroupUpdateRequest :: Options
optionsCatalogsHotelProductGroupUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsHotelProductGroupUpdateRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsHotelProductGroupUpdateRequestName", "name")
      , ("catalogsHotelProductGroupUpdateRequestDescription", "description")
      , ("catalogsHotelProductGroupUpdateRequestFilters", "filters")
      ]


-- | 
data CatalogsItemValidationDetails = CatalogsItemValidationDetails
  { catalogsItemValidationDetailsAttributeUnderscorename :: NullableCatalogsItemFieldType -- ^ 
  , catalogsItemValidationDetailsProvidedUnderscorevalue :: Text -- ^ Provided value that caused the validation issue.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemValidationDetails where
  parseJSON = genericParseJSON optionsCatalogsItemValidationDetails
instance ToJSON CatalogsItemValidationDetails where
  toJSON = genericToJSON optionsCatalogsItemValidationDetails

optionsCatalogsItemValidationDetails :: Options
optionsCatalogsItemValidationDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemValidationDetailsAttributeUnderscorename", "attribute_name")
      , ("catalogsItemValidationDetailsProvidedUnderscorevalue", "provided_value")
      ]


-- | 
data CatalogsItemValidationErrors = CatalogsItemValidationErrors
  { catalogsItemValidationErrorsADULTUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsADWORDSUnderscoreFORMATUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsAVAILABILITYUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsBLOCKLISTEDUnderscoreIMAGEUnderscoreSIGNATURE :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsDESCRIPTIONUnderscoreMISSING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsDUPLICATEUnderscorePRODUCTS :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsIMAGEUnderscoreLINKUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsIMAGEUnderscoreLINKUnderscoreMISSING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsINVALIDUnderscoreDOMAIN :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsITEMIDUnderscoreMISSING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsITEMUnderscoreMAINUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsLINKUnderscoreFORMATUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsLISTUnderscorePRICEUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsMAXUnderscoreITEMSUnderscorePERUnderscoreITEMUnderscoreGROUPUnderscoreEXCEEDED :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsPARSEUnderscoreLINEUnderscoreERROR :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsPINJOINUnderscoreCONTENTUnderscoreUNSAFE :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsPRICEUnderscoreCANNOTUnderscoreBEUnderscoreDETERMINED :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsPRICEUnderscoreMISSING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsPRODUCTUnderscoreLINKUnderscoreMISSING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsPRODUCTUnderscorePRICEUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationErrorsTITLEUnderscoreMISSING :: Maybe CatalogsItemValidationDetails -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemValidationErrors where
  parseJSON = genericParseJSON optionsCatalogsItemValidationErrors
instance ToJSON CatalogsItemValidationErrors where
  toJSON = genericToJSON optionsCatalogsItemValidationErrors

optionsCatalogsItemValidationErrors :: Options
optionsCatalogsItemValidationErrors =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemValidationErrorsADULTUnderscoreINVALID", "ADULT_INVALID")
      , ("catalogsItemValidationErrorsADWORDSUnderscoreFORMATUnderscoreINVALID", "ADWORDS_FORMAT_INVALID")
      , ("catalogsItemValidationErrorsAVAILABILITYUnderscoreINVALID", "AVAILABILITY_INVALID")
      , ("catalogsItemValidationErrorsBLOCKLISTEDUnderscoreIMAGEUnderscoreSIGNATURE", "BLOCKLISTED_IMAGE_SIGNATURE")
      , ("catalogsItemValidationErrorsDESCRIPTIONUnderscoreMISSING", "DESCRIPTION_MISSING")
      , ("catalogsItemValidationErrorsDUPLICATEUnderscorePRODUCTS", "DUPLICATE_PRODUCTS")
      , ("catalogsItemValidationErrorsIMAGEUnderscoreLINKUnderscoreINVALID", "IMAGE_LINK_INVALID")
      , ("catalogsItemValidationErrorsIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "IMAGE_LINK_LENGTH_TOO_LONG")
      , ("catalogsItemValidationErrorsIMAGEUnderscoreLINKUnderscoreMISSING", "IMAGE_LINK_MISSING")
      , ("catalogsItemValidationErrorsINVALIDUnderscoreDOMAIN", "INVALID_DOMAIN")
      , ("catalogsItemValidationErrorsITEMIDUnderscoreMISSING", "ITEMID_MISSING")
      , ("catalogsItemValidationErrorsITEMUnderscoreMAINUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE", "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
      , ("catalogsItemValidationErrorsLINKUnderscoreFORMATUnderscoreINVALID", "LINK_FORMAT_INVALID")
      , ("catalogsItemValidationErrorsLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "LINK_LENGTH_TOO_LONG")
      , ("catalogsItemValidationErrorsLISTUnderscorePRICEUnderscoreINVALID", "LIST_PRICE_INVALID")
      , ("catalogsItemValidationErrorsMAXUnderscoreITEMSUnderscorePERUnderscoreITEMUnderscoreGROUPUnderscoreEXCEEDED", "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
      , ("catalogsItemValidationErrorsPARSEUnderscoreLINEUnderscoreERROR", "PARSE_LINE_ERROR")
      , ("catalogsItemValidationErrorsPINJOINUnderscoreCONTENTUnderscoreUNSAFE", "PINJOIN_CONTENT_UNSAFE")
      , ("catalogsItemValidationErrorsPRICEUnderscoreCANNOTUnderscoreBEUnderscoreDETERMINED", "PRICE_CANNOT_BE_DETERMINED")
      , ("catalogsItemValidationErrorsPRICEUnderscoreMISSING", "PRICE_MISSING")
      , ("catalogsItemValidationErrorsPRODUCTUnderscoreLINKUnderscoreMISSING", "PRODUCT_LINK_MISSING")
      , ("catalogsItemValidationErrorsPRODUCTUnderscorePRICEUnderscoreINVALID", "PRODUCT_PRICE_INVALID")
      , ("catalogsItemValidationErrorsTITLEUnderscoreMISSING", "TITLE_MISSING")
      ]


-- | 
data CatalogsItemValidationIssue = CatalogsItemValidationIssue
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemValidationIssue where
  parseJSON = genericParseJSON optionsCatalogsItemValidationIssue
instance ToJSON CatalogsItemValidationIssue where
  toJSON = genericToJSON optionsCatalogsItemValidationIssue

optionsCatalogsItemValidationIssue :: Options
optionsCatalogsItemValidationIssue =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CatalogsItemValidationIssues = CatalogsItemValidationIssues
  { catalogsItemValidationIssuesItemUnderscorenumber :: Int -- ^ Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
  , catalogsItemValidationIssuesItemUnderscoreid :: Text -- ^ The merchant-created unique ID that represents the product.
  , catalogsItemValidationIssuesErrors :: CatalogsItemValidationErrors -- ^ 
  , catalogsItemValidationIssuesWarnings :: CatalogsItemValidationWarnings -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemValidationIssues where
  parseJSON = genericParseJSON optionsCatalogsItemValidationIssues
instance ToJSON CatalogsItemValidationIssues where
  toJSON = genericToJSON optionsCatalogsItemValidationIssues

optionsCatalogsItemValidationIssues :: Options
optionsCatalogsItemValidationIssues =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemValidationIssuesItemUnderscorenumber", "item_number")
      , ("catalogsItemValidationIssuesItemUnderscoreid", "item_id")
      , ("catalogsItemValidationIssuesErrors", "errors")
      , ("catalogsItemValidationIssuesWarnings", "warnings")
      ]


-- | 
data CatalogsItemValidationWarnings = CatalogsItemValidationWarnings
  { catalogsItemValidationWarningsADUnderscoreLINKUnderscoreFORMATUnderscoreWARNING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsADUnderscoreLINKUnderscoreSAMEUnderscoreASUnderscoreLINK :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreWARNING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsADWORDSUnderscoreFORMATUnderscoreWARNING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsADWORDSUnderscoreSAMEUnderscoreASUnderscoreLINK :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsAGEUnderscoreGROUPUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsSIZEUnderscoreSYSTEMUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsANDROIDUnderscoreDEEPUnderscoreLINKUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsAVAILABILITYUnderscoreDATEUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsCOUNTRYUnderscoreDOESUnderscoreNOTUnderscoreMAPUnderscoreTOUnderscoreCURRENCY :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsCUSTOMUnderscoreLABELUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsDESCRIPTIONUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsEXPIRATIONUnderscoreDATEUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsGENDERUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsGTINUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsIMAGEUnderscoreLINKUnderscoreWARNING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsIOSUnderscoreDEEPUnderscoreLINKUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsISUnderscoreBUNDLEUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsITEMUnderscoreADDITIONALUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsLINKUnderscoreFORMATUnderscoreWARNING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsMINUnderscoreADUnderscorePRICEUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsMPNUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsMULTIPACKUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsOPTIONALUnderscoreCONDITIONUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsOPTIONALUnderscoreCONDITIONUnderscoreMISSING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsOPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsOPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreMISSING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsPRODUCTUnderscoreCATEGORYUnderscoreDEPTHUnderscoreWARNING :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsPRODUCTUnderscoreTYPEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsSALESUnderscorePRICEUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsSALESUnderscorePRICEUnderscoreTOOUnderscoreLOW :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsSALESUnderscorePRICEUnderscoreTOOUnderscoreHIGH :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsSALEUnderscoreDATEUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsSHIPPINGUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsSHIPPINGUnderscoreHEIGHTUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsSHIPPINGUnderscoreWEIGHTUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsSHIPPINGUnderscoreWIDTHUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsSIZEUnderscoreTYPEUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsTAXUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsTITLEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsTOOUnderscoreMANYUnderscoreADDITIONALUnderscoreIMAGEUnderscoreLINKS :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsUTMUnderscoreSOURCEUnderscoreAUTOUnderscoreCORRECTED :: Maybe CatalogsItemValidationDetails -- ^ 
  , catalogsItemValidationWarningsWEIGHTUnderscoreUNITUnderscoreINVALID :: Maybe CatalogsItemValidationDetails -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemValidationWarnings where
  parseJSON = genericParseJSON optionsCatalogsItemValidationWarnings
instance ToJSON CatalogsItemValidationWarnings where
  toJSON = genericToJSON optionsCatalogsItemValidationWarnings

optionsCatalogsItemValidationWarnings :: Options
optionsCatalogsItemValidationWarnings =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemValidationWarningsADUnderscoreLINKUnderscoreFORMATUnderscoreWARNING", "AD_LINK_FORMAT_WARNING")
      , ("catalogsItemValidationWarningsADUnderscoreLINKUnderscoreSAMEUnderscoreASUnderscoreLINK", "AD_LINK_SAME_AS_LINK")
      , ("catalogsItemValidationWarningsADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")
      , ("catalogsItemValidationWarningsADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreWARNING", "ADDITIONAL_IMAGE_LINK_WARNING")
      , ("catalogsItemValidationWarningsADWORDSUnderscoreFORMATUnderscoreWARNING", "ADWORDS_FORMAT_WARNING")
      , ("catalogsItemValidationWarningsADWORDSUnderscoreSAMEUnderscoreASUnderscoreLINK", "ADWORDS_SAME_AS_LINK")
      , ("catalogsItemValidationWarningsAGEUnderscoreGROUPUnderscoreINVALID", "AGE_GROUP_INVALID")
      , ("catalogsItemValidationWarningsSIZEUnderscoreSYSTEMUnderscoreINVALID", "SIZE_SYSTEM_INVALID")
      , ("catalogsItemValidationWarningsANDROIDUnderscoreDEEPUnderscoreLINKUnderscoreINVALID", "ANDROID_DEEP_LINK_INVALID")
      , ("catalogsItemValidationWarningsAVAILABILITYUnderscoreDATEUnderscoreINVALID", "AVAILABILITY_DATE_INVALID")
      , ("catalogsItemValidationWarningsCOUNTRYUnderscoreDOESUnderscoreNOTUnderscoreMAPUnderscoreTOUnderscoreCURRENCY", "COUNTRY_DOES_NOT_MAP_TO_CURRENCY")
      , ("catalogsItemValidationWarningsCUSTOMUnderscoreLABELUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "CUSTOM_LABEL_LENGTH_TOO_LONG")
      , ("catalogsItemValidationWarningsDESCRIPTIONUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "DESCRIPTION_LENGTH_TOO_LONG")
      , ("catalogsItemValidationWarningsEXPIRATIONUnderscoreDATEUnderscoreINVALID", "EXPIRATION_DATE_INVALID")
      , ("catalogsItemValidationWarningsGENDERUnderscoreINVALID", "GENDER_INVALID")
      , ("catalogsItemValidationWarningsGTINUnderscoreINVALID", "GTIN_INVALID")
      , ("catalogsItemValidationWarningsIMAGEUnderscoreLINKUnderscoreWARNING", "IMAGE_LINK_WARNING")
      , ("catalogsItemValidationWarningsIOSUnderscoreDEEPUnderscoreLINKUnderscoreINVALID", "IOS_DEEP_LINK_INVALID")
      , ("catalogsItemValidationWarningsISUnderscoreBUNDLEUnderscoreINVALID", "IS_BUNDLE_INVALID")
      , ("catalogsItemValidationWarningsITEMUnderscoreADDITIONALUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE", "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")
      , ("catalogsItemValidationWarningsLINKUnderscoreFORMATUnderscoreWARNING", "LINK_FORMAT_WARNING")
      , ("catalogsItemValidationWarningsMINUnderscoreADUnderscorePRICEUnderscoreINVALID", "MIN_AD_PRICE_INVALID")
      , ("catalogsItemValidationWarningsMPNUnderscoreINVALID", "MPN_INVALID")
      , ("catalogsItemValidationWarningsMULTIPACKUnderscoreINVALID", "MULTIPACK_INVALID")
      , ("catalogsItemValidationWarningsOPTIONALUnderscoreCONDITIONUnderscoreINVALID", "OPTIONAL_CONDITION_INVALID")
      , ("catalogsItemValidationWarningsOPTIONALUnderscoreCONDITIONUnderscoreMISSING", "OPTIONAL_CONDITION_MISSING")
      , ("catalogsItemValidationWarningsOPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreINVALID", "OPTIONAL_PRODUCT_CATEGORY_INVALID")
      , ("catalogsItemValidationWarningsOPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreMISSING", "OPTIONAL_PRODUCT_CATEGORY_MISSING")
      , ("catalogsItemValidationWarningsPRODUCTUnderscoreCATEGORYUnderscoreDEPTHUnderscoreWARNING", "PRODUCT_CATEGORY_DEPTH_WARNING")
      , ("catalogsItemValidationWarningsPRODUCTUnderscoreTYPEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "PRODUCT_TYPE_LENGTH_TOO_LONG")
      , ("catalogsItemValidationWarningsSALESUnderscorePRICEUnderscoreINVALID", "SALES_PRICE_INVALID")
      , ("catalogsItemValidationWarningsSALESUnderscorePRICEUnderscoreTOOUnderscoreLOW", "SALES_PRICE_TOO_LOW")
      , ("catalogsItemValidationWarningsSALESUnderscorePRICEUnderscoreTOOUnderscoreHIGH", "SALES_PRICE_TOO_HIGH")
      , ("catalogsItemValidationWarningsSALEUnderscoreDATEUnderscoreINVALID", "SALE_DATE_INVALID")
      , ("catalogsItemValidationWarningsSHIPPINGUnderscoreINVALID", "SHIPPING_INVALID")
      , ("catalogsItemValidationWarningsSHIPPINGUnderscoreHEIGHTUnderscoreINVALID", "SHIPPING_HEIGHT_INVALID")
      , ("catalogsItemValidationWarningsSHIPPINGUnderscoreWEIGHTUnderscoreINVALID", "SHIPPING_WEIGHT_INVALID")
      , ("catalogsItemValidationWarningsSHIPPINGUnderscoreWIDTHUnderscoreINVALID", "SHIPPING_WIDTH_INVALID")
      , ("catalogsItemValidationWarningsSIZEUnderscoreTYPEUnderscoreINVALID", "SIZE_TYPE_INVALID")
      , ("catalogsItemValidationWarningsTAXUnderscoreINVALID", "TAX_INVALID")
      , ("catalogsItemValidationWarningsTITLEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG", "TITLE_LENGTH_TOO_LONG")
      , ("catalogsItemValidationWarningsTOOUnderscoreMANYUnderscoreADDITIONALUnderscoreIMAGEUnderscoreLINKS", "TOO_MANY_ADDITIONAL_IMAGE_LINKS")
      , ("catalogsItemValidationWarningsUTMUnderscoreSOURCEUnderscoreAUTOUnderscoreCORRECTED", "UTM_SOURCE_AUTO_CORRECTED")
      , ("catalogsItemValidationWarningsWEIGHTUnderscoreUNITUnderscoreINVALID", "WEIGHT_UNIT_INVALID")
      ]


-- | Response object of catalogs items
data CatalogsItems = CatalogsItems
  { catalogsItemsItems :: Maybe [ItemResponse] -- ^ Array with catalogs items
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItems where
  parseJSON = genericParseJSON optionsCatalogsItems
instance ToJSON CatalogsItems where
  toJSON = genericToJSON optionsCatalogsItems

optionsCatalogsItems :: Options
optionsCatalogsItems =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemsItems", "items")
      ]


-- | Object describing the catalogs items batch
data CatalogsItemsBatch = CatalogsItemsBatch
  { catalogsItemsBatchCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsItemsBatchBatchUnderscoreid :: Maybe Text -- ^ Id of the catalogs items batch
  , catalogsItemsBatchCreatedUnderscoretime :: Maybe UTCTime -- ^ Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
  , catalogsItemsBatchCompletedUnderscoretime :: Maybe UTCTime -- ^ Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
  , catalogsItemsBatchStatus :: Maybe BatchOperationStatus -- ^ 
  , catalogsItemsBatchItems :: Maybe [HotelProcessingRecord] -- ^ Array with the catalogs items processing records part of the catalogs items batch
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemsBatch where
  parseJSON = genericParseJSON optionsCatalogsItemsBatch
instance ToJSON CatalogsItemsBatch where
  toJSON = genericToJSON optionsCatalogsItemsBatch

optionsCatalogsItemsBatch :: Options
optionsCatalogsItemsBatch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemsBatchCatalogUnderscoretype", "catalog_type")
      , ("catalogsItemsBatchBatchUnderscoreid", "batch_id")
      , ("catalogsItemsBatchCreatedUnderscoretime", "created_time")
      , ("catalogsItemsBatchCompletedUnderscoretime", "completed_time")
      , ("catalogsItemsBatchStatus", "status")
      , ("catalogsItemsBatchItems", "items")
      ]


-- | Request object of catalogs items batch
data CatalogsItemsBatchRequest = CatalogsItemsBatchRequest
  { catalogsItemsBatchRequestCountry :: Country -- ^ 
  , catalogsItemsBatchRequestLanguage :: Language -- ^ 
  , catalogsItemsBatchRequestOperation :: BatchOperation -- ^ 
  , catalogsItemsBatchRequestItems :: [ItemDeleteBatchRecord] -- ^ Array with catalogs items
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemsBatchRequest where
  parseJSON = genericParseJSON optionsCatalogsItemsBatchRequest
instance ToJSON CatalogsItemsBatchRequest where
  toJSON = genericToJSON optionsCatalogsItemsBatchRequest

optionsCatalogsItemsBatchRequest :: Options
optionsCatalogsItemsBatchRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemsBatchRequestCountry", "country")
      , ("catalogsItemsBatchRequestLanguage", "language")
      , ("catalogsItemsBatchRequestOperation", "operation")
      , ("catalogsItemsBatchRequestItems", "items")
      ]


-- | Request object to create catalogs items
data CatalogsItemsCreateBatchRequest = CatalogsItemsCreateBatchRequest
  { catalogsItemsCreateBatchRequestCountry :: Country -- ^ 
  , catalogsItemsCreateBatchRequestLanguage :: Language -- ^ 
  , catalogsItemsCreateBatchRequestOperation :: BatchOperation -- ^ 
  , catalogsItemsCreateBatchRequestItems :: [ItemCreateBatchRecord] -- ^ Array with catalogs items
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemsCreateBatchRequest where
  parseJSON = genericParseJSON optionsCatalogsItemsCreateBatchRequest
instance ToJSON CatalogsItemsCreateBatchRequest where
  toJSON = genericToJSON optionsCatalogsItemsCreateBatchRequest

optionsCatalogsItemsCreateBatchRequest :: Options
optionsCatalogsItemsCreateBatchRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemsCreateBatchRequestCountry", "country")
      , ("catalogsItemsCreateBatchRequestLanguage", "language")
      , ("catalogsItemsCreateBatchRequestOperation", "operation")
      , ("catalogsItemsCreateBatchRequestItems", "items")
      ]


-- | Request object to delete catalogs items
data CatalogsItemsDeleteBatchRequest = CatalogsItemsDeleteBatchRequest
  { catalogsItemsDeleteBatchRequestCountry :: Country -- ^ 
  , catalogsItemsDeleteBatchRequestLanguage :: Language -- ^ 
  , catalogsItemsDeleteBatchRequestOperation :: BatchOperation -- ^ 
  , catalogsItemsDeleteBatchRequestItems :: [ItemDeleteBatchRecord] -- ^ Array with catalogs items
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemsDeleteBatchRequest where
  parseJSON = genericParseJSON optionsCatalogsItemsDeleteBatchRequest
instance ToJSON CatalogsItemsDeleteBatchRequest where
  toJSON = genericToJSON optionsCatalogsItemsDeleteBatchRequest

optionsCatalogsItemsDeleteBatchRequest :: Options
optionsCatalogsItemsDeleteBatchRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemsDeleteBatchRequestCountry", "country")
      , ("catalogsItemsDeleteBatchRequestLanguage", "language")
      , ("catalogsItemsDeleteBatchRequestOperation", "operation")
      , ("catalogsItemsDeleteBatchRequestItems", "items")
      ]


-- | Request object to discontinue catalogs items
data CatalogsItemsDeleteDiscontinuedBatchRequest = CatalogsItemsDeleteDiscontinuedBatchRequest
  { catalogsItemsDeleteDiscontinuedBatchRequestCountry :: Country -- ^ 
  , catalogsItemsDeleteDiscontinuedBatchRequestLanguage :: Language -- ^ 
  , catalogsItemsDeleteDiscontinuedBatchRequestOperation :: BatchOperation -- ^ 
  , catalogsItemsDeleteDiscontinuedBatchRequestItems :: [ItemDeleteDiscontinuedBatchRecord] -- ^ Array with catalogs items
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemsDeleteDiscontinuedBatchRequest where
  parseJSON = genericParseJSON optionsCatalogsItemsDeleteDiscontinuedBatchRequest
instance ToJSON CatalogsItemsDeleteDiscontinuedBatchRequest where
  toJSON = genericToJSON optionsCatalogsItemsDeleteDiscontinuedBatchRequest

optionsCatalogsItemsDeleteDiscontinuedBatchRequest :: Options
optionsCatalogsItemsDeleteDiscontinuedBatchRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemsDeleteDiscontinuedBatchRequestCountry", "country")
      , ("catalogsItemsDeleteDiscontinuedBatchRequestLanguage", "language")
      , ("catalogsItemsDeleteDiscontinuedBatchRequestOperation", "operation")
      , ("catalogsItemsDeleteDiscontinuedBatchRequestItems", "items")
      ]


-- | 
data CatalogsItemsFilters = CatalogsItemsFilters
  { catalogsItemsFiltersCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsItemsFiltersItemUnderscoreids :: [Text] -- ^ 
  , catalogsItemsFiltersCatalogUnderscoreid :: Maybe Text -- ^ Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  , catalogsItemsFiltersHotelUnderscoreids :: [Text] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemsFilters where
  parseJSON = genericParseJSON optionsCatalogsItemsFilters
instance ToJSON CatalogsItemsFilters where
  toJSON = genericToJSON optionsCatalogsItemsFilters

optionsCatalogsItemsFilters :: Options
optionsCatalogsItemsFilters =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemsFiltersCatalogUnderscoretype", "catalog_type")
      , ("catalogsItemsFiltersItemUnderscoreids", "item_ids")
      , ("catalogsItemsFiltersCatalogUnderscoreid", "catalog_id")
      , ("catalogsItemsFiltersHotelUnderscoreids", "hotel_ids")
      ]


-- | Request object to update catalogs items
data CatalogsItemsUpdateBatchRequest = CatalogsItemsUpdateBatchRequest
  { catalogsItemsUpdateBatchRequestCountry :: Country -- ^ 
  , catalogsItemsUpdateBatchRequestLanguage :: Language -- ^ 
  , catalogsItemsUpdateBatchRequestOperation :: BatchOperation -- ^ 
  , catalogsItemsUpdateBatchRequestItems :: [ItemUpdateBatchRecord] -- ^ Array with catalogs items
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemsUpdateBatchRequest where
  parseJSON = genericParseJSON optionsCatalogsItemsUpdateBatchRequest
instance ToJSON CatalogsItemsUpdateBatchRequest where
  toJSON = genericToJSON optionsCatalogsItemsUpdateBatchRequest

optionsCatalogsItemsUpdateBatchRequest :: Options
optionsCatalogsItemsUpdateBatchRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemsUpdateBatchRequestCountry", "country")
      , ("catalogsItemsUpdateBatchRequestLanguage", "language")
      , ("catalogsItemsUpdateBatchRequestOperation", "operation")
      , ("catalogsItemsUpdateBatchRequestItems", "items")
      ]


-- | Request object to upsert catalogs items
data CatalogsItemsUpsertBatchRequest = CatalogsItemsUpsertBatchRequest
  { catalogsItemsUpsertBatchRequestCountry :: Country -- ^ 
  , catalogsItemsUpsertBatchRequestLanguage :: Language -- ^ 
  , catalogsItemsUpsertBatchRequestOperation :: BatchOperation -- ^ 
  , catalogsItemsUpsertBatchRequestItems :: [ItemUpsertBatchRecord] -- ^ Array with catalogs items
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemsUpsertBatchRequest where
  parseJSON = genericParseJSON optionsCatalogsItemsUpsertBatchRequest
instance ToJSON CatalogsItemsUpsertBatchRequest where
  toJSON = genericToJSON optionsCatalogsItemsUpsertBatchRequest

optionsCatalogsItemsUpsertBatchRequest :: Options
optionsCatalogsItemsUpsertBatchRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsItemsUpsertBatchRequestCountry", "country")
      , ("catalogsItemsUpsertBatchRequestLanguage", "language")
      , ("catalogsItemsUpsertBatchRequestOperation", "operation")
      , ("catalogsItemsUpsertBatchRequestItems", "items")
      ]


-- | 
data CatalogsList200Response = CatalogsList200Response
  { catalogsList200ResponseItems :: [Catalog] -- ^ 
  , catalogsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsList200Response where
  parseJSON = genericParseJSON optionsCatalogsList200Response
instance ToJSON CatalogsList200Response where
  toJSON = genericToJSON optionsCatalogsList200Response

optionsCatalogsList200Response :: Options
optionsCatalogsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsList200ResponseItems", "items")
      , ("catalogsList200ResponseBookmark", "bookmark")
      ]


-- | Request object to list products for a given product group filter.
data CatalogsListProductsByFilterRequest = CatalogsListProductsByFilterRequest
  { catalogsListProductsByFilterRequestFeedUnderscoreid :: Text -- ^ Catalog Feed id pertaining to the catalog product group filter.
  , catalogsListProductsByFilterRequestFilters :: CatalogsProductGroupFilters -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsListProductsByFilterRequest where
  parseJSON = genericParseJSON optionsCatalogsListProductsByFilterRequest
instance ToJSON CatalogsListProductsByFilterRequest where
  toJSON = genericToJSON optionsCatalogsListProductsByFilterRequest

optionsCatalogsListProductsByFilterRequest :: Options
optionsCatalogsListProductsByFilterRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsListProductsByFilterRequestFeedUnderscoreid", "feed_id")
      , ("catalogsListProductsByFilterRequestFilters", "filters")
      ]


-- | Request object to list products for a given feed_id and product group filter.
data CatalogsListProductsByFilterRequestOneOf = CatalogsListProductsByFilterRequestOneOf
  { catalogsListProductsByFilterRequestOneOfFeedUnderscoreid :: Text -- ^ Catalog Feed id pertaining to the catalog product group filter.
  , catalogsListProductsByFilterRequestOneOfFilters :: CatalogsProductGroupFilters -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsListProductsByFilterRequestOneOf where
  parseJSON = genericParseJSON optionsCatalogsListProductsByFilterRequestOneOf
instance ToJSON CatalogsListProductsByFilterRequestOneOf where
  toJSON = genericToJSON optionsCatalogsListProductsByFilterRequestOneOf

optionsCatalogsListProductsByFilterRequestOneOf :: Options
optionsCatalogsListProductsByFilterRequestOneOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsListProductsByFilterRequestOneOfFeedUnderscoreid", "feed_id")
      , ("catalogsListProductsByFilterRequestOneOfFilters", "filters")
      ]


-- | 
data CatalogsLocale = CatalogsLocale
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsLocale where
  parseJSON = genericParseJSON optionsCatalogsLocale
instance ToJSON CatalogsLocale where
  toJSON = genericToJSON optionsCatalogsLocale

optionsCatalogsLocale :: Options
optionsCatalogsLocale =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CatalogsProduct = CatalogsProduct
  { catalogsProductMetadata :: CatalogsProductMetadata -- ^ 
  , catalogsProductPin :: Pin -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProduct where
  parseJSON = genericParseJSON optionsCatalogsProduct
instance ToJSON CatalogsProduct where
  toJSON = genericToJSON optionsCatalogsProduct

optionsCatalogsProduct :: Options
optionsCatalogsProduct =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductMetadata", "metadata")
      , ("catalogsProductPin", "pin")
      ]


-- | catalog product group entity
data CatalogsProductGroup = CatalogsProductGroup
  { catalogsProductGroupId :: Text -- ^ ID of the catalog product group.
  , catalogsProductGroupName :: Maybe Text -- ^ Name of catalog product group
  , catalogsProductGroupDescription :: Maybe Text -- ^ 
  , catalogsProductGroupFilters :: CatalogsProductGroupFilters -- ^ 
  , catalogsProductGroupIsUnderscorefeatured :: Maybe Bool -- ^ boolean indicator of whether the product group is being featured or not
  , catalogsProductGroupType :: Maybe CatalogsProductGroupType -- ^ 
  , catalogsProductGroupStatus :: Maybe CatalogsProductGroupStatus -- ^ 
  , catalogsProductGroupCreatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of when catalog product group was created.
  , catalogsProductGroupUpdatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of last time catalog product group was updated.
  , catalogsProductGroupFeedUnderscoreid :: Text -- ^ id of the catalogs feed belonging to this catalog product group
  , catalogsProductGroupCatalogUnderscoretype :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroup where
  parseJSON = genericParseJSON optionsCatalogsProductGroup
instance ToJSON CatalogsProductGroup where
  toJSON = genericToJSON optionsCatalogsProductGroup

optionsCatalogsProductGroup :: Options
optionsCatalogsProductGroup =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupId", "id")
      , ("catalogsProductGroupName", "name")
      , ("catalogsProductGroupDescription", "description")
      , ("catalogsProductGroupFilters", "filters")
      , ("catalogsProductGroupIsUnderscorefeatured", "is_featured")
      , ("catalogsProductGroupType", "type")
      , ("catalogsProductGroupStatus", "status")
      , ("catalogsProductGroupCreatedUnderscoreat", "created_at")
      , ("catalogsProductGroupUpdatedUnderscoreat", "updated_at")
      , ("catalogsProductGroupFeedUnderscoreid", "feed_id")
      , ("catalogsProductGroupCatalogUnderscoretype", "catalog_type")
      ]


-- | Request object for creating a product group.
data CatalogsProductGroupCreateRequest = CatalogsProductGroupCreateRequest
  { catalogsProductGroupCreateRequestName :: Text -- ^ 
  , catalogsProductGroupCreateRequestDescription :: Maybe Text -- ^ 
  , catalogsProductGroupCreateRequestIsUnderscorefeatured :: Maybe Bool -- ^ boolean indicator of whether the product group is being featured or not
  , catalogsProductGroupCreateRequestFilters :: CatalogsProductGroupFiltersRequest -- ^ 
  , catalogsProductGroupCreateRequestFeedUnderscoreid :: Text -- ^ Catalog Feed id pertaining to the catalog product group.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupCreateRequest where
  parseJSON = genericParseJSON optionsCatalogsProductGroupCreateRequest
instance ToJSON CatalogsProductGroupCreateRequest where
  toJSON = genericToJSON optionsCatalogsProductGroupCreateRequest

optionsCatalogsProductGroupCreateRequest :: Options
optionsCatalogsProductGroupCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupCreateRequestName", "name")
      , ("catalogsProductGroupCreateRequestDescription", "description")
      , ("catalogsProductGroupCreateRequestIsUnderscorefeatured", "is_featured")
      , ("catalogsProductGroupCreateRequestFilters", "filters")
      , ("catalogsProductGroupCreateRequestFeedUnderscoreid", "feed_id")
      ]


-- | A currency filter. This filter cannot be negated
data CatalogsProductGroupCurrencyCriteria = CatalogsProductGroupCurrencyCriteria
  { catalogsProductGroupCurrencyCriteriaValues :: NonNullableCatalogsCurrency -- ^ 
  , catalogsProductGroupCurrencyCriteriaNegated :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupCurrencyCriteria where
  parseJSON = genericParseJSON optionsCatalogsProductGroupCurrencyCriteria
instance ToJSON CatalogsProductGroupCurrencyCriteria where
  toJSON = genericToJSON optionsCatalogsProductGroupCurrencyCriteria

optionsCatalogsProductGroupCurrencyCriteria :: Options
optionsCatalogsProductGroupCurrencyCriteria =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupCurrencyCriteriaValues", "values")
      , ("catalogsProductGroupCurrencyCriteriaNegated", "negated")
      ]


-- | 
data CatalogsProductGroupFilterKeys = CatalogsProductGroupFilterKeys
  { catalogsProductGroupFilterKeysMINUnderscorePRICE :: CatalogsProductGroupPricingCriteria -- ^ 
  , catalogsProductGroupFilterKeysMAXUnderscorePRICE :: CatalogsProductGroupPricingCriteria -- ^ 
  , catalogsProductGroupFilterKeysCURRENCY :: CatalogsProductGroupCurrencyCriteria -- ^ 
  , catalogsProductGroupFilterKeysITEMUnderscoreID :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysAVAILABILITY :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysBRAND :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCONDITION :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore0 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore1 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore2 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore3 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore4 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysITEMUnderscoreGROUPUnderscoreID :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysGENDER :: CatalogsProductGroupMultipleGenderCriteria -- ^ 
  , catalogsProductGroupFilterKeysPRODUCTUnderscoreTYPEUnderscore4 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  , catalogsProductGroupFilterKeysPRODUCTUnderscoreTYPEUnderscore3 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  , catalogsProductGroupFilterKeysPRODUCTUnderscoreTYPEUnderscore2 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  , catalogsProductGroupFilterKeysPRODUCTUnderscoreTYPEUnderscore1 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  , catalogsProductGroupFilterKeysPRODUCTUnderscoreTYPEUnderscore0 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  , catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore6 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  , catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore5 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  , catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore4 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  , catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore3 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  , catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore2 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  , catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore1 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  , catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore0 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupFilterKeys where
  parseJSON = genericParseJSON optionsCatalogsProductGroupFilterKeys
instance ToJSON CatalogsProductGroupFilterKeys where
  toJSON = genericToJSON optionsCatalogsProductGroupFilterKeys

optionsCatalogsProductGroupFilterKeys :: Options
optionsCatalogsProductGroupFilterKeys =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupFilterKeysMINUnderscorePRICE", "MIN_PRICE")
      , ("catalogsProductGroupFilterKeysMAXUnderscorePRICE", "MAX_PRICE")
      , ("catalogsProductGroupFilterKeysCURRENCY", "CURRENCY")
      , ("catalogsProductGroupFilterKeysITEMUnderscoreID", "ITEM_ID")
      , ("catalogsProductGroupFilterKeysAVAILABILITY", "AVAILABILITY")
      , ("catalogsProductGroupFilterKeysBRAND", "BRAND")
      , ("catalogsProductGroupFilterKeysCONDITION", "CONDITION")
      , ("catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore0", "CUSTOM_LABEL_0")
      , ("catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore1", "CUSTOM_LABEL_1")
      , ("catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore2", "CUSTOM_LABEL_2")
      , ("catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore3", "CUSTOM_LABEL_3")
      , ("catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore4", "CUSTOM_LABEL_4")
      , ("catalogsProductGroupFilterKeysITEMUnderscoreGROUPUnderscoreID", "ITEM_GROUP_ID")
      , ("catalogsProductGroupFilterKeysGENDER", "GENDER")
      , ("catalogsProductGroupFilterKeysPRODUCTUnderscoreTYPEUnderscore4", "PRODUCT_TYPE_4")
      , ("catalogsProductGroupFilterKeysPRODUCTUnderscoreTYPEUnderscore3", "PRODUCT_TYPE_3")
      , ("catalogsProductGroupFilterKeysPRODUCTUnderscoreTYPEUnderscore2", "PRODUCT_TYPE_2")
      , ("catalogsProductGroupFilterKeysPRODUCTUnderscoreTYPEUnderscore1", "PRODUCT_TYPE_1")
      , ("catalogsProductGroupFilterKeysPRODUCTUnderscoreTYPEUnderscore0", "PRODUCT_TYPE_0")
      , ("catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore6", "GOOGLE_PRODUCT_CATEGORY_6")
      , ("catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore5", "GOOGLE_PRODUCT_CATEGORY_5")
      , ("catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore4", "GOOGLE_PRODUCT_CATEGORY_4")
      , ("catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore3", "GOOGLE_PRODUCT_CATEGORY_3")
      , ("catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore2", "GOOGLE_PRODUCT_CATEGORY_2")
      , ("catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore1", "GOOGLE_PRODUCT_CATEGORY_1")
      , ("catalogsProductGroupFilterKeysGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore0", "GOOGLE_PRODUCT_CATEGORY_0")
      ]


-- | Object holding a group of filters for a catalog product group
data CatalogsProductGroupFilters = CatalogsProductGroupFilters
  { catalogsProductGroupFiltersAnyUnderscoreof :: [CatalogsProductGroupFilterKeys] -- ^ 
  , catalogsProductGroupFiltersAllUnderscoreof :: [CatalogsProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupFilters where
  parseJSON = genericParseJSON optionsCatalogsProductGroupFilters
instance ToJSON CatalogsProductGroupFilters where
  toJSON = genericToJSON optionsCatalogsProductGroupFilters

optionsCatalogsProductGroupFilters :: Options
optionsCatalogsProductGroupFilters =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupFiltersAnyUnderscoreof", "any_of")
      , ("catalogsProductGroupFiltersAllUnderscoreof", "all_of")
      ]


-- | 
data CatalogsProductGroupFiltersAllOf = CatalogsProductGroupFiltersAllOf
  { catalogsProductGroupFiltersAllOfAllUnderscoreof :: [CatalogsProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupFiltersAllOf where
  parseJSON = genericParseJSON optionsCatalogsProductGroupFiltersAllOf
instance ToJSON CatalogsProductGroupFiltersAllOf where
  toJSON = genericToJSON optionsCatalogsProductGroupFiltersAllOf

optionsCatalogsProductGroupFiltersAllOf :: Options
optionsCatalogsProductGroupFiltersAllOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupFiltersAllOfAllUnderscoreof", "all_of")
      ]


-- | 
data CatalogsProductGroupFiltersAnyOf = CatalogsProductGroupFiltersAnyOf
  { catalogsProductGroupFiltersAnyOfAnyUnderscoreof :: [CatalogsProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupFiltersAnyOf where
  parseJSON = genericParseJSON optionsCatalogsProductGroupFiltersAnyOf
instance ToJSON CatalogsProductGroupFiltersAnyOf where
  toJSON = genericToJSON optionsCatalogsProductGroupFiltersAnyOf

optionsCatalogsProductGroupFiltersAnyOf :: Options
optionsCatalogsProductGroupFiltersAnyOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupFiltersAnyOfAnyUnderscoreof", "any_of")
      ]


-- | Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
data CatalogsProductGroupFiltersRequest = CatalogsProductGroupFiltersRequest
  { catalogsProductGroupFiltersRequestAnyUnderscoreof :: [CatalogsProductGroupFilterKeys] -- ^ 
  , catalogsProductGroupFiltersRequestAllUnderscoreof :: [CatalogsProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupFiltersRequest where
  parseJSON = genericParseJSON optionsCatalogsProductGroupFiltersRequest
instance ToJSON CatalogsProductGroupFiltersRequest where
  toJSON = genericToJSON optionsCatalogsProductGroupFiltersRequest

optionsCatalogsProductGroupFiltersRequest :: Options
optionsCatalogsProductGroupFiltersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupFiltersRequestAnyUnderscoreof", "any_of")
      , ("catalogsProductGroupFiltersRequestAllUnderscoreof", "all_of")
      ]


-- | 
data CatalogsProductGroupFiltersRequestAnyOf = CatalogsProductGroupFiltersRequestAnyOf
  { catalogsProductGroupFiltersRequestAnyOfAnyUnderscoreof :: [CatalogsProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupFiltersRequestAnyOf where
  parseJSON = genericParseJSON optionsCatalogsProductGroupFiltersRequestAnyOf
instance ToJSON CatalogsProductGroupFiltersRequestAnyOf where
  toJSON = genericToJSON optionsCatalogsProductGroupFiltersRequestAnyOf

optionsCatalogsProductGroupFiltersRequestAnyOf :: Options
optionsCatalogsProductGroupFiltersRequestAnyOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupFiltersRequestAnyOfAnyUnderscoreof", "any_of")
      ]


-- | 
data CatalogsProductGroupFiltersRequestAnyOf1 = CatalogsProductGroupFiltersRequestAnyOf1
  { catalogsProductGroupFiltersRequestAnyOf1AllUnderscoreof :: [CatalogsProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupFiltersRequestAnyOf1 where
  parseJSON = genericParseJSON optionsCatalogsProductGroupFiltersRequestAnyOf1
instance ToJSON CatalogsProductGroupFiltersRequestAnyOf1 where
  toJSON = genericToJSON optionsCatalogsProductGroupFiltersRequestAnyOf1

optionsCatalogsProductGroupFiltersRequestAnyOf1 :: Options
optionsCatalogsProductGroupFiltersRequestAnyOf1 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupFiltersRequestAnyOf1AllUnderscoreof", "all_of")
      ]


-- | 
data CatalogsProductGroupMultipleCountriesCriteria = CatalogsProductGroupMultipleCountriesCriteria
  { catalogsProductGroupMultipleCountriesCriteriaValues :: [Country] -- ^ 
  , catalogsProductGroupMultipleCountriesCriteriaNegated :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupMultipleCountriesCriteria where
  parseJSON = genericParseJSON optionsCatalogsProductGroupMultipleCountriesCriteria
instance ToJSON CatalogsProductGroupMultipleCountriesCriteria where
  toJSON = genericToJSON optionsCatalogsProductGroupMultipleCountriesCriteria

optionsCatalogsProductGroupMultipleCountriesCriteria :: Options
optionsCatalogsProductGroupMultipleCountriesCriteria =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupMultipleCountriesCriteriaValues", "values")
      , ("catalogsProductGroupMultipleCountriesCriteriaNegated", "negated")
      ]


-- | 
data CatalogsProductGroupMultipleGenderCriteria = CatalogsProductGroupMultipleGenderCriteria
  { catalogsProductGroupMultipleGenderCriteriaValues :: [Gender] -- ^ 
  , catalogsProductGroupMultipleGenderCriteriaNegated :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupMultipleGenderCriteria where
  parseJSON = genericParseJSON optionsCatalogsProductGroupMultipleGenderCriteria
instance ToJSON CatalogsProductGroupMultipleGenderCriteria where
  toJSON = genericToJSON optionsCatalogsProductGroupMultipleGenderCriteria

optionsCatalogsProductGroupMultipleGenderCriteria :: Options
optionsCatalogsProductGroupMultipleGenderCriteria =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupMultipleGenderCriteriaValues", "values")
      , ("catalogsProductGroupMultipleGenderCriteriaNegated", "negated")
      ]


-- | 
data CatalogsProductGroupMultipleStringCriteria = CatalogsProductGroupMultipleStringCriteria
  { catalogsProductGroupMultipleStringCriteriaValues :: [Text] -- ^ 
  , catalogsProductGroupMultipleStringCriteriaNegated :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupMultipleStringCriteria where
  parseJSON = genericParseJSON optionsCatalogsProductGroupMultipleStringCriteria
instance ToJSON CatalogsProductGroupMultipleStringCriteria where
  toJSON = genericToJSON optionsCatalogsProductGroupMultipleStringCriteria

optionsCatalogsProductGroupMultipleStringCriteria :: Options
optionsCatalogsProductGroupMultipleStringCriteria =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupMultipleStringCriteriaValues", "values")
      , ("catalogsProductGroupMultipleStringCriteriaNegated", "negated")
      ]


-- | 
data CatalogsProductGroupMultipleStringListCriteria = CatalogsProductGroupMultipleStringListCriteria
  { catalogsProductGroupMultipleStringListCriteriaValues :: [[Text]] -- ^ 
  , catalogsProductGroupMultipleStringListCriteriaNegated :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupMultipleStringListCriteria where
  parseJSON = genericParseJSON optionsCatalogsProductGroupMultipleStringListCriteria
instance ToJSON CatalogsProductGroupMultipleStringListCriteria where
  toJSON = genericToJSON optionsCatalogsProductGroupMultipleStringListCriteria

optionsCatalogsProductGroupMultipleStringListCriteria :: Options
optionsCatalogsProductGroupMultipleStringListCriteria =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupMultipleStringListCriteriaValues", "values")
      , ("catalogsProductGroupMultipleStringListCriteriaNegated", "negated")
      ]


-- | 
data CatalogsProductGroupPinsList200Response = CatalogsProductGroupPinsList200Response
  { catalogsProductGroupPinsList200ResponseItems :: [CatalogsProduct] -- ^ Pins
  , catalogsProductGroupPinsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupPinsList200Response where
  parseJSON = genericParseJSON optionsCatalogsProductGroupPinsList200Response
instance ToJSON CatalogsProductGroupPinsList200Response where
  toJSON = genericToJSON optionsCatalogsProductGroupPinsList200Response

optionsCatalogsProductGroupPinsList200Response :: Options
optionsCatalogsProductGroupPinsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupPinsList200ResponseItems", "items")
      , ("catalogsProductGroupPinsList200ResponseBookmark", "bookmark")
      ]


-- | 
data CatalogsProductGroupPricingCriteria = CatalogsProductGroupPricingCriteria
  { catalogsProductGroupPricingCriteriaInclusion :: Maybe Bool -- ^ 
  , catalogsProductGroupPricingCriteriaValues :: Double -- ^ 
  , catalogsProductGroupPricingCriteriaNegated :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupPricingCriteria where
  parseJSON = genericParseJSON optionsCatalogsProductGroupPricingCriteria
instance ToJSON CatalogsProductGroupPricingCriteria where
  toJSON = genericToJSON optionsCatalogsProductGroupPricingCriteria

optionsCatalogsProductGroupPricingCriteria :: Options
optionsCatalogsProductGroupPricingCriteria =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupPricingCriteriaInclusion", "inclusion")
      , ("catalogsProductGroupPricingCriteriaValues", "values")
      , ("catalogsProductGroupPricingCriteriaNegated", "negated")
      ]


-- | 
data CatalogsProductGroupPricingCurrencyCriteria = CatalogsProductGroupPricingCurrencyCriteria
  { catalogsProductGroupPricingCurrencyCriteriaOperator :: Text -- ^ 
  , catalogsProductGroupPricingCurrencyCriteriaValue :: Double -- ^ 
  , catalogsProductGroupPricingCurrencyCriteriaCurrency :: NonNullableCatalogsCurrency -- ^ 
  , catalogsProductGroupPricingCurrencyCriteriaNegated :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupPricingCurrencyCriteria where
  parseJSON = genericParseJSON optionsCatalogsProductGroupPricingCurrencyCriteria
instance ToJSON CatalogsProductGroupPricingCurrencyCriteria where
  toJSON = genericToJSON optionsCatalogsProductGroupPricingCurrencyCriteria

optionsCatalogsProductGroupPricingCurrencyCriteria :: Options
optionsCatalogsProductGroupPricingCurrencyCriteria =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupPricingCurrencyCriteriaOperator", "operator")
      , ("catalogsProductGroupPricingCurrencyCriteriaValue", "value")
      , ("catalogsProductGroupPricingCurrencyCriteriaCurrency", "currency")
      , ("catalogsProductGroupPricingCurrencyCriteriaNegated", "negated")
      ]


-- | Product counts for a CatalogsProductGroup
data CatalogsProductGroupProductCounts = CatalogsProductGroupProductCounts
  { catalogsProductGroupProductCountsInUnderscorestock :: Double -- ^ 
  , catalogsProductGroupProductCountsOutUnderscoreofUnderscorestock :: Double -- ^ 
  , catalogsProductGroupProductCountsPreorder :: Double -- ^ 
  , catalogsProductGroupProductCountsTotal :: Double -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupProductCounts where
  parseJSON = genericParseJSON optionsCatalogsProductGroupProductCounts
instance ToJSON CatalogsProductGroupProductCounts where
  toJSON = genericToJSON optionsCatalogsProductGroupProductCounts

optionsCatalogsProductGroupProductCounts :: Options
optionsCatalogsProductGroupProductCounts =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupProductCountsInUnderscorestock", "in_stock")
      , ("catalogsProductGroupProductCountsOutUnderscoreofUnderscorestock", "out_of_stock")
      , ("catalogsProductGroupProductCountsPreorder", "preorder")
      , ("catalogsProductGroupProductCountsTotal", "total")
      ]


-- | 
data CatalogsProductGroupStatus = CatalogsProductGroupStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupStatus where
  parseJSON = genericParseJSON optionsCatalogsProductGroupStatus
instance ToJSON CatalogsProductGroupStatus where
  toJSON = genericToJSON optionsCatalogsProductGroupStatus

optionsCatalogsProductGroupStatus :: Options
optionsCatalogsProductGroupStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | &lt;p&gt;Catalog product group type&lt;/p&gt; &lt;p&gt;MERCHANT_CREATED: Product groups created by merchants. &lt;br&gt;ALL_PRODUCTS: Consists of every product in your latest successful feed upload. &lt;br&gt;BEST_DEALS: Consists of products with the deepest drop in price. &lt;br&gt;PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. &lt;br&gt;TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. &lt;br&gt;BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. &lt;br&gt;NEW_ARRIVALS: Consists of products that are new to your Catalog. &lt;br&gt;SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. &lt;br&gt;I2PC: Product groups created based on predicted product category.&lt;/p&gt;
data CatalogsProductGroupType = CatalogsProductGroupType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupType where
  parseJSON = genericParseJSON optionsCatalogsProductGroupType
instance ToJSON CatalogsProductGroupType where
  toJSON = genericToJSON optionsCatalogsProductGroupType

optionsCatalogsProductGroupType :: Options
optionsCatalogsProductGroupType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Request object for updating a product group.
data CatalogsProductGroupUpdateRequest = CatalogsProductGroupUpdateRequest
  { catalogsProductGroupUpdateRequestName :: Maybe Text -- ^ 
  , catalogsProductGroupUpdateRequestDescription :: Maybe Text -- ^ 
  , catalogsProductGroupUpdateRequestIsUnderscorefeatured :: Maybe Bool -- ^ boolean indicator of whether the product group is being featured or not
  , catalogsProductGroupUpdateRequestFilters :: Maybe CatalogsProductGroupFiltersRequest -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupUpdateRequest where
  parseJSON = genericParseJSON optionsCatalogsProductGroupUpdateRequest
instance ToJSON CatalogsProductGroupUpdateRequest where
  toJSON = genericToJSON optionsCatalogsProductGroupUpdateRequest

optionsCatalogsProductGroupUpdateRequest :: Options
optionsCatalogsProductGroupUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupUpdateRequestName", "name")
      , ("catalogsProductGroupUpdateRequestDescription", "description")
      , ("catalogsProductGroupUpdateRequestIsUnderscorefeatured", "is_featured")
      , ("catalogsProductGroupUpdateRequestFilters", "filters")
      ]


-- | 
data CatalogsProductGroupsCreate201Response = CatalogsProductGroupsCreate201Response
  { catalogsProductGroupsCreate201ResponseId :: Text -- ^ ID of the catalog product group.
  , catalogsProductGroupsCreate201ResponseName :: Maybe Text -- ^ Name of catalog product group
  , catalogsProductGroupsCreate201ResponseDescription :: Maybe Text -- ^ 
  , catalogsProductGroupsCreate201ResponseFilters :: CatalogsProductGroupFilters -- ^ 
  , catalogsProductGroupsCreate201ResponseIsUnderscorefeatured :: Maybe Bool -- ^ boolean indicator of whether the product group is being featured or not
  , catalogsProductGroupsCreate201ResponseType :: Maybe CatalogsProductGroupType -- ^ 
  , catalogsProductGroupsCreate201ResponseStatus :: Maybe CatalogsProductGroupStatus -- ^ 
  , catalogsProductGroupsCreate201ResponseCreatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of when catalog product group was created.
  , catalogsProductGroupsCreate201ResponseUpdatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of last time catalog product group was updated.
  , catalogsProductGroupsCreate201ResponseFeedUnderscoreid :: Text -- ^ 
  , catalogsProductGroupsCreate201ResponseCatalogUnderscoretype :: Text -- ^ 
  , catalogsProductGroupsCreate201ResponseCatalogUnderscoreid :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupsCreate201Response where
  parseJSON = genericParseJSON optionsCatalogsProductGroupsCreate201Response
instance ToJSON CatalogsProductGroupsCreate201Response where
  toJSON = genericToJSON optionsCatalogsProductGroupsCreate201Response

optionsCatalogsProductGroupsCreate201Response :: Options
optionsCatalogsProductGroupsCreate201Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupsCreate201ResponseId", "id")
      , ("catalogsProductGroupsCreate201ResponseName", "name")
      , ("catalogsProductGroupsCreate201ResponseDescription", "description")
      , ("catalogsProductGroupsCreate201ResponseFilters", "filters")
      , ("catalogsProductGroupsCreate201ResponseIsUnderscorefeatured", "is_featured")
      , ("catalogsProductGroupsCreate201ResponseType", "type")
      , ("catalogsProductGroupsCreate201ResponseStatus", "status")
      , ("catalogsProductGroupsCreate201ResponseCreatedUnderscoreat", "created_at")
      , ("catalogsProductGroupsCreate201ResponseUpdatedUnderscoreat", "updated_at")
      , ("catalogsProductGroupsCreate201ResponseFeedUnderscoreid", "feed_id")
      , ("catalogsProductGroupsCreate201ResponseCatalogUnderscoretype", "catalog_type")
      , ("catalogsProductGroupsCreate201ResponseCatalogUnderscoreid", "catalog_id")
      ]


-- | 
data CatalogsProductGroupsCreateRequest = CatalogsProductGroupsCreateRequest
  { catalogsProductGroupsCreateRequestName :: Text -- ^ 
  , catalogsProductGroupsCreateRequestDescription :: Maybe Text -- ^ 
  , catalogsProductGroupsCreateRequestIsUnderscorefeatured :: Maybe Bool -- ^ boolean indicator of whether the product group is being featured or not
  , catalogsProductGroupsCreateRequestFilters :: CatalogsHotelProductGroupFilters -- ^ 
  , catalogsProductGroupsCreateRequestFeedUnderscoreid :: Text -- ^ Catalog Feed id pertaining to the catalog product group.
  , catalogsProductGroupsCreateRequestCatalogUnderscoretype :: Text -- ^ 
  , catalogsProductGroupsCreateRequestCatalogUnderscoreid :: Text -- ^ Catalog id pertaining to the hotel product group.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupsCreateRequest where
  parseJSON = genericParseJSON optionsCatalogsProductGroupsCreateRequest
instance ToJSON CatalogsProductGroupsCreateRequest where
  toJSON = genericToJSON optionsCatalogsProductGroupsCreateRequest

optionsCatalogsProductGroupsCreateRequest :: Options
optionsCatalogsProductGroupsCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupsCreateRequestName", "name")
      , ("catalogsProductGroupsCreateRequestDescription", "description")
      , ("catalogsProductGroupsCreateRequestIsUnderscorefeatured", "is_featured")
      , ("catalogsProductGroupsCreateRequestFilters", "filters")
      , ("catalogsProductGroupsCreateRequestFeedUnderscoreid", "feed_id")
      , ("catalogsProductGroupsCreateRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsProductGroupsCreateRequestCatalogUnderscoreid", "catalog_id")
      ]


-- | 
data CatalogsProductGroupsList200Response = CatalogsProductGroupsList200Response
  { catalogsProductGroupsList200ResponseItems :: [CatalogsProductGroupsList200ResponseAllOfItemsInner] -- ^ 
  , catalogsProductGroupsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupsList200Response where
  parseJSON = genericParseJSON optionsCatalogsProductGroupsList200Response
instance ToJSON CatalogsProductGroupsList200Response where
  toJSON = genericToJSON optionsCatalogsProductGroupsList200Response

optionsCatalogsProductGroupsList200Response :: Options
optionsCatalogsProductGroupsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupsList200ResponseItems", "items")
      , ("catalogsProductGroupsList200ResponseBookmark", "bookmark")
      ]


-- | 
data CatalogsProductGroupsList200ResponseAllOfItemsInner = CatalogsProductGroupsList200ResponseAllOfItemsInner
  { catalogsProductGroupsList200ResponseAllOfItemsInnerId :: Text -- ^ ID of the catalog product group.
  , catalogsProductGroupsList200ResponseAllOfItemsInnerName :: Maybe Text -- ^ Name of catalog product group
  , catalogsProductGroupsList200ResponseAllOfItemsInnerDescription :: Maybe Text -- ^ 
  , catalogsProductGroupsList200ResponseAllOfItemsInnerFilters :: CatalogsProductGroupFilters -- ^ 
  , catalogsProductGroupsList200ResponseAllOfItemsInnerIsUnderscorefeatured :: Maybe Bool -- ^ boolean indicator of whether the product group is being featured or not
  , catalogsProductGroupsList200ResponseAllOfItemsInnerType :: Maybe CatalogsProductGroupType -- ^ 
  , catalogsProductGroupsList200ResponseAllOfItemsInnerStatus :: Maybe CatalogsProductGroupStatus -- ^ 
  , catalogsProductGroupsList200ResponseAllOfItemsInnerCreatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of when catalog product group was created.
  , catalogsProductGroupsList200ResponseAllOfItemsInnerUpdatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of last time catalog product group was updated.
  , catalogsProductGroupsList200ResponseAllOfItemsInnerFeedUnderscoreid :: Text -- ^ 
  , catalogsProductGroupsList200ResponseAllOfItemsInnerCatalogUnderscoretype :: Text -- ^ 
  , catalogsProductGroupsList200ResponseAllOfItemsInnerCatalogUnderscoreid :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupsList200ResponseAllOfItemsInner where
  parseJSON = genericParseJSON optionsCatalogsProductGroupsList200ResponseAllOfItemsInner
instance ToJSON CatalogsProductGroupsList200ResponseAllOfItemsInner where
  toJSON = genericToJSON optionsCatalogsProductGroupsList200ResponseAllOfItemsInner

optionsCatalogsProductGroupsList200ResponseAllOfItemsInner :: Options
optionsCatalogsProductGroupsList200ResponseAllOfItemsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupsList200ResponseAllOfItemsInnerId", "id")
      , ("catalogsProductGroupsList200ResponseAllOfItemsInnerName", "name")
      , ("catalogsProductGroupsList200ResponseAllOfItemsInnerDescription", "description")
      , ("catalogsProductGroupsList200ResponseAllOfItemsInnerFilters", "filters")
      , ("catalogsProductGroupsList200ResponseAllOfItemsInnerIsUnderscorefeatured", "is_featured")
      , ("catalogsProductGroupsList200ResponseAllOfItemsInnerType", "type")
      , ("catalogsProductGroupsList200ResponseAllOfItemsInnerStatus", "status")
      , ("catalogsProductGroupsList200ResponseAllOfItemsInnerCreatedUnderscoreat", "created_at")
      , ("catalogsProductGroupsList200ResponseAllOfItemsInnerUpdatedUnderscoreat", "updated_at")
      , ("catalogsProductGroupsList200ResponseAllOfItemsInnerFeedUnderscoreid", "feed_id")
      , ("catalogsProductGroupsList200ResponseAllOfItemsInnerCatalogUnderscoretype", "catalog_type")
      , ("catalogsProductGroupsList200ResponseAllOfItemsInnerCatalogUnderscoreid", "catalog_id")
      ]


-- | 
data CatalogsProductGroupsUpdateRequest = CatalogsProductGroupsUpdateRequest
  { catalogsProductGroupsUpdateRequestName :: Maybe Text -- ^ 
  , catalogsProductGroupsUpdateRequestDescription :: Maybe Text -- ^ 
  , catalogsProductGroupsUpdateRequestIsUnderscorefeatured :: Maybe Bool -- ^ boolean indicator of whether the product group is being featured or not
  , catalogsProductGroupsUpdateRequestFilters :: Maybe CatalogsHotelProductGroupFilters -- ^ 
  , catalogsProductGroupsUpdateRequestCatalogUnderscoretype :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupsUpdateRequest where
  parseJSON = genericParseJSON optionsCatalogsProductGroupsUpdateRequest
instance ToJSON CatalogsProductGroupsUpdateRequest where
  toJSON = genericToJSON optionsCatalogsProductGroupsUpdateRequest

optionsCatalogsProductGroupsUpdateRequest :: Options
optionsCatalogsProductGroupsUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductGroupsUpdateRequestName", "name")
      , ("catalogsProductGroupsUpdateRequestDescription", "description")
      , ("catalogsProductGroupsUpdateRequestIsUnderscorefeatured", "is_featured")
      , ("catalogsProductGroupsUpdateRequestFilters", "filters")
      , ("catalogsProductGroupsUpdateRequestCatalogUnderscoretype", "catalog_type")
      ]


-- | Product metadata entity
data CatalogsProductMetadata = CatalogsProductMetadata
  { catalogsProductMetadataItemUnderscoreid :: Text -- ^ The user-created unique ID that represents the product.
  , catalogsProductMetadataItemUnderscoregroupUnderscoreid :: Text -- ^ The parent ID of the product.
  , catalogsProductMetadataAvailability :: NonNullableProductAvailabilityType -- ^ 
  , catalogsProductMetadataPrice :: Double -- ^ The price of the product.
  , catalogsProductMetadataSaleUnderscoreprice :: Double -- ^ The discounted price of the product.
  , catalogsProductMetadataCurrency :: NonNullableCatalogsCurrency -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductMetadata where
  parseJSON = genericParseJSON optionsCatalogsProductMetadata
instance ToJSON CatalogsProductMetadata where
  toJSON = genericToJSON optionsCatalogsProductMetadata

optionsCatalogsProductMetadata :: Options
optionsCatalogsProductMetadata =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsProductMetadataItemUnderscoreid", "item_id")
      , ("catalogsProductMetadataItemUnderscoregroupUnderscoreid", "item_group_id")
      , ("catalogsProductMetadataAvailability", "availability")
      , ("catalogsProductMetadataPrice", "price")
      , ("catalogsProductMetadataSaleUnderscoreprice", "sale_price")
      , ("catalogsProductMetadataCurrency", "currency")
      ]


-- | A request object that can have multiple operations on a single retail batch
data CatalogsRetailBatchRequest = CatalogsRetailBatchRequest
  { catalogsRetailBatchRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsRetailBatchRequestCountry :: Country -- ^ 
  , catalogsRetailBatchRequestLanguage :: Language -- ^ 
  , catalogsRetailBatchRequestItems :: [CatalogsRetailBatchRequestItemsInner] -- ^ Array with catalogs item operations
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsRetailBatchRequest where
  parseJSON = genericParseJSON optionsCatalogsRetailBatchRequest
instance ToJSON CatalogsRetailBatchRequest where
  toJSON = genericToJSON optionsCatalogsRetailBatchRequest

optionsCatalogsRetailBatchRequest :: Options
optionsCatalogsRetailBatchRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsRetailBatchRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsRetailBatchRequestCountry", "country")
      , ("catalogsRetailBatchRequestLanguage", "language")
      , ("catalogsRetailBatchRequestItems", "items")
      ]


-- | 
data CatalogsRetailBatchRequestItemsInner = CatalogsRetailBatchRequestItemsInner
  { catalogsRetailBatchRequestItemsInnerItemUnderscoreid :: Text -- ^ The catalog item id in the merchant namespace
  , catalogsRetailBatchRequestItemsInnerOperation :: Text -- ^ 
  , catalogsRetailBatchRequestItemsInnerAttributes :: ItemAttributes -- ^ 
  , catalogsRetailBatchRequestItemsInnerUpdateUnderscoremask :: Maybe [UpdateMaskFieldType] -- ^ The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsRetailBatchRequestItemsInner where
  parseJSON = genericParseJSON optionsCatalogsRetailBatchRequestItemsInner
instance ToJSON CatalogsRetailBatchRequestItemsInner where
  toJSON = genericToJSON optionsCatalogsRetailBatchRequestItemsInner

optionsCatalogsRetailBatchRequestItemsInner :: Options
optionsCatalogsRetailBatchRequestItemsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsRetailBatchRequestItemsInnerItemUnderscoreid", "item_id")
      , ("catalogsRetailBatchRequestItemsInnerOperation", "operation")
      , ("catalogsRetailBatchRequestItemsInnerAttributes", "attributes")
      , ("catalogsRetailBatchRequestItemsInnerUpdateUnderscoremask", "update_mask")
      ]


-- | Catalogs Retail Feed object
data CatalogsRetailFeed = CatalogsRetailFeed
  { catalogsRetailFeedCreatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsRetailFeedId :: Maybe Text -- ^ 
  , catalogsRetailFeedUpdatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsRetailFeedName :: Text -- ^ A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  , catalogsRetailFeedFormat :: CatalogsFormat -- ^ 
  , catalogsRetailFeedCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsRetailFeedCredentials :: CatalogsFeedCredentials -- ^ 
  , catalogsRetailFeedLocation :: Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsRetailFeedPreferredUnderscoreprocessingUnderscoreschedule :: CatalogsFeedProcessingSchedule -- ^ 
  , catalogsRetailFeedStatus :: CatalogsStatus -- ^ 
  , catalogsRetailFeedDefaultUnderscorecurrency :: NullableCurrency -- ^ 
  , catalogsRetailFeedDefaultUnderscorelocale :: Text -- ^ The locale used within a feed for product descriptions.
  , catalogsRetailFeedDefaultUnderscorecountry :: Country -- ^ 
  , catalogsRetailFeedDefaultUnderscoreavailability :: ProductAvailabilityType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsRetailFeed where
  parseJSON = genericParseJSON optionsCatalogsRetailFeed
instance ToJSON CatalogsRetailFeed where
  toJSON = genericToJSON optionsCatalogsRetailFeed

optionsCatalogsRetailFeed :: Options
optionsCatalogsRetailFeed =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsRetailFeedCreatedUnderscoreat", "created_at")
      , ("catalogsRetailFeedId", "id")
      , ("catalogsRetailFeedUpdatedUnderscoreat", "updated_at")
      , ("catalogsRetailFeedName", "name")
      , ("catalogsRetailFeedFormat", "format")
      , ("catalogsRetailFeedCatalogUnderscoretype", "catalog_type")
      , ("catalogsRetailFeedCredentials", "credentials")
      , ("catalogsRetailFeedLocation", "location")
      , ("catalogsRetailFeedPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("catalogsRetailFeedStatus", "status")
      , ("catalogsRetailFeedDefaultUnderscorecurrency", "default_currency")
      , ("catalogsRetailFeedDefaultUnderscorelocale", "default_locale")
      , ("catalogsRetailFeedDefaultUnderscorecountry", "default_country")
      , ("catalogsRetailFeedDefaultUnderscoreavailability", "default_availability")
      ]


-- | Request object for creating a retail feed.
data CatalogsRetailFeedsCreateRequest = CatalogsRetailFeedsCreateRequest
  { catalogsRetailFeedsCreateRequestDefaultUnderscorecurrency :: Maybe NullableCurrency -- ^ 
  , catalogsRetailFeedsCreateRequestName :: Text -- ^ A human-friendly name associated to a given feed.
  , catalogsRetailFeedsCreateRequestFormat :: CatalogsFormat -- ^ 
  , catalogsRetailFeedsCreateRequestDefaultUnderscorelocale :: CatalogsFeedsCreateRequestDefaultLocale -- ^ 
  , catalogsRetailFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials -- ^ 
  , catalogsRetailFeedsCreateRequestLocation :: Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsRetailFeedsCreateRequestPreferredUnderscoreprocessingUnderscoreschedule :: Maybe CatalogsFeedProcessingSchedule -- ^ 
  , catalogsRetailFeedsCreateRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsRetailFeedsCreateRequestDefaultUnderscorecountry :: Country -- ^ 
  , catalogsRetailFeedsCreateRequestDefaultUnderscoreavailability :: Maybe ProductAvailabilityType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsRetailFeedsCreateRequest where
  parseJSON = genericParseJSON optionsCatalogsRetailFeedsCreateRequest
instance ToJSON CatalogsRetailFeedsCreateRequest where
  toJSON = genericToJSON optionsCatalogsRetailFeedsCreateRequest

optionsCatalogsRetailFeedsCreateRequest :: Options
optionsCatalogsRetailFeedsCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsRetailFeedsCreateRequestDefaultUnderscorecurrency", "default_currency")
      , ("catalogsRetailFeedsCreateRequestName", "name")
      , ("catalogsRetailFeedsCreateRequestFormat", "format")
      , ("catalogsRetailFeedsCreateRequestDefaultUnderscorelocale", "default_locale")
      , ("catalogsRetailFeedsCreateRequestCredentials", "credentials")
      , ("catalogsRetailFeedsCreateRequestLocation", "location")
      , ("catalogsRetailFeedsCreateRequestPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("catalogsRetailFeedsCreateRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsRetailFeedsCreateRequestDefaultUnderscorecountry", "default_country")
      , ("catalogsRetailFeedsCreateRequestDefaultUnderscoreavailability", "default_availability")
      ]


-- | Request object for updating a feed.
data CatalogsRetailFeedsUpdateRequest = CatalogsRetailFeedsUpdateRequest
  { catalogsRetailFeedsUpdateRequestDefaultUnderscorecurrency :: Maybe NullableCurrency -- ^ 
  , catalogsRetailFeedsUpdateRequestName :: Maybe Text -- ^ A human-friendly name associated to a given feed.
  , catalogsRetailFeedsUpdateRequestFormat :: Maybe CatalogsFormat -- ^ 
  , catalogsRetailFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials -- ^ 
  , catalogsRetailFeedsUpdateRequestLocation :: Maybe Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsRetailFeedsUpdateRequestPreferredUnderscoreprocessingUnderscoreschedule :: Maybe CatalogsFeedProcessingSchedule -- ^ 
  , catalogsRetailFeedsUpdateRequestStatus :: Maybe CatalogsStatus -- ^ 
  , catalogsRetailFeedsUpdateRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsRetailFeedsUpdateRequestDefaultUnderscoreavailability :: Maybe ProductAvailabilityType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsRetailFeedsUpdateRequest where
  parseJSON = genericParseJSON optionsCatalogsRetailFeedsUpdateRequest
instance ToJSON CatalogsRetailFeedsUpdateRequest where
  toJSON = genericToJSON optionsCatalogsRetailFeedsUpdateRequest

optionsCatalogsRetailFeedsUpdateRequest :: Options
optionsCatalogsRetailFeedsUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsRetailFeedsUpdateRequestDefaultUnderscorecurrency", "default_currency")
      , ("catalogsRetailFeedsUpdateRequestName", "name")
      , ("catalogsRetailFeedsUpdateRequestFormat", "format")
      , ("catalogsRetailFeedsUpdateRequestCredentials", "credentials")
      , ("catalogsRetailFeedsUpdateRequestLocation", "location")
      , ("catalogsRetailFeedsUpdateRequestPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("catalogsRetailFeedsUpdateRequestStatus", "status")
      , ("catalogsRetailFeedsUpdateRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsRetailFeedsUpdateRequestDefaultUnderscoreavailability", "default_availability")
      ]


-- | Object describing a retail item error
data CatalogsRetailItemErrorResponse = CatalogsRetailItemErrorResponse
  { catalogsRetailItemErrorResponseCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsRetailItemErrorResponseItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  , catalogsRetailItemErrorResponseErrors :: Maybe [ItemValidationEvent] -- ^ Array with the errors for the item id requested
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsRetailItemErrorResponse where
  parseJSON = genericParseJSON optionsCatalogsRetailItemErrorResponse
instance ToJSON CatalogsRetailItemErrorResponse where
  toJSON = genericToJSON optionsCatalogsRetailItemErrorResponse

optionsCatalogsRetailItemErrorResponse :: Options
optionsCatalogsRetailItemErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsRetailItemErrorResponseCatalogUnderscoretype", "catalog_type")
      , ("catalogsRetailItemErrorResponseItemUnderscoreid", "item_id")
      , ("catalogsRetailItemErrorResponseErrors", "errors")
      ]


-- | Object describing a retail item record
data CatalogsRetailItemResponse = CatalogsRetailItemResponse
  { catalogsRetailItemResponseCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsRetailItemResponseItemUnderscoreid :: Maybe Text -- ^ The catalog retail item id in the merchant namespace
  , catalogsRetailItemResponsePins :: Maybe [Pin] -- ^ The pins mapped to the item
  , catalogsRetailItemResponseAttributes :: Maybe ItemAttributes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsRetailItemResponse where
  parseJSON = genericParseJSON optionsCatalogsRetailItemResponse
instance ToJSON CatalogsRetailItemResponse where
  toJSON = genericToJSON optionsCatalogsRetailItemResponse

optionsCatalogsRetailItemResponse :: Options
optionsCatalogsRetailItemResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsRetailItemResponseCatalogUnderscoretype", "catalog_type")
      , ("catalogsRetailItemResponseItemUnderscoreid", "item_id")
      , ("catalogsRetailItemResponsePins", "pins")
      , ("catalogsRetailItemResponseAttributes", "attributes")
      ]


-- | Object describing the catalogs retail items batch
data CatalogsRetailItemsBatch = CatalogsRetailItemsBatch
  { catalogsRetailItemsBatchBatchUnderscoreid :: Maybe Text -- ^ Id of the catalogs items batch
  , catalogsRetailItemsBatchCreatedUnderscoretime :: Maybe UTCTime -- ^ Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
  , catalogsRetailItemsBatchCompletedUnderscoretime :: Maybe UTCTime -- ^ Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
  , catalogsRetailItemsBatchStatus :: Maybe BatchOperationStatus -- ^ 
  , catalogsRetailItemsBatchCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsRetailItemsBatchItems :: Maybe [ItemProcessingRecord] -- ^ Array with the catalogs items processing records part of the catalogs items batch
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsRetailItemsBatch where
  parseJSON = genericParseJSON optionsCatalogsRetailItemsBatch
instance ToJSON CatalogsRetailItemsBatch where
  toJSON = genericToJSON optionsCatalogsRetailItemsBatch

optionsCatalogsRetailItemsBatch :: Options
optionsCatalogsRetailItemsBatch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsRetailItemsBatchBatchUnderscoreid", "batch_id")
      , ("catalogsRetailItemsBatchCreatedUnderscoretime", "created_time")
      , ("catalogsRetailItemsBatchCompletedUnderscoretime", "completed_time")
      , ("catalogsRetailItemsBatchStatus", "status")
      , ("catalogsRetailItemsBatchCatalogUnderscoretype", "catalog_type")
      , ("catalogsRetailItemsBatchItems", "items")
      ]


-- | 
data CatalogsRetailItemsFilter = CatalogsRetailItemsFilter
  { catalogsRetailItemsFilterCatalogUnderscoretype :: Text -- ^ 
  , catalogsRetailItemsFilterItemUnderscoreids :: [Text] -- ^ 
  , catalogsRetailItemsFilterCatalogUnderscoreid :: Maybe Text -- ^ Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsRetailItemsFilter where
  parseJSON = genericParseJSON optionsCatalogsRetailItemsFilter
instance ToJSON CatalogsRetailItemsFilter where
  toJSON = genericToJSON optionsCatalogsRetailItemsFilter

optionsCatalogsRetailItemsFilter :: Options
optionsCatalogsRetailItemsFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsRetailItemsFilterCatalogUnderscoretype", "catalog_type")
      , ("catalogsRetailItemsFilterItemUnderscoreids", "item_ids")
      , ("catalogsRetailItemsFilterCatalogUnderscoreid", "catalog_id")
      ]


-- | 
data CatalogsRetailProductGroup = CatalogsRetailProductGroup
  { catalogsRetailProductGroupCatalogUnderscoretype :: Text -- ^ 
  , catalogsRetailProductGroupId :: Text -- ^ ID of the catalog product group.
  , catalogsRetailProductGroupName :: Maybe Text -- ^ Name of catalog product group
  , catalogsRetailProductGroupDescription :: Maybe Text -- ^ 
  , catalogsRetailProductGroupFilters :: CatalogsProductGroupFilters -- ^ 
  , catalogsRetailProductGroupIsUnderscorefeatured :: Maybe Bool -- ^ boolean indicator of whether the product group is being featured or not
  , catalogsRetailProductGroupType :: Maybe CatalogsProductGroupType -- ^ 
  , catalogsRetailProductGroupStatus :: Maybe CatalogsProductGroupStatus -- ^ 
  , catalogsRetailProductGroupCreatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of when catalog product group was created.
  , catalogsRetailProductGroupUpdatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of last time catalog product group was updated.
  , catalogsRetailProductGroupFeedUnderscoreid :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsRetailProductGroup where
  parseJSON = genericParseJSON optionsCatalogsRetailProductGroup
instance ToJSON CatalogsRetailProductGroup where
  toJSON = genericToJSON optionsCatalogsRetailProductGroup

optionsCatalogsRetailProductGroup :: Options
optionsCatalogsRetailProductGroup =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsRetailProductGroupCatalogUnderscoretype", "catalog_type")
      , ("catalogsRetailProductGroupId", "id")
      , ("catalogsRetailProductGroupName", "name")
      , ("catalogsRetailProductGroupDescription", "description")
      , ("catalogsRetailProductGroupFilters", "filters")
      , ("catalogsRetailProductGroupIsUnderscorefeatured", "is_featured")
      , ("catalogsRetailProductGroupType", "type")
      , ("catalogsRetailProductGroupStatus", "status")
      , ("catalogsRetailProductGroupCreatedUnderscoreat", "created_at")
      , ("catalogsRetailProductGroupUpdatedUnderscoreat", "updated_at")
      , ("catalogsRetailProductGroupFeedUnderscoreid", "feed_id")
      ]


-- | Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
data CatalogsStatus = CatalogsStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsStatus where
  parseJSON = genericParseJSON optionsCatalogsStatus
instance ToJSON CatalogsStatus where
  toJSON = genericToJSON optionsCatalogsStatus

optionsCatalogsStatus :: Options
optionsCatalogsStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Type of the catalog entity.
data CatalogsType = CatalogsType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsType where
  parseJSON = genericParseJSON optionsCatalogsType
instance ToJSON CatalogsType where
  toJSON = genericToJSON optionsCatalogsType

optionsCatalogsType :: Options
optionsCatalogsType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CatalogsUpdatableHotelAttributes = CatalogsUpdatableHotelAttributes
  { catalogsUpdatableHotelAttributesName :: Maybe Text -- ^ The hotel's name.
  , catalogsUpdatableHotelAttributesLink :: Maybe Text -- ^ Link to the product page
  , catalogsUpdatableHotelAttributesDescription :: Maybe Text -- ^ Brief description of the hotel.
  , catalogsUpdatableHotelAttributesBrand :: Maybe Text -- ^ The brand to which this hotel belongs to.
  , catalogsUpdatableHotelAttributesLatitude :: Maybe Double -- ^ Latitude of the hotel.
  , catalogsUpdatableHotelAttributesLongitude :: Maybe Double -- ^ Longitude of the hotel.
  , catalogsUpdatableHotelAttributesNeighborhood :: Maybe [Text] -- ^ A list of neighborhoods where the hotel is located
  , catalogsUpdatableHotelAttributesAddress :: Maybe CatalogsHotelAddress -- ^ 
  , catalogsUpdatableHotelAttributesCustomUnderscorelabelUnderscore0 :: Maybe Text -- ^ Custom grouping of hotels
  , catalogsUpdatableHotelAttributesCustomUnderscorelabelUnderscore1 :: Maybe Text -- ^ Custom grouping of hotels
  , catalogsUpdatableHotelAttributesCustomUnderscorelabelUnderscore2 :: Maybe Text -- ^ Custom grouping of hotels
  , catalogsUpdatableHotelAttributesCustomUnderscorelabelUnderscore3 :: Maybe Text -- ^ Custom grouping of hotels
  , catalogsUpdatableHotelAttributesCustomUnderscorelabelUnderscore4 :: Maybe Text -- ^ Custom grouping of hotels
  , catalogsUpdatableHotelAttributesCategory :: Maybe Text -- ^ The type of property. The category can be any type of internal description desired.
  , catalogsUpdatableHotelAttributesBaseUnderscoreprice :: Maybe Text -- ^ Base price of the hotel room per night followed by the ISO currency code
  , catalogsUpdatableHotelAttributesSaleUnderscoreprice :: Maybe Text -- ^ Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
  , catalogsUpdatableHotelAttributesGuestUnderscoreratings :: Maybe CatalogsHotelGuestRatings -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsUpdatableHotelAttributes where
  parseJSON = genericParseJSON optionsCatalogsUpdatableHotelAttributes
instance ToJSON CatalogsUpdatableHotelAttributes where
  toJSON = genericToJSON optionsCatalogsUpdatableHotelAttributes

optionsCatalogsUpdatableHotelAttributes :: Options
optionsCatalogsUpdatableHotelAttributes =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsUpdatableHotelAttributesName", "name")
      , ("catalogsUpdatableHotelAttributesLink", "link")
      , ("catalogsUpdatableHotelAttributesDescription", "description")
      , ("catalogsUpdatableHotelAttributesBrand", "brand")
      , ("catalogsUpdatableHotelAttributesLatitude", "latitude")
      , ("catalogsUpdatableHotelAttributesLongitude", "longitude")
      , ("catalogsUpdatableHotelAttributesNeighborhood", "neighborhood")
      , ("catalogsUpdatableHotelAttributesAddress", "address")
      , ("catalogsUpdatableHotelAttributesCustomUnderscorelabelUnderscore0", "custom_label_0")
      , ("catalogsUpdatableHotelAttributesCustomUnderscorelabelUnderscore1", "custom_label_1")
      , ("catalogsUpdatableHotelAttributesCustomUnderscorelabelUnderscore2", "custom_label_2")
      , ("catalogsUpdatableHotelAttributesCustomUnderscorelabelUnderscore3", "custom_label_3")
      , ("catalogsUpdatableHotelAttributesCustomUnderscorelabelUnderscore4", "custom_label_4")
      , ("catalogsUpdatableHotelAttributesCategory", "category")
      , ("catalogsUpdatableHotelAttributesBaseUnderscoreprice", "base_price")
      , ("catalogsUpdatableHotelAttributesSaleUnderscoreprice", "sale_price")
      , ("catalogsUpdatableHotelAttributesGuestUnderscoreratings", "guest_ratings")
      ]


-- | Object describing an hotel item batch record
data CatalogsUpdateHotelItem = CatalogsUpdateHotelItem
  { catalogsUpdateHotelItemHotelUnderscoreid :: Text -- ^ The catalog hotel item id in the merchant namespace
  , catalogsUpdateHotelItemOperation :: Text -- ^ 
  , catalogsUpdateHotelItemAttributes :: CatalogsUpdatableHotelAttributes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsUpdateHotelItem where
  parseJSON = genericParseJSON optionsCatalogsUpdateHotelItem
instance ToJSON CatalogsUpdateHotelItem where
  toJSON = genericToJSON optionsCatalogsUpdateHotelItem

optionsCatalogsUpdateHotelItem :: Options
optionsCatalogsUpdateHotelItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsUpdateHotelItemHotelUnderscoreid", "hotel_id")
      , ("catalogsUpdateHotelItemOperation", "operation")
      , ("catalogsUpdateHotelItemAttributes", "attributes")
      ]


-- | An item to be updated
data CatalogsUpdateRetailItem = CatalogsUpdateRetailItem
  { catalogsUpdateRetailItemItemUnderscoreid :: Text -- ^ The catalog item id in the merchant namespace
  , catalogsUpdateRetailItemOperation :: Text -- ^ 
  , catalogsUpdateRetailItemAttributes :: UpdatableItemAttributes -- ^ 
  , catalogsUpdateRetailItemUpdateUnderscoremask :: Maybe [UpdateMaskFieldType] -- ^ The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsUpdateRetailItem where
  parseJSON = genericParseJSON optionsCatalogsUpdateRetailItem
instance ToJSON CatalogsUpdateRetailItem where
  toJSON = genericToJSON optionsCatalogsUpdateRetailItem

optionsCatalogsUpdateRetailItem :: Options
optionsCatalogsUpdateRetailItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsUpdateRetailItemItemUnderscoreid", "item_id")
      , ("catalogsUpdateRetailItemOperation", "operation")
      , ("catalogsUpdateRetailItemAttributes", "attributes")
      , ("catalogsUpdateRetailItemUpdateUnderscoremask", "update_mask")
      ]


-- | A hotel item to be upserted.
data CatalogsUpsertHotelItem = CatalogsUpsertHotelItem
  { catalogsUpsertHotelItemHotelUnderscoreid :: Text -- ^ The catalog hotel id in the merchant namespace
  , catalogsUpsertHotelItemOperation :: Text -- ^ 
  , catalogsUpsertHotelItemAttributes :: CatalogsHotelAttributes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsUpsertHotelItem where
  parseJSON = genericParseJSON optionsCatalogsUpsertHotelItem
instance ToJSON CatalogsUpsertHotelItem where
  toJSON = genericToJSON optionsCatalogsUpsertHotelItem

optionsCatalogsUpsertHotelItem :: Options
optionsCatalogsUpsertHotelItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsUpsertHotelItemHotelUnderscoreid", "hotel_id")
      , ("catalogsUpsertHotelItemOperation", "operation")
      , ("catalogsUpsertHotelItemAttributes", "attributes")
      ]


-- | An item to be upserted
data CatalogsUpsertRetailItem = CatalogsUpsertRetailItem
  { catalogsUpsertRetailItemItemUnderscoreid :: Text -- ^ The catalog item id in the merchant namespace
  , catalogsUpsertRetailItemOperation :: Text -- ^ 
  , catalogsUpsertRetailItemAttributes :: ItemAttributes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsUpsertRetailItem where
  parseJSON = genericParseJSON optionsCatalogsUpsertRetailItem
instance ToJSON CatalogsUpsertRetailItem where
  toJSON = genericToJSON optionsCatalogsUpsertRetailItem

optionsCatalogsUpsertRetailItem :: Options
optionsCatalogsUpsertRetailItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsUpsertRetailItemItemUnderscoreid", "item_id")
      , ("catalogsUpsertRetailItemOperation", "operation")
      , ("catalogsUpsertRetailItemAttributes", "attributes")
      ]


-- | A request object that can have multiple operations on a single batch
data CatalogsVerticalBatchRequest = CatalogsVerticalBatchRequest
  { catalogsVerticalBatchRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsVerticalBatchRequestCountry :: Country -- ^ 
  , catalogsVerticalBatchRequestLanguage :: Language -- ^ 
  , catalogsVerticalBatchRequestItems :: [CatalogsHotelBatchItem] -- ^ Array with catalogs item operations
  , catalogsVerticalBatchRequestCatalogUnderscoreid :: Maybe Text -- ^ Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsVerticalBatchRequest where
  parseJSON = genericParseJSON optionsCatalogsVerticalBatchRequest
instance ToJSON CatalogsVerticalBatchRequest where
  toJSON = genericToJSON optionsCatalogsVerticalBatchRequest

optionsCatalogsVerticalBatchRequest :: Options
optionsCatalogsVerticalBatchRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsVerticalBatchRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsVerticalBatchRequestCountry", "country")
      , ("catalogsVerticalBatchRequestLanguage", "language")
      , ("catalogsVerticalBatchRequestItems", "items")
      , ("catalogsVerticalBatchRequestCatalogUnderscoreid", "catalog_id")
      ]


-- | Request object for creating a feed.
data CatalogsVerticalFeedsCreateRequest = CatalogsVerticalFeedsCreateRequest
  { catalogsVerticalFeedsCreateRequestDefaultUnderscorecurrency :: Maybe NullableCurrency -- ^ 
  , catalogsVerticalFeedsCreateRequestName :: Text -- ^ A human-friendly name associated to a given feed.
  , catalogsVerticalFeedsCreateRequestFormat :: CatalogsFormat -- ^ 
  , catalogsVerticalFeedsCreateRequestDefaultUnderscorelocale :: CatalogsFeedsCreateRequestDefaultLocale -- ^ 
  , catalogsVerticalFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials -- ^ 
  , catalogsVerticalFeedsCreateRequestLocation :: Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsVerticalFeedsCreateRequestPreferredUnderscoreprocessingUnderscoreschedule :: Maybe CatalogsFeedProcessingSchedule -- ^ 
  , catalogsVerticalFeedsCreateRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsVerticalFeedsCreateRequestDefaultUnderscorecountry :: Country -- ^ 
  , catalogsVerticalFeedsCreateRequestDefaultUnderscoreavailability :: Maybe ProductAvailabilityType -- ^ 
  , catalogsVerticalFeedsCreateRequestCatalogUnderscoreid :: Maybe Text -- ^ Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsVerticalFeedsCreateRequest where
  parseJSON = genericParseJSON optionsCatalogsVerticalFeedsCreateRequest
instance ToJSON CatalogsVerticalFeedsCreateRequest where
  toJSON = genericToJSON optionsCatalogsVerticalFeedsCreateRequest

optionsCatalogsVerticalFeedsCreateRequest :: Options
optionsCatalogsVerticalFeedsCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsVerticalFeedsCreateRequestDefaultUnderscorecurrency", "default_currency")
      , ("catalogsVerticalFeedsCreateRequestName", "name")
      , ("catalogsVerticalFeedsCreateRequestFormat", "format")
      , ("catalogsVerticalFeedsCreateRequestDefaultUnderscorelocale", "default_locale")
      , ("catalogsVerticalFeedsCreateRequestCredentials", "credentials")
      , ("catalogsVerticalFeedsCreateRequestLocation", "location")
      , ("catalogsVerticalFeedsCreateRequestPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("catalogsVerticalFeedsCreateRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsVerticalFeedsCreateRequestDefaultUnderscorecountry", "default_country")
      , ("catalogsVerticalFeedsCreateRequestDefaultUnderscoreavailability", "default_availability")
      , ("catalogsVerticalFeedsCreateRequestCatalogUnderscoreid", "catalog_id")
      ]


-- | Request object for updating a feed.
data CatalogsVerticalFeedsUpdateRequest = CatalogsVerticalFeedsUpdateRequest
  { catalogsVerticalFeedsUpdateRequestDefaultUnderscorecurrency :: Maybe NullableCurrency -- ^ 
  , catalogsVerticalFeedsUpdateRequestName :: Maybe Text -- ^ A human-friendly name associated to a given feed.
  , catalogsVerticalFeedsUpdateRequestFormat :: Maybe CatalogsFormat -- ^ 
  , catalogsVerticalFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials -- ^ 
  , catalogsVerticalFeedsUpdateRequestLocation :: Maybe Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsVerticalFeedsUpdateRequestPreferredUnderscoreprocessingUnderscoreschedule :: Maybe CatalogsFeedProcessingSchedule -- ^ 
  , catalogsVerticalFeedsUpdateRequestStatus :: Maybe CatalogsStatus -- ^ 
  , catalogsVerticalFeedsUpdateRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  , catalogsVerticalFeedsUpdateRequestDefaultUnderscoreavailability :: Maybe ProductAvailabilityType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsVerticalFeedsUpdateRequest where
  parseJSON = genericParseJSON optionsCatalogsVerticalFeedsUpdateRequest
instance ToJSON CatalogsVerticalFeedsUpdateRequest where
  toJSON = genericToJSON optionsCatalogsVerticalFeedsUpdateRequest

optionsCatalogsVerticalFeedsUpdateRequest :: Options
optionsCatalogsVerticalFeedsUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsVerticalFeedsUpdateRequestDefaultUnderscorecurrency", "default_currency")
      , ("catalogsVerticalFeedsUpdateRequestName", "name")
      , ("catalogsVerticalFeedsUpdateRequestFormat", "format")
      , ("catalogsVerticalFeedsUpdateRequestCredentials", "credentials")
      , ("catalogsVerticalFeedsUpdateRequestLocation", "location")
      , ("catalogsVerticalFeedsUpdateRequestPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("catalogsVerticalFeedsUpdateRequestStatus", "status")
      , ("catalogsVerticalFeedsUpdateRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsVerticalFeedsUpdateRequestDefaultUnderscoreavailability", "default_availability")
      ]


-- | 
data CatalogsVerticalProductGroup = CatalogsVerticalProductGroup
  { catalogsVerticalProductGroupCatalogUnderscoretype :: Text -- ^ 
  , catalogsVerticalProductGroupId :: Text -- ^ ID of the catalog product group.
  , catalogsVerticalProductGroupName :: Maybe Text -- ^ Name of catalog product group
  , catalogsVerticalProductGroupDescription :: Maybe Text -- ^ 
  , catalogsVerticalProductGroupFilters :: CatalogsProductGroupFilters -- ^ 
  , catalogsVerticalProductGroupCreatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of when catalog product group was created.
  , catalogsVerticalProductGroupUpdatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of last time catalog product group was updated.
  , catalogsVerticalProductGroupCatalogUnderscoreid :: Text -- ^ 
  , catalogsVerticalProductGroupIsUnderscorefeatured :: Maybe Bool -- ^ boolean indicator of whether the product group is being featured or not
  , catalogsVerticalProductGroupType :: Maybe CatalogsProductGroupType -- ^ 
  , catalogsVerticalProductGroupStatus :: Maybe CatalogsProductGroupStatus -- ^ 
  , catalogsVerticalProductGroupFeedUnderscoreid :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsVerticalProductGroup where
  parseJSON = genericParseJSON optionsCatalogsVerticalProductGroup
instance ToJSON CatalogsVerticalProductGroup where
  toJSON = genericToJSON optionsCatalogsVerticalProductGroup

optionsCatalogsVerticalProductGroup :: Options
optionsCatalogsVerticalProductGroup =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsVerticalProductGroupCatalogUnderscoretype", "catalog_type")
      , ("catalogsVerticalProductGroupId", "id")
      , ("catalogsVerticalProductGroupName", "name")
      , ("catalogsVerticalProductGroupDescription", "description")
      , ("catalogsVerticalProductGroupFilters", "filters")
      , ("catalogsVerticalProductGroupCreatedUnderscoreat", "created_at")
      , ("catalogsVerticalProductGroupUpdatedUnderscoreat", "updated_at")
      , ("catalogsVerticalProductGroupCatalogUnderscoreid", "catalog_id")
      , ("catalogsVerticalProductGroupIsUnderscorefeatured", "is_featured")
      , ("catalogsVerticalProductGroupType", "type")
      , ("catalogsVerticalProductGroupStatus", "status")
      , ("catalogsVerticalProductGroupFeedUnderscoreid", "feed_id")
      ]


-- | Request object for creating a hotel product group.
data CatalogsVerticalProductGroupCreateRequest = CatalogsVerticalProductGroupCreateRequest
  { catalogsVerticalProductGroupCreateRequestCatalogUnderscoretype :: Text -- ^ 
  , catalogsVerticalProductGroupCreateRequestName :: Text -- ^ 
  , catalogsVerticalProductGroupCreateRequestDescription :: Maybe Text -- ^ 
  , catalogsVerticalProductGroupCreateRequestFilters :: CatalogsHotelProductGroupFilters -- ^ 
  , catalogsVerticalProductGroupCreateRequestCatalogUnderscoreid :: Text -- ^ Catalog id pertaining to the hotel product group.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsVerticalProductGroupCreateRequest where
  parseJSON = genericParseJSON optionsCatalogsVerticalProductGroupCreateRequest
instance ToJSON CatalogsVerticalProductGroupCreateRequest where
  toJSON = genericToJSON optionsCatalogsVerticalProductGroupCreateRequest

optionsCatalogsVerticalProductGroupCreateRequest :: Options
optionsCatalogsVerticalProductGroupCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsVerticalProductGroupCreateRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsVerticalProductGroupCreateRequestName", "name")
      , ("catalogsVerticalProductGroupCreateRequestDescription", "description")
      , ("catalogsVerticalProductGroupCreateRequestFilters", "filters")
      , ("catalogsVerticalProductGroupCreateRequestCatalogUnderscoreid", "catalog_id")
      ]


-- | Request object for updating a hotel product group.
data CatalogsVerticalProductGroupUpdateRequest = CatalogsVerticalProductGroupUpdateRequest
  { catalogsVerticalProductGroupUpdateRequestCatalogUnderscoretype :: Maybe Text -- ^ 
  , catalogsVerticalProductGroupUpdateRequestName :: Maybe Text -- ^ 
  , catalogsVerticalProductGroupUpdateRequestDescription :: Maybe Text -- ^ 
  , catalogsVerticalProductGroupUpdateRequestFilters :: Maybe CatalogsHotelProductGroupFilters -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsVerticalProductGroupUpdateRequest where
  parseJSON = genericParseJSON optionsCatalogsVerticalProductGroupUpdateRequest
instance ToJSON CatalogsVerticalProductGroupUpdateRequest where
  toJSON = genericToJSON optionsCatalogsVerticalProductGroupUpdateRequest

optionsCatalogsVerticalProductGroupUpdateRequest :: Options
optionsCatalogsVerticalProductGroupUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("catalogsVerticalProductGroupUpdateRequestCatalogUnderscoretype", "catalog_type")
      , ("catalogsVerticalProductGroupUpdateRequestName", "name")
      , ("catalogsVerticalProductGroupUpdateRequestDescription", "description")
      , ("catalogsVerticalProductGroupUpdateRequestFilters", "filters")
      ]


-- | 
data ConditionFilter = ConditionFilter
  { conditionFilterCONDITION :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ConditionFilter where
  parseJSON = genericParseJSON optionsConditionFilter
instance ToJSON ConditionFilter where
  toJSON = genericToJSON optionsConditionFilter

optionsConditionFilter :: Options
optionsConditionFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conditionFilterCONDITION", "CONDITION")
      ]


-- | Schema describing the object in the response, which contains information about the events that were received and processed.
data ConversionApiResponse = ConversionApiResponse
  { conversionApiResponseNumUnderscoreeventsUnderscorereceived :: Int -- ^ Total number of events received in the request.
  , conversionApiResponseNumUnderscoreeventsUnderscoreprocessed :: Int -- ^ Number of events that were successfully processed from the events.
  , conversionApiResponseEvents :: [ConversionApiResponseEventsInner] -- ^ Specific messages for each event received. The order will match the order in which the events were received in the request.
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionApiResponse where
  parseJSON = genericParseJSON optionsConversionApiResponse
instance ToJSON ConversionApiResponse where
  toJSON = genericToJSON optionsConversionApiResponse

optionsConversionApiResponse :: Options
optionsConversionApiResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionApiResponseNumUnderscoreeventsUnderscorereceived", "num_events_received")
      , ("conversionApiResponseNumUnderscoreeventsUnderscoreprocessed", "num_events_processed")
      , ("conversionApiResponseEvents", "events")
      ]


-- | 
data ConversionApiResponseEventsInner = ConversionApiResponseEventsInner
  { conversionApiResponseEventsInnerStatus :: Text -- ^ Whether the event was processed successfully.
  , conversionApiResponseEventsInnerErrorUnderscoremessage :: Maybe Text -- ^ Error message containing more information about why the event failed to be processed.
  , conversionApiResponseEventsInnerWarningUnderscoremessage :: Maybe Text -- ^ Warning messages about any fields in the event which are not standard. These are not critical to event processing.
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionApiResponseEventsInner where
  parseJSON = genericParseJSON optionsConversionApiResponseEventsInner
instance ToJSON ConversionApiResponseEventsInner where
  toJSON = genericToJSON optionsConversionApiResponseEventsInner

optionsConversionApiResponseEventsInner :: Options
optionsConversionApiResponseEventsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionApiResponseEventsInnerStatus", "status")
      , ("conversionApiResponseEventsInnerErrorUnderscoremessage", "error_message")
      , ("conversionApiResponseEventsInnerWarningUnderscoremessage", "warning_message")
      ]


-- | 
data ConversionAttributionWindowDays = ConversionAttributionWindowDays
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionAttributionWindowDays where
  parseJSON = genericParseJSON optionsConversionAttributionWindowDays
instance ToJSON ConversionAttributionWindowDays where
  toJSON = genericToJSON optionsConversionAttributionWindowDays

optionsConversionAttributionWindowDays :: Options
optionsConversionAttributionWindowDays =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data ConversionEventResponse = ConversionEventResponse
  { conversionEventResponseConversionUnderscoreevent :: Maybe ConversionTagType -- ^ 
  , conversionEventResponseConversionUnderscoretagUnderscoreid :: Maybe Text -- ^ Id of the tag.
  , conversionEventResponseAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Id of the ad account.
  , conversionEventResponseCreatedUnderscoretime :: Maybe Int -- ^ Creation date in epoch format.
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionEventResponse where
  parseJSON = genericParseJSON optionsConversionEventResponse
instance ToJSON ConversionEventResponse where
  toJSON = genericToJSON optionsConversionEventResponse

optionsConversionEventResponse :: Options
optionsConversionEventResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionEventResponseConversionUnderscoreevent", "conversion_event")
      , ("conversionEventResponseConversionUnderscoretagUnderscoreid", "conversion_tag_id")
      , ("conversionEventResponseAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("conversionEventResponseCreatedUnderscoretime", "created_time")
      ]


-- | A list of events (one or more) encapsulated by a data object.
data ConversionEvents = ConversionEvents
  { conversionEventsData :: [ConversionEventsDataInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionEvents where
  parseJSON = genericParseJSON optionsConversionEvents
instance ToJSON ConversionEvents where
  toJSON = genericToJSON optionsConversionEvents

optionsConversionEvents :: Options
optionsConversionEvents =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionEventsData", "data")
      ]


-- | 
data ConversionEventsDataInner = ConversionEventsDataInner
  { conversionEventsDataInnerEventUnderscorename :: Text -- ^ The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. <li><code>add_to_cart</code> <li><code>checkout</code> <li><code>custom</code> <li><code>lead</code> <li><code>page_visit</code> <li><code>search</code> <li><code>signup</code> <li><code>view_category</code> <li><code>watch_video</code>
  , conversionEventsDataInnerActionUnderscoresource :: Text -- ^ The source indicating where the conversion event occurred. <li><code>app_android</code> <li><code>app_ios</code> <li><code>web</code> <li><code>offline</code>
  , conversionEventsDataInnerEventUnderscoretime :: Int64 -- ^ The time when the event happened. Unix timestamp in seconds.
  , conversionEventsDataInnerEventUnderscoreid :: Text -- ^ A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
  , conversionEventsDataInnerEventUnderscoresourceUnderscoreurl :: Maybe Text -- ^ URL of the web conversion event.
  , conversionEventsDataInnerOptUnderscoreout :: Maybe Bool -- ^ When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
  , conversionEventsDataInnerPartnerUnderscorename :: Maybe Text -- ^ The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
  , conversionEventsDataInnerUserUnderscoredata :: ConversionEventsUserData -- ^ 
  , conversionEventsDataInnerCustomUnderscoredata :: Maybe ConversionEventsDataInnerCustomData -- ^ 
  , conversionEventsDataInnerAppUnderscoreid :: Maybe Text -- ^ The app store app ID.
  , conversionEventsDataInnerAppUnderscorename :: Maybe Text -- ^ Name of the app.
  , conversionEventsDataInnerAppUnderscoreversion :: Maybe Text -- ^ Version of the app.
  , conversionEventsDataInnerDeviceUnderscorebrand :: Maybe Text -- ^ Brand of the user device.
  , conversionEventsDataInnerDeviceUnderscorecarrier :: Maybe Text -- ^ User device's mobile carrier.
  , conversionEventsDataInnerDeviceUnderscoremodel :: Maybe Text -- ^ Model of the user device.
  , conversionEventsDataInnerDeviceUnderscoretype :: Maybe Text -- ^ Type of the user device.
  , conversionEventsDataInnerOsUnderscoreversion :: Maybe Text -- ^ Version of the device operating system.
  , conversionEventsDataInnerWifi :: Maybe Bool -- ^ Whether the event occurred when the user device was connected to wifi.
  , conversionEventsDataInnerLanguage :: Maybe Text -- ^ Two-character ISO-639-1 language code indicating the user's language.
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionEventsDataInner where
  parseJSON = genericParseJSON optionsConversionEventsDataInner
instance ToJSON ConversionEventsDataInner where
  toJSON = genericToJSON optionsConversionEventsDataInner

optionsConversionEventsDataInner :: Options
optionsConversionEventsDataInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionEventsDataInnerEventUnderscorename", "event_name")
      , ("conversionEventsDataInnerActionUnderscoresource", "action_source")
      , ("conversionEventsDataInnerEventUnderscoretime", "event_time")
      , ("conversionEventsDataInnerEventUnderscoreid", "event_id")
      , ("conversionEventsDataInnerEventUnderscoresourceUnderscoreurl", "event_source_url")
      , ("conversionEventsDataInnerOptUnderscoreout", "opt_out")
      , ("conversionEventsDataInnerPartnerUnderscorename", "partner_name")
      , ("conversionEventsDataInnerUserUnderscoredata", "user_data")
      , ("conversionEventsDataInnerCustomUnderscoredata", "custom_data")
      , ("conversionEventsDataInnerAppUnderscoreid", "app_id")
      , ("conversionEventsDataInnerAppUnderscorename", "app_name")
      , ("conversionEventsDataInnerAppUnderscoreversion", "app_version")
      , ("conversionEventsDataInnerDeviceUnderscorebrand", "device_brand")
      , ("conversionEventsDataInnerDeviceUnderscorecarrier", "device_carrier")
      , ("conversionEventsDataInnerDeviceUnderscoremodel", "device_model")
      , ("conversionEventsDataInnerDeviceUnderscoretype", "device_type")
      , ("conversionEventsDataInnerOsUnderscoreversion", "os_version")
      , ("conversionEventsDataInnerWifi", "wifi")
      , ("conversionEventsDataInnerLanguage", "language")
      ]


-- | Object containing other custom data.
data ConversionEventsDataInnerCustomData = ConversionEventsDataInnerCustomData
  { conversionEventsDataInnerCustomDataCurrency :: Maybe Text -- ^ The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
  , conversionEventsDataInnerCustomDataValue :: Maybe Text -- ^ Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
  , conversionEventsDataInnerCustomDataContentUnderscoreids :: Maybe [Text] -- ^ List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  , conversionEventsDataInnerCustomDataContentUnderscorename :: Maybe Text -- ^ The name of the page or product associated with the event.
  , conversionEventsDataInnerCustomDataContentUnderscorecategory :: Maybe Text -- ^ The category of the content associated with the event.
  , conversionEventsDataInnerCustomDataContentUnderscorebrand :: Maybe Text -- ^ The brand of the content associated with the event.
  , conversionEventsDataInnerCustomDataContents :: Maybe [ConversionEventsDataInnerCustomDataContentsInner] -- ^ A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  , conversionEventsDataInnerCustomDataNumUnderscoreitems :: Maybe Int64 -- ^ Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  , conversionEventsDataInnerCustomDataOrderUnderscoreid :: Maybe Text -- ^ The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
  , conversionEventsDataInnerCustomDataSearchUnderscorestring :: Maybe Text -- ^ The search string related to the user conversion event.
  , conversionEventsDataInnerCustomDataOptUnderscoreoutUnderscoretype :: Maybe Text -- ^ Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"https://developers.pinterest.com/docs/conversions/conversion-management/#Understanding%20Limited%20Data%20Processing\" target=\"_blank\">dev site</a> for specific opt_out_type set up.
  , conversionEventsDataInnerCustomDataNp :: Maybe Text -- ^ Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionEventsDataInnerCustomData where
  parseJSON = genericParseJSON optionsConversionEventsDataInnerCustomData
instance ToJSON ConversionEventsDataInnerCustomData where
  toJSON = genericToJSON optionsConversionEventsDataInnerCustomData

optionsConversionEventsDataInnerCustomData :: Options
optionsConversionEventsDataInnerCustomData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionEventsDataInnerCustomDataCurrency", "currency")
      , ("conversionEventsDataInnerCustomDataValue", "value")
      , ("conversionEventsDataInnerCustomDataContentUnderscoreids", "content_ids")
      , ("conversionEventsDataInnerCustomDataContentUnderscorename", "content_name")
      , ("conversionEventsDataInnerCustomDataContentUnderscorecategory", "content_category")
      , ("conversionEventsDataInnerCustomDataContentUnderscorebrand", "content_brand")
      , ("conversionEventsDataInnerCustomDataContents", "contents")
      , ("conversionEventsDataInnerCustomDataNumUnderscoreitems", "num_items")
      , ("conversionEventsDataInnerCustomDataOrderUnderscoreid", "order_id")
      , ("conversionEventsDataInnerCustomDataSearchUnderscorestring", "search_string")
      , ("conversionEventsDataInnerCustomDataOptUnderscoreoutUnderscoretype", "opt_out_type")
      , ("conversionEventsDataInnerCustomDataNp", "np")
      ]


-- | 
data ConversionEventsDataInnerCustomDataContentsInner = ConversionEventsDataInnerCustomDataContentsInner
  { conversionEventsDataInnerCustomDataContentsInnerId :: Maybe Text -- ^ The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  , conversionEventsDataInnerCustomDataContentsInnerItemUnderscoreprice :: Maybe Text -- ^ The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  , conversionEventsDataInnerCustomDataContentsInnerQuantity :: Maybe Int64 -- ^ The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  , conversionEventsDataInnerCustomDataContentsInnerItemUnderscorename :: Maybe Text -- ^ The name of a product.
  , conversionEventsDataInnerCustomDataContentsInnerItemUnderscorecategory :: Maybe Text -- ^ The category of a product.
  , conversionEventsDataInnerCustomDataContentsInnerItemUnderscorebrand :: Maybe Text -- ^ The brand of a product.
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionEventsDataInnerCustomDataContentsInner where
  parseJSON = genericParseJSON optionsConversionEventsDataInnerCustomDataContentsInner
instance ToJSON ConversionEventsDataInnerCustomDataContentsInner where
  toJSON = genericToJSON optionsConversionEventsDataInnerCustomDataContentsInner

optionsConversionEventsDataInnerCustomDataContentsInner :: Options
optionsConversionEventsDataInnerCustomDataContentsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionEventsDataInnerCustomDataContentsInnerId", "id")
      , ("conversionEventsDataInnerCustomDataContentsInnerItemUnderscoreprice", "item_price")
      , ("conversionEventsDataInnerCustomDataContentsInnerQuantity", "quantity")
      , ("conversionEventsDataInnerCustomDataContentsInnerItemUnderscorename", "item_name")
      , ("conversionEventsDataInnerCustomDataContentsInnerItemUnderscorecategory", "item_category")
      , ("conversionEventsDataInnerCustomDataContentsInnerItemUnderscorebrand", "item_brand")
      ]


-- | Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
data ConversionEventsUserData = ConversionEventsUserData
  { conversionEventsUserDataPh :: Maybe [Text] -- ^ Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
  , conversionEventsUserDataGe :: Maybe [Text] -- ^ Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender.
  , conversionEventsUserDataDb :: Maybe [Text] -- ^ Sha256 hashes of user's date of birthday, given as year, month, and day.
  , conversionEventsUserDataLn :: Maybe [Text] -- ^ Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
  , conversionEventsUserDataFn :: Maybe [Text] -- ^ Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
  , conversionEventsUserDataCt :: Maybe [Text] -- ^ Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing).
  , conversionEventsUserDataSt :: Maybe [Text] -- ^ Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing).
  , conversionEventsUserDataZp :: Maybe [Text] -- ^ Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing).
  , conversionEventsUserDataCountry :: Maybe [Text] -- ^ Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase.
  , conversionEventsUserDataExternalUnderscoreid :: Maybe [Text] -- ^ Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA.
  , conversionEventsUserDataClickUnderscoreid :: Maybe Text -- ^ The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
  , conversionEventsUserDataPartnerUnderscoreid :: Maybe Text -- ^ A unique identifier of visitors' information defined by third party partners. e.g RampID
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionEventsUserData where
  parseJSON = genericParseJSON optionsConversionEventsUserData
instance ToJSON ConversionEventsUserData where
  toJSON = genericToJSON optionsConversionEventsUserData

optionsConversionEventsUserData :: Options
optionsConversionEventsUserData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionEventsUserDataPh", "ph")
      , ("conversionEventsUserDataGe", "ge")
      , ("conversionEventsUserDataDb", "db")
      , ("conversionEventsUserDataLn", "ln")
      , ("conversionEventsUserDataFn", "fn")
      , ("conversionEventsUserDataCt", "ct")
      , ("conversionEventsUserDataSt", "st")
      , ("conversionEventsUserDataZp", "zp")
      , ("conversionEventsUserDataCountry", "country")
      , ("conversionEventsUserDataExternalUnderscoreid", "external_id")
      , ("conversionEventsUserDataClickUnderscoreid", "click_id")
      , ("conversionEventsUserDataPartnerUnderscoreid", "partner_id")
      ]


-- | Attribution type. Refers to the Pinterest Tag endpoints
data ConversionReportAttributionType = ConversionReportAttributionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionReportAttributionType where
  parseJSON = genericParseJSON optionsConversionReportAttributionType
instance ToJSON ConversionReportAttributionType where
  toJSON = genericToJSON optionsConversionReportAttributionType

optionsConversionReportAttributionType :: Options
optionsConversionReportAttributionType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Conversion report time type
data ConversionReportTimeType = ConversionReportTimeType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionReportTimeType where
  parseJSON = genericParseJSON optionsConversionReportTimeType
instance ToJSON ConversionReportTimeType where
  toJSON = genericToJSON optionsConversionReportTimeType

optionsConversionReportTimeType :: Options
optionsConversionReportTimeType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data ConversionTagCommon = ConversionTagCommon
  { conversionTagCommonAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Ad account ID.
  , conversionTagCommonCodeUnderscoresnippet :: Maybe Text -- ^ Tag code snippet.
  , conversionTagCommonEnhancedUnderscorematchUnderscorestatus :: Maybe EnhancedMatchStatusType -- ^ 
  , conversionTagCommonId :: Maybe Text -- ^ Tag ID.
  , conversionTagCommonLastUnderscorefiredUnderscoretimeUnderscorems :: Maybe Double -- ^ Time for the last event fired.
  , conversionTagCommonName :: Maybe Text -- ^ Conversion tag name.
  , conversionTagCommonStatus :: Maybe EntityStatus -- ^ 
  , conversionTagCommonVersion :: Maybe Text -- ^ Version number.
  , conversionTagCommonConfigs :: Maybe ConversionTagConfigs -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionTagCommon where
  parseJSON = genericParseJSON optionsConversionTagCommon
instance ToJSON ConversionTagCommon where
  toJSON = genericToJSON optionsConversionTagCommon

optionsConversionTagCommon :: Options
optionsConversionTagCommon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionTagCommonAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("conversionTagCommonCodeUnderscoresnippet", "code_snippet")
      , ("conversionTagCommonEnhancedUnderscorematchUnderscorestatus", "enhanced_match_status")
      , ("conversionTagCommonId", "id")
      , ("conversionTagCommonLastUnderscorefiredUnderscoretimeUnderscorems", "last_fired_time_ms")
      , ("conversionTagCommonName", "name")
      , ("conversionTagCommonStatus", "status")
      , ("conversionTagCommonVersion", "version")
      , ("conversionTagCommonConfigs", "configs")
      ]


-- | 
data ConversionTagConfigs = ConversionTagConfigs
  { conversionTagConfigsAemUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  , conversionTagConfigsMdUnderscorefrequency :: Maybe Double -- ^ Metadata ingestion frequency.
  , conversionTagConfigsAemUnderscorefnlnUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  , conversionTagConfigsAemUnderscorephUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  , conversionTagConfigsAemUnderscoregeUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  , conversionTagConfigsAemUnderscoredbUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  , conversionTagConfigsAemUnderscorelocUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionTagConfigs where
  parseJSON = genericParseJSON optionsConversionTagConfigs
instance ToJSON ConversionTagConfigs where
  toJSON = genericToJSON optionsConversionTagConfigs

optionsConversionTagConfigs :: Options
optionsConversionTagConfigs =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionTagConfigsAemUnderscoreenabled", "aem_enabled")
      , ("conversionTagConfigsMdUnderscorefrequency", "md_frequency")
      , ("conversionTagConfigsAemUnderscorefnlnUnderscoreenabled", "aem_fnln_enabled")
      , ("conversionTagConfigsAemUnderscorephUnderscoreenabled", "aem_ph_enabled")
      , ("conversionTagConfigsAemUnderscoregeUnderscoreenabled", "aem_ge_enabled")
      , ("conversionTagConfigsAemUnderscoredbUnderscoreenabled", "aem_db_enabled")
      , ("conversionTagConfigsAemUnderscorelocUnderscoreenabled", "aem_loc_enabled")
      ]


-- | 
data ConversionTagCreate = ConversionTagCreate
  { conversionTagCreateName :: Text -- ^ Conversion tag name.
  , conversionTagCreateAemUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  , conversionTagCreateMdUnderscorefrequency :: Maybe Double -- ^ Metadata ingestion frequency.
  , conversionTagCreateAemUnderscorefnlnUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  , conversionTagCreateAemUnderscorephUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  , conversionTagCreateAemUnderscoregeUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  , conversionTagCreateAemUnderscoredbUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  , conversionTagCreateAemUnderscorelocUnderscoreenabled :: Maybe Bool -- ^ Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionTagCreate where
  parseJSON = genericParseJSON optionsConversionTagCreate
instance ToJSON ConversionTagCreate where
  toJSON = genericToJSON optionsConversionTagCreate

optionsConversionTagCreate :: Options
optionsConversionTagCreate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionTagCreateName", "name")
      , ("conversionTagCreateAemUnderscoreenabled", "aem_enabled")
      , ("conversionTagCreateMdUnderscorefrequency", "md_frequency")
      , ("conversionTagCreateAemUnderscorefnlnUnderscoreenabled", "aem_fnln_enabled")
      , ("conversionTagCreateAemUnderscorephUnderscoreenabled", "aem_ph_enabled")
      , ("conversionTagCreateAemUnderscoregeUnderscoreenabled", "aem_ge_enabled")
      , ("conversionTagCreateAemUnderscoredbUnderscoreenabled", "aem_db_enabled")
      , ("conversionTagCreateAemUnderscorelocUnderscoreenabled", "aem_loc_enabled")
      ]


-- | 
data ConversionTagListResponse = ConversionTagListResponse
  { conversionTagListResponseItems :: Maybe [ConversionTagResponse] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionTagListResponse where
  parseJSON = genericParseJSON optionsConversionTagListResponse
instance ToJSON ConversionTagListResponse where
  toJSON = genericToJSON optionsConversionTagListResponse

optionsConversionTagListResponse :: Options
optionsConversionTagListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionTagListResponseItems", "items")
      ]


-- | 
data ConversionTagResponse = ConversionTagResponse
  { conversionTagResponseAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Ad account ID.
  , conversionTagResponseCodeUnderscoresnippet :: Maybe Text -- ^ Tag code snippet.
  , conversionTagResponseEnhancedUnderscorematchUnderscorestatus :: Maybe EnhancedMatchStatusType -- ^ 
  , conversionTagResponseId :: Maybe Text -- ^ Tag ID.
  , conversionTagResponseLastUnderscorefiredUnderscoretimeUnderscorems :: Maybe Double -- ^ Time for the last event fired.
  , conversionTagResponseName :: Maybe Text -- ^ Conversion tag name.
  , conversionTagResponseStatus :: Maybe EntityStatus -- ^ 
  , conversionTagResponseVersion :: Maybe Text -- ^ Version number.
  , conversionTagResponseConfigs :: Maybe ConversionTagConfigs -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionTagResponse where
  parseJSON = genericParseJSON optionsConversionTagResponse
instance ToJSON ConversionTagResponse where
  toJSON = genericToJSON optionsConversionTagResponse

optionsConversionTagResponse :: Options
optionsConversionTagResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("conversionTagResponseAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("conversionTagResponseCodeUnderscoresnippet", "code_snippet")
      , ("conversionTagResponseEnhancedUnderscorematchUnderscorestatus", "enhanced_match_status")
      , ("conversionTagResponseId", "id")
      , ("conversionTagResponseLastUnderscorefiredUnderscoretimeUnderscorems", "last_fired_time_ms")
      , ("conversionTagResponseName", "name")
      , ("conversionTagResponseStatus", "status")
      , ("conversionTagResponseVersion", "version")
      , ("conversionTagResponseConfigs", "configs")
      ]


-- | conversion tag type
data ConversionTagType = ConversionTagType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionTagType where
  parseJSON = genericParseJSON optionsConversionTagType
instance ToJSON ConversionTagType where
  toJSON = genericToJSON optionsConversionTagType

optionsConversionTagType :: Options
optionsConversionTagType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Country ID from ISO 3166-1 alpha-2.
data Country = Country
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON Country where
  parseJSON = genericParseJSON optionsCountry
instance ToJSON Country where
  toJSON = genericToJSON optionsCountry

optionsCountry :: Options
optionsCountry =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CountryFilter = CountryFilter
  { countryFilterCOUNTRY :: CatalogsProductGroupMultipleCountriesCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CountryFilter where
  parseJSON = genericParseJSON optionsCountryFilter
instance ToJSON CountryFilter where
  toJSON = genericToJSON optionsCountryFilter

optionsCountryFilter :: Options
optionsCountryFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("countryFilterCOUNTRY", "COUNTRY")
      ]


-- | 
data CreateMMMReportRequest = CreateMMMReportRequest
  { createMMMReportRequestReportUnderscorename :: Text -- ^ Name of the Marketing Mix Modeling (MMM) report
  , createMMMReportRequestStartUnderscoredate :: Text -- ^ Metric report start date (UTC). Format: YYYY-MM-DD
  , createMMMReportRequestEndUnderscoredate :: Text -- ^ Metric report end date (UTC). Format: YYYY-MM-DD
  , createMMMReportRequestGranularity :: Text -- ^ DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
  , createMMMReportRequestLevel :: Text -- ^ Level of the report
  , createMMMReportRequestTargetingUnderscoretypes :: [MMMReportingTargetingType] -- ^ List of targeting types
  , createMMMReportRequestColumns :: [MMMReportingColumn] -- ^ Metric and entity columns
  , createMMMReportRequestCountries :: Maybe [TargetingAdvertiserCountry] -- ^ A List of countries for filtering
  } deriving (Show, Eq, Generic)

instance FromJSON CreateMMMReportRequest where
  parseJSON = genericParseJSON optionsCreateMMMReportRequest
instance ToJSON CreateMMMReportRequest where
  toJSON = genericToJSON optionsCreateMMMReportRequest

optionsCreateMMMReportRequest :: Options
optionsCreateMMMReportRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createMMMReportRequestReportUnderscorename", "report_name")
      , ("createMMMReportRequestStartUnderscoredate", "start_date")
      , ("createMMMReportRequestEndUnderscoredate", "end_date")
      , ("createMMMReportRequestGranularity", "granularity")
      , ("createMMMReportRequestLevel", "level")
      , ("createMMMReportRequestTargetingUnderscoretypes", "targeting_types")
      , ("createMMMReportRequestColumns", "columns")
      , ("createMMMReportRequestCountries", "countries")
      ]


-- | 
data CreateMMMReportResponse = CreateMMMReportResponse
  { createMMMReportResponseCode :: Maybe Double -- ^ 
  , createMMMReportResponseData :: Maybe CreateMMMReportResponseData -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateMMMReportResponse where
  parseJSON = genericParseJSON optionsCreateMMMReportResponse
instance ToJSON CreateMMMReportResponse where
  toJSON = genericToJSON optionsCreateMMMReportResponse

optionsCreateMMMReportResponse :: Options
optionsCreateMMMReportResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createMMMReportResponseCode", "code")
      , ("createMMMReportResponseData", "data")
      ]


-- | 
data CreateMMMReportResponseData = CreateMMMReportResponseData
  { createMMMReportResponseDataReportUnderscorestatus :: Maybe BulkReportingJobStatus -- ^ 
  , createMMMReportResponseDataToken :: Maybe Text -- ^ 
  , createMMMReportResponseDataMessage :: Maybe Text -- ^ 
  , createMMMReportResponseDataStatus :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateMMMReportResponseData where
  parseJSON = genericParseJSON optionsCreateMMMReportResponseData
instance ToJSON CreateMMMReportResponseData where
  toJSON = genericToJSON optionsCreateMMMReportResponseData

optionsCreateMMMReportResponseData :: Options
optionsCreateMMMReportResponseData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createMMMReportResponseDataReportUnderscorestatus", "report_status")
      , ("createMMMReportResponseDataToken", "token")
      , ("createMMMReportResponseDataMessage", "message")
      , ("createMMMReportResponseDataStatus", "status")
      ]


-- | Ad creative type enum. For update, only draft ads may update creative type. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
data CreativeType = CreativeType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreativeType where
  parseJSON = genericParseJSON optionsCreativeType
instance ToJSON CreativeType where
  toJSON = genericToJSON optionsCreativeType

optionsCreativeType :: Options
optionsCreativeType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Currency Codes from ISO 4217
data Currency = Currency
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON Currency where
  parseJSON = genericParseJSON optionsCurrency
instance ToJSON Currency where
  toJSON = genericToJSON optionsCurrency

optionsCurrency :: Options
optionsCurrency =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CurrencyFilter = CurrencyFilter
  { currencyFilterCURRENCY :: CatalogsProductGroupCurrencyCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CurrencyFilter where
  parseJSON = genericParseJSON optionsCurrencyFilter
instance ToJSON CurrencyFilter where
  toJSON = genericToJSON optionsCurrencyFilter

optionsCurrencyFilter :: Options
optionsCurrencyFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("currencyFilterCURRENCY", "CURRENCY")
      ]


-- | 
data CustomLabel0Filter = CustomLabel0Filter
  { customLabel0FilterCUSTOMUnderscoreLABELUnderscore0 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomLabel0Filter where
  parseJSON = genericParseJSON optionsCustomLabel0Filter
instance ToJSON CustomLabel0Filter where
  toJSON = genericToJSON optionsCustomLabel0Filter

optionsCustomLabel0Filter :: Options
optionsCustomLabel0Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("customLabel0FilterCUSTOMUnderscoreLABELUnderscore0", "CUSTOM_LABEL_0")
      ]


-- | 
data CustomLabel1Filter = CustomLabel1Filter
  { customLabel1FilterCUSTOMUnderscoreLABELUnderscore1 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomLabel1Filter where
  parseJSON = genericParseJSON optionsCustomLabel1Filter
instance ToJSON CustomLabel1Filter where
  toJSON = genericToJSON optionsCustomLabel1Filter

optionsCustomLabel1Filter :: Options
optionsCustomLabel1Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("customLabel1FilterCUSTOMUnderscoreLABELUnderscore1", "CUSTOM_LABEL_1")
      ]


-- | 
data CustomLabel2Filter = CustomLabel2Filter
  { customLabel2FilterCUSTOMUnderscoreLABELUnderscore2 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomLabel2Filter where
  parseJSON = genericParseJSON optionsCustomLabel2Filter
instance ToJSON CustomLabel2Filter where
  toJSON = genericToJSON optionsCustomLabel2Filter

optionsCustomLabel2Filter :: Options
optionsCustomLabel2Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("customLabel2FilterCUSTOMUnderscoreLABELUnderscore2", "CUSTOM_LABEL_2")
      ]


-- | 
data CustomLabel3Filter = CustomLabel3Filter
  { customLabel3FilterCUSTOMUnderscoreLABELUnderscore3 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomLabel3Filter where
  parseJSON = genericParseJSON optionsCustomLabel3Filter
instance ToJSON CustomLabel3Filter where
  toJSON = genericToJSON optionsCustomLabel3Filter

optionsCustomLabel3Filter :: Options
optionsCustomLabel3Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("customLabel3FilterCUSTOMUnderscoreLABELUnderscore3", "CUSTOM_LABEL_3")
      ]


-- | 
data CustomLabel4Filter = CustomLabel4Filter
  { customLabel4FilterCUSTOMUnderscoreLABELUnderscore4 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomLabel4Filter where
  parseJSON = genericParseJSON optionsCustomLabel4Filter
instance ToJSON CustomLabel4Filter where
  toJSON = genericToJSON optionsCustomLabel4Filter

optionsCustomLabel4Filter :: Options
optionsCustomLabel4Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("customLabel4FilterCUSTOMUnderscoreLABELUnderscore4", "CUSTOM_LABEL_4")
      ]


-- | 
data CustomerList = CustomerList
  { customerListAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Associated ad account ID.
  , customerListCreatedUnderscoretime :: Maybe Double -- ^ Creation time. Unix timestamp in seconds.
  , customerListId :: Maybe Text -- ^ Customer list ID.
  , customerListName :: Maybe Text -- ^ Customer list name.
  , customerListNumUnderscorebatches :: Maybe Double -- ^ Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
  , customerListNumUnderscoreremovedUnderscoreuserUnderscorerecords :: Maybe Double -- ^ Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
  , customerListNumUnderscoreuploadedUnderscoreuserUnderscorerecords :: Maybe Double -- ^ Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
  , customerListStatus :: Maybe Text -- ^ Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
  , customerListType :: Maybe Text -- ^ Always \"customerlist\".
  , customerListUpdatedUnderscoretime :: Maybe Double -- ^ Last update time. Unix timestamp in seconds.
  , customerListExceptions :: Maybe Object -- ^ Customer list errors
  } deriving (Show, Eq, Generic)

instance FromJSON CustomerList where
  parseJSON = genericParseJSON optionsCustomerList
instance ToJSON CustomerList where
  toJSON = genericToJSON optionsCustomerList

optionsCustomerList :: Options
optionsCustomerList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("customerListAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("customerListCreatedUnderscoretime", "created_time")
      , ("customerListId", "id")
      , ("customerListName", "name")
      , ("customerListNumUnderscorebatches", "num_batches")
      , ("customerListNumUnderscoreremovedUnderscoreuserUnderscorerecords", "num_removed_user_records")
      , ("customerListNumUnderscoreuploadedUnderscoreuserUnderscorerecords", "num_uploaded_user_records")
      , ("customerListStatus", "status")
      , ("customerListType", "type")
      , ("customerListUpdatedUnderscoretime", "updated_time")
      , ("customerListExceptions", "exceptions")
      ]


-- | 
data CustomerListRequest = CustomerListRequest
  { customerListRequestName :: Text -- ^ Customer list name.
  , customerListRequestRecords :: Text -- ^ Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  , customerListRequestListUnderscoretype :: Maybe UserListType -- ^ 
  , customerListRequestExceptions :: Maybe Object -- ^ Customer list errors.
  } deriving (Show, Eq, Generic)

instance FromJSON CustomerListRequest where
  parseJSON = genericParseJSON optionsCustomerListRequest
instance ToJSON CustomerListRequest where
  toJSON = genericToJSON optionsCustomerListRequest

optionsCustomerListRequest :: Options
optionsCustomerListRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("customerListRequestName", "name")
      , ("customerListRequestRecords", "records")
      , ("customerListRequestListUnderscoretype", "list_type")
      , ("customerListRequestExceptions", "exceptions")
      ]


-- | 
data CustomerListUpdateRequest = CustomerListUpdateRequest
  { customerListUpdateRequestRecords :: Text -- ^ Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  , customerListUpdateRequestOperationUnderscoretype :: UserListOperationType -- ^ 
  , customerListUpdateRequestExceptions :: Maybe Exception -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomerListUpdateRequest where
  parseJSON = genericParseJSON optionsCustomerListUpdateRequest
instance ToJSON CustomerListUpdateRequest where
  toJSON = genericToJSON optionsCustomerListUpdateRequest

optionsCustomerListUpdateRequest :: Options
optionsCustomerListUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("customerListUpdateRequestRecords", "records")
      , ("customerListUpdateRequestOperationUnderscoretype", "operation_type")
      , ("customerListUpdateRequestExceptions", "exceptions")
      ]


-- | 
data CustomerListsList200Response = CustomerListsList200Response
  { customerListsList200ResponseItems :: [CustomerList] -- ^ 
  , customerListsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomerListsList200Response where
  parseJSON = genericParseJSON optionsCustomerListsList200Response
instance ToJSON CustomerListsList200Response where
  toJSON = genericToJSON optionsCustomerListsList200Response

optionsCustomerListsList200Response :: Options
optionsCustomerListsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("customerListsList200ResponseItems", "items")
      , ("customerListsList200ResponseBookmark", "bookmark")
      ]


-- | Format of generated report
data DataOutputFormat = DataOutputFormat
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON DataOutputFormat where
  parseJSON = genericParseJSON optionsDataOutputFormat
instance ToJSON DataOutputFormat where
  toJSON = genericToJSON optionsDataOutputFormat

optionsDataOutputFormat :: Options
optionsDataOutputFormat =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Metrics availablity, e.g., \&quot;READY\&quot;.
data DataStatus = DataStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON DataStatus where
  parseJSON = genericParseJSON optionsDataStatus
instance ToJSON DataStatus where
  toJSON = genericToJSON optionsDataStatus

optionsDataStatus :: Options
optionsDataStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data DeliveryMetricsResponse = DeliveryMetricsResponse
  { deliveryMetricsResponseItems :: Maybe [DeliveryMetricsResponseItemsInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeliveryMetricsResponse where
  parseJSON = genericParseJSON optionsDeliveryMetricsResponse
instance ToJSON DeliveryMetricsResponse where
  toJSON = genericToJSON optionsDeliveryMetricsResponse

optionsDeliveryMetricsResponse :: Options
optionsDeliveryMetricsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deliveryMetricsResponseItems", "items")
      ]


-- | 
data DeliveryMetricsResponseItemsInner = DeliveryMetricsResponseItemsInner
  { deliveryMetricsResponseItemsInnerName :: Maybe Text -- ^ Metric's name.
  , deliveryMetricsResponseItemsInnerCategory :: Maybe Text -- ^ Category name
  , deliveryMetricsResponseItemsInnerDefinition :: Maybe Text -- ^ How the metric is defined.
  , deliveryMetricsResponseItemsInnerDisplayUnderscorename :: Maybe Text -- ^ Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
  } deriving (Show, Eq, Generic)

instance FromJSON DeliveryMetricsResponseItemsInner where
  parseJSON = genericParseJSON optionsDeliveryMetricsResponseItemsInner
instance ToJSON DeliveryMetricsResponseItemsInner where
  toJSON = genericToJSON optionsDeliveryMetricsResponseItemsInner

optionsDeliveryMetricsResponseItemsInner :: Options
optionsDeliveryMetricsResponseItemsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deliveryMetricsResponseItemsInnerName", "name")
      , ("deliveryMetricsResponseItemsInnerCategory", "category")
      , ("deliveryMetricsResponseItemsInnerDefinition", "definition")
      , ("deliveryMetricsResponseItemsInnerDisplayUnderscorename", "display_name")
      ]


-- | Used for including extra details to a base error
data DetailedError = DetailedError
  { detailedErrorCode :: Int -- ^ 
  , detailedErrorMessage :: Text -- ^ 
  , detailedErrorDetails :: Object -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DetailedError where
  parseJSON = genericParseJSON optionsDetailedError
instance ToJSON DetailedError where
  toJSON = genericToJSON optionsDetailedError

optionsDetailedError :: Options
optionsDetailedError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("detailedErrorCode", "code")
      , ("detailedErrorMessage", "message")
      , ("detailedErrorDetails", "details")
      ]


-- | The enhanced match status of the tag
data EnhancedMatchStatusType = EnhancedMatchStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON EnhancedMatchStatusType where
  parseJSON = genericParseJSON optionsEnhancedMatchStatusType
instance ToJSON EnhancedMatchStatusType where
  toJSON = genericToJSON optionsEnhancedMatchStatusType

optionsEnhancedMatchStatusType :: Options
optionsEnhancedMatchStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Entity status
data EntityStatus = EntityStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON EntityStatus where
  parseJSON = genericParseJSON optionsEntityStatus
instance ToJSON EntityStatus where
  toJSON = genericToJSON optionsEntityStatus

optionsEntityStatus :: Options
optionsEntityStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data Error = Error
  { errorCode :: Int -- ^ 
  , errorMessage :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Error where
  parseJSON = genericParseJSON optionsError
instance ToJSON Error where
  toJSON = genericToJSON optionsError

optionsError :: Options
optionsError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("errorCode", "code")
      , ("errorMessage", "message")
      ]


-- | 
data Exception = Exception
  { exceptionCode :: Maybe Int -- ^ Exception error code.
  , exceptionMessage :: Maybe Text -- ^ Exception message.
  } deriving (Show, Eq, Generic)

instance FromJSON Exception where
  parseJSON = genericParseJSON optionsException
instance ToJSON Exception where
  toJSON = genericToJSON optionsException

optionsException :: Options
optionsException =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("exceptionCode", "code")
      , ("exceptionMessage", "message")
      ]


-- | 
data FeedProcessingResultsList200Response = FeedProcessingResultsList200Response
  { feedProcessingResultsList200ResponseItems :: [CatalogsFeedProcessingResult] -- ^ 
  , feedProcessingResultsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedProcessingResultsList200Response where
  parseJSON = genericParseJSON optionsFeedProcessingResultsList200Response
instance ToJSON FeedProcessingResultsList200Response where
  toJSON = genericToJSON optionsFeedProcessingResultsList200Response

optionsFeedProcessingResultsList200Response :: Options
optionsFeedProcessingResultsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedProcessingResultsList200ResponseItems", "items")
      , ("feedProcessingResultsList200ResponseBookmark", "bookmark")
      ]


-- | 
data FeedsCreateRequest = FeedsCreateRequest
  { feedsCreateRequestDefaultUnderscorecurrency :: Maybe NullableCurrency -- ^ 
  , feedsCreateRequestName :: Text -- ^ A human-friendly name associated to a given feed.
  , feedsCreateRequestFormat :: CatalogsFormat -- ^ 
  , feedsCreateRequestDefaultUnderscorelocale :: CatalogsFeedsCreateRequestDefaultLocale -- ^ 
  , feedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials -- ^ 
  , feedsCreateRequestLocation :: Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , feedsCreateRequestPreferredUnderscoreprocessingUnderscoreschedule :: Maybe CatalogsFeedProcessingSchedule -- ^ 
  , feedsCreateRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  , feedsCreateRequestDefaultUnderscorecountry :: Country -- ^ 
  , feedsCreateRequestDefaultUnderscoreavailability :: Maybe ProductAvailabilityType -- ^ 
  , feedsCreateRequestCatalogUnderscoreid :: Maybe Text -- ^ Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
  } deriving (Show, Eq, Generic)

instance FromJSON FeedsCreateRequest where
  parseJSON = genericParseJSON optionsFeedsCreateRequest
instance ToJSON FeedsCreateRequest where
  toJSON = genericToJSON optionsFeedsCreateRequest

optionsFeedsCreateRequest :: Options
optionsFeedsCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedsCreateRequestDefaultUnderscorecurrency", "default_currency")
      , ("feedsCreateRequestName", "name")
      , ("feedsCreateRequestFormat", "format")
      , ("feedsCreateRequestDefaultUnderscorelocale", "default_locale")
      , ("feedsCreateRequestCredentials", "credentials")
      , ("feedsCreateRequestLocation", "location")
      , ("feedsCreateRequestPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("feedsCreateRequestCatalogUnderscoretype", "catalog_type")
      , ("feedsCreateRequestDefaultUnderscorecountry", "default_country")
      , ("feedsCreateRequestDefaultUnderscoreavailability", "default_availability")
      , ("feedsCreateRequestCatalogUnderscoreid", "catalog_id")
      ]


-- | 
data FeedsList200Response = FeedsList200Response
  { feedsList200ResponseItems :: [CatalogsFeed] -- ^ 
  , feedsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedsList200Response where
  parseJSON = genericParseJSON optionsFeedsList200Response
instance ToJSON FeedsList200Response where
  toJSON = genericToJSON optionsFeedsList200Response

optionsFeedsList200Response :: Options
optionsFeedsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedsList200ResponseItems", "items")
      , ("feedsList200ResponseBookmark", "bookmark")
      ]


-- | 
data FeedsUpdateRequest = FeedsUpdateRequest
  { feedsUpdateRequestDefaultUnderscorecurrency :: Maybe NullableCurrency -- ^ 
  , feedsUpdateRequestName :: Maybe Text -- ^ A human-friendly name associated to a given feed.
  , feedsUpdateRequestFormat :: Maybe CatalogsFormat -- ^ 
  , feedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials -- ^ 
  , feedsUpdateRequestLocation :: Maybe Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , feedsUpdateRequestPreferredUnderscoreprocessingUnderscoreschedule :: Maybe CatalogsFeedProcessingSchedule -- ^ 
  , feedsUpdateRequestStatus :: Maybe CatalogsStatus -- ^ 
  , feedsUpdateRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  , feedsUpdateRequestDefaultUnderscoreavailability :: Maybe ProductAvailabilityType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedsUpdateRequest where
  parseJSON = genericParseJSON optionsFeedsUpdateRequest
instance ToJSON FeedsUpdateRequest where
  toJSON = genericToJSON optionsFeedsUpdateRequest

optionsFeedsUpdateRequest :: Options
optionsFeedsUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedsUpdateRequestDefaultUnderscorecurrency", "default_currency")
      , ("feedsUpdateRequestName", "name")
      , ("feedsUpdateRequestFormat", "format")
      , ("feedsUpdateRequestCredentials", "credentials")
      , ("feedsUpdateRequestLocation", "location")
      , ("feedsUpdateRequestPreferredUnderscoreprocessingUnderscoreschedule", "preferred_processing_schedule")
      , ("feedsUpdateRequestStatus", "status")
      , ("feedsUpdateRequestCatalogUnderscoretype", "catalog_type")
      , ("feedsUpdateRequestDefaultUnderscoreavailability", "default_availability")
      ]


-- | 
data FollowUserRequest = FollowUserRequest
  { followUserRequestAutoUnderscorefollow :: Maybe Bool -- ^ Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
  } deriving (Show, Eq, Generic)

instance FromJSON FollowUserRequest where
  parseJSON = genericParseJSON optionsFollowUserRequest
instance ToJSON FollowUserRequest where
  toJSON = genericToJSON optionsFollowUserRequest

optionsFollowUserRequest :: Options
optionsFollowUserRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("followUserRequestAutoUnderscorefollow", "auto_follow")
      ]


-- | 
data FollowersList200Response = FollowersList200Response
  { followersList200ResponseItems :: [UserSummary] -- ^ 
  , followersList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FollowersList200Response where
  parseJSON = genericParseJSON optionsFollowersList200Response
instance ToJSON FollowersList200Response where
  toJSON = genericToJSON optionsFollowersList200Response

optionsFollowersList200Response :: Options
optionsFollowersList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("followersList200ResponseItems", "items")
      , ("followersList200ResponseBookmark", "bookmark")
      ]


-- | 
data Gender = Gender
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON Gender where
  parseJSON = genericParseJSON optionsGender
instance ToJSON Gender where
  toJSON = genericToJSON optionsGender

optionsGender :: Options
optionsGender =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data GenderFilter = GenderFilter
  { genderFilterGENDER :: CatalogsProductGroupMultipleGenderCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GenderFilter where
  parseJSON = genericParseJSON optionsGenderFilter
instance ToJSON GenderFilter where
  toJSON = genericToJSON optionsGenderFilter

optionsGenderFilter :: Options
optionsGenderFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("genderFilterGENDER", "GENDER")
      ]


-- | 
data GetAudiencesOrderBy = GetAudiencesOrderBy
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON GetAudiencesOrderBy where
  parseJSON = genericParseJSON optionsGetAudiencesOrderBy
instance ToJSON GetAudiencesOrderBy where
  toJSON = genericToJSON optionsGetAudiencesOrderBy

optionsGetAudiencesOrderBy :: Options
optionsGetAudiencesOrderBy =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data GetMMMReportResponse = GetMMMReportResponse
  { getMMMReportResponseCode :: Maybe Double -- ^ 
  , getMMMReportResponseData :: Maybe GetMMMReportResponseData -- ^ 
  , getMMMReportResponseMessage :: Maybe Text -- ^ 
  , getMMMReportResponseStatus :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetMMMReportResponse where
  parseJSON = genericParseJSON optionsGetMMMReportResponse
instance ToJSON GetMMMReportResponse where
  toJSON = genericToJSON optionsGetMMMReportResponse

optionsGetMMMReportResponse :: Options
optionsGetMMMReportResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getMMMReportResponseCode", "code")
      , ("getMMMReportResponseData", "data")
      , ("getMMMReportResponseMessage", "message")
      , ("getMMMReportResponseStatus", "status")
      ]


-- | 
data GetMMMReportResponseData = GetMMMReportResponseData
  { getMMMReportResponseDataReportUnderscorestatus :: Maybe Text -- ^ 
  , getMMMReportResponseDataUrl :: Maybe Text -- ^ 
  , getMMMReportResponseDataSize :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetMMMReportResponseData where
  parseJSON = genericParseJSON optionsGetMMMReportResponseData
instance ToJSON GetMMMReportResponseData where
  toJSON = genericToJSON optionsGetMMMReportResponseData

optionsGetMMMReportResponseData :: Options
optionsGetMMMReportResponseData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getMMMReportResponseDataReportUnderscorestatus", "report_status")
      , ("getMMMReportResponseDataUrl", "url")
      , ("getMMMReportResponseDataSize", "size")
      ]


-- | 
data GoogleProductCategory0Filter = GoogleProductCategory0Filter
  { googleProductCategory0FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore0 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory0Filter where
  parseJSON = genericParseJSON optionsGoogleProductCategory0Filter
instance ToJSON GoogleProductCategory0Filter where
  toJSON = genericToJSON optionsGoogleProductCategory0Filter

optionsGoogleProductCategory0Filter :: Options
optionsGoogleProductCategory0Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("googleProductCategory0FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore0", "GOOGLE_PRODUCT_CATEGORY_0")
      ]


-- | 
data GoogleProductCategory1Filter = GoogleProductCategory1Filter
  { googleProductCategory1FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore1 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory1Filter where
  parseJSON = genericParseJSON optionsGoogleProductCategory1Filter
instance ToJSON GoogleProductCategory1Filter where
  toJSON = genericToJSON optionsGoogleProductCategory1Filter

optionsGoogleProductCategory1Filter :: Options
optionsGoogleProductCategory1Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("googleProductCategory1FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore1", "GOOGLE_PRODUCT_CATEGORY_1")
      ]


-- | 
data GoogleProductCategory2Filter = GoogleProductCategory2Filter
  { googleProductCategory2FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore2 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory2Filter where
  parseJSON = genericParseJSON optionsGoogleProductCategory2Filter
instance ToJSON GoogleProductCategory2Filter where
  toJSON = genericToJSON optionsGoogleProductCategory2Filter

optionsGoogleProductCategory2Filter :: Options
optionsGoogleProductCategory2Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("googleProductCategory2FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore2", "GOOGLE_PRODUCT_CATEGORY_2")
      ]


-- | 
data GoogleProductCategory3Filter = GoogleProductCategory3Filter
  { googleProductCategory3FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore3 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory3Filter where
  parseJSON = genericParseJSON optionsGoogleProductCategory3Filter
instance ToJSON GoogleProductCategory3Filter where
  toJSON = genericToJSON optionsGoogleProductCategory3Filter

optionsGoogleProductCategory3Filter :: Options
optionsGoogleProductCategory3Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("googleProductCategory3FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore3", "GOOGLE_PRODUCT_CATEGORY_3")
      ]


-- | 
data GoogleProductCategory4Filter = GoogleProductCategory4Filter
  { googleProductCategory4FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore4 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory4Filter where
  parseJSON = genericParseJSON optionsGoogleProductCategory4Filter
instance ToJSON GoogleProductCategory4Filter where
  toJSON = genericToJSON optionsGoogleProductCategory4Filter

optionsGoogleProductCategory4Filter :: Options
optionsGoogleProductCategory4Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("googleProductCategory4FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore4", "GOOGLE_PRODUCT_CATEGORY_4")
      ]


-- | 
data GoogleProductCategory5Filter = GoogleProductCategory5Filter
  { googleProductCategory5FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore5 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory5Filter where
  parseJSON = genericParseJSON optionsGoogleProductCategory5Filter
instance ToJSON GoogleProductCategory5Filter where
  toJSON = genericToJSON optionsGoogleProductCategory5Filter

optionsGoogleProductCategory5Filter :: Options
optionsGoogleProductCategory5Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("googleProductCategory5FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore5", "GOOGLE_PRODUCT_CATEGORY_5")
      ]


-- | 
data GoogleProductCategory6Filter = GoogleProductCategory6Filter
  { googleProductCategory6FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore6 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory6Filter where
  parseJSON = genericParseJSON optionsGoogleProductCategory6Filter
instance ToJSON GoogleProductCategory6Filter where
  toJSON = genericToJSON optionsGoogleProductCategory6Filter

optionsGoogleProductCategory6Filter :: Options
optionsGoogleProductCategory6Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("googleProductCategory6FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore6", "GOOGLE_PRODUCT_CATEGORY_6")
      ]


-- | Granularity
data Granularity = Granularity
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON Granularity where
  parseJSON = genericParseJSON optionsGranularity
instance ToJSON Granularity where
  toJSON = genericToJSON optionsGranularity

optionsGranularity :: Options
optionsGranularity =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Where a user is taken after clicking on an ad in grid.
data GridClickType = GridClickType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON GridClickType where
  parseJSON = genericParseJSON optionsGridClickType
instance ToJSON GridClickType where
  toJSON = genericToJSON optionsGridClickType

optionsGridClickType :: Options
optionsGridClickType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data HotelIdFilter = HotelIdFilter
  { hotelIdFilterHOTELUnderscoreID :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON HotelIdFilter where
  parseJSON = genericParseJSON optionsHotelIdFilter
instance ToJSON HotelIdFilter where
  toJSON = genericToJSON optionsHotelIdFilter

optionsHotelIdFilter :: Options
optionsHotelIdFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("hotelIdFilterHOTELUnderscoreID", "HOTEL_ID")
      ]


-- | Object describing an item processing record
data HotelProcessingRecord = HotelProcessingRecord
  { hotelProcessingRecordHotelUnderscoreid :: Maybe Text -- ^ The catalog hotel id in the merchant namespace
  , hotelProcessingRecordErrors :: Maybe [ItemValidationEvent] -- ^ Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  , hotelProcessingRecordWarnings :: Maybe [ItemValidationEvent] -- ^ Array with the validation warnings for the item processing record
  , hotelProcessingRecordStatus :: Maybe ItemProcessingStatus -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON HotelProcessingRecord where
  parseJSON = genericParseJSON optionsHotelProcessingRecord
instance ToJSON HotelProcessingRecord where
  toJSON = genericToJSON optionsHotelProcessingRecord

optionsHotelProcessingRecord :: Options
optionsHotelProcessingRecord =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("hotelProcessingRecordHotelUnderscoreid", "hotel_id")
      , ("hotelProcessingRecordErrors", "errors")
      , ("hotelProcessingRecordWarnings", "warnings")
      , ("hotelProcessingRecordStatus", "status")
      ]


-- | 
data ImageDetails = ImageDetails
  { imageDetailsWidth :: Int -- ^ 
  , imageDetailsHeight :: Int -- ^ 
  , imageDetailsUrl :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ImageDetails where
  parseJSON = genericParseJSON optionsImageDetails
instance ToJSON ImageDetails where
  toJSON = genericToJSON optionsImageDetails

optionsImageDetails :: Options
optionsImageDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("imageDetailsWidth", "width")
      , ("imageDetailsHeight", "height")
      , ("imageDetailsUrl", "url")
      ]


-- | 
data ImageMetadata = ImageMetadata
  { imageMetadataItemUnderscoretype :: Maybe Text -- ^ 
  , imageMetadataTitle :: Maybe Text -- ^ 
  , imageMetadataDescription :: Maybe Text -- ^ 
  , imageMetadataLink :: Maybe Text -- ^ 
  , imageMetadataImages :: Maybe ImageMetadataImages -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ImageMetadata where
  parseJSON = genericParseJSON optionsImageMetadata
instance ToJSON ImageMetadata where
  toJSON = genericToJSON optionsImageMetadata

optionsImageMetadata :: Options
optionsImageMetadata =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("imageMetadataItemUnderscoretype", "item_type")
      , ("imageMetadataTitle", "title")
      , ("imageMetadataDescription", "description")
      , ("imageMetadataLink", "link")
      , ("imageMetadataImages", "images")
      ]


-- | 
data ImageMetadataImages = ImageMetadataImages
  { imageMetadataImages150x150 :: Maybe ImageDetails -- ^ 
  , imageMetadataImages400x300 :: Maybe ImageDetails -- ^ 
  , imageMetadataImages600x :: Maybe ImageDetails -- ^ 
  , imageMetadataImages1200x :: Maybe ImageDetails -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ImageMetadataImages where
  parseJSON = genericParseJSON optionsImageMetadataImages
instance ToJSON ImageMetadataImages where
  toJSON = genericToJSON optionsImageMetadataImages

optionsImageMetadataImages :: Options
optionsImageMetadataImages =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("imageMetadataImages150x150", "150x150")
      , ("imageMetadataImages400x300", "400x300")
      , ("imageMetadataImages600x", "600x")
      , ("imageMetadataImages1200x", "1200x")
      ]


-- | Schema for log sent from an integration application.
data IntegrationLog = IntegrationLog
  { integrationLogClientUnderscoretimestamp :: Int -- ^ Timestamp in milliseconds of when the log was executed at the client.
  , integrationLogEventUnderscoretype :: Text -- ^ Log event type
  , integrationLogLogUnderscorelevel :: Text -- ^ Log level type
  , integrationLogExternalUnderscorebusinessUnderscoreid :: Maybe Text -- ^ 
  , integrationLogAdvertiserUnderscoreid :: Maybe Text -- ^ 
  , integrationLogMerchantUnderscoreid :: Maybe Text -- ^ 
  , integrationLogTagUnderscoreid :: Maybe Text -- ^ 
  , integrationLogFeedUnderscoreprofileUnderscoreid :: Maybe Text -- ^ 
  , integrationLogMessage :: Maybe Text -- ^ Explanation of the event that occured.
  , integrationLogAppUnderscoreversionUnderscorenumber :: Maybe Text -- ^ Version number of the integration application.
  , integrationLogPlatformUnderscoreversionUnderscorenumber :: Maybe Text -- ^ Version number of the platform the integration application is running on.
  , integrationLogError :: Maybe IntegrationLogClientError -- ^ 
  , integrationLogRequest :: Maybe IntegrationLogClientRequest -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationLog where
  parseJSON = genericParseJSON optionsIntegrationLog
instance ToJSON IntegrationLog where
  toJSON = genericToJSON optionsIntegrationLog

optionsIntegrationLog :: Options
optionsIntegrationLog =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationLogClientUnderscoretimestamp", "client_timestamp")
      , ("integrationLogEventUnderscoretype", "event_type")
      , ("integrationLogLogUnderscorelevel", "log_level")
      , ("integrationLogExternalUnderscorebusinessUnderscoreid", "external_business_id")
      , ("integrationLogAdvertiserUnderscoreid", "advertiser_id")
      , ("integrationLogMerchantUnderscoreid", "merchant_id")
      , ("integrationLogTagUnderscoreid", "tag_id")
      , ("integrationLogFeedUnderscoreprofileUnderscoreid", "feed_profile_id")
      , ("integrationLogMessage", "message")
      , ("integrationLogAppUnderscoreversionUnderscorenumber", "app_version_number")
      , ("integrationLogPlatformUnderscoreversionUnderscorenumber", "platform_version_number")
      , ("integrationLogError", "error")
      , ("integrationLogRequest", "request")
      ]


-- | System error details included in the log sent by the client.
data IntegrationLogClientError = IntegrationLogClientError
  { integrationLogClientErrorCause :: Maybe Text -- ^ Original cause of the error.
  , integrationLogClientErrorColumnUnderscorenumber :: Maybe Int -- ^ Column number in the line of the file that raised the error.
  , integrationLogClientErrorFileUnderscorename :: Maybe Text -- ^ Filename where the error happened.
  , integrationLogClientErrorLineUnderscorenumber :: Maybe Int -- ^ Line number where the error happened.
  , integrationLogClientErrorMessage :: Maybe Text -- ^ Human-readable description of the error.
  , integrationLogClientErrorMessageUnderscoredetail :: Maybe Text -- ^ More detail about the message.
  , integrationLogClientErrorName :: Maybe Text -- ^ Filename where the error happened.
  , integrationLogClientErrorNumber :: Maybe Int -- ^ Integer that specifies the error code.
  , integrationLogClientErrorStackUnderscoretrace :: Maybe Text -- ^ Stack trace of where the error happened.
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationLogClientError where
  parseJSON = genericParseJSON optionsIntegrationLogClientError
instance ToJSON IntegrationLogClientError where
  toJSON = genericToJSON optionsIntegrationLogClientError

optionsIntegrationLogClientError :: Options
optionsIntegrationLogClientError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationLogClientErrorCause", "cause")
      , ("integrationLogClientErrorColumnUnderscorenumber", "column_number")
      , ("integrationLogClientErrorFileUnderscorename", "file_name")
      , ("integrationLogClientErrorLineUnderscorenumber", "line_number")
      , ("integrationLogClientErrorMessage", "message")
      , ("integrationLogClientErrorMessageUnderscoredetail", "message_detail")
      , ("integrationLogClientErrorName", "name")
      , ("integrationLogClientErrorNumber", "number")
      , ("integrationLogClientErrorStackUnderscoretrace", "stack_trace")
      ]


-- | HTTP request details included in the log sent by the client.
data IntegrationLogClientRequest = IntegrationLogClientRequest
  { integrationLogClientRequestMethod :: Text -- ^ 
  , integrationLogClientRequestHost :: Text -- ^ HTTP request host from host header.
  , integrationLogClientRequestPath :: Text -- ^ HTTP request path.
  , integrationLogClientRequestRequestUnderscoreheaders :: Maybe (Map.Map String Text) -- ^ HTTP request headers as key-value pairs.
  , integrationLogClientRequestResponseUnderscoreheaders :: Maybe (Map.Map String Text) -- ^ HTTP response headers as key-value pairs.
  , integrationLogClientRequestResponseUnderscorestatusUnderscorecode :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationLogClientRequest where
  parseJSON = genericParseJSON optionsIntegrationLogClientRequest
instance ToJSON IntegrationLogClientRequest where
  toJSON = genericToJSON optionsIntegrationLogClientRequest

optionsIntegrationLogClientRequest :: Options
optionsIntegrationLogClientRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationLogClientRequestMethod", "method")
      , ("integrationLogClientRequestHost", "host")
      , ("integrationLogClientRequestPath", "path")
      , ("integrationLogClientRequestRequestUnderscoreheaders", "request_headers")
      , ("integrationLogClientRequestResponseUnderscoreheaders", "response_headers")
      , ("integrationLogClientRequestResponseUnderscorestatusUnderscorecode", "response_status_code")
      ]


-- | Schema describing the response when a log has invalid fields.
data IntegrationLogsInvalidLogResponse = IntegrationLogsInvalidLogResponse
  { integrationLogsInvalidLogResponseRejectedUnderscorelogs :: Maybe [IntegrationLogsInvalidLogResponseRejectedLogsInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationLogsInvalidLogResponse where
  parseJSON = genericParseJSON optionsIntegrationLogsInvalidLogResponse
instance ToJSON IntegrationLogsInvalidLogResponse where
  toJSON = genericToJSON optionsIntegrationLogsInvalidLogResponse

optionsIntegrationLogsInvalidLogResponse :: Options
optionsIntegrationLogsInvalidLogResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationLogsInvalidLogResponseRejectedUnderscorelogs", "rejected_logs")
      ]


-- | 
data IntegrationLogsInvalidLogResponseRejectedLogsInner = IntegrationLogsInvalidLogResponseRejectedLogsInner
  { integrationLogsInvalidLogResponseRejectedLogsInnerLogUnderscoreindex :: Maybe Int -- ^ Index of the log in the batch.
  , integrationLogsInvalidLogResponseRejectedLogsInnerField :: Text -- ^ The field name containing an invalid value.
  , integrationLogsInvalidLogResponseRejectedLogsInnerValue :: Text -- ^ The value that is invalid.
  , integrationLogsInvalidLogResponseRejectedLogsInnerReason :: Text -- ^ The reason the value is invalid.
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationLogsInvalidLogResponseRejectedLogsInner where
  parseJSON = genericParseJSON optionsIntegrationLogsInvalidLogResponseRejectedLogsInner
instance ToJSON IntegrationLogsInvalidLogResponseRejectedLogsInner where
  toJSON = genericToJSON optionsIntegrationLogsInvalidLogResponseRejectedLogsInner

optionsIntegrationLogsInvalidLogResponseRejectedLogsInner :: Options
optionsIntegrationLogsInvalidLogResponseRejectedLogsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationLogsInvalidLogResponseRejectedLogsInnerLogUnderscoreindex", "log_index")
      , ("integrationLogsInvalidLogResponseRejectedLogsInnerField", "field")
      , ("integrationLogsInvalidLogResponseRejectedLogsInnerValue", "value")
      , ("integrationLogsInvalidLogResponseRejectedLogsInnerReason", "reason")
      ]


-- | Batch of logs sent from an integration application.
data IntegrationLogsRequest = IntegrationLogsRequest
  { integrationLogsRequestLogs :: [IntegrationLog] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationLogsRequest where
  parseJSON = genericParseJSON optionsIntegrationLogsRequest
instance ToJSON IntegrationLogsRequest where
  toJSON = genericToJSON optionsIntegrationLogsRequest

optionsIntegrationLogsRequest :: Options
optionsIntegrationLogsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationLogsRequestLogs", "logs")
      ]


-- | Response when logs are successfully processed.
data IntegrationLogsSuccessResponse = IntegrationLogsSuccessResponse
  { integrationLogsSuccessResponseMessage :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationLogsSuccessResponse where
  parseJSON = genericParseJSON optionsIntegrationLogsSuccessResponse
instance ToJSON IntegrationLogsSuccessResponse where
  toJSON = genericToJSON optionsIntegrationLogsSuccessResponse

optionsIntegrationLogsSuccessResponse :: Options
optionsIntegrationLogsSuccessResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationLogsSuccessResponseMessage", "message")
      ]


-- | Integration metadata
data IntegrationMetadata = IntegrationMetadata
  { integrationMetadataId :: Maybe Text -- ^ 
  , integrationMetadataExternalUnderscorebusinessUnderscoreid :: Maybe Text -- ^ 
  , integrationMetadataConnectedUnderscoremerchantUnderscoreid :: Maybe Text -- ^ 
  , integrationMetadataConnectedUnderscoreuserUnderscoreid :: Maybe Text -- ^ 
  , integrationMetadataConnectedUnderscoreadvertiserUnderscoreid :: Maybe Text -- ^ 
  , integrationMetadataConnectedUnderscorelbaUnderscoreid :: Maybe Text -- ^ 
  , integrationMetadataConnectedUnderscoretagUnderscoreid :: Maybe Text -- ^ 
  , integrationMetadataPartnerUnderscoreaccessUnderscoretokenUnderscoreexpiry :: Maybe Double -- ^ 
  , integrationMetadataPartnerUnderscorerefreshUnderscoretokenUnderscoreexpiry :: Maybe Double -- ^ 
  , integrationMetadataScopes :: Maybe Text -- ^ 
  , integrationMetadataCreatedUnderscoretimestamp :: Maybe Double -- ^ 
  , integrationMetadataUpdatedUnderscoretimestamp :: Maybe Double -- ^ 
  , integrationMetadataAdditionalUnderscoreidUnderscore1 :: Maybe Text -- ^ 
  , integrationMetadataPartnerUnderscoremetadata :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationMetadata where
  parseJSON = genericParseJSON optionsIntegrationMetadata
instance ToJSON IntegrationMetadata where
  toJSON = genericToJSON optionsIntegrationMetadata

optionsIntegrationMetadata :: Options
optionsIntegrationMetadata =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationMetadataId", "id")
      , ("integrationMetadataExternalUnderscorebusinessUnderscoreid", "external_business_id")
      , ("integrationMetadataConnectedUnderscoremerchantUnderscoreid", "connected_merchant_id")
      , ("integrationMetadataConnectedUnderscoreuserUnderscoreid", "connected_user_id")
      , ("integrationMetadataConnectedUnderscoreadvertiserUnderscoreid", "connected_advertiser_id")
      , ("integrationMetadataConnectedUnderscorelbaUnderscoreid", "connected_lba_id")
      , ("integrationMetadataConnectedUnderscoretagUnderscoreid", "connected_tag_id")
      , ("integrationMetadataPartnerUnderscoreaccessUnderscoretokenUnderscoreexpiry", "partner_access_token_expiry")
      , ("integrationMetadataPartnerUnderscorerefreshUnderscoretokenUnderscoreexpiry", "partner_refresh_token_expiry")
      , ("integrationMetadataScopes", "scopes")
      , ("integrationMetadataCreatedUnderscoretimestamp", "created_timestamp")
      , ("integrationMetadataUpdatedUnderscoretimestamp", "updated_timestamp")
      , ("integrationMetadataAdditionalUnderscoreidUnderscore1", "additional_id_1")
      , ("integrationMetadataPartnerUnderscoremetadata", "partner_metadata")
      ]


-- | Integration record
data IntegrationRecord = IntegrationRecord
  { integrationRecordId :: Maybe Text -- ^ 
  , integrationRecordExternalUnderscorebusinessUnderscoreid :: Maybe Text -- ^ 
  , integrationRecordConnectedUnderscoremerchantUnderscoreid :: Maybe Text -- ^ 
  , integrationRecordConnectedUnderscoreuserUnderscoreid :: Maybe Text -- ^ 
  , integrationRecordConnectedUnderscoreadvertiserUnderscoreid :: Maybe Text -- ^ 
  , integrationRecordConnectedUnderscorelbaUnderscoreid :: Maybe Text -- ^ 
  , integrationRecordConnectedUnderscoretagUnderscoreid :: Maybe Text -- ^ 
  , integrationRecordPartnerUnderscoreaccessUnderscoretoken :: Maybe Text -- ^ 
  , integrationRecordPartnerUnderscorerefreshUnderscoretoken :: Maybe Text -- ^ 
  , integrationRecordPartnerUnderscoreprimaryUnderscoreemail :: Maybe Text -- ^ 
  , integrationRecordPartnerUnderscoreaccessUnderscoretokenUnderscoreexpiry :: Maybe Int -- ^ 
  , integrationRecordPartnerUnderscorerefreshUnderscoretokenUnderscoreexpiry :: Maybe Int -- ^ 
  , integrationRecordScopes :: Maybe Text -- ^ 
  , integrationRecordPartnerUnderscoremetadata :: Maybe Text -- ^ 
  , integrationRecordAdditionalUnderscoreidUnderscore1 :: Maybe Text -- ^ 
  , integrationRecordCreatedUnderscoretime :: Maybe Int -- ^ 
  , integrationRecordUpdatedUnderscoretime :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationRecord where
  parseJSON = genericParseJSON optionsIntegrationRecord
instance ToJSON IntegrationRecord where
  toJSON = genericToJSON optionsIntegrationRecord

optionsIntegrationRecord :: Options
optionsIntegrationRecord =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationRecordId", "id")
      , ("integrationRecordExternalUnderscorebusinessUnderscoreid", "external_business_id")
      , ("integrationRecordConnectedUnderscoremerchantUnderscoreid", "connected_merchant_id")
      , ("integrationRecordConnectedUnderscoreuserUnderscoreid", "connected_user_id")
      , ("integrationRecordConnectedUnderscoreadvertiserUnderscoreid", "connected_advertiser_id")
      , ("integrationRecordConnectedUnderscorelbaUnderscoreid", "connected_lba_id")
      , ("integrationRecordConnectedUnderscoretagUnderscoreid", "connected_tag_id")
      , ("integrationRecordPartnerUnderscoreaccessUnderscoretoken", "partner_access_token")
      , ("integrationRecordPartnerUnderscorerefreshUnderscoretoken", "partner_refresh_token")
      , ("integrationRecordPartnerUnderscoreprimaryUnderscoreemail", "partner_primary_email")
      , ("integrationRecordPartnerUnderscoreaccessUnderscoretokenUnderscoreexpiry", "partner_access_token_expiry")
      , ("integrationRecordPartnerUnderscorerefreshUnderscoretokenUnderscoreexpiry", "partner_refresh_token_expiry")
      , ("integrationRecordScopes", "scopes")
      , ("integrationRecordPartnerUnderscoremetadata", "partner_metadata")
      , ("integrationRecordAdditionalUnderscoreidUnderscore1", "additional_id_1")
      , ("integrationRecordCreatedUnderscoretime", "created_time")
      , ("integrationRecordUpdatedUnderscoretime", "updated_time")
      ]


-- | Schema used for creating the integration metadata.
data IntegrationRequest = IntegrationRequest
  { integrationRequestExternalUnderscorebusinessUnderscoreid :: Maybe Text -- ^ External business ID for the integration.
  , integrationRequestConnectedUnderscoremerchantUnderscoreid :: Maybe Text -- ^ 
  , integrationRequestConnectedUnderscoreadvertiserUnderscoreid :: Maybe Text -- ^ 
  , integrationRequestConnectedUnderscorelbaUnderscoreid :: Maybe Text -- ^ 
  , integrationRequestConnectedUnderscoretagUnderscoreid :: Maybe Text -- ^ 
  , integrationRequestPartnerUnderscoreaccessUnderscoretoken :: Maybe Text -- ^ 
  , integrationRequestPartnerUnderscorerefreshUnderscoretoken :: Maybe Text -- ^ 
  , integrationRequestPartnerUnderscoreprimaryUnderscoreemail :: Maybe Text -- ^ 
  , integrationRequestPartnerUnderscoreaccessUnderscoretokenUnderscoreexpiry :: Maybe Int -- ^ 
  , integrationRequestPartnerUnderscorerefreshUnderscoretokenUnderscoreexpiry :: Maybe Int -- ^ 
  , integrationRequestScopes :: Maybe Text -- ^ 
  , integrationRequestAdditionalUnderscoreidUnderscore1 :: Maybe Text -- ^ 
  , integrationRequestPartnerUnderscoremetadata :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationRequest where
  parseJSON = genericParseJSON optionsIntegrationRequest
instance ToJSON IntegrationRequest where
  toJSON = genericToJSON optionsIntegrationRequest

optionsIntegrationRequest :: Options
optionsIntegrationRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationRequestExternalUnderscorebusinessUnderscoreid", "external_business_id")
      , ("integrationRequestConnectedUnderscoremerchantUnderscoreid", "connected_merchant_id")
      , ("integrationRequestConnectedUnderscoreadvertiserUnderscoreid", "connected_advertiser_id")
      , ("integrationRequestConnectedUnderscorelbaUnderscoreid", "connected_lba_id")
      , ("integrationRequestConnectedUnderscoretagUnderscoreid", "connected_tag_id")
      , ("integrationRequestPartnerUnderscoreaccessUnderscoretoken", "partner_access_token")
      , ("integrationRequestPartnerUnderscorerefreshUnderscoretoken", "partner_refresh_token")
      , ("integrationRequestPartnerUnderscoreprimaryUnderscoreemail", "partner_primary_email")
      , ("integrationRequestPartnerUnderscoreaccessUnderscoretokenUnderscoreexpiry", "partner_access_token_expiry")
      , ("integrationRequestPartnerUnderscorerefreshUnderscoretokenUnderscoreexpiry", "partner_refresh_token_expiry")
      , ("integrationRequestScopes", "scopes")
      , ("integrationRequestAdditionalUnderscoreidUnderscore1", "additional_id_1")
      , ("integrationRequestPartnerUnderscoremetadata", "partner_metadata")
      ]


-- | Schema used for updating the integration metadata.
data IntegrationRequestPatch = IntegrationRequestPatch
  { integrationRequestPatchConnectedUnderscoremerchantUnderscoreid :: Maybe Text -- ^ 
  , integrationRequestPatchConnectedUnderscoreadvertiserUnderscoreid :: Maybe Text -- ^ 
  , integrationRequestPatchConnectedUnderscorelbaUnderscoreid :: Maybe Text -- ^ 
  , integrationRequestPatchConnectedUnderscoretagUnderscoreid :: Maybe Text -- ^ 
  , integrationRequestPatchPartnerUnderscoreaccessUnderscoretoken :: Maybe Text -- ^ 
  , integrationRequestPatchPartnerUnderscorerefreshUnderscoretoken :: Maybe Text -- ^ 
  , integrationRequestPatchPartnerUnderscoreprimaryUnderscoreemail :: Maybe Text -- ^ 
  , integrationRequestPatchPartnerUnderscoreaccessUnderscoretokenUnderscoreexpiry :: Maybe Double -- ^ 
  , integrationRequestPatchPartnerUnderscorerefreshUnderscoretokenUnderscoreexpiry :: Maybe Double -- ^ 
  , integrationRequestPatchScopes :: Maybe Text -- ^ 
  , integrationRequestPatchAdditionalUnderscoreidUnderscore1 :: Maybe Text -- ^ 
  , integrationRequestPatchPartnerUnderscoremetadata :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationRequestPatch where
  parseJSON = genericParseJSON optionsIntegrationRequestPatch
instance ToJSON IntegrationRequestPatch where
  toJSON = genericToJSON optionsIntegrationRequestPatch

optionsIntegrationRequestPatch :: Options
optionsIntegrationRequestPatch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationRequestPatchConnectedUnderscoremerchantUnderscoreid", "connected_merchant_id")
      , ("integrationRequestPatchConnectedUnderscoreadvertiserUnderscoreid", "connected_advertiser_id")
      , ("integrationRequestPatchConnectedUnderscorelbaUnderscoreid", "connected_lba_id")
      , ("integrationRequestPatchConnectedUnderscoretagUnderscoreid", "connected_tag_id")
      , ("integrationRequestPatchPartnerUnderscoreaccessUnderscoretoken", "partner_access_token")
      , ("integrationRequestPatchPartnerUnderscorerefreshUnderscoretoken", "partner_refresh_token")
      , ("integrationRequestPatchPartnerUnderscoreprimaryUnderscoreemail", "partner_primary_email")
      , ("integrationRequestPatchPartnerUnderscoreaccessUnderscoretokenUnderscoreexpiry", "partner_access_token_expiry")
      , ("integrationRequestPatchPartnerUnderscorerefreshUnderscoretokenUnderscoreexpiry", "partner_refresh_token_expiry")
      , ("integrationRequestPatchScopes", "scopes")
      , ("integrationRequestPatchAdditionalUnderscoreidUnderscore1", "additional_id_1")
      , ("integrationRequestPatchPartnerUnderscoremetadata", "partner_metadata")
      ]


-- | 
data IntegrationsGetList200Response = IntegrationsGetList200Response
  { integrationsGetList200ResponseItems :: [IntegrationRecord] -- ^ 
  , integrationsGetList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON IntegrationsGetList200Response where
  parseJSON = genericParseJSON optionsIntegrationsGetList200Response
instance ToJSON IntegrationsGetList200Response where
  toJSON = genericToJSON optionsIntegrationsGetList200Response

optionsIntegrationsGetList200Response :: Options
optionsIntegrationsGetList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("integrationsGetList200ResponseItems", "items")
      , ("integrationsGetList200ResponseBookmark", "bookmark")
      ]


-- | 
data Interest = Interest
  { interestCanonicalUnderscoreurl :: Maybe Text -- ^ 
  , interestId :: Maybe Text -- ^ 
  , interestKey :: Maybe Text -- ^ 
  , interestName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Interest where
  parseJSON = genericParseJSON optionsInterest
instance ToJSON Interest where
  toJSON = genericToJSON optionsInterest

optionsInterest :: Options
optionsInterest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("interestCanonicalUnderscoreurl", "canonical_url")
      , ("interestId", "id")
      , ("interestKey", "key")
      , ("interestName", "name")
      ]


-- | 
data ItemAttributes = ItemAttributes
  { itemAttributesAdUnderscorelink :: Maybe Text -- ^ Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
  , itemAttributesAdult :: Maybe Bool -- ^ Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
  , itemAttributesAgeUnderscoregroup :: Maybe Text -- ^ The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
  , itemAttributesAvailability :: Maybe Text -- ^ The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
  , itemAttributesAverageUnderscorereviewUnderscorerating :: Maybe Double -- ^ Average reviews for the item. Can be a number from 1-5.
  , itemAttributesBrand :: Maybe Text -- ^ The brand of the product.
  , itemAttributesCheckoutUnderscoreenabled :: Maybe Bool -- ^ This attribute is not supported anymore.
  , itemAttributesColor :: Maybe Text -- ^ The primary color of the product.
  , itemAttributesCondition :: Maybe Text -- ^ The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
  , itemAttributesCustomUnderscorelabelUnderscore0 :: Maybe Text -- ^ <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  , itemAttributesCustomUnderscorelabelUnderscore1 :: Maybe Text -- ^ <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  , itemAttributesCustomUnderscorelabelUnderscore2 :: Maybe Text -- ^ <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  , itemAttributesCustomUnderscorelabelUnderscore3 :: Maybe Text -- ^ <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  , itemAttributesCustomUnderscorelabelUnderscore4 :: Maybe Text -- ^ <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  , itemAttributesDescription :: Maybe Text -- ^ <p><= 10000 characters</p> <p>The description of the product.</p>
  , itemAttributesFreeUnderscoreshippingUnderscorelabel :: Maybe Bool -- ^ The item is free to ship.
  , itemAttributesFreeUnderscoreshippingUnderscorelimit :: Maybe Text -- ^ The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
  , itemAttributesGender :: Maybe Text -- ^ The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
  , itemAttributesGoogleUnderscoreproductUnderscorecategory :: Maybe Text -- ^ The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  , itemAttributesGtin :: Maybe Int -- ^ The unique universal product identifier.
  , itemAttributesId :: Maybe Text -- ^ <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
  , itemAttributesItemUnderscoregroupUnderscoreid :: Maybe Text -- ^ <p><= 127 characters</p> <p>The parent ID of the product.</p>
  , itemAttributesLastUnderscoreupdatedUnderscoretime :: Maybe Int64 -- ^ The millisecond timestamp when the item was lastly modified by the merchant.
  , itemAttributesLink :: Maybe Text -- ^ <p><= 511 characters</p> <p>The landing page for the product.</p>
  , itemAttributesMaterial :: Maybe Text -- ^ The material used to make the product.
  , itemAttributesMinUnderscoreadUnderscoreprice :: Maybe Text -- ^ The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
  , itemAttributesMobileUnderscorelink :: Maybe Text -- ^ The mobile-optimized version of your landing page. Must begin with http:// or https://.
  , itemAttributesMpn :: Maybe Text -- ^ Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
  , itemAttributesNumberUnderscoreofUnderscoreratings :: Maybe Int -- ^ The number of ratings for the item.
  , itemAttributesNumberUnderscoreofUnderscorereviews :: Maybe Int -- ^ The number of reviews available for the item.
  , itemAttributesPattern :: Maybe Text -- ^ The description of the pattern used for the product.
  , itemAttributesPrice :: Maybe Text -- ^ The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  , itemAttributesProductUnderscoretype :: Maybe Text -- ^ <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
  , itemAttributesSaleUnderscoreprice :: Maybe Text -- ^ The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
  , itemAttributesShipping :: Maybe Text -- ^ Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
  , itemAttributesShippingUnderscoreheight :: Maybe Text -- ^ The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  , itemAttributesShippingUnderscoreweight :: Maybe Text -- ^ The weight of the product. Ensure there is a space between the numeric string and the metric.
  , itemAttributesShippingUnderscorewidth :: Maybe Text -- ^ The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  , itemAttributesSize :: Maybe Text -- ^ The size of the product.
  , itemAttributesSizeUnderscoresystem :: Maybe Text -- ^ Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
  , itemAttributesSizeUnderscoretype :: Maybe Text -- ^ Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
  , itemAttributesTax :: Maybe Text -- ^ Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
  , itemAttributesTitle :: Maybe Text -- ^ <p><= 500 characters</p> <p>The name of the product.</p>
  , itemAttributesVariantUnderscorenames :: Maybe [Text] -- ^ Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
  , itemAttributesVariantUnderscorevalues :: Maybe [Text] -- ^ Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
  , itemAttributesAdditionalUnderscoreimageUnderscorelink :: Maybe [Text] -- ^ <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
  , itemAttributesImageUnderscorelink :: Maybe [Text] -- ^ <p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
  } deriving (Show, Eq, Generic)

instance FromJSON ItemAttributes where
  parseJSON = genericParseJSON optionsItemAttributes
instance ToJSON ItemAttributes where
  toJSON = genericToJSON optionsItemAttributes

optionsItemAttributes :: Options
optionsItemAttributes =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemAttributesAdUnderscorelink", "ad_link")
      , ("itemAttributesAdult", "adult")
      , ("itemAttributesAgeUnderscoregroup", "age_group")
      , ("itemAttributesAvailability", "availability")
      , ("itemAttributesAverageUnderscorereviewUnderscorerating", "average_review_rating")
      , ("itemAttributesBrand", "brand")
      , ("itemAttributesCheckoutUnderscoreenabled", "checkout_enabled")
      , ("itemAttributesColor", "color")
      , ("itemAttributesCondition", "condition")
      , ("itemAttributesCustomUnderscorelabelUnderscore0", "custom_label_0")
      , ("itemAttributesCustomUnderscorelabelUnderscore1", "custom_label_1")
      , ("itemAttributesCustomUnderscorelabelUnderscore2", "custom_label_2")
      , ("itemAttributesCustomUnderscorelabelUnderscore3", "custom_label_3")
      , ("itemAttributesCustomUnderscorelabelUnderscore4", "custom_label_4")
      , ("itemAttributesDescription", "description")
      , ("itemAttributesFreeUnderscoreshippingUnderscorelabel", "free_shipping_label")
      , ("itemAttributesFreeUnderscoreshippingUnderscorelimit", "free_shipping_limit")
      , ("itemAttributesGender", "gender")
      , ("itemAttributesGoogleUnderscoreproductUnderscorecategory", "google_product_category")
      , ("itemAttributesGtin", "gtin")
      , ("itemAttributesId", "id")
      , ("itemAttributesItemUnderscoregroupUnderscoreid", "item_group_id")
      , ("itemAttributesLastUnderscoreupdatedUnderscoretime", "last_updated_time")
      , ("itemAttributesLink", "link")
      , ("itemAttributesMaterial", "material")
      , ("itemAttributesMinUnderscoreadUnderscoreprice", "min_ad_price")
      , ("itemAttributesMobileUnderscorelink", "mobile_link")
      , ("itemAttributesMpn", "mpn")
      , ("itemAttributesNumberUnderscoreofUnderscoreratings", "number_of_ratings")
      , ("itemAttributesNumberUnderscoreofUnderscorereviews", "number_of_reviews")
      , ("itemAttributesPattern", "pattern")
      , ("itemAttributesPrice", "price")
      , ("itemAttributesProductUnderscoretype", "product_type")
      , ("itemAttributesSaleUnderscoreprice", "sale_price")
      , ("itemAttributesShipping", "shipping")
      , ("itemAttributesShippingUnderscoreheight", "shipping_height")
      , ("itemAttributesShippingUnderscoreweight", "shipping_weight")
      , ("itemAttributesShippingUnderscorewidth", "shipping_width")
      , ("itemAttributesSize", "size")
      , ("itemAttributesSizeUnderscoresystem", "size_system")
      , ("itemAttributesSizeUnderscoretype", "size_type")
      , ("itemAttributesTax", "tax")
      , ("itemAttributesTitle", "title")
      , ("itemAttributesVariantUnderscorenames", "variant_names")
      , ("itemAttributesVariantUnderscorevalues", "variant_values")
      , ("itemAttributesAdditionalUnderscoreimageUnderscorelink", "additional_image_link")
      , ("itemAttributesImageUnderscorelink", "image_link")
      ]


-- | Object describing an item batch record
data ItemBatchRecord = ItemBatchRecord
  { itemBatchRecordItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  , itemBatchRecordAttributes :: Maybe ItemAttributes -- ^ 
  , itemBatchRecordUpdateUnderscoremask :: Maybe [UpdateMaskFieldType] -- ^ The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemBatchRecord where
  parseJSON = genericParseJSON optionsItemBatchRecord
instance ToJSON ItemBatchRecord where
  toJSON = genericToJSON optionsItemBatchRecord

optionsItemBatchRecord :: Options
optionsItemBatchRecord =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemBatchRecordItemUnderscoreid", "item_id")
      , ("itemBatchRecordAttributes", "attributes")
      , ("itemBatchRecordUpdateUnderscoremask", "update_mask")
      ]


-- | Object describing an item batch record to create items
data ItemCreateBatchRecord = ItemCreateBatchRecord
  { itemCreateBatchRecordItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  , itemCreateBatchRecordAttributes :: Maybe ItemAttributes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemCreateBatchRecord where
  parseJSON = genericParseJSON optionsItemCreateBatchRecord
instance ToJSON ItemCreateBatchRecord where
  toJSON = genericToJSON optionsItemCreateBatchRecord

optionsItemCreateBatchRecord :: Options
optionsItemCreateBatchRecord =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemCreateBatchRecordItemUnderscoreid", "item_id")
      , ("itemCreateBatchRecordAttributes", "attributes")
      ]


-- | Object describing an item batch record to delete items
data ItemDeleteBatchRecord = ItemDeleteBatchRecord
  { itemDeleteBatchRecordItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  } deriving (Show, Eq, Generic)

instance FromJSON ItemDeleteBatchRecord where
  parseJSON = genericParseJSON optionsItemDeleteBatchRecord
instance ToJSON ItemDeleteBatchRecord where
  toJSON = genericToJSON optionsItemDeleteBatchRecord

optionsItemDeleteBatchRecord :: Options
optionsItemDeleteBatchRecord =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemDeleteBatchRecordItemUnderscoreid", "item_id")
      ]


-- | Object describing an item batch record to discontinue items
data ItemDeleteDiscontinuedBatchRecord = ItemDeleteDiscontinuedBatchRecord
  { itemDeleteDiscontinuedBatchRecordItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  } deriving (Show, Eq, Generic)

instance FromJSON ItemDeleteDiscontinuedBatchRecord where
  parseJSON = genericParseJSON optionsItemDeleteDiscontinuedBatchRecord
instance ToJSON ItemDeleteDiscontinuedBatchRecord where
  toJSON = genericToJSON optionsItemDeleteDiscontinuedBatchRecord

optionsItemDeleteDiscontinuedBatchRecord :: Options
optionsItemDeleteDiscontinuedBatchRecord =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemDeleteDiscontinuedBatchRecordItemUnderscoreid", "item_id")
      ]


-- | 
data ItemGroupIdFilter = ItemGroupIdFilter
  { itemGroupIdFilterITEMUnderscoreGROUPUnderscoreID :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemGroupIdFilter where
  parseJSON = genericParseJSON optionsItemGroupIdFilter
instance ToJSON ItemGroupIdFilter where
  toJSON = genericToJSON optionsItemGroupIdFilter

optionsItemGroupIdFilter :: Options
optionsItemGroupIdFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemGroupIdFilterITEMUnderscoreGROUPUnderscoreID", "ITEM_GROUP_ID")
      ]


-- | 
data ItemIdFilter = ItemIdFilter
  { itemIdFilterITEMUnderscoreID :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemIdFilter where
  parseJSON = genericParseJSON optionsItemIdFilter
instance ToJSON ItemIdFilter where
  toJSON = genericToJSON optionsItemIdFilter

optionsItemIdFilter :: Options
optionsItemIdFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemIdFilterITEMUnderscoreID", "ITEM_ID")
      ]


-- | Object describing an item processing record
data ItemProcessingRecord = ItemProcessingRecord
  { itemProcessingRecordItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  , itemProcessingRecordErrors :: Maybe [ItemValidationEvent] -- ^ Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  , itemProcessingRecordWarnings :: Maybe [ItemValidationEvent] -- ^ Array with the validation warnings for the item processing record
  , itemProcessingRecordStatus :: Maybe ItemProcessingStatus -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemProcessingRecord where
  parseJSON = genericParseJSON optionsItemProcessingRecord
instance ToJSON ItemProcessingRecord where
  toJSON = genericToJSON optionsItemProcessingRecord

optionsItemProcessingRecord :: Options
optionsItemProcessingRecord =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemProcessingRecordItemUnderscoreid", "item_id")
      , ("itemProcessingRecordErrors", "errors")
      , ("itemProcessingRecordWarnings", "warnings")
      , ("itemProcessingRecordStatus", "status")
      ]


-- | The status of the item processing record
data ItemProcessingStatus = ItemProcessingStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemProcessingStatus where
  parseJSON = genericParseJSON optionsItemProcessingStatus
instance ToJSON ItemProcessingStatus where
  toJSON = genericToJSON optionsItemProcessingStatus

optionsItemProcessingStatus :: Options
optionsItemProcessingStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Object describing an item record
data ItemResponse = ItemResponse
  { itemResponseCatalogUnderscoretype :: CatalogsType -- ^ 
  , itemResponseItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  , itemResponsePins :: Maybe [Pin] -- ^ The pins mapped to the item
  , itemResponseAttributes :: Maybe CatalogsHotelAttributes -- ^ 
  , itemResponseHotelUnderscoreid :: Maybe Text -- ^ The catalog hotel id in the merchant namespace
  , itemResponseErrors :: Maybe [ItemValidationEvent] -- ^ Array with the errors for the item id requested
  } deriving (Show, Eq, Generic)

instance FromJSON ItemResponse where
  parseJSON = genericParseJSON optionsItemResponse
instance ToJSON ItemResponse where
  toJSON = genericToJSON optionsItemResponse

optionsItemResponse :: Options
optionsItemResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemResponseCatalogUnderscoretype", "catalog_type")
      , ("itemResponseItemUnderscoreid", "item_id")
      , ("itemResponsePins", "pins")
      , ("itemResponseAttributes", "attributes")
      , ("itemResponseHotelUnderscoreid", "hotel_id")
      , ("itemResponseErrors", "errors")
      ]


-- | 
data ItemResponseAnyOf = ItemResponseAnyOf
  { itemResponseAnyOfCatalogUnderscoretype :: CatalogsType -- ^ 
  , itemResponseAnyOfItemUnderscoreid :: Maybe Text -- ^ The catalog retail item id in the merchant namespace
  , itemResponseAnyOfPins :: Maybe [Pin] -- ^ The pins mapped to the item
  , itemResponseAnyOfAttributes :: Maybe CatalogsHotelAttributes -- ^ 
  , itemResponseAnyOfHotelUnderscoreid :: Maybe Text -- ^ The catalog hotel id in the merchant namespace
  } deriving (Show, Eq, Generic)

instance FromJSON ItemResponseAnyOf where
  parseJSON = genericParseJSON optionsItemResponseAnyOf
instance ToJSON ItemResponseAnyOf where
  toJSON = genericToJSON optionsItemResponseAnyOf

optionsItemResponseAnyOf :: Options
optionsItemResponseAnyOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemResponseAnyOfCatalogUnderscoretype", "catalog_type")
      , ("itemResponseAnyOfItemUnderscoreid", "item_id")
      , ("itemResponseAnyOfPins", "pins")
      , ("itemResponseAnyOfAttributes", "attributes")
      , ("itemResponseAnyOfHotelUnderscoreid", "hotel_id")
      ]


-- | 
data ItemResponseAnyOf1 = ItemResponseAnyOf1
  { itemResponseAnyOf1CatalogUnderscoretype :: CatalogsType -- ^ 
  , itemResponseAnyOf1ItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  , itemResponseAnyOf1Errors :: Maybe [ItemValidationEvent] -- ^ Array with the errors for the item id requested
  , itemResponseAnyOf1HotelUnderscoreid :: Maybe Text -- ^ The catalog hotel id in the merchant namespace
  } deriving (Show, Eq, Generic)

instance FromJSON ItemResponseAnyOf1 where
  parseJSON = genericParseJSON optionsItemResponseAnyOf1
instance ToJSON ItemResponseAnyOf1 where
  toJSON = genericToJSON optionsItemResponseAnyOf1

optionsItemResponseAnyOf1 :: Options
optionsItemResponseAnyOf1 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemResponseAnyOf1CatalogUnderscoretype", "catalog_type")
      , ("itemResponseAnyOf1ItemUnderscoreid", "item_id")
      , ("itemResponseAnyOf1Errors", "errors")
      , ("itemResponseAnyOf1HotelUnderscoreid", "hotel_id")
      ]


-- | Object describing an item batch record to update items
data ItemUpdateBatchRecord = ItemUpdateBatchRecord
  { itemUpdateBatchRecordItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  , itemUpdateBatchRecordAttributes :: Maybe UpdatableItemAttributes -- ^ 
  , itemUpdateBatchRecordUpdateUnderscoremask :: Maybe [UpdateMaskFieldType] -- ^ The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemUpdateBatchRecord where
  parseJSON = genericParseJSON optionsItemUpdateBatchRecord
instance ToJSON ItemUpdateBatchRecord where
  toJSON = genericToJSON optionsItemUpdateBatchRecord

optionsItemUpdateBatchRecord :: Options
optionsItemUpdateBatchRecord =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemUpdateBatchRecordItemUnderscoreid", "item_id")
      , ("itemUpdateBatchRecordAttributes", "attributes")
      , ("itemUpdateBatchRecordUpdateUnderscoremask", "update_mask")
      ]


-- | Object describing an item batch record to upsert items
data ItemUpsertBatchRecord = ItemUpsertBatchRecord
  { itemUpsertBatchRecordItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  , itemUpsertBatchRecordAttributes :: Maybe ItemAttributes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemUpsertBatchRecord where
  parseJSON = genericParseJSON optionsItemUpsertBatchRecord
instance ToJSON ItemUpsertBatchRecord where
  toJSON = genericToJSON optionsItemUpsertBatchRecord

optionsItemUpsertBatchRecord :: Options
optionsItemUpsertBatchRecord =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemUpsertBatchRecordItemUnderscoreid", "item_id")
      , ("itemUpsertBatchRecordAttributes", "attributes")
      ]


-- | Object describing an item validation event
data ItemValidationEvent = ItemValidationEvent
  { itemValidationEventAttribute :: Maybe Text -- ^ The attribute that the item validation event references
  , itemValidationEventCode :: Maybe Int -- ^ The event code that the item validation event references
  , itemValidationEventMessage :: Maybe Text -- ^ Title message describing the item validation event
  } deriving (Show, Eq, Generic)

instance FromJSON ItemValidationEvent where
  parseJSON = genericParseJSON optionsItemValidationEvent
instance ToJSON ItemValidationEvent where
  toJSON = genericToJSON optionsItemValidationEvent

optionsItemValidationEvent :: Options
optionsItemValidationEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemValidationEventAttribute", "attribute")
      , ("itemValidationEventCode", "code")
      , ("itemValidationEventMessage", "message")
      ]


-- | 
data ItemsBatchPostRequest = ItemsBatchPostRequest
  { itemsBatchPostRequestCatalogUnderscoretype :: CatalogsType -- ^ 
  , itemsBatchPostRequestCountry :: Country -- ^ 
  , itemsBatchPostRequestLanguage :: Language -- ^ 
  , itemsBatchPostRequestItems :: [ItemDeleteBatchRecord] -- ^ Array with catalogs items
  , itemsBatchPostRequestCatalogUnderscoreid :: Maybe Text -- ^ Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  , itemsBatchPostRequestOperation :: BatchOperation -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemsBatchPostRequest where
  parseJSON = genericParseJSON optionsItemsBatchPostRequest
instance ToJSON ItemsBatchPostRequest where
  toJSON = genericToJSON optionsItemsBatchPostRequest

optionsItemsBatchPostRequest :: Options
optionsItemsBatchPostRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemsBatchPostRequestCatalogUnderscoretype", "catalog_type")
      , ("itemsBatchPostRequestCountry", "country")
      , ("itemsBatchPostRequestLanguage", "language")
      , ("itemsBatchPostRequestItems", "items")
      , ("itemsBatchPostRequestCatalogUnderscoreid", "catalog_id")
      , ("itemsBatchPostRequestOperation", "operation")
      ]


-- | 
data ItemsIssuesList200Response = ItemsIssuesList200Response
  { itemsIssuesList200ResponseItems :: [CatalogsItemValidationIssues] -- ^ 
  , itemsIssuesList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemsIssuesList200Response where
  parseJSON = genericParseJSON optionsItemsIssuesList200Response
instance ToJSON ItemsIssuesList200Response where
  toJSON = genericToJSON optionsItemsIssuesList200Response

optionsItemsIssuesList200Response :: Options
optionsItemsIssuesList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemsIssuesList200ResponseItems", "items")
      , ("itemsIssuesList200ResponseBookmark", "bookmark")
      ]


-- | 
data Keyword = Keyword
  { keywordArchived :: Maybe Bool -- ^ 
  , keywordId :: Maybe Text -- ^ Keyword ID .
  , keywordParentUnderscoreid :: Maybe Text -- ^ Keyword parent entity ID (advertiser, campaign, ad group).
  , keywordParentUnderscoretype :: Maybe Text -- ^ Parent entity type
  , keywordType :: Maybe Text -- ^ Always keyword
  , keywordBid :: Maybe Int -- ^ Keyword custom bid in microcurrency - null if inherited from parent ad group.
  , keywordMatchUnderscoretype :: MatchTypeResponse -- ^ 
  , keywordValue :: Text -- ^ Keyword value (120 chars max).
  } deriving (Show, Eq, Generic)

instance FromJSON Keyword where
  parseJSON = genericParseJSON optionsKeyword
instance ToJSON Keyword where
  toJSON = genericToJSON optionsKeyword

optionsKeyword :: Options
optionsKeyword =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("keywordArchived", "archived")
      , ("keywordId", "id")
      , ("keywordParentUnderscoreid", "parent_id")
      , ("keywordParentUnderscoretype", "parent_type")
      , ("keywordType", "type")
      , ("keywordBid", "bid")
      , ("keywordMatchUnderscoretype", "match_type")
      , ("keywordValue", "value")
      ]


-- | 
data KeywordError = KeywordError
  { keywordErrorData :: Maybe Keyword -- ^ 
  , keywordErrorErrorUnderscoremessages :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON KeywordError where
  parseJSON = genericParseJSON optionsKeywordError
instance ToJSON KeywordError where
  toJSON = genericToJSON optionsKeywordError

optionsKeywordError :: Options
optionsKeywordError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("keywordErrorData", "data")
      , ("keywordErrorErrorUnderscoremessages", "error_messages")
      ]


-- | Keyword metrics JSON
data KeywordMetrics = KeywordMetrics
  { keywordMetricsAvgUnderscorecpcUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Double -- ^ Average cost per click
  , keywordMetricsKeywordUnderscorequeryUnderscorevolume :: Maybe Text -- ^ Keyword's search frequency. This value is based on keyword frequency in pepsi client response
  } deriving (Show, Eq, Generic)

instance FromJSON KeywordMetrics where
  parseJSON = genericParseJSON optionsKeywordMetrics
instance ToJSON KeywordMetrics where
  toJSON = genericToJSON optionsKeywordMetrics

optionsKeywordMetrics :: Options
optionsKeywordMetrics =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("keywordMetricsAvgUnderscorecpcUnderscoreinUnderscoremicroUnderscorecurrency", "avg_cpc_in_micro_currency")
      , ("keywordMetricsKeywordUnderscorequeryUnderscorevolume", "keyword_query_volume")
      ]


-- | 
data KeywordMetricsResponse = KeywordMetricsResponse
  { keywordMetricsResponseKeyword :: Maybe Text -- ^ Keyword name, e.g., \"keyword\":\"fashion outfits\"
  , keywordMetricsResponseMetrics :: Maybe KeywordMetrics -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON KeywordMetricsResponse where
  parseJSON = genericParseJSON optionsKeywordMetricsResponse
instance ToJSON KeywordMetricsResponse where
  toJSON = genericToJSON optionsKeywordMetricsResponse

optionsKeywordMetricsResponse :: Options
optionsKeywordMetricsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("keywordMetricsResponseKeyword", "keyword")
      , ("keywordMetricsResponseMetrics", "metrics")
      ]


-- | 
data KeywordUpdate = KeywordUpdate
  { keywordUpdateId :: Text -- ^ Keyword ID.
  , keywordUpdateArchived :: Maybe Bool -- ^ Is keyword archived?
  , keywordUpdateBid :: Maybe Int -- ^ Keyword custom bid in microcurrency - null if inherited from parent ad group.
  } deriving (Show, Eq, Generic)

instance FromJSON KeywordUpdate where
  parseJSON = genericParseJSON optionsKeywordUpdate
instance ToJSON KeywordUpdate where
  toJSON = genericToJSON optionsKeywordUpdate

optionsKeywordUpdate :: Options
optionsKeywordUpdate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("keywordUpdateId", "id")
      , ("keywordUpdateArchived", "archived")
      , ("keywordUpdateBid", "bid")
      ]


-- | 
data KeywordUpdateBody = KeywordUpdateBody
  { keywordUpdateBodyKeywords :: [KeywordUpdate] -- ^ Keywords to update. Object array. Each object has 3 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>3. \"bid\": number<br>For example: [{\"id\":\"2886610576653\", \"archived\": false, \"bid\": 20000}, {\"id\":\"2886610576654\",  \"archived\": true, \"bid\": 20000}, ...]
  } deriving (Show, Eq, Generic)

instance FromJSON KeywordUpdateBody where
  parseJSON = genericParseJSON optionsKeywordUpdateBody
instance ToJSON KeywordUpdateBody where
  toJSON = genericToJSON optionsKeywordUpdateBody

optionsKeywordUpdateBody :: Options
optionsKeywordUpdateBody =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("keywordUpdateBodyKeywords", "keywords")
      ]


-- | 
data KeywordsCommon = KeywordsCommon
  { keywordsCommonBid :: Maybe Int -- ^ Keyword custom bid in microcurrency - null if inherited from parent ad group.
  , keywordsCommonMatchUnderscoretype :: MatchTypeResponse -- ^ 
  , keywordsCommonValue :: Text -- ^ Keyword value (120 chars max).
  } deriving (Show, Eq, Generic)

instance FromJSON KeywordsCommon where
  parseJSON = genericParseJSON optionsKeywordsCommon
instance ToJSON KeywordsCommon where
  toJSON = genericToJSON optionsKeywordsCommon

optionsKeywordsCommon :: Options
optionsKeywordsCommon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("keywordsCommonBid", "bid")
      , ("keywordsCommonMatchUnderscoretype", "match_type")
      , ("keywordsCommonValue", "value")
      ]


-- | 
data KeywordsGet200Response = KeywordsGet200Response
  { keywordsGet200ResponseItems :: [Keyword] -- ^ 
  , keywordsGet200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON KeywordsGet200Response where
  parseJSON = genericParseJSON optionsKeywordsGet200Response
instance ToJSON KeywordsGet200Response where
  toJSON = genericToJSON optionsKeywordsGet200Response

optionsKeywordsGet200Response :: Options
optionsKeywordsGet200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("keywordsGet200ResponseItems", "items")
      , ("keywordsGet200ResponseBookmark", "bookmark")
      ]


-- | 
data KeywordsMetricsArrayResponse = KeywordsMetricsArrayResponse
  { keywordsMetricsArrayResponseData :: Maybe [KeywordMetricsResponse] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON KeywordsMetricsArrayResponse where
  parseJSON = genericParseJSON optionsKeywordsMetricsArrayResponse
instance ToJSON KeywordsMetricsArrayResponse where
  toJSON = genericToJSON optionsKeywordsMetricsArrayResponse

optionsKeywordsMetricsArrayResponse :: Options
optionsKeywordsMetricsArrayResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("keywordsMetricsArrayResponseData", "data")
      ]


-- | 
data KeywordsRequest = KeywordsRequest
  { keywordsRequestKeywords :: [KeywordsCommon] -- ^ Keyword JSON array. Each array element has 3 fields
  , keywordsRequestParentUnderscoreid :: Text -- ^ Keyword parent entity ID (advertiser, campaign, ad group).
  } deriving (Show, Eq, Generic)

instance FromJSON KeywordsRequest where
  parseJSON = genericParseJSON optionsKeywordsRequest
instance ToJSON KeywordsRequest where
  toJSON = genericToJSON optionsKeywordsRequest

optionsKeywordsRequest :: Options
optionsKeywordsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("keywordsRequestKeywords", "keywords")
      , ("keywordsRequestParentUnderscoreid", "parent_id")
      ]


-- | 
data KeywordsResponse = KeywordsResponse
  { keywordsResponseErrors :: Maybe [KeywordError] -- ^ 
  , keywordsResponseKeywords :: Maybe [Keyword] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON KeywordsResponse where
  parseJSON = genericParseJSON optionsKeywordsResponse
instance ToJSON KeywordsResponse where
  toJSON = genericToJSON optionsKeywordsResponse

optionsKeywordsResponse :: Options
optionsKeywordsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("keywordsResponseErrors", "errors")
      , ("keywordsResponseKeywords", "keywords")
      ]


-- | Language code, which is among the offical ISO 639-1 language list.
data Language = Language
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON Language where
  parseJSON = genericParseJSON optionsLanguage
instance ToJSON Language where
  toJSON = genericToJSON optionsLanguage

optionsLanguage :: Options
optionsLanguage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Creation fields
data LeadFormCommon = LeadFormCommon
  { leadFormCommonName :: Maybe Text -- ^ Internal name of the lead form.
  , leadFormCommonPrivacyUnderscorepolicyUnderscorelink :: Maybe Text -- ^ A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  , leadFormCommonHasUnderscoreacceptedUnderscoreterms :: Maybe Bool -- ^ Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
  , leadFormCommonCompletionUnderscoremessage :: Maybe Text -- ^ A message for people who complete the form to let them know what happens next.
  , leadFormCommonStatus :: Maybe LeadFormStatus -- ^ 
  , leadFormCommonDisclosureUnderscorelanguage :: Maybe Text -- ^ Additional disclosure language to be included in the lead form.
  , leadFormCommonQuestions :: Maybe [LeadFormQuestion] -- ^ List of questions to be displayed on the lead form.
  } deriving (Show, Eq, Generic)

instance FromJSON LeadFormCommon where
  parseJSON = genericParseJSON optionsLeadFormCommon
instance ToJSON LeadFormCommon where
  toJSON = genericToJSON optionsLeadFormCommon

optionsLeadFormCommon :: Options
optionsLeadFormCommon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("leadFormCommonName", "name")
      , ("leadFormCommonPrivacyUnderscorepolicyUnderscorelink", "privacy_policy_link")
      , ("leadFormCommonHasUnderscoreacceptedUnderscoreterms", "has_accepted_terms")
      , ("leadFormCommonCompletionUnderscoremessage", "completion_message")
      , ("leadFormCommonStatus", "status")
      , ("leadFormCommonDisclosureUnderscorelanguage", "disclosure_language")
      , ("leadFormCommonQuestions", "questions")
      ]


-- | 
data LeadFormQuestion = LeadFormQuestion
  { leadFormQuestionQuestionUnderscoretype :: Maybe LeadFormQuestionType -- ^ 
  , leadFormQuestionCustomUnderscorequestionUnderscorefieldUnderscoretype :: Maybe LeadFormQuestionFieldType -- ^ 
  , leadFormQuestionCustomUnderscorequestionUnderscorelabel :: Maybe Text -- ^ Question label for a custom question.
  , leadFormQuestionCustomUnderscorequestionUnderscoreoptions :: Maybe [Text] -- ^ Question options for a custom question.
  } deriving (Show, Eq, Generic)

instance FromJSON LeadFormQuestion where
  parseJSON = genericParseJSON optionsLeadFormQuestion
instance ToJSON LeadFormQuestion where
  toJSON = genericToJSON optionsLeadFormQuestion

optionsLeadFormQuestion :: Options
optionsLeadFormQuestion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("leadFormQuestionQuestionUnderscoretype", "question_type")
      , ("leadFormQuestionCustomUnderscorequestionUnderscorefieldUnderscoretype", "custom_question_field_type")
      , ("leadFormQuestionCustomUnderscorequestionUnderscorelabel", "custom_question_label")
      , ("leadFormQuestionCustomUnderscorequestionUnderscoreoptions", "custom_question_options")
      ]


-- | Lead form question field type
data LeadFormQuestionFieldType = LeadFormQuestionFieldType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON LeadFormQuestionFieldType where
  parseJSON = genericParseJSON optionsLeadFormQuestionFieldType
instance ToJSON LeadFormQuestionFieldType where
  toJSON = genericToJSON optionsLeadFormQuestionFieldType

optionsLeadFormQuestionFieldType :: Options
optionsLeadFormQuestionFieldType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Lead form question type
data LeadFormQuestionType = LeadFormQuestionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON LeadFormQuestionType where
  parseJSON = genericParseJSON optionsLeadFormQuestionType
instance ToJSON LeadFormQuestionType where
  toJSON = genericToJSON optionsLeadFormQuestionType

optionsLeadFormQuestionType :: Options
optionsLeadFormQuestionType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data LeadFormResponse = LeadFormResponse
  { leadFormResponseName :: Maybe Text -- ^ Internal name of the lead form.
  , leadFormResponsePrivacyUnderscorepolicyUnderscorelink :: Maybe Text -- ^ A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  , leadFormResponseHasUnderscoreacceptedUnderscoreterms :: Maybe Bool -- ^ Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
  , leadFormResponseCompletionUnderscoremessage :: Maybe Text -- ^ A message for people who complete the form to let them know what happens next.
  , leadFormResponseStatus :: Maybe LeadFormStatus -- ^ 
  , leadFormResponseDisclosureUnderscorelanguage :: Maybe Text -- ^ Additional disclosure language to be included in the lead form.
  , leadFormResponseQuestions :: Maybe [LeadFormQuestion] -- ^ List of questions to be displayed on the lead form.
  , leadFormResponseId :: Maybe Text -- ^ The ID of this lead form
  , leadFormResponseAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ The Ad Account ID that this lead form belongs to.
  , leadFormResponseCreatedUnderscoretime :: Maybe Int -- ^ Lead form creation time. Unix timestamp in seconds.
  , leadFormResponseUpdatedUnderscoretime :: Maybe Int -- ^ Last update time. Unix timestamp in seconds.
  } deriving (Show, Eq, Generic)

instance FromJSON LeadFormResponse where
  parseJSON = genericParseJSON optionsLeadFormResponse
instance ToJSON LeadFormResponse where
  toJSON = genericToJSON optionsLeadFormResponse

optionsLeadFormResponse :: Options
optionsLeadFormResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("leadFormResponseName", "name")
      , ("leadFormResponsePrivacyUnderscorepolicyUnderscorelink", "privacy_policy_link")
      , ("leadFormResponseHasUnderscoreacceptedUnderscoreterms", "has_accepted_terms")
      , ("leadFormResponseCompletionUnderscoremessage", "completion_message")
      , ("leadFormResponseStatus", "status")
      , ("leadFormResponseDisclosureUnderscorelanguage", "disclosure_language")
      , ("leadFormResponseQuestions", "questions")
      , ("leadFormResponseId", "id")
      , ("leadFormResponseAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("leadFormResponseCreatedUnderscoretime", "created_time")
      , ("leadFormResponseUpdatedUnderscoretime", "updated_time")
      ]


-- | Status of the lead form
data LeadFormStatus = LeadFormStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON LeadFormStatus where
  parseJSON = genericParseJSON optionsLeadFormStatus
instance ToJSON LeadFormStatus where
  toJSON = genericToJSON optionsLeadFormStatus

optionsLeadFormStatus :: Options
optionsLeadFormStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Request to create test data for lead data test API.
data LeadFormTestRequest = LeadFormTestRequest
  { leadFormTestRequestAnswers :: [Text] -- ^ Test lead answers. Should follow the creation order.
  } deriving (Show, Eq, Generic)

instance FromJSON LeadFormTestRequest where
  parseJSON = genericParseJSON optionsLeadFormTestRequest
instance ToJSON LeadFormTestRequest where
  toJSON = genericToJSON optionsLeadFormTestRequest

optionsLeadFormTestRequest :: Options
optionsLeadFormTestRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("leadFormTestRequestAnswers", "answers")
      ]


-- | Response for lead data test API.
data LeadFormTestResponse = LeadFormTestResponse
  { leadFormTestResponseSubscriptionUnderscoreid :: Maybe Text -- ^ Subscription ID.
  } deriving (Show, Eq, Generic)

instance FromJSON LeadFormTestResponse where
  parseJSON = genericParseJSON optionsLeadFormTestResponse
instance ToJSON LeadFormTestResponse where
  toJSON = genericToJSON optionsLeadFormTestResponse

optionsLeadFormTestResponse :: Options
optionsLeadFormTestResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("leadFormTestResponseSubscriptionUnderscoreid", "subscription_id")
      ]


-- | 
data LeadFormsList200Response = LeadFormsList200Response
  { leadFormsList200ResponseItems :: [LeadFormResponse] -- ^ 
  , leadFormsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON LeadFormsList200Response where
  parseJSON = genericParseJSON optionsLeadFormsList200Response
instance ToJSON LeadFormsList200Response where
  toJSON = genericToJSON optionsLeadFormsList200Response

optionsLeadFormsList200Response :: Options
optionsLeadFormsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("leadFormsList200ResponseItems", "items")
      , ("leadFormsList200ResponseBookmark", "bookmark")
      ]


-- | 
data LineItem = LineItem
  { lineItemProductUnderscorebrand :: Maybe Text -- ^ Product brand. For example, \"Parker\".
  , lineItemProductUnderscorecategory :: Maybe Text -- ^ Product category. For example, \"Shoes\".
  , lineItemProductUnderscoreid :: Maybe Int -- ^ Product ID. For example, 1414.
  , lineItemProductUnderscorename :: Maybe Text -- ^ Product name. For example, \"Parker Boots\".
  , lineItemProductUnderscoreprice :: Maybe Text -- ^ Product price. For example, \"99.99\".
  , lineItemProductUnderscorequantity :: Maybe Int -- ^ Product quantity. For example, 2.
  , lineItemProductUnderscorevariant :: Maybe Text -- ^ Product variant. For example, \"Red\".
  , lineItemProductUnderscorevariantUnderscoreid :: Maybe Text -- ^ Product variant ID. For example, \"1414-34832\".
  } deriving (Show, Eq, Generic)

instance FromJSON LineItem where
  parseJSON = genericParseJSON optionsLineItem
instance ToJSON LineItem where
  toJSON = genericToJSON optionsLineItem

optionsLineItem :: Options
optionsLineItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("lineItemProductUnderscorebrand", "product_brand")
      , ("lineItemProductUnderscorecategory", "product_category")
      , ("lineItemProductUnderscoreid", "product_id")
      , ("lineItemProductUnderscorename", "product_name")
      , ("lineItemProductUnderscoreprice", "product_price")
      , ("lineItemProductUnderscorequantity", "product_quantity")
      , ("lineItemProductUnderscorevariant", "product_variant")
      , ("lineItemProductUnderscorevariantUnderscoreid", "product_variant_id")
      ]


-- | 
data LinkedBusiness = LinkedBusiness
  { linkedBusinessUsername :: Maybe Text -- ^ Username
  , linkedBusinessImageUnderscoresmallUnderscoreurl :: Maybe Text -- ^ image_small_url
  , linkedBusinessImageUnderscoremediumUnderscoreurl :: Maybe Text -- ^ image_medium_url
  , linkedBusinessImageUnderscorelargeUnderscoreurl :: Maybe Text -- ^ image_large_url
  , linkedBusinessImageUnderscorexlargeUnderscoreurl :: Maybe Text -- ^ image_xlarge_url
  } deriving (Show, Eq, Generic)

instance FromJSON LinkedBusiness where
  parseJSON = genericParseJSON optionsLinkedBusiness
instance ToJSON LinkedBusiness where
  toJSON = genericToJSON optionsLinkedBusiness

optionsLinkedBusiness :: Options
optionsLinkedBusiness =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("linkedBusinessUsername", "username")
      , ("linkedBusinessImageUnderscoresmallUnderscoreurl", "image_small_url")
      , ("linkedBusinessImageUnderscoremediumUnderscoreurl", "image_medium_url")
      , ("linkedBusinessImageUnderscorelargeUnderscoreurl", "image_large_url")
      , ("linkedBusinessImageUnderscorexlargeUnderscoreurl", "image_xlarge_url")
      ]


-- | Marketing Mix Modeling (MMM) Reporting Columns
data MMMReportingColumn = MMMReportingColumn
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON MMMReportingColumn where
  parseJSON = genericParseJSON optionsMMMReportingColumn
instance ToJSON MMMReportingColumn where
  toJSON = genericToJSON optionsMMMReportingColumn

optionsMMMReportingColumn :: Options
optionsMMMReportingColumn =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Ad targeting types for MMM report
data MMMReportingTargetingType = MMMReportingTargetingType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON MMMReportingTargetingType where
  parseJSON = genericParseJSON optionsMMMReportingTargetingType
instance ToJSON MMMReportingTargetingType where
  toJSON = genericToJSON optionsMMMReportingTargetingType

optionsMMMReportingTargetingType :: Options
optionsMMMReportingTargetingType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Keyword match type
data MatchType = MatchType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON MatchType where
  parseJSON = genericParseJSON optionsMatchType
instance ToJSON MatchType where
  toJSON = genericToJSON optionsMatchType

optionsMatchType :: Options
optionsMatchType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Keyword match type
data MatchTypeResponse = MatchTypeResponse
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON MatchTypeResponse where
  parseJSON = genericParseJSON optionsMatchTypeResponse
instance ToJSON MatchTypeResponse where
  toJSON = genericToJSON optionsMatchTypeResponse

optionsMatchTypeResponse :: Options
optionsMatchTypeResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data MaxPriceFilter = MaxPriceFilter
  { maxPriceFilterMAXUnderscorePRICE :: CatalogsProductGroupPricingCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MaxPriceFilter where
  parseJSON = genericParseJSON optionsMaxPriceFilter
instance ToJSON MaxPriceFilter where
  toJSON = genericToJSON optionsMaxPriceFilter

optionsMaxPriceFilter :: Options
optionsMaxPriceFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("maxPriceFilterMAXUnderscorePRICE", "MAX_PRICE")
      ]


-- | 
data MediaList200Response = MediaList200Response
  { mediaList200ResponseItems :: [MediaUploadDetails] -- ^ Media
  , mediaList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaList200Response where
  parseJSON = genericParseJSON optionsMediaList200Response
instance ToJSON MediaList200Response where
  toJSON = genericToJSON optionsMediaList200Response

optionsMediaList200Response :: Options
optionsMediaList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("mediaList200ResponseItems", "items")
      , ("mediaList200ResponseBookmark", "bookmark")
      ]


-- | Media upload that has been registered but not uploaded/processed yet.
data MediaUpload = MediaUpload
  { mediaUploadMediaUnderscoreid :: Maybe Text -- ^ Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  , mediaUploadMediaUnderscoretype :: Maybe MediaUploadType -- ^ 
  , mediaUploadUploadUnderscoreurl :: Maybe Text -- ^ The URL where you will POST your media file.
  , mediaUploadUploadUnderscoreparameters :: Maybe MediaUploadAllOfUploadParameters -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUpload where
  parseJSON = genericParseJSON optionsMediaUpload
instance ToJSON MediaUpload where
  toJSON = genericToJSON optionsMediaUpload

optionsMediaUpload :: Options
optionsMediaUpload =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("mediaUploadMediaUnderscoreid", "media_id")
      , ("mediaUploadMediaUnderscoretype", "media_type")
      , ("mediaUploadUploadUnderscoreurl", "upload_url")
      , ("mediaUploadUploadUnderscoreparameters", "upload_parameters")
      ]


-- | The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
data MediaUploadAllOfUploadParameters = MediaUploadAllOfUploadParameters
  { mediaUploadAllOfUploadParametersXDashamzDashdate :: Maybe Text -- ^ 
  , mediaUploadAllOfUploadParametersXDashamzDashsignature :: Maybe Text -- ^ 
  , mediaUploadAllOfUploadParametersXDashamzDashsecurityDashtoken :: Maybe Text -- ^ 
  , mediaUploadAllOfUploadParametersXDashamzDashalgorithm :: Maybe Text -- ^ 
  , mediaUploadAllOfUploadParametersKey :: Maybe Text -- ^ 
  , mediaUploadAllOfUploadParametersPolicy :: Maybe Text -- ^ 
  , mediaUploadAllOfUploadParametersXDashamzDashcredential :: Maybe Text -- ^ 
  , mediaUploadAllOfUploadParametersContentDashType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUploadAllOfUploadParameters where
  parseJSON = genericParseJSON optionsMediaUploadAllOfUploadParameters
instance ToJSON MediaUploadAllOfUploadParameters where
  toJSON = genericToJSON optionsMediaUploadAllOfUploadParameters

optionsMediaUploadAllOfUploadParameters :: Options
optionsMediaUploadAllOfUploadParameters =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("mediaUploadAllOfUploadParametersXDashamzDashdate", "x-amz-date")
      , ("mediaUploadAllOfUploadParametersXDashamzDashsignature", "x-amz-signature")
      , ("mediaUploadAllOfUploadParametersXDashamzDashsecurityDashtoken", "x-amz-security-token")
      , ("mediaUploadAllOfUploadParametersXDashamzDashalgorithm", "x-amz-algorithm")
      , ("mediaUploadAllOfUploadParametersKey", "key")
      , ("mediaUploadAllOfUploadParametersPolicy", "policy")
      , ("mediaUploadAllOfUploadParametersXDashamzDashcredential", "x-amz-credential")
      , ("mediaUploadAllOfUploadParametersContentDashType", "Content-Type")
      ]


-- | Media upload details
data MediaUploadDetails = MediaUploadDetails
  { mediaUploadDetailsMediaUnderscoreid :: Maybe Text -- ^ 
  , mediaUploadDetailsMediaUnderscoretype :: Maybe MediaUploadType -- ^ 
  , mediaUploadDetailsStatus :: Maybe MediaUploadStatus -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUploadDetails where
  parseJSON = genericParseJSON optionsMediaUploadDetails
instance ToJSON MediaUploadDetails where
  toJSON = genericToJSON optionsMediaUploadDetails

optionsMediaUploadDetails :: Options
optionsMediaUploadDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("mediaUploadDetailsMediaUnderscoreid", "media_id")
      , ("mediaUploadDetailsMediaUnderscoretype", "media_type")
      , ("mediaUploadDetailsStatus", "status")
      ]


-- | Media upload request
data MediaUploadRequest = MediaUploadRequest
  { mediaUploadRequestMediaUnderscoretype :: MediaUploadType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUploadRequest where
  parseJSON = genericParseJSON optionsMediaUploadRequest
instance ToJSON MediaUploadRequest where
  toJSON = genericToJSON optionsMediaUploadRequest

optionsMediaUploadRequest :: Options
optionsMediaUploadRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("mediaUploadRequestMediaUnderscoretype", "media_type")
      ]


-- | Media upload status
data MediaUploadStatus = MediaUploadStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUploadStatus where
  parseJSON = genericParseJSON optionsMediaUploadStatus
instance ToJSON MediaUploadStatus where
  toJSON = genericToJSON optionsMediaUploadStatus

optionsMediaUploadStatus :: Options
optionsMediaUploadStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data MediaUploadType = MediaUploadType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUploadType where
  parseJSON = genericParseJSON optionsMediaUploadType
instance ToJSON MediaUploadType where
  toJSON = genericToJSON optionsMediaUploadType

optionsMediaUploadType :: Options
optionsMediaUploadType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Level of the reporting request
data MetricsReportingLevel = MetricsReportingLevel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON MetricsReportingLevel where
  parseJSON = genericParseJSON optionsMetricsReportingLevel
instance ToJSON MetricsReportingLevel where
  toJSON = genericToJSON optionsMetricsReportingLevel

optionsMetricsReportingLevel :: Options
optionsMetricsReportingLevel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data MetricsResponse = MetricsResponse
  { metricsResponseData :: Maybe [Object] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MetricsResponse where
  parseJSON = genericParseJSON optionsMetricsResponse
instance ToJSON MetricsResponse where
  toJSON = genericToJSON optionsMetricsResponse

optionsMetricsResponse :: Options
optionsMetricsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("metricsResponseData", "data")
      ]


-- | 
data MinPriceFilter = MinPriceFilter
  { minPriceFilterMINUnderscorePRICE :: CatalogsProductGroupPricingCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MinPriceFilter where
  parseJSON = genericParseJSON optionsMinPriceFilter
instance ToJSON MinPriceFilter where
  toJSON = genericToJSON optionsMinPriceFilter

optionsMinPriceFilter :: Options
optionsMinPriceFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("minPriceFilterMINUnderscorePRICE", "MIN_PRICE")
      ]


-- | Currency Codes from ISO 4217.
data NonNullableCatalogsCurrency = NonNullableCatalogsCurrency
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON NonNullableCatalogsCurrency where
  parseJSON = genericParseJSON optionsNonNullableCatalogsCurrency
instance ToJSON NonNullableCatalogsCurrency where
  toJSON = genericToJSON optionsNonNullableCatalogsCurrency

optionsNonNullableCatalogsCurrency :: Options
optionsNonNullableCatalogsCurrency =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Product availability.
data NonNullableProductAvailabilityType = NonNullableProductAvailabilityType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON NonNullableProductAvailabilityType where
  parseJSON = genericParseJSON optionsNonNullableProductAvailabilityType
instance ToJSON NonNullableProductAvailabilityType where
  toJSON = genericToJSON optionsNonNullableProductAvailabilityType

optionsNonNullableProductAvailabilityType :: Options
optionsNonNullableProductAvailabilityType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Product item fields
data NullableCatalogsItemFieldType = NullableCatalogsItemFieldType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON NullableCatalogsItemFieldType where
  parseJSON = genericParseJSON optionsNullableCatalogsItemFieldType
instance ToJSON NullableCatalogsItemFieldType where
  toJSON = genericToJSON optionsNullableCatalogsItemFieldType

optionsNullableCatalogsItemFieldType :: Options
optionsNullableCatalogsItemFieldType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Currency Codes from ISO 4217.
data NullableCurrency = NullableCurrency
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON NullableCurrency where
  parseJSON = genericParseJSON optionsNullableCurrency
instance ToJSON NullableCurrency where
  toJSON = genericToJSON optionsNullableCurrency

optionsNullableCurrency :: Options
optionsNullableCurrency =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | A request to exchange an authorization code for an access token.
newtype OauthAccessTokenRequestCode = OauthAccessTokenRequestCode { unOauthAccessTokenRequestCode :: OauthAccessTokenRequest }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | A request to exchange a refresh token for a new access token.
newtype OauthAccessTokenRequestRefresh = OauthAccessTokenRequestRefresh { unOauthAccessTokenRequestRefresh :: OauthAccessTokenRequest }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | A successful OAuth access token response.
data OauthAccessTokenResponse = OauthAccessTokenResponse
  { oauthAccessTokenResponseResponseUnderscoretype :: Maybe Text -- ^ 
  , oauthAccessTokenResponseAccessUnderscoretoken :: Text -- ^ 
  , oauthAccessTokenResponseTokenUnderscoretype :: Text -- ^ 
  , oauthAccessTokenResponseExpiresUnderscorein :: Int -- ^ 
  , oauthAccessTokenResponseScope :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OauthAccessTokenResponse where
  parseJSON = genericParseJSON optionsOauthAccessTokenResponse
instance ToJSON OauthAccessTokenResponse where
  toJSON = genericToJSON optionsOauthAccessTokenResponse

optionsOauthAccessTokenResponse :: Options
optionsOauthAccessTokenResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("oauthAccessTokenResponseResponseUnderscoretype", "response_type")
      , ("oauthAccessTokenResponseAccessUnderscoretoken", "access_token")
      , ("oauthAccessTokenResponseTokenUnderscoretype", "token_type")
      , ("oauthAccessTokenResponseExpiresUnderscorein", "expires_in")
      , ("oauthAccessTokenResponseScope", "scope")
      ]


-- | A successful OAuth access token response for the authorization code flow.
newtype OauthAccessTokenResponseCode = OauthAccessTokenResponseCode { unOauthAccessTokenResponseCode :: OauthAccessTokenResponse }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
newtype OauthAccessTokenResponseEverlastingRefresh = OauthAccessTokenResponseEverlastingRefresh { unOauthAccessTokenResponseEverlastingRefresh :: OauthAccessTokenResponse }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | A successful OAuth access token response for the refresh token flow, with an added refresh token.
newtype OauthAccessTokenResponseIntegrationRefresh = OauthAccessTokenResponseIntegrationRefresh { unOauthAccessTokenResponseIntegrationRefresh :: OauthAccessTokenResponse }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | A successful OAuth access token response for the refresh token flow.
newtype OauthAccessTokenResponseRefresh = OauthAccessTokenResponseRefresh { unOauthAccessTokenResponseRefresh :: OauthAccessTokenResponse }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | Campaign objective type. If set as one of [\&quot;AWARENESS\&quot;, \&quot;CONSIDERATION\&quot;, \&quot;WEB_CONVERSION\&quot;, \&quot;CATALOG_SALES\&quot;] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\&quot;WEB_SESSIONS\&quot;] in BETA. For update, only draft campaigns may update objective type.
data ObjectiveType = ObjectiveType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ObjectiveType where
  parseJSON = genericParseJSON optionsObjectiveType
instance ToJSON ObjectiveType where
  toJSON = genericToJSON optionsObjectiveType

optionsObjectiveType :: Options
optionsObjectiveType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data OptimizationGoalMetadata = OptimizationGoalMetadata
  { optimizationGoalMetadataConversionUnderscoretagUnderscorev3UnderscoregoalUnderscoremetadata :: Maybe OptimizationGoalMetadataConversionTagV3GoalMetadata -- ^ 
  , optimizationGoalMetadataFrequencyUnderscoregoalUnderscoremetadata :: Maybe OptimizationGoalMetadataFrequencyGoalMetadata -- ^ 
  , optimizationGoalMetadataScrollupUnderscoregoalUnderscoremetadata :: Maybe OptimizationGoalMetadataScrollupGoalMetadata -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OptimizationGoalMetadata where
  parseJSON = genericParseJSON optionsOptimizationGoalMetadata
instance ToJSON OptimizationGoalMetadata where
  toJSON = genericToJSON optionsOptimizationGoalMetadata

optionsOptimizationGoalMetadata :: Options
optionsOptimizationGoalMetadata =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("optimizationGoalMetadataConversionUnderscoretagUnderscorev3UnderscoregoalUnderscoremetadata", "conversion_tag_v3_goal_metadata")
      , ("optimizationGoalMetadataFrequencyUnderscoregoalUnderscoremetadata", "frequency_goal_metadata")
      , ("optimizationGoalMetadataScrollupUnderscoregoalUnderscoremetadata", "scrollup_goal_metadata")
      ]


-- | 
data OptimizationGoalMetadataConversionTagV3GoalMetadata = OptimizationGoalMetadataConversionTagV3GoalMetadata
  { optimizationGoalMetadataConversionTagV3GoalMetadataAttributionUnderscorewindows :: Maybe OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows -- ^ 
  , optimizationGoalMetadataConversionTagV3GoalMetadataConversionUnderscoreevent :: Maybe Text -- ^ 
  , optimizationGoalMetadataConversionTagV3GoalMetadataConversionUnderscoretagUnderscoreid :: Maybe Text -- ^ 
  , optimizationGoalMetadataConversionTagV3GoalMetadataCpaUnderscoregoalUnderscorevalueUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Text -- ^ 
  , optimizationGoalMetadataConversionTagV3GoalMetadataIsUnderscoreroasUnderscoreoptimized :: Maybe Bool -- ^ Ad group is ROAS optimized
  , optimizationGoalMetadataConversionTagV3GoalMetadataLearningUnderscoremodeUnderscoretype :: Maybe Text -- ^ Conversion learning model type
  } deriving (Show, Eq, Generic)

instance FromJSON OptimizationGoalMetadataConversionTagV3GoalMetadata where
  parseJSON = genericParseJSON optionsOptimizationGoalMetadataConversionTagV3GoalMetadata
instance ToJSON OptimizationGoalMetadataConversionTagV3GoalMetadata where
  toJSON = genericToJSON optionsOptimizationGoalMetadataConversionTagV3GoalMetadata

optionsOptimizationGoalMetadataConversionTagV3GoalMetadata :: Options
optionsOptimizationGoalMetadataConversionTagV3GoalMetadata =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("optimizationGoalMetadataConversionTagV3GoalMetadataAttributionUnderscorewindows", "attribution_windows")
      , ("optimizationGoalMetadataConversionTagV3GoalMetadataConversionUnderscoreevent", "conversion_event")
      , ("optimizationGoalMetadataConversionTagV3GoalMetadataConversionUnderscoretagUnderscoreid", "conversion_tag_id")
      , ("optimizationGoalMetadataConversionTagV3GoalMetadataCpaUnderscoregoalUnderscorevalueUnderscoreinUnderscoremicroUnderscorecurrency", "cpa_goal_value_in_micro_currency")
      , ("optimizationGoalMetadataConversionTagV3GoalMetadataIsUnderscoreroasUnderscoreoptimized", "is_roas_optimized")
      , ("optimizationGoalMetadataConversionTagV3GoalMetadataLearningUnderscoremodeUnderscoretype", "learning_mode_type")
      ]


-- | 
data OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows = OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
  { optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsClickUnderscorewindowUnderscoredays :: Maybe Int -- ^ 
  , optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsEngagementUnderscorewindowUnderscoredays :: Maybe Int -- ^ 
  , optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsViewUnderscorewindowUnderscoredays :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows where
  parseJSON = genericParseJSON optionsOptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
instance ToJSON OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows where
  toJSON = genericToJSON optionsOptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows

optionsOptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows :: Options
optionsOptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsClickUnderscorewindowUnderscoredays", "click_window_days")
      , ("optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsEngagementUnderscorewindowUnderscoredays", "engagement_window_days")
      , ("optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsViewUnderscorewindowUnderscoredays", "view_window_days")
      ]


-- | 
data OptimizationGoalMetadataFrequencyGoalMetadata = OptimizationGoalMetadataFrequencyGoalMetadata
  { optimizationGoalMetadataFrequencyGoalMetadataFrequency :: Maybe Int -- ^ 
  , optimizationGoalMetadataFrequencyGoalMetadataTimerange :: Maybe Text -- ^ User entity counts time range
  } deriving (Show, Eq, Generic)

instance FromJSON OptimizationGoalMetadataFrequencyGoalMetadata where
  parseJSON = genericParseJSON optionsOptimizationGoalMetadataFrequencyGoalMetadata
instance ToJSON OptimizationGoalMetadataFrequencyGoalMetadata where
  toJSON = genericToJSON optionsOptimizationGoalMetadataFrequencyGoalMetadata

optionsOptimizationGoalMetadataFrequencyGoalMetadata :: Options
optionsOptimizationGoalMetadataFrequencyGoalMetadata =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("optimizationGoalMetadataFrequencyGoalMetadataFrequency", "frequency")
      , ("optimizationGoalMetadataFrequencyGoalMetadataTimerange", "timerange")
      ]


-- | 
data OptimizationGoalMetadataScrollupGoalMetadata = OptimizationGoalMetadataScrollupGoalMetadata
  { optimizationGoalMetadataScrollupGoalMetadataScrollupUnderscoregoalUnderscorevalueUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OptimizationGoalMetadataScrollupGoalMetadata where
  parseJSON = genericParseJSON optionsOptimizationGoalMetadataScrollupGoalMetadata
instance ToJSON OptimizationGoalMetadataScrollupGoalMetadata where
  toJSON = genericToJSON optionsOptimizationGoalMetadataScrollupGoalMetadata

optionsOptimizationGoalMetadataScrollupGoalMetadata :: Options
optionsOptimizationGoalMetadataScrollupGoalMetadata =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("optimizationGoalMetadataScrollupGoalMetadataScrollupUnderscoregoalUnderscorevalueUnderscoreinUnderscoremicroUnderscorecurrency", "scrollup_goal_value_in_micro_currency")
      ]


-- | 
data OrderLine = OrderLine
  { orderLineId :: Maybe Text -- ^ Order line ID.
  , orderLineType :: Maybe Text -- ^ Always \"orderline\".
  , orderLineAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Ad account ID.
  , orderLinePurchaseUnderscoreorderUnderscoreid :: Maybe Text -- ^ Purchase order ID.
  , orderLineStartUnderscoretime :: Maybe Double -- ^ Start time. Unix timestamp.
  , orderLineEndUnderscoretime :: Maybe Double -- ^ End time. Unix timestamp.
  , orderLineBudget :: Maybe Double -- ^ Order line budget in micro currency.
  , orderLinePaidUnderscorebudget :: Maybe Double -- ^ Order line paid budget in micro currency.
  , orderLineStatus :: Maybe OrderLineStatus -- ^ Order line status.
  , orderLineName :: Maybe Text -- ^ Order line name.
  , orderLinePaidUnderscoretype :: Maybe OrderLinePaidType -- ^ Order line paid type.
  , orderLineCampaignUnderscoreids :: [Text] -- ^ Associated List of campaign IDs.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderLine where
  parseJSON = genericParseJSON optionsOrderLine
instance ToJSON OrderLine where
  toJSON = genericToJSON optionsOrderLine

optionsOrderLine :: Options
optionsOrderLine =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderLineId", "id")
      , ("orderLineType", "type")
      , ("orderLineAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("orderLinePurchaseUnderscoreorderUnderscoreid", "purchase_order_id")
      , ("orderLineStartUnderscoretime", "start_time")
      , ("orderLineEndUnderscoretime", "end_time")
      , ("orderLineBudget", "budget")
      , ("orderLinePaidUnderscorebudget", "paid_budget")
      , ("orderLineStatus", "status")
      , ("orderLineName", "name")
      , ("orderLinePaidUnderscoretype", "paid_type")
      , ("orderLineCampaignUnderscoreids", "campaign_ids")
      ]


-- | 
data OrderLineError = OrderLineError
  { orderLineErrorData :: Maybe OrderLine -- ^ 
  , orderLineErrorErrorUnderscoremessages :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderLineError where
  parseJSON = genericParseJSON optionsOrderLineError
instance ToJSON OrderLineError where
  toJSON = genericToJSON optionsOrderLineError

optionsOrderLineError :: Options
optionsOrderLineError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderLineErrorData", "data")
      , ("orderLineErrorErrorUnderscoremessages", "error_messages")
      ]


-- | Order Line Paid Type
data OrderLinePaidType = OrderLinePaidType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderLinePaidType where
  parseJSON = genericParseJSON optionsOrderLinePaidType
instance ToJSON OrderLinePaidType where
  toJSON = genericToJSON optionsOrderLinePaidType

optionsOrderLinePaidType :: Options
optionsOrderLinePaidType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data OrderLineResponse = OrderLineResponse
  { orderLineResponseErrors :: Maybe [OrderLineError] -- ^ Error list if update(s) fail.
  , orderLineResponseOrderUnderscoreline :: Maybe [OrderLine] -- ^ Order Line object array.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderLineResponse where
  parseJSON = genericParseJSON optionsOrderLineResponse
instance ToJSON OrderLineResponse where
  toJSON = genericToJSON optionsOrderLineResponse

optionsOrderLineResponse :: Options
optionsOrderLineResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderLineResponseErrors", "errors")
      , ("orderLineResponseOrderUnderscoreline", "order_line")
      ]


-- | 
data OrderLineSingleResponse = OrderLineSingleResponse
  { orderLineSingleResponseData :: Maybe OrderLineResponse -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderLineSingleResponse where
  parseJSON = genericParseJSON optionsOrderLineSingleResponse
instance ToJSON OrderLineSingleResponse where
  toJSON = genericToJSON optionsOrderLineSingleResponse

optionsOrderLineSingleResponse :: Options
optionsOrderLineSingleResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderLineSingleResponseData", "data")
      ]


-- | Order Line Status
data OrderLineStatus = OrderLineStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderLineStatus where
  parseJSON = genericParseJSON optionsOrderLineStatus
instance ToJSON OrderLineStatus where
  toJSON = genericToJSON optionsOrderLineStatus

optionsOrderLineStatus :: Options
optionsOrderLineStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Order Line
data OrderLines = OrderLines
  { orderLinesId :: Maybe Text -- ^ Order line ID.
  , orderLinesType :: Maybe Text -- ^ Always \"orderline\".
  , orderLinesAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Ad account ID.
  , orderLinesPurchaseUnderscoreorderUnderscoreid :: Maybe Text -- ^ Purchase order ID.
  , orderLinesStartUnderscoretime :: Maybe Double -- ^ Start time. Unix timestamp.
  , orderLinesEndUnderscoretime :: Maybe Double -- ^ End time. Unix timestamp.
  , orderLinesBudget :: Maybe Double -- ^ Order line budget in micro currency.
  , orderLinesPaidUnderscorebudget :: Maybe Double -- ^ Order line paid budget in micro currency.
  , orderLinesStatus :: Maybe OrderLineStatus -- ^ Order line status.
  , orderLinesName :: Maybe Text -- ^ Order line name.
  , orderLinesPaidUnderscoretype :: Maybe OrderLinePaidType -- ^ Order line paid type.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderLines where
  parseJSON = genericParseJSON optionsOrderLines
instance ToJSON OrderLines where
  toJSON = genericToJSON optionsOrderLines

optionsOrderLines :: Options
optionsOrderLines =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderLinesId", "id")
      , ("orderLinesType", "type")
      , ("orderLinesAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("orderLinesPurchaseUnderscoreorderUnderscoreid", "purchase_order_id")
      , ("orderLinesStartUnderscoretime", "start_time")
      , ("orderLinesEndUnderscoretime", "end_time")
      , ("orderLinesBudget", "budget")
      , ("orderLinesPaidUnderscorebudget", "paid_budget")
      , ("orderLinesStatus", "status")
      , ("orderLinesName", "name")
      , ("orderLinesPaidUnderscoretype", "paid_type")
      ]


-- | 
data OrderLinesArrayResponse = OrderLinesArrayResponse
  { orderLinesArrayResponseItems :: Maybe [OrderLines] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderLinesArrayResponse where
  parseJSON = genericParseJSON optionsOrderLinesArrayResponse
instance ToJSON OrderLinesArrayResponse where
  toJSON = genericToJSON optionsOrderLinesArrayResponse

optionsOrderLinesArrayResponse :: Options
optionsOrderLinesArrayResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderLinesArrayResponseItems", "items")
      ]


-- | 
data OrderLinesList200Response = OrderLinesList200Response
  { orderLinesList200ResponseItems :: [OrderLine] -- ^ 
  , orderLinesList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderLinesList200Response where
  parseJSON = genericParseJSON optionsOrderLinesList200Response
instance ToJSON OrderLinesList200Response where
  toJSON = genericToJSON optionsOrderLinesList200Response

optionsOrderLinesList200Response :: Options
optionsOrderLinesList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderLinesList200ResponseItems", "items")
      , ("orderLinesList200ResponseBookmark", "bookmark")
      ]


-- | Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
data PacingDeliveryType = PacingDeliveryType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PacingDeliveryType where
  parseJSON = genericParseJSON optionsPacingDeliveryType
instance ToJSON PacingDeliveryType where
  toJSON = genericToJSON optionsPacingDeliveryType

optionsPacingDeliveryType :: Options
optionsPacingDeliveryType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data PageVisitConversionTagsGet200Response = PageVisitConversionTagsGet200Response
  { pageVisitConversionTagsGet200ResponseItems :: [ConversionEventResponse] -- ^ 
  , pageVisitConversionTagsGet200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PageVisitConversionTagsGet200Response where
  parseJSON = genericParseJSON optionsPageVisitConversionTagsGet200Response
instance ToJSON PageVisitConversionTagsGet200Response where
  toJSON = genericToJSON optionsPageVisitConversionTagsGet200Response

optionsPageVisitConversionTagsGet200Response :: Options
optionsPageVisitConversionTagsGet200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pageVisitConversionTagsGet200ResponseItems", "items")
      , ("pageVisitConversionTagsGet200ResponseBookmark", "bookmark")
      ]


-- | 
data Paginated = Paginated
  { paginatedItems :: [Object] -- ^ 
  , paginatedBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Paginated where
  parseJSON = genericParseJSON optionsPaginated
instance ToJSON Paginated where
  toJSON = genericToJSON optionsPaginated

optionsPaginated :: Options
optionsPaginated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedItems", "items")
      , ("paginatedBookmark", "bookmark")
      ]


-- | 
data PartnerType = PartnerType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PartnerType where
  parseJSON = genericParseJSON optionsPartnerType
instance ToJSON PartnerType where
  toJSON = genericToJSON optionsPartnerType

optionsPartnerType :: Options
optionsPartnerType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Pin
data Pin = Pin
  { pinId :: Maybe Text -- ^ 
  , pinCreatedUnderscoreat :: Maybe UTCTime -- ^ 
  , pinLink :: Maybe Text -- ^ 
  , pinTitle :: Maybe Text -- ^ 
  , pinDescription :: Maybe Text -- ^ 
  , pinDominantUnderscorecolor :: Maybe Text -- ^ Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
  , pinAltUnderscoretext :: Maybe Text -- ^ 
  , pinCreativeUnderscoretype :: Maybe CreativeType -- ^ 
  , pinBoardUnderscoreid :: Maybe Text -- ^ The board to which this Pin belongs.
  , pinBoardUnderscoresectionUnderscoreid :: Maybe Text -- ^ The board section to which this Pin belongs.
  , pinBoardUnderscoreowner :: Maybe BoardOwner -- ^ 
  , pinIsUnderscoreowner :: Maybe Bool -- ^ Whether the \"operation user_account\" is the Pin owner.
  , pinMedia :: Maybe SummaryPinMedia -- ^ 
  , pinMediaUnderscoresource :: Maybe PinMediaSource -- ^ 
  , pinParentUnderscorepinUnderscoreid :: Maybe Text -- ^ The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
  , pinIsUnderscorestandard :: Maybe Bool -- ^ Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information.
  , pinHasUnderscorebeenUnderscorepromoted :: Maybe Bool -- ^ Whether the Pin has been promoted or not.
  , pinNote :: Maybe Text -- ^ Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
  , pinPinUnderscoremetrics :: Maybe Object -- ^ Pin metrics with associated time intervals if any.
  } deriving (Show, Eq, Generic)

instance FromJSON Pin where
  parseJSON = genericParseJSON optionsPin
instance ToJSON Pin where
  toJSON = genericToJSON optionsPin

optionsPin :: Options
optionsPin =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinId", "id")
      , ("pinCreatedUnderscoreat", "created_at")
      , ("pinLink", "link")
      , ("pinTitle", "title")
      , ("pinDescription", "description")
      , ("pinDominantUnderscorecolor", "dominant_color")
      , ("pinAltUnderscoretext", "alt_text")
      , ("pinCreativeUnderscoretype", "creative_type")
      , ("pinBoardUnderscoreid", "board_id")
      , ("pinBoardUnderscoresectionUnderscoreid", "board_section_id")
      , ("pinBoardUnderscoreowner", "board_owner")
      , ("pinIsUnderscoreowner", "is_owner")
      , ("pinMedia", "media")
      , ("pinMediaUnderscoresource", "media_source")
      , ("pinParentUnderscorepinUnderscoreid", "parent_pin_id")
      , ("pinIsUnderscorestandard", "is_standard")
      , ("pinHasUnderscorebeenUnderscorepromoted", "has_been_promoted")
      , ("pinNote", "note")
      , ("pinPinUnderscoremetrics", "pin_metrics")
      ]


-- | 
data PinAnalyticsMetricsResponse = PinAnalyticsMetricsResponse
  { pinAnalyticsMetricsResponseLifetimeUnderscoremetrics :: Maybe (Map.Map String Int) -- ^ The lifetime metric name and value.
  , pinAnalyticsMetricsResponseDailyUnderscoremetrics :: Maybe [PinAnalyticsMetricsResponseDailyMetricsInner] -- ^ Array with the requested daily metric records
  , pinAnalyticsMetricsResponseSummaryUnderscoremetrics :: Maybe (Map.Map String Double) -- ^ The metric name and value over the requested period for each requested metric
  } deriving (Show, Eq, Generic)

instance FromJSON PinAnalyticsMetricsResponse where
  parseJSON = genericParseJSON optionsPinAnalyticsMetricsResponse
instance ToJSON PinAnalyticsMetricsResponse where
  toJSON = genericToJSON optionsPinAnalyticsMetricsResponse

optionsPinAnalyticsMetricsResponse :: Options
optionsPinAnalyticsMetricsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinAnalyticsMetricsResponseLifetimeUnderscoremetrics", "lifetime_metrics")
      , ("pinAnalyticsMetricsResponseDailyUnderscoremetrics", "daily_metrics")
      , ("pinAnalyticsMetricsResponseSummaryUnderscoremetrics", "summary_metrics")
      ]


-- | 
data PinAnalyticsMetricsResponseDailyMetricsInner = PinAnalyticsMetricsResponseDailyMetricsInner
  { pinAnalyticsMetricsResponseDailyMetricsInnerDataUnderscorestatus :: Maybe DataStatus -- ^ 
  , pinAnalyticsMetricsResponseDailyMetricsInnerDate :: Maybe Text -- ^ Metrics date (UTC): YYYY-MM-DD.
  , pinAnalyticsMetricsResponseDailyMetricsInnerMetrics :: Maybe (Map.Map String Double) -- ^ The metric name and daily value for each requested metric
  } deriving (Show, Eq, Generic)

instance FromJSON PinAnalyticsMetricsResponseDailyMetricsInner where
  parseJSON = genericParseJSON optionsPinAnalyticsMetricsResponseDailyMetricsInner
instance ToJSON PinAnalyticsMetricsResponseDailyMetricsInner where
  toJSON = genericToJSON optionsPinAnalyticsMetricsResponseDailyMetricsInner

optionsPinAnalyticsMetricsResponseDailyMetricsInner :: Options
optionsPinAnalyticsMetricsResponseDailyMetricsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinAnalyticsMetricsResponseDailyMetricsInnerDataUnderscorestatus", "data_status")
      , ("pinAnalyticsMetricsResponseDailyMetricsInnerDate", "date")
      , ("pinAnalyticsMetricsResponseDailyMetricsInnerMetrics", "metrics")
      ]


-- | Pin
data PinCreate = PinCreate
  { pinCreateId :: Maybe Text -- ^ 
  , pinCreateCreatedUnderscoreat :: Maybe UTCTime -- ^ 
  , pinCreateLink :: Maybe Text -- ^ 
  , pinCreateTitle :: Maybe Text -- ^ 
  , pinCreateDescription :: Maybe Text -- ^ 
  , pinCreateDominantUnderscorecolor :: Maybe Text -- ^ Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
  , pinCreateAltUnderscoretext :: Maybe Text -- ^ 
  , pinCreateBoardUnderscoreid :: Maybe Text -- ^ The board to which this Pin belongs.
  , pinCreateBoardUnderscoresectionUnderscoreid :: Maybe Text -- ^ The board section to which this Pin belongs.
  , pinCreateBoardUnderscoreowner :: Maybe BoardOwner -- ^ 
  , pinCreateMedia :: Maybe SummaryPinMedia -- ^ 
  , pinCreateMediaUnderscoresource :: Maybe PinMediaSource -- ^ 
  , pinCreateParentUnderscorepinUnderscoreid :: Maybe Text -- ^ The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
  , pinCreateNote :: Maybe Text -- ^ Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
  } deriving (Show, Eq, Generic)

instance FromJSON PinCreate where
  parseJSON = genericParseJSON optionsPinCreate
instance ToJSON PinCreate where
  toJSON = genericToJSON optionsPinCreate

optionsPinCreate :: Options
optionsPinCreate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinCreateId", "id")
      , ("pinCreateCreatedUnderscoreat", "created_at")
      , ("pinCreateLink", "link")
      , ("pinCreateTitle", "title")
      , ("pinCreateDescription", "description")
      , ("pinCreateDominantUnderscorecolor", "dominant_color")
      , ("pinCreateAltUnderscoretext", "alt_text")
      , ("pinCreateBoardUnderscoreid", "board_id")
      , ("pinCreateBoardUnderscoresectionUnderscoreid", "board_section_id")
      , ("pinCreateBoardUnderscoreowner", "board_owner")
      , ("pinCreateMedia", "media")
      , ("pinCreateMediaUnderscoresource", "media_source")
      , ("pinCreateParentUnderscorepinUnderscoreid", "parent_pin_id")
      , ("pinCreateNote", "note")
      ]


-- | Pin media objects.
data PinMedia = PinMedia
  { pinMediaMediaUnderscoretype :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PinMedia where
  parseJSON = genericParseJSON optionsPinMedia
instance ToJSON PinMedia where
  toJSON = genericToJSON optionsPinMedia

optionsPinMedia :: Options
optionsPinMedia =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinMediaMediaUnderscoretype", "media_type")
      ]


-- | 
data PinMediaMetadata = PinMediaMetadata
  { pinMediaMetadataItemUnderscoretype :: Maybe Text -- ^ 
  , pinMediaMetadataTitle :: Maybe Text -- ^ 
  , pinMediaMetadataDescription :: Maybe Text -- ^ 
  , pinMediaMetadataLink :: Maybe Text -- ^ 
  , pinMediaMetadataImages :: Maybe ImageMetadataImages -- ^ 
  , pinMediaMetadataCoverUnderscoreimageUnderscoreurl :: Maybe Text -- ^ 
  , pinMediaMetadataVideoUnderscoreurl :: Maybe Text -- ^ Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
  , pinMediaMetadataDuration :: Maybe Double -- ^ Duration (in milliseconds)
  , pinMediaMetadataHeight :: Maybe Int -- ^ Height (in pixels)
  , pinMediaMetadataWidth :: Maybe Int -- ^ Width (in pixels)
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaMetadata where
  parseJSON = genericParseJSON optionsPinMediaMetadata
instance ToJSON PinMediaMetadata where
  toJSON = genericToJSON optionsPinMediaMetadata

optionsPinMediaMetadata :: Options
optionsPinMediaMetadata =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinMediaMetadataItemUnderscoretype", "item_type")
      , ("pinMediaMetadataTitle", "title")
      , ("pinMediaMetadataDescription", "description")
      , ("pinMediaMetadataLink", "link")
      , ("pinMediaMetadataImages", "images")
      , ("pinMediaMetadataCoverUnderscoreimageUnderscoreurl", "cover_image_url")
      , ("pinMediaMetadataVideoUnderscoreurl", "video_url")
      , ("pinMediaMetadataDuration", "duration")
      , ("pinMediaMetadataHeight", "height")
      , ("pinMediaMetadataWidth", "width")
      ]


-- | Pin media source.
data PinMediaSource = PinMediaSource
  { pinMediaSourceSourceUnderscoretype :: Text -- ^ 
  , pinMediaSourceContentUnderscoretype :: Text -- ^ 
  , pinMediaSourceData :: Text -- ^ 
  , pinMediaSourceIsUnderscorestandard :: Maybe Bool -- ^ Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  , pinMediaSourceUrl :: Text -- ^ 
  , pinMediaSourceCoverUnderscoreimageUnderscoreurl :: Maybe Text -- ^ Cover image url.
  , pinMediaSourceCoverUnderscoreimageUnderscorecontentUnderscoretype :: Maybe Text -- ^ Content type for cover image Base64.
  , pinMediaSourceCoverUnderscoreimageUnderscoredata :: Maybe Text -- ^ Cover image Base64.
  , pinMediaSourceMediaUnderscoreid :: Text -- ^ 
  , pinMediaSourceItems :: [PinMediaSourceImagesURLItemsInner] -- ^ Array with image objects.
  , pinMediaSourceIndex :: Maybe Int -- ^ 
  , pinMediaSourceIsUnderscoreaffiliateUnderscorelink :: Maybe Bool -- ^ This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSource where
  parseJSON = genericParseJSON optionsPinMediaSource
instance ToJSON PinMediaSource where
  toJSON = genericToJSON optionsPinMediaSource

optionsPinMediaSource :: Options
optionsPinMediaSource =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinMediaSourceSourceUnderscoretype", "source_type")
      , ("pinMediaSourceContentUnderscoretype", "content_type")
      , ("pinMediaSourceData", "data")
      , ("pinMediaSourceIsUnderscorestandard", "is_standard")
      , ("pinMediaSourceUrl", "url")
      , ("pinMediaSourceCoverUnderscoreimageUnderscoreurl", "cover_image_url")
      , ("pinMediaSourceCoverUnderscoreimageUnderscorecontentUnderscoretype", "cover_image_content_type")
      , ("pinMediaSourceCoverUnderscoreimageUnderscoredata", "cover_image_data")
      , ("pinMediaSourceMediaUnderscoreid", "media_id")
      , ("pinMediaSourceItems", "items")
      , ("pinMediaSourceIndex", "index")
      , ("pinMediaSourceIsUnderscoreaffiliateUnderscorelink", "is_affiliate_link")
      ]


-- | Base64-encoded image media source
data PinMediaSourceImageBase64 = PinMediaSourceImageBase64
  { pinMediaSourceImageBase64SourceUnderscoretype :: Text -- ^ 
  , pinMediaSourceImageBase64ContentUnderscoretype :: Text -- ^ 
  , pinMediaSourceImageBase64Data :: Text -- ^ 
  , pinMediaSourceImageBase64IsUnderscorestandard :: Maybe Bool -- ^ Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSourceImageBase64 where
  parseJSON = genericParseJSON optionsPinMediaSourceImageBase64
instance ToJSON PinMediaSourceImageBase64 where
  toJSON = genericToJSON optionsPinMediaSourceImageBase64

optionsPinMediaSourceImageBase64 :: Options
optionsPinMediaSourceImageBase64 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinMediaSourceImageBase64SourceUnderscoretype", "source_type")
      , ("pinMediaSourceImageBase64ContentUnderscoretype", "content_type")
      , ("pinMediaSourceImageBase64Data", "data")
      , ("pinMediaSourceImageBase64IsUnderscorestandard", "is_standard")
      ]


-- | Image URL-based media source
data PinMediaSourceImageURL = PinMediaSourceImageURL
  { pinMediaSourceImageURLSourceUnderscoretype :: Text -- ^ 
  , pinMediaSourceImageURLUrl :: Text -- ^ 
  , pinMediaSourceImageURLIsUnderscorestandard :: Maybe Bool -- ^ Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSourceImageURL where
  parseJSON = genericParseJSON optionsPinMediaSourceImageURL
instance ToJSON PinMediaSourceImageURL where
  toJSON = genericToJSON optionsPinMediaSourceImageURL

optionsPinMediaSourceImageURL :: Options
optionsPinMediaSourceImageURL =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinMediaSourceImageURLSourceUnderscoretype", "source_type")
      , ("pinMediaSourceImageURLUrl", "url")
      , ("pinMediaSourceImageURLIsUnderscorestandard", "is_standard")
      ]


-- | Multiple Base64-encoded images media source
data PinMediaSourceImagesBase64 = PinMediaSourceImagesBase64
  { pinMediaSourceImagesBase64SourceUnderscoretype :: Maybe Text -- ^ 
  , pinMediaSourceImagesBase64Items :: [PinMediaSourceImagesBase64ItemsInner] -- ^ Array with image objects.
  , pinMediaSourceImagesBase64Index :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSourceImagesBase64 where
  parseJSON = genericParseJSON optionsPinMediaSourceImagesBase64
instance ToJSON PinMediaSourceImagesBase64 where
  toJSON = genericToJSON optionsPinMediaSourceImagesBase64

optionsPinMediaSourceImagesBase64 :: Options
optionsPinMediaSourceImagesBase64 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinMediaSourceImagesBase64SourceUnderscoretype", "source_type")
      , ("pinMediaSourceImagesBase64Items", "items")
      , ("pinMediaSourceImagesBase64Index", "index")
      ]


-- | 
data PinMediaSourceImagesBase64ItemsInner = PinMediaSourceImagesBase64ItemsInner
  { pinMediaSourceImagesBase64ItemsInnerTitle :: Maybe Text -- ^ 
  , pinMediaSourceImagesBase64ItemsInnerDescription :: Maybe Text -- ^ 
  , pinMediaSourceImagesBase64ItemsInnerLink :: Maybe Text -- ^ Destination link for the image.
  , pinMediaSourceImagesBase64ItemsInnerContentUnderscoretype :: Text -- ^ 
  , pinMediaSourceImagesBase64ItemsInnerData :: Text -- ^ Image to upload as base64 string.
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSourceImagesBase64ItemsInner where
  parseJSON = genericParseJSON optionsPinMediaSourceImagesBase64ItemsInner
instance ToJSON PinMediaSourceImagesBase64ItemsInner where
  toJSON = genericToJSON optionsPinMediaSourceImagesBase64ItemsInner

optionsPinMediaSourceImagesBase64ItemsInner :: Options
optionsPinMediaSourceImagesBase64ItemsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinMediaSourceImagesBase64ItemsInnerTitle", "title")
      , ("pinMediaSourceImagesBase64ItemsInnerDescription", "description")
      , ("pinMediaSourceImagesBase64ItemsInnerLink", "link")
      , ("pinMediaSourceImagesBase64ItemsInnerContentUnderscoretype", "content_type")
      , ("pinMediaSourceImagesBase64ItemsInnerData", "data")
      ]


-- | Multiple images urls-based media source
data PinMediaSourceImagesURL = PinMediaSourceImagesURL
  { pinMediaSourceImagesURLSourceUnderscoretype :: Maybe Text -- ^ 
  , pinMediaSourceImagesURLItems :: [PinMediaSourceImagesURLItemsInner] -- ^ Array with image objects.
  , pinMediaSourceImagesURLIndex :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSourceImagesURL where
  parseJSON = genericParseJSON optionsPinMediaSourceImagesURL
instance ToJSON PinMediaSourceImagesURL where
  toJSON = genericToJSON optionsPinMediaSourceImagesURL

optionsPinMediaSourceImagesURL :: Options
optionsPinMediaSourceImagesURL =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinMediaSourceImagesURLSourceUnderscoretype", "source_type")
      , ("pinMediaSourceImagesURLItems", "items")
      , ("pinMediaSourceImagesURLIndex", "index")
      ]


-- | 
data PinMediaSourceImagesURLItemsInner = PinMediaSourceImagesURLItemsInner
  { pinMediaSourceImagesURLItemsInnerTitle :: Maybe Text -- ^ 
  , pinMediaSourceImagesURLItemsInnerDescription :: Maybe Text -- ^ 
  , pinMediaSourceImagesURLItemsInnerLink :: Maybe Text -- ^ Destination link for the image.
  , pinMediaSourceImagesURLItemsInnerUrl :: Text -- ^ URL of image to upload.
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSourceImagesURLItemsInner where
  parseJSON = genericParseJSON optionsPinMediaSourceImagesURLItemsInner
instance ToJSON PinMediaSourceImagesURLItemsInner where
  toJSON = genericToJSON optionsPinMediaSourceImagesURLItemsInner

optionsPinMediaSourceImagesURLItemsInner :: Options
optionsPinMediaSourceImagesURLItemsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinMediaSourceImagesURLItemsInnerTitle", "title")
      , ("pinMediaSourceImagesURLItemsInnerDescription", "description")
      , ("pinMediaSourceImagesURLItemsInnerLink", "link")
      , ("pinMediaSourceImagesURLItemsInnerUrl", "url")
      ]


-- | Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
data PinMediaSourcePinURL = PinMediaSourcePinURL
  { pinMediaSourcePinURLSourceUnderscoretype :: Text -- ^ 
  , pinMediaSourcePinURLIsUnderscoreaffiliateUnderscorelink :: Maybe Bool -- ^ This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSourcePinURL where
  parseJSON = genericParseJSON optionsPinMediaSourcePinURL
instance ToJSON PinMediaSourcePinURL where
  toJSON = genericToJSON optionsPinMediaSourcePinURL

optionsPinMediaSourcePinURL :: Options
optionsPinMediaSourcePinURL =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinMediaSourcePinURLSourceUnderscoretype", "source_type")
      , ("pinMediaSourcePinURLIsUnderscoreaffiliateUnderscorelink", "is_affiliate_link")
      ]


-- | Video ID-based media source
data PinMediaSourceVideoID = PinMediaSourceVideoID
  { pinMediaSourceVideoIDSourceUnderscoretype :: Text -- ^ 
  , pinMediaSourceVideoIDCoverUnderscoreimageUnderscoreurl :: Maybe Text -- ^ Cover image url.
  , pinMediaSourceVideoIDCoverUnderscoreimageUnderscorecontentUnderscoretype :: Maybe Text -- ^ Content type for cover image Base64.
  , pinMediaSourceVideoIDCoverUnderscoreimageUnderscoredata :: Maybe Text -- ^ Cover image Base64.
  , pinMediaSourceVideoIDMediaUnderscoreid :: Text -- ^ 
  , pinMediaSourceVideoIDIsUnderscorestandard :: Maybe Bool -- ^ Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSourceVideoID where
  parseJSON = genericParseJSON optionsPinMediaSourceVideoID
instance ToJSON PinMediaSourceVideoID where
  toJSON = genericToJSON optionsPinMediaSourceVideoID

optionsPinMediaSourceVideoID :: Options
optionsPinMediaSourceVideoID =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinMediaSourceVideoIDSourceUnderscoretype", "source_type")
      , ("pinMediaSourceVideoIDCoverUnderscoreimageUnderscoreurl", "cover_image_url")
      , ("pinMediaSourceVideoIDCoverUnderscoreimageUnderscorecontentUnderscoretype", "cover_image_content_type")
      , ("pinMediaSourceVideoIDCoverUnderscoreimageUnderscoredata", "cover_image_data")
      , ("pinMediaSourceVideoIDMediaUnderscoreid", "media_id")
      , ("pinMediaSourceVideoIDIsUnderscorestandard", "is_standard")
      ]


-- | Pin with image.
newtype PinMediaWithImage = PinMediaWithImage { unPinMediaWithImage :: PinMedia }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | Pin with a mix of images and videos.
newtype PinMediaWithImageAndVideo = PinMediaWithImageAndVideo { unPinMediaWithImageAndVideo :: PinMedia }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | Pin with multiple images.
newtype PinMediaWithImages = PinMediaWithImages { unPinMediaWithImages :: PinMedia }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | Pin with video.
newtype PinMediaWithVideo = PinMediaWithVideo { unPinMediaWithVideo :: PinMedia }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | Pin with multiple videos.
newtype PinMediaWithVideos = PinMediaWithVideos { unPinMediaWithVideos :: PinMedia }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | Summary status for pin promotions
data PinPromotionSummaryStatus = PinPromotionSummaryStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PinPromotionSummaryStatus where
  parseJSON = genericParseJSON optionsPinPromotionSummaryStatus
instance ToJSON PinPromotionSummaryStatus where
  toJSON = genericToJSON optionsPinPromotionSummaryStatus

optionsPinPromotionSummaryStatus :: Options
optionsPinPromotionSummaryStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Pin fields for updates
data PinUpdate = PinUpdate
  { pinUpdateAltUnderscoretext :: Maybe Text -- ^ Pin's alternative text.
  , pinUpdateBoardUnderscoreid :: Maybe Text -- ^ The id of the board to move the Pin onto.
  , pinUpdateBoardUnderscoresectionUnderscoreid :: Maybe Text -- ^ <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
  , pinUpdateDescription :: Maybe Text -- ^ Pin description - 800 characters maximum.
  , pinUpdateLink :: Maybe Text -- ^ URL viewer is taken to when they click pin.
  , pinUpdateTitle :: Maybe Text -- ^ The native pin title that creators explicitly prefer to display.
  , pinUpdateCarouselUnderscoreslots :: Maybe [PinUpdateCarouselSlotsInner] -- ^ Carousel Pin slots data.
  , pinUpdateNote :: Maybe Text -- ^ Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
  } deriving (Show, Eq, Generic)

instance FromJSON PinUpdate where
  parseJSON = genericParseJSON optionsPinUpdate
instance ToJSON PinUpdate where
  toJSON = genericToJSON optionsPinUpdate

optionsPinUpdate :: Options
optionsPinUpdate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinUpdateAltUnderscoretext", "alt_text")
      , ("pinUpdateBoardUnderscoreid", "board_id")
      , ("pinUpdateBoardUnderscoresectionUnderscoreid", "board_section_id")
      , ("pinUpdateDescription", "description")
      , ("pinUpdateLink", "link")
      , ("pinUpdateTitle", "title")
      , ("pinUpdateCarouselUnderscoreslots", "carousel_slots")
      , ("pinUpdateNote", "note")
      ]


-- | 
data PinUpdateCarouselSlotsInner = PinUpdateCarouselSlotsInner
  { pinUpdateCarouselSlotsInnerTitle :: Maybe Text -- ^ Carousel Pin slot title.
  , pinUpdateCarouselSlotsInnerDescription :: Maybe Text -- ^ Carousel Pin slot description.
  , pinUpdateCarouselSlotsInnerLink :: Maybe Text -- ^ Carousel Pin slot link.
  } deriving (Show, Eq, Generic)

instance FromJSON PinUpdateCarouselSlotsInner where
  parseJSON = genericParseJSON optionsPinUpdateCarouselSlotsInner
instance ToJSON PinUpdateCarouselSlotsInner where
  toJSON = genericToJSON optionsPinUpdateCarouselSlotsInner

optionsPinUpdateCarouselSlotsInner :: Options
optionsPinUpdateCarouselSlotsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinUpdateCarouselSlotsInnerTitle", "title")
      , ("pinUpdateCarouselSlotsInnerDescription", "description")
      , ("pinUpdateCarouselSlotsInnerLink", "link")
      ]


-- | 
data PinsAnalyticsMetricTypesParameterInner = PinsAnalyticsMetricTypesParameterInner
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PinsAnalyticsMetricTypesParameterInner where
  parseJSON = genericParseJSON optionsPinsAnalyticsMetricTypesParameterInner
instance ToJSON PinsAnalyticsMetricTypesParameterInner where
  toJSON = genericToJSON optionsPinsAnalyticsMetricTypesParameterInner

optionsPinsAnalyticsMetricTypesParameterInner :: Options
optionsPinsAnalyticsMetricTypesParameterInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data PinsList200Response = PinsList200Response
  { pinsList200ResponseItems :: [Pin] -- ^ 
  , pinsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PinsList200Response where
  parseJSON = genericParseJSON optionsPinsList200Response
instance ToJSON PinsList200Response where
  toJSON = genericToJSON optionsPinsList200Response

optionsPinsList200Response :: Options
optionsPinsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinsList200ResponseItems", "items")
      , ("pinsList200ResponseBookmark", "bookmark")
      ]


-- | 
data PinsSaveRequest = PinsSaveRequest
  { pinsSaveRequestBoardUnderscoreid :: Maybe Text -- ^ Unique identifier of the board to which the pin will be saved.
  , pinsSaveRequestBoardUnderscoresectionUnderscoreid :: Maybe Text -- ^ Unique identifier of the board section to which the pin will be saved.
  } deriving (Show, Eq, Generic)

instance FromJSON PinsSaveRequest where
  parseJSON = genericParseJSON optionsPinsSaveRequest
instance ToJSON PinsSaveRequest where
  toJSON = genericToJSON optionsPinsSaveRequest

optionsPinsSaveRequest :: Options
optionsPinsSaveRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinsSaveRequestBoardUnderscoreid", "board_id")
      , ("pinsSaveRequestBoardUnderscoresectionUnderscoreid", "board_section_id")
      ]


-- | Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
data PinterestTagEventData = PinterestTagEventData
  { pinterestTagEventDataCurrency :: Maybe Currency -- ^ 
  , pinterestTagEventDataLeadUnderscoretype :: Maybe Text -- ^ Promotion code. For example, \"Newsletter\".
  , pinterestTagEventDataLineUnderscoreitems :: Maybe LineItem -- ^ 
  , pinterestTagEventDataOrderUnderscoreid :: Maybe Text -- ^ Order ID. For example, \"X-151481\".
  , pinterestTagEventDataOrderUnderscorequantity :: Maybe Int -- ^ Order quantity. For example, 1.
  , pinterestTagEventDataPageUnderscorename :: Maybe Text -- ^ Page name. For example, \"Our Favorite Pins on Pinterest\".
  , pinterestTagEventDataPromoUnderscorecode :: Maybe Text -- ^ Promotion code. For example, \"WINTER10\".
  , pinterestTagEventDataProperty :: Maybe Text -- ^ Property. For example, \"Athleta\".
  , pinterestTagEventDataSearchUnderscorequery :: Maybe Text -- ^ Search query string. For example, \"boots\".
  , pinterestTagEventDataValue :: Maybe Text -- ^ Product value. For example, \"199.98\"
  , pinterestTagEventDataVideoUnderscoretitle :: Maybe Text -- ^ Video title. For example, \"How to style your Parker Boots\".
  } deriving (Show, Eq, Generic)

instance FromJSON PinterestTagEventData where
  parseJSON = genericParseJSON optionsPinterestTagEventData
instance ToJSON PinterestTagEventData where
  toJSON = genericToJSON optionsPinterestTagEventData

optionsPinterestTagEventData :: Options
optionsPinterestTagEventData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pinterestTagEventDataCurrency", "currency")
      , ("pinterestTagEventDataLeadUnderscoretype", "lead_type")
      , ("pinterestTagEventDataLineUnderscoreitems", "line_items")
      , ("pinterestTagEventDataOrderUnderscoreid", "order_id")
      , ("pinterestTagEventDataOrderUnderscorequantity", "order_quantity")
      , ("pinterestTagEventDataPageUnderscorename", "page_name")
      , ("pinterestTagEventDataPromoUnderscorecode", "promo_code")
      , ("pinterestTagEventDataProperty", "property")
      , ("pinterestTagEventDataSearchUnderscorequery", "search_query")
      , ("pinterestTagEventDataValue", "value")
      , ("pinterestTagEventDataVideoUnderscoretitle", "video_title")
      ]


-- | Campaign placement group type
data PlacementGroupType = PlacementGroupType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PlacementGroupType where
  parseJSON = genericParseJSON optionsPlacementGroupType
instance ToJSON PlacementGroupType where
  toJSON = genericToJSON optionsPlacementGroupType

optionsPlacementGroupType :: Options
optionsPlacementGroupType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data PriceFilter = PriceFilter
  { priceFilterPRICE :: CatalogsProductGroupPricingCurrencyCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PriceFilter where
  parseJSON = genericParseJSON optionsPriceFilter
instance ToJSON PriceFilter where
  toJSON = genericToJSON optionsPriceFilter

optionsPriceFilter :: Options
optionsPriceFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("priceFilterPRICE", "PRICE")
      ]


-- | Default availability for products in a feed.
data ProductAvailabilityType = ProductAvailabilityType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductAvailabilityType where
  parseJSON = genericParseJSON optionsProductAvailabilityType
instance ToJSON ProductAvailabilityType where
  toJSON = genericToJSON optionsProductAvailabilityType

optionsProductAvailabilityType :: Options
optionsProductAvailabilityType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
newtype ProductGroupAnalyticsResponseInner = ProductGroupAnalyticsResponseInner { unProductGroupAnalyticsResponseInner :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data ProductGroupPromotion = ProductGroupPromotion
  { productGroupPromotionId :: Maybe Text -- ^ ID of the product group promotion.
  , productGroupPromotionAdUnderscoregroupUnderscoreid :: Maybe Text -- ^ ID of the ad group the product group belongs to.
  , productGroupPromotionBidUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ The bid in micro currency.
  , productGroupPromotionIncluded :: Maybe Bool -- ^ True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
  , productGroupPromotionDefinition :: Maybe Text -- ^ The full product group definition path
  , productGroupPromotionRelativeUnderscoredefinition :: Maybe Text -- ^ The definition of the product group, relative to its parent - an attribute name/value pair
  , productGroupPromotionParentUnderscoreid :: Maybe Text -- ^ The parent Product Group ID of this Product Group
  , productGroupPromotionSlideshowUnderscorecollectionsUnderscoretitle :: Maybe Text -- ^ Slideshow Collections Title
  , productGroupPromotionSlideshowUnderscorecollectionsUnderscoredescription :: Maybe Text -- ^ Slideshow Collections Description
  , productGroupPromotionIsUnderscoremdl :: Maybe Bool -- ^ If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
  , productGroupPromotionStatus :: Maybe EntityStatus -- ^ 
  , productGroupPromotionTrackingUnderscoreurl :: Maybe Text -- ^ Tracking template for proudct group promotions. 4000 limit
  , productGroupPromotionCatalogUnderscoreproductUnderscoregroupUnderscoreid :: Maybe Text -- ^ ID of the catalogs product group that this product group promotion references
  , productGroupPromotionCatalogUnderscoreproductUnderscoregroupUnderscorename :: Maybe Text -- ^ Catalogs product group name
  , productGroupPromotionCreativeUnderscoretype :: Maybe CreativeType -- ^ 
  , productGroupPromotionCollectionsUnderscoreheroUnderscorepinUnderscoreid :: Maybe Text -- ^ Hero Pin ID if this PG is promoted as a Collection
  , productGroupPromotionCollectionsUnderscoreheroUnderscoredestinationUnderscoreurl :: Maybe Text -- ^ Collections Hero Destination Url
  , productGroupPromotionGridUnderscoreclickUnderscoretype :: Maybe GridClickType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductGroupPromotion where
  parseJSON = genericParseJSON optionsProductGroupPromotion
instance ToJSON ProductGroupPromotion where
  toJSON = genericToJSON optionsProductGroupPromotion

optionsProductGroupPromotion :: Options
optionsProductGroupPromotion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("productGroupPromotionId", "id")
      , ("productGroupPromotionAdUnderscoregroupUnderscoreid", "ad_group_id")
      , ("productGroupPromotionBidUnderscoreinUnderscoremicroUnderscorecurrency", "bid_in_micro_currency")
      , ("productGroupPromotionIncluded", "included")
      , ("productGroupPromotionDefinition", "definition")
      , ("productGroupPromotionRelativeUnderscoredefinition", "relative_definition")
      , ("productGroupPromotionParentUnderscoreid", "parent_id")
      , ("productGroupPromotionSlideshowUnderscorecollectionsUnderscoretitle", "slideshow_collections_title")
      , ("productGroupPromotionSlideshowUnderscorecollectionsUnderscoredescription", "slideshow_collections_description")
      , ("productGroupPromotionIsUnderscoremdl", "is_mdl")
      , ("productGroupPromotionStatus", "status")
      , ("productGroupPromotionTrackingUnderscoreurl", "tracking_url")
      , ("productGroupPromotionCatalogUnderscoreproductUnderscoregroupUnderscoreid", "catalog_product_group_id")
      , ("productGroupPromotionCatalogUnderscoreproductUnderscoregroupUnderscorename", "catalog_product_group_name")
      , ("productGroupPromotionCreativeUnderscoretype", "creative_type")
      , ("productGroupPromotionCollectionsUnderscoreheroUnderscorepinUnderscoreid", "collections_hero_pin_id")
      , ("productGroupPromotionCollectionsUnderscoreheroUnderscoredestinationUnderscoreurl", "collections_hero_destination_url")
      , ("productGroupPromotionGridUnderscoreclickUnderscoretype", "grid_click_type")
      ]


-- | 
data ProductGroupPromotionCreateRequest = ProductGroupPromotionCreateRequest
  { productGroupPromotionCreateRequestAdUnderscoregroupUnderscoreid :: Text -- ^ ID of the Ad Group the Product Group Promotion belongs to.
  , productGroupPromotionCreateRequestProductUnderscoregroupUnderscorepromotion :: [ProductGroupPromotion] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductGroupPromotionCreateRequest where
  parseJSON = genericParseJSON optionsProductGroupPromotionCreateRequest
instance ToJSON ProductGroupPromotionCreateRequest where
  toJSON = genericToJSON optionsProductGroupPromotionCreateRequest

optionsProductGroupPromotionCreateRequest :: Options
optionsProductGroupPromotionCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("productGroupPromotionCreateRequestAdUnderscoregroupUnderscoreid", "ad_group_id")
      , ("productGroupPromotionCreateRequestProductUnderscoregroupUnderscorepromotion", "product_group_promotion")
      ]


-- | 
data ProductGroupPromotionResponse = ProductGroupPromotionResponse
  { productGroupPromotionResponseItems :: Maybe [ProductGroupPromotionResponseItem] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductGroupPromotionResponse where
  parseJSON = genericParseJSON optionsProductGroupPromotionResponse
instance ToJSON ProductGroupPromotionResponse where
  toJSON = genericToJSON optionsProductGroupPromotionResponse

optionsProductGroupPromotionResponse :: Options
optionsProductGroupPromotionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("productGroupPromotionResponseItems", "items")
      ]


-- | 
data ProductGroupPromotionResponseItem = ProductGroupPromotionResponseItem
  { productGroupPromotionResponseItemData :: Maybe ProductGroupPromotion -- ^ 
  , productGroupPromotionResponseItemExceptions :: Maybe [Exception] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductGroupPromotionResponseItem where
  parseJSON = genericParseJSON optionsProductGroupPromotionResponseItem
instance ToJSON ProductGroupPromotionResponseItem where
  toJSON = genericToJSON optionsProductGroupPromotionResponseItem

optionsProductGroupPromotionResponseItem :: Options
optionsProductGroupPromotionResponseItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("productGroupPromotionResponseItemData", "data")
      , ("productGroupPromotionResponseItemExceptions", "exceptions")
      ]


-- | 
data ProductGroupPromotionUpdateRequest = ProductGroupPromotionUpdateRequest
  { productGroupPromotionUpdateRequestAdUnderscoregroupUnderscoreid :: Text -- ^ ID of the ad group the product group belongs to.
  , productGroupPromotionUpdateRequestProductUnderscoregroupUnderscorepromotion :: [ProductGroupPromotion] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductGroupPromotionUpdateRequest where
  parseJSON = genericParseJSON optionsProductGroupPromotionUpdateRequest
instance ToJSON ProductGroupPromotionUpdateRequest where
  toJSON = genericToJSON optionsProductGroupPromotionUpdateRequest

optionsProductGroupPromotionUpdateRequest :: Options
optionsProductGroupPromotionUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("productGroupPromotionUpdateRequestAdUnderscoregroupUnderscoreid", "ad_group_id")
      , ("productGroupPromotionUpdateRequestProductUnderscoregroupUnderscorepromotion", "product_group_promotion")
      ]


-- | 
data ProductGroupPromotionsList200Response = ProductGroupPromotionsList200Response
  { productGroupPromotionsList200ResponseItems :: [ProductGroupPromotionResponseItem] -- ^ 
  , productGroupPromotionsList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductGroupPromotionsList200Response where
  parseJSON = genericParseJSON optionsProductGroupPromotionsList200Response
instance ToJSON ProductGroupPromotionsList200Response where
  toJSON = genericToJSON optionsProductGroupPromotionsList200Response

optionsProductGroupPromotionsList200Response :: Options
optionsProductGroupPromotionsList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("productGroupPromotionsList200ResponseItems", "items")
      , ("productGroupPromotionsList200ResponseBookmark", "bookmark")
      ]


-- | Summary status for product group
data ProductGroupSummaryStatus = ProductGroupSummaryStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductGroupSummaryStatus where
  parseJSON = genericParseJSON optionsProductGroupSummaryStatus
instance ToJSON ProductGroupSummaryStatus where
  toJSON = genericToJSON optionsProductGroupSummaryStatus

optionsProductGroupSummaryStatus :: Options
optionsProductGroupSummaryStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data ProductType0Filter = ProductType0Filter
  { productType0FilterPRODUCTUnderscoreTYPEUnderscore0 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductType0Filter where
  parseJSON = genericParseJSON optionsProductType0Filter
instance ToJSON ProductType0Filter where
  toJSON = genericToJSON optionsProductType0Filter

optionsProductType0Filter :: Options
optionsProductType0Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("productType0FilterPRODUCTUnderscoreTYPEUnderscore0", "PRODUCT_TYPE_0")
      ]


-- | 
data ProductType1Filter = ProductType1Filter
  { productType1FilterPRODUCTUnderscoreTYPEUnderscore1 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductType1Filter where
  parseJSON = genericParseJSON optionsProductType1Filter
instance ToJSON ProductType1Filter where
  toJSON = genericToJSON optionsProductType1Filter

optionsProductType1Filter :: Options
optionsProductType1Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("productType1FilterPRODUCTUnderscoreTYPEUnderscore1", "PRODUCT_TYPE_1")
      ]


-- | 
data ProductType2Filter = ProductType2Filter
  { productType2FilterPRODUCTUnderscoreTYPEUnderscore2 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductType2Filter where
  parseJSON = genericParseJSON optionsProductType2Filter
instance ToJSON ProductType2Filter where
  toJSON = genericToJSON optionsProductType2Filter

optionsProductType2Filter :: Options
optionsProductType2Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("productType2FilterPRODUCTUnderscoreTYPEUnderscore2", "PRODUCT_TYPE_2")
      ]


-- | 
data ProductType3Filter = ProductType3Filter
  { productType3FilterPRODUCTUnderscoreTYPEUnderscore3 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductType3Filter where
  parseJSON = genericParseJSON optionsProductType3Filter
instance ToJSON ProductType3Filter where
  toJSON = genericToJSON optionsProductType3Filter

optionsProductType3Filter :: Options
optionsProductType3Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("productType3FilterPRODUCTUnderscoreTYPEUnderscore3", "PRODUCT_TYPE_3")
      ]


-- | 
data ProductType4Filter = ProductType4Filter
  { productType4FilterPRODUCTUnderscoreTYPEUnderscore4 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductType4Filter where
  parseJSON = genericParseJSON optionsProductType4Filter
instance ToJSON ProductType4Filter where
  toJSON = genericToJSON optionsProductType4Filter

optionsProductType4Filter :: Options
optionsProductType4Filter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("productType4FilterPRODUCTUnderscoreTYPEUnderscore4", "PRODUCT_TYPE_4")
      ]


-- | This field includes all quiz data including questions, options, and results.
data QuizPinData = QuizPinData
  { quizPinDataQuestions :: Maybe [QuizPinQuestion] -- ^ 
  , quizPinDataResults :: Maybe [QuizPinResult] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON QuizPinData where
  parseJSON = genericParseJSON optionsQuizPinData
instance ToJSON QuizPinData where
  toJSON = genericToJSON optionsQuizPinData

optionsQuizPinData :: Options
optionsQuizPinData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("quizPinDataQuestions", "questions")
      , ("quizPinDataResults", "results")
      ]


-- |  This field contains multiple options to a quiz question.
data QuizPinOption = QuizPinOption
  { quizPinOptionId :: Maybe Double -- ^ 
  , quizPinOptionText :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON QuizPinOption where
  parseJSON = genericParseJSON optionsQuizPinOption
instance ToJSON QuizPinOption where
  toJSON = genericToJSON optionsQuizPinOption

optionsQuizPinOption :: Options
optionsQuizPinOption =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("quizPinOptionId", "id")
      , ("quizPinOptionText", "text")
      ]


-- | A specific quiz inquiry.
data QuizPinQuestion = QuizPinQuestion
  { quizPinQuestionQuestionUnderscoreid :: Maybe Double -- ^ 
  , quizPinQuestionQuestionUnderscoretext :: Maybe Text -- ^ 
  , quizPinQuestionOptions :: Maybe [QuizPinOption] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON QuizPinQuestion where
  parseJSON = genericParseJSON optionsQuizPinQuestion
instance ToJSON QuizPinQuestion where
  toJSON = genericToJSON optionsQuizPinQuestion

optionsQuizPinQuestion :: Options
optionsQuizPinQuestion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("quizPinQuestionQuestionUnderscoreid", "question_id")
      , ("quizPinQuestionQuestionUnderscoretext", "question_text")
      , ("quizPinQuestionOptions", "options")
      ]


-- | The result, and link out, based on the user’s choice.
data QuizPinResult = QuizPinResult
  { quizPinResultOrganicUnderscorepinUnderscoreid :: Maybe Text -- ^ 
  , quizPinResultAndroidUnderscoredeepUnderscorelink :: Maybe Text -- ^ 
  , quizPinResultIosUnderscoredeepUnderscorelink :: Maybe Text -- ^ 
  , quizPinResultDestinationUnderscoreurl :: Maybe Text -- ^ 
  , quizPinResultResultUnderscoreid :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON QuizPinResult where
  parseJSON = genericParseJSON optionsQuizPinResult
instance ToJSON QuizPinResult where
  toJSON = genericToJSON optionsQuizPinResult

optionsQuizPinResult :: Options
optionsQuizPinResult =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("quizPinResultOrganicUnderscorepinUnderscoreid", "organic_pin_id")
      , ("quizPinResultAndroidUnderscoredeepUnderscorelink", "android_deep_link")
      , ("quizPinResultIosUnderscoredeepUnderscorelink", "ios_deep_link")
      , ("quizPinResultDestinationUnderscoreurl", "destination_url")
      , ("quizPinResultResultUnderscoreid", "result_id")
      ]


-- | 
data RelatedTerms = RelatedTerms
  { relatedTermsId :: Maybe Text -- ^ First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
  , relatedTermsRelatedUnderscoretermUnderscorecount :: Maybe Int -- ^ Total number of related terms returned
  , relatedTermsRelatedUnderscoretermsUnderscorelist :: Maybe [RelatedTermsRelatedTermsListInner] -- ^ The id of the advertiser.
  } deriving (Show, Eq, Generic)

instance FromJSON RelatedTerms where
  parseJSON = genericParseJSON optionsRelatedTerms
instance ToJSON RelatedTerms where
  toJSON = genericToJSON optionsRelatedTerms

optionsRelatedTerms :: Options
optionsRelatedTerms =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("relatedTermsId", "id")
      , ("relatedTermsRelatedUnderscoretermUnderscorecount", "related_term_count")
      , ("relatedTermsRelatedUnderscoretermsUnderscorelist", "related_terms_list")
      ]


-- | 
data RelatedTermsRelatedTermsListInner = RelatedTermsRelatedTermsListInner
  { relatedTermsRelatedTermsListInnerTerm :: Maybe Text -- ^ 
  , relatedTermsRelatedTermsListInnerRelatedUnderscoreterms :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RelatedTermsRelatedTermsListInner where
  parseJSON = genericParseJSON optionsRelatedTermsRelatedTermsListInner
instance ToJSON RelatedTermsRelatedTermsListInner where
  toJSON = genericToJSON optionsRelatedTermsRelatedTermsListInner

optionsRelatedTermsRelatedTermsListInner :: Options
optionsRelatedTermsRelatedTermsListInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("relatedTermsRelatedTermsListInnerTerm", "term")
      , ("relatedTermsRelatedTermsListInnerRelatedUnderscoreterms", "related_terms")
      ]


-- | Reporting columns
data ReportingColumnAsync = ReportingColumnAsync
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReportingColumnAsync where
  parseJSON = genericParseJSON optionsReportingColumnAsync
instance ToJSON ReportingColumnAsync where
  toJSON = genericToJSON optionsReportingColumnAsync

optionsReportingColumnAsync :: Options
optionsReportingColumnAsync =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | An internal role type used on business access, EMPLOYEE, ADMIN.
data Role = Role
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON Role where
  parseJSON = genericParseJSON optionsRole
instance ToJSON Role where
  toJSON = genericToJSON optionsRole

optionsRole :: Options
optionsRole =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data SSIOAccountAddress = SSIOAccountAddress
  { sSIOAccountAddressDisplay :: Maybe Text -- ^ Address display
  , sSIOAccountAddressPurpose :: Maybe Text -- ^ Purpose for which the address is used, usually Billing or Businness
  , sSIOAccountAddressAddressUnderscoreid :: Maybe Text -- ^ Salesforce id for address
  , sSIOAccountAddressOrderUnderscorelegalUnderscoreentity :: Maybe Text -- ^ Legal entity for this insertion order
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOAccountAddress where
  parseJSON = genericParseJSON optionsSSIOAccountAddress
instance ToJSON SSIOAccountAddress where
  toJSON = genericToJSON optionsSSIOAccountAddress

optionsSSIOAccountAddress :: Options
optionsSSIOAccountAddress =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOAccountAddressDisplay", "display")
      , ("sSIOAccountAddressPurpose", "purpose")
      , ("sSIOAccountAddressAddressUnderscoreid", "address_id")
      , ("sSIOAccountAddressOrderUnderscorelegalUnderscoreentity", "order_legal_entity")
      ]


-- | 
data SSIOAccountItem = SSIOAccountItem
  { sSIOAccountItemId :: Maybe Text -- ^ Salesforce id for billto_info
  , sSIOAccountItemIoUnderscoretermsUnderscoreid :: Maybe Text -- ^ Salesforce id for IO Terms and Conditions
  , sSIOAccountItemIoUnderscoreterms :: Maybe Text -- ^ Salesforce text for IO Terms and Conditions
  , sSIOAccountItemUsUnderscoretermsUnderscoreid :: Maybe Text -- ^ Salesforce id for US Terms and Conditions
  , sSIOAccountItemUsUnderscoreterms :: Maybe Text -- ^ Salesforce text for US Terms and Conditions
  , sSIOAccountItemRowUnderscoretermsUnderscoreid :: Maybe Text -- ^ Salesforce id for Rest of the World Terms and Conditions
  , sSIOAccountItemRowUnderscoreterms :: Maybe Text -- ^ Salesforce text for Rest of the World Terms and Conditions
  , sSIOAccountItemIoUnderscoretype :: Maybe Text -- ^ Insertion Order Type - Pinterest Paper or Agency Paper
  , sSIOAccountItemAddresses :: Maybe [SSIOAccountAddress] -- ^ Address information that is associated with this account.
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOAccountItem where
  parseJSON = genericParseJSON optionsSSIOAccountItem
instance ToJSON SSIOAccountItem where
  toJSON = genericToJSON optionsSSIOAccountItem

optionsSSIOAccountItem :: Options
optionsSSIOAccountItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOAccountItemId", "id")
      , ("sSIOAccountItemIoUnderscoretermsUnderscoreid", "io_terms_id")
      , ("sSIOAccountItemIoUnderscoreterms", "io_terms")
      , ("sSIOAccountItemUsUnderscoretermsUnderscoreid", "us_terms_id")
      , ("sSIOAccountItemUsUnderscoreterms", "us_terms")
      , ("sSIOAccountItemRowUnderscoretermsUnderscoreid", "row_terms_id")
      , ("sSIOAccountItemRowUnderscoreterms", "row_terms")
      , ("sSIOAccountItemIoUnderscoretype", "io_type")
      , ("sSIOAccountItemAddresses", "addresses")
      ]


-- | 
data SSIOAccountPMPName = SSIOAccountPMPName
  { sSIOAccountPMPNameName :: Maybe Text -- ^ Display name
  , sSIOAccountPMPNameId :: Maybe Text -- ^ Salesforce id for PMP
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOAccountPMPName where
  parseJSON = genericParseJSON optionsSSIOAccountPMPName
instance ToJSON SSIOAccountPMPName where
  toJSON = genericToJSON optionsSSIOAccountPMPName

optionsSSIOAccountPMPName :: Options
optionsSSIOAccountPMPName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOAccountPMPNameName", "name")
      , ("sSIOAccountPMPNameId", "id")
      ]


-- | 
data SSIOAccountResponse = SSIOAccountResponse
  { sSIOAccountResponseEligible :: Maybe Bool -- ^ Advertiser eligible to create order lines
  , sSIOAccountResponseCanUnderscoreedit :: Maybe Bool -- ^ Advertiser eligible to update order lines
  , sSIOAccountResponseBilltoUnderscoreinfos :: Maybe [SSIOAccountItem] -- ^ An array of Salesforce account information that includes address, io terms, etc.
  , sSIOAccountResponseCurrency :: Maybe Text -- ^ 
  , sSIOAccountResponsePmpUnderscorenames :: Maybe [SSIOAccountPMPName] -- ^ 
  , sSIOAccountResponseError :: Maybe Text -- ^ Error indicator from Salesforce which could be \"No Error\"
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOAccountResponse where
  parseJSON = genericParseJSON optionsSSIOAccountResponse
instance ToJSON SSIOAccountResponse where
  toJSON = genericToJSON optionsSSIOAccountResponse

optionsSSIOAccountResponse :: Options
optionsSSIOAccountResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOAccountResponseEligible", "eligible")
      , ("sSIOAccountResponseCanUnderscoreedit", "can_edit")
      , ("sSIOAccountResponseBilltoUnderscoreinfos", "billto_infos")
      , ("sSIOAccountResponseCurrency", "currency")
      , ("sSIOAccountResponsePmpUnderscorenames", "pmp_names")
      , ("sSIOAccountResponseError", "error")
      ]


-- | 
data SSIOCreateInsertionOrderRequest = SSIOCreateInsertionOrderRequest
  { sSIOCreateInsertionOrderRequestStartUnderscoredate :: Text -- ^ Starting date of time period. Format: YYYY-MM-DD
  , sSIOCreateInsertionOrderRequestEndUnderscoredate :: Maybe Text -- ^ End date of time period. Format: YYYY-MM-DD
  , sSIOCreateInsertionOrderRequestPoUnderscorenumber :: Text -- ^ The po number
  , sSIOCreateInsertionOrderRequestBudgetUnderscoreamount :: Maybe Double -- ^ If Budget order line, the budget amount.
  , sSIOCreateInsertionOrderRequestBillingUnderscorecontactUnderscorefirstname :: Text -- ^ The billing contact first name
  , sSIOCreateInsertionOrderRequestBillingUnderscorecontactUnderscorelastname :: Text -- ^ The billing contact last name
  , sSIOCreateInsertionOrderRequestBillingUnderscorecontactUnderscoreemail :: Text -- ^ The billing contact email
  , sSIOCreateInsertionOrderRequestMediaUnderscorecontactUnderscorefirstname :: Text -- ^ The media contact first name
  , sSIOCreateInsertionOrderRequestMediaUnderscorecontactUnderscorelastname :: Text -- ^ The media contact last name
  , sSIOCreateInsertionOrderRequestMediaUnderscorecontactUnderscoreemail :: Text -- ^ The media contact email
  , sSIOCreateInsertionOrderRequestAgencyUnderscorelink :: Maybe Text -- ^ URL link for agency
  , sSIOCreateInsertionOrderRequestUserUnderscoreemail :: Maybe Text -- ^ The email of user submitting the insertion order
  , sSIOCreateInsertionOrderRequestAcceptedUnderscoretermsUnderscoretime :: Maybe Int -- ^ The UTC timestamp (to the nearest sec) of when terms were accepted
  , sSIOCreateInsertionOrderRequestPmpUnderscoreid :: Text -- ^ The pmp id
  , sSIOCreateInsertionOrderRequestOrderUnderscorename :: Text -- ^ The order name
  , sSIOCreateInsertionOrderRequestOrderUnderscorelineUnderscoretype :: Text -- ^ Type can be Budget or Perpetual
  , sSIOCreateInsertionOrderRequestAcceptedUnderscoretermsUnderscoreid :: Text -- ^ The SFDC id for the terms
  , sSIOCreateInsertionOrderRequestBilltoUnderscorecompanyUnderscoreid :: Text -- ^ The bill-to company id
  , sSIOCreateInsertionOrderRequestBilltoUnderscorebusinessUnderscoreaddressUnderscoreid :: Text -- ^ The bill-to business address id
  , sSIOCreateInsertionOrderRequestBilltoUnderscorebillingUnderscoreaddressUnderscoreid :: Text -- ^ The bill-to billing address id
  , sSIOCreateInsertionOrderRequestEstimatedUnderscoremonthlyUnderscorespend :: Maybe Double -- ^ If Ongoing (perpetual) order line, the estimated monthly spend
  , sSIOCreateInsertionOrderRequestCurrencyUnderscoreinfo :: Currency -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOCreateInsertionOrderRequest where
  parseJSON = genericParseJSON optionsSSIOCreateInsertionOrderRequest
instance ToJSON SSIOCreateInsertionOrderRequest where
  toJSON = genericToJSON optionsSSIOCreateInsertionOrderRequest

optionsSSIOCreateInsertionOrderRequest :: Options
optionsSSIOCreateInsertionOrderRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOCreateInsertionOrderRequestStartUnderscoredate", "start_date")
      , ("sSIOCreateInsertionOrderRequestEndUnderscoredate", "end_date")
      , ("sSIOCreateInsertionOrderRequestPoUnderscorenumber", "po_number")
      , ("sSIOCreateInsertionOrderRequestBudgetUnderscoreamount", "budget_amount")
      , ("sSIOCreateInsertionOrderRequestBillingUnderscorecontactUnderscorefirstname", "billing_contact_firstname")
      , ("sSIOCreateInsertionOrderRequestBillingUnderscorecontactUnderscorelastname", "billing_contact_lastname")
      , ("sSIOCreateInsertionOrderRequestBillingUnderscorecontactUnderscoreemail", "billing_contact_email")
      , ("sSIOCreateInsertionOrderRequestMediaUnderscorecontactUnderscorefirstname", "media_contact_firstname")
      , ("sSIOCreateInsertionOrderRequestMediaUnderscorecontactUnderscorelastname", "media_contact_lastname")
      , ("sSIOCreateInsertionOrderRequestMediaUnderscorecontactUnderscoreemail", "media_contact_email")
      , ("sSIOCreateInsertionOrderRequestAgencyUnderscorelink", "agency_link")
      , ("sSIOCreateInsertionOrderRequestUserUnderscoreemail", "user_email")
      , ("sSIOCreateInsertionOrderRequestAcceptedUnderscoretermsUnderscoretime", "accepted_terms_time")
      , ("sSIOCreateInsertionOrderRequestPmpUnderscoreid", "pmp_id")
      , ("sSIOCreateInsertionOrderRequestOrderUnderscorename", "order_name")
      , ("sSIOCreateInsertionOrderRequestOrderUnderscorelineUnderscoretype", "order_line_type")
      , ("sSIOCreateInsertionOrderRequestAcceptedUnderscoretermsUnderscoreid", "accepted_terms_id")
      , ("sSIOCreateInsertionOrderRequestBilltoUnderscorecompanyUnderscoreid", "billto_company_id")
      , ("sSIOCreateInsertionOrderRequestBilltoUnderscorebusinessUnderscoreaddressUnderscoreid", "billto_business_address_id")
      , ("sSIOCreateInsertionOrderRequestBilltoUnderscorebillingUnderscoreaddressUnderscoreid", "billto_billing_address_id")
      , ("sSIOCreateInsertionOrderRequestEstimatedUnderscoremonthlyUnderscorespend", "estimated_monthly_spend")
      , ("sSIOCreateInsertionOrderRequestCurrencyUnderscoreinfo", "currency_info")
      ]


-- | 
data SSIOCreateInsertionOrderResponse = SSIOCreateInsertionOrderResponse
  { sSIOCreateInsertionOrderResponsePinUnderscoreorderUnderscoreid :: Maybe Text -- ^ Salesforce order id
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOCreateInsertionOrderResponse where
  parseJSON = genericParseJSON optionsSSIOCreateInsertionOrderResponse
instance ToJSON SSIOCreateInsertionOrderResponse where
  toJSON = genericToJSON optionsSSIOCreateInsertionOrderResponse

optionsSSIOCreateInsertionOrderResponse :: Options
optionsSSIOCreateInsertionOrderResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOCreateInsertionOrderResponsePinUnderscoreorderUnderscoreid", "pin_order_id")
      ]


-- | 
data SSIOEditInsertionOrderRequest = SSIOEditInsertionOrderRequest
  { sSIOEditInsertionOrderRequestStartUnderscoredate :: Maybe Text -- ^ Starting date of time period. Format: YYYY-MM-DD
  , sSIOEditInsertionOrderRequestEndUnderscoredate :: Maybe Text -- ^ End date of time period. Format: YYYY-MM-DD
  , sSIOEditInsertionOrderRequestPoUnderscorenumber :: Maybe Text -- ^ The po number
  , sSIOEditInsertionOrderRequestBudgetUnderscoreamount :: Maybe Double -- ^ If Budget order line, the budget amount.
  , sSIOEditInsertionOrderRequestBillingUnderscorecontactUnderscorefirstname :: Maybe Text -- ^ The billing contact first name
  , sSIOEditInsertionOrderRequestBillingUnderscorecontactUnderscorelastname :: Maybe Text -- ^ The billing contact last name
  , sSIOEditInsertionOrderRequestBillingUnderscorecontactUnderscoreemail :: Maybe Text -- ^ The billing contact email
  , sSIOEditInsertionOrderRequestMediaUnderscorecontactUnderscorefirstname :: Maybe Text -- ^ The media contact first name
  , sSIOEditInsertionOrderRequestMediaUnderscorecontactUnderscorelastname :: Maybe Text -- ^ The media contact last name
  , sSIOEditInsertionOrderRequestMediaUnderscorecontactUnderscoreemail :: Maybe Text -- ^ The media contact email
  , sSIOEditInsertionOrderRequestAgencyUnderscorelink :: Maybe Text -- ^ URL link for agency
  , sSIOEditInsertionOrderRequestUserUnderscoreemail :: Maybe Text -- ^ The email of user submitting the insertion order
  , sSIOEditInsertionOrderRequestOracleUnderscorelineUnderscoreid :: Maybe Text -- ^ LineId in the Oracle DB
  , sSIOEditInsertionOrderRequestSalesforceUnderscoreorderUnderscoreid :: Maybe Text -- ^ OrderId in SFDC
  , sSIOEditInsertionOrderRequestSalesforceUnderscoreorderUnderscorelineUnderscoreid :: Maybe Text -- ^ OrderLineId in SFDC
  , sSIOEditInsertionOrderRequestAdsUnderscoremanagerUnderscoreorderUnderscorelineUnderscoreid :: Maybe Text -- ^ Ads manager OrderLineId
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOEditInsertionOrderRequest where
  parseJSON = genericParseJSON optionsSSIOEditInsertionOrderRequest
instance ToJSON SSIOEditInsertionOrderRequest where
  toJSON = genericToJSON optionsSSIOEditInsertionOrderRequest

optionsSSIOEditInsertionOrderRequest :: Options
optionsSSIOEditInsertionOrderRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOEditInsertionOrderRequestStartUnderscoredate", "start_date")
      , ("sSIOEditInsertionOrderRequestEndUnderscoredate", "end_date")
      , ("sSIOEditInsertionOrderRequestPoUnderscorenumber", "po_number")
      , ("sSIOEditInsertionOrderRequestBudgetUnderscoreamount", "budget_amount")
      , ("sSIOEditInsertionOrderRequestBillingUnderscorecontactUnderscorefirstname", "billing_contact_firstname")
      , ("sSIOEditInsertionOrderRequestBillingUnderscorecontactUnderscorelastname", "billing_contact_lastname")
      , ("sSIOEditInsertionOrderRequestBillingUnderscorecontactUnderscoreemail", "billing_contact_email")
      , ("sSIOEditInsertionOrderRequestMediaUnderscorecontactUnderscorefirstname", "media_contact_firstname")
      , ("sSIOEditInsertionOrderRequestMediaUnderscorecontactUnderscorelastname", "media_contact_lastname")
      , ("sSIOEditInsertionOrderRequestMediaUnderscorecontactUnderscoreemail", "media_contact_email")
      , ("sSIOEditInsertionOrderRequestAgencyUnderscorelink", "agency_link")
      , ("sSIOEditInsertionOrderRequestUserUnderscoreemail", "user_email")
      , ("sSIOEditInsertionOrderRequestOracleUnderscorelineUnderscoreid", "oracle_line_id")
      , ("sSIOEditInsertionOrderRequestSalesforceUnderscoreorderUnderscoreid", "salesforce_order_id")
      , ("sSIOEditInsertionOrderRequestSalesforceUnderscoreorderUnderscorelineUnderscoreid", "salesforce_order_line_id")
      , ("sSIOEditInsertionOrderRequestAdsUnderscoremanagerUnderscoreorderUnderscorelineUnderscoreid", "ads_manager_order_line_id")
      ]


-- | 
data SSIOEditInsertionOrderResponse = SSIOEditInsertionOrderResponse
  { sSIOEditInsertionOrderResponsePinUnderscoreorderUnderscoreid :: Maybe Text -- ^ Salesforce order id
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOEditInsertionOrderResponse where
  parseJSON = genericParseJSON optionsSSIOEditInsertionOrderResponse
instance ToJSON SSIOEditInsertionOrderResponse where
  toJSON = genericToJSON optionsSSIOEditInsertionOrderResponse

optionsSSIOEditInsertionOrderResponse :: Options
optionsSSIOEditInsertionOrderResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOEditInsertionOrderResponsePinUnderscoreorderUnderscoreid", "pin_order_id")
      ]


-- | 
data SSIOInsertionOrderCommon = SSIOInsertionOrderCommon
  { sSIOInsertionOrderCommonStartUnderscoredate :: Maybe Text -- ^ Starting date of time period. Format: YYYY-MM-DD
  , sSIOInsertionOrderCommonEndUnderscoredate :: Maybe Text -- ^ End date of time period. Format: YYYY-MM-DD
  , sSIOInsertionOrderCommonPoUnderscorenumber :: Maybe Text -- ^ The po number
  , sSIOInsertionOrderCommonBudgetUnderscoreamount :: Maybe Double -- ^ If Budget order line, the budget amount.
  , sSIOInsertionOrderCommonBillingUnderscorecontactUnderscorefirstname :: Maybe Text -- ^ The billing contact first name
  , sSIOInsertionOrderCommonBillingUnderscorecontactUnderscorelastname :: Maybe Text -- ^ The billing contact last name
  , sSIOInsertionOrderCommonBillingUnderscorecontactUnderscoreemail :: Maybe Text -- ^ The billing contact email
  , sSIOInsertionOrderCommonMediaUnderscorecontactUnderscorefirstname :: Maybe Text -- ^ The media contact first name
  , sSIOInsertionOrderCommonMediaUnderscorecontactUnderscorelastname :: Maybe Text -- ^ The media contact last name
  , sSIOInsertionOrderCommonMediaUnderscorecontactUnderscoreemail :: Maybe Text -- ^ The media contact email
  , sSIOInsertionOrderCommonAgencyUnderscorelink :: Maybe Text -- ^ URL link for agency
  , sSIOInsertionOrderCommonUserUnderscoreemail :: Maybe Text -- ^ The email of user submitting the insertion order
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOInsertionOrderCommon where
  parseJSON = genericParseJSON optionsSSIOInsertionOrderCommon
instance ToJSON SSIOInsertionOrderCommon where
  toJSON = genericToJSON optionsSSIOInsertionOrderCommon

optionsSSIOInsertionOrderCommon :: Options
optionsSSIOInsertionOrderCommon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOInsertionOrderCommonStartUnderscoredate", "start_date")
      , ("sSIOInsertionOrderCommonEndUnderscoredate", "end_date")
      , ("sSIOInsertionOrderCommonPoUnderscorenumber", "po_number")
      , ("sSIOInsertionOrderCommonBudgetUnderscoreamount", "budget_amount")
      , ("sSIOInsertionOrderCommonBillingUnderscorecontactUnderscorefirstname", "billing_contact_firstname")
      , ("sSIOInsertionOrderCommonBillingUnderscorecontactUnderscorelastname", "billing_contact_lastname")
      , ("sSIOInsertionOrderCommonBillingUnderscorecontactUnderscoreemail", "billing_contact_email")
      , ("sSIOInsertionOrderCommonMediaUnderscorecontactUnderscorefirstname", "media_contact_firstname")
      , ("sSIOInsertionOrderCommonMediaUnderscorecontactUnderscorelastname", "media_contact_lastname")
      , ("sSIOInsertionOrderCommonMediaUnderscorecontactUnderscoreemail", "media_contact_email")
      , ("sSIOInsertionOrderCommonAgencyUnderscorelink", "agency_link")
      , ("sSIOInsertionOrderCommonUserUnderscoreemail", "user_email")
      ]


-- | 
data SSIOInsertionOrderStatus = SSIOInsertionOrderStatus
  { sSIOInsertionOrderStatusPinUnderscoreorderUnderscoreid :: Maybe Text -- ^ Salesforce order id
  , sSIOInsertionOrderStatusStatus :: Maybe Text -- ^ Salesforce insertion order status
  , sSIOInsertionOrderStatusCreationUnderscoretime :: Maybe Text -- ^ Salesforce insertion order creation time
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOInsertionOrderStatus where
  parseJSON = genericParseJSON optionsSSIOInsertionOrderStatus
instance ToJSON SSIOInsertionOrderStatus where
  toJSON = genericToJSON optionsSSIOInsertionOrderStatus

optionsSSIOInsertionOrderStatus :: Options
optionsSSIOInsertionOrderStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOInsertionOrderStatusPinUnderscoreorderUnderscoreid", "pin_order_id")
      , ("sSIOInsertionOrderStatusStatus", "status")
      , ("sSIOInsertionOrderStatusCreationUnderscoretime", "creation_time")
      ]


-- | 
data SSIOInsertionOrderStatusResponse = SSIOInsertionOrderStatusResponse
  { sSIOInsertionOrderStatusResponsePinUnderscoreorderUnderscoreid :: Maybe Text -- ^ Salesforce order id
  , sSIOInsertionOrderStatusResponseStatus :: Maybe Text -- ^ Salesforce insertion order status
  , sSIOInsertionOrderStatusResponseCreationUnderscoretime :: Maybe Text -- ^ Salesforce insertion order creation time
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOInsertionOrderStatusResponse where
  parseJSON = genericParseJSON optionsSSIOInsertionOrderStatusResponse
instance ToJSON SSIOInsertionOrderStatusResponse where
  toJSON = genericToJSON optionsSSIOInsertionOrderStatusResponse

optionsSSIOInsertionOrderStatusResponse :: Options
optionsSSIOInsertionOrderStatusResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOInsertionOrderStatusResponsePinUnderscoreorderUnderscoreid", "pin_order_id")
      , ("sSIOInsertionOrderStatusResponseStatus", "status")
      , ("sSIOInsertionOrderStatusResponseCreationUnderscoretime", "creation_time")
      ]


-- | 
data SSIOOrderLine = SSIOOrderLine
  { sSIOOrderLineSalesforceUnderscoreorderUnderscorelineUnderscoreid :: Maybe Text -- ^ OrderLineId in SFDC
  , sSIOOrderLineAdsUnderscoremanagerUnderscoreorderUnderscorelineUnderscoreid :: Maybe Text -- ^ Ads manager OrderLineId
  , sSIOOrderLinePinUnderscoreorderUnderscoreid :: Maybe Text -- ^ The pin order id associated with the order line in SFDC
  , sSIOOrderLineLastUnderscoremodifiedUnderscoredateUnderscoretime :: Maybe Text -- ^ Last modified date.
  , sSIOOrderLineStartUnderscoredate :: Maybe Day -- ^ Start date of the order line.
  , sSIOOrderLineEndUnderscoredate :: Maybe Day -- ^ End date of the order line.
  , sSIOOrderLineBillUnderscoretoUnderscorecompanyUnderscorename :: Maybe Text -- ^ Bill To Company name
  , sSIOOrderLineBillingUnderscorecontactUnderscorefirstname :: Maybe Text -- ^ Billing contact first name
  , sSIOOrderLineBillingUnderscorecontactUnderscorelastname :: Maybe Text -- ^ Billing contact last name
  , sSIOOrderLineBillingUnderscorecontactUnderscoreemail :: Maybe Text -- ^ Billing contact email
  , sSIOOrderLineMediaUnderscorecontactUnderscoreemail :: Maybe Text -- ^ Billing media email
  , sSIOOrderLineMediaUnderscorecontactUnderscorefirstname :: Maybe Text -- ^ Billing contact first name
  , sSIOOrderLineMediaUnderscorecontactUnderscorelastname :: Maybe Text -- ^ Billing contact first name
  , sSIOOrderLineCurrencyUnderscoreinfo :: Maybe Currency -- ^ 
  , sSIOOrderLineAgencyUnderscorelink :: Maybe Text -- ^ Agency link
  , sSIOOrderLinePoUnderscorenumber :: Maybe Text -- ^ The po number
  , sSIOOrderLineOrderUnderscorename :: Maybe Text -- ^ The order name
  , sSIOOrderLinePmpUnderscorename :: Maybe Text -- ^ The Pinterest marketing partner name
  , sSIOOrderLineAcceptedUnderscoretermsUnderscoreid :: Maybe Text -- ^ The SFDC id for the terms
  , sSIOOrderLineAcceptedUnderscoretermsUnderscoretime :: Maybe Text -- ^ The UTC timestamp (to the nearest sec) of when terms were accepted
  , sSIOOrderLineBudgetUnderscoreamount :: Maybe Double -- ^ If Budget order line, the budget amount.
  , sSIOOrderLineEstimatedUnderscoremonthlyUnderscorespend :: Maybe Double -- ^ If Ongoing (perpetual) order line, the estimated monthly spend
  } deriving (Show, Eq, Generic)

instance FromJSON SSIOOrderLine where
  parseJSON = genericParseJSON optionsSSIOOrderLine
instance ToJSON SSIOOrderLine where
  toJSON = genericToJSON optionsSSIOOrderLine

optionsSSIOOrderLine :: Options
optionsSSIOOrderLine =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sSIOOrderLineSalesforceUnderscoreorderUnderscorelineUnderscoreid", "salesforce_order_line_id")
      , ("sSIOOrderLineAdsUnderscoremanagerUnderscoreorderUnderscorelineUnderscoreid", "ads_manager_order_line_id")
      , ("sSIOOrderLinePinUnderscoreorderUnderscoreid", "pin_order_id")
      , ("sSIOOrderLineLastUnderscoremodifiedUnderscoredateUnderscoretime", "last_modified_date_time")
      , ("sSIOOrderLineStartUnderscoredate", "start_date")
      , ("sSIOOrderLineEndUnderscoredate", "end_date")
      , ("sSIOOrderLineBillUnderscoretoUnderscorecompanyUnderscorename", "bill_to_company_name")
      , ("sSIOOrderLineBillingUnderscorecontactUnderscorefirstname", "billing_contact_firstname")
      , ("sSIOOrderLineBillingUnderscorecontactUnderscorelastname", "billing_contact_lastname")
      , ("sSIOOrderLineBillingUnderscorecontactUnderscoreemail", "billing_contact_email")
      , ("sSIOOrderLineMediaUnderscorecontactUnderscoreemail", "media_contact_email")
      , ("sSIOOrderLineMediaUnderscorecontactUnderscorefirstname", "media_contact_firstname")
      , ("sSIOOrderLineMediaUnderscorecontactUnderscorelastname", "media_contact_lastname")
      , ("sSIOOrderLineCurrencyUnderscoreinfo", "currency_info")
      , ("sSIOOrderLineAgencyUnderscorelink", "agency_link")
      , ("sSIOOrderLinePoUnderscorenumber", "po_number")
      , ("sSIOOrderLineOrderUnderscorename", "order_name")
      , ("sSIOOrderLinePmpUnderscorename", "pmp_name")
      , ("sSIOOrderLineAcceptedUnderscoretermsUnderscoreid", "accepted_terms_id")
      , ("sSIOOrderLineAcceptedUnderscoretermsUnderscoretime", "accepted_terms_time")
      , ("sSIOOrderLineBudgetUnderscoreamount", "budget_amount")
      , ("sSIOOrderLineEstimatedUnderscoremonthlyUnderscorespend", "estimated_monthly_spend")
      ]


-- | 
data SearchPartnerPins200Response = SearchPartnerPins200Response
  { searchPartnerPins200ResponseItems :: [SummaryPin] -- ^ 
  , searchPartnerPins200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SearchPartnerPins200Response where
  parseJSON = genericParseJSON optionsSearchPartnerPins200Response
instance ToJSON SearchPartnerPins200Response where
  toJSON = genericToJSON optionsSearchPartnerPins200Response

optionsSearchPartnerPins200Response :: Options
optionsSearchPartnerPins200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("searchPartnerPins200ResponseItems", "items")
      , ("searchPartnerPins200ResponseBookmark", "bookmark")
      ]


-- | 
data SearchUserBoardsGet200Response = SearchUserBoardsGet200Response
  { searchUserBoardsGet200ResponseItems :: [Board] -- ^ items
  , searchUserBoardsGet200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SearchUserBoardsGet200Response where
  parseJSON = genericParseJSON optionsSearchUserBoardsGet200Response
instance ToJSON SearchUserBoardsGet200Response where
  toJSON = genericToJSON optionsSearchUserBoardsGet200Response

optionsSearchUserBoardsGet200Response :: Options
optionsSearchUserBoardsGet200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("searchUserBoardsGet200ResponseItems", "items")
      , ("searchUserBoardsGet200ResponseBookmark", "bookmark")
      ]


-- | 
data SingleInterestTargetingOptionResponse = SingleInterestTargetingOptionResponse
  { singleInterestTargetingOptionResponseId :: Maybe Text -- ^ 
  , singleInterestTargetingOptionResponseName :: Maybe Text -- ^ 
  , singleInterestTargetingOptionResponseChildUnderscoreinterests :: Maybe [Text] -- ^ 
  , singleInterestTargetingOptionResponseLevel :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SingleInterestTargetingOptionResponse where
  parseJSON = genericParseJSON optionsSingleInterestTargetingOptionResponse
instance ToJSON SingleInterestTargetingOptionResponse where
  toJSON = genericToJSON optionsSingleInterestTargetingOptionResponse

optionsSingleInterestTargetingOptionResponse :: Options
optionsSingleInterestTargetingOptionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("singleInterestTargetingOptionResponseId", "id")
      , ("singleInterestTargetingOptionResponseName", "name")
      , ("singleInterestTargetingOptionResponseChildUnderscoreinterests", "child_interests")
      , ("singleInterestTargetingOptionResponseLevel", "level")
      ]


-- | 
data SsioInsertionOrdersStatusGetByAdAccount200Response = SsioInsertionOrdersStatusGetByAdAccount200Response
  { ssioInsertionOrdersStatusGetByAdAccount200ResponseItems :: [SSIOInsertionOrderStatus] -- ^ Insertion orders status by ad acount id
  , ssioInsertionOrdersStatusGetByAdAccount200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SsioInsertionOrdersStatusGetByAdAccount200Response where
  parseJSON = genericParseJSON optionsSsioInsertionOrdersStatusGetByAdAccount200Response
instance ToJSON SsioInsertionOrdersStatusGetByAdAccount200Response where
  toJSON = genericToJSON optionsSsioInsertionOrdersStatusGetByAdAccount200Response

optionsSsioInsertionOrdersStatusGetByAdAccount200Response :: Options
optionsSsioInsertionOrdersStatusGetByAdAccount200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ssioInsertionOrdersStatusGetByAdAccount200ResponseItems", "items")
      , ("ssioInsertionOrdersStatusGetByAdAccount200ResponseBookmark", "bookmark")
      ]


-- | 
data SsioOrderLinesGetByAdAccount200Response = SsioOrderLinesGetByAdAccount200Response
  { ssioOrderLinesGetByAdAccount200ResponseItems :: [SSIOOrderLine] -- ^ SSIO order lines by ad acount id
  , ssioOrderLinesGetByAdAccount200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SsioOrderLinesGetByAdAccount200Response where
  parseJSON = genericParseJSON optionsSsioOrderLinesGetByAdAccount200Response
instance ToJSON SsioOrderLinesGetByAdAccount200Response where
  toJSON = genericToJSON optionsSsioOrderLinesGetByAdAccount200Response

optionsSsioOrderLinesGetByAdAccount200Response :: Options
optionsSsioOrderLinesGetByAdAccount200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ssioOrderLinesGetByAdAccount200ResponseItems", "items")
      , ("ssioOrderLinesGetByAdAccount200ResponseBookmark", "bookmark")
      ]


-- | Summarized pin information
data SummaryPin = SummaryPin
  { summaryPinMedia :: Maybe SummaryPinMedia -- ^ 
  , summaryPinAltUnderscoretext :: Maybe Text -- ^ 
  , summaryPinLink :: Maybe Text -- ^ 
  , summaryPinTitle :: Maybe Text -- ^ 
  , summaryPinDescription :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SummaryPin where
  parseJSON = genericParseJSON optionsSummaryPin
instance ToJSON SummaryPin where
  toJSON = genericToJSON optionsSummaryPin

optionsSummaryPin :: Options
optionsSummaryPin =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("summaryPinMedia", "media")
      , ("summaryPinAltUnderscoretext", "alt_text")
      , ("summaryPinLink", "link")
      , ("summaryPinTitle", "title")
      , ("summaryPinDescription", "description")
      ]


-- | 
newtype SummaryPinMedia = SummaryPinMedia { unSummaryPinMedia :: PinMedia }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | Advertiser&#39;s ISO two character country code.
data TargetingAdvertiserCountry = TargetingAdvertiserCountry
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON TargetingAdvertiserCountry where
  parseJSON = genericParseJSON optionsTargetingAdvertiserCountry
instance ToJSON TargetingAdvertiserCountry where
  toJSON = genericToJSON optionsTargetingAdvertiserCountry

optionsTargetingAdvertiserCountry :: Options
optionsTargetingAdvertiserCountry =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Ad group targeting specification defining the ad group target audience. For example, {\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}
data TargetingSpec = TargetingSpec
  { targetingSpecAGEUnderscoreBUCKET :: Maybe [Text] -- ^ Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
  , targetingSpecAPPTYPE :: Maybe [Text] -- ^ Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
  , targetingSpecAUDIENCEUnderscoreEXCLUDE :: Maybe [Text] -- ^ Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
  , targetingSpecAUDIENCEUnderscoreINCLUDEQuote :: Maybe [Text] -- ^ Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
  , targetingSpecGENDER :: Maybe [Text] -- ^ Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
  , targetingSpecGEO :: Maybe [Text] -- ^ Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.
  , targetingSpecINTEREST :: Maybe [Text] -- ^ Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
  , targetingSpecLOCALE :: Maybe [Text] -- ^ 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.
  , targetingSpecLOCATION :: Maybe [Text] -- ^ 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.
  , targetingSpecSHOPPINGUnderscoreRETARGETING :: Maybe [TargetingSpecSHOPPINGRETARGETING] -- ^ Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
  , targetingSpecTARGETINGUnderscoreSTRATEGY :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TargetingSpec where
  parseJSON = genericParseJSON optionsTargetingSpec
instance ToJSON TargetingSpec where
  toJSON = genericToJSON optionsTargetingSpec

optionsTargetingSpec :: Options
optionsTargetingSpec =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("targetingSpecAGEUnderscoreBUCKET", "AGE_BUCKET")
      , ("targetingSpecAPPTYPE", "APPTYPE")
      , ("targetingSpecAUDIENCEUnderscoreEXCLUDE", "AUDIENCE_EXCLUDE")
      , ("targetingSpecAUDIENCEUnderscoreINCLUDEQuote", "AUDIENCE_INCLUDE'")
      , ("targetingSpecGENDER", "GENDER")
      , ("targetingSpecGEO", "GEO")
      , ("targetingSpecINTEREST", "INTEREST")
      , ("targetingSpecLOCALE", "LOCALE")
      , ("targetingSpecLOCATION", "LOCATION")
      , ("targetingSpecSHOPPINGUnderscoreRETARGETING", "SHOPPING_RETARGETING")
      , ("targetingSpecTARGETINGUnderscoreSTRATEGY", "TARGETING_STRATEGY")
      ]


-- | 
data TargetingSpecSHOPPINGRETARGETING = TargetingSpecSHOPPINGRETARGETING
  { targetingSpecSHOPPINGRETARGETINGLookbackUnderscorewindow :: Maybe Int -- ^ Number of days ago to start lookback timeframe for dynamic retargeting
  , targetingSpecSHOPPINGRETARGETINGTagUnderscoretypes :: Maybe [Int] -- ^ Event types to target for dynamic retargeting
  , targetingSpecSHOPPINGRETARGETINGExclusionUnderscorewindow :: Maybe Int -- ^ Number of days ago to stop lookback timeframe for dynamic retargeting
  } deriving (Show, Eq, Generic)

instance FromJSON TargetingSpecSHOPPINGRETARGETING where
  parseJSON = genericParseJSON optionsTargetingSpecSHOPPINGRETARGETING
instance ToJSON TargetingSpecSHOPPINGRETARGETING where
  toJSON = genericToJSON optionsTargetingSpecSHOPPINGRETARGETING

optionsTargetingSpecSHOPPINGRETARGETING :: Options
optionsTargetingSpecSHOPPINGRETARGETING =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("targetingSpecSHOPPINGRETARGETINGLookbackUnderscorewindow", "lookback_window")
      , ("targetingSpecSHOPPINGRETARGETINGTagUnderscoretypes", "tag_types")
      , ("targetingSpecSHOPPINGRETARGETINGExclusionUnderscorewindow", "exclusion_window")
      ]


-- | 
data TargetingTypeFilter = TargetingTypeFilter
  { targetingTypeFilterTargetingUnderscoretypes :: Maybe [AdsAnalyticsTargetingType] -- ^ List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
  } deriving (Show, Eq, Generic)

instance FromJSON TargetingTypeFilter where
  parseJSON = genericParseJSON optionsTargetingTypeFilter
instance ToJSON TargetingTypeFilter where
  toJSON = genericToJSON optionsTargetingTypeFilter

optionsTargetingTypeFilter :: Options
optionsTargetingTypeFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("targetingTypeFilterTargetingUnderscoretypes", "targeting_types")
      ]


-- | Template fields
data TemplateResponse = TemplateResponse
  { templateResponseId :: Maybe Text -- ^ Template ID
  , templateResponseAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ ID of the Ad Account that owns the template
  , templateResponseAdUnderscoreaccountUnderscoreids :: Maybe [Text] -- ^ IDs of the Ad Accounts that have access to this template
  , templateResponseUserUnderscoreid :: Maybe Text -- ^ ID of the user who created the template
  , templateResponseName :: Maybe Text -- ^ Template Name
  , templateResponseReportUnderscorestartUnderscorerelativeUnderscoredaysUnderscoreinUnderscorepast :: Maybe Double -- ^ The number of days prior to the day the report will be delivered at which the report will start
  , templateResponseReportUnderscoreendUnderscorerelativeUnderscoredaysUnderscoreinUnderscorepast :: Maybe Double -- ^ The number of days prior to the day the report will be delivered at which the report will end
  , templateResponseDateUnderscorerange :: Maybe TemplateResponseDateRange -- ^ 
  , templateResponseReportUnderscorelevel :: Maybe MetricsReportingLevel -- ^ 
  , templateResponseReportUnderscoreformat :: Maybe DataOutputFormat -- ^ 
  , templateResponseColumns :: Maybe [Text] -- ^ A list of columns to be included in the report
  , templateResponseGranularity :: Maybe Granularity -- ^ 
  , templateResponseViewUnderscorewindowUnderscoredays :: Maybe Double -- ^ The length of the sliding window over which view conversions will be attributed
  , templateResponseClickUnderscorewindowUnderscoredays :: Maybe Double -- ^ The length of the sliding window over which click conversions will be attributed
  , templateResponseEngagementUnderscorewindowUnderscoredays :: Maybe Double -- ^ The length of the sliding window over which engagement conversions will be attributed
  , templateResponseConversionUnderscorereportUnderscoretimeUnderscoretype :: Maybe Text -- ^ Conversion report time type
  , templateResponseFiltersUnderscorejson :: Maybe Text -- ^ A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values
  , templateResponseIsUnderscoreownedUnderscorebyUnderscoreuser :: Maybe Bool -- ^ A boolean value that indicates if the user owns the template
  , templateResponseIsUnderscorescheduled :: Maybe Bool -- ^ A boolean value that indicates if this template has been used to create a scheduled report
  , templateResponseCreationUnderscoresource :: Maybe Text -- ^ The surface used to create this template
  , templateResponseIsUnderscoredeleted :: Maybe Bool -- ^ A boolean that indicates if the template has been deleted
  , templateResponseUpdatedUnderscoretime :: Maybe Double -- ^ Time of last update in seconds since Unix epoch
  , templateResponseCustomUnderscorecolumnUnderscoreids :: Maybe [Text] -- ^ A list of custom column IDs
  , templateResponseType :: Maybe Text -- ^ Reporting template type
  , templateResponseIngestionUnderscoresources :: Maybe [Text] -- ^ The filter on the conversion ingestion source method for conversion metrics
  } deriving (Show, Eq, Generic)

instance FromJSON TemplateResponse where
  parseJSON = genericParseJSON optionsTemplateResponse
instance ToJSON TemplateResponse where
  toJSON = genericToJSON optionsTemplateResponse

optionsTemplateResponse :: Options
optionsTemplateResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("templateResponseId", "id")
      , ("templateResponseAdUnderscoreaccountUnderscoreid", "ad_account_id")
      , ("templateResponseAdUnderscoreaccountUnderscoreids", "ad_account_ids")
      , ("templateResponseUserUnderscoreid", "user_id")
      , ("templateResponseName", "name")
      , ("templateResponseReportUnderscorestartUnderscorerelativeUnderscoredaysUnderscoreinUnderscorepast", "report_start_relative_days_in_past")
      , ("templateResponseReportUnderscoreendUnderscorerelativeUnderscoredaysUnderscoreinUnderscorepast", "report_end_relative_days_in_past")
      , ("templateResponseDateUnderscorerange", "date_range")
      , ("templateResponseReportUnderscorelevel", "report_level")
      , ("templateResponseReportUnderscoreformat", "report_format")
      , ("templateResponseColumns", "columns")
      , ("templateResponseGranularity", "granularity")
      , ("templateResponseViewUnderscorewindowUnderscoredays", "view_window_days")
      , ("templateResponseClickUnderscorewindowUnderscoredays", "click_window_days")
      , ("templateResponseEngagementUnderscorewindowUnderscoredays", "engagement_window_days")
      , ("templateResponseConversionUnderscorereportUnderscoretimeUnderscoretype", "conversion_report_time_type")
      , ("templateResponseFiltersUnderscorejson", "filters_json")
      , ("templateResponseIsUnderscoreownedUnderscorebyUnderscoreuser", "is_owned_by_user")
      , ("templateResponseIsUnderscorescheduled", "is_scheduled")
      , ("templateResponseCreationUnderscoresource", "creation_source")
      , ("templateResponseIsUnderscoredeleted", "is_deleted")
      , ("templateResponseUpdatedUnderscoretime", "updated_time")
      , ("templateResponseCustomUnderscorecolumnUnderscoreids", "custom_column_ids")
      , ("templateResponseType", "type")
      , ("templateResponseIngestionUnderscoresources", "ingestion_sources")
      ]


-- | 
data TemplateResponseDateRange = TemplateResponseDateRange
  { templateResponseDateRangeDynamicUnderscoredateUnderscorerange :: Maybe TemplateResponseDateRangeDynamicDateRange -- ^ 
  , templateResponseDateRangeRelativeUnderscoredateUnderscorerange :: Maybe TemplateResponseDateRangeRelativeDateRange -- ^ 
  , templateResponseDateRangeAbsoluteUnderscoredateUnderscorerange :: Maybe TemplateResponseDateRangeAbsoluteDateRange -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TemplateResponseDateRange where
  parseJSON = genericParseJSON optionsTemplateResponseDateRange
instance ToJSON TemplateResponseDateRange where
  toJSON = genericToJSON optionsTemplateResponseDateRange

optionsTemplateResponseDateRange :: Options
optionsTemplateResponseDateRange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("templateResponseDateRangeDynamicUnderscoredateUnderscorerange", "dynamic_date_range")
      , ("templateResponseDateRangeRelativeUnderscoredateUnderscorerange", "relative_date_range")
      , ("templateResponseDateRangeAbsoluteUnderscoredateUnderscorerange", "absolute_date_range")
      ]


-- | The absolute date range of the template
data TemplateResponseDateRangeAbsoluteDateRange = TemplateResponseDateRangeAbsoluteDateRange
  { templateResponseDateRangeAbsoluteDateRangeType :: Maybe Text -- ^ The date range type
  , templateResponseDateRangeAbsoluteDateRangeStartUnderscoredate :: Maybe Double -- ^ The start date of the date range
  , templateResponseDateRangeAbsoluteDateRangeEndUnderscoredate :: Maybe Double -- ^ The end date of the date range
  } deriving (Show, Eq, Generic)

instance FromJSON TemplateResponseDateRangeAbsoluteDateRange where
  parseJSON = genericParseJSON optionsTemplateResponseDateRangeAbsoluteDateRange
instance ToJSON TemplateResponseDateRangeAbsoluteDateRange where
  toJSON = genericToJSON optionsTemplateResponseDateRangeAbsoluteDateRange

optionsTemplateResponseDateRangeAbsoluteDateRange :: Options
optionsTemplateResponseDateRangeAbsoluteDateRange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("templateResponseDateRangeAbsoluteDateRangeType", "type")
      , ("templateResponseDateRangeAbsoluteDateRangeStartUnderscoredate", "start_date")
      , ("templateResponseDateRangeAbsoluteDateRangeEndUnderscoredate", "end_date")
      ]


-- | The dynamic date range of the template
data TemplateResponseDateRangeDynamicDateRange = TemplateResponseDateRangeDynamicDateRange
  { templateResponseDateRangeDynamicDateRangeType :: Maybe Text -- ^ The date range type
  , templateResponseDateRangeDynamicDateRangeRange :: Maybe Text -- ^ The dynamic range type
  } deriving (Show, Eq, Generic)

instance FromJSON TemplateResponseDateRangeDynamicDateRange where
  parseJSON = genericParseJSON optionsTemplateResponseDateRangeDynamicDateRange
instance ToJSON TemplateResponseDateRangeDynamicDateRange where
  toJSON = genericToJSON optionsTemplateResponseDateRangeDynamicDateRange

optionsTemplateResponseDateRangeDynamicDateRange :: Options
optionsTemplateResponseDateRangeDynamicDateRange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("templateResponseDateRangeDynamicDateRangeType", "type")
      , ("templateResponseDateRangeDynamicDateRangeRange", "range")
      ]


-- | The relative date range of the template
data TemplateResponseDateRangeRelativeDateRange = TemplateResponseDateRangeRelativeDateRange
  { templateResponseDateRangeRelativeDateRangeType :: Maybe Text -- ^ The date range type
  , templateResponseDateRangeRelativeDateRangeStartUnderscoredaysUnderscoreinUnderscorepast :: Maybe Double -- ^ The start date of the date range
  , templateResponseDateRangeRelativeDateRangeEndUnderscoredaysUnderscoreinUnderscorepast :: Maybe Double -- ^ The end date of the date range
  } deriving (Show, Eq, Generic)

instance FromJSON TemplateResponseDateRangeRelativeDateRange where
  parseJSON = genericParseJSON optionsTemplateResponseDateRangeRelativeDateRange
instance ToJSON TemplateResponseDateRangeRelativeDateRange where
  toJSON = genericToJSON optionsTemplateResponseDateRangeRelativeDateRange

optionsTemplateResponseDateRangeRelativeDateRange :: Options
optionsTemplateResponseDateRangeRelativeDateRange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("templateResponseDateRangeRelativeDateRangeType", "type")
      , ("templateResponseDateRangeRelativeDateRangeStartUnderscoredaysUnderscoreinUnderscorepast", "start_days_in_past")
      , ("templateResponseDateRangeRelativeDateRangeEndUnderscoredaysUnderscoreinUnderscorepast", "end_days_in_past")
      ]


-- | 
data TemplatesList200Response = TemplatesList200Response
  { templatesList200ResponseItems :: [TemplateResponse] -- ^ 
  , templatesList200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TemplatesList200Response where
  parseJSON = genericParseJSON optionsTemplatesList200Response
instance ToJSON TemplatesList200Response where
  toJSON = genericToJSON optionsTemplatesList200Response

optionsTemplatesList200Response :: Options
optionsTemplatesList200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("templatesList200ResponseItems", "items")
      , ("templatesList200ResponseBookmark", "bookmark")
      ]


-- | 
data TermsOfService = TermsOfService
  { termsOfServiceId :: Maybe Text -- ^ The ID of the terms of service
  , termsOfServiceHtml :: Maybe Text -- ^ The terms of service content
  , termsOfServiceHasUnderscoreaccepted :: Maybe Bool -- ^ Whether the ad account has accepted terms of service.
  , termsOfServiceAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ The ID of the ad account.
  } deriving (Show, Eq, Generic)

instance FromJSON TermsOfService where
  parseJSON = genericParseJSON optionsTermsOfService
instance ToJSON TermsOfService where
  toJSON = genericToJSON optionsTermsOfService

optionsTermsOfService :: Options
optionsTermsOfService =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("termsOfServiceId", "id")
      , ("termsOfServiceHtml", "html")
      , ("termsOfServiceHasUnderscoreaccepted", "has_accepted")
      , ("termsOfServiceAdUnderscoreaccountUnderscoreid", "ad_account_id")
      ]


-- | 
data TopPinsAnalyticsResponse = TopPinsAnalyticsResponse
  { topPinsAnalyticsResponseDateUnderscoreavailability :: Maybe TopPinsAnalyticsResponseDateAvailability -- ^ 
  , topPinsAnalyticsResponsePins :: Maybe [TopPinsAnalyticsResponsePinsInner] -- ^ 
  , topPinsAnalyticsResponseSortUnderscoreby :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TopPinsAnalyticsResponse where
  parseJSON = genericParseJSON optionsTopPinsAnalyticsResponse
instance ToJSON TopPinsAnalyticsResponse where
  toJSON = genericToJSON optionsTopPinsAnalyticsResponse

optionsTopPinsAnalyticsResponse :: Options
optionsTopPinsAnalyticsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("topPinsAnalyticsResponseDateUnderscoreavailability", "date_availability")
      , ("topPinsAnalyticsResponsePins", "pins")
      , ("topPinsAnalyticsResponseSortUnderscoreby", "sort_by")
      ]


-- | 
data TopPinsAnalyticsResponseDateAvailability = TopPinsAnalyticsResponseDateAvailability
  { topPinsAnalyticsResponseDateAvailabilityLatestUnderscoreavailableUnderscoretimestamp :: Maybe Double -- ^ 
  , topPinsAnalyticsResponseDateAvailabilityIsUnderscorerealtime :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TopPinsAnalyticsResponseDateAvailability where
  parseJSON = genericParseJSON optionsTopPinsAnalyticsResponseDateAvailability
instance ToJSON TopPinsAnalyticsResponseDateAvailability where
  toJSON = genericToJSON optionsTopPinsAnalyticsResponseDateAvailability

optionsTopPinsAnalyticsResponseDateAvailability :: Options
optionsTopPinsAnalyticsResponseDateAvailability =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("topPinsAnalyticsResponseDateAvailabilityLatestUnderscoreavailableUnderscoretimestamp", "latest_available_timestamp")
      , ("topPinsAnalyticsResponseDateAvailabilityIsUnderscorerealtime", "is_realtime")
      ]


-- | Array with metrics, status, and pin id for the requested metric
data TopPinsAnalyticsResponsePinsInner = TopPinsAnalyticsResponsePinsInner
  { topPinsAnalyticsResponsePinsInnerMetrics :: Maybe (Map.Map String Double) -- ^ The metric name and daily value for each requested metric
  , topPinsAnalyticsResponsePinsInnerDataUnderscorestatus :: Maybe (Map.Map String DataStatus) -- ^ 
  , topPinsAnalyticsResponsePinsInnerPinUnderscoreid :: Maybe Text -- ^ The pin id
  } deriving (Show, Eq, Generic)

instance FromJSON TopPinsAnalyticsResponsePinsInner where
  parseJSON = genericParseJSON optionsTopPinsAnalyticsResponsePinsInner
instance ToJSON TopPinsAnalyticsResponsePinsInner where
  toJSON = genericToJSON optionsTopPinsAnalyticsResponsePinsInner

optionsTopPinsAnalyticsResponsePinsInner :: Options
optionsTopPinsAnalyticsResponsePinsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("topPinsAnalyticsResponsePinsInnerMetrics", "metrics")
      , ("topPinsAnalyticsResponsePinsInnerDataUnderscorestatus", "data_status")
      , ("topPinsAnalyticsResponsePinsInnerPinUnderscoreid", "pin_id")
      ]


-- | 
data TopVideoPinsAnalyticsResponse = TopVideoPinsAnalyticsResponse
  { topVideoPinsAnalyticsResponseDateUnderscoreavailability :: Maybe TopPinsAnalyticsResponseDateAvailability -- ^ 
  , topVideoPinsAnalyticsResponsePins :: Maybe [TopVideoPinsAnalyticsResponsePinsInner] -- ^ 
  , topVideoPinsAnalyticsResponseSortUnderscoreby :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TopVideoPinsAnalyticsResponse where
  parseJSON = genericParseJSON optionsTopVideoPinsAnalyticsResponse
instance ToJSON TopVideoPinsAnalyticsResponse where
  toJSON = genericToJSON optionsTopVideoPinsAnalyticsResponse

optionsTopVideoPinsAnalyticsResponse :: Options
optionsTopVideoPinsAnalyticsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("topVideoPinsAnalyticsResponseDateUnderscoreavailability", "date_availability")
      , ("topVideoPinsAnalyticsResponsePins", "pins")
      , ("topVideoPinsAnalyticsResponseSortUnderscoreby", "sort_by")
      ]


-- | Array with metrics, status, and pin id for the requested metric
data TopVideoPinsAnalyticsResponsePinsInner = TopVideoPinsAnalyticsResponsePinsInner
  { topVideoPinsAnalyticsResponsePinsInnerMetrics :: Maybe (Map.Map String Double) -- ^ The metric name and daily value for each requested metric
  , topVideoPinsAnalyticsResponsePinsInnerDataUnderscorestatus :: Maybe (Map.Map String DataStatus) -- ^ 
  , topVideoPinsAnalyticsResponsePinsInnerPinUnderscoreid :: Maybe Text -- ^ The pin id
  } deriving (Show, Eq, Generic)

instance FromJSON TopVideoPinsAnalyticsResponsePinsInner where
  parseJSON = genericParseJSON optionsTopVideoPinsAnalyticsResponsePinsInner
instance ToJSON TopVideoPinsAnalyticsResponsePinsInner where
  toJSON = genericToJSON optionsTopVideoPinsAnalyticsResponsePinsInner

optionsTopVideoPinsAnalyticsResponsePinsInner :: Options
optionsTopVideoPinsAnalyticsResponsePinsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("topVideoPinsAnalyticsResponsePinsInnerMetrics", "metrics")
      , ("topVideoPinsAnalyticsResponsePinsInnerDataUnderscorestatus", "data_status")
      , ("topVideoPinsAnalyticsResponsePinsInnerPinUnderscoreid", "pin_id")
      ]


-- | Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
data TrackingUrls = TrackingUrls
  { trackingUrlsImpression :: Maybe [Text] -- ^ 
  , trackingUrlsClick :: Maybe [Text] -- ^ 
  , trackingUrlsEngagement :: Maybe [Text] -- ^ 
  , trackingUrlsBuyableUnderscorebutton :: Maybe [Text] -- ^ 
  , trackingUrlsAudienceUnderscoreverification :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TrackingUrls where
  parseJSON = genericParseJSON optionsTrackingUrls
instance ToJSON TrackingUrls where
  toJSON = genericToJSON optionsTrackingUrls

optionsTrackingUrls :: Options
optionsTrackingUrls =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("trackingUrlsImpression", "impression")
      , ("trackingUrlsClick", "click")
      , ("trackingUrlsEngagement", "engagement")
      , ("trackingUrlsBuyableUnderscorebutton", "buyable_button")
      , ("trackingUrlsAudienceUnderscoreverification", "audience_verification")
      ]


-- | 
data TrendType = TrendType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON TrendType where
  parseJSON = genericParseJSON optionsTrendType
instance ToJSON TrendType where
  toJSON = genericToJSON optionsTrendType

optionsTrendType :: Options
optionsTrendType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data TrendingKeywordsResponse = TrendingKeywordsResponse
  { trendingKeywordsResponseTrends :: Maybe [TrendingKeywordsResponseTrendsInner] -- ^ The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
  } deriving (Show, Eq, Generic)

instance FromJSON TrendingKeywordsResponse where
  parseJSON = genericParseJSON optionsTrendingKeywordsResponse
instance ToJSON TrendingKeywordsResponse where
  toJSON = genericToJSON optionsTrendingKeywordsResponse

optionsTrendingKeywordsResponse :: Options
optionsTrendingKeywordsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("trendingKeywordsResponseTrends", "trends")
      ]


-- | 
data TrendingKeywordsResponseTrendsInner = TrendingKeywordsResponseTrendsInner
  { trendingKeywordsResponseTrendsInnerKeyword :: Maybe Text -- ^ The keyword that is trending.
  , trendingKeywordsResponseTrendsInnerPctUnderscoregrowthUnderscorewow :: Maybe Int -- ^ The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
  , trendingKeywordsResponseTrendsInnerPctUnderscoregrowthUnderscoremom :: Maybe Int -- ^ The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
  , trendingKeywordsResponseTrendsInnerPctUnderscoregrowthUnderscoreyoy :: Maybe Int -- ^ The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
  , trendingKeywordsResponseTrendsInnerTimeUnderscoreseries :: Maybe TrendingKeywordsResponseTrendsInnerTimeSeries -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TrendingKeywordsResponseTrendsInner where
  parseJSON = genericParseJSON optionsTrendingKeywordsResponseTrendsInner
instance ToJSON TrendingKeywordsResponseTrendsInner where
  toJSON = genericToJSON optionsTrendingKeywordsResponseTrendsInner

optionsTrendingKeywordsResponseTrendsInner :: Options
optionsTrendingKeywordsResponseTrendsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("trendingKeywordsResponseTrendsInnerKeyword", "keyword")
      , ("trendingKeywordsResponseTrendsInnerPctUnderscoregrowthUnderscorewow", "pct_growth_wow")
      , ("trendingKeywordsResponseTrendsInnerPctUnderscoregrowthUnderscoremom", "pct_growth_mom")
      , ("trendingKeywordsResponseTrendsInnerPctUnderscoregrowthUnderscoreyoy", "pct_growth_yoy")
      , ("trendingKeywordsResponseTrendsInnerTimeUnderscoreseries", "time_series")
      ]


-- | A sequence of weekly observations of the relative search volume for this keyword over the past year.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.
newtype TrendingKeywordsResponseTrendsInnerTimeSeries = TrendingKeywordsResponseTrendsInnerTimeSeries { unTrendingKeywordsResponseTrendsInnerTimeSeries :: (Map.Map Text Int) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data TrendsSupportedRegion = TrendsSupportedRegion
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON TrendsSupportedRegion where
  parseJSON = genericParseJSON optionsTrendsSupportedRegion
instance ToJSON TrendsSupportedRegion where
  toJSON = genericToJSON optionsTrendsSupportedRegion

optionsTrendsSupportedRegion :: Options
optionsTrendsSupportedRegion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data UpdatableItemAttributes = UpdatableItemAttributes
  { updatableItemAttributesAdUnderscorelink :: Maybe Text -- ^ Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
  , updatableItemAttributesAdult :: Maybe Bool -- ^ Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
  , updatableItemAttributesAgeUnderscoregroup :: Maybe Text -- ^ The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
  , updatableItemAttributesAvailability :: Maybe Text -- ^ The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
  , updatableItemAttributesAverageUnderscorereviewUnderscorerating :: Maybe Double -- ^ Average reviews for the item. Can be a number from 1-5.
  , updatableItemAttributesBrand :: Maybe Text -- ^ The brand of the product.
  , updatableItemAttributesCheckoutUnderscoreenabled :: Maybe Bool -- ^ This attribute is not supported anymore.
  , updatableItemAttributesColor :: Maybe Text -- ^ The primary color of the product.
  , updatableItemAttributesCondition :: Maybe Text -- ^ The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
  , updatableItemAttributesCustomUnderscorelabelUnderscore0 :: Maybe Text -- ^ <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  , updatableItemAttributesCustomUnderscorelabelUnderscore1 :: Maybe Text -- ^ <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  , updatableItemAttributesCustomUnderscorelabelUnderscore2 :: Maybe Text -- ^ <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  , updatableItemAttributesCustomUnderscorelabelUnderscore3 :: Maybe Text -- ^ <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  , updatableItemAttributesCustomUnderscorelabelUnderscore4 :: Maybe Text -- ^ <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  , updatableItemAttributesDescription :: Maybe Text -- ^ <p><= 10000 characters</p> <p>The description of the product.</p>
  , updatableItemAttributesFreeUnderscoreshippingUnderscorelabel :: Maybe Bool -- ^ The item is free to ship.
  , updatableItemAttributesFreeUnderscoreshippingUnderscorelimit :: Maybe Text -- ^ The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
  , updatableItemAttributesGender :: Maybe Text -- ^ The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
  , updatableItemAttributesGoogleUnderscoreproductUnderscorecategory :: Maybe Text -- ^ The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  , updatableItemAttributesGtin :: Maybe Int -- ^ The unique universal product identifier.
  , updatableItemAttributesId :: Maybe Text -- ^ <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
  , updatableItemAttributesItemUnderscoregroupUnderscoreid :: Maybe Text -- ^ <p><= 127 characters</p> <p>The parent ID of the product.</p>
  , updatableItemAttributesLastUnderscoreupdatedUnderscoretime :: Maybe Int64 -- ^ The millisecond timestamp when the item was lastly modified by the merchant.
  , updatableItemAttributesLink :: Maybe Text -- ^ <p><= 511 characters</p> <p>The landing page for the product.</p>
  , updatableItemAttributesMaterial :: Maybe Text -- ^ The material used to make the product.
  , updatableItemAttributesMinUnderscoreadUnderscoreprice :: Maybe Text -- ^ The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
  , updatableItemAttributesMobileUnderscorelink :: Maybe Text -- ^ The mobile-optimized version of your landing page. Must begin with http:// or https://.
  , updatableItemAttributesMpn :: Maybe Text -- ^ Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
  , updatableItemAttributesNumberUnderscoreofUnderscoreratings :: Maybe Int -- ^ The number of ratings for the item.
  , updatableItemAttributesNumberUnderscoreofUnderscorereviews :: Maybe Int -- ^ The number of reviews available for the item.
  , updatableItemAttributesPattern :: Maybe Text -- ^ The description of the pattern used for the product.
  , updatableItemAttributesPrice :: Maybe Text -- ^ The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  , updatableItemAttributesProductUnderscoretype :: Maybe Text -- ^ <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
  , updatableItemAttributesSaleUnderscoreprice :: Maybe Text -- ^ The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
  , updatableItemAttributesShipping :: Maybe Text -- ^ Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
  , updatableItemAttributesShippingUnderscoreheight :: Maybe Text -- ^ The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  , updatableItemAttributesShippingUnderscoreweight :: Maybe Text -- ^ The weight of the product. Ensure there is a space between the numeric string and the metric.
  , updatableItemAttributesShippingUnderscorewidth :: Maybe Text -- ^ The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  , updatableItemAttributesSize :: Maybe Text -- ^ The size of the product.
  , updatableItemAttributesSizeUnderscoresystem :: Maybe Text -- ^ Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
  , updatableItemAttributesSizeUnderscoretype :: Maybe Text -- ^ Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
  , updatableItemAttributesTax :: Maybe Text -- ^ Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
  , updatableItemAttributesTitle :: Maybe Text -- ^ <p><= 500 characters</p> <p>The name of the product.</p>
  , updatableItemAttributesVariantUnderscorenames :: Maybe [Text] -- ^ Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
  , updatableItemAttributesVariantUnderscorevalues :: Maybe [Text] -- ^ Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdatableItemAttributes where
  parseJSON = genericParseJSON optionsUpdatableItemAttributes
instance ToJSON UpdatableItemAttributes where
  toJSON = genericToJSON optionsUpdatableItemAttributes

optionsUpdatableItemAttributes :: Options
optionsUpdatableItemAttributes =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updatableItemAttributesAdUnderscorelink", "ad_link")
      , ("updatableItemAttributesAdult", "adult")
      , ("updatableItemAttributesAgeUnderscoregroup", "age_group")
      , ("updatableItemAttributesAvailability", "availability")
      , ("updatableItemAttributesAverageUnderscorereviewUnderscorerating", "average_review_rating")
      , ("updatableItemAttributesBrand", "brand")
      , ("updatableItemAttributesCheckoutUnderscoreenabled", "checkout_enabled")
      , ("updatableItemAttributesColor", "color")
      , ("updatableItemAttributesCondition", "condition")
      , ("updatableItemAttributesCustomUnderscorelabelUnderscore0", "custom_label_0")
      , ("updatableItemAttributesCustomUnderscorelabelUnderscore1", "custom_label_1")
      , ("updatableItemAttributesCustomUnderscorelabelUnderscore2", "custom_label_2")
      , ("updatableItemAttributesCustomUnderscorelabelUnderscore3", "custom_label_3")
      , ("updatableItemAttributesCustomUnderscorelabelUnderscore4", "custom_label_4")
      , ("updatableItemAttributesDescription", "description")
      , ("updatableItemAttributesFreeUnderscoreshippingUnderscorelabel", "free_shipping_label")
      , ("updatableItemAttributesFreeUnderscoreshippingUnderscorelimit", "free_shipping_limit")
      , ("updatableItemAttributesGender", "gender")
      , ("updatableItemAttributesGoogleUnderscoreproductUnderscorecategory", "google_product_category")
      , ("updatableItemAttributesGtin", "gtin")
      , ("updatableItemAttributesId", "id")
      , ("updatableItemAttributesItemUnderscoregroupUnderscoreid", "item_group_id")
      , ("updatableItemAttributesLastUnderscoreupdatedUnderscoretime", "last_updated_time")
      , ("updatableItemAttributesLink", "link")
      , ("updatableItemAttributesMaterial", "material")
      , ("updatableItemAttributesMinUnderscoreadUnderscoreprice", "min_ad_price")
      , ("updatableItemAttributesMobileUnderscorelink", "mobile_link")
      , ("updatableItemAttributesMpn", "mpn")
      , ("updatableItemAttributesNumberUnderscoreofUnderscoreratings", "number_of_ratings")
      , ("updatableItemAttributesNumberUnderscoreofUnderscorereviews", "number_of_reviews")
      , ("updatableItemAttributesPattern", "pattern")
      , ("updatableItemAttributesPrice", "price")
      , ("updatableItemAttributesProductUnderscoretype", "product_type")
      , ("updatableItemAttributesSaleUnderscoreprice", "sale_price")
      , ("updatableItemAttributesShipping", "shipping")
      , ("updatableItemAttributesShippingUnderscoreheight", "shipping_height")
      , ("updatableItemAttributesShippingUnderscoreweight", "shipping_weight")
      , ("updatableItemAttributesShippingUnderscorewidth", "shipping_width")
      , ("updatableItemAttributesSize", "size")
      , ("updatableItemAttributesSizeUnderscoresystem", "size_system")
      , ("updatableItemAttributesSizeUnderscoretype", "size_type")
      , ("updatableItemAttributesTax", "tax")
      , ("updatableItemAttributesTitle", "title")
      , ("updatableItemAttributesVariantUnderscorenames", "variant_names")
      , ("updatableItemAttributesVariantUnderscorevalues", "variant_values")
      ]


-- | The field types supported by the update mask
data UpdateMaskFieldType = UpdateMaskFieldType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateMaskFieldType where
  parseJSON = genericParseJSON optionsUpdateMaskFieldType
instance ToJSON UpdateMaskFieldType where
  toJSON = genericToJSON optionsUpdateMaskFieldType

optionsUpdateMaskFieldType :: Options
optionsUpdateMaskFieldType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data UserAccountFollowedInterests200Response = UserAccountFollowedInterests200Response
  { userAccountFollowedInterests200ResponseItems :: [Interest] -- ^ 
  , userAccountFollowedInterests200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UserAccountFollowedInterests200Response where
  parseJSON = genericParseJSON optionsUserAccountFollowedInterests200Response
instance ToJSON UserAccountFollowedInterests200Response where
  toJSON = genericToJSON optionsUserAccountFollowedInterests200Response

optionsUserAccountFollowedInterests200Response :: Options
optionsUserAccountFollowedInterests200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("userAccountFollowedInterests200ResponseItems", "items")
      , ("userAccountFollowedInterests200ResponseBookmark", "bookmark")
      ]


-- | Specifies the type of followees to be kept when filtering them.
data UserFollowingFeedType = UserFollowingFeedType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON UserFollowingFeedType where
  parseJSON = genericParseJSON optionsUserFollowingFeedType
instance ToJSON UserFollowingFeedType where
  toJSON = genericToJSON optionsUserFollowingFeedType

optionsUserFollowingFeedType :: Options
optionsUserFollowingFeedType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data UserFollowingGet200Response = UserFollowingGet200Response
  { userFollowingGet200ResponseItems :: [UserSummary] -- ^ Users
  , userFollowingGet200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UserFollowingGet200Response where
  parseJSON = genericParseJSON optionsUserFollowingGet200Response
instance ToJSON UserFollowingGet200Response where
  toJSON = genericToJSON optionsUserFollowingGet200Response

optionsUserFollowingGet200Response :: Options
optionsUserFollowingGet200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("userFollowingGet200ResponseItems", "items")
      , ("userFollowingGet200ResponseBookmark", "bookmark")
      ]


-- | User list operation type (add or remove)
data UserListOperationType = UserListOperationType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON UserListOperationType where
  parseJSON = genericParseJSON optionsUserListOperationType
instance ToJSON UserListOperationType where
  toJSON = genericToJSON optionsUserListOperationType

optionsUserListOperationType :: Options
optionsUserListOperationType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | User list type
data UserListType = UserListType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON UserListType where
  parseJSON = genericParseJSON optionsUserListType
instance ToJSON UserListType where
  toJSON = genericToJSON optionsUserListType

optionsUserListType :: Options
optionsUserListType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data UserSummary = UserSummary
  { userSummaryUsername :: Maybe Text -- ^ Username
  , userSummaryType :: Maybe Text -- ^ Always \"user\"
  } deriving (Show, Eq, Generic)

instance FromJSON UserSummary where
  parseJSON = genericParseJSON optionsUserSummary
instance ToJSON UserSummary where
  toJSON = genericToJSON optionsUserSummary

optionsUserSummary :: Options
optionsUserSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("userSummaryUsername", "username")
      , ("userSummaryType", "type")
      ]


-- | 
data UserWebsiteSummary = UserWebsiteSummary
  { userWebsiteSummaryWebsite :: Maybe Text -- ^ Website with path or domain only
  , userWebsiteSummaryStatus :: Maybe Text -- ^ Status of the verification process
  , userWebsiteSummaryVerifiedUnderscoreat :: Maybe Text -- ^ UTC timestamp when the verification happened - sometimes missing
  } deriving (Show, Eq, Generic)

instance FromJSON UserWebsiteSummary where
  parseJSON = genericParseJSON optionsUserWebsiteSummary
instance ToJSON UserWebsiteSummary where
  toJSON = genericToJSON optionsUserWebsiteSummary

optionsUserWebsiteSummary :: Options
optionsUserWebsiteSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("userWebsiteSummaryWebsite", "website")
      , ("userWebsiteSummaryStatus", "status")
      , ("userWebsiteSummaryVerifiedUnderscoreat", "verified_at")
      ]


-- | 
data UserWebsiteVerificationCode = UserWebsiteVerificationCode
  { userWebsiteVerificationCodeVerificationUnderscorecode :: Maybe Text -- ^ Code to check against the user claiming the website
  , userWebsiteVerificationCodeDnsUnderscoretxtUnderscorerecord :: Maybe Text -- ^ DNS TXT record to check against for the website to be claimed
  , userWebsiteVerificationCodeMetatag :: Maybe Text -- ^ Metatag the verification process searchs for the website to be claimed
  , userWebsiteVerificationCodeFilename :: Maybe Text -- ^ File expected to find on the website being claimed
  , userWebsiteVerificationCodeFileUnderscorecontent :: Maybe Text -- ^ A full html file to upload to the website in order for it to be claimed
  } deriving (Show, Eq, Generic)

instance FromJSON UserWebsiteVerificationCode where
  parseJSON = genericParseJSON optionsUserWebsiteVerificationCode
instance ToJSON UserWebsiteVerificationCode where
  toJSON = genericToJSON optionsUserWebsiteVerificationCode

optionsUserWebsiteVerificationCode :: Options
optionsUserWebsiteVerificationCode =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("userWebsiteVerificationCodeVerificationUnderscorecode", "verification_code")
      , ("userWebsiteVerificationCodeDnsUnderscoretxtUnderscorerecord", "dns_txt_record")
      , ("userWebsiteVerificationCodeMetatag", "metatag")
      , ("userWebsiteVerificationCodeFilename", "filename")
      , ("userWebsiteVerificationCodeFileUnderscorecontent", "file_content")
      ]


-- | User website verification request
data UserWebsiteVerifyRequest = UserWebsiteVerifyRequest
  { userWebsiteVerifyRequestWebsite :: Maybe Text -- ^ 
  , userWebsiteVerifyRequestVerificationUnderscoremethod :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UserWebsiteVerifyRequest where
  parseJSON = genericParseJSON optionsUserWebsiteVerifyRequest
instance ToJSON UserWebsiteVerifyRequest where
  toJSON = genericToJSON optionsUserWebsiteVerifyRequest

optionsUserWebsiteVerifyRequest :: Options
optionsUserWebsiteVerifyRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("userWebsiteVerifyRequestWebsite", "website")
      , ("userWebsiteVerifyRequestVerificationUnderscoremethod", "verification_method")
      ]


-- | 
data UserWebsitesGet200Response = UserWebsitesGet200Response
  { userWebsitesGet200ResponseItems :: [UserWebsiteSummary] -- ^ 
  , userWebsitesGet200ResponseBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UserWebsitesGet200Response where
  parseJSON = genericParseJSON optionsUserWebsitesGet200Response
instance ToJSON UserWebsitesGet200Response where
  toJSON = genericToJSON optionsUserWebsitesGet200Response

optionsUserWebsitesGet200Response :: Options
optionsUserWebsitesGet200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("userWebsitesGet200ResponseItems", "items")
      , ("userWebsitesGet200ResponseBookmark", "bookmark")
      ]


-- | 
data VideoMetadata = VideoMetadata
  { videoMetadataItemUnderscoretype :: Maybe Text -- ^ 
  , videoMetadataCoverUnderscoreimageUnderscoreurl :: Maybe Text -- ^ 
  , videoMetadataVideoUnderscoreurl :: Maybe Text -- ^ Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
  , videoMetadataDuration :: Maybe Double -- ^ Duration (in milliseconds)
  , videoMetadataHeight :: Maybe Int -- ^ Height (in pixels)
  , videoMetadataWidth :: Maybe Int -- ^ Width (in pixels)
  } deriving (Show, Eq, Generic)

instance FromJSON VideoMetadata where
  parseJSON = genericParseJSON optionsVideoMetadata
instance ToJSON VideoMetadata where
  toJSON = genericToJSON optionsVideoMetadata

optionsVideoMetadata :: Options
optionsVideoMetadata =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("videoMetadataItemUnderscoretype", "item_type")
      , ("videoMetadataCoverUnderscoreimageUnderscoreurl", "cover_image_url")
      , ("videoMetadataVideoUnderscoreurl", "video_url")
      , ("videoMetadataDuration", "duration")
      , ("videoMetadataHeight", "height")
      , ("videoMetadataWidth", "width")
      ]

