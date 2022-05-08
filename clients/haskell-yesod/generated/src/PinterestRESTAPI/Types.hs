{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module PinterestRESTAPI.Types (
  Account (..),
  ActionType (..),
  AdAccount (..),
  AdAccountOwner (..),
  AdGroupResponse (..),
  AdGroupResponseAllOf (..),
  AdGroupResponseAllOf1 (..),
  AdGroupSummaryStatus (..),
  AdResponse (..),
  AdResponseAllOf (..),
  AdResponseAllOf1 (..),
  AdsAnalyticsCreateAsyncRequest (..),
  AdsAnalyticsCreateAsyncRequestAllOf (..),
  AdsAnalyticsCreateAsyncRequestAllOf1 (..),
  AdsAnalyticsCreateAsyncResponse (..),
  AdsAnalyticsFilterColumn (..),
  AdsAnalyticsFilterOperator (..),
  AdsAnalyticsGetAsyncResponse (..),
  AdsAnalyticsMetricsFilter (..),
  AdsAnalyticsTargetingType (..),
  AnalyticsMetricsResponse (..),
  AnalyticsMetricsResponseDailyMetrics (..),
  AvailabilityFilter (..),
  BatchOperation (..),
  BatchOperationStatus (..),
  Board (..),
  BoardOwner (..),
  BoardSection (..),
  BoardUpdate (..),
  BrandFilter (..),
  CampaignCommon (..),
  CampaignResponse (..),
  CampaignResponseAllOf (..),
  CampaignResponseAllOf1 (..),
  CampaignSummaryStatus (..),
  CatalogsDbItem (..),
  CatalogsFeed (..),
  CatalogsFeedCredentials (..),
  CatalogsFeedIngestionDetails (..),
  CatalogsFeedIngestionErrors (..),
  CatalogsFeedIngestionInfo (..),
  CatalogsFeedProcessingResult (..),
  CatalogsFeedProcessingResultFields (..),
  CatalogsFeedProcessingSchedule (..),
  CatalogsFeedProcessingStatus (..),
  CatalogsFeedProductCounts (..),
  CatalogsFeedValidationDetails (..),
  CatalogsFeedValidationErrors (..),
  CatalogsFeedValidationWarnings (..),
  CatalogsFeedsCreateRequest (..),
  CatalogsFeedsUpdateRequest (..),
  CatalogsFormat (..),
  CatalogsItems (..),
  CatalogsItemsBatch (..),
  CatalogsItemsBatchRequest (..),
  CatalogsProductGroup (..),
  CatalogsProductGroupCreateRequest (..),
  CatalogsProductGroupCurrencyCriteria (..),
  CatalogsProductGroupFilterKeys (..),
  CatalogsProductGroupFilters (..),
  CatalogsProductGroupFiltersAllOf (..),
  CatalogsProductGroupFiltersAnyOf (..),
  CatalogsProductGroupMultipleStringCriteria (..),
  CatalogsProductGroupMultipleStringListCriteria (..),
  CatalogsProductGroupPricingCriteria (..),
  CatalogsProductGroupStatus (..),
  CatalogsProductGroupType (..),
  CatalogsProductGroupUpdateRequest (..),
  CatalogsStatus (..),
  ConditionFilter (..),
  ConversionAttributionWindowDays (..),
  ConversionReportAttributionType (..),
  ConversionReportTimeType (..),
  Country (..),
  Currency (..),
  CurrencyFilter (..),
  CustomLabel0Filter (..),
  CustomLabel1Filter (..),
  CustomLabel2Filter (..),
  CustomLabel3Filter (..),
  CustomLabel4Filter (..),
  DataOutputFormat (..),
  EntityStatus (..),
  Error (..),
  FeedFields (..),
  GenderFilter (..),
  GoogleProductCategory0Filter (..),
  GoogleProductCategory1Filter (..),
  GoogleProductCategory2Filter (..),
  GoogleProductCategory3Filter (..),
  GoogleProductCategory4Filter (..),
  GoogleProductCategory5Filter (..),
  GoogleProductCategory6Filter (..),
  Granularity (..),
  ImageDetails (..),
  ItemAttributes (..),
  ItemBatchRecord (..),
  ItemGroupIdFilter (..),
  ItemIdFilter (..),
  ItemProcessingRecord (..),
  ItemProcessingStatus (..),
  ItemValidationEvent (..),
  Language (..),
  MaxPriceFilter (..),
  MediaUpload (..),
  MediaUploadAllOf (..),
  MediaUploadAllOfUploadParameters (..),
  MediaUploadDetails (..),
  MediaUploadRequest (..),
  MediaUploadStatus (..),
  MediaUploadType (..),
  MetricsReportingLevel (..),
  MinPriceFilter (..),
  NonNullableCatalogsCurrency (..),
  NullableCurrency (..),
  OauthAccessTokenRequest (..),
  OauthAccessTokenRequestCode (..),
  OauthAccessTokenRequestCodeAllOf (..),
  OauthAccessTokenRequestRefresh (..),
  OauthAccessTokenRequestRefreshAllOf (..),
  OauthAccessTokenResponse (..),
  OauthAccessTokenResponseCode (..),
  OauthAccessTokenResponseCodeAllOf (..),
  OauthAccessTokenResponseRefresh (..),
  ObjectiveType (..),
  PacingDeliveryType (..),
  Paginated (..),
  Pin (..),
  PinMedia (..),
  PinMediaSource (..),
  PinMediaSourceImageBase64 (..),
  PinMediaSourceImageURL (..),
  PinMediaSourceVideoID (..),
  PinMediaWithImage (..),
  PinMediaWithImageAllOf (..),
  PinPromotionSummaryStatus (..),
  PlacementGroupType (..),
  ProductAvailabilityType (..),
  ProductGroupSummaryStatus (..),
  ProductType0Filter (..),
  ProductType1Filter (..),
  ProductType2Filter (..),
  ProductType3Filter (..),
  ProductType4Filter (..),
  ReportingColumnAsync (..),
  TargetingTypeFilter (..),
  TrackingUrls (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | 
data Account = Account
  { accountAccountUnderscoretype :: Maybe Text -- ^ Type of account
  , accountProfileUnderscoreimage :: Maybe Text -- ^ 
  , accountWebsiteUnderscoreurl :: Maybe Text -- ^ 
  , accountUsername :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Account where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "account")
instance ToJSON Account where
  toJSON = genericToJSON (removeFieldLabelPrefix False "account")


-- | Ad group billable event type.
data ActionType = ActionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ActionType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "actionType")
instance ToJSON ActionType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "actionType")


-- | 
data AdAccount = AdAccount
  { adAccountId :: Maybe Text -- ^ 
  , adAccountName :: Maybe Text -- ^ 
  , adAccountOwner :: Maybe AdAccountOwner -- ^ 
  , adAccountCountry :: Maybe Country -- ^ 
  , adAccountCurrency :: Maybe Currency -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccount where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adAccount")
instance ToJSON AdAccount where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adAccount")


-- | 
data AdAccountOwner = AdAccountOwner
  { adAccountOwnerUsername :: Maybe Text -- ^ Public username for the user account
  } deriving (Show, Eq, Generic)

instance FromJSON AdAccountOwner where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adAccountOwner")
instance ToJSON AdAccountOwner where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adAccountOwner")


-- | 
data AdGroupResponse = AdGroupResponse
  { adGroupResponseName :: Maybe Text -- ^ Ad group name.
  , adGroupResponseStatus :: Maybe EntityStatus -- ^ Ad group/entity status.
  , adGroupResponseBudgetUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  , adGroupResponseBidUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  , adGroupResponseBudgetUnderscoretype :: Maybe Text -- ^ Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
  , adGroupResponseStartUnderscoretime :: Maybe Int -- ^ Ad group start time. Unix timestamp in seconds. Defaults to current time.
  , adGroupResponseEndUnderscoretime :: Maybe Int -- ^ Ad group end time. Unix timestamp in seconds.
  , adGroupResponseTargetingUnderscorespec :: Maybe (Map.Map String [Text]) -- ^ Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
  , adGroupResponseLifetimeUnderscorefrequencyUnderscorecap :: Maybe Int -- ^ Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  , adGroupResponseTrackingUnderscoreurls :: Maybe TrackingUrls -- ^ Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  , adGroupResponseAutoUnderscoretargetingUnderscoreenabled :: Maybe Bool -- ^ Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  , adGroupResponsePlacementUnderscoregroup :: Maybe PlacementGroupType -- ^ <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
  , adGroupResponsePacingUnderscoredeliveryUnderscoretype :: Maybe PacingDeliveryType -- ^ Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
  , adGroupResponseConversionUnderscorelearningUnderscoremodeUnderscoretype :: Maybe Text -- ^ oCPM learn mode
  , adGroupResponseSummaryUnderscorestatus :: Maybe AdGroupSummaryStatus -- ^ Ad group summary status.
  , adGroupResponseFeedUnderscoreprofileUnderscoreid :: Maybe Text -- ^ Feed Profile ID associated to the adgroup.
  , adGroupResponseCampaignUnderscoreid :: Maybe Text -- ^ Campaign ID of the ad group.
  , adGroupResponseBillableUnderscoreevent :: Maybe ActionType -- ^ 
  , adGroupResponseId :: Maybe Text -- ^ Ad group ID.
  , adGroupResponseType :: Maybe Text -- ^ Always \"adgroup\".
  , adGroupResponseAdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Advertiser ID.
  , adGroupResponseCreatedUnderscoretime :: Maybe Int -- ^ Ad group creation time. Unix timestamp in seconds.
  , adGroupResponseUpdatedUnderscoretime :: Maybe Int -- ^ Ad group last update time. Unix timestamp in seconds.
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adGroupResponse")
instance ToJSON AdGroupResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adGroupResponse")


-- | 
data AdGroupResponseAllOf = AdGroupResponseAllOf
  { adGroupResponseAllOfName :: Maybe Text -- ^ Ad group name.
  , adGroupResponseAllOfStatus :: Maybe EntityStatus -- ^ Ad group/entity status.
  , adGroupResponseAllOfBudgetUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  , adGroupResponseAllOfBidUnderscoreinUnderscoremicroUnderscorecurrency :: Maybe Int -- ^ Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  , adGroupResponseAllOfBudgetUnderscoretype :: Maybe Text -- ^ Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
  , adGroupResponseAllOfStartUnderscoretime :: Maybe Int -- ^ Ad group start time. Unix timestamp in seconds. Defaults to current time.
  , adGroupResponseAllOfEndUnderscoretime :: Maybe Int -- ^ Ad group end time. Unix timestamp in seconds.
  , adGroupResponseAllOfTargetingUnderscorespec :: Maybe (Map.Map String [Text]) -- ^ Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
  , adGroupResponseAllOfLifetimeUnderscorefrequencyUnderscorecap :: Maybe Int -- ^ Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  , adGroupResponseAllOfTrackingUnderscoreurls :: Maybe TrackingUrls -- ^ Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  , adGroupResponseAllOfAutoUnderscoretargetingUnderscoreenabled :: Maybe Bool -- ^ Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  , adGroupResponseAllOfPlacementUnderscoregroup :: Maybe PlacementGroupType -- ^ <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
  , adGroupResponseAllOfPacingUnderscoredeliveryUnderscoretype :: Maybe PacingDeliveryType -- ^ Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
  , adGroupResponseAllOfConversionUnderscorelearningUnderscoremodeUnderscoretype :: Maybe Text -- ^ oCPM learn mode
  , adGroupResponseAllOfSummaryUnderscorestatus :: Maybe AdGroupSummaryStatus -- ^ Ad group summary status.
  , adGroupResponseAllOfFeedUnderscoreprofileUnderscoreid :: Maybe Text -- ^ Feed Profile ID associated to the adgroup.
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupResponseAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adGroupResponseAllOf")
instance ToJSON AdGroupResponseAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adGroupResponseAllOf")


-- | 
data AdGroupResponseAllOf1 = AdGroupResponseAllOf1
  { adGroupResponseAllOf1CampaignUnderscoreid :: Maybe Text -- ^ Campaign ID of the ad group.
  , adGroupResponseAllOf1BillableUnderscoreevent :: Maybe ActionType -- ^ 
  , adGroupResponseAllOf1Id :: Maybe Text -- ^ Ad group ID.
  , adGroupResponseAllOf1Type :: Maybe Text -- ^ Always \"adgroup\".
  , adGroupResponseAllOf1AdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ Advertiser ID.
  , adGroupResponseAllOf1CreatedUnderscoretime :: Maybe Int -- ^ Ad group creation time. Unix timestamp in seconds.
  , adGroupResponseAllOf1UpdatedUnderscoretime :: Maybe Int -- ^ Ad group last update time. Unix timestamp in seconds.
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupResponseAllOf1 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adGroupResponseAllOf1")
instance ToJSON AdGroupResponseAllOf1 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adGroupResponseAllOf1")


-- | Summary status for ad group
data AdGroupSummaryStatus = AdGroupSummaryStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AdGroupSummaryStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adGroupSummaryStatus")
instance ToJSON AdGroupSummaryStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adGroupSummaryStatus")


-- | 
data AdResponse = AdResponse
  { adResponseAdUnderscoregroupUnderscoreid :: Maybe Text -- ^ ID of the ad group that contains the ad.
  , adResponseAndroidUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  , adResponseCarouselUnderscoreandroidUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on Android.
  , adResponseCarouselUnderscoredestinationUnderscoreurls :: Maybe [Text] -- ^ Comma-separated destination URLs for the carousel pin to promote.
  , adResponseCarouselUnderscoreiosUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on iOS.
  , adResponseClickUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking url for the ad clicks.
  , adResponseCreativeUnderscoretype :: Maybe Text -- ^ Ad creative type enum
  , adResponseDestinationUnderscoreurl :: Maybe Text -- ^ Destination URL.
  , adResponseIosUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  , adResponseIsUnderscorepinUnderscoredeleted :: Maybe Bool -- ^ Is original pin deleted?
  , adResponseIsUnderscoreremovable :: Maybe Bool -- ^ Is pin repinnable?
  , adResponseName :: Maybe Text -- ^ Name of the ad - 255 chars max.
  , adResponsePinUnderscoreid :: Maybe Text -- ^ Pin ID.
  , adResponseStatus :: Maybe EntityStatus -- ^ 
  , adResponseTrackingUnderscoreurls :: Maybe TrackingUrls -- ^ 
  , adResponseViewUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking URL for ad impressions.
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
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adResponse")
instance ToJSON AdResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adResponse")


-- | Creation fields
data AdResponseAllOf = AdResponseAllOf
  { adResponseAllOfAdUnderscoregroupUnderscoreid :: Maybe Text -- ^ ID of the ad group that contains the ad.
  , adResponseAllOfAndroidUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  , adResponseAllOfCarouselUnderscoreandroidUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on Android.
  , adResponseAllOfCarouselUnderscoredestinationUnderscoreurls :: Maybe [Text] -- ^ Comma-separated destination URLs for the carousel pin to promote.
  , adResponseAllOfCarouselUnderscoreiosUnderscoredeepUnderscorelinks :: Maybe [Text] -- ^ Comma-separated deep links for the carousel pin on iOS.
  , adResponseAllOfClickUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking url for the ad clicks.
  , adResponseAllOfCreativeUnderscoretype :: Maybe Text -- ^ Ad creative type enum
  , adResponseAllOfDestinationUnderscoreurl :: Maybe Text -- ^ Destination URL.
  , adResponseAllOfIosUnderscoredeepUnderscorelink :: Maybe Text -- ^ Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  , adResponseAllOfIsUnderscorepinUnderscoredeleted :: Maybe Bool -- ^ Is original pin deleted?
  , adResponseAllOfIsUnderscoreremovable :: Maybe Bool -- ^ Is pin repinnable?
  , adResponseAllOfName :: Maybe Text -- ^ Name of the ad - 255 chars max.
  , adResponseAllOfPinUnderscoreid :: Maybe Text -- ^ Pin ID.
  , adResponseAllOfStatus :: Maybe EntityStatus -- ^ 
  , adResponseAllOfTrackingUnderscoreurls :: Maybe TrackingUrls -- ^ 
  , adResponseAllOfViewUnderscoretrackingUnderscoreurl :: Maybe Text -- ^ Tracking URL for ad impressions.
  } deriving (Show, Eq, Generic)

instance FromJSON AdResponseAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adResponseAllOf")
instance ToJSON AdResponseAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adResponseAllOf")


-- | 
data AdResponseAllOf1 = AdResponseAllOf1
  { adResponseAllOf1AdUnderscoreaccountUnderscoreid :: Maybe Text -- ^ The ID of the advertiser that this ad belongs to.
  , adResponseAllOf1CampaignUnderscoreid :: Maybe Text -- ^ ID of the ad campaign that contains this ad.
  , adResponseAllOf1CollectionUnderscoreitemsUnderscoredestinationUnderscoreurlUnderscoretemplate :: Maybe Text -- ^ Destination URL template for all items within a collections drawer.
  , adResponseAllOf1CreatedUnderscoretime :: Maybe Int -- ^ Pin creation time. Unix timestamp in seconds.
  , adResponseAllOf1Id :: Maybe Text -- ^ The ID of this ad.
  , adResponseAllOf1RejectedUnderscorereasons :: Maybe [Text] -- ^ Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  , adResponseAllOf1RejectionUnderscorelabels :: Maybe [Text] -- ^ Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  , adResponseAllOf1ReviewUnderscorestatus :: Maybe Text -- ^ Ad review status
  , adResponseAllOf1Type :: Maybe Text -- ^ Always \"ad\".
  , adResponseAllOf1UpdatedUnderscoretime :: Maybe Int -- ^ Last update time. Unix timestamp in seconds.
  , adResponseAllOf1SummaryUnderscorestatus :: Maybe PinPromotionSummaryStatus -- ^ Ad summary status
  } deriving (Show, Eq, Generic)

instance FromJSON AdResponseAllOf1 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adResponseAllOf1")
instance ToJSON AdResponseAllOf1 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adResponseAllOf1")


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
  , adsAnalyticsCreateAsyncRequestColumns :: [ReportingColumnAsync] -- ^ Metric and entity columns
  , adsAnalyticsCreateAsyncRequestLevel :: MetricsReportingLevel -- ^ Level of the report
  , adsAnalyticsCreateAsyncRequestReportUnderscoreformat :: Maybe DataOutputFormat -- ^ Specification for formatting report data
  , adsAnalyticsCreateAsyncRequestCampaignUnderscoreids :: Maybe [Text] -- ^ List of campaign ids
  , adsAnalyticsCreateAsyncRequestCampaignUnderscorestatuses :: Maybe [CampaignSummaryStatus] -- ^ List of status values for filtering
  , adsAnalyticsCreateAsyncRequestCampaignUnderscoreobjectiveUnderscoretypes :: Maybe [ObjectiveType] -- ^ List of values for filtering
  , adsAnalyticsCreateAsyncRequestAdUnderscoregroupUnderscoreids :: Maybe [Text] -- ^ List of ad group ids
  , adsAnalyticsCreateAsyncRequestAdUnderscoregroupUnderscorestatuses :: Maybe [AdGroupSummaryStatus] -- ^ List of values for filtering
  , adsAnalyticsCreateAsyncRequestAdUnderscoreids :: Maybe [Text] -- ^ List of ad ids
  , adsAnalyticsCreateAsyncRequestAdUnderscorestatuses :: Maybe [PinPromotionSummaryStatus] -- ^ List of values for filtering
  , adsAnalyticsCreateAsyncRequestProductUnderscoregroupUnderscoreids :: Maybe [Text] -- ^ List of product group ids
  , adsAnalyticsCreateAsyncRequestProductUnderscoregroupUnderscorestatuses :: Maybe [ProductGroupSummaryStatus] -- ^ List of values for filtering
  , adsAnalyticsCreateAsyncRequestProductUnderscoreitemUnderscoreids :: Maybe [Text] -- ^ List of product item ids
  , adsAnalyticsCreateAsyncRequestTargetingUnderscoretypes :: Maybe [AdsAnalyticsTargetingType] -- ^ List of targeting types
  , adsAnalyticsCreateAsyncRequestMetricsUnderscorefilters :: Maybe [AdsAnalyticsMetricsFilter] -- ^ List of metrics filters
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsCreateAsyncRequest where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adsAnalyticsCreateAsyncRequest")
instance ToJSON AdsAnalyticsCreateAsyncRequest where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adsAnalyticsCreateAsyncRequest")


-- | 
data AdsAnalyticsCreateAsyncRequestAllOf = AdsAnalyticsCreateAsyncRequestAllOf
  { adsAnalyticsCreateAsyncRequestAllOfStartUnderscoredate :: Text -- ^ Metric report start date (UTC). Format: YYYY-MM-DD
  , adsAnalyticsCreateAsyncRequestAllOfEndUnderscoredate :: Text -- ^ Metric report end date (UTC). Format: YYYY-MM-DD
  , adsAnalyticsCreateAsyncRequestAllOfGranularity :: Granularity -- ^ TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  , adsAnalyticsCreateAsyncRequestAllOfClickUnderscorewindowUnderscoredays :: Maybe ConversionAttributionWindowDays -- ^ Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  , adsAnalyticsCreateAsyncRequestAllOfEngagementUnderscorewindowUnderscoredays :: Maybe ConversionAttributionWindowDays -- ^ Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  , adsAnalyticsCreateAsyncRequestAllOfViewUnderscorewindowUnderscoredays :: Maybe ConversionAttributionWindowDays -- ^ Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  , adsAnalyticsCreateAsyncRequestAllOfConversionUnderscorereportUnderscoretime :: Maybe ConversionReportTimeType -- ^ The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  , adsAnalyticsCreateAsyncRequestAllOfAttributionUnderscoretypes :: Maybe [ConversionReportAttributionType] -- ^ List of types of attribution for the conversion report
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsCreateAsyncRequestAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adsAnalyticsCreateAsyncRequestAllOf")
instance ToJSON AdsAnalyticsCreateAsyncRequestAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adsAnalyticsCreateAsyncRequestAllOf")


-- | 
data AdsAnalyticsCreateAsyncRequestAllOf1 = AdsAnalyticsCreateAsyncRequestAllOf1
  { adsAnalyticsCreateAsyncRequestAllOf1Columns :: [ReportingColumnAsync] -- ^ Metric and entity columns
  , adsAnalyticsCreateAsyncRequestAllOf1Level :: MetricsReportingLevel -- ^ Level of the report
  , adsAnalyticsCreateAsyncRequestAllOf1ReportUnderscoreformat :: Maybe DataOutputFormat -- ^ Specification for formatting report data
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsCreateAsyncRequestAllOf1 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adsAnalyticsCreateAsyncRequestAllOf1")
instance ToJSON AdsAnalyticsCreateAsyncRequestAllOf1 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adsAnalyticsCreateAsyncRequestAllOf1")


-- | 
data AdsAnalyticsCreateAsyncResponse = AdsAnalyticsCreateAsyncResponse
  { adsAnalyticsCreateAsyncResponseReportUnderscorestatus :: Maybe Text -- ^ 
  , adsAnalyticsCreateAsyncResponseToken :: Maybe Text -- ^ 
  , adsAnalyticsCreateAsyncResponseMessage :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsCreateAsyncResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adsAnalyticsCreateAsyncResponse")
instance ToJSON AdsAnalyticsCreateAsyncResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adsAnalyticsCreateAsyncResponse")


-- | Reporting columns for sync reporting data filter
data AdsAnalyticsFilterColumn = AdsAnalyticsFilterColumn
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsFilterColumn where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adsAnalyticsFilterColumn")
instance ToJSON AdsAnalyticsFilterColumn where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adsAnalyticsFilterColumn")


-- | Filter operator for sync reporting
data AdsAnalyticsFilterOperator = AdsAnalyticsFilterOperator
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsFilterOperator where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adsAnalyticsFilterOperator")
instance ToJSON AdsAnalyticsFilterOperator where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adsAnalyticsFilterOperator")


-- | 
data AdsAnalyticsGetAsyncResponse = AdsAnalyticsGetAsyncResponse
  { adsAnalyticsGetAsyncResponseReportUnderscorestatus :: Maybe Text -- ^ 
  , adsAnalyticsGetAsyncResponseUrl :: Maybe Text -- ^ 
  , adsAnalyticsGetAsyncResponseSize :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsGetAsyncResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adsAnalyticsGetAsyncResponse")
instance ToJSON AdsAnalyticsGetAsyncResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adsAnalyticsGetAsyncResponse")


-- | 
data AdsAnalyticsMetricsFilter = AdsAnalyticsMetricsFilter
  { adsAnalyticsMetricsFilterField :: Maybe AdsAnalyticsFilterColumn -- ^ 
  , adsAnalyticsMetricsFilterOperator :: Maybe AdsAnalyticsFilterOperator -- ^ 
  , adsAnalyticsMetricsFilterValues :: Maybe [Double] -- ^ List of values for filtering
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsMetricsFilter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adsAnalyticsMetricsFilter")
instance ToJSON AdsAnalyticsMetricsFilter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adsAnalyticsMetricsFilter")


-- | Reporting targeting type
data AdsAnalyticsTargetingType = AdsAnalyticsTargetingType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AdsAnalyticsTargetingType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "adsAnalyticsTargetingType")
instance ToJSON AdsAnalyticsTargetingType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "adsAnalyticsTargetingType")


-- | 
data AnalyticsMetricsResponse = AnalyticsMetricsResponse
  { analyticsMetricsResponseDailyUnderscoremetrics :: Maybe [AnalyticsMetricsResponseDailyMetrics] -- ^ Array with the requested daily metric records
  , analyticsMetricsResponseSummaryUnderscoremetrics :: Maybe (Map.Map String Double) -- ^ The metric name and value over the requested period for each requested metric
  } deriving (Show, Eq, Generic)

instance FromJSON AnalyticsMetricsResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "analyticsMetricsResponse")
instance ToJSON AnalyticsMetricsResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "analyticsMetricsResponse")


-- | 
data AnalyticsMetricsResponseDailyMetrics = AnalyticsMetricsResponseDailyMetrics
  { analyticsMetricsResponseDailyMetricsDataUnderscorestatus :: Maybe Text -- ^ Metrics availablity, e.g., \"READY\".
  , analyticsMetricsResponseDailyMetricsDate :: Maybe Text -- ^ Metrics date (UTC): YYYY-MM-DD.
  , analyticsMetricsResponseDailyMetricsMetrics :: Maybe (Map.Map String Double) -- ^ The metric name and daily value for each requested metric
  } deriving (Show, Eq, Generic)

instance FromJSON AnalyticsMetricsResponseDailyMetrics where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "analyticsMetricsResponseDailyMetrics")
instance ToJSON AnalyticsMetricsResponseDailyMetrics where
  toJSON = genericToJSON (removeFieldLabelPrefix False "analyticsMetricsResponseDailyMetrics")


-- | 
data AvailabilityFilter = AvailabilityFilter
  { availabilityFilterAVAILABILITY :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AvailabilityFilter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "availabilityFilter")
instance ToJSON AvailabilityFilter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "availabilityFilter")


-- | The operation performed by the batch
data BatchOperation = BatchOperation
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON BatchOperation where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "batchOperation")
instance ToJSON BatchOperation where
  toJSON = genericToJSON (removeFieldLabelPrefix False "batchOperation")


-- | The status of the operation performed by the batch
data BatchOperationStatus = BatchOperationStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON BatchOperationStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "batchOperationStatus")
instance ToJSON BatchOperationStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "batchOperationStatus")


-- | Board
data Board = Board
  { boardId :: Maybe Text -- ^ 
  , boardName :: Text -- ^ 
  , boardDescription :: Maybe Text -- ^ 
  , boardOwner :: Maybe BoardOwner -- ^ 
  , boardPrivacy :: Maybe Text -- ^ Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
  } deriving (Show, Eq, Generic)

instance FromJSON Board where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "board")
instance ToJSON Board where
  toJSON = genericToJSON (removeFieldLabelPrefix False "board")


-- | 
data BoardOwner = BoardOwner
  { boardOwnerUsername :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BoardOwner where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "boardOwner")
instance ToJSON BoardOwner where
  toJSON = genericToJSON (removeFieldLabelPrefix False "boardOwner")


-- | Sections help organize pins within a board.
data BoardSection = BoardSection
  { boardSectionId :: Maybe Text -- ^ 
  , boardSectionName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BoardSection where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "boardSection")
instance ToJSON BoardSection where
  toJSON = genericToJSON (removeFieldLabelPrefix False "boardSection")


-- | Board fields for updates
data BoardUpdate = BoardUpdate
  { boardUpdateName :: Maybe Text -- ^ 
  , boardUpdateDescription :: Maybe Text -- ^ 
  , boardUpdatePrivacy :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BoardUpdate where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "boardUpdate")
instance ToJSON BoardUpdate where
  toJSON = genericToJSON (removeFieldLabelPrefix False "boardUpdate")


-- | 
data BrandFilter = BrandFilter
  { brandFilterBRAND :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BrandFilter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "brandFilter")
instance ToJSON BrandFilter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "brandFilter")


