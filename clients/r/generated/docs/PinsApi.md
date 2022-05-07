# PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PinsAnalytics**](PinsApi.md#PinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**PinsCreate**](PinsApi.md#PinsCreate) | **POST** /pins | Create Pin
[**PinsDelete**](PinsApi.md#PinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**PinsGet**](PinsApi.md#PinsGet) | **GET** /pins/{pin_id} | Get Pin


# **PinsAnalytics**
> map(AnalyticsMetricsResponse) PinsAnalytics(pin.id, start.date, end.date, metric.types, app.types='ALL', split.field='NO_SPLIT', ad.account.id=var.ad.account.id)

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Example
```R
library(openapi)

var.pin.id <- 'pin.id_example' # character | Unique identifier of a Pin.
var.start.date <- 'start.date_example' # character | Metric report start date (UTC). Format: YYYY-MM-DD
var.end.date <- 'end.date_example' # character | Metric report end date (UTC). Format: YYYY-MM-DD
var.metric.types <- list("IMPRESSION") # array[character] | Pin metric types to get data for, default is all.
var.app.types <- 'ALL' # character | Apps or devices to get data for, default is all.
var.split.field <- 'NO_SPLIT' # character | How to split the data into groups. Not including this param means data won't be split.
var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.

#Get Pin analytics
api.instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$PinsAnalytics(var.pin.id, var.start.date, var.end.date, var.metric.types, app.types=var.app.types, split.field=var.split.field, ad.account.id=var.ad.account.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin.id** | **character**| Unique identifier of a Pin. | 
 **start.date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end.date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **metric.types** | Enum [IMPRESSION, SAVE, PIN_CLICK, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW] | Pin metric types to get data for, default is all. | 
 **app.types** | Enum [ALL, MOBILE, TABLET, WEB] | Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **split.field** | Enum [NO_SPLIT, APP_TYPE] | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
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
| **200** | response |  -  |
| **403** | Not authorized to access board or Pin. |  -  |
| **404** | Pin not found. |  -  |
| **0** | Unexpected error |  -  |

# **PinsCreate**
> Pin PinsCreate(pin)

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```R
library(openapi)

var.pin <- Pin$new("id_example", "created_at_example", "link_example", "title_example", "description_example", "alt_text_example", "board_id_example", "board_section_id_example", TODO, TODO, TODO) # Pin | Create a new Pin.

#Create Pin
api.instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$PinsCreate(var.pin)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**Pin**](Pin.md)| Create a new Pin. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful pin creation. |  -  |
| **400** | Invalid Pin parameters response |  -  |
| **403** | The Pin&#39;s image is too small, too large or is broken |  -  |
| **404** | Board or section not found |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
| **0** | Unexpected error |  -  |

# **PinsDelete**
> PinsDelete(pin.id)

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

var.pin.id <- 'pin.id_example' # character | Unique identifier of a Pin.

#Delete Pin
api.instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
api.instance$PinsDelete(var.pin.id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin.id** | **character**| Unique identifier of a Pin. | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted Pin |  -  |
| **403** | Not authorized to access board or Pin. |  -  |
| **404** | Pin not found. |  -  |
| **0** | Unexpected error |  -  |

# **PinsGet**
> Pin PinsGet(pin.id, ad.account.id=var.ad.account.id)

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```R
library(openapi)

var.pin.id <- 'pin.id_example' # character | Unique identifier of a Pin.
var.ad.account.id <- 'ad.account.id_example' # character | Unique identifier of an ad account.

#Get Pin
api.instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$PinsGet(var.pin.id, ad.account.id=var.ad.account.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin.id** | **character**| Unique identifier of a Pin. | 
 **ad.account.id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **403** | Not authorized to access board or Pin. |  -  |
| **404** | Pin not found. |  -  |
| **0** | Unexpected error |  -  |

