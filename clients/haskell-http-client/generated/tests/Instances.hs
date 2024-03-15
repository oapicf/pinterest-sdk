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
  
instance Arbitrary AdAccountsCatalogsProductGroupsList200Response where
  arbitrary = sized genAdAccountsCatalogsProductGroupsList200Response

genAdAccountsCatalogsProductGroupsList200Response :: Int -> Gen AdAccountsCatalogsProductGroupsList200Response
genAdAccountsCatalogsProductGroupsList200Response n =
  AdAccountsCatalogsProductGroupsList200Response
    <$> arbitraryReduced n -- adAccountsCatalogsProductGroupsList200ResponseItems :: [CatalogProductGroup]
    <*> arbitraryReducedMaybe n -- adAccountsCatalogsProductGroupsList200ResponseBookmark :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- adCommonTrackingUrls :: Maybe AdCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- adCommonViewTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCommonGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adCommonCustomizableCtaType :: Maybe E'CustomizableCtaType
    <*> arbitraryReducedMaybe n -- adCommonQuizPinData :: Maybe AdCommonQuizPinData
  
instance Arbitrary AdCommonQuizPinData where
  arbitrary = sized genAdCommonQuizPinData

genAdCommonQuizPinData :: Int -> Gen AdCommonQuizPinData
genAdCommonQuizPinData n =
  AdCommonQuizPinData
    <$> arbitraryReducedMaybe n -- adCommonQuizPinDataQuestions :: Maybe [QuizPinQuestion]
    <*> arbitraryReducedMaybe n -- adCommonQuizPinDataResults :: Maybe [QuizPinResult]
  
instance Arbitrary AdCommonTrackingUrls where
  arbitrary = sized genAdCommonTrackingUrls

genAdCommonTrackingUrls :: Int -> Gen AdCommonTrackingUrls
genAdCommonTrackingUrls n =
  AdCommonTrackingUrls
    <$> arbitraryReducedMaybe n -- adCommonTrackingUrlsImpression :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCommonTrackingUrlsClick :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCommonTrackingUrlsEngagement :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCommonTrackingUrlsBuyableButton :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCommonTrackingUrlsAudienceVerification :: Maybe [Text]
  
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
    <*> arbitraryReducedMaybe n -- adCreateRequestTrackingUrls :: Maybe AdCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- adCreateRequestViewTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adCreateRequestCustomizableCtaType :: Maybe E'CustomizableCtaType
    <*> arbitraryReducedMaybe n -- adCreateRequestQuizPinData :: Maybe AdCommonQuizPinData
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
    <*> arbitraryReducedMaybe n -- adGroupCommonOptimizationGoalMetadata :: Maybe AdGroupCommonOptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupCommonBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupCommonStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupCommonLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCommonTrackingUrls :: Maybe AdGroupCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupCommonAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCommonPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupCommonPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupCommonCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCommonBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupCommonBidStrategyType :: Maybe E'BidStrategyType
  
instance Arbitrary AdGroupCommonOptimizationGoalMetadata where
  arbitrary = sized genAdGroupCommonOptimizationGoalMetadata

genAdGroupCommonOptimizationGoalMetadata :: Int -> Gen AdGroupCommonOptimizationGoalMetadata
genAdGroupCommonOptimizationGoalMetadata n =
  AdGroupCommonOptimizationGoalMetadata
    <$> arbitraryReducedMaybe n -- adGroupCommonOptimizationGoalMetadataConversionTagV3GoalMetadata :: Maybe OptimizationGoalMetadataConversionTagV3GoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupCommonOptimizationGoalMetadataFrequencyGoalMetadata :: Maybe OptimizationGoalMetadataFrequencyGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupCommonOptimizationGoalMetadataScrollupGoalMetadata :: Maybe OptimizationGoalMetadataScrollupGoalMetadata
  
instance Arbitrary AdGroupCommonTrackingUrls where
  arbitrary = sized genAdGroupCommonTrackingUrls

genAdGroupCommonTrackingUrls :: Int -> Gen AdGroupCommonTrackingUrls
genAdGroupCommonTrackingUrls n =
  AdGroupCommonTrackingUrls
    <$> arbitraryReducedMaybe n -- adGroupCommonTrackingUrlsImpression :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupCommonTrackingUrlsClick :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupCommonTrackingUrlsEngagement :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupCommonTrackingUrlsBuyableButton :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupCommonTrackingUrlsAudienceVerification :: Maybe [Text]
  
instance Arbitrary AdGroupCreateRequest where
  arbitrary = sized genAdGroupCreateRequest

genAdGroupCreateRequest :: Int -> Gen AdGroupCreateRequest
genAdGroupCreateRequest n =
  AdGroupCreateRequest
    <$> arbitrary -- adGroupCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestOptimizationGoalMetadata :: Maybe AdGroupCommonOptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestTrackingUrls :: Maybe AdGroupCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitrary -- adGroupCreateRequestCampaignId :: Text
    <*> arbitraryReduced n -- adGroupCreateRequestBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBidStrategyType :: Maybe E'BidStrategyType
  
instance Arbitrary AdGroupResponse where
  arbitrary = sized genAdGroupResponse