-- | Campaign Data
data CampaignCommon = CampaignCommon
  { campaignCommonAdUnderscoreaccountUnderscoreid :: Text -- ^ Campaign's Advertiser ID.
  , campaignCommonName :: Maybe Text -- ^ Campaign name.
  , campaignCommonStatus :: Maybe EntityStatus -- ^ 
  , campaignCommonLifetimeUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign total spending cap.
  , campaignCommonDailyUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign daily spending cap.
  , campaignCommonOrderUnderscorelineUnderscoreid :: Maybe Text -- ^ Order line ID that appears on the invoice.
  , campaignCommonTrackingUnderscoreurls :: Maybe TrackingUrls -- ^ 
  , campaignCommonStartUnderscoretime :: Maybe Int -- ^ Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignCommonEndUnderscoretime :: Maybe Int -- ^ Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignCommon where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "campaignCommon")
instance ToJSON CampaignCommon where
  toJSON = genericToJSON (removeFieldLabelPrefix False "campaignCommon")


-- | 
data CampaignResponse = CampaignResponse
  { campaignResponseId :: Text -- ^ Campaign ID.
  , campaignResponseAdUnderscoreaccountUnderscoreid :: Text -- ^ Campaign's Advertiser ID.
  , campaignResponseName :: Maybe Text -- ^ Campaign name.
  , campaignResponseStatus :: Maybe EntityStatus -- ^ 
  , campaignResponseLifetimeUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign total spending cap.
  , campaignResponseDailyUnderscorespendUnderscorecap :: Maybe Int -- ^ Campaign daily spending cap.
  , campaignResponseOrderUnderscorelineUnderscoreid :: Maybe Text -- ^ Order line ID that appears on the invoice.
  , campaignResponseTrackingUnderscoreurls :: Maybe TrackingUrls -- ^ 
  , campaignResponseStartUnderscoretime :: Maybe Int -- ^ Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignResponseEndUnderscoretime :: Maybe Int -- ^ Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  , campaignResponseObjectiveUnderscoretype :: Maybe ObjectiveType -- ^ 
  , campaignResponseCreatedUnderscoretime :: Maybe Int -- ^ Campaign creation time. Unix timestamp in seconds.
  , campaignResponseUpdatedUnderscoretime :: Maybe Int -- ^ UTC timestamp. Last update time.
  , campaignResponseType :: Maybe Text -- ^ Always \"campaign\".
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "campaignResponse")
instance ToJSON CampaignResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "campaignResponse")


