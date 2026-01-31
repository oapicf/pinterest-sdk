# MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MsotEventsCreate**](MsotEventsApi.md#MsotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events


# **MsotEventsCreate**
> MsotEventsCreate(ad_account_id, conversion_msot_events)

Send Measurement Source Of Truth (MSOT) attributed conversion events

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.

### Example
```R
library(openapi)

# Send Measurement Source Of Truth (MSOT) attributed conversion events
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_conversion_msot_events <- ConversionMSOTEvents$new("ad_group_id_example", "view", "event_id_example", "add_to_cart", 123, c(123), "first_touch", 123, "campaign_id_example", Currency$new(), 123, 123, 123) # ConversionMSOTEvents | Attributed MSOT conversion events

api_instance <- MsotEventsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$MsotEventsCreate(var_ad_account_id, var_conversion_msot_events)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **conversion_msot_events** | [**ConversionMSOTEvents**](ConversionMSOTEvents.md)| Attributed MSOT conversion events | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The request was invalid |  -  |
| **401** | Not authorized to send MSOT conversion events |  -  |
| **403** | Unauthorized access |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. |  -  |
| **0** | Unexpected errors |  -  |

