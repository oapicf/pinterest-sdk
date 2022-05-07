# UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserAccountAnalytics**](UserAccountApi.md#UserAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**UserAccountGet**](UserAccountApi.md#UserAccountGet) | **GET** /user_account | Get user account


# **UserAccountAnalytics**
> map(AnalyticsMetricsResponse) UserAccountAnalytics(start.date, end.date, from.claimed.content='BOTH', pin.format='ALL', app.types='ALL', metric.types=var.metric.types, split.field='NO_SPLIT', ad.account.id=var.ad.account.id)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```R
library(openapi)

var.start.date <- 'start.date_example' # character | Metric report start date (UTC). Format: YYYY-MM-DD
var.end.date <- 'end.date_example' # character | Metric report end date (UTC). Format: YYYY-MM-DD
var.from.claimed.content <- 'BOTH' # character | Filter on Pins that match your claimed domain.
var.pin.format <- 'ALL' # character | Pin formats to get data for, default is all.
var.app.types <- 'ALL' # character | Apps or devices to get data for, default is all.
var.metric.types <- list("ENGAGEMENT") # array[character] | Metric types to get data for, default is all. 
var.split.field <- 'NO_SPLIT' # character | How to split the data into groups. Not including this param means data won't be split.
var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.

#Get user account analytics
api.instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$UserAccountAnalytics(var.start.date, var.end.date, from.claimed.content=var.from.claimed.content, pin.format=var.pin.format, app.types=var.app.types, metric.types=var.metric.types, split.field=var.split.field, ad.account.id=var.ad.account.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start.date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end.date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **from.claimed.content** | Enum [OTHER, CLAIMED, BOTH] | Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pin.format** | Enum [ALL, PRODUCT, REGULAR, VIDEO] | Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **app.types** | Enum [ALL, MOBILE, TABLET, WEB] | Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **metric.types** | Enum [ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE] | Metric types to get data for, default is all.  | [optional] 
 **split.field** | Enum [NO_SPLIT, APP_TYPE, OWNED_CONTENT, PIN_FORMAT] | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
 **ad.account.id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**map(AnalyticsMetricsResponse)**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Not authorized to access the user account analytics. |  -  |
| **0** | Unexpected error |  -  |

# **UserAccountGet**
> Account UserAccountGet(ad.account.id=var.ad.account.id)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Example
```R
library(openapi)

var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.

#Get user account
api.instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$UserAccountGet(ad.account.id=var.ad.account.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad.account.id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **403** | Not authorized to access the user account. |  -  |
| **0** | Unexpected error |  -  |