-- | 
data CampaignResponseAllOf = CampaignResponseAllOf
  { campaignResponseAllOfId :: Text -- ^ Campaign ID.
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignResponseAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "campaignResponseAllOf")
instance ToJSON CampaignResponseAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "campaignResponseAllOf")


-- | 
data CampaignResponseAllOf1 = CampaignResponseAllOf1
  { campaignResponseAllOf1ObjectiveUnderscoretype :: Maybe ObjectiveType -- ^ 
  , campaignResponseAllOf1CreatedUnderscoretime :: Maybe Int -- ^ Campaign creation time. Unix timestamp in seconds.
  , campaignResponseAllOf1UpdatedUnderscoretime :: Maybe Int -- ^ UTC timestamp. Last update time.
  , campaignResponseAllOf1Type :: Maybe Text -- ^ Always \"campaign\".
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignResponseAllOf1 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "campaignResponseAllOf1")
instance ToJSON CampaignResponseAllOf1 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "campaignResponseAllOf1")


-- | Summary status for campaign
data CampaignSummaryStatus = CampaignSummaryStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignSummaryStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "campaignSummaryStatus")
instance ToJSON CampaignSummaryStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "campaignSummaryStatus")


-- | 
data CatalogsDbItem = CatalogsDbItem
  { catalogsDbItemCreatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsDbItemId :: Maybe Text -- ^ 
  , catalogsDbItemUpdatedUnderscoreat :: Maybe UTCTime -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsDbItem where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsDbItem")
instance ToJSON CatalogsDbItem where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsDbItem")


-- | Catalogs Catalogs Feed object
data CatalogsFeed = CatalogsFeed
  { catalogsFeedCreatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsFeedId :: Maybe Text -- ^ 
  , catalogsFeedUpdatedUnderscoreat :: Maybe UTCTime -- ^ 
  , catalogsFeedDefaultUnderscorecountry :: Country -- ^ 
  , catalogsFeedDefaultUnderscoreavailability :: ProductAvailabilityType -- ^ 
  , catalogsFeedDefaultUnderscorecurrency :: NullableCurrency -- ^ 
  , catalogsFeedName :: Text -- ^ A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  , catalogsFeedFormat :: CatalogsFormat -- ^ 
  , catalogsFeedDefaultUnderscorelocale :: Text -- ^ The locale used within a feed for product descriptions.
  , catalogsFeedCredentials :: CatalogsFeedCredentials -- ^ 
  , catalogsFeedLocation :: Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsFeedPreferredUnderscoreprocessingUnderscoreschedule :: CatalogsFeedProcessingSchedule -- ^ 
  , catalogsFeedStatus :: CatalogsStatus -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeed where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeed")
instance ToJSON CatalogsFeed where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeed")


-- | Use this if your feed file requires username and password.
data CatalogsFeedCredentials = CatalogsFeedCredentials
  { catalogsFeedCredentialsPassword :: Text -- ^ The required password for downloading a feed.
  , catalogsFeedCredentialsUsername :: Text -- ^ The required username for downloading a feed.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedCredentials where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedCredentials")
instance ToJSON CatalogsFeedCredentials where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedCredentials")


-- | 
data CatalogsFeedIngestionDetails = CatalogsFeedIngestionDetails
  { catalogsFeedIngestionDetailsErrors :: CatalogsFeedIngestionErrors -- ^ 
  , catalogsFeedIngestionDetailsInfo :: CatalogsFeedIngestionInfo -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedIngestionDetails where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedIngestionDetails")
instance ToJSON CatalogsFeedIngestionDetails where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedIngestionDetails")


-- | 
data CatalogsFeedIngestionErrors = CatalogsFeedIngestionErrors
  { catalogsFeedIngestionErrorsImageUnderscoredownloadUnderscoreerror :: Maybe Int -- ^ 
  , catalogsFeedIngestionErrorsImageUnderscoredownloadUnderscoreconnectionUnderscoretimeout :: Maybe Int -- ^ 
  , catalogsFeedIngestionErrorsImageUnderscoreformatUnderscoreunrecognize :: Maybe Int -- ^ 
  , catalogsFeedIngestionErrorsLineUnderscorelevelUnderscoreinternalUnderscoreerror :: Maybe Int -- ^ 
  , catalogsFeedIngestionErrorsLargeUnderscoreproductUnderscorecountUnderscoredecrease :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedIngestionErrors where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedIngestionErrors")
instance ToJSON CatalogsFeedIngestionErrors where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedIngestionErrors")


-- | 
data CatalogsFeedIngestionInfo = CatalogsFeedIngestionInfo
  { catalogsFeedIngestionInfoInUnderscorestock :: Maybe Int -- ^ 
  , catalogsFeedIngestionInfoOutUnderscoreofUnderscorestock :: Maybe Int -- ^ 
  , catalogsFeedIngestionInfoPreorder :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedIngestionInfo where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedIngestionInfo")
instance ToJSON CatalogsFeedIngestionInfo where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedIngestionInfo")


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
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedProcessingResult")
instance ToJSON CatalogsFeedProcessingResult where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedProcessingResult")


-- | 
data CatalogsFeedProcessingResultFields = CatalogsFeedProcessingResultFields
  { catalogsFeedProcessingResultFieldsIngestionUnderscoredetails :: CatalogsFeedIngestionDetails -- ^ 
  , catalogsFeedProcessingResultFieldsStatus :: CatalogsFeedProcessingStatus -- ^ 
  , catalogsFeedProcessingResultFieldsProductUnderscorecounts :: CatalogsFeedProductCounts -- ^ 
  , catalogsFeedProcessingResultFieldsValidationUnderscoredetails :: CatalogsFeedValidationDetails -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedProcessingResultFields where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedProcessingResultFields")
instance ToJSON CatalogsFeedProcessingResultFields where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedProcessingResultFields")


-- | Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).
data CatalogsFeedProcessingSchedule = CatalogsFeedProcessingSchedule
  { catalogsFeedProcessingScheduleTime :: Text -- ^ A time in format HH:MM with leading 0 (zero)
  , catalogsFeedProcessingScheduleTimezone :: Text -- ^ The timezone considered for the processing schedule time.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedProcessingSchedule where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedProcessingSchedule")
instance ToJSON CatalogsFeedProcessingSchedule where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedProcessingSchedule")


-- | 
data CatalogsFeedProcessingStatus = CatalogsFeedProcessingStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedProcessingStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedProcessingStatus")
instance ToJSON CatalogsFeedProcessingStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedProcessingStatus")


-- | The counts can be null early in the process.
data CatalogsFeedProductCounts = CatalogsFeedProductCounts
  { catalogsFeedProductCountsOriginal :: Maybe Int -- ^ The number of products in the feed file
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedProductCounts where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedProductCounts")
instance ToJSON CatalogsFeedProductCounts where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedProductCounts")


-- | 
data CatalogsFeedValidationDetails = CatalogsFeedValidationDetails
  { catalogsFeedValidationDetailsErrors :: CatalogsFeedValidationErrors -- ^ 
  , catalogsFeedValidationDetailsWarnings :: CatalogsFeedValidationWarnings -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedValidationDetails where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedValidationDetails")
instance ToJSON CatalogsFeedValidationDetails where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedValidationDetails")


-- | 
data CatalogsFeedValidationErrors = CatalogsFeedValidationErrors
  { catalogsFeedValidationErrorsFetchUnderscoreerror :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsFetchUnderscoreinactiveUnderscorefeedUnderscoreerror :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsEncodingUnderscoreerror :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsDelimiterUnderscoreerror :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsRequiredUnderscorecolumnsUnderscoremissing :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsImageUnderscorelinkUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsItemidUnderscoremissing :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsTitleUnderscoremissing :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsDescriptionUnderscoremissing :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsProductUnderscorecategoryUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsProductUnderscorelinkUnderscoremissing :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsImageUnderscorelinkUnderscoremissing :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsAvailabilityUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsProductUnderscorepriceUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsLinkUnderscoreformatUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsParseUnderscorelineUnderscoreerror :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsAdwordsUnderscoreformatUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsProductUnderscorecategoryUnderscoremissing :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsInternalUnderscoreserviceUnderscoreerror :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsNoUnderscoreverifiedUnderscoredomain :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsAdultUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsInvalidUnderscoredomain :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsFeedUnderscorelengthUnderscoretooUnderscorelong :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsLinkUnderscorelengthUnderscoretooUnderscorelong :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsMalformedUnderscorexml :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsRedirectUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsPriceUnderscoremissing :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsFeedUnderscoretooUnderscoresmall :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsConditionUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsShopifyUnderscorenoUnderscoreproducts :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsMaxUnderscoreitemsUnderscoreperUnderscoreitemUnderscoregroupUnderscoreexceeded :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsItemUnderscoremainUnderscoreimageUnderscoredownloadUnderscorefailure :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsPinjoinUnderscorecontentUnderscoreunsafe :: Maybe Int -- ^ 
  , catalogsFeedValidationErrorsBlocklistedUnderscoreimageUnderscoresignature :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedValidationErrors where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedValidationErrors")
instance ToJSON CatalogsFeedValidationErrors where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedValidationErrors")


-- | 
data CatalogsFeedValidationWarnings = CatalogsFeedValidationWarnings
  { catalogsFeedValidationWarningsTitleUnderscorelengthUnderscoretooUnderscorelong :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsDescriptionUnderscorelengthUnderscoretooUnderscorelong :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsGenderUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsAgeUnderscoregroupUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsSizeUnderscoretypeUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsLinkUnderscoreformatUnderscorewarning :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsDuplicateUnderscoreproducts :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsDuplicateUnderscorelinks :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsSalesUnderscorepriceUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsProductUnderscorecategoryUnderscoredepthUnderscorewarning :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsAdwordsUnderscoresameUnderscoreasUnderscorelink :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsDuplicateUnderscoreheaders :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsFetchUnderscoresameUnderscoresignature :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsAdwordsUnderscoreformatUnderscorewarning :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsAdditionalUnderscoreimageUnderscorelinkUnderscorewarning :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsImageUnderscorelinkUnderscorewarning :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsShippingUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsTaxUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsShippingUnderscoreweightUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsExpirationUnderscoredateUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsAvailabilityUnderscoredateUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsSaleUnderscoredateUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsWeightUnderscoreunitUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsIsUnderscorebundleUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsUpdatedUnderscoretimeUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsCustomUnderscorelabelUnderscorelengthUnderscoretooUnderscorelong :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsProductUnderscoretypeUnderscorelengthUnderscoretooUnderscorelong :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsTooUnderscoremanyUnderscoreadditionalUnderscoreimageUnderscorelinks :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsMultipackUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsIndexedUnderscoreproductUnderscorecountUnderscorelargeUnderscoredelta :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsItemUnderscoreadditionalUnderscoreimageUnderscoredownloadUnderscorefailure :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsOptionalUnderscoreproductUnderscorecategoryUnderscoremissing :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsOptionalUnderscoreproductUnderscorecategoryUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsOptionalUnderscoreconditionUnderscoremissing :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsOptionalUnderscoreconditionUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsIosUnderscoredeepUnderscorelinkUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsAndroidUnderscoredeepUnderscorelinkUnderscoreinvalid :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsAvailabilityUnderscorenormalized :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsConditionUnderscorenormalized :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsGenderUnderscorenormalized :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsSizeUnderscoretypeUnderscorenormalized :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsAgeUnderscoregroupUnderscorenormalized :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsUtmUnderscoresourceUnderscoreautoUnderscorecorrected :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsCountryUnderscoredoesUnderscorenotUnderscoremapUnderscoretoUnderscorecurrency :: Maybe Int -- ^ 
  , catalogsFeedValidationWarningsMinUnderscoreadUnderscorepriceUnderscoreinvalid :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedValidationWarnings where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedValidationWarnings")
instance ToJSON CatalogsFeedValidationWarnings where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedValidationWarnings")


-- | Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
data CatalogsFeedsCreateRequest = CatalogsFeedsCreateRequest
  { catalogsFeedsCreateRequestDefaultUnderscorecountry :: Maybe Country -- ^ 
  , catalogsFeedsCreateRequestDefaultUnderscoreavailability :: Maybe ProductAvailabilityType -- ^ 
  , catalogsFeedsCreateRequestDefaultUnderscorecurrency :: Maybe NullableCurrency -- ^ 
  , catalogsFeedsCreateRequestName :: Text -- ^ A human-friendly name associated to a given feed.
  , catalogsFeedsCreateRequestFormat :: CatalogsFormat -- ^ 
  , catalogsFeedsCreateRequestDefaultUnderscorelocale :: Maybe Text -- ^ The locale used within a feed for product descriptions.
  , catalogsFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials -- ^ 
  , catalogsFeedsCreateRequestLocation :: Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , catalogsFeedsCreateRequestPreferredUnderscoreprocessingUnderscoreschedule :: Maybe CatalogsFeedProcessingSchedule -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFeedsCreateRequest where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedsCreateRequest")
instance ToJSON CatalogsFeedsCreateRequest where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedsCreateRequest")


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
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFeedsUpdateRequest")
instance ToJSON CatalogsFeedsUpdateRequest where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFeedsUpdateRequest")


-- | The file format of a feed.
data CatalogsFormat = CatalogsFormat
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsFormat where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsFormat")
instance ToJSON CatalogsFormat where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsFormat")


-- | Response object of catalogs items
data CatalogsItems = CatalogsItems
  { catalogsItemsItems :: Maybe [ItemBatchRecord] -- ^ Array with catalogs items
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItems where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsItems")
instance ToJSON CatalogsItems where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsItems")


-- | Object describing the catalogs items batch
data CatalogsItemsBatch = CatalogsItemsBatch
  { catalogsItemsBatchItems :: Maybe [ItemProcessingRecord] -- ^ Array with the catalogs items processing records part of the catalogs items batch
  , catalogsItemsBatchBatchUnderscoreid :: Maybe Text -- ^ Id of the catalogs items batch
  , catalogsItemsBatchCreatedUnderscoretime :: Maybe UTCTime -- ^ Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
  , catalogsItemsBatchCompletedUnderscoretime :: Maybe UTCTime -- ^ Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
  , catalogsItemsBatchStatus :: Maybe BatchOperationStatus -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemsBatch where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsItemsBatch")
instance ToJSON CatalogsItemsBatch where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsItemsBatch")


-- | Request object of catalogs items batch
data CatalogsItemsBatchRequest = CatalogsItemsBatchRequest
  { catalogsItemsBatchRequestCountry :: Maybe Country -- ^ 
  , catalogsItemsBatchRequestLanguage :: Maybe Language -- ^ 
  , catalogsItemsBatchRequestOperation :: Maybe BatchOperation -- ^ 
  , catalogsItemsBatchRequestItems :: Maybe [ItemBatchRecord] -- ^ Array with catalogs items
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsItemsBatchRequest where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsItemsBatchRequest")
instance ToJSON CatalogsItemsBatchRequest where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsItemsBatchRequest")


-- | catalog product group entity
data CatalogsProductGroup = CatalogsProductGroup
  { catalogsProductGroupId :: Text -- ^ ID of the catalog product group.
  , catalogsProductGroupName :: Maybe Text -- ^ Name of catalog product group
  , catalogsProductGroupDescription :: Maybe Text -- ^ 
  , catalogsProductGroupFilters :: CatalogsProductGroupFilters -- ^ 
  , catalogsProductGroupType :: Maybe CatalogsProductGroupType -- ^ 
  , catalogsProductGroupStatus :: Maybe CatalogsProductGroupStatus -- ^ 
  , catalogsProductGroupFeedUnderscoreid :: Maybe Text -- ^ id of the catalogs feed belonging to this catalog product group
  , catalogsProductGroupCreatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of when catalog product group was created.
  , catalogsProductGroupUpdatedUnderscoreat :: Maybe Int -- ^ Unix timestamp in seconds of last time catalog product group was updated.
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroup where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroup")
instance ToJSON CatalogsProductGroup where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroup")


-- | Request object for creating a product group.
data CatalogsProductGroupCreateRequest = CatalogsProductGroupCreateRequest
  { catalogsProductGroupCreateRequestFeedUnderscoreid :: Text -- ^ Catalog Feed id pertaining to the catalog product group.
  , catalogsProductGroupCreateRequestName :: Text -- ^ 
  , catalogsProductGroupCreateRequestDescription :: Maybe Text -- ^ 
  , catalogsProductGroupCreateRequestFilters :: CatalogsProductGroupFilters -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupCreateRequest where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupCreateRequest")
instance ToJSON CatalogsProductGroupCreateRequest where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupCreateRequest")


-- | 
data CatalogsProductGroupCurrencyCriteria = CatalogsProductGroupCurrencyCriteria
  { catalogsProductGroupCurrencyCriteriaValues :: NonNullableCatalogsCurrency -- ^ 
  , catalogsProductGroupCurrencyCriteriaNegated :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupCurrencyCriteria where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupCurrencyCriteria")
instance ToJSON CatalogsProductGroupCurrencyCriteria where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupCurrencyCriteria")


-- | 
data CatalogsProductGroupFilterKeys = CatalogsProductGroupFilterKeys
  { catalogsProductGroupFilterKeysMINUnderscorePRICE :: CatalogsProductGroupPricingCriteria -- ^ 
  , catalogsProductGroupFilterKeysMAXUnderscorePRICE :: CatalogsProductGroupPricingCriteria -- ^ 
  , catalogsProductGroupFilterKeysCURRENCY :: CatalogsProductGroupCurrencyCriteria -- ^ 
  , catalogsProductGroupFilterKeysITEMUnderscoreID :: CatalogsProductGroupCurrencyCriteria -- ^ 
  , catalogsProductGroupFilterKeysAVAILABILITY :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysBRAND :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCONDITION :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore0 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore1 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore2 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore3 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysCUSTOMUnderscoreLABELUnderscore4 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysITEMUnderscoreGROUPUnderscoreID :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  , catalogsProductGroupFilterKeysGENDER :: CatalogsProductGroupMultipleStringCriteria -- ^ 
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
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupFilterKeys")
instance ToJSON CatalogsProductGroupFilterKeys where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupFilterKeys")


-- | Object holding a group of filters for a catalog product group
data CatalogsProductGroupFilters = CatalogsProductGroupFilters
  { catalogsProductGroupFiltersAnyUnderscoreof :: Maybe [CatalogsProductGroupFilterKeys] -- ^ 
  , catalogsProductGroupFiltersAllUnderscoreof :: Maybe [CatalogsProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupFilters where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupFilters")
instance ToJSON CatalogsProductGroupFilters where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupFilters")


-- | 
data CatalogsProductGroupFiltersAllOf = CatalogsProductGroupFiltersAllOf
  { catalogsProductGroupFiltersAllOfAllUnderscoreof :: Maybe [CatalogsProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupFiltersAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupFiltersAllOf")
instance ToJSON CatalogsProductGroupFiltersAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupFiltersAllOf")


-- | 
data CatalogsProductGroupFiltersAnyOf = CatalogsProductGroupFiltersAnyOf
  { catalogsProductGroupFiltersAnyOfAnyUnderscoreof :: Maybe [CatalogsProductGroupFilterKeys] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupFiltersAnyOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupFiltersAnyOf")
instance ToJSON CatalogsProductGroupFiltersAnyOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupFiltersAnyOf")


-- | 
data CatalogsProductGroupMultipleStringCriteria = CatalogsProductGroupMultipleStringCriteria
  { catalogsProductGroupMultipleStringCriteriaValues :: [Text] -- ^ 
  , catalogsProductGroupMultipleStringCriteriaNegated :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupMultipleStringCriteria where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupMultipleStringCriteria")
instance ToJSON CatalogsProductGroupMultipleStringCriteria where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupMultipleStringCriteria")


-- | 
data CatalogsProductGroupMultipleStringListCriteria = CatalogsProductGroupMultipleStringListCriteria
  { catalogsProductGroupMultipleStringListCriteriaValues :: [[Text]] -- ^ 
  , catalogsProductGroupMultipleStringListCriteriaNegated :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupMultipleStringListCriteria where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupMultipleStringListCriteria")
instance ToJSON CatalogsProductGroupMultipleStringListCriteria where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupMultipleStringListCriteria")


-- | 
data CatalogsProductGroupPricingCriteria = CatalogsProductGroupPricingCriteria
  { catalogsProductGroupPricingCriteriaInclusion :: Bool -- ^ 
  , catalogsProductGroupPricingCriteriaValues :: Double -- ^ 
  , catalogsProductGroupPricingCriteriaNegated :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupPricingCriteria where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupPricingCriteria")
instance ToJSON CatalogsProductGroupPricingCriteria where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupPricingCriteria")


-- | 
data CatalogsProductGroupStatus = CatalogsProductGroupStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupStatus")
instance ToJSON CatalogsProductGroupStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupStatus")


-- | Catalog product group type
data CatalogsProductGroupType = CatalogsProductGroupType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupType")
instance ToJSON CatalogsProductGroupType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupType")


-- | Request object for updating a product group.
data CatalogsProductGroupUpdateRequest = CatalogsProductGroupUpdateRequest
  { catalogsProductGroupUpdateRequestFeedUnderscoreid :: Text -- ^ Catalog Feed id pertaining to the catalog product group.
  , catalogsProductGroupUpdateRequestName :: Text -- ^ 
  , catalogsProductGroupUpdateRequestDescription :: Maybe Text -- ^ 
  , catalogsProductGroupUpdateRequestFilters :: CatalogsProductGroupFilters -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsProductGroupUpdateRequest where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsProductGroupUpdateRequest")
instance ToJSON CatalogsProductGroupUpdateRequest where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsProductGroupUpdateRequest")


-- | Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
data CatalogsStatus = CatalogsStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CatalogsStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "catalogsStatus")
instance ToJSON CatalogsStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "catalogsStatus")


-- | 
data ConditionFilter = ConditionFilter
  { conditionFilterCONDITION :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ConditionFilter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "conditionFilter")
instance ToJSON ConditionFilter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "conditionFilter")


-- | 
data ConversionAttributionWindowDays = ConversionAttributionWindowDays
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionAttributionWindowDays where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "conversionAttributionWindowDays")
instance ToJSON ConversionAttributionWindowDays where
  toJSON = genericToJSON (removeFieldLabelPrefix False "conversionAttributionWindowDays")


-- | Attribution type. Refers to the Pinterest Tag endpoints
data ConversionReportAttributionType = ConversionReportAttributionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionReportAttributionType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "conversionReportAttributionType")
instance ToJSON ConversionReportAttributionType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "conversionReportAttributionType")


-- | Conversion report time type
data ConversionReportTimeType = ConversionReportTimeType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ConversionReportTimeType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "conversionReportTimeType")
instance ToJSON ConversionReportTimeType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "conversionReportTimeType")


-- | Country ID from ISO 3166-1 alpha-2.
data Country = Country
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON Country where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "country")
instance ToJSON Country where
  toJSON = genericToJSON (removeFieldLabelPrefix False "country")


-- | Currency Codes from ISO 4217
data Currency = Currency
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON Currency where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "currency")
instance ToJSON Currency where
  toJSON = genericToJSON (removeFieldLabelPrefix False "currency")


-- | 
data CurrencyFilter = CurrencyFilter
  { currencyFilterCURRENCY :: CatalogsProductGroupCurrencyCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CurrencyFilter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "currencyFilter")
instance ToJSON CurrencyFilter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "currencyFilter")


-- | 
data CustomLabel0Filter = CustomLabel0Filter
  { customLabel0FilterCUSTOMUnderscoreLABELUnderscore0 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomLabel0Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "customLabel0Filter")
instance ToJSON CustomLabel0Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "customLabel0Filter")


-- | 
data CustomLabel1Filter = CustomLabel1Filter
  { customLabel1FilterCUSTOMUnderscoreLABELUnderscore1 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomLabel1Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "customLabel1Filter")
instance ToJSON CustomLabel1Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "customLabel1Filter")


-- | 
data CustomLabel2Filter = CustomLabel2Filter
  { customLabel2FilterCUSTOMUnderscoreLABELUnderscore2 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomLabel2Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "customLabel2Filter")
instance ToJSON CustomLabel2Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "customLabel2Filter")


-- | 
data CustomLabel3Filter = CustomLabel3Filter
  { customLabel3FilterCUSTOMUnderscoreLABELUnderscore3 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomLabel3Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "customLabel3Filter")
instance ToJSON CustomLabel3Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "customLabel3Filter")


-- | 
data CustomLabel4Filter = CustomLabel4Filter
  { customLabel4FilterCUSTOMUnderscoreLABELUnderscore4 :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CustomLabel4Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "customLabel4Filter")
instance ToJSON CustomLabel4Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "customLabel4Filter")


-- | Format of generated report
data DataOutputFormat = DataOutputFormat
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON DataOutputFormat where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dataOutputFormat")
instance ToJSON DataOutputFormat where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dataOutputFormat")


-- | Entity status
data EntityStatus = EntityStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON EntityStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "entityStatus")
instance ToJSON EntityStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "entityStatus")


-- | 
data Error = Error
  { errorCode :: Int -- ^ 
  , errorMessage :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Error where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "error")
instance ToJSON Error where
  toJSON = genericToJSON (removeFieldLabelPrefix False "error")


-- | 
data FeedFields = FeedFields
  { feedFieldsDefaultUnderscorecountry :: Country -- ^ 
  , feedFieldsDefaultUnderscoreavailability :: ProductAvailabilityType -- ^ 
  , feedFieldsDefaultUnderscorecurrency :: NullableCurrency -- ^ 
  , feedFieldsName :: Text -- ^ A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  , feedFieldsFormat :: CatalogsFormat -- ^ 
  , feedFieldsDefaultUnderscorelocale :: Text -- ^ The locale used within a feed for product descriptions.
  , feedFieldsCredentials :: CatalogsFeedCredentials -- ^ 
  , feedFieldsLocation :: Text -- ^ The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  , feedFieldsPreferredUnderscoreprocessingUnderscoreschedule :: CatalogsFeedProcessingSchedule -- ^ 
  , feedFieldsStatus :: CatalogsStatus -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedFields where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "feedFields")
instance ToJSON FeedFields where
  toJSON = genericToJSON (removeFieldLabelPrefix False "feedFields")


-- | 
data GenderFilter = GenderFilter
  { genderFilterGENDER :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GenderFilter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "genderFilter")
instance ToJSON GenderFilter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "genderFilter")


-- | 
data GoogleProductCategory0Filter = GoogleProductCategory0Filter
  { googleProductCategory0FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore0 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory0Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "googleProductCategory0Filter")
instance ToJSON GoogleProductCategory0Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "googleProductCategory0Filter")


-- | 
data GoogleProductCategory1Filter = GoogleProductCategory1Filter
  { googleProductCategory1FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore1 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory1Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "googleProductCategory1Filter")
instance ToJSON GoogleProductCategory1Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "googleProductCategory1Filter")


-- | 
data GoogleProductCategory2Filter = GoogleProductCategory2Filter
  { googleProductCategory2FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore2 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory2Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "googleProductCategory2Filter")
instance ToJSON GoogleProductCategory2Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "googleProductCategory2Filter")


-- | 
data GoogleProductCategory3Filter = GoogleProductCategory3Filter
  { googleProductCategory3FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore3 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory3Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "googleProductCategory3Filter")
instance ToJSON GoogleProductCategory3Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "googleProductCategory3Filter")


-- | 
data GoogleProductCategory4Filter = GoogleProductCategory4Filter
  { googleProductCategory4FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore4 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory4Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "googleProductCategory4Filter")
instance ToJSON GoogleProductCategory4Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "googleProductCategory4Filter")


-- | 
data GoogleProductCategory5Filter = GoogleProductCategory5Filter
  { googleProductCategory5FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore5 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory5Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "googleProductCategory5Filter")
instance ToJSON GoogleProductCategory5Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "googleProductCategory5Filter")


-- | 
data GoogleProductCategory6Filter = GoogleProductCategory6Filter
  { googleProductCategory6FilterGOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore6 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoogleProductCategory6Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "googleProductCategory6Filter")
instance ToJSON GoogleProductCategory6Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "googleProductCategory6Filter")


-- | 
data Granularity = Granularity
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON Granularity where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "granularity")
instance ToJSON Granularity where
  toJSON = genericToJSON (removeFieldLabelPrefix False "granularity")


-- | 
data ImageDetails = ImageDetails
  { imageDetailsWidth :: Int -- ^ 
  , imageDetailsHeight :: Int -- ^ 
  , imageDetailsUrl :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ImageDetails where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "imageDetails")
instance ToJSON ImageDetails where
  toJSON = genericToJSON (removeFieldLabelPrefix False "imageDetails")


-- | 
data ItemAttributes = ItemAttributes
  { itemAttributesAdUnderscorelink :: Maybe Text -- ^ Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
  , itemAttributesAdditionalUnderscoreimageUnderscorelink :: Maybe [Text] -- ^ The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://
  , itemAttributesAdult :: Maybe Bool -- ^ Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
  , itemAttributesAgeUnderscoregroup :: Maybe Text -- ^ The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.
  , itemAttributesAvailability :: Maybe Text -- ^ The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.
  , itemAttributesAverageUnderscorereviewUnderscorerating :: Maybe Double -- ^ Average reviews for the item. Can be a number from 1-5.
  , itemAttributesBrand :: Maybe Text -- ^ The brand of the product.
  , itemAttributesColor :: Maybe Text -- ^ The primary color of the product.
  , itemAttributesCondition :: Maybe Text -- ^ The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.
  , itemAttributesCustomUnderscorelabelUnderscore0 :: Maybe Text -- ^ Custom grouping of products.
  , itemAttributesCustomUnderscorelabelUnderscore1 :: Maybe Text -- ^ Custom grouping of products.
  , itemAttributesCustomUnderscorelabelUnderscore2 :: Maybe Text -- ^ Custom grouping of products.
  , itemAttributesCustomUnderscorelabelUnderscore3 :: Maybe Text -- ^ Custom grouping of products.
  , itemAttributesCustomUnderscorelabelUnderscore4 :: Maybe Text -- ^ Custom grouping of products.
  , itemAttributesDescription :: Maybe Text -- ^ The description of the product.
  , itemAttributesFreeUnderscoreshippingUnderscorelabel :: Maybe Bool -- ^ The item is free to ship.
  , itemAttributesFreeUnderscoreshippingUnderscorelimit :: Maybe Text -- ^ The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
  , itemAttributesGender :: Maybe Text -- ^ The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.
  , itemAttributesGoogleUnderscoreproductUnderscorecategory :: Maybe Text -- ^ The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  , itemAttributesGtin :: Maybe Int -- ^ The unique universal product identifier.
  , itemAttributesId :: Maybe Text -- ^ The user-created unique ID that represents the product. Only Unicode characters are accepted.
  , itemAttributesImageUnderscorelink :: Maybe [Text] -- ^ The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://
  , itemAttributesItemUnderscoregroupUnderscoreid :: Maybe Text -- ^ The parent ID of the product.
  , itemAttributesLastUnderscoreupdatedUnderscoretime :: Maybe Int64 -- ^ The millisecond timestamp when the item was lastly modified by the merchant.
  , itemAttributesLink :: Maybe Text -- ^ The landing page for the product.
  , itemAttributesMaterial :: Maybe Text -- ^ The material used to make the product.
  , itemAttributesMinUnderscoreadUnderscoreprice :: Maybe Text -- ^ The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
  , itemAttributesMobileUnderscorelink :: Maybe Text -- ^ The mobile-optimized version of your landing page. Must begin with http:// or https://.
  , itemAttributesMpn :: Maybe Text -- ^ Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
  , itemAttributesNumberUnderscoreofUnderscoreratings :: Maybe Int -- ^ The number of ratings for the item.
  , itemAttributesNumberUnderscoreofUnderscorereviews :: Maybe Int -- ^ The number of reviews available for the item.
  , itemAttributesPattern :: Maybe Text -- ^ The description of the pattern used for the product.
  , itemAttributesPrice :: Maybe Text -- ^ The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  , itemAttributesProductUnderscoretype :: Maybe Text -- ^ The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.
  , itemAttributesSaleUnderscoreprice :: Maybe Text -- ^ The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
  , itemAttributesShipping :: Maybe Text -- ^ Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
  , itemAttributesShippingUnderscoreheight :: Maybe Text -- ^ The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  , itemAttributesShippingUnderscoreweight :: Maybe Text -- ^ The weight of the product. Ensure there is a space between the numeric string and the metric.
  , itemAttributesShippingUnderscorewidth :: Maybe Text -- ^ The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  , itemAttributesSize :: Maybe Text -- ^ The size of the product.
  , itemAttributesSizeUnderscoresystem :: Maybe Text -- ^ Indicates the country’s sizing system in which you are submitting your product.
  , itemAttributesSizeUnderscoretype :: Maybe Text -- ^ Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.
  , itemAttributesTax :: Maybe Text -- ^ Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
  , itemAttributesTitle :: Maybe Text -- ^ The name of the product.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemAttributes where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "itemAttributes")
instance ToJSON ItemAttributes where
  toJSON = genericToJSON (removeFieldLabelPrefix False "itemAttributes")


-- | Object describing an item batch record
data ItemBatchRecord = ItemBatchRecord
  { itemBatchRecordItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  , itemBatchRecordAttributes :: Maybe ItemAttributes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemBatchRecord where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "itemBatchRecord")
instance ToJSON ItemBatchRecord where
  toJSON = genericToJSON (removeFieldLabelPrefix False "itemBatchRecord")


-- | 
data ItemGroupIdFilter = ItemGroupIdFilter
  { itemGroupIdFilterITEMUnderscoreGROUPUnderscoreID :: CatalogsProductGroupMultipleStringCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemGroupIdFilter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "itemGroupIdFilter")
instance ToJSON ItemGroupIdFilter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "itemGroupIdFilter")


