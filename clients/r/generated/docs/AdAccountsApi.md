# AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountAnalytics**](AdAccountsApi.md#AdAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**AdAccountsList**](AdAccountsApi.md#AdAccountsList) | **GET** /ad_accounts | List ad accounts
[**AdGroupsAnalytics**](AdAccountsApi.md#AdGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**AdGroupsList**](AdAccountsApi.md#AdGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**AdsAnalytics**](AdAccountsApi.md#AdsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**AdsList**](AdAccountsApi.md#AdsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**AnalyticsCreateReport**](AdAccountsApi.md#AnalyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**AnalyticsGetReport**](AdAccountsApi.md#AnalyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**CampaignsAnalytics**](AdAccountsApi.md#CampaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**CampaignsList**](AdAccountsApi.md#CampaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**ProductGroupsAnalytics**](AdAccountsApi.md#ProductGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **AdAccountAnalytics**
> array[map(object)] AdAccountAnalytics(ad.account.id, start.date, end.date, columns, granularity, click.window.days=30, engagement.window.days=30, view.window.days=1, conversion.report.time='TIME_OF_AD_ACTION')

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```R
library(openapi)

var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.
var.start.date <- 'start.date_example' # character | Metric report start date (UTC). Format: YYYY-MM-DD
var.end.date <- 'end.date_example' # character | Metric report end date (UTC). Format: YYYY-MM-DD
var.columns <- list("AD_ACCOUNT_ID") # array[character] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
var.granularity <- Granularity$new() # Granularity | Granularity
var.click.window.days <- 30 # integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
var.engagement.window.days <- 30 # integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
var.view.window.days <- 1 # integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
var.conversion.report.time <- 'TIME_OF_AD_ACTION' # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

#Get ad account analytics
api.instance <- AdAccountsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$AdAccountAnalytics(var.ad.account.id, var.start.date, var.end.date, var.columns, var.granularity, click.window.days=var.click.window.days, engagement.window.days=var.engagement.window.days, view.window.days=var.view.window.days, conversion.report.time=var.conversion.report.time)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad.account.id** | **character**| Unique identifier of an ad account. | 
 **start.date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end.date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **columns** | Enum [AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **click.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion.report.time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[**array[map(object)]**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

# **AdAccountsList**
> Paginated AdAccountsList(bookmark=var.bookmark, page.size=25, include.shared.accounts=TRUE)

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Example
```R
library(openapi)

var.bookmark <- 'bookmark_example' # character | Cursor used to fetch the next page of items
var.page.size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
var.include.shared.accounts <- TRUE # character | Include shared ad accounts

#List ad accounts
api.instance <- AdAccountsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$AdAccountsList(bookmark=var.bookmark, page.size=var.page.size, include.shared.accounts=var.include.shared.accounts)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page.size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **include.shared.accounts** | **character**| Include shared ad accounts | [optional] [default to TRUE]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

# **AdGroupsAnalytics**
> array[map(object)] AdGroupsAnalytics(ad.account.id, start.date, end.date, ad.group.ids, columns, granularity, click.window.days=30, engagement.window.days=30, view.window.days=1, conversion.report.time='TIME_OF_AD_ACTION')

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```R
library(openapi)

var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.
var.start.date <- 'start.date_example' # character | Metric report start date (UTC). Format: YYYY-MM-DD
var.end.date <- 'end.date_example' # character | Metric report end date (UTC). Format: YYYY-MM-DD
var.ad.group.ids <- list("inner_example") # array[character] | List of Ad group Ids to use to filter the results.
var.columns <- list("AD_ACCOUNT_ID") # array[character] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
var.granularity <- Granularity$new() # Granularity | Granularity
var.click.window.days <- 30 # integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
var.engagement.window.days <- 30 # integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
var.view.window.days <- 1 # integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
var.conversion.report.time <- 'TIME_OF_AD_ACTION' # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

#Get ad group analytics
api.instance <- AdAccountsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$AdGroupsAnalytics(var.ad.account.id, var.start.date, var.end.date, var.ad.group.ids, var.columns, var.granularity, click.window.days=var.click.window.days, engagement.window.days=var.engagement.window.days, view.window.days=var.view.window.days, conversion.report.time=var.conversion.report.time)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad.account.id** | **character**| Unique identifier of an ad account. | 
 **start.date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end.date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **ad.group.ids** | list( **character** )| List of Ad group Ids to use to filter the results. | 
 **columns** | Enum [AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **click.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion.report.time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[**array[map(object)]**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account group analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

# **AdGroupsList**
> Paginated AdGroupsList(ad.account.id, campaign.ids=var.campaign.ids, ad.group.ids=var.ad.group.ids, entity.statuses=var.entity.statuses, page.size=25, order=var.order, bookmark=var.bookmark, translate.interests.to.names=FALSE)

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```R
library(openapi)

var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.
var.campaign.ids <- list("inner_example") # array[character] | List of Campaign Ids to use to filter the results.
var.ad.group.ids <- list("inner_example") # array[character] | List of Ad group Ids to use to filter the results.
var.entity.statuses <- list("ACTIVE") # array[character] | Entity status
var.page.size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
var.order <- 'ASCENDING' # character | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
var.bookmark <- 'bookmark_example' # character | Cursor used to fetch the next page of items
var.translate.interests.to.names <- FALSE # character | Return interests as text names (if value is true) rather than topic IDs.

#List ad groups
api.instance <- AdAccountsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$AdGroupsList(var.ad.account.id, campaign.ids=var.campaign.ids, ad.group.ids=var.ad.group.ids, entity.statuses=var.entity.statuses, page.size=var.page.size, order=var.order, bookmark=var.bookmark, translate.interests.to.names=var.translate.interests.to.names)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad.account.id** | **character**| Unique identifier of an ad account. | 
 **campaign.ids** | list( **character** )| List of Campaign Ids to use to filter the results. | [optional] 
 **ad.group.ids** | list( **character** )| List of Ad group Ids to use to filter the results. | [optional] 
 **entity.statuses** | Enum [ACTIVE, PAUSED, ARCHIVED] | Entity status | [optional] 
 **page.size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | Enum [ASCENDING, DESCENDING] | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **translate.interests.to.names** | **character**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to FALSE]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account group parameters. |  -  |
