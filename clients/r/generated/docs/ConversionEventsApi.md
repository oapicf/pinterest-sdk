# ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EventsCreate**](ConversionEventsApi.md#EventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions


# **EventsCreate**
> ConversionEvents EventsCreate(ad_account_id, conversion_events_create, test = var.test)

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object. - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`). - The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example
```R
library(openapi)

# Send conversions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_conversion_events_create <- ConversionEventsCreate$new(c(ConversionEventsDataItems$new("action_source_example", "event_id_example", "event_name_example", 123, ConversionEventsUserDataProperties$new("click_id_example", "client_ip_address_example", "client_user_agent_example", c("country_example"), c("ct_example"), c("db_example"), c("em_example"), c("external_id_example"), c("fn_example"), c("ge_example"), c("hashed_maids_example"), c("ln_example"), "partner_id_example", c("ph_example"), c("st_example"), c("zp_example")), "app_id_example", ConversionEventAppInfo$new("app_id_example", "app_name_example", "app_package_name_example", "app_store_example", "app_version_example", 123, "user_agent_example", 123, 123), "app_name_example", "app_version_example", ConversionEventsDataItemsCustomData$new("content_brand_example", "content_category_example", c("content_ids_example"), "content_name_example", c(ConversionEventsDataItemsCustomDataContentsItems$new("id_example", "item_brand_example", "item_brand_id_example", "item_category_example", "item_name_example", "item_price_example", 123)), "currency_example", "external_measurement_id_example", 123, "np_example", 123, "opt_out_type_example", "order_id_example", "predicted_ltv_example", "search_string_example", "value_example"), "device_brand_example", "device_carrier_example", ConversionEventDeviceInfo$new(123, "brand_example", "carrier_example", 123, 123, 123, FormFactor$new(), "kernel_version_example", c("languages_example"), "locale_example", "model_example", NetworkType$new(), OsFamily$new(), "os_name_example", "os_release_name_example", "os_version_example", 123, 123, 123, 123, 123, "timezone_example", "timezone_abbr_example", "type_example"), "device_model_example", "device_type_example", "event_source_url_example", "language_example", "opt_out_example", "os_version_example", "partner_name_example", "wifi_example"))) # ConversionEventsCreate | 
var_test <- "test_example" # character | Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (Optional)

api_instance <- ConversionEventsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure HTTP bearer authorization: conversion_token
# api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$EventsCreate(var_ad_account_id, var_conversion_events_create, test = var_testdata_file = "result.txt")
result <- api_instance$EventsCreate(var_ad_account_id, var_conversion_events_create, test = var_test)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **conversion_events_create** | [**ConversionEventsCreate**](ConversionEventsCreate.md)|  | 
 **test** | **character**| Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional] 

### Return type

[**ConversionEvents**](ConversionEvents.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [conversion_token](../README.md#conversion_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **422** | The request was well-formed but was unable to be followed due to semantic errors. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **503** | The server is currently unable to handle the request due to a temporary overload or scheduled maintenance. |  -  |
| **0** | An unexpected error response. |  -  |