-- | 
data ItemIdFilter = ItemIdFilter
  { itemIdFilterITEMUnderscoreID :: CatalogsProductGroupCurrencyCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemIdFilter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "itemIdFilter")
instance ToJSON ItemIdFilter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "itemIdFilter")


-- | Object describing an item processing record
data ItemProcessingRecord = ItemProcessingRecord
  { itemProcessingRecordItemUnderscoreid :: Maybe Text -- ^ The catalog item id in the merchant namespace
  , itemProcessingRecordErrors :: Maybe [ItemValidationEvent] -- ^ Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  , itemProcessingRecordWarnings :: Maybe [ItemValidationEvent] -- ^ Array with the validation warnings for the item processing record
  , itemProcessingRecordStatus :: Maybe ItemProcessingStatus -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemProcessingRecord where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "itemProcessingRecord")
instance ToJSON ItemProcessingRecord where
  toJSON = genericToJSON (removeFieldLabelPrefix False "itemProcessingRecord")


-- | The status of the item processing record
data ItemProcessingStatus = ItemProcessingStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemProcessingStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "itemProcessingStatus")
instance ToJSON ItemProcessingStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "itemProcessingStatus")


-- | Object describing an item validation event
data ItemValidationEvent = ItemValidationEvent
  { itemValidationEventAttribute :: Maybe Text -- ^ The attribute that the item validation event references
  , itemValidationEventCode :: Maybe Int -- ^ The event code that the item validation event references
  , itemValidationEventMessage :: Maybe Text -- ^ Title message describing the item validation event
  } deriving (Show, Eq, Generic)

