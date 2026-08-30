# PinterestSdkClient::ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**events_create**](ConversionEventsApi.md#events_create) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions |


## events_create

> <ConversionEvents> events_create(ad_account_id, conversion_events_create, opts)

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object. - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`). - The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'

  # Configure Bearer authorization: conversion_token
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = PinterestSdkClient::ConversionEventsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
conversion_events_create = PinterestSdkClient::ConversionEventsCreate.new({data: [{"event_name": "checkout", "action_source": "app_ios", "event_time": 1769818893, "event_id": "eventId0001", "event_source_url": "https: //www.my-clothing-shop.org/", "opt_out": false, "advertiser_tracking_enabled": true, "partner_name": "ss-partnername", "user_data": {"em": ["411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8", "09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969"], "hashed_maids": ["0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1", "837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46"], "client_ip_address": "216.3.128.12", "client_user_agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML,  like Gecko) Chrome/67.0.3396.87 Safari/537.36", "ph": ["45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d"], "ge": ["0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf"], "db": ["d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739"], "ln": ["7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19"], "fn": ["ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2"], "ct": ["4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36"], "st": ["49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34"], "zp": ["fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145"], "country": ["9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d"], "external_id": ["6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee"], "click_id": "dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv", "partner_id": "BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc"}, "custom_data": {"currency": "USD", "value": "66.95", "content_ids": ["product-id-001", "product-id-002"], "content_name": "pinterest-themed-clothing", "content_category": "shirts", "content_brand": "pinterest-brand", "contents": [{"id": "product-id-001", "item_price": "14.99", "quantity": 3, "item_name": "pinterest-shirt-girl", "item_category": "pinterest-clothing-shirts", "item_brand": "pinterest"}, {"id": "product-id-002", "item_price": "10.99", "quantity": 2, "item_name": "pinterest-shirt-men", "item_category": "pinterest-clothing-shirts", "item_brand": "pinterest"}], "num_items": 5, "order_id": "my_order_id", "search_string": "sample string", "opt_out_type": "LDP", "predicted_ltv": "2794.82"}, "app_id": "429047995", "app_name": "Pinterest", "app_version": "7.9", "device_brand": "Apple", "device_carrier": "T-Mobile", "device_model": "iPhone X", "device_type": "iPhone", "os_version": "12.1.4", "wifi": false, "language": "en", "device_info": {"brand": "Apple,  Samsung,  Motorola", "type": "iPhone,  Android", "model": "16 Pro,  Galaxy S25 Ultra", "form_factor": "cellphone", "os_family": "ios", "os_name": "10", "os_version": "18.3", "os_release_name": "18.3", "kernel_version": "6.15", "carrier": "T-Mobile", "screen_width": 1320, "screen_height": 2868, "screen_density": 460, "cpu_cores": 8, "storage_size": 256, "storage_free_space": 184, "external_storage_size": 512, "external_storage_free_space": 126, "locale": "en-us", "languages": ["en", "de", "lt"], "timezone": "USA/New York", "timezone_abbr": "PDT", "network_type": "wifi", "battery_level": 78}, "app_info": {"app_name": "MyAwesomeApp", "app_package_name": "com.company.myawesomeapp", "app_id": "429047995", "app_version": "7.9", "app_store": "Google Play Store", "window_width": 1678, "window_height": 900, "install_time": 1739222269, "user_agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML,  like Gecko) Chrome/131.0.0.0 Safari/537.36"}}]}) # ConversionEventsCreate | 
opts = {
  test: true # Boolean | Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
}

begin
  # Send conversions
  result = api_instance.events_create(ad_account_id, conversion_events_create, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionEventsApi->events_create: #{e}"
end
```

#### Using the events_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionEvents>, Integer, Hash)> events_create_with_http_info(ad_account_id, conversion_events_create, opts)

```ruby
begin
  # Send conversions
  data, status_code, headers = api_instance.events_create_with_http_info(ad_account_id, conversion_events_create, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionEvents>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionEventsApi->events_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **conversion_events_create** | [**ConversionEventsCreate**](ConversionEventsCreate.md) |  |  |
| **test** | **Boolean** | Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional] |

### Return type

[**ConversionEvents**](ConversionEvents.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [conversion_token](../README.md#conversion_token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

