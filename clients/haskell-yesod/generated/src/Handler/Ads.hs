{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Ads where

import           Import


-- | Create ad preview with pin or image
--
-- Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. &lt;p/&gt; If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/promoted-pins-overview\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Ads Overview&lt;/a&gt;.) &lt;p/&gt; You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
-- operationId: adPreviews/create
postAdAccountsByTextAdPreviewsR :: Text -- ^ Unique identifier of an ad account.
                                -> Handler Value
postAdAccountsByTextAdPreviewsR adAccountId = notImplemented

-- | Get targeting analytics for ads
--
-- Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
-- operationId: adTargetingAnalytics/get
getAdAccountsByTextAdsTargetingAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                          -> Handler Value
getAdAccountsByTextAdsTargetingAnalyticsR adAccountId = notImplemented

-- | Get ad analytics
--
-- Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
-- operationId: ads/analytics
getAdAccountsByTextAdsAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                 -> Handler Value
getAdAccountsByTextAdsAnalyticsR adAccountId = notImplemented

-- | Create ads
--
-- Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
-- operationId: ads/create
postAdAccountsByTextAdsR :: Text -- ^ Unique identifier of an ad account.
                         -> Handler Value
postAdAccountsByTextAdsR adAccountId = notImplemented

-- | Get ad
--
-- Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
-- operationId: ads/get
getAdAccountsByTextAdsByTextR :: Text -- ^ Unique identifier of an ad account.
                              -> Text -- ^ Unique identifier of an ad.
                              -> Handler Value
getAdAccountsByTextAdsByTextR adAccountId adId = notImplemented

-- | List ads
--
-- List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses &lt;p/&gt; If no filter is provided, all ads in the ad account are returned. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. &lt;p/&gt; Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/advertising-guidelines\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
-- operationId: ads/list
getAdAccountsByTextAdsR :: Text -- ^ Unique identifier of an ad account.
                        -> Handler Value
getAdAccountsByTextAdsR adAccountId = notImplemented

-- | Update ads
--
-- Update multiple existing ads
-- operationId: ads/update
patchAdAccountsByTextAdsR :: Text -- ^ Unique identifier of an ad account.
                          -> Handler Value
patchAdAccountsByTextAdsR adAccountId = notImplemented
