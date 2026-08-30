# openapi_client.ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_eqs_list**](ConversionEqsApi.md#conversion_eqs_list) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


# **conversion_eqs_list**
> List[EventQualityScore] conversion_eqs_list(lookback_period, ad_account_id, source_platform=source_platform, ingestion_source=ingestion_source)

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.

[Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.event_quality_score import EventQualityScore
from openapi_client.models.ingestion_source_options import IngestionSourceOptions
from openapi_client.models.lookback_period_options import LookbackPeriodOptions
from openapi_client.models.source_platform_options import SourcePlatformOptions
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConversionEqsApi(api_client)
    lookback_period = openapi_client.LookbackPeriodOptions() # LookbackPeriodOptions | Lookback window (number of days).
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    source_platform = openapi_client.SourcePlatformOptions() # SourcePlatformOptions | Source platform of event. (optional)
    ingestion_source = openapi_client.IngestionSourceOptions() # IngestionSourceOptions | Ingestion source of event. (optional)

    try:
        # Get event quality score (EQS)
        api_response = api_instance.conversion_eqs_list(lookback_period, ad_account_id, source_platform=source_platform, ingestion_source=ingestion_source)
        print("The response of ConversionEqsApi->conversion_eqs_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConversionEqsApi->conversion_eqs_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookback_period** | [**LookbackPeriodOptions**](.md)| Lookback window (number of days). | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **source_platform** | [**SourcePlatformOptions**](.md)| Source platform of event. | [optional] 
 **ingestion_source** | [**IngestionSourceOptions**](.md)| Ingestion source of event. | [optional] 

### Return type

[**List[EventQualityScore]**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

