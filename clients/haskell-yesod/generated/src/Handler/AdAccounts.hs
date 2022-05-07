{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.AdAccounts where

import           Import


-- | Get ad account analytics
--
-- Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
-- operationId: adAccount/analytics
getAdAccountsByTextAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
getAdAccountsByTextAnalyticsR adAccountId = notImplemented

-- | List ad accounts
--
-- Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.
-- operationId: adAccounts/list
getAdAccountsR :: Handler Value
getAdAccountsR = notImplemented

-- | Get ad group analytics
--
-- Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
-- operationId: adGroups/analytics
getAdAccountsByTextAdGroupsAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                      -> Handler Value
getAdAccountsByTextAdGroupsAnalyticsR adAccountId = notImplemented

-- | List ad groups
--
-- Get a list of the ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
-- operationId: adGroups/list
getAdAccountsByTextAdGroupsR :: Text -- ^ Unique identifier of an ad account.
                             -> Handler Value
getAdAccountsByTextAdGroupsR adAccountId = notImplemented

-- | Get ad analytics
--
-- Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
-- operationId: ads/analytics
getAdAccountsByTextAdsAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                 -> Handler Value
getAdAccountsByTextAdsAnalyticsR adAccountId = notImplemented

-- | List ads
--
-- Get a list of the ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
-- operationId: ads/list
getAdAccountsByTextAdsR :: Text -- ^ Unique identifier of an ad account.
                        -> Handler Value
getAdAccountsByTextAdsR adAccountId = notImplemented

-- | Create async request for an account analytics report
--
-- This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
-- operationId: analytics/createReport
postAdAccountsByTextReportsR :: Text -- ^ Unique identifier of an ad account.
                             -> Handler Value
postAdAccountsByTextReportsR adAccountId = notImplemented

-- | Get the account analytics report created by the async call
--
-- This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it&#39;s valid for an hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
-- operationId: analytics/getReport
getAdAccountsByTextReportsR :: Text -- ^ Unique identifier of an ad account.
                            -> Handler Value
getAdAccountsByTextReportsR adAccountId = notImplemented

-- | Get campaign analytics
--
-- Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
-- operationId: campaigns/analytics
getAdAccountsByTextCampaignsAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                       -> Handler Value
getAdAccountsByTextCampaignsAnalyticsR adAccountId = notImplemented

-- | List campaigns
--
-- Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
-- operationId: campaigns/list
getAdAccountsByTextCampaignsR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
getAdAccountsByTextCampaignsR adAccountId = notImplemented

-- | Get product group analytics
--
-- Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
-- operationId: productGroups/analytics
getAdAccountsByTextProductGroupsAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                           -> Handler Value
getAdAccountsByTextProductGroupsAnalyticsR adAccountId = notImplemented