genAdGroupResponse :: Int -> Gen AdGroupResponse
genAdGroupResponse n =
  AdGroupResponse
    <$> arbitraryReducedMaybe n -- adGroupResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupResponseBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseOptimizationGoalMetadata :: Maybe AdGroupCommonOptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupResponseBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupResponseStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupResponseLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupResponseTrackingUrls :: Maybe AdGroupCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupResponseAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupResponsePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupResponsePacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupResponseCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupResponseBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupResponseBidStrategyType :: Maybe E'BidStrategyType
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
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestOptimizationGoalMetadata :: Maybe AdGroupCommonOptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestTrackingUrls :: Maybe AdGroupCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBidStrategyType :: Maybe E'BidStrategyType
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
    <*> arbitraryReducedMaybe n -- adResponseTrackingUrls :: Maybe AdCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- adResponseViewTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adResponseGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adResponseCustomizableCtaType :: Maybe E'CustomizableCtaType
    <*> arbitraryReducedMaybe n -- adResponseQuizPinData :: Maybe AdCommonQuizPinData
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
    <*> arbitraryReducedMaybe n -- adUpdateRequestTrackingUrls :: Maybe AdCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- adUpdateRequestViewTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adUpdateRequestCustomizableCtaType :: Maybe E'CustomizableCtaType
    <*> arbitraryReducedMaybe n -- adUpdateRequestQuizPinData :: Maybe AdCommonQuizPinData
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
  
instance Arbitrary AvailabilityFilter where
  arbitrary = sized genAvailabilityFilter

genAvailabilityFilter :: Int -> Gen AvailabilityFilter
genAvailabilityFilter n =
  AvailabilityFilter
    <$> arbitraryReduced n -- availabilityFilterAvailability :: CatalogsProductGroupMultipleStringCriteria
  
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
    <*> arbitraryReducedMaybe n -- campaignCommonTrackingUrls :: Maybe AdCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCommonStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCommonSummaryStatus :: Maybe CampaignSummaryStatus
  
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
    <*> arbitraryReducedMaybe n -- campaignCreateCommonTrackingUrls :: Maybe AdCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCreateCommonStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateCommonSummaryStatus :: Maybe CampaignSummaryStatus
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
    <*> arbitraryReducedMaybe n -- campaignCreateRequestTrackingUrls :: Maybe AdCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCreateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestSummaryStatus :: Maybe CampaignSummaryStatus
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
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataTrackingUrls :: Maybe AdCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataSummaryStatus :: Maybe CampaignSummaryStatus
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataObjectiveType :: Maybe ObjectiveType
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataType :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateResponseDataIsCampaignBudgetOptimization :: Maybe Bool
  
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
    <*> arbitraryReducedMaybe n -- campaignResponseTrackingUrls :: Maybe AdCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- campaignResponseStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseSummaryStatus :: Maybe CampaignSummaryStatus
    <*> arbitraryReducedMaybe n -- campaignResponseObjectiveType :: Maybe ObjectiveType
    <*> arbitraryReducedMaybe n -- campaignResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignResponseType :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignResponseIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignResponseIsCampaignBudgetOptimization :: Maybe Bool
  
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
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestTrackingUrls :: Maybe AdCommonTrackingUrls
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestSummaryStatus :: Maybe CampaignSummaryStatus
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
  
instance Arbitrary Catalog where
  arbitrary = sized genCatalog

genCatalog :: Int -> Gen Catalog
genCatalog n =
  Catalog
    <$> arbitraryReducedMaybe n -- catalogCreatedAt :: Maybe DateTime
    <*> arbitrary -- catalogId :: Text
    <*> arbitraryReducedMaybe n -- catalogUpdatedAt :: Maybe DateTime
    <*> arbitrary -- catalogName :: Text
    <*> arbitraryReduced n -- catalogCatalogType :: CatalogsType
  
instance Arbitrary CatalogProductGroup where
  arbitrary = sized genCatalogProductGroup

genCatalogProductGroup :: Int -> Gen CatalogProductGroup
genCatalogProductGroup n =
  CatalogProductGroup
    <$> arbitraryReducedMaybe n -- catalogProductGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogProductGroupMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- catalogProductGroupFilters :: Maybe A.Value
    <*> arbitraryReducedMaybeValue n -- catalogProductGroupFilterV2 :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- catalogProductGroupType :: Maybe Board
    <*> arbitraryReducedMaybe n -- catalogProductGroupStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- catalogProductGroupFeedProfileId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogProductGroupLastUpdate :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogProductGroupProductCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogProductGroupFeaturedPosition :: Maybe Int
  
instance Arbitrary CatalogsCreateHotelItem where
  arbitrary = sized genCatalogsCreateHotelItem

genCatalogsCreateHotelItem :: Int -> Gen CatalogsCreateHotelItem
genCatalogsCreateHotelItem n =
  CatalogsCreateHotelItem
    <$> arbitrary -- catalogsCreateHotelItemHotelId :: Text
    <*> arbitrary -- catalogsCreateHotelItemOperation :: E'Operation3
    <*> arbitraryReduced n -- catalogsCreateHotelItemAttributes :: CatalogsHotelAttributes
  
instance Arbitrary CatalogsCreateRetailItem where
  arbitrary = sized genCatalogsCreateRetailItem

