# ResourcesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ResourcesAPI_adAccountCountriesGet**](ResourcesAPI.md#ResourcesAPI_adAccountCountriesGet) | **GET** /resources/ad_account_countries | Get ad accounts countries
[**ResourcesAPI_deliveryMetricsGet**](ResourcesAPI.md#ResourcesAPI_deliveryMetricsGet) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
[**ResourcesAPI_interestTargetingOptionsGet**](ResourcesAPI.md#ResourcesAPI_interestTargetingOptionsGet) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
[**ResourcesAPI_leadFormQuestionsGet**](ResourcesAPI.md#ResourcesAPI_leadFormQuestionsGet) | **GET** /resources/lead_form_questions | Get lead form questions
[**ResourcesAPI_metricsReadyStateGet**](ResourcesAPI.md#ResourcesAPI_metricsReadyStateGet) | **GET** /resources/metrics_ready_state | Get metrics ready state
[**ResourcesAPI_targetingOptionsGet**](ResourcesAPI.md#ResourcesAPI_targetingOptionsGet) | **GET** /resources/targeting/{targeting_type} | Get targeting options


# **ResourcesAPI_adAccountCountriesGet**
```c
// Get ad accounts countries
//
// Get Ad Accounts countries
//
ad_account_countries_get_200_response_t* ResourcesAPI_adAccountCountriesGet(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[ad_account_countries_get_200_response_t](ad_account_countries_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourcesAPI_deliveryMetricsGet**
```c
// Get available metrics' definitions
//
// Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
//
delivery_metrics_get_200_response_t* ResourcesAPI_deliveryMetricsGet(apiClient_t *apiClient, report_type_e report_type);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**report_type** | **report_type_e** | Report type. | [optional] 

### Return type

[delivery_metrics_get_200_response_t](delivery_metrics_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourcesAPI_interestTargetingOptionsGet**
```c
// Get interest details
//
// Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
//
single_interest_targeting_option_t* ResourcesAPI_interestTargetingOptionsGet(apiClient_t *apiClient, char *interest_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**interest_id** | **char \*** | Unique identifier of an interest. | 

### Return type

[single_interest_targeting_option_t](single_interest_targeting_option.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourcesAPI_leadFormQuestionsGet**
```c
// Get lead form questions
//
// Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
//
void ResourcesAPI_leadFormQuestionsGet(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourcesAPI_metricsReadyStateGet**
```c
// Get metrics ready state
//
// Learn whether conversion or non-conversion metrics are finalized and ready to query.
//
book_closed_t* ResourcesAPI_metricsReadyStateGet(apiClient_t *apiClient, char *date);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**date** | **char \*** | Analytics reports request date (UTC). Format: YYYY-MM-DD | 

### Return type

[book_closed_t](book_closed.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourcesAPI_targetingOptionsGet**
```c
// Get targeting options
//
//     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```
//
list_t* ResourcesAPI_targetingOptionsGet(apiClient_t *apiClient, public_targeting_type_e targeting_type, char *ad_account_id, char *client_id, char *oauth_signature, char *timestamp);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**targeting_type** | **public_targeting_type_e** | Public targeting type | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**client_id** | **char \*** | Client ID | [optional] 
**oauth_signature** | **char \*** | Oauth signature | [optional] 
**timestamp** | **char \*** | Timestamp. | [optional] 

### Return type

[list_t](object.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

