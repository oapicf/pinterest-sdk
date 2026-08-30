# \ResourcesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_countries_slash_get**](ResourcesApi.md#ad_account_countries_slash_get) | **GET** /resources/ad_account_countries | Get ad accounts countries
[**delivery_metrics_slash_get**](ResourcesApi.md#delivery_metrics_slash_get) | **GET** /resources/delivery_metrics | Get available metrics' definitions
[**interest_targeting_options_slash_get**](ResourcesApi.md#interest_targeting_options_slash_get) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
[**lead_form_questions_slash_get**](ResourcesApi.md#lead_form_questions_slash_get) | **GET** /resources/lead_form_questions | Get lead form questions
[**metrics_ready_state_slash_get**](ResourcesApi.md#metrics_ready_state_slash_get) | **GET** /resources/metrics_ready_state | Get metrics ready state
[**targeting_options_slash_get**](ResourcesApi.md#targeting_options_slash_get) | **GET** /resources/targeting/{targeting_type} | Get targeting options



## ad_account_countries_slash_get

> models::AdAccountCountriesGet200Response ad_account_countries_slash_get()
Get ad accounts countries

Get Ad Accounts countries

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::AdAccountCountriesGet200Response**](ad_account_countries_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delivery_metrics_slash_get

> models::DeliveryMetricsGet200Response delivery_metrics_slash_get(report_type)
Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**report_type** | Option<[**ReportType**](ReportType.md)> | Report type. |  |

### Return type

[**models::DeliveryMetricsGet200Response**](delivery_metrics_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## interest_targeting_options_slash_get

> models::SingleInterestTargetingOption interest_targeting_options_slash_get(interest_id)
Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**interest_id** | **String** | Unique identifier of an interest. | [required] |

### Return type

[**models::SingleInterestTargetingOption**](SingleInterestTargetingOption.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## lead_form_questions_slash_get

> lead_form_questions_slash_get()
Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Parameters

This endpoint does not need any parameter.

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metrics_ready_state_slash_get

> models::BookClosed metrics_ready_state_slash_get(date)
Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**date** | **String** | Analytics reports request date (UTC). Format: YYYY-MM-DD | [required] |

### Return type

[**models::BookClosed**](BookClosed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## targeting_options_slash_get

> Vec<serde_json::Value> targeting_options_slash_get(targeting_type, ad_account_id, client_id, oauth_signature, timestamp)
Get targeting options

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**targeting_type** | [**PublicTargetingType**](PublicTargetingType.md) | Public targeting type | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |
**client_id** | Option<**String**> | Client ID |  |
**oauth_signature** | Option<**String**> | Oauth signature |  |
**timestamp** | Option<**String**> | Timestamp. |  |

### Return type

[**Vec<serde_json::Value>**](serde_json::Value.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

