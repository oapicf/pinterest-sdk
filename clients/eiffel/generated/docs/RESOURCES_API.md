# RESOURCES_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_countries_get**](RESOURCES_API.md#ad_account_countries_get) | **Get** /resources/ad_account_countries | Get ad accounts countries
[**delivery_metrics_get**](RESOURCES_API.md#delivery_metrics_get) | **Get** /resources/delivery_metrics | Get available metrics&#39; definitions
[**interest_targeting_options_get**](RESOURCES_API.md#interest_targeting_options_get) | **Get** /resources/targeting/interests/{interest_id} | Get interest details
[**lead_form_questions_get**](RESOURCES_API.md#lead_form_questions_get) | **Get** /resources/lead_form_questions | Get lead form questions
[**metrics_ready_state_get**](RESOURCES_API.md#metrics_ready_state_get) | **Get** /resources/metrics_ready_state | Get metrics ready state
[**targeting_options_get**](RESOURCES_API.md#targeting_options_get) | **Get** /resources/targeting/{targeting_type} | Get targeting options


# **ad_account_countries_get**
> ad_account_countries_get : detachable AD_ACCOUNT_COUNTRIES_GET_200_RESPONSE


Get ad accounts countries

Get Ad Accounts countries


### Parameters
This endpoint does not need any parameter.

### Return type

[**AD_ACCOUNT_COUNTRIES_GET_200_RESPONSE**](ad_account_countries_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delivery_metrics_get**
> delivery_metrics_get (report_type:  detachable REPORT_TYPE ): detachable DELIVERY_METRICS_GET_200_RESPONSE


Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_type** | [**REPORT_TYPE**](.md)| Report type. | [optional] [default to null]

### Return type

[**DELIVERY_METRICS_GET_200_RESPONSE**](delivery_metrics_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **interest_targeting_options_get**
> interest_targeting_options_get (interest_id: STRING_32 ): detachable SINGLE_INTEREST_TARGETING_OPTION


Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interest_id** | **STRING_32**| Unique identifier of an interest. | [default to null]

### Return type

[**SINGLE_INTEREST_TARGETING_OPTION**](SingleInterestTargetingOption.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form_questions_get**
> lead_form_questions_get 


Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**


### Parameters
This endpoint does not need any parameter.

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metrics_ready_state_get**
> metrics_ready_state_get (date: STRING_32 ): detachable BOOK_CLOSED


Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **STRING_32**| Analytics reports request date (UTC). Format: YYYY-MM-DD | [default to null]

### Return type

[**BOOK_CLOSED**](BookClosed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_options_get**
> targeting_options_get (targeting_type: PUBLIC_TARGETING_TYPE ; ad_account_id:  detachable STRING_32 ; client_id:  detachable STRING_32 ; oauth_signature:  detachable STRING_32 ; timestamp:  detachable STRING_32 ): detachable LIST [ANY]


Get targeting options

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targeting_type** | [**PUBLIC_TARGETING_TYPE**](.md)| Public targeting type | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]
 **client_id** | **STRING_32**| Client ID | [optional] [default to null]
 **oauth_signature** | **STRING_32**| Oauth signature | [optional] [default to null]
 **timestamp** | **STRING_32**| Timestamp. | [optional] [default to null]

### Return type

[**LIST [ANY]**](ANY.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

