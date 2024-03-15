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
> ad_account_countries_get : detachable AD_ACCOUNTS_COUNTRY_RESPONSE


Get ad accounts countries

Get Ad Accounts countries


### Parameters
This endpoint does not need any parameter.

### Return type

[**AD_ACCOUNTS_COUNTRY_RESPONSE**](AdAccountsCountryResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delivery_metrics_get**
> delivery_metrics_get (report_type:  detachable STRING_32 ): detachable DELIVERY_METRICS_RESPONSE


Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/content/analytics/'>Organic Analytics</a> and <a href='/docs/ads/ad-analytics-reporting/'>Ads Analytics</a> for more information.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_type** | **STRING_32**| Report type. | [optional] [default to null]

### Return type

[**DELIVERY_METRICS_RESPONSE**](DeliveryMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **interest_targeting_options_get**
> interest_targeting_options_get (interest_id: STRING_32 ): detachable SINGLE_INTEREST_TARGETING_OPTION_RESPONSE


Get interest details

<p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interest_id** | **STRING_32**| Unique identifier of an interest. | [default to null]

### Return type

[**SINGLE_INTEREST_TARGETING_OPTION_RESPONSE**](SingleInterestTargetingOptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form_questions_get**
> lead_form_questions_get 


Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>


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
> metrics_ready_state_get (date: STRING_32 ): detachable BOOK_CLOSED_RESPONSE


Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **STRING_32**| Analytics reports request date (UTC). Format: YYYY-MM-DD | [default to null]

### Return type

[**BOOK_CLOSED_RESPONSE**](BookClosedResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_options_get**
> targeting_options_get (targeting_type: STRING_32 ; client_id:  detachable STRING_32 ; oauth_signature:  detachable STRING_32 ; timestamp:  detachable STRING_32 ): detachable LIST [ANY]


Get targeting options

<p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targeting_type** | **STRING_32**| Public targeting type. | [default to null]
 **client_id** | **STRING_32**| Client ID. | [optional] [default to null]
 **oauth_signature** | **STRING_32**| Oauth signature | [optional] [default to null]
 **timestamp** | **STRING_32**| Timestamp | [optional] [default to null]

### Return type

[**LIST [ANY]**](ANY.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

