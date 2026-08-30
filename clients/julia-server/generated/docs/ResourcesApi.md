# ResourcesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_countries_get**](ResourcesApi.md#ad_account_countries_get) | **GET** /resources/ad_account_countries | Get ad accounts countries
[**delivery_metrics_get**](ResourcesApi.md#delivery_metrics_get) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
[**interest_targeting_options_get**](ResourcesApi.md#interest_targeting_options_get) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
[**lead_form_questions_get**](ResourcesApi.md#lead_form_questions_get) | **GET** /resources/lead_form_questions | Get lead form questions
[**metrics_ready_state_get**](ResourcesApi.md#metrics_ready_state_get) | **GET** /resources/metrics_ready_state | Get metrics ready state
[**targeting_options_get**](ResourcesApi.md#targeting_options_get) | **GET** /resources/targeting/{targeting_type} | Get targeting options


# **ad_account_countries_get**
> `ad_account_countries_get`(req::`HTTP.Request`;) -> `AdAccountCountriesGet200Response`

Get ad accounts countries

Get Ad Accounts countries

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**`AdAccountCountriesGet200Response`**](AdAccountCountriesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delivery_metrics_get**
> `delivery_metrics_get`(req::`HTTP.Request`; `report_type`=nothing,) -> `DeliveryMetricsGet200Response`

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`report_type`** | [**`ReportType`**](.md)| Report type. | [default to nothing]

### Return type

[**`DeliveryMetricsGet200Response`**](DeliveryMetricsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **interest_targeting_options_get**
> `interest_targeting_options_get`(req::`HTTP.Request`, `interest_id`::`String`;) -> `SingleInterestTargetingOption`

Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`interest_id`** | **`String`**| Unique identifier of an interest. |

### Return type

[**`SingleInterestTargetingOption`**](SingleInterestTargetingOption.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form_questions_get**
> `lead_form_questions_get`(req::`HTTP.Request`;) -> `Nothing`

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Required Parameters
This endpoint does not need any parameter.

### Return type

`Nothing`

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metrics_ready_state_get**
> `metrics_ready_state_get`(req::`HTTP.Request`, `date`::`String`;) -> `BookClosed`

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`date`** | **`String`**| Analytics reports request date (UTC). Format: YYYY-MM-DD |

### Return type

[**`BookClosed`**](BookClosed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_options_get**
> `targeting_options_get`(req::`HTTP.Request`, `targeting_type`::`PublicTargetingType`; `ad_account_id`=nothing, `client_id`=nothing, `oauth_signature`=nothing, `timestamp`=nothing,) -> `Vector{Any}`

Get targeting options

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`targeting_type`** | [**`PublicTargetingType`**](.md)| Public targeting type |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]
 **`client_id`** | **`String`**| Client ID | [default to nothing]
 **`oauth_signature`** | **`String`**| Oauth signature | [default to nothing]
 **`timestamp`** | **`String`**| Timestamp. | [default to nothing]

### Return type

**`Vector{Any}`**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

