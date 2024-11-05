# ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EventsCreate**](ConversionEventsApi.md#EventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions


# **EventsCreate**
> ConversionApiResponse EventsCreate(ad_account_id, conversion_events, test = var.test)

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/api-features/conversion-overview/\">Conversions Guide</a> for more details. (Note that the authorization header required is <code>Authorization: Bearer &lt;access_token&gt;</code>). - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example
```R
library(openapi)

# Send conversions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_conversion_events <- ConversionEvents$new(c(ConversionEvents_data_inner$new("event_name_example", "action_source_example", 123, "event_id_example", ConversionEventsUserData$new(c("em_example"), c("hashed_maids_example"), "client_ip_address_example", "client_user_agent_example", c("ph_example"), c("ge_example"), c("db_example"), c("ln_example"), c("fn_example"), c("ct_example"), c("st_example"), c("zp_example"), c("country_example"), c("external_id_example"), "click_id_example", "partner_id_example"), "event_source_url_example", "opt_out_example", "partner_name_example", ConversionEvents_data_inner_custom_data$new("currency_example", "value_example", c("content_ids_example"), "content_name_example", "content_category_example", "content_brand_example", c(ConversionEvents_data_inner_custom_data_contents_inner$new("id_example", "item_price_example", 123, "item_name_example", "item_category_example", "item_brand_example")), 123, "order_id_example", "search_string_example", "opt_out_type_example", "np_example"), "app_id_example", "app_name_example", "app_version_example", "device_brand_example", "device_carrier_example", "device_model_example", "device_type_example", "os_version_example", "wifi_example", "language_example"))) # ConversionEvents | Conversion events.
var_test <- "test_example" # character | Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (Optional)

api_instance <- ConversionEventsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure HTTP bearer authorization: conversion_token
# api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$EventsCreate(var_ad_account_id, var_conversion_events, test = var_testdata_file = "result.txt")
result <- api_instance$EventsCreate(var_ad_account_id, var_conversion_events, test = var_test)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **conversion_events** | [**ConversionEvents**](ConversionEvents.md)| Conversion events. | 
 **test** | **character**| Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional] 

### Return type

[**ConversionApiResponse**](ConversionApiResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [conversion_token](../README.md#conversion_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The request was invalid. |  -  |
| **401** | Not authorized to send conversion events |  -  |
| **403** | Unauthorized access. |  -  |
| **422** | Not all events were successfully processed. |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. |  -  |
| **503** | The endpoint has been ramped down and is currently not accepting any traffic. |  -  |
| **0** | Unexpected errors |  -  |

