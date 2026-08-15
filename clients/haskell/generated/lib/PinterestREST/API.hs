{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module PinterestREST.API
  ( -- * Client and Server
    Config(..)
  , PinterestRESTBackend(..)
  , createPinterestRESTClient
  , runPinterestRESTServer
  , runPinterestRESTMiddlewareServer
  , runPinterestRESTClient
  , runPinterestRESTClientWithManager
  , callPinterestREST
  , PinterestRESTClient
  , PinterestRESTClientError(..)
  -- ** Servant
  , PinterestRESTAPI
  -- ** Plain WAI Application
  , serverWaiApplicationPinterestREST
  -- ** Authentication
  , PinterestRESTAuth(..)
  , clientAuth
  , Protected
  ) where

import           PinterestREST.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import qualified Data.Aeson                         as Aeson
import           Data.ByteString                    (ByteString)
import qualified Data.ByteString.Lazy               as BSL
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Set                           (Set)
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import qualified Data.Text.Encoding                 as T
import           Data.Time
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import           Network.Wai                        (Middleware, Request, requestHeaders)
import qualified Network.Wai.Handler.Warp           as Warp
import           Network.Wai.Middleware.HttpAuth    (extractBearerAuth)
import           Network.Wai.Middleware.HttpAuth    (extractBasicAuth)
import           Servant                            (ServerError, serveWithContextT, throwError)
import           Servant.API                        hiding (addHeader)
import           Servant.API.BasicAuth              (BasicAuthData (..))
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.API.Experimental.Auth      (AuthProtect)
import           Servant.Client                     (ClientEnv, Scheme (Http), ClientError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost, AuthClientData, AuthenticatedRequest, addHeader, mkAuthenticatedRequest, AuthClientData, AuthenticatedRequest, addHeader, mkAuthenticatedRequest, basicAuthReq, AuthClientData, AuthenticatedRequest, addHeader, mkAuthenticatedRequest, AuthClientData, AuthenticatedRequest, addHeader, mkAuthenticatedRequest)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..), Application, Context ((:.), EmptyContext))
import           Servant.Server.Experimental.Auth   (AuthHandler, AuthServerData, mkAuthHandler)
import           Servant.Server.StaticFiles         (serveDirectoryFileServer)
import           Web.FormUrlEncoded
import           Web.HttpApiData



data FormOauthToken = FormOauthToken
  { oauthTokenGrantType :: Text
  } deriving (Show, Eq, Generic, Data)

instance FromForm FormOauthToken
instance ToForm FormOauthToken

data FormTokenRevoke = FormTokenRevoke
  { tokenRevokeToken :: Text
  , tokenRevokeTokenTypeHint :: Text
  } deriving (Show, Eq, Generic, Data)

instance FromForm FormTokenRevoke
instance ToForm FormTokenRevoke


-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList

newtype JSONQueryParam a = JSONQueryParam
  { fromJsonQueryParam :: a
  } deriving (Functor, Foldable, Traversable)

instance Aeson.ToJSON a => ToHttpApiData (JSONQueryParam a) where
  toQueryParam = T.decodeUtf8 . BSL.toStrict . Aeson.encode . fromJsonQueryParam

instance Aeson.FromJSON a => FromHttpApiData (JSONQueryParam a) where
  parseQueryParam = either (Left . T.pack) (Right . JSONQueryParam) . Aeson.eitherDecodeStrict . T.encodeUtf8


