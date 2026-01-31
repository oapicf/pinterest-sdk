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
    <$> arbitraryReducedMaybe n -- accountAbout :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountAccountType :: Maybe E'AccountType
    <*> arbitraryReducedMaybe n -- accountBoardCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- accountBusinessName :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountFollowerCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- accountFollowingCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- accountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountMonthlyViews :: Maybe Int
    <*> arbitraryReducedMaybe n -- accountPinCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- accountProfileImage :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountUsername :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountWebsiteUrl :: Maybe Text
  
instance Arbitrary AdAccount where
  arbitrary = sized genAdAccount

genAdAccount :: Int -> Gen AdAccount
genAdAccount n =
  AdAccount
    <$> arbitraryReducedMaybe n -- adAccountCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- adAccountCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adAccountCurrency :: Maybe Currency
    <*> arbitrary -- adAccountId :: Text
    <*> arbitraryReducedMaybe n -- adAccountName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountOwner :: Maybe AdAccountOwner
    <*> arbitraryReducedMaybe n -- adAccountPermissions :: Maybe [BusinessAccessRole]
    <*> arbitraryReducedMaybe n -- adAccountUpdatedTime :: Maybe Int
  
instance Arbitrary AdAccountAnalyticsResponseInner where
  arbitrary = sized genAdAccountAnalyticsResponseInner

genAdAccountAnalyticsResponseInner :: Int -> Gen AdAccountAnalyticsResponseInner
genAdAccountAnalyticsResponseInner n =
  AdAccountAnalyticsResponseInner
    <$> arbitrary -- adAccountAnalyticsResponseInnerAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- adAccountAnalyticsResponseInnerDate :: Maybe Date
  
instance Arbitrary AdAccountCreate where
  arbitrary = sized genAdAccountCreate

genAdAccountCreate :: Int -> Gen AdAccountCreate
genAdAccountCreate n =
  AdAccountCreate
    <$> arbitraryReducedMaybe n -- adAccountCreateCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- adAccountCreateCurrency :: Maybe Currency
    <*> arbitraryReducedMaybe n -- adAccountCreateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateOwnerUserId :: Maybe Text
  
instance Arbitrary AdAccountCreateSubscriptionRequest where
  arbitrary = sized genAdAccountCreateSubscriptionRequest

genAdAccountCreateSubscriptionRequest :: Int -> Gen AdAccountCreateSubscriptionRequest
genAdAccountCreateSubscriptionRequest n =
  AdAccountCreateSubscriptionRequest
    <$> arbitraryReducedMaybe n -- adAccountCreateSubscriptionRequestLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionRequestPartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionRequestPartnerMetadata :: Maybe AdAccountCreateSubscriptionRequestPartnerMetadata
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionRequestPartnerRefreshToken :: Maybe Text
    <*> arbitrary -- adAccountCreateSubscriptionRequestWebhookUrl :: Text
  
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
    <$> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseApiVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseCryptographicAlgorithm :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseCryptographicKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseUserAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateSubscriptionResponseWebhookUrl :: Maybe Text
  
instance Arbitrary AdAccountGetSubscriptionResponse where
  arbitrary = sized genAdAccountGetSubscriptionResponse

genAdAccountGetSubscriptionResponse :: Int -> Gen AdAccountGetSubscriptionResponse
genAdAccountGetSubscriptionResponse n =
  AdAccountGetSubscriptionResponse
    <$> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseWebhookUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseApiVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseCryptographicAlgorithm :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseCryptographicKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountGetSubscriptionResponseUserAccountId :: Maybe Text
  
instance Arbitrary AdAccountOwner where
  arbitrary = sized genAdAccountOwner

genAdAccountOwner :: Int -> Gen AdAccountOwner
genAdAccountOwner n =
  AdAccountOwner
    <$> arbitraryReducedMaybe n -- adAccountOwnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountOwnerUsername :: Maybe Text
  
instance Arbitrary AdAccountsAudiencesSharedAccountsList200Response where
  arbitrary = sized genAdAccountsAudiencesSharedAccountsList200Response

genAdAccountsAudiencesSharedAccountsList200Response :: Int -> Gen AdAccountsAudiencesSharedAccountsList200Response
genAdAccountsAudiencesSharedAccountsList200Response n =
  AdAccountsAudiencesSharedAccountsList200Response
    <$> arbitraryReducedMaybe n -- adAccountsAudiencesSharedAccountsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- adAccountsAudiencesSharedAccountsList200ResponseItems :: [SharedAudienceAccount]
  
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
    <$> arbitraryReducedMaybe n -- adAccountsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- adAccountsList200ResponseItems :: [AdAccount]
  
instance Arbitrary AdAccountsSubscriptionsGetList200Response where
  arbitrary = sized genAdAccountsSubscriptionsGetList200Response

