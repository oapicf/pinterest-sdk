{-# LANGUAGE CPP #-}
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
import Data.String (fromString)

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

#if MIN_VERSION_aeson(2,0,0)
#else
-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = arbitraryValue
#endif

arbitraryValue :: Gen A.Value
arbitraryValue =
  frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (fromString k, v)
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
    <*> arbitraryReducedMaybe n -- accountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountProfileImage :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountWebsiteUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountUsername :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountAbout :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountBusinessName :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountBoardCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- accountPinCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- accountFollowerCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- accountFollowingCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- accountMonthlyViews :: Maybe Int
  
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
    <*> arbitraryReducedMaybe n -- adAccountPermissions :: Maybe [BusinessAccessRole]
    <*> arbitraryReducedMaybe n -- adAccountCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adAccountUpdatedTime :: Maybe Int
  
instance Arbitrary AdAccountAnalyticsResponseInner where
  arbitrary = sized genAdAccountAnalyticsResponseInner

genAdAccountAnalyticsResponseInner :: Int -> Gen AdAccountAnalyticsResponseInner
genAdAccountAnalyticsResponseInner n =
  AdAccountAnalyticsResponseInner
    <$> arbitrary -- adAccountAnalyticsResponseInnerAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- adAccountAnalyticsResponseInnerDate :: Maybe Date
  
instance Arbitrary AdAccountCreateRequest where
  arbitrary = sized genAdAccountCreateRequest

genAdAccountCreateRequest :: Int -> Gen AdAccountCreateRequest
genAdAccountCreateRequest n =
  AdAccountCreateRequest
    <$> arbitraryReducedMaybe n -- adAccountCreateRequestCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- adAccountCreateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateRequestOwnerUserId :: Maybe Text
  
instance Arbitrary AdAccountCreateSubscriptionRequest where
  arbitrary = sized genAdAccountCreateSubscriptionRequest

genAdAccountCreateSubscriptionRequest :: Int -> Gen AdAccountCreateSubscriptionRequest
genAdAccountCreateSubscriptionRequest n =
  AdAccountCreateSubscriptionRequest
    <$> arbitrary -- adAccountCreateSubscriptionRequestWebhookUrl :: Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionRequestLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionRequestPartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionRequestPartnerRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionRequestPartnerMetadata :: Maybe AdAccountCreateSubscriptionRequestPartnerMetadata
  
instance Arbitrary AdAccountCreateSubscriptionRequestPartnerMetadata where
  arbitrary = sized genAdAccountCreateSubscriptionRequestPartnerMetadata

genAdAccountCreateSubscriptionRequestPartnerMetadata :: Int -> Gen AdAccountCreateSubscriptionRequestPartnerMetadata
genAdAccountCreateSubscriptionRequestPartnerMetadata n =
  AdAccountCreateSubscriptionRequestPartnerMetadata
    <$> arbitraryReducedMaybe n -- adAccountCreateSubscriptionRequestPartnerMetadataSubscriberKey :: Maybe Text
  
instance Arbitrary AdAccountCreateSubscriptionResponse where
  arbitrary = sized genAdAccountCreateSubscriptionResponse

genAdAccountCreateSubscriptionResponse :: Int -> Gen AdAccountCreateSubscriptionResponse
genAdAccountCreateSubscriptionResponse n =
  AdAccountCreateSubscriptionResponse
    <$> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseCryptographicKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseCryptographicAlgorithm :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseCreatedTime :: Maybe Int
  
instance Arbitrary AdAccountGetSubscriptionResponse where
  arbitrary = sized genAdAccountGetSubscriptionResponse

genAdAccountGetSubscriptionResponse :: Int -> Gen AdAccountGetSubscriptionResponse
genAdAccountGetSubscriptionResponse n =
  AdAccountGetSubscriptionResponse
    <$> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseWebhookUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseUserAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseApiVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseCryptographicKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseCryptographicAlgorithm :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseCreatedTime :: Maybe Int
  
instance Arbitrary AdAccountOwner where
  arbitrary = sized genAdAccountOwner

genAdAccountOwner :: Int -> Gen AdAccountOwner
genAdAccountOwner n =
  AdAccountOwner
    <$> arbitraryReducedMaybe n -- adAccountOwnerUsername :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountOwnerId :: Maybe Text
  
instance Arbitrary AdAccountsAudiencesSharedAccountsList200Response where
  arbitrary = sized genAdAccountsAudiencesSharedAccountsList200Response

genAdAccountsAudiencesSharedAccountsList200Response :: Int -> Gen AdAccountsAudiencesSharedAccountsList200Response
genAdAccountsAudiencesSharedAccountsList200Response n =
  AdAccountsAudiencesSharedAccountsList200Response
    <$> arbitraryReduced n -- adAccountsAudiencesSharedAccountsList200ResponseItems :: [SharedAudienceAccount]
    <*> arbitraryReducedMaybe n -- adAccountsAudiencesSharedAccountsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary AdAccountsCountryResponse where
  arbitrary = sized genAdAccountsCountryResponse

genAdAccountsCountryResponse :: Int -> Gen AdAccountsCountryResponse
genAdAccountsCountryResponse n =
  AdAccountsCountryResponse
    <$> arbitraryReducedMaybe n -- adAccountsCountryResponseItems :: Maybe [AdAccountsCountryResponseData]
  
instance Arbitrary AdAccountsCountryResponseData where
  arbitrary = sized genAdAccountsCountryResponseData

genAdAccountsCountryResponseData :: Int -> Gen AdAccountsCountryResponseData
genAdAccountsCountryResponseData n =
  AdAccountsCountryResponseData
    <$> arbitraryReducedMaybe n -- adAccountsCountryResponseDataCode :: Maybe AdCountry
    <*> arbitraryReducedMaybe n -- adAccountsCountryResponseDataCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsCountryResponseDataIndex :: Maybe Double
    <*> arbitraryReducedMaybe n -- adAccountsCountryResponseDataName :: Maybe Text
  
instance Arbitrary AdAccountsList200Response where
  arbitrary = sized genAdAccountsList200Response

genAdAccountsList200Response :: Int -> Gen AdAccountsList200Response
genAdAccountsList200Response n =
  AdAccountsList200Response
    <$> arbitraryReduced n -- adAccountsList200ResponseItems :: [AdAccount]
    <*> arbitraryReducedMaybe n -- adAccountsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary AdAccountsSubscriptionsGetList200Response where
  arbitrary = sized genAdAccountsSubscriptionsGetList200Response

genAdAccountsSubscriptionsGetList200Response :: Int -> Gen AdAccountsSubscriptionsGetList200Response
genAdAccountsSubscriptionsGetList200Response n =
  AdAccountsSubscriptionsGetList200Response
    <$> arbitraryReduced n -- adAccountsSubscriptionsGetList200ResponseItems :: [AdAccountGetSubscriptionResponse]
    <*> arbitraryReducedMaybe n -- adAccountsSubscriptionsGetList200ResponseBookmark :: Maybe Text
  
instance Arbitrary AdArrayResponse where
  arbitrary = sized genAdArrayResponse

genAdArrayResponse :: Int -> Gen AdArrayResponse
genAdArrayResponse n =
  AdArrayResponse
    <$> arbitraryReducedMaybe n -- adArrayResponseItems :: Maybe [AdArrayResponseElement]
  
instance Arbitrary AdArrayResponseElement where
  arbitrary = sized genAdArrayResponseElement

genAdArrayResponseElement :: Int -> Gen AdArrayResponseElement
genAdArrayResponseElement n =
  AdArrayResponseElement
    <$> arbitraryReducedMaybe n -- adArrayResponseElementData :: Maybe AdResponse
    <*> arbitraryReducedMaybe n -- adArrayResponseElementExceptions :: Maybe Exception
  
instance Arbitrary AdCommon where
  arbitrary = sized genAdCommon

genAdCommon :: Int -> Gen AdCommon
genAdCommon n =
  AdCommon
    <$> arbitraryReducedMaybe n -- adCommonAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonCarouselAndroidDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCommonCarouselDestinationUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCommonCarouselIosDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCommonClickTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- adCommonDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCommonIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adCommonTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adCommonViewTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adCommonCustomizableCtaType :: Maybe E'CustomizableCtaType
    <*> arbitraryReducedMaybe n -- adCommonQuizPinData :: Maybe QuizPinData
  
instance Arbitrary AdCreateRequest where
  arbitrary = sized genAdCreateRequest

genAdCreateRequest :: Int -> Gen AdCreateRequest
genAdCreateRequest n =
  AdCreateRequest
    <$> arbitrary -- adCreateRequestAdGroupId :: Text
    <*> arbitraryReducedMaybe n -- adCreateRequestAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestCarouselAndroidDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCreateRequestCarouselDestinationUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCreateRequestCarouselIosDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCreateRequestClickTrackingUrl :: Maybe Text
    <*> arbitraryReduced n -- adCreateRequestCreativeType :: CreativeType
    <*> arbitraryReducedMaybe n -- adCreateRequestDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateRequestIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adCreateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adCreateRequestViewTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adCreateRequestCustomizableCtaType :: Maybe E'CustomizableCtaType
    <*> arbitraryReducedMaybe n -- adCreateRequestQuizPinData :: Maybe QuizPinData
    <*> arbitrary -- adCreateRequestPinId :: Text
  
instance Arbitrary AdGroupArrayResponse where
  arbitrary = sized genAdGroupArrayResponse

genAdGroupArrayResponse :: Int -> Gen AdGroupArrayResponse
genAdGroupArrayResponse n =
  AdGroupArrayResponse
    <$> arbitraryReducedMaybe n -- adGroupArrayResponseItems :: Maybe [AdGroupArrayResponseElement]
  
instance Arbitrary AdGroupArrayResponseElement where
  arbitrary = sized genAdGroupArrayResponseElement

genAdGroupArrayResponseElement :: Int -> Gen AdGroupArrayResponseElement
genAdGroupArrayResponseElement n =
  AdGroupArrayResponseElement
    <$> arbitraryReducedMaybe n -- adGroupArrayResponseElementData :: Maybe AdGroupResponse
    <*> arbitraryReducedMaybe n -- adGroupArrayResponseElementExceptions :: Maybe [Exception]
  
instance Arbitrary AdGroupAudienceSizingRequest where
  arbitrary = sized genAdGroupAudienceSizingRequest

genAdGroupAudienceSizingRequest :: Int -> Gen AdGroupAudienceSizingRequest
genAdGroupAudienceSizingRequest n =
  AdGroupAudienceSizingRequest
    <$> arbitraryReducedMaybe n -- adGroupAudienceSizingRequestAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingRequestPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingRequestCreativeTypes :: Maybe [E'CreativeTypes]
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingRequestTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingRequestProductGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingRequestKeywords :: Maybe [AdGroupAudienceSizingRequestKeywordsInner]
  
instance Arbitrary AdGroupAudienceSizingRequestKeywordsInner where
  arbitrary = sized genAdGroupAudienceSizingRequestKeywordsInner

genAdGroupAudienceSizingRequestKeywordsInner :: Int -> Gen AdGroupAudienceSizingRequestKeywordsInner
genAdGroupAudienceSizingRequestKeywordsInner n =
  AdGroupAudienceSizingRequestKeywordsInner
    <$> arbitraryReduced n -- adGroupAudienceSizingRequestKeywordsInnerMatchType :: MatchTypeResponse
    <*> arbitrary -- adGroupAudienceSizingRequestKeywordsInnerValue :: Text
  
instance Arbitrary AdGroupAudienceSizingResponse where
  arbitrary = sized genAdGroupAudienceSizingResponse

genAdGroupAudienceSizingResponse :: Int -> Gen AdGroupAudienceSizingResponse
genAdGroupAudienceSizingResponse n =
  AdGroupAudienceSizingResponse
    <$> arbitraryReducedMaybe n -- adGroupAudienceSizingResponseAudienceSizeLowerBound :: Maybe Double
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingResponseAudienceSizeUpperBound :: Maybe Double
  
instance Arbitrary AdGroupCommon where
  arbitrary = sized genAdGroupCommon

genAdGroupCommon :: Int -> Gen AdGroupCommon
genAdGroupCommon n =
  AdGroupCommon
    <$> arbitraryReducedMaybe n -- adGroupCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCommonStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupCommonBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupCommonBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupCommonStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupCommonLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupCommonAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCommonPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupCommonPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupCommonCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCommonBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupCommonBidStrategyType :: Maybe E'BidStrategyType
    <*> arbitraryReducedMaybe n -- adGroupCommonTargetingTemplateIds :: Maybe [Text]
  
instance Arbitrary AdGroupCreateRequest where
  arbitrary = sized genAdGroupCreateRequest

genAdGroupCreateRequest :: Int -> Gen AdGroupCreateRequest
genAdGroupCreateRequest n =
  AdGroupCreateRequest
    <$> arbitrary -- adGroupCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitrary -- adGroupCreateRequestCampaignId :: Text
    <*> arbitraryReduced n -- adGroupCreateRequestBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBidStrategyType :: Maybe E'BidStrategyType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestTargetingTemplateIds :: Maybe [Text]
  
instance Arbitrary AdGroupResponse where
  arbitrary = sized genAdGroupResponse

genAdGroupResponse :: Int -> Gen AdGroupResponse
genAdGroupResponse n =
  AdGroupResponse
    <$> arbitraryReducedMaybe n -- adGroupResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupResponseBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupResponseBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupResponseStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupResponseLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupResponseAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupResponsePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupResponsePacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupResponseCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupResponseBidStrategyType :: Maybe E'BidStrategyType
    <*> arbitraryReducedMaybe n -- adGroupResponseTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseType :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseConversionLearningModeType :: Maybe E'ConversionLearningModeType
    <*> arbitraryReducedMaybe n -- adGroupResponseSummaryStatus :: Maybe AdGroupSummaryStatus
    <*> arbitraryReducedMaybe n -- adGroupResponseFeedProfileId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseDcaAssets :: Maybe AnyType
  
instance Arbitrary AdGroupUpdateRequest where
  arbitrary = sized genAdGroupUpdateRequest

genAdGroupUpdateRequest :: Int -> Gen AdGroupUpdateRequest
genAdGroupUpdateRequest n =
  AdGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- adGroupUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBidStrategyType :: Maybe E'BidStrategyType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestTargetingTemplateIds :: Maybe [Text]
    <*> arbitrary -- adGroupUpdateRequestId :: Text
  
instance Arbitrary AdGroupsAnalyticsResponseInner where
  arbitrary = sized genAdGroupsAnalyticsResponseInner

genAdGroupsAnalyticsResponseInner :: Int -> Gen AdGroupsAnalyticsResponseInner
genAdGroupsAnalyticsResponseInner n =
  AdGroupsAnalyticsResponseInner
    <$> arbitrary -- adGroupsAnalyticsResponseInnerAdGroupId :: Text
    <*> arbitraryReducedMaybe n -- adGroupsAnalyticsResponseInnerDate :: Maybe Date
  
instance Arbitrary AdGroupsList200Response where
  arbitrary = sized genAdGroupsList200Response

genAdGroupsList200Response :: Int -> Gen AdGroupsList200Response
genAdGroupsList200Response n =
  AdGroupsList200Response
    <$> arbitraryReduced n -- adGroupsList200ResponseItems :: [AdGroupResponse]
    <*> arbitraryReducedMaybe n -- adGroupsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary AdPinId where
  arbitrary = sized genAdPinId

genAdPinId :: Int -> Gen AdPinId
genAdPinId n =
  AdPinId
    <$> arbitraryReducedMaybe n -- adPinIdPinId :: Maybe Text
  
instance Arbitrary AdPreviewCreateFromImage where
  arbitrary = sized genAdPreviewCreateFromImage

genAdPreviewCreateFromImage :: Int -> Gen AdPreviewCreateFromImage
genAdPreviewCreateFromImage n =
  AdPreviewCreateFromImage
    <$> arbitrary -- adPreviewCreateFromImageImageUrl :: Text
    <*> arbitrary -- adPreviewCreateFromImageTitle :: Text
  
instance Arbitrary AdPreviewCreateFromPin where
  arbitrary = sized genAdPreviewCreateFromPin

genAdPreviewCreateFromPin :: Int -> Gen AdPreviewCreateFromPin
genAdPreviewCreateFromPin n =
  AdPreviewCreateFromPin
    <$> arbitrary -- adPreviewCreateFromPinPinId :: Text
  
instance Arbitrary AdPreviewRequest where
  arbitrary = sized genAdPreviewRequest

genAdPreviewRequest :: Int -> Gen AdPreviewRequest
genAdPreviewRequest n =
  AdPreviewRequest
    <$> arbitrary -- adPreviewRequestImageUrl :: Text
    <*> arbitrary -- adPreviewRequestTitle :: Text
    <*> arbitrary -- adPreviewRequestPinId :: Text
  
instance Arbitrary AdPreviewURLResponse where
  arbitrary = sized genAdPreviewURLResponse

genAdPreviewURLResponse :: Int -> Gen AdPreviewURLResponse
genAdPreviewURLResponse n =
  AdPreviewURLResponse
    <$> arbitraryReducedMaybe n -- adPreviewURLResponseUrl :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- adResponseCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- adResponseDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adResponseIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adResponseTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adResponseViewTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adResponseCustomizableCtaType :: Maybe E'CustomizableCtaType
    <*> arbitraryReducedMaybe n -- adResponseQuizPinData :: Maybe QuizPinData
    <*> arbitraryReducedMaybe n -- adResponsePinId :: Maybe Text
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
  
instance Arbitrary AdUpdateRequest where
  arbitrary = sized genAdUpdateRequest

genAdUpdateRequest :: Int -> Gen AdUpdateRequest
genAdUpdateRequest n =
  AdUpdateRequest
    <$> arbitraryReducedMaybe n -- adUpdateRequestAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestCarouselAndroidDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adUpdateRequestCarouselDestinationUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adUpdateRequestCarouselIosDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adUpdateRequestClickTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- adUpdateRequestDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adUpdateRequestIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adUpdateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adUpdateRequestViewTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adUpdateRequestCustomizableCtaType :: Maybe E'CustomizableCtaType
    <*> arbitraryReducedMaybe n -- adUpdateRequestQuizPinData :: Maybe QuizPinData
    <*> arbitrary -- adUpdateRequestId :: Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestPinId :: Maybe Text
  
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
    <*> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestColumns :: [ReportingColumnAsync]
    <*> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestLevel :: MetricsReportingLevel
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestReportFormat :: Maybe DataOutputFormat
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestPrimarySort :: Maybe E'PrimarySort
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestStartHour :: Maybe Int
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestEndHour :: Maybe Int
  
instance Arbitrary AdsAnalyticsCreateAsyncResponse where
  arbitrary = sized genAdsAnalyticsCreateAsyncResponse

genAdsAnalyticsCreateAsyncResponse :: Int -> Gen AdsAnalyticsCreateAsyncResponse
genAdsAnalyticsCreateAsyncResponse n =
  AdsAnalyticsCreateAsyncResponse
    <$> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncResponseReportStatus :: Maybe BulkReportingJobStatus
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncResponseToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncResponseMessage :: Maybe Text
  
instance Arbitrary AdsAnalyticsGetAsyncResponse where
  arbitrary = sized genAdsAnalyticsGetAsyncResponse

genAdsAnalyticsGetAsyncResponse :: Int -> Gen AdsAnalyticsGetAsyncResponse
genAdsAnalyticsGetAsyncResponse n =
  AdsAnalyticsGetAsyncResponse
    <$> arbitraryReducedMaybe n -- adsAnalyticsGetAsyncResponseReportStatus :: Maybe BulkReportingJobStatus
    <*> arbitraryReducedMaybe n -- adsAnalyticsGetAsyncResponseUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsGetAsyncResponseSize :: Maybe Double
  
instance Arbitrary AdsAnalyticsMetricsFilter where
  arbitrary = sized genAdsAnalyticsMetricsFilter

genAdsAnalyticsMetricsFilter :: Int -> Gen AdsAnalyticsMetricsFilter
genAdsAnalyticsMetricsFilter n =
  AdsAnalyticsMetricsFilter
    <$> arbitraryReduced n -- adsAnalyticsMetricsFilterField :: AdsAnalyticsFilterColumn
    <*> arbitraryReduced n -- adsAnalyticsMetricsFilterOperator :: AdsAnalyticsFilterOperator
    <*> arbitrary -- adsAnalyticsMetricsFilterValues :: [Double]
  
instance Arbitrary AdsAnalyticsResponseInner where
  arbitrary = sized genAdsAnalyticsResponseInner

genAdsAnalyticsResponseInner :: Int -> Gen AdsAnalyticsResponseInner
genAdsAnalyticsResponseInner n =
  AdsAnalyticsResponseInner
    <$> arbitrary -- adsAnalyticsResponseInnerAdId :: Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsResponseInnerDate :: Maybe Date
  
instance Arbitrary AdsCreditDiscountsResponse where
  arbitrary = sized genAdsCreditDiscountsResponse

genAdsCreditDiscountsResponse :: Int -> Gen AdsCreditDiscountsResponse
genAdsCreditDiscountsResponse n =
  AdsCreditDiscountsResponse
    <$> arbitraryReducedMaybe n -- adsCreditDiscountsResponseActive :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseDiscountType :: Maybe E'DiscountType
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseDiscountInMicroCurrency :: Maybe Double
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseDiscountCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseRemainingDiscountInMicroCurrency :: Maybe Double
  
instance Arbitrary AdsCreditRedeemRequest where
  arbitrary = sized genAdsCreditRedeemRequest

genAdsCreditRedeemRequest :: Int -> Gen AdsCreditRedeemRequest
genAdsCreditRedeemRequest n =
  AdsCreditRedeemRequest
    <$> arbitrary -- adsCreditRedeemRequestOfferCodeHash :: Text
    <*> arbitrary -- adsCreditRedeemRequestValidateOnly :: Bool
  
instance Arbitrary AdsCreditRedeemResponse where
  arbitrary = sized genAdsCreditRedeemResponse

genAdsCreditRedeemResponse :: Int -> Gen AdsCreditRedeemResponse
genAdsCreditRedeemResponse n =
  AdsCreditRedeemResponse
    <$> arbitraryReducedMaybe n -- adsCreditRedeemResponseSuccess :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adsCreditRedeemResponseErrorCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- adsCreditRedeemResponseErrorMessage :: Maybe Text
  
instance Arbitrary AdsCreditsDiscountsGet200Response where
  arbitrary = sized genAdsCreditsDiscountsGet200Response

genAdsCreditsDiscountsGet200Response :: Int -> Gen AdsCreditsDiscountsGet200Response
genAdsCreditsDiscountsGet200Response n =
  AdsCreditsDiscountsGet200Response
    <$> arbitraryReduced n -- adsCreditsDiscountsGet200ResponseItems :: [AdsCreditDiscountsResponse]
    <*> arbitraryReducedMaybe n -- adsCreditsDiscountsGet200ResponseBookmark :: Maybe Text
  
instance Arbitrary AdsList200Response where
  arbitrary = sized genAdsList200Response

genAdsList200Response :: Int -> Gen AdsList200Response
genAdsList200Response n =
  AdsList200Response
    <$> arbitraryReduced n -- adsList200ResponseItems :: [AdResponse]
    <*> arbitraryReducedMaybe n -- adsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary AdvancedAuctionBidOptions where
  arbitrary = sized genAdvancedAuctionBidOptions

genAdvancedAuctionBidOptions :: Int -> Gen AdvancedAuctionBidOptions
genAdvancedAuctionBidOptions n =
  AdvancedAuctionBidOptions
    <$> arbitraryReducedMaybe n -- advancedAuctionBidOptionsBidInMicroCurrency :: Maybe Integer
    <*> arbitraryReducedMaybe n -- advancedAuctionBidOptionsAppTypeMultipliers :: Maybe AppTypeMultipliers
    <*> arbitraryReducedMaybe n -- advancedAuctionBidOptionsPlacementMultipliers :: Maybe PlacementMultipliers
  
instance Arbitrary AdvancedAuctionItem where
  arbitrary = sized genAdvancedAuctionItem

genAdvancedAuctionItem :: Int -> Gen AdvancedAuctionItem
genAdvancedAuctionItem n =
  AdvancedAuctionItem
    <$> arbitrary -- advancedAuctionItemItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemCountry :: Country
    <*> arbitraryReduced n -- advancedAuctionItemLanguage :: Language
    <*> arbitraryReduced n -- advancedAuctionItemBidOptions :: AdvancedAuctionBidOptions
  
instance Arbitrary AdvancedAuctionItems where
  arbitrary = sized genAdvancedAuctionItems

genAdvancedAuctionItems :: Int -> Gen AdvancedAuctionItems
genAdvancedAuctionItems n =
  AdvancedAuctionItems
    <$> arbitraryReducedMaybe n -- advancedAuctionItemsCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- advancedAuctionItemsItems :: Maybe [AdvancedAuctionItem]
  
instance Arbitrary AdvancedAuctionItemsGetRecord where
  arbitrary = sized genAdvancedAuctionItemsGetRecord

genAdvancedAuctionItemsGetRecord :: Int -> Gen AdvancedAuctionItemsGetRecord
genAdvancedAuctionItemsGetRecord n =
  AdvancedAuctionItemsGetRecord
    <$> arbitrary -- advancedAuctionItemsGetRecordItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsGetRecordCountry :: Country
    <*> arbitraryReduced n -- advancedAuctionItemsGetRecordLanguage :: Language
  
instance Arbitrary AdvancedAuctionItemsGetRequest where
  arbitrary = sized genAdvancedAuctionItemsGetRequest

genAdvancedAuctionItemsGetRequest :: Int -> Gen AdvancedAuctionItemsGetRequest
genAdvancedAuctionItemsGetRequest n =
  AdvancedAuctionItemsGetRequest
    <$> arbitrary -- advancedAuctionItemsGetRequestCatalogId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsGetRequestItems :: [AdvancedAuctionItemsGetRecord]
  
instance Arbitrary AdvancedAuctionItemsSubmitDeleteRecord where
  arbitrary = sized genAdvancedAuctionItemsSubmitDeleteRecord

genAdvancedAuctionItemsSubmitDeleteRecord :: Int -> Gen AdvancedAuctionItemsSubmitDeleteRecord
genAdvancedAuctionItemsSubmitDeleteRecord n =
  AdvancedAuctionItemsSubmitDeleteRecord
    <$> arbitrary -- advancedAuctionItemsSubmitDeleteRecordItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitDeleteRecordCountry :: Country
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitDeleteRecordLanguage :: Language
  
instance Arbitrary AdvancedAuctionItemsSubmitRecord where
  arbitrary = sized genAdvancedAuctionItemsSubmitRecord

genAdvancedAuctionItemsSubmitRecord :: Int -> Gen AdvancedAuctionItemsSubmitRecord
genAdvancedAuctionItemsSubmitRecord n =
  AdvancedAuctionItemsSubmitRecord
    <$> arbitraryReduced n -- advancedAuctionItemsSubmitRecordOperation :: AdvancedAuctionOperation
    <*> arbitrary -- advancedAuctionItemsSubmitRecordItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitRecordCountry :: Country
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitRecordLanguage :: Language
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitRecordBidOptions :: AdvancedAuctionBidOptions
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitRecordUpdateMask :: [UpdateMaskBidOptionField]
  
instance Arbitrary AdvancedAuctionItemsSubmitRequest where
  arbitrary = sized genAdvancedAuctionItemsSubmitRequest

genAdvancedAuctionItemsSubmitRequest :: Int -> Gen AdvancedAuctionItemsSubmitRequest
genAdvancedAuctionItemsSubmitRequest n =
  AdvancedAuctionItemsSubmitRequest
    <$> arbitrary -- advancedAuctionItemsSubmitRequestCatalogId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitRequestItems :: [AdvancedAuctionItemsSubmitRecord]
  
instance Arbitrary AdvancedAuctionItemsSubmitUpsertRecord where
  arbitrary = sized genAdvancedAuctionItemsSubmitUpsertRecord

genAdvancedAuctionItemsSubmitUpsertRecord :: Int -> Gen AdvancedAuctionItemsSubmitUpsertRecord
genAdvancedAuctionItemsSubmitUpsertRecord n =
  AdvancedAuctionItemsSubmitUpsertRecord
    <$> arbitrary -- advancedAuctionItemsSubmitUpsertRecordItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitUpsertRecordCountry :: Country
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitUpsertRecordLanguage :: Language
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitUpsertRecordBidOptions :: AdvancedAuctionBidOptions
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitUpsertRecordUpdateMask :: [UpdateMaskBidOptionField]
  
instance Arbitrary AdvancedAuctionKey where
  arbitrary = sized genAdvancedAuctionKey

genAdvancedAuctionKey :: Int -> Gen AdvancedAuctionKey
genAdvancedAuctionKey n =
  AdvancedAuctionKey
    <$> arbitrary -- advancedAuctionKeyItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionKeyCountry :: Country
    <*> arbitraryReduced n -- advancedAuctionKeyLanguage :: Language
  
instance Arbitrary AdvancedAuctionOperationError where
  arbitrary = sized genAdvancedAuctionOperationError

genAdvancedAuctionOperationError :: Int -> Gen AdvancedAuctionOperationError
genAdvancedAuctionOperationError n =
  AdvancedAuctionOperationError
    <$> arbitraryReducedMaybe n -- advancedAuctionOperationErrorCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- advancedAuctionOperationErrorMessage :: Maybe Text
  
instance Arbitrary AdvancedAuctionProcessedItem where
  arbitrary = sized genAdvancedAuctionProcessedItem

genAdvancedAuctionProcessedItem :: Int -> Gen AdvancedAuctionProcessedItem
genAdvancedAuctionProcessedItem n =
  AdvancedAuctionProcessedItem
    <$> arbitraryReduced n -- advancedAuctionProcessedItemOperation :: AdvancedAuctionOperation
    <*> arbitrary -- advancedAuctionProcessedItemItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionProcessedItemCountry :: Country
    <*> arbitraryReduced n -- advancedAuctionProcessedItemLanguage :: Language
    <*> arbitraryReduced n -- advancedAuctionProcessedItemBidOptions :: AdvancedAuctionBidOptions
    <*> arbitraryReduced n -- advancedAuctionProcessedItemUpdateMask :: [UpdateMaskBidOptionField]
    <*> arbitraryReducedMaybe n -- advancedAuctionProcessedItemErrors :: Maybe [AdvancedAuctionOperationError]
  
instance Arbitrary AdvancedAuctionProcessedItems where
  arbitrary = sized genAdvancedAuctionProcessedItems

genAdvancedAuctionProcessedItems :: Int -> Gen AdvancedAuctionProcessedItems
genAdvancedAuctionProcessedItems n =
  AdvancedAuctionProcessedItems
    <$> arbitraryReducedMaybe n -- advancedAuctionProcessedItemsCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- advancedAuctionProcessedItemsItems :: Maybe [AdvancedAuctionProcessedItem]
  
instance Arbitrary AnalyticsDailyMetrics where
  arbitrary = sized genAnalyticsDailyMetrics

genAnalyticsDailyMetrics :: Int -> Gen AnalyticsDailyMetrics
genAnalyticsDailyMetrics n =
  AnalyticsDailyMetrics
    <$> arbitraryReducedMaybe n -- analyticsDailyMetricsDataStatus :: Maybe DataStatus
    <*> arbitraryReducedMaybe n -- analyticsDailyMetricsDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- analyticsDailyMetricsMetrics :: Maybe (Map.Map String Double)
  
instance Arbitrary AnalyticsMetricsResponse where
  arbitrary = sized genAnalyticsMetricsResponse

genAnalyticsMetricsResponse :: Int -> Gen AnalyticsMetricsResponse
genAnalyticsMetricsResponse n =
  AnalyticsMetricsResponse
    <$> arbitraryReducedMaybe n -- analyticsMetricsResponseSummaryMetrics :: Maybe (Map.Map String Double)
    <*> arbitraryReducedMaybe n -- analyticsMetricsResponseDailyMetrics :: Maybe [AnalyticsDailyMetrics]
  
instance Arbitrary AppTypeMultipliers where
  arbitrary = sized genAppTypeMultipliers

genAppTypeMultipliers :: Int -> Gen AppTypeMultipliers
genAppTypeMultipliers n =
  AppTypeMultipliers
    <$> arbitraryReducedMaybe n -- appTypeMultipliersAppType :: Maybe TargetingSpecAppType
  
instance Arbitrary AssetGroupBinding where
  arbitrary = sized genAssetGroupBinding

genAssetGroupBinding :: Int -> Gen AssetGroupBinding
genAssetGroupBinding n =
  AssetGroupBinding
    <$> arbitraryReducedMaybe n -- assetGroupBindingId :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetGroupBindingAssetGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetGroupBindingAssetGroupDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetGroupBindingAssetGroupTypes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- assetGroupBindingAdAccountsIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- assetGroupBindingProfilesIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- assetGroupBindingCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- assetGroupBindingUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- assetGroupBindingOwner :: Maybe BusinessAccessUserSummary
    <*> arbitraryReducedMaybe n -- assetGroupBindingCreatedBy :: Maybe BusinessAccessUserSummary
  
instance Arbitrary AssetIdPermissions where
  arbitrary = sized genAssetIdPermissions

genAssetIdPermissions :: Int -> Gen AssetIdPermissions
genAssetIdPermissions n =
  AssetIdPermissions
    <$> arbitraryReducedMaybe n -- assetIdPermissionsAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetIdPermissionsAssetType :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetIdPermissionsPermissions :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- assetIdPermissionsAssetGroupInfo :: Maybe AssetGroupBinding
  
instance Arbitrary Audience where
  arbitrary = sized genAudience

genAudience :: Int -> Gen Audience
genAudience n =
  Audience
    <$> arbitraryReducedMaybe n -- audienceAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceAudienceType :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRule :: Maybe AudienceRule
    <*> arbitraryReducedMaybe n -- audienceSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceType :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCreatedTimestamp :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceUpdatedTimestamp :: Maybe Int
  
instance Arbitrary AudienceCategory where
  arbitrary = sized genAudienceCategory

genAudienceCategory :: Int -> Gen AudienceCategory
genAudienceCategory n =
  AudienceCategory
    <$> arbitraryReducedMaybe n -- audienceCategoryKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCategoryName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCategoryRatio :: Maybe Double
    <*> arbitraryReducedMaybe n -- audienceCategoryIndex :: Maybe Double
    <*> arbitraryReducedMaybe n -- audienceCategoryId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCategorySubcategories :: Maybe [AudienceSubcategory]
  
instance Arbitrary AudienceCommon where
  arbitrary = sized genAudienceCommon

genAudienceCommon :: Int -> Gen AudienceCommon
genAudienceCommon n =
  AudienceCommon
    <$> arbitraryReducedMaybe n -- audienceCommonAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCommonRule :: Maybe AudienceRule
  
instance Arbitrary AudienceCreateCustomRequest where
  arbitrary = sized genAudienceCreateCustomRequest

genAudienceCreateCustomRequest :: Int -> Gen AudienceCreateCustomRequest
genAudienceCreateCustomRequest n =
  AudienceCreateCustomRequest
    <$> arbitraryReducedMaybe n -- audienceCreateCustomRequestAdAccountId :: Maybe Text
    <*> arbitrary -- audienceCreateCustomRequestName :: Text
    <*> arbitraryReduced n -- audienceCreateCustomRequestRule :: AudienceRule
    <*> arbitraryReduced n -- audienceCreateCustomRequestSharingType :: AudienceSharingType
    <*> arbitraryReduced n -- audienceCreateCustomRequestDataParty :: AudienceDataParty
    <*> arbitraryReducedMaybe n -- audienceCreateCustomRequestCategory :: Maybe Text
  
instance Arbitrary AudienceCreateRequest where
  arbitrary = sized genAudienceCreateRequest

genAudienceCreateRequest :: Int -> Gen AudienceCreateRequest
genAudienceCreateRequest n =
  AudienceCreateRequest
    <$> arbitraryReducedMaybe n -- audienceCreateRequestAdAccountId :: Maybe Text
    <*> arbitrary -- audienceCreateRequestName :: Text
    <*> arbitraryReduced n -- audienceCreateRequestRule :: AudienceRule
    <*> arbitraryReducedMaybe n -- audienceCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- audienceCreateRequestAudienceType :: AudienceCreateRequest1AudienceType
  
instance Arbitrary AudienceCreateRequest1AudienceType where
  arbitrary = sized genAudienceCreateRequest1AudienceType

genAudienceCreateRequest1AudienceType :: Int -> Gen AudienceCreateRequest1AudienceType
genAudienceCreateRequest1AudienceType n =
  
  pure AudienceCreateRequest1AudienceType
   
instance Arbitrary AudienceDefinition where
  arbitrary = sized genAudienceDefinition

genAudienceDefinition :: Int -> Gen AudienceDefinition
genAudienceDefinition n =
  AudienceDefinition
    <$> arbitraryReducedMaybe n -- audienceDefinitionDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceDefinitionType :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceDefinitionScope :: Maybe Text
  
instance Arbitrary AudienceDefinitionResponse where
  arbitrary = sized genAudienceDefinitionResponse

genAudienceDefinitionResponse :: Int -> Gen AudienceDefinitionResponse
genAudienceDefinitionResponse n =
  AudienceDefinitionResponse
    <$> arbitraryReducedMaybe n -- audienceDefinitionResponseItems :: Maybe [AudienceDefinition]
  
instance Arbitrary AudienceDemographicValue where
  arbitrary = sized genAudienceDemographicValue

genAudienceDemographicValue :: Int -> Gen AudienceDemographicValue
genAudienceDemographicValue n =
  AudienceDemographicValue
    <$> arbitraryReducedMaybe n -- audienceDemographicValueKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceDemographicValueName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceDemographicValueRatio :: Maybe Double
  
instance Arbitrary AudienceDemographics where
  arbitrary = sized genAudienceDemographics

genAudienceDemographics :: Int -> Gen AudienceDemographics
genAudienceDemographics n =
  AudienceDemographics
    <$> arbitraryReducedMaybe n -- audienceDemographicsAges :: Maybe [AudienceDemographicValue]
    <*> arbitraryReducedMaybe n -- audienceDemographicsGenders :: Maybe [AudienceDemographicValue]
    <*> arbitraryReducedMaybe n -- audienceDemographicsDevices :: Maybe [AudienceDemographicValue]
    <*> arbitraryReducedMaybe n -- audienceDemographicsMetros :: Maybe [AudienceDemographicValue]
    <*> arbitraryReducedMaybe n -- audienceDemographicsCountries :: Maybe [AudienceDemographicValue]
  
instance Arbitrary AudienceInsightCategoryArrayResponse where
  arbitrary = sized genAudienceInsightCategoryArrayResponse

genAudienceInsightCategoryArrayResponse :: Int -> Gen AudienceInsightCategoryArrayResponse
genAudienceInsightCategoryArrayResponse n =
  AudienceInsightCategoryArrayResponse
    <$> arbitraryReducedMaybe n -- audienceInsightCategoryArrayResponseItems :: Maybe [AudienceInsightCategoryCommon]
  
instance Arbitrary AudienceInsightCategoryCommon where
  arbitrary = sized genAudienceInsightCategoryCommon

genAudienceInsightCategoryCommon :: Int -> Gen AudienceInsightCategoryCommon
genAudienceInsightCategoryCommon n =
  AudienceInsightCategoryCommon
    <$> arbitraryReducedMaybe n -- audienceInsightCategoryCommonKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceInsightCategoryCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceInsightCategoryCommonRatio :: Maybe Double
    <*> arbitraryReducedMaybe n -- audienceInsightCategoryCommonIndex :: Maybe Double
    <*> arbitraryReducedMaybe n -- audienceInsightCategoryCommonId :: Maybe Text
  
instance Arbitrary AudienceInsightsResponse where
  arbitrary = sized genAudienceInsightsResponse

genAudienceInsightsResponse :: Int -> Gen AudienceInsightsResponse
genAudienceInsightsResponse n =
  AudienceInsightsResponse
    <$> arbitraryReducedMaybe n -- audienceInsightsResponseCategories :: Maybe [AudienceCategory]
    <*> arbitraryReducedMaybe n -- audienceInsightsResponseDemographics :: Maybe AudienceDemographics
    <*> arbitraryReducedMaybe n -- audienceInsightsResponseType :: Maybe AudienceInsightType
    <*> arbitraryReducedMaybe n -- audienceInsightsResponseDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceInsightsResponseSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceInsightsResponseSizeIsUpperBound :: Maybe Bool
  
instance Arbitrary AudienceRule where
  arbitrary = sized genAudienceRule

genAudienceRule :: Int -> Gen AudienceRule
genAudienceRule n =
  AudienceRule
    <$> arbitraryReducedMaybe n -- audienceRuleCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRuleCustomerListId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRuleEngagementDomain :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRuleEngagementType :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRuleEvent :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRuleEventData :: Maybe PinterestTagEventData
    <*> arbitraryReducedMaybe n -- audienceRulePercentage :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceRulePinId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRulePrefill :: Maybe Bool
    <*> arbitraryReducedMaybe n -- audienceRuleRetentionDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceRuleSeedId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRuleUrl :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRuleVisitorSourceId :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- audienceRuleEventSource :: Maybe A.Value
    <*> arbitraryReducedMaybeValue n -- audienceRuleIngestionSource :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- audienceRuleEngagerType :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceRuleCampaignId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRuleAdId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRuleObjectiveType :: Maybe [ObjectiveType]
    <*> arbitraryReducedMaybe n -- audienceRuleAdAccountId :: Maybe Text
  
instance Arbitrary AudienceSubcategory where
  arbitrary = sized genAudienceSubcategory

genAudienceSubcategory :: Int -> Gen AudienceSubcategory
genAudienceSubcategory n =
  AudienceSubcategory
    <$> arbitraryReducedMaybe n -- audienceSubcategoryKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceSubcategoryName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceSubcategoryRatio :: Maybe Double
    <*> arbitraryReducedMaybe n -- audienceSubcategoryIndex :: Maybe Double
    <*> arbitraryReducedMaybe n -- audienceSubcategoryId :: Maybe Text
  
instance Arbitrary AudienceUpdateRequest where
  arbitrary = sized genAudienceUpdateRequest

genAudienceUpdateRequest :: Int -> Gen AudienceUpdateRequest
genAudienceUpdateRequest n =
  AudienceUpdateRequest
    <$> arbitraryReducedMaybe n -- audienceUpdateRequestAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceUpdateRequestRule :: Maybe AudienceRule
    <*> arbitraryReducedMaybe n -- audienceUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceUpdateRequestOperationType :: Maybe AudienceUpdateOperationType
  
instance Arbitrary AudiencesList200Response where
  arbitrary = sized genAudiencesList200Response

genAudiencesList200Response :: Int -> Gen AudiencesList200Response
genAudiencesList200Response n =
  AudiencesList200Response
    <$> arbitraryReduced n -- audiencesList200ResponseItems :: [Audience]
    <*> arbitraryReducedMaybe n -- audiencesList200ResponseBookmark :: Maybe Text
  
instance Arbitrary AuthRespondInvitesBody where
  arbitrary = sized genAuthRespondInvitesBody

genAuthRespondInvitesBody :: Int -> Gen AuthRespondInvitesBody
genAuthRespondInvitesBody n =
  AuthRespondInvitesBody
    <$> arbitraryReduced n -- authRespondInvitesBodyInvites :: [AuthRespondInvitesBodyInvitesInner]
  
instance Arbitrary AuthRespondInvitesBodyInvitesInner where
  arbitrary = sized genAuthRespondInvitesBodyInvitesInner

genAuthRespondInvitesBodyInvitesInner :: Int -> Gen AuthRespondInvitesBodyInvitesInner
genAuthRespondInvitesBodyInvitesInner n =
  AuthRespondInvitesBodyInvitesInner
    <$> arbitraryReduced n -- authRespondInvitesBodyInvitesInnerAction :: AuthRespondInvitesBodyInvitesInnerAction
    <*> arbitrary -- authRespondInvitesBodyInvitesInnerInviteId :: Text
  
instance Arbitrary AuthRespondInvitesBodyInvitesInnerAction where
  arbitrary = sized genAuthRespondInvitesBodyInvitesInnerAction

genAuthRespondInvitesBodyInvitesInnerAction :: Int -> Gen AuthRespondInvitesBodyInvitesInnerAction
genAuthRespondInvitesBodyInvitesInnerAction n =
  AuthRespondInvitesBodyInvitesInnerAction
    <$> arbitrary -- authRespondInvitesBodyInvitesInnerActionAcceptInvite :: Bool
    <*> arbitraryReducedMaybe n -- authRespondInvitesBodyInvitesInnerActionAssetIdToPermissions :: Maybe (Map.Map String [Permissions])
  
instance Arbitrary AvailabilityFilter where
  arbitrary = sized genAvailabilityFilter

genAvailabilityFilter :: Int -> Gen AvailabilityFilter
genAvailabilityFilter n =
  AvailabilityFilter
    <$> arbitraryReduced n -- availabilityFilterAvailability :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary BaseInviteDataResponse where
  arbitrary = sized genBaseInviteDataResponse

genBaseInviteDataResponse :: Int -> Gen BaseInviteDataResponse
genBaseInviteDataResponse n =
  BaseInviteDataResponse
    <$> arbitraryReducedMaybe n -- baseInviteDataResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseInviteDataResponseInviteData :: Maybe BaseInviteDataResponseInviteData
    <*> arbitraryReducedMaybe n -- baseInviteDataResponseIsReceivedInvite :: Maybe Bool
    <*> arbitraryReducedMaybe n -- baseInviteDataResponseUser :: Maybe BusinessAccessUserSummary
  
instance Arbitrary BaseInviteDataResponseInviteData where
  arbitrary = sized genBaseInviteDataResponseInviteData

genBaseInviteDataResponseInviteData :: Int -> Gen BaseInviteDataResponseInviteData
genBaseInviteDataResponseInviteData n =
  BaseInviteDataResponseInviteData
    <$> arbitraryReducedMaybe n -- baseInviteDataResponseInviteDataInviteExpiration :: Maybe Int
    <*> arbitraryReducedMaybe n -- baseInviteDataResponseInviteDataInviteStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseInviteDataResponseInviteDataInviteType :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseInviteDataResponseInviteDataLastUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- baseInviteDataResponseInviteDataSentAt :: Maybe Int
  
instance Arbitrary BidFloor where
  arbitrary = sized genBidFloor

genBidFloor :: Int -> Gen BidFloor
genBidFloor n =
  BidFloor
    <$> arbitraryReducedMaybe n -- bidFloorBidFloors :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- bidFloorType :: Maybe Text
  
instance Arbitrary BidFloorRequest where
  arbitrary = sized genBidFloorRequest

genBidFloorRequest :: Int -> Gen BidFloorRequest
genBidFloorRequest n =
  BidFloorRequest
    <$> arbitraryReduced n -- bidFloorRequestBidFloorSpecs :: [BidFloorSpec]
    <*> arbitraryReducedMaybe n -- bidFloorRequestTargetingSpec :: Maybe TargetingSpec
  
instance Arbitrary BidFloorSpec where
  arbitrary = sized genBidFloorSpec

genBidFloorSpec :: Int -> Gen BidFloorSpec
genBidFloorSpec n =
  BidFloorSpec
    <$> arbitraryReducedMaybe n -- bidFloorSpecCountries :: Maybe [Country]
    <*> arbitraryReduced n -- bidFloorSpecCurrency :: Currency
    <*> arbitraryReducedMaybe n -- bidFloorSpecObjectiveType :: Maybe ObjectiveType
    <*> arbitraryReduced n -- bidFloorSpecBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- bidFloorSpecOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- bidFloorSpecCreativeType :: Maybe CreativeType
  
instance Arbitrary BillingProfilesGet200Response where
  arbitrary = sized genBillingProfilesGet200Response

genBillingProfilesGet200Response :: Int -> Gen BillingProfilesGet200Response
genBillingProfilesGet200Response n =
  BillingProfilesGet200Response
    <$> arbitraryReduced n -- billingProfilesGet200ResponseItems :: [BillingProfilesResponse]
    <*> arbitraryReducedMaybe n -- billingProfilesGet200ResponseBookmark :: Maybe Text
  
instance Arbitrary BillingProfilesResponse where
  arbitrary = sized genBillingProfilesResponse

genBillingProfilesResponse :: Int -> Gen BillingProfilesResponse
genBillingProfilesResponse n =
  BillingProfilesResponse
    <$> arbitraryReducedMaybe n -- billingProfilesResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingProfilesResponseCardType :: Maybe E'CardType
    <*> arbitraryReducedMaybe n -- billingProfilesResponseStatus :: Maybe E'Status
    <*> arbitraryReducedMaybe n -- billingProfilesResponseAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingProfilesResponsePaymentMethodBrand :: Maybe E'PaymentMethodBrand
  
instance Arbitrary Board where
  arbitrary = sized genBoard

genBoard :: Int -> Gen Board
genBoard n =
  Board
    <$> arbitraryReducedMaybe n -- boardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- boardBoardPinsModifiedAt :: Maybe DateTime
    <*> arbitrary -- boardName :: Text
    <*> arbitraryReducedMaybe n -- boardDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardCollaboratorCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- boardPinCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- boardFollowerCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- boardMedia :: Maybe BoardMedia
    <*> arbitraryReducedMaybe n -- boardOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- boardPrivacy :: Maybe E'Privacy
  
instance Arbitrary BoardMedia where
  arbitrary = sized genBoardMedia

genBoardMedia :: Int -> Gen BoardMedia
genBoardMedia n =
  BoardMedia
    <$> arbitraryReducedMaybe n -- boardMediaImageCoverUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardMediaPinThumbnailUrls :: Maybe [Text]
  
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
    <*> arbitrary -- boardSectionName :: Text
  
instance Arbitrary BoardSectionsList200Response where
  arbitrary = sized genBoardSectionsList200Response

genBoardSectionsList200Response :: Int -> Gen BoardSectionsList200Response
genBoardSectionsList200Response n =
  BoardSectionsList200Response
    <$> arbitraryReduced n -- boardSectionsList200ResponseItems :: [BoardSection]
    <*> arbitraryReducedMaybe n -- boardSectionsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary BoardUpdate where
  arbitrary = sized genBoardUpdate

genBoardUpdate :: Int -> Gen BoardUpdate
genBoardUpdate n =
  BoardUpdate
    <$> arbitraryReducedMaybe n -- boardUpdateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardUpdateDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardUpdatePrivacy :: Maybe E'Privacy2
  
instance Arbitrary BoardsList200Response where
  arbitrary = sized genBoardsList200Response

genBoardsList200Response :: Int -> Gen BoardsList200Response
genBoardsList200Response n =
  BoardsList200Response
    <$> arbitraryReduced n -- boardsList200ResponseItems :: [Board]
    <*> arbitraryReducedMaybe n -- boardsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary BoardsListPins200Response where
  arbitrary = sized genBoardsListPins200Response

genBoardsListPins200Response :: Int -> Gen BoardsListPins200Response
genBoardsListPins200Response n =
  BoardsListPins200Response
    <$> arbitraryReduced n -- boardsListPins200ResponseItems :: [Pin]
    <*> arbitraryReducedMaybe n -- boardsListPins200ResponseBookmark :: Maybe Text
  
instance Arbitrary BoardsUserFollowsList200Response where
  arbitrary = sized genBoardsUserFollowsList200Response

genBoardsUserFollowsList200Response :: Int -> Gen BoardsUserFollowsList200Response
genBoardsUserFollowsList200Response n =
  BoardsUserFollowsList200Response
    <$> arbitraryReduced n -- boardsUserFollowsList200ResponseItems :: [Board]
    <*> arbitraryReducedMaybe n -- boardsUserFollowsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary BookClosedResponse where
  arbitrary = sized genBookClosedResponse

genBookClosedResponse :: Int -> Gen BookClosedResponse
genBookClosedResponse n =
  BookClosedResponse
    <$> arbitraryReducedMaybe n -- bookClosedResponseConversionMetricsReady :: Maybe Bool
    <*> arbitraryReducedMaybe n -- bookClosedResponseNonConversionMetricsReady :: Maybe Bool
  
instance Arbitrary BrandFilter where
  arbitrary = sized genBrandFilter

genBrandFilter :: Int -> Gen BrandFilter
genBrandFilter n =
  BrandFilter
    <$> arbitraryReduced n -- brandFilterBrand :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary BulkDownloadRequest where
  arbitrary = sized genBulkDownloadRequest

genBulkDownloadRequest :: Int -> Gen BulkDownloadRequest
genBulkDownloadRequest n =
  BulkDownloadRequest
    <$> arbitraryReducedMaybe n -- bulkDownloadRequestEntityTypes :: Maybe [BulkEntityType]
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestEntityIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestUpdatedSince :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilter :: Maybe BulkDownloadRequestCampaignFilter
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestOutputFormat :: Maybe BulkOutputFormat
  
instance Arbitrary BulkDownloadRequestCampaignFilter where
  arbitrary = sized genBulkDownloadRequestCampaignFilter

genBulkDownloadRequestCampaignFilter :: Int -> Gen BulkDownloadRequestCampaignFilter
genBulkDownloadRequestCampaignFilter n =
  BulkDownloadRequestCampaignFilter
    <$> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilterStartTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilterEndTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilterName :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilterCampaignStatus :: Maybe [CampaignSummaryStatus]
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilterObjectiveType :: Maybe [ObjectiveType]
  
instance Arbitrary BulkDownloadResponse where
  arbitrary = sized genBulkDownloadResponse

genBulkDownloadResponse :: Int -> Gen BulkDownloadResponse
genBulkDownloadResponse n =
  BulkDownloadResponse
    <$> arbitraryReducedMaybe n -- bulkDownloadResponseRequestId :: Maybe Text
  
instance Arbitrary BulkUpsertRequest where
  arbitrary = sized genBulkUpsertRequest

genBulkUpsertRequest :: Int -> Gen BulkUpsertRequest
genBulkUpsertRequest n =
  BulkUpsertRequest
    <$> arbitraryReducedMaybe n -- bulkUpsertRequestCreate :: Maybe BulkUpsertRequestCreate
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdate :: Maybe BulkUpsertRequestUpdate
  
instance Arbitrary BulkUpsertRequestCreate where
  arbitrary = sized genBulkUpsertRequestCreate

genBulkUpsertRequestCreate :: Int -> Gen BulkUpsertRequestCreate
genBulkUpsertRequestCreate n =
  BulkUpsertRequestCreate
    <$> arbitraryReducedMaybe n -- bulkUpsertRequestCreateCampaigns :: Maybe [CampaignCreateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateAdGroups :: Maybe [AdGroupCreateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateAds :: Maybe [AdCreateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateProductGroups :: Maybe [ProductGroupPromotionCreateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateKeywords :: Maybe [KeywordsRequest]
  
instance Arbitrary BulkUpsertRequestUpdate where
  arbitrary = sized genBulkUpsertRequestUpdate

genBulkUpsertRequestUpdate :: Int -> Gen BulkUpsertRequestUpdate
genBulkUpsertRequestUpdate n =
  BulkUpsertRequestUpdate
    <$> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCampaigns :: Maybe [CampaignUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateAdGroups :: Maybe [AdGroupUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateAds :: Maybe [AdUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateProductGroups :: Maybe [ProductGroupPromotionUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateKeywords :: Maybe [KeywordUpdate]
  
instance Arbitrary BulkUpsertResponse where
  arbitrary = sized genBulkUpsertResponse

genBulkUpsertResponse :: Int -> Gen BulkUpsertResponse
genBulkUpsertResponse n =
  BulkUpsertResponse
    <$> arbitraryReducedMaybe n -- bulkUpsertResponseRequestId :: Maybe Text
  
instance Arbitrary BulkUpsertStatusResponse where
  arbitrary = sized genBulkUpsertStatusResponse

genBulkUpsertStatusResponse :: Int -> Gen BulkUpsertStatusResponse
genBulkUpsertStatusResponse n =
  BulkUpsertStatusResponse
    <$> arbitraryReducedMaybe n -- bulkUpsertStatusResponseStatus :: Maybe BulkUpsertStatus
    <*> arbitraryReducedMaybe n -- bulkUpsertStatusResponseResultUrl :: Maybe Text
  
instance Arbitrary BusinessAccessError where
  arbitrary = sized genBusinessAccessError

genBusinessAccessError :: Int -> Gen BusinessAccessError
genBusinessAccessError n =
  BusinessAccessError
    <$> arbitrary -- businessAccessErrorCode :: Int
    <*> arbitrary -- businessAccessErrorMessage :: Text
  
instance Arbitrary BusinessAccessUserSummary where
  arbitrary = sized genBusinessAccessUserSummary

genBusinessAccessUserSummary :: Int -> Gen BusinessAccessUserSummary
genBusinessAccessUserSummary n =
  BusinessAccessUserSummary
    <$> arbitraryReducedMaybe n -- businessAccessUserSummaryEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- businessAccessUserSummaryId :: Maybe Text
    <*> arbitraryReducedMaybe n -- businessAccessUserSummaryUsername :: Maybe Text
  
instance Arbitrary BusinessAssetMembersGet200Response where
  arbitrary = sized genBusinessAssetMembersGet200Response

genBusinessAssetMembersGet200Response :: Int -> Gen BusinessAssetMembersGet200Response
genBusinessAssetMembersGet200Response n =
  BusinessAssetMembersGet200Response
    <$> arbitraryReduced n -- businessAssetMembersGet200ResponseItems :: [UserSingleAssetBinding]
    <*> arbitraryReducedMaybe n -- businessAssetMembersGet200ResponseBookmark :: Maybe Text
  
instance Arbitrary BusinessAssetPartnersGet200Response where
  arbitrary = sized genBusinessAssetPartnersGet200Response

genBusinessAssetPartnersGet200Response :: Int -> Gen BusinessAssetPartnersGet200Response
genBusinessAssetPartnersGet200Response n =
  BusinessAssetPartnersGet200Response
    <$> arbitraryReduced n -- businessAssetPartnersGet200ResponseItems :: [UserSingleAssetBinding]
    <*> arbitraryReducedMaybe n -- businessAssetPartnersGet200ResponseBookmark :: Maybe Text
  
instance Arbitrary BusinessAssetsGet200Response where
  arbitrary = sized genBusinessAssetsGet200Response

genBusinessAssetsGet200Response :: Int -> Gen BusinessAssetsGet200Response
genBusinessAssetsGet200Response n =
  BusinessAssetsGet200Response
    <$> arbitraryReduced n -- businessAssetsGet200ResponseItems :: [GetBusinessAssetsResponse]
    <*> arbitraryReducedMaybe n -- businessAssetsGet200ResponseBookmark :: Maybe Text
  
instance Arbitrary BusinessMemberAssetsGet200Response where
  arbitrary = sized genBusinessMemberAssetsGet200Response

genBusinessMemberAssetsGet200Response :: Int -> Gen BusinessMemberAssetsGet200Response
genBusinessMemberAssetsGet200Response n =
  BusinessMemberAssetsGet200Response
    <$> arbitraryReduced n -- businessMemberAssetsGet200ResponseItems :: [AssetIdPermissions]
    <*> arbitraryReducedMaybe n -- businessMemberAssetsGet200ResponseBookmark :: Maybe Text
  
instance Arbitrary BusinessMemberAssetsSummary where
  arbitrary = sized genBusinessMemberAssetsSummary

genBusinessMemberAssetsSummary :: Int -> Gen BusinessMemberAssetsSummary
genBusinessMemberAssetsSummary n =
  BusinessMemberAssetsSummary
    <$> arbitraryReducedMaybe n -- businessMemberAssetsSummaryAdAccounts :: Maybe [BusinessMemberAssetsSummaryAdAccountsInner]
    <*> arbitraryReducedMaybe n -- businessMemberAssetsSummaryProfiles :: Maybe [BusinessMemberAssetsSummaryProfilesInner]
  
instance Arbitrary BusinessMemberAssetsSummaryAdAccountsInner where
  arbitrary = sized genBusinessMemberAssetsSummaryAdAccountsInner

genBusinessMemberAssetsSummaryAdAccountsInner :: Int -> Gen BusinessMemberAssetsSummaryAdAccountsInner
genBusinessMemberAssetsSummaryAdAccountsInner n =
  BusinessMemberAssetsSummaryAdAccountsInner
    <$> arbitraryReducedMaybe n -- businessMemberAssetsSummaryAdAccountsInnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- businessMemberAssetsSummaryAdAccountsInnerPermissions :: Maybe [Text]
  
instance Arbitrary BusinessMemberAssetsSummaryProfilesInner where
  arbitrary = sized genBusinessMemberAssetsSummaryProfilesInner

genBusinessMemberAssetsSummaryProfilesInner :: Int -> Gen BusinessMemberAssetsSummaryProfilesInner
genBusinessMemberAssetsSummaryProfilesInner n =
  BusinessMemberAssetsSummaryProfilesInner
    <$> arbitraryReducedMaybe n -- businessMemberAssetsSummaryProfilesInnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- businessMemberAssetsSummaryProfilesInnerPermissions :: Maybe [Text]
  
instance Arbitrary BusinessMembersAssetAccessDeleteRequest where
  arbitrary = sized genBusinessMembersAssetAccessDeleteRequest

genBusinessMembersAssetAccessDeleteRequest :: Int -> Gen BusinessMembersAssetAccessDeleteRequest
genBusinessMembersAssetAccessDeleteRequest n =
  BusinessMembersAssetAccessDeleteRequest
    <$> arbitraryReduced n -- businessMembersAssetAccessDeleteRequestAccesses :: [BusinessMembersAssetAccessDeleteRequestAccessesInner]
  
instance Arbitrary BusinessMembersAssetAccessDeleteRequestAccessesInner where
  arbitrary = sized genBusinessMembersAssetAccessDeleteRequestAccessesInner

genBusinessMembersAssetAccessDeleteRequestAccessesInner :: Int -> Gen BusinessMembersAssetAccessDeleteRequestAccessesInner
genBusinessMembersAssetAccessDeleteRequestAccessesInner n =
  BusinessMembersAssetAccessDeleteRequestAccessesInner
    <$> arbitrary -- businessMembersAssetAccessDeleteRequestAccessesInnerAssetId :: Text
    <*> arbitrary -- businessMembersAssetAccessDeleteRequestAccessesInnerMemberId :: Text
  
instance Arbitrary BusinessPartnerAssetAccessGet200Response where
  arbitrary = sized genBusinessPartnerAssetAccessGet200Response

genBusinessPartnerAssetAccessGet200Response :: Int -> Gen BusinessPartnerAssetAccessGet200Response
genBusinessPartnerAssetAccessGet200Response n =
  BusinessPartnerAssetAccessGet200Response
    <$> arbitraryReduced n -- businessPartnerAssetAccessGet200ResponseItems :: [GetPartnerAssetsResponse]
    <*> arbitraryReducedMaybe n -- businessPartnerAssetAccessGet200ResponseBookmark :: Maybe Text
  
instance Arbitrary BusinessSharedAudience where
  arbitrary = sized genBusinessSharedAudience

genBusinessSharedAudience :: Int -> Gen BusinessSharedAudience
genBusinessSharedAudience n =
  BusinessSharedAudience
    <$> arbitrary -- businessSharedAudienceAudienceId :: Text
    <*> arbitraryReduced n -- businessSharedAudienceOperationType :: OperationType
    <*> arbitrary -- businessSharedAudienceRecipientBusinessIds :: [Text]
  
instance Arbitrary BusinessSharedAudienceResponse where
  arbitrary = sized genBusinessSharedAudienceResponse

genBusinessSharedAudienceResponse :: Int -> Gen BusinessSharedAudienceResponse
genBusinessSharedAudienceResponse n =
  BusinessSharedAudienceResponse
    <$> arbitraryReducedMaybe n -- businessSharedAudienceResponseAudienceId :: Maybe Text
    <*> arbitraryReducedMaybe n -- businessSharedAudienceResponsePermissions :: Maybe [Role]
    <*> arbitraryReducedMaybe n -- businessSharedAudienceResponseRecipientBusinessIds :: Maybe [Text]
  
instance Arbitrary CampaignCommon where
  arbitrary = sized genCampaignCommon

genCampaignCommon :: Int -> Gen CampaignCommon
genCampaignCommon n =
  CampaignCommon
    <$> arbitraryReducedMaybe n -- campaignCommonAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCommonStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignCommonLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCommonTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCommonStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonIsFlexibleDailyBudgets :: Maybe Bool
  
instance Arbitrary CampaignCreateCommon where
  arbitrary = sized genCampaignCreateCommon

genCampaignCreateCommon :: Int -> Gen CampaignCreateCommon
genCampaignCreateCommon n =
  CampaignCreateCommon
    <$> arbitraryReducedMaybe n -- campaignCreateCommonAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateCommonStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignCreateCommonLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateCommonTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCreateCommonStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateCommonDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonIsAutomatedCampaign :: Maybe Bool
  
instance Arbitrary CampaignCreateRequest where
  arbitrary = sized genCampaignCreateRequest

genCampaignCreateRequest :: Int -> Gen CampaignCreateRequest
genCampaignCreateRequest n =
  CampaignCreateRequest
    <$> arbitrary -- campaignCreateRequestAdAccountId :: Text
    <*> arbitrary -- campaignCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- campaignCreateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignCreateRequestLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCreateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReduced n -- campaignCreateRequestObjectiveType :: ObjectiveType
  
instance Arbitrary CampaignCreateResponse where
  arbitrary = sized genCampaignCreateResponse

genCampaignCreateResponse :: Int -> Gen CampaignCreateResponse
genCampaignCreateResponse n =
  CampaignCreateResponse
    <$> arbitraryReducedMaybe n -- campaignCreateResponseItems :: Maybe [CampaignCreateResponseItem]
  
instance Arbitrary CampaignCreateResponseData where
  arbitrary = sized genCampaignCreateResponseData

genCampaignCreateResponseData :: Int -> Gen CampaignCreateResponseData
genCampaignCreateResponseData n =
  CampaignCreateResponseData
    <$> arbitraryReducedMaybe n -- campaignCreateResponseDataAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataObjectiveType :: Maybe ObjectiveType
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataType :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataSummaryStatus :: Maybe CampaignSummaryStatus
  
instance Arbitrary CampaignCreateResponseItem where
  arbitrary = sized genCampaignCreateResponseItem

genCampaignCreateResponseItem :: Int -> Gen CampaignCreateResponseItem
genCampaignCreateResponseItem n =
  CampaignCreateResponseItem
    <$> arbitraryReducedMaybe n -- campaignCreateResponseItemData :: Maybe CampaignCreateResponseData
    <*> arbitraryReducedMaybe n -- campaignCreateResponseItemExceptions :: Maybe [Exception]
  
instance Arbitrary CampaignId where
  arbitrary = sized genCampaignId

genCampaignId :: Int -> Gen CampaignId
genCampaignId n =
  CampaignId
    <$> arbitraryReducedMaybe n -- campaignIdId :: Maybe Text
  
instance Arbitrary CampaignResponse where
  arbitrary = sized genCampaignResponse

genCampaignResponse :: Int -> Gen CampaignResponse
genCampaignResponse n =
  CampaignResponse
    <$> arbitraryReducedMaybe n -- campaignResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignResponseLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignResponseStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignResponseObjectiveType :: Maybe ObjectiveType
    <*> arbitraryReducedMaybe n -- campaignResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseType :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignResponseSummaryStatus :: Maybe CampaignSummaryStatus
  
instance Arbitrary CampaignUpdateRequest where
  arbitrary = sized genCampaignUpdateRequest

genCampaignUpdateRequest :: Int -> Gen CampaignUpdateRequest
genCampaignUpdateRequest n =
  CampaignUpdateRequest
    <$> arbitrary -- campaignUpdateRequestId :: Text
    <*> arbitrary -- campaignUpdateRequestAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestObjectiveType :: Maybe ObjectiveType
  
instance Arbitrary CampaignUpdateResponse where
  arbitrary = sized genCampaignUpdateResponse

genCampaignUpdateResponse :: Int -> Gen CampaignUpdateResponse
genCampaignUpdateResponse n =
  CampaignUpdateResponse
    <$> arbitraryReducedMaybe n -- campaignUpdateResponseItems :: Maybe [CampaignCreateResponseItem]
  
instance Arbitrary CampaignsAnalyticsResponseInner where
  arbitrary = sized genCampaignsAnalyticsResponseInner

genCampaignsAnalyticsResponseInner :: Int -> Gen CampaignsAnalyticsResponseInner
genCampaignsAnalyticsResponseInner n =
  CampaignsAnalyticsResponseInner
    <$> arbitrary -- campaignsAnalyticsResponseInnerCampaignId :: Text
    <*> arbitraryReducedMaybe n -- campaignsAnalyticsResponseInnerDate :: Maybe Date
  
instance Arbitrary CampaignsList200Response where
  arbitrary = sized genCampaignsList200Response

genCampaignsList200Response :: Int -> Gen CampaignsList200Response
genCampaignsList200Response n =
  CampaignsList200Response
    <$> arbitraryReduced n -- campaignsList200ResponseItems :: [CampaignResponse]
    <*> arbitraryReducedMaybe n -- campaignsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary CancelInvitesBody where
  arbitrary = sized genCancelInvitesBody

genCancelInvitesBody :: Int -> Gen CancelInvitesBody
genCancelInvitesBody n =
  CancelInvitesBody
    <$> arbitrary -- cancelInvitesBodyInviteIds :: [Text]
  
instance Arbitrary Catalog where
  arbitrary = sized genCatalog

genCatalog :: Int -> Gen Catalog
genCatalog n =
  Catalog
    <$> arbitraryReduced n -- catalogCreatedAt :: DateTime
    <*> arbitrary -- catalogId :: Text
    <*> arbitraryReduced n -- catalogUpdatedAt :: DateTime
    <*> arbitrary -- catalogName :: Text
    <*> arbitraryReduced n -- catalogCatalogType :: CatalogsType
  
instance Arbitrary CatalogsCreateCreativeAssetsItem where
  arbitrary = sized genCatalogsCreateCreativeAssetsItem

genCatalogsCreateCreativeAssetsItem :: Int -> Gen CatalogsCreateCreativeAssetsItem
genCatalogsCreateCreativeAssetsItem n =
  CatalogsCreateCreativeAssetsItem
    <$> arbitrary -- catalogsCreateCreativeAssetsItemCreativeAssetsId :: Text
    <*> arbitrary -- catalogsCreateCreativeAssetsItemOperation :: E'Operation2
    <*> arbitraryReduced n -- catalogsCreateCreativeAssetsItemAttributes :: CatalogsCreativeAssetsAttributes
  
instance Arbitrary CatalogsCreateHotelItem where
  arbitrary = sized genCatalogsCreateHotelItem

genCatalogsCreateHotelItem :: Int -> Gen CatalogsCreateHotelItem
genCatalogsCreateHotelItem n =
  CatalogsCreateHotelItem
    <$> arbitrary -- catalogsCreateHotelItemHotelId :: Text
    <*> arbitrary -- catalogsCreateHotelItemOperation :: E'Operation2
    <*> arbitraryReduced n -- catalogsCreateHotelItemAttributes :: CatalogsHotelAttributes
  
instance Arbitrary CatalogsCreateReportResponse where
  arbitrary = sized genCatalogsCreateReportResponse

genCatalogsCreateReportResponse :: Int -> Gen CatalogsCreateReportResponse
genCatalogsCreateReportResponse n =
  CatalogsCreateReportResponse
    <$> arbitraryReducedMaybe n -- catalogsCreateReportResponseToken :: Maybe Text
  
instance Arbitrary CatalogsCreateRequest where
  arbitrary = sized genCatalogsCreateRequest

genCatalogsCreateRequest :: Int -> Gen CatalogsCreateRequest
genCatalogsCreateRequest n =
  CatalogsCreateRequest
    <$> arbitrary -- catalogsCreateRequestCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsCreateRequestName :: Text
  
instance Arbitrary CatalogsCreateRetailItem where
  arbitrary = sized genCatalogsCreateRetailItem

genCatalogsCreateRetailItem :: Int -> Gen CatalogsCreateRetailItem
genCatalogsCreateRetailItem n =
  CatalogsCreateRetailItem
    <$> arbitrary -- catalogsCreateRetailItemItemId :: Text
    <*> arbitrary -- catalogsCreateRetailItemOperation :: E'Operation2
    <*> arbitraryReduced n -- catalogsCreateRetailItemAttributes :: ItemAttributesRequest
  
instance Arbitrary CatalogsCreativeAssetsAttributes where
  arbitrary = sized genCatalogsCreativeAssetsAttributes

genCatalogsCreativeAssetsAttributes :: Int -> Gen CatalogsCreativeAssetsAttributes
genCatalogsCreativeAssetsAttributes n =
  CatalogsCreativeAssetsAttributes
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesGoogleProductCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesCustomLabel0 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesCustomLabel1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesCustomLabel2 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesCustomLabel3 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesCustomLabel4 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesVisibility :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesImageLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesVideoLink :: Maybe Text
  
instance Arbitrary CatalogsCreativeAssetsBatchItem where
  arbitrary = sized genCatalogsCreativeAssetsBatchItem

genCatalogsCreativeAssetsBatchItem :: Int -> Gen CatalogsCreativeAssetsBatchItem
genCatalogsCreativeAssetsBatchItem n =
  CatalogsCreativeAssetsBatchItem
    <$> arbitrary -- catalogsCreativeAssetsBatchItemCreativeAssetsId :: Text
    <*> arbitrary -- catalogsCreativeAssetsBatchItemOperation :: E'Operation
    <*> arbitraryReduced n -- catalogsCreativeAssetsBatchItemAttributes :: CatalogsUpdatableCreativeAssetsAttributes
  
instance Arbitrary CatalogsCreativeAssetsBatchRequest where
  arbitrary = sized genCatalogsCreativeAssetsBatchRequest

genCatalogsCreativeAssetsBatchRequest :: Int -> Gen CatalogsCreativeAssetsBatchRequest
genCatalogsCreativeAssetsBatchRequest n =
  CatalogsCreativeAssetsBatchRequest
    <$> arbitrary -- catalogsCreativeAssetsBatchRequestCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsCreativeAssetsBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsCreativeAssetsBatchRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- catalogsCreativeAssetsBatchRequestItems :: [CatalogsCreativeAssetsBatchItem]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsBatchRequestCatalogId :: Maybe Text
  
instance Arbitrary CatalogsCreativeAssetsFeed where
  arbitrary = sized genCatalogsCreativeAssetsFeed

genCatalogsCreativeAssetsFeed :: Int -> Gen CatalogsCreativeAssetsFeed
genCatalogsCreativeAssetsFeed n =
  CatalogsCreativeAssetsFeed
    <$> arbitraryReduced n -- catalogsCreativeAssetsFeedCreatedAt :: DateTime
    <*> arbitrary -- catalogsCreativeAssetsFeedId :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedUpdatedAt :: DateTime
    <*> arbitrary -- catalogsCreativeAssetsFeedName :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedFormat :: CatalogsFormat
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedCredentials :: CatalogsFeedCredentials
    <*> arbitrary -- catalogsCreativeAssetsFeedLocation :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedPreferredProcessingSchedule :: CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedStatus :: CatalogsStatus
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedDefaultCurrency :: NullableCurrency
    <*> arbitrary -- catalogsCreativeAssetsFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedDefaultCountry :: Country
    <*> arbitrary -- catalogsCreativeAssetsFeedCatalogId :: Text
  
instance Arbitrary CatalogsCreativeAssetsFeedsCreateRequest where
  arbitrary = sized genCatalogsCreativeAssetsFeedsCreateRequest

genCatalogsCreativeAssetsFeedsCreateRequest :: Int -> Gen CatalogsCreativeAssetsFeedsCreateRequest
genCatalogsCreativeAssetsFeedsCreateRequest n =
  CatalogsCreativeAssetsFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitrary -- catalogsCreativeAssetsFeedsCreateRequestName :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsCreateRequestDefaultLocale :: CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsCreateRequestDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitrary -- catalogsCreativeAssetsFeedsCreateRequestLocation :: Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsCreateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsCreativeAssetsFeedsUpdateRequest where
  arbitrary = sized genCatalogsCreativeAssetsFeedsUpdateRequest

genCatalogsCreativeAssetsFeedsUpdateRequest :: Int -> Gen CatalogsCreativeAssetsFeedsUpdateRequest
genCatalogsCreativeAssetsFeedsUpdateRequest n =
  CatalogsCreativeAssetsFeedsUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestStatus :: Maybe CatalogsStatus
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsUpdateRequestCatalogType :: CatalogsType
  
instance Arbitrary CatalogsCreativeAssetsItemErrorResponse where
  arbitrary = sized genCatalogsCreativeAssetsItemErrorResponse

genCatalogsCreativeAssetsItemErrorResponse :: Int -> Gen CatalogsCreativeAssetsItemErrorResponse
genCatalogsCreativeAssetsItemErrorResponse n =
  CatalogsCreativeAssetsItemErrorResponse
    <$> arbitraryReduced n -- catalogsCreativeAssetsItemErrorResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemErrorResponseCreativeAssetsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemErrorResponseErrors :: Maybe [ItemValidationEvent]
  
instance Arbitrary CatalogsCreativeAssetsItemResponse where
  arbitrary = sized genCatalogsCreativeAssetsItemResponse

genCatalogsCreativeAssetsItemResponse :: Int -> Gen CatalogsCreativeAssetsItemResponse
genCatalogsCreativeAssetsItemResponse n =
  CatalogsCreativeAssetsItemResponse
    <$> arbitraryReduced n -- catalogsCreativeAssetsItemResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemResponseCreativeAssetsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemResponsePins :: Maybe [Pin]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemResponseAttributes :: Maybe CatalogsCreativeAssetsAttributes
  
instance Arbitrary CatalogsCreativeAssetsItemsBatch where
  arbitrary = sized genCatalogsCreativeAssetsItemsBatch

genCatalogsCreativeAssetsItemsBatch :: Int -> Gen CatalogsCreativeAssetsItemsBatch
genCatalogsCreativeAssetsItemsBatch n =
  CatalogsCreativeAssetsItemsBatch
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchBatchId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchCreatedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchStatus :: Maybe BatchOperationStatus
    <*> arbitraryReduced n -- catalogsCreativeAssetsItemsBatchCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchItems :: Maybe [CreativeAssetsProcessingRecord]
  
instance Arbitrary CatalogsCreativeAssetsItemsFilter where
  arbitrary = sized genCatalogsCreativeAssetsItemsFilter

genCatalogsCreativeAssetsItemsFilter :: Int -> Gen CatalogsCreativeAssetsItemsFilter
genCatalogsCreativeAssetsItemsFilter n =
  CatalogsCreativeAssetsItemsFilter
    <$> arbitrary -- catalogsCreativeAssetsItemsFilterCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsCreativeAssetsItemsFilterCreativeAssetsIds :: [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsFilterCatalogId :: Maybe Text
  
instance Arbitrary CatalogsCreativeAssetsItemsPostFilter where
  arbitrary = sized genCatalogsCreativeAssetsItemsPostFilter

genCatalogsCreativeAssetsItemsPostFilter :: Int -> Gen CatalogsCreativeAssetsItemsPostFilter
genCatalogsCreativeAssetsItemsPostFilter n =
  CatalogsCreativeAssetsItemsPostFilter
    <$> arbitrary -- catalogsCreativeAssetsItemsPostFilterCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsCreativeAssetsItemsPostFilterCreativeAssetsIds :: [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsPostFilterCatalogId :: Maybe Text
  
instance Arbitrary CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest where
  arbitrary = sized genCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

genCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest :: Int -> Gen CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
genCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest n =
  CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
    <$> arbitrary -- catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogId :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestFilters :: CatalogsCreativeAssetsProductGroupFilters
  
instance Arbitrary CatalogsCreativeAssetsProduct where
  arbitrary = sized genCatalogsCreativeAssetsProduct

genCatalogsCreativeAssetsProduct :: Int -> Gen CatalogsCreativeAssetsProduct
genCatalogsCreativeAssetsProduct n =
  CatalogsCreativeAssetsProduct
    <$> arbitrary -- catalogsCreativeAssetsProductCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductMetadata :: CatalogsCreativeAssetsProductMetadata
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductPin :: Pin
  
instance Arbitrary CatalogsCreativeAssetsProductGroup where
  arbitrary = sized genCatalogsCreativeAssetsProductGroup

genCatalogsCreativeAssetsProductGroup :: Int -> Gen CatalogsCreativeAssetsProductGroup
genCatalogsCreativeAssetsProductGroup n =
  CatalogsCreativeAssetsProductGroup
    <$> arbitrary -- catalogsCreativeAssetsProductGroupCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsCreativeAssetsProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupUpdatedAt :: Maybe Int
    <*> arbitrary -- catalogsCreativeAssetsProductGroupCatalogId :: Text
  
instance Arbitrary CatalogsCreativeAssetsProductGroupCreateRequest where
  arbitrary = sized genCatalogsCreativeAssetsProductGroupCreateRequest

genCatalogsCreativeAssetsProductGroupCreateRequest :: Int -> Gen CatalogsCreativeAssetsProductGroupCreateRequest
genCatalogsCreativeAssetsProductGroupCreateRequest n =
  CatalogsCreativeAssetsProductGroupCreateRequest
    <$> arbitrary -- catalogsCreativeAssetsProductGroupCreateRequestCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsCreativeAssetsProductGroupCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupCreateRequestFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitrary -- catalogsCreativeAssetsProductGroupCreateRequestCatalogId :: Text
  
instance Arbitrary CatalogsCreativeAssetsProductGroupFilterKeys where
  arbitrary = sized genCatalogsCreativeAssetsProductGroupFilterKeys

genCatalogsCreativeAssetsProductGroupFilterKeys :: Int -> Gen CatalogsCreativeAssetsProductGroupFilterKeys
genCatalogsCreativeAssetsProductGroupFilterKeys n =
  CatalogsCreativeAssetsProductGroupFilterKeys
    <$> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCreativeAssetsId :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCustomLabel0 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCustomLabel1 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCustomLabel2 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCustomLabel3 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCustomLabel4 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory6 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory5 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory4 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory3 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory2 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory1 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory0 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysMediaType :: CatalogsProductGroupMultipleMediaTypesCriteria
  
instance Arbitrary CatalogsCreativeAssetsProductGroupFilters where
  arbitrary = sized genCatalogsCreativeAssetsProductGroupFilters

genCatalogsCreativeAssetsProductGroupFilters :: Int -> Gen CatalogsCreativeAssetsProductGroupFilters
genCatalogsCreativeAssetsProductGroupFilters n =
  CatalogsCreativeAssetsProductGroupFilters
    <$> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFiltersAnyOf :: [CatalogsCreativeAssetsProductGroupFilterKeys]
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFiltersAllOf :: [CatalogsCreativeAssetsProductGroupFilterKeys]
  
instance Arbitrary CatalogsCreativeAssetsProductGroupFiltersAllOf where
  arbitrary = sized genCatalogsCreativeAssetsProductGroupFiltersAllOf

genCatalogsCreativeAssetsProductGroupFiltersAllOf :: Int -> Gen CatalogsCreativeAssetsProductGroupFiltersAllOf
genCatalogsCreativeAssetsProductGroupFiltersAllOf n =
  CatalogsCreativeAssetsProductGroupFiltersAllOf
    <$> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFiltersAllOfAllOf :: [CatalogsCreativeAssetsProductGroupFilterKeys]
  
instance Arbitrary CatalogsCreativeAssetsProductGroupFiltersAnyOf where
  arbitrary = sized genCatalogsCreativeAssetsProductGroupFiltersAnyOf

genCatalogsCreativeAssetsProductGroupFiltersAnyOf :: Int -> Gen CatalogsCreativeAssetsProductGroupFiltersAnyOf
genCatalogsCreativeAssetsProductGroupFiltersAnyOf n =
  CatalogsCreativeAssetsProductGroupFiltersAnyOf
    <$> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFiltersAnyOfAnyOf :: [CatalogsCreativeAssetsProductGroupFilterKeys]
  
instance Arbitrary CatalogsCreativeAssetsProductGroupProductCounts where
  arbitrary = sized genCatalogsCreativeAssetsProductGroupProductCounts

genCatalogsCreativeAssetsProductGroupProductCounts :: Int -> Gen CatalogsCreativeAssetsProductGroupProductCounts
genCatalogsCreativeAssetsProductGroupProductCounts n =
  CatalogsCreativeAssetsProductGroupProductCounts
    <$> arbitrary -- catalogsCreativeAssetsProductGroupProductCountsCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsCreativeAssetsProductGroupProductCountsTotal :: Double
    <*> arbitrary -- catalogsCreativeAssetsProductGroupProductCountsVideos :: Double
  
instance Arbitrary CatalogsCreativeAssetsProductGroupUpdateRequest where
  arbitrary = sized genCatalogsCreativeAssetsProductGroupUpdateRequest

genCatalogsCreativeAssetsProductGroupUpdateRequest :: Int -> Gen CatalogsCreativeAssetsProductGroupUpdateRequest
genCatalogsCreativeAssetsProductGroupUpdateRequest n =
  CatalogsCreativeAssetsProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupUpdateRequestCatalogType :: Maybe E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupUpdateRequestFilters :: Maybe CatalogsCreativeAssetsProductGroupFilters
  
instance Arbitrary CatalogsCreativeAssetsProductMetadata where
  arbitrary = sized genCatalogsCreativeAssetsProductMetadata

genCatalogsCreativeAssetsProductMetadata :: Int -> Gen CatalogsCreativeAssetsProductMetadata
genCatalogsCreativeAssetsProductMetadata n =
  CatalogsCreativeAssetsProductMetadata
    <$> arbitrary -- catalogsCreativeAssetsProductMetadataCreativeAssetsId :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductMetadataVisibility :: CreativeAssetsVisibilityType
  
instance Arbitrary CatalogsDbItem where
  arbitrary = sized genCatalogsDbItem

genCatalogsDbItem :: Int -> Gen CatalogsDbItem
genCatalogsDbItem n =
  CatalogsDbItem
    <$> arbitraryReduced n -- catalogsDbItemCreatedAt :: DateTime
    <*> arbitrary -- catalogsDbItemId :: Text
    <*> arbitraryReduced n -- catalogsDbItemUpdatedAt :: DateTime
  
instance Arbitrary CatalogsDeleteCreativeAssetsItem where
  arbitrary = sized genCatalogsDeleteCreativeAssetsItem

genCatalogsDeleteCreativeAssetsItem :: Int -> Gen CatalogsDeleteCreativeAssetsItem
genCatalogsDeleteCreativeAssetsItem n =
  CatalogsDeleteCreativeAssetsItem
    <$> arbitrary -- catalogsDeleteCreativeAssetsItemCreativeAssetsId :: Text
    <*> arbitrary -- catalogsDeleteCreativeAssetsItemOperation :: E'Operation
  
instance Arbitrary CatalogsDeleteHotelItem where
  arbitrary = sized genCatalogsDeleteHotelItem

genCatalogsDeleteHotelItem :: Int -> Gen CatalogsDeleteHotelItem
genCatalogsDeleteHotelItem n =
  CatalogsDeleteHotelItem
    <$> arbitrary -- catalogsDeleteHotelItemHotelId :: Text
    <*> arbitrary -- catalogsDeleteHotelItemOperation :: E'Operation
  
instance Arbitrary CatalogsDeleteRetailItem where
  arbitrary = sized genCatalogsDeleteRetailItem

genCatalogsDeleteRetailItem :: Int -> Gen CatalogsDeleteRetailItem
genCatalogsDeleteRetailItem n =
  CatalogsDeleteRetailItem
    <$> arbitrary -- catalogsDeleteRetailItemItemId :: Text
    <*> arbitrary -- catalogsDeleteRetailItemOperation :: E'Operation
  
instance Arbitrary CatalogsFeed where
  arbitrary = sized genCatalogsFeed

genCatalogsFeed :: Int -> Gen CatalogsFeed
genCatalogsFeed n =
  CatalogsFeed
    <$> arbitraryReduced n -- catalogsFeedCreatedAt :: DateTime
    <*> arbitrary -- catalogsFeedId :: Text
    <*> arbitraryReduced n -- catalogsFeedUpdatedAt :: DateTime
    <*> arbitrary -- catalogsFeedName :: Text
    <*> arbitraryReduced n -- catalogsFeedFormat :: CatalogsFormat
    <*> arbitraryReduced n -- catalogsFeedCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsFeedCredentials :: CatalogsFeedCredentials
    <*> arbitrary -- catalogsFeedLocation :: Text
    <*> arbitraryReduced n -- catalogsFeedPreferredProcessingSchedule :: CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsFeedStatus :: CatalogsStatus
    <*> arbitraryReduced n -- catalogsFeedDefaultCurrency :: NullableCurrency
    <*> arbitrary -- catalogsFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsFeedDefaultCountry :: Country
    <*> arbitraryReduced n -- catalogsFeedDefaultAvailability :: ProductAvailabilityType
    <*> arbitrary -- catalogsFeedCatalogId :: Text
  
instance Arbitrary CatalogsFeedCredentials where
  arbitrary = sized genCatalogsFeedCredentials

genCatalogsFeedCredentials :: Int -> Gen CatalogsFeedCredentials
genCatalogsFeedCredentials n =
  CatalogsFeedCredentials
    <$> arbitrary -- catalogsFeedCredentialsPassword :: Text
    <*> arbitrary -- catalogsFeedCredentialsUsername :: Text
  
instance Arbitrary CatalogsFeedIngestion where
  arbitrary = sized genCatalogsFeedIngestion

genCatalogsFeedIngestion :: Int -> Gen CatalogsFeedIngestion
genCatalogsFeedIngestion n =
  CatalogsFeedIngestion
    <$> arbitrary -- catalogsFeedIngestionId :: Text
    <*> arbitrary -- catalogsFeedIngestionFeedId :: Text
    <*> arbitraryReduced n -- catalogsFeedIngestionCreatedAt :: DateTime
    <*> arbitraryReduced n -- catalogsFeedIngestionStatus :: CatalogsFeedProcessingStatus
  
instance Arbitrary CatalogsFeedIngestionDetails where
  arbitrary = sized genCatalogsFeedIngestionDetails

genCatalogsFeedIngestionDetails :: Int -> Gen CatalogsFeedIngestionDetails
genCatalogsFeedIngestionDetails n =
  CatalogsFeedIngestionDetails
    <$> arbitraryReduced n -- catalogsFeedIngestionDetailsErrors :: CatalogsFeedIngestionErrors
    <*> arbitraryReduced n -- catalogsFeedIngestionDetailsInfo :: CatalogsFeedIngestionInfo
    <*> arbitraryReduced n -- catalogsFeedIngestionDetailsWarnings :: CatalogsFeedIngestionWarnings
  
instance Arbitrary CatalogsFeedIngestionErrors where
  arbitrary = sized genCatalogsFeedIngestionErrors

genCatalogsFeedIngestionErrors :: Int -> Gen CatalogsFeedIngestionErrors
genCatalogsFeedIngestionErrors n =
  CatalogsFeedIngestionErrors
    <$> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsLineLevelInternalError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsLargeProductCountDecrease :: Maybe E'LargeProductCountDecrease
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsAccountFlagged :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageLevelInternalError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageFileNotAccessible :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageMalformedUrl :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageFileNotFound :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageInvalidFile :: Maybe Int
  
instance Arbitrary CatalogsFeedIngestionInfo where
  arbitrary = sized genCatalogsFeedIngestionInfo

genCatalogsFeedIngestionInfo :: Int -> Gen CatalogsFeedIngestionInfo
genCatalogsFeedIngestionInfo n =
  CatalogsFeedIngestionInfo
    <$> arbitraryReducedMaybe n -- catalogsFeedIngestionInfoInStock :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionInfoOutOfStock :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionInfoPreorder :: Maybe Int
  
instance Arbitrary CatalogsFeedIngestionWarnings where
  arbitrary = sized genCatalogsFeedIngestionWarnings

genCatalogsFeedIngestionWarnings :: Int -> Gen CatalogsFeedIngestionWarnings
genCatalogsFeedIngestionWarnings n =
  CatalogsFeedIngestionWarnings
    <$> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdditionalImageLevelInternalError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdditionalImageFileNotAccessible :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdditionalImageMalformedUrl :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdditionalImageFileNotFound :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdditionalImageInvalidFile :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsHotelPriceHeaderIsPresent :: Maybe Int
  
instance Arbitrary CatalogsFeedProcessingResult where
  arbitrary = sized genCatalogsFeedProcessingResult

genCatalogsFeedProcessingResult :: Int -> Gen CatalogsFeedProcessingResult
genCatalogsFeedProcessingResult n =
  CatalogsFeedProcessingResult
    <$> arbitraryReduced n -- catalogsFeedProcessingResultCreatedAt :: DateTime
    <*> arbitrary -- catalogsFeedProcessingResultId :: Text
    <*> arbitraryReduced n -- catalogsFeedProcessingResultUpdatedAt :: DateTime
    <*> arbitraryReduced n -- catalogsFeedProcessingResultIngestionDetails :: CatalogsFeedIngestionDetails
    <*> arbitraryReduced n -- catalogsFeedProcessingResultStatus :: CatalogsFeedProcessingStatus
    <*> arbitraryReduced n -- catalogsFeedProcessingResultProductCounts :: CatalogsFeedProductCounts
    <*> arbitraryReduced n -- catalogsFeedProcessingResultValidationDetails :: CatalogsFeedValidationDetails
  
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
    <*> arbitraryReducedMaybe n -- catalogsFeedProductCountsIngested :: Maybe Int
  
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
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsDuplicateProducts :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsImageLinkInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsItemidMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsTitleMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsDescriptionMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsProductLinkMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsImageLinkMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsAvailabilityInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsProductPriceInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsLinkFormatInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsParseLineError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsAdwordsFormatInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsInternalServiceError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsNoVerifiedDomain :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsAdultInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsImageLinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsInvalidDomain :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsFeedLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsLinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsMalformedXml :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsPriceMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsFeedTooSmall :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsMaxItemsPerItemGroupExceeded :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsItemMainImageDownloadFailure :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsPinjoinContentUnsafe :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsBlocklistedImageSignature :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsListPriceInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsPriceCannotBeDetermined :: Maybe Int
  
instance Arbitrary CatalogsFeedValidationWarnings where
  arbitrary = sized genCatalogsFeedValidationWarnings

genCatalogsFeedValidationWarnings :: Int -> Gen CatalogsFeedValidationWarnings
genCatalogsFeedValidationWarnings n =
  CatalogsFeedValidationWarnings
    <$> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdLinkFormatWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdLinkSameAsLink :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsTitleLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsDescriptionLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsGenderInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAgeGroupInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSizeTypeInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSizeSystemInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsLinkFormatWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSalesPriceInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsProductCategoryDepthWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdwordsFormatWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdwordsSameAsLink :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsDuplicateHeaders :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsFetchSameSignature :: Maybe E'LargeProductCountDecrease
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdditionalImageLinkLengthTooLong :: Maybe Int
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
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsUtmSourceAutoCorrected :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsCountryDoesNotMapToCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsMinAdPriceInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsGtinInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsInconsistentCurrencyValues :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSalesPriceTooLow :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsShippingWidthInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsShippingHeightInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSalesPriceTooHigh :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsMpnInvalid :: Maybe Int
  
instance Arbitrary CatalogsFeedsCreateRequest where
  arbitrary = sized genCatalogsFeedsCreateRequest

genCatalogsFeedsCreateRequest :: Int -> Gen CatalogsFeedsCreateRequest
genCatalogsFeedsCreateRequest n =
  CatalogsFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitrary -- catalogsFeedsCreateRequestName :: Text
    <*> arbitraryReduced n -- catalogsFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultLocale :: Maybe CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitrary -- catalogsFeedsCreateRequestLocation :: Text
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsFeedsCreateRequestDefaultLocale where
  arbitrary = sized genCatalogsFeedsCreateRequestDefaultLocale

genCatalogsFeedsCreateRequestDefaultLocale :: Int -> Gen CatalogsFeedsCreateRequestDefaultLocale
genCatalogsFeedsCreateRequestDefaultLocale n =
  
  pure CatalogsFeedsCreateRequestDefaultLocale
   
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
  
instance Arbitrary CatalogsHotelAddress where
  arbitrary = sized genCatalogsHotelAddress

genCatalogsHotelAddress :: Int -> Gen CatalogsHotelAddress
genCatalogsHotelAddress n =
  CatalogsHotelAddress
    <$> arbitraryReducedMaybe n -- catalogsHotelAddressAddr1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAddressCity :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAddressRegion :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAddressCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAddressPostalCode :: Maybe Text
  
instance Arbitrary CatalogsHotelAttributes where
  arbitrary = sized genCatalogsHotelAttributes

genCatalogsHotelAttributes :: Int -> Gen CatalogsHotelAttributes
genCatalogsHotelAttributes n =
  CatalogsHotelAttributes
    <$> arbitraryReducedMaybe n -- catalogsHotelAttributesName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesLatitude :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesLongitude :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesNeighborhood :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesAddress :: Maybe CatalogsHotelAddress
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCustomLabel0 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCustomLabel1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCustomLabel2 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCustomLabel3 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCustomLabel4 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesBasePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesSalePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesGuestRatings :: Maybe CatalogsHotelGuestRatings
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesMainImage :: Maybe CatalogsHotelAttributesAllOfMainImage
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesAdditionalImageLink :: Maybe [Text]
  
instance Arbitrary CatalogsHotelAttributesAllOfMainImage where
  arbitrary = sized genCatalogsHotelAttributesAllOfMainImage

genCatalogsHotelAttributesAllOfMainImage :: Int -> Gen CatalogsHotelAttributesAllOfMainImage
genCatalogsHotelAttributesAllOfMainImage n =
  CatalogsHotelAttributesAllOfMainImage
    <$> arbitraryReducedMaybe n -- catalogsHotelAttributesAllOfMainImageLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesAllOfMainImageTag :: Maybe [Text]
  
instance Arbitrary CatalogsHotelBatchItem where
  arbitrary = sized genCatalogsHotelBatchItem

genCatalogsHotelBatchItem :: Int -> Gen CatalogsHotelBatchItem
genCatalogsHotelBatchItem n =
  CatalogsHotelBatchItem
    <$> arbitrary -- catalogsHotelBatchItemHotelId :: Text
    <*> arbitrary -- catalogsHotelBatchItemOperation :: E'Operation
    <*> arbitraryReduced n -- catalogsHotelBatchItemAttributes :: CatalogsUpdatableHotelAttributes
  
instance Arbitrary CatalogsHotelBatchRequest where
  arbitrary = sized genCatalogsHotelBatchRequest

genCatalogsHotelBatchRequest :: Int -> Gen CatalogsHotelBatchRequest
genCatalogsHotelBatchRequest n =
  CatalogsHotelBatchRequest
    <$> arbitrary -- catalogsHotelBatchRequestCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsHotelBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsHotelBatchRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- catalogsHotelBatchRequestItems :: [CatalogsHotelBatchItem]
    <*> arbitraryReducedMaybe n -- catalogsHotelBatchRequestCatalogId :: Maybe Text
  
instance Arbitrary CatalogsHotelFeed where
  arbitrary = sized genCatalogsHotelFeed

genCatalogsHotelFeed :: Int -> Gen CatalogsHotelFeed
genCatalogsHotelFeed n =
  CatalogsHotelFeed
    <$> arbitraryReduced n -- catalogsHotelFeedCreatedAt :: DateTime
    <*> arbitrary -- catalogsHotelFeedId :: Text
    <*> arbitraryReduced n -- catalogsHotelFeedUpdatedAt :: DateTime
    <*> arbitrary -- catalogsHotelFeedName :: Text
    <*> arbitraryReduced n -- catalogsHotelFeedFormat :: CatalogsFormat
    <*> arbitraryReduced n -- catalogsHotelFeedCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsHotelFeedCredentials :: CatalogsFeedCredentials
    <*> arbitrary -- catalogsHotelFeedLocation :: Text
    <*> arbitraryReduced n -- catalogsHotelFeedPreferredProcessingSchedule :: CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsHotelFeedStatus :: CatalogsStatus
    <*> arbitraryReduced n -- catalogsHotelFeedDefaultCurrency :: NullableCurrency
    <*> arbitrary -- catalogsHotelFeedDefaultLocale :: Text
    <*> arbitrary -- catalogsHotelFeedCatalogId :: Text
  
instance Arbitrary CatalogsHotelFeedsCreateRequest where
  arbitrary = sized genCatalogsHotelFeedsCreateRequest

genCatalogsHotelFeedsCreateRequest :: Int -> Gen CatalogsHotelFeedsCreateRequest
genCatalogsHotelFeedsCreateRequest n =
  CatalogsHotelFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitrary -- catalogsHotelFeedsCreateRequestName :: Text
    <*> arbitraryReduced n -- catalogsHotelFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitraryReduced n -- catalogsHotelFeedsCreateRequestDefaultLocale :: CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitrary -- catalogsHotelFeedsCreateRequestLocation :: Text
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsHotelFeedsCreateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsHotelFeedsUpdateRequest where
  arbitrary = sized genCatalogsHotelFeedsUpdateRequest

genCatalogsHotelFeedsUpdateRequest :: Int -> Gen CatalogsHotelFeedsUpdateRequest
genCatalogsHotelFeedsUpdateRequest n =
  CatalogsHotelFeedsUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestStatus :: Maybe CatalogsStatus
    <*> arbitraryReduced n -- catalogsHotelFeedsUpdateRequestCatalogType :: CatalogsType
  
instance Arbitrary CatalogsHotelGuestRatings where
  arbitrary = sized genCatalogsHotelGuestRatings

genCatalogsHotelGuestRatings :: Int -> Gen CatalogsHotelGuestRatings
genCatalogsHotelGuestRatings n =
  CatalogsHotelGuestRatings
    <$> arbitraryReducedMaybe n -- catalogsHotelGuestRatingsScore :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsHotelGuestRatingsNumberOfReviewers :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsHotelGuestRatingsMaxScore :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsHotelGuestRatingsRatingSystem :: Maybe Text
  
instance Arbitrary CatalogsHotelItemErrorResponse where
  arbitrary = sized genCatalogsHotelItemErrorResponse

genCatalogsHotelItemErrorResponse :: Int -> Gen CatalogsHotelItemErrorResponse
genCatalogsHotelItemErrorResponse n =
  CatalogsHotelItemErrorResponse
    <$> arbitraryReduced n -- catalogsHotelItemErrorResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsHotelItemErrorResponseHotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelItemErrorResponseErrors :: Maybe [ItemValidationEvent]
  
instance Arbitrary CatalogsHotelItemResponse where
  arbitrary = sized genCatalogsHotelItemResponse

genCatalogsHotelItemResponse :: Int -> Gen CatalogsHotelItemResponse
genCatalogsHotelItemResponse n =
  CatalogsHotelItemResponse
    <$> arbitraryReduced n -- catalogsHotelItemResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsHotelItemResponseHotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelItemResponsePins :: Maybe [Pin]
    <*> arbitraryReducedMaybe n -- catalogsHotelItemResponseAttributes :: Maybe CatalogsHotelAttributes
  
instance Arbitrary CatalogsHotelItemsBatch where
  arbitrary = sized genCatalogsHotelItemsBatch

genCatalogsHotelItemsBatch :: Int -> Gen CatalogsHotelItemsBatch
genCatalogsHotelItemsBatch n =
  CatalogsHotelItemsBatch
    <$> arbitraryReducedMaybe n -- catalogsHotelItemsBatchBatchId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchCreatedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchStatus :: Maybe BatchOperationStatus
    <*> arbitraryReduced n -- catalogsHotelItemsBatchCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchItems :: Maybe [HotelProcessingRecord]
  
instance Arbitrary CatalogsHotelItemsFilter where
  arbitrary = sized genCatalogsHotelItemsFilter

genCatalogsHotelItemsFilter :: Int -> Gen CatalogsHotelItemsFilter
genCatalogsHotelItemsFilter n =
  CatalogsHotelItemsFilter
    <$> arbitrary -- catalogsHotelItemsFilterCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsHotelItemsFilterHotelIds :: [Text]
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsFilterCatalogId :: Maybe Text
  
instance Arbitrary CatalogsHotelItemsPostFilter where
  arbitrary = sized genCatalogsHotelItemsPostFilter

genCatalogsHotelItemsPostFilter :: Int -> Gen CatalogsHotelItemsPostFilter
genCatalogsHotelItemsPostFilter n =
  CatalogsHotelItemsPostFilter
    <$> arbitrary -- catalogsHotelItemsPostFilterCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsHotelItemsPostFilterHotelIds :: [Text]
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsPostFilterCatalogId :: Maybe Text
  
instance Arbitrary CatalogsHotelListProductsByCatalogBasedFilterRequest where
  arbitrary = sized genCatalogsHotelListProductsByCatalogBasedFilterRequest

genCatalogsHotelListProductsByCatalogBasedFilterRequest :: Int -> Gen CatalogsHotelListProductsByCatalogBasedFilterRequest
genCatalogsHotelListProductsByCatalogBasedFilterRequest n =
  CatalogsHotelListProductsByCatalogBasedFilterRequest
    <$> arbitrary -- catalogsHotelListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsHotelListProductsByCatalogBasedFilterRequestCatalogId :: Text
    <*> arbitraryReduced n -- catalogsHotelListProductsByCatalogBasedFilterRequestFilters :: CatalogsHotelProductGroupFilters
  
instance Arbitrary CatalogsHotelProduct where
  arbitrary = sized genCatalogsHotelProduct

genCatalogsHotelProduct :: Int -> Gen CatalogsHotelProduct
genCatalogsHotelProduct n =
  CatalogsHotelProduct
    <$> arbitrary -- catalogsHotelProductCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsHotelProductMetadata :: CatalogsHotelProductMetadata
    <*> arbitraryReduced n -- catalogsHotelProductPin :: Pin
  
instance Arbitrary CatalogsHotelProductGroup where
  arbitrary = sized genCatalogsHotelProductGroup

genCatalogsHotelProductGroup :: Int -> Gen CatalogsHotelProductGroup
genCatalogsHotelProductGroup n =
  CatalogsHotelProductGroup
    <$> arbitrary -- catalogsHotelProductGroupCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsHotelProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilters :: CatalogsHotelProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdatedAt :: Maybe Int
    <*> arbitrary -- catalogsHotelProductGroupCatalogId :: Text
  
instance Arbitrary CatalogsHotelProductGroupCreateRequest where
  arbitrary = sized genCatalogsHotelProductGroupCreateRequest

genCatalogsHotelProductGroupCreateRequest :: Int -> Gen CatalogsHotelProductGroupCreateRequest
genCatalogsHotelProductGroupCreateRequest n =
  CatalogsHotelProductGroupCreateRequest
    <$> arbitrary -- catalogsHotelProductGroupCreateRequestCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsHotelProductGroupCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsHotelProductGroupCreateRequestFilters :: CatalogsHotelProductGroupFilters
    <*> arbitrary -- catalogsHotelProductGroupCreateRequestCatalogId :: Text
  
instance Arbitrary CatalogsHotelProductGroupFilterKeys where
  arbitrary = sized genCatalogsHotelProductGroupFilterKeys

genCatalogsHotelProductGroupFilterKeys :: Int -> Gen CatalogsHotelProductGroupFilterKeys
genCatalogsHotelProductGroupFilterKeys n =
  CatalogsHotelProductGroupFilterKeys
    <$> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysPrice :: CatalogsProductGroupPricingCurrencyCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysHotelId :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysBrand :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCustomLabel0 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCustomLabel1 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCustomLabel2 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCustomLabel3 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCustomLabel4 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCountry :: CatalogsProductGroupMultipleCountriesCriteria
  
instance Arbitrary CatalogsHotelProductGroupFilters where
  arbitrary = sized genCatalogsHotelProductGroupFilters

genCatalogsHotelProductGroupFilters :: Int -> Gen CatalogsHotelProductGroupFilters
genCatalogsHotelProductGroupFilters n =
  CatalogsHotelProductGroupFilters
    <$> arbitraryReduced n -- catalogsHotelProductGroupFiltersAnyOf :: [CatalogsHotelProductGroupFilterKeys]
    <*> arbitraryReduced n -- catalogsHotelProductGroupFiltersAllOf :: [CatalogsHotelProductGroupFilterKeys]
  
instance Arbitrary CatalogsHotelProductGroupFiltersAllOf where
  arbitrary = sized genCatalogsHotelProductGroupFiltersAllOf

genCatalogsHotelProductGroupFiltersAllOf :: Int -> Gen CatalogsHotelProductGroupFiltersAllOf
genCatalogsHotelProductGroupFiltersAllOf n =
  CatalogsHotelProductGroupFiltersAllOf
    <$> arbitraryReduced n -- catalogsHotelProductGroupFiltersAllOfAllOf :: [CatalogsHotelProductGroupFilterKeys]
  
instance Arbitrary CatalogsHotelProductGroupFiltersAnyOf where
  arbitrary = sized genCatalogsHotelProductGroupFiltersAnyOf

genCatalogsHotelProductGroupFiltersAnyOf :: Int -> Gen CatalogsHotelProductGroupFiltersAnyOf
genCatalogsHotelProductGroupFiltersAnyOf n =
  CatalogsHotelProductGroupFiltersAnyOf
    <$> arbitraryReduced n -- catalogsHotelProductGroupFiltersAnyOfAnyOf :: [CatalogsHotelProductGroupFilterKeys]
  
instance Arbitrary CatalogsHotelProductGroupProductCounts where
  arbitrary = sized genCatalogsHotelProductGroupProductCounts

genCatalogsHotelProductGroupProductCounts :: Int -> Gen CatalogsHotelProductGroupProductCounts
genCatalogsHotelProductGroupProductCounts n =
  CatalogsHotelProductGroupProductCounts
    <$> arbitrary -- catalogsHotelProductGroupProductCountsCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsHotelProductGroupProductCountsTotal :: Double
  
instance Arbitrary CatalogsHotelProductGroupUpdateRequest where
  arbitrary = sized genCatalogsHotelProductGroupUpdateRequest

genCatalogsHotelProductGroupUpdateRequest :: Int -> Gen CatalogsHotelProductGroupUpdateRequest
genCatalogsHotelProductGroupUpdateRequest n =
  CatalogsHotelProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestCatalogType :: Maybe E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestFilters :: Maybe CatalogsHotelProductGroupFilters
  
instance Arbitrary CatalogsHotelProductMetadata where
  arbitrary = sized genCatalogsHotelProductMetadata

genCatalogsHotelProductMetadata :: Int -> Gen CatalogsHotelProductMetadata
genCatalogsHotelProductMetadata n =
  CatalogsHotelProductMetadata
    <$> arbitrary -- catalogsHotelProductMetadataHotelId :: Text
  
instance Arbitrary CatalogsHotelReportParameters where
  arbitrary = sized genCatalogsHotelReportParameters

genCatalogsHotelReportParameters :: Int -> Gen CatalogsHotelReportParameters
genCatalogsHotelReportParameters n =
  CatalogsHotelReportParameters
    <$> arbitrary -- catalogsHotelReportParametersCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsHotelReportParametersReport :: CatalogsHotelReportParametersReport
  
instance Arbitrary CatalogsHotelReportParametersReport where
  arbitrary = sized genCatalogsHotelReportParametersReport

genCatalogsHotelReportParametersReport :: Int -> Gen CatalogsHotelReportParametersReport
genCatalogsHotelReportParametersReport n =
  CatalogsHotelReportParametersReport
    <$> arbitraryReducedMaybe n -- catalogsHotelReportParametersReportReportType :: Maybe E'ReportType
    <*> arbitrary -- catalogsHotelReportParametersReportFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsHotelReportParametersReportProcessingResultId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelReportParametersReportCatalogId :: Maybe Text
  
instance Arbitrary CatalogsItemValidationDetails where
  arbitrary = sized genCatalogsItemValidationDetails

genCatalogsItemValidationDetails :: Int -> Gen CatalogsItemValidationDetails
genCatalogsItemValidationDetails n =
  CatalogsItemValidationDetails
    <$> arbitraryReduced n -- catalogsItemValidationDetailsAttributeName :: NullableCatalogsItemFieldType
    <*> arbitrary -- catalogsItemValidationDetailsProvidedValue :: Text
  
instance Arbitrary CatalogsItemValidationErrors where
  arbitrary = sized genCatalogsItemValidationErrors

genCatalogsItemValidationErrors :: Int -> Gen CatalogsItemValidationErrors
genCatalogsItemValidationErrors n =
  CatalogsItemValidationErrors
    <$> arbitraryReducedMaybe n -- catalogsItemValidationErrorsAdultInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsAdwordsFormatInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsAvailabilityInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsBlocklistedImageSignature :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsDescriptionMissing :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsDuplicateProducts :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsImageLinkInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsImageLinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsImageLinkMissing :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsInvalidDomain :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsItemidMissing :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsItemMainImageDownloadFailure :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsLinkFormatInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsLinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsListPriceInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsMaxItemsPerItemGroupExceeded :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsParseLineError :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsPinjoinContentUnsafe :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsPriceCannotBeDetermined :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsPriceMissing :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsProductLinkMissing :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsProductPriceInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsTitleMissing :: Maybe CatalogsItemValidationDetails
  
instance Arbitrary CatalogsItemValidationIssues where
  arbitrary = sized genCatalogsItemValidationIssues

genCatalogsItemValidationIssues :: Int -> Gen CatalogsItemValidationIssues
genCatalogsItemValidationIssues n =
  CatalogsItemValidationIssues
    <$> arbitrary -- catalogsItemValidationIssuesItemNumber :: Int
    <*> arbitrary -- catalogsItemValidationIssuesItemId :: Text
    <*> arbitraryReduced n -- catalogsItemValidationIssuesErrors :: CatalogsItemValidationErrors
    <*> arbitraryReduced n -- catalogsItemValidationIssuesWarnings :: CatalogsItemValidationWarnings
  
instance Arbitrary CatalogsItemValidationWarnings where
  arbitrary = sized genCatalogsItemValidationWarnings

genCatalogsItemValidationWarnings :: Int -> Gen CatalogsItemValidationWarnings
genCatalogsItemValidationWarnings n =
  CatalogsItemValidationWarnings
    <$> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdLinkFormatWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdLinkSameAsLink :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdditionalImageLinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdditionalImageLinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdwordsFormatWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdwordsSameAsLink :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAgeGroupInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSizeSystemInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAndroidDeepLinkInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAvailabilityDateInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsCountryDoesNotMapToCurrency :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsCustomLabelLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsDescriptionLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsExpirationDateInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsGenderInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsGtinInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsImageLinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsIosDeepLinkInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsIsBundleInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsItemAdditionalImageDownloadFailure :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsLinkFormatWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsMinAdPriceInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsMpnInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsMultipackInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsOptionalConditionInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsOptionalConditionMissing :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsOptionalProductCategoryInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsOptionalProductCategoryMissing :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsProductCategoryDepthWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsProductTypeLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSalesPriceInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSalesPriceTooLow :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSalesPriceTooHigh :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSaleDateInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsShippingInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsShippingHeightInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsShippingWeightInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsShippingWidthInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSizeTypeInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsTaxInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsTitleLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsTooManyAdditionalImageLinks :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsUtmSourceAutoCorrected :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsWeightUnitInvalid :: Maybe CatalogsItemValidationDetails
  
instance Arbitrary CatalogsItems where
  arbitrary = sized genCatalogsItems

genCatalogsItems :: Int -> Gen CatalogsItems
genCatalogsItems n =
  CatalogsItems
    <$> arbitraryReducedMaybe n -- catalogsItemsItems :: Maybe [ItemResponse]
  
instance Arbitrary CatalogsItemsBatch where
  arbitrary = sized genCatalogsItemsBatch

genCatalogsItemsBatch :: Int -> Gen CatalogsItemsBatch
genCatalogsItemsBatch n =
  CatalogsItemsBatch
    <$> arbitraryReduced n -- catalogsItemsBatchCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchBatchId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchCreatedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchStatus :: Maybe BatchOperationStatus
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchItems :: Maybe [CreativeAssetsProcessingRecord]
  
instance Arbitrary CatalogsItemsBatchRequest where
  arbitrary = sized genCatalogsItemsBatchRequest

genCatalogsItemsBatchRequest :: Int -> Gen CatalogsItemsBatchRequest
genCatalogsItemsBatchRequest n =
  CatalogsItemsBatchRequest
    <$> arbitraryReduced n -- catalogsItemsBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsBatchRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- catalogsItemsBatchRequestOperation :: BatchOperation
    <*> arbitraryReduced n -- catalogsItemsBatchRequestItems :: [ItemDeleteBatchRecord]
  
instance Arbitrary CatalogsItemsCreateBatchRequest where
  arbitrary = sized genCatalogsItemsCreateBatchRequest

genCatalogsItemsCreateBatchRequest :: Int -> Gen CatalogsItemsCreateBatchRequest
genCatalogsItemsCreateBatchRequest n =
  CatalogsItemsCreateBatchRequest
    <$> arbitraryReduced n -- catalogsItemsCreateBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsCreateBatchRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- catalogsItemsCreateBatchRequestOperation :: BatchOperation
    <*> arbitraryReduced n -- catalogsItemsCreateBatchRequestItems :: [ItemCreateBatchRecord]
  
instance Arbitrary CatalogsItemsDeleteBatchRequest where
  arbitrary = sized genCatalogsItemsDeleteBatchRequest

genCatalogsItemsDeleteBatchRequest :: Int -> Gen CatalogsItemsDeleteBatchRequest
genCatalogsItemsDeleteBatchRequest n =
  CatalogsItemsDeleteBatchRequest
    <$> arbitraryReduced n -- catalogsItemsDeleteBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsDeleteBatchRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- catalogsItemsDeleteBatchRequestOperation :: BatchOperation
    <*> arbitraryReduced n -- catalogsItemsDeleteBatchRequestItems :: [ItemDeleteBatchRecord]
  
instance Arbitrary CatalogsItemsDeleteDiscontinuedBatchRequest where
  arbitrary = sized genCatalogsItemsDeleteDiscontinuedBatchRequest

genCatalogsItemsDeleteDiscontinuedBatchRequest :: Int -> Gen CatalogsItemsDeleteDiscontinuedBatchRequest
genCatalogsItemsDeleteDiscontinuedBatchRequest n =
  CatalogsItemsDeleteDiscontinuedBatchRequest
    <$> arbitraryReduced n -- catalogsItemsDeleteDiscontinuedBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsDeleteDiscontinuedBatchRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- catalogsItemsDeleteDiscontinuedBatchRequestOperation :: BatchOperation
    <*> arbitraryReduced n -- catalogsItemsDeleteDiscontinuedBatchRequestItems :: [ItemDeleteDiscontinuedBatchRecord]
  
instance Arbitrary CatalogsItemsFilters where
  arbitrary = sized genCatalogsItemsFilters

genCatalogsItemsFilters :: Int -> Gen CatalogsItemsFilters
genCatalogsItemsFilters n =
  CatalogsItemsFilters
    <$> arbitraryReduced n -- catalogsItemsFiltersCatalogType :: CatalogsType
    <*> arbitrary -- catalogsItemsFiltersItemIds :: [Text]
    <*> arbitraryReducedMaybe n -- catalogsItemsFiltersCatalogId :: Maybe Text
    <*> arbitrary -- catalogsItemsFiltersHotelIds :: [Text]
    <*> arbitrary -- catalogsItemsFiltersCreativeAssetsIds :: [Text]
  
instance Arbitrary CatalogsItemsPostFilters where
  arbitrary = sized genCatalogsItemsPostFilters

genCatalogsItemsPostFilters :: Int -> Gen CatalogsItemsPostFilters
genCatalogsItemsPostFilters n =
  CatalogsItemsPostFilters
    <$> arbitraryReduced n -- catalogsItemsPostFiltersCatalogType :: CatalogsType
    <*> arbitrary -- catalogsItemsPostFiltersItemIds :: [Text]
    <*> arbitraryReducedMaybe n -- catalogsItemsPostFiltersCatalogId :: Maybe Text
    <*> arbitrary -- catalogsItemsPostFiltersHotelIds :: [Text]
    <*> arbitrary -- catalogsItemsPostFiltersCreativeAssetsIds :: [Text]
  
instance Arbitrary CatalogsItemsRequest where
  arbitrary = sized genCatalogsItemsRequest

genCatalogsItemsRequest :: Int -> Gen CatalogsItemsRequest
genCatalogsItemsRequest n =
  CatalogsItemsRequest
    <$> arbitraryReduced n -- catalogsItemsRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- catalogsItemsRequestFilters :: CatalogsItemsPostFilters
  
instance Arbitrary CatalogsItemsRequestLanguage where
  arbitrary = sized genCatalogsItemsRequestLanguage

genCatalogsItemsRequestLanguage :: Int -> Gen CatalogsItemsRequestLanguage
genCatalogsItemsRequestLanguage n =
  
  pure CatalogsItemsRequestLanguage
   
instance Arbitrary CatalogsItemsUpdateBatchRequest where
  arbitrary = sized genCatalogsItemsUpdateBatchRequest

genCatalogsItemsUpdateBatchRequest :: Int -> Gen CatalogsItemsUpdateBatchRequest
genCatalogsItemsUpdateBatchRequest n =
  CatalogsItemsUpdateBatchRequest
    <$> arbitraryReduced n -- catalogsItemsUpdateBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsUpdateBatchRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- catalogsItemsUpdateBatchRequestOperation :: BatchOperation
    <*> arbitraryReduced n -- catalogsItemsUpdateBatchRequestItems :: [ItemUpdateBatchRecord]
  
instance Arbitrary CatalogsItemsUpsertBatchRequest where
  arbitrary = sized genCatalogsItemsUpsertBatchRequest

genCatalogsItemsUpsertBatchRequest :: Int -> Gen CatalogsItemsUpsertBatchRequest
genCatalogsItemsUpsertBatchRequest n =
  CatalogsItemsUpsertBatchRequest
    <$> arbitraryReduced n -- catalogsItemsUpsertBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsUpsertBatchRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- catalogsItemsUpsertBatchRequestOperation :: BatchOperation
    <*> arbitraryReduced n -- catalogsItemsUpsertBatchRequestItems :: [ItemUpsertBatchRecord]
  
instance Arbitrary CatalogsList200Response where
  arbitrary = sized genCatalogsList200Response

genCatalogsList200Response :: Int -> Gen CatalogsList200Response
genCatalogsList200Response n =
  CatalogsList200Response
    <$> arbitraryReduced n -- catalogsList200ResponseItems :: [Catalog]
    <*> arbitraryReducedMaybe n -- catalogsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary CatalogsListProductsByFeedBasedFilter where
  arbitrary = sized genCatalogsListProductsByFeedBasedFilter

genCatalogsListProductsByFeedBasedFilter :: Int -> Gen CatalogsListProductsByFeedBasedFilter
genCatalogsListProductsByFeedBasedFilter n =
  CatalogsListProductsByFeedBasedFilter
    <$> arbitrary -- catalogsListProductsByFeedBasedFilterFeedId :: Text
    <*> arbitraryReduced n -- catalogsListProductsByFeedBasedFilterFilters :: CatalogsProductGroupFilters
  
instance Arbitrary CatalogsListProductsByFilterRequest where
  arbitrary = sized genCatalogsListProductsByFilterRequest

genCatalogsListProductsByFilterRequest :: Int -> Gen CatalogsListProductsByFilterRequest
genCatalogsListProductsByFilterRequest n =
  CatalogsListProductsByFilterRequest
    <$> arbitrary -- catalogsListProductsByFilterRequestFeedId :: Text
    <*> arbitraryReduced n -- catalogsListProductsByFilterRequestFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitrary -- catalogsListProductsByFilterRequestCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsListProductsByFilterRequestCatalogId :: Text
    <*> arbitraryReduced n -- catalogsListProductsByFilterRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsListProductsByFilterRequestLocale :: CatalogsLocale
  
instance Arbitrary CatalogsProduct where
  arbitrary = sized genCatalogsProduct

genCatalogsProduct :: Int -> Gen CatalogsProduct
genCatalogsProduct n =
  CatalogsProduct
    <$> arbitraryReduced n -- catalogsProductCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsProductMetadata :: CatalogsCreativeAssetsProductMetadata
    <*> arbitraryReduced n -- catalogsProductPin :: Pin
  
instance Arbitrary CatalogsProductGroupCreateRequest where
  arbitrary = sized genCatalogsProductGroupCreateRequest

genCatalogsProductGroupCreateRequest :: Int -> Gen CatalogsProductGroupCreateRequest
genCatalogsProductGroupCreateRequest n =
  CatalogsProductGroupCreateRequest
    <$> arbitrary -- catalogsProductGroupCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupCreateRequestIsFeatured :: Maybe Bool
    <*> arbitraryReduced n -- catalogsProductGroupCreateRequestFilters :: CatalogsProductGroupFiltersRequest
    <*> arbitrary -- catalogsProductGroupCreateRequestFeedId :: Text
  
instance Arbitrary CatalogsProductGroupCurrencyCriteria where
  arbitrary = sized genCatalogsProductGroupCurrencyCriteria

genCatalogsProductGroupCurrencyCriteria :: Int -> Gen CatalogsProductGroupCurrencyCriteria
genCatalogsProductGroupCurrencyCriteria n =
  CatalogsProductGroupCurrencyCriteria
    <$> arbitraryReduced n -- catalogsProductGroupCurrencyCriteriaValues :: NonNullableCatalogsCurrency
    <*> arbitraryReducedMaybe n -- catalogsProductGroupCurrencyCriteriaNegated :: Maybe Bool
  
instance Arbitrary CatalogsProductGroupFilterKeys where
  arbitrary = sized genCatalogsProductGroupFilterKeys

genCatalogsProductGroupFilterKeys :: Int -> Gen CatalogsProductGroupFilterKeys
genCatalogsProductGroupFilterKeys n =
  CatalogsProductGroupFilterKeys
    <$> arbitraryReduced n -- catalogsProductGroupFilterKeysMinPrice :: CatalogsProductGroupPricingCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysMaxPrice :: CatalogsProductGroupPricingCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCurrency :: CatalogsProductGroupCurrencyCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysItemId :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysAvailability :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysBrand :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCondition :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel0 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel1 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel2 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel3 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel4 :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysItemGroupId :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysGender :: CatalogsProductGroupMultipleGenderCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysMediaType :: CatalogsProductGroupMultipleMediaTypesCriteria
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
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysProductGroup :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary CatalogsProductGroupFilters where
  arbitrary = sized genCatalogsProductGroupFilters

genCatalogsProductGroupFilters :: Int -> Gen CatalogsProductGroupFilters
genCatalogsProductGroupFilters n =
  CatalogsProductGroupFilters
    <$> arbitraryReduced n -- catalogsProductGroupFiltersAnyOf :: [CatalogsProductGroupFilterKeys]
    <*> arbitraryReduced n -- catalogsProductGroupFiltersAllOf :: [CatalogsProductGroupFilterKeys]
  
instance Arbitrary CatalogsProductGroupFiltersAllOf where
  arbitrary = sized genCatalogsProductGroupFiltersAllOf

genCatalogsProductGroupFiltersAllOf :: Int -> Gen CatalogsProductGroupFiltersAllOf
genCatalogsProductGroupFiltersAllOf n =
  CatalogsProductGroupFiltersAllOf
    <$> arbitraryReduced n -- catalogsProductGroupFiltersAllOfAllOf :: [CatalogsProductGroupFilterKeys]
  
instance Arbitrary CatalogsProductGroupFiltersAnyOf where
  arbitrary = sized genCatalogsProductGroupFiltersAnyOf

genCatalogsProductGroupFiltersAnyOf :: Int -> Gen CatalogsProductGroupFiltersAnyOf
genCatalogsProductGroupFiltersAnyOf n =
  CatalogsProductGroupFiltersAnyOf
    <$> arbitraryReduced n -- catalogsProductGroupFiltersAnyOfAnyOf :: [CatalogsProductGroupFilterKeys]
  
instance Arbitrary CatalogsProductGroupFiltersRequest where
  arbitrary = sized genCatalogsProductGroupFiltersRequest

genCatalogsProductGroupFiltersRequest :: Int -> Gen CatalogsProductGroupFiltersRequest
genCatalogsProductGroupFiltersRequest n =
  CatalogsProductGroupFiltersRequest
    <$> arbitraryReduced n -- catalogsProductGroupFiltersRequestAnyOf :: [CatalogsProductGroupFilterKeys]
    <*> arbitraryReduced n -- catalogsProductGroupFiltersRequestAllOf :: [CatalogsProductGroupFilterKeys]
  
instance Arbitrary CatalogsProductGroupFiltersRequestAnyOf where
  arbitrary = sized genCatalogsProductGroupFiltersRequestAnyOf

genCatalogsProductGroupFiltersRequestAnyOf :: Int -> Gen CatalogsProductGroupFiltersRequestAnyOf
genCatalogsProductGroupFiltersRequestAnyOf n =
  CatalogsProductGroupFiltersRequestAnyOf
    <$> arbitraryReduced n -- catalogsProductGroupFiltersRequestAnyOfAnyOf :: [CatalogsProductGroupFilterKeys]
  
instance Arbitrary CatalogsProductGroupFiltersRequestAnyOf1 where
  arbitrary = sized genCatalogsProductGroupFiltersRequestAnyOf1

genCatalogsProductGroupFiltersRequestAnyOf1 :: Int -> Gen CatalogsProductGroupFiltersRequestAnyOf1
genCatalogsProductGroupFiltersRequestAnyOf1 n =
  CatalogsProductGroupFiltersRequestAnyOf1
    <$> arbitraryReduced n -- catalogsProductGroupFiltersRequestAnyOf1AllOf :: [CatalogsProductGroupFilterKeys]
  
instance Arbitrary CatalogsProductGroupMultipleCountriesCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleCountriesCriteria

genCatalogsProductGroupMultipleCountriesCriteria :: Int -> Gen CatalogsProductGroupMultipleCountriesCriteria
genCatalogsProductGroupMultipleCountriesCriteria n =
  CatalogsProductGroupMultipleCountriesCriteria
    <$> arbitraryReduced n -- catalogsProductGroupMultipleCountriesCriteriaValues :: [Country]
    <*> arbitraryReducedMaybe n -- catalogsProductGroupMultipleCountriesCriteriaNegated :: Maybe Bool
  
instance Arbitrary CatalogsProductGroupMultipleGenderCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleGenderCriteria

genCatalogsProductGroupMultipleGenderCriteria :: Int -> Gen CatalogsProductGroupMultipleGenderCriteria
genCatalogsProductGroupMultipleGenderCriteria n =
  CatalogsProductGroupMultipleGenderCriteria
    <$> arbitraryReduced n -- catalogsProductGroupMultipleGenderCriteriaValues :: [Gender]
    <*> arbitraryReducedMaybe n -- catalogsProductGroupMultipleGenderCriteriaNegated :: Maybe Bool
  
instance Arbitrary CatalogsProductGroupMultipleMediaTypesCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleMediaTypesCriteria

genCatalogsProductGroupMultipleMediaTypesCriteria :: Int -> Gen CatalogsProductGroupMultipleMediaTypesCriteria
genCatalogsProductGroupMultipleMediaTypesCriteria n =
  CatalogsProductGroupMultipleMediaTypesCriteria
    <$> arbitraryReduced n -- catalogsProductGroupMultipleMediaTypesCriteriaValues :: [MediaType]
    <*> arbitraryReducedMaybe n -- catalogsProductGroupMultipleMediaTypesCriteriaNegated :: Maybe Bool
  
instance Arbitrary CatalogsProductGroupMultipleStringCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleStringCriteria

genCatalogsProductGroupMultipleStringCriteria :: Int -> Gen CatalogsProductGroupMultipleStringCriteria
genCatalogsProductGroupMultipleStringCriteria n =
  CatalogsProductGroupMultipleStringCriteria
    <$> arbitrary -- catalogsProductGroupMultipleStringCriteriaValues :: [Text]
    <*> arbitraryReducedMaybe n -- catalogsProductGroupMultipleStringCriteriaNegated :: Maybe Bool
  
instance Arbitrary CatalogsProductGroupMultipleStringListCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleStringListCriteria

genCatalogsProductGroupMultipleStringListCriteria :: Int -> Gen CatalogsProductGroupMultipleStringListCriteria
genCatalogsProductGroupMultipleStringListCriteria n =
  CatalogsProductGroupMultipleStringListCriteria
    <$> arbitraryReduced n -- catalogsProductGroupMultipleStringListCriteriaValues :: [[Text]]
    <*> arbitraryReducedMaybe n -- catalogsProductGroupMultipleStringListCriteriaNegated :: Maybe Bool
  
instance Arbitrary CatalogsProductGroupPinsList200Response where
  arbitrary = sized genCatalogsProductGroupPinsList200Response

genCatalogsProductGroupPinsList200Response :: Int -> Gen CatalogsProductGroupPinsList200Response
genCatalogsProductGroupPinsList200Response n =
  CatalogsProductGroupPinsList200Response
    <$> arbitraryReduced n -- catalogsProductGroupPinsList200ResponseItems :: [CatalogsProduct]
    <*> arbitraryReducedMaybe n -- catalogsProductGroupPinsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary CatalogsProductGroupPricingCriteria where
  arbitrary = sized genCatalogsProductGroupPricingCriteria

genCatalogsProductGroupPricingCriteria :: Int -> Gen CatalogsProductGroupPricingCriteria
genCatalogsProductGroupPricingCriteria n =
  CatalogsProductGroupPricingCriteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupPricingCriteriaInclusion :: Maybe Bool
    <*> arbitrary -- catalogsProductGroupPricingCriteriaValues :: Double
    <*> arbitraryReducedMaybe n -- catalogsProductGroupPricingCriteriaNegated :: Maybe Bool
  
instance Arbitrary CatalogsProductGroupPricingCurrencyCriteria where
  arbitrary = sized genCatalogsProductGroupPricingCurrencyCriteria

genCatalogsProductGroupPricingCurrencyCriteria :: Int -> Gen CatalogsProductGroupPricingCurrencyCriteria
genCatalogsProductGroupPricingCurrencyCriteria n =
  CatalogsProductGroupPricingCurrencyCriteria
    <$> arbitrary -- catalogsProductGroupPricingCurrencyCriteriaOperator :: E'Operator
    <*> arbitrary -- catalogsProductGroupPricingCurrencyCriteriaValue :: Double
    <*> arbitraryReduced n -- catalogsProductGroupPricingCurrencyCriteriaCurrency :: NonNullableCatalogsCurrency
    <*> arbitraryReducedMaybe n -- catalogsProductGroupPricingCurrencyCriteriaNegated :: Maybe Bool
  
instance Arbitrary CatalogsProductGroupProductCountsVertical where
  arbitrary = sized genCatalogsProductGroupProductCountsVertical

genCatalogsProductGroupProductCountsVertical :: Int -> Gen CatalogsProductGroupProductCountsVertical
genCatalogsProductGroupProductCountsVertical n =
  CatalogsProductGroupProductCountsVertical
    <$> arbitraryReduced n -- catalogsProductGroupProductCountsVerticalCatalogType :: CatalogsType
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalInStock :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalOutOfStock :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalPreorder :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalTotal :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalVideos :: Double
  
instance Arbitrary CatalogsProductGroupUpdateRequest where
  arbitrary = sized genCatalogsProductGroupUpdateRequest

genCatalogsProductGroupUpdateRequest :: Int -> Gen CatalogsProductGroupUpdateRequest
genCatalogsProductGroupUpdateRequest n =
  CatalogsProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestFilters :: Maybe CatalogsProductGroupFiltersRequest
  
instance Arbitrary CatalogsProductGroupsList200Response where
  arbitrary = sized genCatalogsProductGroupsList200Response

genCatalogsProductGroupsList200Response :: Int -> Gen CatalogsProductGroupsList200Response
genCatalogsProductGroupsList200Response n =
  CatalogsProductGroupsList200Response
    <$> arbitraryReduced n -- catalogsProductGroupsList200ResponseItems :: [CatalogsVerticalProductGroup]
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary CatalogsProductGroupsUpdateRequest where
  arbitrary = sized genCatalogsProductGroupsUpdateRequest

genCatalogsProductGroupsUpdateRequest :: Int -> Gen CatalogsProductGroupsUpdateRequest
genCatalogsProductGroupsUpdateRequest n =
  CatalogsProductGroupsUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestFilters :: Maybe CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestCatalogType :: Maybe E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestLocale :: Maybe CatalogsLocale
  
instance Arbitrary CatalogsReport where
  arbitrary = sized genCatalogsReport

genCatalogsReport :: Int -> Gen CatalogsReport
genCatalogsReport n =
  CatalogsReport
    <$> arbitraryReducedMaybe n -- catalogsReportReportStatus :: Maybe E'ReportStatus
    <*> arbitraryReducedMaybe n -- catalogsReportUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportSize :: Maybe Double
  
instance Arbitrary CatalogsReportDistributionIssueFilter where
  arbitrary = sized genCatalogsReportDistributionIssueFilter

genCatalogsReportDistributionIssueFilter :: Int -> Gen CatalogsReportDistributionIssueFilter
genCatalogsReportDistributionIssueFilter n =
  CatalogsReportDistributionIssueFilter
    <$> arbitrary -- catalogsReportDistributionIssueFilterReportType :: E'ReportType3
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionIssueFilterCatalogId :: Maybe Text
  
instance Arbitrary CatalogsReportDistributionStats where
  arbitrary = sized genCatalogsReportDistributionStats

genCatalogsReportDistributionStats :: Int -> Gen CatalogsReportDistributionStats
genCatalogsReportDistributionStats n =
  CatalogsReportDistributionStats
    <$> arbitraryReducedMaybe n -- catalogsReportDistributionStatsReportType :: Maybe E'ReportType3
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsCodeLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsOccurrences :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsIneligibleForAds :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsIneligibleForOrganic :: Maybe Bool
  
instance Arbitrary CatalogsReportFeedIngestionFilter where
  arbitrary = sized genCatalogsReportFeedIngestionFilter

genCatalogsReportFeedIngestionFilter :: Int -> Gen CatalogsReportFeedIngestionFilter
genCatalogsReportFeedIngestionFilter n =
  CatalogsReportFeedIngestionFilter
    <$> arbitrary -- catalogsReportFeedIngestionFilterReportType :: E'ReportType2
    <*> arbitrary -- catalogsReportFeedIngestionFilterFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionFilterProcessingResultId :: Maybe Text
  
instance Arbitrary CatalogsReportFeedIngestionStats where
  arbitrary = sized genCatalogsReportFeedIngestionStats

genCatalogsReportFeedIngestionStats :: Int -> Gen CatalogsReportFeedIngestionStats
genCatalogsReportFeedIngestionStats n =
  CatalogsReportFeedIngestionStats
    <$> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsReportType :: Maybe E'ReportType2
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsCodeLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsOccurrences :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsSeverity :: Maybe E'Severity
  
instance Arbitrary CatalogsReportParameters where
  arbitrary = sized genCatalogsReportParameters

genCatalogsReportParameters :: Int -> Gen CatalogsReportParameters
genCatalogsReportParameters n =
  CatalogsReportParameters
    <$> arbitraryReduced n -- catalogsReportParametersCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsReportParametersReport :: CatalogsHotelReportParametersReport
  
instance Arbitrary CatalogsReportStats where
  arbitrary = sized genCatalogsReportStats

genCatalogsReportStats :: Int -> Gen CatalogsReportStats
genCatalogsReportStats n =
  CatalogsReportStats
    <$> arbitrary -- catalogsReportStatsReportType :: E'ReportType
    <*> arbitraryReducedMaybe n -- catalogsReportStatsCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportStatsCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportStatsCodeLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportStatsMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportStatsOccurrences :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportStatsSeverity :: Maybe E'Severity
    <*> arbitraryReducedMaybe n -- catalogsReportStatsIneligibleForAds :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsReportStatsIneligibleForOrganic :: Maybe Bool
  
instance Arbitrary CatalogsRetailBatchRequest where
  arbitrary = sized genCatalogsRetailBatchRequest

genCatalogsRetailBatchRequest :: Int -> Gen CatalogsRetailBatchRequest
genCatalogsRetailBatchRequest n =
  CatalogsRetailBatchRequest
    <$> arbitrary -- catalogsRetailBatchRequestCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsRetailBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsRetailBatchRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- catalogsRetailBatchRequestItems :: [CatalogsRetailBatchRequestItemsInner]
  
instance Arbitrary CatalogsRetailBatchRequestItemsInner where
  arbitrary = sized genCatalogsRetailBatchRequestItemsInner

genCatalogsRetailBatchRequestItemsInner :: Int -> Gen CatalogsRetailBatchRequestItemsInner
genCatalogsRetailBatchRequestItemsInner n =
  CatalogsRetailBatchRequestItemsInner
    <$> arbitrary -- catalogsRetailBatchRequestItemsInnerItemId :: Text
    <*> arbitrary -- catalogsRetailBatchRequestItemsInnerOperation :: E'Operation
    <*> arbitraryReduced n -- catalogsRetailBatchRequestItemsInnerAttributes :: ItemAttributesRequest
    <*> arbitraryReducedMaybe n -- catalogsRetailBatchRequestItemsInnerUpdateMask :: Maybe [UpdateMaskFieldType]
  
instance Arbitrary CatalogsRetailFeed where
  arbitrary = sized genCatalogsRetailFeed

genCatalogsRetailFeed :: Int -> Gen CatalogsRetailFeed
genCatalogsRetailFeed n =
  CatalogsRetailFeed
    <$> arbitraryReduced n -- catalogsRetailFeedCreatedAt :: DateTime
    <*> arbitrary -- catalogsRetailFeedId :: Text
    <*> arbitraryReduced n -- catalogsRetailFeedUpdatedAt :: DateTime
    <*> arbitrary -- catalogsRetailFeedName :: Text
    <*> arbitraryReduced n -- catalogsRetailFeedFormat :: CatalogsFormat
    <*> arbitraryReduced n -- catalogsRetailFeedCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsRetailFeedCredentials :: CatalogsFeedCredentials
    <*> arbitrary -- catalogsRetailFeedLocation :: Text
    <*> arbitraryReduced n -- catalogsRetailFeedPreferredProcessingSchedule :: CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsRetailFeedStatus :: CatalogsStatus
    <*> arbitraryReduced n -- catalogsRetailFeedDefaultCurrency :: NullableCurrency
    <*> arbitrary -- catalogsRetailFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsRetailFeedDefaultCountry :: Country
    <*> arbitraryReduced n -- catalogsRetailFeedDefaultAvailability :: ProductAvailabilityType
  
instance Arbitrary CatalogsRetailFeedsCreateRequest where
  arbitrary = sized genCatalogsRetailFeedsCreateRequest

genCatalogsRetailFeedsCreateRequest :: Int -> Gen CatalogsRetailFeedsCreateRequest
genCatalogsRetailFeedsCreateRequest n =
  CatalogsRetailFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitrary -- catalogsRetailFeedsCreateRequestName :: Text
    <*> arbitraryReduced n -- catalogsRetailFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitraryReduced n -- catalogsRetailFeedsCreateRequestDefaultLocale :: CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitrary -- catalogsRetailFeedsCreateRequestLocation :: Text
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsRetailFeedsCreateRequestCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsRetailFeedsCreateRequestDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsRetailFeedsUpdateRequest where
  arbitrary = sized genCatalogsRetailFeedsUpdateRequest

genCatalogsRetailFeedsUpdateRequest :: Int -> Gen CatalogsRetailFeedsUpdateRequest
genCatalogsRetailFeedsUpdateRequest n =
  CatalogsRetailFeedsUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestStatus :: Maybe CatalogsStatus
    <*> arbitraryReduced n -- catalogsRetailFeedsUpdateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestDefaultAvailability :: Maybe ProductAvailabilityType
  
instance Arbitrary CatalogsRetailItemErrorResponse where
  arbitrary = sized genCatalogsRetailItemErrorResponse

genCatalogsRetailItemErrorResponse :: Int -> Gen CatalogsRetailItemErrorResponse
genCatalogsRetailItemErrorResponse n =
  CatalogsRetailItemErrorResponse
    <$> arbitraryReduced n -- catalogsRetailItemErrorResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsRetailItemErrorResponseItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailItemErrorResponseErrors :: Maybe [ItemValidationEvent]
  
instance Arbitrary CatalogsRetailItemResponse where
  arbitrary = sized genCatalogsRetailItemResponse

genCatalogsRetailItemResponse :: Int -> Gen CatalogsRetailItemResponse
genCatalogsRetailItemResponse n =
  CatalogsRetailItemResponse
    <$> arbitraryReduced n -- catalogsRetailItemResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsRetailItemResponseItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailItemResponsePins :: Maybe [Pin]
    <*> arbitraryReducedMaybe n -- catalogsRetailItemResponseAttributes :: Maybe ItemAttributes
  
instance Arbitrary CatalogsRetailItemsBatch where
  arbitrary = sized genCatalogsRetailItemsBatch

genCatalogsRetailItemsBatch :: Int -> Gen CatalogsRetailItemsBatch
genCatalogsRetailItemsBatch n =
  CatalogsRetailItemsBatch
    <$> arbitraryReducedMaybe n -- catalogsRetailItemsBatchBatchId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsBatchCreatedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsBatchStatus :: Maybe BatchOperationStatus
    <*> arbitraryReduced n -- catalogsRetailItemsBatchCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsBatchItems :: Maybe [ItemProcessingRecord]
  
instance Arbitrary CatalogsRetailItemsFilter where
  arbitrary = sized genCatalogsRetailItemsFilter

genCatalogsRetailItemsFilter :: Int -> Gen CatalogsRetailItemsFilter
genCatalogsRetailItemsFilter n =
  CatalogsRetailItemsFilter
    <$> arbitrary -- catalogsRetailItemsFilterCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsRetailItemsFilterItemIds :: [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsFilterCatalogId :: Maybe Text
  
instance Arbitrary CatalogsRetailItemsPostFilter where
  arbitrary = sized genCatalogsRetailItemsPostFilter

genCatalogsRetailItemsPostFilter :: Int -> Gen CatalogsRetailItemsPostFilter
genCatalogsRetailItemsPostFilter n =
  CatalogsRetailItemsPostFilter
    <$> arbitrary -- catalogsRetailItemsPostFilterCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsRetailItemsPostFilterItemIds :: [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsPostFilterCatalogId :: Maybe Text
  
instance Arbitrary CatalogsRetailListProductsByCatalogBasedFilterRequest where
  arbitrary = sized genCatalogsRetailListProductsByCatalogBasedFilterRequest

genCatalogsRetailListProductsByCatalogBasedFilterRequest :: Int -> Gen CatalogsRetailListProductsByCatalogBasedFilterRequest
genCatalogsRetailListProductsByCatalogBasedFilterRequest n =
  CatalogsRetailListProductsByCatalogBasedFilterRequest
    <$> arbitrary -- catalogsRetailListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsRetailListProductsByCatalogBasedFilterRequestCatalogId :: Text
    <*> arbitraryReduced n -- catalogsRetailListProductsByCatalogBasedFilterRequestFilters :: CatalogsProductGroupFilters
    <*> arbitraryReduced n -- catalogsRetailListProductsByCatalogBasedFilterRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsRetailListProductsByCatalogBasedFilterRequestLocale :: CatalogsLocale
  
instance Arbitrary CatalogsRetailProduct where
  arbitrary = sized genCatalogsRetailProduct

genCatalogsRetailProduct :: Int -> Gen CatalogsRetailProduct
genCatalogsRetailProduct n =
  CatalogsRetailProduct
    <$> arbitrary -- catalogsRetailProductCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsRetailProductMetadata :: CatalogsRetailProductMetadata
    <*> arbitraryReduced n -- catalogsRetailProductPin :: Pin
  
instance Arbitrary CatalogsRetailProductGroup where
  arbitrary = sized genCatalogsRetailProductGroup

genCatalogsRetailProductGroup :: Int -> Gen CatalogsRetailProductGroup
genCatalogsRetailProductGroup n =
  CatalogsRetailProductGroup
    <$> arbitrary -- catalogsRetailProductGroupCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsRetailProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsRetailProductGroupFilters :: CatalogsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupType :: Maybe CatalogsProductGroupType
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupStatus :: Maybe CatalogsProductGroupStatus
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdatedAt :: Maybe Int
    <*> arbitrary -- catalogsRetailProductGroupCatalogId :: Text
    <*> arbitrary -- catalogsRetailProductGroupFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupLocale :: Maybe Text
  
instance Arbitrary CatalogsRetailProductGroupCreateRequest where
  arbitrary = sized genCatalogsRetailProductGroupCreateRequest

genCatalogsRetailProductGroupCreateRequest :: Int -> Gen CatalogsRetailProductGroupCreateRequest
genCatalogsRetailProductGroupCreateRequest n =
  CatalogsRetailProductGroupCreateRequest
    <$> arbitrary -- catalogsRetailProductGroupCreateRequestCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsRetailProductGroupCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsRetailProductGroupCreateRequestFilters :: CatalogsProductGroupFiltersRequest
    <*> arbitrary -- catalogsRetailProductGroupCreateRequestCatalogId :: Text
    <*> arbitraryReduced n -- catalogsRetailProductGroupCreateRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsRetailProductGroupCreateRequestLocale :: CatalogsLocale
  
instance Arbitrary CatalogsRetailProductGroupProductCounts where
  arbitrary = sized genCatalogsRetailProductGroupProductCounts

genCatalogsRetailProductGroupProductCounts :: Int -> Gen CatalogsRetailProductGroupProductCounts
genCatalogsRetailProductGroupProductCounts n =
  CatalogsRetailProductGroupProductCounts
    <$> arbitrary -- catalogsRetailProductGroupProductCountsCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsRetailProductGroupProductCountsInStock :: Double
    <*> arbitrary -- catalogsRetailProductGroupProductCountsOutOfStock :: Double
    <*> arbitrary -- catalogsRetailProductGroupProductCountsPreorder :: Double
    <*> arbitrary -- catalogsRetailProductGroupProductCountsTotal :: Double
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupProductCountsVideos :: Maybe Double
  
instance Arbitrary CatalogsRetailProductGroupUpdateRequest where
  arbitrary = sized genCatalogsRetailProductGroupUpdateRequest

genCatalogsRetailProductGroupUpdateRequest :: Int -> Gen CatalogsRetailProductGroupUpdateRequest
genCatalogsRetailProductGroupUpdateRequest n =
  CatalogsRetailProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestCatalogType :: Maybe E'CatalogType2
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestFilters :: Maybe CatalogsProductGroupFiltersRequest
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestLocale :: Maybe CatalogsLocale
  
instance Arbitrary CatalogsRetailProductMetadata where
  arbitrary = sized genCatalogsRetailProductMetadata

genCatalogsRetailProductMetadata :: Int -> Gen CatalogsRetailProductMetadata
genCatalogsRetailProductMetadata n =
  CatalogsRetailProductMetadata
    <$> arbitrary -- catalogsRetailProductMetadataItemId :: Text
    <*> arbitrary -- catalogsRetailProductMetadataItemGroupId :: Text
    <*> arbitraryReduced n -- catalogsRetailProductMetadataAvailability :: NonNullableProductAvailabilityType
    <*> arbitrary -- catalogsRetailProductMetadataPrice :: Double
    <*> arbitrary -- catalogsRetailProductMetadataSalePrice :: Double
    <*> arbitraryReduced n -- catalogsRetailProductMetadataCurrency :: NonNullableCatalogsCurrency
  
instance Arbitrary CatalogsRetailReportParameters where
  arbitrary = sized genCatalogsRetailReportParameters

genCatalogsRetailReportParameters :: Int -> Gen CatalogsRetailReportParameters
genCatalogsRetailReportParameters n =
  CatalogsRetailReportParameters
    <$> arbitrary -- catalogsRetailReportParametersCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsRetailReportParametersReport :: CatalogsHotelReportParametersReport
  
instance Arbitrary CatalogsUpdatableCreativeAssetsAttributes where
  arbitrary = sized genCatalogsUpdatableCreativeAssetsAttributes

genCatalogsUpdatableCreativeAssetsAttributes :: Int -> Gen CatalogsUpdatableCreativeAssetsAttributes
genCatalogsUpdatableCreativeAssetsAttributes n =
  CatalogsUpdatableCreativeAssetsAttributes
    <$> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesGoogleProductCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesCustomLabel0 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesCustomLabel1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesCustomLabel2 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesCustomLabel3 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesCustomLabel4 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesVisibility :: Maybe Text
  
instance Arbitrary CatalogsUpdatableHotelAttributes where
  arbitrary = sized genCatalogsUpdatableHotelAttributes

genCatalogsUpdatableHotelAttributes :: Int -> Gen CatalogsUpdatableHotelAttributes
genCatalogsUpdatableHotelAttributes n =
  CatalogsUpdatableHotelAttributes
    <$> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesLatitude :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesLongitude :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesNeighborhood :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesAddress :: Maybe CatalogsHotelAddress
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCustomLabel0 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCustomLabel1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCustomLabel2 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCustomLabel3 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCustomLabel4 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesBasePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesSalePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesGuestRatings :: Maybe CatalogsHotelGuestRatings
  
instance Arbitrary CatalogsUpdateCreativeAssetsItem where
  arbitrary = sized genCatalogsUpdateCreativeAssetsItem

genCatalogsUpdateCreativeAssetsItem :: Int -> Gen CatalogsUpdateCreativeAssetsItem
genCatalogsUpdateCreativeAssetsItem n =
  CatalogsUpdateCreativeAssetsItem
    <$> arbitrary -- catalogsUpdateCreativeAssetsItemCreativeAssetsId :: Text
    <*> arbitrary -- catalogsUpdateCreativeAssetsItemOperation :: E'Operation3
    <*> arbitraryReduced n -- catalogsUpdateCreativeAssetsItemAttributes :: CatalogsUpdatableCreativeAssetsAttributes
  
instance Arbitrary CatalogsUpdateHotelItem where
  arbitrary = sized genCatalogsUpdateHotelItem

genCatalogsUpdateHotelItem :: Int -> Gen CatalogsUpdateHotelItem
genCatalogsUpdateHotelItem n =
  CatalogsUpdateHotelItem
    <$> arbitrary -- catalogsUpdateHotelItemHotelId :: Text
    <*> arbitrary -- catalogsUpdateHotelItemOperation :: E'Operation3
    <*> arbitraryReduced n -- catalogsUpdateHotelItemAttributes :: CatalogsUpdatableHotelAttributes
  
instance Arbitrary CatalogsUpdateRetailItem where
  arbitrary = sized genCatalogsUpdateRetailItem

genCatalogsUpdateRetailItem :: Int -> Gen CatalogsUpdateRetailItem
genCatalogsUpdateRetailItem n =
  CatalogsUpdateRetailItem
    <$> arbitrary -- catalogsUpdateRetailItemItemId :: Text
    <*> arbitrary -- catalogsUpdateRetailItemOperation :: E'Operation3
    <*> arbitraryReduced n -- catalogsUpdateRetailItemAttributes :: UpdatableItemAttributes
    <*> arbitraryReducedMaybe n -- catalogsUpdateRetailItemUpdateMask :: Maybe [UpdateMaskFieldType]
  
instance Arbitrary CatalogsUpsertCreativeAssetsItem where
  arbitrary = sized genCatalogsUpsertCreativeAssetsItem

genCatalogsUpsertCreativeAssetsItem :: Int -> Gen CatalogsUpsertCreativeAssetsItem
genCatalogsUpsertCreativeAssetsItem n =
  CatalogsUpsertCreativeAssetsItem
    <$> arbitrary -- catalogsUpsertCreativeAssetsItemCreativeAssetsId :: Text
    <*> arbitrary -- catalogsUpsertCreativeAssetsItemOperation :: E'Operation4
    <*> arbitraryReduced n -- catalogsUpsertCreativeAssetsItemAttributes :: CatalogsCreativeAssetsAttributes
  
instance Arbitrary CatalogsUpsertHotelItem where
  arbitrary = sized genCatalogsUpsertHotelItem

genCatalogsUpsertHotelItem :: Int -> Gen CatalogsUpsertHotelItem
genCatalogsUpsertHotelItem n =
  CatalogsUpsertHotelItem
    <$> arbitrary -- catalogsUpsertHotelItemHotelId :: Text
    <*> arbitrary -- catalogsUpsertHotelItemOperation :: E'Operation4
    <*> arbitraryReduced n -- catalogsUpsertHotelItemAttributes :: CatalogsHotelAttributes
  
instance Arbitrary CatalogsUpsertRetailItem where
  arbitrary = sized genCatalogsUpsertRetailItem

genCatalogsUpsertRetailItem :: Int -> Gen CatalogsUpsertRetailItem
genCatalogsUpsertRetailItem n =
  CatalogsUpsertRetailItem
    <$> arbitrary -- catalogsUpsertRetailItemItemId :: Text
    <*> arbitrary -- catalogsUpsertRetailItemOperation :: E'Operation4
    <*> arbitraryReduced n -- catalogsUpsertRetailItemAttributes :: ItemAttributesRequest
  
instance Arbitrary CatalogsVerticalBatchRequest where
  arbitrary = sized genCatalogsVerticalBatchRequest

genCatalogsVerticalBatchRequest :: Int -> Gen CatalogsVerticalBatchRequest
genCatalogsVerticalBatchRequest n =
  CatalogsVerticalBatchRequest
    <$> arbitrary -- catalogsVerticalBatchRequestCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsVerticalBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsVerticalBatchRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- catalogsVerticalBatchRequestItems :: [CatalogsCreativeAssetsBatchItem]
    <*> arbitraryReducedMaybe n -- catalogsVerticalBatchRequestCatalogId :: Maybe Text
  
instance Arbitrary CatalogsVerticalFeedsCreateRequest where
  arbitrary = sized genCatalogsVerticalFeedsCreateRequest

genCatalogsVerticalFeedsCreateRequest :: Int -> Gen CatalogsVerticalFeedsCreateRequest
genCatalogsVerticalFeedsCreateRequest n =
  CatalogsVerticalFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitrary -- catalogsVerticalFeedsCreateRequestName :: Text
    <*> arbitraryReduced n -- catalogsVerticalFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitraryReduced n -- catalogsVerticalFeedsCreateRequestDefaultLocale :: CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitrary -- catalogsVerticalFeedsCreateRequestLocation :: Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsVerticalFeedsCreateRequestCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsVerticalFeedsCreateRequestDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestStatus :: Maybe CatalogsStatus
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestCatalogId :: Maybe Text
  
instance Arbitrary CatalogsVerticalFeedsUpdateRequest where
  arbitrary = sized genCatalogsVerticalFeedsUpdateRequest

genCatalogsVerticalFeedsUpdateRequest :: Int -> Gen CatalogsVerticalFeedsUpdateRequest
genCatalogsVerticalFeedsUpdateRequest n =
  CatalogsVerticalFeedsUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestStatus :: Maybe CatalogsStatus
    <*> arbitraryReduced n -- catalogsVerticalFeedsUpdateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestDefaultAvailability :: Maybe ProductAvailabilityType
  
instance Arbitrary CatalogsVerticalProductGroup where
  arbitrary = sized genCatalogsVerticalProductGroup

genCatalogsVerticalProductGroup :: Int -> Gen CatalogsVerticalProductGroup
genCatalogsVerticalProductGroup n =
  CatalogsVerticalProductGroup
    <$> arbitrary -- catalogsVerticalProductGroupCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsVerticalProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsVerticalProductGroupFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupType :: Maybe CatalogsProductGroupType
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupStatus :: Maybe CatalogsProductGroupStatus
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdatedAt :: Maybe Int
    <*> arbitrary -- catalogsVerticalProductGroupCatalogId :: Text
    <*> arbitrary -- catalogsVerticalProductGroupFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupLocale :: Maybe Text
  
instance Arbitrary CatalogsVerticalProductGroupCreateRequest where
  arbitrary = sized genCatalogsVerticalProductGroupCreateRequest

genCatalogsVerticalProductGroupCreateRequest :: Int -> Gen CatalogsVerticalProductGroupCreateRequest
genCatalogsVerticalProductGroupCreateRequest n =
  CatalogsVerticalProductGroupCreateRequest
    <$> arbitrary -- catalogsVerticalProductGroupCreateRequestCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsVerticalProductGroupCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsVerticalProductGroupCreateRequestFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitrary -- catalogsVerticalProductGroupCreateRequestCatalogId :: Text
    <*> arbitraryReduced n -- catalogsVerticalProductGroupCreateRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsVerticalProductGroupCreateRequestLocale :: CatalogsLocale
  
instance Arbitrary CatalogsVerticalProductGroupUpdateRequest where
  arbitrary = sized genCatalogsVerticalProductGroupUpdateRequest

genCatalogsVerticalProductGroupUpdateRequest :: Int -> Gen CatalogsVerticalProductGroupUpdateRequest
genCatalogsVerticalProductGroupUpdateRequest n =
  CatalogsVerticalProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestCatalogType :: Maybe E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestFilters :: Maybe CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestLocale :: Maybe CatalogsLocale
  
instance Arbitrary CatalogsVerticalsListProductsByCatalogBasedFilterRequest where
  arbitrary = sized genCatalogsVerticalsListProductsByCatalogBasedFilterRequest

genCatalogsVerticalsListProductsByCatalogBasedFilterRequest :: Int -> Gen CatalogsVerticalsListProductsByCatalogBasedFilterRequest
genCatalogsVerticalsListProductsByCatalogBasedFilterRequest n =
  CatalogsVerticalsListProductsByCatalogBasedFilterRequest
    <$> arbitrary -- catalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogId :: Text
    <*> arbitraryReduced n -- catalogsVerticalsListProductsByCatalogBasedFilterRequestFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReduced n -- catalogsVerticalsListProductsByCatalogBasedFilterRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsVerticalsListProductsByCatalogBasedFilterRequestLocale :: CatalogsLocale
  
instance Arbitrary ConditionFilter where
  arbitrary = sized genConditionFilter

genConditionFilter :: Int -> Gen ConditionFilter
genConditionFilter n =
  ConditionFilter
    <$> arbitraryReduced n -- conditionFilterCondition :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary ConversionApiResponse where
  arbitrary = sized genConversionApiResponse

genConversionApiResponse :: Int -> Gen ConversionApiResponse
genConversionApiResponse n =
  ConversionApiResponse
    <$> arbitrary -- conversionApiResponseNumEventsReceived :: Int
    <*> arbitrary -- conversionApiResponseNumEventsProcessed :: Int
    <*> arbitraryReduced n -- conversionApiResponseEvents :: [ConversionApiResponseEventsInner]
  
instance Arbitrary ConversionApiResponseEventsInner where
  arbitrary = sized genConversionApiResponseEventsInner

genConversionApiResponseEventsInner :: Int -> Gen ConversionApiResponseEventsInner
genConversionApiResponseEventsInner n =
  ConversionApiResponseEventsInner
    <$> arbitrary -- conversionApiResponseEventsInnerStatus :: E'Status4
    <*> arbitraryReducedMaybe n -- conversionApiResponseEventsInnerErrorMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionApiResponseEventsInnerWarningMessage :: Maybe Text
  
instance Arbitrary ConversionEventResponse where
  arbitrary = sized genConversionEventResponse

genConversionEventResponse :: Int -> Gen ConversionEventResponse
genConversionEventResponse n =
  ConversionEventResponse
    <$> arbitraryReducedMaybe n -- conversionEventResponseConversionEvent :: Maybe ConversionTagType
    <*> arbitraryReducedMaybe n -- conversionEventResponseConversionTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventResponseCreatedTime :: Maybe Int
  
instance Arbitrary ConversionEvents where
  arbitrary = sized genConversionEvents

genConversionEvents :: Int -> Gen ConversionEvents
genConversionEvents n =
  ConversionEvents
    <$> arbitraryReduced n -- conversionEventsData :: [ConversionEventsDataInner]
  
instance Arbitrary ConversionEventsDataInner where
  arbitrary = sized genConversionEventsDataInner

genConversionEventsDataInner :: Int -> Gen ConversionEventsDataInner
genConversionEventsDataInner n =
  ConversionEventsDataInner
    <$> arbitrary -- conversionEventsDataInnerEventName :: Text
    <*> arbitrary -- conversionEventsDataInnerActionSource :: Text
    <*> arbitrary -- conversionEventsDataInnerEventTime :: Integer
    <*> arbitrary -- conversionEventsDataInnerEventId :: Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerEventSourceUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerOptOut :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerPartnerName :: Maybe Text
    <*> arbitraryReduced n -- conversionEventsDataInnerUserData :: ConversionEventsUserData
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomData :: Maybe ConversionEventsDataInnerCustomData
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerAppId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerAppName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerAppVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerDeviceBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerDeviceCarrier :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerDeviceModel :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerDeviceType :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerOsVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerWifi :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerLanguage :: Maybe Text
  
instance Arbitrary ConversionEventsDataInnerCustomData where
  arbitrary = sized genConversionEventsDataInnerCustomData

genConversionEventsDataInnerCustomData :: Int -> Gen ConversionEventsDataInnerCustomData
genConversionEventsDataInnerCustomData n =
  ConversionEventsDataInnerCustomData
    <$> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContents :: Maybe [ConversionEventsDataInnerCustomDataContentsInner]
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataNumItems :: Maybe Integer
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataSearchString :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataOptOutType :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataNp :: Maybe Text
  
instance Arbitrary ConversionEventsDataInnerCustomDataContentsInner where
  arbitrary = sized genConversionEventsDataInnerCustomDataContentsInner

genConversionEventsDataInnerCustomDataContentsInner :: Int -> Gen ConversionEventsDataInnerCustomDataContentsInner
genConversionEventsDataInnerCustomDataContentsInner n =
  ConversionEventsDataInnerCustomDataContentsInner
    <$> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerItemPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerQuantity :: Maybe Integer
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerItemName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerItemCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerItemBrand :: Maybe Text
  
instance Arbitrary ConversionEventsUserData where
  arbitrary = sized genConversionEventsUserData

genConversionEventsUserData :: Int -> Gen ConversionEventsUserData
genConversionEventsUserData n =
  ConversionEventsUserData
    <$> arbitraryReducedMaybe n -- conversionEventsUserDataPh :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataGe :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataDb :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataLn :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataFn :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataCt :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataSt :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataZp :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataCountry :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataExternalId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataClickId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPartnerId :: Maybe Text
    <*> arbitrary -- conversionEventsUserDataEm :: [Text]
    <*> arbitrary -- conversionEventsUserDataHashedMaids :: [Text]
    <*> arbitrary -- conversionEventsUserDataClientIpAddress :: Text
    <*> arbitrary -- conversionEventsUserDataClientUserAgent :: Text
  
instance Arbitrary ConversionEventsUserDataAnyOf where
  arbitrary = sized genConversionEventsUserDataAnyOf

genConversionEventsUserDataAnyOf :: Int -> Gen ConversionEventsUserDataAnyOf
genConversionEventsUserDataAnyOf n =
  ConversionEventsUserDataAnyOf
    <$> arbitrary -- conversionEventsUserDataAnyOfEm :: [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataAnyOfHashedMaids :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataAnyOfClientIpAddress :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataAnyOfClientUserAgent :: Maybe Text
  
instance Arbitrary ConversionEventsUserDataAnyOf1 where
  arbitrary = sized genConversionEventsUserDataAnyOf1

genConversionEventsUserDataAnyOf1 :: Int -> Gen ConversionEventsUserDataAnyOf1
genConversionEventsUserDataAnyOf1 n =
  ConversionEventsUserDataAnyOf1
    <$> arbitraryReducedMaybe n -- conversionEventsUserDataAnyOf1Em :: Maybe [Text]
    <*> arbitrary -- conversionEventsUserDataAnyOf1HashedMaids :: [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataAnyOf1ClientIpAddress :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataAnyOf1ClientUserAgent :: Maybe Text
  
instance Arbitrary ConversionEventsUserDataAnyOf2 where
  arbitrary = sized genConversionEventsUserDataAnyOf2

genConversionEventsUserDataAnyOf2 :: Int -> Gen ConversionEventsUserDataAnyOf2
genConversionEventsUserDataAnyOf2 n =
  ConversionEventsUserDataAnyOf2
    <$> arbitraryReducedMaybe n -- conversionEventsUserDataAnyOf2Em :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataAnyOf2HashedMaids :: Maybe [Text]
    <*> arbitrary -- conversionEventsUserDataAnyOf2ClientIpAddress :: Text
    <*> arbitrary -- conversionEventsUserDataAnyOf2ClientUserAgent :: Text
  
instance Arbitrary ConversionTagCommon where
  arbitrary = sized genConversionTagCommon

genConversionTagCommon :: Int -> Gen ConversionTagCommon
genConversionTagCommon n =
  ConversionTagCommon
    <$> arbitraryReducedMaybe n -- conversionTagCommonAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagCommonCodeSnippet :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagCommonEnhancedMatchStatus :: Maybe EnhancedMatchStatusType
    <*> arbitraryReducedMaybe n -- conversionTagCommonId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagCommonLastFiredTimeMs :: Maybe Double
    <*> arbitraryReducedMaybe n -- conversionTagCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagCommonStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- conversionTagCommonVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagCommonConfigs :: Maybe ConversionTagConfigs
  
instance Arbitrary ConversionTagConfigs where
  arbitrary = sized genConversionTagConfigs

genConversionTagConfigs :: Int -> Gen ConversionTagConfigs
genConversionTagConfigs n =
  ConversionTagConfigs
    <$> arbitraryReducedMaybe n -- conversionTagConfigsAemEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsMdFrequency :: Maybe Double
    <*> arbitraryReducedMaybe n -- conversionTagConfigsAemFnlnEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsAemPhEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsAemGeEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsAemDbEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsAemLocEnabled :: Maybe Bool
  
instance Arbitrary ConversionTagCreate where
  arbitrary = sized genConversionTagCreate

genConversionTagCreate :: Int -> Gen ConversionTagCreate
genConversionTagCreate n =
  ConversionTagCreate
    <$> arbitrary -- conversionTagCreateName :: Text
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateMdFrequency :: Maybe Double
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemFnlnEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemPhEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemGeEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemDbEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemLocEnabled :: Maybe Bool
  
instance Arbitrary ConversionTagListResponse where
  arbitrary = sized genConversionTagListResponse

genConversionTagListResponse :: Int -> Gen ConversionTagListResponse
genConversionTagListResponse n =
  ConversionTagListResponse
    <$> arbitraryReducedMaybe n -- conversionTagListResponseItems :: Maybe [ConversionTagResponse]
  
instance Arbitrary ConversionTagResponse where
  arbitrary = sized genConversionTagResponse

genConversionTagResponse :: Int -> Gen ConversionTagResponse
genConversionTagResponse n =
  ConversionTagResponse
    <$> arbitraryReducedMaybe n -- conversionTagResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagResponseCodeSnippet :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagResponseEnhancedMatchStatus :: Maybe EnhancedMatchStatusType
    <*> arbitraryReducedMaybe n -- conversionTagResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagResponseLastFiredTimeMs :: Maybe Double
    <*> arbitraryReducedMaybe n -- conversionTagResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagResponseStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- conversionTagResponseVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagResponseConfigs :: Maybe ConversionTagConfigs
  
instance Arbitrary CountryFilter where
  arbitrary = sized genCountryFilter

genCountryFilter :: Int -> Gen CountryFilter
genCountryFilter n =
  CountryFilter
    <$> arbitraryReduced n -- countryFilterCountry :: CatalogsProductGroupMultipleCountriesCriteria
  
instance Arbitrary CreateAssetAccessRequestBody where
  arbitrary = sized genCreateAssetAccessRequestBody

genCreateAssetAccessRequestBody :: Int -> Gen CreateAssetAccessRequestBody
genCreateAssetAccessRequestBody n =
  CreateAssetAccessRequestBody
    <$> arbitraryReduced n -- createAssetAccessRequestBodyAssetRequests :: [CreateAssetAccessRequestBodyAssetRequestsInner]
  
instance Arbitrary CreateAssetAccessRequestBodyAssetRequestsInner where
  arbitrary = sized genCreateAssetAccessRequestBodyAssetRequestsInner

genCreateAssetAccessRequestBodyAssetRequestsInner :: Int -> Gen CreateAssetAccessRequestBodyAssetRequestsInner
genCreateAssetAccessRequestBodyAssetRequestsInner n =
  CreateAssetAccessRequestBodyAssetRequestsInner
    <$> arbitrary -- createAssetAccessRequestBodyAssetRequestsInnerPartnerId :: Text
    <*> arbitraryReduced n -- createAssetAccessRequestBodyAssetRequestsInnerAssetIdToPermissions :: (Map.Map String [Permissions])
  
instance Arbitrary CreateAssetAccessRequestErrorMessageInner where
  arbitrary = sized genCreateAssetAccessRequestErrorMessageInner

genCreateAssetAccessRequestErrorMessageInner :: Int -> Gen CreateAssetAccessRequestErrorMessageInner
genCreateAssetAccessRequestErrorMessageInner n =
  CreateAssetAccessRequestErrorMessageInner
    <$> arbitraryReducedMaybe n -- createAssetAccessRequestErrorMessageInnerCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- createAssetAccessRequestErrorMessageInnerMessages :: Maybe [Text]
  
instance Arbitrary CreateAssetAccessRequestResponse where
  arbitrary = sized genCreateAssetAccessRequestResponse

genCreateAssetAccessRequestResponse :: Int -> Gen CreateAssetAccessRequestResponse
genCreateAssetAccessRequestResponse n =
  CreateAssetAccessRequestResponse
    <$> arbitraryReducedMaybe n -- createAssetAccessRequestResponseExceptions :: Maybe [CreateAssetAccessRequestErrorMessageInner]
    <*> arbitraryReducedMaybe n -- createAssetAccessRequestResponseInvites :: Maybe (Map.Map String Text)
  
instance Arbitrary CreateAssetGroupBody where
  arbitrary = sized genCreateAssetGroupBody

genCreateAssetGroupBody :: Int -> Gen CreateAssetGroupBody
genCreateAssetGroupBody n =
  CreateAssetGroupBody
    <$> arbitrary -- createAssetGroupBodyAssetGroupName :: Text
    <*> arbitrary -- createAssetGroupBodyAssetGroupDescription :: Text
    <*> arbitraryReduced n -- createAssetGroupBodyAssetGroupTypes :: [AssetGroupType]
  
instance Arbitrary CreateAssetGroupResponse where
  arbitrary = sized genCreateAssetGroupResponse

genCreateAssetGroupResponse :: Int -> Gen CreateAssetGroupResponse
genCreateAssetGroupResponse n =
  CreateAssetGroupResponse
    <$> arbitraryReducedMaybe n -- createAssetGroupResponseAssetGroup :: Maybe AssetGroupBinding
  
instance Arbitrary CreateAssetInvitesRequest where
  arbitrary = sized genCreateAssetInvitesRequest

genCreateAssetInvitesRequest :: Int -> Gen CreateAssetInvitesRequest
genCreateAssetInvitesRequest n =
  CreateAssetInvitesRequest
    <$> arbitraryReduced n -- createAssetInvitesRequestInvites :: [CreateAssetInvitesRequestItem]
  
instance Arbitrary CreateAssetInvitesRequestItem where
  arbitrary = sized genCreateAssetInvitesRequestItem

genCreateAssetInvitesRequestItem :: Int -> Gen CreateAssetInvitesRequestItem
genCreateAssetInvitesRequestItem n =
  CreateAssetInvitesRequestItem
    <$> arbitrary -- createAssetInvitesRequestItemInviteId :: Text
    <*> arbitraryReduced n -- createAssetInvitesRequestItemInviteType :: InviteType
    <*> arbitraryReduced n -- createAssetInvitesRequestItemAssetIdToPermissions :: (Map.Map String [Permissions])
  
instance Arbitrary CreateInvitesResultsResponseArray where
  arbitrary = sized genCreateInvitesResultsResponseArray

genCreateInvitesResultsResponseArray :: Int -> Gen CreateInvitesResultsResponseArray
genCreateInvitesResultsResponseArray n =
  CreateInvitesResultsResponseArray
    <$> arbitraryReducedMaybe n -- createInvitesResultsResponseArrayItems :: Maybe [CreateInvitesResultsResponseArrayItemsInner]
  
instance Arbitrary CreateInvitesResultsResponseArrayItemsInner where
  arbitrary = sized genCreateInvitesResultsResponseArrayItemsInner

genCreateInvitesResultsResponseArrayItemsInner :: Int -> Gen CreateInvitesResultsResponseArrayItemsInner
genCreateInvitesResultsResponseArrayItemsInner n =
  CreateInvitesResultsResponseArrayItemsInner
    <$> arbitraryReducedMaybe n -- createInvitesResultsResponseArrayItemsInnerException :: Maybe InviteExceptionResponse
    <*> arbitraryReducedMaybe n -- createInvitesResultsResponseArrayItemsInnerInvite :: Maybe CreateInvitesResultsResponseArrayItemsInnerInvite
  
instance Arbitrary CreateInvitesResultsResponseArrayItemsInnerInvite where
  arbitrary = sized genCreateInvitesResultsResponseArrayItemsInnerInvite

genCreateInvitesResultsResponseArrayItemsInnerInvite :: Int -> Gen CreateInvitesResultsResponseArrayItemsInnerInvite
genCreateInvitesResultsResponseArrayItemsInnerInvite n =
  CreateInvitesResultsResponseArrayItemsInnerInvite
    <$> arbitraryReducedMaybe n -- createInvitesResultsResponseArrayItemsInnerInviteId :: Maybe Text
    <*> arbitraryReducedMaybe n -- createInvitesResultsResponseArrayItemsInnerInviteUser :: Maybe BusinessAccessUserSummary
  
instance Arbitrary CreateMMMReportRequest where
  arbitrary = sized genCreateMMMReportRequest

genCreateMMMReportRequest :: Int -> Gen CreateMMMReportRequest
genCreateMMMReportRequest n =
  CreateMMMReportRequest
    <$> arbitrary -- createMMMReportRequestReportName :: Text
    <*> arbitrary -- createMMMReportRequestStartDate :: Text
    <*> arbitrary -- createMMMReportRequestEndDate :: Text
    <*> arbitrary -- createMMMReportRequestGranularity :: E'Granularity
    <*> arbitrary -- createMMMReportRequestLevel :: E'Level
    <*> arbitraryReduced n -- createMMMReportRequestTargetingTypes :: [MMMReportingTargetingType]
    <*> arbitraryReduced n -- createMMMReportRequestColumns :: [MMMReportingColumn]
    <*> arbitraryReducedMaybe n -- createMMMReportRequestCountries :: Maybe [TargetingAdvertiserCountry]
  
instance Arbitrary CreateMMMReportResponse where
  arbitrary = sized genCreateMMMReportResponse

genCreateMMMReportResponse :: Int -> Gen CreateMMMReportResponse
genCreateMMMReportResponse n =
  CreateMMMReportResponse
    <$> arbitraryReducedMaybe n -- createMMMReportResponseCode :: Maybe Double
    <*> arbitraryReducedMaybe n -- createMMMReportResponseData :: Maybe CreateMMMReportResponseData
  
instance Arbitrary CreateMMMReportResponseData where
  arbitrary = sized genCreateMMMReportResponseData

genCreateMMMReportResponseData :: Int -> Gen CreateMMMReportResponseData
genCreateMMMReportResponseData n =
  CreateMMMReportResponseData
    <$> arbitraryReducedMaybe n -- createMMMReportResponseDataReportStatus :: Maybe BulkReportingJobStatus
    <*> arbitraryReducedMaybe n -- createMMMReportResponseDataToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- createMMMReportResponseDataMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- createMMMReportResponseDataStatus :: Maybe Text
  
instance Arbitrary CreateMembershipOrPartnershipInvitesBody where
  arbitrary = sized genCreateMembershipOrPartnershipInvitesBody

genCreateMembershipOrPartnershipInvitesBody :: Int -> Gen CreateMembershipOrPartnershipInvitesBody
genCreateMembershipOrPartnershipInvitesBody n =
  CreateMembershipOrPartnershipInvitesBody
    <$> arbitrary -- createMembershipOrPartnershipInvitesBodyBusinessRole :: E'BusinessRole
    <*> arbitraryReduced n -- createMembershipOrPartnershipInvitesBodyInviteType :: InviteType
    <*> arbitraryReducedMaybe n -- createMembershipOrPartnershipInvitesBodyMembers :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- createMembershipOrPartnershipInvitesBodyPartners :: Maybe [Text]
  
instance Arbitrary CreativeAssetsIdFilter where
  arbitrary = sized genCreativeAssetsIdFilter

genCreativeAssetsIdFilter :: Int -> Gen CreativeAssetsIdFilter
genCreativeAssetsIdFilter n =
  CreativeAssetsIdFilter
    <$> arbitraryReduced n -- creativeAssetsIdFilterCreativeAssetsId :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary CreativeAssetsProcessingRecord where
  arbitrary = sized genCreativeAssetsProcessingRecord

genCreativeAssetsProcessingRecord :: Int -> Gen CreativeAssetsProcessingRecord
genCreativeAssetsProcessingRecord n =
  CreativeAssetsProcessingRecord
    <$> arbitraryReducedMaybe n -- creativeAssetsProcessingRecordCreativeAssetsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- creativeAssetsProcessingRecordErrors :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- creativeAssetsProcessingRecordWarnings :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- creativeAssetsProcessingRecordStatus :: Maybe ItemProcessingStatus
  
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
  
instance Arbitrary CustomerList where
  arbitrary = sized genCustomerList

genCustomerList :: Int -> Gen CustomerList
genCustomerList n =
  CustomerList
    <$> arbitraryReducedMaybe n -- customerListAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListCreatedTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- customerListId :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListName :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListNumBatches :: Maybe Double
    <*> arbitraryReducedMaybe n -- customerListNumRemovedUserRecords :: Maybe Double
    <*> arbitraryReducedMaybe n -- customerListNumUploadedUserRecords :: Maybe Double
    <*> arbitraryReducedMaybe n -- customerListStatus :: Maybe E'Status2
    <*> arbitraryReducedMaybe n -- customerListType :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListUpdatedTime :: Maybe Double
    <*> arbitraryReducedMaybeValue n -- customerListExceptions :: Maybe A.Value
  
instance Arbitrary CustomerListRequest where
  arbitrary = sized genCustomerListRequest

genCustomerListRequest :: Int -> Gen CustomerListRequest
genCustomerListRequest n =
  CustomerListRequest
    <$> arbitrary -- customerListRequestName :: Text
    <*> arbitrary -- customerListRequestRecords :: Text
    <*> arbitraryReducedMaybe n -- customerListRequestListType :: Maybe UserListType
    <*> arbitraryReducedMaybeValue n -- customerListRequestExceptions :: Maybe A.Value
  
instance Arbitrary CustomerListUpdateRequest where
  arbitrary = sized genCustomerListUpdateRequest

genCustomerListUpdateRequest :: Int -> Gen CustomerListUpdateRequest
genCustomerListUpdateRequest n =
  CustomerListUpdateRequest
    <$> arbitrary -- customerListUpdateRequestRecords :: Text
    <*> arbitraryReduced n -- customerListUpdateRequestOperationType :: UserListOperationType
    <*> arbitraryReducedMaybe n -- customerListUpdateRequestExceptions :: Maybe Exception
  
instance Arbitrary CustomerListsList200Response where
  arbitrary = sized genCustomerListsList200Response

genCustomerListsList200Response :: Int -> Gen CustomerListsList200Response
genCustomerListsList200Response n =
  CustomerListsList200Response
    <$> arbitraryReduced n -- customerListsList200ResponseItems :: [CustomerList]
    <*> arbitraryReducedMaybe n -- customerListsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary DeleteAssetGroupBody where
  arbitrary = sized genDeleteAssetGroupBody

genDeleteAssetGroupBody :: Int -> Gen DeleteAssetGroupBody
genDeleteAssetGroupBody n =
  DeleteAssetGroupBody
    <$> arbitrary -- deleteAssetGroupBodyAssetGroupsToDelete :: [Text]
  
instance Arbitrary DeleteAssetGroupResponse where
  arbitrary = sized genDeleteAssetGroupResponse

genDeleteAssetGroupResponse :: Int -> Gen DeleteAssetGroupResponse
genDeleteAssetGroupResponse n =
  DeleteAssetGroupResponse
    <$> arbitraryReducedMaybe n -- deleteAssetGroupResponseDeletedAssetGroups :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- deleteAssetGroupResponseExceptions :: Maybe [DeleteAssetGroupResponseExceptionsInner]
  
instance Arbitrary DeleteAssetGroupResponseExceptionsInner where
  arbitrary = sized genDeleteAssetGroupResponseExceptionsInner

genDeleteAssetGroupResponseExceptionsInner :: Int -> Gen DeleteAssetGroupResponseExceptionsInner
genDeleteAssetGroupResponseExceptionsInner n =
  DeleteAssetGroupResponseExceptionsInner
    <$> arbitraryReducedMaybe n -- deleteAssetGroupResponseExceptionsInnerCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- deleteAssetGroupResponseExceptionsInnerMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- deleteAssetGroupResponseExceptionsInnerAssetGroupId :: Maybe Text
  
instance Arbitrary DeleteInvitesResultsResponseArray where
  arbitrary = sized genDeleteInvitesResultsResponseArray

genDeleteInvitesResultsResponseArray :: Int -> Gen DeleteInvitesResultsResponseArray
genDeleteInvitesResultsResponseArray n =
  DeleteInvitesResultsResponseArray
    <$> arbitraryReducedMaybe n -- deleteInvitesResultsResponseArrayItems :: Maybe [DeleteInvitesResultsResponseArrayItemsInner]
  
instance Arbitrary DeleteInvitesResultsResponseArrayItemsInner where
  arbitrary = sized genDeleteInvitesResultsResponseArrayItemsInner

genDeleteInvitesResultsResponseArrayItemsInner :: Int -> Gen DeleteInvitesResultsResponseArrayItemsInner
genDeleteInvitesResultsResponseArrayItemsInner n =
  DeleteInvitesResultsResponseArrayItemsInner
    <$> arbitraryReducedMaybe n -- deleteInvitesResultsResponseArrayItemsInnerException :: Maybe DeleteInvitesResultsResponseArrayItemsInnerException
    <*> arbitraryReducedMaybe n -- deleteInvitesResultsResponseArrayItemsInnerInvite :: Maybe BaseInviteDataResponse
  
instance Arbitrary DeleteInvitesResultsResponseArrayItemsInnerException where
  arbitrary = sized genDeleteInvitesResultsResponseArrayItemsInnerException

genDeleteInvitesResultsResponseArrayItemsInnerException :: Int -> Gen DeleteInvitesResultsResponseArrayItemsInnerException
genDeleteInvitesResultsResponseArrayItemsInnerException n =
  DeleteInvitesResultsResponseArrayItemsInnerException
    <$> arbitraryReducedMaybe n -- deleteInvitesResultsResponseArrayItemsInnerExceptionInviteId :: Maybe Text
    <*> arbitraryReducedMaybe n -- deleteInvitesResultsResponseArrayItemsInnerExceptionMessage :: Maybe Text
  
instance Arbitrary DeleteMemberAccessResult where
  arbitrary = sized genDeleteMemberAccessResult

genDeleteMemberAccessResult :: Int -> Gen DeleteMemberAccessResult
genDeleteMemberAccessResult n =
  DeleteMemberAccessResult
    <$> arbitraryReducedMaybe n -- deleteMemberAccessResultAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- deleteMemberAccessResultMemberId :: Maybe Text
  
instance Arbitrary DeleteMemberAccessResultsResponseArray where
  arbitrary = sized genDeleteMemberAccessResultsResponseArray

genDeleteMemberAccessResultsResponseArray :: Int -> Gen DeleteMemberAccessResultsResponseArray
genDeleteMemberAccessResultsResponseArray n =
  DeleteMemberAccessResultsResponseArray
    <$> arbitraryReducedMaybe n -- deleteMemberAccessResultsResponseArrayItems :: Maybe [DeleteMemberAccessResult]
  
instance Arbitrary DeletePartnerAssetAccessBody where
  arbitrary = sized genDeletePartnerAssetAccessBody

genDeletePartnerAssetAccessBody :: Int -> Gen DeletePartnerAssetAccessBody
genDeletePartnerAssetAccessBody n =
  DeletePartnerAssetAccessBody
    <$> arbitraryReduced n -- deletePartnerAssetAccessBodyAccesses :: [DeletePartnerAssetAccessBodyAccessesInner]
  
instance Arbitrary DeletePartnerAssetAccessBodyAccessesInner where
  arbitrary = sized genDeletePartnerAssetAccessBodyAccessesInner

genDeletePartnerAssetAccessBodyAccessesInner :: Int -> Gen DeletePartnerAssetAccessBodyAccessesInner
genDeletePartnerAssetAccessBodyAccessesInner n =
  DeletePartnerAssetAccessBodyAccessesInner
    <$> arbitrary -- deletePartnerAssetAccessBodyAccessesInnerPartnerId :: Text
    <*> arbitrary -- deletePartnerAssetAccessBodyAccessesInnerAssetId :: Text
    <*> arbitraryReducedMaybe n -- deletePartnerAssetAccessBodyAccessesInnerPartnerType :: Maybe E'PartnerType
  
instance Arbitrary DeletePartnerAssetsResult where
  arbitrary = sized genDeletePartnerAssetsResult

genDeletePartnerAssetsResult :: Int -> Gen DeletePartnerAssetsResult
genDeletePartnerAssetsResult n =
  DeletePartnerAssetsResult
    <$> arbitraryReducedMaybe n -- deletePartnerAssetsResultAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- deletePartnerAssetsResultAssetType :: Maybe Text
    <*> arbitraryReducedMaybe n -- deletePartnerAssetsResultPermissions :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- deletePartnerAssetsResultIsSharedPartner :: Maybe Bool
    <*> arbitraryReducedMaybe n -- deletePartnerAssetsResultPartnerId :: Maybe Text
  
instance Arbitrary DeletePartnerAssetsResultsResponseArray where
  arbitrary = sized genDeletePartnerAssetsResultsResponseArray

genDeletePartnerAssetsResultsResponseArray :: Int -> Gen DeletePartnerAssetsResultsResponseArray
genDeletePartnerAssetsResultsResponseArray n =
  DeletePartnerAssetsResultsResponseArray
    <$> arbitraryReducedMaybe n -- deletePartnerAssetsResultsResponseArrayItems :: Maybe [DeletePartnerAssetsResult]
  
instance Arbitrary DeletePartnersRequest where
  arbitrary = sized genDeletePartnersRequest

genDeletePartnersRequest :: Int -> Gen DeletePartnersRequest
genDeletePartnersRequest n =
  DeletePartnersRequest
    <$> arbitrary -- deletePartnersRequestPartnerIds :: [Text]
    <*> arbitraryReducedMaybe n -- deletePartnersRequestPartnerType :: Maybe Text
  
instance Arbitrary DeletePartnersResponse where
  arbitrary = sized genDeletePartnersResponse

genDeletePartnersResponse :: Int -> Gen DeletePartnersResponse
genDeletePartnersResponse n =
  DeletePartnersResponse
    <$> arbitraryReducedMaybe n -- deletePartnersResponseDeletedPartners :: Maybe [Text]
  
instance Arbitrary DeletedMembersResponse where
  arbitrary = sized genDeletedMembersResponse

genDeletedMembersResponse :: Int -> Gen DeletedMembersResponse
genDeletedMembersResponse n =
  DeletedMembersResponse
    <$> arbitraryReducedMaybe n -- deletedMembersResponseDeletedMembers :: Maybe [Text]
  
instance Arbitrary DeliveryMetricsResponse where
  arbitrary = sized genDeliveryMetricsResponse

genDeliveryMetricsResponse :: Int -> Gen DeliveryMetricsResponse
genDeliveryMetricsResponse n =
  DeliveryMetricsResponse
    <$> arbitraryReducedMaybe n -- deliveryMetricsResponseItems :: Maybe [DeliveryMetricsResponseItemsInner]
  
instance Arbitrary DeliveryMetricsResponseItemsInner where
  arbitrary = sized genDeliveryMetricsResponseItemsInner

genDeliveryMetricsResponseItemsInner :: Int -> Gen DeliveryMetricsResponseItemsInner
genDeliveryMetricsResponseItemsInner n =
  DeliveryMetricsResponseItemsInner
    <$> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsInnerName :: Maybe Text
    <*> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsInnerCategory :: Maybe E'Category
    <*> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsInnerDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsInnerDisplayName :: Maybe Text
  
instance Arbitrary DetailedError where
  arbitrary = sized genDetailedError

genDetailedError :: Int -> Gen DetailedError
genDetailedError n =
  DetailedError
    <$> arbitrary -- detailedErrorCode :: Int
    <*> arbitrary -- detailedErrorMessage :: Text
    <*> arbitraryReduced n -- detailedErrorDetails :: A.Value
  
instance Arbitrary Error where
  arbitrary = sized genError

genError :: Int -> Gen Error
genError n =
  Error
    <$> arbitrary -- errorCode :: Int
    <*> arbitrary -- errorMessage :: Text
  
instance Arbitrary Exception where
  arbitrary = sized genException

genException :: Int -> Gen Exception
genException n =
  Exception
    <$> arbitraryReducedMaybe n -- exceptionCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- exceptionMessage :: Maybe Text
  
instance Arbitrary FeedProcessingResultsList200Response where
  arbitrary = sized genFeedProcessingResultsList200Response

genFeedProcessingResultsList200Response :: Int -> Gen FeedProcessingResultsList200Response
genFeedProcessingResultsList200Response n =
  FeedProcessingResultsList200Response
    <$> arbitraryReduced n -- feedProcessingResultsList200ResponseItems :: [CatalogsFeedProcessingResult]
    <*> arbitraryReducedMaybe n -- feedProcessingResultsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary FeedsCreateRequest where
  arbitrary = sized genFeedsCreateRequest

genFeedsCreateRequest :: Int -> Gen FeedsCreateRequest
genFeedsCreateRequest n =
  FeedsCreateRequest
    <$> arbitraryReducedMaybe n -- feedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitrary -- feedsCreateRequestName :: Text
    <*> arbitraryReduced n -- feedsCreateRequestFormat :: CatalogsFormat
    <*> arbitraryReduced n -- feedsCreateRequestDefaultLocale :: CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReducedMaybe n -- feedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitrary -- feedsCreateRequestLocation :: Text
    <*> arbitraryReducedMaybe n -- feedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- feedsCreateRequestCatalogType :: CatalogsType
    <*> arbitraryReduced n -- feedsCreateRequestDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- feedsCreateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- feedsCreateRequestStatus :: Maybe CatalogsStatus
    <*> arbitraryReducedMaybe n -- feedsCreateRequestCatalogId :: Maybe Text
  
instance Arbitrary FeedsList200Response where
  arbitrary = sized genFeedsList200Response

genFeedsList200Response :: Int -> Gen FeedsList200Response
genFeedsList200Response n =
  FeedsList200Response
    <$> arbitraryReduced n -- feedsList200ResponseItems :: [CatalogsFeed]
    <*> arbitraryReducedMaybe n -- feedsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary FeedsUpdateRequest where
  arbitrary = sized genFeedsUpdateRequest

genFeedsUpdateRequest :: Int -> Gen FeedsUpdateRequest
genFeedsUpdateRequest n =
  FeedsUpdateRequest
    <$> arbitraryReducedMaybe n -- feedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestStatus :: Maybe CatalogsStatus
    <*> arbitraryReduced n -- feedsUpdateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestDefaultAvailability :: Maybe ProductAvailabilityType
  
instance Arbitrary FollowUserRequest where
  arbitrary = sized genFollowUserRequest

genFollowUserRequest :: Int -> Gen FollowUserRequest
genFollowUserRequest n =
  FollowUserRequest
    <$> arbitraryReducedMaybe n -- followUserRequestAutoFollow :: Maybe Bool
  
instance Arbitrary FollowersList200Response where
  arbitrary = sized genFollowersList200Response

genFollowersList200Response :: Int -> Gen FollowersList200Response
genFollowersList200Response n =
  FollowersList200Response
    <$> arbitraryReduced n -- followersList200ResponseItems :: [UserSummary]
    <*> arbitraryReducedMaybe n -- followersList200ResponseBookmark :: Maybe Text
  
instance Arbitrary GenderFilter where
  arbitrary = sized genGenderFilter

genGenderFilter :: Int -> Gen GenderFilter
genGenderFilter n =
  GenderFilter
    <$> arbitraryReduced n -- genderFilterGender :: CatalogsProductGroupMultipleGenderCriteria
  
instance Arbitrary GetBusinessAssetsResponse where
  arbitrary = sized genGetBusinessAssetsResponse

genGetBusinessAssetsResponse :: Int -> Gen GetBusinessAssetsResponse
genGetBusinessAssetsResponse n =
  GetBusinessAssetsResponse
    <$> arbitraryReducedMaybe n -- getBusinessAssetsResponseAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- getBusinessAssetsResponseAssetType :: Maybe Text
    <*> arbitraryReducedMaybe n -- getBusinessAssetsResponseAssetGroupInfo :: Maybe AssetGroupBinding
  
instance Arbitrary GetBusinessEmployers200Response where
  arbitrary = sized genGetBusinessEmployers200Response

genGetBusinessEmployers200Response :: Int -> Gen GetBusinessEmployers200Response
genGetBusinessEmployers200Response n =
  GetBusinessEmployers200Response
    <$> arbitraryReduced n -- getBusinessEmployers200ResponseItems :: [UserBusinessRoleBinding]
    <*> arbitraryReducedMaybe n -- getBusinessEmployers200ResponseBookmark :: Maybe Text
  
instance Arbitrary GetBusinessMembers200Response where
  arbitrary = sized genGetBusinessMembers200Response

genGetBusinessMembers200Response :: Int -> Gen GetBusinessMembers200Response
genGetBusinessMembers200Response n =
  GetBusinessMembers200Response
    <$> arbitraryReduced n -- getBusinessMembers200ResponseItems :: [UserBusinessRoleBinding]
    <*> arbitraryReducedMaybe n -- getBusinessMembers200ResponseBookmark :: Maybe Text
  
instance Arbitrary GetBusinessPartners200Response where
  arbitrary = sized genGetBusinessPartners200Response

genGetBusinessPartners200Response :: Int -> Gen GetBusinessPartners200Response
genGetBusinessPartners200Response n =
  GetBusinessPartners200Response
    <$> arbitraryReduced n -- getBusinessPartners200ResponseItems :: [UserBusinessRoleBinding]
    <*> arbitraryReducedMaybe n -- getBusinessPartners200ResponseBookmark :: Maybe Text
  
instance Arbitrary GetInvites200Response where
  arbitrary = sized genGetInvites200Response

genGetInvites200Response :: Int -> Gen GetInvites200Response
genGetInvites200Response n =
  GetInvites200Response
    <$> arbitraryReduced n -- getInvites200ResponseItems :: [InviteResponse]
    <*> arbitraryReducedMaybe n -- getInvites200ResponseBookmark :: Maybe Text
  
instance Arbitrary GetMMMReportResponse where
  arbitrary = sized genGetMMMReportResponse

genGetMMMReportResponse :: Int -> Gen GetMMMReportResponse
genGetMMMReportResponse n =
  GetMMMReportResponse
    <$> arbitraryReducedMaybe n -- getMMMReportResponseCode :: Maybe Double
    <*> arbitraryReducedMaybe n -- getMMMReportResponseData :: Maybe GetMMMReportResponseData
    <*> arbitraryReducedMaybe n -- getMMMReportResponseMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- getMMMReportResponseStatus :: Maybe Text
  
instance Arbitrary GetMMMReportResponseData where
  arbitrary = sized genGetMMMReportResponseData

genGetMMMReportResponseData :: Int -> Gen GetMMMReportResponseData
genGetMMMReportResponseData n =
  GetMMMReportResponseData
    <$> arbitraryReducedMaybe n -- getMMMReportResponseDataReportStatus :: Maybe E'ReportStatus2
    <*> arbitraryReducedMaybe n -- getMMMReportResponseDataUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- getMMMReportResponseDataSize :: Maybe Double
  
instance Arbitrary GetPartnerAssetsResponse where
  arbitrary = sized genGetPartnerAssetsResponse

genGetPartnerAssetsResponse :: Int -> Gen GetPartnerAssetsResponse
genGetPartnerAssetsResponse n =
  GetPartnerAssetsResponse
    <$> arbitraryReducedMaybe n -- getPartnerAssetsResponseAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- getPartnerAssetsResponseAssetType :: Maybe Text
    <*> arbitraryReducedMaybe n -- getPartnerAssetsResponsePermissions :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getPartnerAssetsResponseAssetGroupInfo :: Maybe AssetGroupBinding
  
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
  
instance Arbitrary HotelIdFilter where
  arbitrary = sized genHotelIdFilter

genHotelIdFilter :: Int -> Gen HotelIdFilter
genHotelIdFilter n =
  HotelIdFilter
    <$> arbitraryReduced n -- hotelIdFilterHotelId :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary HotelProcessingRecord where
  arbitrary = sized genHotelProcessingRecord

genHotelProcessingRecord :: Int -> Gen HotelProcessingRecord
genHotelProcessingRecord n =
  HotelProcessingRecord
    <$> arbitraryReducedMaybe n -- hotelProcessingRecordHotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- hotelProcessingRecordErrors :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- hotelProcessingRecordWarnings :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- hotelProcessingRecordStatus :: Maybe ItemProcessingStatus
  
instance Arbitrary ImageDetails where
  arbitrary = sized genImageDetails

genImageDetails :: Int -> Gen ImageDetails
genImageDetails n =
  ImageDetails
    <$> arbitrary -- imageDetailsWidth :: Int
    <*> arbitrary -- imageDetailsHeight :: Int
    <*> arbitrary -- imageDetailsUrl :: Text
  
instance Arbitrary ImageMetadata where
  arbitrary = sized genImageMetadata

genImageMetadata :: Int -> Gen ImageMetadata
genImageMetadata n =
  ImageMetadata
    <$> arbitraryReducedMaybe n -- imageMetadataItemType :: Maybe Text
    <*> arbitraryReducedMaybe n -- imageMetadataTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- imageMetadataDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- imageMetadataLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- imageMetadataImages :: Maybe ImageMetadataImages
  
instance Arbitrary ImageMetadataImages where
  arbitrary = sized genImageMetadataImages

genImageMetadataImages :: Int -> Gen ImageMetadataImages
genImageMetadataImages n =
  ImageMetadataImages
    <$> arbitraryReducedMaybe n -- imageMetadataImages150x150 :: Maybe ImageDetails
    <*> arbitraryReducedMaybe n -- imageMetadataImages400x300 :: Maybe ImageDetails
    <*> arbitraryReducedMaybe n -- imageMetadataImages600x :: Maybe ImageDetails
    <*> arbitraryReducedMaybe n -- imageMetadataImages1200x :: Maybe ImageDetails
  
instance Arbitrary IntegrationLog where
  arbitrary = sized genIntegrationLog

genIntegrationLog :: Int -> Gen IntegrationLog
genIntegrationLog n =
  IntegrationLog
    <$> arbitrary -- integrationLogClientTimestamp :: Int
    <*> arbitrary -- integrationLogEventType :: E'EventType
    <*> arbitrary -- integrationLogLogLevel :: E'LogLevel
    <*> arbitraryReducedMaybe n -- integrationLogExternalBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogFeedProfileId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogAppVersionNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogPlatformVersionNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogError :: Maybe IntegrationLogClientError
    <*> arbitraryReducedMaybe n -- integrationLogRequest :: Maybe IntegrationLogClientRequest
  
instance Arbitrary IntegrationLogClientError where
  arbitrary = sized genIntegrationLogClientError

genIntegrationLogClientError :: Int -> Gen IntegrationLogClientError
genIntegrationLogClientError n =
  IntegrationLogClientError
    <$> arbitraryReducedMaybe n -- integrationLogClientErrorCause :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogClientErrorColumnNumber :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationLogClientErrorFileName :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogClientErrorLineNumber :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationLogClientErrorMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogClientErrorMessageDetail :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogClientErrorName :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogClientErrorNumber :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationLogClientErrorStackTrace :: Maybe Text
  
instance Arbitrary IntegrationLogClientRequest where
  arbitrary = sized genIntegrationLogClientRequest

genIntegrationLogClientRequest :: Int -> Gen IntegrationLogClientRequest
genIntegrationLogClientRequest n =
  IntegrationLogClientRequest
    <$> arbitrary -- integrationLogClientRequestMethod :: E'Method
    <*> arbitrary -- integrationLogClientRequestHost :: Text
    <*> arbitrary -- integrationLogClientRequestPath :: Text
    <*> arbitraryReducedMaybe n -- integrationLogClientRequestRequestHeaders :: Maybe (Map.Map String Text)
    <*> arbitraryReducedMaybe n -- integrationLogClientRequestResponseHeaders :: Maybe (Map.Map String Text)
    <*> arbitraryReducedMaybe n -- integrationLogClientRequestResponseStatusCode :: Maybe Int
  
instance Arbitrary IntegrationLogsInvalidLogResponse where
  arbitrary = sized genIntegrationLogsInvalidLogResponse

genIntegrationLogsInvalidLogResponse :: Int -> Gen IntegrationLogsInvalidLogResponse
genIntegrationLogsInvalidLogResponse n =
  IntegrationLogsInvalidLogResponse
    <$> arbitraryReducedMaybe n -- integrationLogsInvalidLogResponseRejectedLogs :: Maybe [IntegrationLogsInvalidLogResponseRejectedLogsInner]
  
instance Arbitrary IntegrationLogsInvalidLogResponseRejectedLogsInner where
  arbitrary = sized genIntegrationLogsInvalidLogResponseRejectedLogsInner

genIntegrationLogsInvalidLogResponseRejectedLogsInner :: Int -> Gen IntegrationLogsInvalidLogResponseRejectedLogsInner
genIntegrationLogsInvalidLogResponseRejectedLogsInner n =
  IntegrationLogsInvalidLogResponseRejectedLogsInner
    <$> arbitraryReducedMaybe n -- integrationLogsInvalidLogResponseRejectedLogsInnerLogIndex :: Maybe Int
    <*> arbitrary -- integrationLogsInvalidLogResponseRejectedLogsInnerField :: Text
    <*> arbitrary -- integrationLogsInvalidLogResponseRejectedLogsInnerValue :: Text
    <*> arbitrary -- integrationLogsInvalidLogResponseRejectedLogsInnerReason :: Text
  
instance Arbitrary IntegrationLogsRequest where
  arbitrary = sized genIntegrationLogsRequest

genIntegrationLogsRequest :: Int -> Gen IntegrationLogsRequest
genIntegrationLogsRequest n =
  IntegrationLogsRequest
    <$> arbitraryReduced n -- integrationLogsRequestLogs :: [IntegrationLog]
  
instance Arbitrary IntegrationLogsSuccessResponse where
  arbitrary = sized genIntegrationLogsSuccessResponse

genIntegrationLogsSuccessResponse :: Int -> Gen IntegrationLogsSuccessResponse
genIntegrationLogsSuccessResponse n =
  IntegrationLogsSuccessResponse
    <$> arbitraryReducedMaybe n -- integrationLogsSuccessResponseMessage :: Maybe Text
  
instance Arbitrary IntegrationMetadata where
  arbitrary = sized genIntegrationMetadata

genIntegrationMetadata :: Int -> Gen IntegrationMetadata
genIntegrationMetadata n =
  IntegrationMetadata
    <$> arbitraryReducedMaybe n -- integrationMetadataId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataExternalBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataConnectedMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataConnectedUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataConnectedAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataConnectedLbaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataConnectedTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataPartnerAccessTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationMetadataPartnerRefreshTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationMetadataScopes :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreatedTimestamp :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdatedTimestamp :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationMetadataAdditionalId1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataPartnerMetadata :: Maybe Text
  
instance Arbitrary IntegrationRecord where
  arbitrary = sized genIntegrationRecord

genIntegrationRecord :: Int -> Gen IntegrationRecord
genIntegrationRecord n =
  IntegrationRecord
    <$> arbitraryReducedMaybe n -- integrationRecordId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordExternalBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordConnectedMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordConnectedUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordConnectedAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordConnectedLbaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordConnectedTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerPrimaryEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerAccessTokenExpiry :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerRefreshTokenExpiry :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRecordScopes :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerMetadata :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordAdditionalId1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRecordUpdatedTime :: Maybe Int
  
instance Arbitrary IntegrationRequest where
  arbitrary = sized genIntegrationRequest

genIntegrationRequest :: Int -> Gen IntegrationRequest
genIntegrationRequest n =
  IntegrationRequest
    <$> arbitraryReducedMaybe n -- integrationRequestExternalBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestConnectedMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestConnectedAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestConnectedLbaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestConnectedTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerPrimaryEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerAccessTokenExpiry :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerRefreshTokenExpiry :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRequestScopes :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestAdditionalId1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerMetadata :: Maybe Text
  
instance Arbitrary IntegrationRequestPatch where
  arbitrary = sized genIntegrationRequestPatch

genIntegrationRequestPatch :: Int -> Gen IntegrationRequestPatch
genIntegrationRequestPatch n =
  IntegrationRequestPatch
    <$> arbitraryReducedMaybe n -- integrationRequestPatchConnectedMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchConnectedAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchConnectedLbaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchConnectedTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerPrimaryEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerAccessTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerRefreshTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationRequestPatchScopes :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchAdditionalId1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerMetadata :: Maybe Text
  
instance Arbitrary IntegrationsGetList200Response where
  arbitrary = sized genIntegrationsGetList200Response

genIntegrationsGetList200Response :: Int -> Gen IntegrationsGetList200Response
genIntegrationsGetList200Response n =
  IntegrationsGetList200Response
    <$> arbitraryReduced n -- integrationsGetList200ResponseItems :: [IntegrationRecord]
    <*> arbitraryReducedMaybe n -- integrationsGetList200ResponseBookmark :: Maybe Text
  
instance Arbitrary Interest where
  arbitrary = sized genInterest

genInterest :: Int -> Gen Interest
genInterest n =
  Interest
    <$> arbitraryReducedMaybe n -- interestCanonicalUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- interestId :: Maybe Text
    <*> arbitraryReducedMaybe n -- interestKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- interestName :: Maybe Text
  
instance Arbitrary InviteAssetsSummary where
  arbitrary = sized genInviteAssetsSummary

genInviteAssetsSummary :: Int -> Gen InviteAssetsSummary
genInviteAssetsSummary n =
  InviteAssetsSummary
    <$> arbitraryReducedMaybe n -- inviteAssetsSummaryAdAccounts :: Maybe [InviteAssetsSummaryAdAccountsInner]
    <*> arbitraryReducedMaybe n -- inviteAssetsSummaryProfiles :: Maybe [InviteAssetsSummaryProfilesInner]
  
instance Arbitrary InviteAssetsSummaryAdAccountsInner where
  arbitrary = sized genInviteAssetsSummaryAdAccountsInner

genInviteAssetsSummaryAdAccountsInner :: Int -> Gen InviteAssetsSummaryAdAccountsInner
genInviteAssetsSummaryAdAccountsInner n =
  InviteAssetsSummaryAdAccountsInner
    <$> arbitraryReducedMaybe n -- inviteAssetsSummaryAdAccountsInnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteAssetsSummaryAdAccountsInnerPermissions :: Maybe [Text]
  
instance Arbitrary InviteAssetsSummaryProfilesInner where
  arbitrary = sized genInviteAssetsSummaryProfilesInner

genInviteAssetsSummaryProfilesInner :: Int -> Gen InviteAssetsSummaryProfilesInner
genInviteAssetsSummaryProfilesInner n =
  InviteAssetsSummaryProfilesInner
    <$> arbitraryReducedMaybe n -- inviteAssetsSummaryProfilesInnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteAssetsSummaryProfilesInnerPermissions :: Maybe [Text]
  
instance Arbitrary InviteBusinessRoleBinding where
  arbitrary = sized genInviteBusinessRoleBinding

genInviteBusinessRoleBinding :: Int -> Gen InviteBusinessRoleBinding
genInviteBusinessRoleBinding n =
  InviteBusinessRoleBinding
    <$> arbitraryReducedMaybe n -- inviteBusinessRoleBindingCreatedByBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingCreatedByUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingUser :: Maybe BusinessAccessUserSummary
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingInviteData :: Maybe BaseInviteDataResponseInviteData
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingIsReceivedInvite :: Maybe Bool
  
instance Arbitrary InviteExceptionResponse where
  arbitrary = sized genInviteExceptionResponse

genInviteExceptionResponse :: Int -> Gen InviteExceptionResponse
genInviteExceptionResponse n =
  InviteExceptionResponse
    <$> arbitraryReducedMaybe n -- inviteExceptionResponseInviteOrRequestId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteExceptionResponseCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- inviteExceptionResponseMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteExceptionResponseUsersOrPartnerIds :: Maybe [Text]
  
instance Arbitrary InviteResponse where
  arbitrary = sized genInviteResponse

genInviteResponse :: Int -> Gen InviteResponse
genInviteResponse n =
  InviteResponse
    <$> arbitraryReducedMaybe n -- inviteResponseAssetsSummary :: Maybe InviteAssetsSummary
    <*> arbitraryReducedMaybe n -- inviteResponseBusinessRoles :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- inviteResponseCreatedByBusiness :: Maybe BusinessAccessUserSummary
    <*> arbitraryReducedMaybe n -- inviteResponseCreatedByUser :: Maybe BusinessAccessUserSummary
    <*> arbitraryReducedMaybe n -- inviteResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- inviteResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteResponseInviteData :: Maybe BaseInviteDataResponseInviteData
    <*> arbitraryReducedMaybe n -- inviteResponseIsReceivedInvite :: Maybe Bool
    <*> arbitraryReducedMaybe n -- inviteResponseUser :: Maybe BusinessAccessUserSummary
  
instance Arbitrary ItemAttributes where
  arbitrary = sized genItemAttributes

genItemAttributes :: Int -> Gen ItemAttributes
genItemAttributes n =
  ItemAttributes
    <$> arbitraryReducedMaybe n -- itemAttributesAdLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdult :: Maybe Bool
    <*> arbitraryReducedMaybe n -- itemAttributesAgeGroup :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAvailability :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAverageReviewRating :: Maybe Double
    <*> arbitraryReducedMaybe n -- itemAttributesBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesCheckoutEnabled :: Maybe Bool
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
    <*> arbitraryReducedMaybe n -- itemAttributesVariantNames :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesVariantValues :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesAdditionalImageLink :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesImageLink :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesVideoLink :: Maybe Text
  
instance Arbitrary ItemAttributesRequest where
  arbitrary = sized genItemAttributesRequest

genItemAttributesRequest :: Int -> Gen ItemAttributesRequest
genItemAttributesRequest n =
  ItemAttributesRequest
    <$> arbitraryReducedMaybe n -- itemAttributesRequestAdLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdult :: Maybe Bool
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAgeGroup :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAvailability :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAverageReviewRating :: Maybe Double
    <*> arbitraryReducedMaybe n -- itemAttributesRequestBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCheckoutEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- itemAttributesRequestColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCondition :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCustomLabel0 :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCustomLabel1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCustomLabel2 :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCustomLabel3 :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCustomLabel4 :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestFreeShippingLabel :: Maybe Bool
    <*> arbitraryReducedMaybe n -- itemAttributesRequestFreeShippingLimit :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestGender :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestGoogleProductCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestGtin :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesRequestId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestItemGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestLastUpdatedTime :: Maybe Integer
    <*> arbitraryReducedMaybe n -- itemAttributesRequestLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestMaterial :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestMinAdPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestMobileLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestMpn :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestNumberOfRatings :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesRequestNumberOfReviews :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesRequestPattern :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestProductType :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestSalePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestShipping :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestShippingHeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestShippingWeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestShippingWidth :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestSize :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestSizeSystem :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestSizeType :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestTax :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestVariantNames :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesRequestVariantValues :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdditionalImageLink :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesRequestImageLink :: Maybe ItemAttributesRequestAllOfImageLink
    <*> arbitraryReducedMaybe n -- itemAttributesRequestVideoLink :: Maybe Text
  
instance Arbitrary ItemAttributesRequestAllOfImageLink where
  arbitrary = sized genItemAttributesRequestAllOfImageLink

genItemAttributesRequestAllOfImageLink :: Int -> Gen ItemAttributesRequestAllOfImageLink
genItemAttributesRequestAllOfImageLink n =
  
  pure ItemAttributesRequestAllOfImageLink
   
instance Arbitrary ItemBatchRecord where
  arbitrary = sized genItemBatchRecord

genItemBatchRecord :: Int -> Gen ItemBatchRecord
genItemBatchRecord n =
  ItemBatchRecord
    <$> arbitraryReducedMaybe n -- itemBatchRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemBatchRecordAttributes :: Maybe ItemAttributesRequest
    <*> arbitraryReducedMaybe n -- itemBatchRecordUpdateMask :: Maybe [UpdateMaskFieldType]
  
instance Arbitrary ItemCreateBatchRecord where
  arbitrary = sized genItemCreateBatchRecord

genItemCreateBatchRecord :: Int -> Gen ItemCreateBatchRecord
genItemCreateBatchRecord n =
  ItemCreateBatchRecord
    <$> arbitraryReducedMaybe n -- itemCreateBatchRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemCreateBatchRecordAttributes :: Maybe ItemAttributesRequest
  
instance Arbitrary ItemDeleteBatchRecord where
  arbitrary = sized genItemDeleteBatchRecord

genItemDeleteBatchRecord :: Int -> Gen ItemDeleteBatchRecord
genItemDeleteBatchRecord n =
  ItemDeleteBatchRecord
    <$> arbitraryReducedMaybe n -- itemDeleteBatchRecordItemId :: Maybe Text
  
instance Arbitrary ItemDeleteDiscontinuedBatchRecord where
  arbitrary = sized genItemDeleteDiscontinuedBatchRecord

genItemDeleteDiscontinuedBatchRecord :: Int -> Gen ItemDeleteDiscontinuedBatchRecord
genItemDeleteDiscontinuedBatchRecord n =
  ItemDeleteDiscontinuedBatchRecord
    <$> arbitraryReducedMaybe n -- itemDeleteDiscontinuedBatchRecordItemId :: Maybe Text
  
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
    <$> arbitraryReduced n -- itemIdFilterItemId :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary ItemProcessingRecord where
  arbitrary = sized genItemProcessingRecord

genItemProcessingRecord :: Int -> Gen ItemProcessingRecord
genItemProcessingRecord n =
  ItemProcessingRecord
    <$> arbitraryReducedMaybe n -- itemProcessingRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemProcessingRecordErrors :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- itemProcessingRecordWarnings :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- itemProcessingRecordStatus :: Maybe ItemProcessingStatus
  
instance Arbitrary ItemResponse where
  arbitrary = sized genItemResponse

genItemResponse :: Int -> Gen ItemResponse
genItemResponse n =
  ItemResponse
    <$> arbitraryReduced n -- itemResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- itemResponseItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponsePins :: Maybe [Pin]
    <*> arbitraryReducedMaybe n -- itemResponseAttributes :: Maybe CatalogsCreativeAssetsAttributes
    <*> arbitraryReducedMaybe n -- itemResponseHotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseCreativeAssetsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseErrors :: Maybe [ItemValidationEvent]
  
instance Arbitrary ItemResponseAnyOf where
  arbitrary = sized genItemResponseAnyOf

genItemResponseAnyOf :: Int -> Gen ItemResponseAnyOf
genItemResponseAnyOf n =
  ItemResponseAnyOf
    <$> arbitraryReduced n -- itemResponseAnyOfCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- itemResponseAnyOfItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseAnyOfPins :: Maybe [Pin]
    <*> arbitraryReducedMaybe n -- itemResponseAnyOfAttributes :: Maybe CatalogsCreativeAssetsAttributes
    <*> arbitraryReducedMaybe n -- itemResponseAnyOfHotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseAnyOfCreativeAssetsId :: Maybe Text
  
instance Arbitrary ItemResponseAnyOf1 where
  arbitrary = sized genItemResponseAnyOf1

genItemResponseAnyOf1 :: Int -> Gen ItemResponseAnyOf1
genItemResponseAnyOf1 n =
  ItemResponseAnyOf1
    <$> arbitraryReduced n -- itemResponseAnyOf1CatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- itemResponseAnyOf1ItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseAnyOf1Errors :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- itemResponseAnyOf1HotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseAnyOf1CreativeAssetsId :: Maybe Text
  
instance Arbitrary ItemUpdateBatchRecord where
  arbitrary = sized genItemUpdateBatchRecord

genItemUpdateBatchRecord :: Int -> Gen ItemUpdateBatchRecord
genItemUpdateBatchRecord n =
  ItemUpdateBatchRecord
    <$> arbitraryReducedMaybe n -- itemUpdateBatchRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemUpdateBatchRecordAttributes :: Maybe UpdatableItemAttributes
    <*> arbitraryReducedMaybe n -- itemUpdateBatchRecordUpdateMask :: Maybe [UpdateMaskFieldType]
  
instance Arbitrary ItemUpsertBatchRecord where
  arbitrary = sized genItemUpsertBatchRecord

genItemUpsertBatchRecord :: Int -> Gen ItemUpsertBatchRecord
genItemUpsertBatchRecord n =
  ItemUpsertBatchRecord
    <$> arbitraryReducedMaybe n -- itemUpsertBatchRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemUpsertBatchRecordAttributes :: Maybe ItemAttributesRequest
  
instance Arbitrary ItemValidationEvent where
  arbitrary = sized genItemValidationEvent

genItemValidationEvent :: Int -> Gen ItemValidationEvent
genItemValidationEvent n =
  ItemValidationEvent
    <$> arbitraryReducedMaybe n -- itemValidationEventAttribute :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemValidationEventCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemValidationEventMessage :: Maybe Text
  
instance Arbitrary ItemsBatchPostRequest where
  arbitrary = sized genItemsBatchPostRequest

genItemsBatchPostRequest :: Int -> Gen ItemsBatchPostRequest
genItemsBatchPostRequest n =
  ItemsBatchPostRequest
    <$> arbitrary -- itemsBatchPostRequestCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- itemsBatchPostRequestCountry :: Country
    <*> arbitraryReduced n -- itemsBatchPostRequestLanguage :: CatalogsItemsRequestLanguage
    <*> arbitraryReduced n -- itemsBatchPostRequestItems :: [ItemDeleteBatchRecord]
    <*> arbitraryReducedMaybe n -- itemsBatchPostRequestCatalogId :: Maybe Text
    <*> arbitraryReduced n -- itemsBatchPostRequestOperation :: BatchOperation
  
instance Arbitrary ItemsIssuesList200Response where
  arbitrary = sized genItemsIssuesList200Response

genItemsIssuesList200Response :: Int -> Gen ItemsIssuesList200Response
genItemsIssuesList200Response n =
  ItemsIssuesList200Response
    <$> arbitraryReduced n -- itemsIssuesList200ResponseItems :: [CatalogsItemValidationIssues]
    <*> arbitraryReducedMaybe n -- itemsIssuesList200ResponseBookmark :: Maybe Text
  
instance Arbitrary Keyword where
  arbitrary = sized genKeyword

genKeyword :: Int -> Gen Keyword
genKeyword n =
  Keyword
    <$> arbitraryReducedMaybe n -- keywordBid :: Maybe Int
    <*> arbitraryReduced n -- keywordMatchType :: MatchTypeResponse
    <*> arbitrary -- keywordValue :: Text
    <*> arbitraryReducedMaybe n -- keywordArchived :: Maybe Bool
    <*> arbitraryReducedMaybe n -- keywordId :: Maybe Text
    <*> arbitraryReducedMaybe n -- keywordParentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- keywordParentType :: Maybe Text
    <*> arbitraryReducedMaybe n -- keywordType :: Maybe Text
  
instance Arbitrary KeywordError where
  arbitrary = sized genKeywordError

genKeywordError :: Int -> Gen KeywordError
genKeywordError n =
  KeywordError
    <$> arbitraryReducedMaybe n -- keywordErrorData :: Maybe Keyword
    <*> arbitraryReducedMaybe n -- keywordErrorErrorMessages :: Maybe [Text]
  
instance Arbitrary KeywordMetrics where
  arbitrary = sized genKeywordMetrics

genKeywordMetrics :: Int -> Gen KeywordMetrics
genKeywordMetrics n =
  KeywordMetrics
    <$> arbitraryReducedMaybe n -- keywordMetricsAvgCpcInMicroCurrency :: Maybe Double
    <*> arbitraryReducedMaybe n -- keywordMetricsKeywordQueryVolume :: Maybe Text
  
instance Arbitrary KeywordMetricsResponse where
  arbitrary = sized genKeywordMetricsResponse

genKeywordMetricsResponse :: Int -> Gen KeywordMetricsResponse
genKeywordMetricsResponse n =
  KeywordMetricsResponse
    <$> arbitraryReducedMaybe n -- keywordMetricsResponseKeyword :: Maybe Text
    <*> arbitraryReducedMaybe n -- keywordMetricsResponseMetrics :: Maybe KeywordMetrics
  
instance Arbitrary KeywordUpdate where
  arbitrary = sized genKeywordUpdate

genKeywordUpdate :: Int -> Gen KeywordUpdate
genKeywordUpdate n =
  KeywordUpdate
    <$> arbitrary -- keywordUpdateId :: Text
    <*> arbitraryReducedMaybe n -- keywordUpdateArchived :: Maybe Bool
    <*> arbitraryReducedMaybe n -- keywordUpdateBid :: Maybe Int
  
instance Arbitrary KeywordUpdateBody where
  arbitrary = sized genKeywordUpdateBody

genKeywordUpdateBody :: Int -> Gen KeywordUpdateBody
genKeywordUpdateBody n =
  KeywordUpdateBody
    <$> arbitraryReduced n -- keywordUpdateBodyKeywords :: [KeywordUpdate]
  
instance Arbitrary KeywordsCommon where
  arbitrary = sized genKeywordsCommon

genKeywordsCommon :: Int -> Gen KeywordsCommon
genKeywordsCommon n =
  KeywordsCommon
    <$> arbitraryReducedMaybe n -- keywordsCommonBid :: Maybe Int
    <*> arbitraryReduced n -- keywordsCommonMatchType :: MatchTypeResponse
    <*> arbitrary -- keywordsCommonValue :: Text
  
instance Arbitrary KeywordsGet200Response where
  arbitrary = sized genKeywordsGet200Response

genKeywordsGet200Response :: Int -> Gen KeywordsGet200Response
genKeywordsGet200Response n =
  KeywordsGet200Response
    <$> arbitraryReduced n -- keywordsGet200ResponseItems :: [Keyword]
    <*> arbitraryReducedMaybe n -- keywordsGet200ResponseBookmark :: Maybe Text
  
instance Arbitrary KeywordsMetricsArrayResponse where
  arbitrary = sized genKeywordsMetricsArrayResponse

genKeywordsMetricsArrayResponse :: Int -> Gen KeywordsMetricsArrayResponse
genKeywordsMetricsArrayResponse n =
  KeywordsMetricsArrayResponse
    <$> arbitraryReducedMaybe n -- keywordsMetricsArrayResponseData :: Maybe [KeywordMetricsResponse]
  
instance Arbitrary KeywordsRequest where
  arbitrary = sized genKeywordsRequest

genKeywordsRequest :: Int -> Gen KeywordsRequest
genKeywordsRequest n =
  KeywordsRequest
    <$> arbitraryReduced n -- keywordsRequestKeywords :: [KeywordsCommon]
    <*> arbitrary -- keywordsRequestParentId :: Text
  
instance Arbitrary KeywordsResponse where
  arbitrary = sized genKeywordsResponse

genKeywordsResponse :: Int -> Gen KeywordsResponse
genKeywordsResponse n =
  KeywordsResponse
    <$> arbitraryReducedMaybe n -- keywordsResponseErrors :: Maybe [KeywordError]
    <*> arbitraryReducedMaybe n -- keywordsResponseKeywords :: Maybe [Keyword]
  
instance Arbitrary LeadFormArrayResponse where
  arbitrary = sized genLeadFormArrayResponse

genLeadFormArrayResponse :: Int -> Gen LeadFormArrayResponse
genLeadFormArrayResponse n =
  LeadFormArrayResponse
    <$> arbitraryReducedMaybe n -- leadFormArrayResponseItems :: Maybe [LeadFormArrayResponseItemsInner]
  
instance Arbitrary LeadFormArrayResponseItemsInner where
  arbitrary = sized genLeadFormArrayResponseItemsInner

genLeadFormArrayResponseItemsInner :: Int -> Gen LeadFormArrayResponseItemsInner
genLeadFormArrayResponseItemsInner n =
  LeadFormArrayResponseItemsInner
    <$> arbitraryReducedMaybe n -- leadFormArrayResponseItemsInnerData :: Maybe LeadFormResponse
    <*> arbitraryReducedMaybe n -- leadFormArrayResponseItemsInnerExceptions :: Maybe [Exception]
  
instance Arbitrary LeadFormCommon where
  arbitrary = sized genLeadFormCommon

genLeadFormCommon :: Int -> Gen LeadFormCommon
genLeadFormCommon n =
  LeadFormCommon
    <$> arbitraryReducedMaybe n -- leadFormCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCommonPrivacyPolicyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCommonHasAcceptedTerms :: Maybe Bool
    <*> arbitraryReducedMaybe n -- leadFormCommonCompletionMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCommonStatus :: Maybe LeadFormStatus
    <*> arbitraryReducedMaybe n -- leadFormCommonDisclosureLanguage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCommonQuestions :: Maybe [LeadFormQuestion]
    <*> arbitraryReducedMaybe n -- leadFormCommonPolicyLinks :: Maybe [LeadFormCommonPolicyLinksInner]
  
instance Arbitrary LeadFormCommonPolicyLinksInner where
  arbitrary = sized genLeadFormCommonPolicyLinksInner

genLeadFormCommonPolicyLinksInner :: Int -> Gen LeadFormCommonPolicyLinksInner
genLeadFormCommonPolicyLinksInner n =
  LeadFormCommonPolicyLinksInner
    <$> arbitraryReducedMaybe n -- leadFormCommonPolicyLinksInnerLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCommonPolicyLinksInnerLink :: Maybe Text
  
instance Arbitrary LeadFormCreateRequest where
  arbitrary = sized genLeadFormCreateRequest

genLeadFormCreateRequest :: Int -> Gen LeadFormCreateRequest
genLeadFormCreateRequest n =
  LeadFormCreateRequest
    <$> arbitrary -- leadFormCreateRequestName :: Text
    <*> arbitrary -- leadFormCreateRequestPrivacyPolicyLink :: Text
    <*> arbitrary -- leadFormCreateRequestHasAcceptedTerms :: Bool
    <*> arbitrary -- leadFormCreateRequestCompletionMessage :: Text
    <*> arbitraryReducedMaybe n -- leadFormCreateRequestStatus :: Maybe LeadFormStatus
    <*> arbitraryReducedMaybe n -- leadFormCreateRequestDisclosureLanguage :: Maybe Text
    <*> arbitraryReduced n -- leadFormCreateRequestQuestions :: [LeadFormQuestion]
    <*> arbitraryReducedMaybe n -- leadFormCreateRequestPolicyLinks :: Maybe [LeadFormCommonPolicyLinksInner]
  
instance Arbitrary LeadFormQuestion where
  arbitrary = sized genLeadFormQuestion

genLeadFormQuestion :: Int -> Gen LeadFormQuestion
genLeadFormQuestion n =
  LeadFormQuestion
    <$> arbitraryReducedMaybe n -- leadFormQuestionQuestionType :: Maybe LeadFormQuestionType
    <*> arbitraryReducedMaybe n -- leadFormQuestionCustomQuestionFieldType :: Maybe LeadFormQuestionFieldType
    <*> arbitraryReducedMaybe n -- leadFormQuestionCustomQuestionLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormQuestionCustomQuestionOptions :: Maybe [Text]
  
instance Arbitrary LeadFormResponse where
  arbitrary = sized genLeadFormResponse

genLeadFormResponse :: Int -> Gen LeadFormResponse
genLeadFormResponse n =
  LeadFormResponse
    <$> arbitraryReducedMaybe n -- leadFormResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormResponsePrivacyPolicyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormResponseHasAcceptedTerms :: Maybe Bool
    <*> arbitraryReducedMaybe n -- leadFormResponseCompletionMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormResponseStatus :: Maybe LeadFormStatus
    <*> arbitraryReducedMaybe n -- leadFormResponseDisclosureLanguage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormResponseQuestions :: Maybe [LeadFormQuestion]
    <*> arbitraryReducedMaybe n -- leadFormResponsePolicyLinks :: Maybe [LeadFormCommonPolicyLinksInner]
    <*> arbitraryReducedMaybe n -- leadFormResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- leadFormResponseUpdatedTime :: Maybe Int
  
instance Arbitrary LeadFormTestRequest where
  arbitrary = sized genLeadFormTestRequest

genLeadFormTestRequest :: Int -> Gen LeadFormTestRequest
genLeadFormTestRequest n =
  LeadFormTestRequest
    <$> arbitrary -- leadFormTestRequestAnswers :: [Text]
  
instance Arbitrary LeadFormTestResponse where
  arbitrary = sized genLeadFormTestResponse

genLeadFormTestResponse :: Int -> Gen LeadFormTestResponse
genLeadFormTestResponse n =
  LeadFormTestResponse
    <$> arbitraryReducedMaybe n -- leadFormTestResponseSubscriptionId :: Maybe Text
  
instance Arbitrary LeadFormUpdateRequest where
  arbitrary = sized genLeadFormUpdateRequest

genLeadFormUpdateRequest :: Int -> Gen LeadFormUpdateRequest
genLeadFormUpdateRequest n =
  LeadFormUpdateRequest
    <$> arbitraryReducedMaybe n -- leadFormUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestPrivacyPolicyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestHasAcceptedTerms :: Maybe Bool
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestCompletionMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestStatus :: Maybe LeadFormStatus
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestDisclosureLanguage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestQuestions :: Maybe [LeadFormQuestion]
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestPolicyLinks :: Maybe [LeadFormCommonPolicyLinksInner]
    <*> arbitrary -- leadFormUpdateRequestId :: Text
  
instance Arbitrary LeadFormsList200Response where
  arbitrary = sized genLeadFormsList200Response

genLeadFormsList200Response :: Int -> Gen LeadFormsList200Response
genLeadFormsList200Response n =
  LeadFormsList200Response
    <$> arbitraryReduced n -- leadFormsList200ResponseItems :: [LeadFormResponse]
    <*> arbitraryReducedMaybe n -- leadFormsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary LeadsExportCreateRequest where
  arbitrary = sized genLeadsExportCreateRequest

genLeadsExportCreateRequest :: Int -> Gen LeadsExportCreateRequest
genLeadsExportCreateRequest n =
  LeadsExportCreateRequest
    <$> arbitrary -- leadsExportCreateRequestStartDate :: Text
    <*> arbitrary -- leadsExportCreateRequestEndDate :: Text
    <*> arbitrary -- leadsExportCreateRequestAdId :: Text
  
instance Arbitrary LeadsExportCreateResponse where
  arbitrary = sized genLeadsExportCreateResponse

genLeadsExportCreateResponse :: Int -> Gen LeadsExportCreateResponse
genLeadsExportCreateResponse n =
  LeadsExportCreateResponse
    <$> arbitraryReducedMaybe n -- leadsExportCreateResponseLeadsExportId :: Maybe Text
  
instance Arbitrary LeadsExportResponseData where
  arbitrary = sized genLeadsExportResponseData

genLeadsExportResponseData :: Int -> Gen LeadsExportResponseData
genLeadsExportResponseData n =
  LeadsExportResponseData
    <$> arbitraryReducedMaybe n -- leadsExportResponseDataExportStatus :: Maybe LeadsExportStatus
    <*> arbitraryReducedMaybe n -- leadsExportResponseDataDownloadUrl :: Maybe Text
  
instance Arbitrary LineItem where
  arbitrary = sized genLineItem

genLineItem :: Int -> Gen LineItem
genLineItem n =
  LineItem
    <$> arbitraryReducedMaybe n -- lineItemProductBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- lineItemProductCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- lineItemProductId :: Maybe Int
    <*> arbitraryReducedMaybe n -- lineItemProductName :: Maybe Text
    <*> arbitraryReducedMaybe n -- lineItemProductPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- lineItemProductQuantity :: Maybe Int
    <*> arbitraryReducedMaybe n -- lineItemProductVariant :: Maybe Text
    <*> arbitraryReducedMaybe n -- lineItemProductVariantId :: Maybe Text
  
instance Arbitrary LinkedBusiness where
  arbitrary = sized genLinkedBusiness

genLinkedBusiness :: Int -> Gen LinkedBusiness
genLinkedBusiness n =
  LinkedBusiness
    <$> arbitraryReducedMaybe n -- linkedBusinessUsername :: Maybe Text
    <*> arbitraryReducedMaybe n -- linkedBusinessImageSmallUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- linkedBusinessImageMediumUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- linkedBusinessImageLargeUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- linkedBusinessImageXlargeUrl :: Maybe Text
  
instance Arbitrary MaxPriceFilter where
  arbitrary = sized genMaxPriceFilter

genMaxPriceFilter :: Int -> Gen MaxPriceFilter
genMaxPriceFilter n =
  MaxPriceFilter
    <$> arbitraryReduced n -- maxPriceFilterMaxPrice :: CatalogsProductGroupPricingCriteria
  
instance Arbitrary MediaList200Response where
  arbitrary = sized genMediaList200Response

genMediaList200Response :: Int -> Gen MediaList200Response
genMediaList200Response n =
  MediaList200Response
    <$> arbitraryReduced n -- mediaList200ResponseItems :: [MediaUploadDetails]
    <*> arbitraryReducedMaybe n -- mediaList200ResponseBookmark :: Maybe Text
  
instance Arbitrary MediaTypeFilter where
  arbitrary = sized genMediaTypeFilter

genMediaTypeFilter :: Int -> Gen MediaTypeFilter
genMediaTypeFilter n =
  MediaTypeFilter
    <$> arbitraryReduced n -- mediaTypeFilterMediaType :: CatalogsProductGroupMultipleMediaTypesCriteria
  
instance Arbitrary MediaUpload where
  arbitrary = sized genMediaUpload

genMediaUpload :: Int -> Gen MediaUpload
genMediaUpload n =
  MediaUpload
    <$> arbitraryReducedMaybe n -- mediaUploadMediaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadMediaType :: Maybe MediaUploadType
    <*> arbitraryReducedMaybe n -- mediaUploadUploadUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadUploadParameters :: Maybe MediaUploadAllOfUploadParameters
  
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
  
instance Arbitrary MembersToDeleteBody where
  arbitrary = sized genMembersToDeleteBody

genMembersToDeleteBody :: Int -> Gen MembersToDeleteBody
genMembersToDeleteBody n =
  MembersToDeleteBody
    <$> arbitraryReduced n -- membersToDeleteBodyMembers :: [MembersToDeleteBodyMembersInner]
  
instance Arbitrary MembersToDeleteBodyMembersInner where
  arbitrary = sized genMembersToDeleteBodyMembersInner

genMembersToDeleteBodyMembersInner :: Int -> Gen MembersToDeleteBodyMembersInner
genMembersToDeleteBodyMembersInner n =
  MembersToDeleteBodyMembersInner
    <$> arbitrary -- membersToDeleteBodyMembersInnerMemberId :: Text
    <*> arbitraryReduced n -- membersToDeleteBodyMembersInnerBusinessRole :: BusinessRoleForMembers
  
instance Arbitrary MetricsResponse where
  arbitrary = sized genMetricsResponse

genMetricsResponse :: Int -> Gen MetricsResponse
genMetricsResponse n =
  MetricsResponse
    <$> arbitraryReducedMaybe n -- metricsResponseData :: Maybe [A.Value]
  
instance Arbitrary MinPriceFilter where
  arbitrary = sized genMinPriceFilter

genMinPriceFilter :: Int -> Gen MinPriceFilter
genMinPriceFilter n =
  MinPriceFilter
    <$> arbitraryReduced n -- minPriceFilterMinPrice :: CatalogsProductGroupPricingCriteria
  
instance Arbitrary MultipleProductGroupsInner where
  arbitrary = sized genMultipleProductGroupsInner

genMultipleProductGroupsInner :: Int -> Gen MultipleProductGroupsInner
genMultipleProductGroupsInner n =
  MultipleProductGroupsInner
    <$> arbitrary -- multipleProductGroupsInnerName :: Text
    <*> arbitraryReducedMaybe n -- multipleProductGroupsInnerDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- multipleProductGroupsInnerIsFeatured :: Maybe Bool
    <*> arbitraryReduced n -- multipleProductGroupsInnerFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitrary -- multipleProductGroupsInnerFeedId :: Text
    <*> arbitrary -- multipleProductGroupsInnerCatalogType :: E'CatalogType3
    <*> arbitrary -- multipleProductGroupsInnerCatalogId :: Text
    <*> arbitraryReduced n -- multipleProductGroupsInnerCountry :: Country
    <*> arbitraryReduced n -- multipleProductGroupsInnerLocale :: CatalogsLocale
  
instance Arbitrary OauthAccessTokenRequestClientCredentials where
  arbitrary = sized genOauthAccessTokenRequestClientCredentials

genOauthAccessTokenRequestClientCredentials :: Int -> Gen OauthAccessTokenRequestClientCredentials
genOauthAccessTokenRequestClientCredentials n =
  OauthAccessTokenRequestClientCredentials
    <$> arbitrary -- oauthAccessTokenRequestClientCredentialsGrantType :: E'GrantType
    <*> arbitrary -- oauthAccessTokenRequestClientCredentialsScope :: Text
  
instance Arbitrary OauthAccessTokenRequestCode where
  arbitrary = sized genOauthAccessTokenRequestCode

genOauthAccessTokenRequestCode :: Int -> Gen OauthAccessTokenRequestCode
genOauthAccessTokenRequestCode n =
  OauthAccessTokenRequestCode
    <$> arbitrary -- oauthAccessTokenRequestCodeGrantType :: E'GrantType
    <*> arbitrary -- oauthAccessTokenRequestCodeCode :: Text
    <*> arbitrary -- oauthAccessTokenRequestCodeRedirectUri :: Text
  
instance Arbitrary OauthAccessTokenRequestRefresh where
  arbitrary = sized genOauthAccessTokenRequestRefresh

genOauthAccessTokenRequestRefresh :: Int -> Gen OauthAccessTokenRequestRefresh
genOauthAccessTokenRequestRefresh n =
  OauthAccessTokenRequestRefresh
    <$> arbitrary -- oauthAccessTokenRequestRefreshGrantType :: E'GrantType
    <*> arbitrary -- oauthAccessTokenRequestRefreshRefreshToken :: Text
    <*> arbitraryReducedMaybe n -- oauthAccessTokenRequestRefreshScope :: Maybe Text
    <*> arbitraryReducedMaybe n -- oauthAccessTokenRequestRefreshRefreshOn :: Maybe Bool
  
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
  
instance Arbitrary OauthAccessTokenResponseClientCredentials where
  arbitrary = sized genOauthAccessTokenResponseClientCredentials

genOauthAccessTokenResponseClientCredentials :: Int -> Gen OauthAccessTokenResponseClientCredentials
genOauthAccessTokenResponseClientCredentials n =
  OauthAccessTokenResponseClientCredentials
    <$> arbitraryReducedMaybe n -- oauthAccessTokenResponseClientCredentialsResponseType :: Maybe E'GrantType
    <*> arbitrary -- oauthAccessTokenResponseClientCredentialsAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseClientCredentialsTokenType :: Text
    <*> arbitrary -- oauthAccessTokenResponseClientCredentialsExpiresIn :: Int
    <*> arbitrary -- oauthAccessTokenResponseClientCredentialsScope :: Text
  
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
  
instance Arbitrary OauthAccessTokenResponseEverlastingRefresh where
  arbitrary = sized genOauthAccessTokenResponseEverlastingRefresh

genOauthAccessTokenResponseEverlastingRefresh :: Int -> Gen OauthAccessTokenResponseEverlastingRefresh
genOauthAccessTokenResponseEverlastingRefresh n =
  OauthAccessTokenResponseEverlastingRefresh
    <$> arbitraryReducedMaybe n -- oauthAccessTokenResponseEverlastingRefreshResponseType :: Maybe E'GrantType
    <*> arbitrary -- oauthAccessTokenResponseEverlastingRefreshAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseEverlastingRefreshTokenType :: Text
    <*> arbitrary -- oauthAccessTokenResponseEverlastingRefreshExpiresIn :: Int
    <*> arbitrary -- oauthAccessTokenResponseEverlastingRefreshScope :: Text
    <*> arbitrary -- oauthAccessTokenResponseEverlastingRefreshRefreshToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseEverlastingRefreshRefreshTokenExpiresIn :: Int
    <*> arbitrary -- oauthAccessTokenResponseEverlastingRefreshRefreshTokenExpiresAt :: Int
  
instance Arbitrary OauthAccessTokenResponseIntegrationRefresh where
  arbitrary = sized genOauthAccessTokenResponseIntegrationRefresh

genOauthAccessTokenResponseIntegrationRefresh :: Int -> Gen OauthAccessTokenResponseIntegrationRefresh
genOauthAccessTokenResponseIntegrationRefresh n =
  OauthAccessTokenResponseIntegrationRefresh
    <$> arbitraryReducedMaybe n -- oauthAccessTokenResponseIntegrationRefreshResponseType :: Maybe E'GrantType
    <*> arbitrary -- oauthAccessTokenResponseIntegrationRefreshAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseIntegrationRefreshTokenType :: Text
    <*> arbitrary -- oauthAccessTokenResponseIntegrationRefreshExpiresIn :: Int
    <*> arbitrary -- oauthAccessTokenResponseIntegrationRefreshScope :: Text
    <*> arbitrary -- oauthAccessTokenResponseIntegrationRefreshRefreshToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseIntegrationRefreshRefreshTokenExpiresIn :: Int
  
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
  
instance Arbitrary OptimizationGoalMetadata where
  arbitrary = sized genOptimizationGoalMetadata

genOptimizationGoalMetadata :: Int -> Gen OptimizationGoalMetadata
genOptimizationGoalMetadata n =
  OptimizationGoalMetadata
    <$> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadata :: Maybe OptimizationGoalMetadataConversionTagV3GoalMetadata
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataFrequencyGoalMetadata :: Maybe OptimizationGoalMetadataFrequencyGoalMetadata
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataScrollupGoalMetadata :: Maybe OptimizationGoalMetadataScrollupGoalMetadata
  
instance Arbitrary OptimizationGoalMetadataConversionTagV3GoalMetadata where
  arbitrary = sized genOptimizationGoalMetadataConversionTagV3GoalMetadata

genOptimizationGoalMetadataConversionTagV3GoalMetadata :: Int -> Gen OptimizationGoalMetadataConversionTagV3GoalMetadata
genOptimizationGoalMetadataConversionTagV3GoalMetadata n =
  OptimizationGoalMetadataConversionTagV3GoalMetadata
    <$> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows :: Maybe OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadataConversionEvent :: Maybe E'ConversionEvent
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadataConversionTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadataCpaGoalValueInMicroCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadataIsRoasOptimized :: Maybe Bool
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadataLearningModeType :: Maybe E'ConversionLearningModeType
  
instance Arbitrary OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows where
  arbitrary = sized genOptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows

genOptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows :: Int -> Gen OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
genOptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows n =
  OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
    <$> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsClickWindowDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsEngagementWindowDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsViewWindowDays :: Maybe Int
  
instance Arbitrary OptimizationGoalMetadataFrequencyGoalMetadata where
  arbitrary = sized genOptimizationGoalMetadataFrequencyGoalMetadata

genOptimizationGoalMetadataFrequencyGoalMetadata :: Int -> Gen OptimizationGoalMetadataFrequencyGoalMetadata
genOptimizationGoalMetadataFrequencyGoalMetadata n =
  OptimizationGoalMetadataFrequencyGoalMetadata
    <$> arbitraryReducedMaybe n -- optimizationGoalMetadataFrequencyGoalMetadataFrequency :: Maybe Int
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataFrequencyGoalMetadataTimerange :: Maybe E'Timerange
  
instance Arbitrary OptimizationGoalMetadataScrollupGoalMetadata where
  arbitrary = sized genOptimizationGoalMetadataScrollupGoalMetadata

genOptimizationGoalMetadataScrollupGoalMetadata :: Int -> Gen OptimizationGoalMetadataScrollupGoalMetadata
genOptimizationGoalMetadataScrollupGoalMetadata n =
  OptimizationGoalMetadataScrollupGoalMetadata
    <$> arbitraryReducedMaybe n -- optimizationGoalMetadataScrollupGoalMetadataScrollupGoalValueInMicroCurrency :: Maybe Text
  
instance Arbitrary OrderLine where
  arbitrary = sized genOrderLine

genOrderLine :: Int -> Gen OrderLine
genOrderLine n =
  OrderLine
    <$> arbitraryReducedMaybe n -- orderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLineType :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLineAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinePurchaseOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLineStartTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLineEndTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLineBudget :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLinePaidBudget :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLineStatus :: Maybe OrderLineStatus
    <*> arbitraryReducedMaybe n -- orderLineName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinePaidType :: Maybe OrderLinePaidType
    <*> arbitrary -- orderLineCampaignIds :: [Text]
  
instance Arbitrary OrderLineError where
  arbitrary = sized genOrderLineError

genOrderLineError :: Int -> Gen OrderLineError
genOrderLineError n =
  OrderLineError
    <$> arbitraryReducedMaybe n -- orderLineErrorData :: Maybe OrderLine
    <*> arbitraryReducedMaybe n -- orderLineErrorErrorMessages :: Maybe [Text]
  
instance Arbitrary OrderLineResponse where
  arbitrary = sized genOrderLineResponse

genOrderLineResponse :: Int -> Gen OrderLineResponse
genOrderLineResponse n =
  OrderLineResponse
    <$> arbitraryReducedMaybe n -- orderLineResponseErrors :: Maybe [OrderLineError]
    <*> arbitraryReducedMaybe n -- orderLineResponseOrderLine :: Maybe [OrderLine]
  
instance Arbitrary OrderLineSingleResponse where
  arbitrary = sized genOrderLineSingleResponse

genOrderLineSingleResponse :: Int -> Gen OrderLineSingleResponse
genOrderLineSingleResponse n =
  OrderLineSingleResponse
    <$> arbitraryReducedMaybe n -- orderLineSingleResponseData :: Maybe OrderLineResponse
  
instance Arbitrary OrderLines where
  arbitrary = sized genOrderLines

genOrderLines :: Int -> Gen OrderLines
genOrderLines n =
  OrderLines
    <$> arbitraryReducedMaybe n -- orderLinesId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinesType :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinesAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinesPurchaseOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinesStartTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLinesEndTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLinesBudget :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLinesPaidBudget :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLinesStatus :: Maybe OrderLineStatus
    <*> arbitraryReducedMaybe n -- orderLinesName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinesPaidType :: Maybe OrderLinePaidType
  
instance Arbitrary OrderLinesArrayResponse where
  arbitrary = sized genOrderLinesArrayResponse

genOrderLinesArrayResponse :: Int -> Gen OrderLinesArrayResponse
genOrderLinesArrayResponse n =
  OrderLinesArrayResponse
    <$> arbitraryReducedMaybe n -- orderLinesArrayResponseItems :: Maybe [OrderLines]
  
instance Arbitrary OrderLinesList200Response where
  arbitrary = sized genOrderLinesList200Response

genOrderLinesList200Response :: Int -> Gen OrderLinesList200Response
genOrderLinesList200Response n =
  OrderLinesList200Response
    <$> arbitraryReduced n -- orderLinesList200ResponseItems :: [OrderLine]
    <*> arbitraryReducedMaybe n -- orderLinesList200ResponseBookmark :: Maybe Text
  
instance Arbitrary PageVisitConversionTagsGet200Response where
  arbitrary = sized genPageVisitConversionTagsGet200Response

genPageVisitConversionTagsGet200Response :: Int -> Gen PageVisitConversionTagsGet200Response
genPageVisitConversionTagsGet200Response n =
  PageVisitConversionTagsGet200Response
    <$> arbitraryReduced n -- pageVisitConversionTagsGet200ResponseItems :: [ConversionEventResponse]
    <*> arbitraryReducedMaybe n -- pageVisitConversionTagsGet200ResponseBookmark :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- pinDominantColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- pinBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinBoardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinBoardOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- pinIsOwner :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinMedia :: Maybe PinMedia
    <*> arbitraryReducedMaybe n -- pinMediaSource :: Maybe PinMediaSource
    <*> arbitraryReducedMaybe n -- pinParentPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinIsStandard :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinHasBeenPromoted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinNote :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- pinPinMetrics :: Maybe A.Value
  
instance Arbitrary PinAnalyticsMetricsResponse where
  arbitrary = sized genPinAnalyticsMetricsResponse

genPinAnalyticsMetricsResponse :: Int -> Gen PinAnalyticsMetricsResponse
genPinAnalyticsMetricsResponse n =
  PinAnalyticsMetricsResponse
    <$> arbitraryReducedMaybe n -- pinAnalyticsMetricsResponseLifetimeMetrics :: Maybe (Map.Map String Int)
    <*> arbitraryReducedMaybe n -- pinAnalyticsMetricsResponseDailyMetrics :: Maybe [PinAnalyticsMetricsResponseDailyMetricsInner]
    <*> arbitraryReducedMaybe n -- pinAnalyticsMetricsResponseSummaryMetrics :: Maybe (Map.Map String Double)
  
instance Arbitrary PinAnalyticsMetricsResponseDailyMetricsInner where
  arbitrary = sized genPinAnalyticsMetricsResponseDailyMetricsInner

genPinAnalyticsMetricsResponseDailyMetricsInner :: Int -> Gen PinAnalyticsMetricsResponseDailyMetricsInner
genPinAnalyticsMetricsResponseDailyMetricsInner n =
  PinAnalyticsMetricsResponseDailyMetricsInner
    <$> arbitraryReducedMaybe n -- pinAnalyticsMetricsResponseDailyMetricsInnerDataStatus :: Maybe DataStatus
    <*> arbitraryReducedMaybe n -- pinAnalyticsMetricsResponseDailyMetricsInnerDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinAnalyticsMetricsResponseDailyMetricsInnerMetrics :: Maybe (Map.Map String Double)
  
instance Arbitrary PinCreate where
  arbitrary = sized genPinCreate

genPinCreate :: Int -> Gen PinCreate
genPinCreate n =
  PinCreate
    <$> arbitraryReducedMaybe n -- pinCreateId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pinCreateLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateDominantColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateBoardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateBoardOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- pinCreateMedia :: Maybe PinMedia
    <*> arbitraryReducedMaybe n -- pinCreateMediaSource :: Maybe PinMediaSource
    <*> arbitraryReducedMaybe n -- pinCreateParentPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateNote :: Maybe Text
  
instance Arbitrary PinMedia where
  arbitrary = sized genPinMedia

genPinMedia :: Int -> Gen PinMedia
genPinMedia n =
  PinMedia
    <$> arbitraryReducedMaybe n -- pinMediaMediaType :: Maybe Text
  
instance Arbitrary PinMediaMetadata where
  arbitrary = sized genPinMediaMetadata

genPinMediaMetadata :: Int -> Gen PinMediaMetadata
genPinMediaMetadata n =
  PinMediaMetadata
    <$> arbitraryReducedMaybe n -- pinMediaMetadataItemType :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataImages :: Maybe ImageMetadataImages
    <*> arbitraryReducedMaybe n -- pinMediaMetadataCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataVideoUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataDuration :: Maybe Double
    <*> arbitraryReducedMaybe n -- pinMediaMetadataHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaMetadataWidth :: Maybe Int
  
instance Arbitrary PinMediaSource where
  arbitrary = sized genPinMediaSource

genPinMediaSource :: Int -> Gen PinMediaSource
genPinMediaSource n =
  PinMediaSource
    <$> arbitrary -- pinMediaSourceSourceType :: E'SourceType
    <*> arbitrary -- pinMediaSourceContentType :: E'ContentType
    <*> arbitrary -- pinMediaSourceData :: Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceIsStandard :: Maybe Bool
    <*> arbitrary -- pinMediaSourceUrl :: Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceCoverImageContentType :: Maybe E'ContentType
    <*> arbitraryReducedMaybe n -- pinMediaSourceCoverImageData :: Maybe Text
    <*> arbitrary -- pinMediaSourceMediaId :: Text
    <*> arbitraryReduced n -- pinMediaSourceItems :: [PinMediaSourceImagesURLItemsInner]
    <*> arbitraryReducedMaybe n -- pinMediaSourceIndex :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaSourceIsAffiliateLink :: Maybe Bool
  
instance Arbitrary PinMediaSourceImageBase64 where
  arbitrary = sized genPinMediaSourceImageBase64

genPinMediaSourceImageBase64 :: Int -> Gen PinMediaSourceImageBase64
genPinMediaSourceImageBase64 n =
  PinMediaSourceImageBase64
    <$> arbitrary -- pinMediaSourceImageBase64SourceType :: E'SourceType2
    <*> arbitrary -- pinMediaSourceImageBase64ContentType :: E'ContentType
    <*> arbitrary -- pinMediaSourceImageBase64Data :: Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImageBase64IsStandard :: Maybe Bool
  
instance Arbitrary PinMediaSourceImageURL where
  arbitrary = sized genPinMediaSourceImageURL

genPinMediaSourceImageURL :: Int -> Gen PinMediaSourceImageURL
genPinMediaSourceImageURL n =
  PinMediaSourceImageURL
    <$> arbitrary -- pinMediaSourceImageURLSourceType :: E'SourceType3
    <*> arbitrary -- pinMediaSourceImageURLUrl :: Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImageURLIsStandard :: Maybe Bool
  
instance Arbitrary PinMediaSourceImagesBase64 where
  arbitrary = sized genPinMediaSourceImagesBase64

genPinMediaSourceImagesBase64 :: Int -> Gen PinMediaSourceImagesBase64
genPinMediaSourceImagesBase64 n =
  PinMediaSourceImagesBase64
    <$> arbitraryReducedMaybe n -- pinMediaSourceImagesBase64SourceType :: Maybe E'SourceType4
    <*> arbitraryReduced n -- pinMediaSourceImagesBase64Items :: [PinMediaSourceImagesBase64ItemsInner]
    <*> arbitraryReducedMaybe n -- pinMediaSourceImagesBase64Index :: Maybe Int
  
instance Arbitrary PinMediaSourceImagesBase64ItemsInner where
  arbitrary = sized genPinMediaSourceImagesBase64ItemsInner

genPinMediaSourceImagesBase64ItemsInner :: Int -> Gen PinMediaSourceImagesBase64ItemsInner
genPinMediaSourceImagesBase64ItemsInner n =
  PinMediaSourceImagesBase64ItemsInner
    <$> arbitraryReducedMaybe n -- pinMediaSourceImagesBase64ItemsInnerTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImagesBase64ItemsInnerDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImagesBase64ItemsInnerLink :: Maybe Text
    <*> arbitrary -- pinMediaSourceImagesBase64ItemsInnerContentType :: E'ContentType
    <*> arbitrary -- pinMediaSourceImagesBase64ItemsInnerData :: Text
  
instance Arbitrary PinMediaSourceImagesURL where
  arbitrary = sized genPinMediaSourceImagesURL

genPinMediaSourceImagesURL :: Int -> Gen PinMediaSourceImagesURL
genPinMediaSourceImagesURL n =
  PinMediaSourceImagesURL
    <$> arbitraryReducedMaybe n -- pinMediaSourceImagesURLSourceType :: Maybe E'SourceType5
    <*> arbitraryReduced n -- pinMediaSourceImagesURLItems :: [PinMediaSourceImagesURLItemsInner]
    <*> arbitraryReducedMaybe n -- pinMediaSourceImagesURLIndex :: Maybe Int
  
instance Arbitrary PinMediaSourceImagesURLItemsInner where
  arbitrary = sized genPinMediaSourceImagesURLItemsInner

genPinMediaSourceImagesURLItemsInner :: Int -> Gen PinMediaSourceImagesURLItemsInner
genPinMediaSourceImagesURLItemsInner n =
  PinMediaSourceImagesURLItemsInner
    <$> arbitraryReducedMaybe n -- pinMediaSourceImagesURLItemsInnerTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImagesURLItemsInnerDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImagesURLItemsInnerLink :: Maybe Text
    <*> arbitrary -- pinMediaSourceImagesURLItemsInnerUrl :: Text
  
instance Arbitrary PinMediaSourcePinURL where
  arbitrary = sized genPinMediaSourcePinURL

genPinMediaSourcePinURL :: Int -> Gen PinMediaSourcePinURL
genPinMediaSourcePinURL n =
  PinMediaSourcePinURL
    <$> arbitrary -- pinMediaSourcePinURLSourceType :: E'SourceType
    <*> arbitraryReducedMaybe n -- pinMediaSourcePinURLIsAffiliateLink :: Maybe Bool
  
instance Arbitrary PinMediaSourceVideoID where
  arbitrary = sized genPinMediaSourceVideoID

genPinMediaSourceVideoID :: Int -> Gen PinMediaSourceVideoID
genPinMediaSourceVideoID n =
  PinMediaSourceVideoID
    <$> arbitrary -- pinMediaSourceVideoIDSourceType :: E'SourceType6
    <*> arbitraryReducedMaybe n -- pinMediaSourceVideoIDCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceVideoIDCoverImageContentType :: Maybe E'ContentType
    <*> arbitraryReducedMaybe n -- pinMediaSourceVideoIDCoverImageData :: Maybe Text
    <*> arbitrary -- pinMediaSourceVideoIDMediaId :: Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceVideoIDIsStandard :: Maybe Bool
  
instance Arbitrary PinMediaWithImage where
  arbitrary = sized genPinMediaWithImage

genPinMediaWithImage :: Int -> Gen PinMediaWithImage
genPinMediaWithImage n =
  PinMediaWithImage
    <$> arbitraryReducedMaybe n -- pinMediaWithImageMediaType :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithImageImages :: Maybe PinMediaWithImageAllOfImages
  
instance Arbitrary PinMediaWithImageAllOfImages where
  arbitrary = sized genPinMediaWithImageAllOfImages

genPinMediaWithImageAllOfImages :: Int -> Gen PinMediaWithImageAllOfImages
genPinMediaWithImageAllOfImages n =
  PinMediaWithImageAllOfImages
    <$> arbitraryReducedMaybeValue n -- pinMediaWithImageAllOfImages150x150 :: Maybe A.Value
    <*> arbitraryReducedMaybeValue n -- pinMediaWithImageAllOfImages400x300 :: Maybe A.Value
    <*> arbitraryReducedMaybeValue n -- pinMediaWithImageAllOfImages600x :: Maybe A.Value
    <*> arbitraryReducedMaybeValue n -- pinMediaWithImageAllOfImages1200x :: Maybe A.Value
  
instance Arbitrary PinMediaWithImageAndVideo where
  arbitrary = sized genPinMediaWithImageAndVideo

genPinMediaWithImageAndVideo :: Int -> Gen PinMediaWithImageAndVideo
genPinMediaWithImageAndVideo n =
  PinMediaWithImageAndVideo
    <$> arbitraryReducedMaybe n -- pinMediaWithImageAndVideoMediaType :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithImageAndVideoItems :: Maybe [PinMediaMetadata]
  
instance Arbitrary PinMediaWithImages where
  arbitrary = sized genPinMediaWithImages

genPinMediaWithImages :: Int -> Gen PinMediaWithImages
genPinMediaWithImages n =
  PinMediaWithImages
    <$> arbitraryReducedMaybe n -- pinMediaWithImagesMediaType :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithImagesItems :: Maybe [ImageMetadata]
  
instance Arbitrary PinMediaWithVideo where
  arbitrary = sized genPinMediaWithVideo

genPinMediaWithVideo :: Int -> Gen PinMediaWithVideo
genPinMediaWithVideo n =
  PinMediaWithVideo
    <$> arbitraryReducedMaybe n -- pinMediaWithVideoMediaType :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoImages :: Maybe PinMediaWithImageAllOfImages
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoVideoUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoDuration :: Maybe Double
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoWidth :: Maybe Int
  
instance Arbitrary PinMediaWithVideos where
  arbitrary = sized genPinMediaWithVideos

genPinMediaWithVideos :: Int -> Gen PinMediaWithVideos
genPinMediaWithVideos n =
  PinMediaWithVideos
    <$> arbitraryReducedMaybe n -- pinMediaWithVideosMediaType :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithVideosItems :: Maybe [VideoMetadata]
  
instance Arbitrary PinUpdate where
  arbitrary = sized genPinUpdate

genPinUpdate :: Int -> Gen PinUpdate
genPinUpdate n =
  PinUpdate
    <$> arbitraryReducedMaybe n -- pinUpdateAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateBoardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateCarouselSlots :: Maybe [PinUpdateCarouselSlotsInner]
    <*> arbitraryReducedMaybe n -- pinUpdateNote :: Maybe Text
  
instance Arbitrary PinUpdateCarouselSlotsInner where
  arbitrary = sized genPinUpdateCarouselSlotsInner

genPinUpdateCarouselSlotsInner :: Int -> Gen PinUpdateCarouselSlotsInner
genPinUpdateCarouselSlotsInner n =
  PinUpdateCarouselSlotsInner
    <$> arbitraryReducedMaybe n -- pinUpdateCarouselSlotsInnerTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateCarouselSlotsInnerDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateCarouselSlotsInnerLink :: Maybe Text
  
instance Arbitrary PinsAnalyticsMetricTypesParameterInner where
  arbitrary = sized genPinsAnalyticsMetricTypesParameterInner

genPinsAnalyticsMetricTypesParameterInner :: Int -> Gen PinsAnalyticsMetricTypesParameterInner
genPinsAnalyticsMetricTypesParameterInner n =
  
  pure PinsAnalyticsMetricTypesParameterInner
   
instance Arbitrary PinsList200Response where
  arbitrary = sized genPinsList200Response

genPinsList200Response :: Int -> Gen PinsList200Response
genPinsList200Response n =
  PinsList200Response
    <$> arbitraryReduced n -- pinsList200ResponseItems :: [Pin]
    <*> arbitraryReducedMaybe n -- pinsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary PinsSaveRequest where
  arbitrary = sized genPinsSaveRequest

genPinsSaveRequest :: Int -> Gen PinsSaveRequest
genPinsSaveRequest n =
  PinsSaveRequest
    <$> arbitraryReducedMaybe n -- pinsSaveRequestBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinsSaveRequestBoardSectionId :: Maybe Text
  
instance Arbitrary PinterestTagEventData where
  arbitrary = sized genPinterestTagEventData

genPinterestTagEventData :: Int -> Gen PinterestTagEventData
genPinterestTagEventData n =
  PinterestTagEventData
    <$> arbitraryReducedMaybe n -- pinterestTagEventDataCurrency :: Maybe Currency
    <*> arbitraryReducedMaybe n -- pinterestTagEventDataLeadType :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinterestTagEventDataLineItems :: Maybe LineItem
    <*> arbitraryReducedMaybe n -- pinterestTagEventDataOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinterestTagEventDataOrderQuantity :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinterestTagEventDataPageName :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinterestTagEventDataPromoCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinterestTagEventDataProperty :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinterestTagEventDataSearchQuery :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinterestTagEventDataValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinterestTagEventDataVideoTitle :: Maybe Text
  
instance Arbitrary PlacementMultipliers where
  arbitrary = sized genPlacementMultipliers

genPlacementMultipliers :: Int -> Gen PlacementMultipliers
genPlacementMultipliers n =
  PlacementMultipliers
    <$> arbitraryReducedMaybe n -- placementMultipliersPlacement :: Maybe E'Placement
  
instance Arbitrary PriceFilter where
  arbitrary = sized genPriceFilter

genPriceFilter :: Int -> Gen PriceFilter
genPriceFilter n =
  PriceFilter
    <$> arbitraryReduced n -- priceFilterPrice :: CatalogsProductGroupPricingCurrencyCriteria
  
instance Arbitrary ProductGroupAnalyticsResponseInner where
  arbitrary = sized genProductGroupAnalyticsResponseInner

genProductGroupAnalyticsResponseInner :: Int -> Gen ProductGroupAnalyticsResponseInner
genProductGroupAnalyticsResponseInner n =
  ProductGroupAnalyticsResponseInner
    <$> arbitrary -- productGroupAnalyticsResponseInnerProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- productGroupAnalyticsResponseInnerDate :: Maybe Date
  
instance Arbitrary ProductGroupPromotion where
  arbitrary = sized genProductGroupPromotion

genProductGroupPromotion :: Int -> Gen ProductGroupPromotion
genProductGroupPromotion n =
  ProductGroupPromotion
    <$> arbitraryReducedMaybe n -- productGroupPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- productGroupPromotionIncluded :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionRelativeDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionParentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionSlideshowCollectionsTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionSlideshowCollectionsDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionIsMdl :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- productGroupPromotionTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCatalogProductGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCatalogProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCollectionsHeroPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCollectionsHeroDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionGridClickType :: Maybe GridClickType
  
instance Arbitrary ProductGroupPromotionCreateRequest where
  arbitrary = sized genProductGroupPromotionCreateRequest

genProductGroupPromotionCreateRequest :: Int -> Gen ProductGroupPromotionCreateRequest
genProductGroupPromotionCreateRequest n =
  ProductGroupPromotionCreateRequest
    <$> arbitrary -- productGroupPromotionCreateRequestAdGroupId :: Text
    <*> arbitraryReduced n -- productGroupPromotionCreateRequestProductGroupPromotion :: [ProductGroupPromotionCreateRequestElement]
  
instance Arbitrary ProductGroupPromotionCreateRequestElement where
  arbitrary = sized genProductGroupPromotionCreateRequestElement

genProductGroupPromotionCreateRequestElement :: Int -> Gen ProductGroupPromotionCreateRequestElement
genProductGroupPromotionCreateRequestElement n =
  ProductGroupPromotionCreateRequestElement
    <$> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementIncluded :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementRelativeDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementParentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementSlideshowCollectionsTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementSlideshowCollectionsDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementIsMdl :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementCatalogProductGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementCatalogProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementCollectionsHeroPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementCollectionsHeroDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreateRequestElementCreativeType :: Maybe CreativeType
  
instance Arbitrary ProductGroupPromotionResponse where
  arbitrary = sized genProductGroupPromotionResponse

genProductGroupPromotionResponse :: Int -> Gen ProductGroupPromotionResponse
genProductGroupPromotionResponse n =
  ProductGroupPromotionResponse
    <$> arbitraryReducedMaybe n -- productGroupPromotionResponseItems :: Maybe [ProductGroupPromotionResponseItem]
  
instance Arbitrary ProductGroupPromotionResponseElement where
  arbitrary = sized genProductGroupPromotionResponseElement

genProductGroupPromotionResponseElement :: Int -> Gen ProductGroupPromotionResponseElement
genProductGroupPromotionResponseElement n =
  ProductGroupPromotionResponseElement
    <$> arbitraryReducedMaybe n -- productGroupPromotionResponseElementId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementIncluded :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementRelativeDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementParentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementSlideshowCollectionsTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementSlideshowCollectionsDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementIsMdl :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementCatalogProductGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementCatalogProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementCollectionsHeroPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementCollectionsHeroDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseElementCreativeType :: Maybe CreativeType
  
instance Arbitrary ProductGroupPromotionResponseItem where
  arbitrary = sized genProductGroupPromotionResponseItem

genProductGroupPromotionResponseItem :: Int -> Gen ProductGroupPromotionResponseItem
genProductGroupPromotionResponseItem n =
  ProductGroupPromotionResponseItem
    <$> arbitraryReducedMaybe n -- productGroupPromotionResponseItemData :: Maybe ProductGroupPromotionResponseElement
    <*> arbitraryReducedMaybe n -- productGroupPromotionResponseItemExceptions :: Maybe [Exception]
  
instance Arbitrary ProductGroupPromotionUpdateRequest where
  arbitrary = sized genProductGroupPromotionUpdateRequest

genProductGroupPromotionUpdateRequest :: Int -> Gen ProductGroupPromotionUpdateRequest
genProductGroupPromotionUpdateRequest n =
  ProductGroupPromotionUpdateRequest
    <$> arbitrary -- productGroupPromotionUpdateRequestAdGroupId :: Text
    <*> arbitraryReduced n -- productGroupPromotionUpdateRequestProductGroupPromotion :: [ProductGroupPromotion]
  
instance Arbitrary ProductGroupPromotionsList200Response where
  arbitrary = sized genProductGroupPromotionsList200Response

genProductGroupPromotionsList200Response :: Int -> Gen ProductGroupPromotionsList200Response
genProductGroupPromotionsList200Response n =
  ProductGroupPromotionsList200Response
    <$> arbitraryReduced n -- productGroupPromotionsList200ResponseItems :: [ProductGroupPromotionResponseItem]
    <*> arbitraryReducedMaybe n -- productGroupPromotionsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary ProductGroupReferenceFilter where
  arbitrary = sized genProductGroupReferenceFilter

genProductGroupReferenceFilter :: Int -> Gen ProductGroupReferenceFilter
genProductGroupReferenceFilter n =
  ProductGroupReferenceFilter
    <$> arbitraryReduced n -- productGroupReferenceFilterProductGroup :: CatalogsProductGroupMultipleStringCriteria
  
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
  
instance Arbitrary QuizPinData where
  arbitrary = sized genQuizPinData

genQuizPinData :: Int -> Gen QuizPinData
genQuizPinData n =
  QuizPinData
    <$> arbitraryReducedMaybe n -- quizPinDataQuestions :: Maybe [QuizPinQuestion]
    <*> arbitraryReducedMaybe n -- quizPinDataResults :: Maybe [QuizPinResult]
    <*> arbitraryReducedMaybe n -- quizPinDataTieBreakerType :: Maybe E'TieBreakerType
    <*> arbitraryReducedMaybe n -- quizPinDataTieBreakerCustomResult :: Maybe QuizPinResult
  
instance Arbitrary QuizPinOption where
  arbitrary = sized genQuizPinOption

genQuizPinOption :: Int -> Gen QuizPinOption
genQuizPinOption n =
  QuizPinOption
    <$> arbitraryReducedMaybe n -- quizPinOptionId :: Maybe Double
    <*> arbitraryReducedMaybe n -- quizPinOptionText :: Maybe Text
  
instance Arbitrary QuizPinQuestion where
  arbitrary = sized genQuizPinQuestion

genQuizPinQuestion :: Int -> Gen QuizPinQuestion
genQuizPinQuestion n =
  QuizPinQuestion
    <$> arbitraryReducedMaybe n -- quizPinQuestionQuestionId :: Maybe Double
    <*> arbitraryReducedMaybe n -- quizPinQuestionQuestionText :: Maybe Text
    <*> arbitraryReducedMaybe n -- quizPinQuestionOptions :: Maybe [QuizPinOption]
  
instance Arbitrary QuizPinResult where
  arbitrary = sized genQuizPinResult

genQuizPinResult :: Int -> Gen QuizPinResult
genQuizPinResult n =
  QuizPinResult
    <$> arbitraryReducedMaybe n -- quizPinResultOrganicPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- quizPinResultAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- quizPinResultIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- quizPinResultDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- quizPinResultResultId :: Maybe Double
  
instance Arbitrary RelatedTerms where
  arbitrary = sized genRelatedTerms

genRelatedTerms :: Int -> Gen RelatedTerms
genRelatedTerms n =
  RelatedTerms
    <$> arbitraryReducedMaybe n -- relatedTermsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- relatedTermsRelatedTermCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- relatedTermsRelatedTermsList :: Maybe [RelatedTermsRelatedTermsListInner]
  
instance Arbitrary RelatedTermsRelatedTermsListInner where
  arbitrary = sized genRelatedTermsRelatedTermsListInner

genRelatedTermsRelatedTermsListInner :: Int -> Gen RelatedTermsRelatedTermsListInner
genRelatedTermsRelatedTermsListInner n =
  RelatedTermsRelatedTermsListInner
    <$> arbitraryReducedMaybe n -- relatedTermsRelatedTermsListInnerTerm :: Maybe Text
    <*> arbitraryReducedMaybe n -- relatedTermsRelatedTermsListInnerRelatedTerms :: Maybe [Text]
  
instance Arbitrary ReportsStats200Response where
  arbitrary = sized genReportsStats200Response

genReportsStats200Response :: Int -> Gen ReportsStats200Response
genReportsStats200Response n =
  ReportsStats200Response
    <$> arbitraryReduced n -- reportsStats200ResponseItems :: [CatalogsReportStats]
    <*> arbitraryReducedMaybe n -- reportsStats200ResponseBookmark :: Maybe Text
  
instance Arbitrary RespondToInvitesResponseArray where
  arbitrary = sized genRespondToInvitesResponseArray

genRespondToInvitesResponseArray :: Int -> Gen RespondToInvitesResponseArray
genRespondToInvitesResponseArray n =
  RespondToInvitesResponseArray
    <$> arbitraryReducedMaybe n -- respondToInvitesResponseArrayItems :: Maybe [RespondToInvitesResponseArrayItemsInner]
  
instance Arbitrary RespondToInvitesResponseArrayItemsInner where
  arbitrary = sized genRespondToInvitesResponseArrayItemsInner

genRespondToInvitesResponseArrayItemsInner :: Int -> Gen RespondToInvitesResponseArrayItemsInner
genRespondToInvitesResponseArrayItemsInner n =
  RespondToInvitesResponseArrayItemsInner
    <$> arbitraryReducedMaybe n -- respondToInvitesResponseArrayItemsInnerException :: Maybe InviteExceptionResponse
    <*> arbitraryReducedMaybe n -- respondToInvitesResponseArrayItemsInnerInvite :: Maybe BaseInviteDataResponse
  
instance Arbitrary SSIOAccountAddress where
  arbitrary = sized genSSIOAccountAddress

genSSIOAccountAddress :: Int -> Gen SSIOAccountAddress
genSSIOAccountAddress n =
  SSIOAccountAddress
    <$> arbitraryReducedMaybe n -- sSIOAccountAddressDisplay :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountAddressPurpose :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountAddressAddressId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountAddressOrderLegalEntity :: Maybe Text
  
instance Arbitrary SSIOAccountItem where
  arbitrary = sized genSSIOAccountItem

genSSIOAccountItem :: Int -> Gen SSIOAccountItem
genSSIOAccountItem n =
  SSIOAccountItem
    <$> arbitraryReducedMaybe n -- sSIOAccountItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemIoTermsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemIoTerms :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemUsTermsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemUsTerms :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemRowTermsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemRowTerms :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemIoType :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemAddresses :: Maybe [SSIOAccountAddress]
  
instance Arbitrary SSIOAccountPMPName where
  arbitrary = sized genSSIOAccountPMPName

genSSIOAccountPMPName :: Int -> Gen SSIOAccountPMPName
genSSIOAccountPMPName n =
  SSIOAccountPMPName
    <$> arbitraryReducedMaybe n -- sSIOAccountPMPNameName :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountPMPNameId :: Maybe Text
  
instance Arbitrary SSIOAccountResponse where
  arbitrary = sized genSSIOAccountResponse

genSSIOAccountResponse :: Int -> Gen SSIOAccountResponse
genSSIOAccountResponse n =
  SSIOAccountResponse
    <$> arbitraryReducedMaybe n -- sSIOAccountResponseEligible :: Maybe Bool
    <*> arbitraryReducedMaybe n -- sSIOAccountResponseCanEdit :: Maybe Bool
    <*> arbitraryReducedMaybe n -- sSIOAccountResponseBilltoInfos :: Maybe [SSIOAccountItem]
    <*> arbitraryReducedMaybe n -- sSIOAccountResponseCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountResponsePmpNames :: Maybe [SSIOAccountPMPName]
    <*> arbitraryReducedMaybe n -- sSIOAccountResponseError :: Maybe Text
  
instance Arbitrary SSIOCreateInsertionOrderRequest where
  arbitrary = sized genSSIOCreateInsertionOrderRequest

genSSIOCreateInsertionOrderRequest :: Int -> Gen SSIOCreateInsertionOrderRequest
genSSIOCreateInsertionOrderRequest n =
  SSIOCreateInsertionOrderRequest
    <$> arbitrary -- sSIOCreateInsertionOrderRequestStartDate :: Text
    <*> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestEndDate :: Maybe Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestPoNumber :: Text
    <*> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestBudgetAmount :: Maybe Double
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBillingContactFirstname :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBillingContactLastname :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBillingContactEmail :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestMediaContactFirstname :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestMediaContactLastname :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestMediaContactEmail :: Text
    <*> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestAgencyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestUserEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestAcceptedTermsTime :: Maybe Int
    <*> arbitrary -- sSIOCreateInsertionOrderRequestPmpId :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestOrderName :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestOrderLineType :: E'OrderLineType
    <*> arbitrary -- sSIOCreateInsertionOrderRequestAcceptedTermsId :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBilltoCompanyId :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBilltoBusinessAddressId :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBilltoBillingAddressId :: Text
    <*> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestEstimatedMonthlySpend :: Maybe Double
    <*> arbitraryReduced n -- sSIOCreateInsertionOrderRequestCurrencyInfo :: Currency
  
instance Arbitrary SSIOCreateInsertionOrderResponse where
  arbitrary = sized genSSIOCreateInsertionOrderResponse

genSSIOCreateInsertionOrderResponse :: Int -> Gen SSIOCreateInsertionOrderResponse
genSSIOCreateInsertionOrderResponse n =
  SSIOCreateInsertionOrderResponse
    <$> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderResponsePinOrderId :: Maybe Text
  
instance Arbitrary SSIOEditInsertionOrderRequest where
  arbitrary = sized genSSIOEditInsertionOrderRequest

genSSIOEditInsertionOrderRequest :: Int -> Gen SSIOEditInsertionOrderRequest
genSSIOEditInsertionOrderRequest n =
  SSIOEditInsertionOrderRequest
    <$> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestStartDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestEndDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestPoNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestBudgetAmount :: Maybe Double
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestBillingContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestBillingContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestBillingContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestMediaContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestMediaContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestMediaContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestAgencyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestUserEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestOracleLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestSalesforceOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestSalesforceOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestAdsManagerOrderLineId :: Maybe Text
  
instance Arbitrary SSIOEditInsertionOrderResponse where
  arbitrary = sized genSSIOEditInsertionOrderResponse

genSSIOEditInsertionOrderResponse :: Int -> Gen SSIOEditInsertionOrderResponse
genSSIOEditInsertionOrderResponse n =
  SSIOEditInsertionOrderResponse
    <$> arbitraryReducedMaybe n -- sSIOEditInsertionOrderResponsePinOrderId :: Maybe Text
  
instance Arbitrary SSIOInsertionOrderCommon where
  arbitrary = sized genSSIOInsertionOrderCommon

genSSIOInsertionOrderCommon :: Int -> Gen SSIOInsertionOrderCommon
genSSIOInsertionOrderCommon n =
  SSIOInsertionOrderCommon
    <$> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonStartDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonEndDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonPoNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonBudgetAmount :: Maybe Double
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonBillingContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonBillingContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonBillingContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonMediaContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonMediaContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonMediaContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonAgencyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonUserEmail :: Maybe Text
  
instance Arbitrary SSIOInsertionOrderStatus where
  arbitrary = sized genSSIOInsertionOrderStatus

genSSIOInsertionOrderStatus :: Int -> Gen SSIOInsertionOrderStatus
genSSIOInsertionOrderStatus n =
  SSIOInsertionOrderStatus
    <$> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusPinOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusCreationTime :: Maybe Text
  
instance Arbitrary SSIOInsertionOrderStatusResponse where
  arbitrary = sized genSSIOInsertionOrderStatusResponse

genSSIOInsertionOrderStatusResponse :: Int -> Gen SSIOInsertionOrderStatusResponse
genSSIOInsertionOrderStatusResponse n =
  SSIOInsertionOrderStatusResponse
    <$> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusResponsePinOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusResponseStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusResponseCreationTime :: Maybe Text
  
instance Arbitrary SSIOOrderLine where
  arbitrary = sized genSSIOOrderLine

genSSIOOrderLine :: Int -> Gen SSIOOrderLine
genSSIOOrderLine n =
  SSIOOrderLine
    <$> arbitraryReducedMaybe n -- sSIOOrderLineSalesforceOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineAdsManagerOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLinePinOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineLastModifiedDateTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineStartDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- sSIOOrderLineEndDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- sSIOOrderLineBillToCompanyName :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineBillingContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineBillingContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineBillingContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineMediaContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineMediaContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineMediaContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineCurrencyInfo :: Maybe Currency
    <*> arbitraryReducedMaybe n -- sSIOOrderLineAgencyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLinePoNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineOrderName :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLinePmpName :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineAcceptedTermsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineAcceptedTermsTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineBudgetAmount :: Maybe Double
    <*> arbitraryReducedMaybe n -- sSIOOrderLineEstimatedMonthlySpend :: Maybe Double
  
instance Arbitrary SearchPartnerPins200Response where
  arbitrary = sized genSearchPartnerPins200Response

genSearchPartnerPins200Response :: Int -> Gen SearchPartnerPins200Response
genSearchPartnerPins200Response n =
  SearchPartnerPins200Response
    <$> arbitraryReduced n -- searchPartnerPins200ResponseItems :: [SummaryPin]
    <*> arbitraryReducedMaybe n -- searchPartnerPins200ResponseBookmark :: Maybe Text
  
instance Arbitrary SearchUserBoardsGet200Response where
  arbitrary = sized genSearchUserBoardsGet200Response

genSearchUserBoardsGet200Response :: Int -> Gen SearchUserBoardsGet200Response
genSearchUserBoardsGet200Response n =
  SearchUserBoardsGet200Response
    <$> arbitraryReduced n -- searchUserBoardsGet200ResponseItems :: [Board]
    <*> arbitraryReducedMaybe n -- searchUserBoardsGet200ResponseBookmark :: Maybe Text
  
instance Arbitrary SharedAudience where
  arbitrary = sized genSharedAudience

genSharedAudience :: Int -> Gen SharedAudience
genSharedAudience n =
  SharedAudience
    <$> arbitrary -- sharedAudienceAudienceId :: Text
    <*> arbitraryReduced n -- sharedAudienceOperationType :: OperationType
    <*> arbitrary -- sharedAudienceRecipientAccountIds :: [Text]
  
instance Arbitrary SharedAudienceAccount where
  arbitrary = sized genSharedAudienceAccount

genSharedAudienceAccount :: Int -> Gen SharedAudienceAccount
genSharedAudienceAccount n =
  SharedAudienceAccount
    <$> arbitrary -- sharedAudienceAccountAccountId :: Text
    <*> arbitrary -- sharedAudienceAccountAccountName :: Text
    <*> arbitrary -- sharedAudienceAccountAccountType :: E'AccountType2
    <*> arbitrary -- sharedAudienceAccountSharedOnTimestamp :: Int
  
instance Arbitrary SharedAudienceCommon where
  arbitrary = sized genSharedAudienceCommon

genSharedAudienceCommon :: Int -> Gen SharedAudienceCommon
genSharedAudienceCommon n =
  SharedAudienceCommon
    <$> arbitraryReducedMaybe n -- sharedAudienceCommonAudienceId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sharedAudienceCommonOperationType :: Maybe OperationType
  
instance Arbitrary SharedAudienceResponse where
  arbitrary = sized genSharedAudienceResponse

genSharedAudienceResponse :: Int -> Gen SharedAudienceResponse
genSharedAudienceResponse n =
  SharedAudienceResponse
    <$> arbitraryReducedMaybe n -- sharedAudienceResponseAudienceId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sharedAudienceResponsePermissions :: Maybe [Role]
    <*> arbitraryReducedMaybe n -- sharedAudienceResponseRecipientAccountIds :: Maybe [Text]
  
instance Arbitrary SharedAudienceResponseCommon where
  arbitrary = sized genSharedAudienceResponseCommon

genSharedAudienceResponseCommon :: Int -> Gen SharedAudienceResponseCommon
genSharedAudienceResponseCommon n =
  SharedAudienceResponseCommon
    <$> arbitraryReducedMaybe n -- sharedAudienceResponseCommonAudienceId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sharedAudienceResponseCommonPermissions :: Maybe [Role]
  
instance Arbitrary SingleInterestTargetingOptionResponse where
  arbitrary = sized genSingleInterestTargetingOptionResponse

genSingleInterestTargetingOptionResponse :: Int -> Gen SingleInterestTargetingOptionResponse
genSingleInterestTargetingOptionResponse n =
  SingleInterestTargetingOptionResponse
    <$> arbitraryReducedMaybe n -- singleInterestTargetingOptionResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- singleInterestTargetingOptionResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- singleInterestTargetingOptionResponseChildInterests :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- singleInterestTargetingOptionResponseLevel :: Maybe Int
  
instance Arbitrary SsioInsertionOrdersStatusGetByAdAccount200Response where
  arbitrary = sized genSsioInsertionOrdersStatusGetByAdAccount200Response

genSsioInsertionOrdersStatusGetByAdAccount200Response :: Int -> Gen SsioInsertionOrdersStatusGetByAdAccount200Response
genSsioInsertionOrdersStatusGetByAdAccount200Response n =
  SsioInsertionOrdersStatusGetByAdAccount200Response
    <$> arbitraryReduced n -- ssioInsertionOrdersStatusGetByAdAccount200ResponseItems :: [SSIOInsertionOrderStatus]
    <*> arbitraryReducedMaybe n -- ssioInsertionOrdersStatusGetByAdAccount200ResponseBookmark :: Maybe Text
  
instance Arbitrary SsioOrderLinesGetByAdAccount200Response where
  arbitrary = sized genSsioOrderLinesGetByAdAccount200Response

genSsioOrderLinesGetByAdAccount200Response :: Int -> Gen SsioOrderLinesGetByAdAccount200Response
genSsioOrderLinesGetByAdAccount200Response n =
  SsioOrderLinesGetByAdAccount200Response
    <$> arbitraryReduced n -- ssioOrderLinesGetByAdAccount200ResponseItems :: [SSIOOrderLine]
    <*> arbitraryReducedMaybe n -- ssioOrderLinesGetByAdAccount200ResponseBookmark :: Maybe Text
  
instance Arbitrary SummaryPin where
  arbitrary = sized genSummaryPin

genSummaryPin :: Int -> Gen SummaryPin
genSummaryPin n =
  SummaryPin
    <$> arbitraryReducedMaybe n -- summaryPinMedia :: Maybe PinMedia
    <*> arbitraryReducedMaybe n -- summaryPinAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinDescription :: Maybe Text
  
instance Arbitrary TargetingSpec where
  arbitrary = sized genTargetingSpec

genTargetingSpec :: Int -> Gen TargetingSpec
genTargetingSpec n =
  TargetingSpec
    <$> arbitraryReducedMaybe n -- targetingSpecAgeBucket :: Maybe [E'AgeBucket]
    <*> arbitraryReducedMaybe n -- targetingSpecApptype :: Maybe [E'Apptype]
    <*> arbitraryReducedMaybe n -- targetingSpecAudienceExclude :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecAudienceInclude :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecGender :: Maybe [E'Gender]
    <*> arbitraryReducedMaybe n -- targetingSpecGeo :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecInterest :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecLocale :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecLocation :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecShoppingRetargeting :: Maybe [TargetingSpecSHOPPINGRETARGETING]
    <*> arbitraryReducedMaybe n -- targetingSpecTargetingStrategy :: Maybe [E'TargetingStrategy]
  
instance Arbitrary TargetingSpecSHOPPINGRETARGETING where
  arbitrary = sized genTargetingSpecSHOPPINGRETARGETING

genTargetingSpecSHOPPINGRETARGETING :: Int -> Gen TargetingSpecSHOPPINGRETARGETING
genTargetingSpecSHOPPINGRETARGETING n =
  TargetingSpecSHOPPINGRETARGETING
    <$> arbitraryReducedMaybe n -- targetingSpecSHOPPINGRETARGETINGLookbackWindow :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingSpecSHOPPINGRETARGETINGTagTypes :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- targetingSpecSHOPPINGRETARGETINGExclusionWindow :: Maybe Int
  
instance Arbitrary TargetingTemplateAudienceSizing where
  arbitrary = sized genTargetingTemplateAudienceSizing

genTargetingTemplateAudienceSizing :: Int -> Gen TargetingTemplateAudienceSizing
genTargetingTemplateAudienceSizing n =
  TargetingTemplateAudienceSizing
    <$> arbitraryReducedMaybe n -- targetingTemplateAudienceSizingReachEstimate :: Maybe TargetingTemplateAudienceSizingReachEstimate
  
instance Arbitrary TargetingTemplateAudienceSizingReachEstimate where
  arbitrary = sized genTargetingTemplateAudienceSizingReachEstimate

genTargetingTemplateAudienceSizingReachEstimate :: Int -> Gen TargetingTemplateAudienceSizingReachEstimate
genTargetingTemplateAudienceSizingReachEstimate n =
  TargetingTemplateAudienceSizingReachEstimate
    <$> arbitraryReducedMaybe n -- targetingTemplateAudienceSizingReachEstimateEstimate :: Maybe Integer
    <*> arbitraryReducedMaybe n -- targetingTemplateAudienceSizingReachEstimateLowerBound :: Maybe Integer
    <*> arbitraryReducedMaybe n -- targetingTemplateAudienceSizingReachEstimateUpperBound :: Maybe Integer
  
instance Arbitrary TargetingTemplateCommon where
  arbitrary = sized genTargetingTemplateCommon

genTargetingTemplateCommon :: Int -> Gen TargetingTemplateCommon
genTargetingTemplateCommon n =
  TargetingTemplateCommon
    <$> arbitraryReducedMaybe n -- targetingTemplateCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateCommonAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- targetingTemplateCommonTargetingAttributes :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- targetingTemplateCommonPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- targetingTemplateCommonKeywords :: Maybe [TargetingTemplateKeyword]
    <*> arbitraryReducedMaybe n -- targetingTemplateCommonTrackingUrls :: Maybe TrackingUrls
  
instance Arbitrary TargetingTemplateCreate where
  arbitrary = sized genTargetingTemplateCreate

genTargetingTemplateCreate :: Int -> Gen TargetingTemplateCreate
genTargetingTemplateCreate n =
  TargetingTemplateCreate
    <$> arbitrary -- targetingTemplateCreateName :: Text
    <*> arbitraryReducedMaybe n -- targetingTemplateCreateAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReduced n -- targetingTemplateCreateTargetingAttributes :: TargetingSpec
    <*> arbitraryReducedMaybe n -- targetingTemplateCreatePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- targetingTemplateCreateKeywords :: Maybe [TargetingTemplateKeyword]
    <*> arbitraryReducedMaybe n -- targetingTemplateCreateTrackingUrls :: Maybe TrackingUrls
  
instance Arbitrary TargetingTemplateGetResponseData where
  arbitrary = sized genTargetingTemplateGetResponseData

genTargetingTemplateGetResponseData :: Int -> Gen TargetingTemplateGetResponseData
genTargetingTemplateGetResponseData n =
  TargetingTemplateGetResponseData
    <$> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataName :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataTargetingAttributes :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataKeywords :: Maybe [TargetingTemplateKeyword]
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataId :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataStatus :: Maybe E'Status3
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataSizing :: Maybe TargetingTemplateAudienceSizing
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataValid :: Maybe Bool
  
instance Arbitrary TargetingTemplateKeyword where
  arbitrary = sized genTargetingTemplateKeyword

genTargetingTemplateKeyword :: Int -> Gen TargetingTemplateKeyword
genTargetingTemplateKeyword n =
  TargetingTemplateKeyword
    <$> arbitraryReducedMaybe n -- targetingTemplateKeywordMatchType :: Maybe MatchType
    <*> arbitraryReducedMaybe n -- targetingTemplateKeywordValue :: Maybe Text
  
instance Arbitrary TargetingTemplateList200Response where
  arbitrary = sized genTargetingTemplateList200Response

genTargetingTemplateList200Response :: Int -> Gen TargetingTemplateList200Response
genTargetingTemplateList200Response n =
  TargetingTemplateList200Response
    <$> arbitraryReduced n -- targetingTemplateList200ResponseItems :: [TargetingTemplateResponseData]
    <*> arbitraryReducedMaybe n -- targetingTemplateList200ResponseBookmark :: Maybe Text
  
instance Arbitrary TargetingTemplateResponseData where
  arbitrary = sized genTargetingTemplateResponseData

genTargetingTemplateResponseData :: Int -> Gen TargetingTemplateResponseData
genTargetingTemplateResponseData n =
  TargetingTemplateResponseData
    <$> arbitraryReducedMaybe n -- targetingTemplateResponseDataName :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataTargetingAttributes :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataKeywords :: Maybe [TargetingTemplateKeyword]
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataId :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataStatus :: Maybe E'Status3
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataSizing :: Maybe TargetingTemplateAudienceSizing
  
instance Arbitrary TargetingTemplateUpdateRequest where
  arbitrary = sized genTargetingTemplateUpdateRequest

genTargetingTemplateUpdateRequest :: Int -> Gen TargetingTemplateUpdateRequest
genTargetingTemplateUpdateRequest n =
  TargetingTemplateUpdateRequest
    <$> arbitrary -- targetingTemplateUpdateRequestOperationType :: E'OperationType
    <*> arbitrary -- targetingTemplateUpdateRequestId :: Text
  
instance Arbitrary TargetingTypeFilter where
  arbitrary = sized genTargetingTypeFilter

genTargetingTypeFilter :: Int -> Gen TargetingTypeFilter
genTargetingTypeFilter n =
  TargetingTypeFilter
    <$> arbitraryReducedMaybe n -- targetingTypeFilterTargetingTypes :: Maybe [AdsAnalyticsTargetingType]
  
instance Arbitrary TemplateResponse where
  arbitrary = sized genTemplateResponse

genTemplateResponse :: Int -> Gen TemplateResponse
genTemplateResponse n =
  TemplateResponse
    <$> arbitraryReducedMaybe n -- templateResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseAdAccountIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- templateResponseUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseReportStartRelativeDaysInPast :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseReportEndRelativeDaysInPast :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseDateRange :: Maybe TemplateResponseDateRange
    <*> arbitraryReducedMaybe n -- templateResponseReportLevel :: Maybe MetricsReportingLevel
    <*> arbitraryReducedMaybe n -- templateResponseReportFormat :: Maybe DataOutputFormat
    <*> arbitraryReducedMaybe n -- templateResponseColumns :: Maybe [E'Columns]
    <*> arbitraryReducedMaybe n -- templateResponseGranularity :: Maybe Granularity
    <*> arbitraryReducedMaybe n -- templateResponseViewWindowDays :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseClickWindowDays :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseEngagementWindowDays :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseConversionReportTimeType :: Maybe E'ConversionReportTimeType
    <*> arbitraryReducedMaybe n -- templateResponseFiltersJson :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseIsOwnedByUser :: Maybe Bool
    <*> arbitraryReducedMaybe n -- templateResponseIsScheduled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- templateResponseCreationSource :: Maybe E'CreationSource
    <*> arbitraryReducedMaybe n -- templateResponseIsDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- templateResponseUpdatedTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseCustomColumnIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- templateResponseType :: Maybe E'Type
    <*> arbitraryReducedMaybe n -- templateResponseIngestionSources :: Maybe [E'IngestionSources]
  
instance Arbitrary TemplateResponseDateRange where
  arbitrary = sized genTemplateResponseDateRange

genTemplateResponseDateRange :: Int -> Gen TemplateResponseDateRange
genTemplateResponseDateRange n =
  TemplateResponseDateRange
    <$> arbitraryReducedMaybe n -- templateResponseDateRangeDynamicDateRange :: Maybe TemplateResponseDateRangeDynamicDateRange
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeRelativeDateRange :: Maybe TemplateResponseDateRangeRelativeDateRange
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeAbsoluteDateRange :: Maybe TemplateResponseDateRangeAbsoluteDateRange
  
instance Arbitrary TemplateResponseDateRangeAbsoluteDateRange where
  arbitrary = sized genTemplateResponseDateRangeAbsoluteDateRange

genTemplateResponseDateRangeAbsoluteDateRange :: Int -> Gen TemplateResponseDateRangeAbsoluteDateRange
genTemplateResponseDateRangeAbsoluteDateRange n =
  TemplateResponseDateRangeAbsoluteDateRange
    <$> arbitraryReducedMaybe n -- templateResponseDateRangeAbsoluteDateRangeType :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeAbsoluteDateRangeStartDate :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeAbsoluteDateRangeEndDate :: Maybe Double
  
instance Arbitrary TemplateResponseDateRangeDynamicDateRange where
  arbitrary = sized genTemplateResponseDateRangeDynamicDateRange

genTemplateResponseDateRangeDynamicDateRange :: Int -> Gen TemplateResponseDateRangeDynamicDateRange
genTemplateResponseDateRangeDynamicDateRange n =
  TemplateResponseDateRangeDynamicDateRange
    <$> arbitraryReducedMaybe n -- templateResponseDateRangeDynamicDateRangeType :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeDynamicDateRangeRange :: Maybe E'Range
  
instance Arbitrary TemplateResponseDateRangeRelativeDateRange where
  arbitrary = sized genTemplateResponseDateRangeRelativeDateRange

genTemplateResponseDateRangeRelativeDateRange :: Int -> Gen TemplateResponseDateRangeRelativeDateRange
genTemplateResponseDateRangeRelativeDateRange n =
  TemplateResponseDateRangeRelativeDateRange
    <$> arbitraryReducedMaybe n -- templateResponseDateRangeRelativeDateRangeType :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeRelativeDateRangeStartDaysInPast :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeRelativeDateRangeEndDaysInPast :: Maybe Double
  
instance Arbitrary TemplatesList200Response where
  arbitrary = sized genTemplatesList200Response

genTemplatesList200Response :: Int -> Gen TemplatesList200Response
genTemplatesList200Response n =
  TemplatesList200Response
    <$> arbitraryReduced n -- templatesList200ResponseItems :: [TemplateResponse]
    <*> arbitraryReducedMaybe n -- templatesList200ResponseBookmark :: Maybe Text
  
instance Arbitrary TermsOfService where
  arbitrary = sized genTermsOfService

genTermsOfService :: Int -> Gen TermsOfService
genTermsOfService n =
  TermsOfService
    <$> arbitraryReducedMaybe n -- termsOfServiceId :: Maybe Text
    <*> arbitraryReducedMaybe n -- termsOfServiceHtml :: Maybe Text
    <*> arbitraryReducedMaybe n -- termsOfServiceHasAccepted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- termsOfServiceAdAccountId :: Maybe Text
  
instance Arbitrary TopPinsAnalyticsResponse where
  arbitrary = sized genTopPinsAnalyticsResponse

genTopPinsAnalyticsResponse :: Int -> Gen TopPinsAnalyticsResponse
genTopPinsAnalyticsResponse n =
  TopPinsAnalyticsResponse
    <$> arbitraryReducedMaybe n -- topPinsAnalyticsResponseDateAvailability :: Maybe TopPinsAnalyticsResponseDateAvailability
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponsePins :: Maybe [TopPinsAnalyticsResponsePinsInner]
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponseSortBy :: Maybe E'SortBy
  
instance Arbitrary TopPinsAnalyticsResponseDateAvailability where
  arbitrary = sized genTopPinsAnalyticsResponseDateAvailability

genTopPinsAnalyticsResponseDateAvailability :: Int -> Gen TopPinsAnalyticsResponseDateAvailability
genTopPinsAnalyticsResponseDateAvailability n =
  TopPinsAnalyticsResponseDateAvailability
    <$> arbitraryReducedMaybe n -- topPinsAnalyticsResponseDateAvailabilityLatestAvailableTimestamp :: Maybe Double
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponseDateAvailabilityIsRealtime :: Maybe Bool
  
instance Arbitrary TopPinsAnalyticsResponsePinsInner where
  arbitrary = sized genTopPinsAnalyticsResponsePinsInner

genTopPinsAnalyticsResponsePinsInner :: Int -> Gen TopPinsAnalyticsResponsePinsInner
genTopPinsAnalyticsResponsePinsInner n =
  TopPinsAnalyticsResponsePinsInner
    <$> arbitraryReducedMaybe n -- topPinsAnalyticsResponsePinsInnerMetrics :: Maybe (Map.Map String Double)
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponsePinsInnerDataStatus :: Maybe (Map.Map String DataStatus)
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponsePinsInnerPinId :: Maybe Text
  
instance Arbitrary TopVideoPinsAnalyticsResponse where
  arbitrary = sized genTopVideoPinsAnalyticsResponse

genTopVideoPinsAnalyticsResponse :: Int -> Gen TopVideoPinsAnalyticsResponse
genTopVideoPinsAnalyticsResponse n =
  TopVideoPinsAnalyticsResponse
    <$> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponseDateAvailability :: Maybe TopPinsAnalyticsResponseDateAvailability
    <*> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponsePins :: Maybe [TopVideoPinsAnalyticsResponsePinsInner]
    <*> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponseSortBy :: Maybe E'SortBy2
  
instance Arbitrary TopVideoPinsAnalyticsResponsePinsInner where
  arbitrary = sized genTopVideoPinsAnalyticsResponsePinsInner

genTopVideoPinsAnalyticsResponsePinsInner :: Int -> Gen TopVideoPinsAnalyticsResponsePinsInner
genTopVideoPinsAnalyticsResponsePinsInner n =
  TopVideoPinsAnalyticsResponsePinsInner
    <$> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponsePinsInnerMetrics :: Maybe (Map.Map String Double)
    <*> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponsePinsInnerDataStatus :: Maybe (Map.Map String DataStatus)
    <*> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponsePinsInnerPinId :: Maybe Text
  
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
  
instance Arbitrary TrendingKeywordsResponse where
  arbitrary = sized genTrendingKeywordsResponse

genTrendingKeywordsResponse :: Int -> Gen TrendingKeywordsResponse
genTrendingKeywordsResponse n =
  TrendingKeywordsResponse
    <$> arbitraryReducedMaybe n -- trendingKeywordsResponseTrends :: Maybe [TrendingKeywordsResponseTrendsInner]
  
instance Arbitrary TrendingKeywordsResponseTrendsInner where
  arbitrary = sized genTrendingKeywordsResponseTrendsInner

genTrendingKeywordsResponseTrendsInner :: Int -> Gen TrendingKeywordsResponseTrendsInner
genTrendingKeywordsResponseTrendsInner n =
  TrendingKeywordsResponseTrendsInner
    <$> arbitraryReducedMaybe n -- trendingKeywordsResponseTrendsInnerKeyword :: Maybe Text
    <*> arbitraryReducedMaybe n -- trendingKeywordsResponseTrendsInnerPctGrowthWow :: Maybe Int
    <*> arbitraryReducedMaybe n -- trendingKeywordsResponseTrendsInnerPctGrowthMom :: Maybe Int
    <*> arbitraryReducedMaybe n -- trendingKeywordsResponseTrendsInnerPctGrowthYoy :: Maybe Int
    <*> arbitraryReducedMaybe n -- trendingKeywordsResponseTrendsInnerTimeSeries :: Maybe TrendingKeywordsResponseTrendsInnerTimeSeries
  
instance Arbitrary TrendingKeywordsResponseTrendsInnerTimeSeries where
  arbitrary = sized genTrendingKeywordsResponseTrendsInnerTimeSeries

genTrendingKeywordsResponseTrendsInnerTimeSeries :: Int -> Gen TrendingKeywordsResponseTrendsInnerTimeSeries
genTrendingKeywordsResponseTrendsInnerTimeSeries n =
  TrendingKeywordsResponseTrendsInnerTimeSeries
    <$> arbitraryReducedMaybe n -- trendingKeywordsResponseTrendsInnerTimeSeriesDate :: Maybe Date
  
instance Arbitrary UpdatableItemAttributes where
  arbitrary = sized genUpdatableItemAttributes

genUpdatableItemAttributes :: Int -> Gen UpdatableItemAttributes
genUpdatableItemAttributes n =
  UpdatableItemAttributes
    <$> arbitraryReducedMaybe n -- updatableItemAttributesAdLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdult :: Maybe Bool
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAgeGroup :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAvailability :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAverageReviewRating :: Maybe Double
    <*> arbitraryReducedMaybe n -- updatableItemAttributesBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCheckoutEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- updatableItemAttributesColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCondition :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCustomLabel0 :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCustomLabel1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCustomLabel2 :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCustomLabel3 :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCustomLabel4 :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesFreeShippingLabel :: Maybe Bool
    <*> arbitraryReducedMaybe n -- updatableItemAttributesFreeShippingLimit :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesGender :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesGoogleProductCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesGtin :: Maybe Int
    <*> arbitraryReducedMaybe n -- updatableItemAttributesId :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesItemGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesLastUpdatedTime :: Maybe Integer
    <*> arbitraryReducedMaybe n -- updatableItemAttributesLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesMaterial :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesMinAdPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesMobileLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesMpn :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesNumberOfRatings :: Maybe Int
    <*> arbitraryReducedMaybe n -- updatableItemAttributesNumberOfReviews :: Maybe Int
    <*> arbitraryReducedMaybe n -- updatableItemAttributesPattern :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesProductType :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesSalePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesShipping :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesShippingHeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesShippingWeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesShippingWidth :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesSize :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesSizeSystem :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesSizeType :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesTax :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesVariantNames :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updatableItemAttributesVariantValues :: Maybe [Text]
  
instance Arbitrary UpdateAssetGroupBody where
  arbitrary = sized genUpdateAssetGroupBody

genUpdateAssetGroupBody :: Int -> Gen UpdateAssetGroupBody
genUpdateAssetGroupBody n =
  UpdateAssetGroupBody
    <$> arbitraryReducedMaybe n -- updateAssetGroupBodyAssetGroupsToUpdate :: Maybe [UpdateAssetGroupBodyAssetGroupsToUpdateInner]
  
instance Arbitrary UpdateAssetGroupBodyAssetGroupsToUpdateInner where
  arbitrary = sized genUpdateAssetGroupBodyAssetGroupsToUpdateInner

genUpdateAssetGroupBodyAssetGroupsToUpdateInner :: Int -> Gen UpdateAssetGroupBodyAssetGroupsToUpdateInner
genUpdateAssetGroupBodyAssetGroupsToUpdateInner n =
  UpdateAssetGroupBodyAssetGroupsToUpdateInner
    <$> arbitrary -- updateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupId :: Text
    <*> arbitraryReducedMaybe n -- updateAssetGroupBodyAssetGroupsToUpdateInnerName :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateAssetGroupBodyAssetGroupsToUpdateInnerDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupTypes :: Maybe [AssetGroupType]
    <*> arbitraryReducedMaybe n -- updateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToAdd :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToRemove :: Maybe [Text]
  
instance Arbitrary UpdateAssetGroupResponse where
  arbitrary = sized genUpdateAssetGroupResponse

genUpdateAssetGroupResponse :: Int -> Gen UpdateAssetGroupResponse
genUpdateAssetGroupResponse n =
  UpdateAssetGroupResponse
    <$> arbitraryReducedMaybe n -- updateAssetGroupResponseUpdatedAssetGroups :: Maybe [AssetGroupBinding]
    <*> arbitraryReducedMaybe n -- updateAssetGroupResponseExceptions :: Maybe [UpdateAssetGroupResponseExceptionsInner]
  
instance Arbitrary UpdateAssetGroupResponseExceptionsInner where
  arbitrary = sized genUpdateAssetGroupResponseExceptionsInner

genUpdateAssetGroupResponseExceptionsInner :: Int -> Gen UpdateAssetGroupResponseExceptionsInner
genUpdateAssetGroupResponseExceptionsInner n =
  UpdateAssetGroupResponseExceptionsInner
    <$> arbitraryReducedMaybe n -- updateAssetGroupResponseExceptionsInnerCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- updateAssetGroupResponseExceptionsInnerMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateAssetGroupResponseExceptionsInnerAssetGroupId :: Maybe Text
  
instance Arbitrary UpdateInvitesResultsResponseArray where
  arbitrary = sized genUpdateInvitesResultsResponseArray

genUpdateInvitesResultsResponseArray :: Int -> Gen UpdateInvitesResultsResponseArray
genUpdateInvitesResultsResponseArray n =
  UpdateInvitesResultsResponseArray
    <$> arbitraryReducedMaybe n -- updateInvitesResultsResponseArrayItems :: Maybe [UpdateInvitesResultsResponseArrayItemsInner]
  
instance Arbitrary UpdateInvitesResultsResponseArrayItemsInner where
  arbitrary = sized genUpdateInvitesResultsResponseArrayItemsInner

genUpdateInvitesResultsResponseArrayItemsInner :: Int -> Gen UpdateInvitesResultsResponseArrayItemsInner
genUpdateInvitesResultsResponseArrayItemsInner n =
  UpdateInvitesResultsResponseArrayItemsInner
    <$> arbitraryReducedMaybe n -- updateInvitesResultsResponseArrayItemsInnerException :: Maybe InviteExceptionResponse
    <*> arbitraryReducedMaybe n -- updateInvitesResultsResponseArrayItemsInnerInvite :: Maybe InviteBusinessRoleBinding
  
instance Arbitrary UpdateMemberAssetAccessBody where
  arbitrary = sized genUpdateMemberAssetAccessBody

genUpdateMemberAssetAccessBody :: Int -> Gen UpdateMemberAssetAccessBody
genUpdateMemberAssetAccessBody n =
  UpdateMemberAssetAccessBody
    <$> arbitraryReduced n -- updateMemberAssetAccessBodyAccesses :: [UpdateMemberAssetAccessBodyAccessesInner]
  
instance Arbitrary UpdateMemberAssetAccessBodyAccessesInner where
  arbitrary = sized genUpdateMemberAssetAccessBodyAccessesInner

genUpdateMemberAssetAccessBodyAccessesInner :: Int -> Gen UpdateMemberAssetAccessBodyAccessesInner
genUpdateMemberAssetAccessBodyAccessesInner n =
  UpdateMemberAssetAccessBodyAccessesInner
    <$> arbitrary -- updateMemberAssetAccessBodyAccessesInnerAssetId :: Text
    <*> arbitrary -- updateMemberAssetAccessBodyAccessesInnerMemberId :: Text
    <*> arbitraryReduced n -- updateMemberAssetAccessBodyAccessesInnerPermissions :: [Permissions]
  
instance Arbitrary UpdateMemberAssetsResultsResponseArray where
  arbitrary = sized genUpdateMemberAssetsResultsResponseArray

genUpdateMemberAssetsResultsResponseArray :: Int -> Gen UpdateMemberAssetsResultsResponseArray
genUpdateMemberAssetsResultsResponseArray n =
  UpdateMemberAssetsResultsResponseArray
    <$> arbitraryReducedMaybe n -- updateMemberAssetsResultsResponseArrayItems :: Maybe [UpdateMemberAssetsResultsResponseArrayItemsInner]
  
instance Arbitrary UpdateMemberAssetsResultsResponseArrayItemsInner where
  arbitrary = sized genUpdateMemberAssetsResultsResponseArrayItemsInner

genUpdateMemberAssetsResultsResponseArrayItemsInner :: Int -> Gen UpdateMemberAssetsResultsResponseArrayItemsInner
genUpdateMemberAssetsResultsResponseArrayItemsInner n =
  UpdateMemberAssetsResultsResponseArrayItemsInner
    <$> arbitraryReducedMaybe n -- updateMemberAssetsResultsResponseArrayItemsInnerResponse :: Maybe UsersForIndividualAssetResponse
  
instance Arbitrary UpdateMemberBusinessRoleBody where
  arbitrary = sized genUpdateMemberBusinessRoleBody

genUpdateMemberBusinessRoleBody :: Int -> Gen UpdateMemberBusinessRoleBody
genUpdateMemberBusinessRoleBody n =
  UpdateMemberBusinessRoleBody
    <$> arbitraryReduced n -- updateMemberBusinessRoleBodyBusinessRole :: BusinessRoleForMembers
    <*> arbitrary -- updateMemberBusinessRoleBodyMemberId :: Text
  
instance Arbitrary UpdateMemberResult where
  arbitrary = sized genUpdateMemberResult

genUpdateMemberResult :: Int -> Gen UpdateMemberResult
genUpdateMemberResult n =
  UpdateMemberResult
    <$> arbitraryReducedMaybe n -- updateMemberResultBusinessRole :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateMemberResultMemberId :: Maybe Text
  
instance Arbitrary UpdateMemberResultsResponseArray where
  arbitrary = sized genUpdateMemberResultsResponseArray

genUpdateMemberResultsResponseArray :: Int -> Gen UpdateMemberResultsResponseArray
genUpdateMemberResultsResponseArray n =
  UpdateMemberResultsResponseArray
    <$> arbitraryReducedMaybe n -- updateMemberResultsResponseArrayItems :: Maybe [UpdateMemberResult]
  
instance Arbitrary UpdatePartnerAssetAccessBody where
  arbitrary = sized genUpdatePartnerAssetAccessBody

genUpdatePartnerAssetAccessBody :: Int -> Gen UpdatePartnerAssetAccessBody
genUpdatePartnerAssetAccessBody n =
  UpdatePartnerAssetAccessBody
    <$> arbitraryReduced n -- updatePartnerAssetAccessBodyAccesses :: [UpdatePartnerAssetAccessBodyAccessesInner]
  
instance Arbitrary UpdatePartnerAssetAccessBodyAccessesInner where
  arbitrary = sized genUpdatePartnerAssetAccessBodyAccessesInner

genUpdatePartnerAssetAccessBodyAccessesInner :: Int -> Gen UpdatePartnerAssetAccessBodyAccessesInner
genUpdatePartnerAssetAccessBodyAccessesInner n =
  UpdatePartnerAssetAccessBodyAccessesInner
    <$> arbitrary -- updatePartnerAssetAccessBodyAccessesInnerPartnerId :: Text
    <*> arbitrary -- updatePartnerAssetAccessBodyAccessesInnerAssetId :: Text
    <*> arbitraryReduced n -- updatePartnerAssetAccessBodyAccessesInnerPermissions :: [Permissions]
  
instance Arbitrary UpdatePartnerAssetsResult where
  arbitrary = sized genUpdatePartnerAssetsResult

genUpdatePartnerAssetsResult :: Int -> Gen UpdatePartnerAssetsResult
genUpdatePartnerAssetsResult n =
  UpdatePartnerAssetsResult
    <$> arbitraryReducedMaybe n -- updatePartnerAssetsResultAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatePartnerAssetsResultAssetType :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatePartnerAssetsResultPartnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatePartnerAssetsResultPermissions :: Maybe [Text]
  
instance Arbitrary UpdatePartnerAssetsResultsResponseArray where
  arbitrary = sized genUpdatePartnerAssetsResultsResponseArray

genUpdatePartnerAssetsResultsResponseArray :: Int -> Gen UpdatePartnerAssetsResultsResponseArray
genUpdatePartnerAssetsResultsResponseArray n =
  UpdatePartnerAssetsResultsResponseArray
    <$> arbitraryReducedMaybe n -- updatePartnerAssetsResultsResponseArrayItems :: Maybe [UpdatePartnerAssetsResult]
  
instance Arbitrary UpdatePartnerResultsResponseArray where
  arbitrary = sized genUpdatePartnerResultsResponseArray

genUpdatePartnerResultsResponseArray :: Int -> Gen UpdatePartnerResultsResponseArray
genUpdatePartnerResultsResponseArray n =
  UpdatePartnerResultsResponseArray
    <$> arbitraryReducedMaybe n -- updatePartnerResultsResponseArrayItems :: Maybe [UpdatePartnerResultsResponseArrayItemsInner]
  
instance Arbitrary UpdatePartnerResultsResponseArrayItemsInner where
  arbitrary = sized genUpdatePartnerResultsResponseArrayItemsInner

genUpdatePartnerResultsResponseArrayItemsInner :: Int -> Gen UpdatePartnerResultsResponseArrayItemsInner
genUpdatePartnerResultsResponseArrayItemsInner n =
  UpdatePartnerResultsResponseArrayItemsInner
    <$> arbitraryReducedMaybe n -- updatePartnerResultsResponseArrayItemsInnerException :: Maybe BusinessAccessError
    <*> arbitraryReducedMaybe n -- updatePartnerResultsResponseArrayItemsInnerMemberOrPartnerId :: Maybe Text
  
instance Arbitrary UserAccountFollowedInterests200Response where
  arbitrary = sized genUserAccountFollowedInterests200Response

genUserAccountFollowedInterests200Response :: Int -> Gen UserAccountFollowedInterests200Response
genUserAccountFollowedInterests200Response n =
  UserAccountFollowedInterests200Response
    <$> arbitraryReduced n -- userAccountFollowedInterests200ResponseItems :: [Interest]
    <*> arbitraryReducedMaybe n -- userAccountFollowedInterests200ResponseBookmark :: Maybe Text
  
instance Arbitrary UserBusinessRoleBinding where
  arbitrary = sized genUserBusinessRoleBinding

genUserBusinessRoleBinding :: Int -> Gen UserBusinessRoleBinding
genUserBusinessRoleBinding n =
  UserBusinessRoleBinding
    <$> arbitraryReducedMaybe n -- userBusinessRoleBindingAssetsSummary :: Maybe BusinessMemberAssetsSummary
    <*> arbitraryReducedMaybe n -- userBusinessRoleBindingBusinessRoles :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- userBusinessRoleBindingCreatedByBusiness :: Maybe BusinessAccessUserSummary
    <*> arbitraryReducedMaybe n -- userBusinessRoleBindingCreatedByUser :: Maybe BusinessAccessUserSummary
    <*> arbitraryReducedMaybe n -- userBusinessRoleBindingCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- userBusinessRoleBindingId :: Maybe Text
    <*> arbitraryReducedMaybe n -- userBusinessRoleBindingIsSharedPartner :: Maybe Bool
    <*> arbitraryReducedMaybe n -- userBusinessRoleBindingUser :: Maybe BusinessAccessUserSummary
  
instance Arbitrary UserFollowingGet200Response where
  arbitrary = sized genUserFollowingGet200Response

genUserFollowingGet200Response :: Int -> Gen UserFollowingGet200Response
genUserFollowingGet200Response n =
  UserFollowingGet200Response
    <$> arbitraryReduced n -- userFollowingGet200ResponseItems :: [UserSummary]
    <*> arbitraryReducedMaybe n -- userFollowingGet200ResponseBookmark :: Maybe Text
  
instance Arbitrary UserSingleAssetBinding where
  arbitrary = sized genUserSingleAssetBinding

genUserSingleAssetBinding :: Int -> Gen UserSingleAssetBinding
genUserSingleAssetBinding n =
  UserSingleAssetBinding
    <$> arbitraryReducedMaybe n -- userSingleAssetBindingPermissions :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- userSingleAssetBindingUser :: Maybe BusinessAccessUserSummary
  
instance Arbitrary UserSummary where
  arbitrary = sized genUserSummary

genUserSummary :: Int -> Gen UserSummary
genUserSummary n =
  UserSummary
    <$> arbitraryReducedMaybe n -- userSummaryUsername :: Maybe Text
    <*> arbitraryReducedMaybe n -- userSummaryType :: Maybe Text
  
instance Arbitrary UserWebsiteSummary where
  arbitrary = sized genUserWebsiteSummary

genUserWebsiteSummary :: Int -> Gen UserWebsiteSummary
genUserWebsiteSummary n =
  UserWebsiteSummary
    <$> arbitraryReducedMaybe n -- userWebsiteSummaryWebsite :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteSummaryStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteSummaryVerifiedAt :: Maybe Text
  
instance Arbitrary UserWebsiteVerificationCode where
  arbitrary = sized genUserWebsiteVerificationCode

genUserWebsiteVerificationCode :: Int -> Gen UserWebsiteVerificationCode
genUserWebsiteVerificationCode n =
  UserWebsiteVerificationCode
    <$> arbitraryReducedMaybe n -- userWebsiteVerificationCodeVerificationCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationCodeDnsTxtRecord :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationCodeMetatag :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationCodeFilename :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationCodeFileContent :: Maybe Text
  
instance Arbitrary UserWebsiteVerifyRequest where
  arbitrary = sized genUserWebsiteVerifyRequest

genUserWebsiteVerifyRequest :: Int -> Gen UserWebsiteVerifyRequest
genUserWebsiteVerifyRequest n =
  UserWebsiteVerifyRequest
    <$> arbitraryReducedMaybe n -- userWebsiteVerifyRequestWebsite :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerifyRequestVerificationMethod :: Maybe E'VerificationMethod
  
instance Arbitrary UserWebsitesGet200Response where
  arbitrary = sized genUserWebsitesGet200Response

genUserWebsitesGet200Response :: Int -> Gen UserWebsitesGet200Response
genUserWebsitesGet200Response n =
  UserWebsitesGet200Response
    <$> arbitraryReduced n -- userWebsitesGet200ResponseItems :: [UserWebsiteSummary]
    <*> arbitraryReducedMaybe n -- userWebsitesGet200ResponseBookmark :: Maybe Text
  
instance Arbitrary UsersForIndividualAssetResponse where
  arbitrary = sized genUsersForIndividualAssetResponse

genUsersForIndividualAssetResponse :: Int -> Gen UsersForIndividualAssetResponse
genUsersForIndividualAssetResponse n =
  UsersForIndividualAssetResponse
    <$> arbitraryReducedMaybe n -- usersForIndividualAssetResponseAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usersForIndividualAssetResponseMemberId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usersForIndividualAssetResponsePermissions :: Maybe [Text]
  
instance Arbitrary VideoMetadata where
  arbitrary = sized genVideoMetadata

genVideoMetadata :: Int -> Gen VideoMetadata
genVideoMetadata n =
  VideoMetadata
    <$> arbitraryReducedMaybe n -- videoMetadataItemType :: Maybe Text
    <*> arbitraryReducedMaybe n -- videoMetadataCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- videoMetadataVideoUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- videoMetadataDuration :: Maybe Double
    <*> arbitraryReducedMaybe n -- videoMetadataHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- videoMetadataWidth :: Maybe Int
  



instance Arbitrary ActionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdCountry where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdGroupSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsAdTargetingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsCampaignTargetingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsFilterColumn where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsFilterOperator where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsTargetingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdvancedAuctionOperation where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AssetGroupType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceAccountType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceDataParty where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceInsightType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceShareType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceSharingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceUpdateOperationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BatchOperation where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BatchOperationStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BudgetType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BulkEntityType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BulkOutputFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BulkReportingJobStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BulkUpsertStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BusinessAccessRole where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BusinessRole where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BusinessRoleCheckMode where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BusinessRoleForMembers where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsFeedProcessingStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsItemValidationIssue where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsLocale where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsProductGroupStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsProductGroupType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionAttributionWindowDays where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionReportAttributionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionReportTimeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionTagType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Country where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CreativeAssetsVisibilityType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CreativeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Currency where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DataOutputFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DataStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AccountType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AccountType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AgeBucket where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Ages where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AppTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Apptype where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AssetType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'BidStrategyType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'BusinessRole where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CardType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CatalogType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CatalogType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CatalogType3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Category where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ClickWindowDays where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Columns where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Columns2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ContentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ContentType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ConversionEvent where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ConversionLearningModeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ConversionReportTimeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CreatedInLastNDays where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CreationSource where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CreativeTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CustomizableCtaType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'DiscountType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'EntityStatuses where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'EventType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FromClaimedContent where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Gender where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Genders where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'GrantType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Granularity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'IngestionSources where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Interests where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'InviteStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'LargeProductCountDecrease where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Level where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'LogLevel where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Method where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MetricTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MetricTypes2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OneOf0 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OneOf1 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operation where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operation2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operation3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operation4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OperationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operator where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Order where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OrderLineType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OwnershipType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PartnerType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PaymentMethodBrand where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PinFilter where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PinFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PinType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Placement where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PrimarySort where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Privacy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Privacy2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Privacy3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Range where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'RejectedReasons where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReportStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReportStatus2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReportType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReportType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReportType3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReportType4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReviewStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Severity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SortBy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SortBy2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SortBy3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SortBy4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Source where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SourceType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SourceType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SourceType3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SourceType4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SourceType5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SourceType6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SplitField where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SplitField2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'TargetingStrategy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'TargetingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'TieBreakerType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Timerange where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Timezone where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'VerificationMethod where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary EnhancedMatchStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary EntityStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Gender where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GetAudiencesOrderBy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GetBusinessAssetTypeResponse where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Granularity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GridClickType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary InviteStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary InviteType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ItemProcessingStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Language where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LeadFormQuestionFieldType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LeadFormQuestionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LeadFormStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LeadsExportStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MMMReportingColumn where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MMMReportingTargetingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MatchType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MatchTypeResponse where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MediaType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MediaUploadStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MediaUploadType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MemberBusinessRole where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MetricsReportingLevel where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NonNullableCatalogsCurrency where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NonNullableProductAvailabilityType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NullableCatalogsItemFieldType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NullableCurrency where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ObjectiveType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OperationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderLinePaidType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderLineStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PacingDeliveryType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PartnerType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Permissions where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PermissionsWithOwner where
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

instance Arbitrary Role where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingAdvertiserCountry where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingSpecAppType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TrendType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TrendsSupportedRegion where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UpdateMaskBidOptionField where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UpdateMaskFieldType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UserFollowingFeedType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UserListOperationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UserListType where
  arbitrary = arbitraryBoundedEnum