-- | Servant type-level API, generated from the OpenAPI spec for PinterestREST.
type PinterestRESTAPI
    =    Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "analytics" :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "columns" (QueryList 'CommaSeparated (Text)) :> QueryParam "granularity" Granularity :> QueryParam "click_window_days" Int :> QueryParam "engagement_window_days" Int :> QueryParam "view_window_days" Int :> QueryParam "conversion_report_time" Text :> QueryParam "reporting_timezone" ReportingTimeZone :> Verb 'GET 200 '[JSON] [AdAccountAnalyticsResponseInner] -- 'adAccount/analytics' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "targeting_analytics" :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "targeting_types" (QueryList 'CommaSeparated (AdsAnalyticsTargetingType)) :> QueryParam "columns" (QueryList 'CommaSeparated (Text)) :> QueryParam "granularity" Granularity :> QueryParam "click_window_days" Int :> QueryParam "engagement_window_days" Int :> QueryParam "view_window_days" Int :> QueryParam "conversion_report_time" Text :> QueryParam "attribution_types" (QueryList 'CommaSeparated (ConversionReportAttributionType)) :> QueryParam "reporting_timezone" ReportingTimeZone :> Verb 'GET 200 '[JSON] MetricsResponse -- 'adAccountTargetingAnalytics/get' route
    :<|> Protected :> "ad_accounts" :> ReqBody '[JSON] AdAccountCreate :> Verb 'POST 200 '[JSON] AdAccount -- 'adAccounts/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> Verb 'GET 200 '[JSON] AdAccount -- 'adAccounts/get' route
    :<|> Protected :> "ad_accounts" :> QueryParam "include_shared_accounts" Bool :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] AdAccountsList200Response -- 'adAccounts/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "reports" :> "brand_category_sku" :> ReqBody '[JSON] ConversionProductReportRequest :> Verb 'POST 200 '[JSON] AdsAnalyticsCreateAsyncResponse -- 'analytics/createConversionProductReport' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "mmm_reports" :> ReqBody '[JSON] CreateMMMReportRequest :> Verb 'POST 200 '[JSON] CreateMMMReportResponse -- 'analytics/createMmmReport' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "reports" :> ReqBody '[JSON] AdsAnalyticsCreateAsyncRequest :> Verb 'POST 200 '[JSON] AdsAnalyticsCreateAsyncResponse -- 'analytics/createReport' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "templates" :> Capture "template_id" Text :> "reports" :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "granularity" Granularity :> Verb 'POST 200 '[JSON] TemplateBasedReport -- 'analytics/createTemplateReport' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "reports" :> "brand_category_sku" :> QueryParam "token" Text :> Verb 'GET 200 '[JSON] AdsAnalyticsGetAsyncResponse -- 'analytics/getConversionProductReport' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "mmm_reports" :> QueryParam "token" Text :> Verb 'GET 200 '[JSON] GetMMMReportResponse -- 'analytics/getMmmReport' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "reports" :> QueryParam "token" Text :> Verb 'GET 200 '[JSON] AdsAnalyticsGetAsyncResponse -- 'analytics/getReport' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "sandbox" :> Verb 'DELETE 200 '[JSON] Text -- 'sandbox/delete' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "templates" :> QueryParam "page_size" Int :> QueryParam "order" Text :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] TemplatesList200Response -- 'templates/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ad_groups" :> "analytics" :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "ad_group_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "columns" (QueryList 'CommaSeparated (Text)) :> QueryParam "granularity" Granularity :> QueryParam "click_window_days" Int :> QueryParam "engagement_window_days" Int :> QueryParam "view_window_days" Int :> QueryParam "conversion_report_time" Text :> QueryParam "aggregate_report_rows" Bool :> QueryParam "reporting_timezone" ReportingTimeZone :> Verb 'GET 200 '[JSON] [AdGroupsAnalyticsResponseInner] -- 'adGroups/analytics' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ad_groups" :> "audience_sizing" :> ReqBody '[JSON] AdGroupAudienceSizingRequest :> Verb 'POST 200 '[JSON] AdGroupAudienceSizingResponse -- 'adGroups/audienceSizing' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ad_groups" :> ReqBody '[JSON] [AdGroupCreateRequest] :> Verb 'POST 200 '[JSON] AdGroupArrayResponse -- 'adGroups/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ad_groups" :> Capture "ad_group_id" Text :> Verb 'GET 200 '[JSON] AdGroupResponse -- 'adGroups/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ad_groups" :> QueryParam "campaign_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "ad_group_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "entity_statuses" (QueryList 'MultiParamArray (Text)) :> QueryParam "page_size" Int :> QueryParam "order" Text :> QueryParam "bookmark" Text :> QueryParam "translate_interests_to_names" Bool :> Verb 'GET 200 '[JSON] AdGroupsList200Response -- 'adGroups/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ad_groups" :> ReqBody '[JSON] [AdGroupUpdateRequest] :> Verb 'PATCH 200 '[JSON] AdGroupArrayResponse -- 'adGroups/update' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "bid_floor" :> ReqBody '[JSON] BidFloorRequest :> Verb 'POST 200 '[JSON] BidFloor -- 'adGroupsBidFloor/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ad_groups" :> "targeting_analytics" :> QueryParam "ad_group_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "targeting_types" (QueryList 'CommaSeparated (AdsAnalyticsAdGroupTargetingType)) :> QueryParam "columns" (QueryList 'CommaSeparated (Text)) :> QueryParam "granularity" Granularity :> QueryParam "click_window_days" Int :> QueryParam "engagement_window_days" Int :> QueryParam "view_window_days" Int :> QueryParam "conversion_report_time" Text :> QueryParam "attribution_types" (QueryList 'CommaSeparated (ConversionReportAttributionType)) :> QueryParam "reporting_timezone" ReportingTimeZone :> Verb 'GET 200 '[JSON] MetricsResponse -- 'adGroupsTargetingAnalytics/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ad_previews" :> ReqBody '[JSON] AdPreviewRequest :> Verb 'POST 200 '[JSON] AdPreviewURLResponse -- 'adPreviews/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ads" :> "targeting_analytics" :> QueryParam "ad_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "targeting_types" (QueryList 'CommaSeparated (AdsAnalyticsAdTargetingType)) :> QueryParam "columns" (QueryList 'CommaSeparated (Text)) :> QueryParam "granularity" Granularity :> QueryParam "click_window_days" Int :> QueryParam "engagement_window_days" Int :> QueryParam "view_window_days" Int :> QueryParam "conversion_report_time" Text :> QueryParam "attribution_types" (QueryList 'CommaSeparated (ConversionReportAttributionType)) :> QueryParam "reporting_timezone" ReportingTimeZone :> Verb 'GET 200 '[JSON] MetricsResponse -- 'adTargetingAnalytics/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ads" :> "analytics" :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "ad_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "columns" (QueryList 'CommaSeparated (Text)) :> QueryParam "granularity" Granularity :> QueryParam "click_window_days" Int :> QueryParam "engagement_window_days" Int :> QueryParam "view_window_days" Int :> QueryParam "conversion_report_time" Text :> QueryParam "pin_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "campaign_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "reporting_timezone" ReportingTimeZone :> Verb 'GET 200 '[JSON] [AdsAnalyticsResponseInner] -- 'ads/analytics' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ads" :> ReqBody '[JSON] [AdCreateRequest] :> Verb 'POST 200 '[JSON] AdArrayResponse -- 'ads/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ads" :> Capture "ad_id" Text :> Verb 'GET 200 '[JSON] AdResponse -- 'ads/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ads" :> QueryParam "campaign_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "ad_group_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "ad_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "entity_statuses" (QueryList 'MultiParamArray (Text)) :> QueryParam "page_size" Int :> QueryParam "order" Text :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] AdsList200Response -- 'ads/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ads" :> ReqBody '[JSON] [AdUpdateRequest] :> Verb 'PATCH 200 '[JSON] AdArrayResponse -- 'ads/update' route
    :<|> Protected :> "advanced_auction" :> "items" :> "get" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] AdvancedAuctionItemsGetRequest :> Verb 'POST 200 '[JSON] AdvancedAuctionItems -- 'advancedAuctionItemsGet/post' route
    :<|> Protected :> "advanced_auction" :> "items" :> "submit" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] AdvancedAuctionItemsSubmitRequest :> Verb 'POST 200 '[JSON] AdvancedAuctionProcessedItems -- 'advancedAuctionItemsSubmit/post' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "audience_insights" :> QueryParam "audience_insight_type" AudienceInsightType :> Verb 'GET 200 '[JSON] AudienceInsightsResponse -- 'audienceInsights/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "insights" :> "audiences" :> Verb 'GET 200 '[JSON] AudienceDefinitionResponse -- 'audienceInsightsScopeAndType/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "audiences" :> "shared" :> "accounts" :> QueryParam "audience_id" Text :> QueryParam "account_type" AudienceAccountType :> QueryParam "page_size" Int :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] AdAccountsAudiencesSharedAccountsList200Response -- 'adAccountsAudiencesSharedAccounts/list' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "audiences" :> "shared" :> "accounts" :> QueryParam "audience_id" Text :> QueryParam "account_type" AudienceAccountType :> QueryParam "page_size" Int :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] AdAccountsAudiencesSharedAccountsList200Response -- 'businessAccountAudiencesSharedAccounts/list' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "audiences" :> QueryParam "bookmark" Text :> QueryParam "order" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] AudiencesList200Response -- 'sharedAudiencesForBusiness/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "audiences" :> "ad_accounts" :> "shared" :> ReqBody '[JSON] SharedAudience :> Verb 'PATCH 200 '[JSON] SharedAudienceResponse -- 'updateAdAccountToAdAccountSharedAudience' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "audiences" :> "businesses" :> "shared" :> ReqBody '[JSON] BusinessSharedAudience :> Verb 'PATCH 200 '[JSON] BusinessSharedAudienceResponse -- 'updateAdAccountToBusinessSharedAudience' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "audiences" :> "ad_accounts" :> "shared" :> ReqBody '[JSON] SharedAudience :> Verb 'PATCH 200 '[JSON] SharedAudienceResponse -- 'updateBusinessToAdAccountSharedAudience' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "audiences" :> "businesses" :> "shared" :> ReqBody '[JSON] BusinessSharedAudience :> Verb 'PATCH 200 '[JSON] BusinessSharedAudienceResponse -- 'updateBusinessToBusinessSharedAudience' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "audiences" :> ReqBody '[JSON] AudienceCreateRequest :> Verb 'POST 200 '[JSON] Audience -- 'audiences/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "audiences" :> Capture "audience_id" Text :> Verb 'GET 200 '[JSON] Audience -- 'audiences/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "audiences" :> QueryParam "bookmark" Text :> QueryParam "order" Text :> QueryParam "page_size" Int :> QueryParam "ownership_type" Text :> Verb 'GET 200 '[JSON] AudiencesList200Response -- 'audiences/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "audiences" :> Capture "audience_id" Text :> ReqBody '[JSON] AudienceUpdateRequest :> Verb 'PATCH 200 '[JSON] Audience -- 'audiences/update' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ads_credit" :> "redeem" :> ReqBody '[JSON] AdsCreditRedeemRequest :> Verb 'POST 200 '[JSON] AdsCreditRedeemResponse -- 'adsCredit/redeem' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ads_credit" :> "discounts" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] AdsCreditsDiscountsGet200Response -- 'adsCreditsDiscounts/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "billing_invoice" :> Capture "billing_invoice_id" Text :> "download" :> Verb 'GET 200 '[JSON] BillingInvoiceDownloadResponse -- 'billingInvoiceDownload/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "billing_invoices" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "sort" Text :> QueryParam "order" Text :> QueryParam "status" Text :> QueryParam "document_type" Text :> QueryParam "start_due_date" Day :> QueryParam "end_due_date" Day :> Verb 'GET 200 '[JSON] BillingInvoicesGet200Response -- 'billingInvoices/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "billing_profiles" :> QueryParam "is_active" Bool :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] BillingProfilesGet200Response -- 'billingProfiles/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ssio" :> "accounts" :> Verb 'GET 200 '[JSON] SSIOAccountResponse -- 'ssioAccounts/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ssio" :> "insertion_orders" :> ReqBody '[JSON] SSIOCreateInsertionOrderRequest :> Verb 'POST 200 '[JSON] SSIOCreateInsertionOrderResponse -- 'ssioInsertionOrder/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ssio" :> "insertion_orders" :> ReqBody '[JSON] SSIOEditInsertionOrderRequest :> Verb 'PATCH 200 '[JSON] SSIOEditInsertionOrderResponse -- 'ssioInsertionOrder/edit' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ssio" :> "insertion_orders" :> "status" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] SsioInsertionOrdersStatusGetByAdAccount200Response -- 'ssioInsertionOrdersStatus/getByAdAccount' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ssio" :> "insertion_orders" :> Capture "pin_order_id" Text :> "status" :> Verb 'GET 200 '[JSON] SSIOInsertionOrderStatusResponse -- 'ssioInsertionOrdersStatus/getByPinOrderId' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "ssio" :> "order_lines" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "pin_order_id" Text :> Verb 'GET 200 '[JSON] SsioOrderLinesGetByAdAccount200Response -- 'ssioOrderLines/getByAdAccount' route
    :<|> Protected :> "boards" :> Capture "board_id" Text :> "sections" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] BoardSection :> Verb 'POST 201 '[JSON] BoardSection -- 'boardSections/create' route
    :<|> Protected :> "boards" :> Capture "board_id" Text :> "sections" :> Capture "section_id" Text :> QueryParam "ad_account_id" Text :> Verb 'DELETE 204 '[JSON] NoContent -- 'boardSections/delete' route
    :<|> Protected :> "boards" :> Capture "board_id" Text :> "sections" :> QueryParam "ad_account_id" Text :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] BoardSectionsList200Response -- 'boardSections/list' route
    :<|> Protected :> "boards" :> Capture "board_id" Text :> "sections" :> Capture "section_id" Text :> "pins" :> QueryParam "ad_account_id" Text :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] BoardsListPins200Response -- 'boardSections/listPins' route
    :<|> Protected :> "boards" :> Capture "board_id" Text :> "sections" :> Capture "section_id" Text :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] BoardSection :> Verb 'PATCH 200 '[JSON] BoardSection -- 'boardSections/update' route
    :<|> Protected :> "boards" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] BoardCreate :> Verb 'POST 200 '[JSON] Board -- 'boards/create' route
    :<|> Protected :> "boards" :> Capture "board_id" Text :> QueryParam "ad_account_id" Text :> Verb 'DELETE 204 '[JSON] NoContent -- 'boards/delete' route
    :<|> Protected :> "boards" :> Capture "board_id" Text :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] Board -- 'boards/get' route
    :<|> Protected :> "boards" :> QueryParam "ad_account_id" Text :> QueryParam "privacy" BoardPrivacyFilter :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] BoardsList200Response -- 'boards/list' route
    :<|> Protected :> "boards" :> Capture "board_id" Text :> "pins" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "creative_types" (QueryList 'MultiParamArray (CreativeType)) :> QueryParam "ad_account_id" Text :> QueryParam "pin_metrics" Bool :> Verb 'GET 200 '[JSON] BoardsListPins200Response -- 'boards/listPins' route
    :<|> Protected :> "boards" :> Capture "board_id" Text :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] BoardWithUpdatePrivacyUpdate :> Verb 'PATCH 200 '[JSON] BoardWithUpdatePrivacy -- 'boards/update' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "bulk" :> "download" :> ReqBody '[JSON] BulkDownloadRequest :> Verb 'POST 200 '[JSON] BulkDownloadResponse -- 'bulkDownload/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "bulk" :> Capture "bulk_request_id" Text :> QueryParam "include_details" Bool :> Verb 'GET 200 '[JSON] BulkUpsertStatusResponse -- 'bulkRequest/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "bulk" :> "upsert" :> ReqBody '[JSON] BulkUpsertRequest :> Verb 'POST 200 '[JSON] BulkUpsertResponse -- 'bulkUpsert/create' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "asset_groups" :> ReqBody '[JSON] CreateAssetGroupBody :> Verb 'POST 200 '[JSON] CreateAssetGroupResponse -- 'assetGroup/create' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "asset_groups" :> ReqBody '[JSON] DeleteAssetGroupBody :> Verb 'DELETE 200 '[JSON] DeleteAssetGroupResponse -- 'assetGroup/delete' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "asset_groups" :> ReqBody '[JSON] UpdateAssetGroupBody :> Verb 'PATCH 200 '[JSON] UpdateAssetGroupResponse -- 'assetGroup/update' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "assets" :> Capture "asset_id" Text :> "members" :> QueryParam "fetch_system_users" Bool :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "start_index" Int :> Verb 'GET 200 '[JSON] BusinessAssetMembersGet200Response -- 'businessAssetMembers/get' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "assets" :> Capture "asset_id" Text :> "partners" :> QueryParam "start_index" Int :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] BusinessAssetPartnersGet200Response -- 'businessAssetPartners/get' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "assets" :> QueryParam "permissions" (QueryList 'MultiParamArray (PermissionsWithOwner)) :> QueryParam "child_asset_id" Text :> QueryParam "asset_group_id" Text :> QueryParam "asset_type" Text :> QueryParam "start_index" Int :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] BusinessAssetsGet200Response -- 'businessAssets/get' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "members" :> Capture "member_id" Text :> "assets" :> QueryParam "asset_type" Text :> QueryParam "start_index" Int :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] BusinessMemberAssetsGet200Response -- 'businessMemberAssets/get' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "members" :> "assets" :> "access" :> ReqBody '[JSON] BusinessMembersAssetAccessDeleteRequest :> Verb 'DELETE 200 '[JSON] DeleteMemberAccessResultsResponseArray -- 'businessMembersAssetAccess/delete' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "members" :> "assets" :> "access" :> ReqBody '[JSON] UpdateMemberAssetAccessBody :> Verb 'PATCH 200 '[JSON] UpdateMemberAssetsResultsResponseArray -- 'businessMembersAssetAccess/update' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "partners" :> Capture "partner_id" Text :> "assets" :> QueryParam "partner_type" PartnerType :> QueryParam "asset_type" Text :> QueryParam "start_index" Int :> QueryParam "page_size" Int :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] BusinessPartnerAssetAccessGet200Response -- 'businessPartnerAssetAccess/get' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "partners" :> "assets" :> ReqBody '[JSON] DeletePartnerAssetAccessBody :> Verb 'DELETE 200 '[JSON] DeletePartnerAssetsResultsResponseArray -- 'deletePartnerAssetAccessHandlerImpl' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "partners" :> "assets" :> ReqBody '[JSON] UpdatePartnerAssetAccessBody :> Verb 'PATCH 200 '[JSON] UpdatePartnerAssetsResultsResponseArray -- 'updatePartnerAssetAccessHandlerImpl' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "requests" :> "assets" :> "access" :> ReqBody '[JSON] CreateAssetAccessRequestBody :> Verb 'POST 200 '[JSON] CreateAssetAccessRequestResponse -- 'assetAccessRequests/create' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "invites" :> ReqBody '[JSON] CancelInvitesBody :> Verb 'DELETE 200 '[JSON] DeleteInvitesResultsResponseArray -- 'cancelInvitesOrRequests' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "invites" :> "assets" :> "access" :> ReqBody '[JSON] CreateAssetInvitesRequest :> Verb 'POST 200 '[JSON] UpdateInvitesResultsResponseArray -- 'createAssetInvites' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "invites" :> ReqBody '[JSON] CreateMembershipOrPartnershipInvitesBody :> Verb 'POST 200 '[JSON] CreateInvitesResultsResponseArray -- 'createMembershipOrPartnershipInvites' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "invites" :> QueryParam "is_member" Bool :> QueryParam "invite_status" (QueryList 'MultiParamArray (Text)) :> QueryParam "invite_type" InviteType :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] GetInvites200Response -- 'get/invites' route
    :<|> Protected :> "businesses" :> "invites" :> ReqBody '[JSON] AuthRespondInvitesBody :> Verb 'PATCH 200 '[JSON] RespondToInvitesResponseArray -- 'respondBusinessAccessInvites' route
    :<|> Protected :> "business_access" :> "business_hierarchy" :> Capture "business_hierarchy_id" Text :> "brand_accounts" :> ReqBody '[JSON] BrandAccountsCreateRequest :> Verb 'POST 200 '[JSON] BrandAccountsCreate200Response -- 'brandAccounts/create' route
    :<|> Protected :> "business_access" :> "business_hierarchy" :> Capture "business_hierarchy_id" Text :> "brand_accounts" :> Capture "brand_account_id" Text :> ReqBody '[JSON] BrandAccountsUpdateRequest :> Verb 'PATCH 200 '[JSON] BrandAccountsCreate200Response -- 'brandAccounts/update' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "members" :> ReqBody '[JSON] MembersToDeleteBody :> Verb 'DELETE 200 '[JSON] DeletedMembersResponse -- 'deleteBusinessMembership' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "partners" :> ReqBody '[JSON] DeletePartnersRequest :> Verb 'DELETE 200 '[JSON] DeletePartnersResponse -- 'deleteBusinessPartners' route
    :<|> Protected :> "businesses" :> "employers" :> QueryParam "page_size" Int :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] GetBusinessEmployers200Response -- 'get/businessEmployers' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "members" :> QueryParam "fetch_system_users" Bool :> QueryParam "assets_summary" Bool :> QueryParam "business_roles" (QueryList 'MultiParamArray (MemberBusinessRole)) :> QueryParam "member_ids" Text :> QueryParam "start_index" Int :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] GetBusinessMembers200Response -- 'get/businessMembers' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "partners" :> QueryParam "assets_summary" Bool :> QueryParam "partner_type" PartnerType :> QueryParam "partner_ids" Text :> QueryParam "start_index" Int :> QueryParam "page_size" Int :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] GetBusinessPartners200Response -- 'get/businessPartners' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "system_users" :> Capture "system_user_id" Text :> ReqBody '[JSON] SystemUserUpdateRequest :> Verb 'PATCH 200 '[JSON] NoContent -- 'systemUser/update' route
    :<|> Protected :> "businesses" :> Capture "business_id" Text :> "members" :> ReqBody '[JSON] [UpdateMemberBusinessRoleBody] :> Verb 'PATCH 200 '[JSON] UpdateMemberResultsResponseArray -- 'update/businessMemberships' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "pins" :> "analytics" :> QueryParam "campaign_id" Text :> QueryParam "pin_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "columns" (QueryList 'CommaSeparated (Text)) :> QueryParam "granularity" Granularity :> QueryParam "click_window_days" Int :> QueryParam "engagement_window_days" Int :> QueryParam "view_window_days" Int :> QueryParam "conversion_report_time" Text :> Verb 'GET 200 '[JSON] [AdPinAnalytics] -- 'adPins/analytics' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "campaigns" :> "targeting_analytics" :> QueryParam "campaign_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "targeting_types" (QueryList 'CommaSeparated (AdsAnalyticsCampaignTargetingType)) :> QueryParam "columns" (QueryList 'CommaSeparated (Text)) :> QueryParam "granularity" Granularity :> QueryParam "click_window_days" Int :> QueryParam "engagement_window_days" Int :> QueryParam "view_window_days" Int :> QueryParam "conversion_report_time" Text :> QueryParam "attribution_types" (QueryList 'CommaSeparated (ConversionReportAttributionType)) :> QueryParam "reporting_timezone" ReportingTimeZone :> Verb 'GET 200 '[JSON] MetricsResponse -- 'campaignTargetingAnalytics/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "campaigns" :> "analytics" :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "campaign_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "columns" (QueryList 'CommaSeparated (Text)) :> QueryParam "granularity" Granularity :> QueryParam "click_window_days" Int :> QueryParam "engagement_window_days" Int :> QueryParam "view_window_days" Int :> QueryParam "conversion_report_time" Text :> QueryParam "aggregate_report_rows" Bool :> QueryParam "reporting_timezone" ReportingTimeZone :> Verb 'GET 200 '[JSON] [CampaignsAnalyticsResponseInner] -- 'campaigns/analytics' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "campaigns" :> ReqBody '[JSON] [CampaignCreateRequest] :> Verb 'POST 200 '[JSON] CampaignCreateResponse -- 'campaigns/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "campaigns" :> Capture "campaign_id" Text :> Verb 'GET 200 '[JSON] CampaignResponse -- 'campaigns/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "campaigns" :> QueryParam "campaign_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "entity_statuses" (QueryList 'MultiParamArray (Text)) :> QueryParam "page_size" Int :> QueryParam "order" Text :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] CampaignsList200Response -- 'campaigns/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "campaigns" :> ReqBody '[JSON] [CampaignUpdateRequest] :> Verb 'PATCH 200 '[JSON] CampaignUpdateResponse -- 'campaigns/update' route
    :<|> Protected :> "catalogs" :> "feeds" :> Capture "feed_id" Text :> "processing_results" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] FeedProcessingResultsList200Response -- 'feedProcessingResults/list' route
    :<|> Protected :> "catalogs" :> "feeds" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] FeedsCreateRequest :> Verb 'POST 201 '[JSON] CatalogsFeed -- 'feeds/create' route
    :<|> Protected :> "catalogs" :> "feeds" :> Capture "feed_id" Text :> QueryParam "ad_account_id" Text :> Verb 'DELETE 204 '[JSON] NoContent -- 'feeds/delete' route
    :<|> Protected :> "catalogs" :> "feeds" :> Capture "feed_id" Text :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] CatalogsFeed -- 'feeds/get' route
    :<|> Protected :> "catalogs" :> "feeds" :> Capture "feed_id" Text :> "ingest" :> QueryParam "ad_account_id" Text :> Verb 'POST 200 '[JSON] CatalogsFeedIngestion -- 'feeds/ingest' route
    :<|> Protected :> "catalogs" :> "feeds" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "catalog_id" Text :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] FeedsList200Response -- 'feeds/list' route
    :<|> Protected :> "catalogs" :> "feeds" :> Capture "feed_id" Text :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] FeedsUpdateRequest :> Verb 'PATCH 200 '[JSON] CatalogsFeed -- 'feeds/update' route
    :<|> Protected :> "catalogs" :> "processing_results" :> Capture "processing_result_id" Text :> "item_issues" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "item_numbers" (QueryList 'MultiParamArray (Int)) :> QueryParam "item_validation_issue" CatalogsItemValidationIssue :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] ItemsIssuesList200Response -- 'itemsIssues/list' route
    :<|> Protected :> "catalogs" :> "items" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] CatalogsItemsRequest :> Verb 'POST 200 '[JSON] CatalogsItems -- 'items/post' route
    :<|> Protected :> "catalogs" :> "items" :> "batch" :> Capture "batch_id" Text :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] CatalogsItemsBatch -- 'itemsBatch/get' route
    :<|> Protected :> "catalogs" :> "items" :> "batch" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] ItemsBatchPostRequest :> Verb 'POST 200 '[JSON] CatalogsItemsBatch -- 'itemsBatch/post' route
    :<|> Protected :> "catalogs" :> "product_groups" :> Capture "product_group_id" Text :> "products" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "ad_account_id" Text :> QueryParam "pin_metrics" Bool :> Verb 'GET 200 '[JSON] CatalogsProductGroupPinsList200Response -- 'catalogsProductGroupPins/list' route
    :<|> Protected :> "catalogs" :> "product_groups" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] MultipleProductGroupsInner :> Verb 'POST 201 '[JSON] CatalogsVerticalProductGroup -- 'catalogsProductGroups/create' route
    :<|> Protected :> "catalogs" :> "product_groups" :> "multiple" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] [MultipleProductGroupsInner] :> Verb 'POST 201 '[JSON] [Text] -- 'catalogsProductGroups/createMany' route
    :<|> Protected :> "catalogs" :> "product_groups" :> Capture "product_group_id" Text :> QueryParam "ad_account_id" Text :> Verb 'DELETE 204 '[JSON] NoContent -- 'catalogsProductGroups/delete' route
    :<|> Protected :> "catalogs" :> "product_groups" :> "multiple" :> QueryParam "id" (QueryList 'CommaSeparated (Int)) :> QueryParam "ad_account_id" Text :> Verb 'DELETE 204 '[JSON] NoContent -- 'catalogsProductGroups/deleteMany' route
    :<|> Protected :> "catalogs" :> "product_groups" :> Capture "product_group_id" Text :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] CatalogsVerticalProductGroup -- 'catalogsProductGroups/get' route
    :<|> Protected :> "catalogs" :> "product_groups" :> QueryParam "id" (QueryList 'CommaSeparated (Int)) :> QueryParam "feed_id" Text :> QueryParam "catalog_id" Text :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] CatalogsProductGroupsList200Response -- 'catalogsProductGroups/list' route
    :<|> Protected :> "catalogs" :> "product_groups" :> Capture "product_group_id" Text :> "product_counts" :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] CatalogsProductGroupProductCountsVertical -- 'catalogsProductGroups/productCountsGet' route
    :<|> Protected :> "catalogs" :> "product_groups" :> Capture "product_group_id" Text :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] CatalogsProductGroupsUpdateRequest :> Verb 'PATCH 200 '[JSON] CatalogsVerticalProductGroup -- 'catalogsProductGroups/update' route
    :<|> Protected :> "catalogs" :> "products" :> "get_by_product_group_filters" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "ad_account_id" Text :> QueryParam "pin_metrics" Bool :> ReqBody '[JSON] CatalogsListProductsByFilterRequest :> Verb 'POST 200 '[JSON] CatalogsProductGroupPinsList200Response -- 'productsByProductGroupFilter/list' route
    :<|> Protected :> "catalogs" :> "reports" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] CatalogsReportParameters :> Verb 'POST 200 '[JSON] CatalogsCreateReportResponse -- 'reports/create' route
    :<|> Protected :> "catalogs" :> "reports" :> QueryParam "ad_account_id" Text :> QueryParam "token" Text :> Verb 'GET 200 '[JSON] CatalogsReport -- 'reports/get' route
    :<|> Protected :> "catalogs" :> "reports" :> "stats" :> QueryParam "ad_account_id" Text :> QueryParam "page_size" Int :> QueryParam "bookmark" Text :> QueryParam "parameters" ReportsStatsParametersParameter :> Verb 'GET 200 '[JSON] ReportsStats200Response -- 'reports/stats' route
    :<|> Protected :> "catalogs" :> "available_filter_values" :> QueryParam "catalog_id" Text :> QueryParam "feed_id" Text :> QueryParam "country" Country :> QueryParam "language" CatalogsLocale :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] CatalogsAvailableFilterValues -- 'catalogs/availableFilterValues' route
    :<|> Protected :> "catalogs" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] CatalogsCreateRequest :> Verb 'POST 200 '[JSON] Catalog -- 'catalogs/create' route
    :<|> Protected :> "catalogs" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] CatalogsList200Response -- 'catalogs/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "conversion_eqs" :> QueryParam "lookback_period" LookbackPeriodOptions :> QueryParam "source_platform" SourcePlatformOptions :> QueryParam "ingestion_source" IngestionSourceOptions :> Verb 'GET 200 '[JSON] [EventQualityScore] -- 'conversionEqs/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "events" :> QueryParam "test" Bool :> ReqBody '[JSON] ConversionEvents :> Verb 'POST 200 '[JSON] ConversionApiResponse -- 'events/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "conversion_tags" :> ReqBody '[JSON] ConversionTagCreate :> Verb 'POST 200 '[JSON] ConversionTag -- 'conversionTags/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "conversion_tags" :> Capture "conversion_tag_id" Text :> Verb 'GET 200 '[JSON] ConversionTag -- 'conversionTags/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "conversion_tags" :> QueryParam "filter_deleted" Bool :> Verb 'GET 200 '[JSON] ConversionTagsList200Response -- 'conversionTags/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "conversion_tags" :> "ocpm_eligible" :> Verb 'GET 200 '[JSON] ((Map.Map String [ConversionEventResponse])) -- 'ocpmEligibleConversionTags/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "conversion_tags" :> "page_visit" :> QueryParam "page_size" Int :> QueryParam "order" Text :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] PageVisitConversionTagsGet200Response -- 'pageVisitConversionTags/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "advertiser_defined_events" :> Verb 'GET 200 '[JSON] AdvertiserDefinedEventsResponse -- 'advertiserDefinedEvents/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "customer_lists" :> Capture "customer_list_id" Text :> "uploads" :> ReqBody '[JSON] CustomerListUploadCreateRequest :> Verb 'POST 200 '[JSON] CustomerListUploadCreateResponse -- 'customerListUploads/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "customer_lists" :> Capture "customer_list_id" Text :> "uploads" :> Capture "customer_list_upload_id" Text :> Verb 'GET 200 '[JSON] CustomerListUploadResponse -- 'customerListUploads/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "customer_lists" :> Capture "customer_list_id" Text :> "uploads" :> Capture "customer_list_upload_id" Text :> "run" :> Verb 'POST 200 '[JSON] CustomerListUploadResponse -- 'customerListUploads/run' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "customer_lists" :> ReqBody '[JSON] CustomerListRequest :> Verb 'POST 200 '[JSON] CustomerList -- 'customerLists/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "customer_lists" :> Capture "customer_list_id" Text :> Verb 'GET 200 '[JSON] CustomerList -- 'customerLists/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "customer_lists" :> QueryParam "page_size" Int :> QueryParam "order" Text :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] CustomerListsList200Response -- 'customerLists/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "customer_lists" :> Capture "customer_list_id" Text :> ReqBody '[JSON] CustomerListUpdateRequest :> Verb 'PATCH 200 '[JSON] CustomerList -- 'customerLists/update' route
    :<|> Protected :> "integrations" :> Capture "id" Text :> Verb 'GET 200 '[JSON] IntegrationRecord -- 'integrations/getById' route
    :<|> Protected :> "integrations" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] IntegrationsGetList200Response -- 'integrations/getList' route
    :<|> Protected :> "integrations" :> "commerce" :> Capture "external_business_id" Text :> Verb 'DELETE 204 '[JSON] NoContent -- 'integrationsCommerce/del' route
    :<|> Protected :> "integrations" :> "commerce" :> Capture "external_business_id" Text :> Verb 'GET 200 '[JSON] IntegrationMetadata -- 'integrationsCommerce/get' route
    :<|> Protected :> "integrations" :> "commerce" :> Capture "external_business_id" Text :> ReqBody '[JSON] IntegrationRequestPatch :> Verb 'PATCH 200 '[JSON] IntegrationMetadata -- 'integrationsCommerce/patch' route
    :<|> Protected :> "integrations" :> "commerce" :> ReqBody '[JSON] IntegrationRequest :> Verb 'POST 200 '[JSON] IntegrationMetadata -- 'integrationsCommerce/post' route
    :<|> Protected :> "integrations" :> "logs" :> ReqBody '[JSON] IntegrationLogsRequest :> Verb 'POST 200 '[JSON] IntegrationLogsSuccessResponse -- 'integrationsLogs/post' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "keywords" :> "metrics" :> QueryParam "country_code" Text :> QueryParam "keywords" (QueryList 'CommaSeparated (Text)) :> Verb 'GET 200 '[JSON] KeywordsMetricsArrayResponse -- 'countryKeywordsMetrics/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "keywords" :> ReqBody '[JSON] KeywordsRequest :> Verb 'POST 200 '[JSON] KeywordsResponse -- 'keywords/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "keywords" :> QueryParam "campaign_id" Text :> QueryParam "ad_group_id" Text :> QueryParam "ad_group_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "match_types" (QueryList 'MultiParamArray (MatchType)) :> QueryParam "page_size" Int :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] KeywordsGet200Response -- 'keywords/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "keywords" :> ReqBody '[JSON] KeywordUpdateBody :> Verb 'PATCH 200 '[JSON] KeywordsResponse -- 'keywords/update' route
    :<|> Protected :> "trends" :> "keywords" :> Capture "region" TrendsSupportedRegion :> "top" :> Capture "trend_type" TrendType :> QueryParam "interests" (QueryList 'MultiParamArray (Text)) :> QueryParam "genders" (QueryList 'MultiParamArray (Text)) :> QueryParam "ages" (QueryList 'MultiParamArray (Text)) :> QueryParam "include_keywords" (QueryList 'MultiParamArray (Text)) :> QueryParam "normalize_against_group" Bool :> QueryParam "limit" Int :> QueryParam "include_prediction" Bool :> QueryParam "include_demographics" Bool :> Verb 'GET 200 '[JSON] TrendingKeywordsResponse -- 'trendingKeywords/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "labels" :> ReqBody '[JSON] LabelCreateRequest :> Verb 'POST 200 '[JSON] LabelsResponse -- 'labels/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "labels" :> QueryParam "campaign_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "label_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "entity_statuses" (QueryList 'MultiParamArray (Text)) :> QueryParam "label_types" (QueryList 'MultiParamArray (Text)) :> QueryParam "page_size" Int :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] LabelsList200Response -- 'labels/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "labels" :> ReqBody '[JSON] LabelUpdateRequest :> Verb 'PATCH 200 '[JSON] LabelsResponse -- 'labels/update' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "leads" :> "subscriptions" :> Capture "subscription_id" Text :> Verb 'DELETE 204 '[JSON] NoContent -- 'adAccountsSubscriptions/delById' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "leads" :> "subscriptions" :> Capture "subscription_id" Text :> Verb 'GET 200 '[JSON] LeadSubscription -- 'adAccountsSubscriptions/getById' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "leads" :> "subscriptions" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] AdAccountsSubscriptionsGetList200Response -- 'adAccountsSubscriptions/getList' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "leads" :> "subscriptions" :> ReqBody '[JSON] LeadSubscriptionPostParamsCreate :> Verb 'POST 200 '[JSON] LeadSubscription -- 'adAccountsSubscriptions/post' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "lead_forms" :> Capture "lead_form_id" Text :> Verb 'GET 200 '[JSON] LeadFormResponse -- 'leadForm/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "lead_forms" :> Capture "lead_form_id" Text :> "test" :> ReqBody '[JSON] LeadFormTestRequest :> Verb 'POST 200 '[JSON] LeadFormTestResponse -- 'leadFormTest/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "lead_forms" :> ReqBody '[JSON] [LeadFormCreateRequest] :> Verb 'POST 200 '[JSON] LeadFormArrayResponse -- 'leadForms/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "lead_forms" :> QueryParam "page_size" Int :> QueryParam "order" Text :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] LeadFormsList200Response -- 'leadForms/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "lead_forms" :> ReqBody '[JSON] [LeadFormUpdateRequest] :> Verb 'PATCH 200 '[JSON] LeadFormArrayResponse -- 'leadForms/update' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "leads_export" :> ReqBody '[JSON] LeadsExportCreateRequest :> Verb 'POST 200 '[JSON] LeadsExportCreateResponse -- 'leadsExport/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "leads_export" :> Capture "leads_export_id" Text :> Verb 'GET 200 '[JSON] LeadsExportResponseData -- 'leadsExport/get' route
    :<|> Protected :> "media" :> ReqBody '[JSON] MediaUploadCreate :> Verb 'POST 200 '[JSON] MediaUpload -- 'media/create' route
    :<|> Protected :> "media" :> Capture "media_id" Text :> Verb 'GET 200 '[JSON] Media -- 'media/get' route
    :<|> Protected :> "media" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] MediaList200Response -- 'media/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "msot" :> "events" :> ReqBody '[JSON] ConversionMSOTEvents :> Verb 'POST 200 '[JSON] NoContent -- 'msotEvents/create' route
    :<|> Protected :> "notifications" :> ReqBody '[JSON] NotificationPostRequest :> Verb 'POST 200 '[JSON] NotificationResponse -- 'notification/post' route
    :<|> Protected :> "oauth" :> "conversion_token" :> Verb 'POST 200 '[JSON] ConversionAccessTokenResponse -- 'oauth/conversionToken' route
    :<|> Protected :> "oauth" :> "token" :> ReqBody '[FormUrlEncoded] FormOauthToken :> Verb 'POST 200 '[JSON] OauthAccessTokenResponse -- 'oauth/token' route
    :<|> Protected :> "oauth" :> "token" :> "revoke" :> ReqBody '[FormUrlEncoded] FormTokenRevoke :> Verb 'POST 200 '[JSON] NoContent -- 'token/revoke' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "order_lines" :> Capture "order_line_id" Text :> Verb 'GET 200 '[JSON] OrderLine -- 'orderLines/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "order_lines" :> QueryParam "page_size" Int :> QueryParam "order" Text :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] OrderLinesList200Response -- 'orderLines/list' route
    :<|> Protected :> "pins" :> "analytics" :> QueryParam "pin_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "app_types" Text :> QueryParam "metric_types" (QueryList 'CommaSeparated (Text)) :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] ((Map.Map String Map)) -- 'multiPins/analytics' route
    :<|> Protected :> "pins" :> Capture "pin_id" Text :> "analytics" :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "app_types" Text :> QueryParam "metric_types" (QueryList 'CommaSeparated (Text)) :> QueryParam "split_field" Text :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] ((Map.Map String PinAnalyticsMetricsResponse)) -- 'pins/analytics' route
    :<|> Protected :> "pins" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] PinCreate :> Verb 'POST 200 '[JSON] Pin -- 'pins/create' route
    :<|> Protected :> "pins" :> Capture "pin_id" Text :> QueryParam "ad_account_id" Text :> Verb 'DELETE 204 '[JSON] NoContent -- 'pins/delete' route
    :<|> Protected :> "pins" :> Capture "pin_id" Text :> QueryParam "ad_account_id" Text :> QueryParam "pin_metrics" Bool :> Verb 'GET 200 '[JSON] Pin -- 'pins/get' route
    :<|> Protected :> "pins" :> QueryParam "pin_filter" Text :> QueryParam "pin_metrics" Bool :> QueryParam "include_protected_pins" Bool :> QueryParam "pin_type" Text :> QueryParam "creative_types" (QueryList 'MultiParamArray (CreativeType)) :> QueryParam "ad_account_id" Text :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] PinsList200Response -- 'pins/list' route
    :<|> Protected :> "pins" :> Capture "pin_id" Text :> "save" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] PinsSaveRequest :> Verb 'POST 201 '[JSON] Pin -- 'pins/save' route
    :<|> Protected :> "pins" :> Capture "pin_id" Text :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] PinUpdate :> Verb 'PATCH 200 '[JSON] Pin -- 'pins/update' route
    :<|> Protected :> "trends" :> "topics" :> "featured" :> QueryParam "interest" InterestsEnum :> QueryParam "region" ProductCategoryRegion :> Verb 'GET 200 '[JSON] [FeaturedTrend] -- 'trendsFeaturedTopics/list' route
    :<|> Protected :> "trends" :> "product_categories" :> "details" :> QueryParam "product_categories" (QueryList 'MultiParamArray (ProductCategoryEnum)) :> QueryParam "region" ProductCategoryRegion :> QueryParam "lookback_window" ProductCategoryDetailLookbackWindow :> QueryParam "engagement_type" ProductCategoriesEngagementType :> Verb 'GET 200 '[JSON] [ProductCategoryDetails] -- 'trendsProductCategoriesDetails/list' route
    :<|> Protected :> "trends" :> "product_categories" :> "trending" :> QueryParam "region" ProductCategoryRegion :> QueryParam "verticals" (QueryList 'MultiParamArray (VerticalProductCategory)) :> QueryParam "ages" (QueryList 'MultiParamArray (AgeTrendsBucket)) :> QueryParam "genders" (QueryList 'MultiParamArray (GenderBucket)) :> QueryParam "engagement_type" ProductCategoriesEngagementType :> Verb 'GET 200 '[JSON] [TrendingProductCategory] -- 'trendsProductCategoriesTrending/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "product_group_promotions" :> ReqBody '[JSON] ProductGroupPromotionCreateRequest :> Verb 'POST 200 '[JSON] ProductGroupPromotionResponse -- 'productGroupPromotions/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "product_group_promotions" :> Capture "product_group_promotion_id" Text :> Verb 'GET 200 '[JSON] ProductGroupPromotion -- 'productGroupPromotions/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "product_group_promotions" :> QueryParam "product_group_promotion_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "entity_statuses" (QueryList 'MultiParamArray (Text)) :> QueryParam "ad_group_id" Text :> QueryParam "page_size" Int :> QueryParam "order" Text :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] ProductGroupPromotionsList200Response -- 'productGroupPromotions/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "product_group_promotions" :> ReqBody '[JSON] ProductGroupPromotionUpdateRequest :> Verb 'PATCH 200 '[JSON] ProductGroupPromotionResponse -- 'productGroupPromotions/update' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "product_groups" :> "analytics" :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "product_group_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "columns" (QueryList 'CommaSeparated (Text)) :> QueryParam "granularity" Granularity :> QueryParam "click_window_days" Int :> QueryParam "engagement_window_days" Int :> QueryParam "view_window_days" Int :> QueryParam "conversion_report_time" Text :> QueryParam "reporting_timezone" ReportingTimeZone :> Verb 'GET 200 '[JSON] [ProductGroupAnalyticsResponseInner] -- 'productGroups/analytics' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "promotions" :> ReqBody '[JSON] [PromotionCreateRequest] :> Verb 'POST 200 '[JSON] PromotionsResponse -- 'promotions/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "promotions" :> Capture "promotion_id" Text :> Verb 'DELETE 204 '[JSON] NoContent -- 'promotions/delete' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "promotions" :> Capture "promotion_id" Text :> Verb 'GET 200 '[JSON] PromotionResponse -- 'promotions/get' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "promotions" :> QueryParam "page_size" Int :> QueryParam "order" Text :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] PromotionsList200Response -- 'promotions/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "promotions" :> ReqBody '[JSON] [PromotionUpdateRequest] :> Verb 'PATCH 200 '[JSON] PromotionsResponse -- 'promotions/update' route
    :<|> Protected :> "resources" :> "ad_account_countries" :> Verb 'GET 200 '[JSON] AdAccountsCountryResponse -- 'adAccountCountries/get' route
    :<|> Protected :> "resources" :> "delivery_metrics" :> QueryParam "report_type" Text :> Verb 'GET 200 '[JSON] DeliveryMetricsResponse -- 'deliveryMetrics/get' route
    :<|> Protected :> "resources" :> "targeting" :> "interests" :> Capture "interest_id" Text :> Verb 'GET 200 '[JSON] SingleInterestTargetingOptionResponse -- 'interestTargetingOptions/get' route
    :<|> Protected :> "resources" :> "lead_form_questions" :> Verb 'GET 200 '[JSON] NoContent -- 'leadFormQuestions/get' route
    :<|> Protected :> "resources" :> "metrics_ready_state" :> QueryParam "date" Text :> Verb 'GET 200 '[JSON] BookClosedResponse -- 'metricsReadyState/get' route
    :<|> Protected :> "resources" :> "targeting" :> Capture "targeting_type" Text :> QueryParam "client_id" Text :> QueryParam "oauth_signature" Text :> QueryParam "timestamp" Text :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] [Value] -- 'targetingOptions/get' route
    :<|> Protected :> "search" :> "partner" :> "pins" :> QueryParam "term" Text :> QueryParam "country_code" Text :> QueryParam "bookmark" Text :> QueryParam "locale" Text :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] SearchPartnerPins200Response -- 'searchPartnerPins' route
    :<|> Protected :> "search" :> "boards" :> QueryParam "ad_account_id" Text :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "query" Text :> Verb 'GET 200 '[JSON] SearchUserBoardsGet200Response -- 'searchUserBoards/get' route
    :<|> Protected :> "search" :> "pins" :> QueryParam "ad_account_id" Text :> QueryParam "query" Text :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] SearchUserPinsList200Response -- 'searchUserPins/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "targeting_templates" :> ReqBody '[JSON] TargetingTemplateCreate :> Verb 'POST 200 '[JSON] TargetingTemplateGetResponseData -- 'targetingTemplate/create' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "targeting_templates" :> QueryParam "order" Text :> QueryParam "include_sizing" Bool :> QueryParam "search_query" Text :> QueryParam "page_size" Int :> QueryParam "bookmark" Text :> Verb 'GET 200 '[JSON] TargetingTemplateList200Response -- 'targetingTemplate/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "targeting_templates" :> ReqBody '[JSON] TargetingTemplateUpdateRequest :> Verb 'PATCH 200 '[JSON] NoContent -- 'targetingTemplate/update' route
    :<|> Protected :> "terms" :> "related" :> QueryParam "terms" (QueryList 'MultiParamArray (Text)) :> Verb 'GET 200 '[JSON] RelatedTerms -- 'termsRelated/list' route
    :<|> Protected :> "terms" :> "suggested" :> QueryParam "term" Text :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [Text] -- 'termsSuggested/list' route
    :<|> Protected :> "ad_accounts" :> Capture "ad_account_id" Text :> "terms_of_service" :> QueryParam "include_html" Bool :> QueryParam "tos_type" Text :> Verb 'GET 200 '[JSON] TermsOfService -- 'termsOfService/get' route
    :<|> Protected :> "user_account" :> "following" :> "boards" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "explicit_following" Bool :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] BoardsUserFollowsList200Response -- 'boardsUserFollows/list' route
    :<|> Protected :> "user_account" :> "following" :> Capture "username" Text :> ReqBody '[JSON] FollowUserRequest :> Verb 'POST 200 '[JSON] UserSummary -- 'followUser/update' route
    :<|> Protected :> "user_account" :> "followers" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] FollowersList200Response -- 'followers/list' route
    :<|> Protected :> "user_account" :> "businesses" :> Verb 'GET 200 '[JSON] [LinkedBusiness] -- 'linkedBusinessAccounts/get' route
    :<|> Protected :> "user_account" :> "websites" :> QueryParam "website" Text :> Verb 'DELETE 204 '[JSON] NoContent -- 'unverifyWebsite/delete' route
    :<|> Protected :> "user_account" :> "analytics" :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "from_claimed_content" Text :> QueryParam "pin_format" Text :> QueryParam "app_types" Text :> QueryParam "content_type" Text :> QueryParam "source" Text :> QueryParam "metric_types" (QueryList 'CommaSeparated (Text)) :> QueryParam "split_field" Text :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] ((Map.Map String AnalyticsMetricsResponse)) -- 'userAccount/analytics' route
    :<|> Protected :> "user_account" :> "analytics" :> "top_pins" :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "sort_by" Text :> QueryParam "from_claimed_content" Text :> QueryParam "pin_format" Text :> QueryParam "app_types" Text :> QueryParam "content_type" Text :> QueryParam "source" Text :> QueryParam "metric_types" (QueryList 'CommaSeparated (Text)) :> QueryParam "num_of_pins" Int :> QueryParam "created_in_last_n_days" Int :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] TopPinsAnalyticsResponse -- 'userAccount/analytics/topPins' route
    :<|> Protected :> "user_account" :> "analytics" :> "top_video_pins" :> QueryParam "start_date" Day :> QueryParam "end_date" Day :> QueryParam "sort_by" Text :> QueryParam "from_claimed_content" Text :> QueryParam "pin_format" Text :> QueryParam "app_types" Text :> QueryParam "content_type" Text :> QueryParam "source" Text :> QueryParam "metric_types" (QueryList 'CommaSeparated (Text)) :> QueryParam "num_of_pins" Int :> QueryParam "created_in_last_n_days" Int :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] TopVideoPinsAnalyticsResponse -- 'userAccount/analytics/topVideoPins' route
    :<|> Protected :> "users" :> Capture "username" Text :> "interests" :> "follow" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] UserAccountFollowedInterests200Response -- 'userAccount/followedInterests' route
    :<|> Protected :> "user_account" :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] Account -- 'userAccount/get' route
    :<|> Protected :> "user_account" :> "following" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> QueryParam "feed_type" UserFollowingFeedType :> QueryParam "explicit_following" Bool :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] UserFollowingGet200Response -- 'userFollowing/get' route
    :<|> Protected :> "user_account" :> "websites" :> QueryParam "bookmark" Text :> QueryParam "page_size" Int :> Verb 'GET 200 '[JSON] UserWebsitesGet200Response -- 'userWebsites/get' route
    :<|> Protected :> "user_account" :> "websites" :> QueryParam "ad_account_id" Text :> ReqBody '[JSON] UserWebsiteVerifyRequest :> Verb 'POST 200 '[JSON] UserWebsiteSummary -- 'verifyWebsite/update' route
    :<|> Protected :> "user_account" :> "websites" :> "verification" :> QueryParam "ad_account_id" Text :> Verb 'GET 200 '[JSON] UserWebsiteVerificationCode -- 'websiteVerification/get' route
    :<|> Raw


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype PinterestRESTClientError = PinterestRESTClientError ClientError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for PinterestREST.
-- The backend can be used both for the client and the server. The client generated from the PinterestREST OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createPinterestRESTClient@). Alternatively, provided
-- a backend, the API can be served using @runPinterestRESTMiddlewareServer@.
data PinterestRESTBackend a m = PinterestRESTBackend
  { adAccount/analytics :: a -> Text -> Maybe Day -> Maybe Day -> Maybe [Text] -> Maybe Granularity -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe ReportingTimeZone -> m [AdAccountAnalyticsResponseInner]{- ^ Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time. -}
  , adAccountTargetingAnalytics/get :: a -> Text -> Maybe Day -> Maybe Day -> Maybe [AdsAnalyticsTargetingType] -> Maybe [Text] -> Maybe Granularity -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [ConversionReportAttributionType] -> Maybe ReportingTimeZone -> m MetricsResponse{- ^ Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. -}
  , adAccounts/create :: a -> AdAccountCreate -> m AdAccount{- ^ Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account). -}
  , adAccounts/get :: a -> Text -> m AdAccount{- ^ Get an ad account -}
  , adAccounts/list :: a -> Maybe Bool -> Maybe Text -> Maybe Int -> m AdAccountsList200Response{- ^ Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts). -}
  , analytics/createConversionProductReport :: a -> Text -> ConversionProductReportRequest -> m AdsAnalyticsCreateAsyncResponse{- ^ <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready. -}
  , analytics/createMmmReport :: a -> Text -> CreateMMMReportRequest -> m CreateMMMReportResponse{- ^ This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release. -}
  , analytics/createReport :: a -> Text -> AdsAnalyticsCreateAsyncRequest -> m AdsAnalyticsCreateAsyncResponse{- ^ This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either. -}
  , analytics/createTemplateReport :: a -> Text -> Text -> Maybe Day -> Maybe Day -> Maybe Granularity -> m TemplateBasedReport{- ^    This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready. -}
  , analytics/getConversionProductReport :: a -> Text -> Maybe Text -> m AdsAnalyticsGetAsyncResponse{- ^ <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint. -}
  , analytics/getMmmReport :: a -> Text -> Maybe Text -> m GetMMMReportResponse{- ^ Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint. -}
  , analytics/getReport :: a -> Text -> Maybe Text -> m AdsAnalyticsGetAsyncResponse{- ^ This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. -}
  , sandbox/delete :: a -> Text -> m Text{- ^ Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information. -}
  , templates/list :: a -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> m TemplatesList200Response{- ^ Gets all Templates associated with an ad account ID. -}
  , adGroups/analytics :: a -> Text -> Maybe Day -> Maybe Day -> Maybe [Text] -> Maybe [Text] -> Maybe Granularity -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe ReportingTimeZone -> m [AdGroupsAnalyticsResponseInner]{- ^ Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. -}
  , adGroups/audienceSizing :: a -> Text -> AdGroupAudienceSizingRequest -> m AdGroupAudienceSizingResponse{- ^ Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. -}
  , adGroups/create :: a -> Text -> [AdGroupCreateRequest] -> m AdGroupArrayResponse{- ^ Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>. <strong>Notes:</strong> - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">closed beta</a> access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.  -}
  , adGroups/get :: a -> Text -> Text -> m AdGroupResponse{- ^ Get a specific ad group given the ad group ID. -}
  , adGroups/list :: a -> Text -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Bool -> m AdGroupsList200Response{- ^ List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both. -}
  , adGroups/update :: a -> Text -> [AdGroupUpdateRequest] -> m AdGroupArrayResponse{- ^ Update multiple existing ad groups. -}
  , adGroupsBidFloor/get :: a -> Text -> BidFloorRequest -> m BidFloor{- ^ List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>. -}
  , adGroupsTargetingAnalytics/get :: a -> Text -> Maybe [Text] -> Maybe Day -> Maybe Day -> Maybe [AdsAnalyticsAdGroupTargetingType] -> Maybe [Text] -> Maybe Granularity -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [ConversionReportAttributionType] -> Maybe ReportingTimeZone -> m MetricsResponse{- ^ Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. -}
  , adPreviews/create :: a -> Text -> AdPreviewRequest -> m AdPreviewURLResponse{- ^ Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.  Creating ad preview from catalog product group is currently in BETA and is not available to all users. -}
  , adTargetingAnalytics/get :: a -> Text -> Maybe [Text] -> Maybe Day -> Maybe Day -> Maybe [AdsAnalyticsAdTargetingType] -> Maybe [Text] -> Maybe Granularity -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [ConversionReportAttributionType] -> Maybe ReportingTimeZone -> m MetricsResponse{- ^ Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. -}
  , ads/analytics :: a -> Text -> Maybe Day -> Maybe Day -> Maybe [Text] -> Maybe [Text] -> Maybe Granularity -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [Text] -> Maybe [Text] -> Maybe ReportingTimeZone -> m [AdsAnalyticsResponseInner]{- ^ Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. -}
  , ads/create :: a -> Text -> [AdCreateRequest] -> m AdArrayResponse{- ^ Create multiple new ads. Request must contain `ad_group_id`, `creative_type`, and the source Pin `pin_id`. -}
  , ads/get :: a -> Text -> Text -> m AdResponse{- ^ Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>. -}
  , ads/list :: a -> Text -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> Maybe Text -> m AdsList200Response{- ^ List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>. -}
  , ads/update :: a -> Text -> [AdUpdateRequest] -> m AdArrayResponse{- ^ Update multiple existing ads -}
  , advancedAuctionItemsGet/post :: a -> Maybe Text -> AdvancedAuctionItemsGetRequest -> m AdvancedAuctionItems{- ^ Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users. -}
  , advancedAuctionItemsSubmit/post :: a -> Maybe Text -> AdvancedAuctionItemsSubmitRequest -> m AdvancedAuctionProcessedItems{- ^ This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users. -}
  , audienceInsights/get :: a -> Text -> Maybe AudienceInsightType -> m AudienceInsightsResponse{- ^ Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>. -}
  , audienceInsightsScopeAndType/get :: a -> Text -> m AudienceDefinitionResponse{- ^ Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience. -}
  , adAccountsAudiencesSharedAccounts/list :: a -> Text -> Maybe Text -> Maybe AudienceAccountType -> Maybe Int -> Maybe Text -> m AdAccountsAudiencesSharedAccountsList200Response{- ^ List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account. -}
  , businessAccountAudiencesSharedAccounts/list :: a -> Text -> Maybe Text -> Maybe AudienceAccountType -> Maybe Int -> Maybe Text -> m AdAccountsAudiencesSharedAccountsList200Response{- ^ List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned. -}
  , sharedAudiencesForBusiness/list :: a -> Text -> Maybe Text -> Maybe Text -> Maybe Int -> m AudiencesList200Response{- ^ Get a list of received audiences for the given business. -}
  , updateAdAccountToAdAccountSharedAudience :: a -> Text -> SharedAudience -> m SharedAudienceResponse{- ^ From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>. -}
  , updateAdAccountToBusinessSharedAudience :: a -> Text -> BusinessSharedAudience -> m BusinessSharedAudienceResponse{- ^ From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>. -}
  , updateBusinessToAdAccountSharedAudience :: a -> Text -> SharedAudience -> m SharedAudienceResponse{- ^ From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>. -}
  , updateBusinessToBusinessSharedAudience :: a -> Text -> BusinessSharedAudience -> m BusinessSharedAudienceResponse{- ^ From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>. -}
  , audiences/create :: a -> Text -> AudienceCreateRequest -> m Audience{- ^ Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific `audience_ids` when you create an ad group. <p/> Learn about <a href=\"/docs/work-with-targets-and-audiences/create-audiences/\" target=\"_blank\">creating different kinds of audiences</a>. -}
  , audiences/get :: a -> Text -> Text -> m Audience{- ^ Get a specific audience given the audience ID. -}
  , audiences/list :: a -> Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> m AudiencesList200Response{- ^ Get list of audiences for the ad account. -}
  , audiences/update :: a -> Text -> Text -> AudienceUpdateRequest -> m Audience{- ^ Update (edit or remove) an existing targeting audience. -}
  , adsCredit/redeem :: a -> Text -> AdsCreditRedeemRequest -> m AdsCreditRedeemResponse{- ^ Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong> -}
  , adsCreditsDiscounts/get :: a -> Text -> Maybe Text -> Maybe Int -> m AdsCreditsDiscountsGet200Response{- ^ Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong> -}
  , billingInvoiceDownload/get :: a -> Text -> Text -> m BillingInvoiceDownloadResponse{- ^ Get download url for a billing invoice. -}
  , billingInvoices/get :: a -> Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Day -> Maybe Day -> m BillingInvoicesGet200Response{- ^ Get billing invoices in the advertiser account. -}
  , billingProfiles/get :: a -> Text -> Maybe Bool -> Maybe Text -> Maybe Int -> m BillingProfilesGet200Response{- ^ Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong> -}
  , ssioAccounts/get :: a -> Text -> m SSIOAccountResponse{- ^ Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign. -}
  , ssioInsertionOrder/create :: a -> Text -> SSIOCreateInsertionOrderRequest -> m SSIOCreateInsertionOrderResponse{- ^ Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign. -}
  , ssioInsertionOrder/edit :: a -> Text -> SSIOEditInsertionOrderRequest -> m SSIOEditInsertionOrderResponse{- ^ Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign. -}
  , ssioInsertionOrdersStatus/getByAdAccount :: a -> Text -> Maybe Text -> Maybe Int -> m SsioInsertionOrdersStatusGetByAdAccount200Response{- ^ Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign. -}
  , ssioInsertionOrdersStatus/getByPinOrderId :: a -> Text -> Text -> m SSIOInsertionOrderStatusResponse{- ^ Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign. -}
  , ssioOrderLines/getByAdAccount :: a -> Text -> Maybe Text -> Maybe Int -> Maybe Text -> m SsioOrderLinesGetByAdAccount200Response{- ^ Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign. -}
  , boardSections/create :: a -> Text -> Maybe Text -> BoardSection -> m BoardSection{- ^ Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. -}
  , boardSections/delete :: a -> Text -> Text -> Maybe Text -> m NoContent{- ^ Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. -}
  , boardSections/list :: a -> Text -> Maybe Text -> Maybe Text -> Maybe Int -> m BoardSectionsList200Response{- ^ Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. -}
  , boardSections/listPins :: a -> Text -> Text -> Maybe Text -> Maybe Text -> Maybe Int -> m BoardsListPins200Response{- ^ Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. -}
  , boardSections/update :: a -> Text -> Text -> Maybe Text -> BoardSection -> m BoardSection{- ^ Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. -}
  , boards/create :: a -> Maybe Text -> BoardCreate -> m Board{- ^ Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account. -}
  , boards/delete :: a -> Text -> Maybe Text -> m NoContent{- ^ Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account. -}
  , boards/get :: a -> Text -> Maybe Text -> m Board{- ^ Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account. -}
  , boards/list :: a -> Maybe Text -> Maybe BoardPrivacyFilter -> Maybe Text -> Maybe Int -> m BoardsList200Response{- ^ Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned. -}
  , boards/listPins :: a -> Text -> Maybe Text -> Maybe Int -> Maybe [CreativeType] -> Maybe Text -> Maybe Bool -> m BoardsListPins200Response{- ^ Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. -}
  , boards/update :: a -> Text -> Maybe Text -> BoardWithUpdatePrivacyUpdate -> m BoardWithUpdatePrivacy{- ^ Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account. -}
  , bulkDownload/create :: a -> Text -> BulkDownloadRequest -> m BulkDownloadResponse{- ^ Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data. -}
  , bulkRequest/get :: a -> Text -> Text -> Maybe Bool -> m BulkUpsertStatusResponse{- ^ Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords). -}
  , bulkUpsert/create :: a -> Text -> BulkUpsertRequest -> m BulkUpsertResponse{- ^ Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request. -}
  , assetGroup/create :: a -> Text -> CreateAssetGroupBody -> m CreateAssetGroupResponse{- ^ Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts. -}
  , assetGroup/delete :: a -> Text -> DeleteAssetGroupBody -> m DeleteAssetGroupResponse{- ^ Delete a batch of asset groups. -}
  , assetGroup/update :: a -> Text -> UpdateAssetGroupBody -> m UpdateAssetGroupResponse{- ^ Update a batch of asset groups with the specified parameters. -}
  , businessAssetMembers/get :: a -> Text -> Text -> Maybe Bool -> Maybe Text -> Maybe Int -> Maybe Int -> m BusinessAssetMembersGet200Response{- ^ Get all the members the requesting business has granted access to on the given asset. -}
  , businessAssetPartners/get :: a -> Text -> Text -> Maybe Int -> Maybe Text -> Maybe Int -> m BusinessAssetPartnersGet200Response{- ^ Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner. -}
  , businessAssets/get :: a -> Text -> Maybe [PermissionsWithOwner] -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Int -> m BusinessAssetsGet200Response{- ^ Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships. -}
  , businessMemberAssets/get :: a -> Text -> Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Int -> m BusinessMemberAssetsGet200Response{- ^ Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type. -}
  , businessMembersAssetAccess/delete :: a -> Text -> BusinessMembersAssetAccessDeleteRequest -> m DeleteMemberAccessResultsResponseArray{- ^ Terminate multiple members' access to an asset. -}
  , businessMembersAssetAccess/update :: a -> Text -> UpdateMemberAssetAccessBody -> m UpdateMemberAssetsResultsResponseArray{- ^ Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.  -}
  , businessPartnerAssetAccess/get :: a -> Text -> Text -> Maybe PartnerType -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Text -> m BusinessPartnerAssetAccessGet200Response{- ^ Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to. -}
  , deletePartnerAssetAccessHandlerImpl :: a -> Text -> DeletePartnerAssetAccessBody -> m DeletePartnerAssetsResultsResponseArray{- ^ Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets. -}
  , updatePartnerAssetAccessHandlerImpl :: a -> Text -> UpdatePartnerAssetAccessBody -> m UpdatePartnerAssetsResultsResponseArray{- ^ Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. -}
  , assetAccessRequests/create :: a -> Text -> CreateAssetAccessRequestBody -> m CreateAssetAccessRequestResponse{- ^ Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles. -}
  , cancelInvitesOrRequests :: a -> Text -> CancelInvitesBody -> m DeleteInvitesResultsResponseArray{- ^ Cancel membership/partnership invites and/or requests. -}
  , createAssetInvites :: a -> Text -> CreateAssetInvitesRequest -> m UpdateInvitesResultsResponseArray{- ^ Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview. -}
  , createMembershipOrPartnershipInvites :: a -> Text -> CreateMembershipOrPartnershipInvitesBody -> m CreateInvitesResultsResponseArray{- ^ Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners -}
  , get/invites :: a -> Text -> Maybe Bool -> Maybe [Text] -> Maybe InviteType -> Maybe Text -> Maybe Int -> m GetInvites200Response{- ^ Get the membership/partnership invites and/or requests for the authorized user. -}
  , respondBusinessAccessInvites :: a -> AuthRespondInvitesBody -> m RespondToInvitesResponseArray{- ^ Accept or decline invites or requests. -}
  , brandAccounts/create :: a -> Text -> BrandAccountsCreateRequest -> m BrandAccountsCreate200Response{- ^ Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country. -}
  , brandAccounts/update :: a -> Text -> Text -> BrandAccountsUpdateRequest -> m BrandAccountsCreate200Response{- ^ Update an existing Brand Account -}
  , deleteBusinessMembership :: a -> Text -> MembersToDeleteBody -> m DeletedMembersResponse{- ^ Terminate memberships between the specified members and your business. -}
  , deleteBusinessPartners :: a -> Text -> DeletePartnersRequest -> m DeletePartnersResponse{- ^ Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type. -}
  , get/businessEmployers :: a -> Maybe Int -> Maybe Text -> m GetBusinessEmployers200Response{- ^ Get all of the viewing user's business employers. -}
  , get/businessMembers :: a -> Text -> Maybe Bool -> Maybe Bool -> Maybe [MemberBusinessRole] -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Int -> m GetBusinessMembers200Response{- ^ Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE -}
  , get/businessPartners :: a -> Text -> Maybe Bool -> Maybe PartnerType -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Text -> m GetBusinessPartners200Response{- ^ Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to. -}
  , systemUser/update :: a -> Text -> Text -> SystemUserUpdateRequest -> m NoContent{- ^ Update a system user information such as name. -}
  , update/businessMemberships :: a -> Text -> [UpdateMemberBusinessRoleBody] -> m UpdateMemberResultsResponseArray{- ^ Update a member's business role within the business. -}
  , adPins/analytics :: a -> Text -> Maybe Text -> Maybe [Text] -> Maybe Day -> Maybe Day -> Maybe [Text] -> Maybe Granularity -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> m [AdPinAnalytics]{- ^ Get analytics for the pins given a campaign and pins in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics. -}
  , campaignTargetingAnalytics/get :: a -> Text -> Maybe [Text] -> Maybe Day -> Maybe Day -> Maybe [AdsAnalyticsCampaignTargetingType] -> Maybe [Text] -> Maybe Granularity -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [ConversionReportAttributionType] -> Maybe ReportingTimeZone -> m MetricsResponse{- ^ Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. -}
  , campaigns/analytics :: a -> Text -> Maybe Day -> Maybe Day -> Maybe [Text] -> Maybe [Text] -> Maybe Granularity -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe ReportingTimeZone -> m [CampaignsAnalyticsResponseInner]{- ^ Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. -}
  , campaigns/create :: a -> Text -> [CampaignCreateRequest] -> m CampaignCreateResponse{- ^ Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> -}
  , campaigns/get :: a -> Text -> Text -> m CampaignResponse{- ^ Get a specific campaign given the campaign ID. -}
  , campaigns/list :: a -> Text -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> Maybe Text -> m CampaignsList200Response{- ^ Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. -}
  , campaigns/update :: a -> Text -> [CampaignUpdateRequest] -> m CampaignUpdateResponse{- ^ <p>Update multiple ad campaigns based on campaign_ids. </p> <p><strong>Note:</strong></p> - <p>The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> -}
  , feedProcessingResults/list :: a -> Text -> Maybe Text -> Maybe Int -> Maybe Text -> m FeedProcessingResultsList200Response{- ^ Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a> -}
  , feeds/create :: a -> Maybe Text -> FeedsCreateRequest -> m CatalogsFeed{- ^ Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. -}
  , feeds/delete :: a -> Text -> Maybe Text -> m NoContent{- ^ Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>. -}
  , feeds/get :: a -> Text -> Maybe Text -> m CatalogsFeed{- ^ Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>. -}
  , feeds/ingest :: a -> Text -> Maybe Text -> m CatalogsFeedIngestion{- ^ Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager. -}
  , feeds/list :: a -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> m FeedsList200Response{- ^ Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>. -}
  , feeds/update :: a -> Text -> Maybe Text -> FeedsUpdateRequest -> m CatalogsFeed{- ^ Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. -}
  , itemsIssues/list :: a -> Text -> Maybe Text -> Maybe Int -> Maybe [Int] -> Maybe CatalogsItemValidationIssue -> Maybe Text -> m ItemsIssuesList200Response{- ^ List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a> and <a href='/docs/api/v5/#operation/reports/get'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.  <a href='/docs/api-features/shopping-overview/'>Learn more</a> -}
  , items/post :: a -> Maybe Text -> CatalogsItemsRequest -> m CatalogsItems{- ^ Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. -}
  , itemsBatch/get :: a -> Text -> Maybe Text -> m CatalogsItemsBatch{- ^ Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. -}
  , itemsBatch/post :: a -> Maybe Text -> ItemsBatchPostRequest -> m CatalogsItemsBatch{- ^ This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance. -}
  , catalogsProductGroupPins/list :: a -> Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Bool -> m CatalogsProductGroupPinsList200Response{- ^ Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a> -}
  , catalogsProductGroups/create :: a -> Maybe Text -> MultipleProductGroupsInner -> m CatalogsVerticalProductGroup{- ^ Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. -}
  , catalogsProductGroups/createMany :: a -> Maybe Text -> [MultipleProductGroupsInner] -> m [Text]{- ^ Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. -}
  , catalogsProductGroups/delete :: a -> Text -> Maybe Text -> m NoContent{- ^ Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a> -}
  , catalogsProductGroups/deleteMany :: a -> Maybe [Int] -> Maybe Text -> m NoContent{- ^ Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a> -}
  , catalogsProductGroups/get :: a -> Text -> Maybe Text -> m CatalogsVerticalProductGroup{- ^ Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a> -}
  , catalogsProductGroups/list :: a -> Maybe [Int] -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> m CatalogsProductGroupsList200Response{- ^ Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a> -}
  , catalogsProductGroups/productCountsGet :: a -> Text -> Maybe Text -> m CatalogsProductGroupProductCountsVertical{- ^ Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a> -}
  , catalogsProductGroups/update :: a -> Text -> Maybe Text -> CatalogsProductGroupsUpdateRequest -> m CatalogsVerticalProductGroup{- ^ Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. -}
  , productsByProductGroupFilter/list :: a -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Bool -> CatalogsListProductsByFilterRequest -> m CatalogsProductGroupPinsList200Response{- ^ List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href='/docs/api-features/shopping-overview/'>Learn more</a> -}
  , reports/create :: a -> Maybe Text -> CatalogsReportParameters -> m CatalogsCreateReportResponse{- ^ Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager. -}
  , reports/get :: a -> Maybe Text -> Maybe Text -> m CatalogsReport{- ^ This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. -}
  , reports/stats :: a -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe ReportsStatsParametersParameter -> m ReportsStats200Response{- ^ List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. -}
  , catalogs/availableFilterValues :: a -> Maybe Text -> Maybe Text -> Maybe Country -> Maybe CatalogsLocale -> Maybe Text -> m CatalogsAvailableFilterValues{- ^ Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - <code>country</code>, <code>language</code>, and <code>feed_id</code> are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a> -}
  , catalogs/create :: a -> Maybe Text -> CatalogsCreateRequest -> m Catalog{- ^ Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. -}
  , catalogs/list :: a -> Maybe Text -> Maybe Int -> Maybe Text -> m CatalogsList200Response{- ^ Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a> -}
  , conversionEqs/list :: a -> Text -> Maybe LookbackPeriodOptions -> Maybe SourcePlatformOptions -> Maybe IngestionSourceOptions -> m [EventQualityScore]{- ^ Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user. -}
  , events/create :: a -> Text -> Maybe Bool -> ConversionEvents -> m ConversionApiResponse{- ^ The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/api-features/conversion-overview/\">Conversions Guide</a> for more details. (Note that the authorization header required is <code>Authorization: Bearer &lt;access_token&gt;</code>). - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.) -}
  , conversionTags/create :: a -> Text -> ConversionTagCreate -> m ConversionTag{- ^ Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match) -}
  , conversionTags/get :: a -> Text -> Text -> m ConversionTag{- ^ Get information about an existing conversion tag. -}
  , conversionTags/list :: a -> Text -> Maybe Bool -> m ConversionTagsList200Response{- ^ List conversion tags associated with an ad account. -}
  , ocpmEligibleConversionTags/get :: a -> Text -> m ((Map.Map String [ConversionEventResponse])){- ^ Get Ocpm eligible conversion tag events for an ad account. -}
  , pageVisitConversionTags/get :: a -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> m PageVisitConversionTagsGet200Response{- ^ Get all page visit conversion tag events for an ad account. -}
  , advertiserDefinedEvents/get :: a -> Text -> m AdvertiserDefinedEventsResponse{- ^ <p>Get advertiser defined events for the given ad account.</p> -}
  , customerListUploads/create :: a -> Text -> Text -> CustomerListUploadCreateRequest -> m CustomerListUploadCreateResponse{- ^ <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p> -}
  , customerListUploads/get :: a -> Text -> Text -> Text -> m CustomerListUploadResponse{- ^ <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p> -}
  , customerListUploads/run :: a -> Text -> Text -> Text -> m CustomerListUploadResponse{- ^ <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p> -}
  , customerLists/create :: a -> Text -> CustomerListRequest -> m CustomerList{- ^ <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the <a href=\"https://developer.pinterest.com/docs/api/v5/audiences-create\" target=\"blank\">create audience endpoint</a>.</p> -}
  , customerLists/get :: a -> Text -> Text -> m CustomerList{- ^ Gets a specific customer list given the customer list ID. -}
  , customerLists/list :: a -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> m CustomerListsList200Response{- ^ <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p> -}
  , customerLists/update :: a -> Text -> Text -> CustomerListUpdateRequest -> m CustomerList{- ^ <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p> -}
  , integrations/getById :: a -> Text -> m IntegrationRecord{- ^ Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager. -}
  , integrations/getList :: a -> Maybe Text -> Maybe Int -> m IntegrationsGetList200Response{- ^ Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager. -}
  , integrationsCommerce/del :: a -> Text -> m NoContent{- ^ Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager. -}
  , integrationsCommerce/get :: a -> Text -> m IntegrationMetadata{- ^ Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager. -}
  , integrationsCommerce/patch :: a -> Text -> IntegrationRequestPatch -> m IntegrationMetadata{- ^ Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager. -}
  , integrationsCommerce/post :: a -> IntegrationRequest -> m IntegrationMetadata{- ^ Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager. -}
  , integrationsLogs/post :: a -> IntegrationLogsRequest -> m IntegrationLogsSuccessResponse{- ^ This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager. -}
  , countryKeywordsMetrics/get :: a -> Text -> Maybe Text -> Maybe [Text] -> m KeywordsMetricsArrayResponse{- ^ See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>). -}
  , keywords/create :: a -> Text -> KeywordsRequest -> m KeywordsResponse{- ^ <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/reference/rate-limits/\">WRITE</a>.</p> -}
  , keywords/get :: a -> Text -> Maybe Text -> Maybe Text -> Maybe [Text] -> Maybe [MatchType] -> Maybe Int -> Maybe Text -> m KeywordsGet200Response{- ^ <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> -}
  , keywords/update :: a -> Text -> KeywordUpdateBody -> m KeywordsResponse{- ^ <p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p> -}
  , trendingKeywords/list :: a -> TrendsSupportedRegion -> TrendType -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe Bool -> Maybe Int -> Maybe Bool -> Maybe Bool -> m TrendingKeywordsResponse{- ^ <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.  -}
  , labels/create :: a -> Text -> LabelCreateRequest -> m LabelsResponse{- ^ <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p> -}
  , labels/list :: a -> Text -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> m LabelsList200Response{- ^ <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p> -}
  , labels/update :: a -> Text -> LabelUpdateRequest -> m LabelsResponse{- ^ <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p> -}
  , adAccountsSubscriptions/delById :: a -> Text -> Text -> m NoContent{- ^ Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.' -}
  , adAccountsSubscriptions/getById :: a -> Text -> Text -> m LeadSubscription{- ^ Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.' -}
  , adAccountsSubscriptions/getList :: a -> Text -> Maybe Text -> Maybe Int -> m AdAccountsSubscriptionsGetList200Response{- ^ Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed. -}
  , adAccountsSubscriptions/post :: a -> Text -> LeadSubscriptionPostParamsCreate -> m LeadSubscription{- ^ Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM. -}
  , leadForm/get :: a -> Text -> Text -> m LeadFormResponse{- ^ <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>. -}
  , leadFormTest/create :: a -> Text -> Text -> LeadFormTestRequest -> m LeadFormTestResponse{- ^ Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order. -}
  , leadForms/create :: a -> Text -> [LeadFormCreateRequest] -> m LeadFormArrayResponse{- ^ <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>. -}
  , leadForms/list :: a -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> m LeadFormsList200Response{- ^ <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>. -}
  , leadForms/update :: a -> Text -> [LeadFormUpdateRequest] -> m LeadFormArrayResponse{- ^ <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>. -}
  , leadsExport/create :: a -> Text -> LeadsExportCreateRequest -> m LeadsExportCreateResponse{- ^ <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>. -}
  , leadsExport/get :: a -> Text -> Text -> m LeadsExportResponseData{- ^ <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>. -}
  , media/create :: a -> MediaUploadCreate -> m MediaUpload{- ^ Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation. -}
  , media/get :: a -> Text -> m Media{- ^ Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation. -}
  , media/list :: a -> Maybe Text -> Maybe Int -> m MediaList200Response{- ^ List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation. -}
  , msotEvents/create :: a -> Text -> ConversionMSOTEvents -> m NoContent{- ^ <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting. -}
  , notification/post :: a -> NotificationPostRequest -> m NotificationResponse{- ^ Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature. -}
  , oauth/conversionToken :: a -> m ConversionAccessTokenResponse{- ^ Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token. -}
  , oauth/token :: a -> FormOauthToken -> m OauthAccessTokenResponse{- ^ Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token. -}
  , token/revoke :: a -> FormTokenRevoke -> m NoContent{- ^ Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable. -}
  , orderLines/get :: a -> Text -> Text -> m OrderLine{- ^ Get a specific existing order line associated with an ad account. -}
  , orderLines/list :: a -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> m OrderLinesList200Response{- ^ List existing order lines associated with an ad account. -}
  , multiPins/analytics :: a -> Maybe [Text] -> Maybe Day -> Maybe Day -> Maybe Text -> Maybe [Text] -> Maybe Text -> m ((Map.Map String Map)){- ^ <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. -}
  , pins/analytics :: a -> Text -> Maybe Day -> Maybe Day -> Maybe Text -> Maybe [Text] -> Maybe Text -> Maybe Text -> m ((Map.Map String PinAnalyticsMetricsResponse)){- ^ Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. -}
  , pins/create :: a -> Maybe Text -> PinCreate -> m Pin{- ^   Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation. -}
  , pins/delete :: a -> Text -> Maybe Text -> m NoContent{- ^    Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin. -}
  , pins/get :: a -> Text -> Maybe Text -> Maybe Bool -> m Pin{- ^    Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin. -}
  , pins/list :: a -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe [CreativeType] -> Maybe Text -> Maybe Text -> Maybe Int -> m PinsList200Response{- ^      Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins). -}
  , pins/save :: a -> Text -> Maybe Text -> PinsSaveRequest -> m Pin{- ^ Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID. -}
  , pins/update :: a -> Text -> Maybe Text -> PinUpdate -> m Pin{- ^ Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).** -}
  , trendsFeaturedTopics/list :: a -> Maybe InterestsEnum -> Maybe ProductCategoryRegion -> m [FeaturedTrend]{- ^   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI. -}
  , trendsProductCategoriesDetails/list :: a -> Maybe [ProductCategoryEnum] -> Maybe ProductCategoryRegion -> Maybe ProductCategoryDetailLookbackWindow -> Maybe ProductCategoriesEngagementType -> m [ProductCategoryDetails]{- ^   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories -}
  , trendsProductCategoriesTrending/list :: a -> Maybe ProductCategoryRegion -> Maybe [VerticalProductCategory] -> Maybe [AgeTrendsBucket] -> Maybe [GenderBucket] -> Maybe ProductCategoriesEngagementType -> m [TrendingProductCategory]{- ^   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender. -}
  , productGroupPromotions/create :: a -> Text -> ProductGroupPromotionCreateRequest -> m ProductGroupPromotionResponse{- ^ Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.') -}
  , productGroupPromotions/get :: a -> Text -> Text -> m ProductGroupPromotion{- ^ Get a product group promotion by id -}
  , productGroupPromotions/list :: a -> Text -> Maybe [Text] -> Maybe [Text] -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> m ProductGroupPromotionsList200Response{- ^ List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error. -}
  , productGroupPromotions/update :: a -> Text -> ProductGroupPromotionUpdateRequest -> m ProductGroupPromotionResponse{- ^ Update multiple existing Product Group Promotions (by product_group_id) -}
  , productGroups/analytics :: a -> Text -> Maybe Day -> Maybe Day -> Maybe [Text] -> Maybe [Text] -> Maybe Granularity -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe ReportingTimeZone -> m [ProductGroupAnalyticsResponseInner]{- ^ Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. -}
  , promotions/create :: a -> Text -> [PromotionCreateRequest] -> m PromotionsResponse{- ^ Create multiple new promotions. -}
  , promotions/delete :: a -> Text -> Text -> m NoContent{- ^ Delete a promotion within Pinterest. -}
  , promotions/get :: a -> Text -> Text -> m PromotionResponse{- ^ Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id. -}
  , promotions/list :: a -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> m PromotionsList200Response{- ^ Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration. -}
  , promotions/update :: a -> Text -> [PromotionUpdateRequest] -> m PromotionsResponse{- ^ Update multiple promotions. -}
  , adAccountCountries/get :: a -> m AdAccountsCountryResponse{- ^ Get Ad Accounts countries -}
  , deliveryMetrics/get :: a -> Maybe Text -> m DeliveryMetricsResponse{- ^ Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/api-features/analytics-overview/'>Organic Analytics</a> and <a href='/docs/api-features/ads-reporting/'>Ads Analytics</a> for more information. -}
  , interestTargetingOptions/get :: a -> Text -> m SingleInterestTargetingOptionResponse{- ^ <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p> -}
  , leadFormQuestions/get :: a -> m NoContent{- ^ Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong> -}
  , metricsReadyState/get :: a -> Maybe Text -> m BookClosedResponse{- ^ Learn whether conversion or non-conversion metrics are finalized and ready to query. -}
  , targetingOptions/get :: a -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m [Value]{- ^ <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre> -}
  , searchPartnerPins :: a -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> m SearchPartnerPins200Response{- ^ <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term. -}
  , searchUserBoards/get :: a -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> m SearchUserBoardsGet200Response{- ^ Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information. -}
  , searchUserPins/list :: a -> Maybe Text -> Maybe Text -> Maybe Text -> m SearchUserPinsList200Response{- ^ Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information. -}
  , targetingTemplate/create :: a -> Text -> TargetingTemplateCreate -> m TargetingTemplateGetResponseData{- ^ <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p> -}
  , targetingTemplate/list :: a -> Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Int -> Maybe Text -> m TargetingTemplateList200Response{- ^ Get a list of the targeting templates in the specified <code>ad_account_id</code> -}
  , targetingTemplate/update :: a -> Text -> TargetingTemplateUpdateRequest -> m NoContent{- ^ <p>Update the targeting template given advertiser ID and targeting template ID</p> -}
  , termsRelated/list :: a -> Maybe [Text] -> m RelatedTerms{- ^ Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc. -}
  , termsSuggested/list :: a -> Maybe Text -> Maybe Int -> m [Text]{- ^ Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term. -}
  , termsOfService/get :: a -> Text -> Maybe Bool -> Maybe Text -> m TermsOfService{- ^ Get the text of the terms of service and see whether the advertiser has accepted the terms of service. -}
  , boardsUserFollows/list :: a -> Maybe Text -> Maybe Int -> Maybe Bool -> Maybe Text -> m BoardsUserFollowsList200Response{- ^ Get a list of the boards a user follows. The request returns a board summary object array. -}
  , followUser/update :: a -> Text -> FollowUserRequest -> m UserSummary{- ^ <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user. -}
  , followers/list :: a -> Maybe Text -> Maybe Int -> m FollowersList200Response{- ^ Get a list of your followers. -}
  , linkedBusinessAccounts/get :: a -> m [LinkedBusiness]{- ^ Get a list of your linked business accounts. -}
  , unverifyWebsite/delete :: a -> Maybe Text -> m NoContent{- ^ Unverifu a website verified by the signed-in user. -}
  , userAccount/analytics :: a -> Maybe Day -> Maybe Day -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe [Text] -> Maybe Text -> Maybe Text -> m ((Map.Map String AnalyticsMetricsResponse)){- ^ Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". -}
  , userAccount/analytics/topPins :: a -> Maybe Day -> Maybe Day -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe [Text] -> Maybe Int -> Maybe Int -> Maybe Text -> m TopPinsAnalyticsResponse{- ^ Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". -}
  , userAccount/analytics/topVideoPins :: a -> Maybe Day -> Maybe Day -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe [Text] -> Maybe Int -> Maybe Int -> Maybe Text -> m TopVideoPinsAnalyticsResponse{- ^ Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". -}
  , userAccount/followedInterests :: a -> Text -> Maybe Text -> Maybe Int -> m UserAccountFollowedInterests200Response{- ^ Get a list of a user's following interests in one place. -}
  , userAccount/get :: a -> Maybe Text -> m Account{- ^ Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information. -}
  , userFollowing/get :: a -> Maybe Text -> Maybe Int -> Maybe UserFollowingFeedType -> Maybe Bool -> Maybe Text -> m UserFollowingGet200Response{- ^ Get a list of who a certain user follows. -}
  , userWebsites/get :: a -> Maybe Text -> Maybe Int -> m UserWebsitesGet200Response{- ^ Get user websites, claimed or not -}
  , verifyWebsite/update :: a -> Maybe Text -> UserWebsiteVerifyRequest -> m UserWebsiteSummary{- ^ Verify a website as a signed-in user. -}
  , websiteVerification/get :: a -> Maybe Text -> m UserWebsiteVerificationCode{- ^ Get verification code for user to install on the website to claim it. -}
  }

-- | Authentication settings for PinterestREST.
-- lookupUser is used to retrieve a user given a header value. The data type can be specified by providing an
-- type instance for AuthServerData. authError is a function that given a request returns a custom error that
-- is returned when the header is not found.
data PinterestRESTAuth = PinterestRESTAuth
  { lookupUser :: ByteString -> Handler AuthServer
  , authError :: Request -> ServerError
  }
-- | Authentication settings for PinterestREST.
-- lookupUser is used to retrieve a user given a header value. The data type can be specified by providing an
-- type instance for AuthServerData. authError is a function that given a request returns a custom error that
-- is returned when the header is not found.
data PinterestRESTAuth = PinterestRESTAuth
  { lookupUser :: BasicAuthData -> Handler AuthServer
  , authError :: Request -> ServerError
  }

newtype PinterestRESTClient a = PinterestRESTClient
  { runClient :: ClientEnv -> ExceptT ClientError IO a
  } deriving Functor

instance Applicative PinterestRESTClient where
  pure x = PinterestRESTClient (\_ -> pure x)
  (PinterestRESTClient f) <*> (PinterestRESTClient x) =
    PinterestRESTClient (\env -> f env <*> x env)

instance Monad PinterestRESTClient where
  (PinterestRESTClient a) >>= f =
    PinterestRESTClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO PinterestRESTClient where
  liftIO io = PinterestRESTClient (\_ -> liftIO io)

createPinterestRESTClient :: PinterestRESTBackend AuthClient PinterestRESTClient
createPinterestRESTClient = PinterestRESTBackend{..}
  where
    ((coerce -> adAccount/analytics) :<|>
     (coerce -> adAccountTargetingAnalytics/get) :<|>
     (coerce -> adAccounts/create) :<|>
     (coerce -> adAccounts/get) :<|>
     (coerce -> adAccounts/list) :<|>
     (coerce -> analytics/createConversionProductReport) :<|>
     (coerce -> analytics/createMmmReport) :<|>
     (coerce -> analytics/createReport) :<|>
     (coerce -> analytics/createTemplateReport) :<|>
     (coerce -> analytics/getConversionProductReport) :<|>
     (coerce -> analytics/getMmmReport) :<|>
     (coerce -> analytics/getReport) :<|>
     (coerce -> sandbox/delete) :<|>
     (coerce -> templates/list) :<|>
     (coerce -> adGroups/analytics) :<|>
     (coerce -> adGroups/audienceSizing) :<|>
     (coerce -> adGroups/create) :<|>
     (coerce -> adGroups/get) :<|>
     (coerce -> adGroups/list) :<|>
     (coerce -> adGroups/update) :<|>
     (coerce -> adGroupsBidFloor/get) :<|>
     (coerce -> adGroupsTargetingAnalytics/get) :<|>
     (coerce -> adPreviews/create) :<|>
     (coerce -> adTargetingAnalytics/get) :<|>
     (coerce -> ads/analytics) :<|>
     (coerce -> ads/create) :<|>
     (coerce -> ads/get) :<|>
     (coerce -> ads/list) :<|>
     (coerce -> ads/update) :<|>
     (coerce -> advancedAuctionItemsGet/post) :<|>
     (coerce -> advancedAuctionItemsSubmit/post) :<|>
     (coerce -> audienceInsights/get) :<|>
     (coerce -> audienceInsightsScopeAndType/get) :<|>
     (coerce -> adAccountsAudiencesSharedAccounts/list) :<|>
     (coerce -> businessAccountAudiencesSharedAccounts/list) :<|>
     (coerce -> sharedAudiencesForBusiness/list) :<|>
     (coerce -> updateAdAccountToAdAccountSharedAudience) :<|>
     (coerce -> updateAdAccountToBusinessSharedAudience) :<|>
     (coerce -> updateBusinessToAdAccountSharedAudience) :<|>
     (coerce -> updateBusinessToBusinessSharedAudience) :<|>
     (coerce -> audiences/create) :<|>
     (coerce -> audiences/get) :<|>
     (coerce -> audiences/list) :<|>
     (coerce -> audiences/update) :<|>
     (coerce -> adsCredit/redeem) :<|>
     (coerce -> adsCreditsDiscounts/get) :<|>
     (coerce -> billingInvoiceDownload/get) :<|>
     (coerce -> billingInvoices/get) :<|>
     (coerce -> billingProfiles/get) :<|>
     (coerce -> ssioAccounts/get) :<|>
     (coerce -> ssioInsertionOrder/create) :<|>
     (coerce -> ssioInsertionOrder/edit) :<|>
     (coerce -> ssioInsertionOrdersStatus/getByAdAccount) :<|>
     (coerce -> ssioInsertionOrdersStatus/getByPinOrderId) :<|>
     (coerce -> ssioOrderLines/getByAdAccount) :<|>
     (coerce -> boardSections/create) :<|>
     (coerce -> boardSections/delete) :<|>
     (coerce -> boardSections/list) :<|>
     (coerce -> boardSections/listPins) :<|>
     (coerce -> boardSections/update) :<|>
     (coerce -> boards/create) :<|>
     (coerce -> boards/delete) :<|>
     (coerce -> boards/get) :<|>
     (coerce -> boards/list) :<|>
     (coerce -> boards/listPins) :<|>
     (coerce -> boards/update) :<|>
     (coerce -> bulkDownload/create) :<|>
     (coerce -> bulkRequest/get) :<|>
     (coerce -> bulkUpsert/create) :<|>
     (coerce -> assetGroup/create) :<|>
     (coerce -> assetGroup/delete) :<|>
     (coerce -> assetGroup/update) :<|>
     (coerce -> businessAssetMembers/get) :<|>
     (coerce -> businessAssetPartners/get) :<|>
     (coerce -> businessAssets/get) :<|>
     (coerce -> businessMemberAssets/get) :<|>
     (coerce -> businessMembersAssetAccess/delete) :<|>
     (coerce -> businessMembersAssetAccess/update) :<|>
     (coerce -> businessPartnerAssetAccess/get) :<|>
     (coerce -> deletePartnerAssetAccessHandlerImpl) :<|>
     (coerce -> updatePartnerAssetAccessHandlerImpl) :<|>
     (coerce -> assetAccessRequests/create) :<|>
     (coerce -> cancelInvitesOrRequests) :<|>
     (coerce -> createAssetInvites) :<|>
     (coerce -> createMembershipOrPartnershipInvites) :<|>
     (coerce -> get/invites) :<|>
     (coerce -> respondBusinessAccessInvites) :<|>
     (coerce -> brandAccounts/create) :<|>
     (coerce -> brandAccounts/update) :<|>
     (coerce -> deleteBusinessMembership) :<|>
     (coerce -> deleteBusinessPartners) :<|>
     (coerce -> get/businessEmployers) :<|>
     (coerce -> get/businessMembers) :<|>
     (coerce -> get/businessPartners) :<|>
     (coerce -> systemUser/update) :<|>
     (coerce -> update/businessMemberships) :<|>
     (coerce -> adPins/analytics) :<|>
     (coerce -> campaignTargetingAnalytics/get) :<|>
     (coerce -> campaigns/analytics) :<|>
     (coerce -> campaigns/create) :<|>
     (coerce -> campaigns/get) :<|>
     (coerce -> campaigns/list) :<|>
     (coerce -> campaigns/update) :<|>
     (coerce -> feedProcessingResults/list) :<|>
     (coerce -> feeds/create) :<|>
     (coerce -> feeds/delete) :<|>
     (coerce -> feeds/get) :<|>
     (coerce -> feeds/ingest) :<|>
     (coerce -> feeds/list) :<|>
     (coerce -> feeds/update) :<|>
     (coerce -> itemsIssues/list) :<|>
     (coerce -> items/post) :<|>
     (coerce -> itemsBatch/get) :<|>
     (coerce -> itemsBatch/post) :<|>
     (coerce -> catalogsProductGroupPins/list) :<|>
     (coerce -> catalogsProductGroups/create) :<|>
     (coerce -> catalogsProductGroups/createMany) :<|>
     (coerce -> catalogsProductGroups/delete) :<|>
     (coerce -> catalogsProductGroups/deleteMany) :<|>
     (coerce -> catalogsProductGroups/get) :<|>
     (coerce -> catalogsProductGroups/list) :<|>
     (coerce -> catalogsProductGroups/productCountsGet) :<|>
     (coerce -> catalogsProductGroups/update) :<|>
     (coerce -> productsByProductGroupFilter/list) :<|>
     (coerce -> reports/create) :<|>
     (coerce -> reports/get) :<|>
     (coerce -> reports/stats) :<|>
     (coerce -> catalogs/availableFilterValues) :<|>
     (coerce -> catalogs/create) :<|>
     (coerce -> catalogs/list) :<|>
     (coerce -> conversionEqs/list) :<|>
     (coerce -> events/create) :<|>
     (coerce -> conversionTags/create) :<|>
     (coerce -> conversionTags/get) :<|>
     (coerce -> conversionTags/list) :<|>
     (coerce -> ocpmEligibleConversionTags/get) :<|>
     (coerce -> pageVisitConversionTags/get) :<|>
     (coerce -> advertiserDefinedEvents/get) :<|>
     (coerce -> customerListUploads/create) :<|>
     (coerce -> customerListUploads/get) :<|>
     (coerce -> customerListUploads/run) :<|>
     (coerce -> customerLists/create) :<|>
     (coerce -> customerLists/get) :<|>
     (coerce -> customerLists/list) :<|>
     (coerce -> customerLists/update) :<|>
     (coerce -> integrations/getById) :<|>
     (coerce -> integrations/getList) :<|>
     (coerce -> integrationsCommerce/del) :<|>
     (coerce -> integrationsCommerce/get) :<|>
     (coerce -> integrationsCommerce/patch) :<|>
     (coerce -> integrationsCommerce/post) :<|>
     (coerce -> integrationsLogs/post) :<|>
     (coerce -> countryKeywordsMetrics/get) :<|>
     (coerce -> keywords/create) :<|>
     (coerce -> keywords/get) :<|>
     (coerce -> keywords/update) :<|>
     (coerce -> trendingKeywords/list) :<|>
     (coerce -> labels/create) :<|>
     (coerce -> labels/list) :<|>
     (coerce -> labels/update) :<|>
     (coerce -> adAccountsSubscriptions/delById) :<|>
     (coerce -> adAccountsSubscriptions/getById) :<|>
     (coerce -> adAccountsSubscriptions/getList) :<|>
     (coerce -> adAccountsSubscriptions/post) :<|>
     (coerce -> leadForm/get) :<|>
     (coerce -> leadFormTest/create) :<|>
     (coerce -> leadForms/create) :<|>
     (coerce -> leadForms/list) :<|>
     (coerce -> leadForms/update) :<|>
     (coerce -> leadsExport/create) :<|>
     (coerce -> leadsExport/get) :<|>
     (coerce -> media/create) :<|>
     (coerce -> media/get) :<|>
     (coerce -> media/list) :<|>
     (coerce -> msotEvents/create) :<|>
     (coerce -> notification/post) :<|>
     (coerce -> oauth/conversionToken) :<|>
     (coerce -> oauth/token) :<|>
     (coerce -> token/revoke) :<|>
     (coerce -> orderLines/get) :<|>
     (coerce -> orderLines/list) :<|>
     (coerce -> multiPins/analytics) :<|>
     (coerce -> pins/analytics) :<|>
     (coerce -> pins/create) :<|>
     (coerce -> pins/delete) :<|>
     (coerce -> pins/get) :<|>
     (coerce -> pins/list) :<|>
     (coerce -> pins/save) :<|>
     (coerce -> pins/update) :<|>
     (coerce -> trendsFeaturedTopics/list) :<|>
     (coerce -> trendsProductCategoriesDetails/list) :<|>
     (coerce -> trendsProductCategoriesTrending/list) :<|>
     (coerce -> productGroupPromotions/create) :<|>
     (coerce -> productGroupPromotions/get) :<|>
     (coerce -> productGroupPromotions/list) :<|>
     (coerce -> productGroupPromotions/update) :<|>
     (coerce -> productGroups/analytics) :<|>
     (coerce -> promotions/create) :<|>
     (coerce -> promotions/delete) :<|>
     (coerce -> promotions/get) :<|>
     (coerce -> promotions/list) :<|>
     (coerce -> promotions/update) :<|>
     (coerce -> adAccountCountries/get) :<|>
     (coerce -> deliveryMetrics/get) :<|>
     (coerce -> interestTargetingOptions/get) :<|>
     (coerce -> leadFormQuestions/get) :<|>
     (coerce -> metricsReadyState/get) :<|>
     (coerce -> targetingOptions/get) :<|>
     (coerce -> searchPartnerPins) :<|>
     (coerce -> searchUserBoards/get) :<|>
     (coerce -> searchUserPins/list) :<|>
     (coerce -> targetingTemplate/create) :<|>
     (coerce -> targetingTemplate/list) :<|>
     (coerce -> targetingTemplate/update) :<|>
     (coerce -> termsRelated/list) :<|>
     (coerce -> termsSuggested/list) :<|>
     (coerce -> termsOfService/get) :<|>
     (coerce -> boardsUserFollows/list) :<|>
     (coerce -> followUser/update) :<|>
     (coerce -> followers/list) :<|>
     (coerce -> linkedBusinessAccounts/get) :<|>
     (coerce -> unverifyWebsite/delete) :<|>
     (coerce -> userAccount/analytics) :<|>
     (coerce -> userAccount/analytics/topPins) :<|>
     (coerce -> userAccount/analytics/topVideoPins) :<|>
     (coerce -> userAccount/followedInterests) :<|>
     (coerce -> userAccount/get) :<|>
     (coerce -> userFollowing/get) :<|>
     (coerce -> userWebsites/get) :<|>
     (coerce -> verifyWebsite/update) :<|>
     (coerce -> websiteVerification/get) :<|>
     _) = client (Proxy :: Proxy PinterestRESTAPI)

-- | Run requests in the PinterestRESTClient monad.
runPinterestRESTClient :: Config -> PinterestRESTClient a -> ExceptT ClientError IO a
runPinterestRESTClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runPinterestRESTClientWithManager manager clientConfig cl

-- | Run requests in the PinterestRESTClient monad using a custom manager.
runPinterestRESTClientWithManager :: Manager -> Config -> PinterestRESTClient a -> ExceptT ClientError IO a
runPinterestRESTClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a PinterestRESTClientError
callPinterestREST
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> PinterestRESTClient a -> m a
callPinterestREST env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (PinterestRESTClientError err)
    Right response -> pure response


requestMiddlewareId :: Application -> Application
requestMiddlewareId a = a

-- | Run the PinterestREST server at the provided host and port.
runPinterestRESTServer
  :: (MonadIO m, MonadThrow m)
  => Config -> PinterestRESTAuth -> PinterestRESTBackend AuthServer (ExceptT ServerError IO) -> m ()
runPinterestRESTServer config auth backend = runPinterestRESTMiddlewareServer config requestMiddlewareId auth backend

-- | Run the PinterestREST server at the provided host and port.
runPinterestRESTMiddlewareServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Middleware -> PinterestRESTAuth -> PinterestRESTBackend AuthServer (ExceptT ServerError IO) -> m ()
runPinterestRESTMiddlewareServer Config{..} middleware auth backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ middleware $ serverWaiApplicationPinterestREST auth backend

-- | Plain "Network.Wai" Application for the PinterestREST server.
--
-- Can be used to implement e.g. tests that call the API without a full webserver.
serverWaiApplicationPinterestREST :: PinterestRESTAuth -> PinterestRESTBackend AuthServer (ExceptT ServerError IO) -> Application
serverWaiApplicationPinterestREST auth backend = serveWithContextT (Proxy :: Proxy PinterestRESTAPI) context id (serverFromBackend backend)
  where
    context = serverContext auth
    serverFromBackend PinterestRESTBackend{..} =
      (coerce adAccount/analytics :<|>
       coerce adAccountTargetingAnalytics/get :<|>
       coerce adAccounts/create :<|>
       coerce adAccounts/get :<|>
       coerce adAccounts/list :<|>
       coerce analytics/createConversionProductReport :<|>
       coerce analytics/createMmmReport :<|>
       coerce analytics/createReport :<|>
       coerce analytics/createTemplateReport :<|>
       coerce analytics/getConversionProductReport :<|>
       coerce analytics/getMmmReport :<|>
       coerce analytics/getReport :<|>
       coerce sandbox/delete :<|>
       coerce templates/list :<|>
       coerce adGroups/analytics :<|>
       coerce adGroups/audienceSizing :<|>
       coerce adGroups/create :<|>
       coerce adGroups/get :<|>
       coerce adGroups/list :<|>
       coerce adGroups/update :<|>
       coerce adGroupsBidFloor/get :<|>
       coerce adGroupsTargetingAnalytics/get :<|>
       coerce adPreviews/create :<|>
       coerce adTargetingAnalytics/get :<|>
       coerce ads/analytics :<|>
       coerce ads/create :<|>
       coerce ads/get :<|>
       coerce ads/list :<|>
       coerce ads/update :<|>
       coerce advancedAuctionItemsGet/post :<|>
       coerce advancedAuctionItemsSubmit/post :<|>
       coerce audienceInsights/get :<|>
       coerce audienceInsightsScopeAndType/get :<|>
       coerce adAccountsAudiencesSharedAccounts/list :<|>
       coerce businessAccountAudiencesSharedAccounts/list :<|>
       coerce sharedAudiencesForBusiness/list :<|>
       coerce updateAdAccountToAdAccountSharedAudience :<|>
       coerce updateAdAccountToBusinessSharedAudience :<|>
       coerce updateBusinessToAdAccountSharedAudience :<|>
       coerce updateBusinessToBusinessSharedAudience :<|>
       coerce audiences/create :<|>
       coerce audiences/get :<|>
       coerce audiences/list :<|>
       coerce audiences/update :<|>
       coerce adsCredit/redeem :<|>
       coerce adsCreditsDiscounts/get :<|>
       coerce billingInvoiceDownload/get :<|>
       coerce billingInvoices/get :<|>
       coerce billingProfiles/get :<|>
       coerce ssioAccounts/get :<|>
       coerce ssioInsertionOrder/create :<|>
       coerce ssioInsertionOrder/edit :<|>
       coerce ssioInsertionOrdersStatus/getByAdAccount :<|>
       coerce ssioInsertionOrdersStatus/getByPinOrderId :<|>
       coerce ssioOrderLines/getByAdAccount :<|>
       coerce boardSections/create :<|>
       coerce boardSections/delete :<|>
       coerce boardSections/list :<|>
       coerce boardSections/listPins :<|>
       coerce boardSections/update :<|>
       coerce boards/create :<|>
       coerce boards/delete :<|>
       coerce boards/get :<|>
       coerce boards/list :<|>
       coerce boards/listPins :<|>
       coerce boards/update :<|>
       coerce bulkDownload/create :<|>
       coerce bulkRequest/get :<|>
       coerce bulkUpsert/create :<|>
       coerce assetGroup/create :<|>
       coerce assetGroup/delete :<|>
       coerce assetGroup/update :<|>
       coerce businessAssetMembers/get :<|>
       coerce businessAssetPartners/get :<|>
       coerce businessAssets/get :<|>
       coerce businessMemberAssets/get :<|>
       coerce businessMembersAssetAccess/delete :<|>
       coerce businessMembersAssetAccess/update :<|>
       coerce businessPartnerAssetAccess/get :<|>
       coerce deletePartnerAssetAccessHandlerImpl :<|>
       coerce updatePartnerAssetAccessHandlerImpl :<|>
       coerce assetAccessRequests/create :<|>
       coerce cancelInvitesOrRequests :<|>
       coerce createAssetInvites :<|>
       coerce createMembershipOrPartnershipInvites :<|>
       coerce get/invites :<|>
       coerce respondBusinessAccessInvites :<|>
       coerce brandAccounts/create :<|>
       coerce brandAccounts/update :<|>
       coerce deleteBusinessMembership :<|>
       coerce deleteBusinessPartners :<|>
       coerce get/businessEmployers :<|>
       coerce get/businessMembers :<|>
       coerce get/businessPartners :<|>
       coerce systemUser/update :<|>
       coerce update/businessMemberships :<|>
       coerce adPins/analytics :<|>
       coerce campaignTargetingAnalytics/get :<|>
       coerce campaigns/analytics :<|>
       coerce campaigns/create :<|>
       coerce campaigns/get :<|>
       coerce campaigns/list :<|>
       coerce campaigns/update :<|>
       coerce feedProcessingResults/list :<|>
       coerce feeds/create :<|>
       coerce feeds/delete :<|>
       coerce feeds/get :<|>
       coerce feeds/ingest :<|>
       coerce feeds/list :<|>
       coerce feeds/update :<|>
       coerce itemsIssues/list :<|>
       coerce items/post :<|>
       coerce itemsBatch/get :<|>
       coerce itemsBatch/post :<|>
       coerce catalogsProductGroupPins/list :<|>
       coerce catalogsProductGroups/create :<|>
       coerce catalogsProductGroups/createMany :<|>
       coerce catalogsProductGroups/delete :<|>
       coerce catalogsProductGroups/deleteMany :<|>
       coerce catalogsProductGroups/get :<|>
       coerce catalogsProductGroups/list :<|>
       coerce catalogsProductGroups/productCountsGet :<|>
       coerce catalogsProductGroups/update :<|>
       coerce productsByProductGroupFilter/list :<|>
       coerce reports/create :<|>
       coerce reports/get :<|>
       coerce reports/stats :<|>
       coerce catalogs/availableFilterValues :<|>
       coerce catalogs/create :<|>
       coerce catalogs/list :<|>
       coerce conversionEqs/list :<|>
       coerce events/create :<|>
       coerce conversionTags/create :<|>
       coerce conversionTags/get :<|>
       coerce conversionTags/list :<|>
       coerce ocpmEligibleConversionTags/get :<|>
       coerce pageVisitConversionTags/get :<|>
       coerce advertiserDefinedEvents/get :<|>
       coerce customerListUploads/create :<|>
       coerce customerListUploads/get :<|>
       coerce customerListUploads/run :<|>
       coerce customerLists/create :<|>
       coerce customerLists/get :<|>
       coerce customerLists/list :<|>
       coerce customerLists/update :<|>
       coerce integrations/getById :<|>
       coerce integrations/getList :<|>
       coerce integrationsCommerce/del :<|>
       coerce integrationsCommerce/get :<|>
       coerce integrationsCommerce/patch :<|>
       coerce integrationsCommerce/post :<|>
       coerce integrationsLogs/post :<|>
       coerce countryKeywordsMetrics/get :<|>
       coerce keywords/create :<|>
       coerce keywords/get :<|>
       coerce keywords/update :<|>
       coerce trendingKeywords/list :<|>
       coerce labels/create :<|>
       coerce labels/list :<|>
       coerce labels/update :<|>
       coerce adAccountsSubscriptions/delById :<|>
       coerce adAccountsSubscriptions/getById :<|>
       coerce adAccountsSubscriptions/getList :<|>
       coerce adAccountsSubscriptions/post :<|>
       coerce leadForm/get :<|>
       coerce leadFormTest/create :<|>
       coerce leadForms/create :<|>
       coerce leadForms/list :<|>
       coerce leadForms/update :<|>
       coerce leadsExport/create :<|>
       coerce leadsExport/get :<|>
       coerce media/create :<|>
       coerce media/get :<|>
       coerce media/list :<|>
       coerce msotEvents/create :<|>
       coerce notification/post :<|>
       coerce oauth/conversionToken :<|>
       coerce oauth/token :<|>
       coerce token/revoke :<|>
       coerce orderLines/get :<|>
       coerce orderLines/list :<|>
       coerce multiPins/analytics :<|>
       coerce pins/analytics :<|>
       coerce pins/create :<|>
       coerce pins/delete :<|>
       coerce pins/get :<|>
       coerce pins/list :<|>
       coerce pins/save :<|>
       coerce pins/update :<|>
       coerce trendsFeaturedTopics/list :<|>
       coerce trendsProductCategoriesDetails/list :<|>
       coerce trendsProductCategoriesTrending/list :<|>
       coerce productGroupPromotions/create :<|>
       coerce productGroupPromotions/get :<|>
       coerce productGroupPromotions/list :<|>
       coerce productGroupPromotions/update :<|>
       coerce productGroups/analytics :<|>
       coerce promotions/create :<|>
       coerce promotions/delete :<|>
       coerce promotions/get :<|>
       coerce promotions/list :<|>
       coerce promotions/update :<|>
       coerce adAccountCountries/get :<|>
       coerce deliveryMetrics/get :<|>
       coerce interestTargetingOptions/get :<|>
       coerce leadFormQuestions/get :<|>
       coerce metricsReadyState/get :<|>
       coerce targetingOptions/get :<|>
       coerce searchPartnerPins :<|>
       coerce searchUserBoards/get :<|>
       coerce searchUserPins/list :<|>
       coerce targetingTemplate/create :<|>
       coerce targetingTemplate/list :<|>
       coerce targetingTemplate/update :<|>
       coerce termsRelated/list :<|>
       coerce termsSuggested/list :<|>
       coerce termsOfService/get :<|>
       coerce boardsUserFollows/list :<|>
       coerce followUser/update :<|>
       coerce followers/list :<|>
       coerce linkedBusinessAccounts/get :<|>
       coerce unverifyWebsite/delete :<|>
       coerce userAccount/analytics :<|>
       coerce userAccount/analytics/topPins :<|>
       coerce userAccount/analytics/topVideoPins :<|>
       coerce userAccount/followedInterests :<|>
       coerce userAccount/get :<|>
       coerce userFollowing/get :<|>
       coerce userWebsites/get :<|>
       coerce verifyWebsite/update :<|>
       coerce websiteVerification/get :<|>
       serveDirectoryFileServer "static")

-- Authentication is implemented with servants generalized authentication:
-- https://docs.servant.dev/en/stable/tutorial/Authentication.html#generalized-authentication

authHandler :: PinterestRESTAuth -> AuthHandler Request AuthServer
authHandler PinterestRESTAuth{..} = mkAuthHandler handler
  where
    handler req = case lookup "Authorization" (requestHeaders req) of
      Just header -> case extractBearerAuth header of
        Just key -> lookupUser key
        Nothing -> throwError (authError req)
      Nothing -> throwError (authError req)

type Protected = AuthProtect "bearer"
type AuthServer = AuthServerData Protected
type AuthClient = AuthenticatedRequest Protected
type instance AuthClientData Protected = Text

clientAuth :: Text -> AuthClient
clientAuth key = mkAuthenticatedRequest ("Bearer " <> key) (addHeader "Authorization")
-- Authentication is implemented with servants generalized authentication:
-- https://docs.servant.dev/en/stable/tutorial/Authentication.html#generalized-authentication

authHandler :: PinterestRESTAuth -> AuthHandler Request AuthServer
authHandler PinterestRESTAuth{..} = mkAuthHandler handler
  where
    handler req = case lookup "Authorization" (requestHeaders req) of
      Just header -> case extractBasicAuth header of
        Just (user, password) -> lookupUser (BasicAuthData user password)
        Nothing -> throwError (authError req)
      Nothing -> throwError (authError req)

type Protected = AuthProtect "basic"
type AuthServer = AuthServerData Protected
type AuthClient = AuthenticatedRequest Protected
type instance AuthClientData Protected = BasicAuthData

clientAuth :: BasicAuthData -> AuthClient
clientAuth key = mkAuthenticatedRequest key basicAuthReq

serverContext :: PinterestRESTAuth -> Context (AuthHandler Request AuthServer ': '[])
serverContext auth = authHandler auth :. EmptyContext