genCatalogsCreateRetailItem :: Int -> Gen CatalogsCreateRetailItem
genCatalogsCreateRetailItem n =
  CatalogsCreateRetailItem
    <$> arbitrary -- catalogsCreateRetailItemItemId :: Text
    <*> arbitrary -- catalogsCreateRetailItemOperation :: E'Operation2
    <*> arbitraryReduced n -- catalogsCreateRetailItemAttributes :: ItemAttributes
  
instance Arbitrary CatalogsDbItem where
  arbitrary = sized genCatalogsDbItem

genCatalogsDbItem :: Int -> Gen CatalogsDbItem
genCatalogsDbItem n =
  CatalogsDbItem
    <$> arbitraryReducedMaybe n -- catalogsDbItemCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsDbItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsDbItemUpdatedAt :: Maybe DateTime
  
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
    <*> arbitrary -- catalogsDeleteRetailItemOperation :: E'Operation2
  
instance Arbitrary CatalogsFeed where
  arbitrary = sized genCatalogsFeed

genCatalogsFeed :: Int -> Gen CatalogsFeed
genCatalogsFeed n =
  CatalogsFeed
    <$> arbitraryReducedMaybe n -- catalogsFeedCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsFeedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsFeedUpdatedAt :: Maybe DateTime
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
    <$> arbitraryReducedMaybe n -- catalogsFeedProcessingResultCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsFeedProcessingResultId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsFeedProcessingResultUpdatedAt :: Maybe DateTime
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
    <$> arbitraryReduced n -- catalogsHotelBatchRequestCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsHotelBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsHotelBatchRequestLanguage :: Language
    <*> arbitraryReduced n -- catalogsHotelBatchRequestItems :: [CatalogsHotelBatchItem]
    <*> arbitraryReducedMaybe n -- catalogsHotelBatchRequestCatalogId :: Maybe Text
  
instance Arbitrary CatalogsHotelFeed where
  arbitrary = sized genCatalogsHotelFeed

genCatalogsHotelFeed :: Int -> Gen CatalogsHotelFeed
genCatalogsHotelFeed n =
  CatalogsHotelFeed
    <$> arbitraryReducedMaybe n -- catalogsHotelFeedCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedUpdatedAt :: Maybe DateTime
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
    <$> arbitrary -- catalogsHotelItemsFilterCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsHotelItemsFilterHotelIds :: [Text]
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsFilterCatalogId :: Maybe Text
  
instance Arbitrary CatalogsHotelProductGroup where
  arbitrary = sized genCatalogsHotelProductGroup

genCatalogsHotelProductGroup :: Int -> Gen CatalogsHotelProductGroup
genCatalogsHotelProductGroup n =
  CatalogsHotelProductGroup
    <$> arbitrary -- catalogsHotelProductGroupCatalogType :: E'CatalogType2
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
    <$> arbitrary -- catalogsHotelProductGroupCreateRequestCatalogType :: E'CatalogType2
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
  
instance Arbitrary CatalogsHotelProductGroupUpdateRequest where
  arbitrary = sized genCatalogsHotelProductGroupUpdateRequest

genCatalogsHotelProductGroupUpdateRequest :: Int -> Gen CatalogsHotelProductGroupUpdateRequest
genCatalogsHotelProductGroupUpdateRequest n =
  CatalogsHotelProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestCatalogType :: Maybe E'CatalogType2
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestFilters :: Maybe CatalogsHotelProductGroupFilters
  
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
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchItems :: Maybe [HotelProcessingRecord]
  
instance Arbitrary CatalogsItemsBatchRequest where
  arbitrary = sized genCatalogsItemsBatchRequest

genCatalogsItemsBatchRequest :: Int -> Gen CatalogsItemsBatchRequest
genCatalogsItemsBatchRequest n =
  CatalogsItemsBatchRequest
    <$> arbitraryReduced n -- catalogsItemsBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsBatchRequestLanguage :: Language
    <*> arbitraryReduced n -- catalogsItemsBatchRequestOperation :: BatchOperation
    <*> arbitraryReduced n -- catalogsItemsBatchRequestItems :: [ItemDeleteBatchRecord]
  
instance Arbitrary CatalogsItemsCreateBatchRequest where
  arbitrary = sized genCatalogsItemsCreateBatchRequest

genCatalogsItemsCreateBatchRequest :: Int -> Gen CatalogsItemsCreateBatchRequest
genCatalogsItemsCreateBatchRequest n =
  CatalogsItemsCreateBatchRequest
    <$> arbitraryReduced n -- catalogsItemsCreateBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsCreateBatchRequestLanguage :: Language
    <*> arbitraryReduced n -- catalogsItemsCreateBatchRequestOperation :: BatchOperation
    <*> arbitraryReduced n -- catalogsItemsCreateBatchRequestItems :: [ItemCreateBatchRecord]
  
instance Arbitrary CatalogsItemsDeleteBatchRequest where
  arbitrary = sized genCatalogsItemsDeleteBatchRequest