instance FromJSON ItemValidationEvent where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "itemValidationEvent")
instance ToJSON ItemValidationEvent where
  toJSON = genericToJSON (removeFieldLabelPrefix False "itemValidationEvent")


-- | Language code, which is among the offical ISO 639-1 language list.
data Language = Language
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON Language where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "language")
instance ToJSON Language where
  toJSON = genericToJSON (removeFieldLabelPrefix False "language")


-- | 
data MaxPriceFilter = MaxPriceFilter
  { maxPriceFilterMAXUnderscorePRICE :: CatalogsProductGroupPricingCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MaxPriceFilter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "maxPriceFilter")
instance ToJSON MaxPriceFilter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "maxPriceFilter")


-- | Media upload that has been registered but not uploaded/processed yet.
data MediaUpload = MediaUpload
  { mediaUploadMediaUnderscoreid :: Maybe Text -- ^ Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  , mediaUploadMediaUnderscoretype :: Maybe MediaUploadType -- ^ 
  , mediaUploadUploadUnderscoreurl :: Maybe Text -- ^ The URL where you will POST your media file.
  , mediaUploadUploadUnderscoreparameters :: Maybe MediaUploadAllOfUploadParameters -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUpload where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "mediaUpload")
instance ToJSON MediaUpload where
  toJSON = genericToJSON (removeFieldLabelPrefix False "mediaUpload")


