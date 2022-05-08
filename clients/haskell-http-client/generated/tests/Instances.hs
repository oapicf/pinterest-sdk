{-# OPTIONS_GHC -fno-warn-unused-imports -fno-warn-unused-matches #-}

module Instances where

import PinterestREST.Model
import PinterestREST.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (T.pack k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays

-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

arbitraryReduced :: Arbitrary a => Int -> Gen a
arbitraryReduced n = resize (n `div` 2) arbitrary

arbitraryReducedMaybe :: Arbitrary a => Int -> Gen (Maybe a)
arbitraryReducedMaybe 0 = elements [Nothing]
arbitraryReducedMaybe n = arbitraryReduced n

arbitraryReducedMaybeValue :: Int -> Gen (Maybe A.Value)
arbitraryReducedMaybeValue 0 = elements [Nothing]
arbitraryReducedMaybeValue n = do
  generated <- arbitraryReduced n
  if generated == Just A.Null
    then return Nothing
    else return generated

-- * Models

instance Arbitrary Account where
  arbitrary = sized genAccount

genAccount :: Int -> Gen Account
genAccount n =
  Account
    <$> arbitraryReducedMaybe n -- accountAccountType :: Maybe E'AccountType
    <*> arbitraryReducedMaybe n -- accountProfileImage :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountWebsiteUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountUsername :: Maybe Text
  
instance Arbitrary AdAccount where
  arbitrary = sized genAdAccount

genAdAccount :: Int -> Gen AdAccount
genAdAccount n =
  AdAccount
    <$> arbitraryReducedMaybe n -- adAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountOwner :: Maybe AdAccountOwner
    <*> arbitraryReducedMaybe n -- adAccountCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- adAccountCurrency :: Maybe Currency
  
instance Arbitrary AdAccountOwner where
  arbitrary = sized genAdAccountOwner

genAdAccountOwner :: Int -> Gen AdAccountOwner
genAdAccountOwner n =
  AdAccountOwner
    <$> arbitraryReducedMaybe n -- adAccountOwnerUsername :: Maybe Text
  
instance Arbitrary AdGroupResponse where
  arbitrary = sized genAdGroupResponse

genAdGroupResponse :: Int -> Gen AdGroupResponse
genAdGroupResponse n =
  AdGroupResponse
    <$> arbitraryReducedMaybe n -- adGroupResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupResponseBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseBudgetType :: Maybe E'BudgetType
    <*> arbitraryReducedMaybe n -- adGroupResponseStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseTargetingSpec :: Maybe (Map.Map String [Text])
    <*> arbitraryReducedMaybe n -- adGroupResponseLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupResponseAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupResponsePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupResponsePacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupResponseConversionLearningModeType :: Maybe E'ConversionLearningModeType
    <*> arbitraryReducedMaybe n -- adGroupResponseSummaryStatus :: Maybe AdGroupSummaryStatus
    <*> arbitraryReducedMaybe n -- adGroupResponseFeedProfileId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseType :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseUpdatedTime :: Maybe Int
  
instance Arbitrary AdGroupResponseAllOf where
  arbitrary = sized genAdGroupResponseAllOf

genAdGroupResponseAllOf :: Int -> Gen AdGroupResponseAllOf
genAdGroupResponseAllOf n =
  AdGroupResponseAllOf
    <$> arbitraryReducedMaybe n -- adGroupResponseAllOfName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfBudgetType :: Maybe E'BudgetType
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfTargetingSpec :: Maybe (Map.Map String [Text])
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfConversionLearningModeType :: Maybe E'ConversionLearningModeType
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfSummaryStatus :: Maybe AdGroupSummaryStatus
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOfFeedProfileId :: Maybe Text
  
instance Arbitrary AdGroupResponseAllOf1 where
  arbitrary = sized genAdGroupResponseAllOf1

genAdGroupResponseAllOf1 :: Int -> Gen AdGroupResponseAllOf1
genAdGroupResponseAllOf1 n =
  AdGroupResponseAllOf1
    <$> arbitraryReducedMaybe n -- adGroupResponseAllOf1CampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOf1BillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOf1Id :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOf1Type :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOf1AdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOf1CreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseAllOf1UpdatedTime :: Maybe Int
  
instance Arbitrary AdResponse where
  arbitrary = sized genAdResponse

genAdResponse :: Int -> Gen AdResponse
genAdResponse n =
  AdResponse
    <$> arbitraryReducedMaybe n -- adResponseAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseCarouselAndroidDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adResponseCarouselDestinationUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adResponseCarouselIosDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adResponseClickTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseCreativeType :: Maybe E'CreativeType
    <*> arbitraryReducedMaybe n -- adResponseDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adResponseIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponsePinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adResponseTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adResponseViewTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseCollectionItemsDestinationUrlTemplate :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseRejectedReasons :: Maybe [E'RejectedReasons]
    <*> arbitraryReducedMaybe n -- adResponseRejectionLabels :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adResponseReviewStatus :: Maybe E'ReviewStatus
    <*> arbitraryReducedMaybe n -- adResponseType :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adResponseSummaryStatus :: Maybe PinPromotionSummaryStatus
  
instance Arbitrary AdResponseAllOf where
  arbitrary = sized genAdResponseAllOf

genAdResponseAllOf :: Int -> Gen AdResponseAllOf
genAdResponseAllOf n =
  AdResponseAllOf
    <$> arbitraryReducedMaybe n -- adResponseAllOfAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOfAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOfCarouselAndroidDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adResponseAllOfCarouselDestinationUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adResponseAllOfCarouselIosDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adResponseAllOfClickTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOfCreativeType :: Maybe E'CreativeType
    <*> arbitraryReducedMaybe n -- adResponseAllOfDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOfIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOfIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adResponseAllOfIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adResponseAllOfName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOfPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOfStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adResponseAllOfTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adResponseAllOfViewTrackingUrl :: Maybe Text
  
instance Arbitrary AdResponseAllOf1 where
  arbitrary = sized genAdResponseAllOf1

genAdResponseAllOf1 :: Int -> Gen AdResponseAllOf1
genAdResponseAllOf1 n =
  AdResponseAllOf1
    <$> arbitraryReducedMaybe n -- adResponseAllOf1AdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOf1CampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOf1CollectionItemsDestinationUrlTemplate :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOf1CreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adResponseAllOf1Id :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOf1RejectedReasons :: Maybe [E'RejectedReasons]
    <*> arbitraryReducedMaybe n -- adResponseAllOf1RejectionLabels :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adResponseAllOf1ReviewStatus :: Maybe E'ReviewStatus
    <*> arbitraryReducedMaybe n -- adResponseAllOf1Type :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAllOf1UpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adResponseAllOf1SummaryStatus :: Maybe PinPromotionSummaryStatus
  
instance Arbitrary AdsAnalyticsCreateAsyncRequest where
  arbitrary = sized genAdsAnalyticsCreateAsyncRequest

genAdsAnalyticsCreateAsyncRequest :: Int -> Gen AdsAnalyticsCreateAsyncRequest
genAdsAnalyticsCreateAsyncRequest n =
  AdsAnalyticsCreateAsyncRequest
    <$> arbitrary -- adsAnalyticsCreateAsyncRequestStartDate :: Text
    <*> arbitrary -- adsAnalyticsCreateAsyncRequestEndDate :: Text
    <*> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestGranularity :: Granularity
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestClickWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestEngagementWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestViewWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestConversionReportTime :: Maybe ConversionReportTimeType
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAttributionTypes :: Maybe [ConversionReportAttributionType]
    <*> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestColumns :: [ReportingColumnAsync]
    <*> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestLevel :: MetricsReportingLevel
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestReportFormat :: Maybe DataOutputFormat
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignStatuses :: Maybe [CampaignSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignObjectiveTypes :: Maybe [ObjectiveType]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdGroupStatuses :: Maybe [AdGroupSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdStatuses :: Maybe [PinPromotionSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestProductGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestProductGroupStatuses :: Maybe [ProductGroupSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestProductItemIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestTargetingTypes :: Maybe [AdsAnalyticsTargetingType]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestMetricsFilters :: Maybe [AdsAnalyticsMetricsFilter]
  
instance Arbitrary AdsAnalyticsCreateAsyncRequestAllOf where
  arbitrary = sized genAdsAnalyticsCreateAsyncRequestAllOf

genAdsAnalyticsCreateAsyncRequestAllOf :: Int -> Gen AdsAnalyticsCreateAsyncRequestAllOf
genAdsAnalyticsCreateAsyncRequestAllOf n =
  AdsAnalyticsCreateAsyncRequestAllOf
    <$> arbitrary -- adsAnalyticsCreateAsyncRequestAllOfStartDate :: Text
    <*> arbitrary -- adsAnalyticsCreateAsyncRequestAllOfEndDate :: Text
    <*> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestAllOfGranularity :: Granularity
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAllOfClickWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAllOfEngagementWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAllOfViewWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAllOfConversionReportTime :: Maybe ConversionReportTimeType
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAllOfAttributionTypes :: Maybe [ConversionReportAttributionType]
  
instance Arbitrary AdsAnalyticsCreateAsyncRequestAllOf1 where
  arbitrary = sized genAdsAnalyticsCreateAsyncRequestAllOf1

genAdsAnalyticsCreateAsyncRequestAllOf1 :: Int -> Gen AdsAnalyticsCreateAsyncRequestAllOf1
genAdsAnalyticsCreateAsyncRequestAllOf1 n =
  AdsAnalyticsCreateAsyncRequestAllOf1
    <$> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestAllOf1Columns :: [ReportingColumnAsync]
    <*> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestAllOf1Level :: MetricsReportingLevel
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAllOf1ReportFormat :: Maybe DataOutputFormat
  
instance Arbitrary AdsAnalyticsCreateAsyncResponse where
  arbitrary = sized genAdsAnalyticsCreateAsyncResponse

genAdsAnalyticsCreateAsyncResponse :: Int -> Gen AdsAnalyticsCreateAsyncResponse
genAdsAnalyticsCreateAsyncResponse n =
  AdsAnalyticsCreateAsyncResponse
    <$> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncResponseReportStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncResponseToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncResponseMessage :: Maybe Text
  
instance Arbitrary AdsAnalyticsGetAsyncResponse where
  arbitrary = sized genAdsAnalyticsGetAsyncResponse

genAdsAnalyticsGetAsyncResponse :: Int -> Gen AdsAnalyticsGetAsyncResponse
genAdsAnalyticsGetAsyncResponse n =
  AdsAnalyticsGetAsyncResponse
    <$> arbitraryReducedMaybe n -- adsAnalyticsGetAsyncResponseReportStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsGetAsyncResponseUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsGetAsyncResponseSize :: Maybe Double
  
instance Arbitrary AdsAnalyticsMetricsFilter where
  arbitrary = sized genAdsAnalyticsMetricsFilter

genAdsAnalyticsMetricsFilter :: Int -> Gen AdsAnalyticsMetricsFilter
genAdsAnalyticsMetricsFilter n =
  AdsAnalyticsMetricsFilter
    <$> arbitraryReducedMaybe n -- adsAnalyticsMetricsFilterField :: Maybe AdsAnalyticsFilterColumn
    <*> arbitraryReducedMaybe n -- adsAnalyticsMetricsFilterOperator :: Maybe AdsAnalyticsFilterOperator
    <*> arbitraryReducedMaybe n -- adsAnalyticsMetricsFilterValues :: Maybe [Double]
  
instance Arbitrary AnalyticsMetricsResponse where
  arbitrary = sized genAnalyticsMetricsResponse

genAnalyticsMetricsResponse :: Int -> Gen AnalyticsMetricsResponse
genAnalyticsMetricsResponse n =
  AnalyticsMetricsResponse
    <$> arbitraryReducedMaybe n -- analyticsMetricsResponseDailyMetrics :: Maybe [AnalyticsMetricsResponseDailyMetrics]
    <*> arbitraryReducedMaybe n -- analyticsMetricsResponseSummaryMetrics :: Maybe (Map.Map String Double)
  
instance Arbitrary AnalyticsMetricsResponseDailyMetrics where
  arbitrary = sized genAnalyticsMetricsResponseDailyMetrics

genAnalyticsMetricsResponseDailyMetrics :: Int -> Gen AnalyticsMetricsResponseDailyMetrics
genAnalyticsMetricsResponseDailyMetrics n =
  AnalyticsMetricsResponseDailyMetrics
    <$> arbitraryReducedMaybe n -- analyticsMetricsResponseDailyMetricsDataStatus :: Maybe E'DataStatus
    <*> arbitraryReducedMaybe n -- analyticsMetricsResponseDailyMetricsDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- analyticsMetricsResponseDailyMetricsMetrics :: Maybe (Map.Map String Double)
  
instance Arbitrary AvailabilityFilter where
  arbitrary = sized genAvailabilityFilter

genAvailabilityFilter :: Int -> Gen AvailabilityFilter
genAvailabilityFilter n =
  AvailabilityFilter
    <$> arbitraryReduced n -- availabilityFilterAvailability :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary Board where
  arbitrary = sized genBoard

genBoard :: Int -> Gen Board
genBoard n =
  Board
    <$> arbitraryReducedMaybe n -- boardId :: Maybe Text
    <*> arbitrary -- boardName :: Text
    <*> arbitraryReducedMaybe n -- boardDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- boardPrivacy :: Maybe E'Privacy
  
instance Arbitrary BoardOwner where
  arbitrary = sized genBoardOwner

genBoardOwner :: Int -> Gen BoardOwner
genBoardOwner n =
  BoardOwner
    <$> arbitraryReducedMaybe n -- boardOwnerUsername :: Maybe Text
  
instance Arbitrary BoardSection where
  arbitrary = sized genBoardSection

genBoardSection :: Int -> Gen BoardSection
genBoardSection n =
  BoardSection
    <$> arbitraryReducedMaybe n -- boardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardSectionName :: Maybe Text
  
instance Arbitrary BoardUpdate where
  arbitrary = sized genBoardUpdate

genBoardUpdate :: Int -> Gen BoardUpdate
genBoardUpdate n =
  BoardUpdate
    <$> arbitraryReducedMaybe n -- boardUpdateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardUpdateDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardUpdatePrivacy :: Maybe E'Privacy2
  
instance Arbitrary BrandFilter where
  arbitrary = sized genBrandFilter

genBrandFilter :: Int -> Gen BrandFilter
genBrandFilter n =
  BrandFilter
    <$> arbitraryReduced n -- brandFilterBrand :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary CampaignCommon where
  arbitrary = sized genCampaignCommon

genCampaignCommon :: Int -> Gen CampaignCommon
genCampaignCommon n =
  CampaignCommon
    <$> arbitrary -- campaignCommonAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- campaignCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCommonStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignCommonLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCommonTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCommonStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonEndTime :: Maybe Int
  
instance Arbitrary CampaignResponse where
  arbitrary = sized genCampaignResponse

genCampaignResponse :: Int -> Gen CampaignResponse
genCampaignResponse n =
  CampaignResponse
    <$> arbitrary -- campaignResponseId :: Text
    <*> arbitrary -- campaignResponseAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- campaignResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignResponseLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignResponseStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseObjectiveType :: Maybe ObjectiveType
    <*> arbitraryReducedMaybe n -- campaignResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseType :: Maybe Text
  
instance Arbitrary CampaignResponseAllOf where
  arbitrary = sized genCampaignResponseAllOf

genCampaignResponseAllOf :: Int -> Gen CampaignResponseAllOf
genCampaignResponseAllOf n =
  CampaignResponseAllOf
    <$> arbitrary -- campaignResponseAllOfId :: Text
  
instance Arbitrary CampaignResponseAllOf1 where
  arbitrary = sized genCampaignResponseAllOf1

genCampaignResponseAllOf1 :: Int -> Gen CampaignResponseAllOf1
genCampaignResponseAllOf1 n =
  CampaignResponseAllOf1
    <$> arbitraryReducedMaybe n -- campaignResponseAllOf1ObjectiveType :: Maybe ObjectiveType
    <*> arbitraryReducedMaybe n -- campaignResponseAllOf1CreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseAllOf1UpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseAllOf1Type :: Maybe Text
  
instance Arbitrary CatalogsDbItem where
  arbitrary = sized genCatalogsDbItem

genCatalogsDbItem :: Int -> Gen CatalogsDbItem
genCatalogsDbItem n =
  CatalogsDbItem
    <$> arbitraryReducedMaybe n -- catalogsDbItemCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsDbItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsDbItemUpdatedAt :: Maybe DateTime
  
instance Arbitrary CatalogsFeed where
  arbitrary = sized genCatalogsFeed

genCatalogsFeed :: Int -> Gen CatalogsFeed
genCatalogsFeed n =
  CatalogsFeed
    <$> arbitraryReducedMaybe n -- catalogsFeedCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsFeedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsFeedUpdatedAt :: Maybe DateTime
    <*> arbitraryReduced n -- catalogsFeedDefaultCountry :: Country
    <*> arbitraryReduced n -- catalogsFeedDefaultAvailability :: ProductAvailabilityType
    <*> arbitraryReduced n -- catalogsFeedDefaultCurrency :: NullableCurrency
    <*> arbitrary -- catalogsFeedName :: Text
    <*> arbitraryReduced n -- catalogsFeedFormat :: CatalogsFormat
    <*> arbitrary -- catalogsFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsFeedCredentials :: CatalogsFeedCredentials
    <*> arbitrary -- catalogsFeedLocation :: Text
    <*> arbitraryReduced n -- catalogsFeedPreferredProcessingSchedule :: CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsFeedStatus :: CatalogsStatus
  
instance Arbitrary CatalogsFeedCredentials where
  arbitrary = sized genCatalogsFeedCredentials

genCatalogsFeedCredentials :: Int -> Gen CatalogsFeedCredentials
genCatalogsFeedCredentials n =
  CatalogsFeedCredentials
    <$> arbitrary -- catalogsFeedCredentialsPassword :: Text
    <*> arbitrary -- catalogsFeedCredentialsUsername :: Text
  
instance Arbitrary CatalogsFeedIngestionDetails where
  arbitrary = sized genCatalogsFeedIngestionDetails

genCatalogsFeedIngestionDetails :: Int -> Gen CatalogsFeedIngestionDetails
genCatalogsFeedIngestionDetails n =
  CatalogsFeedIngestionDetails
    <$> arbitraryReduced n -- catalogsFeedIngestionDetailsErrors :: CatalogsFeedIngestionErrors
    <*> arbitraryReduced n -- catalogsFeedIngestionDetailsInfo :: CatalogsFeedIngestionInfo
  
instance Arbitrary CatalogsFeedIngestionErrors where
  arbitrary = sized genCatalogsFeedIngestionErrors

genCatalogsFeedIngestionErrors :: Int -> Gen CatalogsFeedIngestionErrors
genCatalogsFeedIngestionErrors n =
  CatalogsFeedIngestionErrors
    <$> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageDownloadError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageDownloadConnectionTimeout :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageFormatUnrecognize :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsLineLevelInternalError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsLargeProductCountDecrease :: Maybe E'LargeProductCountDecrease
  
instance Arbitrary CatalogsFeedIngestionInfo where
  arbitrary = sized genCatalogsFeedIngestionInfo

genCatalogsFeedIngestionInfo :: Int -> Gen CatalogsFeedIngestionInfo
genCatalogsFeedIngestionInfo n =
  CatalogsFeedIngestionInfo
    <$> arbitraryReducedMaybe n -- catalogsFeedIngestionInfoInStock :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionInfoOutOfStock :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionInfoPreorder :: Maybe Int
  
instance Arbitrary CatalogsFeedProcessingResult where
  arbitrary = sized genCatalogsFeedProcessingResult

genCatalogsFeedProcessingResult :: Int -> Gen CatalogsFeedProcessingResult
genCatalogsFeedProcessingResult n =
  CatalogsFeedProcessingResult
    <$> arbitraryReducedMaybe n -- catalogsFeedProcessingResultCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsFeedProcessingResultId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsFeedProcessingResultUpdatedAt :: Maybe DateTime
    <*> arbitraryReduced n -- catalogsFeedProcessingResultIngestionDetails :: CatalogsFeedIngestionDetails
    <*> arbitraryReduced n -- catalogsFeedProcessingResultStatus :: CatalogsFeedProcessingStatus
    <*> arbitraryReduced n -- catalogsFeedProcessingResultProductCounts :: CatalogsFeedProductCounts
    <*> arbitraryReduced n -- catalogsFeedProcessingResultValidationDetails :: CatalogsFeedValidationDetails
  
instance Arbitrary CatalogsFeedProcessingResultFields where
  arbitrary = sized genCatalogsFeedProcessingResultFields

genCatalogsFeedProcessingResultFields :: Int -> Gen CatalogsFeedProcessingResultFields
genCatalogsFeedProcessingResultFields n =
  CatalogsFeedProcessingResultFields
    <$> arbitraryReduced n -- catalogsFeedProcessingResultFieldsIngestionDetails :: CatalogsFeedIngestionDetails
    <*> arbitraryReduced n -- catalogsFeedProcessingResultFieldsStatus :: CatalogsFeedProcessingStatus
    <*> arbitraryReduced n -- catalogsFeedProcessingResultFieldsProductCounts :: CatalogsFeedProductCounts
    <*> arbitraryReduced n -- catalogsFeedProcessingResultFieldsValidationDetails :: CatalogsFeedValidationDetails
  
instance Arbitrary CatalogsFeedProcessingSchedule where
  arbitrary = sized genCatalogsFeedProcessingSchedule

genCatalogsFeedProcessingSchedule :: Int -> Gen CatalogsFeedProcessingSchedule
genCatalogsFeedProcessingSchedule n =
  CatalogsFeedProcessingSchedule
    <$> arbitrary -- catalogsFeedProcessingScheduleTime :: Text
    <*> arbitrary -- catalogsFeedProcessingScheduleTimezone :: E'Timezone
  
instance Arbitrary CatalogsFeedProductCounts where
  arbitrary = sized genCatalogsFeedProductCounts

genCatalogsFeedProductCounts :: Int -> Gen CatalogsFeedProductCounts
genCatalogsFeedProductCounts n =
  CatalogsFeedProductCounts
    <$> arbitraryReducedMaybe n -- catalogsFeedProductCountsOriginal :: Maybe Int
  
instance Arbitrary CatalogsFeedValidationDetails where
  arbitrary = sized genCatalogsFeedValidationDetails

genCatalogsFeedValidationDetails :: Int -> Gen CatalogsFeedValidationDetails
genCatalogsFeedValidationDetails n =
  CatalogsFeedValidationDetails
    <$> arbitraryReduced n -- catalogsFeedValidationDetailsErrors :: CatalogsFeedValidationErrors
    <*> arbitraryReduced n -- catalogsFeedValidationDetailsWarnings :: CatalogsFeedValidationWarnings
  
instance Arbitrary CatalogsFeedValidationErrors where
  arbitrary = sized genCatalogsFeedValidationErrors

genCatalogsFeedValidationErrors :: Int -> Gen CatalogsFeedValidationErrors
genCatalogsFeedValidationErrors n =
  CatalogsFeedValidationErrors
    <$> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsFetchError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsFetchInactiveFeedError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsEncodingError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsDelimiterError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsRequiredColumnsMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsImageLinkInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsItemidMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsTitleMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsDescriptionMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsProductCategoryInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsProductLinkMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsImageLinkMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsAvailabilityInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsProductPriceInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsLinkFormatInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsParseLineError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsAdwordsFormatInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsProductCategoryMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsInternalServiceError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsNoVerifiedDomain :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsAdultInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsInvalidDomain :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsFeedLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsLinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsMalformedXml :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsRedirectInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsPriceMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsFeedTooSmall :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsConditionInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsShopifyNoProducts :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsMaxItemsPerItemGroupExceeded :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsItemMainImageDownloadFailure :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsPinjoinContentUnsafe :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsBlocklistedImageSignature :: Maybe Int
  
instance Arbitrary CatalogsFeedValidationWarnings where
  arbitrary = sized genCatalogsFeedValidationWarnings

genCatalogsFeedValidationWarnings :: Int -> Gen CatalogsFeedValidationWarnings
genCatalogsFeedValidationWarnings n =
  CatalogsFeedValidationWarnings
    <$> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsTitleLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsDescriptionLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsGenderInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAgeGroupInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSizeTypeInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsLinkFormatWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsDuplicateProducts :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsDuplicateLinks :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSalesPriceInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsProductCategoryDepthWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdwordsSameAsLink :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsDuplicateHeaders :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsFetchSameSignature :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdwordsFormatWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdditionalImageLinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsImageLinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsShippingInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsTaxInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsShippingWeightInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsExpirationDateInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAvailabilityDateInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSaleDateInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsWeightUnitInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsIsBundleInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsUpdatedTimeInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsCustomLabelLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsProductTypeLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsTooManyAdditionalImageLinks :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsMultipackInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsIndexedProductCountLargeDelta :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsItemAdditionalImageDownloadFailure :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsOptionalProductCategoryMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsOptionalProductCategoryInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsOptionalConditionMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsOptionalConditionInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsIosDeepLinkInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAndroidDeepLinkInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAvailabilityNormalized :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsConditionNormalized :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsGenderNormalized :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSizeTypeNormalized :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAgeGroupNormalized :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsUtmSourceAutoCorrected :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsCountryDoesNotMapToCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsMinAdPriceInvalid :: Maybe Int
  
instance Arbitrary CatalogsFeedsCreateRequest where
  arbitrary = sized genCatalogsFeedsCreateRequest

genCatalogsFeedsCreateRequest :: Int -> Gen CatalogsFeedsCreateRequest
genCatalogsFeedsCreateRequest n =
  CatalogsFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitrary -- catalogsFeedsCreateRequestName :: Text
    <*> arbitraryReduced n -- catalogsFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultLocale :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitrary -- catalogsFeedsCreateRequestLocation :: Text
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
  
instance Arbitrary CatalogsFeedsUpdateRequest where
  arbitrary = sized genCatalogsFeedsUpdateRequest

genCatalogsFeedsUpdateRequest :: Int -> Gen CatalogsFeedsUpdateRequest
genCatalogsFeedsUpdateRequest n =
  CatalogsFeedsUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsItems where
  arbitrary = sized genCatalogsItems

genCatalogsItems :: Int -> Gen CatalogsItems
genCatalogsItems n =
  CatalogsItems
    <$> arbitraryReducedMaybe n -- catalogsItemsItems :: Maybe [ItemBatchRecord]
  
instance Arbitrary CatalogsItemsBatch where
  arbitrary = sized genCatalogsItemsBatch

genCatalogsItemsBatch :: Int -> Gen CatalogsItemsBatch
genCatalogsItemsBatch n =
  CatalogsItemsBatch
    <$> arbitraryReducedMaybe n -- catalogsItemsBatchItems :: Maybe [ItemProcessingRecord]
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchBatchId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchCreatedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchStatus :: Maybe BatchOperationStatus
  
instance Arbitrary CatalogsItemsBatchRequest where
  arbitrary = sized genCatalogsItemsBatchRequest

genCatalogsItemsBatchRequest :: Int -> Gen CatalogsItemsBatchRequest
genCatalogsItemsBatchRequest n =
  CatalogsItemsBatchRequest
    <$> arbitraryReducedMaybe n -- catalogsItemsBatchRequestCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchRequestLanguage :: Maybe Language
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchRequestOperation :: Maybe BatchOperation
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchRequestItems :: Maybe [ItemBatchRecord]
  
instance Arbitrary CatalogsProductGroup where
  arbitrary = sized genCatalogsProductGroup

genCatalogsProductGroup :: Int -> Gen CatalogsProductGroup
genCatalogsProductGroup n =
  CatalogsProductGroup
    <$> arbitrary -- catalogsProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsProductGroupFilters :: CatalogsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsProductGroupType :: Maybe CatalogsProductGroupType
    <*> arbitraryReducedMaybe n -- catalogsProductGroupStatus :: Maybe CatalogsProductGroupStatus
    <*> arbitraryReducedMaybe n -- catalogsProductGroupFeedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdatedAt :: Maybe Int
  
instance Arbitrary CatalogsProductGroupCreateRequest where
  arbitrary = sized genCatalogsProductGroupCreateRequest

genCatalogsProductGroupCreateRequest :: Int -> Gen CatalogsProductGroupCreateRequest
genCatalogsProductGroupCreateRequest n =
  CatalogsProductGroupCreateRequest
    <$> arbitrary -- catalogsProductGroupCreateRequestFeedId :: Text
    <*> arbitrary -- catalogsProductGroupCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsProductGroupCreateRequestFilters :: CatalogsProductGroupFilters
  
instance Arbitrary CatalogsProductGroupCurrencyCriteria where
  arbitrary = sized genCatalogsProductGroupCurrencyCriteria

genCatalogsProductGroupCurrencyCriteria :: Int -> Gen CatalogsProductGroupCurrencyCriteria
genCatalogsProductGroupCurrencyCriteria n =
  CatalogsProductGroupCurrencyCriteria
    <$> arbitraryReduced n -- catalogsProductGroupCurrencyCriteriaValues :: NonNullableCatalogsCurrency
    <*> arbitrary -- catalogsProductGroupCurrencyCriteriaNegated :: Bool
  
instance Arbitrary CatalogsProductGroupFilterKeys where
  arbitrary = sized genCatalogsProductGroupFilterKeys

genCatalogsProductGroupFilterKeys :: Int -> Gen CatalogsProductGroupFilterKeys
genCatalogsProductGroupFilterKeys n =
  CatalogsProductGroupFilterKeys
    <$> arbitraryReduced n -- catalogsProductGroupFilterKeysMinPrice :: CatalogsProductGroupPricingCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysMaxPrice :: CatalogsProductGroupPricingCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCurrency :: CatalogsProductGroupCurrencyCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysItemId :: CatalogsProductGroupCurrencyCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysAvailability :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysBrand :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCondition :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel0 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel1 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel2 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel3 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel4 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysItemGroupId :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysGender :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysProductType4 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysProductType3 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysProductType2 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysProductType1 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysProductType0 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysGoogleProductCategory6 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysGoogleProductCategory5 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysGoogleProductCategory4 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysGoogleProductCategory3 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysGoogleProductCategory2 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysGoogleProductCategory1 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysGoogleProductCategory0 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary CatalogsProductGroupFilters where
  arbitrary = sized genCatalogsProductGroupFilters

genCatalogsProductGroupFilters :: Int -> Gen CatalogsProductGroupFilters
genCatalogsProductGroupFilters n =
  CatalogsProductGroupFilters
    <$> arbitraryReducedMaybe n -- catalogsProductGroupFiltersAnyOf :: Maybe [CatalogsProductGroupFilterKeys]
    <*> arbitraryReducedMaybe n -- catalogsProductGroupFiltersAllOf :: Maybe [CatalogsProductGroupFilterKeys]
  
instance Arbitrary CatalogsProductGroupFiltersAllOf where
  arbitrary = sized genCatalogsProductGroupFiltersAllOf

genCatalogsProductGroupFiltersAllOf :: Int -> Gen CatalogsProductGroupFiltersAllOf
genCatalogsProductGroupFiltersAllOf n =
  CatalogsProductGroupFiltersAllOf
    <$> arbitraryReducedMaybe n -- catalogsProductGroupFiltersAllOfAllOf :: Maybe [CatalogsProductGroupFilterKeys]
  
instance Arbitrary CatalogsProductGroupFiltersAnyOf where
  arbitrary = sized genCatalogsProductGroupFiltersAnyOf

genCatalogsProductGroupFiltersAnyOf :: Int -> Gen CatalogsProductGroupFiltersAnyOf
genCatalogsProductGroupFiltersAnyOf n =
  CatalogsProductGroupFiltersAnyOf
    <$> arbitraryReducedMaybe n -- catalogsProductGroupFiltersAnyOfAnyOf :: Maybe [CatalogsProductGroupFilterKeys]
  
instance Arbitrary CatalogsProductGroupMultipleStringCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleStringCriteria

genCatalogsProductGroupMultipleStringCriteria :: Int -> Gen CatalogsProductGroupMultipleStringCriteria
genCatalogsProductGroupMultipleStringCriteria n =
  CatalogsProductGroupMultipleStringCriteria
    <$> arbitrary -- catalogsProductGroupMultipleStringCriteriaValues :: [Text]
    <*> arbitrary -- catalogsProductGroupMultipleStringCriteriaNegated :: Bool
  
instance Arbitrary CatalogsProductGroupMultipleStringListCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleStringListCriteria

genCatalogsProductGroupMultipleStringListCriteria :: Int -> Gen CatalogsProductGroupMultipleStringListCriteria
genCatalogsProductGroupMultipleStringListCriteria n =
  CatalogsProductGroupMultipleStringListCriteria
    <$> arbitraryReduced n -- catalogsProductGroupMultipleStringListCriteriaValues :: [[Text]]
    <*> arbitrary -- catalogsProductGroupMultipleStringListCriteriaNegated :: Bool
  
instance Arbitrary CatalogsProductGroupPricingCriteria where
  arbitrary = sized genCatalogsProductGroupPricingCriteria

genCatalogsProductGroupPricingCriteria :: Int -> Gen CatalogsProductGroupPricingCriteria
genCatalogsProductGroupPricingCriteria n =
  CatalogsProductGroupPricingCriteria
    <$> arbitrary -- catalogsProductGroupPricingCriteriaInclusion :: Bool
    <*> arbitrary -- catalogsProductGroupPricingCriteriaValues :: Double
    <*> arbitrary -- catalogsProductGroupPricingCriteriaNegated :: Bool
  
instance Arbitrary CatalogsProductGroupUpdateRequest where
  arbitrary = sized genCatalogsProductGroupUpdateRequest

genCatalogsProductGroupUpdateRequest :: Int -> Gen CatalogsProductGroupUpdateRequest
genCatalogsProductGroupUpdateRequest n =
  CatalogsProductGroupUpdateRequest
    <$> arbitrary -- catalogsProductGroupUpdateRequestFeedId :: Text
    <*> arbitrary -- catalogsProductGroupUpdateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsProductGroupUpdateRequestFilters :: CatalogsProductGroupFilters
  
instance Arbitrary ConditionFilter where
  arbitrary = sized genConditionFilter

genConditionFilter :: Int -> Gen ConditionFilter
genConditionFilter n =
  ConditionFilter
    <$> arbitraryReduced n -- conditionFilterCondition :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary CurrencyFilter where
  arbitrary = sized genCurrencyFilter

genCurrencyFilter :: Int -> Gen CurrencyFilter
genCurrencyFilter n =
  CurrencyFilter
    <$> arbitraryReduced n -- currencyFilterCurrency :: CatalogsProductGroupCurrencyCriteria
  
instance Arbitrary CustomLabel0Filter where
  arbitrary = sized genCustomLabel0Filter

genCustomLabel0Filter :: Int -> Gen CustomLabel0Filter
genCustomLabel0Filter n =
  CustomLabel0Filter
    <$> arbitraryReduced n -- customLabel0FilterCustomLabel0 :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary CustomLabel1Filter where
  arbitrary = sized genCustomLabel1Filter

genCustomLabel1Filter :: Int -> Gen CustomLabel1Filter
genCustomLabel1Filter n =
  CustomLabel1Filter
    <$> arbitraryReduced n -- customLabel1FilterCustomLabel1 :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary CustomLabel2Filter where
  arbitrary = sized genCustomLabel2Filter

genCustomLabel2Filter :: Int -> Gen CustomLabel2Filter
genCustomLabel2Filter n =
  CustomLabel2Filter
    <$> arbitraryReduced n -- customLabel2FilterCustomLabel2 :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary CustomLabel3Filter where
  arbitrary = sized genCustomLabel3Filter

genCustomLabel3Filter :: Int -> Gen CustomLabel3Filter
genCustomLabel3Filter n =
  CustomLabel3Filter
    <$> arbitraryReduced n -- customLabel3FilterCustomLabel3 :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary CustomLabel4Filter where
  arbitrary = sized genCustomLabel4Filter

genCustomLabel4Filter :: Int -> Gen CustomLabel4Filter
genCustomLabel4Filter n =
  CustomLabel4Filter
    <$> arbitraryReduced n -- customLabel4FilterCustomLabel4 :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary Error where
  arbitrary = sized genError

genError :: Int -> Gen Error
genError n =
  Error
    <$> arbitrary -- errorCode :: Int
    <*> arbitrary -- errorMessage :: Text
  
instance Arbitrary FeedFields where
  arbitrary = sized genFeedFields

genFeedFields :: Int -> Gen FeedFields
genFeedFields n =
  FeedFields
    <$> arbitraryReduced n -- feedFieldsDefaultCountry :: Country
    <*> arbitraryReduced n -- feedFieldsDefaultAvailability :: ProductAvailabilityType
    <*> arbitraryReduced n -- feedFieldsDefaultCurrency :: NullableCurrency
    <*> arbitrary -- feedFieldsName :: Text
    <*> arbitraryReduced n -- feedFieldsFormat :: CatalogsFormat
    <*> arbitrary -- feedFieldsDefaultLocale :: Text
    <*> arbitraryReduced n -- feedFieldsCredentials :: CatalogsFeedCredentials
    <*> arbitrary -- feedFieldsLocation :: Text
    <*> arbitraryReduced n -- feedFieldsPreferredProcessingSchedule :: CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- feedFieldsStatus :: CatalogsStatus
  
instance Arbitrary GenderFilter where
  arbitrary = sized genGenderFilter

genGenderFilter :: Int -> Gen GenderFilter
genGenderFilter n =
  GenderFilter
    <$> arbitraryReduced n -- genderFilterGender :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary GoogleProductCategory0Filter where
  arbitrary = sized genGoogleProductCategory0Filter

genGoogleProductCategory0Filter :: Int -> Gen GoogleProductCategory0Filter
genGoogleProductCategory0Filter n =
  GoogleProductCategory0Filter
    <$> arbitraryReduced n -- googleProductCategory0FilterGoogleProductCategory0 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary GoogleProductCategory1Filter where
  arbitrary = sized genGoogleProductCategory1Filter

genGoogleProductCategory1Filter :: Int -> Gen GoogleProductCategory1Filter
genGoogleProductCategory1Filter n =
  GoogleProductCategory1Filter
    <$> arbitraryReduced n -- googleProductCategory1FilterGoogleProductCategory1 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary GoogleProductCategory2Filter where
  arbitrary = sized genGoogleProductCategory2Filter

genGoogleProductCategory2Filter :: Int -> Gen GoogleProductCategory2Filter
genGoogleProductCategory2Filter n =
  GoogleProductCategory2Filter
    <$> arbitraryReduced n -- googleProductCategory2FilterGoogleProductCategory2 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary GoogleProductCategory3Filter where
  arbitrary = sized genGoogleProductCategory3Filter

genGoogleProductCategory3Filter :: Int -> Gen GoogleProductCategory3Filter
genGoogleProductCategory3Filter n =
  GoogleProductCategory3Filter
    <$> arbitraryReduced n -- googleProductCategory3FilterGoogleProductCategory3 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary GoogleProductCategory4Filter where
  arbitrary = sized genGoogleProductCategory4Filter

genGoogleProductCategory4Filter :: Int -> Gen GoogleProductCategory4Filter
genGoogleProductCategory4Filter n =
  GoogleProductCategory4Filter
    <$> arbitraryReduced n -- googleProductCategory4FilterGoogleProductCategory4 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary GoogleProductCategory5Filter where
  arbitrary = sized genGoogleProductCategory5Filter

genGoogleProductCategory5Filter :: Int -> Gen GoogleProductCategory5Filter
genGoogleProductCategory5Filter n =
  GoogleProductCategory5Filter
    <$> arbitraryReduced n -- googleProductCategory5FilterGoogleProductCategory5 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary GoogleProductCategory6Filter where
  arbitrary = sized genGoogleProductCategory6Filter

genGoogleProductCategory6Filter :: Int -> Gen GoogleProductCategory6Filter
genGoogleProductCategory6Filter n =
  GoogleProductCategory6Filter
    <$> arbitraryReduced n -- googleProductCategory6FilterGoogleProductCategory6 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary ImageDetails where
  arbitrary = sized genImageDetails

genImageDetails :: Int -> Gen ImageDetails
genImageDetails n =
  ImageDetails
    <$> arbitrary -- imageDetailsWidth :: Int
    <*> arbitrary -- imageDetailsHeight :: Int
    <*> arbitrary -- imageDetailsUrl :: Text
  
instance Arbitrary ItemAttributes where
  arbitrary = sized genItemAttributes

genItemAttributes :: Int -> Gen ItemAttributes
genItemAttributes n =
  ItemAttributes
    <$> arbitraryReducedMaybe n -- itemAttributesAdLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdditionalImageLink :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesAdult :: Maybe Bool
    <*> arbitraryReducedMaybe n -- itemAttributesAgeGroup :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAvailability :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAverageReviewRating :: Maybe Double
    <*> arbitraryReducedMaybe n -- itemAttributesBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesCondition :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesCustomLabel0 :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesCustomLabel1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesCustomLabel2 :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesCustomLabel3 :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesCustomLabel4 :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesFreeShippingLabel :: Maybe Bool
    <*> arbitraryReducedMaybe n -- itemAttributesFreeShippingLimit :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesGender :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesGoogleProductCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesGtin :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesImageLink :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesItemGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesLastUpdatedTime :: Maybe Integer
    <*> arbitraryReducedMaybe n -- itemAttributesLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesMaterial :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesMinAdPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesMobileLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesMpn :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesNumberOfRatings :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesNumberOfReviews :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesPattern :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesProductType :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesSalePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesShipping :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesShippingHeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesShippingWeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesShippingWidth :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesSize :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesSizeSystem :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesSizeType :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesTax :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesTitle :: Maybe Text
  
instance Arbitrary ItemBatchRecord where
  arbitrary = sized genItemBatchRecord

genItemBatchRecord :: Int -> Gen ItemBatchRecord
genItemBatchRecord n =
  ItemBatchRecord
    <$> arbitraryReducedMaybe n -- itemBatchRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemBatchRecordAttributes :: Maybe ItemAttributes
  
instance Arbitrary ItemGroupIdFilter where
  arbitrary = sized genItemGroupIdFilter

genItemGroupIdFilter :: Int -> Gen ItemGroupIdFilter
genItemGroupIdFilter n =
  ItemGroupIdFilter
    <$> arbitraryReduced n -- itemGroupIdFilterItemGroupId :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary ItemIdFilter where
  arbitrary = sized genItemIdFilter

genItemIdFilter :: Int -> Gen ItemIdFilter
genItemIdFilter n =
  ItemIdFilter
    <$> arbitraryReduced n -- itemIdFilterItemId :: CatalogsProductGroupCurrencyCriteria
  
instance Arbitrary ItemProcessingRecord where
  arbitrary = sized genItemProcessingRecord

genItemProcessingRecord :: Int -> Gen ItemProcessingRecord
genItemProcessingRecord n =
  ItemProcessingRecord
    <$> arbitraryReducedMaybe n -- itemProcessingRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemProcessingRecordErrors :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- itemProcessingRecordWarnings :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- itemProcessingRecordStatus :: Maybe ItemProcessingStatus
  
instance Arbitrary ItemValidationEvent where
  arbitrary = sized genItemValidationEvent

genItemValidationEvent :: Int -> Gen ItemValidationEvent
genItemValidationEvent n =
  ItemValidationEvent
    <$> arbitraryReducedMaybe n -- itemValidationEventAttribute :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemValidationEventCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemValidationEventMessage :: Maybe Text
  
instance Arbitrary MaxPriceFilter where
  arbitrary = sized genMaxPriceFilter

genMaxPriceFilter :: Int -> Gen MaxPriceFilter
genMaxPriceFilter n =
  MaxPriceFilter
    <$> arbitraryReduced n -- maxPriceFilterMaxPrice :: CatalogsProductGroupPricingCriteria
  
instance Arbitrary MediaUpload where
  arbitrary = sized genMediaUpload

genMediaUpload :: Int -> Gen MediaUpload
genMediaUpload n =
  MediaUpload
    <$> arbitraryReducedMaybe n -- mediaUploadMediaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadMediaType :: Maybe MediaUploadType
    <*> arbitraryReducedMaybe n -- mediaUploadUploadUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadUploadParameters :: Maybe MediaUploadAllOfUploadParameters
  
instance Arbitrary MediaUploadAllOf where
  arbitrary = sized genMediaUploadAllOf

genMediaUploadAllOf :: Int -> Gen MediaUploadAllOf
genMediaUploadAllOf n =
  MediaUploadAllOf
    <$> arbitraryReducedMaybe n -- mediaUploadAllOfMediaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadAllOfMediaType :: Maybe MediaUploadType
    <*> arbitraryReducedMaybe n -- mediaUploadAllOfUploadUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadAllOfUploadParameters :: Maybe MediaUploadAllOfUploadParameters
  
instance Arbitrary MediaUploadAllOfUploadParameters where
  arbitrary = sized genMediaUploadAllOfUploadParameters

genMediaUploadAllOfUploadParameters :: Int -> Gen MediaUploadAllOfUploadParameters
genMediaUploadAllOfUploadParameters n =
  MediaUploadAllOfUploadParameters
    <$> arbitraryReducedMaybe n -- mediaUploadAllOfUploadParametersXAmzDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadAllOfUploadParametersXAmzSignature :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadAllOfUploadParametersXAmzSecurityToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadAllOfUploadParametersXAmzAlgorithm :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadAllOfUploadParametersKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadAllOfUploadParametersPolicy :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadAllOfUploadParametersXAmzCredential :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadAllOfUploadParametersContentType :: Maybe Text
  
instance Arbitrary MediaUploadDetails where
  arbitrary = sized genMediaUploadDetails

genMediaUploadDetails :: Int -> Gen MediaUploadDetails
genMediaUploadDetails n =
  MediaUploadDetails
    <$> arbitraryReducedMaybe n -- mediaUploadDetailsMediaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadDetailsMediaType :: Maybe MediaUploadType
    <*> arbitraryReducedMaybe n -- mediaUploadDetailsStatus :: Maybe MediaUploadStatus
  
instance Arbitrary MediaUploadRequest where
  arbitrary = sized genMediaUploadRequest

genMediaUploadRequest :: Int -> Gen MediaUploadRequest
genMediaUploadRequest n =
  MediaUploadRequest
    <$> arbitraryReduced n -- mediaUploadRequestMediaType :: MediaUploadType
  
instance Arbitrary MinPriceFilter where
  arbitrary = sized genMinPriceFilter

genMinPriceFilter :: Int -> Gen MinPriceFilter
genMinPriceFilter n =
  MinPriceFilter
    <$> arbitraryReduced n -- minPriceFilterMinPrice :: CatalogsProductGroupPricingCriteria
  
instance Arbitrary OauthAccessTokenRequest where
  arbitrary = sized genOauthAccessTokenRequest

genOauthAccessTokenRequest :: Int -> Gen OauthAccessTokenRequest
genOauthAccessTokenRequest n =
  OauthAccessTokenRequest
    <$> arbitrary -- oauthAccessTokenRequestGrantType :: E'GrantType
  
instance Arbitrary OauthAccessTokenRequestCode where
  arbitrary = sized genOauthAccessTokenRequestCode

genOauthAccessTokenRequestCode :: Int -> Gen OauthAccessTokenRequestCode
genOauthAccessTokenRequestCode n =
  OauthAccessTokenRequestCode
    <$> arbitrary -- oauthAccessTokenRequestCodeGrantType :: E'GrantType
    <*> arbitrary -- oauthAccessTokenRequestCodeCode :: Text
    <*> arbitrary -- oauthAccessTokenRequestCodeRedirectUri :: Text
  
instance Arbitrary OauthAccessTokenRequestCodeAllOf where
  arbitrary = sized genOauthAccessTokenRequestCodeAllOf

genOauthAccessTokenRequestCodeAllOf :: Int -> Gen OauthAccessTokenRequestCodeAllOf
genOauthAccessTokenRequestCodeAllOf n =
  OauthAccessTokenRequestCodeAllOf
    <$> arbitrary -- oauthAccessTokenRequestCodeAllOfCode :: Text
    <*> arbitrary -- oauthAccessTokenRequestCodeAllOfRedirectUri :: Text
  
instance Arbitrary OauthAccessTokenRequestRefresh where
  arbitrary = sized genOauthAccessTokenRequestRefresh

genOauthAccessTokenRequestRefresh :: Int -> Gen OauthAccessTokenRequestRefresh
genOauthAccessTokenRequestRefresh n =
  OauthAccessTokenRequestRefresh
    <$> arbitrary -- oauthAccessTokenRequestRefreshGrantType :: E'GrantType
    <*> arbitrary -- oauthAccessTokenRequestRefreshRefreshToken :: Text
    <*> arbitraryReducedMaybe n -- oauthAccessTokenRequestRefreshScope :: Maybe Text
  
instance Arbitrary OauthAccessTokenRequestRefreshAllOf where
  arbitrary = sized genOauthAccessTokenRequestRefreshAllOf

genOauthAccessTokenRequestRefreshAllOf :: Int -> Gen OauthAccessTokenRequestRefreshAllOf
genOauthAccessTokenRequestRefreshAllOf n =
  OauthAccessTokenRequestRefreshAllOf
    <$> arbitrary -- oauthAccessTokenRequestRefreshAllOfRefreshToken :: Text
    <*> arbitraryReducedMaybe n -- oauthAccessTokenRequestRefreshAllOfScope :: Maybe Text
  
instance Arbitrary OauthAccessTokenResponse where
  arbitrary = sized genOauthAccessTokenResponse

genOauthAccessTokenResponse :: Int -> Gen OauthAccessTokenResponse
genOauthAccessTokenResponse n =
  OauthAccessTokenResponse
    <$> arbitraryReducedMaybe n -- oauthAccessTokenResponseResponseType :: Maybe E'GrantType
    <*> arbitrary -- oauthAccessTokenResponseAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseTokenType :: Text
    <*> arbitrary -- oauthAccessTokenResponseExpiresIn :: Int
    <*> arbitrary -- oauthAccessTokenResponseScope :: Text
  
instance Arbitrary OauthAccessTokenResponseCode where
  arbitrary = sized genOauthAccessTokenResponseCode

genOauthAccessTokenResponseCode :: Int -> Gen OauthAccessTokenResponseCode
genOauthAccessTokenResponseCode n =
  OauthAccessTokenResponseCode
    <$> arbitraryReducedMaybe n -- oauthAccessTokenResponseCodeResponseType :: Maybe E'GrantType
    <*> arbitrary -- oauthAccessTokenResponseCodeAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseCodeTokenType :: Text
    <*> arbitrary -- oauthAccessTokenResponseCodeExpiresIn :: Int
    <*> arbitrary -- oauthAccessTokenResponseCodeScope :: Text
    <*> arbitrary -- oauthAccessTokenResponseCodeRefreshToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseCodeRefreshTokenExpiresIn :: Int
  
instance Arbitrary OauthAccessTokenResponseCodeAllOf where
  arbitrary = sized genOauthAccessTokenResponseCodeAllOf

genOauthAccessTokenResponseCodeAllOf :: Int -> Gen OauthAccessTokenResponseCodeAllOf
genOauthAccessTokenResponseCodeAllOf n =
  OauthAccessTokenResponseCodeAllOf
    <$> arbitrary -- oauthAccessTokenResponseCodeAllOfRefreshToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseCodeAllOfRefreshTokenExpiresIn :: Int
  
instance Arbitrary OauthAccessTokenResponseRefresh where
  arbitrary = sized genOauthAccessTokenResponseRefresh

genOauthAccessTokenResponseRefresh :: Int -> Gen OauthAccessTokenResponseRefresh
genOauthAccessTokenResponseRefresh n =
  OauthAccessTokenResponseRefresh
    <$> arbitraryReducedMaybe n -- oauthAccessTokenResponseRefreshResponseType :: Maybe E'GrantType
    <*> arbitrary -- oauthAccessTokenResponseRefreshAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseRefreshTokenType :: Text
    <*> arbitrary -- oauthAccessTokenResponseRefreshExpiresIn :: Int
    <*> arbitrary -- oauthAccessTokenResponseRefreshScope :: Text
  
instance Arbitrary Paginated where
  arbitrary = sized genPaginated

genPaginated :: Int -> Gen Paginated
genPaginated n =
  Paginated
    <$> arbitraryReduced n -- paginatedItems :: [A.Value]
    <*> arbitraryReducedMaybe n -- paginatedBookmark :: Maybe Text
  
instance Arbitrary Pin where
  arbitrary = sized genPin

genPin :: Int -> Gen Pin
genPin n =
  Pin
    <$> arbitraryReducedMaybe n -- pinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pinLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinBoardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinBoardOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- pinMedia :: Maybe PinMedia
    <*> arbitraryReducedMaybe n -- pinMediaSource :: Maybe PinMediaSource
  
instance Arbitrary PinMedia where
  arbitrary = sized genPinMedia

genPinMedia :: Int -> Gen PinMedia
genPinMedia n =
  PinMedia
    <$> arbitraryReducedMaybe n -- pinMediaMediaType :: Maybe Text
  
instance Arbitrary PinMediaSource where
  arbitrary = sized genPinMediaSource

genPinMediaSource :: Int -> Gen PinMediaSource
genPinMediaSource n =
  PinMediaSource
    <$> arbitrary -- pinMediaSourceSourceType :: E'SourceType
    <*> arbitrary -- pinMediaSourceContentType :: E'ContentType
    <*> arbitrary -- pinMediaSourceData :: Text
    <*> arbitrary -- pinMediaSourceUrl :: Text
    <*> arbitrary -- pinMediaSourceCoverImageUrl :: Text
    <*> arbitrary -- pinMediaSourceMediaId :: Text
  
instance Arbitrary PinMediaSourceImageBase64 where
  arbitrary = sized genPinMediaSourceImageBase64

genPinMediaSourceImageBase64 :: Int -> Gen PinMediaSourceImageBase64
genPinMediaSourceImageBase64 n =
  PinMediaSourceImageBase64
    <$> arbitrary -- pinMediaSourceImageBase64SourceType :: E'SourceType2
    <*> arbitrary -- pinMediaSourceImageBase64ContentType :: E'ContentType
    <*> arbitrary -- pinMediaSourceImageBase64Data :: Text
  
instance Arbitrary PinMediaSourceImageURL where
  arbitrary = sized genPinMediaSourceImageURL

genPinMediaSourceImageURL :: Int -> Gen PinMediaSourceImageURL
genPinMediaSourceImageURL n =
  PinMediaSourceImageURL
    <$> arbitrary -- pinMediaSourceImageURLSourceType :: E'SourceType3
    <*> arbitrary -- pinMediaSourceImageURLUrl :: Text
  
instance Arbitrary PinMediaSourceVideoID where
  arbitrary = sized genPinMediaSourceVideoID

genPinMediaSourceVideoID :: Int -> Gen PinMediaSourceVideoID
genPinMediaSourceVideoID n =
  PinMediaSourceVideoID
    <$> arbitrary -- pinMediaSourceVideoIDSourceType :: E'SourceType
    <*> arbitrary -- pinMediaSourceVideoIDCoverImageUrl :: Text
    <*> arbitrary -- pinMediaSourceVideoIDMediaId :: Text
  
instance Arbitrary PinMediaWithImage where
  arbitrary = sized genPinMediaWithImage

genPinMediaWithImage :: Int -> Gen PinMediaWithImage
genPinMediaWithImage n =
  PinMediaWithImage
    <$> arbitraryReducedMaybe n -- pinMediaWithImageImages :: Maybe (Map.Map String ImageDetails)
    <*> arbitraryReducedMaybe n -- pinMediaWithImageMediaType :: Maybe Text
  
instance Arbitrary PinMediaWithImageAllOf where
  arbitrary = sized genPinMediaWithImageAllOf

genPinMediaWithImageAllOf :: Int -> Gen PinMediaWithImageAllOf
genPinMediaWithImageAllOf n =
  PinMediaWithImageAllOf
    <$> arbitraryReducedMaybe n -- pinMediaWithImageAllOfImages :: Maybe (Map.Map String ImageDetails)
  
instance Arbitrary ProductType0Filter where
  arbitrary = sized genProductType0Filter

genProductType0Filter :: Int -> Gen ProductType0Filter
genProductType0Filter n =
  ProductType0Filter
    <$> arbitraryReduced n -- productType0FilterProductType0 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary ProductType1Filter where
  arbitrary = sized genProductType1Filter

genProductType1Filter :: Int -> Gen ProductType1Filter
genProductType1Filter n =
  ProductType1Filter
    <$> arbitraryReduced n -- productType1FilterProductType1 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary ProductType2Filter where
  arbitrary = sized genProductType2Filter

genProductType2Filter :: Int -> Gen ProductType2Filter
genProductType2Filter n =
  ProductType2Filter
    <$> arbitraryReduced n -- productType2FilterProductType2 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary ProductType3Filter where
  arbitrary = sized genProductType3Filter

genProductType3Filter :: Int -> Gen ProductType3Filter
genProductType3Filter n =
  ProductType3Filter
    <$> arbitraryReduced n -- productType3FilterProductType3 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary ProductType4Filter where
  arbitrary = sized genProductType4Filter

genProductType4Filter :: Int -> Gen ProductType4Filter
genProductType4Filter n =
  ProductType4Filter
    <$> arbitraryReduced n -- productType4FilterProductType4 :: CatalogsProductGroupMultipleStringListCriteria
  
instance Arbitrary TargetingTypeFilter where
  arbitrary = sized genTargetingTypeFilter

genTargetingTypeFilter :: Int -> Gen TargetingTypeFilter
genTargetingTypeFilter n =
  TargetingTypeFilter
    <$> arbitraryReducedMaybe n -- targetingTypeFilterTargetingTypes :: Maybe [AdsAnalyticsTargetingType]
  
instance Arbitrary TrackingUrls where
  arbitrary = sized genTrackingUrls

genTrackingUrls :: Int -> Gen TrackingUrls
genTrackingUrls n =
  TrackingUrls
    <$> arbitraryReducedMaybe n -- trackingUrlsImpression :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- trackingUrlsClick :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- trackingUrlsEngagement :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- trackingUrlsBuyableButton :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- trackingUrlsAudienceVerification :: Maybe [Text]
  



instance Arbitrary ActionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdGroupSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsFilterColumn where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsFilterOperator where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsTargetingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BatchOperation where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BatchOperationStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsFeedProcessingStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsProductGroupStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsProductGroupType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionAttributionWindowDays where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionReportAttributionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionReportTimeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Country where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Currency where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DataOutputFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AccountType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AppTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'BudgetType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ClickWindowDays where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Columns where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ContentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ConversionLearningModeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ConversionReportTime where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CreativeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'DataStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'EntityStatuses where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FromClaimedContent where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'GrantType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'LargeProductCountDecrease where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MetricTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MetricTypes2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Order where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PinFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Privacy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Privacy2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'RejectedReasons where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReviewStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SourceType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SourceType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SourceType3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SplitField where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SplitField2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Timezone where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary EntityStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Granularity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ItemProcessingStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Language where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MediaUploadStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MediaUploadType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MetricsReportingLevel where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NonNullableCatalogsCurrency where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NullableCurrency where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ObjectiveType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PacingDeliveryType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PinPromotionSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PlacementGroupType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ProductAvailabilityType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ProductGroupSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReportingColumnAsync where
  arbitrary = arbitraryBoundedEnum