| **0** | Unexpected error |  -  |

# **AdsAnalytics**
> array[map(object)] AdsAnalytics(ad.account.id, start.date, end.date, ad.ids, columns, granularity, click.window.days=30, engagement.window.days=30, view.window.days=1, conversion.report.time='TIME_OF_AD_ACTION')

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```R
library(openapi)

var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.
var.start.date <- 'start.date_example' # character | Metric report start date (UTC). Format: YYYY-MM-DD
var.end.date <- 'end.date_example' # character | Metric report end date (UTC). Format: YYYY-MM-DD
var.ad.ids <- list("inner_example") # array[character] | List of Ad Ids to use to filter the results.
var.columns <- list("AD_ACCOUNT_ID") # array[character] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
var.granularity <- Granularity$new() # Granularity | Granularity
var.click.window.days <- 30 # integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
var.engagement.window.days <- 30 # integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
var.view.window.days <- 1 # integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
var.conversion.report.time <- 'TIME_OF_AD_ACTION' # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

#Get ad analytics
api.instance <- AdAccountsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$AdsAnalytics(var.ad.account.id, var.start.date, var.end.date, var.ad.ids, var.columns, var.granularity, click.window.days=var.click.window.days, engagement.window.days=var.engagement.window.days, view.window.days=var.view.window.days, conversion.report.time=var.conversion.report.time)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad.account.id** | **character**| Unique identifier of an ad account. | 
 **start.date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end.date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **ad.ids** | list( **character** )| List of Ad Ids to use to filter the results. | 
 **columns** | Enum [AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **click.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion.report.time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[**array[map(object)]**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

# **AdsList**
> Paginated AdsList(ad.account.id, campaign.ids=var.campaign.ids, ad.group.ids=var.ad.group.ids, ad.ids=var.ad.ids, entity.statuses=var.entity.statuses, page.size=25, order=var.order, bookmark=var.bookmark)

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```R
library(openapi)

