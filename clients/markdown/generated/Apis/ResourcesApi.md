# ResourcesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adAccountCountries/get**](ResourcesApi.md#adAccountCountries/get) | **GET** /resources/ad_account_countries | Get ad accounts countries |
| [**deliveryMetrics/get**](ResourcesApi.md#deliveryMetrics/get) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions |
| [**interestTargetingOptions/get**](ResourcesApi.md#interestTargetingOptions/get) | **GET** /resources/targeting/interests/{interest_id} | Get interest details |
| [**leadFormQuestions/get**](ResourcesApi.md#leadFormQuestions/get) | **GET** /resources/lead_form_questions | Get lead form questions |
| [**metricsReadyState/get**](ResourcesApi.md#metricsReadyState/get) | **GET** /resources/metrics_ready_state | Get metrics ready state |
| [**targetingOptions/get**](ResourcesApi.md#targetingOptions/get) | **GET** /resources/targeting/{targeting_type} | Get targeting options |


<a name="adAccountCountries/get"></a>
# **adAccountCountries/get**
> ad_account_countries_get_200_response adAccountCountries/get()

Get ad accounts countries

    Get Ad Accounts countries

### Parameters
This endpoint does not need any parameter.

### Return type

[**ad_account_countries_get_200_response**](../Models/ad_account_countries_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deliveryMetrics/get"></a>
# **deliveryMetrics/get**
> delivery_metrics_get_200_response deliveryMetrics/get(report\_type)

Get available metrics&#39; definitions

    Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **report\_type** | [**ReportType**](../Models/.md)| Report type. | [optional] [default to null] [enum: SYNC, ASYNC] |

### Return type

[**delivery_metrics_get_200_response**](../Models/delivery_metrics_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="interestTargetingOptions/get"></a>
# **interestTargetingOptions/get**
> SingleInterestTargetingOption interestTargetingOptions/get(interest\_id)

Get interest details

    Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **interest\_id** | **String**| Unique identifier of an interest. | [default to null] |

### Return type

[**SingleInterestTargetingOption**](../Models/SingleInterestTargetingOption.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="leadFormQuestions/get"></a>
# **leadFormQuestions/get**
> leadFormQuestions/get()

Get lead form questions

    Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="metricsReadyState/get"></a>
# **metricsReadyState/get**
> BookClosed metricsReadyState/get(date)

Get metrics ready state

    Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **date** | **String**| Analytics reports request date (UTC). Format: YYYY-MM-DD | [default to null] |

### Return type

[**BookClosed**](../Models/BookClosed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="targetingOptions/get"></a>
# **targetingOptions/get**
> List targetingOptions/get(targeting\_type, ad\_account\_id, client\_id, oauth\_signature, timestamp)

Get targeting options

        You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **targeting\_type** | [**PublicTargetingType**](../Models/.md)| Public targeting type | [default to null] [enum: APPTYPE, GENDER, LOCALE, AGE_BUCKET, LOCATION, GEO, INTEREST, KEYWORD, AUDIENCE_INCLUDE, AUDIENCE_EXCLUDE] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |
| **client\_id** | **String**| Client ID | [optional] [default to null] |
| **oauth\_signature** | **String**| Oauth signature | [optional] [default to null] |
| **timestamp** | **String**| Timestamp. | [optional] [default to null] |

### Return type

**List**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

