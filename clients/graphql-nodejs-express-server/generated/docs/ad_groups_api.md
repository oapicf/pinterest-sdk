# ad_groups_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdGroupsAnalytics**](ad_groups_api.md#AdGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**AdGroupsAudienceSizing**](ad_groups_api.md#AdGroupsAudienceSizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**AdGroupsBidFloorGet**](ad_groups_api.md#AdGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**AdGroupsCreate**](ad_groups_api.md#AdGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**AdGroupsDynamicTitlesDownloadCsv**](ad_groups_api.md#AdGroupsDynamicTitlesDownloadCsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**AdGroupsDynamicTitlesGetStatus**](ad_groups_api.md#AdGroupsDynamicTitlesGetStatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**AdGroupsDynamicTitlesGetUploadUrl**](ad_groups_api.md#AdGroupsDynamicTitlesGetUploadUrl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**AdGroupsDynamicTitlesProcessCsv**](ad_groups_api.md#AdGroupsDynamicTitlesProcessCsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**AdGroupsGet**](ad_groups_api.md#AdGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**AdGroupsList**](ad_groups_api.md#AdGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**AdGroupsTargetingAnalyticsGet**](ad_groups_api.md#AdGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**AdGroupsUpdate**](ad_groups_api.md#AdGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
[**GetAdGroupsByPromotionIdsList**](ad_groups_api.md#GetAdGroupsByPromotionIdsList) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.


<a name="AdGroupsAnalytics"></a>
# **AdGroupsAnalytics**
> AdGroupsAnalyticsMetrics AdGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)

Get ad group analytics

Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
<a name="AdGroupsAudienceSizing"></a>
# **AdGroupsAudienceSizing**
> AdGroupAudienceSizing AdGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate)

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
<a name="AdGroupsBidFloorGet"></a>
# **AdGroupsBidFloorGet**
> BidFloor AdGroupsBidFloorGet(adAccountId, bidFloorCreate)

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
<a name="AdGroupsCreate"></a>
# **AdGroupsCreate**
> AdGroupsCreate200Response AdGroupsCreate(adAccountId, adGroupCreateCreate)

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
<a name="AdGroupsDynamicTitlesDownloadCsv"></a>
# **AdGroupsDynamicTitlesDownloadCsv**
> DynamicTitlesDownloadCsv AdGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId)

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
<a name="AdGroupsDynamicTitlesGetStatus"></a>
# **AdGroupsDynamicTitlesGetStatus**
> DynamicTitlesGetStatus AdGroupsDynamicTitlesGetStatus(adAccountId, adGroupId)

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
<a name="AdGroupsDynamicTitlesGetUploadUrl"></a>
# **AdGroupsDynamicTitlesGetUploadUrl**
> DynamicTitlesUploadUrl AdGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId)

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
<a name="AdGroupsDynamicTitlesProcessCsv"></a>
# **AdGroupsDynamicTitlesProcessCsv**
> DynamicTitlesProcessCsv AdGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCsvCreate)

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
<a name="AdGroupsGet"></a>
# **AdGroupsGet**
> AdGroup AdGroupsGet(adGroupId, adAccountId)

Get ad group

Get a specific ad group given the ad group ID.
<a name="AdGroupsList"></a>
# **AdGroupsList**
> AdGroupsList200Response AdGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames)

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
<a name="AdGroupsTargetingAnalyticsGet"></a>
# **AdGroupsTargetingAnalyticsGet**
> MetricsResponse AdGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
<a name="AdGroupsUpdate"></a>
# **AdGroupsUpdate**
> AdGroupsCreate200Response AdGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate)

Update ad groups

Update multiple existing ad groups.
<a name="GetAdGroupsByPromotionIdsList"></a>
# **GetAdGroupsByPromotionIdsList**
> AdGroupsList200Response GetAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order)

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids
