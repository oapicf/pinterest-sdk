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
ad_accounts_country_response_t* ResourcesAPI_adAccountCountriesGet(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[ad_accounts_country_response_t](ad_accounts_country_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourcesAPI_deliveryMetricsGet**
```c
// Get available metrics' definitions
//
// Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/api-features/analytics-overview/'>Organic Analytics</a> and <a href='/docs/api-features/ads-reporting/'>Ads Analytics</a> for more information.
//
delivery_metrics_response_t* ResourcesAPI_deliveryMetricsGet(apiClient_t *apiClient, pinterest_rest_api_deliveryMetricsGet_report_type_e report_type);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**report_type** | **pinterest_rest_api_deliveryMetricsGet_report_type_e** | Report type. | [optional] 

### Return type

[delivery_metrics_response_t](delivery_metrics_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourcesAPI_interestTargetingOptionsGet**
```c
// Get interest details
//
// <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
//
single_interest_targeting_option_response_t* ResourcesAPI_interestTargetingOptionsGet(apiClient_t *apiClient, char *interest_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**interest_id** | **char \*** | Unique identifier of an interest. | 

### Return type

[single_interest_targeting_option_response_t](single_interest_targeting_option_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourcesAPI_leadFormQuestionsGet**
```c
// Get lead form questions
//
// Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
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
book_closed_response_t* ResourcesAPI_metricsReadyStateGet(apiClient_t *apiClient, char *date);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**date** | **char \*** | Analytics reports request date (UTC). Format: YYYY-MM-DD | 

### Return type

[book_closed_response_t](book_closed_response.md) *


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
// <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
//
list_t* ResourcesAPI_targetingOptionsGet(apiClient_t *apiClient, pinterest_rest_api_targetingOptionsGet_targeting_type_e targeting_type, char *client_id, char *oauth_signature, char *timestamp, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**targeting_type** | **pinterest_rest_api_targetingOptionsGet_targeting_type_e** | Public targeting type. | 
**client_id** | **char \*** | Client ID. | [optional] 
**oauth_signature** | **char \*** | Oauth signature | [optional] 
**timestamp** | **char \*** | Timestamp | [optional] 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[list_t](object.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

