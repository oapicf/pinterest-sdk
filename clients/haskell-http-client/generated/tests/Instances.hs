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
    <*> arbitraryReducedMaybe n -- accountAccountType :: Maybe UserAccountType
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
  
instance Arbitrary AccountTemplate where
  arbitrary = sized genAccountTemplate

genAccountTemplate :: Int -> Gen AccountTemplate
genAccountTemplate n =
  AccountTemplate
    <$> arbitraryReducedMaybe n -- accountTemplateAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountTemplateAdAccountIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- accountTemplateAdeColumns :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- accountTemplateAttributionType :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- accountTemplateClickWindowDays :: Maybe Double
    <*> arbitraryReducedMaybe n -- accountTemplateColumns :: Maybe [ReportingColumn]
    <*> arbitraryReducedMaybe n -- accountTemplateConversionReportTimeType :: Maybe ConversionReportTimeType
    <*> arbitraryReducedMaybe n -- accountTemplateCreationSource :: Maybe CreationSource
    <*> arbitraryReducedMaybe n -- accountTemplateCustomColumnIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- accountTemplateDisplayMetadata :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountTemplateEngagementWindowDays :: Maybe Double
    <*> arbitraryReducedMaybe n -- accountTemplateFiltersJson :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountTemplateGranularity :: Maybe Granularity
    <*> arbitrary -- accountTemplateId :: Text
    <*> arbitraryReducedMaybe n -- accountTemplateIngestionSources :: Maybe [IngestionSource]
    <*> arbitraryReducedMaybe n -- accountTemplateIsDefault :: Maybe Bool
    <*> arbitraryReducedMaybe n -- accountTemplateIsDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- accountTemplateIsOwnedByUser :: Maybe Bool
    <*> arbitraryReducedMaybe n -- accountTemplateIsScheduled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- accountTemplateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountTemplateReportEndRelativeDaysInPast :: Maybe Double
    <*> arbitraryReducedMaybe n -- accountTemplateReportFormat :: Maybe DataOutputFormat
    <*> arbitraryReducedMaybe n -- accountTemplateReportLevel :: Maybe MetricsReportingLevel
    <*> arbitraryReducedMaybe n -- accountTemplateReportStartRelativeDaysInPast :: Maybe Double
    <*> arbitraryReducedMaybe n -- accountTemplateReportingTimeZone :: Maybe ReportingTimeZone
    <*> arbitraryReducedMaybe n -- accountTemplateSortBy :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- accountTemplateType :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountTemplateUpdatedTime :: Maybe Double
    <*> arbitraryReducedMaybe n -- accountTemplateUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- accountTemplateViewWindowDays :: Maybe Double
  
instance Arbitrary Ad where
  arbitrary = sized genAd

genAd :: Int -> Gen Ad
genAd n =
  Ad
    <$> arbitrary -- adAdAccountId :: Text
    <*> arbitrary -- adAdGroupId :: Text
    <*> arbitraryReducedMaybe n -- adAndroidDeepLink :: Maybe Text
    <*> arbitrary -- adCampaignId :: Text
    <*> arbitraryReducedMaybe n -- adCarouselAndroidDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCarouselDestinationUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCarouselIosDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCartingPlatformType :: Maybe Int
    <*> arbitraryReducedMaybe n -- adCartingProducts :: Maybe [CartingProduct]
    <*> arbitraryReducedMaybe n -- adClickTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCollectionItemsDestinationUrlTemplate :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCollectionsHeaderType :: Maybe AdCollectionsHeaderType
    <*> arbitraryReducedMaybe n -- adCreatedTime :: Maybe Int
    <*> arbitraryReduced n -- adCreativeType :: CreativeType
    <*> arbitraryReducedMaybe n -- adCustomizableCtaType :: Maybe CustomizableCTAType
    <*> arbitraryReducedMaybe n -- adDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adDisclosureType :: Maybe DisclosureType
    <*> arbitraryReducedMaybe n -- adDisclosureUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGridClickType :: Maybe GridClickType
    <*> arbitrary -- adId :: Text
    <*> arbitraryReducedMaybe n -- adIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adIsCarting :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adIsCollageAcceptedTerms :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adIsCollageSingleDestination :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adName :: Maybe Text
    <*> arbitrary -- adPinId :: Text
    <*> arbitraryReducedMaybe n -- adQuizPinData :: Maybe QuizPinData
    <*> arbitraryReduced n -- adRejectedReasons :: [AdDisapprovalReasons]
    <*> arbitrary -- adRejectionLabels :: [Text]
    <*> arbitraryReduced n -- adReviewStatus :: AdReviewStatus
    <*> arbitraryReducedMaybe n -- adStatus :: Maybe EntityStatus
    <*> arbitraryReduced n -- adSummaryStatus :: PinPromotionSummaryStatus
    <*> arbitraryReducedMaybe n -- adTrackingUrls :: Maybe TrackingUrls
    <*> arbitrary -- adType :: Text
    <*> arbitraryReducedMaybe n -- adUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adViewTrackingUrl :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- adAccountTimeZone :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountUpdatedTime :: Maybe Int
  
instance Arbitrary AdAccountAnalyticsItems where
  arbitrary = sized genAdAccountAnalyticsItems

genAdAccountAnalyticsItems :: Int -> Gen AdAccountAnalyticsItems
genAdAccountAnalyticsItems n =
  AdAccountAnalyticsItems
    <$> arbitrary -- adAccountAnalyticsItemsAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- adAccountAnalyticsItemsDate :: Maybe Date
  
instance Arbitrary AdAccountCountriesGet200Response where
  arbitrary = sized genAdAccountCountriesGet200Response

genAdAccountCountriesGet200Response :: Int -> Gen AdAccountCountriesGet200Response
genAdAccountCountriesGet200Response n =
  AdAccountCountriesGet200Response
    <$> arbitraryReduced n -- adAccountCountriesGet200ResponseItems :: [AdAccountsCountry]
  
instance Arbitrary AdAccountCreate where
  arbitrary = sized genAdAccountCreate

genAdAccountCreate :: Int -> Gen AdAccountCreate
genAdAccountCreate n =
  AdAccountCreate
    <$> arbitraryReducedMaybe n -- adAccountCreateCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- adAccountCreateCurrency :: Maybe Currency
    <*> arbitraryReducedMaybe n -- adAccountCreateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateOwnerUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountCreateTimeZone :: Maybe Text
  
instance Arbitrary AdAccountOwner where
  arbitrary = sized genAdAccountOwner

genAdAccountOwner :: Int -> Gen AdAccountOwner
genAdAccountOwner n =
  AdAccountOwner
    <$> arbitraryReducedMaybe n -- adAccountOwnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountOwnerUsername :: Maybe Text
  
instance Arbitrary AdAccountToAdAccountSharedAudience where
  arbitrary = sized genAdAccountToAdAccountSharedAudience

genAdAccountToAdAccountSharedAudience :: Int -> Gen AdAccountToAdAccountSharedAudience
genAdAccountToAdAccountSharedAudience n =
  AdAccountToAdAccountSharedAudience
    <$> arbitrary -- adAccountToAdAccountSharedAudienceAudienceId :: Text
    <*> arbitraryReducedMaybe n -- adAccountToAdAccountSharedAudiencePermissions :: Maybe [Role]
    <*> arbitrary -- adAccountToAdAccountSharedAudienceRecipientAccountIds :: [Text]
  
instance Arbitrary AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody where
  arbitrary = sized genAdAccountToAdAccountSharedAudienceUpdateWithRequiredBody

genAdAccountToAdAccountSharedAudienceUpdateWithRequiredBody :: Int -> Gen AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
genAdAccountToAdAccountSharedAudienceUpdateWithRequiredBody n =
  AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
    <$> arbitrary -- adAccountToAdAccountSharedAudienceUpdateWithRequiredBodyAudienceId :: Text
    <*> arbitraryReduced n -- adAccountToAdAccountSharedAudienceUpdateWithRequiredBodyOperationType :: OperationType
    <*> arbitrary -- adAccountToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds :: [Text]
  
instance Arbitrary AdAccountToBusinessSharedAudience where
  arbitrary = sized genAdAccountToBusinessSharedAudience

genAdAccountToBusinessSharedAudience :: Int -> Gen AdAccountToBusinessSharedAudience
genAdAccountToBusinessSharedAudience n =
  AdAccountToBusinessSharedAudience
    <$> arbitrary -- adAccountToBusinessSharedAudienceAudienceId :: Text
    <*> arbitraryReducedMaybe n -- adAccountToBusinessSharedAudiencePermissions :: Maybe [Role]
    <*> arbitrary -- adAccountToBusinessSharedAudienceRecipientBusinessIds :: [Text]
  
instance Arbitrary AdAccountToBusinessSharedAudienceUpdateWithRequiredBody where
  arbitrary = sized genAdAccountToBusinessSharedAudienceUpdateWithRequiredBody

genAdAccountToBusinessSharedAudienceUpdateWithRequiredBody :: Int -> Gen AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
genAdAccountToBusinessSharedAudienceUpdateWithRequiredBody n =
  AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
    <$> arbitrary -- adAccountToBusinessSharedAudienceUpdateWithRequiredBodyAudienceId :: Text
    <*> arbitraryReduced n -- adAccountToBusinessSharedAudienceUpdateWithRequiredBodyOperationType :: OperationType
    <*> arbitrary -- adAccountToBusinessSharedAudienceUpdateWithRequiredBodyRecipientBusinessIds :: [Text]
  
instance Arbitrary AdAccountsAudience where
  arbitrary = sized genAdAccountsAudience

genAdAccountsAudience :: Int -> Gen AdAccountsAudience
genAdAccountsAudience n =
  AdAccountsAudience
    <$> arbitraryReducedMaybe n -- adAccountsAudienceAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceAudienceType :: Maybe AudienceType
    <*> arbitraryReducedMaybe n -- adAccountsAudienceCreatedByCompanyName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceCreatedTimestamp :: Maybe Int
    <*> arbitraryReducedMaybe n -- adAccountsAudienceDescription :: Maybe Text
    <*> arbitrary -- adAccountsAudienceId :: Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceIsNca :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adAccountsAudienceName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRule :: Maybe AdAccountsAudienceRule
    <*> arbitraryReducedMaybe n -- adAccountsAudienceSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- adAccountsAudienceStatus :: Maybe AudienceStatus
    <*> arbitraryReducedMaybe n -- adAccountsAudienceType :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceUpdatedTimestamp :: Maybe Int
  
instance Arbitrary AdAccountsAudienceCreate where
  arbitrary = sized genAdAccountsAudienceCreate

genAdAccountsAudienceCreate :: Int -> Gen AdAccountsAudienceCreate
genAdAccountsAudienceCreate n =
  AdAccountsAudienceCreate
    <$> arbitraryReducedMaybe n -- adAccountsAudienceCreateAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceCreateAudienceType :: Maybe AudienceType
    <*> arbitraryReducedMaybe n -- adAccountsAudienceCreateDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceCreateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceCreateRule :: Maybe AdAccountsAudienceRule
  
instance Arbitrary AdAccountsAudienceRule where
  arbitrary = sized genAdAccountsAudienceRule

genAdAccountsAudienceRule :: Int -> Gen AdAccountsAudienceRule
genAdAccountsAudienceRule n =
  AdAccountsAudienceRule
    <$> arbitraryReducedMaybe n -- adAccountsAudienceRuleAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleAdId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleCampaignId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleCustomerListId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleEngagementDomain :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleEngagementType :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleEngagerType :: Maybe Int
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleEvent :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleEventData :: Maybe EventData
    <*> arbitraryReducedMaybeValue n -- adAccountsAudienceRuleEventSource :: Maybe A.Value
    <*> arbitraryReducedMaybeValue n -- adAccountsAudienceRuleIngestionSource :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleObjectiveType :: Maybe [AudienceObjectiveType]
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRulePercentage :: Maybe Int
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRulePinId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRulePrefill :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleRetentionDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleSeedId :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleUrl :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adAccountsAudienceRuleVisitorSourceId :: Maybe Text
  
instance Arbitrary AdAccountsAudienceUpdate where
  arbitrary = sized genAdAccountsAudienceUpdate

genAdAccountsAudienceUpdate :: Int -> Gen AdAccountsAudienceUpdate
genAdAccountsAudienceUpdate n =
  AdAccountsAudienceUpdate
    <$> arbitraryReducedMaybe n -- adAccountsAudienceUpdateAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceUpdateAudienceType :: Maybe AudienceType
    <*> arbitraryReducedMaybe n -- adAccountsAudienceUpdateDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceUpdateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adAccountsAudienceUpdateOperationType :: Maybe AudienceUpdateOperationType
    <*> arbitraryReducedMaybe n -- adAccountsAudienceUpdateRule :: Maybe AdAccountsAudienceRule
  
instance Arbitrary AdAccountsAudiencesSharedAccountsList200Response where
  arbitrary = sized genAdAccountsAudiencesSharedAccountsList200Response

genAdAccountsAudiencesSharedAccountsList200Response :: Int -> Gen AdAccountsAudiencesSharedAccountsList200Response
genAdAccountsAudiencesSharedAccountsList200Response n =
  AdAccountsAudiencesSharedAccountsList200Response
    <$> arbitraryReducedMaybe n -- adAccountsAudiencesSharedAccountsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- adAccountsAudiencesSharedAccountsList200ResponseItems :: [SharedAudienceAccount]
  
instance Arbitrary AdAccountsCountry where
  arbitrary = sized genAdAccountsCountry

genAdAccountsCountry :: Int -> Gen AdAccountsCountry
genAdAccountsCountry n =
  AdAccountsCountry
    <$> arbitraryReduced n -- adAccountsCountryCode :: Country
    <*> arbitrary -- adAccountsCountryCurrency :: Text
    <*> arbitrary -- adAccountsCountryIndex :: Double
    <*> arbitrary -- adAccountsCountryName :: Text
  
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
  
instance Arbitrary AdBatchItem where
  arbitrary = sized genAdBatchItem

genAdBatchItem :: Int -> Gen AdBatchItem
genAdBatchItem n =
  AdBatchItem
    <$> arbitraryReducedMaybe n -- adBatchItemData :: Maybe Ad
    <*> arbitraryReducedMaybe n -- adBatchItemExceptions :: Maybe PinterestLibError
  
instance Arbitrary AdBatchUpdate where
  arbitrary = sized genAdBatchUpdate

genAdBatchUpdate :: Int -> Gen AdBatchUpdate
genAdBatchUpdate n =
  AdBatchUpdate
    <$> arbitraryReducedMaybe n -- adBatchUpdateAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adBatchUpdateAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adBatchUpdateCarouselAndroidDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adBatchUpdateCarouselDestinationUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adBatchUpdateCarouselIosDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adBatchUpdateClickTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adBatchUpdateCollectionItemsDestinationUrlTemplate :: Maybe Text
    <*> arbitraryReducedMaybe n -- adBatchUpdateCollectionsHeaderType :: Maybe AdCollectionsHeaderType
    <*> arbitraryReducedMaybe n -- adBatchUpdateCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- adBatchUpdateCustomizableCtaType :: Maybe CustomizableCTAType
    <*> arbitraryReducedMaybe n -- adBatchUpdateDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adBatchUpdateDisclosureType :: Maybe DisclosureType
    <*> arbitraryReducedMaybe n -- adBatchUpdateDisclosureUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adBatchUpdateGridClickType :: Maybe GridClickType
    <*> arbitrary -- adBatchUpdateId :: Text
    <*> arbitraryReducedMaybe n -- adBatchUpdateIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adBatchUpdateIsCarting :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adBatchUpdateIsCollageAcceptedTerms :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adBatchUpdateIsCollageSingleDestination :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adBatchUpdateIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adBatchUpdateIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adBatchUpdateLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adBatchUpdateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adBatchUpdatePinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adBatchUpdateQuizPinData :: Maybe QuizPinData
    <*> arbitraryReducedMaybe n -- adBatchUpdateStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adBatchUpdateTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adBatchUpdateViewTrackingUrl :: Maybe Text
  
instance Arbitrary AdBatchWriteResponseModel where
  arbitrary = sized genAdBatchWriteResponseModel

genAdBatchWriteResponseModel :: Int -> Gen AdBatchWriteResponseModel
genAdBatchWriteResponseModel n =
  AdBatchWriteResponseModel
    <$> arbitraryReduced n -- adBatchWriteResponseModelItems :: [AdBatchItem]
  
instance Arbitrary AdCreate where
  arbitrary = sized genAdCreate

genAdCreate :: Int -> Gen AdCreate
genAdCreate n =
  AdCreate
    <$> arbitrary -- adCreateAdGroupId :: Text
    <*> arbitraryReducedMaybe n -- adCreateAndroidDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateCarouselAndroidDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCreateCarouselDestinationUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCreateCarouselIosDeepLinks :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adCreateClickTrackingUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateCollectionItemsDestinationUrlTemplate :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateCollectionsHeaderType :: Maybe AdCollectionsHeaderType
    <*> arbitraryReduced n -- adCreateCreativeType :: CreativeType
    <*> arbitraryReducedMaybe n -- adCreateCustomizableCtaType :: Maybe CustomizableCTAType
    <*> arbitraryReducedMaybe n -- adCreateDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateDisclosureType :: Maybe DisclosureType
    <*> arbitraryReducedMaybe n -- adCreateDisclosureUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- adCreateIosDeepLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateIsCarting :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateIsCollageAcceptedTerms :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateIsCollageSingleDestination :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateName :: Maybe Text
    <*> arbitrary -- adCreatePinId :: Text
    <*> arbitraryReducedMaybe n -- adCreateQuizPinData :: Maybe QuizPinData
    <*> arbitraryReducedMaybe n -- adCreateStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adCreateTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- adCreateViewTrackingUrl :: Maybe Text
  
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
    <*> arbitraryReducedMaybe n -- adCreateRequestIsCarting :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateRequestIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateRequestIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adCreateRequestLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adCreateRequestName :: Maybe Text
    <*> arbitrary -- adCreateRequestPinId :: Text
    <*> arbitraryReducedMaybeValue n -- adCreateRequestQuizPinData :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- adCreateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybeValue n -- adCreateRequestTrackingUrls :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- adCreateRequestViewTrackingUrl :: Maybe Text
  
instance Arbitrary AdGroup where
  arbitrary = sized genAdGroup

genAdGroup :: Int -> Gen AdGroup
genAdGroup n =
  AdGroup
    <$> arbitraryReducedMaybe n -- adGroupAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupBidStrategyType :: Maybe BidStrategyType
    <*> arbitraryReduced n -- adGroupBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- adGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitrary -- adGroupCampaignId :: Text
    <*> arbitraryReduced n -- adGroupConversionLearningModeType :: ConversionLearningModeType
    <*> arbitrary -- adGroupCreatedTime :: Int
    <*> arbitraryReducedMaybe n -- adGroupCustomerSegmentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupDcaAssets :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- adGroupEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupExtFeatures :: Maybe AdgroupTrackingFeatures
    <*> arbitraryReducedMaybe n -- adGroupFeedProfileId :: Maybe Text
    <*> arbitrary -- adGroupId :: Text
    <*> arbitraryReducedMaybe n -- adGroupIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupIsLocalInventory :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupLocalInventoryRadiusInMiles :: Maybe Double
    <*> arbitrary -- adGroupName :: Text
    <*> arbitraryReducedMaybe n -- adGroupOptimizationGoalMetadata :: Maybe NullableOptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupPerformancePlusCampaignSettings :: Maybe PerformancePlusCampaignSettings
    <*> arbitraryReducedMaybe n -- adGroupPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupPlacementTrafficType :: Maybe PlacementTrafficType
    <*> arbitraryReducedMaybe n -- adGroupPromotionApplicationLevel :: Maybe PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupPromotionIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupStatus :: Maybe EntityStatus
    <*> arbitraryReduced n -- adGroupSummaryStatus :: SummaryStatus
    <*> arbitraryReducedMaybe n -- adGroupTargetingSpec :: Maybe TargetingSpecOptimal
    <*> arbitraryReducedMaybe n -- adGroupTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupTrackingUrls :: Maybe AdGroupTrackingURLs
    <*> arbitrary -- adGroupType :: Text
    <*> arbitrary -- adGroupUpdatedTime :: Int
    <*> arbitraryReducedMaybe n -- adGroupAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupBidMultiplier :: Maybe Double
    <*> arbitraryReducedMaybe n -- adGroupBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupPacingDeliveryType :: Maybe PacingDeliveryType
  
instance Arbitrary AdGroupAudienceSizing where
  arbitrary = sized genAdGroupAudienceSizing

genAdGroupAudienceSizing :: Int -> Gen AdGroupAudienceSizing
genAdGroupAudienceSizing n =
  AdGroupAudienceSizing
    <$> arbitraryReducedMaybe n -- adGroupAudienceSizingAudienceSizeLowerBound :: Maybe Double
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingAudienceSizeUpperBound :: Maybe Double
  
instance Arbitrary AdGroupAudienceSizingCreate where
  arbitrary = sized genAdGroupAudienceSizingCreate

genAdGroupAudienceSizingCreate :: Int -> Gen AdGroupAudienceSizingCreate
genAdGroupAudienceSizingCreate n =
  AdGroupAudienceSizingCreate
    <$> arbitraryReducedMaybe n -- adGroupAudienceSizingCreateAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingCreateCreativeTypes :: Maybe [AdGroupAudienceSizingCreativeTypes]
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingCreateKeywords :: Maybe [AdGroupAudienceSizingKeyword]
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingCreatePlacementGroup :: Maybe AdgroupPlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingCreateProductGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupAudienceSizingCreateTargetingSpec :: Maybe TargetingSpecOptimal
  
instance Arbitrary AdGroupAudienceSizingKeyword where
  arbitrary = sized genAdGroupAudienceSizingKeyword

genAdGroupAudienceSizingKeyword :: Int -> Gen AdGroupAudienceSizingKeyword
genAdGroupAudienceSizingKeyword n =
  AdGroupAudienceSizingKeyword
    <$> arbitraryReduced n -- adGroupAudienceSizingKeywordMatchType :: MatchType
    <*> arbitrary -- adGroupAudienceSizingKeywordValue :: Text
  
instance Arbitrary AdGroupBase where
  arbitrary = sized genAdGroupBase

genAdGroupBase :: Int -> Gen AdGroupBase
genAdGroupBase n =
  AdGroupBase
    <$> arbitraryReducedMaybe n -- adGroupBaseAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupBaseBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupBaseBidStrategyType :: Maybe BidStrategyType
    <*> arbitraryReduced n -- adGroupBaseBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- adGroupBaseBudgetInMicroCurrency :: Maybe Int
    <*> arbitrary -- adGroupBaseCampaignId :: Text
    <*> arbitraryReduced n -- adGroupBaseConversionLearningModeType :: ConversionLearningModeType
    <*> arbitrary -- adGroupBaseCreatedTime :: Int
    <*> arbitraryReducedMaybe n -- adGroupBaseCustomerSegmentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupBaseDcaAssets :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- adGroupBaseEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupBaseExtFeatures :: Maybe AdgroupTrackingFeatures
    <*> arbitraryReducedMaybe n -- adGroupBaseFeedProfileId :: Maybe Text
    <*> arbitrary -- adGroupBaseId :: Text
    <*> arbitraryReducedMaybe n -- adGroupBaseIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupBaseIsLocalInventory :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupBaseLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupBaseLocalInventoryRadiusInMiles :: Maybe Double
    <*> arbitrary -- adGroupBaseName :: Text
    <*> arbitraryReducedMaybe n -- adGroupBaseOptimizationGoalMetadata :: Maybe NullableOptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupBasePerformancePlusCampaignSettings :: Maybe PerformancePlusCampaignSettings
    <*> arbitraryReducedMaybe n -- adGroupBasePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupBasePlacementTrafficType :: Maybe PlacementTrafficType
    <*> arbitraryReducedMaybe n -- adGroupBasePromotionApplicationLevel :: Maybe PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupBasePromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupBasePromotionIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupBaseStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupBaseStatus :: Maybe EntityStatus
    <*> arbitraryReduced n -- adGroupBaseSummaryStatus :: SummaryStatus
    <*> arbitraryReducedMaybe n -- adGroupBaseTargetingSpec :: Maybe TargetingSpecOptimal
    <*> arbitraryReducedMaybe n -- adGroupBaseTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupBaseTrackingUrls :: Maybe AdGroupTrackingURLs
    <*> arbitrary -- adGroupBaseType :: Text
    <*> arbitrary -- adGroupBaseUpdatedTime :: Int
  
instance Arbitrary AdGroupCreate where
  arbitrary = sized genAdGroupCreate

genAdGroupCreate :: Int -> Gen AdGroupCreate
genAdGroupCreate n =
  AdGroupCreate
    <$> arbitraryReducedMaybe n -- adGroupCreateAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCreateBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateBidStrategyType :: Maybe BidStrategyType
    <*> arbitraryReduced n -- adGroupCreateBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- adGroupCreateBudgetInMicroCurrency :: Maybe Int
    <*> arbitrary -- adGroupCreateCampaignId :: Text
    <*> arbitraryReduced n -- adGroupCreateConversionLearningModeType :: ConversionLearningModeType
    <*> arbitrary -- adGroupCreateCreatedTime :: Int
    <*> arbitraryReducedMaybe n -- adGroupCreateCustomerSegmentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCreateDcaAssets :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- adGroupCreateEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateExtFeatures :: Maybe AdgroupTrackingFeatures
    <*> arbitraryReducedMaybe n -- adGroupCreateFeedProfileId :: Maybe Text
    <*> arbitrary -- adGroupCreateId :: Text
    <*> arbitraryReducedMaybe n -- adGroupCreateIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateIsLocalInventory :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateLocalInventoryRadiusInMiles :: Maybe Double
    <*> arbitrary -- adGroupCreateName :: Text
    <*> arbitraryReducedMaybe n -- adGroupCreateOptimizationGoalMetadata :: Maybe NullableOptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupCreatePerformancePlusCampaignSettings :: Maybe PerformancePlusCampaignSettings
    <*> arbitraryReducedMaybe n -- adGroupCreatePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupCreatePlacementTrafficType :: Maybe PlacementTrafficType
    <*> arbitraryReducedMaybe n -- adGroupCreatePromotionApplicationLevel :: Maybe PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupCreatePromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCreatePromotionIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupCreateStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateStatus :: Maybe EntityStatus
    <*> arbitraryReduced n -- adGroupCreateSummaryStatus :: SummaryStatus
    <*> arbitraryReducedMaybe n -- adGroupCreateTargetingSpec :: Maybe TargetingSpecOptimal
    <*> arbitraryReducedMaybe n -- adGroupCreateTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupCreateTrackingUrls :: Maybe AdGroupTrackingURLs
    <*> arbitrary -- adGroupCreateType :: Text
    <*> arbitrary -- adGroupCreateUpdatedTime :: Int
    <*> arbitraryReducedMaybe n -- adGroupCreateAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateBidMultiplier :: Maybe Double
    <*> arbitraryReducedMaybe n -- adGroupCreateBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupCreatePacingDeliveryType :: Maybe PacingDeliveryType
  
instance Arbitrary AdGroupCreateCreate where
  arbitrary = sized genAdGroupCreateCreate

genAdGroupCreateCreate :: Int -> Gen AdGroupCreateCreate
genAdGroupCreateCreate n =
  AdGroupCreateCreate
    <$> arbitraryReducedMaybe n -- adGroupCreateCreateAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateBidMultiplier :: Maybe Double
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateBidStrategyType :: Maybe BidStrategyType
    <*> arbitraryReduced n -- adGroupCreateCreateBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateBudgetType :: Maybe BudgetType
    <*> arbitrary -- adGroupCreateCreateCampaignId :: Text
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateCustomerSegmentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateExtFeatures :: Maybe AdgroupTrackingFeatures
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateFeedProfileId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateIsLocalInventory :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateLocalInventoryRadiusInMiles :: Maybe Double
    <*> arbitrary -- adGroupCreateCreateName :: Text
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateOptimizationGoalMetadata :: Maybe NullableOptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupCreateCreatePacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupCreateCreatePerformancePlusCampaignSettings :: Maybe PerformancePlusCampaignSettings
    <*> arbitraryReducedMaybe n -- adGroupCreateCreatePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupCreateCreatePlacementTrafficType :: Maybe PlacementTrafficType
    <*> arbitraryReducedMaybe n -- adGroupCreateCreatePromotionApplicationLevel :: Maybe PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupCreateCreatePromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCreateCreatePromotionIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateTargetingSpec :: Maybe TargetingSpecOptimal
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupCreateCreateTrackingUrls :: Maybe AdGroupTrackingURLs
  
instance Arbitrary AdGroupCreateRequest where
  arbitrary = sized genAdGroupCreateRequest

genAdGroupCreateRequest :: Int -> Gen AdGroupCreateRequest
genAdGroupCreateRequest n =
  AdGroupCreateRequest
    <$> arbitraryReducedMaybe n -- adGroupCreateRequestAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBidMultiplier :: Maybe Double
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBidStrategyType :: Maybe BidStrategyType
    <*> arbitraryReduced n -- adGroupCreateRequestBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestBudgetInMicroCurrency :: Maybe Int
    <*> arbitrary -- adGroupCreateRequestCampaignId :: Text
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestLifetimeFrequencyCap :: Maybe Int
    <*> arbitrary -- adGroupCreateRequestName :: Text
    <*> arbitraryReducedMaybeValue n -- adGroupCreateRequestOptimizationGoalMetadata :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPromotionApplicationLevel :: Maybe E'PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestPromotionIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybeValue n -- adGroupCreateRequestTrackingUrls :: Maybe A.Value
  
instance Arbitrary AdGroupCreateRequestAllOf1 where
  arbitrary = sized genAdGroupCreateRequestAllOf1

genAdGroupCreateRequestAllOf1 :: Int -> Gen AdGroupCreateRequestAllOf1
genAdGroupCreateRequestAllOf1 n =
  AdGroupCreateRequestAllOf1
    <$> arbitraryReducedMaybe n -- adGroupCreateRequestAllOf1AutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestAllOf1BidMultiplier :: Maybe Double
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestAllOf1BudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupCreateRequestAllOf1PacingDeliveryType :: Maybe PacingDeliveryType
  
instance Arbitrary AdGroupDeliveryEstimates where
  arbitrary = sized genAdGroupDeliveryEstimates

genAdGroupDeliveryEstimates :: Int -> Gen AdGroupDeliveryEstimates
genAdGroupDeliveryEstimates n =
  AdGroupDeliveryEstimates
    <$> arbitraryReducedMaybe n -- adGroupDeliveryEstimatesAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupDeliveryEstimatesCreativeTypes :: Maybe [AdGroupAudienceSizingCreativeTypes]
    <*> arbitraryReducedMaybe n -- adGroupDeliveryEstimatesKeywords :: Maybe [AdGroupDeliveryEstimatesKeywordsItems]
    <*> arbitraryReducedMaybe n -- adGroupDeliveryEstimatesMonthlyFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupDeliveryEstimatesOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupDeliveryEstimatesOptimizationType :: Maybe OptimizationType
    <*> arbitraryReducedMaybe n -- adGroupDeliveryEstimatesPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupDeliveryEstimatesProductGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupDeliveryEstimatesTargetingSpec :: Maybe TargetingSpecOptimal
  
instance Arbitrary AdGroupDeliveryEstimatesKeywordsItems where
  arbitrary = sized genAdGroupDeliveryEstimatesKeywordsItems

genAdGroupDeliveryEstimatesKeywordsItems :: Int -> Gen AdGroupDeliveryEstimatesKeywordsItems
genAdGroupDeliveryEstimatesKeywordsItems n =
  AdGroupDeliveryEstimatesKeywordsItems
    <$> arbitraryReduced n -- adGroupDeliveryEstimatesKeywordsItemsMatchType :: NullalbleMatchType
    <*> arbitrary -- adGroupDeliveryEstimatesKeywordsItemsValue :: Text
  
instance Arbitrary AdGroupTrackingURLs where
  arbitrary = sized genAdGroupTrackingURLs

genAdGroupTrackingURLs :: Int -> Gen AdGroupTrackingURLs
genAdGroupTrackingURLs n =
  AdGroupTrackingURLs
    <$> arbitraryReducedMaybe n -- adGroupTrackingURLsAudienceVerification :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupTrackingURLsBuyableButton :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupTrackingURLsClick :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupTrackingURLsEngagement :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupTrackingURLsImpression :: Maybe [Text]
  
instance Arbitrary AdGroupUpdate where
  arbitrary = sized genAdGroupUpdate

genAdGroupUpdate :: Int -> Gen AdGroupUpdate
genAdGroupUpdate n =
  AdGroupUpdate
    <$> arbitraryReducedMaybe n -- adGroupUpdateAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateBidStrategyType :: Maybe BidStrategyType
    <*> arbitraryReduced n -- adGroupUpdateBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- adGroupUpdateBudgetInMicroCurrency :: Maybe Int
    <*> arbitrary -- adGroupUpdateCampaignId :: Text
    <*> arbitraryReduced n -- adGroupUpdateConversionLearningModeType :: ConversionLearningModeType
    <*> arbitrary -- adGroupUpdateCreatedTime :: Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateCustomerSegmentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateDcaAssets :: Maybe AnyType
    <*> arbitraryReducedMaybe n -- adGroupUpdateEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateExtFeatures :: Maybe AdgroupTrackingFeatures
    <*> arbitraryReducedMaybe n -- adGroupUpdateFeedProfileId :: Maybe Text
    <*> arbitrary -- adGroupUpdateId :: Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateIsLocalInventory :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateLocalInventoryRadiusInMiles :: Maybe Double
    <*> arbitrary -- adGroupUpdateName :: Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateOptimizationGoalMetadata :: Maybe NullableOptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupUpdatePerformancePlusCampaignSettings :: Maybe PerformancePlusCampaignSettings
    <*> arbitraryReducedMaybe n -- adGroupUpdatePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupUpdatePlacementTrafficType :: Maybe PlacementTrafficType
    <*> arbitraryReducedMaybe n -- adGroupUpdatePromotionApplicationLevel :: Maybe PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupUpdatePromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdatePromotionIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupUpdateStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateStatus :: Maybe EntityStatus
    <*> arbitraryReduced n -- adGroupUpdateSummaryStatus :: SummaryStatus
    <*> arbitraryReducedMaybe n -- adGroupUpdateTargetingSpec :: Maybe TargetingSpecOptimal
    <*> arbitraryReducedMaybe n -- adGroupUpdateTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupUpdateTrackingUrls :: Maybe AdGroupTrackingURLs
    <*> arbitrary -- adGroupUpdateType :: Text
    <*> arbitrary -- adGroupUpdateUpdatedTime :: Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateBidMultiplier :: Maybe Double
    <*> arbitraryReducedMaybe n -- adGroupUpdateBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupUpdatePacingDeliveryType :: Maybe PacingDeliveryType
  
instance Arbitrary AdGroupUpdateBatchUpdate where
  arbitrary = sized genAdGroupUpdateBatchUpdate

genAdGroupUpdateBatchUpdate :: Int -> Gen AdGroupUpdateBatchUpdate
genAdGroupUpdateBatchUpdate n =
  AdGroupUpdateBatchUpdate
    <$> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateBidMultiplier :: Maybe Double
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateBidStrategyType :: Maybe BidStrategyType
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateCustomerSegmentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateExtFeatures :: Maybe AdgroupTrackingFeatures
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateFeedProfileId :: Maybe Text
    <*> arbitrary -- adGroupUpdateBatchUpdateId :: Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateIsLocalInventory :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateLocalInventoryRadiusInMiles :: Maybe Double
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateOptimizationGoalMetadata :: Maybe NullableOptimizationGoalMetadata
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdatePacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdatePerformancePlusCampaignSettings :: Maybe PerformancePlusCampaignSettings
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdatePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdatePlacementTrafficType :: Maybe PlacementTrafficType
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdatePromotionApplicationLevel :: Maybe PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdatePromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdatePromotionIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateTargetingSpec :: Maybe TargetingSpecOptimal
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateTargetingSpecOperations :: Maybe [TargetingSpecOperations]
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupUpdateBatchUpdateTrackingUrls :: Maybe AdGroupTrackingURLs
  
instance Arbitrary AdGroupUpdateRequest where
  arbitrary = sized genAdGroupUpdateRequest

genAdGroupUpdateRequest :: Int -> Gen AdGroupUpdateRequest
genAdGroupUpdateRequest n =
  AdGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- adGroupUpdateRequestBidMultiplier :: Maybe Double
    <*> arbitrary -- adGroupUpdateRequestId :: Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestTargetingSpecOperations :: Maybe [TargetingSpecOperations]
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBidStrategyType :: Maybe BidStrategyType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBillableEvent :: Maybe ActionType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestBudgetType :: Maybe BudgetType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestIsCreativeOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestLifetimeFrequencyCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- adGroupUpdateRequestOptimizationGoalMetadata :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPacingDeliveryType :: Maybe PacingDeliveryType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPromotionApplicationLevel :: Maybe E'PromotionApplicationLevel
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestPromotionIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestTargetingSpec :: Maybe TargetingSpec
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestTargetingTemplateIds :: Maybe [Text]
    <*> arbitraryReducedMaybeValue n -- adGroupUpdateRequestTrackingUrls :: Maybe A.Value
  
instance Arbitrary AdGroupUpdateRequestAllOf1 where
  arbitrary = sized genAdGroupUpdateRequestAllOf1

genAdGroupUpdateRequestAllOf1 :: Int -> Gen AdGroupUpdateRequestAllOf1
genAdGroupUpdateRequestAllOf1 n =
  AdGroupUpdateRequestAllOf1
    <$> arbitraryReducedMaybe n -- adGroupUpdateRequestAllOf1BidMultiplier :: Maybe Double
    <*> arbitrary -- adGroupUpdateRequestAllOf1Id :: Text
    <*> arbitraryReducedMaybe n -- adGroupUpdateRequestAllOf1TargetingSpecOperations :: Maybe [TargetingSpecOperations]
  
instance Arbitrary AdGroupsAnalyticsMetrics where
  arbitrary = sized genAdGroupsAnalyticsMetrics

genAdGroupsAnalyticsMetrics :: Int -> Gen AdGroupsAnalyticsMetrics
genAdGroupsAnalyticsMetrics n =
  AdGroupsAnalyticsMetrics
    <$> arbitraryReducedMaybe n -- adGroupsAnalyticsMetricsAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adGroupsAnalyticsMetricsDate :: Maybe Date
  
instance Arbitrary AdGroupsCreate200Response where
  arbitrary = sized genAdGroupsCreate200Response

genAdGroupsCreate200Response :: Int -> Gen AdGroupsCreate200Response
genAdGroupsCreate200Response n =
  AdGroupsCreate200Response
    <$> arbitraryReduced n -- adGroupsCreate200ResponseItems :: [AdGroupsCreate200ResponseItemsInner]
  
instance Arbitrary AdGroupsCreate200ResponseItemsInner where
  arbitrary = sized genAdGroupsCreate200ResponseItemsInner

genAdGroupsCreate200ResponseItemsInner :: Int -> Gen AdGroupsCreate200ResponseItemsInner
genAdGroupsCreate200ResponseItemsInner n =
  AdGroupsCreate200ResponseItemsInner
    <$> arbitraryReducedMaybe n -- adGroupsCreate200ResponseItemsInnerData :: Maybe AdGroup
    <*> arbitraryReducedMaybe n -- adGroupsCreate200ResponseItemsInnerExceptions :: Maybe [PinterestLibBatchItemException]
  
instance Arbitrary AdGroupsList200Response where
  arbitrary = sized genAdGroupsList200Response

genAdGroupsList200Response :: Int -> Gen AdGroupsList200Response
genAdGroupsList200Response n =
  AdGroupsList200Response
    <$> arbitraryReducedMaybe n -- adGroupsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- adGroupsList200ResponseItems :: [AdGroup]
  
instance Arbitrary AdPinAnalytics where
  arbitrary = sized genAdPinAnalytics

genAdPinAnalytics :: Int -> Gen AdPinAnalytics
genAdPinAnalytics n =
  AdPinAnalytics
    <$> arbitraryReducedMaybe n -- adPinAnalyticsDate :: Maybe Date
    <*> arbitrary -- adPinAnalyticsPinId :: Text
  
instance Arbitrary AdPreviewRequest where
  arbitrary = sized genAdPreviewRequest

genAdPreviewRequest :: Int -> Gen AdPreviewRequest
genAdPreviewRequest n =
  AdPreviewRequest
    <$> arbitrary -- adPreviewRequestImageUrl :: Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestPromotionId :: Maybe Text
    <*> arbitrary -- adPreviewRequestTitle :: Text
    <*> arbitraryReduced n -- adPreviewRequestCreativeType :: AdShoppingPreviewCreativeType
    <*> arbitrary -- adPreviewRequestPinId :: Text
    <*> arbitrary -- adPreviewRequestCatalogProductGroupId :: Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestCustomizableCtaType :: Maybe CustomizableCTAType
    <*> arbitraryReducedMaybe n -- adPreviewRequestHeroImageTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestHeroImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestHeroPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestImageTag :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewRequestPreferredMediaType :: Maybe BasePreferredMediaType
    <*> arbitraryReducedMaybe n -- adPreviewRequestShowPromotion :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adPreviewRequestVideoTag :: Maybe Text
  
instance Arbitrary AdPreviewShopping where
  arbitrary = sized genAdPreviewShopping

genAdPreviewShopping :: Int -> Gen AdPreviewShopping
genAdPreviewShopping n =
  AdPreviewShopping
    <$> arbitrary -- adPreviewShoppingCatalogProductGroupId :: Text
    <*> arbitraryReduced n -- adPreviewShoppingCreativeType :: AdShoppingPreviewCreativeType
    <*> arbitraryReducedMaybe n -- adPreviewShoppingCustomizableCtaType :: Maybe CustomizableCTAType
    <*> arbitraryReducedMaybe n -- adPreviewShoppingHeroImageTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewShoppingHeroImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewShoppingHeroPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewShoppingImageTag :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewShoppingItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adPreviewShoppingPreferredMediaType :: Maybe BasePreferredMediaType
    <*> arbitraryReducedMaybe n -- adPreviewShoppingShowPromotion :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adPreviewShoppingVideoTag :: Maybe Text
  
instance Arbitrary AdPreviewSourceImage where
  arbitrary = sized genAdPreviewSourceImage

genAdPreviewSourceImage :: Int -> Gen AdPreviewSourceImage
genAdPreviewSourceImage n =
  AdPreviewSourceImage
    <$> arbitrary -- adPreviewSourceImageImageUrl :: Text
    <*> arbitraryReducedMaybe n -- adPreviewSourceImagePromotionId :: Maybe Text
    <*> arbitrary -- adPreviewSourceImageTitle :: Text
  
instance Arbitrary AdPreviewSourcePinId where
  arbitrary = sized genAdPreviewSourcePinId

genAdPreviewSourcePinId :: Int -> Gen AdPreviewSourcePinId
genAdPreviewSourcePinId n =
  AdPreviewSourcePinId
    <$> arbitraryReducedMaybe n -- adPreviewSourcePinIdCreativeType :: Maybe AdPinPreviewCreativeType
    <*> arbitrary -- adPreviewSourcePinIdPinId :: Text
  
instance Arbitrary AdPreviewURLResponse where
  arbitrary = sized genAdPreviewURLResponse

genAdPreviewURLResponse :: Int -> Gen AdPreviewURLResponse
genAdPreviewURLResponse n =
  AdPreviewURLResponse
    <$> arbitraryReducedMaybe n -- adPreviewURLResponseUrl :: Maybe Text
  
instance Arbitrary AdUpdateRequest where
  arbitrary = sized genAdUpdateRequest

genAdUpdateRequest :: Int -> Gen AdUpdateRequest
genAdUpdateRequest n =
  AdUpdateRequest
    <$> arbitrary -- adUpdateRequestId :: Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestAdGroupId :: Maybe Text
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
    <*> arbitraryReducedMaybe n -- adUpdateRequestIsCarting :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adUpdateRequestIsPinDeleted :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adUpdateRequestIsRemovable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adUpdateRequestLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- adUpdateRequestQuizPinData :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- adUpdateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybeValue n -- adUpdateRequestTrackingUrls :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- adUpdateRequestViewTrackingUrl :: Maybe Text
  
instance Arbitrary AdUpdateRequestAllOf1 where
  arbitrary = sized genAdUpdateRequestAllOf1

genAdUpdateRequestAllOf1 :: Int -> Gen AdUpdateRequestAllOf1
genAdUpdateRequestAllOf1 n =
  AdUpdateRequestAllOf1
    <$> arbitrary -- adUpdateRequestAllOf1Id :: Text
    <*> arbitraryReducedMaybe n -- adUpdateRequestAllOf1PinId :: Maybe Text
  
instance Arbitrary AdgroupTrackingFeatures where
  arbitrary = sized genAdgroupTrackingFeatures

genAdgroupTrackingFeatures :: Int -> Gen AdgroupTrackingFeatures
genAdgroupTrackingFeatures n =
  AdgroupTrackingFeatures
    <$> arbitraryReducedMaybe n -- adgroupTrackingFeaturesEnabled :: Maybe [AdgroupTrackingFeatureType]
  
instance Arbitrary AdsAnalytics where
  arbitrary = sized genAdsAnalytics

genAdsAnalytics :: Int -> Gen AdsAnalytics
genAdsAnalytics n =
  AdsAnalytics
    <$> arbitrary -- adsAnalyticsAdId :: Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsDate :: Maybe Date
  
instance Arbitrary AdsAnalyticsCreateAsyncRequest where
  arbitrary = sized genAdsAnalyticsCreateAsyncRequest

genAdsAnalyticsCreateAsyncRequest :: Int -> Gen AdsAnalyticsCreateAsyncRequest
genAdsAnalyticsCreateAsyncRequest n =
  AdsAnalyticsCreateAsyncRequest
    <$> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdGroupStatuses :: Maybe [AdGroupSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAdStatuses :: Maybe [PinPromotionSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestAttributionTypes :: Maybe [ConversionReportAttributionType]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignBrandLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignCustomLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignObjectiveTypes :: Maybe [CampaignObjectiveType]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCampaignStatuses :: Maybe [CampaignSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestClickWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestColumns :: Maybe [ReportingColumnAsync]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCombineTargetingTypes :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestConversionReportTime :: Maybe ConversionReportTimeType
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestCustomConversionEventMetrics :: Maybe [CustomConversionEventMetrics]
    <*> arbitrary -- adsAnalyticsCreateAsyncRequestEndDate :: Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestEndHour :: Maybe Int
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestEngagementWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReduced n -- adsAnalyticsCreateAsyncRequestGranularity :: Granularity
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestLevel :: Maybe MetricsReportingLevel
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestMetricsFilters :: Maybe [AdsAnalyticsMetricsFilter]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestPrimarySort :: Maybe PrimarySort
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestProductGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestProductGroupStatuses :: Maybe [ProductGroupSummaryStatus]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestProductItemIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestReportFormat :: Maybe DataOutputFormat
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestReportingTimezone :: Maybe ReportingTimeZone
    <*> arbitrary -- adsAnalyticsCreateAsyncRequestStartDate :: Text
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestStartHour :: Maybe Int
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestTargetingTypes :: Maybe [AdAdsAnalyticsAsyncTargetingTypes]
    <*> arbitraryReducedMaybe n -- adsAnalyticsCreateAsyncRequestViewWindowDays :: Maybe ConversionAttributionWindowDays
  
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
  
instance Arbitrary AdsCreditDiscountsResponse where
  arbitrary = sized genAdsCreditDiscountsResponse

genAdsCreditDiscountsResponse :: Int -> Gen AdsCreditDiscountsResponse
genAdsCreditDiscountsResponse n =
  AdsCreditDiscountsResponse
    <$> arbitraryReducedMaybe n -- adsCreditDiscountsResponseActive :: Maybe Bool
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseDiscountCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseDiscountInMicroCurrency :: Maybe Double
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseDiscountType :: Maybe AdsCreditDiscountType
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseRemainingDiscountInMicroCurrency :: Maybe Double
    <*> arbitraryReducedMaybe n -- adsCreditDiscountsResponseTitle :: Maybe Text
  
instance Arbitrary AdsCreditRedeem where
  arbitrary = sized genAdsCreditRedeem

genAdsCreditRedeem :: Int -> Gen AdsCreditRedeem
genAdsCreditRedeem n =
  AdsCreditRedeem
    <$> arbitraryReducedMaybe n -- adsCreditRedeemErrorCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- adsCreditRedeemErrorMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- adsCreditRedeemSuccess :: Maybe Bool
  
instance Arbitrary AdsCreditRedeemCreate where
  arbitrary = sized genAdsCreditRedeemCreate

genAdsCreditRedeemCreate :: Int -> Gen AdsCreditRedeemCreate
genAdsCreditRedeemCreate n =
  AdsCreditRedeemCreate
    <$> arbitrary -- adsCreditRedeemCreateOfferCodeHash :: Text
    <*> arbitrary -- adsCreditRedeemCreateValidateOnly :: Bool
  
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
    <*> arbitraryReduced n -- adsList200ResponseItems :: [Ad]
  
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
    <$> arbitraryReduced n -- advancedAuctionItemBidOptions :: AdvancedAuctionBidOptions
    <*> arbitraryReduced n -- advancedAuctionItemCountry :: Country
    <*> arbitrary -- advancedAuctionItemItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemLanguage :: Language
  
instance Arbitrary AdvancedAuctionItems where
  arbitrary = sized genAdvancedAuctionItems

genAdvancedAuctionItems :: Int -> Gen AdvancedAuctionItems
genAdvancedAuctionItems n =
  AdvancedAuctionItems
    <$> arbitraryReducedMaybe n -- advancedAuctionItemsCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- advancedAuctionItemsItems :: Maybe [AdvancedAuctionItem]
  
instance Arbitrary AdvancedAuctionItemsGetRequest where
  arbitrary = sized genAdvancedAuctionItemsGetRequest

genAdvancedAuctionItemsGetRequest :: Int -> Gen AdvancedAuctionItemsGetRequest
genAdvancedAuctionItemsGetRequest n =
  AdvancedAuctionItemsGetRequest
    <$> arbitrary -- advancedAuctionItemsGetRequestCatalogId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsGetRequestItems :: [AdvancedAuctionKey]
  
instance Arbitrary AdvancedAuctionItemsSubmitDeleteRecord where
  arbitrary = sized genAdvancedAuctionItemsSubmitDeleteRecord

genAdvancedAuctionItemsSubmitDeleteRecord :: Int -> Gen AdvancedAuctionItemsSubmitDeleteRecord
genAdvancedAuctionItemsSubmitDeleteRecord n =
  AdvancedAuctionItemsSubmitDeleteRecord
    <$> arbitraryReduced n -- advancedAuctionItemsSubmitDeleteRecordCountry :: Country
    <*> arbitraryReducedMaybe n -- advancedAuctionItemsSubmitDeleteRecordErrors :: Maybe [AdvancedAuctionOperationError]
    <*> arbitrary -- advancedAuctionItemsSubmitDeleteRecordItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitDeleteRecordLanguage :: Language
    <*> arbitrary -- advancedAuctionItemsSubmitDeleteRecordOperation :: E'Operation
  
instance Arbitrary AdvancedAuctionItemsSubmitRecord where
  arbitrary = sized genAdvancedAuctionItemsSubmitRecord

genAdvancedAuctionItemsSubmitRecord :: Int -> Gen AdvancedAuctionItemsSubmitRecord
genAdvancedAuctionItemsSubmitRecord n =
  AdvancedAuctionItemsSubmitRecord
    <$> arbitraryReduced n -- advancedAuctionItemsSubmitRecordBidOptions :: AdvancedAuctionBidOptions
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitRecordCountry :: Country
    <*> arbitraryReducedMaybe n -- advancedAuctionItemsSubmitRecordErrors :: Maybe [AdvancedAuctionOperationError]
    <*> arbitrary -- advancedAuctionItemsSubmitRecordItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitRecordLanguage :: Language
    <*> arbitrary -- advancedAuctionItemsSubmitRecordOperation :: E'Operation
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
    <$> arbitraryReduced n -- advancedAuctionItemsSubmitUpsertRecordBidOptions :: AdvancedAuctionBidOptions
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitUpsertRecordCountry :: Country
    <*> arbitraryReducedMaybe n -- advancedAuctionItemsSubmitUpsertRecordErrors :: Maybe [AdvancedAuctionOperationError]
    <*> arbitrary -- advancedAuctionItemsSubmitUpsertRecordItemId :: Text
    <*> arbitraryReduced n -- advancedAuctionItemsSubmitUpsertRecordLanguage :: Language
    <*> arbitrary -- advancedAuctionItemsSubmitUpsertRecordOperation :: E'Operation2
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
    <$> arbitraryReducedMaybe n -- advertiserDefinedEventMappedConversionType :: Maybe ConversionTagTypeOptimal
    <*> arbitraryReducedMaybe n -- advertiserDefinedEventName :: Maybe Text
  
instance Arbitrary AdvertiserDefinedEventInput where
  arbitrary = sized genAdvertiserDefinedEventInput

genAdvertiserDefinedEventInput :: Int -> Gen AdvertiserDefinedEventInput
genAdvertiserDefinedEventInput n =
  AdvertiserDefinedEventInput
    <$> arbitraryReduced n -- advertiserDefinedEventInputMappedConversionType :: AdvertiserDefinedEventMappingType
    <*> arbitrary -- advertiserDefinedEventInputName :: Text
  
instance Arbitrary AdvertiserDefinedEventProcessingRecord where
  arbitrary = sized genAdvertiserDefinedEventProcessingRecord

genAdvertiserDefinedEventProcessingRecord :: Int -> Gen AdvertiserDefinedEventProcessingRecord
genAdvertiserDefinedEventProcessingRecord n =
  AdvertiserDefinedEventProcessingRecord
    <$> arbitraryReducedMaybe n -- advertiserDefinedEventProcessingRecordExceptions :: Maybe [Text]
    <*> arbitrary -- advertiserDefinedEventProcessingRecordName :: Text
    <*> arbitrary -- advertiserDefinedEventProcessingRecordStatus :: Text
  
instance Arbitrary AdvertiserDefinedEventsCreate200Response where
  arbitrary = sized genAdvertiserDefinedEventsCreate200Response

genAdvertiserDefinedEventsCreate200Response :: Int -> Gen AdvertiserDefinedEventsCreate200Response
genAdvertiserDefinedEventsCreate200Response n =
  AdvertiserDefinedEventsCreate200Response
    <$> arbitraryReduced n -- advertiserDefinedEventsCreate200ResponseItems :: [AdvertiserDefinedEventProcessingRecord]
  
instance Arbitrary AdvertiserDefinedEventsCreateRequest where
  arbitrary = sized genAdvertiserDefinedEventsCreateRequest

genAdvertiserDefinedEventsCreateRequest :: Int -> Gen AdvertiserDefinedEventsCreateRequest
genAdvertiserDefinedEventsCreateRequest n =
  AdvertiserDefinedEventsCreateRequest
    <$> arbitraryReduced n -- advertiserDefinedEventsCreateRequestItems :: [AdvertiserDefinedEventInput]
  
instance Arbitrary AdvertiserDefinedEventsGet200Response where
  arbitrary = sized genAdvertiserDefinedEventsGet200Response

genAdvertiserDefinedEventsGet200Response :: Int -> Gen AdvertiserDefinedEventsGet200Response
genAdvertiserDefinedEventsGet200Response n =
  AdvertiserDefinedEventsGet200Response
    <$> arbitraryReduced n -- advertiserDefinedEventsGet200ResponseItems :: [AdvertiserDefinedEvent]
  
instance Arbitrary AgeBucketMultipliers where
  arbitrary = sized genAgeBucketMultipliers

genAgeBucketMultipliers :: Int -> Gen AgeBucketMultipliers
genAgeBucketMultipliers n =
  AgeBucketMultipliers
    <$> arbitraryReducedMaybe n -- ageBucketMultipliersAgeBucket :: Maybe TargetingSpecAgeBucket
  
instance Arbitrary AggregatedPinComment where
  arbitrary = sized genAggregatedPinComment

genAggregatedPinComment :: Int -> Gen AggregatedPinComment
genAggregatedPinComment n =
  AggregatedPinComment
    <$> arbitraryReducedMaybe n -- aggregatedPinCommentAiDisclosures :: Maybe AiDisclosures
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentBoardOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentBoardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentDominantColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentHasBeenPromoted :: Maybe Bool
    <*> arbitrary -- aggregatedPinCommentId :: Text
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentIsOwner :: Maybe Bool
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentIsProduct :: Maybe Bool
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentIsStandard :: Maybe Bool
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentMedia :: Maybe PinMedia
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentParentPinId :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- aggregatedPinCommentPinMetrics :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- aggregatedPinCommentTitle :: Maybe Text
  
instance Arbitrary AiDisclosures where
  arbitrary = sized genAiDisclosures

genAiDisclosures :: Int -> Gen AiDisclosures
genAiDisclosures n =
  AiDisclosures
    <$> arbitraryReduced n -- aiDisclosuresValues :: [AiDisclosureItem]
  
instance Arbitrary AiDisclosuresUpdate where
  arbitrary = sized genAiDisclosuresUpdate

genAiDisclosuresUpdate :: Int -> Gen AiDisclosuresUpdate
genAiDisclosuresUpdate n =
  AiDisclosuresUpdate
    <$> arbitraryReducedMaybe n -- aiDisclosuresUpdateValues :: Maybe [AiDisclosureItem]
  
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
  
instance Arbitrary AmazonConnectResponse where
  arbitrary = sized genAmazonConnectResponse

genAmazonConnectResponse :: Int -> Gen AmazonConnectResponse
genAmazonConnectResponse n =
  AmazonConnectResponse
    <$> arbitraryReducedMaybe n -- amazonConnectResponseMessage :: Maybe Text
  
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
  
instance Arbitrary AppTypeMultipliers where
  arbitrary = sized genAppTypeMultipliers

genAppTypeMultipliers :: Int -> Gen AppTypeMultipliers
genAppTypeMultipliers n =
  AppTypeMultipliers
    <$> arbitraryReducedMaybe n -- appTypeMultipliersAppType :: Maybe TargetingSpecAppType
  
instance Arbitrary AppsflyerAudience where
  arbitrary = sized genAppsflyerAudience

genAppsflyerAudience :: Int -> Gen AppsflyerAudience
genAppsflyerAudience n =
  AppsflyerAudience
    <$> arbitrary -- appsflyerAudienceContainerId :: Text
    <*> arbitrary -- appsflyerAudienceName :: Text
    <*> arbitraryReduced n -- appsflyerAudiencePlatform :: AppsflyerPlatform
  
instance Arbitrary AppsflyerAudienceCreate where
  arbitrary = sized genAppsflyerAudienceCreate

genAppsflyerAudienceCreate :: Int -> Gen AppsflyerAudienceCreate
genAppsflyerAudienceCreate n =
  AppsflyerAudienceCreate
    <$> arbitrary -- appsflyerAudienceCreateName :: Text
    <*> arbitraryReduced n -- appsflyerAudienceCreatePlatform :: AppsflyerPlatform
  
instance Arbitrary AppsflyerAudienceSyncCreate where
  arbitrary = sized genAppsflyerAudienceSyncCreate

genAppsflyerAudienceSyncCreate :: Int -> Gen AppsflyerAudienceSyncCreate
genAppsflyerAudienceSyncCreate n =
  AppsflyerAudienceSyncCreate
    <$> arbitrary -- appsflyerAudienceSyncCreateContainerId :: Text
    <*> arbitraryReducedMaybe n -- appsflyerAudienceSyncCreateUrlAdidSha256 :: Maybe Text
    <*> arbitraryReducedMaybe n -- appsflyerAudienceSyncCreateUrlEmailSha256 :: Maybe Text
  
instance Arbitrary AssetAccessRequestError where
  arbitrary = sized genAssetAccessRequestError

genAssetAccessRequestError :: Int -> Gen AssetAccessRequestError
genAssetAccessRequestError n =
  AssetAccessRequestError
    <$> arbitraryReducedMaybe n -- assetAccessRequestErrorCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- assetAccessRequestErrorMessages :: Maybe [Text]
  
instance Arbitrary AssetGroupBinding where
  arbitrary = sized genAssetGroupBinding

genAssetGroupBinding :: Int -> Gen AssetGroupBinding
genAssetGroupBinding n =
  AssetGroupBinding
    <$> arbitrary -- assetGroupBindingAdAccountsIds :: [Text]
    <*> arbitrary -- assetGroupBindingAssetGroupDescription :: Text
    <*> arbitrary -- assetGroupBindingAssetGroupName :: Text
    <*> arbitrary -- assetGroupBindingAssetGroupTypes :: [Text]
    <*> arbitrary -- assetGroupBindingCatalogsIds :: [Text]
    <*> arbitraryReduced n -- assetGroupBindingCreatedBy :: BusinessAccessUserSummary
    <*> arbitrary -- assetGroupBindingCreatedTime :: Int
    <*> arbitrary -- assetGroupBindingId :: Text
    <*> arbitraryReduced n -- assetGroupBindingOwner :: BusinessAccessUserSummary
    <*> arbitrary -- assetGroupBindingProfilesIds :: [Text]
    <*> arbitrary -- assetGroupBindingUpdatedTime :: Int
  
instance Arbitrary AssetGroupDeleteError where
  arbitrary = sized genAssetGroupDeleteError

genAssetGroupDeleteError :: Int -> Gen AssetGroupDeleteError
genAssetGroupDeleteError n =
  AssetGroupDeleteError
    <$> arbitraryReducedMaybe n -- assetGroupDeleteErrorAssetGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetGroupDeleteErrorCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- assetGroupDeleteErrorMessage :: Maybe Text
  
instance Arbitrary AssetGroupDeletion where
  arbitrary = sized genAssetGroupDeletion

genAssetGroupDeletion :: Int -> Gen AssetGroupDeletion
genAssetGroupDeletion n =
  AssetGroupDeletion
    <$> arbitraryReducedMaybe n -- assetGroupDeletionDeletedAssetGroups :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- assetGroupDeletionExceptions :: Maybe [AssetGroupDeleteError]
  
instance Arbitrary AssetGroupDeletionDelete where
  arbitrary = sized genAssetGroupDeletionDelete

genAssetGroupDeletionDelete :: Int -> Gen AssetGroupDeletionDelete
genAssetGroupDeletionDelete n =
  AssetGroupDeletionDelete
    <$> arbitrary -- assetGroupDeletionDeleteAssetGroupsToDelete :: [Text]
  
instance Arbitrary AssetGroupInput where
  arbitrary = sized genAssetGroupInput

genAssetGroupInput :: Int -> Gen AssetGroupInput
genAssetGroupInput n =
  AssetGroupInput
    <$> arbitraryReducedMaybe n -- assetGroupInputAssetGroup :: Maybe AssetGroupBinding
  
instance Arbitrary AssetGroupInputCreate where
  arbitrary = sized genAssetGroupInputCreate

genAssetGroupInputCreate :: Int -> Gen AssetGroupInputCreate
genAssetGroupInputCreate n =
  AssetGroupInputCreate
    <$> arbitraryReducedMaybe n -- assetGroupInputCreateAssetGroup :: Maybe AssetGroupBinding
    <*> arbitrary -- assetGroupInputCreateAssetGroupDescription :: Text
    <*> arbitrary -- assetGroupInputCreateAssetGroupName :: Text
    <*> arbitraryReduced n -- assetGroupInputCreateAssetGroupTypes :: [AssetGroupType]
  
instance Arbitrary AssetGroupModification where
  arbitrary = sized genAssetGroupModification

genAssetGroupModification :: Int -> Gen AssetGroupModification
genAssetGroupModification n =
  AssetGroupModification
    <$> arbitraryReducedMaybe n -- assetGroupModificationExceptions :: Maybe [AssetGroupUpdateError]
    <*> arbitraryReducedMaybe n -- assetGroupModificationUpdatedAssetGroups :: Maybe [AssetGroupBinding]
  
instance Arbitrary AssetGroupModificationReadOrUpdate where
  arbitrary = sized genAssetGroupModificationReadOrUpdate

genAssetGroupModificationReadOrUpdate :: Int -> Gen AssetGroupModificationReadOrUpdate
genAssetGroupModificationReadOrUpdate n =
  AssetGroupModificationReadOrUpdate
    <$> arbitraryReducedMaybe n -- assetGroupModificationReadOrUpdateAssetGroupsToUpdate :: Maybe [AssetGroupUpdateItemReadOrUpdateItem]
    <*> arbitraryReducedMaybe n -- assetGroupModificationReadOrUpdateExceptions :: Maybe [AssetGroupUpdateError]
    <*> arbitraryReducedMaybe n -- assetGroupModificationReadOrUpdateUpdatedAssetGroups :: Maybe [AssetGroupBinding]
  
instance Arbitrary AssetGroupUpdateError where
  arbitrary = sized genAssetGroupUpdateError

genAssetGroupUpdateError :: Int -> Gen AssetGroupUpdateError
genAssetGroupUpdateError n =
  AssetGroupUpdateError
    <$> arbitraryReducedMaybe n -- assetGroupUpdateErrorAssetGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetGroupUpdateErrorCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- assetGroupUpdateErrorMessage :: Maybe Text
  
instance Arbitrary AssetGroupUpdateItemReadOrUpdateItem where
  arbitrary = sized genAssetGroupUpdateItemReadOrUpdateItem

genAssetGroupUpdateItemReadOrUpdateItem :: Int -> Gen AssetGroupUpdateItemReadOrUpdateItem
genAssetGroupUpdateItemReadOrUpdateItem n =
  AssetGroupUpdateItemReadOrUpdateItem
    <$> arbitrary -- assetGroupUpdateItemReadOrUpdateItemAssetGroupId :: Text
    <*> arbitraryReducedMaybe n -- assetGroupUpdateItemReadOrUpdateItemAssetGroupTypes :: Maybe [AssetGroupType]
    <*> arbitraryReducedMaybe n -- assetGroupUpdateItemReadOrUpdateItemAssetsToAdd :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- assetGroupUpdateItemReadOrUpdateItemAssetsToRemove :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- assetGroupUpdateItemReadOrUpdateItemDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetGroupUpdateItemReadOrUpdateItemName :: Maybe Text
  
instance Arbitrary AssetIdPermissions where
  arbitrary = sized genAssetIdPermissions

genAssetIdPermissions :: Int -> Gen AssetIdPermissions
genAssetIdPermissions n =
  AssetIdPermissions
    <$> arbitraryReducedMaybe n -- assetIdPermissionsAssetGroupInfo :: Maybe AssetGroupBinding
    <*> arbitrary -- assetIdPermissionsAssetId :: Text
    <*> arbitraryReduced n -- assetIdPermissionsAssetType :: AssetTypeResponse
    <*> arbitrary -- assetIdPermissionsPermissions :: [Text]
  
instance Arbitrary AssetIdWithPermissions where
  arbitrary = sized genAssetIdWithPermissions

genAssetIdWithPermissions :: Int -> Gen AssetIdWithPermissions
genAssetIdWithPermissions n =
  AssetIdWithPermissions
    <$> arbitraryReducedMaybe n -- assetIdWithPermissionsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- assetIdWithPermissionsPermissions :: Maybe [Text]
  
instance Arbitrary AttributionWindows where
  arbitrary = sized genAttributionWindows

genAttributionWindows :: Int -> Gen AttributionWindows
genAttributionWindows n =
  AttributionWindows
    <$> arbitraryReducedMaybe n -- attributionWindowsClickWindowDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- attributionWindowsEngagementWindowDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- attributionWindowsViewWindowDays :: Maybe Int
  
instance Arbitrary Audience where
  arbitrary = sized genAudience

genAudience :: Int -> Gen Audience
genAudience n =
  Audience
    <$> arbitraryReducedMaybe n -- audienceAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceAudienceType :: Maybe PinnerListType
    <*> arbitraryReducedMaybe n -- audienceCreatedByCompanyName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceCreatedTimestamp :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceId :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceIsNca :: Maybe Bool
    <*> arbitraryReducedMaybe n -- audienceName :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceRule :: Maybe AudienceRule
    <*> arbitraryReducedMaybe n -- audienceSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceStatus :: Maybe AudienceStatus
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
  
instance Arbitrary AudienceDefinition where
  arbitrary = sized genAudienceDefinition

genAudienceDefinition :: Int -> Gen AudienceDefinition
genAudienceDefinition n =
  AudienceDefinition
    <$> arbitraryReducedMaybe n -- audienceDefinitionDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceDefinitionScope :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceDefinitionType :: Maybe Text
  
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
  
instance Arbitrary AudienceInsights where
  arbitrary = sized genAudienceInsights

genAudienceInsights :: Int -> Gen AudienceInsights
genAudienceInsights n =
  AudienceInsights
    <$> arbitraryReducedMaybe n -- audienceInsightsCategories :: Maybe [AudienceCategory]
    <*> arbitraryReducedMaybe n -- audienceInsightsDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- audienceInsightsDemographics :: Maybe AudienceDemographics
    <*> arbitraryReducedMaybe n -- audienceInsightsSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- audienceInsightsSizeIsUpperBound :: Maybe Bool
    <*> arbitraryReducedMaybe n -- audienceInsightsType :: Maybe AudienceInsightType
  
instance Arbitrary AudienceInsightsScopeAndTypeGet200Response where
  arbitrary = sized genAudienceInsightsScopeAndTypeGet200Response

genAudienceInsightsScopeAndTypeGet200Response :: Int -> Gen AudienceInsightsScopeAndTypeGet200Response
genAudienceInsightsScopeAndTypeGet200Response n =
  AudienceInsightsScopeAndTypeGet200Response
    <$> arbitraryReduced n -- audienceInsightsScopeAndTypeGet200ResponseItems :: [AudienceDefinition]
  
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
  
instance Arbitrary AudiencesList200Response where
  arbitrary = sized genAudiencesList200Response

genAudiencesList200Response :: Int -> Gen AudiencesList200Response
genAudiencesList200Response n =
  AudiencesList200Response
    <$> arbitraryReducedMaybe n -- audiencesList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- audiencesList200ResponseItems :: [AdAccountsAudience]
  
instance Arbitrary AuthRespondInviteAction where
  arbitrary = sized genAuthRespondInviteAction

genAuthRespondInviteAction :: Int -> Gen AuthRespondInviteAction
genAuthRespondInviteAction n =
  AuthRespondInviteAction
    <$> arbitrary -- authRespondInviteActionAcceptInvite :: Bool
    <*> arbitraryReducedMaybe n -- authRespondInviteActionAssetIdToPermissions :: Maybe (Map.Map String Array)
  
instance Arbitrary AuthRespondInvitesBody where
  arbitrary = sized genAuthRespondInvitesBody

genAuthRespondInvitesBody :: Int -> Gen AuthRespondInvitesBody
genAuthRespondInvitesBody n =
  AuthRespondInvitesBody
    <$> arbitraryReduced n -- authRespondInvitesBodyInvites :: [AuthRespondInvitesBodyItem]
  
instance Arbitrary AuthRespondInvitesBodyItem where
  arbitrary = sized genAuthRespondInvitesBodyItem

genAuthRespondInvitesBodyItem :: Int -> Gen AuthRespondInvitesBodyItem
genAuthRespondInvitesBodyItem n =
  AuthRespondInvitesBodyItem
    <$> arbitraryReduced n -- authRespondInvitesBodyItemAction :: AuthRespondInviteAction
    <*> arbitrary -- authRespondInvitesBodyItemInviteId :: Text
  
instance Arbitrary AvailabilityFilter where
  arbitrary = sized genAvailabilityFilter

genAvailabilityFilter :: Int -> Gen AvailabilityFilter
genAvailabilityFilter n =
  AvailabilityFilter
    <$> arbitraryReduced n -- availabilityFilterAvailability :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary BaseBusinessAssets where
  arbitrary = sized genBaseBusinessAssets

genBaseBusinessAssets :: Int -> Gen BaseBusinessAssets
genBaseBusinessAssets n =
  BaseBusinessAssets
    <$> arbitraryReducedMaybe n -- baseBusinessAssetsAssetGroupInfo :: Maybe AssetGroupBinding
    <*> arbitraryReducedMaybe n -- baseBusinessAssetsAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseBusinessAssetsAssetType :: Maybe AssetTypeResponse
    <*> arbitraryReducedMaybe n -- baseBusinessAssetsPermissions :: Maybe [Text]
  
instance Arbitrary BaseInviteDataResponse where
  arbitrary = sized genBaseInviteDataResponse

genBaseInviteDataResponse :: Int -> Gen BaseInviteDataResponse
genBaseInviteDataResponse n =
  BaseInviteDataResponse
    <$> arbitraryReducedMaybe n -- baseInviteDataResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseInviteDataResponseInviteData :: Maybe InviteDataResponse
    <*> arbitraryReducedMaybe n -- baseInviteDataResponseIsReceivedInvite :: Maybe Bool
    <*> arbitraryReducedMaybe n -- baseInviteDataResponseUser :: Maybe BusinessAccessUserSummary
  
instance Arbitrary BidFloor where
  arbitrary = sized genBidFloor

genBidFloor :: Int -> Gen BidFloor
genBidFloor n =
  BidFloor
    <$> arbitraryReducedMaybe n -- bidFloorBidFloors :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- bidFloorType :: Maybe Text
  
instance Arbitrary BidFloorCreate where
  arbitrary = sized genBidFloorCreate

genBidFloorCreate :: Int -> Gen BidFloorCreate
genBidFloorCreate n =
  BidFloorCreate
    <$> arbitraryReduced n -- bidFloorCreateBidFloorSpecs :: [BidFloorSpec]
    <*> arbitraryReducedMaybe n -- bidFloorCreateTargetingSpec :: Maybe TargetingSpecOptimal
  
instance Arbitrary BidFloorSpec where
  arbitrary = sized genBidFloorSpec

genBidFloorSpec :: Int -> Gen BidFloorSpec
genBidFloorSpec n =
  BidFloorSpec
    <$> arbitraryReduced n -- bidFloorSpecBillableEvent :: ActionType
    <*> arbitraryReducedMaybe n -- bidFloorSpecCountries :: Maybe [Country]
    <*> arbitraryReducedMaybe n -- bidFloorSpecCreativeType :: Maybe CreativeType
    <*> arbitraryReduced n -- bidFloorSpecCurrency :: Currency
    <*> arbitraryReducedMaybe n -- bidFloorSpecObjectiveType :: Maybe BidFloorObjectiveType
    <*> arbitraryReducedMaybe n -- bidFloorSpecOptimizationGoalMetadata :: Maybe OptimizationGoalMetadata
  
instance Arbitrary BidOptionsAgeBucketMultipliers where
  arbitrary = sized genBidOptionsAgeBucketMultipliers

genBidOptionsAgeBucketMultipliers :: Int -> Gen BidOptionsAgeBucketMultipliers
genBidOptionsAgeBucketMultipliers n =
  BidOptionsAgeBucketMultipliers
    <$> arbitraryReducedMaybe n -- bidOptionsAgeBucketMultipliers1824 :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsAgeBucketMultipliers2534 :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsAgeBucketMultipliers3544 :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsAgeBucketMultipliers4549 :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsAgeBucketMultipliers5054 :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsAgeBucketMultipliers5564 :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsAgeBucketMultipliers65 :: Maybe Double
  
instance Arbitrary BidOptionsAppTypeMultipliers where
  arbitrary = sized genBidOptionsAppTypeMultipliers

genBidOptionsAppTypeMultipliers :: Int -> Gen BidOptionsAppTypeMultipliers
genBidOptionsAppTypeMultipliers n =
  BidOptionsAppTypeMultipliers
    <$> arbitraryReducedMaybe n -- bidOptionsAppTypeMultipliersAndroidMobile :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsAppTypeMultipliersAndroidTablet :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsAppTypeMultipliersIpad :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsAppTypeMultipliersIphone :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsAppTypeMultipliersWeb :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsAppTypeMultipliersWebMobile :: Maybe Double
  
instance Arbitrary BidOptionsAudienceMultipliers where
  arbitrary = sized genBidOptionsAudienceMultipliers

genBidOptionsAudienceMultipliers :: Int -> Gen BidOptionsAudienceMultipliers
genBidOptionsAudienceMultipliers n =
  BidOptionsAudienceMultipliers
    <$> arbitrary -- bidOptionsAudienceMultipliersAudienceId :: Text
    <*> arbitrary -- bidOptionsAudienceMultipliersMultiplier :: Double
  
instance Arbitrary BidOptionsGenderMultipliers where
  arbitrary = sized genBidOptionsGenderMultipliers

genBidOptionsGenderMultipliers :: Int -> Gen BidOptionsGenderMultipliers
genBidOptionsGenderMultipliers n =
  BidOptionsGenderMultipliers
    <$> arbitraryReducedMaybe n -- bidOptionsGenderMultipliersFemale :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsGenderMultipliersMale :: Maybe Double
  
instance Arbitrary BidOptionsPlacementMultipliers where
  arbitrary = sized genBidOptionsPlacementMultipliers

genBidOptionsPlacementMultipliers :: Int -> Gen BidOptionsPlacementMultipliers
genBidOptionsPlacementMultipliers n =
  BidOptionsPlacementMultipliers
    <$> arbitraryReducedMaybe n -- bidOptionsPlacementMultipliersBrowse :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsPlacementMultipliersRelatedPins :: Maybe Double
    <*> arbitraryReducedMaybe n -- bidOptionsPlacementMultipliersSearch :: Maybe Double
  
instance Arbitrary BillingInvoice where
  arbitrary = sized genBillingInvoice

genBillingInvoice :: Int -> Gen BillingInvoice
genBillingInvoice n =
  BillingInvoice
    <$> arbitraryReducedMaybe n -- billingInvoiceAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceAdAccountName :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceAmountBilledMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- billingInvoiceAmountDiscountMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- billingInvoiceAmountNetMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- billingInvoiceAmountTaxMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- billingInvoiceBillToCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceBillingPeriodEndDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- billingInvoiceBillingPeriodStartDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- billingInvoiceCurrency :: Maybe Currency
    <*> arbitraryReducedMaybe n -- billingInvoiceDocumentType :: Maybe BillingInvoiceDocumentType
    <*> arbitraryReducedMaybe n -- billingInvoiceId :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceInvoiceDueDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- billingInvoicePaymentTerms :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceStatus :: Maybe BillingInvoiceStatus
  
instance Arbitrary BillingInvoiceDownloadResponse where
  arbitrary = sized genBillingInvoiceDownloadResponse

genBillingInvoiceDownloadResponse :: Int -> Gen BillingInvoiceDownloadResponse
genBillingInvoiceDownloadResponse n =
  BillingInvoiceDownloadResponse
    <$> arbitraryReducedMaybe n -- billingInvoiceDownloadResponseDownloadUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingInvoiceDownloadResponseId :: Maybe Text
  
instance Arbitrary BillingInvoicesGet200Response where
  arbitrary = sized genBillingInvoicesGet200Response

genBillingInvoicesGet200Response :: Int -> Gen BillingInvoicesGet200Response
genBillingInvoicesGet200Response n =
  BillingInvoicesGet200Response
    <$> arbitraryReducedMaybe n -- billingInvoicesGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- billingInvoicesGet200ResponseItems :: [BillingInvoice]
  
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
    <*> arbitraryReducedMaybe n -- billingProfilesResponseBillingType :: Maybe BillingType
    <*> arbitraryReducedMaybe n -- billingProfilesResponseCardType :: Maybe BillingProfileCardType
    <*> arbitraryReducedMaybe n -- billingProfilesResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- billingProfilesResponsePaymentMethodBrand :: Maybe BillingProfilePaymentMethodBrand
    <*> arbitraryReducedMaybe n -- billingProfilesResponseStatus :: Maybe BillingProfileStatus
  
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
  
instance Arbitrary BoardSectionCreate where
  arbitrary = sized genBoardSectionCreate

genBoardSectionCreate :: Int -> Gen BoardSectionCreate
genBoardSectionCreate n =
  BoardSectionCreate
    <$> arbitraryReducedMaybe n -- boardSectionCreateId :: Maybe Text
    <*> arbitrary -- boardSectionCreateName :: Text
  
instance Arbitrary BoardSectionUpdateWithRequiredBody where
  arbitrary = sized genBoardSectionUpdateWithRequiredBody

genBoardSectionUpdateWithRequiredBody :: Int -> Gen BoardSectionUpdateWithRequiredBody
genBoardSectionUpdateWithRequiredBody n =
  BoardSectionUpdateWithRequiredBody
    <$> arbitraryReducedMaybe n -- boardSectionUpdateWithRequiredBodyId :: Maybe Text
    <*> arbitrary -- boardSectionUpdateWithRequiredBodyName :: Text
  
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
    <*> arbitraryReduced n -- boardsListPins200ResponseItems :: [PinRead]
  
instance Arbitrary BookClosed where
  arbitrary = sized genBookClosed

genBookClosed :: Int -> Gen BookClosed
genBookClosed n =
  BookClosed
    <$> arbitrary -- bookClosedConversionMetricsReady :: Bool
    <*> arbitrary -- bookClosedNonConversionMetricsReady :: Bool
  
instance Arbitrary BrandAccount where
  arbitrary = sized genBrandAccount

genBrandAccount :: Int -> Gen BrandAccount
genBrandAccount n =
  BrandAccount
    <$> arbitrary -- brandAccountBrandAccountId :: Text
  
instance Arbitrary BrandAccountCreate where
  arbitrary = sized genBrandAccountCreate

genBrandAccountCreate :: Int -> Gen BrandAccountCreate
genBrandAccountCreate n =
  BrandAccountCreate
    <$> arbitraryReducedMaybe n -- brandAccountCreateAbout :: Maybe Text
    <*> arbitraryReduced n -- brandAccountCreateCountry :: Country
    <*> arbitrary -- brandAccountCreateName :: Text
    <*> arbitraryReducedMaybe n -- brandAccountCreateProfileImage :: Maybe BrandAccountProfileImage
    <*> arbitrary -- brandAccountCreateUsername :: Text
    <*> arbitraryReducedMaybe n -- brandAccountCreateWebsite :: Maybe Text
  
instance Arbitrary BrandAccountProfileImage where
  arbitrary = sized genBrandAccountProfileImage

genBrandAccountProfileImage :: Int -> Gen BrandAccountProfileImage
genBrandAccountProfileImage n =
  BrandAccountProfileImage
    <$> arbitrary -- brandAccountProfileImageContentType :: E'ContentType
    <*> arbitrary -- brandAccountProfileImageData :: Text
  
instance Arbitrary BrandAccountProfileImageUpdate where
  arbitrary = sized genBrandAccountProfileImageUpdate

genBrandAccountProfileImageUpdate :: Int -> Gen BrandAccountProfileImageUpdate
genBrandAccountProfileImageUpdate n =
  BrandAccountProfileImageUpdate
    <$> arbitraryReducedMaybe n -- brandAccountProfileImageUpdateContentType :: Maybe E'ContentType
    <*> arbitraryReducedMaybe n -- brandAccountProfileImageUpdateData :: Maybe Text
  
instance Arbitrary BrandAccountUpdate where
  arbitrary = sized genBrandAccountUpdate

genBrandAccountUpdate :: Int -> Gen BrandAccountUpdate
genBrandAccountUpdate n =
  BrandAccountUpdate
    <$> arbitraryReducedMaybe n -- brandAccountUpdateAbout :: Maybe Text
    <*> arbitraryReducedMaybe n -- brandAccountUpdateCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- brandAccountUpdateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- brandAccountUpdateProfileImage :: Maybe BrandAccountProfileImageUpdate
    <*> arbitraryReducedMaybe n -- brandAccountUpdateUsername :: Maybe Text
    <*> arbitraryReducedMaybe n -- brandAccountUpdateWebsite :: Maybe Text
  
instance Arbitrary BrandFilter where
  arbitrary = sized genBrandFilter

genBrandFilter :: Int -> Gen BrandFilter
genBrandFilter n =
  BrandFilter
    <$> arbitraryReduced n -- brandFilterBrand :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary BulkCampaignDeliveryEstimatesItem where
  arbitrary = sized genBulkCampaignDeliveryEstimatesItem

genBulkCampaignDeliveryEstimatesItem :: Int -> Gen BulkCampaignDeliveryEstimatesItem
genBulkCampaignDeliveryEstimatesItem n =
  BulkCampaignDeliveryEstimatesItem
    <$> arbitraryReducedMaybe n -- bulkCampaignDeliveryEstimatesItemAdgroupAudienceSizes :: Maybe [CampaignPlanningAdGroupAudienceSize]
    <*> arbitraryReducedMaybe n -- bulkCampaignDeliveryEstimatesItemConversionRate :: Maybe Float
    <*> arbitraryReducedMaybe n -- bulkCampaignDeliveryEstimatesItemConversionRates :: Maybe [CampaignPlanningConversionRate]
    <*> arbitraryReducedMaybe n -- bulkCampaignDeliveryEstimatesItemCurves :: Maybe [CampaignPlanningCurveEstimate]
    <*> arbitraryReducedMaybe n -- bulkCampaignDeliveryEstimatesItemDerivedMetrics :: Maybe CampaignDeliveryEstimatesDerivedMetrics
    <*> arbitraryReducedMaybe n -- bulkCampaignDeliveryEstimatesItemErrors :: Maybe [CampaignPlanningResponseError]
    <*> arbitraryReducedMaybe n -- bulkCampaignDeliveryEstimatesItemEstimateId :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkCampaignDeliveryEstimatesItemMaxPotentialSpend :: Maybe Int
  
instance Arbitrary BulkCampaignDeliveryEstimatesResponse where
  arbitrary = sized genBulkCampaignDeliveryEstimatesResponse

genBulkCampaignDeliveryEstimatesResponse :: Int -> Gen BulkCampaignDeliveryEstimatesResponse
genBulkCampaignDeliveryEstimatesResponse n =
  BulkCampaignDeliveryEstimatesResponse
    <$> arbitraryReduced n -- bulkCampaignDeliveryEstimatesResponseData :: [BulkCampaignDeliveryEstimatesItem]
  
instance Arbitrary BulkDownload where
  arbitrary = sized genBulkDownload

genBulkDownload :: Int -> Gen BulkDownload
genBulkDownload n =
  BulkDownload
    <$> arbitraryReducedMaybe n -- bulkDownloadRequestId :: Maybe Text
  
instance Arbitrary BulkDownloadCampaignFilter where
  arbitrary = sized genBulkDownloadCampaignFilter

genBulkDownloadCampaignFilter :: Int -> Gen BulkDownloadCampaignFilter
genBulkDownloadCampaignFilter n =
  BulkDownloadCampaignFilter
    <$> arbitraryReducedMaybe n -- bulkDownloadCampaignFilterCampaignStatus :: Maybe [SummaryStatus]
    <*> arbitraryReducedMaybe n -- bulkDownloadCampaignFilterEndTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkDownloadCampaignFilterName :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkDownloadCampaignFilterObjectiveType :: Maybe [ConversionObjectiveType]
    <*> arbitraryReducedMaybe n -- bulkDownloadCampaignFilterStartTime :: Maybe Text
  
instance Arbitrary BulkDownloadCreate where
  arbitrary = sized genBulkDownloadCreate

genBulkDownloadCreate :: Int -> Gen BulkDownloadCreate
genBulkDownloadCreate n =
  BulkDownloadCreate
    <$> arbitraryReducedMaybe n -- bulkDownloadCreateCampaignFilter :: Maybe BulkDownloadCampaignFilter
    <*> arbitraryReducedMaybe n -- bulkDownloadCreateEntityIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- bulkDownloadCreateEntityTypes :: Maybe [BulkEntityType]
    <*> arbitraryReducedMaybe n -- bulkDownloadCreateOutputFormat :: Maybe BulkOutputFormat
    <*> arbitraryReducedMaybe n -- bulkDownloadCreateUpdatedSince :: Maybe Text
  
instance Arbitrary BulkJobData where
  arbitrary = sized genBulkJobData

genBulkJobData :: Int -> Gen BulkJobData
genBulkJobData n =
  BulkJobData
    <$> arbitraryReducedMaybe n -- bulkJobDataResultUrl :: Maybe Text
    <*> arbitraryReduced n -- bulkJobDataStatus :: BulkRequestStatus
    <*> arbitraryReducedMaybe n -- bulkJobDataWorkloadId :: Maybe Int
  
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
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateCatalogProductGroups :: Maybe [BulkUpsertRequestCreateCatalogProductGroupsItems]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateKeywords :: Maybe [KeywordsRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateLabels :: Maybe [LabelBulkCreateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateProductGroups :: Maybe [ProductGroupPromotionCreateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateSchedules :: Maybe [ScheduleCreateRequest]
  
instance Arbitrary BulkUpsertRequestCreateCatalogProductGroupsItems where
  arbitrary = sized genBulkUpsertRequestCreateCatalogProductGroupsItems

genBulkUpsertRequestCreateCatalogProductGroupsItems :: Int -> Gen BulkUpsertRequestCreateCatalogProductGroupsItems
genBulkUpsertRequestCreateCatalogProductGroupsItems n =
  BulkUpsertRequestCreateCatalogProductGroupsItems
    <$> arbitraryReducedMaybe n -- bulkUpsertRequestCreateCatalogProductGroupsItemsDescription :: Maybe Text
    <*> arbitrary -- bulkUpsertRequestCreateCatalogProductGroupsItemsFeedId :: Text
    <*> arbitraryReduced n -- bulkUpsertRequestCreateCatalogProductGroupsItemsFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateCatalogProductGroupsItemsIsFeatured :: Maybe Bool
    <*> arbitrary -- bulkUpsertRequestCreateCatalogProductGroupsItemsName :: Text
    <*> arbitrary -- bulkUpsertRequestCreateCatalogProductGroupsItemsCatalogId :: Text
    <*> arbitrary -- bulkUpsertRequestCreateCatalogProductGroupsItemsCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateCatalogProductGroupsItemsCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestCreateCatalogProductGroupsItemsLocale :: Maybe CatalogsLocale
  
instance Arbitrary BulkUpsertRequestUpdate where
  arbitrary = sized genBulkUpsertRequestUpdate

genBulkUpsertRequestUpdate :: Int -> Gen BulkUpsertRequestUpdate
genBulkUpsertRequestUpdate n =
  BulkUpsertRequestUpdate
    <$> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateAdGroups :: Maybe [AdGroupUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateAds :: Maybe [AdUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCampaigns :: Maybe [CampaignUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCatalogProductGroups :: Maybe [BulkUpsertRequestUpdateCatalogProductGroupsItems]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateKeywords :: Maybe [KeywordUpdateGenerated]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateLabels :: Maybe [LabelBulkUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateProductGroups :: Maybe [ProductGroupPromotionUpdateRequest]
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateSchedules :: Maybe [ScheduleUpdateRequest]
  
instance Arbitrary BulkUpsertRequestUpdateCatalogProductGroupsItems where
  arbitrary = sized genBulkUpsertRequestUpdateCatalogProductGroupsItems

genBulkUpsertRequestUpdateCatalogProductGroupsItems :: Int -> Gen BulkUpsertRequestUpdateCatalogProductGroupsItems
genBulkUpsertRequestUpdateCatalogProductGroupsItems n =
  BulkUpsertRequestUpdateCatalogProductGroupsItems
    <$> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCatalogProductGroupsItemsDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCatalogProductGroupsItemsFilters :: Maybe CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCatalogProductGroupsItemsIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCatalogProductGroupsItemsName :: Maybe Text
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCatalogProductGroupsItemsCatalogType :: Maybe E'CatalogType
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCatalogProductGroupsItemsCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- bulkUpsertRequestUpdateCatalogProductGroupsItemsLocale :: Maybe CatalogsLocale
  
instance Arbitrary BulkUpsertResponse where
  arbitrary = sized genBulkUpsertResponse

genBulkUpsertResponse :: Int -> Gen BulkUpsertResponse
genBulkUpsertResponse n =
  BulkUpsertResponse
    <$> arbitraryReducedMaybe n -- bulkUpsertResponseRequestId :: Maybe Text
  
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
  
instance Arbitrary BusinessAssets where
  arbitrary = sized genBusinessAssets

genBusinessAssets :: Int -> Gen BusinessAssets
genBusinessAssets n =
  BusinessAssets
    <$> arbitraryReducedMaybe n -- businessAssetsAssetGroupInfo :: Maybe AssetGroupBinding
    <*> arbitraryReducedMaybe n -- businessAssetsAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- businessAssetsAssetType :: Maybe AssetTypeResponse
    <*> arbitraryReducedMaybe n -- businessAssetsPermissions :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- businessAssetsCatalogInfo :: Maybe CatalogBinding
  
instance Arbitrary BusinessAssetsGet200Response where
  arbitrary = sized genBusinessAssetsGet200Response

genBusinessAssetsGet200Response :: Int -> Gen BusinessAssetsGet200Response
genBusinessAssetsGet200Response n =
  BusinessAssetsGet200Response
    <$> arbitraryReducedMaybe n -- businessAssetsGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- businessAssetsGet200ResponseItems :: [BusinessAssets]
  
instance Arbitrary BusinessMemberAssetsGetResponse where
  arbitrary = sized genBusinessMemberAssetsGetResponse

genBusinessMemberAssetsGetResponse :: Int -> Gen BusinessMemberAssetsGetResponse
genBusinessMemberAssetsGetResponse n =
  BusinessMemberAssetsGetResponse
    <$> arbitraryReducedMaybe n -- businessMemberAssetsGetResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- businessMemberAssetsGetResponseItems :: [AssetIdPermissions]
    <*> arbitrary -- businessMemberAssetsGetResponseTotalDataCount :: Int
    <*> arbitraryReducedMaybe n -- businessMemberAssetsGetResponseTotalDataCountByStatus :: Maybe TotalCountByEntityStatus
  
instance Arbitrary BusinessMemberAssetsSummary where
  arbitrary = sized genBusinessMemberAssetsSummary

genBusinessMemberAssetsSummary :: Int -> Gen BusinessMemberAssetsSummary
genBusinessMemberAssetsSummary n =
  BusinessMemberAssetsSummary
    <$> arbitraryReducedMaybe n -- businessMemberAssetsSummaryAdAccounts :: Maybe [AssetIdWithPermissions]
    <*> arbitraryReducedMaybe n -- businessMemberAssetsSummaryProfiles :: Maybe [AssetIdWithPermissions]
  
instance Arbitrary BusinessMembersAssetAccessDeleteBody where
  arbitrary = sized genBusinessMembersAssetAccessDeleteBody

genBusinessMembersAssetAccessDeleteBody :: Int -> Gen BusinessMembersAssetAccessDeleteBody
genBusinessMembersAssetAccessDeleteBody n =
  BusinessMembersAssetAccessDeleteBody
    <$> arbitraryReduced n -- businessMembersAssetAccessDeleteBodyAccesses :: [DeleteMemberAssetAccessItem]
  
instance Arbitrary BusinessMembershipMember where
  arbitrary = sized genBusinessMembershipMember

genBusinessMembershipMember :: Int -> Gen BusinessMembershipMember
genBusinessMembershipMember n =
  BusinessMembershipMember
    <$> arbitraryReduced n -- businessMembershipMemberBusinessRole :: BusinessRoleForMembers
    <*> arbitrary -- businessMembershipMemberMemberId :: Text
  
instance Arbitrary BusinessPartnerAssetAccessGet200Response where
  arbitrary = sized genBusinessPartnerAssetAccessGet200Response

genBusinessPartnerAssetAccessGet200Response :: Int -> Gen BusinessPartnerAssetAccessGet200Response
genBusinessPartnerAssetAccessGet200Response n =
  BusinessPartnerAssetAccessGet200Response
    <$> arbitraryReducedMaybe n -- businessPartnerAssetAccessGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- businessPartnerAssetAccessGet200ResponseItems :: [BaseBusinessAssets]
  
instance Arbitrary BusinessToAdAccountSharedAudience where
  arbitrary = sized genBusinessToAdAccountSharedAudience

genBusinessToAdAccountSharedAudience :: Int -> Gen BusinessToAdAccountSharedAudience
genBusinessToAdAccountSharedAudience n =
  BusinessToAdAccountSharedAudience
    <$> arbitrary -- businessToAdAccountSharedAudienceAudienceId :: Text
    <*> arbitraryReducedMaybe n -- businessToAdAccountSharedAudiencePermissions :: Maybe [Role]
    <*> arbitrary -- businessToAdAccountSharedAudienceRecipientAccountIds :: [Text]
  
instance Arbitrary BusinessToAdAccountSharedAudienceUpdateWithRequiredBody where
  arbitrary = sized genBusinessToAdAccountSharedAudienceUpdateWithRequiredBody

genBusinessToAdAccountSharedAudienceUpdateWithRequiredBody :: Int -> Gen BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
genBusinessToAdAccountSharedAudienceUpdateWithRequiredBody n =
  BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
    <$> arbitrary -- businessToAdAccountSharedAudienceUpdateWithRequiredBodyAudienceId :: Text
    <*> arbitraryReduced n -- businessToAdAccountSharedAudienceUpdateWithRequiredBodyOperationType :: OperationType
    <*> arbitrary -- businessToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds :: [Text]
  
instance Arbitrary BusinessToBusinessSharedAudience where
  arbitrary = sized genBusinessToBusinessSharedAudience

genBusinessToBusinessSharedAudience :: Int -> Gen BusinessToBusinessSharedAudience
genBusinessToBusinessSharedAudience n =
  BusinessToBusinessSharedAudience
    <$> arbitrary -- businessToBusinessSharedAudienceAudienceId :: Text
    <*> arbitraryReducedMaybe n -- businessToBusinessSharedAudiencePermissions :: Maybe [Role]
    <*> arbitrary -- businessToBusinessSharedAudienceRecipientBusinessIds :: [Text]
  
instance Arbitrary BusinessToBusinessSharedAudienceUpdateWithRequiredBody where
  arbitrary = sized genBusinessToBusinessSharedAudienceUpdateWithRequiredBody

genBusinessToBusinessSharedAudienceUpdateWithRequiredBody :: Int -> Gen BusinessToBusinessSharedAudienceUpdateWithRequiredBody
genBusinessToBusinessSharedAudienceUpdateWithRequiredBody n =
  BusinessToBusinessSharedAudienceUpdateWithRequiredBody
    <$> arbitrary -- businessToBusinessSharedAudienceUpdateWithRequiredBodyAudienceId :: Text
    <*> arbitraryReduced n -- businessToBusinessSharedAudienceUpdateWithRequiredBodyOperationType :: OperationType
    <*> arbitrary -- businessToBusinessSharedAudienceUpdateWithRequiredBodyRecipientBusinessIds :: [Text]
  
instance Arbitrary Campaign where
  arbitrary = sized genCampaign

genCampaign :: Int -> Gen Campaign
genCampaign n =
  Campaign
    <$> arbitraryReducedMaybe n -- campaignAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignBidOptions :: Maybe CampaignBidOptions
    <*> arbitraryReducedMaybe n -- campaignCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignEndTime :: Maybe Int
    <*> arbitrary -- campaignId :: Text
    <*> arbitraryReducedMaybe n -- campaignIntendedPromotionType :: Maybe IntendedPromotionType
    <*> arbitraryReducedMaybe n -- campaignIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignIsCarting :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignIsLtvOptimized :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignIsPerformancePlus :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignIsTopOfSearch :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignName :: Maybe Text
    <*> arbitraryReduced n -- campaignObjectiveType :: CampaignObjectiveType
    <*> arbitraryReducedMaybe n -- campaignOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignPerformancePlusCampaignSettings :: Maybe PerformancePlusCampaignSettings
    <*> arbitraryReducedMaybe n -- campaignStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignSummaryStatus :: Maybe SummaryStatus
    <*> arbitraryReducedMaybe n -- campaignTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignType :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignUpdatedTime :: Maybe Int
  
instance Arbitrary CampaignAdPreview where
  arbitrary = sized genCampaignAdPreview

genCampaignAdPreview :: Int -> Gen CampaignAdPreview
genCampaignAdPreview n =
  CampaignAdPreview
    <$> arbitrary -- campaignAdPreviewAdAccountId :: Text
    <*> arbitrary -- campaignAdPreviewAdGroupId :: Text
    <*> arbitraryReducedMaybe n -- campaignAdPreviewClientId :: Maybe Int
    <*> arbitrary -- campaignAdPreviewExpiresAt :: Int
    <*> arbitrary -- campaignAdPreviewIsActive :: Bool
    <*> arbitraryReducedMaybe n -- campaignAdPreviewPinId :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignAdPreviewPinPromotionId :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignAdPreviewPromotedProductGroupId :: Maybe Int
    <*> arbitrary -- campaignAdPreviewUrl :: Text
    <*> arbitrary -- campaignAdPreviewUserId :: Int
    <*> arbitrary -- campaignAdPreviewUuid :: Text
  
instance Arbitrary CampaignAdPreviewCreate where
  arbitrary = sized genCampaignAdPreviewCreate

genCampaignAdPreviewCreate :: Int -> Gen CampaignAdPreviewCreate
genCampaignAdPreviewCreate n =
  CampaignAdPreviewCreate
    <$> arbitrary -- campaignAdPreviewCreateAdGroupId :: Text
  
instance Arbitrary CampaignAdPreviewCreate200ResponseInner where
  arbitrary = sized genCampaignAdPreviewCreate200ResponseInner

genCampaignAdPreviewCreate200ResponseInner :: Int -> Gen CampaignAdPreviewCreate200ResponseInner
genCampaignAdPreviewCreate200ResponseInner n =
  CampaignAdPreviewCreate200ResponseInner
    <$> arbitraryReduced n -- campaignAdPreviewCreate200ResponseInnerData :: CampaignAdPreviewCreate200ResponseInnerData
  
instance Arbitrary CampaignAdPreviewCreate200ResponseInnerData where
  arbitrary = sized genCampaignAdPreviewCreate200ResponseInnerData

genCampaignAdPreviewCreate200ResponseInnerData :: Int -> Gen CampaignAdPreviewCreate200ResponseInnerData
genCampaignAdPreviewCreate200ResponseInnerData n =
  CampaignAdPreviewCreate200ResponseInnerData
    <$> arbitrary -- campaignAdPreviewCreate200ResponseInnerDataAdAccountId :: Text
    <*> arbitrary -- campaignAdPreviewCreate200ResponseInnerDataAdGroupId :: Text
    <*> arbitraryReducedMaybe n -- campaignAdPreviewCreate200ResponseInnerDataClientId :: Maybe Int
    <*> arbitrary -- campaignAdPreviewCreate200ResponseInnerDataExpiresAt :: Int
    <*> arbitrary -- campaignAdPreviewCreate200ResponseInnerDataIsActive :: Bool
    <*> arbitraryReducedMaybe n -- campaignAdPreviewCreate200ResponseInnerDataPinId :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignAdPreviewCreate200ResponseInnerDataPinPromotionId :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignAdPreviewCreate200ResponseInnerDataPromotedProductGroupId :: Maybe Int
    <*> arbitrary -- campaignAdPreviewCreate200ResponseInnerDataUrl :: Text
    <*> arbitrary -- campaignAdPreviewCreate200ResponseInnerDataUserId :: Int
    <*> arbitrary -- campaignAdPreviewCreate200ResponseInnerDataUuid :: Text
    <*> arbitraryReduced n -- campaignAdPreviewCreate200ResponseInnerDataExceptions :: PinterestLibError
  
instance Arbitrary CampaignAdPreviewCreate200ResponseInnerDataOneOf where
  arbitrary = sized genCampaignAdPreviewCreate200ResponseInnerDataOneOf

genCampaignAdPreviewCreate200ResponseInnerDataOneOf :: Int -> Gen CampaignAdPreviewCreate200ResponseInnerDataOneOf
genCampaignAdPreviewCreate200ResponseInnerDataOneOf n =
  CampaignAdPreviewCreate200ResponseInnerDataOneOf
    <$> arbitraryReduced n -- campaignAdPreviewCreate200ResponseInnerDataOneOfExceptions :: PinterestLibError
  
instance Arbitrary CampaignAdPreviewDelete200ResponseInner where
  arbitrary = sized genCampaignAdPreviewDelete200ResponseInner

genCampaignAdPreviewDelete200ResponseInner :: Int -> Gen CampaignAdPreviewDelete200ResponseInner
genCampaignAdPreviewDelete200ResponseInner n =
  CampaignAdPreviewDelete200ResponseInner
    <$> arbitraryReduced n -- campaignAdPreviewDelete200ResponseInnerStatus :: CampaignAdPreviewDelete200ResponseInnerStatus
  
instance Arbitrary CampaignAdPreviewDelete200ResponseInnerStatus where
  arbitrary = sized genCampaignAdPreviewDelete200ResponseInnerStatus

genCampaignAdPreviewDelete200ResponseInnerStatus :: Int -> Gen CampaignAdPreviewDelete200ResponseInnerStatus
genCampaignAdPreviewDelete200ResponseInnerStatus n =
  CampaignAdPreviewDelete200ResponseInnerStatus
    <$> arbitrary -- campaignAdPreviewDelete200ResponseInnerStatusStatusCode :: E'StatusCode
    <*> arbitrary -- campaignAdPreviewDelete200ResponseInnerStatusCode :: Int
    <*> arbitrary -- campaignAdPreviewDelete200ResponseInnerStatusMessage :: Text
  
instance Arbitrary CampaignAudienceMultipliers where
  arbitrary = sized genCampaignAudienceMultipliers

genCampaignAudienceMultipliers :: Int -> Gen CampaignAudienceMultipliers
genCampaignAudienceMultipliers n =
  CampaignAudienceMultipliers
    <$> arbitraryReducedMaybe n -- campaignAudienceMultipliersAudienceId :: Maybe Text
  
instance Arbitrary CampaignBatchItem where
  arbitrary = sized genCampaignBatchItem

genCampaignBatchItem :: Int -> Gen CampaignBatchItem
genCampaignBatchItem n =
  CampaignBatchItem
    <$> arbitraryReducedMaybe n -- campaignBatchItemData :: Maybe CampaignBatchResponseData
    <*> arbitraryReducedMaybe n -- campaignBatchItemExceptions :: Maybe [Exception]
  
instance Arbitrary CampaignBatchResponseData where
  arbitrary = sized genCampaignBatchResponseData

genCampaignBatchResponseData :: Int -> Gen CampaignBatchResponseData
genCampaignBatchResponseData n =
  CampaignBatchResponseData
    <$> arbitraryReducedMaybe n -- campaignBatchResponseDataAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataBidOptions :: Maybe CampaignBidOptions
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataIntendedPromotionType :: Maybe IntendedPromotionType
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataIsCarting :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataIsLtvOptimized :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataIsPerformancePlus :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataIsTopOfSearch :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataObjectiveType :: Maybe CampaignObjectiveType
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataPerformancePlusCampaignSettings :: Maybe PerformancePlusCampaignSettings
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataStatus :: Maybe NullableEntityStatus
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataSummaryStatus :: Maybe SummaryStatus
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataType :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignBatchResponseDataUpdatedTime :: Maybe Int
  
instance Arbitrary CampaignBatchUpdateItem where
  arbitrary = sized genCampaignBatchUpdateItem

genCampaignBatchUpdateItem :: Int -> Gen CampaignBatchUpdateItem
genCampaignBatchUpdateItem n =
  CampaignBatchUpdateItem
    <$> arbitraryReducedMaybe n -- campaignBatchUpdateItemAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemAppId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemAppPlatform :: Maybe MobileAppPlatform
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemBidOptions :: Maybe CampaignBidOptionsUpdate
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemEndTime :: Maybe Int
    <*> arbitrary -- campaignBatchUpdateItemId :: Text
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemIntendedPromotionType :: Maybe IntendedPromotionType
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemIsLtvOptimized :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemIsPerformancePlus :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemIsTopOfSearch :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemObjectiveType :: Maybe ConversionObjectiveType
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemPerformancePlusCampaignSettings :: Maybe PerformancePlusCampaignSettings
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignBatchUpdateItemTrackingUrls :: Maybe TrackingUrls
  
instance Arbitrary CampaignBatchWriteResponseModel where
  arbitrary = sized genCampaignBatchWriteResponseModel

genCampaignBatchWriteResponseModel :: Int -> Gen CampaignBatchWriteResponseModel
genCampaignBatchWriteResponseModel n =
  CampaignBatchWriteResponseModel
    <$> arbitraryReduced n -- campaignBatchWriteResponseModelItems :: [CampaignBatchItem]
  
instance Arbitrary CampaignBidOptions where
  arbitrary = sized genCampaignBidOptions

genCampaignBidOptions :: Int -> Gen CampaignBidOptions
genCampaignBidOptions n =
  CampaignBidOptions
    <$> arbitraryReducedMaybe n -- campaignBidOptionsAgeBucketMultipliers :: Maybe AgeBucketMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsAppTypeMultipliers :: Maybe AppTypeMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsAudienceMultipliers :: Maybe CampaignAudienceMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsFreqBidMultiplierTimeWindow :: Maybe FreqBidMultiplierTimeWindow
    <*> arbitraryReducedMaybe n -- campaignBidOptionsFrequencyMultipliers :: Maybe FrequencyMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsGenderMultipliers :: Maybe GenderMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsPlacementMultipliers :: Maybe PlacementMultipliers
  
instance Arbitrary CampaignBidOptionsCreate where
  arbitrary = sized genCampaignBidOptionsCreate

genCampaignBidOptionsCreate :: Int -> Gen CampaignBidOptionsCreate
genCampaignBidOptionsCreate n =
  CampaignBidOptionsCreate
    <$> arbitraryReducedMaybe n -- campaignBidOptionsCreateAgeBucketMultipliers :: Maybe AgeBucketMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsCreateAppTypeMultipliers :: Maybe AppTypeMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsCreateAudienceMultipliers :: Maybe CampaignAudienceMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsCreateFreqBidMultiplierTimeWindow :: Maybe FreqBidMultiplierTimeWindow
    <*> arbitraryReducedMaybe n -- campaignBidOptionsCreateFrequencyMultipliers :: Maybe FrequencyMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsCreateGenderMultipliers :: Maybe GenderMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsCreatePlacementMultipliers :: Maybe PlacementMultipliers
  
instance Arbitrary CampaignBidOptionsUpdate where
  arbitrary = sized genCampaignBidOptionsUpdate

genCampaignBidOptionsUpdate :: Int -> Gen CampaignBidOptionsUpdate
genCampaignBidOptionsUpdate n =
  CampaignBidOptionsUpdate
    <$> arbitraryReducedMaybe n -- campaignBidOptionsUpdateAgeBucketMultipliers :: Maybe AgeBucketMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsUpdateAppTypeMultipliers :: Maybe AppTypeMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsUpdateAudienceMultipliers :: Maybe CampaignAudienceMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsUpdateFreqBidMultiplierTimeWindow :: Maybe FreqBidMultiplierTimeWindow
    <*> arbitraryReducedMaybe n -- campaignBidOptionsUpdateFrequencyMultipliers :: Maybe FrequencyMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsUpdateGenderMultipliers :: Maybe GenderMultipliers
    <*> arbitraryReducedMaybe n -- campaignBidOptionsUpdatePlacementMultipliers :: Maybe PlacementMultipliers
    <*> arbitraryReduced n -- campaignBidOptionsUpdateUpdateMask :: [CampaignBidOptionsUpdateMaskItems]
  
instance Arbitrary CampaignCreateItem where
  arbitrary = sized genCampaignCreateItem

genCampaignCreateItem :: Int -> Gen CampaignCreateItem
genCampaignCreateItem n =
  CampaignCreateItem
    <$> arbitraryReducedMaybe n -- campaignCreateItemAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateItemAppId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateItemAppPlatform :: Maybe MobileAppPlatform
    <*> arbitraryReducedMaybe n -- campaignCreateItemBidOptions :: Maybe CampaignBidOptions
    <*> arbitraryReducedMaybe n -- campaignCreateItemDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateItemDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateItemEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateItemIntendedPromotionType :: Maybe IntendedPromotionType
    <*> arbitraryReducedMaybe n -- campaignCreateItemIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateItemIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateItemIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateItemIsLtvOptimized :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateItemIsPerformancePlus :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateItemIsTopOfSearch :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateItemLifetimeSpendCap :: Maybe Int
    <*> arbitrary -- campaignCreateItemName :: Text
    <*> arbitraryReduced n -- campaignCreateItemObjectiveType :: ConversionObjectiveType
    <*> arbitraryReducedMaybe n -- campaignCreateItemOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateItemStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateItemStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- campaignCreateItemTrackingUrls :: Maybe TrackingUrls
  
instance Arbitrary CampaignCreateRequest where
  arbitrary = sized genCampaignCreateRequest

genCampaignCreateRequest :: Int -> Gen CampaignCreateRequest
genCampaignCreateRequest n =
  CampaignCreateRequest
    <$> arbitraryReducedMaybe n -- campaignCreateRequestBidOptions :: Maybe CampaignBidOptionsCreate
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIntendedPromotionType :: Maybe IntendedPromotionType
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsLtvOptimized :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsPerformancePlus :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestIsTopOfSearch :: Maybe Bool
    <*> arbitraryReduced n -- campaignCreateRequestObjectiveType :: ObjectiveType
    <*> arbitraryReducedMaybe n -- campaignCreateRequestStatus :: Maybe EntityStatus
    <*> arbitrary -- campaignCreateRequestAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- campaignCreateRequestDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignCreateRequestLifetimeSpendCap :: Maybe Int
    <*> arbitrary -- campaignCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- campaignCreateRequestOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignCreateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybeValue n -- campaignCreateRequestTrackingUrls :: Maybe A.Value
  
instance Arbitrary CampaignCreateRequestAllOf1 where
  arbitrary = sized genCampaignCreateRequestAllOf1

genCampaignCreateRequestAllOf1 :: Int -> Gen CampaignCreateRequestAllOf1
genCampaignCreateRequestAllOf1 n =
  CampaignCreateRequestAllOf1
    <$> arbitraryReducedMaybe n -- campaignCreateRequestAllOf1BidOptions :: Maybe CampaignBidOptionsCreate
    <*> arbitraryReducedMaybe n -- campaignCreateRequestAllOf1IntendedPromotionType :: Maybe IntendedPromotionType
    <*> arbitraryReducedMaybe n -- campaignCreateRequestAllOf1IsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestAllOf1IsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestAllOf1IsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestAllOf1IsLtvOptimized :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestAllOf1IsPerformancePlus :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignCreateRequestAllOf1IsTopOfSearch :: Maybe Bool
    <*> arbitraryReduced n -- campaignCreateRequestAllOf1ObjectiveType :: ObjectiveType
    <*> arbitraryReducedMaybe n -- campaignCreateRequestAllOf1Status :: Maybe EntityStatus
  
instance Arbitrary CampaignDeliveryEstimatesCampaign where
  arbitrary = sized genCampaignDeliveryEstimatesCampaign

genCampaignDeliveryEstimatesCampaign :: Int -> Gen CampaignDeliveryEstimatesCampaign
genCampaignDeliveryEstimatesCampaign n =
  CampaignDeliveryEstimatesCampaign
    <$> arbitraryReduced n -- campaignDeliveryEstimatesCampaignAdGroups :: [AdGroupDeliveryEstimates]
    <*> arbitraryReduced n -- campaignDeliveryEstimatesCampaignBudgetDurationType :: BudgetDurationType
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesCampaignDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesCampaignEndDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesCampaignLifetimeSpendCap :: Maybe Int
    <*> arbitraryReduced n -- campaignDeliveryEstimatesCampaignObjectiveType :: DeliveryEstimateObjectiveType
    <*> arbitrary -- campaignDeliveryEstimatesCampaignStartDate :: Text
  
instance Arbitrary CampaignDeliveryEstimatesDerivedMetrics where
  arbitrary = sized genCampaignDeliveryEstimatesDerivedMetrics

genCampaignDeliveryEstimatesDerivedMetrics :: Int -> Gen CampaignDeliveryEstimatesDerivedMetrics
genCampaignDeliveryEstimatesDerivedMetrics n =
  CampaignDeliveryEstimatesDerivedMetrics
    <$> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsCpc :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsCpcLower :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsCpcUpper :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsCpm :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsCpmLower :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsCpmUpper :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsLifetimeFrequency :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsLifetimeFrequencyLower :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsLifetimeFrequencyUpper :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsLifetimeImpression :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsLifetimeImpressionLower :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsLifetimeImpressionUpper :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsLifetimeReach :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsLifetimeReachLower :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsLifetimeReachUpper :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyClick :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyClickLower :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyClickUpper :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyFrequency :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyFrequencyLower :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyFrequencyUpper :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyImpression :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyImpressionLower :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyImpressionUpper :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyReach :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyReachLower :: Maybe Float
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesDerivedMetricsWeeklyReachUpper :: Maybe Float
  
instance Arbitrary CampaignDeliveryEstimatesResponse where
  arbitrary = sized genCampaignDeliveryEstimatesResponse

genCampaignDeliveryEstimatesResponse :: Int -> Gen CampaignDeliveryEstimatesResponse
genCampaignDeliveryEstimatesResponse n =
  CampaignDeliveryEstimatesResponse
    <$> arbitraryReducedMaybe n -- campaignDeliveryEstimatesResponseCurves :: Maybe [CampaignPlanningCurveEstimate]
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesResponseDerivedMetrics :: Maybe CampaignDeliveryEstimatesDerivedMetrics
    <*> arbitraryReducedMaybe n -- campaignDeliveryEstimatesResponseMaxPotentialSpend :: Maybe Int
  
instance Arbitrary CampaignPlanningAdGroupAudienceSize where
  arbitrary = sized genCampaignPlanningAdGroupAudienceSize

genCampaignPlanningAdGroupAudienceSize :: Int -> Gen CampaignPlanningAdGroupAudienceSize
genCampaignPlanningAdGroupAudienceSize n =
  CampaignPlanningAdGroupAudienceSize
    <$> arbitraryReducedMaybe n -- campaignPlanningAdGroupAudienceSizeCountLower :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignPlanningAdGroupAudienceSizeCountUpper :: Maybe Int
  
instance Arbitrary CampaignPlanningBudgetRecommendation where
  arbitrary = sized genCampaignPlanningBudgetRecommendation

genCampaignPlanningBudgetRecommendation :: Int -> Gen CampaignPlanningBudgetRecommendation
genCampaignPlanningBudgetRecommendation n =
  CampaignPlanningBudgetRecommendation
    <$> arbitraryReducedMaybe n -- campaignPlanningBudgetRecommendationBudgetRecommendation :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignPlanningBudgetRecommendationExperimentCampaignBudgetRecommendation :: Maybe [CampaignPlanningExperimentBudgetRecommendation]
    <*> arbitraryReducedMaybe n -- campaignPlanningBudgetRecommendationLifetimeDaysRecommendation :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignPlanningBudgetRecommendationPointEstimations :: Maybe [CampaignPlanningBudgetRecommendationPoint]
  
instance Arbitrary CampaignPlanningBudgetRecommendationPoint where
  arbitrary = sized genCampaignPlanningBudgetRecommendationPoint

genCampaignPlanningBudgetRecommendationPoint :: Int -> Gen CampaignPlanningBudgetRecommendationPoint
genCampaignPlanningBudgetRecommendationPoint n =
  CampaignPlanningBudgetRecommendationPoint
    <$> arbitraryReducedMaybe n -- campaignPlanningBudgetRecommendationPointEstimationType :: Maybe CampaignPlanningEstimationType
    <*> arbitraryReducedMaybe n -- campaignPlanningBudgetRecommendationPointPointEstimate :: Maybe CampaignPlanningPointEstimate
  
instance Arbitrary CampaignPlanningConfidenceLevelAlert where
  arbitrary = sized genCampaignPlanningConfidenceLevelAlert

genCampaignPlanningConfidenceLevelAlert :: Int -> Gen CampaignPlanningConfidenceLevelAlert
genCampaignPlanningConfidenceLevelAlert n =
  CampaignPlanningConfidenceLevelAlert
    <$> arbitraryReducedMaybe n -- campaignPlanningConfidenceLevelAlertDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignPlanningConfidenceLevelAlertReason :: Maybe CampaignPlanningConfidenceLevelAlertReason
    <*> arbitraryReducedMaybe n -- campaignPlanningConfidenceLevelAlertSeverity :: Maybe CampaignPlanningConfidenceLevelAlertSeverity
  
instance Arbitrary CampaignPlanningConversionAttribution where
  arbitrary = sized genCampaignPlanningConversionAttribution

genCampaignPlanningConversionAttribution :: Int -> Gen CampaignPlanningConversionAttribution
genCampaignPlanningConversionAttribution n =
  CampaignPlanningConversionAttribution
    <$> arbitraryReducedMaybe n -- campaignPlanningConversionAttributionClickWindowDays :: Maybe CampaignPlanningConversionAttributionWindowDays
    <*> arbitraryReducedMaybe n -- campaignPlanningConversionAttributionEngagementWindowDays :: Maybe CampaignPlanningConversionAttributionWindowDays
    <*> arbitraryReducedMaybe n -- campaignPlanningConversionAttributionViewWindowDays :: Maybe CampaignPlanningConversionAttributionWindowDays
  
instance Arbitrary CampaignPlanningConversionRate where
  arbitrary = sized genCampaignPlanningConversionRate

genCampaignPlanningConversionRate :: Int -> Gen CampaignPlanningConversionRate
genCampaignPlanningConversionRate n =
  CampaignPlanningConversionRate
    <$> arbitraryReduced n -- campaignPlanningConversionRateAttributionWindows :: CampaignPlanningConversionAttribution
    <*> arbitraryReduced n -- campaignPlanningConversionRateConversionEvent :: CampaignPlanningConversionEvent
    <*> arbitrary -- campaignPlanningConversionRateConversionRate :: Float
  
instance Arbitrary CampaignPlanningCurveEstimate where
  arbitrary = sized genCampaignPlanningCurveEstimate

genCampaignPlanningCurveEstimate :: Int -> Gen CampaignPlanningCurveEstimate
genCampaignPlanningCurveEstimate n =
  CampaignPlanningCurveEstimate
    <$> arbitraryReducedMaybe n -- campaignPlanningCurveEstimateEstimationType :: Maybe CampaignPlanningEstimationType
    <*> arbitraryReducedMaybe n -- campaignPlanningCurveEstimatePoints :: Maybe [CampaignPlanningPointEstimate]
  
instance Arbitrary CampaignPlanningExperimentBudgetRecommendation where
  arbitrary = sized genCampaignPlanningExperimentBudgetRecommendation

genCampaignPlanningExperimentBudgetRecommendation :: Int -> Gen CampaignPlanningExperimentBudgetRecommendation
genCampaignPlanningExperimentBudgetRecommendation n =
  CampaignPlanningExperimentBudgetRecommendation
    <$> arbitraryReducedMaybe n -- campaignPlanningExperimentBudgetRecommendationBudgetRecommendation :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignPlanningExperimentBudgetRecommendationLifetimeDaysRecommendation :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignPlanningExperimentBudgetRecommendationPointEstimations :: Maybe [CampaignPlanningBudgetRecommendationPoint]
    <*> arbitraryReducedMaybe n -- campaignPlanningExperimentBudgetRecommendationVersionId :: Maybe Text
  
instance Arbitrary CampaignPlanningPointEstimate where
  arbitrary = sized genCampaignPlanningPointEstimate

genCampaignPlanningPointEstimate :: Int -> Gen CampaignPlanningPointEstimate
genCampaignPlanningPointEstimate n =
  CampaignPlanningPointEstimate
    <$> arbitrary -- campaignPlanningPointEstimateBudget :: Int
    <*> arbitrary -- campaignPlanningPointEstimateDoubleY :: Double
    <*> arbitrary -- campaignPlanningPointEstimateMaxY :: Int
    <*> arbitrary -- campaignPlanningPointEstimateMinY :: Int
    <*> arbitrary -- campaignPlanningPointEstimateY :: Int
  
instance Arbitrary CampaignPlanningResponseError where
  arbitrary = sized genCampaignPlanningResponseError

genCampaignPlanningResponseError :: Int -> Gen CampaignPlanningResponseError
genCampaignPlanningResponseError n =
  CampaignPlanningResponseError
    <$> arbitraryReducedMaybe n -- campaignPlanningResponseErrorCode :: Maybe CampaignPlanningResponseErrorCode
    <*> arbitraryReducedMaybe n -- campaignPlanningResponseErrorMessage :: Maybe Text
  
instance Arbitrary CampaignUpdateRequest where
  arbitrary = sized genCampaignUpdateRequest

genCampaignUpdateRequest :: Int -> Gen CampaignUpdateRequest
genCampaignUpdateRequest n =
  CampaignUpdateRequest
    <$> arbitraryReducedMaybe n -- campaignUpdateRequestBidOptions :: Maybe CampaignBidOptionsUpdate
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIntendedPromotionType :: Maybe IntendedPromotionType
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsLtvOptimized :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsPerformancePlus :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsTopOfSearch :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestObjectiveType :: Maybe ObjectiveType
    <*> arbitrary -- campaignUpdateRequestAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestDailySpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestDefaultAdGroupBudgetInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestEndTime :: Maybe Int
    <*> arbitrary -- campaignUpdateRequestId :: Text
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsAutomatedCampaign :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsCampaignBudgetOptimization :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestIsFlexibleDailyBudgets :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestLifetimeSpendCap :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybeValue n -- campaignUpdateRequestTrackingUrls :: Maybe A.Value
  
instance Arbitrary CampaignUpdateRequestAllOf2 where
  arbitrary = sized genCampaignUpdateRequestAllOf2

genCampaignUpdateRequestAllOf2 :: Int -> Gen CampaignUpdateRequestAllOf2
genCampaignUpdateRequestAllOf2 n =
  CampaignUpdateRequestAllOf2
    <$> arbitraryReducedMaybe n -- campaignUpdateRequestAllOf2BidOptions :: Maybe CampaignBidOptionsUpdate
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestAllOf2IntendedPromotionType :: Maybe IntendedPromotionType
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestAllOf2IsLtvOptimized :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestAllOf2IsPerformancePlus :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestAllOf2IsTopOfSearch :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignUpdateRequestAllOf2ObjectiveType :: Maybe ObjectiveType
  
instance Arbitrary CampaignsAnalyticsMetrics where
  arbitrary = sized genCampaignsAnalyticsMetrics

genCampaignsAnalyticsMetrics :: Int -> Gen CampaignsAnalyticsMetrics
genCampaignsAnalyticsMetrics n =
  CampaignsAnalyticsMetrics
    <$> arbitraryReducedMaybe n -- campaignsAnalyticsMetricsCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignsAnalyticsMetricsDate :: Maybe Date
  
instance Arbitrary CampaignsList200Response where
  arbitrary = sized genCampaignsList200Response

genCampaignsList200Response :: Int -> Gen CampaignsList200Response
genCampaignsList200Response n =
  CampaignsList200Response
    <$> arbitraryReducedMaybe n -- campaignsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- campaignsList200ResponseItems :: [Campaign]
  
instance Arbitrary CancelInviteException where
  arbitrary = sized genCancelInviteException

genCancelInviteException :: Int -> Gen CancelInviteException
genCancelInviteException n =
  CancelInviteException
    <$> arbitraryReducedMaybe n -- cancelInviteExceptionInviteId :: Maybe Text
    <*> arbitraryReducedMaybe n -- cancelInviteExceptionMessage :: Maybe Text
  
instance Arbitrary CancelInviteResult where
  arbitrary = sized genCancelInviteResult

genCancelInviteResult :: Int -> Gen CancelInviteResult
genCancelInviteResult n =
  CancelInviteResult
    <$> arbitraryReducedMaybe n -- cancelInviteResultId :: Maybe Text
    <*> arbitraryReducedMaybe n -- cancelInviteResultInviteData :: Maybe InviteDataResponse
    <*> arbitraryReducedMaybe n -- cancelInviteResultIsReceivedInvite :: Maybe Bool
    <*> arbitraryReducedMaybe n -- cancelInviteResultUser :: Maybe CancelInviteResultUser
  
instance Arbitrary CancelInviteResultItem where
  arbitrary = sized genCancelInviteResultItem

genCancelInviteResultItem :: Int -> Gen CancelInviteResultItem
genCancelInviteResultItem n =
  CancelInviteResultItem
    <$> arbitraryReducedMaybe n -- cancelInviteResultItemException :: Maybe CancelInviteException
    <*> arbitraryReducedMaybe n -- cancelInviteResultItemInvite :: Maybe CancelInviteResult
  
instance Arbitrary CancelInviteResultUser where
  arbitrary = sized genCancelInviteResultUser

genCancelInviteResultUser :: Int -> Gen CancelInviteResultUser
genCancelInviteResultUser n =
  CancelInviteResultUser
    <$> arbitraryReducedMaybe n -- cancelInviteResultUserEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- cancelInviteResultUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- cancelInviteResultUserUsername :: Maybe Text
  
instance Arbitrary CancelInvitesRequest where
  arbitrary = sized genCancelInvitesRequest

genCancelInvitesRequest :: Int -> Gen CancelInvitesRequest
genCancelInvitesRequest n =
  CancelInvitesRequest
    <$> arbitrary -- cancelInvitesRequestInviteIds :: [Text]
  
instance Arbitrary CancelInvitesResponse where
  arbitrary = sized genCancelInvitesResponse

genCancelInvitesResponse :: Int -> Gen CancelInvitesResponse
genCancelInvitesResponse n =
  CancelInvitesResponse
    <$> arbitraryReducedMaybe n -- cancelInvitesResponseItems :: Maybe [CancelInviteResultItem]
  
instance Arbitrary CarouselSlot where
  arbitrary = sized genCarouselSlot

genCarouselSlot :: Int -> Gen CarouselSlot
genCarouselSlot n =
  CarouselSlot
    <$> arbitraryReducedMaybe n -- carouselSlotDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- carouselSlotLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- carouselSlotTitle :: Maybe Text
  
instance Arbitrary CartingProduct where
  arbitrary = sized genCartingProduct

genCartingProduct :: Int -> Gen CartingProduct
genCartingProduct n =
  CartingProduct
    <$> arbitrary -- cartingProductCartingProductId :: Text
    <*> arbitraryReducedMaybe n -- cartingProductDisplayPreferredRetailersOnly :: Maybe Bool
    <*> arbitraryReducedMaybe n -- cartingProductDisplayProductPrice :: Maybe Bool
    <*> arbitraryReducedMaybe n -- cartingProductPreferredRetailers :: Maybe [CartingRetailer]
    <*> arbitraryReducedMaybe n -- cartingProductRandomizePreferredRetailers :: Maybe Bool
  
instance Arbitrary CartingRetailer where
  arbitrary = sized genCartingRetailer

genCartingRetailer :: Int -> Gen CartingRetailer
genCartingRetailer n =
  CartingRetailer
    <$> arbitrary -- cartingRetailerRetailerId :: Text
    <*> arbitrary -- cartingRetailerRetailerName :: Text
  
instance Arbitrary Catalog where
  arbitrary = sized genCatalog

genCatalog :: Int -> Gen Catalog
genCatalog n =
  Catalog
    <$> arbitraryReduced n -- catalogCatalogType :: CatalogsType
    <*> arbitraryReduced n -- catalogCreatedAt :: DateTime
    <*> arbitrary -- catalogId :: Text
    <*> arbitrary -- catalogName :: Text
    <*> arbitraryReduced n -- catalogUpdatedAt :: DateTime
  
instance Arbitrary CatalogBinding where
  arbitrary = sized genCatalogBinding

genCatalogBinding :: Int -> Gen CatalogBinding
genCatalogBinding n =
  CatalogBinding
    <$> arbitraryReducedMaybe n -- catalogBindingCatalogType :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogBindingId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogBindingName :: Maybe Text
  
instance Arbitrary CatalogCreate where
  arbitrary = sized genCatalogCreate

genCatalogCreate :: Int -> Gen CatalogCreate
genCatalogCreate n =
  CatalogCreate
    <$> arbitraryReduced n -- catalogCreateCatalogType :: CatalogsType
    <*> arbitrary -- catalogCreateName :: Text
  
instance Arbitrary CatalogUpdate where
  arbitrary = sized genCatalogUpdate

genCatalogUpdate :: Int -> Gen CatalogUpdate
genCatalogUpdate n =
  CatalogUpdate
    <$> arbitraryReducedMaybe n -- catalogUpdateCatalogType :: Maybe CatalogsType
    <*> arbitraryReducedMaybe n -- catalogUpdateName :: Maybe Text
  
instance Arbitrary CatalogsAiContentDisclosure where
  arbitrary = sized genCatalogsAiContentDisclosure

genCatalogsAiContentDisclosure :: Int -> Gen CatalogsAiContentDisclosure
genCatalogsAiContentDisclosure n =
  CatalogsAiContentDisclosure
    <$> arbitraryReduced n -- catalogsAiContentDisclosureDisclosure :: [CatalogsAiContentDisclosureLabel]
    <*> arbitrary -- catalogsAiContentDisclosureUrl :: Text
  
instance Arbitrary CatalogsAvailableFilterValues where
  arbitrary = sized genCatalogsAvailableFilterValues

genCatalogsAvailableFilterValues :: Int -> Gen CatalogsAvailableFilterValues
genCatalogsAvailableFilterValues n =
  CatalogsAvailableFilterValues
    <$> arbitrary -- catalogsAvailableFilterValuesCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsAvailableFilterValuesFilterValues :: CatalogsCreativeAssetsFilterValuesMap
  
instance Arbitrary CatalogsBaseFilterKeys where
  arbitrary = sized genCatalogsBaseFilterKeys

genCatalogsBaseFilterKeys :: Int -> Gen CatalogsBaseFilterKeys
genCatalogsBaseFilterKeys n =
  CatalogsBaseFilterKeys
    <$> arbitraryReduced n -- catalogsBaseFilterKeysMinPrice :: CatalogsProductGroupPricingCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysMaxPrice :: CatalogsProductGroupPricingCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCurrency :: CatalogsProductGroupCurrencyCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysItemId :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysAvailability :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysBrand :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCondition :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCustomLabel0 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCustomLabel1 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCustomLabel2 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCustomLabel3 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCustomLabel4 :: CatalogsProductGroupFilterOperatorTypeCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysItemGroupId :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysGender :: CatalogsProductGroupMultipleGenderCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysMediaType :: CatalogsProductGroupMultipleMediaTypesCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysProductType4 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysProductType3 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysProductType2 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysProductType1 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysProductType0 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysGoogleProductCategory6 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysGoogleProductCategory5 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysGoogleProductCategory4 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysGoogleProductCategory3 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysGoogleProductCategory2 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysGoogleProductCategory1 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysGoogleProductCategory0 :: CatalogsProductGroupMultipleStringListCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCustomNumber0 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCustomNumber1 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCustomNumber2 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCustomNumber3 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysCustomNumber4 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysTitleKeywords :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsBaseFilterKeysPinterestProductCategories :: CatalogsProductGroupMultiplePinterestProductCategoryCriteria
  
instance Arbitrary CatalogsBaseFiltersAllOf where
  arbitrary = sized genCatalogsBaseFiltersAllOf

genCatalogsBaseFiltersAllOf :: Int -> Gen CatalogsBaseFiltersAllOf
genCatalogsBaseFiltersAllOf n =
  CatalogsBaseFiltersAllOf
    <$> arbitraryReduced n -- catalogsBaseFiltersAllOfAllOf :: [CatalogsBaseFilterKeys]
  
instance Arbitrary CatalogsBaseFiltersAnyOf where
  arbitrary = sized genCatalogsBaseFiltersAnyOf

genCatalogsBaseFiltersAnyOf :: Int -> Gen CatalogsBaseFiltersAnyOf
genCatalogsBaseFiltersAnyOf n =
  CatalogsBaseFiltersAnyOf
    <$> arbitraryReduced n -- catalogsBaseFiltersAnyOfAnyOf :: [CatalogsBaseFilterKeys]
  
instance Arbitrary CatalogsCreateCreativeAssetsItem where
  arbitrary = sized genCatalogsCreateCreativeAssetsItem

genCatalogsCreateCreativeAssetsItem :: Int -> Gen CatalogsCreateCreativeAssetsItem
genCatalogsCreateCreativeAssetsItem n =
  CatalogsCreateCreativeAssetsItem
    <$> arbitraryReduced n -- catalogsCreateCreativeAssetsItemAttributes :: CatalogsCreativeAssetsAttributes
    <*> arbitrary -- catalogsCreateCreativeAssetsItemCreativeAssetsId :: Text
    <*> arbitrary -- catalogsCreateCreativeAssetsItemOperation :: E'Operation3
  
instance Arbitrary CatalogsCreateHotelItem where
  arbitrary = sized genCatalogsCreateHotelItem

genCatalogsCreateHotelItem :: Int -> Gen CatalogsCreateHotelItem
genCatalogsCreateHotelItem n =
  CatalogsCreateHotelItem
    <$> arbitraryReduced n -- catalogsCreateHotelItemAttributes :: CatalogsHotelAttributes
    <*> arbitrary -- catalogsCreateHotelItemHotelId :: Text
    <*> arbitrary -- catalogsCreateHotelItemOperation :: E'Operation3
  
instance Arbitrary CatalogsCreateReportResponse where
  arbitrary = sized genCatalogsCreateReportResponse

genCatalogsCreateReportResponse :: Int -> Gen CatalogsCreateReportResponse
genCatalogsCreateReportResponse n =
  CatalogsCreateReportResponse
    <$> arbitraryReducedMaybe n -- catalogsCreateReportResponseToken :: Maybe Text
  
instance Arbitrary CatalogsCreateRetailItem where
  arbitrary = sized genCatalogsCreateRetailItem

genCatalogsCreateRetailItem :: Int -> Gen CatalogsCreateRetailItem
genCatalogsCreateRetailItem n =
  CatalogsCreateRetailItem
    <$> arbitraryReduced n -- catalogsCreateRetailItemAttributes :: ItemAttributesRequest
    <*> arbitrary -- catalogsCreateRetailItemItemId :: Text
    <*> arbitrary -- catalogsCreateRetailItemOperation :: E'Operation3
  
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
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesAiDisclosures :: Maybe [CatalogsAiContentDisclosure]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesImageLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsAttributesVideoLink :: Maybe Text
  
instance Arbitrary CatalogsCreativeAssetsAvailableFilterValues where
  arbitrary = sized genCatalogsCreativeAssetsAvailableFilterValues

genCatalogsCreativeAssetsAvailableFilterValues :: Int -> Gen CatalogsCreativeAssetsAvailableFilterValues
genCatalogsCreativeAssetsAvailableFilterValues n =
  CatalogsCreativeAssetsAvailableFilterValues
    <$> arbitrary -- catalogsCreativeAssetsAvailableFilterValuesCatalogType :: E'CatalogType
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
    <*> arbitrary -- catalogsCreativeAssetsBatchRequestCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsCreativeAssetsBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsCreativeAssetsBatchRequestItems :: [CatalogsCreativeAssetsBatchItem]
    <*> arbitrary -- catalogsCreativeAssetsBatchRequestLanguage :: E'Language
  
instance Arbitrary CatalogsCreativeAssetsFeed where
  arbitrary = sized genCatalogsCreativeAssetsFeed

genCatalogsCreativeAssetsFeed :: Int -> Gen CatalogsCreativeAssetsFeed
genCatalogsCreativeAssetsFeed n =
  CatalogsCreativeAssetsFeed
    <$> arbitrary -- catalogsCreativeAssetsFeedCatalogId :: Text
    <*> arbitrary -- catalogsCreativeAssetsFeedCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedCreatedAt :: DateTime
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedDefaultCurrency :: Maybe NullableCurrency
    <*> arbitrary -- catalogsCreativeAssetsFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedFormat :: CatalogsFormat
    <*> arbitrary -- catalogsCreativeAssetsFeedId :: Text
    <*> arbitrary -- catalogsCreativeAssetsFeedLocation :: Text
    <*> arbitrary -- catalogsCreativeAssetsFeedName :: Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedStatus :: CatalogsStatus
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedUpdatedAt :: DateTime
  
instance Arbitrary CatalogsCreativeAssetsFeedsCreateRequest where
  arbitrary = sized genCatalogsCreativeAssetsFeedsCreateRequest

genCatalogsCreativeAssetsFeedsCreateRequest :: Int -> Gen CatalogsCreativeAssetsFeedsCreateRequest
genCatalogsCreativeAssetsFeedsCreateRequest n =
  CatalogsCreativeAssetsFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestCatalogId :: Maybe Text
    <*> arbitrary -- catalogsCreativeAssetsFeedsCreateRequestCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsCreateRequestDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsCreateRequestDefaultLocale :: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
    <*> arbitraryReduced n -- catalogsCreativeAssetsFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitrary -- catalogsCreativeAssetsFeedsCreateRequestLocation :: Text
    <*> arbitrary -- catalogsCreativeAssetsFeedsCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFeedsCreateRequestStatus :: Maybe CatalogsStatus
  
instance Arbitrary CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale where
  arbitrary = sized genCatalogsCreativeAssetsFeedsCreateRequestDefaultLocale

genCatalogsCreativeAssetsFeedsCreateRequestDefaultLocale :: Int -> Gen CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
genCatalogsCreativeAssetsFeedsCreateRequestDefaultLocale n =
  
  pure CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
   
instance Arbitrary CatalogsCreativeAssetsFeedsUpdateRequest where
  arbitrary = sized genCatalogsCreativeAssetsFeedsUpdateRequest

genCatalogsCreativeAssetsFeedsUpdateRequest :: Int -> Gen CatalogsCreativeAssetsFeedsUpdateRequest
genCatalogsCreativeAssetsFeedsUpdateRequest n =
  CatalogsCreativeAssetsFeedsUpdateRequest
    <$> arbitrary -- catalogsCreativeAssetsFeedsUpdateRequestCatalogType :: E'CatalogType
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
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsFilterValuesMapMediaType :: Maybe [MediaType]
  
instance Arbitrary CatalogsCreativeAssetsItemErrorResponse where
  arbitrary = sized genCatalogsCreativeAssetsItemErrorResponse

genCatalogsCreativeAssetsItemErrorResponse :: Int -> Gen CatalogsCreativeAssetsItemErrorResponse
genCatalogsCreativeAssetsItemErrorResponse n =
  CatalogsCreativeAssetsItemErrorResponse
    <$> arbitrary -- catalogsCreativeAssetsItemErrorResponseCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemErrorResponseCreativeAssetsId :: Maybe Text
    <*> arbitraryReduced n -- catalogsCreativeAssetsItemErrorResponseErrors :: [ItemValidationEvent]
    <*> arbitrary -- catalogsCreativeAssetsItemErrorResponseItemResponseKind :: E'ItemResponseKind
  
instance Arbitrary CatalogsCreativeAssetsItemResponse where
  arbitrary = sized genCatalogsCreativeAssetsItemResponse

genCatalogsCreativeAssetsItemResponse :: Int -> Gen CatalogsCreativeAssetsItemResponse
genCatalogsCreativeAssetsItemResponse n =
  CatalogsCreativeAssetsItemResponse
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemResponseAttributes :: Maybe CatalogsCreativeAssetsAttributes
    <*> arbitrary -- catalogsCreativeAssetsItemResponseCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemResponseCreativeAssetsId :: Maybe Text
    <*> arbitrary -- catalogsCreativeAssetsItemResponseItemResponseKind :: E'ItemResponseKind2
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemResponsePins :: Maybe [Pin]
  
instance Arbitrary CatalogsCreativeAssetsItemsBatch where
  arbitrary = sized genCatalogsCreativeAssetsItemsBatch

genCatalogsCreativeAssetsItemsBatch :: Int -> Gen CatalogsCreativeAssetsItemsBatch
genCatalogsCreativeAssetsItemsBatch n =
  CatalogsCreativeAssetsItemsBatch
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchBatchId :: Maybe Text
    <*> arbitrary -- catalogsCreativeAssetsItemsBatchCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchCreatedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchItems :: Maybe [CreativeAssetsProcessingRecord]
    <*> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsBatchStatus :: Maybe BatchOperationStatus
  
instance Arbitrary CatalogsCreativeAssetsItemsPostFilter where
  arbitrary = sized genCatalogsCreativeAssetsItemsPostFilter

genCatalogsCreativeAssetsItemsPostFilter :: Int -> Gen CatalogsCreativeAssetsItemsPostFilter
genCatalogsCreativeAssetsItemsPostFilter n =
  CatalogsCreativeAssetsItemsPostFilter
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsItemsPostFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsCreativeAssetsItemsPostFilterCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsCreativeAssetsItemsPostFilterCreativeAssetsIds :: [Text]
  
instance Arbitrary CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest where
  arbitrary = sized genCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

genCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest :: Int -> Gen CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
genCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest n =
  CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
    <$> arbitrary -- catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogId :: Text
    <*> arbitrary -- catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestFilters :: CatalogsCreativeAssetsProductGroupFilters
  
instance Arbitrary CatalogsCreativeAssetsProduct where
  arbitrary = sized genCatalogsCreativeAssetsProduct

genCatalogsCreativeAssetsProduct :: Int -> Gen CatalogsCreativeAssetsProduct
genCatalogsCreativeAssetsProduct n =
  CatalogsCreativeAssetsProduct
    <$> arbitrary -- catalogsCreativeAssetsProductCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductMetadata :: CatalogsCreativeAssetsProductMetadata
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductPin :: Pin
  
instance Arbitrary CatalogsCreativeAssetsProductGroup where
  arbitrary = sized genCatalogsCreativeAssetsProductGroup

genCatalogsCreativeAssetsProductGroup :: Int -> Gen CatalogsCreativeAssetsProductGroup
genCatalogsCreativeAssetsProductGroup n =
  CatalogsCreativeAssetsProductGroup
    <$> arbitrary -- catalogsCreativeAssetsProductGroupCatalogId :: Text
    <*> arbitrary -- catalogsCreativeAssetsProductGroupCatalogType :: E'CatalogType
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
    <*> arbitrary -- catalogsCreativeAssetsProductGroupCreateRequestCatalogType :: E'CatalogType
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
    <*> arbitraryReduced n -- catalogsCreativeAssetsProductGroupFilterKeysLink :: CatalogsProductGroupFilterOperatorTypeCriteria
  
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
    <$> arbitrary -- catalogsCreativeAssetsProductGroupProductCountsAppLinks :: Double
    <*> arbitrary -- catalogsCreativeAssetsProductGroupProductCountsCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsCreativeAssetsProductGroupProductCountsImages :: Double
    <*> arbitrary -- catalogsCreativeAssetsProductGroupProductCountsTotal :: Double
    <*> arbitrary -- catalogsCreativeAssetsProductGroupProductCountsVideos :: Double
  
instance Arbitrary CatalogsCreativeAssetsProductGroupUpdateRequest where
  arbitrary = sized genCatalogsCreativeAssetsProductGroupUpdateRequest

genCatalogsCreativeAssetsProductGroupUpdateRequest :: Int -> Gen CatalogsCreativeAssetsProductGroupUpdateRequest
genCatalogsCreativeAssetsProductGroupUpdateRequest n =
  CatalogsCreativeAssetsProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsCreativeAssetsProductGroupUpdateRequestCatalogType :: Maybe E'CatalogType
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
    <$> arbitrary -- catalogsFeedCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsFeedCreatedAt :: DateTime
    <*> arbitraryReducedMaybe n -- catalogsFeedCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsFeedDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReduced n -- catalogsFeedDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsFeedDefaultCurrency :: Maybe NullableCurrency
    <*> arbitrary -- catalogsFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsFeedFormat :: CatalogsFormat
    <*> arbitrary -- catalogsFeedId :: Text
    <*> arbitrary -- catalogsFeedLocation :: Text
    <*> arbitrary -- catalogsFeedName :: Text
    <*> arbitraryReducedMaybe n -- catalogsFeedPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsFeedStatus :: CatalogsStatus
    <*> arbitraryReduced n -- catalogsFeedUpdatedAt :: DateTime
    <*> arbitrary -- catalogsFeedCatalogId :: Text
  
instance Arbitrary CatalogsFeedCreateRequestSchema where
  arbitrary = sized genCatalogsFeedCreateRequestSchema

genCatalogsFeedCreateRequestSchema :: Int -> Gen CatalogsFeedCreateRequestSchema
genCatalogsFeedCreateRequestSchema n =
  CatalogsFeedCreateRequestSchema
    <$> arbitraryReducedMaybe n -- catalogsFeedCreateRequestSchemaCatalogId :: Maybe Text
    <*> arbitrary -- catalogsFeedCreateRequestSchemaCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsFeedCreateRequestSchemaCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsFeedCreateRequestSchemaDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReduced n -- catalogsFeedCreateRequestSchemaDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsFeedCreateRequestSchemaDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReduced n -- catalogsFeedCreateRequestSchemaDefaultLocale :: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
    <*> arbitraryReduced n -- catalogsFeedCreateRequestSchemaFormat :: CatalogsFormat
    <*> arbitrary -- catalogsFeedCreateRequestSchemaLocation :: Text
    <*> arbitrary -- catalogsFeedCreateRequestSchemaName :: Text
    <*> arbitraryReducedMaybe n -- catalogsFeedCreateRequestSchemaPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsFeedCreateRequestSchemaStatus :: Maybe CatalogsStatus
  
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
    <*> arbitraryReducedMaybe n -- catalogsFeedIngestionErrorsLargeProductCountDecrease :: Maybe Int
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
    <*> arbitraryReduced n -- catalogsFeedProcessingResultIngestionDetails :: CatalogsFeedIngestionDetails
    <*> arbitraryReduced n -- catalogsFeedProcessingResultProductCounts :: CatalogsFeedProductCounts
    <*> arbitraryReduced n -- catalogsFeedProcessingResultStatus :: CatalogsFeedProcessingStatus
    <*> arbitraryReduced n -- catalogsFeedProcessingResultUpdatedAt :: DateTime
    <*> arbitraryReduced n -- catalogsFeedProcessingResultValidationDetails :: CatalogsFeedValidationDetails
    <*> arbitraryReducedMaybe n -- catalogsFeedProcessingResultVideoCounts :: Maybe CatalogsFeedVideoCounts
  
instance Arbitrary CatalogsFeedProcessingSchedule where
  arbitrary = sized genCatalogsFeedProcessingSchedule

genCatalogsFeedProcessingSchedule :: Int -> Gen CatalogsFeedProcessingSchedule
genCatalogsFeedProcessingSchedule n =
  CatalogsFeedProcessingSchedule
    <$> arbitrary -- catalogsFeedProcessingScheduleTime :: Text
    <*> arbitraryReduced n -- catalogsFeedProcessingScheduleTimezone :: CatalogsFeedProcessingScheduleTimezone
  
instance Arbitrary CatalogsFeedProductCounts where
  arbitrary = sized genCatalogsFeedProductCounts

genCatalogsFeedProductCounts :: Int -> Gen CatalogsFeedProductCounts
genCatalogsFeedProductCounts n =
  CatalogsFeedProductCounts
    <$> arbitraryReducedMaybe n -- catalogsFeedProductCountsIngested :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsFeedProductCountsOriginal :: Maybe Int
  
instance Arbitrary CatalogsFeedUpdateRequestSchema where
  arbitrary = sized genCatalogsFeedUpdateRequestSchema

genCatalogsFeedUpdateRequestSchema :: Int -> Gen CatalogsFeedUpdateRequestSchema
genCatalogsFeedUpdateRequestSchema n =
  CatalogsFeedUpdateRequestSchema
    <$> arbitrary -- catalogsFeedUpdateRequestSchemaCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsFeedUpdateRequestSchemaCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsFeedUpdateRequestSchemaDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReducedMaybe n -- catalogsFeedUpdateRequestSchemaDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReducedMaybe n -- catalogsFeedUpdateRequestSchemaFormat :: Maybe CatalogsFormat
    <*> arbitraryReducedMaybe n -- catalogsFeedUpdateRequestSchemaLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsFeedUpdateRequestSchemaName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsFeedUpdateRequestSchemaPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsFeedUpdateRequestSchemaStatus :: Maybe CatalogsStatus
  
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
    <*> arbitraryReducedMaybe n -- catalogsFeedValidationWarningsFetchSameSignature :: Maybe Int
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
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestDefaultLocale :: Maybe CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
    <*> arbitraryReduced n -- catalogsFeedsCreateRequestFormat :: CatalogsFormat
    <*> arbitrary -- catalogsFeedsCreateRequestLocation :: Text
    <*> arbitrary -- catalogsFeedsCreateRequestName :: Text
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReducedMaybe n -- catalogsFeedsCreateRequestStatus :: Maybe CatalogsStatus
  
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
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesAiDisclosures :: Maybe [CatalogsAiContentDisclosure]
    <*> arbitraryReducedMaybe n -- catalogsHotelAttributesMainImage :: Maybe CatalogsHotelMainImage
  
instance Arbitrary CatalogsHotelAvailableFilterValues where
  arbitrary = sized genCatalogsHotelAvailableFilterValues

genCatalogsHotelAvailableFilterValues :: Int -> Gen CatalogsHotelAvailableFilterValues
genCatalogsHotelAvailableFilterValues n =
  CatalogsHotelAvailableFilterValues
    <$> arbitrary -- catalogsHotelAvailableFilterValuesCatalogType :: E'CatalogType2
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
    <*> arbitrary -- catalogsHotelBatchRequestCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsHotelBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsHotelBatchRequestItems :: [CatalogsHotelBatchItem]
    <*> arbitrary -- catalogsHotelBatchRequestLanguage :: E'Language
  
instance Arbitrary CatalogsHotelFeed where
  arbitrary = sized genCatalogsHotelFeed

genCatalogsHotelFeed :: Int -> Gen CatalogsHotelFeed
genCatalogsHotelFeed n =
  CatalogsHotelFeed
    <$> arbitrary -- catalogsHotelFeedCatalogId :: Text
    <*> arbitrary -- catalogsHotelFeedCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsHotelFeedCreatedAt :: DateTime
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedDefaultCurrency :: Maybe NullableCurrency
    <*> arbitrary -- catalogsHotelFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsHotelFeedFormat :: CatalogsFormat
    <*> arbitrary -- catalogsHotelFeedId :: Text
    <*> arbitrary -- catalogsHotelFeedLocation :: Text
    <*> arbitrary -- catalogsHotelFeedName :: Text
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsHotelFeedStatus :: CatalogsStatus
    <*> arbitraryReduced n -- catalogsHotelFeedUpdatedAt :: DateTime
  
instance Arbitrary CatalogsHotelFeedsCreateRequest where
  arbitrary = sized genCatalogsHotelFeedsCreateRequest

genCatalogsHotelFeedsCreateRequest :: Int -> Gen CatalogsHotelFeedsCreateRequest
genCatalogsHotelFeedsCreateRequest n =
  CatalogsHotelFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestCatalogId :: Maybe Text
    <*> arbitrary -- catalogsHotelFeedsCreateRequestCatalogType :: E'CatalogType2
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsHotelFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReduced n -- catalogsHotelFeedsCreateRequestDefaultLocale :: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
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
    <$> arbitrary -- catalogsHotelFeedsUpdateRequestCatalogType :: E'CatalogType2
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
    <$> arbitrary -- catalogsHotelItemErrorResponseCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsHotelItemErrorResponseErrors :: [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- catalogsHotelItemErrorResponseHotelId :: Maybe Text
    <*> arbitrary -- catalogsHotelItemErrorResponseItemResponseKind :: E'ItemResponseKind3
  
instance Arbitrary CatalogsHotelItemResponse where
  arbitrary = sized genCatalogsHotelItemResponse

genCatalogsHotelItemResponse :: Int -> Gen CatalogsHotelItemResponse
genCatalogsHotelItemResponse n =
  CatalogsHotelItemResponse
    <$> arbitraryReducedMaybe n -- catalogsHotelItemResponseAttributes :: Maybe CatalogsHotelAttributes
    <*> arbitrary -- catalogsHotelItemResponseCatalogType :: E'CatalogType2
    <*> arbitraryReducedMaybe n -- catalogsHotelItemResponseHotelId :: Maybe Text
    <*> arbitrary -- catalogsHotelItemResponseItemResponseKind :: E'ItemResponseKind4
    <*> arbitraryReducedMaybe n -- catalogsHotelItemResponsePins :: Maybe [Pin]
  
instance Arbitrary CatalogsHotelItemsBatch where
  arbitrary = sized genCatalogsHotelItemsBatch

genCatalogsHotelItemsBatch :: Int -> Gen CatalogsHotelItemsBatch
genCatalogsHotelItemsBatch n =
  CatalogsHotelItemsBatch
    <$> arbitraryReducedMaybe n -- catalogsHotelItemsBatchBatchId :: Maybe Text
    <*> arbitrary -- catalogsHotelItemsBatchCatalogType :: E'CatalogType2
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchCreatedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchItems :: Maybe [HotelProcessingRecord]
    <*> arbitraryReducedMaybe n -- catalogsHotelItemsBatchStatus :: Maybe BatchOperationStatus
  
instance Arbitrary CatalogsHotelItemsPostFilter where
  arbitrary = sized genCatalogsHotelItemsPostFilter

genCatalogsHotelItemsPostFilter :: Int -> Gen CatalogsHotelItemsPostFilter
genCatalogsHotelItemsPostFilter n =
  CatalogsHotelItemsPostFilter
    <$> arbitraryReducedMaybe n -- catalogsHotelItemsPostFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsHotelItemsPostFilterCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsHotelItemsPostFilterHotelIds :: [Text]
  
instance Arbitrary CatalogsHotelListProductsByCatalogBasedFilterRequest where
  arbitrary = sized genCatalogsHotelListProductsByCatalogBasedFilterRequest

genCatalogsHotelListProductsByCatalogBasedFilterRequest :: Int -> Gen CatalogsHotelListProductsByCatalogBasedFilterRequest
genCatalogsHotelListProductsByCatalogBasedFilterRequest n =
  CatalogsHotelListProductsByCatalogBasedFilterRequest
    <$> arbitrary -- catalogsHotelListProductsByCatalogBasedFilterRequestCatalogId :: Text
    <*> arbitrary -- catalogsHotelListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsHotelListProductsByCatalogBasedFilterRequestFilters :: CatalogsHotelProductGroupFilters
  
instance Arbitrary CatalogsHotelMainImage where
  arbitrary = sized genCatalogsHotelMainImage

genCatalogsHotelMainImage :: Int -> Gen CatalogsHotelMainImage
genCatalogsHotelMainImage n =
  CatalogsHotelMainImage
    <$> arbitraryReducedMaybe n -- catalogsHotelMainImageLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsHotelMainImageTag :: Maybe [Text]
  
instance Arbitrary CatalogsHotelProduct where
  arbitrary = sized genCatalogsHotelProduct

genCatalogsHotelProduct :: Int -> Gen CatalogsHotelProduct
genCatalogsHotelProduct n =
  CatalogsHotelProduct
    <$> arbitrary -- catalogsHotelProductCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsHotelProductMetadata :: CatalogsHotelProductMetadata
    <*> arbitraryReduced n -- catalogsHotelProductPin :: Pin
  
instance Arbitrary CatalogsHotelProductGroup where
  arbitrary = sized genCatalogsHotelProductGroup

genCatalogsHotelProductGroup :: Int -> Gen CatalogsHotelProductGroup
genCatalogsHotelProductGroup n =
  CatalogsHotelProductGroup
    <$> arbitrary -- catalogsHotelProductGroupCatalogId :: Text
    <*> arbitrary -- catalogsHotelProductGroupCatalogType :: E'CatalogType2
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
    <*> arbitrary -- catalogsHotelProductGroupCreateRequestCatalogType :: E'CatalogType2
    <*> arbitraryReducedMaybe n -- catalogsHotelProductGroupCreateRequestDescription :: Maybe Text
    <*> arbitraryReduced n -- catalogsHotelProductGroupCreateRequestFilters :: CatalogsHotelProductGroupFilters
    <*> arbitrary -- catalogsHotelProductGroupCreateRequestName :: Text
  
instance Arbitrary CatalogsHotelProductGroupFilterKeys where
  arbitrary = sized genCatalogsHotelProductGroupFilterKeys

genCatalogsHotelProductGroupFilterKeys :: Int -> Gen CatalogsHotelProductGroupFilterKeys
genCatalogsHotelProductGroupFilterKeys n =
  CatalogsHotelProductGroupFilterKeys
    <$> arbitraryReduced n -- catalogsHotelProductGroupFilterKeysPrice :: PriceFilterPrice
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
    <$> arbitrary -- catalogsHotelProductGroupProductCountsCatalogType :: E'CatalogType2
    <*> arbitrary -- catalogsHotelProductGroupProductCountsTotal :: Double
  
instance Arbitrary CatalogsHotelProductGroupUpdateRequest where
  arbitrary = sized genCatalogsHotelProductGroupUpdateRequest

genCatalogsHotelProductGroupUpdateRequest :: Int -> Gen CatalogsHotelProductGroupUpdateRequest
genCatalogsHotelProductGroupUpdateRequest n =
  CatalogsHotelProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsHotelProductGroupUpdateRequestCatalogType :: Maybe E'CatalogType2
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
    <$> arbitrary -- catalogsHotelReportParametersCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsHotelReportParametersReport :: CatalogsHotelReportParametersReport
  
instance Arbitrary CatalogsHotelReportParametersReport where
  arbitrary = sized genCatalogsHotelReportParametersReport

genCatalogsHotelReportParametersReport :: Int -> Gen CatalogsHotelReportParametersReport
genCatalogsHotelReportParametersReport n =
  CatalogsHotelReportParametersReport
    <$> arbitrary -- catalogsHotelReportParametersReportFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsHotelReportParametersReportProcessingResultId :: Maybe Text
    <*> arbitrary -- catalogsHotelReportParametersReportReportType :: E'ReportType
    <*> arbitraryReducedMaybe n -- catalogsHotelReportParametersReportCatalogId :: Maybe Text
  
instance Arbitrary CatalogsHotelReportStatsParameters where
  arbitrary = sized genCatalogsHotelReportStatsParameters

genCatalogsHotelReportStatsParameters :: Int -> Gen CatalogsHotelReportStatsParameters
genCatalogsHotelReportStatsParameters n =
  CatalogsHotelReportStatsParameters
    <$> arbitrary -- catalogsHotelReportStatsParametersCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsHotelReportStatsParametersReport :: CatalogsHotelReportStatsParametersReport
  
instance Arbitrary CatalogsHotelReportStatsParametersReport where
  arbitrary = sized genCatalogsHotelReportStatsParametersReport

genCatalogsHotelReportStatsParametersReport :: Int -> Gen CatalogsHotelReportStatsParametersReport
genCatalogsHotelReportStatsParametersReport n =
  CatalogsHotelReportStatsParametersReport
    <$> arbitrary -- catalogsHotelReportStatsParametersReportFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsHotelReportStatsParametersReportProcessingResultId :: Maybe Text
    <*> arbitrary -- catalogsHotelReportStatsParametersReportReportType :: E'ReportType
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
  
instance Arbitrary CatalogsItemsBatch where
  arbitrary = sized genCatalogsItemsBatch

genCatalogsItemsBatch :: Int -> Gen CatalogsItemsBatch
genCatalogsItemsBatch n =
  CatalogsItemsBatch
    <$> arbitraryReducedMaybe n -- catalogsItemsBatchBatchId :: Maybe Text
    <*> arbitrary -- catalogsItemsBatchCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReduced n -- catalogsItemsBatchCreatedTime :: DateTime
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchItems :: Maybe [CreativeAssetsProcessingRecord]
    <*> arbitraryReducedMaybe n -- catalogsItemsBatchStatus :: Maybe BatchOperationStatus
  
instance Arbitrary CatalogsItemsBatchPostRequest where
  arbitrary = sized genCatalogsItemsBatchPostRequest

genCatalogsItemsBatchPostRequest :: Int -> Gen CatalogsItemsBatchPostRequest
genCatalogsItemsBatchPostRequest n =
  CatalogsItemsBatchPostRequest
    <$> arbitraryReducedMaybe n -- catalogsItemsBatchPostRequestCatalogId :: Maybe Text
    <*> arbitrary -- catalogsItemsBatchPostRequestCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsItemsBatchPostRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsBatchPostRequestItems :: [ItemDeleteBatchRecord]
    <*> arbitrary -- catalogsItemsBatchPostRequestLanguage :: E'Language
    <*> arbitrary -- catalogsItemsBatchPostRequestOperation :: E'Operation
  
instance Arbitrary CatalogsItemsBatchRequest where
  arbitrary = sized genCatalogsItemsBatchRequest

genCatalogsItemsBatchRequest :: Int -> Gen CatalogsItemsBatchRequest
genCatalogsItemsBatchRequest n =
  CatalogsItemsBatchRequest
    <$> arbitraryReduced n -- catalogsItemsBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsBatchRequestItems :: [ItemDeleteBatchRecord]
    <*> arbitrary -- catalogsItemsBatchRequestLanguage :: E'Language
    <*> arbitrary -- catalogsItemsBatchRequestOperation :: E'Operation
  
instance Arbitrary CatalogsItemsCreateBatchRequest where
  arbitrary = sized genCatalogsItemsCreateBatchRequest

genCatalogsItemsCreateBatchRequest :: Int -> Gen CatalogsItemsCreateBatchRequest
genCatalogsItemsCreateBatchRequest n =
  CatalogsItemsCreateBatchRequest
    <$> arbitraryReduced n -- catalogsItemsCreateBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsCreateBatchRequestItems :: [ItemCreateBatchRecord]
    <*> arbitrary -- catalogsItemsCreateBatchRequestLanguage :: E'Language
    <*> arbitrary -- catalogsItemsCreateBatchRequestOperation :: E'Operation3
  
instance Arbitrary CatalogsItemsDeleteBatchRequest where
  arbitrary = sized genCatalogsItemsDeleteBatchRequest

genCatalogsItemsDeleteBatchRequest :: Int -> Gen CatalogsItemsDeleteBatchRequest
genCatalogsItemsDeleteBatchRequest n =
  CatalogsItemsDeleteBatchRequest
    <$> arbitraryReduced n -- catalogsItemsDeleteBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsDeleteBatchRequestItems :: [ItemDeleteBatchRecord]
    <*> arbitrary -- catalogsItemsDeleteBatchRequestLanguage :: E'Language
    <*> arbitrary -- catalogsItemsDeleteBatchRequestOperation :: E'Operation
  
instance Arbitrary CatalogsItemsDeleteDiscontinuedBatchRequest where
  arbitrary = sized genCatalogsItemsDeleteDiscontinuedBatchRequest

genCatalogsItemsDeleteDiscontinuedBatchRequest :: Int -> Gen CatalogsItemsDeleteDiscontinuedBatchRequest
genCatalogsItemsDeleteDiscontinuedBatchRequest n =
  CatalogsItemsDeleteDiscontinuedBatchRequest
    <$> arbitraryReduced n -- catalogsItemsDeleteDiscontinuedBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsDeleteDiscontinuedBatchRequestItems :: [ItemDeleteDiscontinuedBatchRecord]
    <*> arbitrary -- catalogsItemsDeleteDiscontinuedBatchRequestLanguage :: E'Language
    <*> arbitrary -- catalogsItemsDeleteDiscontinuedBatchRequestOperation :: E'Operation4
  
instance Arbitrary CatalogsItemsPostFilters where
  arbitrary = sized genCatalogsItemsPostFilters

genCatalogsItemsPostFilters :: Int -> Gen CatalogsItemsPostFilters
genCatalogsItemsPostFilters n =
  CatalogsItemsPostFilters
    <$> arbitraryReducedMaybe n -- catalogsItemsPostFiltersCatalogId :: Maybe Text
    <*> arbitrary -- catalogsItemsPostFiltersCatalogType :: E'CatalogType
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
    <*> arbitrary -- catalogsItemsUpdateBatchRequestOperation :: E'Operation5
  
instance Arbitrary CatalogsItemsUpsertBatchRequest where
  arbitrary = sized genCatalogsItemsUpsertBatchRequest

genCatalogsItemsUpsertBatchRequest :: Int -> Gen CatalogsItemsUpsertBatchRequest
genCatalogsItemsUpsertBatchRequest n =
  CatalogsItemsUpsertBatchRequest
    <$> arbitraryReduced n -- catalogsItemsUpsertBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsItemsUpsertBatchRequestItems :: [ItemUpsertBatchRecord]
    <*> arbitrary -- catalogsItemsUpsertBatchRequestLanguage :: E'Language
    <*> arbitrary -- catalogsItemsUpsertBatchRequestOperation :: E'Operation2
  
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
    <*> arbitrary -- catalogsListProductsByFilterRequestCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsListProductsByFilterRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsListProductsByFilterRequestLocale :: CatalogsLocale
  
instance Arbitrary CatalogsLocalStoresCreate200ResponseInner where
  arbitrary = sized genCatalogsLocalStoresCreate200ResponseInner

genCatalogsLocalStoresCreate200ResponseInner :: Int -> Gen CatalogsLocalStoresCreate200ResponseInner
genCatalogsLocalStoresCreate200ResponseInner n =
  CatalogsLocalStoresCreate200ResponseInner
    <$> arbitraryReduced n -- catalogsLocalStoresCreate200ResponseInnerData :: CatalogsLocalStoresCreate200ResponseInnerData
  
instance Arbitrary CatalogsLocalStoresCreate200ResponseInnerData where
  arbitrary = sized genCatalogsLocalStoresCreate200ResponseInnerData

genCatalogsLocalStoresCreate200ResponseInnerData :: Int -> Gen CatalogsLocalStoresCreate200ResponseInnerData
genCatalogsLocalStoresCreate200ResponseInnerData n =
  CatalogsLocalStoresCreate200ResponseInnerData
    <$> arbitraryReducedMaybe n -- catalogsLocalStoresCreate200ResponseInnerDataAddressPrimary :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsLocalStoresCreate200ResponseInnerDataAddressSecondary :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsLocalStoresCreate200ResponseInnerDataCity :: Maybe Text
    <*> arbitraryReduced n -- catalogsLocalStoresCreate200ResponseInnerDataCountry :: Country
    <*> arbitraryReduced n -- catalogsLocalStoresCreate200ResponseInnerDataCreatedAt :: DateTime
    <*> arbitrary -- catalogsLocalStoresCreate200ResponseInnerDataId :: Text
    <*> arbitraryReducedMaybe n -- catalogsLocalStoresCreate200ResponseInnerDataLatitude :: Maybe Float
    <*> arbitraryReducedMaybe n -- catalogsLocalStoresCreate200ResponseInnerDataLongitude :: Maybe Float
    <*> arbitrary -- catalogsLocalStoresCreate200ResponseInnerDataName :: Text
    <*> arbitraryReducedMaybe n -- catalogsLocalStoresCreate200ResponseInnerDataPostalCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsLocalStoresCreate200ResponseInnerDataRegion :: Maybe Text
    <*> arbitrary -- catalogsLocalStoresCreate200ResponseInnerDataStoreCode :: Text
    <*> arbitraryReduced n -- catalogsLocalStoresCreate200ResponseInnerDataUpdatedAt :: DateTime
    <*> arbitraryReduced n -- catalogsLocalStoresCreate200ResponseInnerDataExceptions :: PinterestLibError
  
instance Arbitrary CatalogsLocalStoresCreate200ResponseInnerDataOneOf where
  arbitrary = sized genCatalogsLocalStoresCreate200ResponseInnerDataOneOf

genCatalogsLocalStoresCreate200ResponseInnerDataOneOf :: Int -> Gen CatalogsLocalStoresCreate200ResponseInnerDataOneOf
genCatalogsLocalStoresCreate200ResponseInnerDataOneOf n =
  CatalogsLocalStoresCreate200ResponseInnerDataOneOf
    <$> arbitrary -- catalogsLocalStoresCreate200ResponseInnerDataOneOfId :: Text
    <*> arbitraryReduced n -- catalogsLocalStoresCreate200ResponseInnerDataOneOfExceptions :: PinterestLibError
  
instance Arbitrary CatalogsLocalStoresDelete200ResponseInner where
  arbitrary = sized genCatalogsLocalStoresDelete200ResponseInner

genCatalogsLocalStoresDelete200ResponseInner :: Int -> Gen CatalogsLocalStoresDelete200ResponseInner
genCatalogsLocalStoresDelete200ResponseInner n =
  CatalogsLocalStoresDelete200ResponseInner
    <$> arbitrary -- catalogsLocalStoresDelete200ResponseInnerId :: Text
    <*> arbitraryReduced n -- catalogsLocalStoresDelete200ResponseInnerStatus :: CampaignAdPreviewDelete200ResponseInnerStatus
  
instance Arbitrary CatalogsLocalStoresList200Response where
  arbitrary = sized genCatalogsLocalStoresList200Response

genCatalogsLocalStoresList200Response :: Int -> Gen CatalogsLocalStoresList200Response
genCatalogsLocalStoresList200Response n =
  CatalogsLocalStoresList200Response
    <$> arbitraryReducedMaybe n -- catalogsLocalStoresList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- catalogsLocalStoresList200ResponseItems :: [LocalStore]
  
instance Arbitrary CatalogsProduct where
  arbitrary = sized genCatalogsProduct

genCatalogsProduct :: Int -> Gen CatalogsProduct
genCatalogsProduct n =
  CatalogsProduct
    <$> arbitrary -- catalogsProductCatalogType :: E'CatalogType
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
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomNumber0 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomNumber1 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomNumber2 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomNumber3 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysCustomNumber4 :: CatalogsProductGroupUint32Criteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysTitleKeywords :: CatalogsProductGroupMultipleStringCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysPinterestProductCategories :: CatalogsProductGroupMultiplePinterestProductCategoryCriteria
    <*> arbitraryReduced n -- catalogsProductGroupFilterKeysProductGroup :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary CatalogsProductGroupFilterOperatorTypeCriteria where
  arbitrary = sized genCatalogsProductGroupFilterOperatorTypeCriteria

genCatalogsProductGroupFilterOperatorTypeCriteria :: Int -> Gen CatalogsProductGroupFilterOperatorTypeCriteria
genCatalogsProductGroupFilterOperatorTypeCriteria n =
  CatalogsProductGroupFilterOperatorTypeCriteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorType :: Maybe FilterOperatorType
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
  
instance Arbitrary CatalogsProductGroupFiltersRequestAnyOfItems0 where
  arbitrary = sized genCatalogsProductGroupFiltersRequestAnyOfItems0

genCatalogsProductGroupFiltersRequestAnyOfItems0 :: Int -> Gen CatalogsProductGroupFiltersRequestAnyOfItems0
genCatalogsProductGroupFiltersRequestAnyOfItems0 n =
  CatalogsProductGroupFiltersRequestAnyOfItems0
    <$> arbitraryReduced n -- catalogsProductGroupFiltersRequestAnyOfItems0AnyOf :: [CatalogsProductGroupFilterKeys]
  
instance Arbitrary CatalogsProductGroupFiltersRequestAnyOfItems1 where
  arbitrary = sized genCatalogsProductGroupFiltersRequestAnyOfItems1

genCatalogsProductGroupFiltersRequestAnyOfItems1 :: Int -> Gen CatalogsProductGroupFiltersRequestAnyOfItems1
genCatalogsProductGroupFiltersRequestAnyOfItems1 n =
  CatalogsProductGroupFiltersRequestAnyOfItems1
    <$> arbitraryReduced n -- catalogsProductGroupFiltersRequestAnyOfItems1AllOf :: [CatalogsProductGroupFilterKeys]
  
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
  
instance Arbitrary CatalogsProductGroupMultiplePinterestProductCategoryCriteria where
  arbitrary = sized genCatalogsProductGroupMultiplePinterestProductCategoryCriteria

genCatalogsProductGroupMultiplePinterestProductCategoryCriteria :: Int -> Gen CatalogsProductGroupMultiplePinterestProductCategoryCriteria
genCatalogsProductGroupMultiplePinterestProductCategoryCriteria n =
  CatalogsProductGroupMultiplePinterestProductCategoryCriteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupMultiplePinterestProductCategoryCriteriaNegated :: Maybe Bool
    <*> arbitraryReduced n -- catalogsProductGroupMultiplePinterestProductCategoryCriteriaValues :: [ProductCategoryEnum]
  
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
    <*> arbitraryReduced n -- catalogsProductGroupMultipleStringListCriteriaValues :: [Array]
  
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
  
instance Arbitrary CatalogsProductGroupProductCountsVertical where
  arbitrary = sized genCatalogsProductGroupProductCountsVertical

genCatalogsProductGroupProductCountsVertical :: Int -> Gen CatalogsProductGroupProductCountsVertical
genCatalogsProductGroupProductCountsVertical n =
  CatalogsProductGroupProductCountsVertical
    <$> arbitrary -- catalogsProductGroupProductCountsVerticalCatalogType :: E'CatalogType
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalInStock :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalOutOfStock :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalPreorder :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalTotal :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalVideos :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalAppLinks :: Double
    <*> arbitrary -- catalogsProductGroupProductCountsVerticalImages :: Double
  
instance Arbitrary CatalogsProductGroupUint32Criteria where
  arbitrary = sized genCatalogsProductGroupUint32Criteria

genCatalogsProductGroupUint32Criteria :: Int -> Gen CatalogsProductGroupUint32Criteria
genCatalogsProductGroupUint32Criteria n =
  CatalogsProductGroupUint32Criteria
    <$> arbitraryReducedMaybe n -- catalogsProductGroupUint32CriteriaNegated :: Maybe Bool
    <*> arbitraryReduced n -- catalogsProductGroupUint32CriteriaOperator :: NumericFilterOperatorType
    <*> arbitrary -- catalogsProductGroupUint32CriteriaValue :: Int
  
instance Arbitrary CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 where
  arbitrary = sized genCatalogsProductGroupUpdateManyRequestItemsOneOfItems0

genCatalogsProductGroupUpdateManyRequestItemsOneOfItems0 :: Int -> Gen CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
genCatalogsProductGroupUpdateManyRequestItemsOneOfItems0 n =
  CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
    <$> arbitraryReducedMaybe n -- catalogsProductGroupUpdateManyRequestItemsOneOfItems0Description :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateManyRequestItemsOneOfItems0Filters :: Maybe CatalogsProductGroupFiltersRequest
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateManyRequestItemsOneOfItems0IsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateManyRequestItemsOneOfItems0Name :: Maybe Text
    <*> arbitrary -- catalogsProductGroupUpdateManyRequestItemsOneOfItems0Id :: Text
  
instance Arbitrary CatalogsProductGroupUpdateRequest where
  arbitrary = sized genCatalogsProductGroupUpdateRequest

genCatalogsProductGroupUpdateRequest :: Int -> Gen CatalogsProductGroupUpdateRequest
genCatalogsProductGroupUpdateRequest n =
  CatalogsProductGroupUpdateRequest
    <$> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestFilters :: Maybe CatalogsProductGroupFiltersRequest
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupUpdateRequestName :: Maybe Text
  
instance Arbitrary CatalogsProductGroupsCreateManyRequestItems where
  arbitrary = sized genCatalogsProductGroupsCreateManyRequestItems

genCatalogsProductGroupsCreateManyRequestItems :: Int -> Gen CatalogsProductGroupsCreateManyRequestItems
genCatalogsProductGroupsCreateManyRequestItems n =
  CatalogsProductGroupsCreateManyRequestItems
    <$> arbitraryReducedMaybe n -- catalogsProductGroupsCreateManyRequestItemsDescription :: Maybe Text
    <*> arbitrary -- catalogsProductGroupsCreateManyRequestItemsFeedId :: Text
    <*> arbitraryReduced n -- catalogsProductGroupsCreateManyRequestItemsFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreateManyRequestItemsIsFeatured :: Maybe Bool
    <*> arbitrary -- catalogsProductGroupsCreateManyRequestItemsName :: Text
    <*> arbitrary -- catalogsProductGroupsCreateManyRequestItemsCatalogId :: Text
    <*> arbitrary -- catalogsProductGroupsCreateManyRequestItemsCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreateManyRequestItemsCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreateManyRequestItemsLocale :: Maybe CatalogsLocale
  
instance Arbitrary CatalogsProductGroupsCreateRequestSchema where
  arbitrary = sized genCatalogsProductGroupsCreateRequestSchema

genCatalogsProductGroupsCreateRequestSchema :: Int -> Gen CatalogsProductGroupsCreateRequestSchema
genCatalogsProductGroupsCreateRequestSchema n =
  CatalogsProductGroupsCreateRequestSchema
    <$> arbitraryReducedMaybe n -- catalogsProductGroupsCreateRequestSchemaDescription :: Maybe Text
    <*> arbitrary -- catalogsProductGroupsCreateRequestSchemaFeedId :: Text
    <*> arbitraryReduced n -- catalogsProductGroupsCreateRequestSchemaFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreateRequestSchemaIsFeatured :: Maybe Bool
    <*> arbitrary -- catalogsProductGroupsCreateRequestSchemaName :: Text
    <*> arbitrary -- catalogsProductGroupsCreateRequestSchemaCatalogId :: Text
    <*> arbitrary -- catalogsProductGroupsCreateRequestSchemaCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreateRequestSchemaCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsCreateRequestSchemaLocale :: Maybe CatalogsLocale
  
instance Arbitrary CatalogsProductGroupsList200Response where
  arbitrary = sized genCatalogsProductGroupsList200Response

genCatalogsProductGroupsList200Response :: Int -> Gen CatalogsProductGroupsList200Response
genCatalogsProductGroupsList200Response n =
  CatalogsProductGroupsList200Response
    <$> arbitraryReducedMaybe n -- catalogsProductGroupsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- catalogsProductGroupsList200ResponseItems :: [CatalogsVerticalProductGroup]
  
instance Arbitrary CatalogsProductGroupsUpdateRequestSchema where
  arbitrary = sized genCatalogsProductGroupsUpdateRequestSchema

genCatalogsProductGroupsUpdateRequestSchema :: Int -> Gen CatalogsProductGroupsUpdateRequestSchema
genCatalogsProductGroupsUpdateRequestSchema n =
  CatalogsProductGroupsUpdateRequestSchema
    <$> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestSchemaDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestSchemaFilters :: Maybe CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestSchemaIsFeatured :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestSchemaName :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestSchemaCatalogType :: Maybe E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestSchemaCountry :: Maybe Country
    <*> arbitraryReducedMaybe n -- catalogsProductGroupsUpdateRequestSchemaLocale :: Maybe CatalogsLocale
  
instance Arbitrary CatalogsReport where
  arbitrary = sized genCatalogsReport

genCatalogsReport :: Int -> Gen CatalogsReport
genCatalogsReport n =
  CatalogsReport
    <$> arbitraryReducedMaybe n -- catalogsReportReportStatus :: Maybe E'ReportStatus
    <*> arbitraryReducedMaybe n -- catalogsReportSize :: Maybe Double
    <*> arbitraryReducedMaybe n -- catalogsReportUrl :: Maybe Text
  
instance Arbitrary CatalogsReportDistributionIssueFilter where
  arbitrary = sized genCatalogsReportDistributionIssueFilter

genCatalogsReportDistributionIssueFilter :: Int -> Gen CatalogsReportDistributionIssueFilter
genCatalogsReportDistributionIssueFilter n =
  CatalogsReportDistributionIssueFilter
    <$> arbitraryReducedMaybe n -- catalogsReportDistributionIssueFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsReportDistributionIssueFilterReportType :: E'ReportType
  
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
    <*> arbitraryReducedMaybe n -- catalogsReportDistributionStatsReportType :: Maybe E'ReportType
  
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
    <$> arbitrary -- catalogsReportParametersCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsReportParametersReport :: CatalogsHotelReportParametersReport
  
instance Arbitrary CatalogsReportStats where
  arbitrary = sized genCatalogsReportStats

genCatalogsReportStats :: Int -> Gen CatalogsReportStats
genCatalogsReportStats n =
  CatalogsReportStats
    <$> arbitraryReducedMaybe n -- catalogsReportStatsCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportStatsCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportStatsCodeLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportStatsMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsReportStatsOccurrences :: Maybe Int
    <*> arbitraryReducedMaybe n -- catalogsReportStatsReportType :: Maybe E'ReportType
    <*> arbitraryReducedMaybe n -- catalogsReportStatsSeverity :: Maybe E'Severity
    <*> arbitraryReducedMaybe n -- catalogsReportStatsIneligibleForAds :: Maybe Bool
    <*> arbitraryReducedMaybe n -- catalogsReportStatsIneligibleForOrganic :: Maybe Bool
  
instance Arbitrary CatalogsReportStatsParameters where
  arbitrary = sized genCatalogsReportStatsParameters

genCatalogsReportStatsParameters :: Int -> Gen CatalogsReportStatsParameters
genCatalogsReportStatsParameters n =
  CatalogsReportStatsParameters
    <$> arbitrary -- catalogsReportStatsParametersCatalogType :: E'CatalogType2
    <*> arbitraryReduced n -- catalogsReportStatsParametersReport :: CatalogsHotelReportStatsParametersReport
  
instance Arbitrary CatalogsRetailAvailableFilterValues where
  arbitrary = sized genCatalogsRetailAvailableFilterValues

genCatalogsRetailAvailableFilterValues :: Int -> Gen CatalogsRetailAvailableFilterValues
genCatalogsRetailAvailableFilterValues n =
  CatalogsRetailAvailableFilterValues
    <$> arbitrary -- catalogsRetailAvailableFilterValuesCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsRetailAvailableFilterValuesFilterValues :: CatalogsRetailFilterValuesMap
  
instance Arbitrary CatalogsRetailBatchRequest where
  arbitrary = sized genCatalogsRetailBatchRequest

genCatalogsRetailBatchRequest :: Int -> Gen CatalogsRetailBatchRequest
genCatalogsRetailBatchRequest n =
  CatalogsRetailBatchRequest
    <$> arbitraryReducedMaybe n -- catalogsRetailBatchRequestCatalogId :: Maybe Text
    <*> arbitrary -- catalogsRetailBatchRequestCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsRetailBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsRetailBatchRequestItems :: [CatalogsRetailBatchRequestItemsItems]
    <*> arbitrary -- catalogsRetailBatchRequestLanguage :: E'Language
  
instance Arbitrary CatalogsRetailBatchRequestItemsItems where
  arbitrary = sized genCatalogsRetailBatchRequestItemsItems

genCatalogsRetailBatchRequestItemsItems :: Int -> Gen CatalogsRetailBatchRequestItemsItems
genCatalogsRetailBatchRequestItemsItems n =
  CatalogsRetailBatchRequestItemsItems
    <$> arbitraryReduced n -- catalogsRetailBatchRequestItemsItemsAttributes :: ItemAttributesRequest
    <*> arbitrary -- catalogsRetailBatchRequestItemsItemsItemId :: Text
    <*> arbitrary -- catalogsRetailBatchRequestItemsItemsOperation :: E'Operation
    <*> arbitraryReducedMaybe n -- catalogsRetailBatchRequestItemsItemsUpdateMask :: Maybe [UpdateMaskFieldType]
    <*> arbitraryReducedMaybe n -- catalogsRetailBatchRequestItemsItemsLastUpdatedTime :: Maybe Integer
  
instance Arbitrary CatalogsRetailFeed where
  arbitrary = sized genCatalogsRetailFeed

genCatalogsRetailFeed :: Int -> Gen CatalogsRetailFeed
genCatalogsRetailFeed n =
  CatalogsRetailFeed
    <$> arbitrary -- catalogsRetailFeedCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsRetailFeedCreatedAt :: DateTime
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReduced n -- catalogsRetailFeedDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedDefaultCurrency :: Maybe NullableCurrency
    <*> arbitrary -- catalogsRetailFeedDefaultLocale :: Text
    <*> arbitraryReduced n -- catalogsRetailFeedFormat :: CatalogsFormat
    <*> arbitrary -- catalogsRetailFeedId :: Text
    <*> arbitrary -- catalogsRetailFeedLocation :: Text
    <*> arbitrary -- catalogsRetailFeedName :: Text
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedPreferredProcessingSchedule :: Maybe CatalogsFeedProcessingSchedule
    <*> arbitraryReduced n -- catalogsRetailFeedStatus :: CatalogsStatus
    <*> arbitraryReduced n -- catalogsRetailFeedUpdatedAt :: DateTime
  
instance Arbitrary CatalogsRetailFeedsCreateRequest where
  arbitrary = sized genCatalogsRetailFeedsCreateRequest

genCatalogsRetailFeedsCreateRequest :: Int -> Gen CatalogsRetailFeedsCreateRequest
genCatalogsRetailFeedsCreateRequest n =
  CatalogsRetailFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestCatalogId :: Maybe Text
    <*> arbitrary -- catalogsRetailFeedsCreateRequestCatalogType :: E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReduced n -- catalogsRetailFeedsCreateRequestDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsRetailFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReduced n -- catalogsRetailFeedsCreateRequestDefaultLocale :: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
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
    <$> arbitrary -- catalogsRetailFeedsUpdateRequestCatalogType :: E'CatalogType3
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
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapAvailability :: Maybe [ProductAvailability]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapBrand :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCondition :: Maybe [ProductCondition]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCustomLabel0 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCustomLabel1 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCustomLabel2 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCustomLabel3 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapCustomLabel4 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGender :: Maybe [Gender]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory0 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory1 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory2 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory3 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory4 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory5 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapGoogleProductCategory6 :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- catalogsRetailFilterValuesMapMediaType :: Maybe [MediaType]
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
    <$> arbitrary -- catalogsRetailItemErrorResponseCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsRetailItemErrorResponseErrors :: [ItemValidationEvent]
    <*> arbitraryReducedMaybe n -- catalogsRetailItemErrorResponseItemId :: Maybe Text
    <*> arbitrary -- catalogsRetailItemErrorResponseItemResponseKind :: E'ItemResponseKind5
  
instance Arbitrary CatalogsRetailItemResponse where
  arbitrary = sized genCatalogsRetailItemResponse

genCatalogsRetailItemResponse :: Int -> Gen CatalogsRetailItemResponse
genCatalogsRetailItemResponse n =
  CatalogsRetailItemResponse
    <$> arbitraryReducedMaybe n -- catalogsRetailItemResponseAttributes :: Maybe ItemAttributes
    <*> arbitrary -- catalogsRetailItemResponseCatalogType :: E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsRetailItemResponseItemId :: Maybe Text
    <*> arbitrary -- catalogsRetailItemResponseItemResponseKind :: E'ItemResponseKind6
    <*> arbitraryReducedMaybe n -- catalogsRetailItemResponsePins :: Maybe [Pin]
  
instance Arbitrary CatalogsRetailItemsBatch where
  arbitrary = sized genCatalogsRetailItemsBatch

genCatalogsRetailItemsBatch :: Int -> Gen CatalogsRetailItemsBatch
genCatalogsRetailItemsBatch n =
  CatalogsRetailItemsBatch
    <$> arbitraryReducedMaybe n -- catalogsRetailItemsBatchBatchId :: Maybe Text
    <*> arbitrary -- catalogsRetailItemsBatchCatalogType :: E'CatalogType3
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReduced n -- catalogsRetailItemsBatchCreatedTime :: DateTime
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsBatchItems :: Maybe [ItemProcessingRecord]
    <*> arbitraryReducedMaybe n -- catalogsRetailItemsBatchStatus :: Maybe BatchOperationStatus
  
instance Arbitrary CatalogsRetailItemsPostFilter where
  arbitrary = sized genCatalogsRetailItemsPostFilter

genCatalogsRetailItemsPostFilter :: Int -> Gen CatalogsRetailItemsPostFilter
genCatalogsRetailItemsPostFilter n =
  CatalogsRetailItemsPostFilter
    <$> arbitraryReducedMaybe n -- catalogsRetailItemsPostFilterCatalogId :: Maybe Text
    <*> arbitrary -- catalogsRetailItemsPostFilterCatalogType :: E'CatalogType3
    <*> arbitrary -- catalogsRetailItemsPostFilterItemIds :: [Text]
  
instance Arbitrary CatalogsRetailListProductsByCatalogBasedFilterRequest where
  arbitrary = sized genCatalogsRetailListProductsByCatalogBasedFilterRequest

genCatalogsRetailListProductsByCatalogBasedFilterRequest :: Int -> Gen CatalogsRetailListProductsByCatalogBasedFilterRequest
genCatalogsRetailListProductsByCatalogBasedFilterRequest n =
  CatalogsRetailListProductsByCatalogBasedFilterRequest
    <$> arbitrary -- catalogsRetailListProductsByCatalogBasedFilterRequestCatalogId :: Text
    <*> arbitrary -- catalogsRetailListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsRetailListProductsByCatalogBasedFilterRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsRetailListProductsByCatalogBasedFilterRequestFilters :: CatalogsProductGroupFilters
    <*> arbitraryReduced n -- catalogsRetailListProductsByCatalogBasedFilterRequestLocale :: CatalogsLocale
  
instance Arbitrary CatalogsRetailProduct where
  arbitrary = sized genCatalogsRetailProduct

genCatalogsRetailProduct :: Int -> Gen CatalogsRetailProduct
genCatalogsRetailProduct n =
  CatalogsRetailProduct
    <$> arbitrary -- catalogsRetailProductCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsRetailProductMetadata :: CatalogsRetailProductMetadata
    <*> arbitraryReduced n -- catalogsRetailProductPin :: Pin
  
instance Arbitrary CatalogsRetailProductGroup where
  arbitrary = sized genCatalogsRetailProductGroup

genCatalogsRetailProductGroup :: Int -> Gen CatalogsRetailProductGroup
genCatalogsRetailProductGroup n =
  CatalogsRetailProductGroup
    <$> arbitrary -- catalogsRetailProductGroupCatalogId :: Text
    <*> arbitrary -- catalogsRetailProductGroupCatalogType :: E'CatalogType3
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
    <*> arbitrary -- catalogsRetailProductGroupCreateRequestCatalogType :: E'CatalogType3
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
    <$> arbitrary -- catalogsRetailProductGroupProductCountsCatalogType :: E'CatalogType3
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
    <$> arbitraryReducedMaybe n -- catalogsRetailProductGroupUpdateRequestCatalogType :: Maybe E'CatalogType3
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
    <$> arbitraryReduced n -- catalogsRetailProductMetadataAvailability :: ProductAvailability
    <*> arbitraryReduced n -- catalogsRetailProductMetadataCurrency :: NonNullableCatalogsCurrency
    <*> arbitrary -- catalogsRetailProductMetadataItemGroupId :: Text
    <*> arbitrary -- catalogsRetailProductMetadataItemId :: Text
    <*> arbitrary -- catalogsRetailProductMetadataPrice :: Double
    <*> arbitrary -- catalogsRetailProductMetadataSalePrice :: Double
  
instance Arbitrary CatalogsRetailReportAllItemsFilter where
  arbitrary = sized genCatalogsRetailReportAllItemsFilter

genCatalogsRetailReportAllItemsFilter :: Int -> Gen CatalogsRetailReportAllItemsFilter
genCatalogsRetailReportAllItemsFilter n =
  CatalogsRetailReportAllItemsFilter
    <$> arbitraryReducedMaybe n -- catalogsRetailReportAllItemsFilterCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailReportAllItemsFilterProductGroupId :: Maybe Text
    <*> arbitrary -- catalogsRetailReportAllItemsFilterReportType :: E'ReportType3
  
instance Arbitrary CatalogsRetailReportParameters where
  arbitrary = sized genCatalogsRetailReportParameters

genCatalogsRetailReportParameters :: Int -> Gen CatalogsRetailReportParameters
genCatalogsRetailReportParameters n =
  CatalogsRetailReportParameters
    <$> arbitrary -- catalogsRetailReportParametersCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsRetailReportParametersReport :: CatalogsRetailReportParametersReport
  
instance Arbitrary CatalogsRetailReportParametersReport where
  arbitrary = sized genCatalogsRetailReportParametersReport

genCatalogsRetailReportParametersReport :: Int -> Gen CatalogsRetailReportParametersReport
genCatalogsRetailReportParametersReport n =
  CatalogsRetailReportParametersReport
    <$> arbitrary -- catalogsRetailReportParametersReportFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsRetailReportParametersReportProcessingResultId :: Maybe Text
    <*> arbitrary -- catalogsRetailReportParametersReportReportType :: E'ReportType3
    <*> arbitraryReducedMaybe n -- catalogsRetailReportParametersReportCatalogId :: Maybe Text
    <*> arbitraryReducedMaybe n -- catalogsRetailReportParametersReportProductGroupId :: Maybe Text
  
instance Arbitrary CatalogsRetailReportStatsParameters where
  arbitrary = sized genCatalogsRetailReportStatsParameters

genCatalogsRetailReportStatsParameters :: Int -> Gen CatalogsRetailReportStatsParameters
genCatalogsRetailReportStatsParameters n =
  CatalogsRetailReportStatsParameters
    <$> arbitrary -- catalogsRetailReportStatsParametersCatalogType :: E'CatalogType3
    <*> arbitraryReduced n -- catalogsRetailReportStatsParametersReport :: CatalogsRetailReportStatsParametersReport
  
instance Arbitrary CatalogsRetailReportStatsParametersReport where
  arbitrary = sized genCatalogsRetailReportStatsParametersReport

genCatalogsRetailReportStatsParametersReport :: Int -> Gen CatalogsRetailReportStatsParametersReport
genCatalogsRetailReportStatsParametersReport n =
  CatalogsRetailReportStatsParametersReport
    <$> arbitrary -- catalogsRetailReportStatsParametersReportFeedId :: Text
    <*> arbitraryReducedMaybe n -- catalogsRetailReportStatsParametersReportProcessingResultId :: Maybe Text
    <*> arbitrary -- catalogsRetailReportStatsParametersReportReportType :: E'ReportType
    <*> arbitraryReducedMaybe n -- catalogsRetailReportStatsParametersReportCatalogId :: Maybe Text
  
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
    <*> arbitrary -- catalogsUpdateCreativeAssetsItemOperation :: E'Operation5
  
instance Arbitrary CatalogsUpdateHotelItem where
  arbitrary = sized genCatalogsUpdateHotelItem

genCatalogsUpdateHotelItem :: Int -> Gen CatalogsUpdateHotelItem
genCatalogsUpdateHotelItem n =
  CatalogsUpdateHotelItem
    <$> arbitraryReduced n -- catalogsUpdateHotelItemAttributes :: CatalogsUpdatableHotelAttributes
    <*> arbitrary -- catalogsUpdateHotelItemHotelId :: Text
    <*> arbitrary -- catalogsUpdateHotelItemOperation :: E'Operation5
  
instance Arbitrary CatalogsUpdateRetailItem where
  arbitrary = sized genCatalogsUpdateRetailItem

genCatalogsUpdateRetailItem :: Int -> Gen CatalogsUpdateRetailItem
genCatalogsUpdateRetailItem n =
  CatalogsUpdateRetailItem
    <$> arbitraryReduced n -- catalogsUpdateRetailItemAttributes :: UpdatableItemAttributes
    <*> arbitrary -- catalogsUpdateRetailItemItemId :: Text
    <*> arbitrary -- catalogsUpdateRetailItemOperation :: E'Operation5
    <*> arbitraryReducedMaybe n -- catalogsUpdateRetailItemUpdateMask :: Maybe [UpdateMaskFieldType]
  
instance Arbitrary CatalogsUpsertCreativeAssetsItem where
  arbitrary = sized genCatalogsUpsertCreativeAssetsItem

genCatalogsUpsertCreativeAssetsItem :: Int -> Gen CatalogsUpsertCreativeAssetsItem
genCatalogsUpsertCreativeAssetsItem n =
  CatalogsUpsertCreativeAssetsItem
    <$> arbitraryReduced n -- catalogsUpsertCreativeAssetsItemAttributes :: CatalogsCreativeAssetsAttributes
    <*> arbitrary -- catalogsUpsertCreativeAssetsItemCreativeAssetsId :: Text
    <*> arbitrary -- catalogsUpsertCreativeAssetsItemOperation :: E'Operation2
  
instance Arbitrary CatalogsUpsertHotelItem where
  arbitrary = sized genCatalogsUpsertHotelItem

genCatalogsUpsertHotelItem :: Int -> Gen CatalogsUpsertHotelItem
genCatalogsUpsertHotelItem n =
  CatalogsUpsertHotelItem
    <$> arbitraryReduced n -- catalogsUpsertHotelItemAttributes :: CatalogsHotelAttributes
    <*> arbitrary -- catalogsUpsertHotelItemHotelId :: Text
    <*> arbitrary -- catalogsUpsertHotelItemOperation :: E'Operation2
  
instance Arbitrary CatalogsUpsertRetailItem where
  arbitrary = sized genCatalogsUpsertRetailItem

genCatalogsUpsertRetailItem :: Int -> Gen CatalogsUpsertRetailItem
genCatalogsUpsertRetailItem n =
  CatalogsUpsertRetailItem
    <$> arbitraryReduced n -- catalogsUpsertRetailItemAttributes :: ItemAttributesRequest
    <*> arbitrary -- catalogsUpsertRetailItemItemId :: Text
    <*> arbitrary -- catalogsUpsertRetailItemOperation :: E'Operation2
  
instance Arbitrary CatalogsVerticalBatchRequest where
  arbitrary = sized genCatalogsVerticalBatchRequest

genCatalogsVerticalBatchRequest :: Int -> Gen CatalogsVerticalBatchRequest
genCatalogsVerticalBatchRequest n =
  CatalogsVerticalBatchRequest
    <$> arbitraryReducedMaybe n -- catalogsVerticalBatchRequestCatalogId :: Maybe Text
    <*> arbitrary -- catalogsVerticalBatchRequestCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsVerticalBatchRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsVerticalBatchRequestItems :: [CatalogsCreativeAssetsBatchItem]
    <*> arbitrary -- catalogsVerticalBatchRequestLanguage :: E'Language
  
instance Arbitrary CatalogsVerticalFeedsCreateRequest where
  arbitrary = sized genCatalogsVerticalFeedsCreateRequest

genCatalogsVerticalFeedsCreateRequest :: Int -> Gen CatalogsVerticalFeedsCreateRequest
genCatalogsVerticalFeedsCreateRequest n =
  CatalogsVerticalFeedsCreateRequest
    <$> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestCatalogId :: Maybe Text
    <*> arbitrary -- catalogsVerticalFeedsCreateRequestCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestCredentials :: Maybe CatalogsFeedCredentials
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestDefaultAvailability :: Maybe ProductAvailabilityType
    <*> arbitraryReduced n -- catalogsVerticalFeedsCreateRequestDefaultCountry :: Country
    <*> arbitraryReducedMaybe n -- catalogsVerticalFeedsCreateRequestDefaultCurrency :: Maybe NullableCurrency
    <*> arbitraryReduced n -- catalogsVerticalFeedsCreateRequestDefaultLocale :: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
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
    <$> arbitrary -- catalogsVerticalFeedsUpdateRequestCatalogType :: E'CatalogType
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
    <*> arbitrary -- catalogsVerticalProductGroupCatalogType :: E'CatalogType
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
    <*> arbitrary -- catalogsVerticalProductGroupCreateRequestCatalogType :: E'CatalogType
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
    <$> arbitraryReducedMaybe n -- catalogsVerticalProductGroupUpdateRequestCatalogType :: Maybe E'CatalogType
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
    <*> arbitrary -- catalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogType :: E'CatalogType
    <*> arbitraryReduced n -- catalogsVerticalsListProductsByCatalogBasedFilterRequestCountry :: Country
    <*> arbitraryReduced n -- catalogsVerticalsListProductsByCatalogBasedFilterRequestFilters :: CatalogsCreativeAssetsProductGroupFilters
    <*> arbitraryReduced n -- catalogsVerticalsListProductsByCatalogBasedFilterRequestLocale :: CatalogsLocale
  
instance Arbitrary ConditionFilter where
  arbitrary = sized genConditionFilter

genConditionFilter :: Int -> Gen ConditionFilter
genConditionFilter n =
  ConditionFilter
    <$> arbitraryReduced n -- conditionFilterCondition :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary ConversionAccessToken where
  arbitrary = sized genConversionAccessToken

genConversionAccessToken :: Int -> Gen ConversionAccessToken
genConversionAccessToken n =
  ConversionAccessToken
    <$> arbitrary -- conversionAccessTokenAccessToken :: Text
    <*> arbitraryReducedMaybe n -- conversionAccessTokenTokenType :: Maybe Text
  
instance Arbitrary ConversionApiResponseEventsItems where
  arbitrary = sized genConversionApiResponseEventsItems

genConversionApiResponseEventsItems :: Int -> Gen ConversionApiResponseEventsItems
genConversionApiResponseEventsItems n =
  ConversionApiResponseEventsItems
    <$> arbitraryReducedMaybe n -- conversionApiResponseEventsItemsErrorMessage :: Maybe Text
    <*> arbitraryReduced n -- conversionApiResponseEventsItemsStatus :: EventProcessingStatus
    <*> arbitraryReducedMaybe n -- conversionApiResponseEventsItemsWarningMessage :: Maybe Text
  
instance Arbitrary ConversionDeletionRequest where
  arbitrary = sized genConversionDeletionRequest

genConversionDeletionRequest :: Int -> Gen ConversionDeletionRequest
genConversionDeletionRequest n =
  ConversionDeletionRequest
    <$> arbitraryReduced n -- conversionDeletionRequestCreatedTime :: Date
    <*> arbitraryReducedMaybe n -- conversionDeletionRequestProcessedTime :: Maybe Date
    <*> arbitrary -- conversionDeletionRequestRequestId :: Text
    <*> arbitraryReduced n -- conversionDeletionRequestStatus :: ConversionDeletionRequestStatus
  
instance Arbitrary ConversionDeletionRequestCreate where
  arbitrary = sized genConversionDeletionRequestCreate

genConversionDeletionRequestCreate :: Int -> Gen ConversionDeletionRequestCreate
genConversionDeletionRequestCreate n =
  ConversionDeletionRequestCreate
    <$> arbitraryReduced n -- conversionDeletionRequestCreateDeletionTargets :: ConversionDeletionRequestTargets
  
instance Arbitrary ConversionDeletionRequestEPIKTargets where
  arbitrary = sized genConversionDeletionRequestEPIKTargets

genConversionDeletionRequestEPIKTargets :: Int -> Gen ConversionDeletionRequestEPIKTargets
genConversionDeletionRequestEPIKTargets n =
  ConversionDeletionRequestEPIKTargets
    <$> arbitrary -- conversionDeletionRequestEPIKTargetsEpiks :: [Text]
  
instance Arbitrary ConversionDeletionRequestList200Response where
  arbitrary = sized genConversionDeletionRequestList200Response

genConversionDeletionRequestList200Response :: Int -> Gen ConversionDeletionRequestList200Response
genConversionDeletionRequestList200Response n =
  ConversionDeletionRequestList200Response
    <$> arbitraryReducedMaybe n -- conversionDeletionRequestList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- conversionDeletionRequestList200ResponseItems :: [ConversionDeletionRequest]
  
instance Arbitrary ConversionDeletionRequestTargets where
  arbitrary = sized genConversionDeletionRequestTargets

genConversionDeletionRequestTargets :: Int -> Gen ConversionDeletionRequestTargets
genConversionDeletionRequestTargets n =
  ConversionDeletionRequestTargets
    <$> arbitrary -- conversionDeletionRequestTargetsUserEmails :: [Text]
    <*> arbitrary -- conversionDeletionRequestTargetsEpiks :: [Text]
  
instance Arbitrary ConversionDeletionRequestUserEmailTargets where
  arbitrary = sized genConversionDeletionRequestUserEmailTargets

genConversionDeletionRequestUserEmailTargets :: Int -> Gen ConversionDeletionRequestUserEmailTargets
genConversionDeletionRequestUserEmailTargets n =
  ConversionDeletionRequestUserEmailTargets
    <$> arbitrary -- conversionDeletionRequestUserEmailTargetsUserEmails :: [Text]
  
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
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoFormFactor :: Maybe FormFactor
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoKernelVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoLanguages :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoLocale :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoModel :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoNetworkType :: Maybe NetworkType
    <*> arbitraryReducedMaybe n -- conversionEventDeviceInfoOsFamily :: Maybe OsFamily
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
    <*> arbitraryReducedMaybe n -- conversionEventResponseReportingConversionEvent :: Maybe Text
  
instance Arbitrary ConversionEvents where
  arbitrary = sized genConversionEvents

genConversionEvents :: Int -> Gen ConversionEvents
genConversionEvents n =
  ConversionEvents
    <$> arbitraryReduced n -- conversionEventsEvents :: [ConversionApiResponseEventsItems]
    <*> arbitrary -- conversionEventsNumEventsProcessed :: Int
    <*> arbitrary -- conversionEventsNumEventsReceived :: Int
  
instance Arbitrary ConversionEventsCreate where
  arbitrary = sized genConversionEventsCreate

genConversionEventsCreate :: Int -> Gen ConversionEventsCreate
genConversionEventsCreate n =
  ConversionEventsCreate
    <$> arbitraryReduced n -- conversionEventsCreateData :: [ConversionEventsDataItems]
  
instance Arbitrary ConversionEventsDataItems where
  arbitrary = sized genConversionEventsDataItems

genConversionEventsDataItems :: Int -> Gen ConversionEventsDataItems
genConversionEventsDataItems n =
  ConversionEventsDataItems
    <$> arbitrary -- conversionEventsDataItemsActionSource :: Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsAppId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsAppInfo :: Maybe ConversionEventAppInfo
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsAppName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsAppVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomData :: Maybe ConversionEventsDataItemsCustomData
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsDeviceBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsDeviceCarrier :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsDeviceInfo :: Maybe ConversionEventDeviceInfo
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsDeviceModel :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsDeviceType :: Maybe Text
    <*> arbitrary -- conversionEventsDataItemsEventId :: Text
    <*> arbitrary -- conversionEventsDataItemsEventName :: Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsEventSourceUrl :: Maybe Text
    <*> arbitrary -- conversionEventsDataItemsEventTime :: Integer
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsLanguage :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsOptOut :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsOsVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsPartnerName :: Maybe Text
    <*> arbitraryReduced n -- conversionEventsDataItemsUserData :: ConversionEventsUserDataProperties
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsWifi :: Maybe Bool
  
instance Arbitrary ConversionEventsDataItemsCustomData where
  arbitrary = sized genConversionEventsDataItemsCustomData

genConversionEventsDataItemsCustomData :: Int -> Gen ConversionEventsDataItemsCustomData
genConversionEventsDataItemsCustomData n =
  ConversionEventsDataItemsCustomData
    <$> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContentBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContentCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContentIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContentName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContents :: Maybe [ConversionEventsDataItemsCustomDataContentsItems]
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataExternalMeasurementId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataExternalMeasurementVendorId :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataNp :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataNumItems :: Maybe Integer
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataOptOutType :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataPredictedLtv :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataSearchString :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataValue :: Maybe Text
  
instance Arbitrary ConversionEventsDataItemsCustomDataContentsItems where
  arbitrary = sized genConversionEventsDataItemsCustomDataContentsItems

genConversionEventsDataItemsCustomDataContentsItems :: Int -> Gen ConversionEventsDataItemsCustomDataContentsItems
genConversionEventsDataItemsCustomDataContentsItems n =
  ConversionEventsDataItemsCustomDataContentsItems
    <$> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContentsItemsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContentsItemsItemBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContentsItemsItemBrandId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContentsItemsItemCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContentsItemsItemName :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContentsItemsItemPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionEventsDataItemsCustomDataContentsItemsQuantity :: Maybe Integer
  
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
  
instance Arbitrary ConversionMSOTEventsCreate where
  arbitrary = sized genConversionMSOTEventsCreate

genConversionMSOTEventsCreate :: Int -> Gen ConversionMSOTEventsCreate
genConversionMSOTEventsCreate n =
  ConversionMSOTEventsCreate
    <$> arbitraryReducedMaybe n -- conversionMSOTEventsCreateActionTimestamps :: Maybe [Integer]
    <*> arbitrary -- conversionMSOTEventsCreateAdGroupId :: Text
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCreateAttributionModel :: Maybe AttributionModel
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCreateAttributionScope :: Maybe AttributionScope
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCreateAttributionScore :: Maybe Double
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCreateCampaignId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCreateClickWindow :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCreateCurrency :: Maybe Currency
    <*> arbitrary -- conversionMSOTEventsCreateEventId :: Text
    <*> arbitraryReduced n -- conversionMSOTEventsCreateEventName :: MsotEventName
    <*> arbitrary -- conversionMSOTEventsCreateEventTimestamp :: Integer
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCreateTotalEventTouchpoints :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCreateTotalEvents :: Maybe Int
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCreateTotalEventsFractional :: Maybe Double
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCreateValue :: Maybe Double
    <*> arbitraryReducedMaybe n -- conversionMSOTEventsCreateViewWindow :: Maybe Text
  
instance Arbitrary ConversionProductReport where
  arbitrary = sized genConversionProductReport

genConversionProductReport :: Int -> Gen ConversionProductReport
genConversionProductReport n =
  ConversionProductReport
    <$> arbitraryReducedMaybe n -- conversionProductReportMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionProductReportReportStatus :: Maybe BulkReportingJobStatus
    <*> arbitraryReducedMaybe n -- conversionProductReportSize :: Maybe Double
    <*> arbitraryReducedMaybe n -- conversionProductReportToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionProductReportUrl :: Maybe Text
  
instance Arbitrary ConversionProductReportCreate where
  arbitrary = sized genConversionProductReportCreate

genConversionProductReportCreate :: Int -> Gen ConversionProductReportCreate
genConversionProductReportCreate n =
  ConversionProductReportCreate
    <$> arbitraryReducedMaybe n -- conversionProductReportCreateAdGroupIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionProductReportCreateCampaignIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- conversionProductReportCreateCampaignObjectiveTypes :: Maybe [ConversionObjectiveType]
    <*> arbitraryReducedMaybe n -- conversionProductReportCreateClickWindowDays :: Maybe ConversionAttributionWindowDays
    <*> arbitraryReduced n -- conversionProductReportCreateColumns :: [ConversionProductReportingColumn]
    <*> arbitraryReducedMaybe n -- conversionProductReportCreateConversionProductAttributionType :: Maybe ConversionProductAttributionType
    <*> arbitraryReducedMaybe n -- conversionProductReportCreateConversionProductBreakdown :: Maybe ConversionProductReportBreakdownType
    <*> arbitraryReducedMaybe n -- conversionProductReportCreateConversionReportTime :: Maybe ConversionReportTimeType
    <*> arbitrary -- conversionProductReportCreateEndDate :: Text
    <*> arbitraryReduced n -- conversionProductReportCreateGranularity :: ConversionProductReportGranularity
    <*> arbitraryReduced n -- conversionProductReportCreateLevel :: ConversionProductReportLevel
    <*> arbitraryReducedMaybe n -- conversionProductReportCreateProductSkuIds :: Maybe [Text]
    <*> arbitrary -- conversionProductReportCreateReportName :: Text
    <*> arbitrary -- conversionProductReportCreateStartDate :: Text
    <*> arbitraryReducedMaybe n -- conversionProductReportCreateViewWindowDays :: Maybe ConversionAttributionWindowDays
  
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
  
instance Arbitrary ConversionTagV3GoalMetadata where
  arbitrary = sized genConversionTagV3GoalMetadata

genConversionTagV3GoalMetadata :: Int -> Gen ConversionTagV3GoalMetadata
genConversionTagV3GoalMetadata n =
  ConversionTagV3GoalMetadata
    <$> arbitraryReducedMaybe n -- conversionTagV3GoalMetadataAttributionWindows :: Maybe AttributionWindows
    <*> arbitraryReducedMaybe n -- conversionTagV3GoalMetadataConversionEvent :: Maybe ConversionEvent
    <*> arbitraryReducedMaybe n -- conversionTagV3GoalMetadataConversionTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagV3GoalMetadataCpaGoalValueInMicroCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- conversionTagV3GoalMetadataIsRoasOptimized :: Maybe Bool
    <*> arbitraryReducedMaybe n -- conversionTagV3GoalMetadataReportingEvent :: Maybe Text
  
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
    <$> arbitraryReduced n -- createAssetAccessRequestBodyAssetRequests :: [CreateAssetAccessRequestItem]
  
instance Arbitrary CreateAssetAccessRequestItem where
  arbitrary = sized genCreateAssetAccessRequestItem

genCreateAssetAccessRequestItem :: Int -> Gen CreateAssetAccessRequestItem
genCreateAssetAccessRequestItem n =
  CreateAssetAccessRequestItem
    <$> arbitraryReduced n -- createAssetAccessRequestItemAssetIdToPermissions :: (Map.Map String Array)
    <*> arbitrary -- createAssetAccessRequestItemPartnerId :: Text
  
instance Arbitrary CreateAssetAccessRequestResponse where
  arbitrary = sized genCreateAssetAccessRequestResponse

genCreateAssetAccessRequestResponse :: Int -> Gen CreateAssetAccessRequestResponse
genCreateAssetAccessRequestResponse n =
  CreateAssetAccessRequestResponse
    <$> arbitraryReducedMaybe n -- createAssetAccessRequestResponseExceptions :: Maybe [AssetAccessRequestError]
    <*> arbitraryReducedMaybe n -- createAssetAccessRequestResponseInvites :: Maybe (Map.Map String Text)
  
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
    <$> arbitraryReduced n -- createAssetInvitesRequestItemAssetIdToPermissions :: (Map.Map String Array)
    <*> arbitrary -- createAssetInvitesRequestItemInviteId :: Text
    <*> arbitraryReduced n -- createAssetInvitesRequestItemInviteType :: InviteType
  
instance Arbitrary CreateInvitesResultsResponseArray where
  arbitrary = sized genCreateInvitesResultsResponseArray

genCreateInvitesResultsResponseArray :: Int -> Gen CreateInvitesResultsResponseArray
genCreateInvitesResultsResponseArray n =
  CreateInvitesResultsResponseArray
    <$> arbitraryReducedMaybe n -- createInvitesResultsResponseArrayItems :: Maybe [InviteActionResultItem]
  
instance Arbitrary CreateMembershipOrPartnershipInvitesBody where
  arbitrary = sized genCreateMembershipOrPartnershipInvitesBody

genCreateMembershipOrPartnershipInvitesBody :: Int -> Gen CreateMembershipOrPartnershipInvitesBody
genCreateMembershipOrPartnershipInvitesBody n =
  CreateMembershipOrPartnershipInvitesBody
    <$> arbitraryReduced n -- createMembershipOrPartnershipInvitesBodyBusinessRole :: BusinessRoleForInvite
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
  
instance Arbitrary CustomConversionEventMetrics where
  arbitrary = sized genCustomConversionEventMetrics

genCustomConversionEventMetrics :: Int -> Gen CustomConversionEventMetrics
genCustomConversionEventMetrics n =
  CustomConversionEventMetrics
    <$> arbitraryReduced n -- customConversionEventMetricsCustomEventMetricsType :: AdeColumnType
    <*> arbitrary -- customConversionEventMetricsCustomEventName :: Text
  
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
    <*> arbitrary -- customerListId :: Text
    <*> arbitraryReducedMaybe n -- customerListIsNca :: Maybe Bool
    <*> arbitrary -- customerListName :: Text
    <*> arbitraryReducedMaybe n -- customerListNumBatches :: Maybe Double
    <*> arbitraryReducedMaybe n -- customerListNumRemovedUserRecords :: Maybe Double
    <*> arbitraryReducedMaybe n -- customerListNumUploadedUserRecords :: Maybe Double
    <*> arbitraryReducedMaybe n -- customerListStatus :: Maybe CustomerListStatus
    <*> arbitraryReducedMaybe n -- customerListType :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListUpdatedTime :: Maybe Double
  
instance Arbitrary CustomerListCreate where
  arbitrary = sized genCustomerListCreate

genCustomerListCreate :: Int -> Gen CustomerListCreate
genCustomerListCreate n =
  CustomerListCreate
    <$> arbitraryReducedMaybe n -- customerListCreateIsNca :: Maybe Bool
    <*> arbitraryReducedMaybe n -- customerListCreateListType :: Maybe UserListType
    <*> arbitrary -- customerListCreateName :: Text
    <*> arbitraryReducedMaybe n -- customerListCreateRecords :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListCreateRecordsV2 :: Maybe [CustomerListRecordRow]
  
instance Arbitrary CustomerListRecordRow where
  arbitrary = sized genCustomerListRecordRow

genCustomerListRecordRow :: Int -> Gen CustomerListRecordRow
genCustomerListRecordRow n =
  CustomerListRecordRow
    <$> arbitraryReducedMaybe n -- customerListRecordRowEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListRecordRowExternalId :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListRecordRowHashedPhoneNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListRecordRowHashedPinnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListRecordRowIpAddress :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListRecordRowLiverampEnvelope :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListRecordRowMaid :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListRecordRowUserAgent :: Maybe Text
  
instance Arbitrary CustomerListUpdateWithRequiredBody where
  arbitrary = sized genCustomerListUpdateWithRequiredBody

genCustomerListUpdateWithRequiredBody :: Int -> Gen CustomerListUpdateWithRequiredBody
genCustomerListUpdateWithRequiredBody n =
  CustomerListUpdateWithRequiredBody
    <$> arbitraryReduced n -- customerListUpdateWithRequiredBodyOperationType :: UserListOperationType
    <*> arbitraryReducedMaybe n -- customerListUpdateWithRequiredBodyRecords :: Maybe Text
    <*> arbitraryReducedMaybe n -- customerListUpdateWithRequiredBodyRecordsV2 :: Maybe [CustomerListRecordRow]
  
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
    <*> arbitraryReduced n -- customerListUploadState :: WorkloadState
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
  
instance Arbitrary CustomerListsList200Response where
  arbitrary = sized genCustomerListsList200Response

genCustomerListsList200Response :: Int -> Gen CustomerListsList200Response
genCustomerListsList200Response n =
  CustomerListsList200Response
    <$> arbitraryReducedMaybe n -- customerListsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- customerListsList200ResponseItems :: [CustomerList]
  
instance Arbitrary CustomerSegment where
  arbitrary = sized genCustomerSegment

genCustomerSegment :: Int -> Gen CustomerSegment
genCustomerSegment n =
  CustomerSegment
    <$> arbitraryReducedMaybe n -- customerSegmentAdAccountId :: Maybe Text
    <*> arbitrary -- customerSegmentAudienceIds :: [Text]
    <*> arbitraryReducedMaybe n -- customerSegmentCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- customerSegmentId :: Maybe Text
    <*> arbitrary -- customerSegmentName :: Text
    <*> arbitraryReducedMaybe n -- customerSegmentStatus :: Maybe TargetingTemplateStatus
    <*> arbitraryReducedMaybe n -- customerSegmentUpdatedTime :: Maybe Int
  
instance Arbitrary CustomerSegmentCreate where
  arbitrary = sized genCustomerSegmentCreate

genCustomerSegmentCreate :: Int -> Gen CustomerSegmentCreate
genCustomerSegmentCreate n =
  CustomerSegmentCreate
    <$> arbitrary -- customerSegmentCreateAudienceIds :: [Text]
    <*> arbitrary -- customerSegmentCreateName :: Text
  
instance Arbitrary CustomerSegmentList200Response where
  arbitrary = sized genCustomerSegmentList200Response

genCustomerSegmentList200Response :: Int -> Gen CustomerSegmentList200Response
genCustomerSegmentList200Response n =
  CustomerSegmentList200Response
    <$> arbitraryReducedMaybe n -- customerSegmentList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- customerSegmentList200ResponseItems :: [CustomerSegment]
  
instance Arbitrary CustomerSegmentUpdateRequestUpdateWithRequiredBody where
  arbitrary = sized genCustomerSegmentUpdateRequestUpdateWithRequiredBody

genCustomerSegmentUpdateRequestUpdateWithRequiredBody :: Int -> Gen CustomerSegmentUpdateRequestUpdateWithRequiredBody
genCustomerSegmentUpdateRequestUpdateWithRequiredBody n =
  CustomerSegmentUpdateRequestUpdateWithRequiredBody
    <$> arbitraryReducedMaybe n -- customerSegmentUpdateRequestUpdateWithRequiredBodyAudienceIds :: Maybe [Text]
    <*> arbitrary -- customerSegmentUpdateRequestUpdateWithRequiredBodyId :: Text
    <*> arbitraryReduced n -- customerSegmentUpdateRequestUpdateWithRequiredBodyOperationType :: AudienceUpdateOperationType
  
instance Arbitrary DeleteBusinessMembership200Response where
  arbitrary = sized genDeleteBusinessMembership200Response

genDeleteBusinessMembership200Response :: Int -> Gen DeleteBusinessMembership200Response
genDeleteBusinessMembership200Response n =
  DeleteBusinessMembership200Response
    <$> arbitraryReducedMaybe n -- deleteBusinessMembership200ResponseDeletedMembers :: Maybe [Text]
  
instance Arbitrary DeleteBusinessMembershipBody where
  arbitrary = sized genDeleteBusinessMembershipBody

genDeleteBusinessMembershipBody :: Int -> Gen DeleteBusinessMembershipBody
genDeleteBusinessMembershipBody n =
  DeleteBusinessMembershipBody
    <$> arbitraryReduced n -- deleteBusinessMembershipBodyMembers :: [DeleteBusinessMembershipMember]
  
instance Arbitrary DeleteBusinessMembershipMember where
  arbitrary = sized genDeleteBusinessMembershipMember

genDeleteBusinessMembershipMember :: Int -> Gen DeleteBusinessMembershipMember
genDeleteBusinessMembershipMember n =
  DeleteBusinessMembershipMember
    <$> arbitraryReduced n -- deleteBusinessMembershipMemberBusinessRole :: BusinessRoleForMembers
    <*> arbitrary -- deleteBusinessMembershipMemberMemberId :: Text
  
instance Arbitrary DeleteBusinessPartners where
  arbitrary = sized genDeleteBusinessPartners

genDeleteBusinessPartners :: Int -> Gen DeleteBusinessPartners
genDeleteBusinessPartners n =
  DeleteBusinessPartners
    <$> arbitraryReducedMaybe n -- deleteBusinessPartnersDeletedPartners :: Maybe [Text]
  
instance Arbitrary DeleteBusinessPartnersDelete where
  arbitrary = sized genDeleteBusinessPartnersDelete

genDeleteBusinessPartnersDelete :: Int -> Gen DeleteBusinessPartnersDelete
genDeleteBusinessPartnersDelete n =
  DeleteBusinessPartnersDelete
    <$> arbitrary -- deleteBusinessPartnersDeletePartnerIds :: [Text]
    <*> arbitraryReducedMaybe n -- deleteBusinessPartnersDeletePartnerType :: Maybe NullablePartnerType
  
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
  
instance Arbitrary DeleteMemberAssetAccessItem where
  arbitrary = sized genDeleteMemberAssetAccessItem

genDeleteMemberAssetAccessItem :: Int -> Gen DeleteMemberAssetAccessItem
genDeleteMemberAssetAccessItem n =
  DeleteMemberAssetAccessItem
    <$> arbitrary -- deleteMemberAssetAccessItemAssetId :: Text
    <*> arbitrary -- deleteMemberAssetAccessItemMemberId :: Text
  
instance Arbitrary DeletePartnerAssetAccessBody where
  arbitrary = sized genDeletePartnerAssetAccessBody

genDeletePartnerAssetAccessBody :: Int -> Gen DeletePartnerAssetAccessBody
genDeletePartnerAssetAccessBody n =
  DeletePartnerAssetAccessBody
    <$> arbitraryReduced n -- deletePartnerAssetAccessBodyAccesses :: [DeletePartnerAssetAccessItem]
  
instance Arbitrary DeletePartnerAssetAccessItem where
  arbitrary = sized genDeletePartnerAssetAccessItem

genDeletePartnerAssetAccessItem :: Int -> Gen DeletePartnerAssetAccessItem
genDeletePartnerAssetAccessItem n =
  DeletePartnerAssetAccessItem
    <$> arbitrary -- deletePartnerAssetAccessItemAssetId :: Text
    <*> arbitrary -- deletePartnerAssetAccessItemPartnerId :: Text
    <*> arbitraryReducedMaybe n -- deletePartnerAssetAccessItemPartnerType :: Maybe E'PartnerType
  
instance Arbitrary DeletePartnerAssetAccessResult where
  arbitrary = sized genDeletePartnerAssetAccessResult

genDeletePartnerAssetAccessResult :: Int -> Gen DeletePartnerAssetAccessResult
genDeletePartnerAssetAccessResult n =
  DeletePartnerAssetAccessResult
    <$> arbitraryReducedMaybe n -- deletePartnerAssetAccessResultAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- deletePartnerAssetAccessResultAssetType :: Maybe Text
    <*> arbitraryReducedMaybe n -- deletePartnerAssetAccessResultIsSharedPartner :: Maybe Bool
    <*> arbitraryReducedMaybe n -- deletePartnerAssetAccessResultPartnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- deletePartnerAssetAccessResultPermissions :: Maybe [Text]
  
instance Arbitrary DeletePartnerAssetAccessResultsResponseArray where
  arbitrary = sized genDeletePartnerAssetAccessResultsResponseArray

genDeletePartnerAssetAccessResultsResponseArray :: Int -> Gen DeletePartnerAssetAccessResultsResponseArray
genDeletePartnerAssetAccessResultsResponseArray n =
  DeletePartnerAssetAccessResultsResponseArray
    <$> arbitraryReducedMaybe n -- deletePartnerAssetAccessResultsResponseArrayItems :: Maybe [DeletePartnerAssetAccessResult]
  
instance Arbitrary DeliveryMetricsGet200Response where
  arbitrary = sized genDeliveryMetricsGet200Response

genDeliveryMetricsGet200Response :: Int -> Gen DeliveryMetricsGet200Response
genDeliveryMetricsGet200Response n =
  DeliveryMetricsGet200Response
    <$> arbitraryReduced n -- deliveryMetricsGet200ResponseItems :: [DeliveryMetricsResponseItemsItems]
  
instance Arbitrary DeliveryMetricsResponseItemsItems where
  arbitrary = sized genDeliveryMetricsResponseItemsItems

genDeliveryMetricsResponseItemsItems :: Int -> Gen DeliveryMetricsResponseItemsItems
genDeliveryMetricsResponseItemsItems n =
  DeliveryMetricsResponseItemsItems
    <$> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsItemsCategory :: Maybe E'Category
    <*> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsItemsDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsItemsDisplayName :: Maybe Text
    <*> arbitraryReducedMaybe n -- deliveryMetricsResponseItemsItemsName :: Maybe Text
  
instance Arbitrary DetailedError where
  arbitrary = sized genDetailedError

genDetailedError :: Int -> Gen DetailedError
genDetailedError n =
  DetailedError
    <$> arbitrary -- detailedErrorCode :: Int
    <*> arbitraryReduced n -- detailedErrorDetails :: A.Value
    <*> arbitrary -- detailedErrorMessage :: Text
  
instance Arbitrary DynamicTitlesDownloadCSV where
  arbitrary = sized genDynamicTitlesDownloadCSV

genDynamicTitlesDownloadCSV :: Int -> Gen DynamicTitlesDownloadCSV
genDynamicTitlesDownloadCSV n =
  DynamicTitlesDownloadCSV
    <$> arbitraryReducedMaybe n -- dynamicTitlesDownloadCSVDownloadUrl :: Maybe Text
  
instance Arbitrary DynamicTitlesGetStatus where
  arbitrary = sized genDynamicTitlesGetStatus

genDynamicTitlesGetStatus :: Int -> Gen DynamicTitlesGetStatus
genDynamicTitlesGetStatus n =
  DynamicTitlesGetStatus
    <$> arbitraryReducedMaybe n -- dynamicTitlesGetStatusGeneratedCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- dynamicTitlesGetStatusIsReady :: Maybe Bool
    <*> arbitraryReducedMaybe n -- dynamicTitlesGetStatusReviewedCount :: Maybe Int
  
instance Arbitrary DynamicTitlesProcessCSV where
  arbitrary = sized genDynamicTitlesProcessCSV

genDynamicTitlesProcessCSV :: Int -> Gen DynamicTitlesProcessCSV
genDynamicTitlesProcessCSV n =
  DynamicTitlesProcessCSV
    <$> arbitraryReducedMaybe n -- dynamicTitlesProcessCSVErrors :: Maybe [DynamicTitlesProcessCSVError]
    <*> arbitraryReducedMaybe n -- dynamicTitlesProcessCSVStatus :: Maybe Text
  
instance Arbitrary DynamicTitlesProcessCSVCreate where
  arbitrary = sized genDynamicTitlesProcessCSVCreate

genDynamicTitlesProcessCSVCreate :: Int -> Gen DynamicTitlesProcessCSVCreate
genDynamicTitlesProcessCSVCreate n =
  DynamicTitlesProcessCSVCreate
    <$> arbitrary -- dynamicTitlesProcessCSVCreateRequestId :: Text
  
instance Arbitrary DynamicTitlesProcessCSVError where
  arbitrary = sized genDynamicTitlesProcessCSVError

genDynamicTitlesProcessCSVError :: Int -> Gen DynamicTitlesProcessCSVError
genDynamicTitlesProcessCSVError n =
  DynamicTitlesProcessCSVError
    <$> arbitraryReducedMaybe n -- dynamicTitlesProcessCSVErrorErrorType :: Maybe Text
    <*> arbitraryReducedMaybe n -- dynamicTitlesProcessCSVErrorRowNumber :: Maybe Int
  
instance Arbitrary DynamicTitlesUploadURL where
  arbitrary = sized genDynamicTitlesUploadURL

genDynamicTitlesUploadURL :: Int -> Gen DynamicTitlesUploadURL
genDynamicTitlesUploadURL n =
  DynamicTitlesUploadURL
    <$> arbitraryReducedMaybe n -- dynamicTitlesUploadURLExistingFilename :: Maybe Text
    <*> arbitrary -- dynamicTitlesUploadURLRequestId :: Text
    <*> arbitrary -- dynamicTitlesUploadURLUploadUrl :: Text
  
instance Arbitrary EntityDataChangeHistory where
  arbitrary = sized genEntityDataChangeHistory

genEntityDataChangeHistory :: Int -> Gen EntityDataChangeHistory
genEntityDataChangeHistory n =
  EntityDataChangeHistory
    <$> arbitraryReducedMaybe n -- entityDataChangeHistoryChangedFieldId :: Maybe Text
    <*> arbitraryReducedMaybe n -- entityDataChangeHistoryChangedFieldName :: Maybe Text
    <*> arbitraryReducedMaybe n -- entityDataChangeHistoryDataType :: Maybe ChangeHistoryDataType
    <*> arbitraryReducedMaybe n -- entityDataChangeHistoryNewDataValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- entityDataChangeHistoryOldDataValue :: Maybe Text
  
instance Arbitrary EntityHistory where
  arbitrary = sized genEntityHistory

genEntityHistory :: Int -> Gen EntityHistory
genEntityHistory n =
  EntityHistory
    <$> arbitraryReducedMaybe n -- entityHistoryChangeTimestamp :: Maybe Int
    <*> arbitraryReducedMaybe n -- entityHistoryDataChanges :: Maybe [EntityDataChangeHistory]
    <*> arbitraryReducedMaybe n -- entityHistoryEntityId :: Maybe Text
    <*> arbitraryReducedMaybe n -- entityHistoryEntityName :: Maybe Text
    <*> arbitraryReducedMaybe n -- entityHistoryLdap :: Maybe Text
    <*> arbitraryReducedMaybe n -- entityHistoryOperation :: Maybe ChangeHistoryOperationType
    <*> arbitraryReducedMaybe n -- entityHistoryUserId :: Maybe Text
  
instance Arbitrary EntityLabel where
  arbitrary = sized genEntityLabel

genEntityLabel :: Int -> Gen EntityLabel
genEntityLabel n =
  EntityLabel
    <$> arbitrary -- entityLabelEntityId :: Text
    <*> arbitraryReducedMaybe n -- entityLabelEntityType :: Maybe LabelParentType
    <*> arbitrary -- entityLabelLabelId :: Text
    <*> arbitraryReducedMaybe n -- entityLabelStatus :: Maybe EntityLabelStatus
  
instance Arbitrary EntityLabelError where
  arbitrary = sized genEntityLabelError

genEntityLabelError :: Int -> Gen EntityLabelError
genEntityLabelError n =
  EntityLabelError
    <$> arbitraryReducedMaybe n -- entityLabelErrorData :: Maybe EntityLabel
    <*> arbitraryReducedMaybe n -- entityLabelErrorErrorMessages :: Maybe [Text]
  
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
    <*> arbitrary -- exceptionMessage :: Text
  
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
  
instance Arbitrary FeedsList200Response where
  arbitrary = sized genFeedsList200Response

genFeedsList200Response :: Int -> Gen FeedsList200Response
genFeedsList200Response n =
  FeedsList200Response
    <$> arbitraryReducedMaybe n -- feedsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- feedsList200ResponseItems :: [CatalogsFeed]
  
instance Arbitrary FollowUser where
  arbitrary = sized genFollowUser

genFollowUser :: Int -> Gen FollowUser
genFollowUser n =
  FollowUser
    <$> arbitraryReducedMaybe n -- followUserType :: Maybe Text
    <*> arbitraryReducedMaybe n -- followUserUsername :: Maybe Text
  
instance Arbitrary FollowUserCreate where
  arbitrary = sized genFollowUserCreate

genFollowUserCreate :: Int -> Gen FollowUserCreate
genFollowUserCreate n =
  FollowUserCreate
    <$> arbitraryReducedMaybe n -- followUserCreateAutoFollow :: Maybe Bool
  
instance Arbitrary FollowersList200Response where
  arbitrary = sized genFollowersList200Response

genFollowersList200Response :: Int -> Gen FollowersList200Response
genFollowersList200Response n =
  FollowersList200Response
    <$> arbitraryReducedMaybe n -- followersList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- followersList200ResponseItems :: [FollowUser]
  
instance Arbitrary FrequencyGoalMetadata where
  arbitrary = sized genFrequencyGoalMetadata

genFrequencyGoalMetadata :: Int -> Gen FrequencyGoalMetadata
genFrequencyGoalMetadata n =
  FrequencyGoalMetadata
    <$> arbitraryReducedMaybe n -- frequencyGoalMetadataFrequency :: Maybe Int
    <*> arbitraryReducedMaybe n -- frequencyGoalMetadataTimerange :: Maybe FrequencyGoalMetadataTimerange
  
instance Arbitrary FrequencyMultipliers where
  arbitrary = sized genFrequencyMultipliers

genFrequencyMultipliers :: Int -> Gen FrequencyMultipliers
genFrequencyMultipliers n =
  FrequencyMultipliers
    <$> arbitraryReducedMaybe n -- frequencyMultipliersImpressionCount :: Maybe Text
  
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
  
instance Arbitrary GenderMultipliers where
  arbitrary = sized genGenderMultipliers

genGenderMultipliers :: Int -> Gen GenderMultipliers
genGenderMultipliers n =
  GenderMultipliers
    <$> arbitraryReducedMaybe n -- genderMultipliersGender :: Maybe TargetingSpecGender
  
instance Arbitrary GetBusinessEmployers200Response where
  arbitrary = sized genGetBusinessEmployers200Response

genGetBusinessEmployers200Response :: Int -> Gen GetBusinessEmployers200Response
genGetBusinessEmployers200Response n =
  GetBusinessEmployers200Response
    <$> arbitraryReducedMaybe n -- getBusinessEmployers200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- getBusinessEmployers200ResponseItems :: [UserBusinessRoleBinding]
  
instance Arbitrary GetInvites200Response where
  arbitrary = sized genGetInvites200Response

genGetInvites200Response :: Int -> Gen GetInvites200Response
genGetInvites200Response n =
  GetInvites200Response
    <$> arbitraryReducedMaybe n -- getInvites200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- getInvites200ResponseItems :: [InviteResponse]
  
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
    <*> arbitrary -- imageMetadataItemType :: E'ItemType
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
  
instance Arbitrary IneligibleProductTagErrorItem where
  arbitrary = sized genIneligibleProductTagErrorItem

genIneligibleProductTagErrorItem :: Int -> Gen IneligibleProductTagErrorItem
genIneligibleProductTagErrorItem n =
  IneligibleProductTagErrorItem
    <$> arbitraryReduced n -- ineligibleProductTagErrorItemErrorMessage :: IneligibleProductTagReason
    <*> arbitrary -- ineligibleProductTagErrorItemPinId :: Text
  
instance Arbitrary IneligibleProductTagsErrorDetails where
  arbitrary = sized genIneligibleProductTagsErrorDetails

genIneligibleProductTagsErrorDetails :: Int -> Gen IneligibleProductTagsErrorDetails
genIneligibleProductTagsErrorDetails n =
  IneligibleProductTagsErrorDetails
    <$> arbitraryReduced n -- ineligibleProductTagsErrorDetailsProductTags :: [IneligibleProductTagErrorItem]
  
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
    <*> arbitraryReduced n -- integrationLogEventType :: IntegrationLogEventType
    <*> arbitraryReducedMaybe n -- integrationLogExternalBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationLogFeedProfileId :: Maybe Text
    <*> arbitraryReduced n -- integrationLogLogLevel :: IntegrationLogLevel
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
    <*> arbitraryReduced n -- integrationLogClientRequestMethod :: HttpMethod
    <*> arbitrary -- integrationLogClientRequestPath :: Text
    <*> arbitraryReducedMaybe n -- integrationLogClientRequestRequestHeaders :: Maybe (Map.Map String Text)
    <*> arbitraryReducedMaybe n -- integrationLogClientRequestResponseHeaders :: Maybe (Map.Map String Text)
    <*> arbitraryReducedMaybe n -- integrationLogClientRequestResponseStatusCode :: Maybe Int
  
instance Arbitrary IntegrationLogsInvalidLogResponse where
  arbitrary = sized genIntegrationLogsInvalidLogResponse

genIntegrationLogsInvalidLogResponse :: Int -> Gen IntegrationLogsInvalidLogResponse
genIntegrationLogsInvalidLogResponse n =
  IntegrationLogsInvalidLogResponse
    <$> arbitraryReducedMaybe n -- integrationLogsInvalidLogResponseRejectedLogs :: Maybe [IntegrationLogsInvalidLogResponseRejectedLogsItems]
  
instance Arbitrary IntegrationLogsInvalidLogResponseRejectedLogsItems where
  arbitrary = sized genIntegrationLogsInvalidLogResponseRejectedLogsItems

genIntegrationLogsInvalidLogResponseRejectedLogsItems :: Int -> Gen IntegrationLogsInvalidLogResponseRejectedLogsItems
genIntegrationLogsInvalidLogResponseRejectedLogsItems n =
  IntegrationLogsInvalidLogResponseRejectedLogsItems
    <$> arbitrary -- integrationLogsInvalidLogResponseRejectedLogsItemsField :: Text
    <*> arbitraryReducedMaybe n -- integrationLogsInvalidLogResponseRejectedLogsItemsLogIndex :: Maybe Int
    <*> arbitrary -- integrationLogsInvalidLogResponseRejectedLogsItemsReason :: Text
    <*> arbitrary -- integrationLogsInvalidLogResponseRejectedLogsItemsValue :: Text
  
instance Arbitrary IntegrationLogsRequestCreate where
  arbitrary = sized genIntegrationLogsRequestCreate

genIntegrationLogsRequestCreate :: Int -> Gen IntegrationLogsRequestCreate
genIntegrationLogsRequestCreate n =
  IntegrationLogsRequestCreate
    <$> arbitraryReduced n -- integrationLogsRequestCreateLogs :: [IntegrationLog]
  
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
  
instance Arbitrary IntegrationMetadataCreate where
  arbitrary = sized genIntegrationMetadataCreate

genIntegrationMetadataCreate :: Int -> Gen IntegrationMetadataCreate
genIntegrationMetadataCreate n =
  IntegrationMetadataCreate
    <$> arbitraryReducedMaybe n -- integrationMetadataCreateAdditionalId1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreateConnectedAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreateConnectedLbaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreateConnectedMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreateConnectedTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreateExternalBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreatePartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreatePartnerAccessTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationMetadataCreatePartnerMetadata :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreatePartnerPrimaryEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreatePartnerRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataCreatePartnerRefreshTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationMetadataCreateScopes :: Maybe Text
  
instance Arbitrary IntegrationMetadataUpdate where
  arbitrary = sized genIntegrationMetadataUpdate

genIntegrationMetadataUpdate :: Int -> Gen IntegrationMetadataUpdate
genIntegrationMetadataUpdate n =
  IntegrationMetadataUpdate
    <$> arbitraryReducedMaybe n -- integrationMetadataUpdateAdditionalId1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdateConnectedAdvertiserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdateConnectedLbaId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdateConnectedMerchantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdateConnectedTagId :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdatePartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdatePartnerAccessTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdatePartnerMetadata :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdatePartnerPrimaryEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdatePartnerRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdatePartnerRefreshTokenExpiry :: Maybe Double
    <*> arbitraryReducedMaybe n -- integrationMetadataUpdateScopes :: Maybe Text
  
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
    <*> arbitrary -- integrationRecordId :: Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerAccessTokenExpiry :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerMetadata :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerPrimaryEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordPartnerRefreshTokenExpiry :: Maybe Int
    <*> arbitraryReducedMaybe n -- integrationRecordScopes :: Maybe Text
    <*> arbitraryReducedMaybe n -- integrationRecordUpdatedTime :: Maybe Int
  
instance Arbitrary IntegrationsGetList200Response where
  arbitrary = sized genIntegrationsGetList200Response

genIntegrationsGetList200Response :: Int -> Gen IntegrationsGetList200Response
genIntegrationsGetList200Response n =
  IntegrationsGetList200Response
    <$> arbitraryReducedMaybe n -- integrationsGetList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- integrationsGetList200ResponseItems :: [IntegrationRecord]
  
instance Arbitrary Interest where
  arbitrary = sized genInterest

genInterest :: Int -> Gen Interest
genInterest n =
  Interest
    <$> arbitraryReducedMaybe n -- interestCanonicalUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- interestId :: Maybe Text
    <*> arbitraryReducedMaybe n -- interestKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- interestName :: Maybe Text
  
instance Arbitrary InviteActionResultItem where
  arbitrary = sized genInviteActionResultItem

genInviteActionResultItem :: Int -> Gen InviteActionResultItem
genInviteActionResultItem n =
  InviteActionResultItem
    <$> arbitraryReducedMaybe n -- inviteActionResultItemException :: Maybe InviteExceptionResponse
    <*> arbitraryReducedMaybe n -- inviteActionResultItemInvite :: Maybe InviteBusinessRoleBinding
  
instance Arbitrary InviteAssetsSummary where
  arbitrary = sized genInviteAssetsSummary

genInviteAssetsSummary :: Int -> Gen InviteAssetsSummary
genInviteAssetsSummary n =
  InviteAssetsSummary
    <$> arbitraryReducedMaybe n -- inviteAssetsSummaryAdAccounts :: Maybe [InviteAssetsSummaryItem]
    <*> arbitraryReducedMaybe n -- inviteAssetsSummaryProfiles :: Maybe [InviteAssetsSummaryItem]
  
instance Arbitrary InviteAssetsSummaryItem where
  arbitrary = sized genInviteAssetsSummaryItem

genInviteAssetsSummaryItem :: Int -> Gen InviteAssetsSummaryItem
genInviteAssetsSummaryItem n =
  InviteAssetsSummaryItem
    <$> arbitraryReducedMaybe n -- inviteAssetsSummaryItemId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteAssetsSummaryItemPermissions :: Maybe [Text]
  
instance Arbitrary InviteBusinessRoleBinding where
  arbitrary = sized genInviteBusinessRoleBinding

genInviteBusinessRoleBinding :: Int -> Gen InviteBusinessRoleBinding
genInviteBusinessRoleBinding n =
  InviteBusinessRoleBinding
    <$> arbitraryReducedMaybe n -- inviteBusinessRoleBindingCreatedByBusinessId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingCreatedByUserId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingInviteData :: Maybe InviteDataResponse
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingIsReceivedInvite :: Maybe Bool
    <*> arbitraryReducedMaybe n -- inviteBusinessRoleBindingUser :: Maybe BusinessAccessUserSummary
  
instance Arbitrary InviteDataResponse where
  arbitrary = sized genInviteDataResponse

genInviteDataResponse :: Int -> Gen InviteDataResponse
genInviteDataResponse n =
  InviteDataResponse
    <$> arbitraryReducedMaybe n -- inviteDataResponseInviteExpiration :: Maybe Int
    <*> arbitraryReducedMaybe n -- inviteDataResponseInviteStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteDataResponseInviteType :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteDataResponseLastUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- inviteDataResponseSentAt :: Maybe Int
  
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
    <$> arbitraryReducedMaybe n -- inviteResponseAssetsSummary :: Maybe InviteAssetsSummary
    <*> arbitraryReducedMaybe n -- inviteResponseBusinessRoles :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- inviteResponseCreatedByBusiness :: Maybe BusinessAccessUserSummary
    <*> arbitraryReducedMaybe n -- inviteResponseCreatedByUser :: Maybe BusinessAccessUserSummary
    <*> arbitraryReducedMaybe n -- inviteResponseCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- inviteResponseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- inviteResponseInviteData :: Maybe InviteDataResponse
    <*> arbitraryReducedMaybe n -- inviteResponseIsReceivedInvite :: Maybe Bool
    <*> arbitraryReducedMaybe n -- inviteResponseUser :: Maybe BusinessAccessUserSummary
  
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
    <*> arbitraryReducedMaybe n -- itemAttributesAiDisclosures :: Maybe [CatalogsAiContentDisclosure]
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
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdditionalImageLink :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAdult :: Maybe Bool
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAgeGroup :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAttributesRequestAiDisclosures :: Maybe [CatalogsAiContentDisclosure]
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
    <*> arbitraryReducedMaybe n -- itemAttributesRequestImageLink :: Maybe ItemAttributesRequestImageLink
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
    <*> arbitraryReducedMaybe n -- itemAttributesRequestSavePinDisabled :: Maybe Bool
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
    <*> arbitraryReducedMaybe n -- itemAttributesRequestVideoLink :: Maybe Text
  
instance Arbitrary ItemAttributesRequestImageLink where
  arbitrary = sized genItemAttributesRequestImageLink

genItemAttributesRequestImageLink :: Int -> Gen ItemAttributesRequestImageLink
genItemAttributesRequestImageLink n =
  
  pure ItemAttributesRequestImageLink
   
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
  
instance Arbitrary ItemIdStoreCodePair where
  arbitrary = sized genItemIdStoreCodePair

genItemIdStoreCodePair :: Int -> Gen ItemIdStoreCodePair
genItemIdStoreCodePair n =
  ItemIdStoreCodePair
    <$> arbitrary -- itemIdStoreCodePairItemId :: Text
    <*> arbitrary -- itemIdStoreCodePairStoreCode :: Text
  
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
    <$> arbitraryReducedMaybe n -- itemResponseAttributes :: Maybe CatalogsCreativeAssetsAttributes
    <*> arbitrary -- itemResponseCatalogType :: E'CatalogType
    <*> arbitraryReducedMaybe n -- itemResponseItemId :: Maybe Text
    <*> arbitrary -- itemResponseItemResponseKind :: E'ItemResponseKind
    <*> arbitraryReducedMaybe n -- itemResponsePins :: Maybe [Pin]
    <*> arbitraryReducedMaybe n -- itemResponseHotelId :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemResponseCreativeAssetsId :: Maybe Text
    <*> arbitraryReduced n -- itemResponseErrors :: [ItemValidationEvent]
  
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
  
instance Arbitrary ItemsIssuesList200Response where
  arbitrary = sized genItemsIssuesList200Response

genItemsIssuesList200Response :: Int -> Gen ItemsIssuesList200Response
genItemsIssuesList200Response n =
  ItemsIssuesList200Response
    <$> arbitraryReducedMaybe n -- itemsIssuesList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- itemsIssuesList200ResponseItems :: [CatalogsItemValidationIssues]
  
instance Arbitrary ItemsPost200Response where
  arbitrary = sized genItemsPost200Response

genItemsPost200Response :: Int -> Gen ItemsPost200Response
genItemsPost200Response n =
  ItemsPost200Response
    <$> arbitraryReduced n -- itemsPost200ResponseItems :: [ItemResponse]
  
instance Arbitrary Keyword where
  arbitrary = sized genKeyword

genKeyword :: Int -> Gen Keyword
genKeyword n =
  Keyword
    <$> arbitraryReducedMaybe n -- keywordArchived :: Maybe Bool
    <*> arbitraryReducedMaybe n -- keywordBid :: Maybe Int
    <*> arbitrary -- keywordId :: Text
    <*> arbitraryReduced n -- keywordMatchType :: MatchType
    <*> arbitrary -- keywordParentId :: Text
    <*> arbitraryReducedMaybe n -- keywordParentType :: Maybe Text
    <*> arbitraryReducedMaybe n -- keywordType :: Maybe Text
    <*> arbitrary -- keywordValue :: Text
  
instance Arbitrary KeywordCreateItem where
  arbitrary = sized genKeywordCreateItem

genKeywordCreateItem :: Int -> Gen KeywordCreateItem
genKeywordCreateItem n =
  KeywordCreateItem
    <$> arbitraryReducedMaybe n -- keywordCreateItemBid :: Maybe Int
    <*> arbitraryReduced n -- keywordCreateItemMatchType :: MatchType
    <*> arbitrary -- keywordCreateItemValue :: Text
  
instance Arbitrary KeywordError where
  arbitrary = sized genKeywordError

genKeywordError :: Int -> Gen KeywordError
genKeywordError n =
  KeywordError
    <$> arbitraryReducedMaybe n -- keywordErrorData :: Maybe Keyword
    <*> arbitraryReducedMaybe n -- keywordErrorErrorMessages :: Maybe [Text]
  
instance Arbitrary KeywordInfo where
  arbitrary = sized genKeywordInfo

genKeywordInfo :: Int -> Gen KeywordInfo
genKeywordInfo n =
  KeywordInfo
    <$> arbitrary -- keywordInfoName :: Text
    <*> arbitraryReducedMaybe n -- keywordInfoPctGrowthMom :: Maybe Double
  
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
  
instance Arbitrary KeywordUpdateGenerated where
  arbitrary = sized genKeywordUpdateGenerated

genKeywordUpdateGenerated :: Int -> Gen KeywordUpdateGenerated
genKeywordUpdateGenerated n =
  KeywordUpdateGenerated
    <$> arbitraryReducedMaybe n -- keywordUpdateGeneratedArchived :: Maybe Bool
    <*> arbitraryReducedMaybe n -- keywordUpdateGeneratedBid :: Maybe Int
    <*> arbitrary -- keywordUpdateGeneratedId :: Text
  
instance Arbitrary KeywordUpdateItem where
  arbitrary = sized genKeywordUpdateItem

genKeywordUpdateItem :: Int -> Gen KeywordUpdateItem
genKeywordUpdateItem n =
  KeywordUpdateItem
    <$> arbitraryReducedMaybe n -- keywordUpdateItemArchived :: Maybe Bool
    <*> arbitraryReducedMaybe n -- keywordUpdateItemBid :: Maybe Int
    <*> arbitrary -- keywordUpdateItemId :: Text
  
instance Arbitrary Keywords where
  arbitrary = sized genKeywords

genKeywords :: Int -> Gen Keywords
genKeywords n =
  Keywords
    <$> arbitraryReduced n -- keywordsErrors :: [KeywordError]
    <*> arbitraryReduced n -- keywordsKeywords :: [Keyword]
  
instance Arbitrary KeywordsCommon where
  arbitrary = sized genKeywordsCommon

genKeywordsCommon :: Int -> Gen KeywordsCommon
genKeywordsCommon n =
  KeywordsCommon
    <$> arbitraryReducedMaybe n -- keywordsCommonBid :: Maybe Int
    <*> arbitraryReduced n -- keywordsCommonMatchType :: MatchTypeResponse
    <*> arbitrary -- keywordsCommonValue :: Text
  
instance Arbitrary KeywordsCreate where
  arbitrary = sized genKeywordsCreate

genKeywordsCreate :: Int -> Gen KeywordsCreate
genKeywordsCreate n =
  KeywordsCreate
    <$> arbitraryReduced n -- keywordsCreateKeywords :: [KeywordCreateItem]
    <*> arbitrary -- keywordsCreateParentId :: Text
  
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
  
instance Arbitrary KeywordsUpdate where
  arbitrary = sized genKeywordsUpdate

genKeywordsUpdate :: Int -> Gen KeywordsUpdate
genKeywordsUpdate n =
  KeywordsUpdate
    <$> arbitraryReducedMaybe n -- keywordsUpdateKeywords :: Maybe [KeywordUpdateItem]
  
instance Arbitrary Label where
  arbitrary = sized genLabel

genLabel :: Int -> Gen Label
genLabel n =
  Label
    <$> arbitrary -- labelId :: Text
    <*> arbitraryReduced n -- labelLabelType :: NullableLabelType
    <*> arbitraryReducedMaybe n -- labelStatus :: Maybe NullableLabelStatus
    <*> arbitrary -- labelValue :: Text
  
instance Arbitrary LabelBulkCreateRequest where
  arbitrary = sized genLabelBulkCreateRequest

genLabelBulkCreateRequest :: Int -> Gen LabelBulkCreateRequest
genLabelBulkCreateRequest n =
  LabelBulkCreateRequest
    <$> arbitraryReduced n -- labelBulkCreateRequestLabels :: [LabelCreateItem]
    <*> arbitrary -- labelBulkCreateRequestParentId :: Text
  
instance Arbitrary LabelBulkUpdateRequest where
  arbitrary = sized genLabelBulkUpdateRequest

genLabelBulkUpdateRequest :: Int -> Gen LabelBulkUpdateRequest
genLabelBulkUpdateRequest n =
  LabelBulkUpdateRequest
    <$> arbitrary -- labelBulkUpdateRequestId :: Text
    <*> arbitrary -- labelBulkUpdateRequestParentId :: Text
    <*> arbitraryReduced n -- labelBulkUpdateRequestStatus :: LabelStatusBulkUpdate
  
instance Arbitrary LabelCreateItem where
  arbitrary = sized genLabelCreateItem

genLabelCreateItem :: Int -> Gen LabelCreateItem
genLabelCreateItem n =
  LabelCreateItem
    <$> arbitraryReduced n -- labelCreateItemLabelType :: LabelType
    <*> arbitrary -- labelCreateItemValue :: Text
  
instance Arbitrary LabelCreateRequest where
  arbitrary = sized genLabelCreateRequest

genLabelCreateRequest :: Int -> Gen LabelCreateRequest
genLabelCreateRequest n =
  LabelCreateRequest
    <$> arbitraryReduced n -- labelCreateRequestLabels :: [LabelCreateItem]
  
instance Arbitrary LabelError where
  arbitrary = sized genLabelError

genLabelError :: Int -> Gen LabelError
genLabelError n =
  LabelError
    <$> arbitraryReducedMaybe n -- labelErrorData :: Maybe LabelErrorData
    <*> arbitraryReducedMaybe n -- labelErrorErrorMessages :: Maybe [Text]
  
instance Arbitrary LabelErrorData where
  arbitrary = sized genLabelErrorData

genLabelErrorData :: Int -> Gen LabelErrorData
genLabelErrorData n =
  LabelErrorData
    <$> arbitraryReducedMaybe n -- labelErrorDataId :: Maybe Text
    <*> arbitraryReducedMaybe n -- labelErrorDataLabelType :: Maybe NullableLabelType
    <*> arbitraryReducedMaybe n -- labelErrorDataStatus :: Maybe NullableLabelStatus
    <*> arbitraryReducedMaybe n -- labelErrorDataValue :: Maybe Text
  
instance Arbitrary LabelUpdateItem where
  arbitrary = sized genLabelUpdateItem

genLabelUpdateItem :: Int -> Gen LabelUpdateItem
genLabelUpdateItem n =
  LabelUpdateItem
    <$> arbitrary -- labelUpdateItemId :: Text
    <*> arbitraryReducedMaybe n -- labelUpdateItemStatus :: Maybe LabelStatus
    <*> arbitraryReducedMaybe n -- labelUpdateItemValue :: Maybe Text
  
instance Arbitrary LabelUpdateRequest where
  arbitrary = sized genLabelUpdateRequest

genLabelUpdateRequest :: Int -> Gen LabelUpdateRequest
genLabelUpdateRequest n =
  LabelUpdateRequest
    <$> arbitraryReduced n -- labelUpdateRequestLabels :: [LabelUpdateItem]
  
instance Arbitrary LabeledEntities where
  arbitrary = sized genLabeledEntities

genLabeledEntities :: Int -> Gen LabeledEntities
genLabeledEntities n =
  LabeledEntities
    <$> arbitraryReducedMaybe n -- labeledEntitiesEntitiesLabels :: Maybe [EntityLabel]
    <*> arbitraryReducedMaybe n -- labeledEntitiesErrors :: Maybe [EntityLabelError]
  
instance Arbitrary LabeledEntitiesCreate where
  arbitrary = sized genLabeledEntitiesCreate

genLabeledEntitiesCreate :: Int -> Gen LabeledEntitiesCreate
genLabeledEntitiesCreate n =
  LabeledEntitiesCreate
    <$> arbitrary -- labeledEntitiesCreateEntityIds :: [Text]
  
instance Arbitrary LabelsList200Response where
  arbitrary = sized genLabelsList200Response

genLabelsList200Response :: Int -> Gen LabelsList200Response
genLabelsList200Response n =
  LabelsList200Response
    <$> arbitraryReducedMaybe n -- labelsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- labelsList200ResponseItems :: [Label]
  
instance Arbitrary LabelsResponse where
  arbitrary = sized genLabelsResponse

genLabelsResponse :: Int -> Gen LabelsResponse
genLabelsResponse n =
  LabelsResponse
    <$> arbitraryReducedMaybe n -- labelsResponseErrors :: Maybe [LabelError]
    <*> arbitraryReducedMaybe n -- labelsResponseLabels :: Maybe [Label]
  
instance Arbitrary LeadForm where
  arbitrary = sized genLeadForm

genLeadForm :: Int -> Gen LeadForm
genLeadForm n =
  LeadForm
    <$> arbitraryReducedMaybe n -- leadFormAdAccountId :: Maybe Text
    <*> arbitrary -- leadFormCompletionMessage :: Text
    <*> arbitraryReducedMaybe n -- leadFormCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- leadFormDisclosureLanguage :: Maybe Text
    <*> arbitrary -- leadFormHasAcceptedTerms :: Bool
    <*> arbitrary -- leadFormId :: Text
    <*> arbitrary -- leadFormName :: Text
    <*> arbitraryReducedMaybe n -- leadFormPolicyLinks :: Maybe [LeadFormPolicyLink]
    <*> arbitrary -- leadFormPrivacyPolicyLink :: Text
    <*> arbitraryReduced n -- leadFormQuestions :: [LeadFormQuestion]
    <*> arbitraryReducedMaybe n -- leadFormStatus :: Maybe LeadFormStatus
    <*> arbitraryReducedMaybe n -- leadFormUpdatedTime :: Maybe Int
  
instance Arbitrary LeadFormBatchUpdate where
  arbitrary = sized genLeadFormBatchUpdate

genLeadFormBatchUpdate :: Int -> Gen LeadFormBatchUpdate
genLeadFormBatchUpdate n =
  LeadFormBatchUpdate
    <$> arbitraryReducedMaybe n -- leadFormBatchUpdateCompletionMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormBatchUpdateDisclosureLanguage :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormBatchUpdateHasAcceptedTerms :: Maybe Bool
    <*> arbitrary -- leadFormBatchUpdateId :: Text
    <*> arbitraryReducedMaybe n -- leadFormBatchUpdateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormBatchUpdatePolicyLinks :: Maybe [LeadFormPolicyLink]
    <*> arbitraryReducedMaybe n -- leadFormBatchUpdatePrivacyPolicyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormBatchUpdateQuestions :: Maybe [LeadFormQuestion]
    <*> arbitraryReducedMaybe n -- leadFormBatchUpdateStatus :: Maybe LeadFormStatus
  
instance Arbitrary LeadFormCreate where
  arbitrary = sized genLeadFormCreate

genLeadFormCreate :: Int -> Gen LeadFormCreate
genLeadFormCreate n =
  LeadFormCreate
    <$> arbitrary -- leadFormCreateCompletionMessage :: Text
    <*> arbitraryReducedMaybe n -- leadFormCreateDisclosureLanguage :: Maybe Text
    <*> arbitrary -- leadFormCreateHasAcceptedTerms :: Bool
    <*> arbitrary -- leadFormCreateName :: Text
    <*> arbitraryReducedMaybe n -- leadFormCreatePolicyLinks :: Maybe [LeadFormPolicyLink]
    <*> arbitrary -- leadFormCreatePrivacyPolicyLink :: Text
    <*> arbitraryReduced n -- leadFormCreateQuestions :: [LeadFormQuestion]
    <*> arbitraryReducedMaybe n -- leadFormCreateStatus :: Maybe LeadFormStatus
  
instance Arbitrary LeadFormPolicyLink where
  arbitrary = sized genLeadFormPolicyLink

genLeadFormPolicyLink :: Int -> Gen LeadFormPolicyLink
genLeadFormPolicyLink n =
  LeadFormPolicyLink
    <$> arbitraryReducedMaybe n -- leadFormPolicyLinkLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormPolicyLinkLink :: Maybe Text
  
instance Arbitrary LeadFormQuestion where
  arbitrary = sized genLeadFormQuestion

genLeadFormQuestion :: Int -> Gen LeadFormQuestion
genLeadFormQuestion n =
  LeadFormQuestion
    <$> arbitraryReducedMaybe n -- leadFormQuestionCustomQuestionFieldType :: Maybe LeadFormQuestionFieldType
    <*> arbitraryReducedMaybe n -- leadFormQuestionCustomQuestionLabel :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadFormQuestionCustomQuestionOptions :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- leadFormQuestionQuestionType :: Maybe LeadFormQuestionType
  
instance Arbitrary LeadFormTest where
  arbitrary = sized genLeadFormTest

genLeadFormTest :: Int -> Gen LeadFormTest
genLeadFormTest n =
  LeadFormTest
    <$> arbitraryReducedMaybe n -- leadFormTestSubscriptionId :: Maybe Text
  
instance Arbitrary LeadFormTestCreate where
  arbitrary = sized genLeadFormTestCreate

genLeadFormTestCreate :: Int -> Gen LeadFormTestCreate
genLeadFormTestCreate n =
  LeadFormTestCreate
    <$> arbitrary -- leadFormTestCreateAnswers :: [Text]
  
instance Arbitrary LeadFormsCreate200Response where
  arbitrary = sized genLeadFormsCreate200Response

genLeadFormsCreate200Response :: Int -> Gen LeadFormsCreate200Response
genLeadFormsCreate200Response n =
  LeadFormsCreate200Response
    <$> arbitraryReduced n -- leadFormsCreate200ResponseItems :: [LeadFormsCreate200ResponseItemsInner]
  
instance Arbitrary LeadFormsCreate200ResponseItemsInner where
  arbitrary = sized genLeadFormsCreate200ResponseItemsInner

genLeadFormsCreate200ResponseItemsInner :: Int -> Gen LeadFormsCreate200ResponseItemsInner
genLeadFormsCreate200ResponseItemsInner n =
  LeadFormsCreate200ResponseItemsInner
    <$> arbitraryReducedMaybe n -- leadFormsCreate200ResponseItemsInnerData :: Maybe LeadForm
    <*> arbitraryReducedMaybe n -- leadFormsCreate200ResponseItemsInnerExceptions :: Maybe [PinterestLibBatchItemException]
  
instance Arbitrary LeadFormsList200Response where
  arbitrary = sized genLeadFormsList200Response

genLeadFormsList200Response :: Int -> Gen LeadFormsList200Response
genLeadFormsList200Response n =
  LeadFormsList200Response
    <$> arbitraryReducedMaybe n -- leadFormsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- leadFormsList200ResponseItems :: [LeadForm]
  
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
  
instance Arbitrary LeadSubscriptionCreate where
  arbitrary = sized genLeadSubscriptionCreate

genLeadSubscriptionCreate :: Int -> Gen LeadSubscriptionCreate
genLeadSubscriptionCreate n =
  LeadSubscriptionCreate
    <$> arbitraryReducedMaybe n -- leadSubscriptionCreateLeadFormId :: Maybe Text
    <*> arbitrary -- leadSubscriptionCreateWebhookUrl :: Text
  
instance Arbitrary LeadSubscriptionPostParams where
  arbitrary = sized genLeadSubscriptionPostParams

genLeadSubscriptionPostParams :: Int -> Gen LeadSubscriptionPostParams
genLeadSubscriptionPostParams n =
  LeadSubscriptionPostParams
    <$> arbitraryReducedMaybe n -- leadSubscriptionPostParamsAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsApiVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCryptographicAlgorithm :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCryptographicKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsId :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsLeadFormId :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsUserAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsWebhookUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsPartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsPartnerMetadata :: Maybe PartnerMetadata
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsPartnerRefreshToken :: Maybe Text
  
instance Arbitrary LeadSubscriptionPostParamsCreate where
  arbitrary = sized genLeadSubscriptionPostParamsCreate

genLeadSubscriptionPostParamsCreate :: Int -> Gen LeadSubscriptionPostParamsCreate
genLeadSubscriptionPostParamsCreate n =
  LeadSubscriptionPostParamsCreate
    <$> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCreateLeadFormId :: Maybe Text
    <*> arbitrary -- leadSubscriptionPostParamsCreateWebhookUrl :: Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCreatePartnerAccessToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCreatePartnerMetadata :: Maybe PartnerMetadata
    <*> arbitraryReducedMaybe n -- leadSubscriptionPostParamsCreatePartnerRefreshToken :: Maybe Text
  
instance Arbitrary LeadsExportResponseData where
  arbitrary = sized genLeadsExportResponseData

genLeadsExportResponseData :: Int -> Gen LeadsExportResponseData
genLeadsExportResponseData n =
  LeadsExportResponseData
    <$> arbitraryReducedMaybe n -- leadsExportResponseDataDownloadUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- leadsExportResponseDataExportStatus :: Maybe LeadsExportStatus
  
instance Arbitrary LeadsExports where
  arbitrary = sized genLeadsExports

genLeadsExports :: Int -> Gen LeadsExports
genLeadsExports n =
  LeadsExports
    <$> arbitraryReducedMaybe n -- leadsExportsLeadsExportId :: Maybe Text
  
instance Arbitrary LeadsExportsCreate where
  arbitrary = sized genLeadsExportsCreate

genLeadsExportsCreate :: Int -> Gen LeadsExportsCreate
genLeadsExportsCreate n =
  LeadsExportsCreate
    <$> arbitrary -- leadsExportsCreateAdId :: Text
    <*> arbitrary -- leadsExportsCreateEndDate :: Text
    <*> arbitrary -- leadsExportsCreateStartDate :: Text
  
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
  
instance Arbitrary LinkFilter where
  arbitrary = sized genLinkFilter

genLinkFilter :: Int -> Gen LinkFilter
genLinkFilter n =
  LinkFilter
    <$> arbitraryReduced n -- linkFilterLink :: CatalogsProductGroupFilterOperatorTypeCriteria
  
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
  
instance Arbitrary LocalInventoryCreateOperation where
  arbitrary = sized genLocalInventoryCreateOperation

genLocalInventoryCreateOperation :: Int -> Gen LocalInventoryCreateOperation
genLocalInventoryCreateOperation n =
  LocalInventoryCreateOperation
    <$> arbitraryReduced n -- localInventoryCreateOperationAttributes :: RetailLocalInventoryItemAttributes
    <*> arbitrary -- localInventoryCreateOperationItemId :: Text
    <*> arbitrary -- localInventoryCreateOperationOperation :: E'Operation3
    <*> arbitrary -- localInventoryCreateOperationStoreCode :: Text
  
instance Arbitrary LocalInventoryDeleteOperation where
  arbitrary = sized genLocalInventoryDeleteOperation

genLocalInventoryDeleteOperation :: Int -> Gen LocalInventoryDeleteOperation
genLocalInventoryDeleteOperation n =
  LocalInventoryDeleteOperation
    <$> arbitrary -- localInventoryDeleteOperationItemId :: Text
    <*> arbitrary -- localInventoryDeleteOperationOperation :: E'Operation
    <*> arbitrary -- localInventoryDeleteOperationStoreCode :: Text
  
instance Arbitrary LocalInventoryItemResponse where
  arbitrary = sized genLocalInventoryItemResponse

genLocalInventoryItemResponse :: Int -> Gen LocalInventoryItemResponse
genLocalInventoryItemResponse n =
  LocalInventoryItemResponse
    <$> arbitraryReducedMaybe n -- localInventoryItemResponseAdLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- localInventoryItemResponseAvailability :: Maybe ItemAvailability
    <*> arbitrary -- localInventoryItemResponseCreatedAt :: Integer
    <*> arbitrary -- localInventoryItemResponseItemId :: Text
    <*> arbitrary -- localInventoryItemResponseLastUpdatedTime :: Integer
    <*> arbitraryReducedMaybe n -- localInventoryItemResponsePrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- localInventoryItemResponseSalePrice :: Maybe Text
    <*> arbitraryReduced n -- localInventoryItemResponseStoreMetadata :: StoreMetadata
  
instance Arbitrary LocalInventoryItemsBatch where
  arbitrary = sized genLocalInventoryItemsBatch

genLocalInventoryItemsBatch :: Int -> Gen LocalInventoryItemsBatch
genLocalInventoryItemsBatch n =
  LocalInventoryItemsBatch
    <$> arbitrary -- localInventoryItemsBatchBatchId :: Text
    <*> arbitraryReducedMaybe n -- localInventoryItemsBatchCompletedTime :: Maybe DateTime
    <*> arbitraryReduced n -- localInventoryItemsBatchCreatedTime :: DateTime
    <*> arbitraryReduced n -- localInventoryItemsBatchOperationResults :: [SupplementalOperationResult]
    <*> arbitraryReduced n -- localInventoryItemsBatchStatus :: SupplementalItemBatchOperationStatus
  
instance Arbitrary LocalInventoryItemsBatchCreate where
  arbitrary = sized genLocalInventoryItemsBatchCreate

genLocalInventoryItemsBatchCreate :: Int -> Gen LocalInventoryItemsBatchCreate
genLocalInventoryItemsBatchCreate n =
  LocalInventoryItemsBatchCreate
    <$> arbitraryReduced n -- localInventoryItemsBatchCreateOperations :: [LocalInventoryOperation]
  
instance Arbitrary LocalInventoryItemsGet where
  arbitrary = sized genLocalInventoryItemsGet

genLocalInventoryItemsGet :: Int -> Gen LocalInventoryItemsGet
genLocalInventoryItemsGet n =
  LocalInventoryItemsGet
    <$> arbitraryReduced n -- localInventoryItemsGetItems :: [LocalInventoryItemResponse]
  
instance Arbitrary LocalInventoryItemsGetCreate where
  arbitrary = sized genLocalInventoryItemsGetCreate

genLocalInventoryItemsGetCreate :: Int -> Gen LocalInventoryItemsGetCreate
genLocalInventoryItemsGetCreate n =
  LocalInventoryItemsGetCreate
    <$> arbitraryReduced n -- localInventoryItemsGetCreateItemFilters :: [ItemIdStoreCodePair]
  
instance Arbitrary LocalInventoryOperation where
  arbitrary = sized genLocalInventoryOperation

genLocalInventoryOperation :: Int -> Gen LocalInventoryOperation
genLocalInventoryOperation n =
  LocalInventoryOperation
    <$> arbitraryReduced n -- localInventoryOperationAttributes :: RetailLocalInventoryItemAttributes
    <*> arbitrary -- localInventoryOperationItemId :: Text
    <*> arbitrary -- localInventoryOperationOperation :: E'Operation
    <*> arbitrary -- localInventoryOperationStoreCode :: Text
  
instance Arbitrary LocalInventoryOperationResult where
  arbitrary = sized genLocalInventoryOperationResult

genLocalInventoryOperationResult :: Int -> Gen LocalInventoryOperationResult
genLocalInventoryOperationResult n =
  LocalInventoryOperationResult
    <$> arbitraryReducedMaybe n -- localInventoryOperationResultErrors :: Maybe [SupplementalItemValidationEvent]
    <*> arbitrary -- localInventoryOperationResultItemId :: Text
    <*> arbitraryReduced n -- localInventoryOperationResultStatus :: SupplementalItemProcessingStatus
    <*> arbitrary -- localInventoryOperationResultStoreCode :: Text
    <*> arbitrary -- localInventoryOperationResultSupplementalType :: E'SupplementalType
    <*> arbitraryReducedMaybe n -- localInventoryOperationResultWarnings :: Maybe [SupplementalItemValidationEvent]
  
instance Arbitrary LocalInventoryUpdateOperation where
  arbitrary = sized genLocalInventoryUpdateOperation

genLocalInventoryUpdateOperation :: Int -> Gen LocalInventoryUpdateOperation
genLocalInventoryUpdateOperation n =
  LocalInventoryUpdateOperation
    <$> arbitraryReduced n -- localInventoryUpdateOperationAttributes :: RetailLocalInventoryItemAttributesOptional
    <*> arbitrary -- localInventoryUpdateOperationItemId :: Text
    <*> arbitrary -- localInventoryUpdateOperationOperation :: E'Operation5
    <*> arbitrary -- localInventoryUpdateOperationStoreCode :: Text
  
instance Arbitrary LocalInventoryUpsertOperation where
  arbitrary = sized genLocalInventoryUpsertOperation

genLocalInventoryUpsertOperation :: Int -> Gen LocalInventoryUpsertOperation
genLocalInventoryUpsertOperation n =
  LocalInventoryUpsertOperation
    <$> arbitraryReduced n -- localInventoryUpsertOperationAttributes :: RetailLocalInventoryItemAttributes
    <*> arbitrary -- localInventoryUpsertOperationItemId :: Text
    <*> arbitrary -- localInventoryUpsertOperationOperation :: E'Operation2
    <*> arbitrary -- localInventoryUpsertOperationStoreCode :: Text
  
instance Arbitrary LocalStore where
  arbitrary = sized genLocalStore

genLocalStore :: Int -> Gen LocalStore
genLocalStore n =
  LocalStore
    <$> arbitraryReducedMaybe n -- localStoreAddressPrimary :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreAddressSecondary :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreCity :: Maybe Text
    <*> arbitraryReduced n -- localStoreCountry :: Country
    <*> arbitraryReduced n -- localStoreCreatedAt :: DateTime
    <*> arbitrary -- localStoreId :: Text
    <*> arbitraryReducedMaybe n -- localStoreLatitude :: Maybe Float
    <*> arbitraryReducedMaybe n -- localStoreLongitude :: Maybe Float
    <*> arbitrary -- localStoreName :: Text
    <*> arbitraryReducedMaybe n -- localStorePostalCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreRegion :: Maybe Text
    <*> arbitrary -- localStoreStoreCode :: Text
    <*> arbitraryReduced n -- localStoreUpdatedAt :: DateTime
  
instance Arbitrary LocalStoreBatchUpdate where
  arbitrary = sized genLocalStoreBatchUpdate

genLocalStoreBatchUpdate :: Int -> Gen LocalStoreBatchUpdate
genLocalStoreBatchUpdate n =
  LocalStoreBatchUpdate
    <$> arbitraryReducedMaybe n -- localStoreBatchUpdateAddressPrimary :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreBatchUpdateAddressSecondary :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreBatchUpdateCity :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreBatchUpdateCountry :: Maybe Country
    <*> arbitrary -- localStoreBatchUpdateId :: Text
    <*> arbitraryReducedMaybe n -- localStoreBatchUpdateLatitude :: Maybe Float
    <*> arbitraryReducedMaybe n -- localStoreBatchUpdateLongitude :: Maybe Float
    <*> arbitraryReducedMaybe n -- localStoreBatchUpdateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreBatchUpdatePostalCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreBatchUpdateRegion :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreBatchUpdateStoreCode :: Maybe Text
  
instance Arbitrary LocalStoreCreate where
  arbitrary = sized genLocalStoreCreate

genLocalStoreCreate :: Int -> Gen LocalStoreCreate
genLocalStoreCreate n =
  LocalStoreCreate
    <$> arbitraryReducedMaybe n -- localStoreCreateAddressPrimary :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreCreateAddressSecondary :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreCreateCity :: Maybe Text
    <*> arbitraryReduced n -- localStoreCreateCountry :: Country
    <*> arbitraryReducedMaybe n -- localStoreCreateLatitude :: Maybe Float
    <*> arbitraryReducedMaybe n -- localStoreCreateLongitude :: Maybe Float
    <*> arbitrary -- localStoreCreateName :: Text
    <*> arbitraryReducedMaybe n -- localStoreCreatePostalCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- localStoreCreateRegion :: Maybe Text
    <*> arbitrary -- localStoreCreateStoreCode :: Text
  
instance Arbitrary MMMReport where
  arbitrary = sized genMMMReport

genMMMReport :: Int -> Gen MMMReport
genMMMReport n =
  MMMReport
    <$> arbitraryReducedMaybe n -- mMMReportMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- mMMReportReportStatus :: Maybe BulkReportingJobStatus
    <*> arbitraryReducedMaybe n -- mMMReportSize :: Maybe Double
    <*> arbitraryReducedMaybe n -- mMMReportStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- mMMReportToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- mMMReportUrl :: Maybe Text
  
instance Arbitrary MMMReportCreate where
  arbitrary = sized genMMMReportCreate

genMMMReportCreate :: Int -> Gen MMMReportCreate
genMMMReportCreate n =
  MMMReportCreate
    <$> arbitraryReducedMaybe n -- mMMReportCreateAdvertiserIds :: Maybe [Text]
    <*> arbitraryReduced n -- mMMReportCreateColumns :: [MMMReportingColumn]
    <*> arbitraryReducedMaybe n -- mMMReportCreateCountries :: Maybe [TargetingAdvertiserCountry]
    <*> arbitraryReducedMaybe n -- mMMReportCreateCustomColumnIds :: Maybe [Text]
    <*> arbitrary -- mMMReportCreateEndDate :: Text
    <*> arbitraryReduced n -- mMMReportCreateGranularity :: MMMReportGranularity
    <*> arbitraryReduced n -- mMMReportCreateLevel :: MMMReportLevel
    <*> arbitrary -- mMMReportCreateReportName :: Text
    <*> arbitrary -- mMMReportCreateStartDate :: Text
    <*> arbitraryReduced n -- mMMReportCreateTargetingTypes :: [MMMReportingTargetingType]
  
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
  
instance Arbitrary MetricsResponse where
  arbitrary = sized genMetricsResponse

genMetricsResponse :: Int -> Gen MetricsResponse
genMetricsResponse n =
  MetricsResponse
    <$> arbitraryReducedMaybe n -- metricsResponseData :: Maybe [MetricsResponseDataItems]
  
instance Arbitrary MetricsResponseDataItems where
  arbitrary = sized genMetricsResponseDataItems

genMetricsResponseDataItems :: Int -> Gen MetricsResponseDataItems
genMetricsResponseDataItems n =
  MetricsResponseDataItems
    <$> arbitraryReduced n -- metricsResponseDataItemsMetrics :: A.Value
    <*> arbitrary -- metricsResponseDataItemsTargetingType :: Text
    <*> arbitrary -- metricsResponseDataItemsTargetingValue :: Text
  
instance Arbitrary MinPriceFilter where
  arbitrary = sized genMinPriceFilter

genMinPriceFilter :: Int -> Gen MinPriceFilter
genMinPriceFilter n =
  MinPriceFilter
    <$> arbitraryReduced n -- minPriceFilterMinPrice :: CatalogsProductGroupPricingCriteria
  
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
    <$> arbitraryReducedMaybe n -- notificationResponseErrorMsg :: Maybe Text
    <*> arbitraryReducedMaybe n -- notificationResponseReceivedAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- notificationResponseSuccess :: Maybe Bool
  
instance Arbitrary NullableOptimizationGoalMetadata where
  arbitrary = sized genNullableOptimizationGoalMetadata

genNullableOptimizationGoalMetadata :: Int -> Gen NullableOptimizationGoalMetadata
genNullableOptimizationGoalMetadata n =
  NullableOptimizationGoalMetadata
    <$> arbitraryReducedMaybe n -- nullableOptimizationGoalMetadataConversionTagV3GoalMetadata :: Maybe ConversionTagV3GoalMetadata
    <*> arbitraryReducedMaybe n -- nullableOptimizationGoalMetadataFrequencyGoalMetadata :: Maybe FrequencyGoalMetadata
    <*> arbitraryReducedMaybe n -- nullableOptimizationGoalMetadataScrollupGoalMetadata :: Maybe ScrollupGoalMetadata
  
instance Arbitrary OauthAccessToken where
  arbitrary = sized genOauthAccessToken

genOauthAccessToken :: Int -> Gen OauthAccessToken
genOauthAccessToken n =
  OauthAccessToken
    <$> arbitrary -- oauthAccessTokenAccessToken :: Text
    <*> arbitrary -- oauthAccessTokenExpiresIn :: Int
    <*> arbitraryReducedMaybe n -- oauthAccessTokenRefreshToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- oauthAccessTokenRefreshTokenExpiresAt :: Maybe Int
    <*> arbitraryReducedMaybe n -- oauthAccessTokenRefreshTokenExpiresIn :: Maybe Int
    <*> arbitraryReducedMaybe n -- oauthAccessTokenResponseType :: Maybe TokenGrantType
    <*> arbitraryReducedMaybe n -- oauthAccessTokenScope :: Maybe Text
    <*> arbitrary -- oauthAccessTokenTokenType :: Text
  
instance Arbitrary OptimizationGoalMetadata where
  arbitrary = sized genOptimizationGoalMetadata

genOptimizationGoalMetadata :: Int -> Gen OptimizationGoalMetadata
genOptimizationGoalMetadata n =
  OptimizationGoalMetadata
    <$> arbitraryReducedMaybe n -- optimizationGoalMetadataConversionTagV3GoalMetadata :: Maybe ConversionTagV3GoalMetadata
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataFrequencyGoalMetadata :: Maybe FrequencyGoalMetadata
    <*> arbitraryReducedMaybe n -- optimizationGoalMetadataScrollupGoalMetadata :: Maybe ScrollupGoalMetadata
  
instance Arbitrary OrderLine where
  arbitrary = sized genOrderLine

genOrderLine :: Int -> Gen OrderLine
genOrderLine n =
  OrderLine
    <$> arbitrary -- orderLineAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- orderLineBudget :: Maybe Double
    <*> arbitrary -- orderLineCampaignIds :: [Text]
    <*> arbitraryReducedMaybe n -- orderLineEndTime :: Maybe Double
    <*> arbitrary -- orderLineId :: Text
    <*> arbitraryReducedMaybe n -- orderLineName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLinePaidBudget :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderLinePaidType :: Maybe OrderLinePaidType
    <*> arbitraryReducedMaybe n -- orderLinePurchaseOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderLineStartTime :: Maybe Double
    <*> arbitraryReduced n -- orderLineStatus :: OrderLineStatus
    <*> arbitrary -- orderLineType :: Text
  
instance Arbitrary OrderLineMutationError where
  arbitrary = sized genOrderLineMutationError

genOrderLineMutationError :: Int -> Gen OrderLineMutationError
genOrderLineMutationError n =
  OrderLineMutationError
    <$> arbitraryReducedMaybe n -- orderLineMutationErrorData :: Maybe OrderLine
    <*> arbitraryReducedMaybe n -- orderLineMutationErrorErrorMessages :: Maybe [Text]
  
instance Arbitrary OrderLineMutationResponse where
  arbitrary = sized genOrderLineMutationResponse

genOrderLineMutationResponse :: Int -> Gen OrderLineMutationResponse
genOrderLineMutationResponse n =
  OrderLineMutationResponse
    <$> arbitraryReducedMaybe n -- orderLineMutationResponseData :: Maybe OrderLineMutationResult
  
instance Arbitrary OrderLineMutationResult where
  arbitrary = sized genOrderLineMutationResult

genOrderLineMutationResult :: Int -> Gen OrderLineMutationResult
genOrderLineMutationResult n =
  OrderLineMutationResult
    <$> arbitraryReducedMaybe n -- orderLineMutationResultErrors :: Maybe [OrderLineMutationError]
    <*> arbitraryReducedMaybe n -- orderLineMutationResultOrderLine :: Maybe [OrderLine]
  
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
  
instance Arbitrary PartnerMetadata where
  arbitrary = sized genPartnerMetadata

genPartnerMetadata :: Int -> Gen PartnerMetadata
genPartnerMetadata n =
  PartnerMetadata
    <$> arbitraryReducedMaybe n -- partnerMetadataSubscriberKey :: Maybe Text
  
instance Arbitrary PerformancePlusCampaignSettings where
  arbitrary = sized genPerformancePlusCampaignSettings

genPerformancePlusCampaignSettings :: Int -> Gen PerformancePlusCampaignSettings
genPerformancePlusCampaignSettings n =
  PerformancePlusCampaignSettings
    <$> arbitraryReducedMaybe n -- performancePlusCampaignSettingsBoostProspectingAdGroupBid :: Maybe Bool
    <*> arbitraryReducedMaybe n -- performancePlusCampaignSettingsPinnerListExclusions :: Maybe [Text]
  
instance Arbitrary Pin where
  arbitrary = sized genPin

genPin :: Int -> Gen Pin
genPin n =
  Pin
    <$> arbitraryReducedMaybe n -- pinAiDisclosures :: Maybe AiDisclosures
    <*> arbitraryReducedMaybe n -- pinBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinBoardOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- pinBoardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pinCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- pinDominantColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinHasBeenPromoted :: Maybe Bool
    <*> arbitrary -- pinId :: Text
    <*> arbitraryReducedMaybe n -- pinIsOwner :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinIsProduct :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinIsStandard :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinMedia :: Maybe PinMedia
    <*> arbitraryReducedMaybe n -- pinParentPinId :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- pinPinMetrics :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- pinAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinTitle :: Maybe Text
  
instance Arbitrary PinAnalyticsDailyMetrics where
  arbitrary = sized genPinAnalyticsDailyMetrics

genPinAnalyticsDailyMetrics :: Int -> Gen PinAnalyticsDailyMetrics
genPinAnalyticsDailyMetrics n =
  PinAnalyticsDailyMetrics
    <$> arbitraryReducedMaybe n -- pinAnalyticsDailyMetricsDataStatus :: Maybe DataStatus
    <*> arbitraryReducedMaybe n -- pinAnalyticsDailyMetricsDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinAnalyticsDailyMetricsMetrics :: Maybe (Map.Map String Double)
  
instance Arbitrary PinAnalyticsMetricsResponse where
  arbitrary = sized genPinAnalyticsMetricsResponse

genPinAnalyticsMetricsResponse :: Int -> Gen PinAnalyticsMetricsResponse
genPinAnalyticsMetricsResponse n =
  PinAnalyticsMetricsResponse
    <$> arbitraryReducedMaybe n -- pinAnalyticsMetricsResponseDailyMetrics :: Maybe [PinAnalyticsDailyMetrics]
    <*> arbitraryReducedMaybe n -- pinAnalyticsMetricsResponseLifetimeMetrics :: Maybe (Map.Map String Int)
    <*> arbitraryReducedMaybe n -- pinAnalyticsMetricsResponseSummaryMetrics :: Maybe (Map.Map String Double)
  
instance Arbitrary PinBase where
  arbitrary = sized genPinBase

genPinBase :: Int -> Gen PinBase
genPinBase n =
  PinBase
    <$> arbitraryReducedMaybe n -- pinBaseAiDisclosures :: Maybe AiDisclosures
    <*> arbitraryReducedMaybe n -- pinBaseBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinBaseBoardOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- pinBaseBoardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinBaseCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pinBaseCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- pinBaseDominantColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinBaseHasBeenPromoted :: Maybe Bool
    <*> arbitrary -- pinBaseId :: Text
    <*> arbitraryReducedMaybe n -- pinBaseIsOwner :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinBaseIsProduct :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinBaseIsStandard :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinBaseMedia :: Maybe PinMedia
    <*> arbitraryReducedMaybe n -- pinBaseParentPinId :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- pinBasePinMetrics :: Maybe A.Value
  
instance Arbitrary PinCreate where
  arbitrary = sized genPinCreate

genPinCreate :: Int -> Gen PinCreate
genPinCreate n =
  PinCreate
    <$> arbitraryReducedMaybe n -- pinCreateAiDisclosures :: Maybe AiDisclosures
    <*> arbitraryReducedMaybe n -- pinCreateAltText :: Maybe Text
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
    <*> arbitraryReducedMaybe n -- pinMediaVideoUrlHls :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWidth :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaItems :: Maybe [PinMediaMetadata]
  
instance Arbitrary PinMediaMetadata where
  arbitrary = sized genPinMediaMetadata

genPinMediaMetadata :: Int -> Gen PinMediaMetadata
genPinMediaMetadata n =
  PinMediaMetadata
    <$> arbitraryReducedMaybe n -- pinMediaMetadataDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataImages :: Maybe ImageSize
    <*> arbitrary -- pinMediaMetadataItemType :: E'ItemType2
    <*> arbitraryReducedMaybe n -- pinMediaMetadataLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataDuration :: Maybe Double
    <*> arbitraryReducedMaybe n -- pinMediaMetadataHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaMetadataVideoUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaMetadataVideoUrlHls :: Maybe Text
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
    <*> arbitrary -- pinMediaWithImageMediaType :: E'ItemType
  
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
    <*> arbitrary -- pinMediaWithImagesMediaType :: E'MediaType2
  
instance Arbitrary PinMediaWithVideo where
  arbitrary = sized genPinMediaWithVideo

genPinMediaWithVideo :: Int -> Gen PinMediaWithVideo
genPinMediaWithVideo n =
  PinMediaWithVideo
    <$> arbitraryReducedMaybe n -- pinMediaWithVideoCoverImageUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoDuration :: Maybe Double
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoImages :: Maybe ImageSize
    <*> arbitrary -- pinMediaWithVideoMediaType :: E'ItemType2
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoVideoUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoVideoUrlHls :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinMediaWithVideoWidth :: Maybe Int
  
instance Arbitrary PinMediaWithVideos where
  arbitrary = sized genPinMediaWithVideos

genPinMediaWithVideos :: Int -> Gen PinMediaWithVideos
genPinMediaWithVideos n =
  PinMediaWithVideos
    <$> arbitraryReducedMaybe n -- pinMediaWithVideosItems :: Maybe [VideoMetadataWithItemType]
    <*> arbitrary -- pinMediaWithVideosMediaType :: E'MediaType3
  
instance Arbitrary PinRead where
  arbitrary = sized genPinRead

genPinRead :: Int -> Gen PinRead
genPinRead n =
  PinRead
    <$> arbitraryReducedMaybe n -- pinReadAiDisclosures :: Maybe AiDisclosures
    <*> arbitraryReducedMaybe n -- pinReadBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinReadBoardOwner :: Maybe BoardOwner
    <*> arbitraryReducedMaybe n -- pinReadBoardSectionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinReadCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pinReadCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- pinReadDominantColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinReadHasBeenPromoted :: Maybe Bool
    <*> arbitrary -- pinReadId :: Text
    <*> arbitraryReducedMaybe n -- pinReadIsOwner :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinReadIsProduct :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinReadIsStandard :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pinReadMedia :: Maybe PinMedia
    <*> arbitraryReducedMaybe n -- pinReadParentPinId :: Maybe Text
    <*> arbitraryReducedMaybeValue n -- pinReadPinMetrics :: Maybe A.Value
    <*> arbitraryReducedMaybe n -- pinReadAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinReadDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinReadLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinReadTitle :: Maybe Text
  
instance Arbitrary PinUpdate where
  arbitrary = sized genPinUpdate

genPinUpdate :: Int -> Gen PinUpdate
genPinUpdate n =
  PinUpdate
    <$> arbitraryReducedMaybe n -- pinUpdateAiDisclosures :: Maybe AiDisclosuresUpdate
    <*> arbitraryReducedMaybe n -- pinUpdateAltText :: Maybe Text
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
  
instance Arbitrary PinsSaveRequestCreate where
  arbitrary = sized genPinsSaveRequestCreate

genPinsSaveRequestCreate :: Int -> Gen PinsSaveRequestCreate
genPinsSaveRequestCreate n =
  PinsSaveRequestCreate
    <$> arbitraryReducedMaybe n -- pinsSaveRequestCreateBoardId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pinsSaveRequestCreateBoardSectionId :: Maybe Text
  
instance Arbitrary PinterestLibBatchItemException where
  arbitrary = sized genPinterestLibBatchItemException

genPinterestLibBatchItemException :: Int -> Gen PinterestLibBatchItemException
genPinterestLibBatchItemException n =
  PinterestLibBatchItemException
    <$> arbitraryReducedMaybe n -- pinterestLibBatchItemExceptionCode :: Maybe Int
    <*> arbitrary -- pinterestLibBatchItemExceptionMessage :: Text
  
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
  
instance Arbitrary PinterestProductCategoriesFilter where
  arbitrary = sized genPinterestProductCategoriesFilter

genPinterestProductCategoriesFilter :: Int -> Gen PinterestProductCategoriesFilter
genPinterestProductCategoriesFilter n =
  PinterestProductCategoriesFilter
    <$> arbitraryReduced n -- pinterestProductCategoriesFilterPinterestProductCategories :: CatalogsProductGroupMultiplePinterestProductCategoryCriteria
  
instance Arbitrary PlacementMultipliers where
  arbitrary = sized genPlacementMultipliers

genPlacementMultipliers :: Int -> Gen PlacementMultipliers
genPlacementMultipliers n =
  PlacementMultipliers
    <$> arbitraryReducedMaybe n -- placementMultipliersPlacement :: Maybe PlacementType
  
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
    <$> arbitraryReduced n -- priceFilterPrice :: PriceFilterPrice
  
instance Arbitrary PriceFilterPrice where
  arbitrary = sized genPriceFilterPrice

genPriceFilterPrice :: Int -> Gen PriceFilterPrice
genPriceFilterPrice n =
  PriceFilterPrice
    <$> arbitraryReduced n -- priceFilterPriceCurrency :: NonNullableCatalogsCurrency
    <*> arbitraryReducedMaybe n -- priceFilterPriceNegated :: Maybe Bool
    <*> arbitraryReduced n -- priceFilterPriceOperator :: NumericFilterOperatorType
    <*> arbitrary -- priceFilterPriceValue :: Double
  
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
  
instance Arbitrary ProductGroupAnalyticsItems where
  arbitrary = sized genProductGroupAnalyticsItems

genProductGroupAnalyticsItems :: Int -> Gen ProductGroupAnalyticsItems
genProductGroupAnalyticsItems n =
  ProductGroupAnalyticsItems
    <$> arbitraryReducedMaybe n -- productGroupAnalyticsItemsDate :: Maybe Date
    <*> arbitrary -- productGroupAnalyticsItemsProductGroupId :: Text
  
instance Arbitrary ProductGroupPromotion where
  arbitrary = sized genProductGroupPromotion

genProductGroupPromotion :: Int -> Gen ProductGroupPromotion
genProductGroupPromotion n =
  ProductGroupPromotion
    <$> arbitraryReducedMaybe n -- productGroupPromotionAdGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionBidInMicroCurrency :: Maybe Int
    <*> arbitraryReducedMaybe n -- productGroupPromotionCatalogProductGroupId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCatalogProductGroupName :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCollectionsHeaderType :: Maybe CollectionsHeaderType
    <*> arbitraryReducedMaybe n -- productGroupPromotionCollectionsHeroDestinationUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCollectionsHeroPinId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionCreativeType :: Maybe CreativeType
    <*> arbitraryReducedMaybe n -- productGroupPromotionCustomizableCtaType :: Maybe ProductGroupPromotionCustomizableCTAType
    <*> arbitraryReducedMaybe n -- productGroupPromotionDefinition :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionGridClickType :: Maybe GridClickType
    <*> arbitraryReducedMaybe n -- productGroupPromotionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionIncluded :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionIsGenerateBackground :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionIsImageAutoResizing :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionIsMdl :: Maybe Bool
    <*> arbitraryReducedMaybe n -- productGroupPromotionParentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- productGroupPromotionPreferredMediaType :: Maybe PreferredMediaType
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
  
instance Arbitrary ProductGroupPromotions where
  arbitrary = sized genProductGroupPromotions

genProductGroupPromotions :: Int -> Gen ProductGroupPromotions
genProductGroupPromotions n =
  ProductGroupPromotions
    <$> arbitraryReducedMaybe n -- productGroupPromotionsItems :: Maybe [ProductGroupPromotionResponseItem]
  
instance Arbitrary ProductGroupPromotionsCreate where
  arbitrary = sized genProductGroupPromotionsCreate

genProductGroupPromotionsCreate :: Int -> Gen ProductGroupPromotionsCreate
genProductGroupPromotionsCreate n =
  ProductGroupPromotionsCreate
    <$> arbitrary -- productGroupPromotionsCreateAdGroupId :: Text
    <*> arbitraryReduced n -- productGroupPromotionsCreateProductGroupPromotion :: [ProductGroupPromotion]
  
instance Arbitrary ProductGroupPromotionsList200Response where
  arbitrary = sized genProductGroupPromotionsList200Response

genProductGroupPromotionsList200Response :: Int -> Gen ProductGroupPromotionsList200Response
genProductGroupPromotionsList200Response n =
  ProductGroupPromotionsList200Response
    <$> arbitraryReducedMaybe n -- productGroupPromotionsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- productGroupPromotionsList200ResponseItems :: [ProductGroupPromotion]
  
instance Arbitrary ProductGroupPromotionsUpdateWithRequiredBody where
  arbitrary = sized genProductGroupPromotionsUpdateWithRequiredBody

genProductGroupPromotionsUpdateWithRequiredBody :: Int -> Gen ProductGroupPromotionsUpdateWithRequiredBody
genProductGroupPromotionsUpdateWithRequiredBody n =
  ProductGroupPromotionsUpdateWithRequiredBody
    <$> arbitrary -- productGroupPromotionsUpdateWithRequiredBodyAdGroupId :: Text
    <*> arbitraryReduced n -- productGroupPromotionsUpdateWithRequiredBodyProductGroupPromotion :: [ProductGroupPromotion]
  
instance Arbitrary ProductGroupReferenceFilter where
  arbitrary = sized genProductGroupReferenceFilter

genProductGroupReferenceFilter :: Int -> Gen ProductGroupReferenceFilter
genProductGroupReferenceFilter n =
  ProductGroupReferenceFilter
    <$> arbitraryReduced n -- productGroupReferenceFilterProductGroup :: CatalogsProductGroupMultipleStringCriteria
  
instance Arbitrary ProductTagItem where
  arbitrary = sized genProductTagItem

genProductTagItem :: Int -> Gen ProductTagItem
genProductTagItem n =
  ProductTagItem
    <$> arbitrary -- productTagItemPinId :: Text
  
instance Arbitrary ProductTagsBulkAddRequest where
  arbitrary = sized genProductTagsBulkAddRequest

genProductTagsBulkAddRequest :: Int -> Gen ProductTagsBulkAddRequest
genProductTagsBulkAddRequest n =
  ProductTagsBulkAddRequest
    <$> arbitraryReduced n -- productTagsBulkAddRequestProductTags :: [ProductTagItem]
  
instance Arbitrary ProductTagsBulkDeleteRequest where
  arbitrary = sized genProductTagsBulkDeleteRequest

genProductTagsBulkDeleteRequest :: Int -> Gen ProductTagsBulkDeleteRequest
genProductTagsBulkDeleteRequest n =
  ProductTagsBulkDeleteRequest
    <$> arbitraryReduced n -- productTagsBulkDeleteRequestProductTags :: [ProductTagItem]
  
instance Arbitrary ProductTagsError where
  arbitrary = sized genProductTagsError

genProductTagsError :: Int -> Gen ProductTagsError
genProductTagsError n =
  ProductTagsError
    <$> arbitrary -- productTagsErrorCode :: Int
    <*> arbitraryReducedMaybe n -- productTagsErrorDetails :: Maybe IneligibleProductTagsErrorDetails
    <*> arbitrary -- productTagsErrorMessage :: Text
  
instance Arbitrary ProductTagsResponse where
  arbitrary = sized genProductTagsResponse

genProductTagsResponse :: Int -> Gen ProductTagsResponse
genProductTagsResponse n =
  ProductTagsResponse
    <$> arbitraryReduced n -- productTagsResponseProductTags :: [ProductTagItem]
  
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
  
instance Arbitrary Promotion where
  arbitrary = sized genPromotion

genPromotion :: Int -> Gen Promotion
genPromotion n =
  Promotion
    <$> arbitrary -- promotionAdAccountId :: Text
    <*> arbitraryReducedMaybe n -- promotionDiscountStatus :: Maybe DiscountStatus
    <*> arbitraryReducedMaybe n -- promotionEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionExternalId :: Maybe Text
    <*> arbitrary -- promotionId :: Text
    <*> arbitraryReducedMaybe n -- promotionPlatformType :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionPromotionCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionPromotionCustomId :: Maybe Text
    <*> arbitrary -- promotionPromotionTitle :: Text
    <*> arbitraryReduced n -- promotionPromotionType :: PromotionType
    <*> arbitraryReducedMaybe n -- promotionStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionStatus :: Maybe EntityStatus
    <*> arbitraryReducedMaybe n -- promotionTemplateValues :: Maybe [PromotionTemplateValue]
  
instance Arbitrary PromotionArrayElement where
  arbitrary = sized genPromotionArrayElement

genPromotionArrayElement :: Int -> Gen PromotionArrayElement
genPromotionArrayElement n =
  PromotionArrayElement
    <$> arbitraryReducedMaybe n -- promotionArrayElementData :: Maybe Promotion
    <*> arbitraryReducedMaybe n -- promotionArrayElementException :: Maybe Exception
  
instance Arbitrary PromotionBatchUpdate where
  arbitrary = sized genPromotionBatchUpdate

genPromotionBatchUpdate :: Int -> Gen PromotionBatchUpdate
genPromotionBatchUpdate n =
  PromotionBatchUpdate
    <$> arbitraryReducedMaybe n -- promotionBatchUpdateDiscountStatus :: Maybe DiscountStatus
    <*> arbitraryReducedMaybe n -- promotionBatchUpdateEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionBatchUpdateExternalId :: Maybe Text
    <*> arbitrary -- promotionBatchUpdateId :: Text
    <*> arbitraryReducedMaybe n -- promotionBatchUpdatePlatformType :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionBatchUpdatePromotionCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionBatchUpdatePromotionCustomId :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionBatchUpdatePromotionTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionBatchUpdatePromotionType :: Maybe PromotionType
    <*> arbitraryReducedMaybe n -- promotionBatchUpdateStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionBatchUpdateTemplateValues :: Maybe [PromotionTemplateValue]
  
instance Arbitrary PromotionCreate where
  arbitrary = sized genPromotionCreate

genPromotionCreate :: Int -> Gen PromotionCreate
genPromotionCreate n =
  PromotionCreate
    <$> arbitraryReducedMaybe n -- promotionCreateDiscountStatus :: Maybe DiscountStatus
    <*> arbitraryReducedMaybe n -- promotionCreateEndTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionCreateExternalId :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionCreatePlatformType :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionCreatePromotionCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionCreatePromotionCustomId :: Maybe Text
    <*> arbitrary -- promotionCreatePromotionTitle :: Text
    <*> arbitraryReduced n -- promotionCreatePromotionType :: PromotionType
    <*> arbitraryReducedMaybe n -- promotionCreateStartTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- promotionCreateTemplateValues :: Maybe [PromotionTemplateValue]
  
instance Arbitrary PromotionTemplateValue where
  arbitrary = sized genPromotionTemplateValue

genPromotionTemplateValue :: Int -> Gen PromotionTemplateValue
genPromotionTemplateValue n =
  PromotionTemplateValue
    <$> arbitraryReducedMaybe n -- promotionTemplateValueAmount :: Maybe Double
    <*> arbitraryReducedMaybe n -- promotionTemplateValueCurrencyCode :: Maybe Currency
    <*> arbitraryReducedMaybe n -- promotionTemplateValueCustomText :: Maybe Text
    <*> arbitraryReducedMaybe n -- promotionTemplateValuePercent :: Maybe Double
  
instance Arbitrary PromotionsList200Response where
  arbitrary = sized genPromotionsList200Response

genPromotionsList200Response :: Int -> Gen PromotionsList200Response
genPromotionsList200Response n =
  PromotionsList200Response
    <$> arbitraryReducedMaybe n -- promotionsList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- promotionsList200ResponseItems :: [Promotion]
  
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
    <*> arbitraryReducedMaybe n -- quizPinDataTieBreakerType :: Maybe TieBreakerType
  
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
    <*> arbitraryReducedMaybe n -- relatedTermsRelatedTermsList :: Maybe [RelatedTermsRelatedTermsListItems]
  
instance Arbitrary RelatedTermsRelatedTermsListItems where
  arbitrary = sized genRelatedTermsRelatedTermsListItems

genRelatedTermsRelatedTermsListItems :: Int -> Gen RelatedTermsRelatedTermsListItems
genRelatedTermsRelatedTermsListItems n =
  RelatedTermsRelatedTermsListItems
    <$> arbitraryReducedMaybe n -- relatedTermsRelatedTermsListItemsRelatedTerms :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- relatedTermsRelatedTermsListItemsTerm :: Maybe Text
  
instance Arbitrary ReportsStats200Response where
  arbitrary = sized genReportsStats200Response

genReportsStats200Response :: Int -> Gen ReportsStats200Response
genReportsStats200Response n =
  ReportsStats200Response
    <$> arbitraryReducedMaybe n -- reportsStats200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- reportsStats200ResponseItems :: [CatalogsReportStats]
  
instance Arbitrary RespondToInviteResultItem where
  arbitrary = sized genRespondToInviteResultItem

genRespondToInviteResultItem :: Int -> Gen RespondToInviteResultItem
genRespondToInviteResultItem n =
  RespondToInviteResultItem
    <$> arbitraryReducedMaybe n -- respondToInviteResultItemException :: Maybe InviteExceptionResponse
    <*> arbitraryReducedMaybe n -- respondToInviteResultItemInvite :: Maybe BaseInviteDataResponse
  
instance Arbitrary RespondToInvitesResponseArray where
  arbitrary = sized genRespondToInvitesResponseArray

genRespondToInvitesResponseArray :: Int -> Gen RespondToInvitesResponseArray
genRespondToInvitesResponseArray n =
  RespondToInvitesResponseArray
    <$> arbitraryReducedMaybe n -- respondToInvitesResponseArrayItems :: Maybe [RespondToInviteResultItem]
  
instance Arbitrary RetailLocalInventoryItemAttributes where
  arbitrary = sized genRetailLocalInventoryItemAttributes

genRetailLocalInventoryItemAttributes :: Int -> Gen RetailLocalInventoryItemAttributes
genRetailLocalInventoryItemAttributes n =
  RetailLocalInventoryItemAttributes
    <$> arbitraryReducedMaybe n -- retailLocalInventoryItemAttributesAdLink :: Maybe Text
    <*> arbitraryReduced n -- retailLocalInventoryItemAttributesAvailability :: ItemAvailability
    <*> arbitrary -- retailLocalInventoryItemAttributesPrice :: Text
    <*> arbitraryReducedMaybe n -- retailLocalInventoryItemAttributesSalePrice :: Maybe Text
  
instance Arbitrary RetailLocalInventoryItemAttributesOptional where
  arbitrary = sized genRetailLocalInventoryItemAttributesOptional

genRetailLocalInventoryItemAttributesOptional :: Int -> Gen RetailLocalInventoryItemAttributesOptional
genRetailLocalInventoryItemAttributesOptional n =
  RetailLocalInventoryItemAttributesOptional
    <$> arbitraryReducedMaybe n -- retailLocalInventoryItemAttributesOptionalAdLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- retailLocalInventoryItemAttributesOptionalAvailability :: Maybe ItemAvailability
    <*> arbitraryReducedMaybe n -- retailLocalInventoryItemAttributesOptionalPrice :: Maybe Text
    <*> arbitraryReducedMaybe n -- retailLocalInventoryItemAttributesOptionalSalePrice :: Maybe Text
  
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
  
instance Arbitrary SSIOAccount where
  arbitrary = sized genSSIOAccount

genSSIOAccount :: Int -> Gen SSIOAccount
genSSIOAccount n =
  SSIOAccount
    <$> arbitraryReducedMaybe n -- sSIOAccountBilltoInfos :: Maybe [SSIOAccountItem]
    <*> arbitraryReducedMaybe n -- sSIOAccountCanEdit :: Maybe Bool
    <*> arbitraryReducedMaybe n -- sSIOAccountCurrency :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountEligible :: Maybe Bool
    <*> arbitraryReducedMaybe n -- sSIOAccountError :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOAccountPmpNames :: Maybe [SSIOAccountPMPName]
  
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
  
instance Arbitrary SSIOInsertionOrder where
  arbitrary = sized genSSIOInsertionOrder

genSSIOInsertionOrder :: Int -> Gen SSIOInsertionOrder
genSSIOInsertionOrder n =
  SSIOInsertionOrder
    <$> arbitraryReducedMaybe n -- sSIOInsertionOrderPinOrderId :: Maybe Text
  
instance Arbitrary SSIOInsertionOrderCreate where
  arbitrary = sized genSSIOInsertionOrderCreate

genSSIOInsertionOrderCreate :: Int -> Gen SSIOInsertionOrderCreate
genSSIOInsertionOrderCreate n =
  SSIOInsertionOrderCreate
    <$> arbitrary -- sSIOInsertionOrderCreateAcceptedTermsId :: Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCreateAcceptedTermsTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCreateAgencyLink :: Maybe Text
    <*> arbitrary -- sSIOInsertionOrderCreateBillingContactEmail :: Text
    <*> arbitrary -- sSIOInsertionOrderCreateBillingContactFirstname :: Text
    <*> arbitrary -- sSIOInsertionOrderCreateBillingContactLastname :: Text
    <*> arbitrary -- sSIOInsertionOrderCreateBilltoBillingAddressId :: Text
    <*> arbitrary -- sSIOInsertionOrderCreateBilltoBusinessAddressId :: Text
    <*> arbitrary -- sSIOInsertionOrderCreateBilltoCompanyId :: Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCreateBudgetAmount :: Maybe Double
    <*> arbitraryReduced n -- sSIOInsertionOrderCreateCurrencyInfo :: Currency
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCreateEndDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCreateEstimatedMonthlySpend :: Maybe Double
    <*> arbitrary -- sSIOInsertionOrderCreateMediaContactEmail :: Text
    <*> arbitrary -- sSIOInsertionOrderCreateMediaContactFirstname :: Text
    <*> arbitrary -- sSIOInsertionOrderCreateMediaContactLastname :: Text
    <*> arbitraryReduced n -- sSIOInsertionOrderCreateOrderLineType :: SSIOOrderLineType
    <*> arbitrary -- sSIOInsertionOrderCreateOrderName :: Text
    <*> arbitrary -- sSIOInsertionOrderCreatePmpId :: Text
    <*> arbitrary -- sSIOInsertionOrderCreatePoNumber :: Text
    <*> arbitrary -- sSIOInsertionOrderCreateStartDate :: Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderCreateUserEmail :: Maybe Text
  
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
  
instance Arbitrary SSIOInsertionOrderUpdate where
  arbitrary = sized genSSIOInsertionOrderUpdate

genSSIOInsertionOrderUpdate :: Int -> Gen SSIOInsertionOrderUpdate
genSSIOInsertionOrderUpdate n =
  SSIOInsertionOrderUpdate
    <$> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateAdsManagerOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateAgencyLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateBillingContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateBillingContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateBillingContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateBudgetAmount :: Maybe Double
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateEndDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateMediaContactEmail :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateMediaContactFirstname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateMediaContactLastname :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateOracleLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdatePoNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateSalesforceOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateSalesforceOrderLineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateStartDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- sSIOInsertionOrderUpdateUserEmail :: Maybe Text
  
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
  
instance Arbitrary Schedule where
  arbitrary = sized genSchedule

genSchedule :: Int -> Gen Schedule
genSchedule n =
  Schedule
    <$> arbitraryReducedMaybe n -- scheduleDeltaValue :: Maybe ScheduleDeltaValue
    <*> arbitraryReducedMaybe n -- scheduleEndTimestamp :: Maybe Int
    <*> arbitrary -- scheduleEntityId :: Text
    <*> arbitraryReducedMaybe n -- scheduleEntityType :: Maybe AdAccountEntityType
    <*> arbitraryReducedMaybe n -- scheduleName :: Maybe Text
    <*> arbitraryReducedMaybe n -- scheduleScheduleAction :: Maybe ScheduleAction
    <*> arbitrary -- scheduleScheduleId :: Text
    <*> arbitraryReducedMaybe n -- scheduleScheduleStatus :: Maybe ScheduleStatus
    <*> arbitraryReducedMaybe n -- scheduleScheduleType :: Maybe ScheduleType
    <*> arbitraryReducedMaybe n -- scheduleStartTimestamp :: Maybe Int
  
instance Arbitrary ScheduleAgeBucketMultipliers where
  arbitrary = sized genScheduleAgeBucketMultipliers

genScheduleAgeBucketMultipliers :: Int -> Gen ScheduleAgeBucketMultipliers
genScheduleAgeBucketMultipliers n =
  ScheduleAgeBucketMultipliers
    <$> arbitraryReducedMaybe n -- scheduleAgeBucketMultipliersAgeBucket :: Maybe E'AgeBucket
  
instance Arbitrary ScheduleAppTypeMultipliers where
  arbitrary = sized genScheduleAppTypeMultipliers

genScheduleAppTypeMultipliers :: Int -> Gen ScheduleAppTypeMultipliers
genScheduleAppTypeMultipliers n =
  ScheduleAppTypeMultipliers
    <$> arbitraryReducedMaybe n -- scheduleAppTypeMultipliersAppType :: Maybe TargetingSpecAppType
  
instance Arbitrary ScheduleAudienceMultipliers where
  arbitrary = sized genScheduleAudienceMultipliers

genScheduleAudienceMultipliers :: Int -> Gen ScheduleAudienceMultipliers
genScheduleAudienceMultipliers n =
  ScheduleAudienceMultipliers
    <$> arbitraryReducedMaybe n -- scheduleAudienceMultipliersAudienceId :: Maybe Text
  
instance Arbitrary ScheduleBatchUpdate where
  arbitrary = sized genScheduleBatchUpdate

genScheduleBatchUpdate :: Int -> Gen ScheduleBatchUpdate
genScheduleBatchUpdate n =
  ScheduleBatchUpdate
    <$> arbitraryReducedMaybe n -- scheduleBatchUpdateDeltaValue :: Maybe ScheduleDeltaValue
    <*> arbitraryReducedMaybe n -- scheduleBatchUpdateEndTimestamp :: Maybe Int
    <*> arbitraryReducedMaybe n -- scheduleBatchUpdateEntityId :: Maybe Text
    <*> arbitraryReducedMaybe n -- scheduleBatchUpdateEntityType :: Maybe AdAccountEntityType
    <*> arbitrary -- scheduleBatchUpdateId :: Text
    <*> arbitraryReducedMaybe n -- scheduleBatchUpdateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- scheduleBatchUpdateScheduleAction :: Maybe ScheduleAction
    <*> arbitrary -- scheduleBatchUpdateScheduleId :: Text
    <*> arbitraryReducedMaybe n -- scheduleBatchUpdateScheduleStatus :: Maybe ScheduleStatus
    <*> arbitraryReducedMaybe n -- scheduleBatchUpdateScheduleType :: Maybe ScheduleType
    <*> arbitraryReducedMaybe n -- scheduleBatchUpdateStartTimestamp :: Maybe Int
  
instance Arbitrary ScheduleBidMultipliers where
  arbitrary = sized genScheduleBidMultipliers

genScheduleBidMultipliers :: Int -> Gen ScheduleBidMultipliers
genScheduleBidMultipliers n =
  ScheduleBidMultipliers
    <$> arbitraryReducedMaybe n -- scheduleBidMultipliersAgeBucketMultipliers :: Maybe BidOptionsAgeBucketMultipliers
    <*> arbitraryReducedMaybe n -- scheduleBidMultipliersAppTypeMultipliers :: Maybe BidOptionsAppTypeMultipliers
    <*> arbitraryReducedMaybe n -- scheduleBidMultipliersAudienceMultipliers :: Maybe [BidOptionsAudienceMultipliers]
    <*> arbitraryReducedMaybe n -- scheduleBidMultipliersGenderMultipliers :: Maybe BidOptionsGenderMultipliers
    <*> arbitraryReducedMaybe n -- scheduleBidMultipliersPlacementMultipliers :: Maybe BidOptionsPlacementMultipliers
  
instance Arbitrary ScheduleBidOptions where
  arbitrary = sized genScheduleBidOptions

genScheduleBidOptions :: Int -> Gen ScheduleBidOptions
genScheduleBidOptions n =
  ScheduleBidOptions
    <$> arbitraryReducedMaybe n -- scheduleBidOptionsAgeBucketMultipliers :: Maybe ScheduleAgeBucketMultipliers
    <*> arbitraryReducedMaybe n -- scheduleBidOptionsAppTypeMultipliers :: Maybe ScheduleAppTypeMultipliers
    <*> arbitraryReducedMaybe n -- scheduleBidOptionsAudienceMultipliers :: Maybe ScheduleAudienceMultipliers
    <*> arbitraryReducedMaybe n -- scheduleBidOptionsGenderMultipliers :: Maybe ScheduleBidOptionsGenderMultipliers
    <*> arbitraryReducedMaybe n -- scheduleBidOptionsPlacementMultipliers :: Maybe ScheduleBidOptionsPlacementMultipliers
  
instance Arbitrary ScheduleBidOptionsGenderMultipliers where
  arbitrary = sized genScheduleBidOptionsGenderMultipliers

genScheduleBidOptionsGenderMultipliers :: Int -> Gen ScheduleBidOptionsGenderMultipliers
genScheduleBidOptionsGenderMultipliers n =
  ScheduleBidOptionsGenderMultipliers
    <$> arbitraryReducedMaybe n -- scheduleBidOptionsGenderMultipliersGender :: Maybe TargetingSpecGender
  
instance Arbitrary ScheduleBidOptionsPlacementMultipliers where
  arbitrary = sized genScheduleBidOptionsPlacementMultipliers

genScheduleBidOptionsPlacementMultipliers :: Int -> Gen ScheduleBidOptionsPlacementMultipliers
genScheduleBidOptionsPlacementMultipliers n =
  ScheduleBidOptionsPlacementMultipliers
    <$> arbitraryReducedMaybe n -- scheduleBidOptionsPlacementMultipliersBrowse :: Maybe Double
    <*> arbitraryReducedMaybe n -- scheduleBidOptionsPlacementMultipliersRelatedPins :: Maybe Double
    <*> arbitraryReducedMaybe n -- scheduleBidOptionsPlacementMultipliersSearch :: Maybe Double
  
instance Arbitrary ScheduleCommonDeltaValue where
  arbitrary = sized genScheduleCommonDeltaValue

genScheduleCommonDeltaValue :: Int -> Gen ScheduleCommonDeltaValue
genScheduleCommonDeltaValue n =
  ScheduleCommonDeltaValue
    <$> arbitraryReducedMaybe n -- scheduleCommonDeltaValueAgeBucketMultipliers :: Maybe ScheduleAgeBucketMultipliers
    <*> arbitraryReducedMaybe n -- scheduleCommonDeltaValueAppTypeMultipliers :: Maybe ScheduleAppTypeMultipliers
    <*> arbitraryReducedMaybe n -- scheduleCommonDeltaValueAudienceMultipliers :: Maybe ScheduleAudienceMultipliers
    <*> arbitraryReducedMaybe n -- scheduleCommonDeltaValueGenderMultipliers :: Maybe ScheduleBidOptionsGenderMultipliers
    <*> arbitraryReducedMaybe n -- scheduleCommonDeltaValuePlacementMultipliers :: Maybe ScheduleBidOptionsPlacementMultipliers
  
instance Arbitrary ScheduleCreate where
  arbitrary = sized genScheduleCreate

genScheduleCreate :: Int -> Gen ScheduleCreate
genScheduleCreate n =
  ScheduleCreate
    <$> arbitraryReducedMaybe n -- scheduleCreateDeltaValue :: Maybe ScheduleDeltaValue
    <*> arbitraryReducedMaybe n -- scheduleCreateEndTimestamp :: Maybe Int
    <*> arbitrary -- scheduleCreateEntityId :: Text
    <*> arbitraryReducedMaybe n -- scheduleCreateEntityType :: Maybe AdAccountEntityType
    <*> arbitraryReducedMaybe n -- scheduleCreateName :: Maybe Text
    <*> arbitraryReducedMaybe n -- scheduleCreateScheduleAction :: Maybe ScheduleAction
    <*> arbitraryReducedMaybe n -- scheduleCreateScheduleStatus :: Maybe ScheduleStatus
    <*> arbitraryReducedMaybe n -- scheduleCreateScheduleType :: Maybe ScheduleType
    <*> arbitraryReducedMaybe n -- scheduleCreateStartTimestamp :: Maybe Int
  
instance Arbitrary ScheduleCreateRequest where
  arbitrary = sized genScheduleCreateRequest

genScheduleCreateRequest :: Int -> Gen ScheduleCreateRequest
genScheduleCreateRequest n =
  ScheduleCreateRequest
    <$> arbitrary -- scheduleCreateRequestEntityId :: Text
    <*> arbitrary -- scheduleCreateRequestEntityType :: Text
    <*> arbitraryReduced n -- scheduleCreateRequestDeltaValue :: ScheduleCommonDeltaValue
    <*> arbitrary -- scheduleCreateRequestEndTimestamp :: Int
    <*> arbitrary -- scheduleCreateRequestName :: Text
    <*> arbitraryReduced n -- scheduleCreateRequestScheduleAction :: ScheduleAction
    <*> arbitraryReduced n -- scheduleCreateRequestScheduleStatus :: ScheduleStatus
    <*> arbitraryReduced n -- scheduleCreateRequestScheduleType :: ScheduleType
    <*> arbitrary -- scheduleCreateRequestStartTimestamp :: Int
  
instance Arbitrary ScheduleCreateRequestAllOf1 where
  arbitrary = sized genScheduleCreateRequestAllOf1

genScheduleCreateRequestAllOf1 :: Int -> Gen ScheduleCreateRequestAllOf1
genScheduleCreateRequestAllOf1 n =
  ScheduleCreateRequestAllOf1
    <$> arbitrary -- scheduleCreateRequestAllOf1EntityId :: Text
    <*> arbitrary -- scheduleCreateRequestAllOf1EntityType :: Text
  
instance Arbitrary ScheduleDeltaValue where
  arbitrary = sized genScheduleDeltaValue

genScheduleDeltaValue :: Int -> Gen ScheduleDeltaValue
genScheduleDeltaValue n =
  ScheduleDeltaValue
    <$> arbitraryReducedMaybe n -- scheduleDeltaValueAgeBucketMultipliers :: Maybe BidOptionsAgeBucketMultipliers
    <*> arbitraryReducedMaybe n -- scheduleDeltaValueAppTypeMultipliers :: Maybe BidOptionsAppTypeMultipliers
    <*> arbitraryReducedMaybe n -- scheduleDeltaValueAudienceMultipliers :: Maybe [BidOptionsAudienceMultipliers]
    <*> arbitraryReducedMaybe n -- scheduleDeltaValueGenderMultipliers :: Maybe BidOptionsGenderMultipliers
    <*> arbitraryReducedMaybe n -- scheduleDeltaValuePlacementMultipliers :: Maybe BidOptionsPlacementMultipliers
  
instance Arbitrary ScheduleGenderMultipliers where
  arbitrary = sized genScheduleGenderMultipliers

genScheduleGenderMultipliers :: Int -> Gen ScheduleGenderMultipliers
genScheduleGenderMultipliers n =
  ScheduleGenderMultipliers
    <$> arbitraryReducedMaybe n -- scheduleGenderMultipliersGender :: Maybe TargetingSpecGender
  
instance Arbitrary SchedulePlacementMultipliers where
  arbitrary = sized genSchedulePlacementMultipliers

genSchedulePlacementMultipliers :: Int -> Gen SchedulePlacementMultipliers
genSchedulePlacementMultipliers n =
  SchedulePlacementMultipliers
    <$> arbitraryReducedMaybe n -- schedulePlacementMultipliersBrowse :: Maybe Double
    <*> arbitraryReducedMaybe n -- schedulePlacementMultipliersRelatedPins :: Maybe Double
    <*> arbitraryReducedMaybe n -- schedulePlacementMultipliersSearch :: Maybe Double
  
instance Arbitrary ScheduleUpdateRequest where
  arbitrary = sized genScheduleUpdateRequest

genScheduleUpdateRequest :: Int -> Gen ScheduleUpdateRequest
genScheduleUpdateRequest n =
  ScheduleUpdateRequest
    <$> arbitraryReducedMaybe n -- scheduleUpdateRequestEntityId :: Maybe Text
    <*> arbitraryReducedMaybe n -- scheduleUpdateRequestEntityType :: Maybe Text
    <*> arbitrary -- scheduleUpdateRequestId :: Text
    <*> arbitraryReducedMaybe n -- scheduleUpdateRequestDeltaValue :: Maybe ScheduleCommonDeltaValue
    <*> arbitraryReducedMaybe n -- scheduleUpdateRequestEndTimestamp :: Maybe Int
    <*> arbitraryReducedMaybe n -- scheduleUpdateRequestName :: Maybe Text
    <*> arbitraryReducedMaybe n -- scheduleUpdateRequestScheduleAction :: Maybe ScheduleAction
    <*> arbitraryReducedMaybe n -- scheduleUpdateRequestScheduleStatus :: Maybe ScheduleStatus
    <*> arbitraryReducedMaybe n -- scheduleUpdateRequestScheduleType :: Maybe ScheduleType
    <*> arbitraryReducedMaybe n -- scheduleUpdateRequestStartTimestamp :: Maybe Int
  
instance Arbitrary ScheduleUpdateRequestAllOf1 where
  arbitrary = sized genScheduleUpdateRequestAllOf1

genScheduleUpdateRequestAllOf1 :: Int -> Gen ScheduleUpdateRequestAllOf1
genScheduleUpdateRequestAllOf1 n =
  ScheduleUpdateRequestAllOf1
    <$> arbitraryReducedMaybe n -- scheduleUpdateRequestAllOf1EntityId :: Maybe Text
    <*> arbitraryReducedMaybe n -- scheduleUpdateRequestAllOf1EntityType :: Maybe Text
    <*> arbitrary -- scheduleUpdateRequestAllOf1Id :: Text
  
instance Arbitrary SchedulesCreate200ResponseInner where
  arbitrary = sized genSchedulesCreate200ResponseInner

genSchedulesCreate200ResponseInner :: Int -> Gen SchedulesCreate200ResponseInner
genSchedulesCreate200ResponseInner n =
  SchedulesCreate200ResponseInner
    <$> arbitraryReduced n -- schedulesCreate200ResponseInnerData :: SchedulesCreate200ResponseInnerData
  
instance Arbitrary SchedulesCreate200ResponseInnerData where
  arbitrary = sized genSchedulesCreate200ResponseInnerData

genSchedulesCreate200ResponseInnerData :: Int -> Gen SchedulesCreate200ResponseInnerData
genSchedulesCreate200ResponseInnerData n =
  SchedulesCreate200ResponseInnerData
    <$> arbitraryReducedMaybe n -- schedulesCreate200ResponseInnerDataDeltaValue :: Maybe ScheduleDeltaValue
    <*> arbitraryReducedMaybe n -- schedulesCreate200ResponseInnerDataEndTimestamp :: Maybe Int
    <*> arbitrary -- schedulesCreate200ResponseInnerDataEntityId :: Text
    <*> arbitraryReducedMaybe n -- schedulesCreate200ResponseInnerDataEntityType :: Maybe AdAccountEntityType
    <*> arbitraryReducedMaybe n -- schedulesCreate200ResponseInnerDataName :: Maybe Text
    <*> arbitraryReducedMaybe n -- schedulesCreate200ResponseInnerDataScheduleAction :: Maybe ScheduleAction
    <*> arbitrary -- schedulesCreate200ResponseInnerDataScheduleId :: Text
    <*> arbitraryReducedMaybe n -- schedulesCreate200ResponseInnerDataScheduleStatus :: Maybe ScheduleStatus
    <*> arbitraryReducedMaybe n -- schedulesCreate200ResponseInnerDataScheduleType :: Maybe ScheduleType
    <*> arbitraryReducedMaybe n -- schedulesCreate200ResponseInnerDataStartTimestamp :: Maybe Int
    <*> arbitrary -- schedulesCreate200ResponseInnerDataId :: Text
    <*> arbitraryReduced n -- schedulesCreate200ResponseInnerDataExceptions :: PinterestLibError
  
instance Arbitrary SchedulesCreate200ResponseInnerDataOneOf where
  arbitrary = sized genSchedulesCreate200ResponseInnerDataOneOf

genSchedulesCreate200ResponseInnerDataOneOf :: Int -> Gen SchedulesCreate200ResponseInnerDataOneOf
genSchedulesCreate200ResponseInnerDataOneOf n =
  SchedulesCreate200ResponseInnerDataOneOf
    <$> arbitrary -- schedulesCreate200ResponseInnerDataOneOfId :: Text
    <*> arbitrary -- schedulesCreate200ResponseInnerDataOneOfScheduleId :: Text
    <*> arbitraryReduced n -- schedulesCreate200ResponseInnerDataOneOfExceptions :: PinterestLibError
  
instance Arbitrary SchedulesList200Response where
  arbitrary = sized genSchedulesList200Response

genSchedulesList200Response :: Int -> Gen SchedulesList200Response
genSchedulesList200Response n =
  SchedulesList200Response
    <$> arbitraryReducedMaybe n -- schedulesList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- schedulesList200ResponseItems :: [Schedule]
  
instance Arbitrary ScrollupGoalMetadata where
  arbitrary = sized genScrollupGoalMetadata

genScrollupGoalMetadata :: Int -> Gen ScrollupGoalMetadata
genScrollupGoalMetadata n =
  ScrollupGoalMetadata
    <$> arbitraryReducedMaybe n -- scrollupGoalMetadataScrollupGoalValueInMicroCurrency :: Maybe Text
  
instance Arbitrary SearchPartnerPins200Response where
  arbitrary = sized genSearchPartnerPins200Response

genSearchPartnerPins200Response :: Int -> Gen SearchPartnerPins200Response
genSearchPartnerPins200Response n =
  SearchPartnerPins200Response
    <$> arbitraryReducedMaybe n -- searchPartnerPins200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- searchPartnerPins200ResponseItems :: [SummaryPin]
  
instance Arbitrary SharedAudienceAccount where
  arbitrary = sized genSharedAudienceAccount

genSharedAudienceAccount :: Int -> Gen SharedAudienceAccount
genSharedAudienceAccount n =
  SharedAudienceAccount
    <$> arbitrary -- sharedAudienceAccountAccountId :: Text
    <*> arbitrary -- sharedAudienceAccountAccountName :: Text
    <*> arbitraryReduced n -- sharedAudienceAccountAccountType :: AudienceAccountType
    <*> arbitrary -- sharedAudienceAccountSharedOnTimestamp :: Int
  
instance Arbitrary SharedAudiencesForBusinessList200Response where
  arbitrary = sized genSharedAudiencesForBusinessList200Response

genSharedAudiencesForBusinessList200Response :: Int -> Gen SharedAudiencesForBusinessList200Response
genSharedAudiencesForBusinessList200Response n =
  SharedAudiencesForBusinessList200Response
    <$> arbitraryReducedMaybe n -- sharedAudiencesForBusinessList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- sharedAudiencesForBusinessList200ResponseItems :: [Audience]
  
instance Arbitrary SingleInterestTargetingOption where
  arbitrary = sized genSingleInterestTargetingOption

genSingleInterestTargetingOption :: Int -> Gen SingleInterestTargetingOption
genSingleInterestTargetingOption n =
  SingleInterestTargetingOption
    <$> arbitrary -- singleInterestTargetingOptionChildInterests :: [Text]
    <*> arbitrary -- singleInterestTargetingOptionId :: Text
    <*> arbitrary -- singleInterestTargetingOptionLevel :: Int
    <*> arbitrary -- singleInterestTargetingOptionName :: Text
  
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
  
instance Arbitrary StoreMetadata where
  arbitrary = sized genStoreMetadata

genStoreMetadata :: Int -> Gen StoreMetadata
genStoreMetadata n =
  StoreMetadata
    <$> arbitraryReducedMaybe n -- storeMetadataGeohash :: Maybe Text
    <*> arbitraryReducedMaybe n -- storeMetadataLatitude :: Maybe Double
    <*> arbitraryReducedMaybe n -- storeMetadataLongitude :: Maybe Double
    <*> arbitrary -- storeMetadataStoreCode :: Text
    <*> arbitrary -- storeMetadataStoreId :: Text
    <*> arbitraryReducedMaybe n -- storeMetadataStoreName :: Maybe Text
  
instance Arbitrary SummaryPin where
  arbitrary = sized genSummaryPin

genSummaryPin :: Int -> Gen SummaryPin
genSummaryPin n =
  SummaryPin
    <$> arbitraryReducedMaybe n -- summaryPinAltText :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinDescription :: Maybe Text
    <*> arbitrary -- summaryPinId :: Text
    <*> arbitraryReducedMaybe n -- summaryPinLink :: Maybe Text
    <*> arbitraryReducedMaybe n -- summaryPinMedia :: Maybe PinMedia
    <*> arbitraryReducedMaybe n -- summaryPinTitle :: Maybe Text
  
instance Arbitrary SupplementalItemValidationEvent where
  arbitrary = sized genSupplementalItemValidationEvent

genSupplementalItemValidationEvent :: Int -> Gen SupplementalItemValidationEvent
genSupplementalItemValidationEvent n =
  SupplementalItemValidationEvent
    <$> arbitrary -- supplementalItemValidationEventAttribute :: Text
    <*> arbitrary -- supplementalItemValidationEventCode :: Int
    <*> arbitrary -- supplementalItemValidationEventMessage :: Text
  
instance Arbitrary SupplementalItemsBatchResponse where
  arbitrary = sized genSupplementalItemsBatchResponse

genSupplementalItemsBatchResponse :: Int -> Gen SupplementalItemsBatchResponse
genSupplementalItemsBatchResponse n =
  SupplementalItemsBatchResponse
    <$> arbitrary -- supplementalItemsBatchResponseBatchId :: Text
    <*> arbitraryReducedMaybe n -- supplementalItemsBatchResponseCompletedTime :: Maybe DateTime
    <*> arbitraryReduced n -- supplementalItemsBatchResponseCreatedTime :: DateTime
    <*> arbitraryReduced n -- supplementalItemsBatchResponseOperationResults :: [SupplementalOperationResult]
    <*> arbitraryReduced n -- supplementalItemsBatchResponseStatus :: SupplementalItemBatchOperationStatus
  
instance Arbitrary SupplementalOperationResult where
  arbitrary = sized genSupplementalOperationResult

genSupplementalOperationResult :: Int -> Gen SupplementalOperationResult
genSupplementalOperationResult n =
  SupplementalOperationResult
    <$> arbitraryReducedMaybe n -- supplementalOperationResultErrors :: Maybe [SupplementalItemValidationEvent]
    <*> arbitrary -- supplementalOperationResultItemId :: Text
    <*> arbitraryReduced n -- supplementalOperationResultStatus :: SupplementalItemProcessingStatus
    <*> arbitrary -- supplementalOperationResultStoreCode :: Text
    <*> arbitrary -- supplementalOperationResultSupplementalType :: E'SupplementalType
    <*> arbitraryReducedMaybe n -- supplementalOperationResultWarnings :: Maybe [SupplementalItemValidationEvent]
  
instance Arbitrary SystemUserUpdateWithRequiredBody where
  arbitrary = sized genSystemUserUpdateWithRequiredBody

genSystemUserUpdateWithRequiredBody :: Int -> Gen SystemUserUpdateWithRequiredBody
genSystemUserUpdateWithRequiredBody n =
  SystemUserUpdateWithRequiredBody
    <$> arbitrary -- systemUserUpdateWithRequiredBodyName :: Text
  
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
    <*> arbitraryReducedMaybe n -- targetingSpecGeoExclude :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecInterest :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecLocale :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecLocation :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecLocationExclude :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecMaximumAge :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingSpecMinimumAge :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingSpecShoppingRetargeting :: Maybe [TargetingSpecShoppingRetargeting]
    <*> arbitraryReducedMaybe n -- targetingSpecTargetingStrategy :: Maybe [E'TargetingStrategy]
  
instance Arbitrary TargetingSpecOperationAgeBucket where
  arbitrary = sized genTargetingSpecOperationAgeBucket

genTargetingSpecOperationAgeBucket :: Int -> Gen TargetingSpecOperationAgeBucket
genTargetingSpecOperationAgeBucket n =
  TargetingSpecOperationAgeBucket
    <$> arbitrary -- targetingSpecOperationAgeBucketField :: E'Field
    <*> arbitrary -- targetingSpecOperationAgeBucketOperation :: E'Operation6
    <*> arbitraryReduced n -- targetingSpecOperationAgeBucketValues :: [TargetingSpecAgeBucket]
  
instance Arbitrary TargetingSpecOperationAppType where
  arbitrary = sized genTargetingSpecOperationAppType

genTargetingSpecOperationAppType :: Int -> Gen TargetingSpecOperationAppType
genTargetingSpecOperationAppType n =
  TargetingSpecOperationAppType
    <$> arbitrary -- targetingSpecOperationAppTypeField :: E'Field2
    <*> arbitraryReduced n -- targetingSpecOperationAppTypeOperation :: TargetingSpecListOperation
    <*> arbitraryReduced n -- targetingSpecOperationAppTypeValues :: [TargetingSpecAppType]
  
instance Arbitrary TargetingSpecOperationAudienceExclude where
  arbitrary = sized genTargetingSpecOperationAudienceExclude

genTargetingSpecOperationAudienceExclude :: Int -> Gen TargetingSpecOperationAudienceExclude
genTargetingSpecOperationAudienceExclude n =
  TargetingSpecOperationAudienceExclude
    <$> arbitrary -- targetingSpecOperationAudienceExcludeField :: E'Field3
    <*> arbitraryReduced n -- targetingSpecOperationAudienceExcludeOperation :: TargetingSpecListOperation
    <*> arbitrary -- targetingSpecOperationAudienceExcludeValues :: [Text]
  
instance Arbitrary TargetingSpecOperationAudienceInclude where
  arbitrary = sized genTargetingSpecOperationAudienceInclude

genTargetingSpecOperationAudienceInclude :: Int -> Gen TargetingSpecOperationAudienceInclude
genTargetingSpecOperationAudienceInclude n =
  TargetingSpecOperationAudienceInclude
    <$> arbitrary -- targetingSpecOperationAudienceIncludeField :: E'Field4
    <*> arbitraryReduced n -- targetingSpecOperationAudienceIncludeOperation :: TargetingSpecListOperation
    <*> arbitrary -- targetingSpecOperationAudienceIncludeValues :: [Text]
  
instance Arbitrary TargetingSpecOperationGender where
  arbitrary = sized genTargetingSpecOperationGender

genTargetingSpecOperationGender :: Int -> Gen TargetingSpecOperationGender
genTargetingSpecOperationGender n =
  TargetingSpecOperationGender
    <$> arbitrary -- targetingSpecOperationGenderField :: E'Field5
    <*> arbitraryReduced n -- targetingSpecOperationGenderOperation :: TargetingSpecListOperation
    <*> arbitraryReduced n -- targetingSpecOperationGenderValues :: [TargetingSpecGender]
  
instance Arbitrary TargetingSpecOperationGeo where
  arbitrary = sized genTargetingSpecOperationGeo

genTargetingSpecOperationGeo :: Int -> Gen TargetingSpecOperationGeo
genTargetingSpecOperationGeo n =
  TargetingSpecOperationGeo
    <$> arbitrary -- targetingSpecOperationGeoField :: E'Field6
    <*> arbitraryReduced n -- targetingSpecOperationGeoOperation :: TargetingSpecListOperation
    <*> arbitrary -- targetingSpecOperationGeoValues :: [Text]
  
instance Arbitrary TargetingSpecOperationGeoExclude where
  arbitrary = sized genTargetingSpecOperationGeoExclude

genTargetingSpecOperationGeoExclude :: Int -> Gen TargetingSpecOperationGeoExclude
genTargetingSpecOperationGeoExclude n =
  TargetingSpecOperationGeoExclude
    <$> arbitrary -- targetingSpecOperationGeoExcludeField :: E'Field7
    <*> arbitraryReduced n -- targetingSpecOperationGeoExcludeOperation :: TargetingSpecListOperation
    <*> arbitrary -- targetingSpecOperationGeoExcludeValues :: [Text]
  
instance Arbitrary TargetingSpecOperationInterest where
  arbitrary = sized genTargetingSpecOperationInterest

genTargetingSpecOperationInterest :: Int -> Gen TargetingSpecOperationInterest
genTargetingSpecOperationInterest n =
  TargetingSpecOperationInterest
    <$> arbitrary -- targetingSpecOperationInterestField :: E'Field8
    <*> arbitraryReduced n -- targetingSpecOperationInterestOperation :: TargetingSpecListOperation
    <*> arbitrary -- targetingSpecOperationInterestValues :: [Text]
  
instance Arbitrary TargetingSpecOperationLocale where
  arbitrary = sized genTargetingSpecOperationLocale

genTargetingSpecOperationLocale :: Int -> Gen TargetingSpecOperationLocale
genTargetingSpecOperationLocale n =
  TargetingSpecOperationLocale
    <$> arbitrary -- targetingSpecOperationLocaleField :: E'Field9
    <*> arbitraryReduced n -- targetingSpecOperationLocaleOperation :: TargetingSpecListOperation
    <*> arbitrary -- targetingSpecOperationLocaleValues :: [Text]
  
instance Arbitrary TargetingSpecOperationLocation where
  arbitrary = sized genTargetingSpecOperationLocation

genTargetingSpecOperationLocation :: Int -> Gen TargetingSpecOperationLocation
genTargetingSpecOperationLocation n =
  TargetingSpecOperationLocation
    <$> arbitrary -- targetingSpecOperationLocationField :: E'Field10
    <*> arbitraryReduced n -- targetingSpecOperationLocationOperation :: TargetingSpecListOperation
    <*> arbitrary -- targetingSpecOperationLocationValues :: [Text]
  
instance Arbitrary TargetingSpecOperationLocationExclude where
  arbitrary = sized genTargetingSpecOperationLocationExclude

genTargetingSpecOperationLocationExclude :: Int -> Gen TargetingSpecOperationLocationExclude
genTargetingSpecOperationLocationExclude n =
  TargetingSpecOperationLocationExclude
    <$> arbitrary -- targetingSpecOperationLocationExcludeField :: E'Field11
    <*> arbitraryReduced n -- targetingSpecOperationLocationExcludeOperation :: TargetingSpecListOperation
    <*> arbitrary -- targetingSpecOperationLocationExcludeValues :: [Text]
  
instance Arbitrary TargetingSpecOperationMaximumAge where
  arbitrary = sized genTargetingSpecOperationMaximumAge

genTargetingSpecOperationMaximumAge :: Int -> Gen TargetingSpecOperationMaximumAge
genTargetingSpecOperationMaximumAge n =
  TargetingSpecOperationMaximumAge
    <$> arbitrary -- targetingSpecOperationMaximumAgeField :: E'Field12
    <*> arbitrary -- targetingSpecOperationMaximumAgeOperation :: E'Operation6
    <*> arbitrary -- targetingSpecOperationMaximumAgeValue :: Text
  
instance Arbitrary TargetingSpecOperationMinimumAge where
  arbitrary = sized genTargetingSpecOperationMinimumAge

genTargetingSpecOperationMinimumAge :: Int -> Gen TargetingSpecOperationMinimumAge
genTargetingSpecOperationMinimumAge n =
  TargetingSpecOperationMinimumAge
    <$> arbitrary -- targetingSpecOperationMinimumAgeField :: E'Field13
    <*> arbitrary -- targetingSpecOperationMinimumAgeOperation :: E'Operation6
    <*> arbitrary -- targetingSpecOperationMinimumAgeValue :: Text
  
instance Arbitrary TargetingSpecOperationShoppingRetargeting where
  arbitrary = sized genTargetingSpecOperationShoppingRetargeting

genTargetingSpecOperationShoppingRetargeting :: Int -> Gen TargetingSpecOperationShoppingRetargeting
genTargetingSpecOperationShoppingRetargeting n =
  TargetingSpecOperationShoppingRetargeting
    <$> arbitrary -- targetingSpecOperationShoppingRetargetingField :: E'Field14
    <*> arbitrary -- targetingSpecOperationShoppingRetargetingOperation :: E'Operation6
    <*> arbitraryReduced n -- targetingSpecOperationShoppingRetargetingValues :: [TargetingSpecShoppingRetargeting]
  
instance Arbitrary TargetingSpecOperations where
  arbitrary = sized genTargetingSpecOperations

genTargetingSpecOperations :: Int -> Gen TargetingSpecOperations
genTargetingSpecOperations n =
  TargetingSpecOperations
    <$> arbitrary -- targetingSpecOperationsField :: E'Field13
    <*> arbitrary -- targetingSpecOperationsOperation :: E'Operation6
    <*> arbitraryReduced n -- targetingSpecOperationsValues :: [TargetingSpecShoppingRetargeting]
    <*> arbitrary -- targetingSpecOperationsValue :: Text
  
instance Arbitrary TargetingSpecOptimal where
  arbitrary = sized genTargetingSpecOptimal

genTargetingSpecOptimal :: Int -> Gen TargetingSpecOptimal
genTargetingSpecOptimal n =
  TargetingSpecOptimal
    <$> arbitraryReducedMaybe n -- targetingSpecOptimalAgeBucket :: Maybe [TargetingSpecAgeBucket]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalApptype :: Maybe [TargetingSpecAppType]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalAudienceExclude :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalAudienceInclude :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalGender :: Maybe [TargetingSpecGender]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalGeo :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalGeoExclude :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalInterest :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalLocale :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalLocation :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalLocationExclude :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalMaximumAge :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalMinimumAge :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalShoppingRetargeting :: Maybe [TargetingSpecShoppingRetargeting]
    <*> arbitraryReducedMaybe n -- targetingSpecOptimalTargetingStrategy :: Maybe [TargetingStrategy]
  
instance Arbitrary TargetingSpecShoppingRetargeting where
  arbitrary = sized genTargetingSpecShoppingRetargeting

genTargetingSpecShoppingRetargeting :: Int -> Gen TargetingSpecShoppingRetargeting
genTargetingSpecShoppingRetargeting n =
  TargetingSpecShoppingRetargeting
    <$> arbitraryReducedMaybe n -- targetingSpecShoppingRetargetingExclusionWindow :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingSpecShoppingRetargetingLookbackWindow :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingSpecShoppingRetargetingTagTypes :: Maybe [Int]
  
instance Arbitrary TargetingTemplate where
  arbitrary = sized genTargetingTemplate

genTargetingTemplate :: Int -> Gen TargetingTemplate
genTargetingTemplate n =
  TargetingTemplate
    <$> arbitraryReducedMaybe n -- targetingTemplateAdAccountId :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- targetingTemplateCreatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingTemplateId :: Maybe Text
    <*> arbitraryReducedMaybe n -- targetingTemplateKeywords :: Maybe [TargetingTemplateKeyword]
    <*> arbitrary -- targetingTemplateName :: Text
    <*> arbitraryReducedMaybe n -- targetingTemplatePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReducedMaybe n -- targetingTemplateSizing :: Maybe TargetingTemplateAudienceSizing
    <*> arbitraryReducedMaybe n -- targetingTemplateStatus :: Maybe TargetingTemplateStatus
    <*> arbitraryReduced n -- targetingTemplateTargetingAttributes :: TargetingSpecOptimal
    <*> arbitraryReducedMaybe n -- targetingTemplateTrackingUrls :: Maybe TrackingUrls
    <*> arbitraryReducedMaybe n -- targetingTemplateUpdatedTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- targetingTemplateValid :: Maybe Bool
  
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
  
instance Arbitrary TargetingTemplateCreate where
  arbitrary = sized genTargetingTemplateCreate

genTargetingTemplateCreate :: Int -> Gen TargetingTemplateCreate
genTargetingTemplateCreate n =
  TargetingTemplateCreate
    <$> arbitraryReducedMaybe n -- targetingTemplateCreateAutoTargetingEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- targetingTemplateCreateKeywords :: Maybe [TargetingTemplateKeyword]
    <*> arbitrary -- targetingTemplateCreateName :: Text
    <*> arbitraryReducedMaybe n -- targetingTemplateCreatePlacementGroup :: Maybe PlacementGroupType
    <*> arbitraryReduced n -- targetingTemplateCreateTargetingAttributes :: TargetingSpecOptimal
    <*> arbitraryReducedMaybe n -- targetingTemplateCreateTrackingUrls :: Maybe TrackingUrls
  
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
    <*> arbitraryReduced n -- targetingTemplateList200ResponseItems :: [TargetingTemplate]
  
instance Arbitrary TargetingTemplateUpdateRequestReadOrUpdate where
  arbitrary = sized genTargetingTemplateUpdateRequestReadOrUpdate

genTargetingTemplateUpdateRequestReadOrUpdate :: Int -> Gen TargetingTemplateUpdateRequestReadOrUpdate
genTargetingTemplateUpdateRequestReadOrUpdate n =
  TargetingTemplateUpdateRequestReadOrUpdate
    <$> arbitrary -- targetingTemplateUpdateRequestReadOrUpdateId :: Text
    <*> arbitraryReduced n -- targetingTemplateUpdateRequestReadOrUpdateOperationType :: AudienceUpdateOperationType
    <*> arbitraryReducedMaybe n -- targetingTemplateUpdateRequestReadOrUpdateTargetingAttributes :: Maybe TargetingSpecOptimal
  
instance Arbitrary TemplateBasedReport where
  arbitrary = sized genTemplateBasedReport

genTemplateBasedReport :: Int -> Gen TemplateBasedReport
genTemplateBasedReport n =
  TemplateBasedReport
    <$> arbitraryReducedMaybe n -- templateBasedReportMessage :: Maybe Text
    <*> arbitraryReduced n -- templateBasedReportReportStatus :: BulkReportingJobStatus
    <*> arbitrary -- templateBasedReportTemplateId :: Text
    <*> arbitraryReducedMaybe n -- templateBasedReportToken :: Maybe Text
  
instance Arbitrary TemplateBasedReportCreate where
  arbitrary = sized genTemplateBasedReportCreate

genTemplateBasedReportCreate :: Int -> Gen TemplateBasedReportCreate
genTemplateBasedReportCreate n =
  TemplateBasedReportCreate
    <$> arbitraryReducedMaybe n -- templateBasedReportCreateMessage :: Maybe Text
    <*> arbitraryReduced n -- templateBasedReportCreateReportStatus :: BulkReportingJobStatus
    <*> arbitraryReducedMaybe n -- templateBasedReportCreateToken :: Maybe Text
  
instance Arbitrary TemplatesList200Response where
  arbitrary = sized genTemplatesList200Response

genTemplatesList200Response :: Int -> Gen TemplatesList200Response
genTemplatesList200Response n =
  TemplatesList200Response
    <$> arbitraryReducedMaybe n -- templatesList200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- templatesList200ResponseItems :: [AccountTemplate]
  
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
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponsePins :: Maybe [TopPinsAnalyticsResponsePinsItems]
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponseSortBy :: Maybe TopPinsSortBy
  
instance Arbitrary TopPinsAnalyticsResponseDateAvailability where
  arbitrary = sized genTopPinsAnalyticsResponseDateAvailability

genTopPinsAnalyticsResponseDateAvailability :: Int -> Gen TopPinsAnalyticsResponseDateAvailability
genTopPinsAnalyticsResponseDateAvailability n =
  TopPinsAnalyticsResponseDateAvailability
    <$> arbitraryReducedMaybe n -- topPinsAnalyticsResponseDateAvailabilityIsRealtime :: Maybe Bool
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponseDateAvailabilityLatestAvailableTimestamp :: Maybe Double
  
instance Arbitrary TopPinsAnalyticsResponsePinsItems where
  arbitrary = sized genTopPinsAnalyticsResponsePinsItems

genTopPinsAnalyticsResponsePinsItems :: Int -> Gen TopPinsAnalyticsResponsePinsItems
genTopPinsAnalyticsResponsePinsItems n =
  TopPinsAnalyticsResponsePinsItems
    <$> arbitraryReducedMaybe n -- topPinsAnalyticsResponsePinsItemsDataStatus :: Maybe (Map.Map String DataStatus)
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponsePinsItemsMetrics :: Maybe (Map.Map String Double)
    <*> arbitraryReducedMaybe n -- topPinsAnalyticsResponsePinsItemsPinId :: Maybe Text
  
instance Arbitrary TopVideoPinsAnalyticsResponse where
  arbitrary = sized genTopVideoPinsAnalyticsResponse

genTopVideoPinsAnalyticsResponse :: Int -> Gen TopVideoPinsAnalyticsResponse
genTopVideoPinsAnalyticsResponse n =
  TopVideoPinsAnalyticsResponse
    <$> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponseDateAvailability :: Maybe TopVideoPinsAnalyticsResponseDateAvailability
    <*> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponsePins :: Maybe [TopVideoPinsAnalyticsResponsePinsItems]
    <*> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponseSortBy :: Maybe TopVideoPinsSortBy
  
instance Arbitrary TopVideoPinsAnalyticsResponseDateAvailability where
  arbitrary = sized genTopVideoPinsAnalyticsResponseDateAvailability

genTopVideoPinsAnalyticsResponseDateAvailability :: Int -> Gen TopVideoPinsAnalyticsResponseDateAvailability
genTopVideoPinsAnalyticsResponseDateAvailability n =
  TopVideoPinsAnalyticsResponseDateAvailability
    <$> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponseDateAvailabilityIsRealtime :: Maybe Bool
    <*> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponseDateAvailabilityLatestAvailableTimestamp :: Maybe Double
  
instance Arbitrary TopVideoPinsAnalyticsResponsePinsItems where
  arbitrary = sized genTopVideoPinsAnalyticsResponsePinsItems

genTopVideoPinsAnalyticsResponsePinsItems :: Int -> Gen TopVideoPinsAnalyticsResponsePinsItems
genTopVideoPinsAnalyticsResponsePinsItems n =
  TopVideoPinsAnalyticsResponsePinsItems
    <$> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponsePinsItemsDataStatus :: Maybe (Map.Map String DataStatus)
    <*> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponsePinsItemsMetrics :: Maybe (Map.Map String Double)
    <*> arbitraryReducedMaybe n -- topVideoPinsAnalyticsResponsePinsItemsPinId :: Maybe Text
  
instance Arbitrary TotalCountByEntityStatus where
  arbitrary = sized genTotalCountByEntityStatus

genTotalCountByEntityStatus :: Int -> Gen TotalCountByEntityStatus
genTotalCountByEntityStatus n =
  TotalCountByEntityStatus
    <$> arbitraryReducedMaybe n -- totalCountByEntityStatusActive :: Maybe Int
    <*> arbitraryReducedMaybe n -- totalCountByEntityStatusArchived :: Maybe Int
    <*> arbitraryReducedMaybe n -- totalCountByEntityStatusPaused :: Maybe Int
  
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
    <$> arbitraryReducedMaybe n -- trendingKeywordDemographicsAgeDistribution :: Maybe TrendsAgeDistribution
    <*> arbitraryReducedMaybe n -- trendingKeywordDemographicsGenderDistribution :: Maybe TrendsGenderDistribution
  
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
    <$> arbitrary -- trendingPinColor :: Text
    <*> arbitrary -- trendingPinHeight :: Int
    <*> arbitrary -- trendingPinId :: Text
    <*> arbitrary -- trendingPinSrc :: Text
    <*> arbitraryReducedMaybe n -- trendingPinVerticalOffset :: Maybe Double
    <*> arbitrary -- trendingPinWidth :: Int
  
instance Arbitrary TrendingProductCategory where
  arbitrary = sized genTrendingProductCategory

genTrendingProductCategory :: Int -> Gen TrendingProductCategory
genTrendingProductCategory n =
  TrendingProductCategory
    <$> arbitraryReduced n -- trendingProductCategoryEngagementType :: ProductCategoriesEngagementType
    <*> arbitrary -- trendingProductCategoryPctChangeMom :: Int
    <*> arbitrary -- trendingProductCategoryPercentRelativeVolume :: Int
    <*> arbitrary -- trendingProductCategoryPinterestProductCategoryId :: Int
    <*> arbitrary -- trendingProductCategoryProductCategory :: Text
    <*> arbitraryReducedMaybe n -- trendingProductCategoryVerticals :: Maybe [Text]
  
instance Arbitrary TrendingTopic where
  arbitrary = sized genTrendingTopic

genTrendingTopic :: Int -> Gen TrendingTopic
genTrendingTopic n =
  TrendingTopic
    <$> arbitrary -- trendingTopicDescription :: Text
    <*> arbitrary -- trendingTopicId :: Text
    <*> arbitraryReducedMaybe n -- trendingTopicPercentGrowthMom :: Maybe Int
    <*> arbitraryReduced n -- trendingTopicPins :: [TrendingPin]
    <*> arbitrary -- trendingTopicRelatedInterests :: [Text]
    <*> arbitrary -- trendingTopicRelatedSearches :: [Text]
    <*> arbitrary -- trendingTopicTimeSeries :: (Map.Map String Double)
    <*> arbitrary -- trendingTopicTitle :: Text
  
instance Arbitrary TrendsAgeDistribution where
  arbitrary = sized genTrendsAgeDistribution

genTrendsAgeDistribution :: Int -> Gen TrendsAgeDistribution
genTrendsAgeDistribution n =
  TrendsAgeDistribution
    <$> arbitraryReducedMaybe n -- trendsAgeDistributionAgeDistribution :: Maybe TrendsAgeBucket
  
instance Arbitrary TrendsEditorial where
  arbitrary = sized genTrendsEditorial

genTrendsEditorial :: Int -> Gen TrendsEditorial
genTrendsEditorial n =
  TrendsEditorial
    <$> arbitrary -- trendsEditorialBoardUrl :: Text
    <*> arbitrary -- trendsEditorialDescription :: Text
    <*> arbitrary -- trendsEditorialInterests :: [Text]
    <*> arbitrary -- trendsEditorialPinsUrl :: [Text]
    <*> arbitraryReduced n -- trendsEditorialRelatedKeywords :: [KeywordInfo]
    <*> arbitrary -- trendsEditorialTitle :: Text
  
instance Arbitrary TrendsGenderDistribution where
  arbitrary = sized genTrendsGenderDistribution

genTrendsGenderDistribution :: Int -> Gen TrendsGenderDistribution
genTrendsGenderDistribution n =
  TrendsGenderDistribution
    <$> arbitraryReducedMaybe n -- trendsGenderDistributionGenderDistribution :: Maybe TrendsGender
  
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
   
instance Arbitrary UpdateBusinessMembershipsResponse where
  arbitrary = sized genUpdateBusinessMembershipsResponse

genUpdateBusinessMembershipsResponse :: Int -> Gen UpdateBusinessMembershipsResponse
genUpdateBusinessMembershipsResponse n =
  UpdateBusinessMembershipsResponse
    <$> arbitraryReducedMaybe n -- updateBusinessMembershipsResponseItems :: Maybe [BusinessMembershipMember]
  
instance Arbitrary UpdateInvitesResultsResponseArray where
  arbitrary = sized genUpdateInvitesResultsResponseArray

genUpdateInvitesResultsResponseArray :: Int -> Gen UpdateInvitesResultsResponseArray
genUpdateInvitesResultsResponseArray n =
  UpdateInvitesResultsResponseArray
    <$> arbitraryReducedMaybe n -- updateInvitesResultsResponseArrayItems :: Maybe [InviteActionResultItem]
  
instance Arbitrary UpdateMemberAssetAccessBody where
  arbitrary = sized genUpdateMemberAssetAccessBody

genUpdateMemberAssetAccessBody :: Int -> Gen UpdateMemberAssetAccessBody
genUpdateMemberAssetAccessBody n =
  UpdateMemberAssetAccessBody
    <$> arbitraryReduced n -- updateMemberAssetAccessBodyAccesses :: [UpdateMemberAssetAccessItem]
  
instance Arbitrary UpdateMemberAssetAccessItem where
  arbitrary = sized genUpdateMemberAssetAccessItem

genUpdateMemberAssetAccessItem :: Int -> Gen UpdateMemberAssetAccessItem
genUpdateMemberAssetAccessItem n =
  UpdateMemberAssetAccessItem
    <$> arbitrary -- updateMemberAssetAccessItemAssetId :: Text
    <*> arbitrary -- updateMemberAssetAccessItemMemberId :: Text
    <*> arbitraryReduced n -- updateMemberAssetAccessItemPermissions :: [Permissions]
  
instance Arbitrary UpdateMemberAssetResultItem where
  arbitrary = sized genUpdateMemberAssetResultItem

genUpdateMemberAssetResultItem :: Int -> Gen UpdateMemberAssetResultItem
genUpdateMemberAssetResultItem n =
  UpdateMemberAssetResultItem
    <$> arbitraryReducedMaybe n -- updateMemberAssetResultItemResponse :: Maybe UsersForIndividualAssetResponse
  
instance Arbitrary UpdateMemberAssetsResultsResponseArray where
  arbitrary = sized genUpdateMemberAssetsResultsResponseArray

genUpdateMemberAssetsResultsResponseArray :: Int -> Gen UpdateMemberAssetsResultsResponseArray
genUpdateMemberAssetsResultsResponseArray n =
  UpdateMemberAssetsResultsResponseArray
    <$> arbitraryReducedMaybe n -- updateMemberAssetsResultsResponseArrayItems :: Maybe [UpdateMemberAssetResultItem]
  
instance Arbitrary UpdatePartnerAssetAccessBody where
  arbitrary = sized genUpdatePartnerAssetAccessBody

genUpdatePartnerAssetAccessBody :: Int -> Gen UpdatePartnerAssetAccessBody
genUpdatePartnerAssetAccessBody n =
  UpdatePartnerAssetAccessBody
    <$> arbitraryReduced n -- updatePartnerAssetAccessBodyAccesses :: [UpdatePartnerAssetAccessItem]
  
instance Arbitrary UpdatePartnerAssetAccessItem where
  arbitrary = sized genUpdatePartnerAssetAccessItem

genUpdatePartnerAssetAccessItem :: Int -> Gen UpdatePartnerAssetAccessItem
genUpdatePartnerAssetAccessItem n =
  UpdatePartnerAssetAccessItem
    <$> arbitrary -- updatePartnerAssetAccessItemAssetId :: Text
    <*> arbitrary -- updatePartnerAssetAccessItemPartnerId :: Text
    <*> arbitraryReduced n -- updatePartnerAssetAccessItemPermissions :: [Permissions]
  
instance Arbitrary UpdatePartnerAssetsResult where
  arbitrary = sized genUpdatePartnerAssetsResult

genUpdatePartnerAssetsResult :: Int -> Gen UpdatePartnerAssetsResult
genUpdatePartnerAssetsResult n =
  UpdatePartnerAssetsResult
    <$> arbitraryReducedMaybe n -- updatePartnerAssetsResultAssetId :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatePartnerAssetsResultAssetType :: Maybe AssetTypeResponse
    <*> arbitraryReducedMaybe n -- updatePartnerAssetsResultPartnerId :: Maybe Text
    <*> arbitraryReducedMaybe n -- updatePartnerAssetsResultPermissions :: Maybe [Text]
  
instance Arbitrary UpdatePartnerAssetsResultsResponseArray where
  arbitrary = sized genUpdatePartnerAssetsResultsResponseArray

genUpdatePartnerAssetsResultsResponseArray :: Int -> Gen UpdatePartnerAssetsResultsResponseArray
genUpdatePartnerAssetsResultsResponseArray n =
  UpdatePartnerAssetsResultsResponseArray
    <$> arbitraryReducedMaybe n -- updatePartnerAssetsResultsResponseArrayItems :: Maybe [UpdatePartnerAssetsResult]
  
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
  
instance Arbitrary UserSingleAssetBinding where
  arbitrary = sized genUserSingleAssetBinding

genUserSingleAssetBinding :: Int -> Gen UserSingleAssetBinding
genUserSingleAssetBinding n =
  UserSingleAssetBinding
    <$> arbitraryReducedMaybe n -- userSingleAssetBindingPermissions :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- userSingleAssetBindingUser :: Maybe BusinessAccessUserSummary
  
instance Arbitrary UserWebsite where
  arbitrary = sized genUserWebsite

genUserWebsite :: Int -> Gen UserWebsite
genUserWebsite n =
  UserWebsite
    <$> arbitraryReducedMaybe n -- userWebsiteStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerifiedAt :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteWebsite :: Maybe Text
  
instance Arbitrary UserWebsiteCreate where
  arbitrary = sized genUserWebsiteCreate

genUserWebsiteCreate :: Int -> Gen UserWebsiteCreate
genUserWebsiteCreate n =
  UserWebsiteCreate
    <$> arbitraryReducedMaybe n -- userWebsiteCreateVerificationMethod :: Maybe WebsiteVerificationMethod
    <*> arbitraryReducedMaybe n -- userWebsiteCreateWebsite :: Maybe Text
  
instance Arbitrary UserWebsiteVerification where
  arbitrary = sized genUserWebsiteVerification

genUserWebsiteVerification :: Int -> Gen UserWebsiteVerification
genUserWebsiteVerification n =
  UserWebsiteVerification
    <$> arbitraryReducedMaybe n -- userWebsiteVerificationDnsTxtRecord :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationFileContent :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationFilename :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationMetatag :: Maybe Text
    <*> arbitraryReducedMaybe n -- userWebsiteVerificationVerificationCode :: Maybe Text
  
instance Arbitrary UserWebsitesGet200Response where
  arbitrary = sized genUserWebsitesGet200Response

genUserWebsitesGet200Response :: Int -> Gen UserWebsitesGet200Response
genUserWebsitesGet200Response n =
  UserWebsitesGet200Response
    <$> arbitraryReducedMaybe n -- userWebsitesGet200ResponseBookmark :: Maybe Text
    <*> arbitraryReduced n -- userWebsitesGet200ResponseItems :: [UserWebsite]
  
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
    <*> arbitrary -- videoMetadataWithItemTypeItemType :: E'ItemType2
    <*> arbitraryReducedMaybe n -- videoMetadataWithItemTypeVideoUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- videoMetadataWithItemTypeVideoUrlHls :: Maybe Text
    <*> arbitraryReducedMaybe n -- videoMetadataWithItemTypeWidth :: Maybe Int
  



instance Arbitrary ActionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdAccountEntityType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdAdsAnalyticsAsyncTargetingTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdCollectionsHeaderType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdDisapprovalReasons where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdGroupAudienceSizingCreativeTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdGroupSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdPinPreviewCreativeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdReviewStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdShoppingPreviewCreativeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdeColumnType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdgroupPlacementGroupType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdgroupTrackingFeatureType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdsAnalyticsAccountTargetingType where
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

instance Arbitrary AdsCreditDiscountType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AdvertiserDefinedEventMappingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AgeTrendsBucket where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AiDisclosureItem where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AppsflyerPlatform where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AssetGroupType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AssetPermissionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AssetSearchBy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AssetSortBy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AssetTypeResponse where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AttributionActionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AttributionMatchType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AttributionModel where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AttributionScope where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceAccountType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceInsightType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceObjectiveType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceOwnershipType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AudienceUpdateOperationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BasePreferredMediaType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BatchOperationStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BidFloorObjectiveType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BidStrategyType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BillingInvoiceDocumentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BillingInvoiceSortField where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BillingInvoiceStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BillingProfileCardType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BillingProfilePaymentMethodBrand where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BillingProfileStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BillingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BoardPrivacy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BoardPrivacyFilter where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BoardUpdatePrivacy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BudgetDurationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BudgetType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BulkEntityType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BulkOutputFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BulkReportingJobStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BulkRequestStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BusinessAccessRole where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BusinessMemberSortBy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BusinessRoleForInvite where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BusinessRoleForMembers where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary BusinessSearchBy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignBidOptionsUpdateMaskItems where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignObjectiveType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignPlanningConfidenceLevelAlertReason where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignPlanningConfidenceLevelAlertSeverity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignPlanningConversionAttributionWindowDays where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignPlanningConversionEvent where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignPlanningEstimationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignPlanningResponseErrorCode where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsAiContentDisclosureLabel where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CatalogsFeedProcessingScheduleTimezone where
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

instance Arbitrary ChangeHistoryDataType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ChangeHistoryOperationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CollectionsHeaderType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionAttributionWindowDays where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionDeletionRequestStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionEvent where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionEventIngestionSource where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionLearningModeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionObjectiveType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionProductAttributionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionProductReportBreakdownType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionProductReportGranularity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionProductReportLevel where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionProductReportingColumn where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionReportAttributionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionReportTimeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionTagType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ConversionTagTypeOptimal where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Country where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CreationSource where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CreativeAssetsVisibilityType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CreativeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Currency where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CustomerListStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CustomizableCTAType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DataOutputFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DataStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DeliveryEstimateObjectiveType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DisclosureType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DiscountStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AgeBucket where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AppTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AssetType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AssetType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'AssetType3 where
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

instance Arbitrary E'ContentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ContentType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ConversionReportTime where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'CreatedInLastNDays where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field10 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field11 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field12 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field13 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field14 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field7 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field8 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field9 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FromClaimedContent where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ItemResponseKind where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ItemResponseKind2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ItemResponseKind3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ItemResponseKind4 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ItemResponseKind5 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ItemResponseKind6 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ItemType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ItemType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Language where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MediaType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MediaType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'MediaType3 where
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

instance Arbitrary E'PartnerType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PinFormat where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'PromotionApplicationLevel where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReportStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReportType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReportType2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ReportType3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Severity where
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

instance Arbitrary E'StatusCode where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'SupplementalType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'TargetingStrategy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary EnhancedMatchStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary EntityLabelStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary EntityStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary EventProcessingStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FilterOperatorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FormFactor where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FreqBidMultiplierTimeWindow where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FrequencyGoalMetadataTimerange where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Gender where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GenderBucket where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Granularity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GridClickType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary HttpMethod where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary IneligibleProductTagReason where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary IngestionSource where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary IngestionSourceOptions where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary IntegrationLogEventType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary IntegrationLogLevel where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary IntendedPromotionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary InterestsEnum where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary InviteFilterStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary InviteStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary InviteType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ItemAvailability where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ItemProcessingStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LabelParentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LabelStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LabelStatusBulkUpdate where
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

instance Arbitrary MMMReportGranularity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MMMReportLevel where
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

instance Arbitrary MetricsReportingTemplateType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MobileAppPlatform where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ModelContentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MsotEventName where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MultiPinsAnalyticsMetricTypesItem where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NetworkType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NonDraftEntityStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NonNullableCatalogsCurrency where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NullableCatalogsItemFieldType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NullableCurrency where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NullableEntityStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NullableLabelStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NullableLabelType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NullablePartnerType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NullalbleMatchType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary NumericFilterOperatorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ObjectiveType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OperationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OptimizationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Order where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderLinePaidType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderLineStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OsFamily where
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

instance Arbitrary PinFilter where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PinPromotionSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PinType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PinnerListType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PinterestLibPaginationOrder where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PlacementGroupType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PlacementTrafficType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PlacementType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PreferredMediaType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PrimarySort where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ProductAvailability where
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

instance Arbitrary ProductCondition where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ProductGroupPromotionCustomizableCTAType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ProductGroupSummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PromotionApplicationLevel where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PromotionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PublicTargetingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary QueryLabelEntityStatusesItems where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary QueryLabelTypesItems where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary QuerymetrictypesItems where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary QuerypinanalyticsmetrictypesItems where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary QueryvideopinmetrictypesItems where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReportType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReportingColumn where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReportingColumnAsync where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReportingColumnSync where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReportingTimeZone where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary Role where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary SSIOOrderLineType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ScheduleAction where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ScheduleStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ScheduleType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary SourcePlatformOptions where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary StandardPinMetricTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary SummaryStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary SupplementalItemBatchOperationStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary SupplementalItemProcessingStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingAdvertiserCountry where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingSpecAgeBucket where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingSpecAppType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingSpecGender where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingSpecListOperation where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingSpecTargetingStrategyItems where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingStrategy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TargetingTemplateStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TieBreakerType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TokenGrantType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TokenTypeHint where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TopPinsSortBy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TopVideoPinsSortBy where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TrendType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TrendsAgeBucket where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TrendsGender where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TrendsGenderFilter where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TrendsL1Interest where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TrendsSupportedRegion where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UpdateMaskBidOptionField where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UpdateMaskFieldType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UserAccountType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UserFollowingFeedType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UserListOperationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary UserListType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary VerticalProductCategory where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary VideoPinMetricTypes where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary WebsiteVerificationMethod where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary WorkloadState where
  arbitrary = arbitraryBoundedEnum

