{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.AdAccounts where

import           Import


-- | Get ad account analytics
--
-- Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
-- operationId: adAccount/analytics
getAdAccountsByTextAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
getAdAccountsByTextAnalyticsR adAccountId = notImplemented

-- | Get targeting analytics for an ad account
--
-- Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-- operationId: adAccountTargetingAnalytics/get
getAdAccountsByTextTargetingAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                       -> Handler Value
getAdAccountsByTextTargetingAnalyticsR adAccountId = notImplemented

-- | Create ad account
--
-- Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
-- operationId: adAccounts/create
postAdAccountsR :: Handler Value
postAdAccountsR = notImplemented

-- | Get ad account
--
-- Get an ad account
-- operationId: adAccounts/get
getAdAccountsByTextR :: Text -- ^ 
                     -> Handler Value
getAdAccountsByTextR adAccountId = notImplemented

-- | List ad accounts
--
-- Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
-- operationId: adAccounts/list
getAdAccountsR :: Handler Value
getAdAccountsR = notImplemented

-- | Create a request for a brand, category, SKU report
--
-- &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
-- operationId: analytics/createConversionProductReport
postAdAccountsByTextReportsBrandCategorySkuR :: Text -- ^ Unique identifier of an ad account.
                                             -> Handler Value
postAdAccountsByTextReportsBrandCategorySkuR adAccountId = notImplemented

-- | Create a request for a Marketing Mix Modeling (MMM) report
--
-- This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it&#39;s in beta release.
-- operationId: analytics/createMmmReport
postAdAccountsByTextMmmReportsR :: Text -- ^ Unique identifier of an ad account.
                                -> Handler Value
postAdAccountsByTextMmmReportsR adAccountId = notImplemented

-- | Create async request for an account analytics report
--
-- This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
-- operationId: analytics/createReport
postAdAccountsByTextReportsR :: Text -- ^ Unique identifier of an ad account.
                             -> Handler Value
postAdAccountsByTextReportsR adAccountId = notImplemented

-- | Create async request for an analytics report using a template
--
--    This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
-- operationId: analytics/createTemplateReport
postAdAccountsByTextTemplatesByTextReportsR :: Text -- ^ 
                                            -> Text -- ^ Unique identifier of a template.
                                            -> Handler Value
postAdAccountsByTextTemplatesByTextReportsR adAccountId templateId = notImplemented

-- | Get advertiser brand, category, SKU report
--
-- &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
-- operationId: analytics/getConversionProductReport
getAdAccountsByTextReportsBrandCategorySkuR :: Text -- ^ Unique identifier of an ad account.
                                            -> Handler Value
getAdAccountsByTextReportsBrandCategorySkuR adAccountId = notImplemented

-- | Get advertiser Marketing Mix Modeling (MMM) report.
--
-- Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
-- operationId: analytics/getMmmReport
getAdAccountsByTextMmmReportsR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
getAdAccountsByTextMmmReportsR adAccountId = notImplemented

-- | Get the account analytics report created by the async call
--
-- This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
-- operationId: analytics/getReport
getAdAccountsByTextReportsR :: Text -- ^ Unique identifier of an ad account.
                            -> Handler Value
getAdAccountsByTextReportsR adAccountId = notImplemented

-- | Delete ads data for ad account in API Sandbox
--
-- Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
-- operationId: sandbox/delete
deleteAdAccountsByTextSandboxR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
deleteAdAccountsByTextSandboxR adAccountId = notImplemented

-- | List templates
--
-- Gets all Templates associated with an ad account ID.
-- operationId: templates/list
getAdAccountsByTextTemplatesR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
getAdAccountsByTextTemplatesR adAccountId = notImplemented