-- | 
data MediaUploadAllOf = MediaUploadAllOf
  { mediaUploadAllOfMediaUnderscoreid :: Maybe Text -- ^ Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  , mediaUploadAllOfMediaUnderscoretype :: Maybe MediaUploadType -- ^ 
  , mediaUploadAllOfUploadUnderscoreurl :: Maybe Text -- ^ The URL where you will POST your media file.
  , mediaUploadAllOfUploadUnderscoreparameters :: Maybe MediaUploadAllOfUploadParameters -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUploadAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "mediaUploadAllOf")
instance ToJSON MediaUploadAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "mediaUploadAllOf")


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
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "mediaUploadAllOfUploadParameters")
instance ToJSON MediaUploadAllOfUploadParameters where
  toJSON = genericToJSON (removeFieldLabelPrefix False "mediaUploadAllOfUploadParameters")


-- | Media upload details
data MediaUploadDetails = MediaUploadDetails
  { mediaUploadDetailsMediaUnderscoreid :: Maybe Text -- ^ 
  , mediaUploadDetailsMediaUnderscoretype :: Maybe MediaUploadType -- ^ 
  , mediaUploadDetailsStatus :: Maybe MediaUploadStatus -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUploadDetails where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "mediaUploadDetails")
instance ToJSON MediaUploadDetails where
  toJSON = genericToJSON (removeFieldLabelPrefix False "mediaUploadDetails")


