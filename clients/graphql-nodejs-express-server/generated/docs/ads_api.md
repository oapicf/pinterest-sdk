# ads_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdPreviewsCreate**](ads_api.md#AdPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**AdTargetingAnalyticsGet**](ads_api.md#AdTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**AdsAnalytics**](ads_api.md#AdsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**AdsCreate**](ads_api.md#AdsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**AdsGet**](ads_api.md#AdsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**AdsList**](ads_api.md#AdsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**AdsUpdate**](ads_api.md#AdsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
[**CampaignAdPreviewCreate**](ads_api.md#CampaignAdPreviewCreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**CampaignAdPreviewDelete**](ads_api.md#CampaignAdPreviewDelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**CampaignAdPreviewRead**](ads_api.md#CampaignAdPreviewRead) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups


<a name="AdPreviewsCreate"></a>
# **AdPreviewsCreate**
> AdPreviewUrlResponse AdPreviewsCreate(adAccountId, adPreviewRequest)

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
<a name="AdTargetingAnalyticsGet"></a>
# **AdTargetingAnalyticsGet**
> MetricsResponse AdTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
<a name="AdsAnalytics"></a>
# **AdsAnalytics**
> AdsAnalytics AdsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone)

Get ad analytics

    Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
<a name="AdsCreate"></a>
# **AdsCreate**
> AdBatchWriteResponseModel AdsCreate(adAccountId, adCreate)

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
<a name="AdsGet"></a>
# **AdsGet**
> Ad AdsGet(adId, adAccountId)

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
<a name="AdsList"></a>
# **AdsList**
> AdsList200Response AdsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses)

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
<a name="AdsUpdate"></a>
# **AdsUpdate**
> AdBatchWriteResponseModel AdsUpdate(adAccountId, adBatchUpdate)

Update ads

Update multiple existing ads
<a name="CampaignAdPreviewCreate"></a>
# **CampaignAdPreviewCreate**
> CampaignAdPreviewCreate200ResponseInner CampaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate)

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
<a name="CampaignAdPreviewDelete"></a>
# **CampaignAdPreviewDelete**
> CampaignAdPreviewDelete200ResponseInner CampaignAdPreviewDelete(adGroupIds, adAccountId)

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
<a name="CampaignAdPreviewRead"></a>
# **CampaignAdPreviewRead**
> CampaignAdPreview CampaignAdPreviewRead(adGroupIds, adAccountId)

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