genAdAccountsSubscriptionsGetList200Response :: Int -> Gen AdAccountsSubscriptionsGetList200Response
genAdAccountsSubscriptionsGetList200Response n =
  AdAccountsSubscriptionsGetList200Response
    <$> arbitraryReducedMaybe n -- adAccountsSubscriptionsGetList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- adAccountsSubscriptionsGetList200ResponseItems :: [LeadSubscription]
  
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
    <*> arbitraryReducedMaybe n -- adCommonCustomizableCtaType :: Maybe CustomizableCTAType
    <*> arbitraryReducedMaybe n -- adCommonDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonDisclosureType :: Maybe DisclosureType
    <*> arbitraryReducedMaybe n -- adCommonDisclosureUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adCommonIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCommonIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCommonLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonQuizPinData :: Maybe QuizPinData
    <*> arbitraryReducedMaybe n -- adCommonStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adCommonTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adCommonViewTrackingUrl :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- adCreateRequestCustomizableCtaType :: Maybe CustomizableCTAType
    <*> arbitraryReducedMaybe n -- adCreateRequestDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestDisclosureType :: Maybe DisclosureType
    <*> arbitraryReducedMaybe n -- adCreateRequestDisclosureUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adCreateRequestIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateRequestIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateRequestLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestQuizPinData :: Maybe QuizPinData
    <*> arbitraryReducedMaybe n -- adCreateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adCreateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adCreateRequestViewTrackingUrl :: Maybe Text
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
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingRequestCreativeTypes :: Maybe [E'CreativeTypes]
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingRequestKeywords :: Maybe [AdGroupAudienceSizingRequestKeywordsInner]
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingRequestPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingRequestProductGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingRequestTargetingSpec :: Maybe TargetingSpec
  
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
    <$> arbitraryReducedMaybe n -- adGroupCommonAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCommonBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonBidStrategyType :: Maybe E'BidStrategyType
    <*> arbitraryReducedMaybe n -- adGroupCommonBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupCommonBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupCommonCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCommonEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCommonLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCommonOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupCommonPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupCommonPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupCommonPromotionApplicationLevel :: Maybe E'PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupCommonPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCommonStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupCommonTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupCommonTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupCommonTrackingUrls :: Maybe TrackingUrls
  
instance Arbitrary AdGroupCreateRequest where
  arbitrary = sized genAdGroupCreateRequest

genAdGroupCreateRequest :: Int -> Gen AdGroupCreateRequest
genAdGroupCreateRequest n =
  AdGroupCreateRequest
    <$> arbitraryReducedMaybe n -- adGroupCreateRequestAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBidStrategyType :: Maybe E'BidStrategyType
    <*> arbitraryReduced n -- adGroupCreateRequestBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBudgetType :: Maybe BudgetType
    <*> arbitrary -- adGroupCreateRequestCampaignId :: Text
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestLifetimeFrequencyCap :: Maybe Int
    <*> arbitrary -- adGroupCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPromotionApplicationLevel :: Maybe E'PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBidMultiplier :: Maybe Double
  
instance Arbitrary AdGroupIdFilter where
  arbitrary = sized genAdGroupIdFilter

genAdGroupIdFilter :: Int -> Gen AdGroupIdFilter
genAdGroupIdFilter n =
  AdGroupIdFilter
    <$> arbitraryReducedMaybe n -- adGroupIdFilterAdGroupIds :: Maybe [Text]
  
instance Arbitrary AdGroupResponse where
  arbitrary = sized genAdGroupResponse

genAdGroupResponse :: Int -> Gen AdGroupResponse
genAdGroupResponse n =
  AdGroupResponse
    <$> arbitraryReducedMaybe n -- adGroupResponseAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupResponseBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseBidStrategyType :: Maybe E'BidStrategyType
    <*> arbitraryReducedMaybe n -- adGroupResponseBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupResponseBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupResponseCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupResponseLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupResponsePacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupResponsePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupResponsePromotionApplicationLevel :: Maybe E'PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupResponsePromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupResponseTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupResponseTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupResponseTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseBidMultiplier :: Maybe Double
    <*> arbitraryReducedMaybe n -- adGroupResponseConversionLearningModeType :: Maybe E'ConversionLearningModeType
    <*> arbitraryReducedMaybe n -- adGroupResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseDcaAssets :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- adGroupResponseFeedProfileId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseSummaryStatus :: Maybe AdGroupSummaryStatus
    <*> arbitraryReducedMaybe n -- adGroupResponseType :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseUpdatedTime :: Maybe Int
  
instance Arbitrary AdGroupUpdateRequest where
  arbitrary = sized genAdGroupUpdateRequest

genAdGroupUpdateRequest :: Int -> Gen AdGroupUpdateRequest
genAdGroupUpdateRequest n =
  AdGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- adGroupUpdateRequestAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBidStrategyType :: Maybe E'BidStrategyType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPromotionApplicationLevel :: Maybe E'PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBidMultiplier :: Maybe Double
    <*> arbitrary -- adGroupUpdateRequestId :: Text
  
instance Arbitrary AdGroupsAnalyticsResponseInner where
  arbitrary = sized genAdGroupsAnalyticsResponseInner

genAdGroupsAnalyticsResponseInner :: Int -> Gen AdGroupsAnalyticsResponseInner
genAdGroupsAnalyticsResponseInner n =
  AdGroupsAnalyticsResponseInner
    <$> arbitraryReducedMaybe n -- adGroupsAnalyticsResponseInnerAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupsAnalyticsResponseInnerDate :: Maybe Date
  
instance Arbitrary AdGroupsList200Response where
  arbitrary = sized genAdGroupsList200Response

genAdGroupsList200Response :: Int -> Gen AdGroupsList200Response
genAdGroupsList200Response n =
  AdGroupsList200Response
    <$> arbitraryReducedMaybe n -- adGroupsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- adGroupsList200ResponseItems :: [AdGroupResponse]
  
instance Arbitrary AdPinAnalytics where
  arbitrary = sized genAdPinAnalytics

genAdPinAnalytics :: Int -> Gen AdPinAnalytics
genAdPinAnalytics n =
  AdPinAnalytics
    <$> arbitraryReducedMaybe n -- adPinAnalyticsDate :: Maybe Date
    <*> arbitrary -- adPinAnalyticsPinId :: Text
  
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
    <*> arbitrary -- adPreviewRequestCatalogProductGroupId :: Text
    <*> arbitrary -- adPreviewRequestCreativeType :: E'CreativeType
    <*> arbitraryReducedMaybe n -- adPreviewRequestCustomizableCtaType :: Maybe CustomizableCTAType
    <*> arbitraryReducedMaybe n -- adPreviewRequestHeroImageTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestHeroImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestHeroPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestImageTag :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestPreferredMediaType :: Maybe E'PreferredMediaType
    <*> arbitraryReducedMaybe n -- adPreviewRequestVideoTag :: Maybe Text
  
instance Arbitrary AdPreviewShopping where
  arbitrary = sized genAdPreviewShopping

genAdPreviewShopping :: Int -> Gen AdPreviewShopping
genAdPreviewShopping n =
  AdPreviewShopping
    <$> arbitrary -- adPreviewShoppingCatalogProductGroupId :: Text
    <*> arbitrary -- adPreviewShoppingCreativeType :: E'CreativeType
    <*> arbitraryReducedMaybe n -- adPreviewShoppingCustomizableCtaType :: Maybe CustomizableCTAType
    <*> arbitraryReducedMaybe n -- adPreviewShoppingHeroImageTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewShoppingHeroImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewShoppingHeroPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewShoppingImageTag :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewShoppingItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewShoppingPreferredMediaType :: Maybe E'PreferredMediaType
    <*> arbitraryReducedMaybe n -- adPreviewShoppingVideoTag :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- adResponseCustomizableCtaType :: Maybe CustomizableCTAType
    <*> arbitraryReducedMaybe n -- adResponseDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseDisclosureType :: Maybe DisclosureType
    <*> arbitraryReducedMaybe n -- adResponseDisclosureUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adResponseIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adResponseIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adResponseLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseQuizPinData :: Maybe QuizPinData
    <*> arbitraryReducedMaybe n -- adResponseStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adResponseTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adResponseViewTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponsePinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseCollectionItemsDestinationUrlTemplate :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseRejectedReasons :: Maybe [E'RejectedReasons]
    <*> arbitraryReducedMaybe n -- adResponseRejectionLabels :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adResponseReviewStatus :: Maybe E'ReviewStatus
    <*> arbitraryReducedMaybe n -- adResponseSummaryStatus :: Maybe PinPromotionSummaryStatus
    <*> arbitraryReducedMaybe n -- adResponseType :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseUpdatedTime :: Maybe Int
  
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
    <*> arbitraryReducedMaybe n -- adUpdateRequestCustomizableCtaType :: Maybe CustomizableCTAType
    <*> arbitraryReducedMaybe n -- adUpdateRequestDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestDisclosureType :: Maybe DisclosureType
    <*> arbitraryReducedMaybe n -- adUpdateRequestDisclosureUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adUpdateRequestIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adUpdateRequestIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adUpdateRequestLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestQuizPinData :: Maybe QuizPinData
    <*> arbitraryReducedMaybe n -- adUpdateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adUpdateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adUpdateRequestViewTrackingUrl :: Maybe Text
    <*> arbitrary -- adUpdateRequestId :: Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestPinId :: Maybe Text
  
instance Arbitrary AdsAnalyticsCreateAsyncRequest where
  arbitrary = sized genAdsAnalyticsCreateAsyncRequest

genAdsAnalyticsCreateAsyncRequest :: Int -> Gen AdsAnalyticsCreateAsyncRequest
genAdsAnalyticsCreateAsyncRequest n =
  AdsAnalyticsCreateAsyncRequest
    <$> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAttributionTypes :: Maybe [ConversionReportAttributionType]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestClickWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestConversionReportTime :: Maybe ConversionReportTimeType
    <*> arbitrary -- adsAnalyticsCreateAsyncRequestEndDate :: Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestEngagementWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestGranularity :: Granularity
    <*> arbitrary -- adsAnalyticsCreateAsyncRequestStartDate :: Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestViewWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignStatuses :: Maybe [CampaignSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignObjectiveTypes :: Maybe [ObjectiveType]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignBrandLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdGroupStatuses :: Maybe [AdGroupSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdStatuses :: Maybe [PinPromotionSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestProductGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestProductGroupStatuses :: Maybe [ProductGroupSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestProductItemIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestTargetingTypes :: Maybe [E'TargetingTypes]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestMetricsFilters :: Maybe [AdsAnalyticsMetricsFilter]
    <*> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestColumns :: [ReportingColumnAsync]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCombineTargetingTypes :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCustomConversionEventMetrics :: Maybe [AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestEndHour :: Maybe Int
    <*> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestLevel :: MetricsReportingLevel
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestPrimarySort :: Maybe E'PrimarySort
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestReportFormat :: Maybe DataOutputFormat
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestReportingTimezone :: Maybe ReportingTimeZone
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestStartHour :: Maybe Int
  
instance Arbitrary AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics where
  arbitrary = sized genAdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics

genAdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics :: Int -> Gen AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
genAdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics n =
  AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
    <$> arbitrary -- adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsType :: E'CustomEventMetricsType
    <*> arbitrary -- adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventName :: Text
  
instance Arbitrary AdsAnalyticsCreateAsyncResponse where
  arbitrary = sized genAdsAnalyticsCreateAsyncResponse

genAdsAnalyticsCreateAsyncResponse :: Int -> Gen AdsAnalyticsCreateAsyncResponse
genAdsAnalyticsCreateAsyncResponse n =
  AdsAnalyticsCreateAsyncResponse
    <$> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncResponseMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncResponseReportStatus :: Maybe BulkReportingJobStatus
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncResponseToken :: Maybe Text
  
instance Arbitrary AdsAnalyticsGetAsyncResponse where
  arbitrary = sized genAdsAnalyticsGetAsyncResponse

genAdsAnalyticsGetAsyncResponse :: Int -> Gen AdsAnalyticsGetAsyncResponse
genAdsAnalyticsGetAsyncResponse n =
  AdsAnalyticsGetAsyncResponse
    <$> arbitraryReducedMaybe n -- adsAnalyticsGetAsyncResponseReportStatus :: Maybe BulkReportingJobStatus
    <*> arbitraryReducedMaybe n -- adsAnalyticsGetAsyncResponseSize :: Maybe Double
    <*> arbitraryReducedMaybe n -- adsAnalyticsGetAsyncResponseUrl :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseDiscountCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseDiscountInMicroCurrency :: Maybe Double
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseDiscountType :: Maybe E'DiscountType
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseRemainingDiscountInMicroCurrency :: Maybe Double
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseTitle :: Maybe Text
  
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
    <$> arbitraryReducedMaybe n -- adsCreditRedeemResponseErrorCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- adsCreditRedeemResponseErrorMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsCreditRedeemResponseSuccess :: Maybe Bool
  
instance Arbitrary AdsCreditsDiscountsGet200Response where
  arbitrary = sized genAdsCreditsDiscountsGet200Response

genAdsCreditsDiscountsGet200Response :: Int -> Gen AdsCreditsDiscountsGet200Response
genAdsCreditsDiscountsGet200Response n =
  AdsCreditsDiscountsGet200Response
    <$> arbitraryReducedMaybe n -- adsCreditsDiscountsGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- adsCreditsDiscountsGet200ResponseItems :: [AdsCreditDiscountsResponse]
  
instance Arbitrary AdsList200Response where
  arbitrary = sized genAdsList200Response

genAdsList200Response :: Int -> Gen AdsList200Response
genAdsList200Response n =
  AdsList200Response
    <$> arbitraryReducedMaybe n -- adsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- adsList200ResponseItems :: [AdResponse]
  
instance Arbitrary AdvancedAuctionBidOptions where
  arbitrary = sized genAdvancedAuctionBidOptions

genAdvancedAuctionBidOptions :: Int -> Gen AdvancedAuctionBidOptions
genAdvancedAuctionBidOptions n =
  AdvancedAuctionBidOptions
    <$> arbitraryReducedMaybe n -- advancedAuctionBidOptionsAppTypeMultipliers :: Maybe AppTypeMultipliers
    <*> arbitraryReducedMaybe n -- advancedAuctionBidOptionsBidInMicroCurrency :: Maybe Integer
    <*> arbitraryReducedMaybe n -- advancedAuctionBidOptionsPlacementMultipliers :: Maybe PlacementMultipliers
  
instance Arbitrary AdvancedAuctionItem where
  arbitrary = sized genAdvancedAuctionItem

genAdvancedAuctionItem :: Int -> Gen AdvancedAuctionItem
genAdvancedAuctionItem n =
  AdvancedAuctionItem
    <$> arbitraryReduced n -- advancedAuctionItemCountry :: Country
    <*> arbitrary -- advancedAuctionItemItemId :: Text
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
    <$> arbitraryReduced n -- advancedAuctionItemsGetRecordCountry :: Country
    <*> arbitrary -- advancedAuctionItemsGetRecordItemId :: Text
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
    <$> arbitraryReduced n -- advancedAuctionItemsSubmitDeleteRecordCountry :: Country
    <*> arbitrary -- advancedAuctionItemsSubmitDeleteRecordItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitDeleteRecordLanguage :: Language
    <*> arbitraryReducedMaybe n -- advancedAuctionItemsSubmitDeleteRecordErrors :: Maybe [AdvancedAuctionOperationError]
  
instance Arbitrary AdvancedAuctionItemsSubmitRecord where
  arbitrary = sized genAdvancedAuctionItemsSubmitRecord

genAdvancedAuctionItemsSubmitRecord :: Int -> Gen AdvancedAuctionItemsSubmitRecord
genAdvancedAuctionItemsSubmitRecord n =
  AdvancedAuctionItemsSubmitRecord
    <$> arbitraryReduced n -- advancedAuctionItemsSubmitRecordOperation :: AdvancedAuctionOperation
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitRecordCountry :: Country
    <*> arbitrary -- advancedAuctionItemsSubmitRecordItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitRecordLanguage :: Language
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitRecordBidOptions :: AdvancedAuctionBidOptions
    <*> arbitraryReducedMaybe n -- advancedAuctionItemsSubmitRecordErrors :: Maybe [AdvancedAuctionOperationError]
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
    <$> arbitraryReduced n -- advancedAuctionItemsSubmitUpsertRecordCountry :: Country
    <*> arbitrary -- advancedAuctionItemsSubmitUpsertRecordItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitUpsertRecordLanguage :: Language
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitUpsertRecordBidOptions :: AdvancedAuctionBidOptions
    <*> arbitraryReducedMaybe n -- advancedAuctionItemsSubmitUpsertRecordErrors :: Maybe [AdvancedAuctionOperationError]
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitUpsertRecordUpdateMask :: [UpdateMaskBidOptionField]
  
instance Arbitrary AdvancedAuctionKey where
  arbitrary = sized genAdvancedAuctionKey

genAdvancedAuctionKey :: Int -> Gen AdvancedAuctionKey
genAdvancedAuctionKey n =
  AdvancedAuctionKey
    <$> arbitraryReduced n -- advancedAuctionKeyCountry :: Country
    <*> arbitrary -- advancedAuctionKeyItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionKeyLanguage :: Language
  
instance Arbitrary AdvancedAuctionOperationError where
  arbitrary = sized genAdvancedAuctionOperationError

genAdvancedAuctionOperationError :: Int -> Gen AdvancedAuctionOperationError
genAdvancedAuctionOperationError n =
  AdvancedAuctionOperationError
    <$> arbitraryReducedMaybe n -- advancedAuctionOperationErrorCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- advancedAuctionOperationErrorMessage :: Maybe Text
  
instance Arbitrary AdvancedAuctionProcessedItems where
  arbitrary = sized genAdvancedAuctionProcessedItems

genAdvancedAuctionProcessedItems :: Int -> Gen AdvancedAuctionProcessedItems
genAdvancedAuctionProcessedItems n =
  AdvancedAuctionProcessedItems
    <$> arbitraryReducedMaybe n -- advancedAuctionProcessedItemsCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- advancedAuctionProcessedItemsItems :: Maybe [AdvancedAuctionItemsSubmitRecord]
  
instance Arbitrary AdvertiserDefinedEvent where
  arbitrary = sized genAdvertiserDefinedEvent

genAdvertiserDefinedEvent :: Int -> Gen AdvertiserDefinedEvent
genAdvertiserDefinedEvent n =
  AdvertiserDefinedEvent
    <$> arbitraryReducedMaybe n -- advertiserDefinedEventName :: Maybe Text
    <*> arbitraryReducedMaybe n -- advertiserDefinedEventMappedConversionType :: Maybe E'MappedConversionType
  
instance Arbitrary AdvertiserDefinedEventsResponse where
  arbitrary = sized genAdvertiserDefinedEventsResponse

genAdvertiserDefinedEventsResponse :: Int -> Gen AdvertiserDefinedEventsResponse
genAdvertiserDefinedEventsResponse n =
  AdvertiserDefinedEventsResponse
    <$> arbitraryReducedMaybe n -- advertiserDefinedEventsResponseItems :: Maybe [AdvertiserDefinedEvent]
  
instance Arbitrary AllOf where
  arbitrary = sized genAllOf

genAllOf :: Int -> Gen AllOf
genAllOf n =
  AllOf
    <$> arbitraryReduced n -- allOfAllOf :: [CatalogsProductGroupFilterKeys]
  
instance Arbitrary AmazonConnectRequest where
  arbitrary = sized genAmazonConnectRequest

genAmazonConnectRequest :: Int -> Gen AmazonConnectRequest
genAmazonConnectRequest n =
  AmazonConnectRequest
    <$> arbitraryReducedMaybe n -- amazonConnectRequestAmazonStorefrontId :: Maybe Text
    <*> arbitrary -- amazonConnectRequestAmazonStorefrontName :: Text
    <*> arbitrary -- amazonConnectRequestAmazonStorefrontUrl :: Text
    <*> arbitraryReducedMaybe n -- amazonConnectRequestAmazonUserId :: Maybe Text
    <*> arbitrary -- amazonConnectRequestIsAmazonAccountLinked :: Bool
    <*> arbitraryReducedMaybe n -- amazonConnectRequestOneTimePasscode :: Maybe Text
    <*> arbitraryReducedMaybe n -- amazonConnectRequestPinterestUserId :: Maybe Text
  
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
    <$> arbitraryReducedMaybe n -- analyticsMetricsResponseDailyMetrics :: Maybe [AnalyticsDailyMetrics]
    <*> arbitraryReducedMaybe n -- analyticsMetricsResponseSummaryMetrics :: Maybe (Map.Map String Double)
  
instance Arbitrary AnyOf where
  arbitrary = sized genAnyOf

genAnyOf :: Int -> Gen AnyOf
genAnyOf n =
  AnyOf
    <$> arbitraryReduced n -- anyOfAnyOf :: [CatalogsProductGroupFilterKeys]
  
instance Arbitrary AppTypeMultipliers where
  arbitrary = sized genAppTypeMultipliers

genAppTypeMultipliers :: Int -> Gen AppTypeMultipliers
genAppTypeMultipliers n =
  AppTypeMultipliers
    <$> arbitraryReducedMaybe n -- appTypeMultipliersAppType :: Maybe E'AppType
  
instance Arbitrary AssetGroupBinding where
  arbitrary = sized genAssetGroupBinding

genAssetGroupBinding :: Int -> Gen AssetGroupBinding
genAssetGroupBinding n =
  AssetGroupBinding
    <$> arbitraryReducedMaybe n -- assetGroupBindingAdAccountsIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- assetGroupBindingAssetGroupDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetGroupBindingAssetGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetGroupBindingAssetGroupTypes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- assetGroupBindingCatalogsIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- assetGroupBindingCreatedBy :: Maybe BusinessAccessUserSummary
    <*> arbitraryReducedMaybe n -- assetGroupBindingCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- assetGroupBindingId :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetGroupBindingOwner :: Maybe BusinessAccessUserSummary
    <*> arbitraryReducedMaybe n -- assetGroupBindingProfilesIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- assetGroupBindingUpdatedTime :: Maybe Int
  
instance Arbitrary AssetIdPermissions where
  arbitrary = sized genAssetIdPermissions

genAssetIdPermissions :: Int -> Gen AssetIdPermissions
genAssetIdPermissions n =
  AssetIdPermissions
    <$> arbitraryReducedMaybe n -- assetIdPermissionsAssetGroupInfo :: Maybe AssetGroupBinding
    <*> arbitraryReducedMaybe n -- assetIdPermissionsAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetIdPermissionsAssetType :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetIdPermissionsPermissions :: Maybe [Text]
  
instance Arbitrary Audience where
  arbitrary = sized genAudience

genAudience :: Int -> Gen Audience
genAudience n =
  Audience
    <$> arbitraryReducedMaybe n -- audienceAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceAudienceType :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCreatedByCompanyName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCreatedTimestamp :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRule :: Maybe AudienceRule
    <*> arbitraryReducedMaybe n -- audienceSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceType :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceUpdatedTimestamp :: Maybe Int
  
instance Arbitrary AudienceCategory where
  arbitrary = sized genAudienceCategory

genAudienceCategory :: Int -> Gen AudienceCategory
genAudienceCategory n =
  AudienceCategory
    <$> arbitraryReducedMaybe n -- audienceCategoryId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCategoryIndex :: Maybe Double
    <*> arbitraryReducedMaybe n -- audienceCategoryKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCategoryName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCategoryRatio :: Maybe Double
    <*> arbitraryReducedMaybe n -- audienceCategorySubcategories :: Maybe [AudienceSubcategory]
  
instance Arbitrary AudienceCommon where
  arbitrary = sized genAudienceCommon

genAudienceCommon :: Int -> Gen AudienceCommon
genAudienceCommon n =
  AudienceCommon
    <$> arbitraryReducedMaybe n -- audienceCommonAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCommonRule :: Maybe AudienceRule
  
instance Arbitrary AudienceCreateRequest where
  arbitrary = sized genAudienceCreateRequest

genAudienceCreateRequest :: Int -> Gen AudienceCreateRequest
genAudienceCreateRequest n =
  AudienceCreateRequest
    <$> arbitraryReducedMaybe n -- audienceCreateRequestAdAccountId :: Maybe Text
    <*> arbitrary -- audienceCreateRequestName :: Text
    <*> arbitraryReduced n -- audienceCreateRequestRule :: AudienceRule
    <*> arbitraryReduced n -- audienceCreateRequestAudienceType :: AudienceType
    <*> arbitraryReducedMaybe n -- audienceCreateRequestDescription :: Maybe Text
  
instance Arbitrary AudienceDefinition where
  arbitrary = sized genAudienceDefinition

genAudienceDefinition :: Int -> Gen AudienceDefinition
genAudienceDefinition n =
  AudienceDefinition
    <$> arbitraryReducedMaybe n -- audienceDefinitionDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceDefinitionScope :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceDefinitionType :: Maybe Text
  
instance Arbitrary AudienceDefinitionResponse where
  arbitrary = sized genAudienceDefinitionResponse

genAudienceDefinitionResponse :: Int -> Gen AudienceDefinitionResponse
genAudienceDefinitionResponse n =
  AudienceDefinitionResponse
    <$> arbitraryReducedMaybe n -- audienceDefinitionResponseItems :: Maybe [AudienceDefinition]
  
instance Arbitrary AudienceDefinitionScope where
  arbitrary = sized genAudienceDefinitionScope

genAudienceDefinitionScope :: Int -> Gen AudienceDefinitionScope
genAudienceDefinitionScope n =
  AudienceDefinitionScope
    <$> arbitraryReducedMaybe n -- audienceDefinitionScopeScope :: Maybe E'Scope
  
instance Arbitrary AudienceDefinitionType where
  arbitrary = sized genAudienceDefinitionType

genAudienceDefinitionType :: Int -> Gen AudienceDefinitionType
genAudienceDefinitionType n =
  AudienceDefinitionType
    <$> arbitraryReducedMaybe n -- audienceDefinitionTypeScope :: Maybe E'Scope2
  
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
    <*> arbitraryReducedMaybe n -- audienceDemographicsCountries :: Maybe [AudienceDemographicValue]
    <*> arbitraryReducedMaybe n -- audienceDemographicsDevices :: Maybe [AudienceDemographicValue]
    <*> arbitraryReducedMaybe n -- audienceDemographicsGenders :: Maybe [AudienceDemographicValue]
    <*> arbitraryReducedMaybe n -- audienceDemographicsMetros :: Maybe [AudienceDemographicValue]
  
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
    <$> arbitraryReducedMaybe n -- audienceInsightCategoryCommonId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceInsightCategoryCommonIndex :: Maybe Double
    <*> arbitraryReducedMaybe n -- audienceInsightCategoryCommonKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceInsightCategoryCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceInsightCategoryCommonRatio :: Maybe Double
  
instance Arbitrary AudienceInsightsResponse where
  arbitrary = sized genAudienceInsightsResponse

genAudienceInsightsResponse :: Int -> Gen AudienceInsightsResponse
genAudienceInsightsResponse n =
  AudienceInsightsResponse
    <$> arbitraryReducedMaybe n -- audienceInsightsResponseCategories :: Maybe [AudienceCategory]
    <*> arbitraryReducedMaybe n -- audienceInsightsResponseDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceInsightsResponseDemographics :: Maybe AudienceDemographics
    <*> arbitraryReducedMaybe n -- audienceInsightsResponseSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceInsightsResponseSizeIsUpperBound :: Maybe Bool
    <*> arbitraryReducedMaybe n -- audienceInsightsResponseType :: Maybe AudienceInsightType
  
instance Arbitrary AudienceRule where
  arbitrary = sized genAudienceRule

genAudienceRule :: Int -> Gen AudienceRule
genAudienceRule n =
  AudienceRule
    <$> arbitraryReducedMaybe n -- audienceRuleAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRuleAdId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRuleCampaignId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRuleCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRuleCustomerListId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRuleEngagementDomain :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRuleEngagementType :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRuleEngagerType :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceRuleEvent :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRuleEventData :: Maybe EventData
    <*> arbitraryReducedMaybeValue n -- audienceRuleEventSource :: Maybe A.Value
    <*> arbitraryReducedMaybeValue n -- audienceRuleIngestionSource :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- audienceRuleObjectiveType :: Maybe [ObjectiveType]
    <*> arbitraryReducedMaybe n -- audienceRulePercentage :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceRulePinId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRulePrefill :: Maybe Bool
    <*> arbitraryReducedMaybe n -- audienceRuleRetentionDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceRuleSeedId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRuleUrl :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- audienceRuleVisitorSourceId :: Maybe Text
  
instance Arbitrary AudienceSubcategory where
  arbitrary = sized genAudienceSubcategory

genAudienceSubcategory :: Int -> Gen AudienceSubcategory
genAudienceSubcategory n =
  AudienceSubcategory
    <$> arbitraryReducedMaybe n -- audienceSubcategoryId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceSubcategoryIndex :: Maybe Double
    <*> arbitraryReducedMaybe n -- audienceSubcategoryKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceSubcategoryName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceSubcategoryRatio :: Maybe Double
  
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
    <$> arbitraryReducedMaybe n -- audiencesList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- audiencesList200ResponseItems :: [Audience]
  
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
    <$> arbitraryReduced n -- bidFloorSpecBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- bidFloorSpecCountries :: Maybe [Country]
    <*> arbitraryReducedMaybe n -- bidFloorSpecCreativeType :: Maybe CreativeType
    <*> arbitraryReduced n -- bidFloorSpecCurrency :: Currency
    <*> arbitraryReducedMaybe n -- bidFloorSpecObjectiveType :: Maybe ObjectiveType
    <*> arbitraryReducedMaybe n -- bidFloorSpecOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
  
instance Arbitrary BillingInvoiceDownloadResponse where
  arbitrary = sized genBillingInvoiceDownloadResponse

genBillingInvoiceDownloadResponse :: Int -> Gen BillingInvoiceDownloadResponse
genBillingInvoiceDownloadResponse n =
  BillingInvoiceDownloadResponse
    <$> arbitraryReducedMaybe n -- billingInvoiceDownloadResponseDownloadUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceDownloadResponseId :: Maybe Text
  
instance Arbitrary BillingInvoiceResponse where
  arbitrary = sized genBillingInvoiceResponse

genBillingInvoiceResponse :: Int -> Gen BillingInvoiceResponse
genBillingInvoiceResponse n =
  BillingInvoiceResponse
    <$> arbitraryReducedMaybe n -- billingInvoiceResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseAdAccountName :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseAmountBilledMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseAmountDiscountMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseAmountNetMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseAmountTaxMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseBillToCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseBillingPeriodEndDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseBillingPeriodStartDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseCurrency :: Maybe Currency
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseDocumentType :: Maybe E'DocumentType
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseInvoiceDueDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- billingInvoiceResponsePaymentTerms :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceResponseStatus :: Maybe E'Status2
  
instance Arbitrary BillingInvoicesGet200Response where
  arbitrary = sized genBillingInvoicesGet200Response

genBillingInvoicesGet200Response :: Int -> Gen BillingInvoicesGet200Response
genBillingInvoicesGet200Response n =
  BillingInvoicesGet200Response
    <$> arbitraryReducedMaybe n -- billingInvoicesGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- billingInvoicesGet200ResponseItems :: [BillingInvoiceResponse]
  
instance Arbitrary BillingProfilesGet200Response where
  arbitrary = sized genBillingProfilesGet200Response

genBillingProfilesGet200Response :: Int -> Gen BillingProfilesGet200Response
genBillingProfilesGet200Response n =
  BillingProfilesGet200Response
    <$> arbitraryReducedMaybe n -- billingProfilesGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- billingProfilesGet200ResponseItems :: [BillingProfilesResponse]
  
instance Arbitrary BillingProfilesResponse where
  arbitrary = sized genBillingProfilesResponse

genBillingProfilesResponse :: Int -> Gen BillingProfilesResponse
genBillingProfilesResponse n =
  BillingProfilesResponse
    <$> arbitraryReducedMaybe n -- billingProfilesResponseAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingProfilesResponseBillingType :: Maybe E'BillingType
    <*> arbitraryReducedMaybe n -- billingProfilesResponseCardType :: Maybe E'CardType
    <*> arbitraryReducedMaybe n -- billingProfilesResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingProfilesResponsePaymentMethodBrand :: Maybe E'PaymentMethodBrand
    <*> arbitraryReducedMaybe n -- billingProfilesResponseStatus :: Maybe E'Status
  
instance Arbitrary Board where
  arbitrary = sized genBoard

genBoard :: Int -> Gen Board
genBoard n =
  Board
    <$> arbitraryReducedMaybe n -- boardBoardPinsModifiedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- boardCollaboratorCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- boardCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- boardDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardFollowerCount :: Maybe Int
    <*> arbitrary -- boardId :: Text
    <*> arbitraryReducedMaybe n -- boardIsAdsOnly :: Maybe Bool
    <*> arbitraryReducedMaybe n -- boardMedia :: Maybe BoardMedia
    <*> arbitrary -- boardName :: Text
    <*> arbitraryReducedMaybe n -- boardOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- boardPinCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- boardPrivacy :: Maybe BoardPrivacy
  
instance Arbitrary BoardBase where
  arbitrary = sized genBoardBase

genBoardBase :: Int -> Gen BoardBase
genBoardBase n =
  BoardBase
    <$> arbitraryReducedMaybe n -- boardBaseBoardPinsModifiedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- boardBaseCollaboratorCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- boardBaseCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- boardBaseDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardBaseFollowerCount :: Maybe Int
    <*> arbitrary -- boardBaseId :: Text
    <*> arbitraryReducedMaybe n -- boardBaseIsAdsOnly :: Maybe Bool
    <*> arbitraryReducedMaybe n -- boardBaseMedia :: Maybe BoardMedia
    <*> arbitrary -- boardBaseName :: Text
    <*> arbitraryReducedMaybe n -- boardBaseOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- boardBasePinCount :: Maybe Int
  
instance Arbitrary BoardCreate where
  arbitrary = sized genBoardCreate

genBoardCreate :: Int -> Gen BoardCreate
genBoardCreate n =
  BoardCreate
    <$> arbitraryReducedMaybe n -- boardCreateDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardCreateIsAdsOnly :: Maybe Bool
    <*> arbitrary -- boardCreateName :: Text
    <*> arbitraryReducedMaybe n -- boardCreatePrivacy :: Maybe BoardPrivacy
  
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
    <$> arbitraryReducedMaybe n -- boardSectionsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- boardSectionsList200ResponseItems :: [BoardSection]
  
instance Arbitrary BoardWithUpdatePrivacy where
  arbitrary = sized genBoardWithUpdatePrivacy

genBoardWithUpdatePrivacy :: Int -> Gen BoardWithUpdatePrivacy
genBoardWithUpdatePrivacy n =
  BoardWithUpdatePrivacy
    <$> arbitraryReducedMaybe n -- boardWithUpdatePrivacyBoardPinsModifiedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- boardWithUpdatePrivacyCollaboratorCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- boardWithUpdatePrivacyCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- boardWithUpdatePrivacyDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardWithUpdatePrivacyFollowerCount :: Maybe Int
    <*> arbitrary -- boardWithUpdatePrivacyId :: Text
    <*> arbitraryReducedMaybe n -- boardWithUpdatePrivacyIsAdsOnly :: Maybe Bool
    <*> arbitraryReducedMaybe n -- boardWithUpdatePrivacyMedia :: Maybe BoardMedia
    <*> arbitrary -- boardWithUpdatePrivacyName :: Text
    <*> arbitraryReducedMaybe n -- boardWithUpdatePrivacyOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- boardWithUpdatePrivacyPinCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- boardWithUpdatePrivacyPrivacy :: Maybe BoardUpdatePrivacy
  
instance Arbitrary BoardWithUpdatePrivacyUpdate where
  arbitrary = sized genBoardWithUpdatePrivacyUpdate

genBoardWithUpdatePrivacyUpdate :: Int -> Gen BoardWithUpdatePrivacyUpdate
genBoardWithUpdatePrivacyUpdate n =
  BoardWithUpdatePrivacyUpdate
    <$> arbitraryReducedMaybe n -- boardWithUpdatePrivacyUpdateDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardWithUpdatePrivacyUpdateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- boardWithUpdatePrivacyUpdatePrivacy :: Maybe BoardUpdatePrivacy
  
instance Arbitrary BoardsList200Response where
  arbitrary = sized genBoardsList200Response

genBoardsList200Response :: Int -> Gen BoardsList200Response
genBoardsList200Response n =
  BoardsList200Response
    <$> arbitraryReducedMaybe n -- boardsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- boardsList200ResponseItems :: [Board]
  
instance Arbitrary BoardsListPins200Response where
  arbitrary = sized genBoardsListPins200Response

genBoardsListPins200Response :: Int -> Gen BoardsListPins200Response
genBoardsListPins200Response n =
  BoardsListPins200Response
    <$> arbitraryReducedMaybe n -- boardsListPins200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- boardsListPins200ResponseItems :: [Pin]
  
instance Arbitrary BoardsUserFollowsList200Response where
  arbitrary = sized genBoardsUserFollowsList200Response

genBoardsUserFollowsList200Response :: Int -> Gen BoardsUserFollowsList200Response
genBoardsUserFollowsList200Response n =
  BoardsUserFollowsList200Response
    <$> arbitraryReducedMaybe n -- boardsUserFollowsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- boardsUserFollowsList200ResponseItems :: [Board]
  
instance Arbitrary BookClosedResponse where
  arbitrary = sized genBookClosedResponse

genBookClosedResponse :: Int -> Gen BookClosedResponse
genBookClosedResponse n =
  BookClosedResponse
    <$> arbitraryReducedMaybe n -- bookClosedResponseConversionMetricsReady :: Maybe Bool
    <*> arbitraryReducedMaybe n -- bookClosedResponseNonConversionMetricsReady :: Maybe Bool
  
instance Arbitrary BrandAccountsCreate200Response where
  arbitrary = sized genBrandAccountsCreate200Response

genBrandAccountsCreate200Response :: Int -> Gen BrandAccountsCreate200Response
genBrandAccountsCreate200Response n =
  BrandAccountsCreate200Response
    <$> arbitraryReducedMaybe n -- brandAccountsCreate200ResponseBrandAccountId :: Maybe Text
  
instance Arbitrary BrandAccountsCreateRequest where
  arbitrary = sized genBrandAccountsCreateRequest

genBrandAccountsCreateRequest :: Int -> Gen BrandAccountsCreateRequest
genBrandAccountsCreateRequest n =
  BrandAccountsCreateRequest
    <$> arbitrary -- brandAccountsCreateRequestName :: Text
    <*> arbitrary -- brandAccountsCreateRequestUsername :: Text
    <*> arbitraryReduced n -- brandAccountsCreateRequestCountry :: Country
    <*> arbitraryReducedMaybe n -- brandAccountsCreateRequestAbout :: Maybe Text
    <*> arbitraryReducedMaybe n -- brandAccountsCreateRequestWebsite :: Maybe Text
    <*> arbitraryReducedMaybe n -- brandAccountsCreateRequestProfileImage :: Maybe ImageBase64
  
instance Arbitrary BrandAccountsUpdateRequest where
  arbitrary = sized genBrandAccountsUpdateRequest

genBrandAccountsUpdateRequest :: Int -> Gen BrandAccountsUpdateRequest
genBrandAccountsUpdateRequest n =
  BrandAccountsUpdateRequest
    <$> arbitraryReducedMaybe n -- brandAccountsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- brandAccountsUpdateRequestUsername :: Maybe Text
    <*> arbitraryReducedMaybe n -- brandAccountsUpdateRequestCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- brandAccountsUpdateRequestAbout :: Maybe Text
    <*> arbitraryReducedMaybe n -- brandAccountsUpdateRequestWebsite :: Maybe Text
    <*> arbitraryReducedMaybe n -- brandAccountsUpdateRequestProfileImage :: Maybe ImageBase64
  
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
    <$> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilter :: Maybe BulkDownloadRequestCampaignFilter
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestEntityIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestEntityTypes :: Maybe [BulkEntityType]
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestOutputFormat :: Maybe BulkOutputFormat
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestUpdatedSince :: Maybe Text
  
instance Arbitrary BulkDownloadRequestCampaignFilter where
  arbitrary = sized genBulkDownloadRequestCampaignFilter

genBulkDownloadRequestCampaignFilter :: Int -> Gen BulkDownloadRequestCampaignFilter
genBulkDownloadRequestCampaignFilter n =
  BulkDownloadRequestCampaignFilter
    <$> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilterCampaignStatus :: Maybe [CampaignSummaryStatus]
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilterEndTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilterName :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilterObjectiveType :: Maybe [ObjectiveType]
    <*> arbitraryReducedMaybe n -- bulkDownloadRequestCampaignFilterStartTime :: Maybe Text
  
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
    <$> arbitraryReducedMaybe n -- bulkUpsertRequestCreateAdGroups :: Maybe [AdGroupCreateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateAds :: Maybe [AdCreateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateCampaigns :: Maybe [CampaignCreateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateCatalogProductGroups :: Maybe [MultipleProductGroupsInner]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateKeywords :: Maybe [KeywordsRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateLabels :: Maybe [LabelCreateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateProductGroups :: Maybe [ProductGroupPromotionCreateRequest]
  
instance Arbitrary BulkUpsertRequestUpdate where
  arbitrary = sized genBulkUpsertRequestUpdate

genBulkUpsertRequestUpdate :: Int -> Gen BulkUpsertRequestUpdate
genBulkUpsertRequestUpdate n =
  BulkUpsertRequestUpdate
    <$> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateAdGroups :: Maybe [AdGroupUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateAds :: Maybe [AdUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCampaigns :: Maybe [CampaignUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCatalogProductGroups :: Maybe [CatalogsProductGroupsUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateKeywords :: Maybe [KeywordUpdate]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateLabels :: Maybe [LabelBulkUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateProductGroups :: Maybe [ProductGroupPromotionUpdateRequest]
  
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
    <$> arbitraryReducedMaybe n -- bulkUpsertStatusResponseResultUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkUpsertStatusResponseStatus :: Maybe BulkUpsertStatus
  
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
    <$> arbitraryReducedMaybe n -- businessAssetMembersGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- businessAssetMembersGet200ResponseItems :: [UserSingleAssetBinding]
  
instance Arbitrary BusinessAssetPartnersGet200Response where
  arbitrary = sized genBusinessAssetPartnersGet200Response

genBusinessAssetPartnersGet200Response :: Int -> Gen BusinessAssetPartnersGet200Response
genBusinessAssetPartnersGet200Response n =
  BusinessAssetPartnersGet200Response
    <$> arbitraryReducedMaybe n -- businessAssetPartnersGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- businessAssetPartnersGet200ResponseItems :: [UserSingleAssetBinding]
  
instance Arbitrary BusinessAssetsGet200Response where
  arbitrary = sized genBusinessAssetsGet200Response

genBusinessAssetsGet200Response :: Int -> Gen BusinessAssetsGet200Response
genBusinessAssetsGet200Response n =
  BusinessAssetsGet200Response
    <$> arbitraryReducedMaybe n -- businessAssetsGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- businessAssetsGet200ResponseItems :: [GetBusinessAssetsResponse]
  
instance Arbitrary BusinessMemberAssetsGet200Response where
  arbitrary = sized genBusinessMemberAssetsGet200Response

genBusinessMemberAssetsGet200Response :: Int -> Gen BusinessMemberAssetsGet200Response
genBusinessMemberAssetsGet200Response n =
  BusinessMemberAssetsGet200Response
    <$> arbitraryReducedMaybe n -- businessMemberAssetsGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- businessMemberAssetsGet200ResponseItems :: [AssetIdPermissions]
  
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
    <$> arbitraryReducedMaybe n -- businessPartnerAssetAccessGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- businessPartnerAssetAccessGet200ResponseItems :: [GetPartnerAssetsResponse]
  
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
  
instance Arbitrary CampaignAudienceMultipliers where
  arbitrary = sized genCampaignAudienceMultipliers

genCampaignAudienceMultipliers :: Int -> Gen CampaignAudienceMultipliers
genCampaignAudienceMultipliers n =
  CampaignAudienceMultipliers
    <$> arbitraryReducedMaybe n -- campaignAudienceMultipliersAudienceId :: Maybe Text
  
instance Arbitrary CampaignBidOptions where
  arbitrary = sized genCampaignBidOptions

genCampaignBidOptions :: Int -> Gen CampaignBidOptions
genCampaignBidOptions n =
  CampaignBidOptions
    <$> arbitraryReducedMaybe n -- campaignBidOptionsAppTypeMultipliers :: Maybe AppTypeMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsAudienceMultipliers :: Maybe CampaignAudienceMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsPlacementMultipliers :: Maybe PlacementMultipliers
  
instance Arbitrary CampaignBidOptionsCreate where
  arbitrary = sized genCampaignBidOptionsCreate

genCampaignBidOptionsCreate :: Int -> Gen CampaignBidOptionsCreate
genCampaignBidOptionsCreate n =
  CampaignBidOptionsCreate
    <$> arbitraryReducedMaybe n -- campaignBidOptionsCreateAppTypeMultipliers :: Maybe AppTypeMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsCreateAudienceMultipliers :: Maybe CampaignAudienceMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsCreatePlacementMultipliers :: Maybe PlacementMultipliers
  
instance Arbitrary CampaignBidOptionsUpdate where
  arbitrary = sized genCampaignBidOptionsUpdate

genCampaignBidOptionsUpdate :: Int -> Gen CampaignBidOptionsUpdate
genCampaignBidOptionsUpdate n =
  CampaignBidOptionsUpdate
    <$> arbitraryReducedMaybe n -- campaignBidOptionsUpdateAppTypeMultipliers :: Maybe AppTypeMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsUpdateAudienceMultipliers :: Maybe CampaignAudienceMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsUpdatePlacementMultipliers :: Maybe PlacementMultipliers
    <*> arbitrary -- campaignBidOptionsUpdateUpdateMask :: [E'UpdateMask]
  
instance Arbitrary CampaignCommon where
  arbitrary = sized genCampaignCommon

genCampaignCommon :: Int -> Gen CampaignCommon
genCampaignCommon n =
  CampaignCommon
    <$> arbitraryReducedMaybe n -- campaignCommonAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCommonDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCommonIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCommonLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCommonOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCommonStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignCommonTrackingUrls :: Maybe TrackingUrls
  
instance Arbitrary CampaignCreateCommon where
  arbitrary = sized genCampaignCreateCommon

genCampaignCreateCommon :: Int -> Gen CampaignCreateCommon
genCampaignCreateCommon n =
  CampaignCreateCommon
    <$> arbitraryReducedMaybe n -- campaignCreateCommonAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateCommonDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateCommonIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateCommonLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateCommonOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateCommonStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignCreateCommonTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCreateCommonDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonIsCampaignBudgetOptimization :: Maybe Bool
  
instance Arbitrary CampaignCreateRequest where
  arbitrary = sized genCampaignCreateRequest

genCampaignCreateRequest :: Int -> Gen CampaignCreateRequest
genCampaignCreateRequest n =
  CampaignCreateRequest
    <$> arbitrary -- campaignCreateRequestAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- campaignCreateRequestDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestLifetimeSpendCap :: Maybe Int
    <*> arbitrary -- campaignCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- campaignCreateRequestOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignCreateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCreateRequestDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestBidOptions :: Maybe CampaignBidOptionsCreate
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsPerformancePlus :: Maybe Bool
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
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataBidOptions :: Maybe CampaignBidOptions
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataIsPerformancePlus :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataObjectiveType :: Maybe ObjectiveType
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataSummaryStatus :: Maybe CampaignSummaryStatus
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataType :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataUpdatedTime :: Maybe Int
  
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
  
instance Arbitrary CampaignIdFilter where
  arbitrary = sized genCampaignIdFilter

genCampaignIdFilter :: Int -> Gen CampaignIdFilter
genCampaignIdFilter n =
  CampaignIdFilter
    <$> arbitraryReducedMaybe n -- campaignIdFilterCampaignIds :: Maybe [Text]
  
instance Arbitrary CampaignObjectivesFilter where
  arbitrary = sized genCampaignObjectivesFilter

genCampaignObjectivesFilter :: Int -> Gen CampaignObjectivesFilter
genCampaignObjectivesFilter n =
  CampaignObjectivesFilter
    <$> arbitraryReducedMaybe n -- campaignObjectivesFilterCampaignObjectiveTypes :: Maybe [ObjectiveType]
  
instance Arbitrary CampaignResponse where
  arbitrary = sized genCampaignResponse

genCampaignResponse :: Int -> Gen CampaignResponse
genCampaignResponse n =
  CampaignResponse
    <$> arbitraryReducedMaybe n -- campaignResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignResponseIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignResponseLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignResponseTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignResponseBidOptions :: Maybe CampaignBidOptions
    <*> arbitraryReducedMaybe n -- campaignResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignResponseIsPerformancePlus :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignResponseObjectiveType :: Maybe ObjectiveType
    <*> arbitraryReducedMaybe n -- campaignResponseSummaryStatus :: Maybe CampaignSummaryStatus
    <*> arbitraryReducedMaybe n -- campaignResponseType :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseUpdatedTime :: Maybe Int
  
instance Arbitrary CampaignUpdateRequest where
  arbitrary = sized genCampaignUpdateRequest

genCampaignUpdateRequest :: Int -> Gen CampaignUpdateRequest
genCampaignUpdateRequest n =
  CampaignUpdateRequest
    <$> arbitrary -- campaignUpdateRequestId :: Text
    <*> arbitrary -- campaignUpdateRequestAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestBidOptions :: Maybe CampaignBidOptionsUpdate
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsPerformancePlus :: Maybe Bool
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
    <$> arbitraryReducedMaybe n -- campaignsAnalyticsResponseInnerCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignsAnalyticsResponseInnerDate :: Maybe Date
  
instance Arbitrary CampaignsList200Response where
  arbitrary = sized genCampaignsList200Response

genCampaignsList200Response :: Int -> Gen CampaignsList200Response
genCampaignsList200Response n =
  CampaignsList200Response
    <$> arbitraryReducedMaybe n -- campaignsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- campaignsList200ResponseItems :: [CampaignResponse]
  
instance Arbitrary CancelInvitesBody where
  arbitrary = sized genCancelInvitesBody

genCancelInvitesBody :: Int -> Gen CancelInvitesBody
genCancelInvitesBody n =
  CancelInvitesBody
    <$> arbitrary -- cancelInvitesBodyInviteIds :: [Text]
  
instance Arbitrary CarouselSlot where
  arbitrary = sized genCarouselSlot

genCarouselSlot :: Int -> Gen CarouselSlot
genCarouselSlot n =
  CarouselSlot
    <$> arbitraryReducedMaybe n -- carouselSlotDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- carouselSlotLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- carouselSlotTitle :: Maybe Text
  
instance Arbitrary Catalog where
  arbitrary = sized genCatalog

genCatalog :: Int -> Gen Catalog
genCatalog n =
  Catalog
    <$> arbitraryReduced n -- catalogCreatedAt :: DateTime
    <*> arbitrary -- catalogId :: Text
    <*> arbitraryReduced n -- catalogUpdatedAt :: DateTime
    <*> arbitraryReduced n -- catalogCatalogType :: CatalogsType
    <*> arbitrary -- catalogName :: Text
  
instance Arbitrary CatalogsAvailableFilterValues where
  arbitrary = sized genCatalogsAvailableFilterValues

genCatalogsAvailableFilterValues :: Int -> Gen CatalogsAvailableFilterValues
genCatalogsAvailableFilterValues n =
  CatalogsAvailableFilterValues
    <$> arbitrary -- catalogsAvailableFilterValuesCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsAvailableFilterValuesFilterValues :: CatalogsCreativeAssetsFilterValuesMap
  
instance Arbitrary CatalogsCreateCreativeAssetsItem where
  arbitrary = sized genCatalogsCreateCreativeAssetsItem

genCatalogsCreateCreativeAssetsItem :: Int -> Gen CatalogsCreateCreativeAssetsItem
genCatalogsCreateCreativeAssetsItem n =
  CatalogsCreateCreativeAssetsItem
    <$> arbitraryReduced n -- catalogsCreateCreativeAssetsItemAttributes :: CatalogsCreativeAssetsAttributes
    <*> arbitrary -- catalogsCreateCreativeAssetsItemCreativeAssetsId :: Text
    <*> arbitrary -- catalogsCreateCreativeAssetsItemOperation :: E'Operation2
  
instance Arbitrary CatalogsCreateHotelItem where
  arbitrary = sized genCatalogsCreateHotelItem

genCatalogsCreateHotelItem :: Int -> Gen CatalogsCreateHotelItem
genCatalogsCreateHotelItem n =
  CatalogsCreateHotelItem
    <$> arbitraryReduced n -- catalogsCreateHotelItemAttributes :: CatalogsHotelAttributes
    <*> arbitrary -- catalogsCreateHotelItemHotelId :: Text
    <*> arbitrary -- catalogsCreateHotelItemOperation :: E'Operation2
  
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
    <$> arbitraryReduced n -- catalogsCreateRequestCatalogType :: CatalogsType
    <*> arbitrary -- catalogsCreateRequestName :: Text
  
instance Arbitrary CatalogsCreateRetailItem where
  arbitrary = sized genCatalogsCreateRetailItem

genCatalogsCreateRetailItem :: Int -> Gen CatalogsCreateRetailItem
genCatalogsCreateRetailItem n =
  CatalogsCreateRetailItem
    <$> arbitraryReduced n -- catalogsCreateRetailItemAttributes :: ItemAttributesRequest
    <*> arbitrary -- catalogsCreateRetailItemItemId :: Text
    <*> arbitrary -- catalogsCreateRetailItemOperation :: E'Operation2
  
instance Arbitrary CatalogsCreativeAssetsAttributes where
  arbitrary = sized genCatalogsCreativeAssetsAttributes

genCatalogsCreativeAssetsAttributes :: Int -> Gen CatalogsCreativeAssetsAttributes
genCatalogsCreativeAssetsAttributes n =
  CatalogsCreativeAssetsAttributes
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesCustomLabel0 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesCustomLabel1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesCustomLabel2 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesCustomLabel3 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesCustomLabel4 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesGoogleProductCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesVisibility :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesImageLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesVideoLink :: Maybe Text
  
instance Arbitrary CatalogsCreativeAssetsAvailableFilterValues where
  arbitrary = sized genCatalogsCreativeAssetsAvailableFilterValues

genCatalogsCreativeAssetsAvailableFilterValues :: Int -> Gen CatalogsCreativeAssetsAvailableFilterValues
genCatalogsCreativeAssetsAvailableFilterValues n =
  CatalogsCreativeAssetsAvailableFilterValues
    <$> arbitrary -- catalogsCreativeAssetsAvailableFilterValuesCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsCreativeAssetsAvailableFilterValuesFilterValues :: CatalogsCreativeAssetsFilterValuesMap
  
instance Arbitrary CatalogsCreativeAssetsBatchItem where
  arbitrary = sized genCatalogsCreativeAssetsBatchItem

genCatalogsCreativeAssetsBatchItem :: Int -> Gen CatalogsCreativeAssetsBatchItem
genCatalogsCreativeAssetsBatchItem n =
  CatalogsCreativeAssetsBatchItem
    <$> arbitraryReduced n -- catalogsCreativeAssetsBatchItemAttributes :: CatalogsUpdatableCreativeAssetsAttributes
    <*> arbitrary -- catalogsCreativeAssetsBatchItemCreativeAssetsId :: Text
    <*> arbitrary -- catalogsCreativeAssetsBatchItemOperation :: E'Operation
  
instance Arbitrary CatalogsCreativeAssetsBatchRequest where
  arbitrary = sized genCatalogsCreativeAssetsBatchRequest

genCatalogsCreativeAssetsBatchRequest :: Int -> Gen CatalogsCreativeAssetsBatchRequest
genCatalogsCreativeAssetsBatchRequest n =
  CatalogsCreativeAssetsBatchRequest
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsBatchRequestCatalogId :: Maybe Text
    <*> arbitrary -- catalogsCreativeAssetsBatchRequestCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsCreativeAssetsBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsCreativeAssetsBatchRequestItems :: [CatalogsCreativeAssetsBatchItem]
    <*> arbitrary -- catalogsCreativeAssetsBatchRequestLanguage :: E'Language
  
instance Arbitrary CatalogsCreativeAssetsFeed where
  arbitrary = sized genCatalogsCreativeAssetsFeed

genCatalogsCreativeAssetsFeed :: Int -> Gen CatalogsCreativeAssetsFeed
genCatalogsCreativeAssetsFeed n =
  CatalogsCreativeAssetsFeed
    <$> arbitraryReduced n -- catalogsCreativeAssetsFeedCreatedAt :: DateTime
    <*> arbitrary -- catalogsCreativeAssetsFeedId :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedUpdatedAt :: DateTime
    <*> arbitrary -- catalogsCreativeAssetsFeedCatalogId :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedCredentials :: CatalogsFeedCredentials
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedDefaultCountry :: Country
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedDefaultCurrency :: NullableCurrency
    <*> arbitrary -- catalogsCreativeAssetsFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedFormat :: CatalogsFormat
    <*> arbitrary -- catalogsCreativeAssetsFeedLocation :: Text
    <*> arbitrary -- catalogsCreativeAssetsFeedName :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedPreferredProcessingSchedule :: CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedStatus :: CatalogsStatus
  
instance Arbitrary CatalogsCreativeAssetsFeedsCreateRequest where
  arbitrary = sized genCatalogsCreativeAssetsFeedsCreateRequest

genCatalogsCreativeAssetsFeedsCreateRequest :: Int -> Gen CatalogsCreativeAssetsFeedsCreateRequest
genCatalogsCreativeAssetsFeedsCreateRequest n =
  CatalogsCreativeAssetsFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestCatalogId :: Maybe Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsCreateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsCreateRequestDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsCreateRequestDefaultLocale :: CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitrary -- catalogsCreativeAssetsFeedsCreateRequestLocation :: Text
    <*> arbitrary -- catalogsCreativeAssetsFeedsCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsCreativeAssetsFeedsUpdateRequest where
  arbitrary = sized genCatalogsCreativeAssetsFeedsUpdateRequest

genCatalogsCreativeAssetsFeedsUpdateRequest :: Int -> Gen CatalogsCreativeAssetsFeedsUpdateRequest
genCatalogsCreativeAssetsFeedsUpdateRequest n =
  CatalogsCreativeAssetsFeedsUpdateRequest
    <$> arbitraryReduced n -- catalogsCreativeAssetsFeedsUpdateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsUpdateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsCreativeAssetsFilterValuesMap where
  arbitrary = sized genCatalogsCreativeAssetsFilterValuesMap

genCatalogsCreativeAssetsFilterValuesMap :: Int -> Gen CatalogsCreativeAssetsFilterValuesMap
genCatalogsCreativeAssetsFilterValuesMap n =
  CatalogsCreativeAssetsFilterValuesMap
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapCustomLabel0 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapCustomLabel1 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapCustomLabel2 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapCustomLabel3 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapCustomLabel4 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapGoogleProductCategory0 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapGoogleProductCategory1 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapGoogleProductCategory2 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapGoogleProductCategory3 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapGoogleProductCategory4 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapGoogleProductCategory5 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapGoogleProductCategory6 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapMediaType :: Maybe [E'MediaType6]
  
instance Arbitrary CatalogsCreativeAssetsItemErrorResponse where
  arbitrary = sized genCatalogsCreativeAssetsItemErrorResponse

genCatalogsCreativeAssetsItemErrorResponse :: Int -> Gen CatalogsCreativeAssetsItemErrorResponse
genCatalogsCreativeAssetsItemErrorResponse n =
  CatalogsCreativeAssetsItemErrorResponse
    <$> arbitraryReduced n -- catalogsCreativeAssetsItemErrorResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemErrorResponseCreativeAssetsId :: Maybe Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsItemErrorResponseErrors :: [ItemValidationEvent]
  
instance Arbitrary CatalogsCreativeAssetsItemResponse where
  arbitrary = sized genCatalogsCreativeAssetsItemResponse

genCatalogsCreativeAssetsItemResponse :: Int -> Gen CatalogsCreativeAssetsItemResponse
genCatalogsCreativeAssetsItemResponse n =
  CatalogsCreativeAssetsItemResponse
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemResponseAttributes :: Maybe CatalogsCreativeAssetsAttributes
    <*> arbitraryReduced n -- catalogsCreativeAssetsItemResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemResponseCreativeAssetsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemResponsePins :: Maybe [Pin]
  
instance Arbitrary CatalogsCreativeAssetsItemsBatch where
  arbitrary = sized genCatalogsCreativeAssetsItemsBatch

genCatalogsCreativeAssetsItemsBatch :: Int -> Gen CatalogsCreativeAssetsItemsBatch
genCatalogsCreativeAssetsItemsBatch n =
  CatalogsCreativeAssetsItemsBatch
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchBatchId :: Maybe Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsItemsBatchCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchCreatedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchItems :: Maybe [CreativeAssetsProcessingRecord]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchStatus :: Maybe BatchOperationStatus
  
instance Arbitrary CatalogsCreativeAssetsItemsFilter where
  arbitrary = sized genCatalogsCreativeAssetsItemsFilter

genCatalogsCreativeAssetsItemsFilter :: Int -> Gen CatalogsCreativeAssetsItemsFilter
genCatalogsCreativeAssetsItemsFilter n =
  CatalogsCreativeAssetsItemsFilter
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsCreativeAssetsItemsFilterCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsCreativeAssetsItemsFilterCreativeAssetsIds :: [Text]
  
instance Arbitrary CatalogsCreativeAssetsItemsPostFilter where
  arbitrary = sized genCatalogsCreativeAssetsItemsPostFilter

genCatalogsCreativeAssetsItemsPostFilter :: Int -> Gen CatalogsCreativeAssetsItemsPostFilter
genCatalogsCreativeAssetsItemsPostFilter n =
  CatalogsCreativeAssetsItemsPostFilter
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsPostFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsCreativeAssetsItemsPostFilterCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsCreativeAssetsItemsPostFilterCreativeAssetsIds :: [Text]
  
instance Arbitrary CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest where
  arbitrary = sized genCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

genCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest :: Int -> Gen CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
genCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest n =
  CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
    <$> arbitrary -- catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogId :: Text
    <*> arbitrary -- catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType3
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
    <$> arbitrary -- catalogsCreativeAssetsProductGroupCatalogId :: Text
    <*> arbitrary -- catalogsCreativeAssetsProductGroupCatalogType :: E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitrary -- catalogsCreativeAssetsProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupUpdatedAt :: Maybe Int
  
instance Arbitrary CatalogsCreativeAssetsProductGroupCreateRequest where
  arbitrary = sized genCatalogsCreativeAssetsProductGroupCreateRequest

genCatalogsCreativeAssetsProductGroupCreateRequest :: Int -> Gen CatalogsCreativeAssetsProductGroupCreateRequest
genCatalogsCreativeAssetsProductGroupCreateRequest n =
  CatalogsCreativeAssetsProductGroupCreateRequest
    <$> arbitrary -- catalogsCreativeAssetsProductGroupCreateRequestCatalogId :: Text
    <*> arbitrary -- catalogsCreativeAssetsProductGroupCreateRequestCatalogType :: E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupCreateRequestFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitrary -- catalogsCreativeAssetsProductGroupCreateRequestName :: Text
  
instance Arbitrary CatalogsCreativeAssetsProductGroupFilterKeys where
  arbitrary = sized genCatalogsCreativeAssetsProductGroupFilterKeys

genCatalogsCreativeAssetsProductGroupFilterKeys :: Int -> Gen CatalogsCreativeAssetsProductGroupFilterKeys
genCatalogsCreativeAssetsProductGroupFilterKeys n =
  CatalogsCreativeAssetsProductGroupFilterKeys
    <$> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCreativeAssetsId :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCustomLabel0 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCustomLabel1 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCustomLabel2 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCustomLabel3 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysCustomLabel4 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory6 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory5 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory4 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory3 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory2 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory1 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysGoogleProductCategory0 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysMediaType :: CatalogsProductGroupMultipleMediaTypesCriteria
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysTitleKeywords :: CatalogsProductGroupMultipleStringCriteria
  
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
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupUpdateRequestFilters :: Maybe CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupUpdateRequestName :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- catalogsDeleteRetailItemLastUpdatedTime :: Maybe Integer
    <*> arbitrary -- catalogsDeleteRetailItemOperation :: E'Operation
  
instance Arbitrary CatalogsFeed where
  arbitrary = sized genCatalogsFeed

genCatalogsFeed :: Int -> Gen CatalogsFeed
genCatalogsFeed n =
  CatalogsFeed
    <$> arbitraryReduced n -- catalogsFeedCreatedAt :: DateTime
    <*> arbitrary -- catalogsFeedId :: Text
    <*> arbitraryReduced n -- catalogsFeedUpdatedAt :: DateTime
    <*> arbitraryReduced n -- catalogsFeedCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsFeedCredentials :: CatalogsFeedCredentials
    <*> arbitraryReduced n -- catalogsFeedDefaultAvailability :: ProductAvailabilityType
    <*> arbitraryReduced n -- catalogsFeedDefaultCountry :: Country
    <*> arbitraryReduced n -- catalogsFeedDefaultCurrency :: NullableCurrency
    <*> arbitrary -- catalogsFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsFeedFormat :: CatalogsFormat
    <*> arbitrary -- catalogsFeedLocation :: Text
    <*> arbitrary -- catalogsFeedName :: Text
    <*> arbitraryReduced n -- catalogsFeedPreferredProcessingSchedule :: CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsFeedStatus :: CatalogsStatus
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
    <$> arbitraryReduced n -- catalogsFeedIngestionCreatedAt :: DateTime
    <*> arbitrary -- catalogsFeedIngestionFeedId :: Text
    <*> arbitrary -- catalogsFeedIngestionId :: Text
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
    <$> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsAccountFlagged :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsFetchGoogleSheetNotShared :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageFileNotAccessible :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageFileNotFound :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageInvalidFile :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageLevelInternalError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsImageMalformedUrl :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsLargeProductCountDecrease :: Maybe E'LargeProductCountDecrease
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsLineLevelInternalError :: Maybe Int
  
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
    <$> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadContentReadError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadDnsLookupError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadFileNotAccessible :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadFileNotFound :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus400 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus403 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus404 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus405 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus410 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus429 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus500 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus502 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus503 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus504 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus507 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus508 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus520 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus521 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus522 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadHttpStatus525 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadInternalConfigurationError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadInternalError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadInternalFailedToDownload :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadInternalMalformedUrl :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadInternalRateLimited :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadInternalRequestExpired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadInvalidFile :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadSiteError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadSiteTimeout :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadSslError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageDownloadSslHandshakeError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageProcessingEmptyFile :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageProcessingHeightTooSmall :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageProcessingTooManyPixels :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageProcessingTypeMismatch :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdImageProcessingWidthTooSmall :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadContentReadError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadDnsLookupError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadFileNotAccessible :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadFileNotFound :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus400 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus403 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus404 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus405 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus410 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus429 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus500 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus502 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus503 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus504 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus507 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus508 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus520 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus521 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus522 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadHttpStatus525 :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadInternalConfigurationError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadInternalError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadInternalFailedToDownload :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadInternalMalformedUrl :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadInternalRateLimited :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadInternalRequestExpired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadInvalidFile :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadSiteError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadSiteTimeout :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadSslError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoDownloadSslHandshakeError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoLengthTooShort :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoProcessingEmptyFile :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoProcessingHeightTooSmall :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoProcessingTooManyPixels :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoProcessingTypeMismatch :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdVideoProcessingWidthTooSmall :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdditionalImageFileNotAccessible :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdditionalImageFileNotFound :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdditionalImageInvalidFile :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdditionalImageLevelInternalError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsAdditionalImageMalformedUrl :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsFetchGoogleSheetPublicCanEdit :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsHotelPriceHeaderIsPresent :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsVideoDownloadVideoTooShort :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsVideoFileNotAccessible :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsVideoFileNotFound :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsVideoInvalidFile :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsVideoLevelInternalError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionWarningsVideoMalformedUrl :: Maybe Int
  
instance Arbitrary CatalogsFeedProcessingResult where
  arbitrary = sized genCatalogsFeedProcessingResult

genCatalogsFeedProcessingResult :: Int -> Gen CatalogsFeedProcessingResult
genCatalogsFeedProcessingResult n =
  CatalogsFeedProcessingResult
    <$> arbitraryReduced n -- catalogsFeedProcessingResultCreatedAt :: DateTime
    <*> arbitrary -- catalogsFeedProcessingResultId :: Text
    <*> arbitraryReduced n -- catalogsFeedProcessingResultUpdatedAt :: DateTime
    <*> arbitraryReduced n -- catalogsFeedProcessingResultIngestionDetails :: CatalogsFeedIngestionDetails
    <*> arbitraryReduced n -- catalogsFeedProcessingResultProductCounts :: CatalogsFeedProductCounts
    <*> arbitraryReduced n -- catalogsFeedProcessingResultStatus :: CatalogsFeedProcessingStatus
    <*> arbitraryReduced n -- catalogsFeedProcessingResultValidationDetails :: CatalogsFeedValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsFeedProcessingResultVideoCounts :: Maybe CatalogsFeedVideoCounts
  
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
    <$> arbitraryReducedMaybe n -- catalogsFeedProductCountsIngested :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedProductCountsOriginal :: Maybe Int
  
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
    <$> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsAdultInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsAdwordsFormatInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsAvailabilityInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsBlocklistedImageSignature :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsDelimiterError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsDescriptionMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsDuplicateProducts :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsEncodingError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsFeedLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsFeedTooSmall :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsFetchError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsFetchInactiveFeedError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsImageLinkInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsImageLinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsImageLinkMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsInternalServiceError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsInvalidDomain :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsItemMainImageDownloadFailure :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsItemidMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsLinkFormatInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsLinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsListPriceInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsMalformedXml :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsMaxItemsPerItemGroupExceeded :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsNoVerifiedDomain :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsParseLineError :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsPinjoinContentUnsafe :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsPriceCannotBeDetermined :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsPriceMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsProductLinkMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsProductPriceInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsRequiredColumnsMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationErrorsTitleMissing :: Maybe Int
  
instance Arbitrary CatalogsFeedValidationWarnings where
  arbitrary = sized genCatalogsFeedValidationWarnings

genCatalogsFeedValidationWarnings :: Int -> Gen CatalogsFeedValidationWarnings
genCatalogsFeedValidationWarnings n =
  CatalogsFeedValidationWarnings
    <$> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage0LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage0LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage0LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage0LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage0TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage0TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage0TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage10LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage10LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage10LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage10LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage10TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage10TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage10TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage11LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage11LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage11LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage11LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage11TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage11TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage11TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage12LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage12LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage12LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage12LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage12TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage12TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage12TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage13LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage13LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage13LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage13LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage13TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage13TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage13TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage14LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage14LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage14LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage14LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage14TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage14TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage14TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage15LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage15LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage15LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage15LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage15TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage15TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage15TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage16LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage16LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage16LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage16LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage16TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage16TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage16TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage17LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage17LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage17LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage17LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage17TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage17TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage17TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage18LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage18LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage18LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage18LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage18TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage18TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage18TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage19LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage19LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage19LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage19LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage19TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage19TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage19TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage1LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage1LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage1LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage1LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage1TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage1TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage1TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage2LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage2LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage2LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage2LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage2TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage2TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage2TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage3LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage3LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage3LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage3LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage3TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage3TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage3TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage4LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage4LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage4LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage4LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage4TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage4TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage4TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage5LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage5LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage5LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage5LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage5TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage5TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage5TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage6LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage6LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage6LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage6LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage6TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage6TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage6TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage7LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage7LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage7LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage7LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage7TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage7TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage7TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage8LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage8LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage8LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage8LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage8TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage8TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage8TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage9LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage9LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage9LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage9LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage9TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage9TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdImage9TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdLinkFormatWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdLinkSameAsLink :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo0LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo0LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo0LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo0LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo0TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo0TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo0TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo1LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo1LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo1LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo1LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo1TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo1TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo1TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo2LinkDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo2LinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo2LinkRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo2LinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo2TagDuplicated :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo2TagLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdVideo2TagRequired :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdditionalImageLinkLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdditionalImageLinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdwordsFormatWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAdwordsSameAsLink :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAgeGroupInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAndroidDeepLinkInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsAvailabilityDateInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsCountryDoesNotMapToCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsCustomLabelLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsDescriptionLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsDuplicateHeaders :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsExpirationDateInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsFetchSameSignature :: Maybe E'LargeProductCountDecrease
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsGenderInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsGtinInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsImageLinkWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsInconsistentCurrencyValues :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsIndexedProductCountLargeDelta :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsIosDeepLinkInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsIsBundleInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsItemAdditionalImageDownloadFailure :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsLinkFormatWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsMinAdPriceInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsMpnInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsMultipackInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsOptionalConditionInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsOptionalConditionMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsOptionalProductCategoryInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsOptionalProductCategoryMissing :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsProductCategoryDepthWarning :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsProductTypeLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSaleDateInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSalesPriceInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSalesPriceTooHigh :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSalesPriceTooLow :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsShippingHeightInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsShippingInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsShippingWeightInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsShippingWidthInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSizeSystemInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsSizeTypeInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsTaxInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsTitleLengthTooLong :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsTooManyAdditionalImageLinks :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsUpdatedTimeInvalid :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsUtmSourceAutoCorrected :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsVideoRequiredWhenAdVideoProvided :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsWeightUnitInvalid :: Maybe Int
  
instance Arbitrary CatalogsFeedVideoCounts where
  arbitrary = sized genCatalogsFeedVideoCounts

genCatalogsFeedVideoCounts :: Int -> Gen CatalogsFeedVideoCounts
genCatalogsFeedVideoCounts n =
  CatalogsFeedVideoCounts
    <$> arbitraryReducedMaybe n -- catalogsFeedVideoCountsIngestedVideos :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedVideoCountsNotIngestedVideos :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedVideoCountsTotalVideos :: Maybe Int
  
instance Arbitrary CatalogsFeedsCreateRequest where
  arbitrary = sized genCatalogsFeedsCreateRequest

genCatalogsFeedsCreateRequest :: Int -> Gen CatalogsFeedsCreateRequest
genCatalogsFeedsCreateRequest n =
  CatalogsFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultLocale :: Maybe CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReduced n -- catalogsFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitrary -- catalogsFeedsCreateRequestLocation :: Text
    <*> arbitrary -- catalogsFeedsCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
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
    <$> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsFeedsUpdateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsHotelAddress where
  arbitrary = sized genCatalogsHotelAddress

genCatalogsHotelAddress :: Int -> Gen CatalogsHotelAddress
genCatalogsHotelAddress n =
  CatalogsHotelAddress
    <$> arbitraryReducedMaybe n -- catalogsHotelAddressAddr1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAddressCity :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAddressCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAddressPostalCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAddressRegion :: Maybe Text
  
instance Arbitrary CatalogsHotelAttributes where
  arbitrary = sized genCatalogsHotelAttributes

genCatalogsHotelAttributes :: Int -> Gen CatalogsHotelAttributes
genCatalogsHotelAttributes n =
  CatalogsHotelAttributes
    <$> arbitraryReducedMaybe n -- catalogsHotelAttributesAddress :: Maybe CatalogsHotelAddress
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesBasePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCustomLabel0 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCustomLabel1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCustomLabel2 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCustomLabel3 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesCustomLabel4 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesGuestRatings :: Maybe CatalogsHotelGuestRatings
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesLatitude :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesLongitude :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesNeighborhood :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesSalePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesAdditionalImageLink :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesMainImage :: Maybe CatalogsHotelAttributesAllOfMainImage
  
instance Arbitrary CatalogsHotelAttributesAllOfMainImage where
  arbitrary = sized genCatalogsHotelAttributesAllOfMainImage

genCatalogsHotelAttributesAllOfMainImage :: Int -> Gen CatalogsHotelAttributesAllOfMainImage
genCatalogsHotelAttributesAllOfMainImage n =
  CatalogsHotelAttributesAllOfMainImage
    <$> arbitraryReducedMaybe n -- catalogsHotelAttributesAllOfMainImageLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesAllOfMainImageTag :: Maybe [Text]
  
instance Arbitrary CatalogsHotelAvailableFilterValues where
  arbitrary = sized genCatalogsHotelAvailableFilterValues

genCatalogsHotelAvailableFilterValues :: Int -> Gen CatalogsHotelAvailableFilterValues
genCatalogsHotelAvailableFilterValues n =
  CatalogsHotelAvailableFilterValues
    <$> arbitrary -- catalogsHotelAvailableFilterValuesCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsHotelAvailableFilterValuesFilterValues :: CatalogsHotelFilterValuesMap
  
instance Arbitrary CatalogsHotelBatchItem where
  arbitrary = sized genCatalogsHotelBatchItem

genCatalogsHotelBatchItem :: Int -> Gen CatalogsHotelBatchItem
genCatalogsHotelBatchItem n =
  CatalogsHotelBatchItem
    <$> arbitraryReduced n -- catalogsHotelBatchItemAttributes :: CatalogsUpdatableHotelAttributes
    <*> arbitrary -- catalogsHotelBatchItemHotelId :: Text
    <*> arbitrary -- catalogsHotelBatchItemOperation :: E'Operation
  
instance Arbitrary CatalogsHotelBatchRequest where
  arbitrary = sized genCatalogsHotelBatchRequest

genCatalogsHotelBatchRequest :: Int -> Gen CatalogsHotelBatchRequest
genCatalogsHotelBatchRequest n =
  CatalogsHotelBatchRequest
    <$> arbitraryReducedMaybe n -- catalogsHotelBatchRequestCatalogId :: Maybe Text
    <*> arbitrary -- catalogsHotelBatchRequestCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsHotelBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsHotelBatchRequestItems :: [CatalogsHotelBatchItem]
    <*> arbitrary -- catalogsHotelBatchRequestLanguage :: E'Language
  
instance Arbitrary CatalogsHotelFeed where
  arbitrary = sized genCatalogsHotelFeed

genCatalogsHotelFeed :: Int -> Gen CatalogsHotelFeed
genCatalogsHotelFeed n =
  CatalogsHotelFeed
    <$> arbitraryReduced n -- catalogsHotelFeedCreatedAt :: DateTime
    <*> arbitrary -- catalogsHotelFeedId :: Text
    <*> arbitraryReduced n -- catalogsHotelFeedUpdatedAt :: DateTime
    <*> arbitrary -- catalogsHotelFeedCatalogId :: Text
    <*> arbitraryReduced n -- catalogsHotelFeedCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsHotelFeedCredentials :: CatalogsFeedCredentials
    <*> arbitraryReduced n -- catalogsHotelFeedDefaultCurrency :: NullableCurrency
    <*> arbitrary -- catalogsHotelFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsHotelFeedFormat :: CatalogsFormat
    <*> arbitrary -- catalogsHotelFeedLocation :: Text
    <*> arbitrary -- catalogsHotelFeedName :: Text
    <*> arbitraryReduced n -- catalogsHotelFeedPreferredProcessingSchedule :: CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsHotelFeedStatus :: CatalogsStatus
  
instance Arbitrary CatalogsHotelFeedsCreateRequest where
  arbitrary = sized genCatalogsHotelFeedsCreateRequest

genCatalogsHotelFeedsCreateRequest :: Int -> Gen CatalogsHotelFeedsCreateRequest
genCatalogsHotelFeedsCreateRequest n =
  CatalogsHotelFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestCatalogId :: Maybe Text
    <*> arbitraryReduced n -- catalogsHotelFeedsCreateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReduced n -- catalogsHotelFeedsCreateRequestDefaultLocale :: CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReduced n -- catalogsHotelFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitrary -- catalogsHotelFeedsCreateRequestLocation :: Text
    <*> arbitrary -- catalogsHotelFeedsCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsHotelFeedsUpdateRequest where
  arbitrary = sized genCatalogsHotelFeedsUpdateRequest

genCatalogsHotelFeedsUpdateRequest :: Int -> Gen CatalogsHotelFeedsUpdateRequest
genCatalogsHotelFeedsUpdateRequest n =
  CatalogsHotelFeedsUpdateRequest
    <$> arbitraryReduced n -- catalogsHotelFeedsUpdateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsUpdateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsHotelFilterValuesMap where
  arbitrary = sized genCatalogsHotelFilterValuesMap

genCatalogsHotelFilterValuesMap :: Int -> Gen CatalogsHotelFilterValuesMap
genCatalogsHotelFilterValuesMap n =
  CatalogsHotelFilterValuesMap
    <$> arbitraryReducedMaybe n -- catalogsHotelFilterValuesMapBrand :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsHotelFilterValuesMapCustomLabel0 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsHotelFilterValuesMapCustomLabel1 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsHotelFilterValuesMapCustomLabel2 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsHotelFilterValuesMapCustomLabel3 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsHotelFilterValuesMapCustomLabel4 :: Maybe [Text]
  
instance Arbitrary CatalogsHotelGuestRatings where
  arbitrary = sized genCatalogsHotelGuestRatings

genCatalogsHotelGuestRatings :: Int -> Gen CatalogsHotelGuestRatings
genCatalogsHotelGuestRatings n =
  CatalogsHotelGuestRatings
    <$> arbitraryReducedMaybe n -- catalogsHotelGuestRatingsMaxScore :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsHotelGuestRatingsNumberOfReviewers :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsHotelGuestRatingsRatingSystem :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelGuestRatingsScore :: Maybe Double
  
instance Arbitrary CatalogsHotelItemErrorResponse where
  arbitrary = sized genCatalogsHotelItemErrorResponse

genCatalogsHotelItemErrorResponse :: Int -> Gen CatalogsHotelItemErrorResponse
genCatalogsHotelItemErrorResponse n =
  CatalogsHotelItemErrorResponse
    <$> arbitraryReduced n -- catalogsHotelItemErrorResponseCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsHotelItemErrorResponseErrors :: [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- catalogsHotelItemErrorResponseHotelId :: Maybe Text
  
instance Arbitrary CatalogsHotelItemResponse where
  arbitrary = sized genCatalogsHotelItemResponse

genCatalogsHotelItemResponse :: Int -> Gen CatalogsHotelItemResponse
genCatalogsHotelItemResponse n =
  CatalogsHotelItemResponse
    <$> arbitraryReducedMaybe n -- catalogsHotelItemResponseAttributes :: Maybe CatalogsHotelAttributes
    <*> arbitraryReduced n -- catalogsHotelItemResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsHotelItemResponseHotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelItemResponsePins :: Maybe [Pin]
  
instance Arbitrary CatalogsHotelItemsBatch where
  arbitrary = sized genCatalogsHotelItemsBatch

genCatalogsHotelItemsBatch :: Int -> Gen CatalogsHotelItemsBatch
genCatalogsHotelItemsBatch n =
  CatalogsHotelItemsBatch
    <$> arbitraryReducedMaybe n -- catalogsHotelItemsBatchBatchId :: Maybe Text
    <*> arbitraryReduced n -- catalogsHotelItemsBatchCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchCreatedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchItems :: Maybe [HotelProcessingRecord]
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchStatus :: Maybe BatchOperationStatus
  
instance Arbitrary CatalogsHotelItemsFilter where
  arbitrary = sized genCatalogsHotelItemsFilter

genCatalogsHotelItemsFilter :: Int -> Gen CatalogsHotelItemsFilter
genCatalogsHotelItemsFilter n =
  CatalogsHotelItemsFilter
    <$> arbitraryReducedMaybe n -- catalogsHotelItemsFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsHotelItemsFilterCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsHotelItemsFilterHotelIds :: [Text]
  
instance Arbitrary CatalogsHotelItemsPostFilter where
  arbitrary = sized genCatalogsHotelItemsPostFilter

genCatalogsHotelItemsPostFilter :: Int -> Gen CatalogsHotelItemsPostFilter
genCatalogsHotelItemsPostFilter n =
  CatalogsHotelItemsPostFilter
    <$> arbitraryReducedMaybe n -- catalogsHotelItemsPostFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsHotelItemsPostFilterCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsHotelItemsPostFilterHotelIds :: [Text]
  
instance Arbitrary CatalogsHotelListProductsByCatalogBasedFilterRequest where
  arbitrary = sized genCatalogsHotelListProductsByCatalogBasedFilterRequest

genCatalogsHotelListProductsByCatalogBasedFilterRequest :: Int -> Gen CatalogsHotelListProductsByCatalogBasedFilterRequest
genCatalogsHotelListProductsByCatalogBasedFilterRequest n =
  CatalogsHotelListProductsByCatalogBasedFilterRequest
    <$> arbitrary -- catalogsHotelListProductsByCatalogBasedFilterRequestCatalogId :: Text
    <*> arbitrary -- catalogsHotelListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType
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
    <$> arbitrary -- catalogsHotelProductGroupCatalogId :: Text
    <*> arbitrary -- catalogsHotelProductGroupCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilters :: CatalogsHotelProductGroupFilters
    <*> arbitrary -- catalogsHotelProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupName :: Maybe Text
    <*> arbitraryReduced n -- catalogsHotelProductGroupType :: CatalogsHotelProductGroupType
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdatedAt :: Maybe Int
  
instance Arbitrary CatalogsHotelProductGroupCreateRequest where
  arbitrary = sized genCatalogsHotelProductGroupCreateRequest

genCatalogsHotelProductGroupCreateRequest :: Int -> Gen CatalogsHotelProductGroupCreateRequest
genCatalogsHotelProductGroupCreateRequest n =
  CatalogsHotelProductGroupCreateRequest
    <$> arbitrary -- catalogsHotelProductGroupCreateRequestCatalogId :: Text
    <*> arbitrary -- catalogsHotelProductGroupCreateRequestCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsHotelProductGroupCreateRequestFilters :: CatalogsHotelProductGroupFilters
    <*> arbitrary -- catalogsHotelProductGroupCreateRequestName :: Text
  
instance Arbitrary CatalogsHotelProductGroupFilterKeys where
  arbitrary = sized genCatalogsHotelProductGroupFilterKeys

genCatalogsHotelProductGroupFilterKeys :: Int -> Gen CatalogsHotelProductGroupFilterKeys
genCatalogsHotelProductGroupFilterKeys n =
  CatalogsHotelProductGroupFilterKeys
    <$> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysPrice :: CatalogsProductGroupPricingCurrencyCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysHotelId :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysBrand :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCustomLabel0 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCustomLabel1 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCustomLabel2 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCustomLabel3 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCustomLabel4 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysCountry :: CatalogsProductGroupMultipleCountriesCriteria
    <*> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysTitleKeywords :: CatalogsProductGroupMultipleStringCriteria
  
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
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestFilters :: Maybe CatalogsHotelProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestName :: Maybe Text
  
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
    <$> arbitraryReducedMaybe n -- catalogsHotelReportParametersReportReportType :: Maybe E'ReportType5
    <*> arbitrary -- catalogsHotelReportParametersReportFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsHotelReportParametersReportProcessingResultId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelReportParametersReportCatalogId :: Maybe Text
  
instance Arbitrary CatalogsHotelReportStatsParameters where
  arbitrary = sized genCatalogsHotelReportStatsParameters

genCatalogsHotelReportStatsParameters :: Int -> Gen CatalogsHotelReportStatsParameters
genCatalogsHotelReportStatsParameters n =
  CatalogsHotelReportStatsParameters
    <$> arbitrary -- catalogsHotelReportStatsParametersCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsHotelReportStatsParametersReport :: CatalogsHotelReportStatsParametersReport
  
instance Arbitrary CatalogsHotelReportStatsParametersReport where
  arbitrary = sized genCatalogsHotelReportStatsParametersReport

genCatalogsHotelReportStatsParametersReport :: Int -> Gen CatalogsHotelReportStatsParametersReport
genCatalogsHotelReportStatsParametersReport n =
  CatalogsHotelReportStatsParametersReport
    <$> arbitraryReducedMaybe n -- catalogsHotelReportStatsParametersReportReportType :: Maybe E'ReportType
    <*> arbitrary -- catalogsHotelReportStatsParametersReportFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsHotelReportStatsParametersReportProcessingResultId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelReportStatsParametersReportCatalogId :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsItemMainImageDownloadFailure :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationErrorsItemidMissing :: Maybe CatalogsItemValidationDetails
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
    <$> arbitraryReduced n -- catalogsItemValidationIssuesErrors :: CatalogsItemValidationErrors
    <*> arbitrary -- catalogsItemValidationIssuesItemId :: Text
    <*> arbitrary -- catalogsItemValidationIssuesItemNumber :: Int
    <*> arbitraryReduced n -- catalogsItemValidationIssuesWarnings :: CatalogsItemValidationWarnings
  
instance Arbitrary CatalogsItemValidationWarnings where
  arbitrary = sized genCatalogsItemValidationWarnings

genCatalogsItemValidationWarnings :: Int -> Gen CatalogsItemValidationWarnings
genCatalogsItemValidationWarnings n =
  CatalogsItemValidationWarnings
    <$> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage0LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage0LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage0LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage0LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage0TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage0TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage0TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage10LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage10LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage10LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage10LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage10TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage10TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage10TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage11LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage11LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage11LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage11LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage11TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage11TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage11TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage12LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage12LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage12LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage12LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage12TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage12TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage12TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage13LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage13LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage13LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage13LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage13TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage13TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage13TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage14LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage14LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage14LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage14LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage14TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage14TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage14TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage15LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage15LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage15LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage15LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage15TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage15TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage15TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage16LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage16LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage16LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage16LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage16TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage16TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage16TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage17LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage17LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage17LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage17LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage17TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage17TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage17TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage18LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage18LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage18LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage18LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage18TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage18TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage18TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage19LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage19LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage19LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage19LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage19TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage19TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage19TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage1LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage1LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage1LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage1LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage1TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage1TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage1TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage2LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage2LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage2LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage2LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage2TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage2TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage2TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage3LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage3LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage3LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage3LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage3TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage3TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage3TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage4LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage4LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage4LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage4LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage4TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage4TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage4TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage5LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage5LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage5LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage5LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage5TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage5TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage5TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage6LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage6LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage6LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage6LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage6TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage6TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage6TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage7LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage7LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage7LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage7LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage7TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage7TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage7TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage8LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage8LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage8LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage8LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage8TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage8TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage8TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage9LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage9LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage9LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage9LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage9TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage9TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdImage9TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdLinkFormatWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdLinkSameAsLink :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo0LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo0LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo0LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo0LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo0TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo0TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo0TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo1LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo1LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo1LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo1LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo1TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo1TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo1TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo2LinkDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo2LinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo2LinkRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo2LinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo2TagDuplicated :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo2TagLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdVideo2TagRequired :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdditionalImageLinkLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdditionalImageLinkWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdwordsFormatWarning :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAdwordsSameAsLink :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsAgeGroupInvalid :: Maybe CatalogsItemValidationDetails
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
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSaleDateInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSalesPriceInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSalesPriceTooHigh :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSalesPriceTooLow :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsShippingHeightInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsShippingInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsShippingWeightInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsShippingWidthInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSizeSystemInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsSizeTypeInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsTaxInvalid :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsTitleLengthTooLong :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsTooManyAdditionalImageLinks :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsUtmSourceAutoCorrected :: Maybe CatalogsItemValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsItemValidationWarningsVideoRequiredWhenAdVideoProvided :: Maybe CatalogsItemValidationDetails
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
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReduced n -- catalogsItemsBatchCreatedTime :: DateTime
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchItems :: Maybe [CreativeAssetsProcessingRecord]
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchStatus :: Maybe BatchOperationStatus
  
instance Arbitrary CatalogsItemsBatchRequest where
  arbitrary = sized genCatalogsItemsBatchRequest

genCatalogsItemsBatchRequest :: Int -> Gen CatalogsItemsBatchRequest
genCatalogsItemsBatchRequest n =
  CatalogsItemsBatchRequest
    <$> arbitraryReduced n -- catalogsItemsBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsBatchRequestItems :: [ItemDeleteBatchRecord]
    <*> arbitrary -- catalogsItemsBatchRequestLanguage :: E'Language
    <*> arbitraryReduced n -- catalogsItemsBatchRequestOperation :: BatchOperation
  
instance Arbitrary CatalogsItemsCreateBatchRequest where
  arbitrary = sized genCatalogsItemsCreateBatchRequest

genCatalogsItemsCreateBatchRequest :: Int -> Gen CatalogsItemsCreateBatchRequest
genCatalogsItemsCreateBatchRequest n =
  CatalogsItemsCreateBatchRequest
    <$> arbitraryReduced n -- catalogsItemsCreateBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsCreateBatchRequestItems :: [ItemCreateBatchRecord]
    <*> arbitrary -- catalogsItemsCreateBatchRequestLanguage :: E'Language
    <*> arbitraryReduced n -- catalogsItemsCreateBatchRequestOperation :: BatchOperation
  
instance Arbitrary CatalogsItemsDeleteBatchRequest where
  arbitrary = sized genCatalogsItemsDeleteBatchRequest

genCatalogsItemsDeleteBatchRequest :: Int -> Gen CatalogsItemsDeleteBatchRequest
genCatalogsItemsDeleteBatchRequest n =
  CatalogsItemsDeleteBatchRequest
    <$> arbitraryReduced n -- catalogsItemsDeleteBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsDeleteBatchRequestItems :: [ItemDeleteBatchRecord]
    <*> arbitrary -- catalogsItemsDeleteBatchRequestLanguage :: E'Language
    <*> arbitraryReduced n -- catalogsItemsDeleteBatchRequestOperation :: BatchOperation
  
instance Arbitrary CatalogsItemsDeleteDiscontinuedBatchRequest where
  arbitrary = sized genCatalogsItemsDeleteDiscontinuedBatchRequest

genCatalogsItemsDeleteDiscontinuedBatchRequest :: Int -> Gen CatalogsItemsDeleteDiscontinuedBatchRequest
genCatalogsItemsDeleteDiscontinuedBatchRequest n =
  CatalogsItemsDeleteDiscontinuedBatchRequest
    <$> arbitraryReduced n -- catalogsItemsDeleteDiscontinuedBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsDeleteDiscontinuedBatchRequestItems :: [ItemDeleteDiscontinuedBatchRecord]
    <*> arbitrary -- catalogsItemsDeleteDiscontinuedBatchRequestLanguage :: E'Language
    <*> arbitraryReduced n -- catalogsItemsDeleteDiscontinuedBatchRequestOperation :: BatchOperation
  
instance Arbitrary CatalogsItemsFilters where
  arbitrary = sized genCatalogsItemsFilters

genCatalogsItemsFilters :: Int -> Gen CatalogsItemsFilters
genCatalogsItemsFilters n =
  CatalogsItemsFilters
    <$> arbitraryReduced n -- catalogsItemsFiltersCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsItemsFiltersCatalogId :: Maybe Text
    <*> arbitrary -- catalogsItemsFiltersItemIds :: [Text]
    <*> arbitrary -- catalogsItemsFiltersHotelIds :: [Text]
    <*> arbitrary -- catalogsItemsFiltersCreativeAssetsIds :: [Text]
  
instance Arbitrary CatalogsItemsPostFilters where
  arbitrary = sized genCatalogsItemsPostFilters

genCatalogsItemsPostFilters :: Int -> Gen CatalogsItemsPostFilters
genCatalogsItemsPostFilters n =
  CatalogsItemsPostFilters
    <$> arbitraryReduced n -- catalogsItemsPostFiltersCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsItemsPostFiltersCatalogId :: Maybe Text
    <*> arbitrary -- catalogsItemsPostFiltersItemIds :: [Text]
    <*> arbitrary -- catalogsItemsPostFiltersHotelIds :: [Text]
    <*> arbitrary -- catalogsItemsPostFiltersCreativeAssetsIds :: [Text]
  
instance Arbitrary CatalogsItemsRequest where
  arbitrary = sized genCatalogsItemsRequest

genCatalogsItemsRequest :: Int -> Gen CatalogsItemsRequest
genCatalogsItemsRequest n =
  CatalogsItemsRequest
    <$> arbitraryReduced n -- catalogsItemsRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsRequestFilters :: CatalogsItemsPostFilters
    <*> arbitrary -- catalogsItemsRequestLanguage :: E'Language
  
instance Arbitrary CatalogsItemsUpdateBatchRequest where
  arbitrary = sized genCatalogsItemsUpdateBatchRequest

genCatalogsItemsUpdateBatchRequest :: Int -> Gen CatalogsItemsUpdateBatchRequest
genCatalogsItemsUpdateBatchRequest n =
  CatalogsItemsUpdateBatchRequest
    <$> arbitraryReduced n -- catalogsItemsUpdateBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsUpdateBatchRequestItems :: [ItemUpdateBatchRecord]
    <*> arbitrary -- catalogsItemsUpdateBatchRequestLanguage :: E'Language
    <*> arbitraryReduced n -- catalogsItemsUpdateBatchRequestOperation :: BatchOperation
  
instance Arbitrary CatalogsItemsUpsertBatchRequest where
  arbitrary = sized genCatalogsItemsUpsertBatchRequest

genCatalogsItemsUpsertBatchRequest :: Int -> Gen CatalogsItemsUpsertBatchRequest
genCatalogsItemsUpsertBatchRequest n =
  CatalogsItemsUpsertBatchRequest
    <$> arbitraryReduced n -- catalogsItemsUpsertBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsUpsertBatchRequestItems :: [ItemUpsertBatchRecord]
    <*> arbitrary -- catalogsItemsUpsertBatchRequestLanguage :: E'Language
    <*> arbitraryReduced n -- catalogsItemsUpsertBatchRequestOperation :: BatchOperation
  
instance Arbitrary CatalogsList200Response where
  arbitrary = sized genCatalogsList200Response

genCatalogsList200Response :: Int -> Gen CatalogsList200Response
genCatalogsList200Response n =
  CatalogsList200Response
    <$> arbitraryReducedMaybe n -- catalogsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- catalogsList200ResponseItems :: [Catalog]
  
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
    <*> arbitrary -- catalogsListProductsByFilterRequestCatalogId :: Text
    <*> arbitrary -- catalogsListProductsByFilterRequestCatalogType :: E'CatalogType3
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
    <$> arbitraryReducedMaybe n -- catalogsProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitrary -- catalogsProductGroupCreateRequestFeedId :: Text
    <*> arbitraryReduced n -- catalogsProductGroupCreateRequestFilters :: CatalogsProductGroupFiltersRequest
    <*> arbitraryReducedMaybe n -- catalogsProductGroupCreateRequestIsFeatured :: Maybe Bool
    <*> arbitrary -- catalogsProductGroupCreateRequestName :: Text
  
instance Arbitrary CatalogsProductGroupCurrencyCriteria where
  arbitrary = sized genCatalogsProductGroupCurrencyCriteria

genCatalogsProductGroupCurrencyCriteria :: Int -> Gen CatalogsProductGroupCurrencyCriteria
genCatalogsProductGroupCurrencyCriteria n =
  CatalogsProductGroupCurrencyCriteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupCurrencyCriteriaNegated :: Maybe Bool
    <*> arbitraryReduced n -- catalogsProductGroupCurrencyCriteriaValues :: NonNullableCatalogsCurrency
  
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
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel0 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel1 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel2 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel3 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomLabel4 :: CatalogsProductGroupFilterOperatorTypeCriteria
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
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomNumber0 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomNumber1 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomNumber2 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomNumber3 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomNumber4 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysTitleKeywords :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary CatalogsProductGroupFilterOperatorTypeCriteria where
  arbitrary = sized genCatalogsProductGroupFilterOperatorTypeCriteria

genCatalogsProductGroupFilterOperatorTypeCriteria :: Int -> Gen CatalogsProductGroupFilterOperatorTypeCriteria
genCatalogsProductGroupFilterOperatorTypeCriteria n =
  CatalogsProductGroupFilterOperatorTypeCriteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorType :: Maybe E'FilterOperatorType
    <*> arbitraryReducedMaybe n -- catalogsProductGroupFilterOperatorTypeCriteriaNegated :: Maybe Bool
    <*> arbitrary -- catalogsProductGroupFilterOperatorTypeCriteriaValues :: [Text]
  
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
  
instance Arbitrary CatalogsProductGroupMultipleCountriesCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleCountriesCriteria

genCatalogsProductGroupMultipleCountriesCriteria :: Int -> Gen CatalogsProductGroupMultipleCountriesCriteria
genCatalogsProductGroupMultipleCountriesCriteria n =
  CatalogsProductGroupMultipleCountriesCriteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupMultipleCountriesCriteriaNegated :: Maybe Bool
    <*> arbitraryReduced n -- catalogsProductGroupMultipleCountriesCriteriaValues :: [Country]
  
instance Arbitrary CatalogsProductGroupMultipleGenderCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleGenderCriteria

genCatalogsProductGroupMultipleGenderCriteria :: Int -> Gen CatalogsProductGroupMultipleGenderCriteria
genCatalogsProductGroupMultipleGenderCriteria n =
  CatalogsProductGroupMultipleGenderCriteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupMultipleGenderCriteriaNegated :: Maybe Bool
    <*> arbitraryReduced n -- catalogsProductGroupMultipleGenderCriteriaValues :: [Gender]
  
instance Arbitrary CatalogsProductGroupMultipleMediaTypesCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleMediaTypesCriteria

genCatalogsProductGroupMultipleMediaTypesCriteria :: Int -> Gen CatalogsProductGroupMultipleMediaTypesCriteria
genCatalogsProductGroupMultipleMediaTypesCriteria n =
  CatalogsProductGroupMultipleMediaTypesCriteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupMultipleMediaTypesCriteriaNegated :: Maybe Bool
    <*> arbitraryReduced n -- catalogsProductGroupMultipleMediaTypesCriteriaValues :: [MediaType]
  
instance Arbitrary CatalogsProductGroupMultipleStringCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleStringCriteria

genCatalogsProductGroupMultipleStringCriteria :: Int -> Gen CatalogsProductGroupMultipleStringCriteria
genCatalogsProductGroupMultipleStringCriteria n =
  CatalogsProductGroupMultipleStringCriteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupMultipleStringCriteriaNegated :: Maybe Bool
    <*> arbitrary -- catalogsProductGroupMultipleStringCriteriaValues :: [Text]
  
instance Arbitrary CatalogsProductGroupMultipleStringListCriteria where
  arbitrary = sized genCatalogsProductGroupMultipleStringListCriteria

genCatalogsProductGroupMultipleStringListCriteria :: Int -> Gen CatalogsProductGroupMultipleStringListCriteria
genCatalogsProductGroupMultipleStringListCriteria n =
  CatalogsProductGroupMultipleStringListCriteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupMultipleStringListCriteriaNegated :: Maybe Bool
    <*> arbitraryReduced n -- catalogsProductGroupMultipleStringListCriteriaValues :: [[Text]]
  
instance Arbitrary CatalogsProductGroupPinsList200Response where
  arbitrary = sized genCatalogsProductGroupPinsList200Response

genCatalogsProductGroupPinsList200Response :: Int -> Gen CatalogsProductGroupPinsList200Response
genCatalogsProductGroupPinsList200Response n =
  CatalogsProductGroupPinsList200Response
    <$> arbitraryReducedMaybe n -- catalogsProductGroupPinsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- catalogsProductGroupPinsList200ResponseItems :: [CatalogsProduct]
  
instance Arbitrary CatalogsProductGroupPricingCriteria where
  arbitrary = sized genCatalogsProductGroupPricingCriteria

genCatalogsProductGroupPricingCriteria :: Int -> Gen CatalogsProductGroupPricingCriteria
genCatalogsProductGroupPricingCriteria n =
  CatalogsProductGroupPricingCriteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupPricingCriteriaInclusion :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupPricingCriteriaNegated :: Maybe Bool
    <*> arbitrary -- catalogsProductGroupPricingCriteriaValues :: Double
  
instance Arbitrary CatalogsProductGroupPricingCurrencyCriteria where
  arbitrary = sized genCatalogsProductGroupPricingCurrencyCriteria

genCatalogsProductGroupPricingCurrencyCriteria :: Int -> Gen CatalogsProductGroupPricingCurrencyCriteria
genCatalogsProductGroupPricingCurrencyCriteria n =
  CatalogsProductGroupPricingCurrencyCriteria
    <$> arbitraryReduced n -- catalogsProductGroupPricingCurrencyCriteriaCurrency :: NonNullableCatalogsCurrency
    <*> arbitraryReducedMaybe n -- catalogsProductGroupPricingCurrencyCriteriaNegated :: Maybe Bool
    <*> arbitrary -- catalogsProductGroupPricingCurrencyCriteriaOperator :: E'Operator
    <*> arbitrary -- catalogsProductGroupPricingCurrencyCriteriaValue :: Double
  
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
  
instance Arbitrary CatalogsProductGroupUint32Criteria where
  arbitrary = sized genCatalogsProductGroupUint32Criteria

genCatalogsProductGroupUint32Criteria :: Int -> Gen CatalogsProductGroupUint32Criteria
genCatalogsProductGroupUint32Criteria n =
  CatalogsProductGroupUint32Criteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupUint32CriteriaNegated :: Maybe Bool
    <*> arbitrary -- catalogsProductGroupUint32CriteriaOperator :: E'Operator
    <*> arbitrary -- catalogsProductGroupUint32CriteriaValue :: Int
  
instance Arbitrary CatalogsProductGroupUpdateRequest where
  arbitrary = sized genCatalogsProductGroupUpdateRequest

genCatalogsProductGroupUpdateRequest :: Int -> Gen CatalogsProductGroupUpdateRequest
genCatalogsProductGroupUpdateRequest n =
  CatalogsProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestFilters :: Maybe CatalogsProductGroupFiltersRequest
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestName :: Maybe Text
  
instance Arbitrary CatalogsProductGroupsList200Response where
  arbitrary = sized genCatalogsProductGroupsList200Response

genCatalogsProductGroupsList200Response :: Int -> Gen CatalogsProductGroupsList200Response
genCatalogsProductGroupsList200Response n =
  CatalogsProductGroupsList200Response
    <$> arbitraryReducedMaybe n -- catalogsProductGroupsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- catalogsProductGroupsList200ResponseItems :: [CatalogsVerticalProductGroup]
  
instance Arbitrary CatalogsProductGroupsUpdateRequest where
  arbitrary = sized genCatalogsProductGroupsUpdateRequest

genCatalogsProductGroupsUpdateRequest :: Int -> Gen CatalogsProductGroupsUpdateRequest
genCatalogsProductGroupsUpdateRequest n =
  CatalogsProductGroupsUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestFilters :: Maybe CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestCatalogType :: Maybe E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestLocale :: Maybe CatalogsLocale
  
instance Arbitrary CatalogsReport where
  arbitrary = sized genCatalogsReport

genCatalogsReport :: Int -> Gen CatalogsReport
genCatalogsReport n =
  CatalogsReport
    <$> arbitraryReducedMaybe n -- catalogsReportReportStatus :: Maybe E'ReportStatus
    <*> arbitraryReducedMaybe n -- catalogsReportSize :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsReportUrl :: Maybe Text
  
instance Arbitrary CatalogsReportAllItemsFilter where
  arbitrary = sized genCatalogsReportAllItemsFilter

genCatalogsReportAllItemsFilter :: Int -> Gen CatalogsReportAllItemsFilter
genCatalogsReportAllItemsFilter n =
  CatalogsReportAllItemsFilter
    <$> arbitraryReducedMaybe n -- catalogsReportAllItemsFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsReportAllItemsFilterReportType :: E'ReportType4
  
instance Arbitrary CatalogsReportDistributionIssueFilter where
  arbitrary = sized genCatalogsReportDistributionIssueFilter

genCatalogsReportDistributionIssueFilter :: Int -> Gen CatalogsReportDistributionIssueFilter
genCatalogsReportDistributionIssueFilter n =
  CatalogsReportDistributionIssueFilter
    <$> arbitraryReducedMaybe n -- catalogsReportDistributionIssueFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsReportDistributionIssueFilterReportType :: E'ReportType3
  
instance Arbitrary CatalogsReportDistributionStats where
  arbitrary = sized genCatalogsReportDistributionStats

genCatalogsReportDistributionStats :: Int -> Gen CatalogsReportDistributionStats
genCatalogsReportDistributionStats n =
  CatalogsReportDistributionStats
    <$> arbitraryReducedMaybe n -- catalogsReportDistributionStatsCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsCodeLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsIneligibleForAds :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsIneligibleForOrganic :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsOccurrences :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsReportType :: Maybe E'ReportType3
  
instance Arbitrary CatalogsReportFeedIngestionFilter where
  arbitrary = sized genCatalogsReportFeedIngestionFilter

genCatalogsReportFeedIngestionFilter :: Int -> Gen CatalogsReportFeedIngestionFilter
genCatalogsReportFeedIngestionFilter n =
  CatalogsReportFeedIngestionFilter
    <$> arbitrary -- catalogsReportFeedIngestionFilterFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionFilterProcessingResultId :: Maybe Text
    <*> arbitrary -- catalogsReportFeedIngestionFilterReportType :: E'ReportType2
  
instance Arbitrary CatalogsReportFeedIngestionStats where
  arbitrary = sized genCatalogsReportFeedIngestionStats

genCatalogsReportFeedIngestionStats :: Int -> Gen CatalogsReportFeedIngestionStats
genCatalogsReportFeedIngestionStats n =
  CatalogsReportFeedIngestionStats
    <$> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsCodeLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsOccurrences :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportFeedIngestionStatsReportType :: Maybe E'ReportType2
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
  
instance Arbitrary CatalogsRetailAvailableFilterValues where
  arbitrary = sized genCatalogsRetailAvailableFilterValues

genCatalogsRetailAvailableFilterValues :: Int -> Gen CatalogsRetailAvailableFilterValues
genCatalogsRetailAvailableFilterValues n =
  CatalogsRetailAvailableFilterValues
    <$> arbitrary -- catalogsRetailAvailableFilterValuesCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsRetailAvailableFilterValuesFilterValues :: CatalogsRetailFilterValuesMap
  
instance Arbitrary CatalogsRetailBatchRequest where
  arbitrary = sized genCatalogsRetailBatchRequest

genCatalogsRetailBatchRequest :: Int -> Gen CatalogsRetailBatchRequest
genCatalogsRetailBatchRequest n =
  CatalogsRetailBatchRequest
    <$> arbitraryReducedMaybe n -- catalogsRetailBatchRequestCatalogId :: Maybe Text
    <*> arbitrary -- catalogsRetailBatchRequestCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsRetailBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsRetailBatchRequestItems :: [CatalogsRetailBatchRequestItemsInner]
    <*> arbitrary -- catalogsRetailBatchRequestLanguage :: E'Language
  
instance Arbitrary CatalogsRetailBatchRequestItemsInner where
  arbitrary = sized genCatalogsRetailBatchRequestItemsInner

genCatalogsRetailBatchRequestItemsInner :: Int -> Gen CatalogsRetailBatchRequestItemsInner
genCatalogsRetailBatchRequestItemsInner n =
  CatalogsRetailBatchRequestItemsInner
    <$> arbitraryReduced n -- catalogsRetailBatchRequestItemsInnerAttributes :: ItemAttributesRequest
    <*> arbitrary -- catalogsRetailBatchRequestItemsInnerItemId :: Text
    <*> arbitrary -- catalogsRetailBatchRequestItemsInnerOperation :: E'Operation
    <*> arbitraryReducedMaybe n -- catalogsRetailBatchRequestItemsInnerUpdateMask :: Maybe [UpdateMaskFieldType]
    <*> arbitraryReducedMaybe n -- catalogsRetailBatchRequestItemsInnerLastUpdatedTime :: Maybe Integer
  
instance Arbitrary CatalogsRetailFeed where
  arbitrary = sized genCatalogsRetailFeed

genCatalogsRetailFeed :: Int -> Gen CatalogsRetailFeed
genCatalogsRetailFeed n =
  CatalogsRetailFeed
    <$> arbitraryReduced n -- catalogsRetailFeedCreatedAt :: DateTime
    <*> arbitrary -- catalogsRetailFeedId :: Text
    <*> arbitraryReduced n -- catalogsRetailFeedUpdatedAt :: DateTime
    <*> arbitraryReduced n -- catalogsRetailFeedCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsRetailFeedCredentials :: CatalogsFeedCredentials
    <*> arbitraryReduced n -- catalogsRetailFeedDefaultAvailability :: ProductAvailabilityType
    <*> arbitraryReduced n -- catalogsRetailFeedDefaultCountry :: Country
    <*> arbitraryReduced n -- catalogsRetailFeedDefaultCurrency :: NullableCurrency
    <*> arbitrary -- catalogsRetailFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsRetailFeedFormat :: CatalogsFormat
    <*> arbitrary -- catalogsRetailFeedLocation :: Text
    <*> arbitrary -- catalogsRetailFeedName :: Text
    <*> arbitraryReduced n -- catalogsRetailFeedPreferredProcessingSchedule :: CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsRetailFeedStatus :: CatalogsStatus
  
instance Arbitrary CatalogsRetailFeedsCreateRequest where
  arbitrary = sized genCatalogsRetailFeedsCreateRequest

genCatalogsRetailFeedsCreateRequest :: Int -> Gen CatalogsRetailFeedsCreateRequest
genCatalogsRetailFeedsCreateRequest n =
  CatalogsRetailFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestCatalogId :: Maybe Text
    <*> arbitraryReduced n -- catalogsRetailFeedsCreateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReduced n -- catalogsRetailFeedsCreateRequestDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReduced n -- catalogsRetailFeedsCreateRequestDefaultLocale :: CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReduced n -- catalogsRetailFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitrary -- catalogsRetailFeedsCreateRequestLocation :: Text
    <*> arbitrary -- catalogsRetailFeedsCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsRetailFeedsUpdateRequest where
  arbitrary = sized genCatalogsRetailFeedsUpdateRequest

genCatalogsRetailFeedsUpdateRequest :: Int -> Gen CatalogsRetailFeedsUpdateRequest
genCatalogsRetailFeedsUpdateRequest n =
  CatalogsRetailFeedsUpdateRequest
    <$> arbitraryReduced n -- catalogsRetailFeedsUpdateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsUpdateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsRetailFilterValuesMap where
  arbitrary = sized genCatalogsRetailFilterValuesMap

genCatalogsRetailFilterValuesMap :: Int -> Gen CatalogsRetailFilterValuesMap
genCatalogsRetailFilterValuesMap n =
  CatalogsRetailFilterValuesMap
    <$> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapAdImageTags :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapAdVideoTags :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapAvailability :: Maybe [E'Availability]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapBrand :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCondition :: Maybe [E'Condition]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCustomLabel0 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCustomLabel1 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCustomLabel2 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCustomLabel3 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCustomLabel4 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGender :: Maybe [E'Gender]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory0 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory1 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory2 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory3 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory4 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory5 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory6 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapMediaType :: Maybe [E'MediaType6]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapProductType0 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapProductType1 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapProductType2 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapProductType3 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapProductType4 :: Maybe [Text]
  
instance Arbitrary CatalogsRetailItemErrorResponse where
  arbitrary = sized genCatalogsRetailItemErrorResponse

genCatalogsRetailItemErrorResponse :: Int -> Gen CatalogsRetailItemErrorResponse
genCatalogsRetailItemErrorResponse n =
  CatalogsRetailItemErrorResponse
    <$> arbitraryReduced n -- catalogsRetailItemErrorResponseCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsRetailItemErrorResponseErrors :: [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- catalogsRetailItemErrorResponseItemId :: Maybe Text
  
instance Arbitrary CatalogsRetailItemResponse where
  arbitrary = sized genCatalogsRetailItemResponse

genCatalogsRetailItemResponse :: Int -> Gen CatalogsRetailItemResponse
genCatalogsRetailItemResponse n =
  CatalogsRetailItemResponse
    <$> arbitraryReducedMaybe n -- catalogsRetailItemResponseAttributes :: Maybe ItemAttributes
    <*> arbitraryReduced n -- catalogsRetailItemResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsRetailItemResponseItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailItemResponsePins :: Maybe [Pin]
  
instance Arbitrary CatalogsRetailItemsBatch where
  arbitrary = sized genCatalogsRetailItemsBatch

genCatalogsRetailItemsBatch :: Int -> Gen CatalogsRetailItemsBatch
genCatalogsRetailItemsBatch n =
  CatalogsRetailItemsBatch
    <$> arbitraryReducedMaybe n -- catalogsRetailItemsBatchBatchId :: Maybe Text
    <*> arbitraryReduced n -- catalogsRetailItemsBatchCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReduced n -- catalogsRetailItemsBatchCreatedTime :: DateTime
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsBatchItems :: Maybe [ItemProcessingRecord]
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsBatchStatus :: Maybe BatchOperationStatus
  
instance Arbitrary CatalogsRetailItemsFilter where
  arbitrary = sized genCatalogsRetailItemsFilter

genCatalogsRetailItemsFilter :: Int -> Gen CatalogsRetailItemsFilter
genCatalogsRetailItemsFilter n =
  CatalogsRetailItemsFilter
    <$> arbitraryReducedMaybe n -- catalogsRetailItemsFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsRetailItemsFilterCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsRetailItemsFilterItemIds :: [Text]
  
instance Arbitrary CatalogsRetailItemsPostFilter where
  arbitrary = sized genCatalogsRetailItemsPostFilter

genCatalogsRetailItemsPostFilter :: Int -> Gen CatalogsRetailItemsPostFilter
genCatalogsRetailItemsPostFilter n =
  CatalogsRetailItemsPostFilter
    <$> arbitraryReducedMaybe n -- catalogsRetailItemsPostFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsRetailItemsPostFilterCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsRetailItemsPostFilterItemIds :: [Text]
  
instance Arbitrary CatalogsRetailListProductsByCatalogBasedFilterRequest where
  arbitrary = sized genCatalogsRetailListProductsByCatalogBasedFilterRequest

genCatalogsRetailListProductsByCatalogBasedFilterRequest :: Int -> Gen CatalogsRetailListProductsByCatalogBasedFilterRequest
genCatalogsRetailListProductsByCatalogBasedFilterRequest n =
  CatalogsRetailListProductsByCatalogBasedFilterRequest
    <$> arbitrary -- catalogsRetailListProductsByCatalogBasedFilterRequestCatalogId :: Text
    <*> arbitrary -- catalogsRetailListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsRetailListProductsByCatalogBasedFilterRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsRetailListProductsByCatalogBasedFilterRequestFilters :: CatalogsProductGroupFilters
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
    <$> arbitrary -- catalogsRetailProductGroupCatalogId :: Text
    <*> arbitrary -- catalogsRetailProductGroupCatalogType :: E'CatalogType2
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupDescription :: Maybe Text
    <*> arbitrary -- catalogsRetailProductGroupFeedId :: Text
    <*> arbitraryReduced n -- catalogsRetailProductGroupFilters :: CatalogsProductGroupFilters
    <*> arbitrary -- catalogsRetailProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupLocale :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupStatus :: Maybe CatalogsProductGroupStatus
    <*> arbitraryReduced n -- catalogsRetailProductGroupType :: CatalogsProductGroupType
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdatedAt :: Maybe Int
  
instance Arbitrary CatalogsRetailProductGroupCreateRequest where
  arbitrary = sized genCatalogsRetailProductGroupCreateRequest

genCatalogsRetailProductGroupCreateRequest :: Int -> Gen CatalogsRetailProductGroupCreateRequest
genCatalogsRetailProductGroupCreateRequest n =
  CatalogsRetailProductGroupCreateRequest
    <$> arbitrary -- catalogsRetailProductGroupCreateRequestCatalogId :: Text
    <*> arbitrary -- catalogsRetailProductGroupCreateRequestCatalogType :: E'CatalogType2
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupCreateRequestCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsRetailProductGroupCreateRequestFilters :: CatalogsProductGroupFiltersRequest
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupCreateRequestLocale :: Maybe CatalogsLocale
    <*> arbitrary -- catalogsRetailProductGroupCreateRequestName :: Text
  
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
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestFilters :: Maybe CatalogsProductGroupFiltersRequest
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestLocale :: Maybe CatalogsLocale
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestName :: Maybe Text
  
instance Arbitrary CatalogsRetailProductMetadata where
  arbitrary = sized genCatalogsRetailProductMetadata

genCatalogsRetailProductMetadata :: Int -> Gen CatalogsRetailProductMetadata
genCatalogsRetailProductMetadata n =
  CatalogsRetailProductMetadata
    <$> arbitraryReduced n -- catalogsRetailProductMetadataAvailability :: NonNullableProductAvailabilityType
    <*> arbitraryReduced n -- catalogsRetailProductMetadataCurrency :: NonNullableCatalogsCurrency
    <*> arbitrary -- catalogsRetailProductMetadataItemGroupId :: Text
    <*> arbitrary -- catalogsRetailProductMetadataItemId :: Text
    <*> arbitrary -- catalogsRetailProductMetadataPrice :: Double
    <*> arbitrary -- catalogsRetailProductMetadataSalePrice :: Double
  
instance Arbitrary CatalogsRetailReportParameters where
  arbitrary = sized genCatalogsRetailReportParameters

genCatalogsRetailReportParameters :: Int -> Gen CatalogsRetailReportParameters
genCatalogsRetailReportParameters n =
  CatalogsRetailReportParameters
    <$> arbitrary -- catalogsRetailReportParametersCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsRetailReportParametersReport :: CatalogsHotelReportParametersReport
  
instance Arbitrary CatalogsRetailReportStatsParameters where
  arbitrary = sized genCatalogsRetailReportStatsParameters

genCatalogsRetailReportStatsParameters :: Int -> Gen CatalogsRetailReportStatsParameters
genCatalogsRetailReportStatsParameters n =
  CatalogsRetailReportStatsParameters
    <$> arbitrary -- catalogsRetailReportStatsParametersCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsRetailReportStatsParametersReport :: CatalogsHotelReportStatsParametersReport
  
instance Arbitrary CatalogsUpdatableCreativeAssetsAttributes where
  arbitrary = sized genCatalogsUpdatableCreativeAssetsAttributes

genCatalogsUpdatableCreativeAssetsAttributes :: Int -> Gen CatalogsUpdatableCreativeAssetsAttributes
genCatalogsUpdatableCreativeAssetsAttributes n =
  CatalogsUpdatableCreativeAssetsAttributes
    <$> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesCustomLabel0 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesCustomLabel1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesCustomLabel2 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesCustomLabel3 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesCustomLabel4 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesGoogleProductCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableCreativeAssetsAttributesVisibility :: Maybe Text
  
instance Arbitrary CatalogsUpdatableHotelAttributes where
  arbitrary = sized genCatalogsUpdatableHotelAttributes

genCatalogsUpdatableHotelAttributes :: Int -> Gen CatalogsUpdatableHotelAttributes
genCatalogsUpdatableHotelAttributes n =
  CatalogsUpdatableHotelAttributes
    <$> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesAddress :: Maybe CatalogsHotelAddress
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesBasePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCustomLabel0 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCustomLabel1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCustomLabel2 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCustomLabel3 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesCustomLabel4 :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesGuestRatings :: Maybe CatalogsHotelGuestRatings
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesLatitude :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesLongitude :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesNeighborhood :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsUpdatableHotelAttributesSalePrice :: Maybe Text
  
instance Arbitrary CatalogsUpdateCreativeAssetsItem where
  arbitrary = sized genCatalogsUpdateCreativeAssetsItem

genCatalogsUpdateCreativeAssetsItem :: Int -> Gen CatalogsUpdateCreativeAssetsItem
genCatalogsUpdateCreativeAssetsItem n =
  CatalogsUpdateCreativeAssetsItem
    <$> arbitraryReduced n -- catalogsUpdateCreativeAssetsItemAttributes :: CatalogsUpdatableCreativeAssetsAttributes
    <*> arbitrary -- catalogsUpdateCreativeAssetsItemCreativeAssetsId :: Text
    <*> arbitrary -- catalogsUpdateCreativeAssetsItemOperation :: E'Operation3
  
instance Arbitrary CatalogsUpdateHotelItem where
  arbitrary = sized genCatalogsUpdateHotelItem

genCatalogsUpdateHotelItem :: Int -> Gen CatalogsUpdateHotelItem
genCatalogsUpdateHotelItem n =
  CatalogsUpdateHotelItem
    <$> arbitraryReduced n -- catalogsUpdateHotelItemAttributes :: CatalogsUpdatableHotelAttributes
    <*> arbitrary -- catalogsUpdateHotelItemHotelId :: Text
    <*> arbitrary -- catalogsUpdateHotelItemOperation :: E'Operation3
  
instance Arbitrary CatalogsUpdateRetailItem where
  arbitrary = sized genCatalogsUpdateRetailItem

genCatalogsUpdateRetailItem :: Int -> Gen CatalogsUpdateRetailItem
genCatalogsUpdateRetailItem n =
  CatalogsUpdateRetailItem
    <$> arbitraryReduced n -- catalogsUpdateRetailItemAttributes :: UpdatableItemAttributes
    <*> arbitrary -- catalogsUpdateRetailItemItemId :: Text
    <*> arbitrary -- catalogsUpdateRetailItemOperation :: E'Operation3
    <*> arbitraryReducedMaybe n -- catalogsUpdateRetailItemUpdateMask :: Maybe [UpdateMaskFieldType]
  
instance Arbitrary CatalogsUpsertCreativeAssetsItem where
  arbitrary = sized genCatalogsUpsertCreativeAssetsItem

genCatalogsUpsertCreativeAssetsItem :: Int -> Gen CatalogsUpsertCreativeAssetsItem
genCatalogsUpsertCreativeAssetsItem n =
  CatalogsUpsertCreativeAssetsItem
    <$> arbitraryReduced n -- catalogsUpsertCreativeAssetsItemAttributes :: CatalogsCreativeAssetsAttributes
    <*> arbitrary -- catalogsUpsertCreativeAssetsItemCreativeAssetsId :: Text
    <*> arbitrary -- catalogsUpsertCreativeAssetsItemOperation :: E'Operation4
  
instance Arbitrary CatalogsUpsertHotelItem where
  arbitrary = sized genCatalogsUpsertHotelItem

genCatalogsUpsertHotelItem :: Int -> Gen CatalogsUpsertHotelItem
genCatalogsUpsertHotelItem n =
  CatalogsUpsertHotelItem
    <$> arbitraryReduced n -- catalogsUpsertHotelItemAttributes :: CatalogsHotelAttributes
    <*> arbitrary -- catalogsUpsertHotelItemHotelId :: Text
    <*> arbitrary -- catalogsUpsertHotelItemOperation :: E'Operation4
  
instance Arbitrary CatalogsUpsertRetailItem where
  arbitrary = sized genCatalogsUpsertRetailItem

genCatalogsUpsertRetailItem :: Int -> Gen CatalogsUpsertRetailItem
genCatalogsUpsertRetailItem n =
  CatalogsUpsertRetailItem
    <$> arbitraryReduced n -- catalogsUpsertRetailItemAttributes :: ItemAttributesRequest
    <*> arbitrary -- catalogsUpsertRetailItemItemId :: Text
    <*> arbitrary -- catalogsUpsertRetailItemOperation :: E'Operation4
  
instance Arbitrary CatalogsVerticalBatchRequest where
  arbitrary = sized genCatalogsVerticalBatchRequest

genCatalogsVerticalBatchRequest :: Int -> Gen CatalogsVerticalBatchRequest
genCatalogsVerticalBatchRequest n =
  CatalogsVerticalBatchRequest
    <$> arbitraryReducedMaybe n -- catalogsVerticalBatchRequestCatalogId :: Maybe Text
    <*> arbitrary -- catalogsVerticalBatchRequestCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsVerticalBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsVerticalBatchRequestItems :: [CatalogsCreativeAssetsBatchItem]
    <*> arbitrary -- catalogsVerticalBatchRequestLanguage :: E'Language
  
instance Arbitrary CatalogsVerticalFeedsCreateRequest where
  arbitrary = sized genCatalogsVerticalFeedsCreateRequest

genCatalogsVerticalFeedsCreateRequest :: Int -> Gen CatalogsVerticalFeedsCreateRequest
genCatalogsVerticalFeedsCreateRequest n =
  CatalogsVerticalFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestCatalogId :: Maybe Text
    <*> arbitraryReduced n -- catalogsVerticalFeedsCreateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReduced n -- catalogsVerticalFeedsCreateRequestDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReduced n -- catalogsVerticalFeedsCreateRequestDefaultLocale :: CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReduced n -- catalogsVerticalFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitrary -- catalogsVerticalFeedsCreateRequestLocation :: Text
    <*> arbitrary -- catalogsVerticalFeedsCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsVerticalFeedsUpdateRequest where
  arbitrary = sized genCatalogsVerticalFeedsUpdateRequest

genCatalogsVerticalFeedsUpdateRequest :: Int -> Gen CatalogsVerticalFeedsUpdateRequest
genCatalogsVerticalFeedsUpdateRequest n =
  CatalogsVerticalFeedsUpdateRequest
    <$> arbitraryReduced n -- catalogsVerticalFeedsUpdateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsUpdateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsVerticalProductGroup where
  arbitrary = sized genCatalogsVerticalProductGroup

genCatalogsVerticalProductGroup :: Int -> Gen CatalogsVerticalProductGroup
genCatalogsVerticalProductGroup n =
  CatalogsVerticalProductGroup
    <$> arbitrary -- catalogsVerticalProductGroupCatalogId :: Text
    <*> arbitrary -- catalogsVerticalProductGroupCatalogType :: E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupDescription :: Maybe Text
    <*> arbitrary -- catalogsVerticalProductGroupFeedId :: Text
    <*> arbitraryReduced n -- catalogsVerticalProductGroupFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitrary -- catalogsVerticalProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupLocale :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupStatus :: Maybe CatalogsProductGroupStatus
    <*> arbitraryReduced n -- catalogsVerticalProductGroupType :: CatalogsHotelProductGroupType
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdatedAt :: Maybe Int
  
instance Arbitrary CatalogsVerticalProductGroupCreateRequest where
  arbitrary = sized genCatalogsVerticalProductGroupCreateRequest

genCatalogsVerticalProductGroupCreateRequest :: Int -> Gen CatalogsVerticalProductGroupCreateRequest
genCatalogsVerticalProductGroupCreateRequest n =
  CatalogsVerticalProductGroupCreateRequest
    <$> arbitrary -- catalogsVerticalProductGroupCreateRequestCatalogId :: Text
    <*> arbitrary -- catalogsVerticalProductGroupCreateRequestCatalogType :: E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupCreateRequestCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsVerticalProductGroupCreateRequestFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupCreateRequestLocale :: Maybe CatalogsLocale
    <*> arbitrary -- catalogsVerticalProductGroupCreateRequestName :: Text
  
instance Arbitrary CatalogsVerticalProductGroupUpdateRequest where
  arbitrary = sized genCatalogsVerticalProductGroupUpdateRequest

genCatalogsVerticalProductGroupUpdateRequest :: Int -> Gen CatalogsVerticalProductGroupUpdateRequest
genCatalogsVerticalProductGroupUpdateRequest n =
  CatalogsVerticalProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestCatalogType :: Maybe E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestFilters :: Maybe CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestLocale :: Maybe CatalogsLocale
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestName :: Maybe Text
  
instance Arbitrary CatalogsVerticalsListProductsByCatalogBasedFilterRequest where
  arbitrary = sized genCatalogsVerticalsListProductsByCatalogBasedFilterRequest

genCatalogsVerticalsListProductsByCatalogBasedFilterRequest :: Int -> Gen CatalogsVerticalsListProductsByCatalogBasedFilterRequest
genCatalogsVerticalsListProductsByCatalogBasedFilterRequest n =
  CatalogsVerticalsListProductsByCatalogBasedFilterRequest
    <$> arbitrary -- catalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogId :: Text
    <*> arbitrary -- catalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsVerticalsListProductsByCatalogBasedFilterRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsVerticalsListProductsByCatalogBasedFilterRequestFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReduced n -- catalogsVerticalsListProductsByCatalogBasedFilterRequestLocale :: CatalogsLocale
  
instance Arbitrary ConditionFilter where
  arbitrary = sized genConditionFilter

genConditionFilter :: Int -> Gen ConditionFilter
genConditionFilter n =
  ConditionFilter
    <$> arbitraryReduced n -- conditionFilterCondition :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary ConversionAccessTokenResponse where
  arbitrary = sized genConversionAccessTokenResponse

genConversionAccessTokenResponse :: Int -> Gen ConversionAccessTokenResponse
genConversionAccessTokenResponse n =
  ConversionAccessTokenResponse
    <$> arbitrary -- conversionAccessTokenResponseAccessToken :: Text
    <*> arbitraryReducedMaybe n -- conversionAccessTokenResponseTokenType :: Maybe Text
  
instance Arbitrary ConversionApiResponse where
  arbitrary = sized genConversionApiResponse

genConversionApiResponse :: Int -> Gen ConversionApiResponse
genConversionApiResponse n =
  ConversionApiResponse
    <$> arbitraryReduced n -- conversionApiResponseEvents :: [ConversionApiResponseEventsInner]
    <*> arbitrary -- conversionApiResponseNumEventsProcessed :: Int
    <*> arbitrary -- conversionApiResponseNumEventsReceived :: Int
  
instance Arbitrary ConversionApiResponseEventsInner where
  arbitrary = sized genConversionApiResponseEventsInner

genConversionApiResponseEventsInner :: Int -> Gen ConversionApiResponseEventsInner
genConversionApiResponseEventsInner n =
  ConversionApiResponseEventsInner
    <$> arbitraryReducedMaybe n -- conversionApiResponseEventsInnerErrorMessage :: Maybe Text
    <*> arbitrary -- conversionApiResponseEventsInnerStatus :: E'Status6
    <*> arbitraryReducedMaybe n -- conversionApiResponseEventsInnerWarningMessage :: Maybe Text
  
instance Arbitrary ConversionEventAppInfo where
  arbitrary = sized genConversionEventAppInfo

genConversionEventAppInfo :: Int -> Gen ConversionEventAppInfo
genConversionEventAppInfo n =
  ConversionEventAppInfo
    <$> arbitraryReducedMaybe n -- conversionEventAppInfoAppId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventAppInfoAppName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventAppInfoAppPackageName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventAppInfoAppStore :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventAppInfoAppVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventAppInfoInstallTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventAppInfoUserAgent :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventAppInfoWindowHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventAppInfoWindowWidth :: Maybe Int
  
instance Arbitrary ConversionEventDeviceInfo where
  arbitrary = sized genConversionEventDeviceInfo

genConversionEventDeviceInfo :: Int -> Gen ConversionEventDeviceInfo
genConversionEventDeviceInfo n =
  ConversionEventDeviceInfo
    <$> arbitraryReducedMaybe n -- conversionEventDeviceInfoBatteryLevel :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoCarrier :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoCpuCores :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoExternalStorageFreeSpace :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoExternalStorageSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoFormFactor :: Maybe E'FormFactor
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoKernelVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoLanguages :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoLocale :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoModel :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoNetworkType :: Maybe E'NetworkType
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoOsFamily :: Maybe E'OsFamily
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoOsName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoOsReleaseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoOsVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoScreenDensity :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoScreenHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoScreenWidth :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoStorageFreeSpace :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoStorageSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoTimezone :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoTimezoneAbbr :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoType :: Maybe Text
  
instance Arbitrary ConversionEventResponse where
  arbitrary = sized genConversionEventResponse

genConversionEventResponse :: Int -> Gen ConversionEventResponse
genConversionEventResponse n =
  ConversionEventResponse
    <$> arbitraryReducedMaybe n -- conversionEventResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventResponseConversionEvent :: Maybe ConversionTagType
    <*> arbitraryReducedMaybe n -- conversionEventResponseConversionTagId :: Maybe Text
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
    <$> arbitrary -- conversionEventsDataInnerActionSource :: Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerAppId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerAppInfo :: Maybe ConversionEventAppInfo
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerAppName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerAppVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomData :: Maybe ConversionEventsDataInnerCustomData
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerDeviceBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerDeviceCarrier :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerDeviceInfo :: Maybe ConversionEventDeviceInfo
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerDeviceModel :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerDeviceType :: Maybe Text
    <*> arbitrary -- conversionEventsDataInnerEventId :: Text
    <*> arbitrary -- conversionEventsDataInnerEventName :: Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerEventSourceUrl :: Maybe Text
    <*> arbitrary -- conversionEventsDataInnerEventTime :: Integer
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerLanguage :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerOptOut :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerOsVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerPartnerName :: Maybe Text
    <*> arbitraryReduced n -- conversionEventsDataInnerUserData :: ConversionEventsUserData
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerWifi :: Maybe Bool
  
instance Arbitrary ConversionEventsDataInnerCustomData where
  arbitrary = sized genConversionEventsDataInnerCustomData

genConversionEventsDataInnerCustomData :: Int -> Gen ConversionEventsDataInnerCustomData
genConversionEventsDataInnerCustomData n =
  ConversionEventsDataInnerCustomData
    <$> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContents :: Maybe [ConversionEventsDataInnerCustomDataContentsInner]
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataExternalMeasurementId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataExternalMeasurementVendorId :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataNp :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataNumItems :: Maybe Integer
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataOptOutType :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataPredictedLtv :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataSearchString :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataValue :: Maybe Text
  
instance Arbitrary ConversionEventsDataInnerCustomDataContentsInner where
  arbitrary = sized genConversionEventsDataInnerCustomDataContentsInner

genConversionEventsDataInnerCustomDataContentsInner :: Int -> Gen ConversionEventsDataInnerCustomDataContentsInner
genConversionEventsDataInnerCustomDataContentsInner n =
  ConversionEventsDataInnerCustomDataContentsInner
    <$> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerItemBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerItemCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerItemName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerItemPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataInnerCustomDataContentsInnerQuantity :: Maybe Integer
  
instance Arbitrary ConversionEventsUserData where
  arbitrary = sized genConversionEventsUserData

genConversionEventsUserData :: Int -> Gen ConversionEventsUserData
genConversionEventsUserData n =
  ConversionEventsUserData
    <$> arbitraryReducedMaybe n -- conversionEventsUserDataClickId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataClientIpAddress :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataClientUserAgent :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataCountry :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataCt :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataDb :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataEm :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataExternalId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataFn :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataGe :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataHashedMaids :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataLn :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPartnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPh :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataSt :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataZp :: Maybe [Text]
  
instance Arbitrary ConversionEventsUserDataProperties where
  arbitrary = sized genConversionEventsUserDataProperties

genConversionEventsUserDataProperties :: Int -> Gen ConversionEventsUserDataProperties
genConversionEventsUserDataProperties n =
  ConversionEventsUserDataProperties
    <$> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesClickId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesClientIpAddress :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesClientUserAgent :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesCountry :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesCt :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesDb :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesEm :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesExternalId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesFn :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesGe :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesHashedMaids :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesLn :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesPartnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesPh :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesSt :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsUserDataPropertiesZp :: Maybe [Text]
  
instance Arbitrary ConversionHealthSelectionItem where
  arbitrary = sized genConversionHealthSelectionItem

genConversionHealthSelectionItem :: Int -> Gen ConversionHealthSelectionItem
genConversionHealthSelectionItem n =
  ConversionHealthSelectionItem
    <$> arbitraryReducedMaybeValue n -- conversionHealthSelectionItemConversionType :: Maybe A.Value
    <*> arbitraryReducedMaybeValue n -- conversionHealthSelectionItemCriteria :: Maybe A.Value
    <*> arbitraryReducedMaybeValue n -- conversionHealthSelectionItemIngestionSource :: Maybe A.Value
    <*> arbitraryReduced n -- conversionHealthSelectionItemStatus :: AnyType
  
instance Arbitrary ConversionMSOTEvents where
  arbitrary = sized genConversionMSOTEvents

genConversionMSOTEvents :: Int -> Gen ConversionMSOTEvents
genConversionMSOTEvents n =
  ConversionMSOTEvents
    <$> arbitraryReducedMaybe n -- conversionMSOTEventsActionTimestamps :: Maybe [Integer]
    <*> arbitrary -- conversionMSOTEventsAdGroupId :: Text
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsAttributionModel :: Maybe E'AttributionModel
    <*> arbitrary -- conversionMSOTEventsAttributionScope :: E'AttributionScope
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsAttributionScore :: Maybe Double
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCurrency :: Maybe Currency
    <*> arbitrary -- conversionMSOTEventsEventId :: Text
    <*> arbitrary -- conversionMSOTEventsEventName :: E'EventName
    <*> arbitrary -- conversionMSOTEventsEventTimestamp :: Integer
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsTotalEventTouchpoints :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsTotalEvents :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsValue :: Maybe Double
  
instance Arbitrary ConversionProductReportRequest where
  arbitrary = sized genConversionProductReportRequest

genConversionProductReportRequest :: Int -> Gen ConversionProductReportRequest
genConversionProductReportRequest n =
  ConversionProductReportRequest
    <$> arbitraryReducedMaybe n -- conversionProductReportRequestAdGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionProductReportRequestCampaignIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionProductReportRequestCampaignObjectiveTypes :: Maybe [ObjectiveType]
    <*> arbitraryReducedMaybe n -- conversionProductReportRequestClickWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReduced n -- conversionProductReportRequestColumns :: [ConversionProductReportingColumn]
    <*> arbitraryReducedMaybe n -- conversionProductReportRequestConversionProductAttributionType :: Maybe E'ConversionProductAttributionType
    <*> arbitraryReducedMaybe n -- conversionProductReportRequestConversionProductBreakdown :: Maybe E'ConversionProductBreakdown
    <*> arbitraryReducedMaybe n -- conversionProductReportRequestConversionReportTime :: Maybe ConversionReportTimeType
    <*> arbitrary -- conversionProductReportRequestEndDate :: Text
    <*> arbitrary -- conversionProductReportRequestGranularity :: E'Granularity
    <*> arbitrary -- conversionProductReportRequestLevel :: E'Level
    <*> arbitraryReducedMaybe n -- conversionProductReportRequestProductSkuIds :: Maybe [Text]
    <*> arbitrary -- conversionProductReportRequestReportName :: Text
    <*> arbitrary -- conversionProductReportRequestStartDate :: Text
    <*> arbitraryReducedMaybe n -- conversionProductReportRequestViewWindowDays :: Maybe ConversionAttributionWindowDays
  
instance Arbitrary ConversionTag where
  arbitrary = sized genConversionTag

genConversionTag :: Int -> Gen ConversionTag
genConversionTag n =
  ConversionTag
    <$> arbitraryReducedMaybe n -- conversionTagCodeSnippet :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagConfigs :: Maybe ConversionTagConfigs
    <*> arbitraryReducedMaybe n -- conversionTagEnhancedMatchStatus :: Maybe EnhancedMatchStatusType
    <*> arbitraryReducedMaybe n -- conversionTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagLastFiredTimeMs :: Maybe Double
    <*> arbitrary -- conversionTagName :: Text
    <*> arbitraryReducedMaybe n -- conversionTagVersion :: Maybe Text
    <*> arbitrary -- conversionTagAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- conversionTagStatus :: Maybe EntityStatus
  
instance Arbitrary ConversionTagCommon where
  arbitrary = sized genConversionTagCommon

genConversionTagCommon :: Int -> Gen ConversionTagCommon
genConversionTagCommon n =
  ConversionTagCommon
    <$> arbitraryReducedMaybe n -- conversionTagCommonCodeSnippet :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagCommonConfigs :: Maybe ConversionTagConfigs
    <*> arbitraryReducedMaybe n -- conversionTagCommonEnhancedMatchStatus :: Maybe EnhancedMatchStatusType
    <*> arbitraryReducedMaybe n -- conversionTagCommonId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagCommonLastFiredTimeMs :: Maybe Double
    <*> arbitrary -- conversionTagCommonName :: Text
    <*> arbitraryReducedMaybe n -- conversionTagCommonVersion :: Maybe Text
  
instance Arbitrary ConversionTagConfigs where
  arbitrary = sized genConversionTagConfigs

genConversionTagConfigs :: Int -> Gen ConversionTagConfigs
genConversionTagConfigs n =
  ConversionTagConfigs
    <$> arbitraryReducedMaybe n -- conversionTagConfigsAemDbEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsAemEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsAemExternalIdEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsAemFnlnEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsAemGeEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsAemLocEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsAemPhEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagConfigsMdFrequency :: Maybe Double
    <*> arbitraryReducedMaybe n -- conversionTagConfigsNoCodeCapiDomains :: Maybe [Text]
  
instance Arbitrary ConversionTagCreate where
  arbitrary = sized genConversionTagCreate

genConversionTagCreate :: Int -> Gen ConversionTagCreate
genConversionTagCreate n =
  ConversionTagCreate
    <$> arbitraryReducedMaybe n -- conversionTagCreateAemDbEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemExternalIdEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemFnlnEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemGeEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemLocEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateAemPhEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagCreateMdFrequency :: Maybe Double
    <*> arbitrary -- conversionTagCreateName :: Text
  
instance Arbitrary ConversionTagListResponse where
  arbitrary = sized genConversionTagListResponse

genConversionTagListResponse :: Int -> Gen ConversionTagListResponse
genConversionTagListResponse n =
  ConversionTagListResponse
    <$> arbitraryReducedMaybe n -- conversionTagListResponseItems :: Maybe [ConversionTag]
  
instance Arbitrary ConversionTagResponse where
  arbitrary = sized genConversionTagResponse

genConversionTagResponse :: Int -> Gen ConversionTagResponse
genConversionTagResponse n =
  ConversionTagResponse
    <$> arbitraryReducedMaybe n -- conversionTagResponseCodeSnippet :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagResponseConfigs :: Maybe ConversionTagConfigs
    <*> arbitraryReducedMaybe n -- conversionTagResponseEnhancedMatchStatus :: Maybe EnhancedMatchStatusType
    <*> arbitraryReducedMaybe n -- conversionTagResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagResponseLastFiredTimeMs :: Maybe Double
    <*> arbitrary -- conversionTagResponseName :: Text
    <*> arbitraryReducedMaybe n -- conversionTagResponseVersion :: Maybe Text
    <*> arbitrary -- conversionTagResponseAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- conversionTagResponseStatus :: Maybe EntityStatus
  
instance Arbitrary ConversionTagsList200Response where
  arbitrary = sized genConversionTagsList200Response

genConversionTagsList200Response :: Int -> Gen ConversionTagsList200Response
genConversionTagsList200Response n =
  ConversionTagsList200Response
    <$> arbitraryReduced n -- conversionTagsList200ResponseItems :: [ConversionTag]
  
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
    <$> arbitraryReduced n -- createAssetAccessRequestBodyAssetRequestsInnerAssetIdToPermissions :: (Map.Map String [Permissions])
    <*> arbitrary -- createAssetAccessRequestBodyAssetRequestsInnerPartnerId :: Text
  
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
    <$> arbitrary -- createAssetGroupBodyAssetGroupDescription :: Text
    <*> arbitrary -- createAssetGroupBodyAssetGroupName :: Text
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
    <$> arbitraryReduced n -- createAssetInvitesRequestItemAssetIdToPermissions :: (Map.Map String [Permissions])
    <*> arbitrary -- createAssetInvitesRequestItemInviteId :: Text
    <*> arbitraryReduced n -- createAssetInvitesRequestItemInviteType :: InviteType
  
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
    <$> arbitraryReducedMaybe n -- createMMMReportRequestCountries :: Maybe [TargetingAdvertiserCountry]
    <*> arbitraryReduced n -- createMMMReportRequestColumns :: [MMMReportingColumn]
    <*> arbitrary -- createMMMReportRequestEndDate :: Text
    <*> arbitrary -- createMMMReportRequestGranularity :: E'Granularity2
    <*> arbitrary -- createMMMReportRequestLevel :: E'Level2
    <*> arbitrary -- createMMMReportRequestReportName :: Text
    <*> arbitrary -- createMMMReportRequestStartDate :: Text
    <*> arbitraryReduced n -- createMMMReportRequestTargetingTypes :: [MMMReportingTargetingType]
  
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
    <$> arbitraryReducedMaybe n -- createMMMReportResponseDataMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- createMMMReportResponseDataReportStatus :: Maybe BulkReportingJobStatus
    <*> arbitraryReducedMaybe n -- createMMMReportResponseDataStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- createMMMReportResponseDataToken :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- creativeAssetsProcessingRecordStatus :: Maybe ItemProcessingStatus
    <*> arbitraryReducedMaybe n -- creativeAssetsProcessingRecordWarnings :: Maybe [ItemValidationEvent]
  
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
    <$> arbitraryReduced n -- customLabel0FilterCustomLabel0 :: CatalogsProductGroupFilterOperatorTypeCriteria
  
instance Arbitrary CustomLabel1Filter where
  arbitrary = sized genCustomLabel1Filter

genCustomLabel1Filter :: Int -> Gen CustomLabel1Filter
genCustomLabel1Filter n =
  CustomLabel1Filter
    <$> arbitraryReduced n -- customLabel1FilterCustomLabel1 :: CatalogsProductGroupFilterOperatorTypeCriteria
  
instance Arbitrary CustomLabel2Filter where
  arbitrary = sized genCustomLabel2Filter

genCustomLabel2Filter :: Int -> Gen CustomLabel2Filter
genCustomLabel2Filter n =
  CustomLabel2Filter
    <$> arbitraryReduced n -- customLabel2FilterCustomLabel2 :: CatalogsProductGroupFilterOperatorTypeCriteria
  
instance Arbitrary CustomLabel3Filter where
  arbitrary = sized genCustomLabel3Filter

genCustomLabel3Filter :: Int -> Gen CustomLabel3Filter
genCustomLabel3Filter n =
  CustomLabel3Filter
    <$> arbitraryReduced n -- customLabel3FilterCustomLabel3 :: CatalogsProductGroupFilterOperatorTypeCriteria
  
instance Arbitrary CustomLabel4Filter where
  arbitrary = sized genCustomLabel4Filter

genCustomLabel4Filter :: Int -> Gen CustomLabel4Filter
genCustomLabel4Filter n =
  CustomLabel4Filter
    <$> arbitraryReduced n -- customLabel4FilterCustomLabel4 :: CatalogsProductGroupFilterOperatorTypeCriteria
  
instance Arbitrary CustomNumber0Filter where
  arbitrary = sized genCustomNumber0Filter

genCustomNumber0Filter :: Int -> Gen CustomNumber0Filter
genCustomNumber0Filter n =
  CustomNumber0Filter
    <$> arbitraryReduced n -- customNumber0FilterCustomNumber0 :: CatalogsProductGroupUint32Criteria
  
instance Arbitrary CustomNumber1Filter where
  arbitrary = sized genCustomNumber1Filter

genCustomNumber1Filter :: Int -> Gen CustomNumber1Filter
genCustomNumber1Filter n =
  CustomNumber1Filter
    <$> arbitraryReduced n -- customNumber1FilterCustomNumber1 :: CatalogsProductGroupUint32Criteria
  
instance Arbitrary CustomNumber2Filter where
  arbitrary = sized genCustomNumber2Filter

genCustomNumber2Filter :: Int -> Gen CustomNumber2Filter
genCustomNumber2Filter n =
  CustomNumber2Filter
    <$> arbitraryReduced n -- customNumber2FilterCustomNumber2 :: CatalogsProductGroupUint32Criteria
  
instance Arbitrary CustomNumber3Filter where
  arbitrary = sized genCustomNumber3Filter

genCustomNumber3Filter :: Int -> Gen CustomNumber3Filter
genCustomNumber3Filter n =
  CustomNumber3Filter
    <$> arbitraryReduced n -- customNumber3FilterCustomNumber3 :: CatalogsProductGroupUint32Criteria
  
instance Arbitrary CustomNumber4Filter where
  arbitrary = sized genCustomNumber4Filter

genCustomNumber4Filter :: Int -> Gen CustomNumber4Filter
genCustomNumber4Filter n =
  CustomNumber4Filter
    <$> arbitraryReduced n -- customNumber4FilterCustomNumber4 :: CatalogsProductGroupUint32Criteria
  
instance Arbitrary CustomerList where
  arbitrary = sized genCustomerList

genCustomerList :: Int -> Gen CustomerList
genCustomerList n =
  CustomerList
    <$> arbitraryReducedMaybe n -- customerListAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListCreatedTime :: Maybe Double
    <*> arbitraryReducedMaybeValue n -- customerListExceptions :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- customerListId :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListName :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListNumBatches :: Maybe Double
    <*> arbitraryReducedMaybe n -- customerListNumRemovedUserRecords :: Maybe Double
    <*> arbitraryReducedMaybe n -- customerListNumUploadedUserRecords :: Maybe Double
    <*> arbitraryReducedMaybe n -- customerListStatus :: Maybe E'Status3
    <*> arbitraryReducedMaybe n -- customerListType :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListUpdatedTime :: Maybe Double
  
instance Arbitrary CustomerListRequest where
  arbitrary = sized genCustomerListRequest

genCustomerListRequest :: Int -> Gen CustomerListRequest
genCustomerListRequest n =
  CustomerListRequest
    <$> arbitraryReducedMaybe n -- customerListRequestListType :: Maybe UserListType
    <*> arbitrary -- customerListRequestName :: Text
    <*> arbitrary -- customerListRequestRecords :: Text
  
instance Arbitrary CustomerListUpdateRequest where
  arbitrary = sized genCustomerListUpdateRequest

genCustomerListUpdateRequest :: Int -> Gen CustomerListUpdateRequest
genCustomerListUpdateRequest n =
  CustomerListUpdateRequest
    <$> arbitraryReduced n -- customerListUpdateRequestOperationType :: UserListOperationType
    <*> arbitrary -- customerListUpdateRequestRecords :: Text
  
instance Arbitrary CustomerListUpload where
  arbitrary = sized genCustomerListUpload

genCustomerListUpload :: Int -> Gen CustomerListUpload
genCustomerListUpload n =
  CustomerListUpload
    <$> arbitrary -- customerListUploadAdAccountId :: Text
    <*> arbitrary -- customerListUploadCreationTime :: Int
    <*> arbitrary -- customerListUploadCustomerListId :: Text
    <*> arbitraryReducedMaybe n -- customerListUploadErrorCounts :: Maybe [ErrorDetail]
    <*> arbitrary -- customerListUploadId :: Text
    <*> arbitraryReduced n -- customerListUploadOperation :: UserListOperationType
    <*> arbitraryReducedMaybe n -- customerListUploadRecordCounts :: Maybe RecordCounts
    <*> arbitrary -- customerListUploadState :: E'State
    <*> arbitrary -- customerListUploadUpdatedTime :: Int
  
instance Arbitrary CustomerListUploadCreateRequest where
  arbitrary = sized genCustomerListUploadCreateRequest

genCustomerListUploadCreateRequest :: Int -> Gen CustomerListUploadCreateRequest
genCustomerListUploadCreateRequest n =
  CustomerListUploadCreateRequest
    <$> arbitraryReduced n -- customerListUploadCreateRequestOperation :: UserListOperationType
    <*> arbitrary -- customerListUploadCreateRequestTotalParts :: Int
  
instance Arbitrary CustomerListUploadCreateResponse where
  arbitrary = sized genCustomerListUploadCreateResponse

genCustomerListUploadCreateResponse :: Int -> Gen CustomerListUploadCreateResponse
genCustomerListUploadCreateResponse n =
  CustomerListUploadCreateResponse
    <$> arbitraryReduced n -- customerListUploadCreateResponseCustomerListUpload :: CustomerListUpload
    <*> arbitraryReduced n -- customerListUploadCreateResponseS3MultipartUploadData :: S3MultipartUploadData
  
instance Arbitrary CustomerListUploadResponse where
  arbitrary = sized genCustomerListUploadResponse

genCustomerListUploadResponse :: Int -> Gen CustomerListUploadResponse
genCustomerListUploadResponse n =
  CustomerListUploadResponse
    <$> arbitrary -- customerListUploadResponseAdAccountId :: Text
    <*> arbitrary -- customerListUploadResponseCreationTime :: Int
    <*> arbitrary -- customerListUploadResponseCustomerListId :: Text
    <*> arbitraryReducedMaybe n -- customerListUploadResponseErrorCounts :: Maybe [ErrorDetail]
    <*> arbitrary -- customerListUploadResponseId :: Text
    <*> arbitraryReduced n -- customerListUploadResponseOperation :: UserListOperationType
    <*> arbitraryReducedMaybe n -- customerListUploadResponseRecordCounts :: Maybe RecordCounts
    <*> arbitrary -- customerListUploadResponseState :: E'State
    <*> arbitrary -- customerListUploadResponseUpdatedTime :: Int
  
instance Arbitrary CustomerListsList200Response where
  arbitrary = sized genCustomerListsList200Response

genCustomerListsList200Response :: Int -> Gen CustomerListsList200Response
genCustomerListsList200Response n =
  CustomerListsList200Response
    <$> arbitraryReducedMaybe n -- customerListsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- customerListsList200ResponseItems :: [CustomerList]
  
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
    <$> arbitraryReducedMaybe n -- deleteAssetGroupResponseExceptionsInnerAssetGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- deleteAssetGroupResponseExceptionsInnerCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- deleteAssetGroupResponseExceptionsInnerMessage :: Maybe Text
  
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
    <$> arbitrary -- deletePartnerAssetAccessBodyAccessesInnerAssetId :: Text
    <*> arbitrary -- deletePartnerAssetAccessBodyAccessesInnerPartnerId :: Text
    <*> arbitraryReducedMaybe n -- deletePartnerAssetAccessBodyAccessesInnerPartnerType :: Maybe E'PartnerType
  
instance Arbitrary DeletePartnerAssetsResult where
  arbitrary = sized genDeletePartnerAssetsResult

genDeletePartnerAssetsResult :: Int -> Gen DeletePartnerAssetsResult
genDeletePartnerAssetsResult n =
  DeletePartnerAssetsResult
    <$> arbitraryReducedMaybe n -- deletePartnerAssetsResultAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- deletePartnerAssetsResultAssetType :: Maybe Text
    <*> arbitraryReducedMaybe n -- deletePartnerAssetsResultIsSharedPartner :: Maybe Bool
    <*> arbitraryReducedMaybe n -- deletePartnerAssetsResultPartnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- deletePartnerAssetsResultPermissions :: Maybe [Text]
  
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
    <$> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsInnerCategory :: Maybe E'Category
    <*> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsInnerDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsInnerDisplayName :: Maybe Text
    <*> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsInnerName :: Maybe Text
  
instance Arbitrary DetailedError where
  arbitrary = sized genDetailedError

genDetailedError :: Int -> Gen DetailedError
genDetailedError n =
  DetailedError
    <$> arbitrary -- detailedErrorCode :: Int
    <*> arbitraryReduced n -- detailedErrorDetails :: A.Value
    <*> arbitrary -- detailedErrorMessage :: Text
  
instance Arbitrary Error where
  arbitrary = sized genError

genError :: Int -> Gen Error
genError n =
  Error
    <$> arbitrary -- errorCode :: Int
    <*> arbitrary -- errorMessage :: Text
  
instance Arbitrary ErrorDetail where
  arbitrary = sized genErrorDetail

genErrorDetail :: Int -> Gen ErrorDetail
genErrorDetail n =
  ErrorDetail
    <$> arbitrary -- errorDetailCount :: Int
    <*> arbitrary -- errorDetailErrorCode :: Int
    <*> arbitrary -- errorDetailMessage :: Text
  
instance Arbitrary EventData where
  arbitrary = sized genEventData

genEventData :: Int -> Gen EventData
genEventData n =
  EventData
    <$> arbitraryReducedMaybe n -- eventDataCurrency :: Maybe Currency
    <*> arbitraryReducedMaybe n -- eventDataLeadType :: Maybe Text
    <*> arbitraryReducedMaybe n -- eventDataLineItems :: Maybe LineItem
    <*> arbitraryReducedMaybe n -- eventDataOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- eventDataOrderQuantity :: Maybe Int
    <*> arbitraryReducedMaybe n -- eventDataPageName :: Maybe Text
    <*> arbitraryReducedMaybe n -- eventDataPromoCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- eventDataProperty :: Maybe Text
    <*> arbitraryReducedMaybe n -- eventDataSearchQuery :: Maybe Text
    <*> arbitraryReducedMaybe n -- eventDataValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- eventDataVideoTitle :: Maybe Text
  
instance Arbitrary EventQualityScore where
  arbitrary = sized genEventQualityScore

genEventQualityScore :: Int -> Gen EventQualityScore
genEventQualityScore n =
  EventQualityScore
    <$> arbitraryReduced n -- eventQualityScoreIngestionSource :: IngestionSourceOptions
    <*> arbitraryReduced n -- eventQualityScoreLookbackPeriod :: LookbackPeriodOptions
    <*> arbitraryReduced n -- eventQualityScoreOverallStatus :: OverallStatusOptions
    <*> arbitraryReduced n -- eventQualityScoreQualityComponents :: QualityComponents
    <*> arbitraryReduced n -- eventQualityScoreSourcePlatform :: SourcePlatformOptions
  
instance Arbitrary Exception where
  arbitrary = sized genException

genException :: Int -> Gen Exception
genException n =
  Exception
    <$> arbitraryReducedMaybe n -- exceptionCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- exceptionMessage :: Maybe Text
  
instance Arbitrary FeaturedTrend where
  arbitrary = sized genFeaturedTrend

genFeaturedTrend :: Int -> Gen FeaturedTrend
genFeaturedTrend n =
  FeaturedTrend
    <$> arbitraryReduced n -- featuredTrendInterest :: InterestsEnum
    <*> arbitraryReducedMaybe n -- featuredTrendMarket :: Maybe ProductCategoryRegion
    <*> arbitraryReducedMaybe n -- featuredTrendTrends :: Maybe [TrendingTopic]
  
instance Arbitrary FeedProcessingResultsList200Response where
  arbitrary = sized genFeedProcessingResultsList200Response

genFeedProcessingResultsList200Response :: Int -> Gen FeedProcessingResultsList200Response
genFeedProcessingResultsList200Response n =
  FeedProcessingResultsList200Response
    <$> arbitraryReducedMaybe n -- feedProcessingResultsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- feedProcessingResultsList200ResponseItems :: [CatalogsFeedProcessingResult]
  
instance Arbitrary FeedsCreateRequest where
  arbitrary = sized genFeedsCreateRequest

genFeedsCreateRequest :: Int -> Gen FeedsCreateRequest
genFeedsCreateRequest n =
  FeedsCreateRequest
    <$> arbitraryReducedMaybe n -- feedsCreateRequestCatalogId :: Maybe Text
    <*> arbitraryReduced n -- feedsCreateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- feedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- feedsCreateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReduced n -- feedsCreateRequestDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- feedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReduced n -- feedsCreateRequestDefaultLocale :: CatalogsFeedsCreateRequestDefaultLocale
    <*> arbitraryReduced n -- feedsCreateRequestFormat :: CatalogsFormat
    <*> arbitrary -- feedsCreateRequestLocation :: Text
    <*> arbitrary -- feedsCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- feedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- feedsCreateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary FeedsList200Response where
  arbitrary = sized genFeedsList200Response

genFeedsList200Response :: Int -> Gen FeedsList200Response
genFeedsList200Response n =
  FeedsList200Response
    <$> arbitraryReducedMaybe n -- feedsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- feedsList200ResponseItems :: [CatalogsFeed]
  
instance Arbitrary FeedsUpdateRequest where
  arbitrary = sized genFeedsUpdateRequest

genFeedsUpdateRequest :: Int -> Gen FeedsUpdateRequest
genFeedsUpdateRequest n =
  FeedsUpdateRequest
    <$> arbitraryReduced n -- feedsUpdateRequestCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- feedsUpdateRequestStatus :: Maybe CatalogsStatus
  
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
    <$> arbitraryReducedMaybe n -- followersList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- followersList200ResponseItems :: [UserSummary]
  
instance Arbitrary GenderDemographics where
  arbitrary = sized genGenderDemographics

genGenderDemographics :: Int -> Gen GenderDemographics
genGenderDemographics n =
  GenderDemographics
    <$> arbitrary -- genderDemographicsFemale :: Double
    <*> arbitrary -- genderDemographicsMale :: Double
    <*> arbitrary -- genderDemographicsUnspecified :: Double
  
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
    <$> arbitraryReducedMaybe n -- getBusinessAssetsResponseAssetGroupInfo :: Maybe AssetGroupBinding
    <*> arbitraryReducedMaybe n -- getBusinessAssetsResponseAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- getBusinessAssetsResponseAssetType :: Maybe Text
    <*> arbitraryReducedMaybe n -- getBusinessAssetsResponseCatalogInfo :: Maybe GetBusinessAssetsResponseCatalogInfo
  
instance Arbitrary GetBusinessAssetsResponseCatalogInfo where
  arbitrary = sized genGetBusinessAssetsResponseCatalogInfo

genGetBusinessAssetsResponseCatalogInfo :: Int -> Gen GetBusinessAssetsResponseCatalogInfo
genGetBusinessAssetsResponseCatalogInfo n =
  GetBusinessAssetsResponseCatalogInfo
    <$> arbitraryReducedMaybe n -- getBusinessAssetsResponseCatalogInfoCatalogType :: Maybe Text
    <*> arbitraryReducedMaybe n -- getBusinessAssetsResponseCatalogInfoId :: Maybe Text
    <*> arbitraryReducedMaybe n -- getBusinessAssetsResponseCatalogInfoName :: Maybe Text
  
instance Arbitrary GetBusinessEmployers200Response where
  arbitrary = sized genGetBusinessEmployers200Response

genGetBusinessEmployers200Response :: Int -> Gen GetBusinessEmployers200Response
genGetBusinessEmployers200Response n =
  GetBusinessEmployers200Response
    <$> arbitraryReducedMaybe n -- getBusinessEmployers200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- getBusinessEmployers200ResponseItems :: [UserBusinessRoleBinding]
  
instance Arbitrary GetBusinessMembers200Response where
  arbitrary = sized genGetBusinessMembers200Response

genGetBusinessMembers200Response :: Int -> Gen GetBusinessMembers200Response
genGetBusinessMembers200Response n =
  GetBusinessMembers200Response
    <$> arbitraryReducedMaybe n -- getBusinessMembers200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- getBusinessMembers200ResponseItems :: [UserBusinessRoleBinding]
  
instance Arbitrary GetBusinessPartners200Response where
  arbitrary = sized genGetBusinessPartners200Response

genGetBusinessPartners200Response :: Int -> Gen GetBusinessPartners200Response
genGetBusinessPartners200Response n =
  GetBusinessPartners200Response
    <$> arbitraryReducedMaybe n -- getBusinessPartners200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- getBusinessPartners200ResponseItems :: [UserBusinessRoleBinding]
  
instance Arbitrary GetInvites200Response where
  arbitrary = sized genGetInvites200Response

genGetInvites200Response :: Int -> Gen GetInvites200Response
genGetInvites200Response n =
  GetInvites200Response
    <$> arbitraryReducedMaybe n -- getInvites200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- getInvites200ResponseItems :: [InviteResponse]
  
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
    <*> arbitraryReducedMaybe n -- getMMMReportResponseDataSize :: Maybe Double
    <*> arbitraryReducedMaybe n -- getMMMReportResponseDataUrl :: Maybe Text
  
instance Arbitrary GetPartnerAssetsResponse where
  arbitrary = sized genGetPartnerAssetsResponse

genGetPartnerAssetsResponse :: Int -> Gen GetPartnerAssetsResponse
genGetPartnerAssetsResponse n =
  GetPartnerAssetsResponse
    <$> arbitraryReducedMaybe n -- getPartnerAssetsResponseAssetGroupInfo :: Maybe AssetGroupBinding
    <*> arbitraryReducedMaybe n -- getPartnerAssetsResponseAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- getPartnerAssetsResponseAssetType :: Maybe Text
    <*> arbitraryReducedMaybe n -- getPartnerAssetsResponsePermissions :: Maybe [Text]
  
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
    <$> arbitraryReducedMaybe n -- hotelProcessingRecordErrors :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- hotelProcessingRecordHotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- hotelProcessingRecordStatus :: Maybe ItemProcessingStatus
    <*> arbitraryReducedMaybe n -- hotelProcessingRecordWarnings :: Maybe [ItemValidationEvent]
  
instance Arbitrary ImageBase64 where
  arbitrary = sized genImageBase64

genImageBase64 :: Int -> Gen ImageBase64
genImageBase64 n =
  ImageBase64
    <$> arbitrary -- imageBase64ContentType :: E'ContentType
    <*> arbitrary -- imageBase64Data :: Text
  
instance Arbitrary ImageDetails where
  arbitrary = sized genImageDetails

genImageDetails :: Int -> Gen ImageDetails
genImageDetails n =
  ImageDetails
    <$> arbitrary -- imageDetailsHeight :: Int
    <*> arbitrary -- imageDetailsUrl :: Text
    <*> arbitrary -- imageDetailsWidth :: Int
  
instance Arbitrary ImageMetadata where
  arbitrary = sized genImageMetadata

genImageMetadata :: Int -> Gen ImageMetadata
genImageMetadata n =
  ImageMetadata
    <$> arbitraryReducedMaybe n -- imageMetadataDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- imageMetadataImages :: Maybe ImageSize
    <*> arbitraryReducedMaybe n -- imageMetadataItemType :: Maybe Text
    <*> arbitraryReducedMaybe n -- imageMetadataLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- imageMetadataTitle :: Maybe Text
  
instance Arbitrary ImageSize where
  arbitrary = sized genImageSize

genImageSize :: Int -> Gen ImageSize
genImageSize n =
  ImageSize
    <$> arbitraryReducedMaybe n -- imageSize1200x :: Maybe ImageDetails
    <*> arbitraryReducedMaybe n -- imageSize150x150 :: Maybe ImageDetails
    <*> arbitraryReducedMaybe n -- imageSize400x300 :: Maybe ImageDetails
    <*> arbitraryReducedMaybe n -- imageSize600x :: Maybe ImageDetails
  
instance Arbitrary InnerProductCategoriesMetricsHighlights where
  arbitrary = sized genInnerProductCategoriesMetricsHighlights

genInnerProductCategoriesMetricsHighlights :: Int -> Gen InnerProductCategoriesMetricsHighlights
genInnerProductCategoriesMetricsHighlights n =
  InnerProductCategoriesMetricsHighlights
    <$> arbitrary -- innerProductCategoriesMetricsHighlightsPctChangeMom :: Double
  
instance Arbitrary IntegrationLog where
  arbitrary = sized genIntegrationLog

genIntegrationLog :: Int -> Gen IntegrationLog
genIntegrationLog n =
  IntegrationLog
    <$> arbitraryReducedMaybe n -- integrationLogAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogAppVersionNumber :: Maybe Text
    <*> arbitrary -- integrationLogClientTimestamp :: Int
    <*> arbitraryReducedMaybe n -- integrationLogError :: Maybe IntegrationLogClientError
    <*> arbitrary -- integrationLogEventType :: E'EventType
    <*> arbitraryReducedMaybe n -- integrationLogExternalBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogFeedProfileId :: Maybe Text
    <*> arbitrary -- integrationLogLogLevel :: E'LogLevel
    <*> arbitraryReducedMaybe n -- integrationLogMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogPlatformVersionNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogRequest :: Maybe IntegrationLogClientRequest
    <*> arbitraryReducedMaybe n -- integrationLogTagId :: Maybe Text
  
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
    <$> arbitrary -- integrationLogClientRequestHost :: Text
    <*> arbitrary -- integrationLogClientRequestMethod :: E'Method
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
    <$> arbitrary -- integrationLogsInvalidLogResponseRejectedLogsInnerField :: Text
    <*> arbitraryReducedMaybe n -- integrationLogsInvalidLogResponseRejectedLogsInnerLogIndex :: Maybe Int
    <*> arbitrary -- integrationLogsInvalidLogResponseRejectedLogsInnerReason :: Text
    <*> arbitrary -- integrationLogsInvalidLogResponseRejectedLogsInnerValue :: Text
  
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
    <$> arbitraryReducedMaybe n -- integrationMetadataAdditionalId1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataConnectedAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataConnectedLbaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataConnectedMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataConnectedTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataConnectedUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreatedTimestamp :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationMetadataExternalBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataPartnerAccessTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationMetadataPartnerMetadata :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataPartnerRefreshTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationMetadataScopes :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdatedTimestamp :: Maybe Double
  
instance Arbitrary IntegrationRecord where
  arbitrary = sized genIntegrationRecord

genIntegrationRecord :: Int -> Gen IntegrationRecord
genIntegrationRecord n =
  IntegrationRecord
    <$> arbitraryReducedMaybe n -- integrationRecordAdditionalId1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordConnectedAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordConnectedLbaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordConnectedMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordConnectedTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordConnectedUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRecordExternalBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerAccessTokenExpiry :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerMetadata :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerPrimaryEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerRefreshTokenExpiry :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRecordScopes :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordUpdatedTime :: Maybe Int
  
instance Arbitrary IntegrationRequest where
  arbitrary = sized genIntegrationRequest

genIntegrationRequest :: Int -> Gen IntegrationRequest
genIntegrationRequest n =
  IntegrationRequest
    <$> arbitraryReducedMaybe n -- integrationRequestAdditionalId1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestConnectedAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestConnectedLbaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestConnectedMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestConnectedTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestExternalBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerAccessTokenExpiry :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerMetadata :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerPrimaryEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPartnerRefreshTokenExpiry :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRequestScopes :: Maybe Text
  
instance Arbitrary IntegrationRequestPatch where
  arbitrary = sized genIntegrationRequestPatch

genIntegrationRequestPatch :: Int -> Gen IntegrationRequestPatch
genIntegrationRequestPatch n =
  IntegrationRequestPatch
    <$> arbitraryReducedMaybe n -- integrationRequestPatchAdditionalId1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchConnectedAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchConnectedLbaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchConnectedMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchConnectedTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerAccessTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerMetadata :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerPrimaryEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRequestPatchPartnerRefreshTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationRequestPatchScopes :: Maybe Text
  
instance Arbitrary IntegrationsGetList200Response where
  arbitrary = sized genIntegrationsGetList200Response

genIntegrationsGetList200Response :: Int -> Gen IntegrationsGetList200Response
genIntegrationsGetList200Response n =
  IntegrationsGetList200Response
    <$> arbitraryReducedMaybe n -- integrationsGetList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- integrationsGetList200ResponseItems :: [IntegrationRecord]
  
instance Arbitrary IntegrationsLogsPost400Response where
  arbitrary = sized genIntegrationsLogsPost400Response

genIntegrationsLogsPost400Response :: Int -> Gen IntegrationsLogsPost400Response
genIntegrationsLogsPost400Response n =
  IntegrationsLogsPost400Response
    <$> arbitrary -- integrationsLogsPost400ResponseCode :: Int
    <*> arbitrary -- integrationsLogsPost400ResponseMessage :: Text
    <*> arbitraryReduced n -- integrationsLogsPost400ResponseDetails :: A.Value
  
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
    <$> arbitraryReducedMaybe n -- inviteBusinessRoleBindingId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingInviteData :: Maybe BaseInviteDataResponseInviteData
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingIsReceivedInvite :: Maybe Bool
    <*> arbitraryReducedMaybeValue n -- inviteBusinessRoleBindingUser :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingCreatedByBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingCreatedByUserId :: Maybe Text
  
instance Arbitrary InviteExceptionResponse where
  arbitrary = sized genInviteExceptionResponse

genInviteExceptionResponse :: Int -> Gen InviteExceptionResponse
genInviteExceptionResponse n =
  InviteExceptionResponse
    <$> arbitraryReducedMaybe n -- inviteExceptionResponseCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- inviteExceptionResponseInviteOrRequestId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteExceptionResponseMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteExceptionResponseUsersOrPartnerIds :: Maybe [Text]
  
instance Arbitrary InviteResponse where
  arbitrary = sized genInviteResponse

genInviteResponse :: Int -> Gen InviteResponse
genInviteResponse n =
  InviteResponse
    <$> arbitraryReducedMaybe n -- inviteResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteResponseInviteData :: Maybe BaseInviteDataResponseInviteData
    <*> arbitraryReducedMaybe n -- inviteResponseIsReceivedInvite :: Maybe Bool
    <*> arbitraryReducedMaybe n -- inviteResponseUser :: Maybe BusinessAccessUserSummary
    <*> arbitraryReducedMaybe n -- inviteResponseAssetsSummary :: Maybe InviteAssetsSummary
    <*> arbitraryReducedMaybe n -- inviteResponseBusinessRoles :: Maybe [Text]
    <*> arbitraryReducedMaybeValue n -- inviteResponseCreatedByBusiness :: Maybe A.Value
    <*> arbitraryReducedMaybeValue n -- inviteResponseCreatedByUser :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- inviteResponseCreatedTime :: Maybe Int
  
instance Arbitrary ItemAttributes where
  arbitrary = sized genItemAttributes

genItemAttributes :: Int -> Gen ItemAttributes
genItemAttributes n =
  ItemAttributes
    <$> arbitraryReducedMaybe n -- itemAttributesAdImage0Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage0Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage10Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage10Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage11Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage11Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage12Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage12Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage13Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage13Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage14Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage14Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage15Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage15Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage16Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage16Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage17Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage17Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage18Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage18Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage19Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage19Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage1Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage1Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage2Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage2Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage3Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage3Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage4Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage4Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage5Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage5Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage6Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage6Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage7Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage7Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage8Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage8Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage9Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdImage9Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdVideo0Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdVideo0Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdVideo1Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdVideo1Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdVideo2Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdVideo2Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAdult :: Maybe Bool
    <*> arbitraryReducedMaybe n -- itemAttributesAgeGroup :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesAndroidDeepLink :: Maybe Text
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
    <*> arbitraryReducedMaybe n -- itemAttributesCustomNumber0 :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesCustomNumber1 :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesCustomNumber2 :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesCustomNumber3 :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesCustomNumber4 :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesFreeShippingLabel :: Maybe Bool
    <*> arbitraryReducedMaybe n -- itemAttributesFreeShippingLimit :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesGender :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesGoogleProductCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesGtin :: Maybe UpdatableItemAttributesGtin
    <*> arbitraryReducedMaybe n -- itemAttributesId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesInstallmentPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesIosDeepLink :: Maybe Text
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
    <*> arbitraryReducedMaybe n -- itemAttributesPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesSalePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesSalePriceEffectiveDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesShipping :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesShippingHeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesShippingWeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesShippingWidth :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesSize :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesSizeSystem :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesSizeType :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesTax :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesUnitPricingBaseMeasure :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesUnitPricingMeasure :: Maybe Text
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
    <$> arbitraryReducedMaybe n -- itemAttributesRequestAdImage0Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage0Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage10Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage10Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage11Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage11Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage12Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage12Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage13Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage13Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage14Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage14Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage15Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage15Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage16Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage16Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage17Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage17Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage18Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage18Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage19Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage19Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage1Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage1Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage2Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage2Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage3Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage3Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage4Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage4Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage5Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage5Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage6Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage6Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage7Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage7Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage8Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage8Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage9Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdImage9Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdVideo0Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdVideo0Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdVideo1Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdVideo1Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdVideo2Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdVideo2Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdult :: Maybe Bool
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAgeGroup :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAndroidDeepLink :: Maybe Text
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
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCustomNumber0 :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCustomNumber1 :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCustomNumber2 :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCustomNumber3 :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesRequestCustomNumber4 :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemAttributesRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestFreeShippingLabel :: Maybe Bool
    <*> arbitraryReducedMaybe n -- itemAttributesRequestFreeShippingLimit :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestGender :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestGoogleProductCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestGtin :: Maybe UpdatableItemAttributesGtin
    <*> arbitraryReducedMaybe n -- itemAttributesRequestId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestInstallmentPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestIosDeepLink :: Maybe Text
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
    <*> arbitraryReducedMaybe n -- itemAttributesRequestPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestSalePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestSalePriceEffectiveDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestShipping :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestShippingHeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestShippingWeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestShippingWidth :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestSize :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestSizeSystem :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestSizeType :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestTax :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestUnitPricingBaseMeasure :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestUnitPricingMeasure :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestVariantNames :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesRequestVariantValues :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdditionalImageLink :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesRequestImageLink :: Maybe ItemAttributesRequestAllOfImageLink
    <*> arbitraryReducedMaybe n -- itemAttributesRequestSavePinDisabled :: Maybe Bool
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
    <$> arbitraryReducedMaybe n -- itemBatchRecordAttributes :: Maybe ItemAttributesRequest
    <*> arbitraryReducedMaybe n -- itemBatchRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemBatchRecordUpdateMask :: Maybe [UpdateMaskFieldType]
  
instance Arbitrary ItemCreateBatchRecord where
  arbitrary = sized genItemCreateBatchRecord

genItemCreateBatchRecord :: Int -> Gen ItemCreateBatchRecord
genItemCreateBatchRecord n =
  ItemCreateBatchRecord
    <$> arbitraryReducedMaybe n -- itemCreateBatchRecordAttributes :: Maybe ItemAttributesRequest
    <*> arbitraryReducedMaybe n -- itemCreateBatchRecordItemId :: Maybe Text
  
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
    <$> arbitraryReducedMaybe n -- itemProcessingRecordErrors :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- itemProcessingRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemProcessingRecordStatus :: Maybe ItemProcessingStatus
    <*> arbitraryReducedMaybe n -- itemProcessingRecordWarnings :: Maybe [ItemValidationEvent]
  
instance Arbitrary ItemResponse where
  arbitrary = sized genItemResponse

genItemResponse :: Int -> Gen ItemResponse
genItemResponse n =
  ItemResponse
    <$> arbitraryReduced n -- itemResponseCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- itemResponseAttributes :: Maybe CatalogsCreativeAssetsAttributes
    <*> arbitraryReducedMaybe n -- itemResponseItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponsePins :: Maybe [Pin]
    <*> arbitraryReducedMaybe n -- itemResponseHotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseCreativeAssetsId :: Maybe Text
    <*> arbitraryReduced n -- itemResponseErrors :: [ItemValidationEvent]
  
instance Arbitrary ItemResponseOneOf where
  arbitrary = sized genItemResponseOneOf

genItemResponseOneOf :: Int -> Gen ItemResponseOneOf
genItemResponseOneOf n =
  ItemResponseOneOf
    <$> arbitraryReduced n -- itemResponseOneOfCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- itemResponseOneOfAttributes :: Maybe CatalogsCreativeAssetsAttributes
    <*> arbitraryReducedMaybe n -- itemResponseOneOfItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseOneOfPins :: Maybe [Pin]
    <*> arbitraryReducedMaybe n -- itemResponseOneOfHotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseOneOfCreativeAssetsId :: Maybe Text
  
instance Arbitrary ItemResponseOneOf1 where
  arbitrary = sized genItemResponseOneOf1

genItemResponseOneOf1 :: Int -> Gen ItemResponseOneOf1
genItemResponseOneOf1 n =
  ItemResponseOneOf1
    <$> arbitraryReduced n -- itemResponseOneOf1CatalogType :: CatalogsType
    <*> arbitraryReduced n -- itemResponseOneOf1Errors :: [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- itemResponseOneOf1ItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseOneOf1HotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseOneOf1CreativeAssetsId :: Maybe Text
  
instance Arbitrary ItemUpdateBatchRecord where
  arbitrary = sized genItemUpdateBatchRecord

genItemUpdateBatchRecord :: Int -> Gen ItemUpdateBatchRecord
genItemUpdateBatchRecord n =
  ItemUpdateBatchRecord
    <$> arbitraryReducedMaybe n -- itemUpdateBatchRecordAttributes :: Maybe UpdatableItemAttributes
    <*> arbitraryReducedMaybe n -- itemUpdateBatchRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemUpdateBatchRecordUpdateMask :: Maybe [UpdateMaskFieldType]
  
instance Arbitrary ItemUpsertBatchRecord where
  arbitrary = sized genItemUpsertBatchRecord

genItemUpsertBatchRecord :: Int -> Gen ItemUpsertBatchRecord
genItemUpsertBatchRecord n =
  ItemUpsertBatchRecord
    <$> arbitraryReducedMaybe n -- itemUpsertBatchRecordAttributes :: Maybe ItemAttributesRequest
    <*> arbitraryReducedMaybe n -- itemUpsertBatchRecordItemId :: Maybe Text
  
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
    <$> arbitraryReducedMaybe n -- itemsBatchPostRequestCatalogId :: Maybe Text
    <*> arbitrary -- itemsBatchPostRequestCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- itemsBatchPostRequestCountry :: Country
    <*> arbitraryReduced n -- itemsBatchPostRequestItems :: [ItemDeleteBatchRecord]
    <*> arbitrary -- itemsBatchPostRequestLanguage :: E'Language
    <*> arbitraryReduced n -- itemsBatchPostRequestOperation :: BatchOperation
  
instance Arbitrary ItemsIssuesList200Response where
  arbitrary = sized genItemsIssuesList200Response

genItemsIssuesList200Response :: Int -> Gen ItemsIssuesList200Response
genItemsIssuesList200Response n =
  ItemsIssuesList200Response
    <$> arbitraryReducedMaybe n -- itemsIssuesList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- itemsIssuesList200ResponseItems :: [CatalogsItemValidationIssues]
  
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
    <$> arbitraryReducedMaybe n -- keywordMetricsKeywordQueryVolume :: Maybe Text
  
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
    <$> arbitraryReducedMaybe n -- keywordUpdateArchived :: Maybe Bool
    <*> arbitraryReducedMaybe n -- keywordUpdateBid :: Maybe Int
    <*> arbitrary -- keywordUpdateId :: Text
  
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
    <$> arbitraryReducedMaybe n -- keywordsGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- keywordsGet200ResponseItems :: [Keyword]
  
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
  
instance Arbitrary Label where
  arbitrary = sized genLabel

genLabel :: Int -> Gen Label
genLabel n =
  Label
    <$> arbitraryReducedMaybe n -- labelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- labelLabelType :: Maybe LabelType
    <*> arbitraryReducedMaybe n -- labelParentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- labelParentType :: Maybe E'ParentType
    <*> arbitraryReducedMaybe n -- labelStatus :: Maybe LabelStatus
    <*> arbitraryReducedMaybe n -- labelValue :: Maybe Text
  
instance Arbitrary LabelBulkUpdateRequest where
  arbitrary = sized genLabelBulkUpdateRequest

genLabelBulkUpdateRequest :: Int -> Gen LabelBulkUpdateRequest
genLabelBulkUpdateRequest n =
  LabelBulkUpdateRequest
    <$> arbitrary -- labelBulkUpdateRequestId :: Text
    <*> arbitraryReducedMaybe n -- labelBulkUpdateRequestStatus :: Maybe E'Status5
    <*> arbitraryReducedMaybe n -- labelBulkUpdateRequestValue :: Maybe Text
  
instance Arbitrary LabelCreateRequest where
  arbitrary = sized genLabelCreateRequest

genLabelCreateRequest :: Int -> Gen LabelCreateRequest
genLabelCreateRequest n =
  LabelCreateRequest
    <$> arbitraryReduced n -- labelCreateRequestLabels :: [LabelCreateRequestLabelsInner]
    <*> arbitrary -- labelCreateRequestParentId :: Text
  
instance Arbitrary LabelCreateRequestLabelsInner where
  arbitrary = sized genLabelCreateRequestLabelsInner

genLabelCreateRequestLabelsInner :: Int -> Gen LabelCreateRequestLabelsInner
genLabelCreateRequestLabelsInner n =
  LabelCreateRequestLabelsInner
    <$> arbitraryReduced n -- labelCreateRequestLabelsInnerLabelType :: LabelType
    <*> arbitrary -- labelCreateRequestLabelsInnerValue :: Text
  
instance Arbitrary LabelError where
  arbitrary = sized genLabelError

genLabelError :: Int -> Gen LabelError
genLabelError n =
  LabelError
    <$> arbitraryReducedMaybe n -- labelErrorData :: Maybe Label
    <*> arbitraryReducedMaybe n -- labelErrorErrorMessages :: Maybe [Text]
  
instance Arbitrary LabelUpdateRequest where
  arbitrary = sized genLabelUpdateRequest

genLabelUpdateRequest :: Int -> Gen LabelUpdateRequest
genLabelUpdateRequest n =
  LabelUpdateRequest
    <$> arbitraryReduced n -- labelUpdateRequestLabels :: [LabelUpdateRequestLabelsInner]
  
instance Arbitrary LabelUpdateRequestLabelsInner where
  arbitrary = sized genLabelUpdateRequestLabelsInner

genLabelUpdateRequestLabelsInner :: Int -> Gen LabelUpdateRequestLabelsInner
genLabelUpdateRequestLabelsInner n =
  LabelUpdateRequestLabelsInner
    <$> arbitrary -- labelUpdateRequestLabelsInnerId :: Text
    <*> arbitraryReducedMaybe n -- labelUpdateRequestLabelsInnerStatus :: Maybe LabelStatus
    <*> arbitraryReducedMaybe n -- labelUpdateRequestLabelsInnerValue :: Maybe Text
  
instance Arbitrary LabelsList200Response where
  arbitrary = sized genLabelsList200Response

genLabelsList200Response :: Int -> Gen LabelsList200Response
genLabelsList200Response n =
  LabelsList200Response
    <$> arbitraryReducedMaybe n -- labelsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- labelsList200ResponseItems :: [LabelsResponse]
  
instance Arbitrary LabelsResponse where
  arbitrary = sized genLabelsResponse

genLabelsResponse :: Int -> Gen LabelsResponse
genLabelsResponse n =
  LabelsResponse
    <$> arbitraryReducedMaybe n -- labelsResponseErrors :: Maybe [LabelError]
    <*> arbitraryReducedMaybe n -- labelsResponseLabels :: Maybe [Label]
  
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
    <$> arbitraryReducedMaybe n -- leadFormCommonCompletionMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCommonDisclosureLanguage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCommonHasAcceptedTerms :: Maybe Bool
    <*> arbitraryReducedMaybe n -- leadFormCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCommonPolicyLinks :: Maybe [LeadFormCommonPolicyLinksInner]
    <*> arbitraryReducedMaybe n -- leadFormCommonPrivacyPolicyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCommonQuestions :: Maybe [LeadFormQuestion]
    <*> arbitraryReducedMaybe n -- leadFormCommonStatus :: Maybe LeadFormStatus
  
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
    <$> arbitraryReducedMaybe n -- leadFormCreateRequestCompletionMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCreateRequestDisclosureLanguage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCreateRequestHasAcceptedTerms :: Maybe Bool
    <*> arbitraryReducedMaybe n -- leadFormCreateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCreateRequestPolicyLinks :: Maybe [LeadFormCommonPolicyLinksInner]
    <*> arbitraryReducedMaybe n -- leadFormCreateRequestPrivacyPolicyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormCreateRequestQuestions :: Maybe [LeadFormQuestion]
    <*> arbitraryReducedMaybe n -- leadFormCreateRequestStatus :: Maybe LeadFormStatus
  
instance Arbitrary LeadFormQuestion where
  arbitrary = sized genLeadFormQuestion

genLeadFormQuestion :: Int -> Gen LeadFormQuestion
genLeadFormQuestion n =
  LeadFormQuestion
    <$> arbitraryReducedMaybe n -- leadFormQuestionCustomQuestionFieldType :: Maybe LeadFormQuestionFieldType
    <*> arbitraryReducedMaybe n -- leadFormQuestionCustomQuestionLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormQuestionCustomQuestionOptions :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- leadFormQuestionQuestionType :: Maybe LeadFormQuestionType
  
instance Arbitrary LeadFormResponse where
  arbitrary = sized genLeadFormResponse

genLeadFormResponse :: Int -> Gen LeadFormResponse
genLeadFormResponse n =
  LeadFormResponse
    <$> arbitraryReducedMaybe n -- leadFormResponseCompletionMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormResponseDisclosureLanguage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormResponseHasAcceptedTerms :: Maybe Bool
    <*> arbitraryReducedMaybe n -- leadFormResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormResponsePolicyLinks :: Maybe [LeadFormCommonPolicyLinksInner]
    <*> arbitraryReducedMaybe n -- leadFormResponsePrivacyPolicyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormResponseQuestions :: Maybe [LeadFormQuestion]
    <*> arbitraryReducedMaybe n -- leadFormResponseStatus :: Maybe LeadFormStatus
    <*> arbitraryReducedMaybe n -- leadFormResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- leadFormResponseId :: Maybe Text
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
    <$> arbitraryReducedMaybe n -- leadFormUpdateRequestCompletionMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestDisclosureLanguage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestHasAcceptedTerms :: Maybe Bool
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestPolicyLinks :: Maybe [LeadFormCommonPolicyLinksInner]
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestPrivacyPolicyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestQuestions :: Maybe [LeadFormQuestion]
    <*> arbitraryReducedMaybe n -- leadFormUpdateRequestStatus :: Maybe LeadFormStatus
    <*> arbitrary -- leadFormUpdateRequestId :: Text
  
instance Arbitrary LeadFormsList200Response where
  arbitrary = sized genLeadFormsList200Response

genLeadFormsList200Response :: Int -> Gen LeadFormsList200Response
genLeadFormsList200Response n =
  LeadFormsList200Response
    <$> arbitraryReducedMaybe n -- leadFormsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- leadFormsList200ResponseItems :: [LeadFormResponse]
  
instance Arbitrary LeadSubscription where
  arbitrary = sized genLeadSubscription

genLeadSubscription :: Int -> Gen LeadSubscription
genLeadSubscription n =
  LeadSubscription
    <$> arbitraryReducedMaybe n -- leadSubscriptionAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionApiVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- leadSubscriptionCryptographicAlgorithm :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionCryptographicKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionUserAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionWebhookUrl :: Maybe Text
  
instance Arbitrary LeadSubscriptionPostParamsCreate where
  arbitrary = sized genLeadSubscriptionPostParamsCreate

genLeadSubscriptionPostParamsCreate :: Int -> Gen LeadSubscriptionPostParamsCreate
genLeadSubscriptionPostParamsCreate n =
  LeadSubscriptionPostParamsCreate
    <$> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCreateLeadFormId :: Maybe Text
    <*> arbitrary -- leadSubscriptionPostParamsCreateWebhookUrl :: Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCreatePartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCreatePartnerMetadata :: Maybe LeadSubscriptionPostParamsCreateAllOfPartnerMetadata
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCreatePartnerRefreshToken :: Maybe Text
  
instance Arbitrary LeadSubscriptionPostParamsCreateAllOfPartnerMetadata where
  arbitrary = sized genLeadSubscriptionPostParamsCreateAllOfPartnerMetadata

genLeadSubscriptionPostParamsCreateAllOfPartnerMetadata :: Int -> Gen LeadSubscriptionPostParamsCreateAllOfPartnerMetadata
genLeadSubscriptionPostParamsCreateAllOfPartnerMetadata n =
  LeadSubscriptionPostParamsCreateAllOfPartnerMetadata
    <$> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCreateAllOfPartnerMetadataSubscriberKey :: Maybe Text
  
instance Arbitrary LeadsExportCreateRequest where
  arbitrary = sized genLeadsExportCreateRequest

genLeadsExportCreateRequest :: Int -> Gen LeadsExportCreateRequest
genLeadsExportCreateRequest n =
  LeadsExportCreateRequest
    <$> arbitrary -- leadsExportCreateRequestAdId :: Text
    <*> arbitrary -- leadsExportCreateRequestEndDate :: Text
    <*> arbitrary -- leadsExportCreateRequestStartDate :: Text
  
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
    <$> arbitraryReducedMaybe n -- leadsExportResponseDataDownloadUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadsExportResponseDataExportStatus :: Maybe LeadsExportStatus
  
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
    <$> arbitraryReducedMaybe n -- linkedBusinessImageLargeUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- linkedBusinessImageMediumUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- linkedBusinessImageSmallUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- linkedBusinessImageXlargeUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- linkedBusinessUsername :: Maybe Text
  
instance Arbitrary LocalStoreUpdate where
  arbitrary = sized genLocalStoreUpdate

genLocalStoreUpdate :: Int -> Gen LocalStoreUpdate
genLocalStoreUpdate n =
  LocalStoreUpdate
    <$> arbitraryReducedMaybe n -- localStoreUpdateAddressPrimary :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreUpdateAddressSecondary :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreUpdateCity :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreUpdateCountry :: Maybe Country
    <*> arbitrary -- localStoreUpdateId :: Text
    <*> arbitraryReducedMaybe n -- localStoreUpdateLatitude :: Maybe Float
    <*> arbitraryReducedMaybe n -- localStoreUpdateLongitude :: Maybe Float
    <*> arbitraryReducedMaybe n -- localStoreUpdateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreUpdatePostalCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreUpdateRegion :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreUpdateStoreCode :: Maybe Text
  
instance Arbitrary MaxPriceFilter where
  arbitrary = sized genMaxPriceFilter

genMaxPriceFilter :: Int -> Gen MaxPriceFilter
genMaxPriceFilter n =
  MaxPriceFilter
    <$> arbitraryReduced n -- maxPriceFilterMaxPrice :: CatalogsProductGroupPricingCriteria
  
instance Arbitrary Media where
  arbitrary = sized genMedia

genMedia :: Int -> Gen Media
genMedia n =
  Media
    <$> arbitrary -- mediaMediaId :: Text
    <*> arbitraryReduced n -- mediaMediaType :: MediaUploadType
    <*> arbitraryReducedMaybe n -- mediaStatus :: Maybe MediaUploadStatus
  
instance Arbitrary MediaList200Response where
  arbitrary = sized genMediaList200Response

genMediaList200Response :: Int -> Gen MediaList200Response
genMediaList200Response n =
  MediaList200Response
    <$> arbitraryReducedMaybe n -- mediaList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- mediaList200ResponseItems :: [Media]
  
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
    <$> arbitrary -- mediaUploadMediaId :: Text
    <*> arbitraryReduced n -- mediaUploadMediaType :: MediaUploadType
    <*> arbitraryReducedMaybe n -- mediaUploadUploadParameters :: Maybe MediaUploadParameters
    <*> arbitraryReducedMaybe n -- mediaUploadUploadUrl :: Maybe Text
  
instance Arbitrary MediaUploadCreate where
  arbitrary = sized genMediaUploadCreate

genMediaUploadCreate :: Int -> Gen MediaUploadCreate
genMediaUploadCreate n =
  MediaUploadCreate
    <$> arbitraryReduced n -- mediaUploadCreateMediaType :: MediaUploadType
  
instance Arbitrary MediaUploadParameters where
  arbitrary = sized genMediaUploadParameters

genMediaUploadParameters :: Int -> Gen MediaUploadParameters
genMediaUploadParameters n =
  MediaUploadParameters
    <$> arbitraryReducedMaybe n -- mediaUploadParametersContentType :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadParametersKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadParametersPolicy :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadParametersXAmzAlgorithm :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadParametersXAmzCredential :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadParametersXAmzDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadParametersXAmzSecurityToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- mediaUploadParametersXAmzSignature :: Maybe Text
  
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
    <$> arbitraryReduced n -- membersToDeleteBodyMembersInnerBusinessRole :: BusinessRoleForMembers
    <*> arbitrary -- membersToDeleteBodyMembersInnerMemberId :: Text
  
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
    <$> arbitraryReducedMaybe n -- multipleProductGroupsInnerDescription :: Maybe Text
    <*> arbitrary -- multipleProductGroupsInnerFeedId :: Text
    <*> arbitraryReduced n -- multipleProductGroupsInnerFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- multipleProductGroupsInnerIsFeatured :: Maybe Bool
    <*> arbitrary -- multipleProductGroupsInnerName :: Text
    <*> arbitrary -- multipleProductGroupsInnerCatalogId :: Text
    <*> arbitrary -- multipleProductGroupsInnerCatalogType :: E'CatalogType3
    <*> arbitraryReducedMaybe n -- multipleProductGroupsInnerCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- multipleProductGroupsInnerLocale :: Maybe CatalogsLocale
  
instance Arbitrary NotificationPostRequest where
  arbitrary = sized genNotificationPostRequest

genNotificationPostRequest :: Int -> Gen NotificationPostRequest
genNotificationPostRequest n =
  
  pure NotificationPostRequest
   
instance Arbitrary NotificationResponse where
  arbitrary = sized genNotificationResponse

genNotificationResponse :: Int -> Gen NotificationResponse
genNotificationResponse n =
  NotificationResponse
    <$> arbitraryReducedMaybe n -- notificationResponseSuccess :: Maybe Bool
    <*> arbitraryReducedMaybe n -- notificationResponseReceivedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- notificationResponseErrorMsg :: Maybe Text
  
instance Arbitrary OauthAccessTokenRequestClientCredentials where
  arbitrary = sized genOauthAccessTokenRequestClientCredentials

genOauthAccessTokenRequestClientCredentials :: Int -> Gen OauthAccessTokenRequestClientCredentials
genOauthAccessTokenRequestClientCredentials n =
  OauthAccessTokenRequestClientCredentials
    <$> arbitrary -- oauthAccessTokenRequestClientCredentialsScope :: Text
    <*> arbitrary -- oauthAccessTokenRequestClientCredentialsGrantType :: E'GrantType
  
instance Arbitrary OauthAccessTokenRequestCode where
  arbitrary = sized genOauthAccessTokenRequestCode

genOauthAccessTokenRequestCode :: Int -> Gen OauthAccessTokenRequestCode
genOauthAccessTokenRequestCode n =
  OauthAccessTokenRequestCode
    <$> arbitrary -- oauthAccessTokenRequestCodeCode :: Text
    <*> arbitrary -- oauthAccessTokenRequestCodeRedirectUri :: Text
    <*> arbitrary -- oauthAccessTokenRequestCodeGrantType :: E'GrantType
  
instance Arbitrary OauthAccessTokenRequestRefresh where
  arbitrary = sized genOauthAccessTokenRequestRefresh

genOauthAccessTokenRequestRefresh :: Int -> Gen OauthAccessTokenRequestRefresh
genOauthAccessTokenRequestRefresh n =
  OauthAccessTokenRequestRefresh
    <$> arbitrary -- oauthAccessTokenRequestRefreshRefreshToken :: Text
    <*> arbitraryReducedMaybe n -- oauthAccessTokenRequestRefreshScope :: Maybe Text
    <*> arbitrary -- oauthAccessTokenRequestRefreshGrantType :: E'GrantType
  
instance Arbitrary OauthAccessTokenResponse where
  arbitrary = sized genOauthAccessTokenResponse

genOauthAccessTokenResponse :: Int -> Gen OauthAccessTokenResponse
genOauthAccessTokenResponse n =
  OauthAccessTokenResponse
    <$> arbitrary -- oauthAccessTokenResponseAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseExpiresIn :: Int
    <*> arbitraryReducedMaybe n -- oauthAccessTokenResponseResponseType :: Maybe E'GrantType
    <*> arbitrary -- oauthAccessTokenResponseScope :: Text
    <*> arbitrary -- oauthAccessTokenResponseTokenType :: Text
  
instance Arbitrary OauthAccessTokenResponseClientCredentials where
  arbitrary = sized genOauthAccessTokenResponseClientCredentials

genOauthAccessTokenResponseClientCredentials :: Int -> Gen OauthAccessTokenResponseClientCredentials
genOauthAccessTokenResponseClientCredentials n =
  OauthAccessTokenResponseClientCredentials
    <$> arbitrary -- oauthAccessTokenResponseClientCredentialsAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseClientCredentialsExpiresIn :: Int
    <*> arbitraryReducedMaybe n -- oauthAccessTokenResponseClientCredentialsResponseType :: Maybe E'GrantType
    <*> arbitrary -- oauthAccessTokenResponseClientCredentialsScope :: Text
    <*> arbitrary -- oauthAccessTokenResponseClientCredentialsTokenType :: Text
  
instance Arbitrary OauthAccessTokenResponseCode where
  arbitrary = sized genOauthAccessTokenResponseCode

genOauthAccessTokenResponseCode :: Int -> Gen OauthAccessTokenResponseCode
genOauthAccessTokenResponseCode n =
  OauthAccessTokenResponseCode
    <$> arbitraryReducedMaybe n -- oauthAccessTokenResponseCodeRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- oauthAccessTokenResponseCodeRefreshTokenExpiresAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- oauthAccessTokenResponseCodeRefreshTokenExpiresIn :: Maybe Int
    <*> arbitrary -- oauthAccessTokenResponseCodeAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseCodeExpiresIn :: Int
    <*> arbitraryReducedMaybe n -- oauthAccessTokenResponseCodeResponseType :: Maybe E'GrantType
    <*> arbitrary -- oauthAccessTokenResponseCodeScope :: Text
    <*> arbitrary -- oauthAccessTokenResponseCodeTokenType :: Text
  
instance Arbitrary OauthAccessTokenResponseIntegrationRefresh where
  arbitrary = sized genOauthAccessTokenResponseIntegrationRefresh

genOauthAccessTokenResponseIntegrationRefresh :: Int -> Gen OauthAccessTokenResponseIntegrationRefresh
genOauthAccessTokenResponseIntegrationRefresh n =
  OauthAccessTokenResponseIntegrationRefresh
    <$> arbitrary -- oauthAccessTokenResponseIntegrationRefreshRefreshToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseIntegrationRefreshRefreshTokenExpiresIn :: Int
    <*> arbitrary -- oauthAccessTokenResponseIntegrationRefreshAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseIntegrationRefreshExpiresIn :: Int
    <*> arbitraryReducedMaybe n -- oauthAccessTokenResponseIntegrationRefreshResponseType :: Maybe E'GrantType
    <*> arbitrary -- oauthAccessTokenResponseIntegrationRefreshScope :: Text
    <*> arbitrary -- oauthAccessTokenResponseIntegrationRefreshTokenType :: Text
  
instance Arbitrary OauthAccessTokenResponseRefresh where
  arbitrary = sized genOauthAccessTokenResponseRefresh

genOauthAccessTokenResponseRefresh :: Int -> Gen OauthAccessTokenResponseRefresh
genOauthAccessTokenResponseRefresh n =
  OauthAccessTokenResponseRefresh
    <$> arbitrary -- oauthAccessTokenResponseRefreshAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseRefreshExpiresIn :: Int
    <*> arbitraryReducedMaybe n -- oauthAccessTokenResponseRefreshResponseType :: Maybe E'GrantType
    <*> arbitrary -- oauthAccessTokenResponseRefreshScope :: Text
    <*> arbitrary -- oauthAccessTokenResponseRefreshTokenType :: Text
    <*> arbitrary -- oauthAccessTokenResponseRefreshRefreshToken :: Text
    <*> arbitrary -- oauthAccessTokenResponseRefreshRefreshTokenExpiresAt :: Int
    <*> arbitrary -- oauthAccessTokenResponseRefreshRefreshTokenExpiresIn :: Int
  
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
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadataReportingEvent :: Maybe Text
  
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
    <$> arbitraryReducedMaybe n -- orderLineAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLineBudget :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLineEndTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLineName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinePaidBudget :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLinePaidType :: Maybe OrderLinePaidType
    <*> arbitraryReducedMaybe n -- orderLinePurchaseOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLineStartTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLineStatus :: Maybe OrderLineStatus
    <*> arbitraryReducedMaybe n -- orderLineType :: Maybe Text
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
    <$> arbitraryReducedMaybe n -- orderLinesAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinesBudget :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLinesEndTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLinesId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinesName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinesPaidBudget :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLinesPaidType :: Maybe OrderLinePaidType
    <*> arbitraryReducedMaybe n -- orderLinesPurchaseOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinesStartTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLinesStatus :: Maybe OrderLineStatus
    <*> arbitraryReducedMaybe n -- orderLinesType :: Maybe Text
  
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
    <$> arbitraryReducedMaybe n -- orderLinesList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- orderLinesList200ResponseItems :: [OrderLine]
  
instance Arbitrary PageVisitConversionTagsGet200Response where
  arbitrary = sized genPageVisitConversionTagsGet200Response

genPageVisitConversionTagsGet200Response :: Int -> Gen PageVisitConversionTagsGet200Response
genPageVisitConversionTagsGet200Response n =
  PageVisitConversionTagsGet200Response
    <$> arbitraryReducedMaybe n -- pageVisitConversionTagsGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- pageVisitConversionTagsGet200ResponseItems :: [ConversionEventResponse]
  
instance Arbitrary Paginated where
  arbitrary = sized genPaginated

genPaginated :: Int -> Gen Paginated
genPaginated n =
  Paginated
    <$> arbitraryReducedMaybe n -- paginatedBookmark :: Maybe Text
    <*> arbitraryReduced n -- paginatedItems :: [A.Value]
  
instance Arbitrary Pin where
  arbitrary = sized genPin

genPin :: Int -> Gen Pin
genPin n =
  Pin
    <$> arbitraryReducedMaybe n -- pinAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinBoardOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- pinBoardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pinCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- pinDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinDominantColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinHasBeenPromoted :: Maybe Bool
    <*> arbitrary -- pinId :: Text
    <*> arbitraryReducedMaybe n -- pinIsOwner :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinIsStandard :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMedia :: Maybe PinMedia
    <*> arbitraryReducedMaybe n -- pinParentPinId :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- pinPinMetrics :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- pinTitle :: Maybe Text
  
instance Arbitrary PinAnalyticsMetricsResponse where
  arbitrary = sized genPinAnalyticsMetricsResponse

genPinAnalyticsMetricsResponse :: Int -> Gen PinAnalyticsMetricsResponse
genPinAnalyticsMetricsResponse n =
  PinAnalyticsMetricsResponse
    <$> arbitraryReducedMaybe n -- pinAnalyticsMetricsResponseDailyMetrics :: Maybe [PinAnalyticsMetricsResponseDailyMetricsInner]
    <*> arbitraryReducedMaybe n -- pinAnalyticsMetricsResponseLifetimeMetrics :: Maybe (Map.Map String Int)
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
    <$> arbitraryReducedMaybe n -- pinCreateAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateBoardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateDominantColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateMediaSource :: Maybe PinMediaSource
    <*> arbitraryReducedMaybe n -- pinCreateParentPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateSponsorId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreateTitle :: Maybe Text
  
instance Arbitrary PinMedia where
  arbitrary = sized genPinMedia

genPinMedia :: Int -> Gen PinMedia
genPinMedia n =
  PinMedia
    <$> arbitraryReducedMaybe n -- pinMediaImages :: Maybe ImageSize
    <*> arbitrary -- pinMediaMediaType :: E'MediaType
    <*> arbitraryReducedMaybe n -- pinMediaCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaDuration :: Maybe Double
    <*> arbitraryReducedMaybe n -- pinMediaHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaVideoUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWidth :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaItems :: Maybe [PinMediaMetadata]
  
instance Arbitrary PinMediaMetadata where
  arbitrary = sized genPinMediaMetadata

genPinMediaMetadata :: Int -> Gen PinMediaMetadata
genPinMediaMetadata n =
  PinMediaMetadata
    <$> arbitraryReducedMaybe n -- pinMediaMetadataDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataImages :: Maybe ImageSize
    <*> arbitraryReducedMaybe n -- pinMediaMetadataItemType :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataDuration :: Maybe Double
    <*> arbitraryReducedMaybe n -- pinMediaMetadataHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaMetadataVideoUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataWidth :: Maybe Int
  
instance Arbitrary PinMediaSource where
  arbitrary = sized genPinMediaSource

genPinMediaSource :: Int -> Gen PinMediaSource
genPinMediaSource n =
  PinMediaSource
    <$> arbitraryReduced n -- pinMediaSourceContentType :: ModelContentType
    <*> arbitrary -- pinMediaSourceData :: Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceIsStandard :: Maybe Bool
    <*> arbitrary -- pinMediaSourceSourceType :: E'SourceType
    <*> arbitrary -- pinMediaSourceUrl :: Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceCoverImageContentType :: Maybe ModelContentType
    <*> arbitraryReducedMaybe n -- pinMediaSourceCoverImageData :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceCoverImageKeyFrameTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaSourceCoverImageUrl :: Maybe Text
    <*> arbitrary -- pinMediaSourceMediaId :: Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceIndex :: Maybe Int
    <*> arbitraryReduced n -- pinMediaSourceItems :: [PinMediaSourceImagesURLItem]
    <*> arbitraryReducedMaybe n -- pinMediaSourceIsAffiliateLink :: Maybe Bool
  
instance Arbitrary PinMediaSourceImageBase64 where
  arbitrary = sized genPinMediaSourceImageBase64

genPinMediaSourceImageBase64 :: Int -> Gen PinMediaSourceImageBase64
genPinMediaSourceImageBase64 n =
  PinMediaSourceImageBase64
    <$> arbitraryReduced n -- pinMediaSourceImageBase64ContentType :: ModelContentType
    <*> arbitrary -- pinMediaSourceImageBase64Data :: Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImageBase64IsStandard :: Maybe Bool
    <*> arbitrary -- pinMediaSourceImageBase64SourceType :: E'SourceType2
  
instance Arbitrary PinMediaSourceImageURL where
  arbitrary = sized genPinMediaSourceImageURL

genPinMediaSourceImageURL :: Int -> Gen PinMediaSourceImageURL
genPinMediaSourceImageURL n =
  PinMediaSourceImageURL
    <$> arbitraryReducedMaybe n -- pinMediaSourceImageURLIsStandard :: Maybe Bool
    <*> arbitrary -- pinMediaSourceImageURLSourceType :: E'SourceType3
    <*> arbitrary -- pinMediaSourceImageURLUrl :: Text
  
instance Arbitrary PinMediaSourceImagesBase64 where
  arbitrary = sized genPinMediaSourceImagesBase64

genPinMediaSourceImagesBase64 :: Int -> Gen PinMediaSourceImagesBase64
genPinMediaSourceImagesBase64 n =
  PinMediaSourceImagesBase64
    <$> arbitraryReducedMaybe n -- pinMediaSourceImagesBase64Index :: Maybe Int
    <*> arbitraryReduced n -- pinMediaSourceImagesBase64Items :: [PinMediaSourceImagesBase64Item]
    <*> arbitrary -- pinMediaSourceImagesBase64SourceType :: E'SourceType4
  
instance Arbitrary PinMediaSourceImagesBase64Item where
  arbitrary = sized genPinMediaSourceImagesBase64Item

genPinMediaSourceImagesBase64Item :: Int -> Gen PinMediaSourceImagesBase64Item
genPinMediaSourceImagesBase64Item n =
  PinMediaSourceImagesBase64Item
    <$> arbitraryReduced n -- pinMediaSourceImagesBase64ItemContentType :: ModelContentType
    <*> arbitrary -- pinMediaSourceImagesBase64ItemData :: Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImagesBase64ItemDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImagesBase64ItemLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImagesBase64ItemTitle :: Maybe Text
  
instance Arbitrary PinMediaSourceImagesURL where
  arbitrary = sized genPinMediaSourceImagesURL

genPinMediaSourceImagesURL :: Int -> Gen PinMediaSourceImagesURL
genPinMediaSourceImagesURL n =
  PinMediaSourceImagesURL
    <$> arbitraryReducedMaybe n -- pinMediaSourceImagesURLIndex :: Maybe Int
    <*> arbitraryReduced n -- pinMediaSourceImagesURLItems :: [PinMediaSourceImagesURLItem]
    <*> arbitrary -- pinMediaSourceImagesURLSourceType :: E'SourceType5
  
instance Arbitrary PinMediaSourceImagesURLItem where
  arbitrary = sized genPinMediaSourceImagesURLItem

genPinMediaSourceImagesURLItem :: Int -> Gen PinMediaSourceImagesURLItem
genPinMediaSourceImagesURLItem n =
  PinMediaSourceImagesURLItem
    <$> arbitraryReducedMaybe n -- pinMediaSourceImagesURLItemDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImagesURLItemLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceImagesURLItemTitle :: Maybe Text
    <*> arbitrary -- pinMediaSourceImagesURLItemUrl :: Text
  
instance Arbitrary PinMediaSourcePinURL where
  arbitrary = sized genPinMediaSourcePinURL

genPinMediaSourcePinURL :: Int -> Gen PinMediaSourcePinURL
genPinMediaSourcePinURL n =
  PinMediaSourcePinURL
    <$> arbitraryReducedMaybe n -- pinMediaSourcePinURLIsAffiliateLink :: Maybe Bool
    <*> arbitrary -- pinMediaSourcePinURLSourceType :: E'SourceType
  
instance Arbitrary PinMediaSourceVideoID where
  arbitrary = sized genPinMediaSourceVideoID

genPinMediaSourceVideoID :: Int -> Gen PinMediaSourceVideoID
genPinMediaSourceVideoID n =
  PinMediaSourceVideoID
    <$> arbitraryReducedMaybe n -- pinMediaSourceVideoIDCoverImageContentType :: Maybe ModelContentType
    <*> arbitraryReducedMaybe n -- pinMediaSourceVideoIDCoverImageData :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceVideoIDCoverImageKeyFrameTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaSourceVideoIDCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaSourceVideoIDIsStandard :: Maybe Bool
    <*> arbitrary -- pinMediaSourceVideoIDMediaId :: Text
    <*> arbitrary -- pinMediaSourceVideoIDSourceType :: E'SourceType6
  
instance Arbitrary PinMediaWithImage where
  arbitrary = sized genPinMediaWithImage

genPinMediaWithImage :: Int -> Gen PinMediaWithImage
genPinMediaWithImage n =
  PinMediaWithImage
    <$> arbitraryReducedMaybe n -- pinMediaWithImageImages :: Maybe ImageSize
    <*> arbitrary -- pinMediaWithImageMediaType :: E'MediaType2
  
instance Arbitrary PinMediaWithImageAndVideo where
  arbitrary = sized genPinMediaWithImageAndVideo

genPinMediaWithImageAndVideo :: Int -> Gen PinMediaWithImageAndVideo
genPinMediaWithImageAndVideo n =
  PinMediaWithImageAndVideo
    <$> arbitraryReducedMaybe n -- pinMediaWithImageAndVideoItems :: Maybe [PinMediaMetadata]
    <*> arbitrary -- pinMediaWithImageAndVideoMediaType :: E'MediaType
  
instance Arbitrary PinMediaWithImages where
  arbitrary = sized genPinMediaWithImages

genPinMediaWithImages :: Int -> Gen PinMediaWithImages
genPinMediaWithImages n =
  PinMediaWithImages
    <$> arbitraryReducedMaybe n -- pinMediaWithImagesItems :: Maybe [ImageMetadata]
    <*> arbitrary -- pinMediaWithImagesMediaType :: E'MediaType3
  
instance Arbitrary PinMediaWithVideo where
  arbitrary = sized genPinMediaWithVideo

genPinMediaWithVideo :: Int -> Gen PinMediaWithVideo
genPinMediaWithVideo n =
  PinMediaWithVideo
    <$> arbitraryReducedMaybe n -- pinMediaWithVideoCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoDuration :: Maybe Double
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoImages :: Maybe ImageSize
    <*> arbitrary -- pinMediaWithVideoMediaType :: E'MediaType4
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoVideoUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoWidth :: Maybe Int
  
instance Arbitrary PinMediaWithVideos where
  arbitrary = sized genPinMediaWithVideos

genPinMediaWithVideos :: Int -> Gen PinMediaWithVideos
genPinMediaWithVideos n =
  PinMediaWithVideos
    <$> arbitraryReducedMaybe n -- pinMediaWithVideosItems :: Maybe [VideoMetadataWithItemType]
    <*> arbitrary -- pinMediaWithVideosMediaType :: E'MediaType5
  
instance Arbitrary PinUpdate where
  arbitrary = sized genPinUpdate

genPinUpdate :: Int -> Gen PinUpdate
genPinUpdate n =
  PinUpdate
    <$> arbitraryReducedMaybe n -- pinUpdateAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateBoardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateCarouselSlots :: Maybe [CarouselSlot]
    <*> arbitraryReducedMaybe n -- pinUpdateDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinUpdateTitle :: Maybe Text
  
instance Arbitrary PinsList200Response where
  arbitrary = sized genPinsList200Response

genPinsList200Response :: Int -> Gen PinsList200Response
genPinsList200Response n =
  PinsList200Response
    <$> arbitraryReducedMaybe n -- pinsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- pinsList200ResponseItems :: [Pin]
  
instance Arbitrary PinsSaveRequest where
  arbitrary = sized genPinsSaveRequest

genPinsSaveRequest :: Int -> Gen PinsSaveRequest
genPinsSaveRequest n =
  PinsSaveRequest
    <$> arbitraryReducedMaybe n -- pinsSaveRequestBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinsSaveRequestBoardSectionId :: Maybe Text
  
instance Arbitrary PinterestLibError where
  arbitrary = sized genPinterestLibError

genPinterestLibError :: Int -> Gen PinterestLibError
genPinterestLibError n =
  PinterestLibError
    <$> arbitrary -- pinterestLibErrorCode :: Int
    <*> arbitrary -- pinterestLibErrorMessage :: Text
  
instance Arbitrary PinterestLibStatus204 where
  arbitrary = sized genPinterestLibStatus204

genPinterestLibStatus204 :: Int -> Gen PinterestLibStatus204
genPinterestLibStatus204 n =
  PinterestLibStatus204
    <$> arbitrary -- pinterestLibStatus204StatusCode :: E'StatusCode
  
instance Arbitrary PlacementMultipliers where
  arbitrary = sized genPlacementMultipliers

genPlacementMultipliers :: Int -> Gen PlacementMultipliers
genPlacementMultipliers n =
  PlacementMultipliers
    <$> arbitraryReducedMaybe n -- placementMultipliersPlacement :: Maybe E'Placement
  
instance Arbitrary PredictedTimeSeries where
  arbitrary = sized genPredictedTimeSeries

genPredictedTimeSeries :: Int -> Gen PredictedTimeSeries
genPredictedTimeSeries n =
  PredictedTimeSeries
    <$> arbitraryReducedMaybe n -- predictedTimeSeriesDate :: Maybe Date
  
instance Arbitrary PriceFilter where
  arbitrary = sized genPriceFilter

genPriceFilter :: Int -> Gen PriceFilter
genPriceFilter n =
  PriceFilter
    <$> arbitraryReduced n -- priceFilterPrice :: CatalogsProductGroupPricingCurrencyCriteria
  
instance Arbitrary ProductCategoriesDemographic where
  arbitrary = sized genProductCategoriesDemographic

genProductCategoriesDemographic :: Int -> Gen ProductCategoriesDemographic
genProductCategoriesDemographic n =
  ProductCategoriesDemographic
    <$> arbitrary -- productCategoriesDemographicAge :: (Map.Map String Double)
    <*> arbitraryReduced n -- productCategoriesDemographicGender :: GenderDemographics
  
instance Arbitrary ProductCategoriesMetricsHighlights where
  arbitrary = sized genProductCategoriesMetricsHighlights

genProductCategoriesMetricsHighlights :: Int -> Gen ProductCategoriesMetricsHighlights
genProductCategoriesMetricsHighlights n =
  ProductCategoriesMetricsHighlights
    <$> arbitraryReducedMaybe n -- productCategoriesMetricsHighlightsEngagement :: Maybe InnerProductCategoriesMetricsHighlights
    <*> arbitraryReducedMaybe n -- productCategoriesMetricsHighlightsOutboundClicks :: Maybe InnerProductCategoriesMetricsHighlights
    <*> arbitraryReducedMaybe n -- productCategoriesMetricsHighlightsPinSaves :: Maybe InnerProductCategoriesMetricsHighlights
  
instance Arbitrary ProductCategoryDetails where
  arbitrary = sized genProductCategoryDetails

genProductCategoryDetails :: Int -> Gen ProductCategoryDetails
genProductCategoryDetails n =
  ProductCategoryDetails
    <$> arbitraryReducedMaybe n -- productCategoryDetailsDemographics :: Maybe ProductCategoriesDemographic
    <*> arbitrary -- productCategoryDetailsHasPrediction :: Bool
    <*> arbitraryReducedMaybe n -- productCategoryDetailsMetricsHighlights :: Maybe ProductCategoriesMetricsHighlights
    <*> arbitraryReducedMaybe n -- productCategoryDetailsPredictedTimeSeries :: Maybe (Map.Map String Double)
    <*> arbitraryReduced n -- productCategoryDetailsProductCategory :: ProductCategoryEnum
    <*> arbitraryReducedMaybe n -- productCategoryDetailsRelatedSearches :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- productCategoryDetailsTimeSeries :: Maybe (Map.Map String Double)
  
instance Arbitrary ProductGroupAnalyticsResponseInner where
  arbitrary = sized genProductGroupAnalyticsResponseInner

genProductGroupAnalyticsResponseInner :: Int -> Gen ProductGroupAnalyticsResponseInner
genProductGroupAnalyticsResponseInner n =
  ProductGroupAnalyticsResponseInner
    <$> arbitraryReducedMaybe n -- productGroupAnalyticsResponseInnerDate :: Maybe Date
    <*> arbitrary -- productGroupAnalyticsResponseInnerProductGroupId :: Text
  
instance Arbitrary ProductGroupPromotion where
  arbitrary = sized genProductGroupPromotion

genProductGroupPromotion :: Int -> Gen ProductGroupPromotion
genProductGroupPromotion n =
  ProductGroupPromotion
    <$> arbitraryReducedMaybe n -- productGroupPromotionAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- productGroupPromotionCatalogProductGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCatalogProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCollectionsHeaderType :: Maybe E'CollectionsHeaderType
    <*> arbitraryReducedMaybe n -- productGroupPromotionCollectionsHeroDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCollectionsHeroPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- productGroupPromotionCustomizableCtaType :: Maybe E'CustomizableCtaType
    <*> arbitraryReducedMaybe n -- productGroupPromotionDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- productGroupPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionIncluded :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionIsGenerateBackground :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionIsMdl :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionParentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionPreferredMediaType :: Maybe E'PreferredMediaType
    <*> arbitraryReducedMaybe n -- productGroupPromotionRelativeDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionSelectedImageTag :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionSelectedVideoTag :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionSlideshowCollectionsDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionSlideshowCollectionsTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- productGroupPromotionTrackingUrl :: Maybe Text
  
instance Arbitrary ProductGroupPromotionCreateRequest where
  arbitrary = sized genProductGroupPromotionCreateRequest

genProductGroupPromotionCreateRequest :: Int -> Gen ProductGroupPromotionCreateRequest
genProductGroupPromotionCreateRequest n =
  ProductGroupPromotionCreateRequest
    <$> arbitrary -- productGroupPromotionCreateRequestAdGroupId :: Text
    <*> arbitraryReduced n -- productGroupPromotionCreateRequestProductGroupPromotion :: [ProductGroupPromotion]
  
instance Arbitrary ProductGroupPromotionResponse where
  arbitrary = sized genProductGroupPromotionResponse

genProductGroupPromotionResponse :: Int -> Gen ProductGroupPromotionResponse
genProductGroupPromotionResponse n =
  ProductGroupPromotionResponse
    <$> arbitraryReducedMaybe n -- productGroupPromotionResponseItems :: Maybe [ProductGroupPromotionResponseItem]
  
instance Arbitrary ProductGroupPromotionResponseItem where
  arbitrary = sized genProductGroupPromotionResponseItem

genProductGroupPromotionResponseItem :: Int -> Gen ProductGroupPromotionResponseItem
genProductGroupPromotionResponseItem n =
  ProductGroupPromotionResponseItem
    <$> arbitraryReducedMaybe n -- productGroupPromotionResponseItemData :: Maybe ProductGroupPromotion
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
    <$> arbitraryReducedMaybe n -- productGroupPromotionsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- productGroupPromotionsList200ResponseItems :: [ProductGroupPromotion]
  
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
  
instance Arbitrary PromotionArrayElement where
  arbitrary = sized genPromotionArrayElement

genPromotionArrayElement :: Int -> Gen PromotionArrayElement
genPromotionArrayElement n =
  PromotionArrayElement
    <$> arbitraryReducedMaybe n -- promotionArrayElementData :: Maybe PromotionResponse
    <*> arbitraryReducedMaybe n -- promotionArrayElementException :: Maybe Exception
  
instance Arbitrary PromotionCommon where
  arbitrary = sized genPromotionCommon

genPromotionCommon :: Int -> Gen PromotionCommon
genPromotionCommon n =
  PromotionCommon
    <$> arbitraryReducedMaybe n -- promotionCommonDiscountStatus :: Maybe E'DiscountStatus
    <*> arbitraryReducedMaybe n -- promotionCommonEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionCommonExternalId :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionCommonPlatformType :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionCommonPromotionCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionCommonPromotionCustomId :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionCommonPromotionTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionCommonPromotionType :: Maybe PromotionType
    <*> arbitraryReducedMaybe n -- promotionCommonStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionCommonTemplateValues :: Maybe [PromotionTemplateValue]
  
instance Arbitrary PromotionCreateRequest where
  arbitrary = sized genPromotionCreateRequest

genPromotionCreateRequest :: Int -> Gen PromotionCreateRequest
genPromotionCreateRequest n =
  PromotionCreateRequest
    <$> arbitraryReducedMaybe n -- promotionCreateRequestDiscountStatus :: Maybe E'DiscountStatus
    <*> arbitraryReducedMaybe n -- promotionCreateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionCreateRequestExternalId :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionCreateRequestPlatformType :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionCreateRequestPromotionCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionCreateRequestPromotionCustomId :: Maybe Text
    <*> arbitrary -- promotionCreateRequestPromotionTitle :: Text
    <*> arbitraryReduced n -- promotionCreateRequestPromotionType :: PromotionType
    <*> arbitraryReducedMaybe n -- promotionCreateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionCreateRequestTemplateValues :: Maybe [PromotionTemplateValue]
  
instance Arbitrary PromotionResponse where
  arbitrary = sized genPromotionResponse

genPromotionResponse :: Int -> Gen PromotionResponse
genPromotionResponse n =
  PromotionResponse
    <$> arbitraryReducedMaybe n -- promotionResponseDiscountStatus :: Maybe E'DiscountStatus
    <*> arbitraryReducedMaybe n -- promotionResponseEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionResponseExternalId :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionResponsePlatformType :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionResponsePromotionCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionResponsePromotionCustomId :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionResponsePromotionTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionResponsePromotionType :: Maybe PromotionType
    <*> arbitraryReducedMaybe n -- promotionResponseStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionResponseTemplateValues :: Maybe [PromotionTemplateValue]
    <*> arbitraryReducedMaybe n -- promotionResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionResponseStatus :: Maybe EntityStatus
  
instance Arbitrary PromotionTemplateValue where
  arbitrary = sized genPromotionTemplateValue

genPromotionTemplateValue :: Int -> Gen PromotionTemplateValue
genPromotionTemplateValue n =
  PromotionTemplateValue
    <$> arbitraryReducedMaybe n -- promotionTemplateValueAmount :: Maybe Double
    <*> arbitraryReducedMaybe n -- promotionTemplateValueCurrencyCode :: Maybe Currency
    <*> arbitraryReducedMaybe n -- promotionTemplateValueCustomText :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionTemplateValuePercent :: Maybe Double
  
instance Arbitrary PromotionUpdateRequest where
  arbitrary = sized genPromotionUpdateRequest

genPromotionUpdateRequest :: Int -> Gen PromotionUpdateRequest
genPromotionUpdateRequest n =
  PromotionUpdateRequest
    <$> arbitraryReducedMaybe n -- promotionUpdateRequestDiscountStatus :: Maybe E'DiscountStatus
    <*> arbitraryReducedMaybe n -- promotionUpdateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionUpdateRequestExternalId :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionUpdateRequestPlatformType :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionUpdateRequestPromotionCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionUpdateRequestPromotionCustomId :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionUpdateRequestPromotionTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionUpdateRequestPromotionType :: Maybe PromotionType
    <*> arbitraryReducedMaybe n -- promotionUpdateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionUpdateRequestTemplateValues :: Maybe [PromotionTemplateValue]
    <*> arbitrary -- promotionUpdateRequestId :: Text
    <*> arbitraryReducedMaybe n -- promotionUpdateRequestStatus :: Maybe EntityStatus
  
instance Arbitrary PromotionsList200Response where
  arbitrary = sized genPromotionsList200Response

genPromotionsList200Response :: Int -> Gen PromotionsList200Response
genPromotionsList200Response n =
  PromotionsList200Response
    <$> arbitraryReducedMaybe n -- promotionsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- promotionsList200ResponseItems :: [PromotionResponse]
  
instance Arbitrary PromotionsResponse where
  arbitrary = sized genPromotionsResponse

genPromotionsResponse :: Int -> Gen PromotionsResponse
genPromotionsResponse n =
  PromotionsResponse
    <$> arbitraryReducedMaybe n -- promotionsResponsePromotions :: Maybe [PromotionArrayElement]
  
instance Arbitrary QualityComponentDetails where
  arbitrary = sized genQualityComponentDetails

genQualityComponentDetails :: Int -> Gen QualityComponentDetails
genQualityComponentDetails n =
  QualityComponentDetails
    <$> arbitrary -- qualityComponentDetailsCoverage :: Double
    <*> arbitraryReducedMaybe n -- qualityComponentDetailsIssues :: Maybe [QualityComponentIssue]
    <*> arbitraryReducedMaybe n -- qualityComponentDetailsOverlap :: Maybe Double
  
instance Arbitrary QualityComponentIssue where
  arbitrary = sized genQualityComponentIssue

genQualityComponentIssue :: Int -> Gen QualityComponentIssue
genQualityComponentIssue n =
  QualityComponentIssue
    <$> arbitrary -- qualityComponentIssueId :: Text
    <*> arbitrary -- qualityComponentIssueName :: Text
    <*> arbitrary -- qualityComponentIssueReason :: Text
  
instance Arbitrary QualityComponents where
  arbitrary = sized genQualityComponents

genQualityComponents :: Int -> Gen QualityComponents
genQualityComponents n =
  QualityComponents
    <$> arbitraryReducedMaybe n -- qualityComponentsAdvertiserExternalId :: Maybe (Map.Map String QualityComponentDetails)
    <*> arbitraryReducedMaybe n -- qualityComponentsClickIdEpik :: Maybe (Map.Map String QualityComponentDetails)
    <*> arbitraryReducedMaybe n -- qualityComponentsExternalEventId :: Maybe (Map.Map String QualityComponentDetails)
    <*> arbitraryReducedMaybe n -- qualityComponentsHashedEmail :: Maybe (Map.Map String QualityComponentDetails)
    <*> arbitraryReducedMaybe n -- qualityComponentsHashedMaid :: Maybe (Map.Map String QualityComponentDetails)
    <*> arbitraryReducedMaybe n -- qualityComponentsIpAddress :: Maybe (Map.Map String QualityComponentDetails)
    <*> arbitraryReducedMaybe n -- qualityComponentsOrderId :: Maybe (Map.Map String QualityComponentDetails)
    <*> arbitraryReducedMaybe n -- qualityComponentsOrderValue :: Maybe (Map.Map String QualityComponentDetails)
    <*> arbitraryReducedMaybe n -- qualityComponentsProductId :: Maybe (Map.Map String QualityComponentDetails)
    <*> arbitraryReducedMaybe n -- qualityComponentsSourceUrl :: Maybe (Map.Map String QualityComponentDetails)
    <*> arbitraryReducedMaybe n -- qualityComponentsUserAgent :: Maybe (Map.Map String QualityComponentDetails)
  
instance Arbitrary QuizPinData where
  arbitrary = sized genQuizPinData

genQuizPinData :: Int -> Gen QuizPinData
genQuizPinData n =
  QuizPinData
    <$> arbitraryReducedMaybe n -- quizPinDataQuestions :: Maybe [QuizPinQuestion]
    <*> arbitraryReducedMaybe n -- quizPinDataResults :: Maybe [QuizPinResult]
    <*> arbitraryReducedMaybe n -- quizPinDataTieBreakerCustomResult :: Maybe QuizPinResult
    <*> arbitraryReducedMaybe n -- quizPinDataTieBreakerType :: Maybe E'TieBreakerType
  
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
    <$> arbitraryReducedMaybe n -- quizPinQuestionOptions :: Maybe [QuizPinOption]
    <*> arbitraryReducedMaybe n -- quizPinQuestionQuestionId :: Maybe Double
    <*> arbitraryReducedMaybe n -- quizPinQuestionQuestionText :: Maybe Text
  
instance Arbitrary QuizPinResult where
  arbitrary = sized genQuizPinResult

genQuizPinResult :: Int -> Gen QuizPinResult
genQuizPinResult n =
  QuizPinResult
    <$> arbitraryReducedMaybe n -- quizPinResultAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- quizPinResultDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- quizPinResultIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- quizPinResultOrganicPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- quizPinResultResultId :: Maybe Double
  
instance Arbitrary RecordCounts where
  arbitrary = sized genRecordCounts

genRecordCounts :: Int -> Gen RecordCounts
genRecordCounts n =
  RecordCounts
    <$> arbitrary -- recordCountsInvalid :: Int
    <*> arbitrary -- recordCountsProcessed :: Int
    <*> arbitrary -- recordCountsValid :: Int
  
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
    <$> arbitraryReducedMaybe n -- relatedTermsRelatedTermsListInnerRelatedTerms :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- relatedTermsRelatedTermsListInnerTerm :: Maybe Text
  
instance Arbitrary ReportsStats200Response where
  arbitrary = sized genReportsStats200Response

genReportsStats200Response :: Int -> Gen ReportsStats200Response
genReportsStats200Response n =
  ReportsStats200Response
    <$> arbitraryReducedMaybe n -- reportsStats200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- reportsStats200ResponseItems :: [CatalogsReportStats]
  
instance Arbitrary ReportsStatsParametersParameter where
  arbitrary = sized genReportsStatsParametersParameter

genReportsStatsParametersParameter :: Int -> Gen ReportsStatsParametersParameter
genReportsStatsParametersParameter n =
  ReportsStatsParametersParameter
    <$> arbitraryReduced n -- reportsStatsParametersParameterCatalogType :: CatalogsType
    <*> arbitraryReduced n -- reportsStatsParametersParameterReport :: CatalogsHotelReportStatsParametersReport
  
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
  
instance Arbitrary S3FilePart where
  arbitrary = sized genS3FilePart

genS3FilePart :: Int -> Gen S3FilePart
genS3FilePart n =
  S3FilePart
    <$> arbitrary -- s3FilePartPartNumber :: Int
    <*> arbitrary -- s3FilePartPresignedUrl :: Text
  
instance Arbitrary S3MultipartUploadData where
  arbitrary = sized genS3MultipartUploadData

genS3MultipartUploadData :: Int -> Gen S3MultipartUploadData
genS3MultipartUploadData n =
  S3MultipartUploadData
    <$> arbitraryReducedMaybe n -- s3MultipartUploadDataFileParts :: Maybe [S3FilePart]
  
instance Arbitrary SSIOAccountAddress where
  arbitrary = sized genSSIOAccountAddress

genSSIOAccountAddress :: Int -> Gen SSIOAccountAddress
genSSIOAccountAddress n =
  SSIOAccountAddress
    <$> arbitraryReducedMaybe n -- sSIOAccountAddressAddressId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountAddressDisplay :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountAddressOrderLegalEntity :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountAddressPurpose :: Maybe Text
  
instance Arbitrary SSIOAccountItem where
  arbitrary = sized genSSIOAccountItem

genSSIOAccountItem :: Int -> Gen SSIOAccountItem
genSSIOAccountItem n =
  SSIOAccountItem
    <$> arbitraryReducedMaybe n -- sSIOAccountItemAddresses :: Maybe [SSIOAccountAddress]
    <*> arbitraryReducedMaybe n -- sSIOAccountItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemIoTerms :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemIoTermsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemIoType :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemRowTerms :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemRowTermsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemUsTerms :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountItemUsTermsId :: Maybe Text
  
instance Arbitrary SSIOAccountPMPName where
  arbitrary = sized genSSIOAccountPMPName

genSSIOAccountPMPName :: Int -> Gen SSIOAccountPMPName
genSSIOAccountPMPName n =
  SSIOAccountPMPName
    <$> arbitraryReducedMaybe n -- sSIOAccountPMPNameId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountPMPNameName :: Maybe Text
  
instance Arbitrary SSIOAccountResponse where
  arbitrary = sized genSSIOAccountResponse

genSSIOAccountResponse :: Int -> Gen SSIOAccountResponse
genSSIOAccountResponse n =
  SSIOAccountResponse
    <$> arbitraryReducedMaybe n -- sSIOAccountResponseBilltoInfos :: Maybe [SSIOAccountItem]
    <*> arbitraryReducedMaybe n -- sSIOAccountResponseCanEdit :: Maybe Bool
    <*> arbitraryReducedMaybe n -- sSIOAccountResponseCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountResponseEligible :: Maybe Bool
    <*> arbitraryReducedMaybe n -- sSIOAccountResponseError :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountResponsePmpNames :: Maybe [SSIOAccountPMPName]
  
instance Arbitrary SSIOCreateInsertionOrderRequest where
  arbitrary = sized genSSIOCreateInsertionOrderRequest

genSSIOCreateInsertionOrderRequest :: Int -> Gen SSIOCreateInsertionOrderRequest
genSSIOCreateInsertionOrderRequest n =
  SSIOCreateInsertionOrderRequest
    <$> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestAgencyLink :: Maybe Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBillingContactEmail :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBillingContactFirstname :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBillingContactLastname :: Text
    <*> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestBudgetAmount :: Maybe Double
    <*> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestEndDate :: Maybe Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestMediaContactEmail :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestMediaContactFirstname :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestMediaContactLastname :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestPoNumber :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestStartDate :: Text
    <*> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestUserEmail :: Maybe Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestAcceptedTermsId :: Text
    <*> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestAcceptedTermsTime :: Maybe Int
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBilltoBillingAddressId :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBilltoBusinessAddressId :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestBilltoCompanyId :: Text
    <*> arbitraryReduced n -- sSIOCreateInsertionOrderRequestCurrencyInfo :: Currency
    <*> arbitraryReducedMaybe n -- sSIOCreateInsertionOrderRequestEstimatedMonthlySpend :: Maybe Double
    <*> arbitrary -- sSIOCreateInsertionOrderRequestOrderLineType :: E'OrderLineType
    <*> arbitrary -- sSIOCreateInsertionOrderRequestOrderName :: Text
    <*> arbitrary -- sSIOCreateInsertionOrderRequestPmpId :: Text
  
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
    <$> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestAgencyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestBillingContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestBillingContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestBillingContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestBudgetAmount :: Maybe Double
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestEndDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestMediaContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestMediaContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestMediaContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestPoNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestStartDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestUserEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestAdsManagerOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestOracleLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestSalesforceOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOEditInsertionOrderRequestSalesforceOrderLineId :: Maybe Text
  
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
    <$> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonAgencyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonBillingContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonBillingContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonBillingContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonBudgetAmount :: Maybe Double
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonEndDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonMediaContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonMediaContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonMediaContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonPoNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonStartDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCommonUserEmail :: Maybe Text
  
instance Arbitrary SSIOInsertionOrderStatus where
  arbitrary = sized genSSIOInsertionOrderStatus

genSSIOInsertionOrderStatus :: Int -> Gen SSIOInsertionOrderStatus
genSSIOInsertionOrderStatus n =
  SSIOInsertionOrderStatus
    <$> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusCreationTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusPinOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusStatus :: Maybe Text
  
instance Arbitrary SSIOInsertionOrderStatusResponse where
  arbitrary = sized genSSIOInsertionOrderStatusResponse

genSSIOInsertionOrderStatusResponse :: Int -> Gen SSIOInsertionOrderStatusResponse
genSSIOInsertionOrderStatusResponse n =
  SSIOInsertionOrderStatusResponse
    <$> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusResponseCreationTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusResponsePinOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderStatusResponseStatus :: Maybe Text
  
instance Arbitrary SSIOOrderLine where
  arbitrary = sized genSSIOOrderLine

genSSIOOrderLine :: Int -> Gen SSIOOrderLine
genSSIOOrderLine n =
  SSIOOrderLine
    <$> arbitraryReducedMaybe n -- sSIOOrderLineAcceptedTermsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineAcceptedTermsTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineAdsManagerOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineAgencyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineBillToCompanyName :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineBillingContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineBillingContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineBillingContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineBudgetAmount :: Maybe Double
    <*> arbitraryReducedMaybe n -- sSIOOrderLineCurrencyInfo :: Maybe Currency
    <*> arbitraryReducedMaybe n -- sSIOOrderLineEndDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- sSIOOrderLineEstimatedMonthlySpend :: Maybe Double
    <*> arbitraryReducedMaybe n -- sSIOOrderLineLastModifiedDateTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineMediaContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineMediaContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineMediaContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineOrderName :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLinePinOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLinePmpName :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLinePoNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineSalesforceOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOOrderLineStartDate :: Maybe Date
  
instance Arbitrary SearchPartnerPins200Response where
  arbitrary = sized genSearchPartnerPins200Response

genSearchPartnerPins200Response :: Int -> Gen SearchPartnerPins200Response
genSearchPartnerPins200Response n =
  SearchPartnerPins200Response
    <$> arbitraryReducedMaybe n -- searchPartnerPins200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- searchPartnerPins200ResponseItems :: [SummaryPin]
  
instance Arbitrary SearchUserBoardsGet200Response where
  arbitrary = sized genSearchUserBoardsGet200Response

genSearchUserBoardsGet200Response :: Int -> Gen SearchUserBoardsGet200Response
genSearchUserBoardsGet200Response n =
  SearchUserBoardsGet200Response
    <$> arbitraryReducedMaybe n -- searchUserBoardsGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- searchUserBoardsGet200ResponseItems :: [Board]
  
instance Arbitrary SearchUserPinsList200Response where
  arbitrary = sized genSearchUserPinsList200Response

genSearchUserPinsList200Response :: Int -> Gen SearchUserPinsList200Response
genSearchUserPinsList200Response n =
  SearchUserPinsList200Response
    <$> arbitraryReducedMaybe n -- searchUserPinsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- searchUserPinsList200ResponseItems :: [Pin]
  
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
    <$> arbitraryReducedMaybe n -- singleInterestTargetingOptionResponseChildInterests :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- singleInterestTargetingOptionResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- singleInterestTargetingOptionResponseLevel :: Maybe Int
    <*> arbitraryReducedMaybe n -- singleInterestTargetingOptionResponseName :: Maybe Text
  
instance Arbitrary SsioInsertionOrdersStatusGetByAdAccount200Response where
  arbitrary = sized genSsioInsertionOrdersStatusGetByAdAccount200Response

genSsioInsertionOrdersStatusGetByAdAccount200Response :: Int -> Gen SsioInsertionOrdersStatusGetByAdAccount200Response
genSsioInsertionOrdersStatusGetByAdAccount200Response n =
  SsioInsertionOrdersStatusGetByAdAccount200Response
    <$> arbitraryReducedMaybe n -- ssioInsertionOrdersStatusGetByAdAccount200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- ssioInsertionOrdersStatusGetByAdAccount200ResponseItems :: [SSIOInsertionOrderStatus]
  
instance Arbitrary SsioOrderLinesGetByAdAccount200Response where
  arbitrary = sized genSsioOrderLinesGetByAdAccount200Response

genSsioOrderLinesGetByAdAccount200Response :: Int -> Gen SsioOrderLinesGetByAdAccount200Response
genSsioOrderLinesGetByAdAccount200Response n =
  SsioOrderLinesGetByAdAccount200Response
    <$> arbitraryReducedMaybe n -- ssioOrderLinesGetByAdAccount200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- ssioOrderLinesGetByAdAccount200ResponseItems :: [SSIOOrderLine]
  
instance Arbitrary SummaryPin where
  arbitrary = sized genSummaryPin

genSummaryPin :: Int -> Gen SummaryPin
genSummaryPin n =
  SummaryPin
    <$> arbitraryReducedMaybe n -- summaryPinAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinMedia :: Maybe PinMedia
    <*> arbitraryReducedMaybe n -- summaryPinTitle :: Maybe Text
  
instance Arbitrary SystemUserUpdateRequest where
  arbitrary = sized genSystemUserUpdateRequest

genSystemUserUpdateRequest :: Int -> Gen SystemUserUpdateRequest
genSystemUserUpdateRequest n =
  SystemUserUpdateRequest
    <$> arbitrary -- systemUserUpdateRequestName :: Text
  
instance Arbitrary TargetingSpec where
  arbitrary = sized genTargetingSpec

genTargetingSpec :: Int -> Gen TargetingSpec
genTargetingSpec n =
  TargetingSpec
    <$> arbitraryReducedMaybe n -- targetingSpecAgeBucket :: Maybe [TargetingSpecAgeBucket]
    <*> arbitraryReducedMaybe n -- targetingSpecApptype :: Maybe [TargetingSpecAppType]
    <*> arbitraryReducedMaybe n -- targetingSpecAudienceExclude :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecAudienceInclude :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecGender :: Maybe [TargetingSpecGender]
    <*> arbitraryReducedMaybe n -- targetingSpecGeo :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecInterest :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecLocale :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecLocation :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecMaximumAge :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingSpecMinimumAge :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingSpecShoppingRetargeting :: Maybe [TargetingSpecShoppingRetargeting]
    <*> arbitraryReducedMaybe n -- targetingSpecTargetingStrategy :: Maybe [E'TargetingStrategy]
  
instance Arbitrary TargetingSpecOperationAgeBucket where
  arbitrary = sized genTargetingSpecOperationAgeBucket

genTargetingSpecOperationAgeBucket :: Int -> Gen TargetingSpecOperationAgeBucket
genTargetingSpecOperationAgeBucket n =
  TargetingSpecOperationAgeBucket
    <$> arbitrary -- targetingSpecOperationAgeBucketField :: E'Field2
    <*> arbitrary -- targetingSpecOperationAgeBucketOperation :: E'Operation6
    <*> arbitraryReduced n -- targetingSpecOperationAgeBucketValues :: [TargetingSpecAgeBucket]
  
instance Arbitrary TargetingSpecOperationAppType where
  arbitrary = sized genTargetingSpecOperationAppType

genTargetingSpecOperationAppType :: Int -> Gen TargetingSpecOperationAppType
genTargetingSpecOperationAppType n =
  TargetingSpecOperationAppType
    <$> arbitrary -- targetingSpecOperationAppTypeField :: E'Field
    <*> arbitrary -- targetingSpecOperationAppTypeOperation :: E'Operation5
    <*> arbitraryReduced n -- targetingSpecOperationAppTypeValues :: [TargetingSpecAppType]
  
instance Arbitrary TargetingSpecOperationGender where
  arbitrary = sized genTargetingSpecOperationGender

genTargetingSpecOperationGender :: Int -> Gen TargetingSpecOperationGender
genTargetingSpecOperationGender n =
  TargetingSpecOperationGender
    <$> arbitrary -- targetingSpecOperationGenderField :: E'Field3
    <*> arbitrary -- targetingSpecOperationGenderOperation :: E'Operation5
    <*> arbitraryReduced n -- targetingSpecOperationGenderValues :: [TargetingSpecGender]
  
instance Arbitrary TargetingSpecOperationList where
  arbitrary = sized genTargetingSpecOperationList

genTargetingSpecOperationList :: Int -> Gen TargetingSpecOperationList
genTargetingSpecOperationList n =
  TargetingSpecOperationList
    <$> arbitrary -- targetingSpecOperationListField :: Text
    <*> arbitrary -- targetingSpecOperationListOperation :: E'Operation5
    <*> arbitrary -- targetingSpecOperationListValues :: [Text]
  
instance Arbitrary TargetingSpecOperationMinMaxAge where
  arbitrary = sized genTargetingSpecOperationMinMaxAge

genTargetingSpecOperationMinMaxAge :: Int -> Gen TargetingSpecOperationMinMaxAge
genTargetingSpecOperationMinMaxAge n =
  TargetingSpecOperationMinMaxAge
    <$> arbitrary -- targetingSpecOperationMinMaxAgeField :: E'Field5
    <*> arbitrary -- targetingSpecOperationMinMaxAgeOperation :: E'Operation6
    <*> arbitrary -- targetingSpecOperationMinMaxAgeValue :: Text
  
instance Arbitrary TargetingSpecOperationShoppingRetargeting where
  arbitrary = sized genTargetingSpecOperationShoppingRetargeting

genTargetingSpecOperationShoppingRetargeting :: Int -> Gen TargetingSpecOperationShoppingRetargeting
genTargetingSpecOperationShoppingRetargeting n =
  TargetingSpecOperationShoppingRetargeting
    <$> arbitrary -- targetingSpecOperationShoppingRetargetingField :: E'Field4
    <*> arbitrary -- targetingSpecOperationShoppingRetargetingOperation :: E'Operation6
    <*> arbitraryReduced n -- targetingSpecOperationShoppingRetargetingValues :: [TargetingSpecShoppingRetargeting]
  
instance Arbitrary TargetingSpecOperationString where
  arbitrary = sized genTargetingSpecOperationString

genTargetingSpecOperationString :: Int -> Gen TargetingSpecOperationString
genTargetingSpecOperationString n =
  TargetingSpecOperationString
    <$> arbitrary -- targetingSpecOperationStringField :: Text
    <*> arbitrary -- targetingSpecOperationStringOperation :: E'Operation6
    <*> arbitrary -- targetingSpecOperationStringValue :: Text
  
instance Arbitrary TargetingSpecShoppingRetargeting where
  arbitrary = sized genTargetingSpecShoppingRetargeting

genTargetingSpecShoppingRetargeting :: Int -> Gen TargetingSpecShoppingRetargeting
genTargetingSpecShoppingRetargeting n =
  TargetingSpecShoppingRetargeting
    <$> arbitraryReducedMaybe n -- targetingSpecShoppingRetargetingExclusionWindow :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingSpecShoppingRetargetingLookbackWindow :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingSpecShoppingRetargetingTagTypes :: Maybe [Int]
  
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
    <$> arbitraryReducedMaybe n -- targetingTemplateCommonAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- targetingTemplateCommonKeywords :: Maybe [TargetingTemplateKeyword]
    <*> arbitraryReducedMaybe n -- targetingTemplateCommonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateCommonPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- targetingTemplateCommonTargetingAttributes :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- targetingTemplateCommonTrackingUrls :: Maybe TrackingUrls
  
instance Arbitrary TargetingTemplateCreate where
  arbitrary = sized genTargetingTemplateCreate

genTargetingTemplateCreate :: Int -> Gen TargetingTemplateCreate
genTargetingTemplateCreate n =
  TargetingTemplateCreate
    <$> arbitraryReducedMaybe n -- targetingTemplateCreateAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- targetingTemplateCreateKeywords :: Maybe [TargetingTemplateKeyword]
    <*> arbitrary -- targetingTemplateCreateName :: Text
    <*> arbitraryReducedMaybe n -- targetingTemplateCreatePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReduced n -- targetingTemplateCreateTargetingAttributes :: TargetingSpec
    <*> arbitraryReducedMaybe n -- targetingTemplateCreateTrackingUrls :: Maybe TrackingUrls
  
instance Arbitrary TargetingTemplateGetResponseData where
  arbitrary = sized genTargetingTemplateGetResponseData

genTargetingTemplateGetResponseData :: Int -> Gen TargetingTemplateGetResponseData
genTargetingTemplateGetResponseData n =
  TargetingTemplateGetResponseData
    <$> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataKeywords :: Maybe [TargetingTemplateKeyword]
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataName :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataTargetingAttributes :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataId :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataSizing :: Maybe TargetingTemplateAudienceSizing
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataStatus :: Maybe E'Status4
    <*> arbitraryReducedMaybe n -- targetingTemplateGetResponseDataUpdatedTime :: Maybe Int
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
    <$> arbitraryReducedMaybe n -- targetingTemplateList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- targetingTemplateList200ResponseItems :: [TargetingTemplateGetResponseData]
  
instance Arbitrary TargetingTemplateResponseData where
  arbitrary = sized genTargetingTemplateResponseData

genTargetingTemplateResponseData :: Int -> Gen TargetingTemplateResponseData
genTargetingTemplateResponseData n =
  TargetingTemplateResponseData
    <$> arbitraryReducedMaybe n -- targetingTemplateResponseDataAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataKeywords :: Maybe [TargetingTemplateKeyword]
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataName :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataTargetingAttributes :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataId :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataSizing :: Maybe TargetingTemplateAudienceSizing
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataStatus :: Maybe E'Status4
    <*> arbitraryReducedMaybe n -- targetingTemplateResponseDataUpdatedTime :: Maybe Int
  
instance Arbitrary TargetingTemplateUpdateRequest where
  arbitrary = sized genTargetingTemplateUpdateRequest

genTargetingTemplateUpdateRequest :: Int -> Gen TargetingTemplateUpdateRequest
genTargetingTemplateUpdateRequest n =
  TargetingTemplateUpdateRequest
    <$> arbitrary -- targetingTemplateUpdateRequestId :: Text
    <*> arbitrary -- targetingTemplateUpdateRequestOperationType :: E'OperationType
    <*> arbitraryReducedMaybe n -- targetingTemplateUpdateRequestTargetingAttributes :: Maybe TargetingSpec
  
instance Arbitrary TargetingTypeFilter where
  arbitrary = sized genTargetingTypeFilter

genTargetingTypeFilter :: Int -> Gen TargetingTypeFilter
genTargetingTypeFilter n =
  TargetingTypeFilter
    <$> arbitraryReducedMaybe n -- targetingTypeFilterTargetingTypes :: Maybe [E'TargetingTypes]
  
instance Arbitrary TemplateBasedReport where
  arbitrary = sized genTemplateBasedReport

genTemplateBasedReport :: Int -> Gen TemplateBasedReport
genTemplateBasedReport n =
  TemplateBasedReport
    <$> arbitraryReducedMaybe n -- templateBasedReportMessage :: Maybe Text
    <*> arbitraryReduced n -- templateBasedReportReportStatus :: BulkReportingJobStatus
    <*> arbitrary -- templateBasedReportTemplateId :: Text
    <*> arbitraryReducedMaybe n -- templateBasedReportToken :: Maybe Text
  
instance Arbitrary TemplateResponse where
  arbitrary = sized genTemplateResponse

genTemplateResponse :: Int -> Gen TemplateResponse
genTemplateResponse n =
  TemplateResponse
    <$> arbitraryReducedMaybe n -- templateResponseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseAdAccountIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- templateResponseClickWindowDays :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseColumns :: Maybe [E'Columns]
    <*> arbitraryReducedMaybe n -- templateResponseConversionReportTimeType :: Maybe E'ConversionReportTimeType
    <*> arbitraryReducedMaybe n -- templateResponseCreationSource :: Maybe E'CreationSource
    <*> arbitraryReducedMaybe n -- templateResponseCustomColumnIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- templateResponseDateRange :: Maybe TemplateResponseDateRange
    <*> arbitraryReducedMaybe n -- templateResponseEngagementWindowDays :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseFiltersJson :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseGranularity :: Maybe Granularity
    <*> arbitraryReducedMaybe n -- templateResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseIngestionSources :: Maybe [E'IngestionSources]
    <*> arbitraryReducedMaybe n -- templateResponseIsDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- templateResponseIsOwnedByUser :: Maybe Bool
    <*> arbitraryReducedMaybe n -- templateResponseIsScheduled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- templateResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseReportEndRelativeDaysInPast :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseReportFormat :: Maybe DataOutputFormat
    <*> arbitraryReducedMaybe n -- templateResponseReportLevel :: Maybe MetricsReportingLevel
    <*> arbitraryReducedMaybe n -- templateResponseReportStartRelativeDaysInPast :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseType :: Maybe E'Type
    <*> arbitraryReducedMaybe n -- templateResponseUpdatedTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- templateResponseViewWindowDays :: Maybe Double
  
instance Arbitrary TemplateResponseDateRange where
  arbitrary = sized genTemplateResponseDateRange

genTemplateResponseDateRange :: Int -> Gen TemplateResponseDateRange
genTemplateResponseDateRange n =
  TemplateResponseDateRange
    <$> arbitraryReducedMaybe n -- templateResponseDateRangeAbsoluteDateRange :: Maybe TemplateResponseDateRangeAbsoluteDateRange
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeDynamicDateRange :: Maybe TemplateResponseDateRangeDynamicDateRange
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeRelativeDateRange :: Maybe TemplateResponseDateRangeRelativeDateRange
  
instance Arbitrary TemplateResponseDateRangeAbsoluteDateRange where
  arbitrary = sized genTemplateResponseDateRangeAbsoluteDateRange

genTemplateResponseDateRangeAbsoluteDateRange :: Int -> Gen TemplateResponseDateRangeAbsoluteDateRange
genTemplateResponseDateRangeAbsoluteDateRange n =
  TemplateResponseDateRangeAbsoluteDateRange
    <$> arbitraryReducedMaybe n -- templateResponseDateRangeAbsoluteDateRangeEndDate :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeAbsoluteDateRangeStartDate :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeAbsoluteDateRangeType :: Maybe Text
  
instance Arbitrary TemplateResponseDateRangeDynamicDateRange where
  arbitrary = sized genTemplateResponseDateRangeDynamicDateRange

genTemplateResponseDateRangeDynamicDateRange :: Int -> Gen TemplateResponseDateRangeDynamicDateRange
genTemplateResponseDateRangeDynamicDateRange n =
  TemplateResponseDateRangeDynamicDateRange
    <$> arbitraryReducedMaybe n -- templateResponseDateRangeDynamicDateRangeRange :: Maybe E'Range
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeDynamicDateRangeType :: Maybe Text
  
instance Arbitrary TemplateResponseDateRangeRelativeDateRange where
  arbitrary = sized genTemplateResponseDateRangeRelativeDateRange

genTemplateResponseDateRangeRelativeDateRange :: Int -> Gen TemplateResponseDateRangeRelativeDateRange
genTemplateResponseDateRangeRelativeDateRange n =
  TemplateResponseDateRangeRelativeDateRange
    <$> arbitraryReducedMaybe n -- templateResponseDateRangeRelativeDateRangeEndDaysInPast :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeRelativeDateRangeStartDaysInPast :: Maybe Double
    <*> arbitraryReducedMaybe n -- templateResponseDateRangeRelativeDateRangeType :: Maybe Text
  
instance Arbitrary TemplatesList200Response where
  arbitrary = sized genTemplatesList200Response

genTemplatesList200Response :: Int -> Gen TemplatesList200Response
genTemplatesList200Response n =
  TemplatesList200Response
    <$> arbitraryReducedMaybe n -- templatesList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- templatesList200ResponseItems :: [TemplateResponse]
  
instance Arbitrary TermsOfService where
  arbitrary = sized genTermsOfService

genTermsOfService :: Int -> Gen TermsOfService
genTermsOfService n =
  TermsOfService
    <$> arbitraryReducedMaybe n -- termsOfServiceAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- termsOfServiceHasAccepted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- termsOfServiceHtml :: Maybe Text
    <*> arbitraryReducedMaybe n -- termsOfServiceId :: Maybe Text
  
instance Arbitrary TimeSeries where
  arbitrary = sized genTimeSeries

genTimeSeries :: Int -> Gen TimeSeries
genTimeSeries n =
  TimeSeries
    <$> arbitraryReducedMaybe n -- timeSeriesDate :: Maybe Date
  
instance Arbitrary TitleKeywordsFilter where
  arbitrary = sized genTitleKeywordsFilter

genTitleKeywordsFilter :: Int -> Gen TitleKeywordsFilter
genTitleKeywordsFilter n =
  TitleKeywordsFilter
    <$> arbitraryReduced n -- titleKeywordsFilterTitleKeywords :: CatalogsProductGroupMultipleStringCriteria
  
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
    <$> arbitraryReducedMaybe n -- topPinsAnalyticsResponseDateAvailabilityIsRealtime :: Maybe Bool
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponseDateAvailabilityLatestAvailableTimestamp :: Maybe Double
  
instance Arbitrary TopPinsAnalyticsResponsePinsInner where
  arbitrary = sized genTopPinsAnalyticsResponsePinsInner

genTopPinsAnalyticsResponsePinsInner :: Int -> Gen TopPinsAnalyticsResponsePinsInner
genTopPinsAnalyticsResponsePinsInner n =
  TopPinsAnalyticsResponsePinsInner
    <$> arbitraryReducedMaybe n -- topPinsAnalyticsResponsePinsInnerDataStatus :: Maybe (Map.Map String DataStatus)
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponsePinsInnerMetrics :: Maybe (Map.Map String Double)
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
    <$> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponsePinsInnerDataStatus :: Maybe (Map.Map String DataStatus)
    <*> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponsePinsInnerMetrics :: Maybe (Map.Map String Double)
    <*> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponsePinsInnerPinId :: Maybe Text
  
instance Arbitrary TrackingUrls where
  arbitrary = sized genTrackingUrls

genTrackingUrls :: Int -> Gen TrackingUrls
genTrackingUrls n =
  TrackingUrls
    <$> arbitraryReducedMaybe n -- trackingUrlsAudienceVerification :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- trackingUrlsBuyableButton :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- trackingUrlsClick :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- trackingUrlsEngagement :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- trackingUrlsImpression :: Maybe [Text]
  
instance Arbitrary TrendingKeyword where
  arbitrary = sized genTrendingKeyword

genTrendingKeyword :: Int -> Gen TrendingKeyword
genTrendingKeyword n =
  TrendingKeyword
    <$> arbitraryReducedMaybe n -- trendingKeywordDemographics :: Maybe TrendingKeywordDemographics
    <*> arbitraryReducedMaybe n -- trendingKeywordHasPrediction :: Maybe Bool
    <*> arbitraryReducedMaybe n -- trendingKeywordKeyword :: Maybe Text
    <*> arbitraryReducedMaybe n -- trendingKeywordPctGrowthMom :: Maybe Int
    <*> arbitraryReducedMaybe n -- trendingKeywordPctGrowthWow :: Maybe Int
    <*> arbitraryReducedMaybe n -- trendingKeywordPctGrowthYoy :: Maybe Int
    <*> arbitraryReducedMaybe n -- trendingKeywordPredictedTimeSeries :: Maybe PredictedTimeSeries
    <*> arbitraryReducedMaybe n -- trendingKeywordTimeSeries :: Maybe TimeSeries
  
instance Arbitrary TrendingKeywordDemographics where
  arbitrary = sized genTrendingKeywordDemographics

genTrendingKeywordDemographics :: Int -> Gen TrendingKeywordDemographics
genTrendingKeywordDemographics n =
  TrendingKeywordDemographics
    <$> arbitraryReducedMaybe n -- trendingKeywordDemographicsAgeDistribution :: Maybe TrendingKeywordDemographicsAgeDistribution
    <*> arbitraryReducedMaybe n -- trendingKeywordDemographicsGenderDistribution :: Maybe TrendingKeywordDemographicsGenderDistribution
  
instance Arbitrary TrendingKeywordDemographicsAgeDistribution where
  arbitrary = sized genTrendingKeywordDemographicsAgeDistribution

genTrendingKeywordDemographicsAgeDistribution :: Int -> Gen TrendingKeywordDemographicsAgeDistribution
genTrendingKeywordDemographicsAgeDistribution n =
  TrendingKeywordDemographicsAgeDistribution
    <$> arbitraryReducedMaybe n -- trendingKeywordDemographicsAgeDistributionAgeDistribution :: Maybe E'AgeDistribution
  
instance Arbitrary TrendingKeywordDemographicsGenderDistribution where
  arbitrary = sized genTrendingKeywordDemographicsGenderDistribution

genTrendingKeywordDemographicsGenderDistribution :: Int -> Gen TrendingKeywordDemographicsGenderDistribution
genTrendingKeywordDemographicsGenderDistribution n =
  TrendingKeywordDemographicsGenderDistribution
    <$> arbitraryReducedMaybe n -- trendingKeywordDemographicsGenderDistributionGenderDistribution :: Maybe E'GenderDistribution
  
instance Arbitrary TrendingKeywordsResponse where
  arbitrary = sized genTrendingKeywordsResponse

genTrendingKeywordsResponse :: Int -> Gen TrendingKeywordsResponse
genTrendingKeywordsResponse n =
  TrendingKeywordsResponse
    <$> arbitraryReducedMaybe n -- trendingKeywordsResponseTrends :: Maybe [TrendingKeyword]
  
instance Arbitrary TrendingPin where
  arbitrary = sized genTrendingPin

genTrendingPin :: Int -> Gen TrendingPin
genTrendingPin n =
  TrendingPin
    <$> arbitrary -- trendingPinHeight :: Int
    <*> arbitrary -- trendingPinId :: Text
    <*> arbitrary -- trendingPinSrc :: Text
    <*> arbitrary -- trendingPinWidth :: Int
  
instance Arbitrary TrendingProductCategory where
  arbitrary = sized genTrendingProductCategory

genTrendingProductCategory :: Int -> Gen TrendingProductCategory
genTrendingProductCategory n =
  TrendingProductCategory
    <$> arbitraryReduced n -- trendingProductCategoryEngagementType :: ProductCategoriesEngagementType
    <*> arbitrary -- trendingProductCategoryPctChangeMom :: Int
    <*> arbitrary -- trendingProductCategoryPercentRelativeVolume :: Int
    <*> arbitrary -- trendingProductCategoryProductCategory :: Text
    <*> arbitraryReducedMaybe n -- trendingProductCategoryVerticals :: Maybe [VerticalProductCategory]
  
instance Arbitrary TrendingTopic where
  arbitrary = sized genTrendingTopic

genTrendingTopic :: Int -> Gen TrendingTopic
genTrendingTopic n =
  TrendingTopic
    <$> arbitrary -- trendingTopicDescription :: Text
    <*> arbitrary -- trendingTopicPercentGrowthMom :: Int
    <*> arbitraryReduced n -- trendingTopicPins :: [TrendingPin]
    <*> arbitrary -- trendingTopicRelatedInterests :: [Text]
    <*> arbitrary -- trendingTopicRelatedSearches :: [Text]
    <*> arbitrary -- trendingTopicTimeSeries :: (Map.Map String Double)
    <*> arbitrary -- trendingTopicTitle :: Text
  
instance Arbitrary UpdatableItemAttributes where
  arbitrary = sized genUpdatableItemAttributes

genUpdatableItemAttributes :: Int -> Gen UpdatableItemAttributes
genUpdatableItemAttributes n =
  UpdatableItemAttributes
    <$> arbitraryReducedMaybe n -- updatableItemAttributesAdImage0Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage0Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage10Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage10Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage11Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage11Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage12Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage12Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage13Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage13Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage14Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage14Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage15Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage15Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage16Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage16Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage17Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage17Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage18Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage18Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage19Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage19Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage1Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage1Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage2Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage2Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage3Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage3Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage4Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage4Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage5Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage5Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage6Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage6Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage7Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage7Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage8Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage8Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage9Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdImage9Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdVideo0Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdVideo0Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdVideo1Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdVideo1Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdVideo2Link :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdVideo2Tag :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAdult :: Maybe Bool
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAgeGroup :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesAndroidDeepLink :: Maybe Text
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
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCustomNumber0 :: Maybe Int
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCustomNumber1 :: Maybe Int
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCustomNumber2 :: Maybe Int
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCustomNumber3 :: Maybe Int
    <*> arbitraryReducedMaybe n -- updatableItemAttributesCustomNumber4 :: Maybe Int
    <*> arbitraryReducedMaybe n -- updatableItemAttributesDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesFreeShippingLabel :: Maybe Bool
    <*> arbitraryReducedMaybe n -- updatableItemAttributesFreeShippingLimit :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesGender :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesGoogleProductCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesGtin :: Maybe UpdatableItemAttributesGtin
    <*> arbitraryReducedMaybe n -- updatableItemAttributesId :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesInstallmentPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesIosDeepLink :: Maybe Text
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
    <*> arbitraryReducedMaybe n -- updatableItemAttributesPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesSalePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesSalePriceEffectiveDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesShipping :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesShippingHeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesShippingWeight :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesShippingWidth :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesSize :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesSizeSystem :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesSizeType :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesTax :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesUnitPricingBaseMeasure :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesUnitPricingMeasure :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatableItemAttributesVariantNames :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updatableItemAttributesVariantValues :: Maybe [Text]
  
instance Arbitrary UpdatableItemAttributesGtin where
  arbitrary = sized genUpdatableItemAttributesGtin

genUpdatableItemAttributesGtin :: Int -> Gen UpdatableItemAttributesGtin
genUpdatableItemAttributesGtin n =
  
  pure UpdatableItemAttributesGtin
   
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
    <*> arbitraryReducedMaybe n -- updateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupTypes :: Maybe [AssetGroupType]
    <*> arbitraryReducedMaybe n -- updateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToAdd :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToRemove :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateAssetGroupBodyAssetGroupsToUpdateInnerDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateAssetGroupBodyAssetGroupsToUpdateInnerName :: Maybe Text
  
instance Arbitrary UpdateAssetGroupResponse where
  arbitrary = sized genUpdateAssetGroupResponse

genUpdateAssetGroupResponse :: Int -> Gen UpdateAssetGroupResponse
genUpdateAssetGroupResponse n =
  UpdateAssetGroupResponse
    <$> arbitraryReducedMaybe n -- updateAssetGroupResponseExceptions :: Maybe [UpdateAssetGroupResponseExceptionsInner]
    <*> arbitraryReducedMaybe n -- updateAssetGroupResponseUpdatedAssetGroups :: Maybe [AssetGroupBinding]
  
instance Arbitrary UpdateAssetGroupResponseExceptionsInner where
  arbitrary = sized genUpdateAssetGroupResponseExceptionsInner

genUpdateAssetGroupResponseExceptionsInner :: Int -> Gen UpdateAssetGroupResponseExceptionsInner
genUpdateAssetGroupResponseExceptionsInner n =
  UpdateAssetGroupResponseExceptionsInner
    <$> arbitraryReducedMaybe n -- updateAssetGroupResponseExceptionsInnerAssetGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateAssetGroupResponseExceptionsInnerCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- updateAssetGroupResponseExceptionsInnerMessage :: Maybe Text
  
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
    <$> arbitrary -- updatePartnerAssetAccessBodyAccessesInnerAssetId :: Text
    <*> arbitrary -- updatePartnerAssetAccessBodyAccessesInnerPartnerId :: Text
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
    <$> arbitraryReducedMaybe n -- userAccountFollowedInterests200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- userAccountFollowedInterests200ResponseItems :: [Interest]
  
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
    <$> arbitraryReducedMaybe n -- userFollowingGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- userFollowingGet200ResponseItems :: [UserSummary]
  
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
    <$> arbitraryReducedMaybe n -- userSummaryType :: Maybe Text
    <*> arbitraryReducedMaybe n -- userSummaryUsername :: Maybe Text
  
instance Arbitrary UserWebsiteSummary where
  arbitrary = sized genUserWebsiteSummary

genUserWebsiteSummary :: Int -> Gen UserWebsiteSummary
genUserWebsiteSummary n =
  UserWebsiteSummary
    <$> arbitraryReducedMaybe n -- userWebsiteSummaryStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteSummaryVerifiedAt :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteSummaryWebsite :: Maybe Text
  
instance Arbitrary UserWebsiteVerificationCode where
  arbitrary = sized genUserWebsiteVerificationCode

genUserWebsiteVerificationCode :: Int -> Gen UserWebsiteVerificationCode
genUserWebsiteVerificationCode n =
  UserWebsiteVerificationCode
    <$> arbitraryReducedMaybe n -- userWebsiteVerificationCodeDnsTxtRecord :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationCodeFileContent :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationCodeFilename :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationCodeMetatag :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationCodeVerificationCode :: Maybe Text
  
instance Arbitrary UserWebsiteVerifyRequest where
  arbitrary = sized genUserWebsiteVerifyRequest

genUserWebsiteVerifyRequest :: Int -> Gen UserWebsiteVerifyRequest
genUserWebsiteVerifyRequest n =
  UserWebsiteVerifyRequest
    <$> arbitraryReducedMaybe n -- userWebsiteVerifyRequestVerificationMethod :: Maybe E'VerificationMethod
    <*> arbitraryReducedMaybe n -- userWebsiteVerifyRequestWebsite :: Maybe Text
  
instance Arbitrary UserWebsitesGet200Response where
  arbitrary = sized genUserWebsitesGet200Response

genUserWebsitesGet200Response :: Int -> Gen UserWebsitesGet200Response
genUserWebsitesGet200Response n =
  UserWebsitesGet200Response
    <$> arbitraryReducedMaybe n -- userWebsitesGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- userWebsitesGet200ResponseItems :: [UserWebsiteSummary]
  
instance Arbitrary UsersForIndividualAssetResponse where
  arbitrary = sized genUsersForIndividualAssetResponse

genUsersForIndividualAssetResponse :: Int -> Gen UsersForIndividualAssetResponse
genUsersForIndividualAssetResponse n =
  UsersForIndividualAssetResponse
    <$> arbitraryReducedMaybe n -- usersForIndividualAssetResponseAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usersForIndividualAssetResponseMemberId :: Maybe Text
    <*> arbitraryReducedMaybe n -- usersForIndividualAssetResponsePermissions :: Maybe [Text]
  
instance Arbitrary VideoMetadataWithItemType where
  arbitrary = sized genVideoMetadataWithItemType

genVideoMetadataWithItemType :: Int -> Gen VideoMetadataWithItemType
genVideoMetadataWithItemType n =
  VideoMetadataWithItemType
    <$> arbitraryReducedMaybe n -- videoMetadataWithItemTypeCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- videoMetadataWithItemTypeDuration :: Maybe Double
    <*> arbitraryReducedMaybe n -- videoMetadataWithItemTypeHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- videoMetadataWithItemTypeItemType :: Maybe Text
    <*> arbitraryReducedMaybe n -- videoMetadataWithItemTypeVideoUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- videoMetadataWithItemTypeWidth :: Maybe Int
  



instance Arbitrary ActionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdCountry where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdGroupSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsAdGroupTargetingType where
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

instance Arbitrary AgeTrendsBucket where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AssetGroupType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceAccountType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceInsightType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceShareType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceUpdateOperationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BatchOperation where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BatchOperationStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BoardPrivacy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BoardPrivacyFilter where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BoardUpdatePrivacy where
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

instance Arbitrary CatalogsHotelProductGroupType where
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

instance Arbitrary ConversionProductReportingColumn where
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

instance Arbitrary CustomizableCTAType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DataOutputFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DataStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DisclosureType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AccountType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AccountType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AgeDistribution where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AppType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AppTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AssetType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AttributionModel where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AttributionScope where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Availability where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'BidStrategyType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'BillingType where
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

instance Arbitrary E'CollectionsHeaderType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Columns where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Columns2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Condition where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ContentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ContentType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ConversionEvent where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ConversionLearningModeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ConversionProductAttributionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ConversionProductBreakdown where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ConversionReportTimeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CreatedInLastNDays where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CreationSource where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CreativeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CreativeTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CustomEventMetricsType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CustomizableCtaType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'DiscountStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'DiscountType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'DocumentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'EntityStatuses where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'EntityStatuses2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'EventName where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'EventType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FilterOperatorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FormFactor where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FromClaimedContent where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Gender where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'GenderDistribution where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Genders where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'GrantType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Granularity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Granularity2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'IngestionSources where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Interests where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'InviteStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'LabelTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Language where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'LargeProductCountDecrease where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Level where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Level2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'LogLevel where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MappedConversionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MediaType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MediaType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MediaType3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MediaType4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MediaType5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MediaType6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Method where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MetricTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MetricTypes2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MetricTypes3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'NetworkType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operation where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operation2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operation3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operation4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operation5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operation6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OperationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operator where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Order where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OrderLineType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OsFamily where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OwnershipType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ParentType where
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

instance Arbitrary E'PreferredMediaType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PrimarySort where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PromotionApplicationLevel where
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

instance Arbitrary E'ReportType5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReportType6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReviewStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Scope where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Scope2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Severity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Sort where
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

instance Arbitrary E'State where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'StatusCode where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'TargetingStrategy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'TargetingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'TargetingTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'TieBreakerType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Timerange where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Timezone where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'TokenTypeHint where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'UpdateMask where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'VerificationMethod where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary EnhancedMatchStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary EntityStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Gender where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GenderBucket where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GetAudiencesOrderBy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GetBusinessAssetTypeResponse where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Granularity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GridClickType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary IngestionSourceOptions where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary InterestsEnum where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary InviteStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary InviteType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ItemProcessingStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LabelParentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LabelStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LabelType where
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

instance Arbitrary LookbackPeriodOptions where
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

instance Arbitrary ModelContentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NonDraftEntityStatus where
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

instance Arbitrary OverallStatusOptions where
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

instance Arbitrary PinterestLibPaginationOrder where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PlacementGroupType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ProductAvailabilityType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ProductCategoriesEngagementType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ProductCategoryDetailLookbackWindow where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ProductCategoryEnum where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ProductCategoryRegion where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ProductGroupSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PromotionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReportingColumnAsync where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReportingTimeZone where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Role where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary SourcePlatformOptions where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingAdvertiserCountry where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingSpecAgeBucket where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingSpecAppType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingSpecGender where
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

instance Arbitrary VerticalProductCategory where
  arbitrary = arbitraryBoundedEnum

