{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.AdGroups where

import           Import


-- | Get ad group analytics
--
-- Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-- operationId: adGroups/analytics
getAdAccountsByTextAdGroupsAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                      -> Handler Value
getAdAccountsByTextAdGroupsAnalyticsR adAccountId = notImplemented

-- | Get audience sizing
--
-- Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
-- operationId: adGroups/audienceSizing
postAdAccountsByTextAdGroupsAudienceSizingR :: Text -- ^ Unique identifier of an ad account.
                                            -> Handler Value
postAdAccountsByTextAdGroupsAudienceSizingR adAccountId = notImplemented

-- | Create ad groups
--
-- Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
-- operationId: adGroups/create
postAdAccountsByTextAdGroupsR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
postAdAccountsByTextAdGroupsR adAccountId = notImplemented

-- | Get ad group
--
-- Get a specific ad group given the ad group ID.
-- operationId: adGroups/get
getAdAccountsByTextAdGroupsByTextR :: Text -- ^ Ad group ID.
                                   -> Text -- ^ Unique identifier of an ad account.
                                   -> Handler Value
getAdAccountsByTextAdGroupsByTextR adGroupId adAccountId = notImplemented

-- | List ad groups
--
-- List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
-- operationId: adGroups/list
getAdAccountsByTextAdGroupsR :: Text -- ^ Unique identifier of an ad account.
                             -> Handler Value
getAdAccountsByTextAdGroupsR adAccountId = notImplemented

-- | Update ad groups
--
-- Update multiple existing ad groups.
-- operationId: adGroups/update
patchAdAccountsByTextAdGroupsR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
patchAdAccountsByTextAdGroupsR adAccountId = notImplemented

-- | Get bid floors
--
-- List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
-- operationId: adGroupsBidFloor/get
postAdAccountsByTextBidFloorR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
postAdAccountsByTextBidFloorR adAccountId = notImplemented

-- | Get dynamic titles CSV download URL
--
-- Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
-- operationId: adGroupsDynamicTitles/downloadCsv
getAdAccountsByTextAdGroupsByTextDynamicTitlesCsvR :: Text -- ^ Unique identifier of an ad account.
                                                   -> Text -- ^ Ad group ID.
                                                   -> Handler Value
getAdAccountsByTextAdGroupsByTextDynamicTitlesCsvR adAccountId adGroupId = notImplemented

-- | Get dynamic titles status
--
-- Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
-- operationId: adGroupsDynamicTitles/getStatus
getAdAccountsByTextAdGroupsByTextDynamicTitlesStatusR :: Text -- ^ Unique identifier of an ad account.
                                                      -> Text -- ^ Ad group ID.
                                                      -> Handler Value
getAdAccountsByTextAdGroupsByTextDynamicTitlesStatusR adAccountId adGroupId = notImplemented

-- | Get dynamic titles upload URL
--
-- Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
-- operationId: adGroupsDynamicTitles/getUploadUrl
getAdAccountsByTextAdGroupsByTextDynamicTitlesUploadsR :: Text -- ^ Unique identifier of an ad account.
                                                       -> Text -- ^ Ad group ID.
                                                       -> Handler Value
getAdAccountsByTextAdGroupsByTextDynamicTitlesUploadsR adAccountId adGroupId = notImplemented

-- | Process dynamic titles CSV
--
-- Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
-- operationId: adGroupsDynamicTitles/processCsv
postAdAccountsByTextAdGroupsByTextDynamicTitlesR :: Text -- ^ Unique identifier of an ad account.
                                                 -> Text -- ^ Ad group ID.
                                                 -> Handler Value
postAdAccountsByTextAdGroupsByTextDynamicTitlesR adAccountId adGroupId = notImplemented

-- | Get targeting analytics for ad groups
--
-- Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-- operationId: adGroupsTargetingAnalytics/get
getAdAccountsByTextAdGroupsTargetingAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                               -> Handler Value
getAdAccountsByTextAdGroupsTargetingAnalyticsR adAccountId = notImplemented

-- | List of ad groups using promotions IDs.
--
--   Get a list of ad groups that are associated with those promotion ids
-- operationId: getAdGroupsByPromotionIds/list
getAdAccountsByTextPromotionAppliedEntitiesR :: Text -- ^ Unique identifier of an ad account.
                                             -> Handler Value
getAdAccountsByTextPromotionAppliedEntitiesR adAccountId = notImplemented