genCatalogsItemsDeleteBatchRequest :: Int -> Gen CatalogsItemsDeleteBatchRequest
genCatalogsItemsDeleteBatchRequest n =
  CatalogsItemsDeleteBatchRequest
    <$> arbitraryReduced n -- catalogsItemsDeleteBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsDeleteBatchRequestLanguage :: Language
    <*> arbitraryReduced n -- catalogsItemsDeleteBatchRequestOperation :: BatchOperation
    <*> arbitraryReduced n -- catalogsItemsDeleteBatchRequestItems :: [ItemDeleteBatchRecord]
  
instance Arbitrary CatalogsItemsDeleteDiscontinuedBatchRequest where
  arbitrary = sized genCatalogsItemsDeleteDiscontinuedBatchRequest

genCatalogsItemsDeleteDiscontinuedBatchRequest :: Int -> Gen CatalogsItemsDeleteDiscontinuedBatchRequest
genCatalogsItemsDeleteDiscontinuedBatchRequest n =
  CatalogsItemsDeleteDiscontinuedBatchRequest
    <$> arbitraryReduced n -- catalogsItemsDeleteDiscontinuedBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsDeleteDiscontinuedBatchRequestLanguage :: Language
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
  
instance Arbitrary CatalogsItemsUpdateBatchRequest where
  arbitrary = sized genCatalogsItemsUpdateBatchRequest

genCatalogsItemsUpdateBatchRequest :: Int -> Gen CatalogsItemsUpdateBatchRequest
genCatalogsItemsUpdateBatchRequest n =
  CatalogsItemsUpdateBatchRequest
    <$> arbitraryReduced n -- catalogsItemsUpdateBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsUpdateBatchRequestLanguage :: Language
    <*> arbitraryReduced n -- catalogsItemsUpdateBatchRequestOperation :: BatchOperation
    <*> arbitraryReduced n -- catalogsItemsUpdateBatchRequestItems :: [ItemUpdateBatchRecord]
  
instance Arbitrary CatalogsItemsUpsertBatchRequest where
  arbitrary = sized genCatalogsItemsUpsertBatchRequest

genCatalogsItemsUpsertBatchRequest :: Int -> Gen CatalogsItemsUpsertBatchRequest
genCatalogsItemsUpsertBatchRequest n =
  CatalogsItemsUpsertBatchRequest
    <$> arbitraryReduced n -- catalogsItemsUpsertBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsUpsertBatchRequestLanguage :: Language
    <*> arbitraryReduced n -- catalogsItemsUpsertBatchRequestOperation :: BatchOperation
    <*> arbitraryReduced n -- catalogsItemsUpsertBatchRequestItems :: [ItemUpsertBatchRecord]
  
instance Arbitrary CatalogsList200Response where
  arbitrary = sized genCatalogsList200Response

genCatalogsList200Response :: Int -> Gen CatalogsList200Response
genCatalogsList200Response n =
  CatalogsList200Response
    <$> arbitraryReduced n -- catalogsList200ResponseItems :: [Catalog]
    <*> arbitraryReducedMaybe n -- catalogsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary CatalogsListProductsByFilterRequest where
  arbitrary = sized genCatalogsListProductsByFilterRequest

genCatalogsListProductsByFilterRequest :: Int -> Gen CatalogsListProductsByFilterRequest
genCatalogsListProductsByFilterRequest n =
  CatalogsListProductsByFilterRequest
    <$> arbitrary -- catalogsListProductsByFilterRequestFeedId :: Text
    <*> arbitraryReduced n -- catalogsListProductsByFilterRequestFilters :: CatalogsProductGroupFilters
  
instance Arbitrary CatalogsListProductsByFilterRequestOneOf where
  arbitrary = sized genCatalogsListProductsByFilterRequestOneOf

genCatalogsListProductsByFilterRequestOneOf :: Int -> Gen CatalogsListProductsByFilterRequestOneOf
genCatalogsListProductsByFilterRequestOneOf n =
  CatalogsListProductsByFilterRequestOneOf
    <$> arbitrary -- catalogsListProductsByFilterRequestOneOfFeedId :: Text
    <*> arbitraryReduced n -- catalogsListProductsByFilterRequestOneOfFilters :: CatalogsProductGroupFilters
  
instance Arbitrary CatalogsProduct where
  arbitrary = sized genCatalogsProduct

genCatalogsProduct :: Int -> Gen CatalogsProduct
genCatalogsProduct n =
  CatalogsProduct
    <$> arbitraryReduced n -- catalogsProductMetadata :: CatalogsProductMetadata
    <*> arbitraryReduced n -- catalogsProductPin :: Pin
  
instance Arbitrary CatalogsProductGroup where
  arbitrary = sized genCatalogsProductGroup

genCatalogsProductGroup :: Int -> Gen CatalogsProductGroup
genCatalogsProductGroup n =
  CatalogsProductGroup
    <$> arbitrary -- catalogsProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsProductGroupFilters :: CatalogsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsProductGroupIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupType :: Maybe CatalogsProductGroupType
    <*> arbitraryReducedMaybe n -- catalogsProductGroupStatus :: Maybe CatalogsProductGroupStatus
    <*> arbitraryReducedMaybe n -- catalogsProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdatedAt :: Maybe Int
    <*> arbitrary -- catalogsProductGroupFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupCatalogType :: Maybe E'CatalogType
  
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
  
instance Arbitrary CatalogsProductGroupProductCounts where
  arbitrary = sized genCatalogsProductGroupProductCounts

