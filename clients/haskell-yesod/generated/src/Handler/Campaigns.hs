{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Campaigns where

import           Import


-- | Get pins analytics
--
-- Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
-- operationId: adPins/analytics
getAdAccountsByTextPinsAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                  -> Handler Value
getAdAccountsByTextPinsAnalyticsR adAccountId = notImplemented

-- | Get targeting analytics for campaigns
--
-- Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-- operationId: campaignTargetingAnalytics/get
getAdAccountsByTextCampaignsTargetingAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                                -> Handler Value
getAdAccountsByTextCampaignsTargetingAnalyticsR adAccountId = notImplemented

-- | Get campaign analytics
--
-- Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-- operationId: campaigns/analytics
getAdAccountsByTextCampaignsAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                       -> Handler Value
getAdAccountsByTextCampaignsAnalyticsR adAccountId = notImplemented

-- | Create campaigns
--
-- Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
-- operationId: campaigns/create
postAdAccountsByTextCampaignsR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
postAdAccountsByTextCampaignsR adAccountId = notImplemented

-- | Get campaign
--
-- Get a specific campaign given the campaign ID.
-- operationId: campaigns/get
getAdAccountsByTextCampaignsByTextR :: Text -- ^ Campaign ID, must be associated with the ad account ID provided in the path.
                                    -> Text -- ^ Unique identifier of an ad account.
                                    -> Handler Value
getAdAccountsByTextCampaignsByTextR campaignId adAccountId = notImplemented

-- | List campaigns
--
-- Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
-- operationId: campaigns/list
getAdAccountsByTextCampaignsR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
getAdAccountsByTextCampaignsR adAccountId = notImplemented

-- | Update campaigns
--
-- Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
-- operationId: campaigns/update
patchAdAccountsByTextCampaignsR :: Text -- ^ Unique identifier of an ad account.
                                -> Handler Value
patchAdAccountsByTextCampaignsR adAccountId = notImplemented

-- | Get campaign delivery estimates
--
-- Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
-- operationId: getCampaignDeliveryEstimates
postAdAccountsByTextCampaignsDeliveryEstimatesR :: Text -- ^ Unique identifier of an ad account.
                                                -> Handler Value
postAdAccountsByTextCampaignsDeliveryEstimatesR adAccountId = notImplemented
