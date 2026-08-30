# pinterestsdk.SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedules_create**](SchedulesApi.md#schedules_create) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedules_list**](SchedulesApi.md#schedules_list) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedules_update**](SchedulesApi.md#schedules_update) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules


# **schedules_create**
> List[SchedulesCreate200ResponseInner] schedules_create(ad_account_id, schedule_create)

Create schedules

Batch create schedules

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.schedule_create import ScheduleCreate
from pinterestsdk.models.schedules_create200_response_inner import SchedulesCreate200ResponseInner
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
    api_instance = pinterestsdk.SchedulesApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | 
    schedule_create = [pinterestsdk.ScheduleCreate()] # List[ScheduleCreate] | 

    try:
        # Create schedules
        api_response = api_instance.schedules_create(ad_account_id, schedule_create)
        print("The response of SchedulesApi->schedules_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulesApi->schedules_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **schedule_create** | [**List[ScheduleCreate]**](ScheduleCreate.md)|  | 

### Return type

[**List[SchedulesCreate200ResponseInner]**](SchedulesCreate200ResponseInner.md)

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

# **schedules_list**
> SchedulesList200Response schedules_list(ad_account_id, entity_ids, bookmark=bookmark, page_size=page_size, order=order, schedule_statuses=schedule_statuses, schedule_type=schedule_type)

Get Schedules

Get schedules for a specific advertiser

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from pinterestsdk.models.schedule_status import ScheduleStatus
from pinterestsdk.models.schedule_type import ScheduleType
from pinterestsdk.models.schedules_list200_response import SchedulesList200Response
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
    api_instance = pinterestsdk.SchedulesApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | 
    entity_ids = ['entity_ids_example'] # List[str] | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
    order = pinterestsdk.PinterestLibPaginationOrder() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    schedule_statuses = [pinterestsdk.ScheduleStatus()] # List[ScheduleStatus] | Filter schedules by status (one or more) (optional)
    schedule_type = pinterestsdk.ScheduleType() # ScheduleType | Filter schedules by a type (optional)

    try:
        # Get Schedules
        api_response = api_instance.schedules_list(ad_account_id, entity_ids, bookmark=bookmark, page_size=page_size, order=order, schedule_statuses=schedule_statuses, schedule_type=schedule_type)
        print("The response of SchedulesApi->schedules_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulesApi->schedules_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **entity_ids** | [**List[str]**](str.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **schedule_statuses** | [**List[ScheduleStatus]**](ScheduleStatus.md)| Filter schedules by status (one or more) | [optional] 
 **schedule_type** | [**ScheduleType**](.md)| Filter schedules by a type | [optional] 

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md)

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

# **schedules_update**
> List[SchedulesCreate200ResponseInner] schedules_update(ad_account_id, schedule_batch_update)

Update schedules

Update one or more schedules

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.schedule_batch_update import ScheduleBatchUpdate
from pinterestsdk.models.schedules_create200_response_inner import SchedulesCreate200ResponseInner
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
    api_instance = pinterestsdk.SchedulesApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | 
    schedule_batch_update = [pinterestsdk.ScheduleBatchUpdate()] # List[ScheduleBatchUpdate] | 

    try:
        # Update schedules
        api_response = api_instance.schedules_update(ad_account_id, schedule_batch_update)
        print("The response of SchedulesApi->schedules_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SchedulesApi->schedules_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **schedule_batch_update** | [**List[ScheduleBatchUpdate]**](ScheduleBatchUpdate.md)|  | 

### Return type

[**List[SchedulesCreate200ResponseInner]**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
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