genCatalogsProductGroupProductCounts :: Int -> Gen CatalogsProductGroupProductCounts
genCatalogsProductGroupProductCounts n =
  CatalogsProductGroupProductCounts
    <$> arbitrary -- catalogsProductGroupProductCountsInStock :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsOutOfStock :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsPreorder :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsTotal :: Double
  
instance Arbitrary CatalogsProductGroupUpdateRequest where
  arbitrary = sized genCatalogsProductGroupUpdateRequest

genCatalogsProductGroupUpdateRequest :: Int -> Gen CatalogsProductGroupUpdateRequest
genCatalogsProductGroupUpdateRequest n =
  CatalogsProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestFilters :: Maybe CatalogsProductGroupFiltersRequest
  
instance Arbitrary CatalogsProductGroupsCreate201Response where
  arbitrary = sized genCatalogsProductGroupsCreate201Response

genCatalogsProductGroupsCreate201Response :: Int -> Gen CatalogsProductGroupsCreate201Response
genCatalogsProductGroupsCreate201Response n =
  CatalogsProductGroupsCreate201Response
    <$> arbitrary -- catalogsProductGroupsCreate201ResponseId :: Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreate201ResponseName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreate201ResponseDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsProductGroupsCreate201ResponseFilters :: CatalogsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreate201ResponseIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreate201ResponseType :: Maybe CatalogsProductGroupType
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreate201ResponseStatus :: Maybe CatalogsProductGroupStatus
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreate201ResponseCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreate201ResponseUpdatedAt :: Maybe Int
    <*> arbitrary -- catalogsProductGroupsCreate201ResponseFeedId :: E'FeedId
    <*> arbitrary -- catalogsProductGroupsCreate201ResponseCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsProductGroupsCreate201ResponseCatalogId :: Text
  
instance Arbitrary CatalogsProductGroupsCreateRequest where
  arbitrary = sized genCatalogsProductGroupsCreateRequest

genCatalogsProductGroupsCreateRequest :: Int -> Gen CatalogsProductGroupsCreateRequest
genCatalogsProductGroupsCreateRequest n =
  CatalogsProductGroupsCreateRequest
    <$> arbitrary -- catalogsProductGroupsCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreateRequestIsFeatured :: Maybe Bool
    <*> arbitraryReduced n -- catalogsProductGroupsCreateRequestFilters :: CatalogsHotelProductGroupFilters
    <*> arbitrary -- catalogsProductGroupsCreateRequestFeedId :: Text
    <*> arbitrary -- catalogsProductGroupsCreateRequestCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsProductGroupsCreateRequestCatalogId :: Text
  
instance Arbitrary CatalogsProductGroupsList200Response where
  arbitrary = sized genCatalogsProductGroupsList200Response

genCatalogsProductGroupsList200Response :: Int -> Gen CatalogsProductGroupsList200Response
genCatalogsProductGroupsList200Response n =
  CatalogsProductGroupsList200Response
    <$> arbitraryReduced n -- catalogsProductGroupsList200ResponseItems :: [CatalogsProductGroupsList200ResponseAllOfItemsInner]
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsList200ResponseBookmark :: Maybe Text
  
instance Arbitrary CatalogsProductGroupsList200ResponseAllOfItemsInner where
  arbitrary = sized genCatalogsProductGroupsList200ResponseAllOfItemsInner

genCatalogsProductGroupsList200ResponseAllOfItemsInner :: Int -> Gen CatalogsProductGroupsList200ResponseAllOfItemsInner
genCatalogsProductGroupsList200ResponseAllOfItemsInner n =
  CatalogsProductGroupsList200ResponseAllOfItemsInner
    <$> arbitrary -- catalogsProductGroupsList200ResponseAllOfItemsInnerId :: Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsList200ResponseAllOfItemsInnerName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsList200ResponseAllOfItemsInnerDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsProductGroupsList200ResponseAllOfItemsInnerFilters :: CatalogsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsList200ResponseAllOfItemsInnerIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsList200ResponseAllOfItemsInnerType :: Maybe CatalogsProductGroupType
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsList200ResponseAllOfItemsInnerStatus :: Maybe CatalogsProductGroupStatus
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsList200ResponseAllOfItemsInnerCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsList200ResponseAllOfItemsInnerUpdatedAt :: Maybe Int
    <*> arbitrary -- catalogsProductGroupsList200ResponseAllOfItemsInnerFeedId :: E'FeedId
    <*> arbitrary -- catalogsProductGroupsList200ResponseAllOfItemsInnerCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsProductGroupsList200ResponseAllOfItemsInnerCatalogId :: Text
  
instance Arbitrary CatalogsProductGroupsUpdateRequest where
  arbitrary = sized genCatalogsProductGroupsUpdateRequest

genCatalogsProductGroupsUpdateRequest :: Int -> Gen CatalogsProductGroupsUpdateRequest
genCatalogsProductGroupsUpdateRequest n =
  CatalogsProductGroupsUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestFilters :: Maybe CatalogsHotelProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestCatalogType :: Maybe E'CatalogType2
  
instance Arbitrary CatalogsProductMetadata where
  arbitrary = sized genCatalogsProductMetadata

