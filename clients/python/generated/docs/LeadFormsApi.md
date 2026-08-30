# pinterestsdk.LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lead_form_get**](LeadFormsApi.md#lead_form_get) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**lead_form_test_create**](LeadFormsApi.md#lead_form_test_create) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**lead_forms_create**](LeadFormsApi.md#lead_forms_create) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**lead_forms_list**](LeadFormsApi.md#lead_forms_list) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**lead_forms_update**](LeadFormsApi.md#lead_forms_update) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms


# **lead_form_get**
> LeadForm lead_form_get(lead_form_id, ad_account_id)

Get lead form by id

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**

Gets a lead form given it's ID. It must also be associated with the provided ad account ID.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.lead_form import LeadForm
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
    api_instance = pinterestsdk.LeadFormsApi(api_client)
    lead_form_id = 'lead_form_id_example' # str | The ID of this lead form
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.

    try:
        # Get lead form by id
        api_response = api_instance.lead_form_get(lead_form_id, ad_account_id)
        print("The response of LeadFormsApi->lead_form_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadFormsApi->lead_form_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lead_form_id** | **str**| The ID of this lead form | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | 

### Return type

[**LeadForm**](LeadForm.md)

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

# **lead_form_test_create**
> LeadFormTest lead_form_test_create(ad_account_id, lead_form_id, lead_form_test_create)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body.
- List of answers should follow the questions creation order.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.lead_form_test import LeadFormTest
from pinterestsdk.models.lead_form_test_create import LeadFormTestCreate
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
    api_instance = pinterestsdk.LeadFormsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | 
    lead_form_id = 'lead_form_id_example' # str | Unique identifier of a lead form.
    lead_form_test_create = pinterestsdk.LeadFormTestCreate() # LeadFormTestCreate | 

    try:
        # Create lead form test data
        api_response = api_instance.lead_form_test_create(ad_account_id, lead_form_id, lead_form_test_create)
        print("The response of LeadFormsApi->lead_form_test_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadFormsApi->lead_form_test_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **lead_form_id** | **str**| Unique identifier of a lead form. | 
 **lead_form_test_create** | [**LeadFormTestCreate**](LeadFormTestCreate.md)|  | 

### Return type

[**LeadFormTest**](LeadFormTest.md)

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
**404** | The requested resource could not be found on this server. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_create**
> LeadFormsCreate200Response lead_forms_create(ad_account_id, lead_form_create)

Create lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**

Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.lead_form_create import LeadFormCreate
from pinterestsdk.models.lead_forms_create200_response import LeadFormsCreate200Response
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
    api_instance = pinterestsdk.LeadFormsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    lead_form_create = [pinterestsdk.LeadFormCreate()] # List[LeadFormCreate] | 

    try:
        # Create lead forms
        api_response = api_instance.lead_forms_create(ad_account_id, lead_form_create)
        print("The response of LeadFormsApi->lead_forms_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadFormsApi->lead_forms_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **lead_form_create** | [**List[LeadFormCreate]**](LeadFormCreate.md)|  | 

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

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

# **lead_forms_list**
> LeadFormsList200Response lead_forms_list(ad_account_id, bookmark=bookmark, page_size=page_size, order=order)

List lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**

List lead forms associated with an ad account ID.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.lead_forms_list200_response import LeadFormsList200Response
from pinterestsdk.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
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
    api_instance = pinterestsdk.LeadFormsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
    order = pinterestsdk.PinterestLibPaginationOrder() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

    try:
        # List lead forms
        api_response = api_instance.lead_forms_list(ad_account_id, bookmark=bookmark, page_size=page_size, order=order)
        print("The response of LeadFormsApi->lead_forms_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadFormsApi->lead_forms_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

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

# **lead_forms_update**
> LeadFormsCreate200Response lead_forms_update(ad_account_id, lead_form_batch_update)

Update lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**

Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.lead_form_batch_update import LeadFormBatchUpdate
from pinterestsdk.models.lead_forms_create200_response import LeadFormsCreate200Response
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
    api_instance = pinterestsdk.LeadFormsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    lead_form_batch_update = [pinterestsdk.LeadFormBatchUpdate()] # List[LeadFormBatchUpdate] | 

    try:
        # Update lead forms
        api_response = api_instance.lead_forms_update(ad_account_id, lead_form_batch_update)
        print("The response of LeadFormsApi->lead_forms_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadFormsApi->lead_forms_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **lead_form_batch_update** | [**List[LeadFormBatchUpdate]**](LeadFormBatchUpdate.md)|  | 

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

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

