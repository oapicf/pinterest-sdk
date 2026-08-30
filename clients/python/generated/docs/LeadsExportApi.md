# pinterestsdk.LeadsExportApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leads_export_create**](LeadsExportApi.md#leads_export_create) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**leads_export_get**](LeadsExportApi.md#leads_export_get) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call


# **leads_export_create**
> LeadsExports leads_export_create(ad_account_id, leads_exports_create)

Create a request to export leads collected from a lead ad

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**

Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.

Note: Lead ad data will be available up to 30 days after the lead has been submitted.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.leads_exports import LeadsExports
from pinterestsdk.models.leads_exports_create import LeadsExportsCreate
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.LeadsExportApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    leads_exports_create = pinterestsdk.LeadsExportsCreate() # LeadsExportsCreate | 

    try:
        # Create a request to export leads collected from a lead ad
        api_response = api_instance.leads_export_create(ad_account_id, leads_exports_create)
        print("The response of LeadsExportApi->leads_export_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadsExportApi->leads_export_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **leads_exports_create** | [**LeadsExportsCreate**](LeadsExportsCreate.md)|  | 

### Return type

[**LeadsExports**](LeadsExports.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**201** | Resource create operation completed successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leads_export_get**
> LeadsExportResponseData leads_export_get(ad_account_id, leads_export_id)

Get the lead export from the lead export create call

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**

Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.

Note: Lead ad data will be available up to 30 days after the lead has been submitted.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.leads_export_response_data import LeadsExportResponseData
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.LeadsExportApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    leads_export_id = 'leads_export_id_example' # str | lead_export_id token returned from the create a lead export endpoint

    try:
        # Get the lead export from the lead export create call
        api_response = api_instance.leads_export_get(ad_account_id, leads_export_id)
        print("The response of LeadsExportApi->leads_export_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadsExportApi->leads_export_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **leads_export_id** | **str**| lead_export_id token returned from the create a lead export endpoint | 

### Return type

[**LeadsExportResponseData**](LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