genCatalogsProductMetadata :: Int -> Gen CatalogsProductMetadata
genCatalogsProductMetadata n =
  CatalogsProductMetadata
    <$> arbitrary -- catalogsProductMetadataItemId :: Text
    <*> arbitrary -- catalogsProductMetadataItemGroupId :: Text
    <*> arbitraryReduced n -- catalogsProductMetadataAvailability :: NonNullableProductAvailabilityType
    <*> arbitrary -- catalogsProductMetadataPrice :: Double
    <*> arbitrary -- catalogsProductMetadataSalePrice :: Double
    <*> arbitraryReduced n -- catalogsProductMetadataCurrency :: NonNullableCatalogsCurrency
  
instance Arbitrary CatalogsRetailBatchRequest where
  arbitrary = sized genCatalogsRetailBatchRequest

genCatalogsRetailBatchRequest :: Int -> Gen CatalogsRetailBatchRequest
genCatalogsRetailBatchRequest n =
  CatalogsRetailBatchRequest
    <$> arbitraryReduced n -- catalogsRetailBatchRequestCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsRetailBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsRetailBatchRequestLanguage :: Language
    <*> arbitraryReduced n -- catalogsRetailBatchRequestItems :: [CatalogsRetailBatchRequestItemsInner]
  
instance Arbitrary CatalogsRetailBatchRequestItemsInner where
  arbitrary = sized genCatalogsRetailBatchRequestItemsInner

genCatalogsRetailBatchRequestItemsInner :: Int -> Gen CatalogsRetailBatchRequestItemsInner
genCatalogsRetailBatchRequestItemsInner n =
  CatalogsRetailBatchRequestItemsInner
    <$> arbitrary -- catalogsRetailBatchRequestItemsInnerItemId :: Text
    <*> arbitrary -- catalogsRetailBatchRequestItemsInnerOperation :: E'Operation2
    <*> arbitraryReduced n -- catalogsRetailBatchRequestItemsInnerAttributes :: ItemAttributes
    <*> arbitraryReducedMaybe n -- catalogsRetailBatchRequestItemsInnerUpdateMask :: Maybe [UpdateMaskFieldType]
  
instance Arbitrary CatalogsRetailFeed where
  arbitrary = sized genCatalogsRetailFeed