-- | Media upload request
data MediaUploadRequest = MediaUploadRequest
  { mediaUploadRequestMediaUnderscoretype :: MediaUploadType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUploadRequest where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "mediaUploadRequest")
instance ToJSON MediaUploadRequest where
  toJSON = genericToJSON (removeFieldLabelPrefix False "mediaUploadRequest")


-- | Media upload status
data MediaUploadStatus = MediaUploadStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUploadStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "mediaUploadStatus")
instance ToJSON MediaUploadStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "mediaUploadStatus")


-- | 
data MediaUploadType = MediaUploadType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON MediaUploadType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "mediaUploadType")
instance ToJSON MediaUploadType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "mediaUploadType")


-- | Level of the reporting request
data MetricsReportingLevel = MetricsReportingLevel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON MetricsReportingLevel where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "metricsReportingLevel")
instance ToJSON MetricsReportingLevel where
  toJSON = genericToJSON (removeFieldLabelPrefix False "metricsReportingLevel")


-- | 
data MinPriceFilter = MinPriceFilter
  { minPriceFilterMINUnderscorePRICE :: CatalogsProductGroupPricingCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MinPriceFilter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "minPriceFilter")
instance ToJSON MinPriceFilter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "minPriceFilter")


-- | Currency Codes from ISO 4217.
data NonNullableCatalogsCurrency = NonNullableCatalogsCurrency
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON NonNullableCatalogsCurrency where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "nonNullableCatalogsCurrency")
instance ToJSON NonNullableCatalogsCurrency where
  toJSON = genericToJSON (removeFieldLabelPrefix False "nonNullableCatalogsCurrency")


-- | Currency Codes from ISO 4217.
data NullableCurrency = NullableCurrency
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON NullableCurrency where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "nullableCurrency")
instance ToJSON NullableCurrency where
  toJSON = genericToJSON (removeFieldLabelPrefix False "nullableCurrency")


-- | Describes the valid schema for possible OAuth access token requests.
data OauthAccessTokenRequest = OauthAccessTokenRequest
  { oauthAccessTokenRequestGrantUnderscoretype :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OauthAccessTokenRequest where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "oauthAccessTokenRequest")
instance ToJSON OauthAccessTokenRequest where
  toJSON = genericToJSON (removeFieldLabelPrefix False "oauthAccessTokenRequest")


-- | A request to exchange an authorization code for an access token.
newtype OauthAccessTokenRequestCode = OauthAccessTokenRequestCode { unOauthAccessTokenRequestCode :: OauthAccessTokenRequest }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data OauthAccessTokenRequestCodeAllOf = OauthAccessTokenRequestCodeAllOf
  { oauthAccessTokenRequestCodeAllOfCode :: Text -- ^ 
  , oauthAccessTokenRequestCodeAllOfRedirectUnderscoreuri :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OauthAccessTokenRequestCodeAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "oauthAccessTokenRequestCodeAllOf")
instance ToJSON OauthAccessTokenRequestCodeAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "oauthAccessTokenRequestCodeAllOf")


-- | A request to exchange a refresh token for a new access token.
newtype OauthAccessTokenRequestRefresh = OauthAccessTokenRequestRefresh { unOauthAccessTokenRequestRefresh :: OauthAccessTokenRequest }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data OauthAccessTokenRequestRefreshAllOf = OauthAccessTokenRequestRefreshAllOf
  { oauthAccessTokenRequestRefreshAllOfRefreshUnderscoretoken :: Text -- ^ 
  , oauthAccessTokenRequestRefreshAllOfScope :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OauthAccessTokenRequestRefreshAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "oauthAccessTokenRequestRefreshAllOf")
instance ToJSON OauthAccessTokenRequestRefreshAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "oauthAccessTokenRequestRefreshAllOf")


-- | A successful OAuth access token response.
data OauthAccessTokenResponse = OauthAccessTokenResponse
  { oauthAccessTokenResponseResponseUnderscoretype :: Maybe Text -- ^ 
  , oauthAccessTokenResponseAccessUnderscoretoken :: Text -- ^ 
  , oauthAccessTokenResponseTokenUnderscoretype :: Text -- ^ 
  , oauthAccessTokenResponseExpiresUnderscorein :: Int -- ^ 
  , oauthAccessTokenResponseScope :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OauthAccessTokenResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "oauthAccessTokenResponse")
instance ToJSON OauthAccessTokenResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "oauthAccessTokenResponse")