var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.
var.campaign.ids <- list("inner_example") # array[character] | List of Campaign Ids to use to filter the results.
var.ad.group.ids <- list("inner_example") # array[character] | List of Ad group Ids to use to filter the results.
var.ad.ids <- list("inner_example") # array[character] | List of Ad Ids to use to filter the results.
var.entity.statuses <- list("ACTIVE") # array[character] | Entity status
var.page.size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
var.order <- 'ASCENDING' # character | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
var.bookmark <- 'bookmark_example' # character | Cursor used to fetch the next page of items

#List ads
api.instance <- AdAccountsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$AdsList(var.ad.account.id, campaign.ids=var.campaign.ids, ad.group.ids=var.ad.group.ids, ad.ids=var.ad.ids, entity.statuses=var.entity.statuses, page.size=var.page.size, order=var.order, bookmark=var.bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad.account.id** | **character**| Unique identifier of an ad account. | 
 **campaign.ids** | list( **character** )| List of Campaign Ids to use to filter the results. | [optional] 
 **ad.group.ids** | list( **character** )| List of Ad group Ids to use to filter the results. | [optional] 
 **ad.ids** | list( **character** )| List of Ad Ids to use to filter the results. | [optional] 
 **entity.statuses** | Enum [ACTIVE, PAUSED, ARCHIVED] | Entity status | [optional] 
 **page.size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | Enum [ASCENDING, DESCENDING] | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads parameters. |  -  |
| **0** | Unexpected error |  -  |

# **AnalyticsCreateReport**
> AdsAnalyticsCreateAsyncResponse AnalyticsCreateReport(ad.account.id, ads.analytics.create.async.request)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```R
library(openapi)

var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.
var.ads.analytics.create.async.request <- AdsAnalyticsCreateAsyncRequest$new("start_date_example", "end_date_example", Granularity$new(), list(ReportingColumnAsync$new()), MetricsReportingLevel$new(), ConversionAttributionWindowDays$new(), ConversionAttributionWindowDays$new(), ConversionAttributionWindowDays$new(), ConversionReportTimeType$new(), list(ConversionReportAttributionType$new()), DataOutputFormat$new(), list("campaign_ids_example"), list(CampaignSummaryStatus$new()), list(ObjectiveType$new()), list("ad_group_ids_example"), list(AdGroupSummaryStatus$new()), list("ad_ids_example"), list(PinPromotionSummaryStatus$new()), list("product_group_ids_example"), list(ProductGroupSummaryStatus$new()), list("product_item_ids_example"), list(AdsAnalyticsTargetingType$new()), list(AdsAnalyticsMetricsFilter$new(AdsAnalyticsFilterColumn$new(), AdsAnalyticsFilterOperator$new(), list(123)))) # AdsAnalyticsCreateAsyncRequest | 

#Create async request for an account analytics report
api.instance <- AdAccountsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$AnalyticsCreateReport(var.ad.account.id, var.ads.analytics.create.async.request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad.account.id** | **character**| Unique identifier of an ad account. | 
 **ads.analytics.create.async.request** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md)|  | 

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

# **AnalyticsGetReport**
> AdsAnalyticsGetAsyncResponse AnalyticsGetReport(ad.account.id, token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```R
library(openapi)

var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.
var.token <- 'token_example' # character | Token returned from the post request creation call

#Get the account analytics report created by the async call
api.instance <- AdAccountsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$AnalyticsGetReport(var.ad.account.id, var.token)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad.account.id** | **character**| Unique identifier of an ad account. | 
 **token** | **character**| Token returned from the post request creation call | 

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

# **CampaignsAnalytics**
> array[map(object)] CampaignsAnalytics(ad.account.id, start.date, end.date, campaign.ids, columns, granularity, click.window.days=30, engagement.window.days=30, view.window.days=1, conversion.report.time='TIME_OF_AD_ACTION')

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```R
library(openapi)

var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.
var.start.date <- 'start.date_example' # character | Metric report start date (UTC). Format: YYYY-MM-DD
var.end.date <- 'end.date_example' # character | Metric report end date (UTC). Format: YYYY-MM-DD
var.campaign.ids <- list("inner_example") # array[character] | List of Campaign Ids to use to filter the results.
var.columns <- list("AD_ACCOUNT_ID") # array[character] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
var.granularity <- Granularity$new() # Granularity | Granularity
var.click.window.days <- 30 # integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
var.engagement.window.days <- 30 # integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
var.view.window.days <- 1 # integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
var.conversion.report.time <- 'TIME_OF_AD_ACTION' # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

#Get campaign analytics
api.instance <- AdAccountsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$CampaignsAnalytics(var.ad.account.id, var.start.date, var.end.date, var.campaign.ids, var.columns, var.granularity, click.window.days=var.click.window.days, engagement.window.days=var.engagement.window.days, view.window.days=var.view.window.days, conversion.report.time=var.conversion.report.time)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad.account.id** | **character**| Unique identifier of an ad account. | 
 **start.date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end.date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **campaign.ids** | list( **character** )| List of Campaign Ids to use to filter the results. | 
 **columns** | Enum [AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **click.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion.report.time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[**array[map(object)]**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account campaign analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

# **CampaignsList**
> Paginated CampaignsList(ad.account.id, campaign.ids=var.campaign.ids, entity.statuses=var.entity.statuses, page.size=25, order=var.order, bookmark=var.bookmark)

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```R
library(openapi)

var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.
var.campaign.ids <- list("inner_example") # array[character] | List of Campaign Ids to use to filter the results.
var.entity.statuses <- list("ACTIVE") # array[character] | Entity status
var.page.size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
var.order <- 'ASCENDING' # character | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
var.bookmark <- 'bookmark_example' # character | Cursor used to fetch the next page of items

#List campaigns
api.instance <- AdAccountsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$CampaignsList(var.ad.account.id, campaign.ids=var.campaign.ids, entity.statuses=var.entity.statuses, page.size=var.page.size, order=var.order, bookmark=var.bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad.account.id** | **character**| Unique identifier of an ad account. | 
 **campaign.ids** | list( **character** )| List of Campaign Ids to use to filter the results. | [optional] 
 **entity.statuses** | Enum [ACTIVE, PAUSED, ARCHIVED] | Entity status | [optional] 
 **page.size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | Enum [ASCENDING, DESCENDING] | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account campaign parameters. |  -  |
| **0** | Unexpected error |  -  |

# **ProductGroupsAnalytics**
> array[map(object)] ProductGroupsAnalytics(ad.account.id, start.date, end.date, product.group.ids, columns, granularity, click.window.days=30, engagement.window.days=30, view.window.days=1, conversion.report.time='TIME_OF_AD_ACTION')

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```R
library(openapi)

var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.
var.start.date <- 'start.date_example' # character | Metric report start date (UTC). Format: YYYY-MM-DD
var.end.date <- 'end.date_example' # character | Metric report end date (UTC). Format: YYYY-MM-DD
var.product.group.ids <- list("inner_example") # array[character] | List of Product group Ids to use to filter the results.
var.columns <- list("AD_ACCOUNT_ID") # array[character] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
var.granularity <- Granularity$new() # Granularity | Granularity
var.click.window.days <- 30 # integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
var.engagement.window.days <- 30 # integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
var.view.window.days <- 1 # integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
var.conversion.report.time <- 'TIME_OF_AD_ACTION' # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

#Get product group analytics
api.instance <- AdAccountsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$ProductGroupsAnalytics(var.ad.account.id, var.start.date, var.end.date, var.product.group.ids, var.columns, var.granularity, click.window.days=var.click.window.days, engagement.window.days=var.engagement.window.days, view.window.days=var.view.window.days, conversion.report.time=var.conversion.report.time)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad.account.id** | **character**| Unique identifier of an ad account. | 
 **start.date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end.date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **product.group.ids** | list( **character** )| List of Product group Ids to use to filter the results. | 
 **columns** | Enum [AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **click.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view.window.days** | Enum [1, 7, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion.report.time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[**array[map(object)]**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