genCatalogsRetailFeed :: Int -> Gen CatalogsRetailFeed
genCatalogsRetailFeed n =
  CatalogsRetailFeed
    <$> arbitraryReducedMaybe n -- catalogsRetailFeedCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedUpdatedAt :: Maybe DateTime
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
    <$> arbitrary -- catalogsRetailItemsFilterCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsRetailItemsFilterItemIds :: [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsFilterCatalogId :: Maybe Text
  
instance Arbitrary CatalogsRetailProductGroup where
  arbitrary = sized genCatalogsRetailProductGroup

genCatalogsRetailProductGroup :: Int -> Gen CatalogsRetailProductGroup
genCatalogsRetailProductGroup n =
  CatalogsRetailProductGroup
    <$> arbitrary -- catalogsRetailProductGroupCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsRetailProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsRetailProductGroupFilters :: CatalogsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupType :: Maybe CatalogsProductGroupType
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupStatus :: Maybe CatalogsProductGroupStatus
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdatedAt :: Maybe Int
    <*> arbitrary -- catalogsRetailProductGroupFeedId :: E'FeedId
  
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
  
instance Arbitrary CatalogsUpdateHotelItem where
  arbitrary = sized genCatalogsUpdateHotelItem

genCatalogsUpdateHotelItem :: Int -> Gen CatalogsUpdateHotelItem
genCatalogsUpdateHotelItem n =
  CatalogsUpdateHotelItem
    <$> arbitrary -- catalogsUpdateHotelItemHotelId :: Text
    <*> arbitrary -- catalogsUpdateHotelItemOperation :: E'Operation4
    <*> arbitraryReduced n -- catalogsUpdateHotelItemAttributes :: CatalogsUpdatableHotelAttributes
  
instance Arbitrary CatalogsUpdateRetailItem where
  arbitrary = sized genCatalogsUpdateRetailItem

genCatalogsUpdateRetailItem :: Int -> Gen CatalogsUpdateRetailItem
genCatalogsUpdateRetailItem n =
  CatalogsUpdateRetailItem
    <$> arbitrary -- catalogsUpdateRetailItemItemId :: Text
    <*> arbitrary -- catalogsUpdateRetailItemOperation :: E'Operation2
    <*> arbitraryReduced n -- catalogsUpdateRetailItemAttributes :: UpdatableItemAttributes
    <*> arbitraryReducedMaybe n -- catalogsUpdateRetailItemUpdateMask :: Maybe [UpdateMaskFieldType]
  
instance Arbitrary CatalogsUpsertHotelItem where
  arbitrary = sized genCatalogsUpsertHotelItem

genCatalogsUpsertHotelItem :: Int -> Gen CatalogsUpsertHotelItem
genCatalogsUpsertHotelItem n =
  CatalogsUpsertHotelItem
    <$> arbitrary -- catalogsUpsertHotelItemHotelId :: Text
    <*> arbitrary -- catalogsUpsertHotelItemOperation :: E'Operation5
    <*> arbitraryReduced n -- catalogsUpsertHotelItemAttributes :: CatalogsHotelAttributes
  
instance Arbitrary CatalogsUpsertRetailItem where
  arbitrary = sized genCatalogsUpsertRetailItem

genCatalogsUpsertRetailItem :: Int -> Gen CatalogsUpsertRetailItem
genCatalogsUpsertRetailItem n =
  CatalogsUpsertRetailItem
    <$> arbitrary -- catalogsUpsertRetailItemItemId :: Text
    <*> arbitrary -- catalogsUpsertRetailItemOperation :: E'Operation2
    <*> arbitraryReduced n -- catalogsUpsertRetailItemAttributes :: ItemAttributes
  
instance Arbitrary CatalogsVerticalBatchRequest where
  arbitrary = sized genCatalogsVerticalBatchRequest

genCatalogsVerticalBatchRequest :: Int -> Gen CatalogsVerticalBatchRequest
genCatalogsVerticalBatchRequest n =
  CatalogsVerticalBatchRequest
    <$> arbitraryReduced n -- catalogsVerticalBatchRequestCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogsVerticalBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsVerticalBatchRequestLanguage :: Language
    <*> arbitraryReduced n -- catalogsVerticalBatchRequestItems :: [CatalogsHotelBatchItem]
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
    <$> arbitrary -- catalogsVerticalProductGroupCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsVerticalProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsVerticalProductGroupFilters :: CatalogsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupCreatedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdatedAt :: Maybe Int
    <*> arbitrary -- catalogsVerticalProductGroupCatalogId :: Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupType :: Maybe CatalogsProductGroupType
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupStatus :: Maybe CatalogsProductGroupStatus
    <*> arbitrary -- catalogsVerticalProductGroupFeedId :: E'FeedId
  
instance Arbitrary CatalogsVerticalProductGroupCreateRequest where
  arbitrary = sized genCatalogsVerticalProductGroupCreateRequest

genCatalogsVerticalProductGroupCreateRequest :: Int -> Gen CatalogsVerticalProductGroupCreateRequest
genCatalogsVerticalProductGroupCreateRequest n =
  CatalogsVerticalProductGroupCreateRequest
    <$> arbitrary -- catalogsVerticalProductGroupCreateRequestCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsVerticalProductGroupCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsVerticalProductGroupCreateRequestFilters :: CatalogsHotelProductGroupFilters
    <*> arbitrary -- catalogsVerticalProductGroupCreateRequestCatalogId :: Text
  
instance Arbitrary CatalogsVerticalProductGroupUpdateRequest where
  arbitrary = sized genCatalogsVerticalProductGroupUpdateRequest

genCatalogsVerticalProductGroupUpdateRequest :: Int -> Gen CatalogsVerticalProductGroupUpdateRequest
genCatalogsVerticalProductGroupUpdateRequest n =
  CatalogsVerticalProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestCatalogType :: Maybe E'CatalogType2
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestFilters :: Maybe CatalogsHotelProductGroupFilters
  
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
    <$> arbitrary -- conversionApiResponseEventsInnerStatus :: E'Status3
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
    <$> arbitraryReducedMaybe n -- getMMMReportResponseDataReportStatus :: Maybe E'ReportStatus
    <*> arbitraryReducedMaybe n -- getMMMReportResponseDataUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- getMMMReportResponseDataSize :: Maybe Double
  
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
  
instance Arbitrary ItemBatchRecord where
  arbitrary = sized genItemBatchRecord

genItemBatchRecord :: Int -> Gen ItemBatchRecord
genItemBatchRecord n =
  ItemBatchRecord
    <$> arbitraryReducedMaybe n -- itemBatchRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemBatchRecordAttributes :: Maybe ItemAttributes
    <*> arbitraryReducedMaybe n -- itemBatchRecordUpdateMask :: Maybe [UpdateMaskFieldType]
  
instance Arbitrary ItemCreateBatchRecord where
  arbitrary = sized genItemCreateBatchRecord

genItemCreateBatchRecord :: Int -> Gen ItemCreateBatchRecord
genItemCreateBatchRecord n =
  ItemCreateBatchRecord
    <$> arbitraryReducedMaybe n -- itemCreateBatchRecordItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemCreateBatchRecordAttributes :: Maybe ItemAttributes
  
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
    <*> arbitraryReducedMaybe n -- itemResponseAttributes :: Maybe CatalogsHotelAttributes
    <*> arbitraryReducedMaybe n -- itemResponseHotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseErrors :: Maybe [ItemValidationEvent]
  
instance Arbitrary ItemResponseAnyOf where
  arbitrary = sized genItemResponseAnyOf

genItemResponseAnyOf :: Int -> Gen ItemResponseAnyOf
genItemResponseAnyOf n =
  ItemResponseAnyOf
    <$> arbitraryReduced n -- itemResponseAnyOfCatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- itemResponseAnyOfItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseAnyOfPins :: Maybe [Pin]
    <*> arbitraryReducedMaybe n -- itemResponseAnyOfAttributes :: Maybe CatalogsHotelAttributes
    <*> arbitraryReducedMaybe n -- itemResponseAnyOfHotelId :: Maybe Text
  
instance Arbitrary ItemResponseAnyOf1 where
  arbitrary = sized genItemResponseAnyOf1

genItemResponseAnyOf1 :: Int -> Gen ItemResponseAnyOf1
genItemResponseAnyOf1 n =
  ItemResponseAnyOf1
    <$> arbitraryReduced n -- itemResponseAnyOf1CatalogType :: CatalogsType
    <*> arbitraryReducedMaybe n -- itemResponseAnyOf1ItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseAnyOf1Errors :: Maybe [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- itemResponseAnyOf1HotelId :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- itemUpsertBatchRecordAttributes :: Maybe ItemAttributes
  
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
    <$> arbitraryReduced n -- itemsBatchPostRequestCatalogType :: CatalogsType
    <*> arbitraryReduced n -- itemsBatchPostRequestCountry :: Country
    <*> arbitraryReduced n -- itemsBatchPostRequestLanguage :: Language
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
    <$> arbitraryReducedMaybe n -- keywordArchived :: Maybe Bool
    <*> arbitraryReducedMaybe n -- keywordId :: Maybe Text
    <*> arbitraryReducedMaybe n -- keywordParentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- keywordParentType :: Maybe Text
    <*> arbitraryReducedMaybe n -- keywordType :: Maybe Text
    <*> arbitraryReducedMaybe n -- keywordBid :: Maybe Int
    <*> arbitraryReduced n -- keywordMatchType :: MatchTypeResponse
    <*> arbitrary -- keywordValue :: Text
  
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
  
instance Arbitrary LeadFormsList200Response where
  arbitrary = sized genLeadFormsList200Response

genLeadFormsList200Response :: Int -> Gen LeadFormsList200Response
genLeadFormsList200Response n =
  LeadFormsList200Response
    <$> arbitraryReduced n -- leadFormsList200ResponseItems :: [LeadFormResponse]
    <*> arbitraryReducedMaybe n -- leadFormsList200ResponseBookmark :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- pinMedia :: Maybe SummaryPinMedia
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
    <*> arbitraryReducedMaybe n -- pinCreateMedia :: Maybe SummaryPinMedia
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
    <*> arbitraryReducedMaybe n -- pinMediaWithImageImages :: Maybe ImageMetadataImages
  
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
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoImages :: Maybe ImageMetadataImages
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
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- productGroupPromotionCollectionsHeroPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCollectionsHeroDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionGridClickType :: Maybe GridClickType
  
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
    <$> arbitraryReduced n -- productGroupPromotionsList200ResponseItems :: [ProductGroupPromotionResponseItem]
    <*> arbitraryReducedMaybe n -- productGroupPromotionsList200ResponseBookmark :: Maybe Text
  
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
    <$> arbitraryReducedMaybe n -- summaryPinMedia :: Maybe SummaryPinMedia
    <*> arbitraryReducedMaybe n -- summaryPinAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinDescription :: Maybe Text
  
instance Arbitrary SummaryPinMedia where
  arbitrary = sized genSummaryPinMedia

genSummaryPinMedia :: Int -> Gen SummaryPinMedia
genSummaryPinMedia n =
  SummaryPinMedia
    <$> arbitraryReducedMaybe n -- summaryPinMediaMediaType :: Maybe Text
  
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
  
instance Arbitrary UserAccountFollowedInterests200Response where
  arbitrary = sized genUserAccountFollowedInterests200Response

genUserAccountFollowedInterests200Response :: Int -> Gen UserAccountFollowedInterests200Response
genUserAccountFollowedInterests200Response n =
  UserAccountFollowedInterests200Response
    <$> arbitraryReduced n -- userAccountFollowedInterests200ResponseItems :: [Interest]
    <*> arbitraryReducedMaybe n -- userAccountFollowedInterests200ResponseBookmark :: Maybe Text
  
instance Arbitrary UserFollowingGet200Response where
  arbitrary = sized genUserFollowingGet200Response

genUserFollowingGet200Response :: Int -> Gen UserFollowingGet200Response
genUserFollowingGet200Response n =
  UserFollowingGet200Response
    <$> arbitraryReduced n -- userFollowingGet200ResponseItems :: [UserSummary]
    <*> arbitraryReducedMaybe n -- userFollowingGet200ResponseBookmark :: Maybe Text
  
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

instance Arbitrary AdsAnalyticsFilterColumn where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsFilterOperator where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsTargetingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceDataParty where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceInsightType where
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

instance Arbitrary E'AgeBucket where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Ages where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AppTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Apptype where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'BidStrategyType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CardType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CatalogType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CatalogType2 where
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

instance Arbitrary E'FeedId where
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

instance Arbitrary E'Operation5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Operator where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Order where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OrderLineType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'OwnershipType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PaymentMethodBrand where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PinFilter where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PinFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PinType where
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

instance Arbitrary E'ReportType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReviewStatus where
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

instance Arbitrary E'TargetingStrategy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'TargetingType where
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

instance Arbitrary Granularity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GridClickType where
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

instance Arbitrary MMMReportingColumn where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MMMReportingTargetingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MatchType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MatchTypeResponse where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MediaUploadStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MediaUploadType where
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

instance Arbitrary OrderLinePaidType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderLineStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PacingDeliveryType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PartnerType where
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

instance Arbitrary TrendType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TrendsSupportedRegion where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UpdateMaskFieldType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UserFollowingFeedType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UserListOperationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UserListType where
  arbitrary = arbitraryBoundedEnum

