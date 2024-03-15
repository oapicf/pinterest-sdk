# ResourcesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountCountriesGet**](ResourcesApi.md#AdAccountCountriesGet) | **GET** /resources/ad_account_countries | Get ad accounts countries
[**DeliveryMetricsGet**](ResourcesApi.md#DeliveryMetricsGet) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
[**InterestTargetingOptionsGet**](ResourcesApi.md#InterestTargetingOptionsGet) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
[**LeadFormQuestionsGet**](ResourcesApi.md#LeadFormQuestionsGet) | **GET** /resources/lead_form_questions | Get lead form questions
[**MetricsReadyStateGet**](ResourcesApi.md#MetricsReadyStateGet) | **GET** /resources/metrics_ready_state | Get metrics ready state
[**TargetingOptionsGet**](ResourcesApi.md#TargetingOptionsGet) | **GET** /resources/targeting/{targeting_type} | Get targeting options


# **AdAccountCountriesGet**
> AdAccountsCountryResponse AdAccountCountriesGet()

Get ad accounts countries

Get Ad Accounts countries

### Example
```R
library(openapi)

# Get ad accounts countries
#

api_instance <- ResourcesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdAccountCountriesGet(data_file = "result.txt")
result <- api_instance$AdAccountCountriesGet()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdAccountsCountryResponse**](AdAccountsCountryResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **DeliveryMetricsGet**
> DeliveryMetricsResponse DeliveryMetricsGet(report_type = var.report_type)

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/content/analytics/'>Organic Analytics</a> and <a href='/docs/ads/ad-analytics-reporting/'>Ads Analytics</a> for more information.

### Example
```R
library(openapi)

# Get available metrics' definitions
#
# prepare function argument(s)
var_report_type <- "report_type_example" # character | Report type. (Optional)

api_instance <- ResourcesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeliveryMetricsGet(report_type = var_report_typedata_file = "result.txt")
result <- api_instance$DeliveryMetricsGet(report_type = var_report_type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_type** | Enum [SYNC, ASYNC] | Report type. | [optional] 

### Return type

[**DeliveryMetricsResponse**](DeliveryMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **InterestTargetingOptionsGet**
> SingleInterestTargetingOptionResponse InterestTargetingOptionsGet(interest_id)

Get interest details

<p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>

### Example
```R
library(openapi)

# Get interest details
#
# prepare function argument(s)
var_interest_id <- "interest_id_example" # character | Unique identifier of an interest.

api_instance <- ResourcesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$InterestTargetingOptionsGet(var_interest_iddata_file = "result.txt")
result <- api_instance$InterestTargetingOptionsGet(var_interest_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interest_id** | **character**| Unique identifier of an interest. | 

### Return type

[**SingleInterestTargetingOptionResponse**](SingleInterestTargetingOptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **LeadFormQuestionsGet**
> LeadFormQuestionsGet()

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```R
library(openapi)

# Get lead form questions
#

api_instance <- ResourcesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$LeadFormQuestionsGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **MetricsReadyStateGet**
> BookClosedResponse MetricsReadyStateGet(date)

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example
```R
library(openapi)

# Get metrics ready state
#
# prepare function argument(s)
var_date <- "2022-07-13" # character | Analytics reports request date (UTC). Format: YYYY-MM-DD

api_instance <- ResourcesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$MetricsReadyStateGet(var_datedata_file = "result.txt")
result <- api_instance$MetricsReadyStateGet(var_date)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **character**| Analytics reports request date (UTC). Format: YYYY-MM-DD | 

### Return type

[**BookClosedResponse**](BookClosedResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **TargetingOptionsGet**
> array[object] TargetingOptionsGet(targeting_type, client_id = var.client_id, oauth_signature = var.oauth_signature, timestamp = var.timestamp)

Get targeting options

<p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>

### Example
```R
library(openapi)

# Get targeting options
#
# prepare function argument(s)
var_targeting_type <- "APPTYPE" # character | Public targeting type.
var_client_id <- "1094834" # character | Client ID. (Optional)
var_oauth_signature <- "8209f" # character | Oauth signature (Optional)
var_timestamp <- "1618338184277" # character | Timestamp (Optional)

api_instance <- ResourcesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TargetingOptionsGet(var_targeting_type, client_id = var_client_id, oauth_signature = var_oauth_signature, timestamp = var_timestampdata_file = "result.txt")
result <- api_instance$TargetingOptionsGet(var_targeting_type, client_id = var_client_id, oauth_signature = var_oauth_signature, timestamp = var_timestamp)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targeting_type** | Enum [APPTYPE, GENDER, LOCALE, AGE_BUCKET, LOCATION, GEO, INTEREST, KEYWORD, AUDIENCE_INCLUDE, AUDIENCE_EXCLUDE] | Public targeting type. | 
 **client_id** | **character**| Client ID. | [optional] 
 **oauth_signature** | **character**| Oauth signature | [optional] 
 **timestamp** | **character**| Timestamp | [optional] 

### Return type

**array[object]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