-- | A successful OAuth access token response for the authorization code flow.
newtype OauthAccessTokenResponseCode = OauthAccessTokenResponseCode { unOauthAccessTokenResponseCode :: OauthAccessTokenResponse }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data OauthAccessTokenResponseCodeAllOf = OauthAccessTokenResponseCodeAllOf
  { oauthAccessTokenResponseCodeAllOfRefreshUnderscoretoken :: Text -- ^ 
  , oauthAccessTokenResponseCodeAllOfRefreshUnderscoretokenUnderscoreexpiresUnderscorein :: Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OauthAccessTokenResponseCodeAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "oauthAccessTokenResponseCodeAllOf")
instance ToJSON OauthAccessTokenResponseCodeAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "oauthAccessTokenResponseCodeAllOf")


-- | A successful OAuth access token response for the refresh token flow.
newtype OauthAccessTokenResponseRefresh = OauthAccessTokenResponseRefresh { unOauthAccessTokenResponseRefresh :: OauthAccessTokenResponse }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | Campaign objective type.
data ObjectiveType = ObjectiveType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ObjectiveType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "objectiveType")
instance ToJSON ObjectiveType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "objectiveType")


-- | Ad group pacing delivery type
data PacingDeliveryType = PacingDeliveryType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PacingDeliveryType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pacingDeliveryType")
instance ToJSON PacingDeliveryType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pacingDeliveryType")


-- | 
data Paginated = Paginated
  { paginatedItems :: [Object] -- ^ 
  , paginatedBookmark :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Paginated where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "paginated")
instance ToJSON Paginated where
  toJSON = genericToJSON (removeFieldLabelPrefix False "paginated")


-- | Pin
data Pin = Pin
  { pinId :: Maybe Text -- ^ 
  , pinCreatedUnderscoreat :: Maybe UTCTime -- ^ 
  , pinLink :: Maybe Text -- ^ 
  , pinTitle :: Maybe Text -- ^ 
  , pinDescription :: Maybe Text -- ^ 
  , pinAltUnderscoretext :: Maybe Text -- ^ 
  , pinBoardUnderscoreid :: Maybe Text -- ^ The board to which this Pin belongs.
  , pinBoardUnderscoresectionUnderscoreid :: Maybe Text -- ^ The board section to which this Pin belongs.
  , pinBoardUnderscoreowner :: Maybe BoardOwner -- ^ 
  , pinMedia :: Maybe PinMedia -- ^ 
  , pinMediaUnderscoresource :: Maybe PinMediaSource -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Pin where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pin")
instance ToJSON Pin where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pin")


-- | Pin media objects.
data PinMedia = PinMedia
  { pinMediaMediaUnderscoretype :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PinMedia where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pinMedia")
instance ToJSON PinMedia where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pinMedia")


-- | Pin media source.
data PinMediaSource = PinMediaSource
  { pinMediaSourceSourceUnderscoretype :: Text -- ^ 
  , pinMediaSourceContentUnderscoretype :: Text -- ^ 
  , pinMediaSourceData :: Text -- ^ 
  , pinMediaSourceUrl :: Text -- ^ 
  , pinMediaSourceCoverUnderscoreimageUnderscoreurl :: Text -- ^ 
  , pinMediaSourceMediaUnderscoreid :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSource where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pinMediaSource")
instance ToJSON PinMediaSource where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pinMediaSource")


-- | Base64-encoded image media source
data PinMediaSourceImageBase64 = PinMediaSourceImageBase64
  { pinMediaSourceImageBase64SourceUnderscoretype :: Text -- ^ 
  , pinMediaSourceImageBase64ContentUnderscoretype :: Text -- ^ 
  , pinMediaSourceImageBase64Data :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSourceImageBase64 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pinMediaSourceImageBase64")
instance ToJSON PinMediaSourceImageBase64 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pinMediaSourceImageBase64")


-- | Image URL-based media source
data PinMediaSourceImageURL = PinMediaSourceImageURL
  { pinMediaSourceImageURLSourceUnderscoretype :: Text -- ^ 
  , pinMediaSourceImageURLUrl :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSourceImageURL where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pinMediaSourceImageURL")
instance ToJSON PinMediaSourceImageURL where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pinMediaSourceImageURL")


-- | Video ID-based media source
data PinMediaSourceVideoID = PinMediaSourceVideoID
  { pinMediaSourceVideoIDSourceUnderscoretype :: Text -- ^ 
  , pinMediaSourceVideoIDCoverUnderscoreimageUnderscoreurl :: Text -- ^ 
  , pinMediaSourceVideoIDMediaUnderscoreid :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaSourceVideoID where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pinMediaSourceVideoID")
instance ToJSON PinMediaSourceVideoID where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pinMediaSourceVideoID")


-- | Pin with image.
newtype PinMediaWithImage = PinMediaWithImage { unPinMediaWithImage :: PinMedia }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data PinMediaWithImageAllOf = PinMediaWithImageAllOf
  { pinMediaWithImageAllOfImages :: Maybe (Map.Map String ImageDetails) -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PinMediaWithImageAllOf where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pinMediaWithImageAllOf")
instance ToJSON PinMediaWithImageAllOf where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pinMediaWithImageAllOf")


-- | Summary status for pin promotions
data PinPromotionSummaryStatus = PinPromotionSummaryStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PinPromotionSummaryStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pinPromotionSummaryStatus")
instance ToJSON PinPromotionSummaryStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pinPromotionSummaryStatus")


-- | Campaign placement group type
data PlacementGroupType = PlacementGroupType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PlacementGroupType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "placementGroupType")
instance ToJSON PlacementGroupType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "placementGroupType")


-- | Default availability for products in a feed.
data ProductAvailabilityType = ProductAvailabilityType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductAvailabilityType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "productAvailabilityType")
instance ToJSON ProductAvailabilityType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "productAvailabilityType")


-- | Summary status for product group
data ProductGroupSummaryStatus = ProductGroupSummaryStatus
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductGroupSummaryStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "productGroupSummaryStatus")
instance ToJSON ProductGroupSummaryStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "productGroupSummaryStatus")


-- | 
data ProductType0Filter = ProductType0Filter
  { productType0FilterPRODUCTUnderscoreTYPEUnderscore0 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductType0Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "productType0Filter")
instance ToJSON ProductType0Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "productType0Filter")


-- | 
data ProductType1Filter = ProductType1Filter
  { productType1FilterPRODUCTUnderscoreTYPEUnderscore1 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductType1Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "productType1Filter")
instance ToJSON ProductType1Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "productType1Filter")


-- | 
data ProductType2Filter = ProductType2Filter
  { productType2FilterPRODUCTUnderscoreTYPEUnderscore2 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductType2Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "productType2Filter")
instance ToJSON ProductType2Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "productType2Filter")


-- | 
data ProductType3Filter = ProductType3Filter
  { productType3FilterPRODUCTUnderscoreTYPEUnderscore3 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductType3Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "productType3Filter")
instance ToJSON ProductType3Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "productType3Filter")


-- | 
data ProductType4Filter = ProductType4Filter
  { productType4FilterPRODUCTUnderscoreTYPEUnderscore4 :: CatalogsProductGroupMultipleStringListCriteria -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProductType4Filter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "productType4Filter")
instance ToJSON ProductType4Filter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "productType4Filter")


-- | Reporting columns
data ReportingColumnAsync = ReportingColumnAsync
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReportingColumnAsync where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "reportingColumnAsync")
instance ToJSON ReportingColumnAsync where
  toJSON = genericToJSON (removeFieldLabelPrefix False "reportingColumnAsync")


-- | 
data TargetingTypeFilter = TargetingTypeFilter
  { targetingTypeFilterTargetingUnderscoretypes :: Maybe [AdsAnalyticsTargetingType] -- ^ List of targeting types
  } deriving (Show, Eq, Generic)

instance FromJSON TargetingTypeFilter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "targetingTypeFilter")
instance ToJSON TargetingTypeFilter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "targetingTypeFilter")


-- | Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
data TrackingUrls = TrackingUrls
  { trackingUrlsImpression :: Maybe [Text] -- ^ 
  , trackingUrlsClick :: Maybe [Text] -- ^ 
  , trackingUrlsEngagement :: Maybe [Text] -- ^ 
  , trackingUrlsBuyableUnderscorebutton :: Maybe [Text] -- ^ 
  , trackingUrlsAudienceUnderscoreverification :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TrackingUrls where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "trackingUrls")
instance ToJSON TrackingUrls where
  toJSON = genericToJSON (removeFieldLabelPrefix False "trackingUrls")


uncapitalize :: String -> String
uncapitalize (c : cs) = Char.toLower c : cs
uncapitalize [] = []

-- | Remove a field label prefix during JSON parsing.
--   Also perform any replacements for special characters.
--   The @forParsing@ parameter is to distinguish between the cases in which we're using this
--   to power a @FromJSON@ or a @ToJSON@ instance. In the first case we're parsing, and we want
--   to replace special characters with their quoted equivalents (because we cannot have special
--   chars in identifier names), while we want to do vice versa when sending data instead.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix forParsing prefix =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = uncapitalize . fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars
    }
  where
    replaceSpecialChars field = foldl (&) field (map mkCharReplacement specialChars)
    specialChars =
      [ ("@", "'At")
      , ("\\", "'Back_Slash")
      , ("<=", "'Less_Than_Or_Equal_To")
      , ("\"", "'Double_Quote")
      , ("[", "'Left_Square_Bracket")
      , ("]", "'Right_Square_Bracket")
      , ("^", "'Caret")
      , ("_", "'Underscore")
      , ("`", "'Backtick")
      , ("!", "'Exclamation")
      , ("#", "'Hash")
      , ("$", "'Dollar")
      , ("%", "'Percent")
      , ("&", "'Ampersand")
      , ("'", "'Quote")
      , ("(", "'Left_Parenthesis")
      , (")", "'Right_Parenthesis")
      , ("*", "'Star")
      , ("+", "'Plus")
      , (",", "'Comma")
      , ("-", "'Dash")
      , (".", "'Period")
      , ("/", "'Slash")
      , (":", "'Colon")
      , (";", "'Semicolon")
      , ("{", "'Left_Curly_Bracket")
      , ("|", "'Pipe")
      , ("<", "'LessThan")
      , ("!=", "'Not_Equal")
      , ("=", "'Equal")
      , ("}", "'Right_Curly_Bracket")
      , (">", "'GreaterThan")
      , ("~", "'Tilde")
      , ("?", "'Question_Mark")
      , (">=", "'Greater_Than_Or_Equal_To")
      , ("~=", "'Tilde_Equal")
      ]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . replacer (T.pack searchStr) (T.pack replaceStr) . T.pack
    replacer =
      if forParsing
        then flip T.replace
        else T.replace
